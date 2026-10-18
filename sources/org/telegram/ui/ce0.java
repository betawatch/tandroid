package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ce0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fe0 b;

    public /* synthetic */ ce0(fe0 fe0Var, int i10) {
        this.a = i10;
        this.b = fe0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                fe0 fe0Var = this.b;
                ei.e2 e2Var = fe0Var.c;
                e2Var.requestFocus();
                String str = fe0Var.K;
                if (str != null) {
                    if (str.length() > 1) {
                        String obj = e2Var.getText().toString();
                        int length = obj.length();
                        int i10 = 0;
                        while (i10 < length && obj.charAt(i10) <= ' ') {
                            i10++;
                        }
                        int length2 = fe0Var.K.length() + i10;
                        e2Var.setSelection(Utilities.clamp(length2 + ((length2 < 0 || length2 >= obj.length() || obj.charAt(length2) != ' ') ? 0 : 1), obj.length(), 0), e2Var.getText().length());
                        break;
                    }
                }
                e2Var.setSelection(0, e2Var.getText().length());
                break;
            case 1:
                this.b.q(true);
                break;
            case 2:
                this.b.o(false);
                break;
            default:
                ei.e2 e2Var2 = this.b.c;
                if (e2Var2 != null) {
                    e2Var2.requestFocus();
                    e2Var2.setSelection(e2Var2.length());
                    AndroidUtilities.showKeyboard(e2Var2);
                    break;
                }
                break;
        }
    }
}
