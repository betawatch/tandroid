package ac;

import ag.p2;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.session.a0;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import c3.b0;
import c3.k0;
import c3.q;
import com.google.firebase.messaging.FirebaseMessaging;
import e9.c2;
import g2.p;
import j$.util.Objects;
import j6.l;
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
import jb.s;
import lc.v;
import lc.w;
import m.p3;
import m1.j;
import n2.o;
import n2.x;
import org.telegram.messenger.hf;
import org.telegram.messenger.i0;
import org.telegram.messenger.pz;
import org.telegram.messenger.u;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.g1;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.b40;
import org.telegram.ui.Components.c11;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Wallet.z0;
import org.telegram.ui.a5;
import org.telegram.ui.ko0;
import org.telegram.ui.r4;
import org.telegram.ui.t4;
import org.telegram.ui.v4;
import org.telegram.ui.y0;
import r0.h0;
import r0.z;
import th.m1;
import v7.t6;
import w7.d0;
import z3.k;
import z3.n;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class a implements ko0, q {
    public static a e;
    public boolean a;
    public Object b;
    public Object c;
    public Object d;

    public a(View view) {
        u[] uVarArr = {new u(), new u(), new u()};
        this.b = uVarArr;
        this.d = new ArrayList();
        AnimatorSet animatorSet = new AnimatorSet();
        this.c = animatorSet;
        animatorSet.playTogether(j(uVarArr[0], 0, zs.e4, 0, zs.X4), j(uVarArr[1], 0, zs.e4, zs.g2, zs.X4), j(uVarArr[2], 0, zs.e4, zs.X4, zs.X4), j(uVarArr[0], zs.e4, 0, 1000, 400), j(uVarArr[1], zs.e4, 0, 1000, 400), j(uVarArr[2], zs.e4, 0, 1000, 400));
        animatorSet.addListener(new g1(this, view));
    }

    public static void a(cc.d[][][] dVarArr, int i10, cc.d dVar) {
        cc.d[] dVarArr2 = dVarArr[i10 + dVar.d][dVar.c];
        f fVar = dVar.a;
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
        cc.d dVar2 = dVarArr2[c10];
        if (dVar2 == null || dVar2.f > dVar.f) {
            dVarArr2[c10] = dVar;
        }
    }

    public static boolean g(f fVar, char c10) {
        int ordinal = fVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                if ((c10 < '`' ? cc.b.a[c10] : -1) == -1) {
                    return false;
                }
            } else if (ordinal != 4) {
                if (ordinal != 6) {
                    return false;
                }
                return cc.b.c(String.valueOf(c10));
            }
        } else if (c10 < '0' || c10 > '9') {
            return false;
        }
        return true;
    }

    public static boolean h(v4 v4Var) {
        return (v4Var.a == null && v4Var.b == null) ? false : true;
    }

    public static a n() {
        if (e == null) {
            e = new a();
        }
        return e;
    }

    public static h p(int i10) {
        int c10 = j.c(i10);
        return c10 != 0 ? c10 != 1 ? h.c(40) : h.c(26) : h.c(9);
    }

    public void A(ViewGroup viewGroup, p6 p6Var, v4 v4Var, t4 t4Var) {
        Objects.requireNonNull(viewGroup);
        Context context = viewGroup.getContext();
        if (((ViewGroup) this.b) != viewGroup) {
            if (this.a) {
                r4 r4Var = (r4) this.d;
                int i10 = a5.F;
                r4Var.b(false);
            }
            this.b = viewGroup;
            this.c = (WindowManager) context.getSystemService(WindowManager.class);
            r4 r4Var2 = new r4(this, context, p6Var, t4Var);
            this.d = r4Var2;
            y0 y0Var = new y0(this, 3);
            WeakHashMap weakHashMap = h0.a;
            z.i(r4Var2, y0Var);
        }
        ((r4) this.d).a(v4Var);
        if (this.a) {
            return;
        }
        if (((r4) this.d).getParent() != null) {
            ((WindowManager) this.c).removeView((r4) this.d);
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, 1000, 0, -3);
        layoutParams.softInputMode = 16;
        layoutParams.flags |= -1945959040;
        i0.m(layoutParams);
        i0.x3((WindowManager) this.c, (r4) this.d, layoutParams);
        ((WindowManager) this.c).addView((r4) this.d, layoutParams);
        viewGroup.requestDisallowInterceptTouchEvent(true);
        this.a = true;
    }

    public void C(Runnable runnable, Executor executor) {
        synchronized (this.b) {
            try {
                if (this.a) {
                    ((ArrayDeque) this.c).add(new s(runnable, executor));
                } else {
                    this.a = true;
                    F(runnable, executor);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void D(SpannableString spannableString, int i10) {
        u[] uVarArr = (u[]) this.b;
        int i11 = i10 + 1;
        spannableString.setSpan(uVarArr[0], i10, i11, 0);
        int i12 = i10 + 2;
        spannableString.setSpan(uVarArr[1], i11, i12, 0);
        spannableString.setSpan(uVarArr[2], i12, i10 + 3, 0);
    }

    public void E() {
        synchronized (this.b) {
            try {
                if (((ArrayDeque) this.c).isEmpty()) {
                    this.a = false;
                    return;
                }
                s sVar = (s) ((ArrayDeque) this.c).remove();
                F(sVar.b, sVar.a);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void F(Runnable runnable, Executor executor) {
        try {
            executor.execute(new j9.u(21, this, runnable));
        } catch (RejectedExecutionException unused) {
            E();
        }
    }

    @Override // c3.q
    public void G1(b0 b0Var) {
        ((q) this.b).G1(b0Var);
    }

    @Override // c3.q
    public k0 I1(int i10, int i11) {
        SparseArray sparseArray = (SparseArray) this.d;
        q qVar = (q) this.b;
        if (i11 != 3 && i11 != 5) {
            this.a = true;
        }
        if (i11 != 3) {
            return qVar.I1(i10, i11);
        }
        n nVar = (n) sparseArray.get(i10);
        if (nVar != null) {
            return nVar;
        }
        n nVar2 = new n(qVar.I1(i10, i11), (k) this.c);
        sparseArray.put(i10, nVar2);
        return nVar2;
    }

    @Override // c3.q
    public void Q0() {
        SparseArray sparseArray = (SparseArray) this.d;
        ((q) this.b).Q0();
        if (this.a) {
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                ((n) sparseArray.valueAt(i10)).i = true;
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
    public void b(h hVar, cc.d[][][] dVarArr, int i10, cc.d dVar) {
        int i11;
        int i12;
        char charAt;
        f fVar;
        char charAt2;
        f fVar2;
        char charAt3;
        f fVar3;
        int i13;
        String str = (String) this.b;
        wb.d dVar2 = (wb.d) this.c;
        CharsetEncoder[] charsetEncoderArr = dVar2.a;
        CharsetEncoder[] charsetEncoderArr2 = dVar2.a;
        int length = charsetEncoderArr.length;
        int i14 = dVar2.b;
        if (i14 >= 0) {
            char charAt4 = str.charAt(i10);
            if (charsetEncoderArr2[i14].canEncode("" + charAt4)) {
                length = i14 + 1;
                i11 = length;
                for (i12 = i14; i12 < i11; i12++) {
                    char charAt5 = str.charAt(i10);
                    if (charsetEncoderArr2[i12].canEncode("" + charAt5)) {
                        a(dVarArr, i10, new cc.d(this, f.h, i10, i12, 1, dVar, hVar));
                    }
                }
                charAt = str.charAt(i10);
                fVar = f.r;
                if (g(fVar, charAt)) {
                    a(dVarArr, i10, new cc.d(this, fVar, i10, 0, 1, dVar, hVar));
                }
                int length2 = str.length();
                charAt2 = str.charAt(i10);
                fVar2 = f.e;
                int i15 = 2;
                if (g(fVar2, charAt2)) {
                    int i16 = i10 + 1;
                    a(dVarArr, i10, new cc.d(this, fVar2, i10, 0, (i16 >= length2 || !g(fVar2, str.charAt(i16))) ? 1 : 2, dVar, hVar));
                }
                charAt3 = str.charAt(i10);
                fVar3 = f.d;
                if (g(fVar3, charAt3)) {
                    return;
                }
                int i17 = i10 + 1;
                if (i17 >= length2 || !g(fVar3, str.charAt(i17))) {
                    i13 = 1;
                } else {
                    int i18 = i10 + 2;
                    if (i18 < length2 && g(fVar3, str.charAt(i18))) {
                        i15 = 3;
                    }
                    i13 = i15;
                }
                a(dVarArr, i10, new cc.d(this, fVar3, i10, 0, i13, dVar, hVar));
                return;
            }
        }
        i14 = 0;
        i11 = length;
        while (i12 < i11) {
        }
        charAt = str.charAt(i10);
        fVar = f.r;
        if (g(fVar, charAt)) {
        }
        int length22 = str.length();
        charAt2 = str.charAt(i10);
        fVar2 = f.e;
        int i152 = 2;
        if (g(fVar2, charAt2)) {
        }
        charAt3 = str.charAt(i10);
        fVar3 = f.d;
        if (g(fVar3, charAt3)) {
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

    public void d(w wVar) {
        ArrayList arrayList = (ArrayList) o();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            org.telegram.ui.Wallet.y0 y0Var = (org.telegram.ui.Wallet.y0) obj;
            try {
                try {
                    v vVar = (v) this.b;
                    i0.g3(new c11(y0Var.c, vVar, y0Var.a, "websocket error: " + z0.a(wVar), 13));
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                y0Var.getClass();
            }
        }
    }

    @Override // org.telegram.ui.ko0
    public boolean e() {
        return ((b40) this.d).b.e();
    }

    public void f() {
        ArrayList arrayList = (ArrayList) o();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            org.telegram.ui.Wallet.y0 y0Var = (org.telegram.ui.Wallet.y0) obj;
            try {
                try {
                    y0Var.getClass();
                } catch (Throwable unused) {
                    y0Var.getClass();
                }
            } catch (Throwable unused2) {
            }
        }
    }

    public int i(int i10, int i11, int i12) {
        wb.b bVar = (wb.b) this.b;
        return this.a ? bVar.b(i11, i10) : bVar.b(i10, i11) ? (i12 << 1) | 1 : i12 << 1;
    }

    public ValueAnimator j(u uVar, int i10, int i11, int i12, int i13) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i10, i11);
        ofInt.addUpdateListener(new p2(15, this, uVar));
        ofInt.setDuration(i13);
        ofInt.setStartDelay(i12);
        ofInt.setInterpolator(gr.f);
        return ofInt;
    }

    public a0 k(h hVar) {
        int i10;
        String str = (String) this.b;
        int length = str.length();
        wb.d dVar = (wb.d) this.c;
        CharsetEncoder[] charsetEncoderArr = dVar.a;
        CharsetEncoder[] charsetEncoderArr2 = dVar.a;
        cc.d[][][] dVarArr = (cc.d[][][]) Array.newInstance((Class<?>) cc.d.class, length + 1, charsetEncoderArr.length, 4);
        b(hVar, dVarArr, 0, null);
        for (int i11 = 1; i11 <= length; i11++) {
            for (int i12 = 0; i12 < charsetEncoderArr2.length; i12++) {
                for (int i13 = 0; i13 < 4; i13++) {
                    cc.d dVar2 = dVarArr[i11][i12][i13];
                    if (dVar2 != null && i11 < length) {
                        b(hVar, dVarArr, i11, dVar2);
                    }
                }
            }
        }
        int i14 = -1;
        int i15 = Integer.MAX_VALUE;
        int i16 = -1;
        for (int i17 = 0; i17 < charsetEncoderArr2.length; i17++) {
            for (int i18 = 0; i18 < 4; i18++) {
                cc.d dVar3 = dVarArr[length][i17][i18];
                if (dVar3 != null && (i10 = dVar3.f) < i15) {
                    i14 = i17;
                    i16 = i18;
                    i15 = i10;
                }
            }
        }
        if (i14 >= 0) {
            return new a0(this, hVar, dVarArr[length][i14][i16]);
        }
        throw new l(a1.g.n("Internal error: failed to encode \"", str, "\""));
    }

    public n2.w l(UUID uuid, o oVar) {
        String str = oVar.b;
        if (this.a || TextUtils.isEmpty(str)) {
            str = (String) this.c;
        }
        if (TextUtils.isEmpty(str)) {
            Map map = Collections.EMPTY_MAP;
            Uri uri = Uri.EMPTY;
            t6.l(uri, "The uri must be set.");
            throw new x(new g2.n(uri, 1, null, map, 0L, -1L, null, 0), uri, c2.h, 0L, new IllegalStateException("No license URL"));
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
        return d0.a(((p) this.b).createDataSource(), str, oVar.a, hashMap);
    }

    public n2.w m(n2.p pVar) {
        Charset charset = StandardCharsets.UTF_8;
        byte[][] bArr = {"{\"signedRequest\":\"".getBytes(charset), pVar.a, "\"}".getBytes(charset)};
        long j10 = 0;
        for (int i10 = 0; i10 < 3; i10++) {
            j10 += bArr[i10].length;
        }
        int i11 = (int) j10;
        t6.d(j10, "the total number of elements (%s) in the arrays must fit in an int", j10 == ((long) i11));
        byte[] bArr2 = new byte[i11];
        int i12 = 0;
        for (int i13 = 0; i13 < 3; i13++) {
            byte[] bArr3 = bArr[i13];
            System.arraycopy(bArr3, 0, bArr2, i12, bArr3.length);
            i12 += bArr3.length;
        }
        g2.h createDataSource = ((p) this.b).createDataSource();
        String str = pVar.b;
        String aVar = h9.a.i.toString();
        String valueOf = String.valueOf(i11);
        e9.s.e("Content-Type", aVar);
        e9.s.e("Content-Length", valueOf);
        return d0.a(createDataSource, str, bArr2, c2.f(2, new Object[]{"Content-Type", aVar, "Content-Length", valueOf}, null));
    }

    public List o() {
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
                    arrayList.add((org.telegram.ui.Wallet.y0) obj);
                }
                this.d = arrayList;
                this.a = false;
                return arrayList;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public synchronized void q() {
        try {
            if (this.a) {
                return;
            }
            Boolean s10 = s();
            this.c = s10;
            if (s10 == null) {
                ((r9.l) ((na.b) this.b)).a(new m1(25));
            }
            this.a = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized boolean r() {
        Boolean bool;
        try {
            q();
            bool = (Boolean) this.c;
        } catch (Throwable th2) {
            throw th2;
        }
        return bool != null ? bool.booleanValue() : ((FirebaseMessaging) this.d).a.h();
    }

    public Boolean s() {
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

    public e t() {
        e eVar = (e) this.d;
        if (eVar != null) {
            return eVar;
        }
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < 6; i12++) {
            i11 = i(i12, 8, i11);
        }
        int i13 = i(8, 7, i(8, 8, i(7, 8, i11)));
        for (int i14 = 5; i14 >= 0; i14--) {
            i13 = i(8, i14, i13);
        }
        int i15 = ((wb.b) this.b).b;
        int i16 = i15 - 7;
        for (int i17 = i15 - 1; i17 >= i16; i17--) {
            i10 = i(8, i17, i10);
        }
        for (int i18 = i15 - 8; i18 < i15; i18++) {
            i10 = i(i18, 8, i10);
        }
        e a2 = e.a(i13, i10);
        if (a2 == null) {
            a2 = e.a(i13 ^ 21522, i10 ^ 21522);
        }
        this.d = a2;
        if (a2 != null) {
            return a2;
        }
        throw vb.c.a();
    }

    public h u() {
        h hVar = (h) this.c;
        if (hVar != null) {
            return hVar;
        }
        int i10 = ((wb.b) this.b).b;
        int i11 = (i10 - 17) / 4;
        if (i11 <= 6) {
            return h.c(i11);
        }
        int i12 = i10 - 11;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 5; i15 >= 0; i15--) {
            for (int i16 = i10 - 9; i16 >= i12; i16--) {
                i14 = i(i16, i15, i14);
            }
        }
        h b10 = h.b(i14);
        if (b10 != null && (b10.a * 4) + 17 == i10) {
            this.c = b10;
            return b10;
        }
        for (int i17 = 5; i17 >= 0; i17--) {
            for (int i18 = i10 - 9; i18 >= i12; i18--) {
                i13 = i(i17, i18, i13);
            }
        }
        h b11 = h.b(i13);
        if (b11 == null || (b11.a * 4) + 17 != i10) {
            throw vb.c.a();
        }
        this.c = b11;
        return b11;
    }

    @Override // org.telegram.ui.ko0
    public void u0(int i10, boolean z10, boolean z11) {
        ArrayList arrayList = (ArrayList) this.c;
        b40 b40Var = (b40) this.d;
        HashMap hashMap = (HashMap) this.b;
        if (hashMap.isEmpty() || b40Var.b == null || this.a || z10) {
            return;
        }
        this.a = true;
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            Object obj = hashMap.get(arrayList.get(i11));
            pz pzVar = new pz();
            arrayList2.add(pzVar);
            if (obj instanceof hf) {
                hf hfVar = (hf) obj;
                String str = hfVar.h;
                if (str != null) {
                    pzVar.c = str;
                } else {
                    pzVar.l = hfVar;
                }
                pzVar.k = hfVar.s;
                pzVar.e = hfVar.c;
                CharSequence charSequence = hfVar.I;
                pzVar.d = charSequence != null ? charSequence.toString() : null;
                pzVar.i = hfVar.n;
                pzVar.j = hfVar.r;
                pzVar.h = hfVar.x;
            }
        }
        b40.a(b40Var, false, arrayList2);
    }

    public void v() {
        if (((e) this.d) == null) {
            return;
        }
        int i10 = j.d(8)[((e) this.d).b];
        wb.b bVar = (wb.b) this.b;
        int i11 = bVar.b;
        for (int i12 = 0; i12 < i11; i12++) {
            for (int i13 = 0; i13 < i11; i13++) {
                if (a1.g.b(i10, i12, i13)) {
                    bVar.a(i13, i12);
                }
            }
        }
    }

    public void w(View view) {
        ArrayList arrayList = (ArrayList) this.d;
        arrayList.remove(view);
        if (arrayList.isEmpty()) {
            ((AnimatorSet) this.c).cancel();
        }
    }

    public void x() {
        e2.i0 i0Var = (e2.i0) this.d;
        if (this.a) {
            i0Var.d(new a3.d(this, 25));
            this.a = false;
        }
    }

    public boolean z(String str, String str2) {
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
                ((xa.n) ((p3) this.d).b).Y(gVar);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public a(q qVar, k kVar) {
        this.b = qVar;
        this.c = kVar;
        this.d = new SparseArray();
    }

    public a(p3 p3Var, boolean z10) {
        this.d = p3Var;
        this.c = new AtomicReference(null);
        this.a = z10;
        this.b = new AtomicMarkableReference(new y9.d(z10 ? TLObject.FLAG_13 : 1024), false);
    }

    @Override // org.telegram.ui.ko0
    public /* synthetic */ void h0() {
    }

    @Override // org.telegram.ui.ko0
    public void y() {
    }

    @Override // org.telegram.ui.ko0
    public void B(Editable editable) {
    }
}
