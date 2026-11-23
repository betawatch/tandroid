package org.telegram.messenger;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
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
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.fk0;
import org.telegram.ui.ws0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class ce implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ ce(int i7, File file, String str, org.telegram.ui.ActionBar.t1 t1Var, boolean[] zArr, String str2, w10 w10Var, boolean[] zArr2) {
        this.b = i7;
        this.c = file;
        this.d = str;
        this.f = t1Var;
        this.h = zArr;
        this.e = str2;
        this.r = w10Var;
        this.n = zArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x05b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x052e A[Catch: all -> 0x0532, TRY_ENTER, TRY_LEAVE, TryCatch #11 {all -> 0x0532, blocks: (B:191:0x054c, B:190:0x0549, B:196:0x052e, B:186:0x0544), top: B:145:0x0473, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x056a A[Catch: Exception -> 0x0390, TryCatch #1 {Exception -> 0x0390, blocks: (B:116:0x037d, B:119:0x0383, B:134:0x0399, B:136:0x045a, B:138:0x0460, B:139:0x0463, B:201:0x0566, B:203:0x056a, B:207:0x0573, B:246:0x0561, B:251:0x03bb, B:254:0x03db, B:255:0x03e8, B:257:0x03fb, B:263:0x040d, B:264:0x0448, B:266:0x0455, B:269:0x0431, B:271:0x03e2), top: B:115:0x037d }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x054f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:230:? A[Catch: all -> 0x0540, SYNTHETIC, TRY_LEAVE, TryCatch #0 {all -> 0x0540, blocks: (B:197:0x0534, B:229:0x0557, B:228:0x0554, B:224:0x054f), top: B:143:0x046f, inners: #13 }] */
    /* JADX WARN: Type inference failed for: r15v5, types: [android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r1v0, types: [org.telegram.messenger.ce] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean[]] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r26v1 */
    /* JADX WARN: Type inference failed for: r26v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        File file;
        File file2;
        boolean z10;
        boolean[] zArr;
        boolean z11;
        Uri fromFile;
        FileInputStream fileInputStream;
        Throwable th2;
        FileChannel channel;
        FileChannel channel2;
        long size;
        long j3;
        long j10;
        int i7;
        int i10;
        bi.b1 b1Var;
        ArrayList arrayList;
        ji.k kVar;
        ji.g gVar;
        ArrayList arrayList2;
        JSONObject jSONObject;
        String str;
        byte[] bArr;
        org.telegram.ui.Wallet.m m10;
        ?? r12 = this;
        int i11 = 2;
        int i12 = 1;
        boolean z12 = false;
        switch (r12.a) {
            case 0:
                int i13 = 3;
                int i14 = r12.b;
                File file3 = (File) r12.c;
                String str2 = (String) r12.d;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) r12.f;
                boolean[] zArr2 = (boolean[]) r12.h;
                String str3 = (String) r12.e;
                w10 w10Var = (w10) r12.r;
                boolean[] zArr3 = (boolean[]) r12.n;
                String[] strArr = MediaController.W1;
                try {
                } catch (Exception e10) {
                    e = e10;
                    r12 = zArr3;
                }
                try {
                    if (Build.VERSION.SDK_INT >= 29) {
                        fromFile = MediaController.f0(i14, file3, null);
                        z11 = fromFile != null;
                        r12 = zArr3;
                    } else {
                        if (i14 == 0) {
                            File file4 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "Telegram");
                            file4.mkdirs();
                            file = new File(file4, g0.p0(0, w7.D(file3)));
                        } else if (i14 == 1) {
                            File file5 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES), "Telegram");
                            file5.mkdirs();
                            file = new File(file5, g0.p0(1, w7.D(file3)));
                        } else {
                            File file6 = new File(i14 == 2 ? Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS) : Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC), "Telegram");
                            file6.mkdirs();
                            file = new File(file6, str2);
                            if (file.exists()) {
                                int lastIndexOf = str2.lastIndexOf(46);
                                for (int i15 = 0; i15 < 10; i15++) {
                                    file = new File(file6, lastIndexOf != -1 ? str2.substring(0, lastIndexOf) + "(" + (i15 + 1) + ")" + str2.substring(lastIndexOf) : str2 + "(" + (i15 + 1) + ")");
                                    if (file.exists()) {
                                    }
                                }
                            }
                        }
                        File file7 = file;
                        if (!file7.exists()) {
                            file7.createNewFile();
                        }
                        long currentTimeMillis = System.currentTimeMillis() - 500;
                        try {
                            try {
                                fileInputStream = new FileInputStream(file3);
                                try {
                                    try {
                                        channel = fileInputStream.getChannel();
                                        try {
                                            try {
                                                channel2 = new FileOutputStream(file7).getChannel();
                                                try {
                                                    size = channel.size();
                                                    try {
                                                        if (g0.I1(null, ((Integer) FileDescriptor.class.getDeclaredMethod("getInt$", null).invoke(fileInputStream.getFD(), null)).intValue())) {
                                                            if (t1Var != null) {
                                                                g0.g3(new a(t1Var, 15));
                                                            }
                                                            if (channel2 != null) {
                                                                channel2.close();
                                                            }
                                                            channel.close();
                                                            fileInputStream.close();
                                                            return;
                                                        }
                                                    } catch (Throwable th3) {
                                                        a8.g(th3, true);
                                                    }
                                                    j3 = 0;
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    file2 = file7;
                                                }
                                            } catch (Throwable th5) {
                                                th = th5;
                                                Throwable th6 = th;
                                                if (channel != null) {
                                                    throw th6;
                                                }
                                                try {
                                                    channel.close();
                                                    throw th6;
                                                } catch (Throwable th7) {
                                                    th6.addSuppressed(th7);
                                                    throw th6;
                                                }
                                            }
                                        } catch (Throwable th8) {
                                            th = th8;
                                            file2 = file7;
                                            Throwable th62 = th;
                                            if (channel != null) {
                                            }
                                        }
                                    } catch (Throwable th9) {
                                        th = th9;
                                        th2 = th;
                                        try {
                                            fileInputStream.close();
                                            throw th2;
                                        } catch (Throwable th10) {
                                            th2.addSuppressed(th10);
                                            throw th2;
                                        }
                                    }
                                } catch (Throwable th11) {
                                    th = th11;
                                    file2 = file7;
                                    th2 = th;
                                    fileInputStream.close();
                                    throw th2;
                                }
                            } catch (Exception e11) {
                                e = e11;
                                a8.g(e, true);
                                z10 = false;
                                if (zArr2[0]) {
                                }
                                if (z10) {
                                }
                                z11 = z10;
                                fromFile = Uri.fromFile(file2);
                                r12 = zArr;
                                if (z11) {
                                    g0.g3(new fe(w10Var, fromFile, 0));
                                }
                                if (t1Var == null) {
                                }
                            }
                        } catch (Exception e12) {
                            e = e12;
                            file2 = file7;
                            a8.g(e, true);
                            z10 = false;
                            if (zArr2[0]) {
                            }
                            if (z10) {
                            }
                            z11 = z10;
                            fromFile = Uri.fromFile(file2);
                            r12 = zArr;
                            if (z11) {
                            }
                            if (t1Var == null) {
                            }
                        }
                        while (j3 < size) {
                            if (zArr2[0]) {
                                file2 = file7;
                                if (channel2 != null) {
                                    channel2.close();
                                }
                                channel.close();
                                fileInputStream.close();
                                z10 = true;
                                if (zArr2[0]) {
                                    file2.delete();
                                    z10 = false;
                                }
                                if (z10) {
                                    zArr = zArr3;
                                } else if (i14 == 2) {
                                    zArr = zArr3;
                                    ((DownloadManager) t0.b.getSystemService("download")).addCompletedDownload(file2.getName(), file2.getName(), false, str3, file2.getAbsolutePath(), file2.length(), true);
                                } else {
                                    zArr = zArr3;
                                    g0.d(file2.getAbsoluteFile());
                                }
                                z11 = z10;
                                fromFile = Uri.fromFile(file2);
                                r12 = zArr;
                            } else {
                                file2 = file7;
                                try {
                                    channel2.transferFrom(channel, j3, Math.min(4096L, size - j3));
                                    long j11 = j3;
                                    if (t1Var == null || currentTimeMillis > System.currentTimeMillis() - 500) {
                                        j10 = 4096;
                                        i7 = i13;
                                    } else {
                                        currentTimeMillis = System.currentTimeMillis();
                                        j10 = 4096;
                                        i7 = i13;
                                        g0.g3(new x0(t1Var, (int) ((j11 / size) * 100.0f), i7));
                                    }
                                    j3 = j11 + j10;
                                    i13 = i7;
                                    file7 = file2;
                                } catch (Throwable th12) {
                                    th = th12;
                                    Throwable th13 = th;
                                    if (channel2 == null) {
                                        throw th13;
                                    }
                                    try {
                                        channel2.close();
                                        throw th13;
                                    } catch (Throwable th14) {
                                        th13.addSuppressed(th14);
                                        throw th13;
                                    }
                                }
                            }
                        }
                        file2 = file7;
                        if (channel2 != null) {
                        }
                        channel.close();
                        fileInputStream.close();
                        z10 = true;
                        if (zArr2[0]) {
                        }
                        if (z10) {
                        }
                        z11 = z10;
                        fromFile = Uri.fromFile(file2);
                        r12 = zArr;
                    }
                    if (z11 && w10Var != null) {
                        g0.g3(new fe(w10Var, fromFile, 0));
                    }
                } catch (Exception e13) {
                    e = e13;
                    r12 = r12;
                    a8.g(e, true);
                    if (t1Var == null) {
                    }
                }
                if (t1Var == null) {
                    g0.g3(new be(t1Var, (boolean[]) r12, 2));
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Components.qf qfVar = (org.telegram.ui.Components.qf) r12.c;
                View view = (View) r12.d;
                ?? r15 = (FrameLayout) r12.e;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) r12.f;
                ArrayList arrayList3 = (ArrayList) r12.h;
                ArrayList arrayList4 = (ArrayList) r12.n;
                int i16 = r12.b;
                ji.g gVar2 = (ji.g) r12.r;
                qfVar.getClass();
                ChatActivityEnterView chatActivityEnterView = qfVar.a;
                bi.b1 b1Var2 = new bi.b1(chatActivityEnterView.getContext(), view, chatActivityEnterView.M4, new org.telegram.ui.Components.nf(qfVar, r15, i12));
                b1Var2.T = true;
                b1Var2.M = g0.L(ks.x3);
                b1Var2.L = 0;
                int G0 = chatActivityEnterView.G0(org.telegram.ui.ActionBar.n6.G6);
                int L = layoutParams.topMargin - g0.L(28.0f);
                int i17 = 0;
                int i18 = 0;
                while (true) {
                    float f10 = 54.0f;
                    if (i17 >= arrayList3.size()) {
                        int min = Math.min(Math.min(i18, g0.L(286.0f)), Math.max(g0.L(44.0f) * 3, L));
                        ScrollView scrollView = new ScrollView(chatActivityEnterView.getContext());
                        scrollView.setVerticalScrollBarEnabled(false);
                        scrollView.setOverScrollMode(2);
                        scrollView.setOnTouchListener(new gi.a(13));
                        LinearLayout linearLayout = new LinearLayout(chatActivityEnterView.getContext());
                        linearLayout.setOrientation(1);
                        int i19 = 0;
                        while (i19 < arrayList3.size()) {
                            ji.k kVar2 = i19 < arrayList4.size() ? (ji.k) arrayList4.get(i19) : null;
                            Context context = chatActivityEnterView.getContext();
                            CharSequence charSequence = (CharSequence) arrayList3.get(i19);
                            CharSequence charSequence2 = kVar2 != null ? kVar2.a : null;
                            ?? r26 = i19 == i16 ? i12 : 0;
                            org.telegram.ui.Components.kr krVar = ai.l0.I0;
                            ai.i0 i0Var = new ai.i0(context, charSequence, charSequence2, G0, r26);
                            ChatActivityEnterView chatActivityEnterView2 = chatActivityEnterView;
                            ji.k kVar3 = kVar2;
                            i0Var.setBackground(org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.r1(0.08f, G0), 2, -1));
                            if (kVar3 == null) {
                                i0Var.setOnClickListener(new bi.k5(b1Var2, gVar2, i19, 10));
                                arrayList2 = arrayList4;
                                i10 = i16;
                                b1Var = b1Var2;
                                arrayList = arrayList3;
                                kVar = kVar3;
                                gVar = gVar2;
                            } else {
                                i10 = i16;
                                b1Var = b1Var2;
                                arrayList = arrayList3;
                                kVar = kVar3;
                                gVar = gVar2;
                                arrayList2 = arrayList4;
                                i0Var.setOnClickListener(new fi.k5(qfVar, kVar, G0, b1Var, 3));
                            }
                            linearLayout.addView(i0Var, new LinearLayout.LayoutParams(-1, g0.L(kVar != null ? 54.0f : 44.0f)));
                            i19++;
                            arrayList3 = arrayList;
                            arrayList4 = arrayList2;
                            b1Var2 = b1Var;
                            gVar2 = gVar;
                            chatActivityEnterView = chatActivityEnterView2;
                            i12 = 1;
                            i16 = i10;
                        }
                        int i20 = i16;
                        bi.b1 b1Var3 = b1Var2;
                        scrollView.addView(linearLayout);
                        FrameLayout frameLayout = new FrameLayout(chatActivityEnterView.getContext());
                        frameLayout.addView(scrollView, new FrameLayout.LayoutParams(-1, -1));
                        b1Var3.a(frameLayout, Math.round(min / g0.p), null);
                        frameLayout.setBackground(null);
                        if (i20 > 0) {
                            scrollView.post(new jg.q(scrollView, i20, min, 11));
                        }
                        b1Var3.R = new org.telegram.ui.Components.of(1, r15);
                        r15.addView(b1Var3, new FrameLayout.LayoutParams(-1, -1));
                        b1Var3.f();
                        return;
                    }
                    if (i17 >= arrayList4.size() || arrayList4.get(i17) == null) {
                        f10 = 44.0f;
                    }
                    i18 += g0.L(f10);
                    i17++;
                }
                break;
            case 2:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) r12.c;
                org.telegram.ui.ActionBar.t1 t1Var2 = (org.telegram.ui.ActionBar.t1) r12.f;
                TLObject tLObject = (TLObject) r12.h;
                int i21 = r12.b;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) r12.n;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) r12.r;
                String str4 = (String) r12.d;
                String str5 = (String) r12.e;
                ArrayList arrayList5 = ExternalActionActivity.y;
                try {
                    t1Var2.dismiss();
                } catch (Exception e14) {
                    a8.g(e14, true);
                }
                if (tLObject != null) {
                    mp.u1(i21).f4(authorizationform.users, false);
                    fk0 fk0Var = new fk0(5, getauthorizationform.bot_id, getauthorizationform.scope, getauthorizationform.public_key, str4, str5, (String) null, authorizationform, (TL_account.Password) tLObject);
                    fk0Var.D1 = true;
                    if (g0.Q1()) {
                        externalActionActivity.d.c(-1, fk0Var);
                    } else {
                        externalActionActivity.c.c(-1, fk0Var);
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
            case 3:
                TLObject tLObject2 = (TLObject) r12.c;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) r12.d;
                TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription = (TLRPC.TL_inputStorePaymentPremiumSubscription) r12.e;
                ws0 ws0Var = (ws0) r12.f;
                com.google.android.gms.internal.clearcut.y0 y0Var = (com.google.android.gms.internal.clearcut.y0) r12.h;
                int i22 = r12.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) r12.n;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) r12.r;
                if (!(tLObject2 instanceof TLRPC.TL_boolTrue)) {
                    org.telegram.ui.Components.b5.c0(i22, tL_error, g2Var, tL_payments_canPurchaseStore, new Object[0]);
                    return;
                }
                Activity parentActivity = g2Var != null ? g2Var.getParentActivity() : g0.u0();
                r1 i23 = r1.i();
                c accountInstance = g2Var.getAccountInstance();
                wf.b bVar = new wf.b(17, z12);
                bVar.R(r1.l);
                ws0Var.a();
                String str6 = ws0Var.g.a;
                if (TextUtils.isEmpty(str6)) {
                    throw new IllegalArgumentException("offerToken can not be empty");
                }
                bVar.c = str6;
                i23.m(parentActivity, accountInstance, tL_inputStorePaymentPremiumSubscription, Collections.singletonList(bVar.q()), y0Var, false);
                return;
            case 4:
                org.telegram.ui.Wallet.s0 s0Var = (org.telegram.ui.Wallet.s0) r12.c;
                String str7 = (String) r12.d;
                byte[] bArr2 = (byte[]) r12.f;
                JSONObject jSONObject2 = (JSONObject) r12.h;
                String str8 = (String) r12.e;
                int i24 = r12.b;
                org.telegram.ui.Wallet.z2 z2Var = (org.telegram.ui.Wallet.z2) r12.n;
                org.telegram.ui.Wallet.v0 v0Var = (org.telegram.ui.Wallet.v0) r12.r;
                try {
                    try {
                        jSONObject = WalletEngine2.signData(s0Var, org.telegram.ui.Wallet.a3.e(), str7, bArr2, jSONObject2, str8, i24);
                    } catch (Exception e15) {
                        e = e15;
                        jSONObject = null;
                    }
                    try {
                        byte[] f11 = org.telegram.ui.Wallet.a3.f(s0Var, str7, bArr2);
                        s0Var.close();
                        bArr = f11;
                        str = null;
                    } catch (Exception e16) {
                        e = e16;
                        String i25 = org.telegram.ui.Wallet.m2.i("widget sign data", e);
                        s0Var.close();
                        str = i25;
                        bArr = null;
                        g0.g3(new di.m6(jSONObject, str, z2Var, v0Var, str7, bArr2, bArr));
                        return;
                    }
                    g0.g3(new di.m6(jSONObject, str, z2Var, v0Var, str7, bArr2, bArr));
                    return;
                } catch (Throwable th15) {
                    s0Var.close();
                    throw th15;
                }
            default:
                Runnable[] runnableArr = (Runnable[]) r12.c;
                TextView[] textViewArr = (TextView[]) r12.d;
                int i26 = r12.b;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) r12.e;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) r12.f;
                String[] strArr2 = (String[]) r12.n;
                boolean[] zArr4 = (boolean[]) r12.h;
                byte[] bArr3 = (byte[]) r12.r;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                }
                di.j0 j0Var = new di.j0(runnableArr, textViewArr, i26, i6Var, 9);
                org.telegram.ui.Wallet.v0 D = org.telegram.ui.Wallet.v0.D(i26);
                TL_wallet.nftItem nftitem = wallettransaction.nft;
                if (nftitem != null) {
                    org.telegram.ui.Wallet.j0 j0Var2 = new org.telegram.ui.Wallet.j0(D, wallettransaction.peer.address, nftitem, strArr2[0], j0Var);
                    D.x0(j0Var2);
                    m10 = new org.telegram.ui.Wallet.m(j0Var2, i11);
                } else {
                    m10 = D.m(wallettransaction.peer.address, wallettransaction.amount, strArr2[0], zArr4[0] ? bArr3 : null, j0Var);
                }
                runnableArr[0] = m10;
                return;
        }
    }

    public /* synthetic */ ce(TLObject tLObject, org.telegram.ui.ActionBar.g2 g2Var, TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription, ws0 ws0Var, com.google.android.gms.internal.clearcut.y0 y0Var, int i7, TLRPC.TL_error tL_error, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.c = tLObject;
        this.d = g2Var;
        this.e = tL_inputStorePaymentPremiumSubscription;
        this.f = ws0Var;
        this.h = y0Var;
        this.b = i7;
        this.n = tL_error;
        this.r = tL_payments_canPurchaseStore;
    }

    public /* synthetic */ ce(org.telegram.ui.Components.qf qfVar, View view, FrameLayout frameLayout, FrameLayout.LayoutParams layoutParams, ArrayList arrayList, ArrayList arrayList2, int i7, ji.g gVar) {
        this.c = qfVar;
        this.d = view;
        this.e = frameLayout;
        this.f = layoutParams;
        this.h = arrayList;
        this.n = arrayList2;
        this.b = i7;
        this.r = gVar;
    }

    public /* synthetic */ ce(ExternalActionActivity externalActionActivity, org.telegram.ui.ActionBar.t1 t1Var, TLObject tLObject, int i7, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2) {
        this.c = externalActionActivity;
        this.f = t1Var;
        this.h = tLObject;
        this.b = i7;
        this.n = authorizationform;
        this.r = getauthorizationform;
        this.d = str;
        this.e = str2;
    }

    public /* synthetic */ ce(org.telegram.ui.Wallet.s0 s0Var, String str, byte[] bArr, JSONObject jSONObject, String str2, int i7, org.telegram.ui.Wallet.z2 z2Var, org.telegram.ui.Wallet.v0 v0Var) {
        this.c = s0Var;
        this.d = str;
        this.f = bArr;
        this.h = jSONObject;
        this.e = str2;
        this.b = i7;
        this.n = z2Var;
        this.r = v0Var;
    }

    public /* synthetic */ ce(Runnable[] runnableArr, TextView[] textViewArr, int i7, org.telegram.ui.ActionBar.i6 i6Var, TL_wallet.walletTransaction wallettransaction, String[] strArr, boolean[] zArr, byte[] bArr) {
        this.c = runnableArr;
        this.d = textViewArr;
        this.b = i7;
        this.e = i6Var;
        this.f = wallettransaction;
        this.n = strArr;
        this.h = zArr;
        this.r = bArr;
    }
}
