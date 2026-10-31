package c5;

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
import b2.s0;
import c3.f0;
import com.google.android.gms.internal.play_billing.h4;
import e2.l0;
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
import org.telegram.messenger.i0;
import org.telegram.messenger.is;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.voip.m0;
import org.telegram.ui.k9;
import org.telegram.ui.t9;
import ph.h1;
import v7.p8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements e2.d, s61, t9, r2.u, f0 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;

    public /* synthetic */ x(int i10, Object obj, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = obj;
    }

    @Override // org.telegram.ui.t9
    public void L(String str) {
        String b10 = gf.f.b(str);
        if (TextUtils.isEmpty(b10)) {
            i0.g3(new m0(29));
        } else {
            vp.r1(this.b).c2().a(b10, null, new h1((k2) this.c, 5));
        }
    }

    @Override // org.telegram.ui.t9
    public /* synthetic */ String P0() {
        return null;
    }

    @Override // r2.u
    public boolean T0(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // r2.u
    public boolean V(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // r2.u
    public int V0() {
        if (((MediaCodecInfo[]) this.c) == null) {
            this.c = new MediaCodecList(this.b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.c).length;
    }

    @Override // e2.d
    public j9.y a(s0 s0Var) {
        j9.y a2 = ((e2.d) this.c).a(s0Var);
        if (a2 == null) {
            return null;
        }
        return p8.c(a2, new ig.c0(this, 26));
    }

    public Object b() {
        Object[] objArr = (Object[]) this.c;
        int i10 = this.b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object obj = objArr[i11];
        kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i11] = null;
        this.b--;
        return obj;
    }

    public void c(int i10, int i11, int i12) {
        if (i12 == 0 || i10 >= i11) {
            return;
        }
        int i13 = this.b;
        if (i13 >= 3) {
            int[] iArr = (int[]) this.c;
            if (iArr[i13 - 1] == i12 && iArr[i13 - 2] == i10) {
                iArr[i13 - 2] = i11;
                return;
            }
        }
        int i14 = i13 + 3;
        int[] iArr2 = (int[]) this.c;
        if (i14 > iArr2.length) {
            this.c = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = (int[]) this.c;
        int i15 = this.b;
        int i16 = i15 + 1;
        this.b = i16;
        iArr3[i15] = i10;
        int i17 = i15 + 2;
        this.b = i17;
        iArr3[i16] = i11;
        this.b = i15 + 3;
        iArr3[i17] = i12;
    }

    @Override // r2.u
    public MediaCodecInfo d(int i10) {
        if (((MediaCodecInfo[]) this.c) == null) {
            this.c = new MediaCodecList(this.b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.c)[i10];
    }

    public void e(long j10) {
        int i10 = this.b;
        long[] jArr = (long[]) this.c;
        if (i10 == jArr.length) {
            this.c = Arrays.copyOf(jArr, i10 * 2);
        }
        long[] jArr2 = (long[]) this.c;
        int i11 = this.b;
        this.b = i11 + 1;
        jArr2[i11] = j10;
    }

    public void f(long[] jArr) {
        int length = this.b + jArr.length;
        long[] jArr2 = (long[]) this.c;
        if (length > jArr2.length) {
            this.c = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, (long[]) this.c, this.b, jArr.length);
        this.b = length;
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
            androidx.biometric.x xVar = (androidx.biometric.x) bVar.j;
            eVar.getClass();
            Message obtainMessage = xVar != null ? eVar.z.obtainMessage(-2, xVar) : null;
            eVar.j = charSequence2;
            eVar.k = obtainMessage;
        }
        if (bVar.l != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) ((LayoutInflater) bVar.d).inflate(eVar.v, (ViewGroup) null);
            int i10 = bVar.a ? eVar.w : eVar.x;
            Object obj = bVar.l;
            ?? r82 = obj;
            if (obj == null) {
                r82 = new g.d((ContextThemeWrapper) bVar.c, i10, R.id.text1, null);
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
        l.m mVar = (l.m) bVar.k;
        if (mVar != null) {
            fVar.setOnKeyListener(mVar);
        }
        return fVar;
    }

    public lc.v h(String str) {
        Matcher matcher;
        String str2;
        Matcher matcher2;
        boolean z10;
        String str3;
        int i10 = this.b;
        if (str == null) {
            throw new IllegalArgumentException("The given URI is null.");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("The given timeout value is negative.");
        }
        URI create = URI.create(str);
        if (create == null) {
            throw new IllegalArgumentException("The given URI is null.");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("The given timeout value is negative.");
        }
        String scheme = create.getScheme();
        String userInfo = create.getUserInfo();
        SecureRandom secureRandom = lc.k.a;
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
                        z10 = true;
                    } else {
                        if (!"ws".equalsIgnoreCase(scheme) && !"http".equalsIgnoreCase(scheme)) {
                            throw new IllegalArgumentException("Bad scheme: ".concat(scheme));
                        }
                        z10 = false;
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
                    int i11 = port >= 0 ? port : z10 ? 443 : 80;
                    ((hb.a) this.c).getClass();
                    lc.t tVar = new lc.t(z10 ? SSLSocketFactory.getDefault() : SocketFactory.getDefault(), new lc.a(str2, i11), i10, null, null);
                    tVar.d = 1;
                    tVar.e = zs.Z3;
                    tVar.f = true;
                    if (port >= 0) {
                        str2 = str2 + ":" + port;
                    }
                    if (rawQuery != null) {
                        str3 = a1.g.C(str3, "?", rawQuery);
                    }
                    return new lc.v(z10, userInfo, str2, str3, tVar);
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

    public void i(int i10) {
        ByteBuffer allocate = ByteBuffer.allocate(i10);
        int position = ((ByteBuffer) this.c).position();
        ((ByteBuffer) this.c).position(0);
        allocate.put((ByteBuffer) this.c);
        allocate.position(position);
        this.c = allocate;
    }

    @Override // org.telegram.ui.t9
    public /* synthetic */ boolean i1(String str, k9 k9Var) {
        return false;
    }

    public byte j(int i10) {
        if (i10 < 0 || this.b <= i10) {
            throw new IndexOutOfBoundsException(String.format("Bad index: index=%d, length=%d", Integer.valueOf(i10), Integer.valueOf(this.b)));
        }
        return ((ByteBuffer) this.c).get(i10);
    }

    public long k(int i10) {
        if (i10 >= 0 && i10 < this.b) {
            return ((long[]) this.c)[i10];
        }
        StringBuilder l4 = i0.a.l(i10, "Invalid index ", ", size is ");
        l4.append(this.b);
        throw new IndexOutOfBoundsException(l4.toString());
    }

    public boolean l(int i10) {
        return ((1 << (i10 % 8)) & j(i10 / 8)) != 0;
    }

    public synchronized List m() {
        return DesugarCollections.unmodifiableList(new ArrayList((ArrayList) this.c));
    }

    public void n(int i10) {
        int capacity = ((ByteBuffer) this.c).capacity();
        int i11 = this.b;
        if (capacity < i11 + 1) {
            i(i11 + 1024);
        }
        ((ByteBuffer) this.c).put((byte) i10);
        this.b++;
    }

    public void o(byte[] bArr) {
        int capacity = ((ByteBuffer) this.c).capacity();
        int i10 = this.b;
        if (capacity < bArr.length + i10) {
            i(i10 + bArr.length + 1024);
        }
        ((ByteBuffer) this.c).put(bArr);
        this.b += bArr.length;
    }

    @Override // r2.u
    public boolean o1() {
        return true;
    }

    @Override // org.telegram.ui.Components.s61
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.s61
    public void onStateChanged(boolean z10, int i10) {
        i0.g3(new i2.u(this, this.b, i10, 2));
    }

    @Override // org.telegram.ui.Components.s61
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    public int p(int[] iArr, int i10) {
        int i11 = iArr[0];
        int i12 = 1;
        int i13 = 0;
        int i14 = 0;
        while (i13 < i10) {
            if (l(i11 + i13)) {
                i14 += i12;
            }
            i13++;
            i12 *= 2;
        }
        iArr[0] = iArr[0] + i10;
        return i14;
    }

    public long q(c3.l lVar) {
        e2.x xVar = (e2.x) this.c;
        int i10 = 0;
        lVar.j(xVar.a, 0, 1, false);
        int i11 = xVar.a[0] & 255;
        if (i11 == 0) {
            return Long.MIN_VALUE;
        }
        int i12 = 128;
        int i13 = 0;
        while ((i11 & i12) == 0) {
            i12 >>= 1;
            i13++;
        }
        int i14 = i11 & (~i12);
        lVar.j(xVar.a, 1, i13, false);
        while (i10 < i13) {
            i10++;
            i14 = (xVar.a[i10] & 255) + (i14 << 8);
        }
        this.b = i13 + 1 + this.b;
        return i14;
    }

    public void r(Object instance) {
        Object[] objArr = (Object[]) this.c;
        kotlin.jvm.internal.i.e(instance, "instance");
        int i10 = this.b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (objArr[i11] == instance) {
                throw new IllegalStateException("Already in the pool!");
            }
        }
        int i12 = this.b;
        if (i12 < objArr.length) {
            objArr[i12] = instance;
            this.b = i12 + 1;
        }
    }

    public byte[] s(int i10, int i11) {
        int i12 = i11 - i10;
        if (i12 < 0 || i10 < 0 || this.b < i11) {
            throw new IllegalArgumentException(String.format("Bad range: beginIndex=%d, endIndex=%d, length=%d", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(this.b)));
        }
        byte[] bArr = new byte[i12];
        if (i12 != 0) {
            System.arraycopy(((ByteBuffer) this.c).array(), i10, bArr, 0, i12);
        }
        return bArr;
    }

    public String t(h4 h4Var) {
        z zVar = (z) this.c;
        int i10 = this.b;
        try {
            if (zVar.E == null) {
                throw null;
            }
            com.google.android.gms.internal.play_billing.g gVar = zVar.E;
            String packageName = zVar.C.getPackageName();
            String str = i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? i10 != 6 ? "QUERY_PRODUCT_DETAILS_ASYNC" : "START_CONNECTION" : "IS_FEATURE_SUPPORTED" : "CONSUME_ASYNC" : "ACKNOWLEDGE_PURCHASE" : "LAUNCH_BILLING_FLOW";
            y yVar = new y(h4Var);
            com.google.android.gms.internal.play_billing.e eVar = (com.google.android.gms.internal.play_billing.e) gVar;
            Parcel V0 = eVar.V0();
            V0.writeString(packageName);
            V0.writeString(str);
            int i11 = com.google.android.gms.internal.play_billing.d.a;
            V0.writeStrongBinder(yVar);
            try {
                eVar.b.transact(1, V0, null, 1);
                V0.recycle();
                return "billingOverrideService.getBillingOverride";
            } catch (Throwable th2) {
                V0.recycle();
                throw th2;
            }
        } catch (Exception e) {
            zVar.F(95, 28, c0.p);
            com.google.android.gms.internal.play_billing.u.i("BillingClientTesting", "An error occurred while retrieving billing override.", e);
            h4Var.a(0);
            return "billingOverrideService.getBillingOverride";
        }
    }

    public String toString() {
        switch (this.a) {
            case 6:
                return new String((char[]) this.c, 0, this.b);
            case 19:
                i9.a aVar = (i9.a) this.c;
                ArrayList arrayList = new ArrayList(aVar.b);
                for (int i10 = 0; i10 < aVar.b; i10++) {
                    arrayList.add(l0.e0(aVar.b(i10)));
                }
                return "UnsupportedBrands{major=" + l0.e0(this.b) + ", compatible=" + arrayList + "}";
            default:
                return super.toString();
        }
    }

    @Override // e2.d
    public j9.y w(byte[] bArr) {
        return p8.c(((e2.d) this.c).w(bArr), new ig.c0(this, 26));
    }

    public /* synthetic */ x(int i10, boolean z10, boolean z11) {
        this.a = i10;
    }

    @Override // org.telegram.ui.Components.s61
    public void onRenderedFirstFrame() {
    }

    public /* synthetic */ x(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    public x(k6.a aVar, int i10) {
        this.a = 2;
        n6.l.g(aVar);
        this.c = aVar;
        this.b = i10;
    }

    public x(int i10, int i11) {
        this.a = i11;
        switch (i11) {
            case 7:
                this.c = ByteBuffer.allocate(i10);
                this.b = 0;
                return;
            case 8:
                this.c = new CountDownLatch(1);
                this.b = i10;
                return;
            case 14:
                if (i10 > 0) {
                    this.c = new Object[i10];
                    return;
                }
                throw new IllegalArgumentException("The max pool size must be > 0");
            default:
                this.c = new long[i10];
                return;
        }
    }

    public x(int[] iArr, int i10) {
        i9.a aVar;
        this.a = 19;
        this.b = i10;
        if (iArr != null) {
            i9.a aVar2 = i9.a.c;
            aVar = iArr.length == 0 ? i9.a.c : new i9.a(Arrays.copyOf(iArr, iArr.length));
        } else {
            aVar = i9.a.c;
        }
        this.c = aVar;
    }

    public x(int i10, short s10) {
        this.a = i10;
        switch (i10) {
            case 17:
                this.b = 0;
                this.c = new StringBuilder();
                break;
            case 18:
                this.c = new e2.x(8);
                break;
            case 19:
            case 20:
            default:
                this.c = new hb.a();
                break;
            case 21:
                this.c = new ArrayList();
                this.b = 128;
                break;
        }
    }

    @Override // org.telegram.ui.t9
    public /* synthetic */ void onDismiss() {
    }

    @Override // org.telegram.ui.t9
    public /* synthetic */ void X0(is isVar) {
    }

    @Override // org.telegram.ui.Components.s61
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.s61
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.s61
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public x(Context context) {
        this.a = 5;
        int e = g.f.e(context, 0);
        this.c = new g.b(new ContextThemeWrapper(context, g.f.e(context, e)));
        this.b = e;
    }

    public x(boolean z10, boolean z11, boolean z12) {
        this.a = 16;
        this.b = (z10 || z11 || z12) ? 1 : 0;
    }

    @Override // org.telegram.ui.Components.s61
    public void onError(u61 u61Var, Exception exc) {
    }

    @Override // org.telegram.ui.Components.s61
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
