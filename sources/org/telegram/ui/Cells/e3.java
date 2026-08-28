package org.telegram.ui.Cells;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.Editable;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import kh.ac;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.BuildConfig;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.hq0;
import org.telegram.ui.Components.ib0;
import org.telegram.ui.Components.iz0;
import org.telegram.ui.Components.jx0;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.kj;
import org.telegram.ui.Components.kt;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.re0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.x60;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.cw;
import org.telegram.ui.cy;
import org.telegram.ui.dy;
import org.telegram.ui.ei1;
import org.telegram.ui.fm0;
import org.telegram.ui.lm0;
import org.telegram.ui.n21;
import org.telegram.ui.nu0;
import org.telegram.ui.p31;
import org.telegram.ui.wm0;
import org.telegram.ui.wu;
import org.telegram.ui.xu;
import org.telegram.ui.z11;
import org.telegram.ui.zk0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class e3 implements kt, ac, k1, org.telegram.ui.h7, pk0, lm0, ng.a, org.telegram.ui.ActionBar.b6, h61, p4.q, p5.a, qh.m3, qh.c1, Continuation, td.d, m3.e, w3.y {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ e3(int i9) {
        this.a = i9;
    }

    public static e3 s2(View view) {
        return new e3(view);
    }

    @Override // qh.c1
    public /* synthetic */ boolean A(qh.d1 d1Var) {
        return false;
    }

    @Override // qh.c1
    public void B1(Editable editable) {
        ((qh.h0) this.c).i();
        ((qh.g0) this.b).T();
    }

    @Override // org.telegram.ui.Cells.k1
    public String C(long j10) {
        String trim = ((EditTextBoldCursor) this.b).getText().toString().trim();
        if (trim.length() > 16) {
            trim = trim.substring(0, 16);
        }
        if (((iz0) this.c).s || !TextUtils.isEmpty(trim)) {
            return trim;
        }
        return null;
    }

    @Override // qh.m3
    public void C0() {
        qh.s3 s3Var = ((qh.p) this.c).s;
        if (s3Var != null) {
            int i9 = s3Var.T;
            if (i9 == 2) {
                i9 = 0;
            }
            s3Var.U = i9;
            s3Var.e(false, false);
            s3Var.f(2, true);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public void D1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        ve.e.s(t1Var.getContext(), str);
    }

    @Override // qh.c1
    public void E(int i9, int i10) {
        ((qh.g0) this.b).Q(i9, i10);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ CharacterStyle E1(t1 t1Var) {
        return null;
    }

    @Override // td.d
    public boolean G() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean G1(t1 t1Var, MessageObject messageObject) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public ColorFilter H() {
        switch (this.a) {
            case 10:
                return org.telegram.ui.ActionBar.f6.v3;
            default:
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.c;
                return b6Var == null ? org.telegram.ui.ActionBar.f6.v3 : b6Var.H();
        }
    }

    @Override // td.d
    public boolean I(float f10) {
        return false;
    }

    @Override // qh.m3
    public x60 J1(View view) {
        qh.p pVar = (qh.p) this.c;
        x60 x60Var = new x60(pVar, (org.telegram.ui.ActionBar.b6) this.b, view, false, false, true);
        pVar.D = x60Var;
        return x60Var;
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean K0(long j10) {
        return ((iz0) this.c).v;
    }

    @Override // qh.c1
    public void L0(qh.d1 d1Var) {
        ((qh.g0) this.b).g();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public int N0(int i9) {
        switch (this.a) {
            case 10:
                SparseIntArray sparseIntArray = (SparseIntArray) this.b;
                return sparseIntArray != null ? sparseIntArray.get(i9) : org.telegram.ui.ActionBar.f6.w0(null, i9, false);
            default:
                SparseIntArray sparseIntArray2 = (SparseIntArray) this.b;
                int indexOfKey = sparseIntArray2.indexOfKey(i9);
                if (indexOfKey >= 0) {
                    return sparseIntArray2.valueAt(indexOfKey);
                }
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.c;
                return b6Var == null ? org.telegram.ui.ActionBar.f6.w0(null, i9, false) : b6Var.N0(i9);
        }
    }

    @Override // qh.m3
    public void N1() {
        qh.p pVar = (qh.p) this.c;
        pVar.W();
        pVar.X();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public Paint O(String str) {
        switch (this.a) {
            case 10:
                return org.telegram.ui.ActionBar.f6.S0(str);
            default:
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.c;
                return b6Var == null ? org.telegram.ui.ActionBar.f6.S0(str) : b6Var.O(str);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean O1(t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ nu0 P1() {
        return null;
    }

    @Override // m3.e
    public m3.d Q1(m3.l lVar, long j10) {
        long position = lVar.getPosition();
        int min = (int) Math.min(20000L, lVar.getLength() - position);
        d5.y yVar = (d5.y) this.c;
        yVar.z(min);
        lVar.c(0, min, yVar.a);
        int i9 = -1;
        long j11 = -9223372036854775807L;
        int i10 = -1;
        while (yVar.a() >= 4) {
            if (p3.a.a(yVar.b, yVar.a) != 442) {
                yVar.D(1);
            } else {
                yVar.D(4);
                long c10 = w3.v.c(yVar);
                if (c10 != -9223372036854775807L) {
                    long b10 = ((d5.e0) this.b).b(c10);
                    if (b10 > j10) {
                        return j11 == -9223372036854775807L ? new m3.d(-1, b10, position) : new m3.d(0, -9223372036854775807L, position + i10);
                    }
                    if (b10 + 100000 > j10) {
                        return new m3.d(0, -9223372036854775807L, position + yVar.b);
                    }
                    j11 = b10;
                    i10 = yVar.b;
                }
                int i11 = yVar.c;
                if (yVar.a() >= 10) {
                    yVar.D(9);
                    int r10 = yVar.r() & 7;
                    if (yVar.a() >= r10) {
                        yVar.D(r10);
                        if (yVar.a() >= 4) {
                            if (p3.a.a(yVar.b, yVar.a) == 443) {
                                yVar.D(4);
                                int w8 = yVar.w();
                                if (yVar.a() < w8) {
                                    yVar.C(i11);
                                } else {
                                    yVar.D(w8);
                                }
                            }
                            while (true) {
                                if (yVar.a() < 4) {
                                    break;
                                }
                                int a2 = p3.a.a(yVar.b, yVar.a);
                                if (a2 == 442 || a2 == 441 || (a2 >>> 8) != 1) {
                                    break;
                                }
                                yVar.D(4);
                                if (yVar.a() < 2) {
                                    yVar.C(i11);
                                    break;
                                }
                                yVar.C(Math.min(yVar.c, yVar.b + yVar.w()));
                            }
                        } else {
                            yVar.C(i11);
                        }
                    } else {
                        yVar.C(i11);
                    }
                } else {
                    yVar.C(i11);
                }
                i9 = yVar.b;
            }
        }
        return j11 != -9223372036854775807L ? new m3.d(-2, j11, position + i9) : m3.d.d;
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean R1(long j10) {
        return ((iz0) this.c).s;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean S0(t1 t1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.lm0
    public void T(String str, String str2) {
        wm0 wm0Var = ((fm0) this.c).a;
        if ("PHONE_VERIFICATION_NEEDED".equals(str)) {
            wm0Var.O1(true, str2, (zk0) this.b, this, wm0Var.x1);
        } else {
            wm0Var.N1(true, false);
        }
    }

    @Override // ng.a
    public void T0(Canvas canvas, float f10, float f11, float f12, float f13) {
        switch (this.a) {
            case 8:
                canvas.save();
                canvas.clipRect(f10, f11, f12, f13);
                ((PhotoViewer) this.c).T0(canvas, (org.telegram.ui.Components.fa) this.b, -14277082, 855638016, false, true, true);
                canvas.drawColor(637534208);
                canvas.restore();
                break;
            default:
                Paint paint = (Paint) this.b;
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.c;
                zf.z0 z0Var = premiumPreviewFragment.i0;
                if (!premiumPreviewFragment.d0) {
                    z0Var.d(0, (-premiumPreviewFragment.Z.getMeasuredWidth()) * 0.1f * premiumPreviewFragment.X, 0, premiumPreviewFragment.Z.getMeasuredWidth(), 0.0f, premiumPreviewFragment.Z.getMeasuredHeight());
                    canvas.drawRect(f10, f11, f12, f13, z0Var.f);
                    break;
                } else {
                    paint.setColor(premiumPreviewFragment.getThemedColor(org.telegram.ui.ActionBar.f6.a7));
                    canvas.drawRect(f10, f11, f12, f13, paint);
                    break;
                }
        }
    }

    @Override // qh.c1
    public /* synthetic */ boolean T1(boolean z10) {
        return false;
    }

    @Override // qh.c1
    public /* synthetic */ boolean U1(qh.d1 d1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean V(t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // qh.m3
    public void V0() {
        qh.p pVar = (qh.p) this.c;
        if (pVar.getCurrentItemTop() != pVar.E) {
            pVar.b.X1(pVar, 0);
        }
        pVar.Z();
        qh.p.J(pVar);
    }

    @Override // p4.q
    public com.google.android.exoplayer2.upstream.s0 V1() {
        return new g5.b(9, ((p4.q) this.b).V1(), (List) this.c);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean W() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean W1(t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean X(t1 t1Var) {
        return false;
    }

    @Override // qh.m3
    public void X1(qh.n3 n3Var, View view) {
        qh.p pVar = (qh.p) this.c;
        x60 x60Var = new x60(pVar, (org.telegram.ui.ActionBar.b6) this.b, view, false, false, true);
        x60Var.Q = true;
        org.telegram.ui.ActionBar.o2 o2Var = pVar.b.b0;
        pVar.getContext();
        pVar.D = qh.a4.b(x60Var, o2Var, n3Var, true);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Y() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Y0(int i9, t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Z0(MessageObject messageObject) {
        return ll.a(messageObject);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // org.telegram.ui.ActionBar.b6
    public boolean a() {
        switch (this.a) {
        }
        return org.telegram.ui.ActionBar.f6.I.q();
    }

    @Override // kh.ac
    public void a1(float f10, boolean z10) {
        ib0 ib0Var = (ib0) this.b;
        re0 re0Var = (re0) this.c;
        k61 k61Var = re0Var.d;
        if (k61Var == null) {
            return;
        }
        float max = 2.8f / Math.max(60L, r2);
        long q10 = (long) ((((f10 / (1.0f - max)) * max) + f10) * k61Var.q());
        re0Var.e = q10;
        re0Var.d.M(q10, !z10);
        if (z10) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(ib0Var);
        AndroidUtilities.runOnUIThread(ib0Var, 120L);
    }

    @Override // td.d
    public void b() {
        ((td.i) this.b).b();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int b0() {
        return 0;
    }

    @Override // qh.m3
    public void b1(int i9) {
        qh.p pVar = (qh.p) this.c;
        pVar.b.X1(pVar, i9);
        pVar.Z();
        qh.p.J(pVar);
    }

    @Override // org.telegram.ui.Components.pk0
    public boolean c(float f10, float f11, int i9, View view) {
        dy dyVar = (dy) this.c;
        if (view instanceof r2) {
            r2 r2Var = (r2) view;
            if (r2Var.j2) {
                dyVar.N4(r2Var.getDialogId(), view);
                return true;
            }
        }
        cw cwVar = dyVar.v0;
        if (cwVar != null && cwVar.getVisibility() == 0 && dyVar.v0.n) {
            return false;
        }
        return dyVar.o4(view, i9, f10, ((cy) this.b).d);
    }

    @Override // qh.m3
    public void c0(int i9) {
        qh.p.N((qh.p) this.c, 74, i9);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public void c1(int i9, int i10) {
        switch (this.a) {
            case 10:
                break;
            default:
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.c;
                if (b6Var != null) {
                    b6Var.c1(i9, i10);
                    break;
                }
                break;
        }
    }

    @Override // qh.m3
    public void c2(qh.s5 s5Var, String str) {
        qh.p pVar = (qh.p) this.c;
        if (pVar.v == null) {
            org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.b;
            pVar.v = new m.t3(new ei1(7, this, b6Var), b6Var);
        }
        pVar.v.f(s5Var, str);
    }

    @Override // qh.c1
    public void d(qh.d1 d1Var) {
        ((qh.g0) this.b).d(d1Var);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ pg.a d0() {
        return null;
    }

    @Override // qh.m3
    public void d2(qh.l3 l3Var, View view) {
        qh.p pVar = (qh.p) this.c;
        x60 x60Var = new x60(pVar, (org.telegram.ui.ActionBar.b6) this.b, view, false, false, true);
        x60Var.Q = true;
        pVar.D = qh.a4.c(x60Var, pVar.b.b0, pVar.getContext(), (org.telegram.ui.ActionBar.b6) this.b, l3Var, true);
    }

    @Override // org.telegram.ui.h7
    public void dismiss() {
        ((xu) this.c).dismiss();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean e0(t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean f() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean f0(t1 t1Var, TLRPC.User user) {
        return false;
    }

    @Override // qh.m3
    public void f1(qh.d1 d1Var, boolean z10) {
        ((qh.p) this.c).b.t1(d1Var, z10);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean f2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // w3.y
    public void g(d5.y yVar) {
        w3.b0 b0Var = (w3.b0) this.c;
        SparseArray sparseArray = b0Var.f;
        d5.x xVar = (d5.x) this.b;
        if (yVar.r() == 0 && (yVar.r() & 128) != 0) {
            yVar.D(6);
            int a2 = yVar.a() / 4;
            for (int i9 = 0; i9 < a2; i9++) {
                yVar.c(0, 4, xVar.b);
                xVar.p(0);
                int i10 = xVar.i(16);
                xVar.s(3);
                if (i10 == 0) {
                    xVar.s(13);
                } else {
                    int i11 = xVar.i(13);
                    if (sparseArray.get(i11) == null) {
                        sparseArray.put(i11, new w3.z(new e0.i0(b0Var, i11)));
                        b0Var.l++;
                    }
                }
            }
            if (b0Var.a != 2) {
                sparseArray.remove(0);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public Drawable getDrawable(String str) {
        switch (this.a) {
            case 10:
                return null;
            default:
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.c;
                return b6Var == null ? org.telegram.ui.ActionBar.f6.O0(str) : b6Var.getDrawable(str);
        }
    }

    @Override // org.telegram.ui.Cells.k1, org.telegram.ui.Cells.t0
    public /* synthetic */ boolean h() {
        return true;
    }

    @Override // qh.m3
    public void h0() {
        qh.p pVar = (qh.p) this.c;
        qh.o3 o3Var = pVar.r;
        qh.s3 s3Var = pVar.s;
        if (s3Var != null) {
            qh.c3 c3Var = o3Var.j3;
            int i9 = (c3Var != null && c3Var.y() && o3Var.C4()) ? 1 : 0;
            if (s3Var.T == 2) {
                s3Var.U = i9;
            } else {
                s3Var.f(i9, true);
            }
            if (i9 != 0) {
                pVar.V();
            }
        }
        pVar.Y();
    }

    @Override // qh.c1
    public void h1(CharSequence charSequence) {
        ((qh.g0) this.b).G(charSequence);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String i(t1 t1Var) {
        return null;
    }

    @Override // m3.e
    public void i2() {
        d5.y yVar = (d5.y) this.c;
        byte[] bArr = d5.f0.f;
        yVar.getClass();
        yVar.A(bArr.length, bArr);
    }

    @Override // org.telegram.ui.Components.pk0
    public void j() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((dy) this.c).finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean j0() {
        return false;
    }

    @Override // qh.c1
    public void k1(qh.d1 d1Var, int i9, int i10) {
        n9 D;
        qh.g0 g0Var = (qh.g0) this.b;
        if (((qh.h0) this.c).d || i9 == i10 || (D = g0Var.D()) == null) {
            return;
        }
        if (D.y() && D.W == g0Var.H()) {
            return;
        }
        d1Var.post(new kj(this, d1Var, i10, D, g0Var, i9));
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int l0(t1 t1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Components.kt
    public void m1() {
        g3 g3Var = (g3) this.c;
        ((mt) this.b).getText();
        g3Var.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0023 A[RETURN] */
    @Override // qh.m3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean n(float f10) {
        boolean z10;
        qh.s3 s3Var = ((qh.p) this.c).s;
        if (s3Var != null) {
            FrameLayout frameLayout = s3Var.D;
            if (frameLayout != null) {
                frameLayout.getLocationOnScreen(new int[2]);
                if (f10 >= r4[1]) {
                    z10 = true;
                    s3Var.e(z10, true);
                    if (!z10) {
                        return true;
                    }
                }
            }
            z10 = false;
            s3Var.e(z10, true);
            if (!z10) {
            }
        }
        return false;
    }

    @Override // qh.m3
    public void n0(qh.a aVar) {
        qh.p pVar = (qh.p) this.c;
        ki kiVar = pVar.b;
        org.telegram.ui.ActionBar.o2 o2Var = kiVar.b0;
        if (o2Var != null && aVar != null && (aVar.b instanceof TL_iv.pageBlockMap) && AndroidUtilities.isMapsInstalled(o2Var)) {
            ki kiVar2 = new ki(pVar.getContext(), kiVar.b0, false, false, false, null);
            kiVar2.V1 = new wa.a(21);
            kiVar2.L = true;
            kiVar2.t1.setVisibility(8);
            kiVar2.p2 = new hq0(pVar, aVar, kiVar2, 4);
            kiVar2.r1();
            kiVar2.show();
        }
    }

    @Override // td.d
    public void n1() {
        ((td.i) this.b).c((td.j) this.c);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean n2(int i9) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public void o(float f10, float f11, int i9, int i10) {
        switch (this.a) {
            case 10:
                org.telegram.ui.ActionBar.f6.q(f10, f11, i9, i10);
                break;
            default:
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.c;
                if (b6Var != null) {
                    b6Var.o(f10, f11, i9, i10);
                    break;
                } else {
                    org.telegram.ui.ActionBar.f6.q(f10, f11, i9, i10);
                    break;
                }
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean o0() {
        return false;
    }

    @Override // org.telegram.ui.h7
    public void o1(org.telegram.ui.r6 r6Var, hh.a aVar, boolean z10) {
        xu xuVar = (xu) this.c;
        wu wuVar = xuVar.T;
        if (aVar != null) {
            ((hh.b) this.b).i(aVar);
            xuVar.a0.d();
            hh.b bVar = xuVar.c0;
            jx0[] jx0VarArr = xuVar.X;
            z1[] z1VarArr = xuVar.Y;
            z1 z1Var = z1VarArr[0];
            if (z1Var != null) {
                jx0 jx0Var = jx0VarArr[0];
                boolean z11 = bVar.m;
                jx0Var.c = z11;
                z1Var.c(z11, true);
            }
            z1 z1Var2 = z1VarArr[1];
            if (z1Var2 != null) {
                jx0 jx0Var2 = jx0VarArr[1];
                boolean z12 = bVar.n;
                jx0Var2.c = z12;
                z1Var2.c(z12, true);
            }
            z1 z1Var3 = z1VarArr[2];
            if (z1Var3 != null) {
                jx0 jx0Var3 = jx0VarArr[2];
                boolean z13 = bVar.o;
                jx0Var3.c = z13;
                z1Var3.c(z13, true);
            }
            z1 z1Var4 = z1VarArr[3];
            if (z1Var4 != null) {
                jx0 jx0Var4 = jx0VarArr[3];
                boolean z14 = bVar.p;
                jx0Var4.c = z14;
                z1Var4.c(z14, true);
            }
            z1 z1Var5 = z1VarArr[4];
            if (z1Var5 != null) {
                jx0 jx0Var5 = jx0VarArr[4];
                boolean z15 = bVar.q;
                jx0Var5.c = z15;
                z1Var5.c(z15, true);
            }
            xuVar.W.a(wuVar.d(), true);
            wuVar.c(true);
        }
    }

    @Override // qh.m3
    public void onContentChanged() {
        qh.p pVar = (qh.p) this.c;
        qh.s3 s3Var = pVar.s;
        if (s3Var != null) {
            s3Var.setSendLoading(pVar.r.m3());
        }
        pVar.U(true);
        pVar.X();
        qh.d dVar = pVar.L;
        AndroidUtilities.cancelRunOnUIThread(dVar);
        AndroidUtilities.runOnUIThread(dVar, 1000L);
    }

    @Override // org.telegram.ui.Components.h61
    public void onError(k61 k61Var, Exception exc) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
        int i9 = secretMediaViewer.X;
        if (i9 <= 0) {
            FileLog.e(exc);
            return;
        }
        secretMediaViewer.X = i9 - 1;
        AndroidUtilities.runOnUIThread(new n21(4, this, (File) this.b), 100L);
    }

    @Override // org.telegram.ui.Components.h61
    public /* synthetic */ void onRenderedFirstFrame(i3.a aVar) {
    }

    @Override // org.telegram.ui.Components.h61
    public void onStateChanged(boolean z10, int i9) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
        p31 p31Var = secretMediaViewer.e1;
        if (secretMediaViewer.y == null || secretMediaViewer.d0 == null) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(p31Var);
        AndroidUtilities.runOnUIThread(p31Var);
        if (i9 == 4 || i9 == 1) {
            try {
                secretMediaViewer.b.getWindow().clearFlags(128);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        } else {
            try {
                secretMediaViewer.b.getWindow().addFlags(128);
            } catch (Exception e11) {
                FileLog.e(e11);
            }
        }
        if (i9 == 3 && secretMediaViewer.w.getVisibility() != 0) {
            secretMediaViewer.w.setVisibility(0);
        }
        if (secretMediaViewer.y.z() && i9 != 4) {
            if (secretMediaViewer.A) {
                return;
            }
            secretMediaViewer.A = true;
        } else if (secretMediaViewer.A) {
            secretMediaViewer.A = false;
            if (i9 == 4) {
                secretMediaViewer.D = true;
                if (secretMediaViewer.E) {
                    secretMediaViewer.e(true, !secretMediaViewer.m1);
                } else {
                    secretMediaViewer.y.M(0L, false);
                    secretMediaViewer.y.D();
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.h61
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.h61
    public void onVideoSizeChanged(int i9, int i10, int i11, float f10) {
        c5.c cVar = ((SecretMediaViewer) this.c).w;
        if (cVar != null) {
            if (i11 != 90 && i11 != 270) {
                i10 = i9;
                i9 = i10;
            }
            cVar.a(i9 == 0 ? 1.0f : (i10 * f10) / i9, i11);
        }
    }

    @Override // qh.c1
    public boolean p() {
        return ((qh.g0) this.b).K();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public int p0(int i9) {
        switch (this.a) {
            case 10:
                return N0(i9);
            default:
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.c;
                return b6Var == null ? org.telegram.ui.ActionBar.f6.w0(null, i9, false) : b6Var.p0(i9);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public int q1(int i9) {
        switch (this.a) {
            case 10:
                return N0(i9);
            default:
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.c;
                return b6Var == null ? org.telegram.ui.ActionBar.f6.w0(null, i9, false) : b6Var.q1(i9);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ o9 q2() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean r0(org.telegram.ui.Components.t5 t5Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean r1() {
        return false;
    }

    @Override // ng.a
    public /* synthetic */ void t() {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public boolean t0() {
        switch (this.a) {
            case 10:
                return false;
            default:
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.c;
                return b6Var == null ? org.telegram.ui.ActionBar.f6.a1() : b6Var.t0();
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        t5.a aVar = (t5.a) this.b;
        Bundle bundle = (Bundle) this.c;
        aVar.getClass();
        if (!task.isSuccessful()) {
            return task;
        }
        Bundle bundle2 = (Bundle) task.getResult();
        return (bundle2 == null || !bundle2.containsKey("google.messenger")) ? task : aVar.a(bundle).onSuccessTask(t5.m.a, t5.b.b);
    }

    public String toString() {
        switch (this.a) {
            case 20:
                return "Bounds{lower=" + ((i0.b) this.b) + " upper=" + ((i0.b) this.c) + "}";
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

    @Override // org.telegram.ui.Components.pk0
    public void u(float f10) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((dy) this.c).movePreviewFragment(f10);
        }
    }

    @Override // qh.m3
    public void v1() {
        qh.s3 s3Var = ((qh.p) this.c).s;
        if (s3Var != null) {
            s3Var.e(false, true);
            int i9 = s3Var.U;
            s3Var.f(i9 != 2 ? i9 : 0, true);
        }
    }

    public void v2(String str, PrintWriter printWriter) {
        w1.b bVar = (w1.b) this.c;
        if (bVar.d.c <= 0) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Loaders:");
        String str2 = str + "    ";
        int i9 = 0;
        while (true) {
            a0.l lVar = bVar.d;
            if (i9 >= lVar.c) {
                return;
            }
            w1.a aVar = (w1.a) lVar.b[i9];
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(bVar.d.a[i9]);
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
            k5.d dVar = aVar.l;
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
                c2.t tVar = aVar.n;
                tVar.getClass();
                printWriter.print(str2 + "  ");
                printWriter.print("mDeliveredData=");
                printWriter.println(tVar.b);
            }
            printWriter.print(str2);
            printWriter.print("mData=");
            k5.d dVar2 = aVar.l;
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
            i9++;
        }
    }

    @Override // p4.q
    public com.google.android.exoplayer2.upstream.s0 x0(p4.m mVar, p4.j jVar) {
        return new g5.b(9, ((p4.q) this.b).x0(mVar, jVar), (List) this.c);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean x1(t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // ng.a
    public kg.d y() {
        switch (this.a) {
            case 8:
                if (Build.VERSION.SDK_INT < 29) {
                    break;
                } else {
                    kg.e eVar = new kg.e(this);
                    ((PhotoViewer) this.c).V.add(eVar);
                    break;
                }
        }
        return new kg.f(this);
    }

    @Override // p5.a
    public void y0(Bitmap bitmap) {
        e3 e3Var = (e3) this.b;
        e3Var.c = bitmap;
        p5.f fVar = (p5.f) this.c;
        fVar.l = e3Var;
        fVar.b();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean z0(MessageObject messageObject) {
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean z1() {
        return false;
    }

    public /* synthetic */ e3(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.c = obj;
        this.b = obj2;
    }

    @Override // org.telegram.ui.Components.h61
    public void onRenderedFirstFrame() {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
        if (secretMediaViewer.Y) {
            return;
        }
        secretMediaViewer.Y = true;
        secretMediaViewer.e.invalidate();
    }

    public /* synthetic */ e3(Object obj, Object obj2, boolean z10, int i9) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
    }

    public e3(IBinder iBinder) {
        this.a = 21;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (interfaceDescriptor != "android.os.IMessenger" && (interfaceDescriptor == null || !interfaceDescriptor.equals("android.os.IMessenger"))) {
            if (interfaceDescriptor != "com.google.android.gms.iid.IMessengerCompat" && (interfaceDescriptor == null || !interfaceDescriptor.equals("com.google.android.gms.iid.IMessengerCompat"))) {
                Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
                throw new RemoteException();
            }
            this.c = new t5.g(iBinder);
            this.b = null;
            return;
        }
        this.b = new Messenger(iBinder);
        this.c = null;
    }

    public e3(w5.a aVar) {
        this.a = 15;
        this.b = aVar == null ? null : aVar.b;
    }

    public e3(org.telegram.ui.ActionBar.b6 b6Var) {
        this.a = 12;
        this.b = new SparseIntArray();
        this.c = b6Var;
        r2();
    }

    public e3(View view) {
        this.a = 4;
        v51 v51Var = new v51(this, view);
        this.b = v51Var;
        view.addOnLayoutChangeListener(v51Var);
    }

    public e3(androidx.lifecycle.t tVar, androidx.lifecycle.t0 t0Var) {
        this.a = 27;
        this.b = tVar;
        this.c = (w1.b) new a5.m(t0Var, w1.b.f).n(w1.b.class);
    }

    public e3(d5.e0 e0Var) {
        this.a = 28;
        this.b = e0Var;
        this.c = new d5.y();
    }

    private final /* synthetic */ void t2() {
    }

    private final /* synthetic */ void u2() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A1(t1 t1Var) {
    }

    @Override // kh.ac
    public /* synthetic */ void B(float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void B0() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void C1(MessageObject messageObject) {
    }

    @Override // td.d
    public void D(boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public void F0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void G0(t1 t1Var) {
    }

    @Override // kh.ac
    public /* synthetic */ void H0(boolean z10) {
    }

    @Override // org.telegram.ui.h7
    public void H1() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void I0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void I1() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void J(t1 t1Var) {
    }

    @Override // qh.c1
    public /* synthetic */ void J0() {
    }

    @Override // kh.ac
    public /* synthetic */ void K(float f10) {
    }

    @Override // kh.ac
    public /* synthetic */ void K1(float f10) {
    }

    @Override // td.d
    public void L() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void N(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void P(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void R(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void U(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void U0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void W0(t1 t1Var) {
    }

    @Override // kh.ac
    public /* synthetic */ void X0(float f10) {
    }

    @Override // kh.ac
    public /* synthetic */ void Z1(float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void a0(t1 t1Var) {
    }

    @Override // kh.ac
    public /* synthetic */ void a2() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void b2(t1 t1Var) {
    }

    @Override // org.telegram.ui.h7
    public void clear() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void d1() {
    }

    @Override // kh.ac
    public /* synthetic */ void g0() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void g2(t1 t1Var) {
    }

    @Override // kh.ac
    public /* synthetic */ void h2(float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i0(int i9) {
    }

    @Override // kh.ac
    public /* synthetic */ void i1(long j10) {
    }

    @Override // kh.ac
    public /* synthetic */ void j1(boolean z10) {
    }

    @Override // kh.ac
    public /* synthetic */ void k(int i9) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void k2() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void m() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void m0(t1 t1Var) {
    }

    @Override // kh.ac
    public /* synthetic */ void m2(long j10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void o2() {
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

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void q0(String str) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void r(t1 t1Var) {
    }

    public void r2() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void s1(t1 t1Var) {
    }

    @Override // kh.ac
    public /* synthetic */ void u1(float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void v(t1 t1Var) {
    }

    @Override // kh.ac
    public /* synthetic */ void v0(float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void w() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void x(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void z(t1 t1Var) {
    }

    public e3(re0 re0Var) {
        this.a = 2;
        this.c = re0Var;
        this.b = new ib0(this, 9);
    }

    public e3(String str, String str2) {
        this.a = 25;
        this.b = str;
        this.c = str2;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("userId should not be empty");
        }
    }

    public e3(String str) {
        this.a = 17;
        this.c = null;
        this.b = str;
    }

    public e3(EditText editText) {
        this.a = 16;
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

    private final /* synthetic */ void w2(int i9, int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void L1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void O0(int i9, t1 t1Var) {
    }

    @Override // kh.ac
    public /* synthetic */ void P0(float f10, int i9) {
    }

    @Override // kh.ac
    public /* synthetic */ void Q(long j10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void Q0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void S(int i9, t1 t1Var) {
    }

    @Override // kh.ac
    public /* synthetic */ void Y1(float f10, int i9) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void e1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void e2(t1 t1Var, long j10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void g1(t1 t1Var, TLRPC.Document document) {
    }

    @Override // kh.ac
    public /* synthetic */ void j2(int i9, long j10) {
    }

    @Override // kh.ac
    public /* synthetic */ void p1(float f10, int i9) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void t1(t1 t1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void w1(t1 t1Var, eh.f fVar) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void y1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    public e3(PremiumPreviewFragment premiumPreviewFragment) {
        this.a = 9;
        this.c = premiumPreviewFragment;
        this.b = new Paint();
    }

    public e3(w3.b0 b0Var) {
        this.a = 29;
        this.c = b0Var;
        this.b = new d5.x(new byte[4], 4);
    }

    public e3(z11 z11Var) {
        this.a = 10;
        this.c = z11Var;
    }

    public e3(PhotoViewer photoViewer) {
        this.a = 8;
        this.c = photoViewer;
        this.b = new org.telegram.ui.Components.fa(photoViewer.X, photoViewer.a0, 0, false);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void D0(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void E0(t1 t1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void R0(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // w3.y
    public void e(d5.e0 e0Var, m3.m mVar, w3.d0 d0Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void k0(t1 t1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void l1(t1 t1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void p2(t1 t1Var, int i9, int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void s0(t1 t1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M1(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void q(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i9) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void u0(t1 t1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void w0(t1 t1Var, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void S1(t1 t1Var, int i9, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void l(t1 t1Var, ArrayList arrayList, int i9, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void l2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void Z(t1 t1Var, TLRPC.Chat chat, int i9, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F1(MessageObject messageObject, String str, String str2, String str3, String str4, int i9, int i10) {
    }
}
