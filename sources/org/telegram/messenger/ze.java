package org.telegram.messenger;

import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class ze implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ af b;

    public /* synthetic */ ze(af afVar, int i7) {
        this.a = i7;
        this.b = afVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        File file;
        File file2;
        switch (this.a) {
            case 0:
                af afVar = this.b;
                afVar.s.a(afVar.n);
                break;
            case 1:
                af afVar2 = this.b;
                if (!afVar2.h) {
                    afVar2.b.show();
                    break;
                }
                break;
            case 2:
                af afVar3 = this.b;
                boolean z11 = afVar3.w;
                c cVar = afVar3.a;
                ArrayList arrayList = afVar3.c;
                try {
                    try {
                        if (Build.VERSION.SDK_INT >= 29) {
                            int size = arrayList.size();
                            for (int i7 = 0; i7 < size; i7++) {
                                fj fjVar = (fj) arrayList.get(i7);
                                if (!afVar3.b(fjVar)) {
                                    String str = fjVar.k.attachPath;
                                    TLRPC.Document F0 = fjVar.F0();
                                    TLRPC.Document document = fjVar.f3;
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
                                        TLRPC.MessageMedia m12 = fj.m1(fjVar);
                                        TLRPC.Document document2 = fjVar.f3;
                                        if (document2 != null) {
                                            file2 = w7.J(document2, null, false, true);
                                        } else {
                                            File M = w7.M(fjVar.k, false, true);
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
                                        afVar3.r = new CountDownLatch(1);
                                        g0.g3(new z4(26, afVar3, fjVar));
                                        afVar3.r.await();
                                    }
                                    if (!afVar3.f) {
                                        if (!file3.exists()) {
                                            w7.G(cVar.a);
                                            file3 = w7.J(fjVar.k, null, true, true);
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append("saving file: correcting path from ");
                                            sb2.append(str);
                                            sb2.append(" to ");
                                            sb2.append(file3 == null ? null : file3.getAbsolutePath());
                                            a8.b(sb2.toString());
                                        }
                                        if (file3 != null && file3.exists()) {
                                            MediaController.f0(z11 ? 3 : 2, file3, B);
                                            afVar3.n++;
                                        }
                                    }
                                }
                            }
                        } else {
                            File externalStoragePublicDirectory = z11 ? Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC) : Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                            externalStoragePublicDirectory.mkdir();
                            int size2 = arrayList.size();
                            for (int i10 = 0; i10 < size2; i10++) {
                                fj fjVar2 = (fj) arrayList.get(i10);
                                if (!afVar3.b(fjVar2)) {
                                    TLRPC.Document F02 = fjVar2.F0();
                                    TLRPC.Document document3 = fjVar2.f3;
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
                                    String str2 = fjVar2.k.attachPath;
                                    if (fjVar2.f3 != null) {
                                        str2 = null;
                                    }
                                    if (str2 != null && str2.length() > 0 && !new File(str2).exists()) {
                                        str2 = null;
                                    }
                                    if (fjVar2.f3 != null) {
                                        w7.G(cVar.a);
                                        file = w7.J(fjVar2.f3, null, false, true);
                                    } else {
                                        if (str2 == null || str2.length() == 0) {
                                            w7.G(cVar.a);
                                            str2 = w7.M(fjVar2.k, false, true).toString();
                                        }
                                        file = new File(str2);
                                    }
                                    if (!file.exists()) {
                                        afVar3.r = new CountDownLatch(1);
                                        g0.g3(new z4(26, afVar3, fjVar2));
                                        afVar3.r.await();
                                    }
                                    if (file.exists()) {
                                        afVar3.a(file, file4, fjVar2.t1());
                                        afVar3.n++;
                                    }
                                }
                            }
                        }
                        if (afVar3.d.isEmpty()) {
                            g0.g3(new ze(afVar3, 4));
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
                af afVar4 = this.b;
                org.telegram.ui.ActionBar.t1 t1Var = afVar4.b;
                c cVar2 = afVar4.a;
                try {
                    if (t1Var.isShowing()) {
                        t1Var.dismiss();
                    } else {
                        afVar4.h = true;
                    }
                    if (afVar4.s != null) {
                        g0.g3(new ze(afVar4, 0));
                    }
                } catch (Exception e13) {
                    a8.g(e13, true);
                }
                int i12 = cVar2.a;
                ks.f(i12).n(afVar4, ks.Y1);
                ks.f(i12).n(afVar4, ks.X1);
                ks.f(i12).n(afVar4, ks.Z1);
                break;
        }
    }
}
