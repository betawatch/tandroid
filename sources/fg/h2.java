package fg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class h2 extends FrameLayout {
    public float a;
    public final g2 b;
    public final ImageReceiver c;
    public final ImageReceiver d;
    public boolean e;
    public boolean f;
    public float h;
    public float n;
    public TLRPC.Document r;
    public boolean s;
    public final /* synthetic */ f1 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(f1 f1Var, Context context) {
        super(context);
        this.v = f1Var;
        this.f = true;
        g2 g2Var = new g2(this, context);
        this.b = g2Var;
        ImageReceiver imageReceiver = new ImageReceiver(g2Var);
        this.c = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(g2Var);
        this.d = imageReceiver2;
        imageReceiver.setAllowStartAnimation(false);
        imageReceiver2.setAllowStartAnimation(false);
        setClipChildren(false);
        addView(g2Var, c6.e(-1, -2, 21));
    }

    public final void a(boolean z4, boolean z10, boolean z11) {
        boolean z12 = this.e;
        g2 g2Var = this.b;
        if (z12 != z10) {
            this.e = z10;
            if (!z11) {
                this.h = z10 ? 1.0f : 0.0f;
            }
            g2Var.invalidate();
        }
        if (this.f != z4) {
            this.f = z4;
            if (!z11) {
                this.n = z4 ? 1.0f : 0.0f;
            }
            g2Var.invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c.onAttachedToWindow();
        this.d.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c.onDetachedFromWindow();
        this.d.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = (int) (this.v.h3 * 0.6f);
        g2 g2Var = this.b;
        ViewGroup.LayoutParams layoutParams = g2Var.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = g2Var.getLayoutParams();
        int dp = i12 - AndroidUtilities.dp(16.0f);
        layoutParams2.height = dp;
        layoutParams.width = dp;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (i12 * 0.7f), TLObject.FLAG_30));
    }
}
