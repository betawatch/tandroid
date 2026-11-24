// default package

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
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.c;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class bz1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ bz1(int i, File file, String str, he heVar, boolean[] zArr, String str2, qac qacVar, boolean[] zArr2) {
        this.a = (byte) 3;
        this.b = i;
        this.c = file;
        this.d = str;
        this.e = heVar;
        this.f = zArr;
        this.h = str2;
        this.n = qacVar;
        this.r = zArr2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:(1:52)(1:(1:176)(3:(1:178)(1:194)|179|(4:181|182|(5:185|(1:187)(1:192)|188|(1:190)(30:191|54|(1:56)|57|58|59|60|61|62|63|64|66|67|68|69|70|71|(6:(1:74)|(2:92|93)|77|78|79|81)|106|(3:109|(5:111|112|113|(2:120|121)(2:117|118)|119)(10:134|135|(1:137)|138|139|140|141|(1:143)|(2:145|(3:147|148|149)(1:152))(1:153)|150)|107)|155|135|(0)|138|139|140|141|(0)|(0)(0)|150)|183)|193)))|66|67|68|69|70|71|(0)|106|(1:107)|155|135|(0)|138|139|140|141|(0)|(0)(0)|150) */
    /* JADX WARN: Can't wrap try/catch for region: R(32:50|(1:52)(1:(1:176)(3:(1:178)(1:194)|179|(4:181|182|(5:185|(1:187)(1:192)|188|(1:190)(30:191|54|(1:56)|57|58|59|60|61|62|63|64|66|67|68|69|70|71|(6:(1:74)|(2:92|93)|77|78|79|81)|106|(3:109|(5:111|112|113|(2:120|121)(2:117|118)|119)(10:134|135|(1:137)|138|139|140|141|(1:143)|(2:145|(3:147|148|149)(1:152))(1:153)|150)|107)|155|135|(0)|138|139|140|141|(0)|(0)(0)|150)|183)|193)))|53|54|(0)|57|58|59|60|61|62|63|64|66|67|68|69|70|71|(0)|106|(1:107)|155|135|(0)|138|139|140|141|(0)|(0)(0)|150) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:50|(24:(1:52)(1:(1:176)(3:(1:178)(1:194)|179|(4:181|182|(5:185|(1:187)(1:192)|188|(1:190)(30:191|54|(1:56)|57|58|59|60|61|62|63|64|66|67|68|69|70|71|(6:(1:74)|(2:92|93)|77|78|79|81)|106|(3:109|(5:111|112|113|(2:120|121)(2:117|118)|119)(10:134|135|(1:137)|138|139|140|141|(1:143)|(2:145|(3:147|148|149)(1:152))(1:153)|150)|107)|155|135|(0)|138|139|140|141|(0)|(0)(0)|150)|183)|193)))|61|62|63|64|66|67|68|69|70|71|(0)|106|(1:107)|155|135|(0)|138|139|140|141|(0)|(0)(0)|150)|53|54|(0)|57|58|59|60) */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x024c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0253, code lost:
    
        fc4.g(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x02e9, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x02ea, code lost:
    
        r29 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x02ed, code lost:
    
        fc4.g(r0, true);
        r0 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x02e6, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[Catch: all -> 0x02d6, SYNTHETIC, TRY_LEAVE, TryCatch #16 {all -> 0x02d6, blocks: (B:104:0x02d5, B:103:0x02d2, B:138:0x02ad, B:99:0x02cd), top: B:61:0x01f8, inners: #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x025e A[Catch: all -> 0x02b5, TRY_LEAVE, TryCatch #15 {all -> 0x02b5, blocks: (B:67:0x0205, B:109:0x025e, B:158:0x0253), top: B:66:0x0205 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02aa A[Catch: all -> 0x02c4, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x02c4, blocks: (B:132:0x02c3, B:131:0x02c0, B:137:0x02aa, B:127:0x02bb), top: B:63:0x01fc, inners: #20 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02f6 A[Catch: Exception -> 0x034c, TryCatch #3 {Exception -> 0x034c, blocks: (B:34:0x010d, B:54:0x01e3, B:56:0x01e9, B:57:0x01ec, B:141:0x02f2, B:143:0x02f6, B:147:0x0300, B:173:0x02ed, B:179:0x0174, B:181:0x0187, B:187:0x0198, B:188:0x01d2, B:190:0x01dd, B:192:0x01bb, B:194:0x016e), top: B:33:0x010d }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x033c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01e9 A[Catch: Exception -> 0x034c, TryCatch #3 {Exception -> 0x034c, blocks: (B:34:0x010d, B:54:0x01e3, B:56:0x01e9, B:57:0x01ec, B:141:0x02f2, B:143:0x02f6, B:147:0x0300, B:173:0x02ed, B:179:0x0174, B:181:0x0187, B:187:0x0198, B:188:0x01d2, B:190:0x01dd, B:192:0x01bb, B:194:0x016e), top: B:33:0x010d }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02cd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v0, types: [android.view.View, java.lang.Object, xv4] */
    /* JADX WARN: Type inference failed for: r1v21, types: [int] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25, types: [boolean[]] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v55 */
    /* JADX WARN: Type inference failed for: r1v56 */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        dlc dlcVar;
        k7 k7Var;
        JSONObject jSONObject;
        byte[] bArr;
        boolean z;
        File file;
        String str;
        File file2;
        byte b;
        byte b2;
        boolean[] zArr;
        byte b3;
        Uri fromFile;
        FileInputStream fileInputStream;
        Throwable th;
        FileChannel channel;
        Throwable th2;
        FileChannel channel2;
        long size;
        long j;
        long j2;
        long j3;
        qn4 l;
        int i2 = -1;
        dlc dlcVar2 = null;
        byte b4 = 0;
        switch (this.a) {
            case 0:
                c cVar = (c) this.c;
                View view = (View) this.d;
                ?? r3 = (FrameLayout) this.e;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f;
                ArrayList arrayList = (ArrayList) this.h;
                ArrayList arrayList2 = (ArrayList) this.n;
                int i3 = this.b;
                zkc zkcVar = (zkc) this.r;
                cVar.getClass();
                ChatActivityEnterView chatActivityEnterView = cVar.a;
                ?? xv4Var = new xv4(chatActivityEnterView.getContext(), view, chatActivityEnterView.L4, new xy1(cVar, r3, (byte) 0));
                xv4Var.T = true;
                xv4Var.M = gm.L(220.0f);
                xv4Var.L = 0;
                int F0 = chatActivityEnterView.F0(cmb.F6);
                int L = layoutParams.topMargin - gm.L(28.0f);
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    float f = 54.0f;
                    if (i4 >= arrayList.size()) {
                        int min = Math.min(Math.min(i5, gm.L(286.0f)), Math.max(gm.L(44.0f) * 3, L));
                        ScrollView scrollView = new ScrollView(chatActivityEnterView.getContext());
                        scrollView.setVerticalScrollBarEnabled(false);
                        scrollView.setOverScrollMode(2);
                        scrollView.setOnTouchListener(new p8((byte) 29));
                        LinearLayout linearLayout = new LinearLayout(chatActivityEnterView.getContext());
                        linearLayout.setOrientation(1);
                        int i6 = 0;
                        while (i6 < arrayList.size()) {
                            dlc dlcVar3 = i6 < arrayList2.size() ? (dlc) arrayList2.get(i6) : dlcVar2;
                            Context context = chatActivityEnterView.getContext();
                            CharSequence charSequence = (CharSequence) arrayList.get(i6);
                            ?? r26 = dlcVar3 != null ? dlcVar3.a : dlcVar2;
                            boolean z2 = i6 == i3;
                            d53 d53Var = un3.I0;
                            k7 k7Var2 = new k7(context, charSequence, r26, F0, z2);
                            ArrayList arrayList3 = arrayList;
                            c cVar2 = cVar;
                            k7Var2.setBackground(cmb.f0(cmb.p1(0.08f, F0), 2, -1));
                            if (dlcVar3 == null) {
                                k7Var2.setOnClickListener(new wh((Object) xv4Var, (Object) zkcVar, i6, (byte) 4));
                                k7Var = k7Var2;
                                i = i6;
                                dlcVar = dlcVar3;
                            } else {
                                i = i6;
                                dlcVar = dlcVar3;
                                k7Var = k7Var2;
                                k7Var.setOnClickListener(new ph((Object) cVar2, (Object) dlcVar, F0, (Object) xv4Var, (byte) 3));
                            }
                            linearLayout.addView(k7Var, new LinearLayout.LayoutParams(-1, gm.L(dlcVar != null ? 54.0f : 44.0f)));
                            i6 = i + 1;
                            arrayList = arrayList3;
                            cVar = cVar2;
                            dlcVar2 = null;
                        }
                        scrollView.addView(linearLayout);
                        FrameLayout frameLayout = new FrameLayout(chatActivityEnterView.getContext());
                        frameLayout.addView(scrollView, new FrameLayout.LayoutParams(-1, -1));
                        xv4Var.a(frameLayout, Math.round(min / gm.p), null);
                        frameLayout.setBackground(null);
                        if (i3 > 0) {
                            scrollView.post(new cu((Object) scrollView, i3, min, (byte) 2));
                        }
                        xv4Var.R = new yy1(r3, (byte) 0);
                        r3.addView(xv4Var, new FrameLayout.LayoutParams(-1, -1));
                        xv4Var.f();
                        return;
                    }
                    if (i4 >= arrayList2.size() || arrayList2.get(i4) == null) {
                        f = 44.0f;
                    }
                    i5 += gm.L(f);
                    i4++;
                }
                break;
            case 1:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.c;
                he heVar = (he) this.d;
                TLObject tLObject = (TLObject) this.e;
                int i7 = this.b;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) this.f;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) this.h;
                String str2 = (String) this.n;
                String str3 = (String) this.r;
                ArrayList arrayList4 = ExternalActionActivity.y;
                try {
                    heVar.dismiss();
                } catch (Exception e) {
                    fc4.g(e, true);
                }
                if (tLObject != null) {
                    oc7.r1(i7).d4(authorizationform.users, false);
                    xz7 xz7Var = new xz7(5, getauthorizationform.bot_id, getauthorizationform.scope, getauthorizationform.public_key, str2, str3, (String) null, authorizationform, (TL_account.Password) tLObject);
                    xz7Var.D1 = true;
                    if (gm.O1()) {
                        externalActionActivity.d.b(-1, xz7Var);
                    } else {
                        externalActionActivity.c.b(-1, xz7Var);
                    }
                    if (!gm.O1()) {
                        externalActionActivity.e.setVisibility(8);
                    }
                    externalActionActivity.c.e0();
                    if (gm.O1()) {
                        externalActionActivity.d.e0();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                y25 y25Var = (y25) this.c;
                String str4 = (String) this.d;
                byte[] bArr2 = (byte[]) this.e;
                JSONObject jSONObject2 = (JSONObject) this.f;
                String str5 = (String) this.h;
                int i8 = this.b;
                j55 j55Var = (j55) this.n;
                org.telegram.ui.Wallet.c cVar3 = (org.telegram.ui.Wallet.c) this.r;
                try {
                    try {
                        jSONObject = WalletEngine2.signData(y25Var, k55.e(), str4, bArr2, jSONObject2, str5, i8);
                    } catch (Exception e2) {
                        e = e2;
                        jSONObject = null;
                    }
                    try {
                        byte[] f2 = k55.f(y25Var, str4, bArr2);
                        y25Var.close();
                        bArr = f2;
                    } catch (Exception e3) {
                        e = e3;
                        ?? h = w45.h("widget sign data", e);
                        y25Var.close();
                        bArr = null;
                        dlcVar2 = h;
                        gm.c3(new ja7((Object) jSONObject, (Object) dlcVar2, (Object) j55Var, (Object) cVar3, (Object) str4, (Object) bArr2, (Object) bArr, (byte) 11));
                        return;
                    }
                    gm.c3(new ja7((Object) jSONObject, (Object) dlcVar2, (Object) j55Var, (Object) cVar3, (Object) str4, (Object) bArr2, (Object) bArr, (byte) 11));
                    return;
                } catch (Throwable th3) {
                    y25Var.close();
                    throw th3;
                }
            case 3:
                ?? r1 = this.b;
                File file3 = (File) this.c;
                String str6 = (String) this.d;
                he heVar2 = (he) this.e;
                boolean[] zArr2 = (boolean[]) this.f;
                String str7 = (String) this.h;
                qac qacVar = (qac) this.n;
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
                            fromFile = MediaController.e0(r1, file3, null);
                            b3 = fromFile != null ? (byte) 1 : (byte) 0;
                            b = 0;
                            r1 = zArr3;
                        } else {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                if (r1 == 0) {
                                                    File file4 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "Telegram");
                                                    file4.mkdirs();
                                                    file = new File(file4, gm.p0(0, bc4.D(file3)));
                                                } else if (r1 == 1) {
                                                    File file5 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES), "Telegram");
                                                    file5.mkdirs();
                                                    file = new File(file5, gm.p0(1, bc4.D(file3)));
                                                } else {
                                                    File file6 = new File(r1 == 2 ? Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS) : Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC), "Telegram");
                                                    file6.mkdirs();
                                                    file = new File(file6, str6);
                                                    if (file.exists()) {
                                                        int lastIndexOf = str6.lastIndexOf(46);
                                                        int i9 = 0;
                                                        while (i9 < 10) {
                                                            if (lastIndexOf != i2) {
                                                                str = str6.substring(0, lastIndexOf) + "(" + (i9 + 1) + ")" + str6.substring(lastIndexOf);
                                                            } else {
                                                                str = str6 + "(" + (i9 + 1) + ")";
                                                            }
                                                            file2 = new File(file6, str);
                                                            if (file2.exists()) {
                                                                i9++;
                                                                file = file2;
                                                                i2 = -1;
                                                            } else {
                                                                if (!file2.exists()) {
                                                                    file2.createNewFile();
                                                                }
                                                                long currentTimeMillis = System.currentTimeMillis() - 500;
                                                                fileInputStream = new FileInputStream(file3);
                                                                channel = fileInputStream.getChannel();
                                                                channel2 = new FileOutputStream(file2).getChannel();
                                                                size = channel.size();
                                                                if (gm.G1(null, ((Integer) FileDescriptor.class.getDeclaredMethod("getInt$", null).invoke(fileInputStream.getFD(), null)).intValue())) {
                                                                    if (heVar2 != null) {
                                                                        gm.c3(new td(heVar2, (byte) 5));
                                                                    }
                                                                    if (channel2 != null) {
                                                                        try {
                                                                            channel2.close();
                                                                        } catch (Throwable th4) {
                                                                            th2 = th4;
                                                                            b = 0;
                                                                            if (channel == null) {
                                                                            }
                                                                        }
                                                                    }
                                                                    try {
                                                                        channel.close();
                                                                        fileInputStream.close();
                                                                        return;
                                                                    } catch (Throwable th5) {
                                                                        th = th5;
                                                                        b = 0;
                                                                        try {
                                                                            fileInputStream.close();
                                                                            throw th;
                                                                        } catch (Throwable th6) {
                                                                            th.addSuppressed(th6);
                                                                            throw th;
                                                                        }
                                                                    }
                                                                }
                                                                j = 0;
                                                                while (j < size) {
                                                                    if (zArr2[b4]) {
                                                                        b = b4;
                                                                        if (channel2 != null) {
                                                                            channel2.close();
                                                                        }
                                                                        channel.close();
                                                                        fileInputStream.close();
                                                                        b2 = 1;
                                                                        if (zArr2[b]) {
                                                                            file2.delete();
                                                                            b2 = b;
                                                                        }
                                                                        if (b2 == 0) {
                                                                            zArr = zArr3;
                                                                        } else if (r1 == 2) {
                                                                            zArr = zArr3;
                                                                            ((DownloadManager) a.b.getSystemService("download")).addCompletedDownload(file2.getName(), file2.getName(), false, str7, file2.getAbsolutePath(), file2.length(), true);
                                                                        } else {
                                                                            zArr = zArr3;
                                                                            gm.d(file2.getAbsoluteFile());
                                                                        }
                                                                        b3 = b2;
                                                                        fromFile = Uri.fromFile(file2);
                                                                        r1 = zArr;
                                                                    } else {
                                                                        b = b4;
                                                                        long j4 = size;
                                                                        try {
                                                                            channel2.transferFrom(channel, j, Math.min(4096L, size - j));
                                                                            long j5 = j;
                                                                            if (heVar2 == null || currentTimeMillis > System.currentTimeMillis() - 500) {
                                                                                j2 = 4096;
                                                                                j3 = j4;
                                                                            } else {
                                                                                currentTimeMillis = System.currentTimeMillis();
                                                                                j2 = 4096;
                                                                                j3 = j4;
                                                                                gm.c3(new bm3((Object) heVar2, (int) ((j5 / j3) * 100.0f), (byte) 21));
                                                                            }
                                                                            j = j5 + j2;
                                                                            size = j3;
                                                                            b4 = b;
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
                                                                b = b4;
                                                                if (channel2 != null) {
                                                                }
                                                                channel.close();
                                                                fileInputStream.close();
                                                                b2 = 1;
                                                                if (zArr2[b]) {
                                                                }
                                                                if (b2 == 0) {
                                                                }
                                                                b3 = b2;
                                                                fromFile = Uri.fromFile(file2);
                                                                r1 = zArr;
                                                            }
                                                        }
                                                    }
                                                }
                                                size = channel.size();
                                                if (gm.G1(null, ((Integer) FileDescriptor.class.getDeclaredMethod("getInt$", null).invoke(fileInputStream.getFD(), null)).intValue())) {
                                                }
                                                j = 0;
                                                while (j < size) {
                                                }
                                                b = b4;
                                                if (channel2 != null) {
                                                }
                                                channel.close();
                                                fileInputStream.close();
                                                b2 = 1;
                                                if (zArr2[b]) {
                                                }
                                                if (b2 == 0) {
                                                }
                                                b3 = b2;
                                                fromFile = Uri.fromFile(file2);
                                                r1 = zArr;
                                            } catch (Throwable th10) {
                                                th = th10;
                                                b = b4;
                                            }
                                            channel2 = new FileOutputStream(file2).getChannel();
                                        } catch (Throwable th11) {
                                            th = th11;
                                            th2 = th;
                                            if (channel == null) {
                                                throw th2;
                                            }
                                            try {
                                                channel.close();
                                                throw th2;
                                            } catch (Throwable th12) {
                                                th2.addSuppressed(th12);
                                                throw th2;
                                            }
                                        }
                                    } catch (Throwable th13) {
                                        th = th13;
                                        b = 0;
                                        th2 = th;
                                        if (channel == null) {
                                        }
                                    }
                                    channel = fileInputStream.getChannel();
                                } catch (Throwable th14) {
                                    th = th14;
                                    th = th;
                                    fileInputStream.close();
                                    throw th;
                                }
                            } catch (Throwable th15) {
                                th = th15;
                                b = 0;
                                th = th;
                                fileInputStream.close();
                                throw th;
                            }
                            file2 = file;
                            if (!file2.exists()) {
                            }
                            long currentTimeMillis2 = System.currentTimeMillis() - 500;
                            fileInputStream = new FileInputStream(file3);
                        }
                        if (b3 != 0 && qacVar != null) {
                            gm.c3(new jn6(qacVar, fromFile, b));
                        }
                    } catch (Exception e5) {
                        e = e5;
                        z = true;
                        r1 = r1;
                        fc4.g(e, z);
                        if (heVar2 != null) {
                        }
                    }
                } catch (Exception e6) {
                    e = e6;
                    z = true;
                    r1 = zArr3;
                    fc4.g(e, z);
                    if (heVar2 != null) {
                    }
                }
                if (heVar2 != null) {
                    gm.c3(new gn6(heVar2, (boolean[]) r1, (byte) 2));
                    return;
                }
                return;
            case 4:
                TLObject tLObject2 = (TLObject) this.c;
                d dVar = (d) this.d;
                TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription = (TLRPC.TL_inputStorePaymentPremiumSubscription) this.e;
                ik8 ik8Var = (ik8) this.f;
                ohd ohdVar = (ohd) this.h;
                int i10 = this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.n;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) this.r;
                if (!(tLObject2 instanceof TLRPC.TL_boolTrue)) {
                    ik.c0(i10, tL_error, dVar, tL_payments_canPurchaseStore, new Object[0]);
                    return;
                }
                Activity parentActivity = dVar != null ? dVar.getParentActivity() : gm.u0();
                cj0 h2 = cj0.h();
                j5 accountInstance = dVar.getAccountInstance();
                hi2 hi2Var = new hi2((byte) 9, false);
                hi2Var.T(cj0.l);
                ik8Var.a();
                String str8 = ik8Var.g.a;
                if (TextUtils.isEmpty(str8)) {
                    u36.j("offerToken can not be empty");
                    return;
                } else {
                    hi2Var.c = str8;
                    h2.l(parentActivity, accountInstance, tL_inputStorePaymentPremiumSubscription, Collections.singletonList(hi2Var.c()), ohdVar, false);
                    return;
                }
            default:
                Runnable[] runnableArr = (Runnable[]) this.c;
                TextView[] textViewArr = (TextView[]) this.d;
                int i11 = this.b;
                ylb ylbVar = (ylb) this.e;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) this.f;
                String[] strArr2 = (String[]) this.h;
                boolean[] zArr4 = (boolean[]) this.n;
                byte[] bArr3 = (byte[]) this.r;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                }
                e eVar = new e((Object) runnableArr, (Object) textViewArr, i11, (Object) ylbVar, (byte) 10);
                org.telegram.ui.Wallet.c C = org.telegram.ui.Wallet.c.C(i11);
                TL_wallet.nftItem nftitem = wallettransaction.nft;
                TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction.peer;
                if (nftitem != null) {
                    q25 q25Var = new q25(C, walletTransactionPeer.address, nftitem, strArr2[0], eVar);
                    C.x0(q25Var);
                    l = new qn4(q25Var, (byte) 15);
                } else {
                    l = C.l(walletTransactionPeer.address, wallettransaction.amount, strArr2[0], zArr4[0] ? bArr3 : null, eVar);
                }
                runnableArr[0] = l;
                return;
        }
    }

    public /* synthetic */ bz1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, Object obj6, Object obj7, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.h = obj5;
        this.b = i;
        this.n = obj6;
        this.r = obj7;
    }

    public /* synthetic */ bz1(c cVar, View view, FrameLayout frameLayout, FrameLayout.LayoutParams layoutParams, ArrayList arrayList, ArrayList arrayList2, int i, zkc zkcVar) {
        this.a = (byte) 0;
        this.c = cVar;
        this.d = view;
        this.e = frameLayout;
        this.f = layoutParams;
        this.h = arrayList;
        this.n = arrayList2;
        this.b = i;
        this.r = zkcVar;
    }

    public /* synthetic */ bz1(ExternalActionActivity externalActionActivity, he heVar, TLObject tLObject, int i, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2) {
        this.a = (byte) 1;
        this.c = externalActionActivity;
        this.d = heVar;
        this.e = tLObject;
        this.b = i;
        this.f = authorizationform;
        this.h = getauthorizationform;
        this.n = str;
        this.r = str2;
    }

    public /* synthetic */ bz1(Runnable[] runnableArr, TextView[] textViewArr, int i, ylb ylbVar, TL_wallet.walletTransaction wallettransaction, String[] strArr, boolean[] zArr, byte[] bArr) {
        this.a = (byte) 5;
        this.c = runnableArr;
        this.d = textViewArr;
        this.b = i;
        this.e = ylbVar;
        this.f = wallettransaction;
        this.h = strArr;
        this.n = zArr;
        this.r = bArr;
    }
}
