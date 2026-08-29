package a9;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Build;
import android.os.CancellationSignal;
import android.view.View;
import android.view.ViewGroup;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import bg.c2;
import bg.y2;
import cg.v0;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseCommonRegistrar;
import eg.u0;
import eg.w2;
import eg.y1;
import f5.d0;
import ih.n3;
import ih.p5;
import ih.q5;
import ih.v2;
import ih.w3;
import j3.t0;
import j7.l1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import jh.h5;
import jh.s3;
import l4.j1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.gr0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.w41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ao0;
import org.telegram.ui.fy;
import org.telegram.ui.jo0;
import org.telegram.ui.pf1;
import org.telegram.ui.yx;
import org.telegram.ui.ze1;
import q8.l0;
import q8.x;
import q8.z;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements z9.a, OnFailureListener, b2, OnCompleteListener, Continuation, d5.m, g3.b, ao0, yx, f3.f, e, s3, Utilities.Callback5, al0, pf1, f5.k, f5.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.yx
    public /* synthetic */ boolean C() {
        switch (this.a) {
        }
        return false;
    }

    @Override // a9.e
    public Object I0(a5.j jVar) {
        String valueOf;
        String str = (String) this.b;
        sg.j jVar2 = (sg.j) this.c;
        Context context = (Context) jVar.a(Context.class);
        switch (jVar2.a) {
            case 6:
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                if (applicationInfo != null) {
                    valueOf = String.valueOf(applicationInfo.targetSdkVersion);
                    break;
                }
                valueOf = "";
                break;
            case 7:
                valueOf = FirebaseCommonRegistrar.a(context);
                break;
            case 8:
                int i10 = Build.VERSION.SDK_INT;
                if (!context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                    if (!context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                        if (i10 >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                            valueOf = "auto";
                            break;
                        } else {
                            if (i10 >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                                valueOf = "embedded";
                                break;
                            }
                            valueOf = "";
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
                break;
            default:
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                if (installerPackageName != null) {
                    valueOf = FirebaseCommonRegistrar.b(installerPackageName);
                    break;
                }
                valueOf = "";
                break;
        }
        return new ha.a(str, valueOf);
    }

    @Override // org.telegram.ui.yx
    public /* synthetic */ boolean J(fy fyVar) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.ao0
    public void a(int i10) {
        switch (this.a) {
            case 13:
                u0 u0Var = (u0) this.b;
                u0 u0Var2 = (u0) this.c;
                if (i10 != 1) {
                    if (i10 != 3) {
                        u0Var2.run(null);
                        break;
                    }
                } else {
                    u0Var.run(null);
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

    @Override // f3.f
    public Object apply(Object obj) {
        f3.h hVar = (f3.h) this.b;
        y2.i iVar = (y2.i) this.c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        f3.a aVar = hVar.d;
        ArrayList d = hVar.d(sQLiteDatabase, iVar, aVar.b);
        for (v2.d dVar : v2.d.values()) {
            if (dVar != iVar.c) {
                int size = aVar.b - d.size();
                if (size <= 0) {
                    break;
                }
                d.addAll(hVar.d(sQLiteDatabase, iVar.b(dVar), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < d.size(); i10++) {
            sb2.append(((f3.b) d.get(i10)).a);
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
                set.add(new f3.g(query.getString(1), query.getString(2)));
            } catch (Throwable th2) {
                query.close();
                throw th2;
            }
        }
        query.close();
        ListIterator listIterator = d.listIterator();
        while (listIterator.hasNext()) {
            f3.b bVar = (f3.b) listIterator.next();
            long j11 = bVar.a;
            if (hashMap.containsKey(Long.valueOf(j11))) {
                c2 c3 = bVar.c.c();
                for (f3.g gVar : (Set) hashMap.get(Long.valueOf(j11))) {
                    c3.c(gVar.a, gVar.b);
                }
                listIterator.set(new f3.b(j11, bVar.b, c3.i()));
            }
        }
        return d;
    }

    @Override // org.telegram.ui.Components.al0
    public void b(float f9, float f10, int i10, View view) {
        q5.Q((q5) this.b, (p5) this.c, i10);
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ boolean b1(View view) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0092  */
    @Override // d5.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l0 c(int i10, j1 j1Var, int[] iArr) {
        int i11;
        int i12;
        int i13;
        int i14;
        Point point;
        int i15;
        int i16;
        j1 j1Var2 = j1Var;
        int i17 = this.a;
        Object obj = this.c;
        d5.h hVar = (d5.h) this.b;
        switch (i17) {
            case 7:
                int i18 = ((int[]) obj)[i10];
                int i19 = hVar.r;
                int i20 = hVar.s;
                boolean z10 = hVar.v;
                if (i19 == Integer.MAX_VALUE || i20 == Integer.MAX_VALUE) {
                    i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                } else {
                    i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    for (int i21 = 0; i21 < j1Var2.a; i21++) {
                        t0 t0Var = j1Var2.d[i21];
                        int i22 = t0Var.G;
                        int i23 = t0Var.H;
                        if (i22 > 0 && i23 > 0) {
                            if (z10) {
                                if ((i22 > i23) != (i19 > i20)) {
                                    i14 = i19;
                                    i13 = i20;
                                    int i24 = i22 * i14;
                                    int i25 = i23 * i13;
                                    point = i24 < i25 ? new Point(i13, d0.f(i25, i22)) : new Point(d0.f(i24, i23), i14);
                                    i15 = t0Var.G;
                                    i16 = i15 * i23;
                                    if (i15 >= ((int) (point.x * 0.98f)) && i23 >= ((int) (point.y * 0.98f)) && i16 < i11) {
                                        i11 = i16;
                                    }
                                }
                            }
                            i13 = i19;
                            i14 = i20;
                            int i242 = i22 * i14;
                            int i252 = i23 * i13;
                            if (i242 < i252) {
                            }
                            i15 = t0Var.G;
                            i16 = i15 * i23;
                            if (i15 >= ((int) (point.x * 0.98f))) {
                                i11 = i16;
                            }
                        }
                    }
                }
                x xVar = z.b;
                q8.l.a(4, "initialCapacity");
                Object[] objArr = new Object[4];
                int i26 = 0;
                int i27 = 0;
                while (i26 < j1Var2.a) {
                    t0 t0Var2 = j1Var2.d[i26];
                    int i28 = t0Var2.G;
                    int i29 = (i28 == -1 || (i12 = t0Var2.H) == -1) ? -1 : i28 * i12;
                    d5.h hVar2 = hVar;
                    d5.o oVar = new d5.o(i10, j1Var2, i26, hVar2, iArr[i26], i18, i11 == Integer.MAX_VALUE || (i29 != -1 && i29 <= i11));
                    int i30 = i27 + 1;
                    if (objArr.length < i30) {
                        objArr = Arrays.copyOf(objArr, q8.w.d(objArr.length, i30));
                    }
                    objArr[i27] = oVar;
                    i26++;
                    j1Var2 = j1Var;
                    i27 = i30;
                    hVar = hVar2;
                }
                return z.s(i27, objArr);
            default:
                String str = (String) obj;
                x xVar2 = z.b;
                q8.l.a(4, "initialCapacity");
                Object[] objArr2 = new Object[4];
                int i31 = 0;
                int i32 = 0;
                while (i31 < j1Var2.a) {
                    d5.h hVar3 = hVar;
                    d5.l lVar = new d5.l(i10, j1Var2, i31, hVar3, iArr[i31], str);
                    int i33 = i32 + 1;
                    if (objArr2.length < i33) {
                        objArr2 = Arrays.copyOf(objArr2, q8.w.d(objArr2.length, i33));
                    }
                    objArr2[i32] = lVar;
                    i31++;
                    i32 = i33;
                    hVar = hVar3;
                }
                return z.s(i32, objArr2);
        }
    }

    @Override // jh.s3
    public void d(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, boolean z10) {
        n3 n3Var = (n3) this.b;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.c;
        gr0 gr0Var = n3Var.a;
        n3Var.e.l.remove(savedStarGift);
        n3Var.f(true);
        int i10 = n3Var.b;
        if (j10 == UserConfig.getInstance(i10).getClientUserId()) {
            tc a02 = tc.a0(gr0Var.a);
            TLRPC.Document document = tL_starGiftUnique.getDocument();
            String string = LocaleController.getString(R.string.BoughtResoldGiftTitle);
            int i11 = R.string.BoughtResoldGiftText;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            mc O = a02.O(document, string, LocaleController.formatString(i11, l1.m(tL_starGiftUnique.num, ',', sb2)));
            O.r = false;
            O.j();
        } else {
            mc O2 = tc.a0(gr0Var.a).O(tL_starGiftUnique.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(i10, j10)));
            O2.r = false;
            O2.j();
        }
        LaunchActivity launchActivity = LaunchActivity.C1;
        if (launchActivity != null) {
            launchActivity.t0.c(true);
        }
    }

    @Override // f5.k
    public void e(Object obj, f5.g gVar) {
        k3.b bVar = (k3.b) obj;
        bVar.g((j3.c2) this.c, new g9.l(gVar, ((k3.f) this.b).e));
    }

    @Override // g3.b
    public Object f() {
        switch (this.a) {
            case 9:
                e3.f fVar = (e3.f) this.b;
                Iterable iterable = (Iterable) this.c;
                f3.h hVar = (f3.h) ((f3.d) fVar.c);
                hVar.getClass();
                if (iterable.iterator().hasNext()) {
                    hVar.a().compileStatement("DELETE FROM events WHERE _id in " + f3.h.g(iterable)).execute();
                    break;
                }
                break;
            default:
                e3.f fVar2 = (e3.f) this.b;
                for (Map.Entry entry : ((HashMap) this.c).entrySet()) {
                    ((f3.h) ((f3.c) fVar2.i)).e(((Integer) entry.getValue()).intValue(), b3.c.h, (String) entry.getKey());
                }
                break;
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 3:
                v0.Q((v0) this.b, (ArrayList) this.c);
                break;
            case 11:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                y1 y1Var = (y1) this.c;
                atomicBoolean.set(true);
                y1Var.run();
                break;
            case 12:
                ((u0) this.b).run((TLRPC.TL_premiumGiftCodeOption) this.c);
                break;
            case 19:
                ih.t tVar = (ih.t) this.b;
                bh.b bVar = (bh.b) this.c;
                try {
                    int parseInt = Integer.parseInt(bVar.getText().toString().trim());
                    tVar.X(parseInt);
                    tVar.Y.setValue(parseInt);
                    c2Var.dismiss();
                    break;
                } catch (Throwable th2) {
                    AndroidUtilities.shakeView(bVar);
                    FileLog.e(th2);
                    return;
                }
            case 20:
                v2 v2Var = (v2) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                String obj = v2Var.getText().toString();
                if (obj.length() > 0 && obj.length() <= 12) {
                    callback.run(obj);
                    c2Var.dismiss();
                    break;
                } else {
                    AndroidUtilities.shakeView(v2Var);
                    break;
                }
                break;
            default:
                h5 h5Var = (h5) this.b;
                w2[] w2VarArr = (w2[]) this.c;
                ye.c g10 = c2Var.g(i10, true, true);
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                s sVar = new s(26, h5Var, twoStepVerificationActivity);
                twoStepVerificationActivity.V = 2;
                twoStepVerificationActivity.X = sVar;
                twoStepVerificationActivity.W = h5Var.C1();
                g10.d();
                twoStepVerificationActivity.s0(new androidx.car.app.utils.b(h5Var, w2VarArr, g10, twoStepVerificationActivity, 23));
                break;
        }
    }

    @Override // org.telegram.ui.pf1
    public void i(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.a) {
            case 24:
                ((jh.q) this.b).h0(false, 0L, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.c);
                break;
            default:
                ((h5) this.b).M1(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.c);
                break;
        }
    }

    @Override // f5.j
    public void invoke(Object obj) {
        switch (this.a) {
            case 28:
                ((k3.b) obj).b((k3.a) this.b, (l4.x) this.c);
                break;
            default:
                ((k3.b) obj).onRenderedFirstFrame((k3.a) this.b);
                break;
        }
    }

    @Override // z9.a
    public void j(z9.b bVar) {
        z9.a aVar = (z9.a) this.b;
        z9.a aVar2 = (z9.a) this.c;
        aVar.j(bVar);
        aVar2.j(bVar);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((com.google.firebase.messaging.g) this.b).a((Intent) this.c);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception e10) {
        w0.i gVar;
        switch (this.a) {
            case 1:
                y2 y2Var = (y2) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                y2Var.x0 = false;
                FileLog.e(e10);
                if (Build.VERSION.SDK_INT >= 24 && (e10 instanceof wa.a) && e10.getMessage() != null && e10.getMessage().contains("segmentation optional module to be downloaded") && y2Var.isAttachedToWindow()) {
                    AndroidUtilities.runOnUIThread(new a1.e(12, y2Var, bitmap), 2000L);
                    return;
                } else {
                    y2Var.y0 = true;
                    return;
                }
            case 2:
                c1.e eVar = (c1.e) this.b;
                CancellationSignal cancellationSignal = (CancellationSignal) this.c;
                kotlin.jvm.internal.j.e(e10, "e");
                String str = ((e10 instanceof com.google.android.gms.common.api.f) && b1.d.b.contains(Integer.valueOf(((com.google.android.gms.common.api.f) e10).getStatusCode()))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
                String str2 = "During begin sign in, failure response from one tap: " + e10.getMessage();
                int hashCode = str.hashCode();
                if (hashCode == -1567968963) {
                    if (str.equals("GET_CANCELED_TAG")) {
                        gVar = new w0.g(str2);
                    }
                    gVar = new w0.h(str2, 2);
                } else if (hashCode != -154594663) {
                    if (hashCode == 1996705159 && str.equals("GET_NO_CREDENTIALS")) {
                        gVar = new w0.k(str2);
                    }
                    gVar = new w0.h(str2, 2);
                } else {
                    if (str.equals("GET_INTERRUPTED")) {
                        gVar = new w0.j(str2);
                    }
                    gVar = new w0.h(str2, 2);
                }
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (a1.g.a(cancellationSignal)) {
                    return;
                }
                eVar.f().execute(new c1.a(eVar, gVar, 0));
                return;
            default:
                d1.e eVar2 = (d1.e) this.b;
                CancellationSignal cancellationSignal2 = (CancellationSignal) this.c;
                kotlin.jvm.internal.j.e(e10, "e");
                String str3 = ((e10 instanceof com.google.android.gms.common.api.f) && b1.d.b.contains(Integer.valueOf(((com.google.android.gms.common.api.f) e10).getStatusCode()))) ? "CREATE_INTERRUPTED" : "CREATE_UNKNOWN";
                String str4 = "During create public key credential, fido registration failure: " + e10.getMessage();
                w0.d bVar = str3.equals("CREATE_CANCELED") ? new w0.b(str4) : str3.equals("CREATE_INTERRUPTED") ? new w0.e(str4) : new w0.c(str4, 2);
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (a1.g.a(cancellationSignal2)) {
                    return;
                }
                Executor executor = eVar2.g;
                if (executor != null) {
                    executor.execute(new d1.a(eVar2, bVar, 1));
                    return;
                } else {
                    kotlin.jvm.internal.j.h("executor");
                    throw null;
                }
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        w3 w3Var = (w3) this.b;
        nh.d dVar = (nh.d) this.c;
        View view = (View) obj2;
        w3Var.getClass();
        long j10 = ((TL_stars.SavedStarGift) ((w41) obj).G).gift.id;
        if (w3Var.b == j10) {
            w3Var.b = 0L;
        } else {
            w3Var.b = j10;
        }
        dVar.setEnabled(w3Var.b != 0);
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt instanceof jo0) {
                    jo0 jo0Var = (jo0) childAt;
                    jo0Var.b(w3Var.b == jo0Var.getGiftId(), true);
                }
            }
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        com.google.firebase.messaging.j jVar = (com.google.firebase.messaging.j) this.b;
        String str = (String) this.c;
        synchronized (jVar) {
            ((a0.f) jVar.b).remove(str);
        }
        return task;
    }

    @Override // org.telegram.ui.yx
    public boolean v(fy fyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, ze1 ze1Var) {
        switch (this.a) {
            case 15:
                eg.j1 j1Var = (eg.j1) this.b;
                String str = (String) this.c;
                long j10 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    j10 = ((MessagesStorage.TopicKey) arrayList.get(i12)).dialogId;
                    j1Var.n.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(str, j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
                }
                fyVar.finishFragment();
                eg.s.h(j10);
                break;
            default:
                fg.e eVar = (fg.e) this.b;
                String str2 = (String) this.c;
                long j11 = 0;
                int i13 = 0;
                while (i13 < arrayList.size()) {
                    j11 = ((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId;
                    eVar.e.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(str2, j11, null, null, null, true, null, null, null, true, 0, 0, null, false));
                    i13++;
                    eVar = eVar;
                }
                fyVar.finishFragment();
                eg.s.h(j11);
                break;
        }
        return true;
    }

    public /* synthetic */ s(k3.a aVar, Object obj, long j10) {
        this.a = 29;
        this.b = aVar;
        this.c = obj;
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ void o0(View view, float f9, float f10) {
    }
}
