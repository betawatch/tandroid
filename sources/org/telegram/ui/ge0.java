package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
                gg.g gVar = je0Var.c;
                gVar.requestFocus();
                String str = je0Var.G;
                if (str != null) {
                    if (str.length() > 1) {
                        String obj = gVar.getText().toString();
                        int length = obj.length();
                        int i10 = 0;
                        while (i10 < length && obj.charAt(i10) <= ' ') {
                            i10++;
                        }
                        int length2 = je0Var.G.length() + i10;
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
                gg.g gVar2 = this.b.c;
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
