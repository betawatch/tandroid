package org.telegram.messenger;

import android.app.Activity;
import java.io.IOException;
import java.util.Locale;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ud0;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.ln;
import org.telegram.ui.nn0;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final /* synthetic */ class mk implements org.telegram.ui.ActionBar.a2, e2.h {
    public final /* synthetic */ int a = 3;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ mk(a5.a aVar, u2.t tVar, u2.b0 b0Var, IOException iOException, boolean z10) {
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
                ((SendMessagesHelper) obj4).lambda$sendCallback$44(this.b, (MessageObject) obj3, (TL_keyboard.KeyboardButtonProto) obj2, (zn) obj, b2Var, i10);
                break;
            case 1:
                ln lnVar = (ln) obj4;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                zn znVar = lnVar.a;
                org.telegram.ui.pc pcVar = new org.telegram.ui.pc(11, lnVar, (org.telegram.ui.Cells.u1) obj3);
                if (!((boolean[]) obj2)[0]) {
                    pcVar.run(Boolean.FALSE);
                    break;
                } else if (!z10 && (contentsettings == null || !contentsettings.sensitive_can_change)) {
                    pcVar.run(Boolean.TRUE);
                    break;
                } else {
                    Activity parentActivity = znVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                    ThemeActivity.C0(i11, parentActivity, new org.telegram.ui.pc(12, lnVar, pcVar), znVar.getResourceProvider());
                    break;
                }
            default:
                ud0 ud0Var = (ud0) obj4;
                ud0 ud0Var2 = (ud0) obj3;
                ud0 ud0Var3 = (ud0) obj2;
                gg.c2 c2Var = (gg.c2) obj;
                if (z10) {
                    org.telegram.ui.Components.g5.c(ud0Var, ud0Var2, ud0Var3);
                }
                int value = ud0Var3.getValue();
                int value2 = ud0Var2.getValue();
                int value3 = ud0Var.getValue();
                nn0 nn0Var = (nn0) c2Var.c;
                int i13 = c2Var.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) c2Var.d;
                if (i13 == 8) {
                    int[] iArr = nn0Var.x;
                    iArr[0] = value;
                    iArr[1] = value2 + 1;
                    iArr[2] = value3;
                } else {
                    nn0Var.getClass();
                }
                editTextBoldCursor.setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(value3), Integer.valueOf(value2 + 1), Integer.valueOf(value)));
                break;
        }
    }

    public /* synthetic */ mk(SendMessagesHelper sendMessagesHelper, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, zn znVar) {
        this.c = sendMessagesHelper;
        this.b = z10;
        this.d = messageObject;
        this.e = keyboardButtonProto;
        this.f = znVar;
    }

    public /* synthetic */ mk(ln lnVar, org.telegram.ui.Cells.u1 u1Var, boolean[] zArr, boolean z10, TL_account.contentSettings contentsettings) {
        this.c = lnVar;
        this.d = u1Var;
        this.e = zArr;
        this.b = z10;
        this.f = contentsettings;
    }

    public /* synthetic */ mk(boolean z10, ud0 ud0Var, ud0 ud0Var2, ud0 ud0Var3, gg.c2 c2Var) {
        this.b = z10;
        this.c = ud0Var;
        this.d = ud0Var2;
        this.e = ud0Var3;
        this.f = c2Var;
    }
}
