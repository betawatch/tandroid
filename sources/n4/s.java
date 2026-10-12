package n4;

import a3.i0;
import ab.a0;
import ab.c0;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.ViewGroup;
import b2.b2;
import b2.s0;
import b2.x0;
import bi.w2;
import e2.m0;
import e9.l0;
import e9.n0;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ji.g1;
import ji.h0;
import ji.h1;
import ji.h5;
import ji.j0;
import ji.k0;
import ji.m5;
import org.telegram.ui.Cells.o9;
import p4.u0;
import v7.q8;
import v7.s6;
import v7.u6;
import w7.a9;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class s implements ee.b, d9.k, g6.n, ef.b, z3.n, c3.i, g1, e2.d, n5.b {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ s(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    public static String E(s sVar) {
        Collection<String> collection = (Collection) sVar.c;
        StringBuilder sb2 = new StringBuilder("com.google.android.gms.cast.CATEGORY_CAST");
        String str = (String) sVar.b;
        if (str != null) {
            String upperCase = str.toUpperCase(Locale.ROOT);
            if (!upperCase.matches("[A-F0-9]+")) {
                throw new IllegalArgumentException("Invalid application ID: ".concat(str));
            }
            sb2.append("/");
            sb2.append(upperCase);
        }
        if (collection != null) {
            if (collection.isEmpty()) {
                throw new IllegalArgumentException("Must specify at least one namespace");
            }
            if (str == null) {
                sb2.append("/");
            }
            sb2.append("/");
            boolean z10 = true;
            for (String str2 : collection) {
                g6.a.b(str2);
                if (!z10) {
                    sb2.append(",");
                }
                if (!g6.a.a.matcher(str2).matches()) {
                    StringBuilder sb3 = new StringBuilder(str2.length());
                    for (int i10 = 0; i10 < str2.length(); i10++) {
                        char charAt = str2.charAt(i10);
                        if ((charAt < 'A' || charAt > 'Z') && ((charAt < 'a' || charAt > 'z') && !((charAt >= '0' && charAt <= '9') || charAt == '_' || charAt == '-' || charAt == '.' || charAt == ':'))) {
                            sb3.append(String.format("%%%04x", Integer.valueOf(charAt)));
                        } else {
                            sb3.append(charAt);
                        }
                    }
                    str2 = sb3.toString();
                }
                sb2.append(str2);
                z10 = false;
            }
        }
        if (str == null && collection == null) {
            sb2.append("/");
        }
        if (collection == null) {
            sb2.append("/");
        }
        sb2.append("//ALLOW_IPV6");
        return sb2.toString();
    }

    public static void e(s sVar, i2.c cVar) {
        sVar.getClass();
        for (Map.Entry entry : new HashMap((HashMap) sVar.b).entrySet()) {
            if (entry.getKey() != null) {
                throw new ClassCastException();
            }
            List list = (List) entry.getValue();
            if (!f(cVar, list).equals(f((i2.c) sVar.c, list))) {
                throw null;
            }
        }
        sVar.c = cVar;
    }

    public static i2.c f(i2.c cVar, List list) {
        cVar.getClass();
        Map map = cVar.a;
        HashMap hashMap = new HashMap(map);
        HashSet hashSet = new HashSet(list);
        for (String str : map.keySet()) {
            if (!hashSet.contains(str)) {
                hashMap.remove(str);
            }
        }
        return new i2.c(hashMap);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.AbstractCollection, java.util.List] */
    public void A(y yVar) {
        n nVar = (n) this.b;
        nVar.g = yVar;
        synchronized (nVar.d) {
            for (int beginBroadcast = nVar.f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((b) nVar.f.getBroadcastItem(beginBroadcast)).t(yVar);
                } catch (RemoteException | SecurityException e) {
                    e2.a.d("MediaSessionCompat", "Dead object in setPlaybackState.", e);
                }
            }
            nVar.f.finishBroadcast();
        }
        MediaSession mediaSession = nVar.a;
        if (yVar.w == null) {
            PlaybackState.Builder builder = new PlaybackState.Builder();
            builder.setState(yVar.a, yVar.b, yVar.d, yVar.n);
            builder.setBufferedPosition(yVar.c);
            builder.setActions(yVar.e);
            builder.setErrorMessage(yVar.h);
            for (x xVar : yVar.r) {
                xVar.getClass();
                PlaybackState.CustomAction.Builder builder2 = new PlaybackState.CustomAction.Builder(xVar.a, xVar.b, xVar.c);
                builder2.setExtras(xVar.d);
                PlaybackState.CustomAction build = builder2.build();
                if (build != null) {
                    builder.addCustomAction(build);
                }
            }
            builder.setActiveQueueItemId(yVar.s);
            builder.setExtras(yVar.v);
            yVar.w = builder.build();
        }
        mediaSession.setPlaybackState(yVar.w);
    }

    public void B(ArrayList arrayList) {
        f2.s sVar;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((f2.r) arrayList.get(i10)).a == 1) {
                try {
                    sVar = new f2.s((f2.r) arrayList.get(i10));
                } catch (f2.q unused) {
                    sVar = null;
                }
                this.c = sVar;
            }
        }
    }

    @Override // ji.g1
    public /* synthetic */ boolean C(h1 h1Var) {
        return false;
    }

    public void D(b2 b2Var) {
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new a1.f(4, this, b2Var));
        }
    }

    @Override // ji.g1
    public /* synthetic */ boolean F0(boolean z10) {
        return false;
    }

    @Override // ji.g1
    public void U(h1 h1Var, int i10, int i11) {
        o9 C;
        j0 j0Var = (j0) this.b;
        if (((k0) this.c).d || i10 == i11 || (C = j0Var.C()) == null) {
            return;
        }
        if (C.x() && C.W == j0Var.L()) {
            return;
        }
        h1Var.post(new h0(this, h1Var, i11, C, j0Var, i10));
    }

    @Override // ji.g1
    public void a(h1 h1Var) {
        ((j0) this.b).a(h1Var);
    }

    @Override // d9.k
    public Object apply(Object obj) {
        return ((d9.k) ((k6.h) this.b).b).apply(obj);
    }

    @Override // c3.i
    public c3.h b(c3.p pVar, long j10) {
        long position = pVar.getPosition();
        int min = (int) Math.min(20000L, pVar.getLength() - position);
        e2.x xVar = (e2.x) this.c;
        xVar.K(min);
        pVar.a(0, min, xVar.a);
        int i10 = -1;
        int i11 = -1;
        long j11 = -9223372036854775807L;
        while (xVar.a() >= 4) {
            if (h3.a.a(xVar.b, xVar.a) != 442) {
                xVar.O(1);
            } else {
                xVar.O(4);
                long c10 = j4.x.c(xVar);
                if (c10 != -9223372036854775807L) {
                    long b10 = ((e2.k0) this.b).b(c10);
                    if (b10 > j10) {
                        return j11 == -9223372036854775807L ? new c3.h(-1, b10, position) : new c3.h(0, -9223372036854775807L, position + i11);
                    }
                    if (b10 + 100000 > j10) {
                        return new c3.h(0, -9223372036854775807L, position + xVar.b);
                    }
                    j11 = b10;
                    i11 = xVar.b;
                }
                int i12 = xVar.c;
                if (xVar.a() >= 10) {
                    xVar.O(9);
                    int A = xVar.A() & 7;
                    if (xVar.a() >= A) {
                        xVar.O(A);
                        if (xVar.a() >= 4) {
                            if (h3.a.a(xVar.b, xVar.a) == 443) {
                                xVar.O(4);
                                int H = xVar.H();
                                if (xVar.a() < H) {
                                    xVar.N(i12);
                                } else {
                                    xVar.O(H);
                                }
                            }
                            while (true) {
                                if (xVar.a() < 4) {
                                    break;
                                }
                                int a2 = h3.a.a(xVar.b, xVar.a);
                                if (a2 == 442 || a2 == 441 || (a2 >>> 8) != 1) {
                                    break;
                                }
                                xVar.O(4);
                                if (xVar.a() < 2) {
                                    xVar.N(i12);
                                    break;
                                }
                                xVar.N(Math.min(xVar.c, xVar.b + xVar.H()));
                            }
                        } else {
                            xVar.N(i12);
                        }
                    } else {
                        xVar.N(i12);
                    }
                } else {
                    xVar.N(i12);
                }
                i10 = xVar.b;
            }
        }
        return j11 != -9223372036854775807L ? new c3.h(-2, j11, position + i10) : c3.h.d;
    }

    @Override // c3.i
    public void c() {
        e2.x xVar = (e2.x) this.c;
        byte[] bArr = m0.b;
        xVar.getClass();
        xVar.L(bArr.length, bArr);
    }

    @Override // e2.d
    public j9.y d(s0 s0Var) {
        j9.y d = ((e2.d) this.b).d(s0Var);
        if (d == null) {
            return null;
        }
        return q8.c(d, new m5(this, 8));
    }

    @Override // ee.b
    public Object g(ee.c cVar, md.c cVar2) {
        Object g10 = ((qf.b) this.b).g(new a0(cVar, (c0) this.c), cVar2);
        return g10 == ld.a.a ? g10 : id.i.a;
    }

    @Override // ji.g1
    public void g0(CharSequence charSequence) {
        ((j0) this.b).F(charSequence);
    }

    @Override // hd.a
    public Object get() {
        return new m5.d((Context) ((n5.c) this.b).a, (li.k) ((h5) this.c).get());
    }

    @Override // ji.g1
    public boolean h() {
        return ((j0) this.b).Q();
    }

    @Override // z3.n
    public int h0() {
        return 1;
    }

    public void i(i2.e eVar) {
        synchronized (eVar) {
        }
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new a3.k0(this, eVar, 1));
        }
    }

    @Override // g6.n
    public void j(String str, long j10, long j11, long j12) {
        g6.n nVar = (g6.n) this.b;
        if (nVar != null) {
            nVar.j(str, j10, j11, j12);
        }
    }

    public byte[] k(n3.a aVar) {
        DataOutputStream dataOutputStream = (DataOutputStream) this.c;
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.b;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(aVar.a);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeBytes(aVar.b);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(aVar.c);
            dataOutputStream.writeLong(aVar.d);
            dataOutputStream.write(aVar.e);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // ji.g1
    public /* synthetic */ boolean l(h1 h1Var) {
        return false;
    }

    public ec.b m() {
        if (((ec.b) this.c) == null) {
            ec.e eVar = (ec.e) this.b;
            int[] iArr = eVar.c;
            dc.d dVar = eVar.a;
            int i10 = dVar.a;
            int i11 = dVar.b;
            ec.b bVar = new ec.b(i10, i11);
            if (eVar.b.length < i10) {
                eVar.b = new byte[i10];
            }
            for (int i12 = 0; i12 < 32; i12++) {
                iArr[i12] = 0;
            }
            for (int i13 = 1; i13 < 5; i13++) {
                byte[] b10 = dVar.b((i11 * i13) / 5, eVar.b);
                int i14 = (i10 * 4) / 5;
                for (int i15 = i10 / 5; i15 < i14; i15++) {
                    int i16 = (b10[i15] & 255) >> 3;
                    iArr[i16] = iArr[i16] + 1;
                }
            }
            int length = iArr.length;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            for (int i20 = 0; i20 < length; i20++) {
                int i21 = iArr[i20];
                if (i21 > i17) {
                    i19 = i20;
                    i17 = i21;
                }
                if (i21 > i18) {
                    i18 = i21;
                }
            }
            int i22 = 0;
            int i23 = 0;
            for (int i24 = 0; i24 < length; i24++) {
                int i25 = i24 - i19;
                int i26 = iArr[i24] * i25 * i25;
                if (i26 > i23) {
                    i22 = i24;
                    i23 = i26;
                }
            }
            if (i19 <= i22) {
                int i27 = i19;
                i19 = i22;
                i22 = i27;
            }
            if (i19 - i22 <= length / 16) {
                throw dc.e.a();
            }
            int i28 = i19 - 1;
            int i29 = -1;
            int i30 = i28;
            while (i28 > i22) {
                int i31 = i28 - i22;
                int i32 = (i18 - iArr[i28]) * (i19 - i28) * i31 * i31;
                if (i32 > i29) {
                    i30 = i28;
                    i29 = i32;
                }
                i28--;
            }
            int i33 = i30 << 3;
            byte[] a2 = dVar.a();
            for (int i34 = 0; i34 < i11; i34++) {
                int i35 = i34 * i10;
                for (int i36 = 0; i36 < i10; i36++) {
                    if ((a2[i35 + i36] & 255) < i33) {
                        int i37 = (i36 / 32) + (bVar.c * i34);
                        int[] iArr2 = bVar.d;
                        iArr2[i37] = iArr2[i37] | (1 << (i36 & 31));
                    }
                }
            }
            this.c = bVar;
        }
        return (ec.b) this.c;
    }

    public c3.o n(Object... objArr) {
        Constructor a2;
        synchronized (((AtomicBoolean) this.c)) {
            if (!((AtomicBoolean) this.c).get()) {
                try {
                    a2 = ((w2) this.b).a();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.c).set(true);
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
            a2 = null;
        }
        if (a2 == null) {
            return null;
        }
        try {
            return (c3.o) a2.newInstance(objArr);
        } catch (Exception e7) {
            throw new IllegalStateException("Unexpected error creating extractor", e7);
        }
    }

    public synchronized Map o() {
        try {
            if (((Map) this.c) == null) {
                this.c = DesugarCollections.unmodifiableMap(new HashMap((HashMap) this.b));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (Map) this.c;
    }

    @Override // ji.g1
    public void p(int i10, int i11) {
        ((j0) this.b).S(i10, i11);
    }

    @Override // ji.g1
    public void p0(h1 h1Var) {
        ((j0) this.b).f();
    }

    @Override // e2.d
    public j9.y q(byte[] bArr) {
        return q8.c(((e2.d) this.b).q(bArr), new m5(this, 8));
    }

    public void r(k.a aVar) {
        qi.e eVar = (qi.e) this.b;
        ((ActionMode.Callback) eVar.a).onDestroyActionMode(eVar.k(aVar));
        g.r rVar = (g.r) this.c;
        if (rVar.E != null) {
            rVar.f.getDecorView().removeCallbacks(rVar.F);
        }
        if (rVar.y != null) {
            r0.m0 m0Var = rVar.G;
            if (m0Var != null) {
                m0Var.b();
            }
            r0.m0 a2 = r0.j0.a(rVar.y);
            a2.a(0.0f);
            rVar.G = a2;
            a2.d(new g.i(this, 2));
        }
        rVar.x = null;
        ViewGroup viewGroup = rVar.J;
        WeakHashMap weakHashMap = r0.j0.a;
        r0.z.c(viewGroup);
        rVar.y();
    }

    public boolean s(k.a aVar, Menu menu) {
        ViewGroup viewGroup = ((g.r) this.c).J;
        WeakHashMap weakHashMap = r0.j0.a;
        r0.z.c(viewGroup);
        qi.e eVar = (qi.e) this.b;
        ActionMode.Callback callback = (ActionMode.Callback) eVar.a;
        k.e k10 = eVar.k(aVar);
        a0.l lVar = (a0.l) eVar.d;
        Menu menu2 = (Menu) lVar.get(menu);
        if (menu2 == null) {
            menu2 = new l.a0((Context) eVar.b, (l.k) menu);
            lVar.put(menu, menu2);
        }
        return callback.onPrepareActionMode(k10, menu2);
    }

    @Override // ji.g1
    public void s0(Editable editable) {
        ((k0) this.c).i();
        ((j0) this.b).Z();
    }

    public void t(Exception exc, boolean z10) {
        this.c = null;
        HashSet hashSet = (HashSet) this.b;
        n0 u10 = n0.u(hashSet);
        hashSet.clear();
        l0 listIterator = u10.listIterator(0);
        while (listIterator.hasNext()) {
            n2.b bVar = (n2.b) listIterator.next();
            bVar.getClass();
            bVar.l(z10 ? 1 : 3, exc);
        }
    }

    public String toString() {
        switch (this.a) {
            case 13:
                try {
                    return m().toString();
                } catch (dc.e unused) {
                    return "";
                }
            default:
                return super.toString();
        }
    }

    public void u(n2.b bVar) {
        ((HashSet) this.b).add(bVar);
        if (((n2.b) this.c) != null) {
            return;
        }
        this.c = bVar;
        n2.q l4 = bVar.b.l();
        bVar.z = l4;
        android.support.v4.media.session.f fVar = bVar.s;
        String str = m0.a;
        l4.getClass();
        fVar.getClass();
        fVar.obtainMessage(1, new n2.a(u2.u.g.getAndIncrement(), true, SystemClock.elapsedRealtime(), l4)).sendToTarget();
    }

    /* JADX WARN: Code restructure failed: missing block: B:195:0x03ae, code lost:
    
        r0.addAll(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0117, code lost:
    
        if (")".equals(i4.a.b(r11, r6)) == false) goto L37;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.util.regex.Matcher] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34, types: [int] */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r4v32, types: [java.util.regex.Matcher] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    /* JADX WARN: Type inference failed for: r9v3 */
    @Override // z3.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void u0(byte[] bArr, int i10, int i11, z3.m mVar, e2.j jVar) {
        i4.c cVar;
        String str;
        ?? r12;
        String sb2;
        int i12;
        char c10;
        s sVar = this;
        e2.x xVar = (e2.x) sVar.b;
        xVar.L(i10 + i11, bArr);
        xVar.N(i10);
        ArrayList arrayList = new ArrayList();
        try {
            i4.i.d(xVar);
            while (!TextUtils.isEmpty(xVar.n(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                boolean z10 = false;
                int i13 = -1;
                int i14 = 0;
                char c11 = 65535;
                while (true) {
                    ?? r92 = 1;
                    if (c11 == 65535) {
                        i14 = xVar.b;
                        String n10 = xVar.n(StandardCharsets.UTF_8);
                        c11 = n10 == null ? (char) 0 : "STYLE".equals(n10) ? (char) 2 : n10.startsWith("NOTE") ? (char) 1 : (char) 3;
                    } else {
                        xVar.N(i14);
                        if (c11 == 0) {
                            a9.b(new androidx.biometric.e(arrayList2), mVar, jVar);
                            return;
                        }
                        if (c11 == 1) {
                            while (!TextUtils.isEmpty(xVar.n(StandardCharsets.UTF_8))) {
                            }
                        } else {
                            String str2 = null;
                            if (c11 == 2) {
                                if (!arrayList2.isEmpty()) {
                                    throw new IllegalArgumentException("A style block was found after the first cue.");
                                }
                                xVar.n(StandardCharsets.UTF_8);
                                i4.a aVar = (i4.a) sVar.c;
                                e2.x xVar2 = aVar.a;
                                StringBuilder sb3 = aVar.b;
                                sb3.setLength(0);
                                int i15 = xVar.b;
                                while (!TextUtils.isEmpty(xVar.n(StandardCharsets.UTF_8))) {
                                }
                                xVar2.L(xVar.b, xVar.a);
                                xVar2.N(i15);
                                ArrayList arrayList3 = new ArrayList();
                                while (true) {
                                    i4.a.c(xVar2);
                                    if (xVar2.a() >= 5 && "::cue".equals(xVar2.y(5, StandardCharsets.UTF_8))) {
                                        int i16 = xVar2.b;
                                        String b10 = i4.a.b(xVar2, sb3);
                                        if (b10 != null) {
                                            if ("{".equals(b10)) {
                                                xVar2.N(i16);
                                                str = "";
                                            } else if ("(".equals(b10)) {
                                                int i17 = xVar2.b;
                                                int i18 = xVar2.c;
                                                boolean z11 = z10 ? 1 : 0;
                                                while (i17 < i18 && z11 == 0) {
                                                    int i19 = i17 + 1;
                                                    z11 = ((char) xVar2.a[i17]) == ')' ? r92 : z10 ? 1 : 0;
                                                    i17 = i19;
                                                }
                                                str = xVar2.y((i17 - 1) - xVar2.b, StandardCharsets.UTF_8).trim();
                                            } else {
                                                str = str2;
                                            }
                                            if (str == null && "{".equals(i4.a.b(xVar2, sb3))) {
                                                i4.b bVar = new i4.b();
                                                bVar.a = "";
                                                bVar.b = "";
                                                bVar.c = Collections.EMPTY_SET;
                                                bVar.d = "";
                                                bVar.e = str2;
                                                bVar.g = z10;
                                                bVar.i = z10;
                                                bVar.j = i13;
                                                bVar.k = i13;
                                                bVar.l = i13;
                                                bVar.m = i13;
                                                bVar.n = i13;
                                                bVar.p = i13;
                                                bVar.q = z10;
                                                if (!str.isEmpty()) {
                                                    int indexOf = str.indexOf(91);
                                                    if (indexOf != i13) {
                                                        ?? matcher = i4.a.c.matcher(str.substring(indexOf));
                                                        if (matcher.matches()) {
                                                            String group = matcher.group(r92);
                                                            group.getClass();
                                                            bVar.d = group;
                                                        }
                                                        str = str.substring(z10 ? 1 : 0, indexOf);
                                                    }
                                                    String str3 = m0.a;
                                                    String[] split = str.split("\\.", i13);
                                                    String str4 = split[z10 ? 1 : 0];
                                                    int indexOf2 = str4.indexOf(35);
                                                    if (indexOf2 != i13) {
                                                        bVar.b = str4.substring(z10 ? 1 : 0, indexOf2);
                                                        bVar.a = str4.substring(indexOf2 + 1);
                                                    } else {
                                                        bVar.b = str4;
                                                    }
                                                    if (split.length > r92) {
                                                        int length = split.length;
                                                        u6.g(length <= split.length ? r92 : z10 ? 1 : 0);
                                                        bVar.c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(split, (int) r92, length)));
                                                    }
                                                }
                                                boolean z12 = z10 ? 1 : 0;
                                                String str5 = str2;
                                                boolean z13 = r92;
                                                while (z12 == 0) {
                                                    int i20 = xVar2.b;
                                                    str5 = i4.a.b(xVar2, sb3);
                                                    boolean z14 = (str5 == null || "}".equals(str5)) ? z13 : z10;
                                                    if (z14 == 0) {
                                                        xVar2.N(i20);
                                                        i4.a.c(xVar2);
                                                        String a2 = i4.a.a(xVar2, sb3);
                                                        if (!a2.isEmpty() && ":".equals(i4.a.b(xVar2, sb3))) {
                                                            i4.a.c(xVar2);
                                                            StringBuilder sb4 = new StringBuilder();
                                                            boolean z15 = false;
                                                            while (true) {
                                                                if (z15) {
                                                                    sb2 = sb4.toString();
                                                                } else {
                                                                    int i21 = xVar2.b;
                                                                    String b11 = i4.a.b(xVar2, sb3);
                                                                    if (b11 == null) {
                                                                        sb2 = null;
                                                                    } else if ("}".equals(b11) || ";".equals(b11)) {
                                                                        xVar2.N(i21);
                                                                        z15 = true;
                                                                    } else {
                                                                        sb4.append(b11);
                                                                    }
                                                                }
                                                            }
                                                            if (sb2 != null && !sb2.isEmpty()) {
                                                                int i22 = xVar2.b;
                                                                String b12 = i4.a.b(xVar2, sb3);
                                                                if (!";".equals(b12)) {
                                                                    if ("}".equals(b12)) {
                                                                        xVar2.N(i22);
                                                                    }
                                                                }
                                                                if ("color".equals(a2)) {
                                                                    i12 = 1;
                                                                    bVar.f = e2.h.a(sb2, true);
                                                                    bVar.g = true;
                                                                } else {
                                                                    i12 = 1;
                                                                    if ("background-color".equals(a2)) {
                                                                        bVar.h = e2.h.a(sb2, true);
                                                                        bVar.i = true;
                                                                    } else {
                                                                        if ("ruby-position".equals(a2)) {
                                                                            if ("over".equals(sb2)) {
                                                                                bVar.p = 1;
                                                                            } else if ("under".equals(sb2)) {
                                                                                bVar.p = 2;
                                                                                r12 = 1;
                                                                                z13 = r12;
                                                                                z12 = z14;
                                                                                z10 = false;
                                                                            }
                                                                        } else if ("text-combine-upright".equals(a2)) {
                                                                            bVar.q = "all".equals(sb2) || sb2.startsWith("digits");
                                                                        } else if ("text-decoration".equals(a2)) {
                                                                            if ("underline".equals(sb2)) {
                                                                                i12 = 1;
                                                                                bVar.k = 1;
                                                                            }
                                                                        } else if ("font-family".equals(a2)) {
                                                                            bVar.e = s6.c(sb2);
                                                                        } else if (!"font-weight".equals(a2)) {
                                                                            i12 = 1;
                                                                            if ("font-style".equals(a2)) {
                                                                                if ("italic".equals(sb2)) {
                                                                                    bVar.m = 1;
                                                                                }
                                                                            } else if ("font-size".equals(a2)) {
                                                                                ?? matcher2 = i4.a.d.matcher(s6.c(sb2));
                                                                                if (matcher2.matches()) {
                                                                                    String group2 = matcher2.group(2);
                                                                                    group2.getClass();
                                                                                    switch (group2.hashCode()) {
                                                                                        case 37:
                                                                                            if (group2.equals("%")) {
                                                                                                c10 = 0;
                                                                                                break;
                                                                                            }
                                                                                            break;
                                                                                        case 3240:
                                                                                            if (group2.equals("em")) {
                                                                                                c10 = 1;
                                                                                                break;
                                                                                            }
                                                                                            break;
                                                                                        case 3592:
                                                                                            if (group2.equals("px")) {
                                                                                                c10 = 2;
                                                                                                break;
                                                                                            }
                                                                                            break;
                                                                                    }
                                                                                    c10 = 65535;
                                                                                    switch (c10) {
                                                                                        case 0:
                                                                                            r12 = 1;
                                                                                            bVar.n = 3;
                                                                                            break;
                                                                                        case 1:
                                                                                            r12 = 1;
                                                                                            bVar.n = 2;
                                                                                            break;
                                                                                        case 2:
                                                                                            r12 = 1;
                                                                                            bVar.n = 1;
                                                                                            break;
                                                                                        default:
                                                                                            throw new IllegalStateException();
                                                                                    }
                                                                                    String group3 = matcher2.group(r12);
                                                                                    group3.getClass();
                                                                                    bVar.o = Float.parseFloat(group3);
                                                                                    z13 = r12;
                                                                                    z12 = z14;
                                                                                    z10 = false;
                                                                                } else {
                                                                                    e2.a.l("WebvttCssParser", "Invalid font-size: '" + sb2 + "'.");
                                                                                }
                                                                            }
                                                                        } else if ("bold".equals(sb2)) {
                                                                            i12 = 1;
                                                                            bVar.l = 1;
                                                                        }
                                                                        z13 = r12;
                                                                        z12 = z14;
                                                                        z10 = false;
                                                                    }
                                                                }
                                                                r12 = i12;
                                                                z13 = r12;
                                                                z12 = z14;
                                                                z10 = false;
                                                            }
                                                            r12 = 1;
                                                            z13 = r12;
                                                            z12 = z14;
                                                            z10 = false;
                                                        }
                                                    }
                                                    r12 = z13;
                                                    z13 = r12;
                                                    z12 = z14;
                                                    z10 = false;
                                                }
                                                boolean z16 = z13;
                                                if ("}".equals(str5)) {
                                                    arrayList3.add(bVar);
                                                }
                                                r92 = z16;
                                                z10 = false;
                                                i13 = -1;
                                                str2 = null;
                                            }
                                        }
                                    }
                                    str = str2;
                                    if (str == null) {
                                    }
                                }
                            } else if (c11 == 3) {
                                Pattern pattern = i4.h.a;
                                Charset charset = StandardCharsets.UTF_8;
                                String n11 = xVar.n(charset);
                                if (n11 == null) {
                                    cVar = null;
                                } else {
                                    Pattern pattern2 = i4.h.a;
                                    Matcher matcher3 = pattern2.matcher(n11);
                                    if (matcher3.matches()) {
                                        cVar = i4.h.d(null, matcher3, xVar, arrayList);
                                    } else {
                                        cVar = null;
                                        String n12 = xVar.n(charset);
                                        if (n12 != null) {
                                            Matcher matcher4 = pattern2.matcher(n12);
                                            if (matcher4.matches()) {
                                                cVar = i4.h.d(n11.trim(), matcher4, xVar, arrayList);
                                            }
                                        }
                                    }
                                }
                                if (cVar != null) {
                                    arrayList2.add(cVar);
                                }
                            }
                            sVar = this;
                        }
                    }
                }
            }
        } catch (x0 e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // g6.n
    public void v(String str, long j10, int i10, Object obj, long j11, long j12) {
        int i11;
        g6.m mVar = (g6.m) this.c;
        if (((g6.n) this.b) != null) {
            if (i10 == 2001) {
                Object[] objArr = {Integer.valueOf(mVar.i)};
                g6.b bVar = mVar.a;
                Log.w(bVar.a, bVar.d("Possibility of local queue out of sync with receiver queue. Refetching sequence number. Current Local Sequence Number = %d", objArr));
                Iterator it = ((e6.h) mVar.h.b).i.iterator();
                while (it.hasNext()) {
                    ((e6.g) it.next()).o();
                }
                i11 = 2001;
            } else {
                i11 = i10;
            }
            ((g6.n) this.b).v(str, j10, i11, obj, j11, j12);
        }
    }

    @Override // z3.n
    public /* synthetic */ z3.e w(int i10, int i11, byte[] bArr) {
        return t8.b.a(this, bArr, i11);
    }

    @Override // ef.b
    public ef.a x(qf.b bVar) {
        List list = (List) this.c;
        List list2 = (List) bVar.b;
        int size = list2 != null ? list2.size() : 0;
        if (size > 0) {
            ArrayList arrayList = new ArrayList(list.size() + size);
            arrayList.addAll(list);
            arrayList.addAll(list2);
            list = arrayList;
        }
        return new gd.i(bVar, (List) this.b, list);
    }

    public void y(Object obj) {
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new i0(this, obj, SystemClock.elapsedRealtime(), 0));
        }
    }

    public void z(l lVar, Handler handler) {
        n nVar = (n) this.b;
        synchronized (nVar.d) {
            nVar.l = lVar;
            nVar.a.setCallback(lVar.b, handler);
            lVar.C(nVar, handler);
        }
    }

    public /* synthetic */ s(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.b = obj;
    }

    public /* synthetic */ s(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = null;
    }

    public /* synthetic */ s(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    public s(IBinder iBinder) {
        this.a = 23;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (interfaceDescriptor != "android.os.IMessenger" && (interfaceDescriptor == null || !interfaceDescriptor.equals("android.os.IMessenger"))) {
            if (interfaceDescriptor != "com.google.android.gms.iid.IMessengerCompat" && (interfaceDescriptor == null || !interfaceDescriptor.equals("com.google.android.gms.iid.IMessengerCompat"))) {
                Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
                throw new RemoteException();
            }
            this.c = new j6.f(iBinder);
            this.b = null;
            return;
        }
        this.b = new Messenger(iBinder);
        this.c = null;
    }

    public s(m6.a aVar) {
        this.a = 15;
        this.b = aVar == null ? null : aVar.b;
    }

    public s(e2.k0 k0Var) {
        this.a = 22;
        this.b = k0Var;
        this.c = new e2.x();
    }

    public s(int i10) {
        this.a = i10;
        switch (i10) {
            case 5:
                break;
            case 12:
                this.b = new ConcurrentHashMap(16, 0.75f, 10);
                this.c = new ReferenceQueue();
                break;
            case 17:
                this.b = new HashMap();
                break;
            case 20:
                this.b = new HashMap();
                this.c = i2.c.b;
                break;
            case 21:
                this.b = new e2.x();
                this.c = new i4.a();
                break;
            case 28:
                this.b = new HashSet();
                break;
            case 29:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.b = byteArrayOutputStream;
                this.c = new DataOutputStream(byteArrayOutputStream);
                break;
            default:
                this.b = ByteBuffer.allocateDirect(500);
                break;
        }
    }

    @Override // ji.g1
    public /* synthetic */ void W() {
    }

    @Override // z3.n
    public /* synthetic */ void reset() {
    }

    public s(Handler handler, a3.m0 m0Var) {
        this.a = 2;
        if (m0Var != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.b = handler;
        this.c = m0Var;
    }

    public s(Animator animator) {
        this.a = 6;
        this.b = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.c = animatorSet;
        animatorSet.play(animator);
    }

    public s(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        this.a = 0;
        if (!TextUtils.isEmpty(str)) {
            if (componentName == null) {
                int i10 = u0.b;
                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                intent.setPackage(context.getPackageName());
                List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
                if (queryBroadcastReceivers.size() == 1) {
                    ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
                    componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
                } else {
                    if (queryBroadcastReceivers.size() > 1) {
                        e2.a.l("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
                    }
                    componentName = null;
                }
                if (componentName == null) {
                    e2.a.g("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
                }
            }
            if (componentName != null && pendingIntent == null) {
                Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
                intent2.setComponent(componentName);
                pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
            }
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 29) {
                this.b = new p(context, str, bundle);
            } else if (i11 >= 28) {
                this.b = new o(context, str, bundle);
            } else {
                this.b = new n(context, str, bundle);
            }
            Looper myLooper = Looper.myLooper();
            z(new j(), new Handler(myLooper == null ? Looper.getMainLooper() : myLooper));
            ((n) this.b).a.setMediaButtonReceiver(pendingIntent);
            r rVar = ((n) this.b).c;
            w wVar = new w();
            DesugarCollections.synchronizedSet(new HashSet());
            if (Build.VERSION.SDK_INT >= 29) {
                wVar.a = new g(context, rVar);
            } else {
                wVar.a = new f(context, rVar);
            }
            this.c = wVar;
            return;
        }
        throw new IllegalArgumentException("tag must not be null or empty");
    }

    public s(w2 w2Var) {
        this.a = 8;
        this.b = w2Var;
        this.c = new AtomicBoolean(false);
    }
}
