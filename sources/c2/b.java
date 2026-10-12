package c2;

import ah.l0;
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
import bi.la;
import bi.m4;
import bi.w2;
import c3.b0;
import c3.i0;
import com.google.firebase.messaging.FirebaseMessaging;
import e9.c2;
import j$.util.Objects;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import m.q3;
import n2.w;
import n2.x;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.m21;
import org.telegram.ui.Components.xu;
import org.telegram.ui.Wallet.x0;
import org.telegram.ui.Wallet.y0;
import org.telegram.ui.b1;
import org.telegram.ui.b5;
import org.telegram.ui.g5;
import org.telegram.ui.w4;
import org.telegram.ui.z4;
import r0.j0;
import tc.v;
import v7.u6;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class b implements c3.q {
    public static b e;
    public boolean a;
    public Object b;
    public Object c;
    public Object d;

    public b(View view) {
        xu[] xuVarArr = {new xu(), new xu(), new xu()};
        this.b = xuVarArr;
        this.d = new ArrayList();
        AnimatorSet animatorSet = new AnimatorSet();
        this.c = animatorSet;
        animatorSet.playTogether(i(xuVarArr[0], 0, 255, 0, 300), i(xuVarArr[1], 0, 255, ImageReceiver.DEFAULT_CROSSFADE_DURATION, 300), i(xuVarArr[2], 0, 255, 300, 300), i(xuVarArr[0], 255, 0, MediaDataController.MAX_STYLE_RUNS_COUNT, 400), i(xuVarArr[1], 255, 0, MediaDataController.MAX_STYLE_RUNS_COUNT, 400), i(xuVarArr[2], 255, 0, MediaDataController.MAX_STYLE_RUNS_COUNT, 400));
        animatorSet.addListener(new m4(this, view));
    }

    public static void a(kc.e[][][] eVarArr, int i10, kc.e eVar) {
        kc.e[] eVarArr2 = eVarArr[i10 + eVar.d][eVar.c];
        ic.e eVar2 = eVar.a;
        int ordinal = eVar2.ordinal();
        char c10 = 2;
        if (ordinal != 1) {
            if (ordinal == 2) {
                c10 = 1;
            } else if (ordinal == 4) {
                c10 = 3;
            } else {
                if (ordinal != 6) {
                    throw new IllegalStateException("Illegal mode " + eVar2);
                }
                c10 = 0;
            }
        }
        kc.e eVar3 = eVarArr2[c10];
        if (eVar3 == null || eVar3.f > eVar.f) {
            eVarArr2[c10] = eVar;
        }
    }

    public static boolean f(ic.e eVar, char c10) {
        int ordinal = eVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                if ((c10 < '`' ? kc.c.a[c10] : -1) == -1) {
                    return false;
                }
            } else if (ordinal != 4) {
                if (ordinal != 6) {
                    return false;
                }
                return kc.c.b(String.valueOf(c10));
            }
        } else if (c10 < '0' || c10 > '9') {
            return false;
        }
        return true;
    }

    public static boolean g(b5 b5Var) {
        return (b5Var.a == null && b5Var.b == null) ? false : true;
    }

    public static b m() {
        if (e == null) {
            e = new b();
        }
        return e;
    }

    public static ic.f o(int i10) {
        int c10 = m1.j.c(i10);
        return c10 != 0 ? c10 != 1 ? ic.f.c(40) : ic.f.c(26) : ic.f.c(9);
    }

    public void A(SpannableString spannableString, int i10) {
        xu[] xuVarArr = (xu[]) this.b;
        int i11 = i10 + 1;
        spannableString.setSpan(xuVarArr[0], i10, i11, 0);
        int i12 = i10 + 2;
        spannableString.setSpan(xuVarArr[1], i11, i12, 0);
        spannableString.setSpan(xuVarArr[2], i12, i10 + 3, 0);
    }

    public void B() {
        synchronized (this.b) {
            try {
                if (((ArrayDeque) this.c).isEmpty()) {
                    this.a = false;
                    return;
                }
                rb.s sVar = (rb.s) ((ArrayDeque) this.c).remove();
                C(sVar.b, sVar.a);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void C(Runnable runnable, Executor executor) {
        try {
            executor.execute(new j9.u(28, this, runnable));
        } catch (RejectedExecutionException unused) {
            B();
        }
    }

    @Override // c3.q
    public void D() {
        SparseArray sparseArray = (SparseArray) this.d;
        ((c3.q) this.b).D();
        if (this.a) {
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                ((z3.o) sparseArray.valueAt(i10)).i = true;
            }
        }
    }

    @Override // c3.q
    public void K(b0 b0Var) {
        ((c3.q) this.b).K(b0Var);
    }

    @Override // c3.q
    public i0 a0(int i10, int i11) {
        SparseArray sparseArray = (SparseArray) this.d;
        c3.q qVar = (c3.q) this.b;
        if (i11 != 3 && i11 != 5) {
            this.a = true;
        }
        if (i11 != 3) {
            return qVar.a0(i10, i11);
        }
        z3.o oVar = (z3.o) sparseArray.get(i10);
        if (oVar != null) {
            return oVar;
        }
        z3.o oVar2 = new z3.o(qVar.a0(i10, i11), (z3.l) this.c);
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
    public void b(ic.f fVar, kc.e[][][] eVarArr, int i10, kc.e eVar) {
        int i11;
        int i12;
        char charAt;
        ic.e eVar2;
        char charAt2;
        ic.e eVar3;
        char charAt3;
        ic.e eVar4;
        int i13;
        String str = (String) this.b;
        ec.d dVar = (ec.d) this.c;
        CharsetEncoder[] charsetEncoderArr = dVar.a;
        CharsetEncoder[] charsetEncoderArr2 = dVar.a;
        int length = charsetEncoderArr.length;
        int i14 = dVar.b;
        if (i14 >= 0) {
            char charAt4 = str.charAt(i10);
            if (charsetEncoderArr2[i14].canEncode("" + charAt4)) {
                length = i14 + 1;
                i11 = length;
                for (i12 = i14; i12 < i11; i12++) {
                    char charAt5 = str.charAt(i10);
                    if (charsetEncoderArr2[i12].canEncode("" + charAt5)) {
                        a(eVarArr, i10, new kc.e(this, ic.e.h, i10, i12, 1, eVar, fVar));
                    }
                }
                charAt = str.charAt(i10);
                eVar2 = ic.e.r;
                if (f(eVar2, charAt)) {
                    a(eVarArr, i10, new kc.e(this, eVar2, i10, 0, 1, eVar, fVar));
                }
                int length2 = str.length();
                charAt2 = str.charAt(i10);
                eVar3 = ic.e.e;
                int i15 = 2;
                if (f(eVar3, charAt2)) {
                    int i16 = i10 + 1;
                    a(eVarArr, i10, new kc.e(this, eVar3, i10, 0, (i16 >= length2 || !f(eVar3, str.charAt(i16))) ? 1 : 2, eVar, fVar));
                }
                charAt3 = str.charAt(i10);
                eVar4 = ic.e.d;
                if (f(eVar4, charAt3)) {
                    return;
                }
                int i17 = i10 + 1;
                if (i17 >= length2 || !f(eVar4, str.charAt(i17))) {
                    i13 = 1;
                } else {
                    int i18 = i10 + 2;
                    if (i18 < length2 && f(eVar4, str.charAt(i18))) {
                        i15 = 3;
                    }
                    i13 = i15;
                }
                a(eVarArr, i10, new kc.e(this, eVar4, i10, 0, i13, eVar, fVar));
                return;
            }
        }
        i14 = 0;
        i11 = length;
        while (i12 < i11) {
        }
        charAt = str.charAt(i10);
        eVar2 = ic.e.r;
        if (f(eVar2, charAt)) {
        }
        int length22 = str.length();
        charAt2 = str.charAt(i10);
        eVar3 = ic.e.e;
        int i152 = 2;
        if (f(eVar3, charAt2)) {
        }
        charAt3 = str.charAt(i10);
        eVar4 = ic.e.d;
        if (f(eVar4, charAt3)) {
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

    public void d(v vVar) {
        ArrayList arrayList = (ArrayList) n();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            x0 x0Var = (x0) obj;
            try {
                try {
                    tc.u uVar = (tc.u) this.b;
                    AndroidUtilities.runOnUIThread(new m21(x0Var.c, uVar, x0Var.a, "websocket error: " + y0.a(vVar), 14));
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                x0Var.getClass();
            }
        }
    }

    public void e() {
        ArrayList arrayList = (ArrayList) n();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            x0 x0Var = (x0) obj;
            try {
                try {
                    x0Var.getClass();
                } catch (Throwable unused) {
                    x0Var.getClass();
                }
            } catch (Throwable unused2) {
            }
        }
    }

    public int h(int i10, int i11, int i12) {
        ec.b bVar = (ec.b) this.b;
        return this.a ? bVar.b(i11, i10) : bVar.b(i10, i11) ? (i12 << 1) | 1 : i12 << 1;
    }

    public ValueAnimator i(xu xuVar, int i10, int i11, int i12, int i13) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i10, i11);
        ofInt.addUpdateListener(new l0(16, this, xuVar));
        ofInt.setDuration(i13);
        ofInt.setStartDelay(i12);
        ofInt.setInterpolator(es.f);
        return ofInt;
    }

    public androidx.biometric.e j(ic.f fVar) {
        int i10;
        String str = (String) this.b;
        int length = str.length();
        ec.d dVar = (ec.d) this.c;
        CharsetEncoder[] charsetEncoderArr = dVar.a;
        CharsetEncoder[] charsetEncoderArr2 = dVar.a;
        kc.e[][][] eVarArr = (kc.e[][][]) Array.newInstance((Class<?>) kc.e.class, length + 1, charsetEncoderArr.length, 4);
        b(fVar, eVarArr, 0, null);
        for (int i11 = 1; i11 <= length; i11++) {
            for (int i12 = 0; i12 < charsetEncoderArr2.length; i12++) {
                for (int i13 = 0; i13 < 4; i13++) {
                    kc.e eVar = eVarArr[i11][i12][i13];
                    if (eVar != null && i11 < length) {
                        b(fVar, eVarArr, i11, eVar);
                    }
                }
            }
        }
        int i14 = -1;
        int i15 = Integer.MAX_VALUE;
        int i16 = -1;
        for (int i17 = 0; i17 < charsetEncoderArr2.length; i17++) {
            for (int i18 = 0; i18 < 4; i18++) {
                kc.e eVar2 = eVarArr[length][i17][i18];
                if (eVar2 != null && (i10 = eVar2.f) < i15) {
                    i14 = i17;
                    i16 = i18;
                    i15 = i10;
                }
            }
        }
        if (i14 >= 0) {
            return new androidx.biometric.e(this, fVar, eVarArr[length][i14][i16]);
        }
        throw new com.google.firebase.messaging.r(a1.g.p("Internal error: failed to encode \"", str, "\""));
    }

    public w k(UUID uuid, n2.p pVar) {
        String str = pVar.b;
        if (this.a || TextUtils.isEmpty(str)) {
            str = (String) this.c;
        }
        if (TextUtils.isEmpty(str)) {
            Map map = Collections.EMPTY_MAP;
            Uri uri = Uri.EMPTY;
            u6.l(uri, "The uri must be set.");
            throw new x(new g2.m(uri, 1, null, map, 0L, -1L, null, 0), uri, c2.h, 0L, new IllegalStateException("No license URL"));
        }
        HashMap hashMap = new HashMap();
        UUID uuid2 = b2.n.f;
        hashMap.put("Content-Type", uuid2.equals(uuid) ? "text/xml" : b2.n.d.equals(uuid) ? "application/json" : "application/octet-stream");
        if (uuid2.equals(uuid)) {
            hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (((HashMap) this.d)) {
            hashMap.putAll((HashMap) this.d);
        }
        return w7.b0.a(((g2.o) this.b).createDataSource(), str, pVar.a, hashMap);
    }

    public w l(n2.q qVar) {
        Charset charset = StandardCharsets.UTF_8;
        byte[][] bArr = {"{\"signedRequest\":\"".getBytes(charset), qVar.a, "\"}".getBytes(charset)};
        long j10 = 0;
        for (int i10 = 0; i10 < 3; i10++) {
            j10 += bArr[i10].length;
        }
        int i11 = (int) j10;
        u6.c(j10, "the total number of elements (%s) in the arrays must fit in an int", j10 == ((long) i11));
        byte[] bArr2 = new byte[i11];
        int i12 = 0;
        for (int i13 = 0; i13 < 3; i13++) {
            byte[] bArr3 = bArr[i13];
            System.arraycopy(bArr3, 0, bArr2, i12, bArr3.length);
            i12 += bArr3.length;
        }
        g2.h createDataSource = ((g2.o) this.b).createDataSource();
        String str = qVar.b;
        String aVar = h9.a.i.toString();
        String valueOf = String.valueOf(i11);
        e9.s.e("Content-Type", aVar);
        e9.s.e("Content-Length", valueOf);
        return w7.b0.a(createDataSource, str, bArr2, c2.f(2, new Object[]{"Content-Type", aVar, "Content-Length", valueOf}, null));
    }

    public List n() {
        synchronized (((ArrayList) this.c)) {
            try {
                if (!this.a) {
                    return (ArrayList) this.d;
                }
                ArrayList arrayList = new ArrayList(((ArrayList) this.c).size());
                ArrayList arrayList2 = (ArrayList) this.c;
                int size = arrayList2.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    arrayList.add((x0) obj);
                }
                this.d = arrayList;
                this.a = false;
                return arrayList;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public synchronized void p() {
        try {
            if (this.a) {
                return;
            }
            Boolean r10 = r();
            this.c = r10;
            if (r10 == null) {
                ((r9.l) ((na.b) this.b)).a(new w2(7));
            }
            this.a = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized boolean q() {
        Boolean bool;
        try {
            p();
            bool = (Boolean) this.c;
        } catch (Throwable th2) {
            throw th2;
        }
        return bool != null ? bool.booleanValue() : ((FirebaseMessaging) this.d).a.h();
    }

    public Boolean r() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        l9.h hVar = ((FirebaseMessaging) this.d).a;
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

    public ic.d s() {
        ic.d dVar = (ic.d) this.d;
        if (dVar != null) {
            return dVar;
        }
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < 6; i12++) {
            i11 = h(i12, 8, i11);
        }
        int h = h(8, 7, h(8, 8, h(7, 8, i11)));
        for (int i13 = 5; i13 >= 0; i13--) {
            h = h(8, i13, h);
        }
        int i14 = ((ec.b) this.b).b;
        int i15 = i14 - 7;
        for (int i16 = i14 - 1; i16 >= i15; i16--) {
            i10 = h(8, i16, i10);
        }
        for (int i17 = i14 - 8; i17 < i14; i17++) {
            i10 = h(i17, 8, i10);
        }
        ic.d a2 = ic.d.a(h, i10);
        if (a2 == null) {
            a2 = ic.d.a(h ^ 21522, i10 ^ 21522);
        }
        this.d = a2;
        if (a2 != null) {
            return a2;
        }
        throw dc.c.a();
    }

    public ic.f t() {
        ic.f fVar = (ic.f) this.c;
        if (fVar != null) {
            return fVar;
        }
        int i10 = ((ec.b) this.b).b;
        int i11 = (i10 - 17) / 4;
        if (i11 <= 6) {
            return ic.f.c(i11);
        }
        int i12 = i10 - 11;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 5; i15 >= 0; i15--) {
            for (int i16 = i10 - 9; i16 >= i12; i16--) {
                i14 = h(i16, i15, i14);
            }
        }
        ic.f b10 = ic.f.b(i14);
        if (b10 != null && (b10.a * 4) + 17 == i10) {
            this.c = b10;
            return b10;
        }
        for (int i17 = 5; i17 >= 0; i17--) {
            for (int i18 = i10 - 9; i18 >= i12; i18--) {
                i13 = h(i17, i18, i13);
            }
        }
        ic.f b11 = ic.f.b(i13);
        if (b11 == null || (b11.a * 4) + 17 != i10) {
            throw dc.c.a();
        }
        this.c = b11;
        return b11;
    }

    public void u() {
        if (((ic.d) this.d) == null) {
            return;
        }
        int i10 = m1.j.d(8)[((ic.d) this.d).b];
        ec.b bVar = (ec.b) this.b;
        int i11 = bVar.b;
        for (int i12 = 0; i12 < i11; i12++) {
            for (int i13 = 0; i13 < i11; i13++) {
                if (i2.d.a(i10, i12, i13)) {
                    bVar.a(i13, i12);
                }
            }
        }
    }

    public void v(View view) {
        ArrayList arrayList = (ArrayList) this.d;
        arrayList.remove(view);
        if (arrayList.isEmpty()) {
            ((AnimatorSet) this.c).cancel();
        }
    }

    public void w() {
        e2.i0 i0Var = (e2.i0) this.d;
        if (this.a) {
            i0Var.d(new la(this, 7));
            this.a = false;
        }
    }

    public boolean x(String str, String str2) {
        synchronized (this) {
            try {
                if (!((y9.d) ((AtomicMarkableReference) this.b).getReference()).c(str, str2)) {
                    return false;
                }
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) this.b;
                atomicMarkableReference.set((y9.d) atomicMarkableReference.getReference(), true);
                b5.g gVar = new b5.g(this, 2);
                AtomicReference atomicReference = (AtomicReference) this.c;
                while (!atomicReference.compareAndSet(null, gVar)) {
                    if (atomicReference.get() != null) {
                        return true;
                    }
                }
                ((com.google.firebase.messaging.s) ((q3) this.d).b).v(gVar);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void y(ViewGroup viewGroup, c6 c6Var, b5 b5Var, z4 z4Var) {
        Objects.requireNonNull(viewGroup);
        Context context = viewGroup.getContext();
        if (((ViewGroup) this.b) != viewGroup) {
            if (this.a) {
                w4 w4Var = (w4) this.d;
                int i10 = g5.F;
                w4Var.b(false);
            }
            this.b = viewGroup;
            this.c = (WindowManager) context.getSystemService(WindowManager.class);
            w4 w4Var2 = new w4(this, context, c6Var, z4Var);
            this.d = w4Var2;
            b1 b1Var = new b1(this, 3);
            WeakHashMap weakHashMap = j0.a;
            r0.b0.i(w4Var2, b1Var);
        }
        ((w4) this.d).a(b5Var);
        if (this.a) {
            return;
        }
        if (((w4) this.d).getParent() != null) {
            ((WindowManager) this.c).removeView((w4) this.d);
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, MediaDataController.MAX_STYLE_RUNS_COUNT, 0, -3);
        layoutParams.softInputMode = 16;
        layoutParams.flags |= -1945959040;
        AndroidUtilities.applyEdgeToEdgeLayoutParams(layoutParams);
        AndroidUtilities.setPreferredMaxRefreshRate((WindowManager) this.c, (w4) this.d, layoutParams);
        ((WindowManager) this.c).addView((w4) this.d, layoutParams);
        viewGroup.requestDisallowInterceptTouchEvent(true);
        this.a = true;
    }

    public void z(Runnable runnable, Executor executor) {
        synchronized (this.b) {
            try {
                if (this.a) {
                    ((ArrayDeque) this.c).add(new rb.s(runnable, executor));
                } else {
                    this.a = true;
                    C(runnable, executor);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public b(c3.q qVar, z3.l lVar) {
        this.b = qVar;
        this.c = lVar;
        this.d = new SparseArray();
    }

    public b(q3 q3Var, boolean z10) {
        this.d = q3Var;
        this.c = new AtomicReference(null);
        this.a = z10;
        this.b = new AtomicMarkableReference(new y9.d(z10 ? 8192 : 1024), false);
    }
}
