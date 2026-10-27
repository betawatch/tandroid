package fi;

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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class i2 extends g2 {
    public bh.n0 i;
    public bh.n0 j;
    public int k;
    public final org.telegram.ui.Components.h6 l;
    public Timer m;
    public final di.e9 n;
    public final ArrayList o;
    public final /* synthetic */ j2 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(j2 j2Var) {
        super(j2Var);
        int i10;
        this.p = j2Var;
        this.i = new bh.n0(j2Var);
        this.j = new bh.n0(j2Var);
        this.l = new org.telegram.ui.Components.h6(j2Var);
        this.n = new di.e9(j2Var);
        this.o = new ArrayList();
        this.a = 3;
        this.b = AndroidUtilities.dp(44.0f);
        this.c = AndroidUtilities.dp(36.0f);
        i10 = ((org.telegram.ui.ActionBar.k3) j2Var.f).currentAccount;
        List<TLRPC.TL_availableReaction> reactionsList = MediaDataController.getInstance(i10).getReactionsList();
        for (int i11 = 0; i11 < Math.min(reactionsList.size(), 8); i11++) {
            this.o.add(bh.x0.c(reactionsList.get(i11)));
        }
        Collections.sort(this.o, new a4.d(16));
        if (!this.o.isEmpty()) {
            this.i.e((bh.x0) this.o.get(this.k));
        }
        this.l.d(1.0f, true);
    }

    @Override // fi.g2
    public final void a(Canvas canvas, float f7, float f10) {
        float dp = f10 - AndroidUtilities.dp(4.0f);
        float f11 = (int) f7;
        float f12 = (int) dp;
        float f13 = this.b;
        float f14 = (int) (f7 + f13);
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
        di.e9 e9Var = this.n;
        e9Var.setBounds(i10, i11, i12, i13);
        e9Var.draw(canvas);
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
            bh.n0 n0Var = this.j;
            n0Var.h = f17;
            n0Var.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(d, d, rectF.centerX(), rectF.bottom);
            bh.n0 n0Var2 = this.i;
            n0Var2.h = d;
            n0Var2.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // fi.g2
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
            timer2.schedule(new f6.r(this, 1), 2000L, 2000L);
        }
    }
}
