package org.telegram.messenger;

import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class ue implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ve b;

    public /* synthetic */ ue(ve veVar, int i3) {
        this.a = i3;
        this.b = veVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        File file;
        File file2;
        switch (this.a) {
            case 0:
                ve veVar = this.b;
                veVar.s.a(veVar.n);
                break;
            case 1:
                ve veVar2 = this.b;
                if (!veVar2.h) {
                    veVar2.b.show();
                    break;
                }
                break;
            case 2:
                ve veVar3 = this.b;
                boolean z11 = veVar3.w;
                c cVar = veVar3.a;
                ArrayList arrayList = veVar3.c;
                try {
                    try {
                        if (Build.VERSION.SDK_INT >= 29) {
                            int size = arrayList.size();
                            for (int i3 = 0; i3 < size; i3++) {
                                zi ziVar = (zi) arrayList.get(i3);
                                if (!veVar3.b(ziVar)) {
                                    String str = ziVar.k.attachPath;
                                    TLRPC.Document F0 = ziVar.F0();
                                    TLRPC.Document document = ziVar.d3;
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
                                        TLRPC.MessageMedia n12 = zi.n1(ziVar);
                                        TLRPC.Document document2 = ziVar.d3;
                                        if (document2 != null) {
                                            file2 = w7.K(document2, null, false, true);
                                        } else {
                                            File N = w7.N(ziVar.k, false, true);
                                            if (n12 instanceof TLRPC.TL_messageMediaDocument) {
                                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) n12;
                                                if (!tL_messageMediaDocument.alt_documents.isEmpty()) {
                                                    file2 = w7.K(tL_messageMediaDocument.alt_documents.get(0), null, false, true);
                                                }
                                            }
                                            file2 = N;
                                        }
                                        str = file2.toString();
                                    }
                                    File file3 = new File(str);
                                    if (!file3.exists()) {
                                        veVar3.r = new CountDownLatch(1);
                                        g0.h3(new y4(26, veVar3, ziVar));
                                        veVar3.r.await();
                                    }
                                    if (!veVar3.f) {
                                        if (!file3.exists()) {
                                            w7.G(cVar.a);
                                            file3 = w7.K(ziVar.k, null, true, true);
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append("saving file: correcting path from ");
                                            sb2.append(str);
                                            sb2.append(" to ");
                                            sb2.append(file3 == null ? null : file3.getAbsolutePath());
                                            a8.b(sb2.toString());
                                        }
                                        if (file3 != null && file3.exists()) {
                                            MediaController.f0(z11 ? 3 : 2, file3, B);
                                            veVar3.n++;
                                        }
                                    }
                                }
                            }
                        } else {
                            File externalStoragePublicDirectory = z11 ? Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC) : Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                            externalStoragePublicDirectory.mkdir();
                            int size2 = arrayList.size();
                            for (int i10 = 0; i10 < size2; i10++) {
                                zi ziVar2 = (zi) arrayList.get(i10);
                                if (!veVar3.b(ziVar2)) {
                                    TLRPC.Document F02 = ziVar2.F0();
                                    TLRPC.Document document3 = ziVar2.d3;
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
                                    String str2 = ziVar2.k.attachPath;
                                    if (ziVar2.d3 != null) {
                                        str2 = null;
                                    }
                                    if (str2 != null && str2.length() > 0 && !new File(str2).exists()) {
                                        str2 = null;
                                    }
                                    if (ziVar2.d3 != null) {
                                        w7.G(cVar.a);
                                        file = w7.K(ziVar2.d3, null, false, true);
                                    } else {
                                        if (str2 == null || str2.length() == 0) {
                                            w7.G(cVar.a);
                                            str2 = w7.N(ziVar2.k, false, true).toString();
                                        }
                                        file = new File(str2);
                                    }
                                    if (!file.exists()) {
                                        veVar3.r = new CountDownLatch(1);
                                        g0.h3(new y4(26, veVar3, ziVar2));
                                        veVar3.r.await();
                                    }
                                    if (file.exists()) {
                                        veVar3.a(file, file4, ziVar2.u1());
                                        veVar3.n++;
                                    }
                                }
                            }
                        }
                        if (veVar3.d.isEmpty()) {
                            g0.h3(new ue(veVar3, 4));
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
                ve veVar4 = this.b;
                org.telegram.ui.ActionBar.s1 s1Var = veVar4.b;
                c cVar2 = veVar4.a;
                try {
                    if (s1Var.isShowing()) {
                        s1Var.dismiss();
                    } else {
                        veVar4.h = true;
                    }
                    if (veVar4.s != null) {
                        g0.h3(new ue(veVar4, 0));
                    }
                } catch (Exception e13) {
                    a8.g(e13, true);
                }
                int i12 = cVar2.a;
                hs.f(i12).n(veVar4, hs.Y1);
                hs.f(i12).n(veVar4, hs.X1);
                hs.f(i12).n(veVar4, hs.Z1);
                break;
        }
    }
}
