package org.telegram.messenger;

import android.app.Activity;
import java.util.Locale;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.vc0;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.co;
import org.telegram.ui.on;
import org.telegram.ui.pn0;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final /* synthetic */ class bk implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ bk(SendMessagesHelper sendMessagesHelper, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, co coVar) {
        this.c = sendMessagesHelper;
        this.b = z10;
        this.d = messageObject;
        this.e = keyboardButtonProto;
        this.f = coVar;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        int i12 = this.a;
        boolean z10 = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i12) {
            case 0:
                ((SendMessagesHelper) obj4).lambda$sendCallback$41(this.b, (MessageObject) obj3, (TL_keyboard.KeyboardButtonProto) obj2, (co) obj, b2Var, i10);
                break;
            case 1:
                on onVar = (on) obj4;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                co coVar = onVar.a;
                org.telegram.ui.nf nfVar = new org.telegram.ui.nf(6, onVar, (org.telegram.ui.Cells.t1) obj3);
                if (!((boolean[]) obj2)[0]) {
                    nfVar.run(Boolean.FALSE);
                    break;
                } else if (!z10 && (contentsettings == null || !contentsettings.sensitive_can_change)) {
                    nfVar.run(Boolean.TRUE);
                    break;
                } else {
                    Activity parentActivity = coVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
                    ThemeActivity.C0(i11, parentActivity, new org.telegram.ui.nf(7, onVar, nfVar), coVar.getResourceProvider());
                    break;
                }
            default:
                vc0 vc0Var = (vc0) obj4;
                vc0 vc0Var2 = (vc0) obj3;
                vc0 vc0Var3 = (vc0) obj2;
                hg.c2 c2Var = (hg.c2) obj;
                if (z10) {
                    org.telegram.ui.Components.e5.d(vc0Var, vc0Var2, vc0Var3);
                }
                int value = vc0Var3.getValue();
                int value2 = vc0Var2.getValue();
                int value3 = vc0Var.getValue();
                pn0 pn0Var = (pn0) c2Var.c;
                int i13 = c2Var.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) c2Var.d;
                if (i13 == 8) {
                    int[] iArr = pn0Var.x;
                    iArr[0] = value;
                    iArr[1] = value2 + 1;
                    iArr[2] = value3;
                } else {
                    pn0Var.getClass();
                }
                editTextBoldCursor.setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(value3), Integer.valueOf(value2 + 1), Integer.valueOf(value)));
                break;
        }
    }

    public /* synthetic */ bk(on onVar, org.telegram.ui.Cells.t1 t1Var, boolean[] zArr, boolean z10, TL_account.contentSettings contentsettings) {
        this.c = onVar;
        this.d = t1Var;
        this.e = zArr;
        this.b = z10;
        this.f = contentsettings;
    }

    public /* synthetic */ bk(boolean z10, vc0 vc0Var, vc0 vc0Var2, vc0 vc0Var3, hg.c2 c2Var) {
        this.b = z10;
        this.c = vc0Var;
        this.d = vc0Var2;
        this.e = vc0Var3;
        this.f = c2Var;
    }
}
