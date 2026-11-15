package org.telegram.messenger;

import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class af implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bf b;

    public /* synthetic */ af(bf bfVar, int i7) {
        this.a = i7;
        this.b = bfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        File file;
        File file2;
        switch (this.a) {
            case 0:
                bf bfVar = this.b;
                bfVar.s.a(bfVar.n);
                break;
            case 1:
                bf bfVar2 = this.b;
                if (!bfVar2.h) {
                    bfVar2.b.show();
                    break;
                }
                break;
            case 2:
                bf bfVar3 = this.b;
                boolean z11 = bfVar3.w;
                c cVar = bfVar3.a;
                ArrayList arrayList = bfVar3.c;
                try {
                    try {
                        if (Build.VERSION.SDK_INT >= 29) {
                            int size = arrayList.size();
                            for (int i7 = 0; i7 < size; i7++) {
                                gj gjVar = (gj) arrayList.get(i7);
                                if (!bfVar3.b(gjVar)) {
                                    String str = gjVar.k.attachPath;
                                    TLRPC.Document F0 = gjVar.F0();
                                    TLRPC.Document document = gjVar.f3;
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
                                        TLRPC.MessageMedia m12 = gj.m1(gjVar);
                                        TLRPC.Document document2 = gjVar.f3;
                                        if (document2 != null) {
                                            file2 = w7.J(document2, null, false, true);
                                        } else {
                                            File M = w7.M(gjVar.k, false, true);
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
                                        bfVar3.r = new CountDownLatch(1);
                                        g0.h3(new x4(26, bfVar3, gjVar));
                                        bfVar3.r.await();
                                    }
                                    if (!bfVar3.f) {
                                        if (!file3.exists()) {
                                            w7.G(cVar.a);
                                            file3 = w7.J(gjVar.k, null, true, true);
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append("saving file: correcting path from ");
                                            sb2.append(str);
                                            sb2.append(" to ");
                                            sb2.append(file3 == null ? null : file3.getAbsolutePath());
                                            a8.b(sb2.toString());
                                        }
                                        if (file3 != null && file3.exists()) {
                                            MediaController.f0(z11 ? 3 : 2, file3, B);
                                            bfVar3.n++;
                                        }
                                    }
                                }
                            }
                        } else {
                            File externalStoragePublicDirectory = z11 ? Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC) : Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                            externalStoragePublicDirectory.mkdir();
                            int size2 = arrayList.size();
                            for (int i10 = 0; i10 < size2; i10++) {
                                gj gjVar2 = (gj) arrayList.get(i10);
                                if (!bfVar3.b(gjVar2)) {
                                    TLRPC.Document F02 = gjVar2.F0();
                                    TLRPC.Document document3 = gjVar2.f3;
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
                                    String str2 = gjVar2.k.attachPath;
                                    if (gjVar2.f3 != null) {
                                        str2 = null;
                                    }
                                    if (str2 != null && str2.length() > 0 && !new File(str2).exists()) {
                                        str2 = null;
                                    }
                                    if (gjVar2.f3 != null) {
                                        w7.G(cVar.a);
                                        file = w7.J(gjVar2.f3, null, false, true);
                                    } else {
                                        if (str2 == null || str2.length() == 0) {
                                            w7.G(cVar.a);
                                            str2 = w7.M(gjVar2.k, false, true).toString();
                                        }
                                        file = new File(str2);
                                    }
                                    if (!file.exists()) {
                                        bfVar3.r = new CountDownLatch(1);
                                        g0.h3(new x4(26, bfVar3, gjVar2));
                                        bfVar3.r.await();
                                    }
                                    if (file.exists()) {
                                        bfVar3.a(file, file4, gjVar2.t1());
                                        bfVar3.n++;
                                    }
                                }
                            }
                        }
                        if (bfVar3.d.isEmpty()) {
                            g0.h3(new af(bfVar3, 4));
                            break;
                        } else {
                            break;
                        }
                    } catch (Exception e10) {
                        e = e10;
                        z10 = true;
                        a8.g(e, z10);
                        return;
                    }
                } catch (Exception e11) {
                    e = e11;
                    z10 = true;
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
                bf bfVar4 = this.b;
                org.telegram.ui.ActionBar.t1 t1Var = bfVar4.b;
                c cVar2 = bfVar4.a;
                try {
                    if (t1Var.isShowing()) {
                        t1Var.dismiss();
                    } else {
                        bfVar4.h = true;
                    }
                    if (bfVar4.s != null) {
                        g0.h3(new af(bfVar4, 0));
                    }
                } catch (Exception e13) {
                    a8.g(e13, true);
                }
                int i12 = cVar2.a;
                ns.f(i12).n(bfVar4, ns.Y1);
                ns.f(i12).n(bfVar4, ns.X1);
                ns.f(i12).n(bfVar4, ns.Z1);
                break;
        }
    }
}
