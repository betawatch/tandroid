// default package

import android.app.DownloadManager;
import android.content.ContentValues;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.SystemClock;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class jo6 implements fn7 {
    public k5 a;
    public id b;
    public ArrayList c;
    public HashMap d;
    public float e;
    public boolean f;
    public boolean h;
    public int n;
    public CountDownLatch r;
    public df7 s;
    public boolean w;

    /* JADX WARN: Removed duplicated region for block: B:53:0x0177 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[Catch: all -> 0x0180, SYNTHETIC, TRY_LEAVE, TryCatch #0 {all -> 0x0180, blocks: (B:59:0x017f, B:58:0x017c, B:96:0x0145, B:115:0x0151, B:54:0x0177), top: B:6:0x0015, inners: #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0161 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[Catch: all -> 0x016a, SYNTHETIC, TRY_LEAVE, TryCatch #4 {all -> 0x016a, blocks: (B:85:0x0169, B:84:0x0166, B:95:0x0142, B:114:0x014e, B:80:0x0161), top: B:12:0x001d, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(File file, File file2, String str) {
        File file3;
        boolean z;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        Throwable th;
        FileChannel channel;
        Throwable th2;
        String str2;
        if (hl.G1(Uri.fromFile(file), 0)) {
            return;
        }
        try {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        channel = fileInputStream.getChannel();
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        try {
                            fileInputStream2.close();
                            throw th;
                        } catch (Throwable th4) {
                            th.addSuppressed(th4);
                            throw th;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    file3 = file2;
                    fileInputStream2 = fileInputStream;
                    th = th;
                    fileInputStream2.close();
                    throw th;
                }
            } catch (Exception e) {
                e = e;
                file3 = file2;
                z = true;
                cc4.g(e, z);
                file3.delete();
                return;
            }
        } catch (Exception e2) {
            e = e2;
            z = true;
            cc4.g(e, z);
            file3.delete();
            return;
        }
        try {
            file3 = file2;
            try {
                try {
                    FileChannel channel2 = new FileOutputStream(file3).getChannel();
                    try {
                        long size = channel.size();
                        try {
                            if (hl.G1(null, ((Integer) FileDescriptor.class.getDeclaredMethod("getInt$", null).invoke(fileInputStream.getFD(), null)).intValue())) {
                                if (this.b != null) {
                                    hl.c3(new io6(this, (byte) 3));
                                }
                                if (channel2 != null) {
                                    try {
                                        channel2.close();
                                    } catch (Throwable th6) {
                                        th2 = th6;
                                        fileInputStream2 = fileInputStream;
                                        if (channel == null) {
                                        }
                                    }
                                }
                                try {
                                    channel.close();
                                    try {
                                        fileInputStream.close();
                                        return;
                                    } catch (Exception e3) {
                                        e = e3;
                                        z = true;
                                        cc4.g(e, z);
                                        file3.delete();
                                        return;
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    fileInputStream2 = fileInputStream;
                                    fileInputStream2.close();
                                    throw th;
                                }
                            }
                        } catch (Throwable th8) {
                            cc4.g(th8, true);
                        }
                        long j = 0;
                        long j2 = 0;
                        while (j < size) {
                            if (this.f) {
                                break;
                            }
                            fileInputStream2 = fileInputStream;
                            try {
                                channel2.transferFrom(channel, j, Math.min(4096L, size - j));
                                long j3 = 4096 + j;
                                if (j3 >= size || j2 <= SystemClock.elapsedRealtime() - 500) {
                                    long elapsedRealtime = SystemClock.elapsedRealtime();
                                    hl.c3(new ho6(this, (int) ((((100.0f / this.c.size()) * j) / size) + this.e), (byte) 1));
                                    j2 = elapsedRealtime;
                                }
                                j = j3;
                                fileInputStream = fileInputStream2;
                            } catch (Throwable th9) {
                                th = th9;
                                Throwable th10 = th;
                                if (channel2 != null) {
                                    throw th10;
                                }
                                try {
                                    channel2.close();
                                    throw th10;
                                } catch (Throwable th11) {
                                    th10.addSuppressed(th11);
                                    throw th10;
                                }
                            }
                        }
                        fileInputStream2 = fileInputStream;
                        if (this.f) {
                            if (channel2 != null) {
                                channel2.close();
                            }
                            channel.close();
                            fileInputStream2.close();
                            file3.delete();
                            return;
                        }
                        if (this.w) {
                            hl.d(file3);
                        } else {
                            DownloadManager downloadManager = (DownloadManager) a.b.getSystemService("download");
                            if (TextUtils.isEmpty(str)) {
                                MimeTypeMap singleton = MimeTypeMap.getSingleton();
                                String name = file3.getName();
                                int lastIndexOf = name.lastIndexOf(46);
                                if (lastIndexOf != -1) {
                                    String mimeTypeFromExtension = singleton.getMimeTypeFromExtension(name.substring(lastIndexOf + 1).toLowerCase());
                                    if (TextUtils.isEmpty(mimeTypeFromExtension)) {
                                        mimeTypeFromExtension = "text/plain";
                                    }
                                    str2 = mimeTypeFromExtension;
                                } else {
                                    str2 = "text/plain";
                                }
                            } else {
                                str2 = str;
                            }
                            downloadManager.addCompletedDownload(file3.getName(), file3.getName(), false, str2, file3.getAbsolutePath(), file3.length(), true);
                        }
                        float size2 = (100.0f / this.c.size()) + this.e;
                        this.e = size2;
                        hl.c3(new ho6(this, (int) size2, (byte) 2));
                        if (channel2 != null) {
                            channel2.close();
                        }
                        channel.close();
                        fileInputStream2.close();
                    } catch (Throwable th12) {
                        th = th12;
                        fileInputStream2 = fileInputStream;
                        Throwable th102 = th;
                        if (channel2 != null) {
                        }
                    }
                } catch (Throwable th13) {
                    th = th13;
                    th2 = th;
                    if (channel == null) {
                        throw th2;
                    }
                    try {
                        channel.close();
                        throw th2;
                    } catch (Throwable th14) {
                        th2.addSuppressed(th14);
                        throw th2;
                    }
                }
            } catch (Throwable th15) {
                th = th15;
                fileInputStream2 = fileInputStream;
                th2 = th;
                if (channel == null) {
                }
            }
        } catch (Throwable th16) {
            th = th16;
            file3 = file2;
        }
    }

    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final boolean b(r47 r47Var) {
        TLRPC.MessageMedia n1;
        TLRPC.Photo photo;
        TLRPC.PhotoSize w;
        boolean z = false;
        if (!r47Var.D3() || (n1 = r47.n1(r47Var.k)) == null || (photo = n1.photo) == null || n1.document == null || (w = xb4.w(photo.sizes, hl.Y0(true), false, null, true)) == null) {
            return false;
        }
        xb4.G(this.a.a);
        File J = xb4.J(w, null, false, true);
        File J2 = xb4.J(n1.document, null, false, true);
        ?? r2 = (J == null || !J.exists()) ? 1 : 0;
        ?? r6 = (J2 == null || !J2.exists()) ? 1 : 0;
        int i = r2 + r6;
        if (i > 0) {
            this.r = new CountDownLatch(i);
            hl.c3(new fr6(this, (boolean) r2, w, r47Var, n1.photo, (boolean) r6, n1.document));
            this.r.await();
        }
        if (!this.f) {
            if (J == null || !J.exists()) {
                J = xb4.J(w, null, true, true);
            }
            if (J2 == null || !J2.exists()) {
                J2 = xb4.J(n1.document, null, true, true);
            }
            if (J != null && J.exists() && J2 != null && J2.exists()) {
                String D = xb4.D(J);
                if (TextUtils.isEmpty(D)) {
                    D = "jpg";
                }
                String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(D.toLowerCase());
                if (TextUtils.isEmpty(mimeTypeFromExtension)) {
                    mimeTypeFromExtension = "image/jpeg";
                }
                String p0 = hl.p0(0, D);
                if (Build.VERSION.SDK_INT >= 29) {
                    ContentValues contentValues = new ContentValues();
                    Uri contentUri = MediaStore.Downloads.getContentUri("external_primary");
                    contentValues.put("relative_path", new File(Environment.DIRECTORY_DOWNLOADS, "Telegram") + File.separator);
                    contentValues.put("_display_name", p0);
                    contentValues.put("mime_type", mimeTypeFromExtension);
                    Uri insert = a.b.getContentResolver().insert(contentUri, contentValues);
                    if (insert != null) {
                        OutputStream openOutputStream = a.b.getContentResolver().openOutputStream(insert);
                        if (openOutputStream != null) {
                            try {
                                MediaController.M0(J, J2, openOutputStream, null);
                                z = !this.f;
                                openOutputStream.close();
                            } finally {
                            }
                        }
                        if (z) {
                            this.n++;
                        } else {
                            try {
                                a.b.getContentResolver().delete(insert, null, null);
                            } catch (Exception unused) {
                            }
                        }
                    }
                } else {
                    File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "Telegram");
                    file.mkdirs();
                    File file2 = new File(file, p0);
                    if (!file2.exists()) {
                        file2.createNewFile();
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    try {
                        MediaController.M0(J, J2, fileOutputStream, null);
                        fileOutputStream.close();
                        if (this.f) {
                            file2.delete();
                        } else {
                            ((DownloadManager) a.b.getSystemService("download")).addCompletedDownload(file2.getName(), file2.getName(), false, mimeTypeFromExtension, file2.getAbsolutePath(), file2.length(), true);
                            this.n++;
                        }
                    } finally {
                    }
                }
                float size = (100.0f / this.c.size()) + this.e;
                this.e = size;
                hl.c3(new ho6(this, (int) size, (byte) 3));
                return true;
            }
        }
        return true;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        HashMap hashMap = this.d;
        if (i == jn7.Y1 || i == jn7.Z1) {
            if (hashMap.remove((String) objArr[0]) != null) {
                this.r.countDown();
            }
        } else if (i == jn7.X1 && hashMap.containsKey((String) objArr[0])) {
            hl.c3(new ho6(this, (int) c00.B(((Long) objArr[1]).longValue() / ((Long) objArr[2]).longValue(), this.c.size(), 100.0f, this.e), (byte) 0));
        }
    }
}
