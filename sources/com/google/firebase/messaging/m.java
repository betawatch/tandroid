package com.google.firebase.messaging;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import c3.h0;
import e9.f1;
import gg.t1;
import gg.v1;
import j$.util.Objects;
import java.lang.reflect.Array;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import m.r3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.l1;
import org.telegram.ui.Components.pu;
import org.telegram.ui.Components.wr;
import org.telegram.ui.a1;
import org.telegram.ui.c5;
import org.telegram.ui.s4;
import org.telegram.ui.v4;
import org.telegram.ui.x4;
import r0.i0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class m implements c3.q {
    public static m e;
    public boolean a;
    public Object b;
    public Object c;
    public Object d;

    public m(View view) {
        pu[] puVarArr = {new pu(), new pu(), new pu()};
        this.b = puVarArr;
        this.d = new ArrayList();
        AnimatorSet animatorSet = new AnimatorSet();
        this.c = animatorSet;
        animatorSet.playTogether(g(puVarArr[0], 0, 255, 0, 300), g(puVarArr[1], 0, 255, ImageReceiver.DEFAULT_CROSSFADE_DURATION, 300), g(puVarArr[2], 0, 255, 300, 300), g(puVarArr[0], 255, 0, MediaDataController.MAX_STYLE_RUNS_COUNT, 400), g(puVarArr[1], 255, 0, MediaDataController.MAX_STYLE_RUNS_COUNT, 400), g(puVarArr[2], 255, 0, MediaDataController.MAX_STYLE_RUNS_COUNT, 400));
        animatorSet.addListener(new l1(this, view));
    }

    public static void a(jc.e[][][] eVarArr, int i10, jc.e eVar) {
        jc.e[] eVarArr2 = eVarArr[i10 + eVar.d][eVar.c];
        hc.f fVar = eVar.a;
        int ordinal = fVar.ordinal();
        char c10 = 2;
        if (ordinal != 1) {
            if (ordinal == 2) {
                c10 = 1;
            } else if (ordinal == 4) {
                c10 = 3;
            } else {
                if (ordinal != 6) {
                    throw new IllegalStateException("Illegal mode " + fVar);
                }
                c10 = 0;
            }
        }
        jc.e eVar2 = eVarArr2[c10];
        if (eVar2 == null || eVar2.f > eVar.f) {
            eVarArr2[c10] = eVar;
        }
    }

    public static boolean d(hc.f fVar, char c10) {
        int ordinal = fVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                if ((c10 < '`' ? jc.c.a[c10] : -1) == -1) {
                    return false;
                }
            } else if (ordinal != 4) {
                if (ordinal != 6) {
                    return false;
                }
                return jc.c.b(String.valueOf(c10));
            }
        } else if (c10 < '0' || c10 > '9') {
            return false;
        }
        return true;
    }

    public static boolean e(x4 x4Var) {
        return (x4Var.a == null && x4Var.b == null) ? false : true;
    }

    public static m k() {
        if (e == null) {
            e = new m();
        }
        return e;
    }

    public static hc.g l(int i10) {
        int c10 = m1.j.c(i10);
        return c10 != 0 ? c10 != 1 ? hc.g.c(40) : hc.g.c(26) : hc.g.c(9);
    }

    @Override // c3.q
    public void B() {
        SparseArray sparseArray = (SparseArray) this.d;
        ((c3.q) this.b).B();
        if (this.a) {
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                ((z3.o) sparseArray.valueAt(i10)).i = true;
            }
        }
    }

    @Override // c3.q
    public void G(c3.b0 b0Var) {
        ((c3.q) this.b).G(b0Var);
    }

    @Override // c3.q
    public h0 I(int i10, int i11) {
        SparseArray sparseArray = (SparseArray) this.d;
        c3.q qVar = (c3.q) this.b;
        if (i11 != 3) {
            this.a = true;
            return qVar.I(i10, i11);
        }
        z3.o oVar = (z3.o) sparseArray.get(i10);
        if (oVar != null) {
            return oVar;
        }
        z3.o oVar2 = new z3.o(qVar.I(i10, i11), (z3.k) this.c);
        sparseArray.put(i10, oVar2);
        return oVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(hc.g gVar, jc.e[][][] eVarArr, int i10, jc.e eVar) {
        int i11;
        int i12;
        char charAt;
        hc.f fVar;
        char charAt2;
        hc.f fVar2;
        char charAt3;
        hc.f fVar3;
        int i13;
        String str = (String) this.b;
        dc.e eVar2 = (dc.e) this.c;
        CharsetEncoder[] charsetEncoderArr = eVar2.a;
        CharsetEncoder[] charsetEncoderArr2 = eVar2.a;
        int length = charsetEncoderArr.length;
        int i14 = eVar2.b;
        if (i14 >= 0) {
            char charAt4 = str.charAt(i10);
            if (charsetEncoderArr2[i14].canEncode("" + charAt4)) {
                length = i14 + 1;
                i11 = length;
                for (i12 = i14; i12 < i11; i12++) {
                    char charAt5 = str.charAt(i10);
                    if (charsetEncoderArr2[i12].canEncode("" + charAt5)) {
                        a(eVarArr, i10, new jc.e(this, hc.f.h, i10, i12, 1, eVar, gVar));
                    }
                }
                charAt = str.charAt(i10);
                fVar = hc.f.r;
                if (d(fVar, charAt)) {
                    a(eVarArr, i10, new jc.e(this, fVar, i10, 0, 1, eVar, gVar));
                }
                int length2 = str.length();
                charAt2 = str.charAt(i10);
                fVar2 = hc.f.e;
                if (d(fVar2, charAt2)) {
                    int i15 = i10 + 1;
                    a(eVarArr, i10, new jc.e(this, fVar2, i10, 0, (i15 >= length2 || !d(fVar2, str.charAt(i15))) ? 1 : 2, eVar, gVar));
                }
                charAt3 = str.charAt(i10);
                fVar3 = hc.f.d;
                if (d(fVar3, charAt3)) {
                    return;
                }
                int i16 = i10 + 1;
                if (i16 >= length2 || !d(fVar3, str.charAt(i16))) {
                    i13 = 1;
                } else {
                    int i17 = i10 + 2;
                    i13 = (i17 >= length2 || !d(fVar3, str.charAt(i17))) ? 2 : 3;
                }
                a(eVarArr, i10, new jc.e(this, fVar3, i10, 0, i13, eVar, gVar));
                return;
            }
        }
        i14 = 0;
        i11 = length;
        while (i12 < i11) {
        }
        charAt = str.charAt(i10);
        fVar = hc.f.r;
        if (d(fVar, charAt)) {
        }
        int length22 = str.length();
        charAt2 = str.charAt(i10);
        fVar2 = hc.f.e;
        if (d(fVar2, charAt2)) {
        }
        charAt3 = str.charAt(i10);
        fVar3 = hc.f.d;
        if (d(fVar3, charAt3)) {
        }
    }

    public void c(View view) {
        ArrayList arrayList = (ArrayList) this.d;
        if (arrayList.isEmpty()) {
            ((AnimatorSet) this.c).start();
        }
        if (arrayList.contains(view)) {
            return;
        }
        arrayList.add(view);
    }

    public int f(int i10, int i11, int i12) {
        dc.b bVar = (dc.b) this.b;
        return this.a ? bVar.b(i11, i10) : bVar.b(i10, i11) ? (i12 << 1) | 1 : i12 << 1;
    }

    public ValueAnimator g(pu puVar, int i10, int i11, int i12, int i13) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i10, i11);
        ofInt.addUpdateListener(new t1(13, this, puVar));
        ofInt.setDuration(i13);
        ofInt.setStartDelay(i12);
        ofInt.setInterpolator(wr.f);
        return ofInt;
    }

    public aa.a h(hc.g gVar) {
        int i10;
        String str = (String) this.b;
        int length = str.length();
        dc.e eVar = (dc.e) this.c;
        CharsetEncoder[] charsetEncoderArr = eVar.a;
        CharsetEncoder[] charsetEncoderArr2 = eVar.a;
        jc.e[][][] eVarArr = (jc.e[][][]) Array.newInstance((Class<?>) jc.e.class, length + 1, charsetEncoderArr.length, 4);
        b(gVar, eVarArr, 0, null);
        for (int i11 = 1; i11 <= length; i11++) {
            for (int i12 = 0; i12 < charsetEncoderArr2.length; i12++) {
                for (int i13 = 0; i13 < 4; i13++) {
                    jc.e eVar2 = eVarArr[i11][i12][i13];
                    if (eVar2 != null && i11 < length) {
                        b(gVar, eVarArr, i11, eVar2);
                    }
                }
            }
        }
        int i14 = -1;
        int i15 = -1;
        int i16 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i17 = 0; i17 < charsetEncoderArr2.length; i17++) {
            for (int i18 = 0; i18 < 4; i18++) {
                jc.e eVar3 = eVarArr[length][i17][i18];
                if (eVar3 != null && (i10 = eVar3.f) < i16) {
                    i14 = i17;
                    i15 = i18;
                    i16 = i10;
                }
            }
        }
        if (i14 >= 0) {
            return new aa.a(this, gVar, eVarArr[length][i14][i15]);
        }
        throw new cc.k(a4.a.p("Internal error: failed to encode \"", str, "\""));
    }

    public byte[] i(UUID uuid, n2.p pVar) {
        String str = pVar.b;
        if (this.a || TextUtils.isEmpty(str)) {
            str = (String) this.c;
        }
        if (TextUtils.isEmpty(str)) {
            Map map = Collections.EMPTY_MAP;
            Uri uri = Uri.EMPTY;
            e2.d.i(uri, "The uri must be set.");
            throw new n2.w(new g2.m(uri, 1, null, map, 0L, -1L, null, 0), uri, f1.h, 0L, new IllegalStateException("No license URL"));
        }
        HashMap hashMap = new HashMap();
        UUID uuid2 = b2.i.e;
        hashMap.put("Content-Type", uuid2.equals(uuid) ? "text/xml" : b2.i.c.equals(uuid) ? "application/json" : "application/octet-stream");
        if (uuid2.equals(uuid)) {
            hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (((HashMap) this.d)) {
            hashMap.putAll((HashMap) this.d);
        }
        return w7.a0.a(((g2.o) this.b).createDataSource(), str, pVar.a, hashMap);
    }

    public byte[] j(n2.q qVar) {
        return w7.a0.a(((g2.o) this.b).createDataSource(), qVar.b + "&signedRequest=" + e2.d0.p(qVar.a), null, Collections.EMPTY_MAP);
    }

    public synchronized void m() {
        try {
            if (this.a) {
                return;
            }
            Boolean o9 = o();
            this.c = o9;
            if (o9 == null) {
                ((q9.l) ((ma.b) this.b)).a(new androidx.emoji2.text.w(20));
            }
            this.a = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized boolean n() {
        Boolean bool;
        try {
            m();
            bool = (Boolean) this.c;
        } catch (Throwable th2) {
            throw th2;
        }
        return bool != null ? bool.booleanValue() : ((FirebaseMessaging) this.d).a.h();
    }

    public Boolean o() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        k9.h hVar = ((FirebaseMessaging) this.d).a;
        hVar.a();
        Context context = hVar.a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public hc.e p() {
        hc.e eVar = (hc.e) this.d;
        if (eVar != null) {
            return eVar;
        }
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < 6; i12++) {
            i11 = f(i12, 8, i11);
        }
        int f7 = f(8, 7, f(8, 8, f(7, 8, i11)));
        for (int i13 = 5; i13 >= 0; i13--) {
            f7 = f(8, i13, f7);
        }
        int i14 = ((dc.b) this.b).b;
        int i15 = i14 - 7;
        for (int i16 = i14 - 1; i16 >= i15; i16--) {
            i10 = f(8, i16, i10);
        }
        for (int i17 = i14 - 8; i17 < i14; i17++) {
            i10 = f(i17, 8, i10);
        }
        hc.e a2 = hc.e.a(f7, i10);
        if (a2 == null) {
            a2 = hc.e.a(f7 ^ 21522, i10 ^ 21522);
        }
        this.d = a2;
        if (a2 != null) {
            return a2;
        }
        throw cc.c.a();
    }

    public hc.g q() {
        hc.g gVar = (hc.g) this.c;
        if (gVar != null) {
            return gVar;
        }
        int i10 = ((dc.b) this.b).b;
        int i11 = (i10 - 17) / 4;
        if (i11 <= 6) {
            return hc.g.c(i11);
        }
        int i12 = i10 - 11;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 5; i15 >= 0; i15--) {
            for (int i16 = i10 - 9; i16 >= i12; i16--) {
                i14 = f(i16, i15, i14);
            }
        }
        hc.g b10 = hc.g.b(i14);
        if (b10 != null && (b10.a * 4) + 17 == i10) {
            this.c = b10;
            return b10;
        }
        for (int i17 = 5; i17 >= 0; i17--) {
            for (int i18 = i10 - 9; i18 >= i12; i18--) {
                i13 = f(i17, i18, i13);
            }
        }
        hc.g b11 = hc.g.b(i13);
        if (b11 == null || (b11.a * 4) + 17 != i10) {
            throw cc.c.a();
        }
        this.c = b11;
        return b11;
    }

    public void r() {
        if (((hc.e) this.d) == null) {
            return;
        }
        int i10 = m1.j.d(8)[((hc.e) this.d).b];
        dc.b bVar = (dc.b) this.b;
        int i11 = bVar.b;
        for (int i12 = 0; i12 < i11; i12++) {
            for (int i13 = 0; i13 < i11; i13++) {
                if (hc.b.a(i10, i12, i13)) {
                    bVar.a(i13, i12);
                }
            }
        }
    }

    public void s(View view) {
        ArrayList arrayList = (ArrayList) this.d;
        arrayList.remove(view);
        if (arrayList.isEmpty()) {
            ((AnimatorSet) this.c).cancel();
        }
    }

    public void t() {
        e2.z zVar = (e2.z) this.d;
        if (this.a) {
            zVar.c(new v1(this, 9));
            this.a = false;
        }
    }

    public boolean u(String str, String str2) {
        synchronized (this) {
            try {
                if (!((x9.d) ((AtomicMarkableReference) this.b).getReference()).c(str, str2)) {
                    return false;
                }
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) this.b;
                atomicMarkableReference.set((x9.d) atomicMarkableReference.getReference(), true);
                b5.g gVar = new b5.g(this, 2);
                AtomicReference atomicReference = (AtomicReference) this.c;
                while (!atomicReference.compareAndSet(null, gVar)) {
                    if (atomicReference.get() != null) {
                        return true;
                    }
                }
                ((s) ((r3) this.d).b).o(gVar);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void v(ViewGroup viewGroup, f6 f6Var, x4 x4Var, v4 v4Var) {
        Objects.requireNonNull(viewGroup);
        Context context = viewGroup.getContext();
        if (((ViewGroup) this.b) != viewGroup) {
            if (this.a) {
                s4 s4Var = (s4) this.d;
                int i10 = c5.F;
                s4Var.b(false);
            }
            this.b = viewGroup;
            this.c = (WindowManager) f0.e.f(context, WindowManager.class);
            s4 s4Var2 = new s4(this, context, f6Var, v4Var);
            this.d = s4Var2;
            a1 a1Var = new a1(this, 3);
            WeakHashMap weakHashMap = i0.a;
            r0.a0.j(s4Var2, a1Var);
        }
        ((s4) this.d).a(x4Var);
        if (this.a) {
            return;
        }
        if (((s4) this.d).getParent() != null) {
            ((WindowManager) this.c).removeView((s4) this.d);
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, MediaDataController.MAX_STYLE_RUNS_COUNT, 0, -3);
        layoutParams.softInputMode = 16;
        layoutParams.flags |= -1945959040;
        AndroidUtilities.applyEdgeToEdgeLayoutParams(layoutParams);
        AndroidUtilities.setPreferredMaxRefreshRate((WindowManager) this.c, (s4) this.d, layoutParams);
        ((WindowManager) this.c).addView((s4) this.d, layoutParams);
        viewGroup.requestDisallowInterceptTouchEvent(true);
        this.a = true;
    }

    public void w(Runnable runnable, Executor executor) {
        synchronized (this.b) {
            try {
                if (this.a) {
                    ((ArrayDeque) this.c).add(new qb.s(runnable, executor));
                } else {
                    this.a = true;
                    z(runnable, executor);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void x(SpannableString spannableString, int i10) {
        pu[] puVarArr = (pu[]) this.b;
        int i11 = i10 + 1;
        spannableString.setSpan(puVarArr[0], i10, i11, 0);
        int i12 = i10 + 2;
        spannableString.setSpan(puVarArr[1], i11, i12, 0);
        spannableString.setSpan(puVarArr[2], i12, i10 + 3, 0);
    }

    public void y() {
        synchronized (this.b) {
            try {
                if (((ArrayDeque) this.c).isEmpty()) {
                    this.a = false;
                    return;
                }
                qb.s sVar = (qb.s) ((ArrayDeque) this.c).remove();
                z(sVar.b, sVar.a);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void z(Runnable runnable, Executor executor) {
        try {
            executor.execute(new i9.s(27, this, runnable));
        } catch (RejectedExecutionException unused) {
            y();
        }
    }

    public m(c3.q qVar, z3.k kVar) {
        this.b = qVar;
        this.c = kVar;
        this.d = new SparseArray();
    }

    public m(r3 r3Var, boolean z10) {
        this.d = r3Var;
        this.c = new AtomicReference(null);
        this.a = z10;
        this.b = new AtomicMarkableReference(new x9.d(z10 ? 8192 : 1024), false);
    }
}
