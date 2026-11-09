package org.telegram.messenger;

import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final /* synthetic */ class bf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cf b;

    public /* synthetic */ bf(cf cfVar, int i7) {
        this.a = i7;
        this.b = cfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z9;
        File file;
        File file2;
        switch (this.a) {
            case 0:
                cf cfVar = this.b;
                cfVar.s.a(cfVar.n);
                break;
            case 1:
                cf cfVar2 = this.b;
                if (!cfVar2.h) {
                    cfVar2.b.show();
                    break;
                }
                break;
            case 2:
                cf cfVar3 = this.b;
                boolean z10 = cfVar3.w;
                c cVar = cfVar3.a;
                ArrayList arrayList = cfVar3.c;
                try {
                    try {
                        if (Build.VERSION.SDK_INT >= 29) {
                            int size = arrayList.size();
                            for (int i7 = 0; i7 < size; i7++) {
                                ij ijVar = (ij) arrayList.get(i7);
                                if (!cfVar3.b(ijVar)) {
                                    String str = ijVar.k.attachPath;
                                    TLRPC.Document F0 = ijVar.F0();
                                    TLRPC.Document document = ijVar.d3;
                                    if (document != null) {
                                        str = null;
                                        F0 = document;
                                    }
                                    String B = w7.B(F0);
                                    if (str != null && str.length() > 0 && !new File(str).exists()) {
                                        str = null;
                                    }
                                    if (TextUtils.isEmpty(str)) {
                                        w7.G(cVar.a);
                                        TLRPC.MessageMedia m12 = ij.m1(ijVar);
                                        TLRPC.Document document2 = ijVar.d3;
                                        if (document2 != null) {
                                            file2 = w7.J(document2, null, false, true);
                                        } else {
                                            File M = w7.M(ijVar.k, false, true);
                                            if (m12 instanceof TLRPC.TL_messageMediaDocument) {
                                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) m12;
                                                if (!tL_messageMediaDocument.alt_documents.isEmpty()) {
                                                    file2 = w7.J(tL_messageMediaDocument.alt_documents.get(0), null, false, true);
                                                }
                                            }
                                            file2 = M;
                                        }
                                        str = file2.toString();
                                    }
                                    File file3 = new File(str);
                                    if (!file3.exists()) {
                                        cfVar3.r = new CountDownLatch(1);
                                        g0.h3(new x4(26, cfVar3, ijVar));
                                        cfVar3.r.await();
                                    }
                                    if (!cfVar3.f) {
                                        if (!file3.exists()) {
                                            w7.G(cVar.a);
                                            file3 = w7.J(ijVar.k, null, true, true);
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append("saving file: correcting path from ");
                                            sb2.append(str);
                                            sb2.append(" to ");
                                            sb2.append(file3 == null ? null : file3.getAbsolutePath());
                                            a8.b(sb2.toString());
                                        }
                                        if (file3 != null && file3.exists()) {
                                            MediaController.f0(z10 ? 3 : 2, file3, B);
                                            cfVar3.n++;
                                        }
                                    }
                                }
                            }
                        } else {
                            File externalStoragePublicDirectory = z10 ? Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC) : Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                            externalStoragePublicDirectory.mkdir();
                            int size2 = arrayList.size();
                            for (int i10 = 0; i10 < size2; i10++) {
                                ij ijVar2 = (ij) arrayList.get(i10);
                                if (!cfVar3.b(ijVar2)) {
                                    TLRPC.Document F02 = ijVar2.F0();
                                    TLRPC.Document document3 = ijVar2.d3;
                                    if (document3 != null) {
                                        F02 = document3;
                                    }
                                    String B2 = w7.B(F02);
                                    File file4 = new File(externalStoragePublicDirectory, B2);
                                    if (file4.exists()) {
                                        int lastIndexOf = B2.lastIndexOf(46);
                                        for (int i11 = 0; i11 < 10; i11++) {
                                            file4 = new File(externalStoragePublicDirectory, lastIndexOf != -1 ? B2.substring(0, lastIndexOf) + "(" + (i11 + 1) + ")" + B2.substring(lastIndexOf) : B2 + "(" + (i11 + 1) + ")");
                                            if (file4.exists()) {
                                            }
                                        }
                                    }
                                    if (!file4.exists()) {
                                        file4.createNewFile();
                                    }
                                    String str2 = ijVar2.k.attachPath;
                                    if (ijVar2.d3 != null) {
                                        str2 = null;
                                    }
                                    if (str2 != null && str2.length() > 0 && !new File(str2).exists()) {
                                        str2 = null;
                                    }
                                    if (ijVar2.d3 != null) {
                                        w7.G(cVar.a);
                                        file = w7.J(ijVar2.d3, null, false, true);
                                    } else {
                                        if (str2 == null || str2.length() == 0) {
                                            w7.G(cVar.a);
                                            str2 = w7.M(ijVar2.k, false, true).toString();
                                        }
                                        file = new File(str2);
                                    }
                                    if (!file.exists()) {
                                        cfVar3.r = new CountDownLatch(1);
                                        g0.h3(new x4(26, cfVar3, ijVar2));
                                        cfVar3.r.await();
                                    }
                                    if (file.exists()) {
                                        cfVar3.a(file, file4, ijVar2.t1());
                                        cfVar3.n++;
                                    }
                                }
                            }
                        }
                        if (cfVar3.d.isEmpty()) {
                            g0.h3(new bf(cfVar3, 4));
                            break;
                        } else {
                            break;
                        }
                    } catch (Exception e10) {
                        e = e10;
                        z9 = true;
                        a8.g(e, z9);
                        return;
                    }
                } catch (Exception e11) {
                    e = e11;
                    z9 = true;
                }
                break;
            case 3:
                try {
                    this.b.b.dismiss();
                    break;
                } catch (Exception e12) {
                    a8.g(e12, true);
                    return;
                }
            default:
                cf cfVar4 = this.b;
                org.telegram.ui.ActionBar.u1 u1Var = cfVar4.b;
                c cVar2 = cfVar4.a;
                try {
                    if (u1Var.isShowing()) {
                        u1Var.dismiss();
                    } else {
                        cfVar4.h = true;
                    }
                    if (cfVar4.s != null) {
                        g0.h3(new bf(cfVar4, 0));
                    }
                } catch (Exception e13) {
                    a8.g(e13, true);
                }
                int i12 = cVar2.a;
                qs.f(i12).n(cfVar4, qs.Y1);
                qs.f(i12).n(cfVar4, qs.X1);
                qs.f(i12).n(cfVar4, qs.Z1);
                break;
        }
    }
}
