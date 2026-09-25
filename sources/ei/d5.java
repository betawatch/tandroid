package ei;

import ai.u7;
import android.app.Activity;
import android.util.Log;
import android.view.View;
import ci.rc;
import com.google.android.gms.tasks.OnSuccessListener;
import ii.e6;
import ii.h5;
import ii.p5;
import ii.q5;
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
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.j5;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.au;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.y70;
import org.telegram.ui.ky;
import org.telegram.ui.qy;
import org.telegram.ui.wf1;
import w7.g6;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d5 implements Utilities.Callback5, OnSuccessListener, c3.g, org.telegram.ui.ActionBar.z1, e2.m, au, ii.p0, ky, q5, f2.s {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d5(j2.a aVar, Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ky
    public /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.ky
    public /* synthetic */ boolean K(qy qyVar) {
        return false;
    }

    @Override // ii.p0
    public y70 a(ii.i1 i1Var) {
        return y70.H((ii.e2) ((a6.i) this.b).b, i1Var);
    }

    @Override // f2.s
    public void b(long j3, e2.v vVar) {
        switch (this.a) {
            case 26:
                c3.b.d(j3, vVar, ((j4.c0) this.b).c);
                break;
            default:
                c3.b.e(j3, vVar, ((j4.c0) this.b).c);
                break;
        }
    }

    public ii.b0 c(aa.a aVar) {
        j5.b bVar = (j5.b) this.b;
        URL url = (URL) aVar.c;
        String c10 = g6.c("CctTransportBackend");
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
                    ka.c cVar = bVar.a;
                    k5.i iVar = (k5.i) aVar.d;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    ka.e eVar = (ka.e) cVar.b;
                    ka.f fVar = new ka.f(bufferedWriter, eVar.a, eVar.b, eVar.c, eVar.d);
                    fVar.h(iVar);
                    fVar.j();
                    fVar.b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer valueOf = Integer.valueOf(responseCode);
                    String c11 = g6.c("CctTransportBackend");
                    if (Log.isLoggable(c11, 4)) {
                        Log.i(c11, String.format("Status Code: %d", valueOf));
                    }
                    g6.a(httpURLConnection.getHeaderField("Content-Type"), "CctTransportBackend", "Content-Type: %s");
                    g6.a(httpURLConnection.getHeaderField("Content-Encoding"), "CctTransportBackend", "Content-Encoding: %s");
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new ii.b0(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new ii.b0(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            ii.b0 b0Var = new ii.b0(responseCode, null, k5.m.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return b0Var;
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
            g6.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new ii.b0(400, null, 0L);
        } catch (ConnectException e7) {
            e = e7;
            g6.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new ii.b0(500, null, 0L);
        } catch (UnknownHostException e10) {
            e = e10;
            g6.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new ii.b0(500, null, 0L);
        } catch (IOException e11) {
            e = e11;
            g6.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new ii.b0(400, null, 0L);
        }
    }

    public void d(int i10) {
        ii.a0 a0Var = (ii.a0) this.b;
        a0Var.c = i10;
        a0Var.f(i10);
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        int i11;
        switch (this.a) {
            case 5:
                hg.z1 z1Var = ((hg.q1) this.b).a;
                i11 = ((org.telegram.ui.ActionBar.m2) z1Var).currentAccount;
                hg.c2 f7 = hg.c2.f(i11);
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
                        hg.b2 c10 = f7.c(((Integer) arrayList.get(i14)).intValue());
                        f7.b.remove(c10);
                        f7.a(c10.b);
                        TLRPC.TL_messages_deleteQuickReplyShortcut tL_messages_deleteQuickReplyShortcut = new TLRPC.TL_messages_deleteQuickReplyShortcut();
                        tL_messages_deleteQuickReplyShortcut.shortcut_id = c10.a;
                        ConnectionsManager.getInstance(i12).sendRequest(tL_messages_deleteQuickReplyShortcut, new u7(6));
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
                    messagesStorage.getStorageQueue().postRunnable(new ci.w0(2, arrayList, messagesStorage));
                    NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                }
                hg.z1.X(z1Var);
                break;
            default:
                ((ai.s4) this.b).run();
                break;
        }
    }

    @Override // e2.m
    public void invoke(Object obj) {
        switch (this.a) {
            case 7:
                ((b2.z0) obj).onAudioAttributesChanged((b2.e) this.b);
                break;
            case 8:
                ((b2.z0) obj).onTrackSelectionParametersChanged((b2.q1) this.b);
                break;
            case 9:
                ((b2.z0) obj).onCues((d2.d) this.b);
                break;
            case 10:
                ((b2.z0) obj).onMediaMetadataChanged(((i2.c0) this.b).a.O);
                break;
            case 11:
                ((b2.z0) obj).onMetadata((b2.p0) this.b);
                break;
            case 22:
                ((j2.b) obj).h((b2.u0) this.b);
                break;
            case 23:
                ((j2.b) obj).onSeekStarted((j2.a) this.b);
                break;
            case 24:
                ((j2.b) obj).a((i2.g) this.b);
                break;
            default:
                ((j2.b) obj).b((u2.b0) this.b);
                break;
        }
    }

    @Override // org.telegram.ui.Components.au
    public void j() {
        switch (this.a) {
            case 14:
                ii.u0 u0Var = (ii.u0) this.b;
                ii.i1 i1Var = u0Var.d;
                ii.a aVar = u0Var.f;
                if (aVar != null) {
                    aVar.s = true;
                    aVar.r = i1Var.E;
                }
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.b;
                    if (pageBlock instanceof TL_iv.pageBlockDetails) {
                        ((TL_iv.pageBlockDetails) pageBlock).title = ii.g6.f(i1Var.getText());
                    }
                }
                ii.e3 e3Var = u0Var.h;
                if (e3Var != null && u0Var.f != null) {
                    ii.x3.O1(e3Var.a);
                    break;
                }
                break;
            case 19:
                ((h5) this.b).h();
                break;
            default:
                p5 p5Var = (p5) this.b;
                ii.a aVar2 = p5Var.a;
                if (aVar2 != null) {
                    aVar2.s = true;
                    aVar2.r = p5Var.r.E;
                }
                p5Var.u();
                ii.d3 d3Var = p5Var.E;
                if (d3Var != null && p5Var.a != null) {
                    ii.x3.O1(d3Var.a);
                    break;
                }
                break;
        }
    }

    @Override // c3.g
    public long m(long j3) {
        return e2.d0.i((j3 * r0.e) / 1000000, 0L, ((c3.u) this.b).j - 1);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ((e1.b) this.b).invoke(obj);
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i10;
        switch (this.a) {
            case 0:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                ((e5) this.b).V((v51) obj);
                break;
            case 1:
            case 2:
            case 5:
            default:
                View view = (View) obj2;
                Integer num = (Integer) obj3;
                Float f7 = (Float) obj4;
                Float f10 = (Float) obj5;
                if (((ii.x3[]) this.b)[0] != null) {
                    num.intValue();
                    f7.floatValue();
                    f10.floatValue();
                    if (view instanceof e6) {
                        ((e6) view).B();
                        break;
                    }
                }
                break;
            case 3:
                hg.h1 h1Var = (hg.h1) this.b;
                v51 v51Var = (v51) obj;
                View view2 = (View) obj2;
                ((Integer) obj3).getClass();
                float floatValue = ((Float) obj4).floatValue();
                ((Float) obj5).getClass();
                int i11 = v51Var.d;
                if (i11 == -1) {
                    boolean z10 = !h1Var.e;
                    h1Var.e = z10;
                    ((w8) view2).setChecked(z10);
                    h1Var.a.Y2.N(true);
                    h1Var.Y(true);
                    break;
                } else if (i11 == -2) {
                    hg.f2 f2Var = new hg.f2(null);
                    f2Var.n = h1Var.r;
                    f2Var.c = new ai.g3(18, h1Var, view2);
                    h1Var.presentFragment(f2Var);
                    break;
                } else if (v51Var.a == 5 && i11 >= 0 && i11 < h1Var.h.length) {
                    if (!LocaleController.isRTL ? floatValue < view2.getMeasuredWidth() - AndroidUtilities.dp(76.0f) : floatValue > AndroidUtilities.dp(76.0f)) {
                        int i12 = (v51Var.d + 6) % 7;
                        int i13 = 0;
                        for (int i14 = 0; i14 < h1Var.h[i12].size(); i14++) {
                            if (((hg.g1) h1Var.h[i12].get(i14)).b > i13) {
                                i13 = ((hg.g1) h1Var.h[i12].get(i14)).b;
                            }
                        }
                        int max = Math.max(0, i13 - 1439);
                        int i15 = (v51Var.d + 1) % 7;
                        int i16 = 1440;
                        for (int i17 = 0; i17 < h1Var.h[i15].size(); i17++) {
                            if (((hg.g1) h1Var.h[i15].get(i17)).a < i16) {
                                i16 = ((hg.g1) h1Var.h[i15].get(i17)).a;
                            }
                        }
                        int i18 = i16 + 1439;
                        CharSequence charSequence = v51Var.l;
                        ArrayList arrayList = h1Var.h[v51Var.d];
                        int i19 = 0;
                        for (int i20 = 0; i20 < 7; i20++) {
                            ArrayList arrayList2 = h1Var.h[i20];
                            if (arrayList2 != null) {
                                i19 = Math.max(1, arrayList2.size()) + i19;
                            }
                        }
                        hg.j1 j1Var = new hg.j1(charSequence, arrayList, max, i18, 28 - i19);
                        j1Var.f = new rc(h1Var, 23);
                        j1Var.h = new gg.x1(5, h1Var, v51Var);
                        h1Var.presentFragment(j1Var);
                        break;
                    } else {
                        if (h1Var.h[v51Var.d].isEmpty()) {
                            ((j5) view2).setChecked(true);
                            h1Var.h[v51Var.d].add(new hg.g1(0, 1439));
                            h1Var.X(v51Var.d);
                        } else {
                            h1Var.h[v51Var.d].clear();
                            ((j5) view2).setChecked(false);
                        }
                        ((j5) view2).setValue(hg.h1.a0(h1Var.h[v51Var.d]));
                        h1Var.Y(true);
                        break;
                    }
                }
                break;
            case 4:
                final hg.j1 j1Var2 = (hg.j1) this.b;
                v51 v51Var2 = (v51) obj;
                final View view3 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i21 = j1Var2.c;
                int i22 = j1Var2.d;
                ArrayList arrayList3 = j1Var2.b;
                int i23 = v51Var2.d;
                if (i23 == -1) {
                    j1Var2.r = !j1Var2.r;
                    arrayList3.clear();
                    if (j1Var2.r) {
                        arrayList3.add(new hg.g1(0, 1439));
                    }
                    w8 w8Var = (w8) view3;
                    boolean z11 = j1Var2.r;
                    v51Var2.e = z11;
                    w8Var.setChecked(z11);
                    boolean z12 = j1Var2.r;
                    w8Var.b(h6.w0(null, z12 ? h6.f6 : h6.e6, false), z12);
                    j1Var2.n.Y2.N(true);
                    rc rcVar = j1Var2.f;
                    if (rcVar != null) {
                        rcVar.run();
                        break;
                    }
                } else if (i23 == -2) {
                    if (arrayList3.isEmpty() || j1Var2.U()) {
                        if (j1Var2.U()) {
                            arrayList3.clear();
                        }
                        int clamp = Utilities.clamp(480, i22 - 1, i21);
                        arrayList3.add(new hg.g1(clamp, Utilities.clamp(1200, i22, clamp + 1)));
                    } else {
                        int i24 = ((hg.g1) hg.c.g(1, arrayList3)).b;
                        int clamp2 = Utilities.clamp(i24 + 30, i22 - 1, i21);
                        arrayList3.add(new hg.g1(clamp2, Utilities.clamp((i24 + 1560) / 2, i22, clamp2 + 1)));
                    }
                    rc rcVar2 = j1Var2.f;
                    if (rcVar2 != null) {
                        rcVar2.run();
                    }
                    j1Var2.n.Y2.N(true);
                    break;
                } else if (v51Var2.a == 3 && (i10 = i23 / 3) >= 0 && i10 < arrayList3.size()) {
                    int i25 = i10 - 1;
                    hg.g1 g1Var = i25 >= 0 ? (hg.g1) arrayList3.get(i25) : null;
                    final hg.g1 g1Var2 = (hg.g1) arrayList3.get(i10);
                    int i26 = i10 + 1;
                    hg.g1 g1Var3 = i26 < arrayList3.size() ? (hg.g1) arrayList3.get(i26) : null;
                    int i27 = v51Var2.d % 3;
                    if (i27 == 0) {
                        Activity parentActivity = j1Var2.getParentActivity();
                        String string = LocaleController.getString(R.string.BusinessHoursDayOpenHourPicker);
                        int i28 = g1Var2.a;
                        if (g1Var != null) {
                            i21 = g1Var.b + 1;
                        }
                        final int i29 = 0;
                        org.telegram.ui.Components.e5.X(parentActivity, string, i28, i21, g1Var2.b - 1, new Utilities.Callback() { // from class: hg.i1
                            @Override // org.telegram.messenger.Utilities.Callback
                            public final void run(Object obj6) {
                                Integer num2 = (Integer) obj6;
                                switch (i29) {
                                    case 0:
                                        j1 j1Var3 = j1Var2;
                                        boolean V = j1Var3.V();
                                        r8 r8Var = (r8) view3;
                                        int intValue = num2.intValue();
                                        g1Var2.a = intValue;
                                        r8Var.u(g1.a(intValue), true);
                                        if (V != j1Var3.V()) {
                                            j1Var3.n.Y2.N(true);
                                        }
                                        rc rcVar3 = j1Var3.f;
                                        if (rcVar3 != null) {
                                            rcVar3.run();
                                            break;
                                        }
                                        break;
                                    default:
                                        j1 j1Var4 = j1Var2;
                                        boolean V2 = j1Var4.V();
                                        r8 r8Var2 = (r8) view3;
                                        int intValue2 = num2.intValue();
                                        g1Var2.b = intValue2;
                                        r8Var2.u(g1.a(intValue2), true);
                                        if (V2 != j1Var4.V()) {
                                            j1Var4.n.Y2.N(true);
                                        }
                                        rc rcVar4 = j1Var4.f;
                                        if (rcVar4 != null) {
                                            rcVar4.run();
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
                        org.telegram.ui.Components.e5.X(parentActivity2, string2, i30, i31, i22, new Utilities.Callback() { // from class: hg.i1
                            @Override // org.telegram.messenger.Utilities.Callback
                            public final void run(Object obj6) {
                                Integer num2 = (Integer) obj6;
                                switch (i32) {
                                    case 0:
                                        j1 j1Var3 = j1Var2;
                                        boolean V = j1Var3.V();
                                        r8 r8Var = (r8) view3;
                                        int intValue = num2.intValue();
                                        g1Var2.a = intValue;
                                        r8Var.u(g1.a(intValue), true);
                                        if (V != j1Var3.V()) {
                                            j1Var3.n.Y2.N(true);
                                        }
                                        rc rcVar3 = j1Var3.f;
                                        if (rcVar3 != null) {
                                            rcVar3.run();
                                            break;
                                        }
                                        break;
                                    default:
                                        j1 j1Var4 = j1Var2;
                                        boolean V2 = j1Var4.V();
                                        r8 r8Var2 = (r8) view3;
                                        int intValue2 = num2.intValue();
                                        g1Var2.b = intValue2;
                                        r8Var2.u(g1.a(intValue2), true);
                                        if (V2 != j1Var4.V()) {
                                            j1Var4.n.Y2.N(true);
                                        }
                                        rc rcVar4 = j1Var4.f;
                                        if (rcVar4 != null) {
                                            rcVar4.run();
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
                            arrayList3.add(new hg.g1(0, 1439));
                        }
                        j1Var2.n.Y2.N(true);
                        rc rcVar3 = j1Var2.f;
                        if (rcVar3 != null) {
                            rcVar3.run();
                            break;
                        }
                    }
                }
                break;
            case 6:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                hg.f2.U((hg.f2) this.b, (v51) obj, (View) obj2);
                break;
        }
    }

    @Override // org.telegram.ui.ky
    public boolean u(qy qyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, wf1 wf1Var) {
        ii.j4 j4Var = (ii.j4) this.b;
        if (arrayList.isEmpty() || ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId <= 0) {
            return false;
        }
        j4Var.run(((MessagesStorage.TopicKey) arrayList.get(0)).dialogId);
        qyVar.finishFragment();
        return true;
    }

    public /* synthetic */ d5(j2.a aVar, u2.t tVar, u2.b0 b0Var, IOException iOException, boolean z10) {
        this.a = 25;
        this.b = b0Var;
    }

    public /* synthetic */ d5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }
}
