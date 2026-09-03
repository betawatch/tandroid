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
import c9.r;
import c9.s;
import cg.d1;
import cg.k1;
import cg.n1;
import cg.p1;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.m;
import dg.e1;
import dg.n3;
import dg.q3;
import dg.v2;
import eg.t0;
import eg.u0;
import eg.u2;
import eg.v0;
import f2.i0;
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
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.rl0;
import v0.i;
import v0.o;
import w0.h;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
        ba.b bVar = (ba.b) this.c;
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
        ba.a aVar;
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
                ((c1.f) this.b).e().onError(((q) this.c).a);
                return;
            case 6:
                ((c1.f) this.b).e().onError((h) this.c);
                return;
            case 7:
                ((c1.f) this.b).e().onResult((o) this.c);
                return;
            case 8:
                s sVar = (s) this.b;
                ba.b bVar = (ba.b) this.c;
                if (sVar.b != s.d) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized (sVar) {
                    aVar = sVar.a;
                    sVar.a = null;
                    sVar.b = bVar;
                }
                aVar.f(bVar);
                return;
            case 9:
                a();
                return;
            case 10:
                d1 d1Var = (d1) this.b;
                k1 k1Var = (k1) this.c;
                d1Var.v = true;
                ByteBuffer byteBuffer = (ByteBuffer) d1Var.h(d1Var.f(), true, false, false).c;
                RectF f10 = d1Var.f();
                Object obj = d1Var.a.b;
                d1Var.w = new e0(byteBuffer, 0, f10);
                d1Var.a(false);
                k1Var.run();
                return;
            case 11:
                p1 p1Var = (p1) this.b;
                Runnable runnable = (Runnable) this.c;
                n1 n1Var = p1Var.d;
                if (n1Var == null || !n1Var.f) {
                    return;
                }
                n1.b(n1Var);
                runnable.run();
                return;
            case 12:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
                ja.c cVar = FirebaseMessaging.l;
                firebaseMessaging.getClass();
                try {
                    taskCompletionSource.setResult(firebaseMessaging.a());
                    return;
                } catch (Exception e) {
                    taskCompletionSource.setException(e);
                    return;
                }
            case 13:
                m mVar = (m) this.b;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.c;
                try {
                    taskCompletionSource2.setResult(mVar.a());
                    return;
                } catch (Exception e6) {
                    taskCompletionSource2.setException(e6);
                    return;
                }
            case 14:
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
            case 15:
                d9.a aVar2 = (d9.a) this.b;
                Runnable runnable2 = (Runnable) this.c;
                Process.setThreadPriority(aVar2.c);
                StrictMode.ThreadPolicy threadPolicy = aVar2.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable2.run();
                return;
            case 16:
                Callable callable = (Callable) this.b;
                d9.i iVar2 = (d9.i) ((androidx.biometric.e0) this.c).b;
                try {
                    iVar2.k(callable.call());
                    return;
                } catch (Exception e10) {
                    iVar2.l(e10);
                    return;
                }
            case 17:
                e1 e1Var = (e1) this.b;
                v2 v2Var = (v2) this.c;
                v2Var.m();
                e1Var.r0(v2Var, true);
                return;
            case 18:
                ((v2) this.b).s((Bitmap) this.c);
                return;
            case 19:
                q3 q3Var = (q3) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                q3Var.D = false;
                n3[] n3VarArr = (n3[]) arrayList.toArray(new n3[0]);
                q3Var.E = n3VarArr;
                if (n3VarArr.length > 0) {
                    q3Var.V.setScaleX(0.3f);
                    q3Var.V.setScaleY(0.3f);
                    q3Var.V.setAlpha(0.0f);
                    q3Var.V.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).setInterpolator(mr.f).start();
                    return;
                }
                return;
            case 20:
                ((i) this.b).onError((w0.d) this.c);
                return;
            case 21:
                ((i) this.b).onResult((v0.f) this.c);
                return;
            case 22:
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
            case 23:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.b;
                JobParameters jobParameters = (JobParameters) this.c;
                int i11 = JobInfoSchedulerService.a;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 24:
                p pVar = (p) this.b;
                df.b bVar2 = (df.b) this.c;
                if (((AtomicBoolean) pVar.d).compareAndSet(false, true)) {
                    bVar2.a(true);
                    return;
                }
                return;
            case 25:
                v0 v0Var = (v0) this.b;
                TLObject tLObject = (TLObject) this.c;
                ArrayList arrayList2 = v0Var.f0;
                rl0 rl0Var = v0Var.d;
                if (tLObject != null) {
                    arrayList2.clear();
                    arrayList2.addAll(((TLRPC.TL_messages_chats) tLObject).chats);
                    v0Var.F0 = false;
                    v0Var.G0.b(v0Var.k0 + 4);
                    int i12 = 0;
                    while (true) {
                        if (i12 >= rl0Var.getChildCount()) {
                            i10 = 0;
                        } else if (rl0Var.getChildAt(i12) instanceof u0) {
                            i10 = rl0Var.getChildAt(i12).getTop();
                        } else {
                            i12++;
                        }
                    }
                    v0Var.M1();
                    if (v0Var.i0 >= 0 && i10 != 0) {
                        ((i0) rl0Var.getLayoutManager()).h1(v0Var.i0 + 1, i10);
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
                ((v0) this.b).m1((i90) this.c, true);
                return;
            case 27:
                u2 u2Var = (u2) this.b;
                AndroidUtilities.runOnUIThread(new e(28, u2Var, FileLoader.getInstance(u2Var.s).getPathToAttach((TLRPC.Document) this.c)));
                return;
            case 28:
                u2 u2Var2 = (u2) this.b;
                u2Var2.e = (File) this.c;
                u2Var2.a();
                return;
            default:
                ff.e eVar2 = (ff.e) this.b;
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
                            ff.d dVar2 = (ff.d) obj2;
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
                            ff.d dVar3 = new ff.d();
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
                        ff.e.g = j10;
                        SharedPreferences.Editor putLong = edit2.putLong("hash", j10);
                        long currentTimeMillis = System.currentTimeMillis();
                        ff.e.h = currentTimeMillis;
                        putLong.putLong("lastReload", currentTimeMillis).apply();
                    }
                    eVar2.b();
                    return;
                }
                return;
        }
    }
}
