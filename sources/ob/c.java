package ob;

import a0.h;
import a8.sa;
import aa.p;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.util.Log;
import android.util.SparseIntArray;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.biometric.g0;
import androidx.fragment.app.f0;
import androidx.fragment.app.j0;
import androidx.fragment.app.s;
import androidx.lifecycle.a0;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.h1;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.common.api.internal.q0;
import com.google.android.gms.internal.cast.t;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import d9.o;
import di.lb;
import e5.n;
import f5.g;
import f6.d0;
import f6.e0;
import fi.b4;
import g6.j;
import g9.k;
import gb.d1;
import gb.l;
import gb.w0;
import h9.g1;
import j6.f;
import j6.x;
import java.io.File;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Lock;
import m.i1;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ns;
import org.telegram.ui.Components.fo0;
import org.telegram.ui.Components.ft0;
import org.telegram.ui.l11;
import org.telegram.ui.o00;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class c implements a0, androidx.activity.result.b, l11, q0, ft0, n, q, fo0, i1, OnCompleteListener, ib.b, j6.n, g1 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ c(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    public static int m(CharSequence charSequence) {
        int length = charSequence.length();
        int i7 = 0;
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
                        i7 += (127 - charAt2) >>> 31;
                    } else {
                        i7 += 2;
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
                i11 += i7;
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

    public static int s(int i7, String str) {
        int x10 = x(i7);
        int m10 = m(str);
        return y(m10) + m10 + x10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v20 */
    public static void u(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i7;
        char charAt;
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        }
        char c10 = 57343;
        int i10 = 0;
        if (!byteBuffer.hasArray()) {
            int length = charSequence.length();
            while (i10 < length) {
                char charAt2 = charSequence.charAt(i10);
                char c11 = charAt2;
                if (charAt2 >= 128) {
                    if (charAt2 < 2048) {
                        byteBuffer.put((byte) ((charAt2 >>> 6) | 960));
                        c11 = (charAt2 & '?') | 128;
                    } else {
                        if (charAt2 >= 55296 && 57343 >= charAt2) {
                            int i11 = i10 + 1;
                            if (i11 != charSequence.length()) {
                                char charAt3 = charSequence.charAt(i11);
                                if (Character.isSurrogatePair(charAt2, charAt3)) {
                                    int codePoint = Character.toCodePoint(charAt2, charAt3);
                                    byteBuffer.put((byte) ((codePoint >>> 18) | ns.P3));
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
                byteBuffer.put((byte) c11);
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
                i7 = arrayOffset + length2;
            } else {
                i7 = arrayOffset + i10;
                while (i10 < length2) {
                    char charAt4 = charSequence.charAt(i10);
                    if (charAt4 < 128 && i7 < i12) {
                        array[i7] = (byte) charAt4;
                        i7++;
                    } else if (charAt4 < 2048 && i7 <= i12 - 2) {
                        int i14 = i7 + 1;
                        array[i7] = (byte) ((charAt4 >>> 6) | 960);
                        i7 += 2;
                        array[i14] = (byte) ((charAt4 & '?') | 128);
                    } else {
                        if ((charAt4 >= 55296 && c10 >= charAt4) || i7 > i12 - 3) {
                            if (i7 > i12 - 4) {
                                StringBuilder sb3 = new StringBuilder(37);
                                sb3.append("Failed writing ");
                                sb3.append(charAt4);
                                sb3.append(" at index ");
                                sb3.append(i7);
                                throw new ArrayIndexOutOfBoundsException(sb3.toString());
                            }
                            int i15 = i10 + 1;
                            if (i15 != charSequence.length()) {
                                char charAt5 = charSequence.charAt(i15);
                                if (Character.isSurrogatePair(charAt4, charAt5)) {
                                    int codePoint2 = Character.toCodePoint(charAt4, charAt5);
                                    array[i7] = (byte) ((codePoint2 >>> 18) | ns.P3);
                                    array[i7 + 1] = (byte) (((codePoint2 >>> 12) & 63) | 128);
                                    int i16 = i7 + 3;
                                    array[i7 + 2] = (byte) (((codePoint2 >>> 6) & 63) | 128);
                                    i7 += 4;
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
                        array[i7] = (byte) ((charAt4 >>> '\f') | 480);
                        int i17 = i7 + 2;
                        array[i7 + 1] = (byte) (((charAt4 >>> 6) & 63) | 128);
                        i7 += 3;
                        array[i17] = (byte) ((charAt4 & '?') | 128);
                    }
                    i10++;
                    c10 = 57343;
                }
            }
            byteBuffer.position(i7 - byteBuffer.arrayOffset());
        } catch (ArrayIndexOutOfBoundsException e10) {
            BufferOverflowException bufferOverflowException = new BufferOverflowException();
            bufferOverflowException.initCause(e10);
            throw bufferOverflowException;
        }
    }

    public static int w(long j3) {
        if (((-128) & j3) == 0) {
            return 1;
        }
        if (((-16384) & j3) == 0) {
            return 2;
        }
        if (((-2097152) & j3) == 0) {
            return 3;
        }
        if (((-268435456) & j3) == 0) {
            return 4;
        }
        if (((-34359738368L) & j3) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j3) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j3) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j3) == 0) {
            return 8;
        }
        return (j3 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int x(int i7) {
        return y(i7 << 3);
    }

    public static int y(int i7) {
        if ((i7 & (-128)) == 0) {
            return 1;
        }
        if ((i7 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i7) == 0) {
            return 3;
        }
        return (i7 & (-268435456)) == 0 ? 4 : 5;
    }

    @Override // org.telegram.ui.Components.ft0
    public void F(boolean z10) {
        lb lbVar = (lb) this.b;
        te.a aVar = lbVar.Z;
        if (aVar != null) {
            aVar.a(z10, true);
        }
        o00 o00Var = lbVar.s;
        if (o00Var != null) {
            o00Var.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.ft0
    public float U0() {
        return i5.c.d(9.66f, ri.a.d(((lb) this.b).c0), 0);
    }

    @Override // h9.g1
    public Object a(Object obj, Object obj2) {
        return ((k) this.b).apply(obj2);
    }

    @Override // com.google.android.gms.common.api.internal.q
    public void accept(Object obj, Object obj2) {
        x xVar = (x) obj;
        f fVar = (f) xVar.n();
        d0 d0Var = ((e0) this.b).l;
        Parcel p12 = fVar.p1();
        t.d(p12, d0Var);
        fVar.u1(p12, 18);
        f fVar2 = (f) xVar.n();
        fVar2.u1(fVar2.p1(), 17);
        ((TaskCompletionSource) obj2).setResult(null);
    }

    @Override // e5.n
    public String[] b() {
        return ((WebViewProviderFactoryBoundaryInterface) this.b).getSupportedFeatures();
    }

    @Override // org.telegram.ui.Components.ft0
    public int b1() {
        return ((lb) this.b).d0;
    }

    public void c(StringBuilder sb2, Iterator it) {
        g gVar = (g) this.b;
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb2.append(g.f(entry.getKey()));
            sb2.append("=");
            sb2.append(g.f(entry.getValue()));
            while (it.hasNext()) {
                sb2.append((CharSequence) gVar.a);
                Map.Entry entry2 = (Map.Entry) it.next();
                sb2.append(g.f(entry2.getKey()));
                sb2.append("=");
                sb2.append(g.f(entry2.getValue()));
            }
        }
    }

    @Override // e5.n
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) af.b.a(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.b).createWebView(webView));
    }

    public synchronized void d() {
        ((SharedPreferences) this.b).edit().clear().commit();
    }

    public SparseIntArray e(long j3) {
        return (SparseIntArray) ((h) this.b).f(j3);
    }

    @Override // androidx.activity.result.b
    public void f(Object obj) {
        switch (this.a) {
            case 6:
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                j0 j0Var = (j0) this.b;
                f0 f0Var = (f0) j0Var.F.pollLast();
                if (f0Var != null) {
                    String str = f0Var.a;
                    int i7 = f0Var.b;
                    s o4 = j0Var.c.o(str);
                    if (o4 != null) {
                        o4.x(i7, aVar.a, aVar.b);
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
                ResultReceiver resultReceiver = proxyBillingActivityV2.O;
                if (resultReceiver != null) {
                    resultReceiver.send(i10, intent == null ? null : intent.getExtras());
                }
                int i11 = aVar2.a;
                if (i11 != -1 || i10 != 0) {
                    u.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i11 + " and billing's responseCode: " + i10);
                }
                proxyBillingActivityV2.finish();
                break;
        }
    }

    @Override // com.google.android.gms.common.api.internal.q0
    public void g(n6.a aVar) {
        h1 h1Var = (h1) this.b;
        h1Var.o.lock();
        try {
            h1Var.l = aVar;
            h1Var.j();
        } finally {
            h1Var.o.unlock();
        }
    }

    @Override // fd.a
    public Object get() {
        switch (this.a) {
            case 26:
                return new l((ua.b) ((o) this.b).b);
            default:
                return new w0((d1) ((ib.c) this.b).get());
        }
    }

    @Override // e5.n
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) af.b.a(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.b).getStatics());
    }

    @Override // j6.n
    public void h(String str, long j3, long j10, long j11) {
        h6.o oVar = (h6.o) this.b;
        try {
            oVar.a(new h6.n(new Status(2103, null, null, null), 1));
        } catch (IllegalStateException e10) {
            j6.b bVar = h6.h.k;
            Log.e(bVar.a, bVar.d("Result already set when calling onRequestReplaced", new Object[0]), e10);
        }
        Iterator it = oVar.q.i.iterator();
        while (it.hasNext()) {
            ((h6.g) it.next()).h(str, j3, 2103, j10, j11);
        }
    }

    @Override // com.google.android.gms.common.api.internal.q0
    public void i(int i7) {
        n6.a aVar;
        h1 h1Var = (h1) this.b;
        Lock lock = h1Var.o;
        Lock lock2 = h1Var.o;
        lock.lock();
        try {
            if (!h1Var.n && (aVar = h1Var.m) != null && aVar.c()) {
                h1Var.n = true;
                h1Var.e.onConnectionSuspended(i7);
                return;
            }
            h1Var.n = false;
            h1Var.b.i(i7);
            h1Var.m = null;
            h1Var.l = null;
        } finally {
            lock2.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.q0
    public void j(Bundle bundle) {
        h1 h1Var = (h1) this.b;
        h1Var.o.lock();
        try {
            Bundle bundle2 = h1Var.k;
            if (bundle2 == null) {
                h1Var.k = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            h1Var.l = n6.a.f;
            h1Var.j();
        } finally {
            h1Var.o.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004d A[LOOP:0: B:16:0x0047->B:18:0x004d, LOOP_END] */
    @Override // j6.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void k(String str, long j3, int i7, Object obj, long j10, long j11) {
        int i10;
        Iterator it;
        h6.o oVar = (h6.o) this.b;
        try {
            i10 = i7;
            try {
                Status status = new Status(i10, null, null, null);
                Object obj2 = true == (obj instanceof j6.l) ? obj : null;
                if (obj2 != null) {
                }
                if (obj2 != null) {
                }
                oVar.a(new h6.n(status, 2));
            } catch (IllegalStateException e10) {
                e = e10;
                j6.b bVar = h6.h.k;
                Log.e(bVar.a, bVar.d("Result already set when calling onRequestCompleted", new Object[0]), e);
                it = oVar.q.i.iterator();
                while (it.hasNext()) {
                }
            }
        } catch (IllegalStateException e11) {
            e = e11;
            i10 = i7;
        }
        it = oVar.q.i.iterator();
        while (it.hasNext()) {
            ((h6.g) it.next()).h(str, j3, i10, j10, j11);
            i10 = i7;
        }
    }

    public void l(ia.c cVar, Thread thread, Throwable th2) {
        p pVar = (p) this.b;
        synchronized (pVar) {
            String str = "Handling uncaught exception \"" + th2 + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            c8.a0.a();
            try {
                aa.f0.a(pVar.e.a.b(new aa.n(pVar, System.currentTimeMillis(), th2, thread, cVar)));
            } catch (TimeoutException unused) {
                Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
            } catch (Exception e10) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e10);
            }
        }
    }

    public void n(int i7, String str) {
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        t(i7, 2);
        try {
            int y10 = y(str.length());
            if (y10 != y(str.length() * 3)) {
                r(m(str));
                u(str, byteBuffer);
                return;
            }
            int position = byteBuffer.position();
            if (byteBuffer.remaining() < y10) {
                throw new androidx.datastore.preferences.protobuf.l(position + y10, byteBuffer.limit());
            }
            byteBuffer.position(position + y10);
            u(str, byteBuffer);
            int position2 = byteBuffer.position();
            byteBuffer.position(position);
            r((position2 - position) - y10);
            byteBuffer.position(position2);
        } catch (BufferOverflowException e10) {
            androidx.datastore.preferences.protobuf.l lVar = new androidx.datastore.preferences.protobuf.l(byteBuffer.position(), byteBuffer.limit());
            lVar.initCause(e10);
            throw lVar;
        }
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
    public void o(Object obj) {
        switch (this.a) {
            case 4:
                Integer num = (Integer) obj;
                g0 g0Var = (g0) this.b;
                Handler handler = g0Var.B0;
                sa saVar = g0Var.C0;
                handler.removeCallbacks(saVar);
                int intValue = num.intValue();
                if (g0Var.G0 != null) {
                    int i7 = g0Var.D0.y;
                    Context n10 = g0Var.n();
                    Drawable drawable = null;
                    if (n10 == null) {
                        Log.w("FingerprintFragment", "Unable to get asset. Context is null.");
                    } else {
                        int i10 = R.drawable.fingerprint_dialog_fp_icon;
                        if (i7 != 0 || intValue != 1) {
                            if (i7 != 1 || intValue != 2) {
                                if (i7 == 2) {
                                }
                                if (i7 == 1) {
                                    break;
                                }
                            } else {
                                i10 = R.drawable.fingerprint_dialog_error;
                            }
                        }
                        drawable = n10.getDrawable(i10);
                    }
                    if (drawable != null) {
                        g0Var.G0.setImageDrawable(drawable);
                        if ((i7 != 0 || intValue != 1) && ((i7 == 1 && intValue == 2) || (i7 == 2 && intValue == 1))) {
                            androidx.biometric.e0.a(drawable);
                        }
                        g0Var.D0.y = intValue;
                    }
                }
                int intValue2 = num.intValue();
                TextView textView = g0Var.H0;
                if (textView != null) {
                    textView.setTextColor(intValue2 == 2 ? g0Var.E0 : g0Var.F0);
                }
                handler.postDelayed(saVar, 2000L);
                return;
            default:
                androidx.lifecycle.t tVar = (androidx.lifecycle.t) obj;
                androidx.fragment.app.p pVar = (androidx.fragment.app.p) this.b;
                if (tVar == null || !pVar.s0) {
                    return;
                }
                pVar.getClass();
                throw new IllegalStateException("Fragment " + pVar + " did not return a View from onCreateView() or this was called before onCreateView().");
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        g6.c.h((g6.c) ((j) this.b).c, "launchApplication", task);
    }

    public void p(int i7, byte[] bArr) {
        t(i7, 2);
        r(bArr.length);
        int length = bArr.length;
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        if (byteBuffer.remaining() < length) {
            throw new androidx.datastore.preferences.protobuf.l(byteBuffer.position(), byteBuffer.limit());
        }
        byteBuffer.put(bArr, 0, length);
    }

    public void q(int i7) {
        byte b10 = (byte) i7;
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        if (!byteBuffer.hasRemaining()) {
            throw new androidx.datastore.preferences.protobuf.l(byteBuffer.position(), byteBuffer.limit());
        }
        byteBuffer.put(b10);
    }

    public void r(int i7) {
        while ((i7 & (-128)) != 0) {
            q((i7 & ns.L1) | 128);
            i7 >>>= 7;
        }
        q(i7);
    }

    public void t(int i7, int i10) {
        r((i7 << 3) | i10);
    }

    public void v(long j3) {
        while (((-128) & j3) != 0) {
            q((((int) j3) & ns.L1) | 128);
            j3 >>>= 7;
        }
        q((int) j3);
    }

    @Override // org.telegram.ui.Components.fo0
    public void x0() {
        b4.h0((b4) this.b);
    }

    public c(byte[] bArr, int i7) {
        this.a = 13;
        ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, i7);
        this.b = wrap;
        wrap.order(ByteOrder.LITTLE_ENDIAN);
    }

    public c(Set set) {
        this.a = 0;
        this.b = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            HashMap hashMap = (HashMap) this.b;
            bVar.getClass();
            hashMap.put(a.class, bVar.a);
        }
    }

    public c(int i7) {
        this.a = i7;
        switch (i7) {
            case 8:
                this.b = new h();
                break;
            case 9:
                this.b = new q4.q[cg.b.values().length];
                break;
            case 18:
                break;
            default:
                this.b = new LinkedHashMap(0, 0.75f, true);
                break;
        }
    }

    public c(Context context) {
        boolean isEmpty;
        this.a = 2;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.b = sharedPreferences;
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    isEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (isEmpty) {
                    return;
                }
                Log.i("FirebaseMessaging", "App restored, clearing state");
                d();
            }
        } catch (IOException e10) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e10.getMessage());
            }
        }
    }

    @Override // org.telegram.ui.Components.fo0
    public /* synthetic */ void W() {
    }
}
