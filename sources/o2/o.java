package o2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.webkit.WebView;
import b7.y0;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.internal.cast.t;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import dg.b3;
import g.x;
import g5.n0;
import j$.util.Objects;
import j7.t5;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import k7.n6;
import k7.p7;
import l7.w0;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.c81;
import org.telegram.ui.Components.f71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.j81;
import org.telegram.ui.Components.l81;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.lq0;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.w50;
import org.telegram.ui.Components.x50;
import org.telegram.ui.Components.y4;
import org.telegram.ui.si0;
import org.telegram.ui.xn;
import ph.f0;
import ph.i5;
import ph.l5;
import q5.d0;
import q5.e0;
import sh.o0;
import sh.q;
import vh.p;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class o implements n, od.b, y4, ng.g, f71, j81, androidx.activity.result.b, SuccessContinuation, yf.m, s, n0, OnSuccessListener, ra.m, u5.o, sh.n0, td.a, v0.i {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ o(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public float D(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = 1;
        boolean z4 = Math.abs(i13 - i11) > Math.abs(i12 - i10);
        if (z4) {
            i15 = i10;
            i14 = i11;
            i17 = i12;
            i16 = i13;
        } else {
            i14 = i10;
            i15 = i11;
            i16 = i12;
            i17 = i13;
        }
        int abs = Math.abs(i16 - i14);
        int abs2 = Math.abs(i17 - i15);
        int i19 = (-abs) / 2;
        int i20 = i14 < i16 ? 1 : -1;
        int i21 = i15 < i17 ? 1 : -1;
        int i22 = i16 + i20;
        int i23 = i14;
        int i24 = i15;
        int i25 = 0;
        while (i23 != i22) {
            boolean z10 = z4;
            int i26 = abs;
            if ((i25 == i18) == ((pb.b) this.b).b(z4 ? i24 : i23, z4 ? i23 : i24)) {
                if (i25 == 2) {
                    return n6.b(i23, i24, i14, i15);
                }
                i25++;
            }
            i19 += abs2;
            if (i19 > 0) {
                if (i24 == i17) {
                    break;
                }
                i24 += i21;
                i19 -= i26;
            }
            i23 += i20;
            abs = i26;
            z4 = z10;
            i18 = 1;
        }
        if (i25 == 2) {
            return n6.b(i22, i17, i14, i15);
        }
        return Float.NaN;
    }

    public float E(int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        pb.b bVar = (pb.b) this.b;
        float D = D(i10, i11, i12, i13);
        int i14 = i10 - (i12 - i10);
        int i15 = 0;
        if (i14 < 0) {
            f10 = i10 / (i10 - i14);
            i14 = 0;
        } else {
            int i16 = bVar.a;
            if (i14 >= i16) {
                float f12 = ((i16 - 1) - i10) / (i14 - i10);
                int i17 = i16 - 1;
                f10 = f12;
                i14 = i17;
            } else {
                f10 = 1.0f;
            }
        }
        float f13 = i11;
        int i18 = (int) (f13 - ((i13 - i11) * f10));
        if (i18 < 0) {
            f11 = f13 / (i11 - i18);
        } else {
            int i19 = bVar.b;
            if (i18 >= i19) {
                f11 = ((i19 - 1) - i11) / (i18 - i11);
                i15 = i19 - 1;
            } else {
                i15 = i18;
                f11 = 1.0f;
            }
        }
        return (D(i10, i11, (int) (((i14 - i10) * f11) + i10), i15) + D) - 1.0f;
    }

    @Override // yf.m
    public void G() {
        ((f0) this.b).e.invalidate();
    }

    @Override // org.telegram.ui.Components.y4
    public void J(int i10, int i11, boolean z4) {
        switch (this.a) {
            case 3:
                org.telegram.ui.Components.f0 f0Var = (org.telegram.ui.Components.f0) this.b;
                f0Var.l0(i10, i11, z4);
                f0Var.dismiss();
                break;
            default:
                ((p) this.b).H(i10, z4, i11, false, 0L);
                p pVar = (p) this.b;
                si0 si0Var = pVar.L;
                if (si0Var != null) {
                    si0Var.i();
                    pVar.L = null;
                    break;
                }
                break;
        }
    }

    @Override // ng.g
    public void Y(x xVar) {
        switch (this.a) {
            case 4:
                xVar.a(((li) this.b).getThemedColor(j6.d6));
                xVar.b(SharedConfig.chatBlurEnabled());
                break;
            default:
                xVar.a(((lq0) this.b).getThemedColor(j6.d6));
                xVar.b(SharedConfig.chatBlurEnabled());
                break;
        }
    }

    @Override // g5.n0
    public void a() {
        r4.g gVar = (r4.g) this.b;
        gVar.B.a();
        y0 y0Var = gVar.D;
        if (y0Var != null) {
            throw y0Var;
        }
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 14:
                u5.x xVar = (u5.x) obj;
                u5.f fVar = (u5.f) xVar.u();
                d0 d0Var = ((e0) this.b).k;
                Parcel M0 = fVar.M0();
                t.d(M0, d0Var);
                fVar.R0(M0, 18);
                u5.f fVar2 = (u5.f) xVar.u();
                fVar2.R0(fVar2.M0(), 17);
                ((TaskCompletionSource) obj2).setResult(null);
                break;
            default:
                u6.f fVar3 = (u6.f) this.b;
                v6.f fVar4 = new v6.f(0, (TaskCompletionSource) obj2);
                v6.d dVar = (v6.d) ((v6.e) obj).u();
                com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true));
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i10 = e7.a.a;
                obtain.writeStrongBinder(fVar4);
                e7.a.b(obtain, fVar3);
                e7.a.b(obtain, gVar);
                ((v6.b) dVar).E0(obtain, 6);
                break;
        }
    }

    @Override // sh.n0
    public void b(long j10) {
        ((q) this.b).presentFragment(xn.R9(j10));
    }

    @Override // u5.o
    public void c(String str, long j10, long j11, long j12) {
        s5.o oVar = (s5.o) this.b;
        try {
            oVar.a(new s5.n(new Status(2103, null, null, null), 1));
        } catch (IllegalStateException e) {
            u5.b bVar = s5.h.k;
            Log.e(bVar.a, bVar.d("Result already set when calling onRequestReplaced", new Object[0]), e);
        }
        Iterator it = oVar.q.i.iterator();
        while (it.hasNext()) {
            ((s5.g) it.next()).h(str, j10, 2103, j11, j12);
        }
    }

    @Override // sh.n0
    public void close() {
        ((q) this.b).finishFragment();
    }

    @Override // o2.n
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) ee.b.a(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.b).createWebView(webView));
    }

    @Override // sh.n0
    public void d() {
        q qVar = (q) this.b;
        xd.a aVar = qVar.a;
        o0 o0Var = qVar.v;
        aVar.a(o0Var.n && o0Var.l == 0, true);
        qVar.d.V2.N(true);
    }

    @Override // o2.n
    public String[] e() {
        return ((WebViewProviderFactoryBoundaryInterface) this.b).getSupportedFeatures();
    }

    @Override // androidx.activity.result.b
    public void f(Object obj) {
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.b;
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.b;
        int i10 = aVar.a;
        Bundle extras = intent == null ? null : intent.getExtras();
        if (i10 != -1) {
            if (extras == null) {
                extras = new Bundle();
            }
            u.h("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i10);
            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i10);
        }
        int i11 = u.e("ProxyBillingActivityV2", intent).a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.L;
        if (resultReceiver != null) {
            resultReceiver.send(i11, extras);
        } else {
            u.h("ProxyBillingActivityV2", "External offer flow result receiver is null");
        }
        if (i11 != 0) {
            u.h("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i11);
        }
        proxyBillingActivityV2.finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004d A[LOOP:0: B:16:0x0047->B:18:0x004d, LOOP_END] */
    @Override // u5.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void g(String str, long j10, int i10, Object obj, long j11, long j12) {
        int i11;
        Iterator it;
        s5.o oVar = (s5.o) this.b;
        try {
            i11 = i10;
            try {
                Status status = new Status(i11, null, null, null);
                Object obj2 = true == (obj instanceof u5.m) ? obj : null;
                if (obj2 != null) {
                }
                if (obj2 != null) {
                }
                oVar.a(new s5.n(status, 2));
            } catch (IllegalStateException e) {
                e = e;
                u5.b bVar = s5.h.k;
                Log.e(bVar.a, bVar.d("Result already set when calling onRequestCompleted", new Object[0]), e);
                it = oVar.q.i.iterator();
                while (it.hasNext()) {
                }
            }
        } catch (IllegalStateException e6) {
            e = e6;
            i11 = i10;
        }
        it = oVar.q.i.iterator();
        while (it.hasNext()) {
            ((s5.g) it.next()).h(str, j10, i11, j11, j12);
            i11 = i10;
        }
    }

    @Override // o2.n
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) ee.b.a(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.b).getStatics());
    }

    public void h(StringBuilder sb, AbstractCollection abstractCollection) {
        Iterator it = abstractCollection.iterator();
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                sb.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb.append((CharSequence) this.b);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    sb.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public float i(ub.c cVar, ub.c cVar2) {
        int i10 = (int) cVar.a;
        int i11 = (int) cVar.b;
        int i12 = (int) cVar2.a;
        int i13 = (int) cVar2.b;
        float E = E(i10, i11, i12, i13);
        float E2 = E((int) cVar2.a, i13, (int) cVar.a, i11);
        return Float.isNaN(E) ? E2 / 7.0f : Float.isNaN(E2) ? E / 7.0f : (E + E2) / 14.0f;
    }

    public boolean j(int i10) {
        c81 c81Var = ((l81) this.b).I;
        if (c81Var == null) {
            return false;
        }
        return c81Var.c(i10);
    }

    @Override // ng.g
    public void k(Canvas canvas) {
        switch (this.a) {
            case 4:
                li liVar = (li) this.b;
                canvas.drawColor(liVar.getThemedColor(j6.d6));
                if (SharedConfig.chatBlurEnabled()) {
                    liVar.z2.b(canvas, -3);
                    break;
                }
                break;
            default:
                lq0 lq0Var = (lq0) this.b;
                canvas.drawColor(lq0Var.getThemedColor(j6.d6));
                if (SharedConfig.chatBlurEnabled()) {
                    lq0Var.L0.b(canvas, -3);
                    break;
                }
                break;
        }
    }

    public void l(Runnable runnable) {
        Runnable runnable2 = (Runnable) ((HashMap) this.b).remove(runnable);
        if (runnable2 != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable2);
        }
    }

    public void m() {
        HashMap hashMap = (HashMap) this.b;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            AndroidUtilities.cancelRunOnUIThread((Runnable) ((Map.Entry) it.next()).getValue());
        }
        hashMap.clear();
    }

    public int n(int i10, int[] iArr) {
        int[] iArr2;
        int[] iArr3;
        int i11;
        int i12;
        rb.a aVar = (rb.a) this.b;
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        int length = iArr.length;
        if (length <= 1 || iArr[0] != 0) {
            iArr2 = iArr;
        } else {
            int i13 = 1;
            while (i13 < length && iArr[i13] == 0) {
                i13++;
            }
            if (i13 == length) {
                iArr2 = new int[]{0};
            } else {
                int i14 = length - i13;
                int[] iArr4 = new int[i14];
                System.arraycopy(iArr, i13, iArr4, 0, i14);
                iArr2 = iArr4;
            }
        }
        int[] iArr5 = new int[i10];
        boolean z4 = true;
        for (int i15 = 0; i15 < i10; i15++) {
            int i16 = aVar.a[aVar.g + i15];
            if (i16 == 0) {
                i12 = iArr2[iArr2.length - 1];
            } else {
                if (i16 == 1) {
                    i11 = 0;
                    for (int i17 : iArr2) {
                        rb.a aVar2 = rb.a.h;
                        i11 ^= i17;
                    }
                } else {
                    i11 = iArr2[0];
                    int length2 = iArr2.length;
                    for (int i18 = 1; i18 < length2; i18++) {
                        i11 = aVar.c(i16, i11) ^ iArr2[i18];
                    }
                }
                i12 = i11;
            }
            iArr5[(i10 - 1) - i15] = i12;
            if (i12 != 0) {
                z4 = false;
            }
        }
        if (z4) {
            return 0;
        }
        rb.b bVar = new rb.b(aVar, iArr5);
        rb.b a2 = aVar.a(i10, 1);
        rb.b bVar2 = aVar.c;
        if (a2.d() >= bVar.d()) {
            a2 = bVar;
            bVar = a2;
        }
        rb.b bVar3 = aVar.d;
        rb.b bVar4 = a2;
        rb.b bVar5 = bVar;
        rb.b bVar6 = bVar4;
        rb.b bVar7 = bVar2;
        while (bVar6.d() * 2 >= i10) {
            if (bVar6.e()) {
                throw new rb.c("r_{i-1} was zero");
            }
            int b10 = aVar.b(bVar6.c(bVar6.d()));
            rb.b bVar8 = bVar2;
            while (bVar5.d() >= bVar6.d() && !bVar5.e()) {
                int d = bVar5.d() - bVar6.d();
                int c3 = aVar.c(bVar5.c(bVar5.d()), b10);
                bVar8 = bVar8.a(aVar.a(d, c3));
                bVar5 = bVar5.a(bVar6.h(d, c3));
            }
            rb.b a10 = bVar8.g(bVar3).a(bVar7);
            if (bVar5.d() >= bVar6.d()) {
                throw new IllegalStateException("Division algorithm failed to reduce polynomial? r: " + bVar5 + ", rLast: " + bVar6);
            }
            rb.b bVar9 = bVar5;
            bVar5 = bVar6;
            bVar6 = bVar9;
            bVar7 = bVar3;
            bVar3 = a10;
        }
        int c10 = bVar3.c(0);
        if (c10 == 0) {
            throw new rb.c("sigmaTilde(0) was zero");
        }
        int b11 = aVar.b(c10);
        rb.b[] bVarArr = {bVar3.f(b11), bVar6.f(b11)};
        rb.b bVar10 = bVarArr[0];
        rb.b bVar11 = bVarArr[1];
        int d10 = bVar10.d();
        if (d10 == 1) {
            iArr3 = new int[]{bVar10.c(1)};
        } else {
            int[] iArr6 = new int[d10];
            int i19 = 0;
            for (int i20 = 1; i20 < aVar.e && i19 < d10; i20++) {
                if (bVar10.b(i20) == 0) {
                    iArr6[i19] = aVar.b(i20);
                    i19++;
                }
            }
            if (i19 != d10) {
                throw new rb.c("Error locator degree does not match number of roots");
            }
            iArr3 = iArr6;
        }
        int length3 = iArr3.length;
        int[] iArr7 = new int[length3];
        for (int i21 = 0; i21 < length3; i21++) {
            int b12 = aVar.b(iArr3[i21]);
            int i22 = 1;
            for (int i23 = 0; i23 < length3; i23++) {
                if (i21 != i23) {
                    int c11 = aVar.c(iArr3[i23], b12);
                    i22 = aVar.c(i22, (c11 & 1) == 0 ? c11 | 1 : c11 & (-2));
                }
            }
            int c12 = aVar.c(bVar11.b(b12), aVar.b(i22));
            iArr7[i21] = c12;
            if (aVar.g != 0) {
                iArr7[i21] = aVar.c(c12, b12);
            }
        }
        for (int i24 = 0; i24 < iArr3.length; i24++) {
            int length4 = iArr.length - 1;
            int i25 = iArr3[i24];
            if (i25 == 0) {
                throw new IllegalArgumentException();
            }
            int i26 = length4 - aVar.b[i25];
            if (i26 < 0) {
                throw new rb.c("Bad error location");
            }
            iArr[i26] = iArr[i26] ^ iArr7[i24];
        }
        return iArr3.length;
    }

    public ub.a o(float f10, float f11, int i10, int i11) {
        ub.a b10;
        ub.a b11;
        int i12 = (int) (f11 * f10);
        int max = Math.max(0, i10 - i12);
        pb.b bVar = (pb.b) this.b;
        int min = Math.min(bVar.a - 1, i10 + i12) - max;
        float f12 = 3.0f * f10;
        if (min < f12) {
            throw ob.e.a();
        }
        int max2 = Math.max(0, i11 - i12);
        int min2 = Math.min(bVar.b - 1, i11 + i12) - max2;
        if (min2 < f12) {
            throw ob.e.a();
        }
        pb.b bVar2 = (pb.b) this.b;
        ub.b bVar3 = new ub.b(bVar2, max, max2, min, min2, f10);
        int i13 = bVar3.e;
        int i14 = bVar3.c;
        int i15 = i13 + i14;
        int i16 = bVar3.f;
        int i17 = (i16 / 2) + bVar3.d;
        int[] iArr = new int[3];
        for (int i18 = 0; i18 < i16; i18++) {
            int i19 = ((i18 & 1) == 0 ? (i18 + 1) / 2 : -((i18 + 1) / 2)) + i17;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i20 = i14;
            while (i20 < i15 && !bVar2.b(i20, i19)) {
                i20++;
            }
            int i21 = 0;
            while (i20 < i15) {
                if (!bVar2.b(i20, i19)) {
                    if (i21 == 1) {
                        i21++;
                    }
                    iArr[i21] = iArr[i21] + 1;
                } else if (i21 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i21 != 2) {
                    i21++;
                    iArr[i21] = iArr[i21] + 1;
                } else {
                    if (bVar3.a(iArr) && (b11 = bVar3.b(i19, i20, iArr)) != null) {
                        return b11;
                    }
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i21 = 1;
                }
                i20++;
            }
            if (bVar3.a(iArr) && (b10 = bVar3.b(i19, i15, iArr)) != null) {
                return b10;
            }
        }
        ArrayList arrayList = bVar3.b;
        if (arrayList.isEmpty()) {
            throw ob.e.a();
        }
        return (ub.a) arrayList.get(0);
    }

    @Override // v0.i
    public void onError(Object obj) {
        w0.d e = (w0.d) obj;
        kotlin.jvm.internal.j.e(e, "e");
        ld.m mVar = (ld.m) this.b;
        if (mVar.w()) {
            mVar.resumeWith(p7.a(e));
        }
    }

    @Override // org.telegram.ui.Components.f71
    public void onRenderedFirstFrame() {
        int i10 = this.a;
    }

    @Override // v0.i
    public void onResult(Object obj) {
        v0.c result = (v0.c) obj;
        kotlin.jvm.internal.j.e(result, "result");
        ld.m mVar = (ld.m) this.b;
        if (mVar.w()) {
            mVar.resumeWith(result);
        }
    }

    @Override // org.telegram.ui.Components.f71
    public /* synthetic */ void onSeekFinished(k3.a aVar) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.f71
    public /* synthetic */ void onSeekStarted(k3.a aVar) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.f71
    public void onStateChanged(boolean z4, int i10) {
        x50 x50Var;
        VideoEditedInfo videoEditedInfo;
        switch (this.a) {
            case 5:
                w50 w50Var = (w50) this.b;
                i71 i71Var = w50Var.E0.L;
                if (i71Var != null && i71Var.y() && i10 == 4 && (videoEditedInfo = (x50Var = w50Var.E0).K) != null) {
                    i71 i71Var2 = x50Var.L;
                    long j10 = videoEditedInfo.startTime;
                    if (j10 <= 0) {
                        j10 = 0;
                    }
                    i71Var2.K(j10);
                    break;
                }
                break;
            default:
                l5 l5Var = (l5) this.b;
                i5 i5Var = l5Var.J;
                i71 i71Var3 = l5Var.x;
                if (i71Var3 != null) {
                    if (!i71Var3.y()) {
                        AndroidUtilities.cancelRunOnUIThread(i5Var);
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(i5Var);
                        break;
                    }
                }
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ((r5.a) this.b).getClass();
        t5.a("com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES", (Bundle) obj);
    }

    @Override // org.telegram.ui.Components.f71
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.f71
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.f71
    public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
        switch (this.a) {
            case 5:
                break;
            default:
                l5 l5Var = (l5) this.b;
                l5Var.getClass();
                l5Var.getClass();
                b3 b3Var = l5Var.w;
                if (b3Var != null) {
                    float f11 = i10 / i11;
                    if (Math.abs(b3Var.v0 - f11) >= 1.0E-4f) {
                        b3Var.v0 = f11;
                        b3Var.requestLayout();
                        break;
                    }
                }
                break;
        }
    }

    public void q(float f10) {
        l81 l81Var = (l81) this.b;
        if (f10 == 1.0f) {
            View[] viewArr = l81Var.e;
            View[] viewArr2 = l81Var.e;
            if (viewArr[1] != null) {
                l81Var.F();
                l81Var.h.put(l81Var.f[1], viewArr2[1]);
                l81Var.removeView(viewArr2[1]);
                l81Var.E(viewArr2[0], 0.0f);
                viewArr2[1] = null;
            }
            l81Var.z(l81Var.b);
            return;
        }
        View[] viewArr3 = l81Var.e;
        View[] viewArr4 = l81Var.e;
        View view = viewArr3[1];
        if (view == null) {
            return;
        }
        if (l81Var.y) {
            l81Var.E(view, (1.0f - f10) * viewArr3[0].getMeasuredWidth());
            l81Var.E(viewArr4[0], (-r2.getMeasuredWidth()) * f10);
        } else {
            l81Var.E(view, (1.0f - f10) * (-viewArr3[0].getMeasuredWidth()));
            l81Var.E(viewArr4[0], r2.getMeasuredWidth() * f10);
        }
        l81Var.w(false);
    }

    @Override // ra.m
    public Object s2() {
        Type type = (Type) this.b;
        if (!(type instanceof ParameterizedType)) {
            throw new pa.j("Invalid EnumSet type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return EnumSet.noneOf((Class) type2);
        }
        throw new pa.j("Invalid EnumSet type: " + type.toString());
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        JSONObject jSONObject;
        FileWriter fileWriter;
        e3.g gVar = (e3.g) this.b;
        com.google.android.gms.internal.clearcut.e eVar = (com.google.android.gms.internal.clearcut.e) gVar.f;
        p9.c cVar = (p9.c) gVar.b;
        String str = eVar.a;
        FileWriter fileWriter2 = null;
        try {
            HashMap b10 = com.google.android.gms.internal.clearcut.e.b(cVar);
            w0 w0Var = new w0(str, b10);
            w0Var.w("User-Agent", "Crashlytics Android SDK/18.6.0");
            w0Var.w("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
            com.google.android.gms.internal.clearcut.e.a(w0Var, cVar);
            String str2 = "Requesting settings from " + str;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
            String str3 = "Settings query params were: " + b10;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str3, null);
            }
            jSONObject = eVar.c(w0Var.p());
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "Settings request failed.", e);
            jSONObject = null;
        }
        if (jSONObject != null) {
            p9.a f10 = ((qk0) gVar.c).f(jSONObject);
            f1 f1Var = (f1) gVar.e;
            long j10 = f10.c;
            f1Var.getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                jSONObject.put("expires_at", j10);
                fileWriter = new FileWriter((File) f1Var.b);
                try {
                    try {
                        fileWriter.write(jSONObject.toString());
                        fileWriter.flush();
                    } catch (Exception e6) {
                        e = e6;
                        Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                        i9.h.c(fileWriter, "Failed to close settings writer.");
                        e3.g.f("Loaded settings: ", jSONObject);
                        String str4 = cVar.f;
                        SharedPreferences.Editor edit = ((Context) gVar.a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                        edit.putString("existing_instance_identifier", str4);
                        edit.apply();
                        ((AtomicReference) gVar.h).set(f10);
                        ((TaskCompletionSource) ((AtomicReference) gVar.i).get()).trySetResult(f10);
                        return Tasks.forResult(null);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileWriter2 = fileWriter;
                    i9.h.c(fileWriter2, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e10) {
                e = e10;
                fileWriter = null;
            } catch (Throwable th3) {
                th = th3;
                i9.h.c(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
            i9.h.c(fileWriter, "Failed to close settings writer.");
            e3.g.f("Loaded settings: ", jSONObject);
            String str42 = cVar.f;
            SharedPreferences.Editor edit2 = ((Context) gVar.a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            edit2.putString("existing_instance_identifier", str42);
            edit2.apply();
            ((AtomicReference) gVar.h).set(f10);
            ((TaskCompletionSource) ((AtomicReference) gVar.i).get()).trySetResult(f10);
        }
        return Tasks.forResult(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // od.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object z(od.c cVar, wc.c cVar2) {
        od.a aVar;
        int i10;
        Throwable th2;
        pd.g gVar;
        if (cVar2 instanceof od.a) {
            aVar = (od.a) cVar2;
            int i11 = aVar.d;
            if ((i11 & TLObject.FLAG_31) != 0) {
                aVar.d = i11 - TLObject.FLAG_31;
                Object obj = aVar.b;
                vc.a aVar2 = vc.a.a;
                i10 = aVar.d;
                sc.i iVar = sc.i.a;
                if (i10 != 0) {
                    p7.b(obj);
                    pd.g gVar2 = new pd.g(cVar, aVar.getContext());
                    try {
                        aVar.a = gVar2;
                        aVar.d = 1;
                        Object invoke = ((k1.p) this.b).invoke(gVar2, aVar);
                        if (invoke != aVar2) {
                            invoke = iVar;
                        }
                        if (invoke == aVar2) {
                            return aVar2;
                        }
                        gVar = gVar2;
                    } catch (Throwable th3) {
                        th2 = th3;
                        gVar = gVar2;
                        gVar.releaseIntercepted();
                        throw th2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gVar = aVar.a;
                    try {
                        p7.b(obj);
                    } catch (Throwable th4) {
                        th2 = th4;
                        gVar.releaseIntercepted();
                        throw th2;
                    }
                }
                gVar.releaseIntercepted();
                return iVar;
            }
        }
        aVar = new od.a(this, cVar2);
        Object obj2 = aVar.b;
        vc.a aVar22 = vc.a.a;
        i10 = aVar.d;
        sc.i iVar2 = sc.i.a;
        if (i10 != 0) {
        }
        gVar.releaseIntercepted();
        return iVar2;
    }

    public o(int i10) {
        this.a = i10;
        switch (i10) {
            case 9:
                break;
            case 23:
                this.b = new SparseArray();
                break;
            default:
                this.b = new HashMap();
                break;
        }
    }

    @Override // org.telegram.ui.Components.f71
    public /* synthetic */ void onRenderedFirstFrame(k3.a aVar) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.f71
    public void onError(i71 i71Var, Exception exc) {
        switch (this.a) {
            case 5:
                FileLog.e(exc);
                break;
        }
    }

    public o(String str) {
        this.a = 18;
        str.getClass();
        this.b = str;
    }

    private final void r() {
    }

    private final void t() {
    }

    @Override // yf.m
    public void c0() {
    }

    private final /* synthetic */ void A(SurfaceTexture surfaceTexture) {
    }

    private final /* synthetic */ void B(SurfaceTexture surfaceTexture) {
    }

    private final /* synthetic */ void s(k3.a aVar) {
    }

    private final /* synthetic */ void u(k3.a aVar) {
    }

    private final /* synthetic */ void v(k3.a aVar) {
    }

    private final /* synthetic */ void w(k3.a aVar) {
    }

    private final /* synthetic */ void x(k3.a aVar) {
    }

    private final /* synthetic */ void y(k3.a aVar) {
    }

    @Override // yf.m
    public void H(boolean z4) {
    }

    @Override // yf.m
    public void b0(boolean z4) {
    }

    private final void p(i71 i71Var, Exception exc) {
    }

    private final void C(int i10, int i11, float f10, int i12) {
    }
}
