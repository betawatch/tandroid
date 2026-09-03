package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public class qg extends jj0 {
    public og r;
    public pg s;
    public final int v;
    public final kc.e w;

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
        kc.e eVar = this.w;
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
                gj0 gj0Var = (gj0) eVar.get(pgVar2);
                gj0Var.stop();
                if (pgVar2 == pg.e) {
                    gj0Var.N(30);
                    gj0Var.Q(0.0f, false);
                } else if (pgVar2 == pg.d) {
                    gj0Var.N(60);
                    gj0Var.Q(0.5f, false);
                } else {
                    gj0Var.Q(0.0f, false);
                }
                gj0Var.I(0);
                gj0Var.r0 = new fg(this, 20);
                setAnimation(gj0Var);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Cells.q0(gj0Var, 1));
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
        gj0 gj0Var2 = (gj0) eVar.get(pgVar2);
        gj0Var2.stop();
        gj0Var2.Q(ogVar != og.a ? 0.0f : 0.5f, false);
        setAnimation(gj0Var2);
        ordinal = ogVar.ordinal();
        if (ordinal != 0) {
        }
    }

    public qg(Context context, int i10) {
        super(context);
        this.w = new kc.e(this, 1);
        this.v = i10;
    }
}
