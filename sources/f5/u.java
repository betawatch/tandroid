package f5;

import a8.p0;
import ai.m0;
import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Message;
import android.os.Parcel;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import c8.s9;
import com.google.android.gms.internal.play_billing.h4;
import e2.o0;
import f3.g0;
import j$.util.DesugarCollections;
import java.net.URI;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.zr;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.m3;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.t51;
import org.telegram.ui.j9;
import org.telegram.ui.r9;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements r9, q51, h2.d, u2.u, g0 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;

    public /* synthetic */ u(int i7, Object obj, int i10) {
        this.a = i10;
        this.b = i7;
        this.c = obj;
    }

    @Override // h2.d
    public m9.y A(o0 o0Var) {
        m9.y A = ((h2.d) this.c).A(o0Var);
        if (A == null) {
            return null;
        }
        return s9.c(A, new m3(this, 13));
    }

    @Override // u2.u
    public boolean I(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // u2.u
    public int L() {
        if (((MediaCodecInfo[]) this.c) == null) {
            this.c = new MediaCodecList(this.b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.c).length;
    }

    @Override // org.telegram.ui.r9
    public void M(String str) {
        String c10 = vf.c.c(str);
        if (TextUtils.isEmpty(c10)) {
            org.telegram.messenger.g0.h3(new m0(0));
        } else {
            qp.s1(this.b).d2().a(c10, null, new ai.i((f2) this.c, 1));
        }
    }

    @Override // org.telegram.ui.r9
    public /* synthetic */ String R0() {
        return null;
    }

    @Override // h2.d
    public m9.y W(byte[] bArr) {
        return s9.c(((h2.d) this.c).W(bArr), new m3(this, 13));
    }

    @Override // u2.u
    public boolean Y() {
        return true;
    }

    public Object a() {
        Object[] objArr = (Object[]) this.c;
        int i7 = this.b;
        if (i7 <= 0) {
            return null;
        }
        int i10 = i7 - 1;
        Object obj = objArr[i10];
        kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i10] = null;
        this.b--;
        return obj;
    }

    public void b(int i7, int i10, int i11) {
        if (i11 == 0 || i7 >= i10) {
            return;
        }
        int i12 = this.b;
        if (i12 >= 3) {
            int[] iArr = (int[]) this.c;
            if (iArr[i12 - 1] == i11 && iArr[i12 - 2] == i7) {
                iArr[i12 - 2] = i10;
                return;
            }
        }
        int i13 = i12 + 3;
        int[] iArr2 = (int[]) this.c;
        if (i13 > iArr2.length) {
            this.c = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = (int[]) this.c;
        int i14 = this.b;
        int i15 = i14 + 1;
        this.b = i15;
        iArr3[i14] = i7;
        int i16 = i14 + 2;
        this.b = i16;
        iArr3[i15] = i10;
        this.b = i14 + 3;
        iArr3[i16] = i11;
    }

    public void c(long j3) {
        int i7 = this.b;
        long[] jArr = (long[]) this.c;
        if (i7 == jArr.length) {
            this.c = Arrays.copyOf(jArr, i7 * 2);
        }
        long[] jArr2 = (long[]) this.c;
        int i10 = this.b;
        this.b = i10 + 1;
        jArr2[i10] = j3;
    }

    public void d(long[] jArr) {
        int length = this.b + jArr.length;
        long[] jArr2 = (long[]) this.c;
        if (length > jArr2.length) {
            this.c = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, (long[]) this.c, this.b, jArr.length);
        this.b = length;
    }

    public int e(int i7, int i10) {
        int p10 = p();
        if (p10 < 0 || p10 > i7 || p10 * i10 * 4 > ((org.telegram.utils.twidget.i) this.c).d - this.b) {
            throw org.telegram.utils.twidget.i.a();
        }
        return p10;
    }

    @Override // u2.u
    public MediaCodecInfo f(int i7) {
        if (((MediaCodecInfo[]) this.c) == null) {
            this.c = new MediaCodecList(this.b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.c)[i7];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    public g.f g() {
        g.b bVar = (g.b) this.c;
        g.f fVar = new g.f((ContextThemeWrapper) bVar.c, this.b);
        View view = (View) bVar.h;
        g.e eVar = fVar.f;
        if (view != null) {
            eVar.r = view;
        } else {
            CharSequence charSequence = (CharSequence) bVar.f;
            if (charSequence != null) {
                eVar.d = charSequence;
                TextView textView = eVar.p;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = (Drawable) bVar.e;
            if (drawable != null) {
                eVar.n = drawable;
                ImageView imageView = eVar.o;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    eVar.o.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = (CharSequence) bVar.g;
        if (charSequence2 != null) {
            androidx.biometric.y yVar = (androidx.biometric.y) bVar.j;
            eVar.getClass();
            Message obtainMessage = yVar != null ? eVar.z.obtainMessage(-2, yVar) : null;
            eVar.j = charSequence2;
            eVar.k = obtainMessage;
        }
        if (bVar.l != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) ((LayoutInflater) bVar.d).inflate(eVar.v, (ViewGroup) null);
            int i7 = bVar.a ? eVar.w : eVar.x;
            Object obj = bVar.l;
            ?? r82 = obj;
            if (obj == null) {
                r82 = new g.d((ContextThemeWrapper) bVar.c, i7, R.id.text1, null);
            }
            eVar.s = r82;
            eVar.t = bVar.b;
            if (((DialogInterface.OnClickListener) bVar.m) != null) {
                alertController$RecycleListView.setOnItemClickListener(new g.a(bVar, eVar));
            }
            if (bVar.a) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            eVar.e = alertController$RecycleListView;
        }
        View view2 = bVar.i;
        if (view2 != null) {
            eVar.f = view2;
            eVar.g = false;
        }
        fVar.setCancelable(true);
        fVar.setCanceledOnTouchOutside(true);
        fVar.setOnCancelListener(null);
        fVar.setOnDismissListener(null);
        l.l lVar = (l.l) bVar.k;
        if (lVar != null) {
            fVar.setOnKeyListener(lVar);
        }
        return fVar;
    }

    public rc.u h(String str) {
        Matcher matcher;
        String str2;
        Matcher matcher2;
        boolean z9;
        String str3;
        int i7 = this.b;
        if (str == null) {
            throw new IllegalArgumentException("The given URI is null.");
        }
        if (i7 < 0) {
            throw new IllegalArgumentException("The given timeout value is negative.");
        }
        URI create = URI.create(str);
        if (create == null) {
            throw new IllegalArgumentException("The given URI is null.");
        }
        if (i7 < 0) {
            throw new IllegalArgumentException("The given timeout value is negative.");
        }
        String scheme = create.getScheme();
        String userInfo = create.getUserInfo();
        SecureRandom secureRandom = rc.k.a;
        String host = create.getHost();
        if (host == null) {
            String rawAuthority = create.getRawAuthority();
            host = (rawAuthority == null || (matcher = Pattern.compile("^(.*@)?([^:]+)(:\\d+)?$").matcher(rawAuthority)) == null || !matcher.matches()) ? null : matcher.group(2);
            if (host == null) {
                String uri = create.toString();
                if (uri == null || (matcher2 = Pattern.compile("^\\w+://([^@/]*@)?([^:/]+)(:\\d+)?(/.*)?$").matcher(uri)) == null || !matcher2.matches()) {
                    str2 = null;
                    int port = create.getPort();
                    String rawPath = create.getRawPath();
                    String rawQuery = create.getRawQuery();
                    if (scheme != null || scheme.length() == 0) {
                        throw new IllegalArgumentException("The scheme part is empty.");
                    }
                    if ("wss".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                        z9 = true;
                    } else {
                        if (!"ws".equalsIgnoreCase(scheme) && !"http".equalsIgnoreCase(scheme)) {
                            throw new IllegalArgumentException("Bad scheme: ".concat(scheme));
                        }
                        z9 = false;
                    }
                    if (str2 == null || str2.length() == 0) {
                        throw new IllegalArgumentException("The host part is empty.");
                    }
                    if (rawPath == null || rawPath.length() == 0) {
                        str3 = "/";
                    } else {
                        if (!rawPath.startsWith("/")) {
                            rawPath = "/".concat(rawPath);
                        }
                        str3 = rawPath;
                    }
                    int i10 = port >= 0 ? port : z9 ? 443 : 80;
                    ((w7.s) this.c).getClass();
                    rc.s sVar = new rc.s(z9 ? SSLSocketFactory.getDefault() : SocketFactory.getDefault(), new rc.a(str2, i10), i7, null, null);
                    sVar.d = 1;
                    sVar.e = qs.Z3;
                    sVar.f = true;
                    if (port >= 0) {
                        str2 = str2 + ":" + port;
                    }
                    if (rawQuery != null) {
                        str3 = p0.D(str3, "?", rawQuery);
                    }
                    return new rc.u(z9, userInfo, str2, str3, sVar);
                }
                host = matcher2.group(2);
            }
        }
        str2 = host;
        int port2 = create.getPort();
        String rawPath2 = create.getRawPath();
        String rawQuery2 = create.getRawQuery();
        if (scheme != null) {
        }
        throw new IllegalArgumentException("The scheme part is empty.");
    }

    @Override // org.telegram.ui.r9
    public /* synthetic */ boolean h1(String str, j9 j9Var) {
        return false;
    }

    public void i(int i7) {
        ByteBuffer allocate = ByteBuffer.allocate(i7);
        int position = ((ByteBuffer) this.c).position();
        ((ByteBuffer) this.c).position(0);
        allocate.put((ByteBuffer) this.c);
        allocate.position(position);
        this.c = allocate;
    }

    public float j() {
        float intBitsToFloat = Float.intBitsToFloat(p());
        if (Float.isNaN(intBitsToFloat) || Float.isInfinite(intBitsToFloat)) {
            return 0.0f;
        }
        return intBitsToFloat;
    }

    public void k(int i7, float[] fArr) {
        for (int i10 = 0; i10 < i7; i10++) {
            fArr[i10] = j();
        }
    }

    public byte l(int i7) {
        if (i7 < 0 || this.b <= i7) {
            throw new IndexOutOfBoundsException(String.format("Bad index: index=%d, length=%d", Integer.valueOf(i7), Integer.valueOf(this.b)));
        }
        return ((ByteBuffer) this.c).get(i7);
    }

    public long m(int i7) {
        if (i7 >= 0 && i7 < this.b) {
            return ((long[]) this.c)[i7];
        }
        StringBuilder n10 = jg.g.n(i7, "Invalid index ", ", size is ");
        n10.append(this.b);
        throw new IndexOutOfBoundsException(n10.toString());
    }

    public boolean n(int i7) {
        return ((1 << (i7 % 8)) & l(i7 / 8)) != 0;
    }

    public synchronized List o() {
        return DesugarCollections.unmodifiableList(new ArrayList((ArrayList) this.c));
    }

    @Override // org.telegram.ui.Components.q51
    public /* synthetic */ void onRenderedFirstFrame(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.q51
    public void onStateChanged(boolean z9, int i7) {
        org.telegram.messenger.g0.h3(new jg.r(this, this.b, i7, 3));
    }

    @Override // org.telegram.ui.Components.q51
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    public int p() {
        int i7 = this.b;
        int i10 = i7 + 4;
        org.telegram.utils.twidget.i iVar = (org.telegram.utils.twidget.i) this.c;
        if (i10 > iVar.d) {
            throw org.telegram.utils.twidget.i.a();
        }
        int i11 = iVar.a.getInt(i7);
        this.b += 4;
        return i11;
    }

    public void q(int i7) {
        int capacity = ((ByteBuffer) this.c).capacity();
        int i10 = this.b;
        if (capacity < i10 + 1) {
            i(i10 + 1024);
        }
        ((ByteBuffer) this.c).put((byte) i7);
        this.b++;
    }

    public void r(byte[] bArr) {
        int capacity = ((ByteBuffer) this.c).capacity();
        int i7 = this.b;
        if (capacity < bArr.length + i7) {
            i(i7 + bArr.length + 1024);
        }
        ((ByteBuffer) this.c).put(bArr);
        this.b += bArr.length;
    }

    public int s(int[] iArr, int i7) {
        int i10 = iArr[0];
        int i11 = 1;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i7) {
            if (n(i10 + i12)) {
                i13 += i11;
            }
            i12++;
            i11 *= 2;
        }
        iArr[0] = iArr[0] + i7;
        return i13;
    }

    @Override // u2.u
    public boolean t(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    public String toString() {
        switch (this.a) {
            case 20:
                l9.a aVar = (l9.a) this.c;
                ArrayList arrayList = new ArrayList(aVar.b);
                for (int i7 = 0; i7 < aVar.b; i7++) {
                    arrayList.add(h2.m0.e0(aVar.b(i7)));
                }
                return "UnsupportedBrands{major=" + h2.m0.e0(this.b) + ", compatible=" + arrayList + "}";
            default:
                return super.toString();
        }
    }

    public long u(f3.l lVar) {
        h2.x xVar = (h2.x) this.c;
        int i7 = 0;
        lVar.k(xVar.a, 0, 1, false);
        int i10 = xVar.a[0] & 255;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int i11 = 128;
        int i12 = 0;
        while ((i10 & i11) == 0) {
            i11 >>= 1;
            i12++;
        }
        int i13 = i10 & (~i11);
        lVar.k(xVar.a, 1, i12, false);
        while (i7 < i12) {
            i7++;
            i13 = (xVar.a[i7] & 255) + (i13 << 8);
        }
        this.b = i12 + 1 + this.b;
        return i13;
    }

    public void v(Object instance) {
        Object[] objArr = (Object[]) this.c;
        kotlin.jvm.internal.j.e(instance, "instance");
        int i7 = this.b;
        for (int i10 = 0; i10 < i7; i10++) {
            if (objArr[i10] == instance) {
                throw new IllegalStateException("Already in the pool!");
            }
        }
        int i11 = this.b;
        if (i11 < objArr.length) {
            objArr[i11] = instance;
            this.b = i11 + 1;
        }
    }

    public byte[] w(int i7, int i10) {
        int i11 = i10 - i7;
        if (i11 < 0 || i7 < 0 || this.b < i10) {
            throw new IllegalArgumentException(String.format("Bad range: beginIndex=%d, endIndex=%d, length=%d", Integer.valueOf(i7), Integer.valueOf(i10), Integer.valueOf(this.b)));
        }
        byte[] bArr = new byte[i11];
        if (i11 != 0) {
            System.arraycopy(((ByteBuffer) this.c).array(), i7, bArr, 0, i11);
        }
        return bArr;
    }

    public String x(h4 h4Var) {
        w wVar = (w) this.c;
        int i7 = this.b;
        try {
            if (wVar.E == null) {
                throw null;
            }
            com.google.android.gms.internal.play_billing.g gVar = wVar.E;
            String packageName = wVar.C.getPackageName();
            String str = i7 != 2 ? i7 != 3 ? i7 != 4 ? i7 != 5 ? i7 != 6 ? "QUERY_PRODUCT_DETAILS_ASYNC" : "START_CONNECTION" : "IS_FEATURE_SUPPORTED" : "CONSUME_ASYNC" : "ACKNOWLEDGE_PURCHASE" : "LAUNCH_BILLING_FLOW";
            v vVar = new v(h4Var);
            com.google.android.gms.internal.play_billing.e eVar = (com.google.android.gms.internal.play_billing.e) gVar;
            Parcel v12 = eVar.v1();
            v12.writeString(packageName);
            v12.writeString(str);
            int i10 = com.google.android.gms.internal.play_billing.d.a;
            v12.writeStrongBinder(vVar);
            try {
                eVar.b.transact(1, v12, null, 1);
                v12.recycle();
                return "billingOverrideService.getBillingOverride";
            } catch (Throwable th2) {
                v12.recycle();
                throw th2;
            }
        } catch (Exception e10) {
            wVar.F(95, 28, z.p);
            com.google.android.gms.internal.play_billing.u.i("BillingClientTesting", "An error occurred while retrieving billing override.", e10);
            h4Var.a(0);
            return "billingOverrideService.getBillingOverride";
        }
    }

    public /* synthetic */ u(int i7, boolean z9, boolean z10) {
        this.a = i7;
    }

    @Override // org.telegram.ui.Components.q51
    public void onRenderedFirstFrame() {
    }

    public /* synthetic */ u(Object obj, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
    }

    public u(int i7, short s5) {
        this.a = i7;
        switch (i7) {
            case 6:
                this.b = 0;
                this.c = new StringBuilder();
                break;
            case 16:
                this.c = new w7.s(22);
                break;
            case 18:
                this.c = new h2.x(8);
                break;
            default:
                this.c = new ArrayList();
                this.b = 128;
                break;
        }
    }

    public u(int i7, int i10) {
        this.a = i10;
        switch (i10) {
            case 13:
                if (i7 > 0) {
                    this.c = new Object[i7];
                    return;
                }
                throw new IllegalArgumentException("The max pool size must be > 0");
            case 14:
                this.c = ByteBuffer.allocate(i7);
                this.b = 0;
                return;
            case 15:
                this.c = new CountDownLatch(1);
                this.b = i7;
                return;
            default:
                this.c = new long[i7];
                return;
        }
    }

    @Override // org.telegram.ui.r9
    public /* synthetic */ void onDismiss() {
    }

    public u(int[] iArr, int i7) {
        l9.a aVar;
        this.a = 20;
        this.b = i7;
        if (iArr != null) {
            l9.a aVar2 = l9.a.c;
            aVar = iArr.length == 0 ? l9.a.c : new l9.a(Arrays.copyOf(iArr, iArr.length));
        } else {
            aVar = l9.a.c;
        }
        this.c = aVar;
    }

    @Override // org.telegram.ui.r9
    public /* synthetic */ void V0(zr zrVar) {
    }

    @Override // org.telegram.ui.Components.q51
    public /* synthetic */ void onSeekFinished(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.q51
    public /* synthetic */ void onSeekStarted(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.q51
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public u(org.telegram.utils.twidget.i iVar) {
        this.a = 11;
        this.c = iVar;
        this.b = 20;
    }

    public u(Context context) {
        this.a = 4;
        int e10 = g.f.e(context, 0);
        this.c = new g.b(new ContextThemeWrapper(context, g.f.e(context, e10)));
        this.b = e10;
    }

    public u(boolean z9, boolean z10, boolean z11) {
        this.a = 17;
        this.b = (z9 || z10 || z11) ? 1 : 0;
    }

    @Override // org.telegram.ui.Components.q51
    public void onError(t51 t51Var, Exception exc) {
    }

    @Override // org.telegram.ui.Components.q51
    public void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
    }
}
