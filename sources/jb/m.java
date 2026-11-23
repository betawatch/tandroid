package jb;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import e2.o0;
import h2.k0;
import h2.l0;
import h2.x;
import hi.u0;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import li.c0;
import li.i0;
import m.o3;
import m9.u;
import m9.y;
import n2.s;
import oi.a6;
import oi.f1;
import oi.h3;
import oi.h4;
import oi.q3;
import oi.r3;
import oi.s3;
import oi.t3;
import oi.y3;
import org.telegram.messenger.aw;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cj;
import org.telegram.messenger.da;
import org.telegram.messenger.fj;
import org.telegram.messenger.g0;
import org.telegram.messenger.h10;
import org.telegram.messenger.p2;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Cells.i3;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.m1;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Cells.u2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.kt;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.x5;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.zm0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Wallet.o6;
import org.telegram.ui.ax;
import org.telegram.ui.bn;
import org.telegram.ui.bx;
import org.telegram.ui.fk0;
import org.telegram.ui.fr0;
import org.telegram.ui.gf0;
import org.telegram.ui.h5;
import org.telegram.ui.oj0;
import org.telegram.ui.qw;
import org.telegram.ui.uj0;
import org.telegram.ui.wg0;
import ug.a1;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class m implements ib.b, i0, f3.i, r3, zm0, kt, m1, tj0, uj0, ui.a, h2.d {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ m(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // oi.r3
    public void B(oi.a aVar) {
        oi.p pVar = (oi.p) this.c;
        ti tiVar = pVar.b;
        g2 g2Var = tiVar.a2;
        if (g2Var != null && aVar != null && (aVar.b instanceof TL_iv.pageBlockMap) && g0.J1(g2Var)) {
            ti tiVar2 = new ti(pVar.getContext(), tiVar.a2, false, false, false, null);
            tiVar2.X3 = new qb.a(16);
            tiVar2.K1 = true;
            tiVar2.v3.setVisibility(8);
            tiVar2.u4 = new a3.h(pVar, aVar, tiVar2, 15);
            tiVar2.f1();
            tiVar2.show();
        }
    }

    public void B0(long j3, File file) {
        synchronized (((e0.g) this.c).f) {
            ((HashMap) ((e0.g) this.c).g).put(Long.valueOf(j3), file);
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ j9 B2() {
        return null;
    }

    @Override // org.telegram.ui.Cells.m1
    public String D(long j3) {
        String trim = ((EditTextBoldCursor) this.b).getText().toString().trim();
        if (trim.length() > 16) {
            trim = trim.substring(0, 16);
        }
        if (((oy0) this.c).s || !TextUtils.isEmpty(trim)) {
            return trim;
        }
        return null;
    }

    public void D0(Exception exc, boolean z10) {
        this.c = null;
        HashSet hashSet = (HashSet) this.b;
        h9.i0 q10 = h9.i0.q(hashSet);
        hashSet.clear();
        h9.g0 listIterator = q10.listIterator(0);
        while (listIterator.hasNext()) {
            q2.b bVar = (q2.b) listIterator.next();
            bVar.getClass();
            bVar.l(z10 ? 1 : 3, exc);
        }
    }

    @Override // oi.r3
    public void E() {
        y3 y3Var = ((oi.p) this.c).s;
        if (y3Var != null) {
            int i7 = y3Var.b0;
            if (i7 == 2) {
                i7 = 0;
            }
            y3Var.c0 = i7;
            y3Var.e(false, false);
            y3Var.g(2, true);
        }
    }

    public void E0(o0.f fVar) {
        androidx.biometric.o oVar = (androidx.biometric.o) this.c;
        u0 u0Var = (u0) this.b;
        int i7 = fVar.b;
        if (i7 != 0) {
            oVar.execute(new i6.g(u0Var, i7));
        } else {
            oVar.execute(new u(24, u0Var, fVar.a));
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean F0(fj fjVar) {
        return true;
    }

    @Override // f3.i
    public void G() {
        x xVar = (x) this.c;
        byte[] bArr = l0.b;
        xVar.getClass();
        xVar.L(bArr.length, bArr);
    }

    public void H(int i7, int i10, int i11) {
        aw[] awVarArr = (aw[]) this.b;
        aw awVar = new aw();
        awVar.c = null;
        awVarArr[i7] = awVar;
        awVar.d = i10;
        awVar.e = (i10 + i11) - 1;
        if (i11 == 1) {
            long j3 = ((long[]) this.c)[i10];
            awVar.a = j3;
            awVar.b = j3;
            return;
        }
        int i12 = i7 * 2;
        int i13 = i11 / 2;
        H(i12, i10, i13);
        int i14 = i12 + 1;
        H(i14, i10 + i13, i11 - i13);
        aw awVar2 = awVarArr[i7];
        aw awVar3 = awVarArr[i12];
        awVar3.getClass();
        aw awVar4 = awVarArr[i14];
        awVar4.getClass();
        awVar2.getClass();
        awVar2.a = Math.max(awVar3.a, awVar4.a);
        awVarArr[i7].b = Math.min(awVarArr[i12].b, awVarArr[i14].b);
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean H1(r1 r1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // h2.d
    public y I(o0 o0Var) {
        Uri uri;
        byte[] bArr;
        i61 i61Var = (i61) this.c;
        if (i61Var != null && (((uri = (Uri) i61Var.c) != null && uri.equals(o0Var.n)) || ((bArr = (byte[]) i61Var.b) != null && Arrays.equals(bArr, o0Var.k)))) {
            y yVar = (y) ((i61) this.c).d;
            yVar.getClass();
            return yVar;
        }
        y I = ((h2.d) this.b).I(o0Var);
        if (I == null) {
            return null;
        }
        this.c = new i61(o0Var, I);
        return I;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean J1() {
        return false;
    }

    public void K(aw awVar, int i7) {
        awVar.c = Integer.valueOf(i7);
        int i10 = awVar.d;
        long j3 = i7;
        awVar.a = j3;
        awVar.b = j3;
        ((long[]) this.c)[i10] = j3;
    }

    public void K0(int i7) {
        aw[] awVarArr = (aw[]) this.b;
        aw awVar = awVarArr[i7];
        Integer num = awVar.c;
        if (num != null) {
            int i10 = i7 * 2;
            K(awVarArr[i10], num.intValue());
            K(awVarArr[i10 + 1], awVar.c.intValue());
            awVar.c = null;
        }
    }

    @Override // oi.r3
    public void N() {
        oi.p pVar = (oi.p) this.c;
        if (pVar.getCurrentItemTop() != pVar.J) {
            pVar.b.N1(pVar, 0);
        }
        pVar.f0();
        oi.p.P(pVar);
    }

    public void O0(q2.b bVar) {
        ((HashSet) this.b).add(bVar);
        if (((q2.b) this.c) != null) {
            return;
        }
        this.c = bVar;
        q2.p g10 = bVar.b.g();
        bVar.z = g10;
        android.support.v4.media.session.f fVar = bVar.s;
        String str = l0.a;
        g10.getClass();
        fVar.getClass();
        fVar.obtainMessage(1, new q2.a(x2.u.g.getAndIncrement(), true, SystemClock.elapsedRealtime(), g10)).sendToTarget();
    }

    public long P0(int i7, int i10) {
        long[] jArr = (long[]) this.c;
        if (jArr.length >= 30) {
            return Q0(1, i7, i10);
        }
        if (i7 < 0) {
            i7 = 0;
        }
        if (i10 > jArr.length - 1) {
            i10 = jArr.length - 1;
        }
        long j3 = Long.MIN_VALUE;
        while (i7 <= i10) {
            long j10 = jArr[i7];
            if (j10 > j3) {
                j3 = j10;
            }
            i7++;
        }
        return j3;
    }

    @Override // oi.r3
    public void Q(a6 a6Var, String str) {
        oi.p pVar = (oi.p) this.c;
        if (pVar.w == null) {
            i6 i6Var = (i6) this.b;
            pVar.w = new o3(new ab.g(29, this, i6Var), i6Var);
        }
        pVar.w.g(a6Var, str);
    }

    public long Q0(int i7, int i10, int i11) {
        aw awVar = ((aw[]) this.b)[i7];
        if (awVar.c != null) {
            int i12 = awVar.d;
            int i13 = awVar.e;
            if (i10 >= i12 && i11 <= i13) {
                return r1.intValue();
            }
        }
        int i14 = awVar.d;
        int i15 = awVar.e;
        if (i14 >= i10 && i15 <= i11) {
            return awVar.a;
        }
        if ((i10 > i14 || i11 < i14) && (i10 < i14 || i10 > i15)) {
            return 0L;
        }
        K0(i7);
        int i16 = i7 * 2;
        return Math.max(Q0(i16, i10, i11), Q0(i16 + 1, i10, i11));
    }

    @Override // org.telegram.ui.Cells.m1
    public void Q1(r1 r1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        vf.c.t(r1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.m1
    public boolean R0(long j3) {
        return ((oy0) this.c).w;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ CharacterStyle R1(r1 r1Var) {
        return null;
    }

    @Override // oi.r3
    public void S(int i7) {
        oi.p pVar = (oi.p) this.c;
        pVar.b.N1(pVar, i7);
        pVar.f0();
        oi.p.P(pVar);
    }

    public void T() {
        this.b = null;
        this.c = null;
    }

    public long T0(int i7, int i10) {
        long[] jArr = (long[]) this.c;
        if (jArr.length >= 30) {
            return U0(1, i7, i10);
        }
        if (i7 < 0) {
            i7 = 0;
        }
        if (i10 > jArr.length - 1) {
            i10 = jArr.length - 1;
        }
        long j3 = Long.MAX_VALUE;
        while (i7 <= i10) {
            long j10 = jArr[i7];
            if (j10 < j3) {
                j3 = j10;
            }
            i7++;
        }
        return j3;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean T1(r1 r1Var, fj fjVar) {
        return false;
    }

    public void U(l2.e eVar) {
        synchronized (eVar) {
        }
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new n2.q(this, eVar, 0));
        }
    }

    public long U0(int i7, int i10, int i11) {
        aw awVar = ((aw[]) this.b)[i7];
        if (awVar.c != null) {
            int i12 = awVar.d;
            int i13 = awVar.e;
            if (i10 >= i12 && i11 <= i13) {
                return r1.intValue();
            }
        }
        int i14 = awVar.d;
        int i15 = awVar.e;
        if (i14 >= i10 && i15 <= i11) {
            return awVar.b;
        }
        if ((i10 > i14 || i11 < i14) && (i10 < i14 || i10 > i15)) {
            return 2147483647L;
        }
        K0(i7);
        int i16 = i7 * 2;
        return Math.min(U0(i16, i10, i11), U0(i16 + 1, i10, i11));
    }

    @Override // h2.d
    public y V(byte[] bArr) {
        byte[] bArr2;
        i61 i61Var = (i61) this.c;
        if (i61Var == null || (bArr2 = (byte[]) i61Var.b) == null || !Arrays.equals(bArr2, bArr)) {
            y V = ((h2.d) this.b).V(bArr);
            this.c = new i61(bArr, V);
            return V;
        }
        y yVar = (y) ((i61) this.c).d;
        yVar.getClass();
        return yVar;
    }

    public void V0() {
        m8.a aVar = (m8.a) this.b;
        try {
            v7.f fVar = (v7.f) aVar.a;
            fVar.t1(fVar.p1(), 1);
            ((da) this.c).c.remove(aVar);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean X(r1 r1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    public void X0(int i7) {
        try {
            v7.f fVar = (v7.f) ((m8.a) this.b).a;
            Parcel p12 = fVar.p1();
            p12.writeInt(i7);
            fVar.t1(p12, 11);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean Y() {
        return false;
    }

    public void Y0(int i7) {
        try {
            l8.e eVar = (l8.e) this.b;
            Parcel p12 = eVar.p1();
            p12.writeInt(i7);
            eVar.t1(p12, 16);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean Z(r1 r1Var) {
        return false;
    }

    public void Z0(double d) {
        m8.a aVar = (m8.a) this.b;
        aVar.getClass();
        try {
            v7.f fVar = (v7.f) aVar.a;
            Parcel p12 = fVar.p1();
            p12.writeDouble(d);
            fVar.t1(p12, 5);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0023 A[RETURN] */
    @Override // oi.r3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a(float f10) {
        boolean z10;
        y3 y3Var = ((oi.p) this.c).s;
        if (y3Var != null) {
            FrameLayout frameLayout = y3Var.I;
            if (frameLayout != null) {
                frameLayout.getLocationOnScreen(new int[2]);
                if (f10 >= r4[1]) {
                    z10 = true;
                    y3Var.e(z10, true);
                    if (!z10) {
                        return true;
                    }
                }
            }
            z10 = false;
            y3Var.e(z10, true);
            if (!z10) {
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.zm0
    public /* synthetic */ int a0() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean a2(r1 r1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // oi.r3
    public void b(f1 f1Var, boolean z10) {
        ((oi.p) this.c).b.i1(f1Var, z10);
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean b0() {
        return false;
    }

    public void b1(int i7) {
        try {
            v7.f fVar = (v7.f) ((m8.a) this.b).a;
            Parcel p12 = fVar.p1();
            p12.writeInt(i7);
            fVar.t1(p12, 9);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    @Override // oi.r3
    public void c(q3 q3Var, View view) {
        oi.p pVar = (oi.p) this.c;
        x60 x60Var = new x60(pVar, (i6) this.b, view, false, false, true);
        x60Var.T = true;
        pVar.I = h4.c(x60Var, pVar.b.a2, pVar.getContext(), (i6) this.b, q3Var, true);
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean c1(r1 r1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ fr0 c2() {
        return null;
    }

    @Override // li.i0, o0.a
    public void close() {
        ((c0) this.c).o1.C(0);
    }

    @Override // org.telegram.ui.Cells.m1
    public boolean d() {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ int e0() {
        return 0;
    }

    @Override // org.telegram.ui.uj0
    public void f(String str, String str2) {
        fk0 fk0Var = ((oj0) this.c).a;
        if ("PHONE_VERIFICATION_NEEDED".equals(str)) {
            fk0Var.S1(true, str2, (gf0) this.b, this, fk0Var.C1);
        } else {
            fk0Var.R1(true, false);
        }
    }

    @Override // oi.r3
    public void f0() {
        y3 y3Var = ((oi.p) this.c).s;
        if (y3Var != null) {
            y3Var.e(false, true);
            int i7 = y3Var.c0;
            y3Var.g(i7 != 2 ? i7 : 0, true);
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public boolean f2(long j3) {
        return ((oy0) this.c).s;
    }

    @Override // org.telegram.ui.Components.tj0
    public boolean g(float f10, float f11, int i7, View view) {
        bx bxVar = (bx) this.c;
        if (view instanceof u2) {
            u2 u2Var = (u2) view;
            if (u2Var.o2) {
                bxVar.h5(u2Var.getDialogId(), view);
                return true;
            }
        }
        qw qwVar = bxVar.A0;
        if (qwVar != null && qwVar.getVisibility() == 0 && bxVar.A0.n) {
            return false;
        }
        return bxVar.F4(view, i7, f10, ((ax) this.b).d);
    }

    public byte[] g0(q3.a aVar) {
        DataOutputStream dataOutputStream = (DataOutputStream) this.c;
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.b;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(aVar.a);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeBytes(aVar.b);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(aVar.c);
            dataOutputStream.writeLong(aVar.d);
            dataOutputStream.write(aVar.e);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean g1(fj fjVar) {
        return org.telegram.ui.Cells.c0.a(fjVar);
    }

    @Override // fd.a
    public Object get() {
        return new l((r) ((ib.c) this.b).get(), (r) ((ib.c) this.c).get());
    }

    @Override // org.telegram.ui.Components.zm0
    public /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // org.telegram.ui.Components.tj0
    public void h() {
        Point point = g0.q;
        if (point.x > point.y) {
            ((bx) this.c).finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ jh.a h0() {
        return null;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean i() {
        return true;
    }

    @Override // oi.r3
    public x60 i0(View view) {
        oi.p pVar = (oi.p) this.c;
        x60 x60Var = new x60(pVar, (i6) this.b, view, false, false, true);
        pVar.I = x60Var;
        return x60Var;
    }

    @Override // org.telegram.ui.Components.zm0
    public void j(boolean z10, float f10) {
        h5.n1 = f10;
        ((TextView) this.b).setText("Saturation " + (f10 * 5.0f));
        cu0 cu0Var = ((h5) this.c).m1;
        cu0Var.M();
        cu0Var.K();
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean j0(r1 r1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean j2(r1 r1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ String k(r1 r1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean k0(r1 r1Var, TLRPC.User user) {
        return false;
    }

    @Override // org.telegram.ui.Components.tj0
    public void l(float f10) {
        Point point = g0.q;
        if (point.x > point.y) {
            ((bx) this.c).movePreviewFragment(f10);
        }
    }

    @Override // oi.r3
    public void l0(s3 s3Var, View view) {
        oi.p pVar = (oi.p) this.c;
        x60 x60Var = new x60(pVar, (i6) this.b, view, false, false, true);
        x60Var.T = true;
        g2 g2Var = pVar.b.a2;
        pVar.getContext();
        pVar.I = h4.b(x60Var, g2Var, s3Var, true);
    }

    @Override // li.i0
    public void n(long j3) {
        ((g2) this.b).presentFragment(bn.ua(j3));
        ((c0) this.c).dismiss();
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean n0() {
        return false;
    }

    @Override // li.i0
    public void o() {
        c0 c0Var = (c0) this.c;
        c0Var.w1.d.g3.O(true);
        c0Var.v1.d.g3.O(true);
    }

    @Override // oi.r3
    public void onContentChanged() {
        oi.p pVar = (oi.p) this.c;
        y3 y3Var = pVar.s;
        if (y3Var != null) {
            y3Var.setSendLoading(pVar.r.p3());
        }
        pVar.a0(true);
        pVar.d0();
        oi.d dVar = pVar.Q;
        g0.r(dVar);
        g0.h3(dVar, 1000L);
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ int p0(r1 r1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean p2(r1 r1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // oi.r3
    public void r(int i7) {
        oi.p.T((oi.p) this.c, 74, i7);
    }

    @Override // org.telegram.ui.Cells.m1
    public boolean r0() {
        return false;
    }

    @Override // oi.r3
    public void s0() {
        oi.p pVar = (oi.p) this.c;
        pVar.c0();
        pVar.d0();
    }

    public String toString() {
        switch (this.a) {
            case 29:
                return "Bounds{lower=" + ((i0.b) this.b) + " upper=" + ((i0.b) this.c) + "}";
            default:
                return super.toString();
        }
    }

    @Override // org.telegram.ui.Components.kt
    public void u() {
        ((i3) this.c).b(((mt) this.b).getText());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CctBackendFactory u0(String str) {
        Bundle bundle;
        Map map;
        PackageManager packageManager;
        if (((Map) this.c) == null) {
            Context context = (Context) this.b;
            try {
                packageManager = context.getPackageManager();
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
            }
            if (packageManager == null) {
                Log.w("BackendRegistry", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                if (serviceInfo == null) {
                    Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                    if (bundle != null) {
                        Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                        map = Collections.EMPTY_MAP;
                    } else {
                        HashMap hashMap = new HashMap();
                        for (String str2 : bundle.keySet()) {
                            Object obj = bundle.get(str2);
                            if ((obj instanceof String) && str2.startsWith("backend:")) {
                                for (String str3 : ((String) obj).split(",", -1)) {
                                    String trim = str3.trim();
                                    if (!trim.isEmpty()) {
                                        hashMap.put(trim, str2.substring(8));
                                    }
                                }
                            }
                        }
                        map = hashMap;
                    }
                    this.c = map;
                }
            }
            bundle = null;
            if (bundle != null) {
            }
            this.c = map;
        }
        String str4 = (String) ((Map) this.c).get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e10) {
            Log.w("BackendRegistry", "Class " + str4 + " is not found.", e10);
            return null;
        } catch (IllegalAccessException e11) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e11);
            return null;
        } catch (InstantiationException e12) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e12);
            return null;
        } catch (NoSuchMethodException e13) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e13);
            return null;
        } catch (InvocationTargetException e14) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e14);
            return null;
        }
    }

    @Override // f3.i
    public f3.h v(f3.p pVar, long j3) {
        long position = pVar.getPosition();
        int min = (int) Math.min(20000L, pVar.getLength() - position);
        x xVar = (x) this.c;
        xVar.K(min);
        pVar.b(0, min, xVar.a);
        int i7 = -1;
        int i10 = -1;
        long j10 = -9223372036854775807L;
        while (xVar.a() >= 4) {
            if (k3.a.a(xVar.b, xVar.a) != 442) {
                xVar.O(1);
            } else {
                xVar.O(4);
                long c10 = m4.x.c(xVar);
                if (c10 != -9223372036854775807L) {
                    long b10 = ((k0) this.b).b(c10);
                    if (b10 > j3) {
                        return j10 == -9223372036854775807L ? new f3.h(b10, -1, position) : new f3.h(-9223372036854775807L, 0, position + i10);
                    }
                    if (b10 + 100000 > j3) {
                        return new f3.h(-9223372036854775807L, 0, position + xVar.b);
                    }
                    j10 = b10;
                    i10 = xVar.b;
                }
                int i11 = xVar.c;
                if (xVar.a() >= 10) {
                    xVar.O(9);
                    int A = xVar.A() & 7;
                    if (xVar.a() >= A) {
                        xVar.O(A);
                        if (xVar.a() >= 4) {
                            if (k3.a.a(xVar.b, xVar.a) == 443) {
                                xVar.O(4);
                                int H = xVar.H();
                                if (xVar.a() < H) {
                                    xVar.N(i11);
                                } else {
                                    xVar.O(H);
                                }
                            }
                            while (true) {
                                if (xVar.a() < 4) {
                                    break;
                                }
                                int a10 = k3.a.a(xVar.b, xVar.a);
                                if (a10 == 442 || a10 == 441 || (a10 >>> 8) != 1) {
                                    break;
                                }
                                xVar.O(4);
                                if (xVar.a() < 2) {
                                    xVar.N(i11);
                                    break;
                                }
                                xVar.N(Math.min(xVar.c, xVar.b + xVar.H()));
                            }
                        } else {
                            xVar.N(i11);
                        }
                    } else {
                        xVar.N(i11);
                    }
                } else {
                    xVar.N(i11);
                }
                i7 = xVar.b;
            }
        }
        return j10 != -9223372036854775807L ? new f3.h(j10, -2, position + i7) : f3.h.d;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean v0(x5 x5Var) {
        return false;
    }

    public wg0 w0(int i7, long j3, boolean z10) {
        if (i7 > 0) {
            i7 = ((SparseIntArray) this.c).get(i7, 0);
        }
        if (i7 == 0) {
            return null;
        }
        long j10 = i7;
        LongSparseArray B0 = ((u0) this.b).B0(j3, 0L);
        wg0 wg0Var = (wg0) (B0 != null ? B0.get(j10) : null);
        if (wg0Var != null || !z10) {
            return wg0Var;
        }
        wg0 wg0Var2 = new wg0();
        ((u0) this.b).E0(j3, 0L, j10, wg0Var2);
        return wg0Var2;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean x1() {
        return false;
    }

    @Override // oi.r3
    public void y() {
        oi.p pVar = (oi.p) this.c;
        t3 t3Var = pVar.r;
        y3 y3Var = pVar.s;
        if (y3Var != null) {
            h3 h3Var = t3Var.v3;
            int i7 = (h3Var != null && h3Var.x() && t3Var.F4()) ? 1 : 0;
            if (y3Var.b0 == 2) {
                y3Var.c0 = i7;
            } else {
                y3Var.g(i7, true);
            }
            if (i7 != 0) {
                pVar.b0();
            }
        }
        pVar.e0();
    }

    public String y0(String str) {
        String str2 = (String) this.c;
        Resources resources = (Resources) this.b;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean y2(int i7) {
        return false;
    }

    @Override // ui.a
    public void z(float f10, float f11, float f12, float f13, Canvas canvas) {
        Paint paint = (Paint) this.b;
        PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.c;
        a1 a1Var = premiumPreviewFragment.n0;
        if (premiumPreviewFragment.i0) {
            paint.setColor(premiumPreviewFragment.getThemedColor(n6.a7));
            canvas.drawRect(f10, f11, f12, f13, paint);
        } else {
            a1Var.d(0, (-premiumPreviewFragment.e0.getMeasuredWidth()) * 0.1f * premiumPreviewFragment.c0, 0, premiumPreviewFragment.e0.getMeasuredWidth(), 0.0f, premiumPreviewFragment.e0.getMeasuredHeight());
            canvas.drawRect(f10, f11, f12, f13, a1Var.f);
        }
    }

    public boolean z0() {
        o6 o6Var = (o6) this.c;
        return o6Var.M0 > 0.0f || o6Var.D0();
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean z1(r1 r1Var, int i7) {
        return false;
    }

    public /* synthetic */ m(int i7, boolean z10) {
        this.a = i7;
    }

    public /* synthetic */ m(Object obj, Object obj2, boolean z10, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = obj2;
    }

    public m(IBinder iBinder) {
        this.a = 5;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.b = new Messenger(iBinder);
            this.c = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.c = new m6.g(iBinder);
            this.b = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    public m(l8.e eVar) {
        this.a = 1;
        new HashMap();
        q6.m.h(eVar);
        this.b = eVar;
    }

    public m(String str, String str2) {
        this.a = 26;
        q6.m.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.b = str;
        this.c = (str2 == null || str2.length() <= 0) ? null : str2;
    }

    public m(long[] jArr) {
        this.a = 12;
        this.c = jArr;
        if (jArr.length < 30) {
            return;
        }
        this.b = new aw[(int) (Math.pow(2.0d, Math.floor((Math.log(jArr.length) / Math.log(2.0d)) + 1.0d)) * 2.0d)];
        H(1, 0, jArr.length);
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void H0() {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void U1() {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void e() {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void k1() {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void p() {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void u2() {
    }

    @Override // org.telegram.ui.Components.zm0
    public void w() {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void x() {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void z2() {
    }

    public m(h2.d dVar) {
        this.a = 22;
        this.b = dVar;
    }

    public m(k0 k0Var) {
        this.a = 4;
        this.b = k0Var;
        this.c = new x();
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void A(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void C(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void C1(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void F(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void G0(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void J(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void L0(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void L1(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void M(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void N0(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void O(cj cjVar) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void O1(fj fjVar) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void R(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void S0(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void W(fj fjVar) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void d0(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void e1(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void f1(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void k2(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void m0(int i7) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void q0(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void q2(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void s(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void t(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void t0(String str) {
    }

    public m(Context context, int i7) {
        this.a = i7;
        switch (i7) {
            case 27:
                q6.m.h(context);
                Resources resources = context.getResources();
                this.b = resources;
                this.c = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
                break;
            default:
                this.c = null;
                this.b = context;
                break;
        }
    }

    public m(Handler handler, s sVar) {
        this.a = 6;
        if (sVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.b = handler;
        this.c = sVar;
    }

    public m(PremiumPreviewFragment premiumPreviewFragment) {
        this.a = 20;
        this.c = premiumPreviewFragment;
        this.b = new Paint();
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void F1(r1 r1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void I1(r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void K1(r1 r1Var, int i7) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void L(r1 r1Var, p2 p2Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void W0(r1 r1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void Y1(r1 r1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void b2(r1 r1Var, h10 h10Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void e2(String str, String str2) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void l2(r1 r1Var, long j3) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void m1(r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void p1(r1 r1Var, int i7) {
    }

    public m(int i7) {
        this.a = i7;
        switch (i7) {
            case 24:
                this.b = new HashSet();
                break;
            case 25:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.b = byteArrayOutputStream;
                this.c = new DataOutputStream(byteArrayOutputStream);
                break;
            default:
                this.b = new u0();
                this.c = new SparseIntArray();
                break;
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void A2(r1 r1Var, int i7, int i10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public void B1(r1 r1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void I0(r1 r1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void J0(r1 r1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public void M0(r1 r1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void P(r1 r1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void a1(r1 r1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void o0(r1 r1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void t1(r1 r1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void x0(r1 r1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void A0(r1 r1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void C0(r1 r1Var, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void Z1(r1 r1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void q(r1 r1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void g2(r1 r1Var, int i7, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void m(r1 r1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void w2(r1 r1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void c0(r1 r1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void S1(fj fjVar, String str, String str2, String str3, String str4, int i7, int i10) {
    }
}
