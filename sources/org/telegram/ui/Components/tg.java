package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class tg extends aj0 {
    public rg r;
    public sg s;
    public final int v;
    public final ic.f w;

    public tg(Context context) {
        this(context, 32);
    }

    public rg getCurrentState() {
        return this.r;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(rg rgVar, boolean z10) {
        int ordinal;
        sg sgVar;
        if (z10 && rgVar == this.r) {
            return;
        }
        rg rgVar2 = this.r;
        this.r = rgVar;
        sg sgVar2 = null;
        ic.f fVar = this.w;
        if (z10 && rgVar2 != null) {
            sg[] values = sg.values();
            int length = values.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    sgVar = null;
                    break;
                }
                sgVar = values[i10];
                if (sgVar.a == rgVar2 && sgVar.b == rgVar) {
                    break;
                } else {
                    i10++;
                }
            }
            if (sgVar != null) {
                rg rgVar3 = this.r;
                sg[] values2 = sg.values();
                int length2 = values2.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length2) {
                        break;
                    }
                    sg sgVar3 = values2[i11];
                    if (sgVar3.a == rgVar2 && sgVar3.b == rgVar3) {
                        sgVar2 = sgVar3;
                        break;
                    }
                    i11++;
                }
                if (sgVar2 == this.s) {
                    return;
                }
                this.s = sgVar2;
                xi0 xi0Var = (xi0) fVar.get(sgVar2);
                xi0Var.stop();
                if (sgVar2 == sg.e) {
                    xi0Var.N(30);
                    xi0Var.Q(0.0f, false);
                } else if (sgVar2 == sg.d) {
                    xi0Var.N(60);
                    xi0Var.Q(0.5f, false);
                } else {
                    xi0Var.Q(0.0f, false);
                }
                xi0Var.I(0);
                xi0Var.q0 = new ig(this, 20);
                setAnimation(xi0Var);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Cells.q0(xi0Var, 1));
                ordinal = rgVar.ordinal();
                if (ordinal != 0) {
                    setContentDescription(LocaleController.getString(R.string.AccDescrVoiceMessage));
                    return;
                } else {
                    if (ordinal != 1) {
                        return;
                    }
                    setContentDescription(LocaleController.getString(R.string.AccDescrVideoMessage));
                    return;
                }
            }
        }
        rg rgVar4 = this.r;
        sg[] values3 = sg.values();
        int length3 = values3.length;
        int i12 = 0;
        while (true) {
            if (i12 >= length3) {
                break;
            }
            sg sgVar4 = values3[i12];
            if (sgVar4.a == rgVar4) {
                sgVar2 = sgVar4;
                break;
            }
            i12++;
        }
        xi0 xi0Var2 = (xi0) fVar.get(sgVar2);
        xi0Var2.stop();
        xi0Var2.Q(rgVar != rg.a ? 0.0f : 0.5f, false);
        setAnimation(xi0Var2);
        ordinal = rgVar.ordinal();
        if (ordinal != 0) {
        }
    }

    public tg(Context context, int i10) {
        super(context);
        this.w = new ic.f(this, 1);
        this.v = i10;
    }
}
