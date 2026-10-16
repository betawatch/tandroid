package n4;

import ab.a0;
import ab.c0;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.net.Uri;
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
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import e2.m0;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
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
import ji.j0;
import ji.k0;
import m.h3;
import org.telegram.ui.Cells.o9;
import p4.u0;
import r0.i0;
import r0.l0;
import v7.s6;
import v7.u6;
import w7.a9;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class s implements ee.b, d9.k, g6.n, ef.b, z3.n, c3.i, g1, e2.d {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ s(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    public static String I(s sVar) {
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

    public static void h(s sVar, i2.c cVar) {
        sVar.getClass();
        for (Map.Entry entry : new HashMap((HashMap) sVar.b).entrySet()) {
            if (entry.getKey() != null) {
                throw new ClassCastException();
            }
            List list = (List) entry.getValue();
            if (!i(cVar, list).equals(i((i2.c) sVar.c, list))) {
                throw null;
            }
        }
        sVar.c = cVar;
    }

    public static i2.c i(i2.c cVar, List list) {
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

    @Override // g6.n
    public void A(String str, long j10, int i10, Object obj, long j11, long j12) {
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
            ((g6.n) this.b).A(str, j10, i11, obj, j11, j12);
        }
    }

    public void B(l lVar, Handler handler) {
        n nVar = (n) this.b;
        synchronized (nVar.d) {
            nVar.l = lVar;
            nVar.a.setCallback(lVar.b, handler);
            lVar.C(nVar, handler);
        }
    }

    @Override // ji.g1
    public void C(Editable editable) {
        ((k0) this.c).i();
        ((j0) this.b).C0();
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.AbstractCollection, java.util.List] */
    public void D(y yVar) {
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

    @Override // ji.g1
    public /* synthetic */ boolean E(boolean z10) {
        return false;
    }

    @Override // ef.b
    public ef.a F(qf.b bVar) {
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

    public void G(ArrayList arrayList) {
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

    public void H(b2 b2Var) {
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new a1.f(4, this, b2Var));
        }
    }

    @Override // z3.n
    public int X() {
        return 1;
    }

    @Override // ji.g1
    public void a(h1 h1Var) {
        ((j0) this.b).a(h1Var);
    }

    @Override // d9.k
    public Object apply(Object obj) {
        return ((d9.k) ((a4.l) this.b).b).apply(obj);
    }

    @Override // c3.i
    public c3.h b(c3.p pVar, long j10) {
        long position = pVar.getPosition();
        int min = (int) Math.min(20000L, pVar.getLength() - position);
        e2.x xVar = (e2.x) this.c;
        xVar.K(min);
        pVar.b(0, min, xVar.a);
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

    @Override // ji.g1
    public boolean d() {
        return ((j0) this.b).p0();
    }

    @Override // ji.g1
    public /* synthetic */ boolean e(h1 h1Var) {
        return false;
    }

    @Override // ji.g1
    public void f(int i10, int i11) {
        ((j0) this.b).t0(i10, i11);
    }

    @Override // ee.b
    public Object g(ee.c cVar, md.c cVar2) {
        Object g10 = ((qf.b) this.b).g(new a0(cVar, (c0) this.c), cVar2);
        return g10 == ld.a.a ? g10 : id.i.a;
    }

    public void j(i2.e eVar) {
        synchronized (eVar) {
        }
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new a3.k0(this, eVar, 1));
        }
    }

    @Override // g6.n
    public void k(String str, long j10, long j11, long j12) {
        g6.n nVar = (g6.n) this.b;
        if (nVar != null) {
            nVar.k(str, j10, j11, j12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CctBackendFactory l(String str) {
        Bundle bundle;
        Map map;
        PackageManager packageManager;
        if (((Map) this.c) == null) {
            Context context = (Context) this.b;
            try {
                packageManager = context.getPackageManager();
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
            }
            if (packageManager == null) {
                Log.w("BackendRegistry", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                if (serviceInfo == null) {
                    Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                    if (bundle != null) {
                        Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                        map = Collections.EMPTY_MAP;
                    } else {
                        HashMap hashMap = new HashMap();
                        for (String str2 : bundle.keySet()) {
                            Object obj = bundle.get(str2);
                            if ((obj instanceof String) && str2.startsWith("backend:")) {
                                for (String str3 : ((String) obj).split(",", -1)) {
                                    String trim = str3.trim();
                                    if (!trim.isEmpty()) {
                                        hashMap.put(trim, str2.substring(8));
                                    }
                                }
                            }
                        }
                        map = hashMap;
                    }
                    this.c = map;
                }
            }
            bundle = null;
            if (bundle != null) {
            }
            this.c = map;
        }
        String str4 = (String) ((Map) this.c).get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e) {
            Log.w("BackendRegistry", "Class " + str4 + " is not found.", e);
            return null;
        } catch (IllegalAccessException e7) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e7);
            return null;
        } catch (InstantiationException e10) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e10);
            return null;
        } catch (NoSuchMethodException e11) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e11);
            return null;
        } catch (InvocationTargetException e12) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e12);
            return null;
        }
    }

    @Override // ji.g1
    public /* synthetic */ boolean m(h1 h1Var) {
        return false;
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
    public void m0(byte[] bArr, int i10, int i11, z3.m mVar, e2.j jVar) {
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

    public ec.b n() {
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

    @Override // e2.d
    public j9.y o(s0 s0Var) {
        Uri uri;
        byte[] bArr;
        h3 h3Var = (h3) this.c;
        if (h3Var != null && (((uri = (Uri) h3Var.c) != null && uri.equals(s0Var.n)) || ((bArr = (byte[]) h3Var.b) != null && Arrays.equals(bArr, s0Var.k)))) {
            j9.y yVar = (j9.y) ((h3) this.c).d;
            yVar.getClass();
            return yVar;
        }
        j9.y o10 = ((e2.d) this.b).o(s0Var);
        if (o10 == null) {
            return null;
        }
        this.c = new h3(s0Var, o10);
        return o10;
    }

    public c3.o p(Object... objArr) {
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

    @Override // ji.g1
    public void q(h1 h1Var, int i10, int i11) {
        o9 W;
        j0 j0Var = (j0) this.b;
        if (((k0) this.c).d || i10 == i11 || (W = j0Var.W()) == null) {
            return;
        }
        if (W.x() && W.W == j0Var.g0()) {
            return;
        }
        h1Var.post(new h0(this, h1Var, i11, W, j0Var, i10));
    }

    public synchronized Map s() {
        try {
            if (((Map) this.c) == null) {
                this.c = DesugarCollections.unmodifiableMap(new HashMap((HashMap) this.b));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (Map) this.c;
    }

    public void t(k.a aVar) {
        pi.e eVar = (pi.e) this.b;
        ((ActionMode.Callback) eVar.a).onDestroyActionMode(eVar.k(aVar));
        g.r rVar = (g.r) this.c;
        if (rVar.E != null) {
            rVar.f.getDecorView().removeCallbacks(rVar.F);
        }
        if (rVar.y != null) {
            l0 l0Var = rVar.G;
            if (l0Var != null) {
                l0Var.b();
            }
            l0 a2 = i0.a(rVar.y);
            a2.a(0.0f);
            rVar.G = a2;
            a2.d(new g.i(this, 2));
        }
        rVar.x = null;
        ViewGroup viewGroup = rVar.J;
        WeakHashMap weakHashMap = i0.a;
        r0.y.c(viewGroup);
        rVar.y();
    }

    public String toString() {
        switch (this.a) {
            case 13:
                try {
                    return n().toString();
                } catch (dc.e unused) {
                    return "";
                }
            default:
                return super.toString();
        }
    }

    @Override // e2.d
    public j9.y u(byte[] bArr) {
        byte[] bArr2;
        h3 h3Var = (h3) this.c;
        if (h3Var == null || (bArr2 = (byte[]) h3Var.b) == null || !Arrays.equals(bArr2, bArr)) {
            j9.y u10 = ((e2.d) this.b).u(bArr);
            this.c = new h3(bArr, u10);
            return u10;
        }
        j9.y yVar = (j9.y) ((h3) this.c).d;
        yVar.getClass();
        return yVar;
    }

    public boolean v(k.a aVar, Menu menu) {
        ViewGroup viewGroup = ((g.r) this.c).J;
        WeakHashMap weakHashMap = i0.a;
        r0.y.c(viewGroup);
        pi.e eVar = (pi.e) this.b;
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

    public void w(Object obj) {
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new a3.i0(this, obj, SystemClock.elapsedRealtime(), 0));
        }
    }

    @Override // z3.n
    public /* synthetic */ z3.e x(int i10, int i11, byte[] bArr) {
        return t8.b.a(this, bArr, i11);
    }

    @Override // ji.g1
    public void y(CharSequence charSequence) {
        ((j0) this.b).a0(charSequence);
    }

    @Override // ji.g1
    public void z(h1 h1Var) {
        ((j0) this.b).h();
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
            default:
                this.b = ByteBuffer.allocateDirect(500);
                break;
        }
    }

    @Override // ji.g1
    public /* synthetic */ void r() {
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
            B(new j(), new Handler(myLooper == null ? Looper.getMainLooper() : myLooper));
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
