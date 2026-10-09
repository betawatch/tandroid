package ai;

import android.os.Build;
import android.text.TextUtils;
import ci.wc;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.o31;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q0 implements Utilities.Callback3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.Utilities.Callback3
    public final void run(Object obj, Object obj2, Object obj3) {
        ci.nb nbVar;
        String str;
        String str2;
        switch (this.a) {
            case 0:
                s3 s3Var = (s3) this.b;
                m1 m1Var = (m1) this.c;
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj3;
                int i10 = s3Var.N;
                if (((Boolean) obj2).booleanValue()) {
                    TL_phone.deleteGroupCallParticipantMessages deletegroupcallparticipantmessages = new TL_phone.deleteGroupCallParticipantMessages();
                    deletegroupcallparticipantmessages.call = s3Var.O;
                    deletegroupcallparticipantmessages.participant = MessagesController.getInstance(i10).getInputPeer(m1Var.c);
                    deletegroupcallparticipantmessages.report_spam = bool.booleanValue();
                    ConnectionsManager.getInstance(i10).sendRequest(deletegroupcallparticipantmessages, null);
                    long j3 = m1Var.c;
                    ArrayList arrayList = s3Var.r;
                    ArrayList arrayList2 = s3Var.s;
                    int i11 = 0;
                    boolean z10 = false;
                    while (i11 < arrayList.size()) {
                        if (((m1) arrayList.get(i11)).c == j3) {
                            m1 m1Var2 = (m1) arrayList.get(i11);
                            int i12 = 0;
                            while (true) {
                                if (i12 < arrayList2.size()) {
                                    if (((n1) arrayList2.get(i12)).f.contains(m1Var2)) {
                                        ((n1) arrayList2.get(i12)).f.remove(m1Var2);
                                        if (((n1) arrayList2.get(i12)).f.isEmpty()) {
                                            arrayList2.remove(i12);
                                            z10 = true;
                                        } else {
                                            s3Var.m();
                                        }
                                    } else {
                                        i12++;
                                    }
                                }
                            }
                            arrayList.remove(i11);
                            s3Var.e.N(true);
                            i11--;
                        }
                        i11++;
                    }
                    if (z10) {
                        ConnectionsManager.getInstance(i10).getCurrentTime();
                        Collections.sort(arrayList2, new a4.d(s3Var, 4));
                        s3Var.n.N(true);
                        s3Var.t();
                    }
                } else {
                    TL_phone.deleteGroupCallMessages deletegroupcallmessages = new TL_phone.deleteGroupCallMessages();
                    deletegroupcallmessages.call = s3Var.O;
                    deletegroupcallmessages.messages.add(Integer.valueOf(m1Var.a));
                    ConnectionsManager.getInstance(i10).sendRequest(deletegroupcallmessages, null);
                    s3Var.c(m1Var.a);
                }
                if (bool2.booleanValue()) {
                    if (s3Var.M >= 0) {
                        MessagesController.getInstance(i10).blockPeer(s3Var.M);
                        return;
                    } else {
                        MessagesController.getInstance(i10).deleteParticipantFromChat(-s3Var.M, MessagesController.getInstance(i10).getInputPeer(m1Var.c), false, true);
                        return;
                    }
                }
                return;
            case 1:
                ci.bc bcVar = (ci.bc) this.b;
                ci.p pVar = (ci.p) this.c;
                File file = (File) obj;
                String str3 = (String) obj2;
                Long l4 = (Long) obj3;
                ci.lc lcVar = bcVar.S1;
                ci.zb zbVar = lcVar.X0;
                if (zbVar != null) {
                    zbVar.O = false;
                    zbVar.c();
                    ci.zb zbVar2 = lcVar.X0;
                    zbVar2.m(0L);
                    wc wcVar = zbVar2.F;
                    if (wcVar != null) {
                        wcVar.setProgress(0L);
                    }
                }
                ci.l8 l8Var = lcVar.K1;
                if (l8Var != null) {
                    l8Var.o0 = file;
                    l8Var.p0 = str3;
                    l8Var.q0 = l4.longValue();
                    ci.l8 l8Var2 = lcVar.K1;
                    l8Var2.s0 = 0.0f;
                    l8Var2.t0 = 1.0f;
                    l8Var2.r0 = 0L;
                    l8Var2.u0 = 1.0f;
                    lcVar.t();
                    if (lcVar.X0 == null || (nbVar = lcVar.v1) == null) {
                        pVar.a(false);
                        return;
                    }
                    qg.c2 l02 = nbVar.l0(lcVar.K1.p0, true);
                    bcVar.setHasRoundVideo(true);
                    lcVar.X0.s(lcVar.K1, l02, true);
                    AndroidUtilities.cancelRunOnUIThread(pVar.h);
                    pVar.a.destroy(true, null);
                    l02.setDraw(false);
                    pVar.post(new ca(24, pVar, l02));
                    return;
                }
                return;
            case 2:
                ei.r rVar = (ei.r) this.b;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.c;
                Boolean bool3 = (Boolean) obj;
                androidx.biometric.s sVar = (androidx.biometric.s) obj2;
                androidx.biometric.t tVar = (androidx.biometric.t) obj3;
                rVar.getClass();
                String str4 = null;
                if (sVar != null) {
                    try {
                        if (Build.VERSION.SDK_INT >= 30) {
                            tVar = rVar.i(true);
                        }
                        if (tVar != null) {
                            str4 = !TextUtils.isEmpty(rVar.g) ? new String(tVar.b.doFinal(Utilities.hexToBytes(rVar.g)), StandardCharsets.UTF_8) : rVar.g;
                        } else if (!TextUtils.isEmpty(rVar.g)) {
                            throw new RuntimeException("No cryptoObject found");
                        }
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        bool3 = Boolean.FALSE;
                    }
                }
                callback2.run(bool3, str4);
                return;
            case 3:
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) this.b;
                org.telegram.ui.Wallet.h7 h7Var = (org.telegram.ui.Wallet.h7) this.c;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error == null) {
                    k0Var.g0(walletState);
                    h7Var.run(null);
                    return;
                }
                String str5 = tL_error.text;
                if (str5 == null) {
                    str5 = "NULL_ERROR";
                }
                org.telegram.ui.Wallet.k0.i("failed to disable backup: ".concat(str5));
                String str6 = tL_error.text;
                h7Var.run(str6 != null ? str6 : "NULL_ERROR");
                return;
            case 4:
                final org.telegram.ui.Wallet.k0 k0Var2 = (org.telegram.ui.Wallet.k0) this.b;
                Utilities.Callback2 callback22 = (Utilities.Callback2) this.c;
                TL_wallet.secretPhraseParts secretphraseparts = (TL_wallet.secretPhraseParts) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (secretphraseparts == null) {
                    String str7 = "NULL_ERROR";
                    if (tL_error2 == null || (str = tL_error2.text) == null) {
                        str = "NULL_ERROR";
                    }
                    org.telegram.ui.Wallet.k0.i("getSecretPhrase: no secret parts: ".concat(str));
                    if (tL_error2 != null && (str2 = tL_error2.text) != null) {
                        str7 = str2;
                    }
                    callback22.run(null, str7);
                    return;
                }
                final org.telegram.ui.Wallet.d dVar = new org.telegram.ui.Wallet.d(callback22, 3);
                ArrayList<Integer> arrayList3 = secretphraseparts.dcs;
                if (arrayList3.size() <= 0) {
                    org.telegram.ui.Wallet.k0.i("getSecretPhrase: no secret parts, zero dcs");
                    dVar.run(null, "WALLET_SECRET_PARTS_EMPTY");
                    return;
                }
                final org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(org.telegram.ui.Wallet.k0.u(), 3, null);
                b2Var.q(500L);
                final long key_generate_temporary_private_key = ConferenceCall.key_generate_temporary_private_key();
                byte[] key_to_public_key = ConferenceCall.key_to_public_key(key_generate_temporary_private_key);
                final boolean[] zArr = new boolean[arrayList3.size()];
                final TL_wallet.encryptedSecretPhrasePart[] encryptedsecretphrasepartArr = new TL_wallet.encryptedSecretPhrasePart[arrayList3.size()];
                final TLRPC.TL_error[] tL_errorArr = new TLRPC.TL_error[arrayList3.size()];
                for (final int i13 = 0; i13 < arrayList3.size(); i13++) {
                    final int intValue = arrayList3.get(i13).intValue();
                    org.telegram.ui.Wallet.k0.E("getSecretPhrase: requesting " + i13 + " part from dc" + intValue);
                    TL_wallet.fetchEncryptedSecretPhrasePart fetchencryptedsecretphrasepart = new TL_wallet.fetchEncryptedSecretPhrasePart();
                    fetchencryptedsecretphrasepart.token = secretphraseparts.token;
                    fetchencryptedsecretphrasepart.public_key = key_to_public_key;
                    ConnectionsManager.getInstance(k0Var2.a).sendRequestTyped(fetchencryptedsecretphrasepart, new org.telegram.messenger.a(), new Utilities.Callback2() { // from class: org.telegram.ui.Wallet.w
                        @Override // org.telegram.messenger.Utilities.Callback2
                        public final void run(Object obj4, Object obj5) {
                            k0 k0Var3 = k0.this;
                            boolean[] zArr2 = zArr;
                            int i14 = i13;
                            TL_wallet.encryptedSecretPhrasePart[] encryptedsecretphrasepartArr2 = encryptedsecretphrasepartArr;
                            TLRPC.TL_error[] tL_errorArr2 = tL_errorArr;
                            int i15 = intValue;
                            long j10 = key_generate_temporary_private_key;
                            d dVar2 = dVar;
                            org.telegram.ui.ActionBar.b2 b2Var2 = b2Var;
                            boolean z11 = true;
                            zArr2[i14] = true;
                            encryptedsecretphrasepartArr2[i14] = (TL_wallet.encryptedSecretPhrasePart) obj4;
                            tL_errorArr2[i14] = (TLRPC.TL_error) obj5;
                            k0.E("getSecretPhrase: received " + i14 + " part from dc" + i15);
                            for (int i16 = 0; i16 < zArr2.length; i16++) {
                                if (!zArr2[i16]) {
                                    z11 = false;
                                }
                            }
                            if (z11) {
                                k0.E("getSecretPhrase: received all parts");
                                i iVar = new i((Object) k0Var3, (Object) b2Var2, (Object) dVar2, 6);
                                for (int i17 = 0; i17 < encryptedsecretphrasepartArr2.length; i17++) {
                                    TL_wallet.encryptedSecretPhrasePart encryptedsecretphrasepart = encryptedsecretphrasepartArr2[i17];
                                    if (encryptedsecretphrasepart == null) {
                                        TLRPC.TL_error tL_error3 = tL_errorArr2[i17];
                                        StringBuilder j11 = hg.c.j(i17, "getSecretPhrase: part ", ": ");
                                        String str8 = tL_error3.text;
                                        if (str8 == null) {
                                            str8 = "NULL_ERROR";
                                        }
                                        j11.append(str8);
                                        k0.i(j11.toString());
                                        String str9 = tL_error3.text;
                                        iVar.run(null, str9 != null ? str9 : "NULL_ERROR");
                                        return;
                                    }
                                    if (encryptedsecretphrasepart.data.length < 33) {
                                        StringBuilder j12 = hg.c.j(i17, "getSecretPhrase: part ", " length < 33 (len=");
                                        j12.append(encryptedsecretphrasepartArr2[i17].data.length);
                                        j12.append(")");
                                        k0.i(j12.toString());
                                        iVar.run(null, "WALLET_PART_" + i17 + "_INVALID");
                                        return;
                                    }
                                }
                                Utilities.stageQueue.postRunnable(new o31(k0Var3, encryptedsecretphrasepartArr2, j10, iVar, 6));
                            }
                        }
                    }, intValue, 0);
                }
                return;
            default:
                org.telegram.ui.Wallet.k0 k0Var3 = (org.telegram.ui.Wallet.k0) this.b;
                org.telegram.ui.Wallet.z6 z6Var = (org.telegram.ui.Wallet.z6) this.c;
                TL_wallet.WalletState walletState2 = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                if (tL_error3 == null) {
                    k0Var3.g0(walletState2);
                    k0Var3.O();
                    z6Var.run(null);
                    return;
                } else {
                    String str8 = tL_error3.text;
                    if (str8 == null) {
                        str8 = "NULL_ERROR";
                    }
                    z6Var.run(str8);
                    return;
                }
        }
    }
}
