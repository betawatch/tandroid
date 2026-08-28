package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class qg extends pi0 {
    public og r;
    public pg s;
    public final int v;
    public final gc.e w;

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
    public final void j(og ogVar, boolean z10) {
        int ordinal;
        pg pgVar;
        if (z10 && ogVar == this.r) {
            return;
        }
        og ogVar2 = this.r;
        this.r = ogVar;
        pg pgVar2 = null;
        gc.e eVar = this.w;
        if (z10 && ogVar2 != null) {
            pg[] values = pg.values();
            int length = values.length;
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    pgVar = null;
                    break;
                }
                pgVar = values[i9];
                if (pgVar.a == ogVar2 && pgVar.b == ogVar) {
                    break;
                } else {
                    i9++;
                }
            }
            if (pgVar != null) {
                og ogVar3 = this.r;
                pg[] values2 = pg.values();
                int length2 = values2.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length2) {
                        break;
                    }
                    pg pgVar3 = values2[i10];
                    if (pgVar3.a == ogVar2 && pgVar3.b == ogVar3) {
                        pgVar2 = pgVar3;
                        break;
                    }
                    i10++;
                }
                if (pgVar2 == this.s) {
                    return;
                }
                this.s = pgVar2;
                mi0 mi0Var = (mi0) eVar.get(pgVar2);
                mi0Var.stop();
                if (pgVar2 == pg.e) {
                    mi0Var.N(30);
                    mi0Var.Q(0.0f, false);
                } else if (pgVar2 == pg.d) {
                    mi0Var.N(60);
                    mi0Var.Q(0.5f, false);
                } else {
                    mi0Var.Q(0.0f, false);
                }
                mi0Var.I(0);
                mi0Var.q0 = new fg(this, 20);
                setAnimation(mi0Var);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Cells.q0(mi0Var, 1));
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
        int i11 = 0;
        while (true) {
            if (i11 >= length3) {
                break;
            }
            pg pgVar4 = values3[i11];
            if (pgVar4.a == ogVar4) {
                pgVar2 = pgVar4;
                break;
            }
            i11++;
        }
        mi0 mi0Var2 = (mi0) eVar.get(pgVar2);
        mi0Var2.stop();
        mi0Var2.Q(ogVar != og.a ? 0.0f : 0.5f, false);
        setAnimation(mi0Var2);
        ordinal = ogVar.ordinal();
        if (ordinal != 0) {
        }
    }

    public qg(Context context, int i9) {
        super(context);
        this.w = new gc.e(this, 1);
        this.v = i9;
    }
}
