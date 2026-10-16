package f1;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import androidx.biometric.e;
import b2.e1;
import b2.f;
import b2.u0;
import b2.u1;
import b2.z0;
import bi.g7;
import bi.h4;
import bi.v2;
import c3.g;
import c3.u;
import com.google.android.gms.tasks.OnSuccessListener;
import di.v0;
import e2.m0;
import e2.o;
import e2.x;
import f2.v;
import fi.d5;
import fi.l;
import fi.q3;
import i2.b0;
import ig.b2;
import ig.e2;
import ig.f1;
import ig.g1;
import ig.i1;
import ig.p1;
import ig.y1;
import j4.c0;
import j5.c;
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
import ji.a0;
import ji.d2;
import ji.d3;
import ji.e3;
import ji.h1;
import ji.i6;
import ji.k4;
import ji.l5;
import ji.o0;
import ji.t0;
import ji.u5;
import ji.w4;
import ji.x3;
import k5.i;
import k5.m;
import la.d;
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
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.ActionBar.z1;
import org.telegram.ui.Cells.j5;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.lu;
import org.telegram.ui.Components.m61;
import org.telegram.ui.kg1;
import org.telegram.ui.sy;
import org.telegram.ui.yy;
import w7.k6;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements OnSuccessListener, z1, Utilities.Callback5, g, o, v, lu, o0, sy {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(j2.a aVar, Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.sy
    public /* synthetic */ boolean D() {
        return false;
    }

    @Override // org.telegram.ui.sy
    public /* synthetic */ boolean L(yy yyVar) {
        return false;
    }

    @Override // f2.v
    public void a(long j10, x xVar) {
        switch (this.a) {
            case 19:
                c3.b.c(j10, xVar, ((c0) this.b).c);
                break;
            default:
                c3.b.d(j10, xVar, ((c0) this.b).c);
                break;
        }
    }

    public j5.b b(e eVar) {
        c cVar = (c) this.b;
        URL url = (URL) eVar.b;
        String c10 = k6.c("CctTransportBackend");
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
        String str = (String) eVar.d;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    w4 w4Var = cVar.a;
                    i iVar = (i) eVar.c;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    d dVar = (d) w4Var.b;
                    la.e eVar2 = new la.e(bufferedWriter, dVar.a, dVar.b, dVar.c, dVar.d);
                    eVar2.h(iVar);
                    eVar2.j();
                    eVar2.b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer valueOf = Integer.valueOf(responseCode);
                    String c11 = k6.c("CctTransportBackend");
                    if (Log.isLoggable(c11, 4)) {
                        Log.i(c11, String.format("Status Code: %d", valueOf));
                    }
                    k6.a(httpURLConnection.getHeaderField("Content-Type"), "CctTransportBackend", "Content-Type: %s");
                    k6.a(httpURLConnection.getHeaderField("Content-Encoding"), "CctTransportBackend", "Content-Encoding: %s");
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
                            j5.b bVar = new j5.b(responseCode, null, m.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).a);
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
        } catch (ja.b e) {
            e = e;
            k6.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new j5.b(400, null, 0L);
        } catch (ConnectException e7) {
            e = e7;
            k6.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new j5.b(500, null, 0L);
        } catch (UnknownHostException e10) {
            e = e10;
            k6.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new j5.b(500, null, 0L);
        } catch (IOException e11) {
            e = e11;
            k6.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new j5.b(400, null, 0L);
        }
    }

    public void c(int i10) {
        a0 a0Var = (a0) this.b;
        a0Var.c = i10;
        a0Var.f(i10);
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(a2 a2Var, int i10) {
        int i11;
        switch (this.a) {
            case 1:
                ((fi.e) this.b).run();
                break;
            case 2:
                l lVar = (l) this.b;
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                updatestarrefprogram.bot = lVar.getMessagesController().getInputUser(lVar.P);
                updatestarrefprogram.commission_permille = 0;
                a2 a2Var2 = new a2(lVar.getParentActivity(), 3, null);
                a2Var2.q(150L);
                lVar.getConnectionsManager().sendRequest(updatestarrefprogram, new fi.b(lVar, a2Var2, 0));
                break;
            case 13:
                y1 y1Var = ((p1) this.b).a;
                i11 = ((m2) y1Var).currentAccount;
                b2 f7 = b2.f(i11);
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
                        ConnectionsManager.getInstance(i12).sendRequest(tL_messages_deleteQuickReplyShortcut, new g7(6));
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
                    messagesStorage.getStorageQueue().postRunnable(new v0(2, arrayList, messagesStorage));
                    NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                }
                y1.X(y1Var);
                break;
            default:
                ((h4) this.b).run();
                break;
        }
    }

    @Override // ji.o0
    public l80 h(h1 h1Var) {
        return l80.H((d2) ((ya.c) this.b).b, h1Var);
    }

    @Override // e2.o
    public void invoke(Object obj) {
        switch (this.a) {
            case 5:
                ((e1) obj).onAudioAttributesChanged((f) this.b);
                break;
            case 6:
                ((e1) obj).onTrackSelectionParametersChanged((u1) this.b);
                break;
            case 7:
                ((e1) obj).onCues((d2.c) this.b);
                break;
            case 8:
                ((e1) obj).onMediaMetadataChanged(((b0) this.b).a.Q);
                break;
            case 9:
                ((e1) obj).onMetadata((u0) this.b);
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            default:
                ((j2.b) obj).b((u2.c0) this.b);
                break;
            case 15:
                ((j2.b) obj).h((z0) this.b);
                break;
            case 16:
                ((j2.b) obj).onSeekStarted((j2.a) this.b);
                break;
            case 17:
                ((j2.b) obj).a((i2.e) this.b);
                break;
        }
    }

    @Override // c3.g
    public long l(long j10) {
        return m0.j((j10 * r0.e) / 1000000, 0L, ((u) this.b).j - 1);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ((e1.b) this.b).invoke(obj);
    }

    @Override // org.telegram.ui.Components.lu
    public void p() {
        switch (this.a) {
            case 23:
                t0 t0Var = (t0) this.b;
                h1 h1Var = t0Var.d;
                ji.a aVar = t0Var.f;
                if (aVar != null) {
                    aVar.s = true;
                    aVar.r = h1Var.E;
                }
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.b;
                    if (pageBlock instanceof TL_iv.pageBlockDetails) {
                        ((TL_iv.pageBlockDetails) pageBlock).title = ji.k6.f(h1Var.getText());
                    }
                }
                e3 e3Var = t0Var.h;
                if (e3Var != null && t0Var.f != null) {
                    x3.P1(e3Var.a);
                    break;
                }
                break;
            case 28:
                ((l5) this.b).h();
                break;
            default:
                u5 u5Var = (u5) this.b;
                ji.a aVar2 = u5Var.a;
                if (aVar2 != null) {
                    aVar2.s = true;
                    aVar2.r = u5Var.r.E;
                }
                u5Var.u();
                d3 d3Var = u5Var.E;
                if (d3Var != null && u5Var.a != null) {
                    x3.P1(d3Var.a);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i10;
        switch (this.a) {
            case 3:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                ((d5) this.b).V((m61) obj);
                break;
            case 11:
                g1 g1Var = (g1) this.b;
                m61 m61Var = (m61) obj;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                float floatValue = ((Float) obj4).floatValue();
                ((Float) obj5).getClass();
                int i11 = m61Var.d;
                if (i11 == -1) {
                    boolean z10 = !g1Var.e;
                    g1Var.e = z10;
                    ((w8) view).setChecked(z10);
                    g1Var.a.W2.N(true);
                    g1Var.Y(true);
                    break;
                } else if (i11 == -2) {
                    e2 e2Var = new e2(null);
                    e2Var.n = g1Var.r;
                    e2Var.c = new v2(18, g1Var, view);
                    g1Var.presentFragment(e2Var);
                    break;
                } else if (m61Var.a == 5 && i11 >= 0 && i11 < g1Var.h.length) {
                    if (!LocaleController.isRTL ? floatValue < view.getMeasuredWidth() - AndroidUtilities.dp(76.0f) : floatValue > AndroidUtilities.dp(76.0f)) {
                        int i12 = (m61Var.d + 6) % 7;
                        int i13 = 0;
                        for (int i14 = 0; i14 < g1Var.h[i12].size(); i14++) {
                            if (((f1) g1Var.h[i12].get(i14)).b > i13) {
                                i13 = ((f1) g1Var.h[i12].get(i14)).b;
                            }
                        }
                        int max = Math.max(0, i13 - 1439);
                        int i15 = (m61Var.d + 1) % 7;
                        int i16 = 1440;
                        for (int i17 = 0; i17 < g1Var.h[i15].size(); i17++) {
                            if (((f1) g1Var.h[i15].get(i17)).a < i16) {
                                i16 = ((f1) g1Var.h[i15].get(i17)).a;
                            }
                        }
                        int i18 = i16 + 1439;
                        CharSequence charSequence = m61Var.l;
                        ArrayList arrayList = g1Var.h[m61Var.d];
                        int i19 = 0;
                        for (int i20 = 0; i20 < 7; i20++) {
                            ArrayList arrayList2 = g1Var.h[i20];
                            if (arrayList2 != null) {
                                i19 = Math.max(1, arrayList2.size()) + i19;
                            }
                        }
                        i1 i1Var = new i1(charSequence, arrayList, max, i18, 28 - i19);
                        i1Var.f = new ig.t0(g1Var, 2);
                        i1Var.h = new q3(17, g1Var, m61Var);
                        g1Var.presentFragment(i1Var);
                        break;
                    } else {
                        if (g1Var.h[m61Var.d].isEmpty()) {
                            ((j5) view).setChecked(true);
                            g1Var.h[m61Var.d].add(new f1(0, 1439));
                            g1Var.X(m61Var.d);
                        } else {
                            g1Var.h[m61Var.d].clear();
                            ((j5) view).setChecked(false);
                        }
                        ((j5) view).setValue(g1.a0(g1Var.h[m61Var.d]));
                        g1Var.Y(true);
                        break;
                    }
                }
                break;
            case 12:
                final i1 i1Var2 = (i1) this.b;
                m61 m61Var2 = (m61) obj;
                final View view2 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i21 = i1Var2.c;
                int i22 = i1Var2.d;
                ArrayList arrayList3 = i1Var2.b;
                int i23 = m61Var2.d;
                if (i23 == -1) {
                    i1Var2.r = !i1Var2.r;
                    arrayList3.clear();
                    if (i1Var2.r) {
                        arrayList3.add(new f1(0, 1439));
                    }
                    w8 w8Var = (w8) view2;
                    boolean z11 = i1Var2.r;
                    m61Var2.e = z11;
                    w8Var.setChecked(z11);
                    boolean z12 = i1Var2.r;
                    w8Var.b(g6.x0(null, z12 ? g6.f6 : g6.e6, false), z12);
                    i1Var2.n.W2.N(true);
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
                        arrayList3.add(new f1(clamp, Utilities.clamp(1200, i22, clamp + 1)));
                    } else {
                        int i24 = ((f1) i2.d.h(1, arrayList3)).b;
                        int clamp2 = Utilities.clamp(i24 + 30, i22 - 1, i21);
                        arrayList3.add(new f1(clamp2, Utilities.clamp((i24 + 1560) / 2, i22, clamp2 + 1)));
                    }
                    ig.t0 t0Var2 = i1Var2.f;
                    if (t0Var2 != null) {
                        t0Var2.run();
                    }
                    i1Var2.n.W2.N(true);
                    break;
                } else if (m61Var2.a == 3 && (i10 = i23 / 3) >= 0 && i10 < arrayList3.size()) {
                    int i25 = i10 - 1;
                    f1 f1Var = i25 >= 0 ? (f1) arrayList3.get(i25) : null;
                    final f1 f1Var2 = (f1) arrayList3.get(i10);
                    int i26 = i10 + 1;
                    f1 f1Var3 = i26 < arrayList3.size() ? (f1) arrayList3.get(i26) : null;
                    int i27 = m61Var2.d % 3;
                    if (i27 == 0) {
                        Activity parentActivity = i1Var2.getParentActivity();
                        String string = LocaleController.getString(R.string.BusinessHoursDayOpenHourPicker);
                        int i28 = f1Var2.a;
                        if (f1Var != null) {
                            i21 = f1Var.b + 1;
                        }
                        final int i29 = 0;
                        g5.W(parentActivity, string, i28, i21, f1Var2.b - 1, new Utilities.Callback() { // from class: ig.h1
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
                                            i1Var3.n.W2.N(true);
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
                                            i1Var4.n.W2.N(true);
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
                        g5.W(parentActivity2, string2, i30, i31, i22, new Utilities.Callback() { // from class: ig.h1
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
                                            i1Var3.n.W2.N(true);
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
                                            i1Var4.n.W2.N(true);
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
                            arrayList3.add(new f1(0, 1439));
                        }
                        i1Var2.n.W2.N(true);
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
                e2.U((e2) this.b, (m61) obj, (View) obj2);
                break;
            default:
                View view3 = (View) obj2;
                Integer num = (Integer) obj3;
                Float f7 = (Float) obj4;
                Float f10 = (Float) obj5;
                if (((x3[]) this.b)[0] != null) {
                    num.intValue();
                    f7.floatValue();
                    f10.floatValue();
                    if (view3 instanceof i6) {
                        ((i6) view3).B();
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.sy
    public boolean w(yy yyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, kg1 kg1Var) {
        k4 k4Var = (k4) this.b;
        if (arrayList.isEmpty() || ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId <= 0) {
            return false;
        }
        k4Var.run(((MessagesStorage.TopicKey) arrayList.get(0)).dialogId);
        yyVar.finishFragment();
        return true;
    }

    public /* synthetic */ a(j2.a aVar, u2.u uVar, u2.c0 c0Var, IOException iOException, boolean z10) {
        this.a = 18;
        this.b = c0Var;
    }

    public /* synthetic */ a(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }
}
