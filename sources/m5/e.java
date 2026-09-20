package m5;

import a4.m;
import a9.r;
import ai.q4;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.WorkSource;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.biometric.n;
import c3.h0;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import n6.l;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.a2;
import org.telegram.ui.Cells.c1;
import org.telegram.ui.Cells.f3;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.m01;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.ny0;
import org.telegram.ui.Components.ro0;
import org.telegram.ui.Components.y5;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.dn0;
import org.telegram.ui.f31;
import org.telegram.ui.i5;
import org.telegram.ui.j7;
import org.telegram.ui.jv;
import org.telegram.ui.kv;
import org.telegram.ui.pn0;
import org.telegram.ui.pv0;
import org.telegram.ui.s6;
import org.telegram.ui.sl0;
import org.telegram.ui.xm0;
import pg.i0;
import ph.i;
import r7.h;
import r7.j;
import r7.k;
import r7.o;
import r7.z;
import s4.g1;
import s4.h1;
import u2.b1;
import u4.g;
import v7.j0;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public class e implements n5.b, ro0, l1, j7, dn0, fh.a, f6, le.d, s, SuccessContinuation {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ e(char c10, int i10) {
        this.a = i10;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean B1() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    @Override // le.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void C(float f7, int i10) {
        boolean z10;
        i iVar = (i) this.c;
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

    @Override // le.d
    public void D(int i10, float f7, float f10, le.e eVar) {
        i iVar = (i) this.c;
        iVar.c.a(f7);
        iVar.d.a(f7);
        iVar.b.a(f7);
        ((Runnable) this.b).run();
    }

    @Override // org.telegram.ui.ActionBar.f6
    public int F0(int i10) {
        switch (this.a) {
            case 12:
                SparseIntArray sparseIntArray = (SparseIntArray) this.b;
                return sparseIntArray != null ? sparseIntArray.get(i10) : j6.w0(null, i10, false);
            default:
                SparseIntArray sparseIntArray2 = (SparseIntArray) this.b;
                int indexOfKey = sparseIntArray2.indexOfKey(i10);
                if (indexOfKey >= 0) {
                    return sparseIntArray2.valueAt(indexOfKey);
                }
                f6 f6Var = (f6) this.c;
                return f6Var == null ? j6.w0(null, i10, false) : f6Var.F0(i10);
        }
    }

    @Override // org.telegram.ui.ActionBar.f6
    public Paint G(String str) {
        switch (this.a) {
            case 12:
                return j6.S0(str);
            default:
                f6 f6Var = (f6) this.c;
                return f6Var == null ? j6.S0(str) : f6Var.G(str);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean G1(u1 u1Var, TLRPC.Chat chat) {
        return false;
    }

    public View H(int i10, int i11, int i12, int i13) {
        g1 g1Var = (g1) this.c;
        h1 h1Var = (h1) this.b;
        int g10 = h1Var.g();
        int x10 = h1Var.x();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View C = h1Var.C(i10);
            int c10 = h1Var.c(C);
            int D = h1Var.D(C);
            g1Var.b = g10;
            g1Var.c = x10;
            g1Var.d = c10;
            g1Var.e = D;
            if (i12 != 0) {
                g1Var.a = i12;
                if (g1Var.a()) {
                    return C;
                }
            }
            if (i13 != 0) {
                g1Var.a = i13;
                if (g1Var.a()) {
                    view = C;
                }
            }
            i10 += i14;
        }
        return view;
    }

    @Override // org.telegram.ui.j7
    public void H0(s6 s6Var, zh.a aVar, boolean z10) {
        kv kvVar = (kv) this.c;
        jv jvVar = kvVar.X;
        if (aVar != null) {
            ((zh.b) this.b).i(aVar);
            kvVar.e0.e();
            zh.b bVar = kvVar.g0;
            ny0[] ny0VarArr = kvVar.b0;
            a2[] a2VarArr = kvVar.c0;
            a2 a2Var = a2VarArr[0];
            if (a2Var != null) {
                ny0 ny0Var = ny0VarArr[0];
                boolean z11 = bVar.m;
                ny0Var.c = z11;
                a2Var.c(z11, true);
            }
            a2 a2Var2 = a2VarArr[1];
            if (a2Var2 != null) {
                ny0 ny0Var2 = ny0VarArr[1];
                boolean z12 = bVar.n;
                ny0Var2.c = z12;
                a2Var2.c(z12, true);
            }
            a2 a2Var3 = a2VarArr[2];
            if (a2Var3 != null) {
                ny0 ny0Var3 = ny0VarArr[2];
                boolean z13 = bVar.o;
                ny0Var3.c = z13;
                a2Var3.c(z13, true);
            }
            a2 a2Var4 = a2VarArr[3];
            if (a2Var4 != null) {
                ny0 ny0Var4 = ny0VarArr[3];
                boolean z14 = bVar.p;
                ny0Var4.c = z14;
                a2Var4.c(z14, true);
            }
            a2 a2Var5 = a2VarArr[4];
            if (a2Var5 != null) {
                ny0 ny0Var5 = ny0VarArr[4];
                boolean z15 = bVar.q;
                ny0Var5.c = z15;
                a2Var5.c(z15, true);
            }
            kvVar.a0.a(jvVar.d(), true);
            jvVar.c(true);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean I1() {
        return false;
    }

    public boolean J(View view) {
        g1 g1Var = (g1) this.c;
        h1 h1Var = (h1) this.b;
        int g10 = h1Var.g();
        int x10 = h1Var.x();
        int c10 = h1Var.c(view);
        int D = h1Var.D(view);
        g1Var.b = g10;
        g1Var.c = x10;
        g1Var.d = c10;
        g1Var.e = D;
        g1Var.a = 24579;
        return g1Var.a();
    }

    public void K(o0.f fVar) {
        n nVar = (n) this.c;
        a6.i iVar = (a6.i) this.b;
        int i10 = fVar.b;
        if (i10 != 0) {
            nVar.execute(new q4(iVar, i10));
        } else {
            nVar.execute(new i9.s(19, iVar, fVar.a));
        }
    }

    @Override // org.telegram.ui.ActionBar.f6
    public void L0(int i10, int i11) {
        switch (this.a) {
            case 12:
                break;
            default:
                f6 f6Var = (f6) this.c;
                if (f6Var != null) {
                    f6Var.L0(i10, i11);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean N0(long j3) {
        return ((m01) this.c).v;
    }

    @Override // org.telegram.ui.Cells.l1
    public void N1(u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        nf.f.s(u1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean O(u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ CharacterStyle O1(u1 u1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Q(u1 u1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Q1(u1 u1Var, MessageObject messageObject) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean R() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int V() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean V1(u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    public h0 W(int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = (int[]) this.b;
            if (i11 >= iArr.length) {
                e2.a.e("BaseMediaChunkOutput", "Unmatched track of type: " + i10);
                return new c3.n();
            }
            if (i10 == iArr[i11]) {
                return ((b1[]) this.c)[i11];
            }
            i11++;
        }
    }

    @Override // org.telegram.ui.Components.ro0
    public void X(float f7, boolean z10) {
        i5.c = f7;
        ((TextView) this.b).setText("Saturation " + (f7 * 5.0f));
        aw0 aw0Var = ((i5) this.c).b;
        aw0Var.N();
        aw0Var.M();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean X0(u1 u1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ hh.a Y() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ pv0 Y1() {
        return null;
    }

    public int Z(Context context, com.google.android.gms.common.api.c cVar) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.b;
        l.h(context);
        l.h(cVar);
        int i10 = 0;
        if (!cVar.k()) {
            return 0;
        }
        int l4 = cVar.l();
        int i11 = sparseIntArray.get(l4, -1);
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        while (true) {
            if (i12 >= sparseIntArray.size()) {
                i10 = -1;
                break;
            }
            int keyAt = sparseIntArray.keyAt(i12);
            if (keyAt > l4 && sparseIntArray.get(keyAt) == 0) {
                break;
            }
            i12++;
        }
        if (i10 == -1) {
            i10 = ((k6.e) this.c).d(context, l4);
        }
        sparseIntArray.put(l4, i10);
        return i10;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // org.telegram.ui.ActionBar.f6
    public boolean a() {
        switch (this.a) {
        }
        return j6.I.q();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean a0(u1 u1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean a2(long j3) {
        return ((m01) this.c).s;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008c A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:18:0x004d, B:22:0x005a, B:23:0x006e, B:25:0x008c, B:28:0x0099, B:29:0x0177, B:34:0x00b9, B:37:0x00f9, B:40:0x0118, B:43:0x0125, B:48:0x010f, B:50:0x0063), top: B:17:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b9 A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:18:0x004d, B:22:0x005a, B:23:0x006e, B:25:0x008c, B:28:0x0099, B:29:0x0177, B:34:0x00b9, B:37:0x00f9, B:40:0x0118, B:43:0x0125, B:48:0x010f, B:50:0x0063), top: B:17:0x004d }] */
    @Override // com.google.android.gms.common.api.internal.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void accept(Object obj, Object obj2) {
        r7.i iVar;
        long j3;
        long min;
        k6.c cVar;
        androidx.activity.n nVar = (androidx.activity.n) this.b;
        LocationRequest locationRequest = (LocationRequest) this.c;
        k kVar = (k) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        kVar.getClass();
        p e = nVar.e();
        com.google.android.gms.common.api.internal.n nVar2 = e.c;
        nVar2.getClass();
        k6.c[] m10 = kVar.m();
        boolean z10 = false;
        if (m10 != null) {
            int length = m10.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    cVar = null;
                    break;
                }
                cVar = m10[i10];
                if ("location_updates_with_callback".equals(cVar.a)) {
                    break;
                } else {
                    i10++;
                }
            }
            if (cVar != null && cVar.b() >= 1) {
                z10 = true;
            }
        }
        synchronized (kVar.V) {
            try {
                r7.i iVar2 = (r7.i) kVar.V.get(nVar2);
                if (iVar2 != null && !z10) {
                    iVar2.M0(e);
                    iVar = iVar2;
                    iVar2 = null;
                    String str = nVar2.b + "@" + System.identityHashCode(nVar2.a);
                    if (z10) {
                        z zVar = (z) kVar.u();
                        int i11 = locationRequest.a;
                        long j10 = locationRequest.b;
                        long j11 = locationRequest.c;
                        long j12 = locationRequest.d;
                        long j13 = locationRequest.e;
                        int i12 = locationRequest.f;
                        float f7 = locationRequest.h;
                        boolean z11 = locationRequest.n;
                        long j14 = locationRequest.r;
                        int i13 = locationRequest.s;
                        int i14 = locationRequest.v;
                        String str2 = locationRequest.w;
                        boolean z12 = locationRequest.x;
                        WorkSource workSource = locationRequest.y;
                        j jVar = locationRequest.E;
                        String str3 = Build.VERSION.SDK_INT < 30 ? null : str2;
                        if (j11 == -1) {
                            min = j10;
                            j3 = -1;
                        } else if (i11 == 105) {
                            j3 = -1;
                            min = j11;
                        } else {
                            j3 = -1;
                            min = Math.min(j11, j10);
                        }
                        o oVar = new o(1, new r7.n(new LocationRequest(i11, j10, min, Math.max(j12, j10), Long.MAX_VALUE, j13, i12, f7, z11, j14 == j3 ? j10 : j14, i13, i14, str3, z12, new WorkSource(workSource), jVar), null, false, false, null, false, false, null, Long.MAX_VALUE), null, iVar, null, new h(taskCompletionSource, iVar), str);
                        Parcel O0 = zVar.O0();
                        r7.d.c(O0, oVar);
                        zVar.S0(O0, 59);
                    } else {
                        z zVar2 = (z) kVar.u();
                        r7.l lVar = new r7.l(2, iVar2 == null ? null : iVar2, iVar, null, null, str);
                        r7.e eVar = new r7.e(null, taskCompletionSource);
                        Parcel O02 = zVar2.O0();
                        r7.d.c(O02, lVar);
                        r7.d.c(O02, locationRequest);
                        r7.d.d(O02, eVar);
                        zVar2.S0(O02, 88);
                    }
                }
                r7.i iVar3 = new r7.i(nVar);
                kVar.V.put(nVar2, iVar3);
                iVar = iVar3;
                String str4 = nVar2.b + "@" + System.identityHashCode(nVar2.a);
                if (z10) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean b0(u1 u1Var, TLRPC.User user) {
        return false;
    }

    @Override // org.telegram.ui.dn0
    public void c(String str, String str2) {
        pn0 pn0Var = ((xm0) this.c).a;
        if ("PHONE_VERIFICATION_NEEDED".equals(str)) {
            pn0Var.O1(true, str2, (sl0) this.b, this, pn0Var.B1);
        } else {
            pn0Var.N1(true, false);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean c2(u1 u1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // fh.a
    public ch.d d() {
        if (Build.VERSION.SDK_INT < 29) {
            return new ch.f(this);
        }
        ch.e eVar = new ch.e(this);
        ((PhotoViewer) this.c).Z.add(eVar);
        return eVar;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean d1(int i10, u1 u1Var) {
        return false;
    }

    @Override // org.telegram.ui.j7
    public void dismiss() {
        ((kv) this.c).dismiss();
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean e() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean e0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean f() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public int f0(int i10) {
        switch (this.a) {
            case 12:
                return F0(i10);
            default:
                f6 f6Var = (f6) this.c;
                return f6Var == null ? j6.w0(null, i10, false) : f6Var.f0(i10);
        }
    }

    public void g(Object obj, String str) {
        ((ArrayList) this.b).add(a4.a.C(str, "=", String.valueOf(obj)));
    }

    @Override // org.telegram.ui.ActionBar.f6
    public int g1(int i10) {
        switch (this.a) {
            case 12:
                return F0(i10);
            default:
                f6 f6Var = (f6) this.c;
                return f6Var == null ? j6.w0(null, i10, false) : f6Var.g1(i10);
        }
    }

    @Override // fd.a
    public Object get() {
        switch (this.a) {
            case 0:
                return new d((Context) ((r) this.b).a, (lf.h) ((m) this.c).get());
            default:
                int i10 = 23;
                rb.a aVar = new rb.a(i10);
                qb.b bVar = new qb.b(i10);
                Object obj = ((fd.a) this.b).get();
                fd.a aVar2 = (fd.a) this.c;
                return new s5.h(aVar, bVar, s5.a.f, (s5.j) obj, aVar2);
        }
    }

    @Override // org.telegram.ui.Components.ro0
    public /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public Drawable getDrawable(String str) {
        switch (this.a) {
            case 12:
                return null;
            default:
                f6 f6Var = (f6) this.c;
                return f6Var == null ? j6.O0(str) : f6Var.getDrawable(str);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String h(u1 u1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int i0(u1 u1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean i1(MessageObject messageObject) {
        return c1.a(messageObject);
    }

    @Override // org.telegram.ui.Components.ro0
    public /* synthetic */ int l0() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean l2(u1 u1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public void m(float f7, float f10, int i10, int i11) {
        switch (this.a) {
            case 12:
                j6.q(f7, f10, i10, i11);
                break;
            default:
                f6 f6Var = (f6) this.c;
                if (f6Var != null) {
                    f6Var.m(f7, f10, i10, i11);
                    break;
                } else {
                    j6.q(f7, f10, i10, i11);
                    break;
                }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean m0() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public boolean n0() {
        switch (this.a) {
            case 12:
                return false;
            default:
                f6 f6Var = (f6) this.c;
                return f6Var == null ? j6.a1() : f6Var.n0();
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean p0(y5 y5Var) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.List] */
    public ArrayList q() {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        n2.e eVar = (n2.e) this.c;
        Context context = (Context) this.b;
        Class cls = (Class) eVar.b;
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

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        int i10 = 1;
        switch (this.a) {
            case 27:
                da.a aVar = (da.a) obj;
                w9.m mVar = ((w9.k) this.c).e;
                if (aVar != null) {
                    return Tasks.whenAll((Task<?>[]) new Task[]{w9.m.b(mVar), mVar.m.y((Executor) this.b, null)});
                }
                Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
                return Tasks.forResult(null);
            default:
                return ((w9.m) this.c).e.l(new g(i10, this, (Boolean) obj));
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append(this.c.getClass().getSimpleName());
                sb2.append('{');
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    sb2.append((String) arrayList.get(i10));
                    if (i10 < size - 1) {
                        sb2.append(", ");
                    }
                }
                sb2.append('}');
                return sb2.toString();
            case 17:
                return "Bounds{lower=" + ((i0.b) this.b) + " upper=" + ((i0.b) this.c) + "}";
            default:
                return super.toString();
        }
    }

    public byte[] v(n3.a aVar) {
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

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean v2(int i10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public String w(long j3) {
        String trim = ((EditTextBoldCursor) this.b).getText().toString().trim();
        if (trim.length() > 16) {
            trim = trim.substring(0, 16);
        }
        if (((m01) this.c).s || !TextUtils.isEmpty(trim)) {
            return trim;
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public ColorFilter x() {
        switch (this.a) {
            case 12:
                return j6.v3;
            default:
                f6 f6Var = (f6) this.c;
                return f6Var == null ? j6.v3 : f6Var.x();
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean x0(MessageObject messageObject) {
        return true;
    }

    @Override // fh.a
    public void y(Canvas canvas, float f7, float f10, float f11, float f12) {
        canvas.save();
        canvas.clipRect(f7, f10, f11, f12);
        ((PhotoViewer) this.c).T0(canvas, (ma) this.b, -14277082, 855638016, false, true, true);
        canvas.drawColor(637534208);
        canvas.restore();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ s9 z2() {
        return null;
    }

    public /* synthetic */ e(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ e(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ e(Object obj) {
        this.a = 2;
        this.c = obj;
        this.b = new ArrayList();
    }

    public e(k6.e eVar) {
        this.a = 3;
        this.b = new SparseIntArray();
        l.h(eVar);
        this.c = eVar;
    }

    public e(f6 f6Var) {
        this.a = 13;
        this.b = new SparseIntArray();
        this.c = f6Var;
        l();
    }

    public e(int i10, byte b10) {
        this.a = i10;
        switch (i10) {
            case 29:
                this.b = new AtomicInteger();
                this.c = new AtomicInteger();
                break;
            default:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.b = byteArrayOutputStream;
                this.c = new DataOutputStream(byteArrayOutputStream);
                break;
        }
    }

    public e(i0 i0Var) {
        this.a = 14;
        this.b = i0Var;
    }

    public e(f3 f3Var) {
        this.a = 21;
        Context context = (Context) f3Var.b;
        int e = w9.h.e(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (e != 0) {
            this.b = "Unity";
            String string = context.getResources().getString(e);
            this.c = string;
            String g10 = j0.g("Unity Editor version is: ", string);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", g10, null);
                return;
            }
            return;
        }
        if (context.getAssets() != null) {
            try {
                InputStream open = context.getAssets().open("flutter_assets/NOTICES.Z");
                if (open != null) {
                    open.close();
                }
                this.b = "Flutter";
                this.c = null;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
                    return;
                }
                return;
            } catch (IOException unused) {
            }
        }
        this.b = null;
        this.c = null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A0() {
    }

    @Override // org.telegram.ui.Components.ro0
    public void B() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void R1() {
    }

    @Override // fh.a
    public /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.j7
    public void clear() {
    }

    @Override // org.telegram.ui.j7
    public void h1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void k() {
    }

    public void l() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void l1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void p() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void x2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void D1(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public void E0(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void F(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void G0(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void J0(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K1(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void L(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void M1(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void O0(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void T(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Y0(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void a1(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void d0(int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void e2(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j0(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void m2(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void o(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void o0(String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void r(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void t(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void u(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z0(u1 u1Var) {
    }

    private final /* synthetic */ void U(int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void E(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void E1(u1 u1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void H1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void M(int i10, u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Q0(int i10, u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void S0(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void T1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void g2(u1 u1Var, long j3) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i(u1 u1Var, bi.f fVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q1(u1 u1Var, TLRPC.Document document) {
    }

    public e(h1 h1Var) {
        this.a = 19;
        this.b = h1Var;
        g1 g1Var = new g1();
        g1Var.a = 0;
        this.c = g1Var;
    }

    public e(int i10) {
        this.a = 25;
        Bitmap createBitmap = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
        this.b = createBitmap;
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        this.c = new BitmapShader(createBitmap, tileMode, tileMode);
    }

    public e(w9.k kVar, Executor executor, String str) {
        this.a = 27;
        this.c = kVar;
        this.b = executor;
    }

    public e(f31 f31Var) {
        this.a = 12;
        this.c = f31Var;
    }

    public e(PhotoViewer photoViewer) {
        this.a = 11;
        this.c = photoViewer;
        this.b = new ma(photoViewer.b0, photoViewer.e0, 0, false);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void B0(u1 u1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void C0(u1 u1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void W0(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void g0(u1 u1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void r0(u1 u1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void v1(u1 u1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y2(u1 u1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U1(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void u0(u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void w0(u1 u1Var, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void b2(u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void t2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void S(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void P1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
