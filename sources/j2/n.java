package j2;

import a8.ga;
import a8.ia;
import a8.p0;
import a8.t7;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import c8.s9;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.o0;
import e2.t0;
import fi.za;
import h2.k0;
import h2.m0;
import j$.util.Objects;
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
import li.f1;
import li.g0;
import li.g1;
import li.i0;
import li.j0;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.dt;
import org.telegram.messenger.id;
import org.telegram.messenger.me;
import org.telegram.messenger.pi;
import org.telegram.messenger.qp;
import org.telegram.messenger.qr;
import org.telegram.messenger.qs;
import org.telegram.messenger.qz;
import org.telegram.messenger.sz;
import org.telegram.messenger.ui;
import org.telegram.tgnet.SerializedData;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.m3;
import org.telegram.ui.Cells.c2;
import org.telegram.ui.Cells.h4;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Components.fj0;
import org.telegram.ui.Components.fw0;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.pb0;
import org.telegram.ui.Components.r51;
import org.telegram.ui.Components.rt;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.vd0;
import org.telegram.ui.Components.xn;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.ax0;
import org.telegram.ui.bx;
import org.telegram.ui.c8;
import org.telegram.ui.cn;
import org.telegram.ui.e8;
import org.telegram.ui.gx;
import org.telegram.ui.gz0;
import org.telegram.ui.h5;
import org.telegram.ui.h8;
import org.telegram.ui.i7;
import org.telegram.ui.j4;
import org.telegram.ui.kx0;
import org.telegram.ui.ky0;
import org.telegram.ui.s6;
import org.telegram.ui.xt;
import org.telegram.ui.yt;
import org.xml.sax.Attributes;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class n implements g, j6.n, ja.a, c4.m, f1, f3.i, com.google.android.gms.common.api.internal.p, mm0, qr, xn, za, i7, fj0, r51, h2.d, q5.b, s2.t {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ n(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.c = obj;
        this.b = obj2;
    }

    public static void U(n nVar, l2.c cVar) {
        nVar.getClass();
        for (Map.Entry entry : new HashMap((HashMap) nVar.b).entrySet()) {
            if (entry.getKey() != null) {
                throw new ClassCastException();
            }
            List list = (List) entry.getValue();
            if (!Z(cVar, list).equals(Z((l2.c) nVar.c, list))) {
                throw null;
            }
        }
        nVar.c = cVar;
    }

    public static l2.c Z(l2.c cVar, List list) {
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

    public static n d0(int i7, boolean z9, byte[] bArr, byte[] bArr2) {
        n nVar = new n(12, false);
        if (bArr == null || bArr.length == 0) {
            nVar.c = null;
            nVar.b = null;
            return nVar;
        }
        int i10 = z9 ? 8 : 0;
        if (i7 != 1) {
            if (i7 != 2) {
                return nVar;
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
            byte[] o10 = Utilities.o(r10.length, serializedData2.toByteArray());
            serializedData2.cleanup();
            SerializedData serializedData3 = new SerializedData();
            serializedData3.writeBytes(o4, 0, 8);
            serializedData3.writeBytes(o10, 8, 16);
            serializedData3.writeBytes(o4, 24, 8);
            nVar.b = serializedData3.toByteArray();
            serializedData3.cleanup();
            SerializedData serializedData4 = new SerializedData();
            serializedData4.writeBytes(o10, 0, 8);
            serializedData4.writeBytes(o4, 8, 16);
            serializedData4.writeBytes(o10, 24, 8);
            nVar.c = serializedData4.toByteArray();
            serializedData4.cleanup();
            return nVar;
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
        nVar.b = serializedData9.toByteArray();
        serializedData9.cleanup();
        SerializedData serializedData10 = new SerializedData();
        serializedData10.writeBytes(n10, 8, 12);
        serializedData10.writeBytes(n11, 0, 8);
        serializedData10.writeBytes(n12, 16, 4);
        serializedData10.writeBytes(n13, 0, 8);
        nVar.c = serializedData10.toByteArray();
        serializedData10.cleanup();
        return nVar;
    }

    @Override // h2.d
    public m9.y A(o0 o0Var) {
        m9.y A = ((h2.d) this.b).A(o0Var);
        if (A == null) {
            return null;
        }
        return s9.c(A, new m3(this, 12));
    }

    @Override // ja.a
    public StackTraceElement[] B(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        ja.a[] aVarArr = (ja.a[]) this.b;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (int i7 = 0; i7 < 1; i7++) {
            ja.a aVar = aVarArr[i7];
            if (stackTraceElementArr2.length <= 1024) {
                break;
            }
            stackTraceElementArr2 = aVar.B(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > 1024 ? ((w7.s) this.c).B(stackTraceElementArr2) : stackTraceElementArr2;
    }

    @Override // li.f1
    public /* synthetic */ boolean E(g1 g1Var) {
        return false;
    }

    @Override // li.f1
    public void F(g1 g1Var) {
        ((i0) this.b).t();
    }

    @Override // j6.n
    public void H(String str, long j3, int i7, Object obj, long j10, long j11) {
        ((j6.m) this.c).g = null;
        j6.n nVar = (j6.n) this.b;
        if (nVar != null) {
            nVar.H(str, j3, i7, obj, j10, j11);
        }
    }

    @Override // s2.t
    public b3.q I(s2.p pVar, s2.m mVar) {
        return new sg.i0(8, ((s2.t) this.b).I(pVar, mVar), (List) this.c);
    }

    @Override // org.telegram.ui.Components.xn
    public void L() {
        int i7;
        ((l60) this.b).u();
        cn cnVar = (cn) this.c;
        i7 = ((f2) cnVar).currentAccount;
        SharedPreferences sharedPreferences = qp.s1(i7).d7;
        boolean z9 = sharedPreferences.getBoolean("sound_enabled_" + dt.v(cnVar.j6, cnVar.b(), false), true);
        boolean z10 = !z9;
        sharedPreferences.edit().putBoolean("sound_enabled_" + dt.v(cnVar.j6, cnVar.b(), false), z10).apply();
        if (hc.a(cnVar)) {
            hc.S(z9 ? 1 : 0, cnVar, cnVar.getResourceProvider()).j();
        }
        cnVar.xd(false);
    }

    @Override // f3.i
    public void M() {
        h2.x xVar = (h2.x) this.c;
        byte[] bArr = m0.b;
        xVar.getClass();
        xVar.L(bArr.length, bArr);
    }

    @Override // c4.m
    public int P() {
        return 1;
    }

    @Override // org.telegram.ui.Components.xn
    public void R(int i7) {
        cn cnVar = (cn) this.c;
        ((l60) this.b).u();
        if (i7 != 0) {
            cnVar.getNotificationsController().H(cnVar.j6, i7, cnVar.b());
            if (hc.a(cnVar)) {
                hc.z(cnVar, 5, i7, cnVar.getResourceProvider()).j();
                return;
            }
            return;
        }
        if (cnVar.getMessagesController().r2(cnVar.j6, cnVar.b(), null)) {
            cnVar.Hc(true);
        }
        if (hc.a(cnVar)) {
            hc.z(cnVar, 4, i7, cnVar.getResourceProvider()).j();
        }
    }

    @Override // li.f1
    public void T0(CharSequence charSequence) {
        ((i0) this.b).I0(charSequence);
    }

    @Override // h2.d
    public m9.y W(byte[] bArr) {
        return s9.c(((h2.d) this.b).W(bArr), new m3(this, 12));
    }

    public void X(Object obj, String str) {
        int length = str.length();
        String valueOf = String.valueOf(obj);
        ((ArrayList) this.b).add(org.telegram.ui.Cells.f1.n(str, "=", valueOf, new StringBuilder(length + 1 + valueOf.length())));
    }

    @Override // s2.t
    public b3.q Y() {
        return new sg.i0(8, ((s2.t) this.b).Y(), (List) this.c);
    }

    @Override // f3.i
    public f3.h a(f3.p pVar, long j3) {
        long position = pVar.getPosition();
        int min = (int) Math.min(20000L, pVar.getLength() - position);
        h2.x xVar = (h2.x) this.c;
        xVar.K(min);
        pVar.b(0, min, xVar.a);
        int i7 = -1;
        int i10 = -1;
        long j10 = -9223372036854775807L;
        while (xVar.a() >= 4) {
            if (k3.a.a(xVar.b, xVar.a) != 442) {
                xVar.O(1);
            } else {
                xVar.O(4);
                long c10 = m4.x.c(xVar);
                if (c10 != -9223372036854775807L) {
                    long b10 = ((k0) this.b).b(c10);
                    if (b10 > j3) {
                        return j10 == -9223372036854775807L ? new f3.h(b10, -1, position) : new f3.h(-9223372036854775807L, 0, position + i10);
                    }
                    if (b10 + 100000 > j3) {
                        return new f3.h(-9223372036854775807L, 0, position + xVar.b);
                    }
                    j10 = b10;
                    i10 = xVar.b;
                }
                int i11 = xVar.c;
                if (xVar.a() >= 10) {
                    xVar.O(9);
                    int A = xVar.A() & 7;
                    if (xVar.a() >= A) {
                        xVar.O(A);
                        if (xVar.a() >= 4) {
                            if (k3.a.a(xVar.b, xVar.a) == 443) {
                                xVar.O(4);
                                int H = xVar.H();
                                if (xVar.a() < H) {
                                    xVar.N(i11);
                                } else {
                                    xVar.O(H);
                                }
                            }
                            while (true) {
                                if (xVar.a() < 4) {
                                    break;
                                }
                                int a10 = k3.a.a(xVar.b, xVar.a);
                                if (a10 == 442 || a10 == 441 || (a10 >>> 8) != 1) {
                                    break;
                                }
                                xVar.O(4);
                                if (xVar.a() < 2) {
                                    xVar.N(i11);
                                    break;
                                }
                                xVar.N(Math.min(xVar.c, xVar.b + xVar.H()));
                            }
                        } else {
                            xVar.N(i11);
                        }
                    } else {
                        xVar.N(i11);
                    }
                } else {
                    xVar.N(i11);
                }
                i7 = xVar.b;
            }
        }
        return j10 != -9223372036854775807L ? new f3.h(j10, -2, position + i7) : f3.h.d;
    }

    @Override // com.google.android.gms.common.api.internal.p
    public void accept(Object obj, Object obj2) {
        int i7;
        o7.d dVar = (o7.d) this.b;
        o7.b bVar = (o7.b) obj;
        e7.b bVar2 = new e7.b(dVar, (TaskCompletionSource) obj2);
        Context context = dVar.a;
        try {
            i7 = z6.b.a(context).c(0, context.getPackageName()).versionCode;
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

    @Override // li.f1
    public void b(g1 g1Var) {
        ((i0) this.b).b(g1Var);
    }

    @Override // c4.m
    public /* synthetic */ c4.d c(int i7, int i10, byte[] bArr) {
        return p0.a(this, bArr, i10);
    }

    public void c0(l2.d dVar) {
        synchronized (dVar) {
        }
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new n2.q(this, dVar, 0));
        }
    }

    @Override // j2.g
    public h createDataSource() {
        return new o((Context) this.b, ((p) this.c).createDataSource());
    }

    @Override // org.telegram.ui.Components.xn
    public void dismiss() {
        switch (this.a) {
            case 16:
                ((l60) this.b).u();
                break;
            default:
                ((yt) this.c).dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.fj0
    public boolean f(float f10, float f11, int i7, View view) {
        Rect rect = (Rect) this.b;
        gx gxVar = (gx) this.c;
        int i10 = 0;
        if (gxVar.getParentActivity() != null && (view instanceof h4)) {
            ((ImageView) view.getTag(R.id.object_tag)).getHitRect(rect);
            if (!rect.contains((int) f10, (int) f11)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gxVar.getParentActivity());
                alertDialog$Builder.f(new CharSequence[]{id.M0(2131751598, null)}, new bx(this, i7, i10));
                gxVar.showDialog(alertDialog$Builder.a);
                return true;
            }
        }
        return false;
    }

    public String f0(String str) {
        ArrayList arrayList = (ArrayList) this.b;
        String str2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                str2 = (String) ((qz) arrayList.get(i7)).a.get(str);
                if (str2 != null) {
                    break;
                }
            }
        }
        return str2 == null ? sz.l(str, (Attributes) this.c) : str2;
    }

    @Override // li.f1
    public void f1(Editable editable) {
        ((j0) this.c).i();
        ((i0) this.b).i1();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0080, code lost:
    
        if (r5.equals("red") == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Integer g0(String str) {
        String f02 = f0(str);
        if (f02 == null) {
            return null;
        }
        char c10 = 1;
        try {
            return Integer.valueOf(Integer.parseInt(f02.substring(1), 16));
        } catch (NumberFormatException unused) {
            double[] dArr = sz.a;
            String lowerCase = f02.toLowerCase();
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

    @Override // fd.a
    public Object get() {
        return new p5.d((Context) ((e.a) this.b).a, (ky0) ((rt) this.c).get());
    }

    @Override // org.telegram.ui.Components.mm0
    public /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    public boolean h0(q4.t tVar, String str) {
        Context context = (Context) this.b;
        int i7 = tVar.b;
        return i7 < 0 ? context.getPackageManager().checkPermission(str, tVar.a) == 0 : context.checkPermission(str, i7, tVar.c) == 0;
    }

    public void i0(long j3, byte[] bArr) {
        e0.g gVar = (e0.g) this.c;
        if (gVar.b) {
            gVar.b = false;
            ((vi.h) gVar.e).h();
            return;
        }
        vi.h hVar = (vi.h) gVar.e;
        hVar.getClass();
        vi.h.q();
        vi.g gVar2 = hVar.z;
        File file = (hVar.G != 5 || gVar2 == null) ? null : gVar2.b;
        if (file == null) {
            me meVar = (me) this.b;
            IllegalStateException illegalStateException = new IllegalStateException("Preview file is unavailable");
            MediaController mediaController = meVar.a;
            String[] strArr = MediaController.V1;
            a8.e("AudioRecorderV2 failed", illegalStateException);
            qs.f(mediaController.h1).k(qs.m2, Integer.valueOf(mediaController.g1));
            mediaController.x(false);
            return;
        }
        MediaController mediaController2 = ((me) this.b).a;
        mediaController2.j1 = file;
        mediaController2.k1 = j3;
        mediaController2.G0(file, j3, bArr);
        ui.b0(mediaController2.h1).B1(mediaController2.m1, mediaController2.n1, pi.a(mediaController2, file.getAbsolutePath(), mediaController2.J1));
        qs.f(mediaController2.h1).k(qs.o2, new Object[0]);
        qs.f(mediaController2.h1).k(qs.s2, Integer.valueOf(mediaController2.g1), mediaController2.f1, file.getAbsolutePath());
        mediaController2.Y(false);
        MediaController.j0(false);
    }

    public int j0(Context context, com.google.android.gms.common.api.c cVar) {
        q6.m.g(context);
        q6.m.g(cVar);
        int i7 = 0;
        if (!cVar.c()) {
            return 0;
        }
        int d = cVar.d();
        int k02 = k0(d);
        if (k02 != -1) {
            return k02;
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

    @Override // org.telegram.messenger.qr
    public void k(boolean z9) {
        e8 e8Var = ((c8) this.c).b;
        e8Var.y.finishFragment();
        cn cnVar = (cn) this.b;
        h8 h8Var = e8Var.y;
        cnVar.i8(h8Var.P, h8Var.Q + 86400, z9);
    }

    public int k0(int i7) {
        int i10;
        SparseIntArray sparseIntArray = (SparseIntArray) this.b;
        synchronized (sparseIntArray) {
            i10 = sparseIntArray.get(i7, -1);
        }
        return i10;
    }

    @Override // org.telegram.ui.Components.mm0
    public void l(boolean z9, float f10) {
        ((TextView) this.b).setText("Alpha " + h5.l1);
        h5.l1 = f10;
        ((h5) this.c).i1.L();
    }

    @Override // li.f1
    public void l0(g1 g1Var, int i7, int i10) {
        i9 w02;
        i0 i0Var = (i0) this.b;
        if (((j0) this.c).d || i7 == i10 || (w02 = i0Var.w0()) == null) {
            return;
        }
        if (w02.x() && w02.W == i0Var.S0()) {
            return;
        }
        g1Var.post(new g0(this, g1Var, i10, w02, i0Var, i7));
    }

    @Override // li.f1
    public /* synthetic */ boolean l1(boolean z9) {
        return false;
    }

    @Override // li.f1
    public boolean m() {
        return ((i0) this.b).a1();
    }

    @Override // org.telegram.ui.i7
    public void o(s6 s6Var, ci.b bVar, boolean z9) {
        yt ytVar = (yt) this.c;
        xt xtVar = ytVar.P1;
        if (bVar != null) {
            ((ci.c) this.b).i(bVar);
            ytVar.W1.e();
            ci.c cVar = ytVar.Y1;
            fw0[] fw0VarArr = ytVar.T1;
            c2[] c2VarArr = ytVar.U1;
            c2 c2Var = c2VarArr[0];
            if (c2Var != null) {
                fw0 fw0Var = fw0VarArr[0];
                boolean z10 = cVar.m;
                fw0Var.c = z10;
                c2Var.c(z10, true);
            }
            c2 c2Var2 = c2VarArr[1];
            if (c2Var2 != null) {
                fw0 fw0Var2 = fw0VarArr[1];
                boolean z11 = cVar.n;
                fw0Var2.c = z11;
                c2Var2.c(z11, true);
            }
            c2 c2Var3 = c2VarArr[2];
            if (c2Var3 != null) {
                fw0 fw0Var3 = fw0VarArr[2];
                boolean z12 = cVar.o;
                fw0Var3.c = z12;
                c2Var3.c(z12, true);
            }
            c2 c2Var4 = c2VarArr[3];
            if (c2Var4 != null) {
                fw0 fw0Var4 = fw0VarArr[3];
                boolean z13 = cVar.p;
                fw0Var4.c = z13;
                c2Var4.c(z13, true);
            }
            c2 c2Var5 = c2VarArr[4];
            if (c2Var5 != null) {
                fw0 fw0Var5 = fw0VarArr[4];
                boolean z14 = cVar.q;
                fw0Var5.c = z14;
                c2Var5.c(z14, true);
            }
            ytVar.S1.a(xtVar.d(), true);
            xtVar.c(true);
        }
    }

    @Override // org.telegram.ui.Components.r51
    public void onError(u51 u51Var, Exception exc) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
        int i7 = secretMediaViewer.Z;
        if (i7 <= 0) {
            a8.g(exc, true);
            return;
        }
        secretMediaViewer.Z = i7 - 1;
        org.telegram.messenger.g0.i3(new ax0(7, this, (File) this.b), 100L);
    }

    @Override // org.telegram.ui.Components.r51
    public /* synthetic */ void onRenderedFirstFrame(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.r51
    public void onStateChanged(boolean z9, int i7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
        gz0 gz0Var = secretMediaViewer.g1;
        if (secretMediaViewer.D == null || secretMediaViewer.f0 == null) {
            return;
        }
        org.telegram.messenger.g0.r(gz0Var);
        org.telegram.messenger.g0.h3(gz0Var);
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
        if (secretMediaViewer.D.d0() && i7 != 4) {
            if (secretMediaViewer.E) {
                return;
            }
            secretMediaViewer.E = true;
        } else if (secretMediaViewer.E) {
            secretMediaViewer.E = false;
            if (i7 == 4) {
                secretMediaViewer.H = true;
                if (secretMediaViewer.I) {
                    secretMediaViewer.e(true, !secretMediaViewer.o1);
                } else {
                    secretMediaViewer.D.q0(0L, false);
                    secretMediaViewer.D.h0();
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.r51
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.r51
    public void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
        j4 j4Var = ((SecretMediaViewer) this.c).x;
        if (j4Var != null) {
            j4Var.a(i10 == 0 ? 1.0f : (i7 * f10) / i10, 0);
        }
    }

    @Override // org.telegram.ui.Components.xn
    public void p() {
        ((l60) this.b).u();
        cn cnVar = (cn) this.c;
        cnVar.Hc(true);
        hc.A(cnVar, cnVar.getMessagesController().r2(cnVar.j6, cnVar.b(), null), cnVar.za).j();
    }

    @Override // org.telegram.ui.Components.mm0
    public /* synthetic */ int q0() {
        return 0;
    }

    @Override // li.f1
    public /* synthetic */ boolean s(g1 g1Var) {
        return false;
    }

    @Override // fi.za
    public void t(boolean z9, float f10) {
        pb0 pb0Var = (pb0) this.b;
        vd0 vd0Var = (vd0) this.c;
        u51 u51Var = vd0Var.d;
        if (u51Var == null) {
            return;
        }
        float max = 2.8f / Math.max(60L, r2);
        long U = (long) ((((f10 / (1.0f - max)) * max) + f10) * u51Var.U());
        vd0Var.e = U;
        vd0Var.d.q0(U, !z9);
        if (z9) {
            return;
        }
        org.telegram.messenger.g0.r(pb0Var);
        org.telegram.messenger.g0.i3(pb0Var, 120L);
    }

    public String toString() {
        switch (this.a) {
            case 26:
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
            case 27:
            default:
                return super.toString();
            case 28:
                return "Bounds{lower=" + ((i0.b) this.b) + " upper=" + ((i0.b) this.c) + "}";
        }
    }

    @Override // j6.n
    public void v(String str, long j3, long j10, long j11) {
        j6.n nVar = (j6.n) this.b;
        if (nVar != null) {
            nVar.v(str, j3, j10, j11);
        }
    }

    @Override // li.f1
    public void w(int i7, int i10) {
        ((i0) this.b).d1(i7, i10);
    }

    @Override // org.telegram.ui.Components.xn
    public void y() {
        ((l60) this.b).u();
        cn cnVar = (cn) this.c;
        if (cnVar.j6 == 0 || cnVar.f4 == 3) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", cnVar.j6);
        if (cnVar.b() != 0) {
            bundle.putLong("topic_id", cnVar.b());
        }
        cnVar.presentFragment(new kx0(bundle, cnVar.za));
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
    public void z(byte[] bArr, int i7, int i10, c4.l lVar, h2.j jVar) {
        l4.c cVar;
        String str;
        ?? r12;
        String sb2;
        int i11;
        char c10;
        n nVar = this;
        h2.x xVar = (h2.x) nVar.b;
        xVar.L(i7 + i10, bArr);
        xVar.N(i7);
        ArrayList arrayList = new ArrayList();
        try {
            l4.i.d(xVar);
            while (!TextUtils.isEmpty(xVar.n(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                boolean z9 = false;
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
                            t7.b(new h6.m(arrayList2), lVar, jVar);
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
                                l4.a aVar = (l4.a) nVar.c;
                                h2.x xVar2 = aVar.a;
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
                                                boolean z10 = z9 ? 1 : 0;
                                                while (i16 < i17 && z10 == 0) {
                                                    int i18 = i16 + 1;
                                                    z10 = ((char) xVar2.a[i16]) == ')' ? r92 : z9 ? 1 : 0;
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
                                                bVar.g = z9;
                                                bVar.i = z9;
                                                bVar.j = i12;
                                                bVar.k = i12;
                                                bVar.l = i12;
                                                bVar.m = i12;
                                                bVar.n = i12;
                                                bVar.p = i12;
                                                bVar.q = z9;
                                                if (!str.isEmpty()) {
                                                    int indexOf = str.indexOf(91);
                                                    if (indexOf != i12) {
                                                        ?? matcher = l4.a.c.matcher(str.substring(indexOf));
                                                        if (matcher.matches()) {
                                                            String group = matcher.group(r92);
                                                            group.getClass();
                                                            bVar.d = group;
                                                        }
                                                        str = str.substring(z9 ? 1 : 0, indexOf);
                                                    }
                                                    String str3 = m0.a;
                                                    String[] split = str.split("\\.", i12);
                                                    String str4 = split[z9 ? 1 : 0];
                                                    int indexOf2 = str4.indexOf(35);
                                                    if (indexOf2 != i12) {
                                                        bVar.b = str4.substring(z9 ? 1 : 0, indexOf2);
                                                        bVar.a = str4.substring(indexOf2 + 1);
                                                    } else {
                                                        bVar.b = str4;
                                                    }
                                                    if (split.length > r92) {
                                                        int length = split.length;
                                                        ia.f(length <= split.length ? r92 : z9 ? 1 : 0);
                                                        bVar.c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(split, (int) r92, length)));
                                                    }
                                                }
                                                boolean z11 = z9 ? 1 : 0;
                                                String str5 = str2;
                                                boolean z12 = r92;
                                                while (z11 == 0) {
                                                    int i19 = xVar2.b;
                                                    str5 = l4.a.b(xVar2, sb3);
                                                    boolean z13 = (str5 == null || "}".equals(str5)) ? z12 : z9;
                                                    if (z13 == 0) {
                                                        xVar2.N(i19);
                                                        l4.a.c(xVar2);
                                                        String a10 = l4.a.a(xVar2, sb3);
                                                        if (!a10.isEmpty() && ":".equals(l4.a.b(xVar2, sb3))) {
                                                            l4.a.c(xVar2);
                                                            StringBuilder sb4 = new StringBuilder();
                                                            boolean z14 = false;
                                                            while (true) {
                                                                if (z14) {
                                                                    sb2 = sb4.toString();
                                                                } else {
                                                                    int i20 = xVar2.b;
                                                                    String b11 = l4.a.b(xVar2, sb3);
                                                                    if (b11 == null) {
                                                                        sb2 = null;
                                                                    } else if ("}".equals(b11) || ";".equals(b11)) {
                                                                        xVar2.N(i20);
                                                                        z14 = true;
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
                                                                                z12 = r12;
                                                                                z11 = z13;
                                                                                z9 = false;
                                                                            }
                                                                        } else if ("text-combine-upright".equals(a10)) {
                                                                            bVar.q = "all".equals(sb2) || sb2.startsWith("digits");
                                                                        } else if ("text-decoration".equals(a10)) {
                                                                            if ("underline".equals(sb2)) {
                                                                                i11 = 1;
                                                                                bVar.k = 1;
                                                                            }
                                                                        } else if ("font-family".equals(a10)) {
                                                                            bVar.e = ga.c(sb2);
                                                                        } else if (!"font-weight".equals(a10)) {
                                                                            i11 = 1;
                                                                            if ("font-style".equals(a10)) {
                                                                                if ("italic".equals(sb2)) {
                                                                                    bVar.m = 1;
                                                                                }
                                                                            } else if ("font-size".equals(a10)) {
                                                                                ?? matcher2 = l4.a.d.matcher(ga.c(sb2));
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
                                                                                    z12 = r12;
                                                                                    z11 = z13;
                                                                                    z9 = false;
                                                                                } else {
                                                                                    h2.a.l("WebvttCssParser", "Invalid font-size: '" + sb2 + "'.");
                                                                                }
                                                                            }
                                                                        } else if ("bold".equals(sb2)) {
                                                                            i11 = 1;
                                                                            bVar.l = 1;
                                                                        }
                                                                        z12 = r12;
                                                                        z11 = z13;
                                                                        z9 = false;
                                                                    }
                                                                }
                                                                r12 = i11;
                                                                z12 = r12;
                                                                z11 = z13;
                                                                z9 = false;
                                                            }
                                                            r12 = 1;
                                                            z12 = r12;
                                                            z11 = z13;
                                                            z9 = false;
                                                        }
                                                    }
                                                    r12 = z12;
                                                    z12 = r12;
                                                    z11 = z13;
                                                    z9 = false;
                                                }
                                                boolean z15 = z12;
                                                if ("}".equals(str5)) {
                                                    arrayList3.add(bVar);
                                                }
                                                r92 = z15;
                                                z9 = false;
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
                            nVar = this;
                        }
                    }
                }
            }
        } catch (t0 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public /* synthetic */ n(int i7, boolean z9) {
        this.a = i7;
    }

    @Override // org.telegram.ui.Components.r51
    public void onRenderedFirstFrame() {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
        if (secretMediaViewer.a0) {
            return;
        }
        secretMediaViewer.a0 = true;
        secretMediaViewer.e.invalidate();
    }

    public /* synthetic */ n(Object obj, Object obj2, boolean z9, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    public n(IBinder iBinder) {
        this.a = 7;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.b = new Messenger(iBinder);
            this.c = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.c = new m6.g(iBinder);
            this.b = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    public /* synthetic */ n(Object obj) {
        this.a = 26;
        this.c = obj;
        this.b = new ArrayList();
    }

    public n(n6.e eVar) {
        this.a = 27;
        this.b = new SparseIntArray();
        q6.m.g(eVar);
        this.c = eVar;
    }

    public n(ja.a[] aVarArr) {
        this.a = 2;
        this.b = aVarArr;
        this.c = new w7.s(11, false);
    }

    public n(byte[] bArr) {
        this.a = 24;
        this.b = bArr;
    }

    @Override // org.telegram.ui.Components.mm0
    public void D() {
    }

    @Override // fi.za
    public /* synthetic */ void V() {
    }

    @Override // org.telegram.ui.i7
    public void clear() {
    }

    @Override // org.telegram.ui.i7
    public void d() {
    }

    @Override // org.telegram.ui.Components.fj0
    public void i() {
    }

    @Override // org.telegram.ui.Components.xn
    public /* synthetic */ void n() {
    }

    @Override // fi.za
    public /* synthetic */ void r() {
    }

    @Override // li.f1
    public /* synthetic */ void r0() {
    }

    @Override // c4.m
    public /* synthetic */ void reset() {
    }

    public n(k0 k0Var) {
        this.a = 6;
        this.b = k0Var;
        this.c = new h2.x();
    }

    public n(vd0 vd0Var) {
        this.a = 17;
        this.c = vd0Var;
        this.b = new pb0(this, 6);
    }

    public n(Context context) {
        this.a = 0;
        p pVar = new p();
        this.b = context.getApplicationContext();
        this.c = pVar;
    }

    @Override // fi.za
    public /* synthetic */ void G(float f10) {
    }

    @Override // fi.za
    public /* synthetic */ void J(long j3) {
    }

    @Override // fi.za
    public /* synthetic */ void K(boolean z9) {
    }

    @Override // fi.za
    public /* synthetic */ void O(float f10) {
    }

    @Override // fi.za
    public /* synthetic */ void Q(float f10) {
    }

    @Override // fi.za
    public /* synthetic */ void T(float f10) {
    }

    @Override // fi.za
    public /* synthetic */ void a0(float f10) {
    }

    @Override // fi.za
    public /* synthetic */ void e(int i7) {
    }

    @Override // fi.za
    public /* synthetic */ void e0(long j3) {
    }

    @Override // fi.za
    public /* synthetic */ void g(float f10) {
    }

    @Override // fi.za
    public /* synthetic */ void h(float f10) {
    }

    @Override // org.telegram.ui.Components.r51
    public /* synthetic */ void onSeekFinished(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.r51
    public /* synthetic */ void onSeekStarted(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.r51
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // org.telegram.ui.Components.fj0
    public void q(float f10) {
    }

    @Override // fi.za
    public /* synthetic */ void u(float f10) {
    }

    @Override // fi.za
    public /* synthetic */ void x(boolean z9) {
    }

    public n(Handler handler, n2.s sVar) {
        this.a = 8;
        if (sVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.b = handler;
        this.c = sVar;
    }

    public n(gx gxVar) {
        this.a = 19;
        this.c = gxVar;
        this.b = new Rect();
    }

    public n(Attributes attributes, HashMap hashMap) {
        this.a = 13;
        this.c = attributes;
        String l10 = sz.l("style", attributes);
        if (l10 != null) {
            ArrayList arrayList = new ArrayList();
            this.b = arrayList;
            arrayList.add(new qz(l10));
            return;
        }
        String l11 = sz.l("class", attributes);
        if (l11 != null) {
            this.b = new ArrayList();
            for (String str : l11.split(" ")) {
                qz qzVar = (qz) hashMap.get(str.trim());
                if (qzVar != null) {
                    ((ArrayList) this.b).add(qzVar);
                }
            }
        }
    }

    @Override // fi.za
    public /* synthetic */ void C(float f10, int i7) {
    }

    @Override // fi.za
    public /* synthetic */ void N(float f10, int i7) {
    }

    @Override // fi.za
    public /* synthetic */ void S(float f10, int i7) {
    }

    @Override // fi.za
    public /* synthetic */ void b0(int i7, long j3) {
    }

    @Override // fi.za
    public /* synthetic */ void j(long j3, boolean z9) {
    }

    public n(int i7) {
        this.a = i7;
        switch (i7) {
            case 4:
                this.b = new h2.x();
                this.c = new l4.a();
                break;
            default:
                this.b = new HashMap();
                this.c = l2.c.b;
                break;
        }
    }
}
