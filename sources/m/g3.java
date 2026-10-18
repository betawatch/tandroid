package m;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
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
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import ei.p6;
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
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Components.bl0;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.d01;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.nk;
import org.telegram.ui.Components.pz0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.kq0;
import org.telegram.ui.sn;
import org.xmlpull.v1.XmlPullParserException;
import v7.b8;
import v7.q7;
import v7.u6;
import w7.l6;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public class g3 implements bl0, kq0, n5.b {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ g3(int i10, boolean z10) {
        this.a = i10;
    }

    public static g3 K(Context context, AttributeSet attributeSet, int[] iArr, int i10) {
        return new g3(context, context.obtainStyledAttributes(attributeSet, iArr, i10, 0));
    }

    public static void O(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e("AtomicFile", "Failed to delete file which is a directory " + file2);
        }
        if (file.renameTo(file2)) {
            return;
        }
        Log.e("AtomicFile", "Failed to rename " + file + " to " + file2);
    }

    public static g3 i(View view) {
        return new g3(view);
    }

    public static Object[] p(Object[] objArr, int[] iArr) {
        int length = objArr.length;
        Class<?> componentType = objArr.getClass().getComponentType();
        pz0 pz0Var = d01.R;
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

    public static n2.f s(b2.g0 g0Var) {
        g2.o oVar = new g2.o();
        oVar.c = null;
        Uri uri = g0Var.b;
        String uri2 = uri == null ? null : uri.toString();
        boolean z10 = g0Var.f;
        c2.b bVar = new c2.b();
        u6.g((z10 && TextUtils.isEmpty(uri2)) ? false : true);
        bVar.b = oVar;
        bVar.c = uri2;
        bVar.a = z10;
        bVar.d = new HashMap();
        e9.q0 q0Var = g0Var.c;
        e9.y0 y0Var = q0Var.a;
        if (y0Var == null) {
            y0Var = q0Var.b();
            q0Var.a = y0Var;
        }
        e9.m2 it = y0Var.iterator();
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
        int i10 = b2.m.a;
        oa.d dVar = new oa.d(27);
        UUID uuid = g0Var.a;
        uuid.getClass();
        boolean z11 = g0Var.d;
        boolean z12 = g0Var.e;
        int[] f7 = b8.f(g0Var.g);
        int length = f7.length;
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = f7[i11];
            u6.g(i12 == 2 || i12 == 1);
        }
        n2.f fVar = new n2.f(uuid, bVar, hashMap, z11, (int[]) f7.clone(), z12, dVar);
        byte[] bArr = g0Var.h;
        byte[] copyOf = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        u6.p(fVar.w.isEmpty());
        fVar.K = copyOf;
        return fVar;
    }

    public Drawable A(int i10) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.c;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0) ? typedArray.getDrawable(i10) : q7.b((Context) this.b, resourceId);
    }

    public Drawable B(int i10) {
        int resourceId;
        Drawable f7;
        if (!((TypedArray) this.c).hasValue(i10) || (resourceId = ((TypedArray) this.c).getResourceId(i10, 0)) == 0) {
            return null;
        }
        r a2 = r.a();
        Context context = (Context) this.b;
        synchronized (a2) {
            f7 = a2.a.f(resourceId, context, true);
        }
        return f7;
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
                a0.j jVar = i0.e.b;
                Typeface typeface = (Typeface) jVar.a(i0.e.b(resources, resourceId, charSequence2, i12, i11));
                int i13 = 22;
                if (typeface != null) {
                    new Handler(Looper.getMainLooper()).post(new p6(i13, j0Var, typeface));
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
                                new Handler(Looper.getMainLooper()).post(new p6(i13, j0Var2, e));
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
                            return i0.e.a(context, g10, resources, resourceId, charSequence2, typedValue.assetCookie, i11, j0Var);
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

    public ByteBuffer D() {
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

    public int E(int i10) {
        ad.d dVar = (ad.d) this.c;
        if (i10 < 0) {
            return -1;
        }
        int childCount = ((ih.g) this.b).a.getChildCount();
        int i11 = i10;
        while (i11 < childCount) {
            int A = i10 - (i11 - dVar.A(i11));
            if (A == 0) {
                while (dVar.D(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += A;
        }
        return -1;
    }

    public View F(int i10) {
        return ((ih.g) this.b).a.getChildAt(i10);
    }

    public int G() {
        return ((ih.g) this.b).a.getChildCount();
    }

    public boolean H() {
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

    public void I(View view) {
        ((ArrayList) this.d).add(view);
        ih.g gVar = (ih.g) this.b;
        s4.b1 U = RecyclerView.U(view);
        if (U != null) {
            View view2 = U.a;
            RecyclerView recyclerView = gVar.a;
            int i10 = U.s;
            if (i10 != -1) {
                U.r = i10;
            } else {
                WeakHashMap weakHashMap = r0.i0.a;
                U.r = view2.getImportantForAccessibility();
            }
            if (recyclerView.b0()) {
                U.s = 4;
                recyclerView.K0.add(U);
            } else {
                WeakHashMap weakHashMap2 = r0.i0.a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    public String J() {
        if (!H()) {
            throw new NoSuchElementException();
        }
        String str = (String) this.d;
        this.d = null;
        return str;
    }

    public void L() {
        ((TypedArray) this.c).recycle();
    }

    public void M() {
        int i10;
        RecyclerView recyclerView = ((ih.g) this.b).a;
        ((ad.d) this.c).G();
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            s4.b1 U = RecyclerView.U((View) arrayList.get(size));
            if (U != null) {
                int i11 = U.r;
                if (recyclerView.b0()) {
                    U.s = i11;
                    recyclerView.K0.add(U);
                } else {
                    View view = U.a;
                    WeakHashMap weakHashMap = r0.i0.a;
                    view.setImportantForAccessibility(i11);
                }
                U.r = 0;
            }
            arrayList.remove(size);
        }
        int childCount = recyclerView.getChildCount();
        for (i10 = 0; i10 < childCount; i10++) {
            View childAt = recyclerView.getChildAt(i10);
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
    }

    public void N(qf.g gVar) {
        if (((qf.d) this.b) == null) {
            return;
        }
        for (int i10 = 0; i10 < gVar.a.size(); i10++) {
            qf.d dVar = (qf.d) this.b;
            dVar.h.remove(gVar.a(i10).d);
            dVar.h();
        }
    }

    public void P(l5.i iVar, int i10, boolean z10) {
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
                        l6.a(iVar, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                        return;
                    }
                }
            }
        }
        Cursor rawQuery = ((s5.g) ((s5.d) this.c)).a().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str2, String.valueOf(v5.a.a(dVar))});
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
            String c11 = l6.c("JobInfoScheduler");
            if (Log.isLoggable(c11, 3)) {
                Log.d(c11, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th2) {
            rawQuery.close();
            throw th2;
        }
    }

    public void Q(qf.a aVar) {
        qf.g gVar;
        qf.g gVar2 = (qf.g) this.c;
        if (gVar2 != null && ((qf.a) this.d) == null && aVar != null) {
            f(gVar2);
        }
        if (((qf.a) this.d) != null && (gVar = (qf.g) this.c) != null && aVar == null) {
            N(gVar);
        }
        qf.a aVar2 = (qf.a) this.d;
        if (aVar2 != null) {
            e6.h hVar = aVar2.a;
            n6.l.e("Must be called from the main thread.");
            hVar.i.remove(aVar2);
        }
        if (aVar != null) {
            aVar.a.p(aVar);
            qf.g gVar3 = (qf.g) this.c;
            if (gVar3 != null) {
                aVar.d = gVar3;
                aVar.g = 0;
                aVar.h = 0;
                aVar.p();
            }
        }
        this.d = aVar;
    }

    public FileOutputStream R() {
        File file = (File) this.c;
        File file2 = (File) this.d;
        if (file2.exists()) {
            O(file2, (File) this.b);
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

    public void S(View view) {
        if (((ArrayList) this.d).remove(view)) {
            ih.g gVar = (ih.g) this.b;
            s4.b1 U = RecyclerView.U(view);
            if (U != null) {
                RecyclerView recyclerView = gVar.a;
                int i10 = U.r;
                if (recyclerView.b0()) {
                    U.s = i10;
                    recyclerView.K0.add(U);
                } else {
                    View view2 = U.a;
                    WeakHashMap weakHashMap = r0.i0.a;
                    view2.setImportantForAccessibility(i10);
                }
                U.r = 0;
            }
        }
    }

    public void T(Object obj, String str) {
        g3 g3Var = new g3(7, false);
        ((g3) this.d).d = g3Var;
        this.d = g3Var;
        g3Var.c = obj;
        g3Var.b = str;
    }

    @Override // org.telegram.ui.kq0
    public void c() {
        ((nk) this.d).Q.y();
    }

    @Override // org.telegram.ui.kq0
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
        f5.Z(tiVar.M1, tiVar.l1() + arrayList2.size(), tiVar.p1(), new ci.y2(i10, 2, nkVar, arrayList2, z11));
    }

    @Override // org.telegram.ui.kq0
    public /* synthetic */ boolean e() {
        return true;
    }

    public void f(qf.g gVar) {
        if (((qf.d) this.b) == null) {
            this.b = new qf.d();
        }
        for (int i10 = 0; i10 < gVar.a.size(); i10++) {
            qf.d dVar = (qf.d) this.b;
            qf.f a2 = gVar.a(i10);
            dVar.h.put(a2.d, a2);
            dVar.h();
        }
    }

    public void g(View view, int i10, boolean z10) {
        RecyclerView recyclerView = ((ih.g) this.b).a;
        int childCount = i10 < 0 ? recyclerView.getChildCount() : E(i10);
        ((ad.d) this.c).E(childCount, z10);
        if (z10) {
            I(view);
        }
        recyclerView.addView(view, childCount);
        s4.b1 U = RecyclerView.U(view);
        recyclerView.f0(view);
        s4.g0 g0Var = recyclerView.w;
        if (g0Var != null && U != null) {
            g0Var.y(U);
        }
        ArrayList arrayList = recyclerView.P;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((s4.y) recyclerView.P.get(size)).getClass();
            }
        }
    }

    @Override // hd.a
    public Object get() {
        return new g3((Context) ((hd.a) this.b).get(), (s5.d) ((hd.a) this.c).get(), (r5.a) ((oa.d) this.d).get(), 27);
    }

    @Override // org.telegram.ui.Components.bl0
    public /* synthetic */ boolean h() {
        return true;
    }

    public void j(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        RecyclerView recyclerView = ((ih.g) this.b).a;
        int childCount = i10 < 0 ? recyclerView.getChildCount() : E(i10);
        ((ad.d) this.c).E(childCount, z10);
        if (z10) {
            I(view);
        }
        s4.b1 U = RecyclerView.U(view);
        if (U != null) {
            if (!U.l() && !U.r()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + U + recyclerView.C());
            }
            U.l &= -257;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    @Override // org.telegram.ui.Components.bl0
    public /* synthetic */ boolean k() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0063  */
    @Override // org.telegram.ui.Components.bl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void l(View view, ah.i1 i1Var, boolean z10, boolean z11) {
        float f7;
        ah.j1 j1Var;
        ah.g1 l4;
        float f10;
        int i10;
        float f11;
        sn snVar = (sn) this.d;
        org.telegram.ui.Cells.a0 t82 = snVar.t8(((MessageObject) this.b).getId(), true);
        float f12 = 0.0f;
        if (t82 instanceof org.telegram.ui.Cells.u1) {
            ah.j1 j1Var2 = ((org.telegram.ui.Cells.u1) t82).N;
            ah.g1 l10 = j1Var2.l(i1Var);
            if (l10 == null) {
                f11 = 0.0f;
                f7 = f11;
                snVar.eb(t82, (MessageObject) this.b, (cl0) this.c, view, f12, f7, i1Var, false, (i1Var == null && i1Var.a) ? true : z10, z11, false);
            } else {
                f12 = j1Var2.c + l10.x + (l10.A / 2.0f);
                f10 = j1Var2.d + l10.y;
                i10 = l10.B;
            }
        } else if (!(t82 instanceof org.telegram.ui.Cells.w0) || (l4 = (j1Var = ((org.telegram.ui.Cells.w0) t82).E0).l(i1Var)) == null) {
            f7 = 0.0f;
            snVar.eb(t82, (MessageObject) this.b, (cl0) this.c, view, f12, f7, i1Var, false, (i1Var == null && i1Var.a) ? true : z10, z11, false);
        } else {
            f12 = j1Var.c + l4.x + (l4.A / 2.0f);
            f10 = j1Var.d + l4.y;
            i10 = l4.B;
        }
        f11 = f10 + (i10 / 2.0f);
        f7 = f11;
        snVar.eb(t82, (MessageObject) this.b, (cl0) this.c, view, f12, f7, i1Var, false, (i1Var == null && i1Var.a) ? true : z10, z11, false);
    }

    public String n(int i10, String str, long j10, long j11) {
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

    public void o() {
        android.support.v4.media.session.b0 b0Var = (android.support.v4.media.session.b0) this.b;
        if (b0Var != null) {
            int i10 = ((p4.e) this.d).n.d;
            android.support.v4.media.session.v vVar = b0Var.a;
            vVar.getClass();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(i10);
            vVar.a.setPlaybackToLocal(builder.build());
            this.c = null;
        }
    }

    @Override // org.telegram.ui.Components.bl0
    public /* synthetic */ boolean r() {
        return false;
    }

    public void t(int i10) {
        s4.b1 U;
        int E = E(i10);
        ((ad.d) this.c).F(E);
        RecyclerView recyclerView = ((ih.g) this.b).a;
        View childAt = recyclerView.getChildAt(E);
        if (childAt != null && (U = RecyclerView.U(childAt)) != null) {
            if (U.l() && !U.r()) {
                throw new IllegalArgumentException("called detach on an already detached child " + U + recyclerView.C());
            }
            U.a(256);
        }
        recyclerView.detachViewFromParent(E);
    }

    public String toString() {
        switch (this.a) {
            case 8:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.b);
                sb2.append('{');
                g3 g3Var = (g3) ((g3) this.c).d;
                String str = "";
                while (g3Var != null) {
                    Object obj = g3Var.c;
                    sb2.append(str);
                    String str2 = (String) g3Var.b;
                    if (str2 != null) {
                        sb2.append(str2);
                        sb2.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb2.append(obj);
                    } else {
                        sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r4.length() - 1);
                    }
                    g3Var = (g3) g3Var.d;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            case 9:
                StringBuilder sb3 = new StringBuilder("id3v2tag[pos=");
                of.a aVar = (of.a) this.b;
                sb3.append(aVar.b);
                sb3.append(", ");
                sb3.append(aVar.e());
                sb3.append(" left]");
                return sb3.toString();
            case 28:
                return ((ad.d) this.c).toString() + ", hidden list:" + ((ArrayList) this.d).size();
            default:
                return super.toString();
        }
    }

    public void u(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
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

    public nf.e v(nf.f fVar) {
        InputStream inputStream;
        int i10 = fVar.c;
        InputStream inputStream2 = (of.a) this.b;
        if (fVar.d) {
            k0.b bVar = (k0.b) this.d;
            bVar.getClass();
            byte[] bArr = new byte[i10];
            int i11 = 0;
            while (i11 < i10) {
                int read = ((com.google.firebase.messaging.d) bVar.b).read(bArr, i11, i10 - i11);
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
            throw new nf.c("Frame encryption is not supported");
        }
        if (fVar.e) {
            i10 = fVar.g;
            inputStream = new InflaterInputStream(inputStream2);
        } else {
            inputStream = inputStream2;
        }
        return new nf.e(inputStream, fVar.b, i10, (nf.h) this.c, fVar);
    }

    public n2.n w(b2.o0 o0Var) {
        n2.f fVar;
        o0Var.b.getClass();
        b2.g0 g0Var = o0Var.b.c;
        if (g0Var == null) {
            return n2.n.z;
        }
        synchronized (this.b) {
            try {
                if (!g0Var.equals((b2.g0) this.c)) {
                    this.c = g0Var;
                    this.d = s(g0Var);
                }
                fVar = (n2.f) this.d;
                fVar.getClass();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }

    public View x(int i10) {
        return ((ih.g) this.b).a.getChildAt(E(i10));
    }

    public int y() {
        return ((ih.g) this.b).a.getChildCount() - ((ArrayList) this.d).size();
    }

    public ColorStateList z(int i10) {
        int resourceId;
        ColorStateList a2;
        TypedArray typedArray = (TypedArray) this.c;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (a2 = q7.a((Context) this.b, resourceId)) == null) ? typedArray.getColorStateList(i10) : a2;
    }

    public /* synthetic */ g3(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ g3(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public g3(String str) {
        this.a = 8;
        g3 g3Var = new g3(7, false);
        this.c = g3Var;
        this.d = g3Var;
        this.b = str;
    }

    public g3(InputStream inputStream, long j10, int i10, nf.h hVar) {
        this.a = 9;
        of.a aVar = new of.a(inputStream, j10, i10);
        this.b = aVar;
        this.d = new k0.b(aVar, 9);
        this.c = hVar;
    }

    public g3(View view) {
        this.a = 15;
        this.d = view;
        m71 m71Var = new m71(this, view);
        this.b = m71Var;
        view.addOnLayoutChangeListener(m71Var);
    }

    public g3(int i10) {
        this.a = i10;
        switch (i10) {
            case 23:
                this.b = new a3.l();
                this.c = null;
                this.d = null;
                break;
            default:
                this.b = new Object();
                break;
        }
    }

    public g3(ih.g gVar) {
        this.a = 28;
        this.b = gVar;
        this.c = new ad.d(7);
        this.d = new ArrayList();
    }

    @Override // org.telegram.ui.kq0
    public void a() {
    }

    @Override // org.telegram.ui.Components.bl0
    public /* synthetic */ void q() {
    }

    public g3(File file) {
        this.a = 21;
        this.b = file;
        this.c = new File(file.getPath() + ".new");
        this.d = new File(file.getPath() + ".bak");
    }

    @Override // org.telegram.ui.kq0
    public void b(Editable editable) {
    }

    public g3(Runnable runnable) {
        this.a = 26;
        this.c = new CopyOnWriteArrayList();
        this.d = new HashMap();
        this.b = runnable;
    }

    public g3(Context context, TypedArray typedArray) {
        this.a = 0;
        this.b = context;
        this.c = typedArray;
    }

    public g3(byte[] bArr, j9.y yVar) {
        this.a = 2;
        this.b = bArr;
        this.c = null;
        this.d = yVar;
    }

    public g3(b2.r0 r0Var, j9.y yVar) {
        this.a = 2;
        this.b = r0Var.k;
        this.c = r0Var.n;
        this.d = yVar;
    }

    public g3(k0.b bVar) {
        this.a = 10;
        this.a = 10;
        this.b = bVar;
        this.c = Choreographer.getInstance();
        this.d = new o1.a(this, 0);
    }

    public g3(String str, String str2) {
        this.a = 25;
        this.b = str;
        this.c = str2;
        this.d = str2.isEmpty() ? str : a1.g.C(str, "/", str2);
    }

    public g3(p4.e eVar, android.support.v4.media.session.b0 b0Var) {
        this.a = 20;
        this.d = eVar;
        this.b = b0Var;
    }

    public g3(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.a = 19;
        this.c = arrayDeque;
        this.b = bufferedReader;
    }

    public g3(Object[] objArr, Object[] objArr2) {
        this.a = 14;
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
        this.c = p(objArr, iArr);
        this.d = p(objArr2, iArr);
    }

    @Override // org.telegram.ui.Components.bl0
    public /* synthetic */ void m(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
