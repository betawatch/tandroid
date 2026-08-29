package nh;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Timer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class h2 extends e2 {
    public kg.h0 i;
    public kg.h0 j;
    public int k;
    public final org.telegram.ui.Components.d6 l;
    public Timer m;
    public final lh.o8 n;
    public final ArrayList o;
    public final /* synthetic */ i2 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(i2 i2Var) {
        super(i2Var);
        int i10;
        this.p = i2Var;
        this.i = new kg.h0(i2Var);
        this.j = new kg.h0(i2Var);
        this.l = new org.telegram.ui.Components.d6(i2Var);
        this.n = new lh.o8(i2Var);
        this.o = new ArrayList();
        this.a = 3;
        this.b = AndroidUtilities.dp(44.0f);
        this.c = AndroidUtilities.dp(36.0f);
        i10 = ((org.telegram.ui.ActionBar.f3) i2Var.f).currentAccount;
        List<TLRPC.TL_availableReaction> reactionsList = MediaDataController.getInstance(i10).getReactionsList();
        for (int i11 = 0; i11 < Math.min(reactionsList.size(), 8); i11++) {
            this.o.add(kg.q0.c(reactionsList.get(i11)));
        }
        Collections.sort(this.o, new lh.e4(2));
        if (!this.o.isEmpty()) {
            this.i.e((kg.q0) this.o.get(this.k));
        }
        this.l.d(1.0f, true);
    }

    @Override // nh.e2
    public final void a(Canvas canvas, float f9, float f10) {
        float dp = f10 - AndroidUtilities.dp(4.0f);
        float f11 = (int) f9;
        float f12 = (int) dp;
        float f13 = this.b;
        float f14 = (int) (f9 + f13);
        float f15 = (int) (dp + f13);
        RectF rectF = this.f;
        rectF.set(f11, f12, f14, f15);
        float a2 = this.g.a(0.05f);
        canvas.save();
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        int i10 = (int) rectF.left;
        int i11 = (int) rectF.top;
        int i12 = (int) rectF.right;
        int i13 = (int) rectF.bottom;
        lh.o8 o8Var = this.n;
        o8Var.setBounds(i10, i11, i12, i13);
        o8Var.draw(canvas);
        float dp2 = AndroidUtilities.dp(30.0f);
        Rect rect = AndroidUtilities.rectTmp2;
        float f16 = dp2 / 2.0f;
        rect.set((int) (rectF.centerX() - f16), (int) (rectF.centerY() - f16), (int) (rectF.centerX() + f16), (int) (rectF.centerY() + f16));
        float d = this.l.d(1.0f, false);
        this.j.c(rect);
        this.i.c(rect);
        if (d == 1.0f) {
            this.i.a(canvas);
        } else {
            canvas.save();
            float f17 = 1.0f - d;
            canvas.scale(f17, f17, rectF.centerX(), rectF.top);
            kg.h0 h0Var = this.j;
            h0Var.h = f17;
            h0Var.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(d, d, rectF.centerX(), rectF.bottom);
            kg.h0 h0Var2 = this.i;
            h0Var2.h = d;
            h0Var2.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // nh.e2
    public final void b(boolean z10) {
        this.i.b(z10);
        this.j.b(z10);
        Timer timer = this.m;
        if (timer != null) {
            timer.cancel();
            this.m = null;
        }
        if (z10) {
            Timer timer2 = new Timer();
            this.m = timer2;
            timer2.schedule(new g2(this, 0), 2000L, 2000L);
        }
    }
}
