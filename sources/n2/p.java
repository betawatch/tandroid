package n2;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.Editable;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import h3.t1;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mh.l4;
import mh.m2;
import of.f1;
import of.u1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.j2;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Components.e0;
import org.telegram.ui.Components.e50;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.f50;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.n71;
import org.telegram.ui.Components.rp0;
import org.telegram.ui.Components.x4;
import qh.b2;
import qh.c1;
import qh.d1;
import qh.g0;
import qh.i2;
import qh.j3;
import qh.o3;
import qh.u2;
import qh.v4;
import qh.w0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class p implements m4.h, OnCompleteListener, o0.a, u1, x4, ig.g, h61, l71, com.google.android.gms.common.api.internal.s, g0, c1, r4.f {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ p(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // qh.c1
    public /* synthetic */ boolean A(d1 d1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.x4
    public void B(int i9, int i10, boolean z10) {
        e0 e0Var = (e0) this.b;
        e0Var.k0(i9, i10, z10);
        e0Var.dismiss();
    }

    @Override // qh.c1
    public void B1(Editable editable) {
        ((qh.x4) this.b).h();
    }

    @Override // m4.h
    public long C(long j10, long j11) {
        return 1L;
    }

    @Override // qh.g0
    public n9 D() {
        j3 j3Var = ((w0) this.b).O;
        if (j3Var == null) {
            return null;
        }
        return j3Var.a.getTextSelectionHelper();
    }

    public void F(float f10) {
        n71 n71Var = (n71) this.b;
        if (f10 == 1.0f) {
            View[] viewArr = n71Var.e;
            View[] viewArr2 = n71Var.e;
            if (viewArr[1] != null) {
                n71Var.F();
                n71Var.h.put(n71Var.f[1], viewArr2[1]);
                n71Var.removeView(viewArr2[1]);
                n71Var.E(viewArr2[0], 0.0f);
                viewArr2[1] = null;
            }
            n71Var.z(n71Var.b);
            return;
        }
        View[] viewArr3 = n71Var.e;
        View[] viewArr4 = n71Var.e;
        View view = viewArr3[1];
        if (view == null) {
            return;
        }
        if (n71Var.y) {
            n71Var.E(view, (1.0f - f10) * viewArr3[0].getMeasuredWidth());
            n71Var.E(viewArr4[0], (-r2.getMeasuredWidth()) * f10);
        } else {
            n71Var.E(view, (1.0f - f10) * (-viewArr3[0].getMeasuredWidth()));
            n71Var.E(viewArr4[0], r2.getMeasuredWidth() * f10);
        }
        n71Var.w(false);
    }

    @Override // qh.g0
    public void G(CharSequence charSequence) {
        j3 j3Var = ((w0) this.b).O;
        if (j3Var != null) {
            j3Var.getClass();
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            j3Var.a.t4(charSequence.toString());
        }
    }

    @Override // qh.g0
    public m9 H() {
        return (w0) this.b;
    }

    @Override // of.u1
    public void H0(ArrayList arrayList) {
        switch (this.a) {
            case 6:
                f1 f1Var = (f1) this.b;
                String str = f1Var.V;
                if (str != null) {
                    f1Var.U(str, f1Var.Y, f1Var.Z, f1Var.X, f1Var.W);
                    break;
                }
                break;
        }
    }

    @Override // qh.g0
    public qh.a I() {
        return ((w0) this.b).a;
    }

    @Override // qh.g0
    public boolean K() {
        w0 w0Var = (w0) this.b;
        j3 j3Var = w0Var.O;
        if (j3Var == null) {
            return false;
        }
        qh.a aVar = w0Var.a;
        return j3Var.a.S4();
    }

    public byte L() {
        int read = ((com.google.firebase.messaging.d) this.b).read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override // qh.c1
    public void L0(d1 d1Var) {
        qh.a aVar;
        qh.x4 x4Var = (qh.x4) this.b;
        v4 v4Var = x4Var.s;
        if (v4Var == null || (aVar = x4Var.a) == null) {
            return;
        }
        o3 o3Var = ((u2) v4Var).a;
        ArrayList arrayList = o3Var.h3;
        long j10 = aVar.t;
        if (j10 == 0) {
            return;
        }
        int i9 = -1;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((qh.a) arrayList.get(i10)).k.contains(Long.valueOf(j10))) {
                i9 = i10;
            }
        }
        if (i9 < 0) {
            return;
        }
        b2 b2Var = o3Var.F3;
        if (b2Var != null) {
            b2Var.d();
        }
        qh.a aVar2 = new qh.a(new TL_iv.pageBlockParagraph(), 0, 0);
        ArrayList arrayList2 = aVar.k;
        ArrayList arrayList3 = aVar2.k;
        arrayList3.addAll(arrayList2);
        if (!arrayList3.isEmpty()) {
            aa.d.u(1, arrayList3);
        }
        arrayList.add(i9 + 1, aVar2);
        o3Var.s4();
        o3Var.U2.N(false);
        b2 b2Var2 = o3Var.F3;
        if (b2Var2 != null) {
            b2Var2.h();
        }
        o3Var.post(new i2(o3Var, aVar2, 26));
    }

    public int M() {
        return ((L() & 255) << 24) | ((L() & 255) << 16) | ((L() & 255) << 8) | (L() & 255);
    }

    public int N() {
        return ((L() & Byte.MAX_VALUE) << 21) | ((L() & Byte.MAX_VALUE) << 14) | ((L() & Byte.MAX_VALUE) << 7) | (L() & Byte.MAX_VALUE);
    }

    @Override // qh.g0
    public void N0() {
        w0 w0Var = (w0) this.b;
        j3 j3Var = w0Var.O;
        if (j3Var != null) {
            qh.a aVar = w0Var.a;
            o3.O1(j3Var.a);
        }
    }

    @Override // of.u1
    public /* synthetic */ a0.h O() {
        switch (this.a) {
        }
        return null;
    }

    public void P(long j10) {
        long j11 = 0;
        while (j11 < j10) {
            long skip = ((com.google.firebase.messaging.d) this.b).skip(j10 - j11);
            if (skip <= 0) {
                throw new EOFException();
            }
            j11 += skip;
        }
    }

    @Override // qh.g0
    public void Q(int i9, int i10) {
        w0 w0Var = (w0) this.b;
        j3 j3Var = w0Var.O;
        if (j3Var != null) {
            qh.a aVar = w0Var.a;
            b2 b2Var = j3Var.a.F3;
            if (b2Var != null) {
                b2Var.f(i9, i10);
            }
        }
    }

    public Object R() {
        if (x6.a.b == null) {
            x6.a.b = new com.google.firebase.messaging.s();
        }
        synchronized (x6.a.a) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }

    public void S() {
        o5.h hVar = (o5.h) this.b;
        Iterator it = hVar.h.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        Iterator it2 = hVar.i.iterator();
        while (it2.hasNext()) {
            ((o5.g) it2.next()).a();
        }
    }

    @Override // qh.g0
    public void T() {
        w0 w0Var = (w0) this.b;
        j3 j3Var = w0Var.O;
        if (j3Var != null) {
            qh.a aVar = w0Var.a;
            o3 o3Var = j3Var.a;
            b2 b2Var = o3Var.F3;
            if (b2Var != null) {
                b2Var.g();
            }
            o3Var.d3.onContentChanged();
        }
    }

    @Override // qh.c1
    public /* synthetic */ boolean T1(boolean z10) {
        return false;
    }

    @Override // qh.c1
    public /* synthetic */ boolean U1(d1 d1Var) {
        return false;
    }

    @Override // m4.h
    public long a(long j10) {
        return 0L;
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 14:
                q5.r rVar = new q5.r(1, (TaskCompletionSource) obj2);
                q5.i iVar = (q5.i) ((q5.t) obj).u();
                String[] strArr = (String[]) this.b;
                Parcel M0 = iVar.M0();
                com.google.android.gms.internal.cast.u.d(M0, rVar);
                M0.writeStringArray(strArr);
                iVar.R0(M0, 6);
                return;
            case 19:
                GetCredentialRequest getCredentialRequest = (GetCredentialRequest) this.b;
                r6.f fVar = new r6.f(1, (TaskCompletionSource) obj2);
                r6.d dVar = (r6.d) ((r6.e) obj).u();
                com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true));
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i9 = a7.b.a;
                obtain.writeStrongBinder(fVar);
                a7.b.b(obtain, getCredentialRequest);
                a7.b.b(obtain, gVar);
                ((r6.b) dVar).E0(obtain, 1);
                return;
            default:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                z5.a aVar = (z5.a) ((z5.c) obj).u();
                x5.o oVar = (x5.o) this.b;
                Parcel G0 = aVar.G0();
                u6.a.c(G0, oVar);
                try {
                    aVar.b.transact(1, G0, null, 1);
                    G0.recycle();
                    taskCompletionSource.setResult(null);
                    return;
                } catch (Throwable th) {
                    G0.recycle();
                    throw th;
                }
        }
    }

    @Override // r4.f
    public int b(long j10) {
        return -1;
    }

    public void c(HashMap hashMap) {
        if (((SparseArray) this.b) == null) {
            this.b = new SparseArray(hashMap.size());
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            ((SparseArray) this.b).put(((String) entry.getKey()).hashCode(), (String) entry.getValue());
        }
    }

    @Override // o0.a
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override // qh.g0
    public void d(d1 d1Var) {
        switch (this.a) {
            case 16:
                j3 j3Var = ((w0) this.b).O;
                if (j3Var != null) {
                    o3 o3Var = j3Var.a;
                    o3.M1(o3Var, d1Var);
                    o3Var.d3.f1(d1Var, true);
                    break;
                }
                break;
            default:
                v4 v4Var = ((qh.x4) this.b).s;
                if (v4Var != null) {
                    o3 o3Var2 = ((u2) v4Var).a;
                    o3.M1(o3Var2, d1Var);
                    o3Var2.d3.f1(d1Var, true);
                    break;
                }
                break;
        }
    }

    @Override // of.u1
    public void e(int i9) {
        switch (this.a) {
            case 6:
                ((f1) this.b).l();
                break;
            default:
                AndroidUtilities.runOnUIThread(new m2(this, 26));
                break;
        }
    }

    @Override // qh.g0
    public void g() {
        w0 w0Var = (w0) this.b;
        j3 j3Var = w0Var.O;
        if (j3Var != null) {
            o3.P1(j3Var.a, w0Var.a);
        }
    }

    @Override // r4.f
    public long h(int i9) {
        return 0L;
    }

    @Override // m4.h
    public long i(long j10, long j11) {
        return 0L;
    }

    @Override // m4.h
    public long j(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override // ig.g
    public void k(Canvas canvas) {
        switch (this.a) {
            case 8:
                ki kiVar = (ki) this.b;
                canvas.drawColor(kiVar.getThemedColor(f6.d6));
                if (SharedConfig.chatBlurEnabled()) {
                    kiVar.y2.b(canvas, -3);
                    break;
                }
                break;
            default:
                rp0 rp0Var = (rp0) this.b;
                canvas.drawColor(rp0Var.getThemedColor(f6.d6));
                if (SharedConfig.chatBlurEnabled()) {
                    rp0Var.K0.b(canvas, -3);
                    break;
                }
                break;
        }
    }

    @Override // qh.c1
    public void k1(d1 d1Var, int i9, int i10) {
        v4 v4Var;
        n9 textSelectionHelper;
        qh.x4 x4Var = (qh.x4) this.b;
        if (x4Var.w || i9 == i10 || (v4Var = x4Var.s) == null || (textSelectionHelper = ((u2) v4Var).a.getTextSelectionHelper()) == null) {
            return;
        }
        d1Var.post(new l4(this, d1Var, i10, textSelectionHelper, i9, 5));
    }

    @Override // m4.h
    public n4.j l(long j10) {
        return (n4.j) this.b;
    }

    @Override // r4.f
    public List m(long j10) {
        return (List) this.b;
    }

    public void n(int i9, int i10, m3.l lVar) {
        char c10;
        char c11;
        long j10;
        int i11;
        int i12;
        int i13;
        int i14;
        s3.d dVar = (s3.d) this.b;
        s3.e eVar = dVar.b;
        SparseArray sparseArray = dVar.c;
        d5.y yVar = dVar.i;
        d5.y yVar2 = dVar.g;
        int i15 = 1;
        int i16 = 0;
        if (i9 != 161 && i9 != 163) {
            if (i9 == 165) {
                if (dVar.G != 2) {
                    return;
                }
                s3.c cVar = (s3.c) sparseArray.get(dVar.M);
                int i17 = dVar.P;
                d5.y yVar3 = dVar.n;
                if (i17 != 4 || !"V_VP9".equals(cVar.b)) {
                    lVar.u(i10);
                    return;
                } else {
                    yVar3.z(i10);
                    lVar.readFully(yVar3.a, 0, i10);
                    return;
                }
            }
            if (i9 == 16877) {
                dVar.d(i9);
                s3.c cVar2 = dVar.u;
                int i18 = cVar2.g;
                if (i18 != 1685485123 && i18 != 1685480259) {
                    lVar.u(i10);
                    return;
                }
                byte[] bArr = new byte[i10];
                cVar2.N = bArr;
                lVar.readFully(bArr, 0, i10);
                return;
            }
            if (i9 == 16981) {
                dVar.d(i9);
                byte[] bArr2 = new byte[i10];
                dVar.u.i = bArr2;
                lVar.readFully(bArr2, 0, i10);
                return;
            }
            if (i9 == 18402) {
                byte[] bArr3 = new byte[i10];
                lVar.readFully(bArr3, 0, i10);
                dVar.d(i9);
                dVar.u.j = new m3.v(1, 0, 0, bArr3);
                return;
            }
            if (i9 == 21419) {
                Arrays.fill(yVar.a, (byte) 0);
                lVar.readFully(yVar.a, 4 - i10, i10);
                yVar.C(0);
                dVar.w = (int) yVar.s();
                return;
            }
            if (i9 == 25506) {
                dVar.d(i9);
                byte[] bArr4 = new byte[i10];
                dVar.u.k = bArr4;
                lVar.readFully(bArr4, 0, i10);
                return;
            }
            if (i9 != 30322) {
                throw t1.a("Unexpected id: " + i9, null);
            }
            dVar.d(i9);
            byte[] bArr5 = new byte[i10];
            dVar.u.v = bArr5;
            lVar.readFully(bArr5, 0, i10);
            return;
        }
        if (dVar.G == 0) {
            dVar.M = (int) eVar.b(lVar, false, true, 8);
            dVar.N = eVar.c;
            dVar.I = -9223372036854775807L;
            dVar.G = 1;
            yVar2.z(0);
        }
        s3.c cVar3 = (s3.c) sparseArray.get(dVar.M);
        if (cVar3 == null) {
            lVar.u(i10 - dVar.N);
            dVar.G = 0;
            return;
        }
        cVar3.X.getClass();
        if (dVar.G == 1) {
            dVar.i(lVar, 3);
            int i19 = (yVar2.a[2] & 6) >> 1;
            byte b10 = 255;
            if (i19 == 0) {
                dVar.K = 1;
                int[] iArr = dVar.L;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                dVar.L = iArr;
                iArr[0] = (i10 - dVar.N) - 3;
            } else {
                dVar.i(lVar, 4);
                int i20 = (yVar2.a[3] & 255) + 1;
                dVar.K = i20;
                int[] iArr2 = dVar.L;
                if (iArr2 == null) {
                    iArr2 = new int[i20];
                } else if (iArr2.length < i20) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i20)];
                }
                dVar.L = iArr2;
                if (i19 == 2) {
                    int i21 = (i10 - dVar.N) - 4;
                    int i22 = dVar.K;
                    Arrays.fill(iArr2, 0, i22, i21 / i22);
                } else {
                    if (i19 != 1) {
                        if (i19 != 3) {
                            throw t1.a("Unexpected lacing value: " + i19, null);
                        }
                        int i23 = 0;
                        int i24 = 0;
                        int i25 = 4;
                        while (true) {
                            int i26 = dVar.K - i15;
                            if (i23 >= i26) {
                                c10 = 1;
                                c11 = 0;
                                dVar.L[i26] = ((i10 - dVar.N) - i25) - i24;
                                break;
                            }
                            dVar.L[i23] = i16;
                            int i27 = i25 + 1;
                            dVar.i(lVar, i27);
                            if (yVar2.a[i25] == 0) {
                                throw t1.a("No valid varint length mask found", null);
                            }
                            int i28 = 0;
                            while (true) {
                                if (i28 >= 8) {
                                    j10 = 0;
                                    i11 = i27;
                                    break;
                                }
                                int i29 = 1 << (7 - i28);
                                if ((yVar2.a[i25] & i29) != 0) {
                                    i11 = i27 + i28;
                                    dVar.i(lVar, i11);
                                    j10 = yVar2.a[i25] & b10 & (~i29);
                                    while (i27 < i11) {
                                        j10 = (j10 << 8) | (yVar2.a[i27] & b10);
                                        i27++;
                                        b10 = 255;
                                    }
                                    if (i23 > 0) {
                                        j10 -= (1 << ((i28 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i28++;
                                    b10 = 255;
                                }
                            }
                            if (j10 < -2147483648L || j10 > 2147483647L) {
                                break;
                            }
                            int i30 = (int) j10;
                            int[] iArr3 = dVar.L;
                            if (i23 != 0) {
                                i30 += iArr3[i23 - 1];
                            }
                            iArr3[i23] = i30;
                            i24 += i30;
                            i23++;
                            i25 = i11;
                            b10 = 255;
                            i15 = 1;
                            i16 = 0;
                        }
                        throw t1.a("EBML lacing sample size out of range.", null);
                    }
                    int i31 = 0;
                    int i32 = 0;
                    int i33 = 4;
                    while (true) {
                        i12 = dVar.K - 1;
                        if (i31 >= i12) {
                            break;
                        }
                        dVar.L[i31] = 0;
                        while (true) {
                            i13 = i33 + 1;
                            dVar.i(lVar, i13);
                            int i34 = yVar2.a[i33] & 255;
                            int[] iArr4 = dVar.L;
                            i14 = iArr4[i31] + i34;
                            iArr4[i31] = i14;
                            if (i34 != 255) {
                                break;
                            } else {
                                i33 = i13;
                            }
                        }
                        i32 += i14;
                        i31++;
                        i33 = i13;
                    }
                    dVar.L[i12] = ((i10 - dVar.N) - i33) - i32;
                }
            }
            c10 = 1;
            c11 = 0;
            byte[] bArr6 = yVar2.a;
            dVar.H = dVar.k((bArr6[c10] & 255) | (bArr6[c11] << 8)) + dVar.B;
            dVar.O = (cVar3.d == 2 || (i9 == 163 && (yVar2.a[2] & 128) == 128)) ? 1 : 0;
            dVar.G = 2;
            dVar.J = 0;
        }
        if (i9 == 163) {
            while (true) {
                int i35 = dVar.J;
                if (i35 >= dVar.K) {
                    dVar.G = 0;
                    return;
                } else {
                    dVar.e(cVar3, ((dVar.J * cVar3.e) / MediaDataController.MAX_STYLE_RUNS_COUNT) + dVar.H, dVar.O, dVar.l(lVar, cVar3, dVar.L[i35], false), 0);
                    dVar.J++;
                }
            }
        } else {
            while (true) {
                int i36 = dVar.J;
                if (i36 >= dVar.K) {
                    return;
                }
                int[] iArr5 = dVar.L;
                iArr5[i36] = dVar.l(lVar, cVar3, iArr5[i36], true);
                dVar.J++;
            }
        }
    }

    public boolean o(int i9) {
        e71 e71Var = ((n71) this.b).H;
        if (e71Var == null) {
            return false;
        }
        return e71Var.c(i9);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        n5.c.h((n5.c) ((n5.j) this.b).c, "joinApplication", task);
    }

    @Override // org.telegram.ui.Components.h61
    public void onError(k61 k61Var, Exception exc) {
        FileLog.e(exc);
    }

    @Override // org.telegram.ui.Components.h61
    public /* synthetic */ void onRenderedFirstFrame(i3.a aVar) {
    }

    @Override // org.telegram.ui.Components.h61
    public void onStateChanged(boolean z10, int i9) {
        f50 f50Var;
        VideoEditedInfo videoEditedInfo;
        e50 e50Var = (e50) this.b;
        k61 k61Var = e50Var.D0.K;
        if (k61Var != null && k61Var.z() && i9 == 4 && (videoEditedInfo = (f50Var = e50Var.D0).J) != null) {
            k61 k61Var2 = f50Var.K;
            long j10 = videoEditedInfo.startTime;
            if (j10 <= 0) {
                j10 = 0;
            }
            k61Var2.L(j10);
        }
    }

    @Override // org.telegram.ui.Components.h61
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // qh.c1
    public /* synthetic */ boolean p() {
        return false;
    }

    @Override // of.u1
    public /* synthetic */ boolean p0(int i9) {
        switch (this.a) {
        }
        return true;
    }

    @Override // m4.h
    public long q(long j10, long j11) {
        return 0L;
    }

    @Override // r4.f
    public int r() {
        return 1;
    }

    @Override // o0.a
    public Cursor s(Uri uri, String[] strArr, String[] strArr2) {
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

    /* JADX WARN: Code restructure failed: missing block: B:222:0x0346, code lost:
    
        throw kb.c.a();
     */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03a2 A[LOOP:21: B:147:0x0224->B:177:0x03a2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0371 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public lb.d t(com.google.firebase.messaging.l lVar) {
        int e10;
        pb.d dVar;
        pb.b bVar;
        int i9;
        int i10;
        lb.c cVar;
        int e11;
        pb.e o6 = lVar.o();
        pb.b bVar2 = lVar.n().a;
        pb.c n10 = lVar.n();
        pb.e o9 = lVar.o();
        int i11 = m1.j.c(8)[n10.b];
        lb.b bVar3 = (lb.b) lVar.b;
        int i12 = bVar3.b;
        for (int i13 = 0; i13 < i12; i13++) {
            for (int i14 = 0; i14 < i12; i14++) {
                if (j2.a(i11, i13, i14)) {
                    bVar3.a(i14, i13);
                }
            }
        }
        int i15 = o9.a * 4;
        int i16 = i15 + 17;
        int i17 = o9.d;
        lb.b bVar4 = new lb.b(i16, i16);
        bVar4.c(0, 0, 9, 9);
        int i18 = i15 + 9;
        bVar4.c(i18, 0, 8, 9);
        bVar4.c(0, i18, 9, 8);
        int[] iArr = o9.b;
        int length = iArr.length;
        for (int i19 = 0; i19 < length; i19++) {
            int i20 = iArr[i19] - 2;
            for (int i21 = 0; i21 < length; i21++) {
                if ((i19 != 0 || (i21 != 0 && i21 != length - 1)) && (i19 != length - 1 || i21 != 0)) {
                    bVar4.c(iArr[i21] - 2, i20, 5, 5);
                }
            }
        }
        int i22 = 6;
        bVar4.c(6, 9, 1, i15);
        bVar4.c(9, 6, i15, 1);
        if (o9.a > 6) {
            int i23 = i15 + 6;
            bVar4.c(i23, 0, 3, 6);
            bVar4.c(0, i23, 6, 3);
        }
        byte[] bArr = new byte[i17];
        int i24 = i12 - 1;
        int i25 = i24;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        boolean z10 = true;
        while (i25 > 0) {
            if (i25 == i22) {
                i25--;
            }
            for (int i29 = 0; i29 < i12; i29++) {
                int i30 = z10 ? i24 - i29 : i29;
                for (int i31 = 0; i31 < 2; i31++) {
                    int i32 = i25 - i31;
                    if (!bVar4.b(i32, i30)) {
                        i27++;
                        i28 <<= 1;
                        if (bVar3.b(i32, i30)) {
                            i28 |= 1;
                        }
                        if (i27 == 8) {
                            bArr[i26] = (byte) i28;
                            i26++;
                            i27 = 0;
                            i28 = 0;
                        }
                    }
                }
            }
            z10 = !z10;
            i25 -= 2;
            i22 = 6;
        }
        if (i26 != i17) {
            throw kb.c.a();
        }
        if (i17 != o6.d) {
            throw new IllegalArgumentException();
        }
        w wVar = o6.c[bVar2.ordinal()];
        d5.p[] pVarArr = (d5.p[]) wVar.c;
        int i33 = wVar.b;
        int i34 = 0;
        for (d5.p pVar : pVarArr) {
            i34 += pVar.a;
        }
        f9.l[] lVarArr = new f9.l[i34];
        int i35 = 0;
        for (d5.p pVar2 : pVarArr) {
            int i36 = 0;
            while (i36 < pVar2.a) {
                int i37 = pVar2.b;
                lVarArr[i35] = new f9.l(i37, new byte[i33 + i37]);
                i36++;
                i35++;
            }
        }
        int length2 = lVarArr[0].b.length;
        int i38 = i34 - 1;
        while (i38 >= 0 && lVarArr[i38].b.length != length2) {
            i38--;
        }
        int i39 = i38 + 1;
        int i40 = length2 - i33;
        int i41 = 0;
        int i42 = 0;
        while (i41 < i40) {
            int i43 = i42;
            int i44 = 0;
            while (i44 < i35) {
                lVarArr[i44].b[i41] = bArr[i43];
                i44++;
                i43++;
            }
            i41++;
            i42 = i43;
        }
        int i45 = i39;
        while (i45 < i35) {
            lVarArr[i45].b[i40] = bArr[i42];
            i45++;
            i42++;
        }
        boolean z11 = false;
        int length3 = lVarArr[0].b.length;
        while (i40 < length3) {
            int i46 = i42;
            int i47 = 0;
            while (i47 < i35) {
                lVarArr[i47].b[i47 < i39 ? i40 : i40 + 1] = bArr[i46];
                i47++;
                i46++;
            }
            i40++;
            i42 = i46;
        }
        int i48 = 0;
        for (int i49 = 0; i49 < i34; i49++) {
            i48 += lVarArr[i49].a;
        }
        byte[] bArr2 = new byte[i48];
        int i50 = 0;
        int i51 = 0;
        int i52 = 0;
        while (i51 < i34) {
            f9.l lVar2 = lVarArr[i51];
            byte[] bArr3 = lVar2.b;
            int i53 = lVar2.a;
            int length4 = bArr3.length;
            int[] iArr2 = new int[length4];
            for (int i54 = 0; i54 < length4; i54++) {
                iArr2[i54] = bArr3[i54] & 255;
            }
            try {
                int k10 = ((m5.c0) this.b).k(bArr3.length - i53, iArr2);
                for (int i55 = 0; i55 < i53; i55++) {
                    bArr3[i55] = (byte) iArr2[i55];
                }
                i50 += k10;
                int i56 = i52;
                int i57 = 0;
                while (i57 < i53) {
                    bArr2[i56] = bArr3[i57];
                    i57++;
                    i56++;
                }
                i51++;
                i52 = i56;
            } catch (nb.c unused) {
                kb.a aVar = kb.a.c;
                if (kb.h.a) {
                    throw new kb.a();
                }
                throw kb.a.c;
            }
        }
        char[] cArr = pb.a.a;
        com.google.android.exoplayer2.upstream.w wVar2 = new com.google.android.exoplayer2.upstream.w(bArr2);
        StringBuilder sb2 = new StringBuilder(50);
        ArrayList arrayList = new ArrayList(1);
        int i58 = -1;
        int i59 = -1;
        boolean z12 = false;
        boolean z13 = false;
        lb.c cVar2 = null;
        while (true) {
            try {
                int d = wVar2.d();
                pb.d dVar2 = pb.d.c;
                if (d < 4 || (e10 = wVar2.e(4)) == 0) {
                    dVar = dVar2;
                } else if (e10 == 1) {
                    dVar = pb.d.d;
                } else if (e10 == 2) {
                    dVar = pb.d.e;
                } else if (e10 == 3) {
                    dVar = pb.d.f;
                } else if (e10 == 4) {
                    dVar = pb.d.h;
                } else if (e10 == 5) {
                    dVar = pb.d.s;
                } else if (e10 == 7) {
                    dVar = pb.d.n;
                } else if (e10 == 8) {
                    dVar = pb.d.r;
                } else if (e10 == 9) {
                    dVar = pb.d.v;
                } else {
                    if (e10 != 13) {
                        throw new IllegalArgumentException();
                    }
                    dVar = pb.d.w;
                }
                int ordinal = dVar.ordinal();
                if (ordinal != 0) {
                    bVar = bVar2;
                    if (ordinal != 3) {
                        if (ordinal == 5) {
                            i9 = i50;
                            i10 = 1;
                            int e12 = wVar2.e(8);
                            if ((e12 & 128) == 0) {
                                e11 = e12 & 127;
                            } else if ((e12 & 192) == 128) {
                                e11 = ((e12 & 63) << 8) | wVar2.e(8);
                            } else {
                                if ((e12 & 224) != 192) {
                                    throw kb.c.a();
                                }
                                e11 = ((e12 & 31) << 16) | wVar2.e(16);
                            }
                            HashMap hashMap = lb.c.c;
                            if (e11 < 0 || e11 >= 900) {
                                break;
                            }
                            lb.c cVar3 = (lb.c) lb.c.c.get(Integer.valueOf(e11));
                            if (cVar3 == null) {
                                throw kb.c.a();
                            }
                            cVar = cVar3;
                        } else if (ordinal == 7) {
                            i9 = i50;
                            i10 = 1;
                            cVar = cVar2;
                            z12 = true;
                            z11 = true;
                        } else if (ordinal == 8) {
                            i9 = i50;
                            i10 = 1;
                            cVar = cVar2;
                            z12 = true;
                            z13 = true;
                        } else if (ordinal != 9) {
                            int e13 = wVar2.e(dVar.a(o6));
                            int ordinal2 = dVar.ordinal();
                            i9 = i50;
                            if (ordinal2 == 1) {
                                pb.a.e(wVar2, sb2, e13);
                            } else if (ordinal2 == 2) {
                                pb.a.a(wVar2, sb2, e13, z12);
                            } else if (ordinal2 == 4) {
                                pb.a.b(wVar2, sb2, e13, cVar2, arrayList);
                            } else {
                                if (ordinal2 != 6) {
                                    throw kb.c.a();
                                }
                                pb.a.d(wVar2, sb2, e13);
                            }
                        } else {
                            i9 = i50;
                            int e14 = wVar2.e(4);
                            int e15 = wVar2.e(dVar.a(o6));
                            i10 = 1;
                            if (e14 == 1) {
                                pb.a.c(wVar2, sb2, e15);
                            }
                        }
                        int i60 = i58;
                        if (dVar == dVar2) {
                            if (cVar != null) {
                                i10 = z11 ? 4 : z13 ? 6 : 2;
                            } else if (z11) {
                                i10 = 3;
                            } else if (z13) {
                                i10 = 5;
                            }
                            lb.d dVar3 = new lb.d(bArr2, sb2.toString(), arrayList.isEmpty() ? null : arrayList, bVar.toString(), i60, i59, i10);
                            dVar3.d = Integer.valueOf(i9);
                            return dVar3;
                        }
                        i58 = i60;
                        bVar2 = bVar;
                        cVar2 = cVar;
                        i50 = i9;
                    } else {
                        i9 = i50;
                        i10 = 1;
                        if (wVar2.d() < 16) {
                            throw kb.c.a();
                        }
                        i58 = wVar2.e(8);
                        i59 = wVar2.e(8);
                    }
                    cVar = cVar2;
                    int i602 = i58;
                    if (dVar == dVar2) {
                    }
                } else {
                    bVar = bVar2;
                    i9 = i50;
                }
                i10 = 1;
                cVar = cVar2;
                int i6022 = i58;
                if (dVar == dVar2) {
                }
            } catch (IllegalArgumentException unused2) {
                throw kb.c.a();
            }
        }
    }

    public String u(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            s9.d dVar = (s9.d) this.b;
            s9.e eVar = new s9.e(stringWriter, dVar.a, dVar.b, dVar.c, dVar.d);
            eVar.h(obj);
            eVar.j();
            eVar.b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    @Override // m4.h
    public boolean v() {
        return true;
    }

    public void w(int i9, long j10) {
        s3.d dVar = (s3.d) this.b;
        if (i9 == 20529) {
            if (j10 == 0) {
                return;
            }
            throw t1.a("ContentEncodingOrder " + j10 + " not supported", null);
        }
        if (i9 == 20530) {
            if (j10 == 1) {
                return;
            }
            throw t1.a("ContentEncodingScope " + j10 + " not supported", null);
        }
        int i10 = 3;
        switch (i9) {
            case 131:
                dVar.d(i9);
                dVar.u.d = (int) j10;
                return;
            case 136:
                dVar.d(i9);
                dVar.u.V = j10 == 1;
                return;
            case 155:
                dVar.I = dVar.k(j10);
                return;
            case 159:
                dVar.d(i9);
                dVar.u.O = (int) j10;
                return;
            case 176:
                dVar.d(i9);
                dVar.u.m = (int) j10;
                return;
            case 179:
                dVar.a(i9);
                dVar.C.c(dVar.k(j10));
                return;
            case 186:
                dVar.d(i9);
                dVar.u.n = (int) j10;
                return;
            case 215:
                dVar.d(i9);
                dVar.u.c = (int) j10;
                return;
            case 231:
                dVar.B = dVar.k(j10);
                return;
            case 238:
                dVar.P = (int) j10;
                return;
            case 241:
                if (dVar.E) {
                    return;
                }
                dVar.a(i9);
                dVar.D.c(j10);
                dVar.E = true;
                return;
            case 251:
                dVar.Q = true;
                return;
            case 16871:
                dVar.d(i9);
                dVar.u.g = (int) j10;
                return;
            case 16980:
                if (j10 == 3) {
                    return;
                }
                throw t1.a("ContentCompAlgo " + j10 + " not supported", null);
            case 17029:
                if (j10 < 1 || j10 > 2) {
                    throw t1.a("DocTypeReadVersion " + j10 + " not supported", null);
                }
                return;
            case 17143:
                if (j10 == 1) {
                    return;
                }
                throw t1.a("EBMLReadVersion " + j10 + " not supported", null);
            case 18401:
                if (j10 == 5) {
                    return;
                }
                throw t1.a("ContentEncAlgo " + j10 + " not supported", null);
            case 18408:
                if (j10 == 1) {
                    return;
                }
                throw t1.a("AESSettingsCipherMode " + j10 + " not supported", null);
            case 21420:
                dVar.x = j10 + dVar.q;
                return;
            case 21432:
                int i11 = (int) j10;
                dVar.d(i9);
                if (i11 == 0) {
                    dVar.u.w = 0;
                    return;
                }
                if (i11 == 1) {
                    dVar.u.w = 2;
                    return;
                } else if (i11 == 3) {
                    dVar.u.w = 1;
                    return;
                } else {
                    if (i11 != 15) {
                        return;
                    }
                    dVar.u.w = 3;
                    return;
                }
            case 21680:
                dVar.d(i9);
                dVar.u.o = (int) j10;
                return;
            case 21682:
                dVar.d(i9);
                dVar.u.q = (int) j10;
                return;
            case 21690:
                dVar.d(i9);
                dVar.u.p = (int) j10;
                return;
            case 21930:
                dVar.d(i9);
                dVar.u.U = j10 == 1;
                return;
            case 21998:
                dVar.d(i9);
                dVar.u.f = (int) j10;
                return;
            case 22186:
                dVar.d(i9);
                dVar.u.R = j10;
                return;
            case 22203:
                dVar.d(i9);
                dVar.u.S = j10;
                return;
            case 25188:
                dVar.d(i9);
                dVar.u.P = (int) j10;
                return;
            case 30114:
                dVar.R = j10;
                return;
            case 30321:
                dVar.d(i9);
                int i12 = (int) j10;
                if (i12 == 0) {
                    dVar.u.r = 0;
                    return;
                }
                if (i12 == 1) {
                    dVar.u.r = 1;
                    return;
                } else if (i12 == 2) {
                    dVar.u.r = 2;
                    return;
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    dVar.u.r = 3;
                    return;
                }
            case 2352003:
                dVar.d(i9);
                dVar.u.e = (int) j10;
                return;
            case 2807729:
                dVar.r = j10;
                return;
            default:
                switch (i9) {
                    case 21945:
                        dVar.d(i9);
                        int i13 = (int) j10;
                        if (i13 == 1) {
                            dVar.u.A = 2;
                            return;
                        } else {
                            if (i13 != 2) {
                                return;
                            }
                            dVar.u.A = 1;
                            return;
                        }
                    case 21946:
                        dVar.d(i9);
                        int i14 = (int) j10;
                        String str = e5.b.f;
                        if (i14 != 1) {
                            if (i14 == 16) {
                                i10 = 6;
                            } else if (i14 == 18) {
                                i10 = 7;
                            } else if (i14 != 6 && i14 != 7) {
                                i10 = -1;
                            }
                        }
                        if (i10 != -1) {
                            dVar.u.z = i10;
                            return;
                        }
                        return;
                    case 21947:
                        dVar.d(i9);
                        dVar.u.x = true;
                        int a2 = e5.b.a((int) j10);
                        if (a2 != -1) {
                            dVar.u.y = a2;
                            return;
                        }
                        return;
                    case 21948:
                        dVar.d(i9);
                        dVar.u.B = (int) j10;
                        return;
                    case 21949:
                        dVar.d(i9);
                        dVar.u.C = (int) j10;
                        return;
                    default:
                        return;
                }
        }
    }

    @Override // m4.h
    public long x() {
        return 0L;
    }

    @Override // ig.g
    public void x0(g.x xVar) {
        switch (this.a) {
            case 8:
                xVar.a(((ki) this.b).getThemedColor(f6.d6));
                xVar.b(SharedConfig.chatBlurEnabled());
                break;
            default:
                xVar.a(((rp0) this.b).getThemedColor(f6.d6));
                xVar.b(SharedConfig.chatBlurEnabled());
                break;
        }
    }

    @Override // of.u1
    public /* synthetic */ a0.h y() {
        switch (this.a) {
        }
        return null;
    }

    @Override // m4.h
    public long z(long j10) {
        return 1L;
    }

    public /* synthetic */ p(k5.i iVar) {
        this.a = 0;
        this.b = (com.google.android.gms.internal.play_billing.r) iVar.b;
    }

    @Override // org.telegram.ui.Components.h61
    public void onRenderedFirstFrame() {
    }

    public /* synthetic */ p(q5.s sVar, String[] strArr) {
        this.a = 14;
        this.b = strArr;
    }

    public p(int i9) {
        this.a = i9;
        switch (i9) {
            case 12:
                this.b = new m5.c0(nb.a.h, 6);
                break;
            case 15:
                break;
            default:
                this.b = new o4.d(5, 1.0f, false);
                break;
        }
    }

    public p(Context context, Uri uri) {
        this.a = 3;
        this.b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    @Override // qh.c1
    public /* synthetic */ void J0() {
    }

    private final /* synthetic */ void J(ArrayList arrayList) {
    }

    @Override // qh.c1
    public /* synthetic */ void h1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Components.h61
    public /* synthetic */ void onSeekFinished(i3.a aVar) {
    }

    @Override // org.telegram.ui.Components.h61
    public /* synthetic */ void onSeekStarted(i3.a aVar) {
    }

    @Override // org.telegram.ui.Components.h61
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // qh.c1
    public /* synthetic */ void E(int i9, int i10) {
    }

    @Override // m4.h
    public long f(long j10, long j11) {
        return j11;
    }

    @Override // org.telegram.ui.Components.h61
    public void onVideoSizeChanged(int i9, int i10, int i11, float f10) {
    }
}
