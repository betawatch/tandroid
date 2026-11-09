package ab;

import a8.ia;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import bi.ab;
import bi.de;
import c8.rb;
import com.google.firebase.messaging.FirebaseMessaging;
import di.f8;
import di.h3;
import h9.y1;
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
import org.telegram.messenger.fz;
import org.telegram.messenger.kf;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.k30;
import org.telegram.ui.Components.qp0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Wallet.x0;
import org.telegram.ui.Wallet.y0;
import org.telegram.ui.b5;
import org.telegram.ui.hx;
import org.telegram.ui.r4;
import org.telegram.ui.u4;
import org.telegram.ui.w0;
import org.telegram.ui.w4;
import org.telegram.ui.ym0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class q implements f3.q, ym0 {
    public static q e;
    public boolean a;
    public Object b;
    public Object c;
    public Object d;

    public q(View view) {
        org.telegram.messenger.t[] tVarArr = {new org.telegram.messenger.t(), new org.telegram.messenger.t(), new org.telegram.messenger.t()};
        this.b = tVarArr;
        this.d = new ArrayList();
        AnimatorSet animatorSet = new AnimatorSet();
        this.c = animatorSet;
        animatorSet.playTogether(k(tVarArr[0], 0, qs.e4, 0, qs.X4), k(tVarArr[1], 0, qs.e4, qs.g2, qs.X4), k(tVarArr[2], 0, qs.e4, qs.X4, qs.X4), k(tVarArr[0], qs.e4, 0, 1000, 400), k(tVarArr[1], qs.e4, 0, 1000, 400), k(tVarArr[2], qs.e4, 0, 1000, 400));
        animatorSet.addListener(new h3(this, view));
    }

    public static void a(ic.d[][][] dVarArr, int i7, ic.d dVar) {
        ic.d[] dVarArr2 = dVarArr[i7 + dVar.d][dVar.c];
        gc.d dVar2 = dVar.a;
        int ordinal = dVar2.ordinal();
        char c10 = 2;
        if (ordinal != 1) {
            if (ordinal == 2) {
                c10 = 1;
            } else if (ordinal == 4) {
                c10 = 3;
            } else {
                if (ordinal != 6) {
                    throw new IllegalStateException("Illegal mode " + dVar2);
                }
                c10 = 0;
            }
        }
        ic.d dVar3 = dVarArr2[c10];
        if (dVar3 == null || dVar3.f > dVar.f) {
            dVarArr2[c10] = dVar;
        }
    }

    public static boolean h(gc.d dVar, char c10) {
        int ordinal = dVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                if ((c10 < '`' ? ic.b.a[c10] : -1) == -1) {
                    return false;
                }
            } else if (ordinal != 4) {
                if (ordinal != 6) {
                    return false;
                }
                return ic.b.c(String.valueOf(c10));
            }
        } else if (c10 < '0' || c10 > '9') {
            return false;
        }
        return true;
    }

    public static boolean i(w4 w4Var) {
        return (w4Var.a == null && w4Var.b == null) ? false : true;
    }

    public static q o() {
        if (e == null) {
            e = new q();
        }
        return e;
    }

    public static gc.e q(int i7) {
        int c10 = p1.g.c(i7);
        return c10 != 0 ? c10 != 1 ? gc.e.c(40) : gc.e.c(26) : gc.e.c(9);
    }

    public void C(ViewGroup viewGroup, g6 g6Var, w4 w4Var, u4 u4Var) {
        Objects.requireNonNull(viewGroup);
        Context context = viewGroup.getContext();
        if (((ViewGroup) this.b) != viewGroup) {
            if (this.a) {
                r4 r4Var = (r4) this.d;
                int i7 = b5.F;
                r4Var.b(false);
            }
            this.b = viewGroup;
            this.c = (WindowManager) context.getSystemService(WindowManager.class);
            r4 r4Var2 = new r4(this, context, g6Var, u4Var);
            this.d = r4Var2;
            w0 w0Var = new w0(this, 3);
            WeakHashMap weakHashMap = r0.i0.a;
            r0.a0.i(r4Var2, w0Var);
        }
        ((r4) this.d).a(w4Var);
        if (this.a) {
            return;
        }
        if (((r4) this.d).getParent() != null) {
            ((WindowManager) this.c).removeView((r4) this.d);
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, 1000, 0, -3);
        layoutParams.softInputMode = 16;
        layoutParams.flags |= -1945959040;
        org.telegram.messenger.g0.m(layoutParams);
        org.telegram.messenger.g0.y3((WindowManager) this.c, (r4) this.d, layoutParams);
        ((WindowManager) this.c).addView((r4) this.d, layoutParams);
        viewGroup.requestDisallowInterceptTouchEvent(true);
        this.a = true;
    }

    public void D(Runnable runnable, Executor executor) {
        synchronized (this.b) {
            try {
                if (this.a) {
                    ((ArrayDeque) this.c).add(new pb.s(runnable, executor));
                } else {
                    this.a = true;
                    G(runnable, executor);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void E(SpannableString spannableString, int i7) {
        org.telegram.messenger.t[] tVarArr = (org.telegram.messenger.t[]) this.b;
        int i10 = i7 + 1;
        spannableString.setSpan(tVarArr[0], i7, i10, 0);
        int i11 = i7 + 2;
        spannableString.setSpan(tVarArr[1], i10, i11, 0);
        spannableString.setSpan(tVarArr[2], i11, i7 + 3, 0);
    }

    public void F() {
        synchronized (this.b) {
            try {
                if (((ArrayDeque) this.c).isEmpty()) {
                    this.a = false;
                    return;
                }
                pb.s sVar = (pb.s) ((ArrayDeque) this.c).remove();
                G(sVar.b, sVar.a);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void G(Runnable runnable, Executor executor) {
        try {
            executor.execute(new hx(this, runnable, false, 4));
        } catch (RejectedExecutionException unused) {
            F();
        }
    }

    @Override // f3.q
    public f3.j0 O1(int i7, int i10) {
        SparseArray sparseArray = (SparseArray) this.d;
        f3.q qVar = (f3.q) this.b;
        if (i10 != 3 && i10 != 5) {
            this.a = true;
        }
        if (i10 != 3) {
            return qVar.O1(i7, i10);
        }
        c4.o oVar = (c4.o) sparseArray.get(i7);
        if (oVar != null) {
            return oVar;
        }
        c4.o oVar2 = new c4.o(qVar.O1(i7, i10), (c4.k) this.c);
        sparseArray.put(i7, oVar2);
        return oVar2;
    }

    @Override // f3.q
    public void U0() {
        SparseArray sparseArray = (SparseArray) this.d;
        ((f3.q) this.b).U0();
        if (this.a) {
            for (int i7 = 0; i7 < sparseArray.size(); i7++) {
                ((c4.o) sparseArray.valueAt(i7)).i = true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(gc.e eVar, ic.d[][][] dVarArr, int i7, ic.d dVar) {
        int i10;
        int i11;
        char charAt;
        gc.d dVar2;
        char charAt2;
        gc.d dVar3;
        char charAt3;
        gc.d dVar4;
        int i12;
        String str = (String) this.b;
        cc.f fVar = (cc.f) this.c;
        CharsetEncoder[] charsetEncoderArr = fVar.a;
        CharsetEncoder[] charsetEncoderArr2 = fVar.a;
        int length = charsetEncoderArr.length;
        int i13 = fVar.b;
        if (i13 >= 0) {
            char charAt4 = str.charAt(i7);
            if (charsetEncoderArr2[i13].canEncode("" + charAt4)) {
                length = i13 + 1;
                i10 = length;
                for (i11 = i13; i11 < i10; i11++) {
                    char charAt5 = str.charAt(i7);
                    if (charsetEncoderArr2[i11].canEncode("" + charAt5)) {
                        a(dVarArr, i7, new ic.d(this, gc.d.h, i7, i11, 1, dVar, eVar));
                    }
                }
                charAt = str.charAt(i7);
                dVar2 = gc.d.r;
                if (h(dVar2, charAt)) {
                    a(dVarArr, i7, new ic.d(this, dVar2, i7, 0, 1, dVar, eVar));
                }
                int length2 = str.length();
                charAt2 = str.charAt(i7);
                dVar3 = gc.d.e;
                int i14 = 2;
                if (h(dVar3, charAt2)) {
                    int i15 = i7 + 1;
                    a(dVarArr, i7, new ic.d(this, dVar3, i7, 0, (i15 >= length2 || !h(dVar3, str.charAt(i15))) ? 1 : 2, dVar, eVar));
                }
                charAt3 = str.charAt(i7);
                dVar4 = gc.d.d;
                if (h(dVar4, charAt3)) {
                    return;
                }
                int i16 = i7 + 1;
                if (i16 >= length2 || !h(dVar4, str.charAt(i16))) {
                    i12 = 1;
                } else {
                    int i17 = i7 + 2;
                    if (i17 < length2 && h(dVar4, str.charAt(i17))) {
                        i14 = 3;
                    }
                    i12 = i14;
                }
                a(dVarArr, i7, new ic.d(this, dVar4, i7, 0, i12, dVar, eVar));
                return;
            }
        }
        i13 = 0;
        i10 = length;
        while (i11 < i10) {
        }
        charAt = str.charAt(i7);
        dVar2 = gc.d.r;
        if (h(dVar2, charAt)) {
        }
        int length22 = str.length();
        charAt2 = str.charAt(i7);
        dVar3 = gc.d.e;
        int i142 = 2;
        if (h(dVar3, charAt2)) {
        }
        charAt3 = str.charAt(i7);
        dVar4 = gc.d.d;
        if (h(dVar4, charAt3)) {
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

    public void d(rc.v vVar) {
        ArrayList arrayList = (ArrayList) p();
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            x0 x0Var = (x0) obj;
            try {
                try {
                    rc.u uVar = (rc.u) this.b;
                    org.telegram.messenger.g0.h3(new qp0(x0Var.c, uVar, x0Var.a, "websocket error: " + y0.a(vVar), 18));
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                x0Var.getClass();
            }
        }
    }

    @Override // org.telegram.ui.ym0
    public boolean e() {
        return ((k30) this.d).b.e();
    }

    @Override // f3.q
    public void f(f3.c0 c0Var) {
        ((f3.q) this.b).f(c0Var);
    }

    public void g() {
        ArrayList arrayList = (ArrayList) p();
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
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

    public int j(int i7, int i10, int i11) {
        cc.b bVar = (cc.b) this.b;
        return this.a ? bVar.b(i10, i7) : bVar.b(i7, i10) ? (i11 << 1) | 1 : i11 << 1;
    }

    public ValueAnimator k(org.telegram.messenger.t tVar, int i7, int i10, int i11, int i12) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i7, i10);
        ofInt.addUpdateListener(new de(16, this, tVar));
        ofInt.setDuration(i12);
        ofInt.setStartDelay(i11);
        ofInt.setInterpolator(xq.f);
        return ofInt;
    }

    public h6.m l(gc.e eVar) {
        int i7;
        String str = (String) this.b;
        int length = str.length();
        cc.f fVar = (cc.f) this.c;
        CharsetEncoder[] charsetEncoderArr = fVar.a;
        CharsetEncoder[] charsetEncoderArr2 = fVar.a;
        ic.d[][][] dVarArr = (ic.d[][][]) Array.newInstance((Class<?>) ic.d.class, length + 1, charsetEncoderArr.length, 4);
        b(eVar, dVarArr, 0, null);
        for (int i10 = 1; i10 <= length; i10++) {
            for (int i11 = 0; i11 < charsetEncoderArr2.length; i11++) {
                for (int i12 = 0; i12 < 4; i12++) {
                    ic.d dVar = dVarArr[i10][i11][i12];
                    if (dVar != null && i10 < length) {
                        b(eVar, dVarArr, i10, dVar);
                    }
                }
            }
        }
        int i13 = -1;
        int i14 = Integer.MAX_VALUE;
        int i15 = -1;
        for (int i16 = 0; i16 < charsetEncoderArr2.length; i16++) {
            for (int i17 = 0; i17 < 4; i17++) {
                ic.d dVar2 = dVarArr[length][i16][i17];
                if (dVar2 != null && (i7 = dVar2.f) < i14) {
                    i13 = i16;
                    i15 = i17;
                    i14 = i7;
                }
            }
        }
        if (i13 >= 0) {
            return new h6.m(this, eVar, dVarArr[length][i13][i15]);
        }
        throw new a0(a8.p0.p("Internal error: failed to encode \"", str, "\""));
    }

    public q2.v m(UUID uuid, q2.o oVar) {
        String str = oVar.b;
        if (this.a || TextUtils.isEmpty(str)) {
            str = (String) this.c;
        }
        if (TextUtils.isEmpty(str)) {
            Map map = Collections.EMPTY_MAP;
            Uri uri = Uri.EMPTY;
            ia.k(uri, "The uri must be set.");
            throw new q2.w(new j2.m(uri, 1, null, map, 0L, -1L, null, 0), uri, y1.h, 0L, new IllegalStateException("No license URL"));
        }
        HashMap hashMap = new HashMap();
        UUID uuid2 = e2.l.f;
        hashMap.put("Content-Type", uuid2.equals(uuid) ? "text/xml" : e2.l.d.equals(uuid) ? "application/json" : "application/octet-stream");
        if (uuid2.equals(uuid)) {
            hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (((HashMap) this.d)) {
            hashMap.putAll((HashMap) this.d);
        }
        return rb.a(((j2.p) this.b).createDataSource(), str, oVar.a, hashMap);
    }

    public q2.v n(q2.p pVar) {
        Charset charset = StandardCharsets.UTF_8;
        byte[][] bArr = {"{\"signedRequest\":\"".getBytes(charset), pVar.a, "\"}".getBytes(charset)};
        long j3 = 0;
        for (int i7 = 0; i7 < 3; i7++) {
            j3 += bArr[i7].length;
        }
        int i10 = (int) j3;
        ia.d(j3, "the total number of elements (%s) in the arrays must fit in an int", j3 == ((long) i10));
        byte[] bArr2 = new byte[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < 3; i12++) {
            byte[] bArr3 = bArr[i12];
            System.arraycopy(bArr3, 0, bArr2, i11, bArr3.length);
            i11 += bArr3.length;
        }
        j2.h createDataSource = ((j2.p) this.b).createDataSource();
        String str = pVar.b;
        String aVar = k9.a.i.toString();
        String valueOf = String.valueOf(i10);
        h9.o.f("Content-Type", aVar);
        h9.o.f("Content-Length", valueOf);
        return rb.a(createDataSource, str, bArr2, y1.g(2, new Object[]{"Content-Type", aVar, "Content-Length", valueOf}, null));
    }

    public List p() {
        synchronized (((ArrayList) this.c)) {
            try {
                if (!this.a) {
                    return (ArrayList) this.d;
                }
                ArrayList arrayList = new ArrayList(((ArrayList) this.c).size());
                ArrayList arrayList2 = (ArrayList) this.c;
                int size = arrayList2.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList2.get(i7);
                    i7++;
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

    public synchronized void r() {
        try {
            if (this.a) {
                return;
            }
            Boolean t6 = t();
            this.c = t6;
            if (t6 == null) {
                ((u9.l) ((ra.b) this.b)).a(new a3.l(9));
            }
            this.a = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized boolean s() {
        Boolean bool;
        try {
            r();
            bool = (Boolean) this.c;
        } catch (Throwable th2) {
            throw th2;
        }
        return bool != null ? bool.booleanValue() : ((FirebaseMessaging) this.d).a.h();
    }

    public Boolean t() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        o9.g gVar = ((FirebaseMessaging) this.d).a;
        gVar.a();
        Context context = gVar.a;
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

    public gc.c u() {
        gc.c cVar = (gc.c) this.d;
        if (cVar != null) {
            return cVar;
        }
        int i7 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < 6; i11++) {
            i10 = j(i11, 8, i10);
        }
        int j3 = j(8, 7, j(8, 8, j(7, 8, i10)));
        for (int i12 = 5; i12 >= 0; i12--) {
            j3 = j(8, i12, j3);
        }
        int i13 = ((cc.b) this.b).b;
        int i14 = i13 - 7;
        for (int i15 = i13 - 1; i15 >= i14; i15--) {
            i7 = j(8, i15, i7);
        }
        for (int i16 = i13 - 8; i16 < i13; i16++) {
            i7 = j(i16, 8, i7);
        }
        gc.c a10 = gc.c.a(j3, i7);
        if (a10 == null) {
            a10 = gc.c.a(j3 ^ 21522, i7 ^ 21522);
        }
        this.d = a10;
        if (a10 != null) {
            return a10;
        }
        throw bc.c.a();
    }

    public gc.e v() {
        gc.e eVar = (gc.e) this.c;
        if (eVar != null) {
            return eVar;
        }
        int i7 = ((cc.b) this.b).b;
        int i10 = (i7 - 17) / 4;
        if (i10 <= 6) {
            return gc.e.c(i10);
        }
        int i11 = i7 - 11;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 5; i14 >= 0; i14--) {
            for (int i15 = i7 - 9; i15 >= i11; i15--) {
                i13 = j(i15, i14, i13);
            }
        }
        gc.e b10 = gc.e.b(i13);
        if (b10 != null && (b10.a * 4) + 17 == i7) {
            this.c = b10;
            return b10;
        }
        for (int i16 = 5; i16 >= 0; i16--) {
            for (int i17 = i7 - 9; i17 >= i11; i17--) {
                i12 = j(i16, i17, i12);
            }
        }
        gc.e b11 = gc.e.b(i12);
        if (b11 == null || (b11.a * 4) + 17 != i7) {
            throw bc.c.a();
        }
        this.c = b11;
        return b11;
    }

    @Override // org.telegram.ui.ym0
    public void v0(int i7, boolean z9, boolean z10) {
        ArrayList arrayList = (ArrayList) this.c;
        k30 k30Var = (k30) this.d;
        HashMap hashMap = (HashMap) this.b;
        if (hashMap.isEmpty() || k30Var.b == null || this.a || z9) {
            return;
        }
        this.a = true;
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = hashMap.get(arrayList.get(i10));
            fz fzVar = new fz();
            arrayList2.add(fzVar);
            if (obj instanceof kf) {
                kf kfVar = (kf) obj;
                String str = kfVar.h;
                if (str != null) {
                    fzVar.c = str;
                } else {
                    fzVar.l = kfVar;
                }
                fzVar.k = kfVar.s;
                fzVar.e = kfVar.c;
                CharSequence charSequence = kfVar.I;
                fzVar.d = charSequence != null ? charSequence.toString() : null;
                fzVar.i = kfVar.n;
                fzVar.j = kfVar.r;
                fzVar.h = kfVar.x;
            }
        }
        k30.a(k30Var, false, arrayList2);
    }

    public void w() {
        if (((gc.c) this.d) == null) {
            return;
        }
        int i7 = p1.g.d(8)[((gc.c) this.d).b];
        cc.b bVar = (cc.b) this.b;
        int i10 = bVar.b;
        for (int i11 = 0; i11 < i10; i11++) {
            for (int i12 = 0; i12 < i10; i12++) {
                if (com.google.android.recaptcha.internal.a.b(i7, i11, i12)) {
                    bVar.a(i12, i11);
                }
            }
        }
    }

    public void x(View view) {
        ArrayList arrayList = (ArrayList) this.d;
        arrayList.remove(view);
        if (arrayList.isEmpty()) {
            ((AnimatorSet) this.c).cancel();
        }
    }

    public void y() {
        h2.i0 i0Var = (h2.i0) this.d;
        if (this.a) {
            i0Var.d(new f8(this, 9));
            this.a = false;
        }
    }

    public boolean z(String str, String str2) {
        synchronized (this) {
            try {
                if (!((ca.e) ((AtomicMarkableReference) this.b).getReference()).c(str, str2)) {
                    return false;
                }
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) this.b;
                atomicMarkableReference.set((ca.e) atomicMarkableReference.getReference(), true);
                ab abVar = new ab(this, 7);
                AtomicReference atomicReference = (AtomicReference) this.c;
                while (!atomicReference.compareAndSet(null, abVar)) {
                    if (atomicReference.get() != null) {
                        return true;
                    }
                }
                ((ba.e) ((q3) this.d).b).b.a(abVar);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public q(f3.q qVar, c4.k kVar) {
        this.b = qVar;
        this.c = kVar;
        this.d = new SparseArray();
    }

    public q(q3 q3Var, boolean z9) {
        this.d = q3Var;
        this.c = new AtomicReference(null);
        this.a = z9;
        this.b = new AtomicMarkableReference(new ca.e(z9 ? TLObject.FLAG_13 : 1024), false);
    }

    @Override // org.telegram.ui.ym0
    public void A() {
    }

    @Override // org.telegram.ui.ym0
    public /* synthetic */ void f0() {
    }

    @Override // org.telegram.ui.ym0
    public void B(Editable editable) {
    }
}
