package n2;

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
import com.google.android.gms.internal.play_billing.g4;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class v implements y3.u {
    public final /* synthetic */ int a;
    public int b;
    public Object c;

    public /* synthetic */ v(char c10, int i10) {
        this.a = i10;
    }

    @Override // y3.u
    public boolean B() {
        return true;
    }

    @Override // y3.u
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
        kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i11] = null;
        this.b--;
        return obj;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    public g.g d() {
        g.d dVar = (g.d) this.c;
        g.g gVar = new g.g(dVar.a, this.b);
        View view = dVar.e;
        g.f fVar = gVar.f;
        if (view != null) {
            fVar.r = view;
        } else {
            CharSequence charSequence = dVar.d;
            if (charSequence != null) {
                fVar.d = charSequence;
                TextView textView = fVar.p;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = dVar.c;
            if (drawable != null) {
                fVar.n = drawable;
                ImageView imageView = fVar.o;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    fVar.o.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = dVar.f;
        if (charSequence2 != null) {
            androidx.biometric.x xVar = dVar.g;
            Message obtainMessage = xVar != null ? fVar.z.obtainMessage(-2, xVar) : null;
            fVar.j = charSequence2;
            fVar.k = obtainMessage;
        }
        if (dVar.i != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) dVar.b.inflate(fVar.v, (ViewGroup) null);
            int i10 = dVar.l ? fVar.w : fVar.x;
            Object obj = dVar.i;
            ?? r82 = obj;
            if (obj == null) {
                r82 = new g.e(dVar.a, i10, R.id.text1, null);
            }
            fVar.s = r82;
            fVar.t = dVar.m;
            if (dVar.j != null) {
                alertController$RecycleListView.setOnItemClickListener(new g.c(dVar, fVar));
            }
            if (dVar.l) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            fVar.e = alertController$RecycleListView;
        }
        View view2 = dVar.k;
        if (view2 != null) {
            fVar.f = view2;
            fVar.g = false;
        }
        gVar.setCancelable(true);
        gVar.setCanceledOnTouchOutside(true);
        gVar.setOnCancelListener(null);
        gVar.setOnDismissListener(null);
        l.m mVar = dVar.h;
        if (mVar != null) {
            gVar.setOnKeyListener(mVar);
        }
        return gVar;
    }

    @Override // y3.u
    public boolean e(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    public long f(int i10) {
        if (i10 >= 0 && i10 < this.b) {
            return ((long[]) this.c)[i10];
        }
        StringBuilder o10 = i0.a.o(i10, "Invalid index ", ", size is ");
        o10.append(this.b);
        throw new IndexOutOfBoundsException(o10.toString());
    }

    public synchronized List g() {
        return DesugarCollections.unmodifiableList(new ArrayList((ArrayList) this.c));
    }

    public long h(m3.h hVar) {
        d5.z zVar = (d5.z) this.c;
        int i10 = 0;
        hVar.g(zVar.a, 0, 1, false);
        int i11 = zVar.a[0] & 255;
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
        hVar.g(zVar.a, 1, i13, false);
        while (i10 < i13) {
            i10++;
            i14 = (zVar.a[i10] & 255) + (i14 << 8);
        }
        this.b = i13 + 1 + this.b;
        return i14;
    }

    @Override // y3.u
    public boolean i(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    public void j(Object instance) {
        Object[] objArr = (Object[]) this.c;
        kotlin.jvm.internal.j.e(instance, "instance");
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

    public String k(g4 g4Var) {
        x xVar = (x) this.c;
        int i10 = this.b;
        try {
            if (xVar.E == null) {
                throw null;
            }
            com.google.android.gms.internal.play_billing.g gVar = xVar.E;
            String packageName = xVar.C.getPackageName();
            String str = i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? i10 != 6 ? "QUERY_PRODUCT_DETAILS_ASYNC" : "START_CONNECTION" : "IS_FEATURE_SUPPORTED" : "CONSUME_ASYNC" : "ACKNOWLEDGE_PURCHASE" : "LAUNCH_BILLING_FLOW";
            w wVar = new w(g4Var);
            com.google.android.gms.internal.play_billing.e eVar = (com.google.android.gms.internal.play_billing.e) gVar;
            Parcel S0 = eVar.S0();
            S0.writeString(packageName);
            S0.writeString(str);
            int i11 = com.google.android.gms.internal.play_billing.d.a;
            S0.writeStrongBinder(wVar);
            try {
                eVar.b.transact(1, S0, null, 1);
                S0.recycle();
                return "billingOverrideService.getBillingOverride";
            } catch (Throwable th) {
                S0.recycle();
                throw th;
            }
        } catch (Exception e9) {
            xVar.F(95, 28, a0.p);
            com.google.android.gms.internal.play_billing.u.i("BillingClientTesting", "An error occurred while retrieving billing override.", e9);
            g4Var.a(0);
            return "billingOverrideService.getBillingOverride";
        }
    }

    @Override // y3.u
    public int r() {
        if (((MediaCodecInfo[]) this.c) == null) {
            this.c = new MediaCodecList(this.b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.c).length;
    }

    public String toString() {
        switch (this.a) {
            case 11:
                return new String((char[]) this.c, 0, this.b);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ v(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    public v(v5.a aVar, int i10) {
        this.a = 2;
        y5.l.h(aVar);
        this.c = aVar;
        this.b = i10;
    }

    public v(int i10, byte b10) {
        this.a = i10;
        switch (i10) {
            case 6:
                this.c = new ArrayList();
                this.b = 128;
                break;
            case 7:
                this.b = 0;
                this.c = new StringBuilder();
                break;
            case 8:
            case 9:
            default:
                this.c = new long[32];
                break;
            case 10:
                this.c = new d5.z(8);
                break;
        }
    }

    public v(int i10) {
        this.a = 8;
        if (i10 > 0) {
            this.c = new Object[i10];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    public v(int i10, d5.p[] pVarArr) {
        this.a = 9;
        this.b = i10;
        this.c = pVarArr;
    }

    public v(Context context) {
        this.a = 5;
        int e9 = g.g.e(context, 0);
        this.c = new g.d(new ContextThemeWrapper(context, g.g.e(context, e9)));
        this.b = e9;
    }

    public v(boolean z10, boolean z11) {
        this.a = 12;
        this.b = (z10 || z11) ? 1 : 0;
    }
}
