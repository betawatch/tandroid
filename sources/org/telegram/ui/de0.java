package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class de0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ge0 b;

    public /* synthetic */ de0(ge0 ge0Var, int i9) {
        this.a = i9;
        this.b = ge0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ge0 ge0Var = this.b;
                fg.g gVar = ge0Var.c;
                gVar.requestFocus();
                String str = ge0Var.G;
                if (str != null) {
                    if (str.length() > 1) {
                        String obj = gVar.getText().toString();
                        int length = obj.length();
                        int i9 = 0;
                        while (i9 < length && obj.charAt(i9) <= ' ') {
                            i9++;
                        }
                        int length2 = ge0Var.G.length() + i9;
                        gVar.setSelection(Utilities.clamp(length2 + ((length2 < 0 || length2 >= obj.length() || obj.charAt(length2) != ' ') ? 0 : 1), obj.length(), 0), gVar.getText().length());
                        break;
                    }
                }
                gVar.setSelection(0, gVar.getText().length());
                break;
            case 1:
                this.b.q(true);
                break;
            case 2:
                this.b.o(false);
                break;
            default:
                fg.g gVar2 = this.b.c;
                if (gVar2 != null) {
                    gVar2.requestFocus();
                    gVar2.setSelection(gVar2.length());
                    AndroidUtilities.showKeyboard(gVar2);
                    break;
                }
                break;
        }
    }
}
