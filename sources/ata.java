// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ata extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ q38 b;
    public final /* synthetic */ wua c;

    /* JADX WARN: Multi-variable type inference failed */
    public ata(wua wuaVar, int i, q38 q38Var) {
        this.c = wuaVar;
        this.a = i;
        this.b = q38Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        wua wuaVar = this.c;
        wuaVar.P1();
        gta gtaVar = wuaVar.b2;
        byte b = this.a;
        gtaVar.setVisibility(b == 0 ? 0 : 8);
        wuaVar.n2.setVisibility(b == 1 ? 0 : 8);
        wuaVar.w2.setVisibility(b == 2 ? 0 : 8);
        wuaVar.y2.setVisibility(b == 3 ? 0 : 8);
        wuaVar.C2();
        wuaVar.X2 = null;
        q38 q38Var = this.b;
        if (q38Var != null) {
            q38Var.run();
        }
    }
}
