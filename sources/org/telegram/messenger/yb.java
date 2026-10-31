package org.telegram.messenger;

import android.os.AsyncTask;
import android.os.SystemClock;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class yb extends AsyncTask {
    public final String a;
    public final File b;
    public final String c;
    public int d;
    public RandomAccessFile e = null;
    public boolean f = true;
    public long g;
    public final int h;
    public final /* synthetic */ hc i;

    public yb(hc hcVar, String str, File file, String str2, int i10) {
        this.i = hcVar;
        this.a = str;
        this.b = file;
        this.c = str2;
        this.h = i10;
    }

    public final void a(long j10, long j11) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (j10 != j11) {
            long j12 = this.g;
            if (j12 != 0 && j12 >= elapsedRealtime - 100) {
                return;
            }
        }
        this.g = elapsedRealtime;
        Utilities.d.c(new xb(this, j10, j11, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0145 A[Catch: all -> 0x014b, TRY_LEAVE, TryCatch #7 {all -> 0x014b, blocks: (B:72:0x0141, B:74:0x0145), top: B:71:0x0141 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0151 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doInBackground(Object[] objArr) {
        InputStream inputStream;
        URLConnection uRLConnection;
        InputStream inputStream2;
        List<String> list;
        String str;
        RandomAccessFile randomAccessFile;
        int responseCode;
        boolean z10 = false;
        try {
            uRLConnection = new URL(this.a).openConnection();
            try {
                uRLConnection.addRequestProperty("User-Agent", "Mozilla/5.0 (iPhone; CPU iPhone OS 10_0 like Mac OS X) AppleWebKit/602.1.38 (KHTML, like Gecko) Version/10.0 Mobile/14A5297c Safari/602.1");
                uRLConnection.setConnectTimeout(5000);
                uRLConnection.setReadTimeout(5000);
                if (uRLConnection instanceof HttpURLConnection) {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
                    httpURLConnection.setInstanceFollowRedirects(true);
                    int responseCode2 = httpURLConnection.getResponseCode();
                    if (responseCode2 == 302 || responseCode2 == 301 || responseCode2 == 303) {
                        String headerField = httpURLConnection.getHeaderField("Location");
                        String headerField2 = httpURLConnection.getHeaderField("Set-Cookie");
                        uRLConnection = new URL(headerField).openConnection();
                        uRLConnection.setRequestProperty("Cookie", headerField2);
                        uRLConnection.addRequestProperty("User-Agent", "Mozilla/5.0 (iPhone; CPU iPhone OS 10_0 like Mac OS X) AppleWebKit/602.1.38 (KHTML, like Gecko) Version/10.0 Mobile/14A5297c Safari/602.1");
                    }
                }
                uRLConnection.connect();
                inputStream2 = uRLConnection.getInputStream();
            } catch (Throwable th2) {
                th = th2;
                inputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
            uRLConnection = null;
        }
        try {
            this.e = new RandomAccessFile(this.b, "rws");
        } catch (Throwable th4) {
            inputStream = inputStream2;
            th = th4;
            if (th instanceof SocketTimeoutException) {
                if (w0.s()) {
                    this.f = false;
                }
            } else if (th instanceof UnknownHostException) {
                this.f = false;
            } else if (th instanceof SocketException) {
                if (th.getMessage() != null && th.getMessage().contains("ECONNRESET")) {
                    this.f = false;
                }
            } else if (th instanceof FileNotFoundException) {
                this.f = false;
            }
            f8.g(th, true);
            inputStream2 = inputStream;
            if (this.f) {
            }
            return Boolean.valueOf(z10);
        }
        if (this.f) {
            try {
                if ((uRLConnection instanceof HttpURLConnection) && (responseCode = ((HttpURLConnection) uRLConnection).getResponseCode()) != 200 && responseCode != 202 && responseCode != 304) {
                    this.f = false;
                }
            } catch (Exception e) {
                f8.g(e, true);
            }
            if (uRLConnection != null) {
                try {
                    Map<String, List<String>> headerFields = uRLConnection.getHeaderFields();
                    if (headerFields != null && (list = headerFields.get("content-Length")) != null && !list.isEmpty() && (str = list.get(0)) != null) {
                        this.d = Utilities.z(str).intValue();
                    }
                } catch (Exception e7) {
                    f8.g(e7, true);
                }
            }
            if (inputStream2 != null) {
                try {
                    byte[] bArr = new byte[32768];
                    int i10 = 0;
                    while (!isCancelled()) {
                        try {
                            int read = inputStream2.read(bArr);
                            if (read > 0) {
                                this.e.write(bArr, 0, read);
                                i10 += read;
                                int i11 = this.d;
                                if (i11 > 0) {
                                    a(i10, i11);
                                }
                            } else if (read == -1) {
                                try {
                                    int i12 = this.d;
                                    if (i12 != 0) {
                                        long j10 = i12;
                                        a(j10, j10);
                                    }
                                    z10 = true;
                                } catch (Exception e10) {
                                    e = e10;
                                    z10 = true;
                                    f8.g(e, true);
                                    randomAccessFile = this.e;
                                    if (randomAccessFile != null) {
                                    }
                                    if (inputStream2 != null) {
                                    }
                                    return Boolean.valueOf(z10);
                                } catch (Throwable th5) {
                                    th = th5;
                                    z10 = true;
                                    f8.g(th, true);
                                    randomAccessFile = this.e;
                                    if (randomAccessFile != null) {
                                    }
                                    if (inputStream2 != null) {
                                    }
                                    return Boolean.valueOf(z10);
                                }
                            }
                        } catch (Exception e11) {
                            e = e11;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            }
            try {
                randomAccessFile = this.e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                    this.e = null;
                }
            } catch (Throwable th7) {
                f8.g(th7, true);
            }
            if (inputStream2 != null) {
                try {
                    inputStream2.close();
                } catch (Throwable th8) {
                    f8.g(th8, true);
                }
            }
        }
        return Boolean.valueOf(z10);
    }

    @Override // android.os.AsyncTask
    public final void onCancelled() {
        this.i.U(this, 2);
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        this.i.U(this, ((Boolean) obj).booleanValue() ? 2 : 1);
    }
}
