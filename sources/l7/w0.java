package l7;

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
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.Choreographer;
import android.view.View;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.net.ssl.HttpsURLConnection;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Components.f71;
import org.telegram.ui.Components.hk;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.nz0;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.vz;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.zy0;
import org.telegram.ui.lq0;
import org.telegram.ui.sg1;
import org.telegram.ui.zn;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public class w0 implements v9.a, ok0, lq0, f71, com.google.android.gms.common.api.internal.s {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ w0(int i10, boolean z4) {
        this.a = i10;
    }

    public static void B(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e("AtomicFile", "Failed to delete file which is a directory " + file2);
        }
        if (file.renameTo(file2)) {
            return;
        }
        Log.e("AtomicFile", "Failed to rename " + file + " to " + file2);
    }

    public static final URL g(w0 w0Var) {
        Uri.Builder appendPath = new Uri.Builder().scheme("https").authority((String) w0Var.d).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        la.b bVar = (la.b) w0Var.b;
        Uri.Builder appendPath2 = appendPath.appendPath(bVar.a).appendPath("settings");
        la.a aVar = bVar.b;
        return new URL(appendPath2.appendQueryParameter("build_version", aVar.c).appendQueryParameter("display_version", aVar.b).build().toString());
    }

    public static Object[] h(Object[] objArr, int[] iArr) {
        int length = objArr.length;
        Class<?> componentType = objArr.getClass().getComponentType();
        zy0 zy0Var = nz0.O;
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

    public static o3.f n(j3.w0 w0Var) {
        g5.u uVar = new g5.u();
        uVar.c = null;
        Uri uri = w0Var.b;
        String uri2 = uri == null ? null : uri.toString();
        boolean z4 = w0Var.f;
        cb.m mVar = new cb.m();
        h5.a.f((z4 && TextUtils.isEmpty(uri2)) ? false : true);
        mVar.b = uVar;
        mVar.c = uri2;
        mVar.a = z4;
        mVar.d = new HashMap();
        s8.u0 it = w0Var.c.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            str.getClass();
            str2.getClass();
            synchronized (((HashMap) mVar.d)) {
                ((HashMap) mVar.d).put(str, str2);
            }
        }
        HashMap hashMap = new HashMap();
        UUID uuid = j3.h.a;
        z9.d dVar = new z9.d(6);
        UUID uuid2 = w0Var.a;
        uuid2.getClass();
        boolean z10 = w0Var.d;
        boolean z11 = w0Var.e;
        int[] d = k7.y7.d(w0Var.h);
        int length = d.length;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = d[i10];
            h5.a.f(i11 == 2 || i11 == 1);
        }
        o3.f fVar = new o3.f(uuid2, mVar, hashMap, z10, (int[]) d.clone(), z11, dVar);
        byte[] bArr = w0Var.n;
        byte[] copyOf = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        h5.a.i(fVar.w.isEmpty());
        fVar.H = copyOf;
        return fVar;
    }

    public static String p(String str, HashMap hashMap) {
        StringBuilder sb = new StringBuilder();
        Iterator it = hashMap.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb.append((String) entry.getKey());
        sb.append("=");
        sb.append(entry.getValue() != null ? URLEncoder.encode((String) entry.getValue(), "UTF-8") : "");
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb.append("&");
            sb.append((String) entry2.getKey());
            sb.append("=");
            sb.append(entry2.getValue() != null ? URLEncoder.encode((String) entry2.getValue(), "UTF-8") : "");
        }
        String sb2 = sb.toString();
        if (sb2.isEmpty()) {
            return str;
        }
        if (!str.contains("?")) {
            return android.support.v4.media.a.z(str, "?", sb2);
        }
        if (!str.endsWith("&")) {
            sb2 = "&".concat(sb2);
        }
        return vh.w2.k(str, sb2);
    }

    public static w0 y(Context context, AttributeSet attributeSet, int[] iArr, int i10) {
        return new w0(context, context.obtainStyledAttributes(attributeSet, iArr, i10, 0));
    }

    public void A() {
        ((TypedArray) this.c).recycle();
    }

    public FileOutputStream C() {
        File file = (File) this.c;
        File file2 = (File) this.d;
        if (file2.exists()) {
            B(file2, (File) this.b);
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

    public void D(int i10, String str, String str2) {
        ((HashMap) this.b).put(str, str2);
        ((HashMap) this.c).put(str2, str);
        ((HashMap) this.d).put(str, Integer.valueOf(i10));
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        q5.f0 f0Var = (q5.f0) this.b;
        String str = (String) this.c;
        q5.i iVar = (q5.i) this.d;
        u5.x xVar = (u5.x) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        b6.m.j("Not connected to device", f0Var.F == 2);
        u5.f fVar = (u5.f) xVar.u();
        Parcel M0 = fVar.M0();
        M0.writeString(str);
        com.google.android.gms.internal.cast.t.c(M0, iVar);
        fVar.R0(M0, 13);
        synchronized (f0Var.r) {
            try {
                if (f0Var.o != null) {
                    f0Var.i(2477);
                }
                f0Var.o = taskCompletionSource;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // v9.a
    public /* bridge */ /* synthetic */ v9.a b(Class cls, u9.d dVar) {
        ((HashMap) this.b).put(cls, dVar);
        ((HashMap) this.c).remove(cls);
        return this;
    }

    @Override // org.telegram.ui.lq0
    public void d() {
        ((hk) this.d).N.x();
    }

    @Override // org.telegram.ui.lq0
    public /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.lq0
    public void f(int i10, boolean z4, boolean z10) {
        if (z4) {
            return;
        }
        hk hkVar = (hk) this.d;
        HashMap hashMap = (HashMap) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        li liVar = hkVar.b;
        if (hashMap.isEmpty() || hkVar.N == null || hkVar.H) {
            return;
        }
        hkVar.H = true;
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
        org.telegram.ui.Components.z4.a0(liVar.G1, liVar.j1() + arrayList2.size(), liVar.n1(), new nh.r2(i10, 1, hkVar, arrayList2, z10));
    }

    @Override // org.telegram.ui.Components.ok0
    public /* synthetic */ boolean i() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0063  */
    @Override // org.telegram.ui.Components.ok0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void j(View view, mg.q0 q0Var, boolean z4, boolean z10) {
        float f10;
        mg.r0 r0Var;
        mg.o0 m9;
        float f11;
        int i10;
        float f12;
        zn znVar = (zn) this.d;
        org.telegram.ui.Cells.a0 q82 = znVar.q8(((MessageObject) this.b).getId(), true);
        float f13 = 0.0f;
        if (q82 instanceof org.telegram.ui.Cells.s1) {
            mg.r0 r0Var2 = ((org.telegram.ui.Cells.s1) q82).K;
            mg.o0 m10 = r0Var2.m(q0Var);
            if (m10 == null) {
                f12 = 0.0f;
                f10 = f12;
                znVar.ab(q82, (MessageObject) this.b, (pk0) this.c, view, f13, f10, q0Var, false, (q0Var == null && q0Var.a) ? true : z4, z10, false);
            } else {
                f13 = r0Var2.c + m10.x + (m10.A / 2.0f);
                f11 = r0Var2.d + m10.y;
                i10 = m10.B;
            }
        } else if (!(q82 instanceof org.telegram.ui.Cells.v0) || (m9 = (r0Var = ((org.telegram.ui.Cells.v0) q82).z0).m(q0Var)) == null) {
            f10 = 0.0f;
            znVar.ab(q82, (MessageObject) this.b, (pk0) this.c, view, f13, f10, q0Var, false, (q0Var == null && q0Var.a) ? true : z4, z10, false);
        } else {
            f13 = r0Var.c + m9.x + (m9.A / 2.0f);
            f11 = r0Var.d + m9.y;
            i10 = m9.B;
        }
        f12 = f11 + (i10 / 2.0f);
        f10 = f12;
        znVar.ab(q82, (MessageObject) this.b, (pk0) this.c, view, f13, f10, q0Var, false, (q0Var == null && q0Var.a) ? true : z4, z10, false);
    }

    @Override // org.telegram.ui.Components.ok0
    public /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.Components.ok0
    public /* synthetic */ boolean o() {
        return false;
    }

    @Override // org.telegram.ui.Components.f71
    public void onError(i71 i71Var, Exception exc) {
        ph.g8 g8Var = ((ph.k5) this.d).K;
        if (g8Var != null) {
            g8Var.run();
        }
    }

    @Override // org.telegram.ui.Components.f71
    public /* synthetic */ void onRenderedFirstFrame(k3.a aVar) {
    }

    @Override // org.telegram.ui.Components.f71
    public void onStateChanged(boolean z4, int i10) {
        ph.k5 k5Var = (ph.k5) this.d;
        ph.i5 i5Var = k5Var.H;
        i71 i71Var = k5Var.e;
        if (i71Var == null) {
            return;
        }
        if (i71Var.y()) {
            AndroidUtilities.runOnUIThread(i5Var);
        } else {
            AndroidUtilities.cancelRunOnUIThread(i5Var);
        }
    }

    @Override // org.telegram.ui.Components.f71
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.f71
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((ph.k5) this.d).i();
    }

    @Override // org.telegram.ui.Components.f71
    public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
        ph.k5 k5Var = (ph.k5) this.d;
        ph.t6 t6Var = (ph.t6) this.b;
        if (t6Var != null) {
            ph.s6 q10 = k5Var.e.q(t6Var.d1);
            t6Var.d1 = q10;
            w61 w61Var = k5Var.n;
            if (w61Var != null) {
                w61Var.setHDRInfo(q10);
            }
        }
        int i13 = (int) (i10 * f10);
        k5Var.f = i13;
        int i14 = (int) (i11 * f10);
        k5Var.h = i14;
        if (t6Var != null && (t6Var.k0 != i13 || t6Var.l0 != i14)) {
            t6Var.k0 = i13;
            t6Var.l0 = i14;
            t6Var.A();
        }
        k5Var.b();
        w61 w61Var2 = k5Var.n;
        if (w61Var2 != null) {
            int i15 = k5Var.f;
            int i16 = k5Var.h;
            w61Var2.d = i15;
            w61Var2.e = i16;
            vz vzVar = w61Var2.b;
            if (vzVar == null) {
                return;
            }
            vzVar.postRunnable(new rz(vzVar, i15, i16, 0));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.google.android.gms.internal.clearcut.z0 q() {
        Throwable th2;
        HttpsURLConnection httpsURLConnection;
        String p10;
        String str;
        InputStream inputStream = null;
        String sb = null;
        inputStream = null;
        try {
            try {
                p10 = p((String) this.b, (HashMap) this.c);
                str = "GET Request URL: " + p10;
            } catch (Throwable th3) {
                th2 = th3;
                httpsURLConnection = null;
                if (inputStream != null) {
                }
                if (httpsURLConnection != null) {
                }
                throw th2;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        try {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str, null);
            }
            httpsURLConnection = (HttpsURLConnection) new URL(p10).openConnection();
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
                        StringBuilder sb2 = new StringBuilder();
                        while (true) {
                            int read = bufferedReader.read(cArr);
                            if (read == -1) {
                                break;
                            }
                            sb2.append(cArr, 0, read);
                        }
                        sb = sb2.toString();
                    } catch (Throwable th5) {
                        th2 = th5;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th2;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                return new com.google.android.gms.internal.clearcut.z0(responseCode, sb);
            } catch (Throwable th6) {
                th2 = th6;
            }
        } catch (Throwable th7) {
            th = th7;
            th2 = th;
            httpsURLConnection = null;
            if (inputStream != null) {
            }
            if (httpsURLConnection != null) {
            }
            throw th2;
        }
    }

    public o3.p r(j3.c1 c1Var) {
        o3.f fVar;
        c1Var.b.getClass();
        j3.w0 w0Var = c1Var.b.c;
        if (w0Var == null || h5.d0.a < 18) {
            return o3.p.p;
        }
        synchronized (this.b) {
            try {
                if (!w0Var.equals((j3.w0) this.c)) {
                    this.c = w0Var;
                    this.d = n(w0Var);
                }
                fVar = (o3.f) this.d;
                fVar.getClass();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }

    public ColorStateList s(int i10) {
        int resourceId;
        ColorStateList a2;
        TypedArray typedArray = (TypedArray) this.c;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (a2 = j7.r7.a((Context) this.b, resourceId)) == null) ? typedArray.getColorStateList(i10) : a2;
    }

    public Drawable t(int i10) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.c;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0) ? typedArray.getDrawable(i10) : j7.r7.b((Context) this.b, resourceId);
    }

    public String toString() {
        switch (this.a) {
            case 5:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.b);
                sb.append('{');
                w0 w0Var = (w0) ((w0) this.c).d;
                String str = "";
                while (w0Var != null) {
                    Object obj = w0Var.c;
                    sb.append(str);
                    String str2 = (String) w0Var.b;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r3.length() - 1);
                    }
                    w0Var = (w0) w0Var.d;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            case 17:
                return (String) this.b;
            default:
                return super.toString();
        }
    }

    public Drawable u(int i10) {
        int resourceId;
        Drawable f10;
        if (!((TypedArray) this.c).hasValue(i10) || (resourceId = ((TypedArray) this.c).getResourceId(i10, 0)) == 0) {
            return null;
        }
        m.q a2 = m.q.a();
        Context context = (Context) this.b;
        synchronized (a2) {
            f10 = a2.a.f(resourceId, context, true);
        }
        return f10;
    }

    public Typeface v(int i10, int i11, h5.b0 b0Var) {
        h5.b0 b0Var2;
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
                    b0Var.b();
                    return null;
                }
                int i12 = typedValue.assetCookie;
                a0.j jVar = i0.e.b;
                Typeface typeface = (Typeface) jVar.a(i0.e.b(resources, resourceId, charSequence2, i12, i11));
                int i13 = 10;
                if (typeface != null) {
                    new Handler(Looper.getMainLooper()).post(new ff.c(i13, b0Var, typeface));
                    return typeface;
                }
                try {
                    if (!charSequence2.toLowerCase().endsWith(".xml")) {
                        b0Var2 = b0Var;
                        try {
                            int i14 = typedValue.assetCookie;
                            Typeface e = i0.e.a.e(context, resources, resourceId, charSequence2, i11);
                            if (e != null) {
                                jVar.b(i0.e.b(resources, resourceId, charSequence2, i14, i11), e);
                            }
                            if (e != null) {
                                new Handler(Looper.getMainLooper()).post(new ff.c(i13, b0Var2, e));
                            } else {
                                b0Var2.b();
                            }
                            return e;
                        } catch (IOException e6) {
                            e = e6;
                            iOException = e;
                            Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                            b0Var2.b();
                            return null;
                        } catch (XmlPullParserException e10) {
                            e = e10;
                            xmlPullParserException = e;
                            Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                            b0Var2.b();
                            return null;
                        }
                    }
                    h0.d g10 = h0.b.g(resources.getXml(resourceId), resources);
                    if (g10 != null) {
                        try {
                            return i0.e.a(context, g10, resources, resourceId, charSequence2, typedValue.assetCookie, i11, b0Var);
                        } catch (IOException e11) {
                            e = e11;
                            b0Var2 = b0Var;
                            iOException = e;
                            Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                            b0Var2.b();
                            return null;
                        } catch (XmlPullParserException e12) {
                            e = e12;
                            b0Var2 = b0Var;
                            xmlPullParserException = e;
                            Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                            b0Var2.b();
                            return null;
                        }
                    }
                    try {
                        Log.e("ResourcesCompat", "Failed to find font-family tag");
                        b0Var.b();
                        return null;
                    } catch (IOException e13) {
                        iOException = e13;
                        b0Var2 = b0Var;
                        Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                        b0Var2.b();
                        return null;
                    } catch (XmlPullParserException e14) {
                        xmlPullParserException = e14;
                        b0Var2 = b0Var;
                        Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                        b0Var2.b();
                        return null;
                    }
                } catch (IOException e15) {
                    e = e15;
                    b0Var2 = b0Var;
                } catch (XmlPullParserException e16) {
                    e = e16;
                    b0Var2 = b0Var;
                }
            }
        }
        return null;
    }

    public void w(String str, String str2) {
        ((HashMap) this.d).put(str, str2);
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
    public void x(g5.m mVar, Uri uri, Map map, long j10, long j11, o4.e0 e0Var) {
        String str;
        int w10;
        int x10;
        int i10;
        r3.k[] kVarArr;
        r3.h hVar = new r3.h(mVar, j10, j11);
        this.d = hVar;
        if (((r3.k) this.c) != null) {
            return;
        }
        r3.i iVar = (r3.i) this.b;
        synchronized (iVar) {
            try {
                int[] iArr = r3.i.b;
                ArrayList arrayList = new ArrayList(16);
                List list = (List) map.get("Content-Type");
                if (list != null && !list.isEmpty()) {
                    str = (String) list.get(0);
                    w10 = h5.a.w(str);
                    if (w10 != -1) {
                        iVar.a(w10, arrayList);
                    }
                    x10 = h5.a.x(uri);
                    if (x10 != -1 && x10 != w10) {
                        iVar.a(x10, arrayList);
                    }
                    for (i10 = 0; i10 < 16; i10++) {
                        int i11 = iArr[i10];
                        if (i11 != w10 && i11 != x10) {
                            iVar.a(i11, arrayList);
                        }
                    }
                    kVarArr = (r3.k[]) arrayList.toArray(new r3.k[arrayList.size()]);
                }
                str = null;
                w10 = h5.a.w(str);
                if (w10 != -1) {
                }
                x10 = h5.a.x(uri);
                if (x10 != -1) {
                    iVar.a(x10, arrayList);
                }
                while (i10 < 16) {
                }
                kVarArr = (r3.k[]) arrayList.toArray(new r3.k[arrayList.size()]);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        boolean z4 = true;
        if (kVarArr.length == 1) {
            this.c = kVarArr[0];
        } else {
            int length = kVarArr.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    break;
                }
                r3.k kVar = kVarArr[i12];
                try {
                } catch (EOFException unused) {
                    if (((r3.k) this.c) == null) {
                    }
                } catch (Throwable th3) {
                    if (((r3.k) this.c) == null && hVar.d != j10) {
                        z4 = false;
                    }
                    h5.a.i(z4);
                    hVar.f = 0;
                    throw th3;
                }
                if (kVar.i(hVar)) {
                    this.c = kVar;
                    hVar.f = 0;
                    break;
                } else {
                    if (((r3.k) this.c) == null) {
                    }
                    boolean z10 = true;
                    h5.a.i(z10);
                    hVar.f = 0;
                    i12++;
                }
            }
            if (((r3.k) this.c) == null) {
                StringBuilder sb = new StringBuilder("None of the available extractors (");
                int i13 = h5.d0.a;
                StringBuilder sb2 = new StringBuilder();
                for (int i14 = 0; i14 < kVarArr.length; i14++) {
                    sb2.append(kVarArr[i14].getClass().getSimpleName());
                    if (i14 < kVarArr.length - 1) {
                        sb2.append(", ");
                    }
                }
                sb.append(sb2.toString());
                sb.append(") could read the stream.");
                throw new o4.u0(sb.toString(), null, false, 1);
            }
        }
        ((r3.k) this.c).e(e0Var);
    }

    public void z(ob.i iVar, Object obj) {
        if (((EnumMap) this.d) == null) {
            this.d = new EnumMap(ob.i.class);
        }
        ((EnumMap) this.d).put((EnumMap) iVar, (ob.i) obj);
    }

    public /* synthetic */ w0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    @Override // org.telegram.ui.Components.f71
    public void onRenderedFirstFrame() {
        ph.t6 t6Var = (ph.t6) this.b;
        Runnable[] runnableArr = (Runnable[]) this.c;
        ph.k5 k5Var = (ph.k5) this.d;
        ph.j5 j5Var = k5Var.E;
        if (j5Var != null && j5Var.g) {
            int i10 = k5Var.f;
            int i11 = k5Var.h;
            j5Var.d = true;
            j5Var.e = i10;
            j5Var.f = i11;
            dg.r1 r1Var = j5Var.c;
            if (r1Var != null) {
                r1Var.run(Integer.valueOf(i10), Integer.valueOf(j5Var.f));
            }
        }
        Runnable runnable = runnableArr[0];
        if (runnable == null) {
            w61 w61Var = k5Var.n;
            if (w61Var != null) {
                if (j5Var == null || !j5Var.g) {
                    w61Var.animate().alpha(1.0f).setDuration(180L).withEndAction(new sg1(25, this, t6Var)).start();
                    return;
                }
                return;
            }
            return;
        }
        k5Var.post(runnable);
        runnableArr[0] = null;
        Bitmap bitmap = k5Var.a;
        if (bitmap != null) {
            bitmap.recycle();
            if (t6Var.M0 == k5Var.a) {
                t6Var.M0 = null;
            }
            k5Var.a = null;
            k5Var.invalidate();
        }
    }

    public /* synthetic */ w0(q5.f0 f0Var, String str, q5.i iVar) {
        this.a = 27;
        this.b = f0Var;
        this.c = str;
        this.d = iVar;
    }

    public w0(int i10) {
        this.a = i10;
        switch (i10) {
            case 14:
                this.b = new Object();
                break;
            case 28:
                this.b = new HashMap();
                this.c = new HashMap();
                this.d = new HashMap();
                break;
            default:
                this.b = new HashMap();
                this.c = new HashMap();
                this.d = n7.x.c;
                break;
        }
    }

    public w0(CastDevice castDevice, r5.e0 e0Var) {
        this.a = 26;
        b6.m.i(castDevice, "CastDevice parameter cannot be null");
        this.b = castDevice;
        this.c = e0Var;
    }

    public /* synthetic */ w0(String str) {
        this.a = 5;
        w0 w0Var = new w0(4, false);
        this.c = w0Var;
        this.d = w0Var;
        this.b = str;
    }

    public w0(la.b bVar, uc.h hVar) {
        this.a = 12;
        this.b = bVar;
        this.c = hVar;
        this.d = "firebase-settings.crashlytics.com";
    }

    public w0(String str, HashMap hashMap) {
        this.a = 6;
        this.b = str;
        this.c = hashMap;
        this.d = new HashMap();
    }

    public w0(String str, ob.j[] jVarArr) {
        this.a = 17;
        System.currentTimeMillis();
        this.b = str;
        this.c = jVarArr;
        this.d = null;
    }

    @Override // org.telegram.ui.lq0
    public void a() {
    }

    @Override // org.telegram.ui.Components.ok0
    public /* synthetic */ void m() {
    }

    public w0(File file) {
        this.a = 25;
        this.b = file;
        this.c = new File(file.getPath() + ".new");
        this.d = new File(file.getPath() + ".bak");
    }

    @Override // org.telegram.ui.lq0
    public void c(Editable editable) {
    }

    @Override // org.telegram.ui.Components.f71
    public /* synthetic */ void onSeekFinished(k3.a aVar) {
    }

    @Override // org.telegram.ui.Components.f71
    public /* synthetic */ void onSeekStarted(k3.a aVar) {
    }

    public w0(r3.i iVar, int i10) {
        this.a = i10;
        switch (i10) {
            case 16:
                this.b = new HashMap();
                new HashSet();
                this.c = new HashMap();
                break;
            default:
                this.b = iVar;
                break;
        }
    }

    public w0(Runnable runnable) {
        this.a = 29;
        this.c = new CopyOnWriteArrayList();
        this.d = new HashMap();
        this.b = runnable;
    }

    public w0(Context context, TypedArray typedArray) {
        this.a = 3;
        this.b = context;
        this.c = typedArray;
    }

    public w0(androidx.biometric.e0 e0Var) {
        this.a = 13;
        this.a = 13;
        this.b = e0Var;
        this.c = Choreographer.getInstance();
        this.d = new o1.a(this, 0);
    }

    public w0(Object[] objArr, Object[] objArr2) {
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
        this.c = h(objArr, iArr);
        this.d = h(objArr2, iArr);
    }

    @Override // org.telegram.ui.Components.ok0
    public /* synthetic */ void l(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i10, boolean z4) {
    }
}
