package org.telegram.ui.Components;

import android.text.SpannableString;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class hf implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ hf(lf lfVar, EditTextBoldCursor editTextBoldCursor, String str, TLRPC.Document document, long j10, boolean z10) {
        this.d = lfVar;
        this.e = editTextBoldCursor;
        this.f = str;
        this.h = document;
        this.c = j10;
        this.b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        long j10 = this.c;
        boolean z10 = this.b;
        Object obj = this.h;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj3;
                String str = (String) obj2;
                TLRPC.Document document = (TLRPC.Document) obj;
                ChatActivityEnterView chatActivityEnterView = ((lf) obj4).a;
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
                        if (str == null) {
                            str = "😀";
                        }
                        SpannableString spannableString = new SpannableString(str);
                        o5 o5Var = document != null ? new o5(document, editTextBoldCursor.getPaint().getFontMetricsInt()) : new o5(j10, editTextBoldCursor.getPaint().getFontMetricsInt());
                        if (!z10) {
                            o5Var.fromEmojiKeyboard = true;
                        }
                        o5Var.cacheType = f5.f();
                        spannableString.setSpan(o5Var, 0, spannableString.length(), 33);
                        editTextBoldCursor.setText(editTextBoldCursor.getText().insert(selectionEnd, spannableString));
                        editTextBoldCursor.setSelection(spannableString.length() + selectionEnd, selectionEnd + spannableString.length());
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                    }
                    chatActivityEnterView.S2 = 0;
                    return;
                } catch (Throwable th2) {
                    chatActivityEnterView.S2 = 0;
                    throw th2;
                }
            case 1:
                org.telegram.ui.b50 b50Var = (org.telegram.ui.b50) obj4;
                org.telegram.ui.ActionBar.x1[] x1VarArr = (org.telegram.ui.ActionBar.x1[]) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TL_phone.inviteToGroupCall invitetogroupcall = (TL_phone.inviteToGroupCall) obj;
                try {
                    x1VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                x1VarArr[0] = null;
                if (z10 && "USER_NOT_PARTICIPANT".equals(tL_error.text)) {
                    b50Var.z1(null, j10, 3);
                    return;
                } else {
                    s4.e0(b50Var.a, tL_error, (org.telegram.ui.ActionBar.k2) b50Var.Z1.M().getFragmentStack().get(b50Var.Z1.M().getFragmentStack().size() - 1), invitetogroupcall, new Object[0]);
                    return;
                }
            case 2:
                org.telegram.ui.ua0 ua0Var = (org.telegram.ui.ua0) obj4;
                TLObject tLObject = (TLObject) obj3;
                String str2 = (String) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                int i11 = ua0Var.b;
                ua0Var.c();
                if (!(tLObject instanceof TLRPC.TL_contacts_resolvedPeer)) {
                    if (tL_error2 != null) {
                        org.telegram.ui.ua0.d().f0(tL_error2, false);
                        return;
                    }
                    return;
                }
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                org.telegram.messenger.vp.r1(i11).V3(tL_contacts_resolvedPeer.users, false);
                org.telegram.messenger.vp.r1(i11).P3(tL_contacts_resolvedPeer.chats, false);
                TLRPC.User Z1 = org.telegram.messenger.vp.r1(i11).Z1(Long.valueOf(tL_contacts_resolvedPeer.peer.user_id));
                if (Z1 != null) {
                    org.telegram.ui.Wallet.r9 r9Var = new org.telegram.ui.Wallet.r9(Z1);
                    r9Var.s = j10;
                    r9Var.g0 = str2;
                    r9Var.h0 = z10;
                    r9Var.f0 = true;
                    ua0Var.u(r9Var, false);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.dx0 dx0Var = (org.telegram.ui.dx0) obj4;
                ProfileActivity profileActivity = dx0Var.b;
                org.telegram.ui.iq iqVar = new org.telegram.ui.iq(profileActivity.d1, -j10, (TLRPC.TL_chatAdminRights) obj3, null, null, (String) obj2, 2, true, !z10, null);
                iqVar.X0 = new org.telegram.ui.cx0(dx0Var, (org.telegram.ui.ay) obj);
                profileActivity.presentFragment(iqVar);
                return;
            case 4:
                rh.i iVar = (rh.i) obj4;
                TLObject tLObject2 = (TLObject) obj2;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                if (((TLRPC.TL_error) obj3) == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.q0(password);
                    iVar.t0(this.b, this.c, twoStepVerificationActivity.p0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 5:
                th.z2 z2Var = (th.z2) obj4;
                final org.telegram.messenger.vp vpVar = (org.telegram.messenger.vp) obj3;
                String str3 = (String) obj2;
                TLObject tLObject3 = (TLObject) obj;
                th.e5 O1 = vpVar.O1();
                final long j11 = this.c;
                final boolean z11 = this.b;
                O1.l0(j11, z11, false);
                m4.c cVar = new m4.c((char) 0, 15);
                final int i12 = 0;
                cVar.b = new Runnable() { // from class: th.n1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                vpVar.O1().l0(j11, !z11, false);
                                break;
                            default:
                                vpVar.O1().l0(j11, z11, true);
                                break;
                        }
                    }
                };
                final int i13 = 1;
                cVar.c = new Runnable() { // from class: th.n1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                vpVar.O1().l0(j11, !z11, false);
                                break;
                            default:
                                vpVar.O1().l0(j11, z11, true);
                                break;
                        }
                    }
                };
                wb V = new cc(z2Var.M0, z2Var.k0).V(Arrays.asList(tLObject3), !z11 ? org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131744776, org.telegram.messenger.i5.m(10, str3, null))) : org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131744777, org.telegram.messenger.i5.m(10, str3, null))), null, cVar);
                V.a = 2;
                V.k(true);
                return;
            default:
                th.e5 e5Var = (th.e5) obj4;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj3;
                org.telegram.messenger.q20 q20Var = (org.telegram.messenger.q20) obj2;
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) obj;
                if (tL_error3 == null) {
                    q20Var.a(Boolean.TRUE);
                    return;
                }
                if (tL_error3.text.contains("BOOSTS_REQUIRED")) {
                    if (!z10) {
                        q20Var.a(Boolean.FALSE);
                        return;
                    }
                    org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(e5Var.a);
                    org.telegram.messenger.i3 G0 = r12.G0();
                    long j12 = this.c;
                    G0.a(j12, new org.telegram.ui.ko(e5Var, q20Var, r12, j12, 6));
                    return;
                }
                if (tL_error3.text.startsWith("STORY_LIVE_ALREADY_")) {
                    org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
                    if (z10 && Q != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, Q.getContext(), p6Var);
                        String L0 = org.telegram.messenger.cd.L0(2131748836, null);
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                        x1Var.R = L0;
                        x1Var.T = org.telegram.messenger.cd.L0(2131748837, null);
                        i0.a.w(null, 2131747847, alertDialog$Builder, null);
                    }
                    q20Var.a(Boolean.FALSE);
                    return;
                }
                if (!tL_error3.text.equalsIgnoreCase("PREMIUM_ACCOUNT_REQUIRED")) {
                    cc X = cc.X();
                    if (X != null) {
                        X.f0(tL_error3, false);
                    }
                    q20Var.a(Boolean.FALSE);
                    return;
                }
                org.telegram.ui.ActionBar.k2 Q2 = LaunchActivity.Q();
                if (z10 && Q2 != null) {
                    Q2.showDialog(new kg.i1(Q2, 14, true));
                }
                q20Var.a(Boolean.FALSE);
                return;
        }
    }

    public /* synthetic */ hf(org.telegram.ui.b50 b50Var, org.telegram.ui.ActionBar.x1[] x1VarArr, boolean z10, TLRPC.TL_error tL_error, long j10, TL_phone.inviteToGroupCall invitetogroupcall) {
        this.d = b50Var;
        this.e = x1VarArr;
        this.b = z10;
        this.f = tL_error;
        this.c = j10;
        this.h = invitetogroupcall;
    }

    public /* synthetic */ hf(org.telegram.ui.ua0 ua0Var, TLObject tLObject, long j10, String str, boolean z10, TLRPC.TL_error tL_error) {
        this.d = ua0Var;
        this.e = tLObject;
        this.c = j10;
        this.f = str;
        this.b = z10;
        this.h = tL_error;
    }

    public /* synthetic */ hf(org.telegram.ui.dx0 dx0Var, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str, boolean z10, org.telegram.ui.ay ayVar) {
        this.d = dx0Var;
        this.c = j10;
        this.e = tL_chatAdminRights;
        this.f = str;
        this.b = z10;
        this.h = ayVar;
    }

    public /* synthetic */ hf(rh.i iVar, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, long j10) {
        this.d = iVar;
        this.e = tL_error;
        this.f = tLObject;
        this.h = twoStepVerificationActivity;
        this.b = z10;
        this.c = j10;
    }

    public /* synthetic */ hf(th.z2 z2Var, org.telegram.messenger.vp vpVar, long j10, boolean z10, String str, TLObject tLObject) {
        this.d = z2Var;
        this.e = vpVar;
        this.c = j10;
        this.b = z10;
        this.f = str;
        this.h = tLObject;
    }

    public /* synthetic */ hf(th.e5 e5Var, TLRPC.TL_error tL_error, boolean z10, long j10, org.telegram.messenger.q20 q20Var, org.telegram.ui.ActionBar.p6 p6Var) {
        this.d = e5Var;
        this.e = tL_error;
        this.b = z10;
        this.c = j10;
        this.f = q20Var;
        this.h = p6Var;
    }
}
