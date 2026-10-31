package org.telegram.ui;

import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class aj extends gf.e {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Cells.q1 f;
    public final /* synthetic */ un g;
    public final /* synthetic */ Object h;

    public /* synthetic */ aj(un unVar, int i10, Object obj, org.telegram.ui.Cells.q1 q1Var, int i11) {
        this.d = i11;
        this.g = unVar;
        this.e = i10;
        this.h = obj;
        this.f = q1Var;
    }

    @Override // gf.e
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    org.telegram.messenger.i0.h3(new ag.d3(this, this.e, 17), 240L);
                    break;
                }
                break;
            default:
                if (!z10) {
                    org.telegram.messenger.i0.h3(new ag.d3(this, this.e, 19), 240L);
                    break;
                }
                break;
        }
    }

    @Override // gf.e
    public final void d() {
        switch (this.d) {
            case 0:
                int i10 = this.e;
                un unVar = this.g;
                unVar.Rb = i10;
                unVar.Sb = 1;
                unVar.Tb = (CharacterStyle) this.h;
                this.f.invalidate();
                break;
            default:
                int i11 = this.e;
                un unVar2 = this.g;
                unVar2.Rb = i11;
                unVar2.Sb = 3;
                unVar2.Ub = (String) this.h;
                this.f.invalidate();
                break;
        }
    }
}
