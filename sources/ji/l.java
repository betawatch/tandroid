package ji;

import a8.ja;
import a8.la;
import a8.p0;
import a8.u7;
import ai.d2;
import ai.f2;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Parcel;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import bi.t3;
import c8.t9;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.o0;
import e2.t0;
import h2.k0;
import h2.l0;
import h2.x;
import hi.wa;
import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m4.a0;
import m4.b0;
import m4.d0;
import m4.f0;
import m9.y;
import oi.e1;
import oi.f1;
import oi.h0;
import oi.i0;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.le;
import org.telegram.messenger.ls;
import org.telegram.messenger.lz;
import org.telegram.messenger.mr;
import org.telegram.messenger.ni;
import org.telegram.messenger.np;
import org.telegram.messenger.nz;
import org.telegram.messenger.si;
import org.telegram.messenger.wr;
import org.telegram.messenger.ys;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.u;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.Cells.i4;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.an0;
import org.telegram.ui.Components.fe0;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.hb0;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.qf;
import org.telegram.ui.Components.qo;
import org.telegram.ui.Components.qw0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.au;
import org.telegram.ui.bn;
import org.telegram.ui.d8;
import org.telegram.ui.f8;
import org.telegram.ui.fx;
import org.telegram.ui.fz0;
import org.telegram.ui.h5;
import org.telegram.ui.h7;
import org.telegram.ui.i8;
import org.telegram.ui.j4;
import org.telegram.ui.jx0;
import org.telegram.ui.kx;
import org.telegram.ui.md0;
import org.telegram.ui.mz0;
import org.telegram.ui.r6;
import org.telegram.ui.zt;
import org.xml.sax.Attributes;
import q4.t;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class l implements d2, c4.m, a0, Continuation, com.google.android.gms.common.api.internal.q, e1, an0, mr, qo, wa, h7, tj0, g61, h2.d, q5.b, te.b {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ l(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    public static l2.c I(l2.c cVar, List list) {
        cVar.getClass();
        Map map = cVar.a;
        HashMap hashMap = new HashMap(map);
        HashSet hashSet = new HashSet(list);
        for (String str : map.keySet()) {
            if (!hashSet.contains(str)) {
                hashMap.remove(str);
            }
        }
        return new l2.c(hashMap);
    }

    public static l K(int i7, boolean z10, byte[] bArr, byte[] bArr2) {
        l lVar = new l(10, false);
        if (bArr == null || bArr.length == 0) {
            lVar.c = null;
            lVar.b = null;
            return lVar;
        }
        int i10 = z10 ? 8 : 0;
        if (i7 != 1) {
            if (i7 != 2) {
                return lVar;
            }
            SerializedData serializedData = new SerializedData();
            serializedData.writeBytes(bArr2, 0, 16);
            serializedData.writeBytes(bArr, i10, 36);
            byte[] byteArray = serializedData.toByteArray();
            Pattern pattern = Utilities.a;
            byte[] o4 = Utilities.o(byteArray.length, byteArray);
            serializedData.cleanup();
            SerializedData serializedData2 = new SerializedData();
            serializedData2.writeBytes(bArr, i10 + 40, 36);
            serializedData2.writeBytes(bArr2, 0, 16);
            byte[] o10 = Utilities.o(r9.length, serializedData2.toByteArray());
            serializedData2.cleanup();
            SerializedData serializedData3 = new SerializedData();
            serializedData3.writeBytes(o4, 0, 8);
            serializedData3.writeBytes(o10, 8, 16);
            serializedData3.writeBytes(o4, 24, 8);
            lVar.b = serializedData3.toByteArray();
            serializedData3.cleanup();
            SerializedData serializedData4 = new SerializedData();
            serializedData4.writeBytes(o10, 0, 8);
            serializedData4.writeBytes(o4, 8, 16);
            serializedData4.writeBytes(o10, 24, 8);
            lVar.c = serializedData4.toByteArray();
            serializedData4.cleanup();
            return lVar;
        }
        SerializedData serializedData5 = new SerializedData();
        serializedData5.writeBytes(bArr2);
        serializedData5.writeBytes(bArr, i10, 32);
        byte[] n10 = Utilities.n(serializedData5.toByteArray());
        serializedData5.cleanup();
        SerializedData serializedData6 = new SerializedData();
        serializedData6.writeBytes(bArr, i10 + 32, 16);
        serializedData6.writeBytes(bArr2);
        serializedData6.writeBytes(bArr, i10 + 48, 16);
        byte[] n11 = Utilities.n(serializedData6.toByteArray());
        serializedData6.cleanup();
        SerializedData serializedData7 = new SerializedData();
        serializedData7.writeBytes(bArr, i10 + 64, 32);
        serializedData7.writeBytes(bArr2);
        byte[] n12 = Utilities.n(serializedData7.toByteArray());
        serializedData7.cleanup();
        SerializedData serializedData8 = new SerializedData();
        serializedData8.writeBytes(bArr2);
        serializedData8.writeBytes(bArr, i10 + 96, 32);
        byte[] n13 = Utilities.n(serializedData8.toByteArray());
        serializedData8.cleanup();
        SerializedData serializedData9 = new SerializedData();
        serializedData9.writeBytes(n10, 0, 8);
        serializedData9.writeBytes(n11, 8, 12);
        serializedData9.writeBytes(n12, 4, 12);
        lVar.b = serializedData9.toByteArray();
        serializedData9.cleanup();
        SerializedData serializedData10 = new SerializedData();
        serializedData10.writeBytes(n10, 8, 12);
        serializedData10.writeBytes(n11, 0, 8);
        serializedData10.writeBytes(n12, 16, 4);
        serializedData10.writeBytes(n13, 0, 8);
        lVar.c = serializedData10.toByteArray();
        serializedData10.cleanup();
        return lVar;
    }

    public static void z(l lVar, l2.c cVar) {
        lVar.getClass();
        for (Map.Entry entry : new HashMap((HashMap) lVar.b).entrySet()) {
            if (entry.getKey() != null) {
                throw new ClassCastException();
            }
            List list = (List) entry.getValue();
            if (!I(cVar, list).equals(I((l2.c) lVar.c, list))) {
                throw null;
            }
        }
        lVar.c = cVar;
    }

    @Override // oi.e1
    public void A(int i7, int i10) {
        ((h0) this.b).l1(i7, i10);
    }

    @Override // org.telegram.ui.Components.qo
    public void B(int i7) {
        bn bnVar = (bn) this.c;
        ((a70) this.b).v();
        if (i7 != 0) {
            bnVar.getNotificationsController().H(bnVar.l6, i7, bnVar.d());
            if (lc.a(bnVar)) {
                lc.z(bnVar, 5, i7, bnVar.getResourceProvider()).j();
                return;
            }
            return;
        }
        if (bnVar.getMessagesController().u2(bnVar.l6, bnVar.d(), null)) {
            bnVar.Ic(true);
        }
        if (lc.a(bnVar)) {
            lc.z(bnVar, 4, i7, bnVar.getResourceProvider()).j();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    @Override // te.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void D(float f10, int i7) {
        boolean z10;
        rh.h hVar = (rh.h) this.c;
        boolean z11 = true;
        if ((hVar.c() == 0.0f && hVar.s == 2) || hVar.s == 3) {
            hVar.s = 1;
            z10 = true;
        } else {
            z10 = false;
        }
        if (f10 == 1.0f) {
            int i10 = hVar.x;
            int i11 = hVar.w;
            if (i10 != i11) {
                hVar.x = i11;
                if (z11) {
                    ((Runnable) this.b).run();
                }
                hVar.a();
            }
        }
        z11 = z10;
        if (z11) {
        }
        hVar.a();
    }

    public void E(Object obj, String str) {
        int length = str.length();
        String valueOf = String.valueOf(obj);
        ((ArrayList) this.b).add(p5.c.m(str, "=", valueOf, new StringBuilder(length + 1 + valueOf.length())));
    }

    @Override // oi.e1
    public /* synthetic */ boolean E1(boolean z10) {
        return false;
    }

    public boolean G(int i7) {
        return ((e2.s) this.b).a.get(i7);
    }

    @Override // te.b
    public void H(int i7, float f10, float f11, te.c cVar) {
        rh.h hVar = (rh.h) this.c;
        hVar.c.a(f10);
        hVar.d.a(f10);
        hVar.b.a(f10);
        ((Runnable) this.b).run();
    }

    @Override // oi.e1
    public /* synthetic */ boolean J(f1 f1Var) {
        return false;
    }

    public String L(String str) {
        ArrayList arrayList = (ArrayList) this.b;
        String str2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                str2 = (String) ((lz) arrayList.get(i7)).a.get(str);
                if (str2 != null) {
                    break;
                }
            }
        }
        return str2 == null ? nz.l(str, (Attributes) this.c) : str2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0080, code lost:
    
        if (r5.equals("red") == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Integer N(String str) {
        String L = L(str);
        if (L == null) {
            return null;
        }
        char c10 = 1;
        try {
            return Integer.valueOf(Integer.parseInt(L.substring(1), 16));
        } catch (NumberFormatException unused) {
            double[] dArr = nz.a;
            String lowerCase = L.toLowerCase();
            lowerCase.getClass();
            switch (lowerCase.hashCode()) {
                case -734239628:
                    if (lowerCase.equals("yellow")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 112785:
                    break;
                case 3027034:
                    if (lowerCase.equals("blue")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3068707:
                    if (lowerCase.equals("cyan")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3181155:
                    if (lowerCase.equals("gray")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 93818879:
                    if (lowerCase.equals("black")) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 98619139:
                    if (lowerCase.equals("green")) {
                        c10 = 6;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 113101865:
                    if (lowerCase.equals("white")) {
                        c10 = 7;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 828922025:
                    if (lowerCase.equals("magenta")) {
                        c10 = '\b';
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            switch (c10) {
                case 0:
                    return -256;
                case 1:
                    return -65536;
                case 2:
                    return -16776961;
                case 3:
                    return -16711681;
                case 4:
                    return -7829368;
                case 5:
                    return -16777216;
                case 6:
                    return -16711936;
                case 7:
                    return -1;
                case '\b':
                    return -65281;
                default:
                    return null;
            }
        }
    }

    @Override // h2.d
    public y O(o0 o0Var) {
        y O = ((h2.d) this.b).O(o0Var);
        if (O == null) {
            return null;
        }
        return t9.c(O, new u(this, 18));
    }

    public boolean P(t tVar, String str) {
        Context context = (Context) this.b;
        int i7 = tVar.b;
        return i7 < 0 ? context.getPackageManager().checkPermission(str, tVar.a) == 0 : context.checkPermission(str, i7, tVar.c) == 0;
    }

    public void Q(long j3, byte[] bArr) {
        e0.g gVar = (e0.g) this.c;
        if (gVar.b) {
            gVar.b = false;
            ((yi.j) gVar.e).h();
            return;
        }
        yi.j jVar = (yi.j) gVar.e;
        jVar.getClass();
        yi.j.q();
        yi.h hVar = jVar.z;
        File file = (jVar.G != 5 || hVar == null) ? null : hVar.b;
        if (file == null) {
            le leVar = (le) this.b;
            IllegalStateException illegalStateException = new IllegalStateException("Preview file is unavailable");
            MediaController mediaController = leVar.a;
            String[] strArr = MediaController.W1;
            a8.e("AudioRecorderV2 failed", illegalStateException);
            ls.f(mediaController.i1).k(ls.m2, Integer.valueOf(mediaController.h1));
            mediaController.x(false);
            return;
        }
        MediaController mediaController2 = ((le) this.b).a;
        mediaController2.k1 = file;
        mediaController2.l1 = j3;
        mediaController2.G0(file, j3, bArr);
        si.d0(mediaController2.i1).F1(mediaController2.n1, mediaController2.o1, ni.a(mediaController2, file.getAbsolutePath(), mediaController2.K1));
        ls.f(mediaController2.i1).k(ls.o2, new Object[0]);
        ls.f(mediaController2.i1).k(ls.s2, Integer.valueOf(mediaController2.h1), mediaController2.g1, file.getAbsolutePath());
        mediaController2.Y(false);
        MediaController.j0(false);
    }

    public int R(Context context, com.google.android.gms.common.api.c cVar) {
        q6.m.h(context);
        q6.m.h(cVar);
        int i7 = 0;
        if (!cVar.c()) {
            return 0;
        }
        int d = cVar.d();
        int S = S(d);
        if (S != -1) {
            return S;
        }
        SparseIntArray sparseIntArray = (SparseIntArray) this.b;
        synchronized (sparseIntArray) {
            int i10 = 0;
            while (true) {
                try {
                    if (i10 >= sparseIntArray.size()) {
                        i7 = -1;
                        break;
                    }
                    int keyAt = sparseIntArray.keyAt(i10);
                    if (keyAt > d && sparseIntArray.get(keyAt) == 0) {
                        break;
                    }
                    i10++;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (i7 == -1) {
                i7 = ((n6.e) this.c).d(context, d);
            }
            sparseIntArray.put(d, i7);
        }
        return i7;
    }

    public int S(int i7) {
        int i10;
        SparseIntArray sparseIntArray = (SparseIntArray) this.b;
        synchronized (sparseIntArray) {
            i10 = sparseIntArray.get(i7, -1);
        }
        return i10;
    }

    @Override // ai.d2
    public void a(String str, String str2) {
        o oVar = (o) this.c;
        f2 f2Var = (f2) this.b;
        if (!oVar.J) {
            if (f2Var == oVar.f) {
                oVar.a(str, str2);
                return;
            }
            return;
        }
        if (f2Var == oVar.U) {
            oVar.U = null;
            if (!str.isEmpty()) {
                oVar.u(f2Var, str);
            }
            oVar.e();
            Log.d("VoiceLive", "field: final words in (" + oVar.L.size() + " words)");
            oVar.o();
            return;
        }
        if (f2Var != oVar.f) {
            return;
        }
        Log.d("VoiceLive", "field: recogniser ended by itself error=" + str2);
        if (!str.isEmpty()) {
            oVar.u(f2Var, str);
        }
        oVar.f = null;
        if (wr.k == oVar) {
            wr.k = null;
        }
        oVar.d = null;
        oVar.e = null;
        oVar.e();
        oVar.o();
    }

    @Override // com.google.android.gms.common.api.internal.q
    public void accept(Object obj, Object obj2) {
        int i7;
        o7.d dVar = (o7.d) this.b;
        o7.b bVar = (o7.b) obj;
        e7.b bVar2 = new e7.b(dVar, (TaskCompletionSource) obj2);
        Context context = dVar.a;
        try {
            i7 = z6.b.a(context).b(0, context.getPackageName()).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            i7 = 0;
        }
        m6.b bVar3 = (m6.b) this.c;
        bVar3.f = i7;
        o7.c cVar = (o7.c) bVar.n();
        com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true), true);
        gVar.c = false;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.cloudmessaging.internal.ICloudMessagingService");
        int i10 = o7.a.a;
        obtain.writeStrongBinder(bVar2);
        obtain.writeInt(1);
        bVar3.writeToParcel(obtain, 0);
        obtain.writeInt(1);
        gVar.writeToParcel(obtain, 0);
        Parcel obtain2 = Parcel.obtain();
        try {
            cVar.a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override // oi.e1
    public void b1(CharSequence charSequence) {
        ((h0) this.b).S0(charSequence);
    }

    @Override // m4.a0
    public void c(x xVar) {
        d0 d0Var = (d0) this.c;
        SparseArray sparseArray = d0Var.h;
        d4.f fVar = (d4.f) this.b;
        if (xVar.A() == 0 && (xVar.A() & 128) != 0) {
            xVar.O(6);
            int a10 = xVar.a() / 4;
            for (int i7 = 0; i7 < a10; i7++) {
                xVar.k(0, 4, (byte[]) fVar.b);
                fVar.J(0);
                int j3 = fVar.j(16);
                fVar.L(3);
                if (j3 == 0) {
                    fVar.L(13);
                } else {
                    int j10 = fVar.j(13);
                    if (sparseArray.get(j10) == null) {
                        sparseArray.put(j10, new b0(new a4.k(d0Var, j10)));
                        d0Var.n++;
                    }
                }
            }
            if (d0Var.a != 2) {
                sparseArray.remove(0);
            }
        }
    }

    @Override // org.telegram.messenger.mr
    public void d(boolean z10) {
        f8 f8Var = ((d8) this.c).b;
        f8Var.y.finishFragment();
        bn bnVar = (bn) this.b;
        i8 i8Var = f8Var.y;
        bnVar.j8(i8Var.Q, i8Var.R + 86400, z10);
    }

    @Override // oi.e1
    public /* synthetic */ boolean d2(f1 f1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.qo
    public void dismiss() {
        switch (this.a) {
            case 14:
                ((a70) this.b).v();
                break;
            default:
                ((au) this.c).dismiss();
                break;
        }
    }

    @Override // oi.e1
    public void e(f1 f1Var) {
        ((h0) this.b).e(f1Var);
    }

    @Override // org.telegram.ui.Components.tj0
    public boolean f(float f10, float f11, int i7, View view) {
        Rect rect = (Rect) this.b;
        kx kxVar = (kx) this.c;
        int i10 = 0;
        if (kxVar.getParentActivity() != null && (view instanceof i4)) {
            ((ImageView) view.getTag(R.id.object_tag)).getHitRect(rect);
            if (!rect.contains((int) f10, (int) f11)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kxVar.getParentActivity());
                alertDialog$Builder.f(new CharSequence[]{hd.N0(2131751586, null)}, new fx(this, i7, i10));
                kxVar.showDialog(alertDialog$Builder.a);
                return true;
            }
        }
        return false;
    }

    @Override // hi.wa
    public void g0(boolean z10, float f10) {
        hb0 hb0Var = (hb0) this.b;
        fe0 fe0Var = (fe0) this.c;
        i61 i61Var = fe0Var.d;
        if (i61Var == null) {
            return;
        }
        float max = 2.8f / Math.max(60L, r2);
        long U = (long) ((((f10 / (1.0f - max)) * max) + f10) * i61Var.U());
        fe0Var.e = U;
        fe0Var.d.q0(U, !z10);
        if (z10) {
            return;
        }
        g0.r(hb0Var);
        g0.h3(hb0Var, 120L);
    }

    @Override // fd.a
    public Object get() {
        return new p5.e((Context) ((e.a) this.b).a, (md0) ((qf) this.c).get());
    }

    @Override // org.telegram.ui.Components.an0
    public /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // ai.d2
    public void h(float f10) {
        f2 f2Var = (f2) this.b;
        o oVar = (o) this.c;
        if (f2Var == oVar.f) {
            oVar.h(f10);
        }
    }

    @Override // ai.d2
    public void i(String str) {
        o.b((o) this.c, (f2) this.b, str, -1);
    }

    @Override // ai.d2
    public void l(int i7, String str) {
        o.b((o) this.c, (f2) this.b, str, i7);
    }

    @Override // org.telegram.ui.h7
    public void m(r6 r6Var, ei.b bVar, boolean z10) {
        au auVar = (au) this.c;
        zt ztVar = auVar.T1;
        if (bVar != null) {
            ((ei.c) this.b).i(bVar);
            auVar.a2.e();
            ei.c cVar = auVar.c2;
            qw0[] qw0VarArr = auVar.X1;
            org.telegram.ui.Cells.d2[] d2VarArr = auVar.Y1;
            org.telegram.ui.Cells.d2 d2Var = d2VarArr[0];
            if (d2Var != null) {
                qw0 qw0Var = qw0VarArr[0];
                boolean z11 = cVar.m;
                qw0Var.c = z11;
                d2Var.c(z11, true);
            }
            org.telegram.ui.Cells.d2 d2Var2 = d2VarArr[1];
            if (d2Var2 != null) {
                qw0 qw0Var2 = qw0VarArr[1];
                boolean z12 = cVar.n;
                qw0Var2.c = z12;
                d2Var2.c(z12, true);
            }
            org.telegram.ui.Cells.d2 d2Var3 = d2VarArr[2];
            if (d2Var3 != null) {
                qw0 qw0Var3 = qw0VarArr[2];
                boolean z13 = cVar.o;
                qw0Var3.c = z13;
                d2Var3.c(z13, true);
            }
            org.telegram.ui.Cells.d2 d2Var4 = d2VarArr[3];
            if (d2Var4 != null) {
                qw0 qw0Var4 = qw0VarArr[3];
                boolean z14 = cVar.p;
                qw0Var4.c = z14;
                d2Var4.c(z14, true);
            }
            org.telegram.ui.Cells.d2 d2Var5 = d2VarArr[4];
            if (d2Var5 != null) {
                qw0 qw0Var5 = qw0VarArr[4];
                boolean z15 = cVar.q;
                qw0Var5.c = z15;
                d2Var5.c(z15, true);
            }
            auVar.W1.a(ztVar.d(), true);
            ztVar.c(true);
        }
    }

    @Override // org.telegram.ui.Components.an0
    public void n(boolean z10, float f10) {
        ((TextView) this.b).setText("Alpha " + h5.p1);
        h5.p1 = f10;
        ((h5) this.c).m1.K();
    }

    @Override // oi.e1
    public boolean o() {
        return ((h0) this.b).g1();
    }

    @Override // org.telegram.ui.Components.g61
    public void onError(i61 i61Var, Exception exc) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
        int i7 = secretMediaViewer.a0;
        if (i7 <= 0) {
            a8.g(exc, true);
            return;
        }
        secretMediaViewer.a0 = i7 - 1;
        g0.h3(new mz0(0, this, (File) this.b), 100L);
    }

    @Override // org.telegram.ui.Components.g61
    public /* synthetic */ void onRenderedFirstFrame(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.g61
    public void onStateChanged(boolean z10, int i7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
        fz0 fz0Var = secretMediaViewer.h1;
        if (secretMediaViewer.E == null || secretMediaViewer.g0 == null) {
            return;
        }
        g0.r(fz0Var);
        g0.g3(fz0Var);
        if (i7 == 4 || i7 == 1) {
            try {
                secretMediaViewer.b.getWindow().clearFlags(128);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        } else {
            try {
                secretMediaViewer.b.getWindow().addFlags(128);
            } catch (Exception e11) {
                a8.g(e11, true);
            }
        }
        if (i7 == 3 && secretMediaViewer.x.getVisibility() != 0) {
            secretMediaViewer.x.setVisibility(0);
        }
        if (secretMediaViewer.E.d0() && i7 != 4) {
            if (secretMediaViewer.F) {
                return;
            }
            secretMediaViewer.F = true;
        } else if (secretMediaViewer.F) {
            secretMediaViewer.F = false;
            if (i7 == 4) {
                secretMediaViewer.I = true;
                if (secretMediaViewer.J) {
                    secretMediaViewer.e(true, !secretMediaViewer.p1);
                } else {
                    secretMediaViewer.E.q0(0L, false);
                    secretMediaViewer.E.h0();
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.g61
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.g61
    public void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
        j4 j4Var = ((SecretMediaViewer) this.c).x;
        if (j4Var != null) {
            j4Var.a(i10 == 0 ? 1.0f : (i7 * f10) / i10, 0);
        }
    }

    @Override // c4.m
    public /* synthetic */ c4.d q(int i7, int i10, byte[] bArr) {
        return p0.a(this, bArr, i10);
    }

    @Override // org.telegram.ui.Components.an0
    public /* synthetic */ int r0() {
        return 0;
    }

    @Override // oi.e1
    public void r1(f1 f1Var, int i7, int i10) {
        j9 P0;
        h0 h0Var = (h0) this.b;
        if (((i0) this.c).d || i7 == i10 || (P0 = h0Var.P0()) == null) {
            return;
        }
        if (P0.x() && P0.W == h0Var.a1()) {
            return;
        }
        f1Var.post(new t3(this, f1Var, i10, P0, h0Var, i7));
    }

    @Override // org.telegram.ui.Components.qo
    public void s() {
        ((a70) this.b).v();
        bn bnVar = (bn) this.c;
        bnVar.Ic(true);
        lc.A(bnVar, bnVar.getMessagesController().u2(bnVar.l6, bnVar.d(), null), bnVar.Ba).j();
    }

    @Override // oi.e1
    public void s1(Editable editable) {
        ((i0) this.c).i();
        ((h0) this.b).u1();
    }

    @Override // h2.d
    public y t0(byte[] bArr) {
        return t9.c(((h2.d) this.b).t0(bArr), new u(this, 18));
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        m6.c cVar = (m6.c) this.b;
        Bundle bundle = (Bundle) this.c;
        cVar.getClass();
        if (!task.isSuccessful()) {
            return task;
        }
        Bundle bundle2 = (Bundle) task.getResult();
        return (bundle2 == null || !bundle2.containsKey("google.messenger")) ? task : cVar.d(bundle).onSuccessTask(m6.d.b, w7.s.c);
    }

    public String toString() {
        switch (this.a) {
            case 24:
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append(this.c.getClass().getSimpleName());
                sb2.append('{');
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    sb2.append((String) arrayList.get(i7));
                    if (i7 < size - 1) {
                        sb2.append(", ");
                    }
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    @Override // org.telegram.ui.Components.qo
    public void u() {
        ((a70) this.b).v();
        bn bnVar = (bn) this.c;
        if (bnVar.l6 == 0 || bnVar.g4 == 3) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", bnVar.l6);
        if (bnVar.d() != 0) {
            bundle.putLong("topic_id", bnVar.d());
        }
        bnVar.presentFragment(new jx0(bundle, bnVar.Ba));
    }

    /* JADX WARN: Code restructure failed: missing block: B:195:0x03a5, code lost:
    
        r0.addAll(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0116, code lost:
    
        if (")".equals(l4.a.b(r11, r6)) == false) goto L37;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.util.regex.Matcher] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34, types: [int] */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r4v32, types: [java.util.regex.Matcher] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    /* JADX WARN: Type inference failed for: r9v3 */
    @Override // c4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void v(byte[] bArr, int i7, int i10, c4.l lVar, h2.j jVar) {
        l4.c cVar;
        String str;
        ?? r12;
        String sb2;
        int i11;
        char c10;
        l lVar2 = this;
        x xVar = (x) lVar2.b;
        xVar.L(i7 + i10, bArr);
        xVar.N(i7);
        ArrayList arrayList = new ArrayList();
        try {
            l4.i.d(xVar);
            while (!TextUtils.isEmpty(xVar.n(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                boolean z10 = false;
                int i12 = -1;
                int i13 = 0;
                char c11 = 65535;
                while (true) {
                    ?? r92 = 1;
                    if (c11 == 65535) {
                        i13 = xVar.b;
                        String n10 = xVar.n(StandardCharsets.UTF_8);
                        c11 = n10 == null ? (char) 0 : "STYLE".equals(n10) ? (char) 2 : n10.startsWith("NOTE") ? (char) 1 : (char) 3;
                    } else {
                        xVar.N(i13);
                        if (c11 == 0) {
                            u7.b(new h6.m(arrayList2), lVar, jVar);
                            return;
                        }
                        if (c11 == 1) {
                            while (!TextUtils.isEmpty(xVar.n(StandardCharsets.UTF_8))) {
                            }
                        } else {
                            String str2 = null;
                            if (c11 == 2) {
                                if (!arrayList2.isEmpty()) {
                                    throw new IllegalArgumentException("A style block was found after the first cue.");
                                }
                                xVar.n(StandardCharsets.UTF_8);
                                l4.a aVar = (l4.a) lVar2.c;
                                x xVar2 = aVar.a;
                                StringBuilder sb3 = aVar.b;
                                sb3.setLength(0);
                                int i14 = xVar.b;
                                while (!TextUtils.isEmpty(xVar.n(StandardCharsets.UTF_8))) {
                                }
                                xVar2.L(xVar.b, xVar.a);
                                xVar2.N(i14);
                                ArrayList arrayList3 = new ArrayList();
                                while (true) {
                                    l4.a.c(xVar2);
                                    if (xVar2.a() >= 5 && "::cue".equals(xVar2.y(5, StandardCharsets.UTF_8))) {
                                        int i15 = xVar2.b;
                                        String b10 = l4.a.b(xVar2, sb3);
                                        if (b10 != null) {
                                            if ("{".equals(b10)) {
                                                xVar2.N(i15);
                                                str = "";
                                            } else if ("(".equals(b10)) {
                                                int i16 = xVar2.b;
                                                int i17 = xVar2.c;
                                                boolean z11 = z10 ? 1 : 0;
                                                while (i16 < i17 && z11 == 0) {
                                                    int i18 = i16 + 1;
                                                    z11 = ((char) xVar2.a[i16]) == ')' ? r92 : z10 ? 1 : 0;
                                                    i16 = i18;
                                                }
                                                str = xVar2.y((i16 - 1) - xVar2.b, StandardCharsets.UTF_8).trim();
                                            } else {
                                                str = str2;
                                            }
                                            if (str == null && "{".equals(l4.a.b(xVar2, sb3))) {
                                                l4.b bVar = new l4.b();
                                                bVar.a = "";
                                                bVar.b = "";
                                                bVar.c = Collections.EMPTY_SET;
                                                bVar.d = "";
                                                bVar.e = str2;
                                                bVar.g = z10;
                                                bVar.i = z10;
                                                bVar.j = i12;
                                                bVar.k = i12;
                                                bVar.l = i12;
                                                bVar.m = i12;
                                                bVar.n = i12;
                                                bVar.p = i12;
                                                bVar.q = z10;
                                                if (!str.isEmpty()) {
                                                    int indexOf = str.indexOf(91);
                                                    if (indexOf != i12) {
                                                        ?? matcher = l4.a.c.matcher(str.substring(indexOf));
                                                        if (matcher.matches()) {
                                                            String group = matcher.group(r92);
                                                            group.getClass();
                                                            bVar.d = group;
                                                        }
                                                        str = str.substring(z10 ? 1 : 0, indexOf);
                                                    }
                                                    String str3 = l0.a;
                                                    String[] split = str.split("\\.", i12);
                                                    String str4 = split[z10 ? 1 : 0];
                                                    int indexOf2 = str4.indexOf(35);
                                                    if (indexOf2 != i12) {
                                                        bVar.b = str4.substring(z10 ? 1 : 0, indexOf2);
                                                        bVar.a = str4.substring(indexOf2 + 1);
                                                    } else {
                                                        bVar.b = str4;
                                                    }
                                                    if (split.length > r92) {
                                                        int length = split.length;
                                                        la.f(length <= split.length ? r92 : z10 ? 1 : 0);
                                                        bVar.c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(split, (int) r92, length)));
                                                    }
                                                }
                                                boolean z12 = z10 ? 1 : 0;
                                                String str5 = str2;
                                                boolean z13 = r92;
                                                while (z12 == 0) {
                                                    int i19 = xVar2.b;
                                                    str5 = l4.a.b(xVar2, sb3);
                                                    boolean z14 = (str5 == null || "}".equals(str5)) ? z13 : z10;
                                                    if (z14 == 0) {
                                                        xVar2.N(i19);
                                                        l4.a.c(xVar2);
                                                        String a10 = l4.a.a(xVar2, sb3);
                                                        if (!a10.isEmpty() && ":".equals(l4.a.b(xVar2, sb3))) {
                                                            l4.a.c(xVar2);
                                                            StringBuilder sb4 = new StringBuilder();
                                                            boolean z15 = false;
                                                            while (true) {
                                                                if (z15) {
                                                                    sb2 = sb4.toString();
                                                                } else {
                                                                    int i20 = xVar2.b;
                                                                    String b11 = l4.a.b(xVar2, sb3);
                                                                    if (b11 == null) {
                                                                        sb2 = null;
                                                                    } else if ("}".equals(b11) || ";".equals(b11)) {
                                                                        xVar2.N(i20);
                                                                        z15 = true;
                                                                    } else {
                                                                        sb4.append(b11);
                                                                    }
                                                                }
                                                            }
                                                            if (sb2 != null && !sb2.isEmpty()) {
                                                                int i21 = xVar2.b;
                                                                String b12 = l4.a.b(xVar2, sb3);
                                                                if (!";".equals(b12)) {
                                                                    if ("}".equals(b12)) {
                                                                        xVar2.N(i21);
                                                                    }
                                                                }
                                                                if ("color".equals(a10)) {
                                                                    i11 = 1;
                                                                    bVar.f = h2.h.a(sb2, true);
                                                                    bVar.g = true;
                                                                } else {
                                                                    i11 = 1;
                                                                    if ("background-color".equals(a10)) {
                                                                        bVar.h = h2.h.a(sb2, true);
                                                                        bVar.i = true;
                                                                    } else {
                                                                        if ("ruby-position".equals(a10)) {
                                                                            if ("over".equals(sb2)) {
                                                                                bVar.p = 1;
                                                                            } else if ("under".equals(sb2)) {
                                                                                bVar.p = 2;
                                                                                r12 = 1;
                                                                                z13 = r12;
                                                                                z12 = z14;
                                                                                z10 = false;
                                                                            }
                                                                        } else if ("text-combine-upright".equals(a10)) {
                                                                            bVar.q = "all".equals(sb2) || sb2.startsWith("digits");
                                                                        } else if ("text-decoration".equals(a10)) {
                                                                            if ("underline".equals(sb2)) {
                                                                                i11 = 1;
                                                                                bVar.k = 1;
                                                                            }
                                                                        } else if ("font-family".equals(a10)) {
                                                                            bVar.e = ja.c(sb2);
                                                                        } else if (!"font-weight".equals(a10)) {
                                                                            i11 = 1;
                                                                            if ("font-style".equals(a10)) {
                                                                                if ("italic".equals(sb2)) {
                                                                                    bVar.m = 1;
                                                                                }
                                                                            } else if ("font-size".equals(a10)) {
                                                                                ?? matcher2 = l4.a.d.matcher(ja.c(sb2));
                                                                                if (matcher2.matches()) {
                                                                                    String group2 = matcher2.group(2);
                                                                                    group2.getClass();
                                                                                    switch (group2.hashCode()) {
                                                                                        case 37:
                                                                                            if (group2.equals("%")) {
                                                                                                c10 = 0;
                                                                                                break;
                                                                                            }
                                                                                            break;
                                                                                        case 3240:
                                                                                            if (group2.equals("em")) {
                                                                                                c10 = 1;
                                                                                                break;
                                                                                            }
                                                                                            break;
                                                                                        case 3592:
                                                                                            if (group2.equals("px")) {
                                                                                                c10 = 2;
                                                                                                break;
                                                                                            }
                                                                                            break;
                                                                                    }
                                                                                    c10 = 65535;
                                                                                    switch (c10) {
                                                                                        case 0:
                                                                                            r12 = 1;
                                                                                            bVar.n = 3;
                                                                                            break;
                                                                                        case 1:
                                                                                            r12 = 1;
                                                                                            bVar.n = 2;
                                                                                            break;
                                                                                        case 2:
                                                                                            r12 = 1;
                                                                                            bVar.n = 1;
                                                                                            break;
                                                                                        default:
                                                                                            throw new IllegalStateException();
                                                                                    }
                                                                                    String group3 = matcher2.group(r12);
                                                                                    group3.getClass();
                                                                                    bVar.o = Float.parseFloat(group3);
                                                                                    z13 = r12;
                                                                                    z12 = z14;
                                                                                    z10 = false;
                                                                                } else {
                                                                                    h2.a.l("WebvttCssParser", "Invalid font-size: '" + sb2 + "'.");
                                                                                }
                                                                            }
                                                                        } else if ("bold".equals(sb2)) {
                                                                            i11 = 1;
                                                                            bVar.l = 1;
                                                                        }
                                                                        z13 = r12;
                                                                        z12 = z14;
                                                                        z10 = false;
                                                                    }
                                                                }
                                                                r12 = i11;
                                                                z13 = r12;
                                                                z12 = z14;
                                                                z10 = false;
                                                            }
                                                            r12 = 1;
                                                            z13 = r12;
                                                            z12 = z14;
                                                            z10 = false;
                                                        }
                                                    }
                                                    r12 = z13;
                                                    z13 = r12;
                                                    z12 = z14;
                                                    z10 = false;
                                                }
                                                boolean z16 = z13;
                                                if ("}".equals(str5)) {
                                                    arrayList3.add(bVar);
                                                }
                                                r92 = z16;
                                                z10 = false;
                                                i12 = -1;
                                                str2 = null;
                                            }
                                        }
                                    }
                                    str = str2;
                                    if (str == null) {
                                    }
                                }
                            } else if (c11 == 3) {
                                Pattern pattern = l4.h.a;
                                Charset charset = StandardCharsets.UTF_8;
                                String n11 = xVar.n(charset);
                                if (n11 == null) {
                                    cVar = null;
                                } else {
                                    Pattern pattern2 = l4.h.a;
                                    Matcher matcher3 = pattern2.matcher(n11);
                                    if (matcher3.matches()) {
                                        cVar = l4.h.d(null, matcher3, xVar, arrayList);
                                    } else {
                                        cVar = null;
                                        String n12 = xVar.n(charset);
                                        if (n12 != null) {
                                            Matcher matcher4 = pattern2.matcher(n12);
                                            if (matcher4.matches()) {
                                                cVar = l4.h.d(n11.trim(), matcher4, xVar, arrayList);
                                            }
                                        }
                                    }
                                }
                                if (cVar != null) {
                                    arrayList2.add(cVar);
                                }
                            }
                            lVar2 = this;
                        }
                    }
                }
            }
        } catch (t0 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    @Override // org.telegram.ui.Components.qo
    public void w() {
        int i7;
        ((a70) this.b).v();
        bn bnVar = (bn) this.c;
        i7 = ((g2) bnVar).currentAccount;
        SharedPreferences sharedPreferences = np.u1(i7).g7;
        boolean z10 = sharedPreferences.getBoolean("sound_enabled_" + ys.v(bnVar.l6, bnVar.d(), false), true);
        boolean z11 = !z10;
        sharedPreferences.edit().putBoolean("sound_enabled_" + ys.v(bnVar.l6, bnVar.d(), false), z11).apply();
        if (lc.a(bnVar)) {
            lc.S(z10 ? 1 : 0, bnVar, bnVar.getResourceProvider()).j();
        }
        bnVar.yd(false);
    }

    @Override // ai.d2
    public void x(String str) {
        f2 f2Var = (f2) this.b;
        o oVar = (o) this.c;
        if (f2Var == oVar.f) {
            oVar.x(str);
        }
    }

    @Override // oi.e1
    public void x0(f1 f1Var) {
        ((h0) this.b).u();
    }

    @Override // c4.m
    public int y() {
        return 1;
    }

    public /* synthetic */ l(int i7, boolean z10) {
        this.a = i7;
    }

    @Override // org.telegram.ui.Components.g61
    public void onRenderedFirstFrame() {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
        if (secretMediaViewer.b0) {
            return;
        }
        secretMediaViewer.b0 = true;
        secretMediaViewer.e.invalidate();
    }

    public /* synthetic */ l(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    public /* synthetic */ l(Object obj, Object obj2, boolean z10, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ l(Object obj) {
        this.a = 24;
        this.c = obj;
        this.b = new ArrayList();
    }

    public l(n6.e eVar) {
        this.a = 25;
        this.b = new SparseIntArray();
        q6.m.h(eVar);
        this.c = eVar;
    }

    public l(fe0 fe0Var) {
        this.a = 15;
        this.c = fe0Var;
        this.b = new hb0(this, 8);
    }

    public l(e2.s sVar, SparseArray sparseArray) {
        this.a = 3;
        this.b = sVar;
        SparseBooleanArray sparseBooleanArray = sVar.a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i7 = 0; i7 < sparseBooleanArray.size(); i7++) {
            int a10 = sVar.a(i7);
            m2.a aVar = (m2.a) sparseArray.get(a10);
            aVar.getClass();
            sparseArray2.append(a10, aVar);
        }
        this.c = sparseArray2;
    }

    public l(String str) {
        this.a = 6;
        this.c = null;
        this.b = str;
    }

    public l(EditText editText) {
        this.a = 29;
        this.b = editText;
        t1.i iVar = new t1.i(editText);
        this.c = iVar;
        editText.addTextChangedListener(iVar);
        if (t1.a.b == null) {
            synchronized (t1.a.a) {
                try {
                    if (t1.a.b == null) {
                        t1.a aVar = new t1.a();
                        try {
                            t1.a.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, t1.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        t1.a.b = aVar;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(t1.a.b);
    }

    public l(o oVar) {
        this.a = 0;
        this.c = oVar;
    }

    public l(d0 d0Var) {
        this.a = 4;
        this.c = d0Var;
        this.b = new d4.f(new byte[4], 4);
    }

    public l(kx kxVar) {
        this.a = 17;
        this.c = kxVar;
        this.b = new Rect();
    }

    public l(Attributes attributes, HashMap hashMap) {
        this.a = 11;
        this.c = attributes;
        String l10 = nz.l("style", attributes);
        if (l10 != null) {
            ArrayList arrayList = new ArrayList();
            this.b = arrayList;
            arrayList.add(new lz(l10));
            return;
        }
        String l11 = nz.l("class", attributes);
        if (l11 != null) {
            this.b = new ArrayList();
            for (String str : l11.split(" ")) {
                lz lzVar = (lz) hashMap.get(str.trim());
                if (lzVar != null) {
                    ((ArrayList) this.b).add(lzVar);
                }
            }
        }
    }

    public l(int i7) {
        this.a = i7;
        switch (i7) {
            case 2:
                this.b = new x();
                this.c = new l4.a();
                break;
            default:
                this.b = new HashMap();
                this.c = l2.c.b;
                break;
        }
    }

    @Override // org.telegram.ui.Components.an0
    public void C() {
    }

    @Override // oi.e1
    public /* synthetic */ void E0() {
    }

    @Override // hi.wa
    public /* synthetic */ void N1() {
    }

    @Override // org.telegram.ui.h7
    public void clear() {
    }

    @Override // hi.wa
    public /* synthetic */ void f0() {
    }

    @Override // org.telegram.ui.Components.tj0
    public void j() {
    }

    @Override // org.telegram.ui.h7
    public void k() {
    }

    @Override // org.telegram.ui.Components.qo
    public /* synthetic */ void p() {
    }

    @Override // c4.m
    public /* synthetic */ void reset() {
    }

    @Override // hi.wa
    public /* synthetic */ void D0(boolean z10) {
    }

    @Override // hi.wa
    public /* synthetic */ void F(float f10) {
    }

    @Override // hi.wa
    public /* synthetic */ void M1(float f10) {
    }

    @Override // hi.wa
    public /* synthetic */ void Q0(float f10) {
    }

    @Override // hi.wa
    public /* synthetic */ void b2(float f10) {
    }

    @Override // hi.wa
    public /* synthetic */ void e1(long j3) {
    }

    @Override // hi.wa
    public /* synthetic */ void g(int i7) {
    }

    @Override // hi.wa
    public /* synthetic */ void h1(boolean z10) {
    }

    @Override // hi.wa
    public /* synthetic */ void m2(long j3) {
    }

    @Override // org.telegram.ui.Components.g61
    public /* synthetic */ void onSeekFinished(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.g61
    public /* synthetic */ void onSeekStarted(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.g61
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // hi.wa
    public /* synthetic */ void q1(float f10) {
    }

    @Override // org.telegram.ui.Components.tj0
    public void r(float f10) {
    }

    @Override // hi.wa
    public /* synthetic */ void s0(float f10) {
    }

    @Override // hi.wa
    public /* synthetic */ void t(float f10) {
    }

    @Override // hi.wa
    public /* synthetic */ void w1(float f10) {
    }

    @Override // hi.wa
    public /* synthetic */ void G1(float f10, int i7) {
    }

    @Override // hi.wa
    public /* synthetic */ void J0(float f10, int i7) {
    }

    @Override // hi.wa
    public /* synthetic */ void M(long j3, boolean z10) {
    }

    @Override // hi.wa
    public /* synthetic */ void i2(int i7, long j3) {
    }

    @Override // hi.wa
    public /* synthetic */ void n1(float f10, int i7) {
    }

    @Override // m4.a0
    public void b(k0 k0Var, f3.q qVar, f0 f0Var) {
    }
}
