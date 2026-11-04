package org.telegram.ui;

import android.app.Activity;
import android.app.job.JobParameters;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Looper;
import android.util.LongSparseArray;
import android.view.View;
import androidx.car.app.hardware.common.CarResultStub;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hc1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hc1(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        t2.c cVar = (t2.c) this.b;
        hc1 hc1Var = (hc1) this.c;
        cVar.c.d();
        t2.f fVar = cVar.b;
        synchronized (fVar.a) {
            fVar.b();
            hc1Var.run();
        }
    }

    private final void b() {
        ta.a aVar;
        t9.p pVar = (t9.p) this.b;
        ta.b bVar = (ta.b) this.c;
        if (pVar.b != t9.p.d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (pVar) {
            aVar = pVar.a;
            pVar.a = null;
            pVar.b = bVar;
        }
        aVar.c(bVar);
    }

    private final void c() {
        t9.o oVar = (t9.o) this.b;
        ta.b bVar = (ta.b) this.c;
        synchronized (oVar) {
            try {
                if (oVar.b == null) {
                    oVar.a.add(bVar);
                } else {
                    oVar.b.add(bVar.get());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x0267, code lost:
    
        if (r4 != null) goto L108;
     */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02b6  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i3;
        int i10;
        org.telegram.ui.web.w0 w0Var;
        org.telegram.ui.web.d0 d0Var;
        TLRPC.WebPage webPage;
        TLRPC.WebPage webPage2;
        org.telegram.ui.ActionBar.d4 d4Var;
        SQLiteCursor sQLiteCursor;
        String str;
        String str2;
        org.telegram.utils.twidget.u uVar;
        SQLiteCursor sQLiteCursor2 = null;
        int i11 = 0;
        switch (this.a) {
            case 0:
                ic1 ic1Var = (ic1) this.b;
                int[] iArr = (int[]) this.c;
                ic1Var.getClass();
                int i12 = iArr[0] - 1;
                iArr[0] = i12;
                if (i12 == 0) {
                    ic1Var.a.G0(true);
                    return;
                }
                return;
            case 1:
                nc1 nc1Var = (nc1) this.b;
                String str3 = (String) this.c;
                nc1Var.d.clear();
                nc1Var.e.clear();
                nc1Var.f = true;
                nc1Var.F(str3, "", true);
                nc1Var.h = str3;
                nc1Var.f();
                nc1Var.E = null;
                return;
            case 2:
                nc1 nc1Var2 = (nc1) this.b;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) this.c);
                WallpapersListActivity wallpapersListActivity = nc1Var2.F;
                i3 = ((org.telegram.ui.ActionBar.d2) wallpapersListActivity).currentAccount;
                org.telegram.messenger.hp.s1(i3).Y3(tL_contacts_resolvedPeer.users, false);
                i10 = ((org.telegram.ui.ActionBar.d2) wallpapersListActivity).currentAccount;
                org.telegram.messenger.hp.s1(i10).S3(tL_contacts_resolvedPeer.chats, false);
                wallpapersListActivity.getMessagesStorage().m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str4 = nc1Var2.y;
                nc1Var2.y = null;
                nc1Var2.F(str4, "", false);
                return;
            case 3:
                tc1 tc1Var = (tc1) this.b;
                String str5 = (String) this.c;
                uc1 uc1Var = tc1Var.a;
                Activity parentActivity = uc1Var.getParentActivity();
                org.telegram.messenger.zi ziVar = uc1Var.n;
                if (parentActivity == null) {
                    return;
                }
                if (org.telegram.messenger.r2.a) {
                    org.telegram.messenger.a8.b(str5);
                }
                str5.getClass();
                if (str5.equals("share_game")) {
                    ziVar.k.with_my_score = false;
                } else if (str5.equals("share_score")) {
                    ziVar.k.with_my_score = true;
                }
                uc1Var.showDialog(org.telegram.ui.Components.oo0.N0(uc1Var.getParentActivity(), ziVar, null, false, uc1Var.h));
                return;
            case 4:
                org.telegram.ui.web.w0 w0Var2 = (org.telegram.ui.web.w0) this.b;
                ei.p7 p7Var = (ei.p7) this.c;
                ii.r rVar = w0Var2.k0;
                rVar.f = true;
                rVar.k();
                w0Var2.v(p7Var);
                return;
            case 5:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                if (botWebViewContainer$BotWebViewProxy == null || (w0Var = botWebViewContainer$BotWebViewProxy.a) == null || (d0Var = w0Var.c) == null) {
                    return;
                }
                d0Var.f(arrayList);
                return;
            case 6:
                ArrayList arrayList2 = (ArrayList) this.b;
                LongSparseArray longSparseArray = (LongSparseArray) this.c;
                b8.xf.c.addAll(0, arrayList2);
                for (int i13 = 0; i13 < longSparseArray.size(); i13++) {
                    b8.xf.d.put(longSparseArray.keyAt(i13), (org.telegram.ui.web.x0) longSparseArray.valueAt(i13));
                }
                b8.xf.b = true;
                b8.xf.a = false;
                ArrayList arrayList3 = b8.xf.e;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    while (i11 < size) {
                        Object obj = arrayList3.get(i11);
                        i11++;
                        ((org.telegram.messenger.u10) obj).a(arrayList2);
                    }
                    b8.xf.e = null;
                    return;
                }
                return;
            case 7:
                gi.s2 s2Var = (gi.s2) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) s2Var.c;
                ArrayList arrayList5 = y0Var.h;
                arrayList5.clear();
                arrayList5.addAll(arrayList4);
                y0Var.n = false;
                ai.h4 h4Var = y0Var.a;
                if (h4Var != null) {
                    h4Var.g3.O(true);
                    return;
                }
                return;
            case 8:
                org.telegram.ui.ActionBar.y0 y0Var2 = (org.telegram.ui.ActionBar.y0) this.b;
                y0Var2.setEnabled(((org.telegram.ui.web.s1) this.c).b() != null);
                y0Var2.animate().alpha(y0Var2.isEnabled() ? 1.0f : 0.5f);
                return;
            case 9:
                ((m0) this.b).g0.a((Integer) this.c);
                return;
            case 10:
                org.telegram.ui.web.m1 m1Var = (org.telegram.ui.web.m1) this.b;
                String str6 = (String) this.c;
                org.telegram.messenger.hp messagesController = m1Var.getMessagesController();
                messagesController.getClass();
                TL_account.toggleWebBrowserSettingsException togglewebbrowsersettingsexception = new TL_account.toggleWebBrowserSettingsException();
                togglewebbrowsersettingsexception.url = str6;
                togglewebbrowsersettingsexception.delete = true;
                messagesController.getConnectionsManager().sendRequestTyped(togglewebbrowsersettingsexception, new org.telegram.messenger.wk(messagesController, 3));
                m1Var.a.g3.O(true);
                return;
            case 11:
                org.telegram.ui.web.s1 s1Var = (org.telegram.ui.web.s1) this.b;
                TLObject tLObject = (TLObject) this.c;
                int i14 = s1Var.a;
                s1Var.g = true;
                if (!(tLObject instanceof TLRPC.TL_messages_webPage)) {
                    if (tLObject instanceof TLRPC.TL_webPage) {
                        TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) tLObject;
                        if (tL_webPage.cached_page instanceof TL_iv.TL_page) {
                            s1Var.h = tL_webPage;
                        }
                    }
                    webPage = null;
                    s1Var.h = null;
                    webPage2 = s1Var.h;
                    if (webPage2 != null && webPage2.cached_page == null) {
                        s1Var.h = webPage;
                    }
                    if (!org.telegram.messenger.az.w0 && s1Var.h != null && (d4Var = s1Var.l) != null) {
                        d4Var.run();
                    }
                    s1Var.c();
                    return;
                }
                TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                org.telegram.messenger.hp.s1(i14).Y3(tL_messages_webPage.users, false);
                org.telegram.messenger.hp.s1(i14).S3(tL_messages_webPage.chats, false);
                s1Var.h = tL_messages_webPage.webpage;
                webPage = null;
                webPage2 = s1Var.h;
                if (webPage2 != null) {
                    s1Var.h = webPage;
                }
                if (!org.telegram.messenger.az.w0) {
                    d4Var.run();
                }
                s1Var.c();
                return;
            case 12:
                ((org.telegram.ui.web.s1) this.b).m.remove((hc1) this.c);
                return;
            case 13:
                org.telegram.utils.twidget.m mVar = (org.telegram.utils.twidget.m) this.b;
                TLRPC.TL_messageMediaWidget tL_messageMediaWidget = (TLRPC.TL_messageMediaWidget) this.c;
                mVar.r = tL_messageMediaWidget;
                mVar.q = tL_messageMediaWidget.public_data_hash;
                org.telegram.utils.twidget.p.c(mVar, org.telegram.utils.twidget.p.A(tL_messageMediaWidget.chat_data), org.telegram.utils.twidget.p.A(tL_messageMediaWidget.public_data));
                return;
            case 14:
                ((org.telegram.utils.twidget.i) this.b).a(null, (TLRPC.TL_error) this.c);
                return;
            case 15:
                org.telegram.messenger.qr qrVar = (org.telegram.messenger.qr) this.b;
                org.telegram.utils.twidget.m mVar2 = (org.telegram.utils.twidget.m) this.c;
                long j10 = mVar2.c;
                int i15 = mVar2.d;
                ArrayList arrayList6 = new ArrayList();
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = qrVar.b;
                        Locale locale = Locale.US;
                        sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT local FROM widget_state WHERE uid = " + j10 + " AND mid = " + i15, new Object[0]);
                        try {
                            str = (!sQLiteCursor.next() || sQLiteCursor.isNull(0)) ? null : sQLiteCursor.stringValue(0);
                            try {
                                sQLiteCursor.dispose();
                                sQLiteCursor = qrVar.b.queryFinalized("SELECT width, height, anchor FROM widget_heights WHERE uid = " + j10 + " AND mid = " + i15 + " ORDER BY date DESC", new Object[0]);
                                while (sQLiteCursor.next()) {
                                    arrayList6.add(new int[]{sQLiteCursor.intValue(0), sQLiteCursor.intValue(1), sQLiteCursor.intValue(2)});
                                }
                            } catch (Exception e10) {
                                e = e10;
                                qrVar.o(e, true);
                                break;
                            }
                        } catch (Exception e11) {
                            e = e11;
                            str = null;
                            qrVar.o(e, true);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (sQLiteCursor2 != null) {
                            sQLiteCursor2.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e12) {
                    e = e12;
                    sQLiteCursor = null;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteCursor2 = null;
                    if (sQLiteCursor2 != null) {
                    }
                    throw th;
                }
                sQLiteCursor.dispose();
                Object[] objArr = {str, arrayList6};
                ArrayList arrayList7 = (ArrayList) objArr[1];
                if (!arrayList7.isEmpty()) {
                    org.telegram.utils.twidget.n l10 = org.telegram.utils.twidget.p.l(mVar2.a());
                    synchronized (l10) {
                        if (l10.a.isEmpty()) {
                            while (i11 < arrayList7.size() && i11 < 4) {
                                l10.a.add((int[]) arrayList7.get(i11));
                                i11++;
                            }
                        }
                    }
                }
                org.telegram.messenger.g0.h3(new hc1(16, mVar2, objArr));
                return;
            case 16:
                org.telegram.utils.twidget.m mVar3 = (org.telegram.utils.twidget.m) this.b;
                String str7 = (String) ((Object[]) this.c)[0];
                HashMap hashMap = org.telegram.utils.twidget.p.c;
                mVar3.z = true;
                String a10 = mVar3.a();
                if (str7 != null && !hashMap.containsKey(a10)) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("local", new JSONObject(str7));
                        hashMap.put(a10, jSONObject);
                    } catch (Exception e13) {
                        org.telegram.messenger.a8.g(e13, true);
                    }
                }
                org.telegram.utils.twidget.u uVar2 = mVar3.t;
                if (uVar2 != null) {
                    JSONObject jSONObject2 = (JSONObject) hashMap.get(a10);
                    try {
                        str2 = org.telegram.messenger.bd.E0().y.toLanguageTag();
                    } catch (Exception unused) {
                        str2 = null;
                    }
                    String jSONObject3 = jSONObject2 != null ? jSONObject2.toString() : null;
                    uVar2.t = str2;
                    uVar2.u = jSONObject3;
                }
                org.telegram.ui.Components.gk0 gk0Var = mVar3.u;
                if (gk0Var != null && (uVar2 == null || uVar2.i <= 0)) {
                    gk0Var.p0("cached heights read");
                }
                if (mVar3.A) {
                    mVar3.A = false;
                    if (mVar3.x > 0 && uVar2 != null) {
                        org.telegram.utils.twidget.p.y(mVar3);
                    }
                }
                org.telegram.utils.twidget.p.o();
                return;
            case 17:
                org.telegram.utils.twidget.h0 h0Var = (org.telegram.utils.twidget.h0) this.b;
                h0Var.L = ((Exception) this.c).toString();
                if (h0Var.u || (uVar = h0Var.J) == null) {
                    return;
                }
                String str8 = h0Var.L;
                if (uVar.e != null) {
                    org.telegram.messenger.a8.d("widget " + uVar.a + ": " + str8);
                }
                org.telegram.ui.Components.h71 h71Var = uVar.h;
                if (h71Var != null) {
                    h71Var.a.h();
                    return;
                }
                return;
            case 18:
                p2.d dVar = (p2.d) this.b;
                d2.v vVar = (d2.v) this.c;
                p2.e eVar = dVar.d;
                if (eVar.F == 0 || dVar.c) {
                    return;
                }
                Looper looper = eVar.J;
                looper.getClass();
                dVar.b = eVar.b(looper, dVar.a, vVar, false);
                eVar.y.add(dVar);
                return;
            case 19:
                q2.q qVar = (q2.q) this.b;
                q2.j jVar = (q2.j) this.c;
                org.telegram.ui.Components.nh nhVar = qVar.c;
                Uri uri = jVar.y;
                r2.c cVar = (r2.c) ((q2.k) nhVar.b).b.d.get(uri);
                if (cVar != null) {
                    r2.c.b(cVar, uri, true);
                    return;
                }
                return;
            case 20:
                CarResultStub.lambda$notifyResults$1((Map.Entry) this.b, this.c);
                return;
            case 21:
                r2.b bVar = (r2.b) this.b;
                Uri uri2 = (Uri) this.c;
                bVar.s = false;
                bVar.b(uri2);
                return;
            case 22:
                org.telegram.ui.Cells.k9 k9Var = (org.telegram.ui.Cells.k9) this.b;
                View view = (View) this.c;
                re.a aVar = (re.a) k9Var.d;
                if ((2 & k9Var.a) != 0) {
                    if (!aVar.Z0(view, k9Var.b, k9Var.c)) {
                        k9Var.a |= 8;
                        return;
                    }
                    k9Var.a &= -3;
                    k9Var.e = null;
                    view.performHapticFeedback(0);
                    k9Var.a = (4 | k9Var.a) & (-11);
                    k9Var.e = null;
                    return;
                }
                return;
            case 23:
                a();
                return;
            case 24:
                t2.r rVar2 = (t2.r) this.b;
                rVar2.U.set(rVar2.w((tf.b) this.c, rVar2.O, 0));
                return;
            case 25:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.b;
                JobParameters jobParameters = (JobParameters) this.c;
                int i16 = JobInfoSchedulerService.a;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 26:
                b();
                return;
            case 27:
                c();
                return;
            case 28:
                tg.i0 i0Var = (tg.i0) this.b;
                tg.p0 p0Var = (tg.p0) this.c;
                i0Var.v = true;
                ByteBuffer byteBuffer = (ByteBuffer) i0Var.h(i0Var.f(), true, false, false).c;
                RectF f10 = i0Var.f();
                Object obj2 = i0Var.a.b;
                i0Var.w = new b8.kg(byteBuffer, 0, f10);
                i0Var.a(false);
                p0Var.run();
                return;
            default:
                tg.u0 u0Var = (tg.u0) this.b;
                Runnable runnable = (Runnable) this.c;
                tg.s0 s0Var = u0Var.d;
                if (s0Var == null || !s0Var.f) {
                    return;
                }
                tg.s0.a(s0Var);
                runnable.run();
                return;
        }
    }
}
