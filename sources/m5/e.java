package m5;

import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.media.session.a0;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.t0;
import androidx.lifecycle.z;
import e0.h;
import e9.l0;
import e9.n0;
import g2.l;
import j9.u;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import k2.m0;
import ki.j;
import ki.k;
import mg.c2;
import n2.p;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.b00;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d00;
import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
import org.telegram.messenger.me;
import org.telegram.messenger.ot;
import org.telegram.messenger.pi;
import org.telegram.messenger.q20;
import org.telegram.messenger.ui;
import org.telegram.messenger.vp;
import org.telegram.messenger.zr;
import org.telegram.messenger.zs;
import org.telegram.tgnet.SerializedData;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.Cells.j4;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.eb0;
import org.telegram.ui.Components.fo;
import org.telegram.ui.Components.ix0;
import org.telegram.ui.Components.jk0;
import org.telegram.ui.Components.mn0;
import org.telegram.ui.Components.pe0;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.z60;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.c8;
import org.telegram.ui.e8;
import org.telegram.ui.et0;
import org.telegram.ui.ey;
import org.telegram.ui.g5;
import org.telegram.ui.h8;
import org.telegram.ui.i7;
import org.telegram.ui.iy;
import org.telegram.ui.k4;
import org.telegram.ui.r01;
import org.telegram.ui.s6;
import org.telegram.ui.un;
import org.telegram.ui.uy0;
import org.telegram.ui.yu;
import org.telegram.ui.zu;
import org.xml.sax.Attributes;
import p2.m;
import p2.t;
import qh.x;
import qh.y;
import s4.h1;
import s4.i1;
import s5.g;
import s5.i;
import v7.a8;
import vh.t8;
import w7.na;
import y2.n;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class e implements n5.b, mn0, zr, fo, t8, i7, jk0, s61, t, x, n {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ e(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    public static e M(int i10, boolean z10, byte[] bArr, byte[] bArr2) {
        e eVar = new e(7, false);
        if (bArr == null || bArr.length == 0) {
            eVar.c = null;
            eVar.b = null;
            return eVar;
        }
        int i11 = z10 ? 8 : 0;
        if (i10 != 1) {
            if (i10 != 2) {
                return eVar;
            }
            SerializedData serializedData = new SerializedData();
            serializedData.writeBytes(bArr2, 0, 16);
            serializedData.writeBytes(bArr, i11, 36);
            byte[] byteArray = serializedData.toByteArray();
            Pattern pattern = Utilities.a;
            byte[] o10 = Utilities.o(byteArray.length, byteArray);
            serializedData.cleanup();
            SerializedData serializedData2 = new SerializedData();
            serializedData2.writeBytes(bArr, i11 + 40, 36);
            serializedData2.writeBytes(bArr2, 0, 16);
            byte[] o11 = Utilities.o(r9.length, serializedData2.toByteArray());
            serializedData2.cleanup();
            SerializedData serializedData3 = new SerializedData();
            serializedData3.writeBytes(o10, 0, 8);
            serializedData3.writeBytes(o11, 8, 16);
            serializedData3.writeBytes(o10, 24, 8);
            eVar.b = serializedData3.toByteArray();
            serializedData3.cleanup();
            SerializedData serializedData4 = new SerializedData();
            serializedData4.writeBytes(o11, 0, 8);
            serializedData4.writeBytes(o10, 8, 16);
            serializedData4.writeBytes(o11, 24, 8);
            eVar.c = serializedData4.toByteArray();
            serializedData4.cleanup();
            return eVar;
        }
        SerializedData serializedData5 = new SerializedData();
        serializedData5.writeBytes(bArr2);
        serializedData5.writeBytes(bArr, i11, 32);
        byte[] n10 = Utilities.n(serializedData5.toByteArray());
        serializedData5.cleanup();
        SerializedData serializedData6 = new SerializedData();
        serializedData6.writeBytes(bArr, i11 + 32, 16);
        serializedData6.writeBytes(bArr2);
        serializedData6.writeBytes(bArr, i11 + 48, 16);
        byte[] n11 = Utilities.n(serializedData6.toByteArray());
        serializedData6.cleanup();
        SerializedData serializedData7 = new SerializedData();
        serializedData7.writeBytes(bArr, i11 + 64, 32);
        serializedData7.writeBytes(bArr2);
        byte[] n12 = Utilities.n(serializedData7.toByteArray());
        serializedData7.cleanup();
        SerializedData serializedData8 = new SerializedData();
        serializedData8.writeBytes(bArr2);
        serializedData8.writeBytes(bArr, i11 + 96, 32);
        byte[] n13 = Utilities.n(serializedData8.toByteArray());
        serializedData8.cleanup();
        SerializedData serializedData9 = new SerializedData();
        serializedData9.writeBytes(n10, 0, 8);
        serializedData9.writeBytes(n11, 8, 12);
        serializedData9.writeBytes(n12, 4, 12);
        eVar.b = serializedData9.toByteArray();
        serializedData9.cleanup();
        SerializedData serializedData10 = new SerializedData();
        serializedData10.writeBytes(n10, 8, 12);
        serializedData10.writeBytes(n11, 0, 8);
        serializedData10.writeBytes(n12, 16, 4);
        serializedData10.writeBytes(n13, 0, 8);
        eVar.c = serializedData10.toByteArray();
        serializedData10.cleanup();
        return eVar;
    }

    @Override // org.telegram.ui.Components.fo
    public void E(int i10) {
        un unVar = (un) this.c;
        ((z60) this.b).u();
        if (i10 != 0) {
            unVar.getNotificationsController().H(unVar.j6, i10, unVar.b());
            if (cc.a(unVar)) {
                cc.z(unVar, 5, i10, unVar.getResourceProvider()).j();
                return;
            }
            return;
        }
        if (unVar.getMessagesController().q2(unVar.j6, unVar.b(), null)) {
            unVar.uc(true);
        }
        if (cc.a(unVar)) {
            cc.z(unVar, 4, i10, unVar.getResourceProvider()).j();
        }
    }

    public byte[] G(n3.a aVar) {
        DataOutputStream dataOutputStream = (DataOutputStream) this.c;
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.b;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(aVar.a);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeBytes(aVar.b);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(aVar.c);
            dataOutputStream.writeLong(aVar.d);
            dataOutputStream.write(aVar.e);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public View I(int i10, int i11, int i12, int i13) {
        h1 h1Var = (h1) this.c;
        i1 i1Var = (i1) this.b;
        int s10 = i1Var.s();
        int y3 = i1Var.y();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View C = i1Var.C(i10);
            int k10 = i1Var.k(C);
            int E = i1Var.E(C);
            h1Var.b = s10;
            h1Var.c = y3;
            h1Var.d = k10;
            h1Var.e = E;
            if (i12 != 0) {
                h1Var.a = i12;
                if (h1Var.a()) {
                    return C;
                }
            }
            if (i13 != 0) {
                h1Var.a = i13;
                if (h1Var.a()) {
                    view = C;
                }
            }
            i10 += i14;
        }
        return view;
    }

    @Override // p2.t
    public n M1() {
        return new e(25, ((t) this.b).M1(), (List) this.c);
    }

    public String P(String str) {
        ArrayList arrayList = (ArrayList) this.b;
        String str2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                str2 = (String) ((b00) arrayList.get(i10)).a.get(str);
                if (str2 != null) {
                    break;
                }
            }
        }
        return str2 == null ? d00.l(str, (Attributes) this.c) : str2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0080, code lost:
    
        if (r5.equals("red") == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Integer Q(String str) {
        String P = P(str);
        if (P == null) {
            return null;
        }
        char c10 = 1;
        try {
            return Integer.valueOf(Integer.parseInt(P.substring(1), 16));
        } catch (NumberFormatException unused) {
            double[] dArr = d00.a;
            String lowerCase = P.toLowerCase();
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

    public String R(String str) {
        String str2 = (String) this.c;
        Resources resources = (Resources) this.b;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public boolean S(View view) {
        h1 h1Var = (h1) this.c;
        i1 i1Var = (i1) this.b;
        int s10 = i1Var.s();
        int y3 = i1Var.y();
        int k10 = i1Var.k(view);
        int E = i1Var.E(view);
        h1Var.b = s10;
        h1Var.c = y3;
        h1Var.d = k10;
        h1Var.e = E;
        h1Var.a = 24579;
        return h1Var.a();
    }

    public void T(long j10, byte[] bArr) {
        h hVar = (h) this.c;
        if (hVar.b) {
            hVar.b = false;
            ((k) hVar.e).h();
            return;
        }
        k kVar = (k) hVar.e;
        kVar.getClass();
        k.q();
        j jVar = kVar.z;
        File file = (kVar.G != 5 || jVar == null) ? null : jVar.b;
        if (file == null) {
            me meVar = (me) this.b;
            IllegalStateException illegalStateException = new IllegalStateException("Preview file is unavailable");
            MediaController mediaController = meVar.a;
            String[] strArr = MediaController.U1;
            f8.e("AudioRecorderV2 failed", illegalStateException);
            zs.f(mediaController.g1).k(zs.m2, Integer.valueOf(mediaController.f1));
            mediaController.x(false);
            return;
        }
        MediaController mediaController2 = ((me) this.b).a;
        mediaController2.i1 = file;
        mediaController2.j1 = j10;
        mediaController2.G0(file, j10, bArr);
        ui.b0(mediaController2.g1).B1(mediaController2.l1, mediaController2.m1, pi.a(mediaController2, file.getAbsolutePath(), mediaController2.I1));
        zs.f(mediaController2.g1).k(zs.o2, new Object[0]);
        zs.f(mediaController2.g1).k(zs.s2, Integer.valueOf(mediaController2.f1), mediaController2.e1, file.getAbsolutePath());
        mediaController2.Y(false);
        MediaController.j0(false);
    }

    public void U(Exception exc, boolean z10) {
        this.c = null;
        HashSet hashSet = (HashSet) this.b;
        n0 u10 = n0.u(hashSet);
        hashSet.clear();
        l0 listIterator = u10.listIterator(0);
        while (listIterator.hasNext()) {
            n2.b bVar = (n2.b) listIterator.next();
            bVar.getClass();
            bVar.l(z10 ? 1 : 3, exc);
        }
    }

    public void V(o0.f fVar) {
        androidx.biometric.n nVar = (androidx.biometric.n) this.c;
        za.c cVar = (za.c) this.b;
        int i10 = fVar.b;
        if (i10 != 0) {
            nVar.execute(new c2(cVar, i10));
        } else {
            nVar.execute(new u(22, cVar, fVar.a));
        }
    }

    public void W(n2.b bVar) {
        ((HashSet) this.b).add(bVar);
        if (((n2.b) this.c) != null) {
            return;
        }
        this.c = bVar;
        p u10 = bVar.b.u();
        bVar.z = u10;
        android.support.v4.media.session.f fVar = bVar.s;
        String str = e2.l0.a;
        u10.getClass();
        fVar.getClass();
        fVar.obtainMessage(1, new n2.a(u2.u.g.getAndIncrement(), true, SystemClock.elapsedRealtime(), u10)).sendToTarget();
    }

    @Override // org.telegram.ui.i7
    public void a(s6 s6Var, sh.a aVar, boolean z10) {
        zu zuVar = (zu) this.c;
        yu yuVar = zuVar.P1;
        if (aVar != null) {
            ((sh.b) this.b).i(aVar);
            zuVar.W1.e();
            sh.b bVar = zuVar.Y1;
            ix0[] ix0VarArr = zuVar.T1;
            org.telegram.ui.Cells.c2[] c2VarArr = zuVar.U1;
            org.telegram.ui.Cells.c2 c2Var = c2VarArr[0];
            if (c2Var != null) {
                ix0 ix0Var = ix0VarArr[0];
                boolean z11 = bVar.m;
                ix0Var.c = z11;
                c2Var.c(z11, true);
            }
            org.telegram.ui.Cells.c2 c2Var2 = c2VarArr[1];
            if (c2Var2 != null) {
                ix0 ix0Var2 = ix0VarArr[1];
                boolean z12 = bVar.n;
                ix0Var2.c = z12;
                c2Var2.c(z12, true);
            }
            org.telegram.ui.Cells.c2 c2Var3 = c2VarArr[2];
            if (c2Var3 != null) {
                ix0 ix0Var3 = ix0VarArr[2];
                boolean z13 = bVar.o;
                ix0Var3.c = z13;
                c2Var3.c(z13, true);
            }
            org.telegram.ui.Cells.c2 c2Var4 = c2VarArr[3];
            if (c2Var4 != null) {
                ix0 ix0Var4 = ix0VarArr[3];
                boolean z14 = bVar.p;
                ix0Var4.c = z14;
                c2Var4.c(z14, true);
            }
            org.telegram.ui.Cells.c2 c2Var5 = c2VarArr[4];
            if (c2Var5 != null) {
                ix0 ix0Var5 = ix0VarArr[4];
                boolean z15 = bVar.q;
                ix0Var5.c = z15;
                c2Var5.c(z15, true);
            }
            zuVar.S1.a(yuVar.d(), true);
            yuVar.c(true);
        }
    }

    @Override // p2.t
    public n a2(p2.p pVar, m mVar) {
        return new e(25, ((t) this.b).a2(pVar, mVar), (List) this.c);
    }

    @Override // org.telegram.ui.Components.jk0
    public boolean b(float f7, float f10, int i10, View view) {
        Rect rect = (Rect) this.b;
        iy iyVar = (iy) this.c;
        int i11 = 0;
        if (iyVar.getParentActivity() != null && (view instanceof j4)) {
            ((ImageView) view.getTag(R.id.object_tag)).getHitRect(rect);
            if (!rect.contains((int) f7, (int) f10)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(iyVar.getParentActivity());
                alertDialog$Builder.f(new CharSequence[]{cd.L0(2131751599, null)}, new ey(this, i10, i11));
                iyVar.showDialog(alertDialog$Builder.a);
                return true;
            }
        }
        return false;
    }

    @Override // qh.x
    public void c(String str) {
        ((q20) this.b).a(str);
    }

    @Override // org.telegram.ui.Components.fo
    public void dismiss() {
        switch (this.a) {
            case 11:
                ((z60) this.b).u();
                break;
            default:
                ((zu) this.c).dismiss();
                break;
        }
    }

    @Override // y2.n
    public Object g1(Uri uri, l lVar) {
        t2.a aVar = (t2.a) ((n) this.b).g1(uri, lVar);
        List list = (List) this.c;
        return (list == null || list.isEmpty()) ? aVar : (t2.a) aVar.a(list);
    }

    @Override // zc.a
    public Object get() {
        switch (this.a) {
            case 0:
                return new d((Context) ((m0) this.b).a, (li.k) ((l2.f) this.c).get());
            default:
                int i10 = 21;
                t7.u uVar = new t7.u(i10);
                oa.d dVar = new oa.d(i10);
                Object obj = ((zc.a) this.b).get();
                zc.a aVar = (zc.a) this.c;
                return new g(uVar, dVar, s5.a.f, (i) obj, aVar);
        }
    }

    @Override // org.telegram.ui.Components.mn0
    public /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // org.telegram.messenger.zr
    public void i(boolean z10) {
        e8 e8Var = ((c8) this.c).b;
        e8Var.y.finishFragment();
        un unVar = (un) this.b;
        h8 h8Var = e8Var.y;
        unVar.a8(h8Var.P, h8Var.Q + 86400, z10);
    }

    @Override // org.telegram.ui.Components.mn0
    public void k(boolean z10, float f7) {
        ((TextView) this.b).setText("Alpha " + g5.l1);
        g5.l1 = f7;
        ((g5) this.c).i1.L();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.List] */
    public ArrayList l() {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        m2.t tVar = (m2.t) this.c;
        Context context = (Context) this.b;
        Class cls = (Class) tVar.b;
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
            arrayList2.add(new r9.c((String) it.next(), 0));
        }
        return arrayList2;
    }

    public void o(String str, PrintWriter printWriter) {
        w1.b bVar = (w1.b) this.c;
        if (bVar.d.c <= 0) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Loaders:");
        String str2 = str + "    ";
        int i10 = 0;
        while (true) {
            a0.m mVar = bVar.d;
            if (i10 >= mVar.c) {
                return;
            }
            w1.a aVar = (w1.a) mVar.b[i10];
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
                b2.u uVar = aVar.n;
                uVar.getClass();
                printWriter.print(str2 + "  ");
                printWriter.print("mDeliveredData=");
                printWriter.println(uVar.b);
            }
            printWriter.print(str2);
            printWriter.print("mData=");
            a6.d dVar2 = aVar.l;
            Object obj = aVar.e;
            Object obj2 = obj != z.k ? obj : null;
            dVar2.getClass();
            StringBuilder sb2 = new StringBuilder(64);
            if (obj2 == null) {
                sb2.append("null");
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

    @Override // org.telegram.ui.Components.s61
    public void onError(u61 u61Var, Exception exc) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
        int i10 = secretMediaViewer.Z;
        if (i10 <= 0) {
            f8.g(exc, true);
            return;
        }
        secretMediaViewer.Z = i10 - 1;
        i0.h3(new et0(29, this, (File) this.b), 100L);
    }

    @Override // org.telegram.ui.Components.s61
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.s61
    public void onStateChanged(boolean z10, int i10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
        r01 r01Var = secretMediaViewer.g1;
        if (secretMediaViewer.D == null || secretMediaViewer.f0 == null) {
            return;
        }
        i0.r(r01Var);
        i0.g3(r01Var);
        if (i10 == 4 || i10 == 1) {
            try {
                secretMediaViewer.b.getWindow().clearFlags(128);
            } catch (Exception e) {
                f8.g(e, true);
            }
        } else {
            try {
                secretMediaViewer.b.getWindow().addFlags(128);
            } catch (Exception e7) {
                f8.g(e7, true);
            }
        }
        if (i10 == 3 && secretMediaViewer.x.getVisibility() != 0) {
            secretMediaViewer.x.setVisibility(0);
        }
        if (secretMediaViewer.D.d0() && i10 != 4) {
            if (secretMediaViewer.E) {
                return;
            }
            secretMediaViewer.E = true;
        } else if (secretMediaViewer.E) {
            secretMediaViewer.E = false;
            if (i10 == 4) {
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

    @Override // org.telegram.ui.Components.s61
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.s61
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        k4 k4Var = ((SecretMediaViewer) this.c).x;
        if (k4Var != null) {
            k4Var.a(i11 == 0 ? 1.0f : (i10 * f7) / i11, 0);
        }
    }

    @Override // org.telegram.ui.Components.mn0
    public /* synthetic */ int p0() {
        return 0;
    }

    @Override // vh.t8
    public void q(boolean z10, float f7) {
        eb0 eb0Var = (eb0) this.b;
        pe0 pe0Var = (pe0) this.c;
        u61 u61Var = pe0Var.d;
        if (u61Var == null) {
            return;
        }
        float max = 2.8f / Math.max(60L, r2);
        long U = (long) ((((f7 / (1.0f - max)) * max) + f7) * u61Var.U());
        pe0Var.e = U;
        pe0Var.d.q0(U, !z10);
        if (z10) {
            return;
        }
        i0.r(eb0Var);
        i0.h3(eb0Var, 120L);
    }

    @Override // qh.x
    public void s(y yVar) {
        i0.E2(yVar);
        ((Runnable) this.c).run();
    }

    public String toString() {
        switch (this.a) {
            case 20:
                return "Bounds{lower=" + ((i0.c) this.b) + " upper=" + ((i0.c) this.c) + "}";
            case 27:
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

    @Override // org.telegram.ui.Components.fo
    public void v() {
        ((z60) this.b).u();
        un unVar = (un) this.c;
        unVar.uc(true);
        cc.A(unVar, unVar.getMessagesController().q2(unVar.j6, unVar.b(), null), unVar.xa).j();
    }

    @Override // org.telegram.ui.Components.fo
    public void x() {
        ((z60) this.b).u();
        un unVar = (un) this.c;
        if (unVar.j6 == 0 || unVar.f4 == 3) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", unVar.j6);
        if (unVar.b() != 0) {
            bundle.putLong("topic_id", unVar.b());
        }
        unVar.presentFragment(new uy0(bundle, unVar.xa));
    }

    @Override // org.telegram.ui.Components.fo
    public void y() {
        int i10;
        ((z60) this.b).u();
        un unVar = (un) this.c;
        i10 = ((k2) unVar).currentAccount;
        SharedPreferences sharedPreferences = vp.r1(i10).e7;
        boolean z10 = sharedPreferences.getBoolean("sound_enabled_" + ot.v(unVar.j6, unVar.b(), false), true);
        boolean z11 = !z10;
        sharedPreferences.edit().putBoolean("sound_enabled_" + ot.v(unVar.j6, unVar.b(), false), z11).apply();
        if (cc.a(unVar)) {
            cc.S(z10 ? 1 : 0, unVar, unVar.getResourceProvider()).j();
        }
        unVar.kd(false);
    }

    public /* synthetic */ e(int i10, boolean z10) {
        this.a = i10;
    }

    @Override // org.telegram.ui.Components.s61
    public void onRenderedFirstFrame() {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
        if (secretMediaViewer.a0) {
            return;
        }
        secretMediaViewer.a0 = true;
        secretMediaViewer.e.invalidate();
    }

    public /* synthetic */ e(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    public e(Context context) {
        this.a = 3;
        n6.l.g(context);
        Resources resources = context.getResources();
        this.b = resources;
        this.c = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    }

    public e(q5.d dVar) {
        this.a = 28;
        this.c = new a8();
        this.b = dVar;
        na.b();
    }

    public e(androidx.lifecycle.t tVar, t0 t0Var) {
        this.a = 27;
        this.b = tVar;
        this.c = (w1.b) new a0(t0Var, w1.b.f).n(w1.b.class);
    }

    public e(pe0 pe0Var) {
        this.a = 12;
        this.c = pe0Var;
        this.b = new eb0(this, 9);
    }

    public e(String str, String str2) {
        this.a = 26;
        this.b = str;
        this.c = str2;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("userId should not be empty");
        }
    }

    public e(i1 i1Var) {
        this.a = 22;
        this.b = i1Var;
        h1 h1Var = new h1();
        h1Var.a = 0;
        this.c = h1Var;
    }

    @Override // org.telegram.ui.Components.mn0
    public void C() {
    }

    @Override // vh.t8
    public /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.i7
    public void clear() {
    }

    @Override // org.telegram.ui.i7
    public void d() {
    }

    @Override // org.telegram.ui.Components.jk0
    public void g() {
    }

    @Override // vh.t8
    public /* synthetic */ void m() {
    }

    @Override // org.telegram.ui.Components.fo
    public /* synthetic */ void n() {
    }

    public e(int i10) {
        this.a = i10;
        switch (i10) {
            case 2:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.b = byteArrayOutputStream;
                this.c = new DataOutputStream(byteArrayOutputStream);
                break;
            default:
                this.b = new HashSet();
                break;
        }
    }

    @Override // vh.t8
    public /* synthetic */ void A(boolean z10) {
    }

    @Override // vh.t8
    public /* synthetic */ void D(float f7) {
    }

    @Override // vh.t8
    public /* synthetic */ void F(float f7) {
    }

    @Override // vh.t8
    public /* synthetic */ void J(float f7) {
    }

    @Override // vh.t8
    public /* synthetic */ void L(float f7) {
    }

    @Override // vh.t8
    public /* synthetic */ void O(long j10) {
    }

    @Override // vh.t8
    public /* synthetic */ void e(int i10) {
    }

    @Override // vh.t8
    public /* synthetic */ void f(float f7) {
    }

    @Override // vh.t8
    public /* synthetic */ void h(float f7) {
    }

    @Override // org.telegram.ui.Components.s61
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.s61
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.s61
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // org.telegram.ui.Components.jk0
    public void p(float f7) {
    }

    @Override // vh.t8
    public /* synthetic */ void r(float f7) {
    }

    @Override // vh.t8
    public /* synthetic */ void t(boolean z10) {
    }

    @Override // vh.t8
    public /* synthetic */ void w(float f7) {
    }

    @Override // vh.t8
    public /* synthetic */ void z(long j10) {
    }

    public e(iy iyVar) {
        this.a = 14;
        this.c = iyVar;
        this.b = new Rect();
    }

    public e(Attributes attributes, HashMap hashMap) {
        this.a = 8;
        this.c = attributes;
        String l4 = d00.l("style", attributes);
        if (l4 != null) {
            ArrayList arrayList = new ArrayList();
            this.b = arrayList;
            arrayList.add(new b00(l4));
            return;
        }
        String l10 = d00.l("class", attributes);
        if (l10 != null) {
            this.b = new ArrayList();
            for (String str : l10.split(" ")) {
                b00 b00Var = (b00) hashMap.get(str.trim());
                if (b00Var != null) {
                    ((ArrayList) this.b).add(b00Var);
                }
            }
        }
    }

    @Override // vh.t8
    public /* synthetic */ void B(float f7, int i10) {
    }

    @Override // vh.t8
    public /* synthetic */ void H(float f7, int i10) {
    }

    @Override // vh.t8
    public /* synthetic */ void N(int i10, long j10) {
    }

    @Override // vh.t8
    public /* synthetic */ void j(long j10, boolean z10) {
    }

    @Override // vh.t8
    public /* synthetic */ void u(float f7, int i10) {
    }
}
