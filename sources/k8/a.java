package k8;

import a3.h;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.car.app.j;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import e0.g;
import e2.o0;
import f3.i;
import f3.p;
import h2.d;
import h2.k0;
import h2.l0;
import h2.x;
import h9.i0;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import l8.e;
import li.d0;
import li.j0;
import m9.u;
import m9.y;
import n2.q;
import n2.s;
import o0.f;
import oi.e1;
import oi.e3;
import oi.e4;
import oi.n3;
import oi.o;
import oi.o3;
import oi.p3;
import oi.q3;
import oi.v3;
import oi.y5;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.dj;
import org.telegram.messenger.ea;
import org.telegram.messenger.ew;
import org.telegram.messenger.g0;
import org.telegram.messenger.gj;
import org.telegram.messenger.l10;
import org.telegram.messenger.o2;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.h3;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.t2;
import org.telegram.ui.Cells.y0;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.dt;
import org.telegram.ui.Components.ft;
import org.telegram.ui.Components.gy0;
import org.telegram.ui.Components.jj0;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.st0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.an;
import org.telegram.ui.dr0;
import org.telegram.ui.ef0;
import org.telegram.ui.ek0;
import org.telegram.ui.h5;
import org.telegram.ui.ld0;
import org.telegram.ui.nj0;
import org.telegram.ui.ow;
import org.telegram.ui.tg0;
import org.telegram.ui.tj0;
import org.telegram.ui.xw;
import org.telegram.ui.yw;
import s2.m;
import s2.t;
import sg.h0;
import ug.z0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class a implements j0, i, o3, pm0, dt, l1, jj0, tj0, ui.a, d, t {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ a(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.c = obj;
        this.b = obj2;
    }

    @Override // oi.o3
    public void A(oi.a aVar) {
        o oVar = (o) this.c;
        ki kiVar = oVar.b;
        e2 e2Var = kiVar.a2;
        if (e2Var != null && aVar != null && (aVar.b instanceof TL_iv.pageBlockMap) && g0.J1(e2Var)) {
            ki kiVar2 = new ki(oVar.getContext(), kiVar.a2, false, false, false, null);
            kiVar2.X3 = new qb.a(16);
            kiVar2.K1 = true;
            kiVar2.v3.setVisibility(8);
            kiVar2.u4 = new h(oVar, aVar, kiVar2, 15);
            kiVar2.e1();
            kiVar2.show();
        }
    }

    @Override // oi.o3
    public void D() {
        v3 v3Var = ((o) this.c).s;
        if (v3Var != null) {
            int i7 = v3Var.b0;
            if (i7 == 2) {
                i7 = 0;
            }
            v3Var.c0 = i7;
            v3Var.e(false, false);
            v3Var.g(2, true);
        }
    }

    public void D0(l2.d dVar) {
        synchronized (dVar) {
        }
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new q(this, dVar, 0));
        }
    }

    @Override // org.telegram.ui.Components.dt
    public void E() {
        ((h3) this.c).b(((ft) this.b).getText());
    }

    public byte[] E0(q3.a aVar) {
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
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // oi.o3
    public void F() {
        o oVar = (o) this.c;
        if (oVar.getCurrentItemTop() != oVar.J) {
            oVar.b.M1(oVar, 0);
        }
        oVar.f0();
        o.P(oVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CctBackendFactory G0(String str) {
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
        } catch (ClassNotFoundException e10) {
            Log.w("BackendRegistry", "Class " + str4 + " is not found.", e10);
            return null;
        } catch (IllegalAccessException e11) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e11);
            return null;
        } catch (InstantiationException e12) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e12);
            return null;
        } catch (NoSuchMethodException e13) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e13);
            return null;
        } catch (InvocationTargetException e14) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e14);
            return null;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean H1(q1 q1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // li.j0
    public void I() {
        d0 d0Var = (d0) this.c;
        d0Var.w1.d.g3.O(true);
        d0Var.v1.d.g3.O(true);
    }

    public tg0 J0(int i7, long j3, boolean z10) {
        if (i7 > 0) {
            i7 = ((SparseIntArray) this.c).get(i7, 0);
        }
        if (i7 == 0) {
            return null;
        }
        long j10 = i7;
        LongSparseArray w10 = ((ia.d) this.b).w(j3, 0L);
        tg0 tg0Var = (tg0) (w10 != null ? w10.get(j10) : null);
        if (tg0Var != null || !z10) {
            return tg0Var;
        }
        tg0 tg0Var2 = new tg0();
        ((ia.d) this.b).T(j3, 0L, j10, tg0Var2);
        return tg0Var2;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean J1() {
        return false;
    }

    public String K0(String str) {
        String str2 = (String) this.c;
        Resources resources = (Resources) this.b;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    @Override // h2.d
    public y L(o0 o0Var) {
        Uri uri;
        byte[] bArr;
        ld0 ld0Var = (ld0) this.c;
        if (ld0Var != null && (((uri = (Uri) ld0Var.c) != null && uri.equals(o0Var.n)) || ((bArr = (byte[]) ld0Var.b) != null && Arrays.equals(bArr, o0Var.k)))) {
            y yVar = (y) ((ld0) this.c).d;
            yVar.getClass();
            return yVar;
        }
        y L = ((d) this.b).L(o0Var);
        if (L == null) {
            return null;
        }
        this.c = new ld0(o0Var, L);
        return L;
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean L0(long j3) {
        return ((gy0) this.c).w;
    }

    @Override // oi.o3
    public void M(y5 y5Var, String str) {
        o oVar = (o) this.c;
        if (oVar.w == null) {
            e6 e6Var = (e6) this.b;
            oVar.w = new ga.d(new m2.d(1, this, e6Var), e6Var);
        }
        oVar.w.k(y5Var, str);
    }

    public boolean M0() {
        org.telegram.ui.Wallet.y5 y5Var = (org.telegram.ui.Wallet.y5) this.c;
        return y5Var.J0 > 0.0f || y5Var.A0();
    }

    @Override // oi.o3
    public void O(int i7) {
        o oVar = (o) this.c;
        oVar.b.M1(oVar, i7);
        oVar.f0();
        o.P(oVar);
    }

    public void P0(long j3, File file) {
        synchronized (((g) this.c).f) {
            ((HashMap) ((g) this.c).g).put(Long.valueOf(j3), file);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Q(q1 q1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    public void Q0(Exception exc, boolean z10) {
        this.c = null;
        HashSet hashSet = (HashSet) this.b;
        i0 q10 = i0.q(hashSet);
        hashSet.clear();
        h9.g0 listIterator = q10.listIterator(0);
        while (listIterator.hasNext()) {
            q2.b bVar = (q2.b) listIterator.next();
            bVar.getClass();
            bVar.l(z10 ? 1 : 3, exc);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public void Q1(q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        vf.c.t(q1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean R() {
        return false;
    }

    public void R0(f fVar) {
        androidx.biometric.o oVar = (androidx.biometric.o) this.c;
        d6.i iVar = (d6.i) this.b;
        int i7 = fVar.b;
        if (i7 != 0) {
            oVar.execute(new j6.o(iVar, i7));
        } else {
            oVar.execute(new u(24, iVar, fVar.a));
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ CharacterStyle R1(q1 q1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean S(q1 q1Var) {
        return false;
    }

    public void S0(int i7) {
        ew[] ewVarArr = (ew[]) this.b;
        ew ewVar = ewVarArr[i7];
        Integer num = ewVar.c;
        if (num != null) {
            int i10 = i7 * 2;
            v0(ewVarArr[i10], num.intValue());
            v0(ewVarArr[i10 + 1], ewVar.c.intValue());
            ewVar.c = null;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean T() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean T1(q1 q1Var, gj gjVar) {
        return false;
    }

    public void U0(q2.b bVar) {
        ((HashSet) this.b).add(bVar);
        if (((q2.b) this.c) != null) {
            return;
        }
        this.c = bVar;
        q2.q n10 = bVar.b.n();
        bVar.z = n10;
        android.support.v4.media.session.f fVar = bVar.s;
        String str = l0.a;
        n10.getClass();
        fVar.getClass();
        fVar.obtainMessage(1, new q2.a(x2.t.g.getAndIncrement(), true, SystemClock.elapsedRealtime(), n10)).sendToTarget();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean V0(q1 q1Var, boolean z10) {
        return false;
    }

    @Override // f3.i
    public f3.h W(p pVar, long j3) {
        long position = pVar.getPosition();
        int min = (int) Math.min(20000L, pVar.getLength() - position);
        x xVar = (x) this.c;
        xVar.K(min);
        pVar.c(0, min, xVar.a);
        int i7 = -1;
        int i10 = -1;
        long j10 = -9223372036854775807L;
        while (xVar.a() >= 4) {
            if (k3.a.a(xVar.b, xVar.a) != 442) {
                xVar.O(1);
            } else {
                xVar.O(4);
                long c10 = m4.x.c(xVar);
                if (c10 != -9223372036854775807L) {
                    long b10 = ((k0) this.b).b(c10);
                    if (b10 > j3) {
                        return j10 == -9223372036854775807L ? new f3.h(b10, -1, position) : new f3.h(-9223372036854775807L, 0, position + i10);
                    }
                    if (b10 + 100000 > j3) {
                        return new f3.h(-9223372036854775807L, 0, position + xVar.b);
                    }
                    j10 = b10;
                    i10 = xVar.b;
                }
                int i11 = xVar.c;
                if (xVar.a() >= 10) {
                    xVar.O(9);
                    int A = xVar.A() & 7;
                    if (xVar.a() >= A) {
                        xVar.O(A);
                        if (xVar.a() >= 4) {
                            if (k3.a.a(xVar.b, xVar.a) == 443) {
                                xVar.O(4);
                                int H = xVar.H();
                                if (xVar.a() < H) {
                                    xVar.N(i11);
                                } else {
                                    xVar.O(H);
                                }
                            }
                            while (true) {
                                if (xVar.a() < 4) {
                                    break;
                                }
                                int a10 = k3.a.a(xVar.b, xVar.a);
                                if (a10 == 442 || a10 == 441 || (a10 >>> 8) != 1) {
                                    break;
                                }
                                xVar.O(4);
                                if (xVar.a() < 2) {
                                    xVar.N(i11);
                                    break;
                                }
                                xVar.N(Math.min(xVar.c, xVar.b + xVar.H()));
                            }
                        } else {
                            xVar.N(i11);
                        }
                    } else {
                        xVar.N(i11);
                    }
                } else {
                    xVar.N(i11);
                }
                i7 = xVar.b;
            }
        }
        return j10 != -9223372036854775807L ? new f3.h(j10, -2, position + i7) : f3.h.d;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int X() {
        return 0;
    }

    @Override // oi.o3
    public void Y() {
        v3 v3Var = ((o) this.c).s;
        if (v3Var != null) {
            v3Var.e(false, true);
            int i7 = v3Var.c0;
            v3Var.g(i7 != 2 ? i7 : 0, true);
        }
    }

    public long Y0(int i7, int i10) {
        long[] jArr = (long[]) this.c;
        if (jArr.length >= 30) {
            return Z0(1, i7, i10);
        }
        if (i7 < 0) {
            i7 = 0;
        }
        if (i10 > jArr.length - 1) {
            i10 = jArr.length - 1;
        }
        long j3 = Long.MIN_VALUE;
        while (i7 <= i10) {
            long j10 = jArr[i7];
            if (j10 > j3) {
                j3 = j10;
            }
            i7++;
        }
        return j3;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ jh.a Z() {
        return null;
    }

    public long Z0(int i7, int i10, int i11) {
        ew ewVar = ((ew[]) this.b)[i7];
        if (ewVar.c != null) {
            int i12 = ewVar.d;
            int i13 = ewVar.e;
            if (i10 >= i12 && i11 <= i13) {
                return r1.intValue();
            }
        }
        int i14 = ewVar.d;
        int i15 = ewVar.e;
        if (i14 >= i10 && i15 <= i11) {
            return ewVar.a;
        }
        if ((i10 > i14 || i11 < i14) && (i10 < i14 || i10 > i15)) {
            return 0L;
        }
        S0(i7);
        int i16 = i7 * 2;
        return Math.max(Z0(i16, i10, i11), Z0(i16 + 1, i10, i11));
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Z1(q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0023 A[RETURN] */
    @Override // oi.o3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a(float f10) {
        boolean z10;
        v3 v3Var = ((o) this.c).s;
        if (v3Var != null) {
            FrameLayout frameLayout = v3Var.I;
            if (frameLayout != null) {
                frameLayout.getLocationOnScreen(new int[2]);
                if (f10 >= r4[1]) {
                    z10 = true;
                    v3Var.e(z10, true);
                    if (!z10) {
                        return true;
                    }
                }
            }
            z10 = false;
            v3Var.e(z10, true);
            if (!z10) {
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean a0(q1 q1Var) {
        return false;
    }

    public long a1(int i7, int i10) {
        long[] jArr = (long[]) this.c;
        if (jArr.length >= 30) {
            return b1(1, i7, i10);
        }
        if (i7 < 0) {
            i7 = 0;
        }
        if (i10 > jArr.length - 1) {
            i10 = jArr.length - 1;
        }
        long j3 = Long.MAX_VALUE;
        while (i7 <= i10) {
            long j10 = jArr[i7];
            if (j10 < j3) {
                j3 = j10;
            }
            i7++;
        }
        return j3;
    }

    @Override // oi.o3
    public void b(e1 e1Var, boolean z10) {
        ((o) this.c).b.h1(e1Var, z10);
    }

    @Override // ui.a
    public void b0(float f10, float f11, float f12, float f13, Canvas canvas) {
        Paint paint = (Paint) this.b;
        PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.c;
        z0 z0Var = premiumPreviewFragment.n0;
        if (premiumPreviewFragment.i0) {
            paint.setColor(premiumPreviewFragment.getThemedColor(j6.a7));
            canvas.drawRect(f10, f11, f12, f13, paint);
        } else {
            z0Var.d(0, (-premiumPreviewFragment.e0.getMeasuredWidth()) * 0.1f * premiumPreviewFragment.c0, 0, premiumPreviewFragment.e0.getMeasuredWidth(), 0.0f, premiumPreviewFragment.e0.getMeasuredHeight());
            canvas.drawRect(f10, f11, f12, f13, z0Var.f);
        }
    }

    public long b1(int i7, int i10, int i11) {
        ew ewVar = ((ew[]) this.b)[i7];
        if (ewVar.c != null) {
            int i12 = ewVar.d;
            int i13 = ewVar.e;
            if (i10 >= i12 && i11 <= i13) {
                return r1.intValue();
            }
        }
        int i14 = ewVar.d;
        int i15 = ewVar.e;
        if (i14 >= i10 && i15 <= i11) {
            return ewVar.b;
        }
        if ((i10 > i14 || i11 < i14) && (i10 < i14 || i10 > i15)) {
            return 2147483647L;
        }
        S0(i7);
        int i16 = i7 * 2;
        return Math.min(b1(i16, i10, i11), b1(i16 + 1, i10, i11));
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean c0(q1 q1Var, TLRPC.User user) {
        return false;
    }

    public void c1() {
        m8.a aVar = (m8.a) this.b;
        try {
            v7.f fVar = (v7.f) aVar.a;
            fVar.t1(fVar.p1(), 1);
            ((ea) this.c).c.remove(aVar);
        } catch (RemoteException e10) {
            throw new j(e10);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ dr0 c2() {
        return null;
    }

    @Override // li.j0, o0.a
    public void close() {
        ((d0) this.c).o1.C(0);
    }

    @Override // org.telegram.ui.tj0
    public void d(String str, String str2) {
        ek0 ek0Var = ((nj0) this.c).a;
        if ("PHONE_VERIFICATION_NEEDED".equals(str)) {
            ek0Var.S1(true, str2, (ef0) this.b, this, ek0Var.C1);
        } else {
            ek0Var.R1(true, false);
        }
    }

    @Override // h2.d
    public y d0(byte[] bArr) {
        byte[] bArr2;
        ld0 ld0Var = (ld0) this.c;
        if (ld0Var == null || (bArr2 = (byte[]) ld0Var.b) == null || !Arrays.equals(bArr2, bArr)) {
            y d02 = ((d) this.b).d0(bArr);
            this.c = new ld0(bArr, d02);
            return d02;
        }
        y yVar = (y) ((ld0) this.c).d;
        yVar.getClass();
        return yVar;
    }

    public void d1(int i7) {
        try {
            v7.f fVar = (v7.f) ((m8.a) this.b).a;
            Parcel p12 = fVar.p1();
            p12.writeInt(i7);
            fVar.t1(p12, 11);
        } catch (RemoteException e10) {
            throw new j(e10);
        }
    }

    @Override // s2.t
    public b3.q e(s2.p pVar, m mVar) {
        return new h0(8, ((t) this.b).e(pVar, mVar), (List) this.c);
    }

    public void e1(int i7) {
        try {
            e eVar = (e) this.b;
            Parcel p12 = eVar.p1();
            p12.writeInt(i7);
            eVar.t1(p12, 16);
        } catch (RemoteException e10) {
            throw new j(e10);
        }
    }

    @Override // org.telegram.ui.Components.jj0
    public boolean f(float f10, float f11, int i7, View view) {
        yw ywVar = (yw) this.c;
        if (view instanceof t2) {
            t2 t2Var = (t2) view;
            if (t2Var.o2) {
                ywVar.Z4(t2Var.getDialogId(), view);
                return true;
            }
        }
        ow owVar = ywVar.A0;
        if (owVar != null && owVar.getVisibility() == 0 && ywVar.A0.n) {
            return false;
        }
        return ywVar.A4(view, i7, f10, ((xw) this.b).d);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean f0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean f1(gj gjVar) {
        return y0.a(gjVar);
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean f2(long j3) {
        return ((gy0) this.c).s;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean g() {
        return true;
    }

    @Override // oi.o3
    public m60 g0(View view) {
        o oVar = (o) this.c;
        m60 m60Var = new m60(oVar, (e6) this.b, view, false, false, true);
        oVar.I = m60Var;
        return m60Var;
    }

    public void g1(double d) {
        m8.a aVar = (m8.a) this.b;
        aVar.getClass();
        try {
            v7.f fVar = (v7.f) aVar.a;
            Parcel p12 = fVar.p1();
            p12.writeDouble(d);
            fVar.t1(p12, 5);
        } catch (RemoteException e10) {
            throw new j(e10);
        }
    }

    @Override // org.telegram.ui.Components.pm0
    public /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String h(q1 q1Var) {
        return null;
    }

    public void h1(int i7) {
        try {
            v7.f fVar = (v7.f) ((m8.a) this.b).a;
            Parcel p12 = fVar.p1();
            p12.writeInt(i7);
            fVar.t1(p12, 9);
        } catch (RemoteException e10) {
            throw new j(e10);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean h2(q1 q1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Components.jj0
    public void i() {
        Point point = g0.q;
        if (point.x > point.y) {
            ((yw) this.c).finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int i0(q1 q1Var) {
        return 0;
    }

    @Override // oi.o3
    public void k0(p3 p3Var, View view) {
        o oVar = (o) this.c;
        m60 m60Var = new m60(oVar, (e6) this.b, view, false, false, true);
        m60Var.Q = true;
        e2 e2Var = oVar.b.a2;
        oVar.getContext();
        oVar.I = e4.b(m60Var, e2Var, p3Var, true);
    }

    @Override // org.telegram.ui.Components.pm0
    public void l(boolean z10, float f10) {
        h5.n1 = f10;
        ((TextView) this.b).setText("Saturation " + (f10 * 5.0f));
        st0 st0Var = ((h5) this.c).m1;
        st0Var.M();
        st0Var.K();
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean l0() {
        return false;
    }

    @Override // oi.o3
    public void m0() {
        o oVar = (o) this.c;
        oVar.c0();
        oVar.d0();
    }

    @Override // oi.o3
    public void n(n3 n3Var, View view) {
        o oVar = (o) this.c;
        m60 m60Var = new m60(oVar, (e6) this.b, view, false, false, true);
        m60Var.Q = true;
        oVar.I = e4.c(m60Var, oVar.b.a2, oVar.getContext(), (e6) this.b, n3Var, true);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean o0(p5 p5Var) {
        return false;
    }

    @Override // oi.o3
    public void onContentChanged() {
        o oVar = (o) this.c;
        v3 v3Var = oVar.s;
        if (v3Var != null) {
            v3Var.setSendLoading(oVar.r.p3());
        }
        oVar.a0(true);
        oVar.d0();
        oi.d dVar = oVar.Q;
        g0.r(dVar);
        g0.i3(dVar, 1000L);
    }

    @Override // org.telegram.ui.Components.pm0
    public /* synthetic */ int p0() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean p2(q1 q1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.Components.jj0
    public void q(float f10) {
        Point point = g0.q;
        if (point.x > point.y) {
            ((yw) this.c).movePreviewFragment(f10);
        }
    }

    @Override // f3.i
    public void r0() {
        x xVar = (x) this.c;
        byte[] bArr = l0.b;
        xVar.getClass();
        xVar.L(bArr.length, bArr);
    }

    @Override // oi.o3
    public void s(int i7) {
        o.T((o) this.c, 74, i7);
    }

    @Override // s2.t
    public b3.q s0() {
        return new h0(8, ((t) this.b).s0(), (List) this.c);
    }

    public void t0(int i7, int i10, int i11) {
        ew[] ewVarArr = (ew[]) this.b;
        ew ewVar = new ew();
        ewVar.c = null;
        ewVarArr[i7] = ewVar;
        ewVar.d = i10;
        ewVar.e = (i10 + i11) - 1;
        if (i11 == 1) {
            long j3 = ((long[]) this.c)[i10];
            ewVar.a = j3;
            ewVar.b = j3;
            return;
        }
        int i12 = i7 * 2;
        int i13 = i11 / 2;
        t0(i12, i10, i13);
        int i14 = i12 + 1;
        t0(i14, i10 + i13, i11 - i13);
        ew ewVar2 = ewVarArr[i7];
        ew ewVar3 = ewVarArr[i12];
        ewVar3.getClass();
        ew ewVar4 = ewVarArr[i14];
        ewVar4.getClass();
        ewVar2.getClass();
        ewVar2.a = Math.max(ewVar3.a, ewVar4.a);
        ewVarArr[i7].b = Math.min(ewVarArr[i12].b, ewVarArr[i14].b);
    }

    public String toString() {
        switch (this.a) {
            case 28:
                return "Bounds{lower=" + ((i0.c) this.b) + " upper=" + ((i0.c) this.c) + "}";
            default:
                return super.toString();
        }
    }

    @Override // oi.o3
    public void v() {
        o oVar = (o) this.c;
        q3 q3Var = oVar.r;
        v3 v3Var = oVar.s;
        if (v3Var != null) {
            e3 e3Var = q3Var.v3;
            int i7 = (e3Var != null && e3Var.x() && q3Var.F4()) ? 1 : 0;
            if (v3Var.b0 == 2) {
                v3Var.c0 = i7;
            } else {
                v3Var.g(i7, true);
            }
            if (i7 != 0) {
                oVar.b0();
            }
        }
        oVar.e0();
    }

    public void v0(ew ewVar, int i7) {
        ewVar.c = Integer.valueOf(i7);
        int i10 = ewVar.d;
        long j3 = i7;
        ewVar.a = j3;
        ewVar.b = j3;
        ((long[]) this.c)[i10] = j3;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean v2(int i7) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public String x(long j3) {
        String trim = ((EditTextBoldCursor) this.b).getText().toString().trim();
        if (trim.length() > 16) {
            trim = trim.substring(0, 16);
        }
        if (((gy0) this.c).s || !TextUtils.isEmpty(trim)) {
            return trim;
        }
        return null;
    }

    public void x0() {
        this.b = null;
        this.c = null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean x1() {
        return false;
    }

    @Override // li.j0
    public void y(long j3) {
        ((e2) this.b).presentFragment(an.ua(j3));
        ((d0) this.c).dismiss();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean y0(gj gjVar) {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean z1(q1 q1Var, int i7) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ i9 z2() {
        return null;
    }

    public /* synthetic */ a(int i7, boolean z10) {
        this.a = i7;
    }

    public /* synthetic */ a(Object obj, Object obj2, boolean z10, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    public a(IBinder iBinder) {
        this.a = 4;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.b = new Messenger(iBinder);
            this.c = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.c = new m6.g(iBinder);
            this.b = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    public a(e eVar) {
        this.a = 0;
        new HashMap();
        q6.m.g(eVar);
        this.b = eVar;
    }

    public a(String str, String str2) {
        this.a = 25;
        Object[] objArr = {str, 23};
        if (str.length() <= 23) {
            this.b = str;
            this.c = (str2 == null || str2.length() <= 0) ? null : str2;
            return;
        }
        throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
    }

    public a(long[] jArr) {
        this.a = 11;
        this.c = jArr;
        if (jArr.length < 30) {
            return;
        }
        this.b = new ew[(int) (Math.pow(2.0d, Math.floor((Math.log(jArr.length) / Math.log(2.0d)) + 1.0d)) * 2.0d)];
        t0(1, 0, jArr.length);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A0() {
    }

    @Override // org.telegram.ui.Components.pm0
    public void C() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void k() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void p() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void t() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void x2() {
    }

    public a(d dVar) {
        this.a = 21;
        this.b = dVar;
    }

    public a(k0 k0Var) {
        this.a = 3;
        this.b = k0Var;
        this.c = new x();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void B(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void C1(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void F0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void H(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void I0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void J(dj djVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void L1(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void O1(gj gjVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void P(gj gjVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void V(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void W0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void X0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void e0(int i7) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j2(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n0(String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void o(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q2(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void r(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void u(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void w(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z0(q1 q1Var) {
    }

    public a(Context context, int i7) {
        this.a = i7;
        switch (i7) {
            case 26:
                q6.m.g(context);
                Resources resources = context.getResources();
                this.b = resources;
                this.c = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
                break;
            default:
                this.c = null;
                this.b = context;
                break;
        }
    }

    public a(Handler handler, s sVar) {
        this.a = 5;
        if (sVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.b = handler;
        this.c = sVar;
    }

    public a(PremiumPreviewFragment premiumPreviewFragment) {
        this.a = 19;
        this.c = premiumPreviewFragment;
        this.b = new Paint();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void F1(q1 q1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void G(q1 q1Var, o2 o2Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void I1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K1(q1 q1Var, int i7) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void O0(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void X1(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void a2(q1 q1Var, l10 l10Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void e2(String str, String str2) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void k1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void l2(q1 q1Var, long j3) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void p1(q1 q1Var, int i7) {
    }

    public a(int i7) {
        this.a = i7;
        switch (i7) {
            case 23:
                this.b = new HashSet();
                break;
            case 24:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.b = byteArrayOutputStream;
                this.c = new DataOutputStream(byteArrayOutputStream);
                break;
            default:
                this.b = new ia.d();
                this.c = new SparseIntArray();
                break;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void B0(q1 q1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public void B1(q1 q1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void C0(q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public void H0(q1 q1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K(q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void T0(q1 q1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void h0(q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q0(q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void t1(q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y2(q1 q1Var, int i7, int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Y1(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void m(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void u0(q1 q1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void w0(q1 q1Var, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void g2(q1 q1Var, int i7, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j(q1 q1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void t2(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U(q1 q1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void S1(gj gjVar, String str, String str2, String str3, String str4, int i7, int i10) {
    }
}
