package m2;

import ah.h1;
import ah.j1;
import ah.k1;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ClipDescription;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RectF;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.PersistableBundle;
import android.support.v4.media.session.v;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import b2.c0;
import bi.q3;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import e9.a1;
import e9.f0;
import e9.g0;
import e9.k0;
import e9.m0;
import e9.o1;
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
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Cells.a0;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.w0;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.jz0;
import org.telegram.ui.Components.ok;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.vy0;
import org.telegram.ui.ar0;
import org.telegram.ui.co;
import r0.i0;
import s4.c1;
import s4.h0;
import s4.y;
import u2.u0;
import v7.x7;
import w7.f6;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public class t implements ek0, ar0, n5.b, t0.i, ja.a {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ t(int i10, boolean z10) {
        this.a = i10;
    }

    public static void N(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e("AtomicFile", "Failed to delete file which is a directory " + file2);
        }
        if (file.renameTo(file2)) {
            return;
        }
        Log.e("AtomicFile", "Failed to rename " + file + " to " + file2);
    }

    public static Object[] r(Object[] objArr, int[] iArr) {
        int length = objArr.length;
        Class<?> componentType = objArr.getClass().getComponentType();
        vy0 vy0Var = jz0.R;
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

    public static n2.e s(c0 c0Var) {
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
        rb.a aVar = new rb.a(26);
        UUID uuid2 = c0Var.a;
        uuid2.getClass();
        boolean z11 = c0Var.d;
        boolean z12 = c0Var.e;
        int[] f7 = x7.f(c0Var.g);
        int length = f7.length;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = f7[i10];
            e2.d.b(i11 == 2 || i11 == 1);
        }
        n2.e eVar = new n2.e(uuid2, mVar, hashMap, z11, (int[]) f7.clone(), z12, aVar);
        byte[] bArr = c0Var.h;
        byte[] copyOf = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        e2.d.g(eVar.w.isEmpty());
        eVar.K = copyOf;
        return eVar;
    }

    public ByteBuffer A() {
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

    /* JADX WARN: Removed duplicated region for block: B:9:0x0063  */
    @Override // org.telegram.ui.Components.ek0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void B(View view, j1 j1Var, boolean z10, boolean z11) {
        float f7;
        k1 k1Var;
        h1 l4;
        float f10;
        int i10;
        float f11;
        co coVar = (co) this.d;
        a0 q82 = coVar.q8(((MessageObject) this.b).getId(), true);
        float f12 = 0.0f;
        if (q82 instanceof t1) {
            k1 k1Var2 = ((t1) q82).N;
            h1 l10 = k1Var2.l(j1Var);
            if (l10 == null) {
                f11 = 0.0f;
                f7 = f11;
                coVar.ab(q82, (MessageObject) this.b, (fk0) this.c, view, f12, f7, j1Var, false, (j1Var == null && j1Var.a) ? true : z10, z11, false);
            } else {
                f12 = k1Var2.c + l10.x + (l10.A / 2.0f);
                f10 = k1Var2.d + l10.y;
                i10 = l10.B;
            }
        } else if (!(q82 instanceof w0) || (l4 = (k1Var = ((w0) q82).C0).l(j1Var)) == null) {
            f7 = 0.0f;
            coVar.ab(q82, (MessageObject) this.b, (fk0) this.c, view, f12, f7, j1Var, false, (j1Var == null && j1Var.a) ? true : z10, z11, false);
        } else {
            f12 = k1Var.c + l4.x + (l4.A / 2.0f);
            f10 = k1Var.d + l4.y;
            i10 = l4.B;
        }
        f11 = f10 + (i10 / 2.0f);
        f7 = f11;
        coVar.ab(q82, (MessageObject) this.b, (fk0) this.c, view, f12, f7, j1Var, false, (j1Var == null && j1Var.a) ? true : z10, z11, false);
    }

    public int C(int i10) {
        e6.n nVar = (e6.n) this.d;
        if (i10 < 0) {
            return -1;
        }
        int childCount = ((RecyclerView) ((l.d) this.c).b).getChildCount();
        int i11 = i10;
        while (i11 < childCount) {
            int A = i10 - (i11 - nVar.A(i11));
            if (A == 0) {
                while (nVar.D(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += A;
        }
        return -1;
    }

    public View D(int i10) {
        return ((RecyclerView) ((l.d) this.c).b).getChildAt(i10);
    }

    public int E() {
        return ((RecyclerView) ((l.d) this.c).b).getChildCount();
    }

    public boolean F() {
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

    public void G(View view) {
        ((ArrayList) this.b).add(view);
        l.d dVar = (l.d) this.c;
        c1 U = RecyclerView.U(view);
        if (U != null) {
            View view2 = U.a;
            RecyclerView recyclerView = (RecyclerView) dVar.b;
            int i10 = U.s;
            if (i10 != -1) {
                U.r = i10;
            } else {
                WeakHashMap weakHashMap = i0.a;
                U.r = view2.getImportantForAccessibility();
            }
            if (recyclerView.b0()) {
                U.s = 4;
                recyclerView.J0.add(U);
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
    public void H(g2.h hVar, Uri uri, Map map, long j3, long j10, u0 u0Var) {
        c3.l lVar = new c3.l(hVar, j3, j10);
        this.d = lVar;
        if (((c3.o) this.c) != null) {
            return;
        }
        c3.o[] c10 = ((c3.r) this.b).c(uri, map);
        int length = c10.length;
        g0 g0Var = e9.i0.b;
        e9.q.e(length, "expectedSize");
        f0 f0Var = new f0(length);
        boolean z10 = true;
        if (c10.length == 1) {
            this.c = c10[0];
        } else {
            int length2 = c10.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length2) {
                    break;
                }
                c3.o oVar = c10[i10];
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
                if (oVar.b(lVar)) {
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
                d9.f fVar = new d9.f(", ");
                Iterator it = e9.q.w(e9.i0.w(c10), new t0.a(2)).iterator();
                StringBuilder sb3 = new StringBuilder();
                fVar.a(sb3, it);
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

    public String K() {
        if (!F()) {
            throw new NoSuchElementException();
        }
        String str = (String) this.d;
        this.d = null;
        return str;
    }

    public void L() {
        int i10;
        RecyclerView recyclerView = (RecyclerView) ((l.d) this.c).b;
        ((e6.n) this.d).G();
        ArrayList arrayList = (ArrayList) this.b;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            c1 U = RecyclerView.U((View) arrayList.get(size));
            if (U != null) {
                int i11 = U.r;
                if (recyclerView.b0()) {
                    U.s = i11;
                    recyclerView.J0.add(U);
                } else {
                    View view = U.a;
                    WeakHashMap weakHashMap = i0.a;
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

    public void M(pf.g gVar) {
        if (((pf.d) this.b) == null) {
            return;
        }
        for (int i10 = 0; i10 < gVar.a.size(); i10++) {
            pf.d dVar = (pf.d) this.b;
            dVar.h.remove(gVar.a(i10).d);
            dVar.h();
        }
    }

    public void O(l5.i iVar, int i10, boolean z10) {
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
                        f6.a(iVar, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
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
            String c11 = f6.c("JobInfoScheduler");
            if (Log.isLoggable(c11, 3)) {
                Log.d(c11, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th2) {
            rawQuery.close();
            throw th2;
        }
    }

    public void P(pf.a aVar) {
        pf.g gVar;
        pf.g gVar2 = (pf.g) this.c;
        if (gVar2 != null && ((pf.a) this.d) == null && aVar != null) {
            l(gVar2);
        }
        if (((pf.a) this.d) != null && (gVar = (pf.g) this.c) != null && aVar == null) {
            M(gVar);
        }
        pf.a aVar2 = (pf.a) this.d;
        if (aVar2 != null) {
            e6.h hVar = aVar2.a;
            n6.l.e("Must be called from the main thread.");
            hVar.i.remove(aVar2);
        }
        if (aVar != null) {
            aVar.a.p(aVar);
            pf.g gVar3 = (pf.g) this.c;
            if (gVar3 != null) {
                aVar.d = gVar3;
                aVar.g = 0;
                aVar.h = 0;
                aVar.p();
            }
        }
        this.d = aVar;
    }

    public FileOutputStream Q() {
        File file = (File) this.c;
        File file2 = (File) this.d;
        if (file2.exists()) {
            N(file2, (File) this.b);
        }
        try {
            return new FileOutputStream(file);
        } catch (FileNotFoundException unused) {
            if (!file.getParentFile().mkdirs()) {
                throw new IOException("Failed to create directory for " + file);
            }
            try {
                return new FileOutputStream(file);
            } catch (FileNotFoundException e7) {
                throw new IOException("Failed to create new file " + file, e7);
            }
        }
    }

    public void R(View view) {
        if (((ArrayList) this.b).remove(view)) {
            l.d dVar = (l.d) this.c;
            c1 U = RecyclerView.U(view);
            if (U != null) {
                RecyclerView recyclerView = (RecyclerView) dVar.b;
                int i10 = U.r;
                if (recyclerView.b0()) {
                    U.s = i10;
                    recyclerView.J0.add(U);
                } else {
                    View view2 = U.a;
                    WeakHashMap weakHashMap = i0.a;
                    view2.setImportantForAccessibility(i10);
                }
                U.r = 0;
            }
        }
    }

    @Override // org.telegram.ui.Components.ek0
    public /* synthetic */ boolean S() {
        return false;
    }

    public void T(Object obj, String str) {
        t tVar = new t(6, false);
        ((t) this.d).d = tVar;
        this.d = tVar;
        tVar.c = obj;
        tVar.b = str;
    }

    @Override // t0.i
    public Uri c() {
        return (Uri) this.b;
    }

    @Override // org.telegram.ui.ar0
    public /* synthetic */ boolean e() {
        return true;
    }

    @Override // t0.i
    public Uri f() {
        return (Uri) this.d;
    }

    @Override // org.telegram.ui.ar0
    public void g() {
        ((ok) this.d).Q.w();
    }

    @Override // fd.a
    public Object get() {
        return new t((Context) ((fd.a) this.b).get(), (s5.d) ((fd.a) this.c).get(), (r5.a) ((rb.a) this.d).get(), 22);
    }

    @Override // t0.i
    public ClipDescription getDescription() {
        return (ClipDescription) this.c;
    }

    @Override // org.telegram.ui.ar0
    public void h(int i10, boolean z10, boolean z11) {
        if (z10) {
            return;
        }
        ok okVar = (ok) this.d;
        HashMap hashMap = (HashMap) this.c;
        ArrayList arrayList = (ArrayList) this.b;
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
        e5.a0(viVar.J1, viVar.j1() + arrayList2.size(), viVar.n1(), new q3(i10, 1, okVar, arrayList2, z11));
    }

    @Override // t0.i
    public Object i() {
        return null;
    }

    @Override // ja.a
    public /* bridge */ /* synthetic */ ja.a j(Class cls, ia.d dVar) {
        ((HashMap) this.b).put(cls, dVar);
        ((HashMap) this.c).remove(cls);
        return this;
    }

    public void l(pf.g gVar) {
        if (((pf.d) this.b) == null) {
            this.b = new pf.d();
        }
        for (int i10 = 0; i10 < gVar.a.size(); i10++) {
            pf.d dVar = (pf.d) this.b;
            pf.f a2 = gVar.a(i10);
            dVar.h.put(a2.d, a2);
            dVar.h();
        }
    }

    public void m(View view, int i10, boolean z10) {
        RecyclerView recyclerView = (RecyclerView) ((l.d) this.c).b;
        int childCount = i10 < 0 ? recyclerView.getChildCount() : C(i10);
        ((e6.n) this.d).E(childCount, z10);
        if (z10) {
            G(view);
        }
        recyclerView.addView(view, childCount);
        c1 U = RecyclerView.U(view);
        recyclerView.f0(view);
        h0 h0Var = recyclerView.w;
        if (h0Var != null && U != null) {
            h0Var.y(U);
        }
        ArrayList arrayList = recyclerView.P;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((y) recyclerView.P.get(size)).getClass();
            }
        }
    }

    @Override // org.telegram.ui.Components.ek0
    public /* synthetic */ boolean n() {
        return true;
    }

    public void o(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        RecyclerView recyclerView = (RecyclerView) ((l.d) this.c).b;
        int childCount = i10 < 0 ? recyclerView.getChildCount() : C(i10);
        ((e6.n) this.d).E(childCount, z10);
        if (z10) {
            G(view);
        }
        c1 U = RecyclerView.U(view);
        if (U != null) {
            if (!U.l() && !U.r()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + U + recyclerView.C());
            }
            U.l &= -257;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public String p(int i10, String str, long j3, long j10) {
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

    public void q() {
        android.support.v4.media.session.c0 c0Var = (android.support.v4.media.session.c0) this.b;
        if (c0Var != null) {
            int i10 = ((p4.e) this.d).n.d;
            v vVar = c0Var.a;
            vVar.getClass();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(i10);
            vVar.a.setPlaybackToLocal(builder.build());
            this.c = null;
        }
    }

    @Override // org.telegram.ui.Components.ek0
    public /* synthetic */ boolean t() {
        return false;
    }

    public String toString() {
        String str = "";
        switch (this.a) {
            case 3:
                StringBuilder sb2 = new StringBuilder("id3v2tag[pos=");
                nf.a aVar = (nf.a) this.b;
                sb2.append(aVar.b);
                sb2.append(", ");
                sb2.append(aVar.e());
                sb2.append(" left]");
                return sb2.toString();
            case 7:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.b);
                sb3.append('{');
                t tVar = (t) ((t) this.c).d;
                while (tVar != null) {
                    Object obj = tVar.c;
                    sb3.append(str);
                    String str2 = (String) tVar.b;
                    if (str2 != null) {
                        sb3.append(str2);
                        sb3.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb3.append(obj);
                    } else {
                        sb3.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r4.length() - 1);
                    }
                    tVar = (t) tVar.d;
                    str = ", ";
                }
                sb3.append('}');
                return sb3.toString();
            case 23:
                return ((e6.n) this.d).toString() + ", hidden list:" + ((ArrayList) this.b).size();
            case 29:
                StringBuilder sb4 = new StringBuilder(32);
                sb4.append((String) this.b);
                sb4.append('{');
                t tVar2 = (t) ((t) this.c).d;
                while (tVar2 != null) {
                    Object obj2 = tVar2.c;
                    sb4.append(str);
                    String str3 = (String) tVar2.b;
                    if (str3 != null) {
                        sb4.append(str3);
                        sb4.append('=');
                    }
                    if (obj2 == null || !obj2.getClass().isArray()) {
                        sb4.append(obj2);
                    } else {
                        sb4.append((CharSequence) Arrays.deepToString(new Object[]{obj2}), 1, r4.length() - 1);
                    }
                    tVar2 = (t) tVar2.d;
                    str = ", ";
                }
                sb4.append('}');
                return sb4.toString();
            default:
                return super.toString();
        }
    }

    public void u(int i10) {
        c1 U;
        int C = C(i10);
        ((e6.n) this.d).F(C);
        RecyclerView recyclerView = (RecyclerView) ((l.d) this.c).b;
        View childAt = recyclerView.getChildAt(C);
        if (childAt != null && (U = RecyclerView.U(childAt)) != null) {
            if (U.l() && !U.r()) {
                throw new IllegalArgumentException("called detach on an already detached child " + U + recyclerView.C());
            }
            U.a(256);
        }
        recyclerView.detachViewFromParent(C);
    }

    public mf.e v(mf.f fVar) {
        InputStream inputStream;
        int i10 = fVar.c;
        InputStream inputStream2 = (nf.a) this.b;
        if (fVar.d) {
            l.d dVar = (l.d) this.d;
            dVar.getClass();
            byte[] bArr = new byte[i10];
            int i11 = 0;
            while (i11 < i10) {
                int read = ((com.google.firebase.messaging.d) dVar.b).read(bArr, i11, i10 - i11);
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
            throw new mf.c("Frame encryption is not supported");
        }
        if (fVar.e) {
            i10 = fVar.g;
            inputStream = new InflaterInputStream(inputStream2);
        } else {
            inputStream = inputStream2;
        }
        return new mf.e(inputStream, fVar.b, i10, (mf.h) this.c, fVar);
    }

    public n2.m w(b2.k0 k0Var) {
        n2.e eVar;
        k0Var.b.getClass();
        c0 c0Var = k0Var.b.c;
        if (c0Var == null) {
            return n2.m.z;
        }
        synchronized (this.b) {
            try {
                if (!c0Var.equals((c0) this.c)) {
                    this.c = c0Var;
                    this.d = s(c0Var);
                }
                eVar = (n2.e) this.d;
                eVar.getClass();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }

    public View x(int i10) {
        return ((RecyclerView) ((l.d) this.c).b).getChildAt(C(i10));
    }

    public int y() {
        return ((RecyclerView) ((l.d) this.c).b).getChildCount() - ((ArrayList) this.b).size();
    }

    public long z() {
        c3.l lVar = (c3.l) this.d;
        if (lVar != null) {
            return lVar.d;
        }
        return -1L;
    }

    public /* synthetic */ t(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public t(String str, int i10) {
        this.a = i10;
        switch (i10) {
            case 29:
                t tVar = new t(28, false);
                this.c = tVar;
                this.d = tVar;
                this.b = str;
                break;
            default:
                t tVar2 = new t(6, false);
                this.c = tVar2;
                this.d = tVar2;
                this.b = str;
                break;
        }
    }

    public t(InputStream inputStream, long j3, int i10, mf.h hVar) {
        this.a = 3;
        nf.a aVar = new nf.a(inputStream, j3, i10);
        this.b = aVar;
        this.d = new l.d(aVar, 4);
        this.c = hVar;
    }

    public t(String str, Boolean bool, uc.a aVar, String str2) {
        this.a = 26;
        this.b = str;
        this.c = str2;
        this.d = aVar;
    }

    public t(int i10) {
        this.a = i10;
        switch (i10) {
            case 20:
                this.b = new a3.k();
                this.c = null;
                this.d = null;
                break;
            case 27:
                this.b = new HashMap();
                this.c = new HashMap();
                this.d = v7.i.c;
                break;
            default:
                this.b = new Object();
                break;
        }
    }

    @Override // org.telegram.ui.Components.ek0
    public /* synthetic */ void J() {
    }

    @Override // org.telegram.ui.ar0
    public void a() {
    }

    @Override // t0.i
    public void d() {
    }

    @Override // t0.i
    public void k() {
    }

    public t(l.d dVar) {
        this.a = 23;
        this.c = dVar;
        this.d = new e6.n(6);
        this.b = new ArrayList();
    }

    @Override // org.telegram.ui.ar0
    public void b(Editable editable) {
    }

    public t(File file) {
        this.a = 18;
        this.b = file;
        this.c = new File(file.getPath() + ".new");
        this.d = new File(file.getPath() + ".bak");
    }

    public t(c3.r rVar) {
        this.a = 25;
        this.b = rVar;
    }

    public t(Runnable runnable) {
        this.a = 21;
        this.c = new CopyOnWriteArrayList();
        this.d = new HashMap();
        this.b = runnable;
    }

    public t(byte[] bArr, w wVar) {
        this.a = 1;
        this.b = bArr;
        this.c = null;
        this.d = wVar;
    }

    public t(Uri uri, w wVar) {
        this.a = 1;
        this.b = null;
        this.c = uri;
        this.d = wVar;
    }

    public t(k2.g0 g0Var) {
        this.a = 8;
        this.a = 8;
        this.b = g0Var;
        this.c = Choreographer.getInstance();
        this.d = new o1.a(this, 0);
    }

    public t(ok okVar, HashMap hashMap, ArrayList arrayList) {
        this.a = 11;
        this.d = okVar;
        this.c = hashMap;
        this.b = arrayList;
    }

    public t(p4.e eVar, android.support.v4.media.session.c0 c0Var) {
        this.a = 16;
        this.d = eVar;
        this.b = c0Var;
    }

    public t(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.a = 15;
        this.c = arrayDeque;
        this.b = bufferedReader;
    }

    public t(Object[] objArr, Object[] objArr2) {
        this.a = 12;
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
        this.c = r(objArr, iArr);
        this.d = r(objArr2, iArr);
    }

    public t(co coVar, MessageObject messageObject, fk0 fk0Var) {
        this.a = 10;
        this.d = coVar;
        this.b = messageObject;
        this.c = fk0Var;
    }

    @Override // org.telegram.ui.Components.ek0
    public /* synthetic */ void I(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
