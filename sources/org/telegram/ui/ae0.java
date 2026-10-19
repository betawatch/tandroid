package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class ae0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ de0 b;

    public /* synthetic */ ae0(de0 de0Var, int i10) {
        this.a = i10;
        this.b = de0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                de0 de0Var = this.b;
                ei.e2 e2Var = de0Var.c;
                e2Var.requestFocus();
                String str = de0Var.K;
                if (str != null) {
                    if (str.length() > 1) {
                        String obj = e2Var.getText().toString();
                        int length = obj.length();
                        int i10 = 0;
                        while (i10 < length && obj.charAt(i10) <= ' ') {
                            i10++;
                        }
                        int length2 = de0Var.K.length() + i10;
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
