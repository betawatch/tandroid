package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.messenger.qc;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.g5;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class j3 {
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
    public final v2 k;
    public final int l;
    public int m = 0;
    public float n = 0.0f;
    public int o;
    public int p;
    public boolean q;
    public ValueAnimator r;

    public j3(TLRPC.User user, v2 v2Var, int i7) {
        this.k = v2Var;
        this.l = i7;
        boolean e10 = qc.e(512);
        long m10 = q10.m(user);
        if (!e10 || m10 == 0) {
            return;
        }
        e5 e5Var = new e5(i7, 13, v2Var, false);
        this.a = e5Var;
        e5Var.j(m10, false);
        e5Var.k(-16777216);
        e5Var.w = this.m;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.b = ofFloat;
        ofFloat.addUpdateListener(new ch.v(20, this, v2Var));
        this.e = org.telegram.messenger.g0.L(12.0f) + this.c;
        this.f = org.telegram.messenger.g0.L(12.0f) + this.d;
        SecureRandom secureRandom = Utilities.b;
        this.c = org.telegram.messenger.g0.L(12.0f) + secureRandom.nextInt(org.telegram.messenger.g0.L(16.0f));
        this.d = org.telegram.messenger.g0.L(12.0f) + secureRandom.nextInt(org.telegram.messenger.g0.L(16.0f));
        this.b.setInterpolator(new LinearInterpolator());
        this.b.addListener(new i3(this));
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
        int i7 = this.g;
        int i10 = this.h;
        int i11 = this.l;
        e5Var.setBounds(i7, i10, i7 + i11, i11 + i10);
        e5Var.w = this.m;
        e5Var.draw(canvas);
        canvas.restore();
    }

    public final void b(int i7, int i10) {
        fi.u2 u2Var;
        e5 e5Var = this.a;
        if (e5Var == null) {
            return;
        }
        this.i = i7;
        this.j = i10;
        this.k.invalidate();
        if (this.q) {
            return;
        }
        int i11 = 0;
        Drawable drawable = e5Var.f[0];
        if (!(drawable instanceof g5) || ((u2Var = ((g5) drawable).k) != null && u2Var.J())) {
            int i12 = 1;
            this.q = true;
            this.p = this.i > this.o / 2 ? org.telegram.messenger.g0.L(12) : -org.telegram.messenger.g0.L(12);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setInterpolator(new er(0.34d, 1.36d, 0.64d, 1.0d));
            ofFloat.addUpdateListener(new h3(this, i11));
            long j3 = 350;
            ofFloat.setDuration(j3);
            long j10 = ns.K2;
            ofFloat.setStartDelay(j10);
            ofFloat.start();
            ValueAnimator ofInt = ValueAnimator.ofInt(0, ns.e4, ns.e4);
            ofInt.setInterpolator(er.f);
            ofInt.addUpdateListener(new h3(this, i12));
            ofInt.setStartDelay(j10);
            ofInt.setDuration(j3);
            ofInt.start();
        }
    }
}
