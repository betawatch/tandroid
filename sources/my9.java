// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class my9 implements i59 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ ylb c;
    public final /* synthetic */ Integer d;
    public final /* synthetic */ vz9 e;

    public my9(vz9 vz9Var, int i, Context context, ylb ylbVar, Integer num) {
        this.e = vz9Var;
        this.a = i;
        this.b = context;
        this.c = ylbVar;
        this.d = num;
    }

    @Override // i59
    public final boolean d(float f, float f2, int i, View view) {
        vz9 vz9Var = this.e;
        int i2 = vz9Var.W;
        int i3 = this.a;
        if (i3 != 11 && i3 != 13 && vz9Var.i1 && (view instanceof fz9)) {
            if (i3 == 1 || i3 == 8) {
                vz9Var.k();
                try {
                    vz9Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                fz9 fz9Var = (fz9) view;
                if (!fz9Var.s && !z8c.h(i2).p()) {
                    gn gnVar = fz9Var.e;
                    TLRPC.Document document = gnVar.document;
                    if (document == null) {
                        document = vm.e(i2, gnVar.documentId);
                    }
                    vz9Var.o(fz9Var, Long.valueOf(fz9Var.e.documentId), document, fz9Var.w, null);
                    return true;
                }
                vz9Var.T0 = fz9Var;
                vz9Var.V0 = 0.0f;
                vz9Var.U0 = false;
                if (fz9Var.s) {
                    vz9Var.setBigReactionAnimatedEmoji(null);
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hs6.d0(i2).r.get(vz9Var.T0.y.f);
                    if (tL_availableReaction != null) {
                        vz9Var.W0.Z(gn5.b(tL_availableReaction.select_animation), "60_60_pcache", null, null, null, 0L, "tgs", vz9Var.T0.y, 0);
                    }
                } else {
                    vz9Var.setBigReactionAnimatedEmoji(new vm(4, i2, vz9Var.T0.e.documentId));
                }
                vz9Var.i0.invalidate();
                vz9Var.l();
                return true;
            }
            fz9 fz9Var2 = (fz9) view;
            if (fz9Var2.e != null && (i3 == 0 || i3 == 12 || i3 == 9 || i3 == 10)) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = fz9Var2.w;
                ly9 ly9Var = new ly9(this, this.b, vz9Var.V1, vz9Var, fz9Var2, this.c, view, tL_starGiftUnique);
                vz9Var.Y0 = ly9Var;
                ly9Var.show();
                try {
                    view.performHapticFeedback(0, 1);
                } catch (Exception unused2) {
                }
                return true;
            }
        }
        return false;
    }

    @Override // i59
    public final void i() {
        vz9 vz9Var = this.e;
        if (vz9Var.T0 != null) {
            vz9Var.U0 = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(vz9Var.V0, 0.0f);
            ofFloat.addUpdateListener(new p29(this, (byte) 18));
            ofFloat.addListener(new c39((Object) this, (byte) 9));
            ofFloat.setDuration(150L);
            ofFloat.setInterpolator(d53.f);
            ofFloat.start();
        }
    }

    @Override // i59
    public final void k(float f) {
    }
}
