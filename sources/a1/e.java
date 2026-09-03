package a1;

import android.app.job.JobParameters;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Process;
import android.os.StrictMode;
import android.view.ViewGroup;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import b4.e0;
import c2.p;
import c9.q;
import c9.r;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.m;
import dg.c1;
import dg.j1;
import dg.m1;
import dg.o1;
import eg.l3;
import eg.o3;
import eg.t2;
import f2.j0;
import fg.t0;
import fg.u0;
import fg.v0;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.j;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationBadge;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.sl0;
import v0.i;
import v0.o;
import w0.h;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
        q qVar = (q) this.b;
        ba.b bVar = (ba.b) this.c;
        synchronized (qVar) {
            try {
                if (qVar.b == null) {
                    qVar.a.add(bVar);
                } else {
                    qVar.b.add(bVar.get());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ba.a aVar;
        int i10;
        TLRPC.Document document;
        switch (this.a) {
            case 0:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25$lambda$24((i) this.b, (Exception) this.c);
                return;
            case 1:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$14$lambda$13$lambda$12((i) this.b, (kotlin.jvm.internal.q) this.c);
                return;
            case 2:
                ViewGroup container = (ViewGroup) this.b;
                j.e(container, "$container");
                container.endViewTransition(null);
                throw null;
            case 3:
                ((i) this.b).onError(this.c);
                return;
            case 4:
                ((i) this.b).onResult((o) this.c);
                return;
            case 5:
                ((c1.f) this.b).e().onError(((kotlin.jvm.internal.q) this.c).a);
                return;
            case 6:
                ((c1.f) this.b).e().onError((h) this.c);
                return;
            case 7:
                ((c1.f) this.b).e().onResult((o) this.c);
                return;
            case 8:
                r rVar = (r) this.b;
                ba.b bVar = (ba.b) this.c;
                if (rVar.b != r.d) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized (rVar) {
                    aVar = rVar.a;
                    rVar.a = null;
                    rVar.b = bVar;
                }
                aVar.f(bVar);
                return;
            case 9:
                a();
                return;
            case 10:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
                ja.c cVar = FirebaseMessaging.l;
                firebaseMessaging.getClass();
                try {
                    taskCompletionSource.setResult(firebaseMessaging.a());
                    return;
                } catch (Exception e6) {
                    taskCompletionSource.setException(e6);
                    return;
                }
            case 11:
                m mVar = (m) this.b;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.c;
                try {
                    taskCompletionSource2.setResult(mVar.a());
                    return;
                } catch (Exception e10) {
                    taskCompletionSource2.setException(e10);
                    return;
                }
            case 12:
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
            case 13:
                d9.a aVar2 = (d9.a) this.b;
                Runnable runnable = (Runnable) this.c;
                Process.setThreadPriority(aVar2.c);
                StrictMode.ThreadPolicy threadPolicy = aVar2.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            case 14:
                Callable callable = (Callable) this.b;
                d9.i iVar2 = (d9.i) ((y5.h) this.c).b;
                try {
                    iVar2.k(callable.call());
                    return;
                } catch (Exception e11) {
                    iVar2.l(e11);
                    return;
                }
            case 15:
                c1 c1Var = (c1) this.b;
                j1 j1Var = (j1) this.c;
                c1Var.v = true;
                ByteBuffer byteBuffer = (ByteBuffer) c1Var.h(c1Var.f(), true, false, false).c;
                RectF f10 = c1Var.f();
                Object obj = c1Var.a.b;
                c1Var.w = new e0(byteBuffer, 0, f10);
                c1Var.a(false);
                j1Var.run();
                return;
            case 16:
                o1 o1Var = (o1) this.b;
                Runnable runnable2 = (Runnable) this.c;
                m1 m1Var = o1Var.d;
                if (m1Var == null || !m1Var.f) {
                    return;
                }
                m1.b(m1Var);
                runnable2.run();
                return;
            case 17:
                ((i) this.b).onError((w0.d) this.c);
                return;
            case 18:
                ((i) this.b).onResult((v0.f) this.c);
                return;
            case 19:
                e1.d dVar = (e1.d) this.b;
                v0.c cVar2 = (v0.c) this.c;
                i iVar3 = dVar.f;
                if (iVar3 != null) {
                    iVar3.onResult(cVar2);
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            case 20:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.b;
                JobParameters jobParameters = (JobParameters) this.c;
                int i11 = JobInfoSchedulerService.a;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 21:
                eg.c1 c1Var2 = (eg.c1) this.b;
                t2 t2Var = (t2) this.c;
                t2Var.m();
                c1Var2.r0(t2Var, true);
                return;
            case 22:
                ((t2) this.b).s((Bitmap) this.c);
                return;
            case 23:
                o3 o3Var = (o3) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                o3Var.D = false;
                l3[] l3VarArr = (l3[]) arrayList.toArray(new l3[0]);
                o3Var.E = l3VarArr;
                if (l3VarArr.length > 0) {
                    o3Var.V.setScaleX(0.3f);
                    o3Var.V.setScaleY(0.3f);
                    o3Var.V.setAlpha(0.0f);
                    o3Var.V.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).setInterpolator(pr.f).start();
                    return;
                }
                return;
            case 24:
                p pVar = (p) this.b;
                ef.b bVar2 = (ef.b) this.c;
                if (((AtomicBoolean) pVar.d).compareAndSet(false, true)) {
                    bVar2.a(true);
                    return;
                }
                return;
            case 25:
                v0 v0Var = (v0) this.b;
                TLObject tLObject = (TLObject) this.c;
                ArrayList arrayList2 = v0Var.f0;
                sl0 sl0Var = v0Var.d;
                if (tLObject != null) {
                    arrayList2.clear();
                    arrayList2.addAll(((TLRPC.TL_messages_chats) tLObject).chats);
                    v0Var.F0 = false;
                    v0Var.G0.b(v0Var.k0 + 4);
                    int i12 = 0;
                    while (true) {
                        if (i12 >= sl0Var.getChildCount()) {
                            i10 = 0;
                        } else if (sl0Var.getChildAt(i12) instanceof u0) {
                            i10 = sl0Var.getChildAt(i12).getTop();
                        } else {
                            i12++;
                        }
                    }
                    v0Var.M1();
                    if (v0Var.i0 >= 0 && i10 != 0) {
                        ((j0) sl0Var.getLayoutManager()).h1(v0Var.i0 + 1, i10);
                    }
                }
                int max = Math.max(arrayList2.size(), v0Var.J0.b);
                v0Var.u0.g(max, false);
                v0Var.u0.setBagePosition(max / v0Var.J0.c);
                t0 t0Var = v0Var.u0;
                t0Var.E = true;
                t0Var.requestLayout();
                return;
            case 26:
                ((v0) this.b).m1((j90) this.c, true);
                return;
            case 27:
                fg.t2 t2Var2 = (fg.t2) this.b;
                AndroidUtilities.runOnUIThread(new e(28, t2Var2, FileLoader.getInstance(t2Var2.s).getPathToAttach((TLRPC.Document) this.c)));
                return;
            case 28:
                fg.t2 t2Var3 = (fg.t2) this.b;
                t2Var3.e = (File) this.c;
                t2Var3.a();
                return;
            default:
                gf.e eVar2 = (gf.e) this.b;
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
                            gf.d dVar2 = (gf.d) obj2;
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
                            gf.d dVar3 = new gf.d();
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
                        gf.e.g = j10;
                        SharedPreferences.Editor putLong = edit2.putLong("hash", j10);
                        long currentTimeMillis = System.currentTimeMillis();
                        gf.e.h = currentTimeMillis;
                        putLong.putLong("lastReload", currentTimeMillis).apply();
                    }
                    eVar2.b();
                    return;
                }
                return;
        }
    }
}
