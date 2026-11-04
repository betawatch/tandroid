package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n21 b;

    public /* synthetic */ l21(n21 n21Var, int i3) {
        this.a = i3;
        this.b = n21Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String sb2;
        int i3 = this.a;
        n21 n21Var = this.b;
        switch (i3) {
            case 0:
                String str = n21Var.b.text;
                if (str == null || !str.equals("AUTH_TOKEN_EXCEPTION")) {
                    StringBuilder sb3 = new StringBuilder();
                    org.telegram.messenger.camera.q.q(null, 2131751106, sb3, "\n");
                    sb3.append(n21Var.b.text);
                    sb2 = sb3.toString();
                } else {
                    sb2 = org.telegram.messenger.bd.M0(2131754709, null);
                }
                org.telegram.ui.Components.t4.t0(n21Var.c, org.telegram.messenger.bd.M0(2131753894, null), sb2, null);
                break;
            default:
                org.telegram.ui.Components.t4.t0(n21Var.c, org.telegram.messenger.bd.M0(2131753894, null), org.telegram.messenger.bd.M0(2131751106, null), null);
                break;
        }
    }
}
