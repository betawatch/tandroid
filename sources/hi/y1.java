package hi;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import bi.u6;
import j$.util.Objects;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.du;
import org.telegram.ui.Components.w70;
import org.telegram.ui.ig1;
import org.telegram.ui.qy;
import org.telegram.ui.wy;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class y1 implements q0, Utilities.Callback5, org.telegram.ui.ActionBar.c2, qy, du, s5, e2.m, f2.s, a5.b, le.d, m4.a0, m4.g1, m4.e1, q9.d, og.k0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y1(j2.a aVar, Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.qy
    public /* synthetic */ boolean A() {
        return false;
    }

    @Override // le.d
    public void G(int i10, float f7, float f10, le.e eVar) {
        ((Switch) this.b).invalidate();
    }

    @Override // org.telegram.ui.qy
    public /* synthetic */ boolean J(wy wyVar) {
        return false;
    }

    @Override // q9.d
    public Object P1(u6 u6Var) {
        return new na.c((Context) u6Var.a(Context.class), ((k9.h) u6Var.a(k9.h.class)).d(), u6Var.x(na.d.class), u6Var.c(xa.b.class), (Executor) u6Var.h((q9.r) this.b));
    }

    @Override // og.k0
    public Typeface a() {
        Typeface createFromFile;
        createFromFile = Typeface.createFromFile(((Font) this.b).getFile());
        return createFromFile;
    }

    @Override // a5.b
    public void b(WebView webView, a5.a aVar, Uri uri, boolean z10, b5.h hVar) {
        b5.h hVar2;
        ki.k kVar = (ki.k) this.b;
        if (webView == kVar.m && z10 && kVar.d.equals(uri.toString())) {
            int i10 = aVar.b;
            if (i10 == 0) {
                aVar.d(0);
                kVar.g((String) aVar.c, hVar);
                return;
            }
            if (i10 == 1) {
                synchronized (kVar.a) {
                    if (!kVar.p && (hVar2 = kVar.n) != null && hVar2 == hVar) {
                        aVar.d(1);
                        byte[] bArr = (byte[]) aVar.d;
                        Objects.requireNonNull(bArr);
                        kVar.i.execute(new fg.s1(29, kVar, bArr));
                    }
                }
            }
        }
    }

    @Override // f2.s
    public void c(long j3, e2.v vVar) {
        switch (this.a) {
            case 18:
                c3.b.d(j3, vVar, ((j4.d0) this.b).c);
                break;
            default:
                c3.b.e(j3, vVar, ((j4.d0) this.b).c);
                break;
        }
    }

    @Override // m4.a0
    public void d(m4.q qVar, int i10) {
        qVar.c(i10, (b2.x0) this.b);
    }

    @Override // m4.e1
    public void e(m4.l1 l1Var, m4.r rVar) {
        ((e2.h) this.b).accept(l1Var);
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        ((bi.g2) this.b).run();
    }

    @Override // hi.q0
    public w70 g(k1 k1Var) {
        return w70.H((g2) ((xa.c) this.b).b, k1Var);
    }

    public c0 h(aa.a aVar) {
        j5.b bVar = (j5.b) this.b;
        URL url = (URL) aVar.c;
        String c10 = w7.i6.c("CctTransportBackend");
        if (Log.isLoggable(c10, 4)) {
            Log.i(c10, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(bVar.g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.9 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) aVar.b;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    a6.i iVar = bVar.a;
                    k5.i iVar2 = (k5.i) aVar.d;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    ka.d dVar = (ka.d) iVar.b;
                    ka.e eVar = new ka.e(bufferedWriter, dVar.a, dVar.b, dVar.c, dVar.d);
                    eVar.h(iVar2);
                    eVar.j();
                    eVar.b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer valueOf = Integer.valueOf(responseCode);
                    String c11 = w7.i6.c("CctTransportBackend");
                    if (Log.isLoggable(c11, 4)) {
                        Log.i(c11, String.format("Status Code: %d", valueOf));
                    }
                    w7.i6.a(httpURLConnection.getHeaderField("Content-Type"), "CctTransportBackend", "Content-Type: %s");
                    w7.i6.a(httpURLConnection.getHeaderField("Content-Encoding"), "CctTransportBackend", "Content-Encoding: %s");
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new c0(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new c0(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            c0 c0Var = new c0(responseCode, null, k5.m.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return c0Var;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (ia.b e) {
            e = e;
            w7.i6.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new c0(400, null, 0L);
        } catch (ConnectException e7) {
            e = e7;
            w7.i6.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new c0(500, null, 0L);
        } catch (UnknownHostException e10) {
            e = e10;
            w7.i6.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new c0(500, null, 0L);
        } catch (IOException e11) {
            e = e11;
            w7.i6.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new c0(400, null, 0L);
        }
    }

    @Override // m4.g1
    public Object i(m4.b0 b0Var, m4.r rVar, int i10) {
        int i11 = this.a;
        Object obj = this.b;
        switch (i11) {
            case 25:
                return b0Var.l(rVar, (e9.i0) obj);
            default:
                m4.e1 e1Var = (m4.e1) obj;
                i9.u uVar = i9.u.b;
                if (!b0Var.j()) {
                    e1Var.e(b0Var.t, rVar);
                    m4.h1.O0(b0Var, rVar, i10, new m4.r1(0));
                }
                return i9.u.b;
        }
    }

    @Override // e2.m
    public void invoke(Object obj) {
        switch (this.a) {
            case 7:
                ((b2.z0) obj).onMediaMetadataChanged((b2.n0) this.b);
                break;
            case 8:
                ((b2.z0) obj).onAudioAttributesChanged((b2.e) this.b);
                break;
            case 9:
                ((b2.z0) obj).onTrackSelectionParametersChanged((b2.q1) this.b);
                break;
            case 10:
                ((b2.z0) obj).onCues((d2.c) this.b);
                break;
            case 11:
                ((b2.z0) obj).onMediaMetadataChanged(((i2.b0) this.b).a.O);
                break;
            case 12:
                ((b2.z0) obj).onMetadata((b2.p0) this.b);
                break;
            case 13:
            default:
                ((j2.b) obj).b((u2.c0) this.b);
                break;
            case 14:
                ((j2.b) obj).h((b2.u0) this.b);
                break;
            case 15:
                ((j2.b) obj).onSeekStarted((j2.a) this.b);
                break;
            case 16:
                ((j2.b) obj).a((i2.g) this.b);
                break;
        }
    }

    @Override // org.telegram.ui.Components.du
    public void j() {
        switch (this.a) {
            case 4:
                ((j5) this.b).h();
                break;
            default:
                r5 r5Var = (r5) this.b;
                a aVar = r5Var.a;
                if (aVar != null) {
                    aVar.s = true;
                    aVar.r = r5Var.r.E;
                }
                r5Var.u();
                f3 f3Var = r5Var.E;
                if (f3Var != null && r5Var.a != null) {
                    z3.N1(f3Var.a);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        Integer num = (Integer) obj3;
        Float f7 = (Float) obj4;
        Float f10 = (Float) obj5;
        if (((z3[]) this.b)[0] != null) {
            num.intValue();
            f7.floatValue();
            f10.floatValue();
            if (view instanceof g6) {
                ((g6) view).B();
            }
        }
    }

    @Override // org.telegram.ui.qy
    public boolean v(wy wyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, ig1 ig1Var) {
        l4 l4Var = (l4) this.b;
        if (arrayList.isEmpty() || ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId <= 0) {
            return false;
        }
        l4Var.run(((MessagesStorage.TopicKey) arrayList.get(0)).dialogId);
        wyVar.finishFragment();
        return true;
    }

    public /* synthetic */ y1(j2.a aVar, u2.u uVar, u2.c0 c0Var, IOException iOException, boolean z10) {
        this.a = 17;
        this.b = c0Var;
    }

    public /* synthetic */ y1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // le.d
    public /* synthetic */ void B(float f7, int i10) {
    }
}
