package org.telegram.messenger;

import android.app.Activity;
import java.util.Locale;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bc0;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.cn;
import org.telegram.ui.qn;
import org.telegram.ui.wm0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class sj implements org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ sj(SendMessagesHelper sendMessagesHelper, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, qn qnVar) {
        this.c = sendMessagesHelper;
        this.b = z10;
        this.d = messageObject;
        this.e = keyboardButtonProto;
        this.f = qnVar;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        int i10;
        int i11 = this.a;
        int i12 = 8;
        boolean z10 = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i11) {
            case 0:
                ((SendMessagesHelper) obj4).lambda$sendCallback$41(this.b, (MessageObject) obj3, (TL_keyboard.KeyboardButtonProto) obj2, (qn) obj, c2Var, i9);
                break;
            case 1:
                cn cnVar = (cn) obj4;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                qn qnVar = cnVar.a;
                org.telegram.ui.df dfVar = new org.telegram.ui.df(i12, cnVar, (org.telegram.ui.Cells.t1) obj3);
                if (!((boolean[]) obj2)[0]) {
                    dfVar.run(Boolean.FALSE);
                    break;
                } else if (!z10 && (contentsettings == null || !contentsettings.sensitive_can_change)) {
                    dfVar.run(Boolean.TRUE);
                    break;
                } else {
                    Activity parentActivity = qnVar.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
                    ThemeActivity.B0(i10, parentActivity, new org.telegram.ui.df(9, cnVar, dfVar), qnVar.getResourceProvider());
                    break;
                }
            default:
                bc0 bc0Var = (bc0) obj4;
                bc0 bc0Var2 = (bc0) obj3;
                bc0 bc0Var3 = (bc0) obj2;
                c3.e eVar = (c3.e) obj;
                if (z10) {
                    org.telegram.ui.Components.y4.d(bc0Var, bc0Var2, bc0Var3);
                }
                int value = bc0Var3.getValue();
                int value2 = bc0Var2.getValue();
                int value3 = bc0Var.getValue();
                wm0 wm0Var = (wm0) eVar.c;
                int i13 = eVar.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) eVar.d;
                if (i13 == 8) {
                    int[] iArr = wm0Var.x;
                    iArr[0] = value;
                    iArr[1] = value2 + 1;
                    iArr[2] = value3;
                } else {
                    wm0Var.getClass();
                }
                editTextBoldCursor.setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(value3), Integer.valueOf(value2 + 1), Integer.valueOf(value)));
                break;
        }
    }

    public /* synthetic */ sj(cn cnVar, org.telegram.ui.Cells.t1 t1Var, boolean[] zArr, boolean z10, TL_account.contentSettings contentsettings) {
        this.c = cnVar;
        this.d = t1Var;
        this.e = zArr;
        this.b = z10;
        this.f = contentsettings;
    }

    public /* synthetic */ sj(boolean z10, bc0 bc0Var, bc0 bc0Var2, bc0 bc0Var3, c3.e eVar) {
        this.b = z10;
        this.c = bc0Var;
        this.d = bc0Var2;
        this.e = bc0Var3;
        this.f = eVar;
    }
}
