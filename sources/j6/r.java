package j6;

import a8.h7;
import ai.u0;
import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.b0;
import androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer;
import bi.e4;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.internal.cast.f4;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.Objects;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import li.i0;
import m1.e1;
import m1.f1;
import m1.l0;
import m1.w0;
import n2.t0;
import oi.b2;
import oi.h0;
import oi.m3;
import oi.s4;
import oi.t3;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.au;
import org.telegram.messenger.bu;
import org.telegram.messenger.d20;
import org.telegram.messenger.ev;
import org.telegram.messenger.fj;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.o0;
import org.telegram.messenger.q10;
import org.telegram.messenger.ra;
import org.telegram.messenger.w10;
import org.telegram.messenger.ya;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.j0;
import org.telegram.ui.Cells.m1;
import org.telegram.ui.Cells.s7;
import org.telegram.ui.Cells.t7;
import org.telegram.ui.Cells.z8;
import org.telegram.ui.Components.e8;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.fh;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.hd;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.Components.r40;
import org.telegram.ui.Components.ri;
import org.telegram.ui.Components.wm0;
import org.telegram.ui.Components.z4;
import org.telegram.ui.Components.z40;
import org.telegram.ui.Components.zm0;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.a61;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements com.google.android.gms.common.api.internal.q, OnCompleteListener, ri, i0, l.i, n2.v, o0.a, b3.k, wm0, z4, h0, ra, ya, ue.a, zm0, f61 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ r(int i7) {
        this.a = i7;
    }

    public static float[] y(ArrayList arrayList) {
        float f10;
        int i7;
        int i10;
        float f11;
        double d;
        double d2;
        double[] dArr;
        ArrayList arrayList2;
        float f12;
        int i11;
        int size = arrayList.size();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            f10 = 255.0f;
            if (i13 >= size) {
                break;
            }
            PointF pointF = (PointF) arrayList.get(i13);
            pointF.x *= 255.0f;
            pointF.y *= 255.0f;
            i13++;
        }
        int size2 = arrayList.size();
        int i14 = 1;
        double d10 = 1.0d;
        if (size2 <= 0 || size2 == 1) {
            i7 = 0;
            i10 = 1;
            f11 = 255.0f;
            d = 1.0d;
            d2 = 6.0d;
            dArr = null;
        } else {
            char c10 = 2;
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size2, 3);
            double[] dArr3 = new double[size2];
            double[] dArr4 = dArr2[0];
            dArr4[1] = 1.0d;
            double d11 = 0.0d;
            dArr4[0] = 0.0d;
            dArr4[2] = 0.0d;
            int i15 = 1;
            while (true) {
                i11 = size2 - 1;
                if (i15 >= i11) {
                    break;
                }
                PointF pointF2 = (PointF) arrayList.get(i15 - 1);
                PointF pointF3 = (PointF) arrayList.get(i15);
                int i16 = i15 + 1;
                double d12 = d10;
                PointF pointF4 = (PointF) arrayList.get(i16);
                double[] dArr5 = dArr2[i15];
                char c11 = c10;
                float f13 = pointF3.x;
                double d13 = d11;
                int i17 = i12;
                int i18 = i14;
                double d14 = f13 - pointF2.x;
                dArr5[i17] = d14 / 6.0d;
                float f14 = pointF4.x;
                float f15 = f10;
                dArr5[i18] = (f14 - r14) / 3.0d;
                double d15 = f14 - f13;
                dArr5[c11] = d15 / 6.0d;
                float f16 = pointF4.y;
                float f17 = pointF3.y;
                dArr3[i15] = ((f16 - f17) / d15) - ((f17 - pointF2.y) / d14);
                i15 = i16;
                c10 = c11;
                d10 = d12;
                d11 = d13;
                i12 = i17;
                i14 = i18;
                f10 = f15;
            }
            i7 = i12;
            i10 = i14;
            f11 = f10;
            d = d10;
            char c12 = c10;
            double d16 = d11;
            d2 = 6.0d;
            dArr3[i7] = d16;
            dArr3[i11] = d16;
            double[] dArr6 = dArr2[i11];
            dArr6[i10] = d;
            dArr6[i7] = d16;
            dArr6[c12] = d16;
            for (int i19 = i10; i19 < size2; i19++) {
                double[] dArr7 = dArr2[i19];
                double d17 = dArr7[i7];
                int i20 = i19 - 1;
                double[] dArr8 = dArr2[i20];
                double d18 = d17 / dArr8[i10];
                dArr7[i10] = dArr7[i10] - (dArr8[c12] * d18);
                dArr7[i7] = d16;
                dArr3[i19] = dArr3[i19] - (d18 * dArr3[i20]);
            }
            for (int i21 = size2 - 2; i21 >= 0; i21--) {
                double[] dArr9 = dArr2[i21];
                double d19 = dArr9[c12];
                int i22 = i21 + 1;
                double[] dArr10 = dArr2[i22];
                double d20 = d19 / dArr10[i10];
                dArr9[i10] = dArr9[i10] - (dArr10[i7] * d20);
                dArr9[c12] = d16;
                dArr3[i21] = dArr3[i21] - (d20 * dArr3[i22]);
            }
            dArr = new double[size2];
            for (int i23 = i7; i23 < size2; i23++) {
                dArr[i23] = dArr3[i23] / dArr2[i23][i10];
            }
        }
        int length = dArr.length;
        if (length < i10) {
            arrayList2 = null;
            f12 = 0.0f;
        } else {
            arrayList2 = new ArrayList(length + 1);
            int i24 = i7;
            while (i24 < length - 1) {
                PointF pointF5 = (PointF) arrayList.get(i24);
                int i25 = i24 + 1;
                PointF pointF6 = (PointF) arrayList.get(i25);
                int i26 = (int) pointF5.x;
                while (true) {
                    float f18 = pointF6.x;
                    if (i26 < ((int) f18)) {
                        float f19 = i26;
                        PointF pointF7 = pointF5;
                        double d21 = f18 - pointF5.x;
                        double d22 = (f19 - r12) / d21;
                        double d23 = d - d22;
                        int i27 = length;
                        double[] dArr11 = dArr;
                        float f20 = (float) (((((((d22 * d22) * d22) - d22) * dArr11[i25]) + ((((d23 * d23) * d23) - d23) * dArr11[i24])) * ((d21 * d21) / d2)) + (pointF6.y * d22) + (pointF7.y * d23));
                        if (f20 > f11) {
                            f20 = f11;
                        } else if (f20 < 0.0f) {
                            f20 = 0.0f;
                        }
                        arrayList2.add(new PointF(f19, f20));
                        i26++;
                        dArr = dArr11;
                        pointF5 = pointF7;
                        length = i27;
                    }
                }
                i24 = i25;
            }
            f12 = 0.0f;
            arrayList2.add((PointF) i5.c.h(1, arrayList));
        }
        int i28 = i7;
        float f21 = ((PointF) arrayList2.get(i28)).x;
        if (f21 > f12) {
            for (int i29 = (int) f21; i29 >= 0; i29--) {
                arrayList2.add(i28, new PointF(i29, f12));
            }
        }
        float f22 = ((PointF) i5.c.h(1, arrayList2)).x;
        if (f22 < f11) {
            for (int i30 = ((int) f22) + 1; i30 <= 255; i30++) {
                arrayList2.add(new PointF(i30, f11));
            }
        }
        float[] fArr = new float[arrayList2.size()];
        int size3 = arrayList2.size();
        while (i28 < size3) {
            PointF pointF8 = (PointF) arrayList2.get(i28);
            float sqrt = (float) Math.sqrt(Math.pow(pointF8.x - pointF8.y, 2.0d));
            if (pointF8.x > pointF8.y) {
                sqrt = -sqrt;
            }
            fArr[i28] = sqrt;
            i28++;
        }
        return fArr;
    }

    @Override // o0.a
    public Cursor C(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e10) {
            Log.w("FontsProvider", "Unable to query the content provider", e10);
            return null;
        }
    }

    @Override // ue.a
    public void D0() {
        bu buVar = (bu) this.b;
        bu.j0(buVar, buVar.b0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (r7.a > r3.a) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void E(e1 newState) {
        Object obj;
        Object obj2;
        kotlin.jvm.internal.j.e(newState, "newState");
        ce.w wVar = (ce.w) this.b;
        do {
            wVar.getClass();
            Object obj3 = ce.w.e.get(wVar);
            obj = de.g.a;
            obj2 = obj3;
            if (obj3 == obj) {
                obj2 = null;
            }
            e1 e1Var = (e1) obj2;
            if (!(e1Var instanceof w0 ? true : kotlin.jvm.internal.j.a(e1Var, f1.b))) {
                if (!(e1Var instanceof m1.c)) {
                    if (!(e1Var instanceof l0)) {
                        throw new androidx.car.app.j();
                    }
                }
                if (obj2 == null) {
                    obj2 = obj;
                }
                if (e1Var != null) {
                    obj = e1Var;
                }
            }
            e1Var = newState;
            if (obj2 == null) {
            }
            if (e1Var != null) {
            }
        } while (!wVar.c(obj2, obj));
    }

    @Override // org.telegram.ui.Components.z4
    public void I(int i7, int i10, boolean z10) {
        switch (this.a) {
            case 14:
                ((b2) this.b).x0(i7, i10, z10);
                break;
            default:
                ((hd) this.b).a(Boolean.valueOf(z10), Integer.valueOf(i7), Integer.valueOf(i10));
                break;
        }
    }

    @Override // oi.h0
    public i9 K() {
        m3 m3Var = ((s4) this.b).O;
        if (m3Var != null) {
            return m3Var.a.getTextSelectionHelper();
        }
        return null;
    }

    @Override // oi.h0
    public void M(CharSequence charSequence) {
        m3 m3Var = ((s4) this.b).O;
        if (m3Var != null) {
            m3Var.getClass();
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            m3Var.a.w4(charSequence.toString());
        }
    }

    @Override // n2.v
    public void N() {
        a3.s sVar;
        FfmpegAudioRenderer ffmpegAudioRenderer = (FfmpegAudioRenderer) this.b;
        synchronized (ffmpegAudioRenderer.a) {
            sVar = ffmpegAudioRenderer.I;
        }
        if (sVar != null) {
            sVar.m();
        }
    }

    @Override // oi.h0
    public h9 P() {
        return (s4) this.b;
    }

    @Override // ue.a
    public void P0() {
        bu buVar = (bu) this.b;
        bu.j0(buVar, null);
        buVar.b0 = null;
    }

    @Override // n2.v
    public void Q(Exception exc) {
        h2.a.d("DecoderAudioRenderer", "Audio sink error", exc);
        jb.m mVar = ((FfmpegAudioRenderer) this.b).J;
        Handler handler = (Handler) mVar.b;
        if (handler != null) {
            handler.post(new n2.p(mVar, exc, 1));
        }
    }

    @Override // org.telegram.ui.Components.ri
    public void S(fh fhVar) {
        int i7;
        i7 = ((g2) ((kg.n) this.b)).currentAccount;
        ks.f(i7).d(fhVar);
    }

    @Override // org.telegram.ui.Components.ri
    public /* synthetic */ boolean T() {
        return false;
    }

    @Override // ue.a
    public void U(float f10, float f11) {
        ev evVar;
        m1 m1Var;
        bu buVar = (bu) this.b;
        au auVar = buVar.b0;
        if (auVar == null || (m1Var = (evVar = buVar.a).F) == null) {
            return;
        }
        m1Var.m1(evVar.E, auVar.c);
    }

    @Override // oi.h0
    public oi.a V() {
        return ((s4) this.b).a;
    }

    @Override // org.telegram.ui.Components.ri
    public /* synthetic */ boolean V1() {
        return false;
    }

    @Override // oi.h0
    public boolean W() {
        s4 s4Var = (s4) this.b;
        m3 m3Var = s4Var.O;
        if (m3Var == null) {
            return false;
        }
        oi.a aVar = s4Var.a;
        return m3Var.a.V4();
    }

    @Override // oi.h0
    public void Y(int i7, int i10) {
        s4 s4Var = (s4) this.b;
        m3 m3Var = s4Var.O;
        if (m3Var != null) {
            oi.a aVar = s4Var.a;
            oi.g2 g2Var = m3Var.a.R3;
            if (g2Var != null) {
                g2Var.f(i7, i10);
            }
        }
    }

    @Override // n2.v
    public void a(int i7) {
        jb.m mVar = ((FfmpegAudioRenderer) this.b).J;
        Handler handler = (Handler) mVar.b;
        if (handler != null) {
            handler.post(new u0(mVar, i7, 20));
        }
    }

    @Override // org.telegram.ui.Components.zm0
    public int a0() {
        switch (this.a) {
            case 23:
                return 0;
            case 24:
                s7 s7Var = ((t7) this.b).r;
                if (s7Var == null) {
                    return 0;
                }
                if (s7Var.c == null) {
                    return s7Var.a() - s7Var.b();
                }
                return s7Var.d * (r1.length - 1);
            default:
                return 0;
        }
    }

    @Override // com.google.android.gms.common.api.internal.q
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                s sVar = new s(0, (TaskCompletionSource) obj2);
                i iVar = (i) ((u) obj).n();
                String[] strArr = (String[]) this.b;
                Parcel p12 = iVar.p1();
                com.google.android.gms.internal.cast.t.d(p12, sVar);
                p12.writeStringArray(strArr);
                iVar.u1(p12, 5);
                break;
            default:
                GetCredentialRequest getCredentialRequest = (GetCredentialRequest) this.b;
                k7.f fVar = new k7.f(1, (TaskCompletionSource) obj2);
                k7.d dVar = (k7.d) ((k7.e) obj).n();
                com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true), false);
                gVar.c = false;
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i7 = t7.a.a;
                obtain.writeStrongBinder(fVar);
                t7.a.b(obtain, getCredentialRequest);
                t7.a.b(obtain, gVar);
                ((k7.b) dVar).h1(obtain, 1);
                break;
        }
    }

    @Override // n2.v
    public void b(long j3) {
        FfmpegAudioRenderer ffmpegAudioRenderer = (FfmpegAudioRenderer) this.b;
        ffmpegAudioRenderer.h0 = true;
        jb.m mVar = ffmpegAudioRenderer.J;
        Handler handler = (Handler) mVar.b;
        if (handler != null) {
            handler.post(new e4(mVar, j3, 14));
        }
    }

    @Override // n2.v
    public void c(boolean z10) {
        jb.m mVar = ((FfmpegAudioRenderer) this.b).J;
        Handler handler = (Handler) mVar.b;
        if (handler != null) {
            handler.post(new ch.k(12, mVar, z10));
        }
    }

    @Override // n2.v
    public void c0() {
        ((FfmpegAudioRenderer) this.b).a0 = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // li.i0, o0.a
    public void close() {
        switch (this.a) {
            case 5:
                ((li.r) this.b).finishFragment();
                break;
            default:
                ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
                if (contentProviderClient != 0) {
                    if (!(contentProviderClient instanceof AutoCloseable)) {
                        if (!(contentProviderClient instanceof ExecutorService)) {
                            contentProviderClient.release();
                            break;
                        } else {
                            f4.e((ExecutorService) contentProviderClient);
                            break;
                        }
                    } else {
                        contentProviderClient.close();
                        break;
                    }
                }
                break;
        }
    }

    @Override // oi.h0, oi.e1
    public void d(oi.f1 f1Var) {
        m3 m3Var = ((s4) this.b).O;
        if (m3Var != null) {
            t3 t3Var = m3Var.a;
            t3.Q1(t3Var, f1Var);
            t3Var.p3.b(f1Var, true);
        }
    }

    @Override // org.telegram.ui.Components.wm0
    public void e(float f10) {
        oi.x xVar = (oi.x) this.b;
        fj fjVar = xVar.Q;
        if (fjVar == null) {
            return;
        }
        fjVar.b0 = f10;
        MediaController.B().i0(xVar.Q, f10);
    }

    @Override // n2.v
    public void f(t0 t0Var) {
        jb.m mVar = ((FfmpegAudioRenderer) this.b).J;
        Handler handler = (Handler) mVar.b;
        if (handler != null) {
            handler.post(new n2.r(mVar, t0Var, 0));
        }
    }

    @Override // oi.h0
    public void g() {
        s4 s4Var = (s4) this.b;
        m3 m3Var = s4Var.O;
        if (m3Var != null) {
            t3.T1(m3Var.a, s4Var.a);
        }
    }

    @Override // org.telegram.ui.Components.zm0
    public CharSequence getContentDescription() {
        q10 q10Var;
        switch (this.a) {
            case 23:
                return " ";
            case 24:
                t7 t7Var = (t7) this.b;
                try {
                    StringBuilder sb2 = new StringBuilder();
                    if (!TextUtils.isEmpty(t7Var.s)) {
                        sb2.append(t7Var.s);
                    }
                    s7 s7Var = t7Var.r;
                    if (s7Var != null && (q10Var = s7Var.e) != null) {
                        CharSequence charSequence = (CharSequence) q10Var.d(0, Integer.valueOf(t7Var.f));
                        if (!TextUtils.isEmpty(charSequence)) {
                            if (sb2.length() > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(charSequence);
                        }
                        CharSequence charSequence2 = (CharSequence) t7Var.r.e.d(-1, Integer.valueOf(t7Var.r.b()));
                        CharSequence charSequence3 = (CharSequence) t7Var.r.e.d(1, Integer.valueOf(t7Var.r.a()));
                        if (!TextUtils.isEmpty(charSequence2) && !TextUtils.isEmpty(charSequence3)) {
                            if (sb2.length() > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(charSequence2);
                            sb2.append(" – ");
                            sb2.append(charSequence3);
                        }
                    }
                    if (sb2.length() > 0) {
                        return sb2.toString();
                    }
                    return null;
                } catch (Throwable th2) {
                    a8.g(th2, true);
                    return t7Var.s;
                }
            default:
                StringBuilder sb3 = new StringBuilder();
                e8 e8Var = (e8) this.b;
                sb3.append(gd.G(e8Var.x2 / 60, "Minutes", new Object[0]));
                sb3.append(' ');
                sb3.append(gd.G(e8Var.x2 % 60, "Seconds", new Object[0]));
                return gd.a0("AccDescrPlayerDuration", null, 2131754805, sb3.toString(), gd.G(e8Var.y2 / 60, "Minutes", new Object[0]) + ' ' + gd.G(e8Var.y2 % 60, "Seconds", new Object[0]));
        }
    }

    @Override // ue.a
    public long getLongPressDuration() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // org.telegram.ui.Components.wm0
    public void h(float f10) {
        fj fjVar = ((oi.x) this.b).Q;
        if (fjVar == null) {
            return;
        }
        fjVar.b0 = f10;
    }

    @Override // oi.h0
    public void h0() {
        s4 s4Var = (s4) this.b;
        m3 m3Var = s4Var.O;
        if (m3Var != null) {
            oi.a aVar = s4Var.a;
            t3 t3Var = m3Var.a;
            oi.g2 g2Var = t3Var.R3;
            if (g2Var != null) {
                g2Var.g();
            }
            t3Var.p3.onContentChanged();
        }
    }

    @Override // l.i
    public void i(l.k kVar) {
        switch (this.a) {
            case 6:
                r rVar = ((ActionMenuView) this.b).L;
                if (rVar != null) {
                    rVar.i(kVar);
                    break;
                }
                break;
            default:
                Toolbar toolbar = (Toolbar) this.b;
                m.h hVar = toolbar.a.K;
                if (hVar == null || !hVar.g()) {
                    Iterator it = ((CopyOnWriteArrayList) toolbar.a0.c).iterator();
                    while (it.hasNext()) {
                        ((b0) it.next()).a.t();
                    }
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.zm0
    public void j(boolean z10, float f10) {
        int round;
        switch (this.a) {
            case 23:
                a61 a61Var = (a61) ((j0) this.b);
                int i7 = (int) (n6.q * 100.0f);
                int i10 = (int) (f10 * 100.0f);
                n6.q = f10;
                if (i7 != i10) {
                    ThemeActivity themeActivity = a61Var.f.e;
                    mj0 mj0Var = (mj0) themeActivity.b.K(themeActivity.g0);
                    if (mj0Var != null) {
                        ((z8) mj0Var.a).setText(gd.a0("AutoNightBrightnessInfo", null, 2131753791, Integer.valueOf((int) (n6.q * 100.0f))));
                    }
                    n6.F(true);
                    break;
                }
                break;
            case 24:
                t7 t7Var = (t7) this.b;
                s7 s7Var = t7Var.r;
                if (s7Var != null && t7Var.n != null) {
                    if (s7Var.c != null) {
                        double length = f10 * (r3.length - 1);
                        int j3 = Utilities.j((int) Math.floor(length), t7Var.r.c.length - 1, 0);
                        int j10 = Utilities.j((int) Math.ceil(length), t7Var.r.c.length - 1, 0);
                        int[] iArr = t7Var.r.c;
                        round = Math.round(g0.W1(Math.round(((float) (length - Math.floor(length))) * t7Var.r.d) / t7Var.r.d, iArr[j3], iArr[j10]));
                    } else {
                        round = Math.round(((t7Var.r.a() - t7Var.r.b()) * f10) + s7Var.b());
                    }
                    int i11 = t7Var.h;
                    if (i11 != Integer.MIN_VALUE) {
                        round = Math.max(round, i11);
                    }
                    int i12 = t7Var.f;
                    if (i12 != round) {
                        if (t7Var.c(i12) != t7Var.c(round)) {
                            g0.a4(t7Var.e);
                        }
                        t7Var.f = round;
                        t7Var.e(round, true);
                        w10 w10Var = t7Var.n;
                        if (w10Var != null) {
                            w10Var.a(Integer.valueOf(t7Var.f));
                            break;
                        }
                    }
                }
                break;
            default:
                if (z10) {
                    MediaController.B().i0(MediaController.B().v0, f10);
                }
                fj fjVar = MediaController.B().v0;
                if (fjVar != null && fjVar.I3()) {
                    ((e8) this.b).c1(fjVar, false);
                    break;
                }
                break;
        }
    }

    @Override // b3.k
    public b3.i k(b3.m mVar, long j3, long j10, IOException iOException, int i7) {
        long min;
        b3.s sVar = (b3.s) mVar;
        o2.h hVar = (o2.h) this.b;
        long j11 = sVar.a;
        j2.m mVar2 = sVar.b;
        j2.b0 b0Var = sVar.d;
        x2.u uVar = new x2.u(mVar2, b0Var.c, b0Var.d, j3, j10, b0Var.b);
        int i10 = sVar.c;
        hVar.m.getClass();
        for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
            if ((th2 instanceof e2.t0) || (th2 instanceof FileNotFoundException) || (th2 instanceof j2.u) || (th2 instanceof b3.o) || ((th2 instanceof j2.j) && ((j2.j) th2).a == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = Math.min((i7 - 1) * 1000, 5000);
        b3.i iVar = min == -9223372036854775807L ? b3.p.f : new b3.i(0, min, false);
        hVar.q.q(uVar, i10, iOException, !iVar.a());
        return iVar;
    }

    @Override // n2.v
    public void k0(long j3, int i7, long j10) {
        jb.m mVar = ((FfmpegAudioRenderer) this.b).J;
        Handler handler = (Handler) mVar.b;
        if (handler != null) {
            handler.post(new b3.b(mVar, i7, j3, j10, 1));
        }
    }

    @Override // n2.v
    public void l() {
        ((FfmpegAudioRenderer) this.b).g0 = true;
    }

    @Override // b3.k
    public void m(b3.m mVar, long j3, long j10, boolean z10) {
        ((o2.h) this.b).x((b3.s) mVar, j3, j10);
    }

    @Override // li.i0
    public void n(long j3) {
        ((li.r) this.b).presentFragment(bn.ua(j3));
    }

    @Override // li.i0
    public void o() {
        li.r rVar = (li.r) this.b;
        te.a aVar = rVar.a;
        li.j0 j0Var = rVar.w;
        aVar.a(j0Var.n && j0Var.l == 0, true);
        rVar.d.g3.O(true);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        zd.m mVar = (zd.m) this.b;
        Exception exception = task.getException();
        if (exception != null) {
            mVar.resumeWith(c8.z.a(exception));
        } else if (task.isCanceled()) {
            mVar.n(null);
        } else {
            mVar.resumeWith(task.getResult());
        }
    }

    @Override // org.telegram.ui.Components.f61
    public void onError(h61 h61Var, Exception exc) {
        a8.g(exc, true);
    }

    @Override // org.telegram.ui.Components.f61
    public /* synthetic */ void onRenderedFirstFrame(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.f61
    public void onStateChanged(boolean z10, int i7) {
        z40 z40Var;
        d20 d20Var;
        r40 r40Var = (r40) this.b;
        h61 h61Var = r40Var.I0.T;
        if (h61Var != null && h61Var.d0() && i7 == 4 && (d20Var = (z40Var = r40Var.I0).S) != null) {
            h61 h61Var2 = z40Var.T;
            long j3 = d20Var.a;
            if (j3 <= 0) {
                j3 = 0;
            }
            h61Var2.p0(j3);
        }
    }

    @Override // org.telegram.ui.Components.f61
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // l.i
    public boolean p(l.k kVar, MenuItem menuItem) {
        switch (this.a) {
            case 6:
                m.k kVar2 = ((ActionMenuView) this.b).Q;
                if (kVar2 != null) {
                    Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((hi.u0) kVar2).b).a0.c).iterator();
                    while (it.hasNext()) {
                        if (((b0) it.next()).a.p()) {
                            break;
                        }
                    }
                    break;
                }
                break;
            default:
                ((Toolbar) this.b).getClass();
                break;
        }
        return false;
    }

    @Override // ue.a
    public boolean q1(float f10, float f11) {
        bu buVar = (bu) this.b;
        au i02 = bu.i0(buVar, f10, f11);
        if (i02 == null || i02.b) {
            i02 = null;
        }
        buVar.b0 = i02;
        return i02 != null;
    }

    @Override // ue.a
    public boolean r1(View view, float f10, float f11) {
        bu buVar = (bu) this.b;
        if (buVar.b0 == null) {
            return false;
        }
        au i02 = bu.i0(buVar, f10, f11);
        au auVar = buVar.b0;
        if (i02 != auVar) {
            return false;
        }
        ev evVar = buVar.a;
        m1 m1Var = evVar.F;
        if (m1Var == null) {
            return true;
        }
        m1Var.I1(evVar.E, auVar.c);
        return true;
    }

    @Override // ue.a
    public boolean r2() {
        return true;
    }

    @Override // n2.v
    public void s(t0 t0Var) {
        jb.m mVar = ((FfmpegAudioRenderer) this.b).J;
        Handler handler = (Handler) mVar.b;
        if (handler != null) {
            handler.post(new n2.r(mVar, t0Var, 1));
        }
    }

    @Override // ue.a
    public /* synthetic */ boolean s0() {
        return true;
    }

    @Override // b3.k
    public void t(b3.m mVar, long j3, long j10, int i7) {
        x2.u uVar;
        b3.s sVar = (b3.s) mVar;
        o2.h hVar = (o2.h) this.b;
        if (i7 == 0) {
            long j11 = sVar.a;
            uVar = new x2.u(sVar.b, j3);
        } else {
            long j12 = sVar.a;
            j2.m mVar2 = sVar.b;
            j2.b0 b0Var = sVar.d;
            uVar = new x2.u(mVar2, b0Var.c, b0Var.d, j3, j10, b0Var.b);
        }
        hVar.q.s(uVar, sVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i7);
    }

    @Override // ue.a
    public void u(float f10, float f11) {
        bu buVar = (bu) this.b;
        au i02 = bu.i0(buVar, f10, f11);
        au auVar = buVar.b0;
        if (i02 != auVar) {
            auVar = null;
        }
        bu.j0(buVar, auVar);
    }

    public e1 v() {
        ce.w wVar = (ce.w) this.b;
        wVar.getClass();
        Object obj = ce.w.e.get(wVar);
        if (obj == de.g.a) {
            obj = null;
        }
        return (e1) obj;
    }

    @Override // org.telegram.ui.Components.zm0
    public void w() {
        int i7 = this.a;
    }

    @Override // oi.h0
    public void w0() {
        s4 s4Var = (s4) this.b;
        m3 m3Var = s4Var.O;
        if (m3Var != null) {
            oi.a aVar = s4Var.a;
            t3.S1(m3Var.a);
        }
    }

    @Override // b3.k
    public void x(b3.m mVar, long j3, long j10) {
        long j11;
        b3.s sVar = (b3.s) mVar;
        o2.h hVar = (o2.h) this.b;
        long j12 = sVar.a;
        j2.m mVar2 = sVar.b;
        j2.b0 b0Var = sVar.d;
        x2.u uVar = new x2.u(mVar2, b0Var.c, b0Var.d, j3, j10, b0Var.b);
        hVar.m.getClass();
        hVar.q.o(uVar, sVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        p2.c cVar = (p2.c) sVar.f;
        p2.c cVar2 = hVar.G;
        int size = cVar2 == null ? 0 : cVar2.m.size();
        long j13 = cVar.b(0).b;
        int i7 = 0;
        while (i7 < size && hVar.G.b(i7).b < j13) {
            i7++;
        }
        if (cVar.d) {
            if (size - i7 > cVar.m.size()) {
                h2.a.l("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j14 = hVar.M;
                j11 = -9223372036854775807L;
                if (j14 == -9223372036854775807L || cVar.h * 1000 > j14) {
                    hVar.L = 0;
                } else {
                    h2.a.l("DashMediaSource", "Loaded stale dynamic manifest: " + cVar.h + ", " + hVar.M);
                }
            }
            int i10 = hVar.L;
            hVar.L = i10 + 1;
            if (i10 < hVar.m.R4(sVar.c)) {
                hVar.D.postDelayed(hVar.v, Math.min((hVar.L - 1) * 1000, 5000));
                return;
            } else {
                hVar.C = new androidx.datastore.preferences.protobuf.l();
                return;
            }
        }
        j11 = -9223372036854775807L;
        hVar.G = cVar;
        hVar.H = cVar.d & hVar.H;
        hVar.I = j3 - j10;
        hVar.J = j3;
        hVar.N += i7;
        synchronized (hVar.t) {
            try {
                if (sVar.b.a.equals(hVar.E)) {
                    Uri uri = hVar.G.k;
                    if (uri == null) {
                        uri = h7.a(sVar.d.c);
                    }
                    hVar.E = uri;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        p2.c cVar3 = hVar.G;
        if (!cVar3.d || hVar.K != j11) {
            hVar.z(true);
            return;
        }
        f5.a aVar = cVar3.i;
        if (aVar == null) {
            hVar.w();
            return;
        }
        String str = aVar.b;
        if (Objects.equals(str, "urn:mpeg:dash:utc:direct:2014") || Objects.equals(str, "urn:mpeg:dash:utc:direct:2012")) {
            try {
                hVar.K = h2.l0.V(aVar.c) - hVar.J;
                hVar.z(true);
                return;
            } catch (e2.t0 e10) {
                hVar.y(e10);
                return;
            }
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            hVar.A(aVar, new o2.g());
            return;
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            hVar.A(aVar, new nb.a(16));
        } else if (Objects.equals(str, "urn:mpeg:dash:utc:ntp:2014") || Objects.equals(str, "urn:mpeg:dash:utc:ntp:2012")) {
            hVar.w();
        } else {
            hVar.y(new IOException("Unsupported UTC timing scheme"));
        }
    }

    public /* synthetic */ r(t tVar, String[] strArr) {
        this.a = 0;
        this.b = strArr;
    }

    @Override // org.telegram.ui.Components.f61
    public void onRenderedFirstFrame() {
    }

    public /* synthetic */ r(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    public r() {
        this.a = 8;
        this.b = new ce.w(f1.b);
    }

    public r(String str, long j3) {
        this.a = 18;
        this.b = new org.telegram.messenger.l0(str, j3);
    }

    public r(Context context, Uri uri) {
        this.a = 11;
        this.b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public r(String str, Set set) {
        this.a = 19;
        this.b = new o0(str, set);
    }

    public r(String str, boolean z10) {
        this.a = 17;
        this.b = new org.telegram.messenger.h0(str, z10);
    }

    private final /* synthetic */ void A() {
    }

    private final void D() {
    }

    private final void z() {
    }

    @Override // org.telegram.ui.Components.ri
    public /* synthetic */ void B0() {
    }

    @Override // n2.v
    public /* synthetic */ void f0() {
    }

    @Override // org.telegram.ui.Components.ri
    public /* synthetic */ void l0() {
    }

    @Override // n2.v
    public /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.Components.ri
    public /* synthetic */ void O0(Object obj) {
    }

    @Override // org.telegram.ui.Components.ri
    public /* synthetic */ void h1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.f61
    public /* synthetic */ void onSeekFinished(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.f61
    public /* synthetic */ void onSeekStarted(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.f61
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // ue.a
    public /* synthetic */ void B(View view, float f10, float f11) {
    }

    @Override // ue.a
    public /* synthetic */ void X1(View view, float f10, float f11) {
    }

    @Override // ue.a
    public /* synthetic */ void r(View view, float f10, float f11) {
    }

    @Override // org.telegram.ui.Components.f61
    public void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
    }

    @Override // org.telegram.ui.Components.ri
    public void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
    }

    @Override // org.telegram.ui.Components.ri
    public /* synthetic */ void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
    }
}
