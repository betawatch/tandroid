// default package

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.File;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.ui.SecretMediaViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class et8 implements ft8, yx8, ldc, gk, ln5, mv8, udc, lv8, mga, am0, jca, zv7, jm6, cx9, rv9, i68, h89, a4d, OnFailureListener, v76 {
    public final /* synthetic */ byte a;
    public final Object b;

    public et8(tfc tfcVar, sfc sfcVar, x23 x23Var) {
        this.a = (byte) 21;
        tfcVar.getClass();
        sfcVar.getClass();
        x23Var.getClass();
        this.b = new wm9(tfcVar, sfcVar, x23Var);
    }

    @Override // a4d
    public final void C0(int i) {
        m5d m5dVar = (m5d) this.b;
        ReentrantLock reentrantLock = m5dVar.o;
        reentrantLock.lock();
        try {
            if (m5dVar.n) {
                m5dVar.n = false;
                m5dVar.b.C0(i);
                m5dVar.m = null;
                m5dVar.l = null;
            } else {
                m5dVar.n = true;
                m5dVar.d.onConnectionSuspended(i);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // ft8
    public final void D() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // jca
    public final boolean F() {
        u31 k = ((wsa) this.b).j().k(false);
        k.u = true;
        k.j();
        return true;
    }

    @Override // mga
    public final void I() {
        ((nha) this.b).J.a(-1);
    }

    @Override // mga
    public final a8 K(String str) {
        zja zjaVar = ((nha) this.b).J;
        return zjaVar.d(0, 0, null, str, true, true, zjaVar.n0);
    }

    @Override // am0
    public final int K1() {
        h27 h27Var;
        bka bkaVar = (bka) this.b;
        am0 i = i();
        int K1 = i != null ? i.K1() : 0;
        return (bkaVar.a >= 1.0f || (h27Var = bkaVar.d) == null) ? K1 : on2.f(bkaVar.a, h27Var.getButtonsGlassBackgroundColor(), K1);
    }

    @Override // ln5
    public final void L(ImageReceiver imageReceiver) {
        ((cj9) this.b).s0(true);
    }

    @Override // zv7
    public final void O(float f) {
        ((n1b) this.b).setOutlineWidth(f);
    }

    @Override // am0
    public final int V() {
        bka bkaVar = (bka) this.b;
        am0 i = i();
        int V = (i == null || !bkaVar.d.g()) ? 0 : i.V();
        am0 k = k();
        if (k != null) {
            return on2.f(bkaVar.a, k.V(), V);
        }
        return V;
    }

    @Override // jm6
    public final void a(int i, z43 z43Var, long j, int i2) {
        ((MediaCodec) this.b).queueSecureInputBuffer(i, 0, z43Var.i, j, i2);
    }

    @Override // h89
    public final void accept(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 25:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                a5d a5dVar = (a5d) ((q3d) obj).k();
                Parcel c = a5dVar.c();
                g4d.b(c, (p3d) obj3);
                try {
                    a5dVar.b.transact(1, c, null, 1);
                    c.recycle();
                    taskCompletionSource.setResult(null);
                    return;
                } catch (Throwable th) {
                    c.recycle();
                    throw th;
                }
            default:
                y0e y0eVar = new y0e((TaskCompletionSource) obj2, (byte) 0);
                ref refVar = (ref) ((r9f) obj).k();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(refVar.b);
                int i = oid.a;
                obtain.writeStrongBinder(y0eVar);
                obtain.writeInt(1);
                ((nw8) obj3).writeToParcel(obtain, 0);
                Parcel obtain2 = Parcel.obtain();
                try {
                    refVar.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                } finally {
                    obtain.recycle();
                    obtain2.recycle();
                }
        }
    }

    @Override // jm6
    public final void b(int i, int i2, int i3, long j) {
        ((MediaCodec) this.b).queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // v76
    public final void c(Object obj) {
        LocationResult locationResult = (LocationResult) this.b;
        mj5 mj5Var = ((m05) obj).a;
        List list = locationResult.a;
        int size = list.size();
        mj5Var.onLocationChanged(size == 0 ? null : (Location) list.get(size - 1));
    }

    @Override // mga
    public final a8 c0(int i, Runnable runnable, String str, boolean z, boolean z2) {
        nha nhaVar = (nha) this.b;
        a8 e = nhaVar.J.e(0, i, str);
        if (z) {
            int i2 = cmb.o7;
            e.d(nhaVar.c0(i2), nhaVar.c0(i2));
        }
        e.setOnClickListener(new xw2(this, z2, runnable));
        return e;
    }

    @Override // yx8
    public final void e(String str) {
        iy8 iy8Var = (iy8) this.b;
        if (iy8Var.getParentActivity() != null) {
            l11.u(iy8Var.getParentActivity(), str);
        }
    }

    @Override // udc
    public final void f(float f) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
        la8 la8Var = secretMediaViewer.E;
        if (la8Var != null) {
            long U = la8Var.U();
            if (U != -9223372036854775807L) {
                secretMediaViewer.E.p0((long) (f * U), false);
            }
            secretMediaViewer.E.g0();
        }
    }

    @Override // rv9
    public final void finish() {
        Point point = gm.q;
        if (point.x > point.y) {
            ((nxb) this.b).w0.finishPreviewFragment();
        }
    }

    @Override // ft8
    public final void g(int i, Serializable serializable) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.b).setResultCode(i);
    }

    @Override // am0
    public final int g0() {
        am0 i = i();
        am0 k = k();
        int g0 = i != null ? i.g0() : 0;
        if (k != null) {
            return on2.f(((bka) this.b).a, k.g0(), g0);
        }
        return g0;
    }

    @Override // am0
    public final float g1() {
        am0 i = i();
        am0 k = k();
        float g1 = i != null ? i.g1() : 0.0f;
        return k != null ? gm.R1(k.g1(), g1, ((bka) this.b).a) : g1;
    }

    @Override // mv8
    public final Object get() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 8:
                return new qs9(qs9.d, (Context) ((mq5) obj).a, "com.google.android.datatransport.events");
            default:
                return new j9a((hia) ((lv8) obj).get());
        }
    }

    @Override // cx9
    public final CharSequence getContentDescription() {
        tmb tmbVar = (tmb) this.b;
        return String.valueOf(Math.round((tmbVar.b.getProgress() * (tmbVar.e - r0)) + tmbVar.d));
    }

    @Override // udc
    public final void h(float f) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
        la8 la8Var = secretMediaViewer.E;
        if (la8Var != null) {
            la8Var.f0();
            long U = secretMediaViewer.E.U();
            if (U != -9223372036854775807L) {
                secretMediaViewer.E.p0((long) (f * U), false);
            }
        }
    }

    @Override // am0
    public final int h1() {
        am0 i = i();
        am0 k = k();
        int h1 = i != null ? i.h1() : 0;
        if (k != null) {
            return on2.f(((bka) this.b).a, k.h1(), h1);
        }
        return h1;
    }

    public final am0 i() {
        h27 h27Var = ((bka) this.b).d;
        if (h27Var != null) {
            return h27Var.getMenuGlassColorProvider();
        }
        return null;
    }

    @Override // rv9
    public final void j(float f) {
        Point point = gm.q;
        if (point.x > point.y) {
            ((nxb) this.b).w0.movePreviewFragment(f);
        }
    }

    @Override // cx9
    public final int j0() {
        tmb tmbVar = (tmb) this.b;
        return tmbVar.e - tmbVar.d;
    }

    @Override // a4d
    public final void j1(Bundle bundle) {
        m5d m5dVar = (m5d) this.b;
        ReentrantLock reentrantLock = m5dVar.o;
        reentrantLock.lock();
        try {
            m5dVar.m = ot2.f;
            m5dVar.j();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final am0 k() {
        h27 h27Var;
        bka bkaVar = (bka) this.b;
        if (bkaVar.a >= 1.0f || (h27Var = bkaVar.d) == null) {
            return null;
        }
        return h27Var.getButtonsGlassColorProvider();
    }

    public final pfc l(Class cls) {
        String str;
        String a;
        cj2 a2 = h79.a(cls);
        wm9 wm9Var = (wm9) this.b;
        Map map = cj2.b;
        Class cls2 = a2.a;
        cls2.getClass();
        if (cls2.isAnonymousClass() || cls2.isLocalClass()) {
            str = null;
        } else if (cls2.isArray()) {
            Class<?> componentType = cls2.getComponentType();
            str = (!componentType.isPrimitive() || (a = gtd.a(componentType.getName())) == null) ? null : a.concat("Array");
            if (str == null) {
                str = "kotlin.Array";
            }
        } else {
            String a3 = gtd.a(cls2.getName());
            str = a3 == null ? cls2.getCanonicalName() : a3;
        }
        if (str != null) {
            return wm9Var.t(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(str));
        }
        u36.j("Local and anonymous classes can not be ViewModels");
        return null;
    }

    @Override // i68
    public final void m(ArrayList arrayList) {
        sm2 sm2Var = (sm2) this.b;
        try {
            if (arrayList.isEmpty()) {
                return;
            }
            z5a z5aVar = (z5a) arrayList.get(0);
            if (z5aVar.c != null) {
                sm2Var.f = new File(bc4.z(4), Utilities.b.nextInt() + ".jpg");
                Point b1 = gm.b1();
                Bitmap G = fn5.G(z5aVar.c, null, (float) b1.x, (float) b1.y, true);
                G.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream((File) sm2Var.f));
                ((etc) sm2Var.e).b((File) sm2Var.f, G, true);
            }
        } catch (Throwable th) {
            fc4.g(th, true);
        }
    }

    @Override // cx9
    public final void n(boolean z, float f) {
        tmb tmbVar = (tmb) this.b;
        tmbVar.r.D0(Math.round(((tmbVar.e - r0) * f) + tmbVar.d));
    }

    public void o() {
        View view = (View) this.b;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        zfd zfdVar = (zfd) this.b;
        zfdVar.getClass();
        ce6 ce6Var = zfd.i;
        Log.w(ce6Var.a, ce6Var.d("Fail to store SessionState", new Object[0]), exc);
        zfdVar.b(100);
    }

    @Override // ldc
    public final void onStateChanged(boolean z, int i) {
        l49 l49Var = (l49) this.b;
        if (z && l49Var.n.S() >= 0) {
            l49Var.x = true;
        }
        ae8 ae8Var = l49Var.f;
        pp8 pp8Var = l49Var.y;
        ae8Var.a(z, true);
        gm.r(pp8Var);
        if (z) {
            gm.d3(pp8Var, 16L);
        }
    }

    @Override // ldc
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // yx8
    public final void p(zx8 zx8Var) {
        iy8 iy8Var = (iy8) this.b;
        FrameLayout frameLayout = iy8Var.f;
        if (frameLayout != null) {
            frameLayout.removeView(zx8Var);
        }
        if (iy8Var.G == zx8Var) {
            iy8Var.G = null;
        }
        wy8 wy8Var = iy8Var.d;
        if (wy8Var != null) {
            wy8Var.setScanHidden(false);
        }
    }

    public final boolean q() {
        b4d b4dVar = ((o3d) this.b).d;
        return b4dVar != null && b4dVar.g();
    }

    public void r() {
        View view;
        View view2 = (View) this.b;
        if (view2 != null) {
            if (view2.isInEditMode() || view2.onCheckIsTextEditor()) {
                view2.requestFocus();
                view = view2;
            } else {
                view = view2.getRootView().findFocus();
            }
            if (view == null) {
                view = view2.getRootView().findViewById(R.id.content);
            }
            if (view == null || !view.hasWindowFocus()) {
                return;
            }
            view.post(new ud(view, (byte) 6));
        }
    }

    @Override // am0
    public final int r1() {
        am0 i = i();
        am0 k = k();
        int r1 = i != null ? i.r1() : 0;
        if (k != null) {
            return on2.f(((bka) this.b).a, k.r1(), r1);
        }
        return r1;
    }

    @Override // jm6
    public final void setParameters(Bundle bundle) {
        ((MediaCodec) this.b).setParameters(bundle);
    }

    @Override // i68
    public final void t0() {
        try {
            Intent intent = new Intent("android.intent.action.PICK");
            intent.setType("image/*");
            ((Activity) ((sm2) this.b).c).startActivityForResult(intent, 11);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // am0
    public final int u0() {
        bka bkaVar = (bka) this.b;
        am0 i = i();
        int u0 = (i == null || !bkaVar.d.g()) ? 0 : i.u0();
        am0 k = k();
        if (k != null) {
            return on2.f(bkaVar.a, k.u0(), u0);
        }
        return u0;
    }

    @Override // a4d
    public final void v(ot2 ot2Var) {
        m5d m5dVar = (m5d) this.b;
        ReentrantLock reentrantLock = m5dVar.o;
        reentrantLock.lock();
        try {
            m5dVar.m = ot2Var;
            m5dVar.j();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // rv9
    public final void w(hg3 hg3Var) {
        sxb sxbVar = ((nxb) this.b).w0;
        HashSet hashSet = sxb.s1;
        sxbVar.Q0(hg3Var);
    }

    @Override // am0
    public final float w0() {
        bka bkaVar = (bka) this.b;
        am0 i = i();
        am0 k = k();
        float w0 = i != null ? i.w0() : -1.0f;
        float w02 = k != null ? k.w0() : w0;
        return (w02 < 0.0f || w0 < 0.0f) ? bkaVar.a < 0.5f ? w02 : w0 : gm.R1(w02, w0, bkaVar.a);
    }

    @Override // gk
    public final void y(int i, int i2, boolean z) {
        ((jf9) this.b).w0(i, i2, z);
    }

    @Override // am0
    public final float y0() {
        bka bkaVar = (bka) this.b;
        am0 i = i();
        am0 k = k();
        float y0 = i != null ? i.y0() : -1.0f;
        float y02 = k != null ? k.y0() : y0;
        return (y02 < 0.0f || y0 < 0.0f) ? bkaVar.a < 0.5f ? y02 : y0 : gm.R1(y02, y0, bkaVar.a);
    }

    @Override // ldc
    public final void onRenderedFirstFrame() {
    }

    @Override // jm6
    public final void d() {
    }

    @Override // jm6
    public final void flush() {
    }

    @Override // jca
    public final void s() {
    }

    @Override // jm6
    public final void shutdown() {
    }

    @Override // jm6
    public final void start() {
    }

    @Override // cx9
    public final void x() {
    }

    public /* synthetic */ et8(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public et8() {
        this.a = (byte) 19;
        this.b = new SparseArray();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public et8(tfc tfcVar, sfc sfcVar) {
        this(tfcVar, sfcVar, v23.b);
        this.a = (byte) 21;
        tfcVar.getClass();
    }

    @Override // ldc
    public final void onRenderedFirstFrame(tk tkVar) {
    }

    @Override // ldc
    public final void onSeekFinished(tk tkVar) {
    }

    @Override // ldc
    public final void onSeekStarted(tk tkVar) {
    }

    @Override // ldc
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public /* synthetic */ et8(ua4 ua4Var, nw8 nw8Var) {
        this.a = (byte) 27;
        this.b = nw8Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public et8(gp4 gp4Var) {
        this(gp4Var.f(), gp4Var.c(), gp4Var.d());
        this.a = (byte) 21;
        gp4Var.getClass();
    }

    @Override // ln5
    public final void B0(int i, Drawable drawable) {
    }

    @Override // zv7
    public final float get() {
        return ((n1b) this.b).G;
    }

    @Override // ldc
    public final void onError(ndc ndcVar, Exception exc) {
    }

    @Override // ln5
    public final void b0(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
    }

    @Override // ldc
    public final void onVideoSizeChanged(int i, int i2, int i3, float f) {
    }
}
