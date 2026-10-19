package org.telegram.ui.Components;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class sx extends g.o {
    public final /* synthetic */ tz c;

    public sx(tz tzVar) {
        this.c = tzVar;
    }

    @Override // g.o
    public final int i(int i10) {
        tz tzVar = this.c;
        ay ayVar = tzVar.R;
        rx rxVar = tzVar.Q;
        s4.g0 adapter = tzVar.P.getAdapter();
        ty tyVar = tzVar.S;
        if (adapter == tyVar) {
            int j10 = tyVar.j(i10);
            if (j10 == 1 || j10 == 3 || j10 == 2 || j10 == 4 || j10 == 5) {
                return rxVar.J;
            }
        } else if ((tzVar.d0 && i10 == 0) || i10 == ayVar.d || i10 == ayVar.c || i10 == ayVar.f || ayVar.r.indexOfKey(i10) >= 0 || ayVar.v.indexOfKey(i10) >= 0) {
            return rxVar.J;
        }
        return 1;
    }
}
