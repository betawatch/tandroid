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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
        int i7;
        HashMap hashMap;
        HashMap hashMap2;
        Bitmap bitmap;
        t tVar = this.b;
        tVar.K.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        if (tVar.w0) {
            tVar.x0 = true;
            return;
        }
        s4.v vVar = tVar.r;
        int i10 = tVar.R.getLayoutParams().height;
        t.o(-1, tVar.R);
        tVar.u(tVar.h());
        View decorView = tVar.getWindow().getDecorView();
        decorView.measure(View.MeasureSpec.makeMeasureSpec(tVar.getWindow().getAttributes().width, TLObject.FLAG_30), 0);
        t.o(i10, tVar.R);
        if (!(tVar.L.getDrawable() instanceof BitmapDrawable) || (bitmap = ((BitmapDrawable) tVar.L.getDrawable()).getBitmap()) == null) {
            i7 = 0;
        } else {
            i7 = tVar.k(bitmap.getWidth(), bitmap.getHeight());
            tVar.L.setScaleType(bitmap.getWidth() >= bitmap.getHeight() ? ImageView.ScaleType.FIT_XY : ImageView.ScaleType.FIT_CENTER);
        }
        int l10 = tVar.l(tVar.h());
        int size = tVar.X.size();
        int size2 = tVar.n() ? DesugarCollections.unmodifiableList(vVar.v).size() * tVar.f0 : 0;
        if (size > 0) {
            size2 += tVar.h0;
        }
        int min = Math.min(size2, tVar.g0);
        if (!tVar.v0) {
            min = 0;
        }
        int max = Math.max(i7, min) + l10;
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        int height = rect.height() - (tVar.J.getMeasuredHeight() - tVar.K.getMeasuredHeight());
        if (i7 <= 0 || max > height) {
            if (tVar.R.getMeasuredHeight() + tVar.V.getLayoutParams().height >= tVar.K.getMeasuredHeight()) {
                tVar.L.setVisibility(8);
            }
            max = min + l10;
            i7 = 0;
        } else {
            tVar.L.setVisibility(0);
            t.o(i7, tVar.L);
        }
        if (!tVar.h() || max > height) {
            tVar.S.setVisibility(8);
        } else {
            tVar.S.setVisibility(0);
        }
        tVar.u(tVar.S.getVisibility() == 0);
        int l11 = tVar.l(tVar.S.getVisibility() == 0);
        int max2 = Math.max(i7, min) + l11;
        if (max2 > height) {
            min -= max2 - height;
        } else {
            height = max2;
        }
        tVar.R.clearAnimation();
        tVar.V.clearAnimation();
        tVar.K.clearAnimation();
        boolean z10 = this.a;
        if (z10) {
            tVar.f(l11, tVar.R);
            tVar.f(min, tVar.V);
            tVar.f(height, tVar.K);
        } else {
            t.o(l11, tVar.R);
            t.o(min, tVar.V);
            t.o(height, tVar.K);
        }
        t.o(rect.height(), tVar.I);
        List unmodifiableList = DesugarCollections.unmodifiableList(vVar.v);
        if (unmodifiableList.isEmpty()) {
            tVar.X.clear();
            tVar.W.notifyDataSetChanged();
            return;
        }
        if (new HashSet(tVar.X).equals(new HashSet(unmodifiableList))) {
            tVar.W.notifyDataSetChanged();
            return;
        }
        if (z10) {
            OverlayListView overlayListView = tVar.V;
            s sVar = tVar.W;
            hashMap = new HashMap();
            int firstVisiblePosition = overlayListView.getFirstVisiblePosition();
            for (int i11 = 0; i11 < overlayListView.getChildCount(); i11++) {
                Object item = sVar.getItem(firstVisiblePosition + i11);
                View childAt = overlayListView.getChildAt(i11);
                hashMap.put(item, new Rect(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()));
            }
        } else {
            hashMap = null;
        }
        if (z10) {
            Context context = tVar.s;
            OverlayListView overlayListView2 = tVar.V;
            s sVar2 = tVar.W;
            hashMap2 = new HashMap();
            int firstVisiblePosition2 = overlayListView2.getFirstVisiblePosition();
            for (int i12 = 0; i12 < overlayListView2.getChildCount(); i12++) {
                Object item2 = sVar2.getItem(firstVisiblePosition2 + i12);
                View childAt2 = overlayListView2.getChildAt(i12);
                Bitmap createBitmap = Bitmap.createBitmap(childAt2.getWidth(), childAt2.getHeight(), Bitmap.Config.ARGB_8888);
                childAt2.draw(new Canvas(createBitmap));
                hashMap2.put(item2, new BitmapDrawable(context.getResources(), createBitmap));
            }
        } else {
            hashMap2 = null;
        }
        ArrayList arrayList = tVar.X;
        HashSet hashSet = new HashSet(unmodifiableList);
        hashSet.removeAll(arrayList);
        tVar.Y = hashSet;
        HashSet hashSet2 = new HashSet(tVar.X);
        hashSet2.removeAll(unmodifiableList);
        tVar.Z = hashSet2;
        tVar.X.addAll(0, tVar.Y);
        tVar.X.removeAll(tVar.Z);
        tVar.W.notifyDataSetChanged();
        if (z10 && tVar.v0) {
            if (tVar.Z.size() + tVar.Y.size() > 0) {
                tVar.V.setEnabled(false);
                tVar.V.requestLayout();
                tVar.w0 = true;
                tVar.V.getViewTreeObserver().addOnGlobalLayoutListener(new n(tVar, hashMap, hashMap2));
                return;
            }
        }
        tVar.Y = null;
        tVar.Z = null;
    }
}
