package org.telegram.messenger;

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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class cc extends AsyncTask {
    public static final /* synthetic */ int i = 0;
    public final vb a;
    public RandomAccessFile b;
    public long c;
    public long d;
    public boolean e;
    public final String f;
    public HttpURLConnection g;
    public final /* synthetic */ hc h;

    public cc(hc hcVar, vb vbVar, long j10) {
        this.h = hcVar;
        this.e = true;
        this.a = vbVar;
        this.c = j10;
    }

    public final void a(long j10, long j11) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (j10 != j11) {
            long j12 = this.d;
            if (j12 != 0 && j12 >= elapsedRealtime - 100) {
                return;
            }
        }
        this.d = elapsedRealtime;
        Utilities.d.c(new bc(this, j10, j11, 0));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:0|1|(9:99|100|(6:102|(1:104)|105|(1:107)|108|(15:110|112|113|4|(6:34|35|(1:43)|45|(3:49|50|(1:58))|(4:63|64|65|(4:68|69|(3:71|(3:73|74|75)(1:77)|76)(3:78|79|(4:81|82|(1:84)|86))|66)))|6|7|(1:9)|11|12|(1:14)|(2:26|27)|(1:22)|23|24))|140|(1:146)|105|(0)|108|(0))|3|4|(0)|6|7|(0)|11|12|(0)|(0)|(3:18|20|22)|23|24|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0192, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0193, code lost:
    
        org.telegram.messenger.f8.g(r2, true);
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x008c A[Catch: all -> 0x0022, TRY_LEAVE, TryCatch #2 {all -> 0x0022, blocks: (B:100:0x000d, B:102:0x0019, B:105:0x005c, B:108:0x0063, B:110:0x008c, B:140:0x0026, B:144:0x0034, B:146:0x0040), top: B:99:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x019a A[Catch: all -> 0x019d, TRY_LEAVE, TryCatch #10 {all -> 0x019d, blocks: (B:12:0x0196, B:14:0x019a), top: B:11:0x0196 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x019f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x018c A[Catch: all -> 0x0192, TRY_LEAVE, TryCatch #1 {all -> 0x0192, blocks: (B:7:0x0188, B:9:0x018c), top: B:6:0x0188 }] */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doInBackground(Object[] objArr) {
        InputStream inputStream;
        boolean z10;
        InputStream inputStream2;
        String str;
        b30 b30Var;
        String str2;
        HttpURLConnection httpURLConnection;
        List<String> list;
        String str3;
        int responseCode;
        File file;
        HttpURLConnection httpURLConnection2;
        RandomAccessFile randomAccessFile;
        boolean isCancelled = isCancelled();
        vb vbVar = this.a;
        boolean z11 = false;
        if (!isCancelled) {
            try {
                str = vbVar.i.g;
            } catch (Throwable th2) {
                th = th2;
                inputStream = null;
            }
            if (!str.startsWith("https://static-maps")) {
                if (str.startsWith("https://maps.googleapis")) {
                }
                str2 = this.f;
                if (str2 != null) {
                    str = str2;
                }
                HttpURLConnection httpURLConnection3 = (HttpURLConnection) new URL(str).openConnection();
                this.g = httpURLConnection3;
                httpURLConnection3.addRequestProperty("User-Agent", "Mozilla/5.0 (iPhone; CPU iPhone OS 10_0 like Mac OS X) AppleWebKit/602.1.38 (KHTML, like Gecko) Version/10.0 Mobile/14A5297c Safari/602.1");
                this.g.setConnectTimeout(5000);
                this.g.setReadTimeout(5000);
                this.g.setInstanceFollowRedirects(true);
                if (!isCancelled()) {
                    this.g.connect();
                    inputStream2 = this.g.getInputStream();
                    try {
                        this.b = new RandomAccessFile(vbVar.q, "rws");
                    } catch (Throwable th3) {
                        inputStream = inputStream2;
                        th = th3;
                        if (th instanceof SocketTimeoutException) {
                            if (w0.s()) {
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
                            z10 = true;
                            f8.g(th, z10);
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
                            if (z11) {
                            }
                            return Boolean.valueOf(z11);
                        }
                        z10 = false;
                        f8.g(th, z10);
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
                        if (z11) {
                        }
                        return Boolean.valueOf(z11);
                    }
                    if (!isCancelled()) {
                        try {
                            HttpURLConnection httpURLConnection4 = this.g;
                            if (httpURLConnection4 != null && (responseCode = httpURLConnection4.getResponseCode()) != 200 && responseCode != 202 && responseCode != 304) {
                                this.e = false;
                            }
                        } catch (Exception e) {
                            f8.g(e, false);
                        }
                        if (this.c == 0 && (httpURLConnection = this.g) != null) {
                            try {
                                Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                                if (headerFields != null && (list = headerFields.get("content-Length")) != null && !list.isEmpty() && (str3 = list.get(0)) != null) {
                                    this.c = Utilities.z(str3).intValue();
                                }
                            } catch (Exception e7) {
                                f8.g(e7, true);
                            }
                        }
                        if (inputStream2 != null) {
                            try {
                                byte[] bArr = new byte[TLObject.FLAG_13];
                                int i10 = 0;
                                while (!isCancelled()) {
                                    try {
                                        int read = inputStream2.read(bArr);
                                        if (read > 0) {
                                            i10 += read;
                                            this.b.write(bArr, 0, read);
                                            long j10 = this.c;
                                            if (j10 != 0) {
                                                a(i10, j10);
                                            }
                                        } else if (read == -1) {
                                            try {
                                                long j11 = this.c;
                                                if (j11 != 0) {
                                                    a(j11, j11);
                                                }
                                                z11 = true;
                                            } catch (Exception e10) {
                                                e = e10;
                                                z11 = true;
                                                f8.g(e, true);
                                                randomAccessFile = this.b;
                                                if (randomAccessFile != null) {
                                                }
                                                httpURLConnection2 = this.g;
                                                if (httpURLConnection2 != null) {
                                                }
                                                if (inputStream2 != null) {
                                                }
                                                if (z11) {
                                                }
                                                return Boolean.valueOf(z11);
                                            } catch (Throwable th4) {
                                                th = th4;
                                                z11 = true;
                                                f8.g(th, true);
                                                randomAccessFile = this.b;
                                                if (randomAccessFile != null) {
                                                }
                                                httpURLConnection2 = this.g;
                                                if (httpURLConnection2 != null) {
                                                }
                                                if (inputStream2 != null) {
                                                }
                                                if (z11) {
                                                }
                                                return Boolean.valueOf(z11);
                                            }
                                        }
                                    } catch (Exception e11) {
                                        e = e11;
                                    }
                                }
                            } catch (Throwable th5) {
                                th = th5;
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
                        } catch (Throwable th6) {
                            f8.g(th6, true);
                        }
                    }
                    if (z11 && (file = vbVar.q) != null && !file.renameTo(vbVar.p)) {
                        vbVar.p = vbVar.q;
                    }
                    return Boolean.valueOf(z11);
                }
            }
            int i11 = vp.r1(vbVar.o).m3;
            if ((i11 == 3 || i11 == 4) && (b30Var = (b30) this.h.A.get(str)) != null) {
                TLRPC.TL_upload_getWebFile tL_upload_getWebFile = new TLRPC.TL_upload_getWebFile();
                tL_upload_getWebFile.location = b30Var.b;
                tL_upload_getWebFile.offset = 0;
                tL_upload_getWebFile.limit = 0;
                ConnectionsManager.getInstance(vbVar.o).sendRequest(tL_upload_getWebFile, new ag.c3(5));
            }
            str2 = this.f;
            if (str2 != null) {
            }
            HttpURLConnection httpURLConnection32 = (HttpURLConnection) new URL(str).openConnection();
            this.g = httpURLConnection32;
            httpURLConnection32.addRequestProperty("User-Agent", "Mozilla/5.0 (iPhone; CPU iPhone OS 10_0 like Mac OS X) AppleWebKit/602.1.38 (KHTML, like Gecko) Version/10.0 Mobile/14A5297c Safari/602.1");
            this.g.setConnectTimeout(5000);
            this.g.setReadTimeout(5000);
            this.g.setInstanceFollowRedirects(true);
            if (!isCancelled()) {
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
        if (z11) {
            vbVar.p = vbVar.q;
        }
        return Boolean.valueOf(z11);
    }

    @Override // android.os.AsyncTask
    public final void onCancelled() {
        this.h.s.d(new zb(this, 0), this.a.a);
        Utilities.d.c(new zb(this, 1));
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool.booleanValue() || !this.e) {
            hc hcVar = this.h;
            vb vbVar = this.a;
            hcVar.s.c(new cg(hcVar, vbVar.e, 0, vbVar.p, 5));
        } else {
            hc hcVar2 = this.h;
            hcVar2.s.c(new ib(hcVar2, this.a.e, 4));
        }
        Utilities.d.c(new ac(this, bool, 0));
        this.h.s.d(new zb(this, 2), this.a.a);
    }

    public cc(hc hcVar, vb vbVar, String str) {
        this.h = hcVar;
        this.e = true;
        this.a = vbVar;
        this.c = 0;
        this.f = str;
    }
}
