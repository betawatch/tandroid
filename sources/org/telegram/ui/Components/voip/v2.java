package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.h20;
import org.telegram.messenger.sc;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class v2 {
    public final d5 a;
    public ValueAnimator b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public final f2 k;
    public final int l;
    public int m = 0;
    public float n = 0.0f;
    public int o;
    public int p;
    public boolean q;
    public ValueAnimator r;

    public v2(TLRPC.User user, f2 f2Var, int i10) {
        this.k = f2Var;
        this.l = i10;
        boolean e = sc.e(512);
        long m10 = h20.m(user);
        if (!e || m10 == 0) {
            return;
        }
        d5 d5Var = new d5(i10, 13, f2Var, false);
        this.a = d5Var;
        d5Var.j(m10, false);
        d5Var.k(-16777216);
        d5Var.w = this.m;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.b = ofFloat;
        ofFloat.addUpdateListener(new ag.p2(20, this, f2Var));
        this.e = org.telegram.messenger.i0.L(12.0f) + this.c;
        this.f = org.telegram.messenger.i0.L(12.0f) + this.d;
        SecureRandom secureRandom = Utilities.b;
        this.c = org.telegram.messenger.i0.L(12.0f) + secureRandom.nextInt(org.telegram.messenger.i0.L(16.0f));
        this.d = org.telegram.messenger.i0.L(12.0f) + secureRandom.nextInt(org.telegram.messenger.i0.L(16.0f));
        this.b.setInterpolator(new LinearInterpolator());
        this.b.addListener(new u2(this));
        this.b.setDuration(2000L);
    }

    public final void a(Canvas canvas) {
        d5 d5Var = this.a;
        if (d5Var == null) {
            return;
        }
        canvas.save();
        float f7 = this.n;
        canvas.scale(f7, f7, this.o / 2.0f, org.telegram.messenger.i0.L(300.0f));
        canvas.translate(this.i - this.p, this.j);
        int i10 = this.g;
        int i11 = this.h;
        int i12 = this.l;
        d5Var.setBounds(i10, i11, i10 + i12, i12 + i11);
        d5Var.w = this.m;
        d5Var.draw(canvas);
        canvas.restore();
    }

    public final void b(int i10, int i11) {
        ag.c2 c2Var;
        d5 d5Var = this.a;
        if (d5Var == null) {
            return;
        }
        this.i = i10;
        this.j = i11;
        this.k.invalidate();
        if (this.q) {
            return;
        }
        int i12 = 0;
        Drawable drawable = d5Var.f[0];
        if (!(drawable instanceof f5) || ((c2Var = ((f5) drawable).k) != null && c2Var.J())) {
            int i13 = 1;
            this.q = true;
            this.p = this.i > this.o / 2 ? org.telegram.messenger.i0.L(12) : -org.telegram.messenger.i0.L(12);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setInterpolator(new gr(0.34d, 1.36d, 0.64d, 1.0d));
            ofFloat.addUpdateListener(new t2(this, i12));
            long j10 = 350;
            ofFloat.setDuration(j10);
            long j11 = zs.K2;
            ofFloat.setStartDelay(j11);
            ofFloat.start();
            ValueAnimator ofInt = ValueAnimator.ofInt(0, zs.e4, zs.e4);
            ofInt.setInterpolator(gr.f);
            ofInt.addUpdateListener(new t2(this, i13));
            ofInt.setStartDelay(j11);
            ofInt.setDuration(j10);
            ofInt.start();
        }
    }
}
