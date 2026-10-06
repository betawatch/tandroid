package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public class ch extends nj0 {
    public ah r;
    public bh s;
    public final int v;
    public final zg w;

    public ch(Context context) {
        this(context, 32);
    }

    public ah getCurrentState() {
        return this.r;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(ah ahVar, boolean z10) {
        int ordinal;
        bh bhVar;
        if (z10 && ahVar == this.r) {
            return;
        }
        ah ahVar2 = this.r;
        this.r = ahVar;
        bh bhVar2 = null;
        zg zgVar = this.w;
        if (z10 && ahVar2 != null) {
            bh[] values = bh.values();
            int length = values.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    bhVar = null;
                    break;
                }
                bhVar = values[i10];
                if (bhVar.a == ahVar2 && bhVar.b == ahVar) {
                    break;
                } else {
                    i10++;
                }
            }
            if (bhVar != null) {
                ah ahVar3 = this.r;
                bh[] values2 = bh.values();
                int length2 = values2.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length2) {
                        break;
                    }
                    bh bhVar3 = values2[i11];
                    if (bhVar3.a == ahVar2 && bhVar3.b == ahVar3) {
                        bhVar2 = bhVar3;
                        break;
                    }
                    i11++;
                }
                if (bhVar2 == this.s) {
                    return;
                }
                this.s = bhVar2;
                kj0 kj0Var = (kj0) zgVar.get(bhVar2);
                kj0Var.stop();
                if (bhVar2 == bh.e) {
                    kj0Var.P(30);
                    kj0Var.T(0.0f, false);
                } else if (bhVar2 == bh.d) {
                    kj0Var.P(60);
                    kj0Var.T(0.5f, false);
                } else {
                    kj0Var.T(0.0f, false);
                }
                kj0Var.K(0);
                kj0Var.t0 = new qg(this, 20);
                setAnimation(kj0Var);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Cells.q0(kj0Var, 1));
                ordinal = ahVar.ordinal();
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
        ah ahVar4 = this.r;
        bh[] values3 = bh.values();
        int length3 = values3.length;
        int i12 = 0;
        while (true) {
            if (i12 >= length3) {
                break;
            }
            bh bhVar4 = values3[i12];
            if (bhVar4.a == ahVar4) {
                bhVar2 = bhVar4;
                break;
            }
            i12++;
        }
        kj0 kj0Var2 = (kj0) zgVar.get(bhVar2);
        kj0Var2.stop();
        kj0Var2.T(ahVar != ah.a ? 0.0f : 0.5f, false);
        setAnimation(kj0Var2);
        ordinal = ahVar.ordinal();
        if (ordinal != 0) {
        }
    }

    public ch(Context context, int i10) {
        super(context);
        this.w = new zg(this, 0);
        this.v = i10;
    }
}
