package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public class zg extends aj0 {
    public xg r;
    public yg s;
    public final int v;
    public final wg w;

    public zg(Context context) {
        this(context, 32);
    }

    public xg getCurrentState() {
        return this.r;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(xg xgVar, boolean z10) {
        int ordinal;
        yg ygVar;
        if (z10 && xgVar == this.r) {
            return;
        }
        xg xgVar2 = this.r;
        this.r = xgVar;
        yg ygVar2 = null;
        wg wgVar = this.w;
        if (z10 && xgVar2 != null) {
            yg[] values = yg.values();
            int length = values.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    ygVar = null;
                    break;
                }
                ygVar = values[i10];
                if (ygVar.a == xgVar2 && ygVar.b == xgVar) {
                    break;
                } else {
                    i10++;
                }
            }
            if (ygVar != null) {
                xg xgVar3 = this.r;
                yg[] values2 = yg.values();
                int length2 = values2.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length2) {
                        break;
                    }
                    yg ygVar3 = values2[i11];
                    if (ygVar3.a == xgVar2 && ygVar3.b == xgVar3) {
                        ygVar2 = ygVar3;
                        break;
                    }
                    i11++;
                }
                if (ygVar2 == this.s) {
                    return;
                }
                this.s = ygVar2;
                xi0 xi0Var = (xi0) wgVar.get(ygVar2);
                xi0Var.stop();
                if (ygVar2 == yg.e) {
                    xi0Var.P(30);
                    xi0Var.T(0.0f, false);
                } else if (ygVar2 == yg.d) {
                    xi0Var.P(60);
                    xi0Var.T(0.5f, false);
                } else {
                    xi0Var.T(0.0f, false);
                }
                xi0Var.K(0);
                xi0Var.t0 = new ng(this, 20);
                setAnimation(xi0Var);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Cells.q0(xi0Var, 1));
                ordinal = xgVar.ordinal();
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
        xg xgVar4 = this.r;
        yg[] values3 = yg.values();
        int length3 = values3.length;
        int i12 = 0;
        while (true) {
            if (i12 >= length3) {
                break;
            }
            yg ygVar4 = values3[i12];
            if (ygVar4.a == xgVar4) {
                ygVar2 = ygVar4;
                break;
            }
            i12++;
        }
        xi0 xi0Var2 = (xi0) wgVar.get(ygVar2);
        xi0Var2.stop();
        xi0Var2.T(xgVar != xg.a ? 0.0f : 0.5f, false);
        setAnimation(xi0Var2);
        ordinal = xgVar.ordinal();
        if (ordinal != 0) {
        }
    }

    public zg(Context context, int i10) {
        super(context);
        this.w = new wg(this, 0);
        this.v = i10;
    }
}
