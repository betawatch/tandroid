package ag;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import android.graphics.RectF;
import android.os.Build;
import android.os.CancellationSignal;
import android.view.View;
import android.view.ViewGroup;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseCommonRegistrar;
import gh.c4;
import gh.t3;
import gh.w5;
import gh.x5;
import hh.i5;
import hh.s3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
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
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.wq0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.a51;
import org.telegram.ui.co0;
import org.telegram.ui.gy;
import org.telegram.ui.lo0;
import org.telegram.ui.mf1;
import org.telegram.ui.we1;
import org.telegram.ui.zx;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h0 implements org.telegram.ui.ActionBar.a2, b5.n, OnFailureListener, e3.b, co0, zx, OnCompleteListener, Continuation, d3.f, z8.d, s3, Utilities.Callback5, qk0, mf1, d5.l, d5.k, a51, qg.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.zx
    public /* synthetic */ boolean D() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.zx
    public /* synthetic */ boolean K(gy gyVar) {
        switch (this.a) {
        }
        return false;
    }

    @Override // hh.s3
    public void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, boolean z10) {
        t3 t3Var = (t3) this.b;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.c;
        wq0 wq0Var = t3Var.a;
        t3Var.e.l.remove(savedStarGift);
        t3Var.f(true);
        int i10 = t3Var.b;
        if (j10 == UserConfig.getInstance(i10).getClientUserId()) {
            mc a02 = mc.a0(wq0Var.a);
            TLRPC.Document document = tL_starGiftUnique.getDocument();
            String string = LocaleController.getString(R.string.BoughtResoldGiftTitle);
            int i11 = R.string.BoughtResoldGiftText;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            ec O = a02.O(document, string, LocaleController.formatString(i11, i0.a.m(tL_starGiftUnique.num, ',', sb2)));
            O.r = false;
            O.j();
        } else {
            ec O2 = mc.a0(wq0Var.a).O(tL_starGiftUnique.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(i10, j10)));
            O2.r = false;
            O2.j();
        }
        LaunchActivity launchActivity = LaunchActivity.C1;
        if (launchActivity != null) {
            launchActivity.t0.c(true);
        }
    }

    @Override // d3.f
    public Object apply(Object obj) {
        d3.h hVar = (d3.h) this.b;
        w2.i iVar = (w2.i) this.c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        d3.a aVar = hVar.d;
        ArrayList d = hVar.d(sQLiteDatabase, iVar, aVar.b);
        for (t2.d dVar : t2.d.values()) {
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
            sb2.append(((d3.b) d.get(i10)).a);
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
                set.add(new d3.g(query.getString(1), query.getString(2)));
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
        query.close();
        ListIterator listIterator = d.listIterator();
        while (listIterator.hasNext()) {
            d3.b bVar = (d3.b) listIterator.next();
            long j11 = bVar.a;
            if (hashMap.containsKey(Long.valueOf(j11))) {
                com.google.firebase.messaging.m c10 = bVar.c.c();
                for (d3.g gVar : (Set) hashMap.get(Long.valueOf(j11))) {
                    c10.c(gVar.a, gVar.b);
                }
                listIterator.set(new d3.b(j11, bVar.b, c10.i()));
            }
        }
        return d;
    }

    @Override // org.telegram.ui.co0
    public void b(int i10) {
        switch (this.a) {
            case 8:
                cg.v0 v0Var = (cg.v0) this.b;
                cg.v0 v0Var2 = (cg.v0) this.c;
                if (i10 != 1) {
                    if (i10 != 3) {
                        v0Var2.run(null);
                        break;
                    }
                } else {
                    v0Var.run(null);
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

    @Override // org.telegram.ui.Components.qk0
    public void c(float f10, float f11, int i10, View view) {
        x5.Q((x5) this.b, (w5) this.c, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0092  */
    @Override // b5.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p8.l0 d(int i10, j4.i1 i1Var, int[] iArr) {
        int i11;
        int i12;
        int i13;
        int i14;
        Point point;
        int i15;
        int i16;
        j4.i1 i1Var2 = i1Var;
        int i17 = this.a;
        Object obj = this.c;
        b5.i iVar = (b5.i) this.b;
        switch (i17) {
            case 1:
                int i18 = ((int[]) obj)[i10];
                int i19 = iVar.r;
                int i20 = iVar.s;
                boolean z10 = iVar.v;
                if (i19 == Integer.MAX_VALUE || i20 == Integer.MAX_VALUE) {
                    i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                } else {
                    i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    for (int i21 = 0; i21 < i1Var2.a; i21++) {
                        h3.t0 t0Var = i1Var2.d[i21];
                        int i22 = t0Var.G;
                        int i23 = t0Var.H;
                        if (i22 > 0 && i23 > 0) {
                            if (z10) {
                                if ((i22 > i23) != (i19 > i20)) {
                                    i14 = i19;
                                    i13 = i20;
                                    int i24 = i22 * i14;
                                    int i25 = i23 * i13;
                                    point = i24 < i25 ? new Point(i13, d5.g0.f(i25, i22)) : new Point(d5.g0.f(i24, i23), i14);
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
                p8.x xVar = p8.z.b;
                p8.l.a(4, "initialCapacity");
                Object[] objArr = new Object[4];
                int i26 = 0;
                int i27 = 0;
                while (i26 < i1Var2.a) {
                    h3.t0 t0Var2 = i1Var2.d[i26];
                    int i28 = t0Var2.G;
                    int i29 = (i28 == -1 || (i12 = t0Var2.H) == -1) ? -1 : i28 * i12;
                    b5.i iVar2 = iVar;
                    b5.p pVar = new b5.p(i10, i1Var2, i26, iVar2, iArr[i26], i18, i11 == Integer.MAX_VALUE || (i29 != -1 && i29 <= i11));
                    int i30 = i27 + 1;
                    if (objArr.length < i30) {
                        objArr = Arrays.copyOf(objArr, p8.w.d(objArr.length, i30));
                    }
                    objArr[i27] = pVar;
                    i26++;
                    i1Var2 = i1Var;
                    i27 = i30;
                    iVar = iVar2;
                }
                return p8.z.s(i27, objArr);
            default:
                String str = (String) obj;
                p8.x xVar2 = p8.z.b;
                p8.l.a(4, "initialCapacity");
                Object[] objArr2 = new Object[4];
                int i31 = 0;
                int i32 = 0;
                while (i31 < i1Var2.a) {
                    b5.i iVar3 = iVar;
                    b5.m mVar = new b5.m(i10, i1Var2, i31, iVar3, iArr[i31], str);
                    int i33 = i32 + 1;
                    if (objArr2.length < i33) {
                        objArr2 = Arrays.copyOf(objArr2, p8.w.d(objArr2.length, i33));
                    }
                    objArr2[i32] = mVar;
                    i31++;
                    i32 = i33;
                    iVar = iVar3;
                }
                return p8.z.s(i32, objArr2);
        }
    }

    @Override // d5.l
    public void e(Object obj, d5.g gVar) {
        i3.b bVar = (i3.b) obj;
        bVar.c((h3.c2) this.c, new g5.b(gVar, ((i3.f) this.b).e));
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                i1.Q((i1) this.b, (ArrayList) this.c);
                break;
            case 6:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                cg.a2 a2Var = (cg.a2) this.c;
                atomicBoolean.set(true);
                a2Var.run();
                break;
            case 7:
                ((cg.v0) this.b).run((TLRPC.TL_premiumGiftCodeOption) this.c);
                break;
            case 17:
                gh.v vVar = (gh.v) this.b;
                gh.r rVar = (gh.r) this.c;
                try {
                    int parseInt = Integer.parseInt(rVar.getText().toString().trim());
                    vVar.X(parseInt);
                    vVar.Y.setValue(parseInt);
                    b2Var.dismiss();
                    break;
                } catch (Throwable th) {
                    AndroidUtilities.shakeView(rVar);
                    FileLog.e(th);
                    return;
                }
            case 18:
                gh.b3 b3Var = (gh.b3) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                String obj = b3Var.getText().toString();
                if (obj.length() > 0 && obj.length() <= 12) {
                    callback.run(obj);
                    b2Var.dismiss();
                    break;
                } else {
                    AndroidUtilities.shakeView(b3Var);
                    break;
                }
                break;
            default:
                i5 i5Var = (i5) this.b;
                cg.y2[] y2VarArr = (cg.y2[]) this.c;
                we.d g10 = b2Var.g(i10, true, true);
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                h0 h0Var = new h0(24, i5Var, twoStepVerificationActivity);
                twoStepVerificationActivity.V = 2;
                twoStepVerificationActivity.X = h0Var;
                twoStepVerificationActivity.W = i5Var.C1();
                g10.d();
                twoStepVerificationActivity.s0(new androidx.car.app.utils.a(i5Var, y2VarArr, g10, twoStepVerificationActivity, 23));
                break;
        }
    }

    @Override // org.telegram.ui.Components.qk0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // qg.h
    public void g(RectF rectF, View view) {
        lg.d dVar = (lg.d) this.b;
        View view2 = (View) this.c;
        dVar.s(rectF.left, rectF.top);
        view2.invalidate();
    }

    @Override // org.telegram.ui.mf1
    public void h(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.a) {
            case 22:
                ((hh.r) this.b).h0(false, 0L, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.c);
                break;
            default:
                ((i5) this.b).M1(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.c);
                break;
        }
    }

    @Override // e3.b
    public Object i() {
        switch (this.a) {
            case 4:
                c3.g gVar = (c3.g) this.b;
                Iterable iterable = (Iterable) this.c;
                d3.h hVar = (d3.h) ((d3.d) gVar.c);
                hVar.getClass();
                if (iterable.iterator().hasNext()) {
                    hVar.a().compileStatement("DELETE FROM events WHERE _id in " + d3.h.g(iterable)).execute();
                    break;
                }
                break;
            default:
                c3.g gVar2 = (c3.g) this.b;
                for (Map.Entry entry : ((HashMap) this.c).entrySet()) {
                    ((d3.h) ((d3.c) gVar2.i)).e(((Integer) entry.getValue()).intValue(), z2.c.h, (String) entry.getKey());
                }
                break;
        }
        return null;
    }

    @Override // d5.k
    public void invoke(Object obj) {
        switch (this.a) {
            case 26:
                ((i3.b) obj).g((i3.a) this.b, (j4.x) this.c);
                break;
            default:
                ((i3.b) obj).onRenderedFirstFrame((i3.a) this.b);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((com.google.firebase.messaging.g) this.b).a((Intent) this.c);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception e9) {
        w0.i gVar;
        switch (this.a) {
            case 3:
                c1.e eVar = (c1.e) this.b;
                CancellationSignal cancellationSignal = (CancellationSignal) this.c;
                kotlin.jvm.internal.j.e(e9, "e");
                String str = ((e9 instanceof com.google.android.gms.common.api.f) && b1.d.b.contains(Integer.valueOf(((com.google.android.gms.common.api.f) e9).getStatusCode()))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
                String str2 = "During begin sign in, failure response from one tap: " + e9.getMessage();
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
                kotlin.jvm.internal.j.e(e9, "e");
                String str3 = ((e9 instanceof com.google.android.gms.common.api.f) && b1.d.b.contains(Integer.valueOf(((com.google.android.gms.common.api.f) e9).getStatusCode()))) ? "CREATE_INTERRUPTED" : "CREATE_UNKNOWN";
                String str4 = "During create public key credential, fido registration failure: " + e9.getMessage();
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
        c4 c4Var = (c4) this.b;
        lh.d dVar = (lh.d) this.c;
        View view = (View) obj2;
        c4Var.getClass();
        long j10 = ((TL_stars.SavedStarGift) ((n41) obj).G).gift.id;
        if (c4Var.b == j10) {
            c4Var.b = 0L;
        } else {
            c4Var.b = j10;
        }
        dVar.setEnabled(c4Var.b != 0);
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt instanceof lo0) {
                    lo0 lo0Var = (lo0) childAt;
                    lo0Var.b(c4Var.b == lo0Var.getGiftId(), true);
                }
            }
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        com.google.firebase.messaging.i iVar = (com.google.firebase.messaging.i) this.b;
        String str = (String) this.c;
        synchronized (iVar) {
            ((a0.f) iVar.b).remove(str);
        }
        return task;
    }

    @Override // z8.d
    public Object u0(af.h hVar) {
        String valueOf;
        String str = (String) this.b;
        r4.a aVar = (r4.a) this.c;
        Context context = (Context) hVar.a(Context.class);
        switch (aVar.a) {
            case 26:
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                if (applicationInfo != null) {
                    valueOf = String.valueOf(applicationInfo.targetSdkVersion);
                    break;
                }
                valueOf = "";
                break;
            case 27:
                valueOf = FirebaseCommonRegistrar.a(context);
                break;
            case 28:
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
        return new ga.a(str, valueOf);
    }

    @Override // org.telegram.ui.zx
    public boolean w(gy gyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, we1 we1Var) {
        switch (this.a) {
            case 10:
                cg.k1 k1Var = (cg.k1) this.b;
                String str = (String) this.c;
                long j10 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    j10 = ((MessagesStorage.TopicKey) arrayList.get(i12)).dialogId;
                    k1Var.n.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(str, j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
                }
                gyVar.finishFragment();
                cg.r.h(j10);
                break;
            default:
                dg.e eVar = (dg.e) this.b;
                String str2 = (String) this.c;
                long j11 = 0;
                int i13 = 0;
                while (i13 < arrayList.size()) {
                    j11 = ((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId;
                    eVar.e.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(str2, j11, null, null, null, true, null, null, null, true, 0, 0, null, false));
                    i13++;
                    eVar = eVar;
                }
                gyVar.finishFragment();
                cg.r.h(j11);
                break;
        }
        return true;
    }

    public /* synthetic */ h0(i3.a aVar, Object obj, long j10) {
        this.a = 27;
        this.b = aVar;
        this.c = obj;
    }

    @Override // org.telegram.ui.Components.qk0
    public /* synthetic */ void c0(View view, float f10, float f11) {
    }
}
