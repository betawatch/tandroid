package fi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import hi.bb;
import hi.db;
import hi.nb;
import hi.pa;
import hi.xb;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.mp;
import org.telegram.messenger.p10;
import org.telegram.messenger.r10;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.a31;
import org.telegram.ui.rn;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class b0 implements r10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b0(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.r10
    public final void a(Object obj, Object obj2, Object obj3) {
        pa paVar;
        String str;
        String str2;
        switch (this.a) {
            case 0:
                a2 a2Var = (a2) this.b;
                r0 r0Var = (r0) this.c;
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj3;
                int i7 = a2Var.O;
                if (((Boolean) obj2).booleanValue()) {
                    TL_phone.deleteGroupCallParticipantMessages deletegroupcallparticipantmessages = new TL_phone.deleteGroupCallParticipantMessages();
                    deletegroupcallparticipantmessages.call = a2Var.P;
                    deletegroupcallparticipantmessages.participant = mp.u1(i7).l1(r0Var.c);
                    deletegroupcallparticipantmessages.report_spam = bool.booleanValue();
                    ConnectionsManager.getInstance(i7).sendRequest(deletegroupcallparticipantmessages, null);
                    long j3 = r0Var.c;
                    ArrayList arrayList = a2Var.r;
                    ArrayList arrayList2 = a2Var.s;
                    int i10 = 0;
                    boolean z10 = false;
                    while (i10 < arrayList.size()) {
                        if (((r0) arrayList.get(i10)).c == j3) {
                            r0 r0Var2 = (r0) arrayList.get(i10);
                            int i11 = 0;
                            while (true) {
                                if (i11 < arrayList2.size()) {
                                    if (((s0) arrayList2.get(i11)).f.contains(r0Var2)) {
                                        ((s0) arrayList2.get(i11)).f.remove(r0Var2);
                                        if (((s0) arrayList2.get(i11)).f.isEmpty()) {
                                            arrayList2.remove(i11);
                                            z10 = true;
                                        } else {
                                            a2Var.m();
                                        }
                                    } else {
                                        i11++;
                                    }
                                }
                            }
                            arrayList.remove(i10);
                            a2Var.e.O(true);
                            i10--;
                        }
                        i10++;
                    }
                    if (z10) {
                        ConnectionsManager.getInstance(i7).getCurrentTime();
                        Collections.sort(arrayList2, new a3.c(a2Var, 22));
                        a2Var.n.O(true);
                        a2Var.t();
                    }
                } else {
                    TL_phone.deleteGroupCallMessages deletegroupcallmessages = new TL_phone.deleteGroupCallMessages();
                    deletegroupcallmessages.call = a2Var.P;
                    deletegroupcallmessages.messages.add(Integer.valueOf(r0Var.a));
                    ConnectionsManager.getInstance(i7).sendRequest(deletegroupcallmessages, null);
                    a2Var.c(r0Var.a);
                }
                if (bool2.booleanValue()) {
                    if (a2Var.N >= 0) {
                        mp.u1(i7).w(a2Var.N);
                        return;
                    } else {
                        mp.u1(i7).e0(-a2Var.N, mp.u1(i7).l1(r0Var.c), true, null);
                        return;
                    }
                }
                return;
            case 1:
                db dbVar = (db) this.b;
                hi.q qVar = (hi.q) this.c;
                File file = (File) obj;
                String str3 = (String) obj2;
                Long l10 = (Long) obj3;
                nb nbVar = dbVar.S1;
                bb bbVar = nbVar.Y0;
                if (bbVar != null) {
                    bbVar.P = false;
                    bbVar.c();
                    bb bbVar2 = nbVar.Y0;
                    bbVar2.m(0L);
                    xb xbVar = bbVar2.G;
                    if (xbVar != null) {
                        xbVar.setProgress(0L);
                    }
                }
                hi.x7 x7Var = nbVar.L1;
                if (x7Var != null) {
                    x7Var.o0 = file;
                    x7Var.p0 = str3;
                    x7Var.q0 = l10.longValue();
                    hi.x7 x7Var2 = nbVar.L1;
                    x7Var2.s0 = 0.0f;
                    x7Var2.t0 = 1.0f;
                    x7Var2.r0 = 0L;
                    x7Var2.u0 = 1.0f;
                    nbVar.t();
                    if (nbVar.Y0 == null || (paVar = nbVar.w1) == null) {
                        qVar.a(false);
                        return;
                    }
                    tg.w1 l02 = paVar.l0(nbVar.L1.p0, true);
                    dbVar.setHasRoundVideo(true);
                    nbVar.Y0.s(nbVar.L1, l02, true);
                    org.telegram.messenger.g0.r(qVar.h);
                    qVar.a.destroy(true, null);
                    l02.setDraw(false);
                    qVar.post(new hi.c(12, qVar, l02));
                    return;
                }
                return;
            case 2:
                ki.p pVar = (ki.p) this.b;
                p10 p10Var = (p10) this.c;
                Boolean bool3 = (Boolean) obj;
                androidx.biometric.u uVar = (androidx.biometric.u) obj2;
                androidx.biometric.v vVar = (androidx.biometric.v) obj3;
                pVar.getClass();
                String str4 = null;
                if (uVar != null) {
                    try {
                        if (Build.VERSION.SDK_INT >= 30) {
                            vVar = pVar.i(true);
                        }
                        if (vVar != null) {
                            str4 = !TextUtils.isEmpty(pVar.g) ? new String(vVar.b.doFinal(Utilities.v(pVar.g)), StandardCharsets.UTF_8) : pVar.g;
                        } else if (!TextUtils.isEmpty(pVar.g)) {
                            throw new RuntimeException("No cryptoObject found");
                        }
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        bool3 = Boolean.FALSE;
                    }
                }
                p10Var.a(bool3, str4);
                return;
            case 3:
                rn rnVar = (rn) this.b;
                View view = (View) this.c;
                rnVar.F0 = ((Boolean) obj).booleanValue();
                rnVar.H0 = ((Boolean) obj2).booleanValue();
                rnVar.I0 = ((Boolean) obj3).booleanValue();
                t3 t3Var = rnVar.e;
                int L = org.telegram.messenger.g0.L(rnVar.F0 ? 16.0f : 32.0f);
                if (t3Var.getRoundRadius()[0] != L) {
                    ValueAnimator valueAnimator = t3Var.y;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofInt = ValueAnimator.ofInt(t3Var.getRoundRadius()[0], L);
                    t3Var.y = ofInt;
                    ofInt.addUpdateListener(new d4(t3Var, 8));
                    t3Var.y.setDuration(200L);
                    t3Var.y.start();
                }
                ((org.telegram.ui.Cells.m8) view).setChecked(rnVar.F0);
                rnVar.u0(false, true);
                if (rnVar.O0) {
                    return;
                }
                TLRPC.Chat chat = rnVar.x0;
                if (chat.forum == rnVar.F0 && chat.forum_tabs == rnVar.H0 && chat.forum_sidebar == rnVar.I0) {
                    return;
                }
                if (!org.telegram.messenger.v3.T(chat) && rnVar.F0) {
                    Context parentActivity = rnVar.getParentActivity();
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
                    rnVar.O0 = true;
                    t1Var.r(250L);
                    rnVar.getMessagesController().T(rnVar.getParentActivity(), rnVar.w0, rnVar, new oi.f0(19, rnVar, t1Var), null);
                    return;
                }
                TLRPC.Chat chat2 = rnVar.x0;
                boolean z11 = chat2.forum_tabs != rnVar.H0;
                boolean z12 = chat2.forum_sidebar != rnVar.I0;
                rnVar.getMessagesController().m5(rnVar.w0, rnVar.F0, rnVar.H0, rnVar.I0);
                TLRPC.Chat chat3 = rnVar.x0;
                chat3.forum = rnVar.F0;
                chat3.forum_tabs = rnVar.H0;
                chat3.forum_sidebar = rnVar.I0;
                if (z11 || z12) {
                    rnVar.v0(z11);
                    return;
                }
                return;
            case 4:
                final org.telegram.ui.Wallet.v0 v0Var = (org.telegram.ui.Wallet.v0) this.b;
                p10 p10Var2 = (p10) this.c;
                TL_wallet.secretPhraseParts secretphraseparts = (TL_wallet.secretPhraseParts) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (secretphraseparts == null) {
                    String str5 = "NULL_ERROR";
                    if (tL_error == null || (str = tL_error.text) == null) {
                        str = "NULL_ERROR";
                    }
                    org.telegram.ui.Wallet.v0.n("getSecretPhrase: no secret parts: ".concat(str));
                    if (tL_error != null && (str2 = tL_error.text) != null) {
                        str5 = str2;
                    }
                    p10Var2.a(null, str5);
                    return;
                }
                final org.telegram.ui.Wallet.e eVar = new org.telegram.ui.Wallet.e(p10Var2, 2);
                ArrayList<Integer> arrayList3 = secretphraseparts.dcs;
                if (arrayList3.size() <= 0) {
                    org.telegram.ui.Wallet.v0.n("getSecretPhrase: no secret parts, zero dcs");
                    eVar.a(null, "WALLET_SECRET_PARTS_EMPTY");
                    return;
                }
                final org.telegram.ui.ActionBar.t1 t1Var2 = new org.telegram.ui.ActionBar.t1(3, org.telegram.ui.Wallet.v0.C(), null);
                t1Var2.r(500L);
                final long key_generate_temporary_private_key = ConferenceCall.key_generate_temporary_private_key();
                byte[] key_to_public_key = ConferenceCall.key_to_public_key(key_generate_temporary_private_key);
                final boolean[] zArr = new boolean[arrayList3.size()];
                final TL_wallet.encryptedSecretPhrasePart[] encryptedsecretphrasepartArr = new TL_wallet.encryptedSecretPhrasePart[arrayList3.size()];
                final TLRPC.TL_error[] tL_errorArr = new TLRPC.TL_error[arrayList3.size()];
                final int i12 = 0;
                while (i12 < arrayList3.size()) {
                    final int intValue = arrayList3.get(i12).intValue();
                    org.telegram.ui.Wallet.v0.P("getSecretPhrase: requesting " + i12 + " part from dc" + intValue);
                    TL_wallet.fetchEncryptedSecretPhrasePart fetchencryptedsecretphrasepart = new TL_wallet.fetchEncryptedSecretPhrasePart();
                    fetchencryptedsecretphrasepart.token = secretphraseparts.token;
                    fetchencryptedsecretphrasepart.public_key = key_to_public_key;
                    ConnectionsManager.getInstance(v0Var.a).sendRequestTyped(fetchencryptedsecretphrasepart, new d3.b(1), new p10() { // from class: org.telegram.ui.Wallet.e0
                        @Override // org.telegram.messenger.p10
                        public final void a(Object obj4, Object obj5) {
                            v0 v0Var2 = v0.this;
                            boolean[] zArr2 = zArr;
                            int i13 = i12;
                            TL_wallet.encryptedSecretPhrasePart[] encryptedsecretphrasepartArr2 = encryptedsecretphrasepartArr;
                            TLRPC.TL_error[] tL_errorArr2 = tL_errorArr;
                            int i14 = intValue;
                            long j10 = key_generate_temporary_private_key;
                            e eVar2 = eVar;
                            org.telegram.ui.ActionBar.t1 t1Var3 = t1Var2;
                            boolean z13 = true;
                            zArr2[i13] = true;
                            encryptedsecretphrasepartArr2[i13] = (TL_wallet.encryptedSecretPhrasePart) obj4;
                            tL_errorArr2[i13] = (TLRPC.TL_error) obj5;
                            v0.P("getSecretPhrase: received " + i13 + " part from dc" + i14);
                            for (int i15 = 0; i15 < zArr2.length; i15++) {
                                if (!zArr2[i15]) {
                                    z13 = false;
                                }
                            }
                            if (z13) {
                                v0.P("getSecretPhrase: received all parts");
                                j jVar = new j((Object) v0Var2, (Object) t1Var3, (Object) eVar2, 7);
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
                                        v0.n(m10.toString());
                                        String str7 = tL_error2.text;
                                        jVar.a(null, str7 != null ? str7 : "NULL_ERROR");
                                        return;
                                    }
                                    if (encryptedsecretphrasepart.data.length < 33) {
                                        StringBuilder m11 = i5.c.m(i16, "getSecretPhrase: part ", " length < 33 (len=");
                                        m11.append(encryptedsecretphrasepartArr2[i16].data.length);
                                        m11.append(")");
                                        v0.n(m11.toString());
                                        jVar.a(null, "WALLET_PART_" + i16 + "_INVALID");
                                        return;
                                    }
                                }
                                Utilities.d.c(new di.j2(v0Var2, encryptedsecretphrasepartArr2, j10, jVar, 23));
                            }
                        }
                    }, intValue, 0);
                    i12++;
                    arrayList3 = arrayList3;
                }
                return;
            case 5:
                org.telegram.ui.Wallet.v0 v0Var2 = (org.telegram.ui.Wallet.v0) this.b;
                org.telegram.ui.Wallet.a9 a9Var = (org.telegram.ui.Wallet.a9) this.c;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (tL_error2 == null) {
                    v0Var2.w0(walletState);
                    a9Var.a(null);
                    return;
                }
                String str6 = tL_error2.text;
                if (str6 == null) {
                    str6 = "NULL_ERROR";
                }
                org.telegram.ui.Wallet.v0.n("failed to disable backup: ".concat(str6));
                String str7 = tL_error2.text;
                a9Var.a(str7 != null ? str7 : "NULL_ERROR");
                return;
            default:
                org.telegram.ui.Wallet.v0 v0Var3 = (org.telegram.ui.Wallet.v0) this.b;
                a31 a31Var = (a31) this.c;
                TL_wallet.WalletState walletState2 = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                if (tL_error3 == null) {
                    v0Var3.w0(walletState2);
                    v0Var3.Z();
                    a31Var.a(null);
                    return;
                } else {
                    String str8 = tL_error3.text;
                    if (str8 == null) {
                        str8 = "NULL_ERROR";
                    }
                    a31Var.a(str8);
                    return;
                }
        }
    }
}
