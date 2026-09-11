package fi;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import bi.c7;
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
import ji.g6;
import ji.i6;
import ji.j5;
import ji.s5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.i5;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.xt;
import org.telegram.ui.eg1;
import org.telegram.ui.oy;
import org.telegram.ui.uy;
import w7.f6;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements org.telegram.ui.ActionBar.a2, Utilities.Callback5, c3.g, e2.m, f2.t, xt, ji.o0, oy {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f(j2.a aVar, Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.oy
    public /* synthetic */ boolean B() {
        return false;
    }

    @Override // org.telegram.ui.oy
    public /* synthetic */ boolean K(uy uyVar) {
        return false;
    }

    @Override // f2.t
    public void a(long j3, e2.v vVar) {
        switch (this.a) {
            case 19:
                c3.b.d(j3, vVar, ((j4.c0) this.b).c);
                break;
            default:
                c3.b.e(j3, vVar, ((j4.c0) this.b).c);
                break;
        }
    }

    public j5.b b(aa.a aVar) {
        j5.c cVar = (j5.c) this.b;
        URL url = (URL) aVar.c;
        String c10 = f6.c("CctTransportBackend");
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
        String str = (String) aVar.b;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    ji.u4 u4Var = cVar.a;
                    k5.i iVar = (k5.i) aVar.d;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    ka.d dVar = (ka.d) u4Var.b;
                    ka.e eVar = new ka.e(bufferedWriter, dVar.a, dVar.b, dVar.c, dVar.d);
                    eVar.h(iVar);
                    eVar.j();
                    eVar.b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer valueOf = Integer.valueOf(responseCode);
                    String c11 = f6.c("CctTransportBackend");
                    if (Log.isLoggable(c11, 4)) {
                        Log.i(c11, String.format("Status Code: %d", valueOf));
                    }
                    f6.a(httpURLConnection.getHeaderField("Content-Type"), "CctTransportBackend", "Content-Type: %s");
                    f6.a(httpURLConnection.getHeaderField("Content-Encoding"), "CctTransportBackend", "Content-Encoding: %s");
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new j5.b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new j5.b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            j5.b bVar = new j5.b(responseCode, null, k5.m.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).a);
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
        } catch (ia.b e7) {
            e = e7;
            f6.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new j5.b(400, null, 0L);
        } catch (ConnectException e10) {
            e = e10;
            f6.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new j5.b(500, null, 0L);
        } catch (UnknownHostException e11) {
            e = e11;
            f6.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new j5.b(500, null, 0L);
        } catch (IOException e12) {
            e = e12;
            f6.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new j5.b(400, null, 0L);
        }
    }

    public void c(int i10) {
        ji.a0 a0Var = (ji.a0) this.b;
        a0Var.c = i10;
        a0Var.f(i10);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        switch (this.a) {
            case 0:
                ((e) this.b).run();
                break;
            case 1:
                m mVar = (m) this.b;
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                updatestarrefprogram.bot = mVar.getMessagesController().getInputUser(mVar.P);
                updatestarrefprogram.commission_permille = 0;
                org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(mVar.getParentActivity(), 3, null);
                b2Var2.q(150L);
                mVar.getConnectionsManager().sendRequest(updatestarrefprogram, new b(mVar, b2Var2, 0));
                break;
            case 13:
                ig.y1 y1Var = ((ig.p1) this.b).a;
                i11 = ((org.telegram.ui.ActionBar.n2) y1Var).currentAccount;
                ig.b2 f7 = ig.b2.f(i11);
                ArrayList arrayList = y1Var.b;
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
                        ig.a2 c10 = f7.c(((Integer) arrayList.get(i14)).intValue());
                        f7.b.remove(c10);
                        f7.a(c10.b);
                        TLRPC.TL_messages_deleteQuickReplyShortcut tL_messages_deleteQuickReplyShortcut = new TLRPC.TL_messages_deleteQuickReplyShortcut();
                        tL_messages_deleteQuickReplyShortcut.shortcut_id = c10.a;
                        ConnectionsManager.getInstance(i12).sendRequest(tL_messages_deleteQuickReplyShortcut, new c7(6));
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
                    messagesStorage.getStorageQueue().postRunnable(new di.w0(2, arrayList, messagesStorage));
                    NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                }
                ig.y1.X(y1Var);
                break;
            default:
                ((bi.e4) this.b).run();
                break;
        }
    }

    @Override // ji.o0
    public n70 i(ji.h1 h1Var) {
        return n70.H((ji.c2) ((z2.b) this.b).a, h1Var);
    }

    @Override // e2.m
    public void invoke(Object obj) {
        switch (this.a) {
            case 4:
                ((b2.z0) obj).onMediaMetadataChanged((b2.n0) this.b);
                break;
            case 5:
                ((b2.z0) obj).onAudioAttributesChanged((b2.e) this.b);
                break;
            case 6:
                ((b2.z0) obj).onTrackSelectionParametersChanged((b2.q1) this.b);
                break;
            case 7:
                ((b2.z0) obj).onCues((d2.c) this.b);
                break;
            case 8:
                ((b2.z0) obj).onMediaMetadataChanged(((i2.c0) this.b).a.O);
                break;
            case 9:
                ((b2.z0) obj).onMetadata((b2.p0) this.b);
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            default:
                ((j2.b) obj).c((u2.b0) this.b);
                break;
            case 15:
                ((j2.b) obj).h((b2.u0) this.b);
                break;
            case 16:
                ((j2.b) obj).onSeekStarted((j2.a) this.b);
                break;
            case 17:
                ((j2.b) obj).a((i2.h) this.b);
                break;
        }
    }

    @Override // org.telegram.ui.Components.xt
    public void j() {
        switch (this.a) {
            case 23:
                ji.t0 t0Var = (ji.t0) this.b;
                ji.h1 h1Var = t0Var.d;
                ji.a aVar = t0Var.f;
                if (aVar != null) {
                    aVar.s = true;
                    aVar.r = h1Var.E;
                }
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.b;
                    if (pageBlock instanceof TL_iv.pageBlockDetails) {
                        ((TL_iv.pageBlockDetails) pageBlock).title = i6.f(h1Var.getText());
                    }
                }
                ji.c3 c3Var = t0Var.h;
                if (c3Var != null && t0Var.f != null) {
                    ji.v3.N1(c3Var.a);
                    break;
                }
                break;
            case 28:
                ((j5) this.b).h();
                break;
            default:
                s5 s5Var = (s5) this.b;
                ji.a aVar2 = s5Var.a;
                if (aVar2 != null) {
                    aVar2.s = true;
                    aVar2.r = s5Var.r.E;
                }
                s5Var.u();
                ji.b3 b3Var = s5Var.E;
                if (b3Var != null && s5Var.a != null) {
                    ji.v3.N1(b3Var.a);
                    break;
                }
                break;
        }
    }

    @Override // c3.g
    public long l(long j3) {
        return e2.d0.i((j3 * r0.e) / 1000000, 0L, ((c3.u) this.b).j - 1);
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i10;
        switch (this.a) {
            case 2:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                ((e5) this.b).V((h51) obj);
                break;
            case 11:
                ig.g1 g1Var = (ig.g1) this.b;
                h51 h51Var = (h51) obj;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                float floatValue = ((Float) obj4).floatValue();
                ((Float) obj5).getClass();
                int i11 = h51Var.d;
                if (i11 == -1) {
                    boolean z10 = !g1Var.e;
                    g1Var.e = z10;
                    ((w8) view).setChecked(z10);
                    g1Var.a.Y2.N(true);
                    g1Var.Y(true);
                    break;
                } else if (i11 == -2) {
                    ig.e2 e2Var = new ig.e2(null);
                    e2Var.n = g1Var.r;
                    e2Var.c = new di.m2(17, g1Var, view);
                    g1Var.presentFragment(e2Var);
                    break;
                } else if (h51Var.a == 5 && i11 >= 0 && i11 < g1Var.h.length) {
                    if (!LocaleController.isRTL ? floatValue < view.getMeasuredWidth() - AndroidUtilities.dp(76.0f) : floatValue > AndroidUtilities.dp(76.0f)) {
                        int i12 = (h51Var.d + 6) % 7;
                        int i13 = 0;
                        for (int i14 = 0; i14 < g1Var.h[i12].size(); i14++) {
                            if (((ig.f1) g1Var.h[i12].get(i14)).b > i13) {
                                i13 = ((ig.f1) g1Var.h[i12].get(i14)).b;
                            }
                        }
                        int max = Math.max(0, i13 - 1439);
                        int i15 = (h51Var.d + 1) % 7;
                        int i16 = 1440;
                        for (int i17 = 0; i17 < g1Var.h[i15].size(); i17++) {
                            if (((ig.f1) g1Var.h[i15].get(i17)).a < i16) {
                                i16 = ((ig.f1) g1Var.h[i15].get(i17)).a;
                            }
                        }
                        int i18 = i16 + 1439;
                        CharSequence charSequence = h51Var.l;
                        ArrayList arrayList = g1Var.h[h51Var.d];
                        int i19 = 0;
                        for (int i20 = 0; i20 < 7; i20++) {
                            ArrayList arrayList2 = g1Var.h[i20];
                            if (arrayList2 != null) {
                                i19 = Math.max(1, arrayList2.size()) + i19;
                            }
                        }
                        ig.i1 i1Var = new ig.i1(charSequence, arrayList, max, i18, 28 - i19);
                        i1Var.f = new ig.t0(g1Var, 2);
                        i1Var.h = new j4(15, g1Var, h51Var);
                        g1Var.presentFragment(i1Var);
                        break;
                    } else {
                        if (g1Var.h[h51Var.d].isEmpty()) {
                            ((i5) view).setChecked(true);
                            g1Var.h[h51Var.d].add(new ig.f1(0, 1439));
                            g1Var.X(h51Var.d);
                        } else {
                            g1Var.h[h51Var.d].clear();
                            ((i5) view).setChecked(false);
                        }
                        ((i5) view).setValue(ig.g1.a0(g1Var.h[h51Var.d]));
                        g1Var.Y(true);
                        break;
                    }
                }
                break;
            case 12:
                final ig.i1 i1Var2 = (ig.i1) this.b;
                h51 h51Var2 = (h51) obj;
                final View view2 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i21 = i1Var2.c;
                int i22 = i1Var2.d;
                ArrayList arrayList3 = i1Var2.b;
                int i23 = h51Var2.d;
                if (i23 == -1) {
                    i1Var2.r = !i1Var2.r;
                    arrayList3.clear();
                    if (i1Var2.r) {
                        arrayList3.add(new ig.f1(0, 1439));
                    }
                    w8 w8Var = (w8) view2;
                    boolean z11 = i1Var2.r;
                    h51Var2.e = z11;
                    w8Var.setChecked(z11);
                    boolean z12 = i1Var2.r;
                    w8Var.b(j6.w0(null, z12 ? j6.f6 : j6.e6, false), z12);
                    i1Var2.n.Y2.N(true);
                    ig.t0 t0Var = i1Var2.f;
                    if (t0Var != null) {
                        t0Var.run();
                        break;
                    }
                } else if (i23 == -2) {
                    if (arrayList3.isEmpty() || i1Var2.U()) {
                        if (i1Var2.U()) {
                            arrayList3.clear();
                        }
                        int clamp = Utilities.clamp(480, i22 - 1, i21);
                        arrayList3.add(new ig.f1(clamp, Utilities.clamp(1200, i22, clamp + 1)));
                    } else {
                        int i24 = ((ig.f1) i2.g.h(1, arrayList3)).b;
                        int clamp2 = Utilities.clamp(i24 + 30, i22 - 1, i21);
                        arrayList3.add(new ig.f1(clamp2, Utilities.clamp((i24 + 1560) / 2, i22, clamp2 + 1)));
                    }
                    ig.t0 t0Var2 = i1Var2.f;
                    if (t0Var2 != null) {
                        t0Var2.run();
                    }
                    i1Var2.n.Y2.N(true);
                    break;
                } else if (h51Var2.a == 3 && (i10 = i23 / 3) >= 0 && i10 < arrayList3.size()) {
                    int i25 = i10 - 1;
                    ig.f1 f1Var = i25 >= 0 ? (ig.f1) arrayList3.get(i25) : null;
                    final ig.f1 f1Var2 = (ig.f1) arrayList3.get(i10);
                    int i26 = i10 + 1;
                    ig.f1 f1Var3 = i26 < arrayList3.size() ? (ig.f1) arrayList3.get(i26) : null;
                    int i27 = h51Var2.d % 3;
                    if (i27 == 0) {
                        Activity parentActivity = i1Var2.getParentActivity();
                        String string = LocaleController.getString(R.string.BusinessHoursDayOpenHourPicker);
                        int i28 = f1Var2.a;
                        if (f1Var != null) {
                            i21 = f1Var.b + 1;
                        }
                        final int i29 = 0;
                        org.telegram.ui.Components.e5.X(parentActivity, string, i28, i21, f1Var2.b - 1, new Utilities.Callback() { // from class: ig.h1
                            @Override // org.telegram.messenger.Utilities.Callback
                            public final void run(Object obj6) {
                                Integer num = (Integer) obj6;
                                switch (i29) {
                                    case 0:
                                        i1 i1Var3 = i1Var2;
                                        boolean V = i1Var3.V();
                                        r8 r8Var = (r8) view2;
                                        int intValue = num.intValue();
                                        f1Var2.a = intValue;
                                        r8Var.u(f1.a(intValue), true);
                                        if (V != i1Var3.V()) {
                                            i1Var3.n.Y2.N(true);
                                        }
                                        t0 t0Var3 = i1Var3.f;
                                        if (t0Var3 != null) {
                                            t0Var3.run();
                                            break;
                                        }
                                        break;
                                    default:
                                        i1 i1Var4 = i1Var2;
                                        boolean V2 = i1Var4.V();
                                        r8 r8Var2 = (r8) view2;
                                        int intValue2 = num.intValue();
                                        f1Var2.b = intValue2;
                                        r8Var2.u(f1.a(intValue2), true);
                                        if (V2 != i1Var4.V()) {
                                            i1Var4.n.Y2.N(true);
                                        }
                                        t0 t0Var4 = i1Var4.f;
                                        if (t0Var4 != null) {
                                            t0Var4.run();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        break;
                    } else if (i27 == 1) {
                        Activity parentActivity2 = i1Var2.getParentActivity();
                        String string2 = LocaleController.getString(R.string.BusinessHoursDayCloseHourPicker);
                        int i30 = f1Var2.b;
                        int i31 = f1Var2.a + 1;
                        if (f1Var3 != null) {
                            i22 = f1Var3.a - 1;
                        }
                        final int i32 = 1;
                        org.telegram.ui.Components.e5.X(parentActivity2, string2, i30, i31, i22, new Utilities.Callback() { // from class: ig.h1
                            @Override // org.telegram.messenger.Utilities.Callback
                            public final void run(Object obj6) {
                                Integer num = (Integer) obj6;
                                switch (i32) {
                                    case 0:
                                        i1 i1Var3 = i1Var2;
                                        boolean V = i1Var3.V();
                                        r8 r8Var = (r8) view2;
                                        int intValue = num.intValue();
                                        f1Var2.a = intValue;
                                        r8Var.u(f1.a(intValue), true);
                                        if (V != i1Var3.V()) {
                                            i1Var3.n.Y2.N(true);
                                        }
                                        t0 t0Var3 = i1Var3.f;
                                        if (t0Var3 != null) {
                                            t0Var3.run();
                                            break;
                                        }
                                        break;
                                    default:
                                        i1 i1Var4 = i1Var2;
                                        boolean V2 = i1Var4.V();
                                        r8 r8Var2 = (r8) view2;
                                        int intValue2 = num.intValue();
                                        f1Var2.b = intValue2;
                                        r8Var2.u(f1.a(intValue2), true);
                                        if (V2 != i1Var4.V()) {
                                            i1Var4.n.Y2.N(true);
                                        }
                                        t0 t0Var4 = i1Var4.f;
                                        if (t0Var4 != null) {
                                            t0Var4.run();
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
                            arrayList3.add(new ig.f1(0, 1439));
                        }
                        i1Var2.n.Y2.N(true);
                        ig.t0 t0Var3 = i1Var2.f;
                        if (t0Var3 != null) {
                            t0Var3.run();
                            break;
                        }
                    }
                }
                break;
            case 14:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                ig.e2.U((ig.e2) this.b, (h51) obj, (View) obj2);
                break;
            default:
                View view3 = (View) obj2;
                Integer num = (Integer) obj3;
                Float f7 = (Float) obj4;
                Float f10 = (Float) obj5;
                if (((ji.v3[]) this.b)[0] != null) {
                    num.intValue();
                    f7.floatValue();
                    f10.floatValue();
                    if (view3 instanceof g6) {
                        ((g6) view3).B();
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.oy
    public boolean u(uy uyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, eg1 eg1Var) {
        ji.i4 i4Var = (ji.i4) this.b;
        if (arrayList.isEmpty() || ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId <= 0) {
            return false;
        }
        i4Var.run(((MessagesStorage.TopicKey) arrayList.get(0)).dialogId);
        uyVar.finishFragment();
        return true;
    }

    public /* synthetic */ f(j2.a aVar, u2.t tVar, u2.b0 b0Var, IOException iOException, boolean z10) {
        this.a = 18;
        this.b = b0Var;
    }

    public /* synthetic */ f(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }
}
