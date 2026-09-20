package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public class ah extends kj0 {
    public yg r;
    public zg s;
    public final int v;
    public final xg w;

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
        xg xgVar = this.w;
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
                hj0 hj0Var = (hj0) xgVar.get(zgVar2);
                hj0Var.stop();
                if (zgVar2 == zg.e) {
                    hj0Var.P(30);
                    hj0Var.T(0.0f, false);
                } else if (zgVar2 == zg.d) {
                    hj0Var.P(60);
                    hj0Var.T(0.5f, false);
                } else {
                    hj0Var.T(0.0f, false);
                }
                hj0Var.K(0);
                hj0Var.t0 = new og(this, 20);
                setAnimation(hj0Var);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Cells.q0(hj0Var, 1));
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
        hj0 hj0Var2 = (hj0) xgVar.get(zgVar2);
        hj0Var2.stop();
        hj0Var2.T(ygVar != yg.a ? 0.0f : 0.5f, false);
        setAnimation(hj0Var2);
        ordinal = ygVar.ordinal();
        if (ordinal != 0) {
        }
    }

    public ah(Context context, int i10) {
        super(context);
        this.w = new xg(this, 0);
        this.v = i10;
    }
}
