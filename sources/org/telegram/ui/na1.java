package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.webkit.JsPromptResult;
import androidx.car.app.IStartCarApp;
import androidx.car.app.notification.CarAppNotificationBroadcastReceiver;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class na1 implements org.telegram.ui.ActionBar.p1, OnSuccessListener, t2.v, v5.b, ta.a, u5.e, OnFailureListener, androidx.car.app.utils.b, e3.r, g2.k, cl0, nw, OnCompleteListener, Continuation {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ na1(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.nw
    public /* synthetic */ boolean G() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.nw
    public /* synthetic */ boolean N(uw uwVar) {
        switch (this.a) {
        }
        return false;
    }

    @Override // t2.v
    public int a(Object obj) {
        Context context = (Context) this.b;
        d2.v vVar = (d2.v) this.c;
        t2.o oVar = (t2.o) obj;
        String str = oVar.b;
        return ((str.equals(vVar.s) || str.equals(t2.w.c(vVar))) && oVar.c(context, vVar, false) && oVar.d(vVar)) ? 1 : 0;
    }

    @Override // g2.k
    public void accept(Object obj) {
        b8.kg kgVar = (b8.kg) this.b;
        ((w2.k0) obj).d(kgVar.b, (w2.g0) kgVar.c, (w2.c0) this.c);
    }

    @Override // u5.e
    public Object apply(Object obj) {
        u5.g gVar = (u5.g) this.b;
        n5.i iVar = (n5.i) this.c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        u5.a aVar = gVar.d;
        ArrayList d = gVar.d(sQLiteDatabase, iVar, aVar.b);
        for (k5.d dVar : k5.d.values()) {
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
        for (int i3 = 0; i3 < d.size(); i3++) {
            sb2.append(((u5.b) d.get(i3)).a);
            if (i3 < d.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null);
        while (query.moveToNext()) {
            try {
                long j10 = query.getLong(0);
                Set set = (Set) hashMap.get(Long.valueOf(j10));
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(Long.valueOf(j10), set);
                }
                set.add(new u5.f(query.getString(1), query.getString(2)));
            } catch (Throwable th2) {
                query.close();
                throw th2;
            }
        }
        query.close();
        ListIterator listIterator = d.listIterator();
        while (listIterator.hasNext()) {
            u5.b bVar = (u5.b) listIterator.next();
            long j11 = bVar.a;
            if (hashMap.containsKey(Long.valueOf(j11))) {
                g2.f0 c2 = bVar.c.c();
                for (u5.f fVar : (Set) hashMap.get(Long.valueOf(j11))) {
                    c2.a(fVar.a, fVar.b);
                }
                listIterator.set(new u5.b(j11, bVar.b, c2.b()));
            }
        }
        return d;
    }

    @Override // e3.r
    public e3.o[] b(Uri uri, Map map) {
        w2.q qVar = (w2.q) this.b;
        d2.v vVar = (d2.v) this.c;
        return new e3.o[]{qVar.c.l(vVar) ? new b4.h(qVar.c.h(vVar), null) : new m3.a(vVar)};
    }

    @Override // ta.a
    public void c(ta.b bVar) {
        ta.a aVar = (ta.a) this.b;
        ta.a aVar2 = (ta.a) this.c;
        aVar.c(bVar);
        aVar2.c(bVar);
    }

    @Override // androidx.car.app.utils.b
    public void call() {
        IStartCarApp iStartCarApp = (IStartCarApp) this.b;
        Intent intent = (Intent) this.c;
        int i3 = CarAppNotificationBroadcastReceiver.a;
        iStartCarApp.startCarApp(intent);
    }

    @Override // v5.b
    public Object d() {
        switch (this.a) {
            case 12:
                ha.c cVar = (ha.c) this.b;
                Iterable iterable = (Iterable) this.c;
                u5.g gVar = (u5.g) ((u5.d) cVar.c);
                gVar.getClass();
                if (iterable.iterator().hasNext()) {
                    gVar.a().compileStatement("DELETE FROM events WHERE _id in " + u5.g.g(iterable)).execute();
                    break;
                }
                break;
            default:
                ha.c cVar2 = (ha.c) this.b;
                for (Map.Entry entry : ((HashMap) this.c).entrySet()) {
                    ((u5.g) ((u5.c) cVar2.i)).e(((Integer) entry.getValue()).intValue(), q5.c.h, (String) entry.getKey());
                }
                break;
        }
        return null;
    }

    @Override // org.telegram.ui.cl0
    public void e(int i3) {
        switch (this.a) {
            case 24:
                xg.v vVar = (xg.v) this.b;
                xg.v vVar2 = (xg.v) this.c;
                if (i3 != 1) {
                    if (i3 != 3) {
                        vVar2.a(null);
                        break;
                    }
                } else {
                    vVar.a(null);
                    break;
                }
                break;
            default:
                org.telegram.messenger.u10 u10Var = (org.telegram.messenger.u10) this.b;
                org.telegram.messenger.u10 u10Var2 = (org.telegram.messenger.u10) this.c;
                if (i3 != 1) {
                    if (i3 != 3) {
                        u10Var2.a(null);
                        break;
                    }
                } else {
                    u10Var.a(null);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.a) {
            case 0:
                ra1.b0((ra1) this.b, (byte[]) this.c);
                break;
            case 1:
                zb1 zb1Var = (zb1) this.b;
                ((boolean[]) this.c)[0] = true;
                zb1Var.q0 = 17;
                Intent intent = new Intent(zb1Var.b, (Class<?>) VoIPService.class);
                intent.putExtra("user_id", zb1Var.d.id);
                intent.putExtra("is_outgoing", true);
                intent.putExtra("start_incall_activity", false);
                intent.putExtra("video_call", false);
                intent.putExtra("can_video_call", false);
                intent.putExtra("account", zb1Var.a);
                try {
                    zb1Var.b.startService(intent);
                    break;
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                    return;
                }
            case 3:
                org.telegram.ui.Wallet.n8 n8Var = (org.telegram.ui.Wallet.n8) this.b;
                Boolean bool = (Boolean) this.c;
                n8Var.getClass();
                s1Var.dismiss();
                org.telegram.ui.Wallet.e8 e8Var = new org.telegram.ui.Wallet.e8();
                e8Var.r = !bool.booleanValue();
                n8Var.presentFragment(e8Var);
                break;
            case 4:
                Runnable runnable = (Runnable) this.b;
                org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) this.c;
                runnable.run();
                t2Var.dismiss();
                break;
            case 5:
                org.telegram.ui.Wallet.n8 n8Var2 = (org.telegram.ui.Wallet.n8) this.b;
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) this.c;
                sf.b h = s1Var.h(i3, true, true);
                h.d();
                org.telegram.ui.Wallet.j8 j8Var = new org.telegram.ui.Wallet.j8(n8Var2, h, 1);
                org.telegram.ui.Wallet.k0.H("disableBackupWithoutUpdatingPhrase");
                k0Var.m0(new g2.p0((Object) k0Var, (Object) new e51(1, k0Var, j8Var), true, false, 4));
                break;
            case 7:
                org.telegram.ui.web.n.d0((org.telegram.ui.web.n) this.b, (HashSet) this.c);
                break;
            case 8:
                org.telegram.ui.web.w0 w0Var = (org.telegram.ui.web.w0) this.b;
                String[] strArr = (String[]) this.c;
                TL_bots.allowSendMessage allowsendmessage = new TL_bots.allowSendMessage();
                allowsendmessage.bot = org.telegram.messenger.hp.s1(w0Var.N).q1(w0Var.V);
                ConnectionsManager.getInstance(w0Var.N).sendRequest(allowsendmessage, new ai.r6(w0Var, strArr, s1Var, 21));
                break;
            case 9:
                boolean[] zArr = (boolean[]) this.b;
                JsPromptResult jsPromptResult = (JsPromptResult) this.c;
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsPromptResult.cancel();
                    break;
                }
                break;
            case 10:
                sf.c.q((Context) this.b, Uri.parse((String) this.c), true, false);
                break;
            case 18:
                vg.i0 i0Var = (vg.i0) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                i0Var.dismiss();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                    tL_channels_updateUsername.channel = org.telegram.messenger.hp.i1((TLRPC.Chat) arrayList.get(i10));
                    tL_channels_updateUsername.username = "";
                    ConnectionsManager.getInstance(i0Var.a).sendRequest(tL_channels_updateUsername, new vg.u(i0Var, 1), 64);
                }
                break;
            case 22:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                xg.r0 r0Var = (xg.r0) this.c;
                atomicBoolean.set(true);
                r0Var.run();
                break;
            default:
                ((xg.v) this.b).a((TLRPC.TL_premiumGiftCodeOption) this.c);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((za.f) this.b).a((Intent) this.c);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        ug.n1 n1Var = (ug.n1) this.b;
        Bitmap bitmap = (Bitmap) this.c;
        n1Var.C0 = false;
        org.telegram.messenger.a8.g(exc, true);
        if (Build.VERSION.SDK_INT >= 24 && (exc instanceof ib.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && n1Var.isAttachedToWindow()) {
            org.telegram.messenger.g0.i3(new u9.a(3, n1Var, bitmap), 2000L);
        } else {
            n1Var.D0 = true;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        b8.ke keVar = (b8.ke) this.b;
        gi.d dVar = (gi.d) this.c;
        org.telegram.messenger.a8.b("wear-auth: /token delivered to " + ((String) keVar.d));
        dVar.setLoading(false);
        qc1.d = null;
        org.telegram.ui.ActionBar.t2 t2Var = qc1.c;
        if (t2Var != null) {
            t2Var.dismiss();
            qc1.c = null;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        za.g gVar = (za.g) this.b;
        String str = (String) this.c;
        synchronized (gVar) {
            ((a0.f) gVar.b).remove(str);
        }
        return task;
    }

    @Override // org.telegram.ui.nw
    public boolean y(uw uwVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i3, int i10, m91 m91Var) {
        switch (this.a) {
            case 26:
                xg.g0 g0Var = (xg.g0) this.b;
                String str = (String) this.c;
                long j10 = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    j10 = ((org.telegram.messenger.pr) arrayList.get(i11)).a;
                    g0Var.p1.getSendMessagesHelper().r0(org.telegram.messenger.wy.b(str, j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
                }
                uwVar.finishFragment();
                xg.j.h(j10);
                break;
            default:
                yg.e eVar = (yg.e) this.b;
                String str2 = (String) this.c;
                long j11 = 0;
                int i12 = 0;
                while (i12 < arrayList.size()) {
                    j11 = ((org.telegram.messenger.pr) arrayList.get(i12)).a;
                    eVar.e.getSendMessagesHelper().r0(org.telegram.messenger.wy.b(str2, j11, null, null, null, true, null, null, null, true, 0, 0, null, false));
                    i12++;
                    eVar = eVar;
                }
                uwVar.finishFragment();
                xg.j.h(j11);
                break;
        }
        return true;
    }
}
