package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ec0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gc0 b;

    public /* synthetic */ ec0(gc0 gc0Var, int i7) {
        this.a = i7;
        this.b = gc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                gc0 gc0Var = this.b;
                ah.i iVar = gc0Var.c;
                iVar.requestFocus();
                String str = gc0Var.K;
                if (str != null) {
                    if (str.length() > 1) {
                        String obj = iVar.getText().toString();
                        int length = obj.length();
                        int i7 = 0;
                        while (i7 < length && obj.charAt(i7) <= ' ') {
                            i7++;
                        }
                        int length2 = gc0Var.K.length() + i7;
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
