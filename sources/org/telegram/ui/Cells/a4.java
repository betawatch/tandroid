package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.cd;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class a4 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public org.telegram.ui.Components.g9 a;
    public org.telegram.ui.ActionBar.u5 b;
    public org.telegram.ui.ActionBar.u5 c;
    public ImageView d;
    public org.telegram.ui.Components.r8 e;
    public TLRPC.User f;
    public Paint h;
    public int n;
    public boolean r;
    public int s;

    public final void a(int i10, int i11) {
        this.n = i10;
        ImageView imageView = this.d;
        imageView.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        this.c.setTextColor(i11);
        org.telegram.ui.ActionBar.t6.H1(imageView.getDrawable(), i11 & 620756991, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.r) {
            canvas2 = canvas;
            canvas2.drawLine(cd.X ? 0.0f : org.telegram.messenger.i0.L(68.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (cd.X ? org.telegram.messenger.i0.L(68.0f) : 0), getMeasuredHeight() - 1, this.h);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    public CharSequence getName() {
        return this.b.getText();
    }

    public TLRPC.User getUser() {
        return this.f;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(58.0f), TLObject.FLAG_30));
    }

    public void setDrawDivider(boolean z10) {
        this.r = z10;
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        int x02;
        try {
            this.h.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ug, false));
            if (this.d != null && this.c != null && (x02 = org.telegram.ui.ActionBar.t6.x0(null, this.n, false)) != this.s) {
                this.s = x02;
                a(this.n, x02);
            }
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
