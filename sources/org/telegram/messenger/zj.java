package org.telegram.messenger;

import android.app.Activity;
import java.util.Locale;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.qc0;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.fn;
import org.telegram.ui.tm;
import org.telegram.ui.tn;
import org.telegram.ui.vm0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class zj implements org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ zj(SendMessagesHelper sendMessagesHelper, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, tn tnVar) {
        this.c = sendMessagesHelper;
        this.b = z10;
        this.d = messageObject;
        this.e = keyboardButtonProto;
        this.f = tnVar;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        int i11;
        int i12 = this.a;
        boolean z10 = this.b;
        int i13 = 2;
        int i14 = 1;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i12) {
            case 0:
                ((SendMessagesHelper) obj4).lambda$sendCallback$41(this.b, (MessageObject) obj3, (TL_keyboard.KeyboardButtonProto) obj2, (tn) obj, c2Var, i10);
                break;
            case 1:
                fn fnVar = (fn) obj4;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                tn tnVar = fnVar.a;
                tm tmVar = new tm(i14, fnVar, (org.telegram.ui.Cells.s1) obj3);
                if (!((boolean[]) obj2)[0]) {
                    tmVar.run(Boolean.FALSE);
                    break;
                } else if (!z10 && (contentsettings == null || !contentsettings.sensitive_can_change)) {
                    tmVar.run(Boolean.TRUE);
                    break;
                } else {
                    Activity parentActivity = tnVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
                    ThemeActivity.C0(i11, parentActivity, new tm(i13, fnVar, tmVar), tnVar.getResourceProvider());
                    break;
                }
            default:
                qc0 qc0Var = (qc0) obj4;
                qc0 qc0Var2 = (qc0) obj3;
                qc0 qc0Var3 = (qc0) obj2;
                e3.d dVar = (e3.d) obj;
                if (z10) {
                    org.telegram.ui.Components.c5.d(qc0Var, qc0Var2, qc0Var3);
                }
                int value = qc0Var3.getValue();
                int value2 = qc0Var2.getValue();
                int value3 = qc0Var.getValue();
                vm0 vm0Var = (vm0) dVar.c;
                int i15 = dVar.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) dVar.d;
                if (i15 == 8) {
                    int[] iArr = vm0Var.x;
                    iArr[0] = value;
                    iArr[1] = value2 + 1;
                    iArr[2] = value3;
                } else {
                    vm0Var.getClass();
                }
                editTextBoldCursor.setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(value3), Integer.valueOf(value2 + 1), Integer.valueOf(value)));
                break;
        }
    }

    public /* synthetic */ zj(fn fnVar, org.telegram.ui.Cells.s1 s1Var, boolean[] zArr, boolean z10, TL_account.contentSettings contentsettings) {
        this.c = fnVar;
        this.d = s1Var;
        this.e = zArr;
        this.b = z10;
        this.f = contentsettings;
    }

    public /* synthetic */ zj(boolean z10, qc0 qc0Var, qc0 qc0Var2, qc0 qc0Var3, e3.d dVar) {
        this.b = z10;
        this.c = qc0Var;
        this.d = qc0Var2;
        this.e = qc0Var3;
        this.f = dVar;
    }
}
