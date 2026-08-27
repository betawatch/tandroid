package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public class mg extends ri0 {
    public kg r;
    public lg s;
    public final int v;
    public final hc.f w;

    public mg(Context context) {
        this(context, 32);
    }

    public kg getCurrentState() {
        return this.r;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(kg kgVar, boolean z10) {
        int ordinal;
        lg lgVar;
        if (z10 && kgVar == this.r) {
            return;
        }
        kg kgVar2 = this.r;
        this.r = kgVar;
        lg lgVar2 = null;
        hc.f fVar = this.w;
        if (z10 && kgVar2 != null) {
            lg[] values = lg.values();
            int length = values.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    lgVar = null;
                    break;
                }
                lgVar = values[i10];
                if (lgVar.a == kgVar2 && lgVar.b == kgVar) {
                    break;
                } else {
                    i10++;
                }
            }
            if (lgVar != null) {
                kg kgVar3 = this.r;
                lg[] values2 = lg.values();
                int length2 = values2.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length2) {
                        break;
                    }
                    lg lgVar3 = values2[i11];
                    if (lgVar3.a == kgVar2 && lgVar3.b == kgVar3) {
                        lgVar2 = lgVar3;
                        break;
                    }
                    i11++;
                }
                if (lgVar2 == this.s) {
                    return;
                }
                this.s = lgVar2;
                oi0 oi0Var = (oi0) fVar.get(lgVar2);
                oi0Var.stop();
                if (lgVar2 == lg.e) {
                    oi0Var.N(30);
                    oi0Var.Q(0.0f, false);
                } else if (lgVar2 == lg.d) {
                    oi0Var.N(60);
                    oi0Var.Q(0.5f, false);
                } else {
                    oi0Var.Q(0.0f, false);
                }
                oi0Var.I(0);
                oi0Var.q0 = new bg(this, 20);
                setAnimation(oi0Var);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Cells.q0(oi0Var, 1));
                ordinal = kgVar.ordinal();
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
        kg kgVar4 = this.r;
        lg[] values3 = lg.values();
        int length3 = values3.length;
        int i12 = 0;
        while (true) {
            if (i12 >= length3) {
                break;
            }
            lg lgVar4 = values3[i12];
            if (lgVar4.a == kgVar4) {
                lgVar2 = lgVar4;
                break;
            }
            i12++;
        }
        oi0 oi0Var2 = (oi0) fVar.get(lgVar2);
        oi0Var2.stop();
        oi0Var2.Q(kgVar != kg.a ? 0.0f : 0.5f, false);
        setAnimation(oi0Var2);
        ordinal = kgVar.ordinal();
        if (ordinal != 0) {
        }
    }

    public mg(Context context, int i10) {
        super(context);
        this.w = new hc.f(this, 1);
        this.v = i10;
    }
}
