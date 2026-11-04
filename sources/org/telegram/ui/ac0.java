package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ac0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cc0 b;

    public /* synthetic */ ac0(cc0 cc0Var, int i3) {
        this.a = i3;
        this.b = cc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                cc0 cc0Var = this.b;
                bh.g gVar = cc0Var.c;
                gVar.requestFocus();
                String str = cc0Var.L;
                if (str != null) {
                    if (str.length() > 1) {
                        String obj = gVar.getText().toString();
                        int length = obj.length();
                        int i3 = 0;
                        while (i3 < length && obj.charAt(i3) <= ' ') {
                            i3++;
                        }
                        int length2 = cc0Var.L.length() + i3;
                        gVar.setSelection(Utilities.j(length2 + ((length2 < 0 || length2 >= obj.length() || obj.charAt(length2) != ' ') ? 0 : 1), obj.length(), 0), gVar.getText().length());
                        break;
                    }
                }
                gVar.setSelection(0, gVar.getText().length());
                break;
            case 1:
                this.b.p(true);
                break;
            case 2:
                this.b.n(false);
                break;
            default:
                bh.g gVar2 = this.b.c;
                if (gVar2 != null) {
                    gVar2.requestFocus();
                    gVar2.setSelection(gVar2.length());
                    org.telegram.messenger.g0.K3(gVar2);
                    break;
                }
                break;
        }
    }
}
