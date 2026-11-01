package n2;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.tasks.TaskCompletionSource;
import e9.n0;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.List;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ba;
import org.telegram.messenger.db;
import org.telegram.messenger.dv;
import org.telegram.messenger.f8;
import org.telegram.messenger.gf;
import org.telegram.messenger.i0;
import org.telegram.messenger.k0;
import org.telegram.messenger.l20;
import org.telegram.messenger.nc;
import org.telegram.messenger.od;
import org.telegram.messenger.q0;
import org.telegram.messenger.r20;
import org.telegram.messenger.sa;
import org.telegram.messenger.y20;
import org.telegram.ui.ActionBar.b1;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p5;
import org.telegram.ui.ActionBar.s5;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.w7;
import org.telegram.ui.Cells.x7;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.e50;
import org.telegram.ui.Components.eb0;
import org.telegram.ui.Components.fp0;
import org.telegram.ui.Components.iu0;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.jf0;
import org.telegram.ui.Components.kf0;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.Components.nn0;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.v61;
import org.telegram.ui.Components.v71;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.x40;
import org.telegram.ui.Components.x71;
import org.telegram.ui.Components.xs0;
import ph.x1;
import qh.x0;
import sg.o0;
import th.z2;
import v7.i5;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class u implements o0.a, nc, wg.a, nn0, fe.g, iz, t61, m61, xs0, v71, qh.x, com.google.android.gms.common.api.internal.o, iu0, n5.b, mj0, fp0, s0, com.google.android.gms.common.api.internal.s {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ u(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.mj0
    public /* synthetic */ boolean A() {
        return false;
    }

    public wg.a B() {
        b5 b5Var;
        s5 s5Var = (s5) this.b;
        if (s5Var.a >= 1.0f || (b5Var = s5Var.d) == null) {
            return null;
        }
        return b5Var.getButtonsGlassColorProvider();
    }

    @Override // org.telegram.ui.Components.fp0
    public void B0() {
        z2.h0((z2) this.b);
    }

    @Override // org.telegram.ui.Components.xs0
    public b1 D(String str) {
        p5 p5Var = ((au0) this.b).I;
        return p5Var.d(0, 0, null, str, true, true, p5Var.m0);
    }

    @Override // wg.a
    public int E() {
        s5 s5Var = (s5) this.b;
        wg.a v = v();
        int E = (v == null || !s5Var.d.b()) ? 0 : v.E();
        wg.a B = B();
        if (B != null) {
            return i0.b.f(s5Var.a, B.E(), E);
        }
        return E;
    }

    @Override // androidx.lifecycle.s0
    public p0 E0(Class cls, v1.b bVar) {
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

    @Override // org.telegram.ui.Components.iu0
    public void F(boolean z10) {
        fe.b bVar = ((rh.i) this.b).s;
        if (bVar != null) {
            bVar.a(z10, true);
        }
    }

    public boolean G(int i10) {
        p71 p71Var = ((x71) this.b).L;
        if (p71Var == null) {
            return false;
        }
        return p71Var.c(i10);
    }

    @Override // o0.a
    public Cursor I(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e) {
            Log.w("FontsProvider", "Unable to query the content provider", e);
            return null;
        }
    }

    public void J(float f7) {
        x71 x71Var = (x71) this.b;
        View[] viewArr = x71Var.e;
        if (f7 == 1.0f) {
            if (viewArr[1] != null) {
                x71Var.G();
                x71Var.h.put(x71Var.f[1], viewArr[1]);
                x71Var.removeView(viewArr[1]);
                x71Var.F(viewArr[0], 0.0f);
                viewArr[1] = null;
            }
            x71Var.A(x71Var.b);
            return;
        }
        View view = viewArr[1];
        if (view == null) {
            return;
        }
        if (x71Var.D) {
            x71Var.F(view, (1.0f - f7) * viewArr[0].getMeasuredWidth());
            x71Var.F(viewArr[0], (-r1.getMeasuredWidth()) * f7);
        } else {
            x71Var.F(view, (1.0f - f7) * (-viewArr[0].getMeasuredWidth()));
            x71Var.F(viewArr[0], r1.getMeasuredWidth() * f7);
        }
        x71Var.x(false);
    }

    @Override // wg.a
    public float N() {
        s5 s5Var = (s5) this.b;
        wg.a v = v();
        wg.a B = B();
        float N = v != null ? v.N() : -1.0f;
        float N2 = B != null ? B.N() : N;
        return (N2 < 0.0f || N < 0.0f) ? s5Var.a < 0.5f ? N2 : N : i0.T1(N2, N, s5Var.a);
    }

    public void P(p4.p pVar, p4.m mVar, Collection collection) {
        p4.e eVar = (p4.e) this.b;
        if (pVar != eVar.y || mVar == null) {
            if (pVar == eVar.e) {
                if (mVar != null) {
                    eVar.n(eVar.d, mVar);
                }
                eVar.d.n(collection);
                return;
            }
            return;
        }
        p4.v vVar = eVar.x.a;
        String d = mVar.d();
        p4.w wVar = new p4.w(vVar, d, eVar.b(vVar, d), false);
        wVar.i(mVar);
        if (eVar.d == wVar) {
            return;
        }
        eVar.h(eVar, wVar, eVar.y, 3, eVar.x, collection);
        eVar.x = null;
        eVar.y = null;
    }

    @Override // wg.a
    public float X() {
        s5 s5Var = (s5) this.b;
        wg.a v = v();
        wg.a B = B();
        float X = v != null ? v.X() : -1.0f;
        float X2 = B != null ? B.X() : X;
        return (X2 < 0.0f || X < 0.0f) ? s5Var.a < 0.5f ? X2 : X : i0.T1(X2, X, s5Var.a);
    }

    public Point a0(db dbVar) {
        a6.i iVar = (a6.i) this.b;
        LatLng latLng = new LatLng(dbVar.a, dbVar.b);
        try {
            i8.b bVar = (i8.b) iVar.b;
            Parcel P0 = bVar.P0();
            s7.b.b(P0, latLng);
            Parcel O0 = bVar.O0(P0, 2);
            x6.a M0 = x6.b.M0(O0.readStrongBinder());
            O0.recycle();
            return (Point) x6.b.N0(M0);
        } catch (RemoteException e) {
            throw new ad.d(e);
        }
    }

    @Override // org.telegram.ui.Components.iu0
    public float a1() {
        i0.c cVar;
        cVar = ((k2) ((rh.i) this.b)).mSystemInsets;
        return i0.a.d(9.66f, ei.b.d(cVar.b), 0);
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        v8.e eVar = (v8.e) this.b;
        e8.b bVar = (e8.b) obj;
        bVar.getClass();
        e8.a aVar = new e8.a(1, (TaskCompletionSource) obj2);
        try {
            e8.i iVar = (e8.i) bVar.v();
            Bundle H = bVar.H();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
            int i10 = e8.c.a;
            obtain.writeInt(1);
            eVar.writeToParcel(obtain, 0);
            obtain.writeInt(1);
            H.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(aVar);
            try {
                iVar.a.transact(14, obtain, null, 1);
            } finally {
                obtain.recycle();
            }
        } catch (RemoteException e) {
            Log.e("WalletClientImpl", "RemoteException during isReadyToPay", e);
            Bundle bundle = Bundle.EMPTY;
            i5.a(Status.h, Boolean.FALSE, aVar.b);
        }
    }

    @Override // org.telegram.ui.Components.iz
    public ByteBuffer b() {
        gf gfVar = (gf) this.b;
        gfVar.p.d();
        return (ByteBuffer) gfVar.p.f;
    }

    @Override // wg.a
    public float b0() {
        wg.a v = v();
        wg.a B = B();
        float b02 = v != null ? v.b0() : 0.0f;
        return B != null ? i0.T1(B.b0(), b02, ((s5) this.b).a) : b02;
    }

    @Override // qh.x
    public void c(String str) {
        qh.i0 i0Var = (qh.i0) this.b;
        if (i0Var.getParentActivity() != null) {
            gf.f.r(i0Var.getParentActivity(), str);
        }
    }

    @Override // o0.a
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override // androidx.lifecycle.s0
    public p0 d(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    @Override // org.telegram.ui.Components.iz
    public boolean e() {
        return false;
    }

    @Override // org.telegram.ui.Components.mj0
    public /* synthetic */ boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Components.iu0
    public int g1() {
        i0.c cVar;
        cVar = ((k2) ((rh.i) this.b)).mSystemInsets;
        return cVar.d;
    }

    @Override // zc.a
    public Object get() {
        return new s5.i(Integer.valueOf(s5.i.d).intValue(), (Context) ((zc.a) this.b).get(), "com.google.android.datatransport.events");
    }

    @Override // org.telegram.ui.Components.iz
    public float getBlurAngle() {
        return ((gf) this.b).t;
    }

    @Override // org.telegram.ui.Components.iz
    public float getBlurExcludeBlurSize() {
        return ((gf) this.b).s;
    }

    @Override // org.telegram.ui.Components.iz
    public PointF getBlurExcludePoint() {
        return ((gf) this.b).r;
    }

    @Override // org.telegram.ui.Components.iz
    public float getBlurExcludeSize() {
        return ((gf) this.b).q;
    }

    @Override // org.telegram.ui.Components.iz
    public int getBlurType() {
        return ((gf) this.b).n;
    }

    @Override // org.telegram.ui.Components.nn0
    public CharSequence getContentDescription() {
        l20 l20Var;
        x7 x7Var = (x7) this.b;
        try {
            StringBuilder sb2 = new StringBuilder();
            if (!TextUtils.isEmpty(x7Var.s)) {
                sb2.append(x7Var.s);
            }
            w7 w7Var = x7Var.r;
            if (w7Var != null && (l20Var = w7Var.e) != null) {
                CharSequence charSequence = (CharSequence) l20Var.d(0, Integer.valueOf(x7Var.f));
                if (!TextUtils.isEmpty(charSequence)) {
                    if (sb2.length() > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(charSequence);
                }
                CharSequence charSequence2 = (CharSequence) x7Var.r.e.d(-1, Integer.valueOf(x7Var.r.b()));
                CharSequence charSequence3 = (CharSequence) x7Var.r.e.d(1, Integer.valueOf(x7Var.r.a()));
                if (!TextUtils.isEmpty(charSequence2) && !TextUtils.isEmpty(charSequence3)) {
                    if (sb2.length() > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(charSequence2);
                    sb2.append(" – ");
                    sb2.append(charSequence3);
                }
            }
            if (sb2.length() > 0) {
                return sb2.toString();
            }
            return null;
        } catch (Throwable th2) {
            f8.g(th2, true);
            return x7Var.s;
        }
    }

    @Override // org.telegram.ui.Components.iz
    public float getContrastValue() {
        return a1.g.c(((gf) this.b).d, 100.0f, 0.3f, 1.0f);
    }

    @Override // org.telegram.ui.Components.iz
    public float getEnhanceValue() {
        return ((gf) this.b).a / 100.0f;
    }

    @Override // org.telegram.ui.Components.iz
    public float getExposureValue() {
        return ((gf) this.b).c / 100.0f;
    }

    @Override // org.telegram.ui.Components.iz
    public float getFadeValue() {
        return ((gf) this.b).g / 100.0f;
    }

    @Override // org.telegram.ui.Components.iz
    public float getGrainValue() {
        return (((gf) this.b).m / 100.0f) * 0.04f;
    }

    @Override // org.telegram.ui.Components.iz
    public float getHighlightsValue() {
        return c3.i0.x(((gf) this.b).j, 0.75f, 100.0f, 100.0f);
    }

    @Override // org.telegram.ui.Components.iz
    public float getSaturationValue() {
        float f7 = ((gf) this.b).f / 100.0f;
        if (f7 > 0.0f) {
            f7 *= 1.05f;
        }
        return f7 + 1.0f;
    }

    @Override // org.telegram.ui.Components.iz
    public float getShadowsValue() {
        return c3.i0.x(((gf) this.b).k, 0.55f, 100.0f, 100.0f);
    }

    @Override // org.telegram.ui.Components.iz
    public float getSharpenValue() {
        return a1.g.c(((gf) this.b).o, 100.0f, 0.6f, 0.11f);
    }

    @Override // org.telegram.ui.Components.iz
    public float getSoftenSkinValue() {
        return ((gf) this.b).b / 100.0f;
    }

    @Override // org.telegram.ui.Components.iz
    public int getTintHighlightsColor() {
        return ((gf) this.b).i;
    }

    @Override // org.telegram.ui.Components.iz
    public float getTintHighlightsIntensityValue() {
        return ((gf) this.b).i == 0 ? 0.0f : 0.5f;
    }

    @Override // org.telegram.ui.Components.iz
    public int getTintShadowsColor() {
        return ((gf) this.b).h;
    }

    @Override // org.telegram.ui.Components.iz
    public float getTintShadowsIntensityValue() {
        return ((gf) this.b).h == 0 ? 0.0f : 0.5f;
    }

    @Override // org.telegram.ui.Components.iz
    public float getVignetteValue() {
        return ((gf) this.b).l / 100.0f;
    }

    @Override // org.telegram.ui.Components.iz
    public float getWarmthValue() {
        return ((gf) this.b).e / 100.0f;
    }

    @Override // org.telegram.ui.Components.mj0
    public /* synthetic */ boolean h() {
        return false;
    }

    @Override // wg.a
    public int h0() {
        wg.a v = v();
        wg.a B = B();
        int h02 = v != null ? v.h0() : 0;
        if (B != null) {
            return i0.b.f(((s5) this.b).a, B.h0(), h02);
        }
        return h02;
    }

    @Override // com.google.android.gms.common.api.internal.o
    public void i(Object obj) {
        LocationResult locationResult = (LocationResult) this.b;
        sa saVar = ((ba) obj).a;
        List list = locationResult.a;
        int size = list.size();
        Location location = size == 0 ? null : (Location) list.get(size - 1);
        m2.t tVar = (m2.t) saVar;
        if (location == null) {
            tVar.getClass();
        } else {
            ((od) tVar.b).m(location);
        }
    }

    @Override // org.telegram.ui.Components.m61
    public void invalidate() {
        ((jf0) this.b).h.invalidate();
    }

    @Override // org.telegram.messenger.nc
    public void j(ImageReceiver imageReceiver) {
        ((dv) this.b).s0(true);
    }

    @Override // wg.a
    public int j0() {
        wg.a v = v();
        wg.a B = B();
        int j02 = v != null ? v.j0() : 0;
        if (B != null) {
            return i0.b.f(((s5) this.b).a, B.j0(), j02);
        }
        return j02;
    }

    @Override // org.telegram.ui.Components.nn0
    public void k(boolean z10, float f7) {
        int round;
        x7 x7Var = (x7) this.b;
        w7 w7Var = x7Var.r;
        if (w7Var == null || x7Var.n == null) {
            return;
        }
        if (w7Var.c != null) {
            double length = f7 * (r1.length - 1);
            int j10 = Utilities.j((int) Math.floor(length), x7Var.r.c.length - 1, 0);
            int j11 = Utilities.j((int) Math.ceil(length), x7Var.r.c.length - 1, 0);
            int[] iArr = x7Var.r.c;
            round = Math.round(i0.W1(Math.round(((float) (length - Math.floor(length))) * x7Var.r.d) / x7Var.r.d, iArr[j10], iArr[j11]));
        } else {
            round = Math.round(((x7Var.r.a() - x7Var.r.b()) * f7) + w7Var.b());
        }
        int i10 = x7Var.h;
        if (i10 != Integer.MIN_VALUE) {
            round = Math.max(round, i10);
        }
        int i11 = x7Var.f;
        if (i11 != round) {
            if (x7Var.c(i11) != x7Var.c(round)) {
                i0.b4(x7Var.e);
            }
            x7Var.f = round;
            x7Var.e(round, true);
            r20 r20Var = x7Var.n;
            if (r20Var != null) {
                r20Var.a(Integer.valueOf(x7Var.f));
            }
        }
    }

    @Override // org.telegram.ui.Components.xs0
    public b1 k0(int i10, Runnable runnable, String str, boolean z10, boolean z11) {
        au0 au0Var = (au0) this.b;
        b1 e = au0Var.I.e(0, i10, str);
        if (z10) {
            int i11 = t6.p7;
            e.d(au0Var.r0(i11), au0Var.r0(i11));
        }
        e.setOnClickListener(new cb0(this, z11, runnable));
        return e;
    }

    @Override // fe.g
    public /* synthetic */ boolean l() {
        return false;
    }

    @Override // fe.g
    public /* synthetic */ boolean m(float f7) {
        return false;
    }

    @Override // wg.a
    public int n0() {
        b5 b5Var;
        s5 s5Var = (s5) this.b;
        wg.a v = v();
        int n02 = v != null ? v.n0() : 0;
        return (s5Var.a >= 1.0f || (b5Var = s5Var.d) == null) ? n02 : i0.b.f(s5Var.a, b5Var.getButtonsGlassBackgroundColor(), n02);
    }

    @Override // qh.x
    public void o(qh.y yVar) {
        qh.i0 i0Var = (qh.i0) this.b;
        FrameLayout frameLayout = i0Var.f;
        if (frameLayout != null) {
            frameLayout.removeView(yVar);
        }
        if (i0Var.F == yVar) {
            i0Var.F = null;
        }
        x0 x0Var = i0Var.d;
        if (x0Var != null) {
            x0Var.setScanHidden(false);
        }
    }

    @Override // org.telegram.ui.Components.t61
    public void onError(v61 v61Var, Exception exc) {
        switch (this.a) {
            case 11:
                f8.g(exc, true);
                break;
        }
    }

    @Override // org.telegram.ui.Components.t61
    public void onRenderedFirstFrame() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.t61
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.t61
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.t61
    public void onStateChanged(boolean z10, int i10) {
        e50 e50Var;
        y20 y20Var;
        switch (this.a) {
            case 11:
                x40 x40Var = (x40) this.b;
                v61 v61Var = x40Var.H0.S;
                if (v61Var != null && v61Var.d0() && i10 == 4 && (y20Var = (e50Var = x40Var.H0).R) != null) {
                    v61 v61Var2 = e50Var.S;
                    long j10 = y20Var.a;
                    if (j10 <= 0) {
                        j10 = 0;
                    }
                    v61Var2.p0(j10);
                    break;
                }
                break;
            default:
                oj0 oj0Var = (oj0) this.b;
                if (z10 && oj0Var.n.S() >= 0) {
                    oj0Var.x = true;
                }
                kf0 kf0Var = oj0Var.f;
                eb0 eb0Var = oj0Var.y;
                kf0Var.a(z10, true);
                i0.r(eb0Var);
                if (z10) {
                    i0.h3(eb0Var, 16L);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.t61
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.t61
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.t61
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        int i13 = this.a;
    }

    @Override // org.telegram.ui.Components.iz
    public boolean p() {
        return !((gf) this.b).p.s();
    }

    @Override // org.telegram.ui.Components.nn0
    public int p0() {
        w7 w7Var = ((x7) this.b).r;
        if (w7Var == null) {
            return 0;
        }
        return w7Var.c != null ? (r1.length - 1) * w7Var.d : w7Var.a() - w7Var.b();
    }

    @Override // wg.a
    public int u() {
        s5 s5Var = (s5) this.b;
        wg.a v = v();
        int u10 = (v == null || !s5Var.d.b()) ? 0 : v.u();
        wg.a B = B();
        if (B != null) {
            return i0.b.f(s5Var.a, B.u(), u10);
        }
        return u10;
    }

    public wg.a v() {
        b5 b5Var = ((s5) this.b).d;
        if (b5Var != null) {
            return b5Var.getMenuGlassColorProvider();
        }
        return null;
    }

    @Override // wg.a
    public int w() {
        wg.a v = v();
        wg.a B = B();
        int w9 = v != null ? v.w() : 0;
        if (B != null) {
            return i0.b.f(((s5) this.b).a, B.w(), w9);
        }
        return w9;
    }

    @Override // org.telegram.ui.Components.mj0
    public void x(View view, o0 o0Var, boolean z10, boolean z11) {
        sg.s sVar = (sg.s) this.b;
        sVar.a.vb(null, sVar.e, sVar.b, view, 0.0f, 0.0f, o0Var, false, z10, z11, false);
        i0.g3(new x1(this, 29));
    }

    @Override // org.telegram.ui.Components.xs0
    public void y() {
        ((au0) this.b).I.a(-1);
    }

    @Override // fe.g
    public void z() {
        ((w8) this.b).a.invalidate();
    }

    public u(int i10) {
        this.a = i10;
        switch (i10) {
            case 2:
                this.b = new o2.d(1.0f, 5, 0, false);
                break;
            case 3:
                this.b = new k0();
                break;
            case 4:
            default:
                this.b = n0.t();
                break;
            case 5:
                break;
        }
    }

    @Override // org.telegram.ui.Components.t61
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
        int i10 = this.a;
    }

    public u(v1.c[] initializers) {
        this.a = 28;
        kotlin.jvm.internal.i.e(initializers, "initializers");
        this.b = initializers;
    }

    public u(EditText editText) {
        this.a = 17;
        this.b = new m4.c(editText);
    }

    public u(String str, String str2) {
        this.a = 4;
        this.b = new q0(str, str2);
    }

    public u(Context context, Uri uri) {
        this.a = 1;
        this.b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    private final void K() {
    }

    private final void M() {
    }

    @Override // org.telegram.ui.Components.nn0
    public /* synthetic */ void C() {
    }

    @Override // org.telegram.ui.Components.fp0
    public /* synthetic */ void V() {
    }

    @Override // fe.g
    public /* synthetic */ void a() {
    }

    @Override // fe.g
    public /* synthetic */ void n() {
    }

    @Override // org.telegram.ui.Components.mj0
    public /* synthetic */ void t() {
    }

    private final /* synthetic */ void L(j2.a aVar) {
    }

    private final /* synthetic */ void O(j2.a aVar) {
    }

    private final /* synthetic */ void Q(j2.a aVar) {
    }

    private final /* synthetic */ void R(j2.a aVar) {
    }

    private final /* synthetic */ void S(j2.a aVar) {
    }

    private final /* synthetic */ void T(j2.a aVar) {
    }

    private final /* synthetic */ void U(SurfaceTexture surfaceTexture) {
    }

    private final /* synthetic */ void W(SurfaceTexture surfaceTexture) {
    }

    @Override // fe.g
    public /* synthetic */ void g(boolean z10) {
    }

    private final void H(v61 v61Var, Exception exc) {
    }

    @Override // org.telegram.messenger.nc
    public /* synthetic */ void s(int i10, Drawable drawable) {
    }

    private final void Y(int i10, int i11, float f7, int i12) {
    }

    private final void Z(int i10, int i11, float f7, int i12) {
    }

    @Override // org.telegram.messenger.nc
    public void q(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }

    @Override // org.telegram.ui.Components.mj0
    public /* synthetic */ void r(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
