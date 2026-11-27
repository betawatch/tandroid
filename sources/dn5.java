// default package

import android.os.AsyncTask;
import android.os.SystemClock;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class dn5 extends AsyncTask {
    public final wm5 a;
    public RandomAccessFile b;
    public long c;
    public long d;
    public boolean e;
    public final String f;
    public HttpURLConnection g;
    public final /* synthetic */ in5 h;

    public dn5(in5 in5Var, wm5 wm5Var, String str) {
        this.h = in5Var;
        this.e = true;
        this.a = wm5Var;
        this.c = 0L;
        this.f = str;
    }

    public final void a(long j, long j2) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (j != j2) {
            long j3 = this.d;
            if (j3 != 0 && j3 >= elapsedRealtime - 100) {
                return;
            }
        }
        this.d = elapsedRealtime;
        Utilities.d.c(new cn5(this, j, j2, (byte) 0));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:0|1|(7:99|100|(1:145)|104|(1:106)|107|(15:109|111|112|4|(6:34|35|(1:43)|45|(3:49|50|(1:58))|(4:63|64|65|(4:68|69|(3:71|(3:73|74|75)(1:77)|76)(3:78|79|(4:81|82|(1:84)|86))|66)))|6|7|(1:9)|11|12|(1:14)|(2:26|27)|(1:22)|23|24))|3|4|(0)|6|7|(0)|11|12|(0)|(0)|(3:18|20|22)|23|24|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x018b, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x018c, code lost:
    
        cc4.g(r2, true);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0193 A[Catch: all -> 0x0196, TRY_LEAVE, TryCatch #3 {all -> 0x0196, blocks: (B:12:0x018f, B:14:0x0193), top: B:11:0x018f }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0198 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0185 A[Catch: all -> 0x018b, TRY_LEAVE, TryCatch #5 {all -> 0x018b, blocks: (B:7:0x0181, B:9:0x0185), top: B:6:0x0181 }] */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doInBackground(Object[] objArr) {
        InputStream inputStream;
        boolean z;
        InputStream inputStream2;
        int i;
        jxc jxcVar;
        HttpURLConnection httpURLConnection;
        List<String> list;
        String str;
        int responseCode;
        File file;
        HttpURLConnection httpURLConnection2;
        RandomAccessFile randomAccessFile;
        boolean isCancelled = isCancelled();
        wm5 wm5Var = this.a;
        boolean z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        if (!isCancelled) {
            try {
                String str2 = wm5Var.i.g;
                if ((str2.startsWith("https://static-maps") || str2.startsWith("https://maps.googleapis")) && (((i = uc7.s1(wm5Var.o).f3) == 3 || i == 4) && (jxcVar = (jxc) this.h.A.get(str2)) != null)) {
                    TLRPC.TL_upload_getWebFile tL_upload_getWebFile = new TLRPC.TL_upload_getWebFile();
                    tL_upload_getWebFile.location = jxcVar.b;
                    tL_upload_getWebFile.offset = 0;
                    tL_upload_getWebFile.limit = 0;
                    ConnectionsManager.getInstance(wm5Var.o).sendRequest(tL_upload_getWebFile, new xe2(z2 ? (byte) 1 : (byte) 0));
                }
                String str3 = this.f;
                if (str3 != null) {
                    str2 = str3;
                }
                HttpURLConnection httpURLConnection3 = (HttpURLConnection) new URL(str2).openConnection();
                this.g = httpURLConnection3;
                httpURLConnection3.addRequestProperty("User-Agent", "Mozilla/5.0 (iPhone; CPU iPhone OS 10_0 like Mac OS X) AppleWebKit/602.1.38 (KHTML, like Gecko) Version/10.0 Mobile/14A5297c Safari/602.1");
                this.g.setConnectTimeout(5000);
                this.g.setReadTimeout(5000);
                this.g.setInstanceFollowRedirects(true);
            } catch (Throwable th) {
                th = th;
                inputStream = null;
            }
            if (!isCancelled()) {
                this.g.connect();
                inputStream2 = this.g.getInputStream();
                try {
                    this.b = new RandomAccessFile(wm5Var.q, "rws");
                } catch (Throwable th2) {
                    inputStream = inputStream2;
                    th = th2;
                    if (th instanceof SocketTimeoutException) {
                        if (a.r()) {
                            this.e = false;
                        }
                    } else if (th instanceof UnknownHostException) {
                        this.e = false;
                    } else if (th instanceof SocketException) {
                        if (th.getMessage() != null && th.getMessage().contains("ECONNRESET")) {
                            this.e = false;
                        }
                    } else if (th instanceof FileNotFoundException) {
                        this.e = false;
                    } else if (!(th instanceof InterruptedIOException)) {
                        z = true;
                        cc4.g(th, z);
                        inputStream2 = inputStream;
                        if (!isCancelled()) {
                        }
                        randomAccessFile = this.b;
                        if (randomAccessFile != null) {
                        }
                        httpURLConnection2 = this.g;
                        if (httpURLConnection2 != null) {
                        }
                        if (inputStream2 != null) {
                        }
                        if (z2) {
                        }
                        return Boolean.valueOf(z2);
                    }
                    z = false;
                    cc4.g(th, z);
                    inputStream2 = inputStream;
                    if (!isCancelled()) {
                    }
                    randomAccessFile = this.b;
                    if (randomAccessFile != null) {
                    }
                    httpURLConnection2 = this.g;
                    if (httpURLConnection2 != null) {
                    }
                    if (inputStream2 != null) {
                    }
                    if (z2) {
                    }
                    return Boolean.valueOf(z2);
                }
                if (!isCancelled()) {
                    try {
                        HttpURLConnection httpURLConnection4 = this.g;
                        if (httpURLConnection4 != null && (responseCode = httpURLConnection4.getResponseCode()) != 200 && responseCode != 202 && responseCode != 304) {
                            this.e = false;
                        }
                    } catch (Exception e) {
                        cc4.g(e, false);
                    }
                    if (this.c == 0 && (httpURLConnection = this.g) != null) {
                        try {
                            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                            if (headerFields != null && (list = headerFields.get("content-Length")) != null && !list.isEmpty() && (str = list.get(0)) != null) {
                                this.c = Utilities.z(str).intValue();
                            }
                        } catch (Exception e2) {
                            cc4.g(e2, true);
                        }
                    }
                    if (inputStream2 != null) {
                        try {
                            byte[] bArr = new byte[TLObject.FLAG_13];
                            int i2 = 0;
                            while (!isCancelled()) {
                                try {
                                    int read = inputStream2.read(bArr);
                                    if (read > 0) {
                                        i2 += read;
                                        this.b.write(bArr, 0, read);
                                        long j = this.c;
                                        if (j != 0) {
                                            a(i2, j);
                                        }
                                    } else if (read == -1) {
                                        try {
                                            long j2 = this.c;
                                            if (j2 != 0) {
                                                a(j2, j2);
                                            }
                                            z2 = true;
                                        } catch (Exception e3) {
                                            e = e3;
                                            z2 = true;
                                            cc4.g(e, true);
                                            randomAccessFile = this.b;
                                            if (randomAccessFile != null) {
                                            }
                                            httpURLConnection2 = this.g;
                                            if (httpURLConnection2 != null) {
                                            }
                                            if (inputStream2 != null) {
                                            }
                                            if (z2) {
                                            }
                                            return Boolean.valueOf(z2);
                                        } catch (Throwable th3) {
                                            th = th3;
                                            z2 = true;
                                            cc4.g(th, true);
                                            randomAccessFile = this.b;
                                            if (randomAccessFile != null) {
                                            }
                                            httpURLConnection2 = this.g;
                                            if (httpURLConnection2 != null) {
                                            }
                                            if (inputStream2 != null) {
                                            }
                                            if (z2) {
                                            }
                                            return Boolean.valueOf(z2);
                                        }
                                    }
                                } catch (Exception e4) {
                                    e = e4;
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    }
                }
                randomAccessFile = this.b;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                    this.b = null;
                }
                httpURLConnection2 = this.g;
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (Throwable th5) {
                        cc4.g(th5, true);
                    }
                }
                if (z2 && (file = wm5Var.q) != null && !file.renameTo(wm5Var.p)) {
                    wm5Var.p = wm5Var.q;
                }
                return Boolean.valueOf(z2);
            }
        }
        inputStream2 = null;
        if (!isCancelled()) {
        }
        randomAccessFile = this.b;
        if (randomAccessFile != null) {
        }
        httpURLConnection2 = this.g;
        if (httpURLConnection2 != null) {
        }
        if (inputStream2 != null) {
        }
        if (z2) {
            wm5Var.p = wm5Var.q;
        }
        return Boolean.valueOf(z2);
    }

    @Override // android.os.AsyncTask
    public final void onCancelled() {
        this.h.s.d(new an5(this, (byte) 0), this.a.a ? 1L : 0L);
        Utilities.d.c(new an5(this, (byte) 1));
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Boolean bool = (Boolean) obj;
        byte b = 0;
        if (bool.booleanValue() || !this.e) {
            in5 in5Var = this.h;
            wm5 wm5Var = this.a;
            String str = wm5Var.e;
            File file = wm5Var.p;
            ThreadLocal threadLocal = in5.I;
            in5Var.s.c(new av2(in5Var, str, 0, file, (byte) 1));
        } else {
            in5 in5Var2 = this.h;
            String str2 = this.a.e;
            ThreadLocal threadLocal2 = in5.I;
            in5Var2.s.c(new mm5(in5Var2, str2, b));
        }
        Utilities.d.c(new bn5(this, bool, b));
        this.h.s.d(new an5(this, (byte) 2), this.a.a ? 1L : 0L);
    }

    public dn5(in5 in5Var, wm5 wm5Var, long j) {
        this.h = in5Var;
        this.e = true;
        this.a = wm5Var;
        this.c = j;
    }
}
