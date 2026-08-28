package org.telegram.ui;

import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ni extends ve.d {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Cells.t1 f;
    public final /* synthetic */ qn g;
    public final /* synthetic */ Object h;

    public /* synthetic */ ni(qn qnVar, int i9, Object obj, org.telegram.ui.Cells.t1 t1Var, int i10) {
        this.d = i10;
        this.g = qnVar;
        this.e = i9;
        this.h = obj;
        this.f = t1Var;
    }

    @Override // ve.d
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new bg.c2(this, this.e, 19), 240L);
                    break;
                }
                break;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new bg.c2(this, this.e, 21), 240L);
                    break;
                }
                break;
        }
    }

    @Override // ve.d
    public final void d() {
        switch (this.d) {
            case 0:
                int i9 = this.e;
                qn qnVar = this.g;
                qnVar.sb = i9;
                qnVar.tb = 1;
                qnVar.ub = (CharacterStyle) this.h;
                this.f.invalidate();
                break;
            default:
                int i10 = this.e;
                qn qnVar2 = this.g;
                qnVar2.sb = i10;
                qnVar2.tb = 3;
                qnVar2.vb = (String) this.h;
                this.f.invalidate();
                break;
        }
    }
}
