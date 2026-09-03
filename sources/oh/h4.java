package oh;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.Editable;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import j$.util.Objects;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.d81;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.j81;
import org.telegram.ui.Components.l81;
import org.telegram.ui.Components.lq0;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.y50;
import org.telegram.ui.Components.z50;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.a01;
import org.telegram.ui.fz0;
import org.telegram.ui.ti0;
import qh.ba;
import qh.fa;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class h4 implements e9, org.telegram.ui.Components.y4, og.g, g71, j81, androidx.activity.result.b, SuccessContinuation, zf.m, fa, g5.n0, OnSuccessListener, ra.m, u5.o, t5.a, uf.j1, androidx.lifecycle.s0, v4.f, wh.d1, xd.b {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ h4(int i10, boolean z4) {
        this.a = i10;
    }

    @Override // qh.fa
    public void A(float f10) {
        qh.i5 i5Var = (qh.i5) this.b;
        qh.r6 r6Var = i5Var.d;
        if (r6Var == null) {
            return;
        }
        r6Var.G = f10;
        r6Var.j = true;
        i5Var.c();
    }

    @Override // qh.fa
    public void B(long j10, boolean z4) {
        qh.i5 i5Var = (qh.i5) this.b;
        if (!z4) {
            i5Var.m(j10);
            return;
        }
        j71 j71Var = i5Var.e;
        if (j71Var != null) {
            j71Var.L(j10, true);
            return;
        }
        if (i5Var.j()) {
            i5Var.B.m(j10, true);
            return;
        }
        j71 j71Var2 = i5Var.y;
        if (j71Var2 != null) {
            j71Var2.L(j10, false);
        }
    }

    @Override // androidx.lifecycle.s0
    public androidx.lifecycle.p0 C(Class cls, v1.b bVar) {
        androidx.lifecycle.m0 m0Var = null;
        for (v1.c cVar : (v1.c[]) this.b) {
            if (cVar.a.equals(cls)) {
                m0Var = new androidx.lifecycle.m0();
            }
        }
        if (m0Var != null) {
            return m0Var;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }

    @Override // wh.d1
    public /* synthetic */ boolean D(wh.e1 e1Var) {
        return false;
    }

    public void E(StringBuilder sb, AbstractCollection abstractCollection) {
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
        } catch (IOException e6) {
            throw new AssertionError(e6);
        }
    }

    @Override // qh.fa
    public void E0(int i10, long j10) {
        ArrayList arrayList;
        qh.i5 i5Var = (qh.i5) this.b;
        qh.r6 r6Var = i5Var.d;
        if (r6Var == null || (arrayList = r6Var.T) == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        ((qh.r6) i5Var.d.T.get(i10)).X = j10;
    }

    @Override // qh.fa
    public void G() {
        qh.i5 i5Var = (qh.i5) this.b;
        i5Var.s(null, null, true);
        ba baVar = ((qh.p9) i5Var).z0;
        qh.p9 p9Var = baVar.U0;
        if (p9Var != null) {
            p9Var.s(null, null, true);
        }
        qh.e9 e9Var = baVar.s1;
        if (e9Var != null) {
            e9Var.q0();
        }
        qh.q9 q9Var = baVar.Z0;
        if (q9Var != null) {
            q9Var.setHasRoundVideo(false);
        }
        qh.r6 r6Var = baVar.H1;
        if (r6Var != null) {
            File file = r6Var.o0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                baVar.H1.o0 = null;
            }
            if (baVar.H1.p0 != null) {
                try {
                    new File(baVar.H1.p0).delete();
                } catch (Exception unused2) {
                }
                baVar.H1.p0 = null;
            }
        }
    }

    @Override // wh.d1
    public void H(CharSequence charSequence) {
        wh.y2 y2Var = ((wh.i5) this.b).B;
        if (y2Var == null || charSequence == null || charSequence.length() <= 0) {
            return;
        }
        y2Var.a.s4(charSequence.toString());
    }

    @Override // qh.fa
    public void H0(long j10) {
        qh.i5 i5Var = (qh.i5) this.b;
        qh.r6 r6Var = i5Var.d;
        if (r6Var == null) {
            return;
        }
        r6Var.D = j10;
        r6Var.j = true;
        i5Var.w(true);
    }

    @Override // org.telegram.ui.Components.y4
    public void I(int i10, int i11, boolean z4) {
        switch (this.a) {
            case 1:
                org.telegram.ui.Components.f0 f0Var = (org.telegram.ui.Components.f0) this.b;
                f0Var.l0(i10, i11, z4);
                f0Var.dismiss();
                break;
            case 25:
                ((wh.q) this.b).H(i10, z4, i11, false, 0L);
                wh.q qVar = (wh.q) this.b;
                ti0 ti0Var = qVar.L;
                if (ti0Var != null) {
                    ti0Var.i();
                    qVar.L = null;
                    break;
                }
                break;
            default:
                ((wh.z1) this.b).s0(i10, i11, z4);
                break;
        }
    }

    @Override // qh.fa
    public void J(float f10) {
        qh.i5 i5Var = (qh.i5) this.b;
        qh.r6 r6Var = i5Var.d;
        if (r6Var == null) {
            return;
        }
        r6Var.s0 = f10;
        r6Var.j = true;
        i5Var.y(true);
    }

    @Override // uf.j1
    public /* synthetic */ a0.h K() {
        return null;
    }

    @Override // xd.b
    public void L(int i10, float f10, float f11, xd.c cVar) {
        ((xd.h) this.b).i(f10);
    }

    public q5.o M() {
        q5.o oVar = (q5.o) this.b;
        if (oVar.a == null) {
            throw new IllegalArgumentException("media cannot be null.");
        }
        if (!Double.isNaN(oVar.d) && oVar.d < 0.0d) {
            throw new IllegalArgumentException("startTime cannot be negative or NaN.");
        }
        if (Double.isNaN(oVar.e)) {
            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
        }
        if (Double.isNaN(oVar.f) || oVar.f < 0.0d) {
            throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
        }
        return oVar;
    }

    @Override // wh.d1
    public void O(Editable editable) {
        wh.i5 i5Var = (wh.i5) this.b;
        wh.a aVar = i5Var.a;
        if (aVar != null) {
            aVar.s = true;
            aVar.r = i5Var.r.B;
        }
        i5Var.u();
        wh.y2 y2Var = i5Var.B;
        if (y2Var == null || i5Var.a == null) {
            return;
        }
        y2Var.a();
    }

    @Override // og.g
    public void P(g.x xVar) {
        switch (this.a) {
            case 2:
                xVar.a(((mi) this.b).getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                xVar.b(SharedConfig.chatBlurEnabled());
                break;
            default:
                xVar.a(((lq0) this.b).getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                xVar.b(SharedConfig.chatBlurEnabled());
                break;
        }
    }

    public boolean Q(int i10) {
        d81 d81Var = ((l81) this.b).I;
        if (d81Var == null) {
            return false;
        }
        return d81Var.c(i10);
    }

    @Override // uf.j1
    public /* synthetic */ boolean R(int i10) {
        return true;
    }

    @Override // wh.d1
    public /* synthetic */ boolean T(boolean z4) {
        return false;
    }

    @Override // qh.fa
    public void U(boolean z4) {
        qh.i5 i5Var = (qh.i5) this.b;
        if (i5Var.j()) {
            i5Var.B.getClass();
        }
        i5Var.x(-4, z4);
    }

    @Override // uf.j1
    public void V(ArrayList arrayList) {
        uf.u0 u0Var = (uf.u0) this.b;
        String str = u0Var.W;
        if (str != null) {
            u0Var.U(str, u0Var.Z, u0Var.a0, u0Var.Y, u0Var.X);
        }
    }

    @Override // qh.fa
    public void W(float f10, int i10) {
        ArrayList arrayList;
        qh.i5 i5Var = (qh.i5) this.b;
        qh.r6 r6Var = i5Var.d;
        if (r6Var == null || (arrayList = r6Var.T) == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        ((qh.r6) i5Var.d.T.get(i10)).P = f10;
    }

    @Override // qh.fa
    public void X(float f10) {
        qh.i5 i5Var = (qh.i5) this.b;
        qh.r6 r6Var = i5Var.d;
        if (r6Var == null) {
            return;
        }
        r6Var.P = f10;
        i5Var.c();
    }

    public void Y(Runnable runnable) {
        Runnable runnable2 = (Runnable) ((HashMap) this.b).remove(runnable);
        if (runnable2 != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable2);
        }
    }

    public void Z() {
        HashMap hashMap = (HashMap) this.b;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            AndroidUtilities.cancelRunOnUIThread((Runnable) ((Map.Entry) it.next()).getValue());
        }
        hashMap.clear();
    }

    @Override // g5.n0
    public void a() {
        r4.g gVar = (r4.g) this.b;
        gVar.B.a();
        b7.y0 y0Var = gVar.D;
        if (y0Var != null) {
            throw y0Var;
        }
    }

    public void a0(StringBuilder sb) {
        sb.append(((Boolean) e2.c.g(1, (ArrayList) this.b)).booleanValue() ? "</ol>" : "</ul>");
    }

    @Override // oh.e9
    public void b0(long j10, int i10, l3 l3Var) {
        fz0 fz0Var = (fz0) this.b;
        int i11 = ProfileStoriesView.p0;
        fz0Var.f(true, false);
        l3Var.run();
    }

    @Override // wh.d1
    public void c(wh.e1 e1Var) {
        wh.y2 y2Var = ((wh.i5) this.b).B;
        if (y2Var != null) {
            wh.r3 r3Var = y2Var.a;
            wh.r3.L1(r3Var, e1Var);
            r3Var.e3.h(e1Var, true);
        }
    }

    public void c0(StringBuilder sb) {
        while (!((ArrayList) this.b).isEmpty()) {
            a0(sb);
        }
    }

    @Override // v4.f
    public int d(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    @Override // qh.fa
    public void d0(float f10, boolean z4) {
        qh.i5 i5Var = (qh.i5) this.b;
        qh.r6 r6Var = i5Var.d;
        if (r6Var == null) {
            return;
        }
        r6Var.Z = f10;
        r6Var.j = true;
        j71 j71Var = i5Var.e;
        if (j71Var == null || j71Var.p() == -9223372036854775807L) {
            return;
        }
        i5Var.m((long) (f10 * i5Var.e.p()));
    }

    @Override // wh.d1
    public boolean e() {
        wh.i5 i5Var = (wh.i5) this.b;
        wh.y2 y2Var = i5Var.B;
        if (y2Var == null || i5Var.a == null) {
            return false;
        }
        return y2Var.a.R4();
    }

    public int e0(int i10, int[] iArr) {
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

    @Override // qh.fa
    public void f(int i10) {
        qh.y yVar = ((qh.i5) this.b).B;
        if (yVar != null) {
            ArrayList arrayList = yVar.h;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                qh.x xVar = (qh.x) obj;
                if (xVar.a == i10) {
                    xVar.b.d(1.0f, true);
                    yVar.invalidate();
                    return;
                }
            }
        }
    }

    public void f0(float f10) {
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

    @Override // uf.j1
    public void g(int i10) {
        ((uf.u0) this.b).l();
    }

    @Override // androidx.lifecycle.s0
    public androidx.lifecycle.p0 h(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    @Override // qh.fa
    public void h0(long j10) {
        qh.i5 i5Var = (qh.i5) this.b;
        qh.r6 r6Var = i5Var.d;
        if (r6Var == null) {
            return;
        }
        r6Var.r0 = j10;
        r6Var.j = true;
        i5Var.y(true);
    }

    @Override // og.g
    public void i(Canvas canvas) {
        switch (this.a) {
            case 2:
                mi miVar = (mi) this.b;
                canvas.drawColor(miVar.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                if (SharedConfig.chatBlurEnabled()) {
                    miVar.z2.b(canvas, -3);
                    break;
                }
                break;
            default:
                lq0 lq0Var = (lq0) this.b;
                canvas.drawColor(lq0Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                if (SharedConfig.chatBlurEnabled()) {
                    lq0Var.L0.b(canvas, -3);
                    break;
                }
                break;
        }
    }

    @Override // wh.d1
    public void j(int i10, int i11) {
        wh.d2 d2Var;
        wh.i5 i5Var = (wh.i5) this.b;
        wh.y2 y2Var = i5Var.B;
        if (y2Var == null || i5Var.a == null || (d2Var = y2Var.a.G3) == null) {
            return;
        }
        d2Var.f(i10, i11);
    }

    @Override // qh.fa
    public void j0(boolean z4) {
        eg.z2 z2Var;
        ba baVar = ((qh.p9) ((qh.i5) this.b)).z0;
        qh.e9 e9Var = baVar.s1;
        if (e9Var == null) {
            return;
        }
        eg.z2 z2Var2 = null;
        if (!z4 && (e9Var.getSelectedEntity() instanceof eg.z2)) {
            baVar.s1.D0(null, true);
            return;
        }
        if (!z4 || (baVar.s1.getSelectedEntity() instanceof eg.z2)) {
            return;
        }
        qh.v4 v4Var = baVar.s1.O0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= v4Var.getChildCount()) {
                z2Var = null;
                break;
            }
            View childAt = v4Var.getChildAt(i11);
            if (childAt instanceof eg.z2) {
                z2Var = (eg.z2) childAt;
                break;
            }
            i11++;
        }
        if (z2Var != null) {
            qh.e9 e9Var2 = baVar.s1;
            qh.v4 v4Var2 = e9Var2.O0;
            while (true) {
                if (i10 >= v4Var2.getChildCount()) {
                    break;
                }
                View childAt2 = v4Var2.getChildAt(i10);
                if (childAt2 instanceof eg.z2) {
                    z2Var2 = (eg.z2) childAt2;
                    break;
                }
                i10++;
            }
            e9Var2.D0(z2Var2, true);
        }
    }

    @Override // androidx.activity.result.b
    public void k(Object obj) {
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
            com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i10);
            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i10);
        }
        int i11 = com.google.android.gms.internal.play_billing.u.e("ProxyBillingActivityV2", intent).a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.L;
        if (resultReceiver != null) {
            resultReceiver.send(i11, extras);
        } else {
            com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer flow result receiver is null");
        }
        if (i11 != 0) {
            com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i11);
        }
        proxyBillingActivityV2.finish();
    }

    @Override // oh.e9
    public boolean k1(long j10, int i10, int i11, int i12, f9 f9Var) {
        ImageReceiver imageReceiver;
        i4 i4Var;
        i4 i4Var2;
        f9Var.b = null;
        f9Var.c = null;
        fz0 fz0Var = (fz0) this.b;
        a01 a01Var = fz0Var.h;
        ArrayList arrayList = fz0Var.w;
        if (fz0Var.K < 0.2f) {
            f9Var.b = a01Var.getImageReceiver();
            f9Var.c = null;
            f9Var.a = a01Var;
            f9Var.h = 0.0f;
            f9Var.i = AndroidUtilities.displaySize.y;
            f9Var.g = (View) fz0Var.getParent();
            f9Var.d = fz0Var.y;
            f9Var.n = true;
            return true;
        }
        int i13 = 0;
        while (true) {
            if (i13 >= arrayList.size()) {
                imageReceiver = null;
                i4Var = null;
                i4Var2 = null;
                break;
            }
            i4 i4Var3 = (i4) arrayList.get(i13);
            if (i4Var3.e >= 1.0f && i4Var3.a == i11) {
                int i14 = i13 - 1;
                int i15 = i13 - 2;
                i4 d = ProfileStoriesView.d(i14 >= 0 ? (i4) arrayList.get(i14) : null, i15 >= 0 ? (i4) arrayList.get(i15) : null, i4Var3);
                imageReceiver = i4Var3.b;
                i4Var2 = d;
                i4Var = i4Var3;
            }
            i13++;
        }
        if (imageReceiver == null) {
            return false;
        }
        f9Var.c = imageReceiver;
        f9Var.b = null;
        f9Var.a = fz0Var;
        f9Var.h = 0.0f;
        f9Var.i = AndroidUtilities.displaySize.y;
        f9Var.g = (View) fz0Var.getParent();
        if (i4Var == null || i4Var2 == null) {
            f9Var.f = null;
            return true;
        }
        f9Var.f = new f1.a(this, new RectF(i4Var.m), i4Var, new RectF(i4Var2.m), i4Var2);
        return true;
    }

    @Override // v4.f
    public long l(int i10) {
        h5.a.f(i10 == 0);
        return 0L;
    }

    @Override // u5.o
    public void m(String str, long j10, long j11, long j12) {
        s5.o oVar = (s5.o) this.b;
        try {
            oVar.a(new s5.n(new Status(2103, null, null, null), 1));
        } catch (IllegalStateException e6) {
            u5.b bVar = s5.h.k;
            Log.e(bVar.a, bVar.d("Result already set when calling onRequestReplaced", new Object[0]), e6);
        }
        Iterator it = oVar.q.i.iterator();
        while (it.hasNext()) {
            ((s5.g) it.next()).h(str, j10, 2103, j11, j12);
        }
    }

    @Override // qh.fa
    public void m0(float f10, int i10) {
        ArrayList arrayList;
        qh.i5 i5Var = (qh.i5) this.b;
        qh.r6 r6Var = i5Var.d;
        if (r6Var == null || (arrayList = r6Var.T) == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        ((qh.r6) i5Var.d.T.get(i10)).V = f10;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004d A[LOOP:0: B:16:0x0047->B:18:0x004d, LOOP_END] */
    @Override // u5.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void n(String str, long j10, int i10, Object obj, long j11, long j12) {
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
            } catch (IllegalStateException e6) {
                e = e6;
                u5.b bVar = s5.h.k;
                Log.e(bVar.a, bVar.d("Result already set when calling onRequestCompleted", new Object[0]), e);
                it = oVar.q.i.iterator();
                while (it.hasNext()) {
                }
            }
        } catch (IllegalStateException e10) {
            e = e10;
            i11 = i10;
        }
        it = oVar.q.i.iterator();
        while (it.hasNext()) {
            ((s5.g) it.next()).h(str, j10, i11, j11, j12);
            i11 = i10;
        }
    }

    @Override // org.telegram.ui.Components.g71
    public void onError(j71 j71Var, Exception exc) {
        FileLog.e(exc);
    }

    @Override // org.telegram.ui.Components.g71
    public /* synthetic */ void onRenderedFirstFrame(k3.a aVar) {
    }

    @Override // org.telegram.ui.Components.g71
    public void onStateChanged(boolean z4, int i10) {
        z50 z50Var;
        VideoEditedInfo videoEditedInfo;
        y50 y50Var = (y50) this.b;
        j71 j71Var = y50Var.E0.L;
        if (j71Var != null && j71Var.y() && i10 == 4 && (videoEditedInfo = (z50Var = y50Var.E0).K) != null) {
            j71 j71Var2 = z50Var.L;
            long j10 = videoEditedInfo.startTime;
            if (j10 <= 0) {
                j10 = 0;
            }
            j71Var2.K(j10);
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ((r5.a) this.b).getClass();
        j7.r5.a("com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES", (Bundle) obj);
    }

    @Override // org.telegram.ui.Components.g71
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    public void p(HashMap hashMap) {
        if (((SparseArray) this.b) == null) {
            this.b = new SparseArray(hashMap.size());
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            ((SparseArray) this.b).put(((String) entry.getKey()).hashCode(), (String) entry.getValue());
        }
    }

    @Override // v4.f
    public List q(long j10) {
        return j10 >= 0 ? (List) this.b : Collections.EMPTY_LIST;
    }

    @Override // wh.d1
    public /* synthetic */ boolean r(wh.e1 e1Var) {
        return false;
    }

    @Override // qh.fa
    public void r0(float f10) {
        qh.i5 i5Var = (qh.i5) this.b;
        qh.r6 r6Var = i5Var.d;
        if (r6Var == null) {
            return;
        }
        r6Var.F = f10;
        r6Var.j = true;
        i5Var.w(true);
    }

    @Override // wh.d1
    public void s(wh.e1 e1Var, int i10, int i11) {
        wh.y2 y2Var;
        org.telegram.ui.Cells.m9 textSelectionHelper;
        wh.i5 i5Var = (wh.i5) this.b;
        if (i5Var.D || i10 == i11 || (y2Var = i5Var.B) == null || (textSelectionHelper = y2Var.a.getTextSelectionHelper()) == null) {
            return;
        }
        if (textSelectionHelper.y() && textSelectionHelper.W == i5Var) {
            return;
        }
        i5Var.post(new org.telegram.messenger.p6(this, e1Var, i11, textSelectionHelper, i10, 6));
    }

    @Override // t5.a
    public void t(Bitmap bitmap) {
        u5.b bVar = t5.h.v;
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            float f10 = width;
            int height = bitmap.getHeight();
            int d = (int) android.support.v4.media.a.d(f10, 9.0f, 16.0f, 0.5f);
            float f11 = (d - height) / 2.0f;
            RectF rectF = new RectF(0.0f, f11, f10, height + f11);
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, d, config);
            new Canvas(createBitmap).drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
            bitmap2 = createBitmap;
        }
        ((t5.h) this.b).e(bitmap2, 0);
    }

    @Override // qh.fa
    public void t0(float f10) {
        qh.i5 i5Var = (qh.i5) this.b;
        qh.r6 r6Var = i5Var.d;
        if (r6Var == null) {
            return;
        }
        r6Var.E = f10;
        r6Var.j = true;
        i5Var.w(true);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        JSONObject jSONObject;
        FileWriter fileWriter;
        e3.g gVar = (e3.g) this.b;
        hc.a aVar = (hc.a) gVar.f;
        p9.c cVar = (p9.c) gVar.b;
        String str = aVar.a;
        FileWriter fileWriter2 = null;
        try {
            HashMap b10 = hc.a.b(cVar);
            l7.w0 w0Var = new l7.w0(str, b10);
            w0Var.w("User-Agent", "Crashlytics Android SDK/18.6.0");
            w0Var.w("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
            hc.a.a(w0Var, cVar);
            String str2 = "Requesting settings from " + str;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
            String str3 = "Settings query params were: " + b10;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str3, null);
            }
            jSONObject = aVar.c(w0Var.p());
        } catch (IOException e6) {
            Log.e("FirebaseCrashlytics", "Settings request failed.", e6);
            jSONObject = null;
        }
        if (jSONObject != null) {
            p9.a i10 = ((org.telegram.ui.web.e0) gVar.c).i(jSONObject);
            org.telegram.ui.Cells.f1 f1Var = (org.telegram.ui.Cells.f1) gVar.e;
            long j10 = i10.c;
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
                    } catch (Exception e10) {
                        e = e10;
                        Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                        i9.h.c(fileWriter, "Failed to close settings writer.");
                        e3.g.f("Loaded settings: ", jSONObject);
                        String str4 = cVar.f;
                        SharedPreferences.Editor edit = ((Context) gVar.a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                        edit.putString("existing_instance_identifier", str4);
                        edit.apply();
                        ((AtomicReference) gVar.h).set(i10);
                        ((TaskCompletionSource) ((AtomicReference) gVar.i).get()).trySetResult(i10);
                        return Tasks.forResult(null);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileWriter2 = fileWriter;
                    i9.h.c(fileWriter2, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
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
            ((AtomicReference) gVar.h).set(i10);
            ((TaskCompletionSource) ((AtomicReference) gVar.i).get()).trySetResult(i10);
        }
        return Tasks.forResult(null);
    }

    @Override // qh.fa
    public void u(float f10) {
        qh.i5 i5Var = (qh.i5) this.b;
        qh.r6 r6Var = i5Var.d;
        if (r6Var == null) {
            return;
        }
        r6Var.u0 = f10;
        r6Var.j = true;
        i5Var.c();
    }

    @Override // qh.fa
    public void u0(float f10, int i10) {
        ArrayList arrayList;
        qh.i5 i5Var = (qh.i5) this.b;
        qh.r6 r6Var = i5Var.d;
        if (r6Var == null || (arrayList = r6Var.T) == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        ((qh.r6) i5Var.d.T.get(i10)).W = f10;
    }

    @Override // qh.fa
    public void v0(float f10) {
        qh.r6 r6Var = ((qh.i5) this.b).d;
        if (r6Var == null) {
            return;
        }
        r6Var.a0 = f10;
        r6Var.j = true;
    }

    @Override // zf.m
    public void w() {
        ((qh.c0) this.b).d.invalidate();
    }

    @Override // qh.fa
    public void w0() {
        ((qh.i5) this.b).p(null);
    }

    @Override // v4.f
    public int x() {
        return 1;
    }

    @Override // uf.j1
    public /* synthetic */ a0.h y() {
        return null;
    }

    @Override // qh.fa
    public void y0(float f10) {
        qh.i5 i5Var = (qh.i5) this.b;
        qh.r6 r6Var = i5Var.d;
        if (r6Var == null) {
            return;
        }
        r6Var.t0 = f10;
        r6Var.j = true;
        i5Var.y(true);
    }

    @Override // ra.m
    public Object y2() {
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

    @Override // xd.b
    public void z(float f10, int i10) {
        ((xd.h) this.b).i(f10);
    }

    public /* synthetic */ h4(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.g71
    public void onRenderedFirstFrame() {
    }

    public h4(MediaInfo mediaInfo) {
        this.a = 10;
        q5.o oVar = new q5.o(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        if (mediaInfo != null) {
            this.b = oVar;
            return;
        }
        throw new IllegalArgumentException("media cannot be null.");
    }

    public h4(JSONObject jSONObject) {
        this.a = 10;
        this.b = new q5.o(jSONObject);
    }

    public h4(int i10) {
        this.a = i10;
        switch (i10) {
            case 27:
                this.b = new ArrayList();
                break;
            default:
                this.b = new HashMap();
                break;
        }
    }

    public h4(String str) {
        this.a = 15;
        str.getClass();
        this.b = str;
    }

    public h4(v1.c[] initializers) {
        this.a = 22;
        kotlin.jvm.internal.j.e(initializers, "initializers");
        this.b = initializers;
    }

    @Override // zf.m
    public void S() {
    }

    @Override // wh.d1
    public /* synthetic */ void v() {
    }

    @Override // zf.m
    public void F(boolean z4) {
    }

    @Override // zf.m
    public void N(boolean z4) {
    }

    @Override // oh.e9
    public /* synthetic */ void b(boolean z4) {
    }

    @Override // wh.d1
    public /* synthetic */ void o(wh.e1 e1Var) {
    }

    @Override // org.telegram.ui.Components.g71
    public /* synthetic */ void onSeekFinished(k3.a aVar) {
    }

    @Override // org.telegram.ui.Components.g71
    public /* synthetic */ void onSeekStarted(k3.a aVar) {
    }

    @Override // org.telegram.ui.Components.g71
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // org.telegram.ui.Components.g71
    public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
    }
}
