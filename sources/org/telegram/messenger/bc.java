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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class bc extends AsyncTask {
    public static final /* synthetic */ int i = 0;
    public final ub a;
    public RandomAccessFile b;
    public long c;
    public long d;
    public boolean e;
    public final String f;
    public HttpURLConnection g;
    public final /* synthetic */ gc h;

    public bc(gc gcVar, ub ubVar, long j3) {
        this.h = gcVar;
        this.e = true;
        this.a = ubVar;
        this.c = j3;
    }

    public final void a(long j3, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (j3 != j10) {
            long j11 = this.d;
            if (j11 != 0 && j11 >= elapsedRealtime - 100) {
                return;
            }
        }
        this.d = elapsedRealtime;
        Utilities.d.c(new ac(this, j3, j10, 0));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:0|1|(9:99|100|(6:102|(1:104)|105|(1:107)|108|(15:110|112|113|4|(6:34|35|(1:43)|45|(3:49|50|(1:58))|(4:63|64|65|(4:68|69|(3:71|(3:73|74|75)(1:77)|76)(3:78|79|(4:81|82|(1:84)|86))|66)))|6|7|(1:9)|11|12|(1:14)|(2:26|27)|(1:22)|23|24))|140|(1:146)|105|(0)|108|(0))|3|4|(0)|6|7|(0)|11|12|(0)|(0)|(3:18|20|22)|23|24|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0193, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0194, code lost:
    
        org.telegram.messenger.a8.g(r2, true);
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x008d A[Catch: all -> 0x0022, TRY_LEAVE, TryCatch #1 {all -> 0x0022, blocks: (B:100:0x000d, B:102:0x0019, B:105:0x005d, B:108:0x0064, B:110:0x008d, B:140:0x0026, B:144:0x0034, B:146:0x0040), top: B:99:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x019b A[Catch: all -> 0x019e, TRY_LEAVE, TryCatch #10 {all -> 0x019e, blocks: (B:12:0x0197, B:14:0x019b), top: B:11:0x0197 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x018d A[Catch: all -> 0x0193, TRY_LEAVE, TryCatch #2 {all -> 0x0193, blocks: (B:7:0x0189, B:9:0x018d), top: B:6:0x0189 }] */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doInBackground(Object[] objArr) {
        InputStream inputStream;
        boolean z9;
        InputStream inputStream2;
        String str;
        m20 m20Var;
        String str2;
        HttpURLConnection httpURLConnection;
        List<String> list;
        String str3;
        int responseCode;
        File file;
        HttpURLConnection httpURLConnection2;
        RandomAccessFile randomAccessFile;
        boolean isCancelled = isCancelled();
        ub ubVar = this.a;
        boolean z10 = false;
        if (!isCancelled) {
            try {
                str = ubVar.i.g;
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
                        this.b = new RandomAccessFile(ubVar.q, "rws");
                    } catch (Throwable th3) {
                        inputStream = inputStream2;
                        th = th3;
                        if (th instanceof SocketTimeoutException) {
                            if (t0.s()) {
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
                            z9 = true;
                            a8.g(th, z9);
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
                            if (z10) {
                            }
                            return Boolean.valueOf(z10);
                        }
                        z9 = false;
                        a8.g(th, z9);
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
                        if (z10) {
                        }
                        return Boolean.valueOf(z10);
                    }
                    if (!isCancelled()) {
                        try {
                            HttpURLConnection httpURLConnection4 = this.g;
                            if (httpURLConnection4 != null && (responseCode = httpURLConnection4.getResponseCode()) != 200 && responseCode != 202 && responseCode != 304) {
                                this.e = false;
                            }
                        } catch (Exception e10) {
                            a8.g(e10, false);
                        }
                        if (this.c == 0 && (httpURLConnection = this.g) != null) {
                            try {
                                Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                                if (headerFields != null && (list = headerFields.get("content-Length")) != null && !list.isEmpty() && (str3 = list.get(0)) != null) {
                                    this.c = Utilities.z(str3).intValue();
                                }
                            } catch (Exception e11) {
                                a8.g(e11, true);
                            }
                        }
                        if (inputStream2 != null) {
                            try {
                                byte[] bArr = new byte[TLObject.FLAG_13];
                                int i7 = 0;
                                while (!isCancelled()) {
                                    try {
                                        int read = inputStream2.read(bArr);
                                        if (read > 0) {
                                            i7 += read;
                                            this.b.write(bArr, 0, read);
                                            long j3 = this.c;
                                            if (j3 != 0) {
                                                a(i7, j3);
                                            }
                                        } else if (read == -1) {
                                            try {
                                                long j10 = this.c;
                                                if (j10 != 0) {
                                                    a(j10, j10);
                                                }
                                                z10 = true;
                                            } catch (Exception e12) {
                                                e = e12;
                                                z10 = true;
                                                a8.g(e, true);
                                                randomAccessFile = this.b;
                                                if (randomAccessFile != null) {
                                                }
                                                httpURLConnection2 = this.g;
                                                if (httpURLConnection2 != null) {
                                                }
                                                if (inputStream2 != null) {
                                                }
                                                if (z10) {
                                                }
                                                return Boolean.valueOf(z10);
                                            } catch (Throwable th4) {
                                                th = th4;
                                                z10 = true;
                                                a8.g(th, true);
                                                randomAccessFile = this.b;
                                                if (randomAccessFile != null) {
                                                }
                                                httpURLConnection2 = this.g;
                                                if (httpURLConnection2 != null) {
                                                }
                                                if (inputStream2 != null) {
                                                }
                                                if (z10) {
                                                }
                                                return Boolean.valueOf(z10);
                                            }
                                        }
                                    } catch (Exception e13) {
                                        e = e13;
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
                            a8.g(th6, true);
                        }
                    }
                    if (z10 && (file = ubVar.q) != null && !file.renameTo(ubVar.p)) {
                        ubVar.p = ubVar.q;
                    }
                    return Boolean.valueOf(z10);
                }
            }
            int i10 = qp.s1(ubVar.o).m3;
            if ((i10 == 3 || i10 == 4) && (m20Var = (m20) this.h.A.get(str)) != null) {
                TLRPC.TL_upload_getWebFile tL_upload_getWebFile = new TLRPC.TL_upload_getWebFile();
                tL_upload_getWebFile.location = m20Var.b;
                tL_upload_getWebFile.offset = 0;
                tL_upload_getWebFile.limit = 0;
                ConnectionsManager.getInstance(ubVar.o).sendRequest(tL_upload_getWebFile, new di.v5(10));
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
        if (z10) {
            ubVar.p = ubVar.q;
        }
        return Boolean.valueOf(z10);
    }

    @Override // android.os.AsyncTask
    public final void onCancelled() {
        this.h.s.d(new yb(this, 0), this.a.a);
        Utilities.d.c(new yb(this, 1));
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool.booleanValue() || !this.e) {
            gc gcVar = this.h;
            ub ubVar = this.a;
            gcVar.s.c(new dg(gcVar, ubVar.e, 0, ubVar.p, 5));
        } else {
            gc gcVar2 = this.h;
            gcVar2.s.c(new ib(gcVar2, this.a.e, 4));
        }
        Utilities.d.c(new zb(this, bool, 0));
        this.h.s.d(new yb(this, 2), this.a.a);
    }

    public bc(gc gcVar, ub ubVar, String str) {
        this.h = gcVar;
        this.e = true;
        this.a = ubVar;
        this.c = 0;
        this.f = str;
    }
}
