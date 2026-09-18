package lf;

import ai.d4;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ClipDescription;
import android.content.ComponentName;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
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
import android.os.PersistableBundle;
import android.support.v4.media.session.b0;
import android.support.v4.media.session.v;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import b2.c0;
import c3.r;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import e2.a0;
import e9.a1;
import e9.f0;
import e9.g0;
import e9.k0;
import e9.m0;
import e9.o1;
import gg.x1;
import i9.w;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.zip.Adler32;
import java.util.zip.InflaterInputStream;
import k2.u;
import m.q;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Cells.w0;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.iz0;
import org.telegram.ui.Components.ok;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.wz0;
import org.telegram.ui.br0;
import org.telegram.ui.zn;
import org.xmlpull.v1.XmlPullParserException;
import r0.i0;
import s4.c1;
import s4.h0;
import s4.y;
import u2.u0;
import v7.v7;
import v7.y7;
import w7.g6;
import zg.o0;
import zg.p0;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
public class i implements pk0, br0, n5.b, t0.h, ja.a {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ i(int i10, boolean z10) {
        this.a = i10;
    }

    public static i Q(Context context, AttributeSet attributeSet, int[] iArr, int i10) {
        return new i(context, context.obtainStyledAttributes(attributeSet, iArr, i10, 0));
    }

