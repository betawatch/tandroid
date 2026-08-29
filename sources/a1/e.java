package a1;

import a9.r;
import a9.t;
import ag.f1;
import ag.j2;
import ag.m1;
import ag.r1;
import ag.t1;
import android.app.job.JobParameters;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Process;
import android.os.StrictMode;
import android.view.ViewGroup;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import bg.g1;
import bg.r3;
import bg.u3;
import bg.y2;
import c2.p;
import cg.t0;
import cg.u0;
import cg.v0;
import cg.w2;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.m;
import com.google.firebase.messaging.u;
import f2.j0;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationBadge;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.b90;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jr;
import v0.i;
import v0.o;
import w0.h;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        r rVar = (r) this.b;
        z9.b bVar = (z9.b) this.c;
        synchronized (rVar) {
            try {
                if (rVar.b == null) {
                    rVar.a.add(bVar);
                } else {
                    rVar.b.add(bVar.get());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        z9.a aVar;
        int i10;
        TLRPC.Document document;
        switch (this.a) {
            case 0:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25$lambda$24((i) this.b, (Exception) this.c);
                return;
            case 1:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$14$lambda$13$lambda$12((i) this.b, (q) this.c);
                return;
            case 2:
                t tVar = (t) this.b;
                z9.b bVar = (z9.b) this.c;
                if (tVar.b != t.d) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized (tVar) {
                    aVar = tVar.a;
                    tVar.a = null;
                    tVar.b = bVar;
                }
                aVar.j(bVar);
                return;
            case 3:
                a();
                return;
            case 4:
                f1 f1Var = (f1) this.b;
                m1 m1Var = (m1) this.c;
                f1Var.v = true;
                ByteBuffer byteBuffer = (ByteBuffer) f1Var.h(f1Var.f(), true, false, false).b;
                RectF f9 = f1Var.f();
                Object obj = f1Var.a.b;
                f1Var.w = new j2(byteBuffer, 0, f9);
                f1Var.a(false);
                m1Var.run();
                return;
            case 5:
                t1 t1Var = (t1) this.b;
                Runnable runnable = (Runnable) this.c;
                r1 r1Var = t1Var.d;
                if (r1Var == null || !r1Var.f) {
                    return;
                }
                r1.b(r1Var);
                runnable.run();
                return;
            case 6:
                ViewGroup container = (ViewGroup) this.b;
                j.e(container, "$container");
                container.endViewTransition(null);
                throw null;
            case 7:
                ((i) this.b).onError(this.c);
                return;
            case 8:
                ((i) this.b).onResult((o) this.c);
                return;
            case 9:
                b9.a aVar2 = (b9.a) this.b;
                Runnable runnable2 = (Runnable) this.c;
                Process.setThreadPriority(aVar2.c);
                StrictMode.ThreadPolicy threadPolicy = aVar2.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable2.run();
                return;
            case 10:
                Callable callable = (Callable) this.b;
                b9.j jVar = (b9.j) ((ha.c) this.c).b;
                try {
                    jVar.k(callable.call());
                    return;
                } catch (Exception e10) {
                    jVar.l(e10);
                    return;
                }
            case 11:
                g1 g1Var = (g1) this.b;
                y2 y2Var = (y2) this.c;
                y2Var.m();
                g1Var.r0(y2Var, true);
                return;
            case 12:
                ((y2) this.b).s((Bitmap) this.c);
                return;
            case 13:
                u3 u3Var = (u3) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                u3Var.C = false;
                r3[] r3VarArr = (r3[]) arrayList.toArray(new r3[0]);
                u3Var.D = r3VarArr;
                if (r3VarArr.length > 0) {
                    u3Var.U.setScaleX(0.3f);
                    u3Var.U.setScaleY(0.3f);
                    u3Var.U.setAlpha(0.0f);
                    u3Var.U.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).setInterpolator(jr.f).start();
                    return;
                }
                return;
            case 14:
                ((c1.e) this.b).e().onError(((q) this.c).a);
                return;
            case 15:
                ((c1.e) this.b).e().onError((h) this.c);
                return;
            case 16:
                ((c1.e) this.b).e().onResult((o) this.c);
                return;
            case 17:
                v0 v0Var = (v0) this.b;
                TLObject tLObject = (TLObject) this.c;
                ArrayList arrayList2 = v0Var.e0;
                jl0 jl0Var = v0Var.d;
                if (tLObject != null) {
                    arrayList2.clear();
                    arrayList2.addAll(((TLRPC.TL_messages_chats) tLObject).chats);
                    v0Var.E0 = false;
                    v0Var.F0.b(v0Var.j0 + 4);
                    int i11 = 0;
                    while (true) {
                        if (i11 >= jl0Var.getChildCount()) {
                            i10 = 0;
                        } else if (jl0Var.getChildAt(i11) instanceof u0) {
                            i10 = jl0Var.getChildAt(i11).getTop();
                        } else {
                            i11++;
                        }
                    }
                    v0Var.M1();
                    if (v0Var.h0 >= 0 && i10 != 0) {
                        ((j0) jl0Var.getLayoutManager()).h1(v0Var.h0 + 1, i10);
                    }
                }
                int max = Math.max(arrayList2.size(), v0Var.I0.b);
                v0Var.t0.g(max, false);
                v0Var.t0.setBagePosition(max / v0Var.I0.c);
                t0 t0Var = v0Var.t0;
                t0Var.D = true;
                t0Var.requestLayout();
                return;
            case 18:
                ((v0) this.b).m1((b90) this.c, true);
                return;
            case 19:
                w2 w2Var = (w2) this.b;
                AndroidUtilities.runOnUIThread(new e(20, w2Var, FileLoader.getInstance(w2Var.s).getPathToAttach((TLRPC.Document) this.c)));
                return;
            case 20:
                w2 w2Var2 = (w2) this.b;
                w2Var2.e = (File) this.c;
                w2Var2.a();
                return;
            case 21:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
                u uVar = FirebaseMessaging.l;
                firebaseMessaging.getClass();
                try {
                    taskCompletionSource.setResult(firebaseMessaging.a());
                    return;
                } catch (Exception e11) {
                    taskCompletionSource.setException(e11);
                    return;
                }
            case 22:
                m mVar = (m) this.b;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.c;
                try {
                    taskCompletionSource2.setResult(mVar.a());
                    return;
                } catch (Exception e12) {
                    taskCompletionSource2.setException(e12);
                    return;
                }
            case 23:
                d1.e eVar = (d1.e) this.b;
                v0.f fVar = (v0.f) this.c;
                i iVar = eVar.f;
                if (iVar != null) {
                    iVar.onResult(fVar);
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            case 24:
                p pVar = (p) this.b;
                cf.b bVar2 = (cf.b) this.c;
                if (((AtomicBoolean) pVar.d).compareAndSet(false, true)) {
                    bVar2.a(true);
                    return;
                }
                return;
            case 25:
                ((i) this.b).onError((w0.d) this.c);
                return;
            case 26:
                ((i) this.b).onResult((v0.f) this.c);
                return;
            case 27:
                e1.d dVar = (e1.d) this.b;
                v0.c cVar = (v0.c) this.c;
                i iVar2 = dVar.f;
                if (iVar2 != null) {
                    iVar2.onResult(cVar);
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            case 28:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.b;
                JobParameters jobParameters = (JobParameters) this.c;
                int i12 = JobInfoSchedulerService.a;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            default:
                ef.e eVar2 = (ef.e) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                if (tLObject2 != null) {
                    if (tLObject2 instanceof TL_account.TL_savedRingtonesNotModified) {
                        eVar2.f(true);
                    } else if (tLObject2 instanceof TL_account.TL_savedRingtones) {
                        TL_account.TL_savedRingtones tL_savedRingtones = (TL_account.TL_savedRingtones) tLObject2;
                        ArrayList<TLRPC.Document> arrayList3 = tL_savedRingtones.ringtones;
                        ArrayList arrayList4 = eVar2.e;
                        if (!eVar2.f) {
                            eVar2.f(false);
                            eVar2.f = true;
                        }
                        HashMap hashMap = new HashMap();
                        int size = arrayList4.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj2 = arrayList4.get(i13);
                            i13++;
                            ef.d dVar2 = (ef.d) obj2;
                            if (dVar2.b != null && (document = dVar2.a) != null) {
                                hashMap.put(Long.valueOf(document.id), dVar2.b);
                            }
                        }
                        arrayList4.clear();
                        SharedPreferences d = eVar2.d();
                        d.edit().clear().apply();
                        SharedPreferences.Editor edit = d.edit();
                        edit.putInt(NotificationBadge.NewHtcHomeBadger.COUNT, arrayList3.size());
                        for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                            TLRPC.Document document2 = arrayList3.get(i14);
                            String str = (String) hashMap.get(Long.valueOf(document2.id));
                            SerializedData serializedData = new SerializedData(document2.getObjectSize());
                            document2.serializeToStream(serializedData);
                            edit.putString("tone_document" + i14, Utilities.bytesToHex(serializedData.toByteArray()));
                            if (str != null) {
                                edit.putString("tone_local_path" + i14, str);
                            }
                            ef.d dVar3 = new ef.d();
                            dVar3.a = document2;
                            dVar3.b = str;
                            int i15 = eVar2.d;
                            eVar2.d = i15 + 1;
                            dVar3.c = i15;
                            arrayList4.add(dVar3);
                        }
                        edit.apply();
                        NotificationCenter.getInstance(eVar2.c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                        SharedPreferences.Editor edit2 = eVar2.d().edit();
                        long j10 = tL_savedRingtones.hash;
                        ef.e.g = j10;
                        SharedPreferences.Editor putLong = edit2.putLong("hash", j10);
                        long currentTimeMillis = System.currentTimeMillis();
                        ef.e.h = currentTimeMillis;
                        putLong.putLong("lastReload", currentTimeMillis).apply();
                    }
                    eVar2.b();
                    return;
                }
                return;
        }
    }
}
