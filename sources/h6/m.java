package h6;

import a8.ma;
import a8.r7;
import ab.c0;
import ai.h0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
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
import bi.x2;
import ch.n0;
import ch.p0;
import ch.q0;
import com.google.android.gms.common.api.internal.e0;
import com.google.android.gms.common.api.internal.f1;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import e2.s0;
import e2.u;
import fi.l2;
import fi.l4;
import gb.i1;
import h2.j0;
import h2.k0;
import h2.l0;
import h2.x;
import hi.d6;
import hi.e6;
import hi.f6;
import hi.l7;
import hi.m9;
import hi.w7;
import hi.x7;
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
import n2.x0;
import org.telegram.messenger.ILocationServiceProvider;
import org.telegram.messenger.a8;
import org.telegram.messenger.ap;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ef;
import org.telegram.messenger.fa;
import org.telegram.messenger.fj;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
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
import org.telegram.messenger.yy;
import org.telegram.messenger.z9;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.u0;
import org.telegram.ui.ActionBar.y0;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.bz;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.jx0;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.kk;
import org.telegram.ui.Components.nd0;
import org.telegram.ui.Components.t51;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.wi0;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Components.xx0;
import org.telegram.ui.Components.xy;
import org.telegram.ui.bn;
import org.telegram.ui.zm0;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class m implements l7, f61, ib.b, c4.d, a0, OnCompleteListener, q5.b, ILocationServiceProvider, ap, wi0, zm0 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ m(int i7) {
        this.a = i7;
    }

    public static m E(Context context, AttributeSet attributeSet, int[] iArr, int i7) {
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
                            mVar = new m(22);
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

    public static m s(View view) {
        return new m(view);
    }

    public static Object[] w(Object[] objArr, int[] iArr) {
        int length = objArr.length;
        Class<?> componentType = objArr.getClass().getComponentType();
        jx0 jx0Var = xx0.T;
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

    public Drawable A(int i7) {
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

    public Typeface B(int i7, int i10, j0 j0Var) {
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
                int i12 = 22;
                if (typeface != null) {
                    new Handler(Looper.getMainLooper()).post(new l4(i12, j0Var, typeface));
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
                                new Handler(Looper.getMainLooper()).post(new l4(i12, j0Var2, e10));
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

    public void C(fa faVar) {
        try {
            l8.f fVar = (l8.f) this.c;
            k8.b bVar = new k8.b(faVar);
            Parcel p12 = fVar.p1();
            v7.b.c(p12, bVar);
            fVar.t1(p12, 9);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public int D(gc.e eVar) {
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

    public void G() {
        ((TypedArray) this.c).recycle();
    }

    public void H(b3.a aVar) {
        m2.i iVar = (m2.i) ((HashMap) this.b).remove(aVar);
        iVar.getClass();
        l2.h hVar = (l2.h) ((l2.i) this.d).p.get(iVar);
        if (hVar != null) {
            synchronized (hVar) {
                hVar.d--;
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
        ((l2.i) this.d).c.e();
    }

    public void K(boolean z10, float f10) {
        y0[] y0VarArr = (y0[]) this.d;
        for (int i7 = 0; i7 < y0VarArr.length; i7++) {
            if (!z10 || ((i7 != 0 || Math.abs(f10 - 0.2f) >= 0.01f) && ((i7 != 1 || Math.abs(f10 - 0.5f) >= 0.1f) && ((i7 != 2 || Math.abs(f10 - 1.0f) >= 0.1f) && ((i7 != 3 || Math.abs(f10 - 1.5f) >= 0.1f) && (i7 != 4 || Math.abs(f10 - 2.0f) >= 0.1f)))))) {
                y0VarArr[i7].d(-328966, -328966);
            } else {
                y0VarArr[i7].d(-9718023, -9718023);
            }
        }
        ((u0) this.c).e(true, f10);
    }

    @Override // org.telegram.ui.zm0
    public void S() {
        ((kk) this.d).R.A();
    }

    @Override // org.telegram.messenger.ap
    public void a() {
        ((vf.b) this.b).b();
        ((g2) this.c).presentFragment(new bn((Bundle) this.d));
    }

    @Override // m4.a0
    public void b(k0 k0Var, f3.q qVar, f0 f0Var) {
        this.c = k0Var;
        f0Var.b();
        f0Var.c();
        f3.j0 d2 = qVar.d2(f0Var.c, 5);
        this.d = d2;
        d2.g((u) this.b);
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
            e2.t a10 = uVar.a();
            a10.w = e10;
            u uVar2 = new u(a10);
            this.b = uVar2;
            ((f3.j0) this.d).g(uVar2);
        }
        int a11 = xVar.a();
        ((f3.j0) this.d).b(a11, xVar);
        ((f3.j0) this.d).c(d, 1, a11, 0, null);
    }

    @Override // org.telegram.messenger.ILocationServiceProvider
    public void checkLocationSettings(qa qaVar, q0.a aVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(((z9) qaVar).a);
        u7.c cVar = (u7.c) this.c;
        j8.c cVar2 = new j8.c(arrayList, false, false);
        cVar.getClass();
        com.google.android.gms.common.api.internal.t b10 = com.google.android.gms.common.api.internal.u.b();
        b10.c = new nd0(cVar2, 20);
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

    @Override // org.telegram.messenger.ap
    public void e(boolean z10) {
        ((vf.b) this.b).b();
        ((g2) this.c).presentFragment(new bn((Bundle) this.d));
    }

    @Override // org.telegram.ui.zm0
    public /* synthetic */ boolean f() {
        return true;
    }

    @Override // hi.l7
    public void g(ArrayList arrayList) {
        tg.d dVar = (tg.d) this.c;
        if (dVar.getParent() == null) {
            ((hi.a0) this.d).b.i();
        } else {
            dVar.setSegments(arrayList);
        }
    }

    @Override // org.telegram.ui.zm0
    public void g0(int i7, boolean z10, boolean z11) {
        if (z10) {
            return;
        }
        kk kkVar = (kk) this.d;
        HashMap hashMap = (HashMap) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        ti tiVar = kkVar.b;
        if (hashMap.isEmpty() || kkVar.R == null || kkVar.L) {
            return;
        }
        kkVar.L = true;
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = hashMap.get(arrayList.get(i10));
            yy yyVar = new yy();
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
        b5.X(tiVar.H3, tiVar.Y0() + arrayList2.size(), tiVar.c1(), new l2(i7, 2, kkVar, arrayList2, z11));
    }

    @Override // fd.a
    public Object get() {
        switch (this.a) {
            case 5:
                return new jb.q((id.h) ((ib.c) this.b).get(), (i1) ((ib.c) this.c).get(), (m1.g) ((ib.c) this.d).get());
            default:
                int i7 = 28;
                return new o5.t(new qb.a(i7), new pb.b(i7), (t5.b) ((r7) this.b).get(), (ia.c) ((o3) this.c).get(), (c0) ((xi.e) this.d).get());
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

    /* JADX WARN: Removed duplicated region for block: B:9:0x0063  */
    @Override // org.telegram.ui.Components.wi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void h(View view, p0 p0Var, boolean z10, boolean z11) {
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
                bnVar.Eb(J8, (fj) this.b, (xi0) this.c, view, f13, f10, p0Var, false, (p0Var == null && p0Var.a) ? true : z10, z11, false);
            } else {
                f13 = q0Var2.b + k11.w + (k11.z / 2.0f);
                f11 = q0Var2.c + k11.x;
                i7 = k11.A;
            }
        } else if (!(J8 instanceof v0) || (k10 = (q0Var = ((v0) J8).F0).k(p0Var)) == null) {
            f10 = 0.0f;
            bnVar.Eb(J8, (fj) this.b, (xi0) this.c, view, f13, f10, p0Var, false, (p0Var == null && p0Var.a) ? true : z10, z11, false);
        } else {
            f13 = q0Var.b + k10.w + (k10.z / 2.0f);
            f11 = q0Var.c + k10.x;
            i7 = k10.A;
        }
        f12 = f11 + (i7 / 2.0f);
        f10 = f12;
        bnVar.Eb(J8, (fj) this.b, (xi0) this.c, view, f13, f10, p0Var, false, (p0Var == null && p0Var.a) ? true : z10, z11, false);
    }

    @Override // c4.d
    public long i(int i7) {
        long[] jArr = (long[]) this.d;
        ma.f(i7 >= 0);
        ma.f(i7 < jArr.length);
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

    @Override // hi.l7
    public void j(long j3, long j10, boolean z10) {
        ((o3) this.b).f(j3, j10, z10);
    }

    @Override // c4.d
    public List k(long j3) {
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

    @Override // org.telegram.ui.Components.wi0
    public /* synthetic */ boolean l() {
        return true;
    }

    @Override // c4.d
    public int m() {
        return ((long[]) this.d).length;
    }

    @Override // org.telegram.ui.Components.wi0
    public /* synthetic */ boolean n() {
        return false;
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
        ga.d dVar = new ga.d(hashSet, fVar, packageName, name, aVar);
        Map map = (Map) dVar.d;
        a0.f fVar3 = new a0.f(0);
        a0.f fVar4 = new a0.f(0);
        ArrayList arrayList3 = new ArrayList();
        Iterator it = ((a0.c) fVar2.keySet()).iterator();
        while (true) {
            a0.b bVar = (a0.b) it;
            if (!bVar.hasNext()) {
                ga.d dVar2 = dVar;
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
                e0 e0Var = new e0(context2, new ReentrantLock(), looper, dVar2, fVar5, arrayList, arrayList2, fVar6, e0.i(fVar6.values(), true), arrayList4);
                Set set = com.google.android.gms.common.api.m.a;
                synchronized (set) {
                    set.add(e0Var);
                }
                j6.r rVar = new j6.r(20);
                rVar.b = e0Var;
                return rVar;
            }
            com.google.android.gms.common.api.e eVar6 = (com.google.android.gms.common.api.e) bVar.next();
            Object obj2 = fVar2.get(eVar6);
            boolean z11 = map.get(eVar6) != null ? z10 : false;
            fVar3.put(eVar6, Boolean.valueOf(z11));
            a0.f fVar7 = fVar4;
            Looper looper2 = mainLooper;
            f1 f1Var = new f1(eVar6, z11);
            arrayList3.add(f1Var);
            a9.e eVar7 = eVar6.a;
            q6.m.h(eVar7);
            ArrayList arrayList5 = arrayList3;
            Map map2 = map;
            ga.d dVar3 = dVar;
            a0.f fVar8 = fVar2;
            a0.f fVar9 = fVar3;
            Object a10 = eVar7.a(context2, looper2, dVar3, obj2, f1Var, f1Var);
            fVar7.put(eVar6.b, a10);
            q6.d dVar4 = (q6.d) a10;
            dVar4.getClass();
            if (!(dVar4 instanceof d6.e)) {
                mainLooper = looper2;
                dVar = dVar3;
            } else {
                if (eVar3 != null) {
                    String str2 = eVar6.c;
                    String str3 = eVar3.c;
                    throw new IllegalStateException(p5.c.m(str2, " cannot be used with ", str3, new StringBuilder(String.valueOf(str2).length() + 21 + String.valueOf(str3).length())));
                }
                mainLooper = looper2;
                dVar = dVar3;
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

    @Override // org.telegram.ui.Components.f61
    public void onError(h61 h61Var, Exception exc) {
        m9 m9Var = ((f6) this.d).O;
        if (m9Var != null) {
            m9Var.run();
        }
    }

    @Override // org.telegram.ui.Components.f61
    public /* synthetic */ void onRenderedFirstFrame(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.f61
    public void onStateChanged(boolean z10, int i7) {
        f6 f6Var = (f6) this.d;
        d6 d6Var = f6Var.L;
        h61 h61Var = f6Var.e;
        if (h61Var == null) {
            return;
        }
        if (h61Var.d0()) {
            g0.g3(d6Var);
        } else {
            g0.r(d6Var);
        }
    }

    @Override // org.telegram.ui.Components.f61
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.f61
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((f6) this.d).i();
    }

    @Override // org.telegram.ui.Components.f61
    public void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
        f6 f6Var = (f6) this.d;
        x7 x7Var = (x7) this.b;
        if (x7Var != null) {
            w7 V = f6Var.e.V(x7Var.d1);
            x7Var.d1 = V;
            x51 x51Var = f6Var.n;
            if (x51Var != null) {
                x51Var.setHDRInfo(V);
            }
        }
        int i12 = (int) (i7 * f10);
        f6Var.f = i12;
        int i13 = (int) (i10 * f10);
        f6Var.h = i13;
        if (x7Var != null && (x7Var.k0 != i12 || x7Var.l0 != i13)) {
            x7Var.k0 = i12;
            x7Var.l0 = i13;
            x7Var.A();
        }
        f6Var.b();
        x51 x51Var2 = f6Var.n;
        if (x51Var2 != null) {
            int i14 = f6Var.f;
            int i15 = f6Var.h;
            x51Var2.d = i14;
            x51Var2.e = i15;
            bz bzVar = x51Var2.b;
            if (bzVar == null) {
                return;
            }
            bzVar.postRunnable(new xy(bzVar, i14, i15, 0));
        }
    }

    @Override // hi.l7
    public void p() {
        hi.a0 a0Var = (hi.a0) this.d;
        hi.z zVar = a0Var.a;
        o3 o3Var = a0Var.c;
        if (o3Var != null) {
            o3Var.f = null;
            fc fcVar = (fc) o3Var.h;
            if (fcVar != null) {
                fcVar.b();
                o3Var.h = null;
            }
            a0Var.c = null;
        }
        tg.d dVar = (tg.d) this.c;
        if (dVar.getParent() != null) {
            zVar.V0(dVar);
        }
        new kc(zVar.N(), zVar.Q()).Q(R.raw.error, 36, gd.N0(2131744465, null)).k(true);
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

    @Override // org.telegram.ui.Components.wi0
    public /* synthetic */ boolean t() {
        return false;
    }

    public String toString() {
        switch (this.a) {
            case 3:
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

    public o5.i u() {
        String str = ((String) this.b) == null ? " backendName" : "";
        if (((l5.d) this.d) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new o5.i((String) this.b, (byte[]) this.c, (l5.d) this.d);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public Object x(Bitmap bitmap) {
        ih.a aVar = (ih.a) this.b;
        if (aVar.a(bitmap)) {
            this.d = ((ih.b) this.c).b(bitmap);
            aVar.b(bitmap);
        }
        return this.d;
    }

    public ColorStateList y(int i7) {
        int resourceId;
        ColorStateList a10;
        TypedArray typedArray = (TypedArray) this.c;
        return (!typedArray.hasValue(i7) || (resourceId = typedArray.getResourceId(i7, 0)) == 0 || (a10 = c8.a0.a((Context) this.b, resourceId)) == null) ? typedArray.getColorStateList(i7) : a10;
    }

    public Drawable z(int i7) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.c;
        return (!typedArray.hasValue(i7) || (resourceId = typedArray.getResourceId(i7, 0)) == 0) ? typedArray.getDrawable(i7) : c8.a0.b((Context) this.b, resourceId);
    }

    public /* synthetic */ m(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    @Override // org.telegram.ui.Components.f61
    public void onRenderedFirstFrame() {
        x7 x7Var = (x7) this.b;
        Runnable[] runnableArr = (Runnable[]) this.c;
        f6 f6Var = (f6) this.d;
        e6 e6Var = f6Var.I;
        if (e6Var != null && e6Var.g) {
            int i7 = f6Var.f;
            int i10 = f6Var.h;
            e6Var.d = true;
            e6Var.e = i7;
            e6Var.f = i10;
            org.telegram.ui.web.b bVar = e6Var.c;
            if (bVar != null) {
                bVar.a(Integer.valueOf(i7), Integer.valueOf(e6Var.f));
            }
        }
        Runnable runnable = runnableArr[0];
        if (runnable == null) {
            x51 x51Var = f6Var.n;
            if (x51Var != null) {
                if (e6Var == null || !e6Var.g) {
                    x51Var.animate().alpha(1.0f).setDuration(180L).withEndAction(new hi.c(9, this, x7Var)).start();
                    return;
                }
                return;
            }
            return;
        }
        f6Var.post(runnable);
        runnableArr[0] = null;
        Bitmap bitmap = f6Var.a;
        if (bitmap != null) {
            bitmap.recycle();
            if (x7Var.M0 == f6Var.a) {
                x7Var.M0 = null;
            }
            f6Var.a = null;
            f6Var.invalidate();
        }
    }

    public /* synthetic */ m(Object obj, Object obj2, Object obj3, boolean z10, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public m(h0 h0Var, l8.f fVar) {
        this.a = 8;
        this.c = fVar;
        q6.m.h(h0Var);
        this.b = h0Var;
    }

    public m(h hVar) {
        this.a = 0;
        this.d = hVar;
        this.c = new AtomicLong((j6.a.b.nextLong() & 65535) * 10000);
    }

    public m(ih.b bVar) {
        this.a = 4;
        this.b = new ih.a();
        this.c = bVar;
    }

    public m(Context context) {
        this.a = 20;
        this.b = context;
    }

    public m() {
        this.a = 21;
        this.d = new HashMap();
    }

    public m(ArrayList arrayList) {
        this.a = 10;
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

    @Override // org.telegram.ui.zm0
    public void o() {
    }

    @Override // org.telegram.ui.Components.wi0
    public /* synthetic */ void r() {
    }

    public m(View view) {
        this.a = 29;
        this.d = view;
        t51 t51Var = new t51(this, view);
        this.b = t51Var;
        view.addOnLayoutChangeListener(t51Var);
    }

    @Override // org.telegram.ui.Components.f61
    public /* synthetic */ void onSeekFinished(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.f61
    public /* synthetic */ void onSeekStarted(m2.a aVar) {
    }

    @Override // org.telegram.ui.zm0
    public void v(Editable editable) {
    }

    public m(String str) {
        this.a = 13;
        e2.t tVar = new e2.t();
        tVar.q = s0.n("video/mp2t");
        tVar.r = s0.n(str);
        this.b = new u(tVar);
    }

    public m(Context context, TypedArray typedArray) {
        this.a = 12;
        this.b = context;
        this.c = typedArray;
    }

    public m(f2.n[] nVarArr) {
        this.a = 16;
        x0 x0Var = new x0();
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
        this.c = x0Var;
        this.d = sVar;
        nVarArr2[nVarArr.length] = x0Var;
        nVarArr2[nVarArr.length + 1] = sVar;
    }

    public m(Signature signature) {
        this.a = 7;
        this.b = signature;
        this.c = null;
        this.d = null;
    }

    public m(Cipher cipher) {
        this.a = 7;
        this.c = cipher;
        this.b = null;
        this.d = null;
    }

    public m(Mac mac) {
        this.a = 7;
        this.d = mac;
        this.c = null;
        this.b = null;
    }

    public m(View view, jh.k kVar) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        this.a = 6;
        x2 x2Var = new x2(this, 6);
        this.b = view;
        this.c = kVar;
        view.addOnAttachStateChangeListener(x2Var);
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
        this.a = 3;
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
        int D = D(eVar);
        while (i17 < i18 && !ic.b.d(D, gc.e.c(i17), bVar)) {
            i17++;
        }
        while (i17 > i7 && ic.b.d(D, gc.e.c(i17 - 1), bVar)) {
            i17--;
        }
        this.c = gc.e.c(i17);
    }

    public m(l2.i iVar, m2.i iVar2) {
        this.a = 9;
        this.d = iVar;
        this.b = new HashMap();
        this.c = iVar2;
    }

    public m(Object[] objArr, Object[] objArr2) {
        this.a = 28;
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
        this.c = w(objArr, iArr);
        this.d = w(objArr2, iArr);
    }

    @Override // org.telegram.ui.Components.wi0
    public /* synthetic */ void q(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z10) {
    }
}
