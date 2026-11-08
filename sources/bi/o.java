package bi;

import android.text.SpannableString;
import java.util.Arrays;
import org.telegram.messenger.c20;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.pf;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.c40;
import org.telegram.ui.kp;
import org.telegram.ui.p90;
import org.telegram.ui.qv0;
import org.telegram.ui.rv0;
import org.telegram.ui.ww;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ o(z zVar, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z9, long j3) {
        this.e = zVar;
        this.f = tL_error;
        this.d = tLObject;
        this.h = twoStepVerificationActivity;
        this.c = z9;
        this.b = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        long j3 = this.b;
        boolean z9 = this.c;
        Object obj = this.h;
        Object obj2 = this.d;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (i7) {
            case 0:
                z zVar = (z) obj4;
                TLObject tLObject = (TLObject) obj2;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                if (((TLRPC.TL_error) obj3) == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.r0(password);
                    zVar.u0(this.c, this.b, twoStepVerificationActivity.q0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 1:
                di.i4 i4Var = (di.i4) obj4;
                final qp qpVar = (qp) obj3;
                String str = (String) obj;
                TLObject tLObject2 = (TLObject) obj2;
                di.y6 P1 = qpVar.P1();
                final long j10 = this.b;
                final boolean z10 = this.c;
                P1.l0(j10, z10, false);
                m4.d0 d0Var = new m4.d0();
                final int i10 = 0;
                d0Var.a = new Runnable() { // from class: di.c2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                qpVar.P1().l0(j10, !z10, false);
                                break;
                            default:
                                qpVar.P1().l0(j10, z10, true);
                                break;
                        }
                    }
                };
                final int i11 = 1;
                d0Var.b = new Runnable() { // from class: di.c2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                qpVar.P1().l0(j10, !z10, false);
                                break;
                            default:
                                qpVar.P1().l0(j10, z10, true);
                                break;
                        }
                    }
                };
                org.telegram.ui.Components.cc V = new org.telegram.ui.Components.hc(i4Var.M0, i4Var.k0).V(Arrays.asList(tLObject2), !z10 ? org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131744761, org.telegram.messenger.g5.m(10, str, null))) : org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131744762, org.telegram.messenger.g5.m(10, str, null))), null, d0Var);
                V.a = 2;
                V.k(true);
                return;
            case 2:
                di.y6 y6Var = (di.y6) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                c20 c20Var = (c20) obj2;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj;
                if (tL_error == null) {
                    c20Var.a(Boolean.TRUE);
                    return;
                }
                if (tL_error.text.contains("BOOSTS_REQUIRED")) {
                    if (!z9) {
                        c20Var.a(Boolean.FALSE);
                        return;
                    }
                    qp s12 = qp.s1(y6Var.a);
                    org.telegram.messenger.f3 G0 = s12.G0();
                    long j11 = this.b;
                    G0.a(j11, new r2(y6Var, c20Var, s12, j11, 2));
                    return;
                }
                if (tL_error.text.startsWith("STORY_LIVE_ALREADY_")) {
                    org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                    if (z9 && Q != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, Q.getContext(), f6Var);
                        String M0 = org.telegram.messenger.id.M0(2131748827, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                        u1Var.R = M0;
                        u1Var.T = org.telegram.messenger.id.M0(2131748828, null);
                        jg.g.C(null, 2131747832, alertDialog$Builder, null);
                    }
                    c20Var.a(Boolean.FALSE);
                    return;
                }
                if (!tL_error.text.equalsIgnoreCase("PREMIUM_ACCOUNT_REQUIRED")) {
                    org.telegram.ui.Components.hc X = org.telegram.ui.Components.hc.X();
                    if (X != null) {
                        X.f0(tL_error, false);
                    }
                    c20Var.a(Boolean.FALSE);
                    return;
                }
                org.telegram.ui.ActionBar.f2 Q2 = LaunchActivity.Q();
                if (z9 && Q2 != null) {
                    Q2.showDialog(new ug.w0(Q2, 14, true));
                }
                c20Var.a(Boolean.FALSE);
                return;
            case 3:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj3;
                String str2 = (String) obj2;
                TLRPC.Document document = (TLRPC.Document) obj;
                ChatActivityEnterView chatActivityEnterView = ((pf) obj4).a;
                if (editTextBoldCursor == null) {
                    return;
                }
                int selectionEnd = editTextBoldCursor.getSelectionEnd();
                if (selectionEnd < 0) {
                    selectionEnd = 0;
                }
                try {
                    try {
                        chatActivityEnterView.S2 = 2;
                        if (str2 == null) {
                            str2 = "😀";
                        }
                        SpannableString spannableString = new SpannableString(str2);
                        org.telegram.ui.Components.r5 r5Var = document != null ? new org.telegram.ui.Components.r5(document, editTextBoldCursor.getPaint().getFontMetricsInt()) : new org.telegram.ui.Components.r5(j3, editTextBoldCursor.getPaint().getFontMetricsInt());
                        if (!z9) {
                            r5Var.fromEmojiKeyboard = true;
                        }
                        r5Var.cacheType = org.telegram.ui.Components.i5.f();
                        spannableString.setSpan(r5Var, 0, spannableString.length(), 33);
                        editTextBoldCursor.setText(editTextBoldCursor.getText().insert(selectionEnd, spannableString));
                        editTextBoldCursor.setSelection(spannableString.length() + selectionEnd, selectionEnd + spannableString.length());
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                    chatActivityEnterView.S2 = 0;
                    return;
                } catch (Throwable th2) {
                    chatActivityEnterView.S2 = 0;
                    throw th2;
                }
            case 4:
                c40 c40Var = (c40) obj4;
                org.telegram.ui.ActionBar.u1[] u1VarArr = (org.telegram.ui.ActionBar.u1[]) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj3;
                TL_phone.inviteToGroupCall invitetogroupcall = (TL_phone.inviteToGroupCall) obj;
                try {
                    u1VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                u1VarArr[0] = null;
                if (z9 && "USER_NOT_PARTICIPANT".equals(tL_error2.text)) {
                    c40Var.C1(null, j3, 3);
                    return;
                } else {
                    org.telegram.ui.Components.v4.c0(c40Var.a, tL_error2, (org.telegram.ui.ActionBar.f2) c40Var.Z1.M().getFragmentStack().get(c40Var.Z1.M().getFragmentStack().size() - 1), invitetogroupcall, new Object[0]);
                    return;
                }
            case 5:
                p90 p90Var = (p90) obj4;
                TLObject tLObject3 = (TLObject) obj2;
                String str3 = (String) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj3;
                int i12 = p90Var.b;
                p90Var.c();
                if (!(tLObject3 instanceof TLRPC.TL_contacts_resolvedPeer)) {
                    if (tL_error3 != null) {
                        p90.d().f0(tL_error3, false);
                        return;
                    }
                    return;
                }
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject3;
                qp.s1(i12).Y3(tL_contacts_resolvedPeer.users, false);
                qp.s1(i12).S3(tL_contacts_resolvedPeer.chats, false);
                TLRPC.User a22 = qp.s1(i12).a2(Long.valueOf(tL_contacts_resolvedPeer.peer.user_id));
                if (a22 != null) {
                    org.telegram.ui.Wallet.m9 m9Var = new org.telegram.ui.Wallet.m9(a22);
                    m9Var.s = j3;
                    m9Var.g0 = str3;
                    m9Var.h0 = z9;
                    m9Var.f0 = true;
                    p90Var.u(m9Var, false);
                    return;
                }
                return;
            default:
                rv0 rv0Var = (rv0) obj4;
                ProfileActivity profileActivity = rv0Var.b;
                kp kpVar = new kp(profileActivity.d1, -j3, (TLRPC.TL_chatAdminRights) obj3, null, null, (String) obj2, 2, true, !z9, null);
                kpVar.X0 = new qv0(rv0Var, (ww) obj);
                profileActivity.presentFragment(kpVar);
                return;
        }
    }

    public /* synthetic */ o(di.i4 i4Var, qp qpVar, long j3, boolean z9, String str, TLObject tLObject) {
        this.e = i4Var;
        this.f = qpVar;
        this.b = j3;
        this.c = z9;
        this.h = str;
        this.d = tLObject;
    }

    public /* synthetic */ o(di.y6 y6Var, TLRPC.TL_error tL_error, boolean z9, long j3, c20 c20Var, org.telegram.ui.ActionBar.f6 f6Var) {
        this.e = y6Var;
        this.f = tL_error;
        this.c = z9;
        this.b = j3;
        this.d = c20Var;
        this.h = f6Var;
    }

    public /* synthetic */ o(pf pfVar, EditTextBoldCursor editTextBoldCursor, String str, TLRPC.Document document, long j3, boolean z9) {
        this.e = pfVar;
        this.f = editTextBoldCursor;
        this.d = str;
        this.h = document;
        this.b = j3;
        this.c = z9;
    }

    public /* synthetic */ o(c40 c40Var, org.telegram.ui.ActionBar.u1[] u1VarArr, boolean z9, TLRPC.TL_error tL_error, long j3, TL_phone.inviteToGroupCall invitetogroupcall) {
        this.e = c40Var;
        this.d = u1VarArr;
        this.c = z9;
        this.f = tL_error;
        this.b = j3;
        this.h = invitetogroupcall;
    }

    public /* synthetic */ o(p90 p90Var, TLObject tLObject, long j3, String str, boolean z9, TLRPC.TL_error tL_error) {
        this.e = p90Var;
        this.d = tLObject;
        this.b = j3;
        this.h = str;
        this.c = z9;
        this.f = tL_error;
    }

    public /* synthetic */ o(rv0 rv0Var, long j3, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str, boolean z9, ww wwVar) {
        this.e = rv0Var;
        this.b = j3;
        this.f = tL_chatAdminRights;
        this.d = str;
        this.c = z9;
        this.h = wwVar;
    }
}
