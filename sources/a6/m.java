package a6;

import ai.ac;
import ai.da;
import ai.f6;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Log;
import android.view.TextureView;
import android.view.Window;
import android.webkit.WebView;
import androidx.biometric.p;
import androidx.biometric.t;
import androidx.biometric.x;
import androidx.fragment.app.g0;
import androidx.fragment.app.k0;
import androidx.fragment.app.l0;
import androidx.lifecycle.a0;
import androidx.lifecycle.z;
import b2.q0;
import c3.j0;
import c5.b0;
import c6.e0;
import c6.y;
import ci.a7;
import ci.d7;
import ci.m0;
import ci.uc;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.internal.cast.f1;
import com.google.android.gms.internal.cast.f2;
import com.google.android.gms.internal.cast.r0;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.internal.vision.e2;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.d0;
import e2.v;
import ei.x4;
import g6.n;
import g6.q;
import g6.r;
import gg.a2;
import gg.b2;
import ii.c3;
import ii.d2;
import ii.h1;
import ii.h2;
import ii.i1;
import ii.o5;
import ii.w3;
import j$.util.Objects;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import l.w;
import lg.o;
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
import org.telegram.messenger.beta.R;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.rn0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bj0;
import org.telegram.ui.gy;
import org.telegram.ui.lv0;
import org.telegram.ui.web.d1;
import org.telegram.ui.web.z0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class m implements lv0, a0, androidx.activity.result.b, WebMessageListenerBoundaryInterface, s, o, d71, OnSuccessListener, n, f6.a, fb.n, w, b2, z3.n, b5, h1 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ m(r rVar, String[] strArr) {
        this.a = 21;
        this.b = strArr;
    }

    public static int E(int i10, String str) {
        int P = P(i10);
        int l4 = l(str);
        return R(l4) + l4 + P;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v20 */
    public static void I(CharSequence charSequence, ByteBuffer byteBuffer) {
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
        } catch (ArrayIndexOutOfBoundsException e) {
            BufferOverflowException bufferOverflowException = new BufferOverflowException();
            bufferOverflowException.initCause(e);
            throw bufferOverflowException;
        }
    }

    public static int N(long j3) {
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

    public static int P(int i10) {
        return R(i10 << 3);
    }

    public static int R(int i10) {
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

    public static int l(CharSequence charSequence) {
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

    @Override // z3.n
    public int A() {
        return 2;
    }

    @Override // z3.n
    public void B(byte[] bArr, int i10, int i11, z3.m mVar, e2.h hVar) {
        d2.b a2;
        v vVar = (v) this.b;
        vVar.H(i10 + i11, bArr);
        vVar.J(i10);
        ArrayList arrayList = new ArrayList();
        while (vVar.a() > 0) {
            e2.d.a("Incomplete Mp4Webvtt Top Level box header found.", vVar.a() >= 8);
            int j3 = vVar.j();
            if (vVar.j() == 1987343459) {
                int i12 = j3 - 8;
                CharSequence charSequence = null;
                d2.a aVar = null;
                while (i12 > 0) {
                    e2.d.a("Incomplete vtt cue box header found.", i12 >= 8);
                    int j10 = vVar.j();
                    int j11 = vVar.j();
                    int i13 = j10 - 8;
                    byte[] bArr2 = vVar.a;
                    int i14 = vVar.b;
                    String str = d0.a;
                    String str2 = new String(bArr2, i14, i13, StandardCharsets.UTF_8);
                    vVar.K(i13);
                    i12 = (i12 - 8) - i13;
                    if (j11 == 1937011815) {
                        i4.g gVar = new i4.g();
                        i4.h.e(str2, gVar);
                        aVar = gVar.a();
                    } else if (j11 == 1885436268) {
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
                vVar.K(j3 - 8);
            }
        }
        hVar.accept(new z3.b(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    public void C(int i10) {
        while ((i10 & (-128)) != 0) {
            u((i10 & 127) | 128);
            i10 >>>= 7;
        }
        u(i10);
    }

    @Override // ii.h1
    public void D(i1 i1Var, int i10, int i11) {
        c3 c3Var;
        q9 textSelectionHelper;
        o5 o5Var = (o5) this.b;
        if (o5Var.G || i10 == i11 || (c3Var = o5Var.E) == null || (textSelectionHelper = c3Var.a.getTextSelectionHelper()) == null) {
            return;
        }
        if (textSelectionHelper.y() && textSelectionHelper.W == o5Var) {
            return;
        }
        o5Var.post(new x4(this, i1Var, i11, textSelectionHelper, i10, 4));
    }

    @Override // org.telegram.ui.lv0
    public void E0(MessageObject messageObject) {
        ((ac) ((f6) this.b).Q1).f(true);
    }

    @Override // gg.b2
    public /* synthetic */ a0.i F() {
        switch (this.a) {
        }
        return null;
    }

    public void G(int i10, int i11) {
        C((i10 << 3) | i11);
    }

    @Override // org.telegram.ui.lv0
    public void H(MessageObject messageObject) {
        ((ac) ((f6) this.b).Q1).f(false);
    }

    @Override // org.telegram.ui.Components.b5
    public void J(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 26:
                ((ii.r) this.b).I(i10, z10, i11, false, 0L);
                ii.r rVar = (ii.r) this.b;
                bj0 bj0Var = rVar.O;
                if (bj0Var != null) {
                    bj0Var.i();
                    rVar.O = null;
                    break;
                }
                break;
            default:
                ((d2) this.b).s0(i10, i11, z10);
                break;
        }
    }

    public void K(long j3) {
        while (((-128) & j3) != 0) {
            u((((int) j3) & 127) | 128);
            j3 >>>= 7;
        }
        u((int) j3);
    }

    @Override // ii.h1
    public void M(CharSequence charSequence) {
        c3 c3Var = ((o5) this.b).E;
        if (c3Var == null || charSequence == null || charSequence.length() <= 0) {
            return;
        }
        c3Var.a.t4(charSequence.toString());
    }

    @Override // gg.b2
    public boolean O(int i10) {
        switch (this.a) {
            case 22:
                return i10 == ((rn0) this.b).d0;
            default:
                return true;
        }
    }

    @Override // gg.b2
    public void Q(ArrayList arrayList) {
        switch (this.a) {
            case 22:
                rn0 rn0Var = (rn0) this.b;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    rn0Var.J.add(((a2) arrayList.get(i10)).a);
                }
                gy gyVar = rn0Var.U;
                if (gyVar != null) {
                    gyVar.d(rn0Var.D0 > 0, false);
                }
                rn0Var.l();
                break;
        }
    }

    @Override // ii.h1
    public void W(Editable editable) {
        o5 o5Var = (o5) this.b;
        ii.a aVar = o5Var.a;
        if (aVar != null) {
            aVar.s = true;
            aVar.r = o5Var.r.E;
        }
        o5Var.u();
        c3 c3Var = o5Var.E;
        if (c3Var == null || o5Var.a == null) {
            return;
        }
        c3Var.a();
    }

    public void a(j6.l lVar, t tVar) {
        Object obj = this.b;
        l0 l0Var = (l0) obj;
        if (l0Var == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
            return;
        }
        if (l0Var.P()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
            return;
        }
        l0 l0Var2 = (l0) obj;
        p pVar = (p) l0Var2.D("androidx.biometric.BiometricFragment");
        if (pVar == null) {
            pVar = new p();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(l0Var2);
            aVar.f(0, pVar, "androidx.biometric.BiometricFragment");
            aVar.e(true, true);
            l0Var2.A(true);
            l0Var2.E();
        }
        androidx.fragment.app.v k10 = pVar.k();
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
            xVar.g = v7.o.a();
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

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 10:
                g6.w wVar = (g6.w) obj;
                g6.f fVar = (g6.f) wVar.u();
                c6.d0 d0Var = ((e0) this.b).k;
                Parcel O0 = fVar.O0();
                com.google.android.gms.internal.cast.v.d(O0, d0Var);
                fVar.T0(O0, 18);
                g6.f fVar2 = (g6.f) wVar.u();
                fVar2.T0(fVar2.O0(), 17);
                ((TaskCompletionSource) obj2).setResult(null);
                break;
            default:
                q qVar = new q(0, (TaskCompletionSource) obj2);
                g6.i iVar = (g6.i) ((g6.s) obj).u();
                String[] strArr = (String[]) this.b;
                Parcel O02 = iVar.O0();
                com.google.android.gms.internal.cast.v.d(O02, qVar);
                O02.writeStringArray(strArr);
                iVar.T0(O02, 5);
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:222:0x0346, code lost:
    
        throw cc.c.a();
     */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03a2 A[LOOP:21: B:147:0x0224->B:177:0x03a2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0371 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public dc.d b(com.google.firebase.messaging.m mVar) {
        int e;
        hc.e eVar;
        hc.c cVar;
        int i10;
        int i11;
        dc.c cVar2;
        int e7;
        hc.f q6 = mVar.q();
        hc.c cVar3 = mVar.p().a;
        hc.d p5 = mVar.p();
        hc.f q10 = mVar.q();
        int i12 = m1.j.d(8)[p5.b];
        dc.b bVar = (dc.b) mVar.b;
        int i13 = bVar.b;
        for (int i14 = 0; i14 < i13; i14++) {
            for (int i15 = 0; i15 < i13; i15++) {
                if (e2.a(i12, i14, i15)) {
                    bVar.a(i15, i14);
                }
            }
        }
        int i16 = q10.a * 4;
        int i17 = i16 + 17;
        int i18 = q10.d;
        dc.b bVar2 = new dc.b(i17, i17);
        bVar2.c(0, 0, 9, 9);
        int i19 = i16 + 9;
        bVar2.c(i19, 0, 8, 9);
        bVar2.c(0, i19, 9, 8);
        int[] iArr = q10.b;
        int length = iArr.length;
        for (int i20 = 0; i20 < length; i20++) {
            int i21 = iArr[i20] - 2;
            for (int i22 = 0; i22 < length; i22++) {
                if ((i20 != 0 || (i22 != 0 && i22 != length - 1)) && (i20 != length - 1 || i22 != 0)) {
                    bVar2.c(iArr[i22] - 2, i21, 5, 5);
                }
            }
        }
        int i23 = 6;
        bVar2.c(6, 9, 1, i16);
        bVar2.c(9, 6, i16, 1);
        if (q10.a > 6) {
            int i24 = i16 + 6;
            bVar2.c(i24, 0, 3, 6);
            bVar2.c(0, i24, 6, 3);
        }
        byte[] bArr = new byte[i18];
        int i25 = i13 - 1;
        int i26 = i25;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        boolean z10 = true;
        while (i26 > 0) {
            if (i26 == i23) {
                i26--;
            }
            for (int i30 = 0; i30 < i13; i30++) {
                int i31 = z10 ? i25 - i30 : i30;
                for (int i32 = 0; i32 < 2; i32++) {
                    int i33 = i26 - i32;
                    if (!bVar2.b(i33, i31)) {
                        i28++;
                        i29 <<= 1;
                        if (bVar.b(i33, i31)) {
                            i29 |= 1;
                        }
                        if (i28 == 8) {
                            bArr[i27] = (byte) i29;
                            i27++;
                            i28 = 0;
                            i29 = 0;
                        }
                    }
                }
            }
            z10 = !z10;
            i26 -= 2;
            i23 = 6;
        }
        if (i27 != i18) {
            throw cc.c.a();
        }
        if (i18 != q6.d) {
            throw new IllegalArgumentException();
        }
        b0 b0Var = q6.c[cVar3.ordinal()];
        q0[] q0VarArr = (q0[]) b0Var.c;
        int i34 = b0Var.b;
        int i35 = 0;
        for (q0 q0Var : q0VarArr) {
            i35 += q0Var.a;
        }
        hc.a[] aVarArr = new hc.a[i35];
        int i36 = 0;
        for (q0 q0Var2 : q0VarArr) {
            int i37 = 0;
            while (i37 < q0Var2.a) {
                int i38 = q0Var2.b;
                aVarArr[i36] = new hc.a(i38, new byte[i34 + i38]);
                i37++;
                i36++;
            }
        }
        int length2 = aVarArr[0].a.length;
        int i39 = i35 - 1;
        while (i39 >= 0 && aVarArr[i39].a.length != length2) {
            i39--;
        }
        int i40 = i39 + 1;
        int i41 = length2 - i34;
        int i42 = 0;
        int i43 = 0;
        while (i42 < i41) {
            int i44 = i43;
            int i45 = 0;
            while (i45 < i36) {
                aVarArr[i45].a[i42] = bArr[i44];
                i45++;
                i44++;
            }
            i42++;
            i43 = i44;
        }
        int i46 = i40;
        while (i46 < i36) {
            aVarArr[i46].a[i41] = bArr[i43];
            i46++;
            i43++;
        }
        boolean z11 = false;
        int length3 = aVarArr[0].a.length;
        while (i41 < length3) {
            int i47 = i43;
            int i48 = 0;
            while (i48 < i36) {
                aVarArr[i48].a[i48 < i40 ? i41 : i41 + 1] = bArr[i47];
                i48++;
                i47++;
            }
            i41++;
            i43 = i47;
        }
        int i49 = 0;
        for (int i50 = 0; i50 < i35; i50++) {
            i49 += aVarArr[i50].b;
        }
        byte[] bArr2 = new byte[i49];
        int i51 = 0;
        int i52 = 0;
        int i53 = 0;
        while (i52 < i35) {
            hc.a aVar = aVarArr[i52];
            byte[] bArr3 = aVar.a;
            int i54 = aVar.b;
            int length4 = bArr3.length;
            int[] iArr2 = new int[length4];
            for (int i55 = 0; i55 < length4; i55++) {
                iArr2[i55] = bArr3[i55] & 255;
            }
            try {
                int d = ((m) this.b).d(bArr3.length - i54, iArr2);
                for (int i56 = 0; i56 < i54; i56++) {
                    bArr3[i56] = (byte) iArr2[i56];
                }
                i51 += d;
                int i57 = i53;
                int i58 = 0;
                while (i58 < i54) {
                    bArr2[i57] = bArr3[i58];
                    i58++;
                    i57++;
                }
                i52++;
                i53 = i57;
            } catch (fc.c unused) {
                cc.a aVar2 = cc.a.c;
                if (cc.h.a) {
                    throw new cc.a();
                }
                throw cc.a.c;
            }
        }
        char[] cArr = hc.b.a;
        b4.d dVar = new b4.d(bArr2);
        StringBuilder sb2 = new StringBuilder(50);
        ArrayList arrayList = new ArrayList(1);
        int i59 = -1;
        int i60 = -1;
        boolean z12 = false;
        boolean z13 = false;
        dc.c cVar4 = null;
        while (true) {
            try {
                int d10 = dVar.d();
                hc.e eVar2 = hc.e.c;
                if (d10 < 4 || (e = dVar.e(4)) == 0) {
                    eVar = eVar2;
                } else if (e == 1) {
                    eVar = hc.e.d;
                } else if (e == 2) {
                    eVar = hc.e.e;
                } else if (e == 3) {
                    eVar = hc.e.f;
                } else if (e == 4) {
                    eVar = hc.e.h;
                } else if (e == 5) {
                    eVar = hc.e.s;
                } else if (e == 7) {
                    eVar = hc.e.n;
                } else if (e == 8) {
                    eVar = hc.e.r;
                } else if (e == 9) {
                    eVar = hc.e.v;
                } else {
                    if (e != 13) {
                        throw new IllegalArgumentException();
                    }
                    eVar = hc.e.w;
                }
                int ordinal = eVar.ordinal();
                if (ordinal != 0) {
                    cVar = cVar3;
                    if (ordinal != 3) {
                        if (ordinal == 5) {
                            i10 = i51;
                            i11 = 1;
                            int e10 = dVar.e(8);
                            if ((e10 & 128) == 0) {
                                e7 = e10 & 127;
                            } else if ((e10 & 192) == 128) {
                                e7 = ((e10 & 63) << 8) | dVar.e(8);
                            } else {
                                if ((e10 & 224) != 192) {
                                    throw cc.c.a();
                                }
                                e7 = ((e10 & 31) << 16) | dVar.e(16);
                            }
                            HashMap hashMap = dc.c.c;
                            if (e7 < 0 || e7 >= 900) {
                                break;
                            }
                            dc.c cVar5 = (dc.c) dc.c.c.get(Integer.valueOf(e7));
                            if (cVar5 == null) {
                                throw cc.c.a();
                            }
                            cVar2 = cVar5;
                        } else if (ordinal == 7) {
                            i10 = i51;
                            i11 = 1;
                            cVar2 = cVar4;
                            z12 = true;
                            z11 = true;
                        } else if (ordinal == 8) {
                            i10 = i51;
                            i11 = 1;
                            cVar2 = cVar4;
                            z12 = true;
                            z13 = true;
                        } else if (ordinal != 9) {
                            int e11 = dVar.e(eVar.a(q6));
                            int ordinal2 = eVar.ordinal();
                            i10 = i51;
                            if (ordinal2 == 1) {
                                hc.b.e(dVar, sb2, e11);
                            } else if (ordinal2 == 2) {
                                hc.b.a(dVar, sb2, e11, z12);
                            } else if (ordinal2 == 4) {
                                hc.b.b(dVar, sb2, e11, cVar4, arrayList);
                            } else {
                                if (ordinal2 != 6) {
                                    throw cc.c.a();
                                }
                                hc.b.d(dVar, sb2, e11);
                            }
                        } else {
                            i10 = i51;
                            int e12 = dVar.e(4);
                            int e13 = dVar.e(eVar.a(q6));
                            i11 = 1;
                            if (e12 == 1) {
                                hc.b.c(dVar, sb2, e13);
                            }
                        }
                        int i61 = i59;
                        if (eVar == eVar2) {
                            if (cVar2 != null) {
                                i11 = z11 ? 4 : z13 ? 6 : 2;
                            } else if (z11) {
                                i11 = 3;
                            } else if (z13) {
                                i11 = 5;
                            }
                            dc.d dVar2 = new dc.d(bArr2, sb2.toString(), arrayList.isEmpty() ? null : arrayList, cVar.toString(), i61, i60, i11);
                            dVar2.d = Integer.valueOf(i10);
                            return dVar2;
                        }
                        i59 = i61;
                        cVar3 = cVar;
                        cVar4 = cVar2;
                        i51 = i10;
                    } else {
                        i10 = i51;
                        i11 = 1;
                        if (dVar.d() < 16) {
                            throw cc.c.a();
                        }
                        i59 = dVar.e(8);
                        i60 = dVar.e(8);
                    }
                    cVar2 = cVar4;
                    int i612 = i59;
                    if (eVar == eVar2) {
                    }
                } else {
                    cVar = cVar3;
                    i10 = i51;
                }
                i11 = 1;
                cVar2 = cVar4;
                int i6122 = i59;
                if (eVar == eVar2) {
                }
            } catch (IllegalArgumentException unused2) {
                throw cc.c.a();
            }
        }
    }

    @Override // ii.h1
    public /* synthetic */ boolean b0(boolean z10) {
        return false;
    }

    @Override // ii.h1
    public void c(i1 i1Var) {
        c3 c3Var = ((o5) this.b).E;
        if (c3Var != null) {
            w3 w3Var = c3Var.a;
            w3.M1(w3Var, i1Var);
            w3Var.h3.t(i1Var, true);
        }
    }

    public int d(int i10, int[] iArr) {
        int[] iArr2;
        int[] iArr3;
        int i11;
        int i12;
        fc.a aVar = (fc.a) this.b;
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        int length = iArr.length;
        if (length <= 1 || iArr[0] != 0) {
            iArr2 = iArr;
        } else {
            int i13 = 1;
            while (i13 < length && iArr[i13] == 0) {
                i13++;
            }
            if (i13 == length) {
                iArr2 = new int[]{0};
            } else {
                int i14 = length - i13;
                int[] iArr4 = new int[i14];
                System.arraycopy(iArr, i13, iArr4, 0, i14);
                iArr2 = iArr4;
            }
        }
        int[] iArr5 = new int[i10];
        boolean z10 = true;
        for (int i15 = 0; i15 < i10; i15++) {
            int i16 = aVar.a[aVar.g + i15];
            if (i16 == 0) {
                i12 = iArr2[iArr2.length - 1];
            } else {
                if (i16 == 1) {
                    i11 = 0;
                    for (int i17 : iArr2) {
                        fc.a aVar2 = fc.a.h;
                        i11 ^= i17;
                    }
                } else {
                    i11 = iArr2[0];
                    int length2 = iArr2.length;
                    for (int i18 = 1; i18 < length2; i18++) {
                        i11 = aVar.c(i16, i11) ^ iArr2[i18];
                    }
                }
                i12 = i11;
            }
            iArr5[(i10 - 1) - i15] = i12;
            if (i12 != 0) {
                z10 = false;
            }
        }
        if (z10) {
            return 0;
        }
        fc.b bVar = new fc.b(aVar, iArr5);
        fc.b a2 = aVar.a(i10, 1);
        fc.b bVar2 = aVar.c;
        if (a2.d() >= bVar.d()) {
            a2 = bVar;
            bVar = a2;
        }
        fc.b bVar3 = aVar.d;
        fc.b bVar4 = a2;
        fc.b bVar5 = bVar;
        fc.b bVar6 = bVar4;
        fc.b bVar7 = bVar2;
        while (bVar6.d() * 2 >= i10) {
            if (bVar6.e()) {
                throw new fc.c("r_{i-1} was zero");
            }
            int b10 = aVar.b(bVar6.c(bVar6.d()));
            fc.b bVar8 = bVar2;
            while (bVar5.d() >= bVar6.d() && !bVar5.e()) {
                int d = bVar5.d() - bVar6.d();
                int c10 = aVar.c(bVar5.c(bVar5.d()), b10);
                bVar8 = bVar8.a(aVar.a(d, c10));
                bVar5 = bVar5.a(bVar6.h(d, c10));
            }
            fc.b a10 = bVar8.g(bVar3).a(bVar7);
            if (bVar5.d() >= bVar6.d()) {
                throw new IllegalStateException("Division algorithm failed to reduce polynomial? r: " + bVar5 + ", rLast: " + bVar6);
            }
            fc.b bVar9 = bVar5;
            bVar5 = bVar6;
            bVar6 = bVar9;
            bVar7 = bVar3;
            bVar3 = a10;
        }
        int c11 = bVar3.c(0);
        if (c11 == 0) {
            throw new fc.c("sigmaTilde(0) was zero");
        }
        int b11 = aVar.b(c11);
        fc.b[] bVarArr = {bVar3.f(b11), bVar6.f(b11)};
        fc.b bVar10 = bVarArr[0];
        fc.b bVar11 = bVarArr[1];
        int d10 = bVar10.d();
        if (d10 == 1) {
            iArr3 = new int[]{bVar10.c(1)};
        } else {
            int[] iArr6 = new int[d10];
            int i19 = 0;
            for (int i20 = 1; i20 < aVar.e && i19 < d10; i20++) {
                if (bVar10.b(i20) == 0) {
                    iArr6[i19] = aVar.b(i20);
                    i19++;
                }
            }
            if (i19 != d10) {
                throw new fc.c("Error locator degree does not match number of roots");
            }
            iArr3 = iArr6;
        }
        int length3 = iArr3.length;
        int[] iArr7 = new int[length3];
        for (int i21 = 0; i21 < length3; i21++) {
            int b12 = aVar.b(iArr3[i21]);
            int i22 = 1;
            for (int i23 = 0; i23 < length3; i23++) {
                if (i21 != i23) {
                    int c12 = aVar.c(iArr3[i23], b12);
                    i22 = aVar.c(i22, (c12 & 1) == 0 ? c12 | 1 : c12 & (-2));
                }
            }
            int c13 = aVar.c(bVar11.b(b12), aVar.b(i22));
            iArr7[i21] = c13;
            if (aVar.g != 0) {
                iArr7[i21] = aVar.c(c13, b12);
            }
        }
        for (int i24 = 0; i24 < iArr3.length; i24++) {
            int length4 = iArr.length - 1;
            int i25 = iArr3[i24];
            if (i25 == 0) {
                throw new IllegalArgumentException();
            }
            int i26 = length4 - aVar.b[i25];
            if (i26 < 0) {
                throw new fc.c("Bad error location");
            }
            iArr[i26] = iArr[i26] ^ iArr7[i24];
        }
        return iArr3.length;
    }

    public Boolean e() {
        Bundle bundle = (Bundle) this.b;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override // ii.h1
    public boolean f() {
        o5 o5Var = (o5) this.b;
        c3 c3Var = o5Var.E;
        if (c3Var == null || o5Var.a == null) {
            return false;
        }
        return c3Var.a.S4();
    }

    @Override // l.w
    public void g(l.k kVar, boolean z10) {
        ((g.s) this.b).g(kVar);
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override // gg.b2
    public void h(int i10) {
        switch (this.a) {
            case 22:
                rn0 rn0Var = (rn0) this.b;
                rn0Var.D0--;
                rn0Var.e0 = i10;
                if (rn0Var.f0 != i10) {
                    rn0Var.s.clear();
                }
                if (rn0Var.g0 != i10) {
                    rn0Var.I.clear();
                }
                rn0Var.N = true;
                gy gyVar = rn0Var.U;
                if (gyVar != null) {
                    gyVar.d(rn0Var.D0 > 0, true);
                }
                rn0Var.l();
                gy gyVar2 = rn0Var.U;
                if (gyVar2 != null) {
                    gyVar2.c();
                    break;
                }
                break;
            default:
                AndroidUtilities.runOnUIThread(new uc(this, 21));
                break;
        }
    }

    @Override // ii.h1
    public void j(int i10, int i11) {
        h2 h2Var;
        o5 o5Var = (o5) this.b;
        c3 c3Var = o5Var.E;
        if (c3Var == null || o5Var.a == null || (h2Var = c3Var.a.J3) == null) {
            return;
        }
        h2Var.f(i10, i11);
    }

    @Override // org.telegram.ui.lv0
    public /* synthetic */ TextureView j0() {
        return null;
    }

    @Override // androidx.activity.result.b
    public void k(Object obj) {
        switch (this.a) {
            case 6:
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                k0 k0Var = (k0) this.b;
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

    @Override // f6.a
    public void n(Bitmap bitmap) {
        g6.b bVar = f6.i.v;
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            float f7 = width;
            int height = bitmap.getHeight();
            int B = (int) a4.a.B(f7, 9.0f, 16.0f, 0.5f);
            float f10 = (B - height) / 2.0f;
            RectF rectF = new RectF(0.0f, f10, f7, height + f10);
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, B, config);
            new Canvas(createBitmap).drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
            bitmap2 = createBitmap;
        }
        ((f6.i) this.b).e(bitmap2, 0);
    }

    public void o(int i10, String str) {
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        G(i10, 2);
        try {
            int R = R(str.length());
            if (R != R(str.length() * 3)) {
                C(l(str));
                I(str, byteBuffer);
                return;
            }
            int position = byteBuffer.position();
            if (byteBuffer.remaining() < R) {
                throw new com.google.android.gms.internal.cast.b5(position + R, byteBuffer.limit());
            }
            byteBuffer.position(position + R);
            I(str, byteBuffer);
            int position2 = byteBuffer.position();
            byteBuffer.position(position);
            C((position2 - position) - R);
            byteBuffer.position(position2);
        } catch (BufferOverflowException e) {
            com.google.android.gms.internal.cast.b5 b5Var = new com.google.android.gms.internal.cast.b5(byteBuffer.position(), byteBuffer.limit());
            b5Var.initCause(e);
            throw b5Var;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z10, InvocationHandler invocationHandler2) {
        a5.a aVar;
        a5.a aVar2;
        String url;
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
                            case 7:
                                ni.k kVar = (ni.k) vVar.b;
                                if (webView == kVar.o && z10 && uri != null && kVar.f.equals(uri.toString()) && (url = webView.getUrl()) != null) {
                                    Uri parse = Uri.parse(url);
                                    if ("https".equalsIgnoreCase(parse.getScheme()) && kVar.c.equalsIgnoreCase(parse.getHost()) && parse.getUserInfo() == null && parse.getPort() == -1 && kVar.d.equals(parse.getPath())) {
                                        int i11 = aVar2.b;
                                        if (i11 == 0) {
                                            aVar2.f(0);
                                            kVar.g((String) aVar2.c, hVar2);
                                            return;
                                        } else {
                                            if (i11 == 1) {
                                                synchronized (kVar.a) {
                                                    if (!kVar.r && (hVar = kVar.p) != null && hVar == hVar2) {
                                                        aVar2.f(1);
                                                        byte[] bArr = (byte[]) aVar2.d;
                                                        Objects.requireNonNull(bArr);
                                                        kVar.k.execute(new m4.g0(6, kVar, bArr));
                                                    }
                                                }
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                    return;
                                }
                                return;
                            default:
                                z0 z0Var = (z0) vVar.b;
                                d1 d1Var = z0Var.Q;
                                if (webView != z0Var || d1Var == null) {
                                    return;
                                }
                                if (webView != d1Var.a || aVar2.b != 0) {
                                    d1Var.h("onBotWebMessage ignored: invalid source or payload");
                                    return;
                                }
                                String l4 = d1.l(uri == null ? null : uri.toString());
                                if (d1Var.t0 && (TextUtils.isEmpty(d1Var.F0) || !TextUtils.equals(d1Var.F0, l4) || !TextUtils.equals(d1Var.F0, d1Var.getOriginHost()))) {
                                    d1Var.h("onBotWebMessage ignored: untrusted origin");
                                    return;
                                }
                                da g10 = d1Var.g();
                                try {
                                    aVar2.f(0);
                                    String str = (String) aVar2.c;
                                    if (str != null && str.length() <= 1048576) {
                                        JSONObject jSONObject = new JSONObject(str);
                                        String string = jSONObject.getString("eventType");
                                        if (!string.isEmpty() && string.length() <= 128) {
                                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.b0(d1Var, webView, g10, string, jSONObject.optString("eventData", null), 2));
                                            return;
                                        }
                                        d1Var.h("onBotWebMessage ignored: invalid event type");
                                        return;
                                    }
                                    d1Var.h("onBotWebMessage ignored: invalid payload length");
                                    return;
                                } catch (JSONException e) {
                                    FileLog.e(e);
                                    return;
                                }
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

    @Override // org.telegram.ui.Components.d71
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.d71
    public void onStateChanged(boolean z10, int i10) {
        d7 d7Var = (d7) this.b;
        a7 a7Var = d7Var.M;
        g71 g71Var = d7Var.x;
        if (g71Var == null) {
            return;
        }
        if (g71Var.y()) {
            AndroidUtilities.runOnUIThread(a7Var);
        } else {
            AndroidUtilities.cancelRunOnUIThread(a7Var);
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
            String g10 = w.c.g(packageName, ".client_cast_analytics_data");
            r0Var.h = bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE") == 0 ? 1 : 2;
            l5.t.b(context);
            r0Var.g = l5.t.a().c(j5.a.e).a("CAST_SENDER_SDK", new i5.c("proto"), com.google.android.gms.internal.cast.b0.a);
            if (bundle.containsKey("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE")) {
                r0Var.e = Long.valueOf(bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE"));
            }
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(g10, 0);
            if (i10 != 0) {
                com.google.android.gms.common.api.internal.v e = com.google.android.gms.common.api.internal.w.e();
                e.c = new j0(rVar, new String[]{"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"});
                e.d = new k6.c[]{y.c};
                e.b = false;
                e.a = 8426;
                Task e7 = rVar.e(0, e.a());
                j6.l lVar = new j6.l();
                lVar.b = r0Var;
                lVar.c = packageName;
                lVar.a = i10;
                lVar.d = sharedPreferences;
                e7.addOnSuccessListener(lVar);
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

    @Override // org.telegram.ui.Components.d71
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.d71
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        qg.e2 e2Var = ((d7) this.b).w;
        if (e2Var != null) {
            float f10 = i10 / i11;
            if (Math.abs(e2Var.y0 - f10) >= 1.0E-4f) {
                e2Var.y0 = f10;
                e2Var.requestLayout();
            }
        }
    }

    @Override // g6.n
    public void p(String str, long j3, long j10, long j11) {
        e6.p pVar = (e6.p) this.b;
        try {
            pVar.a(new e6.o(new Status(2103, null, null, null), 1));
        } catch (IllegalStateException e) {
            g6.b bVar = e6.h.k;
            Log.e(bVar.a, bVar.d("Result already set when calling onRequestReplaced", new Object[0]), e);
        }
        Iterator it = pVar.q.i.iterator();
        while (it.hasNext()) {
            ((e6.g) it.next()).h(str, j3, 2103, j10, j11);
        }
    }

    @Override // androidx.lifecycle.a0
    public void p0(Object obj) {
        int i10 = this.a;
        Object obj2 = this.b;
        switch (i10) {
            case 3:
                p pVar = (p) obj2;
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
                androidx.fragment.app.p pVar2 = (androidx.fragment.app.p) obj2;
                if (((androidx.lifecycle.t) obj) == null || !pVar2.r0) {
                    return;
                }
                pVar2.getClass();
                throw new IllegalStateException("Fragment " + pVar2 + " did not return a View from onCreateView() or this was called before onCreateView().");
        }
    }

    @Override // fb.n
    public Object p2() {
        Type type = (Type) this.b;
        if (!(type instanceof ParameterizedType)) {
            throw new db.j("Invalid EnumSet type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return EnumSet.noneOf((Class) type2);
        }
        throw new db.j("Invalid EnumSet type: " + type.toString());
    }

    @Override // ii.h1
    public /* synthetic */ boolean q(i1 i1Var) {
        return false;
    }

    @Override // z3.n
    public /* synthetic */ z3.e r(int i10, int i11, byte[] bArr) {
        return w.c.a(this, bArr, i11);
    }

    public void s(int i10, byte[] bArr) {
        G(i10, 2);
        C(bArr.length);
        int length = bArr.length;
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        if (byteBuffer.remaining() < length) {
            throw new com.google.android.gms.internal.cast.b5(byteBuffer.position(), byteBuffer.limit());
        }
        byteBuffer.put(bArr, 0, length);
    }

    @Override // ii.h1
    public /* synthetic */ boolean t(i1 i1Var) {
        return false;
    }

    public void u(int i10) {
        byte b10 = (byte) i10;
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        if (!byteBuffer.hasRemaining()) {
            throw new com.google.android.gms.internal.cast.b5(byteBuffer.position(), byteBuffer.limit());
        }
        byteBuffer.put(b10);
    }

    @Override // l.w
    public boolean v(l.k kVar) {
        Window.Callback callback = ((g.s) this.b).f.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, kVar);
        return true;
    }

    @Override // gg.b2
    public /* synthetic */ a0.i w() {
        switch (this.a) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004d A[LOOP:0: B:16:0x0047->B:18:0x004d, LOOP_END] */
    @Override // g6.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void y(String str, long j3, int i10, Object obj, long j10, long j11) {
        int i11;
        Iterator it;
        e6.p pVar = (e6.p) this.b;
        try {
            i11 = i10;
            try {
                Status status = new Status(i11, null, null, null);
                Object obj2 = true == (obj instanceof g6.l) ? obj : null;
                if (obj2 != null) {
                }
                if (obj2 != null) {
                }
                pVar.a(new e6.o(status, 2));
            } catch (IllegalStateException e) {
                e = e;
                g6.b bVar = e6.h.k;
                Log.e(bVar.a, bVar.d("Result already set when calling onRequestCompleted", new Object[0]), e);
                it = pVar.q.i.iterator();
                while (it.hasNext()) {
                }
            }
        } catch (IllegalStateException e7) {
            e = e7;
            i11 = i10;
        }
        it = pVar.q.i.iterator();
        while (it.hasNext()) {
            ((e6.g) it.next()).h(str, j3, i11, j10, j11);
            i11 = i10;
        }
    }

    @Override // lg.o
    public void z() {
        ((m0) this.b).e.invalidate();
    }

    public /* synthetic */ m(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.d71
    public void onRenderedFirstFrame() {
    }

    public m(byte[] bArr, int i10) {
        this.a = 14;
        ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, i10);
        this.b = wrap;
        wrap.order(ByteOrder.LITTLE_ENDIAN);
    }

    public m(Context context) {
        this.a = 8;
        kotlin.jvm.internal.i.e(context, "context");
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.b = bundle == null ? Bundle.EMPTY : bundle;
    }

    public m(int i10) {
        this.a = i10;
        switch (i10) {
            case 25:
                this.b = new v();
                break;
            default:
                this.b = new m(fc.a.h, 19);
                break;
        }
    }

    public m(LaunchActivity launchActivity, Executor executor, v7.n nVar) {
        this.a = 4;
        if (launchActivity == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        }
        if (executor != null) {
            l0 s10 = launchActivity.s();
            x xVar = (x) new aa.a(launchActivity).m(x.class);
            this.b = s10;
            xVar.d = executor;
            xVar.e = nVar;
            return;
        }
        throw new IllegalArgumentException("Executor must not be null.");
    }

    @Override // lg.o
    public void k0() {
    }

    @Override // z3.n
    public /* synthetic */ void reset() {
    }

    @Override // ii.h1
    public /* synthetic */ void x() {
    }

    private final /* synthetic */ void i(ArrayList arrayList) {
    }

    @Override // lg.o
    public void L(boolean z10) {
    }

    @Override // lg.o
    public void g0(boolean z10) {
    }

    @Override // ii.h1
    public /* synthetic */ void m(i1 i1Var) {
    }

    @Override // org.telegram.ui.Components.d71
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.d71
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.d71
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // org.telegram.ui.Components.d71
    public void onError(g71 g71Var, Exception exc) {
    }
}
