package org.telegram.ui;

import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class gi extends vf.b {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Cells.r1 f;
    public final /* synthetic */ bn g;
    public final /* synthetic */ Object h;

    public /* synthetic */ gi(bn bnVar, int i7, Object obj, org.telegram.ui.Cells.r1 r1Var, int i10) {
        this.d = i10;
        this.g = bnVar;
        this.e = i7;
        this.h = obj;
        this.f = r1Var;
    }

    @Override // vf.b
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    org.telegram.messenger.g0.h3(new ai.y0(this, this.e, 25), 240L);
                    break;
                }
                break;
            default:
                if (!z10) {
                    org.telegram.messenger.g0.h3(new ai.y0(this, this.e, 28), 240L);
                    break;
                }
                break;
        }
    }

    @Override // vf.b
    public final void d() {
        switch (this.d) {
            case 0:
                int i7 = this.e;
                bn bnVar = this.g;
                bnVar.ac = i7;
                bnVar.bc = 1;
                bnVar.cc = (CharacterStyle) this.h;
                this.f.invalidate();
                break;
            default:
                int i10 = this.e;
                bn bnVar2 = this.g;
                bnVar2.ac = i10;
                bnVar2.bc = 3;
                bnVar2.dc = (String) this.h;
                this.f.invalidate();
                break;
        }
    }
}
