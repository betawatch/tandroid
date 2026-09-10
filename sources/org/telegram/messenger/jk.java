package org.telegram.messenger;

import android.app.Activity;
import java.util.Locale;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.dd0;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.eo;
import org.telegram.ui.on0;
import org.telegram.ui.pn;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class jk implements org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ jk(SendMessagesHelper sendMessagesHelper, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, eo eoVar) {
        this.c = sendMessagesHelper;
        this.b = z10;
        this.d = messageObject;
        this.e = keyboardButtonProto;
        this.f = eoVar;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        int i11;
        int i12 = this.a;
        boolean z10 = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i12) {
            case 0:
                ((SendMessagesHelper) obj4).lambda$sendCallback$41(this.b, (MessageObject) obj3, (TL_keyboard.KeyboardButtonProto) obj2, (eo) obj, d2Var, i10);
                break;
            case 1:
                pn pnVar = (pn) obj4;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                eo eoVar = pnVar.a;
                org.telegram.ui.pf pfVar = new org.telegram.ui.pf(6, pnVar, (org.telegram.ui.Cells.t1) obj3);
                if (!((boolean[]) obj2)[0]) {
                    pfVar.run(Boolean.FALSE);
                    break;
                } else if (!z10 && (contentsettings == null || !contentsettings.sensitive_can_change)) {
                    pfVar.run(Boolean.TRUE);
                    break;
                } else {
                    Activity parentActivity = eoVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
                    ThemeActivity.C0(i11, parentActivity, new org.telegram.ui.pf(7, pnVar, pfVar), eoVar.getResourceProvider());
                    break;
                }
            default:
                dd0 dd0Var = (dd0) obj4;
                dd0 dd0Var2 = (dd0) obj3;
                dd0 dd0Var3 = (dd0) obj2;
                fg.e2 e2Var = (fg.e2) obj;
                if (z10) {
                    org.telegram.ui.Components.d5.d(dd0Var, dd0Var2, dd0Var3);
                }
                int value = dd0Var3.getValue();
                int value2 = dd0Var2.getValue();
                int value3 = dd0Var.getValue();
                on0 on0Var = (on0) e2Var.c;
                int i13 = e2Var.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) e2Var.d;
                if (i13 == 8) {
                    int[] iArr = on0Var.x;
                    iArr[0] = value;
                    iArr[1] = value2 + 1;
                    iArr[2] = value3;
                } else {
                    on0Var.getClass();
                }
                editTextBoldCursor.setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(value3), Integer.valueOf(value2 + 1), Integer.valueOf(value)));
                break;
        }
    }

    public /* synthetic */ jk(pn pnVar, org.telegram.ui.Cells.t1 t1Var, boolean[] zArr, boolean z10, TL_account.contentSettings contentsettings) {
        this.c = pnVar;
        this.d = t1Var;
        this.e = zArr;
        this.b = z10;
        this.f = contentsettings;
    }

    public /* synthetic */ jk(boolean z10, dd0 dd0Var, dd0 dd0Var2, dd0 dd0Var3, fg.e2 e2Var) {
        this.b = z10;
        this.c = dd0Var;
        this.d = dd0Var2;
        this.e = dd0Var3;
        this.f = e2Var;
    }
}
