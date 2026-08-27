package org.telegram.ui;

import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class pi extends we.d {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Cells.s1 f;
    public final /* synthetic */ rn g;
    public final /* synthetic */ Object h;

    public /* synthetic */ pi(rn rnVar, int i10, Object obj, org.telegram.ui.Cells.s1 s1Var, int i11) {
        this.d = i11;
        this.g = rnVar;
        this.e = i10;
        this.h = obj;
        this.f = s1Var;
    }

    @Override // we.d
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new cg.w1(this, this.e, 18), 240L);
                    break;
                }
                break;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new cg.w1(this, this.e, 20), 240L);
                    break;
                }
                break;
        }
    }

    @Override // we.d
    public final void d() {
        switch (this.d) {
            case 0:
                int i10 = this.e;
                rn rnVar = this.g;
                rnVar.sb = i10;
                rnVar.tb = 1;
                rnVar.ub = (CharacterStyle) this.h;
                this.f.invalidate();
                break;
            default:
                int i11 = this.e;
                rn rnVar2 = this.g;
                rnVar2.sb = i11;
                rnVar2.tb = 3;
                rnVar2.vb = (String) this.h;
                this.f.invalidate();
                break;
        }
    }
}
