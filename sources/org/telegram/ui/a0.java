package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m4 b;
    public final /* synthetic */ String c;

    public /* synthetic */ a0(m4 m4Var, String str, int i10) {
        this.a = i10;
        this.b = m4Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m4 m4Var = this.b;
                hh.o oVar = m4Var.d0.U;
                String str = this.c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                oVar.setText(str);
                hh.o oVar2 = m4Var.d0.U;
                oVar2.setSelection(oVar2.getText().length());
                AndroidUtilities.showKeyboard(m4Var.d0.U);
                break;
            default:
                we.e.m(this.b.H, this.c, false, null);
                break;
        }
    }
}
