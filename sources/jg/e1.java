package jg;

import a8.of;
import a8.pf;
import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import bi.s9;
import di.d6;
import fi.ua;
import hi.u2;
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
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import li.b3;
import li.c3;
import li.f6;
import li.g5;
import li.h5;
import li.i4;
import li.p5;
import li.q5;
import li.v3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.a9;
import org.telegram.ui.Cells.n5;
import org.telegram.ui.Cells.v8;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.hu;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.u61;
import org.telegram.ui.cf1;
import org.telegram.ui.ey;
import org.telegram.ui.xx;
import org.webrtc.GlGenericDrawer;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e1 implements Utilities.Callback5, org.telegram.ui.ActionBar.b2, hu, li.n0, xx, q5, c0.j, m4.e0, m4.h1, e2.j, m4.f1, e9.k, oe.d, oi.m, Vector.TLDeserializer, GlGenericDrawer.TextureCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.xx
    public /* synthetic */ boolean C() {
        return false;
    }

    @Override // oe.d
    public void E(int i10, float f7, float f10, oe.e eVar) {
        ((Switch) this.b).invalidate();
    }

    @Override // org.telegram.ui.xx
    public /* synthetic */ boolean K(ey eyVar) {
        return false;
    }

    @Override // li.n0
    public l80 a(li.g1 g1Var) {
        return l80.H((li.b2) ((s0) this.b).b, g1Var);
    }

    @Override // e2.j
    public void accept(Object obj) {
        switch (this.a) {
            case 18:
                ((m4.n1) obj).f((b2.a1) this.b);
                break;
            default:
                ((n2.j) obj).a((pa.d) this.b);
                break;
        }
    }

    @Override // e9.k
    public Object apply(Object obj) {
        switch (this.a) {
            case 21:
                m4.w1 w1Var = (m4.w1) this.b;
                Bitmap bitmap = (Bitmap) obj;
                int height = bitmap.getHeight();
                int width = bitmap.getWidth();
                j9.a aVar = (j9.a) w1Var.c;
                if (!aVar.a(Math.max(height, width))) {
                    return bitmap;
                }
                if (aVar.a(height)) {
                    height--;
                }
                if (aVar.a(width)) {
                    width--;
                }
                return ag.t0.e(Bitmap.createScaledBitmap(bitmap, width, height, true));
            default:
                d5.z zVar = (d5.z) this.b;
                Bitmap bitmap2 = (Bitmap) obj;
                int width2 = bitmap2.getWidth();
                int i10 = zVar.b;
                if (width2 > i10 || bitmap2.getHeight() > i10) {
                    float f7 = i10;
                    float width3 = bitmap2.getWidth();
                    float height2 = bitmap2.getHeight();
                    float min = Math.min(f7 / width3, f7 / height2);
                    bitmap2 = Bitmap.createScaledBitmap(bitmap2, (int) (width3 * min), (int) (height2 * min), true);
                }
                return ag.t0.e(bitmap2);
        }
    }

    @Override // c0.j
    public Object b(c0.i iVar) {
        m4.f0 f0Var = (m4.f0) this.b;
        f0Var.o.post(new k2.e0(12, f0Var, iVar));
        return "onPlayRequested";
    }

    @Override // m4.h1
    public Object c(m4.f0 f0Var, m4.w wVar, int i10) {
        int i11 = this.a;
        Object obj = this.b;
        switch (i11) {
            case 17:
                return f0Var.l(wVar, (f9.i0) obj);
            default:
                m4.f1 f1Var = (m4.f1) obj;
                k9.w wVar2 = k9.w.b;
                if (!f0Var.j()) {
                    f1Var.e(f0Var.t, wVar);
                    m4.j1.P0(f0Var, wVar, i10, new m4.t1(0));
                }
                return k9.w.b;
        }
    }

    @Override // m4.e0
    public void d(m4.v vVar, int i10) {
        vVar.c(i10, (b2.c1) this.b);
    }

    @Override // org.telegram.tgnet.Vector.TLDeserializer
    public TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
        TLRPC.PhotoSize lambda$readParams$0;
        TLRPC.PhotoSize lambda$readParams$02;
        switch (this.a) {
            case 27:
                lambda$readParams$0 = ((TLRPC.TL_stickerSet) this.b).lambda$readParams$0(inputSerializedData, i10, z10);
                return lambda$readParams$0;
            default:
                lambda$readParams$02 = ((TLRPC.TL_stickerSet_layer143) this.b).lambda$readParams$0(inputSerializedData, i10, z10);
                return lambda$readParams$02;
        }
    }

    @Override // m4.f1
    public void e(m4.n1 n1Var, m4.w wVar) {
        ((e2.j) this.b).accept(n1Var);
    }

    public k5.b f(a8.h0 h0Var) {
        k5.c cVar = (k5.c) this.b;
        URL url = (URL) h0Var.b;
        String c10 = of.c("CctTransportBackend");
        if (Log.isLoggable(c10, 4)) {
            Log.i(c10, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(cVar.g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.9 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) h0Var.d;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    h5 h5Var = cVar.a;
                    l5.i iVar = (l5.i) h0Var.c;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    ma.d dVar = (ma.d) h5Var.a;
                    ma.e eVar = new ma.e(bufferedWriter, dVar.a, dVar.b, dVar.c, dVar.d);
                    eVar.h(iVar);
                    eVar.j();
                    eVar.b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer valueOf = Integer.valueOf(responseCode);
                    String c11 = of.c("CctTransportBackend");
                    if (Log.isLoggable(c11, 4)) {
                        Log.i(c11, String.format("Status Code: %d", valueOf));
                    }
                    of.a(httpURLConnection.getHeaderField("Content-Type"), "CctTransportBackend", "Content-Type: %s");
                    of.a(httpURLConnection.getHeaderField("Content-Encoding"), "CctTransportBackend", "Content-Encoding: %s");
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new k5.b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new k5.b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            k5.b bVar = new k5.b(responseCode, null, l5.m.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).a);
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
        } catch (ConnectException e) {
            e = e;
            of.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new k5.b(500, null, 0L);
        } catch (UnknownHostException e10) {
            e = e10;
            of.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new k5.b(500, null, 0L);
        } catch (IOException e11) {
            e = e11;
            of.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new k5.b(400, null, 0L);
        } catch (ka.b e12) {
            e = e12;
            of.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new k5.b(400, null, 0L);
        }
    }

    @Override // org.telegram.ui.Components.hu
    public void g() {
        switch (this.a) {
            case 7:
                li.s0 s0Var = (li.s0) this.b;
                li.g1 g1Var = s0Var.d;
                li.a aVar = s0Var.f;
                if (aVar != null) {
                    aVar.s = true;
                    aVar.r = g1Var.E;
                }
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.b;
                    if (pageBlock instanceof TL_iv.pageBlockDetails) {
                        ((TL_iv.pageBlockDetails) pageBlock).title = f6.f(g1Var.getText());
                    }
                }
                c3 c3Var = s0Var.h;
                if (c3Var != null && s0Var.f != null) {
                    v3.U1(c3Var.a);
                    break;
                }
                break;
            case 12:
                ((g5) this.b).g();
                break;
            default:
                p5 p5Var = (p5) this.b;
                li.a aVar2 = p5Var.a;
                if (aVar2 != null) {
                    aVar2.s = true;
                    aVar2.r = p5Var.r.E;
                }
                p5Var.t();
                b3 b3Var = p5Var.E;
                if (b3Var != null && p5Var.a != null) {
                    v3.U1(b3Var.a);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        int i11;
        switch (this.a) {
            case 2:
                z1 z1Var = ((q1) this.b).a;
                i11 = ((r2) z1Var).currentAccount;
                c2 f7 = c2.f(i11);
                ArrayList arrayList = z1Var.b;
                int i12 = f7.a;
                int i13 = 0;
                while (i13 < arrayList.size()) {
                    if (f7.c(((Integer) arrayList.get(i13)).intValue()) == null) {
                        arrayList.remove(i13);
                        i13--;
                    }
                    i13++;
                }
                if (!arrayList.isEmpty()) {
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        b2 c10 = f7.c(((Integer) arrayList.get(i14)).intValue());
                        f7.b.remove(c10);
                        f7.a(c10.b);
                        TLRPC.TL_messages_deleteQuickReplyShortcut tL_messages_deleteQuickReplyShortcut = new TLRPC.TL_messages_deleteQuickReplyShortcut();
                        tL_messages_deleteQuickReplyShortcut.shortcut_id = c10.a;
                        ConnectionsManager.getInstance(i12).sendRequest(tL_messages_deleteQuickReplyShortcut, new d6(6));
                        if ("hello".equals(c10.b)) {
                            ConnectionsManager.getInstance(i12).sendRequest(new TL_account.updateBusinessGreetingMessage(), null);
                            TLRPC.UserFull userFull = MessagesController.getInstance(i12).getUserFull(UserConfig.getInstance(i12).getClientUserId());
                            if (userFull != null) {
                                userFull.flags2 &= -5;
                                userFull.business_greeting_message = null;
                                MessagesStorage.getInstance(i12).updateUserInfo(userFull, true);
                            }
                        } else if ("away".equals(c10.b)) {
                            ConnectionsManager.getInstance(i12).sendRequest(new TL_account.updateBusinessAwayMessage(), null);
                            TLRPC.UserFull userFull2 = MessagesController.getInstance(i12).getUserFull(UserConfig.getInstance(i12).getClientUserId());
                            if (userFull2 != null) {
                                userFull2.flags2 &= -9;
                                userFull2.business_away_message = null;
                                MessagesStorage.getInstance(i12).updateUserInfo(userFull2, true);
                            }
                        }
                    }
                    f7.l();
                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i12);
                    messagesStorage.getStorageQueue().postRunnable(new fi.w0(2, arrayList, messagesStorage));
                    NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                }
                z1.Y(z1Var);
                break;
            default:
                ((s9) this.b).run();
                break;
        }
    }

    public void i(int i10) {
        li.z zVar = (li.z) this.b;
        zVar.c = i10;
        zVar.e(i10);
    }

    @Override // oi.m
    public void k(int i10) {
        oi.a aVar = (oi.a) this.b;
        oi.q qVar = aVar.a;
        ch.f fVar = aVar.d;
        oi.d dVar = aVar.e;
        if (Build.VERSION.SDK_INT < 31 || fVar == null) {
            return;
        }
        if (pf.a(i10, 4) || pf.a(i10, 2)) {
            qi.a e = qVar.e();
            ViewGroup viewGroup = aVar.h;
            if (viewGroup != null) {
                e.b(viewGroup.getY(), aVar.g.getWidth(), aVar.h.getY() + aVar.h.getHeight());
            }
            if (dVar != null) {
                ArrayList arrayList = dVar.a;
                dVar.b = e.b;
                while (dVar.b > arrayList.size()) {
                    arrayList.add(new oi.b(arrayList.size()));
                }
                for (int i11 = 0; i11 < dVar.b; i11++) {
                    oi.b bVar = (oi.b) arrayList.get(i11);
                    bVar.a.set(e.c(i11));
                    bVar.b(dVar.j, dVar.k, dVar.l);
                    int i12 = dVar.m;
                    int i13 = dVar.n;
                    int i14 = dVar.o;
                    int i15 = dVar.p;
                    bVar.r = i12;
                    bVar.s = i13;
                    bVar.t = i14;
                    bVar.u = i15;
                }
            }
            fVar.h(e);
        }
        if (dVar != null) {
            dVar.c = aVar.i;
            dVar.d = aVar.g;
            boolean z10 = qVar.h > 0;
            boolean z11 = !z10;
            if (dVar.i != z11) {
                dVar.i = z11;
                int i16 = !z10 ? 5 : 1;
                dVar.j = i16;
                int i17 = z10 ? 1 : 10;
                dVar.k = i17;
                dVar.l = Math.max(i16, i17);
                for (int i18 = 0; i18 < dVar.b; i18++) {
                    ((oi.b) dVar.a.get(i18)).b(dVar.j, dVar.k, dVar.l);
                }
                dVar.f();
            }
            int i19 = qVar.i;
            int i20 = qVar.j;
            dVar.q = i19;
            dVar.r = i20;
            dVar.f();
            dVar.e();
        }
        fVar.e(aVar.i, aVar.g.getWidth(), aVar.g.getHeight());
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i10;
        switch (this.a) {
            case 0:
                h1 h1Var = (h1) this.b;
                u61 u61Var = (u61) obj;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                float floatValue = ((Float) obj4).floatValue();
                ((Float) obj5).getClass();
                int i11 = u61Var.d;
                if (i11 == -1) {
                    boolean z10 = !h1Var.d;
                    h1Var.d = z10;
                    ((a9) view).setChecked(z10);
                    h1Var.a.g3.O(true);
                    h1Var.Z(true);
                    break;
                } else if (i11 == -2) {
                    f2 f2Var = new f2(null);
                    f2Var.n = h1Var.n;
                    f2Var.c = new ai.n1(26, h1Var, view);
                    h1Var.presentFragment(f2Var);
                    break;
                } else if (u61Var.a == 5 && i11 >= 0 && i11 < h1Var.f.length) {
                    if (!LocaleController.isRTL ? floatValue < view.getMeasuredWidth() - AndroidUtilities.dp(76.0f) : floatValue > AndroidUtilities.dp(76.0f)) {
                        int i12 = (u61Var.d + 6) % 7;
                        int i13 = 0;
                        for (int i14 = 0; i14 < h1Var.f[i12].size(); i14++) {
                            if (((g1) h1Var.f[i12].get(i14)).b > i13) {
                                i13 = ((g1) h1Var.f[i12].get(i14)).b;
                            }
                        }
                        int max = Math.max(0, i13 - 1439);
                        int i15 = (u61Var.d + 1) % 7;
                        int i16 = 1440;
                        for (int i17 = 0; i17 < h1Var.f[i15].size(); i17++) {
                            if (((g1) h1Var.f[i15].get(i17)).a < i16) {
                                i16 = ((g1) h1Var.f[i15].get(i17)).a;
                            }
                        }
                        int i18 = i16 + 1439;
                        CharSequence charSequence = u61Var.l;
                        ArrayList arrayList = h1Var.f[u61Var.d];
                        int i19 = 0;
                        for (int i20 = 0; i20 < 7; i20++) {
                            ArrayList arrayList2 = h1Var.f[i20];
                            if (arrayList2 != null) {
                                i19 = Math.max(1, arrayList2.size()) + i19;
                            }
                        }
                        j1 j1Var = new j1(charSequence, arrayList, max, i18, 28 - i19);
                        j1Var.f = new ua(h1Var, 27);
                        j1Var.h = new u2(23, h1Var, u61Var);
                        h1Var.presentFragment(j1Var);
                        break;
                    } else {
                        if (h1Var.f[u61Var.d].isEmpty()) {
                            ((n5) view).setChecked(true);
                            h1Var.f[u61Var.d].add(new g1(0, 1439));
                            h1Var.Y(u61Var.d);
                        } else {
                            h1Var.f[u61Var.d].clear();
                            ((n5) view).setChecked(false);
                        }
                        ((n5) view).setValue(h1.b0(h1Var.f[u61Var.d]));
                        h1Var.Z(true);
                        break;
                    }
                }
                break;
            case 1:
                final j1 j1Var2 = (j1) this.b;
                u61 u61Var2 = (u61) obj;
                final View view2 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i21 = j1Var2.c;
                int i22 = j1Var2.d;
                ArrayList arrayList3 = j1Var2.b;
                int i23 = u61Var2.d;
                if (i23 == -1) {
                    j1Var2.r = !j1Var2.r;
                    arrayList3.clear();
                    if (j1Var2.r) {
                        arrayList3.add(new g1(0, 1439));
                    }
                    a9 a9Var = (a9) view2;
                    boolean z11 = j1Var2.r;
                    u61Var2.e = z11;
                    a9Var.setChecked(z11);
                    boolean z12 = j1Var2.r;
                    a9Var.b(y6.x0(null, z12 ? y6.f6 : y6.e6, false), z12);
                    j1Var2.n.g3.O(true);
                    ua uaVar = j1Var2.f;
                    if (uaVar != null) {
                        uaVar.run();
                        break;
                    }
                } else if (i23 == -2) {
                    if (arrayList3.isEmpty() || j1Var2.V()) {
                        if (j1Var2.V()) {
                            arrayList3.clear();
                        }
                        int clamp = Utilities.clamp(480, i22 - 1, i21);
                        arrayList3.add(new g1(clamp, Utilities.clamp(1200, i22, clamp + 1)));
                    } else {
                        int i24 = ((g1) ic.a.g(1, arrayList3)).b;
                        int clamp2 = Utilities.clamp(i24 + 30, i22 - 1, i21);
                        arrayList3.add(new g1(clamp2, Utilities.clamp((i24 + 1560) / 2, i22, clamp2 + 1)));
                    }
                    ua uaVar2 = j1Var2.f;
                    if (uaVar2 != null) {
                        uaVar2.run();
                    }
                    j1Var2.n.g3.O(true);
                    break;
                } else if (u61Var2.a == 3 && (i10 = i23 / 3) >= 0 && i10 < arrayList3.size()) {
                    int i25 = i10 - 1;
                    g1 g1Var = i25 >= 0 ? (g1) arrayList3.get(i25) : null;
                    final g1 g1Var2 = (g1) arrayList3.get(i10);
                    int i26 = i10 + 1;
                    g1 g1Var3 = i26 < arrayList3.size() ? (g1) arrayList3.get(i26) : null;
                    int i27 = u61Var2.d % 3;
                    if (i27 == 0) {
                        Activity parentActivity = j1Var2.getParentActivity();
                        String string = LocaleController.getString(R.string.BusinessHoursDayOpenHourPicker);
                        int i28 = g1Var2.a;
                        if (g1Var != null) {
                            i21 = g1Var.b + 1;
                        }
                        final int i29 = 0;
                        org.telegram.ui.Components.g5.W(parentActivity, string, i28, i21, g1Var2.b - 1, new Utilities.Callback() { // from class: jg.i1
                            @Override // org.telegram.messenger.Utilities.Callback
                            public final void run(Object obj6) {
                                Integer num = (Integer) obj6;
                                switch (i29) {
                                    case 0:
                                        j1 j1Var3 = j1Var2;
                                        boolean W = j1Var3.W();
                                        v8 v8Var = (v8) view2;
                                        int intValue = num.intValue();
                                        g1Var2.a = intValue;
                                        v8Var.w(g1.a(intValue), true);
                                        if (W != j1Var3.W()) {
                                            j1Var3.n.g3.O(true);
                                        }
                                        ua uaVar3 = j1Var3.f;
                                        if (uaVar3 != null) {
                                            uaVar3.run();
                                            break;
                                        }
                                        break;
                                    default:
                                        j1 j1Var4 = j1Var2;
                                        boolean W2 = j1Var4.W();
                                        v8 v8Var2 = (v8) view2;
                                        int intValue2 = num.intValue();
                                        g1Var2.b = intValue2;
                                        v8Var2.w(g1.a(intValue2), true);
                                        if (W2 != j1Var4.W()) {
                                            j1Var4.n.g3.O(true);
                                        }
                                        ua uaVar4 = j1Var4.f;
                                        if (uaVar4 != null) {
                                            uaVar4.run();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        break;
                    } else if (i27 == 1) {
                        Activity parentActivity2 = j1Var2.getParentActivity();
                        String string2 = LocaleController.getString(R.string.BusinessHoursDayCloseHourPicker);
                        int i30 = g1Var2.b;
                        int i31 = g1Var2.a + 1;
                        if (g1Var3 != null) {
                            i22 = g1Var3.a - 1;
                        }
                        final int i32 = 1;
                        org.telegram.ui.Components.g5.W(parentActivity2, string2, i30, i31, i22, new Utilities.Callback() { // from class: jg.i1
                            @Override // org.telegram.messenger.Utilities.Callback
                            public final void run(Object obj6) {
                                Integer num = (Integer) obj6;
                                switch (i32) {
                                    case 0:
                                        j1 j1Var3 = j1Var2;
                                        boolean W = j1Var3.W();
                                        v8 v8Var = (v8) view2;
                                        int intValue = num.intValue();
                                        g1Var2.a = intValue;
                                        v8Var.w(g1.a(intValue), true);
                                        if (W != j1Var3.W()) {
                                            j1Var3.n.g3.O(true);
                                        }
                                        ua uaVar3 = j1Var3.f;
                                        if (uaVar3 != null) {
                                            uaVar3.run();
                                            break;
                                        }
                                        break;
                                    default:
                                        j1 j1Var4 = j1Var2;
                                        boolean W2 = j1Var4.W();
                                        v8 v8Var2 = (v8) view2;
                                        int intValue2 = num.intValue();
                                        g1Var2.b = intValue2;
                                        v8Var2.w(g1.a(intValue2), true);
                                        if (W2 != j1Var4.W()) {
                                            j1Var4.n.g3.O(true);
                                        }
                                        ua uaVar4 = j1Var4.f;
                                        if (uaVar4 != null) {
                                            uaVar4.run();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        break;
                    } else if (i27 == 2) {
                        arrayList3.remove(i10);
                        if (arrayList3.isEmpty()) {
                            arrayList3.add(new g1(0, 1439));
                        }
                        j1Var2.n.g3.O(true);
                        ua uaVar3 = j1Var2.f;
                        if (uaVar3 != null) {
                            uaVar3.run();
                            break;
                        }
                    }
                }
                break;
            case 2:
            default:
                View view3 = (View) obj2;
                Integer num = (Integer) obj3;
                Float f7 = (Float) obj4;
                Float f10 = (Float) obj5;
                if (((v3[]) this.b)[0] != null) {
                    num.intValue();
                    f7.floatValue();
                    f10.floatValue();
                    if (view3 instanceof li.d6) {
                        ((li.d6) view3).A();
                        break;
                    }
                }
                break;
            case 3:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                f2.V((f2) this.b, (u61) obj, (View) obj2);
                break;
        }
    }

    @Override // org.telegram.ui.xx
    public boolean v(ey eyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, cf1 cf1Var) {
        i4 i4Var = (i4) this.b;
        if (arrayList.isEmpty() || ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId <= 0) {
            return false;
        }
        i4Var.run(((MessagesStorage.TopicKey) arrayList.get(0)).dialogId);
        eyVar.finishFragment();
        return true;
    }

    @Override // oe.d
    public /* synthetic */ void z(float f7, int i10) {
    }

    @Override // org.webrtc.GlGenericDrawer.TextureCallback
    public void run(Bitmap bitmap, int i10) {
        org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.b;
        if (bitmap == null || bitmap.getPixel(0, 0) == 0) {
            return;
        }
        Utilities.stackBlurBitmap(bitmap, Math.max(7, Math.max(bitmap.getWidth(), bitmap.getHeight()) / 180));
        AndroidUtilities.runOnUIThread(new d71(15, tVar, bitmap));
    }
}
