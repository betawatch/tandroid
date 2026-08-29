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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class k implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ s b;

    public k(s sVar, boolean z10) {
        this.b = sVar;
        this.a = z10;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i10;
        HashMap hashMap;
        HashMap hashMap2;
        Bitmap bitmap;
        s sVar = this.b;
        sVar.F.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        if (sVar.r0) {
            sVar.s0 = true;
            return;
        }
        c2.b0 b0Var = sVar.r;
        int i11 = sVar.M.getLayoutParams().height;
        s.o(-1, sVar.M);
        sVar.u(sVar.h());
        View decorView = sVar.getWindow().getDecorView();
        decorView.measure(View.MeasureSpec.makeMeasureSpec(sVar.getWindow().getAttributes().width, TLObject.FLAG_30), 0);
        s.o(i11, sVar.M);
        if (!(sVar.G.getDrawable() instanceof BitmapDrawable) || (bitmap = ((BitmapDrawable) sVar.G.getDrawable()).getBitmap()) == null) {
            i10 = 0;
        } else {
            i10 = sVar.k(bitmap.getWidth(), bitmap.getHeight());
            sVar.G.setScaleType(bitmap.getWidth() >= bitmap.getHeight() ? ImageView.ScaleType.FIT_XY : ImageView.ScaleType.FIT_CENTER);
        }
        int l10 = sVar.l(sVar.h());
        int size = sVar.S.size();
        int size2 = sVar.n() ? DesugarCollections.unmodifiableList(b0Var.v).size() * sVar.a0 : 0;
        if (size > 0) {
            size2 += sVar.c0;
        }
        int min = Math.min(size2, sVar.b0);
        if (!sVar.q0) {
            min = 0;
        }
        int max = Math.max(i10, min) + l10;
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        int height = rect.height() - (sVar.E.getMeasuredHeight() - sVar.F.getMeasuredHeight());
        if (i10 <= 0 || max > height) {
            if (sVar.M.getMeasuredHeight() + sVar.Q.getLayoutParams().height >= sVar.F.getMeasuredHeight()) {
                sVar.G.setVisibility(8);
            }
            max = min + l10;
            i10 = 0;
        } else {
            sVar.G.setVisibility(0);
            s.o(i10, sVar.G);
        }
        if (!sVar.h() || max > height) {
            sVar.N.setVisibility(8);
        } else {
            sVar.N.setVisibility(0);
        }
        sVar.u(sVar.N.getVisibility() == 0);
        int l11 = sVar.l(sVar.N.getVisibility() == 0);
        int max2 = Math.max(i10, min) + l11;
        if (max2 > height) {
            min -= max2 - height;
        } else {
            height = max2;
        }
        sVar.M.clearAnimation();
        sVar.Q.clearAnimation();
        sVar.F.clearAnimation();
        boolean z10 = this.a;
        if (z10) {
            sVar.f(l11, sVar.M);
            sVar.f(min, sVar.Q);
            sVar.f(height, sVar.F);
        } else {
            s.o(l11, sVar.M);
            s.o(min, sVar.Q);
            s.o(height, sVar.F);
        }
        s.o(rect.height(), sVar.D);
        List unmodifiableList = DesugarCollections.unmodifiableList(b0Var.v);
        if (unmodifiableList.isEmpty()) {
            sVar.S.clear();
            sVar.R.notifyDataSetChanged();
            return;
        }
        if (new HashSet(sVar.S).equals(new HashSet(unmodifiableList))) {
            sVar.R.notifyDataSetChanged();
            return;
        }
        if (z10) {
            OverlayListView overlayListView = sVar.Q;
            r rVar = sVar.R;
            hashMap = new HashMap();
            int firstVisiblePosition = overlayListView.getFirstVisiblePosition();
            for (int i12 = 0; i12 < overlayListView.getChildCount(); i12++) {
                Object item = rVar.getItem(firstVisiblePosition + i12);
                View childAt = overlayListView.getChildAt(i12);
                hashMap.put(item, new Rect(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()));
            }
        } else {
            hashMap = null;
        }
        if (z10) {
            Context context = sVar.s;
            OverlayListView overlayListView2 = sVar.Q;
            r rVar2 = sVar.R;
            hashMap2 = new HashMap();
            int firstVisiblePosition2 = overlayListView2.getFirstVisiblePosition();
            for (int i13 = 0; i13 < overlayListView2.getChildCount(); i13++) {
                Object item2 = rVar2.getItem(firstVisiblePosition2 + i13);
                View childAt2 = overlayListView2.getChildAt(i13);
                Bitmap createBitmap = Bitmap.createBitmap(childAt2.getWidth(), childAt2.getHeight(), Bitmap.Config.ARGB_8888);
                childAt2.draw(new Canvas(createBitmap));
                hashMap2.put(item2, new BitmapDrawable(context.getResources(), createBitmap));
            }
        } else {
            hashMap2 = null;
        }
        ArrayList arrayList = sVar.S;
        HashSet hashSet = new HashSet(unmodifiableList);
        hashSet.removeAll(arrayList);
        sVar.T = hashSet;
        HashSet hashSet2 = new HashSet(sVar.S);
        hashSet2.removeAll(unmodifiableList);
        sVar.U = hashSet2;
        sVar.S.addAll(0, sVar.T);
        sVar.S.removeAll(sVar.U);
        sVar.R.notifyDataSetChanged();
        if (z10 && sVar.q0) {
            if (sVar.U.size() + sVar.T.size() > 0) {
                sVar.Q.setEnabled(false);
                sVar.Q.requestLayout();
                sVar.r0 = true;
                sVar.Q.getViewTreeObserver().addOnGlobalLayoutListener(new m(sVar, hashMap, hashMap2));
                return;
            }
        }
        sVar.T = null;
        sVar.U = null;
    }
}
