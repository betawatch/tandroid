package org.telegram.messenger;

import android.app.Activity;
import java.io.IOException;
import java.util.Locale;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ed0;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.gn0;
import org.telegram.ui.in;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class zj implements org.telegram.ui.ActionBar.z1, e2.h {
    public final /* synthetic */ int a = 3;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ zj(a5.a aVar, u2.t tVar, u2.b0 b0Var, IOException iOException, boolean z10) {
        this.c = aVar;
        this.d = tVar;
        this.e = b0Var;
        this.f = iOException;
        this.b = z10;
    }

    @Override // e2.h
    public void accept(Object obj) {
        a5.a aVar = (a5.a) this.c;
        ((u2.k0) obj).f(aVar.b, (u2.f0) aVar.c, (u2.t) this.d, (u2.b0) this.e, (IOException) this.f, this.b);
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        int i11;
        int i12 = this.a;
        boolean z10 = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i12) {
            case 0:
                ((SendMessagesHelper) obj4).lambda$sendCallback$41(this.b, (MessageObject) obj3, (TL_keyboard.KeyboardButtonProto) obj2, (wn) obj, a2Var, i10);
                break;
            case 1:
                in inVar = (in) obj4;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                wn wnVar = inVar.a;
                org.telegram.ui.oc ocVar = new org.telegram.ui.oc(11, inVar, (org.telegram.ui.Cells.u1) obj3);
                if (!((boolean[]) obj2)[0]) {
                    ocVar.run(Boolean.FALSE);
                    break;
                } else if (!z10 && (contentsettings == null || !contentsettings.sensitive_can_change)) {
                    ocVar.run(Boolean.TRUE);
                    break;
                } else {
                    Activity parentActivity = wnVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
                    ThemeActivity.C0(i11, parentActivity, new org.telegram.ui.oc(12, inVar, ocVar), wnVar.getResourceProvider());
                    break;
                }
            default:
                ed0 ed0Var = (ed0) obj4;
                ed0 ed0Var2 = (ed0) obj3;
                ed0 ed0Var3 = (ed0) obj2;
                gg.d2 d2Var = (gg.d2) obj;
                if (z10) {
                    org.telegram.ui.Components.e5.d(ed0Var, ed0Var2, ed0Var3);
                }
                int value = ed0Var3.getValue();
                int value2 = ed0Var2.getValue();
                int value3 = ed0Var.getValue();
                gn0 gn0Var = (gn0) d2Var.c;
                int i13 = d2Var.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) d2Var.d;
                if (i13 == 8) {
                    int[] iArr = gn0Var.x;
                    iArr[0] = value;
                    iArr[1] = value2 + 1;
                    iArr[2] = value3;
                } else {
                    gn0Var.getClass();
                }
                editTextBoldCursor.setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(value3), Integer.valueOf(value2 + 1), Integer.valueOf(value)));
                break;
        }
    }

    public /* synthetic */ zj(SendMessagesHelper sendMessagesHelper, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, wn wnVar) {
        this.c = sendMessagesHelper;
        this.b = z10;
        this.d = messageObject;
        this.e = keyboardButtonProto;
        this.f = wnVar;
    }

    public /* synthetic */ zj(in inVar, org.telegram.ui.Cells.u1 u1Var, boolean[] zArr, boolean z10, TL_account.contentSettings contentsettings) {
        this.c = inVar;
        this.d = u1Var;
        this.e = zArr;
        this.b = z10;
        this.f = contentsettings;
    }

    public /* synthetic */ zj(boolean z10, ed0 ed0Var, ed0 ed0Var2, ed0 ed0Var3, gg.d2 d2Var) {
        this.b = z10;
        this.c = ed0Var;
        this.d = ed0Var2;
        this.e = ed0Var3;
        this.f = d2Var;
    }
}
