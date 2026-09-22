package n7;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Trace;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import ci.sc;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildConfig;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.f3;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Components.bc0;
import org.telegram.ui.Components.bu;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.eo0;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.kf0;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.zt;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.i5;
import org.telegram.ui.iy0;
import org.telegram.ui.k4;
import org.telegram.ui.sw;
import org.telegram.ui.ty;
import org.telegram.ui.u41;
import org.telegram.ui.uy;
import v7.d8;
import v7.r1;
import w7.pa;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class a1 implements e6, eo0, zt, sc, cl0, fh.a, d71, p2.t, r2.k, y2.o, SuccessContinuation {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ a1(int i10) {
        this.a = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a1 e(Context context) {
        FileChannel fileChannel;
        FileLock fileLock;
        try {
            fileChannel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLock = fileChannel.lock();
            } catch (IOException | Error | OverlappingFileLockException e) {
                e = e;
                fileLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException e7) {
            e = e7;
            fileChannel = null;
            fileLock = null;
        }
        try {
            return new a1(13, fileChannel, fileLock);
        } catch (IOException e10) {
            e = e10;
            Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
            if (fileLock != null) {
                try {
                    fileLock.release();
                } catch (IOException unused) {
                }
            }
            if (fileChannel != null) {
                try {
                    fileChannel.close();
                } catch (IOException unused2) {
                }
            }
            return null;
        } catch (Error e11) {
            e = e11;
            Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
            if (fileLock != null) {
            }
            if (fileChannel != null) {
            }
            return null;
        } catch (OverlappingFileLockException e12) {
            e = e12;
            Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
            if (fileLock != null) {
            }
            if (fileChannel != null) {
            }
            return null;
        }
    }

    public static a1 j(View view) {
        return new a1(view);
    }

    public b2.q0 A(s4.c1 c1Var, int i10) {
        s4.i1 i1Var;
        b2.q0 q0Var;
        a0.f fVar = (a0.f) this.b;
        int c10 = fVar.c(c1Var);
        if (c10 >= 0 && (i1Var = (s4.i1) fVar.h(c10)) != null) {
            int i11 = i1Var.a;
            if ((i11 & i10) != 0) {
                int i12 = i11 & (~i10);
                i1Var.a = i12;
                if (i10 == 4) {
                    q0Var = i1Var.b;
                } else {
                    if (i10 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    q0Var = i1Var.c;
                }
                if ((i12 & 12) == 0) {
                    fVar.f(c10);
                    i1Var.a = 0;
                    i1Var.b = null;
                    i1Var.c = null;
                    s4.i1.d.i(i1Var);
                }
                return q0Var;
            }
        }
        return null;
    }

    @Override // p2.t
    public y2.o D() {
        return new a1(17, ((p2.t) this.b).D(), (List) this.c);
    }

    public ra.b E() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(t());
            while (true) {
                try {
                    int read = fileInputStream.read(bArr, 0, 16384);
                    if (read < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } finally {
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String optString = jSONObject.optString("Fid", null);
        int optInt = jSONObject.optInt("Status", 0);
        String optString2 = jSONObject.optString("AuthToken", null);
        String optString3 = jSONObject.optString("RefreshToken", null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String optString4 = jSONObject.optString("FisError", null);
        int i10 = m1.j.d(5)[optInt];
        if (i10 == 0) {
            throw new NullPointerException("Null registrationStatus");
        }
        String str = i10 == 0 ? " registrationStatus" : "";
        if (str.isEmpty()) {
            return new ra.b(optString, i10, optString2, optString3, optLong2, optLong, optString4);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    @Override // org.telegram.ui.ActionBar.e6
    public Paint G(String str) {
        return i6.S0(str);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public int G0(int i10) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.b;
        int indexOfKey = sparseIntArray.indexOfKey(i10);
        return indexOfKey >= 0 ? sparseIntArray.valueAt(indexOfKey) : i6.w0(null, i10, false);
    }

    @Override // ci.sc
    public void H(float f7, boolean z10) {
        bc0 bc0Var = (bc0) this.b;
        kf0 kf0Var = (kf0) this.c;
        g71 g71Var = kf0Var.d;
        if (g71Var == null) {
            return;
        }
        float max = 2.8f / Math.max(60L, r2);
        long p5 = (long) ((((f7 / (1.0f - max)) * max) + f7) * g71Var.p());
        kf0Var.e = p5;
        kf0Var.d.L(p5, !z10);
        if (z10) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(bc0Var);
        AndroidUtilities.runOnUIThread(bc0Var, 120L);
    }

    public void I() {
        try {
            ((FileLock) this.c).release();
            ((FileChannel) this.b).close();
        } catch (IOException e) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }

    public void J(s4.c1 c1Var) {
        s4.i1 i1Var = (s4.i1) ((a0.f) this.b).get(c1Var);
        if (i1Var == null) {
            return;
        }
        i1Var.a &= -2;
    }

    @Override // p2.t
    public y2.o K(p2.p pVar, p2.m mVar) {
        return new a1(17, ((p2.t) this.b).K(pVar, mVar), (List) this.c);
    }

    public void L(s4.c1 c1Var) {
        a0.f fVar = (a0.f) this.b;
        a0.i iVar = (a0.i) this.c;
        int m10 = iVar.m() - 1;
        while (true) {
            if (m10 < 0) {
                break;
            }
            if (c1Var == iVar.n(m10)) {
                Object[] objArr = iVar.c;
                Object obj = objArr[m10];
                Object obj2 = a0.j.a;
                if (obj != obj2) {
                    objArr[m10] = obj2;
                    iVar.a = true;
                }
            } else {
                m10--;
            }
        }
        s4.i1 i1Var = (s4.i1) fVar.get(c1Var);
        if (i1Var != null) {
            fVar.remove(c1Var);
            i1Var.a = 0;
            i1Var.b = null;
            i1Var.c = null;
            s4.i1.d.i(i1Var);
        }
    }

    @Override // org.telegram.ui.Components.eo0
    public void X(float f7, boolean z10) {
        ((TextView) this.b).setText("Alpha " + i5.e);
        i5.e = f7;
        ((i5) this.c).b.M();
    }

    @Override // org.telegram.ui.ActionBar.e6
    public boolean a() {
        return i6.I.q();
    }

    @Override // org.telegram.ui.Components.cl0
    public boolean c(float f7, float f10, int i10, View view) {
        uy uyVar = (uy) this.c;
        if (view instanceof r2) {
            r2 r2Var = (r2) view;
            if (r2Var.n2) {
                uyVar.N4(r2Var.getDialogId(), view);
                return true;
            }
        }
        sw swVar = uyVar.z0;
        if (swVar != null && swVar.getVisibility() == 0 && uyVar.z0.n) {
            return false;
        }
        return uyVar.o4(view, i10, f7, ((ty) this.b).d);
    }

    public void f(s4.c1 c1Var, b2.q0 q0Var) {
        a0.f fVar = (a0.f) this.b;
        s4.i1 i1Var = (s4.i1) fVar.get(c1Var);
        if (i1Var == null) {
            i1Var = s4.i1.a();
            fVar.put(c1Var, i1Var);
        }
        i1Var.c = q0Var;
        i1Var.a |= 8;
    }

    @Override // org.telegram.ui.Components.cl0
    public void g() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((uy) this.c).finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.ActionBar.e6
    public int g0(int i10) {
        return G0(i10);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public int g1(int i10) {
        return ((SparseIntArray) this.b).get(i10);
    }

    @Override // org.telegram.ui.Components.eo0
    public /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.e6
    public /* synthetic */ Drawable getDrawable(String str) {
        return null;
    }

    @Override // org.telegram.ui.Components.zt
    public void i() {
        f3 f3Var = (f3) this.c;
        ((bu) this.b).getText();
        f3Var.b();
    }

    public void k() {
        String str = (String) this.b;
        try {
            ba.c cVar = (ba.c) this.c;
            cVar.getClass();
            new File(cVar.b, str).createNewFile();
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e);
        }
    }

    @Override // fh.a
    public ch.d l() {
        return new ch.f(this);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public void m(float f7, float f10, int i10, int i11) {
        i6.q(f7, f10, i10, i11);
    }

    @Override // org.telegram.ui.Components.eo0
    public /* synthetic */ int m0() {
        return 0;
    }

    @Override // y2.o
    public Object n2(Uri uri, g2.k kVar) {
        t2.a aVar = (t2.a) ((y2.o) this.b).n2(uri, kVar);
        List list = (List) this.c;
        return (list == null || list.isEmpty()) ? aVar : (t2.a) aVar.a(list);
    }

    @Override // org.telegram.ui.Components.d71
    public void onError(g71 g71Var, Exception exc) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
        int i10 = secretMediaViewer.b0;
        if (i10 <= 0) {
            FileLog.e(exc);
            return;
        }
        secretMediaViewer.b0 = i10 - 1;
        AndroidUtilities.runOnUIThread(new iy0(22, this, (File) this.b), 100L);
    }

    @Override // org.telegram.ui.Components.d71
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.d71
    public void onStateChanged(boolean z10, int i10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
        u41 u41Var = secretMediaViewer.i1;
        if (secretMediaViewer.y == null || secretMediaViewer.h0 == null) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(u41Var);
        AndroidUtilities.runOnUIThread(u41Var);
        if (i10 == 4 || i10 == 1) {
            try {
                secretMediaViewer.b.getWindow().clearFlags(128);
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else {
            try {
                secretMediaViewer.b.getWindow().addFlags(128);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        if (i10 == 3 && secretMediaViewer.w.getVisibility() != 0) {
            secretMediaViewer.w.setVisibility(0);
        }
        if (secretMediaViewer.y.y() && i10 != 4) {
            if (secretMediaViewer.E) {
                return;
            }
            secretMediaViewer.E = true;
        } else if (secretMediaViewer.E) {
            secretMediaViewer.E = false;
            if (i10 == 4) {
                secretMediaViewer.H = true;
                if (secretMediaViewer.I) {
                    secretMediaViewer.e(true, !secretMediaViewer.q1);
                } else {
                    secretMediaViewer.y.L(0L, false);
                    secretMediaViewer.y.C();
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.d71
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.d71
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        k4 k4Var = ((SecretMediaViewer) this.c).w;
        if (k4Var != null) {
            k4Var.a(i11 == 0 ? 1.0f : (i10 * f7) / i11, 0);
        }
    }

    @Override // r2.k
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public r2.c v(com.google.firebase.messaging.n nVar) {
        MediaCodec mediaCodec;
        String str = ((r2.o) nVar.a).a;
        r2.c cVar = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                r2.c cVar2 = new r2.c(mediaCodec, (HandlerThread) ((r2.b) this.b).get(), new r2.e(mediaCodec, (HandlerThread) ((r2.b) this.c).get()), (r2.j) nVar.f);
                try {
                    Trace.endSection();
                    Surface surface = (Surface) nVar.d;
                    r2.c.l(cVar2, (MediaFormat) nVar.b, surface, (MediaCrypto) nVar.e, (surface == null && ((r2.o) nVar.a).h && Build.VERSION.SDK_INT >= 35) ? 8 : 0);
                    return cVar2;
                } catch (Exception e) {
                    e = e;
                    cVar = cVar2;
                    if (cVar != null) {
                        cVar.release();
                    } else if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                    throw e;
                }
            } catch (Exception e7) {
                e = e7;
            }
        } catch (Exception e10) {
            e = e10;
            mediaCodec = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.e6
    public /* synthetic */ boolean p0() {
        return false;
    }

    @Override // org.telegram.ui.Components.cl0
    public void q(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((uy) this.c).movePreviewFragment(f7);
        }
    }

    public void r(String str, PrintWriter printWriter) {
        w1.b bVar = (w1.b) this.c;
        if (bVar.d.c <= 0) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Loaders:");
        String str2 = str + "    ";
        int i10 = 0;
        while (true) {
            a0.n nVar = bVar.d;
            if (i10 >= nVar.c) {
                return;
            }
            w1.a aVar = (w1.a) nVar.b[i10];
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(bVar.d.a[i10]);
            printWriter.print(": ");
            printWriter.println(aVar.toString());
            printWriter.print(str2);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mArgs=");
            printWriter.println((Object) null);
            printWriter.print(str2);
            printWriter.print("mLoader=");
            printWriter.println(aVar.l);
            a6.d dVar = aVar.l;
            String str3 = str2 + "  ";
            dVar.getClass();
            printWriter.print(str3);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mListener=");
            printWriter.println(dVar.a);
            if (dVar.b || dVar.e) {
                printWriter.print(str3);
                printWriter.print("mStarted=");
                printWriter.print(dVar.b);
                printWriter.print(" mContentChanged=");
                printWriter.print(dVar.e);
                printWriter.print(" mProcessingChange=");
                printWriter.println(false);
            }
            if (dVar.c || dVar.d) {
                printWriter.print(str3);
                printWriter.print("mAbandoned=");
                printWriter.print(dVar.c);
                printWriter.print(" mReset=");
                printWriter.println(dVar.d);
            }
            if (dVar.g != null) {
                printWriter.print(str3);
                printWriter.print("mTask=");
                printWriter.print(dVar.g);
                printWriter.print(" waiting=");
                dVar.g.getClass();
                printWriter.println(false);
            }
            if (dVar.h != null) {
                printWriter.print(str3);
                printWriter.print("mCancellingTask=");
                printWriter.print(dVar.h);
                printWriter.print(" waiting=");
                dVar.h.getClass();
                printWriter.println(false);
            }
            if (aVar.n != null) {
                printWriter.print(str2);
                printWriter.print("mCallbacks=");
                printWriter.println(aVar.n);
                b2.p pVar = aVar.n;
                pVar.getClass();
                printWriter.print(str2 + "  ");
                printWriter.print("mDeliveredData=");
                printWriter.println(pVar.b);
            }
            printWriter.print(str2);
            printWriter.print("mData=");
            a6.d dVar2 = aVar.l;
            Object obj = aVar.e;
            Object obj2 = obj != androidx.lifecycle.z.k ? obj : null;
            dVar2.getClass();
            StringBuilder sb2 = new StringBuilder(64);
            if (obj2 == null) {
                sb2.append(BuildConfig.BETA_URL);
            } else {
                Class<?> cls = obj2.getClass();
                sb2.append(cls.getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(cls)));
                sb2.append("}");
            }
            printWriter.println(sb2.toString());
            printWriter.print(str2);
            printWriter.print("mStarted=");
            printWriter.println(aVar.c > 0);
            i10++;
        }
    }

    public File t() {
        if (((File) this.b) == null) {
            synchronized (this) {
                try {
                    if (((File) this.b) == null) {
                        k9.h hVar = (k9.h) this.c;
                        hVar.a();
                        this.b = new File(hVar.a.getFilesDir(), "PersistedInstallation." + ((k9.h) this.c).d() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.b;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        da.a aVar = (da.a) obj;
        u4.g gVar = (u4.g) this.c;
        if (aVar == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return Tasks.forResult(null);
        }
        o0.a aVar2 = (o0.a) gVar.c;
        o0.a aVar3 = (o0.a) gVar.c;
        w9.m.b((w9.m) aVar2.c);
        ((w9.m) aVar3.c).m.y((Executor) this.b, null);
        ((w9.m) aVar3.c).q.trySetResult(null);
        return Tasks.forResult(null);
    }

    public String toString() {
        switch (this.a) {
            case 21:
                StringBuilder sb2 = new StringBuilder(128);
                sb2.append("LoaderManager{");
                sb2.append(Integer.toHexString(System.identityHashCode(this)));
                sb2.append(" in ");
                Class<?> cls = ((androidx.lifecycle.t) this.b).getClass();
                sb2.append(cls.getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(cls)));
                sb2.append("}}");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    @Override // org.telegram.ui.ActionBar.e6
    public ColorFilter x() {
        return i6.v3;
    }

    @Override // fh.a
    public void y(Canvas canvas, float f7, float f10, float f11, float f12) {
        Paint paint = (Paint) this.b;
        PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.c;
        rg.z0 z0Var = premiumPreviewFragment.m0;
        if (premiumPreviewFragment.h0) {
            paint.setColor(premiumPreviewFragment.getThemedColor(i6.a7));
            canvas.drawRect(f7, f10, f11, f12, paint);
        } else {
            z0Var.d(0, (-premiumPreviewFragment.d0.getMeasuredWidth()) * 0.1f * premiumPreviewFragment.b0, 0, premiumPreviewFragment.d0.getMeasuredWidth(), 0.0f, premiumPreviewFragment.d0.getMeasuredHeight());
            canvas.drawRect(f7, f10, f11, f12, z0Var.f);
        }
    }

    public void z(ra.b bVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", bVar.a);
            jSONObject.put("Status", m1.j.c(bVar.b));
            jSONObject.put("AuthToken", bVar.c);
            jSONObject.put("RefreshToken", bVar.d);
            jSONObject.put("TokenCreationEpochInSecs", bVar.f);
            jSONObject.put("ExpiresInSecs", bVar.e);
            jSONObject.put("FisError", bVar.g);
            k9.h hVar = (k9.h) this.c;
            hVar.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", hVar.a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (createTempFile.renameTo(t())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public /* synthetic */ a1(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.Components.d71
    public void onRenderedFirstFrame() {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
        if (secretMediaViewer.c0) {
            return;
        }
        secretMediaViewer.c0 = true;
        secretMediaViewer.e.invalidate();
    }

    public /* synthetic */ a1(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    public a1(r1 r1Var) {
        this.a = 22;
        this.c = new d8();
        this.b = r1Var;
        pa.b();
    }

    public a1(Context context) {
        this.a = 18;
        this.b = context;
        this.c = null;
    }

    public a1() {
        this.a = 16;
        this.b = new a0.f(0);
        this.c = new a0.i();
    }

    public a1(View view) {
        this.a = 5;
        r61 r61Var = new r61(this, view);
        this.b = r61Var;
        view.addOnLayoutChangeListener(r61Var);
    }

    public a1(androidx.lifecycle.t tVar, androidx.lifecycle.t0 t0Var) {
        this.a = 21;
        this.b = tVar;
        this.c = (w1.b) new aa.a(t0Var, w1.b.f).m(w1.b.class);
    }

    public a1(kf0 kf0Var) {
        this.a = 4;
        this.c = kf0Var;
        this.b = new bc0(this, 9);
    }

    public a1(k9.h hVar) {
        this.a = 15;
        this.c = hVar;
    }

    @Override // org.telegram.ui.Components.eo0
    public void B() {
    }

    @Override // fh.a
    public /* synthetic */ void d() {
    }

    @Override // ci.sc
    public /* synthetic */ void f0() {
    }

    @Override // ci.sc
    public /* synthetic */ void s() {
    }

    public a1(String str, String str2) {
        this.a = 19;
        this.b = str;
        this.c = str2;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("userId should not be empty");
        }
    }

    @Override // ci.sc
    public /* synthetic */ void F(float f7) {
    }

    @Override // ci.sc
    public /* synthetic */ void O(long j3) {
    }

    @Override // ci.sc
    public /* synthetic */ void Q(boolean z10) {
    }

    @Override // ci.sc
    public /* synthetic */ void V(float f7) {
    }

    @Override // ci.sc
    public /* synthetic */ void Z(float f7) {
    }

    @Override // ci.sc
    public /* synthetic */ void b(int i10) {
    }

    @Override // ci.sc
    public /* synthetic */ void e0(float f7) {
    }

    @Override // ci.sc
    public /* synthetic */ void h(float f7) {
    }

    @Override // ci.sc
    public /* synthetic */ void i0(float f7) {
    }

    @Override // ci.sc
    public /* synthetic */ void n(float f7) {
    }

    @Override // ci.sc
    public /* synthetic */ void o0(long j3) {
    }

    @Override // org.telegram.ui.Components.d71
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.d71
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.d71
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // ci.sc
    public /* synthetic */ void u(float f7) {
    }

    @Override // ci.sc
    public /* synthetic */ void w(boolean z10) {
    }

    public a1(EditText editText) {
        this.a = 12;
        this.b = editText;
        q1.i iVar = new q1.i(editText);
        this.c = iVar;
        editText.addTextChangedListener(iVar);
        if (q1.a.b == null) {
            synchronized (q1.a.a) {
                try {
                    if (q1.a.b == null) {
                        q1.a aVar = new q1.a();
                        try {
                            q1.a.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, q1.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        q1.a.b = aVar;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(q1.a.b);
    }

    @Override // ci.sc
    public /* synthetic */ void C(float f7, int i10) {
    }

    @Override // org.telegram.ui.ActionBar.e6
    public /* synthetic */ void L0(int i10, int i11) {
    }

    @Override // ci.sc
    public /* synthetic */ void T(float f7, int i10) {
    }

    @Override // ci.sc
    public /* synthetic */ void d0(float f7, int i10) {
    }

    @Override // ci.sc
    public /* synthetic */ void j0(int i10, long j3) {
    }

    @Override // ci.sc
    public /* synthetic */ void o(long j3, boolean z10) {
    }

    public a1(PremiumPreviewFragment premiumPreviewFragment) {
        this.a = 8;
        this.c = premiumPreviewFragment;
        this.b = new Paint();
    }
}
