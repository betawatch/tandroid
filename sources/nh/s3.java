package nh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.jj0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s3 implements Utilities.Callback4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w3 b;
    public final /* synthetic */ a4 c;

    public /* synthetic */ s3(w3 w3Var, a4 a4Var, int i10) {
        this.a = i10;
        this.b = w3Var;
        this.c = a4Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback4
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.a) {
            case 0:
                Long l10 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Boolean bool = (Boolean) obj3;
                long currentTimeMillis = System.currentTimeMillis();
                d4 d4Var = this.b.l;
                c4 c4Var = d4Var.J2;
                h9 h9Var = c4Var.b;
                if (h9Var != null) {
                    h9Var.firstFrameRendered = false;
                    c4Var.f = false;
                    h9Var.setOnReadyListener(new e2(1, currentTimeMillis, runnable));
                    ((z8) d4Var.N1).g(false);
                    jj0 jj0Var = d4Var.w0;
                    if (jj0Var != null) {
                        jj0Var.setAnimation(this.c.u);
                    }
                    if (d4Var.O2 > 0 && l10.longValue() > d4Var.O2 - 1400) {
                        l10 = 0L;
                    }
                    d4Var.T0(l10.longValue(), true);
                    d4Var.R3 = false;
                    AndroidUtilities.runOnUIThread(runnable, 400L);
                    if (bool.booleanValue()) {
                        d4Var.f1(false);
                        break;
                    }
                } else {
                    ((z8) d4Var.N1).g(false);
                    d4Var.setActive(true);
                    d4Var.R3 = false;
                    d4Var.f1 = new d2(1, runnable);
                    if (bool.booleanValue()) {
                        d4Var.f1(false);
                    }
                    AndroidUtilities.runOnUIThread(runnable, 400L);
                    break;
                }
                break;
            default:
                Long l11 = (Long) obj;
                Runnable runnable2 = (Runnable) obj2;
                Boolean bool2 = (Boolean) obj3;
                long currentTimeMillis2 = System.currentTimeMillis();
                d4 d4Var2 = this.b.l;
                c4 c4Var2 = d4Var2.J2;
                h9 h9Var2 = c4Var2.b;
                if (h9Var2 != null) {
                    h9Var2.firstFrameRendered = false;
                    c4Var2.f = false;
                    h9Var2.setOnReadyListener(new e2(2, currentTimeMillis2, runnable2));
                    ((z8) d4Var2.N1).g(false);
                    jj0 jj0Var2 = d4Var2.w0;
                    if (jj0Var2 != null) {
                        jj0Var2.setAnimation(this.c.u);
                    }
                    if (d4Var2.O2 > 0 && l11.longValue() > d4Var2.O2 - 1400) {
                        l11 = 0L;
                    }
                    d4Var2.T0(l11.longValue(), true);
                    d4Var2.R3 = false;
                    AndroidUtilities.runOnUIThread(runnable2, 400L);
                    if (bool2.booleanValue()) {
                        d4Var2.f1(false);
                        break;
                    }
                } else {
                    ((z8) d4Var2.N1).g(false);
                    d4Var2.setActive(true);
                    d4Var2.R3 = false;
                    d4Var2.f1 = new d2(2, runnable2);
                    if (bool2.booleanValue()) {
                        d4Var2.f1(false);
                    }
                    AndroidUtilities.runOnUIThread(runnable2, 400L);
                    break;
                }
                break;
        }
    }
}
