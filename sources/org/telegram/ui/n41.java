package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class n41 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o41 b;

    public /* synthetic */ n41(o41 o41Var, int i10) {
        this.a = i10;
        this.b = o41Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String sb2;
        int i10 = this.a;
        o41 o41Var = this.b;
        switch (i10) {
            case 0:
                String str = o41Var.b.text;
                if (str == null || !str.equals("AUTH_TOKEN_EXCEPTION")) {
                    StringBuilder sb3 = new StringBuilder();
                    org.telegram.messenger.z20.q(null, 2131751106, sb3, "\n");
                    sb3.append(o41Var.b.text);
                    sb2 = sb3.toString();
                } else {
                    sb2 = org.telegram.messenger.cd.L0(2131754709, null);
                }
                org.telegram.ui.Components.s4.t0(o41Var.c, org.telegram.messenger.cd.L0(2131753894, null), sb2, null);
                break;
            default:
                org.telegram.ui.Components.s4.t0(o41Var.c, org.telegram.messenger.cd.L0(2131753894, null), org.telegram.messenger.cd.L0(2131751106, null), null);
                break;
        }
    }
}
