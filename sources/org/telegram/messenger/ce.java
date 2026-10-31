package org.telegram.messenger;

import android.app.Activity;
import android.app.DownloadManager;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.widget.TextView;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import org.json.JSONObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.fu0;
import org.telegram.ui.ll0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class ce implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ ce(int i10, File file, String str, org.telegram.ui.ActionBar.x1 x1Var, boolean[] zArr, String str2, q20 q20Var, boolean[] zArr2) {
        this.c = i10;
        this.f = file;
        this.d = str;
        this.b = x1Var;
        this.h = zArr;
        this.e = str2;
        this.r = q20Var;
        this.n = zArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[Catch: all -> 0x03b5, SYNTHETIC, TRY_LEAVE, TryCatch #16 {all -> 0x03b5, blocks: (B:128:0x03d3, B:127:0x03d0, B:178:0x03ab, B:123:0x03cb), top: B:100:0x02dd, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03a4 A[Catch: all -> 0x03a8, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x03a8, blocks: (B:172:0x03c2, B:171:0x03bf, B:177:0x03a4, B:167:0x03ba), top: B:102:0x02e1, inners: #21 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03ec A[Catch: Exception -> 0x0298, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x0298, blocks: (B:95:0x02ce, B:183:0x03ec, B:237:0x0266, B:243:0x0275, B:244:0x02b5, B:248:0x029e), top: B:236:0x0266 }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0434 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0, types: [org.telegram.messenger.ce] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean[]] */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r27v10 */
    /* JADX WARN: Type inference failed for: r27v12 */
    /* JADX WARN: Type inference failed for: r27v13 */
    /* JADX WARN: Type inference failed for: r27v15 */
    /* JADX WARN: Type inference failed for: r27v9 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        File file;
        String str;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean[] zArr;
        Uri fromFile;
        FileInputStream fileInputStream;
        int i15;
        Throwable th2;
        ?? r27;
        Throwable th3;
        long j10;
        int i16;
        JSONObject jSONObject;
        byte[] bArr;
        org.telegram.ui.Wallet.l i17;
        ?? r12 = this;
        int i18 = -1;
        int i19 = 0;
        String str2 = null;
        int i20 = 1;
        boolean z11 = false;
        z11 = false;
        switch (r12.a) {
            case 0:
                int i21 = r12.c;
                File file2 = (File) r12.f;
                String str3 = (String) r12.d;
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) r12.b;
                boolean[] zArr2 = (boolean[]) r12.h;
                String str4 = (String) r12.e;
                q20 q20Var = (q20) r12.r;
                boolean[] zArr3 = (boolean[]) r12.n;
                String[] strArr = MediaController.U1;
                try {
                    try {
                        try {
                            if (Build.VERSION.SDK_INT >= 29) {
                                fromFile = MediaController.f0(i21, file2, null);
                                i14 = fromFile != null ? 1 : 0;
                                i16 = 0;
                                r12 = zArr3;
                                i19 = 2;
                            } else {
                                if (i21 == 0) {
                                    File file3 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "Telegram");
                                    file3.mkdirs();
                                    file = new File(file3, i0.p0(0, b8.D(file2)));
                                } else if (i21 == 1) {
                                    File file4 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES), "Telegram");
                                    file4.mkdirs();
                                    file = new File(file4, i0.p0(1, b8.D(file2)));
                                } else {
                                    try {
                                        File file5 = new File(i21 == 2 ? Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS) : Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC), "Telegram");
                                        file5.mkdirs();
                                        File file6 = new File(file5, str3);
                                        if (file6.exists()) {
                                            try {
                                                int lastIndexOf = str3.lastIndexOf(46);
                                                int i22 = 0;
                                                while (i22 < 10) {
                                                    if (lastIndexOf != i18) {
                                                        str = str3.substring(0, lastIndexOf) + "(" + (i22 + 1) + ")" + str3.substring(lastIndexOf);
                                                    } else {
                                                        str = str3 + "(" + (i22 + 1) + ")";
                                                    }
                                                    file6 = new File(file5, str);
                                                    if (file6.exists()) {
                                                        i22++;
                                                        i18 = -1;
                                                    }
                                                }
                                            } catch (Exception e) {
                                                e = e;
                                                r12 = zArr3;
                                                z10 = true;
                                                i19 = 2;
                                                f8.g(e, z10);
                                                if (x1Var == null) {
                                                }
                                            }
                                        }
                                        file = file6;
                                    } catch (Exception e7) {
                                        e = e7;
                                        r12 = zArr3;
                                        i19 = 2;
                                        z10 = true;
                                        r12 = r12;
                                        f8.g(e, z10);
                                        if (x1Var == null) {
                                        }
                                    }
                                }
                                if (!file.exists()) {
                                    file.createNewFile();
                                }
                                long currentTimeMillis = System.currentTimeMillis() - 500;
                                try {
                                    try {
                                        fileInputStream = new FileInputStream(file2);
                                    } catch (Exception e10) {
                                        e = e10;
                                        f8.g(e, true);
                                        i12 = i10;
                                        i13 = i10;
                                        if (zArr2[i13]) {
                                        }
                                        if (i14 == 0) {
                                        }
                                        fromFile = Uri.fromFile(file);
                                        r12 = zArr;
                                        i16 = i13;
                                        if (i14 != 0) {
                                            i0.g3(new ge(q20Var, fromFile, i16));
                                        }
                                        if (x1Var == null) {
                                        }
                                    }
                                } catch (Exception e11) {
                                    e = e11;
                                    i10 = 0;
                                    i11 = i21;
                                    f8.g(e, true);
                                    i12 = i10;
                                    i13 = i10;
                                    if (zArr2[i13]) {
                                    }
                                    if (i14 == 0) {
                                    }
                                    fromFile = Uri.fromFile(file);
                                    r12 = zArr;
                                    i16 = i13;
                                    if (i14 != 0) {
                                    }
                                    if (x1Var == null) {
                                    }
                                }
                                try {
                                    try {
                                        FileChannel channel = fileInputStream.getChannel();
                                        try {
                                            try {
                                                FileChannel channel2 = new FileOutputStream(file).getChannel();
                                                try {
                                                    long size = channel.size();
                                                    try {
                                                        if (i0.I1(null, ((Integer) FileDescriptor.class.getDeclaredMethod("getInt$", null).invoke(fileInputStream.getFD(), null)).intValue())) {
                                                            if (x1Var != null) {
                                                                i0.g3(new a(x1Var, 14));
                                                            }
                                                            if (channel2 != null) {
                                                                try {
                                                                    channel2.close();
                                                                } catch (Throwable th4) {
                                                                    th3 = th4;
                                                                    i15 = 0;
                                                                    i11 = i21;
                                                                    if (channel == null) {
                                                                        throw th3;
                                                                    }
                                                                    try {
                                                                        channel.close();
                                                                        throw th3;
                                                                    } catch (Throwable th5) {
                                                                        th3.addSuppressed(th5);
                                                                        throw th3;
                                                                    }
                                                                }
                                                            }
                                                            try {
                                                                channel.close();
                                                                fileInputStream.close();
                                                                return;
                                                            } catch (Throwable th6) {
                                                                th2 = th6;
                                                                i10 = 0;
                                                                i11 = i21;
                                                                try {
                                                                    fileInputStream.close();
                                                                    throw th2;
                                                                } catch (Throwable th7) {
                                                                    th2.addSuppressed(th7);
                                                                    throw th2;
                                                                }
                                                            }
                                                        }
                                                    } catch (Throwable th8) {
                                                        f8.g(th8, true);
                                                    }
                                                    long j11 = 0;
                                                    while (j11 < size) {
                                                        if (zArr2[z11 ? 1 : 0]) {
                                                            i13 = z11 ? 1 : 0;
                                                            i11 = i21;
                                                            if (channel2 != null) {
                                                                channel2.close();
                                                            }
                                                            channel.close();
                                                            fileInputStream.close();
                                                            i12 = 1;
                                                            if (zArr2[i13]) {
                                                                i14 = i12;
                                                            } else {
                                                                file.delete();
                                                                i14 = i13;
                                                            }
                                                            if (i14 == 0) {
                                                                i19 = 2;
                                                                i19 = 2;
                                                                i19 = 2;
                                                                if (i11 == 2) {
                                                                    try {
                                                                        zArr = zArr3;
                                                                        ((DownloadManager) w0.b.getSystemService("download")).addCompletedDownload(file.getName(), file.getName(), false, str4, file.getAbsolutePath(), file.length(), true);
                                                                    } catch (Exception e12) {
                                                                        e = e12;
                                                                        r12 = zArr3;
                                                                        z10 = true;
                                                                        r12 = r12;
                                                                        f8.g(e, z10);
                                                                        if (x1Var == null) {
                                                                        }
                                                                    }
                                                                } else {
                                                                    zArr = zArr3;
                                                                    i0.d(file.getAbsoluteFile());
                                                                }
                                                            } else {
                                                                zArr = zArr3;
                                                                i19 = 2;
                                                            }
                                                            fromFile = Uri.fromFile(file);
                                                            r12 = zArr;
                                                            i16 = i13;
                                                        } else {
                                                            long j12 = size - j11;
                                                            r27 = z11 ? 1 : 0;
                                                            i11 = i21;
                                                            try {
                                                                channel2.transferFrom(channel, j11, Math.min(4096L, j12));
                                                                long j13 = j11;
                                                                if (x1Var == null || currentTimeMillis > System.currentTimeMillis() - 500) {
                                                                    j10 = 4096;
                                                                } else {
                                                                    long currentTimeMillis2 = System.currentTimeMillis();
                                                                    j10 = 4096;
                                                                    i0.g3(new a1(x1Var, (int) ((j13 / size) * 100.0f), 3));
                                                                    currentTimeMillis = currentTimeMillis2;
                                                                }
                                                                j11 = j13 + j10;
                                                                i21 = i11;
                                                                z11 = r27;
                                                            } catch (Throwable th9) {
                                                                th = th9;
                                                                Throwable th10 = th;
                                                                if (channel2 == null) {
                                                                    throw th10;
                                                                }
                                                                try {
                                                                    channel2.close();
                                                                    throw th10;
                                                                } catch (Throwable th11) {
                                                                    th10.addSuppressed(th11);
                                                                    throw th10;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    i13 = z11 ? 1 : 0;
                                                    i11 = i21;
                                                    if (channel2 != null) {
                                                    }
                                                    channel.close();
                                                    fileInputStream.close();
                                                    i12 = 1;
                                                    if (zArr2[i13]) {
                                                    }
                                                    if (i14 == 0) {
                                                    }
                                                    fromFile = Uri.fromFile(file);
                                                    r12 = zArr;
                                                    i16 = i13;
                                                } catch (Throwable th12) {
                                                    th = th12;
                                                    r27 = z11;
                                                    i11 = i21;
                                                }
                                            } catch (Throwable th13) {
                                                th = th13;
                                                r27 = 0;
                                                i11 = i21;
                                                th3 = th;
                                                i15 = r27;
                                                if (channel == null) {
                                                }
                                            }
                                        } catch (Throwable th14) {
                                            th = th14;
                                            th3 = th;
                                            i15 = r27;
                                            if (channel == null) {
                                            }
                                        }
                                    } catch (Throwable th15) {
                                        th = th15;
                                        i15 = 0;
                                        i11 = i21;
                                        th2 = th;
                                        i10 = i15;
                                        fileInputStream.close();
                                        throw th2;
                                    }
                                } catch (Throwable th16) {
                                    th = th16;
                                    th2 = th;
                                    i10 = i15;
                                    fileInputStream.close();
                                    throw th2;
                                }
                            }
                            if (i14 != 0 && q20Var != null) {
                                i0.g3(new ge(q20Var, fromFile, i16));
                            }
                        } catch (Exception e13) {
                            e = e13;
                        }
                    } catch (Exception e14) {
                        e = e14;
                        z10 = true;
                        r12 = zArr3;
                        i19 = 2;
                    }
                } catch (Exception e15) {
                    e = e15;
                    r12 = zArr3;
                    i19 = 2;
                }
                if (x1Var == null) {
                    i0.g3(new be(x1Var, (boolean[]) r12, i19));
                    return;
                }
                return;
            case 1:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) r12.f;
                org.telegram.ui.ActionBar.x1 x1Var2 = (org.telegram.ui.ActionBar.x1) r12.b;
                TLObject tLObject = (TLObject) r12.h;
                int i23 = r12.c;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) r12.n;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) r12.r;
                String str5 = (String) r12.d;
                String str6 = (String) r12.e;
                ArrayList arrayList = ExternalActionActivity.y;
                try {
                    x1Var2.dismiss();
                } catch (Exception e16) {
                    f8.g(e16, true);
                }
                if (tLObject != null) {
                    vp.r1(i23).V3(authorizationform.users, false);
                    ll0 ll0Var = new ll0(5, getauthorizationform.bot_id, getauthorizationform.scope, getauthorizationform.public_key, str5, str6, (String) null, authorizationform, (TL_account.Password) tLObject);
                    ll0Var.C1 = true;
                    if (i0.Q1()) {
                        externalActionActivity.d.c(-1, ll0Var);
                    } else {
                        externalActionActivity.c.c(-1, ll0Var);
                    }
                    if (!i0.Q1()) {
                        externalActionActivity.e.setVisibility(8);
                    }
                    externalActionActivity.c.e0();
                    if (i0.Q1()) {
                        externalActionActivity.d.e0();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                TLObject tLObject2 = (TLObject) r12.f;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) r12.d;
                TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription = (TLRPC.TL_inputStorePaymentPremiumSubscription) r12.e;
                fu0 fu0Var = (fu0) r12.b;
                ba.a aVar = (ba.a) r12.h;
                int i24 = r12.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) r12.n;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) r12.r;
                if (!(tLObject2 instanceof TLRPC.TL_boolTrue)) {
                    org.telegram.ui.Components.s4.e0(i24, tL_error, k2Var, tL_payments_canPurchaseStore, new Object[0]);
                    return;
                }
                Activity parentActivity = k2Var != null ? k2Var.getParentActivity() : i0.u0();
                u1 i25 = u1.i();
                c accountInstance = k2Var.getAccountInstance();
                hf.b bVar = new hf.b(9, z11);
                bVar.m0(u1.l);
                fu0Var.a();
                String str7 = fu0Var.g.a;
                if (TextUtils.isEmpty(str7)) {
                    throw new IllegalArgumentException("offerToken can not be empty");
                }
                bVar.c = str7;
                i25.m(parentActivity, accountInstance, tL_inputStorePaymentPremiumSubscription, Collections.singletonList(bVar.K()), aVar, false);
                return;
            case 3:
                org.telegram.ui.Wallet.h0 h0Var = (org.telegram.ui.Wallet.h0) r12.f;
                String str8 = (String) r12.d;
                byte[] bArr2 = (byte[]) r12.b;
                JSONObject jSONObject2 = (JSONObject) r12.h;
                String str9 = (String) r12.e;
                int i26 = r12.c;
                org.telegram.ui.Wallet.t2 t2Var = (org.telegram.ui.Wallet.t2) r12.n;
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) r12.r;
                try {
                    try {
                        jSONObject = WalletEngine2.signData(h0Var, org.telegram.ui.Wallet.u2.e(), str8, bArr2, jSONObject2, str9, i26);
                    } catch (Exception e17) {
                        e = e17;
                        jSONObject = null;
                    }
                    try {
                        byte[] f7 = org.telegram.ui.Wallet.u2.f(h0Var, str8, bArr2);
                        h0Var.close();
                        bArr = f7;
                    } catch (Exception e18) {
                        e = e18;
                        String i27 = org.telegram.ui.Wallet.e2.i("widget sign data", e);
                        h0Var.close();
                        bArr = null;
                        str2 = i27;
                        i0.g3(new mg.c0(jSONObject, str2, t2Var, k0Var, str8, bArr2, bArr, 12));
                        return;
                    }
                    i0.g3(new mg.c0(jSONObject, str2, t2Var, k0Var, str8, bArr2, bArr, 12));
                    return;
                } catch (Throwable th17) {
                    h0Var.close();
                    throw th17;
                }
            default:
                Runnable[] runnableArr = (Runnable[]) r12.f;
                TextView[] textViewArr = (TextView[]) r12.d;
                int i28 = r12.c;
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) r12.e;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) r12.b;
                String[] strArr2 = (String[]) r12.n;
                boolean[] zArr4 = (boolean[]) r12.h;
                byte[] bArr3 = (byte[]) r12.r;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                }
                org.telegram.ui.f0 f0Var = new org.telegram.ui.f0(runnableArr, textViewArr, i28, p6Var, 5);
                org.telegram.ui.Wallet.k0 x10 = org.telegram.ui.Wallet.k0.x(i28);
                TL_wallet.nftItem nftitem = wallettransaction.nft;
                if (nftitem != null) {
                    org.telegram.ui.Wallet.a0 a0Var = new org.telegram.ui.Wallet.a0(x10, wallettransaction.peer.address, nftitem, strArr2[0], f0Var);
                    x10.m0(a0Var);
                    i17 = new org.telegram.ui.Wallet.l(a0Var, i20);
                } else {
                    i17 = x10.i(wallettransaction.peer.address, wallettransaction.amount, strArr2[0], zArr4[0] ? bArr3 : null, f0Var);
                }
                runnableArr[0] = i17;
                return;
        }
    }

    public /* synthetic */ ce(TLObject tLObject, org.telegram.ui.ActionBar.k2 k2Var, TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription, fu0 fu0Var, ba.a aVar, int i10, TLRPC.TL_error tL_error, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.f = tLObject;
        this.d = k2Var;
        this.e = tL_inputStorePaymentPremiumSubscription;
        this.b = fu0Var;
        this.h = aVar;
        this.c = i10;
        this.n = tL_error;
        this.r = tL_payments_canPurchaseStore;
    }

    public /* synthetic */ ce(ExternalActionActivity externalActionActivity, org.telegram.ui.ActionBar.x1 x1Var, TLObject tLObject, int i10, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2) {
        this.f = externalActionActivity;
        this.b = x1Var;
        this.h = tLObject;
        this.c = i10;
        this.n = authorizationform;
        this.r = getauthorizationform;
        this.d = str;
        this.e = str2;
    }

    public /* synthetic */ ce(org.telegram.ui.Wallet.h0 h0Var, String str, byte[] bArr, JSONObject jSONObject, String str2, int i10, org.telegram.ui.Wallet.t2 t2Var, org.telegram.ui.Wallet.k0 k0Var) {
        this.f = h0Var;
        this.d = str;
        this.b = bArr;
        this.h = jSONObject;
        this.e = str2;
        this.c = i10;
        this.n = t2Var;
        this.r = k0Var;
    }

    public /* synthetic */ ce(Runnable[] runnableArr, TextView[] textViewArr, int i10, org.telegram.ui.ActionBar.p6 p6Var, TL_wallet.walletTransaction wallettransaction, String[] strArr, boolean[] zArr, byte[] bArr) {
        this.f = runnableArr;
        this.d = textViewArr;
        this.c = i10;
        this.e = p6Var;
        this.b = wallettransaction;
        this.n = strArr;
        this.h = zArr;
        this.r = bArr;
    }
}
