package ei;

import ai.t7;
import android.app.Activity;
import android.util.Log;
import android.view.View;
import ci.uc;
import com.google.android.gms.tasks.OnSuccessListener;
import ii.d6;
import ii.f6;
import ii.g5;
import ii.o5;
import ii.p5;
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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.k5;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Cells.x8;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.y70;
import org.telegram.ui.Components.zt;
import org.telegram.ui.fg1;
import org.telegram.ui.oy;
import org.telegram.ui.uy;
import w7.g6;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final /* synthetic */ class d5 implements Utilities.Callback5, OnSuccessListener, c3.g, org.telegram.ui.ActionBar.a2, e2.m, zt, ii.p0, oy, p5, f2.s {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d5(j2.a aVar, Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.oy
    public /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.oy
    public /* synthetic */ boolean K(uy uyVar) {
        return false;
    }

    @Override // ii.p0
    public y70 a(ii.i1 i1Var) {
        return y70.H((ii.d2) ((a6.i) this.b).b, i1Var);
    }

    @Override // f2.s
    public void b(long j3, e2.v vVar) {
        switch (this.a) {
            case 27:
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
                    k2.e eVar = bVar.a;
                    k5.i iVar = (k5.i) aVar.d;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    ka.d dVar = (ka.d) eVar.b;
                    ka.e eVar2 = new ka.e(bufferedWriter, dVar.a, dVar.b, dVar.c, dVar.d);
                    eVar2.h(iVar);
                    eVar2.j();
                    eVar2.b.flush();
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

    @Override // org.telegram.ui.Components.zt
    public void i() {
        switch (this.a) {
            case 15:
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
                        ((TL_iv.pageBlockDetails) pageBlock).title = f6.f(i1Var.getText());
                    }
                }
                ii.d3 d3Var = u0Var.h;
                if (d3Var != null && u0Var.f != null) {
                    ii.w3.P1(d3Var.a);
                    break;
                }
                break;
            case 20:
                ((g5) this.b).h();
                break;
            default:
                o5 o5Var = (o5) this.b;
                ii.a aVar2 = o5Var.a;
                if (aVar2 != null) {
                    aVar2.s = true;
                    aVar2.r = o5Var.r.E;
                }
                o5Var.u();
                ii.c3 c3Var = o5Var.E;
                if (c3Var != null && o5Var.a != null) {
                    ii.w3.P1(c3Var.a);
                    break;
                }
                break;
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
                ((b2.z0) obj).onCues((d2.d) this.b);
                break;
            case 11:
                ((b2.z0) obj).onMediaMetadataChanged(((i2.b0) this.b).a.O);
                break;
            case 12:
                ((b2.z0) obj).onMetadata((b2.p0) this.b);
                break;
            case 23:
                ((j2.b) obj).h((b2.u0) this.b);
                break;
            case 24:
                ((j2.b) obj).onSeekStarted((j2.a) this.b);
                break;
            case 25:
                ((j2.b) obj).a((i2.g) this.b);
                break;
            default:
                ((j2.b) obj).b((u2.b0) this.b);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        switch (this.a) {
            case 5:
                hg.y1 y1Var = ((hg.p1) this.b).a;
                i11 = ((org.telegram.ui.ActionBar.n2) y1Var).currentAccount;
                hg.b2 f7 = hg.b2.f(i11);
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
                        hg.a2 c10 = f7.c(((Integer) arrayList.get(i14)).intValue());
                        f7.b.remove(c10);
                        f7.a(c10.b);
                        TLRPC.TL_messages_deleteQuickReplyShortcut tL_messages_deleteQuickReplyShortcut = new TLRPC.TL_messages_deleteQuickReplyShortcut();
                        tL_messages_deleteQuickReplyShortcut.shortcut_id = c10.a;
                        ConnectionsManager.getInstance(i12).sendRequest(tL_messages_deleteQuickReplyShortcut, new t7(6));
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
                hg.y1.X(y1Var);
                break;
            default:
                ((ai.s4) this.b).run();
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
                ((e5) this.b).V((y51) obj);
                break;
            case 1:
            case 2:
            case 5:
            default:
                View view = (View) obj2;
                Integer num = (Integer) obj3;
                Float f7 = (Float) obj4;
                Float f10 = (Float) obj5;
                if (((ii.w3[]) this.b)[0] != null) {
                    num.intValue();
                    f7.floatValue();
                    f10.floatValue();
                    if (view instanceof d6) {
                        ((d6) view).B();
                        break;
                    }
                }
                break;
            case 3:
                hg.g1 g1Var = (hg.g1) this.b;
                y51 y51Var = (y51) obj;
                View view2 = (View) obj2;
                ((Integer) obj3).getClass();
                float floatValue = ((Float) obj4).floatValue();
                ((Float) obj5).getClass();
                int i11 = y51Var.d;
                if (i11 == -1) {
                    boolean z10 = !g1Var.e;
                    g1Var.e = z10;
                    ((x8) view2).setChecked(z10);
                    g1Var.a.Y2.N(true);
                    g1Var.Y(true);
                    break;
                } else if (i11 == -2) {
                    hg.e2 e2Var = new hg.e2(null);
                    e2Var.n = g1Var.r;
                    e2Var.c = new ci.m2(17, g1Var, view2);
                    g1Var.presentFragment(e2Var);
                    break;
                } else if (y51Var.a == 5 && i11 >= 0 && i11 < g1Var.h.length) {
                    if (!LocaleController.isRTL ? floatValue < view2.getMeasuredWidth() - AndroidUtilities.dp(76.0f) : floatValue > AndroidUtilities.dp(76.0f)) {
                        int i12 = (y51Var.d + 6) % 7;
                        int i13 = 0;
                        for (int i14 = 0; i14 < g1Var.h[i12].size(); i14++) {
                            if (((hg.f1) g1Var.h[i12].get(i14)).b > i13) {
                                i13 = ((hg.f1) g1Var.h[i12].get(i14)).b;
                            }
                        }
                        int max = Math.max(0, i13 - 1439);
                        int i15 = (y51Var.d + 1) % 7;
                        int i16 = 1440;
                        for (int i17 = 0; i17 < g1Var.h[i15].size(); i17++) {
                            if (((hg.f1) g1Var.h[i15].get(i17)).a < i16) {
                                i16 = ((hg.f1) g1Var.h[i15].get(i17)).a;
                            }
                        }
                        int i18 = i16 + 1439;
                        CharSequence charSequence = y51Var.l;
                        ArrayList arrayList = g1Var.h[y51Var.d];
                        int i19 = 0;
                        for (int i20 = 0; i20 < 7; i20++) {
                            ArrayList arrayList2 = g1Var.h[i20];
                            if (arrayList2 != null) {
                                i19 = Math.max(1, arrayList2.size()) + i19;
                            }
                        }
                        hg.i1 i1Var = new hg.i1(charSequence, arrayList, max, i18, 28 - i19);
                        i1Var.f = new uc(g1Var, 23);
                        i1Var.h = new gg.x1(5, g1Var, y51Var);
                        g1Var.presentFragment(i1Var);
                        break;
                    } else {
                        if (g1Var.h[y51Var.d].isEmpty()) {
                            ((k5) view2).setChecked(true);
                            g1Var.h[y51Var.d].add(new hg.f1(0, 1439));
                            g1Var.X(y51Var.d);
                        } else {
                            g1Var.h[y51Var.d].clear();
                            ((k5) view2).setChecked(false);
                        }
                        ((k5) view2).setValue(hg.g1.a0(g1Var.h[y51Var.d]));
                        g1Var.Y(true);
                        break;
                    }
                }
                break;
            case 4:
                final hg.i1 i1Var2 = (hg.i1) this.b;
                y51 y51Var2 = (y51) obj;
                final View view3 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i21 = i1Var2.c;
                int i22 = i1Var2.d;
                ArrayList arrayList3 = i1Var2.b;
                int i23 = y51Var2.d;
                if (i23 == -1) {
                    i1Var2.r = !i1Var2.r;
                    arrayList3.clear();
                    if (i1Var2.r) {
                        arrayList3.add(new hg.f1(0, 1439));
                    }
                    x8 x8Var = (x8) view3;
                    boolean z11 = i1Var2.r;
                    y51Var2.e = z11;
                    x8Var.setChecked(z11);
                    boolean z12 = i1Var2.r;
                    x8Var.b(j6.w0(null, z12 ? j6.f6 : j6.e6, false), z12);
                    i1Var2.n.Y2.N(true);
                    uc ucVar = i1Var2.f;
                    if (ucVar != null) {
                        ucVar.run();
                        break;
                    }
                } else if (i23 == -2) {
                    if (arrayList3.isEmpty() || i1Var2.U()) {
                        if (i1Var2.U()) {
                            arrayList3.clear();
                        }
                        int clamp = Utilities.clamp(480, i22 - 1, i21);
                        arrayList3.add(new hg.f1(clamp, Utilities.clamp(1200, i22, clamp + 1)));
                    } else {
                        int i24 = ((hg.f1) hg.k0.g(1, arrayList3)).b;
                        int clamp2 = Utilities.clamp(i24 + 30, i22 - 1, i21);
                        arrayList3.add(new hg.f1(clamp2, Utilities.clamp((i24 + 1560) / 2, i22, clamp2 + 1)));
                    }
                    uc ucVar2 = i1Var2.f;
                    if (ucVar2 != null) {
                        ucVar2.run();
                    }
                    i1Var2.n.Y2.N(true);
                    break;
                } else if (y51Var2.a == 3 && (i10 = i23 / 3) >= 0 && i10 < arrayList3.size()) {
                    int i25 = i10 - 1;
                    hg.f1 f1Var = i25 >= 0 ? (hg.f1) arrayList3.get(i25) : null;
                    final hg.f1 f1Var2 = (hg.f1) arrayList3.get(i10);
                    int i26 = i10 + 1;
                    hg.f1 f1Var3 = i26 < arrayList3.size() ? (hg.f1) arrayList3.get(i26) : null;
                    int i27 = y51Var2.d % 3;
                    if (i27 == 0) {
                        Activity parentActivity = i1Var2.getParentActivity();
                        String string = LocaleController.getString(R.string.BusinessHoursDayOpenHourPicker);
                        int i28 = f1Var2.a;
                        if (f1Var != null) {
                            i21 = f1Var.b + 1;
                        }
                        final int i29 = 0;
                        org.telegram.ui.Components.d5.X(parentActivity, string, i28, i21, f1Var2.b - 1, new Utilities.Callback() { // from class: hg.h1
                            @Override // org.telegram.messenger.Utilities.Callback
                            public final void run(Object obj6) {
                                Integer num2 = (Integer) obj6;
                                switch (i29) {
                                    case 0:
                                        i1 i1Var3 = i1Var2;
                                        boolean V = i1Var3.V();
                                        s8 s8Var = (s8) view3;
                                        int intValue = num2.intValue();
                                        f1Var2.a = intValue;
                                        s8Var.u(f1.a(intValue), true);
                                        if (V != i1Var3.V()) {
                                            i1Var3.n.Y2.N(true);
                                        }
                                        uc ucVar3 = i1Var3.f;
                                        if (ucVar3 != null) {
                                            ucVar3.run();
                                            break;
                                        }
                                        break;
                                    default:
                                        i1 i1Var4 = i1Var2;
                                        boolean V2 = i1Var4.V();
                                        s8 s8Var2 = (s8) view3;
                                        int intValue2 = num2.intValue();
                                        f1Var2.b = intValue2;
                                        s8Var2.u(f1.a(intValue2), true);
                                        if (V2 != i1Var4.V()) {
                                            i1Var4.n.Y2.N(true);
                                        }
                                        uc ucVar4 = i1Var4.f;
                                        if (ucVar4 != null) {
                                            ucVar4.run();
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
                        org.telegram.ui.Components.d5.X(parentActivity2, string2, i30, i31, i22, new Utilities.Callback() { // from class: hg.h1
                            @Override // org.telegram.messenger.Utilities.Callback
                            public final void run(Object obj6) {
                                Integer num2 = (Integer) obj6;
                                switch (i32) {
                                    case 0:
                                        i1 i1Var3 = i1Var2;
                                        boolean V = i1Var3.V();
                                        s8 s8Var = (s8) view3;
                                        int intValue = num2.intValue();
                                        f1Var2.a = intValue;
                                        s8Var.u(f1.a(intValue), true);
                                        if (V != i1Var3.V()) {
                                            i1Var3.n.Y2.N(true);
                                        }
                                        uc ucVar3 = i1Var3.f;
                                        if (ucVar3 != null) {
                                            ucVar3.run();
                                            break;
                                        }
                                        break;
                                    default:
                                        i1 i1Var4 = i1Var2;
                                        boolean V2 = i1Var4.V();
                                        s8 s8Var2 = (s8) view3;
                                        int intValue2 = num2.intValue();
                                        f1Var2.b = intValue2;
                                        s8Var2.u(f1.a(intValue2), true);
                                        if (V2 != i1Var4.V()) {
                                            i1Var4.n.Y2.N(true);
                                        }
                                        uc ucVar4 = i1Var4.f;
                                        if (ucVar4 != null) {
                                            ucVar4.run();
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
                            arrayList3.add(new hg.f1(0, 1439));
                        }
                        i1Var2.n.Y2.N(true);
                        uc ucVar3 = i1Var2.f;
                        if (ucVar3 != null) {
                            ucVar3.run();
                            break;
                        }
                    }
                }
                break;
            case 6:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                hg.e2.U((hg.e2) this.b, (y51) obj, (View) obj2);
                break;
        }
    }

    @Override // org.telegram.ui.oy
    public boolean u(uy uyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, fg1 fg1Var) {
        ii.i4 i4Var = (ii.i4) this.b;
        if (arrayList.isEmpty() || ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId <= 0) {
            return false;
        }
        i4Var.run(((MessagesStorage.TopicKey) arrayList.get(0)).dialogId);
        uyVar.finishFragment();
        return true;
    }

    public /* synthetic */ d5(j2.a aVar, u2.t tVar, u2.b0 b0Var, IOException iOException, boolean z10) {
        this.a = 26;
        this.b = b0Var;
    }

    public /* synthetic */ d5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }
}
