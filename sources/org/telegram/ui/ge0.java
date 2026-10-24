package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ge0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ je0 b;

    public /* synthetic */ ge0(je0 je0Var, int i10) {
        this.a = i10;
        this.b = je0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                je0 je0Var = this.b;
                ei.e2 e2Var = je0Var.c;
                e2Var.requestFocus();
                String str = je0Var.K;
                if (str != null) {
                    if (str.length() > 1) {
                        String obj = e2Var.getText().toString();
                        int length = obj.length();
                        int i10 = 0;
                        while (i10 < length && obj.charAt(i10) <= ' ') {
                            i10++;
                        }
                        int length2 = je0Var.K.length() + i10;
                        e2Var.setSelection(Utilities.clamp(length2 + ((length2 < 0 || length2 >= obj.length() || obj.charAt(length2) != ' ') ? 0 : 1), obj.length(), 0), e2Var.getText().length());
                        break;
                    }
                }
                e2Var.setSelection(0, e2Var.getText().length());
                break;
            case 1:
                this.b.p(true);
                break;
            case 2:
                this.b.n(false);
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
