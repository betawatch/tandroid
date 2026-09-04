package n7;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
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
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Trace;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import di.tc;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.f3;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Components.cc0;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.eo0;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.kf0;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.xt;
import org.telegram.ui.Components.zt;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.i5;
import org.telegram.ui.l4;
import org.telegram.ui.rx0;
import org.telegram.ui.sw;
import org.telegram.ui.ty;
import org.telegram.ui.uy;
import org.telegram.ui.w41;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class z0 implements f6, eo0, xt, tc, cl0, gh.a, d71, p2.s, le.d, r2.k, y2.o, SuccessContinuation {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ z0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    public static z0 g(View view) {
        return new z0(view);
    }

    public void A(ra.b bVar) {
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
            if (createTempFile.renameTo(w())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    @Override // di.tc
    public void C(float f7, boolean z10) {
        cc0 cc0Var = (cc0) this.b;
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
        AndroidUtilities.cancelRunOnUIThread(cc0Var);
        AndroidUtilities.runOnUIThread(cc0Var, 120L);
    }

    public b2.q0 D(s4.c1 c1Var, int i10) {
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

    @Override // le.d
    public void E(int i10, float f7, float f10, le.e eVar) {
        qh.i iVar = (qh.i) this.c;
        iVar.c.a(f7);
        iVar.d.a(f7);
        iVar.b.a(f7);
        ((Runnable) this.b).run();
    }

    public ra.b F() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(w());
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

    @Override // org.telegram.ui.ActionBar.f6
    public Paint G(String str) {
        return j6.S0(str);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public int G0(int i10) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.b;
        int indexOfKey = sparseIntArray.indexOfKey(i10);
        return indexOfKey >= 0 ? sparseIntArray.valueAt(indexOfKey) : j6.w0(null, i10, false);
    }

    public void H(s4.c1 c1Var) {
        s4.i1 i1Var = (s4.i1) ((a0.f) this.b).get(c1Var);
        if (i1Var == null) {
            return;
        }
        i1Var.a &= -2;
    }

    public void K(s4.c1 c1Var) {
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

    @Override // p2.s
    public y2.o U() {
        return new z0(17, ((p2.s) this.b).U(), (List) this.c);
    }

    @Override // org.telegram.ui.Components.eo0
    public void X(float f7, boolean z10) {
        ((TextView) this.b).setText("Alpha " + i5.e);
        i5.e = f7;
        ((i5) this.c).b.M();
    }

    @Override // org.telegram.ui.ActionBar.f6
    public boolean a() {
        return j6.I.q();
    }

    @Override // org.telegram.ui.Components.cl0
    public boolean d(float f7, float f10, int i10, View view) {
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

    @Override // y2.o
    public Object f2(Uri uri, g2.k kVar) {
        t2.a aVar = (t2.a) ((y2.o) this.b).f2(uri, kVar);
        List list = (List) this.c;
        return (list == null || list.isEmpty()) ? aVar : (t2.a) aVar.a(list);
    }

    @Override // org.telegram.ui.Components.eo0
    public /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public /* synthetic */ Drawable getDrawable(String str) {
        return null;
    }

    @Override // org.telegram.ui.Components.cl0
    public void h() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((uy) this.c).finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.ActionBar.f6
    public int h0(int i10) {
        return G0(i10);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public int h1(int i10) {
        return ((SparseIntArray) this.b).get(i10);
    }

    @Override // p2.s
    public y2.o i0(p2.o oVar, p2.l lVar) {
        return new z0(17, ((p2.s) this.b).i0(oVar, lVar), (List) this.c);
    }

    @Override // org.telegram.ui.Components.xt
    public void j() {
        f3 f3Var = (f3) this.c;
        ((zt) this.b).getText();
        f3Var.b();
    }

    @Override // gh.a
    public dh.d k() {
        return new dh.f(this);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public void l(float f7, float f10, int i10, int i11) {
        j6.q(f7, f10, i10, i11);
    }

    @Override // org.telegram.ui.Components.eo0
    public /* synthetic */ int l0() {
        return 0;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public /* synthetic */ boolean o0() {
        return false;
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
        AndroidUtilities.runOnUIThread(new rx0(28, this, (File) this.b), 100L);
    }

    @Override // org.telegram.ui.Components.d71
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.d71
    public void onStateChanged(boolean z10, int i10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
        w41 w41Var = secretMediaViewer.i1;
        if (secretMediaViewer.y == null || secretMediaViewer.h0 == null) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(w41Var);
        AndroidUtilities.runOnUIThread(w41Var);
        if (i10 == 4 || i10 == 1) {
            try {
                secretMediaViewer.b.getWindow().clearFlags(128);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        } else {
            try {
                secretMediaViewer.b.getWindow().addFlags(128);
            } catch (Exception e10) {
                FileLog.e(e10);
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
        l4 l4Var = ((SecretMediaViewer) this.c).w;
        if (l4Var != null) {
            l4Var.a(i11 == 0 ? 1.0f : (i10 * f7) / i11, 0);
        }
    }

    @Override // org.telegram.ui.Components.cl0
    public void q(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((uy) this.c).movePreviewFragment(f7);
        }
    }

    @Override // r2.k
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public r2.c p(com.google.firebase.messaging.n nVar) {
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
                } catch (Exception e7) {
                    e = e7;
                    cVar = cVar2;
                    if (cVar != null) {
                        cVar.release();
                    } else if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                    throw e;
                }
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Exception e11) {
            e = e11;
            mediaCodec = null;
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        int i10 = 1;
        switch (this.a) {
            case 22:
                da.a aVar = (da.a) obj;
                w9.m mVar = ((w9.k) this.c).e;
                if (aVar != null) {
                    return Tasks.whenAll((Task<?>[]) new Task[]{w9.m.b(mVar), mVar.m.y((Executor) this.b, null)});
                }
                Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
                return Tasks.forResult(null);
            default:
                return ((w9.m) this.c).e.i(new u4.g(i10, this, (Boolean) obj));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.List] */
    public ArrayList u() {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        k2.g0 g0Var = (k2.g0) this.c;
        Context context = (Context) this.b;
        Class cls = (Class) g0Var.b;
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) cls), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", cls + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new q9.c((String) it.next(), 0));
        }
        return arrayList2;
    }

    @Override // gh.a
    public void v(Canvas canvas, float f7, float f10, float f11, float f12) {
        Paint paint = (Paint) this.b;
        PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.c;
        sg.c1 c1Var = premiumPreviewFragment.m0;
        if (premiumPreviewFragment.h0) {
            paint.setColor(premiumPreviewFragment.getThemedColor(j6.a7));
            canvas.drawRect(f7, f10, f11, f12, paint);
        } else {
            c1Var.d(0, (-premiumPreviewFragment.d0.getMeasuredWidth()) * 0.1f * premiumPreviewFragment.b0, 0, premiumPreviewFragment.d0.getMeasuredWidth(), 0.0f, premiumPreviewFragment.d0.getMeasuredHeight());
            canvas.drawRect(f7, f10, f11, f12, c1Var.f);
        }
    }

    public File w() {
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

    @Override // org.telegram.ui.ActionBar.f6
    public ColorFilter x() {
        return j6.v3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    @Override // le.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void z(float f7, int i10) {
        boolean z10;
        qh.i iVar = (qh.i) this.c;
        boolean z11 = true;
        if ((iVar.b() == 0.0f && iVar.s == 2) || iVar.s == 3) {
            iVar.s = 1;
            z10 = true;
        } else {
            z10 = false;
        }
        if (f7 == 1.0f) {
            int i11 = iVar.w;
            int i12 = iVar.v;
            if (i11 != i12) {
                iVar.w = i12;
                if (z11) {
                    ((Runnable) this.b).run();
                }
                iVar.a();
            }
        }
        z11 = z10;
        if (z11) {
        }
        iVar.a();
    }

    public /* synthetic */ z0(int i10, boolean z10) {
        this.a = i10;
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

    public /* synthetic */ z0(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    public z0(Context context) {
        this.a = 18;
        this.b = context;
        this.c = null;
    }

    public z0(int i10) {
        this.a = i10;
        switch (i10) {
            case 24:
                this.b = new AtomicInteger();
                this.c = new AtomicInteger();
                break;
            default:
                this.b = new a0.f(0);
                this.c = new a0.i();
                break;
        }
    }

    public z0(View view) {
        this.a = 5;
        r61 r61Var = new r61(this, view);
        this.b = r61Var;
        view.addOnLayoutChangeListener(r61Var);
    }

    public z0(qg.h0 h0Var) {
        this.a = 12;
        this.b = h0Var;
    }

    public z0(kf0 kf0Var) {
        this.a = 4;
        this.c = kf0Var;
        this.b = new cc0(this, 9);
    }

    public z0(k9.h hVar) {
        this.a = 15;
        this.c = hVar;
    }

    public z0(String str, String str2) {
        this.a = 19;
        this.b = str;
        this.c = str2;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("userId should not be empty");
        }
    }

    @Override // org.telegram.ui.Components.eo0
    public void B() {
    }

    @Override // di.tc
    public /* synthetic */ void V() {
    }

    @Override // gh.a
    public /* synthetic */ void e() {
    }

    @Override // di.tc
    public /* synthetic */ void n() {
    }

    public z0(w9.k kVar, Executor executor, String str) {
        this.a = 22;
        this.c = kVar;
        this.b = executor;
    }

    public z0(PremiumPreviewFragment premiumPreviewFragment) {
        this.a = 8;
        this.c = premiumPreviewFragment;
        this.b = new Paint();
    }

    @Override // di.tc
    public /* synthetic */ void I(long j3) {
    }

    @Override // di.tc
    public /* synthetic */ void J(boolean z10) {
    }

    @Override // di.tc
    public /* synthetic */ void O(float f7) {
    }

    @Override // di.tc
    public /* synthetic */ void R(float f7) {
    }

    @Override // di.tc
    public /* synthetic */ void T(float f7) {
    }

    @Override // di.tc
    public /* synthetic */ void Z(float f7) {
    }

    @Override // di.tc
    public /* synthetic */ void b(int i10) {
    }

    @Override // di.tc
    public /* synthetic */ void c(float f7) {
    }

    @Override // di.tc
    public /* synthetic */ void d0(long j3) {
    }

    @Override // di.tc
    public /* synthetic */ void i(float f7) {
    }

    @Override // di.tc
    public /* synthetic */ void o(float f7) {
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

    @Override // di.tc
    public /* synthetic */ void r(boolean z10) {
    }

    @Override // di.tc
    public /* synthetic */ void y(float f7) {
    }

    @Override // di.tc
    public /* synthetic */ void N(float f7, int i10) {
    }

    @Override // org.telegram.ui.ActionBar.f6
    public /* synthetic */ void O0(int i10, int i11) {
    }

    @Override // di.tc
    public /* synthetic */ void S(float f7, int i10) {
    }

    @Override // di.tc
    public /* synthetic */ void a0(int i10, long j3) {
    }

    @Override // di.tc
    public /* synthetic */ void m(long j3, boolean z10) {
    }

    @Override // di.tc
    public /* synthetic */ void t(float f7, int i10) {
    }
}
