package k6;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.Editable;
import android.util.Log;
import android.webkit.WebView;
import androidx.biometric.p;
import androidx.biometric.u;
import androidx.biometric.y;
import androidx.fragment.app.f0;
import androidx.fragment.app.j0;
import androidx.fragment.app.k0;
import androidx.fragment.app.v;
import androidx.lifecycle.a0;
import androidx.lifecycle.z;
import bi.d4;
import bi.k2;
import bi.k3;
import bi.m1;
import bi.n1;
import bi.o2;
import bi.t;
import bi.u0;
import bi.z5;
import c5.x;
import c6.d0;
import c6.e0;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.internal.cast.x4;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.l0;
import g6.q;
import g6.r;
import g6.w;
import ig.b1;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.InvocationHandler;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import jg.a1;
import m.i1;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;
import org.json.JSONObject;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.zs;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.q4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.dr0;
import org.telegram.ui.kh0;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class h implements a0, androidx.activity.result.b, WebMessageListenerBoundaryInterface, q4, m1, s, OnCompleteListener, g6.n, f6.a, i1, z3.m, b1 {
    public static h c;
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ h(r rVar, String[] strArr) {
        this.a = 25;
        this.b = strArr;
    }

    public static int F(CharSequence charSequence) {
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

    public static final l G(PackageInfo packageInfo, l... lVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            m mVar = new m(packageInfo.signatures[0].toByteArray());
            for (int i10 = 0; i10 < lVarArr.length; i10++) {
                if (lVarArr[i10].equals(mVar)) {
                    return lVarArr[i10];
                }
            }
        }
        return null;
    }

    public static int O(int i10, String str) {
        int U = U(i10);
        int F = F(str);
        return V(F) + F + U;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean Q(PackageInfo packageInfo, boolean z10) {
        PackageInfo packageInfo2;
        if (z10) {
            if (packageInfo == null) {
                packageInfo2 = null;
                if (packageInfo != null && packageInfo2.signatures != null) {
                    if ((!z10 ? G(packageInfo2, n.a) : G(packageInfo2, n.a[0])) == null) {
                        return true;
                    }
                }
                return false;
            }
            if ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z10 = (applicationInfo == null || (applicationInfo.flags & zs.N1) == 0) ? false : true;
            }
        }
        packageInfo2 = packageInfo;
        if (packageInfo != null) {
            if ((!z10 ? G(packageInfo2, n.a) : G(packageInfo2, n.a[0])) == null) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v20 */
    public static void R(CharSequence charSequence, ByteBuffer byteBuffer) {
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
                                    byteBuffer.put((byte) ((codePoint >>> 18) | zs.P3));
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
                                    array[i10] = (byte) ((codePoint2 >>> 18) | zs.P3);
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
        } catch (ArrayIndexOutOfBoundsException e) {
            BufferOverflowException bufferOverflowException = new BufferOverflowException();
            bufferOverflowException.initCause(e);
            throw bufferOverflowException;
        }
    }

    public static int T(long j10) {
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

    public static int U(int i10) {
        return V(i10 << 3);
    }

    public static int V(int i10) {
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

    public static h p(Context context) {
        n6.l.g(context);
        synchronized (h.class) {
            try {
                if (c == null) {
                    o.a(context);
                    c = new h(context);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c;
    }

    public JSONObject A() {
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
                        jSONObject = new JSONObject(x9.h.j(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e) {
                        e = e;
                        Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                        x9.h.c(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    x9.h.c(fileInputStream2, "Error while closing settings cache file.");
                    throw th;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            x9.h.c(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e7) {
            e = e7;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            x9.h.c(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    @Override // bi.m1
    public void B(Editable editable) {
        z5 z5Var = (z5) this.b;
        bi.a aVar = z5Var.a;
        if (aVar != null) {
            aVar.s = true;
            aVar.r = z5Var.r.k2;
        }
        z5Var.w();
        k3 k3Var = z5Var.E;
        if (k3Var == null || z5Var.a == null) {
            return;
        }
        k3Var.a();
    }

    public int C() {
        return ((v() & 255) << 24) | ((v() & 255) << 16) | ((v() & 255) << 8) | (v() & 255);
    }

    public int D() {
        return ((v() & Byte.MAX_VALUE) << 21) | ((v() & Byte.MAX_VALUE) << 14) | ((v() & Byte.MAX_VALUE) << 7) | (v() & Byte.MAX_VALUE);
    }

    public void E(long j10) {
        long j11 = 0;
        while (j11 < j10) {
            long skip = ((ff.a) this.b).skip(j10 - j11);
            if (skip <= 0) {
                throw new EOFException();
            }
            j11 += skip;
        }
    }

    @Override // bi.m1
    public /* synthetic */ boolean H(boolean z10) {
        return false;
    }

    @Override // bi.m1
    public /* synthetic */ boolean I(n1 n1Var) {
        return false;
    }

    public void J(int i10, String str) {
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        P(i10, 2);
        try {
            int V = V(str.length());
            if (V != V(str.length() * 3)) {
                N(F(str));
                R(str, byteBuffer);
                return;
            }
            int position = byteBuffer.position();
            if (byteBuffer.remaining() < V) {
                throw new x4(position + V, byteBuffer.limit());
            }
            byteBuffer.position(position + V);
            R(str, byteBuffer);
            int position2 = byteBuffer.position();
            byteBuffer.position(position);
            N((position2 - position) - V);
            byteBuffer.position(position2);
        } catch (BufferOverflowException e) {
            x4 x4Var = new x4(byteBuffer.position(), byteBuffer.limit());
            x4Var.initCause(e);
            throw x4Var;
        }
    }

    @Override // org.telegram.ui.Components.q4
    public void K(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 10:
                ((t) this.b).J(z10, i10, i11, 0L, false);
                t tVar = (t) this.b;
                kh0 kh0Var = tVar.O;
                if (kh0Var != null) {
                    kh0Var.h();
                    tVar.O = null;
                    break;
                }
                break;
            default:
                ((k2) this.b).w0(i10, i11, z10);
                break;
        }
    }

    public void L(int i10, byte[] bArr) {
        P(i10, 2);
        N(bArr.length);
        int length = bArr.length;
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        if (byteBuffer.remaining() < length) {
            throw new x4(byteBuffer.position(), byteBuffer.limit());
        }
        byteBuffer.put(bArr, 0, length);
    }

    public void M(int i10) {
        byte b10 = (byte) i10;
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        if (!byteBuffer.hasRemaining()) {
            throw new x4(byteBuffer.position(), byteBuffer.limit());
        }
        byteBuffer.put(b10);
    }

    public void N(int i10) {
        while ((i10 & (-128)) != 0) {
            M((i10 & zs.L1) | 128);
            i10 >>>= 7;
        }
        M(i10);
    }

    public void P(int i10, int i11) {
        N((i10 << 3) | i11);
    }

    public void S(long j10) {
        while (((-128) & j10) != 0) {
            M((((int) j10) & zs.L1) | 128);
            j10 >>>= 7;
        }
        M((int) j10);
    }

    public void a(j6.m mVar, u uVar) {
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
        p pVar = (p) k0Var2.D("androidx.biometric.BiometricFragment");
        if (pVar == null) {
            pVar = new p();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(k0Var2);
            aVar.f(0, pVar, "androidx.biometric.BiometricFragment");
            aVar.e(true, true);
            k0Var2.A(true);
            k0Var2.E();
        }
        v k10 = pVar.k();
        if (k10 == null) {
            Log.e("BiometricFragment", "Not launching prompt. Client activity was null.");
            return;
        }
        y yVar = pVar.l0;
        yVar.f = mVar;
        int i10 = mVar.a;
        if (i10 == 0) {
            i10 = uVar != null ? 15 : 255;
        }
        if (Build.VERSION.SDK_INT < 30 && i10 == 15 && uVar == null) {
            yVar.g = v7.m.a();
        } else {
            yVar.g = uVar;
        }
        if (pVar.Q()) {
            pVar.l0.k = pVar.q(R.string.confirm_device_credential_password);
        } else {
            pVar.l0.k = null;
        }
        if (pVar.Q() && new android.support.v4.media.session.a0(new androidx.biometric.s(k10, 0)).h(zs.e4) != 0) {
            pVar.l0.n = true;
            pVar.S();
        } else if (pVar.l0.p) {
            pVar.k0.postDelayed(new androidx.biometric.o(pVar), 600L);
        } else {
            pVar.X();
        }
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 15:
                w wVar = (w) obj;
                g6.f fVar = (g6.f) wVar.v();
                d0 d0Var = ((e0) this.b).k;
                Parcel P0 = fVar.P0();
                com.google.android.gms.internal.cast.u.d(P0, d0Var);
                fVar.U0(P0, 18);
                g6.f fVar2 = (g6.f) wVar.v();
                fVar2.U0(fVar2.P0(), 17);
                ((TaskCompletionSource) obj2).setResult(null);
                break;
            case 25:
                q qVar = new q(1, (TaskCompletionSource) obj2);
                g6.i iVar = (g6.i) ((g6.s) obj).v();
                String[] strArr = (String[]) this.b;
                Parcel P02 = iVar.P0();
                com.google.android.gms.internal.cast.u.d(P02, qVar);
                P02.writeStringArray(strArr);
                iVar.U0(P02, 6);
                break;
            default:
                GetCredentialRequest getCredentialRequest = (GetCredentialRequest) this.b;
                h7.f fVar3 = new h7.f(1, (TaskCompletionSource) obj2);
                h7.d dVar = (h7.d) ((h7.e) obj).v();
                com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true));
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i10 = q7.a.a;
                obtain.writeStrongBinder(fVar3);
                q7.a.b(obtain, getCredentialRequest);
                q7.a.b(obtain, gVar);
                ((h7.b) dVar).H0(obtain, 1);
                break;
        }
    }

    @Override // bi.m1
    public void b(n1 n1Var) {
        k3 k3Var = ((z5) this.b).E;
        if (k3Var != null) {
            d4 d4Var = k3Var.a;
            d4.P1(d4Var, n1Var);
            d4Var.o3.h(n1Var, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:222:0x034c, code lost:
    
        throw vb.c.a();
     */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03a7 A[LOOP:21: B:146:0x022c->B:176:0x03a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0376 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c2.q c(ac.a aVar) {
        int f7;
        ac.f fVar;
        ac.d dVar;
        int i10;
        int i11;
        wb.c cVar;
        int f10;
        ac.h u10 = aVar.u();
        ac.d dVar2 = aVar.t().a;
        ac.e t10 = aVar.t();
        ac.h u11 = aVar.u();
        int i12 = m1.j.d(8)[t10.b];
        wb.b bVar = (wb.b) aVar.b;
        int i13 = bVar.b;
        int i14 = 0;
        for (int i15 = 0; i15 < i13; i15++) {
            for (int i16 = 0; i16 < i13; i16++) {
                if (a1.g.b(i12, i15, i16)) {
                    bVar.a(i16, i15);
                }
            }
        }
        int i17 = u11.a * 4;
        int i18 = i17 + 17;
        int i19 = u11.d;
        wb.b bVar2 = new wb.b(i18, i18);
        bVar2.d(0, 0, 9, 9);
        int i20 = i17 + 9;
        bVar2.d(i20, 0, 8, 9);
        bVar2.d(0, i20, 9, 8);
        int[] iArr = u11.b;
        int length = iArr.length;
        int i21 = 0;
        while (i21 < length) {
            int i22 = iArr[i21] - 2;
            for (int i23 = i14; i23 < length; i23++) {
                if ((i21 != 0 || (i23 != 0 && i23 != length - 1)) && (i21 != length - 1 || i23 != 0)) {
                    bVar2.d(iArr[i23] - 2, i22, 5, 5);
                }
            }
            i21++;
            i14 = 0;
        }
        int i24 = 2;
        int i25 = 6;
        int i26 = 1;
        bVar2.d(6, 9, 1, i17);
        bVar2.d(9, 6, i17, 1);
        if (u11.a > 6) {
            int i27 = i17 + 6;
            bVar2.d(i27, 0, 3, 6);
            bVar2.d(0, i27, 6, 3);
        }
        byte[] bArr = new byte[i19];
        int i28 = i13 - 1;
        int i29 = i28;
        boolean z10 = true;
        int i30 = 0;
        int i31 = 0;
        int i32 = 0;
        while (i29 > 0) {
            if (i29 == i25) {
                i29--;
            }
            int i33 = 0;
            while (i33 < i13) {
                int i34 = z10 ? i28 - i33 : i33;
                int i35 = i26;
                int i36 = 0;
                for (int i37 = i24; i36 < i37; i37 = 2) {
                    int i38 = i29 - i36;
                    if (!bVar2.b(i38, i34)) {
                        i31++;
                        i32 <<= 1;
                        if (bVar.b(i38, i34)) {
                            i32 |= 1;
                        }
                        if (i31 == 8) {
                            bArr[i30] = (byte) i32;
                            i30++;
                            i31 = 0;
                            i32 = 0;
                        }
                    }
                    i36++;
                }
                i33++;
                i26 = i35;
                i24 = 2;
            }
            z10 = !z10;
            i29 -= 2;
            i25 = 6;
            i24 = 2;
        }
        int i39 = i26;
        if (i30 != i19) {
            throw vb.c.a();
        }
        if (i19 != u10.d) {
            throw new IllegalArgumentException();
        }
        x xVar = u10.c[dVar2.ordinal()];
        ac.g[] gVarArr = (ac.g[]) xVar.c;
        int i40 = xVar.b;
        int i41 = 0;
        for (ac.g gVar : gVarArr) {
            i41 += gVar.a;
        }
        ac.b[] bVarArr = new ac.b[i41];
        int i42 = 0;
        for (ac.g gVar2 : gVarArr) {
            int i43 = 0;
            while (i43 < gVar2.a) {
                int i44 = gVar2.b;
                bVarArr[i42] = new ac.b(i44, new byte[i40 + i44]);
                i43++;
                i42++;
            }
        }
        int length2 = bVarArr[0].a.length;
        int i45 = i41 - 1;
        while (i45 >= 0 && bVarArr[i45].a.length != length2) {
            i45--;
        }
        int i46 = i45 + 1;
        int i47 = length2 - i40;
        int i48 = 0;
        int i49 = 0;
        while (i48 < i47) {
            int i50 = i49;
            int i51 = 0;
            while (i51 < i42) {
                bVarArr[i51].a[i48] = bArr[i50];
                i51++;
                i50++;
            }
            i48++;
            i49 = i50;
        }
        int i52 = i46;
        while (i52 < i42) {
            bVarArr[i52].a[i47] = bArr[i49];
            i52++;
            i49++;
        }
        boolean z11 = false;
        int length3 = bVarArr[0].a.length;
        while (i47 < length3) {
            int i53 = i49;
            int i54 = 0;
            while (i54 < i42) {
                bVarArr[i54].a[i54 < i46 ? i47 : i47 + 1] = bArr[i53];
                i54++;
                i53++;
            }
            i47++;
            i49 = i53;
        }
        int i55 = 0;
        for (int i56 = 0; i56 < i41; i56++) {
            i55 += bVarArr[i56].b;
        }
        byte[] bArr2 = new byte[i55];
        int i57 = 0;
        int i58 = 0;
        int i59 = 0;
        while (i58 < i41) {
            ac.b bVar3 = bVarArr[i58];
            byte[] bArr3 = bVar3.a;
            int i60 = bVar3.b;
            int length4 = bArr3.length;
            int[] iArr2 = new int[length4];
            for (int i61 = 0; i61 < length4; i61++) {
                iArr2[i61] = bArr3[i61] & 255;
            }
            try {
                int P = ((r2.y) this.b).P(iArr2, bArr3.length - i60);
                for (int i62 = 0; i62 < i60; i62++) {
                    bArr3[i62] = (byte) iArr2[i62];
                }
                i57 += P;
                int i63 = i59;
                int i64 = 0;
                while (i64 < i60) {
                    bArr2[i63] = bArr3[i64];
                    i64++;
                    i63++;
                }
                i58++;
                i59 = i63;
            } catch (yb.c unused) {
                vb.a aVar2 = vb.a.c;
                if (vb.h.a) {
                    throw new vb.a();
                }
                throw vb.a.c;
            }
        }
        char[] cArr = ac.c.a;
        b4.d dVar3 = new b4.d(bArr2);
        StringBuilder sb2 = new StringBuilder(50);
        ArrayList arrayList = new ArrayList(i39);
        int i65 = -1;
        int i66 = -1;
        boolean z12 = false;
        boolean z13 = false;
        wb.c cVar2 = null;
        while (true) {
            try {
                int d = dVar3.d();
                ac.f fVar2 = ac.f.c;
                if (d < 4 || (f7 = dVar3.f(4)) == 0) {
                    fVar = fVar2;
                } else if (f7 == 1) {
                    fVar = ac.f.d;
                } else if (f7 == 2) {
                    fVar = ac.f.e;
                } else if (f7 == 3) {
                    fVar = ac.f.f;
                } else if (f7 == 4) {
                    fVar = ac.f.h;
                } else if (f7 == 5) {
                    fVar = ac.f.s;
                } else if (f7 == 7) {
                    fVar = ac.f.n;
                } else if (f7 == 8) {
                    fVar = ac.f.r;
                } else if (f7 == 9) {
                    fVar = ac.f.w;
                } else {
                    if (f7 != 13) {
                        throw new IllegalArgumentException();
                    }
                    fVar = ac.f.x;
                }
                int ordinal = fVar.ordinal();
                if (ordinal != 0) {
                    dVar = dVar2;
                    if (ordinal != 3) {
                        if (ordinal == 5) {
                            i10 = i57;
                            i11 = 1;
                            int f11 = dVar3.f(8);
                            if ((f11 & 128) == 0) {
                                f10 = f11 & zs.L1;
                            } else if ((f11 & zs.W2) == 128) {
                                f10 = ((f11 & 63) << 8) | dVar3.f(8);
                            } else {
                                if ((f11 & zs.B3) != 192) {
                                    throw vb.c.a();
                                }
                                f10 = ((f11 & 31) << 16) | dVar3.f(16);
                            }
                            HashMap hashMap = wb.c.c;
                            if (f10 < 0 || f10 >= 900) {
                                break;
                            }
                            wb.c cVar3 = (wb.c) wb.c.c.get(Integer.valueOf(f10));
                            if (cVar3 == null) {
                                throw vb.c.a();
                            }
                            cVar = cVar3;
                        } else if (ordinal == 7) {
                            i10 = i57;
                            i11 = 1;
                            cVar = cVar2;
                            z12 = true;
                            z11 = true;
                        } else if (ordinal == 8) {
                            i10 = i57;
                            i11 = 1;
                            cVar = cVar2;
                            z12 = true;
                            z13 = true;
                            int i67 = i65;
                            if (fVar != fVar2) {
                                if (cVar != null) {
                                    i11 = z11 ? 4 : z13 ? 6 : 2;
                                } else if (z11) {
                                    i11 = 3;
                                } else if (z13) {
                                    i11 = 5;
                                }
                                c2.q qVar = new c2.q(bArr2, sb2.toString(), arrayList.isEmpty() ? null : arrayList, dVar.toString(), i67, i66, i11);
                                qVar.g = Integer.valueOf(i10);
                                return qVar;
                            }
                            i65 = i67;
                            dVar2 = dVar;
                            cVar2 = cVar;
                            i57 = i10;
                        } else if (ordinal != 9) {
                            int f12 = dVar3.f(fVar.a(u10));
                            int ordinal2 = fVar.ordinal();
                            i10 = i57;
                            if (ordinal2 == 1) {
                                ac.c.e(dVar3, sb2, f12);
                            } else if (ordinal2 == 2) {
                                ac.c.a(dVar3, sb2, f12, z12);
                            } else if (ordinal2 == 4) {
                                ac.c.b(dVar3, sb2, f12, cVar2, arrayList);
                            } else {
                                if (ordinal2 != 6) {
                                    throw vb.c.a();
                                }
                                ac.c.d(dVar3, sb2, f12);
                            }
                        } else {
                            i10 = i57;
                            int f13 = dVar3.f(4);
                            int f14 = dVar3.f(fVar.a(u10));
                            i11 = 1;
                            if (f13 == 1) {
                                ac.c.c(dVar3, sb2, f14);
                            }
                        }
                        int i672 = i65;
                        if (fVar != fVar2) {
                        }
                    } else {
                        i10 = i57;
                        i11 = 1;
                        if (dVar3.d() < 16) {
                            throw vb.c.a();
                        }
                        i65 = dVar3.f(8);
                        i66 = dVar3.f(8);
                    }
                    cVar = cVar2;
                    int i6722 = i65;
                    if (fVar != fVar2) {
                    }
                } else {
                    dVar = dVar2;
                    i10 = i57;
                }
                i11 = 1;
                cVar = cVar2;
                int i67222 = i65;
                if (fVar != fVar2) {
                }
            } catch (IllegalArgumentException unused2) {
                throw vb.c.a();
            }
        }
    }

    @Override // ig.b1
    public void d() {
        a1 a1Var = (a1) this.b;
        a1Var.e.animate().alpha(1.0f).setDuration(320L).setUpdateListener(new bg.k(a1Var, 3)).setInterpolator(gr.h);
    }

    @Override // bi.m1
    public boolean f() {
        z5 z5Var = (z5) this.b;
        k3 k3Var = z5Var.E;
        if (k3Var == null || z5Var.a == null) {
            return false;
        }
        return k3Var.a.V4();
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override // bi.m1
    public void h(int i10, int i11) {
        o2 o2Var;
        z5 z5Var = (z5) this.b;
        k3 k3Var = z5Var.E;
        if (k3Var == null || z5Var.a == null || (o2Var = k3Var.a.Q3) == null) {
            return;
        }
        o2Var.f(i10, i11);
    }

    @Override // bi.m1
    public void i(n1 n1Var, int i10, int i11) {
        k3 k3Var;
        k9 textSelectionHelper;
        z5 z5Var = (z5) this.b;
        if (z5Var.G || i10 == i11 || (k3Var = z5Var.E) == null || (textSelectionHelper = k3Var.a.getTextSelectionHelper()) == null) {
            return;
        }
        if (textSelectionHelper.x() && textSelectionHelper.W == z5Var) {
            return;
        }
        z5Var.post(new u0(this, n1Var, i11, textSelectionHelper, i10, 2));
    }

    @Override // ig.b1
    public boolean k() {
        return true;
    }

    @Override // androidx.lifecycle.a0
    public void k0(Object obj) {
        switch (this.a) {
            case 4:
                p pVar = (p) this.b;
                if (((Boolean) obj).booleanValue()) {
                    if (pVar.R()) {
                        pVar.W(pVar.q(R.string.fingerprint_not_recognized));
                    }
                    y yVar = pVar.l0;
                    if (yVar.n) {
                        Executor executor = yVar.d;
                        if (executor == null) {
                            executor = new androidx.biometric.n(1);
                        }
                        executor.execute(new androidx.biometric.g(pVar, 0));
                    } else {
                        Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                    }
                    y yVar2 = pVar.l0;
                    if (yVar2.u == null) {
                        yVar2.u = new z();
                    }
                    y.h(yVar2.u, Boolean.FALSE);
                    return;
                }
                return;
            default:
                androidx.lifecycle.t tVar = (androidx.lifecycle.t) obj;
                androidx.fragment.app.p pVar2 = (androidx.fragment.app.p) this.b;
                if (tVar == null || !pVar2.r0) {
                    return;
                }
                pVar2.getClass();
                throw new IllegalStateException("Fragment " + pVar2 + " did not return a View from onCreateView() or this was called before onCreateView().");
        }
    }

    @Override // z3.m
    public /* synthetic */ z3.d l(int i10, int i11, byte[] bArr) {
        return sc.e.a(this, bArr, i11);
    }

    @Override // androidx.activity.result.b
    public void m(Object obj) {
        switch (this.a) {
            case 7:
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                j0 j0Var = (j0) this.b;
                f0 f0Var = (f0) j0Var.F.pollFirst();
                if (f0Var != null) {
                    String str = f0Var.a;
                    int i10 = f0Var.b;
                    androidx.fragment.app.s s10 = j0Var.c.s(str);
                    if (s10 != null) {
                        s10.x(i10, aVar.a, aVar.b);
                        break;
                    } else {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                        break;
                    }
                } else {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    break;
                }
            default:
                ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.b;
                androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = aVar2.b;
                int i11 = com.google.android.gms.internal.play_billing.u.e("ProxyBillingActivityV2", intent).a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.M;
                if (resultReceiver != null) {
                    resultReceiver.send(i11, intent == null ? null : intent.getExtras());
                }
                int i12 = aVar2.a;
                if (i12 != -1 || i11 != 0) {
                    com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i12 + " and billing's responseCode: " + i11);
                }
                proxyBillingActivityV2.finish();
                break;
        }
    }

    @Override // ig.b1
    public void n() {
        a1 a1Var = (a1) this.b;
        a1Var.b.a.B();
        a1Var.x.setViewHidden(false);
        PhotoViewer photoViewer = ((dr0) a1Var).K;
        Drawable[] drawableArr = PhotoViewer.U8;
        photoViewer.a3(true, true);
    }

    @Override // z3.m
    public int o() {
        return 2;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        d6.c.h((d6.c) ((d6.j) this.b).c, "joinApplication", task);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z10, InvocationHandler invocationHandler2) {
        a5.a aVar;
        a5.a aVar2;
        WebMessageBoundaryInterface webMessageBoundaryInterface = (WebMessageBoundaryInterface) me.b.b(WebMessageBoundaryInterface.class, invocationHandler);
        InvocationHandler[] ports = webMessageBoundaryInterface.getPorts();
        za.c[] cVarArr = new za.c[ports.length];
        for (int i10 = 0; i10 < ports.length; i10++) {
            InvocationHandler invocationHandler3 = ports[i10];
            za.c cVar = new za.c(6, false);
            cVar.b = (WebMessagePortBoundaryInterface) me.b.b(WebMessagePortBoundaryInterface.class, invocationHandler3);
            cVarArr[i10] = cVar;
        }
        if (b5.m.a.b()) {
            WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) me.b.b(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
            int type = webMessagePayloadBoundaryInterface.getType();
            if (type == 0) {
                aVar = new a5.a(webMessagePayloadBoundaryInterface.getAsString());
            } else {
                if (type != 1) {
                    aVar2 = null;
                    if (aVar2 == null) {
                        JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) me.b.b(JsReplyProxyBoundaryInterface.class, invocationHandler2);
                        ((a5.b) this.b).c(webView, aVar2, uri, z10, (b5.h) jsReplyProxyBoundaryInterface.getOrCreatePeer(new b5.g(jsReplyProxyBoundaryInterface, 0)));
                        return;
                    }
                    return;
                }
                aVar = new a5.a(webMessagePayloadBoundaryInterface.getAsArrayBuffer());
            }
        } else {
            aVar = new a5.a(webMessageBoundaryInterface.getData());
        }
        aVar2 = aVar;
        if (aVar2 == null) {
        }
    }

    @Override // f6.a
    public void q(Bitmap bitmap) {
        ((f6.i) this.b).e(bitmap, 3);
    }

    @Override // g6.n
    public void s(String str, long j10, long j11, long j12) {
        e6.n nVar = (e6.n) this.b;
        try {
            nVar.a(new e6.m(new Status(2103, null, null, null), 1));
        } catch (IllegalStateException e) {
            g6.b bVar = e6.h.k;
            Log.e(bVar.a, bVar.d("Result already set when calling onRequestReplaced", new Object[0]), e);
        }
        Iterator it = nVar.q.i.iterator();
        while (it.hasNext()) {
            ((e6.g) it.next()).h(str, j10, 2103, j11, j12);
        }
    }

    @Override // ig.b1
    public void t() {
        ((a1) this.b).x.setViewHidden(true);
    }

    public void u(bb.e0 e0Var) {
        ((l5.q) ((i5.f) ((qa.b) this.b).get())).a("FIREBASE_APPQUALITY_SESSION", new i5.c("json"), new a1.c(this, 6)).a(new i5.a(null, e0Var, i5.d.a, null), new k2.k0(5));
    }

    public byte v() {
        int read = ((ff.a) this.b).read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override // bi.m1
    public void w(CharSequence charSequence) {
        k3 k3Var = ((z5) this.b).E;
        if (k3Var == null || charSequence == null || charSequence.length() <= 0) {
            return;
        }
        k3Var.a.w4(charSequence.toString());
    }

    @Override // bi.m1
    public /* synthetic */ boolean x(n1 n1Var) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004d A[LOOP:0: B:16:0x0047->B:18:0x004d, LOOP_END] */
    @Override // g6.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void y(String str, long j10, int i10, Object obj, long j11, long j12) {
        int i11;
        Iterator it;
        e6.n nVar = (e6.n) this.b;
        try {
            i11 = i10;
            try {
                Status status = new Status(i11, null, null, null);
                Object obj2 = true == (obj instanceof g6.l) ? obj : null;
                if (obj2 != null) {
                }
                if (obj2 != null) {
                }
                nVar.a(new e6.m(status, 2));
            } catch (IllegalStateException e) {
                e = e;
                g6.b bVar = e6.h.k;
                Log.e(bVar.a, bVar.d("Result already set when calling onRequestCompleted", new Object[0]), e);
                it = nVar.q.i.iterator();
                while (it.hasNext()) {
                }
            }
        } catch (IllegalStateException e7) {
            e = e7;
            i11 = i10;
        }
        it = nVar.q.i.iterator();
        while (it.hasNext()) {
            ((e6.g) it.next()).h(str, j10, i11, j11, j12);
            i11 = i10;
        }
    }

    @Override // z3.m
    public void z(byte[] bArr, int i10, int i11, z3.l lVar, e2.j jVar) {
        d2.b a2;
        e2.x xVar = (e2.x) this.b;
        xVar.L(i10 + i11, bArr);
        xVar.N(i10);
        ArrayList arrayList = new ArrayList();
        while (xVar.a() > 0) {
            t6.e("Incomplete Mp4Webvtt Top Level box header found.", xVar.a() >= 8);
            int m10 = xVar.m();
            if (xVar.m() == 1987343459) {
                int i12 = m10 - 8;
                CharSequence charSequence = null;
                d2.a aVar = null;
                while (i12 > 0) {
                    t6.e("Incomplete vtt cue box header found.", i12 >= 8);
                    int m11 = xVar.m();
                    int m12 = xVar.m();
                    int i13 = m11 - 8;
                    byte[] bArr2 = xVar.a;
                    int i14 = xVar.b;
                    String str = l0.a;
                    String str2 = new String(bArr2, i14, i13, StandardCharsets.UTF_8);
                    xVar.O(i13);
                    i12 = (i12 - 8) - i13;
                    if (m12 == 1937011815) {
                        i4.g gVar = new i4.g();
                        i4.h.e(str2, gVar);
                        aVar = gVar.a();
                    } else if (m12 == 1885436268) {
                        charSequence = i4.h.f(null, str2.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (aVar != null) {
                    aVar.a = charSequence;
                    aVar.b = null;
                    a2 = aVar.a();
                } else {
                    Pattern pattern = i4.h.a;
                    i4.g gVar2 = new i4.g();
                    gVar2.c = charSequence;
                    a2 = gVar2.a().a();
                }
                arrayList.add(a2);
            } else {
                xVar.O(m10 - 8);
            }
        }
        jVar.accept(new z3.a(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    public /* synthetic */ h(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public h(byte[] bArr, int i10) {
        this.a = 17;
        ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, i10);
        this.b = wrap;
        wrap.order(ByteOrder.LITTLE_ENDIAN);
    }

    public h(Context context) {
        this.a = 0;
        this.b = context.getApplicationContext();
    }

    public h(x6.a aVar) {
        this.a = 28;
        n6.l.g(aVar);
        this.b = aVar;
    }

    public h(ca.c cVar) {
        this.a = 21;
        this.b = new File(cVar.b, "com.crashlytics.settings.json");
    }

    public h(int i10) {
        this.a = i10;
        switch (i10) {
            case 13:
                break;
            case 27:
                this.b = new e2.x();
                break;
            default:
                this.b = new r2.y(yb.a.h, 18);
                break;
        }
    }

    public h(LaunchActivity launchActivity, Executor executor, v7.l lVar) {
        this.a = 5;
        if (launchActivity == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        }
        if (executor != null) {
            k0 s10 = launchActivity.s();
            y yVar = (y) new android.support.v4.media.session.a0(launchActivity).n(y.class);
            this.b = s10;
            yVar.d = executor;
            yVar.e = lVar;
            return;
        }
        throw new IllegalArgumentException("Executor must not be null.");
    }

    @Override // ig.b1
    public /* synthetic */ void g() {
    }

    @Override // ig.b1
    public void j() {
    }

    @Override // bi.m1
    public /* synthetic */ void r() {
    }

    @Override // z3.m
    public /* synthetic */ void reset() {
    }

    @Override // bi.m1
    public /* synthetic */ void e(n1 n1Var) {
    }
}
