package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qc;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.n5;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.p5;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class i3 {
    public final n5 a;
    public ValueAnimator b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public final u2 k;
    public final int l;
    public int m = 0;
    public float n = 0.0f;
    public int o;
    public int p;
    public boolean q;
    public ValueAnimator r;

    public i3(TLRPC.User user, u2 u2Var, int i7) {
        this.k = u2Var;
        this.l = i7;
        boolean e10 = qc.e(512);
        long n10 = p10.n(user);
        if (!e10 || n10 == 0) {
            return;
        }
        n5 n5Var = new n5(i7, 13, u2Var, false);
        this.a = n5Var;
        n5Var.j(n10, false);
        n5Var.k(-16777216);
        n5Var.w = this.m;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.b = ofFloat;
        ofFloat.addUpdateListener(new ch.w(20, this, u2Var));
        this.e = org.telegram.messenger.g0.L(12.0f) + this.c;
        this.f = org.telegram.messenger.g0.L(12.0f) + this.d;
        SecureRandom secureRandom = Utilities.b;
        this.c = org.telegram.messenger.g0.L(12.0f) + secureRandom.nextInt(org.telegram.messenger.g0.L(16.0f));
        this.d = org.telegram.messenger.g0.L(12.0f) + secureRandom.nextInt(org.telegram.messenger.g0.L(16.0f));
        this.b.setInterpolator(new LinearInterpolator());
        this.b.addListener(new h3(this));
        this.b.setDuration(2000L);
    }

    public final void a(Canvas canvas) {
        n5 n5Var = this.a;
        if (n5Var == null) {
            return;
        }
        canvas.save();
        float f10 = this.n;
        canvas.scale(f10, f10, this.o / 2.0f, org.telegram.messenger.g0.L(300.0f));
        canvas.translate(this.i - this.p, this.j);
        int i7 = this.g;
        int i10 = this.h;
        int i11 = this.l;
        n5Var.setBounds(i7, i10, i7 + i11, i11 + i10);
        n5Var.w = this.m;
        n5Var.draw(canvas);
        canvas.restore();
    }

    public final void b(int i7, int i10) {
        fi.s2 s2Var;
        n5 n5Var = this.a;
        if (n5Var == null) {
            return;
        }
        this.i = i7;
        this.j = i10;
        this.k.invalidate();
        if (this.q) {
            return;
        }
        int i11 = 0;
        Drawable drawable = n5Var.f[0];
        if (!(drawable instanceof p5) || ((s2Var = ((p5) drawable).k) != null && s2Var.J())) {
            int i12 = 1;
            this.q = true;
            this.p = this.i > this.o / 2 ? org.telegram.messenger.g0.L(12) : -org.telegram.messenger.g0.L(12);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setInterpolator(new nr(0.34d, 1.36d, 0.64d, 1.0d));
            ofFloat.addUpdateListener(new g3(this, i11));
            long j3 = ls.V5;
            ofFloat.setDuration(j3);
            long j10 = ls.K2;
            ofFloat.setStartDelay(j10);
            ofFloat.start();
            ValueAnimator ofInt = ValueAnimator.ofInt(0, ls.e4, ls.e4);
            ofInt.setInterpolator(nr.f);
            ofInt.addUpdateListener(new g3(this, i12));
            ofInt.setStartDelay(j10);
            ofInt.setDuration(j3);
            ofInt.start();
        }
    }
}
