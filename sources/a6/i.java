package a6;

import a3.m0;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.biometric.f0;
import androidx.lifecycle.a0;
import bi.b8;
import bi.e8;
import bi.q0;
import c6.e0;
import c6.y;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.internal.cast.b0;
import com.google.android.gms.internal.cast.b5;
import com.google.android.gms.internal.cast.f1;
import com.google.android.gms.internal.cast.f2;
import com.google.android.gms.internal.cast.r0;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.d0;
import e2.v;
import e6.o;
import e6.p;
import g6.n;
import g6.r;
import g6.w;
import hi.c1;
import hi.e3;
import hi.h5;
import hi.j1;
import hi.j5;
import hi.k1;
import hi.k2;
import hi.l0;
import hi.r2;
import hi.u3;
import hi.z3;
import i2.h0;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
import l.x;
import org.json.JSONException;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.r6;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Components.q71;
import org.telegram.ui.Components.t71;
import org.telegram.ui.Components.ua0;
import pg.b2;
import r0.i0;
import r0.l1;
import v7.p8;
import z3.m;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class i implements m0, s, a0, ua0, kg.e, q71, androidx.activity.result.b, OnSuccessListener, n, fb.n, r0.n, db.n, he.a, l0, j1, m, x {
    public static i c;
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ i(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public static synchronized i L(Context context) {
        i Q;
        synchronized (i.class) {
            Q = Q(context.getApplicationContext());
        }
        return Q;
    }

    public static synchronized i Q(Context context) {
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

    public static int S(CharSequence charSequence) {
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

    public static int Z(int i10, String str) {
        int f02 = f0(i10);
        int S = S(str);
        return g0(S) + S + f02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v20 */
    public static void c0(CharSequence charSequence, ByteBuffer byteBuffer) {
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

    public static int e0(long j3) {
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

    public static int f0(int i10) {
        return g0(i10 << 3);
    }

    public static int g0(int i10) {
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

    @Override // z3.m
    public void A(byte[] bArr, int i10, int i11, z3.l lVar, e2.h hVar) {
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
        hVar.accept(new z3.a(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    @Override // kg.e
    public void B(float f7) {
        ((q0) this.b).h.setRotation(f7);
    }

    @Override // a3.m0
    public void C() {
        h0 h0Var = ((a3.n) this.b).W;
        if (h0Var != null) {
            h0Var.a();
        }
    }

    @Override // hi.l0
    public s9 E() {
        u3 u3Var = ((c1) this.b).S;
        if (u3Var == null) {
            return null;
        }
        return u3Var.a.getTextSelectionHelper();
    }

    @Override // hi.j1
    public /* synthetic */ boolean F(k1 k1Var) {
        return false;
    }

    @Override // hi.j1
    public void G(Editable editable) {
        ((j5) this.b).h();
    }

    @Override // hi.j1
    public /* synthetic */ boolean H(boolean z10) {
        return false;
    }

    public db.i I(Object obj) {
        db.g gVar = ((gb.a0) this.b).b;
        gVar.getClass();
        if (obj == null) {
            return db.k.a;
        }
        Class<?> cls = obj.getClass();
        gb.n nVar = new gb.n();
        gVar.f(obj, cls, nVar);
        return nVar.u();
    }

    @Override // hi.l0
    public void J(CharSequence charSequence) {
        u3 u3Var = ((c1) this.b).S;
        if (u3Var != null) {
            u3Var.getClass();
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            u3Var.a.s4(charSequence.toString());
        }
    }

    @Override // hi.l0
    public r9 M() {
        return (c1) this.b;
    }

    public synchronized void N() {
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

    @Override // hi.l0
    public hi.a O() {
        return ((c1) this.b).a;
    }

    @Override // hi.j1
    public /* synthetic */ boolean P(k1 k1Var) {
        return false;
    }

    @Override // r0.n
    public l1 Q0(View view, l1 l1Var) {
        boolean z10;
        boolean z11;
        int d = l1Var.d();
        g.s sVar = (g.s) this.b;
        Context context = sVar.e;
        int d10 = l1Var.d();
        ActionBarContextView actionBarContextView = sVar.y;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z10 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) sVar.y.getLayoutParams();
            if (sVar.y.isShown()) {
                if (sVar.l0 == null) {
                    sVar.l0 = new Rect();
                    sVar.m0 = new Rect();
                }
                Rect rect = sVar.l0;
                Rect rect2 = sVar.m0;
                rect.set(l1Var.b(), l1Var.d(), l1Var.c(), l1Var.a());
                ViewGroup viewGroup = sVar.J;
                Method method = m.u3.a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect, rect2);
                    } catch (Exception e) {
                        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
                    }
                }
                int i10 = rect.top;
                int i11 = rect.left;
                int i12 = rect.right;
                l1 f7 = i0.f(sVar.J);
                int b10 = f7 == null ? 0 : f7.b();
                int c10 = f7 == null ? 0 : f7.c();
                if (marginLayoutParams.topMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i10;
                    marginLayoutParams.leftMargin = i11;
                    marginLayoutParams.rightMargin = i12;
                    z11 = true;
                }
                if (i10 <= 0 || sVar.L != null) {
                    View view2 = sVar.L;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i13 = marginLayoutParams2.height;
                        int i14 = marginLayoutParams.topMargin;
                        if (i13 != i14 || marginLayoutParams2.leftMargin != b10 || marginLayoutParams2.rightMargin != c10) {
                            marginLayoutParams2.height = i14;
                            marginLayoutParams2.leftMargin = b10;
                            marginLayoutParams2.rightMargin = c10;
                            sVar.L.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    sVar.L = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b10;
                    layoutParams.rightMargin = c10;
                    sVar.J.addView(sVar.L, -1, layoutParams);
                }
                View view4 = sVar.L;
                r9 = view4 != null;
                if (r9 && view4.getVisibility() != 0) {
                    View view5 = sVar.L;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? f0.e.c(context, R.color.abc_decor_view_status_guard_light) : f0.e.c(context, R.color.abc_decor_view_status_guard));
                }
                if (!sVar.Q && r9) {
                    d10 = 0;
                }
                z10 = r9;
                r9 = z11;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z10 = false;
            } else {
                z10 = false;
                r9 = false;
            }
            if (r9) {
                sVar.y.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = sVar.L;
        if (view6 != null) {
            view6.setVisibility(z10 ? 0 : 8);
        }
        return i0.h(view, d != d10 ? l1Var.f(l1Var.b(), d10, l1Var.c(), l1Var.a()) : l1Var);
    }

    @Override // hi.l0
    public boolean R() {
        c1 c1Var = (c1) this.b;
        u3 u3Var = c1Var.S;
        if (u3Var == null) {
            return false;
        }
        hi.a aVar = c1Var.a;
        return u3Var.a.R4();
    }

    @Override // hi.l0
    public void U(int i10, int i11) {
        c1 c1Var = (c1) this.b;
        u3 u3Var = c1Var.S;
        if (u3Var != null) {
            hi.a aVar = c1Var.a;
            k2 k2Var = u3Var.a.J3;
            if (k2Var != null) {
                k2Var.f(i10, i11);
            }
        }
    }

    public void V(int i10, String str) {
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        a0(i10, 2);
        try {
            int g02 = g0(str.length());
            if (g02 != g0(str.length() * 3)) {
                Y(S(str));
                c0(str, byteBuffer);
                return;
            }
            int position = byteBuffer.position();
            if (byteBuffer.remaining() < g02) {
                throw new b5(position + g02, byteBuffer.limit());
            }
            byteBuffer.position(position + g02);
            c0(str, byteBuffer);
            int position2 = byteBuffer.position();
            byteBuffer.position(position);
            Y((position2 - position) - g02);
            byteBuffer.position(position2);
        } catch (BufferOverflowException e) {
            b5 b5Var = new b5(byteBuffer.position(), byteBuffer.limit());
            b5Var.initCause(e);
            throw b5Var;
        }
    }

    public void W(int i10, byte[] bArr) {
        a0(i10, 2);
        Y(bArr.length);
        int length = bArr.length;
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        if (byteBuffer.remaining() < length) {
            throw new b5(byteBuffer.position(), byteBuffer.limit());
        }
        byteBuffer.put(bArr, 0, length);
    }

    public void X(int i10) {
        byte b10 = (byte) i10;
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        if (!byteBuffer.hasRemaining()) {
            throw new b5(byteBuffer.position(), byteBuffer.limit());
        }
        byteBuffer.put(b10);
    }

    public void Y(int i10) {
        while ((i10 & (-128)) != 0) {
            X((i10 & 127) | 128);
            i10 >>>= 7;
        }
        X(i10);
    }

    public String a(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            ka.d dVar = (ka.d) this.b;
            ka.e eVar = new ka.e(stringWriter, dVar.a, dVar.b, dVar.c, dVar.d);
            eVar.h(obj);
            eVar.j();
            eVar.b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    public void a0(int i10, int i11) {
        Y((i10 << 3) | i11);
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
                cVar2.G0(obtain, 1);
                break;
            default:
                w wVar = (w) obj;
                g6.f fVar = (g6.f) wVar.u();
                c6.d0 d0Var = ((e0) this.b).k;
                Parcel O0 = fVar.O0();
                com.google.android.gms.internal.cast.v.d(O0, d0Var);
                fVar.T0(O0, 18);
                g6.f fVar2 = (g6.f) wVar.u();
                fVar2.T0(fVar2.O0(), 17);
                ((TaskCompletionSource) obj2).setResult(null);
                break;
        }
    }

    @Override // hi.l0, hi.j1
    public void b(k1 k1Var) {
        switch (this.a) {
            case 22:
                u3 u3Var = ((c1) this.b).S;
                if (u3Var != null) {
                    z3 z3Var = u3Var.a;
                    z3.L1(z3Var, k1Var);
                    z3Var.h3.C(k1Var, true);
                    break;
                }
                break;
            default:
                h5 h5Var = ((j5) this.b).s;
                if (h5Var != null) {
                    z3 z3Var2 = ((e3) h5Var).a;
                    z3.L1(z3Var2, k1Var);
                    z3Var2.h3.C(k1Var, true);
                    break;
                }
                break;
        }
    }

    @Override // hi.l0
    public void b0() {
        c1 c1Var = (c1) this.b;
        u3 u3Var = c1Var.S;
        if (u3Var != null) {
            hi.a aVar = c1Var.a;
            z3 z3Var = u3Var.a;
            k2 k2Var = z3Var.J3;
            if (k2Var != null) {
                k2Var.g();
            }
            z3Var.h3.onContentChanged();
        }
    }

    @Override // l.x
    public void c(l.l lVar, boolean z10) {
        if (lVar instanceof l.e0) {
            ((l.e0) lVar).z.k().c(false);
        }
        x xVar = ((m.h) this.b).e;
        if (xVar != null) {
            xVar.c(lVar, z10);
        }
    }

    public void d0(long j3) {
        while (((-128) & j3) != 0) {
            X((((int) j3) & 127) | 128);
            j3 >>>= 7;
        }
        X((int) j3);
    }

    @Override // kg.e
    public boolean e() {
        q0 q0Var = (q0) this.b;
        q0Var.e.invalidate();
        return q0Var.h.j();
    }

    @Override // hi.j1
    public /* synthetic */ boolean f() {
        return false;
    }

    @Override // hi.l0
    public void g() {
        c1 c1Var = (c1) this.b;
        u3 u3Var = c1Var.S;
        if (u3Var != null) {
            z3.O1(u3Var.a, c1Var.a);
        }
    }

    @Override // kg.e
    public void i() {
        ((q0) this.b).h.o();
    }

    @Override // androidx.activity.result.b
    public void j(Object obj) {
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.b;
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.b;
        int i10 = u.e("ProxyBillingActivityV2", intent).a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.M;
        if (resultReceiver != null) {
            resultReceiver.send(i10, intent == null ? null : intent.getExtras());
        }
        int i11 = aVar.a;
        if (i11 != -1 || i10 != 0) {
            u.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i11 + " and billing's responseCode: " + i10);
        }
        proxyBillingActivityV2.finish();
    }

    @Override // z3.m
    public /* synthetic */ z3.d k(int i10, int i11, byte[] bArr) {
        return w.f.a(this, bArr, i11);
    }

    @Override // a3.m0
    public void l() {
        a3.n nVar = (a3.n) this.b;
        if (nVar.n1 != null) {
            nVar.N0(0, 1);
        }
    }

    @Override // g6.n
    public void m(String str, long j3, long j10, long j11) {
        p pVar = (p) this.b;
        try {
            pVar.a(new o(new Status(2103, null, null, null), 1));
        } catch (IllegalStateException e) {
            g6.b bVar = e6.h.k;
            Log.e(bVar.a, bVar.d("Result already set when calling onRequestReplaced", new Object[0]), e);
        }
        Iterator it = pVar.q.i.iterator();
        while (it.hasNext()) {
            ((e6.g) it.next()).h(str, j3, 2103, j10, j11);
        }
    }

    @Override // z3.m
    public int n() {
        return 2;
    }

    @Override // fb.n
    public Object n2() {
        Constructor constructor = (Constructor) this.b;
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e) {
            p8 p8Var = ib.c.a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        } catch (InstantiationException e7) {
            throw new RuntimeException("Failed to invoke constructor '" + ib.c.b(constructor) + "' with no args", e7);
        } catch (InvocationTargetException e10) {
            throw new RuntimeException("Failed to invoke constructor '" + ib.c.b(constructor) + "' with no args", e10.getCause());
        }
    }

    @Override // org.telegram.ui.Components.ua0
    public Paint.FontMetricsInt o() {
        return ((bi.o) this.b).f.getEditText().getPaint().getFontMetricsInt();
    }

    @Override // a3.m0
    public void onFirstFrameRendered() {
        a3.n nVar = (a3.n) this.b;
        Surface surface = nVar.n1;
        if (surface != null) {
            nVar.Z0.n0(surface);
            nVar.q1 = true;
        }
    }

    @Override // org.telegram.ui.Components.q71
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.q71
    public void onStateChanged(boolean z10, int i10) {
        e8 e8Var = (e8) this.b;
        b8 b8Var = e8Var.M;
        t71 t71Var = e8Var.x;
        if (t71Var == null) {
            return;
        }
        if (t71Var.y()) {
            AndroidUtilities.runOnUIThread(b8Var);
        } else {
            AndroidUtilities.cancelRunOnUIThread(b8Var);
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
            String t10 = r6.t(packageName, ".client_cast_analytics_data");
            r0Var.h = bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE") == 0 ? 1 : 2;
            l5.s.b(context);
            r0Var.g = l5.s.a().c(j5.a.e).a("CAST_SENDER_SDK", new i5.c("proto"), b0.a);
            if (bundle.containsKey("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE")) {
                r0Var.e = Long.valueOf(bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE"));
            }
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(t10, 0);
            if (i10 != 0) {
                com.google.android.gms.common.api.internal.v e = com.google.android.gms.common.api.internal.w.e();
                e.c = new a4.m(rVar, new String[]{"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"});
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

    @Override // org.telegram.ui.Components.q71
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.q71
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        b2 b2Var = ((e8) this.b).w;
        if (b2Var != null) {
            float f10 = i10 / i11;
            if (Math.abs(b2Var.y0 - f10) >= 1.0E-4f) {
                b2Var.y0 = f10;
                b2Var.requestLayout();
            }
        }
    }

    @Override // kg.e
    public void p() {
        ((q0) this.b).h.a.g(1, true);
    }

    @Override // hi.l0
    public void p0() {
        c1 c1Var = (c1) this.b;
        u3 u3Var = c1Var.S;
        if (u3Var != null) {
            hi.a aVar = c1Var.a;
            z3.N1(u3Var.a);
        }
    }

    @Override // kg.e
    public boolean q() {
        q0 q0Var = (q0) this.b;
        bi.l0 l0Var = q0Var.h;
        boolean m10 = l0Var.m(-90.0f);
        l0Var.i();
        q0Var.e.invalidate();
        return m10;
    }

    @Override // hi.j1
    public void r(k1 k1Var, int i10, int i11) {
        h5 h5Var;
        s9 textSelectionHelper;
        j5 j5Var = (j5) this.b;
        if (j5Var.w || i10 == i11 || (h5Var = j5Var.s) == null || (textSelectionHelper = ((e3) h5Var).a.getTextSelectionHelper()) == null) {
            return;
        }
        k1Var.post(new di.b5(this, k1Var, i11, textSelectionHelper, i10, 3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0043, code lost:
    
        if (r3 == 1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0049, code lost:
    
        if (r3 == 3) goto L23;
     */
    @Override // androidx.lifecycle.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void r0(Object obj) {
        Integer num = (Integer) obj;
        f0 f0Var = (f0) this.b;
        Handler handler = f0Var.A0;
        androidx.activity.i iVar = f0Var.B0;
        handler.removeCallbacks(iVar);
        int intValue = num.intValue();
        if (f0Var.F0 != null && Build.VERSION.SDK_INT >= 23) {
            int i10 = f0Var.C0.y;
            Context n10 = f0Var.n();
            Drawable drawable = null;
            if (n10 == null) {
                Log.w("FingerprintFragment", "Unable to get asset. Context is null.");
            } else {
                int i11 = R.drawable.fingerprint_dialog_fp_icon;
                if (i10 != 0 || intValue != 1) {
                    if (i10 == 1 && intValue == 2) {
                        i11 = R.drawable.fingerprint_dialog_error;
                    } else {
                        if (i10 == 2) {
                        }
                        if (i10 == 1) {
                        }
                    }
                }
                drawable = n10.getDrawable(i11);
            }
            if (drawable != null) {
                f0Var.F0.setImageDrawable(drawable);
                if ((i10 != 0 || intValue != 1) && ((i10 == 1 && intValue == 2) || (i10 == 2 && intValue == 1))) {
                    androidx.biometric.d0.a(drawable);
                }
                f0Var.C0.y = intValue;
            }
        }
        int intValue2 = num.intValue();
        TextView textView = f0Var.G0;
        if (textView != null) {
            textView.setTextColor(intValue2 == 2 ? f0Var.D0 : f0Var.E0);
        }
        handler.postDelayed(iVar, 2000L);
    }

    public void s() {
        ((androidx.fragment.app.u) this.b).d.R();
    }

    @Override // l.x
    public boolean u(l.l lVar) {
        m.h hVar = (m.h) this.b;
        if (lVar == hVar.c) {
            return false;
        }
        ((l.e0) lVar).A.getClass();
        hVar.getClass();
        x xVar = hVar.e;
        if (xVar != null) {
            return xVar.u(lVar);
        }
        return false;
    }

    @Override // kg.e
    public void w() {
        ((q0) this.b).h.k();
    }

    @Override // hi.j1
    public void x(k1 k1Var) {
        hi.a aVar;
        j5 j5Var = (j5) this.b;
        h5 h5Var = j5Var.s;
        if (h5Var == null || (aVar = j5Var.a) == null) {
            return;
        }
        z3 z3Var = ((e3) h5Var).a;
        ArrayList arrayList = z3Var.l3;
        long j3 = aVar.t;
        if (j3 == 0) {
            return;
        }
        int i10 = -1;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (((hi.a) arrayList.get(i11)).k.contains(Long.valueOf(j3))) {
                i10 = i11;
            }
        }
        if (i10 < 0) {
            return;
        }
        k2 k2Var = z3Var.J3;
        if (k2Var != null) {
            k2Var.d();
        }
        hi.a aVar2 = new hi.a(new TL_iv.pageBlockParagraph(), 0, 0);
        ArrayList arrayList2 = aVar.k;
        ArrayList arrayList3 = aVar2.k;
        arrayList3.addAll(arrayList2);
        if (!arrayList3.isEmpty()) {
            a4.a.x(1, arrayList3);
        }
        arrayList.add(i10 + 1, aVar2);
        z3Var.r4();
        z3Var.Y2.N(false);
        k2 k2Var2 = z3Var.J3;
        if (k2Var2 != null) {
            k2Var2.h();
        }
        z3Var.post(new r2(z3Var, aVar2, 26));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004d A[LOOP:0: B:16:0x0047->B:18:0x004d, LOOP_END] */
    @Override // g6.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void y(String str, long j3, int i10, Object obj, long j10, long j11) {
        int i11;
        Iterator it;
        p pVar = (p) this.b;
        try {
            i11 = i10;
            try {
                Status status = new Status(i11, null, null, null);
                Object obj2 = true == (obj instanceof g6.l) ? obj : null;
                if (obj2 != null) {
                }
                if (obj2 != null) {
                }
                pVar.a(new o(status, 2));
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

    @Override // org.telegram.ui.Components.ua0
    public void z(int i10, int i11, CharSequence charSequence, boolean z10) {
        bi.i iVar = ((bi.o) this.b).f;
        if (iVar == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(iVar.getText());
            spannableStringBuilder.replace(i10, i11 + i10, charSequence);
            if (z10) {
                Emoji.replaceEmoji(spannableStringBuilder, iVar.getEditText().getPaint().getFontMetricsInt(), false);
            }
            iVar.setText(spannableStringBuilder);
            iVar.setSelection(i10 + charSequence.length());
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public i(byte[] bArr, int i10) {
        this.a = 13;
        ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, i10);
        this.b = wrap;
        wrap.order(ByteOrder.LITTLE_ENDIAN);
    }

    @Override // org.telegram.ui.Components.q71
    public void onRenderedFirstFrame() {
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

    public i(x6.a aVar) {
        this.a = 26;
        n6.l.h(aVar);
        this.b = aVar;
    }

    public i(int i10) {
        this.a = i10;
        switch (i10) {
            case 15:
                this.b = new ArrayList();
                new ArrayList();
                new ArrayList();
                break;
            case 25:
                this.b = new v();
                break;
        }
    }

    @Override // a3.m0
    public void T() {
    }

    @Override // z3.m
    public /* synthetic */ void reset() {
    }

    @Override // hi.j1
    public /* synthetic */ void t() {
    }

    @Override // hi.j1
    public /* synthetic */ void D(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Components.ua0
    public /* synthetic */ void K(String str) {
    }

    @Override // org.telegram.ui.Components.q71
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.q71
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.q71
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // hi.j1
    public /* synthetic */ void h(int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.q71
    public void onError(t71 t71Var, Exception exc) {
    }

    @Override // org.telegram.ui.Components.ua0
    public /* synthetic */ void d(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
    }

    @Override // org.telegram.ui.Components.ua0
    public /* synthetic */ void v(TLRPC.TL_document tL_document, String str, Object obj) {
    }
}
