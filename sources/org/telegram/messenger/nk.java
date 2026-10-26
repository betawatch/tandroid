package org.telegram.messenger;

import android.app.Activity;
import java.io.IOException;
import java.util.Locale;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.md0;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.fn;
import org.telegram.ui.in0;
import org.telegram.ui.un;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class nk implements org.telegram.ui.ActionBar.b2, e2.j {
    public final /* synthetic */ int a = 3;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ nk(a8.ng ngVar, u2.u uVar, u2.c0 c0Var, IOException iOException, boolean z10) {
        this.c = ngVar;
        this.d = uVar;
        this.e = c0Var;
        this.f = iOException;
        this.b = z10;
    }

    @Override // e2.j
    public void accept(Object obj) {
        a8.ng ngVar = (a8.ng) this.c;
        ((u2.k0) obj).f(ngVar.b, (u2.g0) ngVar.c, (u2.u) this.d, (u2.c0) this.e, (IOException) this.f, this.b);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        int i11;
        int i12 = this.a;
        boolean z10 = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i12) {
            case 0:
                ((SendMessagesHelper) obj4).lambda$sendCallback$44(this.b, (MessageObject) obj3, (TL_keyboard.KeyboardButtonProto) obj2, (un) obj, e2Var, i10);
                break;
            case 1:
                fn fnVar = (fn) obj4;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                un unVar = fnVar.a;
                li.s2 s2Var = new li.s2(19, fnVar, (org.telegram.ui.Cells.s1) obj3);
                if (!((boolean[]) obj2)[0]) {
                    s2Var.run(Boolean.FALSE);
                    break;
                } else if (!z10 && (contentsettings == null || !contentsettings.sensitive_can_change)) {
                    s2Var.run(Boolean.TRUE);
                    break;
                } else {
                    Activity parentActivity = unVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
                    ThemeActivity.D0(i11, parentActivity, new li.s2(20, fnVar, s2Var), unVar.getResourceProvider());
                    break;
                }
            default:
                md0 md0Var = (md0) obj4;
                md0 md0Var2 = (md0) obj3;
                md0 md0Var3 = (md0) obj2;
                i2.z zVar = (i2.z) obj;
                if (z10) {
                    org.telegram.ui.Components.g5.d(md0Var, md0Var2, md0Var3);
                }
                int value = md0Var3.getValue();
                int value2 = md0Var2.getValue();
                int value3 = md0Var.getValue();
                in0 in0Var = (in0) zVar.c;
                int i13 = zVar.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) zVar.d;
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

    public /* synthetic */ nk(SendMessagesHelper sendMessagesHelper, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, un unVar) {
        this.c = sendMessagesHelper;
        this.b = z10;
        this.d = messageObject;
        this.e = keyboardButtonProto;
        this.f = unVar;
    }

    public /* synthetic */ nk(fn fnVar, org.telegram.ui.Cells.s1 s1Var, boolean[] zArr, boolean z10, TL_account.contentSettings contentsettings) {
        this.c = fnVar;
        this.d = s1Var;
        this.e = zArr;
        this.b = z10;
        this.f = contentsettings;
    }

    public /* synthetic */ nk(boolean z10, md0 md0Var, md0 md0Var2, md0 md0Var3, i2.z zVar) {
        this.b = z10;
        this.c = md0Var;
        this.d = md0Var2;
        this.e = md0Var3;
        this.f = zVar;
    }
}
