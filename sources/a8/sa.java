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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
        ai.y1[] y1VarArr;
        int i7;
        int i10;
        Layout layout;
        boolean z12;
        TextView textView;
        int i11;
        Object obj;
        int i12;
        char c10;
        float hypot;
        double d = 75.0d;
        double d2 = 100.0d;
        int i13 = 3;
        int i14 = 2;
        float f10 = 0.0f;
        boolean z13 = true;
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
                        long j3 = 0;
                        int i15 = 0;
                        while (i15 < size) {
                            Object obj3 = arrayList.get(i15);
                            i15++;
                            j3 = ((Long) obj3).longValue() + j3;
                        }
                        k7Var.c = Long.valueOf((j3 / arrayList.size()) & Long.MAX_VALUE);
                        k7Var.a = Long.valueOf(ua.a(arrayList, d2) & Long.MAX_VALUE);
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
                        d2 = 100.0d;
                    }
                    hashMap.remove(a8Var);
                    return;
                }
                return;
            case 1:
                org.telegram.messenger.g0.r(this);
                ai.l0 l0Var = (ai.l0) this.b;
                if (l0Var.r != 1 || l0Var.s == null) {
                    return;
                }
                Editable text = l0Var.f.a.F0.getText();
                boolean z14 = text != null && text.toString().trim().length() > 0;
                long uptimeMillis = SystemClock.uptimeMillis();
                boolean z15 = l0Var.s.getRightMode() == 2;
                long j10 = l0Var.r0;
                if (uptimeMillis - j10 >= 300) {
                    if (z15) {
                        if (!z14 || l0Var.U > j10) {
                            l0Var.s.setRightMode(0);
                            l0Var.r0 = uptimeMillis;
                        }
                    } else if (z14 && uptimeMillis - l0Var.U > 1200 && uptimeMillis - l0Var.q0 > 1200) {
                        l0Var.s.setRightMode(2);
                        l0Var.r0 = uptimeMillis;
                    }
                }
                org.telegram.messenger.g0.h3(this, 50L);
                return;
            case 2:
                ai.o0 o0Var = (ai.o0) this.b;
                o0Var.j1 = false;
                if (o0Var.isAttachedToWindow() && o0Var.getVisibility() == 0) {
                    o0Var.invalidate();
                    o0Var.j1 = true;
                    o0Var.postOnAnimation(this);
                    return;
                }
                return;
            case 3:
                ai.b2 b2Var = (ai.b2) this.b;
                TextView textView2 = b2Var.a;
                Editable editableText = textView2.getEditableText();
                if (editableText == null) {
                    b2Var.g = false;
                    return;
                }
                long uptimeMillis2 = SystemClock.uptimeMillis();
                ai.z1[] z1VarArr = (ai.z1[]) editableText.getSpans(0, editableText.length(), ai.z1.class);
                int length = z1VarArr.length;
                int i16 = 0;
                boolean z16 = false;
                while (i16 < length) {
                    ai.z1 z1Var = z1VarArr[i16];
                    int spanStart = editableText.getSpanStart(z1Var);
                    int spanEnd = editableText.getSpanEnd(z1Var);
                    if (spanStart < 0 || spanEnd <= spanStart) {
                        z12 = z13;
                        textView = textView2;
                        i11 = i14;
                    } else {
                        z12 = z13;
                        textView = textView2;
                        i11 = i14;
                        if (uptimeMillis2 < (Math.max(0, z1Var.c - 1) * 22) + z1Var.a + 320) {
                            editableText.setSpan(z1Var, spanStart, spanEnd, 33);
                            z16 = z12;
                            i16++;
                            textView2 = textView;
                            z13 = z12;
                            i14 = i11;
                        }
                    }
                    editableText.removeSpan(z1Var);
                    i16++;
                    textView2 = textView;
                    z13 = z12;
                    i14 = i11;
                }
                boolean z17 = z13;
                TextView textView3 = textView2;
                ai.y1[] y1VarArr2 = (ai.y1[]) editableText.getSpans(0, editableText.length(), ai.y1.class);
                int length2 = y1VarArr2.length;
                int i17 = 0;
                while (i17 < length2) {
                    ai.y1 y1Var = y1VarArr2[i17];
                    int spanStart2 = editableText.getSpanStart(y1Var);
                    int spanEnd2 = editableText.getSpanEnd(y1Var);
                    if (spanStart2 < 0 || spanEnd2 <= spanStart2) {
                        y1VarArr = y1VarArr2;
                        i7 = length2;
                        i10 = i17;
                        editableText.removeSpan(y1Var);
                    } else if (p0.C(uptimeMillis2 - y1Var.a, 750.0f, 1.0f, f10) >= 1.0f) {
                        editableText.removeSpan(y1Var);
                        y1VarArr = y1VarArr2;
                        i7 = length2;
                        i10 = i17;
                    } else {
                        long j11 = y1Var.b;
                        if (j11 <= 0) {
                            j11 = y1Var.a;
                        }
                        if (uptimeMillis2 >= j11 - 16) {
                            if (!y1Var.e) {
                                y1Var.e = z17;
                                ai.w wVar = b2Var.h;
                                if (wVar != null) {
                                    ai.l0 l0Var2 = wVar.b;
                                    float[] fArr = l0Var2.D0;
                                    org.telegram.ui.Components.c6 c6Var = l0Var2.Y;
                                    if (c6Var != null && c6Var.c >= 0.2f && l0Var2.p(fArr) && (layout = l0Var2.f.a.F0.getLayout()) != null && spanEnd2 <= layout.getText().length()) {
                                        int lineForOffset = layout.getLineForOffset(spanStart2);
                                        float primaryHorizontal = layout.getPrimaryHorizontal(spanStart2);
                                        y1VarArr = y1VarArr2;
                                        float primaryHorizontal2 = layout.getLineForOffset(spanEnd2) == lineForOffset ? layout.getPrimaryHorizontal(spanEnd2) : layout.getLineRight(lineForOffset);
                                        i7 = length2;
                                        ai.q0 q0Var = l0Var2.x;
                                        float f11 = primaryHorizontal + fArr[0];
                                        i10 = i17;
                                        float lineTop = layout.getLineTop(lineForOffset) + fArr[1];
                                        float max = Math.max(primaryHorizontal, primaryHorizontal2) + fArr[0];
                                        float lineBottom = layout.getLineBottom(lineForOffset) + fArr[1];
                                        int i18 = ((int) (l0Var2.Q * 2.5f)) + 2;
                                        Random random = q0Var.t;
                                        float f12 = 0.5f;
                                        int i19 = i18 + (random.nextFloat() < 0.5f ? 1 : 0);
                                        int i20 = 0;
                                        while (i20 < i19) {
                                            float f13 = f12;
                                            float f14 = max;
                                            float max2 = (Math.max(1.0f, max - f11) * random.nextFloat()) + f11;
                                            float z18 = com.google.android.gms.internal.vision.e2.z(lineBottom, lineTop, org.telegram.ui.Cells.c0.h(random, 0.85f, 0.15f), lineTop);
                                            float L = org.telegram.messenger.g0.L((random.nextFloat() * 7.0f) + 3.0f);
                                            ai.q0 q0Var2 = q0Var;
                                            double nextFloat = ((random.nextFloat() - f13) * 2.2f) - 1.5707963267948966d;
                                            q0Var2.j(max2, z18, ((float) Math.cos(nextFloat)) * L, ((float) Math.sin(nextFloat)) * L, org.telegram.ui.Cells.c0.h(random, 0.55f, 0.45f), org.telegram.ui.Cells.c0.h(random, f13, 0.55f));
                                            i20++;
                                            f12 = f13;
                                            q0Var = q0Var2;
                                            max = f14;
                                        }
                                        editableText.setSpan(y1Var, spanStart2, spanEnd2, 33);
                                    }
                                }
                            }
                            y1VarArr = y1VarArr2;
                            i7 = length2;
                            i10 = i17;
                            editableText.setSpan(y1Var, spanStart2, spanEnd2, 33);
                        } else {
                            y1VarArr = y1VarArr2;
                            i7 = length2;
                            i10 = i17;
                        }
                        z16 = true;
                    }
                    i17 = i10 + 1;
                    y1VarArr2 = y1VarArr;
                    length2 = i7;
                    z17 = true;
                    f10 = 0.0f;
                }
                for (ai.x1 x1Var : (ai.x1[]) editableText.getSpans(0, editableText.length(), ai.x1.class)) {
                    if (x1Var.a != 0) {
                        int spanStart3 = editableText.getSpanStart(x1Var);
                        int spanEnd3 = editableText.getSpanEnd(x1Var);
                        if (spanStart3 >= 0 && spanEnd3 > spanStart3) {
                            long j12 = x1Var.a;
                            if (j12 == 0 || uptimeMillis2 < j12 + 300) {
                                editableText.setSpan(x1Var, spanStart3, spanEnd3, 33);
                                z16 = true;
                            }
                        }
                        editableText.removeSpan(x1Var);
                    }
                }
                ai.a2 a2Var = b2Var.j;
                if (a2Var == null || b2Var.m <= 0.0f || editableText.getSpanStart(a2Var) < 0) {
                    z10 = false;
                    z11 = z16;
                } else {
                    z10 = false;
                    editableText.setSpan(b2Var.j, 0, editableText.length(), 18);
                    z11 = true;
                }
                if (z11) {
                    textView3.postOnAnimation(this);
                    return;
                } else {
                    b2Var.g = z10;
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
                ((b3.n) this.b).e();
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
                    org.telegram.messenger.g0.h3(((bg.i) this.b).p, 5000L);
                    return;
                }
            case 14:
                bg.c0 c0Var = (bg.c0) this.b;
                if (c0Var.G.get()) {
                    c0Var.invalidate();
                    c0Var.I.postDelayed(this, 300L);
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
                            obj4 = new ArrayList(i13);
                        }
                        List list2 = (List) obj4;
                        ArrayList arrayList2 = new ArrayList(list2 instanceof RandomAccess ? new be(jgVar, next2, list2, null) : new f(jgVar, next2, list2, (f) null));
                        Collections.sort(arrayList2);
                        k7 k7Var2 = new k7();
                        int size3 = arrayList2.size();
                        long j13 = 0;
                        int i21 = 0;
                        while (i21 < size3) {
                            Object obj5 = arrayList2.get(i21);
                            i21++;
                            j13 = ((Long) obj5).longValue() + j13;
                        }
                        k7Var2.c = Long.valueOf((j13 / arrayList2.size()) & Long.MAX_VALUE);
                        k7Var2.a = Long.valueOf(uf.a(arrayList2, 100.0d) & Long.MAX_VALUE);
                        k7Var2.f = Long.valueOf(uf.a(arrayList2, d) & Long.MAX_VALUE);
                        k7Var2.e = Long.valueOf(uf.a(arrayList2, 50.0d) & Long.MAX_VALUE);
                        k7Var2.d = Long.valueOf(uf.a(arrayList2, 25.0d) & Long.MAX_VALUE);
                        k7Var2.b = Long.valueOf(uf.a(arrayList2, 0.0d) & Long.MAX_VALUE);
                        c8.la laVar = new c8.la(k7Var2);
                        int size4 = arrayList2.size();
                        ga.d dVar = new ga.d();
                        dVar.c = c8.db.b;
                        android.support.v4.media.session.a0 a0Var2 = new android.support.v4.media.session.a0(15, false);
                        a0Var2.c = Integer.valueOf(size4 & ConnectionsManager.DEFAULT_DATACENTER_ID);
                        a0Var2.b = (c8.h1) next2;
                        a0Var2.d = laVar;
                        dVar.h = new c8.i1(a0Var2);
                        uf ufVar2 = ufVar;
                        c8.fb fbVar2 = fbVar;
                        pb.n.a.execute(new qa(ufVar2, new xa(dVar, 0), fbVar2, ufVar.c(), 1));
                        fbVar = fbVar2;
                        ufVar = ufVar2;
                        d = 75.0d;
                        i13 = 3;
                    }
                    hashMap2.remove(fbVar);
                    return;
                }
                return;
            case 17:
                ci.b0 b0Var = (ci.b0) this.b;
                CameraView cameraView = b0Var.b;
                if (!b0Var.i0 || cameraView == null) {
                    return;
                }
                TextureView textureView = cameraView.getTextureView();
                int width = textureView.getWidth();
                int height = textureView.getHeight();
                if (width > 0 && height > 0) {
                    if (width > 720 || height > 720) {
                        float f15 = width;
                        float f16 = height;
                        float min = Math.min(720.0f / f15, 720.0f / f16);
                        width = Math.max(1, (int) (f15 * min));
                        height = Math.max(1, (int) (f16 * min));
                    }
                    Bitmap bitmap = ((ci.b0) this.b).l0;
                    if (bitmap == null || bitmap.getWidth() != width || ((ci.b0) this.b).l0.getHeight() != height) {
                        ((ci.b0) this.b).l0 = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                    }
                    try {
                        textureView.getBitmap(((ci.b0) this.b).l0);
                        ci.b0 b0Var2 = (ci.b0) this.b;
                        q4.q f17 = ci.b0.f(b0Var2.l0, b0Var2.j0, b0Var2.k0, b0Var2.P);
                        if (f17 != null) {
                            org.telegram.messenger.g0.g3(new c1.a(13, this, f17));
                            return;
                        }
                    } catch (Throwable th2) {
                        org.telegram.messenger.a8.g(th2, true);
                    }
                }
                if (((ci.b0) this.b).i0) {
                    ((ci.b0) this.b).h0.postDelayed(this, 150L);
                    return;
                }
                return;
            case 18:
                com.google.android.gms.common.api.internal.c0 c0Var2 = (com.google.android.gms.common.api.internal.c0) this.b;
                n6.e eVar = c0Var2.d;
                Context context = c0Var2.c;
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
                ((com.google.android.gms.common.api.internal.k0) this.b).a();
                return;
            case 20:
                com.google.android.gms.common.api.internal.k0 k0Var = (com.google.android.gms.common.api.internal.k0) ((ob.c) this.b).b;
                ((q6.d) k0Var.b).j(k0Var.b.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 21:
                ((com.google.android.gms.common.api.internal.w0) this.b).j.b(new n6.a(4, null, null));
                return;
            case 22:
                com.google.android.gms.common.api.internal.g1 g1Var = (com.google.android.gms.common.api.internal.g1) this.b;
                g1Var.o.lock();
                try {
                    g1Var.j();
                    return;
                } finally {
                    g1Var.o.unlock();
                }
            case 23:
                f5.t tVar3 = (f5.t) this.b;
                f5.b bVar3 = tVar3.e;
                bVar3.k(0);
                f5.f fVar = f5.z.i;
                bVar3.j(24, tVar3.d, fVar);
                tVar3.c(fVar);
                return;
            case 24:
                fi.z3 z3Var = (fi.z3) this.b;
                if (z3Var.u1 && z3Var.L0) {
                    fi.f9 f9Var = ((fi.w8) z3Var.A1).d;
                    f9Var.l1 = false;
                    f9Var.V();
                    return;
                }
                return;
            case 25:
                ((fi.w) this.b).M0 = false;
                return;
            case 26:
                fi.o7 o7Var = (fi.o7) this.b;
                o7Var.b = false;
                o7Var.invalidate();
                return;
            case 27:
                hi.a0 a0Var3 = (hi.a0) this.b;
                tg.d dVar2 = a0Var3.f;
                if (dVar2 == null || a0Var3.e == null) {
                    return;
                }
                float[] fArr2 = a0Var3.h;
                float[] fArr3 = a0Var3.g;
                float width2 = dVar2.getWidth();
                float height2 = dVar2.getHeight();
                float f18 = Float.MAX_VALUE;
                float f19 = -3.4028235E38f;
                int i22 = 0;
                while (i22 < 4) {
                    int i23 = i14;
                    a0Var3.d(dVar2, i22 % 2 == 0 ? 0.0f : width2, i22 < i14 ? 0.0f : height2);
                    f18 = Math.min(f18, fArr3[1]);
                    f19 = Math.max(f19, fArr3[1]);
                    i22++;
                    i14 = i23;
                }
                int i24 = i14;
                float f20 = width2 / 2.0f;
                float f21 = height2 / 2.0f;
                float d10 = a0Var3.d(dVar2, f20, f21);
                float f22 = fArr3[1];
                float d11 = a0Var3.d(dVar2, width2, f21) - d10;
                float f23 = fArr3[1] - f22;
                if (width2 <= 0.0f) {
                    i12 = i24;
                    c10 = 0;
                    hypot = 1.0f;
                } else {
                    i12 = i24;
                    c10 = 0;
                    hypot = ((float) Math.hypot(d11, f23)) / f20;
                }
                hi.a0.g(dVar2, fArr2);
                a0Var3.e.d(d10, f22, f18, f19, (float) Math.toDegrees(Math.atan2(f23, d11)), hypot, dVar2.getEditText().getPaint(), dVar2.getEditText().getCurrentTextColor(), fArr2[c10], fArr2[1], fArr2[i12], dVar2.getEditText().getLayout() != null ? dVar2.getEditText().getLayout().getAlignment() : null);
                if (dVar2.getParent() == null) {
                    a0Var3.e.e(null, null);
                } else {
                    a0Var3.e.e(dVar2.x(-1), dVar2.x(1));
                }
                a0Var3.e.postOnAnimation(this);
                return;
            case 28:
                tg.n nVar = ((hi.pa) this.b).t0;
                if (nVar instanceof tg.q2) {
                    ((tg.q2) nVar).getEditText();
                    return;
                }
                return;
            default:
                i.e eVar2 = (i.e) this.b;
                eVar2.a(true);
                eVar2.invalidateSelf();
                return;
        }
    }

    public /* synthetic */ sa(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    public sa(com.google.android.gms.common.api.internal.w0 w0Var) {
        this.a = 21;
        Objects.requireNonNull(w0Var);
        this.b = w0Var;
    }
}
