package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public class bh extends bk0 {
    public zg r;
    public ah s;
    public final int v;
    public final ad.f w;

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
        ad.f fVar = this.w;
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
                yj0 yj0Var = (yj0) fVar.get(ahVar2);
                yj0Var.stop();
                if (ahVar2 == ah.e) {
                    yj0Var.P(30);
                    yj0Var.T(0.0f, false);
                } else if (ahVar2 == ah.d) {
                    yj0Var.P(60);
                    yj0Var.T(0.5f, false);
                } else {
                    yj0Var.T(0.0f, false);
                }
                yj0Var.K(0);
                yj0Var.t0 = new qg(this, 20);
                setAnimation(yj0Var);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Cells.s0(yj0Var, 1));
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
        yj0 yj0Var2 = (yj0) fVar.get(ahVar2);
        yj0Var2.stop();
        yj0Var2.T(zgVar != zg.a ? 0.0f : 0.5f, false);
        setAnimation(yj0Var2);
        ordinal = zgVar.ordinal();
        if (ordinal != 0) {
        }
    }

    public bh(Context context, int i10) {
        super(context);
        this.w = new ad.f(this, 1);
        this.v = i10;
    }
}
