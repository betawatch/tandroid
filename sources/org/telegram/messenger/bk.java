package org.telegram.messenger;

import android.app.Activity;
import java.util.Locale;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.uc0;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.bo;
import org.telegram.ui.nn;
import org.telegram.ui.qn0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final /* synthetic */ class bk implements org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ bk(SendMessagesHelper sendMessagesHelper, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, bo boVar) {
        this.c = sendMessagesHelper;
        this.b = z10;
        this.d = messageObject;
        this.e = keyboardButtonProto;
        this.f = boVar;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        int i11;
        int i12 = this.a;
        boolean z10 = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i12) {
            case 0:
                ((SendMessagesHelper) obj4).lambda$sendCallback$41(this.b, (MessageObject) obj3, (TL_keyboard.KeyboardButtonProto) obj2, (bo) obj, c2Var, i10);
                break;
            case 1:
                nn nnVar = (nn) obj4;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                bo boVar = nnVar.a;
                org.telegram.ui.pf pfVar = new org.telegram.ui.pf(6, nnVar, (org.telegram.ui.Cells.t1) obj3);
                if (!((boolean[]) obj2)[0]) {
                    pfVar.run(Boolean.FALSE);
                    break;
                } else if (!z10 && (contentsettings == null || !contentsettings.sensitive_can_change)) {
                    pfVar.run(Boolean.TRUE);
                    break;
                } else {
                    Activity parentActivity = boVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.o2) boVar).currentAccount;
                    ThemeActivity.C0(i11, parentActivity, new org.telegram.ui.pf(7, nnVar, pfVar), boVar.getResourceProvider());
                    break;
                }
            default:
                uc0 uc0Var = (uc0) obj4;
                uc0 uc0Var2 = (uc0) obj3;
                uc0 uc0Var3 = (uc0) obj2;
                gg.d2 d2Var = (gg.d2) obj;
                if (z10) {
                    org.telegram.ui.Components.c5.d(uc0Var, uc0Var2, uc0Var3);
                }
                int value = uc0Var3.getValue();
                int value2 = uc0Var2.getValue();
                int value3 = uc0Var.getValue();
                qn0 qn0Var = (qn0) d2Var.c;
                int i13 = d2Var.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) d2Var.d;
                if (i13 == 8) {
                    int[] iArr = qn0Var.x;
                    iArr[0] = value;
                    iArr[1] = value2 + 1;
                    iArr[2] = value3;
                } else {
                    qn0Var.getClass();
                }
                editTextBoldCursor.setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(value3), Integer.valueOf(value2 + 1), Integer.valueOf(value)));
                break;
        }
    }

    public /* synthetic */ bk(nn nnVar, org.telegram.ui.Cells.t1 t1Var, boolean[] zArr, boolean z10, TL_account.contentSettings contentsettings) {
        this.c = nnVar;
        this.d = t1Var;
        this.e = zArr;
        this.b = z10;
        this.f = contentsettings;
    }

    public /* synthetic */ bk(boolean z10, uc0 uc0Var, uc0 uc0Var2, uc0 uc0Var3, gg.d2 d2Var) {
        this.b = z10;
        this.c = uc0Var;
        this.d = uc0Var2;
        this.e = uc0Var3;
        this.f = d2Var;
    }
}
