package j9;

import a0.j;
import a9.p;
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
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.internal.cast.t;
import com.google.android.gms.internal.clearcut.a1;
import com.google.android.gms.tasks.TaskCompletionSource;
import d5.e0;
import d5.u;
import g7.o7;
import h0.d;
import h0.k;
import i0.f;
import ia.b;
import ig.o0;
import ig.q0;
import ig.r0;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.net.URL;
import java.net.URLEncoder;
import java.security.Signature;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.net.ssl.HttpsURLConnection;
import jh.r2;
import lh.m6;
import lh.p6;
import lh.q6;
import lh.s9;
import lh.y7;
import lh.z7;
import m.r;
import m5.f0;
import o5.h;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Cells.a0;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Components.a61;
import org.telegram.ui.Components.bk;
import org.telegram.ui.Components.fy0;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.jz;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.ty0;
import org.telegram.ui.Components.vj0;
import org.telegram.ui.Components.wj0;
import org.telegram.ui.Components.y4;
import org.telegram.ui.rn;
import org.telegram.ui.zp0;
import org.xmlpull.v1.XmlPullParserException;
import qb.e;
import r5.x;
import s3.c;
import t0.i;
import t7.g;
import y5.l;
import zf.w0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class a implements s9.a, j61, s, vj0, zp0, i {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ a(int i10, boolean z10) {
        this.a = i10;
    }

    public static a G(Context context, AttributeSet attributeSet, int[] iArr, int i10) {
        return new a(context, context.obtainStyledAttributes(attributeSet, iArr, i10, 0));
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

    public static final URL p(a aVar) {
        Uri.Builder appendPath = new Uri.Builder().scheme("https").authority((String) aVar.b).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        b bVar = (b) aVar.c;
        Uri.Builder appendPath2 = appendPath.appendPath(bVar.a).appendPath("settings");
        ia.a aVar2 = bVar.b;
        return new URL(appendPath2.appendQueryParameter("build_version", aVar2.c).appendQueryParameter("display_version", aVar2.b).build().toString());
    }

    public static Object[] q(Object[] objArr, int[] iArr) {
        int length = objArr.length;
        Class<?> componentType = objArr.getClass().getComponentType();
        fy0 fy0Var = ty0.N;
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

    public static String u(String str, HashMap hashMap) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = hashMap.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb2.append((String) entry.getKey());
        sb2.append("=");
        sb2.append(entry.getValue() != null ? URLEncoder.encode((String) entry.getValue(), "UTF-8") : "");
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb2.append("&");
            sb2.append((String) entry2.getKey());
            sb2.append("=");
            sb2.append(entry2.getValue() != null ? URLEncoder.encode((String) entry2.getValue(), "UTF-8") : "");
        }
        String sb3 = sb2.toString();
        if (sb3.isEmpty()) {
            return str;
        }
        if (!str.contains("?")) {
            return p.w(str, "?", sb3);
        }
        if (!str.endsWith("&")) {
            sb3 = "&".concat(sb3);
        }
        return c.l(str, sb3);
    }

    public Typeface A(int i10, int i11, e0 e0Var) {
        e0 e0Var2;
        XmlPullParserException xmlPullParserException;
        IOException iOException;
        int resourceId = ((TypedArray) this.c).getResourceId(i10, 0);
        if (resourceId != 0) {
            if (((TypedValue) this.d) == null) {
                this.d = new TypedValue();
            }
            Context context = (Context) this.b;
            TypedValue typedValue = (TypedValue) this.d;
            ThreadLocal threadLocal = k.a;
            if (!context.isRestricted()) {
                Resources resources = context.getResources();
                resources.getValue(resourceId, typedValue, true);
                CharSequence charSequence = typedValue.string;
                if (charSequence == null) {
                    throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(resourceId) + "\" (" + Integer.toHexString(resourceId) + ") is not a Font: " + typedValue);
                }
                String charSequence2 = charSequence.toString();
                if (!charSequence2.startsWith("res/")) {
                    e0Var.a();
                    return null;
                }
                int i12 = typedValue.assetCookie;
                j jVar = f.b;
                Typeface typeface = (Typeface) jVar.a(f.b(resources, resourceId, charSequence2, i12, i11));
                int i13 = 15;
                if (typeface != null) {
                    new Handler(Looper.getMainLooper()).post(new u(i13, e0Var, typeface));
                    return typeface;
                }
                try {
                    if (!charSequence2.toLowerCase().endsWith(".xml")) {
                        e0Var2 = e0Var;
                        try {
                            int i14 = typedValue.assetCookie;
                            Typeface e9 = f.a.e(context, resources, resourceId, charSequence2, i11);
                            if (e9 != null) {
                                jVar.b(f.b(resources, resourceId, charSequence2, i14, i11), e9);
                            }
                            if (e9 != null) {
                                new Handler(Looper.getMainLooper()).post(new u(i13, e0Var2, e9));
                            } else {
                                e0Var2.a();
                            }
                            return e9;
                        } catch (IOException e10) {
                            e = e10;
                            iOException = e;
                            Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                            e0Var2.a();
                            return null;
                        } catch (XmlPullParserException e11) {
                            e = e11;
                            xmlPullParserException = e;
                            Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                            e0Var2.a();
                            return null;
                        }
                    }
                    d g10 = h0.b.g(resources.getXml(resourceId), resources);
                    if (g10 != null) {
                        try {
                            return f.a(context, g10, resources, resourceId, charSequence2, typedValue.assetCookie, i11, e0Var);
                        } catch (IOException e12) {
                            e = e12;
                            e0Var2 = e0Var;
                            iOException = e;
                            Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                            e0Var2.a();
                            return null;
                        } catch (XmlPullParserException e13) {
                            e = e13;
                            e0Var2 = e0Var;
                            xmlPullParserException = e;
                            Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                            e0Var2.a();
                            return null;
                        }
                    }
                    try {
                        Log.e("ResourcesCompat", "Failed to find font-family tag");
                        e0Var.a();
                        return null;
                    } catch (IOException e14) {
                        iOException = e14;
                        e0Var2 = e0Var;
                        Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                        e0Var2.a();
                        return null;
                    } catch (XmlPullParserException e15) {
                        xmlPullParserException = e15;
                        e0Var2 = e0Var;
                        Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                        e0Var2.a();
                        return null;
                    }
                } catch (IOException e16) {
                    e = e16;
                    e0Var2 = e0Var;
                } catch (XmlPullParserException e17) {
                    e = e17;
                    e0Var2 = e0Var;
                }
            }
        }
        return null;
    }

    public void B(s7.f fVar) {
        try {
            g gVar = (g) this.c;
            s7.i iVar = new s7.i(fVar);
            Parcel M0 = gVar.M0();
            d7.b.c(M0, iVar);
            gVar.Q0(M0, 9);
        } catch (RemoteException e9) {
            throw new a7.c(e9);
        }
    }

    public int C(e eVar) {
        ArrayList arrayList = (ArrayList) this.b;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            sb.f fVar = (sb.f) obj;
            int i12 = fVar.d;
            qb.d dVar = fVar.a;
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

    public boolean D() {
        String trim;
        ArrayDeque arrayDeque = (ArrayDeque) this.d;
        if (((String) this.b) == null) {
            if (!arrayDeque.isEmpty()) {
                String str = (String) arrayDeque.poll();
                str.getClass();
                this.b = str;
                return true;
            }
            do {
                String readLine = ((BufferedReader) this.c).readLine();
                this.b = readLine;
                if (readLine == null) {
                    return false;
                }
                trim = readLine.trim();
                this.b = trim;
            } while (trim.isEmpty());
        }
        return true;
    }

    public void E(String str, String str2) {
        ((HashMap) this.d).put(str, str2);
    }

    public String F() {
        if (!D()) {
            throw new NoSuchElementException();
        }
        String str = (String) this.b;
        this.b = null;
        return str;
    }

    public void H(lb.i iVar, Object obj) {
        if (((EnumMap) this.d) == null) {
            this.d = new EnumMap(lb.i.class);
        }
        ((EnumMap) this.d).put((EnumMap) iVar, (lb.i) obj);
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
            } catch (FileNotFoundException e9) {
                throw new IOException("Failed to create new file " + file, e9);
            }
        }
    }

    public void L(int i10, String str, String str2) {
        ((HashMap) this.c).put(str, str2);
        ((HashMap) this.d).put(str2, str);
        ((HashMap) this.b).put(str, Integer.valueOf(i10));
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        f0 f0Var = (f0) this.c;
        String str = (String) this.b;
        m5.i iVar = (m5.i) this.d;
        x xVar = (x) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        l.j("Not connected to device", f0Var.F == 2);
        r5.f fVar = (r5.f) xVar.u();
        Parcel M0 = fVar.M0();
        M0.writeString(str);
        t.c(M0, iVar);
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

    @Override // s9.a
    public /* bridge */ /* synthetic */ s9.a d(Class cls, r9.d dVar) {
        ((HashMap) this.c).put(cls, dVar);
        ((HashMap) this.d).remove(cls);
        return this;
    }

    @Override // org.telegram.ui.zp0
    public /* synthetic */ boolean e() {
        return true;
    }

    @Override // t0.i
    public Uri g() {
        return (Uri) this.d;
    }

    @Override // org.telegram.ui.zp0
    public void h() {
        ((bk) this.d).M.y();
    }

    @Override // org.telegram.ui.zp0
    public void i(int i10, boolean z10, boolean z11) {
        if (z10) {
            return;
        }
        bk bkVar = (bk) this.d;
        HashMap hashMap = (HashMap) this.c;
        ArrayList arrayList = (ArrayList) this.b;
        gi giVar = bkVar.b;
        if (hashMap.isEmpty() || bkVar.M == null || bkVar.G) {
            return;
        }
        bkVar.G = true;
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
        y4.a0(giVar.F1, giVar.j1() + arrayList2.size(), giVar.n1(), new r2(i10, 1, bkVar, arrayList2, z11));
    }

    @Override // org.telegram.ui.Components.vj0
    public /* synthetic */ boolean j() {
        return true;
    }

    @Override // t0.i
    public ClipDescription k() {
        return (ClipDescription) this.c;
    }

    @Override // t0.i
    public Object l() {
        return null;
    }

    @Override // org.telegram.ui.Components.vj0
    public /* synthetic */ boolean m() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0063  */
    @Override // org.telegram.ui.Components.vj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void n(View view, q0 q0Var, boolean z10, boolean z11) {
        float f10;
        r0 r0Var;
        o0 l10;
        float f11;
        int i10;
        float f12;
        rn rnVar = (rn) this.d;
        a0 q82 = rnVar.q8(((MessageObject) this.b).getId(), true);
        float f13 = 0.0f;
        if (q82 instanceof s1) {
            r0 r0Var2 = ((s1) q82).J;
            o0 l11 = r0Var2.l(q0Var);
            if (l11 == null) {
                f12 = 0.0f;
                f10 = f12;
                rnVar.ab(q82, (MessageObject) this.b, (wj0) this.c, view, f13, f10, q0Var, false, (q0Var == null && q0Var.a) ? true : z10, z11, false);
            } else {
                f13 = r0Var2.c + l11.x + (l11.A / 2.0f);
                f11 = r0Var2.d + l11.y;
                i10 = l11.B;
            }
        } else if (!(q82 instanceof v0) || (l10 = (r0Var = ((v0) q82).y0).l(q0Var)) == null) {
            f10 = 0.0f;
            rnVar.ab(q82, (MessageObject) this.b, (wj0) this.c, view, f13, f10, q0Var, false, (q0Var == null && q0Var.a) ? true : z10, z11, false);
        } else {
            f13 = r0Var.c + l10.x + (l10.A / 2.0f);
            f11 = r0Var.d + l10.y;
            i10 = l10.B;
        }
        f12 = f11 + (i10 / 2.0f);
        f10 = f12;
        rnVar.ab(q82, (MessageObject) this.b, (wj0) this.c, view, f13, f10, q0Var, false, (q0Var == null && q0Var.a) ? true : z10, z11, false);
    }

    @Override // org.telegram.ui.Components.j61
    public void onError(m61 m61Var, Exception exc) {
        s9 s9Var = ((q6) this.d).J;
        if (s9Var != null) {
            s9Var.run();
        }
    }

    @Override // org.telegram.ui.Components.j61
    public /* synthetic */ void onRenderedFirstFrame(i3.a aVar) {
    }

    @Override // org.telegram.ui.Components.j61
    public void onStateChanged(boolean z10, int i10) {
        q6 q6Var = (q6) this.d;
        m6 m6Var = q6Var.G;
        m61 m61Var = q6Var.e;
        if (m61Var == null) {
            return;
        }
        if (m61Var.z()) {
            AndroidUtilities.runOnUIThread(m6Var);
        } else {
            AndroidUtilities.cancelRunOnUIThread(m6Var);
        }
    }

    @Override // org.telegram.ui.Components.j61
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.j61
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((q6) this.d).i();
    }

    @Override // org.telegram.ui.Components.j61
    public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
        q6 q6Var = (q6) this.d;
        z7 z7Var = (z7) this.b;
        if (z7Var != null) {
            y7 r10 = q6Var.e.r(z7Var.d1);
            z7Var.d1 = r10;
            a61 a61Var = q6Var.n;
            if (a61Var != null) {
                a61Var.setHDRInfo(r10);
            }
        }
        int i13 = (int) (i10 * f10);
        q6Var.f = i13;
        int i14 = (int) (i11 * f10);
        q6Var.h = i14;
        if (z7Var != null && (z7Var.k0 != i13 || z7Var.l0 != i14)) {
            z7Var.k0 = i13;
            z7Var.l0 = i14;
            z7Var.A();
        }
        q6Var.b();
        a61 a61Var2 = q6Var.n;
        if (a61Var2 != null) {
            int i15 = q6Var.f;
            int i16 = q6Var.h;
            a61Var2.d = i15;
            a61Var2.e = i16;
            jz jzVar = a61Var2.b;
            if (jzVar == null) {
                return;
            }
            jzVar.postRunnable(new fz(jzVar, i15, i16, 0));
        }
    }

    @Override // org.telegram.ui.Components.vj0
    public /* synthetic */ boolean t() {
        return false;
    }

    public String toString() {
        switch (this.a) {
            case 8:
                return (String) this.b;
            case 27:
                StringBuilder sb2 = new StringBuilder();
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                sb.f fVar = null;
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    sb.f fVar2 = (sb.f) obj;
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

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a1 v() {
        Throwable th;
        HttpsURLConnection httpsURLConnection;
        String u10;
        String str;
        InputStream inputStream = null;
        String sb2 = null;
        inputStream = null;
        try {
            try {
                u10 = u((String) this.b, (HashMap) this.c);
                str = "GET Request URL: " + u10;
            } catch (Throwable th2) {
                th = th2;
                httpsURLConnection = null;
                if (inputStream != null) {
                }
                if (httpsURLConnection != null) {
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str, null);
            }
            httpsURLConnection = (HttpsURLConnection) new URL(u10).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod("GET");
                for (Map.Entry entry : ((HashMap) this.d).entrySet()) {
                    httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream2, "UTF-8"));
                        char[] cArr = new char[8192];
                        StringBuilder sb3 = new StringBuilder();
                        while (true) {
                            int read = bufferedReader.read(cArr);
                            if (read == -1) {
                                break;
                            }
                            sb3.append(cArr, 0, read);
                        }
                        sb2 = sb3.toString();
                    } catch (Throwable th4) {
                        th = th4;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                return new a1(responseCode, sb2);
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            th = th6;
            th = th;
            httpsURLConnection = null;
            if (inputStream != null) {
            }
            if (httpsURLConnection != null) {
            }
            throw th;
        }
    }

    public Object w(Bitmap bitmap) {
        pg.a aVar = (pg.a) this.b;
        if (aVar.a(bitmap)) {
            this.d = ((pg.b) this.c).a(bitmap);
            aVar.b(bitmap);
        }
        return this.d;
    }

    public ColorStateList x(int i10) {
        int resourceId;
        ColorStateList a2;
        TypedArray typedArray = (TypedArray) this.c;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (a2 = o7.a((Context) this.b, resourceId)) == null) ? typedArray.getColorStateList(i10) : a2;
    }

    public Drawable y(int i10) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.c;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0) ? typedArray.getDrawable(i10) : o7.b((Context) this.b, resourceId);
    }

    public Drawable z(int i10) {
        int resourceId;
        Drawable f10;
        if (!((TypedArray) this.c).hasValue(i10) || (resourceId = ((TypedArray) this.c).getResourceId(i10, 0)) == 0) {
            return null;
        }
        r a2 = r.a();
        Context context = (Context) this.b;
        synchronized (a2) {
            f10 = a2.a.f(resourceId, context, true);
        }
        return f10;
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    @Override // org.telegram.ui.Components.j61
    public void onRenderedFirstFrame() {
        z7 z7Var = (z7) this.b;
        Runnable[] runnableArr = (Runnable[]) this.c;
        q6 q6Var = (q6) this.d;
        p6 p6Var = q6Var.D;
        if (p6Var != null && p6Var.g) {
            int i10 = q6Var.f;
            int i11 = q6Var.h;
            p6Var.d = true;
            p6Var.e = i10;
            p6Var.f = i11;
            w0 w0Var = p6Var.c;
            if (w0Var != null) {
                w0Var.run(Integer.valueOf(i10), Integer.valueOf(p6Var.f));
            }
        }
        Runnable runnable = runnableArr[0];
        if (runnable == null) {
            a61 a61Var = q6Var.n;
            if (a61Var != null) {
                if (p6Var == null || !p6Var.g) {
                    a61Var.animate().alpha(1.0f).setDuration(180L).withEndAction(new jh.p6(25, this, z7Var)).start();
                    return;
                }
                return;
            }
            return;
        }
        q6Var.post(runnable);
        runnableArr[0] = null;
        Bitmap bitmap = q6Var.a;
        if (bitmap != null) {
            bitmap.recycle();
            if (z7Var.M0 == q6Var.a) {
                z7Var.M0 = null;
            }
            q6Var.a = null;
            q6Var.invalidate();
        }
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ a(f0 f0Var, String str, m5.i iVar) {
        this.a = 12;
        this.c = f0Var;
        this.b = str;
        this.d = iVar;
    }

    public a(int i10) {
        this.a = i10;
        switch (i10) {
            case 13:
                this.c = new HashMap();
                this.d = new HashMap();
                this.b = new HashMap();
                break;
            default:
                this.c = new HashMap();
                this.d = new HashMap();
                this.b = k7.x.c;
                break;
        }
    }

    public a(CastDevice castDevice, n5.e0 e0Var) {
        this.a = 11;
        l.i(castDevice, "CastDevice parameter cannot be null");
        this.b = castDevice;
        this.c = e0Var;
    }

    public a(h hVar) {
        this.a = 15;
        this.d = hVar;
        this.c = new AtomicLong((r5.a.b.nextLong() & 65535) * 10000);
    }

    public a(s7.d dVar, g gVar) {
        this.a = 26;
        this.c = gVar;
        l.h(dVar);
        this.b = dVar;
    }

    public a(pg.b bVar) {
        this.a = 23;
        this.b = new pg.a();
        this.c = bVar;
    }

    public a(b bVar, rc.h hVar) {
        this.a = 7;
        this.c = bVar;
        this.d = hVar;
        this.b = "firebase-settings.crashlytics.com";
    }

    public a(String str, HashMap hashMap) {
        this.a = 0;
        this.b = str;
        this.c = hashMap;
        this.d = new HashMap();
    }

    @Override // org.telegram.ui.zp0
    public void a() {
    }

    @Override // t0.i
    public void f() {
    }

    @Override // t0.i
    public void o() {
    }

    @Override // org.telegram.ui.Components.vj0
    public /* synthetic */ void s() {
    }

    public a(String str, lb.j[] jVarArr) {
        this.a = 8;
        System.currentTimeMillis();
        this.b = str;
        this.c = jVarArr;
        this.d = null;
    }

    @Override // org.telegram.ui.zp0
    public void b(Editable editable) {
    }

    @Override // org.telegram.ui.Components.j61
    public /* synthetic */ void onSeekFinished(i3.a aVar) {
    }

    @Override // org.telegram.ui.Components.j61
    public /* synthetic */ void onSeekStarted(i3.a aVar) {
    }

    public a(File file) {
        this.a = 24;
        this.b = file;
        this.c = new File(file.getPath() + ".new");
        this.d = new File(file.getPath() + ".bak");
    }

    public a(Runnable runnable) {
        this.a = 25;
        this.d = new CopyOnWriteArrayList();
        this.c = new HashMap();
        this.b = runnable;
    }

    public a(Context context, TypedArray typedArray) {
        this.a = 10;
        this.b = context;
        this.c = typedArray;
    }

    public a(Signature signature) {
        this.a = 1;
        this.b = signature;
        this.c = null;
        this.d = null;
    }

    public a(n1.d dVar) {
        this.a = 14;
        this.a = 14;
        this.b = dVar;
        this.c = Choreographer.getInstance();
        this.d = new o1.a(this, 0);
    }

    public a(Cipher cipher) {
        this.a = 1;
        this.c = cipher;
        this.b = null;
        this.d = null;
    }

    public a(Mac mac) {
        this.a = 1;
        this.d = mac;
        this.c = null;
        this.b = null;
    }

    public a(bk bkVar, HashMap hashMap, ArrayList arrayList) {
        this.a = 18;
        this.d = bkVar;
        this.c = hashMap;
        this.b = arrayList;
    }

    public a(com.google.firebase.messaging.l lVar, e eVar, sb.e eVar2) {
        qb.d dVar;
        int i10;
        int i11;
        this.a = 27;
        this.d = lVar;
        this.b = new ArrayList();
        sb.e eVar3 = eVar2;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            dVar = qb.d.n;
            if (eVar3 == null) {
                break;
            }
            int i14 = eVar3.c;
            int i15 = i12 + eVar3.d;
            sb.e eVar4 = eVar3.e;
            int i16 = i13;
            qb.d dVar2 = eVar3.a;
            boolean z10 = (dVar2 == qb.d.h && eVar4 == null && i14 != 0) || !(eVar4 == null || i14 == eVar4.c);
            i10 = z10 ? 1 : i16;
            if (eVar4 == null || eVar4.a != dVar2 || z10) {
                ((ArrayList) this.b).add(0, new sb.f(this, dVar2, eVar3.b, i14, i15));
                i11 = 0;
            } else {
                i11 = i15;
            }
            if (z10) {
                ((ArrayList) this.b).add(0, new sb.f(this, dVar, eVar3.b, eVar3.c, 0));
            }
            i13 = i10;
            eVar3 = eVar4;
            i12 = i11;
        }
        int i17 = i13;
        boolean z11 = lVar.a;
        qb.b bVar = (qb.b) lVar.d;
        if (z11) {
            sb.f fVar = (sb.f) ((ArrayList) this.b).get(0);
            if (fVar != null && fVar.a != dVar && i17 != 0) {
                ((ArrayList) this.b).add(0, new sb.f(this, dVar, 0, 0, 0));
            }
            ((ArrayList) this.b).add(((sb.f) ((ArrayList) this.b).get(0)).a == dVar ? 1 : 0, new sb.f(this, qb.d.s, 0, 0, 0));
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
        int C = C(eVar);
        while (i18 < i19 && !sb.c.c(C, e.c(i18), bVar)) {
            i18++;
        }
        while (i18 > i10 && sb.c.c(C, e.c(i18 - 1), bVar)) {
            i18--;
        }
        this.c = e.c(i18);
    }

    public a(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.a = 22;
        this.d = arrayDeque;
        this.c = bufferedReader;
    }

    public a(Object[] objArr, Object[] objArr2) {
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

    @Override // org.telegram.ui.Components.vj0
    public /* synthetic */ void r(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i10, boolean z10) {
    }
}
