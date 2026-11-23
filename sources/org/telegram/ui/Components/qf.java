package org.telegram.ui.Components;

import android.content.ClipDescription;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class qf implements oe0, s90, wi.l, r0.m, is0, ue.a, jg.y1, q5.b, x2.e1, com.google.android.gms.common.api.internal.q, tg.m1, sg.t0, u4.c, com.google.android.gms.common.api.internal.n, v4.e0, v4.k1 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ qf(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // u4.c
    public void A() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    public void A0() {
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        throw new IOException("data item not completed, stackSize: " + arrayDeque.size() + " scope: " + C0());
    }

    public void B0(long j3) {
        long C0 = C0();
        if (C0 != j3) {
            if (C0 != -1) {
                if (C0 != -2) {
                    return;
                } else {
                    C0 = -2;
                }
            }
            StringBuilder t6 = a8.p0.t(j3, "expected non-string scope or scope ", " but found ");
            t6.append(C0);
            throw new IOException(t6.toString());
        }
    }

    @Override // u4.c
    public void C(int i7, Object obj) {
        String str;
        switch (i7) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i7 == 6 || i7 == 7 || i7 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.b).setResultCode(i7);
    }

    public long C0() {
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    @Override // wi.l
    public View E() {
        return ((iu) this.b).O1;
    }

    @Override // ue.a
    public void E0() {
        ((k51) this.b).h.c(false);
    }

    @Override // v4.e0
    public void F(int i7, int i10) {
        ((v4.i0) this.b).j(i7, i10);
    }

    @Override // wi.l
    public boolean G() {
        return false;
    }

    @Override // org.telegram.ui.Components.is0
    public void I() {
        ((jt0) this.b).J.a(-1);
    }

    @Override // wi.l
    public int J() {
        return ((iu) this.b).P1;
    }

    @Override // org.telegram.ui.Components.is0
    public org.telegram.ui.ActionBar.y0 K(String str) {
        org.telegram.ui.ActionBar.g5 g5Var = ((jt0) this.b).J;
        return g5Var.d(0, 0, null, str, true, true, g5Var.n0);
    }

    @Override // jg.y1
    public /* synthetic */ a0.h K0() {
        return null;
    }

    @Override // ue.a
    public void M(float f10, float f11) {
        Runnable runnable = ((k51) this.b).j;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // v4.e0
    public void M0(int i7, int i10) {
        ((v4.i0) this.b).p(i7, i10);
    }

    @Override // wi.l
    public boolean N() {
        return false;
    }

    @Override // wi.l
    public /* synthetic */ boolean O() {
        return false;
    }

    @Override // org.telegram.ui.Components.s90
    public Paint.FontMetricsInt P() {
        return ((ui) this.b).C2.getEditText().getPaint().getFontMetricsInt();
    }

    @Override // r0.m
    public r0.l1 P0(View view, r0.l1 l1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(l1Var, false);
        yk0 yk0Var = (yk0) this.b;
        yk0Var.w.setPadding(I0.a, I0.b, I0.c, I0.d);
        yk0Var.s.requestLayout();
        return r0.l1.b;
    }

    @Override // wi.l
    public /* synthetic */ e2.c1 Q() {
        return null;
    }

    @Override // ue.a
    public boolean Q0(float f10, float f11) {
        int L = org.telegram.messenger.g0.L(9.0f);
        RectF rectF = ((k51) this.b).g;
        float f12 = -L;
        rectF.inset(f12, f12);
        boolean contains = rectF.contains(f10, f11);
        float f13 = L;
        rectF.inset(f13, f13);
        return contains;
    }

    @Override // v4.k1
    public int R() {
        v4.p0 p0Var = (v4.p0) this.b;
        return p0Var.m - p0Var.E();
    }

    @Override // wi.l
    public /* synthetic */ boolean S() {
        return false;
    }

    @Override // org.telegram.ui.Components.oe0
    public void T(boolean z10) {
        ((ji.r) this.b).setEditPillHidden(z10);
    }

    @Override // wi.l
    public void U() {
        iu iuVar = (iu) this.b;
        iuVar.N1 = null;
        iuVar.L0();
    }

    @Override // wi.l
    public /* synthetic */ boolean V(boolean z10, float f10, fn0 fn0Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.oe0
    public void W(RectF rectF) {
        ((ji.r) this.b).l(rectF);
    }

    @Override // wi.l
    public void Z() {
        ((iu) this.b).M0();
    }

    @Override // ue.a
    public /* synthetic */ boolean Z0(View view, float f10, float f11) {
        return false;
    }

    @Override // v4.k1
    public int a(View view) {
        return v4.p0.x(view) - ((ViewGroup.MarginLayoutParams) ((v4.q0) view.getLayoutParams())).leftMargin;
    }

    @Override // wi.l
    public int a0() {
        return ((iu) this.b).Q1;
    }

    @Override // com.google.android.gms.common.api.internal.q
    public void accept(Object obj, Object obj2) {
        int i7 = this.a;
        Object obj3 = this.b;
        switch (i7) {
            case 17:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                s6.c cVar = (s6.c) ((s6.e) obj).n();
                Parcel j12 = cVar.j1();
                n7.a.b(j12, (q6.p) obj3);
                try {
                    cVar.b.transact(1, j12, null, 1);
                    j12.recycle();
                    taskCompletionSource.setResult(null);
                    return;
                } catch (Throwable th2) {
                    j12.recycle();
                    throw th2;
                }
            default:
                y8.e eVar = (y8.e) obj3;
                h8.b bVar = (h8.b) obj;
                bVar.getClass();
                h8.a aVar = new h8.a(1, (TaskCompletionSource) obj2);
                try {
                    h8.i iVar = (h8.i) bVar.n();
                    Bundle B = bVar.B();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    int i10 = h8.c.a;
                    obtain.writeInt(1);
                    eVar.writeToParcel(obtain, 0);
                    obtain.writeInt(1);
                    B.writeToParcel(obtain, 0);
                    obtain.writeStrongBinder(aVar);
                    try {
                        iVar.a.transact(14, obtain, null, 1);
                        obtain.recycle();
                        return;
                    } catch (Throwable th3) {
                        obtain.recycle();
                        throw th3;
                    }
                } catch (RemoteException e10) {
                    Log.e("WalletClientImpl", "RemoteException during isReadyToPay", e10);
                    Bundle bundle = Bundle.EMPTY;
                    a8.l8.a(Status.h, Boolean.FALSE, aVar.b);
                    return;
                }
        }
    }

    @Override // wi.l
    public void b() {
        z71 z71Var = ((iu) this.b).n1;
        if (z71Var == null || !z71Var.x) {
            return;
        }
        z71Var.a.g0();
        z71Var.n();
        z71Var.g0.d(true, true);
    }

    @Override // wi.l
    public float b0() {
        return 0.0f;
    }

    @Override // x2.e1
    public void c0(x2.f1 f1Var) {
        r2.j jVar = (r2.j) this.b;
        jVar.H.c0(jVar);
    }

    @Override // v4.k1
    public View d0(int i7) {
        return ((v4.p0) this.b).q(i7);
    }

    @Override // jg.y1
    public /* synthetic */ a0.h d1() {
        return null;
    }

    @Override // wi.l
    public /* synthetic */ int e() {
        return 0;
    }

    @Override // sg.t0
    public void e0() {
        tg.p0 p0Var = (tg.p0) this.b;
        p0Var.b.a.u();
        p0Var.x.setViewHidden(false);
        PhotoViewer photoViewer = ((org.telegram.ui.up0) p0Var).L;
        Drawable[] drawableArr = PhotoViewer.Z8;
        photoViewer.V2(true, true);
    }

    @Override // v4.k1
    public int f0(View view) {
        return v4.p0.y(view) + ((ViewGroup.MarginLayoutParams) ((v4.q0) view.getLayoutParams())).rightMargin;
    }

    @Override // v4.e0
    public void g0(int i7, int i10) {
        ((v4.i0) this.b).o(i7, i10);
    }

    @Override // v4.e0
    public void g1(int i7, int i10) {
        ((v4.i0) this.b).n(i7, i10, null);
    }

    @Override // fd.a
    public Object get() {
        switch (this.a) {
            case 9:
                return new org.telegram.ui.md0((Context) ((e.a) this.b).a, new qb.a(28), new pb.b(28), 5);
            default:
                return new v5.i(Integer.valueOf(v5.i.d).intValue(), (Context) ((fd.a) this.b).get(), "com.google.android.datatransport.events");
        }
    }

    @Override // wi.l
    public long getDuration() {
        return 0L;
    }

    @Override // ue.a
    public long getLongPressDuration() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // wi.l
    public boolean h() {
        return false;
    }

    @Override // org.telegram.ui.Components.is0
    public org.telegram.ui.ActionBar.y0 i0(int i7, Runnable runnable, String str, boolean z10, boolean z11) {
        jt0 jt0Var = (jt0) this.b;
        org.telegram.ui.ActionBar.y0 e10 = jt0Var.J.e(0, i7, str);
        if (z10) {
            int i10 = org.telegram.ui.ActionBar.m6.p7;
            e10.d(jt0Var.s0(i10), jt0Var.s0(i10));
        }
        e10.setOnClickListener(new xa0(this, z11, runnable));
        return e10;
    }

    @Override // sg.t0
    public void j() {
        tg.p0 p0Var = (tg.p0) this.b;
        p0Var.e.animate().alpha(1.0f).setDuration(320L).setUpdateListener(new hi.j3(p0Var, 26)).setInterpolator(nr.h);
    }

    @Override // org.telegram.ui.Components.oe0
    public ji.r k0() {
        return (ji.r) this.b;
    }

    @Override // wi.l
    public long l() {
        return 0L;
    }

    @Override // org.telegram.ui.Components.s90
    public void l0(int i7, int i10, CharSequence charSequence, boolean z10) {
        ui uiVar = (ui) this.b;
        if (uiVar.b1() == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(uiVar.b1().getText());
            spannableStringBuilder.replace(i7, i10 + i7, charSequence);
            if (z10) {
                org.telegram.messenger.j6.l(spannableStringBuilder, uiVar.b1().getEditText().getPaint().getFontMetricsInt(), false);
            }
            uiVar.b1().setText(spannableStringBuilder);
            uiVar.b1().setSelection(i7 + charSequence.length());
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // ue.a
    public /* synthetic */ boolean m0() {
        return true;
    }

    @Override // ue.a
    public /* synthetic */ boolean m1() {
        return false;
    }

    @Override // sg.t0
    public void n0() {
        ((tg.p0) this.b).x.setViewHidden(true);
    }

    @Override // wi.l
    public boolean o0() {
        return false;
    }

    @Override // wi.l
    public boolean p() {
        iu iuVar = (iu) this.b;
        return (iuVar.O1 == iuVar.m1 && iuVar.y1 && "inapp".equals(org.telegram.messenger.np.u1(iuVar.a).D3)) ? false : true;
    }

    @Override // com.google.android.gms.common.api.internal.n
    public void q(Object obj) {
        com.google.android.gms.common.api.internal.m mVar;
        androidx.activity.n nVar = ((u7.i) this.b).b;
        synchronized (nVar) {
            nVar.b = false;
            mVar = ((com.google.android.gms.common.api.internal.o) nVar.c).b;
        }
        if (mVar != null) {
            ((u7.c) nVar.d).c(mVar, 2441);
        }
    }

    @Override // jg.y1
    public void r(int i7) {
        org.telegram.ui.Wallet.na naVar = (org.telegram.ui.Wallet.na) this.b;
        if (naVar.r || i7 != naVar.K) {
            return;
        }
        naVar.j0(naVar.O.getText().toString().trim());
    }

    public void r0(int i7, int i10, f3.p pVar) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        long j3;
        int i16;
        int i17;
        int i18;
        int i19;
        x3.f fVar = (x3.f) this.b;
        x3.g gVar = fVar.b;
        SparseArray sparseArray = fVar.c;
        h2.x xVar = fVar.k;
        h2.x xVar2 = fVar.i;
        int i20 = 2;
        int i21 = 0;
        int i22 = 1;
        if (i7 != 161 && i7 != 163) {
            if (i7 == 165) {
                if (fVar.O != 2) {
                    return;
                }
                x3.e eVar = (x3.e) sparseArray.get(fVar.U);
                int i23 = fVar.X;
                h2.x xVar3 = fVar.p;
                if (i23 != 4 || !"V_VP9".equals(eVar.c)) {
                    pVar.r(i10);
                    return;
                } else {
                    xVar3.K(i10);
                    pVar.readFully(xVar3.a, 0, i10);
                    return;
                }
            }
            if (i7 == 16877) {
                fVar.h(i7);
                x3.e eVar2 = fVar.y;
                int i24 = eVar2.h;
                if (i24 != 1685485123 && i24 != 1685480259) {
                    pVar.r(i10);
                    return;
                }
                byte[] bArr = new byte[i10];
                eVar2.P = bArr;
                pVar.readFully(bArr, 0, i10);
                return;
            }
            if (i7 == 16981) {
                fVar.h(i7);
                byte[] bArr2 = new byte[i10];
                fVar.y.j = bArr2;
                pVar.readFully(bArr2, 0, i10);
                return;
            }
            if (i7 == 18402) {
                byte[] bArr3 = new byte[i10];
                pVar.readFully(bArr3, 0, i10);
                fVar.h(i7);
                fVar.y.k = new f3.h0(1, 0, 0, bArr3);
                return;
            }
            if (i7 == 21419) {
                Arrays.fill(xVar.a, (byte) 0);
                pVar.readFully(xVar.a, 4 - i10, i10);
                xVar.N(0);
                fVar.A = (int) xVar.C();
                return;
            }
            if (i7 == 25506) {
                fVar.h(i7);
                byte[] bArr4 = new byte[i10];
                fVar.y.l = bArr4;
                pVar.readFully(bArr4, 0, i10);
                return;
            }
            if (i7 != 30322) {
                throw e2.t0.a(null, "Unexpected id: " + i7);
            }
            fVar.h(i7);
            byte[] bArr5 = new byte[i10];
            fVar.y.x = bArr5;
            pVar.readFully(bArr5, 0, i10);
            return;
        }
        if (fVar.O == 0) {
            fVar.U = (int) gVar.b(pVar, false, true, 8);
            fVar.V = gVar.c;
            fVar.Q = -9223372036854775807L;
            fVar.O = 1;
            xVar2.K(0);
        }
        x3.e eVar3 = (x3.e) sparseArray.get(fVar.U);
        if (eVar3 == null) {
            pVar.r(i10 - fVar.V);
            fVar.O = 0;
            return;
        }
        eVar3.a0.getClass();
        if (fVar.O == 1) {
            fVar.l(pVar, 3);
            int i25 = (xVar2.a[2] & 6) >> 1;
            byte b10 = 255;
            if (i25 == 0) {
                fVar.S = 1;
                int[] iArr = fVar.T;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                fVar.T = iArr;
                iArr[0] = (i10 - fVar.V) - 3;
            } else {
                fVar.l(pVar, 4);
                int i26 = (xVar2.a[3] & org.telegram.messenger.ls.e4) + 1;
                fVar.S = i26;
                int[] iArr2 = fVar.T;
                if (iArr2 == null) {
                    iArr2 = new int[i26];
                } else if (iArr2.length < i26) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i26)];
                }
                fVar.T = iArr2;
                if (i25 == 2) {
                    int i27 = (i10 - fVar.V) - 4;
                    int i28 = fVar.S;
                    Arrays.fill(iArr2, 0, i28, i27 / i28);
                } else {
                    if (i25 != 1) {
                        if (i25 != 3) {
                            throw e2.t0.a(null, "Unexpected lacing value: " + i25);
                        }
                        int i29 = 0;
                        int i30 = 0;
                        int i31 = 4;
                        while (true) {
                            int i32 = fVar.S - i22;
                            if (i29 >= i32) {
                                i11 = i20;
                                i12 = i21;
                                i13 = i22;
                                fVar.T[i32] = ((i10 - fVar.V) - i31) - i30;
                                break;
                            }
                            fVar.T[i29] = i21;
                            int i33 = i31 + 1;
                            fVar.l(pVar, i33);
                            if (xVar2.a[i31] == 0) {
                                throw e2.t0.a(null, "No valid varint length mask found");
                            }
                            int i34 = i21;
                            while (true) {
                                if (i34 >= 8) {
                                    i14 = i20;
                                    i15 = i22;
                                    j3 = 0;
                                    i16 = i33;
                                    break;
                                }
                                int i35 = i22 << (7 - i34);
                                i14 = i20;
                                if ((xVar2.a[i31] & i35) != 0) {
                                    int i36 = i33 + i34;
                                    fVar.l(pVar, i36);
                                    i15 = i22;
                                    j3 = xVar2.a[i31] & b10 & (~i35);
                                    while (i33 < i36) {
                                        j3 = (j3 << 8) | (xVar2.a[i33] & b10);
                                        i33++;
                                        i36 = i36;
                                        b10 = 255;
                                    }
                                    i16 = i36;
                                    if (i29 > 0) {
                                        j3 -= (1 << ((i34 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i34++;
                                    i20 = i14;
                                    b10 = 255;
                                }
                            }
                            if (j3 < -2147483648L || j3 > 2147483647L) {
                                break;
                            }
                            int i37 = (int) j3;
                            int[] iArr3 = fVar.T;
                            if (i29 != 0) {
                                i37 += iArr3[i29 - 1];
                            }
                            iArr3[i29] = i37;
                            i30 += i37;
                            i29++;
                            i21 = i34;
                            i20 = i14;
                            i22 = i15;
                            i31 = i16;
                            b10 = 255;
                        }
                        throw e2.t0.a(null, "EBML lacing sample size out of range.");
                    }
                    int i38 = 0;
                    int i39 = 0;
                    int i40 = 4;
                    while (true) {
                        i17 = fVar.S - 1;
                        if (i38 >= i17) {
                            break;
                        }
                        fVar.T[i38] = 0;
                        while (true) {
                            i18 = i40 + 1;
                            fVar.l(pVar, i18);
                            int i41 = xVar2.a[i40] & 255;
                            int[] iArr4 = fVar.T;
                            i19 = iArr4[i38] + i41;
                            iArr4[i38] = i19;
                            if (i41 != 255) {
                                break;
                            } else {
                                i40 = i18;
                            }
                        }
                        i39 += i19;
                        i38++;
                        i40 = i18;
                    }
                    fVar.T[i17] = ((i10 - fVar.V) - i40) - i39;
                }
            }
            i11 = 2;
            i12 = 0;
            i13 = 1;
            byte[] bArr6 = xVar2.a;
            fVar.P = fVar.n((bArr6[i13] & 255) | (bArr6[i12] << 8)) + fVar.M;
            fVar.W = (eVar3.e == i13 || (i7 == 163 && (xVar2.a[i11] & 128) == 128)) ? 1 : i12;
            fVar.O = i11;
            fVar.R = i12;
        }
        if (i7 == 163) {
            while (true) {
                int i42 = fVar.R;
                if (i42 >= fVar.S) {
                    fVar.O = 0;
                    return;
                } else {
                    fVar.i(eVar3, ((fVar.R * eVar3.f) / 1000) + fVar.P, fVar.W, fVar.o(pVar, eVar3, fVar.T[i42], false), 0);
                    fVar.R++;
                }
            }
        } else {
            while (true) {
                int i43 = fVar.R;
                if (i43 >= fVar.S) {
                    return;
                }
                int[] iArr5 = fVar.T;
                iArr5[i43] = fVar.o(pVar, eVar3, iArr5[i43], true);
                fVar.R++;
            }
        }
    }

    @Override // wi.l
    public /* synthetic */ boolean s() {
        return false;
    }

    public ClipDescription s0() {
        return ((t0.h) this.b).getDescription();
    }

    @Override // ue.a
    public void t0() {
        ((k51) this.b).h.c(true);
    }

    @Override // wi.l
    public void u(Rect rect) {
        rect.setEmpty();
    }

    public void u0(int i7, long j3) {
        x3.f fVar = (x3.f) this.b;
        if (i7 == 240) {
            if (fVar.z) {
                return;
            }
            fVar.g(i7);
            if (fVar.H == -1) {
                fVar.H = j3;
                return;
            }
            return;
        }
        if (i7 == 241) {
            if (fVar.z) {
                return;
            }
            fVar.g(i7);
            if (fVar.G == -1) {
                fVar.G = j3;
                return;
            }
            return;
        }
        if (i7 == 20529) {
            if (j3 == 0) {
                return;
            }
            throw e2.t0.a(null, "ContentEncodingOrder " + j3 + " not supported");
        }
        if (i7 == 20530) {
            if (j3 == 1) {
                return;
            }
            throw e2.t0.a(null, "ContentEncodingScope " + j3 + " not supported");
        }
        switch (i7) {
            case org.telegram.messenger.ls.P1 /* 131 */:
                int i10 = (int) j3;
                if (i10 == 1) {
                    fVar.h(i7);
                    fVar.y.e = 2;
                    return;
                }
                if (i10 == 2) {
                    fVar.h(i7);
                    fVar.y.e = 1;
                    return;
                } else if (i10 == 17) {
                    fVar.h(i7);
                    fVar.y.e = 3;
                    return;
                } else if (i10 != 33) {
                    fVar.h(i7);
                    fVar.y.e = -1;
                    return;
                } else {
                    fVar.h(i7);
                    fVar.y.e = 5;
                    return;
                }
            case org.telegram.messenger.ls.S1 /* 136 */:
                fVar.h(i7);
                fVar.y.Y = j3 == 1;
                return;
            case org.telegram.messenger.ls.l2 /* 155 */:
                fVar.Q = fVar.n(j3);
                return;
            case org.telegram.messenger.ls.p2 /* 159 */:
                fVar.h(i7);
                fVar.y.Q = (int) j3;
                return;
            case org.telegram.messenger.ls.G2 /* 176 */:
                fVar.h(i7);
                fVar.y.n = (int) j3;
                return;
            case org.telegram.messenger.ls.J2 /* 179 */:
                if (fVar.z) {
                    return;
                }
                fVar.g(i7);
                fVar.E = fVar.n(j3);
                return;
            case org.telegram.messenger.ls.Q2 /* 186 */:
                fVar.h(i7);
                fVar.y.o = (int) j3;
                return;
            case org.telegram.messenger.ls.s3 /* 215 */:
                fVar.h(i7);
                fVar.y.d = (int) j3;
                return;
            case org.telegram.messenger.ls.H3 /* 231 */:
                fVar.M = fVar.n(j3);
                return;
            case org.telegram.messenger.ls.N3 /* 238 */:
                fVar.X = (int) j3;
                return;
            case org.telegram.messenger.ls.W3 /* 247 */:
                if (fVar.z) {
                    return;
                }
                fVar.g(i7);
                fVar.F = (int) j3;
                return;
            case org.telegram.messenger.ls.a4 /* 251 */:
                fVar.Y = true;
                return;
            case 16871:
                fVar.h(i7);
                fVar.y.h = (int) j3;
                return;
            case 16980:
                if (j3 == 3) {
                    return;
                }
                throw e2.t0.a(null, "ContentCompAlgo " + j3 + " not supported");
            case 17029:
                if (j3 < 1 || j3 > 2) {
                    throw e2.t0.a(null, "DocTypeReadVersion " + j3 + " not supported");
                }
                return;
            case 17143:
                if (j3 == 1) {
                    return;
                }
                throw e2.t0.a(null, "EBMLReadVersion " + j3 + " not supported");
            case 18401:
                if (j3 == 5) {
                    return;
                }
                throw e2.t0.a(null, "ContentEncAlgo " + j3 + " not supported");
            case 18408:
                if (j3 == 1) {
                    return;
                }
                throw e2.t0.a(null, "AESSettingsCipherMode " + j3 + " not supported");
            case 21420:
                fVar.B = j3 + fVar.s;
                return;
            case 21432:
                int i11 = (int) j3;
                fVar.h(i7);
                if (i11 == 0) {
                    fVar.y.y = 0;
                    return;
                }
                if (i11 == 1) {
                    fVar.y.y = 2;
                    return;
                } else if (i11 == 3) {
                    fVar.y.y = 1;
                    return;
                } else {
                    if (i11 != 15) {
                        return;
                    }
                    fVar.y.y = 3;
                    return;
                }
            case 21680:
                fVar.h(i7);
                fVar.y.q = (int) j3;
                return;
            case 21682:
                fVar.h(i7);
                fVar.y.s = (int) j3;
                return;
            case 21690:
                fVar.h(i7);
                fVar.y.r = (int) j3;
                return;
            case 21930:
                fVar.h(i7);
                fVar.y.X = j3 == 1;
                return;
            case 21938:
                fVar.h(i7);
                x3.e eVar = fVar.y;
                eVar.z = true;
                eVar.p = (int) j3;
                return;
            case 21998:
                fVar.h(i7);
                fVar.y.g = (int) j3;
                return;
            case 22186:
                fVar.h(i7);
                fVar.y.T = j3;
                return;
            case 22203:
                fVar.h(i7);
                fVar.y.U = j3;
                return;
            case 25188:
                fVar.h(i7);
                fVar.y.R = (int) j3;
                return;
            case 30114:
                fVar.Z = j3;
                return;
            case 30321:
                fVar.h(i7);
                int i12 = (int) j3;
                if (i12 == 0) {
                    fVar.y.t = 0;
                    return;
                }
                if (i12 == 1) {
                    fVar.y.t = 1;
                    return;
                } else if (i12 == 2) {
                    fVar.y.t = 2;
                    return;
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    fVar.y.t = 3;
                    return;
                }
            case 2352003:
                fVar.h(i7);
                fVar.y.f = (int) j3;
                return;
            case 2807729:
                fVar.t = j3;
                return;
            default:
                switch (i7) {
                    case 21945:
                        fVar.h(i7);
                        int i13 = (int) j3;
                        if (i13 == 1) {
                            fVar.y.C = 2;
                            return;
                        } else {
                            if (i13 != 2) {
                                return;
                            }
                            fVar.y.C = 1;
                            return;
                        }
                    case 21946:
                        fVar.h(i7);
                        int g10 = e2.m.g((int) j3);
                        if (g10 != -1) {
                            fVar.y.B = g10;
                            return;
                        }
                        return;
                    case 21947:
                        fVar.h(i7);
                        fVar.y.z = true;
                        int f10 = e2.m.f((int) j3);
                        if (f10 != -1) {
                            fVar.y.A = f10;
                            return;
                        }
                        return;
                    case 21948:
                        fVar.h(i7);
                        fVar.y.D = (int) j3;
                        return;
                    case 21949:
                        fVar.h(i7);
                        fVar.y.E = (int) j3;
                        return;
                    default:
                        return;
                }
        }
    }

    @Override // wi.l
    public /* synthetic */ View v(LaunchActivity launchActivity) {
        return null;
    }

    public void v0() {
        r2.j jVar = (r2.j) this.b;
        int i7 = jVar.I - 1;
        jVar.I = i7;
        if (i7 > 0) {
            return;
        }
        int i10 = 0;
        for (r2.p pVar : jVar.K) {
            pVar.h();
            i10 += pVar.Z.a;
        }
        e2.m1[] m1VarArr = new e2.m1[i10];
        int i11 = 0;
        for (r2.p pVar2 : jVar.K) {
            pVar2.h();
            int i12 = pVar2.Z.a;
            int i13 = 0;
            while (i13 < i12) {
                pVar2.h();
                m1VarArr[i11] = pVar2.Z.a(i13);
                i13++;
                i11++;
            }
        }
        jVar.J = new x2.r1(m1VarArr);
        jVar.H.m(jVar);
    }

    @Override // jg.y1
    public /* synthetic */ boolean v1(int i7) {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x026b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean w0(MotionEvent motionEvent) {
        boolean z10;
        MotionEvent motionEvent2;
        MotionEvent motionEvent3;
        boolean onFling;
        p10 p10Var;
        boolean z11;
        o10 o10Var = (o10) this.b;
        int i7 = o10.w;
        p10 p10Var2 = o10Var.f;
        android.support.v4.media.session.q qVar = o10Var.e;
        int action = motionEvent.getAction();
        if (o10Var.v == null) {
            o10Var.v = VelocityTracker.obtain();
        }
        o10Var.v.addMovement(motionEvent);
        int i10 = action & org.telegram.messenger.ls.e4;
        boolean z12 = i10 == 6;
        int actionIndex = z12 ? motionEvent.getActionIndex() : -1;
        int pointerCount = motionEvent.getPointerCount();
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (int i11 = 0; i11 < pointerCount; i11++) {
            if (actionIndex != i11) {
                f10 = motionEvent.getX(i11) + f10;
                f11 = motionEvent.getY(i11) + f11;
            }
        }
        float f12 = z12 ? pointerCount - 1 : pointerCount;
        float f13 = f10 / f12;
        float f14 = f11 / f12;
        if (i10 == 0) {
            if (o10Var.g != null && p10Var2.a()) {
                boolean hasMessages = qVar.hasMessages(3);
                if (hasMessages) {
                    qVar.removeMessages(3);
                }
                MotionEvent motionEvent4 = o10Var.m;
                if (motionEvent4 != null && (motionEvent3 = o10Var.n) != null && hasMessages && o10Var.l && motionEvent.getEventTime() - motionEvent3.getEventTime() <= 220) {
                    int x10 = ((int) motionEvent4.getX()) - ((int) motionEvent.getX());
                    int y10 = ((int) motionEvent4.getY()) - ((int) motionEvent.getY());
                    if ((y10 * y10) + (x10 * x10) < o10Var.b) {
                        o10Var.o = true;
                        z10 = o10Var.g.onDoubleTap(o10Var.m) | o10Var.g.onDoubleTapEvent(motionEvent);
                        o10Var.p = f13;
                        o10Var.r = f13;
                        o10Var.q = f14;
                        o10Var.s = f14;
                        motionEvent2 = o10Var.m;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        o10Var.m = MotionEvent.obtain(motionEvent);
                        o10Var.k = true;
                        o10Var.l = true;
                        o10Var.h = true;
                        o10Var.j = false;
                        o10Var.i = false;
                        if (o10Var.t) {
                            qVar.removeMessages(2);
                            qVar.sendEmptyMessageAtTime(2, o10Var.m.getDownTime() + i7 + o10Var.u);
                        }
                        qVar.sendEmptyMessageAtTime(1, o10Var.m.getDownTime() + i7);
                        return p10Var2.onDown(motionEvent) | z10;
                    }
                }
                qVar.sendEmptyMessageDelayed(3, 220L);
            }
            z10 = false;
            o10Var.p = f13;
            o10Var.r = f13;
            o10Var.q = f14;
            o10Var.s = f14;
            motionEvent2 = o10Var.m;
            if (motionEvent2 != null) {
            }
            o10Var.m = MotionEvent.obtain(motionEvent);
            o10Var.k = true;
            o10Var.l = true;
            o10Var.h = true;
            o10Var.j = false;
            o10Var.i = false;
            if (o10Var.t) {
            }
            qVar.sendEmptyMessageAtTime(1, o10Var.m.getDownTime() + i7);
            return p10Var2.onDown(motionEvent) | z10;
        }
        if (i10 == 1) {
            o10Var.h = false;
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            if (o10Var.o) {
                onFling = o10Var.g.onDoubleTapEvent(motionEvent);
            } else {
                if (o10Var.j) {
                    qVar.removeMessages(3);
                    o10Var.j = false;
                } else if (o10Var.k) {
                    boolean onSingleTapUp = p10Var2.onSingleTapUp(motionEvent);
                    if (o10Var.i && (p10Var = o10Var.g) != null) {
                        p10Var.onSingleTapConfirmed(motionEvent);
                    }
                    onFling = onSingleTapUp;
                } else {
                    VelocityTracker velocityTracker = o10Var.v;
                    int pointerId = motionEvent.getPointerId(0);
                    velocityTracker.computeCurrentVelocity(1000, o10Var.d);
                    float yVelocity = velocityTracker.getYVelocity(pointerId);
                    float xVelocity = velocityTracker.getXVelocity(pointerId);
                    if (Math.abs(yVelocity) > o10Var.c || Math.abs(xVelocity) > o10Var.c) {
                        onFling = p10Var2.onFling(o10Var.m, motionEvent, xVelocity, yVelocity);
                    }
                }
                onFling = false;
            }
            MotionEvent motionEvent5 = o10Var.n;
            if (motionEvent5 != null) {
                motionEvent5.recycle();
            }
            o10Var.n = obtain;
            VelocityTracker velocityTracker2 = o10Var.v;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                o10Var.v = null;
            }
            o10Var.o = false;
            o10Var.i = false;
            qVar.removeMessages(1);
            qVar.removeMessages(2);
            return onFling;
        }
        if (i10 != 2) {
            if (i10 == 3) {
                qVar.removeMessages(1);
                qVar.removeMessages(2);
                qVar.removeMessages(3);
                o10Var.v.recycle();
                o10Var.v = null;
                o10Var.o = false;
                o10Var.h = false;
                o10Var.k = false;
                o10Var.l = false;
                o10Var.i = false;
                if (o10Var.j) {
                    o10Var.j = false;
                    return false;
                }
            } else if (i10 == 5) {
                o10Var.p = f13;
                o10Var.r = f13;
                o10Var.q = f14;
                o10Var.s = f14;
                qVar.removeMessages(1);
                qVar.removeMessages(2);
                qVar.removeMessages(3);
                o10Var.o = false;
                o10Var.k = false;
                o10Var.l = false;
                o10Var.i = false;
                if (o10Var.j) {
                    o10Var.j = false;
                    return false;
                }
            } else if (i10 == 6) {
                o10Var.p = f13;
                o10Var.r = f13;
                o10Var.q = f14;
                o10Var.s = f14;
                o10Var.v.computeCurrentVelocity(1000, o10Var.d);
                int actionIndex2 = motionEvent.getActionIndex();
                int pointerId2 = motionEvent.getPointerId(actionIndex2);
                float xVelocity2 = o10Var.v.getXVelocity(pointerId2);
                float yVelocity2 = o10Var.v.getYVelocity(pointerId2);
                for (int i12 = 0; i12 < pointerCount; i12++) {
                    if (i12 != actionIndex2) {
                        int pointerId3 = motionEvent.getPointerId(i12);
                        if ((o10Var.v.getYVelocity(pointerId3) * yVelocity2) + (o10Var.v.getXVelocity(pointerId3) * xVelocity2) < 0.0f) {
                            o10Var.v.clear();
                            return false;
                        }
                    }
                }
            }
        } else if (!o10Var.j) {
            float f15 = o10Var.p - f13;
            float f16 = o10Var.q - f14;
            if (o10Var.o) {
                return o10Var.g.onDoubleTapEvent(motionEvent);
            }
            if (o10Var.k) {
                int i13 = (int) (f13 - o10Var.r);
                int i14 = (int) (f14 - o10Var.s);
                int i15 = (i14 * i14) + (i13 * i13);
                if (i15 > o10Var.a) {
                    z11 = p10Var2.onScroll(o10Var.m, motionEvent, f15, f16);
                    o10Var.p = f13;
                    o10Var.q = f14;
                    o10Var.k = false;
                    qVar.removeMessages(3);
                    qVar.removeMessages(1);
                    qVar.removeMessages(2);
                } else {
                    z11 = false;
                }
                if (i15 > o10Var.a) {
                    o10Var.l = false;
                }
                return z11;
            }
            if (Math.abs(f15) >= 1.0f || Math.abs(f16) >= 1.0f) {
                boolean onScroll = p10Var2.onScroll(o10Var.m, motionEvent, f15, f16);
                o10Var.p = f13;
                o10Var.q = f14;
                return onScroll;
            }
        }
        return false;
    }

    public void x0(int i7) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        View childAt = recyclerView.getChildAt(i7);
        if (childAt != null) {
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i7);
    }

    @Override // sg.t0
    public boolean y() {
        return true;
    }

    public void y0(long j3, int i7, long j10) {
        x3.f fVar = (x3.f) this.b;
        fVar.j0.getClass();
        if (i7 == 160) {
            fVar.Y = false;
            fVar.Z = 0L;
            return;
        }
        if (i7 == 174) {
            x3.e eVar = new x3.e();
            eVar.n = -1;
            eVar.o = -1;
            eVar.p = -1;
            eVar.q = -1;
            eVar.r = -1;
            eVar.s = 0;
            eVar.t = -1;
            eVar.u = 0.0f;
            eVar.v = 0.0f;
            eVar.w = 0.0f;
            eVar.x = null;
            eVar.y = -1;
            eVar.z = false;
            eVar.A = -1;
            eVar.B = -1;
            eVar.C = -1;
            eVar.D = 1000;
            eVar.E = org.telegram.messenger.ls.e3;
            eVar.F = -1.0f;
            eVar.G = -1.0f;
            eVar.H = -1.0f;
            eVar.I = -1.0f;
            eVar.J = -1.0f;
            eVar.K = -1.0f;
            eVar.L = -1.0f;
            eVar.M = -1.0f;
            eVar.N = -1.0f;
            eVar.O = -1.0f;
            eVar.Q = 1;
            eVar.R = -1;
            eVar.S = 8000;
            eVar.T = 0L;
            eVar.U = 0L;
            eVar.W = false;
            eVar.Y = true;
            eVar.Z = "eng";
            fVar.y = eVar;
            eVar.a = fVar.w;
            return;
        }
        if (i7 == 183) {
            if (fVar.z) {
                return;
            }
            fVar.g(i7);
            fVar.F = -1;
            fVar.G = -1L;
            fVar.H = -1L;
            return;
        }
        if (i7 == 187) {
            if (fVar.z) {
                return;
            }
            fVar.g(i7);
            fVar.E = -9223372036854775807L;
            return;
        }
        if (i7 == 19899) {
            fVar.A = -1;
            fVar.B = -1L;
            return;
        }
        if (i7 == 20533) {
            fVar.h(i7);
            fVar.y.i = true;
            return;
        }
        if (i7 == 21968) {
            fVar.h(i7);
            fVar.y.z = true;
            return;
        }
        if (i7 == 408125543) {
            long j11 = fVar.s;
            if (j11 != -1 && j11 != j3) {
                throw e2.t0.a(null, "Multiple Segment elements not supported");
            }
            fVar.s = j3;
            fVar.r = j10;
            return;
        }
        if (i7 == 475249515) {
            if (fVar.z) {
                return;
            }
            fVar.D = true;
        } else if (i7 == 524531317 && !fVar.z) {
            if (fVar.d && fVar.K != -1) {
                fVar.J = true;
            } else {
                fVar.j0.j(new f3.t(fVar.v));
                fVar.z = true;
            }
        }
    }

    @Override // tg.m1
    public void y1(float f10) {
        org.telegram.ui.vp0 vp0Var = (org.telegram.ui.vp0) this.b;
        sg.k0.e(vp0Var.z1).k(String.valueOf(sg.h.a.indexOf(vp0Var.G0.getCurrentBrush())), f10);
        sg.h1 h1Var = vp0Var.u1;
        h1Var.c = f10;
        vp0Var.s0(h1Var, null);
    }

    @Override // v4.k1
    public int z() {
        return ((v4.p0) this.b).D();
    }

    public void z0(int i7, String str) {
        x3.f fVar = (x3.f) this.b;
        if (i7 == 134) {
            fVar.h(i7);
            fVar.y.c = str;
            return;
        }
        if (i7 == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                fVar.w = str.equals("webm");
                return;
            }
            throw e2.t0.a(null, "DocType " + str + " not supported");
        }
        if (i7 == 21358) {
            fVar.h(i7);
            fVar.y.b = str;
        } else {
            if (i7 != 2274716) {
                return;
            }
            fVar.h(i7);
            fVar.y.Z = str;
        }
    }

    public qf(boolean z10) {
        this.a = 10;
        this.b = new AtomicBoolean(z10);
    }

    public qf(int i7) {
        this.a = i7;
        switch (i7) {
            case 12:
                this.b = new ArrayDeque(16);
                break;
            default:
                this.b = h9.i0.p();
                break;
        }
    }

    public qf(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.a = 18;
        if (Build.VERSION.SDK_INT >= 25) {
            this.b = new t0.g(uri, clipDescription, uri2);
        } else {
            this.b = new org.telegram.ui.md0(uri, clipDescription, uri2, 16);
        }
    }

    public qf(Context context, p10 p10Var) {
        this.a = 3;
        this.b = new o10(context, p10Var);
    }

    @Override // tg.m1
    public float get() {
        org.telegram.ui.vp0 vp0Var = (org.telegram.ui.vp0) this.b;
        int i7 = vp0Var.z1;
        sg.h currentBrush = vp0Var.G0.getCurrentBrush();
        if (currentBrush == null) {
            return sg.k0.e(i7).i;
        }
        return sg.k0.e(i7).f(String.valueOf(sg.h.a.indexOf(currentBrush)), currentBrush.d());
    }

    @Override // wi.l
    public /* synthetic */ void B(View view) {
    }

    @Override // wi.l
    public void D(SurfaceTexture surfaceTexture) {
    }

    @Override // wi.l
    public /* synthetic */ void L(float f10) {
    }

    @Override // jg.y1
    public /* synthetic */ void P1(ArrayList arrayList) {
    }

    @Override // wi.l
    public /* synthetic */ void X(View view) {
    }

    @Override // wi.l
    public void c(long j3) {
    }

    @Override // wi.l
    public /* synthetic */ void d(View view) {
    }

    @Override // wi.l
    public void i(wi.o oVar) {
    }

    @Override // wi.l
    public /* synthetic */ void p0(int i7) {
    }

    @Override // org.telegram.ui.Components.s90
    public /* synthetic */ void q0(String str) {
    }

    @Override // wi.l
    public /* synthetic */ void w(View view) {
    }

    @Override // wi.l
    public /* synthetic */ void H() {
    }

    @Override // wi.l
    public void f() {
    }

    @Override // sg.t0
    public /* synthetic */ void k() {
    }

    @Override // sg.t0
    public void n() {
    }

    @Override // wi.l
    public /* synthetic */ void h0(int i7, ArrayList arrayList) {
    }

    @Override // ue.a
    public /* synthetic */ void t(float f10, float f11) {
    }

    @Override // org.telegram.ui.Components.s90
    public /* synthetic */ void Y(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    @Override // ue.a
    public /* synthetic */ void e1(View view, float f10, float f11) {
    }

    @Override // org.telegram.ui.Components.s90
    public /* synthetic */ void g(TLRPC.BotInlineResult botInlineResult, boolean z10, int i7) {
    }

    @Override // wi.l
    public /* synthetic */ void j0(Canvas canvas, int i7, int i10) {
    }

    @Override // ue.a
    public /* synthetic */ void o(View view, float f10, float f11) {
    }

    @Override // ue.a
    public /* synthetic */ void x(View view, float f10, float f11) {
    }
}
