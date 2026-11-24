// default package

import android.content.Context;
import android.graphics.Rect;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class oea extends yt8 {
    public final /* synthetic */ nha x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oea(nha nhaVar, Context context, v3b v3bVar, nea neaVar) {
        super(context, v3bVar, neaVar);
        this.x = nhaVar;
    }

    @Override // yt8
    public final void b() {
        sea seaVar;
        int measuredWidth = getMeasuredWidth();
        int visualHeight = (int) getVisualHeight();
        Rect rect = this.s;
        rect.set(0, 0, measuredWidth, visualHeight);
        setClipBounds(rect);
        invalidate();
        nha nhaVar = this.x;
        iga[] igaVarArr = nhaVar.n0;
        if (igaVarArr != null) {
            for (iga igaVar : igaVarArr) {
                if (igaVar != null && (seaVar = igaVar.h) != null) {
                    int paddingTop = seaVar.getPaddingTop();
                    sea seaVar2 = igaVar.h;
                    int paddingLeft = seaVar2.getPaddingLeft();
                    int T = nhaVar.T(igaVar.F);
                    int paddingRight = igaVar.h.getPaddingRight();
                    sea seaVar3 = igaVar.h;
                    int S = nhaVar.S(nhaVar.s0());
                    seaVar3.i3 = S;
                    seaVar2.setPadding(paddingLeft, T, paddingRight, S);
                    int paddingTop2 = paddingTop - igaVar.h.getPaddingTop();
                    if (paddingTop2 != 0) {
                        gm.J(igaVar.h, new xda(igaVar, paddingTop2, (byte) 2));
                    }
                }
                if (igaVar != null && igaVar.s != null) {
                    nhaVar.I1(igaVar);
                }
            }
        }
        qk3 qk3Var = nhaVar.S0;
        if (qk3Var != null) {
            qk3Var.setTranslationY(nhaVar.O1);
        }
    }
}
