package org.telegram.ui;

import android.app.Activity;
import java.io.IOException;
import java.util.Locale;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class am implements org.telegram.ui.ActionBar.r1, h2.j {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ am(a8.wa waVar, x2.u uVar, x2.c0 c0Var, IOException iOException, boolean z9) {
        this.c = waVar;
        this.d = uVar;
        this.e = c0Var;
        this.f = iOException;
        this.b = z9;
    }

    @Override // h2.j
    public void accept(Object obj) {
        a8.wa waVar = (a8.wa) this.c;
        ((x2.k0) obj).r(waVar.b, (x2.g0) waVar.c, (x2.u) this.d, (x2.c0) this.e, (IOException) this.f, this.b);
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        int i10;
        int i11 = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        boolean z9 = this.b;
        switch (i11) {
            case 0:
                nm nmVar = (nm) obj4;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                cn cnVar = nmVar.a;
                org.telegram.messenger.voip.k kVar = new org.telegram.messenger.voip.k(18, nmVar, (org.telegram.ui.Cells.q1) obj3);
                if (!((boolean[]) obj2)[0]) {
                    kVar.a(Boolean.FALSE);
                    break;
                } else if (!z9 && (contentsettings == null || !contentsettings.sensitive_can_change)) {
                    kVar.a(Boolean.TRUE);
                    break;
                } else {
                    Activity parentActivity = cnVar.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                    ThemeActivity.H0(i10, parentActivity, new org.telegram.messenger.voip.k(19, nmVar, kVar), cnVar.getResourceProvider());
                    break;
                }
            default:
                org.telegram.ui.Components.ib0 ib0Var = (org.telegram.ui.Components.ib0) obj4;
                org.telegram.ui.Components.ib0 ib0Var2 = (org.telegram.ui.Components.ib0) obj3;
                org.telegram.ui.Components.ib0 ib0Var3 = (org.telegram.ui.Components.ib0) obj2;
                jg.a2 a2Var = (jg.a2) obj;
                if (z9) {
                    org.telegram.ui.Components.v4.d(ib0Var, ib0Var2, ib0Var3);
                }
                int value = ib0Var3.getValue();
                int value2 = ib0Var2.getValue();
                int value3 = ib0Var.getValue();
                dk0 dk0Var = (dk0) a2Var.c;
                int i12 = a2Var.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) a2Var.d;
                if (i12 == 8) {
                    int[] iArr = dk0Var.y;
                    iArr[0] = value;
                    iArr[1] = value2 + 1;
                    iArr[2] = value3;
                } else {
                    dk0Var.getClass();
                }
                editTextBoldCursor.setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(value3), Integer.valueOf(value2 + 1), Integer.valueOf(value)));
                break;
        }
    }

    public /* synthetic */ am(nm nmVar, org.telegram.ui.Cells.q1 q1Var, boolean[] zArr, boolean z9, TL_account.contentSettings contentsettings) {
        this.c = nmVar;
        this.d = q1Var;
        this.e = zArr;
        this.b = z9;
        this.f = contentsettings;
    }

    public /* synthetic */ am(boolean z9, org.telegram.ui.Components.ib0 ib0Var, org.telegram.ui.Components.ib0 ib0Var2, org.telegram.ui.Components.ib0 ib0Var3, jg.a2 a2Var) {
        this.b = z9;
        this.c = ib0Var;
        this.d = ib0Var2;
        this.e = ib0Var3;
        this.f = a2Var;
    }
}
