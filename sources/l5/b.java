package l5;

import ai.g5;
import ai.o1;
import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import c0.i;
import c0.j;
import ci.u8;
import d2.a1;
import d2.y0;
import e5.u;
import ei.u5;
import g2.k;
import g9.i0;
import gi.x0;
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
import l9.w;
import lg.c1;
import lg.n;
import lg.r1;
import lg.t1;
import lg.u1;
import lg.x1;
import m2.s;
import m2.t;
import mi.b3;
import mi.b6;
import mi.c2;
import mi.c3;
import mi.d6;
import mi.f5;
import mi.h1;
import mi.h4;
import mi.n0;
import mi.n5;
import mi.o5;
import mi.s0;
import mi.t3;
import mi.y;
import o4.d0;
import o4.d1;
import o4.e0;
import o4.f1;
import o4.l1;
import o4.v;
import oa.e;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.pr;
import org.telegram.messenger.qr;
import org.telegram.messenger.s10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p1;
import org.telegram.ui.ActionBar.q0;
import org.telegram.ui.ActionBar.s1;
import org.telegram.ui.Cells.h5;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.vs;
import org.telegram.ui.m91;
import org.telegram.ui.nw;
import org.telegram.ui.uw;
import r0.k1;
import r0.m;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements s10, p1, vs, n0, nw, o5, j, d0, f1, k, d1, f9.k, Vector.TLDeserializer, m, org.telegram.ui.ActionBar.d1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // org.telegram.ui.nw
    public /* synthetic */ boolean G() {
        return false;
    }

    @Override // org.telegram.ui.nw
    public /* synthetic */ boolean N(uw uwVar) {
        return false;
    }

    @Override // r0.m
    public k1 R0(View view, k1 k1Var) {
        ActionBarLayout actionBarLayout = (ActionBarLayout) this.b;
        Drawable drawable = ActionBarLayout.w1;
        i0.b I0 = g0.I0(k1Var, false);
        i0.b I02 = g0.I0(k1Var, true);
        actionBarLayout.u1 = I0;
        actionBarLayout.v1 = I02;
        actionBarLayout.t1 = k1Var;
        int childCount = actionBarLayout.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            actionBarLayout.o(actionBarLayout.getChildAt(i3), k1Var);
        }
        return k1.b;
    }

    @Override // c0.j
    public Object a(i iVar) {
        e0 e0Var = (e0) this.b;
        e0Var.o.post(new s(14, e0Var, iVar));
        return "onPlayRequested";
    }

    @Override // g2.k
    public void accept(Object obj) {
        ((l1) obj).c((y0) this.b);
    }

    @Override // f9.k
    public Object apply(Object obj) {
        switch (this.a) {
            case 21:
                t tVar = (t) this.b;
                Bitmap bitmap = (Bitmap) obj;
                int height = bitmap.getHeight();
                int width = bitmap.getWidth();
                k9.a aVar = (k9.a) tVar.c;
                if (!aVar.a(Math.max(height, width))) {
                    return bitmap;
                }
                if (aVar.a(height)) {
                    height--;
                }
                if (aVar.a(width)) {
                    width--;
                }
                return cg.n0.e(Bitmap.createScaledBitmap(bitmap, width, height, true));
            default:
                u uVar = (u) this.b;
                Bitmap bitmap2 = (Bitmap) obj;
                int width2 = bitmap2.getWidth();
                int i3 = uVar.b;
                if (width2 > i3 || bitmap2.getHeight() > i3) {
                    float f10 = i3;
                    float width3 = bitmap2.getWidth();
                    float height2 = bitmap2.getHeight();
                    float min = Math.min(f10 / width3, f10 / height2);
                    bitmap2 = Bitmap.createScaledBitmap(bitmap2, (int) (width3 * min), (int) (height2 * min), true);
                }
                return cg.n0.e(bitmap2);
        }
    }

    @Override // o4.d1
    public void b(l1 l1Var, v vVar) {
        ((k) this.b).accept(l1Var);
    }

    public c c(k4.j jVar) {
        d dVar = (d) this.b;
        URL url = (URL) jVar.a;
        String c2 = x7.m.c("CctTransportBackend");
        if (Log.isLoggable(c2, 4)) {
            Log.i(c2, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(dVar.g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.3.0 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) jVar.c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    hi.d dVar2 = dVar.a;
                    m5.m mVar = (m5.m) jVar.b;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    oa.d dVar3 = (oa.d) dVar2.b;
                    e eVar = new e(bufferedWriter, dVar3.a, dVar3.b, dVar3.c, dVar3.d);
                    eVar.h(mVar);
                    eVar.j();
                    eVar.b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer valueOf = Integer.valueOf(responseCode);
                    String c10 = x7.m.c("CctTransportBackend");
                    if (Log.isLoggable(c10, 4)) {
                        Log.i(c10, String.format("Status Code: %d", valueOf));
                    }
                    x7.m.a(httpURLConnection.getHeaderField("Content-Type"), "CctTransportBackend", "Content-Type: %s");
                    x7.m.a(httpURLConnection.getHeaderField("Content-Encoding"), "CctTransportBackend", "Content-Encoding: %s");
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new c(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new c(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            c cVar = new c(responseCode, null, m5.u.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return cVar;
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
            x7.m.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new c(500, null, 0L);
        } catch (UnknownHostException e11) {
            e = e11;
            x7.m.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new c(500, null, 0L);
        } catch (IOException e12) {
            e = e12;
            x7.m.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new c(400, null, 0L);
        } catch (ma.b e13) {
            e = e13;
            x7.m.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new c(400, null, 0L);
        }
    }

    @Override // o4.d0
    public void d(o4.u uVar, int i3) {
        uVar.a(i3, (a1) this.b);
    }

    @Override // org.telegram.tgnet.Vector.TLDeserializer
    public TLObject deserialize(InputSerializedData inputSerializedData, int i3, boolean z10) {
        TLRPC.PhotoSize lambda$readParams$0;
        TLRPC.PhotoSize lambda$readParams$02;
        switch (this.a) {
            case 24:
                lambda$readParams$0 = ((TLRPC.TL_stickerSet) this.b).lambda$readParams$0(inputSerializedData, i3, z10);
                return lambda$readParams$0;
            default:
                lambda$readParams$02 = ((TLRPC.TL_stickerSet_layer143) this.b).lambda$readParams$0(inputSerializedData, i3, z10);
                return lambda$readParams$02;
        }
    }

    public void e(int i3) {
        y yVar = (y) this.b;
        yVar.c = i3;
        yVar.e(i3);
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(s1 s1Var, int i3) {
        int i10;
        switch (this.a) {
            case 3:
                r1 r1Var = (r1) ((g5) this.b).b;
                i10 = ((d2) r1Var).currentAccount;
                u1 f10 = u1.f(i10);
                ArrayList arrayList = r1Var.b;
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
                        t1 c2 = f10.c(((Integer) arrayList.get(i13)).intValue());
                        f10.b.remove(c2);
                        f10.a(c2.b);
                        TLRPC.TL_messages_deleteQuickReplyShortcut tL_messages_deleteQuickReplyShortcut = new TLRPC.TL_messages_deleteQuickReplyShortcut();
                        tL_messages_deleteQuickReplyShortcut.shortcut_id = c2.a;
                        ConnectionsManager.getInstance(i11).sendRequest(tL_messages_deleteQuickReplyShortcut, new u5(6));
                        if ("hello".equals(c2.b)) {
                            ConnectionsManager.getInstance(i11).sendRequest(new TL_account.updateBusinessGreetingMessage(), null);
                            TLRPC.UserFull b22 = hp.s1(i11).b2(h10.i(i11).e());
                            if (b22 != null) {
                                b22.flags2 &= -5;
                                b22.business_greeting_message = null;
                                qr.a0(i11).j2(b22, true);
                            }
                        } else if ("away".equals(c2.b)) {
                            ConnectionsManager.getInstance(i11).sendRequest(new TL_account.updateBusinessAwayMessage(), null);
                            TLRPC.UserFull b23 = hp.s1(i11).b2(h10.i(i11).e());
                            if (b23 != null) {
                                b23.flags2 &= -9;
                                b23.business_away_message = null;
                                qr.a0(i11).j2(b23, true);
                            }
                        }
                    }
                    f10.l();
                    qr a02 = qr.a0(i11);
                    a02.a.c(new x0(a02, arrayList, 2));
                    hs.f(i11).k(hs.F1, new Object[0]);
                }
                r1.c0(r1Var);
                break;
            case 10:
                ((u8) this.b).run();
                break;
            default:
                s1 s1Var2 = (s1) this.b;
                DialogInterface.OnCancelListener onCancelListener = s1Var2.K;
                if (onCancelListener != null) {
                    onCancelListener.onCancel(s1Var2);
                }
                s1Var2.dismiss();
                break;
        }
    }

    @Override // mi.n0
    public f60 h(h1 h1Var) {
        return f60.H((c2) ((hi.d) this.b).b, h1Var);
    }

    @Override // o4.f1
    public Object i(e0 e0Var, v vVar, int i3) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 17:
                return e0Var.l(vVar, (i0) obj);
            default:
                d1 d1Var = (d1) obj;
                w wVar = w.b;
                if (!e0Var.j()) {
                    d1Var.b(e0Var.t, vVar);
                    o4.h1.R0(e0Var, vVar, i3, new o4.r1(0));
                }
                return w.b;
        }
    }

    @Override // org.telegram.messenger.s10
    public void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        int i3;
        int i10 = this.a;
        final int i11 = 1;
        final int i12 = 0;
        Object obj3 = this.b;
        switch (i10) {
            case 1:
                lg.d1 d1Var = (lg.d1) obj3;
                r31 r31Var = (r31) obj;
                View view = (View) obj2;
                float floatValue = ((Float) serializable).floatValue();
                int i13 = r31Var.d;
                if (i13 == -1) {
                    boolean z10 = !d1Var.d;
                    d1Var.d = z10;
                    ((q8) view).setChecked(z10);
                    d1Var.a.g3.O(true);
                    d1Var.d0(true);
                    break;
                } else if (i13 == -2) {
                    x1 x1Var = new x1(null);
                    x1Var.n = d1Var.n;
                    x1Var.c = new o1(29, d1Var, view);
                    d1Var.presentFragment(x1Var);
                    break;
                } else if (r31Var.a == 5 && i13 >= 0 && i13 < d1Var.f.length) {
                    if (!bd.a0 ? floatValue < view.getMeasuredWidth() - g0.L(76.0f) : floatValue > g0.L(76.0f)) {
                        int i14 = (r31Var.d + 6) % 7;
                        int i15 = 0;
                        for (int i16 = 0; i16 < d1Var.f[i14].size(); i16++) {
                            if (((c1) d1Var.f[i14].get(i16)).b > i15) {
                                i15 = ((c1) d1Var.f[i14].get(i16)).b;
                            }
                        }
                        int max = Math.max(0, i15 - 1439);
                        int i17 = (r31Var.d + 1) % 7;
                        int i18 = 1440;
                        for (int i19 = 0; i19 < d1Var.f[i17].size(); i19++) {
                            if (((c1) d1Var.f[i17].get(i19)).a < i18) {
                                i18 = ((c1) d1Var.f[i17].get(i19)).a;
                            }
                        }
                        int i20 = i18 + 1439;
                        CharSequence charSequence = r31Var.l;
                        ArrayList arrayList = d1Var.f[r31Var.d];
                        int i21 = 0;
                        while (i12 < 7) {
                            ArrayList arrayList2 = d1Var.f[i12];
                            if (arrayList2 != null) {
                                i21 = Math.max(1, arrayList2.size()) + i21;
                            }
                            i12++;
                        }
                        lg.f1 f1Var = new lg.f1(charSequence, arrayList, max, i20, 28 - i21);
                        f1Var.f = new n(d1Var, 4);
                        f1Var.h = new ii.e(25, d1Var, r31Var);
                        d1Var.presentFragment(f1Var);
                        break;
                    } else {
                        if (d1Var.f[r31Var.d].isEmpty()) {
                            ((h5) view).setChecked(true);
                            d1Var.f[r31Var.d].add(new c1(0, 1439));
                            d1Var.c0(r31Var.d);
                        } else {
                            d1Var.f[r31Var.d].clear();
                            ((h5) view).setChecked(false);
                        }
                        ((h5) view).setValue(lg.d1.f0(d1Var.f[r31Var.d]));
                        d1Var.d0(true);
                        break;
                    }
                }
                break;
            case 2:
                final lg.f1 f1Var2 = (lg.f1) obj3;
                r31 r31Var2 = (r31) obj;
                final View view2 = (View) obj2;
                int i22 = f1Var2.c;
                int i23 = f1Var2.d;
                ArrayList arrayList3 = f1Var2.b;
                int i24 = r31Var2.d;
                if (i24 == -1) {
                    f1Var2.r = !f1Var2.r;
                    arrayList3.clear();
                    if (f1Var2.r) {
                        arrayList3.add(new c1(0, 1439));
                    }
                    q8 q8Var = (q8) view2;
                    boolean z11 = f1Var2.r;
                    r31Var2.e = z11;
                    q8Var.setChecked(z11);
                    boolean z12 = f1Var2.r;
                    q8Var.b(k6.x0(null, z12 ? k6.f6 : k6.e6, false), z12);
                    f1Var2.n.g3.O(true);
                    n nVar = f1Var2.f;
                    if (nVar != null) {
                        nVar.run();
                        break;
                    }
                } else if (i24 == -2) {
                    if (arrayList3.isEmpty() || f1Var2.Z()) {
                        if (f1Var2.Z()) {
                            arrayList3.clear();
                        }
                        int j10 = Utilities.j(480, i23 - 1, i22);
                        arrayList3.add(new c1(j10, Utilities.j(1200, i23, j10 + 1)));
                    } else {
                        int i25 = ((c1) k2.p1.h(1, arrayList3)).b;
                        int j11 = Utilities.j(i25 + 30, i23 - 1, i22);
                        arrayList3.add(new c1(j11, Utilities.j((i25 + 1560) / 2, i23, j11 + 1)));
                    }
                    n nVar2 = f1Var2.f;
                    if (nVar2 != null) {
                        nVar2.run();
                    }
                    f1Var2.n.g3.O(true);
                    break;
                } else if (r31Var2.a == 3 && (i3 = i24 / 3) >= 0 && i3 < arrayList3.size()) {
                    int i26 = i3 - 1;
                    c1 c1Var = i26 >= 0 ? (c1) arrayList3.get(i26) : null;
                    final c1 c1Var2 = (c1) arrayList3.get(i3);
                    int i27 = i3 + 1;
                    c1 c1Var3 = i27 < arrayList3.size() ? (c1) arrayList3.get(i27) : null;
                    int i28 = r31Var2.d % 3;
                    if (i28 == 0) {
                        Activity parentActivity = f1Var2.getParentActivity();
                        String M0 = bd.M0(2131752750, null);
                        int i29 = c1Var2.a;
                        if (c1Var != null) {
                            i22 = c1Var.b + 1;
                        }
                        t4.W(parentActivity, M0, i29, i22, c1Var2.b - 1, new u10() { // from class: lg.e1
                            @Override // org.telegram.messenger.u10
                            public final void a(Object obj4) {
                                Integer num = (Integer) obj4;
                                switch (i12) {
                                    case 0:
                                        f1 f1Var3 = f1Var2;
                                        boolean a02 = f1Var3.a0();
                                        l8 l8Var = (l8) view2;
                                        int intValue = num.intValue();
                                        c1Var2.a = intValue;
                                        l8Var.w(c1.a(intValue), true);
                                        if (a02 != f1Var3.a0()) {
                                            f1Var3.n.g3.O(true);
                                        }
                                        n nVar3 = f1Var3.f;
                                        if (nVar3 != null) {
                                            nVar3.run();
                                            break;
                                        }
                                        break;
                                    default:
                                        f1 f1Var4 = f1Var2;
                                        boolean a03 = f1Var4.a0();
                                        l8 l8Var2 = (l8) view2;
                                        int intValue2 = num.intValue();
                                        c1Var2.b = intValue2;
                                        l8Var2.w(c1.a(intValue2), true);
                                        if (a03 != f1Var4.a0()) {
                                            f1Var4.n.g3.O(true);
                                        }
                                        n nVar4 = f1Var4.f;
                                        if (nVar4 != null) {
                                            nVar4.run();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        break;
                    } else if (i28 == 1) {
                        Activity parentActivity2 = f1Var2.getParentActivity();
                        String M02 = bd.M0(2131752756, null);
                        int i30 = c1Var2.b;
                        int i31 = c1Var2.a + 1;
                        if (c1Var3 != null) {
                            i23 = c1Var3.a - 1;
                        }
                        t4.W(parentActivity2, M02, i30, i31, i23, new u10() { // from class: lg.e1
                            @Override // org.telegram.messenger.u10
                            public final void a(Object obj4) {
                                Integer num = (Integer) obj4;
                                switch (i11) {
                                    case 0:
                                        f1 f1Var3 = f1Var2;
                                        boolean a02 = f1Var3.a0();
                                        l8 l8Var = (l8) view2;
                                        int intValue = num.intValue();
                                        c1Var2.a = intValue;
                                        l8Var.w(c1.a(intValue), true);
                                        if (a02 != f1Var3.a0()) {
                                            f1Var3.n.g3.O(true);
                                        }
                                        n nVar3 = f1Var3.f;
                                        if (nVar3 != null) {
                                            nVar3.run();
                                            break;
                                        }
                                        break;
                                    default:
                                        f1 f1Var4 = f1Var2;
                                        boolean a03 = f1Var4.a0();
                                        l8 l8Var2 = (l8) view2;
                                        int intValue2 = num.intValue();
                                        c1Var2.b = intValue2;
                                        l8Var2.w(c1.a(intValue2), true);
                                        if (a03 != f1Var4.a0()) {
                                            f1Var4.n.g3.O(true);
                                        }
                                        n nVar4 = f1Var4.f;
                                        if (nVar4 != null) {
                                            nVar4.run();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        break;
                    } else if (i28 == 2) {
                        arrayList3.remove(i3);
                        if (arrayList3.isEmpty()) {
                            arrayList3.add(new c1(0, 1439));
                        }
                        f1Var2.n.g3.O(true);
                        n nVar3 = f1Var2.f;
                        if (nVar3 != null) {
                            nVar3.run();
                            break;
                        }
                    }
                }
                break;
            case 3:
            default:
                View view3 = (View) obj2;
                if (((t3[]) obj3)[0] != null && (view3 instanceof b6)) {
                    ((b6) view3).B();
                    break;
                }
                break;
            case 4:
                x1.Z((x1) obj3, (r31) obj, (View) obj2);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.d1
    public void k(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.f1 f1Var;
        q0 q0Var = (q0) this.b;
        q0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (f1Var = q0Var.d) != null && f1Var.isShowing()) {
            q0Var.d.d(true);
        }
    }

    @Override // org.telegram.ui.Components.vs
    public void m() {
        switch (this.a) {
            case 7:
                s0 s0Var = (s0) this.b;
                h1 h1Var = s0Var.d;
                mi.a aVar = s0Var.f;
                if (aVar != null) {
                    aVar.s = true;
                    aVar.r = h1Var.l2;
                }
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.b;
                    if (pageBlock instanceof TL_iv.pageBlockDetails) {
                        ((TL_iv.pageBlockDetails) pageBlock).title = d6.f(h1Var.getText());
                    }
                }
                c3 c3Var = s0Var.h;
                if (c3Var != null && s0Var.f != null) {
                    t3.S1(c3Var.a);
                    break;
                }
                break;
            case 12:
                ((f5) this.b).g();
                break;
            default:
                n5 n5Var = (n5) this.b;
                mi.a aVar2 = n5Var.a;
                if (aVar2 != null) {
                    aVar2.s = true;
                    aVar2.r = n5Var.r.l2;
                }
                n5Var.w();
                b3 b3Var = n5Var.F;
                if (b3Var != null && n5Var.a != null) {
                    t3.S1(b3Var.a);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.nw
    public boolean y(uw uwVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i3, int i10, m91 m91Var) {
        h4 h4Var = (h4) this.b;
        if (arrayList.isEmpty() || ((pr) arrayList.get(0)).a <= 0) {
            return false;
        }
        h4Var.run(((pr) arrayList.get(0)).a);
        uwVar.finishFragment();
        return true;
    }
}
