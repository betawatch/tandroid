package org.telegram.messenger;

import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class bf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cf b;

    public /* synthetic */ bf(cf cfVar, int i10) {
        this.a = i10;
        this.b = cfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
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
                boolean z11 = cfVar3.w;
                c cVar = cfVar3.a;
                ArrayList arrayList = cfVar3.c;
                try {
                    try {
                        if (Build.VERSION.SDK_INT >= 29) {
                            int size = arrayList.size();
                            for (int i10 = 0; i10 < size; i10++) {
                                jj jjVar = (jj) arrayList.get(i10);
                                if (!cfVar3.b(jjVar)) {
                                    String str = jjVar.k.attachPath;
                                    TLRPC.Document F0 = jjVar.F0();
                                    TLRPC.Document document = jjVar.a3;
                                    if (document != null) {
                                        str = null;
                                        F0 = document;
                                    }
                                    String B = b8.B(F0);
                                    if (str != null && str.length() > 0 && !new File(str).exists()) {
                                        str = null;
                                    }
                                    if (TextUtils.isEmpty(str)) {
                                        b8.G(cVar.a);
                                        TLRPC.MessageMedia n12 = jj.n1(jjVar);
                                        TLRPC.Document document2 = jjVar.a3;
                                        if (document2 != null) {
                                            file2 = b8.K(document2, null, false, true);
                                        } else {
                                            File N = b8.N(jjVar.k, false, true);
                                            if (n12 instanceof TLRPC.TL_messageMediaDocument) {
                                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) n12;
                                                if (!tL_messageMediaDocument.alt_documents.isEmpty()) {
                                                    file2 = b8.K(tL_messageMediaDocument.alt_documents.get(0), null, false, true);
                                                }
                                            }
                                            file2 = N;
                                        }
                                        str = file2.toString();
                                    }
                                    File file3 = new File(str);
                                    if (!file3.exists()) {
                                        cfVar3.r = new CountDownLatch(1);
                                        i0.g3(new t6(24, cfVar3, jjVar));
                                        cfVar3.r.await();
                                    }
                                    if (!cfVar3.f) {
                                        if (!file3.exists()) {
                                            b8.G(cVar.a);
                                            file3 = b8.K(jjVar.k, null, true, true);
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append("saving file: correcting path from ");
                                            sb2.append(str);
                                            sb2.append(" to ");
                                            sb2.append(file3 == null ? null : file3.getAbsolutePath());
                                            f8.b(sb2.toString());
                                        }
                                        if (file3 != null && file3.exists()) {
                                            MediaController.f0(z11 ? 3 : 2, file3, B);
                                            cfVar3.n++;
                                        }
                                    }
                                }
                            }
                        } else {
                            File externalStoragePublicDirectory = z11 ? Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC) : Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                            externalStoragePublicDirectory.mkdir();
                            int size2 = arrayList.size();
                            for (int i11 = 0; i11 < size2; i11++) {
                                jj jjVar2 = (jj) arrayList.get(i11);
                                if (!cfVar3.b(jjVar2)) {
                                    TLRPC.Document F02 = jjVar2.F0();
                                    TLRPC.Document document3 = jjVar2.a3;
                                    if (document3 != null) {
                                        F02 = document3;
                                    }
                                    String B2 = b8.B(F02);
                                    File file4 = new File(externalStoragePublicDirectory, B2);
                                    if (file4.exists()) {
                                        int lastIndexOf = B2.lastIndexOf(46);
                                        for (int i12 = 0; i12 < 10; i12++) {
                                            file4 = new File(externalStoragePublicDirectory, lastIndexOf != -1 ? B2.substring(0, lastIndexOf) + "(" + (i12 + 1) + ")" + B2.substring(lastIndexOf) : B2 + "(" + (i12 + 1) + ")");
                                            if (file4.exists()) {
                                            }
                                        }
                                    }
                                    if (!file4.exists()) {
                                        file4.createNewFile();
                                    }
                                    String str2 = jjVar2.k.attachPath;
                                    if (jjVar2.a3 != null) {
                                        str2 = null;
                                    }
                                    if (str2 != null && str2.length() > 0 && !new File(str2).exists()) {
                                        str2 = null;
                                    }
                                    if (jjVar2.a3 != null) {
                                        b8.G(cVar.a);
                                        file = b8.K(jjVar2.a3, null, false, true);
                                    } else {
                                        if (str2 == null || str2.length() == 0) {
                                            b8.G(cVar.a);
                                            str2 = b8.N(jjVar2.k, false, true).toString();
                                        }
                                        file = new File(str2);
                                    }
                                    if (!file.exists()) {
                                        cfVar3.r = new CountDownLatch(1);
                                        i0.g3(new t6(24, cfVar3, jjVar2));
                                        cfVar3.r.await();
                                    }
                                    if (file.exists()) {
                                        cfVar3.a(file, file4, jjVar2.u1());
                                        cfVar3.n++;
                                    }
                                }
                            }
                        }
                        if (cfVar3.d.isEmpty()) {
                            i0.g3(new bf(cfVar3, 4));
                            break;
                        } else {
                            break;
                        }
                    } catch (Exception e) {
                        e = e;
                        z10 = true;
                        f8.g(e, z10);
                        return;
                    }
                } catch (Exception e7) {
                    e = e7;
                    z10 = true;
                }
                break;
            case 3:
                try {
                    this.b.b.dismiss();
                    break;
                } catch (Exception e10) {
                    f8.g(e10, true);
                    return;
                }
            default:
                cf cfVar4 = this.b;
                org.telegram.ui.ActionBar.x1 x1Var = cfVar4.b;
                c cVar2 = cfVar4.a;
                try {
                    if (x1Var.isShowing()) {
                        x1Var.dismiss();
                    } else {
                        cfVar4.h = true;
                    }
                    if (cfVar4.s != null) {
                        i0.g3(new bf(cfVar4, 0));
                    }
                } catch (Exception e11) {
                    f8.g(e11, true);
                }
                int i13 = cVar2.a;
                zs.f(i13).n(cfVar4, zs.Y1);
                zs.f(i13).n(cfVar4, zs.X1);
                zs.f(i13).n(cfVar4, zs.Z1);
                break;
        }
    }
}
