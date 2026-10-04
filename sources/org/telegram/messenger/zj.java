package org.telegram.messenger;

import android.app.Activity;
import java.io.IOException;
import java.util.Locale;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.gd0;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.kn;
import org.telegram.ui.kn0;
import org.telegram.ui.yn;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes.dex */
public final /* synthetic */ class zj implements org.telegram.ui.ActionBar.a2, e2.h {
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
                ((SendMessagesHelper) obj4).lambda$sendCallback$41(this.b, (MessageObject) obj3, (TL_keyboard.KeyboardButtonProto) obj2, (yn) obj, b2Var, i10);
                break;
            case 1:
                kn knVar = (kn) obj4;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                yn ynVar = knVar.a;
                org.telegram.ui.qc qcVar = new org.telegram.ui.qc(11, knVar, (org.telegram.ui.Cells.u1) obj3);
                if (!((boolean[]) obj2)[0]) {
                    qcVar.run(Boolean.FALSE);
                    break;
                } else if (!z10 && (contentsettings == null || !contentsettings.sensitive_can_change)) {
                    qcVar.run(Boolean.TRUE);
                    break;
                } else {
                    Activity parentActivity = ynVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
                    ThemeActivity.C0(i11, parentActivity, new org.telegram.ui.qc(12, knVar, qcVar), ynVar.getResourceProvider());
                    break;
                }
            default:
                gd0 gd0Var = (gd0) obj4;
                gd0 gd0Var2 = (gd0) obj3;
                gd0 gd0Var3 = (gd0) obj2;
                gg.d2 d2Var = (gg.d2) obj;
                if (z10) {
                    org.telegram.ui.Components.e5.d(gd0Var, gd0Var2, gd0Var3);
                }
                int value = gd0Var3.getValue();
                int value2 = gd0Var2.getValue();
                int value3 = gd0Var.getValue();
                kn0 kn0Var = (kn0) d2Var.c;
                int i13 = d2Var.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) d2Var.d;
                if (i13 == 8) {
                    int[] iArr = kn0Var.x;
                    iArr[0] = value;
                    iArr[1] = value2 + 1;
                    iArr[2] = value3;
                } else {
                    kn0Var.getClass();
                }
                editTextBoldCursor.setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(value3), Integer.valueOf(value2 + 1), Integer.valueOf(value)));
                break;
        }
    }

    public /* synthetic */ zj(SendMessagesHelper sendMessagesHelper, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, yn ynVar) {
        this.c = sendMessagesHelper;
        this.b = z10;
        this.d = messageObject;
        this.e = keyboardButtonProto;
        this.f = ynVar;
    }

    public /* synthetic */ zj(kn knVar, org.telegram.ui.Cells.u1 u1Var, boolean[] zArr, boolean z10, TL_account.contentSettings contentsettings) {
        this.c = knVar;
        this.d = u1Var;
        this.e = zArr;
        this.b = z10;
        this.f = contentsettings;
    }

    public /* synthetic */ zj(boolean z10, gd0 gd0Var, gd0 gd0Var2, gd0 gd0Var3, gg.d2 d2Var) {
        this.b = z10;
        this.c = gd0Var;
        this.d = gd0Var2;
        this.e = gd0Var3;
        this.f = d2Var;
    }
}
