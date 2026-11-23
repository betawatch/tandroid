package kg;

import android.util.Log;
import android.view.View;
import c8.gc;
import hi.t5;
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
import ki.d4;
import oi.a6;
import oi.b2;
import oi.b3;
import oi.c3;
import oi.c6;
import oi.e5;
import oi.g4;
import oi.m5;
import oi.n5;
import oi.t3;
import org.telegram.messenger.tr;
import org.telegram.messenger.w10;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.c5;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.o41;
import org.telegram.ui.cx;
import org.telegram.ui.ww;
import org.telegram.ui.y91;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class x1 implements w10, org.telegram.ui.ActionBar.q1, h2.o, i2.u, mt, oi.l0, ww, n5, Vector.TLDeserializer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x1(Object obj, int i7) {
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
            case 15:
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
        oi.y yVar = (oi.y) this.b;
        yVar.c = i7;
        yVar.e(i7);
    }

    @Override // org.telegram.tgnet.Vector.TLDeserializer
    public TLObject deserialize(InputSerializedData inputSerializedData, int i7, boolean z10) {
        TLRPC.PhotoSize lambda$readParams$0;
        lambda$readParams$0 = ((TLRPC.TL_stickerSet) this.b).lambda$readParams$0(inputSerializedData, i7, z10);
        return lambda$readParams$0;
    }

    @Override // org.telegram.ui.Components.mt
    public void g() {
        switch (this.a) {
            case 20:
                oi.q0 q0Var = (oi.q0) this.b;
                oi.f1 f1Var = q0Var.d;
                oi.a aVar = q0Var.f;
                if (aVar != null) {
                    aVar.s = true;
                    aVar.r = f1Var.q2;
                }
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.b;
                    if (pageBlock instanceof TL_iv.pageBlockDetails) {
                        ((TL_iv.pageBlockDetails) pageBlock).title = c6.f(f1Var.getText());
                    }
                }
                c3 c3Var = q0Var.h;
                if (c3Var != null && q0Var.f != null) {
                    t3.S1(c3Var.a);
                    break;
                }
                break;
            case 25:
                ((e5) this.b).g();
                break;
            default:
                m5 m5Var = (m5) this.b;
                oi.a aVar2 = m5Var.a;
                if (aVar2 != null) {
                    aVar2.s = true;
                    aVar2.r = m5Var.r.q2;
                }
                m5Var.w();
                b3 b3Var = m5Var.F;
                if (b3Var != null && m5Var.a != null) {
                    t3.S1(b3Var.a);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 1:
                ((ki.d) this.b).run();
                break;
            case 2:
                ki.j jVar = (ki.j) this.b;
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                updatestarrefprogram.bot = jVar.getMessagesController().q1(jVar.S);
                updatestarrefprogram.commission_permille = 0;
                org.telegram.ui.ActionBar.t1 t1Var2 = new org.telegram.ui.ActionBar.t1(3, jVar.getParentActivity(), null);
                t1Var2.r(150L);
                jVar.getConnectionsManager().sendRequest(updatestarrefprogram, new ki.b(jVar, t1Var2, 0));
                break;
            default:
                ((aa.c0) this.b).run();
                break;
        }
    }

    @Override // h2.o
    public void invoke(Object obj) {
        switch (this.a) {
            case 5:
                ((e2.a1) obj).o((e2.e) this.b);
                break;
            case 6:
                ((e2.a1) obj).E((e2.q1) this.b);
                break;
            case 7:
                ((e2.a1) obj).x((g2.c) this.b);
                break;
            case 8:
                ((e2.a1) obj).p(((l2.z) this.b).a.Q);
                break;
            case 9:
                ((e2.a1) obj).M((e2.q0) this.b);
                break;
            case 10:
            default:
                ((m2.b) obj).b((x2.c0) this.b);
                break;
            case 11:
                ((m2.b) obj).G((e2.v0) this.b);
                break;
            case 12:
                ((m2.b) obj).onSeekStarted((m2.a) this.b);
                break;
            case 13:
                ((m2.b) obj).z((l2.d) this.b);
                break;
        }
    }

    @Override // oi.l0
    public a70 j(oi.f1 f1Var) {
        return a70.I((b2) ((t5) this.b).b, f1Var);
    }

    @Override // org.telegram.messenger.w10
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        switch (this.a) {
            case 0:
                y1.Z((y1) this.b, (o41) obj, (View) obj2);
                break;
            case 1:
            case 2:
            default:
                View view = (View) obj2;
                if (((t3[]) this.b)[0] != null && (view instanceof a6)) {
                    ((a6) view).B();
                    break;
                }
                break;
            case 3:
                ki.q.a0((ki.q) this.b, (o41) obj);
                break;
            case 4:
                ((d4) this.b).a0((o41) obj);
                break;
        }
    }

    @Override // org.telegram.ui.ww
    public boolean y(cx cxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, y91 y91Var) {
        g4 g4Var = (g4) this.b;
        if (arrayList.isEmpty() || ((tr) arrayList.get(0)).a <= 0) {
            return false;
        }
        g4Var.run(((tr) arrayList.get(0)).a);
        cxVar.finishFragment();
        return true;
    }

    public /* synthetic */ x1(m2.a aVar, Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    public /* synthetic */ x1(m2.a aVar, x2.u uVar, x2.c0 c0Var, IOException iOException, boolean z10) {
        this.a = 14;
        this.b = c0Var;
    }
}
