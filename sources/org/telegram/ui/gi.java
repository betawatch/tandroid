package org.telegram.ui;

import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class gi extends vf.b {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Cells.q1 f;
    public final /* synthetic */ an g;
    public final /* synthetic */ Object h;

    public /* synthetic */ gi(an anVar, int i7, Object obj, org.telegram.ui.Cells.q1 q1Var, int i10) {
        this.d = i10;
        this.g = anVar;
        this.e = i7;
        this.h = obj;
        this.f = q1Var;
    }

    @Override // vf.b
    public final void c(boolean z9) {
        switch (this.d) {
            case 0:
                if (!z9) {
                    org.telegram.messenger.g0.i3(new bg.m0(this, this.e, 21), 240L);
                    break;
                }
                break;
            default:
                if (!z9) {
                    org.telegram.messenger.g0.i3(new bg.m0(this, this.e, 24), 240L);
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
                an anVar = this.g;
                anVar.Wb = i7;
                anVar.Xb = 1;
                anVar.Yb = (CharacterStyle) this.h;
                this.f.invalidate();
                break;
            default:
                int i10 = this.e;
                an anVar2 = this.g;
                anVar2.Wb = i10;
                anVar2.Xb = 3;
                anVar2.Zb = (String) this.h;
                this.f.invalidate();
                break;
        }
    }
}
