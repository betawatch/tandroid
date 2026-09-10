package gg;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import hi.a6;
import hi.d6;
import hi.f6;
import hi.g6;
import hi.h3;
import hi.i6;
import hi.m3;
import hi.r5;
import hi.z3;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.n3;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.ActionBar.p3;
import org.telegram.ui.ActionBar.q3;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Cells.ra;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.j8;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wc;
import org.telegram.ui.eo;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class a0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a0(ViewGroup viewGroup, Object obj, String str, int i10) {
        this.a = i10;
        this.b = viewGroup;
        this.d = obj;
        this.c = str;
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, n2.k] */
    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        int i10 = this.a;
        int i11 = 8;
        int i12 = 0;
        Object obj = this.d;
        ?? r82 = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                b0 b0Var = (b0) obj2;
                TL_account.deleteBusinessChatLink deletebusinesschatlink = new TL_account.deleteBusinessChatLink();
                deletebusinesschatlink.slug = (String) r82;
                ConnectionsManager.getInstance(b0Var.a).sendRequest(deletebusinesschatlink, new bi.o2(i11, b0Var, (TL_account.TL_businessChatLink) obj));
                break;
            case 1:
                p0.P((p0) obj2, (TL_account.TL_connectedBot) r82, (TL_account.TL_businessBotRecipients) obj);
                break;
            case 2:
                a1 a1Var = (a1) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) r82;
                TLObject tLObject = (TLObject) obj;
                if (tL_error != null) {
                    a1Var.a.a(0.0f);
                    wc.b0(tL_error);
                    break;
                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                    a1Var.a.a(0.0f);
                    org.telegram.messenger.a2.p(R.string.UnknownError, wc.a0(a1Var), null);
                    break;
                } else {
                    a1Var.finishFragment();
                    break;
                }
            case 3:
                m1.U((m1) obj2, (TLRPC.TL_error) r82, (TLObject) obj);
                break;
            case 4:
                o2 o2Var = (o2) obj2;
                TLObject tLObject2 = (TLObject) r82;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                ArrayList arrayList = o2Var.d;
                if (tLObject2 instanceof TLRPC.TL_help_timezonesList) {
                    arrayList.clear();
                    arrayList.addAll(((TLRPC.TL_help_timezonesList) tLObject2).timezones);
                    SerializedData serializedData = new SerializedData(tLObject2.getObjectSize());
                    tLObject2.serializeToStream(serializedData);
                    sharedPreferences.edit().putString("timezones", Utilities.bytesToHex(serializedData.toByteArray())).apply();
                    NotificationCenter.getInstance(o2Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.timezonesUpdated, new Object[0]);
                }
                o2Var.c = true;
                o2Var.b = false;
                break;
            case 5:
                z3 z3Var = (z3) obj2;
                r5 r5Var = (r5) obj;
                if (z3Var.j4 == ((w70) r82)) {
                    z3Var.j4 = null;
                    if (z3Var.C3 && z3Var.i4 == r5Var && !r5Var.H.isEmpty()) {
                        z3Var.L2();
                        break;
                    }
                }
                break;
            case 6:
                z3 z3Var2 = (z3) obj2;
                hi.a aVar = (hi.a) r82;
                hi.a aVar2 = (hi.a) obj;
                ArrayList arrayList2 = z3Var2.p4;
                m3 m3Var = z3Var2.n3;
                if (m3Var != null && aVar != null && aVar2 != null) {
                    int indexOf = arrayList2.indexOf(aVar);
                    int indexOf2 = arrayList2.indexOf(aVar2);
                    if (indexOf >= 0 && indexOf2 >= 0) {
                        while (i12 < arrayList2.size()) {
                            hi.a aVar3 = (hi.a) arrayList2.get(i12);
                            long j3 = aVar3.t;
                            if (j3 != 0) {
                                m3Var.Y(i12, i6.l((TL_iv.RichText) z3Var2.m3.get(Long.valueOf(j3))));
                            } else {
                                m3Var.Y(i12, g6.z(aVar3.b));
                            }
                            i12++;
                        }
                        m3Var.j0(Math.min(indexOf, indexOf2), Math.max(indexOf, indexOf2));
                        break;
                    }
                }
                break;
            case 7:
                ((z3) obj2).Y4((hi.a) obj, (String) r82);
                break;
            case 8:
                hi.a aVar4 = (hi.a) r82;
                f6 f6Var = (f6) obj;
                d6 d6Var = ((a6) obj2).a.y;
                if (d6Var != null) {
                    ((h3) d6Var).d(aVar4, f6Var.a, f6Var.b, f6Var.c, f6Var.d, f6Var.e);
                    break;
                }
                break;
            case 9:
                u2.g0 g0Var = (u2.g0) obj;
                j2.e eVar = ((i2.u0) obj2).c;
                e9.a1 i13 = ((e9.f0) r82).i();
                com.google.firebase.messaging.n nVar = eVar.d;
                b2.b1 b1Var = eVar.h;
                b1Var.getClass();
                nVar.getClass();
                nVar.b = e9.i0.v(i13);
                if (!i13.isEmpty()) {
                    nVar.e = (u2.g0) i13.get(0);
                    g0Var.getClass();
                    nVar.f = g0Var;
                }
                if (((u2.g0) nVar.d) == null) {
                    nVar.d = com.google.firebase.messaging.n.p(b1Var, (e9.i0) nVar.b, (u2.g0) nVar.e, (b2.h1) nVar.a);
                }
                nVar.H(b1Var.w0());
                break;
            case 10:
                Pair pair = (Pair) r82;
                ((i2.b1) obj2).b.h.b(((Integer) pair.first).intValue(), (u2.g0) pair.second, (Exception) obj);
                break;
            case 11:
                ii.n nVar2 = (ii.n) obj2;
                ArrayList arrayList3 = (ArrayList) r82;
                ArrayList arrayList4 = (ArrayList) obj;
                nVar2.getClass();
                for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                    ((View) arrayList3.get(i14)).setVisibility(0);
                }
                if (nVar2.A.removeAll(arrayList4)) {
                    while (i12 < arrayList4.size()) {
                        nVar2.d((s4.c1) arrayList4.get(i12));
                        i12++;
                    }
                    nVar2.G();
                }
                nVar2.K.removeAll(arrayList3);
                break;
            case 12:
                ii.n nVar3 = (ii.n) obj2;
                View view = (View) r82;
                s4.c1 c1Var = (s4.c1) obj;
                nVar3.getClass();
                view.setVisibility(0);
                if (nVar3.A.remove(c1Var)) {
                    nVar3.d(c1Var);
                    nVar3.G();
                }
                nVar3.K.remove(view);
                break;
            case 13:
                k2.j jVar = (k2.j) ((of.b) obj2).c;
                String str = e2.d0.a;
                j2.e eVar2 = ((i2.b0) jVar).a.s;
                j2.a p5 = eVar2.p();
                eVar2.q(p5, 1009, new j2.d(p5, (b2.s) r82, (i2.h) obj, 13));
                break;
            case 14:
                m4.x xVar = (m4.x) obj2;
                m4.r rVar = (m4.r) r82;
                KeyEvent keyEvent = (KeyEvent) obj;
                m4.b0 b0Var2 = xVar.b;
                if (b0Var2.i(rVar)) {
                    b0Var2.b(keyEvent, false, false);
                } else {
                    m4.l0 l0Var = b0Var2.h;
                    n4.a0 a0Var = rVar.a;
                    a0Var.getClass();
                    l0Var.getClass();
                    l0Var.H(1, new m4.c0(l0Var, 7), a0Var, true);
                }
                xVar.a = null;
                break;
            case 15:
                m4.b0 b0Var3 = (m4.b0) obj2;
                j2.h hVar = (j2.h) r82;
                m4.s sVar = (m4.s) obj;
                if (!b0Var3.j()) {
                    m4.l1 l1Var = b0Var3.t;
                    hVar.getClass();
                    w7.u.b(l1Var, sVar);
                    break;
                }
                break;
            case 16:
                n2.j jVar2 = (n2.j) obj2;
                r82.b(jVar2.a, jVar2.b, (Exception) obj);
                break;
            case 17:
                ((VideoAds) obj2).lambda$show$3((pc) r82, (TLRPC.TL_sponsoredMessage) obj);
                break;
            case 18:
                ((VideoAds) obj2).lambda$show$5((pc) r82, (boolean[]) obj);
                break;
            case 19:
                ((VideoPlayerHolderBase) obj2).lambda$release$3((TLRPC.Document) r82, (Runnable) obj);
                break;
            case 20:
                ((Utilities.Callback2) obj2).run((TLObject) r82, (TLRPC.TL_error) obj);
                break;
            case 21:
                ((Utilities.Callback2) obj2).run((TLRPC.Updates) r82, (TLRPC.TL_error) obj);
                break;
            case 22:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj2;
                p2 p2Var = (p2) r82;
                p2 p2Var2 = (p2) obj;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarLayout.J;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (viewGroup = (ViewGroup) actionBarPopupWindow$ActionBarPopupWindowLayout.getParent()) != null) {
                    viewGroup.removeView(actionBarLayout.J);
                }
                if (actionBarLayout.h || actionBarLayout.a0) {
                    actionBarLayout.v.setScaleX(1.0f);
                    actionBarLayout.v.setScaleY(1.0f);
                    actionBarLayout.h = false;
                    actionBarLayout.J = null;
                    actionBarLayout.a0 = false;
                } else {
                    actionBarLayout.v.setTranslationX(0.0f);
                }
                actionBarLayout.m(p2Var);
                p2Var.setRemovingFromStack(false);
                p2Var.onTransitionAnimationEnd(false, true);
                p2Var2.onTransitionAnimationEnd(true, true);
                p2Var2.onBecomeFullyVisible();
                break;
            case 23:
                ((p2) r82).presentFragment((eo) obj);
                ((q3) obj2).c = false;
                break;
            case 24:
                q3 q3Var = (q3) obj2;
                ArrayList arrayList5 = (ArrayList) r82;
                p3 p3Var = (p3) obj;
                q3Var.getClass();
                while (i12 < arrayList5.size()) {
                    if (((n3) arrayList5.get(i12)).a == p3Var) {
                        arrayList5.remove(i12);
                        i12--;
                    }
                    i12++;
                }
                q3Var.invalidate();
                break;
            case 25:
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj2;
                TLObject tLObject3 = (TLObject) r82;
                org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) obj;
                if (tLObject3 instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject3;
                    i6Var.g0 = FileLoader.getAttachFileName(tL_wallPaper.document);
                    NotificationCenter.getInstance(i6Var.E).addObserver(i6Var, NotificationCenter.fileLoaded);
                    NotificationCenter.getInstance(i6Var.E).addObserver(i6Var, NotificationCenter.fileLoadFailed);
                    FileLoader.getInstance(i6Var2.E).loadFile(tL_wallPaper.document, tL_wallPaper, 1, 1);
                    break;
                } else {
                    i6Var.s();
                    break;
                }
            case 26:
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) obj2;
                w0Var.X0.H1(w0Var, (TLRPC.TL_premiumGiftOption) obj, (String) r82);
                break;
            case 27:
                org.telegram.ui.ActionBar.i6 i6Var3 = (org.telegram.ui.ActionBar.i6) r82;
                i6Var3.f = !i6Var3.d((File) obj, i6Var3.c);
                AndroidUtilities.runOnUIThread(new pa(i11, (ra) obj2, i6Var3));
                break;
            case 28:
                org.telegram.ui.Components.g0 g0Var2 = (org.telegram.ui.Components.g0) obj2;
                d5.M((Context) r82, g0Var2.l0, new l2.h(g0Var2, i11), (org.telegram.ui.ActionBar.f6) obj);
                break;
            default:
                j8.o((j8) obj2, (org.telegram.ui.ActionBar.d2) r82, (TLObject) obj);
                break;
        }
    }

    public /* synthetic */ a0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
