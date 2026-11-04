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
import org.telegram.ui.ms0;
import org.telegram.ui.yj0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class yd implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ yd(int i3, File file, String str, org.telegram.ui.ActionBar.s1 s1Var, boolean[] zArr, String str2, u10 u10Var, boolean[] zArr2) {
        this.c = i3;
        this.f = file;
        this.d = str;
        this.b = s1Var;
        this.h = zArr;
        this.e = str2;
        this.r = u10Var;
        this.n = zArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[Catch: all -> 0x03b2, SYNTHETIC, TRY_LEAVE, TryCatch #12 {all -> 0x03b2, blocks: (B:128:0x03d0, B:127:0x03cd, B:178:0x03a8, B:123:0x03c8), top: B:100:0x02da, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03a1 A[Catch: all -> 0x03a5, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x03a5, blocks: (B:172:0x03bf, B:171:0x03bc, B:177:0x03a1, B:167:0x03b7), top: B:102:0x02de, inners: #21 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03e9 A[Catch: Exception -> 0x0295, TRY_ENTER, TRY_LEAVE, TryCatch #7 {Exception -> 0x0295, blocks: (B:95:0x02cb, B:183:0x03e9, B:237:0x0263, B:243:0x0272, B:244:0x02b2, B:248:0x029b), top: B:236:0x0263 }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0431 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0, types: [org.telegram.messenger.yd] */
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
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        File file;
        String str;
        int i3;
        int i10;
        int i11;
        int i12;
        boolean[] zArr;
        Uri fromFile;
        FileInputStream fileInputStream;
        Throwable th2;
        Throwable th3;
        long j10;
        JSONObject jSONObject;
        byte[] bArr;
        org.telegram.ui.Wallet.l i13;
        ?? r12 = this;
        int i14 = -1;
        int i15 = 0;
        String str2 = null;
        int i16 = 1;
        int i17 = 0;
        switch (r12.a) {
            case 0:
                int i18 = r12.c;
                File file2 = (File) r12.f;
                String str3 = (String) r12.d;
                org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) r12.b;
                boolean[] zArr2 = (boolean[]) r12.h;
                String str4 = (String) r12.e;
                u10 u10Var = (u10) r12.r;
                boolean[] zArr3 = (boolean[]) r12.n;
                String[] strArr = MediaController.W1;
                try {
                    try {
                        try {
                            if (Build.VERSION.SDK_INT >= 29) {
                                fromFile = MediaController.f0(i18, file2, null);
                                i12 = fromFile != null ? 1 : 0;
                                i3 = 0;
                                r12 = zArr3;
                                i15 = 2;
                            } else {
                                if (i18 == 0) {
                                    File file3 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "Telegram");
                                    file3.mkdirs();
                                    file = new File(file3, g0.p0(0, w7.D(file2)));
                                } else if (i18 == 1) {
                                    File file4 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES), "Telegram");
                                    file4.mkdirs();
                                    file = new File(file4, g0.p0(1, w7.D(file2)));
                                } else {
                                    try {
                                        File file5 = new File(i18 == 2 ? Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS) : Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC), "Telegram");
                                        file5.mkdirs();
                                        File file6 = new File(file5, str3);
                                        if (file6.exists()) {
                                            try {
                                                int lastIndexOf = str3.lastIndexOf(46);
                                                int i19 = 0;
                                                while (i19 < 10) {
                                                    if (lastIndexOf != i14) {
                                                        str = str3.substring(0, lastIndexOf) + "(" + (i19 + 1) + ")" + str3.substring(lastIndexOf);
                                                    } else {
                                                        str = str3 + "(" + (i19 + 1) + ")";
                                                    }
                                                    file6 = new File(file5, str);
                                                    if (file6.exists()) {
                                                        i19++;
                                                        i14 = -1;
                                                    }
                                                }
                                            } catch (Exception e10) {
                                                e = e10;
                                                r12 = zArr3;
                                                z10 = true;
                                                i15 = 2;
                                                a8.g(e, z10);
                                                if (s1Var == null) {
                                                }
                                            }
                                        }
                                        file = file6;
                                    } catch (Exception e11) {
                                        e = e11;
                                        r12 = zArr3;
                                        i15 = 2;
                                        z10 = true;
                                        r12 = r12;
                                        a8.g(e, z10);
                                        if (s1Var == null) {
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
                                    } catch (Exception e12) {
                                        e = e12;
                                        a8.g(e, true);
                                        i11 = i3;
                                        if (zArr2[i3]) {
                                        }
                                        if (i12 == 0) {
                                        }
                                        fromFile = Uri.fromFile(file);
                                        r12 = zArr;
                                        if (i12 != 0) {
                                            g0.h3(new ae(u10Var, fromFile, i3));
                                        }
                                        if (s1Var == null) {
                                        }
                                    }
                                } catch (Exception e13) {
                                    e = e13;
                                    i3 = 0;
                                    i10 = i18;
                                    a8.g(e, true);
                                    i11 = i3;
                                    if (zArr2[i3]) {
                                    }
                                    if (i12 == 0) {
                                    }
                                    fromFile = Uri.fromFile(file);
                                    r12 = zArr;
                                    if (i12 != 0) {
                                    }
                                    if (s1Var == null) {
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
                                                        if (g0.I1(null, ((Integer) FileDescriptor.class.getDeclaredMethod("getInt$", null).invoke(fileInputStream.getFD(), null)).intValue())) {
                                                            if (s1Var != null) {
                                                                g0.h3(new a(s1Var, 14));
                                                            }
                                                            if (channel2 != null) {
                                                                try {
                                                                    channel2.close();
                                                                } catch (Throwable th4) {
                                                                    th3 = th4;
                                                                    i3 = 0;
                                                                    i10 = i18;
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
                                                                i3 = 0;
                                                                i10 = i18;
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
                                                        a8.g(th8, true);
                                                    }
                                                    long j11 = 0;
                                                    while (j11 < size) {
                                                        if (zArr2[i17]) {
                                                            i3 = i17;
                                                            i10 = i18;
                                                            if (channel2 != null) {
                                                                channel2.close();
                                                            }
                                                            channel.close();
                                                            fileInputStream.close();
                                                            i11 = 1;
                                                            if (zArr2[i3]) {
                                                                i12 = i11;
                                                            } else {
                                                                file.delete();
                                                                i12 = i3;
                                                            }
                                                            if (i12 == 0) {
                                                                i15 = 2;
                                                                i15 = 2;
                                                                i15 = 2;
                                                                if (i10 == 2) {
                                                                    try {
                                                                        zArr = zArr3;
                                                                        ((DownloadManager) t0.b.getSystemService("download")).addCompletedDownload(file.getName(), file.getName(), false, str4, file.getAbsolutePath(), file.length(), true);
                                                                    } catch (Exception e14) {
                                                                        e = e14;
                                                                        r12 = zArr3;
                                                                        z10 = true;
                                                                        r12 = r12;
                                                                        a8.g(e, z10);
                                                                        if (s1Var == null) {
                                                                        }
                                                                    }
                                                                } else {
                                                                    zArr = zArr3;
                                                                    g0.d(file.getAbsoluteFile());
                                                                }
                                                            } else {
                                                                zArr = zArr3;
                                                                i15 = 2;
                                                            }
                                                            fromFile = Uri.fromFile(file);
                                                            r12 = zArr;
                                                        } else {
                                                            i3 = i17;
                                                            i10 = i18;
                                                            try {
                                                                channel2.transferFrom(channel, j11, Math.min(4096L, size - j11));
                                                                long j12 = j11;
                                                                if (s1Var == null || currentTimeMillis > System.currentTimeMillis() - 500) {
                                                                    j10 = 4096;
                                                                } else {
                                                                    long currentTimeMillis2 = System.currentTimeMillis();
                                                                    j10 = 4096;
                                                                    g0.h3(new x0(s1Var, (int) ((j12 / size) * 100.0f), 3));
                                                                    currentTimeMillis = currentTimeMillis2;
                                                                }
                                                                j11 = j12 + j10;
                                                                i18 = i10;
                                                                i17 = i3;
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
                                                    i3 = i17;
                                                    i10 = i18;
                                                    if (channel2 != null) {
                                                    }
                                                    channel.close();
                                                    fileInputStream.close();
                                                    i11 = 1;
                                                    if (zArr2[i3]) {
                                                    }
                                                    if (i12 == 0) {
                                                    }
                                                    fromFile = Uri.fromFile(file);
                                                    r12 = zArr;
                                                } catch (Throwable th12) {
                                                    th = th12;
                                                    i3 = i17;
                                                    i10 = i18;
                                                }
                                            } catch (Throwable th13) {
                                                th = th13;
                                                i3 = 0;
                                                i10 = i18;
                                                th3 = th;
                                                if (channel == null) {
                                                }
                                            }
                                        } catch (Throwable th14) {
                                            th = th14;
                                            th3 = th;
                                            if (channel == null) {
                                            }
                                        }
                                    } catch (Throwable th15) {
                                        th = th15;
                                        i3 = 0;
                                        i10 = i18;
                                        th2 = th;
                                        fileInputStream.close();
                                        throw th2;
                                    }
                                } catch (Throwable th16) {
                                    th = th16;
                                    th2 = th;
                                    fileInputStream.close();
                                    throw th2;
                                }
                            }
                            if (i12 != 0 && u10Var != null) {
                                g0.h3(new ae(u10Var, fromFile, i3));
                            }
                        } catch (Exception e15) {
                            e = e15;
                        }
                    } catch (Exception e16) {
                        e = e16;
                        z10 = true;
                        r12 = zArr3;
                        i15 = 2;
                    }
                } catch (Exception e17) {
                    e = e17;
                    r12 = zArr3;
                    i15 = 2;
                }
                if (s1Var == null) {
                    g0.h3(new xd(s1Var, (boolean[]) r12, i15));
                    return;
                }
                return;
            case 1:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) r12.f;
                org.telegram.ui.ActionBar.s1 s1Var2 = (org.telegram.ui.ActionBar.s1) r12.b;
                TLObject tLObject = (TLObject) r12.h;
                int i20 = r12.c;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) r12.n;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) r12.r;
                String str5 = (String) r12.d;
                String str6 = (String) r12.e;
                ArrayList arrayList = ExternalActionActivity.y;
                try {
                    s1Var2.dismiss();
                } catch (Exception e18) {
                    a8.g(e18, true);
                }
                if (tLObject != null) {
                    hp.s1(i20).Y3(authorizationform.users, false);
                    yj0 yj0Var = new yj0(5, getauthorizationform.bot_id, getauthorizationform.scope, getauthorizationform.public_key, str5, str6, (String) null, authorizationform, (TL_account.Password) tLObject);
                    yj0Var.D1 = true;
                    if (g0.Q1()) {
                        externalActionActivity.d.c(-1, yj0Var);
                    } else {
                        externalActionActivity.c.c(-1, yj0Var);
                    }
                    if (!g0.Q1()) {
                        externalActionActivity.e.setVisibility(8);
                    }
                    externalActionActivity.c.f0();
                    if (g0.Q1()) {
                        externalActionActivity.d.f0();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                TLObject tLObject2 = (TLObject) r12.f;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) r12.d;
                TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription = (TLRPC.TL_inputStorePaymentPremiumSubscription) r12.e;
                ms0 ms0Var = (ms0) r12.b;
                ad.b bVar = (ad.b) r12.h;
                int i21 = r12.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) r12.n;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) r12.r;
                if (!(tLObject2 instanceof TLRPC.TL_boolTrue)) {
                    org.telegram.ui.Components.t4.e0(i21, tL_error, d2Var, tL_payments_canPurchaseStore, new Object[0]);
                    return;
                }
                Activity parentActivity = d2Var != null ? d2Var.getParentActivity() : g0.u0();
                r1 i22 = r1.i();
                c accountInstance = d2Var.getAccountInstance();
                tf.b bVar2 = new tf.b();
                bVar2.B(r1.l);
                ms0Var.a();
                String str7 = ms0Var.g.a;
                if (TextUtils.isEmpty(str7)) {
                    throw new IllegalArgumentException("offerToken can not be empty");
                }
                bVar2.b = str7;
                i22.m(parentActivity, accountInstance, tL_inputStorePaymentPremiumSubscription, Collections.singletonList(bVar2.k()), bVar, false);
                return;
            case 3:
                org.telegram.ui.Wallet.h0 h0Var = (org.telegram.ui.Wallet.h0) r12.f;
                String str8 = (String) r12.d;
                byte[] bArr2 = (byte[]) r12.b;
                JSONObject jSONObject2 = (JSONObject) r12.h;
                String str9 = (String) r12.e;
                int i23 = r12.c;
                org.telegram.ui.Wallet.s2 s2Var = (org.telegram.ui.Wallet.s2) r12.n;
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) r12.r;
                try {
                    try {
                        jSONObject = WalletEngine2.signData(h0Var, org.telegram.ui.Wallet.t2.e(), str8, bArr2, jSONObject2, str9, i23);
                    } catch (Exception e19) {
                        e = e19;
                        jSONObject = null;
                    }
                    try {
                        byte[] f10 = org.telegram.ui.Wallet.t2.f(h0Var, str8, bArr2);
                        h0Var.close();
                        bArr = f10;
                    } catch (Exception e20) {
                        e = e20;
                        String i24 = org.telegram.ui.Wallet.c2.i("widget sign data", e);
                        h0Var.close();
                        bArr = null;
                        str2 = i24;
                        g0.h3(new ci.s6(jSONObject, str2, s2Var, k0Var, str8, bArr2, bArr));
                        return;
                    }
                    g0.h3(new ci.s6(jSONObject, str2, s2Var, k0Var, str8, bArr2, bArr));
                    return;
                } catch (Throwable th17) {
                    h0Var.close();
                    throw th17;
                }
            default:
                Runnable[] runnableArr = (Runnable[]) r12.f;
                TextView[] textViewArr = (TextView[]) r12.d;
                int i25 = r12.c;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) r12.e;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) r12.b;
                String[] strArr2 = (String[]) r12.n;
                boolean[] zArr4 = (boolean[]) r12.h;
                byte[] bArr3 = (byte[]) r12.r;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                }
                ci.o0 o0Var = new ci.o0(runnableArr, textViewArr, i25, e6Var, 9);
                org.telegram.ui.Wallet.k0 x10 = org.telegram.ui.Wallet.k0.x(i25);
                TL_wallet.nftItem nftitem = wallettransaction.nft;
                if (nftitem != null) {
                    org.telegram.ui.Wallet.a0 a0Var = new org.telegram.ui.Wallet.a0(x10, wallettransaction.peer.address, nftitem, strArr2[0], o0Var);
                    x10.m0(a0Var);
                    i13 = new org.telegram.ui.Wallet.l(a0Var, i16);
                } else {
                    i13 = x10.i(wallettransaction.peer.address, wallettransaction.amount, strArr2[0], zArr4[0] ? bArr3 : null, o0Var);
                }
                runnableArr[0] = i13;
                return;
        }
    }

    public /* synthetic */ yd(TLObject tLObject, org.telegram.ui.ActionBar.d2 d2Var, TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription, ms0 ms0Var, ad.b bVar, int i3, TLRPC.TL_error tL_error, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.f = tLObject;
        this.d = d2Var;
        this.e = tL_inputStorePaymentPremiumSubscription;
        this.b = ms0Var;
        this.h = bVar;
        this.c = i3;
        this.n = tL_error;
        this.r = tL_payments_canPurchaseStore;
    }

    public /* synthetic */ yd(ExternalActionActivity externalActionActivity, org.telegram.ui.ActionBar.s1 s1Var, TLObject tLObject, int i3, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2) {
        this.f = externalActionActivity;
        this.b = s1Var;
        this.h = tLObject;
        this.c = i3;
        this.n = authorizationform;
        this.r = getauthorizationform;
        this.d = str;
        this.e = str2;
    }

    public /* synthetic */ yd(org.telegram.ui.Wallet.h0 h0Var, String str, byte[] bArr, JSONObject jSONObject, String str2, int i3, org.telegram.ui.Wallet.s2 s2Var, org.telegram.ui.Wallet.k0 k0Var) {
        this.f = h0Var;
        this.d = str;
        this.b = bArr;
        this.h = jSONObject;
        this.e = str2;
        this.c = i3;
        this.n = s2Var;
        this.r = k0Var;
    }

    public /* synthetic */ yd(Runnable[] runnableArr, TextView[] textViewArr, int i3, org.telegram.ui.ActionBar.e6 e6Var, TL_wallet.walletTransaction wallettransaction, String[] strArr, boolean[] zArr, byte[] bArr) {
        this.f = runnableArr;
        this.d = textViewArr;
        this.c = i3;
        this.e = e6Var;
        this.b = wallettransaction;
        this.n = strArr;
        this.h = zArr;
        this.r = bArr;
    }
}
