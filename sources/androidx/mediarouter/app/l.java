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

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public final class l implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ t b;

    public l(t tVar, boolean z10) {
        this.b = tVar;
        this.a = z10;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i10;
        HashMap hashMap;
        HashMap hashMap2;
        Bitmap bitmap;
        t tVar = this.b;
        tVar.J.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        if (tVar.v0) {
            tVar.w0 = true;
            return;
        }
        p4.v vVar = tVar.r;
        int i11 = tVar.Q.getLayoutParams().height;
        t.o(-1, tVar.Q);
        tVar.u(tVar.h());
        View decorView = tVar.getWindow().getDecorView();
        decorView.measure(View.MeasureSpec.makeMeasureSpec(tVar.getWindow().getAttributes().width, TLObject.FLAG_30), 0);
        t.o(i11, tVar.Q);
        if (!(tVar.K.getDrawable() instanceof BitmapDrawable) || (bitmap = ((BitmapDrawable) tVar.K.getDrawable()).getBitmap()) == null) {
            i10 = 0;
        } else {
            i10 = tVar.k(bitmap.getWidth(), bitmap.getHeight());
            tVar.K.setScaleType(bitmap.getWidth() >= bitmap.getHeight() ? ImageView.ScaleType.FIT_XY : ImageView.ScaleType.FIT_CENTER);
        }
        int l4 = tVar.l(tVar.h());
        int size = tVar.W.size();
        int size2 = tVar.n() ? DesugarCollections.unmodifiableList(vVar.v).size() * tVar.e0 : 0;
        if (size > 0) {
            size2 += tVar.g0;
        }
        int min = Math.min(size2, tVar.f0);
        if (!tVar.u0) {
            min = 0;
        }
        int max = Math.max(i10, min) + l4;
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        int height = rect.height() - (tVar.I.getMeasuredHeight() - tVar.J.getMeasuredHeight());
        if (i10 <= 0 || max > height) {
            if (tVar.Q.getMeasuredHeight() + tVar.U.getLayoutParams().height >= tVar.J.getMeasuredHeight()) {
                tVar.K.setVisibility(8);
            }
            max = min + l4;
            i10 = 0;
        } else {
            tVar.K.setVisibility(0);
            t.o(i10, tVar.K);
        }
        if (!tVar.h() || max > height) {
            tVar.R.setVisibility(8);
        } else {
            tVar.R.setVisibility(0);
        }
        tVar.u(tVar.R.getVisibility() == 0);
        int l10 = tVar.l(tVar.R.getVisibility() == 0);
        int max2 = Math.max(i10, min) + l10;
        if (max2 > height) {
            min -= max2 - height;
        } else {
            height = max2;
        }
        tVar.Q.clearAnimation();
        tVar.U.clearAnimation();
        tVar.J.clearAnimation();
        boolean z10 = this.a;
        if (z10) {
            tVar.f(l10, tVar.Q);
            tVar.f(min, tVar.U);
            tVar.f(height, tVar.J);
        } else {
            t.o(l10, tVar.Q);
            t.o(min, tVar.U);
            t.o(height, tVar.J);
        }
        t.o(rect.height(), tVar.H);
        List unmodifiableList = DesugarCollections.unmodifiableList(vVar.v);
        if (unmodifiableList.isEmpty()) {
            tVar.W.clear();
            tVar.V.notifyDataSetChanged();
            return;
        }
        if (new HashSet(tVar.W).equals(new HashSet(unmodifiableList))) {
            tVar.V.notifyDataSetChanged();
            return;
        }
        if (z10) {
            OverlayListView overlayListView = tVar.U;
            s sVar = tVar.V;
            hashMap = new HashMap();
            int firstVisiblePosition = overlayListView.getFirstVisiblePosition();
            for (int i12 = 0; i12 < overlayListView.getChildCount(); i12++) {
                Object item = sVar.getItem(firstVisiblePosition + i12);
                View childAt = overlayListView.getChildAt(i12);
                hashMap.put(item, new Rect(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()));
            }
        } else {
            hashMap = null;
        }
        if (z10) {
            Context context = tVar.s;
            OverlayListView overlayListView2 = tVar.U;
            s sVar2 = tVar.V;
            hashMap2 = new HashMap();
            int firstVisiblePosition2 = overlayListView2.getFirstVisiblePosition();
            for (int i13 = 0; i13 < overlayListView2.getChildCount(); i13++) {
                Object item2 = sVar2.getItem(firstVisiblePosition2 + i13);
                View childAt2 = overlayListView2.getChildAt(i13);
                Bitmap createBitmap = Bitmap.createBitmap(childAt2.getWidth(), childAt2.getHeight(), Bitmap.Config.ARGB_8888);
                childAt2.draw(new Canvas(createBitmap));
                hashMap2.put(item2, new BitmapDrawable(context.getResources(), createBitmap));
            }
        } else {
            hashMap2 = null;
        }
        ArrayList arrayList = tVar.W;
        HashSet hashSet = new HashSet(unmodifiableList);
        hashSet.removeAll(arrayList);
        tVar.X = hashSet;
        HashSet hashSet2 = new HashSet(tVar.W);
        hashSet2.removeAll(unmodifiableList);
        tVar.Y = hashSet2;
        tVar.W.addAll(0, tVar.X);
        tVar.W.removeAll(tVar.Y);
        tVar.V.notifyDataSetChanged();
        if (z10 && tVar.u0) {
            if (tVar.Y.size() + tVar.X.size() > 0) {
                tVar.U.setEnabled(false);
                tVar.U.requestLayout();
                tVar.v0 = true;
                tVar.U.getViewTreeObserver().addOnGlobalLayoutListener(new n(tVar, hashMap, hashMap2));
                return;
            }
        }
        tVar.X = null;
        tVar.Y = null;
    }
}
