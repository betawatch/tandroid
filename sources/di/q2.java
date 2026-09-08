package di;

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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class q2 extends n2 {
    public ah.z0 i;
    public ah.z0 j;
    public int k;
    public final org.telegram.ui.Components.e6 l;
    public Timer m;
    public final bi.va n;
    public final ArrayList o;
    public final /* synthetic */ r2 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(r2 r2Var) {
        super(r2Var);
        int i10;
        this.p = r2Var;
        this.i = new ah.z0(r2Var);
        this.j = new ah.z0(r2Var);
        this.l = new org.telegram.ui.Components.e6(r2Var);
        this.n = new bi.va(r2Var);
        this.o = new ArrayList();
        this.a = 3;
        this.b = AndroidUtilities.dp(44.0f);
        this.c = AndroidUtilities.dp(36.0f);
        i10 = ((org.telegram.ui.ActionBar.f3) r2Var.f).currentAccount;
        List<TLRPC.TL_availableReaction> reactionsList = MediaDataController.getInstance(i10).getReactionsList();
        for (int i11 = 0; i11 < Math.min(reactionsList.size(), 8); i11++) {
            this.o.add(ah.j1.c(reactionsList.get(i11)));
        }
        Collections.sort(this.o, new a4.e(12));
        if (!this.o.isEmpty()) {
            this.i.e((ah.j1) this.o.get(this.k));
        }
        this.l.d(1.0f, true);
    }

    @Override // di.n2
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
        bi.va vaVar = this.n;
        vaVar.setBounds(i10, i11, i12, i13);
        vaVar.draw(canvas);
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
            ah.z0 z0Var = this.j;
            z0Var.h = f17;
            z0Var.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(d, d, rectF.centerX(), rectF.bottom);
            ah.z0 z0Var2 = this.i;
            z0Var2.h = d;
            z0Var2.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // di.n2
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
            timer2.schedule(new p2(this, 0), 2000L, 2000L);
        }
    }
}
