package org.telegram.ui;

import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    org.telegram.messenger.g0.i3(new ai.w0(this, this.e, 22), 240L);
                    break;
                }
                break;
            default:
                if (!z10) {
                    org.telegram.messenger.g0.i3(new ai.w0(this, this.e, 25), 240L);
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
                anVar.Zb = i7;
                anVar.ac = 1;
                anVar.bc = (CharacterStyle) this.h;
                this.f.invalidate();
                break;
            default:
                int i10 = this.e;
                an anVar2 = this.g;
                anVar2.Zb = i10;
                anVar2.ac = 3;
                anVar2.cc = (String) this.h;
                this.f.invalidate();
                break;
        }
    }
}
