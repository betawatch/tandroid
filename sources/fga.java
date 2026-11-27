// default package

import android.content.Context;
import android.graphics.Rect;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class fga extends gv8 {
    public final /* synthetic */ eja x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fga(eja ejaVar, Context context, q5b q5bVar, ega egaVar) {
        super(context, q5bVar, egaVar);
        this.x = ejaVar;
    }

    @Override // gv8
    public final void b() {
        jga jgaVar;
        int measuredWidth = getMeasuredWidth();
        int visualHeight = (int) getVisualHeight();
        Rect rect = this.s;
        rect.set(0, 0, measuredWidth, visualHeight);
        setClipBounds(rect);
        invalidate();
        eja ejaVar = this.x;
        zha[] zhaVarArr = ejaVar.n0;
        if (zhaVarArr != null) {
            for (zha zhaVar : zhaVarArr) {
                if (zhaVar != null && (jgaVar = zhaVar.h) != null) {
                    int paddingTop = jgaVar.getPaddingTop();
                    jga jgaVar2 = zhaVar.h;
                    int paddingLeft = jgaVar2.getPaddingLeft();
                    int T = ejaVar.T(zhaVar.F);
                    int paddingRight = zhaVar.h.getPaddingRight();
                    jga jgaVar3 = zhaVar.h;
                    int S = ejaVar.S(ejaVar.s0());
                    jgaVar3.i3 = S;
                    jgaVar2.setPadding(paddingLeft, T, paddingRight, S);
                    int paddingTop2 = paddingTop - zhaVar.h.getPaddingTop();
                    if (paddingTop2 != 0) {
                        hl.J(zhaVar.h, new jfa(zhaVar, paddingTop2, (byte) 2));
                    }
                }
                if (zhaVar != null && zhaVar.s != null) {
                    ejaVar.I1(zhaVar);
                }
            }
        }
        xj3 xj3Var = ejaVar.S0;
        if (xj3Var != null) {
            xj3Var.setTranslationY(ejaVar.O1);
        }
    }
}
