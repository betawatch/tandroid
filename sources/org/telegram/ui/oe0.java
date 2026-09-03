package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                kg.f fVar = re0Var.c;
                fVar.requestFocus();
                String str = re0Var.H;
                if (str != null) {
                    if (str.length() > 1) {
                        String obj = fVar.getText().toString();
                        int length = obj.length();
                        int i10 = 0;
                        while (i10 < length && obj.charAt(i10) <= ' ') {
                            i10++;
                        }
                        int length2 = re0Var.H.length() + i10;
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
                kg.f fVar2 = this.b.c;
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
