package kh;

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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class k2 extends h2 {
    public hg.i0 i;
    public hg.i0 j;
    public int k;
    public final org.telegram.ui.Components.y5 l;
    public Timer m;
    public final ih.s8 n;
    public final ArrayList o;
    public final /* synthetic */ l2 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(l2 l2Var) {
        super(l2Var);
        int i9;
        this.p = l2Var;
        this.i = new hg.i0(l2Var);
        this.j = new hg.i0(l2Var);
        this.l = new org.telegram.ui.Components.y5(l2Var);
        this.n = new ih.s8(l2Var);
        this.o = new ArrayList();
        this.a = 3;
        this.b = AndroidUtilities.dp(44.0f);
        this.c = AndroidUtilities.dp(36.0f);
        i9 = ((org.telegram.ui.ActionBar.f3) l2Var.f).currentAccount;
        List<TLRPC.TL_availableReaction> reactionsList = MediaDataController.getInstance(i9).getReactionsList();
        for (int i10 = 0; i10 < Math.min(reactionsList.size(), 8); i10++) {
            this.o.add(hg.r0.c(reactionsList.get(i10)));
        }
        Collections.sort(this.o, new j9.a(1));
        if (!this.o.isEmpty()) {
            this.i.e((hg.r0) this.o.get(this.k));
        }
        this.l.d(1.0f, true);
    }

    @Override // kh.h2
    public final void a(Canvas canvas, float f10, float f11) {
        float dp = f11 - AndroidUtilities.dp(4.0f);
        float f12 = (int) f10;
        float f13 = (int) dp;
        float f14 = this.b;
        float f15 = (int) (f10 + f14);
        float f16 = (int) (dp + f14);
        RectF rectF = this.f;
        rectF.set(f12, f13, f15, f16);
        float a2 = this.g.a(0.05f);
        canvas.save();
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        int i9 = (int) rectF.left;
        int i10 = (int) rectF.top;
        int i11 = (int) rectF.right;
        int i12 = (int) rectF.bottom;
        ih.s8 s8Var = this.n;
        s8Var.setBounds(i9, i10, i11, i12);
        s8Var.draw(canvas);
        float dp2 = AndroidUtilities.dp(30.0f);
        Rect rect = AndroidUtilities.rectTmp2;
        float f17 = dp2 / 2.0f;
        rect.set((int) (rectF.centerX() - f17), (int) (rectF.centerY() - f17), (int) (rectF.centerX() + f17), (int) (rectF.centerY() + f17));
        float d = this.l.d(1.0f, false);
        this.j.c(rect);
        this.i.c(rect);
        if (d == 1.0f) {
            this.i.a(canvas);
        } else {
            canvas.save();
            float f18 = 1.0f - d;
            canvas.scale(f18, f18, rectF.centerX(), rectF.top);
            hg.i0 i0Var = this.j;
            i0Var.h = f18;
            i0Var.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(d, d, rectF.centerX(), rectF.bottom);
            hg.i0 i0Var2 = this.i;
            i0Var2.h = d;
            i0Var2.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // kh.h2
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
            timer2.schedule(new j2(this, 0), 2000L, 2000L);
        }
    }
}
