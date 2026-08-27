package org.telegram.messenger;

import android.app.Activity;
import java.util.Locale;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.dn;
import org.telegram.ui.rn;
import org.telegram.ui.xm0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class wj implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ wj(SendMessagesHelper sendMessagesHelper, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, rn rnVar) {
        this.c = sendMessagesHelper;
        this.b = z10;
        this.d = messageObject;
        this.e = keyboardButtonProto;
        this.f = rnVar;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        int i12 = this.a;
        int i13 = 8;
        boolean z10 = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i12) {
            case 0:
                ((SendMessagesHelper) obj4).lambda$sendCallback$41(this.b, (MessageObject) obj3, (TL_keyboard.KeyboardButtonProto) obj2, (rn) obj, b2Var, i10);
                break;
            case 1:
                dn dnVar = (dn) obj4;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                rn rnVar = dnVar.a;
                org.telegram.ui.df dfVar = new org.telegram.ui.df(i13, dnVar, (org.telegram.ui.Cells.s1) obj3);
                if (!((boolean[]) obj2)[0]) {
                    dfVar.run(Boolean.FALSE);
                    break;
                } else if (!z10 && (contentsettings == null || !contentsettings.sensitive_can_change)) {
                    dfVar.run(Boolean.TRUE);
                    break;
                } else {
                    Activity parentActivity = rnVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.n2) rnVar).currentAccount;
                    ThemeActivity.C0(i11, parentActivity, new org.telegram.ui.df(9, dnVar, dfVar), rnVar.getResourceProvider());
                    break;
                }
            default:
                fc0 fc0Var = (fc0) obj4;
                fc0 fc0Var2 = (fc0) obj3;
                fc0 fc0Var3 = (fc0) obj2;
                c3.d dVar = (c3.d) obj;
                if (z10) {
                    org.telegram.ui.Components.y4.d(fc0Var, fc0Var2, fc0Var3);
                }
                int value = fc0Var3.getValue();
                int value2 = fc0Var2.getValue();
                int value3 = fc0Var.getValue();
                xm0 xm0Var = (xm0) dVar.c;
                int i14 = dVar.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) dVar.d;
                if (i14 == 8) {
                    int[] iArr = xm0Var.x;
                    iArr[0] = value;
                    iArr[1] = value2 + 1;
                    iArr[2] = value3;
                } else {
                    xm0Var.getClass();
                }
                editTextBoldCursor.setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(value3), Integer.valueOf(value2 + 1), Integer.valueOf(value)));
                break;
        }
    }

    public /* synthetic */ wj(dn dnVar, org.telegram.ui.Cells.s1 s1Var, boolean[] zArr, boolean z10, TL_account.contentSettings contentsettings) {
        this.c = dnVar;
        this.d = s1Var;
        this.e = zArr;
        this.b = z10;
        this.f = contentsettings;
    }

    public /* synthetic */ wj(boolean z10, fc0 fc0Var, fc0 fc0Var2, fc0 fc0Var3, c3.d dVar) {
        this.b = z10;
        this.c = fc0Var;
        this.d = fc0Var2;
        this.e = fc0Var3;
        this.f = dVar;
    }
}
