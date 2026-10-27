package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fe0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ie0 b;

    public /* synthetic */ fe0(ie0 ie0Var, int i10) {
        this.a = i10;
        this.b = ie0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ie0 ie0Var = this.b;
                fi.c2 c2Var = ie0Var.c;
                c2Var.requestFocus();
                String str = ie0Var.K;
                if (str != null) {
                    if (str.length() > 1) {
                        String obj = c2Var.getText().toString();
                        int length = obj.length();
                        int i10 = 0;
                        while (i10 < length && obj.charAt(i10) <= ' ') {
                            i10++;
                        }
                        int length2 = ie0Var.K.length() + i10;
                        c2Var.setSelection(Utilities.clamp(length2 + ((length2 < 0 || length2 >= obj.length() || obj.charAt(length2) != ' ') ? 0 : 1), obj.length(), 0), c2Var.getText().length());
                        break;
                    }
                }
                c2Var.setSelection(0, c2Var.getText().length());
                break;
            case 1:
                this.b.p(true);
                break;
            case 2:
                this.b.n(false);
                break;
            default:
                fi.c2 c2Var2 = this.b.c;
                if (c2Var2 != null) {
                    c2Var2.requestFocus();
                    c2Var2.setSelection(c2Var2.length());
                    AndroidUtilities.showKeyboard(c2Var2);
                    break;
                }
                break;
        }
    }
}
