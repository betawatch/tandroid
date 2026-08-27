package k5;

import android.content.ComponentName;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.widget.Toolbar;
import androidx.biometric.p;
import androidx.fragment.app.b0;
import androidx.fragment.app.f0;
import androidx.fragment.app.j0;
import androidx.lifecycle.a0;
import c2.t;
import cg.b2;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.internal.cast.x4;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import f2.t1;
import f2.x0;
import f2.y0;
import g.q;
import h3.l0;
import h7.k6;
import hh.i5;
import j3.n;
import j3.n0;
import j3.r;
import java.io.File;
import java.io.FileInputStream;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import jh.e4;
import l.e0;
import l.x;
import lh.va;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.gp0;
import org.telegram.ui.y51;
import yf.m;
import yf.p1;
import yf.r0;
import zf.v1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class i implements s, a0, androidx.activity.result.b, o, y2.b, e5.o, t1, x, gp0, y51, r, l3.f, ld.b, v1, l.j {
    public static i c;
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ i(d6.g gVar, d6.a aVar) {
        this.a = 11;
        this.b = aVar;
    }

    public static synchronized i H(Context context) {
        i K;
        synchronized (i.class) {
            K = K(context.getApplicationContext());
        }
        return K;
    }

    public static synchronized i K(Context context) {
        synchronized (i.class) {
            i iVar = c;
            if (iVar != null) {
                return iVar;
            }
            i iVar2 = new i(context);
            c = iVar2;
            return iVar2;
        }
    }

    public static int L(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && charSequence.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (true) {
            if (i11 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i11);
            if (charAt < 2048) {
                i12 += (127 - charAt) >>> 31;
                i11++;
            } else {
                int length2 = charSequence.length();
                while (i11 < length2) {
                    char charAt2 = charSequence.charAt(i11);
                    if (charAt2 < 2048) {
                        i10 += (127 - charAt2) >>> 31;
                    } else {
                        i10 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i11) < 65536) {
                                StringBuilder sb2 = new StringBuilder(39);
                                sb2.append("Unpaired surrogate at index ");
                                sb2.append(i11);
                                throw new IllegalArgumentException(sb2.toString());
                            }
                            i11++;
                        }
                    }
                    i11++;
                }
                i12 += i10;
            }
        }
        if (i12 >= length) {
            return i12;
        }
        StringBuilder sb3 = new StringBuilder(54);
        sb3.append("UTF-8 length does not fit in int: ");
        sb3.append(i12 + 4294967296L);
        throw new IllegalArgumentException(sb3.toString());
    }

    public static int Q(int i10, String str) {
        int V = V(i10);
        int L = L(str);
        return W(L) + L + V;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v20 */
    public static void S(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i10;
        char charAt;
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        }
        char c10 = 57343;
        int i11 = 0;
        if (!byteBuffer.hasArray()) {
            int length = charSequence.length();
            while (i11 < length) {
                char charAt2 = charSequence.charAt(i11);
                char c11 = charAt2;
                if (charAt2 >= 128) {
                    if (charAt2 < 2048) {
                        byteBuffer.put((byte) ((charAt2 >>> 6) | 960));
                        c11 = (charAt2 & '?') | 128;
                    } else {
                        if (charAt2 >= 55296 && 57343 >= charAt2) {
                            int i12 = i11 + 1;
                            if (i12 != charSequence.length()) {
                                char charAt3 = charSequence.charAt(i12);
                                if (Character.isSurrogatePair(charAt2, charAt3)) {
                                    int codePoint = Character.toCodePoint(charAt2, charAt3);
                                    byteBuffer.put((byte) ((codePoint >>> 18) | 240));
                                    byteBuffer.put((byte) (((codePoint >>> 12) & 63) | 128));
                                    byteBuffer.put((byte) (((codePoint >>> 6) & 63) | 128));
                                    byteBuffer.put((byte) ((codePoint & 63) | 128));
                                    i11 = i12;
                                } else {
                                    i11 = i12;
                                }
                            }
                            StringBuilder sb2 = new StringBuilder(39);
                            sb2.append("Unpaired surrogate at index ");
                            sb2.append(i11 - 1);
                            throw new IllegalArgumentException(sb2.toString());
                        }
                        byteBuffer.put((byte) ((charAt2 >>> '\f') | 480));
                        byteBuffer.put((byte) (((charAt2 >>> 6) & 63) | 128));
                        byteBuffer.put((byte) ((charAt2 & '?') | 128));
                        i11++;
                    }
                }
                byteBuffer.put((byte) c11);
                i11++;
            }
            return;
        }
        try {
            byte[] array = byteBuffer.array();
            int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            int remaining = byteBuffer.remaining();
            int length2 = charSequence.length();
            int i13 = remaining + arrayOffset;
            while (i11 < length2) {
                int i14 = i11 + arrayOffset;
                if (i14 >= i13 || (charAt = charSequence.charAt(i11)) >= 128) {
                    break;
                }
                array[i14] = (byte) charAt;
                i11++;
            }
            if (i11 == length2) {
                i10 = arrayOffset + length2;
            } else {
                i10 = arrayOffset + i11;
                while (i11 < length2) {
                    char charAt4 = charSequence.charAt(i11);
                    if (charAt4 < 128 && i10 < i13) {
                        array[i10] = (byte) charAt4;
                        i10++;
                    } else if (charAt4 < 2048 && i10 <= i13 - 2) {
                        int i15 = i10 + 1;
                        array[i10] = (byte) ((charAt4 >>> 6) | 960);
                        i10 += 2;
                        array[i15] = (byte) ((charAt4 & '?') | 128);
                    } else {
                        if ((charAt4 >= 55296 && c10 >= charAt4) || i10 > i13 - 3) {
                            if (i10 > i13 - 4) {
                                StringBuilder sb3 = new StringBuilder(37);
                                sb3.append("Failed writing ");
                                sb3.append(charAt4);
                                sb3.append(" at index ");
                                sb3.append(i10);
                                throw new ArrayIndexOutOfBoundsException(sb3.toString());
                            }
                            int i16 = i11 + 1;
                            if (i16 != charSequence.length()) {
                                char charAt5 = charSequence.charAt(i16);
                                if (Character.isSurrogatePair(charAt4, charAt5)) {
                                    int codePoint2 = Character.toCodePoint(charAt4, charAt5);
                                    array[i10] = (byte) ((codePoint2 >>> 18) | 240);
                                    array[i10 + 1] = (byte) (((codePoint2 >>> 12) & 63) | 128);
                                    int i17 = i10 + 3;
                                    array[i10 + 2] = (byte) (((codePoint2 >>> 6) & 63) | 128);
                                    i10 += 4;
                                    array[i17] = (byte) ((codePoint2 & 63) | 128);
                                    i11 = i16;
                                } else {
                                    i11 = i16;
                                }
                            }
                            StringBuilder sb4 = new StringBuilder(39);
                            sb4.append("Unpaired surrogate at index ");
                            sb4.append(i11 - 1);
                            throw new IllegalArgumentException(sb4.toString());
                        }
                        array[i10] = (byte) ((charAt4 >>> '\f') | 480);
                        int i18 = i10 + 2;
                        array[i10 + 1] = (byte) (((charAt4 >>> 6) & 63) | 128);
                        i10 += 3;
                        array[i18] = (byte) ((charAt4 & '?') | 128);
                    }
                    i11++;
                    c10 = 57343;
                }
            }
            byteBuffer.position(i10 - byteBuffer.arrayOffset());
        } catch (ArrayIndexOutOfBoundsException e9) {
            BufferOverflowException bufferOverflowException = new BufferOverflowException();
            bufferOverflowException.initCause(e9);
            throw bufferOverflowException;
        }
    }

    public static int U(long j10) {
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (((-16384) & j10) == 0) {
            return 2;
        }
        if (((-2097152) & j10) == 0) {
            return 3;
        }
        if (((-268435456) & j10) == 0) {
            return 4;
        }
        if (((-34359738368L) & j10) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j10) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j10) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j10) == 0) {
            return 8;
        }
        return (j10 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int V(int i10) {
        return W(i10 << 3);
    }

    public static int W(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    @Override // f2.t1
    public View A(int i10) {
        return ((x0) this.b).q(i10);
    }

    @Override // org.telegram.ui.Components.gp0
    public /* synthetic */ void B() {
        int i10 = this.a;
    }

    @Override // j3.r
    public void E() {
        l0 l0Var = ((n0) this.b).O0;
        if (l0Var != null) {
            l0Var.a.n.d(2);
        }
    }

    public JSONObject F() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = (File) this.b;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(f9.h.j(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e9) {
                        e = e9;
                        Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                        f9.h.c(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    f9.h.c(fileInputStream2, "Error while closing settings cache file.");
                    throw th;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            f9.h.c(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e10) {
            e = e10;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            f9.h.c(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    @Override // f2.t1
    public int G(View view) {
        return x0.y(view) + ((ViewGroup.MarginLayoutParams) ((y0) view.getLayoutParams())).rightMargin;
    }

    public synchronized void I() {
        b bVar = (b) this.b;
        ReentrantLock reentrantLock = bVar.a;
        reentrantLock.lock();
        try {
            bVar.b.edit().clear().apply();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // androidx.lifecycle.a0
    public void J(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        p pVar = (p) this.b;
        if (charSequence != null) {
            if (pVar.R()) {
                pVar.W(charSequence);
            }
            pVar.h0.d(null);
        }
    }

    public void M(int i10, String str) {
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        R(i10, 2);
        try {
            int W = W(str.length());
            if (W != W(str.length() * 3)) {
                P(L(str));
                S(str, byteBuffer);
                return;
            }
            int position = byteBuffer.position();
            if (byteBuffer.remaining() < W) {
                throw new x4(position + W, byteBuffer.limit());
            }
            byteBuffer.position(position + W);
            S(str, byteBuffer);
            int position2 = byteBuffer.position();
            byteBuffer.position(position);
            P((position2 - position) - W);
            byteBuffer.position(position2);
        } catch (BufferOverflowException e9) {
            x4 x4Var = new x4(byteBuffer.position(), byteBuffer.limit());
            x4Var.initCause(e9);
            throw x4Var;
        }
    }

    public void N(int i10, byte[] bArr) {
        R(i10, 2);
        P(bArr.length);
        int length = bArr.length;
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        if (byteBuffer.remaining() < length) {
            throw new x4(byteBuffer.position(), byteBuffer.limit());
        }
        byteBuffer.put(bArr, 0, length);
    }

    public void O(int i10) {
        byte b10 = (byte) i10;
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        if (!byteBuffer.hasRemaining()) {
            throw new x4(byteBuffer.position(), byteBuffer.limit());
        }
        byteBuffer.put(b10);
    }

    public void P(int i10) {
        while ((i10 & (-128)) != 0) {
            O((i10 & 127) | 128);
            i10 >>>= 7;
        }
        O(i10);
    }

    public void R(int i10, int i11) {
        P((i10 << 3) | i11);
    }

    public void T(long j10) {
        while (((-128) & j10) != 0) {
            O((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        O((int) j10);
    }

    @Override // androidx.activity.result.b
    public void a(Object obj) {
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        j0 j0Var = (j0) this.b;
        f0 f0Var = (f0) j0Var.F.pollLast();
        if (f0Var == null) {
            Log.w("FragmentManager", "No Activities were started for result for " + this);
            return;
        }
        String str = f0Var.a;
        int i10 = f0Var.b;
        androidx.fragment.app.s q6 = j0Var.c.q(str);
        if (q6 != null) {
            q6.x(i10, aVar.a, aVar.b);
            return;
        }
        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 1:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                a6.a aVar = (a6.a) ((a6.d) obj).u();
                y5.o oVar = (y5.o) this.b;
                Parcel G0 = aVar.G0();
                v6.a.c(G0, oVar);
                try {
                    aVar.b.transact(1, G0, null, 1);
                    G0.recycle();
                    taskCompletionSource.setResult(null);
                    return;
                } catch (Throwable th) {
                    G0.recycle();
                    throw th;
                }
            default:
                d6.f fVar = new d6.f(1, (TaskCompletionSource) obj2);
                d6.e eVar = (d6.e) ((d6.h) obj).u();
                d6.a aVar2 = (d6.a) this.b;
                Parcel G02 = eVar.G0();
                v6.a.d(G02, fVar);
                v6.a.c(G02, aVar2);
                G02.writeStrongBinder(null);
                eVar.H0(G02, 2);
                return;
        }
    }

    @Override // l.x
    public void b(l.l lVar, boolean z10) {
        q qVar;
        switch (this.a) {
            case 14:
                g.r rVar = (g.r) this.b;
                l.l k10 = lVar.k();
                int i10 = 0;
                boolean z11 = k10 != lVar;
                if (z11) {
                    lVar = k10;
                }
                q[] qVarArr = rVar.Q;
                int length = qVarArr != null ? qVarArr.length : 0;
                while (true) {
                    if (i10 >= length) {
                        qVar = null;
                    } else {
                        qVar = qVarArr[i10];
                        if (qVar == null || qVar.h != lVar) {
                            i10++;
                        }
                    }
                }
                if (qVar != null) {
                    if (!z11) {
                        rVar.h(qVar, z10);
                        break;
                    } else {
                        rVar.f(qVar.a, qVar, k10);
                        rVar.h(qVar, true);
                        break;
                    }
                }
                break;
            default:
                if (lVar instanceof e0) {
                    ((e0) lVar).z.k().c(false);
                }
                x xVar = ((m.i) this.b).e;
                if (xVar != null) {
                    xVar.b(lVar, z10);
                    break;
                }
                break;
        }
    }

    @Override // j3.r
    public void c(long j10) {
        n nVar = ((n0) this.b).F0;
        Handler handler = nVar.a;
        if (handler != null) {
            handler.post(new b2(nVar, j10, 3));
        }
    }

    @Override // zf.v1
    public void c0(float f10) {
        va vaVar = (va) this.b;
        r0.e(vaVar.B1).k(String.valueOf(m.a.indexOf(vaVar.K0.getCurrentBrush())), f10);
        p1 p1Var = vaVar.w1;
        p1Var.c = f10;
        vaVar.E0(p1Var, null, false);
    }

    @Override // l3.f
    public UUID d() {
        return h3.h.a;
    }

    @Override // f2.t1
    public int f(View view) {
        return x0.x(view) - ((ViewGroup.MarginLayoutParams) ((y0) view.getLayoutParams())).leftMargin;
    }

    @Override // j3.r
    public void g() {
        l0 l0Var = ((n0) this.b).O0;
        if (l0Var != null) {
            l0Var.a.S = true;
        }
    }

    @Override // oc.a
    public Object get() {
        String packageName = ((Context) ((oc.a) this.b).get()).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // org.telegram.ui.Components.gp0
    public void h0() {
        switch (this.a) {
            case 17:
                ec k10 = ((i5) this.b).getBulletinFactory().k(false);
                k10.t = true;
                k10.j();
                break;
            default:
                e4.j0((e4) this.b);
                break;
        }
    }

    @Override // com.google.android.gms.common.api.internal.o
    public /* synthetic */ void i(Object obj) {
        ((r7.c) obj).onLocationResult((LocationResult) this.b);
    }

    @Override // l3.f
    public boolean j() {
        return false;
    }

    @Override // l.j
    public void k(l.l lVar) {
        Toolbar toolbar = (Toolbar) this.b;
        m.i iVar = toolbar.a.F;
        if (iVar == null || !iVar.g()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.S.d).iterator();
            while (it.hasNext()) {
                ((b0) it.next()).a.t();
            }
        }
    }

    @Override // l.x
    public boolean l(l.l lVar) {
        Window.Callback callback;
        switch (this.a) {
            case 14:
                g.r rVar = (g.r) this.b;
                if (lVar != lVar.k() || !rVar.K || (callback = rVar.f.getCallback()) == null || rVar.V) {
                    return true;
                }
                callback.onMenuOpened(108, lVar);
                return true;
            default:
                m.i iVar = (m.i) this.b;
                if (lVar == iVar.c) {
                    return false;
                }
                ((e0) lVar).A.getClass();
                iVar.getClass();
                x xVar = iVar.e;
                if (xVar != null) {
                    return xVar.l(lVar);
                }
                return false;
        }
    }

    @Override // e5.o
    public void m(a1.c cVar) {
        cVar.a(((WindowManager) this.b).getDefaultDisplay());
    }

    @Override // f2.t1
    public int n() {
        return ((x0) this.b).D();
    }

    @Override // j3.r
    public void o(int i10, long j10, long j11) {
        n nVar = ((n0) this.b).F0;
        Handler handler = nVar.a;
        if (handler != null) {
            handler.post(new com.google.android.exoplayer2.upstream.d(nVar, i10, j10, j11, 1));
        }
    }

    @Override // j3.r
    public void onSkipSilenceEnabledChanged(boolean z10) {
        n nVar = ((n0) this.b).F0;
        Handler handler = nVar.a;
        if (handler != null) {
            handler.post(new fh.f(5, nVar, z10));
        }
    }

    @Override // l3.f
    public int p() {
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // ld.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object q(ld.c cVar, tc.c cVar2) {
        ld.a aVar;
        int i10;
        Throwable th;
        md.g gVar;
        if (cVar2 instanceof ld.a) {
            aVar = (ld.a) cVar2;
            int i11 = aVar.d;
            if ((i11 & TLObject.FLAG_31) != 0) {
                aVar.d = i11 - TLObject.FLAG_31;
                Object obj = aVar.b;
                sc.a aVar2 = sc.a.a;
                i10 = aVar.d;
                pc.i iVar = pc.i.a;
                if (i10 != 0) {
                    k6.b(obj);
                    md.g gVar2 = new md.g(cVar, aVar.getContext());
                    try {
                        aVar.a = gVar2;
                        aVar.d = 1;
                        Object invoke = ((k1.n) this.b).invoke(gVar2, aVar);
                        if (invoke != aVar2) {
                            invoke = iVar;
                        }
                        if (invoke == aVar2) {
                            return aVar2;
                        }
                        gVar = gVar2;
                    } catch (Throwable th2) {
                        th = th2;
                        gVar = gVar2;
                        gVar.releaseIntercepted();
                        throw th;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gVar = aVar.a;
                    try {
                        k6.b(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        gVar.releaseIntercepted();
                        throw th;
                    }
                }
                gVar.releaseIntercepted();
                return iVar;
            }
        }
        aVar = new ld.a(this, cVar2);
        Object obj2 = aVar.b;
        sc.a aVar22 = sc.a.a;
        i10 = aVar.d;
        pc.i iVar2 = pc.i.a;
        if (i10 != 0) {
        }
        gVar.releaseIntercepted();
        return iVar2;
    }

    @Override // l3.f
    public boolean s(String str) {
        return false;
    }

    @Override // l.j
    public boolean t(l.l lVar, MenuItem menuItem) {
        ((Toolbar) this.b).getClass();
        return false;
    }

    public String toString() {
        switch (this.a) {
            case 5:
                return "ProviderMetadata{ componentName=" + ((ComponentName) this.b).flattenToShortString() + " }";
            default:
                return super.toString();
        }
    }

    @Override // j3.r
    public void u(Exception exc) {
        d5.a.p("MediaCodecAudioRenderer", "Audio sink error", exc);
        n nVar = ((n0) this.b).F0;
        Handler handler = nVar.a;
        if (handler != null) {
            handler.post(new j3.k(nVar, exc, 1));
        }
    }

    @Override // f2.t1
    public int v() {
        x0 x0Var = (x0) this.b;
        return x0Var.m - x0Var.E();
    }

    @Override // j3.r
    public void w() {
        ((n0) this.b).M0 = true;
    }

    @Override // l3.f
    public l3.e x() {
        return (l3.e) this.b;
    }

    @Override // l3.f
    public k3.b y() {
        return null;
    }

    public void z(int i10, boolean z10) {
        t tVar = (t) this.b;
        if (z10) {
            tVar.b(i10);
        } else {
            tVar.getClass();
        }
    }

    public /* synthetic */ i(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public i(byte[] bArr, int i10) {
        this.a = 9;
        ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, i10);
        this.b = wrap;
        wrap.order(ByteOrder.LITTLE_ENDIAN);
    }

    public i(Context context) {
        String d;
        this.a = 0;
        b a2 = b.a(context);
        this.b = a2;
        a2.b();
        String d10 = a2.d("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(d10) || (d = a2.d(b.f("googleSignInOptions", d10))) == null) {
            return;
        }
        try {
            GoogleSignInOptions.b(d);
        } catch (JSONException unused) {
        }
    }

    @Override // zf.v1
    public float get() {
        va vaVar = (va) this.b;
        int i10 = vaVar.B1;
        m currentBrush = vaVar.K0.getCurrentBrush();
        if (currentBrush == null) {
            return r0.e(i10).i;
        }
        return r0.e(i10).f(String.valueOf(m.a.indexOf(currentBrush)), currentBrush.d());
    }

    public i(k9.c cVar) {
        this.a = 29;
        this.b = new File(cVar.b, "com.crashlytics.settings.json");
    }

    public i(int i10) {
        this.a = i10;
        switch (i10) {
            case 15:
                break;
            case 16:
                this.b = new t();
                break;
            default:
                this.b = new CopyOnWriteArrayList();
                break;
        }
    }

    private final /* synthetic */ void C() {
    }

    private final /* synthetic */ void D() {
    }

    @Override // e5.o
    public void r() {
    }

    @Override // l3.f
    public void e(b6.a aVar) {
    }

    @Override // l3.f
    public void h(b6.a aVar) {
    }
}
