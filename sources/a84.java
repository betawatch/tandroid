// default package

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
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class a84 implements Runnable {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ a84(int i, File file, String str, id idVar, boolean[] zArr, String str2, pcc pccVar, boolean[] zArr2) {
        this.d = i;
        this.e = file;
        this.b = str;
        this.f = idVar;
        this.h = zArr;
        this.c = str2;
        this.n = pccVar;
        this.r = zArr2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:50|(4:(18:(1:52)(1:(1:168)(3:(1:170)(1:186)|171|(4:173|174|(5:177|(1:179)(1:184)|180|(1:182)(29:183|54|(1:56)|57|58|59|60|61|62|63|64|65|66|67|68|69|(5:(1:72)|(1:75)|77|78|80)|82|(3:85|(5:87|88|89|(2:96|97)(2:93|94)|95)(10:110|111|(1:113)|114|115|116|117|(1:119)(1:130)|(2:121|(3:123|124|125)(1:128))(1:129)|126)|83)|132|111|(0)|114|115|116|117|(0)(0)|(0)(0)|126)|175)|185)))|66|67|68|69|(0)|82|(1:83)|132|111|(0)|114|115|116|117|(0)(0)|(0)(0)|126)|63|64|65)|53|54|(0)|57|58|59|60|61|62) */
    /* JADX WARN: Can't wrap try/catch for region: R(18:(1:52)(1:(1:168)(3:(1:170)(1:186)|171|(4:173|174|(5:177|(1:179)(1:184)|180|(1:182)(29:183|54|(1:56)|57|58|59|60|61|62|63|64|65|66|67|68|69|(5:(1:72)|(1:75)|77|78|80)|82|(3:85|(5:87|88|89|(2:96|97)(2:93|94)|95)(10:110|111|(1:113)|114|115|116|117|(1:119)(1:130)|(2:121|(3:123|124|125)(1:128))(1:129)|126)|83)|132|111|(0)|114|115|116|117|(0)(0)|(0)(0)|126)|175)|185)))|66|67|68|69|(0)|82|(1:83)|132|111|(0)|114|115|116|117|(0)(0)|(0)(0)|126) */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0236, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0238, code lost:
    
        cc4.g(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02d8, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02d9, code lost:
    
        r26 = r2;
        r17 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x02de, code lost:
    
        cc4.g(r0, true);
        r0 = r17;
        r17 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02d5, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[Catch: all -> 0x02af, SYNTHETIC, TRY_LEAVE, TryCatch #10 {all -> 0x02af, blocks: (B:108:0x02ae, B:107:0x02ab, B:113:0x0293, B:103:0x02a6), top: B:66:0x01fd, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0293 A[Catch: all -> 0x02af, TRY_ENTER, TRY_LEAVE, TryCatch #10 {all -> 0x02af, blocks: (B:108:0x02ae, B:107:0x02ab, B:113:0x0293, B:103:0x02a6), top: B:66:0x01fd, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02e7 A[Catch: Exception -> 0x0335, TryCatch #8 {Exception -> 0x0335, blocks: (B:34:0x0105, B:54:0x01d9, B:56:0x01df, B:57:0x01e2, B:117:0x02e3, B:119:0x02e7, B:123:0x02f3, B:165:0x02de, B:171:0x016a, B:173:0x017d, B:179:0x018e, B:180:0x01c8, B:182:0x01d3, B:184:0x01b1, B:186:0x0164), top: B:33:0x0105 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0326 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01df A[Catch: Exception -> 0x0335, TryCatch #8 {Exception -> 0x0335, blocks: (B:34:0x0105, B:54:0x01d9, B:56:0x01df, B:57:0x01e2, B:117:0x02e3, B:119:0x02e7, B:123:0x02f3, B:165:0x02de, B:171:0x016a, B:173:0x017d, B:179:0x018e, B:180:0x01c8, B:182:0x01d3, B:184:0x01b1, B:186:0x0164), top: B:33:0x0105 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0243 A[Catch: all -> 0x029e, TRY_LEAVE, TryCatch #18 {all -> 0x029e, blocks: (B:67:0x01fd, B:85:0x0243, B:135:0x0238, B:69:0x0201, B:72:0x0220), top: B:66:0x01fd, inners: #15 }] */
    /* JADX WARN: Type inference failed for: r17v10 */
    /* JADX WARN: Type inference failed for: r17v11 */
    /* JADX WARN: Type inference failed for: r17v13 */
    /* JADX WARN: Type inference failed for: r17v15 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v9 */
    /* JADX WARN: Type inference failed for: r1v10, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [boolean[]] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        JSONObject jSONObject;
        c cVar;
        byte[] bArr;
        byte[] bArr2;
        String str;
        boolean z;
        File file;
        String str2;
        File file2;
        File file3;
        ?? r17;
        char c;
        char c2;
        boolean[] zArr;
        Uri fromFile;
        FileInputStream fileInputStream;
        Throwable th;
        FileChannel channel;
        FileChannel channel2;
        long size;
        long j;
        long j2;
        rj4 l;
        int i = -1;
        boolean z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        switch (this.a) {
            case 0:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.e;
                id idVar = (id) this.f;
                TLObject tLObject = (TLObject) this.h;
                int i2 = this.d;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) this.n;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) this.r;
                String str3 = (String) this.b;
                String str4 = (String) this.c;
                ArrayList arrayList = ExternalActionActivity.y;
                try {
                    idVar.dismiss();
                } catch (Exception e) {
                    cc4.g(e, true);
                }
                if (tLObject != null) {
                    uc7.s1(i2).j4(authorizationform.users, false);
                    b18 b18Var = new b18(5, getauthorizationform.bot_id, getauthorizationform.scope, getauthorizationform.public_key, str3, str4, (String) null, authorizationform, (TL_account.Password) tLObject);
                    b18Var.D1 = true;
                    if (hl.O1()) {
                        externalActionActivity.d.b(-1, b18Var);
                    } else {
                        externalActionActivity.c.b(-1, b18Var);
                    }
                    if (!hl.O1()) {
                        externalActionActivity.e.setVisibility(8);
                    }
                    externalActionActivity.c.e0();
                    if (hl.O1()) {
                        externalActionActivity.d.e0();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                c35 c35Var = (c35) this.e;
                String str5 = (String) this.b;
                byte[] bArr3 = (byte[]) this.f;
                JSONObject jSONObject2 = (JSONObject) this.h;
                String str6 = (String) this.c;
                int i3 = this.d;
                n55 n55Var = (n55) this.n;
                c cVar2 = (c) this.r;
                try {
                    try {
                        jSONObject = WalletEngine2.signData(c35Var, o55.e(), str5, bArr3, jSONObject2, str6, i3);
                        try {
                            byte[] f = o55.f(c35Var, str5, bArr3);
                            c35Var.close();
                            bArr = f;
                            cVar = cVar2;
                            bArr2 = bArr3;
                            str = null;
                        } catch (Exception e2) {
                            e = e2;
                            String h = a55.h("widget sign data", e);
                            c35Var.close();
                            cVar = cVar2;
                            bArr = null;
                            bArr2 = bArr3;
                            str = h;
                            hl.c3(new ra7((Object) jSONObject, (Object) str, (Object) n55Var, (Object) cVar, (Object) str5, (Object) bArr2, (Object) bArr, (byte) 11));
                            return;
                        }
                    } catch (Throwable th2) {
                        c35Var.close();
                        throw th2;
                    }
                } catch (Exception e3) {
                    e = e3;
                    jSONObject = null;
                }
                hl.c3(new ra7((Object) jSONObject, (Object) str, (Object) n55Var, (Object) cVar, (Object) str5, (Object) bArr2, (Object) bArr, (byte) 11));
                return;
            case 2:
                ?? r1 = this.d;
                File file4 = (File) this.e;
                String str7 = (String) this.b;
                id idVar2 = (id) this.f;
                boolean[] zArr2 = (boolean[]) this.h;
                String str8 = (String) this.c;
                pcc pccVar = (pcc) this.n;
                boolean[] zArr3 = (boolean[]) this.r;
                String[] strArr = MediaController.W1;
                try {
                } catch (Exception e4) {
                    e = e4;
                    r1 = zArr3;
                }
                try {
                    try {
                        if (Build.VERSION.SDK_INT >= 29) {
                            fromFile = MediaController.h0(r1, file4, null);
                            c2 = fromFile != null ? (char) 1 : (char) 0;
                            r1 = zArr3;
                        } else {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                if (r1 == 0) {
                                                    File file5 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "Telegram");
                                                    file5.mkdirs();
                                                    file = new File(file5, hl.p0(0, xb4.D(file4)));
                                                } else if (r1 == 1) {
                                                    File file6 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES), "Telegram");
                                                    file6.mkdirs();
                                                    file = new File(file6, hl.p0(1, xb4.D(file4)));
                                                } else {
                                                    File file7 = new File(r1 == 2 ? Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS) : Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC), "Telegram");
                                                    file7.mkdirs();
                                                    file = new File(file7, str7);
                                                    if (file.exists()) {
                                                        int lastIndexOf = str7.lastIndexOf(46);
                                                        int i4 = 0;
                                                        while (i4 < 10) {
                                                            if (lastIndexOf != i) {
                                                                str2 = str7.substring(0, lastIndexOf) + "(" + (i4 + 1) + ")" + str7.substring(lastIndexOf);
                                                            } else {
                                                                str2 = str7 + "(" + (i4 + 1) + ")";
                                                            }
                                                            file2 = new File(file7, str2);
                                                            if (file2.exists()) {
                                                                i4++;
                                                                file = file2;
                                                                i = -1;
                                                            } else {
                                                                if (!file2.exists()) {
                                                                    file2.createNewFile();
                                                                }
                                                                long currentTimeMillis = System.currentTimeMillis() - 500;
                                                                fileInputStream = new FileInputStream(file4);
                                                                channel = fileInputStream.getChannel();
                                                                channel2 = new FileOutputStream(file2).getChannel();
                                                                size = channel.size();
                                                                if (hl.G1(null, ((Integer) FileDescriptor.class.getDeclaredMethod("getInt$", null).invoke(fileInputStream.getFD(), null)).intValue())) {
                                                                    if (idVar2 != null) {
                                                                        hl.c3(new uc(idVar2, (byte) 5));
                                                                    }
                                                                    if (channel2 != null) {
                                                                        channel2.close();
                                                                    }
                                                                    channel.close();
                                                                    fileInputStream.close();
                                                                    return;
                                                                }
                                                                j = 0;
                                                                while (j < size) {
                                                                    if (zArr2[z2 ? 1 : 0]) {
                                                                        file3 = file2;
                                                                        c = z2 ? 1 : 0;
                                                                        if (channel2 != null) {
                                                                            channel2.close();
                                                                        }
                                                                        channel.close();
                                                                        fileInputStream.close();
                                                                        char c3 = 1;
                                                                        if (zArr2[c]) {
                                                                            file3.delete();
                                                                            c2 = c;
                                                                        } else {
                                                                            c2 = c3;
                                                                        }
                                                                        if (c2 == 0) {
                                                                            zArr = zArr3;
                                                                        } else if (r1 == 2) {
                                                                            zArr = zArr3;
                                                                            ((DownloadManager) a.b.getSystemService("download")).addCompletedDownload(file3.getName(), file3.getName(), false, str8, file3.getAbsolutePath(), file3.length(), true);
                                                                        } else {
                                                                            zArr = zArr3;
                                                                            hl.d(file3.getAbsoluteFile());
                                                                        }
                                                                        fromFile = Uri.fromFile(file3);
                                                                        r1 = zArr;
                                                                    } else {
                                                                        r17 = z2 ? 1 : 0;
                                                                        file3 = file2;
                                                                        long j3 = currentTimeMillis;
                                                                        try {
                                                                            channel2.transferFrom(channel, j, Math.min(4096L, size - j));
                                                                            long j4 = j;
                                                                            if (idVar2 == null || j3 > System.currentTimeMillis() - 500) {
                                                                                j2 = j3;
                                                                            } else {
                                                                                j2 = System.currentTimeMillis();
                                                                                hl.c3(new hl3((Object) idVar2, (int) ((j4 / size) * 100.0f), (byte) 21));
                                                                            }
                                                                            long j5 = j2;
                                                                            j = 4096 + j4;
                                                                            currentTimeMillis = j5;
                                                                            z2 = r17;
                                                                            file2 = file3;
                                                                        } catch (Throwable th3) {
                                                                            th = th3;
                                                                            Throwable th4 = th;
                                                                            if (channel2 != null) {
                                                                                throw th4;
                                                                            }
                                                                            try {
                                                                                channel2.close();
                                                                                throw th4;
                                                                            } catch (Throwable th5) {
                                                                                th4.addSuppressed(th5);
                                                                                throw th4;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                file3 = file2;
                                                                c = z2 ? 1 : 0;
                                                                if (channel2 != null) {
                                                                }
                                                                channel.close();
                                                                fileInputStream.close();
                                                                char c32 = 1;
                                                                if (zArr2[c]) {
                                                                }
                                                                if (c2 == 0) {
                                                                }
                                                                fromFile = Uri.fromFile(file3);
                                                                r1 = zArr;
                                                            }
                                                        }
                                                    }
                                                }
                                                size = channel.size();
                                                if (hl.G1(null, ((Integer) FileDescriptor.class.getDeclaredMethod("getInt$", null).invoke(fileInputStream.getFD(), null)).intValue())) {
                                                }
                                                j = 0;
                                                while (j < size) {
                                                }
                                                file3 = file2;
                                                c = z2 ? 1 : 0;
                                                if (channel2 != null) {
                                                }
                                                channel.close();
                                                fileInputStream.close();
                                                char c322 = 1;
                                                if (zArr2[c]) {
                                                }
                                                if (c2 == 0) {
                                                }
                                                fromFile = Uri.fromFile(file3);
                                                r1 = zArr;
                                            } catch (Throwable th6) {
                                                th = th6;
                                                Throwable th7 = th;
                                                if (channel == null) {
                                                    throw th7;
                                                }
                                                try {
                                                    channel.close();
                                                    throw th7;
                                                } catch (Throwable th8) {
                                                    th7.addSuppressed(th8);
                                                    throw th7;
                                                }
                                            }
                                        } catch (Throwable th9) {
                                            th = th9;
                                            file3 = file2;
                                            r17 = z2;
                                            Throwable th42 = th;
                                            if (channel2 != null) {
                                            }
                                        }
                                        channel2 = new FileOutputStream(file2).getChannel();
                                    } catch (Throwable th10) {
                                        th = th10;
                                        file3 = file2;
                                        r17 = 0;
                                    }
                                    channel = fileInputStream.getChannel();
                                } catch (Throwable th11) {
                                    th = th11;
                                    th = th;
                                    try {
                                        fileInputStream.close();
                                        throw th;
                                    } catch (Throwable th12) {
                                        th.addSuppressed(th12);
                                        throw th;
                                    }
                                }
                            } catch (Throwable th13) {
                                th = th13;
                                file3 = file2;
                                r17 = 0;
                                th = th;
                                fileInputStream.close();
                                throw th;
                            }
                            file2 = file;
                            if (!file2.exists()) {
                            }
                            long currentTimeMillis2 = System.currentTimeMillis() - 500;
                            fileInputStream = new FileInputStream(file4);
                        }
                        if (c2 != 0 && pccVar != null) {
                            hl.c3(new kn6(pccVar, fromFile, (byte) 1));
                        }
                    } catch (Exception e5) {
                        e = e5;
                        z = true;
                        r1 = r1;
                        cc4.g(e, z);
                        if (idVar2 != null) {
                        }
                    }
                } catch (Exception e6) {
                    e = e6;
                    z = true;
                    r1 = zArr3;
                    cc4.g(e, z);
                    if (idVar2 != null) {
                    }
                }
                if (idVar2 != null) {
                    hl.c3(new in6(idVar2, (boolean[]) r1, (byte) 3));
                    return;
                }
                return;
            case 3:
                TLObject tLObject2 = (TLObject) this.h;
                e eVar = (e) this.e;
                TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription = (TLRPC.TL_inputStorePaymentPremiumSubscription) this.f;
                tl8 tl8Var = (tl8) this.n;
                ekd ekdVar = (ekd) this.r;
                int i5 = this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) this.c;
                if (!(tLObject2 instanceof TLRPC.TL_boolTrue)) {
                    jj.c0(i5, tL_error, eVar, tL_payments_canPurchaseStore, new Object[0]);
                    return;
                }
                Activity parentActivity = eVar != null ? eVar.getParentActivity() : hl.u0();
                di0 h2 = di0.h();
                k5 accountInstance = eVar.getAccountInstance();
                qx6 qx6Var = new qx6((byte) 7, z2);
                qx6Var.O(di0.l);
                tl8Var.a();
                String str9 = tl8Var.g.a;
                if (TextUtils.isEmpty(str9)) {
                    lq5.j("offerToken can not be empty");
                    return;
                } else {
                    qx6Var.c = str9;
                    h2.l(parentActivity, accountInstance, tL_inputStorePaymentPremiumSubscription, Collections.singletonList(qx6Var.g()), ekdVar, false);
                    return;
                }
            default:
                Runnable[] runnableArr = (Runnable[]) this.e;
                TextView[] textViewArr = (TextView[]) this.f;
                int i6 = this.d;
                vnb vnbVar = (vnb) this.h;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) this.n;
                String[] strArr2 = (String[]) this.r;
                boolean[] zArr4 = (boolean[]) this.b;
                byte[] bArr4 = (byte[]) this.c;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                }
                f fVar = new f((Object) runnableArr, (Object) textViewArr, i6, (Object) vnbVar, (byte) 11);
                c C = c.C(i6);
                TL_wallet.nftItem nftitem = wallettransaction.nft;
                TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction.peer;
                if (nftitem != null) {
                    u25 u25Var = new u25(C, walletTransactionPeer.address, nftitem, strArr2[0], fVar);
                    C.A0(u25Var);
                    l = new rj4(u25Var, (byte) 22);
                } else {
                    l = C.l(walletTransactionPeer.address, wallettransaction.amount, strArr2[0], zArr4[0] ? bArr4 : null, fVar);
                }
                runnableArr[0] = l;
                return;
        }
    }

    public /* synthetic */ a84(c35 c35Var, String str, byte[] bArr, JSONObject jSONObject, String str2, int i, n55 n55Var, c cVar) {
        this.e = c35Var;
        this.b = str;
        this.f = bArr;
        this.h = jSONObject;
        this.c = str2;
        this.d = i;
        this.n = n55Var;
        this.r = cVar;
    }

    public /* synthetic */ a84(TLObject tLObject, e eVar, TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription, tl8 tl8Var, ekd ekdVar, int i, TLRPC.TL_error tL_error, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.h = tLObject;
        this.e = eVar;
        this.f = tL_inputStorePaymentPremiumSubscription;
        this.n = tl8Var;
        this.r = ekdVar;
        this.d = i;
        this.b = tL_error;
        this.c = tL_payments_canPurchaseStore;
    }

    public /* synthetic */ a84(ExternalActionActivity externalActionActivity, id idVar, TLObject tLObject, int i, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2) {
        this.e = externalActionActivity;
        this.f = idVar;
        this.h = tLObject;
        this.d = i;
        this.n = authorizationform;
        this.r = getauthorizationform;
        this.b = str;
        this.c = str2;
    }

    public /* synthetic */ a84(Runnable[] runnableArr, TextView[] textViewArr, int i, vnb vnbVar, TL_wallet.walletTransaction wallettransaction, String[] strArr, boolean[] zArr, byte[] bArr) {
        this.e = runnableArr;
        this.f = textViewArr;
        this.d = i;
        this.h = vnbVar;
        this.n = wallettransaction;
        this.r = strArr;
        this.b = zArr;
        this.c = bArr;
    }
}
