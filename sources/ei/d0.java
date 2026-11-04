package ei;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import gi.fb;
import gi.ja;
import gi.la;
import gi.va;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hp;
import org.telegram.messenger.n10;
import org.telegram.messenger.p10;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.e51;
import org.telegram.ui.ln;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d0 implements p10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d0(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.p10
    public final void a(Object obj, Object obj2, Object obj3) {
        gi.x9 x9Var;
        String str;
        String str2;
        switch (this.a) {
            case 0:
                k2 k2Var = (k2) this.b;
                u0 u0Var = (u0) this.c;
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj3;
                int i3 = k2Var.O;
                if (((Boolean) obj2).booleanValue()) {
                    TL_phone.deleteGroupCallParticipantMessages deletegroupcallparticipantmessages = new TL_phone.deleteGroupCallParticipantMessages();
                    deletegroupcallparticipantmessages.call = k2Var.P;
                    deletegroupcallparticipantmessages.participant = hp.s1(i3).j1(u0Var.c);
                    deletegroupcallparticipantmessages.report_spam = bool.booleanValue();
                    ConnectionsManager.getInstance(i3).sendRequest(deletegroupcallparticipantmessages, null);
                    long j10 = u0Var.c;
                    ArrayList arrayList = k2Var.r;
                    ArrayList arrayList2 = k2Var.s;
                    int i10 = 0;
                    boolean z10 = false;
                    while (i10 < arrayList.size()) {
                        if (((u0) arrayList.get(i10)).c == j10) {
                            u0 u0Var2 = (u0) arrayList.get(i10);
                            int i11 = 0;
                            while (true) {
                                if (i11 < arrayList2.size()) {
                                    if (((v0) arrayList2.get(i11)).f.contains(u0Var2)) {
                                        ((v0) arrayList2.get(i11)).f.remove(u0Var2);
                                        if (((v0) arrayList2.get(i11)).f.isEmpty()) {
                                            arrayList2.remove(i11);
                                            z10 = true;
                                        } else {
                                            k2Var.m();
                                        }
                                    } else {
                                        i11++;
                                    }
                                }
                            }
                            arrayList.remove(i10);
                            k2Var.e.O(true);
                            i10--;
                        }
                        i10++;
                    }
                    if (z10) {
                        ConnectionsManager.getInstance(i3).getCurrentTime();
                        Collections.sort(arrayList2, new a3.u(k2Var, 12));
                        k2Var.n.O(true);
                        k2Var.t();
                    }
                } else {
                    TL_phone.deleteGroupCallMessages deletegroupcallmessages = new TL_phone.deleteGroupCallMessages();
                    deletegroupcallmessages.call = k2Var.P;
                    deletegroupcallmessages.messages.add(Integer.valueOf(u0Var.a));
                    ConnectionsManager.getInstance(i3).sendRequest(deletegroupcallmessages, null);
                    k2Var.c(u0Var.a);
                }
                if (bool2.booleanValue()) {
                    if (k2Var.N >= 0) {
                        hp.s1(i3).w(k2Var.N);
                        return;
                    } else {
                        hp.s1(i3).e0(-k2Var.N, hp.s1(i3).j1(u0Var.c), true, null);
                        return;
                    }
                }
                return;
            case 1:
                la laVar = (la) this.b;
                gi.p pVar = (gi.p) this.c;
                File file = (File) obj;
                String str3 = (String) obj2;
                Long l10 = (Long) obj3;
                va vaVar = laVar.S1;
                ja jaVar = vaVar.Y0;
                if (jaVar != null) {
                    jaVar.P = false;
                    jaVar.c();
                    ja jaVar2 = vaVar.Y0;
                    jaVar2.m(0L);
                    fb fbVar = jaVar2.G;
                    if (fbVar != null) {
                        fbVar.setProgress(0L);
                    }
                }
                gi.f7 f7Var = vaVar.L1;
                if (f7Var != null) {
                    f7Var.o0 = file;
                    f7Var.p0 = str3;
                    f7Var.q0 = l10.longValue();
                    gi.f7 f7Var2 = vaVar.L1;
                    f7Var2.s0 = 0.0f;
                    f7Var2.t0 = 1.0f;
                    f7Var2.r0 = 0L;
                    f7Var2.u0 = 1.0f;
                    vaVar.t();
                    if (vaVar.Y0 == null || (x9Var = vaVar.w1) == null) {
                        pVar.a(false);
                        return;
                    }
                    ug.r1 j02 = x9Var.j0(vaVar.L1.p0, true);
                    laVar.setHasRoundVideo(true);
                    vaVar.Y0.s(vaVar.L1, j02, true);
                    org.telegram.messenger.g0.r(pVar.h);
                    pVar.a.destroy(true, null);
                    j02.setDraw(false);
                    pVar.post(new g2.c(18, pVar, j02));
                    return;
                }
                return;
            case 2:
                ii.r rVar = (ii.r) this.b;
                n10 n10Var = (n10) this.c;
                Boolean bool3 = (Boolean) obj;
                androidx.biometric.u uVar = (androidx.biometric.u) obj2;
                androidx.biometric.v vVar = (androidx.biometric.v) obj3;
                rVar.getClass();
                String str4 = null;
                if (uVar != null) {
                    try {
                        if (Build.VERSION.SDK_INT >= 30) {
                            vVar = rVar.i(true);
                        }
                        if (vVar != null) {
                            str4 = !TextUtils.isEmpty(rVar.g) ? new String(vVar.b.doFinal(Utilities.v(rVar.g)), StandardCharsets.UTF_8) : rVar.g;
                        } else if (!TextUtils.isEmpty(rVar.g)) {
                            throw new RuntimeException("No cryptoObject found");
                        }
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        bool3 = Boolean.FALSE;
                    }
                }
                n10Var.a(bool3, str4);
                return;
            case 3:
                ln lnVar = (ln) this.b;
                View view = (View) this.c;
                lnVar.F0 = ((Boolean) obj).booleanValue();
                lnVar.H0 = ((Boolean) obj2).booleanValue();
                lnVar.I0 = ((Boolean) obj3).booleanValue();
                d4 d4Var = lnVar.e;
                int L = org.telegram.messenger.g0.L(lnVar.F0 ? 16.0f : 32.0f);
                if (d4Var.getRoundRadius()[0] != L) {
                    ValueAnimator valueAnimator = d4Var.y;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofInt = ValueAnimator.ofInt(d4Var.getRoundRadius()[0], L);
                    d4Var.y = ofInt;
                    ofInt.addUpdateListener(new n4(d4Var, 8));
                    d4Var.y.setDuration(200L);
                    d4Var.y.start();
                }
                ((org.telegram.ui.Cells.l8) view).setChecked(lnVar.F0);
                lnVar.u0(false, true);
                if (lnVar.O0) {
                    return;
                }
                TLRPC.Chat chat = lnVar.x0;
                if (chat.forum == lnVar.F0 && chat.forum_tabs == lnVar.H0 && chat.forum_sidebar == lnVar.I0) {
                    return;
                }
                if (!org.telegram.messenger.t3.T(chat) && lnVar.F0) {
                    Context parentActivity = lnVar.getParentActivity();
                    if (parentActivity == null) {
                        parentActivity = LaunchActivity.K1;
                    }
                    if (parentActivity == null) {
                        parentActivity = org.telegram.messenger.t0.b;
                    }
                    if (parentActivity == null) {
                        return;
                    }
                    org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, parentActivity, null);
                    lnVar.O0 = true;
                    s1Var.r(250L);
                    lnVar.getMessagesController().T(lnVar.getParentActivity(), lnVar.w0, lnVar, new mi.d4(27, lnVar, s1Var), null);
                    return;
                }
                TLRPC.Chat chat2 = lnVar.x0;
                boolean z11 = chat2.forum_tabs != lnVar.H0;
                boolean z12 = chat2.forum_sidebar != lnVar.I0;
                lnVar.getMessagesController().a5(lnVar.w0, lnVar.F0, lnVar.H0, lnVar.I0);
                TLRPC.Chat chat3 = lnVar.x0;
                chat3.forum = lnVar.F0;
                chat3.forum_tabs = lnVar.H0;
                chat3.forum_sidebar = lnVar.I0;
                if (z11 || z12) {
                    lnVar.v0(z11);
                    return;
                }
                return;
            case 4:
                final org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) this.b;
                n10 n10Var2 = (n10) this.c;
                TL_wallet.secretPhraseParts secretphraseparts = (TL_wallet.secretPhraseParts) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (secretphraseparts == null) {
                    String str5 = "NULL_ERROR";
                    if (tL_error == null || (str = tL_error.text) == null) {
                        str = "NULL_ERROR";
                    }
                    org.telegram.ui.Wallet.k0.j("getSecretPhrase: no secret parts: ".concat(str));
                    if (tL_error != null && (str2 = tL_error.text) != null) {
                        str5 = str2;
                    }
                    n10Var2.a(null, str5);
                    return;
                }
                final org.telegram.ui.Wallet.d dVar = new org.telegram.ui.Wallet.d(n10Var2, 2);
                ArrayList<Integer> arrayList3 = secretphraseparts.dcs;
                if (arrayList3.size() <= 0) {
                    org.telegram.ui.Wallet.k0.j("getSecretPhrase: no secret parts, zero dcs");
                    dVar.a(null, "WALLET_SECRET_PARTS_EMPTY");
                    return;
                }
                final org.telegram.ui.ActionBar.s1 s1Var2 = new org.telegram.ui.ActionBar.s1(3, org.telegram.ui.Wallet.k0.w(), null);
                s1Var2.r(500L);
                final long key_generate_temporary_private_key = ConferenceCall.key_generate_temporary_private_key();
                byte[] key_to_public_key = ConferenceCall.key_to_public_key(key_generate_temporary_private_key);
                final boolean[] zArr = new boolean[arrayList3.size()];
                final TL_wallet.encryptedSecretPhrasePart[] encryptedsecretphrasepartArr = new TL_wallet.encryptedSecretPhrasePart[arrayList3.size()];
                final TLRPC.TL_error[] tL_errorArr = new TLRPC.TL_error[arrayList3.size()];
                final int i12 = 0;
                while (i12 < arrayList3.size()) {
                    final int intValue = arrayList3.get(i12).intValue();
                    org.telegram.ui.Wallet.k0.H("getSecretPhrase: requesting " + i12 + " part from dc" + intValue);
                    TL_wallet.fetchEncryptedSecretPhrasePart fetchencryptedsecretphrasepart = new TL_wallet.fetchEncryptedSecretPhrasePart();
                    fetchencryptedsecretphrasepart.token = secretphraseparts.token;
                    fetchencryptedsecretphrasepart.public_key = key_to_public_key;
                    ConnectionsManager.getInstance(k0Var.a).sendRequestTyped(fetchencryptedsecretphrasepart, new c3.b(1), new n10() { // from class: org.telegram.ui.Wallet.w
                        @Override // org.telegram.messenger.n10
                        public final void a(Object obj4, Object obj5) {
                            k0 k0Var2 = k0.this;
                            boolean[] zArr2 = zArr;
                            int i13 = i12;
                            TL_wallet.encryptedSecretPhrasePart[] encryptedsecretphrasepartArr2 = encryptedsecretphrasepartArr;
                            TLRPC.TL_error[] tL_errorArr2 = tL_errorArr;
                            int i14 = intValue;
                            long j11 = key_generate_temporary_private_key;
                            d dVar2 = dVar;
                            org.telegram.ui.ActionBar.s1 s1Var3 = s1Var2;
                            boolean z13 = true;
                            zArr2[i13] = true;
                            encryptedsecretphrasepartArr2[i13] = (TL_wallet.encryptedSecretPhrasePart) obj4;
                            tL_errorArr2[i13] = (TLRPC.TL_error) obj5;
                            k0.H("getSecretPhrase: received " + i13 + " part from dc" + i14);
                            for (int i15 = 0; i15 < zArr2.length; i15++) {
                                if (!zArr2[i15]) {
                                    z13 = false;
                                }
                            }
                            if (z13) {
                                k0.H("getSecretPhrase: received all parts");
                                j jVar = new j((Object) k0Var2, (Object) s1Var3, (Object) dVar2, 3);
                                for (int i16 = 0; i16 < encryptedsecretphrasepartArr2.length; i16++) {
                                    TL_wallet.encryptedSecretPhrasePart encryptedsecretphrasepart = encryptedsecretphrasepartArr2[i16];
                                    if (encryptedsecretphrasepart == null) {
                                        TLRPC.TL_error tL_error2 = tL_errorArr2[i16];
                                        StringBuilder m10 = k2.p1.m(i16, "getSecretPhrase: part ", ": ");
                                        String str6 = tL_error2.text;
                                        if (str6 == null) {
                                            str6 = "NULL_ERROR";
                                        }
                                        m10.append(str6);
                                        k0.j(m10.toString());
                                        String str7 = tL_error2.text;
                                        jVar.a(null, str7 != null ? str7 : "NULL_ERROR");
                                        return;
                                    }
                                    if (encryptedsecretphrasepart.data.length < 33) {
                                        StringBuilder m11 = k2.p1.m(i16, "getSecretPhrase: part ", " length < 33 (len=");
                                        m11.append(encryptedsecretphrasepartArr2[i16].data.length);
                                        m11.append(")");
                                        k0.j(m11.toString());
                                        jVar.a(null, "WALLET_PART_" + i16 + "_INVALID");
                                        return;
                                    }
                                }
                                Utilities.d.c(new ci.l2(k0Var2, encryptedsecretphrasepartArr2, j11, jVar, 24));
                            }
                        }
                    }, intValue, 0);
                    i12++;
                    arrayList3 = arrayList3;
                }
                return;
            case 5:
                org.telegram.ui.Wallet.k0 k0Var2 = (org.telegram.ui.Wallet.k0) this.b;
                e51 e51Var = (e51) this.c;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (tL_error2 == null) {
                    k0Var2.l0(walletState);
                    k0Var2.R();
                    e51Var.a(null);
                    return;
                } else {
                    String str6 = tL_error2.text;
                    if (str6 == null) {
                        str6 = "NULL_ERROR";
                    }
                    e51Var.a(str6);
                    return;
                }
            default:
                org.telegram.ui.Wallet.k0 k0Var3 = (org.telegram.ui.Wallet.k0) this.b;
                org.telegram.ui.Wallet.j8 j8Var = (org.telegram.ui.Wallet.j8) this.c;
                TL_wallet.WalletState walletState2 = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                if (tL_error3 == null) {
                    k0Var3.l0(walletState2);
                    j8Var.a(null);
                    return;
                }
                String str7 = tL_error3.text;
                if (str7 == null) {
                    str7 = "NULL_ERROR";
                }
                org.telegram.ui.Wallet.k0.j("failed to disable backup: ".concat(str7));
                String str8 = tL_error3.text;
                j8Var.a(str8 != null ? str8 : "NULL_ERROR");
                return;
        }
    }
}
