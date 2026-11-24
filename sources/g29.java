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
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.ui.SecretMediaViewer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class g29 implements ibc, gj, ll5, lt8, sbc, kt8, mea, al0, jaa, yt7, gk6, zu9, pt9, f48, f69, y1d, OnFailureListener, v56, r9 {
    public final /* synthetic */ byte a;
    public final Object b;

    public g29(byte b) {
        this.a = b;
        switch (b) {
            case 29:
                this.b = new HashMap();
                break;
            default:
                this.b = new SparseArray();
                break;
        }
    }

    @Override // jaa
    public final void G() {
        m21 k = ((vqa) this.b).j().k(false);
        k.t = true;
        k.j();
    }

    @Override // v56
    public final void H(Object obj) {
        LocationResult locationResult = (LocationResult) this.b;
        nh5 nh5Var = ((ly4) obj).a;
        List list = locationResult.a;
        int size = list.size();
        nh5Var.onLocationChanged(size == 0 ? null : (Location) list.get(size - 1));
    }

    @Override // mea
    public final void J() {
        ((nfa) this.b).J.a(-1);
    }

    @Override // al0
    public final int K() {
        zha zhaVar = (zha) this.b;
        al0 d = d();
        int K = (d == null || !zhaVar.d.f()) ? 0 : d.K();
        al0 g = g();
        if (g != null) {
            return bm2.f(zhaVar.a, g.K(), K);
        }
        return K;
    }

    @Override // mea
    public final a8 L(String str) {
        xha xhaVar = ((nfa) this.b).J;
        return xhaVar.d(0, 0, null, str, true, true, xhaVar.n0);
    }

    @Override // yt7
    public final void O(float f) {
        ((mza) this.b).setOutlineWidth(f);
    }

    @Override // y1d
    public final void R0(Bundle bundle) {
        k3d k3dVar = (k3d) this.b;
        ReentrantLock reentrantLock = k3dVar.o;
        reentrantLock.lock();
        try {
            k3dVar.m = ds2.f;
            k3dVar.j();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // al0
    public final float U0() {
        al0 d = d();
        al0 g = g();
        float U0 = d != null ? d.U0() : 0.0f;
        return g != null ? gl.R1(g.U0(), U0, ((zha) this.b).a) : U0;
    }

    @Override // gk6
    public final void a(int i, o33 o33Var, long j, int i2) {
        ((MediaCodec) this.b).queueSecureInputBuffer(i, 0, o33Var.i, j, i2);
    }

    @Override // zu9
    public final int a0() {
        skb skbVar = (skb) this.b;
        return skbVar.e - skbVar.d;
    }

    @Override // al0
    public final int a1() {
        al0 d = d();
        al0 g = g();
        int a1 = d != null ? d.a1() : 0;
        if (g != null) {
            return bm2.f(((zha) this.b).a, g.a1(), a1);
        }
        return a1;
    }

    @Override // f69
    public final void accept(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 23:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                y2d y2dVar = (y2d) ((o1d) obj).k();
                Parcel c = y2dVar.c();
                e2d.b(c, (n1d) obj3);
                try {
                    y2dVar.b.transact(1, c, null, 1);
                    c.recycle();
                    taskCompletionSource.setResult(null);
                    return;
                } catch (Throwable th) {
                    c.recycle();
                    throw th;
                }
            default:
                vyd vydVar = new vyd((TaskCompletionSource) obj2, (byte) 0);
                qcf qcfVar = (qcf) ((p7f) obj).k();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(qcfVar.b);
                int i = ngd.a;
                obtain.writeStrongBinder(vydVar);
                obtain.writeInt(1);
                ((mu8) obj3).writeToParcel(obtain, 0);
                Parcel obtain2 = Parcel.obtain();
                try {
                    qcfVar.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                } finally {
                    obtain.recycle();
                    obtain2.recycle();
                }
        }
    }

    @Override // gk6
    public final void b(int i, int i2, int i3, long j) {
        ((MediaCodec) this.b).queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // al0
    public final int b0() {
        al0 d = d();
        al0 g = g();
        int b0 = d != null ? d.b0() : 0;
        if (g != null) {
            return bm2.f(((zha) this.b).a, g.b0(), b0);
        }
        return b0;
    }

    public final al0 d() {
        h07 h07Var = ((zha) this.b).d;
        if (h07Var != null) {
            return h07Var.getMenuGlassColorProvider();
        }
        return null;
    }

    @Override // al0
    public final int d1() {
        al0 d = d();
        al0 g = g();
        int d1 = d != null ? d.d1() : 0;
        if (g != null) {
            return bm2.f(((zha) this.b).a, g.d1(), d1);
        }
        return d1;
    }

    @Override // f48
    public final void e(ArrayList arrayList) {
        gl2 gl2Var = (gl2) this.b;
        try {
            if (arrayList.isEmpty()) {
                return;
            }
            y3a y3aVar = (y3a) arrayList.get(0);
            if (y3aVar.c != null) {
                gl2Var.f = new File(ba4.z(4), Utilities.b.nextInt() + ".jpg");
                Point b1 = gl.b1();
                Bitmap G = fl5.G(y3aVar.c, null, (float) b1.x, (float) b1.y, true);
                G.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream((File) gl2Var.f));
                ((crc) gl2Var.e).b((File) gl2Var.f, G, true);
            }
        } catch (Throwable th) {
            fa4.g(th, true);
        }
    }

    @Override // sbc
    public final void f(float f) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
        i88 i88Var = secretMediaViewer.E;
        if (i88Var != null) {
            long U = i88Var.U();
            if (U != -9223372036854775807L) {
                secretMediaViewer.E.p0((long) (f * U), false);
            }
            secretMediaViewer.E.g0();
        }
    }

    @Override // pt9
    public final void finish() {
        Point point = gl.q;
        if (point.x > point.y) {
            ((mvb) this.b).w0.finishPreviewFragment();
        }
    }

    public final al0 g() {
        h07 h07Var;
        zha zhaVar = (zha) this.b;
        if (zhaVar.a >= 1.0f || (h07Var = zhaVar.d) == null) {
            return null;
        }
        return h07Var.getButtonsGlassColorProvider();
    }

    @Override // mea
    public final a8 g0(int i, Runnable runnable, String str, boolean z, boolean z2) {
        nfa nfaVar = (nfa) this.b;
        a8 e = nfaVar.J.e(0, i, str);
        if (z) {
            int i2 = bkb.o7;
            e.d(nfaVar.c0(i2), nfaVar.c0(i2));
        }
        e.setOnClickListener(new nv2(this, z2, runnable));
        return e;
    }

    @Override // lt8
    public final Object get() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 7:
                return new pq9(pq9.d, (Context) ((pj4) obj).b, "com.google.android.datatransport.events");
            default:
                return new i7a((fga) ((kt8) obj).get());
        }
    }

    @Override // zu9
    public final CharSequence getContentDescription() {
        skb skbVar = (skb) this.b;
        return String.valueOf(Math.round((skbVar.b.getProgress() * (skbVar.e - r0)) + skbVar.d));
    }

    @Override // sbc
    public final void h(float f) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
        i88 i88Var = secretMediaViewer.E;
        if (i88Var != null) {
            i88Var.f0();
            long U = secretMediaViewer.E.U();
            if (U != -9223372036854775807L) {
                secretMediaViewer.E.p0((long) (f * U), false);
            }
        }
    }

    @Override // r9
    public final void i(Object obj) {
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.b;
        q9 q9Var = (q9) obj;
        Intent intent = q9Var.b;
        int i = q9Var.a;
        Bundle extras = intent == null ? null : intent.getExtras();
        if (i != -1) {
            if (extras == null) {
                extras = new Bundle();
            }
            xgd.h("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i);
            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i);
        }
        int i2 = xgd.e("ProxyBillingActivityV2", intent).a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.P;
        if (resultReceiver != null) {
            resultReceiver.send(i2, extras);
        } else {
            xgd.h("ProxyBillingActivityV2", "External offer flow result receiver is null");
        }
        if (i2 != 0) {
            xgd.h("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i2);
        }
        proxyBillingActivityV2.finish();
    }

    @Override // zu9
    public final void j(boolean z, float f) {
        skb skbVar = (skb) this.b;
        skbVar.r.C0(Math.round(((skbVar.e - r0) * f) + skbVar.d));
    }

    public final odc k(Class cls) {
        String str;
        String a;
        oh2 a2 = f59.a(cls);
        vk9 vk9Var = (vk9) this.b;
        Map map = oh2.b;
        Class cls2 = a2.a;
        cls2.getClass();
        if (cls2.isAnonymousClass() || cls2.isLocalClass()) {
            str = null;
        } else if (cls2.isArray()) {
            Class<?> componentType = cls2.getComponentType();
            str = (!componentType.isPrimitive() || (a = drd.a(componentType.getName())) == null) ? null : a.concat("Array");
            if (str == null) {
                str = "kotlin.Array";
            }
        } else {
            String a3 = drd.a(cls2.getName());
            str = a3 == null ? cls2.getCanonicalName() : a3;
        }
        if (str != null) {
            return vk9Var.s(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(str));
        }
        w26.j("Local and anonymous classes can not be ViewModels");
        return null;
    }

    @Override // al0
    public final int k0() {
        zha zhaVar = (zha) this.b;
        al0 d = d();
        int k0 = (d == null || !zhaVar.d.f()) ? 0 : d.k0();
        al0 g = g();
        if (g != null) {
            return bm2.f(zhaVar.a, g.k0(), k0);
        }
        return k0;
    }

    public void l() {
        View view = (View) this.b;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    @Override // pt9
    public final void m(float f) {
        Point point = gl.q;
        if (point.x > point.y) {
            ((mvb) this.b).w0.movePreviewFragment(f);
        }
    }

    public void n() {
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
            view.post(new uc(view, (byte) 6));
        }
    }

    @Override // y1d
    public final void o(ds2 ds2Var) {
        k3d k3dVar = (k3d) this.b;
        ReentrantLock reentrantLock = k3dVar.o;
        reentrantLock.lock();
        try {
            k3dVar.m = ds2Var;
            k3dVar.j();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // y1d
    public final void o0(int i) {
        k3d k3dVar = (k3d) this.b;
        ReentrantLock reentrantLock = k3dVar.o;
        reentrantLock.lock();
        try {
            if (k3dVar.n) {
                k3dVar.n = false;
                k3dVar.b.o0(i);
                k3dVar.m = null;
                k3dVar.l = null;
            } else {
                k3dVar.n = true;
                k3dVar.d.onConnectionSuspended(i);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        ydd yddVar = (ydd) this.b;
        yddVar.getClass();
        dc6 dc6Var = ydd.i;
        Log.w(dc6Var.a, dc6Var.d("Fail to store SessionState", new Object[0]), exc);
        yddVar.b(100);
    }

    @Override // ibc
    public final void onStateChanged(boolean z, int i) {
        i29 i29Var = (i29) this.b;
        if (z && i29Var.n.S() >= 0) {
            i29Var.x = true;
        }
        xb8 xb8Var = i29Var.f;
        sr8 sr8Var = i29Var.y;
        xb8Var.a(z, true);
        gl.r(sr8Var);
        if (z) {
            gl.d3(sr8Var, 16L);
        }
    }

    @Override // ibc
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    public final void p(IBinder iBinder) {
        synchronized (((HashMap) this.b)) {
            if (iBinder != null) {
                iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
            }
            new gie();
            for (Map.Entry entry : ((HashMap) this.b).entrySet()) {
                if (entry.getValue() != null) {
                    throw new ClassCastException();
                }
                try {
                    throw null;
                } catch (RemoteException unused) {
                    Log.w("WearableClient", "onPostInitHandler: Didn't add: " + String.valueOf(entry.getKey()) + "/null");
                }
            }
        }
    }

    @Override // al0
    public final float p0() {
        zha zhaVar = (zha) this.b;
        al0 d = d();
        al0 g = g();
        float p0 = d != null ? d.p0() : -1.0f;
        float p02 = g != null ? g.p0() : p0;
        return (p02 < 0.0f || p0 < 0.0f) ? zhaVar.a < 0.5f ? p02 : p0 : gl.R1(p02, p0, zhaVar.a);
    }

    @Override // al0
    public final float q0() {
        zha zhaVar = (zha) this.b;
        al0 d = d();
        al0 g = g();
        float q0 = d != null ? d.q0() : -1.0f;
        float q02 = g != null ? g.q0() : q0;
        return (q02 < 0.0f || q0 < 0.0f) ? zhaVar.a < 0.5f ? q02 : q0 : gl.R1(q02, q0, zhaVar.a);
    }

    @Override // f48
    public final void r() {
        try {
            Intent intent = new Intent("android.intent.action.PICK");
            intent.setType("image/*");
            ((Activity) ((gl2) this.b).c).startActivityForResult(intent, 11);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // gj
    public final void s(int i, int i2, boolean z) {
        ((hd9) this.b).v0(i, i2, z);
    }

    @Override // gk6
    public final void setParameters(Bundle bundle) {
        ((MediaCodec) this.b).setParameters(bundle);
    }

    @Override // al0
    public final int t1() {
        h07 h07Var;
        zha zhaVar = (zha) this.b;
        al0 d = d();
        int t1 = d != null ? d.t1() : 0;
        return (zhaVar.a >= 1.0f || (h07Var = zhaVar.d) == null) ? t1 : bm2.f(zhaVar.a, h07Var.getButtonsGlassBackgroundColor(), t1);
    }

    @Override // ll5
    public final void v(ImageReceiver imageReceiver) {
        ((zg9) this.b).t0(true);
    }

    @Override // pt9
    public final void w(ue3 ue3Var) {
        qvb qvbVar = ((mvb) this.b).w0;
        HashSet hashSet = qvb.s1;
        qvbVar.P0(ue3Var);
    }

    @Override // ibc
    public final void onRenderedFirstFrame() {
    }

    @Override // gk6
    public final void c() {
    }

    @Override // gk6
    public final void flush() {
    }

    @Override // gk6
    public final void shutdown() {
    }

    @Override // gk6
    public final void start() {
    }

    @Override // jaa
    public final void x() {
    }

    @Override // zu9
    public final void y() {
    }

    @Override // ibc
    public final void onRenderedFirstFrame(tj tjVar) {
    }

    @Override // ibc
    public final void onSeekFinished(tj tjVar) {
    }

    @Override // ibc
    public final void onSeekStarted(tj tjVar) {
    }

    @Override // ibc
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public /* synthetic */ g29(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public /* synthetic */ g29(u84 u84Var, mu8 mu8Var) {
        this.a = (byte) 25;
        this.b = mu8Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g29(sdc sdcVar, rdc rdcVar) {
        this(sdcVar, rdcVar, j13.b);
        this.a = (byte) 20;
        sdcVar.getClass();
    }

    public g29(sdc sdcVar, rdc rdcVar, l13 l13Var) {
        this.a = (byte) 20;
        sdcVar.getClass();
        rdcVar.getClass();
        l13Var.getClass();
        this.b = new vk9(sdcVar, rdcVar, l13Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g29(en4 en4Var) {
        this(en4Var.f(), en4Var.c(), en4Var.d());
        this.a = (byte) 20;
        en4Var.getClass();
    }

    @Override // ll5
    public final void E(int i, Drawable drawable) {
    }

    @Override // yt7
    public final float get() {
        return ((mza) this.b).G;
    }

    @Override // ibc
    public final void onError(lbc lbcVar, Exception exc) {
    }

    @Override // ll5
    public final void C(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
    }

    @Override // ibc
    public final void onVideoSizeChanged(int i, int i2, int i3, float f) {
    }
}
