package fi;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.nh0;
import org.telegram.ui.Components.wy0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class l1 {
    public final long a;
    public final float b;
    public final float c;
    public final nh0 d;
    public final Paint e;
    public final ImageReceiver f;
    public final wy0 g;
    public boolean h;
    public final org.telegram.ui.Components.c6 i;
    public final org.telegram.ui.Components.c6 j;

    public l1(m1 m1Var, View view, int i7, long j3, int i10, boolean z10) {
        Paint paint = new Paint(1);
        this.e = paint;
        this.a = j3;
        g5.a aVar = Utilities.c;
        this.b = Utilities.l(aVar.nextFloat());
        this.c = Utilities.l(aVar.nextFloat());
        if (z10) {
            int[] iArr = m1Var.f;
            nh0 nh0Var = new nh0(iArr[aVar.nextInt(iArr.length)], org.telegram.messenger.g0.L(70.0f), org.telegram.messenger.g0.L(70.0f));
            this.d = nh0Var;
            nh0Var.R(view);
            nh0Var.J(true);
            nh0Var.K(0);
            nh0Var.start();
        }
        TLObject g22 = mp.u1(i7).g2(j3);
        org.telegram.ui.Components.a9 a9Var = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
        a9Var.l(g22);
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f = imageReceiver;
        imageReceiver.z0(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f));
        imageReceiver.K0(org.telegram.messenger.g0.L(7.0f));
        imageReceiver.j0(g22, a9Var, null);
        view.addOnAttachStateChangeListener(new bi.x2(this, 5));
        if (view.isAttachedToWindow()) {
            imageReceiver.Q();
        }
        paint.setColor(-1135603);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("⭐️");
        kq kqVar = new kq(R.drawable.star, 0);
        kqVar.H = 0.875f;
        spannableStringBuilder.setSpan(kqVar, 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) gd.E(i10, ','));
        this.g = new wy0(spannableStringBuilder, 10.0f, org.telegram.messenger.g0.o1("fonts/num.otf"));
        org.telegram.ui.Components.c6 c6Var = new org.telegram.ui.Components.c6(view, 2000L, new LinearInterpolator());
        this.i = c6Var;
        c6Var.e(true, 0.0f);
        c6Var.e(false, 1.0f);
        this.j = new org.telegram.ui.Components.c6(view, 350L, 240L, kr.h);
    }
}
