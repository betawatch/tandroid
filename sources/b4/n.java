package b4;

import ai.s;
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
import b8.og;
import b8.zb;
import ci.d1;
import ci.uc;
import com.google.firebase.messaging.FirebaseMessaging;
import e3.b0;
import e3.q;
import ei.k3;
import g2.j0;
import g9.x1;
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
import l9.u;
import m.o3;
import oc.v;
import org.telegram.messenger.bf;
import org.telegram.messenger.g0;
import org.telegram.messenger.hs;
import org.telegram.messenger.t;
import org.telegram.messenger.xy;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.f30;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zo0;
import org.telegram.ui.Wallet.w0;
import org.telegram.ui.d5;
import org.telegram.ui.rm0;
import org.telegram.ui.t4;
import org.telegram.ui.w4;
import org.telegram.ui.x0;
import org.telegram.ui.y4;
import p2.w;
import r0.a0;
import r0.i0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class n implements q, rm0 {
    public static n e;
    public boolean a;
    public Object b;
    public Object c;
    public Object d;

    public n(View view) {
        t[] tVarArr = {new t(), new t(), new t()};
        this.b = tVarArr;
        this.d = new ArrayList();
        AnimatorSet animatorSet = new AnimatorSet();
        this.c = animatorSet;
        animatorSet.playTogether(k(tVarArr[0], 0, hs.e4, 0, hs.X4), k(tVarArr[1], 0, hs.e4, hs.g2, hs.X4), k(tVarArr[2], 0, hs.e4, hs.X4, hs.X4), k(tVarArr[0], hs.e4, 0, 1000, 400), k(tVarArr[1], hs.e4, 0, 1000, 400), k(tVarArr[2], hs.e4, 0, 1000, 400));
        animatorSet.addListener(new k3(this, view));
    }

    public static void a(fc.d[][][] dVarArr, int i3, fc.d dVar) {
        fc.d[] dVarArr2 = dVarArr[i3 + dVar.d][dVar.c];
        dc.d dVar2 = dVar.a;
        int ordinal = dVar2.ordinal();
        char c2 = 2;
        if (ordinal != 1) {
            if (ordinal == 2) {
                c2 = 1;
            } else if (ordinal == 4) {
                c2 = 3;
            } else {
                if (ordinal != 6) {
                    throw new IllegalStateException("Illegal mode " + dVar2);
                }
                c2 = 0;
            }
        }
        fc.d dVar3 = dVarArr2[c2];
        if (dVar3 == null || dVar3.f > dVar.f) {
            dVarArr2[c2] = dVar;
        }
    }

    public static boolean h(dc.d dVar, char c2) {
        int ordinal = dVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                if ((c2 < '`' ? fc.b.a[c2] : -1) == -1) {
                    return false;
                }
            } else if (ordinal != 4) {
                if (ordinal != 6) {
                    return false;
                }
                return fc.b.c(String.valueOf(c2));
            }
        } else if (c2 < '0' || c2 > '9') {
            return false;
        }
        return true;
    }

    public static boolean i(y4 y4Var) {
        return (y4Var.a == null && y4Var.b == null) ? false : true;
    }

    public static n p() {
        if (e == null) {
            e = new n();
        }
        return e;
    }

    public static dc.e r(int i3) {
        int c2 = o1.g.c(i3);
        return c2 != 0 ? c2 != 1 ? dc.e.c(40) : dc.e.c(26) : dc.e.c(9);
    }

    public void A() {
        j0 j0Var = (j0) this.d;
        if (this.a) {
            j0Var.d(new d1(this, 18));
            this.a = false;
        }
    }

    public boolean B(String str, String str2) {
        synchronized (this) {
            try {
                if (!((ba.e) ((AtomicMarkableReference) this.b).getReference()).c(str, str2)) {
                    return false;
                }
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) this.b;
                atomicMarkableReference.set((ba.e) atomicMarkableReference.getReference(), true);
                s sVar = new s(this, 15);
                AtomicReference atomicReference = (AtomicReference) this.c;
                while (!atomicReference.compareAndSet(null, sVar)) {
                    if (atomicReference.get() != null) {
                        return true;
                    }
                }
                ((aa.g) ((o3) this.d).b).b.a(sVar);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void C(ViewGroup viewGroup, e6 e6Var, y4 y4Var, w4 w4Var) {
        Objects.requireNonNull(viewGroup);
        Context context = viewGroup.getContext();
        if (((ViewGroup) this.b) != viewGroup) {
            if (this.a) {
                t4 t4Var = (t4) this.d;
                int i3 = d5.G;
                t4Var.b(false);
            }
            this.b = viewGroup;
            this.c = (WindowManager) context.getSystemService(WindowManager.class);
            t4 t4Var2 = new t4(this, context, e6Var, w4Var);
            this.d = t4Var2;
            x0 x0Var = new x0(this, 3);
            WeakHashMap weakHashMap = i0.a;
            a0.i(t4Var2, x0Var);
        }
        ((t4) this.d).a(y4Var);
        if (this.a) {
            return;
        }
        if (((t4) this.d).getParent() != null) {
            ((WindowManager) this.c).removeView((t4) this.d);
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, 1000, 0, -3);
        layoutParams.softInputMode = 16;
        layoutParams.flags |= -1945959040;
        g0.m(layoutParams);
        g0.y3((WindowManager) this.c, (t4) this.d, layoutParams);
        ((WindowManager) this.c).addView((t4) this.d, layoutParams);
        viewGroup.requestDisallowInterceptTouchEvent(true);
        this.a = true;
    }

    public void D(Runnable runnable, Executor executor) {
        synchronized (this.b) {
            try {
                if (this.a) {
                    ((ArrayDeque) this.c).add(new mb.s(runnable, executor));
                } else {
                    this.a = true;
                    G(runnable, executor);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void E(SpannableString spannableString, int i3) {
        t[] tVarArr = (t[]) this.b;
        int i10 = i3 + 1;
        spannableString.setSpan(tVarArr[0], i3, i10, 0);
        int i11 = i3 + 2;
        spannableString.setSpan(tVarArr[1], i10, i11, 0);
        spannableString.setSpan(tVarArr[2], i11, i3 + 3, 0);
    }

    public void F() {
        synchronized (this.b) {
            try {
                if (((ArrayDeque) this.c).isEmpty()) {
                    this.a = false;
                    return;
                }
                mb.s sVar = (mb.s) ((ArrayDeque) this.c).remove();
                G(sVar.b, sVar.a);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void G(Runnable runnable, Executor executor) {
        try {
            executor.execute(new u(21, this, runnable));
        } catch (RejectedExecutionException unused) {
            F();
        }
    }

    @Override // e3.q
    public void L() {
        SparseArray sparseArray = (SparseArray) this.d;
        ((q) this.b).L();
        if (this.a) {
            for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                ((p) sparseArray.valueAt(i3)).i = true;
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
    public void b(dc.e eVar, fc.d[][][] dVarArr, int i3, fc.d dVar) {
        int i10;
        int i11;
        char charAt;
        dc.d dVar2;
        char charAt2;
        dc.d dVar3;
        char charAt3;
        dc.d dVar4;
        int i12;
        String str = (String) this.b;
        zb.d dVar5 = (zb.d) this.c;
        CharsetEncoder[] charsetEncoderArr = dVar5.a;
        CharsetEncoder[] charsetEncoderArr2 = dVar5.a;
        int length = charsetEncoderArr.length;
        int i13 = dVar5.b;
        if (i13 >= 0) {
            char charAt4 = str.charAt(i3);
            if (charsetEncoderArr2[i13].canEncode("" + charAt4)) {
                length = i13 + 1;
                i10 = length;
                for (i11 = i13; i11 < i10; i11++) {
                    char charAt5 = str.charAt(i3);
                    if (charsetEncoderArr2[i11].canEncode("" + charAt5)) {
                        a(dVarArr, i3, new fc.d(this, dc.d.h, i3, i11, 1, dVar, eVar));
                    }
                }
                charAt = str.charAt(i3);
                dVar2 = dc.d.r;
                if (h(dVar2, charAt)) {
                    a(dVarArr, i3, new fc.d(this, dVar2, i3, 0, 1, dVar, eVar));
                }
                int length2 = str.length();
                charAt2 = str.charAt(i3);
                dVar3 = dc.d.e;
                int i14 = 2;
                if (h(dVar3, charAt2)) {
                    int i15 = i3 + 1;
                    a(dVarArr, i3, new fc.d(this, dVar3, i3, 0, (i15 >= length2 || !h(dVar3, str.charAt(i15))) ? 1 : 2, dVar, eVar));
                }
                charAt3 = str.charAt(i3);
                dVar4 = dc.d.d;
                if (h(dVar4, charAt3)) {
                    return;
                }
                int i16 = i3 + 1;
                if (i16 >= length2 || !h(dVar4, str.charAt(i16))) {
                    i12 = 1;
                } else {
                    int i17 = i3 + 2;
                    if (i17 < length2 && h(dVar4, str.charAt(i17))) {
                        i14 = 3;
                    }
                    i12 = i14;
                }
                a(dVarArr, i3, new fc.d(this, dVar4, i3, 0, i12, dVar, eVar));
                return;
            }
        }
        i13 = 0;
        i10 = length;
        while (i11 < i10) {
        }
        charAt = str.charAt(i3);
        dVar2 = dc.d.r;
        if (h(dVar2, charAt)) {
        }
        int length22 = str.length();
        charAt2 = str.charAt(i3);
        dVar3 = dc.d.e;
        int i142 = 2;
        if (h(dVar3, charAt2)) {
        }
        charAt3 = str.charAt(i3);
        dVar4 = dc.d.d;
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

    public void d(v vVar) {
        ArrayList arrayList = (ArrayList) q();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            w0 w0Var = (w0) obj;
            try {
                try {
                    oc.u uVar = (oc.u) this.b;
                    g0.h3(new zo0(w0Var.c, uVar, w0Var.a, "websocket error: " + org.telegram.ui.Wallet.x0.a(vVar), 19));
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                w0Var.getClass();
            }
        }
    }

    @Override // org.telegram.ui.rm0
    public boolean e() {
        return ((f30) this.d).b.e();
    }

    @Override // e3.q
    public void f(b0 b0Var) {
        ((q) this.b).f(b0Var);
    }

    public void g() {
        ArrayList arrayList = (ArrayList) q();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            w0 w0Var = (w0) obj;
            try {
                try {
                    w0Var.getClass();
                } catch (Throwable unused) {
                    w0Var.getClass();
                }
            } catch (Throwable unused2) {
            }
        }
    }

    @Override // e3.q
    public e3.i0 i0(int i3, int i10) {
        SparseArray sparseArray = (SparseArray) this.d;
        q qVar = (q) this.b;
        if (i10 != 3 && i10 != 5) {
            this.a = true;
        }
        if (i10 != 3) {
            return qVar.i0(i3, i10);
        }
        p pVar = (p) sparseArray.get(i3);
        if (pVar != null) {
            return pVar;
        }
        p pVar2 = new p(qVar.i0(i3, i10), (k) this.c);
        sparseArray.put(i3, pVar2);
        return pVar2;
    }

    public int j(int i3, int i10, int i11) {
        zb.b bVar = (zb.b) this.b;
        return this.a ? bVar.b(i10, i3) : bVar.b(i3, i10) ? (i11 << 1) | 1 : i11 << 1;
    }

    public ValueAnimator k(t tVar, int i3, int i10, int i11, int i12) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i3, i10);
        ofInt.addUpdateListener(new uc(16, this, tVar));
        ofInt.setDuration(i12);
        ofInt.setStartDelay(i11);
        ofInt.setInterpolator(xq.f);
        return ofInt;
    }

    public android.support.v4.media.session.a0 l(dc.e eVar) {
        int i3;
        String str = (String) this.b;
        int length = str.length();
        zb.d dVar = (zb.d) this.c;
        CharsetEncoder[] charsetEncoderArr = dVar.a;
        CharsetEncoder[] charsetEncoderArr2 = dVar.a;
        fc.d[][][] dVarArr = (fc.d[][][]) Array.newInstance((Class<?>) fc.d.class, length + 1, charsetEncoderArr.length, 4);
        b(eVar, dVarArr, 0, null);
        for (int i10 = 1; i10 <= length; i10++) {
            for (int i11 = 0; i11 < charsetEncoderArr2.length; i11++) {
                for (int i12 = 0; i12 < 4; i12++) {
                    fc.d dVar2 = dVarArr[i10][i11][i12];
                    if (dVar2 != null && i10 < length) {
                        b(eVar, dVarArr, i10, dVar2);
                    }
                }
            }
        }
        int i13 = -1;
        int i14 = Integer.MAX_VALUE;
        int i15 = -1;
        for (int i16 = 0; i16 < charsetEncoderArr2.length; i16++) {
            for (int i17 = 0; i17 < 4; i17++) {
                fc.d dVar3 = dVarArr[length][i16][i17];
                if (dVar3 != null && (i3 = dVar3.f) < i14) {
                    i13 = i16;
                    i15 = i17;
                    i14 = i3;
                }
            }
        }
        if (i13 >= 0) {
            return new android.support.v4.media.session.a0(this, eVar, dVarArr[length][i13][i15]);
        }
        throw new l6.m(a1.g.q("Internal error: failed to encode \"", str, "\""));
    }

    public p2.v n(UUID uuid, p2.o oVar) {
        String str = oVar.b;
        if (this.a || TextUtils.isEmpty(str)) {
            str = (String) this.c;
        }
        if (TextUtils.isEmpty(str)) {
            Map map = Collections.EMPTY_MAP;
            Uri uri = Uri.EMPTY;
            zb.k(uri, "The uri must be set.");
            throw new w(new i2.n(uri, 1, null, map, 0L, -1L, null, 0), uri, x1.h, 0L, new IllegalStateException("No license URL"));
        }
        HashMap hashMap = new HashMap();
        UUID uuid2 = d2.m.f;
        hashMap.put("Content-Type", uuid2.equals(uuid) ? "text/xml" : d2.m.d.equals(uuid) ? "application/json" : "application/octet-stream");
        if (uuid2.equals(uuid)) {
            hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (((HashMap) this.d)) {
            hashMap.putAll((HashMap) this.d);
        }
        return og.a(((i2.p) this.b).createDataSource(), str, oVar.a, hashMap);
    }

    public p2.v o(p2.p pVar) {
        Charset charset = StandardCharsets.UTF_8;
        byte[][] bArr = {"{\"signedRequest\":\"".getBytes(charset), pVar.a, "\"}".getBytes(charset)};
        long j10 = 0;
        for (int i3 = 0; i3 < 3; i3++) {
            j10 += bArr[i3].length;
        }
        int i10 = (int) j10;
        zb.d(j10, "the total number of elements (%s) in the arrays must fit in an int", j10 == ((long) i10));
        byte[] bArr2 = new byte[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < 3; i12++) {
            byte[] bArr3 = bArr[i12];
            System.arraycopy(bArr3, 0, bArr2, i11, bArr3.length);
            i11 += bArr3.length;
        }
        i2.h createDataSource = ((i2.p) this.b).createDataSource();
        String str = pVar.b;
        String aVar = j9.a.i.toString();
        String valueOf = String.valueOf(i10);
        g9.o.f("Content-Type", aVar);
        g9.o.f("Content-Length", valueOf);
        return og.a(createDataSource, str, bArr2, x1.g(2, new Object[]{"Content-Type", aVar, "Content-Length", valueOf}, null));
    }

    public List q() {
        synchronized (((ArrayList) this.c)) {
            try {
                if (!this.a) {
                    return (ArrayList) this.d;
                }
                ArrayList arrayList = new ArrayList(((ArrayList) this.c).size());
                ArrayList arrayList2 = (ArrayList) this.c;
                int size = arrayList2.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList2.get(i3);
                    i3++;
                    arrayList.add((w0) obj);
                }
                this.d = arrayList;
                this.a = false;
                return arrayList;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public synchronized void s() {
        try {
            if (this.a) {
                return;
            }
            Boolean v = v();
            this.c = v;
            if (v == null) {
                ((t9.l) ((qa.b) this.b)).a(new z9.j(7));
            }
            this.a = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized boolean t() {
        Boolean bool;
        try {
            s();
            bool = (Boolean) this.c;
        } catch (Throwable th2) {
            throw th2;
        }
        return bool != null ? bool.booleanValue() : ((FirebaseMessaging) this.d).a.h();
    }

    public Boolean v() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        n9.h hVar = ((FirebaseMessaging) this.d).a;
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

    @Override // org.telegram.ui.rm0
    public void v0(int i3, boolean z10, boolean z11) {
        ArrayList arrayList = (ArrayList) this.c;
        f30 f30Var = (f30) this.d;
        HashMap hashMap = (HashMap) this.b;
        if (hashMap.isEmpty() || f30Var.b == null || this.a || z10) {
            return;
        }
        this.a = true;
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = hashMap.get(arrayList.get(i10));
            xy xyVar = new xy();
            arrayList2.add(xyVar);
            if (obj instanceof bf) {
                bf bfVar = (bf) obj;
                String str = bfVar.h;
                if (str != null) {
                    xyVar.c = str;
                } else {
                    xyVar.l = bfVar;
                }
                xyVar.k = bfVar.s;
                xyVar.e = bfVar.c;
                CharSequence charSequence = bfVar.I;
                xyVar.d = charSequence != null ? charSequence.toString() : null;
                xyVar.i = bfVar.n;
                xyVar.j = bfVar.r;
                xyVar.h = bfVar.x;
            }
        }
        f30.a(f30Var, false, arrayList2);
    }

    public dc.c w() {
        dc.c cVar = (dc.c) this.d;
        if (cVar != null) {
            return cVar;
        }
        int i3 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < 6; i11++) {
            i10 = j(i11, 8, i10);
        }
        int j10 = j(8, 7, j(8, 8, j(7, 8, i10)));
        for (int i12 = 5; i12 >= 0; i12--) {
            j10 = j(8, i12, j10);
        }
        int i13 = ((zb.b) this.b).b;
        int i14 = i13 - 7;
        for (int i15 = i13 - 1; i15 >= i14; i15--) {
            i3 = j(8, i15, i3);
        }
        for (int i16 = i13 - 8; i16 < i13; i16++) {
            i3 = j(i16, 8, i3);
        }
        dc.c a10 = dc.c.a(j10, i3);
        if (a10 == null) {
            a10 = dc.c.a(j10 ^ 21522, i3 ^ 21522);
        }
        this.d = a10;
        if (a10 != null) {
            return a10;
        }
        throw yb.c.a();
    }

    public dc.e x() {
        dc.e eVar = (dc.e) this.c;
        if (eVar != null) {
            return eVar;
        }
        int i3 = ((zb.b) this.b).b;
        int i10 = (i3 - 17) / 4;
        if (i10 <= 6) {
            return dc.e.c(i10);
        }
        int i11 = i3 - 11;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 5; i14 >= 0; i14--) {
            for (int i15 = i3 - 9; i15 >= i11; i15--) {
                i13 = j(i15, i14, i13);
            }
        }
        dc.e b10 = dc.e.b(i13);
        if (b10 != null && (b10.a * 4) + 17 == i3) {
            this.c = b10;
            return b10;
        }
        for (int i16 = 5; i16 >= 0; i16--) {
            for (int i17 = i3 - 9; i17 >= i11; i17--) {
                i12 = j(i16, i17, i12);
            }
        }
        dc.e b11 = dc.e.b(i12);
        if (b11 == null || (b11.a * 4) + 17 != i3) {
            throw yb.c.a();
        }
        this.c = b11;
        return b11;
    }

    public void y() {
        if (((dc.c) this.d) == null) {
            return;
        }
        int i3 = o1.g.d(8)[((dc.c) this.d).b];
        zb.b bVar = (zb.b) this.b;
        int i10 = bVar.b;
        for (int i11 = 0; i11 < i10; i11++) {
            for (int i12 = 0; i12 < i10; i12++) {
                if (com.google.android.recaptcha.internal.a.b(i3, i11, i12)) {
                    bVar.a(i12, i11);
                }
            }
        }
    }

    public void z(View view) {
        ArrayList arrayList = (ArrayList) this.d;
        arrayList.remove(view);
        if (arrayList.isEmpty()) {
            ((AnimatorSet) this.c).cancel();
        }
    }

    public n(q qVar, k kVar) {
        this.b = qVar;
        this.c = kVar;
        this.d = new SparseArray();
    }

    public n(o3 o3Var, boolean z10) {
        this.d = o3Var;
        this.c = new AtomicReference(null);
        this.a = z10;
        this.b = new AtomicMarkableReference(new ba.e(z10 ? TLObject.FLAG_13 : 1024), false);
    }

    @Override // org.telegram.ui.rm0
    public /* synthetic */ void c0() {
    }

    @Override // org.telegram.ui.rm0
    public void m() {
    }

    @Override // org.telegram.ui.rm0
    public void u(Editable editable) {
    }
}
