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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class n implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ v b;

    public n(v vVar, boolean z4) {
        this.b = vVar;
        this.a = z4;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i10;
        HashMap hashMap;
        HashMap hashMap2;
        Bitmap bitmap;
        v vVar = this.b;
        vVar.G.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        if (vVar.s0) {
            vVar.t0 = true;
            return;
        }
        c2.a0 a0Var = vVar.r;
        int i11 = vVar.N.getLayoutParams().height;
        v.o(-1, vVar.N);
        vVar.u(vVar.h());
        View decorView = vVar.getWindow().getDecorView();
        decorView.measure(View.MeasureSpec.makeMeasureSpec(vVar.getWindow().getAttributes().width, TLObject.FLAG_30), 0);
        v.o(i11, vVar.N);
        if (!(vVar.H.getDrawable() instanceof BitmapDrawable) || (bitmap = ((BitmapDrawable) vVar.H.getDrawable()).getBitmap()) == null) {
            i10 = 0;
        } else {
            i10 = vVar.k(bitmap.getWidth(), bitmap.getHeight());
            vVar.H.setScaleType(bitmap.getWidth() >= bitmap.getHeight() ? ImageView.ScaleType.FIT_XY : ImageView.ScaleType.FIT_CENTER);
        }
        int l10 = vVar.l(vVar.h());
        int size = vVar.T.size();
        int size2 = vVar.n() ? DesugarCollections.unmodifiableList(a0Var.v).size() * vVar.b0 : 0;
        if (size > 0) {
            size2 += vVar.d0;
        }
        int min = Math.min(size2, vVar.c0);
        if (!vVar.r0) {
            min = 0;
        }
        int max = Math.max(i10, min) + l10;
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        int height = rect.height() - (vVar.F.getMeasuredHeight() - vVar.G.getMeasuredHeight());
        if (i10 <= 0 || max > height) {
            if (vVar.N.getMeasuredHeight() + vVar.R.getLayoutParams().height >= vVar.G.getMeasuredHeight()) {
                vVar.H.setVisibility(8);
            }
            max = min + l10;
            i10 = 0;
        } else {
            vVar.H.setVisibility(0);
            v.o(i10, vVar.H);
        }
        if (!vVar.h() || max > height) {
            vVar.O.setVisibility(8);
        } else {
            vVar.O.setVisibility(0);
        }
        vVar.u(vVar.O.getVisibility() == 0);
        int l11 = vVar.l(vVar.O.getVisibility() == 0);
        int max2 = Math.max(i10, min) + l11;
        if (max2 > height) {
            min -= max2 - height;
        } else {
            height = max2;
        }
        vVar.N.clearAnimation();
        vVar.R.clearAnimation();
        vVar.G.clearAnimation();
        boolean z4 = this.a;
        if (z4) {
            vVar.f(l11, vVar.N);
            vVar.f(min, vVar.R);
            vVar.f(height, vVar.G);
        } else {
            v.o(l11, vVar.N);
            v.o(min, vVar.R);
            v.o(height, vVar.G);
        }
        v.o(rect.height(), vVar.E);
        List unmodifiableList = DesugarCollections.unmodifiableList(a0Var.v);
        if (unmodifiableList.isEmpty()) {
            vVar.T.clear();
            vVar.S.notifyDataSetChanged();
            return;
        }
        if (new HashSet(vVar.T).equals(new HashSet(unmodifiableList))) {
            vVar.S.notifyDataSetChanged();
            return;
        }
        if (z4) {
            OverlayListView overlayListView = vVar.R;
            u uVar = vVar.S;
            hashMap = new HashMap();
            int firstVisiblePosition = overlayListView.getFirstVisiblePosition();
            for (int i12 = 0; i12 < overlayListView.getChildCount(); i12++) {
                Object item = uVar.getItem(firstVisiblePosition + i12);
                View childAt = overlayListView.getChildAt(i12);
                hashMap.put(item, new Rect(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()));
            }
        } else {
            hashMap = null;
        }
        if (z4) {
            Context context = vVar.s;
            OverlayListView overlayListView2 = vVar.R;
            u uVar2 = vVar.S;
            hashMap2 = new HashMap();
            int firstVisiblePosition2 = overlayListView2.getFirstVisiblePosition();
            for (int i13 = 0; i13 < overlayListView2.getChildCount(); i13++) {
                Object item2 = uVar2.getItem(firstVisiblePosition2 + i13);
                View childAt2 = overlayListView2.getChildAt(i13);
                Bitmap createBitmap = Bitmap.createBitmap(childAt2.getWidth(), childAt2.getHeight(), Bitmap.Config.ARGB_8888);
                childAt2.draw(new Canvas(createBitmap));
                hashMap2.put(item2, new BitmapDrawable(context.getResources(), createBitmap));
            }
        } else {
            hashMap2 = null;
        }
        ArrayList arrayList = vVar.T;
        HashSet hashSet = new HashSet(unmodifiableList);
        hashSet.removeAll(arrayList);
        vVar.U = hashSet;
        HashSet hashSet2 = new HashSet(vVar.T);
        hashSet2.removeAll(unmodifiableList);
        vVar.V = hashSet2;
        vVar.T.addAll(0, vVar.U);
        vVar.T.removeAll(vVar.V);
        vVar.S.notifyDataSetChanged();
        if (z4 && vVar.r0) {
            if (vVar.V.size() + vVar.U.size() > 0) {
                vVar.R.setEnabled(false);
                vVar.R.requestLayout();
                vVar.s0 = true;
                vVar.R.getViewTreeObserver().addOnGlobalLayoutListener(new p(vVar, hashMap, hashMap2));
                return;
            }
        }
        vVar.U = null;
        vVar.V = null;
    }
}
