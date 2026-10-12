package org.telegram.ui.Wallet;

import android.app.Activity;
import android.app.job.JobParameters;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Process;
import android.os.StrictMode;
import android.util.Base64;
import android.util.LongSparseArray;
import android.view.ViewGroup;
import androidx.car.app.hardware.common.CarResultStub;
import bi.n9;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.jr0;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.mj1;
import org.telegram.ui.sj1;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;
import org.telegram.ui.xj1;
import org.telegram.ui.yj1;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class t8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t8(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        r2.c cVar = (r2.c) this.b;
        t8 t8Var = (t8) this.c;
        cVar.c.r0();
        r2.f fVar = cVar.b;
        synchronized (fVar.a) {
            fVar.b();
            t8Var.run();
        }
    }

    private final void b() {
        qa.a aVar;
        r9.p pVar = (r9.p) this.b;
        qa.b bVar = (qa.b) this.c;
        if (pVar.b != r9.p.d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (pVar) {
            aVar = pVar.a;
            pVar.a = null;
            pVar.b = bVar;
        }
        aVar.f(bVar);
    }

    private final void c() {
        r9.o oVar = (r9.o) this.b;
        qa.b bVar = (qa.b) this.c;
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

    /* JADX WARN: Code restructure failed: missing block: B:114:?, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        int i11;
        org.telegram.ui.web.b1 b1Var;
        org.telegram.ui.web.h0 h0Var;
        org.telegram.ui.Components.voip.m2 m2Var;
        int i12 = 0;
        switch (this.a) {
            case 0:
                ((ViewGroup) this.c).removeView(((w8) this.b).h);
                return;
            case 1:
                mj1 mj1Var = (mj1) this.b;
                int[] iArr = (int[]) this.c;
                mj1Var.getClass();
                int i13 = iArr[0] - 1;
                iArr[0] = i13;
                if (i13 == 0) {
                    WallpapersListActivity wallpapersListActivity = mj1Var.a;
                    int[][] iArr2 = WallpapersListActivity.k0;
                    wallpapersListActivity.B0(true);
                    return;
                }
                return;
            case 2:
                sj1 sj1Var = (sj1) this.b;
                String str = (String) this.c;
                sj1Var.d.clear();
                sj1Var.e.clear();
                sj1Var.f = true;
                sj1Var.F(str, "", true);
                sj1Var.h = str;
                sj1Var.l();
                sj1Var.y = null;
                return;
            case 3:
                sj1 sj1Var2 = (sj1) this.b;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) this.c);
                WallpapersListActivity wallpapersListActivity2 = sj1Var2.E;
                i10 = ((org.telegram.ui.ActionBar.m2) wallpapersListActivity2).currentAccount;
                MessagesController.getInstance(i10).putUsers(tL_contacts_resolvedPeer.users, false);
                i11 = ((org.telegram.ui.ActionBar.m2) wallpapersListActivity2).currentAccount;
                MessagesController.getInstance(i11).putChats(tL_contacts_resolvedPeer.chats, false);
                wallpapersListActivity2.getMessagesStorage().putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = sj1Var2.x;
                sj1Var2.x = null;
                sj1Var2.F(str2, "", false);
                return;
            case 4:
                xj1 xj1Var = (xj1) this.b;
                String str3 = (String) this.c;
                yj1 yj1Var = xj1Var.a;
                Activity parentActivity = yj1Var.getParentActivity();
                MessageObject messageObject = yj1Var.n;
                if (parentActivity == null) {
                    return;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d(str3);
                }
                str3.getClass();
                if (str3.equals("share_game")) {
                    messageObject.messageOwner.with_my_score = false;
                } else if (str3.equals("share_score")) {
                    messageObject.messageOwner.with_my_score = true;
                }
                yj1Var.showDialog(jr0.O0(yj1Var.getParentActivity(), messageObject, null, false, yj1Var.h));
                return;
            case 5:
                org.telegram.ui.web.b1 b1Var2 = (org.telegram.ui.web.b1) this.b;
                n9 n9Var = (n9) this.c;
                fi.r rVar = b1Var2.j0;
                rVar.f = true;
                rVar.k();
                b1Var2.v(n9Var);
                return;
            case 6:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                if (botWebViewContainer$BotWebViewProxy == null || (b1Var = botWebViewContainer$BotWebViewProxy.a) == null || (h0Var = b1Var.c) == null) {
                    return;
                }
                h0Var.f(arrayList);
                return;
            case 7:
                ArrayList arrayList2 = (ArrayList) this.b;
                LongSparseArray longSparseArray = (LongSparseArray) this.c;
                org.telegram.ui.web.d1.c.addAll(0, arrayList2);
                for (int i14 = 0; i14 < longSparseArray.size(); i14++) {
                    org.telegram.ui.web.d1.d.put(longSparseArray.keyAt(i14), (org.telegram.ui.web.c1) longSparseArray.valueAt(i14));
                }
                org.telegram.ui.web.d1.b = true;
                org.telegram.ui.web.d1.a = false;
                ArrayList arrayList3 = org.telegram.ui.web.d1.e;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    while (i12 < size) {
                        Object obj = arrayList3.get(i12);
                        i12++;
                        ((Utilities.Callback) obj).run(arrayList2);
                    }
                    org.telegram.ui.web.d1.e = null;
                    return;
                }
                return;
            case 8:
                org.telegram.ui.web.f1 f1Var = (org.telegram.ui.web.f1) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                org.telegram.ui.web.g1 g1Var = f1Var.h;
                ArrayList arrayList5 = g1Var.f;
                arrayList5.clear();
                arrayList5.addAll(arrayList4);
                g1Var.h = false;
                b71 b71Var = g1Var.a;
                if (b71Var != null) {
                    b71Var.W2.N(true);
                    return;
                }
                return;
            case 9:
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) this.b;
                e1Var.setEnabled(((org.telegram.ui.web.f2) this.c).b() != null);
                e1Var.animate().alpha(e1Var.isEnabled() ? 1.0f : 0.5f);
                return;
            case 10:
                ((org.telegram.ui.m0) this.b).f0.run((Integer) this.c);
                return;
            case 11:
                org.telegram.ui.web.y1 y1Var = (org.telegram.ui.web.y1) this.b;
                y1Var.getMessagesController().removeWebBrowserException((String) this.c);
                y1Var.a.W2.N(true);
                return;
            case 12:
                org.telegram.ui.web.f2 f2Var = (org.telegram.ui.web.f2) this.b;
                TLObject tLObject = (TLObject) this.c;
                int i15 = f2Var.a;
                f2Var.g = true;
                if (tLObject instanceof TLRPC.TL_messages_webPage) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                    MessagesController.getInstance(i15).putUsers(tL_messages_webPage.users, false);
                    MessagesController.getInstance(i15).putChats(tL_messages_webPage.chats, false);
                    f2Var.h = tL_messages_webPage.webpage;
                } else {
                    if (tLObject instanceof TLRPC.TL_webPage) {
                        TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) tLObject;
                        if (tL_webPage.cached_page instanceof TL_iv.TL_page) {
                            f2Var.h = tL_webPage;
                        }
                    }
                    f2Var.h = null;
                }
                TLRPC.WebPage webPage = f2Var.h;
                if (webPage != null && webPage.cached_page == null) {
                    f2Var.h = null;
                }
                if (!SharedConfig.onlyLocalInstantView && f2Var.h != null && (m2Var = f2Var.l) != null) {
                    m2Var.run();
                }
                f2Var.c();
                return;
            case 13:
                ((org.telegram.ui.web.f2) this.b).m.remove((t8) this.c);
                return;
            case 14:
                p2.b bVar = (p2.b) this.b;
                Uri uri = (Uri) this.c;
                bVar.s = false;
                bVar.b(uri);
                return;
            case 15:
                qg.q0 q0Var = (qg.q0) this.b;
                qg.x0 x0Var = (qg.x0) this.c;
                q0Var.v = true;
                ByteBuffer byteBuffer = (ByteBuffer) q0Var.h(q0Var.f(), true, false, false).c;
                RectF f7 = q0Var.f();
                Object obj2 = q0Var.a.b;
                q0Var.w = new a5.a(byteBuffer, 0, f7);
                q0Var.a(false);
                x0Var.run();
                return;
            case 16:
                qg.c1 c1Var = (qg.c1) this.b;
                Runnable runnable = (Runnable) this.c;
                qg.a1 a1Var = c1Var.d;
                if (a1Var == null || !a1Var.f) {
                    return;
                }
                qg.a1.b(a1Var);
                runnable.run();
                return;
            case 17:
                qi.i iVar = (qi.i) this.b;
                qi.h hVar = (qi.h) this.c;
                byte[] bArr = new byte[65536];
                try {
                    InputStream inputStream = hVar.b.getInputStream();
                    while (true) {
                        synchronized (iVar.a) {
                            while (!iVar.u && iVar.m.get(Integer.valueOf(hVar.a)) == hVar && (!iVar.t || !hVar.e || hVar.c == 0)) {
                                try {
                                    iVar.a.wait();
                                } finally {
                                }
                            }
                            if (!iVar.u && iVar.m.get(Integer.valueOf(hVar.a)) == hVar) {
                                int read = inputStream.read(bArr, 0, (int) Math.min(65536L, hVar.c));
                                if (read < 0) {
                                    iVar.c(hVar, true);
                                    return;
                                }
                                if (read != 0) {
                                    byte[] bArr2 = new byte[read];
                                    System.arraycopy(bArr, 0, bArr2, 0, read);
                                    synchronized (iVar.a) {
                                        try {
                                            if (!iVar.u && iVar.m.get(Integer.valueOf(hVar.a)) == hVar && iVar.t) {
                                                hVar.c -= read;
                                                iVar.l(2, hVar.a, bArr2);
                                            }
                                        } finally {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return;
                } catch (Exception unused) {
                    iVar.c(hVar, true);
                    return;
                }
            case 18:
                qi.i iVar2 = (qi.i) this.b;
                String str4 = (String) this.c;
                iVar2.getClass();
                try {
                    byte[] decode = Base64.decode(str4.substring(14), 2);
                    if (decode.length >= 8 && decode.length <= 1048584) {
                        iVar2.k(decode);
                        return;
                    }
                    iVar2.f();
                    return;
                } catch (IllegalArgumentException e) {
                    FileLog.e(e);
                    iVar2.f();
                    return;
                }
            case 19:
                ((qi.i) this.b).k((byte[]) this.c);
                return;
            case 20:
                CarResultStub.lambda$notifyResults$1((Map.Entry) this.b, this.c);
                return;
            case 21:
                a();
                return;
            case 22:
                r2.r rVar2 = (r2.r) this.b;
                rVar2.T.set(rVar2.w((qf.b) this.c, rVar2.N, 0));
                return;
            case 23:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.b;
                JobParameters jobParameters = (JobParameters) this.c;
                int i16 = JobInfoSchedulerService.a;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 24:
                b();
                return;
            case 25:
                c();
                return;
            case 26:
                rg.o0 o0Var = (rg.o0) this.b;
                rg.z1 z1Var = (rg.z1) this.c;
                z1Var.m();
                o0Var.s0(z1Var, true);
                return;
            case 27:
                ((rg.z1) this.b).s((Bitmap) this.c);
                return;
            case 28:
                rg.p2 p2Var = (rg.p2) this.b;
                ArrayList arrayList6 = (ArrayList) this.c;
                p2Var.G = false;
                rg.m2[] m2VarArr = (rg.m2[]) arrayList6.toArray(new rg.m2[0]);
                p2Var.H = m2VarArr;
                if (m2VarArr.length > 0) {
                    p2Var.b0.setScaleX(0.3f);
                    p2Var.b0.setScaleY(0.3f);
                    p2Var.b0.setAlpha(0.0f);
                    p2Var.b0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).setInterpolator(es.f).start();
                    return;
                }
                return;
            default:
                s9.a aVar = (s9.a) this.b;
                Runnable runnable2 = (Runnable) this.c;
                Process.setThreadPriority(aVar.c);
                StrictMode.ThreadPolicy threadPolicy = aVar.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable2.run();
                return;
        }
    }
}
