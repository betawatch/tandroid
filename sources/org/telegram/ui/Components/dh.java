package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public class dh extends fk0 {
    public bh r;
    public ch s;
    public final int v;
    public final ah w;

    public dh(Context context) {
        this(context, 32);
    }

    public bh getCurrentState() {
        return this.r;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(bh bhVar, boolean z10) {
        int ordinal;
        ch chVar;
        if (z10 && bhVar == this.r) {
            return;
        }
        bh bhVar2 = this.r;
        this.r = bhVar;
        ch chVar2 = null;
        ah ahVar = this.w;
        if (z10 && bhVar2 != null) {
            ch[] values = ch.values();
            int length = values.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    chVar = null;
                    break;
                }
                chVar = values[i10];
                if (chVar.a == bhVar2 && chVar.b == bhVar) {
                    break;
                } else {
                    i10++;
                }
            }
            if (chVar != null) {
                bh bhVar3 = this.r;
                ch[] values2 = ch.values();
                int length2 = values2.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length2) {
                        break;
                    }
                    ch chVar3 = values2[i11];
                    if (chVar3.a == bhVar2 && chVar3.b == bhVar3) {
                        chVar2 = chVar3;
                        break;
                    }
                    i11++;
                }
                if (chVar2 == this.s) {
                    return;
                }
                this.s = chVar2;
                ck0 ck0Var = (ck0) ahVar.get(chVar2);
                ck0Var.stop();
                if (chVar2 == ch.e) {
                    ck0Var.P(30);
                    ck0Var.T(0.0f, false);
                } else if (chVar2 == ch.d) {
                    ck0Var.P(60);
                    ck0Var.T(0.5f, false);
                } else {
                    ck0Var.T(0.0f, false);
                }
                ck0Var.K(0);
                ck0Var.t0 = new rg(this, 20);
                setAnimation(ck0Var);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Cells.r0(ck0Var, 1));
                ordinal = bhVar.ordinal();
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
        bh bhVar4 = this.r;
        ch[] values3 = ch.values();
        int length3 = values3.length;
        int i12 = 0;
        while (true) {
            if (i12 >= length3) {
                break;
            }
            ch chVar4 = values3[i12];
            if (chVar4.a == bhVar4) {
                chVar2 = chVar4;
                break;
            }
            i12++;
        }
        ck0 ck0Var2 = (ck0) ahVar.get(chVar2);
        ck0Var2.stop();
        ck0Var2.T(bhVar != bh.a ? 0.0f : 0.5f, false);
        setAnimation(ck0Var2);
        ordinal = bhVar.ordinal();
        if (ordinal != 0) {
        }
    }

    public dh(Context context, int i10) {
        super(context);
        this.w = new ah(this, 0);
        this.v = i10;
    }
}
