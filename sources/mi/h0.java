package mi;

import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.TaskCompletionSource;
import gi.za;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ge;
import org.telegram.messenger.gi;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.ir;
import org.telegram.messenger.iz;
import org.telegram.messenger.kz;
import org.telegram.messenger.li;
import org.telegram.messenger.us;
import org.telegram.messenger.ye;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.dw0;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.m51;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.od0;
import org.telegram.ui.Components.om0;
import org.telegram.ui.Components.wn;
import org.telegram.ui.Components.zh;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.cx;
import org.telegram.ui.d8;
import org.telegram.ui.f8;
import org.telegram.ui.i8;
import org.telegram.ui.j7;
import org.telegram.ui.qv0;
import org.telegram.ui.t6;
import org.telegram.ui.tt;
import org.telegram.ui.ty0;
import org.telegram.ui.ut;
import org.telegram.ui.wm;
import org.telegram.ui.xw;
import org.telegram.ui.yw0;
import org.xml.sax.Attributes;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class h0 implements g1, g2.e, om0, ir, wn, za, j7, ij0, k51, com.google.android.gms.common.api.internal.p, p5.b, zh {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ h0(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.c = obj;
        this.b = obj2;
    }

    public static h0 x(int i3, boolean z10, byte[] bArr, byte[] bArr2) {
        h0 h0Var = new h0(6, false);
        if (bArr == null || bArr.length == 0) {
            h0Var.c = null;
            h0Var.b = null;
            return h0Var;
        }
        int i10 = z10 ? 8 : 0;
        if (i3 != 1) {
            if (i3 != 2) {
                return h0Var;
            }
            SerializedData serializedData = new SerializedData();
            serializedData.writeBytes(bArr2, 0, 16);
            serializedData.writeBytes(bArr, i10, 36);
            byte[] byteArray = serializedData.toByteArray();
            Pattern pattern = Utilities.a;
            byte[] o10 = Utilities.o(byteArray.length, byteArray);
            serializedData.cleanup();
            SerializedData serializedData2 = new SerializedData();
            serializedData2.writeBytes(bArr, i10 + 40, 36);
            serializedData2.writeBytes(bArr2, 0, 16);
            byte[] o11 = Utilities.o(r9.length, serializedData2.toByteArray());
            serializedData2.cleanup();
            SerializedData serializedData3 = new SerializedData();
            serializedData3.writeBytes(o10, 0, 8);
            serializedData3.writeBytes(o11, 8, 16);
            serializedData3.writeBytes(o10, 24, 8);
            h0Var.b = serializedData3.toByteArray();
            serializedData3.cleanup();
            SerializedData serializedData4 = new SerializedData();
            serializedData4.writeBytes(o11, 0, 8);
            serializedData4.writeBytes(o10, 8, 16);
            serializedData4.writeBytes(o11, 24, 8);
            h0Var.c = serializedData4.toByteArray();
            serializedData4.cleanup();
            return h0Var;
        }
        SerializedData serializedData5 = new SerializedData();
        serializedData5.writeBytes(bArr2);
        serializedData5.writeBytes(bArr, i10, 32);
        byte[] n4 = Utilities.n(serializedData5.toByteArray());
        serializedData5.cleanup();
        SerializedData serializedData6 = new SerializedData();
        serializedData6.writeBytes(bArr, i10 + 32, 16);
        serializedData6.writeBytes(bArr2);
        serializedData6.writeBytes(bArr, i10 + 48, 16);
        byte[] n10 = Utilities.n(serializedData6.toByteArray());
        serializedData6.cleanup();
        SerializedData serializedData7 = new SerializedData();
        serializedData7.writeBytes(bArr, i10 + 64, 32);
        serializedData7.writeBytes(bArr2);
        byte[] n11 = Utilities.n(serializedData7.toByteArray());
        serializedData7.cleanup();
        SerializedData serializedData8 = new SerializedData();
        serializedData8.writeBytes(bArr2);
        serializedData8.writeBytes(bArr, i10 + 96, 32);
        byte[] n12 = Utilities.n(serializedData8.toByteArray());
        serializedData8.cleanup();
        SerializedData serializedData9 = new SerializedData();
        serializedData9.writeBytes(n4, 0, 8);
        serializedData9.writeBytes(n10, 8, 12);
        serializedData9.writeBytes(n11, 4, 12);
        h0Var.b = serializedData9.toByteArray();
        serializedData9.cleanup();
        SerializedData serializedData10 = new SerializedData();
        serializedData10.writeBytes(n4, 8, 12);
        serializedData10.writeBytes(n10, 0, 8);
        serializedData10.writeBytes(n11, 16, 4);
        serializedData10.writeBytes(n12, 0, 8);
        h0Var.c = serializedData10.toByteArray();
        serializedData10.cleanup();
        return h0Var;
    }

    @Override // mi.g1
    public void A(int i3, int i10) {
        ((j0) this.b).q1(i3, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CctBackendFactory B(String str) {
        Bundle bundle;
        Map map;
        PackageManager packageManager;
        if (((Map) this.c) == null) {
            Context context = (Context) this.b;
            try {
                packageManager = context.getPackageManager();
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
            }
            if (packageManager == null) {
                Log.w("BackendRegistry", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                if (serviceInfo == null) {
                    Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                    if (bundle != null) {
                        Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                        map = Collections.EMPTY_MAP;
                    } else {
                        HashMap hashMap = new HashMap();
                        for (String str2 : bundle.keySet()) {
                            Object obj = bundle.get(str2);
                            if ((obj instanceof String) && str2.startsWith("backend:")) {
                                for (String str3 : ((String) obj).split(",", -1)) {
                                    String trim = str3.trim();
                                    if (!trim.isEmpty()) {
                                        hashMap.put(trim, str2.substring(8));
                                    }
                                }
                            }
                        }
                        map = hashMap;
                    }
                    this.c = map;
                }
            }
            bundle = null;
            if (bundle != null) {
            }
            this.c = map;
        }
        String str4 = (String) ((Map) this.c).get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e10) {
            Log.w("BackendRegistry", "Class " + str4 + " is not found.", e10);
            return null;
        } catch (IllegalAccessException e11) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e11);
            return null;
        } catch (InstantiationException e12) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e12);
            return null;
        } catch (NoSuchMethodException e13) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e13);
            return null;
        } catch (InvocationTargetException e14) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e14);
            return null;
        }
    }

    @Override // mi.g1
    public void B1(Editable editable) {
        ((k0) this.c).i();
        ((j0) this.b).F1();
    }

    public String E(String str) {
        ArrayList arrayList = (ArrayList) this.b;
        String str2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                str2 = (String) ((iz) arrayList.get(i3)).a.get(str);
                if (str2 != null) {
                    break;
                }
            }
        }
        return str2 == null ? kz.l(str, (Attributes) this.c) : str2;
    }

    public File F() {
        if (((File) this.b) == null) {
            synchronized (this) {
                try {
                    if (((File) this.b) == null) {
                        String str = "PersistedInstallation." + ((n9.h) this.c).d() + ".json";
                        n9.h hVar = (n9.h) this.c;
                        hVar.a();
                        File file = new File(hVar.a.getNoBackupFilesDir(), str);
                        this.b = file;
                        if (file.exists()) {
                            return (File) this.b;
                        }
                        n9.h hVar2 = (n9.h) this.c;
                        hVar2.a();
                        File file2 = new File(hVar2.a.getFilesDir(), str);
                        if (file2.exists() && !file2.renameTo((File) this.b)) {
                            Log.e("PersistedInstallation", "Unable to move the file from back up to non back up directory", new IOException("Unable to move the file from back up to non back up directory"));
                            return file2;
                        }
                    }
                } finally {
                }
            }
        }
        return (File) this.b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0080, code lost:
    
        if (r5.equals("red") == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Integer G(String str) {
        String E = E(str);
        if (E == null) {
            return null;
        }
        char c2 = 1;
        try {
            return Integer.valueOf(Integer.parseInt(E.substring(1), 16));
        } catch (NumberFormatException unused) {
            double[] dArr = kz.a;
            String lowerCase = E.toLowerCase();
            lowerCase.getClass();
            switch (lowerCase.hashCode()) {
                case -734239628:
                    if (lowerCase.equals("yellow")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 112785:
                    break;
                case 3027034:
                    if (lowerCase.equals("blue")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3068707:
                    if (lowerCase.equals("cyan")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3181155:
                    if (lowerCase.equals("gray")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 93818879:
                    if (lowerCase.equals("black")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 98619139:
                    if (lowerCase.equals("green")) {
                        c2 = 6;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 113101865:
                    if (lowerCase.equals("white")) {
                        c2 = 7;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 828922025:
                    if (lowerCase.equals("magenta")) {
                        c2 = '\b';
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
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

    public String J(String str) {
        String str2 = (String) this.c;
        Resources resources = (Resources) this.b;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    @Override // g2.e
    public l9.y L(d2.q0 q0Var) {
        Uri uri;
        byte[] bArr;
        k4.j jVar = (k4.j) this.c;
        if (jVar != null && (((uri = (Uri) jVar.b) != null && uri.equals(q0Var.n)) || ((bArr = (byte[]) jVar.a) != null && Arrays.equals(bArr, q0Var.k)))) {
            l9.y yVar = (l9.y) ((k4.j) this.c).c;
            yVar.getClass();
            return yVar;
        }
        l9.y L = ((g2.e) this.b).L(q0Var);
        if (L == null) {
            return null;
        }
        k4.j jVar2 = new k4.j();
        jVar2.a = q0Var.k;
        jVar2.b = q0Var.n;
        jVar2.c = L;
        this.c = jVar2;
        return L;
    }

    @Override // org.telegram.ui.Components.zh
    public boolean L1() {
        System.currentTimeMillis();
        return true;
    }

    @Override // mi.g1
    public /* synthetic */ boolean M0(h1 h1Var) {
        return false;
    }

    public void N(va.b bVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", bVar.a);
            jSONObject.put("Status", o1.g.c(bVar.b));
            jSONObject.put("AuthToken", bVar.c);
            jSONObject.put("RefreshToken", bVar.d);
            jSONObject.put("TokenCreationEpochInSecs", bVar.f);
            jSONObject.put("ExpiresInSecs", bVar.e);
            jSONObject.put("FisError", bVar.g);
            n9.h hVar = (n9.h) this.c;
            hVar.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", hVar.a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (createTempFile.renameTo(F())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public boolean O(View view) {
        u4.h1 h1Var = (u4.h1) this.c;
        u4.i1 i1Var = (u4.i1) this.b;
        int g7 = i1Var.g();
        int i3 = i1Var.i();
        int d = i1Var.d(view);
        int l10 = i1Var.l(view);
        h1Var.b = g7;
        h1Var.c = i3;
        h1Var.d = d;
        h1Var.e = l10;
        h1Var.a = 24579;
        return h1Var.a();
    }

    public void Q(long j10, byte[] bArr) {
        e0.g gVar = (e0.g) this.c;
        if (gVar.b) {
            gVar.b = false;
            ((vi.j) gVar.e).h();
            return;
        }
        vi.j jVar = (vi.j) gVar.e;
        jVar.getClass();
        vi.j.q();
        vi.i iVar = jVar.z;
        File file = (jVar.G != 5 || iVar == null) ? null : iVar.b;
        if (file == null) {
            ge geVar = (ge) this.b;
            IllegalStateException illegalStateException = new IllegalStateException("Preview file is unavailable");
            MediaController mediaController = geVar.a;
            String[] strArr = MediaController.W1;
            a8.e("AudioRecorderV2 failed", illegalStateException);
            hs.f(mediaController.i1).k(hs.m2, Integer.valueOf(mediaController.h1));
            mediaController.x(false);
            return;
        }
        MediaController mediaController2 = ((ge) this.b).a;
        mediaController2.k1 = file;
        mediaController2.l1 = j10;
        mediaController2.G0(file, j10, bArr);
        li.b0(mediaController2.i1).B1(mediaController2.n1, mediaController2.o1, gi.a(mediaController2, file.getAbsolutePath(), mediaController2.K1));
        hs.f(mediaController2.i1).k(hs.o2, new Object[0]);
        hs.f(mediaController2.i1).k(hs.s2, Integer.valueOf(mediaController2.h1), mediaController2.g1, file.getAbsolutePath());
        mediaController2.Y(false);
        MediaController.j0(false);
    }

    public void S(Exception exc, boolean z10) {
        this.c = null;
        HashSet hashSet = (HashSet) this.b;
        g9.i0 q10 = g9.i0.q(hashSet);
        hashSet.clear();
        g9.g0 listIterator = q10.listIterator(0);
        while (listIterator.hasNext()) {
            p2.b bVar = (p2.b) listIterator.next();
            bVar.getClass();
            bVar.l(z10 ? 1 : 3, exc);
        }
    }

    public void U(o0.g gVar) {
        androidx.biometric.o oVar = (androidx.biometric.o) this.c;
        gi.w5 w5Var = (gi.w5) this.b;
        int i3 = gVar.b;
        if (i3 != 0) {
            oVar.execute(new b0(w5Var, i3));
        } else {
            oVar.execute(new l9.u(23, w5Var, gVar.a));
        }
    }

    @Override // mi.g1
    public void V0(h1 h1Var) {
        ((j0) this.b).u();
    }

    @Override // mi.g1
    public /* synthetic */ boolean X1(boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Components.zh
    public void Y(ng ngVar) {
        ngVar.run();
    }

    public void Z(p2.b bVar) {
        ((HashSet) this.b).add(bVar);
        if (((p2.b) this.c) != null) {
            return;
        }
        this.c = bVar;
        p2.p W = bVar.b.W();
        bVar.z = W;
        android.support.v4.media.session.f fVar = bVar.s;
        String str = g2.n0.a;
        W.getClass();
        fVar.getClass();
        fVar.obtainMessage(1, new p2.a(w2.u.g.getAndIncrement(), true, SystemClock.elapsedRealtime(), W)).sendToTarget();
    }

    @Override // org.telegram.ui.j7
    public void a(t6 t6Var, di.b bVar, boolean z10) {
        ut utVar = (ut) this.c;
        tt ttVar = utVar.Q1;
        if (bVar != null) {
            ((di.c) this.b).i(bVar);
            utVar.X1.e();
            di.c cVar = utVar.Z1;
            dw0[] dw0VarArr = utVar.U1;
            org.telegram.ui.Cells.c2[] c2VarArr = utVar.V1;
            org.telegram.ui.Cells.c2 c2Var = c2VarArr[0];
            if (c2Var != null) {
                dw0 dw0Var = dw0VarArr[0];
                boolean z11 = cVar.m;
                dw0Var.c = z11;
                c2Var.c(z11, true);
            }
            org.telegram.ui.Cells.c2 c2Var2 = c2VarArr[1];
            if (c2Var2 != null) {
                dw0 dw0Var2 = dw0VarArr[1];
                boolean z12 = cVar.n;
                dw0Var2.c = z12;
                c2Var2.c(z12, true);
            }
            org.telegram.ui.Cells.c2 c2Var3 = c2VarArr[2];
            if (c2Var3 != null) {
                dw0 dw0Var3 = dw0VarArr[2];
                boolean z13 = cVar.o;
                dw0Var3.c = z13;
                c2Var3.c(z13, true);
            }
            org.telegram.ui.Cells.c2 c2Var4 = c2VarArr[3];
            if (c2Var4 != null) {
                dw0 dw0Var4 = dw0VarArr[3];
                boolean z14 = cVar.p;
                dw0Var4.c = z14;
                c2Var4.c(z14, true);
            }
            org.telegram.ui.Cells.c2 c2Var5 = c2VarArr[4];
            if (c2Var5 != null) {
                dw0 dw0Var5 = dw0VarArr[4];
                boolean z15 = cVar.q;
                dw0Var5.c = z15;
                c2Var5.c(z15, true);
            }
            utVar.T1.a(ttVar.d(), true);
            ttVar.c(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0081 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d3 A[Catch: all -> 0x0094, TryCatch #0 {all -> 0x0094, blocks: (B:15:0x0081, B:19:0x008e, B:20:0x00a2, B:22:0x00d3, B:25:0x00dc, B:28:0x0112, B:54:0x0098), top: B:14:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0112 A[Catch: all -> 0x0094, TRY_LEAVE, TryCatch #0 {all -> 0x0094, blocks: (B:15:0x0081, B:19:0x008e, B:20:0x00a2, B:22:0x00d3, B:25:0x00dc, B:28:0x0112, B:54:0x0098), top: B:14:0x0081 }] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    @Override // com.google.android.gms.common.api.internal.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void accept(Object obj, Object obj2) {
        m6.c cVar;
        boolean z10;
        a0.l lVar;
        t7.i iVar;
        a0.l lVar2;
        long j10;
        int i3;
        switch (this.a) {
            case 22:
                androidx.activity.n nVar = (androidx.activity.n) this.b;
                LocationRequest locationRequest = (LocationRequest) this.c;
                t7.k kVar = (t7.k) obj;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                kVar.getClass();
                com.google.android.gms.common.api.internal.o g7 = nVar.g();
                com.google.android.gms.common.api.internal.m mVar = g7.b;
                mVar.getClass();
                p6.h0 h0Var = kVar.B;
                m6.c[] cVarArr = h0Var == null ? null : h0Var.b;
                if (cVarArr != null) {
                    int length = cVarArr.length;
                    ?? r12 = 0;
                    while (true) {
                        if (r12 < length) {
                            cVar = cVarArr[r12];
                            if (!"location_updates_with_callback".equals(cVar.a)) {
                                r12++;
                            }
                        } else {
                            cVar = null;
                        }
                    }
                    if (cVar != null && cVar.b() >= 1) {
                        z10 = true;
                        lVar = kVar.G;
                        synchronized (lVar) {
                            try {
                                try {
                                    t7.i iVar2 = (t7.i) kVar.G.get(mVar);
                                    if (iVar2 != null && !z10) {
                                        iVar2.N0(g7);
                                        iVar = iVar2;
                                        iVar2 = null;
                                        int identityHashCode = System.identityHashCode(mVar.a);
                                        String str = mVar.b;
                                        StringBuilder sb2 = new StringBuilder(str.length() + 1 + String.valueOf(identityHashCode).length());
                                        sb2.append(str);
                                        sb2.append("@");
                                        sb2.append(identityHashCode);
                                        String sb3 = sb2.toString();
                                        if (z10) {
                                            t7.x xVar = (t7.x) kVar.m();
                                            int i10 = locationRequest.a;
                                            lVar2 = lVar;
                                            long j11 = locationRequest.b;
                                            long j12 = locationRequest.c;
                                            long j13 = locationRequest.d;
                                            long j14 = locationRequest.e;
                                            int i11 = locationRequest.f;
                                            float f10 = locationRequest.h;
                                            boolean z11 = locationRequest.n;
                                            long j15 = locationRequest.r;
                                            int i12 = locationRequest.s;
                                            int i13 = locationRequest.w;
                                            String str2 = locationRequest.x;
                                            boolean z12 = locationRequest.y;
                                            WorkSource workSource = locationRequest.E;
                                            t7.j jVar = locationRequest.F;
                                            String str3 = Build.VERSION.SDK_INT < 30 ? null : str2;
                                            if (j12 == -1) {
                                                j10 = -1;
                                                j12 = j11;
                                                i3 = i10;
                                            } else {
                                                j10 = -1;
                                                i3 = i10;
                                                if (i3 != 105) {
                                                    j12 = Math.min(j12, j11);
                                                }
                                            }
                                            t7.l lVar3 = new t7.l(new LocationRequest(i3, j11, j12, Math.max(j13, j11), Long.MAX_VALUE, j14, i11, f10, z11, j15 == j10 ? j11 : j15, i12, i13, str3, z12, new WorkSource(workSource), jVar), null, false, false, null, false, false, null, Long.MAX_VALUE);
                                            t7.h hVar = new t7.h(taskCompletionSource, iVar);
                                            int i14 = t7.i.c;
                                            IInterface queryLocalInterface = iVar.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
                                            IInterface iVar3 = queryLocalInterface instanceof i8.j ? (i8.j) queryLocalInterface : new i8.i(iVar, "com.google.android.gms.location.ILocationCallback", 9);
                                            IInterface queryLocalInterface2 = hVar.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
                                            IInterface uVar = queryLocalInterface2 instanceof t7.w ? (t7.w) queryLocalInterface2 : new t7.u(hVar, "com.google.android.gms.location.internal.IFusedLocationProviderCallback", 9);
                                            Parcel P0 = xVar.P0();
                                            int i15 = t7.d.a;
                                            P0.writeInt(1);
                                            int s6 = j8.a.s(P0, 20293);
                                            j8.a.r(P0, 1, 4);
                                            P0.writeInt(1);
                                            j8.a.l(P0, 2, lVar3, 0);
                                            j8.a.g(P0, 5, iVar3.asBinder());
                                            j8.a.g(P0, 6, uVar.asBinder());
                                            j8.a.m(P0, 8, sb3);
                                            j8.a.t(P0, s6);
                                            xVar.T0(P0, 59);
                                        } else {
                                            t7.x xVar2 = (t7.x) kVar.m();
                                            if (iVar2 == null) {
                                                iVar2 = null;
                                            }
                                            t7.e eVar = new t7.e(null, taskCompletionSource);
                                            Parcel P02 = xVar2.P0();
                                            int i16 = t7.d.a;
                                            P02.writeInt(1);
                                            int s10 = j8.a.s(P02, 20293);
                                            j8.a.r(P02, 1, 4);
                                            P02.writeInt(2);
                                            j8.a.g(P02, 2, iVar2);
                                            j8.a.g(P02, 3, iVar);
                                            j8.a.m(P02, 6, sb3);
                                            j8.a.t(P02, s10);
                                            P02.writeInt(1);
                                            locationRequest.writeToParcel(P02, 0);
                                            t7.d.c(P02, eVar);
                                            xVar2.T0(P02, 88);
                                            lVar2 = lVar;
                                        }
                                        return;
                                    }
                                    iVar = new t7.i(nVar);
                                    kVar.G.put(mVar, iVar);
                                    int identityHashCode2 = System.identityHashCode(mVar.a);
                                    String str4 = mVar.b;
                                    StringBuilder sb22 = new StringBuilder(str4.length() + 1 + String.valueOf(identityHashCode2).length());
                                    sb22.append(str4);
                                    sb22.append("@");
                                    sb22.append(identityHashCode2);
                                    String sb32 = sb22.toString();
                                    if (z10) {
                                    }
                                    return;
                                } catch (Throwable th2) {
                                    th = th2;
                                    r12 = lVar;
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                    }
                }
                z10 = false;
                lVar = kVar.G;
                synchronized (lVar) {
                }
                break;
            default:
                u6.d dVar = new u6.d((u6.e) this.b, (TaskCompletionSource) obj2, 0);
                u6.c cVar2 = (u6.c) ((u6.f) obj).m();
                u6.a aVar = (u6.a) this.c;
                Parcel J0 = cVar2.J0();
                m7.a.c(J0, dVar);
                m7.a.b(J0, aVar);
                cVar2.K0(J0, 1);
                return;
        }
    }

    @Override // org.telegram.ui.Components.ij0
    public boolean b(float f10, float f11, int i3, View view) {
        Rect rect = (Rect) this.b;
        cx cxVar = (cx) this.c;
        int i10 = 0;
        if (cxVar.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.h4)) {
            ((ImageView) view.getTag(R.id.object_tag)).getHitRect(rect);
            if (!rect.contains((int) f10, (int) f11)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cxVar.getParentActivity());
                alertDialog$Builder.f(new CharSequence[]{bd.M0(2131751599, null)}, new xw(this, i3, i10));
                cxVar.showDialog(alertDialog$Builder.a);
                return true;
            }
        }
        return false;
    }

    @Override // mi.g1
    public /* synthetic */ boolean c0(h1 h1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.wn
    public void dismiss() {
        switch (this.a) {
            case 10:
                ((f60) this.b).u();
                break;
            default:
                ((ut) this.c).dismiss();
                break;
        }
    }

    public byte[] e(p3.a aVar) {
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
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public va.b e0() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[TLObject.FLAG_14];
        try {
            FileInputStream fileInputStream = new FileInputStream(F());
            while (true) {
                try {
                    int read = fileInputStream.read(bArr, 0, TLObject.FLAG_14);
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
        int i3 = va.b.h;
        byte b10 = (byte) (((byte) (0 | 2)) | 1);
        int i10 = o1.g.d(5)[optInt];
        if (i10 == 0) {
            throw new NullPointerException("Null registrationStatus");
        }
        byte b11 = (byte) (((byte) (b10 | 2)) | 1);
        if (b11 == 3 && i10 != 0) {
            return new va.b(optString, i10, optString2, optString3, optLong2, optLong, optString4);
        }
        StringBuilder sb2 = new StringBuilder();
        if (i10 == 0) {
            sb2.append(" registrationStatus");
        }
        if ((b11 & 1) == 0) {
            sb2.append(" expiresInSecs");
        }
        if ((b11 & 2) == 0) {
            sb2.append(" tokenCreationEpochInSecs");
        }
        throw new IllegalStateException(t4.c.g("Missing required properties:", sb2));
    }

    @Override // mi.g1
    public void f(h1 h1Var) {
        ((j0) this.b).f(h1Var);
    }

    public View g(int i3, int i10, int i11, int i12) {
        u4.h1 h1Var = (u4.h1) this.c;
        u4.i1 i1Var = (u4.i1) this.b;
        int g7 = i1Var.g();
        int i13 = i1Var.i();
        int i14 = i10 > i3 ? 1 : -1;
        View view = null;
        while (i3 != i10) {
            View j10 = i1Var.j(i3);
            int d = i1Var.d(j10);
            int l10 = i1Var.l(j10);
            h1Var.b = g7;
            h1Var.c = i13;
            h1Var.d = d;
            h1Var.e = l10;
            if (i11 != 0) {
                h1Var.a = i11;
                if (h1Var.a()) {
                    return j10;
                }
            }
            if (i12 != 0) {
                h1Var.a = i12;
                if (h1Var.a()) {
                    view = j10;
                }
            }
            i3 += i14;
        }
        return view;
    }

    @Override // org.telegram.ui.Components.zh
    public /* synthetic */ boolean g0() {
        return false;
    }

    @Override // mi.g1
    public void g1(CharSequence charSequence) {
        ((j0) this.b).W0(charSequence);
    }

    @Override // cd.a
    public Object get() {
        kb.a aVar = new kb.a(27);
        v7.s sVar = new v7.s(26);
        Object obj = ((cd.a) this.b).get();
        cd.a aVar2 = (cd.a) this.c;
        return new u5.g(aVar, sVar, u5.a.f, (u5.i) obj, aVar2);
    }

    @Override // org.telegram.ui.Components.om0
    public /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // org.telegram.ui.Components.om0
    public void k(boolean z10, float f10) {
        ((TextView) this.b).setText("Alpha " + org.telegram.ui.j5.m1);
        org.telegram.ui.j5.m1 = f10;
        ((org.telegram.ui.j5) this.c).j1.L();
    }

    @Override // mi.g1
    public void l(h1 h1Var, int i3, int i10) {
        h9 O0;
        j0 j0Var = (j0) this.b;
        if (((k0) this.c).d || i3 == i10 || (O0 = j0Var.O0()) == null) {
            return;
        }
        if (O0.x() && O0.W == j0Var.e1()) {
            return;
        }
        h1Var.post(new g0(this, h1Var, i10, O0, j0Var, i3));
    }

    @Override // mi.g1
    public boolean m() {
        return ((j0) this.b).l1();
    }

    @Override // org.telegram.messenger.ir
    public void o(boolean z10) {
        f8 f8Var = ((d8) this.c).b;
        f8Var.y.finishFragment();
        wm wmVar = (wm) this.b;
        i8 i8Var = f8Var.y;
        wmVar.h8(i8Var.Q, i8Var.R + 86400, z10);
    }

    @Override // org.telegram.ui.Components.zh
    public void o1(int i3, boolean z10, boolean z11, int i10, int i11, long j10, boolean z12, boolean z13, long j11) {
        bi biVar = (bi) this.b;
        try {
            HashMap<Object, Object> selectedPhotos = biVar.b2.getSelectedPhotos();
            if (selectedPhotos.isEmpty()) {
                return;
            }
            ye yeVar = (ye) selectedPhotos.values().iterator().next();
            String str = yeVar.h;
            if (str == null) {
                str = yeVar.I;
            }
            ug.f0 f0Var = (ug.f0) this.c;
            f0Var.d0(f0Var.f0(str, true));
            biVar.dismiss();
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
    }

    @Override // org.telegram.ui.Components.k51
    public void onError(m51 m51Var, Exception exc) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
        int i3 = secretMediaViewer.a0;
        if (i3 <= 0) {
            a8.g(exc, true);
            return;
        }
        secretMediaViewer.a0 = i3 - 1;
        org.telegram.messenger.g0.i3(new qv0(11, this, (File) this.b), 100L);
    }

    @Override // org.telegram.ui.Components.k51
    public /* synthetic */ void onRenderedFirstFrame(l2.a aVar) {
    }

    @Override // org.telegram.ui.Components.k51
    public void onStateChanged(boolean z10, int i3) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
        ty0 ty0Var = secretMediaViewer.h1;
        if (secretMediaViewer.E == null || secretMediaViewer.g0 == null) {
            return;
        }
        org.telegram.messenger.g0.r(ty0Var);
        org.telegram.messenger.g0.h3(ty0Var);
        if (i3 == 4 || i3 == 1) {
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
        if (i3 == 3 && secretMediaViewer.x.getVisibility() != 0) {
            secretMediaViewer.x.setVisibility(0);
        }
        if (secretMediaViewer.E.d0() && i3 != 4) {
            if (secretMediaViewer.F) {
                return;
            }
            secretMediaViewer.F = true;
        } else if (secretMediaViewer.F) {
            secretMediaViewer.F = false;
            if (i3 == 4) {
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

    @Override // org.telegram.ui.Components.k51
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.k51
    public void onVideoSizeChanged(int i3, int i10, int i11, float f10) {
        org.telegram.ui.l4 l4Var = ((SecretMediaViewer) this.c).x;
        if (l4Var != null) {
            l4Var.a(i10 == 0 ? 1.0f : (i3 * f10) / i10, 0);
        }
    }

    @Override // org.telegram.ui.Components.wn
    public void q() {
        ((f60) this.b).u();
        wm wmVar = (wm) this.c;
        wmVar.Ec(true);
        fc.A(wmVar, wmVar.getMessagesController().r2(wmVar.k6, wmVar.b(), null), wmVar.ya).j();
    }

    @Override // org.telegram.ui.Components.om0
    public /* synthetic */ int q0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.wn
    public void t() {
        ((f60) this.b).u();
        wm wmVar = (wm) this.c;
        if (wmVar.k6 == 0 || wmVar.g4 == 3) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", wmVar.k6);
        if (wmVar.b() != 0) {
            bundle.putLong("topic_id", wmVar.b());
        }
        wmVar.presentFragment(new yw0(bundle, wmVar.ya));
    }

    public String toString() {
        switch (this.a) {
            case 20:
                return "Bounds{lower=" + ((i0.b) this.b) + " upper=" + ((i0.b) this.c) + "}";
            default:
                return super.toString();
        }
    }

    @Override // g2.e
    public l9.y u(byte[] bArr) {
        byte[] bArr2;
        k4.j jVar = (k4.j) this.c;
        if (jVar != null && (bArr2 = (byte[]) jVar.a) != null && Arrays.equals(bArr2, bArr)) {
            l9.y yVar = (l9.y) ((k4.j) this.c).c;
            yVar.getClass();
            return yVar;
        }
        l9.y u10 = ((g2.e) this.b).u(bArr);
        k4.j jVar2 = new k4.j();
        jVar2.a = bArr;
        jVar2.b = null;
        jVar2.c = u10;
        this.c = jVar2;
        return u10;
    }

    @Override // org.telegram.ui.Components.wn
    public void v() {
        int i3;
        ((f60) this.b).u();
        wm wmVar = (wm) this.c;
        i3 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
        SharedPreferences sharedPreferences = hp.s1(i3).d7;
        boolean z10 = sharedPreferences.getBoolean("sound_enabled_" + us.v(wmVar.k6, wmVar.b(), false), true);
        boolean z11 = !z10;
        sharedPreferences.edit().putBoolean("sound_enabled_" + us.v(wmVar.k6, wmVar.b(), false), z11).apply();
        if (fc.a(wmVar)) {
            fc.S(z10 ? 1 : 0, wmVar, wmVar.getResourceProvider()).j();
        }
        wmVar.ud(false);
    }

    @Override // gi.za
    public void w(boolean z10, float f10) {
        jb0 jb0Var = (jb0) this.b;
        od0 od0Var = (od0) this.c;
        m51 m51Var = od0Var.d;
        if (m51Var == null) {
            return;
        }
        float max = 2.8f / Math.max(60L, r2);
        long U = (long) ((((f10 / (1.0f - max)) * max) + f10) * m51Var.U());
        od0Var.e = U;
        od0Var.d.q0(U, !z10);
        if (z10) {
            return;
        }
        org.telegram.messenger.g0.r(jb0Var);
        org.telegram.messenger.g0.i3(jb0Var, 120L);
    }

    @Override // org.telegram.ui.Components.wn
    public void z(int i3) {
        wm wmVar = (wm) this.c;
        ((f60) this.b).u();
        if (i3 != 0) {
            wmVar.getNotificationsController().H(wmVar.k6, i3, wmVar.b());
            if (fc.a(wmVar)) {
                fc.z(wmVar, 5, i3, wmVar.getResourceProvider()).j();
                return;
            }
            return;
        }
        if (wmVar.getMessagesController().r2(wmVar.k6, wmVar.b(), null)) {
            wmVar.Ec(true);
        }
        if (fc.a(wmVar)) {
            fc.z(wmVar, 4, i3, wmVar.getResourceProvider()).j();
        }
    }

    public /* synthetic */ h0(int i3, boolean z10) {
        this.a = i3;
    }

    @Override // org.telegram.ui.Components.k51
    public void onRenderedFirstFrame() {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
        if (secretMediaViewer.b0) {
            return;
        }
        secretMediaViewer.b0 = true;
        secretMediaViewer.e.invalidate();
    }

    public /* synthetic */ h0(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    public /* synthetic */ h0(Object obj, Object obj2, boolean z10, int i3) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
    }

    public h0(od0 od0Var) {
        this.a = 11;
        this.c = od0Var;
        this.b = new jb0(this, 6);
    }

    public h0(n9.h hVar) {
        this.a = 29;
        this.c = hVar;
    }

    public h0(String str, String str2) {
        this.a = 28;
        this.b = str;
        this.c = str2;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("userId should not be empty");
        }
    }

    public h0(Context context, int i3) {
        this.a = i3;
        switch (i3) {
            case 18:
                p6.m.g(context);
                Resources resources = context.getResources();
                this.b = resources;
                this.c = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
                break;
            default:
                this.c = null;
                this.b = context;
                break;
        }
    }

    public h0(u4.i1 i1Var) {
        this.a = 24;
        this.b = i1Var;
        u4.h1 h1Var = new u4.h1();
        h1Var.a = 0;
        this.c = h1Var;
    }

    public h0(EditText editText) {
        this.a = 21;
        this.b = editText;
        s1.i iVar = new s1.i(editText);
        this.c = iVar;
        editText.addTextChangedListener(iVar);
        if (s1.a.b == null) {
            synchronized (s1.a.a) {
                try {
                    if (s1.a.b == null) {
                        s1.a aVar = new s1.a();
                        try {
                            s1.a.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, s1.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        s1.a.b = aVar;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(s1.a.b);
    }

    public h0(int i3) {
        this.a = i3;
        switch (i3) {
            case 17:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.b = byteArrayOutputStream;
                this.c = new DataOutputStream(byteArrayOutputStream);
                break;
            default:
                this.b = new HashSet();
                break;
        }
    }

    public h0(cx cxVar) {
        this.a = 13;
        this.c = cxVar;
        this.b = new Rect();
    }

    public h0(Attributes attributes, HashMap hashMap) {
        this.a = 7;
        this.c = attributes;
        String l10 = kz.l("style", attributes);
        if (l10 != null) {
            ArrayList arrayList = new ArrayList();
            this.b = arrayList;
            arrayList.add(new iz(l10));
            return;
        }
        String l11 = kz.l("class", attributes);
        if (l11 != null) {
            this.b = new ArrayList();
            for (String str : l11.split(" ")) {
                iz izVar = (iz) hashMap.get(str.trim());
                if (izVar != null) {
                    ((ArrayList) this.b).add(izVar);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.om0
    public void D() {
    }

    @Override // gi.za
    public /* synthetic */ void X() {
    }

    @Override // org.telegram.ui.j7
    public void clear() {
    }

    @Override // org.telegram.ui.j7
    public void d() {
    }

    @Override // org.telegram.ui.Components.ij0
    public void h() {
    }

    @Override // org.telegram.ui.Components.wn
    public /* synthetic */ void p() {
    }

    @Override // org.telegram.ui.Components.zh
    public /* synthetic */ void r0() {
    }

    @Override // gi.za
    public /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.Components.zh
    public /* synthetic */ void v0() {
    }

    @Override // mi.g1
    public /* synthetic */ void w0() {
    }

    @Override // gi.za
    public /* synthetic */ void C(boolean z10) {
    }

    @Override // gi.za
    public /* synthetic */ void I(float f10) {
    }

    @Override // org.telegram.ui.Components.zh
    public /* synthetic */ void I0(Object obj) {
    }

    @Override // gi.za
    public /* synthetic */ void K(long j10) {
    }

    @Override // gi.za
    public /* synthetic */ void M(boolean z10) {
    }

    @Override // gi.za
    public /* synthetic */ void R(float f10) {
    }

    @Override // gi.za
    public /* synthetic */ void T(float f10) {
    }

    @Override // gi.za
    public /* synthetic */ void W(float f10) {
    }

    @Override // gi.za
    public /* synthetic */ void a0(float f10) {
    }

    @Override // org.telegram.ui.Components.zh
    public /* synthetic */ void a1(TLRPC.User user) {
    }

    @Override // gi.za
    public /* synthetic */ void c(int i3) {
    }

    @Override // gi.za
    public /* synthetic */ void d0(long j10) {
    }

    @Override // gi.za
    public /* synthetic */ void i(float f10) {
    }

    @Override // gi.za
    public /* synthetic */ void j(float f10) {
    }

    @Override // org.telegram.ui.Components.k51
    public /* synthetic */ void onSeekFinished(l2.a aVar) {
    }

    @Override // org.telegram.ui.Components.k51
    public /* synthetic */ void onSeekStarted(l2.a aVar) {
    }

    @Override // org.telegram.ui.Components.k51
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // org.telegram.ui.Components.ij0
    public void r(float f10) {
    }

    @Override // gi.za
    public /* synthetic */ void y(float f10) {
    }

    @Override // org.telegram.ui.Components.zh
    public /* synthetic */ void R1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i3, int i10, long j10, boolean z11, long j11) {
    }

    @Override // gi.za
    public /* synthetic */ void H(float f10, int i3) {
    }

    @Override // gi.za
    public /* synthetic */ void P(float f10, int i3) {
    }

    @Override // gi.za
    public /* synthetic */ void V(float f10, int i3) {
    }

    @Override // gi.za
    public /* synthetic */ void b0(int i3, long j10) {
    }

    @Override // gi.za
    public /* synthetic */ void n(long j10, boolean z10) {
    }
}
