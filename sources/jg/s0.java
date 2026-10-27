package jg;

import a8.ic;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.recyclerview.widget.RecyclerView;
import bi.u7;
import fi.ua;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import li.d6;
import li.h5;
import li.j3;
import li.j4;
import li.o3;
import li.p3;
import li.s3;
import li.t3;
import li.u3;
import li.u4;
import li.v3;
import m.r3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.dh0;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.eb0;
import org.telegram.ui.Components.h60;
import org.telegram.ui.Components.in0;
import org.telegram.ui.Components.j81;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.p60;
import org.telegram.ui.Components.q81;
import org.telegram.ui.Components.t81;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.w60;
import org.telegram.ui.Components.zu0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class s0 implements ig.z1, y2.m, li.i0, t3, l.i, l2.h, k1.f, o5.b, oe.d, j81, e5, eb0, q81, r0.n, zu0, r4.c {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ s0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public static s0 e0(float f7, int i10) {
        Point point = AndroidUtilities.displaySize;
        int i11 = (int) (point.x * f7);
        int i12 = (int) (point.y * f7);
        if (i11 == i12) {
            return new s0(i11, i12, new int[0]);
        }
        if (i10 == 3) {
            return new s0(i11, i12, new int[]{i12, i11});
        }
        return (i10 == 1) == (i11 < i12) ? new s0(i11, i12, new int[0]) : new s0(i12, i11, new int[0]);
    }

    @Override // li.t3
    public void B(s3 s3Var, View view) {
        li.b2 b2Var = (li.b2) this.b;
        l80 H = l80.H(b2Var, view);
        H.Q = true;
        b2Var.x0 = j4.c(H, b2Var, b2Var.getParentActivity(), b2Var.getResourceProvider(), s3Var, false);
    }

    @Override // li.i0
    public s9 C() {
        switch (this.a) {
            case 5:
                p3 p3Var = ((li.y) this.b).O;
                if (p3Var != null) {
                    return p3Var.a.getTextSelectionHelper();
                }
                return null;
            default:
                o3 o3Var = ((u4) this.b).N;
                if (o3Var != null) {
                    return o3Var.a.getTextSelectionHelper();
                }
                return null;
        }
    }

    @Override // org.telegram.ui.Components.eb0
    public Paint.FontMetricsInt D() {
        return ((ti) this.b).H0.getEditText().getPaint().getFontMetricsInt();
    }

    @Override // oe.d
    public void E(int i10, float f7, float f10, oe.e eVar) {
        ((oe.j) this.b).h(f7);
    }

    @Override // l.i
    public boolean F(l.k kVar, MenuItem menuItem) {
        m.k kVar2 = ((ActionMenuView) this.b).P;
        if (kVar2 == null) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((h5) kVar2).a).W.c).iterator();
        while (it.hasNext()) {
            if (((androidx.fragment.app.a0) it.next()).a.p()) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.e5
    public void G(int i10, int i11, boolean z10) {
        ((ChatActivityEnterView) this.b).Q0(i10, z10, 0, true, 0L);
    }

    @Override // li.t3
    public void H() {
        li.b2 b2Var = (li.b2) this.b;
        li.b2.a0(b2Var, false, true);
        int i10 = b2Var.I0;
        b2Var.y0(i10 != 2 ? i10 : 0, true);
    }

    @Override // li.i0
    public void I(CharSequence charSequence) {
        switch (this.a) {
            case 5:
                p3 p3Var = ((li.y) this.b).O;
                if (p3Var != null) {
                    p3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        p3Var.a.z4(charSequence.toString());
                        break;
                    }
                }
                break;
            default:
                o3 o3Var = ((u4) this.b).N;
                if (o3Var != null) {
                    o3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        o3Var.a.z4(charSequence.toString());
                        break;
                    }
                }
                break;
        }
    }

    @Override // li.i0
    public r9 K() {
        switch (this.a) {
            case 5:
                return (li.y) this.b;
            default:
                return (u4) this.b;
        }
    }

    @Override // li.i0
    public li.a L() {
        switch (this.a) {
            case 5:
                return ((li.y) this.b).a;
            default:
                return ((u4) this.b).a;
        }
    }

    @Override // li.i0
    public boolean M() {
        switch (this.a) {
            case 5:
                li.y yVar = (li.y) this.b;
                p3 p3Var = yVar.O;
                if (p3Var != null) {
                    li.a aVar = yVar.a;
                    if (p3Var.a.Y4()) {
                    }
                }
                break;
            default:
                u4 u4Var = (u4) this.b;
                o3 o3Var = u4Var.N;
                if (o3Var != null) {
                    li.a aVar2 = u4Var.a;
                    if (o3Var.a.Y4()) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // l2.h
    public boolean N() {
        return true;
    }

    @Override // li.i0
    public void O(int i10, int i11) {
        switch (this.a) {
            case 5:
                li.y yVar = (li.y) this.b;
                p3 p3Var = yVar.O;
                if (p3Var != null) {
                    li.a aVar = yVar.a;
                    li.f2 f2Var = p3Var.a.R3;
                    if (f2Var != null) {
                        f2Var.f(i10, i11);
                        break;
                    }
                }
                break;
            default:
                u4 u4Var = (u4) this.b;
                o3 o3Var = u4Var.N;
                if (o3Var != null) {
                    li.a aVar2 = u4Var.a;
                    li.f2 f2Var2 = o3Var.a.R3;
                    if (f2Var2 != null) {
                        f2Var2.f(i10, i11);
                        break;
                    }
                }
                break;
        }
    }

    @Override // li.t3
    public l80 P(View view) {
        return l80.H((li.b2) this.b, view);
    }

    @Override // r0.n
    public r0.k1 P0(View view, r0.k1 k1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        in0 in0Var = (in0) this.b;
        in0Var.v.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        in0Var.s.requestLayout();
        return r0.k1.b;
    }

    @Override // li.t3
    public void Q() {
        li.b2 b2Var = (li.b2) this.b;
        b2Var.A0();
        b2Var.D0();
    }

    @Override // l2.h
    public long R() {
        return 0L;
    }

    @Override // li.i0
    public void S() {
        switch (this.a) {
            case 5:
                li.y yVar = (li.y) this.b;
                p3 p3Var = yVar.O;
                if (p3Var != null) {
                    li.a aVar = yVar.a;
                    v3 v3Var = p3Var.a;
                    li.f2 f2Var = v3Var.R3;
                    if (f2Var != null) {
                        f2Var.g();
                    }
                    v3Var.p3.onContentChanged();
                    break;
                }
                break;
            default:
                u4 u4Var = (u4) this.b;
                o3 o3Var = u4Var.N;
                if (o3Var != null) {
                    li.a aVar2 = u4Var.a;
                    v3 v3Var2 = o3Var.a;
                    li.f2 f2Var2 = v3Var2.R3;
                    if (f2Var2 != null) {
                        f2Var2.g();
                    }
                    v3Var2.p3.onContentChanged();
                    break;
                }
                break;
        }
    }

    @Override // r4.c
    public void T() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // ig.z1
    public /* synthetic */ a0.h U() {
        switch (this.a) {
        }
        return null;
    }

    @Override // l2.h
    public long V(long j10) {
        return 1L;
    }

    @Override // l2.h
    public long W(long j10, long j11) {
        return 1L;
    }

    @Override // org.telegram.ui.Components.eb0
    public void X(int i10, int i11, CharSequence charSequence, boolean z10) {
        ti tiVar = (ti) this.b;
        if (tiVar.s1() == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tiVar.s1().getText());
            spannableStringBuilder.replace(i10, i11 + i10, charSequence);
            if (z10) {
                Emoji.replaceEmoji(spannableStringBuilder, tiVar.s1().getEditText().getPaint().getFontMetricsInt(), false);
            }
            tiVar.s1().setText(spannableStringBuilder);
            tiVar.s1().setSelection(i10 + charSequence.length());
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // r4.c
    public void Y(int i10, Object obj) {
        String str;
        switch (i10) {
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
        if (i10 == 6 || i10 == 7 || i10 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.b).setResultCode(i10);
    }

    @Override // org.telegram.ui.Components.zu0
    public org.telegram.ui.ActionBar.g1 Z(int i10, Runnable runnable, String str, boolean z10, boolean z11) {
        l80 l80Var = (l80) this.b;
        int x9 = l80Var.x();
        l80Var.c(i10, str, new u7(runnable, z11, l80Var, 25), z10);
        View w10 = l80Var.w(x9);
        if (w10 instanceof org.telegram.ui.ActionBar.g1) {
            return (org.telegram.ui.ActionBar.g1) w10;
        }
        return null;
    }

    @Override // l2.h
    public long a(long j10) {
        return 0L;
    }

    @Override // li.i0
    public void a0() {
        switch (this.a) {
            case 5:
                li.y yVar = (li.y) this.b;
                p3 p3Var = yVar.O;
                if (p3Var != null) {
                    li.a aVar = yVar.a;
                    v3.U1(p3Var.a);
                    break;
                }
                break;
            default:
                u4 u4Var = (u4) this.b;
                o3 o3Var = u4Var.N;
                if (o3Var != null) {
                    li.a aVar2 = u4Var.a;
                    v3.U1(o3Var.a);
                    break;
                }
                break;
        }
    }

    @Override // li.i0
    public void b(li.g1 g1Var) {
        switch (this.a) {
            case 5:
                p3 p3Var = ((li.y) this.b).O;
                if (p3Var != null) {
                    v3 v3Var = p3Var.a;
                    v3.S1(v3Var, g1Var);
                    v3Var.p3.s(g1Var, true);
                    break;
                }
                break;
            default:
                o3 o3Var = ((u4) this.b).N;
                if (o3Var != null) {
                    v3 v3Var2 = o3Var.a;
                    v3.S1(v3Var2, g1Var);
                    v3Var2.p3.s(g1Var, true);
                    break;
                }
                break;
        }
    }

    @Override // li.t3
    public boolean c(float f7) {
        boolean z10;
        li.b2 b2Var = (li.b2) this.b;
        FrameLayout frameLayout = b2Var.v0;
        if (frameLayout != null) {
            frameLayout.getLocationOnScreen(new int[2]);
            if (f7 >= r3[1]) {
                z10 = true;
                li.b2.a0(b2Var, z10, true);
                return z10;
            }
        }
        z10 = false;
        li.b2.a0(b2Var, z10, true);
        return z10;
    }

    public float c0(kc.c cVar, kc.c cVar2) {
        int i10 = (int) cVar.a;
        int i11 = (int) cVar.b;
        int i12 = (int) cVar2.a;
        int i13 = (int) cVar2.b;
        float j02 = j0(i10, i11, i12, i13);
        float j03 = j0((int) cVar2.a, i13, (int) cVar.a, i11);
        return Float.isNaN(j02) ? j03 / 7.0f : Float.isNaN(j03) ? j02 / 7.0f : (j02 + j03) / 14.0f;
    }

    @Override // y2.m
    public void d() {
        l2.g gVar = (l2.g) this.b;
        gVar.A.d();
        IOException iOException = gVar.C;
        if (iOException != null) {
            throw iOException;
        }
    }

    public kc.a d0(float f7, float f10, int i10, int i11) {
        kc.a b10;
        kc.a b11;
        int i12 = (int) (f10 * f7);
        int max = Math.max(0, i10 - i12);
        fc.b bVar = (fc.b) this.b;
        int min = Math.min(bVar.a - 1, i10 + i12) - max;
        float f11 = 3.0f * f7;
        if (min < f11) {
            throw ec.e.a();
        }
        int max2 = Math.max(0, i11 - i12);
        int min2 = Math.min(bVar.b - 1, i11 + i12) - max2;
        if (min2 < f11) {
            throw ec.e.a();
        }
        fc.b bVar2 = (fc.b) this.b;
        kc.b bVar3 = new kc.b(bVar2, max, max2, min, min2, f7);
        int i13 = bVar3.e;
        int i14 = bVar3.c;
        int i15 = i13 + i14;
        int i16 = bVar3.f;
        int i17 = (i16 / 2) + bVar3.d;
        int[] iArr = new int[3];
        for (int i18 = 0; i18 < i16; i18++) {
            int i19 = ((i18 & 1) == 0 ? (i18 + 1) / 2 : -((i18 + 1) / 2)) + i17;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i20 = i14;
            while (i20 < i15 && !bVar2.b(i20, i19)) {
                i20++;
            }
            int i21 = 0;
            while (i20 < i15) {
                if (!bVar2.b(i20, i19)) {
                    if (i21 == 1) {
                        i21++;
                    }
                    iArr[i21] = iArr[i21] + 1;
                } else if (i21 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i21 != 2) {
                    i21++;
                    iArr[i21] = iArr[i21] + 1;
                } else {
                    if (bVar3.a(iArr) && (b11 = bVar3.b(i19, i20, iArr)) != null) {
                        return b11;
                    }
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i21 = 1;
                }
                i20++;
            }
            if (bVar3.a(iArr) && (b10 = bVar3.b(i19, i15, iArr)) != null) {
                return b10;
            }
        }
        ArrayList arrayList = bVar3.b;
        if (arrayList.isEmpty()) {
            throw ec.e.a();
        }
        return (kc.a) arrayList.get(0);
    }

    @Override // ig.z1
    public void f(int i10) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ua(this, 25));
                break;
            default:
                org.telegram.ui.Wallet.r9 r9Var = (org.telegram.ui.Wallet.r9) this.b;
                if (!r9Var.r && i10 == r9Var.J) {
                    r9Var.f0(r9Var.N.getText().toString().trim());
                    break;
                }
                break;
        }
    }

    @Override // l2.h
    public long g(long j10, long j11) {
        return 0L;
    }

    @Override // id.a
    public Object get() {
        return new k6.c((Context) ((b9.p) this.b).a, new pa.d(), new u7.s(24), 9);
    }

    @Override // k1.f
    public fe.b getData() {
        return ((k1.z) this.b).c;
    }

    @Override // li.i0
    public void h() {
        switch (this.a) {
            case 5:
                li.y yVar = (li.y) this.b;
                p3 p3Var = yVar.O;
                if (p3Var != null) {
                    v3.V1(p3Var.a, yVar.a);
                    break;
                }
                break;
            default:
                u4 u4Var = (u4) this.b;
                o3 o3Var = u4Var.N;
                if (o3Var != null) {
                    v3.V1(o3Var.a, u4Var.a);
                    break;
                }
                break;
        }
    }

    public void h0(int i10) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        View childAt = recyclerView.getChildAt(i10);
        if (childAt != null) {
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i10);
    }

    @Override // li.t3
    public void i(u3 u3Var, View view) {
        li.b2 b2Var = (li.b2) this.b;
        l80 H = l80.H(b2Var, view);
        H.Q = true;
        b2Var.getParentActivity();
        b2Var.getResourceProvider();
        b2Var.x0 = j4.b(H, b2Var, u3Var, false);
    }

    public float i0(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        s0 s0Var;
        int i20;
        int i21 = 1;
        boolean z10 = Math.abs(i13 - i11) > Math.abs(i12 - i10);
        if (z10) {
            i15 = i10;
            i14 = i11;
            i17 = i12;
            i16 = i13;
        } else {
            i14 = i10;
            i15 = i11;
            i16 = i12;
            i17 = i13;
        }
        int abs = Math.abs(i16 - i14);
        int abs2 = Math.abs(i17 - i15);
        int i22 = 2;
        int i23 = (-abs) / 2;
        int i24 = i14 < i16 ? 1 : -1;
        int i25 = i15 < i17 ? 1 : -1;
        int i26 = i16 + i24;
        int i27 = i14;
        int i28 = i15;
        int i29 = 0;
        while (true) {
            if (i27 == i26) {
                i18 = i22;
                break;
            }
            int i30 = z10 ? i28 : i27;
            int i31 = z10 ? i27 : i28;
            boolean z11 = z10;
            if (i29 == i21) {
                i19 = i21;
                i20 = abs;
                s0Var = this;
            } else {
                i19 = 0;
                s0Var = this;
                i20 = abs;
            }
            if (i19 == ((fc.b) s0Var.b).b(i30, i31)) {
                if (i29 == 2) {
                    return ic.b(i27, i28, i14, i15);
                }
                i29++;
            }
            i23 += abs2;
            if (i23 > 0) {
                if (i28 == i17) {
                    i18 = 2;
                    break;
                }
                i28 += i25;
                i23 -= i20;
            }
            i27 += i24;
            abs = i20;
            z10 = z11;
            i21 = 1;
            i22 = 2;
        }
        if (i29 == i18) {
            return ic.b(i26, i17, i14, i15);
        }
        return Float.NaN;
    }

    @Override // org.telegram.ui.Components.j81
    public void invalidate() {
        switch (this.a) {
            case 15:
                ((org.telegram.ui.Cells.s1) ((org.telegram.ui.Cells.f1) this.b).b).invalidate();
                break;
            default:
                ((dh0) this.b).h.invalidate();
                break;
        }
    }

    public float j0(int i10, int i11, int i12, int i13) {
        float f7;
        float f10;
        fc.b bVar = (fc.b) this.b;
        float i02 = i0(i10, i11, i12, i13);
        int i14 = i10 - (i12 - i10);
        int i15 = 0;
        if (i14 < 0) {
            f7 = i10 / (i10 - i14);
            i14 = 0;
        } else {
            int i16 = bVar.a;
            if (i14 >= i16) {
                float f11 = ((i16 - 1) - i10) / (i14 - i10);
                int i17 = i16 - 1;
                f7 = f11;
                i14 = i17;
            } else {
                f7 = 1.0f;
            }
        }
        float f12 = i11;
        int i18 = (int) (f12 - ((i13 - i11) * f7));
        if (i18 < 0) {
            f10 = f12 / (i11 - i18);
        } else {
            int i19 = bVar.b;
            if (i18 >= i19) {
                f10 = ((i19 - 1) - i11) / (i18 - i11);
                i15 = i19 - 1;
            } else {
                i15 = i18;
                f10 = 1.0f;
            }
        }
        return (i0(i10, i11, (int) (((i14 - i10) * f10) + i10), i15) + i02) - 1.0f;
    }

    @Override // l2.h
    public long k(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override // ig.z1
    public /* synthetic */ boolean k0(int i10) {
        switch (this.a) {
        }
        return true;
    }

    @Override // l2.h
    public m2.j l(long j10) {
        return (m2.j) this.b;
    }

    @Override // li.t3
    public void m(int i10) {
        ((li.b2) this.b).p0(74, i10);
    }

    @Override // li.t3
    public void n() {
        li.b2 b2Var = (li.b2) this.b;
        j3 j3Var = b2Var.P.v3;
        b2Var.y0((j3Var != null && j3Var.x() && b2Var.P.I4()) ? 1 : 0, true);
        b2Var.z0();
        b2Var.x0();
    }

    @Override // li.t3
    public void o(li.a aVar) {
        li.b2 b2Var = (li.b2) this.b;
        if (aVar != null && (aVar.b instanceof TL_iv.pageBlockMap) && AndroidUtilities.isMapsInstalled(b2Var)) {
            ti tiVar = new ti(b2Var.getParentActivity(), b2Var, false, false, false, b2Var.getResourceProvider());
            tiVar.c2 = new tb.a(12);
            tiVar.P = true;
            tiVar.A1.setVisibility(8);
            tiVar.z2 = new androidx.car.app.utils.a(b2Var, aVar, tiVar, 12);
            tiVar.w1();
            tiVar.show();
        }
    }

    @Override // li.t3
    public void onContentChanged() {
        li.b2 b2Var = (li.b2) this.b;
        if (b2Var.y0 != null) {
            boolean s32 = b2Var.P.s3();
            b2Var.L0 = s32;
            b2Var.y0.h(s32);
            b2Var.y0.invalidate();
        }
        b2Var.D0();
        Runnable runnable = b2Var.M0;
        AndroidUtilities.cancelRunOnUIThread(runnable);
        AndroidUtilities.runOnUIThread(runnable, 1000L);
    }

    @Override // org.telegram.ui.Components.q81
    public void onError(t81 t81Var, Exception exc) {
        FileLog.e(exc);
    }

    @Override // org.telegram.ui.Components.q81
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.q81
    public void onStateChanged(boolean z10, int i10) {
        p60 p60Var;
        VideoEditedInfo videoEditedInfo;
        h60 h60Var = (h60) this.b;
        t81 t81Var = h60Var.H0.S;
        if (t81Var != null && t81Var.y() && i10 == 4 && (videoEditedInfo = (p60Var = h60Var.H0).R) != null) {
            t81 t81Var2 = p60Var.S;
            long j10 = videoEditedInfo.startTime;
            if (j10 <= 0) {
                j10 = 0;
            }
            t81Var2.K(j10);
        }
    }

    @Override // org.telegram.ui.Components.q81
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // li.t3
    public void p(d6 d6Var, String str) {
        li.b2 b2Var = (li.b2) this.b;
        if (b2Var.z0 == null) {
            b2Var.z0 = new r3(new e1(this, 8), b2Var.getResourceProvider());
        }
        b2Var.z0.f(d6Var, str);
    }

    @Override // ig.z1
    public /* synthetic */ void p0(ArrayList arrayList) {
        int i10 = this.a;
    }

    @Override // li.t3
    public void q() {
        li.b2 b2Var = (li.b2) this.b;
        b2Var.I0 = b2Var.K0;
        li.b2.a0(b2Var, false, false);
        b2Var.y0(2, true);
    }

    @Override // l.i
    public void r(l.k kVar) {
        i iVar = ((ActionMenuView) this.b).K;
        if (iVar != null) {
            iVar.r(kVar);
        }
    }

    @Override // l2.h
    public long t(long j10, long j11) {
        return 0L;
    }

    @Override // org.telegram.ui.Components.zu0
    public void v() {
        ((l80) this.b).k();
    }

    @Override // k1.f
    public Object w(ud.p pVar, nd.c cVar) {
        return ((k1.z) this.b).w(new n1.c(pVar, null, 0), cVar);
    }

    @Override // org.telegram.ui.Components.zu0
    public org.telegram.ui.ActionBar.g1 x(String str) {
        org.telegram.ui.ActionBar.g1 h = ((l80) this.b).h();
        h.setText(str);
        return h;
    }

    @Override // ig.z1
    public /* synthetic */ a0.h y() {
        switch (this.a) {
        }
        return null;
    }

    @Override // oe.d
    public void z(float f7, int i10) {
        ((oe.j) this.b).h(f7);
    }

    public s0() {
        this.a = 13;
        this.b = new SparseArray();
    }

    @Override // org.telegram.ui.Components.q81
    public void onRenderedFirstFrame() {
    }

    public s0(int i10, int i11, int[] iArr) {
        this.a = 16;
        w60[] w60VarArr = new w60[(iArr.length / 2) + 1];
        this.b = w60VarArr;
        w60 w60Var = new w60(i10, i11);
        int i12 = 0;
        w60VarArr[0] = w60Var;
        while (i12 < iArr.length / 2) {
            int i13 = i12 + 1;
            int i14 = i12 * 2;
            ((w60[]) this.b)[i13] = new w60(iArr[i14], iArr[i14 + 1]);
            i12 = i13;
        }
    }

    public s0(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.a = 26;
        this.b = new GestureDetector(context, onGestureListener, null);
    }

    public s0(ArrayList arrayList) {
        this.a = 28;
        this.b = DesugarCollections.unmodifiableList(arrayList);
    }

    public s0(EditText editText) {
        this.a = 25;
        this.b = new m4.c(editText);
    }

    @Override // li.t3
    public void u() {
    }

    private final /* synthetic */ void f0(ArrayList arrayList) {
    }

    private final /* synthetic */ void g0(ArrayList arrayList) {
    }

    @Override // li.t3
    public void A(int i10) {
    }

    @Override // org.telegram.ui.Components.eb0
    public /* synthetic */ void b0(String str) {
    }

    @Override // org.telegram.ui.Components.q81
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.q81
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.q81
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // l2.h
    public long e(long j10, long j11) {
        return j11;
    }

    @Override // li.t3
    public void s(li.g1 g1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Components.eb0
    public /* synthetic */ void J(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    @Override // org.telegram.ui.Components.eb0
    public /* synthetic */ void j(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
    }

    @Override // org.telegram.ui.Components.q81
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
