package org.telegram.ui.Wallet;

import android.text.SpannableString;
import android.text.TextUtils;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.n10;
import org.telegram.messenger.u10;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.ty0;
import org.telegram.ui.Components.uy0;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.e51;
import org.telegram.ui.xt0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements n10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ q(Object obj, Object obj2, Object obj3, Object obj4, int i3) {
        this.a = i3;
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
    @Override // org.telegram.messenger.n10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        String str;
        byte[] bArr;
        String str2;
        byte[] bArr2;
        byte[][] bArr3;
        byte[] c2;
        char c10;
        SerializedData serializedData;
        char c11;
        byte[] bArr4;
        Long l10;
        Long l11;
        Long l12;
        int i3;
        byte[] byteArray;
        byte[][] bArr5;
        int i10;
        byte[] key_to_public_key;
        long key_from_ecdh;
        Long valueOf;
        String str3;
        String str4;
        str = "NULL_ERROR";
        boolean z10 = false;
        switch (this.a) {
            case 0:
                k0 k0Var = (k0) this.b;
                b0 b0Var = (b0) this.c;
                String str5 = (String) this.d;
                Runnable runnable = (Runnable) this.e;
                TL_toncenter.apiResponse apiresponse = (TL_toncenter.apiResponse) obj;
                if (apiresponse != null) {
                    try {
                        b0Var.b = Long.parseLong(new JSONObject(apiresponse.response.data).getString("balance"));
                        if (k0Var.N.get(str5) == b0Var) {
                            k0Var.k0(b0Var);
                            k0Var.L();
                        }
                    } catch (Exception e10) {
                        k0.k("failed to get balance of " + str5, e10);
                    }
                }
                runnable.run();
                return;
            case 1:
                k0 k0Var2 = (k0) this.b;
                e51 e51Var = (e51) this.c;
                h0 h0Var = (h0) this.d;
                byte[] bArr6 = (byte[]) this.e;
                Vector vector = (Vector) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (vector == null) {
                    if (tL_error == null || (str3 = tL_error.text) == null) {
                        str3 = "NULL_ERROR";
                    }
                    k0.j("enable backup: didnt get backup holders: ".concat(str3));
                    if (tL_error != null && (str4 = tL_error.text) != null) {
                        str = str4;
                    }
                    e51Var.a(str);
                    return;
                }
                int size = vector.objects.size();
                if (size != 3) {
                    k0.j("enable backup: expected three backup holders");
                    e51Var.a("INVALID_BACKUP_HOLDERS_COUNT");
                    return;
                }
                byte[][] bArr7 = new byte[size][];
                try {
                    c2 = h0Var.c();
                } catch (Exception e11) {
                    e = e11;
                    str2 = "NULL_ERROR";
                    bArr = null;
                } catch (Throwable th2) {
                    th = th2;
                    bArr = null;
                }
                try {
                    bArr2 = k0.T(c2);
                    try {
                        bArr3 = k0.e0(bArr2, new SecureRandom());
                        try {
                            try {
                            } catch (Exception e12) {
                                e = e12;
                                str2 = "NULL_ERROR";
                            }
                            try {
                                if (org.telegram.messenger.r2.a) {
                                    byte[] bArr8 = new byte[hs.s3];
                                    c10 = 1;
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
                                        k0.H("enable backup: diagnostics sharesReconstructPaddedMnemonic=" + Arrays.equals(bArr2, bArr8));
                                        Arrays.fill(bArr8, (byte) 0);
                                    } catch (Throwable th4) {
                                        th = th4;
                                    }
                                } else {
                                    c10 = 1;
                                }
                                int i14 = 0;
                                while (i14 < size) {
                                    TL_wallet.holderDc holderdc = (TL_wallet.holderDc) vector.objects.get(i14);
                                    SerializedData serializedData2 = new SerializedData();
                                    try {
                                        TL_wallet.mnemonic_decryptedKeyPart mnemonic_decryptedkeypart = new TL_wallet.mnemonic_decryptedKeyPart();
                                        c11 = 2;
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
                                                        lArr[c10] = l12;
                                                        lArr[c11] = l11;
                                                        for (i3 = 0; i3 < 3; i3++) {
                                                            Long l13 = lArr[i3];
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
                                                lArr2[c10] = l12;
                                                lArr2[c11] = l11;
                                                while (i3 < 3) {
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
                                            lArr22[c10] = l12;
                                            lArr22[c11] = l11;
                                            while (i3 < 3) {
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
                                            lArr3[c10] = l12;
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
                                            lArr222[c10] = l12;
                                            lArr222[c11] = l11;
                                            while (i3 < 3) {
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th11) {
                                        th = th11;
                                        serializedData = serializedData2;
                                        c11 = 2;
                                    }
                                }
                                byte[][] bArr11 = bArr7;
                                byte b10 = 0;
                                Arrays.fill(c2, (byte) 0);
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
                                        k0.j("part " + i18 + " is null");
                                        e51Var.a("PART_" + i18 + "_NULL");
                                        return;
                                    }
                                }
                                TL_wallet.enableBackup enablebackup = new TL_wallet.enableBackup();
                                enablebackup.parts = new ArrayList<>(Arrays.asList(bArr11));
                                enablebackup.new_public_key = bArr6;
                                k0Var2.U(h0Var, false, new j((Object) k0Var2, (Object) e51Var, (Object) enablebackup, 7));
                                return;
                            } catch (Exception e13) {
                                e = e13;
                                bArr = c2;
                                try {
                                    k0.k("enable backup", e);
                                    e51Var.a(e.getMessage() == null ? str2 : e.getMessage());
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
                            bArr = c2;
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
                        bArr = c2;
                        bArr3 = null;
                        k0.k("enable backup", e);
                        e51Var.a(e.getMessage() == null ? str2 : e.getMessage());
                        byte b112 = 0;
                        if (bArr != null) {
                        }
                        if (bArr2 != null) {
                        }
                        if (bArr3 != null) {
                        }
                    } catch (Throwable th14) {
                        th = th14;
                        bArr = c2;
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
                    bArr = c2;
                    bArr2 = null;
                    bArr3 = null;
                    k0.k("enable backup", e);
                    e51Var.a(e.getMessage() == null ? str2 : e.getMessage());
                    byte b1122 = 0;
                    if (bArr != null) {
                    }
                    if (bArr2 != null) {
                    }
                    if (bArr3 != null) {
                    }
                } catch (Throwable th15) {
                    th = th15;
                    bArr = c2;
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
                ((k0) this.b).U((h0) this.c, true, new q((u10) this.d, (u10) obj2, (byte[]) this.e, (TLRPC.InputCheckPasswordSRP) obj, 3));
                return;
            case 3:
                u10 u10Var = (u10) this.b;
                u10 u10Var2 = (u10) this.c;
                byte[] bArr13 = (byte[]) this.d;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) this.e;
                WalletEngine2.ImportedWalletProof importedWalletProof = (WalletEngine2.ImportedWalletProof) obj;
                String str7 = (String) obj2;
                if (importedWalletProof == null) {
                    u10Var.a(str7 != null ? str7 : "NULL_ERROR");
                    u10Var2.a(null);
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
                u10Var2.a(replacewallet);
                return;
            case 4:
                a0 a0Var = (a0) this.b;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) this.c;
                String str8 = (String) this.d;
                n10 n10Var = (n10) this.e;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str9 = (String) obj2;
                if (wallettransaction != null) {
                    wallettransaction.nft = nftitem;
                    wallettransaction.comment = str8;
                    wallettransaction.date = ConnectionsManager.getInstance(a0Var.h.a).getCurrentTime();
                }
                if (a0Var.a) {
                    return;
                }
                n10Var.a(wallettransaction, str9);
                return;
            case 5:
                j0 j0Var = (j0) this.b;
                String str10 = (String) this.d;
                String str11 = (String) this.c;
                String str12 = (String) this.e;
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                j0Var.getClass();
                if (walletuseraddress == null || walletuseraddress.user_id == 0 || hp.s1(j0Var.l.a).a2(Long.valueOf(walletuseraddress.user_id)) == null) {
                    return;
                }
                ArrayList arrayList = j0Var.b;
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
                    j0Var.k();
                    j0Var.i();
                    return;
                }
                return;
            case 6:
                e51 e51Var2 = (e51) this.b;
                h0 h0Var2 = (h0) this.c;
                y1 y1Var = (y1) this.d;
                ci.a3 a3Var = (ci.a3) this.e;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (tonconnectchallenge == null || tL_error2 != null) {
                    e51Var2.a(c2.z(tL_error2, "registerKey"));
                    return;
                } else {
                    Utilities.e.c(new xt0(h0Var2, y1Var, tonconnectchallenge, e51Var2, a3Var, 6));
                    return;
                }
            case 7:
                c2 c2Var = (c2) this.b;
                y1 y1Var2 = (y1) this.c;
                h0 h0Var3 = (h0) this.d;
                u10 u10Var3 = (u10) this.e;
                TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj;
                String str13 = (String) obj2;
                if (sendtransfer != null && str13 == null && c2Var.A(y1Var2) && !c2Var.j(y1Var2)) {
                    Utilities.e.c(new xt0(c2Var, sendtransfer, y1Var2, u10Var3, h0Var3, 7));
                    return;
                }
                if (str13 == null) {
                    str13 = "Transfer unavailable or request expired";
                }
                c2Var.y(y1Var2, h0Var3, null, 0, str13, u10Var3);
                return;
            case 8:
                c2 c2Var2 = (c2) this.b;
                y1 y1Var3 = (y1) this.c;
                h0 h0Var4 = (h0) this.d;
                e51 e51Var3 = (e51) this.e;
                String str14 = (String) obj;
                String str15 = (String) obj2;
                if (str14 != null) {
                    try {
                        if (c2Var2.A(y1Var3) && !c2Var2.j(y1Var3)) {
                            c2Var2.y(y1Var3, h0Var4, new JSONObject().put("internalBoc", str14), -1, null, e51Var3);
                            return;
                        }
                    } catch (JSONException e16) {
                        c2Var2.y(y1Var3, h0Var4, null, 0, c2.i("sign message response", e16), e51Var3);
                        return;
                    }
                }
                str15 = "Request expired or wallet changed";
                c2Var2.y(y1Var3, h0Var4, null, 0, str15, e51Var3);
                return;
            case 9:
                boolean[] zArr = (boolean[]) this.b;
                y2[] y2VarArr = (y2[]) this.c;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.d;
                yh.l lVar = (yh.l) this.e;
                String str16 = (String) obj;
                String str17 = (String) obj2;
                zArr[0] = false;
                if (str17 != null) {
                    new fc(y2VarArr[0].F, e6Var).e0(str17, false);
                    return;
                }
                lVar.setPadding(org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(8.0f));
                SpannableString spannableString = new SpannableString(str16);
                ty0 ty0Var = new ty0();
                ty0Var.a |= 256;
                spannableString.setSpan(new uy0(ty0Var, 0), 0, spannableString.length(), 33);
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
                w9.d0((w9) this.c, (k0) this.b, (TLRPC.User) this.e, (String) this.d, (TL_wallet.walletTransaction) obj, (String) obj2);
                return;
        }
    }

    public /* synthetic */ q(j0 j0Var, String str, String str2, String str3) {
        this.a = 5;
        this.b = j0Var;
        this.d = str;
        this.c = str2;
        this.e = str3;
    }

    public /* synthetic */ q(w9 w9Var, k0 k0Var, TLRPC.User user, String str) {
        this.a = 10;
        this.c = w9Var;
        this.b = k0Var;
        this.e = user;
        this.d = str;
    }
}
