package org.telegram.messenger;

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
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class cf implements us {
    public c a;
    public org.telegram.ui.ActionBar.x1 b;
    public ArrayList c;
    public HashMap d;
    public float e;
    public boolean f;
    public boolean h;
    public int n;
    public CountDownLatch r;
    public bs s;
    public boolean w;

    /* JADX WARN: Removed duplicated region for block: B:114:0x018c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[Catch: all -> 0x016b, SYNTHETIC, TRY_LEAVE, TryCatch #3 {all -> 0x016b, blocks: (B:84:0x0160, B:120:0x0194, B:119:0x0191, B:103:0x0173, B:115:0x018c), top: B:6:0x0017, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[Catch: all -> 0x015d, SYNTHETIC, TRY_LEAVE, TryCatch #11 {all -> 0x015d, blocks: (B:72:0x0184, B:71:0x0181, B:83:0x0159, B:102:0x0170, B:67:0x017c), top: B:11:0x001f, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(File file, File file2, String str) {
        File file3;
        FileInputStream fileInputStream;
        boolean z10;
        Throwable th2;
        FileChannel channel;
        FileChannel channel2;
        String str2;
        if (i0.I1(Uri.fromFile(file), 0)) {
            return;
        }
        boolean z11 = true;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(file);
                try {
                    try {
                        channel = fileInputStream2.getChannel();
                        try {
                            file3 = file2;
                        } catch (Throwable th3) {
                            th = th3;
                            file3 = file2;
                        }
                        try {
                            try {
                                channel2 = new FileOutputStream(file3).getChannel();
                                try {
                                    long size = channel.size();
                                    try {
                                        if (i0.I1(null, ((Integer) FileDescriptor.class.getDeclaredMethod("getInt$", null).invoke(fileInputStream2.getFD(), null)).intValue())) {
                                            if (this.b != null) {
                                                i0.g3(new bf(this, 3));
                                            }
                                            if (channel2 != null) {
                                                channel2.close();
                                            }
                                            try {
                                                channel.close();
                                                try {
                                                    fileInputStream2.close();
                                                    return;
                                                } catch (Exception e) {
                                                    e = e;
                                                    f8.g(e, z11);
                                                    file3.delete();
                                                    return;
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                z10 = true;
                                                fileInputStream = fileInputStream2;
                                                th2 = th;
                                                try {
                                                    fileInputStream.close();
                                                    throw th2;
                                                } catch (Throwable th5) {
                                                    th2.addSuppressed(th5);
                                                    throw th2;
                                                }
                                            }
                                        }
                                    } catch (Throwable th6) {
                                        f8.g(th6, true);
                                    }
                                    long j10 = 0;
                                    long j11 = 0;
                                    while (j10 < size) {
                                        if (this.f) {
                                            break;
                                        }
                                        z10 = z11;
                                        fileInputStream = fileInputStream2;
                                        try {
                                            channel2.transferFrom(channel, j10, Math.min(4096L, size - j10));
                                            long j12 = 4096 + j10;
                                            if (j12 < size && j11 > SystemClock.elapsedRealtime() - 500) {
                                                j10 = j12;
                                                z11 = z10;
                                                fileInputStream2 = fileInputStream;
                                            }
                                            long elapsedRealtime = SystemClock.elapsedRealtime();
                                            i0.g3(new af(this, (int) ((((100.0f / this.c.size()) * j10) / size) + this.e), 1));
                                            j11 = elapsedRealtime;
                                            j10 = j12;
                                            z11 = z10;
                                            fileInputStream2 = fileInputStream;
                                        } catch (Throwable th7) {
                                            th = th7;
                                            Throwable th8 = th;
                                            if (channel2 != null) {
                                                throw th8;
                                            }
                                            try {
                                                channel2.close();
                                                throw th8;
                                            } catch (Throwable th9) {
                                                th8.addSuppressed(th9);
                                                throw th8;
                                            }
                                        }
                                    }
                                    z10 = z11;
                                    fileInputStream = fileInputStream2;
                                } catch (Throwable th10) {
                                    th = th10;
                                    z10 = z11;
                                    fileInputStream = fileInputStream2;
                                    Throwable th82 = th;
                                    if (channel2 != null) {
                                    }
                                }
                            } catch (Throwable th11) {
                                th = th11;
                                Throwable th12 = th;
                                if (channel != null) {
                                    throw th12;
                                }
                                try {
                                    channel.close();
                                    throw th12;
                                } catch (Throwable th13) {
                                    th12.addSuppressed(th13);
                                    throw th12;
                                }
                            }
                        } catch (Throwable th14) {
                            th = th14;
                            z10 = true;
                            fileInputStream = fileInputStream2;
                            Throwable th122 = th;
                            if (channel != null) {
                            }
                        }
                    } catch (Throwable th15) {
                        th = th15;
                        th2 = th;
                        fileInputStream.close();
                        throw th2;
                    }
                } catch (Throwable th16) {
                    th = th16;
                    file3 = file2;
                }
            } catch (Exception e7) {
                e = e7;
                z11 = z10;
            }
        } catch (Exception e10) {
            e = e10;
            file3 = file2;
        }
        if (this.f) {
            if (channel2 != null) {
                channel2.close();
            }
            channel.close();
            fileInputStream.close();
            file3.delete();
            return;
        }
        if (this.w) {
            i0.d(file3);
        } else {
            DownloadManager downloadManager = (DownloadManager) w0.b.getSystemService("download");
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
        i0.g3(new af(this, (int) size2, 2));
        if (channel2 != null) {
            channel2.close();
        }
        channel.close();
        fileInputStream.close();
    }

    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final boolean b(jj jjVar) {
        TLRPC.MessageMedia o12;
        TLRPC.Photo photo;
        TLRPC.PhotoSize w9;
        boolean z10 = false;
        if (!jjVar.D3() || (o12 = jj.o1(jjVar.k)) == null || (photo = o12.photo) == null || o12.document == null || (w9 = b8.w(photo.sizes, i0.Z0(true), false, null, true)) == null) {
            return false;
        }
        b8.G(this.a.a);
        File K = b8.K(w9, null, false, true);
        File K2 = b8.K(o12.document, null, false, true);
        ?? r22 = (K == null || !K.exists()) ? 1 : 0;
        ?? r62 = (K2 == null || !K2.exists()) ? 1 : 0;
        int i10 = r22 + r62;
        if (i10 > 0) {
            this.r = new CountDownLatch(i10);
            i0.g3(new kh(this, (boolean) r22, w9, jjVar, o12.photo, (boolean) r62, o12.document));
            this.r.await();
        }
        if (!this.f) {
            if (K == null || !K.exists()) {
                K = b8.K(w9, null, true, true);
            }
            if (K2 == null || !K2.exists()) {
                K2 = b8.K(o12.document, null, true, true);
            }
            if (K != null && K.exists() && K2 != null && K2.exists()) {
                String D = b8.D(K);
                if (TextUtils.isEmpty(D)) {
                    D = "jpg";
                }
                String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(D.toLowerCase());
                if (TextUtils.isEmpty(mimeTypeFromExtension)) {
                    mimeTypeFromExtension = "image/jpeg";
                }
                String p02 = i0.p0(0, D);
                if (Build.VERSION.SDK_INT >= 29) {
                    ContentValues contentValues = new ContentValues();
                    Uri contentUri = MediaStore.Downloads.getContentUri("external_primary");
                    contentValues.put("relative_path", new File(Environment.DIRECTORY_DOWNLOADS, "Telegram") + File.separator);
                    contentValues.put("_display_name", p02);
                    contentValues.put("mime_type", mimeTypeFromExtension);
                    Uri insert = w0.b.getContentResolver().insert(contentUri, contentValues);
                    if (insert != null) {
                        OutputStream openOutputStream = w0.b.getContentResolver().openOutputStream(insert);
                        if (openOutputStream != null) {
                            try {
                                MediaController.H0(K, K2, openOutputStream, null);
                                z10 = !this.f;
                            } finally {
                            }
                        }
                        if (openOutputStream != null) {
                            openOutputStream.close();
                        }
                        if (z10) {
                            this.n++;
                        } else {
                            try {
                                w0.b.getContentResolver().delete(insert, null, null);
                            } catch (Exception unused) {
                            }
                        }
                    }
                } else {
                    File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "Telegram");
                    file.mkdirs();
                    File file2 = new File(file, p02);
                    if (!file2.exists()) {
                        file2.createNewFile();
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    try {
                        MediaController.H0(K, K2, fileOutputStream, null);
                        fileOutputStream.close();
                        if (this.f) {
                            file2.delete();
                        } else {
                            ((DownloadManager) w0.b.getSystemService("download")).addCompletedDownload(file2.getName(), file2.getName(), false, mimeTypeFromExtension, file2.getAbsolutePath(), file2.length(), true);
                            this.n++;
                        }
                    } finally {
                    }
                }
                float size = (100.0f / this.c.size()) + this.e;
                this.e = size;
                i0.g3(new af(this, (int) size, 3));
                return true;
            }
        }
        return true;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        HashMap hashMap = this.d;
        if (i10 == zs.Y1 || i10 == zs.Z1) {
            if (hashMap.remove((String) objArr[0]) != null) {
                this.r.countDown();
            }
        } else if (i10 == zs.X1 && hashMap.containsKey((String) objArr[0])) {
            i0.g3(new af(this, (int) a1.g.c(((Long) objArr[1]).longValue() / ((Long) objArr[2]).longValue(), this.c.size(), 100.0f, this.e), 0));
        }
    }
}
