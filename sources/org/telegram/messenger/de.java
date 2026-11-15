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
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.ek0;
import org.telegram.ui.ts0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class de implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ de(int i7, File file, String str, org.telegram.ui.ActionBar.t1 t1Var, boolean[] zArr, String str2, z10 z10Var, boolean[] zArr2) {
        this.a = 0;
        this.b = i7;
        this.c = file;
        this.d = str;
        this.f = t1Var;
        this.h = zArr;
        this.e = str2;
        this.r = z10Var;
        this.n = zArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0599 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0517 A[Catch: all -> 0x051b, TRY_ENTER, TRY_LEAVE, TryCatch #13 {all -> 0x051b, blocks: (B:170:0x0535, B:169:0x0532, B:175:0x0517, B:165:0x052d), top: B:124:0x045c, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0553 A[Catch: Exception -> 0x0379, TryCatch #11 {Exception -> 0x0379, blocks: (B:95:0x0366, B:98:0x036c, B:113:0x0382, B:115:0x0443, B:117:0x0449, B:118:0x044c, B:180:0x054f, B:182:0x0553, B:186:0x055c, B:226:0x054a, B:230:0x03a4, B:233:0x03c4, B:234:0x03d1, B:236:0x03e4, B:242:0x03f6, B:243:0x0431, B:245:0x043e, B:248:0x041a, B:250:0x03cb), top: B:94:0x0366 }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0538 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:209:? A[Catch: all -> 0x0529, SYNTHETIC, TRY_LEAVE, TryCatch #3 {all -> 0x0529, blocks: (B:176:0x051d, B:208:0x0540, B:207:0x053d, B:203:0x0538), top: B:122:0x0458, inners: #15 }] */
    /* JADX WARN: Type inference failed for: r11v3, types: [android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r1v0, types: [org.telegram.messenger.de] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean[]] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.view.View, bi.x0, java.lang.Object] */
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
        long j3;
        int i7;
        JSONObject jSONObject;
        String str;
        byte[] bArr;
        org.telegram.ui.Wallet.l i10;
        ?? r12 = this;
        boolean z12 = true;
        boolean z13 = true;
        boolean z14 = false;
        boolean z15 = false;
        switch (r12.a) {
            case 0:
                int i11 = 3;
                int i12 = r12.b;
                File file3 = (File) r12.c;
                String str2 = (String) r12.d;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) r12.f;
                boolean[] zArr2 = (boolean[]) r12.h;
                String str3 = (String) r12.e;
                z10 z10Var = (z10) r12.r;
                boolean[] zArr3 = (boolean[]) r12.n;
                String[] strArr = MediaController.W1;
                try {
                } catch (Exception e10) {
                    e = e10;
                    r12 = zArr3;
                }
                try {
                    if (Build.VERSION.SDK_INT >= 29) {
                        fromFile = MediaController.f0(i12, file3, null);
                        z11 = fromFile != null;
                        r12 = zArr3;
                    } else {
                        if (i12 == 0) {
                            File file4 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "Telegram");
                            file4.mkdirs();
                            file = new File(file4, g0.p0(0, w7.D(file3)));
                        } else if (i12 == 1) {
                            File file5 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES), "Telegram");
                            file5.mkdirs();
                            file = new File(file5, g0.p0(1, w7.D(file3)));
                        } else {
                            File file6 = new File(i12 == 2 ? Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS) : Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC), "Telegram");
                            file6.mkdirs();
                            file = new File(file6, str2);
                            if (file.exists()) {
                                int lastIndexOf = str2.lastIndexOf(46);
                                for (int i13 = 0; i13 < 10; i13++) {
                                    file = new File(file6, lastIndexOf != -1 ? str2.substring(0, lastIndexOf) + "(" + (i13 + 1) + ")" + str2.substring(lastIndexOf) : str2 + "(" + (i13 + 1) + ")");
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
                                    } catch (Throwable th3) {
                                        th = th3;
                                        th2 = th;
                                        try {
                                            fileInputStream.close();
                                            throw th2;
                                        } catch (Throwable th4) {
                                            th2.addSuppressed(th4);
                                            throw th2;
                                        }
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    file2 = file7;
                                    th2 = th;
                                    fileInputStream.close();
                                    throw th2;
                                }
                            } catch (Exception e11) {
                                e = e11;
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
                                    g0.h3(new ge(z10Var, fromFile, 0));
                                }
                                if (t1Var == null) {
                                }
                            }
                        } catch (Exception e12) {
                            e = e12;
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
                        try {
                            try {
                                FileChannel channel2 = new FileOutputStream(file7).getChannel();
                                try {
                                    long size = channel.size();
                                    try {
                                        if (g0.I1(null, ((Integer) FileDescriptor.class.getDeclaredMethod("getInt$", null).invoke(fileInputStream.getFD(), null)).intValue())) {
                                            if (t1Var != null) {
                                                g0.h3(new a(t1Var, 15));
                                            }
                                            if (channel2 != null) {
                                                channel2.close();
                                            }
                                            channel.close();
                                            fileInputStream.close();
                                            return;
                                        }
                                    } catch (Throwable th6) {
                                        a8.g(th6, true);
                                    }
                                    long j10 = 0;
                                    while (j10 < size) {
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
                                            } else if (i12 == 2) {
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
                                                channel2.transferFrom(channel, j10, Math.min(4096L, size - j10));
                                                long j11 = j10;
                                                if (t1Var == null || currentTimeMillis > System.currentTimeMillis() - 500) {
                                                    j3 = 4096;
                                                    i7 = i11;
                                                } else {
                                                    currentTimeMillis = System.currentTimeMillis();
                                                    j3 = 4096;
                                                    i7 = i11;
                                                    g0.h3(new x0(t1Var, (int) ((j11 / size) * 100.0f), i7));
                                                }
                                                j10 = j11 + j3;
                                                i11 = i7;
                                                file7 = file2;
                                            } catch (Throwable th7) {
                                                th = th7;
                                                Throwable th8 = th;
                                                if (channel2 == null) {
                                                    throw th8;
                                                }
                                                try {
                                                    channel2.close();
                                                    throw th8;
                                                } catch (Throwable th9) {
                                                    th8.addSuppressed(th9);
                                                    throw th8;
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
                                } catch (Throwable th10) {
                                    th = th10;
                                    file2 = file7;
                                }
                            } catch (Throwable th11) {
                                th = th11;
                                Throwable th12 = th;
                                if (channel != null) {
                                    throw th12;
                                }
                                try {
                                    channel.close();
                                    throw th12;
                                } catch (Throwable th13) {
                                    th12.addSuppressed(th13);
                                    throw th12;
                                }
                            }
                        } catch (Throwable th14) {
                            th = th14;
                            file2 = file7;
                            Throwable th122 = th;
                            if (channel != null) {
                            }
                        }
                    }
                    if (z11 && z10Var != null) {
                        g0.h3(new ge(z10Var, fromFile, 0));
                    }
                } catch (Exception e13) {
                    e = e13;
                    r12 = r12;
                    a8.g(e, true);
                    if (t1Var == null) {
                    }
                }
                if (t1Var == null) {
                    g0.h3(new ce(t1Var, (boolean[]) r12, 2));
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Components.gf gfVar = (org.telegram.ui.Components.gf) r12.c;
                View view = (View) r12.d;
                ?? r11 = (FrameLayout) r12.e;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) r12.f;
                ArrayList arrayList = (ArrayList) r12.h;
                int i14 = r12.b;
                ji.g gVar = (ji.g) r12.n;
                ji.f fVar = (ji.f) r12.r;
                gfVar.getClass();
                ChatActivityEnterView chatActivityEnterView = gfVar.a;
                ?? x0Var = new bi.x0(chatActivityEnterView.getContext(), view, chatActivityEnterView.E4, new org.telegram.ui.Components.ef(gfVar, r11, z15 ? 1 : 0));
                x0Var.R = true;
                x0Var.K = g0.L(ns.x3);
                x0Var.J = 0;
                int u02 = chatActivityEnterView.u0(org.telegram.ui.ActionBar.j6.G6);
                int min = Math.min(Math.min(g0.L(44.0f) * arrayList.size(), g0.L(286.0f)), Math.max(g0.L(44.0f) * 3, layoutParams.topMargin - g0.L(92.0f)));
                ScrollView scrollView = new ScrollView(chatActivityEnterView.getContext());
                scrollView.setVerticalScrollBarEnabled(false);
                scrollView.setOverScrollMode(2);
                scrollView.setOnTouchListener(new gi.a(13));
                LinearLayout linearLayout = new LinearLayout(chatActivityEnterView.getContext());
                linearLayout.setOrientation(1);
                int i15 = 0;
                while (i15 < arrayList.size()) {
                    Context context = chatActivityEnterView.getContext();
                    CharSequence charSequence = (CharSequence) arrayList.get(i15);
                    if (i15 != i14) {
                        z12 = false;
                    }
                    org.telegram.ui.Components.er erVar = ai.m0.H0;
                    ArrayList arrayList2 = arrayList;
                    ai.k0 k0Var = new ai.k0(context, charSequence, u02, z12);
                    k0Var.setBackground(org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.r1(0.08f, u02), 2, -1));
                    k0Var.setOnClickListener(new bi.x2((Object) x0Var, gVar, i15, 10));
                    linearLayout.addView(k0Var, new LinearLayout.LayoutParams(-1, g0.L(44.0f)));
                    i15++;
                    arrayList = arrayList2;
                    z12 = true;
                }
                scrollView.addView(linearLayout);
                FrameLayout frameLayout = new FrameLayout(chatActivityEnterView.getContext());
                frameLayout.addView(scrollView, new FrameLayout.LayoutParams(-1, -1));
                x0Var.a(frameLayout, Math.round(min / g0.p), null);
                frameLayout.setBackground(null);
                View view2 = new View(x0Var.getContext());
                view2.setBackgroundColor(org.telegram.ui.ActionBar.j6.r1(0.06f, x0Var.I));
                x0Var.d.addView(view2, c8.ja.o(-1, 8));
                if (i14 > 0) {
                    scrollView.post(new jg.q(scrollView, i14, min, 11));
                }
                org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, chatActivityEnterView.getContext(), chatActivityEnterView.E4, false, false);
                z0Var.j("Settings", R.drawable.msg_settings, null);
                z0Var.d(u02, u02);
                x0Var.a(z0Var, 44, fVar);
                x0Var.P = new org.telegram.ui.Components.df(1, r11);
                r11.addView(x0Var, new FrameLayout.LayoutParams(-1, -1));
                x0Var.f();
                return;
            case 2:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) r12.c;
                org.telegram.ui.ActionBar.t1 t1Var2 = (org.telegram.ui.ActionBar.t1) r12.f;
                TLObject tLObject = (TLObject) r12.h;
                int i16 = r12.b;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) r12.n;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) r12.r;
                String str4 = (String) r12.d;
                String str5 = (String) r12.e;
                ArrayList arrayList3 = ExternalActionActivity.y;
                try {
                    t1Var2.dismiss();
                } catch (Exception e14) {
                    a8.g(e14, true);
                }
                if (tLObject != null) {
                    np.s1(i16).Y3(authorizationform.users, false);
                    ek0 ek0Var = new ek0(5, getauthorizationform.bot_id, getauthorizationform.scope, getauthorizationform.public_key, str4, str5, (String) null, authorizationform, (TL_account.Password) tLObject);
                    ek0Var.D1 = true;
                    if (g0.Q1()) {
                        externalActionActivity.d.c(-1, ek0Var);
                    } else {
                        externalActionActivity.c.c(-1, ek0Var);
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
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) r12.d;
                TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription = (TLRPC.TL_inputStorePaymentPremiumSubscription) r12.e;
                ts0 ts0Var = (ts0) r12.f;
                com.google.android.gms.internal.clearcut.y0 y0Var = (com.google.android.gms.internal.clearcut.y0) r12.h;
                int i17 = r12.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) r12.n;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) r12.r;
                if (!(tLObject2 instanceof TLRPC.TL_boolTrue)) {
                    org.telegram.ui.Components.t4.c0(i17, tL_error, e2Var, tL_payments_canPurchaseStore, new Object[0]);
                    return;
                }
                Activity parentActivity = e2Var != null ? e2Var.getParentActivity() : g0.u0();
                r1 i18 = r1.i();
                c accountInstance = e2Var.getAccountInstance();
                wf.b bVar = new wf.b(17, z14);
                bVar.R(r1.l);
                ts0Var.a();
                String str6 = ts0Var.g.a;
                if (TextUtils.isEmpty(str6)) {
                    throw new IllegalArgumentException("offerToken can not be empty");
                }
                bVar.c = str6;
                i18.m(parentActivity, accountInstance, tL_inputStorePaymentPremiumSubscription, Collections.singletonList(bVar.p()), y0Var, false);
                return;
            case 4:
                org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) r12.c;
                String str7 = (String) r12.d;
                byte[] bArr2 = (byte[]) r12.f;
                JSONObject jSONObject2 = (JSONObject) r12.h;
                String str8 = (String) r12.e;
                int i19 = r12.b;
                org.telegram.ui.Wallet.r2 r2Var = (org.telegram.ui.Wallet.r2) r12.n;
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) r12.r;
                try {
                    try {
                        try {
                            jSONObject = WalletEngine2.signData(i0Var, org.telegram.ui.Wallet.s2.e(), str7, bArr2, jSONObject2, str8, i19);
                            bArr2 = bArr2;
                        } catch (Exception e15) {
                            e = e15;
                            bArr2 = bArr2;
                            jSONObject = null;
                            String i20 = org.telegram.ui.Wallet.d2.i("widget sign data", e);
                            i0Var.close();
                            str = i20;
                            bArr = null;
                            g0.h3(new di.j6(jSONObject, str, r2Var, l0Var, str7, bArr2, bArr));
                            return;
                        }
                        try {
                            byte[] f10 = org.telegram.ui.Wallet.s2.f(i0Var, str7, bArr2);
                            i0Var.close();
                            bArr = f10;
                            str = null;
                        } catch (Exception e16) {
                            e = e16;
                            String i202 = org.telegram.ui.Wallet.d2.i("widget sign data", e);
                            i0Var.close();
                            str = i202;
                            bArr = null;
                            g0.h3(new di.j6(jSONObject, str, r2Var, l0Var, str7, bArr2, bArr));
                            return;
                        }
                    } catch (Throwable th15) {
                        i0Var.close();
                        throw th15;
                    }
                } catch (Exception e17) {
                    e = e17;
                }
                g0.h3(new di.j6(jSONObject, str, r2Var, l0Var, str7, bArr2, bArr));
                return;
            default:
                Runnable[] runnableArr = (Runnable[]) r12.c;
                TextView[] textViewArr = (TextView[]) r12.d;
                int i21 = r12.b;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) r12.e;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) r12.f;
                String[] strArr2 = (String[]) r12.n;
                boolean[] zArr4 = (boolean[]) r12.h;
                byte[] bArr3 = (byte[]) r12.r;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                }
                di.k0 k0Var2 = new di.k0(runnableArr, textViewArr, i21, e6Var, 9);
                org.telegram.ui.Wallet.l0 x10 = org.telegram.ui.Wallet.l0.x(i21);
                TL_wallet.nftItem nftitem = wallettransaction.nft;
                if (nftitem != null) {
                    org.telegram.ui.Wallet.b0 b0Var = new org.telegram.ui.Wallet.b0(x10, wallettransaction.peer.address, nftitem, strArr2[0], k0Var2);
                    x10.m0(b0Var);
                    i10 = new org.telegram.ui.Wallet.l(b0Var, z13 ? 1 : 0);
                } else {
                    i10 = x10.i(wallettransaction.peer.address, wallettransaction.amount, strArr2[0], zArr4[0] ? bArr3 : null, k0Var2);
                }
                runnableArr[0] = i10;
                return;
        }
    }

    public /* synthetic */ de(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7, Object obj6, Object obj7, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.h = obj5;
        this.b = i7;
        this.n = obj6;
        this.r = obj7;
    }

    public /* synthetic */ de(ExternalActionActivity externalActionActivity, org.telegram.ui.ActionBar.t1 t1Var, TLObject tLObject, int i7, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2) {
        this.a = 2;
        this.c = externalActionActivity;
        this.f = t1Var;
        this.h = tLObject;
        this.b = i7;
        this.n = authorizationform;
        this.r = getauthorizationform;
        this.d = str;
        this.e = str2;
    }

    public /* synthetic */ de(org.telegram.ui.Wallet.i0 i0Var, String str, byte[] bArr, JSONObject jSONObject, String str2, int i7, org.telegram.ui.Wallet.r2 r2Var, org.telegram.ui.Wallet.l0 l0Var) {
        this.a = 4;
        this.c = i0Var;
        this.d = str;
        this.f = bArr;
        this.h = jSONObject;
        this.e = str2;
        this.b = i7;
        this.n = r2Var;
        this.r = l0Var;
    }

    public /* synthetic */ de(Runnable[] runnableArr, TextView[] textViewArr, int i7, org.telegram.ui.ActionBar.e6 e6Var, TL_wallet.walletTransaction wallettransaction, String[] strArr, boolean[] zArr, byte[] bArr) {
        this.a = 5;
        this.c = runnableArr;
        this.d = textViewArr;
        this.b = i7;
        this.e = e6Var;
        this.f = wallettransaction;
        this.n = strArr;
        this.h = zArr;
        this.r = bArr;
    }
}
