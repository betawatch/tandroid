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
import com.google.android.gms.internal.play_billing.h4;
import j$.util.DesugarCollections;
import j3.r0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class w implements y3.u {
    public final /* synthetic */ int a;
    public int b;
    public Object c;

    public /* synthetic */ w(char c10, int i9) {
        this.a = i9;
    }

    @Override // y3.u
    public int B() {
        if (((MediaCodecInfo[]) this.c) == null) {
            this.c = new MediaCodecList(this.b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.c).length;
    }

    @Override // y3.u
    public boolean I() {
        return true;
    }

    public Object a() {
        Object[] objArr = (Object[]) this.c;
        int i9 = this.b;
        if (i9 <= 0) {
            return null;
        }
        int i10 = i9 - 1;
        Object obj = objArr[i10];
        kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i10] = null;
        this.b--;
        return obj;
    }

    @Override // y3.u
    public MediaCodecInfo b(int i9) {
        if (((MediaCodecInfo[]) this.c) == null) {
            this.c = new MediaCodecList(this.b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.c)[i9];
    }

    public void c(long j10) {
        int i9 = this.b;
        long[] jArr = (long[]) this.c;
        if (i9 == jArr.length) {
            this.c = Arrays.copyOf(jArr, i9 * 2);
        }
        long[] jArr2 = (long[]) this.c;
        int i10 = this.b;
        this.b = i10 + 1;
        jArr2[i10] = j10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    public g.f d() {
        g.c cVar = (g.c) this.c;
        g.f fVar = new g.f(cVar.a, this.b);
        View view = cVar.e;
        g.e eVar = fVar.f;
        if (view != null) {
            eVar.r = view;
        } else {
            CharSequence charSequence = cVar.d;
            if (charSequence != null) {
                eVar.d = charSequence;
                TextView textView = eVar.p;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = cVar.c;
            if (drawable != null) {
                eVar.n = drawable;
                ImageView imageView = eVar.o;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    eVar.o.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = cVar.f;
        if (charSequence2 != null) {
            androidx.biometric.x xVar = cVar.g;
            eVar.getClass();
            Message obtainMessage = xVar != null ? eVar.z.obtainMessage(-2, xVar) : null;
            eVar.j = charSequence2;
            eVar.k = obtainMessage;
        }
        if (cVar.i != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) cVar.b.inflate(eVar.v, (ViewGroup) null);
            int i9 = cVar.l ? eVar.w : eVar.x;
            Object obj = cVar.i;
            ?? r82 = obj;
            if (obj == null) {
                r82 = new g.d(cVar.a, i9, R.id.text1, null);
            }
            eVar.s = r82;
            eVar.t = cVar.m;
            if (cVar.j != null) {
                alertController$RecycleListView.setOnItemClickListener(new g.b(cVar, eVar));
            }
            if (cVar.l) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            eVar.e = alertController$RecycleListView;
        }
        View view2 = cVar.k;
        if (view2 != null) {
            eVar.f = view2;
            eVar.g = false;
        }
        fVar.setCancelable(true);
        fVar.setCanceledOnTouchOutside(true);
        fVar.setOnCancelListener(null);
        fVar.setOnDismissListener(null);
        l.l lVar = cVar.h;
        if (lVar != null) {
            fVar.setOnKeyListener(lVar);
        }
        return fVar;
    }

    public long e(int i9) {
        if (i9 >= 0 && i9 < this.b) {
            return ((long[]) this.c)[i9];
        }
        StringBuilder p6 = r0.p(i9, "Invalid index ", ", size is ");
        p6.append(this.b);
        throw new IndexOutOfBoundsException(p6.toString());
    }

    public synchronized List f() {
        return DesugarCollections.unmodifiableList(new ArrayList((ArrayList) this.c));
    }

    public long g(m3.h hVar) {
        d5.y yVar = (d5.y) this.c;
        int i9 = 0;
        hVar.g(yVar.a, 0, 1, false);
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
        hVar.g(yVar.a, 1, i12, false);
        while (i9 < i12) {
            i9++;
            i13 = (yVar.a[i9] & 255) + (i13 << 8);
        }
        this.b = i12 + 1 + this.b;
        return i13;
    }

    public void h(Object instance) {
        Object[] objArr = (Object[]) this.c;
        kotlin.jvm.internal.i.e(instance, "instance");
        int i9 = this.b;
        for (int i10 = 0; i10 < i9; i10++) {
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

    public String i(h4 h4Var) {
        y yVar = (y) this.c;
        int i9 = this.b;
        try {
            if (yVar.E == null) {
                throw null;
            }
            com.google.android.gms.internal.play_billing.g gVar = yVar.E;
            String packageName = yVar.C.getPackageName();
            String str = i9 != 2 ? i9 != 3 ? i9 != 4 ? i9 != 5 ? i9 != 6 ? "QUERY_PRODUCT_DETAILS_ASYNC" : "START_CONNECTION" : "IS_FEATURE_SUPPORTED" : "CONSUME_ASYNC" : "ACKNOWLEDGE_PURCHASE" : "LAUNCH_BILLING_FLOW";
            x xVar = new x(h4Var);
            com.google.android.gms.internal.play_billing.e eVar = (com.google.android.gms.internal.play_billing.e) gVar;
            Parcel S0 = eVar.S0();
            S0.writeString(packageName);
            S0.writeString(str);
            int i10 = com.google.android.gms.internal.play_billing.d.a;
            S0.writeStrongBinder(xVar);
            try {
                eVar.b.transact(1, S0, null, 1);
                S0.recycle();
                return "billingOverrideService.getBillingOverride";
            } catch (Throwable th) {
                S0.recycle();
                throw th;
            }
        } catch (Exception e10) {
            yVar.F(95, 28, b0.p);
            com.google.android.gms.internal.play_billing.u.i("BillingClientTesting", "An error occurred while retrieving billing override.", e10);
            h4Var.a(0);
            return "billingOverrideService.getBillingOverride";
        }
    }

    @Override // y3.u
    public boolean p(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    public String toString() {
        switch (this.a) {
            case 11:
                return new String((char[]) this.c, 0, this.b);
            default:
                return super.toString();
        }
    }

    @Override // y3.u
    public boolean y(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    public /* synthetic */ w(Object obj, int i9, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i9;
    }

    public w(u5.a aVar, int i9) {
        this.a = 2;
        x5.l.h(aVar);
        this.c = aVar;
        this.b = i9;
    }

    public w(int i9, byte b10) {
        this.a = i9;
        switch (i9) {
            case 5:
                this.c = new ArrayList();
                this.b = 128;
                break;
            case 6:
                this.b = 0;
                this.c = new StringBuilder();
                break;
            case 10:
                this.c = new d5.y(8);
                break;
            default:
                this.c = new long[32];
                break;
        }
    }

    public w(int i9) {
        this.a = 9;
        if (i9 > 0) {
            this.c = new Object[i9];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    public w(int i9, d5.p[] pVarArr) {
        this.a = 8;
        this.b = i9;
        this.c = pVarArr;
    }

    public w(Context context) {
        this.a = 7;
        int e10 = g.f.e(context, 0);
        this.c = new g.c(new ContextThemeWrapper(context, g.f.e(context, e10)));
        this.b = e10;
    }

    public w(boolean z10, boolean z11) {
        this.a = 12;
        this.b = (z10 || z11) ? 1 : 0;
    }
}
