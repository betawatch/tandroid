package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class me0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pe0 b;

    public /* synthetic */ me0(pe0 pe0Var, int i10) {
        this.a = i10;
        this.b = pe0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pe0 pe0Var = this.b;
                lg.f fVar = pe0Var.c;
                fVar.requestFocus();
                String str = pe0Var.H;
                if (str != null) {
                    if (str.length() > 1) {
                        String obj = fVar.getText().toString();
                        int length = obj.length();
                        int i10 = 0;
                        while (i10 < length && obj.charAt(i10) <= ' ') {
                            i10++;
                        }
                        int length2 = pe0Var.H.length() + i10;
                        fVar.setSelection(Utilities.clamp(length2 + ((length2 < 0 || length2 >= obj.length() || obj.charAt(length2) != ' ') ? 0 : 1), obj.length(), 0), fVar.getText().length());
                        break;
                    }
                }
                fVar.setSelection(0, fVar.getText().length());
                break;
            case 1:
                this.b.q(true);
                break;
            case 2:
                this.b.o(false);
                break;
            default:
                lg.f fVar2 = this.b.c;
                if (fVar2 != null) {
                    fVar2.requestFocus();
                    fVar2.setSelection(fVar2.length());
                    AndroidUtilities.showKeyboard(fVar2);
                    break;
                }
                break;
        }
    }
}
