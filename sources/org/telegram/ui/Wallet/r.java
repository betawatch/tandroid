package org.telegram.ui.Wallet;

import android.text.SpannableString;
import android.text.TextUtils;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.c20;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.v10;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.uy0;
import org.telegram.ui.Components.vy0;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.c01;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r implements v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ r(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX WARN: Removed duplicated region for block: B:203:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x045b A[Catch: all -> 0x037e, Exception -> 0x0382, TRY_LEAVE, TryCatch #20 {Exception -> 0x0382, blocks: (B:155:0x0386, B:156:0x0389, B:161:0x037a, B:164:0x0395, B:185:0x03f0, B:186:0x03f3, B:188:0x0404, B:204:0x0447, B:205:0x044a, B:207:0x045b, B:217:0x0469), top: B:138:0x032e }] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:277:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x04ff A[Catch: all -> 0x0521, TryCatch #1 {all -> 0x0521, blocks: (B:262:0x04f1, B:265:0x0503, B:279:0x04ff), top: B:261:0x04f1 }] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x052f  */
    @Override // org.telegram.messenger.v10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        String str;
        byte[] bArr;
        String str2;
        byte[] bArr2;
        byte[][] bArr3;
        byte[] c10;
        char c11;
        SerializedData serializedData;
        char c12;
        byte[] bArr4;
        Long l10;
        Long l11;
        Long l12;
        int i7;
        byte[] byteArray;
        byte[][] bArr5;
        int i10;
        byte[] key_to_public_key;
        long key_from_ecdh;
        Long valueOf;
        String str3;
        String str4;
        str = "NULL_ERROR";
        boolean z9 = false;
        switch (this.a) {
            case 0:
                m0 m0Var = (m0) this.b;
                d0 d0Var = (d0) this.c;
                String str5 = (String) this.d;
                Runnable runnable = (Runnable) this.e;
                TL_toncenter.apiResponse apiresponse = (TL_toncenter.apiResponse) obj;
                if (apiresponse != null) {
                    try {
                        d0Var.b = Long.parseLong(new JSONObject(apiresponse.response.data).getString("balance"));
                        if (m0Var.N.get(str5) == d0Var) {
                            m0Var.k0(d0Var);
                            m0Var.L();
                        }
                    } catch (Exception e10) {
                        m0.k("failed to get balance of " + str5, e10);
                    }
                }
                runnable.run();
                return;
            case 1:
                m0 m0Var2 = (m0) this.b;
                t tVar = (t) this.c;
                j0 j0Var = (j0) this.d;
                byte[] bArr6 = (byte[]) this.e;
                Vector vector = (Vector) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (vector == null) {
                    if (tL_error == null || (str3 = tL_error.text) == null) {
                        str3 = "NULL_ERROR";
                    }
                    m0.j("enable backup: didnt get backup holders: ".concat(str3));
                    if (tL_error != null && (str4 = tL_error.text) != null) {
                        str = str4;
                    }
                    tVar.a(str);
                    return;
                }
                int size = vector.objects.size();
                if (size != 3) {
                    m0.j("enable backup: expected three backup holders");
                    tVar.a("INVALID_BACKUP_HOLDERS_COUNT");
                    return;
                }
                byte[][] bArr7 = new byte[size][];
                try {
                    c10 = j0Var.c();
                } catch (Exception e11) {
                    e = e11;
                    str2 = "NULL_ERROR";
                    bArr = null;
                } catch (Throwable th2) {
                    th = th2;
                    bArr = null;
                }
                try {
                    bArr2 = m0.T(c10);
                    try {
                        bArr3 = m0.e0(bArr2, new SecureRandom());
                        try {
                            try {
                            } catch (Exception e12) {
                                e = e12;
                                str2 = "NULL_ERROR";
                            }
                            try {
                                if (org.telegram.messenger.r2.a) {
                                    byte[] bArr8 = new byte[qs.s3];
                                    c11 = 1;
                                    try {
                                        int length = bArr3.length;
                                        int i11 = 0;
                                        while (i11 < length) {
                                            byte[] bArr9 = bArr3[i11];
                                            String str6 = str;
                                            int i12 = length;
                                            for (int i13 = 0; i13 < bArr9.length; i13++) {
                                                try {
                                                    bArr8[i13] = (byte) (bArr8[i13] ^ bArr9[i13]);
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    Arrays.fill(bArr8, (byte) 0);
                                                    throw th;
                                                }
                                            }
                                            i11++;
                                            length = i12;
                                            str = str6;
                                        }
                                        m0.H("enable backup: diagnostics sharesReconstructPaddedMnemonic=" + Arrays.equals(bArr2, bArr8));
                                        Arrays.fill(bArr8, (byte) 0);
                                    } catch (Throwable th4) {
                                        th = th4;
                                    }
                                } else {
                                    c11 = 1;
                                }
                                int i14 = 0;
                                while (i14 < size) {
                                    TL_wallet.holderDc holderdc = (TL_wallet.holderDc) vector.objects.get(i14);
                                    SerializedData serializedData2 = new SerializedData();
                                    try {
                                        TL_wallet.mnemonic_decryptedKeyPart mnemonic_decryptedkeypart = new TL_wallet.mnemonic_decryptedKeyPart();
                                        c12 = 2;
                                        try {
                                            mnemonic_decryptedkeypart.share = bArr3[i14];
                                            mnemonic_decryptedkeypart.serializeToStream(serializedData2);
                                            byteArray = serializedData2.toByteArray();
                                            bArr5 = bArr7;
                                            try {
                                                long key_generate_temporary_private_key = ConferenceCall.key_generate_temporary_private_key();
                                                l11 = Long.valueOf(key_generate_temporary_private_key);
                                                i10 = i14;
                                                try {
                                                    key_to_public_key = ConferenceCall.key_to_public_key(key_generate_temporary_private_key);
                                                    serializedData = serializedData2;
                                                    try {
                                                        long key_from_public_key = ConferenceCall.key_from_public_key(holderdc.public_key);
                                                        l12 = Long.valueOf(key_from_public_key);
                                                        try {
                                                            key_from_ecdh = ConferenceCall.key_from_ecdh(key_generate_temporary_private_key, key_from_public_key);
                                                            valueOf = Long.valueOf(key_from_ecdh);
                                                        } catch (Throwable th5) {
                                                            th = th5;
                                                            bArr4 = byteArray;
                                                            l10 = null;
                                                        }
                                                    } catch (Throwable th6) {
                                                        th = th6;
                                                        bArr4 = byteArray;
                                                        l10 = null;
                                                        l12 = null;
                                                        if (bArr4 != null) {
                                                            Arrays.fill(bArr4, (byte) 0);
                                                        }
                                                        serializedData.cleanup();
                                                        Long[] lArr = new Long[3];
                                                        lArr[0] = l10;
                                                        lArr[c11] = l12;
                                                        lArr[c12] = l11;
                                                        for (i7 = 0; i7 < 3; i7++) {
                                                            Long l13 = lArr[i7];
                                                            if (l13 != null) {
                                                                try {
                                                                    ConferenceCall.key_destroy(l13.longValue());
                                                                } catch (Exception unused) {
                                                                }
                                                            }
                                                        }
                                                        throw th;
                                                    }
                                                } catch (Throwable th7) {
                                                    th = th7;
                                                    serializedData = serializedData2;
                                                }
                                            } catch (Throwable th8) {
                                                th = th8;
                                                serializedData = serializedData2;
                                                bArr4 = byteArray;
                                                l10 = null;
                                                l11 = null;
                                                l12 = null;
                                                if (bArr4 != null) {
                                                }
                                                serializedData.cleanup();
                                                Long[] lArr2 = new Long[3];
                                                lArr2[0] = l10;
                                                lArr2[c11] = l12;
                                                lArr2[c12] = l11;
                                                while (i7 < 3) {
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th9) {
                                            th = th9;
                                            serializedData = serializedData2;
                                            bArr4 = null;
                                            l10 = null;
                                            l11 = null;
                                            l12 = null;
                                            if (bArr4 != null) {
                                            }
                                            serializedData.cleanup();
                                            Long[] lArr22 = new Long[3];
                                            lArr22[0] = l10;
                                            lArr22[c11] = l12;
                                            lArr22[c12] = l11;
                                            while (i7 < 3) {
                                            }
                                            throw th;
                                        }
                                        try {
                                            byte[] encrypt_message_for_one = ConferenceCall.encrypt_message_for_one(key_from_ecdh, byteArray);
                                            byte[] bArr10 = new byte[encrypt_message_for_one.length + 32];
                                            Vector vector2 = vector;
                                            System.arraycopy(key_to_public_key, 0, bArr10, 0, 32);
                                            System.arraycopy(encrypt_message_for_one, 0, bArr10, 32, encrypt_message_for_one.length);
                                            bArr5[i10] = bArr10;
                                            if (byteArray != null) {
                                                Arrays.fill(byteArray, (byte) 0);
                                            }
                                            serializedData.cleanup();
                                            Long[] lArr3 = new Long[3];
                                            lArr3[0] = valueOf;
                                            lArr3[c11] = l12;
                                            lArr3[2] = l11;
                                            int i15 = 0;
                                            for (int i16 = 3; i15 < i16; i16 = 3) {
                                                Long l14 = lArr3[i15];
                                                if (l14 != null) {
                                                    try {
                                                        ConferenceCall.key_destroy(l14.longValue());
                                                    } catch (Exception unused2) {
                                                    }
                                                }
                                                i15++;
                                            }
                                            i14 = i10 + 1;
                                            bArr7 = bArr5;
                                            vector = vector2;
                                        } catch (Throwable th10) {
                                            th = th10;
                                            bArr4 = byteArray;
                                            l10 = valueOf;
                                            if (bArr4 != null) {
                                            }
                                            serializedData.cleanup();
                                            Long[] lArr222 = new Long[3];
                                            lArr222[0] = l10;
                                            lArr222[c11] = l12;
                                            lArr222[c12] = l11;
                                            while (i7 < 3) {
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th11) {
                                        th = th11;
                                        serializedData = serializedData2;
                                        c12 = 2;
                                    }
                                }
                                byte[][] bArr11 = bArr7;
                                byte b10 = 0;
                                Arrays.fill(c10, (byte) 0);
                                Arrays.fill(bArr2, (byte) 0);
                                int length2 = bArr3.length;
                                int i17 = 0;
                                while (i17 < length2) {
                                    Arrays.fill(bArr3[i17], b10);
                                    i17++;
                                    b10 = 0;
                                }
                                for (int i18 = 0; i18 < size; i18++) {
                                    if (bArr11[i18] == null) {
                                        m0.j("part " + i18 + " is null");
                                        tVar.a("PART_" + i18 + "_NULL");
                                        return;
                                    }
                                }
                                TL_wallet.enableBackup enablebackup = new TL_wallet.enableBackup();
                                enablebackup.parts = new ArrayList<>(Arrays.asList(bArr11));
                                enablebackup.new_public_key = bArr6;
                                m0Var2.U(j0Var, false, new j((Object) m0Var2, (Object) tVar, (Object) enablebackup, 7));
                                return;
                            } catch (Exception e13) {
                                e = e13;
                                bArr = c10;
                                try {
                                    m0.k("enable backup", e);
                                    tVar.a(e.getMessage() == null ? str2 : e.getMessage());
                                    byte b11 = 0;
                                    if (bArr != null) {
                                        Arrays.fill(bArr, (byte) 0);
                                    }
                                    if (bArr2 != null) {
                                        Arrays.fill(bArr2, (byte) 0);
                                    }
                                    if (bArr3 != null) {
                                        int length3 = bArr3.length;
                                        int i19 = 0;
                                        while (i19 < length3) {
                                            Arrays.fill(bArr3[i19], b11);
                                            i19++;
                                            b11 = 0;
                                        }
                                        return;
                                    }
                                    return;
                                } catch (Throwable th12) {
                                    th = th12;
                                    if (bArr != null) {
                                        Arrays.fill(bArr, (byte) 0);
                                    }
                                    if (bArr2 != null) {
                                        Arrays.fill(bArr2, (byte) 0);
                                    }
                                    if (bArr3 != null) {
                                        for (byte[] bArr12 : bArr3) {
                                            Arrays.fill(bArr12, (byte) 0);
                                        }
                                    }
                                    throw th;
                                }
                            }
                        } catch (Throwable th13) {
                            th = th13;
                            bArr = c10;
                            if (bArr != null) {
                            }
                            if (bArr2 != null) {
                            }
                            if (bArr3 != null) {
                            }
                            throw th;
                        }
                    } catch (Exception e14) {
                        e = e14;
                        str2 = "NULL_ERROR";
                        bArr = c10;
                        bArr3 = null;
                        m0.k("enable backup", e);
                        tVar.a(e.getMessage() == null ? str2 : e.getMessage());
                        byte b112 = 0;
                        if (bArr != null) {
                        }
                        if (bArr2 != null) {
                        }
                        if (bArr3 != null) {
                        }
                    } catch (Throwable th14) {
                        th = th14;
                        bArr = c10;
                        bArr3 = null;
                        if (bArr != null) {
                        }
                        if (bArr2 != null) {
                        }
                        if (bArr3 != null) {
                        }
                        throw th;
                    }
                } catch (Exception e15) {
                    e = e15;
                    str2 = "NULL_ERROR";
                    bArr = c10;
                    bArr2 = null;
                    bArr3 = null;
                    m0.k("enable backup", e);
                    tVar.a(e.getMessage() == null ? str2 : e.getMessage());
                    byte b1122 = 0;
                    if (bArr != null) {
                    }
                    if (bArr2 != null) {
                    }
                    if (bArr3 != null) {
                    }
                } catch (Throwable th15) {
                    th = th15;
                    bArr = c10;
                    bArr2 = null;
                    bArr3 = null;
                    if (bArr != null) {
                    }
                    if (bArr2 != null) {
                    }
                    if (bArr3 != null) {
                    }
                    throw th;
                }
                break;
            case 2:
                ((m0) this.b).U((j0) this.c, true, new r((c20) this.d, (c20) obj2, (byte[]) this.e, (TLRPC.InputCheckPasswordSRP) obj, 3));
                return;
            case 3:
                c20 c20Var = (c20) this.b;
                c20 c20Var2 = (c20) this.c;
                byte[] bArr13 = (byte[]) this.d;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) this.e;
                WalletEngine2.ImportedWalletProof importedWalletProof = (WalletEngine2.ImportedWalletProof) obj;
                String str7 = (String) obj2;
                if (importedWalletProof == null) {
                    c20Var.a(str7 != null ? str7 : "NULL_ERROR");
                    c20Var2.a(null);
                    return;
                }
                TL_wallet.replaceWallet replacewallet = new TL_wallet.replaceWallet();
                TL_wallet.inputWalletImported inputwalletimported = new TL_wallet.inputWalletImported();
                inputwalletimported.public_key = importedWalletProof.publicKey;
                inputwalletimported.anchor_public_key = bArr13;
                TL_wallet.walletOwnershipProof walletownershipproof = new TL_wallet.walletOwnershipProof();
                inputwalletimported.proof = walletownershipproof;
                walletownershipproof.signature = importedWalletProof.signature;
                walletownershipproof.timestamp = importedWalletProof.timestamp;
                replacewallet.wallet = inputwalletimported;
                replacewallet.password = inputCheckPasswordSRP;
                c20Var2.a(replacewallet);
                return;
            case 4:
                c0 c0Var = (c0) this.b;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) this.c;
                String str8 = (String) this.d;
                v10 v10Var = (v10) this.e;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str9 = (String) obj2;
                if (wallettransaction != null) {
                    wallettransaction.nft = nftitem;
                    wallettransaction.comment = str8;
                    wallettransaction.date = ConnectionsManager.getInstance(c0Var.h.a).getCurrentTime();
                }
                if (c0Var.a) {
                    return;
                }
                v10Var.a(wallettransaction, str9);
                return;
            case 5:
                l0 l0Var = (l0) this.b;
                String str10 = (String) this.d;
                String str11 = (String) this.c;
                String str12 = (String) this.e;
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                l0Var.getClass();
                if (walletuseraddress == null || walletuseraddress.user_id == 0 || qp.s1(l0Var.l.a).a2(Long.valueOf(walletuseraddress.user_id)) == null) {
                    return;
                }
                ArrayList arrayList = l0Var.b;
                int size2 = arrayList.size();
                int i20 = 0;
                while (i20 < size2) {
                    Object obj3 = arrayList.get(i20);
                    i20++;
                    TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj3;
                    if (TextUtils.equals(wallettransaction2.id, str10) && (wallettransaction2.peer instanceof TL_wallet.walletTransactionPeerAddress)) {
                        TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = new TL_wallet.walletTransactionPeerUser();
                        wallettransactionpeeruser.user_id = walletuseraddress.user_id;
                        wallettransactionpeeruser.address = str11;
                        wallettransactionpeeruser.domain = str12;
                        wallettransaction2.peer = wallettransactionpeeruser;
                        z9 = true;
                    }
                }
                if (z9) {
                    l0Var.k();
                    l0Var.i();
                    return;
                }
                return;
            case 6:
                t tVar2 = (t) this.b;
                j0 j0Var2 = (j0) this.c;
                a2 a2Var = (a2) this.d;
                bi.n3 n3Var = (bi.n3) this.e;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (tonconnectchallenge == null || tL_error2 != null) {
                    tVar2.a(e2.z(tL_error2, "registerKey"));
                    return;
                } else {
                    Utilities.e.c(new c01(j0Var2, a2Var, tonconnectchallenge, tVar2, n3Var, 4));
                    return;
                }
            case 7:
                e2 e2Var = (e2) this.b;
                a2 a2Var2 = (a2) this.c;
                j0 j0Var3 = (j0) this.d;
                c20 c20Var3 = (c20) this.e;
                TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj;
                String str13 = (String) obj2;
                if (sendtransfer != null && str13 == null && e2Var.A(a2Var2) && !e2Var.j(a2Var2)) {
                    Utilities.e.c(new c01(e2Var, sendtransfer, a2Var2, c20Var3, j0Var3, 5));
                    return;
                }
                if (str13 == null) {
                    str13 = "Transfer unavailable or request expired";
                }
                e2Var.y(a2Var2, j0Var3, null, 0, str13, c20Var3);
                return;
            case 8:
                e2 e2Var2 = (e2) this.b;
                a2 a2Var3 = (a2) this.c;
                j0 j0Var4 = (j0) this.d;
                t tVar3 = (t) this.e;
                String str14 = (String) obj;
                String str15 = (String) obj2;
                if (str14 != null) {
                    try {
                        if (e2Var2.A(a2Var3) && !e2Var2.j(a2Var3)) {
                            e2Var2.y(a2Var3, j0Var4, new JSONObject().put("internalBoc", str14), -1, null, tVar3);
                            return;
                        }
                    } catch (JSONException e16) {
                        e2Var2.y(a2Var3, j0Var4, null, 0, e2.i("sign message response", e16), tVar3);
                        return;
                    }
                }
                str15 = "Request expired or wallet changed";
                e2Var2.y(a2Var3, j0Var4, null, 0, str15, tVar3);
                return;
            case 9:
                boolean[] zArr = (boolean[]) this.b;
                z2[] z2VarArr = (z2[]) this.c;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.d;
                xh.l lVar = (xh.l) this.e;
                String str16 = (String) obj;
                String str17 = (String) obj2;
                zArr[0] = false;
                if (str17 != null) {
                    new hc(z2VarArr[0].E, f6Var).e0(str17, false);
                    return;
                }
                lVar.setPadding(org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(8.0f));
                SpannableString spannableString = new SpannableString(str16);
                uy0 uy0Var = new uy0();
                uy0Var.a |= 256;
                spannableString.setSpan(new vy0(uy0Var, 0), 0, spannableString.length(), 33);
                lVar.setText(spannableString);
                lVar.setTextIsSelectable(true);
                lVar.setOnClickListener(null);
                lVar.setStateListAnimator(null);
                if (lVar.d || lVar.f) {
                    return;
                }
                lVar.e = true;
                if (lVar.getLayout() == null || lVar.isLayoutRequested()) {
                    return;
                }
                lVar.c((lVar.getWidth() / 2.0f) - lVar.getPaddingLeft(), ((lVar.getHeight() / 2.0f) - lVar.getPaddingTop()) + lVar.getScrollY());
                return;
            default:
                w9.d0((w9) this.c, (m0) this.b, (TLRPC.User) this.e, (String) this.d, (TL_wallet.walletTransaction) obj, (String) obj2);
                return;
        }
    }

    public /* synthetic */ r(l0 l0Var, String str, String str2, String str3) {
        this.a = 5;
        this.b = l0Var;
        this.d = str;
        this.c = str2;
        this.e = str3;
    }

    public /* synthetic */ r(w9 w9Var, m0 m0Var, TLRPC.User user, String str) {
        this.a = 10;
        this.c = w9Var;
        this.b = m0Var;
        this.e = user;
        this.d = str;
    }
}
