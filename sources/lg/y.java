package lg;

import ai.f3;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioTrack;
import android.os.Handler;
import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import b8.xe;
import ci.w9;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
import mi.a6;
import mi.b6;
import mi.d3;
import mi.d6;
import mi.h3;
import mi.n5;
import mi.t3;
import mi.v5;
import mi.y5;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hs;
import org.telegram.messenger.k5;
import org.telegram.messenger.l10;
import org.telegram.messenger.n10;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.a3;
import org.telegram.ui.ActionBar.b3;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.y2;
import org.telegram.ui.Cells.ea;
import org.telegram.ui.Cells.ga;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.t4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.w5;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ y(ViewGroup viewGroup, Object obj, String str, int i3) {
        this.a = i3;
        this.b = viewGroup;
        this.d = obj;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        int i3 = 8;
        int i10 = 0;
        switch (this.a) {
            case 0:
                z zVar = (z) this.b;
                String str = (String) this.c;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.d;
                TL_account.deleteBusinessChatLink deletebusinesschatlink = new TL_account.deleteBusinessChatLink();
                deletebusinesschatlink.slug = str;
                ConnectionsManager.getInstance(zVar.a).sendRequest(deletebusinesschatlink, new f3(22, zVar, tL_businessChatLink));
                return;
            case 1:
                j0 j0Var = (j0) this.b;
                TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) this.c;
                TL_account.TL_businessBotRecipients tL_businessBotRecipients = (TL_account.TL_businessBotRecipients) this.d;
                f.a(j0Var.a).b();
                j0Var.dismiss();
                tL_connectedBot.recipients = tL_businessBotRecipients;
                d2 T = LaunchActivity.T();
                if (T != null) {
                    fc.a0(T).Q(R.raw.contact_check, 36, bd.a0(null, null, 2131752784, l10.p(j0Var.R1))).j();
                    return;
                }
                return;
            case 2:
                t0 t0Var = (t0) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TLObject tLObject = (TLObject) this.d;
                if (tL_error != null) {
                    t0Var.a.b(false);
                    fc.d0(tL_error);
                    return;
                } else if (!(tLObject instanceof TLRPC.TL_boolFalse)) {
                    t0Var.finishFragment();
                    return;
                } else {
                    t0Var.a.b(false);
                    k5.p(null, 2131743889, fc.a0(t0Var), null);
                    return;
                }
            case 3:
                d1.Z((d1) this.b, (TLRPC.TL_error) this.c, (TLObject) this.d);
                return;
            case 4:
                y1 y1Var = (y1) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                SharedPreferences sharedPreferences = (SharedPreferences) this.d;
                ArrayList arrayList = y1Var.d;
                if (tLObject2 instanceof TLRPC.TL_help_timezonesList) {
                    arrayList.clear();
                    arrayList.addAll(((TLRPC.TL_help_timezonesList) tLObject2).timezones);
                    SerializedData serializedData = new SerializedData(tLObject2.getObjectSize());
                    tLObject2.serializeToStream(serializedData);
                    sharedPreferences.edit().putString("timezones", Utilities.f(serializedData.toByteArray())).apply();
                    hs.f(y1Var.a).k(hs.r3, new Object[0]);
                }
                y1Var.c = true;
                y1Var.b = false;
                return;
            case 5:
                m2.t tVar = (m2.t) this.b;
                d2.v vVar = (d2.v) this.c;
                k2.e eVar = (k2.e) this.d;
                m2.u uVar = (m2.u) tVar.c;
                String str2 = g2.n0.a;
                l2.f fVar = ((k2.c0) uVar).a.s;
                l2.a U = fVar.U();
                fVar.V(U, 1009, new l2.c(U, vVar, eVar, 23));
                return;
            case 6:
                AudioTrack audioTrack = (AudioTrack) this.b;
                Handler handler = (Handler) this.c;
                g2.s sVar = (g2.s) this.d;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new n(sVar, i3));
                    }
                    synchronized (m2.h0.t) {
                        try {
                            int i11 = m2.h0.v - 1;
                            m2.h0.v = i11;
                            if (i11 == 0) {
                                ScheduledExecutorService scheduledExecutorService = m2.h0.u;
                                scheduledExecutorService.getClass();
                                scheduledExecutorService.shutdown();
                                m2.h0.u = null;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new n(sVar, i3));
                    }
                    synchronized (m2.h0.t) {
                        try {
                            int i12 = m2.h0.v - 1;
                            m2.h0.v = i12;
                            if (i12 == 0) {
                                ScheduledExecutorService scheduledExecutorService2 = m2.h0.u;
                                scheduledExecutorService2.getClass();
                                scheduledExecutorService2.shutdown();
                                m2.h0.u = null;
                            }
                            throw th2;
                        } finally {
                        }
                    }
                }
            case 7:
                t3 t3Var = (t3) this.b;
                f60 f60Var = (f60) this.c;
                n5 n5Var = (n5) this.d;
                if (t3Var.r4 != f60Var) {
                    return;
                }
                t3Var.r4 = null;
                if (t3Var.K3 && t3Var.q4 == n5Var && !n5Var.I.isEmpty()) {
                    t3Var.P2();
                    return;
                }
                return;
            case 8:
                t3 t3Var2 = (t3) this.b;
                mi.a aVar = (mi.a) this.c;
                mi.a aVar2 = (mi.a) this.d;
                ArrayList arrayList2 = t3Var2.x4;
                h3 h3Var = t3Var2.v3;
                if (h3Var == null || aVar == null || aVar2 == null) {
                    return;
                }
                int indexOf = arrayList2.indexOf(aVar);
                int indexOf2 = arrayList2.indexOf(aVar2);
                if (indexOf < 0 || indexOf2 < 0) {
                    return;
                }
                while (i10 < arrayList2.size()) {
                    mi.a aVar3 = (mi.a) arrayList2.get(i10);
                    long j10 = aVar3.t;
                    if (j10 != 0) {
                        h3Var.X(i10, d6.l((TL_iv.RichText) t3Var2.u3.get(Long.valueOf(j10))));
                    } else {
                        h3Var.X(i10, b6.z(aVar3.b));
                    }
                    i10++;
                }
                h3Var.i0(Math.min(indexOf, indexOf2), Math.max(indexOf, indexOf2));
                return;
            case 9:
                ((t3) this.b).d5((String) this.c, (mi.a) this.d);
                return;
            case 10:
                v5 v5Var = (v5) this.b;
                mi.a aVar4 = (mi.a) this.c;
                a6 a6Var = (a6) this.d;
                y5 y5Var = v5Var.a.E;
                if (y5Var != null) {
                    ((d3) y5Var).d(aVar4, a6Var.a, a6Var.b, a6Var.c, a6Var.d, a6Var.e);
                    return;
                }
                return;
            case 11:
                ni.l lVar = (ni.l) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                ArrayList arrayList4 = (ArrayList) this.d;
                lVar.getClass();
                for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                    ((View) arrayList3.get(i13)).setVisibility(0);
                }
                if (lVar.A.removeAll(arrayList4)) {
                    while (i10 < arrayList4.size()) {
                        lVar.d((u4.d1) arrayList4.get(i10));
                        i10++;
                    }
                    lVar.G();
                }
                lVar.K.removeAll(arrayList3);
                return;
            case 12:
                ni.l lVar2 = (ni.l) this.b;
                View view = (View) this.c;
                u4.d1 d1Var = (u4.d1) this.d;
                lVar2.getClass();
                view.setVisibility(0);
                if (lVar2.A.remove(d1Var)) {
                    lVar2.d(d1Var);
                    lVar2.G();
                }
                lVar2.K.remove(view);
                return;
            case 13:
                o4.a0 a0Var = (o4.a0) this.b;
                o4.v vVar2 = (o4.v) this.c;
                KeyEvent keyEvent = (KeyEvent) this.d;
                o4.e0 e0Var = a0Var.b;
                if (e0Var.i(vVar2)) {
                    e0Var.b(keyEvent, false, false);
                } else {
                    o4.o0 o0Var = e0Var.h;
                    p4.r rVar = vVar2.a;
                    rVar.getClass();
                    o0Var.getClass();
                    o0Var.i0(1, new o4.h0(o0Var, 9), rVar, true);
                }
                a0Var.a = null;
                return;
            case 14:
                o4.e0 e0Var2 = (o4.e0) this.b;
                o4.v0 v0Var = (o4.v0) this.c;
                o4.w wVar = (o4.w) this.d;
                if (e0Var2.j()) {
                    return;
                }
                o4.l1 l1Var = e0Var2.t;
                v0Var.getClass();
                xe.b(l1Var, wVar);
                return;
            case 15:
                SpannableString spannableString = (SpannableString) this.b;
                mi.h0 h0Var = (mi.h0) this.c;
                org.telegram.messenger.voip.l0 l0Var = (org.telegram.messenger.voip.l0) this.d;
                oi.k.a(spannableString, spannableString.length(), (com.google.android.gms.internal.play_billing.s0) h0Var.b);
                l0Var.run();
                return;
            case 16:
                SpannableString spannableString2 = (SpannableString) this.b;
                mi.h0 h0Var2 = (mi.h0) this.c;
                w9 w9Var = (w9) this.d;
                oi.k.a(spannableString2, spannableString2.length(), (com.google.android.gms.internal.play_billing.s0) h0Var2.b);
                w9Var.a(spannableString2);
                return;
            case 17:
                ((VideoAds) this.b).lambda$show$3((ac) this.c, (TLRPC.TL_sponsoredMessage) this.d);
                return;
            case 18:
                ((VideoAds) this.b).lambda$show$5((ac) this.c, (boolean[]) this.d);
                return;
            case 19:
                ((VideoPlayerHolderBase) this.b).lambda$release$3((TLRPC.Document) this.c, (Runnable) this.d);
                return;
            case 20:
                ((n10) this.b).a((TLObject) this.c, (TLRPC.TL_error) this.d);
                return;
            case 21:
                ((n10) this.b).a((TLRPC.Updates) this.c, (TLRPC.TL_error) this.d);
                return;
            case 22:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.b;
                d2 d2Var = (d2) this.c;
                d2 d2Var2 = (d2) this.d;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarLayout.K;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (viewGroup = (ViewGroup) actionBarPopupWindow$ActionBarPopupWindowLayout.getParent()) != null) {
                    viewGroup.removeView(actionBarLayout.K);
                }
                if (actionBarLayout.h || actionBarLayout.b0) {
                    actionBarLayout.w.setScaleX(1.0f);
                    actionBarLayout.w.setScaleY(1.0f);
                    actionBarLayout.h = false;
                    actionBarLayout.K = null;
                    actionBarLayout.b0 = false;
                } else {
                    actionBarLayout.w.setTranslationX(0.0f);
                }
                actionBarLayout.m(d2Var);
                d2Var.setRemovingFromStack(false);
                d2Var.onTransitionAnimationEnd(false, true);
                d2Var2.onTransitionAnimationEnd(true, true);
                d2Var2.onBecomeFullyVisible();
                return;
            case 23:
                b3 b3Var = (b3) this.b;
                ((d2) this.c).presentFragment((wm) this.d);
                b3Var.c = false;
                return;
            case 24:
                b3 b3Var2 = (b3) this.b;
                ArrayList arrayList5 = (ArrayList) this.c;
                a3 a3Var = (a3) this.d;
                b3Var2.getClass();
                while (i10 < arrayList5.size()) {
                    if (((y2) arrayList5.get(i10)).a == a3Var) {
                        arrayList5.remove(i10);
                        i10--;
                    }
                    i10++;
                }
                b3Var2.invalidate();
                return;
            case 25:
                j6 j6Var = (j6) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                j6 j6Var2 = (j6) this.d;
                if (!(tLObject3 instanceof TLRPC.TL_wallPaper)) {
                    j6Var.s();
                    return;
                }
                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject3;
                j6Var.h0 = w7.r(null, tL_wallPaper.document);
                hs.f(j6Var.F).b(j6Var, hs.Y1);
                hs.f(j6Var.F).b(j6Var, hs.Z1);
                w7.G(j6Var2.F).X(tL_wallPaper.document, tL_wallPaper, 1, 1);
                return;
            case 26:
                org.telegram.ui.Cells.t0 t0Var2 = (org.telegram.ui.Cells.t0) this.b;
                w5.G0(t0Var2.getContext(), t0Var2.I, (TL_wallet.walletTransaction) this.c, null, null, null, (org.telegram.ui.Cells.m0) this.d, t0Var2.h1);
                return;
            case 27:
                org.telegram.ui.Cells.t0 t0Var3 = (org.telegram.ui.Cells.t0) this.b;
                t0Var3.g1.g0(t0Var3, (TLRPC.TL_premiumGiftOption) this.d, (String) this.c);
                return;
            case 28:
                ga gaVar = (ga) this.b;
                j6 j6Var3 = (j6) this.c;
                j6Var3.f = !j6Var3.d((File) this.d, j6Var3.c);
                org.telegram.messenger.g0.h3(new ea(i3, gaVar, j6Var3));
                return;
            default:
                org.telegram.ui.Components.e0 e0Var3 = (org.telegram.ui.Components.e0) this.b;
                t4.L((Context) this.c, e0Var3.e2, new gi.w5(e0Var3, 29), (e6) this.d);
                return;
        }
    }

    public /* synthetic */ y(Object obj, Object obj2, Object obj3, int i3) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
