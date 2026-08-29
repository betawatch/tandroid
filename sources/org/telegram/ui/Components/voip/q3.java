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
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.n5;
import org.telegram.ui.Components.p5;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class q3 {
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
    public final b3 k;
    public final int l;
    public int m = 0;
    public float n = 0.0f;
    public int o;
    public int p;
    public boolean q;
    public ValueAnimator r;

    public q3(TLRPC.User user, b3 b3Var, int i10) {
        this.k = b3Var;
        this.l = i10;
        boolean isEnabled = LiteMode.isEnabled(512);
        long profileEmojiId = UserObject.getProfileEmojiId(user);
        if (!isEnabled || profileEmojiId == 0) {
            return;
        }
        n5 n5Var = new n5(i10, 13, b3Var, false);
        this.a = n5Var;
        n5Var.j(profileEmojiId, false);
        n5Var.k(-16777216);
        n5Var.v = this.m;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.b = ofFloat;
        ofFloat.addUpdateListener(new bg.b3(18, this, b3Var));
        this.e = AndroidUtilities.dp(12.0f) + this.c;
        this.f = AndroidUtilities.dp(12.0f) + this.d;
        this.c = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
        this.d = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
        this.b.setInterpolator(new LinearInterpolator());
        this.b.addListener(new p3(this));
        this.b.setDuration(2000L);
    }

    public final void a(Canvas canvas) {
        n5 n5Var = this.a;
        if (n5Var == null) {
            return;
        }
        canvas.save();
        float f9 = this.n;
        canvas.scale(f9, f9, this.o / 2.0f, AndroidUtilities.dp(300.0f));
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
        lh.x2 x2Var;
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
        if (!(drawable instanceof p5) || ((x2Var = ((p5) drawable).k) != null && x2Var.hasImageLoaded())) {
            int i13 = 1;
            this.q = true;
            this.p = this.i > this.o / 2 ? AndroidUtilities.dp(12) : -AndroidUtilities.dp(12);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setInterpolator(new jr(0.34d, 1.36d, 0.64d, 1.0d));
            ofFloat.addUpdateListener(new o3(this, i12));
            long j10 = 350;
            ofFloat.setDuration(j10);
            long j11 = 180;
            ofFloat.setStartDelay(j11);
            ofFloat.start();
            ValueAnimator ofInt = ValueAnimator.ofInt(0, 255, 255);
            ofInt.setInterpolator(jr.f);
            ofInt.addUpdateListener(new o3(this, i13));
            ofInt.setStartDelay(j11);
            ofInt.setDuration(j10);
            ofInt.start();
        }
    }
}
