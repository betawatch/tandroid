package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
                jh.m mVar = m4Var.d0.U;
                String str = this.c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                mVar.setText(str);
                jh.m mVar2 = m4Var.d0.U;
                mVar2.setSelection(mVar2.getText().length());
                AndroidUtilities.showKeyboard(m4Var.d0.U);
                break;
            default:
                ye.d.m(this.b.H, this.c, false, null);
                break;
        }
    }
}
