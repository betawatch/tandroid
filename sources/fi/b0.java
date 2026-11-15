package fi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import hi.cb;
import hi.ga;
import hi.ia;
import hi.sa;
import hi.u9;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.np;
import org.telegram.messenger.s10;
import org.telegram.messenger.u10;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.qn;
import org.telegram.ui.x21;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class b0 implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b0(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj, Object obj2, Object obj3) {
        u9 u9Var;
        String str;
        String str2;
        switch (this.a) {
            case 0:
                c2 c2Var = (c2) this.b;
                s0 s0Var = (s0) this.c;
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj3;
                int i7 = c2Var.O;
                if (((Boolean) obj2).booleanValue()) {
                    TL_phone.deleteGroupCallParticipantMessages deletegroupcallparticipantmessages = new TL_phone.deleteGroupCallParticipantMessages();
                    deletegroupcallparticipantmessages.call = c2Var.P;
                    deletegroupcallparticipantmessages.participant = np.s1(i7).j1(s0Var.c);
                    deletegroupcallparticipantmessages.report_spam = bool.booleanValue();
                    ConnectionsManager.getInstance(i7).sendRequest(deletegroupcallparticipantmessages, null);
                    long j3 = s0Var.c;
                    ArrayList arrayList = c2Var.r;
                    ArrayList arrayList2 = c2Var.s;
                    int i10 = 0;
                    boolean z10 = false;
                    while (i10 < arrayList.size()) {
                        if (((s0) arrayList.get(i10)).c == j3) {
                            s0 s0Var2 = (s0) arrayList.get(i10);
                            int i11 = 0;
                            while (true) {
                                if (i11 < arrayList2.size()) {
                                    if (((t0) arrayList2.get(i11)).f.contains(s0Var2)) {
                                        ((t0) arrayList2.get(i11)).f.remove(s0Var2);
                                        if (((t0) arrayList2.get(i11)).f.isEmpty()) {
                                            arrayList2.remove(i11);
                                            z10 = true;
                                        } else {
                                            c2Var.m();
                                        }
                                    } else {
                                        i11++;
                                    }
                                }
                            }
                            arrayList.remove(i10);
                            c2Var.e.O(true);
                            i10--;
                        }
                        i10++;
                    }
                    if (z10) {
                        ConnectionsManager.getInstance(i7).getCurrentTime();
                        Collections.sort(arrayList2, new a3.c(c2Var, 22));
                        c2Var.n.O(true);
                        c2Var.t();
                    }
                } else {
                    TL_phone.deleteGroupCallMessages deletegroupcallmessages = new TL_phone.deleteGroupCallMessages();
                    deletegroupcallmessages.call = c2Var.P;
                    deletegroupcallmessages.messages.add(Integer.valueOf(s0Var.a));
                    ConnectionsManager.getInstance(i7).sendRequest(deletegroupcallmessages, null);
                    c2Var.c(s0Var.a);
                }
                if (bool2.booleanValue()) {
                    if (c2Var.N >= 0) {
                        np.s1(i7).w(c2Var.N);
                        return;
                    } else {
                        np.s1(i7).e0(-c2Var.N, np.s1(i7).j1(s0Var.c), true, null);
                        return;
                    }
                }
                return;
            case 1:
                ia iaVar = (ia) this.b;
                hi.p pVar = (hi.p) this.c;
                File file = (File) obj;
                String str3 = (String) obj2;
                Long l10 = (Long) obj3;
                sa saVar = iaVar.S1;
                ga gaVar = saVar.Y0;
                if (gaVar != null) {
                    gaVar.P = false;
                    gaVar.c();
                    ga gaVar2 = saVar.Y0;
                    gaVar2.m(0L);
                    cb cbVar = gaVar2.G;
                    if (cbVar != null) {
                        cbVar.setProgress(0L);
                    }
                }
                hi.d7 d7Var = saVar.L1;
                if (d7Var != null) {
                    d7Var.o0 = file;
                    d7Var.p0 = str3;
                    d7Var.q0 = l10.longValue();
                    hi.d7 d7Var2 = saVar.L1;
                    d7Var2.s0 = 0.0f;
                    d7Var2.t0 = 1.0f;
                    d7Var2.r0 = 0L;
                    d7Var2.u0 = 1.0f;
                    saVar.t();
                    if (saVar.Y0 == null || (u9Var = saVar.w1) == null) {
                        pVar.a(false);
                        return;
                    }
                    tg.r1 j02 = u9Var.j0(saVar.L1.p0, true);
                    iaVar.setHasRoundVideo(true);
                    saVar.Y0.s(saVar.L1, j02, true);
                    org.telegram.messenger.g0.r(pVar.h);
                    pVar.a.destroy(true, null);
                    j02.setDraw(false);
                    pVar.post(new hi.h4(7, pVar, j02));
                    return;
                }
                return;
            case 2:
                ki.r rVar = (ki.r) this.b;
                s10 s10Var = (s10) this.c;
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
                s10Var.a(bool3, str4);
                return;
            case 3:
                qn qnVar = (qn) this.b;
                View view = (View) this.c;
                qnVar.F0 = ((Boolean) obj).booleanValue();
                qnVar.H0 = ((Boolean) obj2).booleanValue();
                qnVar.I0 = ((Boolean) obj3).booleanValue();
                v3 v3Var = qnVar.e;
                int L = org.telegram.messenger.g0.L(qnVar.F0 ? 16.0f : 32.0f);
                if (v3Var.getRoundRadius()[0] != L) {
                    ValueAnimator valueAnimator = v3Var.y;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofInt = ValueAnimator.ofInt(v3Var.getRoundRadius()[0], L);
                    v3Var.y = ofInt;
                    ofInt.addUpdateListener(new f4(v3Var, 8));
                    v3Var.y.setDuration(200L);
                    v3Var.y.start();
                }
                ((org.telegram.ui.Cells.l8) view).setChecked(qnVar.F0);
                qnVar.u0(false, true);
                if (qnVar.O0) {
                    return;
                }
                TLRPC.Chat chat = qnVar.x0;
                if (chat.forum == qnVar.F0 && chat.forum_tabs == qnVar.H0 && chat.forum_sidebar == qnVar.I0) {
                    return;
                }
                if (!org.telegram.messenger.t3.T(chat) && qnVar.F0) {
                    Context parentActivity = qnVar.getParentActivity();
                    if (parentActivity == null) {
                        parentActivity = LaunchActivity.H1;
                    }
                    if (parentActivity == null) {
                        parentActivity = org.telegram.messenger.t0.b;
                    }
                    if (parentActivity == null) {
                        return;
                    }
                    org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, parentActivity, null);
                    qnVar.O0 = true;
                    t1Var.r(250L);
                    qnVar.getMessagesController().T(qnVar.getParentActivity(), qnVar.w0, qnVar, new m2.d(21, qnVar, t1Var), null);
                    return;
                }
                TLRPC.Chat chat2 = qnVar.x0;
                boolean z11 = chat2.forum_tabs != qnVar.H0;
                boolean z12 = chat2.forum_sidebar != qnVar.I0;
                qnVar.getMessagesController().b5(qnVar.w0, qnVar.F0, qnVar.H0, qnVar.I0);
                TLRPC.Chat chat3 = qnVar.x0;
                chat3.forum = qnVar.F0;
                chat3.forum_tabs = qnVar.H0;
                chat3.forum_sidebar = qnVar.I0;
                if (z11 || z12) {
                    qnVar.v0(z11);
                    return;
                }
                return;
            case 4:
                final org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) this.b;
                s10 s10Var2 = (s10) this.c;
                TL_wallet.secretPhraseParts secretphraseparts = (TL_wallet.secretPhraseParts) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (secretphraseparts == null) {
                    String str5 = "NULL_ERROR";
                    if (tL_error == null || (str = tL_error.text) == null) {
                        str = "NULL_ERROR";
                    }
                    org.telegram.ui.Wallet.l0.j("getSecretPhrase: no secret parts: ".concat(str));
                    if (tL_error != null && (str2 = tL_error.text) != null) {
                        str5 = str2;
                    }
                    s10Var2.a(null, str5);
                    return;
                }
                final org.telegram.ui.Wallet.d dVar = new org.telegram.ui.Wallet.d(s10Var2, 2);
                ArrayList<Integer> arrayList3 = secretphraseparts.dcs;
                if (arrayList3.size() <= 0) {
                    org.telegram.ui.Wallet.l0.j("getSecretPhrase: no secret parts, zero dcs");
                    dVar.a(null, "WALLET_SECRET_PARTS_EMPTY");
                    return;
                }
                final org.telegram.ui.ActionBar.t1 t1Var2 = new org.telegram.ui.ActionBar.t1(3, org.telegram.ui.Wallet.l0.w(), null);
                t1Var2.r(500L);
                final long key_generate_temporary_private_key = ConferenceCall.key_generate_temporary_private_key();
                byte[] key_to_public_key = ConferenceCall.key_to_public_key(key_generate_temporary_private_key);
                final boolean[] zArr = new boolean[arrayList3.size()];
                final TL_wallet.encryptedSecretPhrasePart[] encryptedsecretphrasepartArr = new TL_wallet.encryptedSecretPhrasePart[arrayList3.size()];
                final TLRPC.TL_error[] tL_errorArr = new TLRPC.TL_error[arrayList3.size()];
                final int i12 = 0;
                while (i12 < arrayList3.size()) {
                    final int intValue = arrayList3.get(i12).intValue();
                    org.telegram.ui.Wallet.l0.H("getSecretPhrase: requesting " + i12 + " part from dc" + intValue);
                    TL_wallet.fetchEncryptedSecretPhrasePart fetchencryptedsecretphrasepart = new TL_wallet.fetchEncryptedSecretPhrasePart();
                    fetchencryptedsecretphrasepart.token = secretphraseparts.token;
                    fetchencryptedsecretphrasepart.public_key = key_to_public_key;
                    ConnectionsManager.getInstance(l0Var.a).sendRequestTyped(fetchencryptedsecretphrasepart, new d3.b(1), new s10() { // from class: org.telegram.ui.Wallet.x
                        @Override // org.telegram.messenger.s10
                        public final void a(Object obj4, Object obj5) {
                            l0 l0Var2 = l0.this;
                            boolean[] zArr2 = zArr;
                            int i13 = i12;
                            TL_wallet.encryptedSecretPhrasePart[] encryptedsecretphrasepartArr2 = encryptedsecretphrasepartArr;
                            TLRPC.TL_error[] tL_errorArr2 = tL_errorArr;
                            int i14 = intValue;
                            long j10 = key_generate_temporary_private_key;
                            d dVar2 = dVar;
                            org.telegram.ui.ActionBar.t1 t1Var3 = t1Var2;
                            boolean z13 = true;
                            zArr2[i13] = true;
                            encryptedsecretphrasepartArr2[i13] = (TL_wallet.encryptedSecretPhrasePart) obj4;
                            tL_errorArr2[i13] = (TLRPC.TL_error) obj5;
                            l0.H("getSecretPhrase: received " + i13 + " part from dc" + i14);
                            for (int i15 = 0; i15 < zArr2.length; i15++) {
                                if (!zArr2[i15]) {
                                    z13 = false;
                                }
                            }
                            if (z13) {
                                l0.H("getSecretPhrase: received all parts");
                                j jVar = new j((Object) l0Var2, (Object) t1Var3, (Object) dVar2, 3);
                                for (int i16 = 0; i16 < encryptedsecretphrasepartArr2.length; i16++) {
                                    TL_wallet.encryptedSecretPhrasePart encryptedsecretphrasepart = encryptedsecretphrasepartArr2[i16];
                                    if (encryptedsecretphrasepart == null) {
                                        TLRPC.TL_error tL_error2 = tL_errorArr2[i16];
                                        StringBuilder m10 = i5.c.m(i16, "getSecretPhrase: part ", ": ");
                                        String str6 = tL_error2.text;
                                        if (str6 == null) {
                                            str6 = "NULL_ERROR";
                                        }
                                        m10.append(str6);
                                        l0.j(m10.toString());
                                        String str7 = tL_error2.text;
                                        jVar.a(null, str7 != null ? str7 : "NULL_ERROR");
                                        return;
                                    }
                                    if (encryptedsecretphrasepart.data.length < 33) {
                                        StringBuilder m11 = i5.c.m(i16, "getSecretPhrase: part ", " length < 33 (len=");
                                        m11.append(encryptedsecretphrasepartArr2[i16].data.length);
                                        m11.append(")");
                                        l0.j(m11.toString());
                                        jVar.a(null, "WALLET_PART_" + i16 + "_INVALID");
                                        return;
                                    }
                                }
                                Utilities.d.c(new di.f2(l0Var2, encryptedsecretphrasepartArr2, j10, jVar, 24));
                            }
                        }
                    }, intValue, 0);
                    i12++;
                    arrayList3 = arrayList3;
                }
                return;
            case 5:
                org.telegram.ui.Wallet.l0 l0Var2 = (org.telegram.ui.Wallet.l0) this.b;
                x21 x21Var = (x21) this.c;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (tL_error2 == null) {
                    l0Var2.l0(walletState);
                    l0Var2.R();
                    x21Var.a(null);
                    return;
                } else {
                    String str6 = tL_error2.text;
                    if (str6 == null) {
                        str6 = "NULL_ERROR";
                    }
                    x21Var.a(str6);
                    return;
                }
            default:
                org.telegram.ui.Wallet.l0 l0Var3 = (org.telegram.ui.Wallet.l0) this.b;
                org.telegram.ui.Wallet.l8 l8Var = (org.telegram.ui.Wallet.l8) this.c;
                TL_wallet.WalletState walletState2 = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                if (tL_error3 == null) {
                    l0Var3.l0(walletState2);
                    l8Var.a(null);
                    return;
                }
                String str7 = tL_error3.text;
                if (str7 == null) {
                    str7 = "NULL_ERROR";
                }
                org.telegram.ui.Wallet.l0.j("failed to disable backup: ".concat(str7));
                String str8 = tL_error3.text;
                l8Var.a(str8 != null ? str8 : "NULL_ERROR");
                return;
        }
    }
}
