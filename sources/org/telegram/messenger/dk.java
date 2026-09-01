package org.telegram.messenger;

import android.app.Activity;
import java.util.Locale;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.fn0;
import org.telegram.ui.jn;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final /* synthetic */ class dk implements org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ dk(SendMessagesHelper sendMessagesHelper, boolean z4, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, xn xnVar) {
        this.c = sendMessagesHelper;
        this.b = z4;
        this.d = messageObject;
        this.e = keyboardButtonProto;
        this.f = xnVar;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        int i11;
        int i12 = this.a;
        boolean z4 = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i12) {
            case 0:
                ((SendMessagesHelper) obj4).lambda$sendCallback$41(this.b, (MessageObject) obj3, (TL_keyboard.KeyboardButtonProto) obj2, (xn) obj, d2Var, i10);
                break;
            case 1:
                jn jnVar = (jn) obj4;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                xn xnVar = jnVar.a;
                lh.a1 a1Var = new lh.a1(23, jnVar, (org.telegram.ui.Cells.t1) obj3);
                if (!((boolean[]) obj2)[0]) {
                    a1Var.run(Boolean.FALSE);
                    break;
                } else if (!z4 && (contentsettings == null || !contentsettings.sensitive_can_change)) {
                    a1Var.run(Boolean.TRUE);
                    break;
                } else {
                    Activity parentActivity = xnVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                    ThemeActivity.C0(i11, parentActivity, new lh.a1(24, jnVar, a1Var), xnVar.getResourceProvider());
                    break;
                }
            default:
                yc0 yc0Var = (yc0) obj4;
                yc0 yc0Var2 = (yc0) obj3;
                yc0 yc0Var3 = (yc0) obj2;
                e3.d dVar = (e3.d) obj;
                if (z4) {
                    org.telegram.ui.Components.z4.d(yc0Var, yc0Var2, yc0Var3);
                }
                int value = yc0Var3.getValue();
                int value2 = yc0Var2.getValue();
                int value3 = yc0Var.getValue();
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

    public /* synthetic */ dk(jn jnVar, org.telegram.ui.Cells.t1 t1Var, boolean[] zArr, boolean z4, TL_account.contentSettings contentsettings) {
        this.c = jnVar;
        this.d = t1Var;
        this.e = zArr;
        this.b = z4;
        this.f = contentsettings;
    }

    public /* synthetic */ dk(boolean z4, yc0 yc0Var, yc0 yc0Var2, yc0 yc0Var3, e3.d dVar) {
        this.b = z4;
        this.c = yc0Var;
        this.d = yc0Var2;
        this.e = yc0Var3;
        this.f = dVar;
    }
}
