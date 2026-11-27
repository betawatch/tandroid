// default package

import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class io6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jo6 b;

    public /* synthetic */ io6(jo6 jo6Var, byte b) {
        this.a = b;
        this.b = jo6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        File file;
        File file2;
        byte b = this.a;
        byte b2 = 0;
        jo6 jo6Var = this.b;
        switch (b) {
            case 0:
                jo6Var.s.a(jo6Var.n);
                break;
            case 1:
                if (!jo6Var.h) {
                    jo6Var.b.show();
                    break;
                }
                break;
            case 2:
                boolean z2 = jo6Var.w;
                k5 k5Var = jo6Var.a;
                ArrayList arrayList = jo6Var.c;
                try {
                    byte b3 = 4;
                    try {
                        if (Build.VERSION.SDK_INT >= 29) {
                            int size = arrayList.size();
                            for (int i = 0; i < size; i++) {
                                r47 r47Var = (r47) arrayList.get(i);
                                if (!jo6Var.b(r47Var)) {
                                    String str = r47Var.k.attachPath;
                                    TLRPC.Document F0 = r47Var.F0();
                                    TLRPC.Document document = r47Var.f3;
                                    if (document != null) {
                                        str = null;
                                        F0 = document;
                                    }
                                    String B = xb4.B(F0);
                                    if (str != null && str.length() > 0 && !new File(str).exists()) {
                                        str = null;
                                    }
                                    if (TextUtils.isEmpty(str)) {
                                        xb4.G(k5Var.a);
                                        TLRPC.MessageMedia m1 = r47.m1(r47Var);
                                        TLRPC.Document document2 = r47Var.f3;
                                        if (document2 != null) {
                                            file2 = xb4.J(document2, null, false, true);
                                        } else {
                                            File M = xb4.M(r47Var.k, false, true);
                                            if (m1 instanceof TLRPC.TL_messageMediaDocument) {
                                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) m1;
                                                if (!tL_messageMediaDocument.alt_documents.isEmpty()) {
                                                    file2 = xb4.J(tL_messageMediaDocument.alt_documents.get(0), null, false, true);
                                                }
                                            }
                                            file2 = M;
                                        }
                                        str = file2.toString();
                                    }
                                    File file3 = new File(str);
                                    if (!file3.exists()) {
                                        jo6Var.r = new CountDownLatch(1);
                                        hl.c3(new mn6(jo6Var, r47Var, b3));
                                        jo6Var.r.await();
                                    }
                                    if (!jo6Var.f) {
                                        if (!file3.exists()) {
                                            xb4.G(k5Var.a);
                                            file3 = xb4.J(r47Var.k, null, true, true);
                                            StringBuilder sb = new StringBuilder();
                                            sb.append("saving file: correcting path from ");
                                            sb.append(str);
                                            sb.append(" to ");
                                            sb.append(file3 == null ? null : file3.getAbsolutePath());
                                            cc4.b(sb.toString());
                                        }
                                        if (file3 != null && file3.exists()) {
                                            MediaController.h0(z2 ? 3 : 2, file3, B);
                                            jo6Var.n++;
                                        }
                                    }
                                }
                            }
                        } else {
                            File externalStoragePublicDirectory = z2 ? Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC) : Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                            externalStoragePublicDirectory.mkdir();
                            int size2 = arrayList.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                r47 r47Var2 = (r47) arrayList.get(i2);
                                if (!jo6Var.b(r47Var2)) {
                                    TLRPC.Document F02 = r47Var2.F0();
                                    TLRPC.Document document3 = r47Var2.f3;
                                    if (document3 != null) {
                                        F02 = document3;
                                    }
                                    String B2 = xb4.B(F02);
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
                                    String str2 = r47Var2.k.attachPath;
                                    if (r47Var2.f3 != null) {
                                        str2 = null;
                                    }
                                    if (str2 != null && str2.length() > 0 && !new File(str2).exists()) {
                                        str2 = null;
                                    }
                                    if (r47Var2.f3 != null) {
                                        xb4.G(k5Var.a);
                                        file = xb4.J(r47Var2.f3, null, false, true);
                                    } else {
                                        if (str2 == null || str2.length() == 0) {
                                            xb4.G(k5Var.a);
                                            str2 = xb4.M(r47Var2.k, false, true).toString();
                                        }
                                        file = new File(str2);
                                    }
                                    if (!file.exists()) {
                                        jo6Var.r = new CountDownLatch(1);
                                        hl.c3(new mn6((Object) jo6Var, (Object) r47Var2, (byte) 4));
                                        jo6Var.r.await();
                                    }
                                    if (file.exists()) {
                                        jo6Var.a(file, file4, r47Var2.t1());
                                        jo6Var.n++;
                                    }
                                }
                            }
                        }
                        if (jo6Var.d.isEmpty()) {
                            hl.c3(new io6(jo6Var, (byte) 4));
                            break;
                        }
                    } catch (Exception e) {
                        e = e;
                        z = true;
                        cc4.g(e, z);
                        return;
                    }
                } catch (Exception e2) {
                    e = e2;
                    z = true;
                }
                break;
            case 3:
                try {
                    jo6Var.b.dismiss();
                    break;
                } catch (Exception e3) {
                    cc4.g(e3, true);
                    return;
                }
            default:
                id idVar = jo6Var.b;
                k5 k5Var2 = jo6Var.a;
                try {
                    if (idVar.isShowing()) {
                        idVar.dismiss();
                    } else {
                        jo6Var.h = true;
                    }
                    if (jo6Var.s != null) {
                        hl.c3(new io6(jo6Var, b2));
                    }
                } catch (Exception e4) {
                    cc4.g(e4, true);
                }
                int i4 = k5Var2.a;
                jn7.f(i4).n(jo6Var, jn7.Y1);
                jn7.f(i4).n(jo6Var, jn7.X1);
                jn7.f(i4).n(jo6Var, jn7.Z1);
                break;
        }
    }
}
