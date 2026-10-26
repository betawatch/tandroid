package d5;

import a8.qd;
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
import b2.s0;
import b2.v0;
import com.google.android.gms.internal.play_billing.h4;
import e2.n0;
import j$.util.DesugarCollections;
import java.net.URI;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import jg.e1;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class z implements e2.d, r2.u, c3.f0 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;

    public /* synthetic */ z(int i10, boolean z10, boolean z11) {
        this.a = i10;
    }

    @Override // r2.u
    public boolean B(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // r2.u
    public int G() {
        if (((MediaCodecInfo[]) this.c) == null) {
            this.c = new MediaCodecList(this.b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.c).length;
    }

    @Override // e2.d
    public k9.y H(byte[] bArr) {
        return qd.c(((e2.d) this.c).H(bArr), new e1(this, 22));
    }

    public Object a() {
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

    public void b(int i10, int i11, int i12) {
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

    public void c(long j10) {
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

    public void d(long[] jArr) {
        int length = this.b + jArr.length;
        long[] jArr2 = (long[]) this.c;
        if (length > jArr2.length) {
            this.c = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, (long[]) this.c, this.b, jArr.length);
        this.b = length;
    }

    @Override // r2.u
    public MediaCodecInfo e(int i10) {
        if (((MediaCodecInfo[]) this.c) == null) {
            this.c = new MediaCodecList(this.b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.c)[i10];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    public g.f f() {
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
            androidx.biometric.w wVar = bVar.g;
            eVar.getClass();
            Message obtainMessage = wVar != null ? eVar.z.obtainMessage(-2, wVar) : null;
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

    public uc.u g(String str) {
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
        SecureRandom secureRandom = uc.k.a;
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
                    ((pa.d) this.c).getClass();
                    uc.s sVar = new uc.s(z10 ? SSLSocketFactory.getDefault() : SocketFactory.getDefault(), new uc.a(str2, i11), i10, null, null);
                    sVar.d = 1;
                    sVar.e = MediaDataController.MAX_LINKS_COUNT;
                    sVar.f = true;
                    if (port >= 0) {
                        str2 = str2 + ":" + port;
                    }
                    if (rawQuery != null) {
                        str3 = a1.g.D(str3, "?", rawQuery);
                    }
                    return new uc.u(z10, userInfo, str2, str3, sVar);
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

    public void h(int i10) {
        ByteBuffer allocate = ByteBuffer.allocate(i10);
        int position = ((ByteBuffer) this.c).position();
        ((ByteBuffer) this.c).position(0);
        allocate.put((ByteBuffer) this.c);
        allocate.position(position);
        this.c = allocate;
    }

    public byte i(int i10) {
        if (i10 < 0 || this.b <= i10) {
            throw new IndexOutOfBoundsException(String.format("Bad index: index=%d, length=%d", Integer.valueOf(i10), Integer.valueOf(this.b)));
        }
        return ((ByteBuffer) this.c).get(i10);
    }

    @Override // r2.u
    public boolean i0() {
        return true;
    }

    public long j(int i10) {
        if (i10 >= 0 && i10 < this.b) {
            return ((long[]) this.c)[i10];
        }
        StringBuilder k10 = ic.a.k(i10, "Invalid index ", ", size is ");
        k10.append(this.b);
        throw new IndexOutOfBoundsException(k10.toString());
    }

    public boolean k(int i10) {
        return ((1 << (i10 % 8)) & i(i10 / 8)) != 0;
    }

    public synchronized List l() {
        return DesugarCollections.unmodifiableList(new ArrayList((ArrayList) this.c));
    }

    public void m(int i10) {
        int capacity = ((ByteBuffer) this.c).capacity();
        int i11 = this.b;
        if (capacity < i11 + 1) {
            h(i11 + 1024);
        }
        ((ByteBuffer) this.c).put((byte) i10);
        this.b++;
    }

    public void n(byte[] bArr) {
        int capacity = ((ByteBuffer) this.c).capacity();
        int i10 = this.b;
        if (capacity < bArr.length + i10) {
            h(i10 + bArr.length + 1024);
        }
        ((ByteBuffer) this.c).put(bArr);
        this.b += bArr.length;
    }

    @Override // r2.u
    public boolean o(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    public int p(int i10, int[] iArr) {
        int i11 = iArr[0];
        int i12 = 1;
        int i13 = 0;
        int i14 = 0;
        while (i13 < i10) {
            if (k(i11 + i13)) {
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
        lVar.h(xVar.a, 0, 1, false);
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
        lVar.h(xVar.a, 1, i13, false);
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

    @Override // e2.d
    public k9.y t(s0 s0Var) {
        k9.y t10 = ((e2.d) this.c).t(s0Var);
        if (t10 == null) {
            return null;
        }
        return qd.c(t10, new e1(this, 22));
    }

    public String toString() {
        switch (this.a) {
            case 8:
                return new String((char[]) this.c, 0, this.b);
            case 15:
                j9.a aVar = (j9.a) this.c;
                ArrayList arrayList = new ArrayList(aVar.b);
                for (int i10 = 0; i10 < aVar.b; i10++) {
                    arrayList.add(n0.e0(aVar.b(i10)));
                }
                return "UnsupportedBrands{major=" + n0.e0(this.b) + ", compatible=" + arrayList + "}";
            default:
                return super.toString();
        }
    }

    public String u(h4 h4Var) {
        b0 b0Var = (b0) this.c;
        int i10 = this.b;
        try {
            if (b0Var.E == null) {
                throw null;
            }
            com.google.android.gms.internal.play_billing.g gVar = b0Var.E;
            String packageName = b0Var.C.getPackageName();
            String str = i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? i10 != 6 ? "QUERY_PRODUCT_DETAILS_ASYNC" : "START_CONNECTION" : "IS_FEATURE_SUPPORTED" : "CONSUME_ASYNC" : "ACKNOWLEDGE_PURCHASE" : "LAUNCH_BILLING_FLOW";
            a0 a0Var = new a0(h4Var);
            com.google.android.gms.internal.play_billing.e eVar = (com.google.android.gms.internal.play_billing.e) gVar;
            Parcel T0 = eVar.T0();
            T0.writeString(packageName);
            T0.writeString(str);
            int i11 = com.google.android.gms.internal.play_billing.d.a;
            T0.writeStrongBinder(a0Var);
            try {
                eVar.b.transact(1, T0, null, 1);
                T0.recycle();
                return "billingOverrideService.getBillingOverride";
            } catch (Throwable th2) {
                T0.recycle();
                throw th2;
            }
        } catch (Exception e) {
            b0Var.F(95, 28, e0.p);
            com.google.android.gms.internal.play_billing.u.i("BillingClientTesting", "An error occurred while retrieving billing override.", e);
            h4Var.a(0);
            return "billingOverrideService.getBillingOverride";
        }
    }

    public /* synthetic */ z(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    public z(l6.a aVar, int i10) {
        this.a = 2;
        o6.l.h(aVar);
        this.c = aVar;
        this.b = i10;
    }

    public z(int i10, short s10) {
        this.a = i10;
        switch (i10) {
            case 11:
                this.c = new e2.x(8);
                break;
            case 14:
                pa.d dVar = new pa.d();
                new TreeMap(String.CASE_INSENSITIVE_ORDER).clear();
                this.c = dVar;
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

    public z(int i10, int i11) {
        this.a = i11;
        switch (i11) {
            case 9:
                if (i10 > 0) {
                    this.c = new Object[i10];
                    return;
                }
                throw new IllegalArgumentException("The max pool size must be > 0");
            case 10:
            case 11:
            default:
                this.c = new long[i10];
                return;
            case 12:
                this.c = ByteBuffer.allocate(i10);
                this.b = 0;
                return;
            case 13:
                this.c = new CountDownLatch(1);
                this.b = i10;
                return;
        }
    }

    public z(int i10, int[] iArr) {
        j9.a aVar;
        this.a = 15;
        this.b = i10;
        if (iArr != null) {
            j9.a aVar2 = j9.a.c;
            aVar = iArr.length == 0 ? j9.a.c : new j9.a(Arrays.copyOf(iArr, iArr.length));
        } else {
            aVar = j9.a.c;
        }
        this.c = aVar;
    }

    public z(int i10, v0[] v0VarArr) {
        this.a = 5;
        this.b = i10;
        this.c = v0VarArr;
    }

    public z(Context context) {
        this.a = 4;
        int e = g.f.e(context, 0);
        this.c = new g.b(new ContextThemeWrapper(context, g.f.e(context, e)));
        this.b = e;
    }

    public z(boolean z10, boolean z11, boolean z12) {
        this.a = 10;
        this.b = (z10 || z11 || z12) ? 1 : 0;
    }
}
