package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ks;
import org.telegram.messenger.n10;
import org.telegram.messenger.pc;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.m5;
import org.telegram.ui.Components.o5;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class j3 {
    public final m5 a;
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
        boolean e10 = pc.e(512);
        long n10 = n10.n(user);
        if (!e10 || n10 == 0) {
            return;
        }
        m5 m5Var = new m5(i7, 13, v2Var, false);
        this.a = m5Var;
        m5Var.j(n10, false);
        m5Var.k(-16777216);
        m5Var.w = this.m;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.b = ofFloat;
        ofFloat.addUpdateListener(new ch.w(20, this, v2Var));
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
        m5 m5Var = this.a;
        if (m5Var == null) {
            return;
        }
        canvas.save();
        float f10 = this.n;
        canvas.scale(f10, f10, this.o / 2.0f, org.telegram.messenger.g0.L(300.0f));
        canvas.translate(this.i - this.p, this.j);
        int i7 = this.g;
        int i10 = this.h;
        int i11 = this.l;
        m5Var.setBounds(i7, i10, i7 + i11, i11 + i10);
        m5Var.w = this.m;
        m5Var.draw(canvas);
        canvas.restore();
    }

    public final void b(int i7, int i10) {
        fi.s2 s2Var;
        m5 m5Var = this.a;
        if (m5Var == null) {
            return;
        }
        this.i = i7;
        this.j = i10;
        this.k.invalidate();
        if (this.q) {
            return;
        }
        int i11 = 0;
        Drawable drawable = m5Var.f[0];
        if (!(drawable instanceof o5) || ((s2Var = ((o5) drawable).k) != null && s2Var.K())) {
            int i12 = 1;
            this.q = true;
            this.p = this.i > this.o / 2 ? org.telegram.messenger.g0.L(12) : -org.telegram.messenger.g0.L(12);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setInterpolator(new kr(0.34d, 1.36d, 0.64d, 1.0d));
            ofFloat.addUpdateListener(new h3(this, i11));
            long j3 = ks.V5;
            ofFloat.setDuration(j3);
            long j10 = ks.K2;
            ofFloat.setStartDelay(j10);
            ofFloat.start();
            ValueAnimator ofInt = ValueAnimator.ofInt(0, ks.e4, ks.e4);
            ofInt.setInterpolator(kr.f);
            ofInt.addUpdateListener(new h3(this, i12));
            ofInt.setStartDelay(j10);
            ofInt.setDuration(j3);
            ofInt.start();
        }
    }
}
