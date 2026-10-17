package a6;

import a3.n0;
import ai.k7;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.biometric.f0;
import androidx.lifecycle.a0;
import b2.a2;
import b5.p;
import ci.q4;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.internal.i0;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.api.internal.w0;
import com.google.android.gms.internal.cast.a6;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import e9.j1;
import e9.l1;
import ei.a8;
import ei.bc;
import ei.d0;
import ei.e0;
import ei.jb;
import ei.lb;
import ei.r6;
import ei.vb;
import ei.xa;
import ei.z5;
import ei.zb;
import g.q;
import gb.n;
import hg.z1;
import i2.j0;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import ki.z;
import l.w;
import mg.o;
import n4.s;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.a81;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.sq0;
import org.telegram.ui.Components.xo0;
import rg.b2;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class i implements n0, r, sq0, a0, androidx.activity.result.b, p, OnCompleteListener, d9.k, SuccessContinuation, o, zb, f6.a, w, n, z1, je.a, xo0 {
    public static i c;
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ i(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public static synchronized i F(Context context) {
        i L;
        synchronized (i.class) {
            L = L(context.getApplicationContext());
        }
        return L;
    }

    public static synchronized i L(Context context) {
        synchronized (i.class) {
            i iVar = c;
            if (iVar != null) {
                return iVar;
            }
            i iVar2 = new i(context, 0);
            c = iVar2;
            return iVar2;
        }
    }

    @Override // ei.zb
    public void A(float f7, boolean z10) {
        r6 r6Var = (r6) this.b;
        a8 a8Var = r6Var.d;
        if (a8Var == null) {
            return;
        }
        a8Var.Z = f7;
        a8Var.j = true;
        a81 a81Var = r6Var.e;
        if (a81Var == null || a81Var.p() == -9223372036854775807L) {
            return;
        }
        r6Var.m((long) (f7 * r6Var.e.p()));
    }

    public boolean B() {
        w0 w0Var = ((i0) this.b).d;
        return w0Var != null && w0Var.b();
    }

    @Override // ei.zb
    public void C(long j10) {
        r6 r6Var = (r6) this.b;
        a8 a8Var = r6Var.d;
        if (a8Var == null) {
            return;
        }
        a8Var.r0 = j10;
        a8Var.j = true;
        r6Var.y(true);
    }

    @Override // ei.zb
    public void E(boolean z10) {
        b2 b2Var;
        vb vbVar = ((jb) ((r6) this.b)).C0;
        xa xaVar = vbVar.v1;
        if (xaVar == null) {
            return;
        }
        b2 b2Var2 = null;
        if (!z10 && (xaVar.getSelectedEntity() instanceof b2)) {
            vbVar.v1.C0(null, true);
            return;
        }
        if (!z10 || (vbVar.v1.getSelectedEntity() instanceof b2)) {
            return;
        }
        z5 z5Var = vbVar.v1.R0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= z5Var.getChildCount()) {
                b2Var = null;
                break;
            }
            View childAt = z5Var.getChildAt(i11);
            if (childAt instanceof b2) {
                b2Var = (b2) childAt;
                break;
            }
            i11++;
        }
        if (b2Var != null) {
            xa xaVar2 = vbVar.v1;
            z5 z5Var2 = xaVar2.R0;
            while (true) {
                if (i10 >= z5Var2.getChildCount()) {
                    break;
                }
                View childAt2 = z5Var2.getChildAt(i10);
                if (childAt2 instanceof b2) {
                    b2Var2 = (b2) childAt2;
                    break;
                }
                i10++;
            }
            xaVar2.C0(b2Var2, true);
        }
    }

    @Override // ei.zb
    public void G(float f7, int i10) {
        ArrayList arrayList;
        r6 r6Var = (r6) this.b;
        a8 a8Var = r6Var.d;
        if (a8Var == null || (arrayList = a8Var.T) == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        ((a8) r6Var.d.T.get(i10)).V = f7;
    }

    @Override // org.telegram.ui.Components.sq0
    public /* synthetic */ void H() {
        int i10 = this.a;
    }

    public synchronized void I() {
        synchronized (this) {
            try {
                b bVar = (b) this.b;
                ReentrantLock reentrantLock = bVar.a;
                reentrantLock.lock();
                try {
                    bVar.b.edit().clear().apply();
                } finally {
                    reentrantLock.unlock();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // hg.z1
    public /* synthetic */ a0.h J() {
        return null;
    }

    @Override // ei.zb
    public void K(float f7) {
        r6 r6Var = (r6) this.b;
        a8 a8Var = r6Var.d;
        if (a8Var == null) {
            return;
        }
        a8Var.F = f7;
        a8Var.j = true;
        r6Var.w(true);
    }

    @Override // ei.zb
    public void M(float f7) {
        r6 r6Var = (r6) this.b;
        a8 a8Var = r6Var.d;
        if (a8Var == null) {
            return;
        }
        a8Var.E = f7;
        a8Var.j = true;
        r6Var.w(true);
    }

    @Override // ei.zb
    public void N(float f7, int i10) {
        ArrayList arrayList;
        r6 r6Var = (r6) this.b;
        a8 a8Var = r6Var.d;
        if (a8Var == null || (arrayList = a8Var.T) == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        ((a8) r6Var.d.T.get(i10)).W = f7;
    }

    @Override // hg.z1
    public /* synthetic */ boolean O(int i10) {
        return true;
    }

    @Override // ei.zb
    public void P(float f7) {
        a8 a8Var = ((r6) this.b).d;
        if (a8Var == null) {
            return;
        }
        a8Var.a0 = f7;
        a8Var.j = true;
    }

    @Override // ei.zb
    public void Q() {
        ((r6) this.b).q(null);
    }

    @Override // ei.zb
    public void S(float f7) {
        r6 r6Var = (r6) this.b;
        a8 a8Var = r6Var.d;
        if (a8Var == null) {
            return;
        }
        a8Var.t0 = f7;
        a8Var.j = true;
        r6Var.y(true);
    }

    @Override // ei.zb
    public void T(int i10, long j10) {
        ArrayList arrayList;
        r6 r6Var = (r6) this.b;
        a8 a8Var = r6Var.d;
        if (a8Var == null || (arrayList = a8Var.T) == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        ((a8) r6Var.d.T.get(i10)).X = j10;
    }

    @Override // a3.n0
    public void U() {
        j0 j0Var = ((a3.n) this.b).Y;
        if (j0Var != null) {
            j0Var.a();
        }
    }

    @Override // ei.zb
    public void W(long j10) {
        r6 r6Var = (r6) this.b;
        a8 a8Var = r6Var.d;
        if (a8Var == null) {
            return;
        }
        a8Var.D = j10;
        a8Var.j = true;
        r6Var.w(true);
    }

    @Override // androidx.lifecycle.a0
    public void Z(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        f0 f0Var = (f0) this.b;
        Handler handler = f0Var.A0;
        androidx.activity.i iVar = f0Var.B0;
        handler.removeCallbacks(iVar);
        TextView textView = f0Var.G0;
        if (textView != null) {
            textView.setText(charSequence);
        }
        handler.postDelayed(iVar, 2000L);
    }

    @Override // b5.p
    public String[] a() {
        return ((WebViewProviderFactoryBoundaryInterface) this.b).getSupportedFeatures();
    }

    @Override // com.google.android.gms.common.api.internal.r
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 2:
                l8.c cVar = (l8.c) this.b;
                a8.e eVar = new a8.e(1, (TaskCompletionSource) obj2);
                a8.c cVar2 = (a8.c) ((a8.g) obj).u();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i10 = a8.a.a;
                obtain.writeStrongBinder(eVar);
                obtain.writeInt(1);
                cVar.writeToParcel(obtain, 0);
                cVar2.F0(obtain, 1);
                break;
            default:
                i7.b bVar = (i7.b) this.b;
                i7.a aVar = new i7.a((TaskCompletionSource) obj2);
                i7.i iVar = (i7.i) ((i7.c) obj).u();
                String str = bVar.k;
                Parcel J0 = iVar.J0();
                int i11 = i7.f.a;
                J0.writeStrongBinder(aVar);
                J0.writeString(str);
                iVar.K0(J0, 2);
                break;
        }
    }

    @Override // d9.k
    public Object apply(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        l1 l1Var = (l1) this.b;
        l1Var.getClass();
        entry.getClass();
        return new j1(entry, l1Var);
    }

    @Override // org.telegram.ui.Components.xo0
    public void b(float f7) {
        z zVar = (z) this.b;
        MessageObject messageObject = zVar.P;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f7;
        MediaController.getInstance().seekToProgress(zVar.P, f7);
    }

    @Override // org.telegram.ui.Components.xo0
    public void c(float f7) {
        MessageObject messageObject = ((z) this.b).P;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f7;
    }

    @Override // b5.p
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) androidx.activity.result.c.a(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.b).createWebView(webView));
    }

    @Override // l.w
    public void d(l.k kVar, boolean z10) {
        q qVar;
        g.r rVar = (g.r) this.b;
        l.k k10 = kVar.k();
        int i10 = 0;
        boolean z11 = k10 != kVar;
        if (z11) {
            kVar = k10;
        }
        q[] qVarArr = rVar.U;
        int length = qVarArr != null ? qVarArr.length : 0;
        while (true) {
            if (i10 < length) {
                qVar = qVarArr[i10];
                if (qVar != null && qVar.h == kVar) {
                    break;
                } else {
                    i10++;
                }
            } else {
                qVar = null;
                break;
            }
        }
        if (qVar != null) {
            if (!z11) {
                rVar.i(qVar, z10);
            } else {
                rVar.g(qVar.a, qVar, k10);
                rVar.i(qVar, true);
            }
        }
    }

    @Override // ei.zb
    public void e(int i10) {
        e0 e0Var = ((r6) this.b).E;
        if (e0Var != null) {
            ArrayList arrayList = e0Var.h;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                d0 d0Var = (d0) obj;
                if (d0Var.a == i10) {
                    d0Var.b.d(1.0f, true);
                    e0Var.invalidate();
                    return;
                }
            }
        }
    }

    @Override // hg.z1
    public void f(int i10) {
        AndroidUtilities.runOnUIThread(new bc(this, 20));
    }

    @Override // gb.n
    public Object f2() {
        Type type = (Type) this.b;
        if (!(type instanceof ParameterizedType)) {
            throw new eb.j("Invalid EnumMap type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return new EnumMap((Class) type2);
        }
        throw new eb.j("Invalid EnumMap type: " + type.toString());
    }

    @Override // ei.zb
    public void g(float f7) {
        r6 r6Var = (r6) this.b;
        a8 a8Var = r6Var.d;
        if (a8Var == null) {
            return;
        }
        a8Var.u0 = f7;
        a8Var.j = true;
        r6Var.c();
    }

    @Override // org.telegram.ui.Components.sq0
    public void g0() {
        switch (this.a) {
            case 4:
                qc k10 = ((k7) this.b).getBulletinFactory().k(false);
                k10.t = true;
                k10.j();
                break;
            default:
                q4.j0((q4) this.b);
                break;
        }
    }

    @Override // b5.p
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) androidx.activity.result.c.a(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.b).getStatics());
    }

    @Override // a3.n0
    public void h() {
        a3.n nVar = (a3.n) this.b;
        if (nVar.r1 != null) {
            nVar.R0(0, 1);
        }
    }

    @Override // androidx.activity.result.b
    public void i(Object obj) {
        Map map = (Map) obj;
        androidx.fragment.app.j0 j0Var = (androidx.fragment.app.j0) this.b;
        ArrayList arrayList = new ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
        }
        androidx.fragment.app.f0 f0Var = (androidx.fragment.app.f0) j0Var.F.pollFirst();
        if (f0Var == null) {
            Log.w("FragmentManager", "No permissions were requested for " + this);
        } else {
            String str = f0Var.a;
            if (j0Var.c.f(str) == null) {
                Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
            }
        }
    }

    public c6.o j() {
        c6.o oVar = (c6.o) this.b;
        if (oVar.a == null) {
            throw new IllegalArgumentException("media cannot be null.");
        }
        if (!Double.isNaN(oVar.d) && oVar.d < 0.0d) {
            throw new IllegalArgumentException("startTime cannot be negative or NaN.");
        }
        if (Double.isNaN(oVar.e)) {
            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
        }
        if (Double.isNaN(oVar.f) || oVar.f < 0.0d) {
            throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
        }
        return oVar;
    }

    @Override // f6.a
    public void k(Bitmap bitmap) {
        ((f6.h) this.b).e(bitmap, 3);
    }

    @Override // ei.zb
    public void l(float f7) {
        r6 r6Var = (r6) this.b;
        a8 a8Var = r6Var.d;
        if (a8Var == null) {
            return;
        }
        a8Var.G = f7;
        a8Var.j = true;
        r6Var.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0245 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x05ea A[Catch: a | c -> 0x0687, TryCatch #2 {a | c -> 0x0687, blocks: (B:297:0x05d0, B:298:0x05e6, B:300:0x05ea, B:301:0x05ed, B:303:0x05f1, B:305:0x05fb, B:307:0x0601, B:312:0x0606), top: B:296:0x05d0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public androidx.biometric.e m(s sVar) {
        int i10;
        ArrayList arrayList;
        jc.c cVar;
        jc.c cVar2;
        jc.c cVar3;
        float f7;
        float f10;
        jc.a aVar;
        float f11;
        float f12;
        float f13;
        int i11;
        int i12;
        dc.j[] jVarArr;
        dc.a aVar2;
        ec.b bVar;
        int i13;
        c2.r rVar;
        int i14;
        androidx.biometric.e eVar;
        List list;
        String str;
        int i15;
        boolean z10;
        double d;
        double abs;
        int i16;
        int i17;
        int i18;
        m mVar = (m) this.b;
        if (((ec.b) sVar.c) == null) {
            sVar.c = ((ec.e) sVar.b).a();
        }
        ec.b bVar2 = (ec.b) sVar.c;
        ya.c cVar4 = new ya.c(bVar2, 25);
        jc.e eVar2 = new jc.e(bVar2);
        int i19 = bVar2.b;
        int i20 = bVar2.a;
        int i21 = (i19 * 3) / 388;
        int i22 = 3;
        if (i21 < 3) {
            i21 = 3;
        }
        char c10 = 5;
        int[] iArr = new int[5];
        int i23 = i21 - 1;
        int i24 = 0;
        boolean z11 = false;
        while (true) {
            char c11 = c10;
            int i25 = 1;
            i10 = i22;
            arrayList = eVar2.b;
            if (i23 >= i19 || z11) {
                break;
            }
            Arrays.fill(iArr, i24);
            int i26 = i24;
            while (i26 < i20) {
                if (bVar2.b(i26, i23)) {
                    if ((i24 & 1) == i25) {
                        i24++;
                    }
                    iArr[i24] = iArr[i24] + i25;
                    i16 = i19;
                } else if ((i24 & 1) != 0) {
                    i16 = i19;
                    iArr[i24] = iArr[i24] + 1;
                } else if (i24 == 4) {
                    if (!jc.e.b(iArr)) {
                        i16 = i19;
                        int i27 = i25;
                        iArr[0] = iArr[2];
                        iArr[i27] = iArr[i10];
                        iArr[2] = iArr[4];
                        iArr[i10] = i27;
                        iArr[4] = 0;
                    } else if (eVar2.c(i23, i26, iArr)) {
                        if (eVar2.c) {
                            z11 = eVar2.d();
                            i16 = i19;
                            i17 = 2;
                        } else {
                            if (arrayList.size() > i25) {
                                int size = arrayList.size();
                                int i28 = 0;
                                jc.c cVar5 = null;
                                while (true) {
                                    if (i28 >= size) {
                                        i16 = i19;
                                        i17 = 2;
                                        i18 = 0;
                                        break;
                                    }
                                    Object obj = arrayList.get(i28);
                                    i28++;
                                    jc.c cVar6 = (jc.c) obj;
                                    i16 = i19;
                                    if (cVar6.d >= 2) {
                                        if (cVar5 != null) {
                                            eVar2.c = true;
                                            i17 = 2;
                                            i18 = ((int) (Math.abs(cVar5.a - cVar6.a) - Math.abs(cVar5.b - cVar6.b))) / 2;
                                            break;
                                        }
                                        cVar5 = cVar6;
                                    }
                                    i19 = i16;
                                }
                            } else {
                                i16 = i19;
                                i18 = 0;
                                i17 = 2;
                            }
                            if (i18 > iArr[i17]) {
                                i23 += (i18 - r5) - 2;
                                i26 = i20 - 1;
                            }
                        }
                        Arrays.fill(iArr, 0);
                        i24 = 0;
                        i21 = i17;
                    } else {
                        i16 = i19;
                        iArr[0] = iArr[2];
                        iArr[1] = iArr[i10];
                        iArr[2] = iArr[4];
                        iArr[i10] = 1;
                        iArr[4] = 0;
                    }
                    i24 = i10;
                } else {
                    i16 = i19;
                    int i29 = i24 + 1;
                    iArr[i29] = iArr[i29] + 1;
                    i24 = i29;
                }
                i26++;
                i19 = i16;
                i25 = 1;
            }
            int i30 = i19;
            if (jc.e.b(iArr) && eVar2.c(i23, i20, iArr)) {
                int i31 = iArr[0];
                if (eVar2.c) {
                    i21 = i31;
                    z11 = eVar2.d();
                } else {
                    i21 = i31;
                }
            }
            i23 += i21;
            c10 = c11;
            i22 = i10;
            i19 = i30;
            i24 = 0;
        }
        if (arrayList.size() < i10) {
            throw dc.e.a();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((jc.c) it.next()).d < 2) {
                it.remove();
            }
        }
        Collections.sort(arrayList, jc.e.e);
        jc.c[] cVarArr = new jc.c[3];
        int i32 = 0;
        double d10 = Double.MAX_VALUE;
        for (int i33 = 2; i32 < arrayList.size() - i33; i33 = 2) {
            jc.c cVar7 = (jc.c) arrayList.get(i32);
            float f14 = cVar7.c;
            i32++;
            int i34 = i32;
            while (i34 < arrayList.size() - 1) {
                jc.c cVar8 = (jc.c) arrayList.get(i34);
                double e = jc.e.e(cVar7, cVar8);
                i34++;
                for (int i35 = i34; i35 < arrayList.size(); i35++) {
                    jc.c cVar9 = (jc.c) arrayList.get(i35);
                    if (cVar9.c <= 1.4f * f14) {
                        double e7 = jc.e.e(cVar8, cVar9);
                        double e10 = jc.e.e(cVar7, cVar9);
                        if (e < e7) {
                            if (e7 <= e10) {
                                e10 = e7;
                                e7 = e10;
                            } else if (e >= e10) {
                                d = e10;
                                e10 = e;
                                abs = Math.abs(e7 - (d * 2.0d)) + Math.abs(e7 - (e10 * 2.0d));
                                if (abs >= d10) {
                                    cVarArr[0] = cVar7;
                                    cVarArr[1] = cVar8;
                                    cVarArr[2] = cVar9;
                                    d10 = abs;
                                }
                            }
                            d = e;
                            abs = Math.abs(e7 - (d * 2.0d)) + Math.abs(e7 - (e10 * 2.0d));
                            if (abs >= d10) {
                            }
                        } else {
                            if (e7 >= e10) {
                                d = e10;
                                e10 = e7;
                            } else if (e < e10) {
                                d = e7;
                                e7 = e10;
                                e10 = e;
                                abs = Math.abs(e7 - (d * 2.0d)) + Math.abs(e7 - (e10 * 2.0d));
                                if (abs >= d10) {
                                }
                            } else {
                                d = e7;
                            }
                            e7 = e;
                            abs = Math.abs(e7 - (d * 2.0d)) + Math.abs(e7 - (e10 * 2.0d));
                            if (abs >= d10) {
                            }
                        }
                    }
                }
            }
        }
        if (d10 == Double.MAX_VALUE) {
            throw dc.e.a();
        }
        float a2 = dc.j.a(cVarArr[0], cVarArr[1]);
        float a10 = dc.j.a(cVarArr[1], cVarArr[2]);
        float a11 = dc.j.a(cVarArr[0], cVarArr[2]);
        if (a10 >= a2 && a10 >= a11) {
            cVar = cVarArr[0];
            cVar2 = cVarArr[1];
            cVar3 = cVarArr[2];
        } else if (a11 < a10 || a11 < a2) {
            cVar = cVarArr[2];
            cVar2 = cVarArr[0];
            cVar3 = cVarArr[1];
        } else {
            cVar = cVarArr[1];
            cVar2 = cVarArr[0];
            cVar3 = cVarArr[2];
        }
        float f15 = cVar.a;
        float f16 = cVar.b;
        if (a6.D(cVar2.a, f15, cVar3.b - f16, (cVar2.b - f16) * (cVar3.a - f15)) < 0.0f) {
            jc.c cVar10 = cVar3;
            cVar3 = cVar2;
            cVar2 = cVar10;
        }
        cVarArr[0] = cVar2;
        cVarArr[1] = cVar;
        cVarArr[2] = cVar3;
        float F = cVar4.F(cVar, cVar3);
        float f17 = cVar.a;
        float f18 = cVar3.b;
        float f19 = cVar3.a;
        float F2 = cVar4.F(cVar, cVar2);
        float f20 = cVar2.b;
        float f21 = cVar2.a;
        float f22 = (F2 + F) / 2.0f;
        if (f22 < 1.0f) {
            throw dc.e.a();
        }
        float a12 = dc.j.a(cVar, cVar3) / f22;
        int i36 = (int) (a12 + (a12 < 0.0f ? -0.5f : 0.5f));
        float a13 = dc.j.a(cVar, cVar2) / f22;
        int i37 = (((int) (a13 + (a13 >= 0.0f ? 0.5f : -0.5f))) + i36) / 2;
        int i38 = i37 + 7;
        int i39 = i38 & 3;
        if (i39 == 0) {
            i38 = i37 + 8;
        } else if (i39 == 2) {
            i38 = i37 + 6;
        } else if (i39 == 3) {
            i38 = i37 + 5;
        }
        int i40 = i38;
        int[] iArr2 = ic.f.e;
        if (i40 % 4 != 1) {
            throw dc.c.a();
        }
        try {
            ic.f c12 = ic.f.c((i40 - 17) / 4);
            int i41 = (c12.a * 4) + 10;
            if (c12.b.length > 0) {
                float f23 = (f19 - f17) + f21;
                f10 = f19;
                float f24 = (f18 - f16) + f20;
                float f25 = 1.0f - (3.0f / i41);
                int x10 = (int) a6.x(f23, f17, f25, f17);
                int x11 = (int) a6.x(f24, f16, f25, f16);
                f7 = f17;
                for (int i42 = 4; i42 <= 16; i42 <<= 1) {
                    try {
                        aVar = cVar4.I(f22, i42, x10, x11);
                        break;
                    } catch (dc.e unused) {
                    }
                }
            } else {
                f7 = f17;
                f10 = f19;
            }
            aVar = null;
            float f26 = i40 - 3.5f;
            if (aVar != null) {
                f11 = aVar.a;
                f12 = aVar.b;
                f13 = f26 - 3.0f;
            } else {
                f11 = (f10 - f7) + f21;
                f12 = (f18 - f16) + f20;
                f13 = f26;
            }
            float f27 = f12;
            float f28 = cVar.a;
            float f29 = cVar.b;
            float f30 = cVar3.a;
            float f31 = cVar3.b;
            float f32 = cVar2.a;
            float f33 = cVar2.b;
            ec.g a14 = ec.g.a(3.5f, 3.5f, f26, 3.5f, f13, f13, 3.5f, f26);
            jc.a aVar3 = aVar;
            float f34 = a14.e;
            float f35 = a14.i;
            float f36 = f34 * f35;
            float f37 = a14.f;
            float f38 = a14.h;
            float f39 = f36 - (f37 * f38);
            float f40 = a14.g;
            float f41 = f37 * f40;
            float f42 = a14.d;
            float f43 = f41 - (f42 * f35);
            float f44 = (f42 * f38) - (f34 * f40);
            float f45 = a14.c;
            float f46 = f45 * f38;
            float f47 = a14.b;
            float f48 = f46 - (f47 * f35);
            float f49 = a14.a;
            float f50 = (f35 * f49) - (f45 * f40);
            float f51 = (f40 * f47) - (f38 * f49);
            float f52 = (f47 * f37) - (f45 * f34);
            float f53 = (f45 * f42) - (f37 * f49);
            float f54 = (f49 * f34) - (f47 * f42);
            ec.g a15 = ec.g.a(f28, f29, f30, f31, f11, f27, f32, f33);
            float f55 = a15.a;
            float f56 = a15.d;
            float f57 = a15.g;
            float f58 = (f57 * f52) + (f56 * f48) + (f55 * f39);
            float f59 = (f57 * f53) + (f56 * f50) + (f55 * f43);
            float f60 = (f57 * f54) + (f56 * f51) + (f55 * f44);
            float f61 = a15.b;
            float f62 = a15.e;
            float f63 = a15.h;
            float f64 = (f63 * f52) + (f62 * f48) + (f61 * f39);
            float f65 = (f63 * f53) + (f62 * f50) + (f61 * f43);
            float f66 = (f63 * f54) + (f62 * f51) + (f61 * f44);
            float f67 = a15.c;
            float f68 = a15.f;
            float f69 = a15.i;
            float f70 = (f52 * f69) + (f48 * f68) + (f39 * f67);
            float f71 = (f53 * f69) + (f50 * f68) + (f43 * f67);
            float f72 = (f69 * f54) + (f68 * f51) + (f67 * f44);
            if (i40 <= 0 || i40 <= 0) {
                throw dc.e.a();
            }
            ec.b bVar3 = new ec.b(i40, i40);
            int i43 = i40 * 2;
            jc.c cVar11 = cVar;
            float[] fArr = new float[i43];
            int i44 = 0;
            while (i44 < i40) {
                int i45 = i40;
                float f73 = i44 + 0.5f;
                int i46 = 0;
                while (i46 < i43) {
                    int i47 = i46;
                    fArr[i47] = (i47 / 2) + 0.5f;
                    fArr[i47 + 1] = f73;
                    i46 = i47 + 2;
                }
                int i48 = i43 - 1;
                jc.c cVar12 = cVar2;
                int i49 = 0;
                while (i49 < i48) {
                    float f74 = fArr[i49];
                    int i50 = i49 + 1;
                    int i51 = i49;
                    float f75 = fArr[i50];
                    jc.c cVar13 = cVar3;
                    float c13 = r.c.c(f71, f75, f70 * f74, f72);
                    fArr[i51] = (((f59 * f75) + (f58 * f74)) + f60) / c13;
                    fArr[i50] = (((f75 * f65) + (f74 * f64)) + f66) / c13;
                    i49 = i51 + 2;
                    cVar3 = cVar13;
                }
                jc.c cVar14 = cVar3;
                int i52 = bVar2.b;
                float f76 = f71;
                int i53 = 0;
                boolean z12 = true;
                while (i53 < i48 && z12) {
                    int i54 = (int) fArr[i53];
                    int i55 = i53 + 1;
                    int i56 = i48;
                    int i57 = (int) fArr[i55];
                    int i58 = i53;
                    if (i54 < -1 || i54 > i20 || i57 < -1 || i57 > i52) {
                        throw dc.e.a();
                    }
                    if (i54 == -1) {
                        fArr[i58] = 0.0f;
                    } else if (i54 == i20) {
                        fArr[i58] = i20 - 1;
                    } else {
                        z10 = false;
                        if (i57 != -1) {
                            fArr[i55] = 0.0f;
                        } else if (i57 == i52) {
                            fArr[i55] = i52 - 1;
                        } else {
                            z12 = z10;
                            i53 = i58 + 2;
                            i48 = i56;
                        }
                        z12 = true;
                        i53 = i58 + 2;
                        i48 = i56;
                    }
                    z10 = true;
                    if (i57 != -1) {
                    }
                    z12 = true;
                    i53 = i58 + 2;
                    i48 = i56;
                }
                int i59 = i43 - 2;
                boolean z13 = true;
                while (i59 >= 0 && z13) {
                    int i60 = (int) fArr[i59];
                    int i61 = i59 + 1;
                    int i62 = i59;
                    int i63 = (int) fArr[i61];
                    if (i60 < -1 || i60 > i20 || i63 < -1 || i63 > i52) {
                        throw dc.e.a();
                    }
                    if (i60 == -1) {
                        fArr[i62] = 0.0f;
                    } else if (i60 == i20) {
                        fArr[i62] = i20 - 1;
                    } else {
                        z13 = false;
                        if (i63 != -1) {
                            fArr[i61] = 0.0f;
                        } else if (i63 == i52) {
                            fArr[i61] = i52 - 1;
                        } else {
                            i59 = i62 - 2;
                        }
                        z13 = true;
                        i59 = i62 - 2;
                    }
                    z13 = true;
                    if (i63 != -1) {
                    }
                    z13 = true;
                    i59 = i62 - 2;
                }
                for (int i64 = 0; i64 < i43; i64 += 2) {
                    try {
                        if (bVar2.b((int) fArr[i64], (int) fArr[i64 + 1])) {
                            bVar3.c(i64 / 2, i44);
                        }
                    } catch (ArrayIndexOutOfBoundsException unused2) {
                        throw dc.e.a();
                    }
                }
                i44++;
                i40 = i45;
                cVar2 = cVar12;
                f71 = f76;
                cVar3 = cVar14;
            }
            jc.c cVar15 = cVar2;
            jc.c cVar16 = cVar3;
            if (aVar3 == null) {
                i12 = 3;
                i11 = 1;
                jVarArr = new dc.j[]{cVar15, cVar11, cVar16};
            } else {
                i11 = 1;
                i12 = 3;
                jVarArr = new dc.j[]{cVar15, cVar11, cVar16, aVar3};
            }
            dc.j[] jVarArr2 = jVarArr;
            mVar.getClass();
            c2.b bVar4 = new c2.b();
            int i65 = bVar3.b;
            if (i65 < 21 || (i65 & i12) != i11) {
                throw dc.c.a();
            }
            bVar4.b = bVar3;
            try {
                rVar = mVar.e(bVar4);
            } catch (dc.a e11) {
                aVar2 = e11;
                e = null;
                try {
                    bVar4.u();
                    bVar4.c = null;
                    bVar4.d = null;
                    bVar4.a = true;
                    bVar4.t();
                    bVar4.s();
                    bVar = (ec.b) bVar4.b;
                    i13 = 0;
                    while (i13 < bVar.a) {
                        int i66 = i13 + 1;
                        for (int i67 = i66; i67 < bVar.b; i67++) {
                            if (bVar.b(i13, i67) != bVar.b(i67, i13)) {
                                bVar.a(i67, i13);
                                bVar.a(i13, i67);
                            }
                        }
                        i13 = i66;
                    }
                    c2.r e12 = mVar.e(bVar4);
                    e12.h = new rb.b(11);
                    rVar = e12;
                    i14 = rVar.a;
                    if (a6.s((rb.b) rVar.h)) {
                        dc.j jVar = jVarArr2[0];
                        jVarArr2[0] = jVarArr2[2];
                        jVarArr2[2] = jVar;
                    }
                    eVar = new androidx.biometric.e((String) rVar.d, jVarArr2);
                    list = (List) rVar.e;
                    if (list != null) {
                    }
                    str = (String) rVar.f;
                    if (str != null) {
                    }
                    if (i14 >= 0) {
                        eVar.t(dc.i.d, Integer.valueOf(i15));
                        eVar.t(dc.i.e, Integer.valueOf(i14));
                    }
                    eVar.t(dc.i.c, (Integer) rVar.g);
                    eVar.t(dc.i.f, "]Q" + rVar.c);
                    return eVar;
                } catch (dc.a | dc.c unused3) {
                    if (e != null) {
                        throw e;
                    }
                    throw aVar2;
                }
            } catch (dc.c e13) {
                e = e13;
                aVar2 = null;
                bVar4.u();
                bVar4.c = null;
                bVar4.d = null;
                bVar4.a = true;
                bVar4.t();
                bVar4.s();
                bVar = (ec.b) bVar4.b;
                i13 = 0;
                while (i13 < bVar.a) {
                }
                c2.r e122 = mVar.e(bVar4);
                e122.h = new rb.b(11);
                rVar = e122;
                i14 = rVar.a;
                if (a6.s((rb.b) rVar.h)) {
                }
                eVar = new androidx.biometric.e((String) rVar.d, jVarArr2);
                list = (List) rVar.e;
                if (list != null) {
                }
                str = (String) rVar.f;
                if (str != null) {
                }
                if (i14 >= 0) {
                }
                eVar.t(dc.i.c, (Integer) rVar.g);
                eVar.t(dc.i.f, "]Q" + rVar.c);
                return eVar;
            }
            i14 = rVar.a;
            if (a6.s((rb.b) rVar.h) && jVarArr2.length >= 3) {
                dc.j jVar2 = jVarArr2[0];
                jVarArr2[0] = jVarArr2[2];
                jVarArr2[2] = jVar2;
            }
            eVar = new androidx.biometric.e((String) rVar.d, jVarArr2);
            list = (List) rVar.e;
            if (list != null) {
                eVar.t(dc.i.a, list);
            }
            str = (String) rVar.f;
            if (str != null) {
                eVar.t(dc.i.b, str);
            }
            if (i14 >= 0 && (i15 = rVar.b) >= 0) {
                eVar.t(dc.i.d, Integer.valueOf(i15));
                eVar.t(dc.i.e, Integer.valueOf(i14));
            }
            eVar.t(dc.i.c, (Integer) rVar.g);
            eVar.t(dc.i.f, "]Q" + rVar.c);
            return eVar;
        } catch (IllegalArgumentException unused4) {
            throw dc.c.a();
        }
    }

    public synchronized void n() {
        ((SharedPreferences) this.b).edit().clear().commit();
    }

    @Override // ei.zb
    public void o(long j10, boolean z10) {
        r6 r6Var = (r6) this.b;
        if (!z10) {
            r6Var.m(j10);
            return;
        }
        a81 a81Var = r6Var.e;
        if (a81Var != null) {
            a81Var.L(j10, true);
            return;
        }
        if (r6Var.j()) {
            r6Var.E.m(j10, true);
            return;
        }
        a81 a81Var2 = r6Var.y;
        if (a81Var2 != null) {
            a81Var2.L(j10, false);
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        d6.c.h((d6.c) ((d6.j) this.b).c, "joinApplication", task);
    }

    @Override // a3.n0
    public void onFirstFrameRendered() {
        a3.n nVar = (a3.n) this.b;
        Surface surface = nVar.r1;
        if (surface != null) {
            nVar.b1.G(surface);
            nVar.u1 = true;
        }
    }

    @Override // ei.zb
    public void q() {
        r6 r6Var = (r6) this.b;
        r6Var.s(null, null, true);
        vb vbVar = ((jb) r6Var).C0;
        jb jbVar = vbVar.X0;
        if (jbVar != null) {
            jbVar.s(null, null, true);
        }
        xa xaVar = vbVar.v1;
        if (xaVar != null) {
            xaVar.p0();
        }
        lb lbVar = vbVar.c1;
        if (lbVar != null) {
            lbVar.setHasRoundVideo(false);
        }
        a8 a8Var = vbVar.K1;
        if (a8Var != null) {
            File file = a8Var.o0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                vbVar.K1.o0 = null;
            }
            if (vbVar.K1.p0 != null) {
                try {
                    new File(vbVar.K1.p0).delete();
                } catch (Exception unused2) {
                }
                vbVar.K1.p0 = null;
            }
        }
    }

    @Override // mg.o
    public void r() {
        ((ei.j0) this.b).d.invalidate();
    }

    @Override // ei.zb
    public void t(float f7) {
        r6 r6Var = (r6) this.b;
        a8 a8Var = r6Var.d;
        if (a8Var == null) {
            return;
        }
        a8Var.s0 = f7;
        a8Var.j = true;
        r6Var.y(true);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        JSONObject jSONObject;
        FileWriter fileWriter;
        ea.b bVar = (ea.b) this.b;
        d9.l lVar = (d9.l) bVar.f;
        ea.d dVar = (ea.d) bVar.b;
        String str = lVar.a;
        FileWriter fileWriter2 = null;
        try {
            HashMap c10 = d9.l.c(dVar);
            androidx.biometric.e eVar = new androidx.biometric.e(str, c10);
            eVar.s("User-Agent", "Crashlytics Android SDK/18.6.0");
            eVar.s("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
            d9.l.b(eVar, dVar);
            String str2 = "Requesting settings from " + str;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
            String str3 = "Settings query params were: " + c10;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str3, null);
            }
            jSONObject = lVar.d(eVar.l());
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "Settings request failed.", e);
            jSONObject = null;
        }
        if (jSONObject != null) {
            ea.a M = ((ag.b) bVar.c).M(jSONObject);
            m mVar = (m) bVar.e;
            long j10 = M.c;
            mVar.getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                jSONObject.put("expires_at", j10);
                fileWriter = new FileWriter((File) mVar.b);
                try {
                    try {
                        fileWriter.write(jSONObject.toString());
                        fileWriter.flush();
                    } catch (Exception e7) {
                        e = e7;
                        Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                        x9.h.c(fileWriter, "Failed to close settings writer.");
                        ea.b.f("Loaded settings: ", jSONObject);
                        String str4 = dVar.f;
                        SharedPreferences.Editor edit = ((Context) bVar.a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                        edit.putString("existing_instance_identifier", str4);
                        edit.apply();
                        ((AtomicReference) bVar.h).set(M);
                        ((TaskCompletionSource) ((AtomicReference) bVar.i).get()).trySetResult(M);
                        return Tasks.forResult(null);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileWriter2 = fileWriter;
                    x9.h.c(fileWriter2, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e10) {
                e = e10;
                fileWriter = null;
            } catch (Throwable th3) {
                th = th3;
                x9.h.c(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
            x9.h.c(fileWriter, "Failed to close settings writer.");
            ea.b.f("Loaded settings: ", jSONObject);
            String str42 = dVar.f;
            SharedPreferences.Editor edit2 = ((Context) bVar.a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            edit2.putString("existing_instance_identifier", str42);
            edit2.apply();
            ((AtomicReference) bVar.h).set(M);
            ((TaskCompletionSource) ((AtomicReference) bVar.i).get()).trySetResult(M);
        }
        return Tasks.forResult(null);
    }

    @Override // l.w
    public boolean u(l.k kVar) {
        Window.Callback callback;
        g.r rVar = (g.r) this.b;
        if (kVar != kVar.k() || !rVar.O || (callback = rVar.f.getCallback()) == null || rVar.Z) {
            return true;
        }
        callback.onMenuOpened(108, kVar);
        return true;
    }

    public StringBuilder v() {
        ff.a aVar = (ff.a) this.b;
        if (!(aVar instanceof af.r)) {
            return null;
        }
        StringBuilder sb2 = ((af.r) aVar).b.b;
        if (sb2.length() == 0) {
            return null;
        }
        return sb2;
    }

    @Override // ei.zb
    public void w(boolean z10) {
        r6 r6Var = (r6) this.b;
        if (r6Var.j()) {
            r6Var.E.getClass();
        }
        r6Var.x(-4, z10);
    }

    @Override // ei.zb
    public void x(float f7, int i10) {
        ArrayList arrayList;
        r6 r6Var = (r6) this.b;
        a8 a8Var = r6Var.d;
        if (a8Var == null || (arrayList = a8Var.T) == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        ((a8) r6Var.d.T.get(i10)).P = f7;
    }

    @Override // hg.z1
    public /* synthetic */ a0.h y() {
        return null;
    }

    @Override // ei.zb
    public void z(float f7) {
        r6 r6Var = (r6) this.b;
        a8 a8Var = r6Var.d;
        if (a8Var == null) {
            return;
        }
        a8Var.P = f7;
        r6Var.c();
    }

    public /* synthetic */ i(ya.c cVar) {
        this.a = 9;
        this.b = (com.google.android.gms.internal.play_billing.r) cVar.b;
    }

    public i(Context context, int i10) {
        boolean isEmpty;
        String d;
        this.a = i10;
        switch (i10) {
            case 13:
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
                this.b = sharedPreferences;
                File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
                if (file.exists()) {
                    return;
                }
                try {
                    if (file.createNewFile()) {
                        synchronized (this) {
                            isEmpty = sharedPreferences.getAll().isEmpty();
                        }
                        if (isEmpty) {
                            return;
                        }
                        Log.i("FirebaseMessaging", "App restored, clearing state");
                        n();
                        return;
                    }
                    return;
                } catch (IOException e) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e.getMessage());
                        return;
                    }
                    return;
                }
            default:
                b a2 = b.a(context);
                this.b = a2;
                a2.b();
                String d10 = a2.d("defaultGoogleSignInAccount");
                if (TextUtils.isEmpty(d10) || (d = a2.d(b.f("googleSignInOptions", d10))) == null) {
                    return;
                }
                try {
                    GoogleSignInOptions.b(d);
                    return;
                } catch (JSONException unused) {
                    return;
                }
        }
    }

    public i(MediaInfo mediaInfo) {
        this.a = 10;
        c6.o oVar = new c6.o(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        if (mediaInfo != null) {
            this.b = oVar;
            return;
        }
        throw new IllegalArgumentException("media cannot be null.");
    }

    private final /* synthetic */ void p() {
    }

    private final /* synthetic */ void s() {
    }

    @Override // mg.o
    public void V() {
    }

    @Override // mg.o
    public void D(boolean z10) {
    }

    @Override // mg.o
    public void R(boolean z10) {
    }

    @Override // hg.z1
    public /* synthetic */ void Y(ArrayList arrayList) {
    }

    @Override // a3.n0
    public void onVideoSizeChanged(a2 a2Var) {
    }

    public i(JSONObject jSONObject) {
        this.a = 10;
        this.b = new c6.o(jSONObject);
    }

    public i(int i10) {
        this.a = i10;
        switch (i10) {
            case 23:
                this.b = new m(28);
                break;
            case 24:
                break;
            default:
                this.b = new LinkedHashMap(0, 0.75f, true);
                break;
        }
    }
}
