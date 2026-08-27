package org.telegram.ui;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.BuildConfig;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public class i6 implements org.telegram.ui.Components.jt, lh.wb, org.telegram.ui.Cells.j1, i7, org.telegram.ui.Components.sk0, mm0, og.a, org.telegram.ui.ActionBar.c6, org.telegram.ui.Components.j61, p4.q, p5.a, rh.n3, rh.c1, Continuation, ud.d, m3.e {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ i6(int i10) {
        this.a = i10;
    }

    public static i6 q2(View view) {
        return new i6(view);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean A0(MessageObject messageObject) {
        return true;
    }

    @Override // rh.n3
    public org.telegram.ui.Components.b70 A1(View view) {
        rh.p pVar = (rh.p) this.c;
        org.telegram.ui.Components.b70 b70Var = new org.telegram.ui.Components.b70(pVar, (org.telegram.ui.ActionBar.c6) this.b, view, false, false, true);
        pVar.D = b70Var;
        return b70Var;
    }

    @Override // rh.c1
    public void B(int i10, int i11) {
        ((rh.g0) this.b).y0(i10, i11);
    }

    @Override // rh.n3
    public void C(rh.m3 m3Var, View view) {
        rh.p pVar = (rh.p) this.c;
        org.telegram.ui.Components.b70 b70Var = new org.telegram.ui.Components.b70(pVar, (org.telegram.ui.ActionBar.c6) this.b, view, false, false, true);
        b70Var.Q = true;
        pVar.D = rh.b4.c(b70Var, pVar.b.b0, pVar.getContext(), (org.telegram.ui.ActionBar.c6) this.b, m3Var, true);
    }

    @Override // rh.n3
    public void D0() {
        rh.t3 t3Var = ((rh.p) this.c).s;
        if (t3Var != null) {
            int i10 = t3Var.T;
            if (i10 == 2) {
                i10 = 0;
            }
            t3Var.U = i10;
            t3Var.e(false, false);
            t3Var.f(2, true);
        }
    }

    @Override // ud.d
    public boolean E() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public void E1(org.telegram.ui.Cells.s1 s1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        we.e.s(s1Var.getContext(), str);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public ColorFilter F() {
        switch (this.a) {
            case 11:
                return org.telegram.ui.ActionBar.g6.v3;
            default:
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.c;
                return c6Var == null ? org.telegram.ui.ActionBar.g6.v3 : c6Var.F();
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ CharacterStyle F1(org.telegram.ui.Cells.s1 s1Var) {
        return null;
    }

    @Override // ud.d
    public boolean G(float f10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean H1(org.telegram.ui.Cells.s1 s1Var, MessageObject messageObject) {
        return false;
    }

    @Override // org.telegram.ui.i7
    public void J(s6 s6Var, ih.a aVar, boolean z10) {
        av avVar = (av) this.c;
        zu zuVar = avVar.T;
        if (aVar != null) {
            ((ih.b) this.b).i(aVar);
            avVar.a0.d();
            ih.b bVar = avVar.c0;
            org.telegram.ui.Components.lx0[] lx0VarArr = avVar.X;
            org.telegram.ui.Cells.y1[] y1VarArr = avVar.Y;
            org.telegram.ui.Cells.y1 y1Var = y1VarArr[0];
            if (y1Var != null) {
                org.telegram.ui.Components.lx0 lx0Var = lx0VarArr[0];
                boolean z11 = bVar.m;
                lx0Var.c = z11;
                y1Var.c(z11, true);
            }
            org.telegram.ui.Cells.y1 y1Var2 = y1VarArr[1];
            if (y1Var2 != null) {
                org.telegram.ui.Components.lx0 lx0Var2 = lx0VarArr[1];
                boolean z12 = bVar.n;
                lx0Var2.c = z12;
                y1Var2.c(z12, true);
            }
            org.telegram.ui.Cells.y1 y1Var3 = y1VarArr[2];
            if (y1Var3 != null) {
                org.telegram.ui.Components.lx0 lx0Var3 = lx0VarArr[2];
                boolean z13 = bVar.o;
                lx0Var3.c = z13;
                y1Var3.c(z13, true);
            }
            org.telegram.ui.Cells.y1 y1Var4 = y1VarArr[3];
            if (y1Var4 != null) {
                org.telegram.ui.Components.lx0 lx0Var4 = lx0VarArr[3];
                boolean z14 = bVar.p;
                lx0Var4.c = z14;
                y1Var4.c(z14, true);
            }
            org.telegram.ui.Cells.y1 y1Var5 = y1VarArr[4];
            if (y1Var5 != null) {
                org.telegram.ui.Components.lx0 lx0Var5 = lx0VarArr[4];
                boolean z15 = bVar.q;
                lx0Var5.c = z15;
                y1Var5.c(z15, true);
            }
            avVar.W.a(zuVar.d(), true);
            zuVar.c(true);
        }
    }

    @Override // rh.n3
    public void J1() {
        rh.p pVar = (rh.p) this.c;
        pVar.X();
        pVar.Y();
    }

    @Override // org.telegram.ui.Cells.j1
    public boolean L0(long j10) {
        return ((org.telegram.ui.Components.kz0) this.c).v;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean M1(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public Paint N(String str) {
        switch (this.a) {
            case 11:
                return org.telegram.ui.ActionBar.g6.S0(str);
            default:
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.c;
                return c6Var == null ? org.telegram.ui.ActionBar.g6.S0(str) : c6Var.N(str);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public int N0(int i10) {
        switch (this.a) {
            case 11:
                SparseIntArray sparseIntArray = (SparseIntArray) this.b;
                return sparseIntArray != null ? sparseIntArray.get(i10) : org.telegram.ui.ActionBar.g6.w0(null, i10, false);
            default:
                SparseIntArray sparseIntArray2 = (SparseIntArray) this.b;
                int indexOfKey = sparseIntArray2.indexOfKey(i10);
                if (indexOfKey >= 0) {
                    return sparseIntArray2.valueAt(indexOfKey);
                }
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.c;
                return c6Var == null ? org.telegram.ui.ActionBar.g6.w0(null, i10, false) : c6Var.N0(i10);
        }
    }

    @Override // rh.c1
    public void N1(rh.d1 d1Var, int i10, int i11) {
        org.telegram.ui.Cells.j9 N;
        rh.g0 g0Var = (rh.g0) this.b;
        if (((rh.h0) this.c).d || i10 == i11 || (N = g0Var.N()) == null) {
            return;
        }
        if (N.y() && N.W == g0Var.q0()) {
            return;
        }
        d1Var.post(new org.telegram.ui.Components.gj(this, d1Var, i11, N, g0Var, i10));
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ ou0 O1() {
        return null;
    }

    @Override // m3.e
    public m3.d P1(m3.l lVar, long j10) {
        long position = lVar.getPosition();
        int min = (int) Math.min(20000L, lVar.getLength() - position);
        d5.z zVar = (d5.z) this.c;
        zVar.z(min);
        lVar.b(0, min, zVar.a);
        int i10 = -1;
        long j11 = -9223372036854775807L;
        int i11 = -1;
        while (zVar.a() >= 4) {
            if (p3.a.a(zVar.b, zVar.a) != 442) {
                zVar.D(1);
            } else {
                zVar.D(4);
                long c10 = w3.v.c(zVar);
                if (c10 != -9223372036854775807L) {
                    long b10 = ((d5.f0) this.b).b(c10);
                    if (b10 > j10) {
                        return j11 == -9223372036854775807L ? new m3.d(-1, b10, position) : new m3.d(0, -9223372036854775807L, position + i11);
                    }
                    if (b10 + 100000 > j10) {
                        return new m3.d(0, -9223372036854775807L, position + zVar.b);
                    }
                    j11 = b10;
                    i11 = zVar.b;
                }
                int i12 = zVar.c;
                if (zVar.a() >= 10) {
                    zVar.D(9);
                    int r10 = zVar.r() & 7;
                    if (zVar.a() >= r10) {
                        zVar.D(r10);
                        if (zVar.a() >= 4) {
                            if (p3.a.a(zVar.b, zVar.a) == 443) {
                                zVar.D(4);
                                int w10 = zVar.w();
                                if (zVar.a() < w10) {
                                    zVar.C(i12);
                                } else {
                                    zVar.D(w10);
                                }
                            }
                            while (true) {
                                if (zVar.a() < 4) {
                                    break;
                                }
                                int a2 = p3.a.a(zVar.b, zVar.a);
                                if (a2 == 442 || a2 == 441 || (a2 >>> 8) != 1) {
                                    break;
                                }
                                zVar.D(4);
                                if (zVar.a() < 2) {
                                    zVar.C(i12);
                                    break;
                                }
                                zVar.C(Math.min(zVar.c, zVar.b + zVar.w()));
                            }
                        } else {
                            zVar.C(i12);
                        }
                    } else {
                        zVar.C(i12);
                    }
                } else {
                    zVar.C(i12);
                }
                i10 = zVar.b;
            }
        }
        return j11 != -9223372036854775807L ? new m3.d(-2, j11, position + i10) : m3.d.d;
    }

    @Override // org.telegram.ui.Cells.j1
    public boolean Q1(long j10) {
        return ((org.telegram.ui.Components.kz0) this.c).s;
    }

    @Override // org.telegram.ui.mm0
    public void S(String str, String str2) {
        xm0 xm0Var = ((gm0) this.c).a;
        if ("PHONE_VERIFICATION_NEEDED".equals(str)) {
            xm0Var.O1(true, str2, (zk0) this.b, this, xm0Var.x1);
        } else {
            xm0Var.N1(true, false);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean S0(org.telegram.ui.Cells.s1 s1Var, boolean z10) {
        return false;
    }

    @Override // rh.n3
    public void S1(rh.o3 o3Var, View view) {
        rh.p pVar = (rh.p) this.c;
        org.telegram.ui.Components.b70 b70Var = new org.telegram.ui.Components.b70(pVar, (org.telegram.ui.ActionBar.c6) this.b, view, false, false, true);
        b70Var.Q = true;
        org.telegram.ui.ActionBar.n2 n2Var = pVar.b.b0;
        pVar.getContext();
        pVar.D = rh.b4.b(b70Var, n2Var, o3Var, true);
    }

    @Override // og.a
    public void T0(Canvas canvas, float f10, float f11, float f12, float f13) {
        switch (this.a) {
            case 9:
                canvas.save();
                canvas.clipRect(f10, f11, f12, f13);
                ((PhotoViewer) this.c).T0(canvas, (org.telegram.ui.Components.da) this.b, -14277082, 855638016, false, true, true);
                canvas.drawColor(637534208);
                canvas.restore();
                break;
            default:
                Paint paint = (Paint) this.b;
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.c;
                ag.i2 i2Var = premiumPreviewFragment.i0;
                if (!premiumPreviewFragment.d0) {
                    i2Var.d(0, (-premiumPreviewFragment.Z.getMeasuredWidth()) * 0.1f * premiumPreviewFragment.X, 0, premiumPreviewFragment.Z.getMeasuredWidth(), 0.0f, premiumPreviewFragment.Z.getMeasuredHeight());
                    canvas.drawRect(f10, f11, f12, f13, i2Var.f);
                    break;
                } else {
                    paint.setColor(premiumPreviewFragment.getThemedColor(org.telegram.ui.ActionBar.g6.a7));
                    canvas.drawRect(f10, f11, f12, f13, paint);
                    break;
                }
        }
    }

    @Override // rh.c1
    public /* synthetic */ boolean T1(boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean U(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // p4.q
    public com.google.android.exoplayer2.upstream.s0 U1() {
        return new g5.b(7, ((p4.q) this.b).U1(), (List) this.c);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean V() {
        return false;
    }

    @Override // rh.n3
    public void V0() {
        rh.p pVar = (rh.p) this.c;
        if (pVar.getCurrentItemTop() != pVar.E) {
            pVar.b.X1(pVar, 0);
        }
        pVar.a0();
        rh.p.K(pVar);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean V1(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean W(org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean X() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean Y0(int i10, org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override // lh.wb
    public void Z0(float f10, boolean z10) {
        org.telegram.ui.Components.mb0 mb0Var = (org.telegram.ui.Components.mb0) this.b;
        org.telegram.ui.Components.we0 we0Var = (org.telegram.ui.Components.we0) this.c;
        org.telegram.ui.Components.m61 m61Var = we0Var.d;
        if (m61Var == null) {
            return;
        }
        float max = 2.8f / Math.max(60L, r2);
        long q6 = (long) ((((f10 / (1.0f - max)) * max) + f10) * m61Var.q());
        we0Var.e = q6;
        we0Var.d.M(q6, !z10);
        if (z10) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(mb0Var);
        AndroidUtilities.runOnUIThread(mb0Var, 120L);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // org.telegram.ui.ActionBar.c6
    public boolean a() {
        switch (this.a) {
        }
        return org.telegram.ui.ActionBar.g6.I.q();
    }

    @Override // rh.n3
    public void a0(rh.t5 t5Var, String str) {
        rh.p pVar = (rh.p) this.c;
        if (pVar.v == null) {
            org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.b;
            pVar.v = new m.t3(new di1(8, this, c6Var), c6Var);
        }
        pVar.v.f(t5Var, str);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean a1(MessageObject messageObject) {
        return org.telegram.messenger.rl.a(messageObject);
    }

    @Override // ud.d
    public void b() {
        ((ud.i) this.b).b();
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ int b0() {
        return 0;
    }

    @Override // rh.n3
    public void b1(int i10) {
        rh.p pVar = (rh.p) this.c;
        pVar.b.X1(pVar, i10);
        pVar.a0();
        rh.p.K(pVar);
    }

    @Override // org.telegram.ui.Components.sk0
    public boolean c(float f10, float f11, int i10, View view) {
        gy gyVar = (gy) this.c;
        if (view instanceof org.telegram.ui.Cells.p2) {
            org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) view;
            if (p2Var.j2) {
                gyVar.N4(p2Var.getDialogId(), view);
                return true;
            }
        }
        fw fwVar = gyVar.v0;
        if (fwVar != null && fwVar.getVisibility() == 0 && gyVar.v0.n) {
            return false;
        }
        return gyVar.o4(view, i10, f10, ((fy) this.b).d);
    }

    @Override // rh.n3
    public void c0(int i10) {
        rh.p.O((rh.p) this.c, 74, i10);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public void c1(int i10, int i11) {
        switch (this.a) {
            case 11:
                break;
            default:
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.c;
                if (c6Var != null) {
                    c6Var.c1(i10, i11);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean c2(org.telegram.ui.Cells.s1 s1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public boolean d() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ qg.a d0() {
        return null;
    }

    @Override // org.telegram.ui.i7, org.telegram.ui.Components.f8
    public void dismiss() {
        ((av) this.c).dismiss();
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean e0(org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean f0(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user) {
        return false;
    }

    @Override // rh.c1
    public /* synthetic */ boolean f1(rh.d1 d1Var) {
        return false;
    }

    @Override // m3.e
    public void f2() {
        d5.z zVar = (d5.z) this.c;
        byte[] bArr = d5.g0.f;
        zVar.getClass();
        zVar.A(bArr.length, bArr);
    }

    @Override // rh.c1
    public void g(rh.d1 d1Var) {
        ((rh.g0) this.b).g(d1Var);
    }

    @Override // rh.c1
    public void g1(CharSequence charSequence) {
        ((rh.g0) this.b).S(charSequence);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public Drawable getDrawable(String str) {
        switch (this.a) {
            case 11:
                return null;
            default:
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.c;
                return c6Var == null ? org.telegram.ui.ActionBar.g6.O0(str) : c6Var.getDrawable(str);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ String h(org.telegram.ui.Cells.s1 s1Var) {
        return null;
    }

    @Override // rh.n3
    public void h0() {
        rh.p pVar = (rh.p) this.c;
        rh.p3 p3Var = pVar.r;
        rh.t3 t3Var = pVar.s;
        if (t3Var != null) {
            rh.d3 d3Var = p3Var.j3;
            int i10 = (d3Var != null && d3Var.y() && p3Var.C4()) ? 1 : 0;
            if (t3Var.T == 2) {
                t3Var.U = i10;
            } else {
                t3Var.f(i10, true);
            }
            if (i10 != 0) {
                pVar.W();
            }
        }
        pVar.Z();
    }

    @Override // org.telegram.ui.Components.sk0
    public void i() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((gy) this.c).finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean j0() {
        return false;
    }

    @Override // org.telegram.ui.Components.jt
    public void k1() {
        org.telegram.ui.Cells.d3 d3Var = (org.telegram.ui.Cells.d3) this.c;
        ((org.telegram.ui.Components.lt) this.b).getText();
        d3Var.b();
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean k2(int i10) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0023 A[RETURN] */
    @Override // rh.n3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean l(float f10) {
        boolean z10;
        rh.t3 t3Var = ((rh.p) this.c).s;
        if (t3Var != null) {
            FrameLayout frameLayout = t3Var.D;
            if (frameLayout != null) {
                frameLayout.getLocationOnScreen(new int[2]);
                if (f10 >= r4[1]) {
                    z10 = true;
                    t3Var.e(z10, true);
                    if (!z10) {
                        return true;
                    }
                }
            }
            z10 = false;
            t3Var.e(z10, true);
            if (!z10) {
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ int l0(org.telegram.ui.Cells.s1 s1Var) {
        return 0;
    }

    @Override // ud.d
    public void l1() {
        ((ud.i) this.b).c((ud.j) this.c);
    }

    @Override // rh.n3
    public void l2(rh.a aVar) {
        rh.p pVar = (rh.p) this.c;
        org.telegram.ui.Components.gi giVar = pVar.b;
        org.telegram.ui.ActionBar.n2 n2Var = giVar.b0;
        if (n2Var != null && aVar != null && (aVar.b instanceof TL_iv.pageBlockMap) && AndroidUtilities.isMapsInstalled(n2Var)) {
            org.telegram.ui.Components.gi giVar2 = new org.telegram.ui.Components.gi(pVar.getContext(), giVar.b0, false, false, false, null);
            giVar2.V1 = new za.b(21);
            giVar2.L = true;
            giVar2.t1.setVisibility(8);
            giVar2.p2 = new org.telegram.ui.Components.iq0(pVar, aVar, giVar2, 5);
            giVar2.r1();
            giVar2.show();
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public void m(float f10, float f11, int i10, int i11) {
        switch (this.a) {
            case 11:
                org.telegram.ui.ActionBar.g6.q(f10, f11, i10, i11);
                break;
            default:
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.c;
                if (c6Var != null) {
                    c6Var.m(f10, f11, i10, i11);
                    break;
                } else {
                    org.telegram.ui.ActionBar.g6.q(f10, f11, i10, i11);
                    break;
                }
        }
    }

    @Override // rh.c1
    public boolean n() {
        return ((rh.g0) this.b).w0();
    }

    @Override // rh.n3
    public void n0(rh.d1 d1Var, boolean z10) {
        ((rh.p) this.c).b.t1(d1Var, z10);
    }

    @Override // rh.c1
    public /* synthetic */ boolean o0(rh.d1 d1Var) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public int o1(int i10) {
        switch (this.a) {
            case 11:
                return N0(i10);
            default:
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.c;
                return c6Var == null ? org.telegram.ui.ActionBar.g6.w0(null, i10, false) : c6Var.o1(i10);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ org.telegram.ui.Cells.k9 o2() {
        return null;
    }

    @Override // rh.n3
    public void onContentChanged() {
        rh.p pVar = (rh.p) this.c;
        rh.t3 t3Var = pVar.s;
        if (t3Var != null) {
            t3Var.setSendLoading(pVar.r.m3());
        }
        pVar.V(true);
        pVar.Y();
        rh.d dVar = pVar.L;
        AndroidUtilities.cancelRunOnUIThread(dVar);
        AndroidUtilities.runOnUIThread(dVar, 1000L);
    }

    @Override // org.telegram.ui.Components.j61
    public void onError(org.telegram.ui.Components.m61 m61Var, Exception exc) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
        int i10 = secretMediaViewer.X;
        if (i10 <= 0) {
            FileLog.e(exc);
            return;
        }
        secretMediaViewer.X = i10 - 1;
        AndroidUtilities.runOnUIThread(new m21(4, this, (File) this.b), 100L);
    }

    @Override // org.telegram.ui.Components.j61
    public /* synthetic */ void onRenderedFirstFrame(i3.a aVar) {
    }

    @Override // org.telegram.ui.Components.j61
    public void onStateChanged(boolean z10, int i10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
        o31 o31Var = secretMediaViewer.e1;
        if (secretMediaViewer.y == null || secretMediaViewer.d0 == null) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(o31Var);
        AndroidUtilities.runOnUIThread(o31Var);
        if (i10 == 4 || i10 == 1) {
            try {
                secretMediaViewer.b.getWindow().clearFlags(128);
            } catch (Exception e9) {
                FileLog.e(e9);
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
        if (secretMediaViewer.y.z() && i10 != 4) {
            if (secretMediaViewer.A) {
                return;
            }
            secretMediaViewer.A = true;
        } else if (secretMediaViewer.A) {
            secretMediaViewer.A = false;
            if (i10 == 4) {
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

    @Override // org.telegram.ui.Components.j61
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.j61
    public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
        c5.c cVar = ((SecretMediaViewer) this.c).w;
        if (cVar != null) {
            if (i12 != 90 && i12 != 270) {
                i11 = i10;
                i10 = i11;
            }
            cVar.a(i10 == 0 ? 1.0f : (i11 * f10) / i10, i12);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public boolean p0() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public int q0(int i10) {
        switch (this.a) {
            case 11:
                return N0(i10);
            default:
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.c;
                return c6Var == null ? org.telegram.ui.ActionBar.g6.w0(null, i10, false) : c6Var.q0(i10);
        }
    }

    @Override // rh.n3
    public void q1() {
        rh.t3 t3Var = ((rh.p) this.c).s;
        if (t3Var != null) {
            t3Var.e(false, true);
            int i10 = t3Var.U;
            t3Var.f(i10 != 2 ? i10 : 0, true);
        }
    }

    @Override // og.a
    public /* synthetic */ void r() {
        int i10 = this.a;
    }

    @Override // rh.c1
    public void r1(Editable editable) {
        ((rh.h0) this.c).i();
        ((rh.g0) this.b).I0();
    }

    @Override // org.telegram.ui.Components.sk0
    public void s(float f10) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((gy) this.c).movePreviewFragment(f10);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean s0(org.telegram.ui.Components.t5 t5Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean s1() {
        return false;
    }

    public void t2(String str, PrintWriter printWriter) {
        w1.b bVar = (w1.b) this.c;
        if (bVar.d.c <= 0) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Loaders:");
        String str2 = str + "    ";
        int i10 = 0;
        while (true) {
            a0.l lVar = bVar.d;
            if (i10 >= lVar.c) {
                return;
            }
            w1.a aVar = (w1.a) lVar.b[i10];
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
            i10++;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        u5.a aVar = (u5.a) this.b;
        Bundle bundle = (Bundle) this.c;
        aVar.getClass();
        if (!task.isSuccessful()) {
            return task;
        }
        Bundle bundle2 = (Bundle) task.getResult();
        return (bundle2 == null || !bundle2.containsKey("google.messenger")) ? task : aVar.a(bundle).onSuccessTask(u5.l.a, u5.b.b);
    }

    public String toString() {
        switch (this.a) {
            case 18:
                return "Bounds{lower=" + ((i0.c) this.b) + " upper=" + ((i0.c) this.c) + "}";
            case 28:
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

    @Override // org.telegram.ui.ActionBar.c6
    public boolean u0() {
        switch (this.a) {
            case 11:
                return false;
            default:
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.c;
                return c6Var == null ? org.telegram.ui.ActionBar.g6.a1() : c6Var.u0();
        }
    }

    @Override // og.a
    public lg.d w() {
        switch (this.a) {
            case 9:
                if (Build.VERSION.SDK_INT < 29) {
                    break;
                } else {
                    lg.e eVar = new lg.e(this);
                    ((PhotoViewer) this.c).V.add(eVar);
                    break;
                }
        }
        return new lg.f(this);
    }

    @Override // rh.c1
    public void w1(rh.d1 d1Var) {
        ((rh.g0) this.b).m();
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean x1(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // p4.q
    public com.google.android.exoplayer2.upstream.s0 y0(p4.m mVar, p4.j jVar) {
        return new g5.b(7, ((p4.q) this.b).y0(mVar, jVar), (List) this.c);
    }

    @Override // org.telegram.ui.Cells.j1
    public String z(long j10) {
        String trim = ((EditTextBoldCursor) this.b).getText().toString().trim();
        if (trim.length() > 16) {
            trim = trim.substring(0, 16);
        }
        if (((org.telegram.ui.Components.kz0) this.c).s || !TextUtils.isEmpty(trim)) {
            return trim;
        }
        return null;
    }

    @Override // p5.a
    public void z0(Bitmap bitmap) {
        i6 i6Var = (i6) this.b;
        i6Var.c = bitmap;
        p5.f fVar = (p5.f) this.c;
        fVar.l = i6Var;
        fVar.b();
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean z1() {
        return false;
    }

    public /* synthetic */ i6(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // org.telegram.ui.Components.j61
    public void onRenderedFirstFrame() {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
        if (secretMediaViewer.Y) {
            return;
        }
        secretMediaViewer.Y = true;
        secretMediaViewer.e.invalidate();
    }

    public /* synthetic */ i6(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    public i6(IBinder iBinder) {
        this.a = 22;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (interfaceDescriptor != "android.os.IMessenger" && (interfaceDescriptor == null || !interfaceDescriptor.equals("android.os.IMessenger"))) {
            if (interfaceDescriptor != "com.google.android.gms.iid.IMessengerCompat" && (interfaceDescriptor == null || !interfaceDescriptor.equals("com.google.android.gms.iid.IMessengerCompat"))) {
                Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
                throw new RemoteException();
            }
            this.c = new u5.f(iBinder);
            this.b = null;
            return;
        }
        this.b = new Messenger(iBinder);
        this.c = null;
    }

    public i6(x5.a aVar) {
        this.a = 16;
        this.b = aVar == null ? null : aVar.b;
    }

    public i6(org.telegram.ui.ActionBar.c6 c6Var) {
        this.a = 13;
        this.b = new SparseIntArray();
        this.c = c6Var;
        p2();
    }

    public i6(View view) {
        this.a = 5;
        org.telegram.ui.Components.x51 x51Var = new org.telegram.ui.Components.x51(this, view);
        this.b = x51Var;
        view.addOnLayoutChangeListener(x51Var);
    }

    public i6(androidx.lifecycle.t tVar, androidx.lifecycle.t0 t0Var) {
        this.a = 28;
        this.b = tVar;
        this.c = (w1.b) new a5.n(t0Var, w1.b.f).l(w1.b.class);
    }

    public i6(d5.f0 f0Var) {
        this.a = 29;
        this.b = f0Var;
        this.c = new d5.z();
    }

    private final /* synthetic */ void r2() {
    }

    private final /* synthetic */ void s2() {
    }

    @Override // ud.d
    public void A(boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void B0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void B1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void C0() {
    }

    @Override // lh.wb
    public /* synthetic */ void C1(float f10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void D(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void D1(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.j1
    public void G0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void H(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void H0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // lh.wb
    public /* synthetic */ void I(float f10) {
    }

    @Override // lh.wb
    public /* synthetic */ void I0(boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void I1() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void J0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // ud.d
    public void K() {
    }

    @Override // rh.c1
    public /* synthetic */ void K0() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void M(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void M0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void O(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Q(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void T(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void U0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void W0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // lh.wb
    public /* synthetic */ void X0(float f10) {
    }

    @Override // lh.wb
    public /* synthetic */ void X1(float f10) {
    }

    @Override // lh.wb
    public /* synthetic */ void Y1() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Z(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Z1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.i7
    public void clear() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void d1() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void d2(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // lh.wb
    public /* synthetic */ void e(int i10) {
    }

    @Override // lh.wb
    public /* synthetic */ void e2(float f10) {
    }

    @Override // lh.wb
    public /* synthetic */ void g0() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void h2() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void i0(int i10) {
    }

    @Override // lh.wb
    public /* synthetic */ void i1(long j10) {
    }

    @Override // lh.wb
    public /* synthetic */ void j1(boolean z10) {
    }

    @Override // lh.wb
    public /* synthetic */ void j2(long j10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void k() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void m0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void m2() {
    }

    @Override // org.telegram.ui.Components.j61
    public /* synthetic */ void onSeekFinished(i3.a aVar) {
    }

    @Override // org.telegram.ui.Components.j61
    public /* synthetic */ void onSeekStarted(i3.a aVar) {
    }

    @Override // org.telegram.ui.Components.j61
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void p(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // lh.wb
    public /* synthetic */ void p1(float f10) {
    }

    public void p2() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void r0(String str) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void t(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.i7
    public void t1() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void u1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void v(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // lh.wb
    public /* synthetic */ void w0(float f10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void x(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // lh.wb
    public /* synthetic */ void y(float f10) {
    }

    public i6(org.telegram.ui.Components.we0 we0Var) {
        this.a = 3;
        this.c = we0Var;
        this.b = new org.telegram.ui.Components.mb0(this, 9);
    }

    public i6(String str, String str2) {
        this.a = 26;
        this.b = str;
        this.c = str2;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("userId should not be empty");
        }
    }

    public i6(String str) {
        this.a = 19;
        this.c = null;
        this.b = str;
    }

    public i6(EditText editText) {
        this.a = 17;
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

    private final /* synthetic */ void u2(int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void K1(org.telegram.ui.Cells.s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void L(org.telegram.ui.Cells.s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void O0(int i10, org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // lh.wb
    public /* synthetic */ void P(long j10, boolean z10) {
    }

    @Override // lh.wb
    public /* synthetic */ void P0(float f10, int i10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Q0(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void R(int i10, org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // lh.wb
    public /* synthetic */ void W1(float f10, int i10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void a2(org.telegram.ui.Cells.s1 s1Var, fh.f fVar) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void b2(org.telegram.ui.Cells.s1 s1Var, long j10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void e1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // lh.wb
    public /* synthetic */ void g2(int i10, long j10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void h1(org.telegram.ui.Cells.s1 s1Var, TLRPC.Document document) {
    }

    @Override // lh.wb
    public /* synthetic */ void n1(float f10, int i10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void v1(org.telegram.ui.Cells.s1 s1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void y1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    public i6(PremiumPreviewFragment premiumPreviewFragment) {
        this.a = 10;
        this.c = premiumPreviewFragment;
        this.b = new Paint();
    }

    public i6(y11 y11Var) {
        this.a = 11;
        this.c = y11Var;
    }

    public i6(PhotoViewer photoViewer) {
        this.a = 9;
        this.c = photoViewer;
        this.b = new org.telegram.ui.Components.da(photoViewer.X, photoViewer.a0, 0, false);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void E0(org.telegram.ui.Cells.s1 s1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void F0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void R0(org.telegram.ui.Cells.s1 s1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void k0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void m1(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void n2(org.telegram.ui.Cells.s1 s1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void t0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void L1(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void o(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void v0(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void x0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void R1(org.telegram.ui.Cells.s1 s1Var, int i10, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void i2(org.telegram.ui.Cells.s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void j(org.telegram.ui.Cells.s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Y(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void G1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
