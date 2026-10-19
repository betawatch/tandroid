package c5;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Message;
import android.os.Parcel;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import b2.r0;
import b2.u0;
import com.google.android.gms.internal.play_billing.i4;
import e2.m0;
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
import org.telegram.messenger.MediaDataController;
import v7.q8;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements e2.d, r2.u, c3.g0 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;

    public /* synthetic */ c0(int i10, boolean z10, boolean z11) {
        this.a = i10;
    }

    @Override // r2.u
    public MediaCodecInfo a(int i10) {
        if (((MediaCodecInfo[]) this.c) == null) {
            this.c = new MediaCodecList(this.b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.c)[i10];
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

    public void d(long j10) {
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

    public void e(long[] jArr) {
        int length = this.b + jArr.length;
        long[] jArr2 = (long[]) this.c;
        if (length > jArr2.length) {
            this.c = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, (long[]) this.c, this.b, jArr.length);
        this.b = length;
    }

    @Override // r2.u
    public boolean f(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // e2.d
    public j9.y g(r0 r0Var) {
        j9.y g10 = ((e2.d) this.c).g(r0Var);
        if (g10 == null) {
            return null;
        }
        return q8.c(g10, new j5.b(this, 18));
    }

    @Override // r2.u
    public boolean h(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    public g.f i() {
        g.b bVar = (g.b) this.c;
        g.f fVar = new g.f(bVar.a, this.b);
        View view = bVar.e;
        g.e eVar = fVar.f;
        if (view != null) {
            eVar.r = view;
        } else {
            CharSequence charSequence = bVar.d;
            if (charSequence != null) {
                eVar.d = charSequence;
                TextView textView = eVar.p;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = bVar.c;
            if (drawable != null) {
                eVar.n = drawable;
                ImageView imageView = eVar.o;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    eVar.o.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = bVar.f;
        if (charSequence2 != null) {
            androidx.biometric.x xVar = bVar.g;
            eVar.getClass();
            Message obtainMessage = xVar != null ? eVar.z.obtainMessage(-2, xVar) : null;
            eVar.j = charSequence2;
            eVar.k = obtainMessage;
        }
        if (bVar.i != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) bVar.b.inflate(eVar.v, (ViewGroup) null);
            int i10 = bVar.l ? eVar.w : eVar.x;
            Object obj = bVar.i;
            ?? r82 = obj;
            if (obj == null) {
                r82 = new g.d(bVar.a, i10, R.id.text1, null);
            }
            eVar.s = r82;
            eVar.t = bVar.m;
            if (bVar.j != null) {
                alertController$RecycleListView.setOnItemClickListener(new g.a(bVar, eVar));
            }
            if (bVar.l) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            eVar.e = alertController$RecycleListView;
        }
        View view2 = bVar.k;
        if (view2 != null) {
            eVar.f = view2;
            eVar.g = false;
        }
        fVar.setCancelable(true);
        fVar.setCanceledOnTouchOutside(true);
        fVar.setOnCancelListener(null);
        fVar.setOnDismissListener(null);
        l.l lVar = bVar.h;
        if (lVar != null) {
            fVar.setOnKeyListener(lVar);
        }
        return fVar;
    }

    public tc.u j(String str) {
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
        SecureRandom secureRandom = tc.k.a;
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
                    ((sb.a) this.c).getClass();
                    tc.s sVar = new tc.s(z10 ? SSLSocketFactory.getDefault() : SocketFactory.getDefault(), new tc.a(str2, i11), i10, null, null);
                    sVar.d = 1;
                    sVar.e = MediaDataController.MAX_LINKS_COUNT;
                    sVar.f = true;
                    if (port >= 0) {
                        str2 = str2 + ":" + port;
                    }
                    if (rawQuery != null) {
                        str3 = a1.g.C(str3, "?", rawQuery);
                    }
                    return new tc.u(z10, userInfo, str2, str3, sVar);
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

    @Override // r2.u
    public int k() {
        if (((MediaCodecInfo[]) this.c) == null) {
            this.c = new MediaCodecList(this.b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.c).length;
    }

    public void l(int i10) {
        ByteBuffer allocate = ByteBuffer.allocate(i10);
        int position = ((ByteBuffer) this.c).position();
        ((ByteBuffer) this.c).position(0);
        allocate.put((ByteBuffer) this.c);
        allocate.position(position);
        this.c = allocate;
    }

    public byte m(int i10) {
        if (i10 < 0 || this.b <= i10) {
            throw new IndexOutOfBoundsException(String.format("Bad index: index=%d, length=%d", Integer.valueOf(i10), Integer.valueOf(this.b)));
        }
        return ((ByteBuffer) this.c).get(i10);
    }

    public long n(int i10) {
        if (i10 >= 0 && i10 < this.b) {
            return ((long[]) this.c)[i10];
        }
        StringBuilder l4 = i2.e.l(i10, "Invalid index ", ", size is ");
        l4.append(this.b);
        throw new IndexOutOfBoundsException(l4.toString());
    }

    public boolean o(int i10) {
        return ((1 << (i10 % 8)) & m(i10 / 8)) != 0;
    }

    public synchronized List p() {
        return DesugarCollections.unmodifiableList(new ArrayList((ArrayList) this.c));
    }

    public void q(int i10) {
        int capacity = ((ByteBuffer) this.c).capacity();
        int i11 = this.b;
        if (capacity < i11 + 1) {
            l(i11 + 1024);
        }
        ((ByteBuffer) this.c).put((byte) i10);
        this.b++;
    }

    public void r(byte[] bArr) {
        int capacity = ((ByteBuffer) this.c).capacity();
        int i10 = this.b;
        if (capacity < bArr.length + i10) {
            l(i10 + bArr.length + 1024);
        }
        ((ByteBuffer) this.c).put(bArr);
        this.b += bArr.length;
    }

    public int s(int i10, int[] iArr) {
        int i11 = iArr[0];
        int i12 = 1;
        int i13 = 0;
        int i14 = 0;
        while (i13 < i10) {
            if (o(i11 + i13)) {
                i14 += i12;
            }
            i13++;
            i12 *= 2;
        }
        iArr[0] = iArr[0] + i10;
        return i14;
    }

    public long t(c3.l lVar) {
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

    public String toString() {
        switch (this.a) {
            case 8:
                return new String((char[]) this.c, 0, this.b);
            case 15:
                i9.a aVar = (i9.a) this.c;
                ArrayList arrayList = new ArrayList(aVar.b);
                for (int i10 = 0; i10 < aVar.b; i10++) {
                    arrayList.add(m0.e0(aVar.b(i10)));
                }
                return "UnsupportedBrands{major=" + m0.e0(this.b) + ", compatible=" + arrayList + "}";
            default:
                return super.toString();
        }
    }

    @Override // e2.d
    public j9.y u(byte[] bArr) {
        return q8.c(((e2.d) this.c).u(bArr), new j5.b(this, 18));
    }

    @Override // r2.u
    public boolean v() {
        return true;
    }

    public void w(Object instance) {
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

    public byte[] x(int i10, int i11) {
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

    public String y(i4 i4Var) {
        e0 e0Var = (e0) this.c;
        int i10 = this.b;
        try {
            if (e0Var.E == null) {
                throw null;
            }
            com.google.android.gms.internal.play_billing.g gVar = e0Var.E;
            String packageName = e0Var.C.getPackageName();
            String str = i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? i10 != 6 ? "QUERY_PRODUCT_DETAILS_ASYNC" : "START_CONNECTION" : "IS_FEATURE_SUPPORTED" : "CONSUME_ASYNC" : "ACKNOWLEDGE_PURCHASE" : "LAUNCH_BILLING_FLOW";
            d0 d0Var = new d0(i4Var);
            com.google.android.gms.internal.play_billing.e eVar = (com.google.android.gms.internal.play_billing.e) gVar;
            Parcel T0 = eVar.T0();
            T0.writeString(packageName);
            T0.writeString(str);
            int i11 = com.google.android.gms.internal.play_billing.d.a;
            T0.writeStrongBinder(d0Var);
            try {
                eVar.b.transact(1, T0, null, 1);
                T0.recycle();
                return "billingOverrideService.getBillingOverride";
            } catch (Throwable th2) {
                T0.recycle();
                throw th2;
            }
        } catch (Exception e) {
            e0Var.F(95, 28, h0.p);
            com.google.android.gms.internal.play_billing.u.i("BillingClientTesting", "An error occurred while retrieving billing override.", e);
            i4Var.a(0);
            return "billingOverrideService.getBillingOverride";
        }
    }

    public /* synthetic */ c0(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    public c0(k6.a aVar, int i10) {
        this.a = 2;
        n6.l.h(aVar);
        this.c = aVar;
        this.b = i10;
    }

    public c0(int i10, short s10) {
        this.a = i10;
        switch (i10) {
            case 13:
                this.c = new sb.a();
                break;
            case 14:
                this.c = new e2.x(8);
                break;
            case 18:
                this.c = new ArrayList();
                this.b = 128;
                break;
            default:
                this.b = 0;
                this.c = new StringBuilder();
                break;
        }
    }

    public c0(int i10, int i11) {
        this.a = i11;
        switch (i11) {
            case 9:
                if (i10 > 0) {
                    this.c = new Object[i10];
                    return;
                }
                throw new IllegalArgumentException("The max pool size must be > 0");
            case 10:
            default:
                this.c = new long[i10];
                return;
            case 11:
                this.c = ByteBuffer.allocate(i10);
                this.b = 0;
                return;
            case 12:
                this.c = new CountDownLatch(1);
                this.b = i10;
                return;
        }
    }

    public c0(int i10, int[] iArr) {
        i9.a aVar;
        this.a = 15;
        this.b = i10;
        if (iArr != null) {
            i9.a aVar2 = i9.a.c;
            aVar = iArr.length == 0 ? i9.a.c : new i9.a(Arrays.copyOf(iArr, iArr.length));
        } else {
            aVar = i9.a.c;
        }
        this.c = aVar;
    }

    public c0(int i10, u0[] u0VarArr) {
        this.a = 5;
        this.b = i10;
        this.c = u0VarArr;
    }

    public c0(Context context) {
        this.a = 4;
        int e = g.f.e(context, 0);
        this.c = new g.b(new ContextThemeWrapper(context, g.f.e(context, e)));
        this.b = e;
    }

    public c0(boolean z10, boolean z11, boolean z12) {
        this.a = 10;
        this.b = (z10 || z11 || z12) ? 1 : 0;
    }
}
