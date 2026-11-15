package org.telegram.ui.Wallet;

import a8.xa;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.Surface;
import android.webkit.JsPromptResult;
import androidx.car.app.IStartCarApp;
import androidx.car.app.notification.CarAppNotificationBroadcastReceiver;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.cz;
import org.telegram.messenger.np;
import org.telegram.messenger.ur;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.Components.km;
import org.telegram.ui.Components.lv0;
import org.telegram.ui.il0;
import org.telegram.ui.sw;
import org.telegram.ui.u91;
import org.telegram.ui.vc1;
import org.telegram.ui.x21;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final /* synthetic */ class k8 implements org.telegram.ui.ActionBar.q1, OnSuccessListener, p4.l0, h2.j, p4.a1, qi.m, OnFailureListener, u2.v, w5.b, ua.a, androidx.car.app.utils.c, v5.e, il0, sw, f3.r {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k8(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.sw
    public /* synthetic */ boolean H() {
        return false;
    }

    @Override // org.telegram.ui.sw
    public /* synthetic */ boolean P(yw ywVar) {
        return false;
    }

    @Override // qi.m
    public void a(ji.j jVar) {
        switch (this.a) {
            case 13:
                org.telegram.messenger.g0.h3(new lv0((SpannableString) this.b, jVar, (oi.u4) this.c, 21));
                break;
            default:
                org.telegram.messenger.g0.h3(new lv0((SpannableString) this.b, jVar, (di.m9) this.c, 22));
                break;
        }
    }

    @Override // h2.j
    public void accept(Object obj) {
        switch (this.a) {
            case 8:
                p4.c1 c1Var = (p4.c1) this.b;
                e2.q1 q1Var = (e2.q1) this.c;
                p4.g1 g1Var = (p4.g1) obj;
                c1Var.getClass();
                h9.l0 l0Var = q1Var.H;
                if (!l0Var.isEmpty()) {
                    e2.p1 c10 = q1Var.a().c();
                    h9.g2 it = l0Var.values().iterator();
                    while (it.hasNext()) {
                        e2.n1 n1Var = (e2.n1) it.next();
                        e2.m1 m1Var = (e2.m1) c1Var.d.n.get(n1Var.a.b);
                        if (m1Var == null || n1Var.a.a != m1Var.a) {
                            c10.a(n1Var);
                        } else {
                            c10.a(new e2.n1(m1Var, n1Var.b));
                        }
                    }
                    q1Var = c10.b();
                }
                g1Var.q0(q1Var);
                break;
            case 9:
                p4.c1 c1Var2 = (p4.c1) this.b;
                p4.v vVar = (p4.v) this.c;
                p4.d0 d0Var = (p4.d0) c1Var2.a.get();
                if (d0Var != null && !d0Var.j()) {
                    d0Var.g(vVar, false);
                    break;
                }
                break;
            case 10:
                p4.c1 c1Var3 = (p4.c1) this.b;
                Surface surface = (Surface) this.c;
                p4.g1 g1Var2 = (p4.g1) obj;
                ((p4.d0) c1Var3.a.get()).getClass();
                if (surface != null) {
                    p4.b1 b1Var = new p4.b1(surface);
                    c1Var3.i = b1Var;
                    g1Var2.S(b1Var);
                    break;
                } else {
                    g1Var2.S(null);
                    c1Var3.i = null;
                    break;
                }
            default:
                xa xaVar = (xa) this.b;
                ((x2.j0) obj).k(xaVar.b, (x2.f0) xaVar.c, (x2.b0) this.c);
                break;
        }
    }

    @Override // v5.e
    public Object apply(Object obj) {
        v5.g gVar = (v5.g) this.b;
        o5.i iVar = (o5.i) this.c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        v5.a aVar = gVar.d;
        ArrayList d = gVar.d(sQLiteDatabase, iVar, aVar.b);
        for (l5.d dVar : l5.d.values()) {
            if (dVar != iVar.c) {
                int size = aVar.b - d.size();
                if (size <= 0) {
                    break;
                }
                d.addAll(gVar.d(sQLiteDatabase, iVar.b(dVar), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i7 = 0; i7 < d.size(); i7++) {
            sb2.append(((v5.b) d.get(i7)).a);
            if (i7 < d.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null);
        while (query.moveToNext()) {
            try {
                long j3 = query.getLong(0);
                Set set = (Set) hashMap.get(Long.valueOf(j3));
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(Long.valueOf(j3), set);
                }
                set.add(new v5.f(query.getString(1), query.getString(2)));
            } catch (Throwable th2) {
                query.close();
                throw th2;
            }
        }
        query.close();
        ListIterator listIterator = d.listIterator();
        while (listIterator.hasNext()) {
            v5.b bVar = (v5.b) listIterator.next();
            long j10 = bVar.a;
            if (hashMap.containsKey(Long.valueOf(j10))) {
                h2.e0 c10 = bVar.c.c();
                for (v5.f fVar : (Set) hashMap.get(Long.valueOf(j10))) {
                    c10.a(fVar.a, fVar.b);
                }
                listIterator.set(new v5.b(j10, bVar.b, c10.b()));
            }
        }
        return d;
    }

    @Override // ua.a
    public void b(ua.b bVar) {
        ua.a aVar = (ua.a) this.b;
        ua.a aVar2 = (ua.a) this.c;
        aVar.b(bVar);
        aVar2.b(bVar);
    }

    @Override // u2.v
    public int c(Object obj) {
        Context context = (Context) this.b;
        e2.u uVar = (e2.u) this.c;
        u2.o oVar = (u2.o) obj;
        String str = oVar.b;
        return ((str.equals(uVar.s) || str.equals(u2.w.c(uVar))) && oVar.c(context, uVar, false) && oVar.d(uVar)) ? 1 : 0;
    }

    @Override // androidx.car.app.utils.c
    public void call() {
        IStartCarApp iStartCarApp = (IStartCarApp) this.b;
        Intent intent = (Intent) this.c;
        int i7 = CarAppNotificationBroadcastReceiver.a;
        iStartCarApp.startCarApp(intent);
    }

    @Override // f3.r
    public f3.o[] d(Uri uri, Map map) {
        x2.p pVar = (x2.p) this.b;
        e2.u uVar = (e2.u) this.c;
        return new f3.o[]{pVar.c.L(uVar) ? new c4.h(pVar.c.f(uVar), null) : new n3.a(uVar)};
    }

    @Override // org.telegram.ui.il0
    public void e(int i7) {
        switch (this.a) {
            case 25:
                wg.t tVar = (wg.t) this.b;
                wg.t tVar2 = (wg.t) this.c;
                if (i7 != 1) {
                    if (i7 != 3) {
                        tVar2.a(null);
                        break;
                    }
                } else {
                    tVar.a(null);
                    break;
                }
                break;
            default:
                z10 z10Var = (z10) this.b;
                z10 z10Var2 = (z10) this.c;
                if (i7 != 1) {
                    if (i7 != 3) {
                        z10Var2.a(null);
                        break;
                    }
                } else {
                    z10Var.a(null);
                    break;
                }
                break;
        }
    }

    @Override // p4.l0
    public void f(p4.v vVar) {
        switch (this.a) {
            case 6:
                ((p4.d) this.c).f(((p4.m0) this.b).h.t);
                break;
            default:
                p4.m0 m0Var = (p4.m0) this.b;
                q4.h hVar = (q4.h) this.c;
                m0Var.getClass();
                String str = hVar.a;
                if (TextUtils.isEmpty(str)) {
                    h2.a.l("MediaSessionLegacyStub", "onRemoveQueueItem(): Media ID shouldn't be null");
                    break;
                } else {
                    p4.g1 g1Var = m0Var.h.t;
                    if (g1Var.p0(17)) {
                        e2.l1 y02 = g1Var.y0();
                        e2.k1 k1Var = new e2.k1();
                        for (int i7 = 0; i7 < y02.o(); i7++) {
                            if (TextUtils.equals(y02.m(i7, k1Var, 0L).c.a, str)) {
                                g1Var.Q(i7);
                                break;
                            }
                        }
                        break;
                    } else {
                        h2.a.l("MediaSessionLegacyStub", "Can't remove item by ID without COMMAND_GET_TIMELINE being available");
                        break;
                    }
                }
        }
    }

    @Override // w5.b
    public Object g() {
        switch (this.a) {
            case 17:
                ia.c cVar = (ia.c) this.b;
                Iterable iterable = (Iterable) this.c;
                v5.g gVar = (v5.g) ((v5.d) cVar.c);
                gVar.getClass();
                if (iterable.iterator().hasNext()) {
                    gVar.a().compileStatement("DELETE FROM events WHERE _id in " + v5.g.g(iterable)).execute();
                    break;
                }
                break;
            default:
                ia.c cVar2 = (ia.c) this.b;
                for (Map.Entry entry : ((HashMap) this.c).entrySet()) {
                    ((v5.g) ((v5.c) cVar2.i)).e(((Integer) entry.getValue()).intValue(), r5.c.h, (String) entry.getKey());
                }
                break;
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 0:
                Runnable runnable = (Runnable) this.b;
                org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) this.c;
                runnable.run();
                u2Var.dismiss();
                break;
            case 1:
                p8 p8Var = (p8) this.b;
                l0 l0Var = (l0) this.c;
                vf.b h = t1Var.h(i7, true, true);
                h.d();
                l8 l8Var = new l8(p8Var, h, 1);
                l0.H("disableBackupWithoutUpdatingPhrase");
                l0Var.m0(new h2.n0((Object) l0Var, (Object) new x21(3, l0Var, l8Var), true, false, 4));
                break;
            case 3:
                org.telegram.ui.web.m.d0((org.telegram.ui.web.m) this.b, (HashSet) this.c);
                break;
            case 4:
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.b;
                String[] strArr = (String[]) this.c;
                TL_bots.allowSendMessage allowsendmessage = new TL_bots.allowSendMessage();
                allowsendmessage.bot = np.s1(v0Var.N).q1(v0Var.V);
                ConnectionsManager.getInstance(v0Var.N).sendRequest(allowsendmessage, new bi.j6(v0Var, strArr, t1Var, 21));
                break;
            case 5:
                boolean[] zArr = (boolean[]) this.b;
                JsPromptResult jsPromptResult = (JsPromptResult) this.c;
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsPromptResult.cancel();
                    break;
                }
                break;
            case 20:
                ug.j0 j0Var = (ug.j0) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                j0Var.dismiss();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                    tL_channels_updateUsername.channel = np.i1((TLRPC.Chat) arrayList.get(i10));
                    tL_channels_updateUsername.username = "";
                    ConnectionsManager.getInstance(j0Var.a).sendRequest(tL_channels_updateUsername, new ug.u(j0Var, 1), 64);
                }
                break;
            case 23:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                wg.p0 p0Var = (wg.p0) this.c;
                atomicBoolean.set(true);
                p0Var.run();
                break;
            default:
                ((wg.t) this.b).a((TLRPC.TL_premiumGiftCodeOption) this.c);
                break;
        }
    }

    @Override // p4.a1
    public Object k(p4.d0 d0Var, p4.v vVar, int i7) {
        switch (this.a) {
            case 11:
                return d0Var.j() ? c8.r9.b(new p4.m1(-100)) : h2.l0.g0((m9.y) ((p4.a1) this.b).k(d0Var, vVar, i7), new km(d0Var, vVar, (p4.q0) this.c, 10));
            default:
                return d0Var.j() ? c8.r9.b(new p4.m1(-100)) : h2.l0.g0((m9.y) ((p4.a1) this.b).k(d0Var, vVar, i7), new km(d0Var, vVar, (p4.z0) this.c, 11));
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        tg.n1 n1Var = (tg.n1) this.b;
        Bitmap bitmap = (Bitmap) this.c;
        n1Var.C0 = false;
        org.telegram.messenger.a8.g(exc, true);
        if (Build.VERSION.SDK_INT >= 24 && (exc instanceof lb.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && n1Var.isAttachedToWindow()) {
            org.telegram.messenger.g0.i3(new org.telegram.ui.web.e1(19, n1Var, bitmap), 2000L);
        } else {
            n1Var.D0 = true;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        a8.r7 r7Var = (a8.r7) this.b;
        hi.d dVar = (hi.d) this.c;
        org.telegram.messenger.a8.b("wear-auth: /token delivered to " + ((String) r7Var.d));
        dVar.setLoading(false);
        vc1.d = null;
        org.telegram.ui.ActionBar.u2 u2Var = vc1.c;
        if (u2Var != null) {
            u2Var.dismiss();
            vc1.c = null;
        }
    }

    @Override // org.telegram.ui.sw
    public boolean y(yw ywVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, u91 u91Var) {
        wg.e0 e0Var = (wg.e0) this.b;
        String str = (String) this.c;
        long j3 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            j3 = ((ur) arrayList.get(i11)).a;
            e0Var.s1.getSendMessagesHelper().r0(cz.b(str, j3, null, null, null, true, null, null, null, true, 0, 0, null, false));
        }
        ywVar.finishFragment();
        wg.h.h(j3);
        return true;
    }
}
