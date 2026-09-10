package bi;

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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class c3 extends z2 {
    public yg.g0 i;
    public yg.g0 j;
    public int k;
    public final org.telegram.ui.Components.d6 l;
    public Timer m;
    public final zh.a7 n;
    public final ArrayList o;
    public final /* synthetic */ d3 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(d3 d3Var) {
        super(d3Var);
        int i10;
        this.p = d3Var;
        this.i = new yg.g0(d3Var);
        this.j = new yg.g0(d3Var);
        this.l = new org.telegram.ui.Components.d6(d3Var);
        this.n = new zh.a7(d3Var);
        this.o = new ArrayList();
        this.a = 3;
        this.b = AndroidUtilities.dp(44.0f);
        this.c = AndroidUtilities.dp(36.0f);
        i10 = ((org.telegram.ui.ActionBar.h3) d3Var.f).currentAccount;
        List<TLRPC.TL_availableReaction> reactionsList = MediaDataController.getInstance(i10).getReactionsList();
        for (int i11 = 0; i11 < Math.min(reactionsList.size(), 8); i11++) {
            this.o.add(yg.p0.c(reactionsList.get(i11)));
        }
        Collections.sort(this.o, new a4.e(3));
        if (!this.o.isEmpty()) {
            this.i.e((yg.p0) this.o.get(this.k));
        }
        this.l.d(1.0f, true);
    }

    @Override // bi.z2
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
        zh.a7 a7Var = this.n;
        a7Var.setBounds(i10, i11, i12, i13);
        a7Var.draw(canvas);
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
            yg.g0 g0Var = this.j;
            g0Var.h = f17;
            g0Var.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(d, d, rectF.centerX(), rectF.bottom);
            yg.g0 g0Var2 = this.i;
            g0Var2.h = d;
            g0Var2.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // bi.z2
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
            timer2.schedule(new b3(this, 0), 2000L, 2000L);
        }
    }
}
