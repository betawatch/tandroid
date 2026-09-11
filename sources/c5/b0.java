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
import b2.q0;
import com.google.android.gms.internal.play_billing.h4;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements r2.u {
    public final /* synthetic */ int a;
    public int b;
    public Object c;

    public /* synthetic */ b0(char c10, int i10) {
        this.a = i10;
    }

    @Override // r2.u
    public boolean K0() {
        return true;
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

    @Override // r2.u
    public MediaCodecInfo b(int i10) {
        if (((MediaCodecInfo[]) this.c) == null) {
            this.c = new MediaCodecList(this.b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.c)[i10];
    }

    public void c(long j3) {
        int i10 = this.b;
        long[] jArr = (long[]) this.c;
        if (i10 == jArr.length) {
            this.c = Arrays.copyOf(jArr, i10 * 2);
        }
        long[] jArr2 = (long[]) this.c;
        int i11 = this.b;
        this.b = i11 + 1;
        jArr2[i11] = j3;
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
    public g.g e() {
        g.c cVar = (g.c) this.c;
        g.g gVar = new g.g(cVar.a, this.b);
        View view = cVar.e;
        g.f fVar = gVar.f;
        if (view != null) {
            fVar.r = view;
        } else {
            CharSequence charSequence = cVar.d;
            if (charSequence != null) {
                fVar.d = charSequence;
                TextView textView = fVar.p;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = cVar.c;
            if (drawable != null) {
                fVar.n = drawable;
                ImageView imageView = fVar.o;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    fVar.o.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = cVar.f;
        if (charSequence2 != null) {
            androidx.biometric.x xVar = cVar.g;
            fVar.getClass();
            Message obtainMessage = xVar != null ? fVar.z.obtainMessage(-2, xVar) : null;
            fVar.j = charSequence2;
            fVar.k = obtainMessage;
        }
        if (cVar.i != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) cVar.b.inflate(fVar.v, (ViewGroup) null);
            int i10 = cVar.l ? fVar.w : fVar.x;
            Object obj = cVar.i;
            ?? r82 = obj;
            if (obj == null) {
                r82 = new g.e(cVar.a, i10, R.id.text1, null);
            }
            fVar.s = r82;
            fVar.t = cVar.m;
            if (cVar.j != null) {
                alertController$RecycleListView.setOnItemClickListener(new g.b(cVar, fVar));
            }
            if (cVar.l) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            fVar.e = alertController$RecycleListView;
        }
        View view2 = cVar.k;
        if (view2 != null) {
            fVar.f = view2;
            fVar.g = false;
        }
        gVar.setCancelable(true);
        gVar.setCanceledOnTouchOutside(true);
        gVar.setOnCancelListener(null);
        gVar.setOnDismissListener(null);
        l.m mVar = cVar.h;
        if (mVar != null) {
            gVar.setOnKeyListener(mVar);
        }
        return gVar;
    }

    public long f(int i10) {
        if (i10 >= 0 && i10 < this.b) {
            return ((long[]) this.c)[i10];
        }
        StringBuilder l4 = i2.g.l(i10, "Invalid index ", ", size is ");
        l4.append(this.b);
        throw new IndexOutOfBoundsException(l4.toString());
    }

    public synchronized List g() {
        return DesugarCollections.unmodifiableList(new ArrayList((ArrayList) this.c));
    }

    public long h(c3.l lVar) {
        e2.v vVar = (e2.v) this.c;
        int i10 = 0;
        lVar.j(vVar.a, 0, 1, false);
        int i11 = vVar.a[0] & 255;
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
        lVar.j(vVar.a, 1, i13, false);
        while (i10 < i13) {
            i10++;
            i14 = (vVar.a[i10] & 255) + (i14 << 8);
        }
        this.b = i13 + 1 + this.b;
        return i14;
    }

    public void i(Object instance) {
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

    public String j(h4 h4Var) {
        d0 d0Var = (d0) this.c;
        int i10 = this.b;
        try {
            if (d0Var.E == null) {
                throw null;
            }
            com.google.android.gms.internal.play_billing.g gVar = d0Var.E;
            String packageName = d0Var.C.getPackageName();
            String str = i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? i10 != 6 ? "QUERY_PRODUCT_DETAILS_ASYNC" : "START_CONNECTION" : "IS_FEATURE_SUPPORTED" : "CONSUME_ASYNC" : "ACKNOWLEDGE_PURCHASE" : "LAUNCH_BILLING_FLOW";
            c0 c0Var = new c0(h4Var);
            com.google.android.gms.internal.play_billing.e eVar = (com.google.android.gms.internal.play_billing.e) gVar;
            Parcel U0 = eVar.U0();
            U0.writeString(packageName);
            U0.writeString(str);
            int i11 = com.google.android.gms.internal.play_billing.d.a;
            U0.writeStrongBinder(c0Var);
            try {
                eVar.b.transact(1, U0, null, 1);
                U0.recycle();
                return "billingOverrideService.getBillingOverride";
            } catch (Throwable th2) {
                U0.recycle();
                throw th2;
            }
        } catch (Exception e7) {
            d0Var.F(95, 28, g0.p);
            com.google.android.gms.internal.play_billing.u.i("BillingClientTesting", "An error occurred while retrieving billing override.", e7);
            h4Var.a(0);
            return "billingOverrideService.getBillingOverride";
        }
    }

    @Override // r2.u
    public boolean p(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // r2.u
    public boolean q0(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // r2.u
    public int r0() {
        if (((MediaCodecInfo[]) this.c) == null) {
            this.c = new MediaCodecList(this.b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.c).length;
    }

    public String toString() {
        switch (this.a) {
            case 5:
                return new String((char[]) this.c, 0, this.b);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ b0(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    public b0(k6.a aVar, int i10) {
        this.a = 1;
        n6.l.h(aVar);
        this.c = aVar;
        this.b = i10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b0(int i10, byte b10) {
        this(32, 2);
        this.a = i10;
        switch (i10) {
            case 8:
                this.c = new e2.v(8);
                break;
            case 9:
            case 11:
            default:
                break;
            case 10:
                this.c = new ArrayList();
                this.b = 128;
                break;
            case 12:
                this.b = 0;
                this.c = new StringBuilder();
                break;
        }
    }

    public b0(int i10, int i11) {
        this.a = i11;
        switch (i11) {
            case 6:
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

    public b0(int i10, q0[] q0VarArr) {
        this.a = 4;
        this.b = i10;
        this.c = q0VarArr;
    }

    public b0(Context context) {
        this.a = 3;
        int e7 = g.g.e(context, 0);
        this.c = new g.c(new ContextThemeWrapper(context, g.g.e(context, e7)));
        this.b = e7;
    }

    public b0(boolean z10, boolean z11, boolean z12) {
        this.a = 7;
        this.b = (z10 || z11 || z12) ? 1 : 0;
    }
}
