package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public class ah extends yj0 {
    public yg r;
    public zg s;
    public final int v;
    public final ad.g w;

    public ah(Context context) {
        this(context, 32);
    }

    public yg getCurrentState() {
        return this.r;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(yg ygVar, boolean z10) {
        int ordinal;
        zg zgVar;
        if (z10 && ygVar == this.r) {
            return;
        }
        yg ygVar2 = this.r;
        this.r = ygVar;
        zg zgVar2 = null;
        ad.g gVar = this.w;
        if (z10 && ygVar2 != null) {
            zg[] values = zg.values();
            int length = values.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    zgVar = null;
                    break;
                }
                zgVar = values[i10];
                if (zgVar.a == ygVar2 && zgVar.b == ygVar) {
                    break;
                } else {
                    i10++;
                }
            }
            if (zgVar != null) {
                yg ygVar3 = this.r;
                zg[] values2 = zg.values();
                int length2 = values2.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length2) {
                        break;
                    }
                    zg zgVar3 = values2[i11];
                    if (zgVar3.a == ygVar2 && zgVar3.b == ygVar3) {
                        zgVar2 = zgVar3;
                        break;
                    }
                    i11++;
                }
                if (zgVar2 == this.s) {
                    return;
                }
                this.s = zgVar2;
                vj0 vj0Var = (vj0) gVar.get(zgVar2);
                vj0Var.stop();
                if (zgVar2 == zg.e) {
                    vj0Var.P(30);
                    vj0Var.T(0.0f, false);
                } else if (zgVar2 == zg.d) {
                    vj0Var.P(60);
                    vj0Var.T(0.5f, false);
                } else {
                    vj0Var.T(0.0f, false);
                }
                vj0Var.K(0);
                vj0Var.t0 = new pg(this, 20);
                setAnimation(vj0Var);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Cells.r0(vj0Var, 1));
                ordinal = ygVar.ordinal();
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
        yg ygVar4 = this.r;
        zg[] values3 = zg.values();
        int length3 = values3.length;
        int i12 = 0;
        while (true) {
            if (i12 >= length3) {
                break;
            }
            zg zgVar4 = values3[i12];
            if (zgVar4.a == ygVar4) {
                zgVar2 = zgVar4;
                break;
            }
            i12++;
        }
        vj0 vj0Var2 = (vj0) gVar.get(zgVar2);
        vj0Var2.stop();
        vj0Var2.T(ygVar != yg.a ? 0.0f : 0.5f, false);
        setAnimation(vj0Var2);
        ordinal = ygVar.ordinal();
        if (ordinal != 0) {
        }
    }

    public ah(Context context, int i10) {
        super(context);
        this.w = new ad.g(this, 1);
        this.v = i10;
    }
}
