package org.telegram.messenger;

import android.app.Activity;
import java.util.Locale;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.xc0;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.fn0;
import org.telegram.ui.ln;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class dk implements org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ dk(SendMessagesHelper sendMessagesHelper, boolean z4, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, zn znVar) {
        this.c = sendMessagesHelper;
        this.b = z4;
        this.d = messageObject;
        this.e = keyboardButtonProto;
        this.f = znVar;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public final void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        int i11;
        int i12 = this.a;
        boolean z4 = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i12) {
            case 0:
                ((SendMessagesHelper) obj4).lambda$sendCallback$41(this.b, (MessageObject) obj3, (TL_keyboard.KeyboardButtonProto) obj2, (zn) obj, d2Var, i10);
                break;
            case 1:
                ln lnVar = (ln) obj4;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                zn znVar = lnVar.a;
                kh.a1 a1Var = new kh.a1(23, lnVar, (org.telegram.ui.Cells.s1) obj3);
                if (!((boolean[]) obj2)[0]) {
                    a1Var.run(Boolean.FALSE);
                    break;
                } else if (!z4 && (contentsettings == null || !contentsettings.sensitive_can_change)) {
                    a1Var.run(Boolean.TRUE);
                    break;
                } else {
                    Activity parentActivity = znVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
                    ThemeActivity.C0(i11, parentActivity, new kh.a1(24, lnVar, a1Var), znVar.getResourceProvider());
                    break;
                }
            default:
                xc0 xc0Var = (xc0) obj4;
                xc0 xc0Var2 = (xc0) obj3;
                xc0 xc0Var3 = (xc0) obj2;
                e3.d dVar = (e3.d) obj;
                if (z4) {
                    org.telegram.ui.Components.z4.d(xc0Var, xc0Var2, xc0Var3);
                }
                int value = xc0Var3.getValue();
                int value2 = xc0Var2.getValue();
                int value3 = xc0Var.getValue();
                fn0 fn0Var = (fn0) dVar.c;
                int i13 = dVar.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) dVar.d;
                if (i13 == 8) {
                    int[] iArr = fn0Var.x;
                    iArr[0] = value;
                    iArr[1] = value2 + 1;
                    iArr[2] = value3;
                } else {
                    fn0Var.getClass();
                }
                editTextBoldCursor.setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(value3), Integer.valueOf(value2 + 1), Integer.valueOf(value)));
                break;
        }
    }

    public /* synthetic */ dk(ln lnVar, org.telegram.ui.Cells.s1 s1Var, boolean[] zArr, boolean z4, TL_account.contentSettings contentsettings) {
        this.c = lnVar;
        this.d = s1Var;
        this.e = zArr;
        this.b = z4;
        this.f = contentsettings;
    }

    public /* synthetic */ dk(boolean z4, xc0 xc0Var, xc0 xc0Var2, xc0 xc0Var3, e3.d dVar) {
        this.b = z4;
        this.c = xc0Var;
        this.d = xc0Var2;
        this.e = xc0Var3;
        this.f = dVar;
    }
}
