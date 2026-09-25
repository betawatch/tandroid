package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oe0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ re0 b;

    public /* synthetic */ oe0(re0 re0Var, int i10) {
        this.a = i10;
        this.b = re0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                re0 re0Var = this.b;
                ci.h2 h2Var = re0Var.c;
                h2Var.requestFocus();
                String str = re0Var.K;
                if (str != null) {
                    if (str.length() > 1) {
                        String obj = h2Var.getText().toString();
                        int length = obj.length();
                        int i10 = 0;
                        while (i10 < length && obj.charAt(i10) <= ' ') {
                            i10++;
                        }
                        int length2 = re0Var.K.length() + i10;
                        h2Var.setSelection(Utilities.clamp(length2 + ((length2 < 0 || length2 >= obj.length() || obj.charAt(length2) != ' ') ? 0 : 1), obj.length(), 0), h2Var.getText().length());
                        break;
                    }
                }
                h2Var.setSelection(0, h2Var.getText().length());
                break;
            case 1:
                this.b.q(true);
                break;
            case 2:
                this.b.o(false);
                break;
            default:
                ci.h2 h2Var2 = this.b.c;
                if (h2Var2 != null) {
                    h2Var2.requestFocus();
                    h2Var2.setSelection(h2Var2.length());
                    AndroidUtilities.showKeyboard(h2Var2);
                    break;
                }
                break;
        }
    }
}
