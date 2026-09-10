package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.n5;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.wr;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class o3 {
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
    public final z2 k;
    public final int l;
    public int m = 0;
    public float n = 0.0f;
    public int o;
    public int p;
    public boolean q;
    public ValueAnimator r;

    public o3(TLRPC.User user, z2 z2Var, int i10) {
        this.k = z2Var;
        this.l = i10;
        boolean isEnabled = LiteMode.isEnabled(512);
        long profileEmojiId = UserObject.getProfileEmojiId(user);
        if (!isEnabled || profileEmojiId == 0) {
            return;
        }
        n5 n5Var = new n5(i10, 13, z2Var, false);
        this.a = n5Var;
        n5Var.j(profileEmojiId, false);
        n5Var.k(-16777216);
        n5Var.v = this.m;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.b = ofFloat;
        ofFloat.addUpdateListener(new gg.t1(18, this, z2Var));
        this.e = AndroidUtilities.dp(12.0f) + this.c;
        this.f = AndroidUtilities.dp(12.0f) + this.d;
        this.c = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
        this.d = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
        this.b.setInterpolator(new LinearInterpolator());
        this.b.addListener(new n3(this));
        this.b.setDuration(2000L);
    }

    public final void a(Canvas canvas) {
        n5 n5Var = this.a;
        if (n5Var == null) {
            return;
        }
        canvas.save();
        float f7 = this.n;
        canvas.scale(f7, f7, this.o / 2.0f, AndroidUtilities.dp(300.0f));
        canvas.translate(this.i - this.p, this.j);
        int i10 = this.g;
        int i11 = this.h;
        int i12 = this.l;
        n5Var.setBounds(i10, i11, i10 + i12, i12 + i11);
        n5Var.v = this.m;
        n5Var.draw(canvas);
        canvas.restore();
    }

    public final void b(int i10, int i11) {
        gg.h1 h1Var;
        n5 n5Var = this.a;
        if (n5Var == null) {
            return;
        }
        this.i = i10;
        this.j = i11;
        this.k.invalidate();
        if (this.q) {
            return;
        }
        int i12 = 0;
        Drawable drawable = n5Var.f[0];
        if (!(drawable instanceof p5) || ((h1Var = ((p5) drawable).k) != null && h1Var.hasImageLoaded())) {
            int i13 = 1;
            this.q = true;
            this.p = this.i > this.o / 2 ? AndroidUtilities.dp(12) : -AndroidUtilities.dp(12);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setInterpolator(new wr(0.34d, 1.36d, 0.64d, 1.0d));
            ofFloat.addUpdateListener(new m3(this, i12));
            long j3 = 350;
            ofFloat.setDuration(j3);
            long j10 = 180;
            ofFloat.setStartDelay(j10);
            ofFloat.start();
            ValueAnimator ofInt = ValueAnimator.ofInt(0, 255, 255);
            ofInt.setInterpolator(wr.f);
            ofInt.addUpdateListener(new m3(this, i13));
            ofInt.setStartDelay(j10);
            ofInt.setDuration(j3);
            ofInt.start();
        }
    }
}
