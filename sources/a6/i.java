package a6;

import a3.n0;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import android.view.Window;
import androidx.fragment.app.e0;
import androidx.fragment.app.i0;
import androidx.lifecycle.a0;
import b2.b2;
import c3.k0;
import c6.y;
import c7.v;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.internal.cast.d1;
import com.google.android.gms.internal.cast.d2;
import com.google.android.gms.internal.cast.p0;
import com.google.android.gms.internal.cast.z;
import com.google.android.gms.internal.cast.z4;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import di.a7;
import di.g0;
import di.l0;
import di.x6;
import e9.j1;
import e9.l1;
import eb.n;
import g.r;
import g6.q;
import gb.p;
import hg.z1;
import ig.t0;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import ji.h1;
import ji.h2;
import ji.j0;
import ji.s3;
import ji.x3;
import ji.z0;
import l.w;
import n7.m1;
import n7.n1;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Components.f81;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.lb0;
import v7.c8;
import v7.u6;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class i implements n0, s, a0, androidx.activity.result.b, OnSuccessListener, lb0, mg.e, f81, d9.k, SuccessContinuation, f6.a, w, p, n, z1, je.a, j0 {
    public static i c;
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ i(com.google.android.gms.common.api.j jVar, Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public static int B(int i10, String str) {
        int G = G(i10);
        int v = v(str);
        return I(v) + v + G;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v20 */
    public static void D(CharSequence charSequence, ByteBuffer byteBuffer) {
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

    public static int F(long j10) {
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

    public static int G(int i10) {
        return I(i10 << 3);
    }

    public static int I(int i10) {
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

    public static synchronized i o(Context context) {
        i u10;
        synchronized (i.class) {
            u10 = u(context.getApplicationContext());
        }
        return u10;
    }

    public static synchronized i u(Context context) {
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

    public static int v(CharSequence charSequence) {
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

    public void A(int i10) {
        while ((i10 & (-128)) != 0) {
            z((i10 & 127) | 128);
            i10 >>>= 7;
        }
        z(i10);
    }

    public void C(int i10, int i11) {
        A((i10 << 3) | i11);
    }

    @Override // ji.j0
    public void C0() {
        z0 z0Var = (z0) this.b;
        s3 s3Var = z0Var.S;
        if (s3Var != null) {
            ji.a aVar = z0Var.a;
            x3 x3Var = s3Var.a;
            h2 h2Var = x3Var.H3;
            if (h2Var != null) {
                h2Var.g();
            }
            x3Var.f3.onContentChanged();
        }
    }

    public void E(long j10) {
        while (((-128) & j10) != 0) {
            z((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        z((int) j10);
    }

    @Override // hg.z1
    public /* synthetic */ boolean E0(int i10) {
        return true;
    }

    @Override // mg.e
    public void H() {
        ((l0) this.b).h.o();
    }

    @Override // hg.z1
    public /* synthetic */ a0.h K() {
        return null;
    }

    @Override // mg.e
    public void Q0() {
        ((l0) this.b).h.k();
    }

    @Override // ji.j0
    public void R0() {
        z0 z0Var = (z0) this.b;
        s3 s3Var = z0Var.S;
        if (s3Var != null) {
            ji.a aVar = z0Var.a;
            x3.P1(s3Var.a);
        }
    }

    @Override // mg.e
    public void V0(float f7) {
        ((l0) this.b).h.setRotation(f7);
    }

    @Override // ji.j0
    public o9 W() {
        s3 s3Var = ((z0) this.b).S;
        if (s3Var == null) {
            return null;
        }
        return s3Var.a.getTextSelectionHelper();
    }

    @Override // ji.j0
    public void a(h1 h1Var) {
        s3 s3Var = ((z0) this.b).S;
        if (s3Var != null) {
            x3 x3Var = s3Var.a;
            x3.N1(x3Var, h1Var);
            x3Var.f3.V(h1Var, true);
        }
    }

    @Override // ji.j0
    public void a0(CharSequence charSequence) {
        s3 s3Var = ((z0) this.b).S;
        if (s3Var != null) {
            s3Var.getClass();
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            s3Var.a.u4(charSequence.toString());
        }
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 2:
                l8.c cVar = (l8.c) this.b;
                a8.e eVar = new a8.e(1, (TaskCompletionSource) obj2);
                a8.c cVar2 = (a8.c) ((a8.g) obj).u();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i10 = a8.a.a;
                obtain.writeStrongBinder(eVar);
                obtain.writeInt(1);
                cVar.writeToParcel(obtain, 0);
                cVar2.F0(obtain, 1);
                return;
            case 7:
                b7.b bVar = new b7.b(0, (TaskCompletionSource) obj2);
                n1 n1Var = (n1) ((m1) obj).u();
                v vVar = (v) this.b;
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken(n1Var.b);
                int i11 = n7.k.a;
                obtain2.writeStrongBinder(bVar);
                obtain2.writeInt(1);
                vVar.writeToParcel(obtain2, 0);
                Parcel obtain3 = Parcel.obtain();
                try {
                    n1Var.a.transact(1, obtain2, obtain3, 0);
                    obtain3.readException();
                    return;
                } finally {
                    obtain2.recycle();
                    obtain3.recycle();
                }
            case 20:
                q qVar = new q(2, (TaskCompletionSource) obj2);
                g6.i iVar = (g6.i) ((g6.s) obj).u();
                String[] strArr = (String[]) this.b;
                Parcel N0 = iVar.N0();
                com.google.android.gms.internal.cast.v.d(N0, qVar);
                N0.writeStringArray(strArr);
                iVar.S0(N0, 7);
                return;
            default:
                i7.b bVar2 = (i7.b) this.b;
                i7.a aVar = new i7.a((TaskCompletionSource) obj2);
                i7.i iVar2 = (i7.i) ((i7.c) obj).u();
                String str = bVar2.k;
                Parcel J0 = iVar2.J0();
                int i12 = i7.f.a;
                J0.writeStrongBinder(aVar);
                J0.writeString(str);
                iVar2.K0(J0, 2);
                return;
        }
    }

    @Override // d9.k
    public Object apply(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        l1 l1Var = (l1) this.b;
        l1Var.getClass();
        entry.getClass();
        return new j1(entry, l1Var);
    }

    @Override // a3.n0
    public void b() {
        a3.n nVar = (a3.n) this.b;
        if (nVar.r1 != null) {
            nVar.R0(0, 1);
        }
    }

    @Override // mg.e
    public void b0() {
        ((l0) this.b).h.a.g(1, true);
    }

    public void c(c3.j jVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
        long[] jArr = jVar.e;
        if (jArr.length <= 0 || linkedHashMap.containsKey(Long.valueOf(jArr[0]))) {
            return;
        }
        linkedHashMap.put(Long.valueOf(jVar.e[0]), jVar);
    }

    @Override // l.w
    public void d(l.k kVar, boolean z10) {
        g.q qVar;
        r rVar = (r) this.b;
        l.k k10 = kVar.k();
        int i10 = 0;
        boolean z11 = k10 != kVar;
        if (z11) {
            kVar = k10;
        }
        g.q[] qVarArr = rVar.U;
        int length = qVarArr != null ? qVarArr.length : 0;
        while (true) {
            if (i10 < length) {
                qVar = qVarArr[i10];
                if (qVar != null && qVar.h == kVar) {
                    break;
                } else {
                    i10++;
                }
            } else {
                qVar = null;
                break;
            }
        }
        if (qVar != null) {
            if (!z11) {
                rVar.h(qVar, z10);
            } else {
                rVar.f(qVar.a, qVar, k10);
                rVar.h(qVar, true);
            }
        }
    }

    public StringBuilder e() {
        ff.a aVar = (ff.a) this.b;
        if (!(aVar instanceof af.r)) {
            return null;
        }
        StringBuilder sb2 = ((af.r) aVar).b.b;
        if (sb2.length() == 0) {
            return null;
        }
        return sb2;
    }

    @Override // hg.z1
    public void f(int i10) {
        AndroidUtilities.runOnUIThread(new t0(this, 0));
    }

    @Override // ji.j0
    public n9 g0() {
        return (z0) this.b;
    }

    @Override // ji.j0
    public void h() {
        z0 z0Var = (z0) this.b;
        s3 s3Var = z0Var.S;
        if (s3Var != null) {
            x3.Q1(s3Var.a, z0Var.a);
        }
    }

    @Override // org.telegram.ui.Components.lb0
    public Paint.FontMetricsInt i() {
        return ((di.m) this.b).f.getEditText().getPaint().getFontMetricsInt();
    }

    @Override // gb.p
    public Object i2() {
        Type type = (Type) this.b;
        if (!(type instanceof ParameterizedType)) {
            throw new eb.j("Invalid EnumMap type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return new EnumMap((Class) type2);
        }
        throw new eb.j("Invalid EnumMap type: " + type.toString());
    }

    @Override // androidx.activity.result.b
    public void j(Object obj) {
        switch (this.a) {
            case 5:
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                i0 i0Var = (i0) this.b;
                e0 e0Var = (e0) i0Var.F.pollLast();
                if (e0Var != null) {
                    String str = e0Var.a;
                    int i10 = e0Var.b;
                    androidx.fragment.app.r f7 = i0Var.c.f(str);
                    if (f7 != null) {
                        f7.x(i10, aVar.a, aVar.b);
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
                int i11 = u.e("ProxyBillingActivityV2", intent).a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.N;
                if (resultReceiver != null) {
                    resultReceiver.send(i11, intent == null ? null : intent.getExtras());
                }
                int i12 = aVar2.a;
                if (i12 != -1 || i11 != 0) {
                    u.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i12 + " and billing's responseCode: " + i11);
                }
                proxyBillingActivityV2.finish();
                break;
        }
    }

    @Override // ji.j0
    public ji.a j0() {
        return ((z0) this.b).a;
    }

    @Override // a3.n0
    public void k() {
        i2.l0 l0Var = ((a3.n) this.b).Y;
        if (l0Var != null) {
            l0Var.a();
        }
    }

    @Override // hg.z1
    public /* synthetic */ a0.h k0() {
        return null;
    }

    public c3.j l() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (c3.j jVar : ((LinkedHashMap) this.b).values()) {
            arrayList.add(jVar.b);
            arrayList2.add(jVar.c);
            arrayList3.add(jVar.d);
            arrayList4.add(jVar.e);
        }
        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()][]);
        long j10 = 0;
        for (int[] iArr2 : iArr) {
            j10 += iArr2.length;
        }
        int i10 = (int) j10;
        u6.c(j10, "the total number of elements (%s) in the arrays must fit in an int", j10 == ((long) i10));
        int[] iArr3 = new int[i10];
        int i11 = 0;
        for (int[] iArr4 : iArr) {
            System.arraycopy(iArr4, 0, iArr3, i11, iArr4.length);
            i11 += iArr4.length;
        }
        return new c3.j(iArr3, c8.a((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), c8.a((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), c8.a((long[][]) arrayList4.toArray(new long[arrayList4.size()][])));
    }

    public eb.i n(Object obj) {
        eb.g gVar = ((hb.a0) this.b).b;
        gVar.getClass();
        if (obj == null) {
            return eb.k.a;
        }
        Class<?> cls = obj.getClass();
        hb.n nVar = new hb.n();
        gVar.f(obj, cls, nVar);
        return nVar.u();
    }

    @Override // androidx.lifecycle.a0
    public void n0(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        androidx.biometric.q qVar = (androidx.biometric.q) this.b;
        if (charSequence != null) {
            if (qVar.R()) {
                qVar.W(charSequence);
            }
            qVar.l0.d(null);
        }
    }

    @Override // a3.n0
    public void onFirstFrameRendered() {
        a3.n nVar = (a3.n) this.b;
        Surface surface = nVar.r1;
        if (surface != null) {
            nVar.b1.w(surface);
            nVar.u1 = true;
        }
    }

    @Override // org.telegram.ui.Components.f81
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.f81
    public void onStateChanged(boolean z10, int i10) {
        a7 a7Var = (a7) this.b;
        x6 x6Var = a7Var.M;
        i81 i81Var = a7Var.x;
        if (i81Var == null) {
            return;
        }
        if (i81Var.y()) {
            AndroidUtilities.runOnUIThread(x6Var);
        } else {
            AndroidUtilities.cancelRunOnUIThread(x6Var);
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        d2 d2Var;
        d1 b10;
        d6.a aVar = (d6.a) this.b;
        Bundle bundle = (Bundle) obj;
        if (p0.j) {
            Context context = aVar.a;
            g6.r rVar = aVar.f;
            p0 p0Var = new p0(context, rVar, aVar.c, aVar.j, aVar.g);
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
            String u10 = t8.b.u(packageName, ".client_cast_analytics_data");
            p0Var.h = bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE") == 0 ? 1 : 2;
            l5.s.b(context);
            p0Var.g = l5.s.a().c(j5.a.e).a("CAST_SENDER_SDK", new i5.c("proto"), z.a);
            if (bundle.containsKey("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE")) {
                p0Var.e = Long.valueOf(bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE"));
            }
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(u10, 0);
            if (i10 != 0) {
                com.google.android.gms.common.api.internal.v b11 = com.google.android.gms.common.api.internal.w.b();
                b11.c = new k0(rVar, new String[]{"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"});
                b11.d = new k6.c[]{y.c};
                b11.b = false;
                b11.a = 8426;
                Task e = rVar.e(0, b11.a());
                j6.l lVar = new j6.l();
                lVar.b = p0Var;
                lVar.c = packageName;
                lVar.a = i10;
                lVar.d = sharedPreferences;
                e.addOnSuccessListener(lVar);
            }
            if (z10) {
                n6.l.h(sharedPreferences);
                g6.b bVar = d2.i;
                synchronized (d2.class) {
                    try {
                        if (d2.k == null) {
                            d2.k = new d2(sharedPreferences, p0Var, packageName);
                        }
                        d2Var = d2.k;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                String str = d2Var.c;
                SharedPreferences sharedPreferences2 = d2Var.b;
                HashSet hashSet = d2Var.f;
                String string = sharedPreferences2.getString("feature_usage_sdk_version", null);
                String string2 = sharedPreferences2.getString("feature_usage_package_name", null);
                hashSet.clear();
                HashSet hashSet2 = d2Var.g;
                hashSet2.clear();
                d2Var.h = 0L;
                String str2 = d2.j;
                if (str2.equals(string) && str.equals(string2)) {
                    d2Var.h = sharedPreferences2.getLong("feature_usage_last_report_time", 0L);
                    long currentTimeMillis = System.currentTimeMillis();
                    HashSet hashSet3 = new HashSet();
                    for (String str3 : sharedPreferences2.getAll().keySet()) {
                        if (str3.startsWith("feature_usage_timestamp_")) {
                            long j10 = sharedPreferences2.getLong(str3, 0L);
                            if (j10 != 0 && currentTimeMillis - j10 > 1209600000) {
                                hashSet3.add(str3);
                            } else if (str3.startsWith("feature_usage_timestamp_reported_feature_")) {
                                d1 b12 = d2.b(str3.substring(41));
                                if (b12 != null) {
                                    hashSet2.add(b12);
                                    hashSet.add(b12);
                                }
                            } else if (str3.startsWith("feature_usage_timestamp_detected_feature_") && (b10 = d2.b(str3.substring(41))) != null) {
                                hashSet.add(b10);
                            }
                        }
                    }
                    d2Var.c(hashSet3);
                    n6.l.h(d2Var.e);
                    n6.l.h(d2Var.d);
                    d2Var.e.post(d2Var.d);
                } else {
                    HashSet hashSet4 = new HashSet();
                    for (String str4 : sharedPreferences2.getAll().keySet()) {
                        if (str4.startsWith("feature_usage_timestamp_")) {
                            hashSet4.add(str4);
                        }
                    }
                    hashSet4.add("feature_usage_last_report_time");
                    d2Var.c(hashSet4);
                    sharedPreferences2.edit().putString("feature_usage_sdk_version", str2).putString("feature_usage_package_name", str).apply();
                }
                d2.a(d1.h);
            }
        }
    }

    @Override // org.telegram.ui.Components.f81
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // a3.n0
    public void onVideoSizeChanged(b2 b2Var) {
    }

    @Override // mg.e
    public boolean p() {
        l0 l0Var = (l0) this.b;
        l0Var.e.invalidate();
        return l0Var.h.j();
    }

    @Override // ji.j0
    public boolean p0() {
        z0 z0Var = (z0) this.b;
        s3 s3Var = z0Var.S;
        if (s3Var == null) {
            return false;
        }
        ji.a aVar = z0Var.a;
        return s3Var.a.T4();
    }

    @Override // l.w
    public boolean q(l.k kVar) {
        Window.Callback callback;
        r rVar = (r) this.b;
        if (kVar != kVar.k() || !rVar.O || (callback = rVar.f.getCallback()) == null || rVar.Z) {
            return true;
        }
        callback.onMenuOpened(108, kVar);
        return true;
    }

    @Override // org.telegram.ui.Components.lb0
    public void r(int i10, int i11, CharSequence charSequence, boolean z10) {
        di.g gVar = ((di.m) this.b).f;
        if (gVar == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gVar.getText());
            spannableStringBuilder.replace(i10, i11 + i10, charSequence);
            if (z10) {
                Emoji.replaceEmoji(spannableStringBuilder, gVar.getEditText().getPaint().getFontMetricsInt(), false);
            }
            gVar.setText(spannableStringBuilder);
            gVar.setSelection(i10 + charSequence.length());
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // mg.e
    public boolean r0() {
        l0 l0Var = (l0) this.b;
        g0 g0Var = l0Var.h;
        boolean m10 = g0Var.m(-90.0f);
        g0Var.i();
        l0Var.e.invalidate();
        return m10;
    }

    public synchronized void s() {
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

    @Override // f6.a
    public void t(Bitmap bitmap) {
        ((f6.h) this.b).e(bitmap, 3);
    }

    @Override // ji.j0
    public void t0(int i10, int i11) {
        z0 z0Var = (z0) this.b;
        s3 s3Var = z0Var.S;
        if (s3Var != null) {
            ji.a aVar = z0Var.a;
            h2 h2Var = s3Var.a.H3;
            if (h2Var != null) {
                h2Var.f(i10, i11);
            }
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        JSONObject jSONObject;
        FileWriter fileWriter;
        ea.b bVar = (ea.b) this.b;
        c5.j jVar = (c5.j) bVar.f;
        ea.d dVar = (ea.d) bVar.b;
        String str = jVar.a;
        FileWriter fileWriter2 = null;
        try {
            HashMap b10 = c5.j.b(dVar);
            androidx.biometric.e eVar = new androidx.biometric.e(str, b10);
            eVar.r("User-Agent", "Crashlytics Android SDK/18.6.0");
            eVar.r("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
            c5.j.a(eVar, dVar);
            String str2 = "Requesting settings from " + str;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
            String str3 = "Settings query params were: " + b10;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str3, null);
            }
            jSONObject = jVar.c(eVar.j());
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "Settings request failed.", e);
            jSONObject = null;
        }
        if (jSONObject != null) {
            ea.a O = ((a4.l) bVar.c).O(jSONObject);
            m mVar = (m) bVar.e;
            long j10 = O.c;
            mVar.getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                jSONObject.put("expires_at", j10);
                fileWriter = new FileWriter((File) mVar.b);
                try {
                    try {
                        fileWriter.write(jSONObject.toString());
                        fileWriter.flush();
                    } catch (Exception e7) {
                        e = e7;
                        Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                        x9.h.c(fileWriter, "Failed to close settings writer.");
                        ea.b.f("Loaded settings: ", jSONObject);
                        String str4 = dVar.f;
                        SharedPreferences.Editor edit = ((Context) bVar.a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                        edit.putString("existing_instance_identifier", str4);
                        edit.apply();
                        ((AtomicReference) bVar.h).set(O);
                        ((TaskCompletionSource) ((AtomicReference) bVar.i).get()).trySetResult(O);
                        return Tasks.forResult(null);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileWriter2 = fileWriter;
                    x9.h.c(fileWriter2, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e10) {
                e = e10;
                fileWriter = null;
            } catch (Throwable th3) {
                th = th3;
                x9.h.c(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
            x9.h.c(fileWriter, "Failed to close settings writer.");
            ea.b.f("Loaded settings: ", jSONObject);
            String str42 = dVar.f;
            SharedPreferences.Editor edit2 = ((Context) bVar.a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            edit2.putString("existing_instance_identifier", str42);
            edit2.apply();
            ((AtomicReference) bVar.h).set(O);
            ((TaskCompletionSource) ((AtomicReference) bVar.i).get()).trySetResult(O);
        }
        return Tasks.forResult(null);
    }

    public String toString() {
        switch (this.a) {
            case 22:
                return "<" + ((String) this.b) + '>';
            default:
                return super.toString();
        }
    }

    public void w(int i10, String str) {
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        C(i10, 2);
        try {
            int I = I(str.length());
            if (I != I(str.length() * 3)) {
                A(v(str));
                D(str, byteBuffer);
                return;
            }
            int position = byteBuffer.position();
            if (byteBuffer.remaining() < I) {
                throw new z4(position + I, byteBuffer.limit());
            }
            byteBuffer.position(position + I);
            D(str, byteBuffer);
            int position2 = byteBuffer.position();
            byteBuffer.position(position);
            A((position2 - position) - I);
            byteBuffer.position(position2);
        } catch (BufferOverflowException e) {
            z4 z4Var = new z4(byteBuffer.position(), byteBuffer.limit());
            z4Var.initCause(e);
            throw z4Var;
        }
    }

    public void x(int i10, byte[] bArr) {
        C(i10, 2);
        A(bArr.length);
        int length = bArr.length;
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        if (byteBuffer.remaining() < length) {
            throw new z4(byteBuffer.position(), byteBuffer.limit());
        }
        byteBuffer.put(bArr, 0, length);
    }

    public void z(int i10) {
        byte b10 = (byte) i10;
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        if (!byteBuffer.hasRemaining()) {
            throw new z4(byteBuffer.position(), byteBuffer.limit());
        }
        byteBuffer.put(b10);
    }

    public /* synthetic */ i(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.f81
    public void onRenderedFirstFrame() {
    }

    @Override // org.telegram.ui.Components.f81
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        rg.d2 d2Var = ((a7) this.b).w;
        if (d2Var != null) {
            float f10 = i10 / i11;
            if (Math.abs(d2Var.y0 - f10) >= 1.0E-4f) {
                d2Var.y0 = f10;
                d2Var.requestLayout();
            }
        }
    }

    public i(byte[] bArr, int i10) {
        this.a = 11;
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

    public i(int i10) {
        this.a = i10;
        switch (i10) {
            case 24:
                break;
            default:
                this.b = new LinkedHashMap();
                break;
        }
    }

    @Override // hg.z1
    public /* synthetic */ void O0(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.f81
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.f81
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.f81
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // org.telegram.ui.Components.lb0
    public /* synthetic */ void y(String str) {
    }

    @Override // org.telegram.ui.Components.f81
    public void onError(i81 i81Var, Exception exc) {
    }

    @Override // org.telegram.ui.Components.lb0
    public /* synthetic */ void g(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
    }

    @Override // org.telegram.ui.Components.lb0
    public /* synthetic */ void m(TLRPC.TL_document tL_document, String str, Object obj) {
    }
}
