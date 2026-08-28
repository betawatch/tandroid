package b5;

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
import bg.h2;
import bg.p1;
import bg.z0;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseCommonRegistrar;
import d5.f0;
import fh.e6;
import fh.f6;
import fh.g3;
import fh.h1;
import fh.y3;
import gh.k5;
import gh.u3;
import h3.t0;
import ih.i4;
import j3.r0;
import j4.i1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kh.f1;
import kh.o8;
import kh.r9;
import kh.w8;
import o8.l0;
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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.nk0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.b51;
import org.telegram.ui.bo0;
import org.telegram.ui.dy;
import org.telegram.ui.ko0;
import org.telegram.ui.nf1;
import org.telegram.ui.we1;
import org.telegram.ui.wx;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements o, b2, bo0, wx, OnFailureListener, e3.b, OnCompleteListener, Continuation, d3.f, y8.d, u3, Utilities.Callback5, nk0, nf1, b51, d5.l, d5.k, pg.g, w8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.wx
    public /* synthetic */ boolean C() {
        switch (this.a) {
        }
        return false;
    }

    @Override // y8.d
    public Object H1(b3.b bVar) {
        String valueOf;
        String str = (String) this.b;
        s0.b bVar2 = (s0.b) this.c;
        Context context = (Context) bVar.a(Context.class);
        switch (bVar2.a) {
            case 18:
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                if (applicationInfo != null) {
                    valueOf = String.valueOf(applicationInfo.targetSdkVersion);
                    break;
                }
                valueOf = "";
                break;
            case 19:
                valueOf = FirebaseCommonRegistrar.a(context);
                break;
            case 20:
                int i9 = Build.VERSION.SDK_INT;
                if (!context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                    if (!context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                        if (i9 >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                            valueOf = "auto";
                            break;
                        } else {
                            if (i9 >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
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
        return new fa.a(str, valueOf);
    }

    @Override // org.telegram.ui.wx
    public /* synthetic */ boolean I(dy dyVar) {
        switch (this.a) {
        }
        return false;
    }

    @Override // gh.u3
    public void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, boolean z10) {
        y3 y3Var = (y3) this.b;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.c;
        vq0 vq0Var = y3Var.a;
        y3Var.e.l.remove(savedStarGift);
        y3Var.f(true);
        int i9 = y3Var.b;
        if (j10 == UserConfig.getInstance(i9).getClientUserId()) {
            oc a02 = oc.a0(vq0Var.a);
            TLRPC.Document document = tL_starGiftUnique.getDocument();
            String string = LocaleController.getString(R.string.BoughtResoldGiftTitle);
            int i10 = R.string.BoughtResoldGiftText;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            gc O = a02.O(document, string, LocaleController.formatString(i10, r0.n(tL_starGiftUnique.num, ',', sb2)));
            O.r = false;
            O.j();
        } else {
            gc O2 = oc.a0(vq0Var.a).O(tL_starGiftUnique.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(i9, j10)));
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
        for (int i9 = 0; i9 < d.size(); i9++) {
            sb2.append(((d3.b) d.get(i9)).a);
            if (i9 < d.size() - 1) {
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

    @Override // org.telegram.ui.bo0
    public void b(int i9) {
        switch (this.a) {
            case 4:
                z0 z0Var = (z0) this.b;
                z0 z0Var2 = (z0) this.c;
                if (i9 != 1) {
                    if (i9 != 3) {
                        z0Var2.run(null);
                        break;
                    }
                } else {
                    z0Var.run(null);
                    break;
                }
                break;
            default:
                Utilities.Callback callback = (Utilities.Callback) this.b;
                Utilities.Callback callback2 = (Utilities.Callback) this.c;
                if (i9 != 1) {
                    if (i9 != 3) {
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

    @Override // org.telegram.ui.Components.nk0
    public void c(float f10, float f11, int i9, View view) {
        f6.P((f6) this.b, (e6) this.c, i9);
    }

    @Override // kh.w8
    public void d(r9 r9Var, boolean z10, boolean z11, boolean z12, boolean z13, TLRPC.InputPeer inputPeer, int i9, o8 o8Var, f1 f1Var) {
        i4 i4Var = (i4) this.b;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.c;
        TL_stories.TL_stories_editStory tL_stories_editStory = new TL_stories.TL_stories_editStory();
        tL_stories_editStory.peer = MessagesController.getInstance(i4Var.y2).getInputPeer(storyItem.dialogId);
        tL_stories_editStory.id = storyItem.id;
        tL_stories_editStory.flags |= 4;
        tL_stories_editStory.privacy_rules = r9Var.b;
        ConnectionsManager.getInstance(i4Var.y2).sendRequest(tL_stories_editStory, new h1(i4Var, o8Var, storyItem, r9Var, 6));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0092  */
    @Override // b5.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l0 e(int i9, i1 i1Var, int[] iArr) {
        int i10;
        int i11;
        int i12;
        int i13;
        Point point;
        int i14;
        int i15;
        i1 i1Var2 = i1Var;
        int i16 = this.a;
        Object obj = this.c;
        j jVar = (j) this.b;
        switch (i16) {
            case 0:
                int i17 = ((int[]) obj)[i9];
                int i18 = jVar.r;
                int i19 = jVar.s;
                boolean z10 = jVar.v;
                if (i18 == Integer.MAX_VALUE || i19 == Integer.MAX_VALUE) {
                    i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                } else {
                    i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    for (int i20 = 0; i20 < i1Var2.a; i20++) {
                        t0 t0Var = i1Var2.d[i20];
                        int i21 = t0Var.G;
                        int i22 = t0Var.H;
                        if (i21 > 0 && i22 > 0) {
                            if (z10) {
                                if ((i21 > i22) != (i18 > i19)) {
                                    i13 = i18;
                                    i12 = i19;
                                    int i23 = i21 * i13;
                                    int i24 = i22 * i12;
                                    point = i23 < i24 ? new Point(i12, f0.f(i24, i21)) : new Point(f0.f(i23, i22), i13);
                                    i14 = t0Var.G;
                                    i15 = i14 * i22;
                                    if (i14 >= ((int) (point.x * 0.98f)) && i22 >= ((int) (point.y * 0.98f)) && i15 < i10) {
                                        i10 = i15;
                                    }
                                }
                            }
                            i12 = i18;
                            i13 = i19;
                            int i232 = i21 * i13;
                            int i242 = i22 * i12;
                            if (i232 < i242) {
                            }
                            i14 = t0Var.G;
                            i15 = i14 * i22;
                            if (i14 >= ((int) (point.x * 0.98f))) {
                                i10 = i15;
                            }
                        }
                    }
                }
                o8.x xVar = o8.z.b;
                o8.l.a(4, "initialCapacity");
                Object[] objArr = new Object[4];
                int i25 = 0;
                int i26 = 0;
                while (i25 < i1Var2.a) {
                    t0 t0Var2 = i1Var2.d[i25];
                    int i27 = t0Var2.G;
                    int i28 = (i27 == -1 || (i11 = t0Var2.H) == -1) ? -1 : i27 * i11;
                    j jVar2 = jVar;
                    q qVar = new q(i9, i1Var2, i25, jVar2, iArr[i25], i17, i10 == Integer.MAX_VALUE || (i28 != -1 && i28 <= i10));
                    int i29 = i26 + 1;
                    if (objArr.length < i29) {
                        objArr = Arrays.copyOf(objArr, o8.w.d(objArr.length, i29));
                    }
                    objArr[i26] = qVar;
                    i25++;
                    i1Var2 = i1Var;
                    i26 = i29;
                    jVar = jVar2;
                }
                return o8.z.s(i26, objArr);
            default:
                String str = (String) obj;
                o8.x xVar2 = o8.z.b;
                o8.l.a(4, "initialCapacity");
                Object[] objArr2 = new Object[4];
                int i30 = 0;
                int i31 = 0;
                while (i30 < i1Var2.a) {
                    j jVar3 = jVar;
                    n nVar = new n(i9, i1Var2, i30, jVar3, iArr[i30], str);
                    int i32 = i31 + 1;
                    if (objArr2.length < i32) {
                        objArr2 = Arrays.copyOf(objArr2, o8.w.d(objArr2.length, i32));
                    }
                    objArr2[i31] = nVar;
                    i30++;
                    i31 = i32;
                    jVar = jVar3;
                }
                return o8.z.s(i31, objArr2);
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(c2 c2Var, int i9) {
        switch (this.a) {
            case 2:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                h2 h2Var = (h2) this.c;
                atomicBoolean.set(true);
                h2Var.run();
                break;
            case 3:
                ((z0) this.b).run((TLRPC.TL_premiumGiftCodeOption) this.c);
                break;
            case 16:
                fh.x xVar = (fh.x) this.b;
                fh.s sVar = (fh.s) this.c;
                try {
                    int parseInt = Integer.parseInt(sVar.getText().toString().trim());
                    xVar.W(parseInt);
                    xVar.Y.setValue(parseInt);
                    c2Var.dismiss();
                    break;
                } catch (Throwable th) {
                    AndroidUtilities.shakeView(sVar);
                    FileLog.e(th);
                    return;
                }
            case 17:
                g3 g3Var = (g3) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                String obj = g3Var.getText().toString();
                if (obj.length() > 0 && obj.length() <= 12) {
                    callback.run(obj);
                    c2Var.dismiss();
                    break;
                } else {
                    AndroidUtilities.shakeView(g3Var);
                    break;
                }
                break;
            default:
                k5 k5Var = (k5) this.b;
                bg.g3[] g3VarArr = (bg.g3[]) this.c;
                ve.d g10 = c2Var.g(i9, true, true);
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                d dVar = new d(23, k5Var, twoStepVerificationActivity);
                twoStepVerificationActivity.V = 2;
                twoStepVerificationActivity.X = dVar;
                twoStepVerificationActivity.W = k5Var.C1();
                g10.d();
                twoStepVerificationActivity.r0(new androidx.car.app.utils.b(k5Var, g3VarArr, g10, twoStepVerificationActivity, 22));
                break;
        }
    }

    @Override // org.telegram.ui.Components.nk0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // d5.l
    public void g(Object obj, d5.g gVar) {
        i3.b bVar = (i3.b) obj;
        bVar.c((h3.c2) this.c, new g5.b(gVar, ((i3.f) this.b).e));
    }

    @Override // org.telegram.ui.nf1
    public void h(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.a) {
            case 21:
                ((gh.r) this.b).g0(false, 0L, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.c);
                break;
            default:
                ((k5) this.b).M1(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.c);
                break;
        }
    }

    @Override // pg.g
    public void i(RectF rectF, View view) {
        kg.d dVar = (kg.d) this.b;
        View view2 = (View) this.c;
        dVar.s(rectF.left, rectF.top);
        view2.invalidate();
    }

    @Override // d5.k
    public void invoke(Object obj) {
        switch (this.a) {
            case 26:
                ((i3.b) obj).g((i3.a) this.b, (j4.y) this.c);
                break;
            default:
                ((i3.b) obj).onRenderedFirstFrame((i3.a) this.b);
                break;
        }
    }

    @Override // e3.b
    public Object j() {
        switch (this.a) {
            case 8:
                c3.h hVar = (c3.h) this.b;
                Iterable iterable = (Iterable) this.c;
                d3.h hVar2 = (d3.h) ((d3.d) hVar.c);
                hVar2.getClass();
                if (iterable.iterator().hasNext()) {
                    hVar2.a().compileStatement("DELETE FROM events WHERE _id in " + d3.h.g(iterable)).execute();
                    break;
                }
                break;
            default:
                c3.h hVar3 = (c3.h) this.b;
                for (Map.Entry entry : ((HashMap) this.c).entrySet()) {
                    ((d3.h) ((d3.c) hVar3.i)).e(((Integer) entry.getValue()).intValue(), z2.c.h, (String) entry.getKey());
                }
                break;
        }
        return null;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((com.google.firebase.messaging.g) this.b).a((Intent) this.c);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception e10) {
        w0.i gVar;
        switch (this.a) {
            case 7:
                c1.e eVar = (c1.e) this.b;
                CancellationSignal cancellationSignal = (CancellationSignal) this.c;
                kotlin.jvm.internal.i.e(e10, "e");
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
                kotlin.jvm.internal.i.e(e10, "e");
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
                    kotlin.jvm.internal.i.h("executor");
                    throw null;
                }
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        fh.i4 i4Var = (fh.i4) this.b;
        kh.d dVar = (kh.d) this.c;
        View view = (View) obj2;
        i4Var.getClass();
        long j10 = ((TL_stars.SavedStarGift) ((l41) obj).G).gift.id;
        if (i4Var.b == j10) {
            i4Var.b = 0L;
        } else {
            i4Var.b = j10;
        }
        dVar.setEnabled(i4Var.b != 0);
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                View childAt = viewGroup.getChildAt(i9);
                if (childAt instanceof ko0) {
                    ko0 ko0Var = (ko0) childAt;
                    ko0Var.b(i4Var.b == ko0Var.getGiftId(), true);
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

    @Override // org.telegram.ui.wx
    public boolean v(dy dyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i9, int i10, we1 we1Var) {
        switch (this.a) {
            case 6:
                p1 p1Var = (p1) this.b;
                String str = (String) this.c;
                long j10 = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    j10 = ((MessagesStorage.TopicKey) arrayList.get(i11)).dialogId;
                    p1Var.n.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(str, j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
                }
                dyVar.finishFragment();
                bg.u.h(j10);
                break;
            default:
                cg.e eVar = (cg.e) this.b;
                String str2 = (String) this.c;
                long j11 = 0;
                int i12 = 0;
                while (i12 < arrayList.size()) {
                    j11 = ((MessagesStorage.TopicKey) arrayList.get(i12)).dialogId;
                    eVar.e.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(str2, j11, null, null, null, true, null, null, null, true, 0, 0, null, false));
                    i12++;
                    eVar = eVar;
                }
                dyVar.finishFragment();
                bg.u.h(j11);
                break;
        }
        return true;
    }

    public /* synthetic */ d(i3.a aVar, Object obj, long j10) {
        this.a = 27;
        this.b = aVar;
        this.c = obj;
    }

    @Override // org.telegram.ui.Components.nk0
    public /* synthetic */ void g0(View view, float f10, float f11) {
    }
}
