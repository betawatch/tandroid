package org.telegram.ui.Wallet;

import android.text.SpannableString;
import android.text.TextUtils;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.s10;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.cu0;
import org.telegram.ui.x21;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final /* synthetic */ class q implements s10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ q(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX WARN: Removed duplicated region for block: B:203:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x045d A[Catch: all -> 0x0380, Exception -> 0x0384, TRY_LEAVE, TryCatch #1 {all -> 0x0380, blocks: (B:137:0x032e, B:140:0x0332, B:155:0x0388, B:156:0x038b, B:161:0x037c, B:164:0x0397, B:185:0x03f2, B:186:0x03f5, B:188:0x0406, B:191:0x040a, B:204:0x0449, B:205:0x044c, B:207:0x045d, B:210:0x0461, B:217:0x046b), top: B:136:0x032e }] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:277:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0501 A[Catch: all -> 0x0523, TryCatch #5 {all -> 0x0523, blocks: (B:262:0x04f3, B:265:0x0505, B:279:0x0501), top: B:261:0x04f3 }] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0531  */
    @Override // org.telegram.messenger.s10
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
        TL_wallet.mnemonic_decryptedKeyPart mnemonic_decryptedkeypart;
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
                l0 l0Var = (l0) this.b;
                c0 c0Var = (c0) this.c;
                String str5 = (String) this.d;
                Runnable runnable = (Runnable) this.e;
                TL_toncenter.apiResponse apiresponse = (TL_toncenter.apiResponse) obj;
                if (apiresponse != null) {
                    try {
                        c0Var.b = Long.parseLong(new JSONObject(apiresponse.response.data).getString("balance"));
                        if (l0Var.N.get(str5) == c0Var) {
                            l0Var.k0(c0Var);
                            l0Var.L();
                        }
                    } catch (Exception e10) {
                        l0.k("failed to get balance of " + str5, e10);
                    }
                }
                runnable.run();
                return;
            case 1:
                l0 l0Var2 = (l0) this.b;
                x21 x21Var = (x21) this.c;
                i0 i0Var = (i0) this.d;
                byte[] bArr6 = (byte[]) this.e;
                Vector vector = (Vector) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (vector == null) {
                    if (tL_error == null || (str3 = tL_error.text) == null) {
                        str3 = "NULL_ERROR";
                    }
                    l0.j("enable backup: didnt get backup holders: ".concat(str3));
                    if (tL_error != null && (str4 = tL_error.text) != null) {
                        str = str4;
                    }
                    x21Var.a(str);
                    return;
                }
                int size = vector.objects.size();
                if (size != 3) {
                    l0.j("enable backup: expected three backup holders");
                    x21Var.a("INVALID_BACKUP_HOLDERS_COUNT");
                    return;
                }
                byte[][] bArr7 = new byte[size][];
                try {
                    c10 = i0Var.c();
                    try {
                        bArr2 = l0.T(c10);
                    } catch (Exception e11) {
                        e = e11;
                        str2 = "NULL_ERROR";
                        bArr = c10;
                        bArr2 = null;
                        bArr3 = null;
                        try {
                            l0.k("enable backup", e);
                            x21Var.a(e.getMessage() == null ? str2 : e.getMessage());
                            byte b10 = 0;
                            if (bArr != null) {
                            }
                            if (bArr2 != null) {
                            }
                            if (bArr3 != null) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (bArr != null) {
                            }
                            if (bArr2 != null) {
                            }
                            if (bArr3 != null) {
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
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
                } catch (Exception e12) {
                    e = e12;
                    str2 = "NULL_ERROR";
                    bArr = null;
                } catch (Throwable th4) {
                    th = th4;
                    bArr = null;
                }
                try {
                    bArr3 = l0.e0(bArr2, new SecureRandom());
                    try {
                        try {
                        } catch (Throwable th5) {
                            th = th5;
                            bArr = c10;
                            if (bArr != null) {
                                Arrays.fill(bArr, (byte) 0);
                            }
                            if (bArr2 != null) {
                                Arrays.fill(bArr2, (byte) 0);
                            }
                            if (bArr3 != null) {
                                for (byte[] bArr8 : bArr3) {
                                    Arrays.fill(bArr8, (byte) 0);
                                }
                            }
                            throw th;
                        }
                    } catch (Exception e13) {
                        e = e13;
                        str2 = "NULL_ERROR";
                    }
                    try {
                        if (org.telegram.messenger.r2.a) {
                            byte[] bArr9 = new byte[ns.s3];
                            c11 = 1;
                            try {
                                int length = bArr3.length;
                                int i11 = 0;
                                while (i11 < length) {
                                    byte[] bArr10 = bArr3[i11];
                                    String str6 = str;
                                    int i12 = length;
                                    for (int i13 = 0; i13 < bArr10.length; i13++) {
                                        try {
                                            bArr9[i13] = (byte) (bArr9[i13] ^ bArr10[i13]);
                                        } catch (Throwable th6) {
                                            th = th6;
                                            Arrays.fill(bArr9, (byte) 0);
                                            throw th;
                                        }
                                    }
                                    i11++;
                                    length = i12;
                                    str = str6;
                                }
                                l0.H("enable backup: diagnostics sharesReconstructPaddedMnemonic=" + Arrays.equals(bArr2, bArr9));
                                Arrays.fill(bArr9, (byte) 0);
                            } catch (Throwable th7) {
                                th = th7;
                            }
                        } else {
                            c11 = 1;
                        }
                        int i14 = 0;
                        while (i14 < size) {
                            TL_wallet.holderDc holderdc = (TL_wallet.holderDc) vector.objects.get(i14);
                            SerializedData serializedData2 = new SerializedData();
                            try {
                                mnemonic_decryptedkeypart = new TL_wallet.mnemonic_decryptedKeyPart();
                                c12 = 2;
                            } catch (Throwable th8) {
                                th = th8;
                                serializedData = serializedData2;
                                c12 = 2;
                            }
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
                                            } catch (Throwable th9) {
                                                th = th9;
                                                bArr4 = byteArray;
                                                l10 = null;
                                            }
                                        } catch (Throwable th10) {
                                            th = th10;
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
                                    } catch (Throwable th11) {
                                        th = th11;
                                        serializedData = serializedData2;
                                    }
                                } catch (Throwable th12) {
                                    th = th12;
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
                            } catch (Throwable th13) {
                                th = th13;
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
                                byte[] bArr11 = new byte[encrypt_message_for_one.length + 32];
                                Vector vector2 = vector;
                                System.arraycopy(key_to_public_key, 0, bArr11, 0, 32);
                                System.arraycopy(encrypt_message_for_one, 0, bArr11, 32, encrypt_message_for_one.length);
                                bArr5[i10] = bArr11;
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
                            } catch (Throwable th14) {
                                th = th14;
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
                        }
                        byte[][] bArr12 = bArr7;
                        byte b11 = 0;
                        Arrays.fill(c10, (byte) 0);
                        Arrays.fill(bArr2, (byte) 0);
                        int length2 = bArr3.length;
                        int i17 = 0;
                        while (i17 < length2) {
                            Arrays.fill(bArr3[i17], b11);
                            i17++;
                            b11 = 0;
                        }
                        for (int i18 = 0; i18 < size; i18++) {
                            if (bArr12[i18] == null) {
                                l0.j("part " + i18 + " is null");
                                x21Var.a("PART_" + i18 + "_NULL");
                                return;
                            }
                        }
                        TL_wallet.enableBackup enablebackup = new TL_wallet.enableBackup();
                        enablebackup.parts = new ArrayList<>(Arrays.asList(bArr12));
                        enablebackup.new_public_key = bArr6;
                        l0Var2.U(i0Var, false, new j((Object) l0Var2, (Object) x21Var, (Object) enablebackup, 7));
                        return;
                    } catch (Exception e14) {
                        e = e14;
                        bArr = c10;
                        l0.k("enable backup", e);
                        x21Var.a(e.getMessage() == null ? str2 : e.getMessage());
                        byte b102 = 0;
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
                                Arrays.fill(bArr3[i19], b102);
                                i19++;
                                b102 = 0;
                            }
                            return;
                        }
                        return;
                    }
                } catch (Exception e15) {
                    e = e15;
                    str2 = "NULL_ERROR";
                    bArr = c10;
                    bArr3 = null;
                    l0.k("enable backup", e);
                    x21Var.a(e.getMessage() == null ? str2 : e.getMessage());
                    byte b1022 = 0;
                    if (bArr != null) {
                    }
                    if (bArr2 != null) {
                    }
                    if (bArr3 != null) {
                    }
                } catch (Throwable th15) {
                    th = th15;
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
                break;
            case 2:
                ((l0) this.b).U((i0) this.c, true, new q((z10) this.d, (z10) obj2, (byte[]) this.e, (TLRPC.InputCheckPasswordSRP) obj, 3));
                return;
            case 3:
                z10 z10Var = (z10) this.b;
                z10 z10Var2 = (z10) this.c;
                byte[] bArr13 = (byte[]) this.d;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) this.e;
                WalletEngine2.ImportedWalletProof importedWalletProof = (WalletEngine2.ImportedWalletProof) obj;
                String str7 = (String) obj2;
                if (importedWalletProof == null) {
                    z10Var.a(str7 != null ? str7 : "NULL_ERROR");
                    z10Var2.a(null);
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
                z10Var2.a(replacewallet);
                return;
            case 4:
                b0 b0Var = (b0) this.b;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) this.c;
                String str8 = (String) this.d;
                s10 s10Var = (s10) this.e;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str9 = (String) obj2;
                if (wallettransaction != null) {
                    wallettransaction.nft = nftitem;
                    wallettransaction.comment = str8;
                    wallettransaction.date = ConnectionsManager.getInstance(b0Var.h.a).getCurrentTime();
                }
                if (b0Var.a) {
                    return;
                }
                s10Var.a(wallettransaction, str9);
                return;
            case 5:
                k0 k0Var = (k0) this.b;
                String str10 = (String) this.d;
                String str11 = (String) this.c;
                String str12 = (String) this.e;
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                k0Var.getClass();
                if (walletuseraddress == null || walletuseraddress.user_id == 0 || np.s1(k0Var.l.a).a2(Long.valueOf(walletuseraddress.user_id)) == null) {
                    return;
                }
                ArrayList arrayList = k0Var.b;
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
                    k0Var.k();
                    k0Var.i();
                    return;
                }
                return;
            case 6:
                x21 x21Var2 = (x21) this.b;
                i0 i0Var2 = (i0) this.c;
                z1 z1Var = (z1) this.d;
                di.t2 t2Var = (di.t2) this.e;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (tonconnectchallenge == null || tL_error2 != null) {
                    x21Var2.a(d2.z(tL_error2, "registerKey"));
                    return;
                } else {
                    Utilities.e.c(new cu0(i0Var2, z1Var, tonconnectchallenge, x21Var2, t2Var, 8));
                    return;
                }
            case 7:
                d2 d2Var = (d2) this.b;
                z1 z1Var2 = (z1) this.c;
                i0 i0Var3 = (i0) this.d;
                z10 z10Var3 = (z10) this.e;
                TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj;
                String str13 = (String) obj2;
                if (sendtransfer != null && str13 == null && d2Var.A(z1Var2) && !d2Var.j(z1Var2)) {
                    Utilities.e.c(new cu0(d2Var, sendtransfer, z1Var2, z10Var3, i0Var3, 9));
                    return;
                }
                if (str13 == null) {
                    str13 = "Transfer unavailable or request expired";
                }
                d2Var.y(z1Var2, i0Var3, null, 0, str13, z10Var3);
                return;
            case 8:
                d2 d2Var2 = (d2) this.b;
                z1 z1Var3 = (z1) this.c;
                i0 i0Var4 = (i0) this.d;
                x21 x21Var3 = (x21) this.e;
                String str14 = (String) obj;
                String str15 = (String) obj2;
                if (str14 != null) {
                    try {
                        if (d2Var2.A(z1Var3) && !d2Var2.j(z1Var3)) {
                            d2Var2.y(z1Var3, i0Var4, new JSONObject().put("internalBoc", str14), -1, null, x21Var3);
                            return;
                        }
                    } catch (JSONException e16) {
                        d2Var2.y(z1Var3, i0Var4, null, 0, d2.i("sign message response", e16), x21Var3);
                        return;
                    }
                }
                str15 = "Request expired or wallet changed";
                d2Var2.y(z1Var3, i0Var4, null, 0, str15, x21Var3);
                return;
            case 9:
                boolean[] zArr = (boolean[]) this.b;
                x2[] x2VarArr = (x2[]) this.c;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.d;
                xh.l lVar = (xh.l) this.e;
                String str16 = (String) obj;
                String str17 = (String) obj2;
                zArr[0] = false;
                if (str17 != null) {
                    new cc(x2VarArr[0].F, e6Var).e0(str17, false);
                    return;
                }
                lVar.setPadding(org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(8.0f));
                SpannableString spannableString = new SpannableString(str16);
                wy0 wy0Var = new wy0();
                wy0Var.a |= 256;
                spannableString.setSpan(new xy0(wy0Var, 0), 0, spannableString.length(), 33);
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
                z9.d0((z9) this.c, (l0) this.b, (TLRPC.User) this.e, (String) this.d, (TL_wallet.walletTransaction) obj, (String) obj2);
                return;
        }
    }

    public /* synthetic */ q(k0 k0Var, String str, String str2, String str3) {
        this.a = 5;
        this.b = k0Var;
        this.d = str;
        this.c = str2;
        this.e = str3;
    }

    public /* synthetic */ q(z9 z9Var, l0 l0Var, TLRPC.User user, String str) {
        this.a = 10;
        this.c = z9Var;
        this.b = l0Var;
        this.e = user;
        this.d = str;
    }
}
