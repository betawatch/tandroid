package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public class qg extends lj0 {
    public og r;
    public pg s;
    public final int v;
    public final kc.f w;

    public qg(Context context) {
        this(context, 32);
    }

    public og getCurrentState() {
        return this.r;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(og ogVar, boolean z4) {
        int ordinal;
        pg pgVar;
        if (z4 && ogVar == this.r) {
            return;
        }
        og ogVar2 = this.r;
        this.r = ogVar;
        pg pgVar2 = null;
        kc.f fVar = this.w;
        if (z4 && ogVar2 != null) {
            pg[] values = pg.values();
            int length = values.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    pgVar = null;
                    break;
                }
                pgVar = values[i10];
                if (pgVar.a == ogVar2 && pgVar.b == ogVar) {
                    break;
                } else {
                    i10++;
                }
            }
            if (pgVar != null) {
                og ogVar3 = this.r;
                pg[] values2 = pg.values();
                int length2 = values2.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length2) {
                        break;
                    }
                    pg pgVar3 = values2[i11];
                    if (pgVar3.a == ogVar2 && pgVar3.b == ogVar3) {
                        pgVar2 = pgVar3;
                        break;
                    }
                    i11++;
                }
                if (pgVar2 == this.s) {
                    return;
                }
                this.s = pgVar2;
                ij0 ij0Var = (ij0) fVar.get(pgVar2);
                ij0Var.stop();
                if (pgVar2 == pg.e) {
                    ij0Var.N(30);
                    ij0Var.Q(0.0f, false);
                } else if (pgVar2 == pg.d) {
                    ij0Var.N(60);
                    ij0Var.Q(0.5f, false);
                } else {
                    ij0Var.Q(0.0f, false);
                }
                ij0Var.I(0);
                ij0Var.r0 = new fg(this, 20);
                setAnimation(ij0Var);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Cells.q0(ij0Var, 1));
                ordinal = ogVar.ordinal();
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
        og ogVar4 = this.r;
        pg[] values3 = pg.values();
        int length3 = values3.length;
        int i12 = 0;
        while (true) {
            if (i12 >= length3) {
                break;
            }
            pg pgVar4 = values3[i12];
            if (pgVar4.a == ogVar4) {
                pgVar2 = pgVar4;
                break;
            }
            i12++;
        }
        ij0 ij0Var2 = (ij0) fVar.get(pgVar2);
        ij0Var2.stop();
        ij0Var2.Q(ogVar != og.a ? 0.0f : 0.5f, false);
        setAnimation(ij0Var2);
        ordinal = ogVar.ordinal();
        if (ordinal != 0) {
        }
    }

    public qg(Context context, int i10) {
        super(context);
        this.w = new kc.f(this, 1);
        this.v = i10;
    }
}
