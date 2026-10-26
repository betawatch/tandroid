package di;

import android.os.Build;
import android.text.TextUtils;
import fi.cc;
import fi.gb;
import fi.ib;
import fi.sb;
import fi.ta;
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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c0 implements Utilities.Callback3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.Utilities.Callback3
    public final void run(Object obj, Object obj2, Object obj3) {
        ta taVar;
        String str;
        String str2;
        switch (this.a) {
            case 0:
                m2 m2Var = (m2) this.b;
                v0 v0Var = (v0) this.c;
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj3;
                int i10 = m2Var.N;
                if (((Boolean) obj2).booleanValue()) {
                    TL_phone.deleteGroupCallParticipantMessages deletegroupcallparticipantmessages = new TL_phone.deleteGroupCallParticipantMessages();
                    deletegroupcallparticipantmessages.call = m2Var.O;
                    deletegroupcallparticipantmessages.participant = MessagesController.getInstance(i10).getInputPeer(v0Var.c);
                    deletegroupcallparticipantmessages.report_spam = bool.booleanValue();
                    ConnectionsManager.getInstance(i10).sendRequest(deletegroupcallparticipantmessages, null);
                    long j10 = v0Var.c;
                    ArrayList arrayList = m2Var.r;
                    ArrayList arrayList2 = m2Var.s;
                    int i11 = 0;
                    boolean z10 = false;
                    while (i11 < arrayList.size()) {
                        if (((v0) arrayList.get(i11)).c == j10) {
                            v0 v0Var2 = (v0) arrayList.get(i11);
                            int i12 = 0;
                            while (true) {
                                if (i12 < arrayList2.size()) {
                                    if (((w0) arrayList2.get(i12)).f.contains(v0Var2)) {
                                        ((w0) arrayList2.get(i12)).f.remove(v0Var2);
                                        if (((w0) arrayList2.get(i12)).f.isEmpty()) {
                                            arrayList2.remove(i12);
                                            z10 = true;
                                        } else {
                                            m2Var.m();
                                        }
                                    } else {
                                        i12++;
                                    }
                                }
                            }
                            arrayList.remove(i11);
                            m2Var.e.O(true);
                            i11--;
                        }
                        i11++;
                    }
                    if (z10) {
                        ConnectionsManager.getInstance(i10).getCurrentTime();
                        Collections.sort(arrayList2, new a4.d(m2Var, 12));
                        m2Var.n.O(true);
                        m2Var.t();
                    }
                } else {
                    TL_phone.deleteGroupCallMessages deletegroupcallmessages = new TL_phone.deleteGroupCallMessages();
                    deletegroupcallmessages.call = m2Var.O;
                    deletegroupcallmessages.messages.add(Integer.valueOf(v0Var.a));
                    ConnectionsManager.getInstance(i10).sendRequest(deletegroupcallmessages, null);
                    m2Var.c(v0Var.a);
                }
                if (bool2.booleanValue()) {
                    if (m2Var.M >= 0) {
                        MessagesController.getInstance(i10).blockPeer(m2Var.M);
                        return;
                    } else {
                        MessagesController.getInstance(i10).deleteParticipantFromChat(-m2Var.M, MessagesController.getInstance(i10).getInputPeer(v0Var.c), false, true);
                        return;
                    }
                }
                return;
            case 1:
                ib ibVar = (ib) this.b;
                fi.p pVar = (fi.p) this.c;
                File file = (File) obj;
                String str3 = (String) obj2;
                Long l4 = (Long) obj3;
                sb sbVar = ibVar.S1;
                gb gbVar = sbVar.X0;
                if (gbVar != null) {
                    gbVar.O = false;
                    gbVar.c();
                    gb gbVar2 = sbVar.X0;
                    gbVar2.m(0L);
                    cc ccVar = gbVar2.F;
                    if (ccVar != null) {
                        ccVar.setProgress(0L);
                    }
                }
                fi.w7 w7Var = sbVar.K1;
                if (w7Var != null) {
                    w7Var.o0 = file;
                    w7Var.p0 = str3;
                    w7Var.q0 = l4.longValue();
                    fi.w7 w7Var2 = sbVar.K1;
                    w7Var2.s0 = 0.0f;
                    w7Var2.t0 = 1.0f;
                    w7Var2.r0 = 0L;
                    w7Var2.u0 = 1.0f;
                    sbVar.t();
                    if (sbVar.X0 == null || (taVar = sbVar.v1) == null) {
                        pVar.a(false);
                        return;
                    }
                    sg.d2 j02 = taVar.j0(sbVar.K1.p0, true);
                    ibVar.setHasRoundVideo(true);
                    sbVar.X0.s(sbVar.K1, j02, true);
                    AndroidUtilities.cancelRunOnUIThread(pVar.h);
                    pVar.a.destroy(true, null);
                    j02.setDraw(false);
                    pVar.post(new e2.q0(14, pVar, j02));
                    return;
                }
                return;
            case 2:
                hi.y yVar = (hi.y) this.b;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.c;
                Boolean bool3 = (Boolean) obj;
                androidx.biometric.s sVar = (androidx.biometric.s) obj2;
                androidx.biometric.t tVar = (androidx.biometric.t) obj3;
                yVar.getClass();
                String str4 = null;
                if (sVar != null) {
                    try {
                        if (Build.VERSION.SDK_INT >= 30) {
                            tVar = yVar.i(true);
                        }
                        if (tVar != null) {
                            str4 = !TextUtils.isEmpty(yVar.g) ? new String(tVar.b.doFinal(Utilities.hexToBytes(yVar.g)), StandardCharsets.UTF_8) : yVar.g;
                        } else if (!TextUtils.isEmpty(yVar.g)) {
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
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) this.b;
                org.telegram.ui.Wallet.d8 d8Var = (org.telegram.ui.Wallet.d8) this.c;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error == null) {
                    l0Var.i0(walletState);
                    d8Var.run(null);
                    return;
                }
                String str5 = tL_error.text;
                if (str5 == null) {
                    str5 = "NULL_ERROR";
                }
                org.telegram.ui.Wallet.l0.i("failed to disable backup: ".concat(str5));
                String str6 = tL_error.text;
                d8Var.run(str6 != null ? str6 : "NULL_ERROR");
                return;
            case 4:
                final org.telegram.ui.Wallet.l0 l0Var2 = (org.telegram.ui.Wallet.l0) this.b;
                Utilities.Callback2 callback22 = (Utilities.Callback2) this.c;
                TL_wallet.secretPhraseParts secretphraseparts = (TL_wallet.secretPhraseParts) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (secretphraseparts == null) {
                    String str7 = "NULL_ERROR";
                    if (tL_error2 == null || (str = tL_error2.text) == null) {
                        str = "NULL_ERROR";
                    }
                    org.telegram.ui.Wallet.l0.i("getSecretPhrase: no secret parts: ".concat(str));
                    if (tL_error2 != null && (str2 = tL_error2.text) != null) {
                        str7 = str2;
                    }
                    callback22.run(null, str7);
                    return;
                }
                final org.telegram.ui.Wallet.d dVar = new org.telegram.ui.Wallet.d(callback22, 2);
                ArrayList<Integer> arrayList3 = secretphraseparts.dcs;
                if (arrayList3.size() <= 0) {
                    org.telegram.ui.Wallet.l0.i("getSecretPhrase: no secret parts, zero dcs");
                    dVar.run(null, "WALLET_SECRET_PARTS_EMPTY");
                    return;
                }
                final org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(org.telegram.ui.Wallet.l0.v(), 3, null);
                e2Var.r(500L);
                final long key_generate_temporary_private_key = ConferenceCall.key_generate_temporary_private_key();
                byte[] key_to_public_key = ConferenceCall.key_to_public_key(key_generate_temporary_private_key);
                final boolean[] zArr = new boolean[arrayList3.size()];
                final TL_wallet.encryptedSecretPhrasePart[] encryptedsecretphrasepartArr = new TL_wallet.encryptedSecretPhrasePart[arrayList3.size()];
                final TLRPC.TL_error[] tL_errorArr = new TLRPC.TL_error[arrayList3.size()];
                for (final int i13 = 0; i13 < arrayList3.size(); i13++) {
                    final int intValue = arrayList3.get(i13).intValue();
                    org.telegram.ui.Wallet.l0.F("getSecretPhrase: requesting " + i13 + " part from dc" + intValue);
                    TL_wallet.fetchEncryptedSecretPhrasePart fetchencryptedsecretphrasepart = new TL_wallet.fetchEncryptedSecretPhrasePart();
                    fetchencryptedsecretphrasepart.token = secretphraseparts.token;
                    fetchencryptedsecretphrasepart.public_key = key_to_public_key;
                    ConnectionsManager.getInstance(l0Var2.a).sendRequestTyped(fetchencryptedsecretphrasepart, new org.telegram.messenger.a(), new Utilities.Callback2() { // from class: org.telegram.ui.Wallet.x
                        @Override // org.telegram.messenger.Utilities.Callback2
                        public final void run(Object obj4, Object obj5) {
                            l0 l0Var3 = l0.this;
                            boolean[] zArr2 = zArr;
                            int i14 = i13;
                            TL_wallet.encryptedSecretPhrasePart[] encryptedsecretphrasepartArr2 = encryptedsecretphrasepartArr;
                            TLRPC.TL_error[] tL_errorArr2 = tL_errorArr;
                            int i15 = intValue;
                            long j11 = key_generate_temporary_private_key;
                            d dVar2 = dVar;
                            org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                            boolean z11 = true;
                            zArr2[i14] = true;
                            encryptedsecretphrasepartArr2[i14] = (TL_wallet.encryptedSecretPhrasePart) obj4;
                            tL_errorArr2[i14] = (TLRPC.TL_error) obj5;
                            l0.F("getSecretPhrase: received " + i14 + " part from dc" + i15);
                            for (int i16 = 0; i16 < zArr2.length; i16++) {
                                if (!zArr2[i16]) {
                                    z11 = false;
                                }
                            }
                            if (z11) {
                                l0.F("getSecretPhrase: received all parts");
                                j jVar = new j((Object) l0Var3, (Object) e2Var2, (Object) dVar2, 6);
                                for (int i17 = 0; i17 < encryptedsecretphrasepartArr2.length; i17++) {
                                    TL_wallet.encryptedSecretPhrasePart encryptedsecretphrasepart = encryptedsecretphrasepartArr2[i17];
                                    if (encryptedsecretphrasepart == null) {
                                        TLRPC.TL_error tL_error3 = tL_errorArr2[i17];
                                        StringBuilder k10 = ic.a.k(i17, "getSecretPhrase: part ", ": ");
                                        String str8 = tL_error3.text;
                                        if (str8 == null) {
                                            str8 = "NULL_ERROR";
                                        }
                                        k10.append(str8);
                                        l0.i(k10.toString());
                                        String str9 = tL_error3.text;
                                        jVar.run(null, str9 != null ? str9 : "NULL_ERROR");
                                        return;
                                    }
                                    if (encryptedsecretphrasepart.data.length < 33) {
                                        StringBuilder k11 = ic.a.k(i17, "getSecretPhrase: part ", " length < 33 (len=");
                                        k11.append(encryptedsecretphrasepartArr2[i17].data.length);
                                        k11.append(")");
                                        l0.i(k11.toString());
                                        jVar.run(null, "WALLET_PART_" + i17 + "_INVALID");
                                        return;
                                    }
                                }
                                Utilities.stageQueue.postRunnable(new bi.y2(l0Var3, encryptedsecretphrasepartArr2, j11, jVar, 24));
                            }
                        }
                    }, intValue, 0);
                }
                return;
            default:
                org.telegram.ui.Wallet.l0 l0Var3 = (org.telegram.ui.Wallet.l0) this.b;
                org.telegram.ui.Wallet.s sVar2 = (org.telegram.ui.Wallet.s) this.c;
                TL_wallet.WalletState walletState2 = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                if (tL_error3 == null) {
                    l0Var3.i0(walletState2);
                    l0Var3.P();
                    sVar2.run(null);
                    return;
                } else {
                    String str8 = tL_error3.text;
                    if (str8 == null) {
                        str8 = "NULL_ERROR";
                    }
                    sVar2.run(str8);
                    return;
                }
        }
    }
}
