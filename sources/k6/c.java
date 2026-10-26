package k6;

import a8.ed;
import a8.kc;
import a8.me;
import a8.yb;
import aa.b0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.session.v;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.Choreographer;
import android.view.View;
import b2.h0;
import b2.p0;
import b2.s0;
import bh.v0;
import bh.x0;
import bh.y0;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.q;
import di.x2;
import e2.j0;
import e2.q0;
import f9.g2;
import f9.l0;
import f9.t0;
import g2.o;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledFuture;
import java.util.zip.InflaterInputStream;
import k9.y;
import li.e3;
import m.r3;
import m5.t;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.c01;
import org.telegram.ui.Components.e81;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.nk;
import org.telegram.ui.Components.q01;
import org.telegram.ui.Components.ti;
import org.telegram.ui.qq0;
import org.telegram.ui.un;
import org.xmlpull.v1.XmlPullParserException;
import u7.s;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public /* synthetic */ class c implements OnCompleteListener, o5.b, el0, qq0 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ c(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.d = obj;
        this.b = obj2;
    }

    public static c D(Context context, AttributeSet attributeSet, int[] iArr, int i10) {
        return new c(context, context.obtainStyledAttributes(attributeSet, iArr, i10, 0));
    }

    public static void G(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e("AtomicFile", "Failed to delete file which is a directory " + file2);
        }
        if (file.renameTo(file2)) {
            return;
        }
        Log.e("AtomicFile", "Failed to rename " + file + " to " + file2);
    }

    public static c h(View view) {
        return new c(view);
    }

    public static Object[] q(Object[] objArr, int[] iArr) {
        int length = objArr.length;
        Class<?> componentType = objArr.getClass().getComponentType();
        c01 c01Var = q01.R;
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

    public static n2.e r(h0 h0Var) {
        o oVar = new o();
        oVar.c = null;
        Uri uri = h0Var.b;
        String uri2 = uri == null ? null : uri.toString();
        boolean z10 = h0Var.f;
        c2.b bVar = new c2.b();
        yb.g((z10 && TextUtils.isEmpty(uri2)) ? false : true);
        bVar.b = oVar;
        bVar.c = uri2;
        bVar.a = z10;
        bVar.d = new HashMap();
        l0 l0Var = h0Var.c;
        t0 t0Var = l0Var.a;
        if (t0Var == null) {
            t0Var = l0Var.b();
            l0Var.a = t0Var;
        }
        g2 it = t0Var.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            str.getClass();
            str2.getClass();
            synchronized (((HashMap) bVar.d)) {
                ((HashMap) bVar.d).put(str, str2);
            }
        }
        HashMap hashMap = new HashMap();
        int i10 = b2.n.a;
        s sVar = new s(26);
        UUID uuid = h0Var.a;
        uuid.getClass();
        boolean z11 = h0Var.d;
        boolean z12 = h0Var.e;
        int[] f7 = ed.f(h0Var.g);
        int length = f7.length;
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = f7[i11];
            yb.g(i12 == 2 || i12 == 1);
        }
        n2.e eVar = new n2.e(uuid, bVar, hashMap, z11, (int[]) f7.clone(), z12, sVar);
        byte[] bArr = h0Var.h;
        byte[] copyOf = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        yb.p(eVar.w.isEmpty());
        eVar.K = copyOf;
        return eVar;
    }

    public int A(jc.f fVar) {
        ArrayList arrayList = (ArrayList) this.b;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            lc.f fVar2 = (lc.f) obj;
            int i12 = fVar2.d;
            jc.e eVar = fVar2.a;
            int a2 = eVar.a(fVar);
            int i13 = a2 + 4;
            int ordinal = eVar.ordinal();
            if (ordinal != 1) {
                if (ordinal == 2) {
                    i13 = ((i12 / 2) * 11) + i13 + (i12 % 2 != 1 ? 0 : 6);
                } else if (ordinal == 4) {
                    i13 += fVar2.a() * 8;
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

    public boolean B() {
        String trim;
        ArrayDeque arrayDeque = (ArrayDeque) this.d;
        if (((String) this.c) == null) {
            if (!arrayDeque.isEmpty()) {
                String str = (String) arrayDeque.poll();
                str.getClass();
                this.c = str;
                return true;
            }
            do {
                String readLine = ((BufferedReader) this.b).readLine();
                this.c = readLine;
                if (readLine == null) {
                    return false;
                }
                trim = readLine.trim();
                this.c = trim;
            } while (trim.isEmpty());
        }
        return true;
    }

    public String C() {
        if (!B()) {
            throw new NoSuchElementException();
        }
        String str = (String) this.c;
        this.c = null;
        return str;
    }

    public void E() {
        ((TypedArray) this.c).recycle();
    }

    public void F(rf.g gVar) {
        if (((rf.d) this.b) == null) {
            return;
        }
        for (int i10 = 0; i10 < gVar.a.size(); i10++) {
            rf.d dVar = (rf.d) this.b;
            dVar.h.remove(gVar.a(i10).d);
            dVar.h();
        }
    }

    public void H(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.c = str;
    }

    public void I(rf.a aVar) {
        rf.g gVar;
        rf.g gVar2 = (rf.g) this.c;
        if (gVar2 != null && ((rf.a) this.d) == null && aVar != null) {
            g(gVar2);
        }
        if (((rf.a) this.d) != null && (gVar = (rf.g) this.c) != null && aVar == null) {
            F(gVar);
        }
        rf.a aVar2 = (rf.a) this.d;
        if (aVar2 != null) {
            f6.h hVar = aVar2.a;
            o6.l.e("Must be called from the main thread.");
            hVar.i.remove(aVar2);
        }
        if (aVar != null) {
            aVar.a.p(aVar);
            rf.g gVar3 = (rf.g) this.c;
            if (gVar3 != null) {
                aVar.d = gVar3;
                aVar.g = 0;
                aVar.h = 0;
                aVar.p();
            }
        }
        this.d = aVar;
    }

    public FileOutputStream J() {
        File file = (File) this.c;
        File file2 = (File) this.d;
        if (file2.exists()) {
            G(file2, (File) this.b);
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

    public void K(Object obj, String str) {
        c cVar = new c(13, false);
        ((c) this.d).d = cVar;
        this.d = cVar;
        cVar.b = obj;
        cVar.c = str;
    }

    @Override // org.telegram.ui.qq0
    public void c() {
        ((nk) this.d).Q.x();
    }

    @Override // org.telegram.ui.qq0
    public void d(int i10, boolean z10, boolean z11) {
        if (z10) {
            return;
        }
        nk nkVar = (nk) this.d;
        HashMap hashMap = (HashMap) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        ti tiVar = nkVar.b;
        if (hashMap.isEmpty() || nkVar.Q == null || nkVar.K) {
            return;
        }
        nkVar.K = true;
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
        g5.Z(tiVar.M1, tiVar.o1() + arrayList2.size(), tiVar.s1(), new x2(i10, 2, nkVar, arrayList2, z11));
    }

    @Override // org.telegram.ui.qq0
    public /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.el0
    public /* synthetic */ boolean f() {
        return true;
    }

    public void g(rf.g gVar) {
        if (((rf.d) this.b) == null) {
            this.b = new rf.d();
        }
        for (int i10 = 0; i10 < gVar.a.size(); i10++) {
            rf.d dVar = (rf.d) this.b;
            rf.f a2 = gVar.a(i10);
            dVar.h.put(a2.d, a2);
            dVar.h();
        }
    }

    @Override // id.a
    public Object get() {
        switch (this.a) {
            case 7:
                return new t(new pa.d(), new s(24), (r5.b) ((me) this.b).get(), (b0) ((r3) this.c).get(), (q) ((ti.e) this.d).get());
            default:
                return new s4.d((Context) ((id.a) this.b).get(), (t5.d) ((id.a) this.c).get(), (s5.a) ((s) this.d).get(), 1);
        }
    }

    @Override // org.telegram.ui.Components.el0
    public /* synthetic */ boolean i() {
        return false;
    }

    public m5.i j() {
        String str = ((String) this.c) == null ? " backendName" : "";
        if (((j5.d) this.d) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new m5.i((String) this.c, (byte[]) this.b, (j5.d) this.d);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public String k(int i10, String str, long j10, long j11) {
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

    public void n() {
        android.support.v4.media.session.b0 b0Var = (android.support.v4.media.session.b0) this.b;
        if (b0Var != null) {
            int i10 = ((p4.e) this.d).n.d;
            v vVar = b0Var.a;
            vVar.getClass();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(i10);
            vVar.a.setPlaybackToLocal(builder.build());
            this.c = null;
        }
    }

    @Override // org.telegram.ui.Components.el0
    public /* synthetic */ boolean o() {
        return false;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        a aVar = (a) this.b;
        String str = (String) this.c;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.d;
        synchronized (aVar.a) {
            aVar.a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0063  */
    @Override // org.telegram.ui.Components.el0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void p(View view, x0 x0Var, boolean z10, boolean z11) {
        float f7;
        y0 y0Var;
        v0 l4;
        float f10;
        int i10;
        float f11;
        un unVar = (un) this.d;
        z x82 = unVar.x8(((MessageObject) this.b).getId(), true);
        float f12 = 0.0f;
        if (x82 instanceof s1) {
            y0 y0Var2 = ((s1) x82).N;
            v0 l10 = y0Var2.l(x0Var);
            if (l10 == null) {
                f11 = 0.0f;
                f7 = f11;
                unVar.jb(x82, (MessageObject) this.b, (fl0) this.c, view, f12, f7, x0Var, false, (x0Var == null && x0Var.a) ? true : z10, z11, false);
            } else {
                f12 = y0Var2.c + l10.x + (l10.A / 2.0f);
                f10 = y0Var2.d + l10.y;
                i10 = l10.B;
            }
        } else if (!(x82 instanceof org.telegram.ui.Cells.v0) || (l4 = (y0Var = ((org.telegram.ui.Cells.v0) x82).E0).l(x0Var)) == null) {
            f7 = 0.0f;
            unVar.jb(x82, (MessageObject) this.b, (fl0) this.c, view, f12, f7, x0Var, false, (x0Var == null && x0Var.a) ? true : z10, z11, false);
        } else {
            f12 = y0Var.c + l4.x + (l4.A / 2.0f);
            f10 = y0Var.d + l4.y;
            i10 = l4.B;
        }
        f11 = f10 + (i10 / 2.0f);
        f7 = f11;
        unVar.jb(x82, (MessageObject) this.b, (fl0) this.c, view, f12, f7, x0Var, false, (x0Var == null && x0Var.a) ? true : z10, z11, false);
    }

    public void s(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = (HashMap) this.b;
        na.e eVar = new na.e(byteArrayOutputStream, hashMap, (HashMap) this.c, (ka.d) this.d);
        if (obj == null) {
            return;
        }
        ka.d dVar = (ka.d) hashMap.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, eVar);
        } else {
            throw new ka.b("No encoder for " + obj.getClass());
        }
    }

    public of.e t(of.f fVar) {
        InputStream inputStream;
        int i10 = fVar.c;
        InputStream inputStream2 = (pf.a) this.b;
        if (fVar.d) {
            e3 e3Var = (e3) this.d;
            e3Var.getClass();
            byte[] bArr = new byte[i10];
            int i11 = 0;
            while (i11 < i10) {
                int read = ((com.google.firebase.messaging.d) e3Var.b).read(bArr, i11, i10 - i11);
                if (read <= 0) {
                    throw new EOFException();
                }
                i11 += read;
            }
            int i12 = 0;
            boolean z10 = false;
            for (int i13 = 0; i13 < i10; i13++) {
                byte b10 = bArr[i13];
                if (!z10 || b10 != 0) {
                    bArr[i12] = b10;
                    i12++;
                }
                z10 = b10 == -1;
            }
            inputStream2 = new ByteArrayInputStream(bArr, 0, i12);
            i10 = i12;
        }
        if (fVar.f) {
            throw new of.c("Frame encryption is not supported");
        }
        if (fVar.e) {
            i10 = fVar.g;
            inputStream = new InflaterInputStream(inputStream2);
        } else {
            inputStream = inputStream2;
        }
        return new of.e(inputStream, fVar.b, i10, (of.h) this.c, fVar);
    }

    public String toString() {
        int i10 = 0;
        switch (this.a) {
            case 1:
                StringBuilder sb2 = new StringBuilder();
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                lc.f fVar = null;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    lc.f fVar2 = (lc.f) obj;
                    if (fVar != null) {
                        sb2.append(",");
                    }
                    sb2.append(fVar2.toString());
                    fVar = fVar2;
                }
                return sb2.toString();
            case 14:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.c);
                sb3.append('{');
                c cVar = (c) ((c) this.b).d;
                String str = "";
                while (cVar != null) {
                    Object obj2 = cVar.b;
                    sb3.append(str);
                    String str2 = (String) cVar.c;
                    if (str2 != null) {
                        sb3.append(str2);
                        sb3.append('=');
                    }
                    if (obj2 == null || !obj2.getClass().isArray()) {
                        sb3.append(obj2);
                    } else {
                        sb3.append((CharSequence) Arrays.deepToString(new Object[]{obj2}), 1, r5.length() - 1);
                    }
                    cVar = (c) cVar.d;
                    str = ", ";
                }
                sb3.append('}');
                return sb3.toString();
            case 15:
                StringBuilder sb4 = new StringBuilder("id3v2tag[pos=");
                pf.a aVar = (pf.a) this.b;
                sb4.append(aVar.b);
                sb4.append(", ");
                sb4.append(aVar.e());
                sb4.append(" left]");
                return sb4.toString();
            default:
                return super.toString();
        }
    }

    public n2.m u(p0 p0Var) {
        n2.e eVar;
        p0Var.b.getClass();
        h0 h0Var = p0Var.b.c;
        if (h0Var == null) {
            return n2.m.z;
        }
        synchronized (this.b) {
            try {
                if (!h0Var.equals((h0) this.c)) {
                    this.c = h0Var;
                    this.d = r(h0Var);
                }
                eVar = (n2.e) this.d;
                eVar.getClass();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }

    public ColorStateList v(int i10) {
        int resourceId;
        ColorStateList a2;
        TypedArray typedArray = (TypedArray) this.c;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (a2 = kc.a((Context) this.b, resourceId)) == null) ? typedArray.getColorStateList(i10) : a2;
    }

    public Drawable w(int i10) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.c;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0) ? typedArray.getDrawable(i10) : kc.b((Context) this.b, resourceId);
    }

    public Drawable x(int i10) {
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

    public Typeface y(int i10, int i11, j0 j0Var) {
        j0 j0Var2;
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
                a0.j jVar = i0.e.b;
                Typeface typeface = (Typeface) jVar.a(i0.e.b(resources, resourceId, charSequence2, i12, i11));
                int i13 = 25;
                if (typeface != null) {
                    new Handler(Looper.getMainLooper()).post(new q0(i13, j0Var, typeface));
                    return typeface;
                }
                try {
                    if (!charSequence2.toLowerCase().endsWith(".xml")) {
                        j0Var2 = j0Var;
                        try {
                            int i14 = typedValue.assetCookie;
                            Typeface e = i0.e.a.e(context, resources, resourceId, charSequence2, i11);
                            if (e != null) {
                                jVar.b(i0.e.b(resources, resourceId, charSequence2, i14, i11), e);
                            }
                            if (e != null) {
                                new Handler(Looper.getMainLooper()).post(new q0(i13, j0Var2, e));
                            } else {
                                j0Var2.b();
                            }
                            return e;
                        } catch (IOException e10) {
                            e = e10;
                            iOException = e;
                            Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                            j0Var2.b();
                            return null;
                        } catch (XmlPullParserException e11) {
                            e = e11;
                            xmlPullParserException = e;
                            Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                            j0Var2.b();
                            return null;
                        }
                    }
                    h0.d g7 = h0.b.g(resources.getXml(resourceId), resources);
                    if (g7 != null) {
                        try {
                            return i0.e.a(context, g7, resources, resourceId, charSequence2, typedValue.assetCookie, i11, j0Var);
                        } catch (IOException e12) {
                            e = e12;
                            j0Var2 = j0Var;
                            iOException = e;
                            Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                            j0Var2.b();
                            return null;
                        } catch (XmlPullParserException e13) {
                            e = e13;
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
                    } catch (IOException e14) {
                        iOException = e14;
                        j0Var2 = j0Var;
                        Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                        j0Var2.b();
                        return null;
                    } catch (XmlPullParserException e15) {
                        xmlPullParserException = e15;
                        j0Var2 = j0Var;
                        Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                        j0Var2.b();
                        return null;
                    }
                } catch (IOException e16) {
                    e = e16;
                    j0Var2 = j0Var;
                } catch (XmlPullParserException e17) {
                    e = e17;
                    j0Var2 = j0Var;
                }
            }
        }
        return null;
    }

    public ByteBuffer z() {
        Bitmap bitmap = (Bitmap) this.d;
        if (bitmap == null) {
            return (ByteBuffer) this.c;
        }
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = ((Bitmap) this.d).getHeight();
        int i10 = width * height;
        ((Bitmap) this.d).getPixels(new int[i10], 0, width, 0, 0, width, height);
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = (byte) ((Color.blue(r2[i11]) * 0.114f) + (Color.green(r2[i11]) * 0.587f) + (Color.red(r2[i11]) * 0.299f));
        }
        return ByteBuffer.wrap(bArr);
    }

    public /* synthetic */ c(int i10, boolean z10) {
        this.a = i10;
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public c(String str) {
        this.a = 14;
        c cVar = new c(13, false);
        this.b = cVar;
        this.d = cVar;
        this.c = str;
    }

    public c(InputStream inputStream, long j10, int i10, of.h hVar) {
        this.a = 15;
        pf.a aVar = new pf.a(inputStream, j10, i10);
        this.b = aVar;
        this.d = new e3(aVar, 6);
        this.c = hVar;
    }

    public c(View view) {
        this.a = 20;
        this.d = view;
        e81 e81Var = new e81(this, view);
        this.b = e81Var;
        view.addOnLayoutChangeListener(e81Var);
    }

    public c(int i10) {
        this.a = i10;
        switch (i10) {
            case 28:
                this.b = new a3.l();
                this.c = null;
                this.d = null;
                break;
            default:
                this.b = new Object();
                break;
        }
    }

    public c(File file) {
        this.a = 25;
        this.b = file;
        this.c = new File(file.getPath() + ".new");
        this.d = new File(file.getPath() + ".bak");
    }

    @Override // org.telegram.ui.qq0
    public void a() {
    }

    @Override // org.telegram.ui.Components.el0
    public /* synthetic */ void m() {
    }

    public c(Runnable runnable) {
        this.a = 26;
        this.c = new CopyOnWriteArrayList();
        this.d = new HashMap();
        this.b = runnable;
    }

    @Override // org.telegram.ui.qq0
    public void b(Editable editable) {
    }

    public c(Context context, TypedArray typedArray) {
        this.a = 3;
        this.b = context;
        this.c = typedArray;
    }

    public c(byte[] bArr, y yVar) {
        this.a = 5;
        this.b = bArr;
        this.c = null;
        this.d = yVar;
    }

    public c(s0 s0Var, y yVar) {
        this.a = 5;
        this.b = s0Var.k;
        this.c = s0Var.n;
        this.d = yVar;
    }

    public c(jg.s0 s0Var) {
        this.a = 11;
        this.a = 11;
        this.b = s0Var;
        this.c = Choreographer.getInstance();
        this.d = new o1.a(this, 0);
    }

    public c(c2.b bVar, jc.f fVar, lc.e eVar) {
        jc.e eVar2;
        int i10;
        int i11;
        this.a = 1;
        this.d = bVar;
        this.b = new ArrayList();
        lc.e eVar3 = eVar;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            eVar2 = jc.e.n;
            if (eVar3 == null) {
                break;
            }
            int i14 = eVar3.c;
            int i15 = i12 + eVar3.d;
            lc.e eVar4 = eVar3.e;
            int i16 = i13;
            jc.e eVar5 = eVar3.a;
            boolean z10 = (eVar5 == jc.e.h && eVar4 == null && i14 != 0) || !(eVar4 == null || i14 == eVar4.c);
            i10 = z10 ? 1 : i16;
            if (eVar4 == null || eVar4.a != eVar5 || z10) {
                ((ArrayList) this.b).add(0, new lc.f(this, eVar5, eVar3.b, i14, i15));
                i11 = 0;
            } else {
                i11 = i15;
            }
            if (z10) {
                ((ArrayList) this.b).add(0, new lc.f(this, eVar2, eVar3.b, eVar3.c, 0));
            }
            i13 = i10;
            eVar3 = eVar4;
            i12 = i11;
        }
        int i17 = i13;
        boolean z11 = bVar.a;
        jc.c cVar = (jc.c) bVar.d;
        if (z11) {
            lc.f fVar2 = (lc.f) ((ArrayList) this.b).get(0);
            if (fVar2 != null && fVar2.a != eVar2 && i17 != 0) {
                ((ArrayList) this.b).add(0, new lc.f(this, eVar2, 0, 0, 0));
            }
            ((ArrayList) this.b).add(((lc.f) ((ArrayList) this.b).get(0)).a == eVar2 ? 1 : 0, new lc.f(this, jc.e.s, 0, 0, 0));
        }
        int i18 = fVar.a;
        int i19 = 26;
        int c10 = m1.j.c(i18 <= 9 ? 1 : i18 <= 26 ? 2 : 3);
        if (c10 == 0) {
            i19 = 9;
        } else if (c10 != 1) {
            i10 = 27;
            i19 = 40;
        } else {
            i10 = 10;
        }
        int A = A(fVar);
        while (i18 < i19 && !lc.c.d(A, jc.f.c(i18), cVar)) {
            i18++;
        }
        while (i18 > i10 && lc.c.d(A, jc.f.c(i18 - 1), cVar)) {
            i18--;
        }
        this.c = jc.f.c(i18);
    }

    public c(Object[] objArr, Object[] objArr2) {
        this.a = 19;
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
        this.c = q(objArr, iArr);
        this.d = q(objArr2, iArr);
    }

    @Override // org.telegram.ui.Components.el0
    public /* synthetic */ void l(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
