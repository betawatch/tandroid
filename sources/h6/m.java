package h6;

import a8.ia;
import a8.r7;
import ab.b0;
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
import bi.m6;
import bi.x5;
import ch.o0;
import ch.p0;
import com.google.android.gms.common.api.internal.d0;
import com.google.android.gms.common.api.internal.e1;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import di.r2;
import e2.s0;
import e2.t;
import e2.u;
import f3.j0;
import gb.j1;
import h2.k0;
import h2.m0;
import h2.x;
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
import m.q3;
import m4.a0;
import org.telegram.messenger.ILocationServiceProvider;
import org.telegram.messenger.a8;
import org.telegram.messenger.aa;
import org.telegram.messenger.ba;
import org.telegram.messenger.ep;
import org.telegram.messenger.fz;
import org.telegram.messenger.g0;
import org.telegram.messenger.gf;
import org.telegram.messenger.ha;
import org.telegram.messenger.ij;
import org.telegram.messenger.pa;
import org.telegram.messenger.qa;
import org.telegram.messenger.qs;
import org.telegram.messenger.ra;
import org.telegram.messenger.sa;
import org.telegram.messenger.ta;
import org.telegram.messenger.tt;
import org.telegram.messenger.y9;
import org.telegram.messenger.z9;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.v0;
import org.telegram.ui.ActionBar.z0;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.t0;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.hi0;
import org.telegram.ui.Components.ii0;
import org.telegram.ui.Components.lx0;
import org.telegram.ui.Components.qt;
import org.telegram.ui.Components.v4;
import org.telegram.ui.Components.vj;
import org.telegram.ui.Components.xw0;
import org.telegram.ui.Components.z41;
import org.telegram.ui.an;
import org.telegram.ui.wm0;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class m implements ib.b, c4.d, a0, OnCompleteListener, q5.b, ILocationServiceProvider, ep, hi0, wm0 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ m(int i7, boolean z9) {
        this.a = i7;
    }

    public static m g(View view) {
        return new m(view);
    }

    public static Object[] l(Object[] objArr, int[] iArr) {
        int length = objArr.length;
        Class<?> componentType = objArr.getClass().getComponentType();
        xw0 xw0Var = lx0.R;
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

    public static m x(Context context, AttributeSet attributeSet, int[] iArr, int i7) {
        return new m(context, context.obtainStyledAttributes(attributeSet, iArr, i7, 0));
    }

    public static StringBuilder z(String str) {
        StringBuilder sb2;
        int i7;
        byte[] H;
        int i10;
        try {
            BufferedReader bufferedReader = new BufferedReader(new StringReader(str));
            int i11 = 0;
            boolean z9 = false;
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
                            mVar = new m(20, false);
                            mVar.c = new ArrayList();
                            mVar.d = new ArrayList();
                        } else if (readLine.startsWith("END:VCARD") && mVar != null) {
                            z9 = true;
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
            if (!z9) {
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

    public void C() {
        ((TypedArray) this.c).recycle();
    }

    public void D(b3.a aVar) {
        m2.j jVar = (m2.j) ((HashMap) this.b).remove(aVar);
        jVar.getClass();
        l2.g gVar = (l2.g) ((l2.h) this.d).p.get(jVar);
        if (gVar != null) {
            synchronized (gVar) {
                gVar.d--;
            }
        }
    }

    @Override // org.telegram.ui.Components.hi0
    public /* synthetic */ boolean E() {
        return false;
    }

    public void F(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.b = str;
    }

    public synchronized void G() {
        ((l2.h) this.d).c.e();
    }

    public void H(boolean z9, float f10) {
        z0[] z0VarArr = (z0[]) this.d;
        for (int i7 = 0; i7 < z0VarArr.length; i7++) {
            if (!z9 || ((i7 != 0 || Math.abs(f10 - 0.2f) >= 0.01f) && ((i7 != 1 || Math.abs(f10 - 0.5f) >= 0.1f) && ((i7 != 2 || Math.abs(f10 - 1.0f) >= 0.1f) && ((i7 != 3 || Math.abs(f10 - 1.5f) >= 0.1f) && (i7 != 4 || Math.abs(f10 - 2.0f) >= 0.1f)))))) {
                z0VarArr[i7].d(-328966, -328966);
            } else {
                z0VarArr[i7].d(-9718023, -9718023);
            }
        }
        ((v0) this.c).e(true, f10);
    }

    @Override // org.telegram.ui.Components.hi0
    public /* synthetic */ boolean U() {
        return false;
    }

    @Override // org.telegram.messenger.ep
    public void a() {
        ((vf.b) this.b).b();
        ((f2) this.c).presentFragment(new an((Bundle) this.d));
    }

    @Override // m4.a0
    public void b(k0 k0Var, f3.q qVar, m4.g0 g0Var) {
        this.c = k0Var;
        g0Var.b();
        g0Var.c();
        j0 O1 = qVar.O1(g0Var.c, 5);
        this.d = O1;
        O1.g((u) this.b);
    }

    @Override // m4.a0
    public void c(x xVar) {
        long d;
        ((k0) this.c).getClass();
        String str = m0.a;
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
            ((j0) this.d).g(uVar2);
        }
        int a11 = xVar.a();
        ((j0) this.d).b(a11, xVar);
        ((j0) this.d).c(d, 1, a11, 0, null);
    }

    @Override // org.telegram.messenger.ILocationServiceProvider
    public void checkLocationSettings(sa saVar, q0.a aVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(((ba) saVar).a);
        u7.c cVar = (u7.c) this.c;
        j8.c cVar2 = new j8.c(arrayList, false, false);
        cVar.getClass();
        s b10 = com.google.android.gms.common.api.internal.t.b();
        b10.c = new qt(cVar2, 19);
        b10.a = 2426;
        cVar.e(0, b10.a()).addOnCompleteListener(new y9(aVar, 1));
    }

    @Override // org.telegram.messenger.ILocationServiceProvider
    public boolean checkServices() {
        return tt.b.hasServices();
    }

    @Override // c4.d
    public int d(long j3) {
        long[] jArr = (long[]) this.d;
        int b10 = m0.b(jArr, j3, false);
        if (b10 < jArr.length) {
            return b10;
        }
        return -1;
    }

    @Override // org.telegram.ui.wm0
    public /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.messenger.ep
    public void f(boolean z9) {
        ((vf.b) this.b).b();
        ((f2) this.c).presentFragment(new an((Bundle) this.d));
    }

    @Override // org.telegram.ui.wm0
    public void f0() {
        ((vj) this.d).Q.A();
    }

    @Override // fd.a
    public Object get() {
        switch (this.a) {
            case 3:
                return new jb.p((id.h) ((ib.c) this.b).get(), (j1) ((ib.c) this.c).get(), (m1.g) ((ib.c) this.d).get());
            default:
                return new o5.s(new nb.a(28), new w7.s(27, false), (t5.b) ((r7) this.b).get(), (ia.c) ((ga.d) this.c).get(), (ui.e) ((b0) this.d).get());
        }
    }

    @Override // org.telegram.messenger.ILocationServiceProvider
    public void getLastLocation(q0.a aVar) {
        u7.c cVar = (u7.c) this.b;
        cVar.getClass();
        s b10 = com.google.android.gms.common.api.internal.t.b();
        b10.c = u7.a.c;
        b10.a = 2414;
        cVar.e(0, b10.a()).addOnCompleteListener(new y9(aVar, 0));
    }

    public o5.i h() {
        String str = ((String) this.b) == null ? " backendName" : "";
        if (((l5.d) this.d) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new o5.i((String) this.b, (byte[]) this.c, (l5.d) this.d);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0063  */
    @Override // org.telegram.ui.Components.hi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void i(View view, o0 o0Var, boolean z9, boolean z10) {
        float f10;
        p0 p0Var;
        ch.m0 k10;
        float f11;
        int i7;
        float f12;
        an anVar = (an) this.d;
        z H8 = anVar.H8(((ij) this.b).f1(), true);
        float f13 = 0.0f;
        if (H8 instanceof q1) {
            p0 p0Var2 = ((q1) H8).N;
            ch.m0 k11 = p0Var2.k(o0Var);
            if (k11 == null) {
                f12 = 0.0f;
                f10 = f12;
                anVar.Ab(H8, (ij) this.b, (ii0) this.c, view, f13, f10, o0Var, false, (o0Var == null && o0Var.a) ? true : z9, z10, false);
            } else {
                f13 = p0Var2.b + k11.w + (k11.z / 2.0f);
                f11 = p0Var2.c + k11.x;
                i7 = k11.A;
            }
        } else if (!(H8 instanceof t0) || (k10 = (p0Var = ((t0) H8).E0).k(o0Var)) == null) {
            f10 = 0.0f;
            anVar.Ab(H8, (ij) this.b, (ii0) this.c, view, f13, f10, o0Var, false, (o0Var == null && o0Var.a) ? true : z9, z10, false);
        } else {
            f13 = p0Var.b + k10.w + (k10.z / 2.0f);
            f11 = p0Var.c + k10.x;
            i7 = k10.A;
        }
        f12 = f11 + (i7 / 2.0f);
        f10 = f12;
        anVar.Ab(H8, (ij) this.b, (ii0) this.c, view, f13, f10, o0Var, false, (o0Var == null && o0Var.a) ? true : z9, z10, false);
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

    public void j(Canvas canvas, RectF rectF, float f10) {
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
    public long k(int i7) {
        long[] jArr = (long[]) this.d;
        ia.f(i7 >= 0);
        ia.f(i7 < jArr.length);
        return jArr[i7];
    }

    public void m(Canvas canvas, RectF rectF, int i7, float f10) {
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

    public Object n(Bitmap bitmap) {
        ih.a aVar = (ih.a) this.b;
        if (aVar.a(bitmap)) {
            this.d = ((ih.b) this.c).b(bitmap);
            aVar.b(bitmap);
        }
        return this.d;
    }

    public ColorStateList o(int i7) {
        int resourceId;
        ColorStateList a10;
        TypedArray typedArray = (TypedArray) this.c;
        return (!typedArray.hasValue(i7) || (resourceId = typedArray.getResourceId(i7, 0)) == 0 || (a10 = b5.a.a((Context) this.b, resourceId)) == null) ? typedArray.getColorStateList(i7) : a10;
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
    public sa onCreateLocationRequest() {
        LocationRequest locationRequest = new LocationRequest(qs.n1, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, ConnectionsManager.DEFAULT_DATACENTER_ID, 0.0f, true, 3600000L, 0, 0, null, false, new WorkSource(), null);
        ba baVar = new ba();
        baVar.a = locationRequest;
        return baVar;
    }

    @Override // org.telegram.messenger.ILocationServiceProvider
    public ta onCreateLocationServicesAPI(Context context, pa paVar, final qa qaVar) {
        List list;
        Context context2 = org.telegram.messenger.t0.b;
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
        q6.m.h(eVar2, "Api must not be null");
        com.google.android.gms.common.api.e eVar3 = null;
        fVar2.put(eVar2, null);
        a9.e eVar4 = eVar2.a;
        q6.m.h(eVar4, "Base client builder must not be null");
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
        arrayList.add(new aa(paVar));
        arrayList2.add(new com.google.android.gms.common.api.l() { // from class: org.telegram.messenger.x9
            @Override // com.google.android.gms.common.api.l
            public final void onConnectionFailed(n6.a aVar) {
                sd sdVar = (sd) qa.this;
                if (sdVar.L) {
                    return;
                }
                sdVar.K = Boolean.FALSE;
                if (sdVar.D) {
                    sdVar.D = false;
                    sdVar.p();
                }
            }
        });
        boolean z9 = true;
        q6.m.a("must call addApi() to add at least one API", !fVar2.isEmpty());
        q8.a aVar = q8.a.a;
        com.google.android.gms.common.api.e eVar5 = q8.b.b;
        if (fVar2.containsKey(eVar5)) {
            aVar = (q8.a) fVar2.get(eVar5);
        }
        q3 q3Var = new q3(hashSet, fVar, packageName, name, aVar);
        Map map = (Map) q3Var.c;
        a0.f fVar3 = new a0.f(0);
        a0.f fVar4 = new a0.f(0);
        ArrayList arrayList3 = new ArrayList();
        Iterator it = ((a0.c) fVar2.keySet()).iterator();
        while (true) {
            a0.b bVar = (a0.b) it;
            if (!bVar.hasNext()) {
                q3 q3Var2 = q3Var;
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
                d0 d0Var = new d0(context2, new ReentrantLock(), looper, q3Var2, fVar5, arrayList, arrayList2, fVar6, d0.j(fVar6.values(), true), arrayList4);
                Set set = com.google.android.gms.common.api.m.a;
                synchronized (set) {
                    set.add(d0Var);
                }
                gf.g gVar = new gf.g(23);
                gVar.b = d0Var;
                return gVar;
            }
            com.google.android.gms.common.api.e eVar6 = (com.google.android.gms.common.api.e) bVar.next();
            Object obj2 = fVar2.get(eVar6);
            boolean z10 = map.get(eVar6) != null ? z9 : false;
            fVar3.put(eVar6, Boolean.valueOf(z10));
            a0.f fVar7 = fVar4;
            Looper looper2 = mainLooper;
            e1 e1Var = new e1(eVar6, z10);
            arrayList3.add(e1Var);
            a9.e eVar7 = eVar6.a;
            q6.m.g(eVar7);
            ArrayList arrayList5 = arrayList3;
            Map map2 = map;
            q3 q3Var3 = q3Var;
            a0.f fVar8 = fVar2;
            a0.f fVar9 = fVar3;
            Object a10 = eVar7.a(context2, looper2, q3Var3, obj2, e1Var, e1Var);
            fVar7.put(eVar6.b, a10);
            q6.d dVar = (q6.d) a10;
            dVar.getClass();
            if (!(dVar instanceof d6.e)) {
                mainLooper = looper2;
                q3Var = q3Var3;
            } else {
                if (eVar3 != null) {
                    String str2 = eVar6.c;
                    String str3 = eVar3.c;
                    throw new IllegalStateException(f1.n(str2, " cannot be used with ", str3, new StringBuilder(String.valueOf(str2).length() + 21 + String.valueOf(str3).length())));
                }
                mainLooper = looper2;
                q3Var = q3Var3;
                eVar3 = eVar6;
            }
            fVar4 = fVar7;
            map = map2;
            fVar3 = fVar9;
            fVar2 = fVar8;
            arrayList3 = arrayList5;
            z9 = true;
        }
    }

    public Drawable p(int i7) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.c;
        return (!typedArray.hasValue(i7) || (resourceId = typedArray.getResourceId(i7, 0)) == 0) ? typedArray.getDrawable(i7) : b5.a.b((Context) this.b, resourceId);
    }

    public Drawable q(int i7) {
        int resourceId;
        Drawable f10;
        if (!((TypedArray) this.c).hasValue(i7) || (resourceId = ((TypedArray) this.c).getResourceId(i7, 0)) == 0) {
            return null;
        }
        m.r a10 = m.r.a();
        Context context = (Context) this.b;
        synchronized (a10) {
            f10 = a10.a.f(resourceId, context, true);
        }
        return f10;
    }

    public Typeface r(int i7, int i10, h2.j0 j0Var) {
        h2.j0 j0Var2;
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
                int i12 = 23;
                if (typeface != null) {
                    new Handler(Looper.getMainLooper()).post(new f2.h(i12, j0Var, typeface));
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
                                new Handler(Looper.getMainLooper()).post(new f2.h(i12, j0Var2, e10));
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

    @Override // org.telegram.messenger.ILocationServiceProvider
    public synchronized void removeLocationUpdates(ra raVar) {
        z9 z9Var = (z9) ((HashMap) this.d).remove(raVar);
        if (z9Var != null) {
            u7.c cVar = (u7.c) this.b;
            cVar.getClass();
            String simpleName = z9.class.getSimpleName();
            q6.m.f(simpleName, "Listener type must not be empty");
            cVar.c(new com.google.android.gms.common.api.internal.m(z9Var, simpleName), 2418).continueWith(u7.b.a, u7.a.b);
        }
    }

    @Override // org.telegram.messenger.ILocationServiceProvider
    public synchronized void requestLocationUpdates(sa saVar, ra raVar) {
        z9 z9Var = (z9) ((HashMap) this.d).remove(raVar);
        if (z9Var != null) {
            u7.c cVar = (u7.c) this.b;
            cVar.getClass();
            String simpleName = z9.class.getSimpleName();
            q6.m.f(simpleName, "Listener type must not be empty");
            cVar.c(new com.google.android.gms.common.api.internal.m(z9Var, simpleName), 2418).continueWith(u7.b.a, u7.a.b);
        }
        z9 z9Var2 = new z9(raVar);
        ((HashMap) this.d).put(raVar, z9Var2);
        ((u7.c) this.b).f(((ba) saVar).a, z9Var2, Looper.getMainLooper());
    }

    @Override // c4.d
    public List s(long j3) {
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
        Collections.sort(arrayList2, new jg.x(6));
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            g2.b bVar2 = ((l4.c) arrayList2.get(i11)).a;
            arrayList.add(new g2.b(bVar2.a, bVar2.b, bVar2.c, bVar2.d, (-1) - i11, 1, bVar2.g, bVar2.h, bVar2.i, bVar2.n, bVar2.o, bVar2.j, bVar2.k, bVar2.l, bVar2.m, bVar2.p, bVar2.q, bVar2.r));
        }
        return arrayList;
    }

    public void t(ha haVar) {
        try {
            l8.f fVar = (l8.f) this.c;
            k8.c cVar = new k8.c(haVar);
            Parcel P0 = fVar.P0();
            v7.b.c(P0, cVar);
            fVar.T0(P0, 9);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
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

    public Paint u(float f10, int i7) {
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

    @Override // org.telegram.ui.Components.hi0
    public /* synthetic */ boolean v() {
        return true;
    }

    @Override // org.telegram.ui.wm0
    public void v0(int i7, boolean z9, boolean z10) {
        if (z9) {
            return;
        }
        vj vjVar = (vj) this.d;
        HashMap hashMap = (HashMap) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        di diVar = vjVar.b;
        if (hashMap.isEmpty() || vjVar.Q == null || vjVar.K) {
            return;
        }
        vjVar.K = true;
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = hashMap.get(arrayList.get(i10));
            fz fzVar = new fz();
            arrayList2.add(fzVar);
            if (obj instanceof gf) {
                gf gfVar = (gf) obj;
                String str = gfVar.h;
                if (str != null) {
                    fzVar.c = str;
                } else {
                    fzVar.c = gfVar.I;
                }
                fzVar.e = gfVar.c;
                fzVar.f = gfVar.g;
                fzVar.k = gfVar.s;
                fzVar.o = gfVar.b;
                CharSequence charSequence = gfVar.a;
                fzVar.d = charSequence != null ? charSequence.toString() : null;
                fzVar.i = gfVar.n;
                fzVar.j = gfVar.r;
                fzVar.h = gfVar.x;
            }
        }
        v4.X(diVar.D3, diVar.X0() + arrayList2.size(), diVar.b1(), new r2(i7, 2, vjVar, arrayList2, z10));
    }

    public int w(gc.e eVar) {
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

    @Override // c4.d
    public int y() {
        return ((long[]) this.d).length;
    }

    public /* synthetic */ m(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ m(Object obj, Object obj2, Object obj3, boolean z9, int i7) {
        this.a = i7;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public m(x5 x5Var, l8.f fVar) {
        this.a = 6;
        this.c = fVar;
        q6.m.g(x5Var);
        this.b = x5Var;
    }

    public m(h hVar) {
        this.a = 0;
        this.d = hVar;
        this.c = new AtomicLong((j6.a.b.nextLong() & 65535) * 10000);
    }

    public m(ih.b bVar) {
        this.a = 2;
        this.b = new ih.a();
        this.c = bVar;
    }

    public m(Context context) {
        this.a = 18;
        this.b = context;
    }

    public m(int i7) {
        this.a = i7;
        switch (i7) {
            case 28:
                this.b = new Paint[4];
                this.d = new Matrix();
                break;
            default:
                this.d = new HashMap();
                break;
        }
    }

    public m(ArrayList arrayList) {
        this.a = 8;
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

    @Override // org.telegram.ui.wm0
    public void A() {
    }

    @Override // org.telegram.ui.Components.hi0
    public /* synthetic */ void M() {
    }

    public m(View view) {
        this.a = 27;
        this.d = view;
        z41 z41Var = new z41(this, view);
        this.b = z41Var;
        view.addOnLayoutChangeListener(z41Var);
    }

    @Override // org.telegram.ui.wm0
    public void B(Editable editable) {
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
        n2.v0 v0Var = new n2.v0();
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
        this.c = v0Var;
        this.d = sVar;
        nVarArr2[nVarArr.length] = v0Var;
        nVarArr2[nVarArr.length + 1] = sVar;
    }

    public m(Signature signature) {
        this.a = 5;
        this.b = signature;
        this.c = null;
        this.d = null;
    }

    public m(Cipher cipher) {
        this.a = 5;
        this.c = cipher;
        this.b = null;
        this.d = null;
    }

    public m(Mac mac) {
        this.a = 5;
        this.d = mac;
        this.c = null;
        this.b = null;
    }

    public m(View view, jh.k kVar) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        this.a = 4;
        m6 m6Var = new m6(this, 2);
        this.b = view;
        this.c = kVar;
        view.addOnAttachStateChangeListener(m6Var);
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
        this.a = 1;
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
            boolean z9 = (dVar5 == gc.d.h && dVar4 == null && i13 != 0) || !(dVar4 == null || i13 == dVar4.c);
            i7 = z9 ? 1 : i15;
            if (dVar4 == null || dVar4.a != dVar5 || z9) {
                ((ArrayList) this.b).add(0, new ic.e(this, dVar5, dVar3.b, i13, i14));
                i10 = 0;
            } else {
                i10 = i14;
            }
            if (z9) {
                ((ArrayList) this.b).add(0, new ic.e(this, dVar2, dVar3.b, dVar3.c, 0));
            }
            i12 = i7;
            dVar3 = dVar4;
            i11 = i10;
        }
        int i16 = i12;
        boolean z10 = qVar.a;
        gc.b bVar = (gc.b) qVar.d;
        if (z10) {
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
        int w10 = w(eVar);
        while (i17 < i18 && !ic.b.d(w10, gc.e.c(i17), bVar)) {
            i17++;
        }
        while (i17 > i7 && ic.b.d(w10, gc.e.c(i17 - 1), bVar)) {
            i17--;
        }
        this.c = gc.e.c(i17);
    }

    public m(l2.h hVar, m2.j jVar) {
        this.a = 7;
        this.d = hVar;
        this.b = new HashMap();
        this.c = jVar;
    }

    public m(Object[] objArr, Object[] objArr2) {
        this.a = 26;
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

    @Override // org.telegram.ui.Components.hi0
    public /* synthetic */ void L(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z9) {
    }
}
