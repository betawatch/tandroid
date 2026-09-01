package n7;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ec0;
import org.telegram.ui.Components.fy0;
import org.telegram.ui.Components.g01;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.qf0;
import org.telegram.ui.Components.v61;
import org.telegram.ui.Components.vt;
import org.telegram.ui.Components.xt;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.d41;
import org.telegram.ui.fn0;
import org.telegram.ui.gl0;
import org.telegram.ui.gv;
import org.telegram.ui.hv;
import org.telegram.ui.nm0;
import org.telegram.ui.o21;
import org.telegram.ui.ow;
import org.telegram.ui.oy;
import org.telegram.ui.py;
import org.telegram.ui.tm0;
import org.telegram.ui.w01;
import org.telegram.ui.xu0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public class qa implements OnCompleteListener, od.b, org.telegram.ui.ActionBar.g6, vt, qh.ga, org.telegram.ui.Cells.k1, org.telegram.ui.k7, ml0, tm0, tg.a, h71, p2.z, com.google.android.gms.common.api.internal.s {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ qa(int i10) {
        this.a = i10;
    }

    public static qa M0(View view) {
        return new qa(view);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean A0(MessageObject messageObject) {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g6
    public int B0(int i10) {
        switch (this.a) {
            case 8:
                SparseIntArray sparseIntArray = (SparseIntArray) this.b;
                int indexOfKey = sparseIntArray.indexOfKey(i10);
                return indexOfKey >= 0 ? sparseIntArray.valueAt(indexOfKey) : org.telegram.ui.ActionBar.k6.w0(null, i10, false);
            case 20:
                SparseIntArray sparseIntArray2 = (SparseIntArray) this.b;
                return sparseIntArray2 != null ? sparseIntArray2.get(i10) : org.telegram.ui.ActionBar.k6.w0(null, i10, false);
            default:
                SparseIntArray sparseIntArray3 = (SparseIntArray) this.b;
                int indexOfKey2 = sparseIntArray3.indexOfKey(i10);
                if (indexOfKey2 >= 0) {
                    return sparseIntArray3.valueAt(indexOfKey2);
                }
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.c;
                return g6Var == null ? org.telegram.ui.ActionBar.k6.w0(null, i10, false) : g6Var.B0(i10);
        }
    }

    @Override // org.telegram.ui.tm0
    public void C(String str, String str2) {
        fn0 fn0Var = ((nm0) this.c).a;
        if ("PHONE_VERIFICATION_NEEDED".equals(str)) {
            fn0Var.O1(true, str2, (gl0) this.b, this, fn0Var.y1);
        } else {
            fn0Var.N1(true, false);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean E2(int i10) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g6
    public Paint F(String str) {
        switch (this.a) {
            case 8:
                return org.telegram.ui.ActionBar.k6.S0(str);
            case 20:
                return org.telegram.ui.ActionBar.k6.S0(str);
            default:
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.c;
                return g6Var == null ? org.telegram.ui.ActionBar.k6.S0(str) : g6Var.F(str);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean H1() {
        return false;
    }

    @Override // tg.a
    public void I(Canvas canvas, float f10, float f11, float f12, float f13) {
        switch (this.a) {
            case 18:
                canvas.save();
                canvas.clipRect(f10, f11, f12, f13);
                ((PhotoViewer) this.c).T0(canvas, (org.telegram.ui.Components.fa) this.b, -14277082, 855638016, false, true, true);
                canvas.drawColor(637534208);
                canvas.restore();
                break;
            default:
                Paint paint = (Paint) this.b;
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.c;
                fg.p1 p1Var = premiumPreviewFragment.j0;
                if (!premiumPreviewFragment.e0) {
                    p1Var.d(0, (-premiumPreviewFragment.a0.getMeasuredWidth()) * 0.1f * premiumPreviewFragment.Y, 0, premiumPreviewFragment.a0.getMeasuredWidth(), 0.0f, premiumPreviewFragment.a0.getMeasuredHeight());
                    canvas.drawRect(f10, f11, f12, f13, p1Var.f);
                    break;
                } else {
                    paint.setColor(premiumPreviewFragment.getThemedColor(org.telegram.ui.ActionBar.k6.a7));
                    canvas.drawRect(f10, f11, f12, f13, paint);
                    break;
                }
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ org.telegram.ui.Cells.n9 I2() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.g6
    public void J0(int i10, int i11) {
        switch (this.a) {
            case 8:
            case 20:
                break;
            default:
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.c;
                if (g6Var != null) {
                    g6Var.J0(i10, i11);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean N(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem, boolean z4) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean N1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean O() {
        return false;
    }

    public p2.d O0() {
        if (((p2.m) this.b) != null) {
            return new p2.d(this);
        }
        throw new NullPointerException("ProductDetails is required for constructing ProductDetailsParams.");
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean P(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean P1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean R() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean R0(long j10) {
        return ((g01) this.c).v;
    }

    public pb.b T0() {
        if (((pb.b) this.c) == null) {
            pb.f fVar = (pb.f) this.b;
            int[] iArr = fVar.c;
            ob.d dVar = fVar.a;
            int i10 = dVar.a;
            int i11 = dVar.b;
            pb.b bVar = new pb.b(i10, i11);
            if (fVar.b.length < i10) {
                fVar.b = new byte[i10];
            }
            for (int i12 = 0; i12 < 32; i12++) {
                iArr[i12] = 0;
            }
            for (int i13 = 1; i13 < 5; i13++) {
                byte[] b10 = dVar.b((i11 * i13) / 5, fVar.b);
                int i14 = (i10 * 4) / 5;
                for (int i15 = i10 / 5; i15 < i14; i15++) {
                    int i16 = (b10[i15] & 255) >> 3;
                    iArr[i16] = iArr[i16] + 1;
                }
            }
            int length = iArr.length;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            for (int i20 = 0; i20 < length; i20++) {
                int i21 = iArr[i20];
                if (i21 > i17) {
                    i19 = i20;
                    i17 = i21;
                }
                if (i21 > i18) {
                    i18 = i21;
                }
            }
            int i22 = 0;
            int i23 = 0;
            for (int i24 = 0; i24 < length; i24++) {
                int i25 = i24 - i19;
                int i26 = iArr[i24] * i25 * i25;
                if (i26 > i23) {
                    i22 = i24;
                    i23 = i26;
                }
            }
            if (i19 <= i22) {
                int i27 = i19;
                i19 = i22;
                i22 = i27;
            }
            if (i19 - i22 <= length / 16) {
                throw ob.e.a();
            }
            int i28 = i19 - 1;
            int i29 = i28;
            int i30 = -1;
            while (i28 > i22) {
                int i31 = i28 - i22;
                int i32 = (i18 - iArr[i28]) * (i19 - i28) * i31 * i31;
                if (i32 > i30) {
                    i29 = i28;
                    i30 = i32;
                }
                i28--;
            }
            int i33 = i29 << 3;
            byte[] a2 = dVar.a();
            for (int i34 = 0; i34 < i11; i34++) {
                int i35 = i34 * i10;
                for (int i36 = 0; i36 < i10; i36++) {
                    if ((a2[i35 + i36] & 255) < i33) {
                        int i37 = (i36 / 32) + (bVar.c * i34);
                        int[] iArr2 = bVar.d;
                        iArr2[i37] = iArr2[i37] | (1 << (i36 & 31));
                    }
                }
            }
            this.c = bVar;
        }
        return (pb.b) this.c;
    }

    @Override // org.telegram.ui.Cells.k1
    public void U1(org.telegram.ui.Cells.t1 t1Var, TLRPC.WebPage webPage, String str, boolean z4) {
        af.g.s(t1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int V() {
        return 0;
    }

    public void V0(Exception exc, boolean z4) {
        this.c = null;
        HashSet hashSet = (HashSet) this.b;
        s8.v t6 = s8.v.t(hashSet);
        hashSet.clear();
        s8.t listIterator = t6.listIterator(0);
        while (listIterator.hasNext()) {
            o3.b bVar = (o3.b) listIterator.next();
            bVar.getClass();
            bVar.k(exc, z4 ? 1 : 3);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ CharacterStyle W1(org.telegram.ui.Cells.t1 t1Var) {
        return null;
    }

    public void X0(boolean z4, boolean z10, float f10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b;
        oh.y3 y3Var = (oh.y3) this.c;
        oh.i9 i9Var = y3Var.e;
        oh.i9.y1 = f10;
        oh.h9 h9Var = i9Var.w0;
        if (h9Var != null) {
            h9Var.setSpeed(f10);
        }
        oh.f4.a0(y3Var.l, z4);
        if (!z10 || actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() == null) {
            return;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
    }

    @Override // org.telegram.ui.k7
    public void Y(org.telegram.ui.u6 u6Var, nh.a aVar, boolean z4) {
        hv hvVar = (hv) this.c;
        gv gvVar = hvVar.U;
        if (aVar != null) {
            ((nh.b) this.b).i(aVar);
            hvVar.b0.d();
            nh.b bVar = hvVar.d0;
            fy0[] fy0VarArr = hvVar.Y;
            org.telegram.ui.Cells.z1[] z1VarArr = hvVar.Z;
            org.telegram.ui.Cells.z1 z1Var = z1VarArr[0];
            if (z1Var != null) {
                fy0 fy0Var = fy0VarArr[0];
                boolean z10 = bVar.m;
                fy0Var.c = z10;
                z1Var.c(z10, true);
            }
            org.telegram.ui.Cells.z1 z1Var2 = z1VarArr[1];
            if (z1Var2 != null) {
                fy0 fy0Var2 = fy0VarArr[1];
                boolean z11 = bVar.n;
                fy0Var2.c = z11;
                z1Var2.c(z11, true);
            }
            org.telegram.ui.Cells.z1 z1Var3 = z1VarArr[2];
            if (z1Var3 != null) {
                fy0 fy0Var3 = fy0VarArr[2];
                boolean z12 = bVar.o;
                fy0Var3.c = z12;
                z1Var3.c(z12, true);
            }
            org.telegram.ui.Cells.z1 z1Var4 = z1VarArr[3];
            if (z1Var4 != null) {
                fy0 fy0Var4 = fy0VarArr[3];
                boolean z13 = bVar.p;
                fy0Var4.c = z13;
                z1Var4.c(z13, true);
            }
            org.telegram.ui.Cells.z1 z1Var5 = z1VarArr[4];
            if (z1Var5 != null) {
                fy0 fy0Var5 = fy0VarArr[4];
                boolean z14 = bVar.q;
                fy0Var5.c = z14;
                z1Var5.c(z14, true);
            }
            hvVar.X.a(gvVar.d(), true);
            gvVar.c(true);
        }
    }

    public void Y0(o0.g gVar) {
        androidx.biometric.p pVar = (androidx.biometric.p) this.c;
        y5.h hVar = (y5.h) this.b;
        int i10 = gVar.b;
        if (i10 != 0) {
            pVar.execute(new m2.b(hVar, i10));
        } else {
            pVar.execute(new androidx.biometric.k(hVar, gVar.a, false, 26));
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Y1(org.telegram.ui.Cells.t1 t1Var, MessageObject messageObject) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ vg.a Z() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.g6
    public int Z0(int i10) {
        switch (this.a) {
            case 8:
                return ((SparseIntArray) this.b).get(i10);
            case 20:
                return B0(i10);
            default:
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.c;
                return g6Var == null ? org.telegram.ui.ActionBar.k6.w0(null, i10, false) : g6Var.Z0(i10);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // org.telegram.ui.ActionBar.g6
    public boolean a() {
        switch (this.a) {
        }
        return org.telegram.ui.ActionBar.k6.I.q();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean a0(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        q5.e0 e0Var = (q5.e0) this.b;
        String str = (String) this.c;
        u5.x xVar = (u5.x) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        b6.m.j("Not connected to device", e0Var.F == 2);
        u5.f fVar = (u5.f) xVar.u();
        Parcel M0 = fVar.M0();
        M0.writeString(str);
        fVar.R0(M0, 5);
        synchronized (e0Var.s) {
            try {
                if (e0Var.p != null) {
                    taskCompletionSource.setException(b6.m.m(new Status(2001, null, null, null)));
                } else {
                    e0Var.p = taskCompletionSource;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // tg.a
    public /* synthetic */ void b() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.vt
    public void b0() {
        org.telegram.ui.Cells.f3 f3Var = (org.telegram.ui.Cells.f3) this.c;
        ((xt) this.b).getText();
        f3Var.b();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean b1(org.telegram.ui.Cells.t1 t1Var, boolean z4) {
        return false;
    }

    @Override // org.telegram.ui.Components.ml0
    public boolean c(float f10, float f11, int i10, View view) {
        py pyVar = (py) this.c;
        if (view instanceof org.telegram.ui.Cells.r2) {
            org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
            if (r2Var.k2) {
                pyVar.N4(r2Var.getDialogId(), view);
                return true;
            }
        }
        ow owVar = pyVar.w0;
        if (owVar != null && owVar.getVisibility() == 0 && pyVar.w0.n) {
            return false;
        }
        return pyVar.o4(view, i10, f10, ((oy) this.b).d);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean c0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean d() {
        return false;
    }

    @Override // qh.ga
    public void d0(float f10, boolean z4) {
        ec0 ec0Var = (ec0) this.b;
        qf0 qf0Var = (qf0) this.c;
        k71 k71Var = qf0Var.d;
        if (k71Var == null) {
            return;
        }
        float max = 2.8f / Math.max(60L, r2);
        long p10 = (long) ((((f10 / (1.0f - max)) * max) + f10) * k71Var.p());
        qf0Var.e = p10;
        qf0Var.d.L(p10, !z4);
        if (z4) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(ec0Var);
        AndroidUtilities.runOnUIThread(ec0Var, 120L);
    }

    @Override // org.telegram.ui.k7
    public void dismiss() {
        ((hv) this.c).dismiss();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g6
    public int e0(int i10) {
        switch (this.a) {
            case 8:
                return B0(i10);
            case 20:
                return B0(i10);
            default:
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.c;
                return g6Var == null ? org.telegram.ui.ActionBar.k6.w0(null, i10, false) : g6Var.e0(i10);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean e2(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String g(org.telegram.ui.Cells.t1 t1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean g0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean g1(int i10, org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ xu0 g2() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.g6
    public Drawable getDrawable(String str) {
        switch (this.a) {
            case 8:
                return null;
            case 20:
                return null;
            default:
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.c;
                return g6Var == null ? org.telegram.ui.ActionBar.k6.O0(str) : g6Var.getDrawable(str);
        }
    }

    @Override // org.telegram.ui.Components.ml0
    public void h() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((py) this.c).finishPreviewFragment();
        }
    }

    public void i1(p2.m mVar) {
        this.b = mVar;
        if (mVar.a() != null) {
            mVar.a().getClass();
            String str = mVar.a().d;
            if (str != null) {
                this.c = str;
            }
        }
    }

    public r3.v j1(int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = (int[]) this.b;
            if (i11 >= iArr.length) {
                h5.a.o("BaseMediaChunkOutput", "Unmatched track of type: " + i10);
                return new r3.j();
            }
            if (i10 == iArr[i11]) {
                return ((o4.k0[]) this.c)[i11];
            }
            i11++;
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean j2(long j10) {
        return ((g01) this.c).s;
    }

    @Override // tg.a
    public qg.b k() {
        switch (this.a) {
            case 18:
                if (Build.VERSION.SDK_INT < 29) {
                    break;
                } else {
                    qg.c cVar = new qg.c(this);
                    ((PhotoViewer) this.c).W.add(cVar);
                    break;
                }
        }
        return new qg.d(this);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int k0(org.telegram.ui.Cells.t1 t1Var) {
        return 0;
    }

    public void k1(com.google.android.gms.internal.play_billing.g3 g3Var) {
        try {
            u1(g3Var, (com.google.android.gms.internal.play_billing.p3) this.b);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // org.telegram.ui.ActionBar.g6
    public void l(float f10, float f11, int i10, int i11) {
        switch (this.a) {
            case 8:
                org.telegram.ui.ActionBar.k6.q(f10, f11, i10, i11);
                break;
            case 20:
                org.telegram.ui.ActionBar.k6.q(f10, f11, i10, i11);
                break;
            default:
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.c;
                if (g6Var != null) {
                    g6Var.l(f10, f11, i10, i11);
                    break;
                } else {
                    org.telegram.ui.ActionBar.k6.q(f10, f11, i10, i11);
                    break;
                }
        }
    }

    public void l1(com.google.android.gms.internal.play_billing.g3 g3Var, int i10, long j10) {
        try {
            com.google.android.gms.internal.play_billing.o3 o3Var = (com.google.android.gms.internal.play_billing.o3) ((com.google.android.gms.internal.play_billing.p3) this.b).g();
            o3Var.c();
            com.google.android.gms.internal.play_billing.p3.p((com.google.android.gms.internal.play_billing.p3) o3Var.b, i10);
            com.google.android.gms.internal.play_billing.p3 p3Var = (com.google.android.gms.internal.play_billing.p3) o3Var.a();
            this.b = p3Var;
            if (j10 != 0) {
                com.google.android.gms.internal.play_billing.o3 o3Var2 = (com.google.android.gms.internal.play_billing.o3) p3Var.g();
                o3Var2.c();
                com.google.android.gms.internal.play_billing.p3.r((com.google.android.gms.internal.play_billing.p3) o3Var2.b, j10);
                p3Var = (com.google.android.gms.internal.play_billing.p3) o3Var2.a();
            }
            u1(g3Var, p3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean l2(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean m1(MessageObject messageObject) {
        return org.telegram.ui.b.a(messageObject);
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean n0() {
        return false;
    }

    public void n1(com.google.android.gms.internal.play_billing.g3 g3Var, long j10, boolean z4) {
        com.google.android.gms.internal.play_billing.p3 p3Var;
        try {
            com.google.android.gms.internal.play_billing.f3 f3Var = (com.google.android.gms.internal.play_billing.f3) g3Var.g();
            com.google.android.gms.internal.play_billing.t3 t3Var = (com.google.android.gms.internal.play_billing.t3) g3Var.o().g();
            t3Var.c();
            com.google.android.gms.internal.play_billing.v3.n((com.google.android.gms.internal.play_billing.v3) t3Var.b, z4);
            f3Var.c();
            com.google.android.gms.internal.play_billing.g3.r((com.google.android.gms.internal.play_billing.g3) f3Var.b, (com.google.android.gms.internal.play_billing.v3) t3Var.a());
            com.google.android.gms.internal.play_billing.g3 g3Var2 = (com.google.android.gms.internal.play_billing.g3) f3Var.a();
            if (j10 == 0) {
                p3Var = (com.google.android.gms.internal.play_billing.p3) this.b;
            } else {
                com.google.android.gms.internal.play_billing.o3 o3Var = (com.google.android.gms.internal.play_billing.o3) ((com.google.android.gms.internal.play_billing.p3) this.b).g();
                o3Var.c();
                com.google.android.gms.internal.play_billing.p3.r((com.google.android.gms.internal.play_billing.p3) o3Var.b, j10);
                p3Var = (com.google.android.gms.internal.play_billing.p3) o3Var.a();
            }
            u1(g3Var2, p3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // org.telegram.ui.ActionBar.g6
    public boolean o0() {
        switch (this.a) {
            case 8:
                return false;
            case 20:
                return false;
            default:
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.c;
                return g6Var == null ? org.telegram.ui.ActionBar.k6.a1() : g6Var.o0();
        }
    }

    public void o1(com.google.android.gms.internal.play_billing.g3 g3Var, int i10, long j10, boolean z4) {
        com.google.android.gms.internal.play_billing.p3 p3Var;
        try {
            com.google.android.gms.internal.play_billing.o3 o3Var = (com.google.android.gms.internal.play_billing.o3) ((com.google.android.gms.internal.play_billing.p3) this.b).g();
            o3Var.c();
            com.google.android.gms.internal.play_billing.p3.p((com.google.android.gms.internal.play_billing.p3) o3Var.b, i10);
            this.b = (com.google.android.gms.internal.play_billing.p3) o3Var.a();
            com.google.android.gms.internal.play_billing.f3 f3Var = (com.google.android.gms.internal.play_billing.f3) g3Var.g();
            com.google.android.gms.internal.play_billing.t3 t3Var = (com.google.android.gms.internal.play_billing.t3) g3Var.o().g();
            t3Var.c();
            com.google.android.gms.internal.play_billing.v3.n((com.google.android.gms.internal.play_billing.v3) t3Var.b, z4);
            f3Var.c();
            com.google.android.gms.internal.play_billing.g3.r((com.google.android.gms.internal.play_billing.g3) f3Var.b, (com.google.android.gms.internal.play_billing.v3) t3Var.a());
            com.google.android.gms.internal.play_billing.g3 g3Var2 = (com.google.android.gms.internal.play_billing.g3) f3Var.a();
            if (j10 == 0) {
                p3Var = (com.google.android.gms.internal.play_billing.p3) this.b;
            } else {
                com.google.android.gms.internal.play_billing.o3 o3Var2 = (com.google.android.gms.internal.play_billing.o3) ((com.google.android.gms.internal.play_billing.p3) this.b).g();
                o3Var2.c();
                com.google.android.gms.internal.play_billing.p3.r((com.google.android.gms.internal.play_billing.p3) o3Var2.b, j10);
                p3Var = (com.google.android.gms.internal.play_billing.p3) o3Var2.a();
            }
            u1(g3Var2, p3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        o8.c cVar = (o8.c) this.b;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
        synchronized (cVar.f) {
            cVar.e.remove(taskCompletionSource);
        }
    }

    @Override // org.telegram.ui.Components.h71
    public void onError(k71 k71Var, Exception exc) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
        int i10 = secretMediaViewer.Y;
        if (i10 <= 0) {
            FileLog.e(exc);
            return;
        }
        secretMediaViewer.Y = i10 - 1;
        AndroidUtilities.runOnUIThread(new w01(9, this, (File) this.b), 100L);
    }

    @Override // org.telegram.ui.Components.h71
    public /* synthetic */ void onRenderedFirstFrame(k3.a aVar) {
    }

    @Override // org.telegram.ui.Components.h71
    public void onStateChanged(boolean z4, int i10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
        d41 d41Var = secretMediaViewer.f1;
        if (secretMediaViewer.y == null || secretMediaViewer.e0 == null) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(d41Var);
        AndroidUtilities.runOnUIThread(d41Var);
        if (i10 == 4 || i10 == 1) {
            try {
                secretMediaViewer.b.getWindow().clearFlags(128);
            } catch (Exception e6) {
                FileLog.e(e6);
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
        if (secretMediaViewer.y.y() && i10 != 4) {
            if (secretMediaViewer.B) {
                return;
            }
            secretMediaViewer.B = true;
        } else if (secretMediaViewer.B) {
            secretMediaViewer.B = false;
            if (i10 == 4) {
                secretMediaViewer.E = true;
                if (secretMediaViewer.F) {
                    secretMediaViewer.e(true, !secretMediaViewer.n1);
                } else {
                    secretMediaViewer.y.L(0L, false);
                    secretMediaViewer.y.C();
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.h71
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.h71
    public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
        org.telegram.ui.o4 o4Var = ((SecretMediaViewer) this.c).w;
        if (o4Var != null) {
            if (i12 != 90 && i12 != 270) {
                i11 = i10;
                i10 = i11;
            }
            o4Var.a(i10 == 0 ? 1.0f : (i11 * f10) / i10, i12);
        }
    }

    @Override // org.telegram.ui.Components.ml0
    public void p(float f10) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((py) this.c).movePreviewFragment(f10);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean q0(org.telegram.ui.Components.u5 u5Var) {
        return false;
    }

    public void q1(com.google.android.gms.internal.play_billing.l3 l3Var) {
        try {
            com.google.android.gms.internal.play_billing.w3 t6 = com.google.android.gms.internal.play_billing.x3.t();
            t6.d((com.google.android.gms.internal.play_billing.p3) this.b);
            t6.c();
            com.google.android.gms.internal.play_billing.x3.p((com.google.android.gms.internal.play_billing.x3) t6.b, l3Var);
            ((c2.u) this.c).h((com.google.android.gms.internal.play_billing.x3) t6.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void r1(com.google.android.gms.internal.play_billing.a4 a4Var) {
        try {
            c2.u uVar = (c2.u) this.c;
            com.google.android.gms.internal.play_billing.w3 t6 = com.google.android.gms.internal.play_billing.x3.t();
            t6.d((com.google.android.gms.internal.play_billing.p3) this.b);
            t6.c();
            com.google.android.gms.internal.play_billing.x3.r((com.google.android.gms.internal.play_billing.x3) t6.b, a4Var);
            uVar.h((com.google.android.gms.internal.play_billing.x3) t6.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void t1(com.google.android.gms.internal.play_billing.b4 b4Var) {
        if (b4Var == null) {
            return;
        }
        try {
            com.google.android.gms.internal.play_billing.w3 t6 = com.google.android.gms.internal.play_billing.x3.t();
            t6.d((com.google.android.gms.internal.play_billing.p3) this.b);
            t6.c();
            com.google.android.gms.internal.play_billing.x3.s((com.google.android.gms.internal.play_billing.x3) t6.b, b4Var);
            ((c2.u) this.c).h((com.google.android.gms.internal.play_billing.x3) t6.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public String toString() {
        switch (this.a) {
            case 5:
                try {
                    return T0().toString();
                } catch (ob.e unused) {
                    return "";
                }
            default:
                return super.toString();
        }
    }

    public void u1(com.google.android.gms.internal.play_billing.g3 g3Var, com.google.android.gms.internal.play_billing.p3 p3Var) {
        if (g3Var == null) {
            return;
        }
        try {
            com.google.android.gms.internal.play_billing.w3 t6 = com.google.android.gms.internal.play_billing.x3.t();
            t6.d(p3Var);
            t6.c();
            com.google.android.gms.internal.play_billing.x3.n((com.google.android.gms.internal.play_billing.x3) t6.b, g3Var);
            ((c2.u) this.c).h((com.google.android.gms.internal.play_billing.x3) t6.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public String v(long j10) {
        String trim = ((EditTextBoldCursor) this.b).getText().toString().trim();
        if (trim.length() > 16) {
            trim = trim.substring(0, 16);
        }
        if (((g01) this.c).s || !TextUtils.isEmpty(trim)) {
            return trim;
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean v2(org.telegram.ui.Cells.t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g6
    public ColorFilter w() {
        switch (this.a) {
            case 8:
                return org.telegram.ui.ActionBar.k6.v3;
            case 20:
                return org.telegram.ui.ActionBar.k6.v3;
            default:
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.c;
                return g6Var == null ? org.telegram.ui.ActionBar.k6.v3 : g6Var.w();
        }
    }

    public void w1(com.google.android.gms.internal.play_billing.i3 i3Var, com.google.android.gms.internal.play_billing.p3 p3Var) {
        try {
            com.google.android.gms.internal.play_billing.w3 t6 = com.google.android.gms.internal.play_billing.x3.t();
            t6.d(p3Var);
            t6.c();
            com.google.android.gms.internal.play_billing.x3.o((com.google.android.gms.internal.play_billing.x3) t6.b, i3Var);
            ((c2.u) this.c).h((com.google.android.gms.internal.play_billing.x3) t6.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        if (r2.a(r6, r7, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // od.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object x(od.c cVar, wc.c cVar2) {
        od.d dVar;
        int i10;
        qa qaVar;
        Throwable th2;
        if (cVar2 instanceof od.d) {
            dVar = (od.d) cVar2;
            int i11 = dVar.b;
            if ((i11 & TLObject.FLAG_31) != 0) {
                dVar.b = i11 - TLObject.FLAG_31;
                Object obj = dVar.a;
                Object obj2 = vc.a.a;
                i10 = dVar.b;
                if (i10 != 0) {
                    k7.q7.b(obj);
                    od.b bVar = (od.b) this.b;
                    dVar.d = this;
                    dVar.e = cVar;
                    dVar.b = 1;
                    obj = od.n.a(bVar, cVar, dVar);
                    if (obj != obj2) {
                        qaVar = this;
                    }
                    return obj2;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    k7.q7.b(obj);
                    return sc.i.a;
                }
                cVar = dVar.e;
                qaVar = dVar.d;
                k7.q7.b(obj);
                th2 = (Throwable) obj;
                if (th2 != null) {
                    la.x xVar = (la.x) qaVar.c;
                    dVar.d = null;
                    dVar.e = null;
                    dVar.b = 2;
                }
                return sc.i.a;
            }
        }
        dVar = new od.d(this, cVar2);
        Object obj3 = dVar.a;
        Object obj22 = vc.a.a;
        i10 = dVar.b;
        if (i10 != 0) {
        }
        th2 = (Throwable) obj3;
        if (th2 != null) {
        }
        return sc.i.a;
    }

    public /* synthetic */ qa(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.Components.h71
    public void onRenderedFirstFrame() {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
        if (secretMediaViewer.Z) {
            return;
        }
        secretMediaViewer.Z = true;
        secretMediaViewer.e.invalidate();
    }

    public /* synthetic */ qa(Object obj, Object obj2, boolean z4, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    public qa(Context context, com.google.android.gms.internal.play_billing.p3 p3Var) {
        this.a = 24;
        c2.u uVar = new c2.u(5);
        try {
            y2.q.b(context);
            uVar.c = y2.q.a().c(w2.a.e).a("PLAY_BILLING_LIBRARY", new v2.c("proto"), new db.a(18));
        } catch (Throwable unused) {
            uVar.b = true;
        }
        this.c = uVar;
        this.b = p3Var;
    }

    public qa(org.telegram.ui.ActionBar.g6 g6Var) {
        this.a = 22;
        this.b = new SparseIntArray();
        this.c = g6Var;
        L0();
    }

    public qa(pb.f fVar) {
        this.a = 5;
        this.b = fVar;
    }

    public qa(View view) {
        this.a = 14;
        v61 v61Var = new v61(this, view);
        this.b = v61Var;
        view.addOnLayoutChangeListener(v61Var);
    }

    public qa(qf0 qf0Var) {
        this.a = 12;
        this.c = qf0Var;
        this.b = new ec0(this, 9);
    }

    public qa(EditText editText) {
        this.a = 26;
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

    private final /* synthetic */ void P0() {
    }

    private final /* synthetic */ void Q0() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void D0() {
    }

    @Override // qh.ga
    public /* synthetic */ void G() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void G2() {
    }

    public void L0() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void a2() {
    }

    @Override // org.telegram.ui.k7
    public void clear() {
    }

    @Override // org.telegram.ui.k7
    public void f1() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void j() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void o() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void p1() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void r() {
    }

    @Override // qh.ga
    public /* synthetic */ void w0() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void z2() {
    }

    @Override // qh.ga
    public /* synthetic */ void A(float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void C0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void E(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void H(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // qh.ga
    public /* synthetic */ void H0(long j10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public void I0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // qh.ga
    public /* synthetic */ void J(float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void J1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void K(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void K0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void N0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void R1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void S0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void T(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void T1(MessageObject messageObject) {
    }

    @Override // qh.ga
    public /* synthetic */ void U(boolean z4) {
    }

    @Override // qh.ga
    public /* synthetic */ void X(float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void c1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void d1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // qh.ga
    public /* synthetic */ void f(int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void f0(int i10) {
    }

    @Override // qh.ga
    public /* synthetic */ void h0(long j10) {
    }

    @Override // qh.ga
    public /* synthetic */ void j0(boolean z4) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void l0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void n(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void o2(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Components.h71
    public /* synthetic */ void onSeekFinished(k3.a aVar) {
    }

    @Override // org.telegram.ui.Components.h71
    public /* synthetic */ void onSeekStarted(k3.a aVar) {
    }

    @Override // org.telegram.ui.Components.h71
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void p0(String str) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void q(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // qh.ga
    public /* synthetic */ void r0(float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void s(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void t(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // qh.ga
    public /* synthetic */ void t0(float f10) {
    }

    @Override // qh.ga
    public /* synthetic */ void u(float f10) {
    }

    @Override // qh.ga
    public /* synthetic */ void v0(float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void w2(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void y(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // qh.ga
    public /* synthetic */ void y0(float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void z(org.telegram.ui.Cells.t1 t1Var) {
    }

    public qa(PremiumPreviewFragment premiumPreviewFragment) {
        this.a = 19;
        this.c = premiumPreviewFragment;
        this.b = new Paint();
    }

    private final /* synthetic */ void e1(int i10, int i11) {
    }

    private final /* synthetic */ void h1(int i10, int i11) {
    }

    @Override // qh.ga
    public /* synthetic */ void B(long j10, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void D(org.telegram.ui.Cells.t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // qh.ga
    public /* synthetic */ void E0(int i10, long j10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void L(int i10, org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void L1(org.telegram.ui.Cells.t1 t1Var, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void O1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void Q(org.telegram.ui.Cells.t1 t1Var, kh.f fVar) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void U0(int i10, org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // qh.ga
    public /* synthetic */ void W(float f10, int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void W0(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void c2(org.telegram.ui.Cells.t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // qh.ga
    public /* synthetic */ void m0(float f10, int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void q2(org.telegram.ui.Cells.t1 t1Var, long j10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void s1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // qh.ga
    public /* synthetic */ void u0(float f10, int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void v1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Document document) {
    }

    public qa() {
        this.a = 3;
        this.b = new HashSet();
    }

    public qa(o21 o21Var) {
        this.a = 20;
        this.c = o21Var;
    }

    public qa(bf.b bVar) {
        this.a = 27;
        this.b = bVar;
        this.c = "";
    }

    public qa(PhotoViewer photoViewer) {
        this.a = 18;
        this.c = photoViewer;
        this.b = new org.telegram.ui.Components.fa(photoViewer.Y, photoViewer.b0, 0, false);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void B1(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F0(org.telegram.ui.Cells.t1 t1Var, TLObject tLObject, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void G0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void H2(org.telegram.ui.Cells.t1 t1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void a1(org.telegram.ui.Cells.t1 t1Var, CharacterStyle characterStyle, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void s0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void d2(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void m(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void x0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void z0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void B2(org.telegram.ui.Cells.t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i(org.telegram.ui.Cells.t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void k2(org.telegram.ui.Cells.t1 t1Var, int i10, float f10, float f11, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void S(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void X1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
