// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class o95 extends FrameLayout implements vlb {
    public bf0 a;
    public lka b;
    public lka c;
    public ImageView d;
    public pc0 e;
    public TLRPC.User f;
    public Paint h;
    public int n;
    public boolean r;
    public int s;

    public final void a(int i, int i2) {
        this.n = i;
        ImageView imageView = this.d;
        imageView.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.MULTIPLY));
        this.c.setTextColor(i2);
        cmb.F1(imageView.getDrawable(), i2 & 620756991, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.r) {
            canvas2 = canvas;
            canvas2.drawLine(jb6.a0 ? 0.0f : gm.L(68.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (jb6.a0 ? gm.L(68.0f) : 0), getMeasuredHeight() - 1, this.h);
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
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(58.0f), TLObject.FLAG_30));
    }

    public void setDrawDivider(boolean z) {
        this.r = z;
        invalidate();
    }

    @Override // vlb
    public final void updateColors() {
        int w0;
        try {
            this.h.setColor(cmb.w0(null, cmb.Wg, false));
            if (this.d != null && this.c != null && (w0 = cmb.w0(null, this.n, false)) != this.s) {
                this.s = w0;
                a(this.n, w0);
            }
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}
