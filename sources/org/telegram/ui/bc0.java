package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class bc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dc0 b;

    public /* synthetic */ bc0(dc0 dc0Var, int i7) {
        this.a = i7;
        this.b = dc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                dc0 dc0Var = this.b;
                ah.i iVar = dc0Var.c;
                iVar.requestFocus();
                String str = dc0Var.L;
                if (str != null) {
                    if (str.length() > 1) {
                        String obj = iVar.getText().toString();
                        int length = obj.length();
                        int i7 = 0;
                        while (i7 < length && obj.charAt(i7) <= ' ') {
                            i7++;
                        }
                        int length2 = dc0Var.L.length() + i7;
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
                    org.telegram.messenger.g0.I3(iVar2);
                    break;
                }
                break;
        }
    }
}
