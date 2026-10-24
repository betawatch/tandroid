package org.telegram.ui.Wallet;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
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
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.ns0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ey;
import org.telegram.ui.gi1;
import org.telegram.ui.ho0;
import org.telegram.ui.to0;
import org.telegram.ui.xx;
import org.telegram.ui.ye1;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e8 implements org.telegram.ui.ActionBar.z1, OnSuccessListener, r2.v, t5.b, qa.a, OnFailureListener, s5.e, c3.t, e2.j, ho0, xx, androidx.car.app.utils.b, r9.d, ai.n5, Utilities.Callback5, bm0, CameraView.CameraViewDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e8(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.xx
    public /* synthetic */ boolean D() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.xx
    public /* synthetic */ boolean J(ey eyVar) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ boolean P0(View view) {
        return false;
    }

    @Override // org.telegram.ui.ho0
    public void a(int i10) {
        switch (this.a) {
            case 17:
                ug.t tVar = (ug.t) this.b;
                ug.t tVar2 = (ug.t) this.c;
                if (i10 != 1) {
                    if (i10 != 3) {
                        tVar2.run(null);
                        break;
                    }
                } else {
                    tVar.run(null);
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
        a5.a aVar = (a5.a) this.b;
        ((u2.m0) obj).e(aVar.b, (u2.h0) aVar.c, (u2.d0) this.c);
    }

    @Override // s5.e
    public Object apply(Object obj) {
        s5.g gVar = (s5.g) this.b;
        l5.i iVar = (l5.i) this.c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        s5.a aVar = gVar.d;
        ArrayList d = gVar.d(sQLiteDatabase, iVar, aVar.b);
        for (i5.d dVar : i5.d.values()) {
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
            sb2.append(((s5.b) d.get(i10)).a);
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
                set.add(new s5.f(query.getString(1), query.getString(2)));
            } catch (Throwable th2) {
                query.close();
                throw th2;
            }
        }
        query.close();
        ListIterator listIterator = d.listIterator();
        while (listIterator.hasNext()) {
            s5.b bVar = (s5.b) listIterator.next();
            long j11 = bVar.a;
            if (hashMap.containsKey(Long.valueOf(j11))) {
                com.google.firebase.messaging.l c10 = bVar.c.c();
                for (s5.f fVar : (Set) hashMap.get(Long.valueOf(j11))) {
                    c10.b(fVar.a, fVar.b);
                }
                listIterator.set(new s5.b(j11, bVar.b, c10.f()));
            }
        }
        return d;
    }

    @Override // ai.n5
    public void b(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, boolean z10) {
        yh.l2 l2Var = (yh.l2) this.b;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.c;
        ns0 ns0Var = l2Var.a;
        l2Var.e.l.remove(savedStarGift);
        l2Var.f(true);
        int i10 = l2Var.b;
        if (j10 == UserConfig.getInstance(i10).getClientUserId()) {
            xc a02 = xc.a0(ns0Var.a);
            TLRPC.Document document = tL_starGiftUnique.getDocument();
            String string = LocaleController.getString(R.string.BoughtResoldGiftTitle);
            int i11 = R.string.BoughtResoldGiftText;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            qc O = a02.O(document, string, LocaleController.formatString(i11, i2.o1.m(tL_starGiftUnique.num, ',', sb2)));
            O.r = false;
            O.j();
        } else {
            qc O2 = xc.a0(ns0Var.a).O(tL_starGiftUnique.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(i10, j10)));
            O2.r = false;
            O2.j();
        }
        LaunchActivity launchActivity = LaunchActivity.J1;
        if (launchActivity != null) {
            launchActivity.x0.c(true);
        }
    }

    @Override // org.telegram.ui.Components.bm0
    public void c(float f7, float f10, int i10, View view) {
        yh.f4.Q((yh.f4) this.b, (yh.e4) this.c, i10);
    }

    @Override // androidx.car.app.utils.b
    public void call() {
        IStartCarApp iStartCarApp = (IStartCarApp) this.b;
        Intent intent = (Intent) this.c;
        int i10 = CarAppNotificationBroadcastReceiver.a;
        iStartCarApp.startCarApp(intent);
    }

    @Override // r2.v
    public int d(Object obj) {
        Context context = (Context) this.b;
        b2.w wVar = (b2.w) this.c;
        r2.o oVar = (r2.o) obj;
        String str = oVar.b;
        return ((str.equals(wVar.s) || str.equals(r2.w.c(wVar))) && oVar.c(context, wVar, false) && oVar.d(wVar)) ? 1 : 0;
    }

    @Override // c3.t
    public c3.q[] e(Uri uri, Map map) {
        u2.r rVar = (u2.r) this.b;
        b2.w wVar = (b2.w) this.c;
        return new c3.q[]{rVar.c.a0(wVar) ? new z3.h(rVar.c.y(wVar), null) : new k3.a(wVar)};
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 0:
                i8 i8Var = (i8) this.b;
                l0 l0Var = (l0) this.c;
                pf.c h = c2Var.h(i10, true, true);
                h.d();
                d8 d8Var = new d8(i8Var, h, 1);
                l0.F("disableBackupWithoutUpdatingPhrase");
                l0Var.j0(new e2.o0((Object) l0Var, (Object) new qy(26, l0Var, d8Var), true, false, 3));
                break;
            case 2:
                org.telegram.ui.web.p.Y((org.telegram.ui.web.p) this.b, (HashSet) this.c);
                break;
            case 3:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) this.b;
                String[] strArr = (String[]) this.c;
                TL_bots.allowSendMessage allowsendmessage = new TL_bots.allowSendMessage();
                allowsendmessage.bot = MessagesController.getInstance(b1Var.M).getInputUser(b1Var.U);
                ConnectionsManager.getInstance(b1Var.M).sendRequest(allowsendmessage, new ai.j2(b1Var, strArr, c2Var, 20));
                break;
            case 4:
                boolean[] zArr = (boolean[]) this.b;
                JsPromptResult jsPromptResult = (JsPromptResult) this.c;
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsPromptResult.cancel();
                    break;
                }
                break;
            case 11:
                sg.j0.Q((sg.j0) this.b, (ArrayList) this.c);
                break;
            case 15:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                ug.r0 r0Var = (ug.r0) this.c;
                atomicBoolean.set(true);
                r0Var.run();
                break;
            case 16:
                ((ug.t) this.b).run((TLRPC.TL_premiumGiftCodeOption) this.c);
                break;
            case 23:
                yh.m mVar = (yh.m) this.b;
                org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) this.c;
                try {
                    int parseInt = Integer.parseInt(c6Var.getText().toString().trim());
                    mVar.X(parseInt);
                    mVar.c0.setValue(parseInt);
                    c2Var.dismiss();
                    break;
                } catch (Throwable th2) {
                    AndroidUtilities.shakeView(c6Var);
                    FileLog.e(th2);
                    return;
                }
            default:
                yh.x1 x1Var = (yh.x1) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                String obj = x1Var.getText().toString();
                if (obj.length() > 0 && obj.length() <= 12) {
                    callback.run(obj);
                    c2Var.dismiss();
                    break;
                } else {
                    AndroidUtilities.shakeView(x1Var);
                    break;
                }
                break;
        }
    }

    @Override // qa.a
    public void h(qa.b bVar) {
        qa.a aVar = (qa.a) this.b;
        qa.a aVar2 = (qa.a) this.c;
        aVar.h(bVar);
        aVar2.h(bVar);
    }

    @Override // t5.b
    public Object j() {
        switch (this.a) {
            case 6:
                ea.b bVar = (ea.b) this.b;
                Iterable iterable = (Iterable) this.c;
                s5.g gVar = (s5.g) ((s5.d) bVar.c);
                gVar.getClass();
                if (iterable.iterator().hasNext()) {
                    gVar.a().compileStatement("DELETE FROM events WHERE _id in " + s5.g.g(iterable)).execute();
                    break;
                }
                break;
            default:
                ea.b bVar2 = (ea.b) this.b;
                for (Map.Entry entry : ((HashMap) this.c).entrySet()) {
                    ((s5.g) ((s5.c) bVar2.i)).e(((Integer) entry.getValue()).intValue(), o5.c.h, (String) entry.getKey());
                }
                break;
        }
        return null;
    }

    @Override // r9.d
    public Object j2(com.google.android.gms.internal.cast.z5 z5Var) {
        String valueOf;
        String str = (String) this.b;
        k2.f fVar = (k2.f) this.c;
        Context context = (Context) z5Var.a(Context.class);
        switch (fVar.a) {
            case 9:
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                if (applicationInfo != null) {
                    valueOf = String.valueOf(applicationInfo.targetSdkVersion);
                    break;
                }
                valueOf = "";
                break;
            case 10:
                valueOf = FirebaseCommonRegistrar.a(context);
                break;
            case 11:
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
        return new ya.a(str, valueOf);
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public void onCameraInit() {
        zh.b0 b0Var = (zh.b0) this.b;
        ((CameraView) this.c).animate().alpha(1.0f).setDuration(180L).start();
        if (b0Var.V || b0Var.h0 || b0Var.l0) {
            return;
        }
        b0Var.h0 = true;
        b0Var.g0.postDelayed(b0Var.y0, 150L);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        rg.z1 z1Var = (rg.z1) this.b;
        Bitmap bitmap = (Bitmap) this.c;
        z1Var.B0 = false;
        FileLog.e(exc);
        if (Build.VERSION.SDK_INT >= 24 && (exc instanceof nb.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && z1Var.isAttachedToWindow()) {
            AndroidUtilities.runOnUIThread(new p2.b(13, z1Var, bitmap), 2000L);
        } else {
            z1Var.C0 = true;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        com.google.android.gms.internal.cast.z5 z5Var = (com.google.android.gms.internal.cast.z5) this.b;
        ei.d dVar = (ei.d) this.c;
        FileLog.d("wear-auth: /token delivered to " + ((String) z5Var.a));
        dVar.setLoading(false);
        gi1.d = null;
        org.telegram.ui.ActionBar.h3 h3Var = gi1.c;
        if (h3Var != null) {
            h3Var.dismiss();
            gi1.c = null;
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        yh.o2 o2Var = (yh.o2) this.b;
        ei.d dVar = (ei.d) this.c;
        View view = (View) obj2;
        o2Var.getClass();
        long j10 = ((TL_stars.SavedStarGift) ((m61) obj).G).gift.id;
        if (o2Var.b == j10) {
            o2Var.b = 0L;
        } else {
            o2Var.b = j10;
        }
        dVar.setEnabled(o2Var.b != 0);
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt instanceof to0) {
                    to0 to0Var = (to0) childAt;
                    to0Var.b(o2Var.b == to0Var.getGiftId(), true);
                }
            }
        }
    }

    @Override // org.telegram.ui.xx
    public boolean w(ey eyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, ye1 ye1Var) {
        switch (this.a) {
            case 19:
                ug.e0 e0Var = (ug.e0) this.b;
                String str = (String) this.c;
                long j10 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    j10 = ((MessagesStorage.TopicKey) arrayList.get(i12)).dialogId;
                    e0Var.n.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(str, j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
                }
                eyVar.finishFragment();
                ug.h.h(j10);
                break;
            default:
                vg.e eVar = (vg.e) this.b;
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
                ug.h.h(j11);
                break;
        }
        return true;
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ void a0(View view, float f7, float f10) {
    }
}
