package o5;

import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.TextureView;
import android.view.View;
import android.view.Window;
import androidx.biometric.q;
import androidx.biometric.v;
import androidx.biometric.z;
import androidx.fragment.app.f0;
import androidx.fragment.app.j0;
import androidx.fragment.app.k0;
import androidx.fragment.app.p;
import androidx.lifecycle.a0;
import androidx.profileinstaller.ProfileInstallReceiver;
import cg.f1;
import cg.f2;
import cg.m;
import cg.m1;
import cg.n1;
import cg.p1;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.n;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.internal.cast.i4;
import com.google.android.gms.internal.play_billing.s1;
import com.google.android.gms.tasks.TaskCompletionSource;
import dg.s2;
import gg.y1;
import i9.y;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.ReentrantLock;
import l.w;
import l3.t;
import m.y0;
import mg.q0;
import nh.d4;
import nh.z8;
import org.json.JSONException;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.mt0;
import org.telegram.ui.yu0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public class i implements a0, androidx.activity.result.b, s, s2, e2.d, a3.b, o, w, t, y0, ok0, yu0, o0.a {
    public static i c;
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ i(g6.g gVar, g6.a aVar) {
        this.a = 19;
        this.b = aVar;
    }

    public static int B(CharSequence charSequence) {
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
                                StringBuilder sb = new StringBuilder(39);
                                sb.append("Unpaired surrogate at index ");
                                sb.append(i11);
                                throw new IllegalArgumentException(sb.toString());
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
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(i12 + 4294967296L);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static int J(int i10, String str) {
        int R = R(i10);
        int B = B(str);
        return S(B) + B + R;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v20 */
    public static void M(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i10;
        char charAt;
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        }
        char c3 = 57343;
        int i11 = 0;
        if (!byteBuffer.hasArray()) {
            int length = charSequence.length();
            while (i11 < length) {
                char charAt2 = charSequence.charAt(i11);
                char c10 = charAt2;
                if (charAt2 >= 128) {
                    if (charAt2 < 2048) {
                        byteBuffer.put((byte) ((charAt2 >>> 6) | 960));
                        c10 = (charAt2 & '?') | 128;
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
                            StringBuilder sb = new StringBuilder(39);
                            sb.append("Unpaired surrogate at index ");
                            sb.append(i11 - 1);
                            throw new IllegalArgumentException(sb.toString());
                        }
                        byteBuffer.put((byte) ((charAt2 >>> '\f') | 480));
                        byteBuffer.put((byte) (((charAt2 >>> 6) & 63) | 128));
                        byteBuffer.put((byte) ((charAt2 & '?') | 128));
                        i11++;
                    }
                }
                byteBuffer.put((byte) c10);
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
                        if ((charAt4 >= 55296 && c3 >= charAt4) || i10 > i13 - 3) {
                            if (i10 > i13 - 4) {
                                StringBuilder sb2 = new StringBuilder(37);
                                sb2.append("Failed writing ");
                                sb2.append(charAt4);
                                sb2.append(" at index ");
                                sb2.append(i10);
                                throw new ArrayIndexOutOfBoundsException(sb2.toString());
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
                            StringBuilder sb3 = new StringBuilder(39);
                            sb3.append("Unpaired surrogate at index ");
                            sb3.append(i11 - 1);
                            throw new IllegalArgumentException(sb3.toString());
                        }
                        array[i10] = (byte) ((charAt4 >>> '\f') | 480);
                        int i18 = i10 + 2;
                        array[i10 + 1] = (byte) (((charAt4 >>> 6) & 63) | 128);
                        i10 += 3;
                        array[i18] = (byte) ((charAt4 & '?') | 128);
                    }
                    i11++;
                    c3 = 57343;
                }
            }
            byteBuffer.position(i10 - byteBuffer.arrayOffset());
        } catch (ArrayIndexOutOfBoundsException e) {
            BufferOverflowException bufferOverflowException = new BufferOverflowException();
            bufferOverflowException.initCause(e);
            throw bufferOverflowException;
        }
    }

    public static int Q(long j10) {
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

    public static int R(int i10) {
        return S(i10 << 3);
    }

    public static int S(int i10) {
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

    public static synchronized i v(Context context) {
        i z4;
        synchronized (i.class) {
            z4 = z(context.getApplicationContext());
        }
        return z4;
    }

    public static synchronized i z(Context context) {
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

    @Override // dg.s2
    public void A(float f10) {
        mt0 mt0Var = (mt0) this.b;
        f1.e(mt0Var.M1).k(String.valueOf(m.a.indexOf(mt0Var.T0.getCurrentBrush())), f10);
        f2 f2Var = mt0Var.H1;
        f2Var.c = f10;
        mt0Var.s0(f2Var, null);
    }

    public void C(int i10, String str) {
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        L(i10, 2);
        try {
            int S = S(str.length());
            if (S != S(str.length() * 3)) {
                I(B(str));
                M(str, byteBuffer);
                return;
            }
            int position = byteBuffer.position();
            if (byteBuffer.remaining() < S) {
                throw new b7.y0(position + S, byteBuffer.limit());
            }
            byteBuffer.position(position + S);
            M(str, byteBuffer);
            int position2 = byteBuffer.position();
            byteBuffer.position(position);
            I((position2 - position) - S);
            byteBuffer.position(position2);
        } catch (BufferOverflowException e) {
            b7.y0 y0Var = new b7.y0(byteBuffer.position(), byteBuffer.limit());
            y0Var.initCause(e);
            throw y0Var;
        }
    }

    public void D(int i10, byte[] bArr) {
        L(i10, 2);
        I(bArr.length);
        int length = bArr.length;
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        if (byteBuffer.remaining() < length) {
            throw new b7.y0(byteBuffer.position(), byteBuffer.limit());
        }
        byteBuffer.put(bArr, 0, length);
    }

    public void E(int i10) {
        byte b10 = (byte) i10;
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        if (!byteBuffer.hasRemaining()) {
            throw new b7.y0(byteBuffer.position(), byteBuffer.limit());
        }
        byteBuffer.put(b10);
    }

    @Override // androidx.lifecycle.a0
    public void G(Object obj) {
        switch (this.a) {
            case 2:
                q qVar = (q) this.b;
                if (((Boolean) obj).booleanValue()) {
                    if (qVar.R()) {
                        qVar.W(qVar.q(R.string.fingerprint_not_recognized));
                    }
                    z zVar = qVar.i0;
                    if (zVar.n) {
                        Executor executor = zVar.d;
                        if (executor == null) {
                            executor = new androidx.biometric.o(1);
                        }
                        executor.execute(new androidx.biometric.g(qVar, 0));
                    } else {
                        Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                    }
                    z zVar2 = qVar.i0;
                    if (zVar2.u == null) {
                        zVar2.u = new androidx.lifecycle.z();
                    }
                    z.h(zVar2.u, Boolean.FALSE);
                    return;
                }
                return;
            default:
                androidx.lifecycle.t tVar = (androidx.lifecycle.t) obj;
                p pVar = (p) this.b;
                if (tVar == null || !pVar.o0) {
                    return;
                }
                pVar.getClass();
                throw new IllegalStateException("Fragment " + pVar + " did not return a View from onCreateView() or this was called before onCreateView().");
        }
    }

    @Override // org.telegram.ui.yu0
    public void H(MessageObject messageObject) {
        ((z8) ((d4) this.b).N1).f(false);
    }

    public void I(int i10) {
        while ((i10 & (-128)) != 0) {
            E((i10 & 127) | 128);
            i10 >>>= 7;
        }
        E(i10);
    }

    public void K() {
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        throw new IOException("data item not completed, stackSize: " + arrayDeque.size() + " scope: " + O());
    }

    public void L(int i10, int i11) {
        I((i10 << 3) | i11);
    }

    public void N(long j10) {
        long O = O();
        if (O != j10) {
            if (O != -1) {
                if (O != -2) {
                    return;
                } else {
                    O = -2;
                }
            }
            StringBuilder s6 = android.support.v4.media.a.s(j10, "expected non-string scope or scope ", " but found ");
            s6.append(O);
            throw new IOException(s6.toString());
        }
    }

    public long O() {
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    public void P(long j10) {
        while (((-128) & j10) != 0) {
            E((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        E((int) j10);
    }

    @Override // l3.t
    public void a(long j10) {
        f7.b bVar = ((com.google.android.exoplayer2.ext.ffmpeg.b) this.b).B;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new y1(bVar, j10, 1));
        }
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 11:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                d6.a aVar = (d6.a) ((d6.c) obj).u();
                b6.p pVar = (b6.p) this.b;
                Parcel G0 = aVar.G0();
                y6.a.c(G0, pVar);
                try {
                    aVar.b.transact(1, G0, null, 1);
                    G0.recycle();
                    taskCompletionSource.setResult(null);
                    return;
                } catch (Throwable th2) {
                    G0.recycle();
                    throw th2;
                }
            case 19:
                g6.f fVar = new g6.f(0, (TaskCompletionSource) obj2);
                g6.e eVar = (g6.e) ((g6.h) obj).u();
                g6.a aVar2 = (g6.a) this.b;
                Parcel G02 = eVar.G0();
                y6.a.d(G02, fVar);
                y6.a.c(G02, aVar2);
                eVar.H0(G02, 1);
                return;
            default:
                j8.j jVar = (j8.j) this.b;
                s7.b bVar = (s7.b) obj;
                Bundle G = bVar.G();
                G.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
                s7.a aVar3 = new s7.a(0, (TaskCompletionSource) obj2);
                try {
                    s7.i iVar = (s7.i) bVar.u();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    int i10 = s7.c.a;
                    obtain.writeInt(1);
                    jVar.writeToParcel(obtain, 0);
                    obtain.writeInt(1);
                    G.writeToParcel(obtain, 0);
                    obtain.writeStrongBinder(aVar3);
                    try {
                        iVar.a.transact(19, obtain, null, 1);
                        obtain.recycle();
                        return;
                    } catch (Throwable th3) {
                        obtain.recycle();
                        throw th3;
                    }
                } catch (RemoteException e) {
                    Log.e("WalletClientImpl", "RemoteException getting payment data", e);
                    Bundle bundle = Bundle.EMPTY;
                    aVar3.l0(Status.h, null);
                    return;
                }
        }
    }

    @Override // o0.a
    public Cursor b(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e) {
            Log.w("FontsProvider", "Unable to query the content provider", e);
            return null;
        }
    }

    @Override // l.w
    public void c(l.k kVar, boolean z4) {
        ((g.q) this.b).g(kVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o0.a
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient != 0) {
            if (contentProviderClient instanceof AutoCloseable) {
                contentProviderClient.close();
            } else if (contentProviderClient instanceof ExecutorService) {
                i4.g((ExecutorService) contentProviderClient);
            } else {
                contentProviderClient.release();
            }
        }
    }

    @Override // org.telegram.ui.yu0
    public /* synthetic */ TextureView e0() {
        return null;
    }

    @Override // com.google.android.gms.common.api.internal.o
    public void g(Object obj) {
        n nVar;
        androidx.activity.o oVar = ((f7.j) this.b).b;
        synchronized (oVar) {
            oVar.a = false;
            nVar = ((com.google.android.gms.common.api.internal.p) oVar.b).c;
        }
        if (nVar != null) {
            ((f7.d) oVar.c).c(nVar, 2441);
        }
    }

    @Override // rc.a
    public Object get() {
        return new f3.j((Context) ((rc.a) this.b).get(), "com.google.android.datatransport.events", Integer.valueOf(f3.j.d).intValue());
    }

    public void h(x5.k kVar, v vVar) {
        k0 k0Var = (k0) this.b;
        if (k0Var == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
            return;
        }
        if (k0Var.P()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
            return;
        }
        k0 k0Var2 = (k0) this.b;
        q qVar = (q) k0Var2.D("androidx.biometric.BiometricFragment");
        if (qVar == null) {
            qVar = new q();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(k0Var2);
            aVar.f(0, qVar, "androidx.biometric.BiometricFragment");
            aVar.e(true, true);
            k0Var2.A(true);
            k0Var2.E();
        }
        androidx.fragment.app.v k10 = qVar.k();
        if (k10 == null) {
            Log.e("BiometricFragment", "Not launching prompt. Client activity was null.");
            return;
        }
        z zVar = qVar.i0;
        zVar.f = kVar;
        int i10 = kVar.a;
        if (i10 == 0) {
            i10 = vVar != null ? 15 : 255;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 23 || i11 >= 30 || i10 != 15 || vVar != null) {
            zVar.g = vVar;
        } else {
            zVar.g = ee.b.b();
        }
        if (qVar.Q()) {
            qVar.i0.k = qVar.q(R.string.confirm_device_credential_password);
        } else {
            qVar.i0.k = null;
        }
        if (qVar.Q() && new af.d(new androidx.biometric.t(k10, 0)).i(255) != 0) {
            qVar.i0.n = true;
            qVar.S();
        } else if (qVar.i0.p) {
            qVar.h0.postDelayed(new androidx.biometric.p(qVar), 600L);
        } else {
            qVar.X();
        }
    }

    @Override // org.telegram.ui.Components.ok0
    public /* synthetic */ boolean i() {
        return true;
    }

    @Override // org.telegram.ui.Components.ok0
    public void j(View view, q0 q0Var, boolean z4, boolean z10) {
        mg.v vVar = (mg.v) this.b;
        vVar.a.ab(null, vVar.e, vVar.b, view, 0.0f, 0.0f, q0Var, false, z4, z10, false);
        AndroidUtilities.runOnUIThread(new lh.b(this, 18));
    }

    @Override // org.telegram.ui.Components.ok0
    public /* synthetic */ boolean k() {
        return false;
    }

    @Override // e2.d
    public void m0() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // l3.t
    public void n(int i10, long j10, long j11) {
        f7.b bVar = ((com.google.android.exoplayer2.ext.ffmpeg.b) this.b).B;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new g5.d(bVar, i10, j10, j11, 1));
        }
    }

    @Override // org.telegram.ui.Components.ok0
    public /* synthetic */ boolean o() {
        return false;
    }

    @Override // l3.t
    public void onSkipSilenceEnabledChanged(boolean z4) {
        f7.b bVar = ((com.google.android.exoplayer2.ext.ffmpeg.b) this.b).B;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new jh.f(1, bVar, z4));
        }
    }

    @Override // l.w
    public boolean p(l.k kVar) {
        Window.Callback callback = ((g.q) this.b).f.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, kVar);
        return true;
    }

    public void q() {
        n1 n1Var = ((p1) this.b).d;
        if (n1Var != null) {
            m1 m1Var = n1Var.s;
            if (m1Var != null) {
                n1Var.cancelRunnable(m1Var);
                n1Var.s = null;
            }
            m1 m1Var2 = new m1(n1Var, 1);
            n1Var.s = m1Var2;
            n1Var.postRunnable(m1Var2, 1L);
        }
    }

    @Override // e2.d
    public void r0(int i10, Object obj) {
        String str;
        switch (i10) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i10 == 6 || i10 == 7 || i10 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.b).setResultCode(i10);
    }

    public StringBuilder s() {
        pe.a aVar = (pe.a) this.b;
        if (!(aVar instanceof ke.o)) {
            return null;
        }
        StringBuilder sb = ((ke.o) aVar).b.b;
        if (sb.length() == 0) {
            return null;
        }
        return sb;
    }

    public void t(e3.g gVar, Thread thread, Throwable th2) {
        i9.n nVar = (i9.n) this.b;
        synchronized (nVar) {
            String str = "Handling uncaught exception \"" + th2 + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            try {
                try {
                    y.a(nVar.e.I(new i9.l(nVar, System.currentTimeMillis(), th2, thread, gVar)));
                } catch (TimeoutException unused) {
                    Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
                }
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e);
            }
        }
    }

    public String toString() {
        switch (this.a) {
            case 7:
                return "ProviderMetadata{ componentName=" + ((ComponentName) this.b).flattenToShortString() + " }";
            default:
                return super.toString();
        }
    }

    @Override // l3.t
    public void u(Exception exc) {
        h5.a.p("DecoderAudioRenderer", "Audio sink error", exc);
        f7.b bVar = ((com.google.android.exoplayer2.ext.ffmpeg.b) this.b).B;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new l3.o(bVar, exc, 1));
        }
    }

    public synchronized void w() {
        synchronized (this) {
            try {
                b bVar = (b) this.b;
                ReentrantLock reentrantLock = bVar.a;
                reentrantLock.lock();
                try {
                    bVar.b.edit().clear().apply();
                } finally {
                    reentrantLock.unlock();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.telegram.ui.yu0
    public void w0(MessageObject messageObject) {
        ((z8) ((d4) this.b).N1).f(true);
    }

    @Override // androidx.activity.result.b
    public void x(Object obj) {
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        j0 j0Var = (j0) this.b;
        f0 f0Var = (f0) j0Var.F.pollFirst();
        if (f0Var == null) {
            Log.w("FragmentManager", "No IntentSenders were started for " + this);
            return;
        }
        String str = f0Var.a;
        int i10 = f0Var.b;
        androidx.fragment.app.s r10 = j0Var.c.r(str);
        if (r10 != null) {
            r10.x(i10, aVar.a, aVar.b);
            return;
        }
        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
    }

    @Override // l3.t
    public void y() {
        ((com.google.android.exoplayer2.ext.ffmpeg.b) this.b).T = true;
    }

    public /* synthetic */ i(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public i(byte[] bArr, int i10) {
        this.a = 10;
        ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, i10);
        this.b = wrap;
        wrap.order(ByteOrder.LITTLE_ENDIAN);
    }

    public i(int i10) {
        this.a = i10;
        switch (i10) {
            case 20:
                break;
            case 25:
                this.b = new f7.b[lf.b.values().length];
                break;
            default:
                this.b = new ArrayDeque(16);
                break;
        }
    }

    @Override // dg.s2
    public float get() {
        mt0 mt0Var = (mt0) this.b;
        int i10 = mt0Var.M1;
        m currentBrush = mt0Var.T0.getCurrentBrush();
        if (currentBrush == null) {
            return f1.e(i10).i;
        }
        return f1.e(i10).f(String.valueOf(m.a.indexOf(currentBrush)), currentBrush.d());
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
            GoogleSignInOptions.e(d);
        } catch (JSONException unused) {
        }
    }

    public i(Context context, Uri uri) {
        this.a = 29;
        this.b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public i(LaunchActivity launchActivity, Executor executor, s1 s1Var) {
        this.a = 3;
        if (launchActivity == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        }
        if (executor != null) {
            k0 s6 = launchActivity.s();
            z zVar = (z) new af.d(launchActivity).m(z.class);
            this.b = s6;
            zVar.d = executor;
            zVar.e = s1Var;
            return;
        }
        throw new IllegalArgumentException("Executor must not be null.");
    }

    @Override // l3.t
    public /* synthetic */ void F() {
    }

    @Override // l3.t
    public /* synthetic */ void e() {
    }

    @Override // org.telegram.ui.Components.ok0
    public /* synthetic */ void m() {
    }

    @Override // l3.t
    public /* synthetic */ void r() {
    }

    public void d(int i10) {
    }

    public void f(int i10) {
    }

    @Override // org.telegram.ui.Components.ok0
    public /* synthetic */ void l(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i10, boolean z4) {
    }
}
