package e5;

import ai.v2;
import ai.y1;
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
import b8.yd;
import com.google.android.gms.internal.play_billing.h4;
import d2.q0;
import e3.f0;
import g2.n0;
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
import k2.p1;
import org.telegram.messenger.g0;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.rr;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.m51;
import org.telegram.ui.i9;
import org.telegram.ui.r9;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements r9, g2.e, k51, t2.u, f0 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;

    public /* synthetic */ u(int i3, Object obj, int i10) {
        this.a = i10;
        this.b = i3;
        this.c = obj;
    }

    @Override // t2.u
    public boolean B1(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // t2.u
    public int D1() {
        if (((MediaCodecInfo[]) this.c) == null) {
            this.c = new MediaCodecList(this.b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.c).length;
    }

    @Override // g2.e
    public l9.y L(q0 q0Var) {
        l9.y L = ((g2.e) this.c).L(q0Var);
        if (L == null) {
            return null;
        }
        return yd.c(L, new l5.b(this, 22));
    }

    @Override // org.telegram.ui.r9
    public void M(String str) {
        String c2 = sf.c.c(str);
        if (TextUtils.isEmpty(c2)) {
            g0.h3(new y1(1));
        } else {
            hp.s1(this.b).d2().a(c2, null, new v2((d2) this.c, 5));
        }
    }

    @Override // org.telegram.ui.r9
    public /* synthetic */ String M0() {
        return null;
    }

    @Override // t2.u
    public boolean Y(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    public Object a() {
        Object[] objArr = (Object[]) this.c;
        int i3 = this.b;
        if (i3 <= 0) {
            return null;
        }
        int i10 = i3 - 1;
        Object obj = objArr[i10];
        kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i10] = null;
        this.b--;
        return obj;
    }

    public void b(int i3, int i10, int i11) {
        if (i11 == 0 || i3 >= i10) {
            return;
        }
        int i12 = this.b;
        if (i12 >= 3) {
            int[] iArr = (int[]) this.c;
            if (iArr[i12 - 1] == i11 && iArr[i12 - 2] == i3) {
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
        iArr3[i14] = i3;
        int i16 = i14 + 2;
        this.b = i16;
        iArr3[i15] = i10;
        this.b = i14 + 3;
        iArr3[i16] = i11;
    }

    public void c(long j10) {
        int i3 = this.b;
        long[] jArr = (long[]) this.c;
        if (i3 == jArr.length) {
            this.c = Arrays.copyOf(jArr, i3 * 2);
        }
        long[] jArr2 = (long[]) this.c;
        int i10 = this.b;
        this.b = i10 + 1;
        jArr2[i10] = j10;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    public g.f e() {
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
            int i3 = bVar.a ? eVar.w : eVar.x;
            Object obj = bVar.l;
            ?? r82 = obj;
            if (obj == null) {
                r82 = new g.d((ContextThemeWrapper) bVar.c, i3, R.id.text1, null);
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

    @Override // org.telegram.ui.r9
    public /* synthetic */ boolean e1(String str, i9 i9Var) {
        return false;
    }

    public oc.u f(String str) {
        Matcher matcher;
        String str2;
        Matcher matcher2;
        boolean z10;
        String str3;
        int i3 = this.b;
        if (str == null) {
            throw new IllegalArgumentException("The given URI is null.");
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("The given timeout value is negative.");
        }
        URI create = URI.create(str);
        if (create == null) {
            throw new IllegalArgumentException("The given URI is null.");
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("The given timeout value is negative.");
        }
        String scheme = create.getScheme();
        String userInfo = create.getUserInfo();
        SecureRandom secureRandom = oc.k.a;
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
                    int i10 = port >= 0 ? port : z10 ? 443 : 80;
                    ((nb.a) this.c).getClass();
                    oc.s sVar = new oc.s(z10 ? SSLSocketFactory.getDefault() : SocketFactory.getDefault(), new oc.a(str2, i10), i3, null, null);
                    sVar.d = 1;
                    sVar.e = hs.Z3;
                    sVar.f = true;
                    if (port >= 0) {
                        str2 = str2 + ":" + port;
                    }
                    if (rawQuery != null) {
                        str3 = a1.g.C(str3, "?", rawQuery);
                    }
                    return new oc.u(z10, userInfo, str2, str3, sVar);
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

    public void g(int i3) {
        ByteBuffer allocate = ByteBuffer.allocate(i3);
        int position = ((ByteBuffer) this.c).position();
        ((ByteBuffer) this.c).position(0);
        allocate.put((ByteBuffer) this.c);
        allocate.position(position);
        this.c = allocate;
    }

    @Override // t2.u
    public MediaCodecInfo h(int i3) {
        if (((MediaCodecInfo[]) this.c) == null) {
            this.c = new MediaCodecList(this.b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.c)[i3];
    }

    public byte i(int i3) {
        if (i3 < 0 || this.b <= i3) {
            throw new IndexOutOfBoundsException(String.format("Bad index: index=%d, length=%d", Integer.valueOf(i3), Integer.valueOf(this.b)));
        }
        return ((ByteBuffer) this.c).get(i3);
    }

    public long j(int i3) {
        if (i3 >= 0 && i3 < this.b) {
            return ((long[]) this.c)[i3];
        }
        StringBuilder m10 = p1.m(i3, "Invalid index ", ", size is ");
        m10.append(this.b);
        throw new IndexOutOfBoundsException(m10.toString());
    }

    public boolean k(int i3) {
        return ((1 << (i3 % 8)) & i(i3 / 8)) != 0;
    }

    @Override // t2.u
    public boolean k2() {
        return true;
    }

    public synchronized List l() {
        return DesugarCollections.unmodifiableList(new ArrayList((ArrayList) this.c));
    }

    public void m(int i3) {
        int capacity = ((ByteBuffer) this.c).capacity();
        int i10 = this.b;
        if (capacity < i10 + 1) {
            g(i10 + 1024);
        }
        ((ByteBuffer) this.c).put((byte) i3);
        this.b++;
    }

    public void n(byte[] bArr) {
        int capacity = ((ByteBuffer) this.c).capacity();
        int i3 = this.b;
        if (capacity < bArr.length + i3) {
            g(i3 + bArr.length + 1024);
        }
        ((ByteBuffer) this.c).put(bArr);
        this.b += bArr.length;
    }

    public int o(int[] iArr, int i3) {
        int i10 = iArr[0];
        int i11 = 1;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i3) {
            if (k(i10 + i12)) {
                i13 += i11;
            }
            i12++;
            i11 *= 2;
        }
        iArr[0] = iArr[0] + i3;
        return i13;
    }

    @Override // org.telegram.ui.Components.k51
    public /* synthetic */ void onRenderedFirstFrame(l2.a aVar) {
    }

    @Override // org.telegram.ui.Components.k51
    public void onStateChanged(boolean z10, int i3) {
        g0.h3(new k2.u(this, this.b, i3, 3));
    }

    @Override // org.telegram.ui.Components.k51
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    public long p(e3.l lVar) {
        g2.y yVar = (g2.y) this.c;
        int i3 = 0;
        lVar.h(yVar.a, 0, 1, false);
        int i10 = yVar.a[0] & 255;
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
        lVar.h(yVar.a, 1, i12, false);
        while (i3 < i12) {
            i3++;
            i13 = (yVar.a[i3] & 255) + (i13 << 8);
        }
        this.b = i12 + 1 + this.b;
        return i13;
    }

    public void q(Object instance) {
        Object[] objArr = (Object[]) this.c;
        kotlin.jvm.internal.j.e(instance, "instance");
        int i3 = this.b;
        for (int i10 = 0; i10 < i3; i10++) {
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

    public byte[] r(int i3, int i10) {
        int i11 = i10 - i3;
        if (i11 < 0 || i3 < 0 || this.b < i10) {
            throw new IllegalArgumentException(String.format("Bad range: beginIndex=%d, endIndex=%d, length=%d", Integer.valueOf(i3), Integer.valueOf(i10), Integer.valueOf(this.b)));
        }
        byte[] bArr = new byte[i11];
        if (i11 != 0) {
            System.arraycopy(((ByteBuffer) this.c).array(), i3, bArr, 0, i11);
        }
        return bArr;
    }

    public String s(h4 h4Var) {
        w wVar = (w) this.c;
        int i3 = this.b;
        try {
            if (wVar.E == null) {
                throw null;
            }
            com.google.android.gms.internal.play_billing.g gVar = wVar.E;
            String packageName = wVar.C.getPackageName();
            String str = i3 != 2 ? i3 != 3 ? i3 != 4 ? i3 != 5 ? i3 != 6 ? "QUERY_PRODUCT_DETAILS_ASYNC" : "START_CONNECTION" : "IS_FEATURE_SUPPORTED" : "CONSUME_ASYNC" : "ACKNOWLEDGE_PURCHASE" : "LAUNCH_BILLING_FLOW";
            v vVar = new v(h4Var);
            com.google.android.gms.internal.play_billing.e eVar = (com.google.android.gms.internal.play_billing.e) gVar;
            Parcel V0 = eVar.V0();
            V0.writeString(packageName);
            V0.writeString(str);
            int i10 = com.google.android.gms.internal.play_billing.d.a;
            V0.writeStrongBinder(vVar);
            try {
                eVar.b.transact(1, V0, null, 1);
                V0.recycle();
                return "billingOverrideService.getBillingOverride";
            } catch (Throwable th2) {
                V0.recycle();
                throw th2;
            }
        } catch (Exception e10) {
            wVar.F(95, 28, z.p);
            com.google.android.gms.internal.play_billing.u.i("BillingClientTesting", "An error occurred while retrieving billing override.", e10);
            h4Var.a(0);
            return "billingOverrideService.getBillingOverride";
        }
    }

    public String toString() {
        switch (this.a) {
            case 18:
                k9.a aVar = (k9.a) this.c;
                ArrayList arrayList = new ArrayList(aVar.b);
                for (int i3 = 0; i3 < aVar.b; i3++) {
                    arrayList.add(n0.e0(aVar.b(i3)));
                }
                return "UnsupportedBrands{major=" + n0.e0(this.b) + ", compatible=" + arrayList + "}";
            default:
                return super.toString();
        }
    }

    @Override // g2.e
    public l9.y u(byte[] bArr) {
        return yd.c(((g2.e) this.c).u(bArr), new l5.b(this, 22));
    }

    public /* synthetic */ u(int i3, boolean z10, boolean z11) {
        this.a = i3;
    }

    @Override // org.telegram.ui.Components.k51
    public void onRenderedFirstFrame() {
    }

    public /* synthetic */ u(Object obj, int i3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i3;
    }

    public u(int i3, short s6) {
        this.a = i3;
        switch (i3) {
            case 5:
                this.b = 0;
                this.c = new StringBuilder();
                break;
            case 11:
                this.c = new nb.a();
                break;
            case 17:
                this.c = new g2.y(8);
                break;
            default:
                this.c = new ArrayList();
                this.b = 128;
                break;
        }
    }

    public u(int i3, int i10) {
        this.a = i10;
        switch (i10) {
            case 9:
                this.c = ByteBuffer.allocate(i3);
                this.b = 0;
                return;
            case 10:
                this.c = new CountDownLatch(1);
                this.b = i3;
                return;
            case 15:
                if (i3 > 0) {
                    this.c = new Object[i3];
                    return;
                }
                throw new IllegalArgumentException("The max pool size must be > 0");
            default:
                this.c = new long[i3];
                return;
        }
    }

    @Override // org.telegram.ui.r9
    public /* synthetic */ void onDismiss() {
    }

    public u(int[] iArr, int i3) {
        k9.a aVar;
        this.a = 18;
        this.b = i3;
        if (iArr != null) {
            k9.a aVar2 = k9.a.c;
            aVar = iArr.length == 0 ? k9.a.c : new k9.a(Arrays.copyOf(iArr, iArr.length));
        } else {
            aVar = k9.a.c;
        }
        this.c = aVar;
    }

    @Override // org.telegram.ui.r9
    public /* synthetic */ void V0(rr rrVar) {
    }

    @Override // org.telegram.ui.Components.k51
    public /* synthetic */ void onSeekFinished(l2.a aVar) {
    }

    @Override // org.telegram.ui.Components.k51
    public /* synthetic */ void onSeekStarted(l2.a aVar) {
    }

    @Override // org.telegram.ui.Components.k51
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public u(Context context) {
        this.a = 6;
        int e10 = g.f.e(context, 0);
        this.c = new g.b(new ContextThemeWrapper(context, g.f.e(context, e10)));
        this.b = e10;
    }

    public u(boolean z10, boolean z11, boolean z12) {
        this.a = 16;
        this.b = (z10 || z11 || z12) ? 1 : 0;
    }

    @Override // org.telegram.ui.Components.k51
    public void onError(m51 m51Var, Exception exc) {
    }

    @Override // org.telegram.ui.Components.k51
    public void onVideoSizeChanged(int i3, int i10, int i11, float f10) {
    }
}
