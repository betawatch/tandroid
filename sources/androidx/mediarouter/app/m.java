package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class m implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ u b;

    public m(u uVar, boolean z10) {
        this.b = uVar;
        this.a = z10;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i10;
        HashMap hashMap;
        HashMap hashMap2;
        Bitmap bitmap;
        u uVar = this.b;
        uVar.J.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        if (uVar.v0) {
            uVar.w0 = true;
            return;
        }
        p4.v vVar = uVar.r;
        int i11 = uVar.Q.getLayoutParams().height;
        u.o(-1, uVar.Q);
        uVar.u(uVar.h());
        View decorView = uVar.getWindow().getDecorView();
        decorView.measure(View.MeasureSpec.makeMeasureSpec(uVar.getWindow().getAttributes().width, TLObject.FLAG_30), 0);
        u.o(i11, uVar.Q);
        if (!(uVar.K.getDrawable() instanceof BitmapDrawable) || (bitmap = ((BitmapDrawable) uVar.K.getDrawable()).getBitmap()) == null) {
            i10 = 0;
        } else {
            i10 = uVar.k(bitmap.getWidth(), bitmap.getHeight());
            uVar.K.setScaleType(bitmap.getWidth() >= bitmap.getHeight() ? ImageView.ScaleType.FIT_XY : ImageView.ScaleType.FIT_CENTER);
        }
        int l4 = uVar.l(uVar.h());
        int size = uVar.W.size();
        int size2 = uVar.n() ? DesugarCollections.unmodifiableList(vVar.v).size() * uVar.e0 : 0;
        if (size > 0) {
            size2 += uVar.g0;
        }
        int min = Math.min(size2, uVar.f0);
        if (!uVar.u0) {
            min = 0;
        }
        int max = Math.max(i10, min) + l4;
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        int height = rect.height() - (uVar.I.getMeasuredHeight() - uVar.J.getMeasuredHeight());
        if (i10 <= 0 || max > height) {
            if (uVar.Q.getMeasuredHeight() + uVar.U.getLayoutParams().height >= uVar.J.getMeasuredHeight()) {
                uVar.K.setVisibility(8);
            }
            max = min + l4;
            i10 = 0;
        } else {
            uVar.K.setVisibility(0);
            u.o(i10, uVar.K);
        }
        if (!uVar.h() || max > height) {
            uVar.R.setVisibility(8);
        } else {
            uVar.R.setVisibility(0);
        }
        uVar.u(uVar.R.getVisibility() == 0);
        int l10 = uVar.l(uVar.R.getVisibility() == 0);
        int max2 = Math.max(i10, min) + l10;
        if (max2 > height) {
            min -= max2 - height;
        } else {
            height = max2;
        }
        uVar.Q.clearAnimation();
        uVar.U.clearAnimation();
        uVar.J.clearAnimation();
        boolean z10 = this.a;
        if (z10) {
            uVar.f(l10, uVar.Q);
            uVar.f(min, uVar.U);
            uVar.f(height, uVar.J);
        } else {
            u.o(l10, uVar.Q);
            u.o(min, uVar.U);
            u.o(height, uVar.J);
        }
        u.o(rect.height(), uVar.H);
        List unmodifiableList = DesugarCollections.unmodifiableList(vVar.v);
        if (unmodifiableList.isEmpty()) {
            uVar.W.clear();
            uVar.V.notifyDataSetChanged();
            return;
        }
        if (new HashSet(uVar.W).equals(new HashSet(unmodifiableList))) {
            uVar.V.notifyDataSetChanged();
            return;
        }
        if (z10) {
            OverlayListView overlayListView = uVar.U;
            t tVar = uVar.V;
            hashMap = new HashMap();
            int firstVisiblePosition = overlayListView.getFirstVisiblePosition();
            for (int i12 = 0; i12 < overlayListView.getChildCount(); i12++) {
                Object item = tVar.getItem(firstVisiblePosition + i12);
                View childAt = overlayListView.getChildAt(i12);
                hashMap.put(item, new Rect(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()));
            }
        } else {
            hashMap = null;
        }
        if (z10) {
            Context context = uVar.s;
            OverlayListView overlayListView2 = uVar.U;
            t tVar2 = uVar.V;
            hashMap2 = new HashMap();
            int firstVisiblePosition2 = overlayListView2.getFirstVisiblePosition();
            for (int i13 = 0; i13 < overlayListView2.getChildCount(); i13++) {
                Object item2 = tVar2.getItem(firstVisiblePosition2 + i13);
                View childAt2 = overlayListView2.getChildAt(i13);
                Bitmap createBitmap = Bitmap.createBitmap(childAt2.getWidth(), childAt2.getHeight(), Bitmap.Config.ARGB_8888);
                childAt2.draw(new Canvas(createBitmap));
                hashMap2.put(item2, new BitmapDrawable(context.getResources(), createBitmap));
            }
        } else {
            hashMap2 = null;
        }
        ArrayList arrayList = uVar.W;
        HashSet hashSet = new HashSet(unmodifiableList);
        hashSet.removeAll(arrayList);
        uVar.X = hashSet;
        HashSet hashSet2 = new HashSet(uVar.W);
        hashSet2.removeAll(unmodifiableList);
        uVar.Y = hashSet2;
        uVar.W.addAll(0, uVar.X);
        uVar.W.removeAll(uVar.Y);
        uVar.V.notifyDataSetChanged();
        if (z10 && uVar.u0) {
            if (uVar.Y.size() + uVar.X.size() > 0) {
                uVar.U.setEnabled(false);
                uVar.U.requestLayout();
                uVar.v0 = true;
                uVar.U.getViewTreeObserver().addOnGlobalLayoutListener(new o(uVar, hashMap, hashMap2));
                return;
            }
        }
        uVar.X = null;
        uVar.Y = null;
    }
}
