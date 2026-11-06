package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import bi.de;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.qs;
import org.telegram.messenger.rc;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.i5;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class f3 {
    public final g5 a;
    public ValueAnimator b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public final r2 k;
    public final int l;
    public int m = 0;
    public float n = 0.0f;
    public int o;
    public int p;
    public boolean q;
    public ValueAnimator r;

    public f3(TLRPC.User user, r2 r2Var, int i7) {
        this.k = r2Var;
        this.l = i7;
        boolean e10 = rc.e(512);
        long m10 = t10.m(user);
        if (!e10 || m10 == 0) {
            return;
        }
        g5 g5Var = new g5(i7, 13, r2Var, false);
        this.a = g5Var;
        g5Var.j(m10, false);
        g5Var.k(-16777216);
        g5Var.w = this.m;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.b = ofFloat;
        ofFloat.addUpdateListener(new de(21, this, r2Var));
        this.e = org.telegram.messenger.g0.L(12.0f) + this.c;
        this.f = org.telegram.messenger.g0.L(12.0f) + this.d;
        SecureRandom secureRandom = Utilities.b;
        this.c = org.telegram.messenger.g0.L(12.0f) + secureRandom.nextInt(org.telegram.messenger.g0.L(16.0f));
        this.d = org.telegram.messenger.g0.L(12.0f) + secureRandom.nextInt(org.telegram.messenger.g0.L(16.0f));
        this.b.setInterpolator(new LinearInterpolator());
        this.b.addListener(new e3(this));
        this.b.setDuration(2000L);
    }

    public final void a(Canvas canvas) {
        g5 g5Var = this.a;
        if (g5Var == null) {
            return;
        }
        canvas.save();
        float f10 = this.n;
        canvas.scale(f10, f10, this.o / 2.0f, org.telegram.messenger.g0.L(300.0f));
        canvas.translate(this.i - this.p, this.j);
        int i7 = this.g;
        int i10 = this.h;
        int i11 = this.l;
        g5Var.setBounds(i7, i10, i7 + i11, i11 + i10);
        g5Var.w = this.m;
        g5Var.draw(canvas);
        canvas.restore();
    }

    public final void b(int i7, int i10) {
        di.z2 z2Var;
        g5 g5Var = this.a;
        if (g5Var == null) {
            return;
        }
        this.i = i7;
        this.j = i10;
        this.k.invalidate();
        if (this.q) {
            return;
        }
        int i11 = 0;
        Drawable drawable = g5Var.f[0];
        if (!(drawable instanceof i5) || ((z2Var = ((i5) drawable).k) != null && z2Var.J())) {
            int i12 = 1;
            this.q = true;
            this.p = this.i > this.o / 2 ? org.telegram.messenger.g0.L(12) : -org.telegram.messenger.g0.L(12);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setInterpolator(new xq(0.34d, 1.36d, 0.64d, 1.0d));
            ofFloat.addUpdateListener(new d3(this, i11));
            long j3 = 350;
            ofFloat.setDuration(j3);
            long j10 = qs.K2;
            ofFloat.setStartDelay(j10);
            ofFloat.start();
            ValueAnimator ofInt = ValueAnimator.ofInt(0, qs.e4, qs.e4);
            ofInt.setInterpolator(xq.f);
            ofInt.addUpdateListener(new d3(this, i12));
            ofInt.setStartDelay(j10);
            ofInt.setDuration(j3);
            ofInt.start();
        }
    }
}
