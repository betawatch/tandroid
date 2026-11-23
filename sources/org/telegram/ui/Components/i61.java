package org.telegram.ui.Components;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ClipDescription;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.media.AudioAttributes;
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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public class i61 implements hi.l7, org.telegram.ui.ky0, t0.h, q5.b, oa.a {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ i61(int i7, boolean z10) {
        this.a = i7;
    }

    public static void M(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e("AtomicFile", "Failed to delete file which is a directory " + file2);
        }
        if (file.renameTo(file2)) {
            return;
        }
        Log.e("AtomicFile", "Failed to rename " + file + " to " + file2);
    }

    public static q2.e s(e2.d0 d0Var) {
        j2.o oVar = new j2.o();
        oVar.c = null;
        Uri uri = d0Var.b;
        String uri2 = uri == null ? null : uri.toString();
        boolean z10 = d0Var.f;
        ab.q qVar = new ab.q();
        a8.ma.f((z10 && TextUtils.isEmpty(uri2)) ? false : true);
        qVar.b = oVar;
        qVar.c = uri2;
        qVar.a = z10;
        qVar.d = new HashMap();
        h9.l0 l0Var = d0Var.c;
        h9.t0 t0Var = l0Var.a;
        if (t0Var == null) {
            t0Var = l0Var.c();
            l0Var.a = t0Var;
        }
        h9.g2 it = t0Var.iterator();
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
        qb.a aVar = new qb.a(4);
        UUID uuid = d0Var.a;
        uuid.getClass();
        boolean z11 = d0Var.d;
        boolean z12 = d0Var.e;
        int[] f10 = c8.l1.f(d0Var.g);
        int length = f10.length;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = f10[i10];
            a8.ma.f(i11 == 2 || i11 == 1);
        }
        q2.e eVar = new q2.e(uuid, qVar, hashMap, z11, (int[]) f10.clone(), z12, aVar);
        byte[] bArr = d0Var.h;
        byte[] copyOf = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        a8.ma.p(eVar.x.isEmpty());
        eVar.L = copyOf;
        return eVar;
    }

    public long A() {
        f3.l lVar = (f3.l) this.d;
        if (lVar != null) {
            return lVar.d;
        }
        return -1L;
    }

    public ByteBuffer B() {
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

    public int C(int i7) {
        a8.va vaVar = (a8.va) this.c;
        if (i7 < 0) {
            return -1;
        }
        int childCount = ((RecyclerView) ((v4.b) this.b).b).getChildCount();
        int i10 = i7;
        while (i10 < childCount) {
            int B = i7 - (i10 - vaVar.B(i10));
            if (B == 0) {
                while (vaVar.E(i10)) {
                    i10++;
                }
                return i10;
            }
            i10 += B;
        }
        return -1;
    }

    public Paint D(float f10, int i7) {
        Paint[] paintArr = (Paint[]) this.b;
        if (paintArr[i7] == null) {
            Paint paint = new Paint(1);
            paintArr[i7] = paint;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
        paintArr[i7].setShader(null);
        paintArr[i7].setColor(-65536);
        paintArr[i7].setAlpha((int) (f10 * 255.0f));
        return paintArr[i7];
    }

    public View E(int i7) {
        return ((RecyclerView) ((v4.b) this.b).b).getChildAt(i7);
    }

    public int F() {
        return ((RecyclerView) ((v4.b) this.b).b).getChildCount();
    }

    public boolean G() {
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

    public void H(View view) {
        ((ArrayList) this.d).add(view);
        v4.b bVar = (v4.b) this.b;
        v4.f1 U = RecyclerView.U(view);
        if (U != null) {
            View view2 = U.a;
            RecyclerView recyclerView = (RecyclerView) bVar.b;
            int i7 = U.s;
            if (i7 != -1) {
                U.r = i7;
            } else {
                WeakHashMap weakHashMap = r0.i0.a;
                U.r = view2.getImportantForAccessibility();
            }
            if (recyclerView.c0()) {
                U.s = 4;
                recyclerView.L0.add(U);
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
    public void I(j2.h hVar, Uri uri, Map map, long j3, long j10, x2.w0 w0Var) {
        f3.l lVar = new f3.l(hVar, j3, j10);
        this.d = lVar;
        if (((f3.o) this.c) != null) {
            return;
        }
        f3.o[] c10 = ((f3.r) this.b).c(uri, map);
        int length = c10.length;
        h9.g0 g0Var = h9.i0.b;
        h9.o.g(length, "expectedSize");
        h9.f0 f0Var = new h9.f0(length);
        boolean z10 = true;
        if (c10.length == 1) {
            this.c = c10[0];
        } else {
            int length2 = c10.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length2) {
                    break;
                }
                f3.o oVar = c10[i7];
                try {
                } catch (EOFException unused) {
                    if (((f3.o) this.c) == null) {
                    }
                } catch (Throwable th2) {
                    if (((f3.o) this.c) == null && lVar.d != j3) {
                        z10 = false;
                    }
                    a8.ma.p(z10);
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
                boolean z11 = true;
                a8.ma.p(z11);
                lVar.f = 0;
                i7++;
            }
            if (((f3.o) this.c) == null) {
                String str = "None of the available extractors (" + new f5.g(", ").b(h9.o.y(h9.i0.r(c10), new ug.x(28))) + ") could read the stream.";
                uri.getClass();
                throw new x2.s1(str, f0Var.f());
            }
        }
        ((f3.o) this.c).c(w0Var);
    }

    public String J() {
        if (!G()) {
            throw new NoSuchElementException();
        }
        String str = (String) this.d;
        this.d = null;
        return str;
    }

    public void K() {
        int i7;
        RecyclerView recyclerView = (RecyclerView) ((v4.b) this.b).b;
        ((a8.va) this.c).H();
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            v4.f1 U = RecyclerView.U((View) arrayList.get(size));
            if (U != null) {
                int i10 = U.r;
                if (recyclerView.c0()) {
                    U.s = i10;
                    recyclerView.L0.add(U);
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

    public void L(wf.f fVar) {
        if (((wf.d) this.b) == null) {
            return;
        }
        for (int i7 = 0; i7 < fVar.a.size(); i7++) {
            wf.d dVar = (wf.d) this.b;
            dVar.h.remove(fVar.g(i7).d);
            dVar.h();
        }
    }

    public void N(o5.i iVar, int i7, boolean z10) {
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
        if (!z10) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i10 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i10 >= i7) {
                        c8.hc.a(iVar, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
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
            String c11 = c8.hc.c("JobInfoScheduler");
            if (Log.isLoggable(c11, 3)) {
                Log.d(c11, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th2) {
            rawQuery.close();
            throw th2;
        }
    }

    public void O(wf.a aVar) {
        wf.f fVar;
        wf.f fVar2 = (wf.f) this.c;
        if (fVar2 != null && ((wf.a) this.d) == null && aVar != null) {
            l(fVar2);
        }
        if (((wf.a) this.d) != null && (fVar = (wf.f) this.c) != null && aVar == null) {
            L(fVar);
        }
        wf.a aVar2 = (wf.a) this.d;
        if (aVar2 != null) {
            h6.h hVar = aVar2.a;
            q6.m.e("Must be called from the main thread.");
            hVar.i.remove(aVar2);
        }
        if (aVar != null) {
            aVar.a.p(aVar);
            wf.f fVar3 = (wf.f) this.c;
            if (fVar3 != null) {
                aVar.d = fVar3;
                aVar.g = 0;
                aVar.h = 0;
                aVar.p();
            }
        }
        this.d = aVar;
    }

    public FileOutputStream P() {
        File file = (File) this.c;
        File file2 = (File) this.d;
        if (file2.exists()) {
            M(file2, (File) this.b);
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

    public void Q(View view) {
        if (((ArrayList) this.d).remove(view)) {
            v4.b bVar = (v4.b) this.b;
            v4.f1 U = RecyclerView.U(view);
            if (U != null) {
                RecyclerView recyclerView = (RecyclerView) bVar.b;
                int i7 = U.r;
                if (recyclerView.c0()) {
                    U.s = i7;
                    recyclerView.L0.add(U);
                } else {
                    View view2 = U.a;
                    WeakHashMap weakHashMap = r0.i0.a;
                    view2.setImportantForAccessibility(i7);
                }
                U.r = 0;
            }
        }
    }

    public void R(Object obj, String str) {
        i61 i61Var = new i61(11, false);
        ((i61) this.d).d = i61Var;
        this.d = i61Var;
        i61Var.c = obj;
        i61Var.b = str;
    }

    @Override // org.telegram.ui.ky0
    public void a() {
        org.telegram.messenger.w10 w10Var;
        boolean[] zArr = (boolean[]) this.b;
        if (!zArr[0] && (w10Var = (org.telegram.messenger.w10) this.c) != null) {
            zArr[0] = true;
            w10Var.a(Boolean.TRUE);
        }
        org.telegram.messenger.g0.h3(new org.telegram.ui.qu0((kc) this.d, 9), 200L);
    }

    @Override // t0.h
    public Uri b() {
        return (Uri) this.b;
    }

    @Override // oa.a
    public /* bridge */ /* synthetic */ oa.a c(Class cls, na.d dVar) {
        ((HashMap) this.b).put(cls, dVar);
        ((HashMap) this.c).remove(cls);
        return this;
    }

    @Override // t0.h
    public Uri f() {
        return (Uri) this.d;
    }

    @Override // hi.l7
    public void g(ArrayList arrayList) {
        j61 j61Var = (j61) this.d;
        if (j61Var.b == ((hi.r7) this.c)) {
            j61Var.g = arrayList;
        }
    }

    @Override // fd.a
    public Object get() {
        return new i61((Context) ((fd.a) this.b).get(), (v5.d) ((fd.a) this.c).get(), (u5.a) ((pb.b) this.d).get(), 22);
    }

    @Override // t0.h
    public ClipDescription getDescription() {
        return (ClipDescription) this.c;
    }

    @Override // t0.h
    public Object h() {
        return null;
    }

    @Override // hi.l7
    public void j(long j3, long j10, boolean z10) {
        ((m.o3) this.b).f(j3, j10, z10);
    }

    public void l(wf.f fVar) {
        if (((wf.d) this.b) == null) {
            this.b = new wf.d();
        }
        for (int i7 = 0; i7 < fVar.a.size(); i7++) {
            wf.d dVar = (wf.d) this.b;
            wf.e g10 = fVar.g(i7);
            dVar.h.put(g10.d, g10);
            dVar.h();
        }
    }

    public void m(int i7, View view, boolean z10) {
        RecyclerView recyclerView = (RecyclerView) ((v4.b) this.b).b;
        int childCount = i7 < 0 ? recyclerView.getChildCount() : C(i7);
        ((a8.va) this.c).F(childCount, z10);
        if (z10) {
            H(view);
        }
        recyclerView.addView(view, childCount);
        v4.f1 U = RecyclerView.U(view);
        recyclerView.g0(view);
        v4.i0 i0Var = recyclerView.x;
        if (i0Var != null && U != null) {
            i0Var.y(U);
        }
        ArrayList arrayList = recyclerView.Q;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((v4.r0) recyclerView.Q.get(size)).b();
            }
        }
    }

    public void n(View view, int i7, ViewGroup.LayoutParams layoutParams, boolean z10) {
        RecyclerView recyclerView = (RecyclerView) ((v4.b) this.b).b;
        int childCount = i7 < 0 ? recyclerView.getChildCount() : C(i7);
        ((a8.va) this.c).F(childCount, z10);
        if (z10) {
            H(view);
        }
        v4.f1 U = RecyclerView.U(view);
        if (U != null) {
            if (!U.l() && !U.r()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + U + recyclerView.C());
            }
            U.l &= -257;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public String o(int i7, long j3, long j10, String str) {
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

    @Override // hi.l7
    public void p() {
        j61 j61Var = (j61) this.d;
        if (j61Var.b != ((hi.r7) this.c)) {
            return;
        }
        j61Var.c();
        j61Var.a.i();
    }

    public void q() {
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

    public void r(Canvas canvas, RectF rectF, float f10) {
        Paint[] paintArr = (Paint[]) this.b;
        if (paintArr[0] == null) {
            Paint paint = new Paint(1);
            paintArr[0] = paint;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
        paintArr[0].setShader((LinearGradient) this.c);
        paintArr[0].setAlpha((int) (f10 * 255.0f));
        canvas.drawRect(rectF, paintArr[0]);
    }

    public void t(int i7) {
        v4.f1 U;
        int C = C(i7);
        ((a8.va) this.c).G(C);
        RecyclerView recyclerView = (RecyclerView) ((v4.b) this.b).b;
        View childAt = recyclerView.getChildAt(C);
        if (childAt != null && (U = RecyclerView.U(childAt)) != null) {
            if (U.l() && !U.r()) {
                throw new IllegalArgumentException("called detach on an already detached child " + U + recyclerView.C());
            }
            U.a(256);
        }
        recyclerView.detachViewFromParent(C);
    }

    public String toString() {
        switch (this.a) {
            case 12:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.b);
                sb2.append('{');
                i61 i61Var = (i61) ((i61) this.c).d;
                String str = "";
                while (i61Var != null) {
                    Object obj = i61Var.c;
                    sb2.append(str);
                    String str2 = (String) i61Var.b;
                    if (str2 != null) {
                        sb2.append(str2);
                        sb2.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb2.append(obj);
                    } else {
                        sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r4.length() - 1);
                    }
                    i61Var = (i61) i61Var.d;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            case 21:
                StringBuilder sb3 = new StringBuilder("id3v2tag[pos=");
                uf.a aVar = (uf.a) this.b;
                sb3.append(aVar.b);
                sb3.append(", ");
                sb3.append(aVar.e());
                sb3.append(" left]");
                return sb3.toString();
            case 24:
                return ((a8.va) this.c).toString() + ", hidden list:" + ((ArrayList) this.d).size();
            default:
                return super.toString();
        }
    }

    public void u(Canvas canvas, RectF rectF, int i7, float f10) {
        Paint[] paintArr = (Paint[]) this.b;
        Matrix matrix = (Matrix) this.d;
        if (f10 <= 0.0f) {
            return;
        }
        if (((LinearGradient) this.c) == null) {
            this.c = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{-65536, 16711680}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        }
        if (paintArr[i7] == null) {
            paintArr[i7] = new Paint(1);
            paintArr[i7].setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
        paintArr[i7].setShader((LinearGradient) this.c);
        matrix.reset();
        if (i7 == 0) {
            matrix.postScale(1.0f, rectF.width() / 16.0f);
            matrix.postRotate(-90.0f);
            matrix.postTranslate(rectF.left, rectF.top);
        } else if (i7 == 1) {
            matrix.postScale(1.0f, rectF.height() / 16.0f);
            matrix.postTranslate(rectF.left, rectF.top);
        } else if (i7 == 2) {
            matrix.postScale(1.0f, rectF.width() / 16.0f);
            matrix.postRotate(90.0f);
            matrix.postTranslate(rectF.right, rectF.top);
        } else if (i7 == 3) {
            matrix.postScale(1.0f, rectF.height() / 16.0f);
            matrix.postScale(1.0f, -1.0f);
            matrix.postTranslate(rectF.left, rectF.bottom);
        }
        ((LinearGradient) this.c).setLocalMatrix(matrix);
        paintArr[i7].setAlpha((int) (255.0f * f10));
        canvas.drawRect(rectF, paintArr[i7]);
    }

    public void v(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
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

    public tf.e w(tf.f fVar) {
        InputStream inputStream;
        int i7 = fVar.c;
        InputStream inputStream2 = (uf.a) this.b;
        if (fVar.d) {
            nd0 nd0Var = (nd0) this.d;
            nd0Var.getClass();
            byte[] bArr = new byte[i7];
            int i10 = 0;
            while (i10 < i7) {
                int read = ((ab.d) nd0Var.b).read(bArr, i10, i7 - i10);
                if (read <= 0) {
                    throw new EOFException();
                }
                i10 += read;
            }
            int i11 = 0;
            boolean z10 = false;
            for (int i12 = 0; i12 < i7; i12++) {
                byte b10 = bArr[i12];
                if (!z10 || b10 != 0) {
                    bArr[i11] = b10;
                    i11++;
                }
                z10 = b10 == -1;
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

    public q2.m x(e2.l0 l0Var) {
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
                    this.d = s(d0Var);
                }
                eVar = (q2.e) this.d;
                eVar.getClass();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }

    public View y(int i7) {
        return ((RecyclerView) ((v4.b) this.b).b).getChildAt(C(i7));
    }

    public int z() {
        return ((RecyclerView) ((v4.b) this.b).b).getChildCount() - ((ArrayList) this.d).size();
    }

    public /* synthetic */ i61(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public i61(String str) {
        this.a = 12;
        i61 i61Var = new i61(11, false);
        this.c = i61Var;
        this.d = i61Var;
        this.b = str;
    }

    public i61(int i7) {
        this.a = i7;
        switch (i7) {
            case 9:
                this.b = new Object();
                break;
            case 20:
                this.b = new b7.d();
                this.c = null;
                this.d = null;
                break;
            case 28:
                this.b = new HashMap();
                this.c = new HashMap();
                this.d = y7.i.c;
                break;
            default:
                this.b = new Paint[4];
                this.d = new Matrix();
                break;
        }
    }

    public i61(InputStream inputStream, long j3, int i7, tf.h hVar) {
        this.a = 21;
        uf.a aVar = new uf.a(inputStream, j3, i7);
        this.b = aVar;
        this.d = new nd0(aVar, 16);
        this.c = hVar;
    }

    public i61(String str, Boolean bool, uc.a aVar, String str2) {
        this.a = 23;
        this.b = str;
        this.c = str2;
        this.d = aVar;
    }

    public i61(v4.b bVar) {
        this.a = 24;
        this.b = bVar;
        this.c = new a8.va(8);
        this.d = new ArrayList();
    }

    @Override // org.telegram.ui.ky0
    public /* synthetic */ void d() {
    }

    @Override // t0.h
    public void e() {
    }

    @Override // org.telegram.ui.ky0
    public /* synthetic */ void i() {
    }

    @Override // t0.h
    public void k() {
    }

    public i61(File file) {
        this.a = 8;
        this.b = file;
        this.c = new File(file.getPath() + ".new");
        this.d = new File(file.getPath() + ".bak");
    }

    public i61(f3.r rVar) {
        this.a = 26;
        this.b = rVar;
    }

    public i61(Runnable runnable) {
        this.a = 14;
        this.c = new CopyOnWriteArrayList();
        this.d = new HashMap();
        this.b = runnable;
    }

    public i61(byte[] bArr, m9.y yVar) {
        this.a = 6;
        this.b = bArr;
        this.c = null;
        this.d = yVar;
    }

    public i61(e2.o0 o0Var, m9.y yVar) {
        this.a = 6;
        this.b = o0Var.k;
        this.c = o0Var.n;
        this.d = yVar;
    }

    public i61(j61 j61Var, m.o3 o3Var, hi.r7 r7Var) {
        this.a = 0;
        this.d = j61Var;
        this.b = o3Var;
        this.c = r7Var;
    }

    public i61(org.telegram.ui.Cells.aa aaVar) {
        this.a = 15;
        this.a = 15;
        this.b = aaVar;
        this.c = Choreographer.getInstance();
        this.d = new hz0(this, 1);
    }

    public i61(String str, String str2) {
        this.a = 27;
        this.b = str;
        this.c = str2;
        this.d = str2.isEmpty() ? str : a8.p0.E(str, "/", str2);
    }

    public i61(s4.e eVar, android.support.v4.media.session.a0 a0Var) {
        this.a = 17;
        this.d = eVar;
        this.b = a0Var;
    }

    public i61(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.a = 16;
        this.c = arrayDeque;
        this.b = bufferedReader;
    }
}
