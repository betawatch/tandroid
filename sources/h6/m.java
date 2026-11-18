package h6;

import a8.la;
import a8.r7;
import ab.c0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.WorkSource;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewTreeObserver;
import bi.r2;
import ch.n0;
import ch.p0;
import ch.q0;
import com.google.android.gms.common.api.internal.d0;
import com.google.android.gms.common.api.internal.g1;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import e2.s0;
import e2.t;
import e2.u;
import f3.i0;
import fi.a6;
import fi.l2;
import gb.h1;
import h2.j0;
import h2.k0;
import h2.l0;
import h2.x;
import hi.c7;
import hi.d7;
import hi.s8;
import hi.t5;
import hi.v5;
import hi.w5;
import j$.util.DesugarCollections;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import jg.w;
import m.o3;
import m4.a0;
import m4.f0;
import n2.w0;
import org.telegram.messenger.ILocationServiceProvider;
import org.telegram.messenger.a8;
import org.telegram.messenger.ap;
import org.telegram.messenger.ef;
import org.telegram.messenger.fa;
import org.telegram.messenger.fj;
import org.telegram.messenger.g0;
import org.telegram.messenger.ks;
import org.telegram.messenger.na;
import org.telegram.messenger.nt;
import org.telegram.messenger.oa;
import org.telegram.messenger.pa;
import org.telegram.messenger.qa;
import org.telegram.messenger.ra;
import org.telegram.messenger.t0;
import org.telegram.messenger.w9;
import org.telegram.messenger.x9;
import org.telegram.messenger.y9;
import org.telegram.messenger.z9;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.v0;
import org.telegram.ui.ActionBar.z0;
import org.telegram.ui.Cells.c5;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.cz;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.ix0;
import org.telegram.ui.Components.kk;
import org.telegram.ui.Components.r51;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.ui0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vi0;
import org.telegram.ui.Components.wx0;
import org.telegram.ui.Components.yy;
import org.telegram.ui.bn;
import org.telegram.ui.bn0;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class m implements d61, ib.b, c4.d, a0, OnCompleteListener, q5.b, ILocationServiceProvider, ap, ui0, bn0 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ m(int i7, boolean z10) {
        this.a = i7;
    }

    public static m D(Context context, AttributeSet attributeSet, int[] iArr, int i7) {
        return new m(context, context.obtainStyledAttributes(attributeSet, iArr, i7, 0));
    }

    public static StringBuilder F(String str) {
        StringBuilder sb2;
        int i7;
        byte[] H;
        int i10;
        try {
            BufferedReader bufferedReader = new BufferedReader(new StringReader(str));
            int i11 = 0;
            boolean z10 = false;
            m mVar = null;
            String str2 = null;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                if (!readLine.startsWith("PHOTO")) {
                    if (readLine.indexOf(58) >= 0) {
                        if (readLine.startsWith("BEGIN:VCARD")) {
                            mVar = new m(21, false);
                            mVar.c = new ArrayList();
                            mVar.d = new ArrayList();
                        } else if (readLine.startsWith("END:VCARD") && mVar != null) {
                            z10 = true;
                        }
                    }
                    if (str2 != null) {
                        readLine = str2 + readLine;
                        str2 = null;
                    }
                    if (readLine.contains("=QUOTED-PRINTABLE") && readLine.endsWith("=")) {
                        str2 = readLine.substring(i11, readLine.length() - 1);
                    } else {
                        int indexOf = readLine.indexOf(":");
                        String[] strArr = indexOf >= 0 ? new String[]{readLine.substring(i11, indexOf), readLine.substring(indexOf + 1).trim()} : new String[]{readLine.trim()};
                        if (strArr.length < 2 || mVar == null) {
                            i7 = i11;
                        } else if (strArr[i11].startsWith("ORG")) {
                            String[] split = strArr[i11].split(";");
                            int length = split.length;
                            int i12 = i11;
                            String str3 = null;
                            String str4 = null;
                            while (i12 < length) {
                                String[] split2 = split[i12].split("=");
                                sb2 = null;
                                try {
                                    if (split2.length != 2) {
                                        i10 = i11;
                                    } else {
                                        i10 = i11;
                                        if (split2[i11].equals("CHARSET")) {
                                            str4 = split2[1];
                                        } else if (split2[i10].equals("ENCODING")) {
                                            str3 = split2[1];
                                        }
                                    }
                                    i12++;
                                    i11 = i10;
                                } catch (Throwable unused) {
                                    return sb2;
                                }
                            }
                            i7 = i11;
                            mVar.b = strArr[1];
                            if (str3 != null && str3.equalsIgnoreCase("QUOTED-PRINTABLE") && (H = g0.H(g0.h1((String) mVar.b))) != null && H.length != 0) {
                                mVar.b = new String(H, str4);
                            }
                            mVar.b = ((String) mVar.b).replace(';', ' ');
                        } else {
                            i7 = i11;
                            if (strArr[i7].startsWith("TEL")) {
                                if (strArr[1].length() > 0) {
                                    ((ArrayList) mVar.d).add(strArr[1]);
                                }
                            } else if (strArr[i7].startsWith("EMAIL")) {
                                String str5 = strArr[1];
                                if (str5.length() > 0) {
                                    ((ArrayList) mVar.c).add(str5);
                                }
                            }
                        }
                        i11 = i7;
                    }
                }
                return sb2;
            }
            int i13 = i11;
            sb2 = null;
            try {
                bufferedReader.close();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            if (!z10) {
                return null;
            }
            StringBuilder sb3 = new StringBuilder();
            for (int i14 = i13; i14 < ((ArrayList) mVar.d).size(); i14++) {
                if (sb3.length() > 0) {
                    sb3.append('\n');
                }
                String str6 = (String) ((ArrayList) mVar.d).get(i14);
                if (!str6.contains("#") && !str6.contains("*")) {
                    sb3.append(pf.b.c().b(str6));
                }
                sb3.append(str6);
            }
            for (int i15 = i13; i15 < ((ArrayList) mVar.c).size(); i15++) {
                if (sb3.length() > 0) {
                    sb3.append('\n');
                }
                sb3.append(pf.b.c().b((String) ((ArrayList) mVar.c).get(i15)));
            }
            if (!TextUtils.isEmpty((String) mVar.b)) {
                if (sb3.length() > 0) {
                    sb3.append('\n');
                }
                sb3.append((String) mVar.b);
            }
            return sb3;
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static m i(View view) {
        return new m(view);
    }

    public static Object[] l(Object[] objArr, int[] iArr) {
        int length = objArr.length;
        Class<?> componentType = objArr.getClass().getComponentType();
        ix0 ix0Var = wx0.T;
        int i7 = -1;
        for (int i10 : iArr) {
            i7 = Math.max(i7, i10);
        }
        Object[] objArr2 = (Object[]) Array.newInstance(componentType, i7 + 1);
        for (int i11 = 0; i11 < length; i11++) {
            objArr2[iArr[i11]] = objArr[i11];
        }
        return objArr2;
    }

    public Paint B(float f10, int i7) {
        Paint[] paintArr = (Paint[]) this.b;
        if (paintArr[i7] == null) {
            Paint paint = new Paint(1);
            paintArr[i7] = paint;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
        paintArr[i7].setShader(null);
        paintArr[i7].setColor(-65536);
        paintArr[i7].setAlpha((int) (f10 * 255.0f));
        return paintArr[i7];
    }

    public int C(gc.e eVar) {
        ArrayList arrayList = (ArrayList) this.b;
        int size = arrayList.size();
        int i7 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ic.e eVar2 = (ic.e) obj;
            int i11 = eVar2.d;
            gc.d dVar = eVar2.a;
            int a10 = dVar.a(eVar);
            int i12 = a10 + 4;
            int ordinal = dVar.ordinal();
            if (ordinal != 1) {
                if (ordinal == 2) {
                    i12 = ((i11 / 2) * 11) + i12 + (i11 % 2 != 1 ? 0 : 6);
                } else if (ordinal == 4) {
                    i12 += eVar2.a() * 8;
                } else if (ordinal == 5) {
                    i12 = a10 + 12;
                } else if (ordinal == 6) {
                    i12 += i11 * 13;
                }
            } else {
                int i13 = ((i11 / 3) * 10) + i12;
                int i14 = i11 % 3;
                i12 = i13 + (i14 != 1 ? i14 == 2 ? 7 : 0 : 4);
            }
            i7 += i12;
        }
        return i7;
    }

    @Override // org.telegram.ui.Components.ui0
    public /* synthetic */ boolean E() {
        return false;
    }

    public void G() {
        ((TypedArray) this.c).recycle();
    }

    public void H(b3.a aVar) {
        m2.i iVar = (m2.i) ((HashMap) this.b).remove(aVar);
        iVar.getClass();
        l2.g gVar = (l2.g) ((l2.h) this.d).p.get(iVar);
        if (gVar != null) {
            synchronized (gVar) {
                gVar.d--;
            }
        }
    }

    public void I(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.b = str;
    }

    public synchronized void J() {
        ((l2.h) this.d).c.e();
    }

    public void K(boolean z10, float f10) {
        z0[] z0VarArr = (z0[]) this.d;
        for (int i7 = 0; i7 < z0VarArr.length; i7++) {
            if (!z10 || ((i7 != 0 || Math.abs(f10 - 0.2f) >= 0.01f) && ((i7 != 1 || Math.abs(f10 - 0.5f) >= 0.1f) && ((i7 != 2 || Math.abs(f10 - 1.0f) >= 0.1f) && ((i7 != 3 || Math.abs(f10 - 1.5f) >= 0.1f) && (i7 != 4 || Math.abs(f10 - 2.0f) >= 0.1f)))))) {
                z0VarArr[i7].d(-328966, -328966);
            } else {
                z0VarArr[i7].d(-9718023, -9718023);
            }
        }
        ((v0) this.c).e(true, f10);
    }

    @Override // org.telegram.messenger.ap
    public void a() {
        ((vf.b) this.b).b();
        ((h2) this.c).presentFragment(new bn((Bundle) this.d));
    }

    @Override // m4.a0
    public void b(k0 k0Var, f3.q qVar, f0 f0Var) {
        this.c = k0Var;
        f0Var.b();
        f0Var.c();
        i0 d2 = qVar.d2(f0Var.c, 5);
        this.d = d2;
        d2.g((u) this.b);
    }

    @Override // org.telegram.ui.bn0
    public void b0() {
        ((kk) this.d).R.A();
    }

    @Override // m4.a0
    public void c(x xVar) {
        long d;
        ((k0) this.c).getClass();
        String str = l0.a;
        k0 k0Var = (k0) this.c;
        synchronized (k0Var) {
            try {
                long j3 = k0Var.c;
                d = j3 != -9223372036854775807L ? j3 + k0Var.b : k0Var.d();
            } finally {
            }
        }
        long e10 = ((k0) this.c).e();
        if (d == -9223372036854775807L || e10 == -9223372036854775807L) {
            return;
        }
        u uVar = (u) this.b;
        if (e10 != uVar.x) {
            t a10 = uVar.a();
            a10.w = e10;
            u uVar2 = new u(a10);
            this.b = uVar2;
            ((i0) this.d).g(uVar2);
        }
        int a11 = xVar.a();
        ((i0) this.d).b(a11, xVar);
        ((i0) this.d).c(d, 1, a11, 0, null);
    }

    @Override // org.telegram.messenger.ILocationServiceProvider
    public void checkLocationSettings(qa qaVar, q0.a aVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(((z9) qaVar).a);
        u7.c cVar = (u7.c) this.c;
        j8.c cVar2 = new j8.c(arrayList, false, false);
        cVar.getClass();
        com.google.android.gms.common.api.internal.t b10 = com.google.android.gms.common.api.internal.u.b();
        b10.c = new c5(cVar2);
        b10.a = 2426;
        cVar.e(0, b10.a()).addOnCompleteListener(new w9(aVar, 1));
    }

    @Override // org.telegram.messenger.ILocationServiceProvider
    public boolean checkServices() {
        return nt.b.hasServices();
    }

    @Override // c4.d
    public int d(long j3) {
        long[] jArr = (long[]) this.d;
        int b10 = l0.b(jArr, j3, false);
        if (b10 < jArr.length) {
            return b10;
        }
        return -1;
    }

    @Override // org.telegram.ui.bn0
    public /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.messenger.ap
    public void f(boolean z10) {
        ((vf.b) this.b).b();
        ((h2) this.c).presentFragment(new bn((Bundle) this.d));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0063  */
    @Override // org.telegram.ui.Components.ui0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void g(View view, p0 p0Var, boolean z10, boolean z11) {
        float f10;
        q0 q0Var;
        n0 k10;
        float f11;
        int i7;
        float f12;
        bn bnVar = (bn) this.d;
        z J8 = bnVar.J8(((fj) this.b).e1(), true);
        float f13 = 0.0f;
        if (J8 instanceof r1) {
            q0 q0Var2 = ((r1) J8).O;
            n0 k11 = q0Var2.k(p0Var);
            if (k11 == null) {
                f12 = 0.0f;
                f10 = f12;
                bnVar.Eb(J8, (fj) this.b, (vi0) this.c, view, f13, f10, p0Var, false, (p0Var == null && p0Var.a) ? true : z10, z11, false);
            } else {
                f13 = q0Var2.b + k11.w + (k11.z / 2.0f);
                f11 = q0Var2.c + k11.x;
                i7 = k11.A;
            }
        } else if (!(J8 instanceof org.telegram.ui.Cells.v0) || (k10 = (q0Var = ((org.telegram.ui.Cells.v0) J8).F0).k(p0Var)) == null) {
            f10 = 0.0f;
            bnVar.Eb(J8, (fj) this.b, (vi0) this.c, view, f13, f10, p0Var, false, (p0Var == null && p0Var.a) ? true : z10, z11, false);
        } else {
            f13 = q0Var.b + k10.w + (k10.z / 2.0f);
            f11 = q0Var.c + k10.x;
            i7 = k10.A;
        }
        f12 = f11 + (i7 / 2.0f);
        f10 = f12;
        bnVar.Eb(J8, (fj) this.b, (vi0) this.c, view, f13, f10, p0Var, false, (p0Var == null && p0Var.a) ? true : z10, z11, false);
    }

    @Override // fd.a
    public Object get() {
        switch (this.a) {
            case 4:
                return new jb.p((id.h) ((ib.c) this.b).get(), (h1) ((ib.c) this.c).get(), (m1.g) ((ib.c) this.d).get());
            default:
                int i7 = 28;
                return new o5.s(new qb.a(i7), new pb.b(i7), (t5.b) ((r7) this.b).get(), (ia.c) ((ga.d) this.c).get(), (c0) ((xi.e) this.d).get());
        }
    }

    @Override // org.telegram.messenger.ILocationServiceProvider
    public void getLastLocation(q0.a aVar) {
        u7.c cVar = (u7.c) this.b;
        cVar.getClass();
        com.google.android.gms.common.api.internal.t b10 = com.google.android.gms.common.api.internal.u.b();
        b10.c = u7.a.c;
        b10.a = 2414;
        cVar.e(0, b10.a()).addOnCompleteListener(new w9(aVar, 0));
    }

    @Override // c4.d
    public long h(int i7) {
        long[] jArr = (long[]) this.d;
        la.f(i7 >= 0);
        la.f(i7 < jArr.length);
        return jArr[i7];
    }

    @Override // org.telegram.messenger.ILocationServiceProvider
    public void init(Context context) {
        com.google.android.gms.common.api.e eVar = j8.b.a;
        com.google.android.gms.common.api.i iVar = com.google.android.gms.common.api.i.c;
        com.google.android.gms.common.api.e eVar2 = u7.c.l;
        com.google.android.gms.common.api.a aVar = com.google.android.gms.common.api.b.j;
        this.b = new u7.c(context, eVar2, aVar, iVar);
        this.c = new u7.c(context, eVar2, aVar, iVar);
    }

    public o5.i j() {
        String str = ((String) this.b) == null ? " backendName" : "";
        if (((l5.d) this.d) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new o5.i((String) this.b, (byte[]) this.c, (l5.d) this.d);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void k(Canvas canvas, RectF rectF, float f10) {
        Paint[] paintArr = (Paint[]) this.b;
        if (paintArr[0] == null) {
            Paint paint = new Paint(1);
            paintArr[0] = paint;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
        paintArr[0].setShader((LinearGradient) this.c);
        paintArr[0].setAlpha((int) (f10 * 255.0f));
        canvas.drawRect(rectF, paintArr[0]);
    }

    @Override // c4.d
    public List m(long j3) {
        List list = (List) this.b;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            long[] jArr = (long[]) this.c;
            int i10 = i7 * 2;
            if (jArr[i10] <= j3 && j3 < jArr[i10 + 1]) {
                l4.c cVar = (l4.c) list.get(i7);
                g2.b bVar = cVar.a;
                if (bVar.e == -3.4028235E38f) {
                    arrayList2.add(cVar);
                } else {
                    arrayList.add(bVar);
                }
            }
        }
        Collections.sort(arrayList2, new w(6));
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            g2.b bVar2 = ((l4.c) arrayList2.get(i11)).a;
            arrayList.add(new g2.b(bVar2.a, bVar2.b, bVar2.c, bVar2.d, (-1) - i11, 1, bVar2.g, bVar2.h, bVar2.i, bVar2.n, bVar2.o, bVar2.j, bVar2.k, bVar2.l, bVar2.m, bVar2.p, bVar2.q, bVar2.r));
        }
        return arrayList;
    }

    public void n(Canvas canvas, RectF rectF, int i7, float f10) {
        Paint[] paintArr = (Paint[]) this.b;
        Matrix matrix = (Matrix) this.d;
        if (f10 <= 0.0f) {
            return;
        }
        if (((LinearGradient) this.c) == null) {
            this.c = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{-65536, 16711680}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        }
        if (paintArr[i7] == null) {
            paintArr[i7] = new Paint(1);
            paintArr[i7].setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
        paintArr[i7].setShader((LinearGradient) this.c);
        matrix.reset();
        if (i7 == 0) {
            matrix.postScale(1.0f, rectF.width() / 16.0f);
            matrix.postRotate(-90.0f);
            matrix.postTranslate(rectF.left, rectF.top);
        } else if (i7 == 1) {
            matrix.postScale(1.0f, rectF.height() / 16.0f);
            matrix.postTranslate(rectF.left, rectF.top);
        } else if (i7 == 2) {
            matrix.postScale(1.0f, rectF.width() / 16.0f);
            matrix.postRotate(90.0f);
            matrix.postTranslate(rectF.right, rectF.top);
        } else if (i7 == 3) {
            matrix.postScale(1.0f, rectF.height() / 16.0f);
            matrix.postScale(1.0f, -1.0f);
            matrix.postTranslate(rectF.left, rectF.bottom);
        }
        ((LinearGradient) this.c).setLocalMatrix(matrix);
        paintArr[i7].setAlpha((int) (255.0f * f10));
        canvas.drawRect(rectF, paintArr[i7]);
    }

    @Override // org.telegram.ui.Components.ui0
    public /* synthetic */ boolean o() {
        return true;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public /* synthetic */ void onComplete(Task task) {
        m6.c cVar = (m6.c) this.b;
        String str = (String) this.c;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.d;
        a0.l lVar = cVar.a;
        synchronized (lVar) {
            lVar.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    @Override // org.telegram.messenger.ILocationServiceProvider
    public qa onCreateLocationRequest() {
        LocationRequest locationRequest = new LocationRequest(ks.n1, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, ConnectionsManager.DEFAULT_DATACENTER_ID, 0.0f, true, 3600000L, 0, 0, null, false, new WorkSource(), null);
        z9 z9Var = new z9();
        z9Var.a = locationRequest;
        return z9Var;
    }

    @Override // org.telegram.messenger.ILocationServiceProvider
    public ra onCreateLocationServicesAPI(Context context, na naVar, final oa oaVar) {
        List list;
        Context context2 = t0.b;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        a0.f fVar = new a0.f(0);
        a0.f fVar2 = new a0.f(0);
        Object obj = n6.d.d;
        a9.e eVar = q8.b.a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Looper mainLooper = context2.getMainLooper();
        String packageName = context2.getPackageName();
        String name = context2.getClass().getName();
        com.google.android.gms.common.api.e eVar2 = j8.b.a;
        q6.m.i(eVar2, "Api must not be null");
        com.google.android.gms.common.api.e eVar3 = null;
        fVar2.put(eVar2, null);
        a9.e eVar4 = eVar2.a;
        q6.m.i(eVar4, "Base client builder must not be null");
        switch (eVar4.a) {
            case 22:
                list = Collections.EMPTY_LIST;
                break;
            default:
                list = Collections.EMPTY_LIST;
                break;
        }
        hashSet2.addAll(list);
        hashSet.addAll(list);
        arrayList.add(new y9(naVar));
        arrayList2.add(new com.google.android.gms.common.api.l() { // from class: org.telegram.messenger.v9
            @Override // com.google.android.gms.common.api.l
            public final void onConnectionFailed(n6.a aVar) {
                qd qdVar = (qd) oa.this;
                if (qdVar.M) {
                    return;
                }
                qdVar.L = Boolean.FALSE;
                if (qdVar.E) {
                    qdVar.E = false;
                    qdVar.p();
                }
            }
        });
        boolean z10 = true;
        q6.m.a("must call addApi() to add at least one API", !fVar2.isEmpty());
        q8.a aVar = q8.a.a;
        com.google.android.gms.common.api.e eVar5 = q8.b.b;
        if (fVar2.containsKey(eVar5)) {
            aVar = (q8.a) fVar2.get(eVar5);
        }
        o3 o3Var = new o3(hashSet, fVar, packageName, name, aVar);
        Map map = (Map) o3Var.c;
        a0.f fVar3 = new a0.f(0);
        a0.f fVar4 = new a0.f(0);
        ArrayList arrayList3 = new ArrayList();
        Iterator it = ((a0.c) fVar2.keySet()).iterator();
        while (true) {
            a0.b bVar = (a0.b) it;
            if (!bVar.hasNext()) {
                o3 o3Var2 = o3Var;
                a0.f fVar5 = fVar3;
                a0.f fVar6 = fVar4;
                ArrayList arrayList4 = arrayList3;
                Looper looper = mainLooper;
                if (eVar3 != null) {
                    boolean equals = hashSet.equals(hashSet2);
                    String str = eVar3.c;
                    if (!equals) {
                        throw new IllegalStateException(a8.p0.p("Must not set scopes in GoogleApiClient.Builder when using ", str, ". Set account in GoogleSignInOptions.Builder instead."));
                    }
                }
                com.google.android.gms.common.api.internal.f0 f0Var = new com.google.android.gms.common.api.internal.f0(context2, new ReentrantLock(), looper, o3Var2, fVar5, arrayList, arrayList2, fVar6, com.google.android.gms.common.api.internal.f0.h(fVar6.values(), true), arrayList4);
                Set set = com.google.android.gms.common.api.m.a;
                synchronized (set) {
                    set.add(f0Var);
                }
                d0 d0Var = new d0();
                d0Var.a = f0Var;
                return d0Var;
            }
            com.google.android.gms.common.api.e eVar6 = (com.google.android.gms.common.api.e) bVar.next();
            Object obj2 = fVar2.get(eVar6);
            boolean z11 = map.get(eVar6) != null ? z10 : false;
            fVar3.put(eVar6, Boolean.valueOf(z11));
            a0.f fVar7 = fVar4;
            Looper looper2 = mainLooper;
            g1 g1Var = new g1(eVar6, z11);
            arrayList3.add(g1Var);
            a9.e eVar7 = eVar6.a;
            q6.m.h(eVar7);
            ArrayList arrayList5 = arrayList3;
            Map map2 = map;
            o3 o3Var3 = o3Var;
            a0.f fVar8 = fVar2;
            a0.f fVar9 = fVar3;
            Object a10 = eVar7.a(context2, looper2, o3Var3, obj2, g1Var, g1Var);
            fVar7.put(eVar6.b, a10);
            q6.d dVar = (q6.d) a10;
            dVar.getClass();
            if (!(dVar instanceof d6.e)) {
                mainLooper = looper2;
                o3Var = o3Var3;
            } else {
                if (eVar3 != null) {
                    String str2 = eVar6.c;
                    String str3 = eVar3.c;
                    throw new IllegalStateException(p5.c.m(str2, " cannot be used with ", str3, new StringBuilder(String.valueOf(str2).length() + 21 + String.valueOf(str3).length())));
                }
                mainLooper = looper2;
                o3Var = o3Var3;
                eVar3 = eVar6;
            }
            fVar4 = fVar7;
            map = map2;
            fVar3 = fVar9;
            fVar2 = fVar8;
            arrayList3 = arrayList5;
            z10 = true;
        }
    }

    @Override // org.telegram.ui.Components.d61
    public void onError(f61 f61Var, Exception exc) {
        s8 s8Var = ((w5) this.d).O;
        if (s8Var != null) {
            s8Var.run();
        }
    }

    @Override // org.telegram.ui.Components.d61
    public /* synthetic */ void onRenderedFirstFrame(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.d61
    public void onStateChanged(boolean z10, int i7) {
        w5 w5Var = (w5) this.d;
        t5 t5Var = w5Var.L;
        f61 f61Var = w5Var.e;
        if (f61Var == null) {
            return;
        }
        if (f61Var.d0()) {
            g0.g3(t5Var);
        } else {
            g0.r(t5Var);
        }
    }

    @Override // org.telegram.ui.Components.d61
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.d61
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((w5) this.d).i();
    }

    @Override // org.telegram.ui.Components.d61
    public void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
        w5 w5Var = (w5) this.d;
        d7 d7Var = (d7) this.b;
        if (d7Var != null) {
            c7 V = w5Var.e.V(d7Var.d1);
            d7Var.d1 = V;
            v51 v51Var = w5Var.n;
            if (v51Var != null) {
                v51Var.setHDRInfo(V);
            }
        }
        int i12 = (int) (i7 * f10);
        w5Var.f = i12;
        int i13 = (int) (i10 * f10);
        w5Var.h = i13;
        if (d7Var != null && (d7Var.k0 != i12 || d7Var.l0 != i13)) {
            d7Var.k0 = i12;
            d7Var.l0 = i13;
            d7Var.A();
        }
        w5Var.b();
        v51 v51Var2 = w5Var.n;
        if (v51Var2 != null) {
            int i14 = w5Var.f;
            int i15 = w5Var.h;
            v51Var2.d = i14;
            v51Var2.e = i15;
            cz czVar = v51Var2.b;
            if (czVar == null) {
                return;
            }
            czVar.postRunnable(new yy(czVar, i14, i15, 0));
        }
    }

    @Override // c4.d
    public int p() {
        return ((long[]) this.d).length;
    }

    @Override // org.telegram.ui.Components.ui0
    public /* synthetic */ boolean q() {
        return false;
    }

    public Object r(Bitmap bitmap) {
        ih.a aVar = (ih.a) this.b;
        if (aVar.a(bitmap)) {
            this.d = ((ih.b) this.c).b(bitmap);
            aVar.b(bitmap);
        }
        return this.d;
    }

    @Override // org.telegram.messenger.ILocationServiceProvider
    public synchronized void removeLocationUpdates(pa paVar) {
        x9 x9Var = (x9) ((HashMap) this.d).remove(paVar);
        if (x9Var != null) {
            u7.c cVar = (u7.c) this.b;
            cVar.getClass();
            String simpleName = x9.class.getSimpleName();
            q6.m.g(simpleName, "Listener type must not be empty");
            cVar.c(new com.google.android.gms.common.api.internal.m(x9Var, simpleName), 2418).continueWith(u7.b.a, u7.a.b);
        }
    }

    @Override // org.telegram.messenger.ILocationServiceProvider
    public synchronized void requestLocationUpdates(qa qaVar, pa paVar) {
        x9 x9Var = (x9) ((HashMap) this.d).remove(paVar);
        if (x9Var != null) {
            u7.c cVar = (u7.c) this.b;
            cVar.getClass();
            String simpleName = x9.class.getSimpleName();
            q6.m.g(simpleName, "Listener type must not be empty");
            cVar.c(new com.google.android.gms.common.api.internal.m(x9Var, simpleName), 2418).continueWith(u7.b.a, u7.a.b);
        }
        x9 x9Var2 = new x9(paVar);
        ((HashMap) this.d).put(paVar, x9Var2);
        ((u7.c) this.b).f(((z9) qaVar).a, x9Var2, Looper.getMainLooper());
    }

    public ColorStateList s(int i7) {
        int resourceId;
        ColorStateList a10;
        TypedArray typedArray = (TypedArray) this.c;
        return (!typedArray.hasValue(i7) || (resourceId = typedArray.getResourceId(i7, 0)) == 0 || (a10 = c8.z.a((Context) this.b, resourceId)) == null) ? typedArray.getColorStateList(i7) : a10;
    }

    public Drawable t(int i7) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.c;
        return (!typedArray.hasValue(i7) || (resourceId = typedArray.getResourceId(i7, 0)) == 0) ? typedArray.getDrawable(i7) : c8.z.b((Context) this.b, resourceId);
    }

    public String toString() {
        switch (this.a) {
            case 2:
                StringBuilder sb2 = new StringBuilder();
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                ic.e eVar = null;
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ic.e eVar2 = (ic.e) obj;
                    if (eVar != null) {
                        sb2.append(",");
                    }
                    sb2.append(eVar2.toString());
                    eVar = eVar2;
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public Drawable v(int i7) {
        int resourceId;
        Drawable f10;
        if (!((TypedArray) this.c).hasValue(i7) || (resourceId = ((TypedArray) this.c).getResourceId(i7, 0)) == 0) {
            return null;
        }
        m.q a10 = m.q.a();
        Context context = (Context) this.b;
        synchronized (a10) {
            f10 = a10.a.f(resourceId, context, true);
        }
        return f10;
    }

    @Override // org.telegram.ui.bn0
    public void v0(int i7, boolean z10, boolean z11) {
        if (z10) {
            return;
        }
        kk kkVar = (kk) this.d;
        HashMap hashMap = (HashMap) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        si siVar = kkVar.b;
        if (hashMap.isEmpty() || kkVar.R == null || kkVar.L) {
            return;
        }
        kkVar.L = true;
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = hashMap.get(arrayList.get(i10));
            org.telegram.messenger.yy yyVar = new org.telegram.messenger.yy();
            arrayList2.add(yyVar);
            if (obj instanceof ef) {
                ef efVar = (ef) obj;
                String str = efVar.h;
                if (str != null) {
                    yyVar.c = str;
                } else {
                    yyVar.c = efVar.I;
                }
                yyVar.e = efVar.c;
                yyVar.f = efVar.g;
                yyVar.k = efVar.s;
                yyVar.o = efVar.b;
                CharSequence charSequence = efVar.a;
                yyVar.d = charSequence != null ? charSequence.toString() : null;
                yyVar.i = efVar.n;
                yyVar.j = efVar.r;
                yyVar.h = efVar.x;
            }
        }
        b5.X(siVar.H3, siVar.Y0() + arrayList2.size(), siVar.c1(), new l2(i7, 2, kkVar, arrayList2, z11));
    }

    public Typeface w(int i7, int i10, j0 j0Var) {
        j0 j0Var2;
        XmlPullParserException xmlPullParserException;
        IOException iOException;
        int resourceId = ((TypedArray) this.c).getResourceId(i7, 0);
        if (resourceId != 0) {
            if (((TypedValue) this.d) == null) {
                this.d = new TypedValue();
            }
            Context context = (Context) this.b;
            TypedValue typedValue = (TypedValue) this.d;
            ThreadLocal threadLocal = h0.j.a;
            if (!context.isRestricted()) {
                Resources resources = context.getResources();
                resources.getValue(resourceId, typedValue, true);
                CharSequence charSequence = typedValue.string;
                if (charSequence == null) {
                    throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(resourceId) + "\" (" + Integer.toHexString(resourceId) + ") is not a Font: " + typedValue);
                }
                String charSequence2 = charSequence.toString();
                if (!charSequence2.startsWith("res/")) {
                    j0Var.b();
                    return null;
                }
                int i11 = typedValue.assetCookie;
                a0.j jVar = i0.e.b;
                Typeface typeface = (Typeface) jVar.a(i0.e.b(resources, resourceId, charSequence2, i11, i10));
                int i12 = 20;
                if (typeface != null) {
                    new Handler(Looper.getMainLooper()).post(new a6(i12, j0Var, typeface));
                    return typeface;
                }
                try {
                    if (!charSequence2.toLowerCase().endsWith(".xml")) {
                        j0Var2 = j0Var;
                        try {
                            int i13 = typedValue.assetCookie;
                            Typeface e10 = i0.e.a.e(context, resources, resourceId, charSequence2, i10);
                            if (e10 != null) {
                                jVar.b(i0.e.b(resources, resourceId, charSequence2, i13, i10), e10);
                            }
                            if (e10 != null) {
                                new Handler(Looper.getMainLooper()).post(new a6(i12, j0Var2, e10));
                            } else {
                                j0Var2.b();
                            }
                            return e10;
                        } catch (IOException e11) {
                            e = e11;
                            iOException = e;
                            Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                            j0Var2.b();
                            return null;
                        } catch (XmlPullParserException e12) {
                            e = e12;
                            xmlPullParserException = e;
                            Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                            j0Var2.b();
                            return null;
                        }
                    }
                    h0.d g10 = h0.b.g(resources.getXml(resourceId), resources);
                    if (g10 != null) {
                        try {
                            return i0.e.a(context, g10, resources, resourceId, charSequence2, typedValue.assetCookie, i10, j0Var);
                        } catch (IOException e13) {
                            e = e13;
                            j0Var2 = j0Var;
                            iOException = e;
                            Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                            j0Var2.b();
                            return null;
                        } catch (XmlPullParserException e14) {
                            e = e14;
                            j0Var2 = j0Var;
                            xmlPullParserException = e;
                            Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                            j0Var2.b();
                            return null;
                        }
                    }
                    try {
                        Log.e("ResourcesCompat", "Failed to find font-family tag");
                        j0Var.b();
                        return null;
                    } catch (IOException e15) {
                        iOException = e15;
                        j0Var2 = j0Var;
                        Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                        j0Var2.b();
                        return null;
                    } catch (XmlPullParserException e16) {
                        xmlPullParserException = e16;
                        j0Var2 = j0Var;
                        Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                        j0Var2.b();
                        return null;
                    }
                } catch (IOException e17) {
                    e = e17;
                    j0Var2 = j0Var;
                } catch (XmlPullParserException e18) {
                    e = e18;
                    j0Var2 = j0Var;
                }
            }
        }
        return null;
    }

    public void y(fa faVar) {
        try {
            l8.f fVar = (l8.f) this.c;
            k8.c cVar = new k8.c(faVar);
            Parcel p12 = fVar.p1();
            v7.b.c(p12, cVar);
            fVar.t1(p12, 9);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public /* synthetic */ m(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    @Override // org.telegram.ui.Components.d61
    public void onRenderedFirstFrame() {
        d7 d7Var = (d7) this.b;
        Runnable[] runnableArr = (Runnable[]) this.c;
        w5 w5Var = (w5) this.d;
        v5 v5Var = w5Var.I;
        if (v5Var != null && v5Var.g) {
            int i7 = w5Var.f;
            int i10 = w5Var.h;
            v5Var.d = true;
            v5Var.e = i7;
            v5Var.f = i10;
            org.telegram.ui.web.b bVar = v5Var.c;
            if (bVar != null) {
                bVar.a(Integer.valueOf(i7), Integer.valueOf(v5Var.f));
            }
        }
        Runnable runnable = runnableArr[0];
        if (runnable == null) {
            v51 v51Var = w5Var.n;
            if (v51Var != null) {
                if (v5Var == null || !v5Var.g) {
                    v51Var.animate().alpha(1.0f).setDuration(180L).withEndAction(new hi.r1(6, this, d7Var)).start();
                    return;
                }
                return;
            }
            return;
        }
        w5Var.post(runnable);
        runnableArr[0] = null;
        Bitmap bitmap = w5Var.a;
        if (bitmap != null) {
            bitmap.recycle();
            if (d7Var.M0 == w5Var.a) {
                d7Var.M0 = null;
            }
            w5Var.a = null;
            w5Var.invalidate();
        }
    }

    public /* synthetic */ m(Object obj, Object obj2, Object obj3, boolean z10, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public m(ai.k0 k0Var, l8.f fVar) {
        this.a = 7;
        this.c = fVar;
        q6.m.h(k0Var);
        this.b = k0Var;
    }

    public m(h hVar) {
        this.a = 0;
        this.d = hVar;
        this.c = new AtomicLong((j6.a.b.nextLong() & 65535) * 10000);
    }

    public m(ih.b bVar) {
        this.a = 3;
        this.b = new ih.a();
        this.c = bVar;
    }

    public m(Context context) {
        this.a = 19;
        this.b = context;
    }

    public m(int i7) {
        this.a = i7;
        switch (i7) {
            case 29:
                this.b = new Paint[4];
                this.d = new Matrix();
                break;
            default:
                this.d = new HashMap();
                break;
        }
    }

    public m(ArrayList arrayList) {
        this.a = 9;
        this.b = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
        this.c = new long[arrayList.size() * 2];
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            l4.c cVar = (l4.c) arrayList.get(i7);
            int i10 = i7 * 2;
            long[] jArr = (long[]) this.c;
            jArr[i10] = cVar.b;
            jArr[i10 + 1] = cVar.c;
        }
        long[] jArr2 = (long[]) this.c;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.d = copyOf;
        Arrays.sort(copyOf);
    }

    @Override // org.telegram.ui.bn0
    public void u() {
    }

    @Override // org.telegram.ui.Components.ui0
    public /* synthetic */ void z() {
    }

    public m(View view) {
        this.a = 28;
        this.d = view;
        r51 r51Var = new r51(this, view);
        this.b = r51Var;
        view.addOnLayoutChangeListener(r51Var);
    }

    @Override // org.telegram.ui.bn0
    public void A(Editable editable) {
    }

    @Override // org.telegram.ui.Components.d61
    public /* synthetic */ void onSeekFinished(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.d61
    public /* synthetic */ void onSeekStarted(m2.a aVar) {
    }

    public m(String str) {
        this.a = 12;
        t tVar = new t();
        tVar.q = s0.n("video/mp2t");
        tVar.r = s0.n(str);
        this.b = new u(tVar);
    }

    public m(Context context, TypedArray typedArray) {
        this.a = 11;
        this.b = context;
        this.c = typedArray;
    }

    public m(f2.n[] nVarArr) {
        this.a = 15;
        w0 w0Var = new w0();
        f2.s sVar = new f2.s();
        sVar.c = 1.0f;
        sVar.d = 1.0f;
        f2.k kVar = f2.k.e;
        sVar.e = kVar;
        sVar.f = kVar;
        sVar.g = kVar;
        sVar.h = kVar;
        ByteBuffer byteBuffer = f2.n.a;
        sVar.k = byteBuffer;
        sVar.l = byteBuffer;
        sVar.b = -1;
        f2.n[] nVarArr2 = new f2.n[nVarArr.length + 2];
        this.b = nVarArr2;
        System.arraycopy(nVarArr, 0, nVarArr2, 0, nVarArr.length);
        this.c = w0Var;
        this.d = sVar;
        nVarArr2[nVarArr.length] = w0Var;
        nVarArr2[nVarArr.length + 1] = sVar;
    }

    public m(Signature signature) {
        this.a = 6;
        this.b = signature;
        this.c = null;
        this.d = null;
    }

    public m(Cipher cipher) {
        this.a = 6;
        this.c = cipher;
        this.b = null;
        this.d = null;
    }

    public m(Mac mac) {
        this.a = 6;
        this.d = mac;
        this.c = null;
        this.b = null;
    }

    public m(View view, jh.k kVar) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        this.a = 5;
        r2 r2Var = new r2(this, 6);
        this.b = view;
        this.c = kVar;
        view.addOnAttachStateChangeListener(r2Var);
        if (!view.isAttachedToWindow() || (viewTreeObserver2 = (ViewTreeObserver) this.d) == (viewTreeObserver = view.getViewTreeObserver())) {
            return;
        }
        if (viewTreeObserver2 != null) {
            if (viewTreeObserver2.isAlive()) {
                ((ViewTreeObserver) this.d).removeOnPreDrawListener(kVar);
            }
            this.d = null;
        }
        this.d = viewTreeObserver;
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnPreDrawListener(kVar);
        }
    }

    public m(ab.q qVar, gc.e eVar, ic.d dVar) {
        gc.d dVar2;
        int i7;
        int i10;
        this.a = 2;
        this.d = qVar;
        this.b = new ArrayList();
        ic.d dVar3 = dVar;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            dVar2 = gc.d.n;
            if (dVar3 == null) {
                break;
            }
            int i13 = dVar3.c;
            int i14 = i11 + dVar3.d;
            ic.d dVar4 = dVar3.e;
            int i15 = i12;
            gc.d dVar5 = dVar3.a;
            boolean z10 = (dVar5 == gc.d.h && dVar4 == null && i13 != 0) || !(dVar4 == null || i13 == dVar4.c);
            i7 = z10 ? 1 : i15;
            if (dVar4 == null || dVar4.a != dVar5 || z10) {
                ((ArrayList) this.b).add(0, new ic.e(this, dVar5, dVar3.b, i13, i14));
                i10 = 0;
            } else {
                i10 = i14;
            }
            if (z10) {
                ((ArrayList) this.b).add(0, new ic.e(this, dVar2, dVar3.b, dVar3.c, 0));
            }
            i12 = i7;
            dVar3 = dVar4;
            i11 = i10;
        }
        int i16 = i12;
        boolean z11 = qVar.a;
        gc.b bVar = (gc.b) qVar.d;
        if (z11) {
            ic.e eVar2 = (ic.e) ((ArrayList) this.b).get(0);
            if (eVar2 != null && eVar2.a != dVar2 && i16 != 0) {
                ((ArrayList) this.b).add(0, new ic.e(this, dVar2, 0, 0, 0));
            }
            ((ArrayList) this.b).add(((ic.e) ((ArrayList) this.b).get(0)).a == dVar2 ? 1 : 0, new ic.e(this, gc.d.s, 0, 0, 0));
        }
        int i17 = eVar.a;
        int i18 = 26;
        int c10 = p1.g.c(i17 <= 9 ? 1 : i17 <= 26 ? 2 : 3);
        if (c10 == 0) {
            i18 = 9;
        } else if (c10 != 1) {
            i7 = 27;
            i18 = 40;
        } else {
            i7 = 10;
        }
        int C = C(eVar);
        while (i17 < i18 && !ic.b.d(C, gc.e.c(i17), bVar)) {
            i17++;
        }
        while (i17 > i7 && ic.b.d(C, gc.e.c(i17 - 1), bVar)) {
            i17--;
        }
        this.c = gc.e.c(i17);
    }

    public m(l2.h hVar, m2.i iVar) {
        this.a = 8;
        this.d = hVar;
        this.b = new HashMap();
        this.c = iVar;
    }

    public m(Object[] objArr, Object[] objArr2) {
        this.a = 27;
        int length = objArr.length;
        int[] iArr = new int[length];
        HashMap hashMap = new HashMap();
        for (int i7 = 0; i7 < length; i7++) {
            Object obj = objArr[i7];
            Integer num = (Integer) hashMap.get(obj);
            if (num == null) {
                num = Integer.valueOf(hashMap.size());
                hashMap.put(obj, num);
            }
            iArr[i7] = num.intValue();
        }
        this.b = iArr;
        this.c = l(objArr, iArr);
        this.d = l(objArr2, iArr);
    }

    @Override // org.telegram.ui.Components.ui0
    public /* synthetic */ void x(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z10) {
    }
}
