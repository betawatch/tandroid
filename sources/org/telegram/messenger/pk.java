package org.telegram.messenger;

import android.app.Activity;
import java.io.IOException;
import java.util.Locale;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ud0;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.fo;
import org.telegram.ui.qn;
import org.telegram.ui.sn0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final /* synthetic */ class pk implements org.telegram.ui.ActionBar.z1, e2.j {
    public final /* synthetic */ int a = 3;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ pk(a5.a aVar, u2.u uVar, u2.c0 c0Var, IOException iOException, boolean z10) {
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

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        int i11;
        int i12 = this.a;
        boolean z10 = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i12) {
            case 0:
                ((SendMessagesHelper) obj4).lambda$sendCallback$44(this.b, (MessageObject) obj3, (TL_keyboard.KeyboardButtonProto) obj2, (fo) obj, a2Var, i10);
                break;
            case 1:
                qn qnVar = (qn) obj4;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                fo foVar = qnVar.a;
                org.telegram.ui.uc ucVar = new org.telegram.ui.uc(11, qnVar, (org.telegram.ui.Cells.u1) obj3);
                if (!((boolean[]) obj2)[0]) {
                    ucVar.run(Boolean.FALSE);
                    break;
                } else if (!z10 && (contentsettings == null || !contentsettings.sensitive_can_change)) {
                    ucVar.run(Boolean.TRUE);
                    break;
                } else {
                    Activity parentActivity = foVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
                    ThemeActivity.C0(i11, parentActivity, new org.telegram.ui.uc(12, qnVar, ucVar), foVar.getResourceProvider());
                    break;
                }
            default:
                ud0 ud0Var = (ud0) obj4;
                ud0 ud0Var2 = (ud0) obj3;
                ud0 ud0Var3 = (ud0) obj2;
                hg.b2 b2Var = (hg.b2) obj;
                if (z10) {
                    org.telegram.ui.Components.g5.c(ud0Var, ud0Var2, ud0Var3);
                }
                int value = ud0Var3.getValue();
                int value2 = ud0Var2.getValue();
                int value3 = ud0Var.getValue();
                sn0 sn0Var = (sn0) b2Var.c;
                int i13 = b2Var.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) b2Var.d;
                if (i13 == 8) {
                    int[] iArr = sn0Var.x;
                    iArr[0] = value;
                    iArr[1] = value2 + 1;
                    iArr[2] = value3;
                } else {
                    sn0Var.getClass();
                }
                editTextBoldCursor.setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(value3), Integer.valueOf(value2 + 1), Integer.valueOf(value)));
                break;
        }
    }

    public /* synthetic */ pk(SendMessagesHelper sendMessagesHelper, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, fo foVar) {
        this.c = sendMessagesHelper;
        this.b = z10;
        this.d = messageObject;
        this.e = keyboardButtonProto;
        this.f = foVar;
    }

    public /* synthetic */ pk(qn qnVar, org.telegram.ui.Cells.u1 u1Var, boolean[] zArr, boolean z10, TL_account.contentSettings contentsettings) {
        this.c = qnVar;
        this.d = u1Var;
        this.e = zArr;
        this.b = z10;
        this.f = contentsettings;
    }

    public /* synthetic */ pk(boolean z10, ud0 ud0Var, ud0 ud0Var2, ud0 ud0Var3, hg.b2 b2Var) {
        this.b = z10;
        this.c = ud0Var;
        this.d = ud0Var2;
        this.e = ud0Var3;
        this.f = b2Var;
    }
}
