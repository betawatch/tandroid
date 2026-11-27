// default package

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Shader;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class ed implements pw2, ifc, ka1, xj0, una {
    public final /* synthetic */ byte a;
    public int b;
    public Object c;

    public ed(int i, byte b) {
        this.a = b;
        switch (b) {
            case 9:
                this.c = new long[i];
                return;
            case 12:
                if (i > 0) {
                    this.c = new Object[i];
                    return;
                } else {
                    lq5.j("The max pool size must be > 0");
                    throw null;
                }
            case 17:
                this.c = new CountDownLatch(1);
                this.b = i;
                return;
            default:
                this.c = ByteBuffer.allocate(i);
                this.b = 0;
                return;
        }
    }

    @Override // pw2
    public final boolean A() {
        return false;
    }

    @Override // ka1
    public final boolean B(String str, da1 da1Var) {
        return false;
    }

    @Override // pw2
    public final boolean C(TLRPC.Document document) {
        return false;
    }

    @Override // pw2
    public final String E(boolean z) {
        return null;
    }

    @Override // pw2
    public final boolean H() {
        return false;
    }

    @Override // ka1
    public final String I() {
        return null;
    }

    @Override // pw2
    public final fu5 J(ViewGroup viewGroup) {
        fu5 G = fu5.G(viewGroup, null, new View(((a72) this.c).getContext()));
        final byte b = 0;
        G.s = (short) 0;
        G.t = false;
        String M0 = ob6.M0(2131745998, null);
        final int i = this.b;
        G.b(R.drawable.msg_replace, M0, new Runnable(this) { // from class: l62
            public final /* synthetic */ ed b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b2 = b;
                int i2 = i;
                ed edVar = this.b;
                switch (b2) {
                    case 0:
                        ((a72) edVar.c).c0(i2);
                        break;
                    default:
                        ((a72) edVar.c).g0(i2, null);
                        break;
                }
            }
        }, false);
        final byte b2 = 1;
        G.b(R.drawable.msg_delete, ob6.M0(2131751563, null), new Runnable(this) { // from class: l62
            public final /* synthetic */ ed b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b22 = b2;
                int i2 = i;
                ed edVar = this.b;
                switch (b22) {
                    case 0:
                        ((a72) edVar.c).c0(i2);
                        break;
                    default:
                        ((a72) edVar.c).g0(i2, null);
                        break;
                }
            }
        }, true);
        return G;
    }

    @Override // pw2
    public final boolean M() {
        return false;
    }

    @Override // pw2
    public final boolean Q(TLRPC.Document document) {
        return false;
    }

    @Override // pw2
    public final Boolean S(TLRPC.Document document) {
        return null;
    }

    @Override // pw2
    public final boolean T() {
        return true;
    }

    public final Object U() {
        Object[] objArr = (Object[]) this.c;
        int i = this.b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object obj = objArr[i2];
        obj.getClass();
        objArr[i2] = null;
        this.b--;
        return obj;
    }

    public final void V(int i, int i2, int i3) {
        if (i3 == 0 || i >= i2) {
            return;
        }
        int i4 = this.b;
        if (i4 >= 3) {
            int[] iArr = (int[]) this.c;
            if (iArr[i4 - 1] == i3 && iArr[i4 - 2] == i) {
                iArr[i4 - 2] = i2;
                return;
            }
        }
        int i5 = i4 + 3;
        int[] iArr2 = (int[]) this.c;
        if (i5 > iArr2.length) {
            iArr2 = Arrays.copyOf(iArr2, iArr2.length << 1);
            this.c = iArr2;
        }
        int i6 = this.b;
        int i7 = i6 + 1;
        this.b = i7;
        iArr2[i6] = i;
        int i8 = i6 + 2;
        this.b = i8;
        iArr2[i7] = i2;
        this.b = i6 + 3;
        iArr2[i8] = i3;
    }

    public final void W(long j) {
        int i = this.b;
        long[] jArr = (long[]) this.c;
        if (i == jArr.length) {
            jArr = Arrays.copyOf(jArr, i << 1);
            this.c = jArr;
        }
        int i2 = this.b;
        this.b = i2 + 1;
        jArr[i2] = j;
    }

    @Override // xj0
    public final x76 X(nt6 nt6Var) {
        x76 X = ((xj0) this.c).X(nt6Var);
        if (X == null) {
            return null;
        }
        return e4.o(X, new dr4(this, (byte) 3));
    }

    public final void Y(long[] jArr) {
        int length = this.b + jArr.length;
        long[] jArr2 = (long[]) this.c;
        if (length > jArr2.length) {
            jArr2 = Arrays.copyOf(jArr2, Math.max(jArr2.length << 1, length));
            this.c = jArr2;
        }
        System.arraycopy(jArr, 0, jArr2, this.b, jArr.length);
        this.b = length;
    }

    public final int Z(int i, int i2) {
        int k0 = k0();
        if (k0 < 0 || k0 > i || ((k0 * i2) << 2) > ((yzc) this.c).d - this.b) {
            throw yzc.a();
        }
        return k0;
    }

    @Override // pw2
    public final long a() {
        return 0L;
    }

    public final jd a0() {
        qc qcVar = (qc) this.c;
        ContextThemeWrapper contextThemeWrapper = (ContextThemeWrapper) qcVar.c;
        jd jdVar = new jd(contextThemeWrapper, this.b);
        View view = (View) qcVar.h;
        tc tcVar = jdVar.f;
        if (view != null) {
            tcVar.r = view;
        } else {
            CharSequence charSequence = (CharSequence) qcVar.f;
            if (charSequence != null) {
                tcVar.d = charSequence;
                TextView textView = tcVar.p;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = (Drawable) qcVar.e;
            if (drawable != null) {
                tcVar.n = drawable;
                ImageView imageView = tcVar.o;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    tcVar.o.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = (CharSequence) qcVar.g;
        if (charSequence2 != null) {
            lj0 lj0Var = (lj0) qcVar.j;
            tcVar.getClass();
            Message obtainMessage = lj0Var != null ? tcVar.z.obtainMessage(-2, lj0Var) : null;
            tcVar.j = charSequence2;
            tcVar.k = obtainMessage;
        }
        if (((ListAdapter) qcVar.l) != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) ((LayoutInflater) qcVar.d).inflate(tcVar.v, (ViewGroup) null);
            int i = qcVar.a ? tcVar.w : tcVar.x;
            ListAdapter listAdapter = (ListAdapter) qcVar.l;
            if (listAdapter == null) {
                listAdapter = new sc(contextThemeWrapper, i, android.R.id.text1, null);
            }
            tcVar.s = listAdapter;
            tcVar.t = qcVar.b;
            if (((DialogInterface.OnClickListener) qcVar.m) != null) {
                alertController$RecycleListView.setOnItemClickListener(new pc(qcVar, tcVar));
            }
            if (qcVar.a) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            tcVar.e = alertController$RecycleListView;
        }
        View view2 = qcVar.i;
        if (view2 != null) {
            tcVar.f = view2;
            tcVar.g = false;
        }
        jdVar.setCancelable(true);
        jdVar.setCanceledOnTouchOutside(true);
        jdVar.setOnCancelListener(null);
        jdVar.setOnDismissListener(null);
        g27 g27Var = (g27) qcVar.k;
        if (g27Var != null) {
            jdVar.setOnKeyListener(g27Var);
        }
        return jdVar;
    }

    @Override // pw2
    public final boolean b() {
        return false;
    }

    @Override // xj0
    public final x76 b0(byte[] bArr) {
        return e4.o(((xj0) this.c).b0(bArr), new dr4(this, (byte) 3));
    }

    @Override // pw2
    public final boolean c() {
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final m6c c0(int i, sx8 sx8Var) {
        String str = (String) sx8Var.c;
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new d78(new bi7(str, sx8Var.a(), "video/mp2t"));
            }
            if (i == 21) {
                return new d78(new ns3());
            }
            if (i == 27) {
                if (l0(4)) {
                    return null;
                }
                return new d78(new fe5(new oz9(j0(sx8Var), (byte) 0), l0(1), l0(8)));
            }
            if (i == 36) {
                return new d78(new he5(new oz9(j0(sx8Var), (byte) 0)));
            }
            if (i == 45) {
                return new d78(new di7());
            }
            if (i == 89) {
                return new d78(new ns3((List) sx8Var.d));
            }
            if (i == 172) {
                return new d78(new g4(str, sx8Var.a(), "video/mp2t", (byte) 1));
            }
            if (i == 257) {
                return new my9(new pm3("application/vnd.dvb.ait", (byte) 23));
            }
            if (i != 138) {
                if (i == 139) {
                    return new d78(new xr3(str, sx8Var.a(), 5408));
                }
                switch (i) {
                    case 15:
                        if (l0(2)) {
                            return null;
                        }
                        return new d78(new mb(sx8Var.a(), str, "video/mp2t", false));
                    case 16:
                        return new d78(new ce5(new oz9(j0(sx8Var), (byte) 1)));
                    case 17:
                        if (l0(2)) {
                            return null;
                        }
                        return new d78(new rz5(str, sx8Var.a()));
                    default:
                        switch (i) {
                            case 128:
                                break;
                            case jn7.M1 /* 129 */:
                                return new d78(new g4(str, sx8Var.a(), "video/mp2t", (byte) 0));
                            case jn7.N1 /* 130 */:
                                if (!l0(64)) {
                                    return null;
                                }
                                break;
                            default:
                                switch (i) {
                                    case 134:
                                        if (l0(16)) {
                                            return null;
                                        }
                                        return new my9(new pm3("application/x-scte35", (byte) 23));
                                    case 135:
                                        break;
                                    case jn7.R1 /* 136 */:
                                        break;
                                    default:
                                        return null;
                                }
                        }
                }
            }
            return new d78(new xr3(str, sx8Var.a(), TLObject.FLAG_12));
        }
        return new d78(new zd5(new oz9(j0(sx8Var), (byte) 1), "video/mp2t"));
    }

    @Override // pw2
    public final TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    public final void d0(int i) {
        ByteBuffer allocate = ByteBuffer.allocate(i);
        int position = ((ByteBuffer) this.c).position();
        ((ByteBuffer) this.c).position(0);
        allocate.put((ByteBuffer) this.c);
        allocate.position(position);
        this.c = allocate;
    }

    @Override // pw2
    public final boolean e(TLRPC.Document document) {
        return false;
    }

    public final float e0() {
        float intBitsToFloat = Float.intBitsToFloat(k0());
        if (Float.isNaN(intBitsToFloat) || Float.isInfinite(intBitsToFloat)) {
            return 0.0f;
        }
        return intBitsToFloat;
    }

    @Override // pw2
    public final boolean f() {
        return false;
    }

    public final void f0(int i, float[] fArr) {
        for (int i2 = 0; i2 < i; i2++) {
            fArr[i2] = e0();
        }
    }

    @Override // pw2
    public final TLRPC.PollAnswer g() {
        return null;
    }

    public final byte g0(int i) {
        if (i < 0 || this.b <= i) {
            throw new IndexOutOfBoundsException(String.format("Bad index: index=%d, length=%d", Integer.valueOf(i), Integer.valueOf(this.b)));
        }
        return ((ByteBuffer) this.c).get(i);
    }

    @Override // pw2
    public final boolean h() {
        return true;
    }

    public final long h0(int i) {
        if (i >= 0 && i < this.b) {
            return ((long[]) this.c)[i];
        }
        lq5.g(this.b, uh9.m(i, "Invalid index ", ", size is "));
        return 0L;
    }

    @Override // pw2
    public final boolean i() {
        return false;
    }

    public final boolean i0(int i) {
        return (g0(i / 8) & (1 << (i % 8))) != 0;
    }

    @Override // pw2
    public final boolean j(int i) {
        return false;
    }

    public final List j0(sx8 sx8Var) {
        String str;
        int i;
        List list;
        List list2 = (List) this.c;
        if (l0(32)) {
            return list2;
        }
        ey7 ey7Var = new ey7(sx8Var.b);
        while (ey7Var.a() > 0) {
            int A = ey7Var.A();
            int A2 = ey7Var.b + ey7Var.A();
            if (A == 134) {
                ArrayList arrayList = new ArrayList();
                int A3 = ey7Var.A() & 31;
                for (int i2 = 0; i2 < A3; i2++) {
                    String y = ey7Var.y(3, StandardCharsets.UTF_8);
                    int A4 = ey7Var.A();
                    boolean z = (A4 & 128) != 0;
                    if (z) {
                        i = A4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte A5 = (byte) ey7Var.A();
                    ey7Var.O(1);
                    if (z) {
                        boolean z2 = (A5 & 64) != 0;
                        byte[] bArr = rk2.a;
                        list = Collections.singletonList(z2 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    jo4 jo4Var = new jo4();
                    jo4Var.s = dg7.n(str);
                    jo4Var.d = y;
                    jo4Var.S = i;
                    jo4Var.v = list;
                    arrayList.add(new ko4(jo4Var));
                }
                list2 = arrayList;
            }
            ey7Var.N(A2);
        }
        return list2;
    }

    public final int k0() {
        int i = this.b;
        int i2 = i + 4;
        yzc yzcVar = (yzc) this.c;
        if (i2 > yzcVar.d) {
            throw yzc.a();
        }
        int i3 = yzcVar.a.getInt(i);
        this.b += 4;
        return i3;
    }

    public final boolean l0(int i) {
        return (this.b & i) != 0;
    }

    public final void m0(int i) {
        int capacity = ((ByteBuffer) this.c).capacity();
        int i2 = this.b;
        if (capacity < i2 + 1) {
            d0(i2 + 1024);
        }
        ((ByteBuffer) this.c).put((byte) i);
        this.b++;
    }

    @Override // pw2
    public final boolean n() {
        return false;
    }

    public final void n0(byte[] bArr) {
        int capacity = ((ByteBuffer) this.c).capacity();
        int i = this.b;
        if (capacity < bArr.length + i) {
            d0(i + bArr.length + 1024);
        }
        ((ByteBuffer) this.c).put(bArr);
        this.b += bArr.length;
    }

    public final int o0(int[] iArr, int i) {
        int i2 = iArr[0];
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i) {
            if (i0(i2 + i4)) {
                i5 += i3;
            }
            i4++;
            i3 <<= 1;
        }
        iArr[0] = iArr[0] + i;
        return i5;
    }

    @Override // ifc
    public final void onStateChanged(boolean z, int i) {
        hl.c3(new bt((Object) this, this.b, i, (byte) 10));
    }

    @Override // ifc
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // ka1
    public final void q(String str) {
        String c = m01.c(str);
        if (TextUtils.isEmpty(c)) {
            hl.c3(new pg6((byte) 17));
        } else {
            uc7.s1(this.b).a2().a(c, null, new gx4((e) this.c, (byte) 1));
        }
    }

    public final long q0(cb3 cb3Var) {
        ey7 ey7Var = (ey7) this.c;
        int i = 0;
        cb3Var.d(ey7Var.a, 0, 1, false);
        int i2 = ey7Var.a[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        cb3Var.d(ey7Var.a, 1, i4, false);
        while (i < i4) {
            i++;
            i5 = (i5 << 8) + (ey7Var.a[i] & 255);
        }
        this.b = i4 + 1 + this.b;
        return i5;
    }

    public final void r0(Object obj) {
        Object[] objArr = (Object[]) this.c;
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == obj) {
                grb.i("Already in the pool!");
                return;
            }
        }
        int i3 = this.b;
        if (i3 < objArr.length) {
            objArr[i3] = obj;
            this.b = i3 + 1;
        }
    }

    public final boolean s0(int i) {
        if (((tm2) this.c) != null && this.b == i) {
            return false;
        }
        this.b = i;
        this.c = new tm2(0.0f, 0.0f, 1.0f, 0.0f, new int[]{i, i}, null, Shader.TileMode.CLAMP);
        return true;
    }

    public final byte[] t0(int i, int i2) {
        int i3 = i2 - i;
        if (i3 < 0 || i < 0 || this.b < i2) {
            throw new IllegalArgumentException(String.format("Bad range: beginIndex=%d, endIndex=%d, length=%d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(this.b)));
        }
        byte[] bArr = new byte[i3];
        if (i3 != 0) {
            System.arraycopy(((ByteBuffer) this.c).array(), i, bArr, 0, i3);
        }
        return bArr;
    }

    public final String toString() {
        switch (this.a) {
            case 20:
                lo5 lo5Var = (lo5) this.c;
                int i = lo5Var.b;
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    arrayList.add(gcc.f0(lo5Var.b(i2)));
                }
                return "UnsupportedBrands{major=" + gcc.f0(this.b) + ", compatible=" + arrayList + "}";
            default:
                return super.toString();
        }
    }

    @Override // pw2
    public final boolean u() {
        return true;
    }

    @Override // pw2
    public final r47 x() {
        return null;
    }

    @Override // pw2
    public final boolean y() {
        return false;
    }

    @Override // ifc
    public final void onRenderedFirstFrame() {
    }

    @Override // pw2
    public final void N() {
    }

    @Override // pw2
    public final void O() {
    }

    @Override // ka1
    public final void onDismiss() {
    }

    @Override // pw2
    public final void p() {
    }

    @Override // pw2
    public final void r() {
    }

    @Override // pw2
    public final void D(TLRPC.Document document) {
    }

    @Override // pw2
    public final void G(TLRPC.Document document) {
    }

    @Override // pw2
    public final void K(k7a k7aVar) {
    }

    @Override // pw2
    public final void R(String str) {
    }

    @Override // pw2
    public final void l(String str) {
    }

    @Override // pw2
    public final void m(TLRPC.Document document) {
    }

    @Override // pw2
    public final void o(TLRPC.Document document) {
    }

    @Override // ifc
    public final void onRenderedFirstFrame(uj ujVar) {
    }

    @Override // ifc
    public final void onSeekFinished(uj ujVar) {
    }

    @Override // ifc
    public final void onSeekStarted(uj ujVar) {
    }

    @Override // ifc
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // ka1
    public final void p0(ei7 ei7Var) {
    }

    @Override // pw2
    public final void s(TLRPC.Document document) {
    }

    @Override // pw2
    public final void w(String str) {
    }

    @Override // pw2
    public final void z(TLRPC.Document document) {
    }

    @Override // pw2
    public final void L(Object obj, Object obj2) {
    }

    @Override // pw2
    public final void P(TLRPC.InputStickerSet inputStickerSet, boolean z) {
    }

    @Override // ifc
    public final void onError(kfc kfcVar, Exception exc) {
    }

    @Override // pw2
    public final void t(TLRPC.StickerSet stickerSet, String str) {
    }

    public /* synthetic */ ed(int i, Object obj, byte b) {
        this.a = b;
        this.b = i;
        this.c = obj;
    }

    public /* synthetic */ ed(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    public ed(ws2 ws2Var, int i) {
        this.a = (byte) 22;
        xve.h(ws2Var);
        this.c = ws2Var;
        this.b = i;
    }

    public ed(byte b) {
        this.a = b;
        switch (b) {
            case 7:
                this.c = new uo3[2];
                break;
            case 16:
                this.c = new ey7(8);
                break;
            default:
                this.b = 0;
                this.c = new StringBuilder();
                break;
        }
    }

    public ed(int[] iArr, int i) {
        this.a = (byte) 20;
        this.b = i;
        lo5 lo5Var = lo5.c;
        if (iArr != null && iArr.length != 0) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            lo5Var = new lo5(copyOf, copyOf.length);
        }
        this.c = lo5Var;
    }

    @Override // pw2
    public final void F(CharSequence charSequence, String str, rx1 rx1Var) {
    }

    public /* synthetic */ ed(byte b, boolean z) {
        this.a = b;
    }

    public ed(yzc yzcVar) {
        this.a = (byte) 21;
        this.c = yzcVar;
        this.b = 20;
    }

    public ed(Context context, byte b) {
        this.a = b;
        switch (b) {
            case 5:
                this.c = context;
                this.b = -1;
                break;
            default:
                int e = jd.e(context, 0);
                this.c = new qc(new ContextThemeWrapper(context, jd.e(context, e)));
                this.b = e;
                break;
        }
    }

    @Override // ifc
    public final void onVideoSizeChanged(int i, int i2, int i3, float f) {
    }

    @Override // pw2
    public final void v(Object obj, Object obj2, boolean z, int i, int i2) {
    }

    @Override // pw2
    public final void k(TLRPC.Document document, String str, Object obj, boolean z, int i, int i2) {
    }
}
