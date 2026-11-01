package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l41 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m41 b;

    public /* synthetic */ l41(m41 m41Var, int i10) {
        this.a = i10;
        this.b = m41Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String sb2;
        int i10 = this.a;
        m41 m41Var = this.b;
        switch (i10) {
            case 0:
                String str = m41Var.b.text;
                if (str == null || !str.equals("AUTH_TOKEN_EXCEPTION")) {
                    StringBuilder sb3 = new StringBuilder();
                    org.telegram.messenger.a30.q(null, 2131751106, sb3, "\n");
                    sb3.append(m41Var.b.text);
                    sb2 = sb3.toString();
                } else {
                    sb2 = org.telegram.messenger.dd.L0(2131754709, null);
                }
                org.telegram.ui.Components.s4.t0(m41Var.c, org.telegram.messenger.dd.L0(2131753894, null), sb2, null);
                break;
            default:
                org.telegram.ui.Components.s4.t0(m41Var.c, org.telegram.messenger.dd.L0(2131753894, null), org.telegram.messenger.dd.L0(2131751106, null), null);
                break;
        }
    }
}
