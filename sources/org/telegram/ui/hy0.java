package org.telegram.ui;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ClipDescription;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.AudioAttributes;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.PersistableBundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public class hy0 implements jy0, t0.h, q5.b, wi.w0, oa.a {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ hy0(int i7, boolean z9) {
        this.a = i7;
    }

    public static void I(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e("AtomicFile", "Failed to delete file which is a directory " + file2);
        }
        if (file.renameTo(file2)) {
            return;
        }
        Log.e("AtomicFile", "Failed to rename " + file + " to " + file2);
    }

    public static q2.e o(e2.d0 d0Var) {
        j2.p pVar = new j2.p();
        pVar.c = null;
        Uri uri = d0Var.b;
        String uri2 = uri == null ? null : uri.toString();
        boolean z9 = d0Var.f;
        ab.q qVar = new ab.q();
        a8.ia.f((z9 && TextUtils.isEmpty(uri2)) ? false : true);
        qVar.b = pVar;
        qVar.c = uri2;
        qVar.a = z9;
        qVar.d = new HashMap();
        h9.l0 l0Var = d0Var.c;
        h9.t0 t0Var = l0Var.a;
        if (t0Var == null) {
            t0Var = l0Var.c();
            l0Var.a = t0Var;
        }
        h9.h2 it = t0Var.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            str.getClass();
            str2.getClass();
            synchronized (((HashMap) qVar.d)) {
                ((HashMap) qVar.d).put(str, str2);
            }
        }
        HashMap hashMap = new HashMap();
        int i7 = e2.l.a;
        pb.b bVar = new pb.b(4);
        UUID uuid = d0Var.a;
        uuid.getClass();
        boolean z10 = d0Var.d;
        boolean z11 = d0Var.e;
        int[] f10 = c8.e1.f(d0Var.g);
        int length = f10.length;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = f10[i10];
            a8.ia.f(i11 == 2 || i11 == 1);
        }
        q2.e eVar = new q2.e(uuid, qVar, hashMap, z10, (int[]) f10.clone(), z11, bVar);
        byte[] bArr = d0Var.h;
        byte[] copyOf = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        a8.ia.p(eVar.x.isEmpty());
        eVar.K = copyOf;
        return eVar;
    }

    public View A(int i7) {
        return ((RecyclerView) ((org.telegram.ui.Components.uy) this.b).b).getChildAt(i7);
    }

    public int B() {
        return ((RecyclerView) ((org.telegram.ui.Components.uy) this.b).b).getChildCount();
    }

    public boolean C() {
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

    public void D(View view) {
        ((ArrayList) this.d).add(view);
        org.telegram.ui.Components.uy uyVar = (org.telegram.ui.Components.uy) this.b;
        v4.d1 U = RecyclerView.U(view);
        if (U != null) {
            View view2 = U.a;
            RecyclerView recyclerView = (RecyclerView) uyVar.b;
            int i7 = U.s;
            if (i7 != -1) {
                U.r = i7;
            } else {
                WeakHashMap weakHashMap = r0.i0.a;
                U.r = view2.getImportantForAccessibility();
            }
            if (recyclerView.c0()) {
                U.s = 4;
                recyclerView.K0.add(U);
            } else {
                WeakHashMap weakHashMap2 = r0.i0.a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
    
        if (r1.d != r11) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0059, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0080, code lost:
    
        if (r1.d != r11) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void E(j2.h hVar, Uri uri, Map map, long j3, long j10, x2.w0 w0Var) {
        f3.l lVar = new f3.l(hVar, j3, j10);
        this.d = lVar;
        if (((f3.o) this.c) != null) {
            return;
        }
        f3.o[] e10 = ((f3.r) this.b).e(uri, map);
        int length = e10.length;
        h9.g0 g0Var = h9.i0.b;
        h9.o.g(length, "expectedSize");
        h9.f0 f0Var = new h9.f0(length);
        boolean z9 = true;
        if (e10.length == 1) {
            this.c = e10[0];
        } else {
            int length2 = e10.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length2) {
                    break;
                }
                f3.o oVar = e10[i7];
                try {
                } catch (EOFException unused) {
                    if (((f3.o) this.c) == null) {
                    }
                } catch (Throwable th2) {
                    if (((f3.o) this.c) == null && lVar.d != j3) {
                        z9 = false;
                    }
                    a8.ia.p(z9);
                    lVar.f = 0;
                    throw th2;
                }
                if (oVar.b(lVar)) {
                    this.c = oVar;
                    lVar.f = 0;
                    break;
                }
                f0Var.d(oVar.e());
                if (((f3.o) this.c) == null) {
                }
                boolean z10 = true;
                a8.ia.p(z10);
                lVar.f = 0;
                i7++;
            }
            if (((f3.o) this.c) == null) {
                String str = "None of the available extractors (" + new g9.l(", ", 0).e(h9.o.y(h9.i0.r(e10), new v0.j(21))) + ") could read the stream.";
                uri.getClass();
                throw new x2.r1(str, f0Var.f());
            }
        }
        ((f3.o) this.c).c(w0Var);
    }

    public String F() {
        if (!C()) {
            throw new NoSuchElementException();
        }
        String str = (String) this.d;
        this.d = null;
        return str;
    }

    public void G() {
        int i7;
        RecyclerView recyclerView = (RecyclerView) ((org.telegram.ui.Components.uy) this.b).b;
        ((a8.ua) this.c).H();
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            v4.d1 U = RecyclerView.U((View) arrayList.get(size));
            if (U != null) {
                int i10 = U.r;
                if (recyclerView.c0()) {
                    U.s = i10;
                    recyclerView.K0.add(U);
                } else {
                    View view = U.a;
                    WeakHashMap weakHashMap = r0.i0.a;
                    view.setImportantForAccessibility(i10);
                }
                U.r = 0;
            }
            arrayList.remove(size);
        }
        int childCount = recyclerView.getChildCount();
        for (i7 = 0; i7 < childCount; i7++) {
            View childAt = recyclerView.getChildAt(i7);
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
    }

    public void H(g7.c cVar) {
        if (((wf.d) this.b) == null) {
            return;
        }
        for (int i7 = 0; i7 < cVar.a.size(); i7++) {
            wf.d dVar = (wf.d) this.b;
            dVar.h.remove(cVar.a(i7).d);
            dVar.h();
        }
    }

    public void J(o5.i iVar, int i7, boolean z9) {
        char c10;
        u5.a aVar = (u5.a) this.d;
        Context context = (Context) this.b;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = iVar.a;
        String str2 = iVar.a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        l5.d dVar = iVar.c;
        adler32.update(allocate.putInt(y5.a.a(dVar)).array());
        byte[] bArr = iVar.b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z9) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i10 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i10 >= i7) {
                        c8.cc.a(iVar, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                        return;
                    }
                }
            }
        }
        Cursor rawQuery = ((v5.g) ((v5.d) this.c)).a().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str2, String.valueOf(y5.a.a(dVar))});
        try {
            Long valueOf = rawQuery.moveToNext() ? Long.valueOf(rawQuery.getLong(0)) : 0L;
            rawQuery.close();
            long longValue = valueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(aVar.a(dVar, longValue, i7));
            Set set = ((u5.b) aVar.b.get(dVar)).c;
            if (set.contains(u5.c.a)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(u5.c.c)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(u5.c.b)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i7);
            persistableBundle.putString("backendName", str2);
            persistableBundle.putInt("priority", y5.a.a(dVar));
            if (bArr != null) {
                c10 = 0;
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            } else {
                c10 = 0;
            }
            builder.setExtras(persistableBundle);
            Integer valueOf2 = Integer.valueOf(value);
            Long valueOf3 = Long.valueOf(aVar.a(dVar, longValue, i7));
            Integer valueOf4 = Integer.valueOf(i7);
            Object[] objArr = new Object[5];
            objArr[c10] = iVar;
            objArr[1] = valueOf2;
            objArr[2] = valueOf3;
            objArr[3] = valueOf;
            objArr[4] = valueOf4;
            String c11 = c8.cc.c("JobInfoScheduler");
            if (Log.isLoggable(c11, 3)) {
                Log.d(c11, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th2) {
            rawQuery.close();
            throw th2;
        }
    }

    public void K(wf.a aVar) {
        g7.c cVar;
        g7.c cVar2 = (g7.c) this.c;
        if (cVar2 != null && ((wf.a) this.d) == null && aVar != null) {
            j(cVar2);
        }
        if (((wf.a) this.d) != null && (cVar = (g7.c) this.c) != null && aVar == null) {
            H(cVar);
        }
        wf.a aVar2 = (wf.a) this.d;
        if (aVar2 != null) {
            h6.h hVar = aVar2.a;
            q6.m.d("Must be called from the main thread.");
            hVar.i.remove(aVar2);
        }
        if (aVar != null) {
            aVar.a.p(aVar);
            g7.c cVar3 = (g7.c) this.c;
            if (cVar3 != null) {
                aVar.d = cVar3;
                aVar.g = 0;
                aVar.h = 0;
                aVar.p();
            }
        }
        this.d = aVar;
    }

    public FileOutputStream L() {
        File file = (File) this.c;
        File file2 = (File) this.d;
        if (file2.exists()) {
            I(file2, (File) this.b);
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

    public void M(View view) {
        if (((ArrayList) this.d).remove(view)) {
            org.telegram.ui.Components.uy uyVar = (org.telegram.ui.Components.uy) this.b;
            v4.d1 U = RecyclerView.U(view);
            if (U != null) {
                RecyclerView recyclerView = (RecyclerView) uyVar.b;
                int i7 = U.r;
                if (recyclerView.c0()) {
                    U.s = i7;
                    recyclerView.K0.add(U);
                } else {
                    View view2 = U.a;
                    WeakHashMap weakHashMap = r0.i0.a;
                    view2.setImportantForAccessibility(i7);
                }
                U.r = 0;
            }
        }
    }

    public void N(Object obj, String str) {
        hy0 hy0Var = new hy0(8, false);
        ((hy0) this.d).d = hy0Var;
        this.d = hy0Var;
        hy0Var.c = obj;
        hy0Var.b = str;
    }

    @Override // org.telegram.ui.jy0
    public void a() {
        org.telegram.messenger.c20 c20Var;
        boolean[] zArr = (boolean[]) this.b;
        if (!zArr[0] && (c20Var = (org.telegram.messenger.c20) this.c) != null) {
            zArr[0] = true;
            c20Var.a(Boolean.TRUE);
        }
        org.telegram.messenger.g0.i3(new ru0((org.telegram.ui.Components.hc) this.d, 9), 200L);
    }

    @Override // oa.a
    public /* bridge */ /* synthetic */ oa.a b(Class cls, na.d dVar) {
        ((HashMap) this.b).put(cls, dVar);
        ((HashMap) this.c).remove(cls);
        return this;
    }

    @Override // t0.h
    public Uri c() {
        return (Uri) this.b;
    }

    @Override // t0.h
    public Uri f() {
        return (Uri) this.d;
    }

    @Override // fd.a
    public Object get() {
        return new hy0((Context) ((fd.a) this.b).get(), (v5.d) ((fd.a) this.c).get(), (u5.a) ((sa.d) this.d).get(), 19);
    }

    @Override // t0.h
    public ClipDescription getDescription() {
        return (ClipDescription) this.c;
    }

    @Override // t0.h
    public Object h() {
        return null;
    }

    public void j(g7.c cVar) {
        if (((wf.d) this.b) == null) {
            this.b = new wf.d();
        }
        for (int i7 = 0; i7 < cVar.a.size(); i7++) {
            wf.d dVar = (wf.d) this.b;
            wf.e a10 = cVar.a(i7);
            dVar.h.put(a10.d, a10);
            dVar.h();
        }
    }

    public void k(int i7, View view, boolean z9) {
        RecyclerView recyclerView = (RecyclerView) ((org.telegram.ui.Components.uy) this.b).b;
        int childCount = i7 < 0 ? recyclerView.getChildCount() : z(i7);
        ((a8.ua) this.c).F(childCount, z9);
        if (z9) {
            D(view);
        }
        recyclerView.addView(view, childCount);
        v4.d1 U = RecyclerView.U(view);
        recyclerView.g0(view);
        v4.g0 g0Var = recyclerView.x;
        if (g0Var != null && U != null) {
            g0Var.y(U);
        }
        ArrayList arrayList = recyclerView.P;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((v4.p0) recyclerView.P.get(size)).b();
            }
        }
    }

    public void l(View view, int i7, ViewGroup.LayoutParams layoutParams, boolean z9) {
        RecyclerView recyclerView = (RecyclerView) ((org.telegram.ui.Components.uy) this.b).b;
        int childCount = i7 < 0 ? recyclerView.getChildCount() : z(i7);
        ((a8.ua) this.c).F(childCount, z9);
        if (z9) {
            D(view);
        }
        v4.d1 U = RecyclerView.U(view);
        if (U != null) {
            if (!U.l() && !U.r()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + U + recyclerView.C());
            }
            U.l &= -257;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public String m(int i7, long j3, long j10, String str) {
        ArrayList arrayList = (ArrayList) this.b;
        ArrayList arrayList2 = (ArrayList) this.d;
        ArrayList arrayList3 = (ArrayList) this.c;
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            sb2.append((String) arrayList.get(i10));
            if (((Integer) arrayList3.get(i10)).intValue() == 1) {
                sb2.append(str);
            } else if (((Integer) arrayList3.get(i10)).intValue() == 2) {
                sb2.append(String.format(Locale.US, (String) arrayList2.get(i10), Long.valueOf(j3)));
            } else if (((Integer) arrayList3.get(i10)).intValue() == 3) {
                sb2.append(String.format(Locale.US, (String) arrayList2.get(i10), Integer.valueOf(i7)));
            } else if (((Integer) arrayList3.get(i10)).intValue() == 4) {
                sb2.append(String.format(Locale.US, (String) arrayList2.get(i10), Long.valueOf(j10)));
            }
        }
        sb2.append((String) arrayList.get(arrayList3.size()));
        return sb2.toString();
    }

    public void n() {
        android.support.v4.media.session.a0 a0Var = (android.support.v4.media.session.a0) this.b;
        if (a0Var != null) {
            int i7 = ((s4.e) this.d).n.d;
            android.support.v4.media.session.u uVar = (android.support.v4.media.session.u) a0Var.b;
            uVar.getClass();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(i7);
            uVar.a.setPlaybackToLocal(builder.build());
            this.c = null;
        }
    }

    public void p(int i7) {
        v4.d1 U;
        int z9 = z(i7);
        ((a8.ua) this.c).G(z9);
        RecyclerView recyclerView = (RecyclerView) ((org.telegram.ui.Components.uy) this.b).b;
        View childAt = recyclerView.getChildAt(z9);
        if (childAt != null && (U = RecyclerView.U(childAt)) != null) {
            if (U.l() && !U.r()) {
                throw new IllegalArgumentException("called detach on an already detached child " + U + recyclerView.C());
            }
            U.a(256);
        }
        recyclerView.detachViewFromParent(z9);
    }

    public void q(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = (HashMap) this.b;
        qa.e eVar = new qa.e(byteArrayOutputStream, hashMap, (HashMap) this.c, (na.d) this.d);
        if (obj == null) {
            return;
        }
        na.d dVar = (na.d) hashMap.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, eVar);
        } else {
            throw new na.b("No encoder for " + obj.getClass());
        }
    }

    @Override // wi.w0
    public void r(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
        byteBuffer.position(bufferInfo.offset);
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        allocateDirect.put(byteBuffer).flip();
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        bufferInfo2.set(0, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
        ((ArrayList) this.b).add(allocateDirect);
        ((ArrayList) this.c).add(bufferInfo2);
    }

    public tf.e s(tf.f fVar) {
        InputStream inputStream;
        int i7 = fVar.c;
        InputStream inputStream2 = (uf.a) this.b;
        if (fVar.d) {
            org.telegram.ui.Components.uy uyVar = (org.telegram.ui.Components.uy) this.d;
            uyVar.getClass();
            byte[] bArr = new byte[i7];
            int i10 = 0;
            while (i10 < i7) {
                int read = ((ab.d) uyVar.b).read(bArr, i10, i7 - i10);
                if (read <= 0) {
                    throw new EOFException();
                }
                i10 += read;
            }
            int i11 = 0;
            boolean z9 = false;
            for (int i12 = 0; i12 < i7; i12++) {
                byte b10 = bArr[i12];
                if (!z9 || b10 != 0) {
                    bArr[i11] = b10;
                    i11++;
                }
                z9 = b10 == -1;
            }
            inputStream2 = new ByteArrayInputStream(bArr, 0, i11);
            i7 = i11;
        }
        if (fVar.f) {
            throw new tf.c("Frame encryption is not supported");
        }
        if (fVar.e) {
            i7 = fVar.g;
            inputStream = new InflaterInputStream(inputStream2);
        } else {
            inputStream = inputStream2;
        }
        return new tf.e(inputStream, fVar.b, i7, (tf.h) this.c, fVar);
    }

    public q2.m t(e2.l0 l0Var) {
        q2.e eVar;
        l0Var.b.getClass();
        e2.d0 d0Var = l0Var.b.c;
        if (d0Var == null) {
            return q2.m.A;
        }
        synchronized (this.b) {
            try {
                if (!d0Var.equals((e2.d0) this.c)) {
                    this.c = d0Var;
                    this.d = o(d0Var);
                }
                eVar = (q2.e) this.d;
                eVar.getClass();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }

    public String toString() {
        String str = "";
        switch (this.a) {
            case 9:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.b);
                sb2.append('{');
                hy0 hy0Var = (hy0) ((hy0) this.c).d;
                while (hy0Var != null) {
                    Object obj = hy0Var.c;
                    sb2.append(str);
                    String str2 = (String) hy0Var.b;
                    if (str2 != null) {
                        sb2.append(str2);
                        sb2.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb2.append(obj);
                    } else {
                        sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r4.length() - 1);
                    }
                    hy0Var = (hy0) hy0Var.d;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            case 18:
                StringBuilder sb3 = new StringBuilder("id3v2tag[pos=");
                uf.a aVar = (uf.a) this.b;
                sb3.append(aVar.b);
                sb3.append(", ");
                sb3.append(aVar.e());
                sb3.append(" left]");
                return sb3.toString();
            case 22:
                return ((a8.ua) this.c).toString() + ", hidden list:" + ((ArrayList) this.d).size();
            case 29:
                StringBuilder sb4 = new StringBuilder(32);
                sb4.append((String) this.b);
                sb4.append('{');
                hy0 hy0Var2 = (hy0) ((hy0) this.c).d;
                while (hy0Var2 != null) {
                    Object obj2 = hy0Var2.c;
                    sb4.append(str);
                    String str3 = (String) hy0Var2.b;
                    if (str3 != null) {
                        sb4.append(str3);
                        sb4.append('=');
                    }
                    if (obj2 == null || !obj2.getClass().isArray()) {
                        sb4.append(obj2);
                    } else {
                        sb4.append((CharSequence) Arrays.deepToString(new Object[]{obj2}), 1, r4.length() - 1);
                    }
                    hy0Var2 = (hy0) hy0Var2.d;
                    str = ", ";
                }
                sb4.append('}');
                return sb4.toString();
            default:
                return super.toString();
        }
    }

    public View u(int i7) {
        return ((RecyclerView) ((org.telegram.ui.Components.uy) this.b).b).getChildAt(z(i7));
    }

    public int v() {
        return ((RecyclerView) ((org.telegram.ui.Components.uy) this.b).b).getChildCount() - ((ArrayList) this.d).size();
    }

    @Override // wi.w0
    public void w(MediaFormat mediaFormat) {
        this.d = mediaFormat;
    }

    public long x() {
        f3.l lVar = (f3.l) this.d;
        if (lVar != null) {
            return lVar.d;
        }
        return -1L;
    }

    public ByteBuffer y() {
        Bitmap bitmap = (Bitmap) this.d;
        if (bitmap == null) {
            return (ByteBuffer) this.c;
        }
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = ((Bitmap) this.d).getHeight();
        int i7 = width * height;
        ((Bitmap) this.d).getPixels(new int[i7], 0, width, 0, 0, width, height);
        byte[] bArr = new byte[i7];
        for (int i10 = 0; i10 < i7; i10++) {
            bArr[i10] = (byte) ((Color.blue(r2[i10]) * 0.114f) + (Color.green(r2[i10]) * 0.587f) + (Color.red(r2[i10]) * 0.299f));
        }
        return ByteBuffer.wrap(bArr);
    }

    public int z(int i7) {
        a8.ua uaVar = (a8.ua) this.c;
        if (i7 < 0) {
            return -1;
        }
        int childCount = ((RecyclerView) ((org.telegram.ui.Components.uy) this.b).b).getChildCount();
        int i10 = i7;
        while (i10 < childCount) {
            int B = i7 - (i10 - uaVar.B(i10));
            if (B == 0) {
                while (uaVar.E(i10)) {
                    i10++;
                }
                return i10;
            }
            i10 += B;
        }
        return -1;
    }

    public /* synthetic */ hy0(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public hy0(String str, int i7) {
        this.a = i7;
        switch (i7) {
            case 29:
                hy0 hy0Var = new hy0(28, false);
                this.c = hy0Var;
                this.d = hy0Var;
                this.b = str;
                break;
            default:
                hy0 hy0Var2 = new hy0(8, false);
                this.c = hy0Var2;
                this.d = hy0Var2;
                this.b = str;
                break;
        }
    }

    public hy0(InputStream inputStream, long j3, int i7, tf.h hVar) {
        this.a = 18;
        uf.a aVar = new uf.a(inputStream, j3, i7);
        this.b = aVar;
        this.d = new org.telegram.ui.Components.uy(aVar, 19);
        this.c = hVar;
    }

    public hy0(String str, Boolean bool, uc.a aVar, String str2) {
        this.a = 20;
        this.b = str;
        this.c = str2;
        this.d = aVar;
    }

    public hy0(int i7) {
        this.a = i7;
        switch (i7) {
            case 17:
                this.b = new b7.d();
                this.c = null;
                this.d = null;
                break;
            case 25:
                this.b = new ArrayList();
                this.c = new ArrayList();
                break;
            case 27:
                this.b = new HashMap();
                this.c = new HashMap();
                this.d = y7.i.c;
                break;
            default:
                this.b = new Object();
                break;
        }
    }

    @Override // org.telegram.ui.jy0
    public /* synthetic */ void d() {
    }

    @Override // t0.h
    public void e() {
    }

    @Override // org.telegram.ui.jy0
    public /* synthetic */ void g() {
    }

    @Override // t0.h
    public void i() {
    }

    public hy0(org.telegram.ui.Components.uy uyVar) {
        this.a = 22;
        this.b = uyVar;
        this.c = new a8.ua(8);
        this.d = new ArrayList();
    }

    public hy0(File file) {
        this.a = 5;
        this.b = file;
        this.c = new File(file.getPath() + ".new");
        this.d = new File(file.getPath() + ".bak");
    }

    public hy0(f3.r rVar) {
        this.a = 26;
        this.b = rVar;
    }

    public hy0(Runnable runnable) {
        this.a = 11;
        this.c = new CopyOnWriteArrayList();
        this.d = new HashMap();
        this.b = runnable;
    }

    public hy0(byte[] bArr, m9.y yVar) {
        this.a = 3;
        this.b = bArr;
        this.c = null;
        this.d = yVar;
    }

    public hy0(e2.o0 o0Var, m9.y yVar) {
        this.a = 3;
        this.b = o0Var.k;
        this.c = o0Var.n;
        this.d = yVar;
    }

    public hy0(org.telegram.ui.Components.qt qtVar) {
        this.a = 12;
        this.a = 12;
        this.b = qtVar;
        this.c = Choreographer.getInstance();
        this.d = new org.telegram.ui.Components.xy0(this, 1);
    }

    public hy0(String str, String str2) {
        this.a = 21;
        this.b = str;
        this.c = str2;
        this.d = str2.isEmpty() ? str : a8.p0.D(str, "/", str2);
    }

    public hy0(s4.e eVar, android.support.v4.media.session.a0 a0Var) {
        this.a = 14;
        this.d = eVar;
        this.b = a0Var;
    }

    public hy0(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.a = 13;
        this.c = arrayDeque;
        this.b = bufferedReader;
    }
}
