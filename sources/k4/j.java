package k4;

import a0.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
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
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.WorkSource;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import b4.n;
import b8.ke;
import b8.oc;
import b8.od;
import b8.zb;
import com.google.android.gms.common.api.internal.d0;
import com.google.android.gms.common.api.internal.f1;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import d2.f0;
import d2.m;
import d2.u;
import d2.v;
import dh.o0;
import e3.i0;
import ei.v2;
import g2.k0;
import g2.n0;
import g2.y;
import g9.g2;
import g9.l0;
import g9.t0;
import gi.v5;
import i2.p;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.locks.ReentrantLock;
import l4.a0;
import m.o3;
import m.q;
import m2.x0;
import org.telegram.messenger.ILocationServiceProvider;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.hs;
import org.telegram.messenger.ia;
import org.telegram.messenger.ja;
import org.telegram.messenger.ka;
import org.telegram.messenger.la;
import org.telegram.messenger.lt;
import org.telegram.messenger.ma;
import org.telegram.messenger.s9;
import org.telegram.messenger.t9;
import org.telegram.messenger.u10;
import org.telegram.messenger.u9;
import org.telegram.messenger.v9;
import org.telegram.messenger.vo;
import org.telegram.messenger.xy;
import org.telegram.messenger.ye;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.u0;
import org.telegram.ui.ActionBar.y0;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.ki0;
import org.telegram.ui.Components.li0;
import org.telegram.ui.Components.lx0;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.uj;
import org.telegram.ui.Components.xw0;
import org.telegram.ui.Components.y41;
import org.telegram.ui.pu0;
import org.telegram.ui.rm0;
import org.telegram.ui.wm;
import org.telegram.ui.zx0;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class j implements b4.d, a0, OnCompleteListener, p5.b, ILocationServiceProvider, vo, ki0, rm0, zx0 {
    public Object a;
    public Object b;
    public Object c;

    public /* synthetic */ j(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public static j F(Context context, AttributeSet attributeSet, int[] iArr, int i3) {
        return new j(context, context.obtainStyledAttributes(attributeSet, iArr, i3, 0));
    }

    public static StringBuilder G(String str) {
        StringBuilder sb2;
        int i3;
        byte[] H;
        int i10;
        try {
            BufferedReader bufferedReader = new BufferedReader(new StringReader(str));
            int i11 = 0;
            boolean z10 = false;
            j jVar = null;
            String str2 = null;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                if (!readLine.startsWith("PHOTO")) {
                    if (readLine.indexOf(58) >= 0) {
                        if (readLine.startsWith("BEGIN:VCARD")) {
                            jVar = new j();
                            jVar.b = new ArrayList();
                            jVar.c = new ArrayList();
                        } else if (readLine.startsWith("END:VCARD") && jVar != null) {
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
                        if (strArr.length < 2 || jVar == null) {
                            i3 = i11;
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
                            i3 = i11;
                            jVar.a = strArr[1];
                            if (str3 != null && str3.equalsIgnoreCase("QUOTED-PRINTABLE") && (H = g0.H(g0.h1((String) jVar.a))) != null && H.length != 0) {
                                jVar.a = new String(H, str4);
                            }
                            jVar.a = ((String) jVar.a).replace(';', ' ');
                        } else {
                            i3 = i11;
                            if (strArr[i3].startsWith("TEL")) {
                                if (strArr[1].length() > 0) {
                                    ((ArrayList) jVar.c).add(strArr[1]);
                                }
                            } else if (strArr[i3].startsWith("EMAIL")) {
                                String str5 = strArr[1];
                                if (str5.length() > 0) {
                                    ((ArrayList) jVar.b).add(str5);
                                }
                            }
                        }
                        i11 = i3;
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
            for (int i14 = i13; i14 < ((ArrayList) jVar.c).size(); i14++) {
                if (sb3.length() > 0) {
                    sb3.append('\n');
                }
                String str6 = (String) ((ArrayList) jVar.c).get(i14);
                if (!str6.contains("#") && !str6.contains("*")) {
                    sb3.append(mf.b.c().b(str6));
                }
                sb3.append(str6);
            }
            for (int i15 = i13; i15 < ((ArrayList) jVar.b).size(); i15++) {
                if (sb3.length() > 0) {
                    sb3.append('\n');
                }
                sb3.append(mf.b.c().b((String) ((ArrayList) jVar.b).get(i15)));
            }
            if (!TextUtils.isEmpty((String) jVar.a)) {
                if (sb3.length() > 0) {
                    sb3.append('\n');
                }
                sb3.append((String) jVar.a);
            }
            return sb3;
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static j k(View view) {
        return new j(view);
    }

    public static Object[] q(Object[] objArr, int[] iArr) {
        int length = objArr.length;
        Class<?> componentType = objArr.getClass().getComponentType();
        xw0 xw0Var = lx0.S;
        int i3 = -1;
        for (int i10 : iArr) {
            i3 = Math.max(i3, i10);
        }
        Object[] objArr2 = (Object[]) Array.newInstance(componentType, i3 + 1);
        for (int i11 = 0; i11 < length; i11++) {
            objArr2[iArr[i11]] = objArr[i11];
        }
        return objArr2;
    }

    public static p2.e s(f0 f0Var) {
        p pVar = new p();
        pVar.c = null;
        Uri uri = f0Var.b;
        String uri2 = uri == null ? null : uri.toString();
        boolean z10 = f0Var.f;
        n nVar = new n();
        int i3 = 1;
        zb.f((z10 && TextUtils.isEmpty(uri2)) ? false : true);
        nVar.b = pVar;
        nVar.c = uri2;
        nVar.a = z10;
        nVar.d = new HashMap();
        l0 l0Var = f0Var.c;
        t0 t0Var = l0Var.a;
        if (t0Var == null) {
            t0Var = l0Var.c();
            l0Var.a = t0Var;
        }
        g2 it = t0Var.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            str.getClass();
            str2.getClass();
            synchronized (((HashMap) nVar.d)) {
                ((HashMap) nVar.d).put(str, str2);
            }
        }
        HashMap hashMap = new HashMap();
        int i10 = m.a;
        kb.a aVar = new kb.a(i3);
        UUID uuid = f0Var.a;
        uuid.getClass();
        boolean z11 = f0Var.d;
        boolean z12 = f0Var.e;
        int[] f10 = od.f(f0Var.g);
        int length = f10.length;
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = f10[i11];
            zb.f(i12 == 2 || i12 == 1);
        }
        p2.e eVar = new p2.e(uuid, nVar, hashMap, z11, (int[]) f10.clone(), z12, aVar);
        byte[] bArr = f0Var.h;
        byte[] copyOf = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        zb.p(eVar.x.isEmpty());
        eVar.L = copyOf;
        return eVar;
    }

    public Drawable A(int i3) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.b;
        return (!typedArray.hasValue(i3) || (resourceId = typedArray.getResourceId(i3, 0)) == 0) ? typedArray.getDrawable(i3) : oc.b((Context) this.a, resourceId);
    }

    public Drawable B(int i3) {
        int resourceId;
        Drawable f10;
        if (!((TypedArray) this.b).hasValue(i3) || (resourceId = ((TypedArray) this.b).getResourceId(i3, 0)) == 0) {
            return null;
        }
        q a10 = q.a();
        Context context = (Context) this.a;
        synchronized (a10) {
            f10 = a10.a.f(resourceId, context, true);
        }
        return f10;
    }

    public Typeface C(int i3, int i10, k0 k0Var) {
        k0 k0Var2;
        XmlPullParserException xmlPullParserException;
        IOException iOException;
        int resourceId = ((TypedArray) this.b).getResourceId(i3, 0);
        if (resourceId != 0) {
            if (((TypedValue) this.c) == null) {
                this.c = new TypedValue();
            }
            Context context = (Context) this.a;
            TypedValue typedValue = (TypedValue) this.c;
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
                    k0Var.b();
                    return null;
                }
                int i11 = typedValue.assetCookie;
                a0.j jVar = i0.e.b;
                Typeface typeface = (Typeface) jVar.a(i0.e.b(resources, resourceId, charSequence2, i11, i10));
                int i12 = 29;
                if (typeface != null) {
                    new Handler(Looper.getMainLooper()).post(new g2.c(i12, k0Var, typeface));
                    return typeface;
                }
                try {
                    if (!charSequence2.toLowerCase().endsWith(".xml")) {
                        k0Var2 = k0Var;
                        try {
                            int i13 = typedValue.assetCookie;
                            Typeface e10 = i0.e.a.e(context, resources, resourceId, charSequence2, i10);
                            if (e10 != null) {
                                jVar.b(i0.e.b(resources, resourceId, charSequence2, i13, i10), e10);
                            }
                            if (e10 != null) {
                                new Handler(Looper.getMainLooper()).post(new g2.c(i12, k0Var2, e10));
                            } else {
                                k0Var2.b();
                            }
                            return e10;
                        } catch (IOException e11) {
                            e = e11;
                            iOException = e;
                            Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                            k0Var2.b();
                            return null;
                        } catch (XmlPullParserException e12) {
                            e = e12;
                            xmlPullParserException = e;
                            Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                            k0Var2.b();
                            return null;
                        }
                    }
                    h0.d g7 = h0.b.g(resources.getXml(resourceId), resources);
                    if (g7 != null) {
                        try {
                            return i0.e.a(context, g7, resources, resourceId, charSequence2, typedValue.assetCookie, i10, k0Var);
                        } catch (IOException e13) {
                            e = e13;
                            k0Var2 = k0Var;
                            iOException = e;
                            Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                            k0Var2.b();
                            return null;
                        } catch (XmlPullParserException e14) {
                            e = e14;
                            k0Var2 = k0Var;
                            xmlPullParserException = e;
                            Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                            k0Var2.b();
                            return null;
                        }
                    }
                    try {
                        Log.e("ResourcesCompat", "Failed to find font-family tag");
                        k0Var.b();
                        return null;
                    } catch (IOException e15) {
                        iOException = e15;
                        k0Var2 = k0Var;
                        Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                        k0Var2.b();
                        return null;
                    } catch (XmlPullParserException e16) {
                        xmlPullParserException = e16;
                        k0Var2 = k0Var;
                        Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                        k0Var2.b();
                        return null;
                    }
                } catch (IOException e17) {
                    e = e17;
                    k0Var2 = k0Var;
                } catch (XmlPullParserException e18) {
                    e = e18;
                    k0Var2 = k0Var;
                }
            }
        }
        return null;
    }

    public Paint D(float f10, int i3) {
        Paint[] paintArr = (Paint[]) this.a;
        if (paintArr[i3] == null) {
            Paint paint = new Paint(1);
            paintArr[i3] = paint;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
        paintArr[i3].setShader(null);
        paintArr[i3].setColor(-65536);
        paintArr[i3].setAlpha((int) (f10 * 255.0f));
        return paintArr[i3];
    }

    public void H() {
        ((TypedArray) this.b).recycle();
    }

    public void I(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.a = str;
    }

    public void K(boolean z10, float f10) {
        y0[] y0VarArr = (y0[]) this.c;
        for (int i3 = 0; i3 < y0VarArr.length; i3++) {
            if (!z10 || ((i3 != 0 || Math.abs(f10 - 0.2f) >= 0.01f) && ((i3 != 1 || Math.abs(f10 - 0.5f) >= 0.1f) && ((i3 != 2 || Math.abs(f10 - 1.0f) >= 0.1f) && ((i3 != 3 || Math.abs(f10 - 1.5f) >= 0.1f) && (i3 != 4 || Math.abs(f10 - 2.0f) >= 0.1f)))))) {
                y0VarArr[i3].d(-328966, -328966);
            } else {
                y0VarArr[i3].d(-9718023, -9718023);
            }
        }
        ((u0) this.b).e(true, f10);
    }

    @Override // org.telegram.ui.Components.ki0
    public /* synthetic */ boolean O() {
        return false;
    }

    @Override // org.telegram.messenger.vo
    public void a() {
        ((sf.b) this.a).b();
        ((d2) this.b).presentFragment(new wm((Bundle) this.c));
    }

    @Override // l4.a0
    public void b(g2.l0 l0Var, e3.q qVar, l4.f0 f0Var) {
        this.b = l0Var;
        f0Var.b();
        f0Var.c();
        i0 i02 = qVar.i0(f0Var.c, 5);
        this.c = i02;
        i02.g((v) this.a);
    }

    @Override // l4.a0
    public void c(y yVar) {
        long d;
        ((g2.l0) this.b).getClass();
        String str = n0.a;
        g2.l0 l0Var = (g2.l0) this.b;
        synchronized (l0Var) {
            try {
                long j10 = l0Var.c;
                d = j10 != -9223372036854775807L ? j10 + l0Var.b : l0Var.d();
            } finally {
            }
        }
        long e10 = ((g2.l0) this.b).e();
        if (d == -9223372036854775807L || e10 == -9223372036854775807L) {
            return;
        }
        v vVar = (v) this.a;
        if (e10 != vVar.x) {
            u a10 = vVar.a();
            a10.w = e10;
            v vVar2 = new v(a10);
            this.a = vVar2;
            ((i0) this.c).g(vVar2);
        }
        int a11 = yVar.a();
        ((i0) this.c).e(a11, yVar);
        ((i0) this.c).d(d, 1, a11, 0, null);
    }

    @Override // org.telegram.ui.rm0
    public void c0() {
        ((uj) this.c).R.A();
    }

    @Override // org.telegram.messenger.ILocationServiceProvider
    public void checkLocationSettings(la laVar, q0.a aVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(((v9) laVar).a);
        t7.c cVar = (t7.c) this.b;
        i8.c cVar2 = new i8.c(arrayList, false, false);
        cVar.getClass();
        s b10 = t.b();
        b10.c = new i9(cVar2, 19);
        b10.a = 2426;
        cVar.e(0, b10.a()).addOnCompleteListener(new s9(aVar, 1));
    }

    @Override // org.telegram.messenger.ILocationServiceProvider
    public boolean checkServices() {
        return lt.b.hasServices();
    }

    @Override // b4.d
    public int d(long j10) {
        long[] jArr = (long[]) this.c;
        int b10 = n0.b(jArr, j10, false);
        if (b10 < jArr.length) {
            return b10;
        }
        return -1;
    }

    @Override // org.telegram.ui.rm0
    public /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.zx0
    public void f() {
        u10 u10Var;
        boolean[] zArr = (boolean[]) this.a;
        if (!zArr[0] && (u10Var = (u10) this.b) != null) {
            zArr[0] = true;
            u10Var.a(Boolean.TRUE);
        }
        g0.i3(new pu0((fc) this.c, 8), 200L);
    }

    @Override // cd.a
    public Object get() {
        return new n5.s(new kb.a(27), new v7.s(26), (s5.b) ((ke) this.a).get(), (ha.c) ((fa.f) this.b).get(), (za.p) ((ui.f) this.c).get());
    }

    @Override // org.telegram.messenger.ILocationServiceProvider
    public void getLastLocation(q0.a aVar) {
        t7.c cVar = (t7.c) this.a;
        cVar.getClass();
        s b10 = t.b();
        b10.c = t7.a.c;
        b10.a = 2414;
        cVar.e(0, b10.a()).addOnCompleteListener(new s9(aVar, 0));
    }

    @Override // b4.d
    public long h(int i3) {
        long[] jArr = (long[]) this.c;
        zb.f(i3 >= 0);
        zb.f(i3 < jArr.length);
        return jArr[i3];
    }

    @Override // org.telegram.messenger.ILocationServiceProvider
    public void init(Context context) {
        com.google.android.gms.common.api.e eVar = i8.b.a;
        com.google.android.gms.common.api.i iVar = com.google.android.gms.common.api.i.c;
        com.google.android.gms.common.api.e eVar2 = t7.c.l;
        com.google.android.gms.common.api.a aVar = com.google.android.gms.common.api.b.j;
        this.a = new t7.c(context, eVar2, aVar, iVar);
        this.b = new t7.c(context, eVar2, aVar, iVar);
    }

    @Override // org.telegram.messenger.vo
    public void j(boolean z10) {
        ((sf.b) this.a).b();
        ((d2) this.b).presentFragment(new wm((Bundle) this.c));
    }

    public n5.i l() {
        String str = ((String) this.a) == null ? " backendName" : "";
        if (((k5.d) this.c) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new n5.i((String) this.a, (byte[]) this.b, (k5.d) this.c);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public String n(int i3, long j10, long j11, String str) {
        ArrayList arrayList = (ArrayList) this.a;
        ArrayList arrayList2 = (ArrayList) this.c;
        ArrayList arrayList3 = (ArrayList) this.b;
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            sb2.append((String) arrayList.get(i10));
            if (((Integer) arrayList3.get(i10)).intValue() == 1) {
                sb2.append(str);
            } else if (((Integer) arrayList3.get(i10)).intValue() == 2) {
                sb2.append(String.format(Locale.US, (String) arrayList2.get(i10), Long.valueOf(j10)));
            } else if (((Integer) arrayList3.get(i10)).intValue() == 3) {
                sb2.append(String.format(Locale.US, (String) arrayList2.get(i10), Integer.valueOf(i3)));
            } else if (((Integer) arrayList3.get(i10)).intValue() == 4) {
                sb2.append(String.format(Locale.US, (String) arrayList2.get(i10), Long.valueOf(j11)));
            }
        }
        sb2.append((String) arrayList.get(arrayList3.size()));
        return sb2.toString();
    }

    public void o(Canvas canvas, RectF rectF, float f10) {
        Paint[] paintArr = (Paint[]) this.a;
        if (paintArr[0] == null) {
            Paint paint = new Paint(1);
            paintArr[0] = paint;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
        paintArr[0].setShader((LinearGradient) this.b);
        paintArr[0].setAlpha((int) (f10 * 255.0f));
        canvas.drawRect(rectF, paintArr[0]);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public /* synthetic */ void onComplete(Task task) {
        l6.c cVar = (l6.c) this.a;
        String str = (String) this.b;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.c;
        l lVar = cVar.a;
        synchronized (lVar) {
            lVar.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    @Override // org.telegram.messenger.ILocationServiceProvider
    public la onCreateLocationRequest() {
        LocationRequest locationRequest = new LocationRequest(hs.n1, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, ConnectionsManager.DEFAULT_DATACENTER_ID, 0.0f, true, 3600000L, 0, 0, null, false, new WorkSource(), null);
        v9 v9Var = new v9();
        v9Var.a = locationRequest;
        return v9Var;
    }

    @Override // org.telegram.messenger.ILocationServiceProvider
    public ma onCreateLocationServicesAPI(Context context, ia iaVar, final ja jaVar) {
        List list;
        Context context2 = org.telegram.messenger.t0.b;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        a0.f fVar = new a0.f(0);
        a0.f fVar2 = new a0.f(0);
        Object obj = m6.d.d;
        a6.b bVar = p8.b.a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Looper mainLooper = context2.getMainLooper();
        String packageName = context2.getPackageName();
        String name = context2.getClass().getName();
        com.google.android.gms.common.api.e eVar = i8.b.a;
        p6.m.h(eVar, "Api must not be null");
        com.google.android.gms.common.api.e eVar2 = null;
        fVar2.put(eVar, null);
        a6.b bVar2 = eVar.a;
        p6.m.h(bVar2, "Base client builder must not be null");
        switch (bVar2.a) {
            case 20:
                list = Collections.EMPTY_LIST;
                break;
            default:
                list = Collections.EMPTY_LIST;
                break;
        }
        hashSet2.addAll(list);
        hashSet.addAll(list);
        arrayList.add(new u9(iaVar));
        arrayList2.add(new com.google.android.gms.common.api.l() { // from class: org.telegram.messenger.r9
            @Override // com.google.android.gms.common.api.l
            public final void onConnectionFailed(m6.a aVar) {
                ld ldVar = (ld) ja.this;
                if (ldVar.M) {
                    return;
                }
                ldVar.L = Boolean.FALSE;
                if (ldVar.E) {
                    ldVar.E = false;
                    ldVar.p();
                }
            }
        });
        boolean z10 = true;
        p6.m.a("must call addApi() to add at least one API", !fVar2.isEmpty());
        p8.a aVar = p8.a.a;
        com.google.android.gms.common.api.e eVar3 = p8.b.b;
        if (fVar2.containsKey(eVar3)) {
            aVar = (p8.a) fVar2.get(eVar3);
        }
        o3 o3Var = new o3(hashSet, fVar, packageName, name, aVar);
        Map map = (Map) o3Var.c;
        a0.f fVar3 = new a0.f(0);
        a0.f fVar4 = new a0.f(0);
        ArrayList arrayList3 = new ArrayList();
        Iterator it = ((a0.c) fVar2.keySet()).iterator();
        while (true) {
            a0.b bVar3 = (a0.b) it;
            if (!bVar3.hasNext()) {
                o3 o3Var2 = o3Var;
                a0.f fVar5 = fVar3;
                a0.f fVar6 = fVar4;
                ArrayList arrayList4 = arrayList3;
                Looper looper = mainLooper;
                if (eVar2 != null) {
                    boolean equals = hashSet.equals(hashSet2);
                    String str = eVar2.c;
                    if (!equals) {
                        throw new IllegalStateException(a1.g.q("Must not set scopes in GoogleApiClient.Builder when using ", str, ". Set account in GoogleSignInOptions.Builder instead."));
                    }
                }
                d0 d0Var = new d0(context2, new ReentrantLock(), looper, o3Var2, fVar5, arrayList, arrayList2, fVar6, d0.j(fVar6.values(), true), arrayList4);
                Set set = com.google.android.gms.common.api.m.a;
                synchronized (set) {
                    set.add(d0Var);
                }
                v5 v5Var = new v5(23);
                v5Var.b = d0Var;
                return v5Var;
            }
            com.google.android.gms.common.api.e eVar4 = (com.google.android.gms.common.api.e) bVar3.next();
            Object obj2 = fVar2.get(eVar4);
            boolean z11 = map.get(eVar4) != null ? z10 : false;
            fVar3.put(eVar4, Boolean.valueOf(z11));
            a0.f fVar7 = fVar4;
            Looper looper2 = mainLooper;
            f1 f1Var = new f1(eVar4, z11);
            arrayList3.add(f1Var);
            a6.b bVar4 = eVar4.a;
            p6.m.g(bVar4);
            ArrayList arrayList5 = arrayList3;
            Map map2 = map;
            o3 o3Var3 = o3Var;
            a0.f fVar8 = fVar2;
            a0.f fVar9 = fVar3;
            Object a10 = bVar4.a(context2, looper2, o3Var3, obj2, f1Var, f1Var);
            fVar7.put(eVar4.b, a10);
            p6.d dVar = (p6.d) a10;
            dVar.getClass();
            if (!(dVar instanceof c6.e)) {
                mainLooper = looper2;
                o3Var = o3Var3;
            } else {
                if (eVar2 != null) {
                    String str2 = eVar4.c;
                    String str3 = eVar2.c;
                    throw new IllegalStateException(org.telegram.ui.Cells.f1.r(str2, " cannot be used with ", str3, new StringBuilder(String.valueOf(str2).length() + 21 + String.valueOf(str3).length())));
                }
                mainLooper = looper2;
                o3Var = o3Var3;
                eVar2 = eVar4;
            }
            fVar4 = fVar7;
            map = map2;
            fVar3 = fVar9;
            fVar2 = fVar8;
            arrayList3 = arrayList5;
            z10 = true;
        }
    }

    @Override // b4.d
    public List p(long j10) {
        List list = (List) this.a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            long[] jArr = (long[]) this.b;
            int i10 = i3 * 2;
            if (jArr[i10] <= j10 && j10 < jArr[i10 + 1]) {
                c cVar = (c) list.get(i3);
                f2.b bVar = cVar.a;
                if (bVar.e == -3.4028235E38f) {
                    arrayList2.add(cVar);
                } else {
                    arrayList.add(bVar);
                }
            }
        }
        Collections.sort(arrayList2, new a3.u(21));
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            f2.b bVar2 = ((c) arrayList2.get(i11)).a;
            arrayList.add(new f2.b(bVar2.a, bVar2.b, bVar2.c, bVar2.d, (-1) - i11, 1, bVar2.g, bVar2.h, bVar2.i, bVar2.n, bVar2.o, bVar2.j, bVar2.k, bVar2.l, bVar2.m, bVar2.p, bVar2.q, bVar2.r));
        }
        return arrayList;
    }

    @Override // org.telegram.ui.Components.ki0
    public /* synthetic */ boolean r() {
        return true;
    }

    @Override // org.telegram.messenger.ILocationServiceProvider
    public synchronized void removeLocationUpdates(ka kaVar) {
        t9 t9Var = (t9) ((HashMap) this.c).remove(kaVar);
        if (t9Var != null) {
            t7.c cVar = (t7.c) this.a;
            cVar.getClass();
            String simpleName = t9.class.getSimpleName();
            p6.m.f(simpleName, "Listener type must not be empty");
            cVar.c(new com.google.android.gms.common.api.internal.m(t9Var, simpleName), 2418).continueWith(t7.b.a, t7.a.b);
        }
    }

    @Override // org.telegram.messenger.ILocationServiceProvider
    public synchronized void requestLocationUpdates(la laVar, ka kaVar) {
        t9 t9Var = (t9) ((HashMap) this.c).remove(kaVar);
        if (t9Var != null) {
            t7.c cVar = (t7.c) this.a;
            cVar.getClass();
            String simpleName = t9.class.getSimpleName();
            p6.m.f(simpleName, "Listener type must not be empty");
            cVar.c(new com.google.android.gms.common.api.internal.m(t9Var, simpleName), 2418).continueWith(t7.b.a, t7.a.b);
        }
        t9 t9Var2 = new t9(kaVar);
        ((HashMap) this.c).put(kaVar, t9Var2);
        ((t7.c) this.a).f(((v9) laVar).a, t9Var2, Looper.getMainLooper());
    }

    @Override // b4.d
    public int t() {
        return ((long[]) this.c).length;
    }

    @Override // org.telegram.ui.Components.ki0
    public /* synthetic */ boolean v() {
        return false;
    }

    @Override // org.telegram.ui.rm0
    public void v0(int i3, boolean z10, boolean z11) {
        if (z10) {
            return;
        }
        uj ujVar = (uj) this.c;
        HashMap hashMap = (HashMap) this.a;
        ArrayList arrayList = (ArrayList) this.b;
        bi biVar = ujVar.b;
        if (hashMap.isEmpty() || ujVar.R == null || ujVar.L) {
            return;
        }
        ujVar.L = true;
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = hashMap.get(arrayList.get(i10));
            xy xyVar = new xy();
            arrayList2.add(xyVar);
            if (obj instanceof ye) {
                ye yeVar = (ye) obj;
                String str = yeVar.h;
                if (str != null) {
                    xyVar.c = str;
                } else {
                    xyVar.c = yeVar.I;
                }
                xyVar.e = yeVar.c;
                xyVar.f = yeVar.g;
                xyVar.k = yeVar.s;
                xyVar.o = yeVar.b;
                CharSequence charSequence = yeVar.a;
                xyVar.d = charSequence != null ? charSequence.toString() : null;
                xyVar.i = yeVar.n;
                xyVar.j = yeVar.r;
                xyVar.h = yeVar.x;
            }
        }
        t4.Z(biVar.E3, biVar.X0() + arrayList2.size(), biVar.b1(), new v2(i3, 2, ujVar, arrayList2, z11));
    }

    public void w(Canvas canvas, RectF rectF, int i3, float f10) {
        Paint[] paintArr = (Paint[]) this.a;
        Matrix matrix = (Matrix) this.c;
        if (f10 <= 0.0f) {
            return;
        }
        if (((LinearGradient) this.b) == null) {
            this.b = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{-65536, 16711680}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        }
        if (paintArr[i3] == null) {
            paintArr[i3] = new Paint(1);
            paintArr[i3].setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
        paintArr[i3].setShader((LinearGradient) this.b);
        matrix.reset();
        if (i3 == 0) {
            matrix.postScale(1.0f, rectF.width() / 16.0f);
            matrix.postRotate(-90.0f);
            matrix.postTranslate(rectF.left, rectF.top);
        } else if (i3 == 1) {
            matrix.postScale(1.0f, rectF.height() / 16.0f);
            matrix.postTranslate(rectF.left, rectF.top);
        } else if (i3 == 2) {
            matrix.postScale(1.0f, rectF.width() / 16.0f);
            matrix.postRotate(90.0f);
            matrix.postTranslate(rectF.right, rectF.top);
        } else if (i3 == 3) {
            matrix.postScale(1.0f, rectF.height() / 16.0f);
            matrix.postScale(1.0f, -1.0f);
            matrix.postTranslate(rectF.left, rectF.bottom);
        }
        ((LinearGradient) this.b).setLocalMatrix(matrix);
        paintArr[i3].setAlpha((int) (255.0f * f10));
        canvas.drawRect(rectF, paintArr[i3]);
    }

    public p2.m x(d2.n0 n0Var) {
        p2.e eVar;
        n0Var.b.getClass();
        f0 f0Var = n0Var.b.c;
        if (f0Var == null) {
            return p2.m.z;
        }
        synchronized (this.a) {
            try {
                if (!f0Var.equals((f0) this.b)) {
                    this.b = f0Var;
                    this.c = s(f0Var);
                }
                eVar = (p2.e) this.c;
                eVar.getClass();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }

    public ColorStateList y(int i3) {
        int resourceId;
        ColorStateList a10;
        TypedArray typedArray = (TypedArray) this.b;
        return (!typedArray.hasValue(i3) || (resourceId = typedArray.getResourceId(i3, 0)) == 0 || (a10 = oc.a((Context) this.a, resourceId)) == null) ? typedArray.getColorStateList(i3) : a10;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0063  */
    @Override // org.telegram.ui.Components.ki0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void z(View view, dh.n0 n0Var, boolean z10, boolean z11) {
        float f10;
        o0 o0Var;
        dh.l0 k10;
        float f11;
        int i3;
        float f12;
        wm wmVar = (wm) this.c;
        z H8 = wmVar.H8(((zi) this.a).f1(), true);
        float f13 = 0.0f;
        if (H8 instanceof q1) {
            o0 o0Var2 = ((q1) H8).O;
            dh.l0 k11 = o0Var2.k(n0Var);
            if (k11 == null) {
                f12 = 0.0f;
                f10 = f12;
                wmVar.Ab(H8, (zi) this.a, (li0) this.b, view, f13, f10, n0Var, false, (n0Var == null && n0Var.a) ? true : z10, z11, false);
            } else {
                f13 = o0Var2.b + k11.w + (k11.z / 2.0f);
                f11 = o0Var2.c + k11.x;
                i3 = k11.A;
            }
        } else if (!(H8 instanceof org.telegram.ui.Cells.t0) || (k10 = (o0Var = ((org.telegram.ui.Cells.t0) H8).F0).k(n0Var)) == null) {
            f10 = 0.0f;
            wmVar.Ab(H8, (zi) this.a, (li0) this.b, view, f13, f10, n0Var, false, (n0Var == null && n0Var.a) ? true : z10, z11, false);
        } else {
            f13 = o0Var.b + k10.w + (k10.z / 2.0f);
            f11 = o0Var.c + k10.x;
            i3 = k10.A;
        }
        f12 = f11 + (i3 / 2.0f);
        f10 = f12;
        wmVar.Ab(H8, (zi) this.a, (li0) this.b, view, f13, f10, n0Var, false, (n0Var == null && n0Var.a) ? true : z10, z11, false);
    }

    public /* synthetic */ j(boolean z10, Object obj, Object obj2, Object obj3) {
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public j(Context context) {
        this.a = context;
    }

    public j(int i3) {
        switch (i3) {
            case 24:
                this.a = new Paint[4];
                this.c = new Matrix();
                break;
            case 28:
                this.a = new Object();
                break;
            default:
                this.c = new HashMap();
                break;
        }
    }

    public j(View view) {
        this.c = view;
        y41 y41Var = new y41(this, view);
        this.a = y41Var;
        view.addOnLayoutChangeListener(y41Var);
    }

    public j(String str) {
        u uVar = new u();
        uVar.q = d2.u0.n("video/mp2t");
        uVar.r = d2.u0.n(str);
        this.a = new v(uVar);
    }

    public j(Context context, TypedArray typedArray) {
        this.a = context;
        this.b = typedArray;
    }

    @Override // org.telegram.ui.Components.ki0
    public /* synthetic */ void J() {
    }

    @Override // org.telegram.ui.zx0
    public /* synthetic */ void g() {
    }

    @Override // org.telegram.ui.zx0
    public /* synthetic */ void i() {
    }

    @Override // org.telegram.ui.rm0
    public void m() {
    }

    public j(e2.m... mVarArr) {
        x0 x0Var = new x0();
        e2.s sVar = new e2.s();
        sVar.c = 1.0f;
        sVar.d = 1.0f;
        e2.j jVar = e2.j.e;
        sVar.e = jVar;
        sVar.f = jVar;
        sVar.g = jVar;
        sVar.h = jVar;
        ByteBuffer byteBuffer = e2.m.a;
        sVar.k = byteBuffer;
        sVar.l = byteBuffer;
        sVar.b = -1;
        e2.m[] mVarArr2 = new e2.m[mVarArr.length + 2];
        this.a = mVarArr2;
        System.arraycopy(mVarArr, 0, mVarArr2, 0, mVarArr.length);
        this.b = x0Var;
        this.c = sVar;
        mVarArr2[mVarArr.length] = x0Var;
        mVarArr2[mVarArr.length + 1] = sVar;
    }

    @Override // org.telegram.ui.rm0
    public void u(Editable editable) {
    }

    @Override // org.telegram.ui.Components.ki0
    public /* synthetic */ void E(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i3, boolean z10) {
    }
}
