package a6;

import ai.ac;
import ai.da;
import ai.e6;
import ai.o8;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Log;
import android.view.TextureView;
import android.webkit.WebView;
import androidx.biometric.p;
import androidx.biometric.t;
import androidx.biometric.x;
import androidx.fragment.app.g0;
import androidx.fragment.app.l0;
import androidx.fragment.app.v;
import androidx.lifecycle.a0;
import androidx.lifecycle.z;
import c6.d0;
import c6.e0;
import ci.b7;
import ci.m0;
import ci.z6;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.internal.cast.b5;
import com.google.android.gms.internal.cast.f1;
import com.google.android.gms.internal.cast.f2;
import com.google.android.gms.internal.cast.r0;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.internal.vision.e2;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import ei.y4;
import fb.n;
import g6.q;
import g6.r;
import g6.w;
import i2.j0;
import ii.a1;
import ii.c3;
import ii.g5;
import ii.h1;
import ii.i2;
import ii.i5;
import ii.k0;
import ii.p2;
import ii.s3;
import ii.x3;
import j$.util.Objects;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import k2.i0;
import lg.o;
import m.i1;
import n4.y;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Components.a81;
import org.telegram.ui.Components.d81;
import org.telegram.ui.Components.ih;
import org.telegram.ui.Components.vi;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.gv0;
import org.telegram.ui.web.b0;
import org.telegram.ui.web.c1;
import org.telegram.ui.web.x1;
import org.telegram.ui.web.z0;
import qg.b2;
import v7.m8;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes.dex */
public final class m implements gv0, a0, androidx.activity.result.b, WebMessageListenerBoundaryInterface, s, o, a81, OnSuccessListener, n, i1, vi, k0, h1, k2.o {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ m(r rVar, String[] strArr) {
        this.a = 19;
        this.b = strArr;
    }

    public static int M(int i10, String str) {
        int V = V(i10);
        int y3 = y(str);
        return X(y3) + y3 + V;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v20 */
    public static void P(CharSequence charSequence, ByteBuffer byteBuffer) {
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
        } catch (ArrayIndexOutOfBoundsException e7) {
            BufferOverflowException bufferOverflowException = new BufferOverflowException();
            bufferOverflowException.initCause(e7);
            throw bufferOverflowException;
        }
    }

