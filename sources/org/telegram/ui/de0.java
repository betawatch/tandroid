package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class de0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ge0 b;

    public /* synthetic */ de0(ge0 ge0Var, int i10) {
        this.a = i10;
        this.b = ge0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ge0 ge0Var = this.b;
                fi.c2 c2Var = ge0Var.c;
                c2Var.requestFocus();
                String str = ge0Var.K;
                if (str != null) {
                    if (str.length() > 1) {
                        String obj = c2Var.getText().toString();
                        int length = obj.length();
                        int i10 = 0;
                        while (i10 < length && obj.charAt(i10) <= ' ') {
                            i10++;
                        }
                        int length2 = ge0Var.K.length() + i10;
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