    public static void U(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e("AtomicFile", "Failed to delete file which is a directory " + file2);
        }
        if (file.renameTo(file2)) {
            return;
        }
        Log.e("AtomicFile", "Failed to rename " + file + " to " + file2);
    }

    public static Object[] w(Object[] objArr, int[] iArr) {
        int length = objArr.length;
        Class<?> componentType = objArr.getClass().getComponentType();
        iz0 iz0Var = wz0.R;
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

    public static n2.f x(c0 c0Var) {
        g2.o oVar = new g2.o();
        oVar.c = null;
        Uri uri = c0Var.b;
        String uri2 = uri == null ? null : uri.toString();
        boolean z10 = c0Var.f;
        com.google.firebase.messaging.m mVar = new com.google.firebase.messaging.m();
        e2.d.b((z10 && TextUtils.isEmpty(uri2)) ? false : true);
        mVar.b = oVar;
        mVar.c = uri2;
        mVar.a = z10;
        mVar.d = new HashMap();
        k0 k0Var = c0Var.c;
        m0 m0Var = k0Var.a;
        if (m0Var == null) {
            m0Var = k0Var.b();
            k0Var.a = m0Var;
        }
        o1 it = m0Var.iterator();
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
        UUID uuid = b2.i.a;
        qb.b bVar = new qb.b(26);
        UUID uuid2 = c0Var.a;
        uuid2.getClass();
        boolean z11 = c0Var.d;
        boolean z12 = c0Var.e;
        int[] f7 = y7.f(c0Var.g);
        int length = f7.length;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = f7[i10];
            e2.d.b(i11 == 2 || i11 == 1);
        }
        n2.f fVar = new n2.f(uuid2, mVar, hashMap, z11, (int[]) f7.clone(), z12, bVar);
        byte[] bArr = c0Var.h;
        byte[] copyOf = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        e2.d.g(fVar.w.isEmpty());
        fVar.K = copyOf;
        return fVar;
    }

    public n2.n A(b2.k0 k0Var) {
        n2.f fVar;
        k0Var.b.getClass();
        c0 c0Var = k0Var.b.c;
        if (c0Var == null) {
            return n2.n.z;
        }
        synchronized (this.b) {
            try {
                if (!c0Var.equals((c0) this.c)) {
                    this.c = c0Var;
                    this.d = x(c0Var);
                }
                fVar = (n2.f) this.d;
                fVar.getClass();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }

    public View B(int i10) {
        return ((RecyclerView) ((ka.c) this.b).b).getChildAt(J(i10));
    }

    public int C() {
        return ((RecyclerView) ((ka.c) this.b).b).getChildCount() - ((ArrayList) this.d).size();
    }

    public ColorStateList D(int i10) {
        int resourceId;
        ColorStateList a2;
        TypedArray typedArray = (TypedArray) this.c;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (a2 = v7.a((Context) this.b, resourceId)) == null) ? typedArray.getColorStateList(i10) : a2;
    }

    public long E() {
        c3.l lVar = (c3.l) this.d;
        if (lVar != null) {
            return lVar.d;
        }
        return -1L;
    }

    public Drawable F(int i10) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.c;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0) ? typedArray.getDrawable(i10) : v7.b((Context) this.b, resourceId);
    }

    public Drawable G(int i10) {
        int resourceId;
        Drawable f7;
        if (!((TypedArray) this.c).hasValue(i10) || (resourceId = ((TypedArray) this.c).getResourceId(i10, 0)) == 0) {
            return null;
        }
        q a2 = q.a();
        Context context = (Context) this.b;
        synchronized (a2) {
            f7 = a2.a.f(resourceId, context, true);
        }
        return f7;
    }

    public Typeface H(int i10, int i11, a0 a0Var) {
        a0 a0Var2;
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
                int i12 = 1;
                resources.getValue(resourceId, typedValue, true);
                CharSequence charSequence = typedValue.string;
                if (charSequence == null) {
                    throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(resourceId) + "\" (" + Integer.toHexString(resourceId) + ") is not a Font: " + typedValue);
                }
                String charSequence2 = charSequence.toString();
                if (!charSequence2.startsWith("res/")) {
                    a0Var.b();
                    return null;
                }
                int i13 = typedValue.assetCookie;
                a0.k kVar = i0.e.b;
                Typeface typeface = (Typeface) kVar.a(i0.e.b(resources, resourceId, charSequence2, i13, i11));
                if (typeface != null) {
                    new Handler(Looper.getMainLooper()).post(new x1(i12, a0Var, typeface));
                    return typeface;
                }
                try {
                } catch (IOException e) {
                    e = e;
                    a0Var2 = a0Var;
                } catch (XmlPullParserException e7) {
                    e = e7;
                    a0Var2 = a0Var;
                }
                try {
                    if (!charSequence2.toLowerCase().endsWith(".xml")) {
                        int i14 = typedValue.assetCookie;
                        Typeface e10 = i0.e.a.e(context, resources, resourceId, charSequence2, i11);
                        if (e10 != null) {
                            kVar.b(i0.e.b(resources, resourceId, charSequence2, i14, i11), e10);
                        }
                        if (e10 != null) {
                            new Handler(Looper.getMainLooper()).post(new x1(i12, a0Var, e10));
                        } else {
                            a0Var.b();
                        }
                        return e10;
                    }
                    h0.d g10 = h0.b.g(resources.getXml(resourceId), resources);
                    if (g10 != null) {
                        return i0.e.a(context, g10, resources, resourceId, charSequence2, typedValue.assetCookie, i11, a0Var);
                    }
                    try {
                        Log.e("ResourcesCompat", "Failed to find font-family tag");
                        a0Var.b();
                        return null;
                    } catch (IOException e11) {
                        iOException = e11;
                        a0Var2 = a0Var;
                        Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                        a0Var2.b();
                        return null;
                    } catch (XmlPullParserException e12) {
                        xmlPullParserException = e12;
                        a0Var2 = a0Var;
                        Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                        a0Var2.b();
                        return null;
                    }
                } catch (IOException e13) {
                    e = e13;
                    iOException = e;
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                    a0Var2.b();
                    return null;
                } catch (XmlPullParserException e14) {
                    e = e14;
                    xmlPullParserException = e;
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                    a0Var2.b();
                    return null;
                }
            }
        }
        return null;
    }

    public ByteBuffer I() {
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

    public int J(int i10) {
        e6.n nVar = (e6.n) this.c;
        if (i10 < 0) {
            return -1;
        }
        int childCount = ((RecyclerView) ((ka.c) this.b).b).getChildCount();
        int i11 = i10;
        while (i11 < childCount) {
            int x10 = i10 - (i11 - nVar.x(i11));
            if (x10 == 0) {
                while (nVar.D(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += x10;
        }
        return -1;
    }

    public View K(int i10) {
        return ((RecyclerView) ((ka.c) this.b).b).getChildAt(i10);
    }

    public int L() {
        return ((RecyclerView) ((ka.c) this.b).b).getChildCount();
    }

    public boolean M() {
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

    public void N(View view) {
        ((ArrayList) this.d).add(view);
        ka.c cVar = (ka.c) this.b;
        c1 V = RecyclerView.V(view);
        if (V != null) {
            View view2 = V.a;
            RecyclerView recyclerView = (RecyclerView) cVar.b;
            int i10 = V.s;
            if (i10 != -1) {
                V.r = i10;
            } else {
                WeakHashMap weakHashMap = i0.a;
                V.r = view2.getImportantForAccessibility();
            }
            if (recyclerView.c0()) {
                V.s = 4;
                recyclerView.J0.add(V);
            } else {
                WeakHashMap weakHashMap2 = i0.a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0057, code lost:
    
        if (r1.d != r11) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0081, code lost:
    
        if (r1.d != r11) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void O(g2.h hVar, Uri uri, Map map, long j3, long j10, u0 u0Var) {
        c3.l lVar = new c3.l(hVar, j3, j10);
        this.d = lVar;
        if (((c3.o) this.c) != null) {
            return;
        }
        c3.o[] d = ((r) this.b).d(uri, map);
        int length = d.length;
        g0 g0Var = e9.i0.b;
        e9.q.e(length, "expectedSize");
        f0 f0Var = new f0(length);
        boolean z10 = true;
        if (d.length == 1) {
            this.c = d[0];
        } else {
            int length2 = d.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length2) {
                    break;
                }
                c3.o oVar = d[i10];
                try {
                } catch (EOFException unused) {
                    if (((c3.o) this.c) == null) {
                    }
                } catch (Throwable th2) {
                    if (((c3.o) this.c) == null && lVar.d != j3) {
                        z10 = false;
                    }
                    e2.d.g(z10);
                    lVar.f = 0;
                    throw th2;
                }
                if (oVar.a(lVar)) {
                    this.c = oVar;
                    lVar.f = 0;
                    break;
                }
                f0Var.d(oVar.i());
                if (((c3.o) this.c) == null) {
                }
                boolean z11 = true;
                e2.d.g(z11);
                lVar.f = 0;
                i10++;
            }
            if (((c3.o) this.c) == null) {
                StringBuilder sb2 = new StringBuilder("None of the available extractors (");
                xa.c cVar = new xa.c(", ");
                Iterator it = e9.q.w(e9.i0.w(d), new s9.b(10)).iterator();
                StringBuilder sb3 = new StringBuilder();
                cVar.p(sb3, it);
                sb2.append(sb3.toString());
                sb2.append(") could read the stream.");
                String sb4 = sb2.toString();
                uri.getClass();
                a1 i11 = f0Var.i();
                i3.d dVar = new i3.d(sb4, null, false, 1);
                e9.i0.v(i11);
                throw dVar;
            }
        }
        ((c3.o) this.c).g(u0Var);
    }

    public String P() {
        if (!M()) {
            throw new NoSuchElementException();
        }
        String str = (String) this.d;
        this.d = null;
        return str;
    }

    public void R() {
        ((TypedArray) this.c).recycle();
    }

    public void S() {
        int i10;
        RecyclerView recyclerView = (RecyclerView) ((ka.c) this.b).b;
        ((e6.n) this.c).G();
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            c1 V = RecyclerView.V((View) arrayList.get(size));
            if (V != null) {
                int i11 = V.r;
                if (recyclerView.c0()) {
                    V.s = i11;
                    recyclerView.J0.add(V);
                } else {
                    View view = V.a;
                    WeakHashMap weakHashMap = i0.a;
                    view.setImportantForAccessibility(i11);
                }
                V.r = 0;
            }
            arrayList.remove(size);
        }
        int childCount = recyclerView.getChildCount();
        for (i10 = 0; i10 < childCount; i10++) {
            View childAt = recyclerView.getChildAt(i10);
            recyclerView.s(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
    }

    public void T(of.g gVar) {
        if (((of.d) this.b) == null) {
            return;
        }
        for (int i10 = 0; i10 < gVar.a.size(); i10++) {
            of.d dVar = (of.d) this.b;
            dVar.h.remove(gVar.a(i10).d);
            dVar.h();
        }
    }

    public void V(l5.i iVar, int i10, boolean z10) {
        char c10;
        r5.a aVar = (r5.a) this.d;
        Context context = (Context) this.b;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = iVar.a;
        String str2 = iVar.a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        i5.d dVar = iVar.c;
        adler32.update(allocate.putInt(v5.a.a(dVar)).array());
        byte[] bArr = iVar.b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z10) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i11 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i11 >= i10) {
                        g6.a(iVar, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                        return;
                    }
                }
            }
        }
        Cursor rawQuery = ((s5.h) ((s5.d) this.c)).a().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str2, String.valueOf(v5.a.a(dVar))});
        try {
            Long valueOf = rawQuery.moveToNext() ? Long.valueOf(rawQuery.getLong(0)) : 0L;
            rawQuery.close();
            long longValue = valueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(aVar.a(dVar, longValue, i10));
            Set set = ((r5.b) aVar.b.get(dVar)).c;
            if (set.contains(r5.c.a)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(r5.c.c)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(r5.c.b)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i10);
            persistableBundle.putString("backendName", str2);
            persistableBundle.putInt("priority", v5.a.a(dVar));
            if (bArr != null) {
                c10 = 0;
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            } else {
                c10 = 0;
            }
            builder.setExtras(persistableBundle);
            Integer valueOf2 = Integer.valueOf(value);
            Long valueOf3 = Long.valueOf(aVar.a(dVar, longValue, i10));
            Integer valueOf4 = Integer.valueOf(i10);
            Object[] objArr = new Object[5];
            objArr[c10] = iVar;
            objArr[1] = valueOf2;
            objArr[2] = valueOf3;
            objArr[3] = valueOf;
            objArr[4] = valueOf4;
            String c11 = g6.c("JobInfoScheduler");
            if (Log.isLoggable(c11, 3)) {
                Log.d(c11, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th2) {
            rawQuery.close();
            throw th2;
        }
    }

    public void W(of.a aVar) {
        of.g gVar;
        of.g gVar2 = (of.g) this.c;
        if (gVar2 != null && ((of.a) this.d) == null && aVar != null) {
            q(gVar2);
        }
        if (((of.a) this.d) != null && (gVar = (of.g) this.c) != null && aVar == null) {
            T(gVar);
        }
        of.a aVar2 = (of.a) this.d;
        if (aVar2 != null) {
            e6.h hVar = aVar2.a;
            n6.l.e("Must be called from the main thread.");
            hVar.i.remove(aVar2);
        }
        if (aVar != null) {
            aVar.a.p(aVar);
            of.g gVar3 = (of.g) this.c;
            if (gVar3 != null) {
                aVar.d = gVar3;
                aVar.g = 0;
                aVar.h = 0;
                aVar.p();
            }
        }
        this.d = aVar;
    }

    public FileOutputStream X() {
        File file = (File) this.c;
        File file2 = (File) this.d;
        if (file2.exists()) {
            U(file2, (File) this.b);
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

    public void Y(View view) {
        if (((ArrayList) this.d).remove(view)) {
            ka.c cVar = (ka.c) this.b;
            c1 V = RecyclerView.V(view);
            if (V != null) {
                RecyclerView recyclerView = (RecyclerView) cVar.b;
                int i10 = V.r;
                if (recyclerView.c0()) {
                    V.s = i10;
                    recyclerView.J0.add(V);
                } else {
                    View view2 = V.a;
                    WeakHashMap weakHashMap = i0.a;
                    view2.setImportantForAccessibility(i10);
                }
                V.r = 0;
            }
        }
    }

    public void Z(Object obj, String str) {
        i iVar = new i(7, false);
        ((i) this.d).d = iVar;
        this.d = iVar;
        iVar.c = obj;
        iVar.b = str;
    }

    @Override // t0.h
    public Uri c() {
        return (Uri) this.b;
    }

    @Override // org.telegram.ui.br0
    public /* synthetic */ boolean e() {
        return true;
    }

    @Override // t0.h
    public Uri f() {
        return (Uri) this.d;
    }

    @Override // org.telegram.ui.br0
    public void g() {
        ((ok) this.d).Q.w();
    }

    @Override // fd.a
    public Object get() {
        return new i((Context) ((fd.a) this.b).get(), (s5.d) ((fd.a) this.c).get(), (r5.a) ((qb.b) this.d).get(), 24);
    }

    @Override // t0.h
    public ClipDescription getDescription() {
        return (ClipDescription) this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0063  */
    @Override // org.telegram.ui.Components.pk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void h(View view, o0 o0Var, boolean z10, boolean z11) {
        float f7;
        p0 p0Var;
        zg.m0 m10;
        float f10;
        int i10;
        float f11;
        zn znVar = (zn) this.d;
        org.telegram.ui.Cells.a0 q82 = znVar.q8(((MessageObject) this.b).getId(), true);
        float f12 = 0.0f;
        if (q82 instanceof u1) {
            p0 p0Var2 = ((u1) q82).N;
            zg.m0 m11 = p0Var2.m(o0Var);
            if (m11 == null) {
                f11 = 0.0f;
                f7 = f11;
                znVar.ab(q82, (MessageObject) this.b, (qk0) this.c, view, f12, f7, o0Var, false, (o0Var == null && o0Var.a) ? true : z10, z11, false);
            } else {
                f12 = p0Var2.c + m11.x + (m11.A / 2.0f);
                f10 = p0Var2.d + m11.y;
                i10 = m11.B;
            }
        } else if (!(q82 instanceof w0) || (m10 = (p0Var = ((w0) q82).C0).m(o0Var)) == null) {
            f7 = 0.0f;
            znVar.ab(q82, (MessageObject) this.b, (qk0) this.c, view, f12, f7, o0Var, false, (o0Var == null && o0Var.a) ? true : z10, z11, false);
        } else {
            f12 = p0Var.c + m10.x + (m10.A / 2.0f);
            f10 = p0Var.d + m10.y;
            i10 = m10.B;
        }
        f11 = f10 + (i10 / 2.0f);
        f7 = f11;
        znVar.ab(q82, (MessageObject) this.b, (qk0) this.c, view, f12, f7, o0Var, false, (o0Var == null && o0Var.a) ? true : z10, z11, false);
    }

    @Override // org.telegram.ui.br0
    public void i(int i10, boolean z10, boolean z11) {
        if (z10) {
            return;
        }
        ok okVar = (ok) this.d;
        HashMap hashMap = (HashMap) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        vi viVar = okVar.b;
        if (hashMap.isEmpty() || okVar.Q == null || okVar.K) {
            return;
        }
        okVar.K = true;
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
        e5.a0(viVar.J1, viVar.j1() + arrayList2.size(), viVar.n1(), new d4(i10, 1, okVar, arrayList2, z11));
    }

    @Override // org.telegram.ui.Components.pk0
    public /* synthetic */ boolean j() {
        return true;
    }

    @Override // org.telegram.ui.Components.pk0
    public /* synthetic */ boolean k() {
        return false;
    }

    @Override // t0.h
    public Object l() {
        return null;
    }

    @Override // ja.a
    public /* bridge */ /* synthetic */ ja.a m(Class cls, ia.d dVar) {
        ((HashMap) this.b).put(cls, dVar);
        ((HashMap) this.c).remove(cls);
        return this;
    }

    public void q(of.g gVar) {
        if (((of.d) this.b) == null) {
            this.b = new of.d();
        }
        for (int i10 = 0; i10 < gVar.a.size(); i10++) {
            of.d dVar = (of.d) this.b;
            of.f a2 = gVar.a(i10);
            dVar.h.put(a2.d, a2);
            dVar.h();
        }
    }

    @Override // org.telegram.ui.Components.pk0
    public /* synthetic */ boolean r() {
        return false;
    }

    public void s(View view, int i10, boolean z10) {
        RecyclerView recyclerView = (RecyclerView) ((ka.c) this.b).b;
        int childCount = i10 < 0 ? recyclerView.getChildCount() : J(i10);
        ((e6.n) this.c).E(childCount, z10);
        if (z10) {
            N(view);
        }
        recyclerView.addView(view, childCount);
        c1 V = RecyclerView.V(view);
        recyclerView.g0(view);
        h0 h0Var = recyclerView.w;
        if (h0Var != null && V != null) {
            h0Var.y(V);
        }
        ArrayList arrayList = recyclerView.P;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((y) recyclerView.P.get(size)).getClass();
            }
        }
    }

    public void t(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        RecyclerView recyclerView = (RecyclerView) ((ka.c) this.b).b;
        int childCount = i10 < 0 ? recyclerView.getChildCount() : J(i10);
        ((e6.n) this.c).E(childCount, z10);
        if (z10) {
            N(view);
        }
        c1 V = RecyclerView.V(view);
        if (V != null) {
            if (!V.l() && !V.r()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + V + recyclerView.D());
            }
            V.l &= -257;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb2 = new StringBuilder("id3v2tag[pos=");
                mf.a aVar = (mf.a) this.b;
                sb2.append(aVar.b);
                sb2.append(", ");
                sb2.append(aVar.e());
                sb2.append(" left]");
                return sb2.toString();
            case 8:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.b);
                sb3.append('{');
                i iVar = (i) ((i) this.c).d;
                String str = "";
                while (iVar != null) {
                    Object obj = iVar.c;
                    sb3.append(str);
                    String str2 = (String) iVar.b;
                    if (str2 != null) {
                        sb3.append(str2);
                        sb3.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb3.append(obj);
                    } else {
                        sb3.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r4.length() - 1);
                    }
                    iVar = (i) iVar.d;
                    str = ", ";
                }
                sb3.append('}');
                return sb3.toString();
            case 25:
                return ((e6.n) this.c).toString() + ", hidden list:" + ((ArrayList) this.d).size();
            default:
                return super.toString();
        }
    }

    public String u(int i10, String str, long j3, long j10) {
        ArrayList arrayList = (ArrayList) this.b;
        ArrayList arrayList2 = (ArrayList) this.d;
        ArrayList arrayList3 = (ArrayList) this.c;
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < arrayList3.size(); i11++) {
            sb2.append((String) arrayList.get(i11));
            if (((Integer) arrayList3.get(i11)).intValue() == 1) {
                sb2.append(str);
            } else if (((Integer) arrayList3.get(i11)).intValue() == 2) {
                sb2.append(String.format(Locale.US, (String) arrayList2.get(i11), Long.valueOf(j3)));
            } else if (((Integer) arrayList3.get(i11)).intValue() == 3) {
                sb2.append(String.format(Locale.US, (String) arrayList2.get(i11), Integer.valueOf(i10)));
            } else if (((Integer) arrayList3.get(i11)).intValue() == 4) {
                sb2.append(String.format(Locale.US, (String) arrayList2.get(i11), Long.valueOf(j10)));
            }
        }
        sb2.append((String) arrayList.get(arrayList3.size()));
        return sb2.toString();
    }

    public void v() {
        b0 b0Var = (b0) this.b;
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

    public void y(int i10) {
        c1 V;
        int J = J(i10);
        ((e6.n) this.c).F(J);
        RecyclerView recyclerView = (RecyclerView) ((ka.c) this.b).b;
        View childAt = recyclerView.getChildAt(J);
        if (childAt != null && (V = RecyclerView.V(childAt)) != null) {
            if (V.l() && !V.r()) {
                throw new IllegalArgumentException("called detach on an already detached child " + V + recyclerView.D());
            }
            V.a(256);
        }
        recyclerView.detachViewFromParent(J);
    }

    public e z(f fVar) {
        InputStream inputStream;
        int i10 = fVar.c;
        InputStream inputStream2 = (mf.a) this.b;
        if (fVar.d) {
            a4.m mVar = (a4.m) this.d;
            mVar.getClass();
            byte[] bArr = new byte[i10];
            int i11 = 0;
            while (i11 < i10) {
                int read = ((com.google.firebase.messaging.d) mVar.b).read(bArr, i11, i10 - i11);
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
            throw new c("Frame encryption is not supported");
        }
        if (fVar.e) {
            i10 = fVar.g;
            inputStream = new InflaterInputStream(inputStream2);
        } else {
            inputStream = inputStream2;
        }
        return new e(inputStream, fVar.b, i10, (j) this.c, fVar);
    }

    public /* synthetic */ i(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ i(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public i(String str) {
        this.a = 8;
        i iVar = new i(7, false);
        this.c = iVar;
        this.d = iVar;
        this.b = str;
    }

    public i(InputStream inputStream, long j3, int i10, j jVar) {
        this.a = 0;
        mf.a aVar = new mf.a(inputStream, j3, i10);
        this.b = aVar;
        this.d = new a4.m(aVar, 27);
        this.c = jVar;
    }

    public i(String str, Boolean bool, uc.a aVar, String str2) {
        this.a = 28;
        this.b = str;
        this.c = str2;
        this.d = aVar;
    }

    public i(int i10) {
        this.a = i10;
        switch (i10) {
            case 22:
                this.b = new a3.l();
                this.c = null;
                this.d = null;
                break;
            case 29:
                this.b = new HashMap();
                this.c = new HashMap();
                this.d = v7.i.c;
                break;
            default:
                this.b = new Object();
                break;
        }
    }

    @Override // org.telegram.ui.br0
    public void a() {
    }

    @Override // t0.h
    public void d() {
    }

    @Override // t0.h
    public void o() {
    }

    @Override // org.telegram.ui.Components.pk0
    public /* synthetic */ void p() {
    }

    public i(ka.c cVar) {
        this.a = 25;
        this.b = cVar;
        this.c = new e6.n(6);
        this.d = new ArrayList();
    }

    public i(File file) {
        this.a = 20;
        this.b = file;
        this.c = new File(file.getPath() + ".new");
        this.d = new File(file.getPath() + ".bak");
    }

    @Override // org.telegram.ui.br0
    public void b(Editable editable) {
    }

    public i(r rVar) {
        this.a = 27;
        this.b = rVar;
    }

    public i(Runnable runnable) {
        this.a = 23;
        this.c = new CopyOnWriteArrayList();
        this.d = new HashMap();
        this.b = runnable;
    }

    public i(Context context, TypedArray typedArray) {
        this.a = 1;
        this.b = context;
        this.c = typedArray;
    }

    public i(byte[] bArr, w wVar) {
        this.a = 3;
        this.b = bArr;
        this.c = null;
        this.d = wVar;
    }

    public i(Uri uri, w wVar) {
        this.a = 3;
        this.b = null;
        this.c = uri;
        this.d = wVar;
    }

    public i(u uVar) {
        this.a = 9;
        this.a = 9;
        this.b = uVar;
        this.c = Choreographer.getInstance();
        this.d = new o1.a(this, 0);
    }

    public i(String str, String str2) {
        this.a = 11;
        this.b = str;
        this.c = str2;
        this.d = str2.isEmpty() ? str : a4.a.C(str, "/", str2);
    }

    public i(p4.e eVar, b0 b0Var) {
        this.a = 19;
        this.d = eVar;
        this.b = b0Var;
    }

    public i(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.a = 18;
        this.c = arrayDeque;
        this.b = bufferedReader;
    }

    public i(Object[] objArr, Object[] objArr2) {
        this.a = 15;
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
        this.c = w(objArr, iArr);
        this.d = w(objArr2, iArr);
    }

    @Override // org.telegram.ui.Components.pk0
    public /* synthetic */ void n(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
