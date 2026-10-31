package li;

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
import android.media.AudioAttributes;
import android.media.MediaCodec;
import android.media.MediaFormat;
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
import android.view.Choreographer;
import android.view.View;
import com.google.android.gms.common.api.internal.p1;
import com.google.android.gms.location.LocationRequest;
import e9.m2;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;
import m.p3;
import org.telegram.messenger.ILocationServiceProvider;
import org.telegram.messenger.aa;
import org.telegram.messenger.ba;
import org.telegram.messenger.ca;
import org.telegram.messenger.ef;
import org.telegram.messenger.eu;
import org.telegram.messenger.f8;
import org.telegram.messenger.jp;
import org.telegram.messenger.pa;
import org.telegram.messenger.pz;
import org.telegram.messenger.q20;
import org.telegram.messenger.qa;
import org.telegram.messenger.ra;
import org.telegram.messenger.sa;
import org.telegram.messenger.ta;
import org.telegram.messenger.z9;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.b1;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.by0;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.jj;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.Components.py0;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.xj;
import org.telegram.ui.ko0;
import org.telegram.ui.un;
import org.telegram.ui.wv0;
import org.telegram.ui.xz0;
import org.xmlpull.v1.XmlPullParserException;
import v7.c8;
import v7.r7;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public class k implements a1, ILocationServiceProvider, jp, lj0, ko0, xz0 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ k(int i10, boolean z10) {
        this.a = i10;
    }

    public static k G(Context context, AttributeSet attributeSet, int[] iArr, int i10) {
        return new k(context, context.obtainStyledAttributes(attributeSet, iArr, i10, 0));
    }

    public static StringBuilder H(String str) {
        StringBuilder sb2;
        int i10;
        byte[] H;
        int i11;
        try {
            BufferedReader bufferedReader = new BufferedReader(new StringReader(str));
            int i12 = 0;
            boolean z10 = false;
            k kVar = null;
            String str2 = null;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                if (!readLine.startsWith("PHOTO")) {
                    if (readLine.indexOf(58) >= 0) {
                        if (readLine.startsWith("BEGIN:VCARD")) {
                            kVar = new k(15, false);
                            kVar.c = new ArrayList();
                            kVar.d = new ArrayList();
                        } else if (readLine.startsWith("END:VCARD") && kVar != null) {
                            z10 = true;
                        }
                    }
                    if (str2 != null) {
                        readLine = str2 + readLine;
                        str2 = null;
                    }
                    if (readLine.contains("=QUOTED-PRINTABLE") && readLine.endsWith("=")) {
                        str2 = readLine.substring(i12, readLine.length() - 1);
                    } else {
                        int indexOf = readLine.indexOf(":");
                        String[] strArr = indexOf >= 0 ? new String[]{readLine.substring(i12, indexOf), readLine.substring(indexOf + 1).trim()} : new String[]{readLine.trim()};
                        if (strArr.length < 2 || kVar == null) {
                            i10 = i12;
                        } else if (strArr[i12].startsWith("ORG")) {
                            String[] split = strArr[i12].split(";");
                            int length = split.length;
                            int i13 = i12;
                            String str3 = null;
                            String str4 = null;
                            while (i13 < length) {
                                String[] split2 = split[i13].split("=");
                                sb2 = null;
                                try {
                                    if (split2.length != 2) {
                                        i11 = i12;
                                    } else {
                                        i11 = i12;
                                        if (split2[i12].equals("CHARSET")) {
                                            str4 = split2[1];
                                        } else if (split2[i11].equals("ENCODING")) {
                                            str3 = split2[1];
                                        }
                                    }
                                    i13++;
                                    i12 = i11;
                                } catch (Throwable unused) {
                                    return sb2;
                                }
                            }
                            i10 = i12;
                            kVar.b = strArr[1];
                            if (str3 != null && str3.equalsIgnoreCase("QUOTED-PRINTABLE") && (H = org.telegram.messenger.i0.H(org.telegram.messenger.i0.h1((String) kVar.b))) != null && H.length != 0) {
                                kVar.b = new String(H, str4);
                            }
                            kVar.b = ((String) kVar.b).replace(';', ' ');
                        } else {
                            i10 = i12;
                            if (strArr[i10].startsWith("TEL")) {
                                if (strArr[1].length() > 0) {
                                    ((ArrayList) kVar.d).add(strArr[1]);
                                }
                            } else if (strArr[i10].startsWith("EMAIL")) {
                                String str5 = strArr[1];
                                if (str5.length() > 0) {
                                    ((ArrayList) kVar.c).add(str5);
                                }
                            }
                        }
                        i12 = i10;
                    }
                }
                return sb2;
            }
            int i14 = i12;
            sb2 = null;
            try {
                bufferedReader.close();
            } catch (Exception e) {
                f8.g(e, true);
            }
            if (!z10) {
                return null;
            }
            StringBuilder sb3 = new StringBuilder();
            for (int i15 = i14; i15 < ((ArrayList) kVar.d).size(); i15++) {
                if (sb3.length() > 0) {
                    sb3.append('\n');
                }
                String str6 = (String) ((ArrayList) kVar.d).get(i15);
                if (!str6.contains("#") && !str6.contains("*")) {
                    sb3.append(af.b.c().b(str6));
                }
                sb3.append(str6);
            }
            for (int i16 = i14; i16 < ((ArrayList) kVar.c).size(); i16++) {
                if (sb3.length() > 0) {
                    sb3.append('\n');
                }
                sb3.append(af.b.c().b((String) ((ArrayList) kVar.c).get(i16)));
            }
            if (!TextUtils.isEmpty((String) kVar.b)) {
                if (sb3.length() > 0) {
                    sb3.append('\n');
                }
                sb3.append((String) kVar.b);
            }
            return sb3;
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static void J(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e("AtomicFile", "Failed to delete file which is a directory " + file2);
        }
        if (file.renameTo(file2)) {
            return;
        }
        Log.e("AtomicFile", "Failed to rename " + file + " to " + file2);
    }

    public static k i(View view) {
        return new k(view);
    }

    public static Object[] m(Object[] objArr, int[] iArr) {
        int length = objArr.length;
        Class<?> componentType = objArr.getClass().getComponentType();
        by0 by0Var = py0.R;
        int i10 = -1;
        for (int i11 : iArr) {
            i10 = Math.max(i10, i11);
        }
        Object[] objArr2 = (Object[]) Array.newInstance(componentType, i10 + 1);
        for (int i12 = 0; i12 < length; i12++) {
            objArr2[iArr[i12]] = objArr[i12];
        }
        return objArr2;
    }

    public static n2.e n(b2.h0 h0Var) {
        g2.p pVar = new g2.p();
        pVar.c = null;
        Uri uri = h0Var.b;
        String uri2 = uri == null ? null : uri.toString();
        boolean z10 = h0Var.f;
        ac.a aVar = new ac.a();
        t6.f((z10 && TextUtils.isEmpty(uri2)) ? false : true);
        aVar.b = pVar;
        aVar.c = uri2;
        aVar.a = z10;
        aVar.d = new HashMap();
        e9.q0 q0Var = h0Var.c;
        e9.y0 y0Var = q0Var.a;
        if (y0Var == null) {
            y0Var = q0Var.b();
            q0Var.a = y0Var;
        }
        m2 it = y0Var.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            str.getClass();
            str2.getClass();
            synchronized (((HashMap) aVar.d)) {
                ((HashMap) aVar.d).put(str, str2);
            }
        }
        HashMap hashMap = new HashMap();
        int i10 = b2.n.a;
        hb.a aVar2 = new hb.a(27);
        UUID uuid = h0Var.a;
        uuid.getClass();
        boolean z11 = h0Var.d;
        boolean z12 = h0Var.e;
        int[] f7 = c8.f(h0Var.g);
        int length = f7.length;
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = f7[i11];
            t6.f(i12 == 2 || i12 == 1);
        }
        n2.e eVar = new n2.e(uuid, aVar, hashMap, z11, (int[]) f7.clone(), z12, aVar2);
        byte[] bArr = h0Var.h;
        byte[] copyOf = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        t6.p(eVar.x.isEmpty());
        eVar.K = copyOf;
        return eVar;
    }

    @Override // org.telegram.ui.Components.lj0
    public /* synthetic */ boolean A() {
        return false;
    }

    public Typeface C(int i10, int i11, e2.j0 j0Var) {
        e2.j0 j0Var2;
        XmlPullParserException xmlPullParserException;
        IOException iOException;
        int resourceId = ((TypedArray) this.c).getResourceId(i10, 0);
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
                int i12 = typedValue.assetCookie;
                a0.j jVar = i0.f.b;
                Typeface typeface = (Typeface) jVar.a(i0.f.b(resources, resourceId, charSequence2, i12, i11));
                int i13 = 14;
                if (typeface != null) {
                    new Handler(Looper.getMainLooper()).post(new d1.e(i13, j0Var, typeface));
                    return typeface;
                }
                try {
                    if (!charSequence2.toLowerCase().endsWith(".xml")) {
                        j0Var2 = j0Var;
                        try {
                            int i14 = typedValue.assetCookie;
                            Typeface e = i0.f.a.e(context, resources, resourceId, charSequence2, i11);
                            if (e != null) {
                                jVar.b(i0.f.b(resources, resourceId, charSequence2, i14, i11), e);
                            }
                            if (e != null) {
                                new Handler(Looper.getMainLooper()).post(new d1.e(i13, j0Var2, e));
                            } else {
                                j0Var2.b();
                            }
                            return e;
                        } catch (IOException e7) {
                            e = e7;
                            iOException = e;
                            Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                            j0Var2.b();
                            return null;
                        } catch (XmlPullParserException e10) {
                            e = e10;
                            xmlPullParserException = e;
                            Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                            j0Var2.b();
                            return null;
                        }
                    }
                    h0.d g10 = h0.b.g(resources.getXml(resourceId), resources);
                    if (g10 != null) {
                        try {
                            return i0.f.a(context, g10, resources, resourceId, charSequence2, typedValue.assetCookie, i11, j0Var);
                        } catch (IOException e11) {
                            e = e11;
                            j0Var2 = j0Var;
                            iOException = e;
                            Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                            j0Var2.b();
                            return null;
                        } catch (XmlPullParserException e12) {
                            e = e12;
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
                    } catch (IOException e13) {
                        iOException = e13;
                        j0Var2 = j0Var;
                        Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                        j0Var2.b();
                        return null;
                    } catch (XmlPullParserException e14) {
                        xmlPullParserException = e14;
                        j0Var2 = j0Var;
                        Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                        j0Var2.b();
                        return null;
                    }
                } catch (IOException e15) {
                    e = e15;
                    j0Var2 = j0Var;
                } catch (XmlPullParserException e16) {
                    e = e16;
                    j0Var2 = j0Var;
                }
            }
        }
        return null;
    }

    public Paint D(float f7, int i10) {
        Paint[] paintArr = (Paint[]) this.b;
        if (paintArr[i10] == null) {
            Paint paint = new Paint(1);
            paintArr[i10] = paint;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
        paintArr[i10].setShader(null);
        paintArr[i10].setColor(-65536);
        paintArr[i10].setAlpha((int) (f7 * 255.0f));
        return paintArr[i10];
    }

    public boolean E() {
        String trim;
        ArrayDeque arrayDeque = (ArrayDeque) this.c;
        if (((String) this.d) == null) {
            if (!arrayDeque.isEmpty()) {
                String str = (String) arrayDeque.poll();
                str.getClass();
                this.d = str;
                return true;
            }
            do {
                String readLine = ((BufferedReader) this.b).readLine();
                this.d = readLine;
                if (readLine == null) {
                    return false;
                }
                trim = readLine.trim();
                this.d = trim;
            } while (trim.isEmpty());
        }
        return true;
    }

    public String F() {
        if (!E()) {
            throw new NoSuchElementException();
        }
        String str = (String) this.d;
        this.d = null;
        return str;
    }

    public void I() {
        ((TypedArray) this.c).recycle();
    }

    public FileOutputStream K() {
        File file = (File) this.c;
        File file2 = (File) this.d;
        if (file2.exists()) {
            J(file2, (File) this.b);
        }
        try {
            return new FileOutputStream(file);
        } catch (FileNotFoundException unused) {
            if (!file.getParentFile().mkdirs()) {
                throw new IOException("Failed to create directory for " + file);
            }
            try {
                return new FileOutputStream(file);
            } catch (FileNotFoundException e) {
                throw new IOException("Failed to create new file " + file, e);
            }
        }
    }

    public void L(boolean z10, float f7) {
        b1[] b1VarArr = (b1[]) this.d;
        for (int i10 = 0; i10 < b1VarArr.length; i10++) {
            if (!z10 || ((i10 != 0 || Math.abs(f7 - 0.2f) >= 0.01f) && ((i10 != 1 || Math.abs(f7 - 0.5f) >= 0.1f) && ((i10 != 2 || Math.abs(f7 - 1.0f) >= 0.1f) && ((i10 != 3 || Math.abs(f7 - 1.5f) >= 0.1f) && (i10 != 4 || Math.abs(f7 - 2.0f) >= 0.1f)))))) {
                b1VarArr[i10].d(-328966, -328966);
            } else {
                b1VarArr[i10].d(-9718023, -9718023);
            }
        }
        ((org.telegram.ui.ActionBar.x0) this.c).e(true, f7);
    }

    public void M(Object obj, String str) {
        k kVar = new k(9, false);
        ((k) this.d).d = kVar;
        this.d = kVar;
        kVar.c = obj;
        kVar.b = str;
    }

    @Override // org.telegram.messenger.jp
    public void a() {
        ((gf.e) this.b).b();
        ((k2) this.c).presentFragment(new un((Bundle) this.d));
    }

    @Override // org.telegram.ui.xz0
    public void b() {
        q20 q20Var;
        boolean[] zArr = (boolean[]) this.b;
        if (!zArr[0] && (q20Var = (q20) this.c) != null) {
            zArr[0] = true;
            q20Var.a(Boolean.TRUE);
        }
        org.telegram.messenger.i0.h3(new wv0((cc) this.d, 11), 200L);
    }

    @Override // org.telegram.messenger.ILocationServiceProvider
    public void checkLocationSettings(sa saVar, q0.a aVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(((ca) saVar).a);
        r7.c cVar = (r7.c) this.c;
        g8.c cVar2 = new g8.c(arrayList, false, false);
        cVar.getClass();
        com.google.android.gms.common.api.internal.v b10 = com.google.android.gms.common.api.internal.w.b();
        b10.c = new l2.f(cVar2, 24);
        b10.a = 2426;
        cVar.e(0, b10.a()).addOnCompleteListener(new z9(aVar, 1));
    }

    @Override // org.telegram.messenger.ILocationServiceProvider
    public boolean checkServices() {
        return eu.b.hasServices();
    }

    @Override // org.telegram.ui.ko0
    public /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.lj0
    public /* synthetic */ boolean f() {
        return true;
    }

    @Override // org.telegram.messenger.jp
    public void g(boolean z10) {
        ((gf.e) this.b).b();
        ((k2) this.c).presentFragment(new un((Bundle) this.d));
    }

    @Override // org.telegram.messenger.ILocationServiceProvider
    public void getLastLocation(q0.a aVar) {
        r7.c cVar = (r7.c) this.b;
        cVar.getClass();
        com.google.android.gms.common.api.internal.v b10 = com.google.android.gms.common.api.internal.w.b();
        b10.c = r7.a.c;
        b10.a = 2414;
        cVar.e(0, b10.a()).addOnCompleteListener(new z9(aVar, 0));
    }

    @Override // org.telegram.ui.Components.lj0
    public /* synthetic */ boolean h() {
        return false;
    }

    @Override // org.telegram.ui.ko0
    public void h0() {
        ((xj) this.d).Q.A();
    }

    @Override // org.telegram.messenger.ILocationServiceProvider
    public void init(Context context) {
        com.google.android.gms.common.api.e eVar = g8.b.a;
        com.google.android.gms.common.api.i iVar = com.google.android.gms.common.api.i.c;
        com.google.android.gms.common.api.e eVar2 = r7.c.k;
        com.google.android.gms.common.api.a aVar = com.google.android.gms.common.api.b.k;
        this.b = new r7.c(context, eVar2, aVar, iVar);
        this.c = new r7.c(context, eVar2, aVar, iVar);
    }

    public String j(int i10, long j10, long j11, String str) {
        ArrayList arrayList = (ArrayList) this.b;
        ArrayList arrayList2 = (ArrayList) this.d;
        ArrayList arrayList3 = (ArrayList) this.c;
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < arrayList3.size(); i11++) {
            sb2.append((String) arrayList.get(i11));
            if (((Integer) arrayList3.get(i11)).intValue() == 1) {
                sb2.append(str);
            } else if (((Integer) arrayList3.get(i11)).intValue() == 2) {
                sb2.append(String.format(Locale.US, (String) arrayList2.get(i11), Long.valueOf(j10)));
            } else if (((Integer) arrayList3.get(i11)).intValue() == 3) {
                sb2.append(String.format(Locale.US, (String) arrayList2.get(i11), Integer.valueOf(i10)));
            } else if (((Integer) arrayList3.get(i11)).intValue() == 4) {
                sb2.append(String.format(Locale.US, (String) arrayList2.get(i11), Long.valueOf(j11)));
            }
        }
        sb2.append((String) arrayList.get(arrayList3.size()));
        return sb2.toString();
    }

    public void k() {
        android.support.v4.media.session.a0 a0Var = (android.support.v4.media.session.a0) this.b;
        if (a0Var != null) {
            int i10 = ((p4.e) this.d).n.d;
            android.support.v4.media.session.u uVar = (android.support.v4.media.session.u) a0Var.b;
            uVar.getClass();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(i10);
            uVar.a.setPlaybackToLocal(builder.build());
            this.c = null;
        }
    }

    public void l(Canvas canvas, RectF rectF, float f7) {
        Paint[] paintArr = (Paint[]) this.b;
        if (paintArr[0] == null) {
            Paint paint = new Paint(1);
            paintArr[0] = paint;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
        paintArr[0].setShader((LinearGradient) this.c);
        paintArr[0].setAlpha((int) (f7 * 255.0f));
        canvas.drawRect(rectF, paintArr[0]);
    }

    public void o(Canvas canvas, RectF rectF, int i10, float f7) {
        Paint[] paintArr = (Paint[]) this.b;
        Matrix matrix = (Matrix) this.d;
        if (f7 <= 0.0f) {
            return;
        }
        if (((LinearGradient) this.c) == null) {
            this.c = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{-65536, 16711680}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        }
        if (paintArr[i10] == null) {
            paintArr[i10] = new Paint(1);
            paintArr[i10].setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
        paintArr[i10].setShader((LinearGradient) this.c);
        matrix.reset();
        if (i10 == 0) {
            matrix.postScale(1.0f, rectF.width() / 16.0f);
            matrix.postRotate(-90.0f);
            matrix.postTranslate(rectF.left, rectF.top);
        } else if (i10 == 1) {
            matrix.postScale(1.0f, rectF.height() / 16.0f);
            matrix.postTranslate(rectF.left, rectF.top);
        } else if (i10 == 2) {
            matrix.postScale(1.0f, rectF.width() / 16.0f);
            matrix.postRotate(90.0f);
            matrix.postTranslate(rectF.right, rectF.top);
        } else if (i10 == 3) {
            matrix.postScale(1.0f, rectF.height() / 16.0f);
            matrix.postScale(1.0f, -1.0f);
            matrix.postTranslate(rectF.left, rectF.bottom);
        }
        ((LinearGradient) this.c).setLocalMatrix(matrix);
        paintArr[i10].setAlpha((int) (255.0f * f7));
        canvas.drawRect(rectF, paintArr[i10]);
    }

    @Override // org.telegram.messenger.ILocationServiceProvider
    public sa onCreateLocationRequest() {
        LocationRequest locationRequest = new LocationRequest(zs.n1, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, ConnectionsManager.DEFAULT_DATACENTER_ID, 0.0f, true, 3600000L, 0, 0, null, false, new WorkSource(), null);
        ca caVar = new ca();
        caVar.a = locationRequest;
        return caVar;
    }

    @Override // org.telegram.messenger.ILocationServiceProvider
    public ta onCreateLocationServicesAPI(Context context, pa paVar, final qa qaVar) {
        List list;
        Context context2 = org.telegram.messenger.w0.b;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        a0.f fVar = new a0.f(0);
        a0.f fVar2 = new a0.f(0);
        Object obj = k6.d.c;
        a8.d dVar = n8.b.a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Looper mainLooper = context2.getMainLooper();
        String packageName = context2.getPackageName();
        String name = context2.getClass().getName();
        com.google.android.gms.common.api.e eVar = g8.b.a;
        n6.l.h(eVar, "Api must not be null");
        com.google.android.gms.common.api.e eVar2 = null;
        fVar2.put(eVar, null);
        a8.d dVar2 = eVar.a;
        n6.l.h(dVar2, "Base client builder must not be null");
        switch (dVar2.a) {
            case 17:
                list = Collections.EMPTY_LIST;
                break;
            default:
                list = Collections.EMPTY_LIST;
                break;
        }
        hashSet2.addAll(list);
        hashSet.addAll(list);
        arrayList.add(new ba(paVar));
        arrayList2.add(new com.google.android.gms.common.api.l() { // from class: org.telegram.messenger.y9
            @Override // com.google.android.gms.common.api.l
            public final void onConnectionFailed(k6.a aVar) {
                nd ndVar = (nd) qa.this;
                if (ndVar.L) {
                    return;
                }
                ndVar.K = Boolean.FALSE;
                if (ndVar.D) {
                    ndVar.D = false;
                    ndVar.p();
                }
            }
        });
        boolean z10 = true;
        n6.l.a("must call addApi() to add at least one API", !fVar2.isEmpty());
        n8.a aVar = n8.a.a;
        com.google.android.gms.common.api.e eVar3 = n8.b.b;
        if (fVar2.containsKey(eVar3)) {
            aVar = (n8.a) fVar2.get(eVar3);
        }
        p3 p3Var = new p3(hashSet, fVar, packageName, name, aVar);
        Map map = (Map) p3Var.c;
        a0.f fVar3 = new a0.f(0);
        a0.f fVar4 = new a0.f(0);
        ArrayList arrayList3 = new ArrayList();
        Iterator it = ((a0.c) fVar2.keySet()).iterator();
        while (true) {
            a0.b bVar = (a0.b) it;
            if (!bVar.hasNext()) {
                p3 p3Var2 = p3Var;
                a0.f fVar5 = fVar3;
                a0.f fVar6 = fVar4;
                ArrayList arrayList4 = arrayList3;
                Looper looper = mainLooper;
                if (eVar2 != null) {
                    boolean equals = hashSet.equals(hashSet2);
                    String str = eVar2.c;
                    if (!equals) {
                        throw new IllegalStateException(a1.g.n("Must not set scopes in GoogleApiClient.Builder when using ", str, ". Set account in GoogleSignInOptions.Builder instead."));
                    }
                }
                com.google.android.gms.common.api.internal.k0 k0Var = new com.google.android.gms.common.api.internal.k0(context2, new ReentrantLock(), looper, p3Var2, fVar5, arrayList, arrayList2, fVar6, com.google.android.gms.common.api.internal.k0.f(fVar6.values(), true), arrayList4);
                Set set = com.google.android.gms.common.api.m.a;
                synchronized (set) {
                    set.add(k0Var);
                }
                com.google.android.gms.common.api.internal.h0 h0Var = new com.google.android.gms.common.api.internal.h0();
                h0Var.a = k0Var;
                return h0Var;
            }
            com.google.android.gms.common.api.e eVar4 = (com.google.android.gms.common.api.e) bVar.next();
            Object obj2 = fVar2.get(eVar4);
            boolean z11 = map.get(eVar4) != null ? z10 : false;
            fVar3.put(eVar4, Boolean.valueOf(z11));
            a0.f fVar7 = fVar4;
            Looper looper2 = mainLooper;
            p1 p1Var = new p1(eVar4, z11);
            arrayList3.add(p1Var);
            a8.d dVar3 = eVar4.a;
            n6.l.g(dVar3);
            ArrayList arrayList5 = arrayList3;
            Map map2 = map;
            p3 p3Var3 = p3Var;
            a0.f fVar8 = fVar2;
            a0.f fVar9 = fVar3;
            com.google.android.gms.common.api.c a2 = dVar3.a(context2, looper2, p3Var3, obj2, p1Var, p1Var);
            fVar7.put(eVar4.b, a2);
            if (!a2.b()) {
                mainLooper = looper2;
                p3Var = p3Var3;
            } else {
                if (eVar2 != null) {
                    throw new IllegalStateException(a1.g.C(eVar4.c, " cannot be used with ", eVar2.c));
                }
                mainLooper = looper2;
                p3Var = p3Var3;
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

    @Override // li.a1
    public void p(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
        byteBuffer.position(bufferInfo.offset);
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        allocateDirect.put(byteBuffer).flip();
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        bufferInfo2.set(0, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
        ((ArrayList) this.b).add(allocateDirect);
        ((ArrayList) this.c).add(bufferInfo2);
    }

    public void q(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = (HashMap) this.b;
        ma.f fVar = new ma.f(byteArrayOutputStream, hashMap, (HashMap) this.c, (ja.d) this.d);
        if (obj == null) {
            return;
        }
        ja.d dVar = (ja.d) hashMap.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, fVar);
        } else {
            throw new ja.b("No encoder for " + obj.getClass());
        }
    }

    @Override // org.telegram.messenger.ILocationServiceProvider
    public synchronized void removeLocationUpdates(ra raVar) {
        aa aaVar = (aa) ((HashMap) this.d).remove(raVar);
        if (aaVar != null) {
            r7.c cVar = (r7.c) this.b;
            cVar.getClass();
            String simpleName = aa.class.getSimpleName();
            n6.l.f(simpleName, "Listener type must not be empty");
            cVar.c(new com.google.android.gms.common.api.internal.n(aaVar, simpleName), 2418).continueWith(r7.b.a, r7.a.b);
        }
    }

    @Override // org.telegram.messenger.ILocationServiceProvider
    public synchronized void requestLocationUpdates(sa saVar, ra raVar) {
        aa aaVar = (aa) ((HashMap) this.d).remove(raVar);
        if (aaVar != null) {
            r7.c cVar = (r7.c) this.b;
            cVar.getClass();
            String simpleName = aa.class.getSimpleName();
            n6.l.f(simpleName, "Listener type must not be empty");
            cVar.c(new com.google.android.gms.common.api.internal.n(aaVar, simpleName), 2418).continueWith(r7.b.a, r7.a.b);
        }
        aa aaVar2 = new aa(raVar);
        ((HashMap) this.d).put(raVar, aaVar2);
        ((r7.c) this.b).f(((ca) saVar).a, aaVar2, Looper.getMainLooper());
    }

    @Override // li.a1
    public void s(MediaFormat mediaFormat) {
        this.d = mediaFormat;
    }

    public String toString() {
        switch (this.a) {
            case 10:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.b);
                sb2.append('{');
                k kVar = (k) ((k) this.c).d;
                String str = "";
                while (kVar != null) {
                    Object obj = kVar.c;
                    sb2.append(str);
                    String str2 = (String) kVar.b;
                    if (str2 != null) {
                        sb2.append(str2);
                        sb2.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb2.append(obj);
                    } else {
                        sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r3.length() - 1);
                    }
                    kVar = (k) kVar.d;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public n2.m u(b2.p0 p0Var) {
        n2.e eVar;
        p0Var.b.getClass();
        b2.h0 h0Var = p0Var.b.c;
        if (h0Var == null) {
            return n2.m.m;
        }
        synchronized (this.b) {
            try {
                if (!h0Var.equals((b2.h0) this.c)) {
                    this.c = h0Var;
                    this.d = n(h0Var);
                }
                eVar = (n2.e) this.d;
                eVar.getClass();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }

    @Override // org.telegram.ui.ko0
    public void u0(int i10, boolean z10, boolean z11) {
        if (z10) {
            return;
        }
        xj xjVar = (xj) this.d;
        HashMap hashMap = (HashMap) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        bi biVar = xjVar.b;
        if (hashMap.isEmpty() || xjVar.Q == null || xjVar.K) {
            return;
        }
        xjVar.K = true;
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            Object obj = hashMap.get(arrayList.get(i11));
            pz pzVar = new pz();
            arrayList2.add(pzVar);
            if (obj instanceof ef) {
                ef efVar = (ef) obj;
                String str = efVar.h;
                if (str != null) {
                    pzVar.c = str;
                } else {
                    pzVar.c = efVar.I;
                }
                pzVar.e = efVar.c;
                pzVar.f = efVar.g;
                pzVar.k = efVar.s;
                pzVar.o = efVar.b;
                CharSequence charSequence = efVar.a;
                pzVar.d = charSequence != null ? charSequence.toString() : null;
                pzVar.i = efVar.n;
                pzVar.j = efVar.r;
                pzVar.h = efVar.x;
            }
        }
        s4.Z(biVar.D3, biVar.W0() + arrayList2.size(), biVar.a1(), new jj(i10, 0, xjVar, arrayList2, z11));
    }

    public ColorStateList v(int i10) {
        int resourceId;
        ColorStateList a2;
        TypedArray typedArray = (TypedArray) this.c;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (a2 = r7.a((Context) this.b, resourceId)) == null) ? typedArray.getColorStateList(i10) : a2;
    }

    public Drawable w(int i10) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.c;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0) ? typedArray.getDrawable(i10) : r7.b((Context) this.b, resourceId);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0063  */
    @Override // org.telegram.ui.Components.lj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void x(View view, sg.o0 o0Var, boolean z10, boolean z11) {
        float f7;
        sg.p0 p0Var;
        sg.m0 l4;
        float f10;
        int i10;
        float f11;
        un unVar = (un) this.d;
        org.telegram.ui.Cells.z A8 = unVar.A8(((org.telegram.messenger.jj) this.b).f1(), true);
        float f12 = 0.0f;
        if (A8 instanceof q1) {
            sg.p0 p0Var2 = ((q1) A8).N;
            sg.m0 l10 = p0Var2.l(o0Var);
            if (l10 == null) {
                f11 = 0.0f;
                f7 = f11;
                unVar.qb(A8, (org.telegram.messenger.jj) this.b, (mj0) this.c, view, f12, f7, o0Var, false, (o0Var == null && o0Var.a) ? true : z10, z11, false);
            } else {
                f12 = p0Var2.b + l10.w + (l10.z / 2.0f);
                f10 = p0Var2.c + l10.x;
                i10 = l10.A;
            }
        } else if (!(A8 instanceof org.telegram.ui.Cells.s0) || (l4 = (p0Var = ((org.telegram.ui.Cells.s0) A8).E0).l(o0Var)) == null) {
            f7 = 0.0f;
            unVar.qb(A8, (org.telegram.messenger.jj) this.b, (mj0) this.c, view, f12, f7, o0Var, false, (o0Var == null && o0Var.a) ? true : z10, z11, false);
        } else {
            f12 = p0Var.b + l4.w + (l4.z / 2.0f);
            f10 = p0Var.c + l4.x;
            i10 = l4.A;
        }
        f11 = f10 + (i10 / 2.0f);
        f7 = f11;
        unVar.qb(A8, (org.telegram.messenger.jj) this.b, (mj0) this.c, view, f12, f7, o0Var, false, (o0Var == null && o0Var.a) ? true : z10, z11, false);
    }

    public Drawable z(int i10) {
        int resourceId;
        Drawable f7;
        if (!((TypedArray) this.c).hasValue(i10) || (resourceId = ((TypedArray) this.c).getResourceId(i10, 0)) == 0) {
            return null;
        }
        m.q a2 = m.q.a();
        Context context = (Context) this.b;
        synchronized (a2) {
            f7 = a2.a.f(resourceId, context, true);
        }
        return f7;
    }

    public /* synthetic */ k(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ k(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public k(String str) {
        this.a = 10;
        k kVar = new k(9, false);
        this.c = kVar;
        this.d = kVar;
        this.b = str;
    }

    public k(Context context) {
        this.a = 13;
        this.b = context;
    }

    public k(String str, Boolean bool, oc.a aVar, String str2) {
        this.a = 12;
        this.b = str;
        this.c = str2;
        this.d = aVar;
    }

    public k(View view) {
        this.a = 22;
        this.d = view;
        h61 h61Var = new h61(this, view);
        this.b = h61Var;
        view.addOnLayoutChangeListener(h61Var);
    }

    public k(File file) {
        this.a = 29;
        this.b = file;
        this.c = new File(file.getPath() + ".new");
        this.d = new File(file.getPath() + ".bak");
    }

    public k(Context context, TypedArray typedArray) {
        this.a = 2;
        this.b = context;
        this.c = typedArray;
    }

    public k(byte[] bArr, j9.y yVar) {
        this.a = 4;
        this.b = bArr;
        this.c = null;
        this.d = yVar;
    }

    public k(b2.s0 s0Var, j9.y yVar) {
        this.a = 4;
        this.b = s0Var.k;
        this.c = s0Var.n;
        this.d = yVar;
    }

    public k(m2.t tVar) {
        this.a = 11;
        this.a = 11;
        this.b = tVar;
        this.c = Choreographer.getInstance();
        this.d = new o1.a(this, 0);
    }

    public k(int i10) {
        this.a = i10;
        switch (i10) {
            case 7:
                this.b = new Object();
                break;
            case 14:
                this.d = new HashMap();
                break;
            case 23:
                this.b = new Paint[4];
                this.d = new Matrix();
                break;
            default:
                this.b = new ArrayList();
                this.c = new ArrayList();
                break;
        }
    }

    public k(p4.e eVar, android.support.v4.media.session.a0 a0Var) {
        this.a = 28;
        this.d = eVar;
        this.b = a0Var;
    }

    public k(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.a = 27;
        this.c = arrayDeque;
        this.b = bufferedReader;
    }

    public k(Object[] objArr, Object[] objArr2) {
        this.a = 21;
        int length = objArr.length;
        int[] iArr = new int[length];
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = objArr[i10];
            Integer num = (Integer) hashMap.get(obj);
            if (num == null) {
                num = Integer.valueOf(hashMap.size());
                hashMap.put(obj, num);
            }
            iArr[i10] = num.intValue();
        }
        this.b = iArr;
        this.c = m(objArr, iArr);
        this.d = m(objArr2, iArr);
    }

    @Override // org.telegram.ui.xz0
    public /* synthetic */ void c() {
    }

    @Override // org.telegram.ui.xz0
    public /* synthetic */ void d() {
    }

    @Override // org.telegram.ui.Components.lj0
    public /* synthetic */ void t() {
    }

    @Override // org.telegram.ui.ko0
    public void y() {
    }

    @Override // org.telegram.ui.ko0
    public void B(Editable editable) {
    }

    @Override // org.telegram.ui.Components.lj0
    public /* synthetic */ void r(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
