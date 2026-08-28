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
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.i5;
import org.telegram.ui.Components.k5;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class n3 {
    public final i5 a;
    public ValueAnimator b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public final y2 k;
    public final int l;
    public int m = 0;
    public float n = 0.0f;
    public int o;
    public int p;
    public boolean q;
    public ValueAnimator r;

    public n3(TLRPC.User user, y2 y2Var, int i9) {
        this.k = y2Var;
        this.l = i9;
        boolean isEnabled = LiteMode.isEnabled(512);
        long profileEmojiId = UserObject.getProfileEmojiId(user);
        if (!isEnabled || profileEmojiId == 0) {
            return;
        }
        i5 i5Var = new i5(i9, 13, y2Var, false);
        this.a = i5Var;
        i5Var.j(profileEmojiId, false);
        i5Var.k(-16777216);
        i5Var.v = this.m;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.b = ofFloat;
        ofFloat.addUpdateListener(new f2.g(16, this, y2Var));
        this.e = AndroidUtilities.dp(12.0f) + this.c;
        this.f = AndroidUtilities.dp(12.0f) + this.d;
        this.c = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
        this.d = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
        this.b.setInterpolator(new LinearInterpolator());
        this.b.addListener(new m3(this));
        this.b.setDuration(2000L);
    }

    public final void a(Canvas canvas) {
        i5 i5Var = this.a;
        if (i5Var == null) {
            return;
        }
        canvas.save();
        float f10 = this.n;
        canvas.scale(f10, f10, this.o / 2.0f, AndroidUtilities.dp(300.0f));
        canvas.translate(this.i - this.p, this.j);
        int i9 = this.g;
        int i10 = this.h;
        int i11 = this.l;
        i5Var.setBounds(i9, i10, i9 + i11, i11 + i10);
        i5Var.v = this.m;
        i5Var.draw(canvas);
        canvas.restore();
    }

    public final void b(int i9, int i10) {
        ih.z2 z2Var;
        i5 i5Var = this.a;
        if (i5Var == null) {
            return;
        }
        this.i = i9;
        this.j = i10;
        this.k.invalidate();
        if (this.q) {
            return;
        }
        int i11 = 0;
        Drawable drawable = i5Var.f[0];
        if (!(drawable instanceof k5) || ((z2Var = ((k5) drawable).k) != null && z2Var.hasImageLoaded())) {
            int i12 = 1;
            this.q = true;
            this.p = this.i > this.o / 2 ? AndroidUtilities.dp(12) : -AndroidUtilities.dp(12);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setInterpolator(new gr(0.34d, 1.36d, 0.64d, 1.0d));
            ofFloat.addUpdateListener(new l3(this, i11));
            long j10 = 350;
            ofFloat.setDuration(j10);
            long j11 = 180;
            ofFloat.setStartDelay(j11);
            ofFloat.start();
            ValueAnimator ofInt = ValueAnimator.ofInt(0, 255, 255);
            ofInt.setInterpolator(gr.f);
            ofInt.addUpdateListener(new l3(this, i12));
            ofInt.setStartDelay(j11);
            ofInt.setDuration(j10);
            ofInt.start();
        }
    }
}
