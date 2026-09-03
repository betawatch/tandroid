package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class no0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ np0 b;

    public /* synthetic */ no0(np0 np0Var, int i10) {
        this.a = i10;
        this.b = np0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                np0 np0Var = this.b;
                np0Var.r = false;
                np0Var.N.setLoading(false);
                if (((Boolean) obj).booleanValue()) {
                    np0Var.x0();
                    np0Var.finishFragment();
                    np0Var.E0();
                    break;
                }
                break;
            default:
                Integer num = (Integer) obj;
                gk gkVar = this.b.F;
                if (gkVar != null) {
                    gkVar.D(num.intValue());
                    break;
                }
                break;
        }
    }
}
