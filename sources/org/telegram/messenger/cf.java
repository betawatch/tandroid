package org.telegram.messenger;

import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class cf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ df b;

    public /* synthetic */ cf(df dfVar, int i10) {
        this.a = i10;
        this.b = dfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        File file;
        File file2;
        switch (this.a) {
            case 0:
                df dfVar = this.b;
                dfVar.s.a(dfVar.n);
                break;
            case 1:
                df dfVar2 = this.b;
                if (!dfVar2.h) {
                    dfVar2.b.show();
                    break;
                }
                break;
            case 2:
                df dfVar3 = this.b;
                boolean z11 = dfVar3.w;
                c cVar = dfVar3.a;
                ArrayList arrayList = dfVar3.c;
                try {
                    try {
                        if (Build.VERSION.SDK_INT >= 29) {
                            int size = arrayList.size();
                            for (int i10 = 0; i10 < size; i10++) {
                                kj kjVar = (kj) arrayList.get(i10);
                                if (!dfVar3.b(kjVar)) {
                                    String str = kjVar.k.attachPath;
                                    TLRPC.Document F0 = kjVar.F0();
                                    TLRPC.Document document = kjVar.a3;
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
                                        TLRPC.MessageMedia n12 = kj.n1(kjVar);
                                        TLRPC.Document document2 = kjVar.a3;
                                        if (document2 != null) {
                                            file2 = b8.K(document2, null, false, true);
                                        } else {
                                            File N = b8.N(kjVar.k, false, true);
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
                                        dfVar3.r = new CountDownLatch(1);
                                        i0.g3(new t6(24, dfVar3, kjVar));
                                        dfVar3.r.await();
                                    }
                                    if (!dfVar3.f) {
                                        if (!file3.exists()) {
                                            b8.G(cVar.a);
                                            file3 = b8.K(kjVar.k, null, true, true);
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append("saving file: correcting path from ");
                                            sb2.append(str);
                                            sb2.append(" to ");
                                            sb2.append(file3 == null ? null : file3.getAbsolutePath());
                                            f8.b(sb2.toString());
                                        }
                                        if (file3 != null && file3.exists()) {
                                            MediaController.f0(z11 ? 3 : 2, file3, B);
                                            dfVar3.n++;
                                        }
                                    }
                                }
                            }
                        } else {
                            File externalStoragePublicDirectory = z11 ? Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC) : Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                            externalStoragePublicDirectory.mkdir();
                            int size2 = arrayList.size();
                            for (int i11 = 0; i11 < size2; i11++) {
                                kj kjVar2 = (kj) arrayList.get(i11);
                                if (!dfVar3.b(kjVar2)) {
                                    TLRPC.Document F02 = kjVar2.F0();
                                    TLRPC.Document document3 = kjVar2.a3;
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
                                    String str2 = kjVar2.k.attachPath;
                                    if (kjVar2.a3 != null) {
                                        str2 = null;
                                    }
                                    if (str2 != null && str2.length() > 0 && !new File(str2).exists()) {
                                        str2 = null;
                                    }
                                    if (kjVar2.a3 != null) {
                                        b8.G(cVar.a);
                                        file = b8.K(kjVar2.a3, null, false, true);
                                    } else {
                                        if (str2 == null || str2.length() == 0) {
                                            b8.G(cVar.a);
                                            str2 = b8.N(kjVar2.k, false, true).toString();
                                        }
                                        file = new File(str2);
                                    }
                                    if (!file.exists()) {
                                        dfVar3.r = new CountDownLatch(1);
                                        i0.g3(new t6(24, dfVar3, kjVar2));
                                        dfVar3.r.await();
                                    }
                                    if (file.exists()) {
                                        dfVar3.a(file, file4, kjVar2.u1());
                                        dfVar3.n++;
                                    }
                                }
                            }
                        }
                        if (dfVar3.d.isEmpty()) {
                            i0.g3(new cf(dfVar3, 4));
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
                df dfVar4 = this.b;
                org.telegram.ui.ActionBar.x1 x1Var = dfVar4.b;
                c cVar2 = dfVar4.a;
                try {
                    if (x1Var.isShowing()) {
                        x1Var.dismiss();
                    } else {
                        dfVar4.h = true;
                    }
                    if (dfVar4.s != null) {
                        i0.g3(new cf(dfVar4, 0));
                    }
                } catch (Exception e11) {
                    f8.g(e11, true);
                }
                int i13 = cVar2.a;
                at.f(i13).n(dfVar4, at.Y1);
                at.f(i13).n(dfVar4, at.X1);
                at.f(i13).n(dfVar4, at.Z1);
                break;
        }
    }
}
