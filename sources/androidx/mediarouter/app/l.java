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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class l implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ u b;

    public l(u uVar, boolean z10) {
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
        uVar.F.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        if (uVar.r0) {
            uVar.s0 = true;
            return;
        }
        c2.z zVar = uVar.r;
        int i11 = uVar.M.getLayoutParams().height;
        u.o(-1, uVar.M);
        uVar.u(uVar.h());
        View decorView = uVar.getWindow().getDecorView();
        decorView.measure(View.MeasureSpec.makeMeasureSpec(uVar.getWindow().getAttributes().width, TLObject.FLAG_30), 0);
        u.o(i11, uVar.M);
        if (!(uVar.G.getDrawable() instanceof BitmapDrawable) || (bitmap = ((BitmapDrawable) uVar.G.getDrawable()).getBitmap()) == null) {
            i10 = 0;
        } else {
            i10 = uVar.k(bitmap.getWidth(), bitmap.getHeight());
            uVar.G.setScaleType(bitmap.getWidth() >= bitmap.getHeight() ? ImageView.ScaleType.FIT_XY : ImageView.ScaleType.FIT_CENTER);
        }
        int l10 = uVar.l(uVar.h());
        int size = uVar.S.size();
        int size2 = uVar.n() ? DesugarCollections.unmodifiableList(zVar.v).size() * uVar.a0 : 0;
        if (size > 0) {
            size2 += uVar.c0;
        }
        int min = Math.min(size2, uVar.b0);
        if (!uVar.q0) {
            min = 0;
        }
        int max = Math.max(i10, min) + l10;
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        int height = rect.height() - (uVar.E.getMeasuredHeight() - uVar.F.getMeasuredHeight());
        if (i10 <= 0 || max > height) {
            if (uVar.M.getMeasuredHeight() + uVar.Q.getLayoutParams().height >= uVar.F.getMeasuredHeight()) {
                uVar.G.setVisibility(8);
            }
            max = min + l10;
            i10 = 0;
        } else {
            uVar.G.setVisibility(0);
            u.o(i10, uVar.G);
        }
        if (!uVar.h() || max > height) {
            uVar.N.setVisibility(8);
        } else {
            uVar.N.setVisibility(0);
        }
        uVar.u(uVar.N.getVisibility() == 0);
        int l11 = uVar.l(uVar.N.getVisibility() == 0);
        int max2 = Math.max(i10, min) + l11;
        if (max2 > height) {
            min -= max2 - height;
        } else {
            height = max2;
        }
        uVar.M.clearAnimation();
        uVar.Q.clearAnimation();
        uVar.F.clearAnimation();
        boolean z10 = this.a;
        if (z10) {
            uVar.f(l11, uVar.M);
            uVar.f(min, uVar.Q);
            uVar.f(height, uVar.F);
        } else {
            u.o(l11, uVar.M);
            u.o(min, uVar.Q);
            u.o(height, uVar.F);
        }
        u.o(rect.height(), uVar.D);
        List unmodifiableList = DesugarCollections.unmodifiableList(zVar.v);
        if (unmodifiableList.isEmpty()) {
            uVar.S.clear();
            uVar.R.notifyDataSetChanged();
            return;
        }
        if (new HashSet(uVar.S).equals(new HashSet(unmodifiableList))) {
            uVar.R.notifyDataSetChanged();
            return;
        }
        if (z10) {
            OverlayListView overlayListView = uVar.Q;
            t tVar = uVar.R;
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
            OverlayListView overlayListView2 = uVar.Q;
            t tVar2 = uVar.R;
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
        ArrayList arrayList = uVar.S;
        HashSet hashSet = new HashSet(unmodifiableList);
        hashSet.removeAll(arrayList);
        uVar.T = hashSet;
        HashSet hashSet2 = new HashSet(uVar.S);
        hashSet2.removeAll(unmodifiableList);
        uVar.U = hashSet2;
        uVar.S.addAll(0, uVar.T);
        uVar.S.removeAll(uVar.U);
        uVar.R.notifyDataSetChanged();
        if (z10 && uVar.q0) {
            if (uVar.U.size() + uVar.T.size() > 0) {
                uVar.Q.setEnabled(false);
                uVar.Q.requestLayout();
                uVar.r0 = true;
                uVar.Q.getViewTreeObserver().addOnGlobalLayoutListener(new n(uVar, hashMap, hashMap2));
                return;
            }
        }
        uVar.T = null;
        uVar.U = null;
    }
}
