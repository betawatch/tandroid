package org.telegram.messenger;

import android.app.Activity;
import java.io.IOException;
import java.util.Locale;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.od0;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.en;
import org.telegram.ui.sn;
import org.telegram.ui.xm0;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final /* synthetic */ class ik implements org.telegram.ui.ActionBar.a2, e2.j {
    public final /* synthetic */ int a = 3;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ik(a5.a aVar, u2.u uVar, u2.c0 c0Var, IOException iOException, boolean z10) {
        this.c = aVar;
        this.d = uVar;
        this.e = c0Var;
        this.f = iOException;
        this.b = z10;
    }

    @Override // e2.j
    public void accept(Object obj) {
        a5.a aVar = (a5.a) this.c;
        ((u2.k0) obj).g(aVar.b, (u2.g0) aVar.c, (u2.u) this.d, (u2.c0) this.e, (IOException) this.f, this.b);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        int i12 = this.a;
        boolean z10 = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i12) {
            case 0:
                ((SendMessagesHelper) obj4).lambda$sendCallback$44(this.b, (MessageObject) obj3, (TL_keyboard.KeyboardButtonProto) obj2, (sn) obj, b2Var, i10);
                break;
            case 1:
                en enVar = (en) obj4;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                sn snVar = enVar.a;
                org.telegram.ui.ActionBar.j3 j3Var = new org.telegram.ui.ActionBar.j3(17, enVar, (org.telegram.ui.Cells.u1) obj3);
                if (!((boolean[]) obj2)[0]) {
                    j3Var.run(Boolean.FALSE);
                    break;
                } else if (!z10 && (contentsettings == null || !contentsettings.sensitive_can_change)) {
                    j3Var.run(Boolean.TRUE);
                    break;
                } else {
                    Activity parentActivity = snVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
                    ThemeActivity.C0(i11, parentActivity, new org.telegram.ui.ActionBar.j3(18, enVar, j3Var), snVar.getResourceProvider());
                    break;
                }
            default:
                od0 od0Var = (od0) obj4;
                od0 od0Var2 = (od0) obj3;
                od0 od0Var3 = (od0) obj2;
                hg.b2 b2Var2 = (hg.b2) obj;
                if (z10) {
                    org.telegram.ui.Components.f5.c(od0Var, od0Var2, od0Var3);
                }
                int value = od0Var3.getValue();
                int value2 = od0Var2.getValue();
                int value3 = od0Var.getValue();
                xm0 xm0Var = (xm0) b2Var2.c;
                int i13 = b2Var2.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) b2Var2.d;
                if (i13 == 8) {
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

    public /* synthetic */ ik(SendMessagesHelper sendMessagesHelper, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, sn snVar) {
        this.c = sendMessagesHelper;
        this.b = z10;
        this.d = messageObject;
        this.e = keyboardButtonProto;
        this.f = snVar;
    }

    public /* synthetic */ ik(en enVar, org.telegram.ui.Cells.u1 u1Var, boolean[] zArr, boolean z10, TL_account.contentSettings contentsettings) {
        this.c = enVar;
        this.d = u1Var;
        this.e = zArr;
        this.b = z10;
        this.f = contentsettings;
    }

    public /* synthetic */ ik(boolean z10, od0 od0Var, od0 od0Var2, od0 od0Var3, hg.b2 b2Var) {
        this.b = z10;
        this.c = od0Var;
        this.d = od0Var2;
        this.e = od0Var3;
        this.f = b2Var;
    }
}
