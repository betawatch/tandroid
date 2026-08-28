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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class n implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ v b;

    public n(v vVar, boolean z10) {
        this.b = vVar;
        this.a = z10;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i9;
        HashMap hashMap;
        HashMap hashMap2;
        Bitmap bitmap;
        v vVar = this.b;
        vVar.F.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        if (vVar.r0) {
            vVar.s0 = true;
            return;
        }
        c2.a0 a0Var = vVar.r;
        int i10 = vVar.M.getLayoutParams().height;
        v.o(-1, vVar.M);
        vVar.u(vVar.h());
        View decorView = vVar.getWindow().getDecorView();
        decorView.measure(View.MeasureSpec.makeMeasureSpec(vVar.getWindow().getAttributes().width, TLObject.FLAG_30), 0);
        v.o(i10, vVar.M);
        if (!(vVar.G.getDrawable() instanceof BitmapDrawable) || (bitmap = ((BitmapDrawable) vVar.G.getDrawable()).getBitmap()) == null) {
            i9 = 0;
        } else {
            i9 = vVar.k(bitmap.getWidth(), bitmap.getHeight());
            vVar.G.setScaleType(bitmap.getWidth() >= bitmap.getHeight() ? ImageView.ScaleType.FIT_XY : ImageView.ScaleType.FIT_CENTER);
        }
        int l10 = vVar.l(vVar.h());
        int size = vVar.S.size();
        int size2 = vVar.n() ? DesugarCollections.unmodifiableList(a0Var.v).size() * vVar.a0 : 0;
        if (size > 0) {
            size2 += vVar.c0;
        }
        int min = Math.min(size2, vVar.b0);
        if (!vVar.q0) {
            min = 0;
        }
        int max = Math.max(i9, min) + l10;
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        int height = rect.height() - (vVar.E.getMeasuredHeight() - vVar.F.getMeasuredHeight());
        if (i9 <= 0 || max > height) {
            if (vVar.M.getMeasuredHeight() + vVar.Q.getLayoutParams().height >= vVar.F.getMeasuredHeight()) {
                vVar.G.setVisibility(8);
            }
            max = min + l10;
            i9 = 0;
        } else {
            vVar.G.setVisibility(0);
            v.o(i9, vVar.G);
        }
        if (!vVar.h() || max > height) {
            vVar.N.setVisibility(8);
        } else {
            vVar.N.setVisibility(0);
        }
        vVar.u(vVar.N.getVisibility() == 0);
        int l11 = vVar.l(vVar.N.getVisibility() == 0);
        int max2 = Math.max(i9, min) + l11;
        if (max2 > height) {
            min -= max2 - height;
        } else {
            height = max2;
        }
        vVar.M.clearAnimation();
        vVar.Q.clearAnimation();
        vVar.F.clearAnimation();
        boolean z10 = this.a;
        if (z10) {
            vVar.f(l11, vVar.M);
            vVar.f(min, vVar.Q);
            vVar.f(height, vVar.F);
        } else {
            v.o(l11, vVar.M);
            v.o(min, vVar.Q);
            v.o(height, vVar.F);
        }
        v.o(rect.height(), vVar.D);
        List unmodifiableList = DesugarCollections.unmodifiableList(a0Var.v);
        if (unmodifiableList.isEmpty()) {
            vVar.S.clear();
            vVar.R.notifyDataSetChanged();
            return;
        }
        if (new HashSet(vVar.S).equals(new HashSet(unmodifiableList))) {
            vVar.R.notifyDataSetChanged();
            return;
        }
        if (z10) {
            OverlayListView overlayListView = vVar.Q;
            u uVar = vVar.R;
            hashMap = new HashMap();
            int firstVisiblePosition = overlayListView.getFirstVisiblePosition();
            for (int i11 = 0; i11 < overlayListView.getChildCount(); i11++) {
                Object item = uVar.getItem(firstVisiblePosition + i11);
                View childAt = overlayListView.getChildAt(i11);
                hashMap.put(item, new Rect(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()));
            }
        } else {
            hashMap = null;
        }
        if (z10) {
            Context context = vVar.s;
            OverlayListView overlayListView2 = vVar.Q;
            u uVar2 = vVar.R;
            hashMap2 = new HashMap();
            int firstVisiblePosition2 = overlayListView2.getFirstVisiblePosition();
            for (int i12 = 0; i12 < overlayListView2.getChildCount(); i12++) {
                Object item2 = uVar2.getItem(firstVisiblePosition2 + i12);
                View childAt2 = overlayListView2.getChildAt(i12);
                Bitmap createBitmap = Bitmap.createBitmap(childAt2.getWidth(), childAt2.getHeight(), Bitmap.Config.ARGB_8888);
                childAt2.draw(new Canvas(createBitmap));
                hashMap2.put(item2, new BitmapDrawable(context.getResources(), createBitmap));
            }
        } else {
            hashMap2 = null;
        }
        ArrayList arrayList = vVar.S;
        HashSet hashSet = new HashSet(unmodifiableList);
        hashSet.removeAll(arrayList);
        vVar.T = hashSet;
        HashSet hashSet2 = new HashSet(vVar.S);
        hashSet2.removeAll(unmodifiableList);
        vVar.U = hashSet2;
        vVar.S.addAll(0, vVar.T);
        vVar.S.removeAll(vVar.U);
        vVar.R.notifyDataSetChanged();
        if (z10 && vVar.q0) {
            if (vVar.U.size() + vVar.T.size() > 0) {
                vVar.Q.setEnabled(false);
                vVar.Q.requestLayout();
                vVar.r0 = true;
                vVar.Q.getViewTreeObserver().addOnGlobalLayoutListener(new p(vVar, hashMap, hashMap2));
                return;
            }
        }
        vVar.T = null;
        vVar.U = null;
    }
}
