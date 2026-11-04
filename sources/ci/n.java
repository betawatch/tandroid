package ci;

import android.text.SpannableString;
import java.util.Arrays;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.nf;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.hv0;
import org.telegram.ui.ip;
import org.telegram.ui.iv0;
import org.telegram.ui.m90;
import org.telegram.ui.uw;
import org.telegram.ui.x30;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ n(v vVar, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, long j10) {
        this.e = vVar;
        this.f = tL_error;
        this.d = tLObject;
        this.h = twoStepVerificationActivity;
        this.c = z10;
        this.b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        long j10 = this.b;
        boolean z10 = this.c;
        Object obj = this.h;
        Object obj2 = this.d;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (i3) {
            case 0:
                v vVar = (v) obj4;
                TLObject tLObject = (TLObject) obj2;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                if (((TLRPC.TL_error) obj3) == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    twoStepVerificationActivity.J = password;
                    TwoStepVerificationActivity.r0(password);
                    vVar.u0(this.c, this.b, twoStepVerificationActivity.q0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 1:
                ei.j4 j4Var = (ei.j4) obj4;
                final hp hpVar = (hp) obj3;
                String str = (String) obj;
                TLObject tLObject2 = (TLObject) obj2;
                ei.z6 P1 = hpVar.P1();
                final long j11 = this.b;
                final boolean z11 = this.c;
                P1.l0(j11, z11, false);
                m2.t tVar = new m2.t(12, false);
                final int i10 = 0;
                tVar.b = new Runnable() { // from class: ei.g2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                hpVar.P1().l0(j11, !z11, false);
                                break;
                            default:
                                hpVar.P1().l0(j11, z11, true);
                                break;
                        }
                    }
                };
                final int i11 = 1;
                tVar.c = new Runnable() { // from class: ei.g2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                hpVar.P1().l0(j11, !z11, false);
                                break;
                            default:
                                hpVar.P1().l0(j11, z11, true);
                                break;
                        }
                    }
                };
                org.telegram.ui.Components.ac V = new org.telegram.ui.Components.fc(j4Var.N0, j4Var.l0).V(Arrays.asList(tLObject2), !z11 ? org.telegram.messenger.g0.X2(bd.a0(null, null, 2131744768, org.telegram.messenger.g5.m(10, str, null))) : org.telegram.messenger.g0.X2(bd.a0(null, null, 2131744769, org.telegram.messenger.g5.m(10, str, null))), null, tVar);
                V.a = 2;
                V.k(true);
                return;
            case 2:
                ei.z6 z6Var = (ei.z6) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                u10 u10Var = (u10) obj2;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj;
                if (tL_error == null) {
                    u10Var.a(Boolean.TRUE);
                    return;
                }
                if (tL_error.text.contains("BOOSTS_REQUIRED")) {
                    if (!z10) {
                        u10Var.a(Boolean.FALSE);
                        return;
                    }
                    hp s12 = hp.s1(z6Var.a);
                    org.telegram.messenger.f3 G0 = s12.G0();
                    long j12 = this.b;
                    G0.a(j12, new ai.m1(z6Var, u10Var, s12, j12));
                    return;
                }
                if (tL_error.text.startsWith("STORY_LIVE_ALREADY_")) {
                    org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
                    if (z10 && Q != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, Q.getContext(), e6Var);
                        String M0 = bd.M0(2131748834, null);
                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                        s1Var.S = M0;
                        s1Var.U = bd.M0(2131748835, null);
                        k2.p1.B(null, 2131747839, alertDialog$Builder, null);
                    }
                    u10Var.a(Boolean.FALSE);
                    return;
                }
                if (!tL_error.text.equalsIgnoreCase("PREMIUM_ACCOUNT_REQUIRED")) {
                    org.telegram.ui.Components.fc X = org.telegram.ui.Components.fc.X();
                    if (X != null) {
                        X.f0(tL_error, false);
                    }
                    u10Var.a(Boolean.FALSE);
                    return;
                }
                org.telegram.ui.ActionBar.d2 Q2 = LaunchActivity.Q();
                if (z10 && Q2 != null) {
                    Q2.showDialog(new vg.v0(Q2, 14, true));
                }
                u10Var.a(Boolean.FALSE);
                return;
            case 3:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj3;
                String str2 = (String) obj2;
                TLRPC.Document document = (TLRPC.Document) obj;
                ChatActivityEnterView chatActivityEnterView = ((nf) obj4).a;
                if (editTextBoldCursor == null) {
                    return;
                }
                int selectionEnd = editTextBoldCursor.getSelectionEnd();
                if (selectionEnd < 0) {
                    selectionEnd = 0;
                }
                try {
                    try {
                        chatActivityEnterView.T2 = 2;
                        if (str2 == null) {
                            str2 = "😀";
                        }
                        SpannableString spannableString = new SpannableString(str2);
                        org.telegram.ui.Components.p5 p5Var = document != null ? new org.telegram.ui.Components.p5(document, editTextBoldCursor.getPaint().getFontMetricsInt()) : new org.telegram.ui.Components.p5(j10, editTextBoldCursor.getPaint().getFontMetricsInt());
                        if (!z10) {
                            p5Var.fromEmojiKeyboard = true;
                        }
                        p5Var.cacheType = org.telegram.ui.Components.g5.f();
                        spannableString.setSpan(p5Var, 0, spannableString.length(), 33);
                        editTextBoldCursor.setText(editTextBoldCursor.getText().insert(selectionEnd, spannableString));
                        editTextBoldCursor.setSelection(spannableString.length() + selectionEnd, selectionEnd + spannableString.length());
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                    chatActivityEnterView.T2 = 0;
                    return;
                } catch (Throwable th2) {
                    chatActivityEnterView.T2 = 0;
                    throw th2;
                }
            case 4:
                x30 x30Var = (x30) obj4;
                org.telegram.ui.ActionBar.s1[] s1VarArr = (org.telegram.ui.ActionBar.s1[]) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj3;
                TL_phone.inviteToGroupCall invitetogroupcall = (TL_phone.inviteToGroupCall) obj;
                try {
                    s1VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                s1VarArr[0] = null;
                if (z10 && "USER_NOT_PARTICIPANT".equals(tL_error2.text)) {
                    x30Var.z1(null, j10, 3);
                    return;
                } else {
                    org.telegram.ui.Components.t4.e0(x30Var.a, tL_error2, (org.telegram.ui.ActionBar.d2) x30Var.a2.M().getFragmentStack().get(x30Var.a2.M().getFragmentStack().size() - 1), invitetogroupcall, new Object[0]);
                    return;
                }
            case 5:
                m90 m90Var = (m90) obj4;
                TLObject tLObject3 = (TLObject) obj2;
                String str3 = (String) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj3;
                int i12 = m90Var.b;
                m90Var.c();
                if (!(tLObject3 instanceof TLRPC.TL_contacts_resolvedPeer)) {
                    if (tL_error3 != null) {
                        m90.d().f0(tL_error3, false);
                        return;
                    }
                    return;
                }
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject3;
                hp.s1(i12).Y3(tL_contacts_resolvedPeer.users, false);
                hp.s1(i12).S3(tL_contacts_resolvedPeer.chats, false);
                TLRPC.User a22 = hp.s1(i12).a2(Long.valueOf(tL_contacts_resolvedPeer.peer.user_id));
                if (a22 != null) {
                    org.telegram.ui.Wallet.m9 m9Var = new org.telegram.ui.Wallet.m9(a22);
                    m9Var.s = j10;
                    m9Var.h0 = str3;
                    m9Var.i0 = z10;
                    m9Var.g0 = true;
                    m90Var.u(m9Var, false);
                    return;
                }
                return;
            default:
                iv0 iv0Var = (iv0) obj4;
                ProfileActivity profileActivity = iv0Var.b;
                ip ipVar = new ip(profileActivity.e1, -j10, (TLRPC.TL_chatAdminRights) obj3, null, null, (String) obj2, 2, true, !z10, null);
                ipVar.Y0 = new hv0(iv0Var, (uw) obj);
                profileActivity.presentFragment(ipVar);
                return;
        }
    }

    public /* synthetic */ n(ei.j4 j4Var, hp hpVar, long j10, boolean z10, String str, TLObject tLObject) {
        this.e = j4Var;
        this.f = hpVar;
        this.b = j10;
        this.c = z10;
        this.h = str;
        this.d = tLObject;
    }

    public /* synthetic */ n(ei.z6 z6Var, TLRPC.TL_error tL_error, boolean z10, long j10, u10 u10Var, org.telegram.ui.ActionBar.e6 e6Var) {
        this.e = z6Var;
        this.f = tL_error;
        this.c = z10;
        this.b = j10;
        this.d = u10Var;
        this.h = e6Var;
    }

    public /* synthetic */ n(nf nfVar, EditTextBoldCursor editTextBoldCursor, String str, TLRPC.Document document, long j10, boolean z10) {
        this.e = nfVar;
        this.f = editTextBoldCursor;
        this.d = str;
        this.h = document;
        this.b = j10;
        this.c = z10;
    }

    public /* synthetic */ n(x30 x30Var, org.telegram.ui.ActionBar.s1[] s1VarArr, boolean z10, TLRPC.TL_error tL_error, long j10, TL_phone.inviteToGroupCall invitetogroupcall) {
        this.e = x30Var;
        this.d = s1VarArr;
        this.c = z10;
        this.f = tL_error;
        this.b = j10;
        this.h = invitetogroupcall;
    }

    public /* synthetic */ n(m90 m90Var, TLObject tLObject, long j10, String str, boolean z10, TLRPC.TL_error tL_error) {
        this.e = m90Var;
        this.d = tLObject;
        this.b = j10;
        this.h = str;
        this.c = z10;
        this.f = tL_error;
    }

    public /* synthetic */ n(iv0 iv0Var, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str, boolean z10, uw uwVar) {
        this.e = iv0Var;
        this.b = j10;
        this.f = tL_chatAdminRights;
        this.d = str;
        this.c = z10;
        this.h = uwVar;
    }
}
