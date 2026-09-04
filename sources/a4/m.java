package a4;

import a9.q;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.biometric.u;
import androidx.biometric.y;
import androidx.fragment.app.o;
import androidx.fragment.app.r;
import androidx.lifecycle.a0;
import androidx.lifecycle.t;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.internal.cast.b0;
import com.google.android.gms.internal.cast.b5;
import com.google.android.gms.internal.cast.f1;
import com.google.android.gms.internal.cast.f2;
import com.google.android.gms.internal.cast.r0;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import di.d0;
import di.d7;
import di.dc;
import di.e0;
import di.fc;
import di.k6;
import di.o8;
import di.pc;
import di.rb;
import di.tc;
import e2.v;
import fb.n;
import hg.a2;
import hg.z1;
import java.io.File;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import ji.g2;
import ji.h1;
import ji.j0;
import ji.p3;
import ji.v3;
import ji.z;
import m.s3;
import mg.p;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;
import org.json.JSONObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.hh;
import org.telegram.ui.Components.rn0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.gy;
import r0.i0;
import r0.l1;
import rg.d2;
import v7.t7;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class m implements z3.d, q, a0, androidx.activity.result.b, WebMessageListenerBoundaryInterface, ce.b, OnSuccessListener, p, tc, f6.a, n, r0.n, db.n, s, a2, z3.m, ti, OnCompleteListener, j0 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ m(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public static void g0(aa.a aVar, da.d dVar) {
        String str = dVar.a;
        if (str != null) {
            aVar.x("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        aVar.x("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        aVar.x("X-CRASHLYTICS-API-CLIENT-VERSION", "18.6.0");
        aVar.x("Accept", "application/json");
        String str2 = dVar.b;
        if (str2 != null) {
            aVar.x("X-CRASHLYTICS-DEVICE-MODEL", str2);
        }
        String str3 = dVar.c;
        if (str3 != null) {
            aVar.x("X-CRASHLYTICS-OS-BUILD-VERSION", str3);
        }
        String str4 = dVar.d;
        if (str4 != null) {
            aVar.x("X-CRASHLYTICS-OS-DISPLAY-VERSION", str4);
        }
        String str5 = dVar.e.b().a;
        if (str5 != null) {
            aVar.x("X-CRASHLYTICS-INSTALLATION-ID", str5);
        }
    }

    public static HashMap i0(da.d dVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", dVar.h);
        hashMap.put("display_version", dVar.g);
        hashMap.put("source", Integer.toString(dVar.i));
        String str = dVar.f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    public static int m0(CharSequence charSequence) {
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

    public static int s0(int i10, String str) {
        int x02 = x0(i10);
        int m0 = m0(str);
        return y0(m0) + m0 + x02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v20 */
    public static void u0(CharSequence charSequence, ByteBuffer byteBuffer) {
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

    public static int w0(long j3) {
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

    public static int x0(int i10) {
        return y0(i10 << 3);
    }

    public static int y0(int i10) {
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

    @Override // ji.j0
    public void A(CharSequence charSequence) {
        p3 p3Var = ((z) this.b).O;
        if (p3Var != null) {
            p3Var.getClass();
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            p3Var.a.s4(charSequence.toString());
        }
    }

    @Override // org.telegram.ui.Components.ti
    public void B(hh hhVar) {
        int i10;
        i10 = ((n2) ((ig.m) this.b)).currentAccount;
        NotificationCenter.getInstance(i10).doOnIdle(hhVar);
    }

    @Override // di.tc
    public void C(float f7, boolean z10) {
        d7 d7Var = (d7) this.b;
        o8 o8Var = d7Var.d;
        if (o8Var == null) {
            return;
        }
        o8Var.Z = f7;
        o8Var.j = true;
        g71 g71Var = d7Var.e;
        if (g71Var == null || g71Var.p() == -9223372036854775807L) {
            return;
        }
        d7Var.m((long) (f7 * d7Var.e.p()));
    }

    @Override // ji.j0
    public p9 D() {
        return (z) this.b;
    }

    @Override // org.telegram.ui.Components.ti
    public /* synthetic */ boolean D0() {
        return false;
    }

    @Override // ji.j0
    public ji.a F() {
        return ((z) this.b).a;
    }

    @Override // hg.a2
    public /* synthetic */ a0.i G() {
        return null;
    }

    @Override // di.tc
    public void I(long j3) {
        d7 d7Var = (d7) this.b;
        o8 o8Var = d7Var.d;
        if (o8Var == null) {
            return;
        }
        o8Var.r0 = j3;
        o8Var.j = true;
        d7Var.y(true);
    }

    @Override // di.tc
    public void J(boolean z10) {
        d2 d2Var;
        pc pcVar = ((dc) ((d7) this.b)).C0;
        rb rbVar = pcVar.v1;
        if (rbVar == null) {
            return;
        }
        d2 d2Var2 = null;
        if (!z10 && (rbVar.getSelectedEntity() instanceof d2)) {
            pcVar.v1.D0(null, true);
            return;
        }
        if (!z10 || (pcVar.v1.getSelectedEntity() instanceof d2)) {
            return;
        }
        k6 k6Var = pcVar.v1.R0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= k6Var.getChildCount()) {
                d2Var = null;
                break;
            }
            View childAt = k6Var.getChildAt(i11);
            if (childAt instanceof d2) {
                d2Var = (d2) childAt;
                break;
            }
            i11++;
        }
        if (d2Var != null) {
            rb rbVar2 = pcVar.v1;
            k6 k6Var2 = rbVar2.R0;
            while (true) {
                if (i10 >= k6Var2.getChildCount()) {
                    break;
                }
                View childAt2 = k6Var2.getChildAt(i10);
                if (childAt2 instanceof d2) {
                    d2Var2 = (d2) childAt2;
                    break;
                }
                i10++;
            }
            rbVar2.D0(d2Var2, true);
        }
    }

    @Override // ji.j0
    public boolean L() {
        z zVar = (z) this.b;
        p3 p3Var = zVar.O;
        if (p3Var == null) {
            return false;
        }
        ji.a aVar = zVar.a;
        return p3Var.a.R4();
    }

    @Override // ji.j0
    public void M(int i10, int i11) {
        z zVar = (z) this.b;
        p3 p3Var = zVar.O;
        if (p3Var != null) {
            ji.a aVar = zVar.a;
            g2 g2Var = p3Var.a.J3;
            if (g2Var != null) {
                g2Var.f(i10, i11);
            }
        }
    }

    @Override // di.tc
    public void N(float f7, int i10) {
        ArrayList arrayList;
        d7 d7Var = (d7) this.b;
        o8 o8Var = d7Var.d;
        if (o8Var == null || (arrayList = o8Var.T) == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        ((o8) d7Var.d.T.get(i10)).V = f7;
    }

    @Override // di.tc
    public void O(float f7) {
        d7 d7Var = (d7) this.b;
        o8 o8Var = d7Var.d;
        if (o8Var == null) {
            return;
        }
        o8Var.F = f7;
        o8Var.j = true;
        d7Var.w(true);
    }

    @Override // ji.j0
    public void P() {
        z zVar = (z) this.b;
        p3 p3Var = zVar.O;
        if (p3Var != null) {
            ji.a aVar = zVar.a;
            v3 v3Var = p3Var.a;
            g2 g2Var = v3Var.J3;
            if (g2Var != null) {
                g2Var.g();
            }
            v3Var.h3.onContentChanged();
        }
    }

    @Override // hg.a2
    public boolean Q(int i10) {
        return i10 == ((rn0) this.b).d0;
    }

    @Override // di.tc
    public void R(float f7) {
        d7 d7Var = (d7) this.b;
        o8 o8Var = d7Var.d;
        if (o8Var == null) {
            return;
        }
        o8Var.E = f7;
        o8Var.j = true;
        d7Var.w(true);
    }

    @Override // di.tc
    public void S(float f7, int i10) {
        ArrayList arrayList;
        d7 d7Var = (d7) this.b;
        o8 o8Var = d7Var.d;
        if (o8Var == null || (arrayList = o8Var.T) == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        ((o8) d7Var.d.T.get(i10)).W = f7;
    }

    @Override // di.tc
    public void T(float f7) {
        o8 o8Var = ((d7) this.b).d;
        if (o8Var == null) {
            return;
        }
        o8Var.a0 = f7;
        o8Var.j = true;
    }

    @Override // r0.n
    public l1 T0(View view, l1 l1Var) {
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
                Method method = s3.a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect, rect2);
                    } catch (Exception e7) {
                        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e7);
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

    @Override // z3.m
    public int U() {
        return 2;
    }

    @Override // di.tc
    public void V() {
        ((d7) this.b).q(null);
    }

    @Override // hg.a2
    public void Y(ArrayList arrayList) {
        rn0 rn0Var = (rn0) this.b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            rn0Var.J.add(((z1) arrayList.get(i10)).a);
        }
        gy gyVar = rn0Var.U;
        if (gyVar != null) {
            gyVar.d(rn0Var.D0 > 0, false);
        }
        rn0Var.l();
    }

    @Override // di.tc
    public void Z(float f7) {
        d7 d7Var = (d7) this.b;
        o8 o8Var = d7Var.d;
        if (o8Var == null) {
            return;
        }
        o8Var.t0 = f7;
        o8Var.j = true;
        d7Var.y(true);
    }

    @Override // a9.t
    public Object a() {
        return this.b;
    }

    @Override // di.tc
    public void a0(int i10, long j3) {
        ArrayList arrayList;
        d7 d7Var = (d7) this.b;
        o8 o8Var = d7Var.d;
        if (o8Var == null || (arrayList = o8Var.T) == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        ((o8) d7Var.d.T.get(i10)).X = j3;
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        GetCredentialRequest getCredentialRequest = (GetCredentialRequest) this.b;
        h7.f fVar = new h7.f(1, (TaskCompletionSource) obj2);
        h7.d dVar = (h7.d) ((h7.e) obj).u();
        com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true));
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
        int i10 = q7.a.a;
        obtain.writeStrongBinder(fVar);
        q7.a.b(obtain, getCredentialRequest);
        q7.a.b(obtain, gVar);
        ((h7.b) dVar).G0(obtain, 1);
    }

    @Override // di.tc
    public void b(int i10) {
        e0 e0Var = ((d7) this.b).E;
        if (e0Var != null) {
            ArrayList arrayList = e0Var.h;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                d0 d0Var = (d0) obj;
                if (d0Var.a == i10) {
                    d0Var.b.d(1.0f, true);
                    e0Var.invalidate();
                    return;
                }
            }
        }
    }

    @Override // di.tc
    public void c(float f7) {
        d7 d7Var = (d7) this.b;
        o8 o8Var = d7Var.d;
        if (o8Var == null) {
            return;
        }
        o8Var.u0 = f7;
        o8Var.j = true;
        d7Var.c();
    }

    @Override // ji.j0
    public void c0() {
        z zVar = (z) this.b;
        p3 p3Var = zVar.O;
        if (p3Var != null) {
            ji.a aVar = zVar.a;
            v3.N1(p3Var.a);
        }
    }

    @Override // z3.d
    public int d(long j3) {
        return j3 < 0 ? 0 : -1;
    }

    @Override // di.tc
    public void d0(long j3) {
        d7 d7Var = (d7) this.b;
        o8 o8Var = d7Var.d;
        if (o8Var == null) {
            return;
        }
        o8Var.D = j3;
        o8Var.j = true;
        d7Var.w(true);
    }

    @Override // z3.d
    public long e(int i10) {
        e2.d.b(i10 == 0);
        return 0L;
    }

    @Override // z3.m
    public void e0(byte[] bArr, int i10, int i11, z3.l lVar, e2.h hVar) {
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
                    String str = e2.d0.a;
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

    @Override // hg.a2
    public void f(int i10) {
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
        }
    }

    @Override // androidx.lifecycle.a0
    public void f0(Object obj) {
        int i10 = this.a;
        Object obj2 = this.b;
        switch (i10) {
            case 3:
                androidx.biometric.p pVar = (androidx.biometric.p) obj2;
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
                        yVar2.u = new androidx.lifecycle.z();
                    }
                    y.h(yVar2.u, Boolean.FALSE);
                    return;
                }
                return;
            default:
                o oVar = (o) obj2;
                if (((t) obj) == null || !oVar.r0) {
                    return;
                }
                oVar.getClass();
                throw new IllegalStateException("Fragment " + oVar + " did not return a View from onCreateView() or this was called before onCreateView().");
        }
    }

    @Override // ji.j0
    public void g() {
        z zVar = (z) this.b;
        p3 p3Var = zVar.O;
        if (p3Var != null) {
            v3.O1(p3Var.a, zVar.a);
        }
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override // z3.d
    public List h(long j3) {
        return j3 >= 0 ? (List) this.b : Collections.EMPTY_LIST;
    }

    public void h0(j6.l lVar, u uVar) {
        Object obj = this.b;
        androidx.fragment.app.j0 j0Var = (androidx.fragment.app.j0) obj;
        if (j0Var == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
            return;
        }
        if (j0Var.P()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
            return;
        }
        androidx.fragment.app.j0 j0Var2 = (androidx.fragment.app.j0) obj;
        androidx.biometric.p pVar = (androidx.biometric.p) j0Var2.D("androidx.biometric.BiometricFragment");
        if (pVar == null) {
            pVar = new androidx.biometric.p();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(j0Var2);
            aVar.f(0, pVar, "androidx.biometric.BiometricFragment");
            aVar.e(true, true);
            j0Var2.A(true);
            j0Var2.E();
        }
        androidx.fragment.app.u k10 = pVar.k();
        if (k10 == null) {
            Log.e("BiometricFragment", "Not launching prompt. Client activity was null.");
            return;
        }
        y yVar = pVar.l0;
        yVar.f = lVar;
        int i10 = lVar.a;
        if (i10 == 0) {
            i10 = uVar != null ? 15 : 255;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 23 || i11 >= 30 || i10 != 15 || uVar != null) {
            yVar.g = uVar;
        } else {
            yVar.g = v7.o.a();
        }
        if (pVar.Q()) {
            pVar.l0.k = pVar.q(R.string.confirm_device_credential_password);
        } else {
            pVar.l0.k = null;
        }
        if (pVar.Q() && new aa.a(new androidx.biometric.s(k10, 0)).g(255) != 0) {
            pVar.l0.n = true;
            pVar.S();
        } else if (pVar.l0.p) {
            pVar.k0.postDelayed(new androidx.biometric.o(pVar), 600L);
        } else {
            pVar.X();
        }
    }

    @Override // fb.n
    public Object h2() {
        Type type = (Type) this.b;
        if (!(type instanceof ParameterizedType)) {
            throw new db.j("Invalid EnumMap type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return new EnumMap((Class) type2);
        }
        throw new db.j("Invalid EnumMap type: " + type.toString());
    }

    @Override // di.tc
    public void i(float f7) {
        d7 d7Var = (d7) this.b;
        o8 o8Var = d7Var.d;
        if (o8Var == null) {
            return;
        }
        o8Var.G = f7;
        o8Var.j = true;
        d7Var.c();
    }

    @Override // androidx.activity.result.b
    public void j(Object obj) {
        switch (this.a) {
            case 6:
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                androidx.fragment.app.i0 i0Var = (androidx.fragment.app.i0) this.b;
                androidx.fragment.app.e0 e0Var = (androidx.fragment.app.e0) i0Var.F.pollFirst();
                if (e0Var != null) {
                    String str = e0Var.a;
                    int i10 = e0Var.b;
                    r m10 = i0Var.c.m(str);
                    if (m10 != null) {
                        m10.x(i10, aVar.a, aVar.b);
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
                ResultReceiver resultReceiver = proxyBillingActivityV2.N;
                if (resultReceiver != null) {
                    resultReceiver.send(i11, intent == null ? null : intent.getExtras());
                }
                int i12 = aVar2.a;
                if (i12 != -1 || i11 != 0) {
                    com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i12 + " and billing's responseCode: " + i11);
                }
                proxyBillingActivityV2.finish();
                break;
        }
    }

    public JSONObject j0(aa.b bVar) {
        String str = (String) this.b;
        int i10 = bVar.c;
        t9.b bVar2 = t9.b.a;
        bVar2.c("Settings response code was: " + i10);
        if (i10 != 200 && i10 != 201 && i10 != 202 && i10 != 203) {
            String str2 = "Settings request failed; (status: " + i10 + ") from " + str;
            if (bVar2.a(6)) {
                Log.e("FirebaseCrashlytics", str2, null);
            }
            return null;
        }
        String str3 = bVar.b;
        try {
            return new JSONObject(str3);
        } catch (Exception e7) {
            bVar2.d("Failed to parse settings JSON from " + str, e7);
            bVar2.d("Settings response " + str3, null);
            return null;
        }
    }

    @Override // z3.d
    public int k() {
        return 1;
    }

    public db.i k0(Object obj) {
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

    @Override // f6.a
    public void l(Bitmap bitmap) {
        ((f6.i) this.b).e(bitmap, 3);
    }

    @Override // di.tc
    public void m(long j3, boolean z10) {
        d7 d7Var = (d7) this.b;
        if (!z10) {
            d7Var.m(j3);
            return;
        }
        g71 g71Var = d7Var.e;
        if (g71Var != null) {
            g71Var.L(j3, true);
            return;
        }
        if (d7Var.j()) {
            d7Var.E.m(j3, true);
            return;
        }
        g71 g71Var2 = d7Var.y;
        if (g71Var2 != null) {
            g71Var2.L(j3, false);
        }
    }

    @Override // di.tc
    public void n() {
        d7 d7Var = (d7) this.b;
        d7Var.s(null, null, true);
        pc pcVar = ((dc) d7Var).C0;
        dc dcVar = pcVar.X0;
        if (dcVar != null) {
            dcVar.s(null, null, true);
        }
        rb rbVar = pcVar.v1;
        if (rbVar != null) {
            rbVar.q0();
        }
        fc fcVar = pcVar.c1;
        if (fcVar != null) {
            fcVar.setHasRoundVideo(false);
        }
        o8 o8Var = pcVar.K1;
        if (o8Var != null) {
            File file = o8Var.o0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                pcVar.K1.o0 = null;
            }
            if (pcVar.K1.p0 != null) {
                try {
                    new File(pcVar.K1.p0).delete();
                } catch (Exception unused2) {
                }
                pcVar.K1.p0 = null;
            }
        }
    }

    public void n0() {
        e6.h hVar = (e6.h) this.b;
        Iterator it = hVar.h.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        Iterator it2 = hVar.i.iterator();
        while (it2.hasNext()) {
            ((e6.g) it2.next()).a();
        }
    }

    @Override // di.tc
    public void o(float f7) {
        d7 d7Var = (d7) this.b;
        o8 o8Var = d7Var.d;
        if (o8Var == null) {
            return;
        }
        o8Var.s0 = f7;
        o8Var.j = true;
        d7Var.y(true);
    }

    public void o0(int i10, String str) {
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        t0(i10, 2);
        try {
            int y02 = y0(str.length());
            if (y02 != y0(str.length() * 3)) {
                r0(m0(str));
                u0(str, byteBuffer);
                return;
            }
            int position = byteBuffer.position();
            if (byteBuffer.remaining() < y02) {
                throw new b5(position + y02, byteBuffer.limit());
            }
            byteBuffer.position(position + y02);
            u0(str, byteBuffer);
            int position2 = byteBuffer.position();
            byteBuffer.position(position);
            r0((position2 - position) - y02);
            byteBuffer.position(position2);
        } catch (BufferOverflowException e7) {
            b5 b5Var = new b5(byteBuffer.position(), byteBuffer.limit());
            b5Var.initCause(e7);
            throw b5Var;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        zd.m mVar = (zd.m) this.b;
        Exception exception = task.getException();
        if (exception != null) {
            mVar.resumeWith(t7.a(exception));
        } else if (task.isCanceled()) {
            mVar.n(null);
        } else {
            mVar.resumeWith(task.getResult());
        }
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
        WebMessageBoundaryInterface webMessageBoundaryInterface = (WebMessageBoundaryInterface) se.b.a(WebMessageBoundaryInterface.class, invocationHandler);
        InvocationHandler[] ports = webMessageBoundaryInterface.getPorts();
        a6.m[] mVarArr = new a6.m[ports.length];
        for (int i10 = 0; i10 < ports.length; i10++) {
            InvocationHandler invocationHandler3 = ports[i10];
            a6.m mVar = new a6.m(5, false);
            mVar.b = (WebMessagePortBoundaryInterface) se.b.a(WebMessagePortBoundaryInterface.class, invocationHandler3);
            mVarArr[i10] = mVar;
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

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        f2 f2Var;
        f1 b10;
        d6.a aVar = (d6.a) this.b;
        Bundle bundle = (Bundle) obj;
        if (r0.j) {
            Context context = aVar.a;
            g6.r rVar = aVar.f;
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
            String t10 = p6.t(packageName, ".client_cast_analytics_data");
            r0Var.h = bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE") == 0 ? 1 : 2;
            l5.s.b(context);
            r0Var.g = l5.s.a().c(j5.a.e).a("CAST_SENDER_SDK", new i5.c("proto"), b0.a);
            if (bundle.containsKey("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE")) {
                r0Var.e = Long.valueOf(bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE"));
            }
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(t10, 0);
            if (i10 != 0) {
                com.google.android.gms.common.api.internal.v e7 = w.e();
                e7.c = new a6.m(rVar, new String[]{"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"});
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

    @Override // z3.m
    public /* synthetic */ z3.d p(int i10, int i11, byte[] bArr) {
        return w.f.a(this, bArr, i11);
    }

    public void p0(int i10, byte[] bArr) {
        t0(i10, 2);
        r0(bArr.length);
        int length = bArr.length;
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        if (byteBuffer.remaining() < length) {
            throw new b5(byteBuffer.position(), byteBuffer.limit());
        }
        byteBuffer.put(bArr, 0, length);
    }

    @Override // org.telegram.ui.Components.ti
    public /* synthetic */ boolean q() {
        return false;
    }

    public void q0(int i10) {
        byte b10 = (byte) i10;
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        if (!byteBuffer.hasRemaining()) {
            throw new b5(byteBuffer.position(), byteBuffer.limit());
        }
        byteBuffer.put(b10);
    }

    @Override // di.tc
    public void r(boolean z10) {
        d7 d7Var = (d7) this.b;
        if (d7Var.j()) {
            d7Var.E.getClass();
        }
        d7Var.x(-4, z10);
    }

    public void r0(int i10) {
        while ((i10 & (-128)) != 0) {
            q0((i10 & 127) | 128);
            i10 >>>= 7;
        }
        q0(i10);
    }

    @Override // mg.p
    public void s() {
        ((di.j0) this.b).d.invalidate();
    }

    @Override // di.tc
    public void t(float f7, int i10) {
        ArrayList arrayList;
        d7 d7Var = (d7) this.b;
        o8 o8Var = d7Var.d;
        if (o8Var == null || (arrayList = o8Var.T) == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        ((o8) d7Var.d.T.get(i10)).P = f7;
    }

    public void t0(int i10, int i11) {
        r0((i10 << 3) | i11);
    }

    @Override // ji.j0
    public q9 u() {
        p3 p3Var = ((z) this.b).O;
        if (p3Var != null) {
            return p3Var.a.getTextSelectionHelper();
        }
        return null;
    }

    public void v(c3.j jVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
        long[] jArr = jVar.e;
        if (jArr.length <= 0 || linkedHashMap.containsKey(Long.valueOf(jArr[0]))) {
            return;
        }
        linkedHashMap.put(Long.valueOf(jVar.e[0]), jVar);
    }

    public void v0(long j3) {
        while (((-128) & j3) != 0) {
            q0((((int) j3) & 127) | 128);
            j3 >>>= 7;
        }
        q0((int) j3);
    }

    @Override // hg.a2
    public /* synthetic */ a0.i w() {
        return null;
    }

    @Override // di.tc
    public void y(float f7) {
        d7 d7Var = (d7) this.b;
        o8 o8Var = d7Var.d;
        if (o8Var == null) {
            return;
        }
        o8Var.P = f7;
        d7Var.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // ce.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object z(ce.c cVar, kd.c cVar2) {
        ce.a aVar;
        int i10;
        Throwable th2;
        de.g gVar;
        if (cVar2 instanceof ce.a) {
            aVar = (ce.a) cVar2;
            int i11 = aVar.d;
            if ((i11 & TLObject.FLAG_31) != 0) {
                aVar.d = i11 - TLObject.FLAG_31;
                Object obj = aVar.b;
                jd.a aVar2 = jd.a.a;
                i10 = aVar.d;
                gd.i iVar = gd.i.a;
                if (i10 != 0) {
                    t7.b(obj);
                    de.g gVar2 = new de.g(cVar, aVar.getContext());
                    try {
                        aVar.a = gVar2;
                        aVar.d = 1;
                        Object invoke = ((k1.m) this.b).invoke(gVar2, aVar);
                        if (invoke != aVar2) {
                            invoke = iVar;
                        }
                        if (invoke == aVar2) {
                            return aVar2;
                        }
                        gVar = gVar2;
                    } catch (Throwable th3) {
                        th2 = th3;
                        gVar = gVar2;
                        gVar.releaseIntercepted();
                        throw th2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gVar = aVar.a;
                    try {
                        t7.b(obj);
                    } catch (Throwable th4) {
                        th2 = th4;
                        gVar.releaseIntercepted();
                        throw th2;
                    }
                }
                gVar.releaseIntercepted();
                return iVar;
            }
        }
        aVar = new ce.a(this, cVar2);
        Object obj2 = aVar.b;
        jd.a aVar22 = jd.a.a;
        i10 = aVar.d;
        gd.i iVar2 = gd.i.a;
        if (i10 != 0) {
        }
        gVar.releaseIntercepted();
        return iVar2;
    }

    public m(byte[] bArr, int i10) {
        this.a = 12;
        ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, i10);
        this.b = wrap;
        wrap.order(ByteOrder.LITTLE_ENDIAN);
    }

    @Override // ji.j0
    public void a(h1 h1Var) {
        p3 p3Var = ((z) this.b).O;
        if (p3Var != null) {
            v3 v3Var = p3Var.a;
            v3.L1(v3Var, h1Var);
            v3Var.h3.v(h1Var, true);
        }
    }

    public m(int i10) {
        this.a = i10;
        switch (i10) {
            case 25:
                this.b = new v();
                break;
            default:
                this.b = new LinkedHashMap();
                break;
        }
    }

    public m(String str, ob.a aVar) {
        this.a = 14;
        if (str != null) {
            this.b = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }

    public m(LaunchActivity launchActivity, Executor executor, v7.n nVar) {
        this.a = 4;
        if (launchActivity == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        }
        if (executor != null) {
            androidx.fragment.app.j0 s10 = launchActivity.s();
            y yVar = (y) new aa.a(launchActivity).n(y.class);
            this.b = s10;
            yVar.d = executor;
            yVar.e = nVar;
            return;
        }
        throw new IllegalArgumentException("Executor must not be null.");
    }

    @Override // org.telegram.ui.Components.ti
    public /* synthetic */ void H() {
    }

    @Override // mg.p
    public void b0() {
    }

    @Override // z3.m
    public /* synthetic */ void reset() {
    }

    @Override // org.telegram.ui.Components.ti
    public /* synthetic */ void x() {
    }

    @Override // mg.p
    public void E(boolean z10) {
    }

    @Override // org.telegram.ui.Components.ti
    public /* synthetic */ void K(Object obj) {
    }

    @Override // mg.p
    public void W(boolean z10) {
    }

    @Override // org.telegram.ui.Components.ti
    public /* synthetic */ void X(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.ti
    public /* synthetic */ void E0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }

    @Override // org.telegram.ui.Components.ti
    public void l0(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
    }
}
