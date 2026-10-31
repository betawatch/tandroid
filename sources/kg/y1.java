package kg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class y1 extends FrameLayout {
    public float a;
    public final x1 b;
    public final ImageReceiver c;
    public final ImageReceiver d;
    public boolean e;
    public boolean f;
    public float h;
    public float n;
    public TLRPC.Document r;
    public boolean s;
    public final /* synthetic */ b1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(b1 b1Var, Context context) {
        super(context);
        this.w = b1Var;
        this.f = true;
        x1 x1Var = new x1(this, context);
        this.b = x1Var;
        ImageReceiver imageReceiver = new ImageReceiver(x1Var);
        this.c = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(x1Var);
        this.d = imageReceiver2;
        imageReceiver.t0 = false;
        imageReceiver2.t0 = false;
        setClipChildren(false);
        addView(x1Var, b6.e(-1, -2, 21));
    }

    public final void a(boolean z10, boolean z11, boolean z12) {
        boolean z13 = this.e;
        x1 x1Var = this.b;
        if (z13 != z11) {
            this.e = z11;
            if (!z12) {
                this.h = z11 ? 1.0f : 0.0f;
            }
            x1Var.invalidate();
        }
        if (this.f != z10) {
            this.f = z10;
            if (!z12) {
                this.n = z10 ? 1.0f : 0.0f;
            }
            x1Var.invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c.P();
        this.d.P();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c.R();
        this.d.R();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = (int) (this.w.r3 * 0.6f);
        x1 x1Var = this.b;
        ViewGroup.LayoutParams layoutParams = x1Var.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = x1Var.getLayoutParams();
        int L = i12 - org.telegram.messenger.i0.L(16.0f);
        layoutParams2.height = L;
        layoutParams.width = L;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (i12 * 0.7f), TLObject.FLAG_30));
    }
}
