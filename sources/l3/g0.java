package l3;

import android.content.ClipDescription;
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
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.Editable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.Choreographer;
import android.view.View;
import bg.t1;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.tasks.TaskCompletionSource;
import h7.s7;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;
import l4.l1;
import lh.q2;
import nh.a6;
import nh.b6;
import nh.e6;
import nh.f6;
import nh.g9;
import nh.n7;
import nh.o7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.cz0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.jk;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.qz;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.x61;
import org.telegram.ui.tn;
import org.telegram.ui.yp0;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class g0 implements t9.a, u61, com.google.android.gms.common.api.internal.s, ek0, yp0, t0.h {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ g0(int i10, boolean z10) {
        this.a = i10;
    }

    public static void C(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e("AtomicFile", "Failed to delete file which is a directory " + file2);
        }
        if (file.renameTo(file2)) {
            return;
        }
        Log.e("AtomicFile", "Failed to rename " + file + " to " + file2);
    }

    public static final URL m(g0 g0Var) {
        Uri.Builder appendPath = new Uri.Builder().scheme("https").authority((String) g0Var.d).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        ja.b bVar = (ja.b) g0Var.b;
        Uri.Builder appendPath2 = appendPath.appendPath(bVar.a).appendPath("settings");
        ja.a aVar = bVar.b;
        return new URL(appendPath2.appendQueryParameter("build_version", aVar.c).appendQueryParameter("display_version", aVar.b).build().toString());
    }

    public static Object[] n(Object[] objArr, int[] iArr) {
        int length = objArr.length;
        Class<?> componentType = objArr.getClass().getComponentType();
        oy0 oy0Var = cz0.N;
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

    public static g0 z(Context context, AttributeSet attributeSet, int[] iArr, int i10) {
        return new g0(context, context.obtainStyledAttributes(attributeSet, iArr, i10, 0));
    }

    public void A(mb.i iVar, Object obj) {
        if (((EnumMap) this.d) == null) {
            this.d = new EnumMap(mb.i.class);
        }
        ((EnumMap) this.d).put((EnumMap) iVar, (mb.i) obj);
    }

    public void B() {
        ((TypedArray) this.c).recycle();
    }

    public FileOutputStream D() {
        File file = (File) this.c;
        File file2 = (File) this.d;
        if (file2.exists()) {
            C(file2, (File) this.b);
        }
        try {
            return new FileOutputStream(file);
        } catch (FileNotFoundException unused) {
            if (!file.getParentFile().mkdirs()) {
                throw new IOException("Failed to create directory for " + file);
            }
            try {
                return new FileOutputStream(file);
            } catch (FileNotFoundException e10) {
                throw new IOException("Failed to create new file " + file, e10);
            }
        }
    }

    public void E(int i10, String str, String str2) {
        ((HashMap) this.b).put(str, str2);
        ((HashMap) this.c).put(str2, str);
        ((HashMap) this.d).put(str, Integer.valueOf(i10));
    }

    @Override // org.telegram.ui.Components.ek0
    public /* synthetic */ boolean O() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0063  */
    @Override // org.telegram.ui.Components.ek0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void Q(View view, kg.q0 q0Var, boolean z10, boolean z11) {
        float f9;
        kg.r0 r0Var;
        kg.o0 m10;
        float f10;
        int i10;
        float f11;
        tn tnVar = (tn) this.d;
        org.telegram.ui.Cells.a0 q82 = tnVar.q8(((MessageObject) this.b).getId(), true);
        float f12 = 0.0f;
        if (q82 instanceof s1) {
            kg.r0 r0Var2 = ((s1) q82).J;
            kg.o0 m11 = r0Var2.m(q0Var);
            if (m11 == null) {
                f11 = 0.0f;
                f9 = f11;
                tnVar.ab(q82, (MessageObject) this.b, (fk0) this.c, view, f12, f9, q0Var, false, (q0Var == null && q0Var.a) ? true : z10, z11, false);
            } else {
                f12 = r0Var2.c + m11.x + (m11.A / 2.0f);
                f10 = r0Var2.d + m11.y;
                i10 = m11.B;
            }
        } else if (!(q82 instanceof org.telegram.ui.Cells.v0) || (m10 = (r0Var = ((org.telegram.ui.Cells.v0) q82).y0).m(q0Var)) == null) {
            f9 = 0.0f;
            tnVar.ab(q82, (MessageObject) this.b, (fk0) this.c, view, f12, f9, q0Var, false, (q0Var == null && q0Var.a) ? true : z10, z11, false);
        } else {
            f12 = r0Var.c + m10.x + (m10.A / 2.0f);
            f10 = r0Var.d + m10.y;
            i10 = m10.B;
        }
        f11 = f10 + (i10 / 2.0f);
        f9 = f11;
        tnVar.ab(q82, (MessageObject) this.b, (fk0) this.c, view, f12, f9, q0Var, false, (q0Var == null && q0Var.a) ? true : z10, z11, false);
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        o5.e0 e0Var = (o5.e0) this.b;
        String str = (String) this.c;
        o5.i iVar = (o5.i) this.d;
        s5.x xVar = (s5.x) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        z5.l.j("Not connected to device", e0Var.F == 2);
        s5.f fVar = (s5.f) xVar.u();
        Parcel M0 = fVar.M0();
        M0.writeString(str);
        com.google.android.gms.internal.cast.u.c(M0, iVar);
        fVar.R0(M0, 13);
        synchronized (e0Var.r) {
            try {
                if (e0Var.o != null) {
                    e0Var.i(2477);
                }
                e0Var.o = taskCompletionSource;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // t0.h
    public Uri c() {
        return (Uri) this.b;
    }

    @Override // org.telegram.ui.yp0
    public /* synthetic */ boolean e() {
        return true;
    }

    @Override // t0.h
    public Uri f() {
        return (Uri) this.d;
    }

    @Override // org.telegram.ui.yp0
    public void g() {
        ((jk) this.d).M.x();
    }

    @Override // t0.h
    public ClipDescription getDescription() {
        return (ClipDescription) this.c;
    }

    @Override // org.telegram.ui.yp0
    public void h(int i10, boolean z10, boolean z11) {
        if (z10) {
            return;
        }
        jk jkVar = (jk) this.d;
        HashMap hashMap = (HashMap) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        ni niVar = jkVar.b;
        if (hashMap.isEmpty() || jkVar.M == null || jkVar.G) {
            return;
        }
        jkVar.G = true;
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            Object obj = hashMap.get(arrayList.get(i11));
            SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
            arrayList2.add(sendingMediaInfo);
            if (obj instanceof MediaController.PhotoEntry) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                String str = photoEntry.imagePath;
                if (str != null) {
                    sendingMediaInfo.path = str;
                } else {
                    sendingMediaInfo.path = photoEntry.path;
                }
                sendingMediaInfo.thumbPath = photoEntry.thumbPath;
                sendingMediaInfo.coverPath = photoEntry.coverPath;
                sendingMediaInfo.videoEditedInfo = photoEntry.editedInfo;
                sendingMediaInfo.isVideo = photoEntry.isVideo;
                CharSequence charSequence = photoEntry.caption;
                sendingMediaInfo.caption = charSequence != null ? charSequence.toString() : null;
                sendingMediaInfo.entities = photoEntry.entities;
                sendingMediaInfo.masks = photoEntry.stickers;
                sendingMediaInfo.ttl = photoEntry.ttl;
            }
        }
        c5.a0(niVar.F1, niVar.j1() + arrayList2.size(), niVar.n1(), new q2(i10, 1, jkVar, arrayList2, z11));
    }

    @Override // t9.a
    public /* bridge */ /* synthetic */ t9.a i(Class cls, s9.d dVar) {
        ((HashMap) this.b).put(cls, dVar);
        ((HashMap) this.c).remove(cls);
        return this;
    }

    @Override // org.telegram.ui.Components.ek0
    public /* synthetic */ boolean j() {
        return true;
    }

    @Override // t0.h
    public Object k() {
        return null;
    }

    public Object o(Bitmap bitmap) {
        rg.a aVar = (rg.a) this.b;
        if (aVar.a(bitmap)) {
            this.d = ((rg.b) this.c).a(bitmap);
            aVar.b(bitmap);
        }
        return this.d;
    }

    @Override // org.telegram.ui.Components.u61
    public void onError(x61 x61Var, Exception exc) {
        g9 g9Var = ((f6) this.d).J;
        if (g9Var != null) {
            g9Var.run();
        }
    }

    @Override // org.telegram.ui.Components.u61
    public /* synthetic */ void onRenderedFirstFrame(k3.a aVar) {
    }

    @Override // org.telegram.ui.Components.u61
    public void onStateChanged(boolean z10, int i10) {
        f6 f6Var = (f6) this.d;
        a6 a6Var = f6Var.G;
        x61 x61Var = f6Var.e;
        if (x61Var == null) {
            return;
        }
        if (x61Var.z()) {
            AndroidUtilities.runOnUIThread(a6Var);
        } else {
            AndroidUtilities.cancelRunOnUIThread(a6Var);
        }
    }

    @Override // org.telegram.ui.Components.u61
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.u61
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((f6) this.d).i();
    }

    @Override // org.telegram.ui.Components.u61
    public void onVideoSizeChanged(int i10, int i11, int i12, float f9) {
        f6 f6Var = (f6) this.d;
        o7 o7Var = (o7) this.b;
        if (o7Var != null) {
            n7 r6 = f6Var.e.r(o7Var.d1);
            o7Var.d1 = r6;
            l61 l61Var = f6Var.n;
            if (l61Var != null) {
                l61Var.setHDRInfo(r6);
            }
        }
        int i13 = (int) (i10 * f9);
        f6Var.f = i13;
        int i14 = (int) (i11 * f9);
        f6Var.h = i14;
        if (o7Var != null && (o7Var.k0 != i13 || o7Var.l0 != i14)) {
            o7Var.k0 = i13;
            o7Var.l0 = i14;
            o7Var.A();
        }
        f6Var.b();
        l61 l61Var2 = f6Var.n;
        if (l61Var2 != null) {
            int i15 = f6Var.f;
            int i16 = f6Var.h;
            l61Var2.d = i15;
            l61Var2.e = i16;
            qz qzVar = l61Var2.b;
            if (qzVar == null) {
                return;
            }
            qzVar.postRunnable(new mz(qzVar, i15, i16, 0));
        }
    }

    public ColorStateList p(int i10) {
        int resourceId;
        ColorStateList a2;
        TypedArray typedArray = (TypedArray) this.c;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (a2 = s7.a((Context) this.b, resourceId)) == null) ? typedArray.getColorStateList(i10) : a2;
    }

    public Drawable q(int i10) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.c;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0) ? typedArray.getDrawable(i10) : s7.b((Context) this.b, resourceId);
    }

    public Drawable r(int i10) {
        int resourceId;
        Drawable f9;
        if (!((TypedArray) this.c).hasValue(i10) || (resourceId = ((TypedArray) this.c).getResourceId(i10, 0)) == 0) {
            return null;
        }
        m.r a2 = m.r.a();
        Context context = (Context) this.b;
        synchronized (a2) {
            f9 = a2.a.f(resourceId, context, true);
        }
        return f9;
    }

    public Typeface s(int i10, int i11, f5.b0 b0Var) {
        f5.b0 b0Var2;
        XmlPullParserException xmlPullParserException;
        IOException iOException;
        int resourceId = ((TypedArray) this.c).getResourceId(i10, 0);
        if (resourceId != 0) {
            if (((TypedValue) this.d) == null) {
                this.d = new TypedValue();
            }
            Context context = (Context) this.b;
            TypedValue typedValue = (TypedValue) this.d;
            ThreadLocal threadLocal = h0.k.a;
            if (!context.isRestricted()) {
                Resources resources = context.getResources();
                resources.getValue(resourceId, typedValue, true);
                CharSequence charSequence = typedValue.string;
                if (charSequence == null) {
                    throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(resourceId) + "\" (" + Integer.toHexString(resourceId) + ") is not a Font: " + typedValue);
                }
                String charSequence2 = charSequence.toString();
                if (!charSequence2.startsWith("res/")) {
                    b0Var.a();
                    return null;
                }
                int i12 = typedValue.assetCookie;
                a0.j jVar = i0.e.b;
                Typeface typeface = (Typeface) jVar.a(i0.e.b(resources, resourceId, charSequence2, i12, i11));
                int i13 = 16;
                if (typeface != null) {
                    new Handler(Looper.getMainLooper()).post(new ef.c(i13, b0Var, typeface));
                    return typeface;
                }
                try {
                    if (!charSequence2.toLowerCase().endsWith(".xml")) {
                        b0Var2 = b0Var;
                        try {
                            int i14 = typedValue.assetCookie;
                            Typeface e10 = i0.e.a.e(context, resources, resourceId, charSequence2, i11);
                            if (e10 != null) {
                                jVar.b(i0.e.b(resources, resourceId, charSequence2, i14, i11), e10);
                            }
                            if (e10 != null) {
                                new Handler(Looper.getMainLooper()).post(new ef.c(i13, b0Var2, e10));
                            } else {
                                b0Var2.a();
                            }
                            return e10;
                        } catch (IOException e11) {
                            e = e11;
                            iOException = e;
                            Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                            b0Var2.a();
                            return null;
                        } catch (XmlPullParserException e12) {
                            e = e12;
                            xmlPullParserException = e;
                            Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                            b0Var2.a();
                            return null;
                        }
                    }
                    h0.d g10 = h0.b.g(resources.getXml(resourceId), resources);
                    if (g10 != null) {
                        try {
                            return i0.e.a(context, g10, resources, resourceId, charSequence2, typedValue.assetCookie, i11, b0Var);
                        } catch (IOException e13) {
                            e = e13;
                            b0Var2 = b0Var;
                            iOException = e;
                            Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                            b0Var2.a();
                            return null;
                        } catch (XmlPullParserException e14) {
                            e = e14;
                            b0Var2 = b0Var;
                            xmlPullParserException = e;
                            Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                            b0Var2.a();
                            return null;
                        }
                    }
                    try {
                        Log.e("ResourcesCompat", "Failed to find font-family tag");
                        b0Var.a();
                        return null;
                    } catch (IOException e15) {
                        iOException = e15;
                        b0Var2 = b0Var;
                        Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                        b0Var2.a();
                        return null;
                    } catch (XmlPullParserException e16) {
                        xmlPullParserException = e16;
                        b0Var2 = b0Var;
                        Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                        b0Var2.a();
                        return null;
                    }
                } catch (IOException e17) {
                    e = e17;
                    b0Var2 = b0Var;
                } catch (XmlPullParserException e18) {
                    e = e18;
                    b0Var2 = b0Var;
                }
            }
        }
        return null;
    }

    public void t(t7.f fVar) {
        try {
            u7.g gVar = (u7.g) this.c;
            t7.i iVar = new t7.i(fVar);
            Parcel M0 = gVar.M0();
            e7.b.c(M0, iVar);
            gVar.Q0(M0, 9);
        } catch (RemoteException e10) {
            throw new a6.b(e10);
        }
    }

    public String toString() {
        switch (this.a) {
            case 9:
                return (String) this.b;
            case 28:
                StringBuilder sb2 = new StringBuilder();
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                tb.f fVar = null;
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    tb.f fVar2 = (tb.f) obj;
                    if (fVar != null) {
                        sb2.append(",");
                    }
                    sb2.append(fVar2.toString());
                    fVar = fVar2;
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public int u(rb.e eVar) {
        ArrayList arrayList = (ArrayList) this.b;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            tb.f fVar = (tb.f) obj;
            int i12 = fVar.d;
            rb.d dVar = fVar.a;
            int a2 = dVar.a(eVar);
            int i13 = a2 + 4;
            int ordinal = dVar.ordinal();
            if (ordinal != 1) {
                if (ordinal == 2) {
                    i13 = ((i12 / 2) * 11) + i13 + (i12 % 2 != 1 ? 0 : 6);
                } else if (ordinal == 4) {
                    i13 += fVar.a() * 8;
                } else if (ordinal == 5) {
                    i13 = a2 + 12;
                } else if (ordinal == 6) {
                    i13 += i12 * 13;
                }
            } else {
                int i14 = ((i12 / 3) * 10) + i13;
                int i15 = i12 % 3;
                i13 = i14 + (i15 != 1 ? i15 == 2 ? 7 : 0 : 4);
            }
            i10 += i13;
        }
        return i10;
    }

    public boolean v() {
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

    @Override // org.telegram.ui.Components.ek0
    public /* synthetic */ boolean w() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x009a, code lost:
    
        if (r1.d != r11) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x009d, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00c4, code lost:
    
        if (r1.d != r11) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041 A[Catch: all -> 0x0045, TryCatch #0 {all -> 0x0045, blocks: (B:8:0x0016, B:10:0x002b, B:13:0x0032, B:14:0x003a, B:16:0x0041, B:17:0x0049, B:20:0x0051, B:23:0x0057, B:26:0x005d, B:28:0x0060, B:32:0x0063), top: B:7:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057 A[Catch: all -> 0x0045, TryCatch #0 {all -> 0x0045, blocks: (B:8:0x0016, B:10:0x002b, B:13:0x0032, B:14:0x003a, B:16:0x0041, B:17:0x0049, B:20:0x0051, B:23:0x0057, B:26:0x005d, B:28:0x0060, B:32:0x0063), top: B:7:0x0016 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void x(com.google.android.exoplayer2.upstream.m mVar, Uri uri, Map map, long j10, long j11, l4.r0 r0Var) {
        String str;
        int w10;
        int x4;
        int i10;
        o3.k[] kVarArr;
        o3.h hVar = new o3.h(mVar, j10, j11);
        this.d = hVar;
        if (((o3.k) this.c) != null) {
            return;
        }
        o3.i iVar = (o3.i) this.b;
        synchronized (iVar) {
            try {
                int[] iArr = o3.i.b;
                ArrayList arrayList = new ArrayList(16);
                List list = (List) map.get("Content-Type");
                if (list != null && !list.isEmpty()) {
                    str = (String) list.get(0);
                    w10 = f5.a.w(str);
                    if (w10 != -1) {
                        iVar.a(w10, arrayList);
                    }
                    x4 = f5.a.x(uri);
                    if (x4 != -1 && x4 != w10) {
                        iVar.a(x4, arrayList);
                    }
                    for (i10 = 0; i10 < 16; i10++) {
                        int i11 = iArr[i10];
                        if (i11 != w10 && i11 != x4) {
                            iVar.a(i11, arrayList);
                        }
                    }
                    kVarArr = (o3.k[]) arrayList.toArray(new o3.k[arrayList.size()]);
                }
                str = null;
                w10 = f5.a.w(str);
                if (w10 != -1) {
                }
                x4 = f5.a.x(uri);
                if (x4 != -1) {
                    iVar.a(x4, arrayList);
                }
                while (i10 < 16) {
                }
                kVarArr = (o3.k[]) arrayList.toArray(new o3.k[arrayList.size()]);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        boolean z10 = true;
        if (kVarArr.length == 1) {
            this.c = kVarArr[0];
        } else {
            int length = kVarArr.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    break;
                }
                o3.k kVar = kVarArr[i12];
                try {
                } catch (EOFException unused) {
                    if (((o3.k) this.c) == null) {
                    }
                } catch (Throwable th3) {
                    if (((o3.k) this.c) == null && hVar.d != j10) {
                        z10 = false;
                    }
                    f5.a.i(z10);
                    hVar.f = 0;
                    throw th3;
                }
                if (kVar.e(hVar)) {
                    this.c = kVar;
                    hVar.f = 0;
                    break;
                } else {
                    if (((o3.k) this.c) == null) {
                    }
                    boolean z11 = true;
                    f5.a.i(z11);
                    hVar.f = 0;
                    i12++;
                }
            }
            if (((o3.k) this.c) == null) {
                StringBuilder sb2 = new StringBuilder("None of the available extractors (");
                int i13 = f5.d0.a;
                StringBuilder sb3 = new StringBuilder();
                for (int i14 = 0; i14 < kVarArr.length; i14++) {
                    sb3.append(kVarArr[i14].getClass().getSimpleName());
                    if (i14 < kVarArr.length - 1) {
                        sb3.append(", ");
                    }
                }
                sb2.append(sb3.toString());
                sb2.append(") could read the stream.");
                throw new l1(sb2.toString(), null, false, 1);
            }
        }
        ((o3.k) this.c).i(r0Var);
    }

    public String y() {
        if (!v()) {
            throw new NoSuchElementException();
        }
        String str = (String) this.d;
        this.d = null;
        return str;
    }

    public /* synthetic */ g0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    @Override // org.telegram.ui.Components.u61
    public void onRenderedFirstFrame() {
        o7 o7Var = (o7) this.b;
        Runnable[] runnableArr = (Runnable[]) this.c;
        f6 f6Var = (f6) this.d;
        e6 e6Var = f6Var.D;
        if (e6Var != null && e6Var.g) {
            int i10 = f6Var.f;
            int i11 = f6Var.h;
            e6Var.d = true;
            e6Var.e = i10;
            e6Var.f = i11;
            t1 t1Var = e6Var.c;
            if (t1Var != null) {
                t1Var.run(Integer.valueOf(i10), Integer.valueOf(e6Var.f));
            }
        }
        Runnable runnable = runnableArr[0];
        if (runnable == null) {
            l61 l61Var = f6Var.n;
            if (l61Var != null) {
                if (e6Var == null || !e6Var.g) {
                    l61Var.animate().alpha(1.0f).setDuration(180L).withEndAction(new b6(2, this, o7Var)).start();
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
            if (o7Var.M0 == f6Var.a) {
                o7Var.M0 = null;
            }
            f6Var.a = null;
            f6Var.invalidate();
        }
    }

    public /* synthetic */ g0(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public g0(int i10) {
        this.a = i10;
        switch (i10) {
            case 14:
                this.b = new HashMap();
                this.c = new HashMap();
                this.d = new HashMap();
                break;
            default:
                this.b = new HashMap();
                this.c = new HashMap();
                this.d = l7.x.c;
                break;
        }
    }

    public g0(CastDevice castDevice, p5.d0 d0Var) {
        this.a = 12;
        z5.l.i(castDevice, "CastDevice parameter cannot be null");
        this.b = castDevice;
        this.c = d0Var;
    }

    public g0(q5.h hVar) {
        this.a = 22;
        this.d = hVar;
        this.c = new AtomicLong((s5.a.b.nextLong() & 65535) * 10000);
    }

    public g0(t7.d dVar, u7.g gVar) {
        this.a = 27;
        this.c = gVar;
        z5.l.h(dVar);
        this.b = dVar;
    }

    public g0(rg.b bVar) {
        this.a = 25;
        this.b = new rg.a();
        this.c = bVar;
    }

    public g0(ja.b bVar, sc.h hVar) {
        this.a = 7;
        this.b = bVar;
        this.c = hVar;
        this.d = "firebase-settings.crashlytics.com";
    }

    public g0(String str, mb.j[] jVarArr) {
        this.a = 9;
        System.currentTimeMillis();
        this.b = str;
        this.c = jVarArr;
        this.d = null;
    }

    @Override // org.telegram.ui.Components.ek0
    public /* synthetic */ void H() {
    }

    @Override // org.telegram.ui.yp0
    public void a() {
    }

    @Override // t0.h
    public void d() {
    }

    @Override // t0.h
    public void l() {
    }

    public g0(o3.i iVar) {
        this.a = 1;
        this.b = iVar;
    }

    @Override // org.telegram.ui.yp0
    public void b(Editable editable) {
    }

    @Override // org.telegram.ui.Components.u61
    public /* synthetic */ void onSeekFinished(k3.a aVar) {
    }

    @Override // org.telegram.ui.Components.u61
    public /* synthetic */ void onSeekStarted(k3.a aVar) {
    }

    public g0(File file) {
        this.a = 21;
        this.b = file;
        this.c = new File(file.getPath() + ".new");
        this.d = new File(file.getPath() + ".bak");
    }

    public g0(Runnable runnable) {
        this.a = 23;
        this.c = new CopyOnWriteArrayList();
        this.d = new HashMap();
        this.b = runnable;
    }

    public g0(Context context, TypedArray typedArray) {
        this.a = 8;
        this.b = context;
        this.c = typedArray;
    }

    public g0(j[] jVarArr) {
        this.a = 0;
        r0 r0Var = new r0();
        t0 t0Var = new t0();
        t0Var.c = 1.0f;
        t0Var.d = 1.0f;
        h hVar = h.e;
        t0Var.e = hVar;
        t0Var.f = hVar;
        t0Var.g = hVar;
        t0Var.h = hVar;
        ByteBuffer byteBuffer = j.a;
        t0Var.k = byteBuffer;
        t0Var.l = byteBuffer.asShortBuffer();
        t0Var.m = byteBuffer;
        t0Var.b = -1;
        j[] jVarArr2 = new j[jVarArr.length + 2];
        this.b = jVarArr2;
        System.arraycopy(jVarArr, 0, jVarArr2, 0, jVarArr.length);
        this.c = r0Var;
        this.d = t0Var;
        jVarArr2[jVarArr.length] = r0Var;
        jVarArr2[jVarArr.length + 1] = t0Var;
    }

    public g0(o1.a aVar) {
        this.a = 11;
        this.a = 11;
        this.b = aVar;
        this.c = Choreographer.getInstance();
        this.d = new o1.b(this, 0);
    }

    public g0(ab.m mVar, rb.e eVar, tb.e eVar2) {
        rb.d dVar;
        int i10;
        int i11;
        this.a = 28;
        this.d = mVar;
        this.b = new ArrayList();
        tb.e eVar3 = eVar2;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            dVar = rb.d.n;
            if (eVar3 == null) {
                break;
            }
            int i14 = eVar3.c;
            int i15 = i12 + eVar3.d;
            tb.e eVar4 = eVar3.e;
            int i16 = i13;
            rb.d dVar2 = eVar3.a;
            boolean z10 = (dVar2 == rb.d.h && eVar4 == null && i14 != 0) || !(eVar4 == null || i14 == eVar4.c);
            i10 = z10 ? 1 : i16;
            if (eVar4 == null || eVar4.a != dVar2 || z10) {
                ((ArrayList) this.b).add(0, new tb.f(this, dVar2, eVar3.b, i14, i15));
                i11 = 0;
            } else {
                i11 = i15;
            }
            if (z10) {
                ((ArrayList) this.b).add(0, new tb.f(this, dVar, eVar3.b, eVar3.c, 0));
            }
            i13 = i10;
            eVar3 = eVar4;
            i12 = i11;
        }
        int i17 = i13;
        boolean z11 = mVar.a;
        rb.b bVar = (rb.b) mVar.d;
        if (z11) {
            tb.f fVar = (tb.f) ((ArrayList) this.b).get(0);
            if (fVar != null && fVar.a != dVar && i17 != 0) {
                ((ArrayList) this.b).add(0, new tb.f(this, dVar, 0, 0, 0));
            }
            ((ArrayList) this.b).add(((tb.f) ((ArrayList) this.b).get(0)).a == dVar ? 1 : 0, new tb.f(this, rb.d.s, 0, 0, 0));
        }
        int i18 = eVar.a;
        int i19 = 26;
        int b10 = m1.j.b(i18 <= 9 ? 1 : i18 <= 26 ? 2 : 3);
        if (b10 == 0) {
            i19 = 9;
        } else if (b10 != 1) {
            i10 = 27;
            i19 = 40;
        } else {
            i10 = 10;
        }
        int u10 = u(eVar);
        while (i18 < i19 && !tb.c.c(u10, rb.e.c(i18), bVar)) {
            i18++;
        }
        while (i18 > i10 && tb.c.c(u10, rb.e.c(i18 - 1), bVar)) {
            i18--;
        }
        this.c = rb.e.c(i18);
    }

    public g0(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.a = 24;
        this.c = arrayDeque;
        this.b = bufferedReader;
    }

    public g0(Object[] objArr, Object[] objArr2) {
        this.a = 18;
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
        this.c = n(objArr, iArr);
        this.d = n(objArr2, iArr);
    }

    @Override // org.telegram.ui.Components.ek0
    public /* synthetic */ void G(Canvas canvas, RectF rectF, float f9, float f10, float f11, int i10, boolean z10) {
    }
}