    public static int U(long j3) {
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

    public static int V(int i10) {
        return X(i10 << 3);
    }

    public static int X(int i10) {
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

    public static int y(CharSequence charSequence) {
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

    @Override // k2.o
    public void A() {
        ((i0) this.b).h1 = true;
    }

    @Override // ii.h1
    public void B(Editable editable) {
        ((i5) this.b).h();
    }

    @Override // k2.o
    public void C(k2.l lVar) {
        y yVar = ((i0) this.b).Y0;
        Handler handler = (Handler) yVar.b;
        if (handler != null) {
            handler.post(new k2.i(yVar, lVar, 0));
        }
    }

    public void D(int i10, byte[] bArr) {
        O(i10, 2);
        L(bArr.length);
        int length = bArr.length;
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        if (byteBuffer.remaining() < length) {
            throw new b5(byteBuffer.position(), byteBuffer.limit());
        }
        byteBuffer.put(bArr, 0, length);
    }

    public void E(int i10) {
        byte b10 = (byte) i10;
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        if (!byteBuffer.hasRemaining()) {
            throw new b5(byteBuffer.position(), byteBuffer.limit());
        }
        byteBuffer.put(b10);
    }

    @Override // lg.o
    public void F() {
        ((m0) this.b).e.invalidate();
    }

    @Override // ii.h1
    public /* synthetic */ boolean G(boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.gv0
    public void G0(MessageObject messageObject) {
        ((ac) ((e6) this.b).Q1).f(true);
    }

    @Override // k2.o
    public void H() {
        j0 j0Var = ((i0) this.b).W;
        if (j0Var != null) {
            j0Var.a();
        }
    }

    @Override // org.telegram.ui.gv0
    public void I(MessageObject messageObject) {
        ((ac) ((e6) this.b).Q1).f(false);
    }

    @Override // ii.k0
    public q9 J() {
        s3 s3Var = ((a1) this.b).S;
        if (s3Var == null) {
            return null;
        }
        return s3Var.a.getTextSelectionHelper();
    }

    @Override // k2.o
    public void K(k2.l lVar) {
        y yVar = ((i0) this.b).Y0;
        Handler handler = (Handler) yVar.b;
        if (handler != null) {
            handler.post(new k2.i(yVar, lVar, 1));
        }
    }

    public void L(int i10) {
        while ((i10 & (-128)) != 0) {
            E((i10 & 127) | 128);
            i10 >>>= 7;
        }
        E(i10);
    }

    @Override // ii.k0
    public void N(CharSequence charSequence) {
        s3 s3Var = ((a1) this.b).S;
        if (s3Var != null) {
            s3Var.getClass();
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            s3Var.a.v4(charSequence.toString());
        }
    }

    public void O(int i10, int i11) {
        L((i10 << 3) | i11);
    }

    public void Q(long j3) {
        while (((-128) & j3) != 0) {
            E((((int) j3) & 127) | 128);
            j3 >>>= 7;
        }
        E((int) j3);
    }

    @Override // ii.k0
    public p9 R() {
        return (a1) this.b;
    }

    @Override // org.telegram.ui.Components.vi
    public /* synthetic */ boolean S1() {
        return false;
    }

    @Override // ii.k0
    public ii.a T() {
        return ((a1) this.b).a;
    }

    @Override // ii.k0
    public boolean W() {
        a1 a1Var = (a1) this.b;
        s3 s3Var = a1Var.S;
        if (s3Var == null) {
            return false;
        }
        ii.a aVar = a1Var.a;
        return s3Var.a.U4();
    }

    @Override // ii.k0
    public void Z(int i10, int i11) {
        a1 a1Var = (a1) this.b;
        s3 s3Var = a1Var.S;
        if (s3Var != null) {
            ii.a aVar = a1Var.a;
            i2 i2Var = s3Var.a.Q3;
            if (i2Var != null) {
                i2Var.f(i10, i11);
            }
        }
    }

    public void a(j6.l lVar, t tVar) {
        l0 l0Var = (l0) this.b;
        if (l0Var == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
            return;
        }
        if (l0Var.P()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
            return;
        }
        l0 l0Var2 = (l0) this.b;
        p pVar = (p) l0Var2.D("androidx.biometric.BiometricFragment");
        if (pVar == null) {
            pVar = new p();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(l0Var2);
            aVar.f(0, pVar, "androidx.biometric.BiometricFragment");
            aVar.e(true, true);
            l0Var2.A(true);
            l0Var2.E();
        }
        v k10 = pVar.k();
        if (k10 == null) {
            Log.e("BiometricFragment", "Not launching prompt. Client activity was null.");
            return;
        }
        x xVar = pVar.l0;
        xVar.f = lVar;
        int i10 = lVar.a;
        if (i10 == 0) {
            i10 = tVar != null ? 15 : 255;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 23 || i11 >= 30 || i10 != 15 || tVar != null) {
            xVar.g = tVar;
        } else {
            xVar.g = v7.p.a();
        }
        if (pVar.Q()) {
            pVar.l0.k = pVar.q(R.string.confirm_device_credential_password);
        } else {
            pVar.l0.k = null;
        }
        if (pVar.Q() && new aa.a(new k6.h(k10, 1)).f(255) != 0) {
            pVar.l0.n = true;
            pVar.S();
        } else if (pVar.l0.p) {
            pVar.k0.postDelayed(new androidx.biometric.o(pVar), 600L);
        } else {
            pVar.X();
        }
    }

    @Override // org.telegram.ui.Components.vi
    public /* synthetic */ boolean a0() {
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 10:
                w wVar = (w) obj;
                g6.f fVar = (g6.f) wVar.u();
                d0 d0Var = ((e0) this.b).k;
                Parcel O0 = fVar.O0();
                com.google.android.gms.internal.cast.v.d(O0, d0Var);
                fVar.T0(O0, 18);
                g6.f fVar2 = (g6.f) wVar.u();
                fVar2.T0(fVar2.O0(), 17);
                ((TaskCompletionSource) obj2).setResult(null);
                break;
            case 19:
                q qVar = new q(1, (TaskCompletionSource) obj2);
                g6.i iVar = (g6.i) ((g6.s) obj).u();
                String[] strArr = (String[]) this.b;
                Parcel O02 = iVar.O0();
                com.google.android.gms.internal.cast.v.d(O02, qVar);
                O02.writeStringArray(strArr);
                iVar.T0(O02, 6);
                break;
            default:
                GetCredentialRequest getCredentialRequest = (GetCredentialRequest) this.b;
                h7.f fVar3 = new h7.f(1, (TaskCompletionSource) obj2);
                h7.d dVar = (h7.d) ((h7.e) obj).u();
                com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true));
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i10 = q7.a.a;
                obtain.writeStrongBinder(fVar3);
                q7.a.b(obtain, getCredentialRequest);
                q7.a.b(obtain, gVar);
                ((h7.b) dVar).G0(obtain, 1);
                break;
        }
    }

    @Override // ii.k0
    public void b(ii.i1 i1Var) {
        switch (this.a) {
            case 25:
                s3 s3Var = ((a1) this.b).S;
                if (s3Var != null) {
                    x3 x3Var = s3Var.a;
                    x3.O1(x3Var, i1Var);
                    x3Var.o3.P(i1Var, true);
                    break;
                }
                break;
            default:
                g5 g5Var = ((i5) this.b).s;
                if (g5Var != null) {
                    x3 x3Var2 = ((c3) g5Var).a;
                    x3.O1(x3Var2, i1Var);
                    x3Var2.o3.P(i1Var, true);
                    break;
                }
                break;
        }
    }

    public float c(ic.c cVar, ic.c cVar2) {
        int i10 = (int) cVar.a;
        int i11 = (int) cVar.b;
        int i12 = (int) cVar2.a;
        int i13 = (int) cVar2.b;
        float v = v(i10, i11, i12, i13);
        float v9 = v((int) cVar2.a, i13, (int) cVar.a, i11);
        return Float.isNaN(v) ? v9 / 7.0f : Float.isNaN(v9) ? v / 7.0f : (v + v9) / 14.0f;
    }

    @Override // k2.o
    public void d(long j3) {
        y yVar = ((i0) this.b).Y0;
        Handler handler = (Handler) yVar.b;
        if (handler != null) {
            handler.post(new ai.j(yVar, j3, 12));
        }
    }

    @Override // ii.h1
    public /* synthetic */ boolean e() {
        return false;
    }

    @Override // ii.k0
    public void g() {
        a1 a1Var = (a1) this.b;
        s3 s3Var = a1Var.S;
        if (s3Var != null) {
            x3.R1(s3Var.a, a1Var.a);
        }
    }

    @Override // ii.k0
    public void g0() {
        a1 a1Var = (a1) this.b;
        s3 s3Var = a1Var.S;
        if (s3Var != null) {
            ii.a aVar = a1Var.a;
            x3 x3Var = s3Var.a;
            i2 i2Var = x3Var.Q3;
            if (i2Var != null) {
                i2Var.g();
            }
            x3Var.o3.onContentChanged();
        }
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x022c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x061b  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0637  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x05e7 A[Catch: a | c -> 0x067a, TryCatch #1 {a | c -> 0x067a, blocks: (B:292:0x05cd, B:293:0x05e3, B:295:0x05e7, B:296:0x05ea, B:298:0x05ee, B:300:0x05f8, B:302:0x05fe, B:307:0x0603), top: B:291:0x05cd }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public aa.a h(of.b bVar) {
        ArrayList arrayList;
        ic.c cVar;
        ic.c cVar2;
        ic.c cVar3;
        float f7;
        float f10;
        ic.a aVar;
        float f11;
        float f12;
        float f13;
        int i10;
        int i11;
        cc.j[] jVarArr;
        cc.a aVar2;
        dc.b bVar2;
        int i12;
        dc.d dVar;
        int i13;
        aa.a aVar3;
        List list;
        String str;
        int i14;
        boolean z10;
        double d;
        double abs;
        int i15;
        char c10;
        int i16;
        xa.c cVar4 = (xa.c) this.b;
        dc.b C = bVar.C();
        m mVar = new m(C, 24);
        ic.e eVar = new ic.e(C);
        int i17 = C.b;
        int i18 = C.a;
        int i19 = (i17 * 3) / 388;
        if (i19 < 3) {
            i19 = 3;
        }
        int[] iArr = new int[5];
        int i20 = i19 - 1;
        int i21 = 0;
        boolean z11 = false;
        while (true) {
            int i22 = 1;
            arrayList = eVar.b;
            if (i20 >= i17 || z11) {
                break;
            }
            Arrays.fill(iArr, i21);
            int i23 = 0;
            while (i23 < i18) {
                if (C.b(i23, i20)) {
                    if ((i21 & 1) == i22) {
                        i21++;
                    }
                    iArr[i21] = iArr[i21] + i22;
                    i15 = i17;
                } else {
                    if ((i21 & 1) != 0) {
                        i15 = i17;
                        iArr[i21] = iArr[i21] + 1;
                    } else if (i21 == 4) {
                        if (!ic.e.b(iArr)) {
                            i15 = i17;
                            iArr[0] = iArr[2];
                            iArr[1] = iArr[3];
                            iArr[2] = iArr[4];
                            iArr[3] = 1;
                            iArr[4] = 0;
                        } else if (eVar.c(i20, i23, iArr)) {
                            if (eVar.c) {
                                z11 = eVar.d();
                                i15 = i17;
                            } else {
                                if (arrayList.size() > i22) {
                                    int size = arrayList.size();
                                    int i24 = 0;
                                    ic.c cVar5 = null;
                                    while (true) {
                                        if (i24 >= size) {
                                            i15 = i17;
                                            c10 = 2;
                                            i16 = 0;
                                            break;
                                        }
                                        Object obj = arrayList.get(i24);
                                        i24++;
                                        ic.c cVar6 = (ic.c) obj;
                                        i15 = i17;
                                        if (cVar6.d >= 2) {
                                            if (cVar5 != null) {
                                                eVar.c = true;
                                                c10 = 2;
                                                i16 = ((int) (Math.abs(cVar5.a - cVar6.a) - Math.abs(cVar5.b - cVar6.b))) / 2;
                                                break;
                                            }
                                            cVar5 = cVar6;
                                        }
                                        i17 = i15;
                                    }
                                } else {
                                    i15 = i17;
                                    i16 = 0;
                                    c10 = 2;
                                }
                                if (i16 > iArr[c10]) {
                                    i20 += (i16 - r5) - 2;
                                    i23 = i18 - 1;
                                }
                            }
                            Arrays.fill(iArr, 0);
                            i19 = 2;
                            i21 = 0;
                        } else {
                            i15 = i17;
                            iArr[0] = iArr[2];
                            iArr[1] = iArr[3];
                            iArr[2] = iArr[4];
                            iArr[3] = 1;
                            iArr[4] = 0;
                        }
                        i21 = 3;
                    } else {
                        i15 = i17;
                        int i25 = i21 + 1;
                        iArr[i25] = iArr[i25] + 1;
                        i21 = i25;
                    }
                    i23++;
                    i17 = i15;
                    i22 = 1;
                }
                i23++;
                i17 = i15;
                i22 = 1;
            }
            int i26 = i17;
            if (ic.e.b(iArr) && eVar.c(i20, i18, iArr)) {
                int i27 = iArr[0];
                if (eVar.c) {
                    i19 = i27;
                    z11 = eVar.d();
                } else {
                    i19 = i27;
                }
            }
            i20 += i19;
            i17 = i26;
            i21 = 0;
        }
        if (arrayList.size() < 3) {
            throw cc.e.a();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((ic.c) it.next()).d < 2) {
                it.remove();
            }
        }
        Collections.sort(arrayList, ic.e.e);
        ic.c[] cVarArr = new ic.c[3];
        int i28 = 0;
        double d10 = Double.MAX_VALUE;
        for (int i29 = 2; i28 < arrayList.size() - i29; i29 = 2) {
            ic.c cVar7 = (ic.c) arrayList.get(i28);
            float f14 = cVar7.c;
            i28++;
            int i30 = i28;
            while (i30 < arrayList.size() - 1) {
                ic.c cVar8 = (ic.c) arrayList.get(i30);
                double e7 = ic.e.e(cVar7, cVar8);
                i30++;
                for (int i31 = i30; i31 < arrayList.size(); i31++) {
                    ic.c cVar9 = (ic.c) arrayList.get(i31);
                    if (cVar9.c <= 1.4f * f14) {
                        double e10 = ic.e.e(cVar8, cVar9);
                        double e11 = ic.e.e(cVar7, cVar9);
                        if (e7 < e10) {
                            if (e10 <= e11) {
                                e11 = e10;
                                e10 = e11;
                            } else if (e7 >= e11) {
                                d = e11;
                                e11 = e7;
                                abs = Math.abs(e10 - (d * 2.0d)) + Math.abs(e10 - (e11 * 2.0d));
                                if (abs >= d10) {
                                    cVarArr[0] = cVar7;
                                    cVarArr[1] = cVar8;
                                    cVarArr[2] = cVar9;
                                    d10 = abs;
                                }
                            }
                            d = e7;
                            abs = Math.abs(e10 - (d * 2.0d)) + Math.abs(e10 - (e11 * 2.0d));
                            if (abs >= d10) {
                            }
                        } else {
                            if (e10 >= e11) {
                                d = e11;
                                e11 = e10;
                            } else if (e7 < e11) {
                                d = e10;
                                e10 = e11;
                                e11 = e7;
                                abs = Math.abs(e10 - (d * 2.0d)) + Math.abs(e10 - (e11 * 2.0d));
                                if (abs >= d10) {
                                }
                            } else {
                                d = e10;
                            }
                            e10 = e7;
                            abs = Math.abs(e10 - (d * 2.0d)) + Math.abs(e10 - (e11 * 2.0d));
                            if (abs >= d10) {
                            }
                        }
                    }
                }
            }
        }
        if (d10 == Double.MAX_VALUE) {
            throw cc.e.a();
        }
        float a2 = cc.j.a(cVarArr[0], cVarArr[1]);
        float a10 = cc.j.a(cVarArr[1], cVarArr[2]);
        float a11 = cc.j.a(cVarArr[0], cVarArr[2]);
        if (a10 >= a2 && a10 >= a11) {
            cVar = cVarArr[0];
            cVar2 = cVarArr[1];
            cVar3 = cVarArr[2];
        } else if (a11 < a10 || a11 < a2) {
            cVar = cVarArr[2];
            cVar2 = cVarArr[0];
            cVar3 = cVarArr[1];
        } else {
            cVar = cVarArr[1];
            cVar2 = cVarArr[0];
            cVar3 = cVarArr[2];
        }
        float f15 = cVar.a;
        float f16 = cVar.b;
        if (e2.b(cVar2.a, f15, cVar3.b - f16, (cVar2.b - f16) * (cVar3.a - f15)) < 0.0f) {
            ic.c cVar10 = cVar3;
            cVar3 = cVar2;
            cVar2 = cVar10;
        }
        cVarArr[0] = cVar2;
        cVarArr[1] = cVar;
        cVarArr[2] = cVar3;
        float c11 = mVar.c(cVar, cVar3);
        float f17 = cVar.a;
        float f18 = cVar3.b;
        float f19 = cVar3.a;
        float c12 = mVar.c(cVar, cVar2);
        float f20 = cVar2.b;
        float f21 = cVar2.a;
        float f22 = (c12 + c11) / 2.0f;
        if (f22 < 1.0f) {
            throw cc.e.a();
        }
        float a12 = cc.j.a(cVar, cVar3) / f22;
        int i32 = (int) (a12 + (a12 < 0.0f ? -0.5f : 0.5f));
        float a13 = cc.j.a(cVar, cVar2) / f22;
        int i33 = (((int) (a13 + (a13 >= 0.0f ? 0.5f : -0.5f))) + i32) / 2;
        int i34 = i33 + 7;
        int i35 = i34 & 3;
        if (i35 == 0) {
            i34 = i33 + 8;
        } else if (i35 == 2) {
            i34 = i33 + 6;
        } else if (i35 == 3) {
            i34 = i33 + 5;
        }
        int i36 = i34;
        int[] iArr2 = hc.f.e;
        if (i36 % 4 != 1) {
            throw cc.c.a();
        }
        try {
            hc.f c13 = hc.f.c((i36 - 17) / 4);
            int i37 = (c13.a * 4) + 10;
            if (c13.b.length > 0) {
                float f23 = (f19 - f17) + f21;
                f10 = f19;
                float f24 = (f18 - f16) + f20;
                float f25 = 1.0f - (3.0f / i37);
                int z12 = (int) e2.z(f23, f17, f25, f17);
                int z13 = (int) e2.z(f24, f16, f25, f16);
                f7 = f17;
                for (int i38 = 4; i38 <= 16; i38 <<= 1) {
                    try {
                        aVar = mVar.i(f22, i38, z12, z13);
                        break;
                    } catch (cc.e unused) {
                    }
                }
            } else {
                f7 = f17;
                f10 = f19;
            }
            aVar = null;
            float f26 = i36 - 3.5f;
            if (aVar != null) {
                f11 = aVar.a;
                f12 = aVar.b;
                f13 = f26 - 3.0f;
            } else {
                f11 = (f10 - f7) + f21;
                f12 = (f18 - f16) + f20;
                f13 = f26;
            }
            float f27 = f12;
            float f28 = cVar.a;
            float f29 = cVar.b;
            float f30 = cVar3.a;
            float f31 = cVar3.b;
            float f32 = cVar2.a;
            float f33 = cVar2.b;
            dc.g a14 = dc.g.a(3.5f, 3.5f, f26, 3.5f, f13, f13, 3.5f, f26);
            ic.a aVar4 = aVar;
            float f34 = a14.e;
            float f35 = a14.i;
            float f36 = f34 * f35;
            float f37 = a14.f;
            float f38 = a14.h;
            float f39 = f36 - (f37 * f38);
            float f40 = a14.g;
            float f41 = f37 * f40;
            float f42 = a14.d;
            float f43 = f41 - (f42 * f35);
            float f44 = (f42 * f38) - (f34 * f40);
            float f45 = a14.c;
            float f46 = f45 * f38;
            float f47 = a14.b;
            float f48 = f46 - (f47 * f35);
            float f49 = a14.a;
            float f50 = (f35 * f49) - (f45 * f40);
            float f51 = (f40 * f47) - (f38 * f49);
            float f52 = (f47 * f37) - (f45 * f34);
            float f53 = (f45 * f42) - (f37 * f49);
            float f54 = (f49 * f34) - (f47 * f42);
            dc.g a15 = dc.g.a(f28, f29, f30, f31, f11, f27, f32, f33);
            float f55 = a15.a;
            float f56 = a15.d;
            float f57 = a15.g;
            float f58 = (f57 * f52) + (f56 * f48) + (f55 * f39);
            float f59 = (f57 * f53) + (f56 * f50) + (f55 * f43);
            float f60 = (f57 * f54) + (f56 * f51) + (f55 * f44);
            float f61 = a15.b;
            float f62 = a15.e;
            float f63 = a15.h;
            float f64 = (f63 * f52) + (f62 * f48) + (f61 * f39);
            float f65 = (f63 * f53) + (f62 * f50) + (f61 * f43);
            float f66 = (f63 * f54) + (f62 * f51) + (f61 * f44);
            float f67 = a15.c;
            float f68 = a15.f;
            float f69 = a15.i;
            float f70 = (f52 * f69) + (f48 * f68) + (f39 * f67);
            float f71 = (f53 * f69) + (f50 * f68) + (f43 * f67);
            float f72 = (f69 * f54) + (f68 * f51) + (f67 * f44);
            if (i36 <= 0 || i36 <= 0) {
                throw cc.e.a();
            }
            dc.b bVar3 = new dc.b(i36, i36);
            int i39 = i36 * 2;
            ic.c cVar11 = cVar;
            float[] fArr = new float[i39];
            int i40 = 0;
            while (i40 < i36) {
                int i41 = i36;
                float f73 = i40 + 0.5f;
                int i42 = 0;
                while (i42 < i39) {
                    int i43 = i42;
                    fArr[i43] = (i43 / 2) + 0.5f;
                    fArr[i43 + 1] = f73;
                    i42 = i43 + 2;
                }
                int i44 = i39 - 1;
                int i45 = i40;
                int i46 = 0;
                while (i46 < i44) {
                    float f74 = fArr[i46];
                    int i47 = i46 + 1;
                    int i48 = i46;
                    float f75 = fArr[i47];
                    ic.c cVar12 = cVar2;
                    float d11 = t8.b.d(f71, f75, f70 * f74, f72);
                    fArr[i48] = (((f59 * f75) + (f58 * f74)) + f60) / d11;
                    fArr[i47] = (((f75 * f65) + (f74 * f64)) + f66) / d11;
                    i46 = i48 + 2;
                    cVar2 = cVar12;
                }
                ic.c cVar13 = cVar2;
                int i49 = C.b;
                float f76 = f71;
                int i50 = 0;
                boolean z14 = true;
                while (i50 < i44 && z14) {
                    int i51 = (int) fArr[i50];
                    int i52 = i50 + 1;
                    int i53 = i44;
                    int i54 = (int) fArr[i52];
                    int i55 = i50;
                    if (i51 < -1 || i51 > i18 || i54 < -1 || i54 > i49) {
                        throw cc.e.a();
                    }
                    if (i51 == -1) {
                        fArr[i55] = 0.0f;
                    } else if (i51 == i18) {
                        fArr[i55] = i18 - 1;
                    } else {
                        z10 = false;
                        if (i54 != -1) {
                            fArr[i52] = 0.0f;
                        } else if (i54 == i49) {
                            fArr[i52] = i49 - 1;
                        } else {
                            z14 = z10;
                            i50 = i55 + 2;
                            i44 = i53;
                        }
                        z14 = true;
                        i50 = i55 + 2;
                        i44 = i53;
                    }
                    z10 = true;
                    if (i54 != -1) {
                    }
                    z14 = true;
                    i50 = i55 + 2;
                    i44 = i53;
                }
                int i56 = i39 - 2;
                boolean z15 = true;
                while (i56 >= 0 && z15) {
                    int i57 = (int) fArr[i56];
                    int i58 = i56 + 1;
                    int i59 = i56;
                    int i60 = (int) fArr[i58];
                    if (i57 < -1 || i57 > i18 || i60 < -1 || i60 > i49) {
                        throw cc.e.a();
                    }
                    if (i57 == -1) {
                        fArr[i59] = 0.0f;
                    } else if (i57 == i18) {
                        fArr[i59] = i18 - 1;
                    } else {
                        z15 = false;
                        if (i60 != -1) {
                            fArr[i58] = 0.0f;
                        } else if (i60 == i49) {
                            fArr[i58] = i49 - 1;
                        } else {
                            i56 = i59 - 2;
                        }
                        z15 = true;
                        i56 = i59 - 2;
                    }
                    z15 = true;
                    if (i60 != -1) {
                    }
                    z15 = true;
                    i56 = i59 - 2;
                }
                for (int i61 = 0; i61 < i39; i61 += 2) {
                    try {
                        if (C.b((int) fArr[i61], (int) fArr[i61 + 1])) {
                            int i62 = i61 / 2;
                            int i63 = (i62 / 32) + (bVar3.c * i45);
                            int[] iArr3 = bVar3.d;
                            iArr3[i63] = iArr3[i63] | (1 << (i62 & 31));
                        }
                    } catch (ArrayIndexOutOfBoundsException unused2) {
                        throw cc.e.a();
                    }
                }
                i40 = i45 + 1;
                i36 = i41;
                f71 = f76;
                cVar2 = cVar13;
            }
            ic.c cVar14 = cVar2;
            if (aVar4 == null) {
                i11 = 3;
                i10 = 1;
                jVarArr = new cc.j[]{cVar14, cVar11, cVar3};
            } else {
                i10 = 1;
                i11 = 3;
                jVarArr = new cc.j[]{cVar14, cVar11, cVar3, aVar4};
            }
            cc.j[] jVarArr2 = jVarArr;
            cVar4.getClass();
            com.google.firebase.messaging.m mVar2 = new com.google.firebase.messaging.m();
            int i64 = bVar3.b;
            if (i64 < 21 || (i64 & i11) != i10) {
                throw cc.c.a();
            }
            mVar2.b = bVar3;
            try {
                dVar = cVar4.H(mVar2);
            } catch (cc.a e12) {
                aVar2 = e12;
                e = null;
                try {
                    mVar2.r();
                    mVar2.c = null;
                    mVar2.d = null;
                    mVar2.a = true;
                    mVar2.q();
                    mVar2.p();
                    bVar2 = (dc.b) mVar2.b;
                    i12 = 0;
                    while (i12 < bVar2.a) {
                        int i65 = i12 + 1;
                        for (int i66 = i65; i66 < bVar2.b; i66++) {
                            if (bVar2.b(i12, i66) != bVar2.b(i66, i12)) {
                                bVar2.a(i66, i12);
                                bVar2.a(i12, i66);
                            }
                        }
                        i12 = i65;
                    }
                    dc.d H = cVar4.H(mVar2);
                    H.e = new na.d(10);
                    dVar = H;
                    i13 = dVar.f;
                    if (e2.u(dVar.e)) {
                        cc.j jVar = jVarArr2[0];
                        jVarArr2[0] = jVarArr2[2];
                        jVarArr2[2] = jVar;
                    }
                    aVar3 = new aa.a(dVar.a, jVarArr2);
                    list = dVar.b;
                    if (list != null) {
                    }
                    str = dVar.c;
                    if (str != null) {
                    }
                    if (i13 >= 0) {
                        aVar3.r(cc.i.d, Integer.valueOf(i14));
                        aVar3.r(cc.i.e, Integer.valueOf(i13));
                    }
                    aVar3.r(cc.i.c, dVar.d);
                    aVar3.r(cc.i.f, "]Q" + dVar.h);
                    return aVar3;
                } catch (cc.a | cc.c unused3) {
                    if (e != null) {
                        throw e;
                    }
                    throw aVar2;
                }
            } catch (cc.c e13) {
                e = e13;
                aVar2 = null;
                mVar2.r();
                mVar2.c = null;
                mVar2.d = null;
                mVar2.a = true;
                mVar2.q();
                mVar2.p();
                bVar2 = (dc.b) mVar2.b;
                i12 = 0;
                while (i12 < bVar2.a) {
                }
                dc.d H2 = cVar4.H(mVar2);
                H2.e = new na.d(10);
                dVar = H2;
                i13 = dVar.f;
                if (e2.u(dVar.e)) {
                }
                aVar3 = new aa.a(dVar.a, jVarArr2);
                list = dVar.b;
                if (list != null) {
                }
                str = dVar.c;
                if (str != null) {
                }
                if (i13 >= 0) {
                }
                aVar3.r(cc.i.c, dVar.d);
                aVar3.r(cc.i.f, "]Q" + dVar.h);
                return aVar3;
            }
            i13 = dVar.f;
            if (e2.u(dVar.e) && jVarArr2.length >= 3) {
                cc.j jVar2 = jVarArr2[0];
                jVarArr2[0] = jVarArr2[2];
                jVarArr2[2] = jVar2;
            }
            aVar3 = new aa.a(dVar.a, jVarArr2);
            list = dVar.b;
            if (list != null) {
                aVar3.r(cc.i.a, list);
            }
            str = dVar.c;
            if (str != null) {
                aVar3.r(cc.i.b, str);
            }
            if (i13 >= 0 && (i14 = dVar.g) >= 0) {
                aVar3.r(cc.i.d, Integer.valueOf(i14));
                aVar3.r(cc.i.e, Integer.valueOf(i13));
            }
            aVar3.r(cc.i.c, dVar.d);
            aVar3.r(cc.i.f, "]Q" + dVar.h);
            return aVar3;
        } catch (IllegalArgumentException unused4) {
            throw cc.c.a();
        }
    }

    public ic.a i(float f7, float f10, int i10, int i11) {
        ic.a b10;
        ic.a b11;
        int i12 = (int) (f10 * f7);
        int max = Math.max(0, i10 - i12);
        dc.b bVar = (dc.b) this.b;
        int min = Math.min(bVar.a - 1, i10 + i12) - max;
        float f11 = 3.0f * f7;
        if (min < f11) {
            throw cc.e.a();
        }
        int max2 = Math.max(0, i11 - i12);
        int min2 = Math.min(bVar.b - 1, i11 + i12) - max2;
        if (min2 < f11) {
            throw cc.e.a();
        }
        dc.b bVar2 = (dc.b) this.b;
        ic.b bVar3 = new ic.b(bVar2, max, max2, min, min2, f7);
        int i13 = bVar3.e;
        int i14 = bVar3.c;
        int i15 = i13 + i14;
        int i16 = bVar3.f;
        int i17 = (i16 / 2) + bVar3.d;
        int[] iArr = new int[3];
        for (int i18 = 0; i18 < i16; i18++) {
            int i19 = ((i18 & 1) == 0 ? (i18 + 1) / 2 : -((i18 + 1) / 2)) + i17;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i20 = i14;
            while (i20 < i15 && !bVar2.b(i20, i19)) {
                i20++;
            }
            int i21 = 0;
            while (i20 < i15) {
                if (!bVar2.b(i20, i19)) {
                    if (i21 == 1) {
                        i21++;
                    }
                    iArr[i21] = iArr[i21] + 1;
                } else if (i21 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i21 != 2) {
                    i21++;
                    iArr[i21] = iArr[i21] + 1;
                } else {
                    if (bVar3.a(iArr) && (b11 = bVar3.b(i19, i20, iArr)) != null) {
                        return b11;
                    }
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i21 = 1;
                }
                i20++;
            }
            if (bVar3.a(iArr) && (b10 = bVar3.b(i19, i15, iArr)) != null) {
                return b10;
            }
        }
        ArrayList arrayList = bVar3.b;
        if (arrayList.isEmpty()) {
            throw cc.e.a();
        }
        return (ic.a) arrayList.get(0);
    }

    @Override // androidx.activity.result.b
    public void j(Object obj) {
        switch (this.a) {
            case 6:
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                androidx.fragment.app.k0 k0Var = (androidx.fragment.app.k0) this.b;
                g0 g0Var = (g0) k0Var.F.pollFirst();
                if (g0Var != null) {
                    String str = g0Var.a;
                    int i10 = g0Var.b;
                    androidx.fragment.app.s l4 = k0Var.c.l(str);
                    if (l4 != null) {
                        l4.x(i10, aVar.a, aVar.b);
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
                int i11 = u.e("ProxyBillingActivityV2", intent).a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.M;
                if (resultReceiver != null) {
                    resultReceiver.send(i11, intent == null ? null : intent.getExtras());
                }
                int i12 = aVar2.a;
                if (i12 != -1 || i11 != 0) {
                    u.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i12 + " and billing's responseCode: " + i11);
                }
                proxyBillingActivityV2.finish();
                break;
        }
    }

    public Boolean k() {
        Bundle bundle = (Bundle) this.b;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override // org.telegram.ui.gv0
    public /* synthetic */ TextureView k0() {
        return null;
    }

    @Override // ii.h1
    public void l(ii.i1 i1Var) {
        ii.a aVar;
        i5 i5Var = (i5) this.b;
        g5 g5Var = i5Var.s;
        if (g5Var == null || (aVar = i5Var.a) == null) {
            return;
        }
        x3 x3Var = ((c3) g5Var).a;
        ArrayList arrayList = x3Var.s3;
        long j3 = aVar.t;
        if (j3 == 0) {
            return;
        }
        int i10 = -1;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (((ii.a) arrayList.get(i11)).k.contains(Long.valueOf(j3))) {
                i10 = i11;
            }
        }
        if (i10 < 0) {
            return;
        }
        i2 i2Var = x3Var.Q3;
        if (i2Var != null) {
            i2Var.d();
        }
        ii.a aVar2 = new ii.a(new TL_iv.pageBlockParagraph(), 0, 0);
        ArrayList arrayList2 = aVar.k;
        ArrayList arrayList3 = aVar2.k;
        arrayList3.addAll(arrayList2);
        if (!arrayList3.isEmpty()) {
            a4.a.x(1, arrayList3);
        }
        arrayList.add(i10 + 1, aVar2);
        x3Var.u4();
        x3Var.f3.N(false);
        i2 i2Var2 = x3Var.Q3;
        if (i2Var2 != null) {
            i2Var2.h();
        }
        x3Var.post(new p2(x3Var, aVar2, 26));
    }

    @Override // k2.o
    public void m() {
        ((i0) this.b).j1 = true;
    }

    @Override // ii.h1
    public /* synthetic */ boolean n(ii.i1 i1Var) {
        return false;
    }

    @Override // k2.o
    public void o() {
        j0 j0Var = ((i0) this.b).W;
        if (j0Var != null) {
            j0Var.a.g0 = true;
        }
    }

    @Override // k2.o
    public void onAudioSessionIdChanged(int i10) {
        r2.j jVar;
        i0 i0Var = (i0) this.b;
        if (Build.VERSION.SDK_INT >= 35 && (jVar = i0Var.a1) != null) {
            jVar.d(i10);
        }
        y yVar = i0Var.Y0;
        Handler handler = (Handler) yVar.b;
        if (handler != null) {
            handler.post(new o8(yVar, i10, 11));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z10, InvocationHandler invocationHandler2) {
        a5.a aVar;
        a5.a aVar2;
        b5.h hVar;
        WebMessageBoundaryInterface webMessageBoundaryInterface = (WebMessageBoundaryInterface) se.b.a(WebMessageBoundaryInterface.class, invocationHandler);
        InvocationHandler[] ports = webMessageBoundaryInterface.getPorts();
        xa.c[] cVarArr = new xa.c[ports.length];
        for (int i10 = 0; i10 < ports.length; i10++) {
            InvocationHandler invocationHandler3 = ports[i10];
            xa.c cVar = new xa.c(6);
            cVar.b = (WebMessagePortBoundaryInterface) se.b.a(WebMessagePortBoundaryInterface.class, invocationHandler3);
            cVarArr[i10] = cVar;
        }
        if (b5.m.a.b()) {
            WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) se.b.a(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
            int type = webMessagePayloadBoundaryInterface.getType();
            if (type == 0) {
                aVar = new a5.a(webMessagePayloadBoundaryInterface.getAsString());
            } else {
                if (type != 1) {
                    aVar2 = null;
                    if (aVar2 == null) {
                        JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) se.b.a(JsReplyProxyBoundaryInterface.class, invocationHandler2);
                        b5.h hVar2 = (b5.h) jsReplyProxyBoundaryInterface.getOrCreatePeer(new b5.g(jsReplyProxyBoundaryInterface, 0));
                        k2.v vVar = (k2.v) this.b;
                        switch (vVar.a) {
                            case 15:
                                z0 z0Var = (z0) vVar.b;
                                c1 c1Var = z0Var.Q;
                                if (webView != z0Var || c1Var == null) {
                                    return;
                                }
                                if (webView != c1Var.a || aVar2.b != 0) {
                                    c1Var.h("onBotWebMessage ignored: invalid source or payload");
                                    return;
                                }
                                String l4 = c1.l(uri == null ? null : uri.toString());
                                if (c1Var.t0 && (TextUtils.isEmpty(c1Var.F0) || !TextUtils.equals(c1Var.F0, l4) || !TextUtils.equals(c1Var.F0, c1Var.getOriginHost()))) {
                                    c1Var.h("onBotWebMessage ignored: untrusted origin");
                                    return;
                                }
                                da g10 = c1Var.g();
                                try {
                                    aVar2.e(0);
                                    String str = (String) aVar2.c;
                                    if (str != null && str.length() <= 1048576) {
                                        JSONObject jSONObject = new JSONObject(str);
                                        String string = jSONObject.getString("eventType");
                                        if (!string.isEmpty() && string.length() <= 128) {
                                            AndroidUtilities.runOnUIThread(new b0(c1Var, webView, g10, string, jSONObject.optString("eventData", null), 2));
                                            return;
                                        }
                                        c1Var.h("onBotWebMessage ignored: invalid event type");
                                        return;
                                    }
                                    c1Var.h("onBotWebMessage ignored: invalid payload length");
                                    return;
                                } catch (JSONException e7) {
                                    FileLog.e(e7);
                                    return;
                                }
                            default:
                                qi.j jVar = (qi.j) vVar.b;
                                if (webView == jVar.o && z10 && uri != null && jVar.f.equals(uri.toString()) && jVar.h(webView)) {
                                    int i11 = aVar2.b;
                                    if (i11 != 0) {
                                        if (i11 == 1) {
                                            synchronized (jVar.a) {
                                                if (!jVar.u && (hVar = jVar.p) != null && hVar == hVar2) {
                                                    aVar2.e(1);
                                                    byte[] bArr = (byte[]) aVar2.d;
                                                    Objects.requireNonNull(bArr);
                                                    jVar.k.execute(new x1(13, jVar, bArr));
                                                }
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                    aVar2.e(0);
                                    String str2 = (String) aVar2.c;
                                    if (jVar.q || str2 == null || !str2.startsWith("tproxy-base64:")) {
                                        jVar.g(str2, hVar2);
                                        return;
                                    }
                                    synchronized (jVar.a) {
                                        if (!jVar.u && jVar.r && jVar.p == hVar2) {
                                            if (str2.length() - 14 > 1398112) {
                                                jVar.f();
                                            } else {
                                                jVar.k.execute(new x1(12, jVar, str2));
                                            }
                                        }
                                    }
                                    return;
                                }
                                return;
                        }
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

    @Override // org.telegram.ui.Components.a81
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // k2.o
    public void onSkipSilenceEnabledChanged(boolean z10) {
        y yVar = ((i0) this.b).Y0;
        Handler handler = (Handler) yVar.b;
        if (handler != null) {
            handler.post(new bi.f(7, yVar, z10));
        }
    }

    @Override // org.telegram.ui.Components.a81
    public void onStateChanged(boolean z10, int i10) {
        b7 b7Var = (b7) this.b;
        z6 z6Var = b7Var.M;
        d81 d81Var = b7Var.x;
        if (d81Var == null) {
            return;
        }
        if (d81Var.y()) {
            AndroidUtilities.runOnUIThread(z6Var);
        } else {
            AndroidUtilities.cancelRunOnUIThread(z6Var);
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        f2 f2Var;
        f1 b10;
        d6.a aVar = (d6.a) this.b;
        Bundle bundle = (Bundle) obj;
        if (r0.j) {
            Context context = aVar.a;
            r rVar = aVar.f;
            r0 r0Var = new r0(context, rVar, aVar.c, aVar.j, aVar.g);
            int i10 = bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE") ? bundle.getInt("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", 0) : (bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED") && bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", false)) ? 1 : 0;
            boolean z10 = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED", false);
            if (i10 == 0) {
                if (!z10) {
                    return;
                }
                i10 = 0;
                z10 = true;
            }
            String packageName = context.getPackageName();
            Locale locale = Locale.ROOT;
            String v = t8.b.v(packageName, ".client_cast_analytics_data");
            r0Var.h = bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE") == 0 ? 1 : 2;
            l5.t.b(context);
            r0Var.g = l5.t.a().c(j5.a.e).a("CAST_SENDER_SDK", new i5.c("proto"), com.google.android.gms.internal.cast.b0.a);
            if (bundle.containsKey("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE")) {
                r0Var.e = Long.valueOf(bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE"));
            }
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(v, 0);
            if (i10 != 0) {
                com.google.android.gms.common.api.internal.v e7 = com.google.android.gms.common.api.internal.w.e();
                e7.c = new m(rVar, new String[]{"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"});
                e7.d = new k6.c[]{c6.y.c};
                e7.b = false;
                e7.a = 8426;
                Task e10 = rVar.e(0, e7.a());
                j6.l lVar = new j6.l();
                lVar.b = r0Var;
                lVar.c = packageName;
                lVar.a = i10;
                lVar.d = sharedPreferences;
                e10.addOnSuccessListener(lVar);
            }
            if (z10) {
                n6.l.h(sharedPreferences);
                g6.b bVar = f2.i;
                synchronized (f2.class) {
                    try {
                        if (f2.k == null) {
                            f2.k = new f2(sharedPreferences, r0Var, packageName);
                        }
                        f2Var = f2.k;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                String str = f2Var.c;
                SharedPreferences sharedPreferences2 = f2Var.b;
                HashSet hashSet = f2Var.f;
                String string = sharedPreferences2.getString("feature_usage_sdk_version", null);
                String string2 = sharedPreferences2.getString("feature_usage_package_name", null);
                hashSet.clear();
                HashSet hashSet2 = f2Var.g;
                hashSet2.clear();
                f2Var.h = 0L;
                String str2 = f2.j;
                if (str2.equals(string) && str.equals(string2)) {
                    f2Var.h = sharedPreferences2.getLong("feature_usage_last_report_time", 0L);
                    long currentTimeMillis = System.currentTimeMillis();
                    HashSet hashSet3 = new HashSet();
                    for (String str3 : sharedPreferences2.getAll().keySet()) {
                        if (str3.startsWith("feature_usage_timestamp_")) {
                            long j3 = sharedPreferences2.getLong(str3, 0L);
                            if (j3 != 0 && currentTimeMillis - j3 > 1209600000) {
                                hashSet3.add(str3);
                            } else if (str3.startsWith("feature_usage_timestamp_reported_feature_")) {
                                f1 b11 = f2.b(str3.substring(41));
                                if (b11 != null) {
                                    hashSet2.add(b11);
                                    hashSet.add(b11);
                                }
                            } else if (str3.startsWith("feature_usage_timestamp_detected_feature_") && (b10 = f2.b(str3.substring(41))) != null) {
                                hashSet.add(b10);
                            }
                        }
                    }
                    f2Var.c(hashSet3);
                    n6.l.h(f2Var.e);
                    n6.l.h(f2Var.d);
                    f2Var.e.post(f2Var.d);
                } else {
                    HashSet hashSet4 = new HashSet();
                    for (String str4 : sharedPreferences2.getAll().keySet()) {
                        if (str4.startsWith("feature_usage_timestamp_")) {
                            hashSet4.add(str4);
                        }
                    }
                    hashSet4.add("feature_usage_last_report_time");
                    f2Var.c(hashSet4);
                    sharedPreferences2.edit().putString("feature_usage_sdk_version", str2).putString("feature_usage_package_name", str).apply();
                }
                f2.a(f1.h);
            }
        }
    }

    @Override // org.telegram.ui.Components.a81
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.a81
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        b2 b2Var = ((b7) this.b).w;
        if (b2Var != null) {
            float f10 = i10 / i11;
            if (Math.abs(b2Var.y0 - f10) >= 1.0E-4f) {
                b2Var.y0 = f10;
                b2Var.requestLayout();
            }
        }
    }

    @Override // ii.h1
    public /* synthetic */ boolean p(ii.i1 i1Var) {
        return false;
    }

    @Override // fb.n
    public Object p2() {
        Constructor constructor = (Constructor) this.b;
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e7) {
            m8 m8Var = ib.c.a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e7);
        } catch (InstantiationException e10) {
            throw new RuntimeException("Failed to invoke constructor '" + ib.c.b(constructor) + "' with no args", e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException("Failed to invoke constructor '" + ib.c.b(constructor) + "' with no args", e11.getCause());
        }
    }

    public float q(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = 1;
        boolean z10 = Math.abs(i13 - i11) > Math.abs(i12 - i10);
        if (z10) {
            i15 = i10;
            i14 = i11;
            i17 = i12;
            i16 = i13;
        } else {
            i14 = i10;
            i15 = i11;
            i16 = i12;
            i17 = i13;
        }
        int abs = Math.abs(i16 - i14);
        int abs2 = Math.abs(i17 - i15);
        int i19 = (-abs) / 2;
        int i20 = i14 < i16 ? 1 : -1;
        int i21 = i15 < i17 ? 1 : -1;
        int i22 = i16 + i20;
        int i23 = i14;
        int i24 = i15;
        int i25 = 0;
        while (i23 != i22) {
            boolean z11 = z10;
            int i26 = abs;
            if ((i25 == i18) == ((dc.b) this.b).b(z10 ? i24 : i23, z10 ? i23 : i24)) {
                if (i25 == 2) {
                    return v7.z6.b(i23, i24, i14, i15);
                }
                i25++;
            }
            i19 += abs2;
            if (i19 > 0) {
                if (i24 == i17) {
                    break;
                }
                i24 += i21;
                i19 -= i26;
            }
            i23 += i20;
            abs = i26;
            z10 = z11;
            i18 = 1;
        }
        if (i25 == 2) {
            return v7.z6.b(i22, i17, i14, i15);
        }
        return Float.NaN;
    }

    @Override // k2.o
    public void s(int i10, long j3, long j10) {
        y yVar = ((i0) this.b).Y0;
        Handler handler = (Handler) yVar.b;
        if (handler != null) {
            handler.post(new k2.j(yVar, i10, j3, j10, 0));
        }
    }

    @Override // ii.h1
    public void t(ii.i1 i1Var, int i10, int i11) {
        g5 g5Var;
        q9 textSelectionHelper;
        i5 i5Var = (i5) this.b;
        if (i5Var.w || i10 == i11 || (g5Var = i5Var.s) == null || (textSelectionHelper = ((c3) g5Var).a.getTextSelectionHelper()) == null) {
            return;
        }
        i1Var.post(new y4(this, i1Var, i11, textSelectionHelper, i10, 3));
    }

    @Override // k2.o
    public void u() {
        x2.p pVar;
        i0 i0Var = (i0) this.b;
        synchronized (i0Var.a) {
            pVar = i0Var.H;
        }
        if (pVar != null) {
            pVar.h();
        }
    }

    public float v(int i10, int i11, int i12, int i13) {
        float f7;
        float f10;
        dc.b bVar = (dc.b) this.b;
        float q6 = q(i10, i11, i12, i13);
        int i14 = i10 - (i12 - i10);
        int i15 = 0;
        if (i14 < 0) {
            f7 = i10 / (i10 - i14);
            i14 = 0;
        } else {
            int i16 = bVar.a;
            if (i14 >= i16) {
                float f11 = ((i16 - 1) - i10) / (i14 - i10);
                int i17 = i16 - 1;
                f7 = f11;
                i14 = i17;
            } else {
                f7 = 1.0f;
            }
        }
        float f12 = i11;
        int i18 = (int) (f12 - ((i13 - i11) * f7));
        if (i18 < 0) {
            f10 = f12 / (i11 - i18);
        } else {
            int i19 = bVar.b;
            if (i18 >= i19) {
                f10 = ((i19 - 1) - i11) / (i18 - i11);
                i15 = i19 - 1;
            } else {
                i15 = i18;
                f10 = 1.0f;
            }
        }
        return (q(i10, i11, (int) (((i14 - i10) * f10) + i10), i15) + q6) - 1.0f;
    }

    @Override // ii.k0
    public void v0() {
        a1 a1Var = (a1) this.b;
        s3 s3Var = a1Var.S;
        if (s3Var != null) {
            ii.a aVar = a1Var.a;
            x3.Q1(s3Var.a);
        }
    }

    @Override // k2.o
    public void w(Exception exc) {
        e2.a.f("MediaCodecAudioRenderer", "Audio sink error", exc);
        y yVar = ((i0) this.b).Y0;
        Handler handler = (Handler) yVar.b;
        if (handler != null) {
            handler.post(new k2.g(yVar, exc, 1));
        }
    }

    @Override // androidx.lifecycle.a0
    public void w0(Object obj) {
        switch (this.a) {
            case 3:
                p pVar = (p) this.b;
                if (((Boolean) obj).booleanValue()) {
                    if (pVar.R()) {
                        pVar.W(pVar.q(R.string.fingerprint_not_recognized));
                    }
                    x xVar = pVar.l0;
                    if (xVar.n) {
                        Executor executor = xVar.d;
                        if (executor == null) {
                            executor = new androidx.biometric.n(1);
                        }
                        executor.execute(new androidx.biometric.g(pVar, 0));
                    } else {
                        Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                    }
                    x xVar2 = pVar.l0;
                    if (xVar2.u == null) {
                        xVar2.u = new z();
                    }
                    x.h(xVar2.u, Boolean.FALSE);
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

    @Override // org.telegram.ui.Components.vi
    public void x0(ih ihVar) {
        int i10;
        i10 = ((n2) ((hg.m) this.b)).currentAccount;
        NotificationCenter.getInstance(i10).doOnIdle(ihVar);
    }

    public void z(int i10, String str) {
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        O(i10, 2);
        try {
            int X = X(str.length());
            if (X != X(str.length() * 3)) {
                L(y(str));
                P(str, byteBuffer);
                return;
            }
            int position = byteBuffer.position();
            if (byteBuffer.remaining() < X) {
                throw new b5(position + X, byteBuffer.limit());
            }
            byteBuffer.position(position + X);
            P(str, byteBuffer);
            int position2 = byteBuffer.position();
            byteBuffer.position(position);
            L((position2 - position) - X);
            byteBuffer.position(position2);
        } catch (BufferOverflowException e7) {
            b5 b5Var = new b5(byteBuffer.position(), byteBuffer.limit());
            b5Var.initCause(e7);
            throw b5Var;
        }
    }

    public /* synthetic */ m(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.a81
    public void onRenderedFirstFrame() {
    }

    public m(byte[] bArr, int i10) {
        this.a = 14;
        ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, i10);
        this.b = wrap;
        wrap.order(ByteOrder.LITTLE_ENDIAN);
    }

    public m(int i10) {
        this.a = i10;
        switch (i10) {
            case 20:
                this.b = new xa.c(24);
                break;
            case 23:
                break;
            default:
                this.b = new ArrayList();
                new ArrayList();
                new ArrayList();
                break;
        }
    }

    public m(Context context) {
        this.a = 8;
        kotlin.jvm.internal.i.e(context, "context");
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.b = bundle == null ? Bundle.EMPTY : bundle;
    }

    public m(LaunchActivity launchActivity, Executor executor, v7.o oVar) {
        this.a = 4;
        if (launchActivity == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        }
        if (executor != null) {
            l0 s10 = launchActivity.s();
            x xVar = (x) new aa.a(launchActivity).j(x.class);
            this.b = s10;
            xVar.d = executor;
            xVar.e = oVar;
            return;
        }
        throw new IllegalArgumentException("Executor must not be null.");
    }

    @Override // org.telegram.ui.Components.vi
    public /* synthetic */ void K0() {
    }

    @Override // ii.h1
    public /* synthetic */ void r() {
    }

    @Override // lg.o
    public void r0() {
    }

    @Override // org.telegram.ui.Components.vi
    public /* synthetic */ void u0() {
    }

    @Override // lg.o
    public void S(boolean z10) {
    }

    @Override // org.telegram.ui.Components.vi
    public /* synthetic */ void U0(Object obj) {
    }

    @Override // org.telegram.ui.Components.vi
    public /* synthetic */ void j1(TLRPC.User user) {
    }

    @Override // lg.o
    public void n0(boolean z10) {
    }

    @Override // org.telegram.ui.Components.a81
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.a81
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.a81
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // ii.h1
    public /* synthetic */ void x(CharSequence charSequence) {
    }

    @Override // ii.h1
    public /* synthetic */ void f(int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.a81
    public void onError(d81 d81Var, Exception exc) {
    }

    @Override // org.telegram.ui.Components.vi
    public /* synthetic */ void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }

    @Override // org.telegram.ui.Components.vi
    public void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
    }
}
