package eg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class i2 extends FrameLayout {
    public float a;
    public final h2 b;
    public final ImageReceiver c;
    public final ImageReceiver d;
    public boolean e;
    public boolean f;
    public float h;
    public float n;
    public TLRPC.Document r;
    public boolean s;
    public final /* synthetic */ g1 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(g1 g1Var, Context context) {
        super(context);
        this.v = g1Var;
        this.f = true;
        h2 h2Var = new h2(this, context);
        this.b = h2Var;
        ImageReceiver imageReceiver = new ImageReceiver(h2Var);
        this.c = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(h2Var);
        this.d = imageReceiver2;
        imageReceiver.setAllowStartAnimation(false);
        imageReceiver2.setAllowStartAnimation(false);
        setClipChildren(false);
        addView(h2Var, b6.e(-1, -2, 21));
    }

    public final void a(boolean z4, boolean z10, boolean z11) {
        boolean z12 = this.e;
        h2 h2Var = this.b;
        if (z12 != z10) {
            this.e = z10;
            if (!z11) {
                this.h = z10 ? 1.0f : 0.0f;
            }
            h2Var.invalidate();
        }
        if (this.f != z4) {
            this.f = z4;
            if (!z11) {
                this.n = z4 ? 1.0f : 0.0f;
            }
            h2Var.invalidate();
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
        h2 h2Var = this.b;
        ViewGroup.LayoutParams layoutParams = h2Var.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = h2Var.getLayoutParams();
        int dp = i12 - AndroidUtilities.dp(16.0f);
        layoutParams2.height = dp;
        layoutParams.width = dp;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (i12 * 0.7f), TLObject.FLAG_30));
    }
}
