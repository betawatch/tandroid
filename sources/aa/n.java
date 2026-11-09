package aa;

import a8.ia;
import a8.ra;
import a8.wa;
import android.content.Intent;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.fragment.app.i0;
import bi.q7;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.common.api.internal.f1;
import com.google.android.gms.common.api.internal.o0;
import com.google.android.gms.common.api.internal.p0;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import di.l3;
import di.l4;
import di.m9;
import di.n9;
import fi.m0;
import fi.va;
import fi.w5;
import fi.x9;
import fi.y5;
import gb.y0;
import java.lang.reflect.InvocationHandler;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Lock;
import m.j1;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.lc;
import org.telegram.messenger.qs;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.Components.ah0;
import org.telegram.ui.Components.gt0;
import org.telegram.ui.Components.r51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.ev0;
import org.telegram.ui.p00;
import org.telegram.ui.q11;
import org.telegram.ui.yv0;
import q7.l1;
import q7.m1;
import tg.r1;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class n implements androidx.lifecycle.a0, androidx.activity.result.b, gt0, lc, q11, o0, m9, WebMessageListenerBoundaryInterface, com.google.android.gms.common.api.internal.p, og.n, tg.c, r51, j1, OnCompleteListener, ib.b {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ n(d6.i iVar) {
        this.a = 18;
        this.b = (com.google.android.gms.internal.play_billing.r) iVar.b;
    }

    public static int A(long j3) {
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

    public static int B(int i7) {
        return C(i7 << 3);
    }

    public static int C(int i7) {
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

    public static int q(CharSequence charSequence) {
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

    public static int v(int i7, String str) {
        int B = B(i7);
        int q10 = q(str);
        return C(q10) + q10 + B;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v20 */
    public static void y(CharSequence charSequence, ByteBuffer byteBuffer) {
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
                                    byteBuffer.put((byte) ((codePoint >>> 18) | qs.P3));
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
                                    array[i7] = (byte) ((codePoint2 >>> 18) | qs.P3);
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

    @Override // org.telegram.ui.Components.gt0
    public void F(boolean z9) {
        switch (this.a) {
            case 6:
                te.a aVar = ((bi.z) this.b).s;
                if (aVar != null) {
                    aVar.a(z9, true);
                    break;
                }
                break;
            default:
                gi.f fVar = (gi.f) this.b;
                te.a aVar2 = fVar.Y;
                if (aVar2 != null) {
                    aVar2.a(z9, true);
                }
                p00 p00Var = fVar.s;
                if (p00Var != null) {
                    p00Var.invalidate();
                    break;
                }
                break;
        }
    }

    @Override // androidx.lifecycle.a0
    public void X(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        androidx.biometric.g0 g0Var = (androidx.biometric.g0) this.b;
        Handler handler = g0Var.A0;
        ra raVar = g0Var.B0;
        handler.removeCallbacks(raVar);
        TextView textView = g0Var.G0;
        if (textView != null) {
            textView.setText(charSequence);
        }
        handler.postDelayed(raVar, 2000L);
    }

    @Override // org.telegram.ui.Components.gt0
    public float Y0() {
        i0.b bVar;
        int d;
        switch (this.a) {
            case 6:
                bVar = ((f2) ((bi.z) this.b)).mSystemInsets;
                d = oi.a.d(bVar.b);
                break;
            default:
                d = oi.a.d(((gi.f) this.b).b0);
                break;
        }
        return jg.g.e(9.66f, d, 0);
    }

    public void a(f3.j jVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
        long[] jArr = jVar.e;
        if (jArr.length <= 0 || linkedHashMap.containsKey(Long.valueOf(jArr[0]))) {
            return;
        }
        linkedHashMap.put(Long.valueOf(jVar.e[0]), jVar);
    }

    @Override // com.google.android.gms.common.api.internal.p
    public void accept(Object obj, Object obj2) {
        e7.b bVar = new e7.b(0, (TaskCompletionSource) obj2);
        m1 m1Var = (m1) ((l1) obj).n();
        f7.v vVar = (f7.v) this.b;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(m1Var.b);
        int i7 = q7.j.a;
        obtain.writeStrongBinder(bVar);
        obtain.writeInt(1);
        vVar.writeToParcel(obtain, 0);
        Parcel obtain2 = Parcel.obtain();
        try {
            m1Var.a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    public void c(StringBuilder sb2, Iterator it) {
        g9.l lVar = (g9.l) this.b;
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb2.append(g9.l.f(entry.getKey()));
            sb2.append("=");
            sb2.append(g9.l.f(entry.getValue()));
            while (it.hasNext()) {
                sb2.append((CharSequence) lVar.a);
                Map.Entry entry2 = (Map.Entry) it.next();
                sb2.append(g9.l.f(entry2.getKey()));
                sb2.append("=");
                sb2.append(g9.l.f(entry2.getValue()));
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.o0
    public void d(n6.a aVar) {
        f1 f1Var = (f1) this.b;
        f1Var.o.lock();
        try {
            f1Var.l = aVar;
            f1Var.j();
        } finally {
            f1Var.o.unlock();
        }
    }

    @Override // di.m9
    public void e(long j3, int i7, l3 l3Var) {
        ev0 ev0Var = (ev0) this.b;
        int i10 = ProfileStoriesView.s0;
        ev0Var.f(true, false);
        l3Var.run();
    }

    @Override // org.telegram.ui.Components.gt0
    public int e1() {
        i0.b bVar;
        switch (this.a) {
            case 6:
                bVar = ((f2) ((bi.z) this.b)).mSystemInsets;
                return bVar.d;
            default:
                return ((gi.f) this.b).c0;
        }
    }

    @Override // androidx.activity.result.b
    public void f(Object obj) {
        switch (this.a) {
            case 4:
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                i0 i0Var = (i0) this.b;
                androidx.fragment.app.e0 e0Var = (androidx.fragment.app.e0) i0Var.F.pollFirst();
                if (e0Var != null) {
                    String str = e0Var.a;
                    int i7 = e0Var.b;
                    androidx.fragment.app.r o4 = i0Var.c.o(str);
                    if (o4 != null) {
                        o4.x(i7, aVar.a, aVar.b);
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
                int i10 = aVar2.a;
                Bundle extras = intent == null ? null : intent.getExtras();
                if (i10 != -1) {
                    if (extras == null) {
                        extras = new Bundle();
                    }
                    com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i10);
                    extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                    extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i10);
                }
                int i11 = com.google.android.gms.internal.play_billing.u.e("ProxyBillingActivityV2", intent).a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.O;
                if (resultReceiver != null) {
                    resultReceiver.send(i11, extras);
                } else {
                    com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer flow result receiver is null");
                }
                if (i11 != 0) {
                    com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i11);
                }
                proxyBillingActivityV2.finish();
                break;
        }
    }

    @Override // org.telegram.messenger.lc
    public void f0(ImageReceiver imageReceiver, boolean z9, boolean z10, boolean z11) {
        ah0 B;
        boolean[] zArr = (boolean[]) this.b;
        if (!z9 || (B = imageReceiver.B()) == null || zArr[0]) {
            return;
        }
        B.N(0, false, false);
        org.telegram.messenger.g0.h3(new org.telegram.ui.Cells.o0(B, 0));
        zArr[0] = true;
    }

    @Override // tg.c
    public void g() {
        x9 x9Var = (x9) this.b;
        x9Var.A0(null, true);
        if (x9Var.v0) {
            va vaVar = x9Var.j2;
            vaVar.c1.f.d();
            vaVar.k0(-1, false, true);
            x9Var.v0 = false;
        }
        x9Var.L0(false);
    }

    @Override // fd.a
    public Object get() {
        return new y0((gb.f1) ((ib.c) this.b).get());
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0240 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x063f  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x064a  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x05e9 A[Catch: a | c -> 0x0686, TryCatch #5 {a | c -> 0x0686, blocks: (B:298:0x05cf, B:299:0x05e5, B:301:0x05e9, B:302:0x05ec, B:304:0x05f0, B:306:0x05fa, B:308:0x0600, B:313:0x0605), top: B:297:0x05cf }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public android.support.v4.media.session.a0 h(wf.b bVar) {
        int i7;
        ArrayList arrayList;
        hc.c cVar;
        hc.c cVar2;
        hc.c cVar3;
        float f10;
        float f11;
        hc.a aVar;
        float f12;
        float f13;
        float f14;
        int i10;
        int i11;
        bc.j[] jVarArr;
        bc.a aVar2;
        cc.b bVar2;
        int i12;
        cc.e eVar;
        int i13;
        android.support.v4.media.session.a0 a0Var;
        List list;
        String str;
        int i14;
        boolean z9;
        double d;
        double abs;
        int i15;
        int i16;
        int i17;
        int i18;
        g6.d0 d0Var = (g6.d0) this.b;
        if (((cc.b) bVar.c) == null) {
            bVar.c = ((cc.g) bVar.b).a();
        }
        cc.b bVar3 = (cc.b) bVar.c;
        gf.g gVar = new gf.g(bVar3, 2);
        hc.e eVar2 = new hc.e(bVar3);
        int i19 = bVar3.b;
        int i20 = bVar3.a;
        int i21 = (i19 * 3) / 388;
        int i22 = 3;
        if (i21 < 3) {
            i21 = 3;
        }
        char c10 = 5;
        int[] iArr = new int[5];
        int i23 = i21 - 1;
        int i24 = 0;
        boolean z10 = false;
        while (true) {
            char c11 = c10;
            int i25 = 1;
            i7 = i22;
            arrayList = eVar2.b;
            if (i23 >= i19 || z10) {
                break;
            }
            Arrays.fill(iArr, i24);
            int i26 = i24;
            while (i26 < i20) {
                if (bVar3.b(i26, i23)) {
                    if ((i24 & 1) == i25) {
                        i24++;
                    }
                    iArr[i24] = iArr[i24] + i25;
                } else if ((i24 & 1) == 0) {
                    if (i24 == 4) {
                        if (!hc.e.b(iArr)) {
                            i15 = i26;
                            int i27 = i25;
                            iArr[0] = iArr[2];
                            iArr[i27] = iArr[i7];
                            iArr[2] = iArr[4];
                            iArr[i7] = i27;
                            iArr[4] = 0;
                        } else if (eVar2.c(i23, i26, iArr)) {
                            if (eVar2.c) {
                                z10 = eVar2.d();
                                i17 = 2;
                            } else {
                                if (arrayList.size() > i25) {
                                    int size = arrayList.size();
                                    int i28 = 0;
                                    hc.c cVar4 = null;
                                    while (true) {
                                        if (i28 >= size) {
                                            i16 = i26;
                                            i17 = 2;
                                            i18 = 0;
                                            break;
                                        }
                                        Object obj = arrayList.get(i28);
                                        i28++;
                                        hc.c cVar5 = (hc.c) obj;
                                        i16 = i26;
                                        if (cVar5.d >= 2) {
                                            if (cVar4 != null) {
                                                eVar2.c = true;
                                                i17 = 2;
                                                i18 = ((int) (Math.abs(cVar4.a - cVar5.a) - Math.abs(cVar4.b - cVar5.b))) / 2;
                                                break;
                                            }
                                            cVar4 = cVar5;
                                        }
                                        i26 = i16;
                                    }
                                } else {
                                    i16 = i26;
                                    i18 = 0;
                                    i17 = 2;
                                }
                                if (i18 > iArr[i17]) {
                                    i23 += (i18 - r4) - 2;
                                    i26 = i20 - 1;
                                } else {
                                    i26 = i16;
                                }
                            }
                            Arrays.fill(iArr, 0);
                            i24 = 0;
                            i21 = i17;
                        } else {
                            i15 = i26;
                            iArr[0] = iArr[2];
                            iArr[1] = iArr[i7];
                            iArr[2] = iArr[4];
                            iArr[i7] = 1;
                            iArr[4] = 0;
                        }
                        i24 = i7;
                    } else {
                        i15 = i26;
                        int i29 = i24 + 1;
                        iArr[i29] = iArr[i29] + 1;
                        i24 = i29;
                    }
                    i26 = i15;
                } else {
                    iArr[i24] = iArr[i24] + 1;
                }
                i26++;
                i25 = 1;
            }
            if (hc.e.b(iArr) && eVar2.c(i23, i20, iArr)) {
                int i30 = iArr[0];
                if (eVar2.c) {
                    i21 = i30;
                    z10 = eVar2.d();
                } else {
                    i21 = i30;
                }
            }
            i23 += i21;
            c10 = c11;
            i22 = i7;
            i24 = 0;
        }
        if (arrayList.size() < i7) {
            throw bc.e.a();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((hc.c) it.next()).d < 2) {
                it.remove();
            }
        }
        Collections.sort(arrayList, hc.e.e);
        hc.c[] cVarArr = new hc.c[3];
        int i31 = 0;
        double d2 = Double.MAX_VALUE;
        for (int i32 = 2; i31 < arrayList.size() - i32; i32 = 2) {
            hc.c cVar6 = (hc.c) arrayList.get(i31);
            float f15 = cVar6.c;
            i31++;
            int i33 = i31;
            while (i33 < arrayList.size() - 1) {
                hc.c cVar7 = (hc.c) arrayList.get(i33);
                double e10 = hc.e.e(cVar6, cVar7);
                i33++;
                for (int i34 = i33; i34 < arrayList.size(); i34++) {
                    hc.c cVar8 = (hc.c) arrayList.get(i34);
                    if (cVar8.c <= 1.4f * f15) {
                        double e11 = hc.e.e(cVar7, cVar8);
                        double e12 = hc.e.e(cVar6, cVar8);
                        if (e10 < e11) {
                            if (e11 <= e12) {
                                e12 = e11;
                                e11 = e12;
                            } else if (e10 >= e12) {
                                d = e12;
                                e12 = e10;
                                abs = Math.abs(e11 - (d * 2.0d)) + Math.abs(e11 - (e12 * 2.0d));
                                if (abs >= d2) {
                                    cVarArr[0] = cVar6;
                                    cVarArr[1] = cVar7;
                                    cVarArr[2] = cVar8;
                                    d2 = abs;
                                }
                            }
                            d = e10;
                            abs = Math.abs(e11 - (d * 2.0d)) + Math.abs(e11 - (e12 * 2.0d));
                            if (abs >= d2) {
                            }
                        } else {
                            if (e11 >= e12) {
                                d = e12;
                                e12 = e11;
                            } else if (e10 < e12) {
                                d = e11;
                                e11 = e12;
                                e12 = e10;
                                abs = Math.abs(e11 - (d * 2.0d)) + Math.abs(e11 - (e12 * 2.0d));
                                if (abs >= d2) {
                                }
                            } else {
                                d = e11;
                            }
                            e11 = e10;
                            abs = Math.abs(e11 - (d * 2.0d)) + Math.abs(e11 - (e12 * 2.0d));
                            if (abs >= d2) {
                            }
                        }
                    }
                }
            }
        }
        if (d2 == Double.MAX_VALUE) {
            throw bc.e.a();
        }
        float a10 = bc.j.a(cVarArr[0], cVarArr[1]);
        float a11 = bc.j.a(cVarArr[1], cVarArr[2]);
        float a12 = bc.j.a(cVarArr[0], cVarArr[2]);
        if (a11 >= a10 && a11 >= a12) {
            cVar = cVarArr[0];
            cVar2 = cVarArr[1];
            cVar3 = cVarArr[2];
        } else if (a12 < a11 || a12 < a10) {
            cVar = cVarArr[2];
            cVar2 = cVarArr[0];
            cVar3 = cVarArr[1];
        } else {
            cVar = cVarArr[1];
            cVar2 = cVarArr[0];
            cVar3 = cVarArr[2];
        }
        float f16 = cVar.a;
        float f17 = cVar.b;
        if (com.google.android.recaptcha.internal.a.v(cVar2.a, f16, cVar3.b - f17, (cVar2.b - f17) * (cVar3.a - f16)) < 0.0f) {
            hc.c cVar9 = cVar3;
            cVar3 = cVar2;
            cVar2 = cVar9;
        }
        cVarArr[0] = cVar2;
        cVarArr[1] = cVar;
        cVarArr[2] = cVar3;
        float j3 = gVar.j(cVar, cVar3);
        float f18 = cVar.a;
        float f19 = cVar3.b;
        float f20 = cVar3.a;
        float j10 = gVar.j(cVar, cVar2);
        float f21 = cVar2.b;
        float f22 = cVar2.a;
        float f23 = (j10 + j3) / 2.0f;
        if (f23 < 1.0f) {
            throw bc.e.a();
        }
        float a13 = bc.j.a(cVar, cVar3) / f23;
        int i35 = (int) (a13 + (a13 < 0.0f ? -0.5f : 0.5f));
        float a14 = bc.j.a(cVar, cVar2) / f23;
        int i36 = (((int) (a14 + (a14 >= 0.0f ? 0.5f : -0.5f))) + i35) / 2;
        int i37 = i36 + 7;
        int i38 = i37 & 3;
        if (i38 == 0) {
            i37 = i36 + 8;
        } else if (i38 == 2) {
            i37 = i36 + 6;
        } else if (i38 == 3) {
            i37 = i36 + 5;
        }
        int i39 = i37;
        int[] iArr2 = gc.e.e;
        if (i39 % 4 != 1) {
            throw bc.c.a();
        }
        try {
            gc.e c12 = gc.e.c((i39 - 17) / 4);
            int i40 = 10;
            int i41 = (c12.a * 4) + 10;
            if (c12.b.length > 0) {
                float f24 = (f20 - f18) + f22;
                f11 = f20;
                float f25 = (f19 - f17) + f21;
                float f26 = 1.0f - (3.0f / i41);
                int z11 = (int) com.google.android.recaptcha.internal.a.z(f24, f18, f26, f18);
                int z12 = (int) com.google.android.recaptcha.internal.a.z(f25, f17, f26, f17);
                f10 = f18;
                for (int i42 = 4; i42 <= 16; i42 <<= 1) {
                    try {
                        aVar = gVar.k(f23, i42, z11, z12);
                        break;
                    } catch (bc.e unused) {
                    }
                }
            } else {
                f10 = f18;
                f11 = f20;
            }
            aVar = null;
            float f27 = i39 - 3.5f;
            if (aVar != null) {
                f12 = aVar.a;
                f13 = aVar.b;
                f14 = f27 - 3.0f;
            } else {
                f12 = (f11 - f10) + f22;
                f13 = (f19 - f17) + f21;
                f14 = f27;
            }
            float f28 = f13;
            float f29 = cVar.a;
            float f30 = cVar.b;
            float f31 = cVar3.a;
            float f32 = cVar3.b;
            float f33 = cVar2.a;
            float f34 = cVar2.b;
            cc.i a15 = cc.i.a(3.5f, 3.5f, f27, 3.5f, f14, f14, 3.5f, f27);
            hc.a aVar3 = aVar;
            float f35 = a15.e;
            float f36 = a15.i;
            float f37 = f35 * f36;
            float f38 = a15.f;
            float f39 = a15.h;
            float f40 = f37 - (f38 * f39);
            float f41 = a15.g;
            float f42 = f38 * f41;
            float f43 = a15.d;
            float f44 = f42 - (f43 * f36);
            float f45 = (f43 * f39) - (f35 * f41);
            float f46 = a15.c;
            float f47 = f46 * f39;
            float f48 = a15.b;
            float f49 = f47 - (f48 * f36);
            float f50 = a15.a;
            float f51 = (f36 * f50) - (f46 * f41);
            float f52 = (f41 * f48) - (f39 * f50);
            float f53 = (f48 * f38) - (f46 * f35);
            float f54 = (f46 * f43) - (f38 * f50);
            float f55 = (f50 * f35) - (f48 * f43);
            cc.i a16 = cc.i.a(f29, f30, f31, f32, f12, f28, f33, f34);
            float f56 = a16.a;
            float f57 = a16.d;
            float f58 = a16.g;
            float f59 = (f58 * f53) + (f57 * f49) + (f56 * f40);
            float f60 = (f58 * f54) + (f57 * f51) + (f56 * f44);
            float f61 = (f58 * f55) + (f57 * f52) + (f56 * f45);
            float f62 = a16.b;
            float f63 = a16.e;
            float f64 = a16.h;
            float f65 = (f64 * f53) + (f63 * f49) + (f62 * f40);
            float f66 = (f64 * f54) + (f63 * f51) + (f62 * f44);
            float f67 = (f64 * f55) + (f63 * f52) + (f62 * f45);
            float f68 = a16.c;
            float f69 = a16.f;
            float f70 = a16.i;
            float f71 = (f53 * f70) + (f49 * f69) + (f40 * f68);
            float f72 = (f54 * f70) + (f51 * f69) + (f44 * f68);
            float f73 = (f70 * f55) + (f69 * f52) + (f68 * f45);
            if (i39 <= 0 || i39 <= 0) {
                throw bc.e.a();
            }
            cc.b bVar4 = new cc.b(i39, i39);
            int i43 = i39 * 2;
            hc.c cVar10 = cVar;
            float[] fArr = new float[i43];
            int i44 = 0;
            while (i44 < i39) {
                int i45 = i39;
                float f74 = i44 + 0.5f;
                int i46 = 0;
                while (i46 < i43) {
                    int i47 = i46;
                    fArr[i47] = (i47 / 2) + 0.5f;
                    fArr[i47 + 1] = f74;
                    i46 = i47 + 2;
                }
                int i48 = i43 - 1;
                hc.c cVar11 = cVar2;
                int i49 = 0;
                while (i49 < i48) {
                    float f75 = fArr[i49];
                    int i50 = i49 + 1;
                    int i51 = i49;
                    float f76 = fArr[i50];
                    hc.c cVar12 = cVar3;
                    float d10 = rf.b.d(f72, f76, f71 * f75, f73);
                    fArr[i51] = (((f60 * f76) + (f59 * f75)) + f61) / d10;
                    fArr[i50] = (((f76 * f66) + (f75 * f65)) + f67) / d10;
                    i49 = i51 + 2;
                    cVar3 = cVar12;
                }
                hc.c cVar13 = cVar3;
                int i52 = bVar3.b;
                float f77 = f72;
                int i53 = 0;
                boolean z13 = true;
                while (i53 < i48 && z13) {
                    int i54 = (int) fArr[i53];
                    int i55 = i53 + 1;
                    int i56 = i48;
                    int i57 = (int) fArr[i55];
                    int i58 = i53;
                    if (i54 < -1 || i54 > i20 || i57 < -1 || i57 > i52) {
                        throw bc.e.a();
                    }
                    if (i54 == -1) {
                        fArr[i58] = 0.0f;
                    } else if (i54 == i20) {
                        fArr[i58] = i20 - 1;
                    } else {
                        z9 = false;
                        if (i57 != -1) {
                            fArr[i55] = 0.0f;
                        } else if (i57 == i52) {
                            fArr[i55] = i52 - 1;
                        } else {
                            z13 = z9;
                            i53 = i58 + 2;
                            i48 = i56;
                        }
                        z13 = true;
                        i53 = i58 + 2;
                        i48 = i56;
                    }
                    z9 = true;
                    if (i57 != -1) {
                    }
                    z13 = true;
                    i53 = i58 + 2;
                    i48 = i56;
                }
                int i59 = i43 - 2;
                boolean z14 = true;
                while (i59 >= 0 && z14) {
                    int i60 = (int) fArr[i59];
                    int i61 = i59 + 1;
                    int i62 = i59;
                    int i63 = (int) fArr[i61];
                    if (i60 < -1 || i60 > i20 || i63 < -1 || i63 > i52) {
                        throw bc.e.a();
                    }
                    if (i60 == -1) {
                        fArr[i62] = 0.0f;
                    } else if (i60 == i20) {
                        fArr[i62] = i20 - 1;
                    } else {
                        z14 = false;
                        if (i63 != -1) {
                            fArr[i61] = 0.0f;
                        } else if (i63 == i52) {
                            fArr[i61] = i52 - 1;
                        } else {
                            i59 = i62 - 2;
                        }
                        z14 = true;
                        i59 = i62 - 2;
                    }
                    z14 = true;
                    if (i63 != -1) {
                    }
                    z14 = true;
                    i59 = i62 - 2;
                }
                for (int i64 = 0; i64 < i43; i64 += 2) {
                    try {
                        if (bVar3.b((int) fArr[i64], (int) fArr[i64 + 1])) {
                            bVar4.c(i64 / 2, i44);
                        }
                    } catch (ArrayIndexOutOfBoundsException unused2) {
                        throw bc.e.a();
                    }
                }
                i44++;
                i39 = i45;
                cVar2 = cVar11;
                f72 = f77;
                cVar3 = cVar13;
            }
            hc.c cVar14 = cVar2;
            hc.c cVar15 = cVar3;
            if (aVar3 == null) {
                i11 = 3;
                i10 = 1;
                jVarArr = new bc.j[]{cVar14, cVar10, cVar15};
            } else {
                i10 = 1;
                i11 = 3;
                jVarArr = new bc.j[]{cVar14, cVar10, cVar15, aVar3};
            }
            bc.j[] jVarArr2 = jVarArr;
            d0Var.getClass();
            ab.q qVar = new ab.q();
            int i65 = bVar4.b;
            if (i65 < 21 || (i65 & i11) != i10) {
                throw bc.c.a();
            }
            qVar.b = bVar4;
            try {
                eVar = d0Var.T(qVar);
            } catch (bc.a e13) {
                aVar2 = e13;
                e = null;
                try {
                    qVar.w();
                    qVar.c = null;
                    qVar.d = null;
                    qVar.a = true;
                    qVar.v();
                    qVar.u();
                    bVar2 = (cc.b) qVar.b;
                    i12 = 0;
                    while (i12 < bVar2.a) {
                        int i66 = i12 + 1;
                        for (int i67 = i66; i67 < bVar2.b; i67++) {
                            if (bVar2.b(i12, i67) != bVar2.b(i67, i12)) {
                                bVar2.a(i67, i12);
                                bVar2.a(i12, i67);
                            }
                        }
                        i12 = i66;
                    }
                    cc.e T = d0Var.T(qVar);
                    T.h = new qb.a(i40);
                    eVar = T;
                    i13 = eVar.a;
                    if (com.google.android.recaptcha.internal.a.u((qb.a) eVar.h)) {
                        bc.j jVar = jVarArr2[0];
                        jVarArr2[0] = jVarArr2[2];
                        jVarArr2[2] = jVar;
                    }
                    a0Var = new android.support.v4.media.session.a0((String) eVar.d, jVarArr2);
                    list = (List) eVar.f;
                    if (list != null) {
                    }
                    str = (String) eVar.e;
                    if (str != null) {
                    }
                    if (i13 >= 0) {
                        a0Var.p(bc.i.d, Integer.valueOf(i14));
                        a0Var.p(bc.i.e, Integer.valueOf(i13));
                    }
                    a0Var.p(bc.i.c, (Integer) eVar.g);
                    a0Var.p(bc.i.f, "]Q" + eVar.c);
                    return a0Var;
                } catch (bc.a | bc.c unused3) {
                    if (e != null) {
                        throw e;
                    }
                    throw aVar2;
                }
            } catch (bc.c e14) {
                e = e14;
                aVar2 = null;
                qVar.w();
                qVar.c = null;
                qVar.d = null;
                qVar.a = true;
                qVar.v();
                qVar.u();
                bVar2 = (cc.b) qVar.b;
                i12 = 0;
                while (i12 < bVar2.a) {
                }
                cc.e T2 = d0Var.T(qVar);
                T2.h = new qb.a(i40);
                eVar = T2;
                i13 = eVar.a;
                if (com.google.android.recaptcha.internal.a.u((qb.a) eVar.h)) {
                }
                a0Var = new android.support.v4.media.session.a0((String) eVar.d, jVarArr2);
                list = (List) eVar.f;
                if (list != null) {
                }
                str = (String) eVar.e;
                if (str != null) {
                }
                if (i13 >= 0) {
                }
                a0Var.p(bc.i.c, (Integer) eVar.g);
                a0Var.p(bc.i.f, "]Q" + eVar.c);
                return a0Var;
            }
            i13 = eVar.a;
            if (com.google.android.recaptcha.internal.a.u((qb.a) eVar.h) && jVarArr2.length >= 3) {
                bc.j jVar2 = jVarArr2[0];
                jVarArr2[0] = jVarArr2[2];
                jVarArr2[2] = jVar2;
            }
            a0Var = new android.support.v4.media.session.a0((String) eVar.d, jVarArr2);
            list = (List) eVar.f;
            if (list != null) {
                a0Var.p(bc.i.a, list);
            }
            str = (String) eVar.e;
            if (str != null) {
                a0Var.p(bc.i.b, str);
            }
            if (i13 >= 0 && (i14 = eVar.b) >= 0) {
                a0Var.p(bc.i.d, Integer.valueOf(i14));
                a0Var.p(bc.i.e, Integer.valueOf(i13));
            }
            a0Var.p(bc.i.c, (Integer) eVar.g);
            a0Var.p(bc.i.f, "]Q" + eVar.c);
            return a0Var;
        } catch (IllegalArgumentException unused4) {
            throw bc.c.a();
        }
    }

    @Override // com.google.android.gms.common.api.internal.o0
    public void i(int i7) {
        n6.a aVar;
        f1 f1Var = (f1) this.b;
        Lock lock = f1Var.o;
        Lock lock2 = f1Var.o;
        lock.lock();
        try {
            if (!f1Var.n && (aVar = f1Var.m) != null && aVar.c()) {
                f1Var.n = true;
                f1Var.e.onConnectionSuspended(i7);
                return;
            }
            f1Var.n = false;
            f1Var.b.i(i7);
            f1Var.m = null;
            f1Var.l = null;
        } finally {
            lock2.unlock();
        }
    }

    public boolean j() {
        p0 p0Var = ((com.google.android.gms.common.api.internal.d0) this.b).d;
        return p0Var != null && p0Var.g();
    }

    @Override // com.google.android.gms.common.api.internal.o0
    public void k(Bundle bundle) {
        f1 f1Var = (f1) this.b;
        f1Var.o.lock();
        try {
            Bundle bundle2 = f1Var.k;
            if (bundle2 == null) {
                f1Var.k = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            f1Var.l = n6.a.f;
            f1Var.j();
        } finally {
            f1Var.o.unlock();
        }
    }

    @Override // tg.c
    public tg.j l() {
        return ((x9) this.b).s0;
    }

    public f3.j m() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (f3.j jVar : ((LinkedHashMap) this.b).values()) {
            arrayList.add(jVar.b);
            arrayList2.add(jVar.c);
            arrayList3.add(jVar.d);
            arrayList4.add(jVar.e);
        }
        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()][]);
        long j3 = 0;
        for (int[] iArr2 : iArr) {
            j3 += iArr2.length;
        }
        int i7 = (int) j3;
        ia.d(j3, "the total number of elements (%s) in the arrays must fit in an int", j3 == ((long) i7));
        int[] iArr3 = new int[i7];
        int i10 = 0;
        for (int[] iArr4 : iArr) {
            System.arraycopy(iArr4, 0, iArr3, i10, iArr4.length);
            i10 += iArr4.length;
        }
        return new f3.j(iArr3, c8.f1.a((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), c8.f1.a((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), c8.f1.a((long[][]) arrayList4.toArray(new long[arrayList4.size()][])));
    }

    public void n() {
        ((androidx.fragment.app.t) this.b).d.R();
    }

    @Override // di.m9
    public boolean o(long j3, int i7, int i10, int i11, n9 n9Var) {
        ImageReceiver imageReceiver;
        l4 l4Var;
        l4 l4Var2;
        n9Var.b = null;
        n9Var.c = null;
        ev0 ev0Var = (ev0) this.b;
        yv0 yv0Var = ev0Var.h;
        ArrayList arrayList = ev0Var.x;
        if (ev0Var.N < 0.2f) {
            n9Var.b = yv0Var.getImageReceiver();
            n9Var.c = null;
            n9Var.a = yv0Var;
            n9Var.h = 0.0f;
            n9Var.i = org.telegram.messenger.g0.q.y;
            n9Var.g = (View) ev0Var.getParent();
            n9Var.d = ev0Var.D;
            n9Var.n = true;
            return true;
        }
        int i12 = 0;
        while (true) {
            if (i12 >= arrayList.size()) {
                imageReceiver = null;
                l4Var = null;
                l4Var2 = null;
                break;
            }
            l4 l4Var3 = (l4) arrayList.get(i12);
            if (l4Var3.e < 1.0f || l4Var3.a != i10) {
                i12++;
            } else {
                int i13 = i12 - 1;
                int i14 = i12 - 2;
                l4 d = ProfileStoriesView.d(i13 >= 0 ? (l4) arrayList.get(i13) : null, i14 >= 0 ? (l4) arrayList.get(i14) : null, l4Var3);
                imageReceiver = l4Var3.b;
                l4Var2 = d;
                l4Var = l4Var3;
            }
        }
        if (imageReceiver == null) {
            return false;
        }
        n9Var.c = imageReceiver;
        n9Var.b = null;
        n9Var.a = ev0Var;
        n9Var.h = 0.0f;
        n9Var.i = org.telegram.messenger.g0.q.y;
        n9Var.g = (View) ev0Var.getParent();
        if (l4Var == null || l4Var2 == null) {
            n9Var.f = null;
            return true;
        }
        n9Var.f = new q7(this, new RectF(l4Var.m), l4Var, new RectF(l4Var2.m), l4Var2);
        return true;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        g6.c.h((g6.c) ((g6.j) this.b).c, "launchApplication", task);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z9, InvocationHandler invocationHandler2) {
        wa waVar;
        wa waVar2;
        WebMessageBoundaryInterface webMessageBoundaryInterface = (WebMessageBoundaryInterface) af.b.a(WebMessageBoundaryInterface.class, invocationHandler);
        InvocationHandler[] ports = webMessageBoundaryInterface.getPorts();
        cb.c[] cVarArr = new cb.c[ports.length];
        for (int i7 = 0; i7 < ports.length; i7++) {
            InvocationHandler invocationHandler3 = ports[i7];
            cb.c cVar = new cb.c(20);
            cVar.b = (WebMessagePortBoundaryInterface) af.b.a(WebMessagePortBoundaryInterface.class, invocationHandler3);
            cVarArr[i7] = cVar;
        }
        if (e5.k.a.b()) {
            WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) af.b.a(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
            int type = webMessagePayloadBoundaryInterface.getType();
            if (type == 0) {
                waVar = new wa(webMessagePayloadBoundaryInterface.getAsString());
            } else {
                if (type != 1) {
                    waVar2 = null;
                    if (waVar2 == null) {
                        JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) af.b.a(JsReplyProxyBoundaryInterface.class, invocationHandler2);
                        ((d5.a) this.b).i(webView, waVar2, uri, z9, (e5.f) jsReplyProxyBoundaryInterface.getOrCreatePeer(new t(jsReplyProxyBoundaryInterface, 1)));
                        return;
                    }
                    return;
                }
                waVar = new wa(webMessagePayloadBoundaryInterface.getAsArrayBuffer());
            }
        } else {
            waVar = new wa(webMessageBoundaryInterface.getData());
        }
        waVar2 = waVar;
        if (waVar2 == null) {
        }
    }

    @Override // org.telegram.ui.Components.r51
    public /* synthetic */ void onRenderedFirstFrame(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.r51
    public void onStateChanged(boolean z9, int i7) {
        y5 y5Var = (y5) this.b;
        w5 w5Var = y5Var.M;
        u51 u51Var = y5Var.y;
        if (u51Var == null) {
            return;
        }
        if (u51Var.d0()) {
            org.telegram.messenger.g0.h3(w5Var);
        } else {
            org.telegram.messenger.g0.r(w5Var);
        }
    }

    @Override // org.telegram.ui.Components.r51
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.r51
    public void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
        r1 r1Var = ((y5) this.b).x;
        if (r1Var != null) {
            float f11 = i7 / i10;
            if (Math.abs(r1Var.y0 - f11) >= 1.0E-4f) {
                r1Var.y0 = f11;
                r1Var.requestLayout();
            }
        }
    }

    public void p(ia.c cVar, Thread thread, Throwable th2) {
        q qVar = (q) this.b;
        synchronized (qVar) {
            String str = "Handling uncaught exception \"" + th2 + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            c8.a0.a();
            try {
                g0.a(qVar.e.a.b(new o(qVar, System.currentTimeMillis(), th2, thread, cVar)));
            } catch (TimeoutException unused) {
                Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
            } catch (Exception e10) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e10);
            }
        }
    }

    public void r(int i7, String str) {
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        x(i7, 2);
        try {
            int C = C(str.length());
            if (C != C(str.length() * 3)) {
                u(q(str));
                y(str, byteBuffer);
                return;
            }
            int position = byteBuffer.position();
            if (byteBuffer.remaining() < C) {
                throw new androidx.datastore.preferences.protobuf.l(position + C, byteBuffer.limit());
            }
            byteBuffer.position(position + C);
            y(str, byteBuffer);
            int position2 = byteBuffer.position();
            byteBuffer.position(position);
            u((position2 - position) - C);
            byteBuffer.position(position2);
        } catch (BufferOverflowException e10) {
            androidx.datastore.preferences.protobuf.l lVar = new androidx.datastore.preferences.protobuf.l(byteBuffer.position(), byteBuffer.limit());
            lVar.initCause(e10);
            throw lVar;
        }
    }

    public void s(int i7, byte[] bArr) {
        x(i7, 2);
        u(bArr.length);
        int length = bArr.length;
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        if (byteBuffer.remaining() < length) {
            throw new androidx.datastore.preferences.protobuf.l(byteBuffer.position(), byteBuffer.limit());
        }
        byteBuffer.put(bArr, 0, length);
    }

    public void t(int i7) {
        byte b10 = (byte) i7;
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        if (!byteBuffer.hasRemaining()) {
            throw new androidx.datastore.preferences.protobuf.l(byteBuffer.position(), byteBuffer.limit());
        }
        byteBuffer.put(b10);
    }

    public void u(int i7) {
        while ((i7 & (-128)) != 0) {
            t((i7 & qs.L1) | 128);
            i7 >>>= 7;
        }
        t(i7);
    }

    @Override // og.n
    public void w() {
        ((m0) this.b).e.invalidate();
    }

    public void x(int i7, int i10) {
        u((i7 << 3) | i10);
    }

    public void z(long j3) {
        while (((-128) & j3) != 0) {
            t((((int) j3) & qs.L1) | 128);
            j3 >>>= 7;
        }
        t((int) j3);
    }

    @Override // org.telegram.ui.Components.r51
    public void onRenderedFirstFrame() {
    }

    public /* synthetic */ n(e7.a aVar, f7.v vVar) {
        this.a = 16;
        this.b = vVar;
    }

    public /* synthetic */ n(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    public n(byte[] bArr, int i7) {
        this.a = 12;
        ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, i7);
        this.b = wrap;
        wrap.order(ByteOrder.LITTLE_ENDIAN);
    }

    public n(int i7) {
        this.a = i7;
        switch (i7) {
            case 8:
                this.b = new q4.q[cg.b.values().length];
                break;
            case 17:
                this.b = new LinkedHashMap();
                break;
            case 20:
                this.b = new g6.d0(2);
                break;
            default:
                this.b = new CopyOnWriteArrayList();
                break;
        }
    }

    @Override // og.n
    public void c0() {
    }

    @Override // og.n
    public void H(boolean z9) {
    }

    @Override // org.telegram.messenger.lc
    public /* synthetic */ void O(ImageReceiver imageReceiver) {
    }

    @Override // og.n
    public void Z(boolean z9) {
    }

    @Override // di.m9
    public /* synthetic */ void b(boolean z9) {
    }

    @Override // org.telegram.ui.Components.r51
    public /* synthetic */ void onSeekFinished(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.r51
    public /* synthetic */ void onSeekStarted(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.r51
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // org.telegram.ui.Components.r51
    public void onError(u51 u51Var, Exception exc) {
    }

    @Override // org.telegram.messenger.lc
    public /* synthetic */ void t0(int i7, Drawable drawable) {
    }
}
