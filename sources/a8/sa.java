package a8;

import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.text.Editable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.Log;
import android.view.TextureView;
import android.widget.TextView;
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
import java.util.Random;
import java.util.RandomAccess;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class sa implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ sa(uf ufVar) {
        this.a = 16;
        c8.fb fbVar = c8.fb.b;
        this.b = ufVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        boolean z11;
        ai.d2[] d2VarArr;
        int i7;
        int i10;
        Layout layout;
        long j3;
        Object obj;
        int i11 = 3;
        f fVar = null;
        switch (this.a) {
            case 0:
                ua uaVar = (ua) this.b;
                a8 a8Var = a8.f;
                HashMap hashMap = uaVar.j;
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
                        long j10 = 0;
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj3 = arrayList.get(i12);
                            i12++;
                            j10 = ((Long) obj3).longValue() + j10;
                        }
                        k7Var.c = Long.valueOf((j10 / arrayList.size()) & Long.MAX_VALUE);
                        k7Var.a = Long.valueOf(ua.a(arrayList, 100.0d) & Long.MAX_VALUE);
                        k7Var.f = Long.valueOf(ua.a(arrayList, 75.0d) & Long.MAX_VALUE);
                        k7Var.e = Long.valueOf(ua.a(arrayList, 50.0d) & Long.MAX_VALUE);
                        k7Var.d = Long.valueOf(ua.a(arrayList, 25.0d) & Long.MAX_VALUE);
                        k7Var.b = Long.valueOf(ua.a(arrayList, 0.0d) & Long.MAX_VALUE);
                        l7 l7Var = new l7(k7Var);
                        int size2 = arrayList.size();
                        b8 b8Var = new b8();
                        b8Var.c = y7.b;
                        android.support.v4.media.session.a0 a0Var = new android.support.v4.media.session.a0(2, false);
                        a0Var.c = Integer.valueOf(size2 & ConnectionsManager.DEFAULT_DATACENTER_ID);
                        a0Var.b = (e1) next;
                        a0Var.d = l7Var;
                        b8Var.f = new f1(a0Var);
                        pb.n.a.execute(new qa(uaVar, new xa(b8Var, 0), a8Var, uaVar.b(), 0));
                    }
                    hashMap.remove(a8Var);
                    return;
                }
                return;
            case 1:
                org.telegram.messenger.g0.r(this);
                ai.m0 m0Var = (ai.m0) this.b;
                if (m0Var.r != 1 || m0Var.s == null) {
                    return;
                }
                Editable text = m0Var.f.b.F0.getText();
                boolean z12 = text != null && text.toString().trim().length() > 0;
                long uptimeMillis = SystemClock.uptimeMillis();
                boolean z13 = m0Var.s.getRightMode() == 2;
                long j11 = m0Var.q0;
                if (uptimeMillis - j11 >= 300) {
                    if (z13) {
                        if (!z12 || m0Var.U > j11) {
                            m0Var.s.setRightMode(0);
                            m0Var.q0 = uptimeMillis;
                        }
                    } else if (z12 && uptimeMillis - m0Var.U > 1200 && uptimeMillis - m0Var.p0 > 1200) {
                        m0Var.s.setRightMode(2);
                        m0Var.q0 = uptimeMillis;
                    }
                }
                org.telegram.messenger.g0.i3(this, 50L);
                return;
            case 2:
                ai.p0 p0Var = (ai.p0) this.b;
                p0Var.j1 = false;
                if (p0Var.isAttachedToWindow() && p0Var.getVisibility() == 0) {
                    p0Var.invalidate();
                    p0Var.j1 = true;
                    p0Var.postOnAnimation(this);
                    return;
                }
                return;
            case 3:
                ai.g2 g2Var = (ai.g2) this.b;
                TextView textView = g2Var.a;
                Editable editableText = textView.getEditableText();
                if (editableText == null) {
                    g2Var.g = false;
                    return;
                }
                long uptimeMillis2 = SystemClock.uptimeMillis();
                ai.e2[] e2VarArr = (ai.e2[]) editableText.getSpans(0, editableText.length(), ai.e2.class);
                int length = e2VarArr.length;
                int i13 = 0;
                boolean z14 = false;
                while (i13 < length) {
                    ai.e2 e2Var = e2VarArr[i13];
                    int spanStart = editableText.getSpanStart(e2Var);
                    int spanEnd = editableText.getSpanEnd(e2Var);
                    if (spanStart < 0 || spanEnd <= spanStart) {
                        j3 = uptimeMillis2;
                    } else {
                        j3 = uptimeMillis2;
                        if (j3 < (Math.max(0, e2Var.c - 1) * 22) + e2Var.a + 320) {
                            editableText.setSpan(e2Var, spanStart, spanEnd, 33);
                            z14 = true;
                            i13++;
                            uptimeMillis2 = j3;
                        }
                    }
                    editableText.removeSpan(e2Var);
                    i13++;
                    uptimeMillis2 = j3;
                }
                long j12 = uptimeMillis2;
                ai.d2[] d2VarArr2 = (ai.d2[]) editableText.getSpans(0, editableText.length(), ai.d2.class);
                int length2 = d2VarArr2.length;
                boolean z15 = z14;
                int i14 = 0;
                while (i14 < length2) {
                    ai.d2 d2Var = d2VarArr2[i14];
                    int spanStart2 = editableText.getSpanStart(d2Var);
                    int spanEnd2 = editableText.getSpanEnd(d2Var);
                    if (spanStart2 < 0 || spanEnd2 <= spanStart2) {
                        d2VarArr = d2VarArr2;
                        i7 = length2;
                        i10 = i14;
                        editableText.removeSpan(d2Var);
                    } else if (p0.C(j12 - d2Var.a, 750.0f, 1.0f, 0.0f) >= 1.0f) {
                        editableText.removeSpan(d2Var);
                        d2VarArr = d2VarArr2;
                        i7 = length2;
                        i10 = i14;
                    } else {
                        long j13 = d2Var.b;
                        if (j13 <= 0) {
                            j13 = d2Var.a;
                        }
                        if (j12 >= j13 - 16) {
                            if (!d2Var.e) {
                                d2Var.e = true;
                                ai.z zVar = g2Var.h;
                                if (zVar != null) {
                                    ai.m0 m0Var2 = zVar.b;
                                    float[] fArr = m0Var2.C0;
                                    org.telegram.ui.Components.u5 u5Var = m0Var2.Y;
                                    if (u5Var == null || u5Var.c < 0.2f || !m0Var2.m(fArr) || (layout = m0Var2.f.b.F0.getLayout()) == null || spanEnd2 > layout.getText().length()) {
                                        d2VarArr = d2VarArr2;
                                        i7 = length2;
                                    } else {
                                        int lineForOffset = layout.getLineForOffset(spanStart2);
                                        float primaryHorizontal = layout.getPrimaryHorizontal(spanStart2);
                                        float primaryHorizontal2 = layout.getLineForOffset(spanEnd2) == lineForOffset ? layout.getPrimaryHorizontal(spanEnd2) : layout.getLineRight(lineForOffset);
                                        d2VarArr = d2VarArr2;
                                        ai.r0 r0Var = m0Var2.x;
                                        float f10 = primaryHorizontal + fArr[0];
                                        i7 = length2;
                                        float lineTop = layout.getLineTop(lineForOffset) + fArr[1];
                                        float max = Math.max(primaryHorizontal, primaryHorizontal2) + fArr[0];
                                        float lineBottom = layout.getLineBottom(lineForOffset) + fArr[1];
                                        int i15 = ((int) (m0Var2.Q * 2.5f)) + 2;
                                        Random random = r0Var.t;
                                        float f11 = 0.5f;
                                        int i16 = i15 + (random.nextFloat() < 0.5f ? 1 : 0);
                                        int i17 = 0;
                                        while (i17 < i16) {
                                            float f12 = f11;
                                            ai.r0 r0Var2 = r0Var;
                                            float max2 = (Math.max(1.0f, max - f10) * random.nextFloat()) + f10;
                                            float z16 = com.google.android.gms.internal.vision.e2.z(lineBottom, lineTop, org.telegram.ui.Cells.y0.g(random, 0.85f, 0.15f), lineTop);
                                            float L = org.telegram.messenger.g0.L((random.nextFloat() * 7.0f) + 3.0f);
                                            double nextFloat = ((random.nextFloat() - f12) * 2.2f) - 1.5707963267948966d;
                                            r0Var2.i(max2, z16, ((float) Math.cos(nextFloat)) * L, ((float) Math.sin(nextFloat)) * L, org.telegram.ui.Cells.y0.g(random, 0.55f, 0.45f), org.telegram.ui.Cells.y0.g(random, f12, 0.55f));
                                            i17++;
                                            f11 = f12;
                                            r0Var = r0Var2;
                                            i14 = i14;
                                            lineTop = lineTop;
                                        }
                                    }
                                    i10 = i14;
                                    editableText.setSpan(d2Var, spanStart2, spanEnd2, 33);
                                }
                            }
                            d2VarArr = d2VarArr2;
                            i7 = length2;
                            i10 = i14;
                            editableText.setSpan(d2Var, spanStart2, spanEnd2, 33);
                        } else {
                            d2VarArr = d2VarArr2;
                            i7 = length2;
                            i10 = i14;
                        }
                        z15 = true;
                    }
                    i14 = i10 + 1;
                    d2VarArr2 = d2VarArr;
                    length2 = i7;
                }
                for (ai.c2 c2Var : (ai.c2[]) editableText.getSpans(0, editableText.length(), ai.c2.class)) {
                    if (c2Var.a != 0) {
                        int spanStart3 = editableText.getSpanStart(c2Var);
                        int spanEnd3 = editableText.getSpanEnd(c2Var);
                        if (spanStart3 >= 0 && spanEnd3 > spanStart3) {
                            long j14 = c2Var.a;
                            if (j14 == 0 || j12 < j14 + 300) {
                                editableText.setSpan(c2Var, spanStart3, spanEnd3, 33);
                                z15 = true;
                            }
                        }
                        editableText.removeSpan(c2Var);
                    }
                }
                ai.f2 f2Var = g2Var.j;
                if (f2Var == null || g2Var.m <= 0.0f || editableText.getSpanStart(f2Var) < 0) {
                    z10 = false;
                    z11 = z15;
                } else {
                    z10 = false;
                    editableText.setSpan(g2Var.j, 0, editableText.length(), 18);
                    z11 = true;
                }
                if (z11) {
                    textView.postOnAnimation(this);
                    return;
                } else {
                    g2Var.g = z10;
                    return;
                }
            case 4:
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
            case 5:
                androidx.biometric.g0 g0Var = (androidx.biometric.g0) this.b;
                Context n10 = g0Var.n();
                if (n10 == null) {
                    Log.w("FingerprintFragment", "Not resetting the dialog. Context is null.");
                    return;
                } else {
                    g0Var.D0.f(1);
                    g0Var.D0.e(n10.getString(R.string.fingerprint_dialog_touch_sensor));
                    return;
                }
            case 6:
                androidx.fragment.app.p pVar = (androidx.fragment.app.p) this.b;
                pVar.o0.onDismiss(pVar.w0);
                return;
            case 7:
                androidx.fragment.app.s sVar = (androidx.fragment.app.s) this.b;
                if (sVar.Z != null) {
                    sVar.j().getClass();
                    return;
                }
                return;
            case 8:
                ((androidx.fragment.app.j0) this.b).A(true);
                return;
            case 9:
                synchronized (((androidx.lifecycle.z) this.b).a) {
                    obj = ((androidx.lifecycle.z) this.b).f;
                    ((androidx.lifecycle.z) this.b).f = androidx.lifecycle.z.k;
                }
                ((androidx.lifecycle.z) this.b).j(obj);
                return;
            case 10:
                androidx.mediarouter.app.t tVar = (androidx.mediarouter.app.t) this.b;
                tVar.i(true);
                tVar.V.requestLayout();
                tVar.V.getViewTreeObserver().addOnGlobalLayoutListener(new androidx.mediarouter.app.i(tVar, 0));
                return;
            case 11:
                androidx.mediarouter.app.t tVar2 = ((androidx.mediarouter.app.r) this.b).b;
                if (tVar2.d0 != null) {
                    tVar2.d0 = null;
                    if (tVar2.t0) {
                        tVar2.q(tVar2.u0);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                ((b3.m) this.b).d();
                return;
            case 13:
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
            case 14:
                bg.b0 b0Var = (bg.b0) this.b;
                if (b0Var.G.get()) {
                    b0Var.invalidate();
                    b0Var.I.postDelayed(this, 300L);
                    return;
                }
                return;
            case 15:
                c5.l lVar = (c5.l) this.b;
                lVar.setScrollState(0);
                lVar.s();
                return;
            case 16:
                uf ufVar = (uf) this.b;
                c8.fb fbVar = c8.fb.O1;
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
                            obj4 = new ArrayList(i11);
                        }
                        List list2 = (List) obj4;
                        ArrayList arrayList2 = new ArrayList(list2 instanceof RandomAccess ? new be(jgVar, next2, list2, fVar) : new f(jgVar, next2, list2, fVar));
                        Collections.sort(arrayList2);
                        k7 k7Var2 = new k7();
                        int size3 = arrayList2.size();
                        long j15 = 0;
                        int i18 = 0;
                        while (i18 < size3) {
                            Object obj5 = arrayList2.get(i18);
                            i18++;
                            j15 = ((Long) obj5).longValue() + j15;
                        }
                        jg jgVar4 = jgVar;
                        k7Var2.c = Long.valueOf((j15 / arrayList2.size()) & Long.MAX_VALUE);
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
                        pb.n.a.execute(new qa(ufVar2, new xa(dVar, 0), fbVar2, ufVar.c(), 1));
                        fbVar = fbVar2;
                        ufVar = ufVar2;
                        jgVar = jgVar4;
                        fVar = null;
                        i11 = 3;
                    }
                    hashMap2.remove(fbVar);
                    return;
                }
                return;
            case 17:
                ci.a0 a0Var3 = (ci.a0) this.b;
                CameraView cameraView = a0Var3.b;
                if (!a0Var3.i0 || cameraView == null) {
                    return;
                }
                TextureView textureView = cameraView.getTextureView();
                int width = textureView.getWidth();
                int height = textureView.getHeight();
                if (width > 0 && height > 0) {
                    if (width > 720 || height > 720) {
                        float f13 = width;
                        float f14 = height;
                        float min = Math.min(720.0f / f13, 720.0f / f14);
                        width = Math.max(1, (int) (f13 * min));
                        height = Math.max(1, (int) (f14 * min));
                    }
                    Bitmap bitmap = ((ci.a0) this.b).l0;
                    if (bitmap == null || bitmap.getWidth() != width || ((ci.a0) this.b).l0.getHeight() != height) {
                        ((ci.a0) this.b).l0 = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                    }
                    try {
                        textureView.getBitmap(((ci.a0) this.b).l0);
                        ci.a0 a0Var4 = (ci.a0) this.b;
                        q4.q f15 = ci.a0.f(a0Var4.l0, a0Var4.j0, a0Var4.k0, a0Var4.P);
                        if (f15 != null) {
                            org.telegram.messenger.g0.h3(new c1.c(12, this, f15));
                            return;
                        }
                    } catch (Throwable th2) {
                        org.telegram.messenger.a8.g(th2, true);
                    }
                }
                if (((ci.a0) this.b).i0) {
                    ((ci.a0) this.b).h0.postDelayed(this, 150L);
                    return;
                }
                return;
            case 18:
                com.google.android.gms.common.api.internal.c0 c0Var = (com.google.android.gms.common.api.internal.c0) this.b;
                n6.e eVar = c0Var.d;
                Context context = c0Var.c;
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
            case 19:
                ((com.google.android.gms.common.api.internal.l0) this.b).a();
                return;
            case 20:
                com.google.android.gms.common.api.internal.l0 l0Var = (com.google.android.gms.common.api.internal.l0) ((d6.i) this.b).b;
                ((q6.d) l0Var.b).j(l0Var.b.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 21:
                ((com.google.android.gms.common.api.internal.x0) this.b).j.b(new n6.a(4, null, null));
                return;
            case 22:
                com.google.android.gms.common.api.internal.h1 h1Var = (com.google.android.gms.common.api.internal.h1) this.b;
                h1Var.o.lock();
                try {
                    h1Var.j();
                    return;
                } finally {
                    h1Var.o.unlock();
                }
            case 23:
                f5.t tVar3 = (f5.t) this.b;
                f5.b bVar3 = tVar3.d;
                bVar3.k(0);
                f5.f fVar2 = f5.a0.i;
                bVar3.j(24, fVar2);
                tVar3.c(fVar2);
                return;
            case 24:
                fi.b4 b4Var = (fi.b4) this.b;
                if (b4Var.u1 && b4Var.L0) {
                    fi.i9 i9Var = ((fi.z8) b4Var.A1).d;
                    i9Var.l1 = false;
                    i9Var.V();
                    return;
                }
                return;
            case 25:
                ((fi.w) this.b).M0 = false;
                return;
            case 26:
                fi.r7 r7Var = (fi.r7) this.b;
                r7Var.b = false;
                r7Var.invalidate();
                return;
            case 27:
                tg.j jVar = ((hi.u9) this.b).t0;
                if (jVar instanceof tg.o2) {
                    ((tg.o2) jVar).getEditText();
                    return;
                }
                return;
            case 28:
                i.e eVar2 = (i.e) this.b;
                eVar2.a(true);
                eVar2.invalidateSelf();
                return;
            default:
                ((i6.h) this.b).g(false);
                return;
        }
    }

    public /* synthetic */ sa(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    public sa(com.google.android.gms.common.api.internal.x0 x0Var) {
        this.a = 21;
        Objects.requireNonNull(x0Var);
        this.b = x0Var;
    }
}
