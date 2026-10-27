package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.webkit.JsPromptResult;
import androidx.car.app.IStartCarApp;
import androidx.car.app.notification.CarAppNotificationBroadcastReceiver;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.FirebaseCommonRegistrar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bh1 implements org.telegram.ui.ActionBar.b2, OnSuccessListener, r2.v, u5.b, ra.a, OnFailureListener, t5.e, c3.r, e2.j, androidx.car.app.utils.c, qo0, xx, s9.d, bi.i5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bh1(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.xx
    public /* synthetic */ boolean C() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.xx
    public /* synthetic */ boolean K(ey eyVar) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.qo0
    public void a(int i10) {
        switch (this.a) {
            case 21:
                vg.v vVar = (vg.v) this.b;
                vg.v vVar2 = (vg.v) this.c;
                if (i10 != 1) {
                    if (i10 != 3) {
                        vVar2.run(null);
                        break;
                    }
                } else {
                    vVar.run(null);
                    break;
                }
                break;
            default:
                Utilities.Callback callback = (Utilities.Callback) this.b;
                Utilities.Callback callback2 = (Utilities.Callback) this.c;
                if (i10 != 1) {
                    if (i10 != 3) {
                        callback2.run(null);
                        break;
                    }
                } else {
                    callback.run(null);
                    break;
                }
                break;
        }
    }

    @Override // e2.j
    public void accept(Object obj) {
        a8.ng ngVar = (a8.ng) this.b;
        ((u2.k0) obj).d(ngVar.b, (u2.g0) ngVar.c, (u2.c0) this.c);
    }

    @Override // t5.e
    public Object apply(Object obj) {
        t5.g gVar = (t5.g) this.b;
        m5.i iVar = (m5.i) this.c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        t5.a aVar = gVar.d;
        ArrayList d = gVar.d(sQLiteDatabase, iVar, aVar.b);
        for (j5.d dVar : j5.d.values()) {
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
        for (int i10 = 0; i10 < d.size(); i10++) {
            sb2.append(((t5.b) d.get(i10)).a);
            if (i10 < d.size() - 1) {
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
                set.add(new t5.f(query.getString(1), query.getString(2)));
            } catch (Throwable th2) {
                query.close();
                throw th2;
            }
        }
        query.close();
        ListIterator listIterator = d.listIterator();
        while (listIterator.hasNext()) {
            t5.b bVar = (t5.b) listIterator.next();
            long j11 = bVar.a;
            if (hashMap.containsKey(Long.valueOf(j11))) {
                aa.m0 c10 = bVar.c.c();
                for (t5.f fVar : (Set) hashMap.get(Long.valueOf(j11))) {
                    c10.b(fVar.a, fVar.b);
                }
                listIterator.set(new t5.b(j11, bVar.b, c10.h()));
            }
        }
        return d;
    }

    @Override // bi.i5
    public void b(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, boolean z10) {
        zh.m2 m2Var = (zh.m2) this.b;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.c;
        org.telegram.ui.Components.ws0 ws0Var = m2Var.a;
        m2Var.e.l.remove(savedStarGift);
        m2Var.f(true);
        int i10 = m2Var.b;
        if (j10 == UserConfig.getInstance(i10).getClientUserId()) {
            org.telegram.ui.Components.wc b02 = org.telegram.ui.Components.wc.b0(ws0Var.a);
            TLRPC.Document document = tL_starGiftUnique.getDocument();
            String string = LocaleController.getString(R.string.BoughtResoldGiftTitle);
            int i11 = R.string.BoughtResoldGiftText;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            org.telegram.ui.Components.qc O = b02.O(document, string, LocaleController.formatString(i11, org.telegram.messenger.t.i(tL_starGiftUnique.num, ',', sb2)));
            O.s = false;
            O.j();
        } else {
            org.telegram.ui.Components.qc O2 = org.telegram.ui.Components.wc.b0(ws0Var.a).O(tL_starGiftUnique.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(i10, j10)));
            O2.s = false;
            O2.j();
        }
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity != null) {
            launchActivity.x0.c(true);
        }
    }

    @Override // r2.v
    public int c(Object obj) {
        Context context = (Context) this.b;
        b2.x xVar = (b2.x) this.c;
        r2.o oVar = (r2.o) obj;
        String str = oVar.b;
        return ((str.equals(xVar.s) || str.equals(r2.w.c(xVar))) && oVar.c(context, xVar, false) && oVar.d(xVar)) ? 1 : 0;
    }

    @Override // androidx.car.app.utils.c
    public void call() {
        IStartCarApp iStartCarApp = (IStartCarApp) this.b;
        Intent intent = (Intent) this.c;
        int i10 = CarAppNotificationBroadcastReceiver.a;
        iStartCarApp.startCarApp(intent);
    }

    @Override // c3.r
    public c3.o[] d(Uri uri, Map map) {
        u2.q qVar = (u2.q) this.b;
        b2.x xVar = (b2.x) this.c;
        return new c3.o[]{qVar.c.i1(xVar) ? new z3.h(qVar.c.f0(xVar), null) : new k3.a(xVar)};
    }

    @Override // s9.d
    public Object d1(a8.me meVar) {
        String valueOf;
        String str = (String) this.b;
        m4.x0 x0Var = (m4.x0) this.c;
        Context context = (Context) meVar.a(Context.class);
        switch (x0Var.a) {
            case 12:
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                if (applicationInfo != null) {
                    valueOf = String.valueOf(applicationInfo.targetSdkVersion);
                    break;
                }
                valueOf = "";
                break;
            case 13:
                valueOf = FirebaseCommonRegistrar.a(context);
                break;
            case 14:
                int i10 = Build.VERSION.SDK_INT;
                if (!context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                    if (!context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                        if (!context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                            if (i10 >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                                valueOf = "embedded";
                                break;
                            }
                            valueOf = "";
                            break;
                        } else {
                            valueOf = "auto";
                            break;
                        }
                    } else {
                        valueOf = "watch";
                        break;
                    }
                } else {
                    valueOf = "tv";
                    break;
                }
            default:
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                if (installerPackageName != null) {
                    valueOf = FirebaseCommonRegistrar.b(installerPackageName);
                    break;
                }
                valueOf = "";
                break;
        }
        return new za.a(str, valueOf);
    }

    @Override // u5.b
    public Object f() {
        switch (this.a) {
            case 10:
                aa.b0 b0Var = (aa.b0) this.b;
                Iterable iterable = (Iterable) this.c;
                t5.g gVar = (t5.g) ((t5.d) b0Var.f);
                gVar.getClass();
                if (iterable.iterator().hasNext()) {
                    gVar.a().compileStatement("DELETE FROM events WHERE _id in " + t5.g.g(iterable)).execute();
                    break;
                }
                break;
            default:
                aa.b0 b0Var2 = (aa.b0) this.b;
                for (Map.Entry entry : ((HashMap) this.c).entrySet()) {
                    ((t5.g) ((t5.c) b0Var2.i)).e(((Integer) entry.getValue()).intValue(), p5.c.h, (String) entry.getKey());
                }
                break;
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.a) {
            case 0:
                rh1 rh1Var = (rh1) this.b;
                boolean[] zArr = (boolean[]) this.c;
                rh1Var.getClass();
                zArr[0] = true;
                rh1Var.p0 = 17;
                Intent intent = new Intent(rh1Var.b, (Class<?>) VoIPService.class);
                intent.putExtra("user_id", rh1Var.d.id);
                intent.putExtra("is_outgoing", true);
                intent.putExtra("start_incall_activity", false);
                intent.putExtra("video_call", false);
                intent.putExtra("can_video_call", false);
                intent.putExtra("account", rh1Var.a);
                try {
                    rh1Var.b.startService(intent);
                    break;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    return;
                }
            case 2:
                org.telegram.ui.Wallet.h8 h8Var = (org.telegram.ui.Wallet.h8) this.b;
                Boolean bool = (Boolean) this.c;
                h8Var.getClass();
                e2Var.dismiss();
                org.telegram.ui.Wallet.w7 w7Var = new org.telegram.ui.Wallet.w7();
                w7Var.r = !bool.booleanValue();
                h8Var.presentFragment(w7Var);
                break;
            case 3:
                Runnable runnable = (Runnable) this.b;
                org.telegram.ui.ActionBar.k3 k3Var = (org.telegram.ui.ActionBar.k3) this.c;
                runnable.run();
                k3Var.dismiss();
                break;
            case 4:
                org.telegram.ui.Wallet.h8 h8Var2 = (org.telegram.ui.Wallet.h8) this.b;
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) this.c;
                qf.c h = e2Var.h(i10, true, true);
                h.d();
                org.telegram.ui.Wallet.d8 d8Var = new org.telegram.ui.Wallet.d8(h8Var2, h, 1);
                org.telegram.ui.Wallet.l0.H("disableBackupWithoutUpdatingPhrase");
                l0Var.m0(new e2.p0((Object) l0Var, (Object) new org.telegram.ui.Components.oy(28, l0Var, d8Var), true, false, 3));
                break;
            case 6:
                org.telegram.ui.web.p.Z((org.telegram.ui.web.p) this.b, (HashSet) this.c);
                break;
            case 7:
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) this.b;
                String[] strArr = (String[]) this.c;
                TL_bots.allowSendMessage allowsendmessage = new TL_bots.allowSendMessage();
                allowsendmessage.bot = MessagesController.getInstance(a1Var.M).getInputUser(a1Var.U);
                ConnectionsManager.getInstance(a1Var.M).sendRequest(allowsendmessage, new bi.h2(a1Var, strArr, e2Var, 20));
                break;
            case 8:
                boolean[] zArr2 = (boolean[]) this.c;
                JsPromptResult jsPromptResult = (JsPromptResult) this.b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    jsPromptResult.cancel();
                    break;
                }
                break;
            case 15:
                tg.j0.Q((tg.j0) this.b, (ArrayList) this.c);
                break;
            case 19:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                vg.t0 t0Var = (vg.t0) this.c;
                atomicBoolean.set(true);
                t0Var.run();
                break;
            case 20:
                ((vg.v) this.b).run((TLRPC.TL_premiumGiftCodeOption) this.c);
                break;
            case 27:
                zh.m mVar = (zh.m) this.b;
                org.telegram.ui.Cells.g6 g6Var = (org.telegram.ui.Cells.g6) this.c;
                try {
                    int parseInt = Integer.parseInt(g6Var.getText().toString().trim());
                    mVar.X(parseInt);
                    mVar.c0.setValue(parseInt);
                    e2Var.dismiss();
                    break;
                } catch (Throwable th3) {
                    AndroidUtilities.shakeView(g6Var);
                    FileLog.e(th3);
                    return;
                }
            default:
                zh.y1 y1Var = (zh.y1) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                String obj = y1Var.getText().toString();
                if (obj.length() > 0 && obj.length() <= 12) {
                    callback.run(obj);
                    e2Var.dismiss();
                    break;
                } else {
                    AndroidUtilities.shakeView(y1Var);
                    break;
                }
                break;
        }
    }

    @Override // ra.a
    public void i(ra.b bVar) {
        ra.a aVar = (ra.a) this.b;
        ra.a aVar2 = (ra.a) this.c;
        aVar.i(bVar);
        aVar2.i(bVar);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        sg.y1 y1Var = (sg.y1) this.b;
        Bitmap bitmap = (Bitmap) this.c;
        y1Var.B0 = false;
        FileLog.e(exc);
        if (Build.VERSION.SDK_INT >= 24 && (exc instanceof ob.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && y1Var.isAttachedToWindow()) {
            AndroidUtilities.runOnUIThread(new s9.g(2, y1Var, bitmap), 2000L);
        } else {
            y1Var.C0 = true;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        a8.me meVar = (a8.me) this.b;
        fi.d dVar = (fi.d) this.c;
        FileLog.d("wear-auth: /token delivered to " + ((String) meVar.c));
        dVar.setLoading(false);
        ki1.d = null;
        org.telegram.ui.ActionBar.k3 k3Var = ki1.c;
        if (k3Var != null) {
            k3Var.dismiss();
            ki1.c = null;
        }
    }

    @Override // org.telegram.ui.xx
    public boolean v(ey eyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, cf1 cf1Var) {
        switch (this.a) {
            case 23:
                vg.g0 g0Var = (vg.g0) this.b;
                String str = (String) this.c;
                long j10 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    j10 = ((MessagesStorage.TopicKey) arrayList.get(i12)).dialogId;
                    g0Var.n.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(str, j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
                }
                eyVar.finishFragment();
                vg.j.h(j10);
                break;
            default:
                wg.e eVar = (wg.e) this.b;
                String str2 = (String) this.c;
                long j11 = 0;
                int i13 = 0;
                while (i13 < arrayList.size()) {
                    j11 = ((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId;
                    eVar.e.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(str2, j11, null, null, null, true, null, null, null, true, 0, 0, null, false));
                    i13++;
                    eVar = eVar;
                }
                eyVar.finishFragment();
                vg.j.h(j11);
                break;
        }
        return true;
    }

    public /* synthetic */ bh1(boolean[] zArr, JsPromptResult jsPromptResult) {
        this.a = 8;
        this.c = zArr;
        this.b = jsPromptResult;
    }
}
