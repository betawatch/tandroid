package bb;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.util.Log;
import android.widget.TextView;
import androidx.biometric.e0;
import androidx.fragment.app.f0;
import androidx.fragment.app.j0;
import androidx.fragment.app.s;
import androidx.lifecycle.a0;
import androidx.lifecycle.t;
import b8.z9;
import ci.v;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.internal.d0;
import com.google.android.gms.common.api.internal.g1;
import com.google.android.gms.common.api.internal.p0;
import com.google.android.gms.common.api.internal.q0;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.tasks.OnSuccessListener;
import d2.s0;
import db.x0;
import e3.p;
import e6.o;
import ei.j4;
import f9.k;
import g2.y;
import g9.e1;
import gi.m0;
import gi.va;
import gi.x9;
import j$.util.DesugarCollections;
import java.io.EOFException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.Lock;
import k2.p1;
import m.i1;
import org.json.JSONObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ec;
import org.telegram.messenger.g0;
import org.telegram.messenger.hs;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Cells.o0;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.dt0;
import org.telegram.ui.Components.eo0;
import org.telegram.ui.e11;
import pg.l;
import s3.g;
import s3.h;
import ug.j;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c implements a0, androidx.activity.result.b, dt0, ec, p0, fb.b, e11, eo0, OnSuccessListener, i1, k, l, ug.c {
    public static volatile c c;
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ c(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    public static int i(CharSequence charSequence) {
        int length = charSequence.length();
        int i3 = 0;
        int i10 = 0;
        while (i10 < length && charSequence.charAt(i10) < 128) {
            i10++;
        }
        int i11 = length;
        while (true) {
            if (i10 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i10);
            if (charAt < 2048) {
                i11 += (127 - charAt) >>> 31;
                i10++;
            } else {
                int length2 = charSequence.length();
                while (i10 < length2) {
                    char charAt2 = charSequence.charAt(i10);
                    if (charAt2 < 2048) {
                        i3 += (127 - charAt2) >>> 31;
                    } else {
                        i3 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i10) < 65536) {
                                StringBuilder sb2 = new StringBuilder(39);
                                sb2.append("Unpaired surrogate at index ");
                                sb2.append(i10);
                                throw new IllegalArgumentException(sb2.toString());
                            }
                            i10++;
                        }
                    }
                    i10++;
                }
                i11 += i3;
            }
        }
        if (i11 >= length) {
            return i11;
        }
        StringBuilder sb3 = new StringBuilder(54);
        sb3.append("UTF-8 length does not fit in int: ");
        sb3.append(i11 + 4294967296L);
        throw new IllegalArgumentException(sb3.toString());
    }

    public static int n(int i3, String str) {
        int w10 = w(i3);
        int i10 = i(str);
        return x(i10) + i10 + w10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v20 */
    public static void r(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i3;
        char charAt;
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        }
        char c2 = 57343;
        int i10 = 0;
        if (!byteBuffer.hasArray()) {
            int length = charSequence.length();
            while (i10 < length) {
                char charAt2 = charSequence.charAt(i10);
                char c10 = charAt2;
                if (charAt2 >= 128) {
                    if (charAt2 < 2048) {
                        byteBuffer.put((byte) ((charAt2 >>> 6) | 960));
                        c10 = (charAt2 & '?') | 128;
                    } else {
                        if (charAt2 >= 55296 && 57343 >= charAt2) {
                            int i11 = i10 + 1;
                            if (i11 != charSequence.length()) {
                                char charAt3 = charSequence.charAt(i11);
                                if (Character.isSurrogatePair(charAt2, charAt3)) {
                                    int codePoint = Character.toCodePoint(charAt2, charAt3);
                                    byteBuffer.put((byte) ((codePoint >>> 18) | hs.P3));
                                    byteBuffer.put((byte) (((codePoint >>> 12) & 63) | 128));
                                    byteBuffer.put((byte) (((codePoint >>> 6) & 63) | 128));
                                    byteBuffer.put((byte) ((codePoint & 63) | 128));
                                    i10 = i11;
                                } else {
                                    i10 = i11;
                                }
                            }
                            StringBuilder sb2 = new StringBuilder(39);
                            sb2.append("Unpaired surrogate at index ");
                            sb2.append(i10 - 1);
                            throw new IllegalArgumentException(sb2.toString());
                        }
                        byteBuffer.put((byte) ((charAt2 >>> '\f') | 480));
                        byteBuffer.put((byte) (((charAt2 >>> 6) & 63) | 128));
                        byteBuffer.put((byte) ((charAt2 & '?') | 128));
                        i10++;
                    }
                }
                byteBuffer.put((byte) c10);
                i10++;
            }
            return;
        }
        try {
            byte[] array = byteBuffer.array();
            int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            int remaining = byteBuffer.remaining();
            int length2 = charSequence.length();
            int i12 = remaining + arrayOffset;
            while (i10 < length2) {
                int i13 = i10 + arrayOffset;
                if (i13 >= i12 || (charAt = charSequence.charAt(i10)) >= 128) {
                    break;
                }
                array[i13] = (byte) charAt;
                i10++;
            }
            if (i10 == length2) {
                i3 = arrayOffset + length2;
            } else {
                i3 = arrayOffset + i10;
                while (i10 < length2) {
                    char charAt4 = charSequence.charAt(i10);
                    if (charAt4 < 128 && i3 < i12) {
                        array[i3] = (byte) charAt4;
                        i3++;
                    } else if (charAt4 < 2048 && i3 <= i12 - 2) {
                        int i14 = i3 + 1;
                        array[i3] = (byte) ((charAt4 >>> 6) | 960);
                        i3 += 2;
                        array[i14] = (byte) ((charAt4 & '?') | 128);
                    } else {
                        if ((charAt4 >= 55296 && c2 >= charAt4) || i3 > i12 - 3) {
                            if (i3 > i12 - 4) {
                                StringBuilder sb3 = new StringBuilder(37);
                                sb3.append("Failed writing ");
                                sb3.append(charAt4);
                                sb3.append(" at index ");
                                sb3.append(i3);
                                throw new ArrayIndexOutOfBoundsException(sb3.toString());
                            }
                            int i15 = i10 + 1;
                            if (i15 != charSequence.length()) {
                                char charAt5 = charSequence.charAt(i15);
                                if (Character.isSurrogatePair(charAt4, charAt5)) {
                                    int codePoint2 = Character.toCodePoint(charAt4, charAt5);
                                    array[i3] = (byte) ((codePoint2 >>> 18) | hs.P3);
                                    array[i3 + 1] = (byte) (((codePoint2 >>> 12) & 63) | 128);
                                    int i16 = i3 + 3;
                                    array[i3 + 2] = (byte) (((codePoint2 >>> 6) & 63) | 128);
                                    i3 += 4;
                                    array[i16] = (byte) ((codePoint2 & 63) | 128);
                                    i10 = i15;
                                } else {
                                    i10 = i15;
                                }
                            }
                            StringBuilder sb4 = new StringBuilder(39);
                            sb4.append("Unpaired surrogate at index ");
                            sb4.append(i10 - 1);
                            throw new IllegalArgumentException(sb4.toString());
                        }
                        array[i3] = (byte) ((charAt4 >>> '\f') | 480);
                        int i17 = i3 + 2;
                        array[i3 + 1] = (byte) (((charAt4 >>> 6) & 63) | 128);
                        i3 += 3;
                        array[i17] = (byte) ((charAt4 & '?') | 128);
                    }
                    i10++;
                    c2 = 57343;
                }
            }
            byteBuffer.position(i3 - byteBuffer.arrayOffset());
        } catch (ArrayIndexOutOfBoundsException e10) {
            BufferOverflowException bufferOverflowException = new BufferOverflowException();
            bufferOverflowException.initCause(e10);
            throw bufferOverflowException;
        }
    }

    public static int t(long j10) {
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

    public static int w(int i3) {
        return x(i3 << 3);
    }

    public static int x(int i3) {
        if ((i3 & (-128)) == 0) {
            return 1;
        }
        if ((i3 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i3) == 0) {
            return 3;
        }
        return (i3 & (-268435456)) == 0 ? 4 : 5;
    }

    @Override // org.telegram.ui.Components.eo0
    public void C0() {
        j4.h0((j4) this.b);
    }

    @Override // org.telegram.ui.Components.dt0
    public void F(boolean z10) {
        qe.a aVar = ((v) this.b).s;
        if (aVar != null) {
            aVar.a(z10, true);
        }
    }

    @Override // com.google.android.gms.common.api.internal.p0
    public void a(m6.a aVar) {
        g1 g1Var = (g1) this.b;
        g1Var.o.lock();
        try {
            g1Var.l = aVar;
            g1Var.j();
        } finally {
            g1Var.o.unlock();
        }
    }

    @Override // f9.k
    public Object apply(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        g9.g1 g1Var = (g9.g1) this.b;
        g1Var.getClass();
        entry.getClass();
        return new e1(entry, g1Var);
    }

    public o b() {
        o oVar = (o) this.b;
        if (oVar.a == null) {
            throw new IllegalArgumentException("media cannot be null.");
        }
        if (!Double.isNaN(oVar.d) && oVar.d < 0.0d) {
            throw new IllegalArgumentException("startTime cannot be negative or NaN.");
        }
        if (Double.isNaN(oVar.e)) {
            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
        }
        if (Double.isNaN(oVar.f) || oVar.f < 0.0d) {
            throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
        }
        return oVar;
    }

    public Set c() {
        Set unmodifiableSet;
        synchronized (((HashSet) this.b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) this.b);
        }
        return unmodifiableSet;
    }

    @Override // com.google.android.gms.common.api.internal.p0
    public void d(int i3) {
        m6.a aVar;
        g1 g1Var = (g1) this.b;
        Lock lock = g1Var.o;
        Lock lock2 = g1Var.o;
        lock.lock();
        try {
            if (!g1Var.n && (aVar = g1Var.m) != null && aVar.c()) {
                g1Var.n = true;
                g1Var.e.onConnectionSuspended(i3);
                return;
            }
            g1Var.n = false;
            g1Var.b.d(i3);
            g1Var.m = null;
            g1Var.l = null;
        } finally {
            lock2.unlock();
        }
    }

    public boolean e() {
        q0 q0Var = ((d0) this.b).d;
        return q0Var != null && q0Var.f();
    }

    @Override // ug.c
    public void f() {
        x9 x9Var = (x9) this.b;
        x9Var.A0(null, true);
        if (x9Var.w0) {
            va vaVar = x9Var.k2;
            vaVar.d1.f.d();
            vaVar.k0(-1, false, true);
            x9Var.w0 = false;
        }
        x9Var.L0(false);
    }

    @Override // androidx.activity.result.b
    public void g(Object obj) {
        switch (this.a) {
            case 5:
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                j0 j0Var = (j0) this.b;
                f0 f0Var = (f0) j0Var.F.pollLast();
                if (f0Var != null) {
                    String str = f0Var.a;
                    int i3 = f0Var.b;
                    s n4 = j0Var.c.n(str);
                    if (n4 != null) {
                        n4.x(i3, aVar.a, aVar.b);
                        break;
                    } else {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                        break;
                    }
                } else {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    break;
                }
            default:
                ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.b;
                androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = aVar2.b;
                int i10 = u.e("ProxyBillingActivityV2", intent).a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.N;
                if (resultReceiver != null) {
                    resultReceiver.send(i10, intent == null ? null : intent.getExtras());
                }
                int i11 = aVar2.a;
                if (i11 != -1 || i10 != 0) {
                    u.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i11 + " and billing's responseCode: " + i10);
                }
                proxyBillingActivityV2.finish();
                break;
        }
    }

    @Override // cd.a
    public Object get() {
        switch (this.a) {
            case 15:
                return new db.l((ta.b) ((e.a) this.b).a);
            default:
                return new x0((db.e1) ((fb.c) this.b).get());
        }
    }

    public s0 h(p pVar, g gVar, int i3) {
        y yVar = (y) this.b;
        s0 s0Var = null;
        int i10 = 0;
        loop0: while (true) {
            int i11 = 0;
            do {
                int i12 = i11 % 10;
                int i13 = i12 + 10;
                if (i12 == 0 && i11 != 0) {
                    byte[] bArr = yVar.a;
                    System.arraycopy(bArr, 10, bArr, 0, 9);
                }
                int i14 = i11 == 0 ? 10 : 1;
                try {
                    pVar.c(i13 - i14, i14, yVar.a);
                    yVar.N(i12);
                    yVar.M(i13);
                    if (yVar.a() < 3) {
                        throw new IndexOutOfBoundsException("position=" + yVar.b + ", limit=" + yVar.c);
                    }
                    int D = yVar.D();
                    int i15 = yVar.b - 3;
                    yVar.b = i15;
                    if (D != 4801587) {
                        if (e3.b.h(yVar.i()) != -1) {
                            break loop0;
                        }
                        if (i11 == 0) {
                            yVar.c(20);
                        }
                        i11++;
                    } else {
                        yVar.O(6);
                        int z10 = yVar.z();
                        int i16 = z10 + 10;
                        if (s0Var == null) {
                            byte[] bArr2 = new byte[i16];
                            System.arraycopy(yVar.a, i15, bArr2, 0, 10);
                            pVar.c(10, z10, bArr2);
                            s0Var = new h(gVar).c(i16, bArr2);
                        } else {
                            pVar.n(z10);
                        }
                        i10 += i16;
                    }
                } catch (EOFException unused) {
                }
            } while (i11 <= i3);
        }
        pVar.o();
        pVar.n(i10);
        return s0Var;
    }

    @Override // org.telegram.ui.Components.dt0
    public float h1() {
        i0.b bVar;
        bVar = ((d2) ((v) this.b)).mSystemInsets;
        return p1.d(9.66f, pi.a.d(bVar.b), 0);
    }

    public void j(int i3, String str) {
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        q(i3, 2);
        try {
            int x10 = x(str.length());
            if (x10 != x(str.length() * 3)) {
                m(i(str));
                r(str, byteBuffer);
                return;
            }
            int position = byteBuffer.position();
            if (byteBuffer.remaining() < x10) {
                throw new androidx.datastore.preferences.protobuf.l(position + x10, byteBuffer.limit());
            }
            byteBuffer.position(position + x10);
            r(str, byteBuffer);
            int position2 = byteBuffer.position();
            byteBuffer.position(position);
            m((position2 - position) - x10);
            byteBuffer.position(position2);
        } catch (BufferOverflowException e10) {
            androidx.datastore.preferences.protobuf.l lVar = new androidx.datastore.preferences.protobuf.l(byteBuffer.position(), byteBuffer.limit());
            lVar.initCause(e10);
            throw lVar;
        }
    }

    public void k(int i3, byte[] bArr) {
        q(i3, 2);
        m(bArr.length);
        int length = bArr.length;
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        if (byteBuffer.remaining() < length) {
            throw new androidx.datastore.preferences.protobuf.l(byteBuffer.position(), byteBuffer.limit());
        }
        byteBuffer.put(bArr, 0, length);
    }

    public void l(int i3) {
        byte b10 = (byte) i3;
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        if (!byteBuffer.hasRemaining()) {
            throw new androidx.datastore.preferences.protobuf.l(byteBuffer.position(), byteBuffer.limit());
        }
        byteBuffer.put(b10);
    }

    @Override // org.telegram.messenger.ec
    public void l0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ch0 B;
        boolean[] zArr = (boolean[]) this.b;
        if (!z10 || (B = imageReceiver.B()) == null || zArr[0]) {
            return;
        }
        B.N(0, false, false);
        g0.h3(new o0(B, 0));
        zArr[0] = true;
    }

    public void m(int i3) {
        while ((i3 & (-128)) != 0) {
            l((i3 & hs.L1) | 128);
            i3 >>>= 7;
        }
        l(i3);
    }

    @Override // org.telegram.ui.Components.dt0
    public int m1() {
        i0.b bVar;
        bVar = ((d2) ((v) this.b)).mSystemInsets;
        return bVar.d;
    }

    @Override // com.google.android.gms.common.api.internal.p0
    public void o(Bundle bundle) {
        g1 g1Var = (g1) this.b;
        g1Var.o.lock();
        try {
            Bundle bundle2 = g1Var.k;
            if (bundle2 == null) {
                g1Var.k = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            g1Var.l = m6.a.f;
            g1Var.j();
        } finally {
            g1Var.o.unlock();
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ((f6.a) this.b).getClass();
        z9.a("com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES", (Bundle) obj);
    }

    @Override // ug.c
    public j p() {
        return ((x9) this.b).t0;
    }

    public void q(int i3, int i10) {
        m((i3 << 3) | i10);
    }

    public void s(long j10) {
        while (((-128) & j10) != 0) {
            l((((int) j10) & hs.L1) | 128);
            j10 >>>= 7;
        }
        l((int) j10);
    }

    @Override // pg.l
    public void u() {
        ((m0) this.b).e.invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x006c, code lost:
    
        if (r3 == 1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0072, code lost:
    
        if (r3 == 3) goto L31;
     */
    @Override // androidx.lifecycle.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void v(Object obj) {
        switch (this.a) {
            case 3:
                Integer num = (Integer) obj;
                androidx.biometric.g0 g0Var = (androidx.biometric.g0) this.b;
                Handler handler = g0Var.B0;
                a3.o oVar = g0Var.C0;
                handler.removeCallbacks(oVar);
                int intValue = num.intValue();
                if (g0Var.G0 != null) {
                    int i3 = g0Var.D0.y;
                    Context n4 = g0Var.n();
                    Drawable drawable = null;
                    if (n4 == null) {
                        Log.w("FingerprintFragment", "Unable to get asset. Context is null.");
                    } else {
                        int i10 = R.drawable.fingerprint_dialog_fp_icon;
                        if (i3 != 0 || intValue != 1) {
                            if (i3 != 1 || intValue != 2) {
                                if (i3 == 2) {
                                }
                                if (i3 == 1) {
                                    break;
                                }
                            } else {
                                i10 = R.drawable.fingerprint_dialog_error;
                            }
                        }
                        drawable = n4.getDrawable(i10);
                    }
                    if (drawable != null) {
                        g0Var.G0.setImageDrawable(drawable);
                        if ((i3 != 0 || intValue != 1) && ((i3 == 1 && intValue == 2) || (i3 == 2 && intValue == 1))) {
                            e0.a(drawable);
                        }
                        g0Var.D0.y = intValue;
                    }
                }
                int intValue2 = num.intValue();
                TextView textView = g0Var.H0;
                if (textView != null) {
                    textView.setTextColor(intValue2 == 2 ? g0Var.E0 : g0Var.F0);
                }
                handler.postDelayed(oVar, 2000L);
                return;
            default:
                t tVar = (t) obj;
                androidx.fragment.app.p pVar = (androidx.fragment.app.p) this.b;
                if (tVar == null || !pVar.s0) {
                    return;
                }
                pVar.getClass();
                throw new IllegalStateException("Fragment " + pVar + " did not return a View from onCreateView() or this was called before onCreateView().");
        }
    }

    public c(byte[] bArr, int i3) {
        this.a = 13;
        ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, i3);
        this.b = wrap;
        wrap.order(ByteOrder.LITTLE_ENDIAN);
    }

    public c(MediaInfo mediaInfo) {
        this.a = 21;
        o oVar = new o(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        if (mediaInfo != null) {
            this.b = oVar;
            return;
        }
        throw new IllegalArgumentException("media cannot be null.");
    }

    public c(JSONObject jSONObject) {
        this.a = 21;
        this.b = new o(jSONObject);
    }

    public c(int i3) {
        this.a = i3;
        switch (i3) {
            case 1:
                this.b = new CopyOnWriteArrayList();
                break;
            case 6:
                this.b = new LinkedHashMap(0, 0.75f, true);
                break;
            case 14:
                break;
            case 17:
                this.b = new tf.b[dg.b.values().length];
                break;
            case 19:
                this.b = new y(10);
                break;
            default:
                this.b = new HashSet();
                break;
        }
    }

    @Override // pg.l
    public void S() {
    }

    @Override // org.telegram.ui.Components.eo0
    public /* synthetic */ void W() {
    }

    @Override // pg.l
    public void A(boolean z10) {
    }

    @Override // org.telegram.messenger.ec
    public /* synthetic */ void D(ImageReceiver imageReceiver) {
    }

    @Override // pg.l
    public void Q(boolean z10) {
    }

    @Override // org.telegram.messenger.ec
    public /* synthetic */ void F0(int i3, Drawable drawable) {
    }
}
