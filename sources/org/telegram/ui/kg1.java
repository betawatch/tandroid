package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.location.Address;
import android.location.Geocoder;
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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kg1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kg1(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        org.telegram.ui.web.a1 a1Var;
        org.telegram.ui.web.e0 e0Var;
        org.telegram.ui.web.o0 o0Var;
        int i12;
        int i13;
        int i14;
        int i15 = 2;
        int i16 = 0;
        int i17 = 0;
        int i18 = 1;
        switch (this.a) {
            case 0:
                og1.g0((og1) this.b, (String) this.c);
                break;
            case 1:
                og1 og1Var = (og1) this.b;
                Runnable runnable = (Runnable) this.c;
                for (bs bsVar : og1Var.w.f) {
                    bsVar.l(0.0f);
                }
                runnable.run();
                break;
            case 2:
                ug1 ug1Var = (ug1) this.b;
                TLObject tLObject = (TLObject) this.c;
                ArrayList arrayList = ug1Var.f;
                ArrayList<TLRPC.Chat> arrayList2 = ug1Var.e;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    arrayList2.clear();
                    arrayList2.addAll(((TLRPC.messages_Chats) tLObject).chats);
                }
                MessagesController.getInstance(ug1Var.a).putChats(arrayList2, false);
                ug1Var.d = false;
                ug1Var.c = true;
                int size = arrayList.size();
                while (i17 < size) {
                    Object obj = arrayList.get(i17);
                    i17++;
                    ((Runnable) obj).run();
                }
                arrayList.clear();
                break;
            case 3:
                ai1 ai1Var = (ai1) this.b;
                ai1Var.R.a(new jh1(ai1Var, (VoIPService) this.c, i18), true);
                break;
            case 4:
                ai1 ai1Var2 = (ai1) this.b;
                ValueAnimator valueAnimator = (ValueAnimator) this.c;
                org.telegram.ui.Components.voip.m2.Q = false;
                org.telegram.ui.Components.voip.m2.i();
                ViewPropertyAnimator duration = ai1Var2.H.animate().setDuration(150L);
                org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.f;
                duration.setInterpolator(nrVar).start();
                ai1Var2.E.animate().alpha(1.0f).setDuration(150L).setInterpolator(nrVar).start();
                ai1Var2.F.animate().alpha(1.0f).setDuration(150L).setInterpolator(nrVar).start();
                ai1Var2.K.animate().alpha(1.0f).setDuration(150L).setInterpolator(nrVar).start();
                ai1Var2.U.animate().alpha(1.0f).setDuration(150L).setInterpolator(nrVar).start();
                ai1Var2.g0.animate().alpha(1.0f).setDuration(150L).setInterpolator(nrVar).start();
                ai1Var2.e0.animate().alpha(1.0f).setDuration(350L).setInterpolator(nrVar).start();
                ai1Var2.f0.animate().alpha(1.0f).setDuration(350L).setInterpolator(nrVar).start();
                ai1Var2.J0.animate().alpha(1.0f).setDuration(350L).setInterpolator(nrVar).start();
                valueAnimator.addListener(new oh1(ai1Var2, i15));
                valueAnimator.setDuration(350L);
                valueAnimator.setInterpolator(nrVar);
                valueAnimator.start();
                break;
            case 5:
                ji1 ji1Var = (ji1) this.b;
                int[] iArr = (int[]) this.c;
                ji1Var.getClass();
                int i19 = iArr[0] - 1;
                iArr[0] = i19;
                if (i19 == 0) {
                    WallpapersListActivity wallpapersListActivity = ji1Var.a;
                    int[][] iArr2 = WallpapersListActivity.h0;
                    wallpapersListActivity.B0(true);
                    break;
                }
                break;
            case 6:
                pi1 pi1Var = (pi1) this.b;
                String str = (String) this.c;
                pi1Var.d.clear();
                pi1Var.e.clear();
                pi1Var.f = true;
                pi1Var.F(str, "", true);
                pi1Var.h = str;
                pi1Var.l();
                pi1Var.y = null;
                break;
            case 7:
                pi1 pi1Var2 = (pi1) this.b;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) this.c);
                WallpapersListActivity wallpapersListActivity2 = pi1Var2.B;
                i10 = ((org.telegram.ui.ActionBar.p2) wallpapersListActivity2).currentAccount;
                MessagesController.getInstance(i10).putUsers(tL_contacts_resolvedPeer.users, false);
                i11 = ((org.telegram.ui.ActionBar.p2) wallpapersListActivity2).currentAccount;
                MessagesController.getInstance(i11).putChats(tL_contacts_resolvedPeer.chats, false);
                wallpapersListActivity2.getMessagesStorage().putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = pi1Var2.x;
                pi1Var2.x = null;
                pi1Var2.F(str2, "", false);
                break;
            case 8:
                ui1 ui1Var = (ui1) this.b;
                String str3 = (String) this.c;
                vi1 vi1Var = ui1Var.a;
                Activity parentActivity = vi1Var.getParentActivity();
                MessageObject messageObject = vi1Var.n;
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
                    vi1Var.showDialog(org.telegram.ui.Components.lq0.N0(vi1Var.getParentActivity(), messageObject, null, false, vi1Var.h));
                    break;
                }
                break;
            case 9:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                if (botWebViewContainer$BotWebViewProxy != null && (a1Var = botWebViewContainer$BotWebViewProxy.a) != null && (e0Var = a1Var.c) != null) {
                    e0Var.f(arrayList3);
                    break;
                }
                break;
            case 10:
                ArrayList arrayList4 = (ArrayList) this.b;
                LongSparseArray longSparseArray = (LongSparseArray) this.c;
                org.telegram.ui.web.c1.c.addAll(0, arrayList4);
                for (int i20 = 0; i20 < longSparseArray.size(); i20++) {
                    org.telegram.ui.web.c1.d.put(longSparseArray.keyAt(i20), (org.telegram.ui.web.b1) longSparseArray.valueAt(i20));
                }
                org.telegram.ui.web.c1.b = true;
                org.telegram.ui.web.c1.a = false;
                ArrayList arrayList5 = org.telegram.ui.web.c1.e;
                if (arrayList5 != null) {
                    int size2 = arrayList5.size();
                    while (i16 < size2) {
                        Object obj2 = arrayList5.get(i16);
                        i16++;
                        ((Utilities.Callback) obj2).run(arrayList4);
                    }
                    org.telegram.ui.web.c1.e = null;
                    break;
                }
                break;
            case 11:
                org.telegram.ui.web.d1 d1Var = (org.telegram.ui.web.d1) this.b;
                ArrayList arrayList6 = (ArrayList) this.c;
                org.telegram.ui.web.e1 e1Var = d1Var.h;
                ArrayList arrayList7 = e1Var.f;
                arrayList7.clear();
                arrayList7.addAll(arrayList6);
                e1Var.h = false;
                org.telegram.ui.Components.a61 a61Var = e1Var.a;
                if (a61Var != null) {
                    a61Var.V2.N(true);
                    break;
                }
                break;
            case 12:
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.b;
                g1Var.setEnabled(((org.telegram.ui.web.e2) this.c).b() != null);
                g1Var.animate().alpha(g1Var.isEnabled() ? 1.0f : 0.5f);
                break;
            case 13:
                ((m0) this.b).c0.run((Integer) this.c);
                break;
            case 14:
                org.telegram.ui.web.x1 x1Var = (org.telegram.ui.web.x1) this.b;
                x1Var.getMessagesController().removeWebBrowserException((String) this.c);
                x1Var.a.V2.N(true);
                break;
            case 15:
                org.telegram.ui.web.e2 e2Var = (org.telegram.ui.web.e2) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                int i21 = e2Var.a;
                e2Var.g = true;
                if (tLObject2 instanceof TLRPC.TL_messages_webPage) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject2;
                    MessagesController.getInstance(i21).putUsers(tL_messages_webPage.users, false);
                    MessagesController.getInstance(i21).putChats(tL_messages_webPage.chats, false);
                    e2Var.h = tL_messages_webPage.webpage;
                } else {
                    if (tLObject2 instanceof TLRPC.TL_webPage) {
                        TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) tLObject2;
                        if (tL_webPage.cached_page instanceof TL_iv.TL_page) {
                            e2Var.h = tL_webPage;
                        }
                    }
                    e2Var.h = null;
                }
                TLRPC.WebPage webPage = e2Var.h;
                if (webPage != null && webPage.cached_page == null) {
                    e2Var.h = null;
                }
                if (!SharedConfig.onlyLocalInstantView && e2Var.h != null && (o0Var = e2Var.l) != null) {
                    o0Var.run();
                }
                e2Var.c();
                break;
            case 16:
                ((org.telegram.ui.web.e2) this.b).m.remove((kg1) this.c);
                break;
            case 17:
                ph.d dVar = (ph.d) this.b;
                org.telegram.ui.Cells.g gVar = (org.telegram.ui.Cells.g) this.c;
                int i22 = dVar.C - 1;
                dVar.C = i22;
                dVar.c(i22, true);
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
                ph.g1 g1Var2 = (ph.g1) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                ph.i1 i1Var = g1Var2.s;
                if (tLObject3 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer2 = (TLRPC.TL_contacts_resolvedPeer) tLObject3;
                    ph.y1 y1Var = i1Var.r;
                    i12 = ((org.telegram.ui.ActionBar.g3) y1Var).currentAccount;
                    MessagesController.getInstance(i12).putUsers(tL_contacts_resolvedPeer2.users, false);
                    i13 = ((org.telegram.ui.ActionBar.g3) y1Var).currentAccount;
                    MessagesController.getInstance(i13).putChats(tL_contacts_resolvedPeer2.chats, false);
                    i14 = ((org.telegram.ui.ActionBar.g3) y1Var).currentAccount;
                    MessagesStorage.getInstance(i14).putUsersAndChats(tL_contacts_resolvedPeer2.users, tL_contacts_resolvedPeer2.chats, true, true);
                }
                g1Var2.n = true;
                g1Var2.G();
                break;
            case 20:
                ((ph.d2) this.b).e(0.0f, 240L, (Runnable) this.c);
                break;
            case 21:
                ph.c5 c5Var = (ph.c5) this.b;
                View view = (View) this.c;
                c5Var.getClass();
                if (view instanceof dg.j) {
                    dg.j jVar = (dg.j) view;
                    jVar.m();
                    c5Var.D0(jVar, true);
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
                ph.l5.a((ph.l5) this.b, (ph.u6) this.c);
                break;
            case 25:
                l7.w0 w0Var = (l7.w0) this.b;
                ph.u6 u6Var = (ph.u6) this.c;
                ph.l5 l5Var = (ph.l5) w0Var.d;
                Bitmap bitmap = l5Var.a;
                if (bitmap != null) {
                    bitmap.recycle();
                    if (u6Var.M0 == l5Var.a) {
                        u6Var.M0 = null;
                    }
                    l5Var.a = null;
                    l5Var.invalidate();
                    break;
                }
                break;
            case 26:
                ph.p5 p5Var = (ph.p5) this.b;
                Context context = (Context) this.c;
                AtomicReference atomicReference = p5Var.a;
                com.google.android.gms.internal.vision.x1 x1Var2 = new com.google.android.gms.internal.vision.x1();
                x1Var2.a = 256;
                atomicReference.set(new f8.n(new com.google.android.gms.internal.vision.t2(context, x1Var2)));
                p5Var.a(p5Var.f);
                break;
            case 27:
                ((ph.p5) this.b).c.run((ph.n5) this.c);
                break;
            case 28:
                ph.n nVar = (ph.n) this.b;
                dg.b3 b3Var = (dg.b3) this.c;
                ph.x5 x5Var = nVar.a;
                if (b3Var.getWidth() <= 0) {
                    x5Var.animate().scaleX(0.0f).scaleY(1.0f).withEndAction(new org.telegram.ui.web.o0(nVar, 22)).start();
                    break;
                } else {
                    float width = b3Var.getWidth() / x5Var.getWidth();
                    ValueAnimator valueAnimator2 = nVar.w;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    nVar.w = ValueAnimator.ofFloat(0.0f, 1.0f);
                    nVar.w.addUpdateListener(new ph.w5(nVar, x5Var.getScaleX(), width, ((b3Var.getWidth() / 2.0f) + b3Var.getX()) - ((x5Var.getWidth() / 2.0f) + x5Var.getX()), ((b3Var.getHeight() / 2.0f) + b3Var.getY()) - ((x5Var.getHeight() / 2.0f) + x5Var.getY()), 0));
                    nVar.w.addListener(new org.telegram.ui.Components.ex0(17, nVar, b3Var));
                    nVar.w.setDuration(320L);
                    nVar.w.setInterpolator(org.telegram.ui.Components.nr.h);
                    nVar.v = b3Var;
                    nVar.w.start();
                    break;
                }
            default:
                ph.m6 m6Var = (ph.m6) this.b;
                ArrayList arrayList8 = (ArrayList) this.c;
                m6Var.I0 = false;
                m6Var.Y.addAll(arrayList8);
                m6Var.n0.N(true);
                break;
        }
    }
}
