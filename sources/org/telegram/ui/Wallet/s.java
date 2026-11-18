package org.telegram.ui.Wallet;

import android.text.SpannableString;
import android.text.TextUtils;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.q10;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.dz0;
import org.telegram.ui.Components.ez0;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.p51;
import org.telegram.ui.wt0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class s implements q10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ s(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX WARN: Removed duplicated region for block: B:201:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0439 A[Catch: all -> 0x035c, Exception -> 0x0360, TRY_LEAVE, TryCatch #9 {Exception -> 0x0360, blocks: (B:153:0x0364, B:154:0x0367, B:159:0x0358, B:162:0x0373, B:183:0x03ce, B:184:0x03d1, B:186:0x03e2, B:202:0x0425, B:203:0x0428, B:205:0x0439, B:215:0x0447), top: B:136:0x030c }] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:275:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x04dd A[Catch: all -> 0x04ff, TryCatch #21 {all -> 0x04ff, blocks: (B:260:0x04cf, B:263:0x04e1, B:277:0x04dd), top: B:259:0x04cf }] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x050d  */
    @Override // org.telegram.messenger.q10
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
        String str3;
        String str4;
        str = "NULL_ERROR";
        boolean z10 = false;
        switch (this.a) {
            case 0:
                u0 u0Var = (u0) this.b;
                j0 j0Var = (j0) this.c;
                String str5 = (String) this.d;
                Runnable runnable = (Runnable) this.e;
                TL_toncenter.apiResponse apiresponse = (TL_toncenter.apiResponse) obj;
                if (apiresponse != null) {
                    try {
                        j0Var.b = Long.parseLong(new JSONObject(apiresponse.response.data).getString("balance"));
                        if (u0Var.Q.get(str5) == j0Var) {
                            u0Var.v0(j0Var);
                            u0Var.T();
                        }
                    } catch (Exception e10) {
                        u0.o("failed to get balance of " + str5, e10);
                    }
                }
                runnable.run();
                return;
            case 1:
                ((u0) this.b).d0((r0) this.c, true, new s((x10) this.d, (x10) obj2, (byte[]) this.e, (TLRPC.InputCheckPasswordSRP) obj, 3));
                return;
            case 2:
                u0 u0Var2 = (u0) this.b;
                p51 p51Var = (p51) this.c;
                r0 r0Var = (r0) this.d;
                byte[] bArr5 = (byte[]) this.e;
                Vector vector = (Vector) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (vector == null) {
                    if (tL_error == null || (str3 = tL_error.text) == null) {
                        str3 = "NULL_ERROR";
                    }
                    u0.n("enable backup: didnt get backup holders: ".concat(str3));
                    if (tL_error != null && (str4 = tL_error.text) != null) {
                        str = str4;
                    }
                    p51Var.a(str);
                    return;
                }
                int size = vector.objects.size();
                if (size != 3) {
                    u0.n("enable backup: expected three backup holders");
                    p51Var.a("INVALID_BACKUP_HOLDERS_COUNT");
                    return;
                }
                byte[][] bArr6 = new byte[size][];
                try {
                    c10 = r0Var.c();
                } catch (Exception e11) {
                    e = e11;
                    str2 = "NULL_ERROR";
                    bArr = null;
                } catch (Throwable th2) {
                    th = th2;
                    bArr = null;
                }
                try {
                    bArr2 = u0.b0(c10);
                    try {
                        bArr3 = u0.p0(bArr2, new SecureRandom());
                        try {
                            try {
                                try {
                                    if (org.telegram.messenger.s2.a) {
                                        byte[] bArr7 = new byte[ks.s3];
                                        c11 = 1;
                                        try {
                                            int length = bArr3.length;
                                            int i10 = 0;
                                            while (i10 < length) {
                                                byte[] bArr8 = bArr3[i10];
                                                String str6 = str;
                                                int i11 = length;
                                                for (int i12 = 0; i12 < bArr8.length; i12++) {
                                                    try {
                                                        bArr7[i12] = (byte) (bArr7[i12] ^ bArr8[i12]);
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        Arrays.fill(bArr7, (byte) 0);
                                                        throw th;
                                                    }
                                                }
                                                i10++;
                                                length = i11;
                                                str = str6;
                                            }
                                            u0.P("enable backup: diagnostics sharesReconstructPaddedMnemonic=" + Arrays.equals(bArr2, bArr7));
                                            Arrays.fill(bArr7, (byte) 0);
                                        } catch (Throwable th4) {
                                            th = th4;
                                        }
                                    } else {
                                        c11 = 1;
                                    }
                                    int i13 = 0;
                                    while (i13 < size) {
                                        TL_wallet.holderDc holderdc = (TL_wallet.holderDc) vector.objects.get(i13);
                                        SerializedData serializedData2 = new SerializedData();
                                        try {
                                            TL_wallet.mnemonic_decryptedKeyPart mnemonic_decryptedkeypart = new TL_wallet.mnemonic_decryptedKeyPart();
                                            c12 = 2;
                                            try {
                                                mnemonic_decryptedkeypart.share = bArr3[i13];
                                                mnemonic_decryptedkeypart.serializeToStream(serializedData2);
                                                byte[] byteArray = serializedData2.toByteArray();
                                                byte[][] bArr9 = bArr6;
                                                try {
                                                    long key_generate_temporary_private_key = ConferenceCall.key_generate_temporary_private_key();
                                                    l11 = Long.valueOf(key_generate_temporary_private_key);
                                                    int i14 = i13;
                                                    try {
                                                        byte[] key_to_public_key = ConferenceCall.key_to_public_key(key_generate_temporary_private_key);
                                                        serializedData = serializedData2;
                                                        try {
                                                            long key_from_public_key = ConferenceCall.key_from_public_key(holderdc.public_key);
                                                            l12 = Long.valueOf(key_from_public_key);
                                                            try {
                                                                long key_from_ecdh = ConferenceCall.key_from_ecdh(key_generate_temporary_private_key, key_from_public_key);
                                                                Long valueOf = Long.valueOf(key_from_ecdh);
                                                                try {
                                                                    byte[] encrypt_message_for_one = ConferenceCall.encrypt_message_for_one(key_from_ecdh, byteArray);
                                                                    byte[] bArr10 = new byte[encrypt_message_for_one.length + 32];
                                                                    Vector vector2 = vector;
                                                                    System.arraycopy(key_to_public_key, 0, bArr10, 0, 32);
                                                                    System.arraycopy(encrypt_message_for_one, 0, bArr10, 32, encrypt_message_for_one.length);
                                                                    bArr9[i14] = bArr10;
                                                                    if (byteArray != null) {
                                                                        Arrays.fill(byteArray, (byte) 0);
                                                                    }
                                                                    serializedData.cleanup();
                                                                    Long[] lArr = new Long[3];
                                                                    lArr[0] = valueOf;
                                                                    lArr[c11] = l12;
                                                                    lArr[2] = l11;
                                                                    int i15 = 0;
                                                                    for (int i16 = 3; i15 < i16; i16 = 3) {
                                                                        Long l13 = lArr[i15];
                                                                        if (l13 != null) {
                                                                            try {
                                                                                ConferenceCall.key_destroy(l13.longValue());
                                                                            } catch (Exception unused) {
                                                                            }
                                                                        }
                                                                        i15++;
                                                                    }
                                                                    i13 = i14 + 1;
                                                                    bArr6 = bArr9;
                                                                    vector = vector2;
                                                                } catch (Throwable th5) {
                                                                    th = th5;
                                                                    bArr4 = byteArray;
                                                                    l10 = valueOf;
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
                                                            } catch (Throwable th6) {
                                                                th = th6;
                                                                bArr4 = byteArray;
                                                                l10 = null;
                                                            }
                                                        } catch (Throwable th7) {
                                                            th = th7;
                                                            bArr4 = byteArray;
                                                            l10 = null;
                                                            l12 = null;
                                                            if (bArr4 != null) {
                                                                Arrays.fill(bArr4, (byte) 0);
                                                            }
                                                            serializedData.cleanup();
                                                            Long[] lArr22 = new Long[3];
                                                            lArr22[0] = l10;
                                                            lArr22[c11] = l12;
                                                            lArr22[c12] = l11;
                                                            for (i7 = 0; i7 < 3; i7++) {
                                                                Long l14 = lArr22[i7];
                                                                if (l14 != null) {
                                                                    try {
                                                                        ConferenceCall.key_destroy(l14.longValue());
                                                                    } catch (Exception unused2) {
                                                                    }
                                                                }
                                                            }
                                                            throw th;
                                                        }
                                                    } catch (Throwable th8) {
                                                        th = th8;
                                                        serializedData = serializedData2;
                                                    }
                                                } catch (Throwable th9) {
                                                    th = th9;
                                                    serializedData = serializedData2;
                                                    bArr4 = byteArray;
                                                    l10 = null;
                                                    l11 = null;
                                                    l12 = null;
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
                                            } catch (Throwable th10) {
                                                th = th10;
                                                serializedData = serializedData2;
                                                bArr4 = null;
                                                l10 = null;
                                                l11 = null;
                                                l12 = null;
                                                if (bArr4 != null) {
                                                }
                                                serializedData.cleanup();
                                                Long[] lArr2222 = new Long[3];
                                                lArr2222[0] = l10;
                                                lArr2222[c11] = l12;
                                                lArr2222[c12] = l11;
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
                                    byte[][] bArr11 = bArr6;
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
                                            u0.n("part " + i18 + " is null");
                                            p51Var.a("PART_" + i18 + "_NULL");
                                            return;
                                        }
                                    }
                                    TL_wallet.enableBackup enablebackup = new TL_wallet.enableBackup();
                                    enablebackup.parts = new ArrayList<>(Arrays.asList(bArr11));
                                    enablebackup.new_public_key = bArr5;
                                    u0Var2.d0(r0Var, false, new j((Object) u0Var2, (Object) p51Var, (Object) enablebackup, 5));
                                    return;
                                } catch (Exception e12) {
                                    e = e12;
                                    bArr = c10;
                                    try {
                                        u0.o("enable backup", e);
                                        p51Var.a(e.getMessage() == null ? str2 : e.getMessage());
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
                                        }
                                        if (bArr2 != null) {
                                        }
                                        if (bArr3 != null) {
                                        }
                                        throw th;
                                    }
                                }
                            } catch (Exception e13) {
                                e = e13;
                                str2 = "NULL_ERROR";
                            }
                        } catch (Throwable th13) {
                            th = th13;
                            bArr = c10;
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
                    } catch (Exception e14) {
                        e = e14;
                        str2 = "NULL_ERROR";
                        bArr = c10;
                        bArr3 = null;
                        u0.o("enable backup", e);
                        p51Var.a(e.getMessage() == null ? str2 : e.getMessage());
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
                    u0.o("enable backup", e);
                    p51Var.a(e.getMessage() == null ? str2 : e.getMessage());
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
            case 3:
                x10 x10Var = (x10) this.b;
                x10 x10Var2 = (x10) this.c;
                byte[] bArr13 = (byte[]) this.d;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) this.e;
                WalletEngine2.ImportedWalletProof importedWalletProof = (WalletEngine2.ImportedWalletProof) obj;
                String str7 = (String) obj2;
                if (importedWalletProof == null) {
                    x10Var.a(str7 != null ? str7 : "NULL_ERROR");
                    x10Var2.a(null);
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
                x10Var2.a(replacewallet);
                return;
            case 4:
                i0 i0Var = (i0) this.b;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) this.c;
                String str8 = (String) this.d;
                q10 q10Var = (q10) this.e;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str9 = (String) obj2;
                if (wallettransaction != null) {
                    wallettransaction.nft = nftitem;
                    wallettransaction.comment = str8;
                    wallettransaction.date = ConnectionsManager.getInstance(i0Var.h.a).getCurrentTime();
                }
                if (i0Var.a) {
                    return;
                }
                q10Var.a(wallettransaction, str9);
                return;
            case 5:
                t0 t0Var = (t0) this.b;
                String str10 = (String) this.d;
                String str11 = (String) this.c;
                String str12 = (String) this.e;
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                t0Var.getClass();
                if (walletuseraddress == null || walletuseraddress.user_id == 0 || mp.u1(t0Var.m.a).c2(Long.valueOf(walletuseraddress.user_id)) == null) {
                    return;
                }
                ArrayList arrayList = t0Var.b;
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
                        z10 = true;
                    }
                }
                if (z10) {
                    t0Var.k();
                    t0Var.i();
                    return;
                }
                return;
            case 6:
                p51 p51Var2 = (p51) this.b;
                r0 r0Var2 = (r0) this.c;
                h2 h2Var = (h2) this.d;
                di.x2 x2Var = (di.x2) this.e;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (tonconnectchallenge == null || tL_error2 != null) {
                    p51Var2.a(l2.z(tL_error2, "registerKey"));
                    return;
                } else {
                    Utilities.e.c(new wt0(r0Var2, h2Var, tonconnectchallenge, p51Var2, x2Var, 9));
                    return;
                }
            case 7:
                l2 l2Var = (l2) this.b;
                h2 h2Var2 = (h2) this.c;
                r0 r0Var3 = (r0) this.d;
                x10 x10Var3 = (x10) this.e;
                TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj;
                String str13 = (String) obj2;
                if (sendtransfer != null && str13 == null && l2Var.A(h2Var2) && !l2Var.j(h2Var2)) {
                    Utilities.e.c(new wt0(l2Var, sendtransfer, h2Var2, x10Var3, r0Var3, 10));
                    return;
                }
                if (str13 == null) {
                    str13 = "Transfer unavailable or request expired";
                }
                l2Var.y(h2Var2, r0Var3, null, 0, str13, x10Var3);
                return;
            case 8:
                l2 l2Var2 = (l2) this.b;
                h2 h2Var3 = (h2) this.c;
                r0 r0Var4 = (r0) this.d;
                p51 p51Var3 = (p51) this.e;
                String str14 = (String) obj;
                String str15 = (String) obj2;
                if (str14 != null) {
                    try {
                        if (l2Var2.A(h2Var3) && !l2Var2.j(h2Var3)) {
                            l2Var2.y(h2Var3, r0Var4, new JSONObject().put("internalBoc", str14), -1, null, p51Var3);
                            return;
                        }
                    } catch (JSONException e16) {
                        l2Var2.y(h2Var3, r0Var4, null, 0, l2.i("sign message response", e16), p51Var3);
                        return;
                    }
                }
                str15 = "Request expired or wallet changed";
                l2Var2.y(h2Var3, r0Var4, null, 0, str15, p51Var3);
                return;
            case 9:
                boolean[] zArr = (boolean[]) this.b;
                e3[] e3VarArr = (e3[]) this.c;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.d;
                xh.l lVar = (xh.l) this.e;
                String str16 = (String) obj;
                String str17 = (String) obj2;
                zArr[0] = false;
                if (str17 != null) {
                    new lc(e3VarArr[0].F, i6Var).f0(str17, false);
                    return;
                }
                lVar.setPadding(org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(8.0f));
                SpannableString spannableString = new SpannableString(str16);
                dz0 dz0Var = new dz0();
                dz0Var.a |= 256;
                spannableString.setSpan(new ez0(dz0Var, 0), 0, spannableString.length(), 33);
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
                na.d0((na) this.c, (u0) this.b, (TLRPC.User) this.e, (String) this.d, (TL_wallet.walletTransaction) obj, (String) obj2);
                return;
        }
    }

    public /* synthetic */ s(t0 t0Var, String str, String str2, String str3) {
        this.a = 5;
        this.b = t0Var;
        this.d = str;
        this.c = str2;
        this.e = str3;
    }

    public /* synthetic */ s(na naVar, u0 u0Var, TLRPC.User user, String str) {
        this.a = 10;
        this.c = naVar;
        this.b = u0Var;
        this.e = user;
        this.d = str;
    }
}
