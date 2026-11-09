package di;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ah0;
import org.telegram.ui.Components.ny0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class p1 {
    public final long a;
    public final float b;
    public final float c;
    public final ah0 d;
    public final Paint e;
    public final ImageReceiver f;
    public final ny0 g;
    public boolean h;
    public final org.telegram.ui.Components.w5 i;
    public final org.telegram.ui.Components.w5 j;

    public p1(q1 q1Var, View view, int i7, long j3, int i10, boolean z9) {
        Paint paint = new Paint(1);
        this.e = paint;
        this.a = j3;
        g5.a aVar = Utilities.c;
        this.b = Utilities.l(aVar.nextFloat());
        this.c = Utilities.l(aVar.nextFloat());
        if (z9) {
            int[] iArr = q1Var.f;
            ah0 ah0Var = new ah0(iArr[aVar.nextInt(iArr.length)], org.telegram.messenger.g0.L(70.0f), org.telegram.messenger.g0.L(70.0f));
            this.d = ah0Var;
            ah0Var.R(view);
            ah0Var.J(true);
            ah0Var.K(0);
            ah0Var.start();
        }
        TLObject e22 = qp.s1(i7).e2(j3);
        org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.g6) null);
        w8Var.l(e22);
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f = imageReceiver;
        imageReceiver.y0(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f));
        imageReceiver.J0(org.telegram.messenger.g0.L(7.0f));
        imageReceiver.i0(e22, w8Var, null);
        view.addOnAttachStateChangeListener(new bi.m6(this, 1));
        if (view.isAttachedToWindow()) {
            imageReceiver.P();
        }
        paint.setColor(-1135603);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("⭐️");
        wp wpVar = new wp(R.drawable.star, 0);
        wpVar.G = 0.875f;
        spannableStringBuilder.setSpan(wpVar, 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) id.E(i10, ','));
        this.g = new ny0(spannableStringBuilder, 10.0f, org.telegram.messenger.g0.o1("fonts/num.otf"));
        org.telegram.ui.Components.w5 w5Var = new org.telegram.ui.Components.w5(view, 2000L, new LinearInterpolator());
        this.i = w5Var;
        w5Var.e(true, 0.0f);
        w5Var.e(false, 1.0f);
        this.j = new org.telegram.ui.Components.w5(view, 350L, 240L, xq.h);
    }
}
