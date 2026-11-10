package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hc0 b;

    public /* synthetic */ fc0(hc0 hc0Var, int i7) {
        this.a = i7;
        this.b = hc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hc0 hc0Var = this.b;
                ah.i iVar = hc0Var.c;
                iVar.requestFocus();
                String str = hc0Var.K;
                if (str != null) {
                    if (str.length() > 1) {
                        String obj = iVar.getText().toString();
                        int length = obj.length();
                        int i7 = 0;
                        while (i7 < length && obj.charAt(i7) <= ' ') {
                            i7++;
                        }
                        int length2 = hc0Var.K.length() + i7;
                        iVar.setSelection(Utilities.j(length2 + ((length2 < 0 || length2 >= obj.length() || obj.charAt(length2) != ' ') ? 0 : 1), obj.length(), 0), iVar.getText().length());
                        break;
                    }
                }
                iVar.setSelection(0, iVar.getText().length());
                break;
            case 1:
                this.b.p(true);
                break;
            case 2:
                this.b.n(false);
                break;
            default:
                ah.i iVar2 = this.b.c;
                if (iVar2 != null) {
                    iVar2.requestFocus();
                    iVar2.setSelection(iVar2.length());
                    org.telegram.messenger.g0.K3(iVar2);
                    break;
                }
                break;
        }
    }
}
