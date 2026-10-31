package org.telegram.messenger;

import android.net.Uri;
import android.os.AsyncTask;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class ub extends AsyncTask {
    public final vb a;
    public boolean b = true;
    public HttpURLConnection c;
    public final boolean d;
    public final /* synthetic */ hc e;

    public ub(hc hcVar, vb vbVar) {
        this.e = hcVar;
        this.a = vbVar;
        this.d = Uri.parse(vbVar.i.g).getQueryParameter("s") != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c7, code lost:
    
        if (r2 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00dd, code lost:
    
        if (r2 == null) goto L53;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00f4 A[Catch: all -> 0x00f2, TryCatch #14 {all -> 0x00f2, blocks: (B:81:0x00e5, B:83:0x00e9, B:85:0x00ef, B:86:0x011a, B:103:0x00f4, B:105:0x00f8, B:106:0x00fb, B:108:0x00ff, B:110:0x0105, B:112:0x0111, B:113:0x0114, B:115:0x0118), top: B:80:0x00e5 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e9 A[Catch: all -> 0x00f2, TryCatch #14 {all -> 0x00f2, blocks: (B:81:0x00e5, B:83:0x00e9, B:85:0x00ef, B:86:0x011a, B:103:0x00f4, B:105:0x00f8, B:106:0x00fb, B:108:0x00ff, B:110:0x0105, B:112:0x0111, B:113:0x0114, B:115:0x0118), top: B:80:0x00e5 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0121 A[Catch: all -> 0x0124, TRY_LEAVE, TryCatch #2 {all -> 0x0124, blocks: (B:88:0x011d, B:90:0x0121), top: B:87:0x011d }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0130 A[Catch: Exception -> 0x0133, TRY_ENTER, TRY_LEAVE, TryCatch #10 {Exception -> 0x0133, blocks: (B:39:0x00d1, B:94:0x0130), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0126 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doInBackground(Object[] objArr) {
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        HttpURLConnection httpURLConnection;
        InputStream inputStream2;
        ByteArrayOutputStream byteArrayOutputStream2;
        int read;
        int responseCode;
        String str = null;
        try {
            try {
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(this.a.i.g.replace("athumb://", "https://")).openConnection();
                this.c = httpURLConnection2;
                httpURLConnection2.setConnectTimeout(5000);
                this.c.setReadTimeout(5000);
                this.c.connect();
                try {
                    HttpURLConnection httpURLConnection3 = this.c;
                    if (httpURLConnection3 != null && (responseCode = httpURLConnection3.getResponseCode()) != 200 && responseCode != 202 && responseCode != 304) {
                        this.b = false;
                    }
                } catch (Exception e) {
                    f8.g(e, false);
                }
                inputStream2 = this.c.getInputStream();
                try {
                    byteArrayOutputStream2 = new ByteArrayOutputStream();
                } catch (Throwable th2) {
                    inputStream = inputStream2;
                    th = th2;
                    byteArrayOutputStream = null;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStream = null;
                byteArrayOutputStream = null;
                try {
                    if (th instanceof SocketTimeoutException) {
                        if (th instanceof UnknownHostException) {
                            this.b = false;
                        } else if (th instanceof SocketException) {
                            if (th.getMessage() != null && th.getMessage().contains("ECONNRESET")) {
                                this.b = false;
                            }
                        } else if (th instanceof FileNotFoundException) {
                            this.b = false;
                        }
                    } else if (w0.s()) {
                        this.b = false;
                    }
                    f8.g(th, false);
                    try {
                        httpURLConnection = this.c;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                    } catch (Throwable unused) {
                    }
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th4) {
                            f8.g(th4, true);
                        }
                    }
                    if (byteArrayOutputStream != null) {
                        return null;
                    }
                    byteArrayOutputStream.close();
                    return str;
                } catch (Throwable th5) {
                    try {
                        HttpURLConnection httpURLConnection4 = this.c;
                        if (httpURLConnection4 != null) {
                            httpURLConnection4.disconnect();
                        }
                    } catch (Throwable unused2) {
                    }
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th6) {
                            f8.g(th6, true);
                        }
                    }
                    if (byteArrayOutputStream == null) {
                        throw th5;
                    }
                    try {
                        byteArrayOutputStream.close();
                        throw th5;
                    } catch (Exception unused3) {
                        throw th5;
                    }
                }
            }
            try {
                byte[] bArr = new byte[32768];
                while (!isCancelled() && (read = inputStream2.read(bArr)) > 0) {
                    byteArrayOutputStream2.write(bArr, 0, read);
                }
                this.b = false;
                JSONArray jSONArray = new JSONObject(new String(byteArrayOutputStream2.toByteArray())).getJSONArray("results");
                if (jSONArray.length() > 0) {
                    String string = jSONArray.getJSONObject(0).getString("artworkUrl100");
                    if (this.d) {
                        try {
                            HttpURLConnection httpURLConnection5 = this.c;
                            if (httpURLConnection5 != null) {
                                httpURLConnection5.disconnect();
                            }
                        } catch (Throwable unused4) {
                        }
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (Throwable th7) {
                                f8.g(th7, true);
                            }
                        }
                        try {
                            byteArrayOutputStream2.close();
                        } catch (Exception unused5) {
                        }
                        return string;
                    }
                    str = string.replace("100x100", "600x600");
                    try {
                        HttpURLConnection httpURLConnection6 = this.c;
                        if (httpURLConnection6 != null) {
                            httpURLConnection6.disconnect();
                        }
                    } catch (Throwable unused6) {
                    }
                } else {
                    try {
                        HttpURLConnection httpURLConnection7 = this.c;
                        if (httpURLConnection7 != null) {
                            httpURLConnection7.disconnect();
                        }
                    } catch (Throwable unused7) {
                    }
                }
                try {
                    inputStream2.close();
                } catch (Throwable th8) {
                    f8.g(th8, true);
                }
                byteArrayOutputStream2.close();
            } catch (Throwable th9) {
                inputStream = inputStream2;
                th = th9;
                byteArrayOutputStream = byteArrayOutputStream2;
                if (th instanceof SocketTimeoutException) {
                }
                f8.g(th, false);
                httpURLConnection = this.c;
                if (httpURLConnection != null) {
                }
                if (inputStream != null) {
                }
                if (byteArrayOutputStream != null) {
                }
            }
            return str;
        } catch (Exception unused8) {
            return str;
        }
    }

    @Override // android.os.AsyncTask
    public final void onCancelled() {
        this.e.s.c(new tb(this, 0));
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        hc hcVar = this.e;
        r5 r5Var = hcVar.s;
        if (str != null) {
            r5Var.c(new t6(16, this, str));
        } else if (this.b) {
            r5Var.c(new ib(hcVar, this.a.e, 0));
        }
        r5Var.c(new tb(this, 1));
    }
}
