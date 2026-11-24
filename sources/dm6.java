// default package

import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class dm6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ em6 b;

    public /* synthetic */ dm6(em6 em6Var, byte b) {
        this.a = b;
        this.b = em6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        File file;
        File file2;
        byte b = this.a;
        byte b2 = 0;
        em6 em6Var = this.b;
        switch (b) {
            case 0:
                em6Var.s.a(em6Var.n);
                break;
            case 1:
                if (!em6Var.h) {
                    em6Var.b.show();
                    break;
                }
                break;
            case 2:
                boolean z2 = em6Var.w;
                j5 j5Var = em6Var.a;
                ArrayList arrayList = em6Var.c;
                try {
                    byte b3 = 7;
                    try {
                        if (Build.VERSION.SDK_INT >= 29) {
                            int size = arrayList.size();
                            for (int i = 0; i < size; i++) {
                                k27 k27Var = (k27) arrayList.get(i);
                                if (!em6Var.b(k27Var)) {
                                    String str = k27Var.k.attachPath;
                                    TLRPC.Document F0 = k27Var.F0();
                                    TLRPC.Document document = k27Var.f3;
                                    if (document != null) {
                                        str = null;
                                        F0 = document;
                                    }
                                    String B = ba4.B(F0);
                                    if (str != null && str.length() > 0 && !new File(str).exists()) {
                                        str = null;
                                    }
                                    if (TextUtils.isEmpty(str)) {
                                        ba4.G(j5Var.a);
                                        TLRPC.MessageMedia m1 = k27.m1(k27Var);
                                        TLRPC.Document document2 = k27Var.f3;
                                        if (document2 != null) {
                                            file2 = ba4.J(document2, null, false, true);
                                        } else {
                                            File M = ba4.M(k27Var.k, false, true);
                                            if (m1 instanceof TLRPC.TL_messageMediaDocument) {
                                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) m1;
                                                if (!tL_messageMediaDocument.alt_documents.isEmpty()) {
                                                    file2 = ba4.J(tL_messageMediaDocument.alt_documents.get(0), null, false, true);
                                                }
                                            }
                                            file2 = M;
                                        }
                                        str = file2.toString();
                                    }
                                    File file3 = new File(str);
                                    if (!file3.exists()) {
                                        em6Var.r = new CountDownLatch(1);
                                        gl.d3(new oh6(em6Var, k27Var, b3));
                                        em6Var.r.await();
                                    }
                                    if (!em6Var.f) {
                                        if (!file3.exists()) {
                                            ba4.G(j5Var.a);
                                            file3 = ba4.J(k27Var.k, null, true, true);
                                            StringBuilder sb = new StringBuilder();
                                            sb.append("saving file: correcting path from ");
                                            sb.append(str);
                                            sb.append(" to ");
                                            sb.append(file3 == null ? null : file3.getAbsolutePath());
                                            fa4.b(sb.toString());
                                        }
                                        if (file3 != null && file3.exists()) {
                                            MediaController.e0(z2 ? 3 : 2, file3, B);
                                            em6Var.n++;
                                        }
                                    }
                                }
                            }
                        } else {
                            File externalStoragePublicDirectory = z2 ? Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC) : Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                            externalStoragePublicDirectory.mkdir();
                            int size2 = arrayList.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                k27 k27Var2 = (k27) arrayList.get(i2);
                                if (!em6Var.b(k27Var2)) {
                                    TLRPC.Document F02 = k27Var2.F0();
                                    TLRPC.Document document3 = k27Var2.f3;
                                    if (document3 != null) {
                                        F02 = document3;
                                    }
                                    String B2 = ba4.B(F02);
                                    File file4 = new File(externalStoragePublicDirectory, B2);
                                    if (file4.exists()) {
                                        int lastIndexOf = B2.lastIndexOf(46);
                                        for (int i3 = 0; i3 < 10; i3++) {
                                            file4 = new File(externalStoragePublicDirectory, lastIndexOf != -1 ? B2.substring(0, lastIndexOf) + "(" + (i3 + 1) + ")" + B2.substring(lastIndexOf) : B2 + "(" + (i3 + 1) + ")");
                                            if (file4.exists()) {
                                            }
                                        }
                                    }
                                    if (!file4.exists()) {
                                        file4.createNewFile();
                                    }
                                    String str2 = k27Var2.k.attachPath;
                                    if (k27Var2.f3 != null) {
                                        str2 = null;
                                    }
                                    if (str2 != null && str2.length() > 0 && !new File(str2).exists()) {
                                        str2 = null;
                                    }
                                    if (k27Var2.f3 != null) {
                                        ba4.G(j5Var.a);
                                        file = ba4.J(k27Var2.f3, null, false, true);
                                    } else {
                                        if (str2 == null || str2.length() == 0) {
                                            ba4.G(j5Var.a);
                                            str2 = ba4.M(k27Var2.k, false, true).toString();
                                        }
                                        file = new File(str2);
                                    }
                                    if (!file.exists()) {
                                        em6Var.r = new CountDownLatch(1);
                                        gl.d3(new oh6((Object) em6Var, (Object) k27Var2, (byte) 7));
                                        em6Var.r.await();
                                    }
                                    if (file.exists()) {
                                        em6Var.a(file, file4, k27Var2.t1());
                                        em6Var.n++;
                                    }
                                }
                            }
                        }
                        if (em6Var.d.isEmpty()) {
                            gl.d3(new dm6(em6Var, (byte) 4));
                            break;
                        }
                    } catch (Exception e) {
                        e = e;
                        z = true;
                        fa4.g(e, z);
                        return;
                    }
                } catch (Exception e2) {
                    e = e2;
                    z = true;
                }
                break;
            case 3:
                try {
                    em6Var.b.dismiss();
                    break;
                } catch (Exception e3) {
                    fa4.g(e3, true);
                    return;
                }
            default:
                hd hdVar = em6Var.b;
                j5 j5Var2 = em6Var.a;
                try {
                    if (hdVar.isShowing()) {
                        hdVar.dismiss();
                    } else {
                        em6Var.h = true;
                    }
                    if (em6Var.s != null) {
                        gl.d3(new dm6(em6Var, b2));
                    }
                } catch (Exception e4) {
                    fa4.g(e4, true);
                }
                int i4 = j5Var2.a;
                kk7.f(i4).n(em6Var, kk7.X1);
                kk7.f(i4).n(em6Var, kk7.W1);
                kk7.f(i4).n(em6Var, kk7.Y1);
                break;
        }
    }
}
