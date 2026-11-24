// default package

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.CountDownLatch;
import java.util.zip.Inflater;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class e7a implements ts4, km7, vcb, z99 {
    public static e7a e;
    public static final String[] f = {"Connection", "Upgrade"};
    public static final String[] h = {"Upgrade", "websocket"};
    public static final String[] n = {"Sec-WebSocket-Version", "13"};
    public Object a;
    public Object b;
    public Object c;
    public Object d;

    public e7a(Typeface typeface, rf7 rf7Var) {
        int i;
        int i2;
        int i3;
        int i4;
        this.d = typeface;
        this.a = rf7Var;
        this.c = new tf7(1024);
        int a = rf7Var.a(6);
        if (a != 0) {
            int i5 = a + rf7Var.a;
            i = rf7Var.b.getInt(rf7Var.b.getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.b = new char[i << 1];
        int a2 = rf7Var.a(6);
        if (a2 != 0) {
            int i6 = a2 + rf7Var.a;
            i2 = rf7Var.b.getInt(rf7Var.b.getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            fy3 fy3Var = new fy3(this, i7);
            qf7 b = fy3Var.b();
            int a3 = b.a(4);
            Character.toChars(a3 != 0 ? b.b.getInt(a3 + b.a) : 0, (char[]) this.b, i7 << 1);
            qf7 b2 = fy3Var.b();
            int a4 = b2.a(16);
            if (a4 != 0) {
                int i8 = a4 + b2.a;
                i3 = b2.b.getInt(b2.b.getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            if (!(i3 > 0)) {
                u36.j("invalid metadata codepoint length");
                throw null;
            }
            tf7 tf7Var = (tf7) this.c;
            qf7 b3 = fy3Var.b();
            int a5 = b3.a(16);
            if (a5 != 0) {
                int i9 = a5 + b3.a;
                i4 = b3.b.getInt(b3.b.getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            tf7Var.a(fy3Var, 0, i4 - 1);
        }
    }

    public static void E(long j, HashMap hashMap) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            hashMap.remove(arrayList.get(i));
        }
    }

    public static synchronized e7a v() {
        e7a e7aVar;
        synchronized (e7a.class) {
            e7aVar = e;
            if (e7aVar == null) {
                e7aVar = new e7a((byte) 0);
                e = e7aVar;
            }
        }
        return e7aVar;
    }

    public final void A() {
        long uptimeMillis = SystemClock.uptimeMillis();
        Iterator it = ((LinkedHashMap) this.d).values().iterator();
        while (it.hasNext()) {
            m((long[]) it.next(), uptimeMillis);
        }
        this.d = new LinkedHashMap();
    }

    public final boolean B(f9 f9Var, MenuItem menuItem) {
        return ((ActionMode.Callback) this.a).onActionItemClicked(q(f9Var), new g27((Context) this.b, (aeb) menuItem));
    }

    public final boolean C(f9 f9Var, y17 y17Var) {
        ActionMode.Callback callback = (ActionMode.Callback) this.a;
        vdb q = q(f9Var);
        cka ckaVar = (cka) this.d;
        Menu menu = (Menu) ckaVar.get(y17Var);
        if (menu == null) {
            menu = new w27((Context) this.b, y17Var);
            ckaVar.put(y17Var, menu);
        }
        return callback.onCreateActionMode(q, menu);
    }

    public final bq3 D(String str) {
        if (str == null) {
            gxc.d("input must not be null");
            return null;
        }
        fq3 fq3Var = new fq3((ArrayList) this.a, (rp5) this.c, (ArrayList) this.b);
        int i = 0;
        while (true) {
            int length = str.length();
            int i2 = i;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                }
                char charAt = str.charAt(i2);
                if (charAt == '\n' || charAt == '\r') {
                    break;
                }
                i2++;
            }
            if (i2 == -1) {
                break;
            }
            fq3Var.i(str.substring(i, i2));
            i = i2 + 1;
            if (i < str.length() && str.charAt(i2) == '\r' && str.charAt(i) == '\n') {
                i = i2 + 2;
            }
        }
        if (str.length() > 0 && (i == 0 || i < str.length())) {
            fq3Var.i(str.substring(i));
        }
        fq3Var.f(fq3Var.n);
        qp5 f1 = fq3Var.j.f1(new wm4((Object) fq3Var.k, (Object) fq3Var.m, (byte) 5));
        Iterator it = fq3Var.o.iterator();
        while (it.hasNext()) {
            ((x1) it.next()).g(f1);
        }
        bq3 bq3Var = (bq3) fq3Var.l.b;
        Iterator it2 = ((ArrayList) this.d).iterator();
        if (it2.hasNext()) {
            throw kt6.l(it2);
        }
        return bq3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x005f, code lost:
    
        if (r9.d(r0) != r6) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071 A[Catch: all -> 0x008d, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x008d, blocks: (B:25:0x0061, B:29:0x0071), top: B:24:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object F(qx2 qx2Var) {
        gq9 gq9Var;
        int i;
        qj7 qj7Var;
        Throwable th;
        qj7 qj7Var2;
        e7a e7aVar;
        try {
            if (qx2Var instanceof gq9) {
                gq9Var = (gq9) qx2Var;
                int i2 = gq9Var.e;
                if ((i2 & TLObject.FLAG_31) != 0) {
                    gq9Var.e = i2 - TLObject.FLAG_31;
                    Object obj = gq9Var.c;
                    i = gq9Var.e;
                    g7c g7cVar = g7c.a;
                    ly2 ly2Var = ly2.a;
                    if (i != 0) {
                        tue.b(obj);
                        if (!(((nq2) this.b).v() instanceof ep5)) {
                            return g7cVar;
                        }
                        qj7Var = (qj7) this.a;
                        gq9Var.a = this;
                        gq9Var.b = qj7Var;
                        gq9Var.e = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                dq9.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qj7Var2 = gq9Var.b;
                            e7aVar = gq9Var.a;
                            try {
                                tue.b(obj);
                                ((nq2) e7aVar.b).B(g7cVar);
                                qj7Var2.f(null);
                                return g7cVar;
                            } catch (Throwable th2) {
                                th = th2;
                                qj7Var2.f(null);
                                throw th;
                            }
                        }
                        qj7 qj7Var3 = gq9Var.b;
                        e7a e7aVar2 = gq9Var.a;
                        tue.b(obj);
                        qj7Var = qj7Var3;
                        this = e7aVar2;
                    }
                    if (((nq2) this.b).v() instanceof ep5) {
                        qj7Var.f(null);
                        return g7cVar;
                    }
                    gq9Var.a = this;
                    gq9Var.b = qj7Var;
                    gq9Var.e = 2;
                    if (this.l(gq9Var) != ly2Var) {
                        e7aVar = this;
                        qj7Var2 = qj7Var;
                        ((nq2) e7aVar.b).B(g7cVar);
                        qj7Var2.f(null);
                        return g7cVar;
                    }
                    return ly2Var;
                }
            }
            if (((nq2) this.b).v() instanceof ep5) {
            }
        } catch (Throwable th3) {
            qj7 qj7Var4 = qj7Var;
            th = th3;
            qj7Var2 = qj7Var4;
            qj7Var2.f(null);
            throw th;
        }
        gq9Var = new gq9(this, qx2Var);
        Object obj2 = gq9Var.c;
        i = gq9Var.e;
        g7c g7cVar2 = g7c.a;
        ly2 ly2Var2 = ly2.a;
        if (i != 0) {
        }
    }

    public final wh0 G(List list) {
        wh0 wh0Var;
        HashMap hashMap = (HashMap) this.c;
        ArrayList h2 = h(list);
        if (h2.size() < 2) {
            return (wh0) lne.a(h2, null);
        }
        Collections.sort(h2, new sa((byte) 8));
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = ((wh0) h2.get(0)).c;
        int i3 = 0;
        while (true) {
            if (i3 >= h2.size()) {
                break;
            }
            wh0 wh0Var2 = (wh0) h2.get(i3);
            if (i2 == wh0Var2.c) {
                arrayList.add(new Pair(wh0Var2.b, Integer.valueOf(wh0Var2.d)));
                i3++;
            } else if (arrayList.size() == 1) {
                return (wh0) h2.get(0);
            }
        }
        wh0 wh0Var3 = (wh0) hashMap.get(arrayList);
        if (wh0Var3 != null) {
            return wh0Var3;
        }
        List subList = h2.subList(0, arrayList.size());
        int i4 = 0;
        for (int i5 = 0; i5 < subList.size(); i5++) {
            i4 += ((wh0) subList.get(i5)).d;
        }
        int nextInt = ((Random) this.d).nextInt(i4);
        int i6 = 0;
        while (true) {
            if (i >= subList.size()) {
                wh0Var = (wh0) lne.b(subList);
                break;
            }
            wh0Var = (wh0) subList.get(i);
            i6 += wh0Var.d;
            if (nextInt < i6) {
                break;
            }
            i++;
        }
        hashMap.put(arrayList, wh0Var);
        return wh0Var;
    }

    public final synchronized void H(Exception exc) {
        CountDownLatch countDownLatch = (CountDownLatch) this.a;
        if (countDownLatch == null || ((ArrayList) this.b) == null) {
            throw new IllegalStateException("Cannot set exception before awaiting!");
        }
        if (((Exception) this.d) == null) {
            this.d = exc;
        }
        countDownLatch.countDown();
    }

    public final Bundle I(String str, Bundle bundle) {
        HashMap hashMap = (HashMap) this.c;
        return bundle != null ? (Bundle) hashMap.put(str, bundle) : (Bundle) hashMap.remove(str);
    }

    public final synchronized void J(fma fmaVar, Socket socket) {
        ArrayList arrayList;
        if (((CountDownLatch) this.a) == null || (arrayList = (ArrayList) this.b) == null) {
            throw new IllegalStateException("Cannot set socket before awaiting!");
        }
        if (((Socket) this.c) == null) {
            this.c = socket;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                fma fmaVar2 = (fma) obj;
                if (fmaVar2 != fmaVar) {
                    fmaVar2.a(new InterruptedException());
                    fmaVar2.interrupt();
                }
            }
        } else {
            try {
                socket.close();
            } catch (IOException unused) {
            }
        }
        ((CountDownLatch) this.a).countDown();
    }

    @Override // km7
    public final void a() {
        jj7 jj7Var = (jj7) this.c;
        if (((jm7) this.b) == null) {
            return;
        }
        e7a e7aVar = (e7a) this.d;
        if (e7aVar != null) {
            e7aVar.a();
            this.d = null;
        }
        int i = jj7Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            nm7 nm7Var = (nm7) this.a;
            jm7 jm7Var = (jm7) this.b;
            if (i2 < 0 || i2 >= jj7Var.b) {
                u36.h(jj7Var.b - 1, hg9.l(i2, "Index ", " must be in 0.."));
                return;
            }
            nm7Var.n(jm7Var, jj7Var.a[i2]);
        }
        jj7Var.b = 0;
        this.a = null;
        this.b = null;
    }

    public final e7a b(int i) {
        if (((jm7) this.b) == null) {
            return this;
        }
        jj7 jj7Var = (jj7) this.c;
        int i2 = jj7Var.b + 1;
        int[] iArr = jj7Var.a;
        if (iArr.length < i2) {
            iArr = Arrays.copyOf(iArr, Math.max(i2, (iArr.length * 3) / 2));
            jj7Var.a = iArr;
        }
        int i3 = jj7Var.b;
        iArr[i3] = i;
        jj7Var.b = i3 + 1;
        ((nm7) this.a).a((jm7) this.b, i);
        return this;
    }

    public final void c(dp4 dp4Var) {
        if (((ArrayList) this.a).contains(dp4Var)) {
            zo4.j(dp4Var, "Fragment already added: ");
            return;
        }
        synchronized (((ArrayList) this.a)) {
            ((ArrayList) this.a).add(dp4Var);
        }
        dp4Var.w = true;
    }

    @Override // z99
    public final void d() {
        gm.d3(new u99((d) this.a, (Context) this.b, (ylb) this.c, (il9) this.d, (byte) 2), 200L);
    }

    public final e7a e(int i) {
        if (((jm7) this.b) == null) {
            return this;
        }
        e7a e7aVar = (e7a) this.d;
        if (e7aVar == null) {
            e7aVar = new e7a(nm7.e(), (jm7) this.b);
            this.d = e7aVar;
        }
        e7aVar.b(i);
        return this;
    }

    @Override // z99
    public final void f() {
        gm.d3(new ey8((d) this.a, (il9) this.d, (byte) 16), 200L);
    }

    @Override // vcb
    public final /* synthetic */ lcb g(int i, int i2, byte[] bArr) {
        return hg9.c(this, bArr, i2);
    }

    public final ArrayList h(List list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = (HashMap) this.a;
        E(elapsedRealtime, hashMap);
        HashMap hashMap2 = (HashMap) this.b;
        E(elapsedRealtime, hashMap2);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            wh0 wh0Var = (wh0) list.get(i);
            if (!hashMap.containsKey(wh0Var.b) && !hashMap2.containsKey(Integer.valueOf(wh0Var.c))) {
                arrayList.add(wh0Var);
            }
        }
        return arrayList;
    }

    @Override // z99
    public final void i() {
        d dVar = (d) this.a;
        dVar.showDialog(new kj8(dVar, 3, true));
    }

    @Override // ts4
    public final void j(Throwable th) {
        ((oz6) this.d).c.remove((sw6) this.a);
        zve.a((dk5) this.c);
    }

    public final r40 k() {
        rz6 rz6Var;
        if (!((bqb) this.c).p() && (rz6Var = (rz6) this.d) != null) {
            jte.f(((bqb) this.c).b(rz6Var.a) != -1);
        }
        return new r40(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        if (r7 != r2) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        if (r7 == r2) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(qx2 qx2Var) {
        i83 i83Var;
        int i;
        e73 e73Var;
        h93 h93Var = (h93) this.d;
        if (qx2Var instanceof i83) {
            i83Var = (i83) qx2Var;
            int i2 = i83Var.d;
            if ((i2 & TLObject.FLAG_31) != 0) {
                i83Var.d = i2 - TLObject.FLAG_31;
                Object obj = i83Var.b;
                i = i83Var.d;
                if (i != 0) {
                    tue.b(obj);
                    List list = (List) this.c;
                    ly2 ly2Var = ly2.a;
                    if (list == null || list.isEmpty()) {
                        i83Var.a = this;
                        i83Var.d = 1;
                        obj = h93Var.h(false, i83Var);
                    } else {
                        kr5 c = h93Var.c();
                        l83 l83Var = new l83(h93Var, this, null);
                        i83Var.a = this;
                        i83Var.d = 2;
                        obj = c.c(l83Var, i83Var);
                    }
                    return ly2Var;
                }
                if (i == 1) {
                    this = i83Var.a;
                    tue.b(obj);
                    e73Var = (e73) obj;
                } else {
                    if (i != 2) {
                        dq9.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = i83Var.a;
                    tue.b(obj);
                    e73Var = (e73) obj;
                }
                ((h93) this.d).h.F(e73Var);
                return g7c.a;
            }
        }
        i83Var = new i83(this, qx2Var);
        Object obj2 = i83Var.b;
        i = i83Var.d;
        if (i != 0) {
        }
        ((h93) this.d).h.F(e73Var);
        return g7c.a;
    }

    public final void m(long[] jArr, long j) {
        if (j - jArr[3] >= 2000) {
            HashSet hashSet = (HashSet) this.b;
            StringBuilder sb = new StringBuilder();
            byte b = 0;
            sb.append(jArr[0]);
            sb.append(":");
            sb.append(jArr[1]);
            if (hashSet.add(sb.toString())) {
                pg pgVar = (pg) this.c;
                long j2 = jArr[0];
                int i = (int) jArr[1];
                long j3 = jArr[3];
                int i2 = pgVar.b;
                TLRPC.Chat L0 = oc7.r1(i2).L0(Long.valueOf(-j2));
                la4 la4Var = new la4(j2, (L0 == null || L0.min) ? 0L : L0.access_hash, i, "list_view", null, "chat_list", null, ia4.d(i2) - ((int) ((SystemClock.uptimeMillis() - j3) / 1000)), Utilities.b.nextLong());
                la4Var.i = Integer.valueOf((int) (j - j3));
                String f2 = ia4.f(i2);
                if (f2 != null) {
                    ia4.d.postRunnable(new ba4(f2, la4Var, b));
                }
            }
        }
    }

    public final dp4 n(String str) {
        uq4 uq4Var = (uq4) ((HashMap) this.b).get(str);
        if (uq4Var != null) {
            return uq4Var.c;
        }
        return null;
    }

    public final dp4 o(String str) {
        for (uq4 uq4Var : ((HashMap) this.b).values()) {
            if (uq4Var != null) {
                dp4 dp4Var = uq4Var.c;
                if (!str.equals(dp4Var.e)) {
                    dp4Var = dp4Var.M.c.o(str);
                }
                if (dp4Var != null) {
                    return dp4Var;
                }
            }
        }
        return null;
    }

    @Override // ts4
    public final void onSuccess(Object obj) {
        qw6 qw6Var = (qw6) obj;
        dk5 dk5Var = (dk5) this.c;
        tx6 tx6Var = (tx6) this.b;
        oz6 oz6Var = (oz6) this.d;
        CopyOnWriteArraySet copyOnWriteArraySet = oz6Var.c;
        mx6 mx6Var = oz6Var.b;
        sw6 sw6Var = (sw6) this.a;
        copyOnWriteArraySet.remove(sw6Var);
        boolean z = false;
        try {
            if (!tx6Var.i()) {
                hz6 hz6Var = (hz6) sw6Var.e;
                hz6Var.getClass();
                IBinder asBinder = hz6Var.a.asBinder();
                qw6Var.getClass();
                if (mx6Var.X(sw6Var)) {
                    ncd.f("MediaSessionStub", "Controller " + sw6Var + " has sent connection request multiple times");
                }
                mx6Var.b(asBinder, sw6Var, qw6Var.a, qw6Var.b);
                uz0 R = mx6Var.R(sw6Var);
                if (R == null) {
                    ncd.f("MediaSessionStub", "Ignoring connection request from unknown controller info");
                } else {
                    tx6Var.t();
                    cf8 cf8Var = tx6Var.t;
                    ye8 ye8Var = tx6Var.s;
                    tx6Var.t();
                    ne8 ne8Var = qw6Var.b;
                    ye8 a0 = oz6Var.a0(oz6Var.b0(ye8Var));
                    if (mx6Var.X(sw6Var)) {
                        bqb bqbVar = a0.j;
                        g0c g0cVar = a0.F;
                        mx6Var.C0();
                        mt2 mt2Var = (mt2) ((qt) mx6Var.c).get(sw6Var);
                        if (mt2Var != null) {
                            mt2Var.h = bqbVar;
                            mt2Var.i = g0cVar;
                        }
                    }
                    MediaSession.Token token = ((bx6) tx6Var.h.p.b).c.b;
                    tx6Var.t();
                    mo5 mo5Var = qw6Var.c;
                    if (mo5Var == null) {
                        tx6Var.t();
                        mo5Var = tx6Var.y;
                    }
                    mo5 mo5Var2 = qw6Var.d;
                    if (mo5Var2 == null) {
                        tx6Var.t();
                        mo5Var2 = tx6Var.z;
                    }
                    tx6Var.t();
                    mo5 mo5Var3 = mo5Var;
                    y79 y79Var = tx6Var.r;
                    mo5 mo5Var4 = mo5Var2;
                    s7a s7aVar = qw6Var.a;
                    ne8 q = cf8Var.q();
                    Bundle bundle = new Bundle(tx6Var.j.a.d);
                    Bundle bundle2 = qw6Var.e;
                    if (bundle2 == null) {
                        tx6Var.t();
                        bundle2 = tx6Var.A;
                    }
                    pt2 pt2Var = new pt2(oz6Var, mo5Var3, mo5Var4, y79Var, s7aVar, ne8Var, q, bundle, bundle2, a0, token);
                    if (!tx6Var.i()) {
                        try {
                            ((ck5) dk5Var).a(R.d(), pt2Var.a(sw6Var.c));
                            z = true;
                        } catch (RemoteException unused) {
                        }
                        if (!z) {
                            zve.a(dk5Var);
                            return;
                        } else {
                            if (tx6Var.x && tx6.j(sw6Var)) {
                                return;
                            }
                            tx6Var.e.getClass();
                            return;
                        }
                    }
                }
            }
            zve.a(dk5Var);
        } catch (Throwable th) {
            if (0 == 0) {
                zve.a(dk5Var);
            }
            throw th;
        }
    }

    @Override // vcb
    public final void p(byte[] bArr, int i, int i2, ucb ucbVar, fu2 fu2Var) {
        f53 f53Var;
        int i3;
        int i4;
        int i5;
        int D;
        q58 q58Var = (q58) this.c;
        int[] iArr = q58Var.b;
        yw7 yw7Var = q58Var.a;
        yw7 yw7Var2 = (yw7) this.b;
        yw7 yw7Var3 = (yw7) this.a;
        yw7Var3.L(i + i2, bArr);
        yw7Var3.N(i);
        Inflater inflater = (Inflater) this.d;
        if (inflater == null) {
            inflater = new Inflater();
            this.d = inflater;
        }
        if (hac.R(yw7Var3, yw7Var2, inflater)) {
            yw7Var3.L(yw7Var2.c, yw7Var2.a);
        }
        int i6 = 0;
        q58Var.d = 0;
        q58Var.e = 0;
        q58Var.f = 0;
        q58Var.g = 0;
        q58Var.h = 0;
        q58Var.i = 0;
        yw7Var.K(0);
        q58Var.c = false;
        ArrayList arrayList = new ArrayList();
        while (yw7Var3.a() >= 3) {
            int i7 = yw7Var3.c;
            int A = yw7Var3.A();
            int H = yw7Var3.H();
            int i8 = yw7Var3.b + H;
            if (i8 > i7) {
                yw7Var3.N(i7);
                i3 = i6;
                f53Var = null;
            } else {
                char c = 128;
                if (A != 128) {
                    switch (A) {
                        case 20:
                            if (H % 5 == 2) {
                                yw7Var3.O(2);
                                Arrays.fill(iArr, i6);
                                int i9 = H / 5;
                                int i10 = i6;
                                while (i10 < i9) {
                                    int A2 = yw7Var3.A();
                                    char c2 = c;
                                    double A3 = yw7Var3.A();
                                    double A4 = yw7Var3.A() - 128;
                                    double A5 = yw7Var3.A() - 128;
                                    iArr[A2] = (yw7Var3.A() << 24) | (hac.i((int) ((1.402d * A4) + A3), 0, nm7.d4) << 16) | (hac.i((int) ((A3 - (0.34414d * A5)) - (A4 * 0.71414d)), 0, nm7.d4) << 8) | hac.i((int) ((A5 * 1.772d) + A3), 0, nm7.d4);
                                    i10++;
                                    c = c2;
                                    q58Var = q58Var;
                                }
                                q58Var.c = true;
                                break;
                            }
                            break;
                        case 21:
                            if (H >= 4) {
                                yw7Var3.O(3);
                                int i11 = H - 4;
                                if (((yw7Var3.A() & 128) != 0 ? 1 : i6) != 0) {
                                    if (i11 >= 7 && (D = yw7Var3.D()) >= 4) {
                                        q58Var.h = yw7Var3.H();
                                        q58Var.i = yw7Var3.H();
                                        yw7Var.K(D - 4);
                                        i11 = H - 11;
                                    }
                                }
                                int i12 = yw7Var.b;
                                int i13 = yw7Var.c;
                                if (i12 < i13 && i11 > 0) {
                                    int min = Math.min(i11, i13 - i12);
                                    yw7Var3.k(i12, min, yw7Var.a);
                                    yw7Var.N(i12 + min);
                                    break;
                                }
                            }
                            break;
                        case 22:
                            if (H >= 19) {
                                q58Var.d = yw7Var3.H();
                                q58Var.e = yw7Var3.H();
                                yw7Var3.O(11);
                                q58Var.f = yw7Var3.H();
                                q58Var.g = yw7Var3.H();
                                break;
                            }
                            break;
                    }
                    f53Var = null;
                    i3 = 0;
                } else {
                    if (q58Var.d == 0 || q58Var.e == 0 || q58Var.h == 0 || q58Var.i == 0 || (i4 = yw7Var.c) == 0 || yw7Var.b != i4 || !q58Var.c) {
                        f53Var = null;
                    } else {
                        yw7Var.N(0);
                        int i14 = q58Var.h * q58Var.i;
                        int[] iArr2 = new int[i14];
                        int i15 = 0;
                        while (i15 < i14) {
                            int A6 = yw7Var.A();
                            if (A6 != 0) {
                                i5 = i15 + 1;
                                iArr2[i15] = iArr[A6];
                            } else {
                                int A7 = yw7Var.A();
                                if (A7 != 0) {
                                    i5 = ((A7 & 64) == 0 ? A7 & 63 : ((A7 & 63) << 8) | yw7Var.A()) + i15;
                                    Arrays.fill(iArr2, i15, i5, (A7 & 128) == 0 ? iArr[0] : iArr[yw7Var.A()]);
                                }
                            }
                            i15 = i5;
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(iArr2, q58Var.h, q58Var.i, Bitmap.Config.ARGB_8888);
                        float f2 = q58Var.f;
                        float f3 = q58Var.d;
                        float f4 = f2 / f3;
                        float f5 = q58Var.g;
                        float f6 = q58Var.e;
                        f53Var = new f53(null, null, null, createBitmap, f5 / f6, 0, 0, f4, 0, TLObject.FLAG_31, -3.4028235E38f, q58Var.h / f3, q58Var.i / f6, false, -16777216, TLObject.FLAG_31, 0.0f, 0);
                    }
                    i3 = 0;
                    q58Var.d = 0;
                    q58Var.e = 0;
                    q58Var.f = 0;
                    q58Var.g = 0;
                    q58Var.h = 0;
                    q58Var.i = 0;
                    yw7Var.K(0);
                    q58Var.c = false;
                }
                yw7Var3.N(i8);
            }
            if (f53Var != null) {
                arrayList.add(f53Var);
            }
            i6 = i3;
        }
        fu2Var.accept(new i53(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    public final vdb q(f9 f9Var) {
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            vdb vdbVar = (vdb) arrayList.get(i);
            if (vdbVar != null && vdbVar.b == f9Var) {
                return vdbVar;
            }
        }
        vdb vdbVar2 = new vdb((Context) this.b, f9Var);
        arrayList.add(vdbVar2);
        return vdbVar2;
    }

    @Override // vcb
    public final int r() {
        return 2;
    }

    public final ArrayList s() {
        ArrayList arrayList = new ArrayList();
        for (uq4 uq4Var : ((HashMap) this.b).values()) {
            if (uq4Var != null) {
                arrayList.add(uq4Var);
            }
        }
        return arrayList;
    }

    public final ArrayList t() {
        ArrayList arrayList = new ArrayList();
        for (uq4 uq4Var : ((HashMap) this.b).values()) {
            if (uq4Var != null) {
                arrayList.add(uq4Var.c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public final List u() {
        ArrayList arrayList;
        if (((ArrayList) this.a).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.a)) {
            arrayList = new ArrayList((ArrayList) this.a);
        }
        return arrayList;
    }

    public final boolean w(Context context) {
        if (((Boolean) this.c) == null) {
            this.c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.b).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.c).booleanValue();
    }

    public final boolean x(Context context) {
        Boolean bool = (Boolean) this.b;
        if (bool == null) {
            bool = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
            this.b = bool;
        }
        if (!bool.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.b).booleanValue();
    }

    public final void y(uq4 uq4Var) {
        dp4 dp4Var = uq4Var.c;
        String str = dp4Var.e;
        HashMap hashMap = (HashMap) this.b;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(dp4Var.e, uq4Var);
        if (hq4.K(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + dp4Var);
        }
    }

    public final void z(uq4 uq4Var) {
        HashMap hashMap = (HashMap) this.b;
        dp4 dp4Var = uq4Var.c;
        if (dp4Var.T) {
            ((kq4) this.d).f(dp4Var);
        }
        if (hashMap.get(dp4Var.e) == uq4Var && ((uq4) hashMap.put(dp4Var.e, null)) != null && hq4.K(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + dp4Var);
        }
    }

    @Override // vcb
    public final void reset() {
    }

    public /* synthetic */ e7a(Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public e7a(byte b) {
        switch (b) {
            case 3:
                Random random = new Random();
                this.c = new HashMap();
                this.d = random;
                this.a = new HashMap();
                this.b = new HashMap();
                break;
            case 6:
                this.a = new ArrayList();
                this.b = new HashMap();
                this.c = new HashMap();
                break;
            case 12:
                this.a = new yw7();
                this.b = new yw7();
                this.c = new q58();
                break;
            default:
                this.a = null;
                this.b = null;
                this.c = null;
                this.d = new ArrayDeque();
                break;
        }
    }

    public e7a(go4 go4Var) {
        this.a = go4Var;
        this.b = null;
        this.c = bqb.a;
        this.d = null;
    }

    public e7a(nm7 nm7Var, jm7 jm7Var) {
        jj7 jj7Var = new jj7();
        jj7Var.a = new int[16];
        this.c = jj7Var;
        this.a = nm7Var;
        this.b = jm7Var;
    }
}
