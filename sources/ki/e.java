package ki;

import android.util.Log;
import android.view.View;
import c8.gc;
import hi.u5;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import oi.b6;
import oi.d5;
import oi.l5;
import oi.m5;
import oi.z5;
import org.telegram.messenger.sr;
import org.telegram.messenger.v10;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.c5;
import org.telegram.ui.Components.kt;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.y60;
import org.telegram.ui.cx;
import org.telegram.ui.ww;
import org.telegram.ui.y91;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements org.telegram.ui.ActionBar.r1, v10, h2.o, i2.u, kt, oi.k0, ww, m5, Vector.TLDeserializer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.ww
    public /* synthetic */ boolean G() {
        return false;
    }

    @Override // org.telegram.ui.ww
    public /* synthetic */ boolean P(cx cxVar) {
        return false;
    }

    @Override // i2.u
    public void a(long j3, h2.x xVar) {
        switch (this.a) {
            case 14:
                f3.b.c(j3, xVar, ((m4.c0) this.b).c);
                break;
            default:
                f3.b.d(j3, xVar, ((m4.c0) this.b).c);
                break;
        }
    }

    public m5.b b(h6.m mVar) {
        m5.c cVar = (m5.c) this.b;
        URL url = (URL) mVar.b;
        String c10 = gc.c("CctTransportBackend");
        if (Log.isLoggable(c10, 4)) {
            Log.i(c10, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(cVar.g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.3.0 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) mVar.d;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    c5 c5Var = cVar.a;
                    n5.m mVar2 = (n5.m) mVar.c;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    pa.d dVar = (pa.d) c5Var.a;
                    pa.e eVar = new pa.e(bufferedWriter, dVar.a, dVar.b, dVar.c, dVar.d);
                    eVar.h(mVar2);
                    eVar.j();
                    eVar.b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer valueOf = Integer.valueOf(responseCode);
                    String c11 = gc.c("CctTransportBackend");
                    if (Log.isLoggable(c11, 4)) {
                        Log.i(c11, String.format("Status Code: %d", valueOf));
                    }
                    gc.a(httpURLConnection.getHeaderField("Content-Type"), "CctTransportBackend", "Content-Type: %s");
                    gc.a(httpURLConnection.getHeaderField("Content-Encoding"), "CctTransportBackend", "Content-Encoding: %s");
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new m5.b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new m5.b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            m5.b bVar = new m5.b(responseCode, null, n5.u.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (ConnectException e10) {
            e = e10;
            gc.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new m5.b(500, null, 0L);
        } catch (UnknownHostException e11) {
            e = e11;
            gc.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new m5.b(500, null, 0L);
        } catch (IOException e12) {
            e = e12;
            gc.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new m5.b(400, null, 0L);
        } catch (na.b e13) {
            e = e13;
            gc.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new m5.b(400, null, 0L);
        }
    }

    public void c(int i7) {
        oi.x xVar = (oi.x) this.b;
        xVar.c = i7;
        xVar.e(i7);
    }

    @Override // org.telegram.tgnet.Vector.TLDeserializer
    public TLObject deserialize(InputSerializedData inputSerializedData, int i7, boolean z10) {
        TLRPC.PhotoSize lambda$readParams$0;
        TLRPC.PhotoSize lambda$readParams$02;
        switch (this.a) {
            case 28:
                lambda$readParams$0 = ((TLRPC.TL_stickerSet) this.b).lambda$readParams$0(inputSerializedData, i7, z10);
                return lambda$readParams$0;
            default:
                lambda$readParams$02 = ((TLRPC.TL_stickerSet_layer143) this.b).lambda$readParams$0(inputSerializedData, i7, z10);
                return lambda$readParams$02;
        }
    }

    @Override // org.telegram.ui.Components.kt
    public void g() {
        switch (this.a) {
            case 19:
                oi.p0 p0Var = (oi.p0) this.b;
                oi.e1 e1Var = p0Var.d;
                oi.a aVar = p0Var.f;
                if (aVar != null) {
                    aVar.s = true;
                    aVar.r = e1Var.q2;
                }
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.b;
                    if (pageBlock instanceof TL_iv.pageBlockDetails) {
                        ((TL_iv.pageBlockDetails) pageBlock).title = b6.f(e1Var.getText());
                    }
                }
                oi.b3 b3Var = p0Var.h;
                if (b3Var != null && p0Var.f != null) {
                    oi.s3.S1(b3Var.a);
                    break;
                }
                break;
            case 24:
                ((d5) this.b).g();
                break;
            default:
                l5 l5Var = (l5) this.b;
                oi.a aVar2 = l5Var.a;
                if (aVar2 != null) {
                    aVar2.s = true;
                    aVar2.r = l5Var.r.q2;
                }
                l5Var.w();
                oi.a3 a3Var = l5Var.F;
                if (a3Var != null && l5Var.a != null) {
                    oi.s3.S1(a3Var.a);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 0:
                ((d) this.b).run();
                break;
            case 1:
                k kVar = (k) this.b;
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                updatestarrefprogram.bot = kVar.getMessagesController().q1(kVar.S);
                updatestarrefprogram.commission_permille = 0;
                org.telegram.ui.ActionBar.u1 u1Var2 = new org.telegram.ui.ActionBar.u1(3, kVar.getParentActivity(), null);
                u1Var2.r(150L);
                kVar.getConnectionsManager().sendRequest(updatestarrefprogram, new b(kVar, u1Var2, 0));
                break;
            default:
                ((aa.c0) this.b).run();
                break;
        }
    }

    @Override // h2.o
    public void invoke(Object obj) {
        switch (this.a) {
            case 4:
                ((e2.a1) obj).o((e2.e) this.b);
                break;
            case 5:
                ((e2.a1) obj).E((e2.q1) this.b);
                break;
            case 6:
                ((e2.a1) obj).x((g2.c) this.b);
                break;
            case 7:
                ((e2.a1) obj).p(((l2.z) this.b).a.Q);
                break;
            case 8:
                ((e2.a1) obj).M((e2.q0) this.b);
                break;
            case 9:
            default:
                ((m2.b) obj).b((x2.c0) this.b);
                break;
            case 10:
                ((m2.b) obj).G((e2.v0) this.b);
                break;
            case 11:
                ((m2.b) obj).onSeekStarted((m2.a) this.b);
                break;
            case 12:
                ((m2.b) obj).z((l2.d) this.b);
                break;
        }
    }

    @Override // oi.k0
    public y60 j(oi.e1 e1Var) {
        return y60.I((oi.z1) ((u5) this.b).b, e1Var);
    }

    @Override // org.telegram.messenger.v10
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        switch (this.a) {
            case 2:
                r.a0((r) this.b, (l41) obj);
                break;
            case 3:
                ((e4) this.b).a0((l41) obj);
                break;
            default:
                View view = (View) obj2;
                if (((oi.s3[]) this.b)[0] != null && (view instanceof z5)) {
                    ((z5) view).B();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ww
    public boolean y(cx cxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, y91 y91Var) {
        oi.f4 f4Var = (oi.f4) this.b;
        if (arrayList.isEmpty() || ((sr) arrayList.get(0)).a <= 0) {
            return false;
        }
        f4Var.run(((sr) arrayList.get(0)).a);
        cxVar.finishFragment();
        return true;
    }

    public /* synthetic */ e(m2.a aVar, Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    public /* synthetic */ e(m2.a aVar, x2.u uVar, x2.c0 c0Var, IOException iOException, boolean z10) {
        this.a = 13;
        this.b = c0Var;
    }
}
