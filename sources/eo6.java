// default package

import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class eo6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fo6 b;

    public /* synthetic */ eo6(fo6 fo6Var, byte b) {
        this.a = b;
        this.b = fo6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        File file;
        File file2;
        byte b = this.a;
        byte b2 = 0;
        fo6 fo6Var = this.b;
        switch (b) {
            case 0:
                fo6Var.s.a(fo6Var.n);
                break;
            case 1:
                if (!fo6Var.h) {
                    fo6Var.b.show();
                    break;
                }
                break;
            case 2:
                boolean z2 = fo6Var.w;
                j5 j5Var = fo6Var.a;
                ArrayList arrayList = fo6Var.c;
                try {
                    byte b3 = 8;
                    try {
                        if (Build.VERSION.SDK_INT >= 29) {
                            int size = arrayList.size();
                            for (int i = 0; i < size; i++) {
                                k47 k47Var = (k47) arrayList.get(i);
                                if (!fo6Var.b(k47Var)) {
                                    String str = k47Var.k.attachPath;
                                    TLRPC.Document F0 = k47Var.F0();
                                    TLRPC.Document document = k47Var.f3;
                                    if (document != null) {
                                        str = null;
                                        F0 = document;
                                    }
                                    String B = bc4.B(F0);
                                    if (str != null && str.length() > 0 && !new File(str).exists()) {
                                        str = null;
                                    }
                                    if (TextUtils.isEmpty(str)) {
                                        bc4.G(j5Var.a);
                                        TLRPC.MessageMedia m1 = k47.m1(k47Var);
                                        TLRPC.Document document2 = k47Var.f3;
                                        if (document2 != null) {
                                            file2 = bc4.J(document2, null, false, true);
                                        } else {
                                            File M = bc4.M(k47Var.k, false, true);
                                            if (m1 instanceof TLRPC.TL_messageMediaDocument) {
                                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) m1;
                                                if (!tL_messageMediaDocument.alt_documents.isEmpty()) {
                                                    file2 = bc4.J(tL_messageMediaDocument.alt_documents.get(0), null, false, true);
                                                }
                                            }
                                            file2 = M;
                                        }
                                        str = file2.toString();
                                    }
                                    File file3 = new File(str);
                                    if (!file3.exists()) {
                                        fo6Var.r = new CountDownLatch(1);
                                        gm.c3(new lj6(fo6Var, k47Var, b3));
                                        fo6Var.r.await();
                                    }
                                    if (!fo6Var.f) {
                                        if (!file3.exists()) {
                                            bc4.G(j5Var.a);
                                            file3 = bc4.J(k47Var.k, null, true, true);
                                            StringBuilder sb = new StringBuilder();
                                            sb.append("saving file: correcting path from ");
                                            sb.append(str);
                                            sb.append(" to ");
                                            sb.append(file3 == null ? null : file3.getAbsolutePath());
                                            fc4.b(sb.toString());
                                        }
                                        if (file3 != null && file3.exists()) {
                                            MediaController.e0(z2 ? 3 : 2, file3, B);
                                            fo6Var.n++;
                                        }
                                    }
                                }
                            }
                        } else {
                            File externalStoragePublicDirectory = z2 ? Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC) : Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                            externalStoragePublicDirectory.mkdir();
                            int size2 = arrayList.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                k47 k47Var2 = (k47) arrayList.get(i2);
                                if (!fo6Var.b(k47Var2)) {
                                    TLRPC.Document F02 = k47Var2.F0();
                                    TLRPC.Document document3 = k47Var2.f3;
                                    if (document3 != null) {
                                        F02 = document3;
                                    }
                                    String B2 = bc4.B(F02);
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
                                    String str2 = k47Var2.k.attachPath;
                                    if (k47Var2.f3 != null) {
                                        str2 = null;
                                    }
                                    if (str2 != null && str2.length() > 0 && !new File(str2).exists()) {
                                        str2 = null;
                                    }
                                    if (k47Var2.f3 != null) {
                                        bc4.G(j5Var.a);
                                        file = bc4.J(k47Var2.f3, null, false, true);
                                    } else {
                                        if (str2 == null || str2.length() == 0) {
                                            bc4.G(j5Var.a);
                                            str2 = bc4.M(k47Var2.k, false, true).toString();
                                        }
                                        file = new File(str2);
                                    }
                                    if (!file.exists()) {
                                        fo6Var.r = new CountDownLatch(1);
                                        gm.c3(new lj6((Object) fo6Var, (Object) k47Var2, (byte) 8));
                                        fo6Var.r.await();
                                    }
                                    if (file.exists()) {
                                        fo6Var.a(file, file4, k47Var2.t1());
                                        fo6Var.n++;
                                    }
                                }
                            }
                        }
                        if (fo6Var.d.isEmpty()) {
                            gm.c3(new eo6(fo6Var, (byte) 4));
                            break;
                        }
                    } catch (Exception e) {
                        e = e;
                        z = true;
                        fc4.g(e, z);
                        return;
                    }
                } catch (Exception e2) {
                    e = e2;
                    z = true;
                }
                break;
            case 3:
                try {
                    fo6Var.b.dismiss();
                    break;
                } catch (Exception e3) {
                    fc4.g(e3, true);
                    return;
                }
            default:
                he heVar = fo6Var.b;
                j5 j5Var2 = fo6Var.a;
                try {
                    if (heVar.isShowing()) {
                        heVar.dismiss();
                    } else {
                        fo6Var.h = true;
                    }
                    if (fo6Var.s != null) {
                        gm.c3(new eo6(fo6Var, b2));
                    }
                } catch (Exception e4) {
                    fc4.g(e4, true);
                }
                int i4 = j5Var2.a;
                nm7.f(i4).n(fo6Var, nm7.Y1);
                nm7.f(i4).n(fo6Var, nm7.X1);
                nm7.f(i4).n(fo6Var, nm7.Z1);
                break;
        }
    }
}
