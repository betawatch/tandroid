package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.location.Address;
import android.location.Geocoder;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mg1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mg1(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        org.telegram.ui.web.a1 a1Var;
        org.telegram.ui.web.f0 f0Var;
        org.telegram.ui.web.s0 s0Var;
        int i12;
        int i13;
        int i14;
        int i15 = 2;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 1;
        switch (this.a) {
            case 0:
                qg1 qg1Var = (qg1) this.b;
                Runnable runnable = (Runnable) this.c;
                for (cs csVar : qg1Var.w.f) {
                    csVar.l(0.0f);
                }
                runnable.run();
                break;
            case 1:
                wg1 wg1Var = (wg1) this.b;
                TLObject tLObject = (TLObject) this.c;
                ArrayList arrayList = wg1Var.f;
                ArrayList<TLRPC.Chat> arrayList2 = wg1Var.e;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    arrayList2.clear();
                    arrayList2.addAll(((TLRPC.messages_Chats) tLObject).chats);
                }
                MessagesController.getInstance(wg1Var.a).putChats(arrayList2, false);
                wg1Var.d = false;
                wg1Var.c = true;
                int size = arrayList.size();
                while (i18 < size) {
                    Object obj = arrayList.get(i18);
                    i18++;
                    ((Runnable) obj).run();
                }
                arrayList.clear();
                break;
            case 2:
                ci1 ci1Var = (ci1) this.b;
                ci1Var.R.a(new lh1(ci1Var, (VoIPService) this.c, i19), true);
                break;
            case 3:
                ci1 ci1Var2 = (ci1) this.b;
                ValueAnimator valueAnimator = (ValueAnimator) this.c;
                org.telegram.ui.Components.voip.n2.Q = false;
                org.telegram.ui.Components.voip.n2.i();
                ViewPropertyAnimator duration = ci1Var2.H.animate().setDuration(150L);
                org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.f;
                duration.setInterpolator(prVar).start();
                ci1Var2.E.animate().alpha(1.0f).setDuration(150L).setInterpolator(prVar).start();
                ci1Var2.F.animate().alpha(1.0f).setDuration(150L).setInterpolator(prVar).start();
                ci1Var2.K.animate().alpha(1.0f).setDuration(150L).setInterpolator(prVar).start();
                ci1Var2.U.animate().alpha(1.0f).setDuration(150L).setInterpolator(prVar).start();
                ci1Var2.g0.animate().alpha(1.0f).setDuration(150L).setInterpolator(prVar).start();
                ci1Var2.e0.animate().alpha(1.0f).setDuration(350L).setInterpolator(prVar).start();
                ci1Var2.f0.animate().alpha(1.0f).setDuration(350L).setInterpolator(prVar).start();
                ci1Var2.J0.animate().alpha(1.0f).setDuration(350L).setInterpolator(prVar).start();
                valueAnimator.addListener(new qh1(ci1Var2, i15));
                valueAnimator.setDuration(350L);
                valueAnimator.setInterpolator(prVar);
                valueAnimator.start();
                break;
            case 4:
                mi1 mi1Var = (mi1) this.b;
                int[] iArr = (int[]) this.c;
                mi1Var.getClass();
                int i20 = iArr[0] - 1;
                iArr[0] = i20;
                if (i20 == 0) {
                    WallpapersListActivity wallpapersListActivity = mi1Var.a;
                    int[][] iArr2 = WallpapersListActivity.h0;
                    wallpapersListActivity.B0(true);
                    break;
                }
                break;
            case 5:
                si1 si1Var = (si1) this.b;
                String str = (String) this.c;
                si1Var.d.clear();
                si1Var.e.clear();
                si1Var.f = true;
                si1Var.F(str, "", true);
                si1Var.h = str;
                si1Var.l();
                si1Var.y = null;
                break;
            case 6:
                si1 si1Var2 = (si1) this.b;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) this.c);
                WallpapersListActivity wallpapersListActivity2 = si1Var2.B;
                i10 = ((org.telegram.ui.ActionBar.p2) wallpapersListActivity2).currentAccount;
                MessagesController.getInstance(i10).putUsers(tL_contacts_resolvedPeer.users, false);
                i11 = ((org.telegram.ui.ActionBar.p2) wallpapersListActivity2).currentAccount;
                MessagesController.getInstance(i11).putChats(tL_contacts_resolvedPeer.chats, false);
                wallpapersListActivity2.getMessagesStorage().putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = si1Var2.x;
                si1Var2.x = null;
                si1Var2.F(str2, "", false);
                break;
            case 7:
                xi1 xi1Var = (xi1) this.b;
                String str3 = (String) this.c;
                yi1 yi1Var = xi1Var.a;
                Activity parentActivity = yi1Var.getParentActivity();
                MessageObject messageObject = yi1Var.n;
                if (parentActivity != null) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d(str3);
                    }
                    str3.getClass();
                    if (str3.equals("share_game")) {
                        messageObject.messageOwner.with_my_score = false;
                    } else if (str3.equals("share_score")) {
                        messageObject.messageOwner.with_my_score = true;
                    }
                    yi1Var.showDialog(org.telegram.ui.Components.mq0.N0(yi1Var.getParentActivity(), messageObject, null, false, yi1Var.h));
                    break;
                }
                break;
            case 8:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                if (botWebViewContainer$BotWebViewProxy != null && (a1Var = botWebViewContainer$BotWebViewProxy.a) != null && (f0Var = a1Var.c) != null) {
                    f0Var.f(arrayList3);
                    break;
                }
                break;
            case 9:
                ArrayList arrayList4 = (ArrayList) this.b;
                LongSparseArray longSparseArray = (LongSparseArray) this.c;
                org.telegram.ui.web.c1.c.addAll(0, arrayList4);
                for (int i21 = 0; i21 < longSparseArray.size(); i21++) {
                    org.telegram.ui.web.c1.d.put(longSparseArray.keyAt(i21), (org.telegram.ui.web.b1) longSparseArray.valueAt(i21));
                }
                org.telegram.ui.web.c1.b = true;
                org.telegram.ui.web.c1.a = false;
                ArrayList arrayList5 = org.telegram.ui.web.c1.e;
                if (arrayList5 != null) {
                    int size2 = arrayList5.size();
                    while (i17 < size2) {
                        Object obj2 = arrayList5.get(i17);
                        i17++;
                        ((Utilities.Callback) obj2).run(arrayList4);
                    }
                    org.telegram.ui.web.c1.e = null;
                    break;
                }
                break;
            case 10:
                org.telegram.ui.web.e1 e1Var = (org.telegram.ui.web.e1) this.b;
                ArrayList arrayList6 = (ArrayList) this.c;
                org.telegram.ui.web.f1 f1Var = e1Var.h;
                ArrayList arrayList7 = f1Var.f;
                arrayList7.clear();
                arrayList7.addAll(arrayList6);
                f1Var.h = false;
                org.telegram.ui.Components.b61 b61Var = f1Var.a;
                if (b61Var != null) {
                    b61Var.V2.N(true);
                    break;
                }
                break;
            case 11:
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.b;
                g1Var.setEnabled(((org.telegram.ui.web.f2) this.c).b() != null);
                g1Var.animate().alpha(g1Var.isEnabled() ? 1.0f : 0.5f);
                break;
            case 12:
                ((m0) this.b).c0.run((Integer) this.c);
                break;
            case 13:
                org.telegram.ui.web.y1 y1Var = (org.telegram.ui.web.y1) this.b;
                y1Var.getMessagesController().removeWebBrowserException((String) this.c);
                y1Var.a.V2.N(true);
                break;
            case 14:
                org.telegram.ui.web.f2 f2Var = (org.telegram.ui.web.f2) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                int i22 = f2Var.a;
                f2Var.g = true;
                if (tLObject2 instanceof TLRPC.TL_messages_webPage) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject2;
                    MessagesController.getInstance(i22).putUsers(tL_messages_webPage.users, false);
                    MessagesController.getInstance(i22).putChats(tL_messages_webPage.chats, false);
                    f2Var.h = tL_messages_webPage.webpage;
                } else {
                    if (tLObject2 instanceof TLRPC.TL_webPage) {
                        TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) tLObject2;
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
                if (!SharedConfig.onlyLocalInstantView && f2Var.h != null && (s0Var = f2Var.l) != null) {
                    s0Var.run();
                }
                f2Var.c();
                break;
            case 15:
                ((org.telegram.ui.web.f2) this.b).m.remove((mg1) this.c);
                break;
            case 16:
                ph.p pVar = (ph.p) this.b;
                String str4 = (String) this.c;
                ArrayList arrayList8 = pVar.f;
                while (true) {
                    if (i16 >= arrayList8.size()) {
                        i16 = -1;
                    } else if (!TextUtils.equals(((oh.d6) arrayList8.get(i16)).E, str4)) {
                        i16++;
                    }
                }
                if (i16 >= 0) {
                    pVar.r.d(str4.hashCode(), i16 + 1);
                    break;
                }
                break;
            case 17:
                qh.d dVar = (qh.d) this.b;
                org.telegram.ui.Cells.g gVar = (org.telegram.ui.Cells.g) this.c;
                int i23 = dVar.C - 1;
                dVar.C = i23;
                dVar.c(i23, true);
                if (dVar.C > 0) {
                    AndroidUtilities.runOnUIThread(dVar.D, 1000L);
                    break;
                } else {
                    dVar.setClickable(true);
                    gVar.run();
                    break;
                }
            case 18:
                ((Utilities.Callback) this.b).run((ArrayList) this.c);
                break;
            case 19:
                qh.g1 g1Var2 = (qh.g1) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                qh.i1 i1Var = g1Var2.s;
                if (tLObject3 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer2 = (TLRPC.TL_contacts_resolvedPeer) tLObject3;
                    qh.y1 y1Var2 = i1Var.r;
                    i12 = ((org.telegram.ui.ActionBar.h3) y1Var2).currentAccount;
                    MessagesController.getInstance(i12).putUsers(tL_contacts_resolvedPeer2.users, false);
                    i13 = ((org.telegram.ui.ActionBar.h3) y1Var2).currentAccount;
                    MessagesController.getInstance(i13).putChats(tL_contacts_resolvedPeer2.chats, false);
                    i14 = ((org.telegram.ui.ActionBar.h3) y1Var2).currentAccount;
                    MessagesStorage.getInstance(i14).putUsersAndChats(tL_contacts_resolvedPeer2.users, tL_contacts_resolvedPeer2.chats, true, true);
                }
                g1Var2.n = true;
                g1Var2.G();
                break;
            case 20:
                ((qh.d2) this.b).e(0.0f, 240L, (Runnable) this.c);
                break;
            case 21:
                qh.b5 b5Var = (qh.b5) this.b;
                View view = (View) this.c;
                b5Var.getClass();
                if (view instanceof eg.j) {
                    eg.j jVar = (eg.j) view;
                    jVar.m();
                    b5Var.D0(jVar, true);
                    break;
                }
                break;
            case 22:
                TLRPC.MessageMedia messageMedia = (TLRPC.MessageMedia) this.b;
                TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint = (TL_stories.TL_mediaAreaGeoPoint) this.c;
                try {
                    List<Address> fromLocationName = new Geocoder(ApplicationLoader.applicationContext, LocaleController.getInstance().getCurrentLocale()).getFromLocationName(messageMedia.title, 1);
                    if (fromLocationName.size() <= 0) {
                        break;
                    } else {
                        tL_mediaAreaGeoPoint.geo.lat = fromLocationName.get(0).getLatitude();
                        tL_mediaAreaGeoPoint.geo._long = fromLocationName.get(0).getLongitude();
                        break;
                    }
                } catch (Exception unused) {
                    return;
                }
            case 23:
                ((Utilities.Callback) this.b).run((Bitmap) this.c);
                break;
            case 24:
                qh.j5.a((qh.j5) this.b, (qh.s6) this.c);
                break;
            case 25:
                l7.w0 w0Var = (l7.w0) this.b;
                qh.s6 s6Var = (qh.s6) this.c;
                qh.j5 j5Var = (qh.j5) w0Var.d;
                Bitmap bitmap = j5Var.a;
                if (bitmap != null) {
                    bitmap.recycle();
                    if (s6Var.M0 == j5Var.a) {
                        s6Var.M0 = null;
                    }
                    j5Var.a = null;
                    j5Var.invalidate();
                    break;
                }
                break;
            case 26:
                qh.n5 n5Var = (qh.n5) this.b;
                Context context = (Context) this.c;
                AtomicReference atomicReference = n5Var.a;
                com.google.android.gms.internal.vision.x1 x1Var = new com.google.android.gms.internal.vision.x1();
                x1Var.a = 256;
                atomicReference.set(new f8.n(new com.google.android.gms.internal.vision.t2(context, x1Var)));
                n5Var.a(n5Var.f);
                break;
            case 27:
                ((qh.n5) this.b).c.run((qh.l5) this.c);
                break;
            case 28:
                qh.n nVar = (qh.n) this.b;
                eg.z2 z2Var = (eg.z2) this.c;
                qh.v5 v5Var = nVar.a;
                if (z2Var.getWidth() <= 0) {
                    v5Var.animate().scaleX(0.0f).scaleY(1.0f).withEndAction(new org.telegram.ui.web.s0(nVar, 23)).start();
                    break;
                } else {
                    float width = z2Var.getWidth() / v5Var.getWidth();
                    ValueAnimator valueAnimator2 = nVar.w;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    nVar.w = ValueAnimator.ofFloat(0.0f, 1.0f);
                    nVar.w.addUpdateListener(new qh.u5(nVar, v5Var.getScaleX(), width, ((z2Var.getWidth() / 2.0f) + z2Var.getX()) - ((v5Var.getWidth() / 2.0f) + v5Var.getX()), ((z2Var.getHeight() / 2.0f) + z2Var.getY()) - ((v5Var.getHeight() / 2.0f) + v5Var.getY()), 0));
                    nVar.w.addListener(new org.telegram.ui.Components.fx0(17, nVar, z2Var));
                    nVar.w.setDuration(320L);
                    nVar.w.setInterpolator(org.telegram.ui.Components.pr.h);
                    nVar.v = z2Var;
                    nVar.w.start();
                    break;
                }
            default:
                qh.k6 k6Var = (qh.k6) this.b;
                ArrayList arrayList9 = (ArrayList) this.c;
                k6Var.I0 = false;
                k6Var.Y.addAll(arrayList9);
                k6Var.n0.N(true);
                break;
        }
    }
}
