package a8;

import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Log;
import android.view.TextureView;
import c8.be;
import c8.cd;
import c8.jg;
import c8.uf;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final /* synthetic */ class ra implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ ra(uf ufVar) {
        this.a = 14;
        c8.fb fbVar = c8.fb.b;
        this.b = ufVar;
    }

    private final void a() {
        j6.o oVar = (j6.o) this.b;
        synchronized (j6.o.i) {
            try {
                if (oVar.d()) {
                    oVar.f(15);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        int i7 = 3;
        f fVar = null;
        switch (this.a) {
            case 0:
                ta taVar = (ta) this.b;
                a8 a8Var = a8.f;
                HashMap hashMap = taVar.j;
                i iVar = (i) hashMap.get(a8Var);
                if (iVar != null) {
                    i iVar2 = iVar;
                    b bVar = iVar2.a;
                    if (bVar == null) {
                        i iVar3 = iVar2;
                        b bVar2 = new b(iVar3, iVar3.c);
                        iVar2.a = bVar2;
                        bVar = bVar2;
                    }
                    Iterator it = bVar.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        Object obj2 = (Collection) iVar.c.get(next);
                        if (obj2 == null) {
                            obj2 = new ArrayList(3);
                        }
                        List list = (List) obj2;
                        ArrayList arrayList = new ArrayList(list instanceof RandomAccess ? new c(iVar, next, list, null) : new f(iVar, next, list, (f) null));
                        Collections.sort(arrayList);
                        k7 k7Var = new k7();
                        int size = arrayList.size();
                        int i10 = 0;
                        long j3 = 0;
                        while (i10 < size) {
                            Object obj3 = arrayList.get(i10);
                            i10++;
                            j3 = ((Long) obj3).longValue() + j3;
                        }
                        k7Var.c = Long.valueOf((j3 / arrayList.size()) & Long.MAX_VALUE);
                        k7Var.a = Long.valueOf(ta.a(arrayList, 100.0d) & Long.MAX_VALUE);
                        k7Var.f = Long.valueOf(ta.a(arrayList, 75.0d) & Long.MAX_VALUE);
                        k7Var.e = Long.valueOf(ta.a(arrayList, 50.0d) & Long.MAX_VALUE);
                        k7Var.d = Long.valueOf(ta.a(arrayList, 25.0d) & Long.MAX_VALUE);
                        k7Var.b = Long.valueOf(ta.a(arrayList, 0.0d) & Long.MAX_VALUE);
                        l7 l7Var = new l7(k7Var);
                        int size2 = arrayList.size();
                        b8 b8Var = new b8();
                        b8Var.c = y7.b;
                        android.support.v4.media.session.a0 a0Var = new android.support.v4.media.session.a0(2, false);
                        a0Var.c = Integer.valueOf(size2 & ConnectionsManager.DEFAULT_DATACENTER_ID);
                        a0Var.b = (e1) next;
                        a0Var.d = l7Var;
                        b8Var.f = new f1(a0Var);
                        pb.m.a.execute(new pa(taVar, new wa(b8Var, 0), a8Var, taVar.b(), 0));
                    }
                    hashMap.remove(a8Var);
                    return;
                }
                return;
            case 1:
                ai.i0 i0Var = (ai.i0) this.b;
                CameraView cameraView = i0Var.b;
                if (!i0Var.h0 || cameraView == null) {
                    return;
                }
                TextureView textureView = cameraView.getTextureView();
                int width = textureView.getWidth();
                int height = textureView.getHeight();
                if (width > 0 && height > 0) {
                    if (width > 720 || height > 720) {
                        float f10 = width;
                        float f11 = height;
                        float min = Math.min(720.0f / f10, 720.0f / f11);
                        width = Math.max(1, (int) (f10 * min));
                        height = Math.max(1, (int) (f11 * min));
                    }
                    Bitmap bitmap = ((ai.i0) this.b).k0;
                    if (bitmap == null || bitmap.getWidth() != width || ((ai.i0) this.b).k0.getHeight() != height) {
                        ((ai.i0) this.b).k0 = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                    }
                    try {
                        textureView.getBitmap(((ai.i0) this.b).k0);
                        ai.i0 i0Var2 = (ai.i0) this.b;
                        q4.q f12 = ai.i0.f(i0Var2.k0, i0Var2.i0, i0Var2.j0, i0Var2.O);
                        if (f12 != null) {
                            org.telegram.messenger.g0.h3(new a1.e(12, this, f12));
                            return;
                        }
                    } catch (Throwable th2) {
                        org.telegram.messenger.a8.g(th2, true);
                    }
                }
                if (((ai.i0) this.b).h0) {
                    ((ai.i0) this.b).g0.postDelayed(this, 150L);
                    return;
                }
                return;
            case 2:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e10) {
                    if (!TextUtils.equals(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e10;
                    }
                    return;
                } catch (NullPointerException e11) {
                    if (!TextUtils.equals(e11.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e11;
                    }
                    return;
                }
            case 3:
                androidx.biometric.g0 g0Var = (androidx.biometric.g0) this.b;
                Context n10 = g0Var.n();
                if (n10 == null) {
                    Log.w("FingerprintFragment", "Not resetting the dialog. Context is null.");
                    return;
                } else {
                    g0Var.C0.f(1);
                    g0Var.C0.e(n10.getString(R.string.fingerprint_dialog_touch_sensor));
                    return;
                }
            case 4:
                androidx.fragment.app.o oVar = (androidx.fragment.app.o) this.b;
                oVar.n0.onDismiss(oVar.v0);
                return;
            case 5:
                androidx.fragment.app.r rVar = (androidx.fragment.app.r) this.b;
                if (rVar.Y != null) {
                    rVar.j().getClass();
                    return;
                }
                return;
            case 6:
                ((androidx.fragment.app.i0) this.b).A(true);
                return;
            case 7:
                synchronized (((androidx.lifecycle.z) this.b).a) {
                    obj = ((androidx.lifecycle.z) this.b).f;
                    ((androidx.lifecycle.z) this.b).f = androidx.lifecycle.z.k;
                }
                ((androidx.lifecycle.z) this.b).j(obj);
                return;
            case 8:
                androidx.mediarouter.app.t tVar = (androidx.mediarouter.app.t) this.b;
                tVar.i(true);
                tVar.U.requestLayout();
                tVar.U.getViewTreeObserver().addOnGlobalLayoutListener(new androidx.mediarouter.app.i(tVar, 0));
                return;
            case 9:
                androidx.mediarouter.app.t tVar2 = ((androidx.mediarouter.app.r) this.b).b;
                if (tVar2.c0 != null) {
                    tVar2.c0 = null;
                    if (tVar2.s0) {
                        tVar2.q(tVar2.t0);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                ((b3.m) this.b).d();
                return;
            case 11:
                for (Thread thread : bg.i.w.keySet()) {
                    if (!thread.isAlive()) {
                        bg.i.w.remove(thread);
                    }
                }
                if (bg.i.w.isEmpty()) {
                    bg.i.x = false;
                    return;
                } else {
                    org.telegram.messenger.g0.i3(((bg.i) this.b).p, 5000L);
                    return;
                }
            case 12:
                bg.b0 b0Var = (bg.b0) this.b;
                if (b0Var.F.get()) {
                    b0Var.invalidate();
                    b0Var.H.postDelayed(this, 300L);
                    return;
                }
                return;
            case 13:
                c5.k kVar = (c5.k) this.b;
                kVar.setScrollState(0);
                kVar.s();
                return;
            case 14:
                uf ufVar = (uf) this.b;
                c8.fb fbVar = c8.fb.N1;
                HashMap hashMap2 = ufVar.j;
                jg jgVar = (jg) hashMap2.get(fbVar);
                if (jgVar != null) {
                    jg jgVar2 = jgVar;
                    cd cdVar = jgVar2.a;
                    if (cdVar == null) {
                        jg jgVar3 = jgVar2;
                        cd cdVar2 = new cd(jgVar3, jgVar3.c);
                        jgVar2.a = cdVar2;
                        cdVar = cdVar2;
                    }
                    Iterator it2 = cdVar.iterator();
                    while (it2.hasNext()) {
                        Object next2 = it2.next();
                        Object obj4 = (Collection) jgVar.c.get(next2);
                        if (obj4 == null) {
                            obj4 = new ArrayList(i7);
                        }
                        List list2 = (List) obj4;
                        ArrayList arrayList2 = new ArrayList(list2 instanceof RandomAccess ? new be(jgVar, next2, list2, fVar) : new f(jgVar, next2, list2, fVar));
                        Collections.sort(arrayList2);
                        k7 k7Var2 = new k7();
                        int size3 = arrayList2.size();
                        int i11 = 0;
                        long j10 = 0;
                        while (i11 < size3) {
                            Object obj5 = arrayList2.get(i11);
                            i11++;
                            j10 = ((Long) obj5).longValue() + j10;
                        }
                        jg jgVar4 = jgVar;
                        k7Var2.c = Long.valueOf((j10 / arrayList2.size()) & Long.MAX_VALUE);
                        k7Var2.a = Long.valueOf(uf.a(arrayList2, 100.0d) & Long.MAX_VALUE);
                        k7Var2.f = Long.valueOf(uf.a(arrayList2, 75.0d) & Long.MAX_VALUE);
                        k7Var2.e = Long.valueOf(uf.a(arrayList2, 50.0d) & Long.MAX_VALUE);
                        k7Var2.d = Long.valueOf(uf.a(arrayList2, 25.0d) & Long.MAX_VALUE);
                        k7Var2.b = Long.valueOf(uf.a(arrayList2, 0.0d) & Long.MAX_VALUE);
                        c8.la laVar = new c8.la(k7Var2);
                        int size4 = arrayList2.size();
                        ga.d dVar = new ga.d(1);
                        dVar.d = c8.db.b;
                        android.support.v4.media.session.a0 a0Var2 = new android.support.v4.media.session.a0(15, false);
                        a0Var2.c = Integer.valueOf(size4 & ConnectionsManager.DEFAULT_DATACENTER_ID);
                        a0Var2.b = (c8.h1) next2;
                        a0Var2.d = laVar;
                        dVar.n = new c8.i1(a0Var2);
                        uf ufVar2 = ufVar;
                        c8.fb fbVar2 = fbVar;
                        pb.m.a.execute(new pa(ufVar2, new wa(dVar, 0), fbVar2, ufVar.c(), 1));
                        fbVar = fbVar2;
                        ufVar = ufVar2;
                        jgVar = jgVar4;
                        fVar = null;
                        i7 = 3;
                    }
                    hashMap2.remove(fbVar);
                    return;
                }
                return;
            case 15:
                com.google.android.gms.common.api.internal.b0 b0Var2 = (com.google.android.gms.common.api.internal.b0) this.b;
                n6.e eVar = b0Var2.d;
                Context context = b0Var2.c;
                eVar.getClass();
                if (n6.g.a.getAndSet(true)) {
                    return;
                }
                try {
                    NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                    if (notificationManager != null) {
                        notificationManager.cancel(10436);
                        return;
                    }
                    return;
                } catch (SecurityException e12) {
                    Log.d("GooglePlayServicesUtil", "Suppressing Security Exception %s in cancelAvailabilityErrorNotifications.", e12);
                    return;
                }
            case 16:
                ((com.google.android.gms.common.api.internal.j0) this.b).a();
                return;
            case 17:
                com.google.android.gms.common.api.internal.j0 j0Var = (com.google.android.gms.common.api.internal.j0) ((d6.i) this.b).b;
                ((q6.d) j0Var.b).j(j0Var.b.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 18:
                ((com.google.android.gms.common.api.internal.v0) this.b).j.b(new n6.a(4, null, null));
                return;
            case 19:
                com.google.android.gms.common.api.internal.f1 f1Var = (com.google.android.gms.common.api.internal.f1) this.b;
                f1Var.o.lock();
                try {
                    f1Var.j();
                    return;
                } finally {
                    f1Var.o.unlock();
                }
            case 20:
                di.i4 i4Var = (di.i4) this.b;
                if (i4Var.t1 && i4Var.K0) {
                    di.p9 p9Var = ((di.g9) i4Var.z1).d;
                    p9Var.k1 = false;
                    p9Var.V();
                    return;
                }
                return;
            case 21:
                ((di.w) this.b).L0 = false;
                return;
            case 22:
                di.y7 y7Var = (di.y7) this.b;
                y7Var.b = false;
                y7Var.invalidate();
                return;
            case 23:
                f5.s sVar = (f5.s) this.b;
                f5.b bVar3 = sVar.d;
                bVar3.k(0);
                f5.f fVar2 = f5.z.i;
                bVar3.j(24, fVar2);
                sVar.c(fVar2);
                return;
            case 24:
                tg.j jVar = ((fi.x9) this.b).s0;
                if (jVar instanceof tg.k2) {
                    ((tg.k2) jVar).getEditText();
                    return;
                }
                return;
            case 25:
                i.e eVar2 = (i.e) this.b;
                eVar2.a(true);
                eVar2.invalidateSelf();
                return;
            case 26:
                ((i6.h) this.b).g(false);
                return;
            case 27:
                a();
                return;
            case 28:
                ((li.f0) this.b).h();
                return;
            default:
                m.s1 s1Var = (m.s1) this.b;
                s1Var.x = null;
                s1Var.drawableStateChanged();
                return;
        }
    }

    public /* synthetic */ ra(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    public ra(com.google.android.gms.common.api.internal.v0 v0Var) {
        this.a = 18;
        Objects.requireNonNull(v0Var);
        this.b = v0Var;
    }
}
