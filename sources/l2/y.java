package l2;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import c8.cc;
import c8.zc;
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
import li.a3;
import li.a6;
import li.b2;
import li.b3;
import li.c6;
import li.e5;
import li.g4;
import li.m5;
import li.n5;
import li.t3;
import org.telegram.messenger.a20;
import org.telegram.messenger.xr;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.k3;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.xs;
import org.telegram.ui.qw;
import org.telegram.ui.w91;
import org.telegram.ui.ww;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final /* synthetic */ class y implements h2.o, xs, li.m0, a20, org.telegram.ui.ActionBar.r1, qw, n5, i2.u, oi.m, Vector.TLDeserializer, r0.m, org.telegram.ui.ActionBar.e1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.qw
    public /* synthetic */ boolean G() {
        return false;
    }

    @Override // org.telegram.ui.qw
    public /* synthetic */ boolean N(ww wwVar) {
        return false;
    }

    @Override // r0.m
    public r0.k1 S0(View view, r0.k1 k1Var) {
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 25:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj;
                Drawable drawable = ActionBarLayout.v1;
                i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
                i0.b I02 = org.telegram.messenger.g0.I0(k1Var, true);
                actionBarLayout.t1 = I0;
                actionBarLayout.u1 = I02;
                actionBarLayout.s1 = k1Var;
                int childCount = actionBarLayout.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    actionBarLayout.o(actionBarLayout.getChildAt(i10), k1Var);
                }
                break;
            default:
                k3 k3Var = (k3) obj;
                k3Var.s = k1Var.a.f(2).d;
                k3Var.invalidate();
                break;
        }
        return r0.k1.b;
    }

    @Override // li.m0
    public k60 a(li.g1 g1Var) {
        return k60.H((b2) ((g6.d0) this.b).b, g1Var);
    }

    @Override // i2.u
    public void b(long j3, h2.x xVar) {
        switch (this.a) {
            case 17:
                f3.b.c(j3, xVar, ((m4.c0) this.b).c);
                break;
            default:
                f3.b.d(j3, xVar, ((m4.c0) this.b).c);
                break;
        }
    }

    public li.z c(h6.m mVar) {
        m5.b bVar = (m5.b) this.b;
        URL url = (URL) mVar.b;
        String c10 = cc.c("CctTransportBackend");
        if (Log.isLoggable(c10, 4)) {
            Log.i(c10, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(bVar.g);
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
                    org.telegram.ui.Components.n nVar = bVar.a;
                    n5.m mVar2 = (n5.m) mVar.c;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    pa.d dVar = (pa.d) nVar.a;
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
                    String c11 = cc.c("CctTransportBackend");
                    if (Log.isLoggable(c11, 4)) {
                        Log.i(c11, String.format("Status Code: %d", valueOf));
                    }
                    cc.a(httpURLConnection.getHeaderField("Content-Type"), "CctTransportBackend", "Content-Type: %s");
                    cc.a(httpURLConnection.getHeaderField("Content-Encoding"), "CctTransportBackend", "Content-Encoding: %s");
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new li.z(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new li.z(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            li.z zVar = new li.z(responseCode, null, n5.u.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return zVar;
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
            cc.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new li.z(500, null, 0L);
        } catch (UnknownHostException e11) {
            e = e11;
            cc.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new li.z(500, null, 0L);
        } catch (IOException e12) {
            e = e12;
            cc.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new li.z(400, null, 0L);
        } catch (na.b e13) {
            e = e13;
            cc.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new li.z(400, null, 0L);
        }
    }

    public void d(int i7) {
        li.y yVar = (li.y) this.b;
        yVar.c = i7;
        yVar.e(i7);
    }

    @Override // org.telegram.tgnet.Vector.TLDeserializer
    public TLObject deserialize(InputSerializedData inputSerializedData, int i7, boolean z9) {
        TLRPC.PhotoSize lambda$readParams$0;
        TLRPC.PhotoSize lambda$readParams$02;
        switch (this.a) {
            case 23:
                lambda$readParams$0 = ((TLRPC.TL_stickerSet) this.b).lambda$readParams$0(inputSerializedData, i7, z9);
                return lambda$readParams$0;
            default:
                lambda$readParams$02 = ((TLRPC.TL_stickerSet_layer143) this.b).lambda$readParams$0(inputSerializedData, i7, z9);
                return lambda$readParams$02;
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 8:
                ((aa.d0) this.b).run();
                break;
            default:
                org.telegram.ui.ActionBar.u1 u1Var2 = (org.telegram.ui.ActionBar.u1) this.b;
                DialogInterface.OnCancelListener onCancelListener = u1Var2.J;
                if (onCancelListener != null) {
                    onCancelListener.onCancel(u1Var2);
                }
                u1Var2.dismiss();
                break;
        }
    }

    @Override // org.telegram.messenger.a20
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        if (((t3[]) this.b)[0] == null || !(view instanceof a6)) {
            return;
        }
        ((a6) view).B();
    }

    @Override // h2.o
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((e2.a1) obj).x((g2.d) this.b);
                break;
            case 1:
                ((e2.a1) obj).p(((c0) this.b).a.Q);
                break;
            case 2:
                ((e2.a1) obj).M((e2.q0) this.b);
                break;
            case 13:
                ((m2.b) obj).G((e2.v0) this.b);
                break;
            case 14:
                ((m2.b) obj).onSeekStarted((m2.a) this.b);
                break;
            case 15:
                ((m2.b) obj).z((d) this.b);
                break;
            default:
                ((m2.b) obj).b((x2.c0) this.b);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.e1
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        org.telegram.ui.ActionBar.r0 r0Var = (org.telegram.ui.ActionBar.r0) this.b;
        r0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g1Var = r0Var.d) != null && g1Var.isShowing()) {
            r0Var.d.d(true);
        }
    }

    @Override // oi.m
    public void l(int i7) {
        oi.a aVar = (oi.a) this.b;
        oi.q qVar = aVar.a;
        oi.d dVar = aVar.g;
        if (Build.VERSION.SDK_INT < 31 || dVar == null) {
            return;
        }
        ArrayList arrayList = dVar.a;
        if (aVar.l || oi.q.f().a) {
            if (zc.a(i7, 4) || zc.a(i7, 2)) {
                qi.a e10 = qVar.e();
                ViewGroup viewGroup = aVar.n;
                if (viewGroup != null) {
                    e10.b(viewGroup.getY(), aVar.m.getWidth(), aVar.n.getY() + aVar.n.getHeight());
                }
                dVar.b = e10.b;
                while (dVar.b > arrayList.size()) {
                    arrayList.add(new oi.b(arrayList.size()));
                }
                for (int i10 = 0; i10 < dVar.b; i10++) {
                    oi.b bVar = (oi.b) arrayList.get(i10);
                    bVar.a.set(e10.c(i10));
                    bVar.b(dVar.m, dVar.n, dVar.o);
                    bVar.c(dVar.k);
                    int i11 = dVar.p;
                    int i12 = dVar.q;
                    int i13 = dVar.r;
                    int i14 = dVar.s;
                    bVar.u = i11;
                    bVar.v = i12;
                    bVar.w = i13;
                    bVar.x = i14;
                }
            }
            dVar.c = aVar.o;
            dVar.d = aVar.m;
            boolean z9 = qVar.j > 0;
            boolean z10 = !z9;
            if (dVar.l != z10) {
                dVar.l = z10;
                int i15 = !z9 ? 5 : 1;
                dVar.m = i15;
                int i16 = z9 ? 1 : 10;
                dVar.n = i16;
                dVar.o = Math.max(i15, i16);
                for (int i17 = 0; i17 < dVar.b; i17++) {
                    ((oi.b) arrayList.get(i17)).b(dVar.m, dVar.n, dVar.o);
                }
                dVar.f();
            }
            int i18 = qVar.k;
            int i19 = qVar.l;
            dVar.t = i18;
            dVar.u = i19;
            dVar.f();
            dVar.e();
            Runnable runnable = aVar.j;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    @Override // org.telegram.ui.Components.xs
    public void m() {
        switch (this.a) {
            case 5:
                li.r0 r0Var = (li.r0) this.b;
                li.g1 g1Var = r0Var.d;
                li.a aVar = r0Var.f;
                if (aVar != null) {
                    aVar.s = true;
                    aVar.r = g1Var.k2;
                }
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.b;
                    if (pageBlock instanceof TL_iv.pageBlockDetails) {
                        ((TL_iv.pageBlockDetails) pageBlock).title = c6.f(g1Var.getText());
                    }
                }
                b3 b3Var = r0Var.h;
                if (b3Var != null && r0Var.f != null) {
                    t3.S1(b3Var.a);
                    break;
                }
                break;
            case 10:
                ((e5) this.b).g();
                break;
            default:
                m5 m5Var = (m5) this.b;
                li.a aVar2 = m5Var.a;
                if (aVar2 != null) {
                    aVar2.s = true;
                    aVar2.r = m5Var.r.k2;
                }
                m5Var.w();
                a3 a3Var = m5Var.E;
                if (a3Var != null && m5Var.a != null) {
                    t3.S1(a3Var.a);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.qw
    public boolean y(ww wwVar, ArrayList arrayList, CharSequence charSequence, boolean z9, boolean z10, int i7, int i10, w91 w91Var) {
        g4 g4Var = (g4) this.b;
        if (arrayList.isEmpty() || ((xr) arrayList.get(0)).a <= 0) {
            return false;
        }
        g4Var.run(((xr) arrayList.get(0)).a);
        wwVar.finishFragment();
        return true;
    }

    public /* synthetic */ y(m2.a aVar, Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    public /* synthetic */ y(m2.a aVar, x2.u uVar, x2.c0 c0Var, IOException iOException, boolean z9) {
        this.a = 16;
        this.b = c0Var;
    }
}
