package li;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.style.ClickableSpan;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import m4.n1;
import mg.s1;
import org.telegram.messenger.b8;
import org.telegram.messenger.d20;
import org.telegram.messenger.ef;
import org.telegram.messenger.h20;
import org.telegram.messenger.j20;
import org.telegram.messenger.jj;
import org.telegram.messenger.pp;
import org.telegram.messenger.q20;
import org.telegram.messenger.ui;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.i3;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.Cells.ea;
import org.telegram.ui.Cells.ga;
import org.telegram.ui.Components.bo0;
import org.telegram.ui.Components.je;
import org.telegram.ui.Components.jz0;
import org.telegram.ui.Components.lu0;
import org.telegram.ui.Components.lz0;
import org.telegram.ui.Components.o80;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.rf;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.w7;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Wallet.b6;
import org.telegram.ui.un;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class s implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ s(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, n2.k] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, n2.k] */
    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.User Z1;
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                v vVar = (v) this.b;
                HandlerThread handlerThread = (HandlerThread) this.c;
                CountDownLatch countDownLatch = (CountDownLatch) this.d;
                vVar.getClass();
                try {
                    vVar.i();
                    return;
                } finally {
                    handlerThread.quitSafely();
                    countDownLatch.countDown();
                }
            case 1:
                x0 x0Var = (x0) this.b;
                z zVar = (z) this.c;
                File file = (File) this.d;
                Handler handler = x0Var.i;
                try {
                    zVar.c(file);
                    x0Var.g();
                    long h = zVar.h();
                    x0Var.m.b("preview snapshot completed: durationMs=" + h + ", size=" + file.length() + ", elapsedMs=" + x0.f(x0Var.M));
                    handler.post(new i0(x0Var, h, 1));
                    return;
                } catch (Exception e) {
                    handler.post(new h0(x0Var, e, 3));
                    return;
                }
            case 2:
                x0 x0Var2 = (x0) this.b;
                t0 t0Var = (t0) this.c;
                File file2 = (File) this.d;
                u0 u0Var = x0Var2.e;
                long j10 = t0Var.a;
                lz0 lz0Var = (lz0) u0Var;
                synchronized (lz0Var) {
                    if (lz0Var.d) {
                        return;
                    }
                    lz0Var.c.put(Long.valueOf(j10), new jz0(file2));
                    return;
                }
            case 3:
                m4.b0 b0Var = (m4.b0) this.b;
                m4.w wVar = (m4.w) this.c;
                KeyEvent keyEvent = (KeyEvent) this.d;
                m4.f0 f0Var = b0Var.b;
                if (f0Var.i(wVar)) {
                    f0Var.b(keyEvent, false, false);
                } else {
                    m4.p0 p0Var = f0Var.h;
                    n4.r rVar = wVar.a;
                    rVar.getClass();
                    p0Var.getClass();
                    p0Var.i0(1, new m4.i0(p0Var, 9), rVar, true);
                }
                b0Var.a = null;
                return;
            case 4:
                m4.f0 f0Var2 = (m4.f0) this.b;
                m4.v0 v0Var = (m4.v0) this.c;
                m4.x xVar = (m4.x) this.d;
                if (f0Var2.j()) {
                    return;
                }
                n1 n1Var = f0Var2.t;
                v0Var.getClass();
                w7.y.b(n1Var, xVar);
                return;
            case 5:
                ((s1) this.b).a(new Pair((HashMap) this.c, (ArrayList) this.d));
                return;
            case 6:
                TLObject tLObject = (TLObject) this.b;
                vp vpVar = (vp) this.c;
                s1 s1Var = (s1) this.d;
                if (tLObject instanceof TLRPC.TL_channels_channelParticipants) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
                    vpVar.V3(tL_channels_channelParticipants.users, false);
                    vpVar.P3(tL_channels_channelParticipants.chats, false);
                    long e7 = d20.i(d20.s0).e();
                    ArrayList arrayList = new ArrayList();
                    for (int i10 = 0; i10 < tL_channels_channelParticipants.participants.size(); i10++) {
                        TLRPC.Peer peer = tL_channels_channelParticipants.participants.get(i10).peer;
                        if (peer != null && jj.C1(peer) != e7 && (Z1 = vpVar.Z1(Long.valueOf(peer.user_id))) != null && !h20.x(Z1) && !Z1.bot) {
                            arrayList.add(vpVar.l1(peer));
                        }
                    }
                    s1Var.a(arrayList);
                    return;
                }
                return;
            case 7:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
                q20 q20Var = (q20) this.c;
                q20 q20Var2 = (q20) this.d;
                if (tL_error != null) {
                    q20Var.a(tL_error);
                    return;
                } else {
                    q20Var2.a(null);
                    return;
                }
            case 8:
                ((ag.l) this.b).a(new Pair((HashMap) this.c, (ArrayList) this.d));
                return;
            case 9:
                n2.j jVar = (n2.j) this.b;
                this.c.j(jVar.a, jVar.b, (Exception) this.d);
                return;
            case 10:
                n2.j jVar2 = (n2.j) this.b;
                this.c.l(jVar2.a, jVar2.b, (oa.d) this.d);
                return;
            case 11:
                nh.p pVar = (nh.p) this.b;
                q80 q80Var = (q80) this.c;
                ClickableSpan clickableSpan = (ClickableSpan) this.d;
                o80 o80Var = pVar.G;
                if (o80Var == null || pVar.H != q80Var) {
                    return;
                }
                o80Var.a(clickableSpan);
                pVar.H = null;
                pVar.y.f(true);
                return;
            case 12:
                of.d dVar = (of.d) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                String str = dVar.b;
                int i11 = dVar.a;
                if (tLObject2 != null) {
                    ui.b0(i11).i1(str, (TLRPC.Document) tLObject2, false);
                } else {
                    dVar.a();
                    ui.b0(i11).i1(str, null, true);
                    if (tL_error2 != null) {
                        zs.f(i11).d(new mh.k(6, dVar, tL_error2));
                    }
                }
                dVar.a();
                return;
            case 13:
                ((VideoAds) this.b).lambda$show$3((wb) this.c, (TLRPC.TL_sponsoredMessage) this.d);
                return;
            case 14:
                ((VideoAds) this.b).lambda$show$5((wb) this.c, (boolean[]) this.d);
                return;
            case 15:
                ((VideoPlayerHolderBase) this.b).lambda$release$3((TLRPC.Document) this.c, (Runnable) this.d);
                return;
            case 16:
                ((j20) this.b).a((TLObject) this.c, (TLRPC.TL_error) this.d);
                return;
            case 17:
                ((j20) this.b).a((TLRPC.Updates) this.c, (TLRPC.TL_error) this.d);
                return;
            case 18:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.b;
                k2 k2Var = (k2) this.c;
                k2 k2Var2 = (k2) this.d;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarLayout.J;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (viewGroup = (ViewGroup) actionBarPopupWindow$ActionBarPopupWindowLayout.getParent()) != null) {
                    viewGroup.removeView(actionBarLayout.J);
                }
                if (actionBarLayout.h || actionBarLayout.a0) {
                    actionBarLayout.w.setScaleX(1.0f);
                    actionBarLayout.w.setScaleY(1.0f);
                    actionBarLayout.h = false;
                    actionBarLayout.J = null;
                    actionBarLayout.a0 = false;
                } else {
                    actionBarLayout.w.setTranslationX(0.0f);
                }
                actionBarLayout.m(k2Var);
                k2Var.setRemovingFromStack(false);
                k2Var.onTransitionAnimationEnd(false, true);
                k2Var2.onTransitionAnimationEnd(true, true);
                k2Var2.onBecomeFullyVisible();
                return;
            case 19:
                i3 i3Var = (i3) this.b;
                ((k2) this.c).presentFragment((un) this.d);
                i3Var.c = false;
                return;
            case 20:
                i3 i3Var2 = (i3) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                h3 h3Var = (h3) this.d;
                i3Var2.getClass();
                int i12 = 0;
                while (i12 < arrayList2.size()) {
                    if (((f3) arrayList2.get(i12)).a == h3Var) {
                        arrayList2.remove(i12);
                        i12--;
                    }
                    i12++;
                }
                i3Var2.invalidate();
                return;
            case 21:
                s6 s6Var = (s6) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                s6 s6Var2 = (s6) this.d;
                if (!(tLObject3 instanceof TLRPC.TL_wallPaper)) {
                    s6Var.s();
                    return;
                }
                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject3;
                s6Var.g0 = b8.r(null, tL_wallPaper.document);
                zs.f(s6Var.E).b(s6Var, zs.Y1);
                zs.f(s6Var.E).b(s6Var, zs.Z1);
                b8.G(s6Var2.E).X(tL_wallPaper.document, tL_wallPaper, 1, 1);
                return;
            case 22:
                org.telegram.ui.Cells.s0 s0Var = (org.telegram.ui.Cells.s0) this.b;
                b6.F0(s0Var.getContext(), s0Var.H, (TL_wallet.walletTransaction) this.c, null, null, null, (org.telegram.ui.Cells.m0) this.d, s0Var.g1);
                return;
            case 23:
                org.telegram.ui.Cells.s0 s0Var2 = (org.telegram.ui.Cells.s0) this.b;
                s0Var2.f1.R0(s0Var2, (TLRPC.TL_premiumGiftOption) this.c, (String) this.d);
                return;
            case 24:
                ga gaVar = (ga) this.b;
                s6 s6Var3 = (s6) this.c;
                s6Var3.f = !s6Var3.d((File) this.d, s6Var3.c);
                org.telegram.messenger.i0.g3(new ea(8, gaVar, s6Var3));
                return;
            case 25:
                org.telegram.ui.Components.g0 g0Var = (org.telegram.ui.Components.g0) this.b;
                s4.L((Context) this.c, g0Var.d2, new m2.t(g0Var, 8), (p6) this.d);
                return;
            case 26:
                w7 w7Var = (w7) this.b;
                x1 x1Var = (x1) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                x1Var.dismiss();
                if (tLObject4 instanceof TLRPC.TL_messageMediaDocument) {
                    TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_account_saveMusic.id = tL_inputDocument;
                    TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) tLObject4).document;
                    tL_inputDocument.id = document.id;
                    tL_inputDocument.access_hash = document.access_hash;
                    tL_inputDocument.file_reference = document.file_reference;
                    pp ppVar = w7Var.m2;
                    if (ppVar != null) {
                        ppVar.c.add(0, ppVar.d(document));
                        ppVar.e();
                    }
                    w7Var.n2.clear();
                    w7Var.n2.addAll(w7Var.m2.c);
                    w7Var.q1.f();
                    ConnectionsManager.getInstance(w7Var.a).sendRequest(tL_account_saveMusic, null);
                    return;
                }
                return;
            case 27:
                je jeVar = (je) this.b;
                lu0 lu0Var = (lu0) this.c;
                bo0 bo0Var = (bo0) this.d;
                jeVar.getClass();
                lu0Var.getViewTreeObserver().removeOnDrawListener(jeVar);
                bo0Var.a.setHideAvatar(true);
                return;
            case 28:
                rf rfVar = (rf) this.b;
                Uri uri = (Uri) this.c;
                File file3 = (File) this.d;
                try {
                    InputStream openInputStream = rfVar.getContext().getContentResolver().openInputStream(uri);
                    FileOutputStream fileOutputStream = new FileOutputStream(file3);
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = openInputStream.read(bArr);
                        if (read <= 0) {
                            openInputStream.close();
                            fileOutputStream.close();
                            ef efVar = new ef(-1, file3.getAbsolutePath(), 0, false, 0, 0);
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add(efVar);
                            org.telegram.messenger.i0.g3(new s(rfVar, arrayList3, file3, 29));
                            return;
                        }
                        fileOutputStream.write(bArr, 0, read);
                        fileOutputStream.flush();
                    }
                } catch (Throwable th2) {
                    th2.printStackTrace();
                    return;
                }
            default:
                ((rf) this.b).J((File) this.d, (ArrayList) this.c);
                return;
        }
    }
}
