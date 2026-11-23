package org.telegram.ui.Components;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class nd0 implements og.n, f61, org.telegram.ui.nm0, o2.i, zm0, com.google.android.gms.common.api.internal.q, tg.g, tg.q1, v4.k1, y51, z2.d {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ nd0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    public static void u(String str, TreeMap treeMap) {
        String[] split = str.split(":", 2);
        if (split.length < 2) {
            return;
        }
        String trim = split[0].trim();
        String trim2 = split[1].trim();
        List list = (List) treeMap.get(trim);
        if (list == null) {
            list = new ArrayList();
            treeMap.put(trim, list);
        }
        list.add(trim2);
    }

    public int A() {
        return ((v() & Byte.MAX_VALUE) << 21) | ((v() & Byte.MAX_VALUE) << 14) | ((v() & Byte.MAX_VALUE) << 7) | (v() & Byte.MAX_VALUE);
    }

    public void B(long j3) {
        long j10 = 0;
        while (j10 < j3) {
            long skip = ((ab.d) this.b).skip(j3 - j10);
            if (skip <= 0) {
                throw new EOFException();
            }
            j10 += skip;
        }
    }

    public void C(com.google.android.gms.internal.clearcut.y0 y0Var, TreeMap treeMap) {
        String str;
        List list = (List) treeMap.get("Sec-WebSocket-Protocol");
        if (list == null || (str = (String) list.get(0)) == null || str.length() == 0) {
            return;
        }
        synchronized (((rc.u) this.b).c) {
        }
        throw new rc.n(19, "The protocol contained in the Sec-WebSocket-Protocol header is not supported: ".concat(str), y0Var);
    }

    @Override // og.n
    public void G() {
        pd0 pd0Var = ((qd0) this.b).a;
        if (pd0Var != null) {
            ((org.telegram.ui.fo0) pd0Var).a.f0.invalidate();
        }
    }

    @Override // og.n
    public void R(boolean z10) {
        ((qd0) this.b).c.setAspectLock(z10);
    }

    @Override // o2.i
    public long a(long j3) {
        return 0L;
    }

    @Override // org.telegram.ui.Components.zm0
    public /* synthetic */ int a0() {
        return 0;
    }

    @Override // com.google.android.gms.common.api.internal.q
    public void accept(Object obj, Object obj2) {
        int i7 = this.a;
        Object obj3 = this.b;
        switch (i7) {
            case 13:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                s6.b bVar = (s6.b) ((s6.a) obj).n();
                Parcel j12 = bVar.j1();
                n7.a.b(j12, (q6.r) obj3);
                try {
                    bVar.b.transact(1, j12, null, 1);
                    j12.recycle();
                    taskCompletionSource.setResult(null);
                    return;
                } catch (Throwable th2) {
                    j12.recycle();
                    throw th2;
                }
            case 20:
                u7.x xVar = (u7.x) ((u7.k) obj).n();
                u7.f fVar = new u7.f(1, (TaskCompletionSource) obj2);
                Parcel p12 = xVar.p1();
                int i10 = u7.d.a;
                p12.writeInt(1);
                ((j8.c) obj3).writeToParcel(p12, 0);
                u7.d.c(p12, fVar);
                p12.writeString(null);
                xVar.t1(p12, 63);
                return;
            default:
                y8.j jVar = (y8.j) obj3;
                h8.b bVar2 = (h8.b) obj;
                Bundle B = bVar2.B();
                B.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
                h8.a aVar = new h8.a(0, (TaskCompletionSource) obj2);
                try {
                    h8.i iVar = (h8.i) bVar2.n();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    int i11 = h8.c.a;
                    obtain.writeInt(1);
                    jVar.writeToParcel(obtain, 0);
                    obtain.writeInt(1);
                    B.writeToParcel(obtain, 0);
                    obtain.writeStrongBinder(aVar);
                    try {
                        iVar.a.transact(19, obtain, null, 1);
                        obtain.recycle();
                        return;
                    } catch (Throwable th3) {
                        obtain.recycle();
                        throw th3;
                    }
                } catch (RemoteException e10) {
                    Log.e("WalletClientImpl", "RemoteException getting payment data", e10);
                    Bundle bundle = Bundle.EMPTY;
                    aVar.d0(Status.h, null);
                    return;
                }
        }
    }

    @Override // org.telegram.ui.nm0
    public void b(ArrayList arrayList) {
        a8.r7 r7Var = (a8.r7) this.b;
        try {
            if (arrayList.isEmpty()) {
                return;
            }
            org.telegram.messenger.yy yyVar = (org.telegram.messenger.yy) arrayList.get(0);
            if (yyVar.c != null) {
                r7Var.f = new File(org.telegram.messenger.w7.z(4), Utilities.b.nextInt() + ".jpg");
                Point c12 = org.telegram.messenger.g0.c1();
                Bitmap K = org.telegram.messenger.ec.K(yyVar.c, null, (float) c12.x, (float) c12.y, true);
                K.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream((File) r7Var.f));
                ((p71) r7Var.e).b((File) r7Var.f, K, true);
            }
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
    }

    @Override // v4.k1
    public int d(View view) {
        return v4.p0.z(view) - ((ViewGroup.MarginLayoutParams) ((v4.q0) view.getLayoutParams())).topMargin;
    }

    @Override // o2.i
    public long e(long j3, long j10) {
        return 0L;
    }

    @Override // o2.i
    public long f(long j3, long j10) {
        return -9223372036854775807L;
    }

    @Override // o2.i
    public p2.j g(long j3) {
        return (p2.j) this.b;
    }

    @Override // tg.q1
    public float get() {
        return ((tg.i2) this.b).G;
    }

    @Override // org.telegram.ui.Components.zm0
    public CharSequence getContentDescription() {
        pg.h hVar = (pg.h) this.b;
        float f10 = hVar.b;
        return String.valueOf(Math.round((hVar.a.getProgress() * (hVar.c - f10)) + f10));
    }

    @Override // tg.g
    public void h() {
        ((org.telegram.ui.vp0) this.b).u0(null, true);
    }

    @Override // tg.q1
    public void h2(float f10) {
        ((tg.i2) this.b).setOutlineWidth(f10);
    }

    @Override // v4.k1
    public int i() {
        return ((v4.p0) this.b).G();
    }

    @Override // org.telegram.ui.Components.y51
    public void invalidate() {
        ((wi.h) this.b).m.invalidate();
    }

    @Override // org.telegram.ui.Components.zm0
    public void j(boolean z10, float f10) {
        pg.h hVar = (pg.h) this.b;
        float f11 = hVar.b;
        float z11 = com.google.android.gms.internal.vision.e2.z(hVar.c, f11, f10, f11);
        hVar.d = z11;
        if (z10) {
            p6 p6Var = hVar.e;
            p6Var.getClass();
            p6Var.c(null, z11);
        }
        hVar.invalidate();
    }

    @Override // v4.k1
    public int k() {
        v4.p0 p0Var = (v4.p0) this.b;
        return p0Var.n - p0Var.C();
    }

    @Override // v4.k1
    public View l(int i7) {
        return ((v4.p0) this.b).q(i7);
    }

    @Override // v4.k1
    public int m(View view) {
        return v4.p0.v(view) + ((ViewGroup.MarginLayoutParams) ((v4.q0) view.getLayoutParams())).bottomMargin;
    }

    @Override // o2.i
    public long n(long j3, long j10) {
        return 0L;
    }

    @Override // tg.g
    public tg.n o() {
        return ((org.telegram.ui.vp0) this.b).C0;
    }

    @Override // org.telegram.ui.Components.f61
    public /* synthetic */ void onRenderedFirstFrame(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.f61
    public void onStateChanged(boolean z10, int i7) {
        zi0 zi0Var = (zi0) this.b;
        if (z10 && zi0Var.n.S() >= 0) {
            zi0Var.x = true;
        }
        ve0 ve0Var = zi0Var.f;
        eb0 eb0Var = zi0Var.y;
        ve0Var.a(z10, true);
        org.telegram.messenger.g0.r(eb0Var);
        if (z10) {
            org.telegram.messenger.g0.h3(eb0Var, 16L);
        }
    }

    @Override // org.telegram.ui.Components.f61
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    public void p() {
        sg.r0 r0Var = ((sg.t0) this.b).d;
        if (r0Var != null) {
            sg.q0 q0Var = r0Var.s;
            if (q0Var != null) {
                r0Var.cancelRunnable(q0Var);
                r0Var.s = null;
            }
            sg.q0 q0Var2 = new sg.q0(r0Var, 1);
            r0Var.s = q0Var2;
            r0Var.postRunnable(q0Var2, 1L);
        }
    }

    public void q(s4.p pVar, s4.m mVar, Collection collection) {
        s4.e eVar = (s4.e) this.b;
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
        s4.u uVar = eVar.x.a;
        String d = mVar.d();
        s4.v vVar = new s4.v(uVar, d, eVar.b(uVar, d), false);
        vVar.i(mVar);
        if (eVar.d == vVar) {
            return;
        }
        eVar.h(eVar, vVar, eVar.y, 3, eVar.x, collection);
        eVar.x = null;
        eVar.y = null;
    }

    @Override // og.n
    public void q0(boolean z10) {
        qd0 qd0Var = (qd0) this.b;
        qd0Var.getClass();
        pd0 pd0Var = qd0Var.a;
        if (pd0Var != null) {
            ((org.telegram.ui.fo0) pd0Var).k(z10);
        }
    }

    @Override // o2.i
    public boolean r() {
        return true;
    }

    @Override // o2.i
    public long s() {
        return 0L;
    }

    @Override // org.telegram.ui.nm0
    public void t() {
        try {
            Intent intent = new Intent("android.intent.action.PICK");
            intent.setType("image/*");
            ((Activity) ((a8.r7) this.b).c).startActivityForResult(intent, 11);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public String toString() {
        switch (this.a) {
            case 12:
                return "ProviderMetadata{ componentName=" + ((ComponentName) this.b).flattenToShortString() + " }";
            default:
                return super.toString();
        }
    }

    public byte v() {
        int read = ((ab.d) this.b).read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override // og.n
    public void v0() {
        pd0 pd0Var = ((qd0) this.b).a;
        if (pd0Var != null) {
            PhotoViewer photoViewer = ((org.telegram.ui.fo0) pd0Var).a;
            if (photoViewer.d2 == 1) {
                photoViewer.H2 = true;
                photoViewer.p3();
            }
        }
    }

    @Override // o2.i
    public long x(long j3) {
        return 1L;
    }

    public int y() {
        return ((v() & 255) << 24) | ((v() & 255) << 16) | ((v() & 255) << 8) | (v() & 255);
    }

    @Override // o2.i
    public long z(long j3, long j10) {
        return 1L;
    }

    public nd0(int i7) {
        this.a = i7;
        switch (i7) {
            case 28:
                this.b = new nb.a(6);
                break;
            default:
                this.b = new org.telegram.utils.twidget.w(1.0f, 5, 1, false);
                break;
        }
    }

    @Override // org.telegram.ui.Components.f61
    public void onRenderedFirstFrame() {
    }

    public nd0(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.a = 8;
        this.b = new GestureDetector(context, onGestureListener, null);
    }

    public nd0(TextView textView) {
        this.a = 15;
        this.b = new t1.h(textView);
    }

    @Override // org.telegram.ui.Components.f61
    public /* synthetic */ void onSeekFinished(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.f61
    public /* synthetic */ void onSeekStarted(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.f61
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // org.telegram.ui.Components.zm0
    public void w() {
    }

    @Override // o2.i
    public long c(long j3, long j10) {
        return j10;
    }

    @Override // org.telegram.ui.Components.f61
    public void onError(h61 h61Var, Exception exc) {
    }

    @Override // org.telegram.ui.Components.f61
    public void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
    }
}
