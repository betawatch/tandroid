package org.telegram.messenger;

import android.app.Activity;
import java.io.IOException;
import java.util.Locale;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.tc0;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.in0;
import org.telegram.ui.jn;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final /* synthetic */ class ak implements org.telegram.ui.ActionBar.a2, e2.h {
    public final /* synthetic */ int a = 3;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ak(a5.a aVar, u2.t tVar, u2.b0 b0Var, IOException iOException, boolean z10) {
        this.c = aVar;
        this.d = tVar;
        this.e = b0Var;
        this.f = iOException;
        this.b = z10;
    }

    @Override // e2.h
    public void accept(Object obj) {
        a5.a aVar = (a5.a) this.c;
        ((u2.j0) obj).f(aVar.b, (u2.f0) aVar.c, (u2.t) this.d, (u2.b0) this.e, (IOException) this.f, this.b);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        int i12 = this.a;
        boolean z10 = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i12) {
            case 0:
                ((SendMessagesHelper) obj4).lambda$sendCallback$41(this.b, (MessageObject) obj3, (TL_keyboard.KeyboardButtonProto) obj2, (xn) obj, b2Var, i10);
                break;
            case 1:
                jn jnVar = (jn) obj4;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                xn xnVar = jnVar.a;
                org.telegram.ui.oc ocVar = new org.telegram.ui.oc(11, jnVar, (org.telegram.ui.Cells.t1) obj3);
                if (!((boolean[]) obj2)[0]) {
                    ocVar.run(Boolean.FALSE);
                    break;
                } else if (!z10 && (contentsettings == null || !contentsettings.sensitive_can_change)) {
                    ocVar.run(Boolean.TRUE);
                    break;
                } else {
                    Activity parentActivity = xnVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.n2) xnVar).currentAccount;
                    ThemeActivity.C0(i11, parentActivity, new org.telegram.ui.oc(12, jnVar, ocVar), xnVar.getResourceProvider());
                    break;
                }
            default:
                tc0 tc0Var = (tc0) obj4;
                tc0 tc0Var2 = (tc0) obj3;
                tc0 tc0Var3 = (tc0) obj2;
                gg.d2 d2Var = (gg.d2) obj;
                if (z10) {
                    org.telegram.ui.Components.e5.d(tc0Var, tc0Var2, tc0Var3);
                }
                int value = tc0Var3.getValue();
                int value2 = tc0Var2.getValue();
                int value3 = tc0Var.getValue();
                in0 in0Var = (in0) d2Var.c;
                int i13 = d2Var.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) d2Var.d;
                if (i13 == 8) {
                    int[] iArr = in0Var.x;
                    iArr[0] = value;
                    iArr[1] = value2 + 1;
                    iArr[2] = value3;
                } else {
                    in0Var.getClass();
                }
                editTextBoldCursor.setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(value3), Integer.valueOf(value2 + 1), Integer.valueOf(value)));
                break;
        }
    }

    public /* synthetic */ ak(SendMessagesHelper sendMessagesHelper, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, xn xnVar) {
        this.c = sendMessagesHelper;
        this.b = z10;
        this.d = messageObject;
        this.e = keyboardButtonProto;
        this.f = xnVar;
    }

    public /* synthetic */ ak(jn jnVar, org.telegram.ui.Cells.t1 t1Var, boolean[] zArr, boolean z10, TL_account.contentSettings contentsettings) {
        this.c = jnVar;
        this.d = t1Var;
        this.e = zArr;
        this.b = z10;
        this.f = contentsettings;
    }

    public /* synthetic */ ak(boolean z10, tc0 tc0Var, tc0 tc0Var2, tc0 tc0Var3, gg.d2 d2Var) {
        this.b = z10;
        this.c = tc0Var;
        this.d = tc0Var2;
        this.e = tc0Var3;
        this.f = d2Var;
    }
}
