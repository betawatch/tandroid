package b8;

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
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.zip.Deflater;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.hr;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.na1;
import org.telegram.ui.ul;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class kg implements e3.i, l9.t {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Object d;

    public /* synthetic */ kg(char c2, int i3) {
        this.a = i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x021b, code lost:
    
        r0 = new p4.q();
        r0.a = new int[]{r6, r5, r12};
        r0.b = new float[]{0.0f, 0.5f, 1.0f};
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x022f, code lost:
    
        r0 = new p4.q();
        r0.a = new int[]{r6, r12};
        r15 = 2;
        r0.b = new float[]{0.0f, 1.0f};
        r14 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0213, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01da, code lost:
    
        if (r13.size() <= 0) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01dc, code lost:
    
        r0 = new p4.q();
        r1 = r13.size();
        r0.a = new int[r1];
        r0.b = new float[r1];
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01ee, code lost:
    
        if (r2 >= r1) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01f0, code lost:
    
        ((int[]) r0.a)[r2] = ((java.lang.Integer) r13.get(r2)).intValue();
        ((float[]) r0.b)[r2] = ((java.lang.Float) r7.get(r2)).floatValue();
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0214, code lost:
    
        if (r0 == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0216, code lost:
    
        r14 = 1;
        r15 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0243, code lost:
    
        if (r11 == r14) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0245, code lost:
    
        if (r11 == r15) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0247, code lost:
    
        r16 = (int[]) r0.a;
        r17 = (float[]) r0.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0255, code lost:
    
        if (r10 == r14) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0257, code lost:
    
        if (r10 == r15) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0259, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x026c, code lost:
    
        r11 = new android.graphics.LinearGradient(r21, r22, r26, r27, r16, r17, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x02b5, code lost:
    
        return new b8.kg(r11, (android.content.res.ColorStateList) null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0266, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0269, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0270, code lost:
    
        r11 = new android.graphics.SweepGradient(r8, r9, (int[]) r0.a, (float[]) r0.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0282, code lost:
    
        if (r25 <= 0.0f) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0284, code lost:
    
        r20 = (int[]) r0.a;
        r21 = (float[]) r0.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0293, code lost:
    
        if (r10 == 1) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0296, code lost:
    
        if (r10 == 2) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0298, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02a9, code lost:
    
        r11 = new android.graphics.RadialGradient(r8, r9, r25, r20, r21, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x02a3, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x02a6, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02bd, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0219, code lost:
    
        if (r20 == false) goto L101;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static kg i(Resources resources, int i3, Resources.Theme theme) {
        int next;
        float f10;
        int i10;
        float f11;
        int i11;
        float f12;
        XmlResourceParser xml = resources.getXml(i3);
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
                return new kg((Shader) null, b10, b10.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray f13 = h0.b.f(resources, theme, asAttributeSet, d0.a.d);
        float f14 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null ? f13.getFloat(8, 0.0f) : 0.0f;
        float f15 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? f13.getFloat(9, 0.0f) : 0.0f;
        float f16 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? f13.getFloat(10, 0.0f) : 0.0f;
        float f17 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? f13.getFloat(11, 0.0f) : 0.0f;
        float f18 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? f13.getFloat(3, 0.0f) : 0.0f;
        float f19 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? f13.getFloat(4, 0.0f) : 0.0f;
        int i12 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", TeXSymbolParser.TYPE_ATTR) != null ? f13.getInt(2, 0) : 0;
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? f13.getColor(0, 0) : 0;
        boolean z10 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? f13.getColor(7, 0) : 0;
        if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null) {
            f10 = f14;
            i10 = f13.getColor(1, 0);
        } else {
            f10 = f14;
            i10 = 0;
        }
        if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null) {
            f11 = f15;
            i11 = f13.getInt(6, 0);
        } else {
            f11 = f15;
            i11 = 0;
        }
        float f20 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? f13.getFloat(5, 0.0f) : 0.0f;
        f13.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f21 = f20;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            float f22 = f16;
            if (next2 == 1) {
                f12 = f17;
                break;
            }
            int depth2 = xml.getDepth();
            f12 = f17;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray f23 = h0.b.f(resources, theme, asAttributeSet, d0.a.e);
                boolean hasValue = f23.hasValue(0);
                boolean hasValue2 = f23.hasValue(1);
                if (!hasValue || !hasValue2) {
                    break;
                }
                int color3 = f23.getColor(0, 0);
                float f24 = f23.getFloat(1, 0.0f);
                f23.recycle();
                arrayList2.add(Integer.valueOf(color3));
                arrayList.add(Float.valueOf(f24));
            }
            f16 = f22;
            f17 = f12;
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
    }

    public List A(CharSequence charSequence) {
        charSequence.getClass();
        bb.c cVar = (bb.c) this.d;
        cVar.getClass();
        f9.s sVar = new f9.s(cVar, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (sVar.hasNext()) {
            arrayList.add((String) sVar.next());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public void B(long j10, int i3, long j11) {
        w2.c0 c0Var = new w2.c0(1, i3, null, 3, null, g2.n0.h0(j10), g2.n0.h0(j11));
        w2.g0 g0Var = (w2.g0) this.c;
        g0Var.getClass();
        j(new hr(this, g0Var, c0Var, 13));
    }

    public void C(String str, m6.c cVar) {
        int i3 = this.b + 1;
        Object[] objArr = (Object[]) this.c;
        int length = objArr.length;
        int i10 = i3 + i3;
        if (i10 > length) {
            if (i10 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int i11 = length + (length >> 1) + 1;
            if (i11 < i10) {
                int highestOneBit = Integer.highestOneBit(i10 - 1);
                i11 = highestOneBit + highestOneBit;
            }
            if (i11 < 0) {
                i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            }
            this.c = Arrays.copyOf(objArr, i11);
        }
        Object[] objArr2 = (Object[]) this.c;
        int i12 = this.b;
        int i13 = i12 + i12;
        objArr2[i13] = str;
        objArr2[i13 + 1] = cVar;
        this.b = i12 + 1;
    }

    public void D(String str, com.google.android.gms.common.api.internal.k kVar) {
        Map map = (Map) this.c;
        if (map.containsKey(str)) {
            throw new IllegalArgumentException(org.telegram.ui.Cells.f1.r("LifecycleCallback with tag ", str, " already added to this fragment.", new StringBuilder(str.length() + 59)));
        }
        map.put(str, kVar);
        if (this.b > 0) {
            new com.google.android.gms.internal.cast.z(Looper.getMainLooper(), 4).post(new com.google.android.gms.common.api.internal.j1(this, kVar, str, 0));
        }
    }

    public void E(Bundle bundle) {
        this.b = 1;
        this.d = bundle;
        for (Map.Entry entry : ((Map) this.c).entrySet()) {
            ((com.google.android.gms.common.api.internal.k) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public byte[] F() {
        g0 g0Var;
        ma.d dVar;
        x7.j jVar;
        ma.d dVar2;
        z7.d0 d0Var;
        ma.d dVar3;
        switch (this.a) {
            case 0:
                pg pgVar = pg.c;
                fa.f fVar = (fa.f) this.c;
                ((df) this.d).h = false;
                df dfVar = (df) this.d;
                dfVar.f = Boolean.FALSE;
                fVar.b = new ef(dfVar);
                try {
                    pg.b();
                    pb pbVar = new pb(fVar);
                    android.support.v4.media.session.a0 a0Var = new android.support.v4.media.session.a0(6);
                    pgVar.a(a0Var);
                    HashMap hashMap = new HashMap((HashMap) a0Var.b);
                    HashMap hashMap2 = new HashMap((HashMap) a0Var.c);
                    f0 f0Var = (f0) a0Var.d;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        g0Var = new g0(byteArrayOutputStream, hashMap, hashMap2, f0Var);
                        dVar = (ma.d) hashMap.get(pb.class);
                    } catch (IOException unused) {
                    }
                    if (dVar == null) {
                        throw new ma.b("No encoder for ".concat(String.valueOf(pb.class)));
                    }
                    dVar.a(pbVar, g0Var);
                    return byteArrayOutputStream.toByteArray();
                } catch (UnsupportedEncodingException e10) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e10);
                }
            case 26:
                x7.e9 e9Var = x7.e9.c;
                za.p pVar = (za.p) this.c;
                ((df) this.d).h = false;
                df dfVar2 = (df) this.d;
                dfVar2.f = Boolean.FALSE;
                pVar.a = new x7.f8(dfVar2);
                try {
                    x7.e9.b();
                    x7.l6 l6Var = new x7.l6(pVar);
                    p7.d dVar4 = new p7.d(20);
                    e9Var.a(dVar4);
                    HashMap hashMap3 = new HashMap((HashMap) dVar4.b);
                    HashMap hashMap4 = new HashMap((HashMap) dVar4.d);
                    x7.i iVar = (x7.i) dVar4.c;
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        jVar = new x7.j(byteArrayOutputStream2, hashMap3, hashMap4, iVar);
                        dVar2 = (ma.d) hashMap3.get(x7.l6.class);
                    } catch (IOException unused2) {
                    }
                    if (dVar2 == null) {
                        throw new ma.b("No encoder for ".concat(String.valueOf(x7.l6.class)));
                    }
                    dVar2.a(l6Var, jVar);
                    return byteArrayOutputStream2.toByteArray();
                } catch (UnsupportedEncodingException e11) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e11);
                }
            default:
                z7.ga gaVar = z7.ga.c;
                l2.e eVar = (l2.e) this.c;
                ((df) this.d).h = false;
                df dfVar3 = (df) this.d;
                dfVar3.f = Boolean.FALSE;
                eVar.a = new z7.h9(dfVar3);
                try {
                    z7.ga.b();
                    z7.o7 o7Var = new z7.o7(eVar);
                    p7.d dVar5 = new p7.d(28);
                    gaVar.a(dVar5);
                    HashMap hashMap5 = new HashMap((HashMap) dVar5.b);
                    HashMap hashMap6 = new HashMap((HashMap) dVar5.d);
                    z7.c0 c0Var = (z7.c0) dVar5.c;
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    try {
                        d0Var = new z7.d0(byteArrayOutputStream3, hashMap5, hashMap6, c0Var);
                        dVar3 = (ma.d) hashMap5.get(z7.o7.class);
                    } catch (IOException unused3) {
                    }
                    if (dVar3 == null) {
                        throw new ma.b("No encoder for ".concat(String.valueOf(z7.o7.class)));
                    }
                    dVar3.a(o7Var, d0Var);
                    return byteArrayOutputStream3.toByteArray();
                } catch (UnsupportedEncodingException e12) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e12);
                }
        }
    }

    public void G(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : ((Map) this.c).entrySet()) {
            Bundle bundle2 = new Bundle();
            ((com.google.android.gms.common.api.internal.k) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // e3.i
    public e3.h a(e3.p pVar, long j10) {
        long j11;
        switch (this.a) {
            case 11:
                long position = pVar.getPosition();
                long l10 = l(pVar);
                long k10 = pVar.k();
                pVar.n(Math.max(6, ((e3.u) this.c).c));
                long l11 = l(pVar);
                return (l10 > j10 || l11 <= j10) ? l11 <= j10 ? new e3.h(l11, -2, pVar.k()) : new e3.h(l10, -1, position) : new e3.h(-9223372036854775807L, 0, k10);
            default:
                long position2 = pVar.getPosition();
                int min = (int) Math.min(112800, pVar.getLength() - position2);
                g2.y yVar = (g2.y) this.d;
                yVar.K(min);
                pVar.c(0, min, yVar.a);
                int i3 = yVar.c;
                long j12 = -1;
                long j13 = -1;
                long j14 = -9223372036854775807L;
                while (true) {
                    if (yVar.a() >= 188) {
                        byte[] bArr = yVar.a;
                        int i10 = yVar.b;
                        while (true) {
                            if (i10 < i3) {
                                j11 = -9223372036854775807L;
                                if (bArr[i10] != 71) {
                                    i10++;
                                }
                            } else {
                                j11 = -9223372036854775807L;
                            }
                        }
                        int i11 = i10 + hs.S2;
                        if (i11 <= i3) {
                            long a10 = ud.a(yVar, i10, this.b);
                            if (a10 != j11) {
                                long b10 = ((g2.l0) this.c).b(a10);
                                if (b10 > j10) {
                                    return j14 == j11 ? new e3.h(b10, -1, position2) : new e3.h(-9223372036854775807L, 0, position2 + j13);
                                }
                                if (100000 + b10 > j10) {
                                    return new e3.h(-9223372036854775807L, 0, position2 + i10);
                                }
                                j14 = b10;
                                j13 = i10;
                            }
                            yVar.N(i11);
                            j12 = i11;
                        }
                    } else {
                        j11 = -9223372036854775807L;
                    }
                }
                return j14 != j11 ? new e3.h(j14, -2, position2 + j12) : e3.h.d;
        }
    }

    @Override // e3.i
    public void b() {
        switch (this.a) {
            case 11:
                break;
            default:
                g2.y yVar = (g2.y) this.d;
                byte[] bArr = g2.n0.b;
                yVar.getClass();
                yVar.L(bArr.length, bArr);
                break;
        }
    }

    public void c(int i3, int i10) {
        int i11 = (i10 << 16) + i3;
        boolean z10 = this.b != i11;
        this.b = i11;
        for (int i12 = 0; i12 < cg.h.y; i12++) {
            if (z10 || ((Bitmap[]) this.d)[i12] == null) {
                Bitmap bitmap = ((Bitmap[]) this.d)[i12];
                if (bitmap != null) {
                    Utilities.e.c(new ai.s(bitmap, 22));
                }
                ((Bitmap[]) this.d)[i12] = Bitmap.createBitmap(i10, i3, Bitmap.Config.ARGB_8888);
            }
            cg.c0[] c0VarArr = (cg.c0[]) this.c;
            if (c0VarArr[i12] == null) {
                c0VarArr[i12] = new cg.c0(i10 * i3 * 2);
            }
        }
    }

    public void d() {
        m.b3 b3Var;
        ImageView imageView = (ImageView) this.c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            m.l1.a(drawable);
        }
        if (drawable == null || (b3Var = (m.b3) this.d) == null) {
            return;
        }
        m.q.d(drawable, b3Var, imageView.getDrawableState());
    }

    public g9.x1 e(boolean z10) {
        g9.k0 k0Var;
        g9.k0 k0Var2;
        if (z10 && (k0Var2 = (g9.k0) this.d) != null) {
            throw k0Var2.a();
        }
        g9.x1 g7 = g9.x1.g(this.b, (Object[]) this.c, this);
        if (!z10 || (k0Var = (g9.k0) this.d) == null) {
            return g7;
        }
        throw k0Var.a();
    }

    public g9.l0 f() {
        return e(false);
    }

    public void g(int i3) {
        int i10 = this.b;
        if (i3 == i10) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("Wrong data accessor type detected. ");
        sb2.append(i10 != 0 ? i10 != 1 ? "Unknown" : "ArrayBuffer" : "String");
        sb2.append(" expected, but got ");
        sb2.append(i3 != 0 ? i3 != 1 ? "Unknown" : "ArrayBuffer" : "String");
        throw new IllegalStateException(sb2.toString());
    }

    public void j(g2.k kVar) {
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            w2.j0 j0Var = (w2.j0) it.next();
            g2.n0.W(j0Var.a, new u9.a(14, kVar, j0Var.b));
        }
    }

    public void k(int i3, d2.v vVar, int i10, Object obj, long j10) {
        j(new na1(20, this, new w2.c0(1, i3, vVar, i10, obj, g2.n0.h0(j10), -9223372036854775807L)));
    }

    public long l(e3.p pVar) {
        int e10;
        e3.s sVar = (e3.s) this.d;
        e3.u uVar = (e3.u) this.c;
        while (pVar.k() < pVar.getLength() - 6) {
            int i3 = this.b;
            long k10 = pVar.k();
            g2.y yVar = new g2.y(17);
            int i10 = 0;
            boolean a10 = false;
            pVar.c(0, 2, yVar.a);
            if (yVar.g(0, ByteOrder.BIG_ENDIAN) != i3) {
                pVar.o();
                pVar.n((int) (k10 - pVar.getPosition()));
            } else {
                byte[] bArr = yVar.a;
                while (i10 < 15 && (e10 = pVar.e(2 + i10, 15 - i10, bArr)) != -1) {
                    i10 += e10;
                }
                yVar.M(i10 + 2);
                pVar.o();
                pVar.n((int) (k10 - pVar.getPosition()));
                a10 = e3.b.a(yVar, uVar, i3, sVar);
            }
            if (a10) {
                break;
            }
            pVar.n(1);
        }
        if (pVar.k() < pVar.getLength() - 6) {
            return sVar.a;
        }
        pVar.n((int) (pVar.getLength() - pVar.k()));
        return uVar.j;
    }

    public Object m(int i3) {
        SparseArray sparseArray = (SparseArray) this.c;
        if (this.b == -1) {
            this.b = 0;
        }
        while (true) {
            int i10 = this.b;
            if (i10 <= 0 || i3 >= sparseArray.keyAt(i10)) {
                break;
            }
            this.b--;
        }
        while (this.b < sparseArray.size() - 1 && i3 >= sparseArray.keyAt(this.b + 1)) {
            this.b++;
        }
        return sparseArray.valueAt(this.b);
    }

    public String n() {
        StringBuilder sb2 = new StringBuilder("$");
        int i3 = this.b + 1;
        for (int i10 = 0; i10 < i3; i10++) {
            Object obj = ((Object[]) this.c)[i10];
            if (obj instanceof je.d) {
                je.d dVar = (je.d) obj;
                if (!kotlin.jvm.internal.j.a(dVar.e(), je.f.c)) {
                    int i11 = ((int[]) this.d)[i10];
                    if (i11 >= 0) {
                        sb2.append(".");
                        sb2.append(dVar.g(i11));
                    }
                } else if (((int[]) this.d)[i10] != -1) {
                    sb2.append("[");
                    sb2.append(((int[]) this.d)[i10]);
                    sb2.append("]");
                }
            } else if (obj != ne.g.a) {
                sb2.append("['");
                sb2.append(obj);
                sb2.append("']");
            }
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.j.d(sb3, "toString(...)");
        return sb3;
    }

    public boolean o() {
        ColorStateList colorStateList;
        return ((Shader) this.c) == null && (colorStateList = (ColorStateList) this.d) != null && colorStateList.isStateful();
    }

    @Override // l9.t
    public void onSuccess(Object obj) {
        List list = (List) obj;
        o4.e0 e0Var = ((o4.o0) this.d).h;
        Handler handler = e0Var.l;
        o4.v vVar = (o4.v) this.c;
        g2.n0.W(handler, new m2.s(e0Var, vVar, new bi.q0(this, this.b, list, vVar, 10)));
    }

    public void p(w2.u uVar, int i3, int i10, d2.v vVar, int i11, Object obj, long j10, long j11) {
        j(new w2.i0(this, uVar, new w2.c0(i3, i10, vVar, i11, obj, g2.n0.h0(j10), g2.n0.h0(j11)), 1));
    }

    public void q(w2.u uVar, int i3, int i10, d2.v vVar, int i11, Object obj, long j10, long j11) {
        j(new w2.i0(this, uVar, new w2.c0(i3, i10, vVar, i11, obj, g2.n0.h0(j10), g2.n0.h0(j11)), 0));
    }

    public void r(w2.u uVar, int i3, int i10, d2.v vVar, int i11, Object obj, long j10, long j11, IOException iOException, boolean z10) {
        j(new ul(this, uVar, new w2.c0(i3, i10, vVar, i11, obj, g2.n0.h0(j10), g2.n0.h0(j11)), iOException, z10));
    }

    public void s(w2.u uVar, int i3, IOException iOException, boolean z10) {
        r(uVar, i3, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z10);
    }

    public void t(AttributeSet attributeSet, int i3) {
        int resourceId;
        ImageView imageView = (ImageView) this.c;
        Context context = imageView.getContext();
        int[] iArr = f.a.f;
        k4.j F = k4.j.F(context, attributeSet, iArr, i3);
        TypedArray typedArray = (TypedArray) F.b;
        r0.i0.i(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) F.b, i3);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = oc.b(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                m.l1.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(F.y(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(m.l1.b(typedArray.getInt(3, -1), null));
            }
            F.H();
        } catch (Throwable th2) {
            F.H();
            throw th2;
        }
    }

    public String toString() {
        switch (this.a) {
            case 16:
                return n();
            default:
                return super.toString();
        }
    }

    public void u(w2.u uVar, int i3, int i10, d2.v vVar, int i11, Object obj, long j10, long j11, int i12) {
        j(new cg.e0(this, uVar, new w2.c0(i3, i10, vVar, i11, obj, g2.n0.h0(j10), g2.n0.h0(j11)), i12, 10));
    }

    public kg w(Object obj, Object obj2) {
        int i3 = (this.b + 1) * 2;
        Object[] objArr = (Object[]) this.c;
        if (i3 > objArr.length) {
            this.c = Arrays.copyOf(objArr, g9.c0.b(objArr.length, i3));
        }
        g9.o.f(obj, obj2);
        Object[] objArr2 = (Object[]) this.c;
        int i10 = this.b;
        int i11 = i10 * 2;
        objArr2[i11] = obj;
        objArr2[i11 + 1] = obj2;
        this.b = i10 + 1;
        return this;
    }

    public kg x(Iterable iterable) {
        if (iterable instanceof Collection) {
            int size = (((Collection) iterable).size() + this.b) * 2;
            Object[] objArr = (Object[]) this.c;
            if (size > objArr.length) {
                this.c = Arrays.copyOf(objArr, g9.c0.b(objArr.length, size));
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            w(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public void y(int i3) {
        z(i3, 200L, xq.f);
    }

    public void z(int i3, long j10, Interpolator interpolator) {
        ValueAnimator valueAnimator = (ValueAnimator) this.c;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) this.c).cancel();
        }
        int[] iArr = new int[1];
        this.b = 0;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, i3);
        this.c = ofInt;
        ofInt.addUpdateListener(new ci.uc(24, this, iArr));
        ((ValueAnimator) this.c).addListener(new ci.h4(this, i3, iArr, 2));
        ((ValueAnimator) this.c).setDuration(j10);
        ((ValueAnimator) this.c).setInterpolator(interpolator);
        ((ValueAnimator) this.c).start();
    }

    public kg(int i3, int i10) {
        this.a = i10;
        switch (i10) {
            case 8:
                this.c = new Object[i3 * 2];
                this.b = 0;
                break;
            default:
                this.b = i3;
                break;
        }
    }

    public kg(int i3, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.a = 6;
        this.b = i3;
        this.d = str;
        this.c = arrayList;
    }

    public kg(fa.f fVar, int i3) {
        this.a = 0;
        this.d = new df();
        this.c = fVar;
        pg.b();
        this.b = i3;
    }

    public kg(l2.e eVar, int i3) {
        this.a = 27;
        this.d = new df();
        this.c = eVar;
        z7.ga.b();
        this.b = i3;
    }

    public kg(za.p pVar, int i3) {
        this.a = 26;
        this.d = new df();
        this.c = pVar;
        x7.e9.b();
        this.b = i3;
    }

    public kg(tj0 tj0Var) {
        this.a = 20;
        this.d = tj0Var;
    }

    public kg(ByteBuffer byteBuffer, int i3, RectF rectF) {
        this.a = 22;
        this.c = rectF;
        this.b = i3;
        try {
            this.d = File.createTempFile("paint", ".bin", org.telegram.messenger.t0.b.getCacheDir());
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
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
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    private final /* synthetic */ void v() {
    }

    @Override // l9.t
    public void h(Throwable th2) {
    }

    public kg(ImageView imageView) {
        this.a = 14;
        this.b = 0;
        this.c = imageView;
    }

    public kg(u9.j jVar) {
        this.a = 25;
        this.c = new SparseArray();
        this.d = jVar;
        this.b = -1;
    }

    public kg(Shader shader, ColorStateList colorStateList, int i3) {
        this.a = 9;
        this.c = shader;
        this.d = colorStateList;
        this.b = i3;
    }

    public kg(String str) {
        this.a = 1;
        this.c = str;
        this.d = null;
        this.b = 0;
    }

    public kg(e3.u uVar, int i3) {
        this.a = 11;
        this.c = uVar;
        this.b = i3;
        this.d = new e3.s();
    }

    public kg(int i3, g2.l0 l0Var) {
        this.a = 13;
        this.b = i3;
        this.c = l0Var;
        this.d = new g2.y();
    }

    public kg(byte[] bArr) {
        this.a = 1;
        Objects.requireNonNull(bArr);
        this.d = bArr;
        this.c = null;
        this.b = 1;
    }

    public kg(i2.g gVar) {
        this.a = 15;
        cg.v0 v0Var = new cg.v0();
        v0Var.c = new mb.b(4);
        v0Var.b = 3;
        this.d = v0Var;
        this.c = gVar;
        this.b = 1;
    }

    public kg(bb.c cVar) {
        this.a = 7;
        f9.b bVar = f9.b.f;
        this.d = cVar;
        this.c = bVar;
        this.b = ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    public kg(CopyOnWriteArrayList copyOnWriteArrayList, int i3, w2.g0 g0Var) {
        this.a = 24;
        this.d = copyOnWriteArrayList;
        this.b = i3;
        this.c = g0Var;
    }

    public kg(int i3, byte b10) {
        this.a = i3;
        switch (i3) {
            case 3:
                this.c = DesugarCollections.synchronizedMap(new a0.f(0));
                this.b = 0;
                break;
            case 18:
                this.c = new jh.a();
                break;
            case 23:
                this.c = new Object[8];
                this.b = 0;
                break;
            default:
                int i10 = cg.h.y;
                this.c = new cg.c0[i10];
                this.d = new Bitmap[i10];
                break;
        }
    }

    public kg(d2.v vVar, int i3, String str) {
        this.a = 12;
        this.c = vVar;
        this.b = i3;
        this.d = str;
    }

    public kg(o4.o0 o0Var, o4.v vVar, int i3) {
        this.a = 17;
        this.d = o0Var;
        this.c = vVar;
        this.b = i3;
    }
}
