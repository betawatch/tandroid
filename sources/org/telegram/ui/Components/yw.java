package org.telegram.ui.Components;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class yw extends f2.w {
    public final /* synthetic */ yy c;

    public yw(yy yyVar) {
        this.c = yyVar;
    }

    @Override // f2.w
    public final int i(int i10) {
        yy yyVar = this.c;
        gx gxVar = yyVar.N;
        xw xwVar = yyVar.M;
        f2.q0 adapter = yyVar.L.getAdapter();
        wx wxVar = yyVar.O;
        if (adapter == wxVar) {
            int j10 = wxVar.j(i10);
            if (j10 == 1 || j10 == 3 || j10 == 2 || j10 == 4 || j10 == 5) {
                return xwVar.J;
            }
        } else if ((yyVar.W && i10 == 0) || i10 == gxVar.d || i10 == gxVar.c || i10 == gxVar.f || gxVar.r.indexOfKey(i10) >= 0 || gxVar.v.indexOfKey(i10) >= 0) {
            return xwVar.J;
        }
        return 1;
    }
}
