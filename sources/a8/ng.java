package a8;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.zip.Deflater;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ok;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.qy;
import org.telegram.ui.bh1;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public class ng implements c3.i, k9.t {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Object d;

    public /* synthetic */ ng(char c10, int i10) {
        this.a = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01e8, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01e0, code lost:
    
        if (r13.size() <= 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01e2, code lost:
    
        r0 = new n4.s(r13, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e9, code lost:
    
        if (r0 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01fb, code lost:
    
        if (r11 == 1) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01fe, code lost:
    
        if (r11 == 2) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0200, code lost:
    
        r16 = (int[]) r0.b;
        r17 = (float[]) r0.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x020e, code lost:
    
        if (r10 == 1) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0210, code lost:
    
        if (r10 == 2) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0212, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0225, code lost:
    
        r11 = new android.graphics.LinearGradient(r21, r22, r26, r27, r16, r17, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x026e, code lost:
    
        return new a8.ng(r11, (android.content.res.ColorStateList) null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x021f, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0222, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0229, code lost:
    
        r11 = new android.graphics.SweepGradient(r8, r9, (int[]) r0.b, (float[]) r0.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x023b, code lost:
    
        if (r25 <= 0.0f) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x023d, code lost:
    
        r20 = (int[]) r0.b;
        r21 = (float[]) r0.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x024c, code lost:
    
        if (r10 == 1) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x024f, code lost:
    
        if (r10 == 2) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0251, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0262, code lost:
    
        r11 = new android.graphics.RadialGradient(r8, r9, r25, r20, r21, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x025c, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x025f, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0276, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01ed, code lost:
    
        if (r20 == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ef, code lost:
    
        r0 = new n4.s(r6, r5, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01f5, code lost:
    
        r0 = new n4.s(r6, r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ng h(Resources resources, int i10, Resources.Theme theme) {
        int next;
        float f7;
        int i11;
        float f10;
        int i12;
        float f11;
        XmlResourceParser xml = resources.getXml(i10);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList b10 = h0.c.b(resources, xml, asAttributeSet, theme);
                return new ng((Shader) null, b10, b10.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray f12 = h0.b.f(resources, theme, asAttributeSet, d0.a.d);
        float f13 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null ? f12.getFloat(8, 0.0f) : 0.0f;
        float f14 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? f12.getFloat(9, 0.0f) : 0.0f;
        float f15 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? f12.getFloat(10, 0.0f) : 0.0f;
        float f16 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? f12.getFloat(11, 0.0f) : 0.0f;
        float f17 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? f12.getFloat(3, 0.0f) : 0.0f;
        float f18 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? f12.getFloat(4, 0.0f) : 0.0f;
        int i13 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", TeXSymbolParser.TYPE_ATTR) != null ? f12.getInt(2, 0) : 0;
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? f12.getColor(0, 0) : 0;
        boolean z10 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? f12.getColor(7, 0) : 0;
        if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null) {
            f7 = f13;
            i11 = f12.getColor(1, 0);
        } else {
            f7 = f13;
            i11 = 0;
        }
        if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null) {
            f10 = f14;
            i12 = f12.getInt(6, 0);
        } else {
            f10 = f14;
            i12 = 0;
        }
        float f19 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? f12.getFloat(5, 0.0f) : 0.0f;
        f12.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f20 = f19;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            float f21 = f15;
            if (next2 == 1) {
                f11 = f16;
                break;
            }
            int depth2 = xml.getDepth();
            f11 = f16;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray f22 = h0.b.f(resources, theme, asAttributeSet, d0.a.e);
                boolean hasValue = f22.hasValue(0);
                boolean hasValue2 = f22.hasValue(1);
                if (!hasValue || !hasValue2) {
                    break;
                }
                int color3 = f22.getColor(0, 0);
                float f23 = f22.getFloat(1, 0.0f);
                f22.recycle();
                arrayList2.add(Integer.valueOf(color3));
                arrayList.add(Float.valueOf(f23));
            }
            f15 = f21;
            f16 = f11;
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
    }

    public void A(int i10, long j10, Interpolator interpolator) {
        ValueAnimator valueAnimator = (ValueAnimator) this.c;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) this.c).cancel();
        }
        int[] iArr = new int[1];
        this.b = 0;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, i10);
        this.c = ofInt;
        ofInt.addUpdateListener(new bh.b0(24, this, iArr));
        ((ValueAnimator) this.c).addListener(new bi.x4(this, i10, iArr, 2));
        ((ValueAnimator) this.c).setDuration(j10);
        ((ValueAnimator) this.c).setInterpolator(interpolator);
        ((ValueAnimator) this.c).start();
    }

    public List B(CharSequence charSequence) {
        charSequence.getClass();
        za.c cVar = (za.c) this.d;
        cVar.getClass();
        e9.s sVar = new e9.s(cVar, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (sVar.hasNext()) {
            arrayList.add((String) sVar.next());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public void C(int i10, long j10, long j11) {
        u2.c0 c0Var = new u2.c0(1, i10, null, 3, null, e2.n0.h0(j10), e2.n0.h0(j11));
        u2.g0 g0Var = (u2.g0) this.c;
        g0Var.getClass();
        k(new qy(this, g0Var, c0Var, 12));
    }

    public void D(String str, l6.c cVar) {
        int i10 = this.b + 1;
        Object[] objArr = (Object[]) this.c;
        int length = objArr.length;
        int i11 = i10 + i10;
        if (i11 > length) {
            if (i11 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int i12 = length + (length >> 1) + 1;
            if (i12 < i11) {
                int highestOneBit = Integer.highestOneBit(i11 - 1);
                i12 = highestOneBit + highestOneBit;
            }
            if (i12 < 0) {
                i12 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            }
            this.c = Arrays.copyOf(objArr, i12);
        }
        Object[] objArr2 = (Object[]) this.c;
        int i13 = this.b;
        int i14 = i13 + i13;
        objArr2[i14] = str;
        objArr2[i14 + 1] = cVar;
        this.b = i13 + 1;
    }

    public void E(String str, com.google.android.gms.common.api.internal.l lVar) {
        Map map = (Map) this.c;
        if (map.containsKey(str)) {
            throw new IllegalArgumentException(a1.g.p("LifecycleCallback with tag ", str, " already added to this fragment."));
        }
        map.put(str, lVar);
        if (this.b > 0) {
            new com.google.android.gms.internal.cast.y(Looper.getMainLooper(), 4).post(new com.google.android.gms.common.api.internal.q1(this, lVar, str, 0));
        }
    }

    public byte[] F() {
        g0 g0Var;
        ka.d dVar;
        w7.j jVar;
        ka.d dVar2;
        y7.d0 d0Var;
        ka.d dVar3;
        switch (this.a) {
            case 0:
                sg sgVar = sg.c;
                m.r3 r3Var = (m.r3) this.c;
                ((ff) this.d).j = false;
                ff ffVar = (ff) this.d;
                ffVar.h = Boolean.FALSE;
                r3Var.a = new gf(ffVar);
                try {
                    sg.b();
                    sb sbVar = new sb(r3Var);
                    h0 h0Var = new h0(0);
                    sgVar.a(h0Var);
                    HashMap hashMap = new HashMap((HashMap) h0Var.b);
                    HashMap hashMap2 = new HashMap((HashMap) h0Var.c);
                    f0 f0Var = (f0) h0Var.d;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        g0Var = new g0(byteArrayOutputStream, hashMap, hashMap2, f0Var);
                        dVar = (ka.d) hashMap.get(sb.class);
                    } catch (IOException unused) {
                    }
                    if (dVar == null) {
                        throw new ka.b("No encoder for ".concat(String.valueOf(sb.class)));
                    }
                    dVar.a(sbVar, g0Var);
                    return byteArrayOutputStream.toByteArray();
                } catch (UnsupportedEncodingException e) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
                }
            case 25:
                w7.g9 g9Var = w7.g9.c;
                ti.e eVar = (ti.e) this.c;
                ((ff) this.d).j = false;
                ff ffVar2 = (ff) this.d;
                ffVar2.h = Boolean.FALSE;
                eVar.b = new w7.h8(ffVar2);
                try {
                    w7.g9.b();
                    w7.n6 n6Var = new w7.n6(eVar);
                    s4.d dVar4 = new s4.d(7);
                    g9Var.a(dVar4);
                    HashMap hashMap3 = new HashMap((HashMap) dVar4.b);
                    HashMap hashMap4 = new HashMap((HashMap) dVar4.c);
                    w7.i iVar = (w7.i) dVar4.d;
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        jVar = new w7.j(byteArrayOutputStream2, hashMap3, hashMap4, iVar);
                        dVar2 = (ka.d) hashMap3.get(w7.n6.class);
                    } catch (IOException unused2) {
                    }
                    if (dVar2 == null) {
                        throw new ka.b("No encoder for ".concat(String.valueOf(w7.n6.class)));
                    }
                    dVar2.a(n6Var, jVar);
                    return byteArrayOutputStream2.toByteArray();
                } catch (UnsupportedEncodingException e10) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e10);
                }
            default:
                y7.fa faVar = y7.fa.c;
                aa.m0 m0Var = (aa.m0) this.c;
                ((ff) this.d).j = false;
                ff ffVar3 = (ff) this.d;
                ffVar3.h = Boolean.FALSE;
                m0Var.a = new y7.g9(ffVar3);
                try {
                    y7.fa.b();
                    y7.n7 n7Var = new y7.n7(m0Var);
                    s4.d dVar5 = new s4.d(15);
                    faVar.a(dVar5);
                    HashMap hashMap5 = new HashMap((HashMap) dVar5.b);
                    HashMap hashMap6 = new HashMap((HashMap) dVar5.c);
                    y7.c0 c0Var = (y7.c0) dVar5.d;
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    try {
                        d0Var = new y7.d0(byteArrayOutputStream3, hashMap5, hashMap6, c0Var);
                        dVar3 = (ka.d) hashMap5.get(y7.n7.class);
                    } catch (IOException unused3) {
                    }
                    if (dVar3 == null) {
                        throw new ka.b("No encoder for ".concat(String.valueOf(y7.n7.class)));
                    }
                    dVar3.a(n7Var, d0Var);
                    return byteArrayOutputStream3.toByteArray();
                } catch (UnsupportedEncodingException e11) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e11);
                }
        }
    }

    public void G(Bundle bundle) {
        this.b = 1;
        this.d = bundle;
        for (Map.Entry entry : ((Map) this.c).entrySet()) {
            ((com.google.android.gms.common.api.internal.l) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public void H(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : ((Map) this.c).entrySet()) {
            Bundle bundle2 = new Bundle();
            ((com.google.android.gms.common.api.internal.l) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    public void a(int i10, int i11) {
        int i12 = (i11 << 16) + i10;
        boolean z10 = this.b != i12;
        this.b = i12;
        for (int i13 = 0; i13 < ag.k.y; i13++) {
            if (z10 || ((Bitmap[]) this.d)[i13] == null) {
                Bitmap bitmap = ((Bitmap[]) this.d)[i13];
                if (bitmap != null) {
                    Utilities.globalQueue.postRunnable(new a3.d(bitmap, 3));
                }
                ((Bitmap[]) this.d)[i13] = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
            }
            ag.i0[] i0VarArr = (ag.i0[]) this.c;
            if (i0VarArr[i13] == null) {
                i0VarArr[i13] = new ag.i0(i11 * i10 * 2);
            }
        }
    }

    public void b() {
        m.d3 d3Var;
        ImageView imageView = (ImageView) this.c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            m.l1.a(drawable);
        }
        if (drawable == null || (d3Var = (m.d3) this.d) == null) {
            return;
        }
        m.q.d(drawable, d3Var, imageView.getDrawableState());
    }

    public f9.x1 c(boolean z10) {
        f9.k0 k0Var;
        f9.k0 k0Var2;
        if (z10 && (k0Var2 = (f9.k0) this.d) != null) {
            throw k0Var2.a();
        }
        f9.x1 f7 = f9.x1.f(this.b, (Object[]) this.c, this);
        if (!z10 || (k0Var = (f9.k0) this.d) == null) {
            return f7;
        }
        throw k0Var.a();
    }

    public ua.b d() {
        if ("".isEmpty()) {
            return new ua.b((String) this.c, ((Long) this.d).longValue(), this.b);
        }
        throw new IllegalStateException("Missing required properties:".concat(""));
    }

    public f9.l0 e() {
        return c(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ae  */
    @Override // c3.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c3.h f(c3.p pVar, long j10) {
        switch (this.a) {
            case 9:
                long position = pVar.getPosition();
                long m10 = m(pVar);
                long i10 = pVar.i();
                pVar.j(Math.max(6, ((c3.u) this.c).c));
                long m11 = m(pVar);
                return (m10 > j10 || m11 <= j10) ? m11 <= j10 ? new c3.h(-2, m11, pVar.i()) : new c3.h(-1, m10, position) : new c3.h(0, -9223372036854775807L, i10);
            default:
                long position2 = pVar.getPosition();
                int min = (int) Math.min(112800, pVar.getLength() - position2);
                e2.x xVar = (e2.x) this.d;
                xVar.K(min);
                pVar.b(0, min, xVar.a);
                int i11 = xVar.c;
                long j11 = -1;
                long j12 = -1;
                long j13 = -9223372036854775807L;
                while (xVar.a() >= 188) {
                    byte[] bArr = xVar.a;
                    int i12 = xVar.b;
                    while (i12 < i11 && bArr[i12] != 71) {
                        i12++;
                    }
                    int i13 = i12 + 188;
                    if (i13 > i11) {
                        return j13 == -9223372036854775807L ? new c3.h(-2, j13, position2 + j11) : c3.h.d;
                    }
                    long a2 = cd.a(xVar, i12, this.b);
                    if (a2 != -9223372036854775807L) {
                        long b10 = ((e2.k0) this.c).b(a2);
                        if (b10 > j10) {
                            return j13 == -9223372036854775807L ? new c3.h(-1, b10, position2) : new c3.h(0, -9223372036854775807L, position2 + j12);
                        }
                        j13 = b10;
                        if (100000 + j13 > j10) {
                            return new c3.h(0, -9223372036854775807L, position2 + i12);
                        }
                        j12 = i12;
                    }
                    xVar.N(i13);
                    j11 = i13;
                }
                if (j13 == -9223372036854775807L) {
                }
        }
    }

    public void g(int i10) {
        int i11 = this.b;
        if (i10 == i11) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("Wrong data accessor type detected. ");
        sb2.append(i11 != 0 ? i11 != 1 ? "Unknown" : "ArrayBuffer" : "String");
        sb2.append(" expected, but got ");
        sb2.append(i10 != 0 ? i10 != 1 ? "Unknown" : "ArrayBuffer" : "String");
        throw new IllegalStateException(sb2.toString());
    }

    public void j(String str, Object... objArr) {
        if (this.b <= 3) {
            String str2 = (String) this.c;
            if (objArr.length > 0) {
                str = String.format(Locale.US, str, objArr);
            }
            Log.d(str2, ((String) this.d).concat(str));
        }
    }

    public void k(e2.j jVar) {
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            u2.j0 j0Var = (u2.j0) it.next();
            e2.n0.W(j0Var.a, new s9.g(13, jVar, j0Var.b));
        }
    }

    public void l(int i10, b2.x xVar, int i11, Object obj, long j10) {
        k(new bh1(17, this, new u2.c0(1, i10, xVar, i11, obj, e2.n0.h0(j10), -9223372036854775807L)));
    }

    public long m(c3.p pVar) {
        int d;
        c3.s sVar = (c3.s) this.d;
        c3.u uVar = (c3.u) this.c;
        while (pVar.i() < pVar.getLength() - 6) {
            int i10 = this.b;
            long i11 = pVar.i();
            e2.x xVar = new e2.x(17);
            int i12 = 0;
            boolean a2 = false;
            pVar.b(0, 2, xVar.a);
            if (xVar.g(0, ByteOrder.BIG_ENDIAN) != i10) {
                pVar.p();
                pVar.j((int) (i11 - pVar.getPosition()));
            } else {
                byte[] bArr = xVar.a;
                while (i12 < 15 && (d = pVar.d(2 + i12, 15 - i12, bArr)) != -1) {
                    i12 += d;
                }
                xVar.M(i12 + 2);
                pVar.p();
                pVar.j((int) (i11 - pVar.getPosition()));
                a2 = c3.b.a(xVar, uVar, i10, sVar);
            }
            if (a2) {
                break;
            }
            pVar.j(1);
        }
        if (pVar.i() < pVar.getLength() - 6) {
            return sVar.a;
        }
        pVar.j((int) (pVar.getLength() - pVar.i()));
        return uVar.j;
    }

    public Object n(int i10) {
        SparseArray sparseArray = (SparseArray) this.c;
        if (this.b == -1) {
            this.b = 0;
        }
        while (true) {
            int i11 = this.b;
            if (i11 <= 0 || i10 >= sparseArray.keyAt(i11)) {
                break;
            }
            this.b--;
        }
        while (this.b < sparseArray.size() - 1 && i10 >= sparseArray.keyAt(this.b + 1)) {
            this.b++;
        }
        return sparseArray.valueAt(this.b);
    }

    public boolean o() {
        ColorStateList colorStateList;
        return ((Shader) this.c) == null && (colorStateList = (ColorStateList) this.d) != null && colorStateList.isStateful();
    }

    @Override // k9.t
    public void onSuccess(Object obj) {
        List list = (List) obj;
        m4.f0 f0Var = ((m4.p0) this.d).g;
        Handler handler = f0Var.l;
        m4.w wVar = (m4.w) this.c;
        e2.n0.W(handler, new k2.e0(f0Var, wVar, new ai.h1(this, this.b, list, wVar, 9)));
    }

    public void p(u2.u uVar, int i10, int i11, b2.x xVar, int i12, Object obj, long j10, long j11) {
        k(new u2.i0(this, uVar, new u2.c0(i10, i11, xVar, i12, obj, e2.n0.h0(j10), e2.n0.h0(j11)), 1));
    }

    public void q(u2.u uVar, int i10, int i11, b2.x xVar, int i12, Object obj, long j10, long j11) {
        k(new u2.i0(this, uVar, new u2.c0(i10, i11, xVar, i12, obj, e2.n0.h0(j10), e2.n0.h0(j11)), 0));
    }

    public void r(u2.u uVar, int i10, int i11, b2.x xVar, int i12, Object obj, long j10, long j11, IOException iOException, boolean z10) {
        k(new ok(this, uVar, new u2.c0(i10, i11, xVar, i12, obj, e2.n0.h0(j10), e2.n0.h0(j11)), iOException, z10));
    }

    public void s(u2.u uVar, int i10, IOException iOException, boolean z10) {
        r(uVar, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z10);
    }

    public void t(AttributeSet attributeSet, int i10) {
        int resourceId;
        ImageView imageView = (ImageView) this.c;
        Context context = imageView.getContext();
        int[] iArr = f.a.f;
        k6.c D = k6.c.D(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) D.c;
        r0.i0.j(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) D.c, i10);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = kc.b(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                m.l1.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(D.v(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(m.l1.b(typedArray.getInt(3, -1), null));
            }
            D.E();
        } catch (Throwable th2) {
            D.E();
            throw th2;
        }
    }

    public void u(u2.u uVar, int i10, int i11, b2.x xVar, int i12, Object obj, long j10, long j11, int i13) {
        k(new ag.k0(this, uVar, new u2.c0(i10, i11, xVar, i12, obj, e2.n0.h0(j10), e2.n0.h0(j11)), i13, 10));
    }

    public ng w(Object obj, Object obj2) {
        int i10 = (this.b + 1) * 2;
        Object[] objArr = (Object[]) this.c;
        if (i10 > objArr.length) {
            this.c = Arrays.copyOf(objArr, f9.c0.b(objArr.length, i10));
        }
        f9.o.e(obj, obj2);
        Object[] objArr2 = (Object[]) this.c;
        int i11 = this.b;
        int i12 = i11 * 2;
        objArr2[i12] = obj;
        objArr2[i12 + 1] = obj2;
        this.b = i11 + 1;
        return this;
    }

    public ng x(Iterable iterable) {
        if (iterable instanceof Collection) {
            int size = (((Collection) iterable).size() + this.b) * 2;
            Object[] objArr = (Object[]) this.c;
            if (size > objArr.length) {
                this.c = Arrays.copyOf(objArr, f9.c0.b(objArr.length, size));
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            w(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public void y(int i10) {
        A(i10, 200L, ds.f);
    }

    @Override // c3.i
    public void z() {
        switch (this.a) {
            case 9:
                break;
            default:
                e2.x xVar = (e2.x) this.d;
                byte[] bArr = e2.n0.b;
                xVar.getClass();
                xVar.L(bArr.length, bArr);
                break;
        }
    }

    public ng(int i10, int i11) {
        this.a = i11;
        switch (i11) {
            case 7:
                this.c = new Object[i10 * 2];
                this.b = 0;
                break;
            default:
                this.b = i10;
                break;
        }
    }

    public ng(aa.m0 m0Var, int i10) {
        this.a = 26;
        this.d = new ff();
        this.c = m0Var;
        y7.fa.b();
        this.b = i10;
    }

    public ng(String str, String[] strArr) {
        String sb2;
        this.a = 19;
        if (strArr.length == 0) {
            sb2 = "";
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append('[');
            for (String str2 : strArr) {
                if (sb3.length() > 1) {
                    sb3.append(",");
                }
                sb3.append(str2);
            }
            sb3.append("] ");
            sb2 = sb3.toString();
        }
        this.d = sb2;
        this.c = str;
        int i10 = 2;
        o6.l.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        while (i10 <= 7 && !Log.isLoggable((String) this.c, i10)) {
            i10++;
        }
        this.b = i10;
    }

    public ng(m.r3 r3Var, int i10) {
        this.a = 0;
        this.d = new ff();
        this.c = r3Var;
        sg.b();
        this.b = i10;
    }

    private final /* synthetic */ void v() {
    }

    public ng(ti.e eVar, int i10) {
        this.a = 25;
        this.d = new ff();
        this.c = eVar;
        w7.g9.b();
        this.b = i10;
    }

    @Override // k9.t
    public void i(Throwable th2) {
    }

    public ng(nm0 nm0Var) {
        this.a = 18;
        this.d = nm0Var;
    }

    public ng(ByteBuffer byteBuffer, int i10, RectF rectF) {
        this.a = 20;
        this.c = rectF;
        this.b = i10;
        try {
            this.d = File.createTempFile("paint", ".bin", ApplicationLoader.applicationContext.getCacheDir());
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (((File) this.d) == null) {
            return;
        }
        try {
            byte[] array = byteBuffer.array();
            FileOutputStream fileOutputStream = new FileOutputStream((File) this.d);
            Deflater deflater = new Deflater(1, true);
            deflater.setInput(array, byteBuffer.arrayOffset(), byteBuffer.remaining());
            deflater.finish();
            byte[] bArr = new byte[1024];
            while (!deflater.finished()) {
                fileOutputStream.write(bArr, 0, deflater.deflate(bArr));
            }
            deflater.end();
            fileOutputStream.close();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public ng(ImageView imageView) {
        this.a = 14;
        this.b = 0;
        this.c = imageView;
    }

    public ng(s0.b bVar) {
        this.a = 22;
        this.c = new SparseArray();
        this.d = bVar;
        this.b = -1;
    }

    public ng(Shader shader, ColorStateList colorStateList, int i10) {
        this.a = 8;
        this.c = shader;
        this.d = colorStateList;
        this.b = i10;
    }

    public ng(String str) {
        this.a = 2;
        this.c = str;
        this.d = null;
        this.b = 0;
    }

    public ng(c3.u uVar, int i10) {
        this.a = 9;
        this.c = uVar;
        this.b = i10;
        this.d = new c3.s();
    }

    public ng(int i10, e2.k0 k0Var) {
        this.a = 12;
        this.b = i10;
        this.c = k0Var;
        this.d = new e2.x();
    }

    public ng(byte[] bArr) {
        this.a = 2;
        Objects.requireNonNull(bArr);
        this.d = bArr;
        this.c = null;
        this.b = 1;
    }

    public ng(g2.g gVar) {
        this.a = 13;
        d5.f fVar = new d5.f();
        fVar.c = new qb.a(28);
        fVar.a = 3;
        this.d = fVar;
        this.c = gVar;
        this.b = 1;
    }

    public ng(za.c cVar) {
        this.a = 6;
        e9.b bVar = e9.b.f;
        this.d = cVar;
        this.c = bVar;
        this.b = ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    public ng(CopyOnWriteArrayList copyOnWriteArrayList, int i10, u2.g0 g0Var) {
        this.a = 21;
        this.d = copyOnWriteArrayList;
        this.b = i10;
        this.c = g0Var;
    }

    public ng(int i10, byte b10) {
        this.a = i10;
        switch (i10) {
            case 3:
                this.c = DesugarCollections.synchronizedMap(new a0.f(0));
                this.b = 0;
                break;
            case 16:
                this.c = new ih.a();
                break;
            case 23:
                this.c = new Object[8];
                this.b = 0;
                break;
            default:
                int i11 = ag.k.y;
                this.c = new ag.i0[i11];
                this.d = new Bitmap[i11];
                break;
        }
    }

    public ng(b2.x xVar, int i10, String str) {
        this.a = 11;
        this.c = xVar;
        this.b = i10;
        this.d = str;
    }

    public ng(m4.p0 p0Var, m4.w wVar, int i10) {
        this.a = 15;
        this.d = p0Var;
        this.c = wVar;
        this.b = i10;
    }
}
