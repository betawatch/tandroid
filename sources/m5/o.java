package m5;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.util.Log;
import android.view.GestureDetector;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.lifecycle.m0;
import androidx.lifecycle.s0;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.internal.cast.c1;
import com.google.android.gms.internal.cast.c2;
import com.google.android.gms.internal.cast.o0;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import m.t3;
import oh.p0;
import oh.q0;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.iq0;
import org.telegram.ui.Components.j50;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.k50;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.n71;
import org.telegram.ui.Components.ng0;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.sp0;
import org.telegram.ui.Components.x4;
import org.telegram.ui.i6;
import org.telegram.ui.rn;
import rh.b2;
import rh.b4;
import rh.d1;
import rh.d3;
import rh.i3;
import rh.j3;
import rh.m3;
import rh.m4;
import rh.n3;
import rh.o3;
import rh.p3;
import rh.t5;
import rh.x1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class o implements androidx.activity.result.b, OnSuccessListener, r5.o, oa.m, p0, x4, jg.g, j61, n71, ma.n, rh.g0, n3, com.google.android.gms.common.api.internal.s, r4.g, s0 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ o(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // jg.g
    public void A(g.y yVar) {
        switch (this.a) {
            case 9:
                yVar.a(((gi) this.b).getThemedColor(g6.d6));
                yVar.b(SharedConfig.chatBlurEnabled());
                break;
            default:
                yVar.a(((sp0) this.b).getThemedColor(g6.d6));
                yVar.b(SharedConfig.chatBlurEnabled());
                break;
        }
    }

    @Override // rh.n3
    public b70 A1(View view) {
        return b70.H((x1) this.b, view);
    }

    public float B(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = 1;
        boolean z10 = Math.abs(i13 - i11) > Math.abs(i12 - i10);
        if (z10) {
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
            boolean z11 = z10;
            int i26 = abs;
            if ((i25 == i18) == ((mb.b) this.b).b(z10 ? i24 : i23, z10 ? i23 : i24)) {
                if (i25 == 2) {
                    return h7.y.b(i23, i24, i14, i15);
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
            z10 = z11;
            i18 = 1;
        }
        if (i25 == 2) {
            return h7.y.b(i22, i17, i14, i15);
        }
        return Float.NaN;
    }

    @Override // rh.n3
    public void C(m3 m3Var, View view) {
        x1 x1Var = (x1) this.b;
        b70 H = b70.H(x1Var, view);
        H.Q = true;
        x1Var.t0 = b4.c(H, x1Var, x1Var.getParentActivity(), x1Var.getResourceProvider(), m3Var, false);
    }

    public float D(int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        mb.b bVar = (mb.b) this.b;
        float B = B(i10, i11, i12, i13);
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
        return (B(i10, i11, (int) (((i14 - i10) * f11) + i10), i15) + B) - 1.0f;
    }

    @Override // rh.n3
    public void D0() {
        x1 x1Var = (x1) this.b;
        x1Var.E0 = x1Var.G0;
        x1.Z(x1Var, false, false);
        x1Var.x0(2, true);
    }

    @Override // org.telegram.ui.Components.x4
    public void I(int i10, int i11, boolean z10) {
        org.telegram.ui.Components.e0 e0Var = (org.telegram.ui.Components.e0) this.b;
        e0Var.l0(i10, i11, z10);
        e0Var.dismiss();
    }

    @Override // rh.g0
    public void I0() {
        switch (this.a) {
            case 18:
                rh.x xVar = (rh.x) this.b;
                j3 j3Var = xVar.K;
                if (j3Var != null) {
                    rh.a aVar = xVar.a;
                    p3 p3Var = j3Var.a;
                    b2 b2Var = p3Var.F3;
                    if (b2Var != null) {
                        b2Var.g();
                    }
                    p3Var.d3.onContentChanged();
                    break;
                }
                break;
            default:
                m4 m4Var = (m4) this.b;
                i3 i3Var = m4Var.J;
                if (i3Var != null) {
                    rh.a aVar2 = m4Var.a;
                    p3 p3Var2 = i3Var.a;
                    b2 b2Var2 = p3Var2.F3;
                    if (b2Var2 != null) {
                        b2Var2.g();
                    }
                    p3Var2.d3.onContentChanged();
                    break;
                }
                break;
        }
    }

    @Override // rh.n3
    public void J1() {
        x1 x1Var = (x1) this.b;
        x1Var.z0();
        x1Var.C0();
    }

    @Override // rh.g0
    public j9 N() {
        switch (this.a) {
            case 18:
                j3 j3Var = ((rh.x) this.b).K;
                if (j3Var != null) {
                    return j3Var.a.getTextSelectionHelper();
                }
                return null;
            default:
                i3 i3Var = ((m4) this.b).J;
                if (i3Var != null) {
                    return i3Var.a.getTextSelectionHelper();
                }
                return null;
        }
    }

    @Override // rh.g0
    public void S(CharSequence charSequence) {
        switch (this.a) {
            case 18:
                j3 j3Var = ((rh.x) this.b).K;
                if (j3Var != null) {
                    j3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        j3Var.a.t4(charSequence.toString());
                        break;
                    }
                }
                break;
            default:
                i3 i3Var = ((m4) this.b).J;
                if (i3Var != null) {
                    i3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        i3Var.a.t4(charSequence.toString());
                        break;
                    }
                }
                break;
        }
    }

    @Override // rh.n3
    public void S1(o3 o3Var, View view) {
        x1 x1Var = (x1) this.b;
        b70 H = b70.H(x1Var, view);
        H.Q = true;
        x1Var.getParentActivity();
        x1Var.getResourceProvider();
        x1Var.t0 = b4.b(H, x1Var, o3Var, false);
    }

    @Override // rh.g0
    public void X0() {
        switch (this.a) {
            case 18:
                rh.x xVar = (rh.x) this.b;
                j3 j3Var = xVar.K;
                if (j3Var != null) {
                    rh.a aVar = xVar.a;
                    p3.O1(j3Var.a);
                    break;
                }
                break;
            default:
                m4 m4Var = (m4) this.b;
                i3 i3Var = m4Var.J;
                if (i3Var != null) {
                    rh.a aVar2 = m4Var.a;
                    p3.O1(i3Var.a);
                    break;
                }
                break;
        }
    }

    @Override // androidx.activity.result.b
    public void a(Object obj) {
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.b;
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.b;
        int i10 = com.google.android.gms.internal.play_billing.u.e("ProxyBillingActivityV2", intent).a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.I;
        if (resultReceiver != null) {
            resultReceiver.send(i10, intent == null ? null : intent.getExtras());
        }
        int i11 = aVar.a;
        if (i11 != -1 || i10 != 0) {
            com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i11 + " and billing's responseCode: " + i10);
        }
        proxyBillingActivityV2.finish();
    }

    @Override // rh.n3
    public void a0(t5 t5Var, String str) {
        x1 x1Var = (x1) this.b;
        if (x1Var.v0 == null) {
            x1Var.v0 = new t3(new lh.p(this, 22), x1Var.getResourceProvider());
        }
        x1Var.v0.f(t5Var, str);
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 22:
                GetCredentialRequest getCredentialRequest = (GetCredentialRequest) this.b;
                s6.f fVar = new s6.f(1, (TaskCompletionSource) obj2);
                s6.d dVar = (s6.d) ((s6.e) obj).u();
                com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true));
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i10 = b7.b.a;
                obtain.writeStrongBinder(fVar);
                b7.b.b(obtain, getCredentialRequest);
                b7.b.b(obtain, gVar);
                ((s6.b) dVar).E0(obtain, 1);
                break;
            default:
                k5.l lVar = new k5.l((TaskCompletionSource) obj2);
                t6.i iVar = (t6.i) ((t6.c) obj).u();
                h5.e eVar = (h5.e) this.b;
                Parcel I0 = iVar.I0();
                int i11 = t6.f.a;
                I0.writeStrongBinder(lVar);
                t6.f.c(I0, eVar);
                iVar.J0(I0, 1);
                break;
        }
    }

    @Override // oh.p0
    public void b(long j10) {
        ((oh.r) this.b).presentFragment(rn.R9(j10));
    }

    @Override // r4.g
    public int c(long j10) {
        return -1;
    }

    @Override // rh.n3
    public void c0(int i10) {
        ((x1) this.b).o0(74, i10);
    }

    @Override // oh.p0
    public void close() {
        ((oh.r) this.b).finishFragment();
    }

    @Override // r5.o
    public void d(String str, long j10, long j11, long j12) {
        o5.n nVar = (o5.n) this.b;
        try {
            nVar.a(new o5.m(new Status(2103, null, null, null), 1));
        } catch (IllegalStateException e9) {
            r5.b bVar = o5.h.k;
            Log.e(bVar.a, bVar.d("Result already set when calling onRequestReplaced", new Object[0]), e9);
        }
        Iterator it = nVar.q.i.iterator();
        while (it.hasNext()) {
            ((o5.g) it.next()).h(str, j10, 2103, j11, j12);
        }
    }

    @Override // androidx.lifecycle.s0
    public androidx.lifecycle.p0 e(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    @Override // r4.g
    public long f(int i10) {
        return 0L;
    }

    @Override // oa.m
    public Object f2() {
        Type type = (Type) this.b;
        if (!(type instanceof ParameterizedType)) {
            throw new ma.j("Invalid EnumMap type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return new EnumMap((Class) type2);
        }
        throw new ma.j("Invalid EnumMap type: " + type.toString());
    }

    @Override // rh.g0
    public void g(d1 d1Var) {
        switch (this.a) {
            case 18:
                j3 j3Var = ((rh.x) this.b).K;
                if (j3Var != null) {
                    p3 p3Var = j3Var.a;
                    p3.M1(p3Var, d1Var);
                    p3Var.d3.n0(d1Var, true);
                    break;
                }
                break;
            default:
                i3 i3Var = ((m4) this.b).J;
                if (i3Var != null) {
                    p3 p3Var2 = i3Var.a;
                    p3.M1(p3Var2, d1Var);
                    p3Var2.d3.n0(d1Var, true);
                    break;
                }
                break;
        }
    }

    @Override // r4.g
    public List h(long j10) {
        return (List) this.b;
    }

    @Override // rh.n3
    public void h0() {
        x1 x1Var = (x1) this.b;
        d3 d3Var = x1Var.L.j3;
        x1Var.x0((d3Var != null && d3Var.y() && x1Var.L.C4()) ? 1 : 0, true);
        x1Var.y0();
        x1Var.w0();
    }

    @Override // oh.p0
    public void i() {
        oh.r rVar = (oh.r) this.b;
        ud.a aVar = rVar.a;
        q0 q0Var = rVar.v;
        aVar.a(q0Var.n && q0Var.l == 0, true);
        rVar.d.U2.N(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004d A[LOOP:0: B:16:0x0047->B:18:0x004d, LOOP_END] */
    @Override // r5.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void j(String str, long j10, int i10, Object obj, long j11, long j12) {
        int i11;
        Iterator it;
        o5.n nVar = (o5.n) this.b;
        try {
            i11 = i10;
            try {
                Status status = new Status(i11, null, null, null);
                Object obj2 = true == (obj instanceof r5.m) ? obj : null;
                if (obj2 != null) {
                }
                if (obj2 != null) {
                }
                nVar.a(new o5.m(status, 2));
            } catch (IllegalStateException e9) {
                e = e9;
                r5.b bVar = o5.h.k;
                Log.e(bVar.a, bVar.d("Result already set when calling onRequestCompleted", new Object[0]), e);
                it = nVar.q.i.iterator();
                while (it.hasNext()) {
                }
            }
        } catch (IllegalStateException e10) {
            e = e10;
            i11 = i10;
        }
        it = nVar.q.i.iterator();
        while (it.hasNext()) {
            ((o5.g) it.next()).h(str, j10, i11, j11, j12);
            i11 = i10;
        }
    }

    public p k() {
        p pVar = (p) this.b;
        if (pVar.a == null) {
            throw new IllegalArgumentException("media cannot be null.");
        }
        if (!Double.isNaN(pVar.d) && pVar.d < 0.0d) {
            throw new IllegalArgumentException("startTime cannot be negative or NaN.");
        }
        if (Double.isNaN(pVar.e)) {
            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
        }
        if (Double.isNaN(pVar.f) || pVar.f < 0.0d) {
            throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
        }
        return pVar;
    }

    @Override // rh.n3
    public boolean l(float f10) {
        boolean z10;
        x1 x1Var = (x1) this.b;
        FrameLayout frameLayout = x1Var.r0;
        if (frameLayout != null) {
            frameLayout.getLocationOnScreen(new int[2]);
            if (f10 >= r3[1]) {
                z10 = true;
                x1.Z(x1Var, z10, true);
                return z10;
            }
        }
        z10 = false;
        x1.Z(x1Var, z10, true);
        return z10;
    }

    @Override // rh.n3
    public void l2(rh.a aVar) {
        x1 x1Var = (x1) this.b;
        if (aVar != null && (aVar.b instanceof TL_iv.pageBlockMap) && AndroidUtilities.isMapsInstalled(x1Var)) {
            gi giVar = new gi(x1Var.getParentActivity(), x1Var, false, false, false, x1Var.getResourceProvider());
            giVar.V1 = new ab.a(22);
            giVar.L = true;
            giVar.t1.setVisibility(8);
            giVar.p2 = new iq0(x1Var, aVar, giVar, 6);
            giVar.r1();
            giVar.show();
        }
    }

    @Override // rh.g0
    public void m() {
        switch (this.a) {
            case 18:
                rh.x xVar = (rh.x) this.b;
                j3 j3Var = xVar.K;
                if (j3Var != null) {
                    p3.P1(j3Var.a, xVar.a);
                    break;
                }
                break;
            default:
                m4 m4Var = (m4) this.b;
                i3 i3Var = m4Var.J;
                if (i3Var != null) {
                    p3.P1(i3Var.a, m4Var.a);
                    break;
                }
                break;
        }
    }

    @Override // jg.g
    public void n(Canvas canvas) {
        switch (this.a) {
            case 9:
                gi giVar = (gi) this.b;
                canvas.drawColor(giVar.getThemedColor(g6.d6));
                if (SharedConfig.chatBlurEnabled()) {
                    giVar.y2.b(canvas, -3);
                    break;
                }
                break;
            default:
                sp0 sp0Var = (sp0) this.b;
                canvas.drawColor(sp0Var.getThemedColor(g6.d6));
                if (SharedConfig.chatBlurEnabled()) {
                    sp0Var.K0.b(canvas, -3);
                    break;
                }
                break;
        }
    }

    public float o(rb.c cVar, rb.c cVar2) {
        int i10 = (int) cVar.a;
        int i11 = (int) cVar.b;
        int i12 = (int) cVar2.a;
        int i13 = (int) cVar2.b;
        float D = D(i10, i11, i12, i13);
        float D2 = D((int) cVar2.a, i13, (int) cVar.a, i11);
        return Float.isNaN(D) ? D2 / 7.0f : Float.isNaN(D2) ? D / 7.0f : (D + D2) / 14.0f;
    }

    @Override // rh.n3
    public void onContentChanged() {
        x1 x1Var = (x1) this.b;
        if (x1Var.u0 != null) {
            boolean m32 = x1Var.L.m3();
            x1Var.H0 = m32;
            x1Var.u0.h(m32);
            x1Var.u0.invalidate();
        }
        x1Var.C0();
        Runnable runnable = x1Var.I0;
        AndroidUtilities.cancelRunOnUIThread(runnable);
        AndroidUtilities.runOnUIThread(runnable, 1000L);
    }

    @Override // org.telegram.ui.Components.j61
    public void onError(m61 m61Var, Exception exc) {
        FileLog.e(exc);
    }

    @Override // org.telegram.ui.Components.j61
    public /* synthetic */ void onRenderedFirstFrame(i3.a aVar) {
    }

    @Override // org.telegram.ui.Components.j61
    public void onStateChanged(boolean z10, int i10) {
        k50 k50Var;
        VideoEditedInfo videoEditedInfo;
        j50 j50Var = (j50) this.b;
        m61 m61Var = j50Var.D0.K;
        if (m61Var != null && m61Var.z() && i10 == 4 && (videoEditedInfo = (k50Var = j50Var.D0).J) != null) {
            m61 m61Var2 = k50Var.K;
            long j10 = videoEditedInfo.startTime;
            if (j10 <= 0) {
                j10 = 0;
            }
            m61Var2.L(j10);
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        c2 c2Var;
        c1 b10;
        n5.a aVar = (n5.a) this.b;
        Bundle bundle = (Bundle) obj;
        if (o0.j) {
            Context context = aVar.a;
            r5.s sVar = aVar.f;
            o0 o0Var = new o0(context, sVar, aVar.c, aVar.j, aVar.g);
            int i10 = bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE") ? bundle.getInt("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", 0) : (bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED") && bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", false)) ? 1 : 0;
            boolean z10 = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED", false);
            if (i10 == 0) {
                if (!z10) {
                    return;
                }
                i10 = 0;
                z10 = true;
            }
            String packageName = context.getPackageName();
            Locale locale = Locale.ROOT;
            String l10 = s3.c.l(packageName, ".client_cast_analytics_data");
            o0Var.h = bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE") == 0 ? 1 : 2;
            w2.q.b(context);
            o0Var.g = w2.q.a().c(u2.a.e).a("CAST_SENDER_SDK", new t2.c("proto"), com.google.android.gms.internal.cast.z.a);
            if (bundle.containsKey("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE")) {
                o0Var.e = Long.valueOf(bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE"));
            }
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(l10, 0);
            if (i10 != 0) {
                com.google.android.gms.common.api.internal.v b11 = com.google.android.gms.common.api.internal.w.b();
                b11.c = new m3.y(sVar, new String[]{"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"});
                b11.d = new v5.c[]{z.c};
                b11.b = false;
                b11.a = 8426;
                Task e9 = sVar.e(0, b11.b());
                d5.x xVar = new d5.x();
                xVar.b = o0Var;
                xVar.c = packageName;
                xVar.a = i10;
                xVar.d = sharedPreferences;
                e9.addOnSuccessListener(xVar);
            }
            if (z10) {
                y5.l.h(sharedPreferences);
                r5.b bVar = c2.i;
                synchronized (c2.class) {
                    try {
                        if (c2.k == null) {
                            c2.k = new c2(sharedPreferences, o0Var, packageName);
                        }
                        c2Var = c2.k;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                String str = c2Var.c;
                SharedPreferences sharedPreferences2 = c2Var.b;
                HashSet hashSet = c2Var.f;
                String string = sharedPreferences2.getString("feature_usage_sdk_version", null);
                String string2 = sharedPreferences2.getString("feature_usage_package_name", null);
                hashSet.clear();
                HashSet hashSet2 = c2Var.g;
                hashSet2.clear();
                c2Var.h = 0L;
                String str2 = c2.j;
                if (str2.equals(string) && str.equals(string2)) {
                    c2Var.h = sharedPreferences2.getLong("feature_usage_last_report_time", 0L);
                    long currentTimeMillis = System.currentTimeMillis();
                    HashSet hashSet3 = new HashSet();
                    for (String str3 : sharedPreferences2.getAll().keySet()) {
                        if (str3.startsWith("feature_usage_timestamp_")) {
                            long j10 = sharedPreferences2.getLong(str3, 0L);
                            if (j10 != 0 && currentTimeMillis - j10 > 1209600000) {
                                hashSet3.add(str3);
                            } else if (str3.startsWith("feature_usage_timestamp_reported_feature_")) {
                                c1 b12 = c2.b(str3.substring(41));
                                if (b12 != null) {
                                    hashSet2.add(b12);
                                    hashSet.add(b12);
                                }
                            } else if (str3.startsWith("feature_usage_timestamp_detected_feature_") && (b10 = c2.b(str3.substring(41))) != null) {
                                hashSet.add(b10);
                            }
                        }
                    }
                    c2Var.c(hashSet3);
                    y5.l.h(c2Var.e);
                    y5.l.h(c2Var.d);
                    c2Var.e.post(c2Var.d);
                } else {
                    HashSet hashSet4 = new HashSet();
                    for (String str4 : sharedPreferences2.getAll().keySet()) {
                        if (str4.startsWith("feature_usage_timestamp_")) {
                            hashSet4.add(str4);
                        }
                    }
                    hashSet4.add("feature_usage_last_report_time");
                    c2Var.c(hashSet4);
                    sharedPreferences2.edit().putString("feature_usage_sdk_version", str2).putString("feature_usage_package_name", str).apply();
                }
                c2.a(c1.h);
            }
        }
    }

    @Override // org.telegram.ui.Components.j61
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // r4.g
    public int p() {
        return 1;
    }

    public boolean q(int i10) {
        g71 g71Var = ((p71) this.b).H;
        if (g71Var == null) {
            return false;
        }
        return g71Var.c(i10);
    }

    @Override // rh.g0
    public i9 q0() {
        switch (this.a) {
            case 18:
                return (rh.x) this.b;
            default:
                return (m4) this.b;
        }
    }

    @Override // rh.n3
    public void q1() {
        x1 x1Var = (x1) this.b;
        x1.Z(x1Var, false, true);
        int i10 = x1Var.E0;
        x1Var.x0(i10 != 2 ? i10 : 0, true);
    }

    @Override // androidx.lifecycle.s0
    public androidx.lifecycle.p0 r(Class cls, v1.b bVar) {
        m0 m0Var = null;
        for (v1.c cVar : (v1.c[]) this.b) {
            if (cVar.a.equals(cls)) {
                m0Var = new m0();
            }
        }
        if (m0Var != null) {
            return m0Var;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }

    public void s(Runnable runnable) {
        Runnable runnable2 = (Runnable) ((HashMap) this.b).remove(runnable);
        if (runnable2 != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable2);
        }
    }

    public void t() {
        HashMap hashMap = (HashMap) this.b;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            AndroidUtilities.cancelRunOnUIThread((Runnable) ((Map.Entry) it.next()).getValue());
        }
        hashMap.clear();
    }

    public s0.c u(int i10) {
        return null;
    }

    @Override // rh.g0
    public rh.a u0() {
        switch (this.a) {
            case 18:
                return ((rh.x) this.b).a;
            default:
                return ((m4) this.b).a;
        }
    }

    public rb.a v(float f10, float f11, int i10, int i11) {
        rb.a b10;
        rb.a b11;
        int i12 = (int) (f11 * f10);
        int max = Math.max(0, i10 - i12);
        mb.b bVar = (mb.b) this.b;
        int min = Math.min(bVar.a - 1, i10 + i12) - max;
        float f12 = 3.0f * f10;
        if (min < f12) {
            throw lb.e.a();
        }
        int max2 = Math.max(0, i11 - i12);
        int min2 = Math.min(bVar.b - 1, i11 + i12) - max2;
        if (min2 < f12) {
            throw lb.e.a();
        }
        mb.b bVar2 = (mb.b) this.b;
        rb.b bVar3 = new rb.b(bVar2, max, max2, min, min2, f10);
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
            throw lb.e.a();
        }
        return (rb.a) arrayList.get(0);
    }

    public s0.c w(int i10) {
        return null;
    }

    @Override // rh.g0
    public boolean w0() {
        switch (this.a) {
            case 18:
                rh.x xVar = (rh.x) this.b;
                j3 j3Var = xVar.K;
                if (j3Var != null) {
                    rh.a aVar = xVar.a;
                    if (j3Var.a.S4()) {
                    }
                }
                break;
            default:
                m4 m4Var = (m4) this.b;
                i3 i3Var = m4Var.J;
                if (i3Var != null) {
                    rh.a aVar2 = m4Var.a;
                    if (i3Var.a.S4()) {
                    }
                }
                break;
        }
        return false;
    }

    public void x(float f10) {
        p71 p71Var = (p71) this.b;
        if (f10 == 1.0f) {
            View[] viewArr = p71Var.e;
            View[] viewArr2 = p71Var.e;
            if (viewArr[1] != null) {
                p71Var.F();
                p71Var.h.put(p71Var.f[1], viewArr2[1]);
                p71Var.removeView(viewArr2[1]);
                p71Var.E(viewArr2[0], 0.0f);
                viewArr2[1] = null;
            }
            p71Var.z(p71Var.b);
            return;
        }
        View[] viewArr3 = p71Var.e;
        View[] viewArr4 = p71Var.e;
        View view = viewArr3[1];
        if (view == null) {
            return;
        }
        if (p71Var.y) {
            p71Var.E(view, (1.0f - f10) * viewArr3[0].getMeasuredWidth());
            p71Var.E(viewArr4[0], (-r2.getMeasuredWidth()) * f10);
        } else {
            p71Var.E(view, (1.0f - f10) * (-viewArr3[0].getMeasuredWidth()));
            p71Var.E(viewArr4[0], r2.getMeasuredWidth() * f10);
        }
        p71Var.w(false);
    }

    public boolean y(int i10, int i11, Bundle bundle) {
        return false;
    }

    @Override // rh.g0
    public void y0(int i10, int i11) {
        switch (this.a) {
            case 18:
                rh.x xVar = (rh.x) this.b;
                j3 j3Var = xVar.K;
                if (j3Var != null) {
                    rh.a aVar = xVar.a;
                    b2 b2Var = j3Var.a.F3;
                    if (b2Var != null) {
                        b2Var.f(i10, i11);
                        break;
                    }
                }
                break;
            default:
                m4 m4Var = (m4) this.b;
                i3 i3Var = m4Var.J;
                if (i3Var != null) {
                    rh.a aVar2 = m4Var.a;
                    b2 b2Var2 = i3Var.a.F3;
                    if (b2Var2 != null) {
                        b2Var2.f(i10, i11);
                        break;
                    }
                }
                break;
        }
    }

    public ma.i z(Object obj) {
        ma.g gVar = ((pa.a0) this.b).b;
        gVar.getClass();
        if (obj == null) {
            return ma.k.a;
        }
        Class<?> cls = obj.getClass();
        pa.n nVar = new pa.n();
        gVar.f(obj, cls, nVar);
        return nVar.u();
    }

    public /* synthetic */ o(t6.b bVar, h5.e eVar) {
        this.a = 23;
        this.b = eVar;
    }

    @Override // org.telegram.ui.Components.j61
    public void onRenderedFirstFrame() {
    }

    public o(MediaInfo mediaInfo) {
        this.a = 0;
        p pVar = new p(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        if (mediaInfo != null) {
            this.b = pVar;
            return;
        }
        throw new IllegalArgumentException("media cannot be null.");
    }

    public o(JSONObject jSONObject) {
        this.a = 0;
        this.b = new p(jSONObject);
    }

    public o(int i10) {
        this.a = i10;
        switch (i10) {
            case 21:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.b = new s0.d(this);
                    break;
                } else {
                    this.b = new ng0(this);
                    break;
                }
            case 25:
                break;
            default:
                this.b = new HashMap();
                break;
        }
    }

    public o(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.a = 16;
        this.b = new GestureDetector(context, onGestureListener, null);
    }

    public o(v1.c[] initializers) {
        this.a = 26;
        kotlin.jvm.internal.j.e(initializers, "initializers");
        this.b = initializers;
    }

    public o(EditText editText) {
        this.a = 15;
        this.b = new i6(editText);
    }

    @Override // rh.n3
    public void V0() {
    }

    @Override // rh.n3
    public void b1(int i10) {
    }

    @Override // org.telegram.ui.Components.j61
    public /* synthetic */ void onSeekFinished(i3.a aVar) {
    }

    @Override // org.telegram.ui.Components.j61
    public /* synthetic */ void onSeekStarted(i3.a aVar) {
    }

    @Override // org.telegram.ui.Components.j61
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // rh.n3
    public void n0(d1 d1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Components.j61
    public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
    }
}
