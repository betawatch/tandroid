package kg;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import c8.hc;
import fi.l5;
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
import ki.e4;
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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.sr;
import org.telegram.messenger.tr;
import org.telegram.messenger.u10;
import org.telegram.messenger.w10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.i5;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.kt;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.x60;
import org.telegram.ui.bx;
import org.telegram.ui.vw;
import org.telegram.ui.w91;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class f1 implements u10, org.telegram.ui.ActionBar.q1, h2.o, i2.u, kt, oi.l0, vw, n5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f1(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.vw
    public /* synthetic */ boolean F() {
        return false;
    }

    @Override // org.telegram.ui.vw
    public /* synthetic */ boolean O(bx bxVar) {
        return false;
    }

    @Override // i2.u
    public void a(long j3, h2.x xVar) {
        switch (this.a) {
            case 17:
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
        String c10 = hc.c("CctTransportBackend");
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
                    i5 i5Var = cVar.a;
                    n5.m mVar2 = (n5.m) mVar.c;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    pa.d dVar = (pa.d) i5Var.a;
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
                    String c11 = hc.c("CctTransportBackend");
                    if (Log.isLoggable(c11, 4)) {
                        Log.i(c11, String.format("Status Code: %d", valueOf));
                    }
                    hc.a(httpURLConnection.getHeaderField("Content-Type"), "CctTransportBackend", "Content-Type: %s");
                    hc.a(httpURLConnection.getHeaderField("Content-Encoding"), "CctTransportBackend", "Content-Encoding: %s");
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
            hc.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new m5.b(500, null, 0L);
        } catch (UnknownHostException e11) {
            e = e11;
            hc.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new m5.b(500, null, 0L);
        } catch (IOException e12) {
            e = e12;
            hc.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new m5.b(400, null, 0L);
        } catch (na.b e13) {
            e = e13;
            hc.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new m5.b(400, null, 0L);
        }
    }

    public void c(int i7) {
        oi.y yVar = (oi.y) this.b;
        yVar.c = i7;
        yVar.e(i7);
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        int i10;
        switch (this.a) {
            case 1:
                t1 t1Var2 = (t1) ((bi.w1) this.b).b;
                i10 = ((g2) t1Var2).currentAccount;
                w1 f10 = w1.f(i10);
                ArrayList arrayList = t1Var2.b;
                int i11 = f10.a;
                int i12 = 0;
                while (i12 < arrayList.size()) {
                    if (f10.c(((Integer) arrayList.get(i12)).intValue()) == null) {
                        arrayList.remove(i12);
                        i12--;
                    }
                    i12++;
                }
                if (!arrayList.isEmpty()) {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        v1 c10 = f10.c(((Integer) arrayList.get(i13)).intValue());
                        f10.b.remove(c10);
                        f10.a(c10.b);
                        TLRPC.TL_messages_deleteQuickReplyShortcut tL_messages_deleteQuickReplyShortcut = new TLRPC.TL_messages_deleteQuickReplyShortcut();
                        tL_messages_deleteQuickReplyShortcut.shortcut_id = c10.a;
                        ConnectionsManager.getInstance(i11).sendRequest(tL_messages_deleteQuickReplyShortcut, new l5(6));
                        if ("hello".equals(c10.b)) {
                            ConnectionsManager.getInstance(i11).sendRequest(new TL_account.updateBusinessGreetingMessage(), null);
                            TLRPC.UserFull d2 = mp.u1(i11).d2(i10.i(i11).e());
                            if (d2 != null) {
                                d2.flags2 &= -5;
                                d2.business_greeting_message = null;
                                tr.a0(i11).j2(d2, true);
                            }
                        } else if ("away".equals(c10.b)) {
                            ConnectionsManager.getInstance(i11).sendRequest(new TL_account.updateBusinessAwayMessage(), null);
                            TLRPC.UserFull d22 = mp.u1(i11).d2(i10.i(i11).e());
                            if (d22 != null) {
                                d22.flags2 &= -9;
                                d22.business_away_message = null;
                                tr.a0(i11).j2(d22, true);
                            }
                        }
                    }
                    f10.l();
                    tr a02 = tr.a0(i11);
                    a02.a.c(new hi.h1(a02, arrayList, 2));
                    ks.f(i11).k(ks.F1, new Object[0]);
                }
                t1.c0(t1Var2);
                break;
            case 2:
            default:
                ((aa.c0) this.b).run();
                break;
            case 3:
                ((ki.d) this.b).run();
                break;
            case 4:
                ki.j jVar = (ki.j) this.b;
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                updatestarrefprogram.bot = jVar.getMessagesController().q1(jVar.S);
                updatestarrefprogram.commission_permille = 0;
                org.telegram.ui.ActionBar.t1 t1Var3 = new org.telegram.ui.ActionBar.t1(3, jVar.getParentActivity(), null);
                t1Var3.r(150L);
                jVar.getConnectionsManager().sendRequest(updatestarrefprogram, new ki.b(jVar, t1Var3, 0));
                break;
        }
    }

    @Override // h2.o
    public void invoke(Object obj) {
        switch (this.a) {
            case 7:
                ((e2.a1) obj).o((e2.e) this.b);
                break;
            case 8:
                ((e2.a1) obj).E((e2.q1) this.b);
                break;
            case 9:
                ((e2.a1) obj).x((g2.c) this.b);
                break;
            case 10:
                ((e2.a1) obj).p(((l2.a0) this.b).a.Q);
                break;
            case 11:
                ((e2.a1) obj).M((e2.q0) this.b);
                break;
            case 12:
            default:
                ((m2.b) obj).l((x2.c0) this.b);
                break;
            case 13:
                ((m2.b) obj).G((e2.v0) this.b);
                break;
            case 14:
                ((m2.b) obj).onSeekStarted((m2.a) this.b);
                break;
            case 15:
                ((m2.b) obj).A((l2.e) this.b);
                break;
        }
    }

    @Override // org.telegram.messenger.u10
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        int i7;
        int i10 = this.a;
        final int i11 = 0;
        Object obj3 = this.b;
        switch (i10) {
            case 0:
                final h1 h1Var = (h1) obj3;
                n41 n41Var = (n41) obj;
                final View view = (View) obj2;
                int i12 = h1Var.c;
                int i13 = h1Var.d;
                ArrayList arrayList = h1Var.b;
                int i14 = n41Var.d;
                final int i15 = 1;
                if (i14 != -1) {
                    if (i14 != -2) {
                        if (n41Var.a == 3 && (i7 = i14 / 3) >= 0 && i7 < arrayList.size()) {
                            int i16 = i7 - 1;
                            d1 d1Var = i16 >= 0 ? (d1) arrayList.get(i16) : null;
                            final d1 d1Var2 = (d1) arrayList.get(i7);
                            int i17 = i7 + 1;
                            d1 d1Var3 = i17 < arrayList.size() ? (d1) arrayList.get(i17) : null;
                            int i18 = n41Var.d % 3;
                            if (i18 != 0) {
                                if (i18 != 1) {
                                    if (i18 == 2) {
                                        arrayList.remove(i7);
                                        if (arrayList.isEmpty()) {
                                            arrayList.add(new d1(0, 1439));
                                        }
                                        h1Var.n.g3.O(true);
                                        i0 i0Var = h1Var.f;
                                        if (i0Var != null) {
                                            i0Var.run();
                                            break;
                                        }
                                    }
                                } else {
                                    b5.U(h1Var.getParentActivity(), gd.N0(2131752744, null), d1Var2.b, d1Var2.a + 1, d1Var3 == null ? i13 : d1Var3.a - 1, new w10() { // from class: kg.g1
                                        @Override // org.telegram.messenger.w10
                                        public final void a(Object obj4) {
                                            Integer num = (Integer) obj4;
                                            switch (i15) {
                                                case 0:
                                                    h1 h1Var2 = h1Var;
                                                    boolean a02 = h1Var2.a0();
                                                    m8 m8Var = (m8) view;
                                                    int intValue = num.intValue();
                                                    d1Var2.a = intValue;
                                                    m8Var.w(d1.a(intValue), true);
                                                    if (a02 != h1Var2.a0()) {
                                                        h1Var2.n.g3.O(true);
                                                    }
                                                    i0 i0Var2 = h1Var2.f;
                                                    if (i0Var2 != null) {
                                                        i0Var2.run();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    h1 h1Var3 = h1Var;
                                                    boolean a03 = h1Var3.a0();
                                                    m8 m8Var2 = (m8) view;
                                                    int intValue2 = num.intValue();
                                                    d1Var2.b = intValue2;
                                                    m8Var2.w(d1.a(intValue2), true);
                                                    if (a03 != h1Var3.a0()) {
                                                        h1Var3.n.g3.O(true);
                                                    }
                                                    i0 i0Var3 = h1Var3.f;
                                                    if (i0Var3 != null) {
                                                        i0Var3.run();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                }
                            } else {
                                Activity parentActivity = h1Var.getParentActivity();
                                String N0 = gd.N0(2131752738, null);
                                int i19 = d1Var2.a;
                                if (d1Var != null) {
                                    i12 = d1Var.b + 1;
                                }
                                b5.U(parentActivity, N0, i19, i12, d1Var2.b - 1, new w10() { // from class: kg.g1
                                    @Override // org.telegram.messenger.w10
                                    public final void a(Object obj4) {
                                        Integer num = (Integer) obj4;
                                        switch (i11) {
                                            case 0:
                                                h1 h1Var2 = h1Var;
                                                boolean a02 = h1Var2.a0();
                                                m8 m8Var = (m8) view;
                                                int intValue = num.intValue();
                                                d1Var2.a = intValue;
                                                m8Var.w(d1.a(intValue), true);
                                                if (a02 != h1Var2.a0()) {
                                                    h1Var2.n.g3.O(true);
                                                }
                                                i0 i0Var2 = h1Var2.f;
                                                if (i0Var2 != null) {
                                                    i0Var2.run();
                                                    break;
                                                }
                                                break;
                                            default:
                                                h1 h1Var3 = h1Var;
                                                boolean a03 = h1Var3.a0();
                                                m8 m8Var2 = (m8) view;
                                                int intValue2 = num.intValue();
                                                d1Var2.b = intValue2;
                                                m8Var2.w(d1.a(intValue2), true);
                                                if (a03 != h1Var3.a0()) {
                                                    h1Var3.n.g3.O(true);
                                                }
                                                i0 i0Var3 = h1Var3.f;
                                                if (i0Var3 != null) {
                                                    i0Var3.run();
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                            }
                        }
                    } else {
                        if (arrayList.isEmpty() || h1Var.Z()) {
                            if (h1Var.Z()) {
                                arrayList.clear();
                            }
                            int j3 = Utilities.j(480, i13 - 1, i12);
                            arrayList.add(new d1(j3, Utilities.j(1200, i13, j3 + 1)));
                        } else {
                            int i20 = ((d1) i5.c.h(1, arrayList)).b;
                            int j10 = Utilities.j(i20 + 30, i13 - 1, i12);
                            arrayList.add(new d1(j10, Utilities.j((i20 + 1560) / 2, i13, j10 + 1)));
                        }
                        i0 i0Var2 = h1Var.f;
                        if (i0Var2 != null) {
                            i0Var2.run();
                        }
                        h1Var.n.g3.O(true);
                        break;
                    }
                } else {
                    h1Var.r = !h1Var.r;
                    arrayList.clear();
                    if (h1Var.r) {
                        arrayList.add(new d1(0, 1439));
                    }
                    r8 r8Var = (r8) view;
                    boolean z10 = h1Var.r;
                    n41Var.e = z10;
                    r8Var.setChecked(z10);
                    boolean z11 = h1Var.r;
                    r8Var.b(n6.x0(null, z11 ? n6.f6 : n6.e6, false), z11);
                    h1Var.n.g3.O(true);
                    i0 i0Var3 = h1Var.f;
                    if (i0Var3 != null) {
                        i0Var3.run();
                        break;
                    }
                }
                break;
            case 1:
            case 3:
            case 4:
            default:
                View view2 = (View) obj2;
                if (((t3[]) obj3)[0] != null && (view2 instanceof a6)) {
                    ((a6) view2).B();
                    break;
                }
                break;
            case 2:
                y1.Z((y1) obj3, (n41) obj, (View) obj2);
                break;
            case 5:
                ki.q.a0((ki.q) obj3, (n41) obj);
                break;
            case 6:
                ((e4) obj3).a0((n41) obj);
                break;
        }
    }

    @Override // oi.l0
    public x60 m(oi.f1 f1Var) {
        return x60.I((b2) ((hi.u0) this.b).b, f1Var);
    }

    @Override // org.telegram.ui.Components.kt
    public void u() {
        switch (this.a) {
            case 22:
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
            case 27:
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

    @Override // org.telegram.ui.vw
    public boolean z(bx bxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, w91 w91Var) {
        g4 g4Var = (g4) this.b;
        if (arrayList.isEmpty() || ((sr) arrayList.get(0)).a <= 0) {
            return false;
        }
        g4Var.run(((sr) arrayList.get(0)).a);
        bxVar.finishFragment();
        return true;
    }

    public /* synthetic */ f1(m2.a aVar, Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    public /* synthetic */ f1(m2.a aVar, x2.u uVar, x2.c0 c0Var, IOException iOException, boolean z10) {
        this.a = 16;
        this.b = c0Var;
    }
}
