package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n4 b;
    public final /* synthetic */ String c;

    public /* synthetic */ a0(n4 n4Var, String str, int i10) {
        this.a = i10;
        this.b = n4Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n4 n4Var = this.b;
                lh.n nVar = n4Var.e0.V;
                String str = this.c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                nVar.setText(str);
                lh.n nVar2 = n4Var.e0.V;
                nVar2.setSelection(nVar2.getText().length());
                AndroidUtilities.showKeyboard(n4Var.e0.V);
                break;
            default:
                ze.d.m(this.b.I, this.c, false, null);
                break;
        }
    }
}
