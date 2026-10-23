package a4;

import ah.t;
import ai.t7;
import ai.u2;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.biometric.q;
import androidx.fragment.app.f0;
import androidx.lifecycle.a0;
import androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer;
import c6.d0;
import c6.e0;
import c7.v;
import ci.r4;
import ci.v9;
import ci.w9;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.internal.cast.d1;
import com.google.android.gms.internal.cast.p0;
import com.google.android.gms.internal.cast.z4;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import e9.l1;
import ei.m0;
import ei.o6;
import ei.r6;
import g6.w;
import gb.s;
import hg.y1;
import hg.z1;
import java.lang.reflect.Method;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import k2.u;
import k2.u0;
import k2.y;
import ki.c6;
import ki.d2;
import ki.h1;
import ki.h2;
import ki.j0;
import ki.j3;
import ki.j4;
import ki.p3;
import ki.q3;
import ki.t3;
import ki.u3;
import ki.u4;
import ki.w3;
import ki.z;
import m.s3;
import m.v3;
import mg.o;
import n7.m1;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Components.g81;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.j81;
import org.telegram.ui.Components.so0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.px;
import org.telegram.ui.sz0;
import org.telegram.ui.yy0;
import r0.b0;
import r0.i0;
import r0.k1;
import r0.n;
import si.o0;
import v7.u6;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class l implements z3.d, a0, androidx.activity.result.b, r, v9, OnSuccessListener, l1, o, g81, n, gb.n, z1, y, j0, u3 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ l(com.google.android.gms.common.api.j jVar, o6.a aVar, int i10) {
        this.a = i10;
        this.b = aVar;
    }

    public static int d0(CharSequence charSequence) {
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

    public static int i0(int i10, String str) {
        int n02 = n0(i10);
        int d02 = d0(str);
        return o0(d02) + d02 + n02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v20 */
    public static void k0(CharSequence charSequence, ByteBuffer byteBuffer) {
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

    public static int m0(long j10) {
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

    public static int n0(int i10) {
        return o0(i10 << 3);
    }

    public static int o0(int i10) {
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

    @Override // ki.j0
    public void A(CharSequence charSequence) {
        switch (this.a) {
            case 25:
                q3 q3Var = ((z) this.b).O;
                if (q3Var != null) {
                    q3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        q3Var.a.z4(charSequence.toString());
                        break;
                    }
                }
                break;
            default:
                p3 p3Var = ((u4) this.b).N;
                if (p3Var != null) {
                    p3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        p3Var.a.z4(charSequence.toString());
                        break;
                    }
                }
                break;
        }
    }

    @Override // k2.y
    public void B() {
        x2.n nVar;
        FfmpegAudioRenderer ffmpegAudioRenderer = (FfmpegAudioRenderer) this.b;
        synchronized (ffmpegAudioRenderer.a) {
            nVar = ffmpegAudioRenderer.H;
        }
        if (nVar != null) {
            nVar.m();
        }
    }

    @Override // r0.n
    public k1 B0(View view, k1 k1Var) {
        boolean z10;
        boolean z11;
        int d = k1Var.d();
        g.r rVar = (g.r) this.b;
        Context context = rVar.e;
        int d10 = k1Var.d();
        ActionBarContextView actionBarContextView = rVar.y;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z10 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) rVar.y.getLayoutParams();
            if (rVar.y.isShown()) {
                if (rVar.l0 == null) {
                    rVar.l0 = new Rect();
                    rVar.m0 = new Rect();
                }
                Rect rect = rVar.l0;
                Rect rect2 = rVar.m0;
                rect.set(k1Var.b(), k1Var.d(), k1Var.c(), k1Var.a());
                ViewGroup viewGroup = rVar.J;
                Method method = v3.a;
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
                ViewGroup viewGroup2 = rVar.J;
                WeakHashMap weakHashMap = i0.a;
                k1 a2 = b0.a(viewGroup2);
                int b10 = a2 == null ? 0 : a2.b();
                int c10 = a2 == null ? 0 : a2.c();
                if (marginLayoutParams.topMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i10;
                    marginLayoutParams.leftMargin = i11;
                    marginLayoutParams.rightMargin = i12;
                    z11 = true;
                }
                if (i10 <= 0 || rVar.L != null) {
                    View view2 = rVar.L;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i13 = marginLayoutParams2.height;
                        int i14 = marginLayoutParams.topMargin;
                        if (i13 != i14 || marginLayoutParams2.leftMargin != b10 || marginLayoutParams2.rightMargin != c10) {
                            marginLayoutParams2.height = i14;
                            marginLayoutParams2.leftMargin = b10;
                            marginLayoutParams2.rightMargin = c10;
                            rVar.L.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    rVar.L = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b10;
                    layoutParams.rightMargin = c10;
                    rVar.J.addView(rVar.L, -1, layoutParams);
                }
                View view4 = rVar.L;
                r9 = view4 != null;
                if (r9 && view4.getVisibility() != 0) {
                    View view5 = rVar.L;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? context.getColor(R.color.abc_decor_view_status_guard_light) : context.getColor(R.color.abc_decor_view_status_guard));
                }
                if (!rVar.Q && r9) {
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
                rVar.y.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = rVar.L;
        if (view6 != null) {
            view6.setVisibility(z10 ? 0 : 8);
        }
        return i0.g(view, d != d10 ? k1Var.f(k1Var.b(), d10, k1Var.c(), k1Var.a()) : k1Var);
    }

    @Override // ki.u3
    public void C(c6 c6Var, String str) {
        d2 d2Var = (d2) this.b;
        if (d2Var.z0 == null) {
            d2Var.z0 = new s3(new j5.b(this, 4), d2Var.getResourceProvider());
        }
        d2Var.z0.f(c6Var, str);
    }

    @Override // ki.j0
    public n9 D() {
        switch (this.a) {
            case 25:
                return (z) this.b;
            default:
                return (u4) this.b;
        }
    }

    @Override // ki.j0
    public ki.a F() {
        switch (this.a) {
            case 25:
                return ((z) this.b).a;
            default:
                return ((u4) this.b).a;
        }
    }

    @Override // hg.z1
    public /* synthetic */ a0.h G() {
        return null;
    }

    @Override // ki.j0
    public boolean H() {
        switch (this.a) {
            case 25:
                z zVar = (z) this.b;
                q3 q3Var = zVar.O;
                if (q3Var != null) {
                    ki.a aVar = zVar.a;
                    if (q3Var.a.Y4()) {
                    }
                }
                break;
            default:
                u4 u4Var = (u4) this.b;
                p3 p3Var = u4Var.N;
                if (p3Var != null) {
                    ki.a aVar2 = u4Var.a;
                    if (p3Var.a.Y4()) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // k2.y
    public void I(Exception exc) {
        e2.a.d("DecoderAudioRenderer", "Audio sink error", exc);
        qf.b bVar = ((FfmpegAudioRenderer) this.b).I;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new k2.r(bVar, exc, 1));
        }
    }

    @Override // ki.u3
    public void J() {
        d2 d2Var = (d2) this.b;
        d2.Z(d2Var, false, true);
        int i10 = d2Var.I0;
        d2Var.x0(i10 != 2 ? i10 : 0, true);
    }

    @Override // ki.j0
    public void K(int i10, int i11) {
        switch (this.a) {
            case 25:
                z zVar = (z) this.b;
                q3 q3Var = zVar.O;
                if (q3Var != null) {
                    ki.a aVar = zVar.a;
                    h2 h2Var = q3Var.a.K3;
                    if (h2Var != null) {
                        h2Var.f(i10, i11);
                        break;
                    }
                }
                break;
            default:
                u4 u4Var = (u4) this.b;
                p3 p3Var = u4Var.N;
                if (p3Var != null) {
                    ki.a aVar2 = u4Var.a;
                    h2 h2Var2 = p3Var.a.K3;
                    if (h2Var2 != null) {
                        h2Var2.f(i10, i11);
                        break;
                    }
                }
                break;
        }
    }

    @Override // k2.y
    public void L() {
        ((FfmpegAudioRenderer) this.b).Z = true;
    }

    @Override // ki.u3
    public j80 M(View view) {
        return j80.H((d2) this.b, view);
    }

    @Override // ki.j0
    public void N() {
        switch (this.a) {
            case 25:
                z zVar = (z) this.b;
                q3 q3Var = zVar.O;
                if (q3Var != null) {
                    ki.a aVar = zVar.a;
                    w3 w3Var = q3Var.a;
                    h2 h2Var = w3Var.K3;
                    if (h2Var != null) {
                        h2Var.g();
                    }
                    w3Var.i3.onContentChanged();
                    break;
                }
                break;
            default:
                u4 u4Var = (u4) this.b;
                p3 p3Var = u4Var.N;
                if (p3Var != null) {
                    ki.a aVar2 = u4Var.a;
                    w3 w3Var2 = p3Var.a;
                    h2 h2Var2 = w3Var2.K3;
                    if (h2Var2 != null) {
                        h2Var2.g();
                    }
                    w3Var2.i3.onContentChanged();
                    break;
                }
                break;
        }
    }

    @Override // hg.z1
    public boolean O(int i10) {
        return i10 == ((so0) this.b).d0;
    }

    @Override // ki.u3
    public void P() {
        d2 d2Var = (d2) this.b;
        d2Var.z0();
        d2Var.C0();
    }

    @Override // k2.y
    public void Q(u0 u0Var) {
        qf.b bVar = ((FfmpegAudioRenderer) this.b).I;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new u(bVar, u0Var, 1));
        }
    }

    @Override // ci.v9
    public boolean Q0(long j10, int i10, int i11, int i12, w9 w9Var) {
        ImageReceiver imageReceiver;
        r4 r4Var;
        r4 r4Var2;
        w9Var.b = null;
        w9Var.c = null;
        yy0 yy0Var = (yy0) this.b;
        sz0 sz0Var = yy0Var.h;
        ArrayList arrayList = yy0Var.w;
        if (yy0Var.N < 0.2f) {
            w9Var.b = sz0Var.getImageReceiver();
            w9Var.c = null;
            w9Var.a = sz0Var;
            w9Var.h = 0.0f;
            w9Var.i = AndroidUtilities.displaySize.y;
            w9Var.g = (View) yy0Var.getParent();
            w9Var.d = yy0Var.y;
            w9Var.n = true;
            return true;
        }
        int i13 = 0;
        while (true) {
            if (i13 >= arrayList.size()) {
                imageReceiver = null;
                r4Var = null;
                r4Var2 = null;
                break;
            }
            r4 r4Var3 = (r4) arrayList.get(i13);
            if (r4Var3.e < 1.0f || r4Var3.a != i11) {
                i13++;
            } else {
                int i14 = i13 - 1;
                int i15 = i13 - 2;
                r4 d = ProfileStoriesView.d(i14 >= 0 ? (r4) arrayList.get(i14) : null, i15 >= 0 ? (r4) arrayList.get(i15) : null, r4Var3);
                imageReceiver = r4Var3.b;
                r4Var2 = d;
                r4Var = r4Var3;
            }
        }
        if (imageReceiver == null) {
            return false;
        }
        w9Var.c = imageReceiver;
        w9Var.b = null;
        w9Var.a = yy0Var;
        w9Var.h = 0.0f;
        w9Var.i = AndroidUtilities.displaySize.y;
        w9Var.g = (View) yy0Var.getParent();
        if (r4Var == null || r4Var2 == null) {
            w9Var.f = null;
            return true;
        }
        w9Var.f = new t7(this, new RectF(r4Var.m), r4Var, new RectF(r4Var2.m), r4Var2);
        return true;
    }

    @Override // hg.z1
    public void S(ArrayList arrayList) {
        so0 so0Var = (so0) this.b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            so0Var.J.add(((y1) arrayList.get(i10)).a);
        }
        px pxVar = so0Var.U;
        if (pxVar != null) {
            pxVar.d(so0Var.D0 > 0, false);
        }
        so0Var.l();
    }

    @Override // k2.y
    public void T(u0 u0Var) {
        qf.b bVar = ((FfmpegAudioRenderer) this.b).I;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new u(bVar, u0Var, 0));
        }
    }

    @Override // ki.u3
    public void V(ki.v3 v3Var, View view) {
        d2 d2Var = (d2) this.b;
        j80 H = j80.H(d2Var, view);
        H.Q = true;
        d2Var.getParentActivity();
        d2Var.getResourceProvider();
        d2Var.x0 = j4.b(H, d2Var, v3Var, false);
    }

    @Override // ki.j0
    public void X() {
        switch (this.a) {
            case 25:
                z zVar = (z) this.b;
                q3 q3Var = zVar.O;
                if (q3Var != null) {
                    ki.a aVar = zVar.a;
                    w3.U1(q3Var.a);
                    break;
                }
                break;
            default:
                u4 u4Var = (u4) this.b;
                p3 p3Var = u4Var.N;
                if (p3Var != null) {
                    ki.a aVar2 = u4Var.a;
                    w3.U1(p3Var.a);
                    break;
                }
                break;
        }
    }

    @Override // ci.v9
    public void X0(long j10, int i10, ci.s3 s3Var) {
        yy0 yy0Var = (yy0) this.b;
        int i11 = ProfileStoriesView.s0;
        yy0Var.f(true, false);
        s3Var.run();
    }

    public ea.a Y(JSONObject jSONObject) {
        ea.c dVar;
        int i10 = jSONObject.getInt("settings_version");
        if (i10 != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i10 + ". Using default settings values.", null);
            dVar = new t7.u(7);
        } else {
            dVar = new oa.d(8);
        }
        return dVar.s0((t7.u) this.b, jSONObject);
    }

    @Override // androidx.lifecycle.a0
    public void Z(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        q qVar = (q) this.b;
        if (charSequence != null) {
            if (qVar.R()) {
                qVar.W(charSequence);
            }
            qVar.l0.d(null);
        }
    }

    @Override // k2.y
    public void a(long j10) {
        FfmpegAudioRenderer ffmpegAudioRenderer = (FfmpegAudioRenderer) this.b;
        ffmpegAudioRenderer.g0 = true;
        qf.b bVar = ffmpegAudioRenderer.I;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new ai.v3(bVar, j10, 13));
        }
    }

    public void a0(String str, Bitmap bitmap) {
        a0.f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey(str) && ((Integer) fVar.get(str)).intValue() != 2) {
            throw new IllegalArgumentException(a1.g.p("The ", str, " key cannot be used to put a Bitmap"));
        }
        ((Bundle) this.b).putParcelable(str, bitmap);
    }

    @Override // com.google.android.gms.common.api.internal.r
    public void accept(Object obj, Object obj2) {
        int i10 = this.a;
        Object obj3 = this.b;
        switch (i10) {
            case 6:
                b7.b bVar = new b7.b(0, (TaskCompletionSource) obj2);
                m1 m1Var = (m1) ((n7.l1) obj).u();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(m1Var.b);
                int i11 = n7.j.a;
                obtain.writeStrongBinder(bVar);
                obtain.writeInt(1);
                ((v) obj3).writeToParcel(obtain, 0);
                Parcel obtain2 = Parcel.obtain();
                try {
                    m1Var.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                } finally {
                    obtain.recycle();
                    obtain2.recycle();
                }
            case 8:
                w wVar = (w) obj;
                g6.f fVar = (g6.f) wVar.u();
                d0 d0Var = ((e0) obj3).k;
                Parcel N0 = fVar.N0();
                com.google.android.gms.internal.cast.v.d(N0, d0Var);
                fVar.S0(N0, 18);
                g6.f fVar2 = (g6.f) wVar.u();
                fVar2.S0(fVar2.N0(), 17);
                ((TaskCompletionSource) obj2).setResult(null);
                return;
            case 21:
                h7.f fVar3 = new h7.f(0, (TaskCompletionSource) obj2);
                h7.d dVar = (h7.d) ((h7.e) obj).u();
                com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true));
                Parcel obtain3 = Parcel.obtain();
                obtain3.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i12 = q7.a.a;
                obtain3.writeStrongBinder(fVar3);
                q7.a.b(obtain3, (g7.f) obj3);
                q7.a.b(obtain3, gVar);
                ((h7.b) dVar).F0(obtain3, 6);
                return;
            default:
                a6.l lVar = new a6.l((TaskCompletionSource) obj2);
                i7.i iVar = (i7.i) ((i7.c) obj).u();
                Parcel J0 = iVar.J0();
                int i13 = i7.f.a;
                J0.writeStrongBinder(lVar);
                i7.f.c(J0, (x5.e) obj3);
                iVar.K0(J0, 1);
                return;
        }
    }

    public void b0(long j10) {
        a0.f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey("android.media.metadata.DURATION") && ((Integer) fVar.get("android.media.metadata.DURATION")).intValue() != 0) {
            throw new IllegalArgumentException("The android.media.metadata.DURATION key cannot be used to put a long");
        }
        ((Bundle) this.b).putLong("android.media.metadata.DURATION", j10);
    }

    @Override // ki.j0
    public void c(h1 h1Var) {
        switch (this.a) {
            case 25:
                q3 q3Var = ((z) this.b).O;
                if (q3Var != null) {
                    w3 w3Var = q3Var.a;
                    w3.S1(w3Var, h1Var);
                    w3Var.i3.o(h1Var, true);
                    break;
                }
                break;
            default:
                p3 p3Var = ((u4) this.b).N;
                if (p3Var != null) {
                    w3 w3Var2 = p3Var.a;
                    w3.S1(w3Var2, h1Var);
                    w3Var2.i3.o(h1Var, true);
                    break;
                }
                break;
        }
    }

    public void c0(String str, String str2) {
        a0.f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey(str) && ((Integer) fVar.get(str)).intValue() != 1) {
            throw new IllegalArgumentException(a1.g.p("The ", str, " key cannot be used to put a String"));
        }
        ((Bundle) this.b).putCharSequence(str, str2);
    }

    @Override // z3.d
    public int d(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    @Override // ki.u3
    public boolean e(float f7) {
        boolean z10;
        d2 d2Var = (d2) this.b;
        FrameLayout frameLayout = d2Var.v0;
        if (frameLayout != null) {
            frameLayout.getLocationOnScreen(new int[2]);
            if (f7 >= r3[1]) {
                z10 = true;
                d2.Z(d2Var, z10, true);
                return z10;
            }
        }
        z10 = false;
        d2.Z(d2Var, z10, true);
        return z10;
    }

    public void e0(int i10, String str) {
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        j0(i10, 2);
        try {
            int o02 = o0(str.length());
            if (o02 != o0(str.length() * 3)) {
                h0(d0(str));
                k0(str, byteBuffer);
                return;
            }
            int position = byteBuffer.position();
            if (byteBuffer.remaining() < o02) {
                throw new z4(position + o02, byteBuffer.limit());
            }
            byteBuffer.position(position + o02);
            k0(str, byteBuffer);
            int position2 = byteBuffer.position();
            byteBuffer.position(position);
            h0((position2 - position) - o02);
            byteBuffer.position(position2);
        } catch (BufferOverflowException e) {
            z4 z4Var = new z4(byteBuffer.position(), byteBuffer.limit());
            z4Var.initCause(e);
            throw z4Var;
        }
    }

    @Override // hg.z1
    public void f(int i10) {
        so0 so0Var = (so0) this.b;
        so0Var.D0--;
        so0Var.e0 = i10;
        if (so0Var.f0 != i10) {
            so0Var.s.clear();
        }
        if (so0Var.g0 != i10) {
            so0Var.I.clear();
        }
        so0Var.N = true;
        px pxVar = so0Var.U;
        if (pxVar != null) {
            pxVar.d(so0Var.D0 > 0, true);
        }
        so0Var.l();
        px pxVar2 = so0Var.U;
        if (pxVar2 != null) {
            pxVar2.c();
        }
    }

    public void f0(int i10, byte[] bArr) {
        j0(i10, 2);
        h0(bArr.length);
        int length = bArr.length;
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        if (byteBuffer.remaining() < length) {
            throw new z4(byteBuffer.position(), byteBuffer.limit());
        }
        byteBuffer.put(bArr, 0, length);
    }

    @Override // gb.n
    public Object f2() {
        Class cls = (Class) this.b;
        try {
            return s.a.a(cls);
        } catch (Exception e) {
            throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e);
        }
    }

    @Override // ki.j0
    public void g() {
        switch (this.a) {
            case 25:
                z zVar = (z) this.b;
                q3 q3Var = zVar.O;
                if (q3Var != null) {
                    w3.V1(q3Var.a, zVar.a);
                    break;
                }
                break;
            default:
                u4 u4Var = (u4) this.b;
                p3 p3Var = u4Var.N;
                if (p3Var != null) {
                    w3.V1(p3Var.a, u4Var.a);
                    break;
                }
                break;
        }
    }

    public void g0(int i10) {
        byte b10 = (byte) i10;
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        if (!byteBuffer.hasRemaining()) {
            throw new z4(byteBuffer.position(), byteBuffer.limit());
        }
        byteBuffer.put(b10);
    }

    @Override // androidx.activity.result.b
    public void h(Object obj) {
        switch (this.a) {
            case 4:
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                androidx.fragment.app.j0 j0Var = (androidx.fragment.app.j0) this.b;
                f0 f0Var = (f0) j0Var.F.pollLast();
                if (f0Var != null) {
                    String str = f0Var.a;
                    int i10 = f0Var.b;
                    androidx.fragment.app.s f7 = j0Var.c.f(str);
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

    public void h0(int i10) {
        while ((i10 & (-128)) != 0) {
            g0((i10 & 127) | 128);
            i10 >>>= 7;
        }
        g0(i10);
    }

    @Override // ki.u3
    public void i(ki.a aVar) {
        d2 d2Var = (d2) this.b;
        if (aVar != null && (aVar.b instanceof TL_iv.pageBlockMap) && AndroidUtilities.isMapsInstalled(d2Var)) {
            ti tiVar = new ti(d2Var.getParentActivity(), d2Var, false, false, false, d2Var.getResourceProvider());
            tiVar.c2 = new oa.d(12);
            tiVar.P = true;
            tiVar.A1.setVisibility(8);
            tiVar.z2 = new u2(d2Var, aVar, tiVar, 12);
            tiVar.w1();
            tiVar.show();
        }
    }

    @Override // k2.y
    public void j() {
        ((FfmpegAudioRenderer) this.b).f0 = true;
    }

    public void j0(int i10, int i11) {
        h0((i10 << 3) | i11);
    }

    @Override // z3.d
    public long k(int i10) {
        u6.g(i10 == 0);
        return 0L;
    }

    public void l0(long j10) {
        while (((-128) & j10) != 0) {
            g0((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        g0((int) j10);
    }

    @Override // ki.u3
    public void m(int i10) {
        ((d2) this.b).o0(74, i10);
    }

    @Override // ki.u3
    public void n(t3 t3Var, View view) {
        d2 d2Var = (d2) this.b;
        j80 H = j80.H(d2Var, view);
        H.Q = true;
        d2Var.x0 = j4.c(H, d2Var, d2Var.getParentActivity(), d2Var.getResourceProvider(), t3Var, false);
    }

    @Override // k2.y
    public void onAudioSessionIdChanged(int i10) {
        qf.b bVar = ((FfmpegAudioRenderer) this.b).I;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new ah.g(bVar, i10, 14));
        }
    }

    @Override // ki.u3
    public void onContentChanged() {
        d2 d2Var = (d2) this.b;
        if (d2Var.y0 != null) {
            boolean s32 = d2Var.P.s3();
            d2Var.L0 = s32;
            d2Var.y0.h(s32);
            d2Var.y0.invalidate();
        }
        d2Var.C0();
        Runnable runnable = d2Var.M0;
        AndroidUtilities.cancelRunOnUIThread(runnable);
        AndroidUtilities.runOnUIThread(runnable, 1000L);
    }

    @Override // org.telegram.ui.Components.g81
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // k2.y
    public void onSkipSilenceEnabledChanged(boolean z10) {
        qf.b bVar = ((FfmpegAudioRenderer) this.b).I;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new t(12, bVar, z10));
        }
    }

    @Override // org.telegram.ui.Components.g81
    public void onStateChanged(boolean z10, int i10) {
        r6 r6Var = (r6) this.b;
        o6 o6Var = r6Var.M;
        j81 j81Var = r6Var.x;
        if (j81Var == null) {
            return;
        }
        if (j81Var.y()) {
            AndroidUtilities.runOnUIThread(o6Var);
        } else {
            AndroidUtilities.cancelRunOnUIThread(o6Var);
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        com.google.android.gms.internal.cast.d2 d2Var;
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
            String u10 = o0.u(packageName, ".client_cast_analytics_data");
            p0Var.h = bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE") == 0 ? 1 : 2;
            l5.t.b(context);
            p0Var.g = l5.t.a().c(j5.a.e).a("CAST_SENDER_SDK", new i5.c("proto"), com.google.android.gms.internal.cast.z.a);
            if (bundle.containsKey("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE")) {
                p0Var.e = Long.valueOf(bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE"));
            }
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(u10, 0);
            if (i10 != 0) {
                com.google.android.gms.common.api.internal.u b11 = com.google.android.gms.common.api.internal.v.b();
                b11.c = new qb.c(rVar, new String[]{"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"});
                b11.d = new k6.c[]{c6.y.c};
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
                g6.b bVar = com.google.android.gms.internal.cast.d2.i;
                synchronized (com.google.android.gms.internal.cast.d2.class) {
                    try {
                        if (com.google.android.gms.internal.cast.d2.k == null) {
                            com.google.android.gms.internal.cast.d2.k = new com.google.android.gms.internal.cast.d2(sharedPreferences, p0Var, packageName);
                        }
                        d2Var = com.google.android.gms.internal.cast.d2.k;
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
                String str2 = com.google.android.gms.internal.cast.d2.j;
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
                                d1 b12 = com.google.android.gms.internal.cast.d2.b(str3.substring(41));
                                if (b12 != null) {
                                    hashSet2.add(b12);
                                    hashSet.add(b12);
                                }
                            } else if (str3.startsWith("feature_usage_timestamp_detected_feature_") && (b10 = com.google.android.gms.internal.cast.d2.b(str3.substring(41))) != null) {
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
                com.google.android.gms.internal.cast.d2.a(d1.h);
            }
        }
    }

    @Override // org.telegram.ui.Components.g81
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.g81
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        rg.d2 d2Var = ((r6) this.b).w;
        if (d2Var != null) {
            float f10 = i10 / i11;
            if (Math.abs(d2Var.y0 - f10) >= 1.0E-4f) {
                d2Var.y0 = f10;
                d2Var.requestLayout();
            }
        }
    }

    @Override // ki.u3
    public void p() {
        d2 d2Var = (d2) this.b;
        j3 j3Var = d2Var.P.o3;
        d2Var.x0((j3Var != null && j3Var.x() && d2Var.P.I4()) ? 1 : 0, true);
        d2Var.y0();
        d2Var.w0();
    }

    @Override // e9.l1
    public Object q(Object obj, Object obj2) {
        return ((d9.k) this.b).apply(obj2);
    }

    @Override // z3.d
    public List r(long j10) {
        return j10 >= 0 ? (List) this.b : Collections.EMPTY_LIST;
    }

    @Override // ki.u3
    public void s() {
        d2 d2Var = (d2) this.b;
        d2Var.I0 = d2Var.K0;
        d2.Z(d2Var, false, false);
        d2Var.x0(2, true);
    }

    @Override // k2.y
    public void t(int i10, long j10, long j11) {
        qf.b bVar = ((FfmpegAudioRenderer) this.b).I;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new k2.t(bVar, i10, j10, j11, 0));
        }
    }

    @Override // mg.o
    public void u() {
        ((m0) this.b).e.invalidate();
    }

    @Override // z3.d
    public int v() {
        return 1;
    }

    @Override // ki.j0
    public o9 w() {
        switch (this.a) {
            case 25:
                q3 q3Var = ((z) this.b).O;
                if (q3Var != null) {
                    return q3Var.a.getTextSelectionHelper();
                }
                return null;
            default:
                p3 p3Var = ((u4) this.b).N;
                if (p3Var != null) {
                    return p3Var.a.getTextSelectionHelper();
                }
                return null;
        }
    }

    @Override // hg.z1
    public /* synthetic */ a0.h x() {
        return null;
    }

    public /* synthetic */ l(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.g81
    public void onRenderedFirstFrame() {
    }

    public l(byte[] bArr, int i10) {
        this.a = 11;
        ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, i10);
        this.b = wrap;
        wrap.order(ByteOrder.LITTLE_ENDIAN);
    }

    public l(int i10) {
        this.a = i10;
        switch (i10) {
            case 2:
                this.b = new Bundle();
                break;
            case 13:
                this.b = new ArrayList();
                new ArrayList();
                new ArrayList();
                break;
            default:
                this.b = new n4.s[ag.b.values().length];
                break;
        }
    }

    public l(MediaMetadataCompat mediaMetadataCompat) {
        this.a = 2;
        Bundle bundle = new Bundle(mediaMetadataCompat.a);
        this.b = bundle;
        android.support.v4.media.session.b0.a(bundle);
    }

    @Override // k2.y
    public /* synthetic */ void U() {
    }

    @Override // mg.o
    public void W() {
    }

    @Override // k2.y
    public /* synthetic */ void l() {
    }

    @Override // ki.u3
    public void y() {
    }

    @Override // mg.o
    public void E(boolean z10) {
    }

    @Override // mg.o
    public void R(boolean z10) {
    }

    @Override // ci.v9
    public /* synthetic */ void b(boolean z10) {
    }

    @Override // org.telegram.ui.Components.g81
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.g81
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.g81
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // ki.u3
    public void z(int i10) {
    }

    @Override // ki.u3
    public void o(h1 h1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Components.g81
    public void onError(j81 j81Var, Exception exc) {
    }
}
