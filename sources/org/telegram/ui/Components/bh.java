package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public class bh extends aj0 {
    public zg r;
    public ah s;
    public final int v;
    public final yg w;

    public bh(Context context) {
        this(context, 32);
    }

    public zg getCurrentState() {
        return this.r;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(zg zgVar, boolean z10) {
        int ordinal;
        ah ahVar;
        if (z10 && zgVar == this.r) {
            return;
        }
        zg zgVar2 = this.r;
        this.r = zgVar;
        ah ahVar2 = null;
        yg ygVar = this.w;
        if (z10 && zgVar2 != null) {
            ah[] values = ah.values();
            int length = values.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    ahVar = null;
                    break;
                }
                ahVar = values[i10];
                if (ahVar.a == zgVar2 && ahVar.b == zgVar) {
                    break;
                } else {
                    i10++;
                }
            }
            if (ahVar != null) {
                zg zgVar3 = this.r;
                ah[] values2 = ah.values();
                int length2 = values2.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length2) {
                        break;
                    }
                    ah ahVar3 = values2[i11];
                    if (ahVar3.a == zgVar2 && ahVar3.b == zgVar3) {
                        ahVar2 = ahVar3;
                        break;
                    }
                    i11++;
                }
                if (ahVar2 == this.s) {
                    return;
                }
                this.s = ahVar2;
                xi0 xi0Var = (xi0) ygVar.get(ahVar2);
                xi0Var.stop();
                if (ahVar2 == ah.e) {
                    xi0Var.N(30);
                    xi0Var.Q(0.0f, false);
                } else if (ahVar2 == ah.d) {
                    xi0Var.N(60);
                    xi0Var.Q(0.5f, false);
                } else {
                    xi0Var.Q(0.0f, false);
                }
                xi0Var.I(0);
                xi0Var.u0 = new pg(this, 20);
                setAnimation(xi0Var);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Cells.q0(xi0Var, 1));
                ordinal = zgVar.ordinal();
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
        zg zgVar4 = this.r;
        ah[] values3 = ah.values();
        int length3 = values3.length;
        int i12 = 0;
        while (true) {
            if (i12 >= length3) {
                break;
            }
            ah ahVar4 = values3[i12];
            if (ahVar4.a == zgVar4) {
                ahVar2 = ahVar4;
                break;
            }
            i12++;
        }
        xi0 xi0Var2 = (xi0) ygVar.get(ahVar2);
        xi0Var2.stop();
        xi0Var2.Q(zgVar != zg.a ? 0.0f : 0.5f, false);
        setAnimation(xi0Var2);
        ordinal = zgVar.ordinal();
        if (ordinal != 0) {
        }
    }

    public bh(Context context, int i10) {
        super(context);
        this.w = new yg(this, 0);
        this.v = i10;
    }
}
