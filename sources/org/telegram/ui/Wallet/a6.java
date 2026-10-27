package org.telegram.ui.Wallet;

import a8.ng;
import android.app.Activity;
import android.app.job.JobParameters;
import android.graphics.RectF;
import android.net.Uri;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.car.app.hardware.common.CarResultStub;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.wc;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.ai1;
import org.telegram.ui.bh1;
import org.telegram.ui.gi1;
import org.telegram.ui.oi1;
import org.telegram.ui.pi1;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a6(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        r2.c cVar = (r2.c) this.b;
        a6 a6Var = (a6) this.c;
        cVar.c.N();
        r2.f fVar = cVar.b;
        synchronized (fVar.a) {
            fVar.b();
            a6Var.run();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        org.telegram.ui.web.a1 a1Var;
        org.telegram.ui.web.g0 g0Var;
        org.telegram.ui.web.h1 h1Var;
        ra.a aVar;
        int i12 = 4;
        int i13 = 0;
        switch (this.a) {
            case 0:
                ((ViewGroup) this.c).removeView(((e6) this.b).h);
                return;
            case 1:
                ((Utilities.Callback) this.b).run((TL_wallet.walletTransaction) this.c);
                return;
            case 2:
                t7 t7Var = (t7) this.b;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.c;
                if (t7Var.a1 || userFull == null) {
                    return;
                }
                TL_wallet.card cardVar = userFull.wallet_card;
                if (cardVar == null) {
                    cardVar = new TL_wallet.card();
                }
                t7Var.d(cardVar);
                return;
            case 3:
                w7 w7Var = (w7) this.b;
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) this.c;
                if ((r2Var instanceof m5) && wc.a(r2Var)) {
                    wc.b0(r2Var).M(LocaleController.getString(R.string.WalletImported), LocaleController.getString(R.string.WalletImportedInfo), R.raw.contact_check).j();
                }
                w7Var.finishFragment();
                return;
            case 4:
                h8 h8Var = (h8) this.b;
                ((p0) this.c).B();
                h8Var.a.g3.O(true);
                return;
            case 5:
                h8 h8Var2 = (h8) this.b;
                l0 l0Var = (l0) this.c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h8Var2.getParentActivity(), 0, h8Var2.getResourceProvider());
                alertDialog$Builder.a.R = LocaleController.getString(R.string.WalletDisableBackupTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.WalletDisableBackupExistingPhraseInfo);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.WalletDisable), new bh1(i12, h8Var2, l0Var));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                return;
            case 6:
                org.telegram.ui.ActionBar.e2[] e2VarArr = (org.telegram.ui.ActionBar.e2[]) this.b;
                Runnable runnable = (Runnable) this.c;
                e2VarArr[0].dismiss();
                runnable.run();
                return;
            case 7:
                ((ViewGroup) this.c).removeView(((v9) this.b).h);
                return;
            case 8:
                ai1 ai1Var = (ai1) this.b;
                int[] iArr = (int[]) this.c;
                ai1Var.getClass();
                int i14 = iArr[0] - 1;
                iArr[0] = i14;
                if (i14 == 0) {
                    WallpapersListActivity wallpapersListActivity = ai1Var.a;
                    int[][] iArr2 = WallpapersListActivity.g0;
                    wallpapersListActivity.C0(true);
                    return;
                }
                return;
            case 9:
                gi1 gi1Var = (gi1) this.b;
                String str = (String) this.c;
                gi1Var.d.clear();
                gi1Var.e.clear();
                gi1Var.f = true;
                gi1Var.F(str, "", true);
                gi1Var.h = str;
                gi1Var.l();
                gi1Var.y = null;
                return;
            case 10:
                gi1 gi1Var2 = (gi1) this.b;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) this.c);
                WallpapersListActivity wallpapersListActivity2 = gi1Var2.E;
                i10 = ((org.telegram.ui.ActionBar.r2) wallpapersListActivity2).currentAccount;
                MessagesController.getInstance(i10).putUsers(tL_contacts_resolvedPeer.users, false);
                i11 = ((org.telegram.ui.ActionBar.r2) wallpapersListActivity2).currentAccount;
                MessagesController.getInstance(i11).putChats(tL_contacts_resolvedPeer.chats, false);
                wallpapersListActivity2.getMessagesStorage().putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = gi1Var2.x;
                gi1Var2.x = null;
                gi1Var2.F(str2, "", false);
                return;
            case 11:
                oi1 oi1Var = (oi1) this.b;
                String str3 = (String) this.c;
                pi1 pi1Var = oi1Var.a;
                Activity parentActivity = pi1Var.getParentActivity();
                MessageObject messageObject = pi1Var.n;
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
                pi1Var.showDialog(nr0.P0(pi1Var.getParentActivity(), messageObject, null, false, pi1Var.h));
                return;
            case 12:
                org.telegram.ui.web.a1 a1Var2 = (org.telegram.ui.web.a1) this.b;
                di.x7 x7Var = (di.x7) this.c;
                hi.y yVar = a1Var2.j0;
                yVar.f = true;
                yVar.k();
                a1Var2.v(x7Var);
                return;
            case 13:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                if (botWebViewContainer$BotWebViewProxy == null || (a1Var = botWebViewContainer$BotWebViewProxy.a) == null || (g0Var = a1Var.c) == null) {
                    return;
                }
                g0Var.f(arrayList);
                return;
            case 14:
                ArrayList arrayList2 = (ArrayList) this.b;
                LongSparseArray longSparseArray = (LongSparseArray) this.c;
                org.telegram.ui.web.c1.c.addAll(0, arrayList2);
                for (int i15 = 0; i15 < longSparseArray.size(); i15++) {
                    org.telegram.ui.web.c1.d.put(longSparseArray.keyAt(i15), (org.telegram.ui.web.b1) longSparseArray.valueAt(i15));
                }
                org.telegram.ui.web.c1.b = true;
                org.telegram.ui.web.c1.a = false;
                ArrayList arrayList3 = org.telegram.ui.web.c1.e;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    while (i13 < size) {
                        Object obj = arrayList3.get(i13);
                        i13++;
                        ((Utilities.Callback) obj).run(arrayList2);
                    }
                    org.telegram.ui.web.c1.e = null;
                    return;
                }
                return;
            case 15:
                org.telegram.ui.web.e1 e1Var = (org.telegram.ui.web.e1) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                org.telegram.ui.web.f1 f1Var = e1Var.b;
                ArrayList arrayList5 = f1Var.h;
                arrayList5.clear();
                arrayList5.addAll(arrayList4);
                f1Var.n = false;
                m71 m71Var = f1Var.a;
                if (m71Var != null) {
                    m71Var.g3.O(true);
                    return;
                }
                return;
            case 16:
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.b;
                g1Var.setEnabled(((org.telegram.ui.web.f2) this.c).b() != null);
                g1Var.animate().alpha(g1Var.isEnabled() ? 1.0f : 0.5f);
                return;
            case 17:
                ((org.telegram.ui.l0) this.b).f0.run((Integer) this.c);
                return;
            case 18:
                org.telegram.ui.web.y1 y1Var = (org.telegram.ui.web.y1) this.b;
                y1Var.getMessagesController().removeWebBrowserException((String) this.c);
                y1Var.a.g3.O(true);
                return;
            case 19:
                org.telegram.ui.web.f2 f2Var = (org.telegram.ui.web.f2) this.b;
                TLObject tLObject = (TLObject) this.c;
                int i16 = f2Var.a;
                f2Var.g = true;
                if (tLObject instanceof TLRPC.TL_messages_webPage) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                    MessagesController.getInstance(i16).putUsers(tL_messages_webPage.users, false);
                    MessagesController.getInstance(i16).putChats(tL_messages_webPage.chats, false);
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
                if (!SharedConfig.onlyLocalInstantView && f2Var.h != null && (h1Var = f2Var.l) != null) {
                    h1Var.run();
                }
                f2Var.c();
                return;
            case 20:
                ((org.telegram.ui.web.f2) this.b).m.remove((a6) this.c);
                return;
            case 21:
                p2.b bVar = (p2.b) this.b;
                Uri uri = (Uri) this.c;
                bVar.s = false;
                bVar.b(uri);
                return;
            case 22:
                pe.b bVar2 = (pe.b) this.b;
                View view = (View) this.c;
                pe.a aVar2 = bVar2.a;
                if ((bVar2.c & 2) != 0) {
                    if (!aVar2.onLongPressRequestedAt(view, bVar2.d, bVar2.e)) {
                        bVar2.c |= 8;
                        return;
                    }
                    bVar2.c &= -3;
                    bVar2.b = null;
                    float f7 = bVar2.d;
                    float f10 = bVar2.e;
                    bVar2.f = f7;
                    bVar2.g = f10;
                    if (aVar2.ignoreHapticFeedbackSettings(f7, f10)) {
                        boolean forceEnableVibration = aVar2.forceEnableVibration();
                        if (view != null) {
                            view.performHapticFeedback(0, forceEnableVibration ? 2 : 0);
                        }
                    } else {
                        view.performHapticFeedback(0);
                    }
                    bVar2.c = (4 | bVar2.c) & (-11);
                    bVar2.b = null;
                    return;
                }
                return;
            case 23:
                CarResultStub.lambda$notifyResults$1((Map.Entry) this.b, this.c);
                return;
            case 24:
                a();
                return;
            case 25:
                r2.r rVar = (r2.r) this.b;
                rVar.T.set(rVar.w((n4.s) this.c, rVar.N, 0));
                return;
            case 26:
                rg.q0 q0Var = (rg.q0) this.b;
                rg.x0 x0Var = (rg.x0) this.c;
                q0Var.v = true;
                ByteBuffer byteBuffer = (ByteBuffer) q0Var.h(q0Var.f(), true, false, false).c;
                RectF f11 = q0Var.f();
                Object obj2 = q0Var.a.b;
                q0Var.w = new ng(byteBuffer, 0, f11);
                q0Var.a(false);
                x0Var.run();
                return;
            case 27:
                rg.c1 c1Var = (rg.c1) this.b;
                Runnable runnable2 = (Runnable) this.c;
                rg.a1 a1Var3 = c1Var.d;
                if (a1Var3 == null || !a1Var3.f) {
                    return;
                }
                rg.a1.b(a1Var3);
                runnable2.run();
                return;
            case 28:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.b;
                JobParameters jobParameters = (JobParameters) this.c;
                int i17 = JobInfoSchedulerService.a;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            default:
                s9.q qVar = (s9.q) this.b;
                ra.b bVar3 = (ra.b) this.c;
                if (qVar.b != s9.q.d) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized (qVar) {
                    aVar = qVar.a;
                    qVar.a = null;
                    qVar.b = bVar3;
                }
                aVar.i(bVar3);
                return;
        }
    }
}
