package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import ci.uc;
import ei.c3;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.messenger.lc;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class u2 {
    public final e5 a;
    public ValueAnimator b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public final g2 k;
    public final int l;
    public int m = 0;
    public float n = 0.0f;
    public int o;
    public int p;
    public boolean q;
    public ValueAnimator r;

    public u2(TLRPC.User user, g2 g2Var, int i3) {
        this.k = g2Var;
        this.l = i3;
        boolean e10 = lc.e(512);
        long m10 = l10.m(user);
        if (!e10 || m10 == 0) {
            return;
        }
        e5 e5Var = new e5(i3, 13, g2Var, false);
        this.a = e5Var;
        e5Var.j(m10, false);
        e5Var.k(-16777216);
        e5Var.w = this.m;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.b = ofFloat;
        ofFloat.addUpdateListener(new uc(21, this, g2Var));
        this.e = org.telegram.messenger.g0.L(12.0f) + this.c;
        this.f = org.telegram.messenger.g0.L(12.0f) + this.d;
        SecureRandom secureRandom = Utilities.b;
        this.c = org.telegram.messenger.g0.L(12.0f) + secureRandom.nextInt(org.telegram.messenger.g0.L(16.0f));
        this.d = org.telegram.messenger.g0.L(12.0f) + secureRandom.nextInt(org.telegram.messenger.g0.L(16.0f));
        this.b.setInterpolator(new LinearInterpolator());
        this.b.addListener(new t2(this));
        this.b.setDuration(2000L);
    }

    public final void a(Canvas canvas) {
        e5 e5Var = this.a;
        if (e5Var == null) {
            return;
        }
        canvas.save();
        float f10 = this.n;
        canvas.scale(f10, f10, this.o / 2.0f, org.telegram.messenger.g0.L(300.0f));
        canvas.translate(this.i - this.p, this.j);
        int i3 = this.g;
        int i10 = this.h;
        int i11 = this.l;
        e5Var.setBounds(i3, i10, i3 + i11, i11 + i10);
        e5Var.w = this.m;
        e5Var.draw(canvas);
        canvas.restore();
    }

    public final void b(int i3, int i10) {
        c3 c3Var;
        e5 e5Var = this.a;
        if (e5Var == null) {
            return;
        }
        this.i = i3;
        this.j = i10;
        this.k.invalidate();
        if (this.q) {
            return;
        }
        int i11 = 0;
        Drawable drawable = e5Var.f[0];
        if (!(drawable instanceof g5) || ((c3Var = ((g5) drawable).k) != null && c3Var.J())) {
            int i12 = 1;
            this.q = true;
            this.p = this.i > this.o / 2 ? org.telegram.messenger.g0.L(12) : -org.telegram.messenger.g0.L(12);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setInterpolator(new xq(0.34d, 1.36d, 0.64d, 1.0d));
            ofFloat.addUpdateListener(new s2(this, i11));
            long j10 = 350;
            ofFloat.setDuration(j10);
            long j11 = hs.K2;
            ofFloat.setStartDelay(j11);
            ofFloat.start();
            ValueAnimator ofInt = ValueAnimator.ofInt(0, hs.e4, hs.e4);
            ofInt.setInterpolator(xq.f);
            ofInt.addUpdateListener(new s2(this, i12));
            ofInt.setStartDelay(j11);
            ofInt.setDuration(j10);
            ofInt.start();
        }
    }
}
