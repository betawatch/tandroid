package j4;

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
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.tasks.TaskCompletionSource;
import f7.t7;
import ih.j7;
import ih.s2;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.net.URL;
import java.security.Signature;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import kh.a8;
import kh.o6;
import kh.q6;
import kh.r6;
import kh.v9;
import kh.z7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.dy0;
import org.telegram.ui.Components.dz;
import org.telegram.ui.Components.fk;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.hz;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.ry0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.y51;
import org.telegram.ui.qn;
import org.telegram.ui.yp0;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c implements r9.a, h61, com.google.android.gms.common.api.internal.s, tj0, yp0, t0.i {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ c(int i9, boolean z10) {
        this.a = i9;
    }

    public static c E(Context context, AttributeSet attributeSet, int[] iArr, int i9) {
        return new c(context, context.obtainStyledAttributes(attributeSet, iArr, i9, 0));
    }

    public static void H(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e("AtomicFile", "Failed to delete file which is a directory " + file2);
        }
        if (file.renameTo(file2)) {
            return;
        }
        Log.e("AtomicFile", "Failed to rename " + file + " to " + file2);
    }

    public static final URL o(c cVar) {
        Uri.Builder appendPath = new Uri.Builder().scheme("https").authority((String) cVar.d).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        ha.b bVar = (ha.b) cVar.b;
        Uri.Builder appendPath2 = appendPath.appendPath(bVar.a).appendPath("settings");
        ha.a aVar = bVar.b;
        return new URL(appendPath2.appendQueryParameter("build_version", aVar.c).appendQueryParameter("display_version", aVar.b).build().toString());
    }

    public static Object[] q(Object[] objArr, int[] iArr) {
        int length = objArr.length;
        Class<?> componentType = objArr.getClass().getComponentType();
        dy0 dy0Var = ry0.N;
        int i9 = -1;
        for (int i10 : iArr) {
            i9 = Math.max(i9, i10);
        }
        Object[] objArr2 = (Object[]) Array.newInstance(componentType, i9 + 1);
        for (int i11 = 0; i11 < length; i11++) {
            objArr2[iArr[i11]] = objArr[i11];
        }
        return objArr2;
    }

    public int A(pb.e eVar) {
        ArrayList arrayList = (ArrayList) this.b;
        int size = arrayList.size();
        int i9 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            rb.f fVar = (rb.f) obj;
            int i11 = fVar.d;
            pb.d dVar = fVar.a;
            int a2 = dVar.a(eVar);
            int i12 = a2 + 4;
            int ordinal = dVar.ordinal();
            if (ordinal != 1) {
                if (ordinal == 2) {
                    i12 = ((i11 / 2) * 11) + i12 + (i11 % 2 != 1 ? 0 : 6);
                } else if (ordinal == 4) {
                    i12 += fVar.a() * 8;
                } else if (ordinal == 5) {
                    i12 = a2 + 12;
                } else if (ordinal == 6) {
                    i12 += i11 * 13;
                }
            } else {
                int i13 = ((i11 / 3) * 10) + i12;
                int i14 = i11 % 3;
                i12 = i13 + (i14 != 1 ? i14 == 2 ? 7 : 0 : 4);
            }
            i9 += i12;
        }
        return i9;
    }

    public boolean B() {
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
    public void C(com.google.android.exoplayer2.upstream.m mVar, Uri uri, Map map, long j10, long j11, s0 s0Var) {
        String str;
        int w8;
        int x10;
        int i9;
        m3.k[] kVarArr;
        m3.h hVar = new m3.h(mVar, j10, j11);
        this.d = hVar;
        if (((m3.k) this.c) != null) {
            return;
        }
        m3.i iVar = (m3.i) this.b;
        synchronized (iVar) {
            try {
                int[] iArr = m3.i.b;
                ArrayList arrayList = new ArrayList(16);
                List list = (List) map.get("Content-Type");
                if (list != null && !list.isEmpty()) {
                    str = (String) list.get(0);
                    w8 = d5.a.w(str);
                    if (w8 != -1) {
                        iVar.a(w8, arrayList);
                    }
                    x10 = d5.a.x(uri);
                    if (x10 != -1 && x10 != w8) {
                        iVar.a(x10, arrayList);
                    }
                    for (i9 = 0; i9 < 16; i9++) {
                        int i10 = iArr[i9];
                        if (i10 != w8 && i10 != x10) {
                            iVar.a(i10, arrayList);
                        }
                    }
                    kVarArr = (m3.k[]) arrayList.toArray(new m3.k[arrayList.size()]);
                }
                str = null;
                w8 = d5.a.w(str);
                if (w8 != -1) {
                }
                x10 = d5.a.x(uri);
                if (x10 != -1) {
                    iVar.a(x10, arrayList);
                }
                while (i9 < 16) {
                }
                kVarArr = (m3.k[]) arrayList.toArray(new m3.k[arrayList.size()]);
            } catch (Throwable th) {
                throw th;
            }
        }
        boolean z10 = true;
        if (kVarArr.length == 1) {
            this.c = kVarArr[0];
        } else {
            int length = kVarArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                m3.k kVar = kVarArr[i11];
                try {
                } catch (EOFException unused) {
                    if (((m3.k) this.c) == null) {
                    }
                } catch (Throwable th2) {
                    if (((m3.k) this.c) == null && hVar.d != j10) {
                        z10 = false;
                    }
                    d5.a.i(z10);
                    hVar.f = 0;
                    throw th2;
                }
                if (kVar.f(hVar)) {
                    this.c = kVar;
                    hVar.f = 0;
                    break;
                } else {
                    if (((m3.k) this.c) == null) {
                    }
                    boolean z11 = true;
                    d5.a.i(z11);
                    hVar.f = 0;
                    i11++;
                }
            }
            if (((m3.k) this.c) == null) {
                StringBuilder sb2 = new StringBuilder("None of the available extractors (");
                int i12 = d5.f0.a;
                StringBuilder sb3 = new StringBuilder();
                for (int i13 = 0; i13 < kVarArr.length; i13++) {
                    sb3.append(kVarArr[i13].getClass().getSimpleName());
                    if (i13 < kVarArr.length - 1) {
                        sb3.append(", ");
                    }
                }
                sb2.append(sb3.toString());
                sb2.append(") could read the stream.");
                throw new k1(sb2.toString(), null, false, 1);
            }
        }
        ((m3.k) this.c).c(s0Var);
    }

    public String D() {
        if (!B()) {
            throw new NoSuchElementException();
        }
        String str = (String) this.d;
        this.d = null;
        return str;
    }

    public void F(kb.i iVar, Object obj) {
        if (((EnumMap) this.d) == null) {
            this.d = new EnumMap(kb.i.class);
        }
        ((EnumMap) this.d).put((EnumMap) iVar, (kb.i) obj);
    }

    public void G() {
        ((TypedArray) this.c).recycle();
    }

    public FileOutputStream I() {
        File file = (File) this.c;
        File file2 = (File) this.d;
        if (file2.exists()) {
            H(file2, (File) this.b);
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

    public void J(int i9, String str, String str2) {
        ((HashMap) this.b).put(str, str2);
        ((HashMap) this.c).put(str2, str);
        ((HashMap) this.d).put(str, Integer.valueOf(i9));
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        m5.f0 f0Var = (m5.f0) this.b;
        String str = (String) this.c;
        m5.i iVar = (m5.i) this.d;
        q5.x xVar = (q5.x) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        x5.l.j("Not connected to device", f0Var.F == 2);
        q5.f fVar = (q5.f) xVar.u();
        Parcel M0 = fVar.M0();
        M0.writeString(str);
        com.google.android.gms.internal.cast.u.c(M0, iVar);
        fVar.R0(M0, 13);
        synchronized (f0Var.r) {
            try {
                if (f0Var.o != null) {
                    f0Var.i(2477);
                }
                f0Var.o = taskCompletionSource;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // t0.i
    public Uri c() {
        return (Uri) this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0063  */
    @Override // org.telegram.ui.Components.tj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(View view, hg.r0 r0Var, boolean z10, boolean z11) {
        float f10;
        hg.s0 s0Var;
        hg.p0 l10;
        float f11;
        int i9;
        float f12;
        qn qnVar = (qn) this.d;
        org.telegram.ui.Cells.a0 q82 = qnVar.q8(((MessageObject) this.b).getId(), true);
        float f13 = 0.0f;
        if (q82 instanceof t1) {
            hg.s0 s0Var2 = ((t1) q82).J;
            hg.p0 l11 = s0Var2.l(r0Var);
            if (l11 == null) {
                f12 = 0.0f;
                f10 = f12;
                qnVar.ab(q82, (MessageObject) this.b, (uj0) this.c, view, f13, f10, r0Var, false, (r0Var == null && r0Var.a) ? true : z10, z11, false);
            } else {
                f13 = s0Var2.c + l11.x + (l11.A / 2.0f);
                f11 = s0Var2.d + l11.y;
                i9 = l11.B;
            }
        } else if (!(q82 instanceof org.telegram.ui.Cells.w0) || (l10 = (s0Var = ((org.telegram.ui.Cells.w0) q82).y0).l(r0Var)) == null) {
            f10 = 0.0f;
            qnVar.ab(q82, (MessageObject) this.b, (uj0) this.c, view, f13, f10, r0Var, false, (r0Var == null && r0Var.a) ? true : z10, z11, false);
        } else {
            f13 = s0Var.c + l10.x + (l10.A / 2.0f);
            f11 = s0Var.d + l10.y;
            i9 = l10.B;
        }
        f12 = f11 + (i9 / 2.0f);
        f10 = f12;
        qnVar.ab(q82, (MessageObject) this.b, (uj0) this.c, view, f13, f10, r0Var, false, (r0Var == null && r0Var.a) ? true : z10, z11, false);
    }

    @Override // org.telegram.ui.yp0
    public /* synthetic */ boolean e() {
        return true;
    }

    @Override // t0.i
    public Uri g() {
        return (Uri) this.d;
    }

    @Override // org.telegram.ui.yp0
    public void h() {
        ((fk) this.d).M.x();
    }

    @Override // org.telegram.ui.yp0
    public void i(int i9, boolean z10, boolean z11) {
        if (z10) {
            return;
        }
        fk fkVar = (fk) this.d;
        HashMap hashMap = (HashMap) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        ki kiVar = fkVar.b;
        if (hashMap.isEmpty() || fkVar.M == null || fkVar.G) {
            return;
        }
        fkVar.G = true;
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = hashMap.get(arrayList.get(i10));
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
        y4.a0(kiVar.F1, kiVar.j1() + arrayList2.size(), kiVar.n1(), new s2(i9, 1, fkVar, arrayList2, z11));
    }

    @Override // t0.i
    public ClipDescription j() {
        return (ClipDescription) this.c;
    }

    @Override // t0.i
    public Object k() {
        return null;
    }

    @Override // r9.a
    public /* bridge */ /* synthetic */ r9.a l(Class cls, q9.d dVar) {
        ((HashMap) this.b).put(cls, dVar);
        ((HashMap) this.c).remove(cls);
        return this;
    }

    @Override // org.telegram.ui.Components.tj0
    public /* synthetic */ boolean n() {
        return true;
    }

    @Override // org.telegram.ui.Components.h61
    public void onError(k61 k61Var, Exception exc) {
        v9 v9Var = ((r6) this.d).J;
        if (v9Var != null) {
            v9Var.run();
        }
    }

    @Override // org.telegram.ui.Components.h61
    public /* synthetic */ void onRenderedFirstFrame(i3.a aVar) {
    }

    @Override // org.telegram.ui.Components.h61
    public void onStateChanged(boolean z10, int i9) {
        r6 r6Var = (r6) this.d;
        o6 o6Var = r6Var.G;
        k61 k61Var = r6Var.e;
        if (k61Var == null) {
            return;
        }
        if (k61Var.z()) {
            AndroidUtilities.runOnUIThread(o6Var);
        } else {
            AndroidUtilities.cancelRunOnUIThread(o6Var);
        }
    }

    @Override // org.telegram.ui.Components.h61
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.h61
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((r6) this.d).i();
    }

    @Override // org.telegram.ui.Components.h61
    public void onVideoSizeChanged(int i9, int i10, int i11, float f10) {
        r6 r6Var = (r6) this.d;
        a8 a8Var = (a8) this.b;
        if (a8Var != null) {
            z7 r10 = r6Var.e.r(a8Var.d1);
            a8Var.d1 = r10;
            y51 y51Var = r6Var.n;
            if (y51Var != null) {
                y51Var.setHDRInfo(r10);
            }
        }
        int i12 = (int) (i9 * f10);
        r6Var.f = i12;
        int i13 = (int) (i10 * f10);
        r6Var.h = i13;
        if (a8Var != null && (a8Var.k0 != i12 || a8Var.l0 != i13)) {
            a8Var.k0 = i12;
            a8Var.l0 = i13;
            a8Var.A();
        }
        r6Var.b();
        y51 y51Var2 = r6Var.n;
        if (y51Var2 != null) {
            int i14 = r6Var.f;
            int i15 = r6Var.h;
            y51Var2.d = i14;
            y51Var2.e = i15;
            hz hzVar = y51Var2.b;
            if (hzVar == null) {
                return;
            }
            hzVar.postRunnable(new dz(hzVar, i14, i15, 0));
        }
    }

    @Override // org.telegram.ui.Components.tj0
    public /* synthetic */ boolean p() {
        return false;
    }

    public Object r(Bitmap bitmap) {
        og.a aVar = (og.a) this.b;
        if (aVar.a(bitmap)) {
            this.d = ((og.b) this.c).a(bitmap);
            aVar.b(bitmap);
        }
        return this.d;
    }

    public String toString() {
        switch (this.a) {
            case 8:
                return (String) this.b;
            case 27:
                StringBuilder sb2 = new StringBuilder();
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                rb.f fVar = null;
                int i9 = 0;
                while (i9 < size) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    rb.f fVar2 = (rb.f) obj;
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

    @Override // org.telegram.ui.Components.tj0
    public /* synthetic */ boolean u() {
        return false;
    }

    public ColorStateList v(int i9) {
        int resourceId;
        ColorStateList a2;
        TypedArray typedArray = (TypedArray) this.c;
        return (!typedArray.hasValue(i9) || (resourceId = typedArray.getResourceId(i9, 0)) == 0 || (a2 = t7.a((Context) this.b, resourceId)) == null) ? typedArray.getColorStateList(i9) : a2;
    }

    public Drawable w(int i9) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.c;
        return (!typedArray.hasValue(i9) || (resourceId = typedArray.getResourceId(i9, 0)) == 0) ? typedArray.getDrawable(i9) : t7.b((Context) this.b, resourceId);
    }

    public Drawable x(int i9) {
        int resourceId;
        Drawable f10;
        if (!((TypedArray) this.c).hasValue(i9) || (resourceId = ((TypedArray) this.c).getResourceId(i9, 0)) == 0) {
            return null;
        }
        m.r a2 = m.r.a();
        Context context = (Context) this.b;
        synchronized (a2) {
            f10 = a2.a.f(resourceId, context, true);
        }
        return f10;
    }

    public Typeface y(int i9, int i10, d5.d0 d0Var) {
        d5.d0 d0Var2;
        XmlPullParserException xmlPullParserException;
        IOException iOException;
        int resourceId = ((TypedArray) this.c).getResourceId(i9, 0);
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
                    d0Var.a();
                    return null;
                }
                int i11 = typedValue.assetCookie;
                a0.j jVar = i0.e.b;
                Typeface typeface = (Typeface) jVar.a(i0.e.b(resources, resourceId, charSequence2, i11, i10));
                int i12 = 28;
                if (typeface != null) {
                    new Handler(Looper.getMainLooper()).post(new e5.u(i12, d0Var, typeface));
                    return typeface;
                }
                try {
                    if (!charSequence2.toLowerCase().endsWith(".xml")) {
                        d0Var2 = d0Var;
                        try {
                            int i13 = typedValue.assetCookie;
                            Typeface e10 = i0.e.a.e(context, resources, resourceId, charSequence2, i10);
                            if (e10 != null) {
                                jVar.b(i0.e.b(resources, resourceId, charSequence2, i13, i10), e10);
                            }
                            if (e10 != null) {
                                new Handler(Looper.getMainLooper()).post(new e5.u(i12, d0Var2, e10));
                            } else {
                                d0Var2.a();
                            }
                            return e10;
                        } catch (IOException e11) {
                            e = e11;
                            iOException = e;
                            Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                            d0Var2.a();
                            return null;
                        } catch (XmlPullParserException e12) {
                            e = e12;
                            xmlPullParserException = e;
                            Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                            d0Var2.a();
                            return null;
                        }
                    }
                    h0.d g10 = h0.b.g(resources.getXml(resourceId), resources);
                    if (g10 != null) {
                        try {
                            return i0.e.a(context, g10, resources, resourceId, charSequence2, typedValue.assetCookie, i10, d0Var);
                        } catch (IOException e13) {
                            e = e13;
                            d0Var2 = d0Var;
                            iOException = e;
                            Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                            d0Var2.a();
                            return null;
                        } catch (XmlPullParserException e14) {
                            e = e14;
                            d0Var2 = d0Var;
                            xmlPullParserException = e;
                            Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                            d0Var2.a();
                            return null;
                        }
                    }
                    try {
                        Log.e("ResourcesCompat", "Failed to find font-family tag");
                        d0Var.a();
                        return null;
                    } catch (IOException e15) {
                        iOException = e15;
                        d0Var2 = d0Var;
                        Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                        d0Var2.a();
                        return null;
                    } catch (XmlPullParserException e16) {
                        xmlPullParserException = e16;
                        d0Var2 = d0Var;
                        Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                        d0Var2.a();
                        return null;
                    }
                } catch (IOException e17) {
                    e = e17;
                    d0Var2 = d0Var;
                } catch (XmlPullParserException e18) {
                    e = e18;
                    d0Var2 = d0Var;
                }
            }
        }
        return null;
    }

    public void z(r7.f fVar) {
        try {
            s7.g gVar = (s7.g) this.c;
            r7.i iVar = new r7.i(fVar);
            Parcel M0 = gVar.M0();
            c7.b.c(M0, iVar);
            gVar.Q0(M0, 9);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, int i9) {
        this.a = i9;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    @Override // org.telegram.ui.Components.h61
    public void onRenderedFirstFrame() {
        a8 a8Var = (a8) this.b;
        Runnable[] runnableArr = (Runnable[]) this.c;
        r6 r6Var = (r6) this.d;
        q6 q6Var = r6Var.D;
        if (q6Var != null && q6Var.g) {
            int i9 = r6Var.f;
            int i10 = r6Var.h;
            q6Var.d = true;
            q6Var.e = i9;
            q6Var.f = i10;
            yf.w0 w0Var = q6Var.c;
            if (w0Var != null) {
                w0Var.run(Integer.valueOf(i9), Integer.valueOf(q6Var.f));
            }
        }
        Runnable runnable = runnableArr[0];
        if (runnable == null) {
            y51 y51Var = r6Var.n;
            if (y51Var != null) {
                if (q6Var == null || !q6Var.g) {
                    y51Var.animate().alpha(1.0f).setDuration(180L).withEndAction(new j7(19, this, a8Var)).start();
                    return;
                }
                return;
            }
            return;
        }
        r6Var.post(runnable);
        runnableArr[0] = null;
        Bitmap bitmap = r6Var.a;
        if (bitmap != null) {
            bitmap.recycle();
            if (a8Var.M0 == r6Var.a) {
                a8Var.M0 = null;
            }
            r6Var.a = null;
            r6Var.invalidate();
        }
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, boolean z10, int i9) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public c(int i9) {
        this.a = i9;
        switch (i9) {
            case 13:
                this.b = new HashMap();
                this.c = new HashMap();
                this.d = new HashMap();
                break;
            default:
                this.b = new HashMap();
                this.c = new HashMap();
                this.d = j7.x.c;
                break;
        }
    }

    public c(CastDevice castDevice, n5.f0 f0Var) {
        this.a = 11;
        x5.l.i(castDevice, "CastDevice parameter cannot be null");
        this.b = castDevice;
        this.c = f0Var;
    }

    public c(o5.h hVar) {
        this.a = 15;
        this.d = hVar;
        this.c = new AtomicLong((q5.a.b.nextLong() & 65535) * 10000);
    }

    public c(r7.d dVar, s7.g gVar) {
        this.a = 26;
        this.c = gVar;
        x5.l.h(dVar);
        this.b = dVar;
    }

    public c(og.b bVar) {
        this.a = 16;
        this.b = new og.a();
        this.c = bVar;
    }

    public c(ha.b bVar, qc.h hVar) {
        this.a = 6;
        this.b = bVar;
        this.c = hVar;
        this.d = "firebase-settings.crashlytics.com";
    }

    public c(String str, kb.j[] jVarArr) {
        this.a = 8;
        System.currentTimeMillis();
        this.b = str;
        this.c = jVarArr;
        this.d = null;
    }

    @Override // org.telegram.ui.yp0
    public void a() {
    }

    @Override // t0.i
    public void f() {
    }

    @Override // t0.i
    public void m() {
    }

    @Override // org.telegram.ui.Components.tj0
    public /* synthetic */ void t() {
    }

    public c(m3.i iVar) {
        this.a = 0;
        this.b = iVar;
    }

    @Override // org.telegram.ui.yp0
    public void b(Editable editable) {
    }

    @Override // org.telegram.ui.Components.h61
    public /* synthetic */ void onSeekFinished(i3.a aVar) {
    }

    @Override // org.telegram.ui.Components.h61
    public /* synthetic */ void onSeekStarted(i3.a aVar) {
    }

    public c(File file) {
        this.a = 24;
        this.b = file;
        this.c = new File(file.getPath() + ".new");
        this.d = new File(file.getPath() + ".bak");
    }

    public c(Runnable runnable) {
        this.a = 25;
        this.c = new CopyOnWriteArrayList();
        this.d = new HashMap();
        this.b = runnable;
    }

    public c(Context context, TypedArray typedArray) {
        this.a = 10;
        this.b = context;
        this.c = typedArray;
    }

    public c(Signature signature) {
        this.a = 7;
        this.b = signature;
        this.c = null;
        this.d = null;
    }

    public c(m5.c0 c0Var) {
        this.a = 14;
        this.a = 14;
        this.b = c0Var;
        this.c = Choreographer.getInstance();
        this.d = new o1.a(this, 0);
    }

    public c(Cipher cipher) {
        this.a = 7;
        this.c = cipher;
        this.b = null;
        this.d = null;
    }

    public c(Mac mac) {
        this.a = 7;
        this.d = mac;
        this.c = null;
        this.b = null;
    }

    public c(com.google.firebase.messaging.l lVar, pb.e eVar, rb.e eVar2) {
        pb.d dVar;
        int i9;
        int i10;
        this.a = 27;
        this.d = lVar;
        this.b = new ArrayList();
        rb.e eVar3 = eVar2;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            dVar = pb.d.n;
            if (eVar3 == null) {
                break;
            }
            int i13 = eVar3.c;
            int i14 = i11 + eVar3.d;
            rb.e eVar4 = eVar3.e;
            int i15 = i12;
            pb.d dVar2 = eVar3.a;
            boolean z10 = (dVar2 == pb.d.h && eVar4 == null && i13 != 0) || !(eVar4 == null || i13 == eVar4.c);
            i9 = z10 ? 1 : i15;
            if (eVar4 == null || eVar4.a != dVar2 || z10) {
                ((ArrayList) this.b).add(0, new rb.f(this, dVar2, eVar3.b, i13, i14));
                i10 = 0;
            } else {
                i10 = i14;
            }
            if (z10) {
                ((ArrayList) this.b).add(0, new rb.f(this, dVar, eVar3.b, eVar3.c, 0));
            }
            i12 = i9;
            eVar3 = eVar4;
            i11 = i10;
        }
        int i16 = i12;
        boolean z11 = lVar.a;
        pb.b bVar = (pb.b) lVar.d;
        if (z11) {
            rb.f fVar = (rb.f) ((ArrayList) this.b).get(0);
            if (fVar != null && fVar.a != dVar && i16 != 0) {
                ((ArrayList) this.b).add(0, new rb.f(this, dVar, 0, 0, 0));
            }
            ((ArrayList) this.b).add(((rb.f) ((ArrayList) this.b).get(0)).a == dVar ? 1 : 0, new rb.f(this, pb.d.s, 0, 0, 0));
        }
        int i17 = eVar.a;
        int i18 = 26;
        int b10 = m1.j.b(i17 <= 9 ? 1 : i17 <= 26 ? 2 : 3);
        if (b10 == 0) {
            i18 = 9;
        } else if (b10 != 1) {
            i9 = 27;
            i18 = 40;
        } else {
            i9 = 10;
        }
        int A = A(eVar);
        while (i17 < i18 && !rb.c.c(A, pb.e.c(i17), bVar)) {
            i17++;
        }
        while (i17 > i9 && rb.c.c(A, pb.e.c(i17 - 1), bVar)) {
            i17--;
        }
        this.c = pb.e.c(i17);
    }

    public c(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.a = 23;
        this.c = arrayDeque;
        this.b = bufferedReader;
    }

    public c(Object[] objArr, Object[] objArr2) {
        this.a = 20;
        int length = objArr.length;
        int[] iArr = new int[length];
        HashMap hashMap = new HashMap();
        for (int i9 = 0; i9 < length; i9++) {
            Object obj = objArr[i9];
            Integer num = (Integer) hashMap.get(obj);
            if (num == null) {
                num = Integer.valueOf(hashMap.size());
                hashMap.put(obj, num);
            }
            iArr[i9] = num.intValue();
        }
        this.b = iArr;
        this.c = q(objArr, iArr);
        this.d = q(objArr2, iArr);
    }

    @Override // org.telegram.ui.Components.tj0
    public /* synthetic */ void s(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i9, boolean z10) {
    }
}
