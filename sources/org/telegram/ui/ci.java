package org.telegram.ui;

import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ci extends sf.b {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Cells.q1 f;
    public final /* synthetic */ wm g;
    public final /* synthetic */ Object h;

    public /* synthetic */ ci(wm wmVar, int i3, Object obj, org.telegram.ui.Cells.q1 q1Var, int i10) {
        this.d = i10;
        this.g = wmVar;
        this.e = i3;
        this.h = obj;
        this.f = q1Var;
    }

    @Override // sf.b
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    org.telegram.messenger.g0.i3(new cg.l0(this, this.e, 21), 240L);
                    break;
                }
                break;
            default:
                if (!z10) {
                    org.telegram.messenger.g0.i3(new cg.l0(this, this.e, 24), 240L);
                    break;
                }
                break;
        }
    }

    @Override // sf.b
    public final void d() {
        switch (this.d) {
            case 0:
                int i3 = this.e;
                wm wmVar = this.g;
                wmVar.Xb = i3;
                wmVar.Yb = 1;
                wmVar.Zb = (CharacterStyle) this.h;
                this.f.invalidate();
                break;
            default:
                int i10 = this.e;
                wm wmVar2 = this.g;
                wmVar2.Xb = i10;
                wmVar2.Yb = 3;
                wmVar2.ac = (String) this.h;
                this.f.invalidate();
                break;
        }
    }
}
