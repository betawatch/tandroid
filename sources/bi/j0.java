package bi;

import android.os.Build;
import android.text.TextUtils;
import di.kc;
import di.uc;
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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j0 implements Utilities.Callback3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.Utilities.Callback3
    public final void run(Object obj, Object obj2, Object obj3) {
        di.mb mbVar;
        String str;
        String str2;
        switch (this.a) {
            case 0:
                h3 h3Var = (h3) this.b;
                e1 e1Var = (e1) this.c;
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj3;
                int i10 = h3Var.N;
                if (((Boolean) obj2).booleanValue()) {
                    TL_phone.deleteGroupCallParticipantMessages deletegroupcallparticipantmessages = new TL_phone.deleteGroupCallParticipantMessages();
                    deletegroupcallparticipantmessages.call = h3Var.O;
                    deletegroupcallparticipantmessages.participant = MessagesController.getInstance(i10).getInputPeer(e1Var.c);
                    deletegroupcallparticipantmessages.report_spam = bool.booleanValue();
                    ConnectionsManager.getInstance(i10).sendRequest(deletegroupcallparticipantmessages, null);
                    long j10 = e1Var.c;
                    ArrayList arrayList = h3Var.r;
                    ArrayList arrayList2 = h3Var.s;
                    int i11 = 0;
                    boolean z10 = false;
                    while (i11 < arrayList.size()) {
                        if (((e1) arrayList.get(i11)).c == j10) {
                            e1 e1Var2 = (e1) arrayList.get(i11);
                            int i12 = 0;
                            while (true) {
                                if (i12 < arrayList2.size()) {
                                    if (((f1) arrayList2.get(i12)).f.contains(e1Var2)) {
                                        ((f1) arrayList2.get(i12)).f.remove(e1Var2);
                                        if (((f1) arrayList2.get(i12)).f.isEmpty()) {
                                            arrayList2.remove(i12);
                                            z10 = true;
                                        } else {
                                            h3Var.m();
                                        }
                                    } else {
                                        i12++;
                                    }
                                }
                            }
                            arrayList.remove(i11);
                            h3Var.e.N(true);
                            i11--;
                        }
                        i11++;
                    }
                    if (z10) {
                        ConnectionsManager.getInstance(i10).getCurrentTime();
                        Collections.sort(arrayList2, new a4.d(h3Var, 7));
                        h3Var.n.N(true);
                        h3Var.t();
                    }
                } else {
                    TL_phone.deleteGroupCallMessages deletegroupcallmessages = new TL_phone.deleteGroupCallMessages();
                    deletegroupcallmessages.call = h3Var.O;
                    deletegroupcallmessages.messages.add(Integer.valueOf(e1Var.a));
                    ConnectionsManager.getInstance(i10).sendRequest(deletegroupcallmessages, null);
                    h3Var.c(e1Var.a);
                }
                if (bool2.booleanValue()) {
                    if (h3Var.M >= 0) {
                        MessagesController.getInstance(i10).blockPeer(h3Var.M);
                        return;
                    } else {
                        MessagesController.getInstance(i10).deleteParticipantFromChat(-h3Var.M, MessagesController.getInstance(i10).getInputPeer(e1Var.c), false, true);
                        return;
                    }
                }
                return;
            case 1:
                di.ac acVar = (di.ac) this.b;
                di.p pVar = (di.p) this.c;
                File file = (File) obj;
                String str3 = (String) obj2;
                Long l4 = (Long) obj3;
                kc kcVar = acVar.S1;
                di.yb ybVar = kcVar.X0;
                if (ybVar != null) {
                    ybVar.O = false;
                    ybVar.c();
                    di.yb ybVar2 = kcVar.X0;
                    ybVar2.m(0L);
                    uc ucVar = ybVar2.F;
                    if (ucVar != null) {
                        ucVar.setProgress(0L);
                    }
                }
                di.k8 k8Var = kcVar.K1;
                if (k8Var != null) {
                    k8Var.o0 = file;
                    k8Var.p0 = str3;
                    k8Var.q0 = l4.longValue();
                    di.k8 k8Var2 = kcVar.K1;
                    k8Var2.s0 = 0.0f;
                    k8Var2.t0 = 1.0f;
                    k8Var2.r0 = 0L;
                    k8Var2.u0 = 1.0f;
                    kcVar.t();
                    if (kcVar.X0 == null || (mbVar = kcVar.v1) == null) {
                        pVar.a(false);
                        return;
                    }
                    rg.d2 l02 = mbVar.l0(kcVar.K1.p0, true);
                    acVar.setHasRoundVideo(true);
                    kcVar.X0.s(kcVar.K1, l02, true);
                    AndroidUtilities.cancelRunOnUIThread(pVar.h);
                    pVar.a.destroy(true, null);
                    l02.setDraw(false);
                    pVar.post(new di.y6(5, pVar, l02));
                    return;
                }
                return;
            case 2:
                fi.r rVar = (fi.r) this.b;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.c;
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
                            str4 = !TextUtils.isEmpty(rVar.g) ? new String(vVar.b.doFinal(Utilities.hexToBytes(rVar.g)), StandardCharsets.UTF_8) : rVar.g;
                        } else if (!TextUtils.isEmpty(rVar.g)) {
                            throw new RuntimeException("No cryptoObject found");
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
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
                final org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(org.telegram.ui.Wallet.k0.u(), 3, null);
                a2Var.q(500L);
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
                            long j11 = key_generate_temporary_private_key;
                            d dVar2 = dVar;
                            org.telegram.ui.ActionBar.a2 a2Var2 = a2Var;
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
                                j jVar = new j((Object) k0Var3, (Object) a2Var2, (Object) dVar2, 6);
                                for (int i17 = 0; i17 < encryptedsecretphrasepartArr2.length; i17++) {
                                    TL_wallet.encryptedSecretPhrasePart encryptedsecretphrasepart = encryptedsecretphrasepartArr2[i17];
                                    if (encryptedsecretphrasepart == null) {
                                        TLRPC.TL_error tL_error3 = tL_errorArr2[i17];
                                        StringBuilder l10 = i2.d.l(i17, "getSecretPhrase: part ", ": ");
                                        String str8 = tL_error3.text;
                                        if (str8 == null) {
                                            str8 = "NULL_ERROR";
                                        }
                                        l10.append(str8);
                                        k0.i(l10.toString());
                                        String str9 = tL_error3.text;
                                        jVar.run(null, str9 != null ? str9 : "NULL_ERROR");
                                        return;
                                    }
                                    if (encryptedsecretphrasepart.data.length < 33) {
                                        StringBuilder l11 = i2.d.l(i17, "getSecretPhrase: part ", " length < 33 (len=");
                                        l11.append(encryptedsecretphrasepartArr2[i17].data.length);
                                        l11.append(")");
                                        k0.i(l11.toString());
                                        jVar.run(null, "WALLET_PART_" + i17 + "_INVALID");
                                        return;
                                    }
                                }
                                Utilities.stageQueue.postRunnable(new bi.b8(k0Var3, encryptedsecretphrasepartArr2, j11, jVar, 16));
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
