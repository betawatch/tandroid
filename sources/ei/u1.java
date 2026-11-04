package ei;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hp;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class u1 {
    public final long a;
    public final float b;
    public final float c;
    public final ch0 d;
    public final Paint e;
    public final ImageReceiver f;
    public final ly0 g;
    public boolean h;
    public final org.telegram.ui.Components.u5 i;
    public final org.telegram.ui.Components.u5 j;

    public u1(v1 v1Var, View view, int i3, long j10, int i10, boolean z10) {
        Paint paint = new Paint(1);
        this.e = paint;
        this.a = j10;
        f5.a aVar = Utilities.c;
        this.b = Utilities.l(aVar.nextFloat());
        this.c = Utilities.l(aVar.nextFloat());
        if (z10) {
            int[] iArr = v1Var.f;
            ch0 ch0Var = new ch0(iArr[aVar.nextInt(iArr.length)], org.telegram.messenger.g0.L(70.0f), org.telegram.messenger.g0.L(70.0f));
            this.d = ch0Var;
            ch0Var.R(view);
            ch0Var.J(true);
            ch0Var.K(0);
            ch0Var.start();
        }
        TLObject e22 = hp.s1(i3).e2(j10);
        org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        u8Var.l(e22);
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f = imageReceiver;
        imageReceiver.y0(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f));
        imageReceiver.J0(org.telegram.messenger.g0.L(7.0f));
        imageReceiver.i0(e22, u8Var, null);
        view.addOnAttachStateChangeListener(new ai.f2(this, 5));
        if (view.isAttachedToWindow()) {
            imageReceiver.P();
        }
        paint.setColor(-1135603);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("⭐️");
        wp wpVar = new wp(R.drawable.star, 0);
        wpVar.H = 0.875f;
        spannableStringBuilder.setSpan(wpVar, 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) bd.E(i10, ','));
        this.g = new ly0(spannableStringBuilder, 10.0f, org.telegram.messenger.g0.o1("fonts/num.otf"));
        org.telegram.ui.Components.u5 u5Var = new org.telegram.ui.Components.u5(view, 2000L, new LinearInterpolator());
        this.i = u5Var;
        u5Var.e(true, 0.0f);
        u5Var.e(false, 1.0f);
        this.j = new org.telegram.ui.Components.u5(view, 350L, 240L, xq.h);
    }
}
