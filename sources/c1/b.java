package c1;

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
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseCommonRegistrar;
import eg.t2;
import f3.g;
import f3.h;
import f5.m;
import f5.o;
import fg.v0;
import h5.d0;
import h5.j;
import h5.k;
import hg.i1;
import hg.t0;
import hg.v2;
import hg.x1;
import j3.a2;
import j3.n0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import lh.n3;
import lh.p5;
import lh.q5;
import lh.s;
import lh.u2;
import lh.w3;
import mh.g5;
import mh.p;
import mh.r3;
import o4.r;
import o4.s0;
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
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ig1;
import org.telegram.ui.jy;
import org.telegram.ui.ko0;
import org.telegram.ui.py;
import org.telegram.ui.sf1;
import org.telegram.ui.vo0;
import s8.i0;
import s8.l;
import s8.t;
import s8.v;
import y2.i;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements OnFailureListener, ba.a, OnCompleteListener, Continuation, g3.b, f3.f, m, c2, ko0, jy, c9.e, k, j, r3, Utilities.Callback5, jl0, ig1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.jy
    public /* synthetic */ boolean C() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.jy
    public /* synthetic */ boolean J(py pyVar) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.jl0
    public /* synthetic */ boolean Y0(View view) {
        return false;
    }

    @Override // org.telegram.ui.ko0
    public void a(int i10) {
        switch (this.a) {
            case 14:
                t0 t0Var = (t0) this.b;
                t0 t0Var2 = (t0) this.c;
                if (i10 != 1) {
                    if (i10 != 3) {
                        t0Var2.run(null);
                        break;
                    }
                } else {
                    t0Var.run(null);
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
        h hVar = (h) this.b;
        i iVar = (i) this.c;
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
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < d.size(); i10++) {
            sb.append(((f3.b) d.get(i10)).a);
            if (i10 < d.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
        while (query.moveToNext()) {
            try {
                long j10 = query.getLong(0);
                Set set = (Set) hashMap.get(Long.valueOf(j10));
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(Long.valueOf(j10), set);
                }
                set.add(new g(query.getString(1), query.getString(2)));
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
                a9.a c3 = bVar.c.c();
                for (g gVar : (Set) hashMap.get(Long.valueOf(j11))) {
                    c3.c(gVar.a, gVar.b);
                }
                listIterator.set(new f3.b(j11, bVar.b, c3.j()));
            }
        }
        return d;
    }

    @Override // mh.r3
    public void b(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, boolean z4) {
        n3 n3Var = (n3) this.b;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.c;
        or0 or0Var = n3Var.a;
        n3Var.e.l.remove(savedStarGift);
        n3Var.f(true);
        int i10 = n3Var.b;
        if (j10 == UserConfig.getInstance(i10).getClientUserId()) {
            qc a02 = qc.a0(or0Var.a);
            TLRPC.Document document = tL_starGiftUnique.getDocument();
            String string = LocaleController.getString(R.string.BoughtResoldGiftTitle);
            int i11 = R.string.BoughtResoldGiftText;
            StringBuilder sb = new StringBuilder();
            sb.append(tL_starGiftUnique.title);
            sb.append(" #");
            ic O = a02.O(document, string, LocaleController.formatString(i11, l.d.l(tL_starGiftUnique.num, ',', sb)));
            O.r = false;
            O.j();
        } else {
            ic O2 = qc.a0(or0Var.a).O(tL_starGiftUnique.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(i10, j10)));
            O2.r = false;
            O2.j();
        }
        LaunchActivity launchActivity = LaunchActivity.D1;
        if (launchActivity != null) {
            launchActivity.u0.c(true);
        }
    }

    @Override // org.telegram.ui.Components.jl0
    public void c(float f10, float f11, int i10, View view) {
        q5.Q((q5) this.b, (p5) this.c, i10);
    }

    @Override // h5.k
    public void d(Object obj, h5.g gVar) {
        k3.b bVar = (k3.b) obj;
        bVar.a((a2) this.c, new f7.b(gVar, ((k3.f) this.b).e));
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a0  */
    @Override // f5.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i0 e(int i10, s0 s0Var, int[] iArr) {
        int i11;
        int i12;
        int i13;
        int i14;
        Point point;
        int i15;
        int i16;
        Object[] objArr;
        s0 s0Var2 = s0Var;
        int i17 = this.a;
        Object obj = this.c;
        f5.h hVar = (f5.h) this.b;
        switch (i17) {
            case 9:
                int i18 = ((int[]) obj)[i10];
                int i19 = hVar.r;
                int i20 = hVar.s;
                boolean z4 = hVar.v;
                if (i19 == Integer.MAX_VALUE || i20 == Integer.MAX_VALUE) {
                    i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                } else {
                    i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    for (int i21 = 0; i21 < s0Var2.a; i21++) {
                        n0 n0Var = s0Var2.d[i21];
                        int i22 = n0Var.H;
                        int i23 = n0Var.I;
                        if (i22 > 0 && i23 > 0) {
                            if (z4) {
                                if ((i22 > i23) != (i19 > i20)) {
                                    i14 = i19;
                                    i13 = i20;
                                    int i24 = i22 * i14;
                                    int i25 = i23 * i13;
                                    point = i24 < i25 ? new Point(i13, d0.f(i25, i22)) : new Point(d0.f(i24, i23), i14);
                                    i15 = n0Var.H;
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
                            i15 = n0Var.H;
                            i16 = i15 * i23;
                            if (i15 >= ((int) (point.x * 0.98f))) {
                                i11 = i16;
                            }
                        }
                    }
                }
                l.c(4, "initialCapacity");
                Object[] objArr2 = new Object[4];
                int i26 = 0;
                int i27 = 0;
                boolean z10 = false;
                while (i26 < s0Var2.a) {
                    n0 n0Var2 = s0Var2.d[i26];
                    int i28 = n0Var2.H;
                    int i29 = (i28 == -1 || (i12 = n0Var2.I) == -1) ? -1 : i28 * i12;
                    f5.h hVar2 = hVar;
                    o oVar = new o(i10, s0Var2, i26, hVar2, iArr[i26], i18, i11 == Integer.MAX_VALUE || (i29 != -1 && i29 <= i11));
                    int i30 = i27 + 1;
                    if (objArr2.length < i30) {
                        objArr2 = Arrays.copyOf(objArr2, w.g(objArr2.length, i30));
                    } else if (z10) {
                        objArr2 = (Object[]) objArr2.clone();
                    } else {
                        objArr2[i27] = oVar;
                        i26++;
                        s0Var2 = s0Var;
                        i27++;
                        hVar = hVar2;
                    }
                    z10 = false;
                    objArr2[i27] = oVar;
                    i26++;
                    s0Var2 = s0Var;
                    i27++;
                    hVar = hVar2;
                }
                return v.s(i27, objArr2);
            default:
                String str = (String) obj;
                t tVar = v.b;
                l.c(4, "initialCapacity");
                Object[] objArr3 = new Object[4];
                int i31 = 0;
                int i32 = 0;
                boolean z11 = false;
                while (i31 < s0Var2.a) {
                    f5.h hVar3 = hVar;
                    f5.l lVar = new f5.l(i10, s0Var2, i31, hVar3, iArr[i31], str);
                    int i33 = i32 + 1;
                    if (objArr3.length < i33) {
                        objArr = Arrays.copyOf(objArr3, w.g(objArr3.length, i33));
                    } else if (z11) {
                        objArr = (Object[]) objArr3.clone();
                    } else {
                        objArr3[i32] = lVar;
                        i31++;
                        i32++;
                        hVar = hVar3;
                    }
                    objArr3 = objArr;
                    z11 = false;
                    objArr3[i32] = lVar;
                    i31++;
                    i32++;
                    hVar = hVar3;
                }
                return v.s(i32, objArr3);
        }
    }

    @Override // c9.e
    public Object e0(c5.j jVar) {
        String valueOf;
        String str = (String) this.b;
        sg.a aVar = (sg.a) this.c;
        Context context = (Context) jVar.a(Context.class);
        switch (aVar.a) {
            case 24:
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                if (applicationInfo != null) {
                    valueOf = String.valueOf(applicationInfo.targetSdkVersion);
                    break;
                }
                valueOf = "";
                break;
            case 25:
                valueOf = FirebaseCommonRegistrar.a(context);
                break;
            case 26:
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
        return new ja.a(str, valueOf);
    }

    @Override // ba.a
    public void f(ba.b bVar) {
        ba.a aVar = (ba.a) this.b;
        ba.a aVar2 = (ba.a) this.c;
        aVar.f(bVar);
        aVar2.f(bVar);
    }

    @Override // g3.b
    public Object g() {
        switch (this.a) {
            case 5:
                e3.g gVar = (e3.g) this.b;
                Iterable iterable = (Iterable) this.c;
                h hVar = (h) ((f3.d) gVar.c);
                hVar.getClass();
                if (iterable.iterator().hasNext()) {
                    hVar.a().compileStatement("DELETE FROM events WHERE _id in " + h.g(iterable)).execute();
                    break;
                }
                break;
            default:
                e3.g gVar2 = (e3.g) this.b;
                for (Map.Entry entry : ((HashMap) this.c).entrySet()) {
                    ((h) ((f3.c) gVar2.i)).e(((Integer) entry.getValue()).intValue(), b3.c.h, (String) entry.getKey());
                }
                break;
        }
        return null;
    }

    @Override // org.telegram.ui.ig1
    public void i(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.a) {
            case 27:
                ((p) this.b).h0(false, 0L, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.c);
                break;
            default:
                ((g5) this.b).M1(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.c);
                break;
        }
    }

    @Override // h5.j
    public void invoke(Object obj) {
        switch (this.a) {
            case 20:
                ((k3.b) obj).c((k3.a) this.b, (r) this.c);
                break;
            default:
                ((k3.b) obj).onRenderedFirstFrame((k3.a) this.b);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(d2 d2Var, int i10) {
        switch (this.a) {
            case 11:
                v0.Q((v0) this.b, (ArrayList) this.c);
                break;
            case 12:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                x1 x1Var = (x1) this.c;
                atomicBoolean.set(true);
                x1Var.run();
                break;
            case 13:
                ((t0) this.b).run((TLRPC.TL_premiumGiftCodeOption) this.c);
                break;
            case 22:
                s sVar = (s) this.b;
                eh.b bVar = (eh.b) this.c;
                try {
                    int parseInt = Integer.parseInt(bVar.getText().toString().trim());
                    sVar.X(parseInt);
                    sVar.Z.setValue(parseInt);
                    d2Var.dismiss();
                    break;
                } catch (Throwable th2) {
                    AndroidUtilities.shakeView(bVar);
                    FileLog.e(th2);
                    return;
                }
            case 23:
                u2 u2Var = (u2) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                String obj = u2Var.getText().toString();
                if (obj.length() > 0 && obj.length() <= 12) {
                    callback.run(obj);
                    d2Var.dismiss();
                    break;
                } else {
                    AndroidUtilities.shakeView(u2Var);
                    break;
                }
                break;
            default:
                g5 g5Var = (g5) this.b;
                v2[] v2VarArr = (v2[]) this.c;
                af.f g10 = d2Var.g(i10, true, true);
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                b bVar2 = new b(29, g5Var, twoStepVerificationActivity);
                twoStepVerificationActivity.W = 2;
                twoStepVerificationActivity.Y = bVar2;
                twoStepVerificationActivity.X = g5Var.C1();
                g10.d();
                twoStepVerificationActivity.s0(new androidx.car.app.utils.b(g5Var, v2VarArr, g10, twoStepVerificationActivity, 25));
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((com.google.firebase.messaging.g) this.b).a((Intent) this.c);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception e6) {
        w0.i gVar;
        switch (this.a) {
            case 0:
                f fVar = (f) this.b;
                CancellationSignal cancellationSignal = (CancellationSignal) this.c;
                kotlin.jvm.internal.j.e(e6, "e");
                String str = ((e6 instanceof com.google.android.gms.common.api.f) && b1.d.b.contains(Integer.valueOf(((com.google.android.gms.common.api.f) e6).getStatusCode()))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
                String str2 = "During begin sign in, failure response from one tap: " + e6.getMessage();
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
                fVar.f().execute(new a(fVar, gVar, 0));
                return;
            case 4:
                d1.e eVar = (d1.e) this.b;
                CancellationSignal cancellationSignal2 = (CancellationSignal) this.c;
                kotlin.jvm.internal.j.e(e6, "e");
                String str3 = ((e6 instanceof com.google.android.gms.common.api.f) && b1.d.b.contains(Integer.valueOf(((com.google.android.gms.common.api.f) e6).getStatusCode()))) ? "CREATE_INTERRUPTED" : "CREATE_UNKNOWN";
                String str4 = "During create public key credential, fido registration failure: " + e6.getMessage();
                w0.d bVar = str3.equals("CREATE_CANCELED") ? new w0.b(str4) : str3.equals("CREATE_INTERRUPTED") ? new w0.e(str4) : new w0.c(str4, 2);
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (a1.g.a(cancellationSignal2)) {
                    return;
                }
                Executor executor = eVar.g;
                if (executor != null) {
                    executor.execute(new d1.a(eVar, bVar, 1));
                    return;
                } else {
                    kotlin.jvm.internal.j.h("executor");
                    throw null;
                }
            default:
                t2 t2Var = (t2) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                t2Var.y0 = false;
                FileLog.e(e6);
                if (Build.VERSION.SDK_INT >= 24 && (e6 instanceof ya.a) && e6.getMessage() != null && e6.getMessage().contains("segmentation optional module to be downloaded") && t2Var.isAttachedToWindow()) {
                    AndroidUtilities.runOnUIThread(new a1.e(22, t2Var, bitmap), 2000L);
                    return;
                } else {
                    t2Var.z0 = true;
                    return;
                }
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        w3 w3Var = (w3) this.b;
        qh.d dVar = (qh.d) this.c;
        View view = (View) obj2;
        w3Var.getClass();
        long j10 = ((TL_stars.SavedStarGift) ((h51) obj).G).gift.id;
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
                if (childAt instanceof vo0) {
                    vo0 vo0Var = (vo0) childAt;
                    vo0Var.b(w3Var.b == vo0Var.getGiftId(), true);
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

    @Override // org.telegram.ui.jy
    public boolean v(py pyVar, ArrayList arrayList, CharSequence charSequence, boolean z4, boolean z10, int i10, int i11, sf1 sf1Var) {
        switch (this.a) {
            case 16:
                i1 i1Var = (i1) this.b;
                String str = (String) this.c;
                long j10 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    j10 = ((MessagesStorage.TopicKey) arrayList.get(i12)).dialogId;
                    i1Var.n.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(str, j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
                }
                pyVar.finishFragment();
                hg.r.h(j10);
                break;
            default:
                ig.e eVar = (ig.e) this.b;
                String str2 = (String) this.c;
                long j11 = 0;
                int i13 = 0;
                while (i13 < arrayList.size()) {
                    j11 = ((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId;
                    eVar.e.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(str2, j11, null, null, null, true, null, null, null, true, 0, 0, null, false));
                    i13++;
                    eVar = eVar;
                }
                pyVar.finishFragment();
                hg.r.h(j11);
                break;
        }
        return true;
    }

    public /* synthetic */ b(k3.a aVar, Object obj, long j10) {
        this.a = 21;
        this.b = aVar;
        this.c = obj;
    }

    @Override // org.telegram.ui.Components.jl0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
