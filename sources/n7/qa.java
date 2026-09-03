package n7;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
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
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.ey0;
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.f71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.pf0;
import org.telegram.ui.Components.st;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.ut;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.b11;
import org.telegram.ui.cv0;
import org.telegram.ui.fn0;
import org.telegram.ui.gl0;
import org.telegram.ui.hv;
import org.telegram.ui.i41;
import org.telegram.ui.iv;
import org.telegram.ui.nm0;
import org.telegram.ui.pw;
import org.telegram.ui.py;
import org.telegram.ui.qy;
import org.telegram.ui.tm0;
import org.telegram.ui.u21;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public class qa implements OnCompleteListener, od.b, org.telegram.ui.ActionBar.f6, st, ph.ia, org.telegram.ui.Cells.j1, org.telegram.ui.m7, kl0, tm0, sg.a, f71, p2.a0 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ qa(int i10) {
        this.a = i10;
    }

    public static qa V(View view) {
        return new qa(view);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean B0(MessageObject messageObject) {
        return true;
    }

    @Override // ph.ia
    public void C0(float f10, boolean z4) {
        dc0 dc0Var = (dc0) this.b;
        pf0 pf0Var = (pf0) this.c;
        i71 i71Var = pf0Var.d;
        if (i71Var == null) {
            return;
        }
        float max = 2.8f / Math.max(60L, r2);
        long p10 = (long) ((((f10 / (1.0f - max)) * max) + f10) * i71Var.p());
        pf0Var.e = p10;
        pf0Var.d.L(p10, !z4);
        if (z4) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(dc0Var);
        AndroidUtilities.runOnUIThread(dc0Var, 120L);
    }

    @Override // org.telegram.ui.tm0
    public void D(String str, String str2) {
        fn0 fn0Var = ((nm0) this.c).a;
        if ("PHONE_VERIFICATION_NEEDED".equals(str)) {
            fn0Var.O1(true, str2, (gl0) this.b, this, fn0Var.y1);
        } else {
            fn0Var.N1(true, false);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ org.telegram.ui.Cells.m9 D2() {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean F1() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public Paint G(String str) {
        switch (this.a) {
            case 8:
                return org.telegram.ui.ActionBar.j6.S0(str);
            case 21:
                return org.telegram.ui.ActionBar.j6.S0(str);
            default:
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.c;
                return f6Var == null ? org.telegram.ui.ActionBar.j6.S0(str) : f6Var.G(str);
        }
    }

    @Override // sg.a
    public void H(Canvas canvas, float f10, float f11, float f12, float f13) {
        switch (this.a) {
            case 19:
                canvas.save();
                canvas.clipRect(f10, f11, f12, f13);
                ((PhotoViewer) this.c).T0(canvas, (org.telegram.ui.Components.fa) this.b, -14277082, 855638016, false, true, true);
                canvas.drawColor(637534208);
                canvas.restore();
                break;
            default:
                Paint paint = (Paint) this.b;
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.c;
                eg.q1 q1Var = premiumPreviewFragment.j0;
                if (!premiumPreviewFragment.e0) {
                    q1Var.d(0, (-premiumPreviewFragment.a0.getMeasuredWidth()) * 0.1f * premiumPreviewFragment.Y, 0, premiumPreviewFragment.a0.getMeasuredWidth(), 0.0f, premiumPreviewFragment.a0.getMeasuredHeight());
                    canvas.drawRect(f10, f11, f12, f13, q1Var.f);
                    break;
                } else {
                    paint.setColor(premiumPreviewFragment.getThemedColor(org.telegram.ui.ActionBar.j6.a7));
                    canvas.drawRect(f10, f11, f12, f13, paint);
                    break;
                }
        }
    }

    @Override // org.telegram.ui.Components.st
    public void J() {
        org.telegram.ui.Cells.e3 e3Var = (org.telegram.ui.Cells.e3) this.c;
        ((ut) this.b).getText();
        e3Var.b();
    }

    @Override // org.telegram.ui.ActionBar.f6
    public void J0(int i10, int i11) {
        switch (this.a) {
            case 8:
            case 21:
                break;
            default:
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.c;
                if (f6Var != null) {
                    f6Var.J0(i10, i11);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean K1(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat) {
        return false;
    }

    public void L0(p2.n nVar) {
        this.b = nVar;
        if (nVar.a() != null) {
            nVar.a().getClass();
            String str = nVar.a().d;
            if (str != null) {
                this.c = str;
            }
        }
    }

    public r3.v M0(int i10) {
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

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean M1() {
        return false;
    }

    public void O0(com.google.android.gms.internal.play_billing.g3 g3Var) {
        try {
            k1(g3Var, (com.google.android.gms.internal.play_billing.p3) this.b);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean P(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem, boolean z4) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean Q() {
        return false;
    }

    public void Q0(com.google.android.gms.internal.play_billing.g3 g3Var, int i10, long j10) {
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
            k1(g3Var, p3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean R(org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public boolean R0(long j10) {
        return ((f01) this.c).v;
    }

    @Override // org.telegram.ui.Cells.j1
    public void R1(org.telegram.ui.Cells.s1 s1Var, TLRPC.WebPage webPage, String str, boolean z4) {
        ze.d.s(s1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean S() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ CharacterStyle S1(org.telegram.ui.Cells.s1 s1Var) {
        return null;
    }

    public void T0(com.google.android.gms.internal.play_billing.g3 g3Var, long j10, boolean z4) {
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
            k1(g3Var2, p3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean U1(org.telegram.ui.Cells.s1 s1Var, MessageObject messageObject) {
        return false;
    }

    public void V0(com.google.android.gms.internal.play_billing.g3 g3Var, int i10, long j10, boolean z4) {
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
            k1(g3Var2, p3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ int W() {
        return 0;
    }

    public p2.d X() {
        if (((p2.n) this.b) != null) {
            return new p2.d(this);
        }
        throw new NullPointerException("ProductDetails is required for constructing ProductDetailsParams.");
    }

    public void X0(com.google.android.gms.internal.play_billing.l3 l3Var) {
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

    public void Y0(com.google.android.gms.internal.play_billing.a4 a4Var) {
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

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ ug.a Z() {
        return null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // org.telegram.ui.ActionBar.f6
    public boolean a() {
        switch (this.a) {
        }
        return org.telegram.ui.ActionBar.j6.I.q();
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean a0(org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    public void a1(com.google.android.gms.internal.play_billing.b4 b4Var) {
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

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean a2(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // sg.a
    public /* synthetic */ void b() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.kl0
    public boolean c(float f10, float f11, int i10, View view) {
        qy qyVar = (qy) this.c;
        if (view instanceof org.telegram.ui.Cells.q2) {
            org.telegram.ui.Cells.q2 q2Var = (org.telegram.ui.Cells.q2) view;
            if (q2Var.k2) {
                qyVar.N4(q2Var.getDialogId(), view);
                return true;
            }
        }
        pw pwVar = qyVar.w0;
        if (pwVar != null && pwVar.getVisibility() == 0 && qyVar.w0.n) {
            return false;
        }
        return qyVar.o4(view, i10, f10, ((py) this.b).d);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean c0(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean c1(org.telegram.ui.Cells.s1 s1Var, boolean z4) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ cv0 c2() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public int d0(int i10) {
        switch (this.a) {
            case 8:
                return x0(i10);
            case 21:
                return x0(i10);
            default:
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.c;
                return f6Var == null ? org.telegram.ui.ActionBar.j6.w0(null, i10, false) : f6Var.d0(i10);
        }
    }

    @Override // org.telegram.ui.m7
    public void dismiss() {
        ((iv) this.c).dismiss();
    }

    @Override // org.telegram.ui.Cells.j1
    public boolean e() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public boolean e2(long j10) {
        return ((f01) this.c).s;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean f() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public int f1(int i10) {
        switch (this.a) {
            case 8:
                return ((SparseIntArray) this.b).get(i10);
            case 21:
                return x0(i10);
            default:
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.c;
                return f6Var == null ? org.telegram.ui.ActionBar.j6.w0(null, i10, false) : f6Var.f1(i10);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ String g(org.telegram.ui.Cells.s1 s1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean g0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean g2(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public Drawable getDrawable(String str) {
        switch (this.a) {
            case 8:
                return null;
            case 21:
                return null;
            default:
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.c;
                return f6Var == null ? org.telegram.ui.ActionBar.j6.O0(str) : f6Var.getDrawable(str);
        }
    }

    @Override // org.telegram.ui.Components.kl0
    public void h() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((qy) this.c).finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean h1(int i10, org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    public pb.b j0() {
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

    @Override // sg.a
    public pg.b k() {
        switch (this.a) {
            case 19:
                if (Build.VERSION.SDK_INT < 29) {
                    break;
                } else {
                    pg.c cVar = new pg.c(this);
                    ((PhotoViewer) this.c).W.add(cVar);
                    break;
                }
        }
        return new pg.d(this);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ int k0(org.telegram.ui.Cells.s1 s1Var) {
        return 0;
    }

    public void k1(com.google.android.gms.internal.play_billing.g3 g3Var, com.google.android.gms.internal.play_billing.p3 p3Var) {
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

    @Override // org.telegram.ui.ActionBar.f6
    public void l(float f10, float f11, int i10, int i11) {
        switch (this.a) {
            case 8:
                org.telegram.ui.ActionBar.j6.q(f10, f11, i10, i11);
                break;
            case 21:
                org.telegram.ui.ActionBar.j6.q(f10, f11, i10, i11);
                break;
            default:
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.c;
                if (f6Var != null) {
                    f6Var.l(f10, f11, i10, i11);
                    break;
                } else {
                    org.telegram.ui.ActionBar.j6.q(f10, f11, i10, i11);
                    break;
                }
        }
    }

    public void l1(com.google.android.gms.internal.play_billing.i3 i3Var, com.google.android.gms.internal.play_billing.p3 p3Var) {
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

    @Override // org.telegram.ui.ActionBar.f6
    public boolean m0() {
        switch (this.a) {
            case 8:
                return false;
            case 21:
                return false;
            default:
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.c;
                return f6Var == null ? org.telegram.ui.ActionBar.j6.a1() : f6Var.m0();
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean m1(MessageObject messageObject) {
        return org.telegram.ui.b.a(messageObject);
    }

    public void n0(Exception exc, boolean z4) {
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

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        o8.c cVar = (o8.c) this.b;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
        synchronized (cVar.f) {
            cVar.e.remove(taskCompletionSource);
        }
    }

    @Override // org.telegram.ui.Components.f71
    public void onError(i71 i71Var, Exception exc) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
        int i10 = secretMediaViewer.Y;
        if (i10 <= 0) {
            FileLog.e(exc);
            return;
        }
        secretMediaViewer.Y = i10 - 1;
        AndroidUtilities.runOnUIThread(new b11(9, this, (File) this.b), 100L);
    }

    @Override // org.telegram.ui.Components.f71
    public /* synthetic */ void onRenderedFirstFrame(k3.a aVar) {
    }

    @Override // org.telegram.ui.Components.f71
    public void onStateChanged(boolean z4, int i10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
        i41 i41Var = secretMediaViewer.f1;
        if (secretMediaViewer.y == null || secretMediaViewer.e0 == null) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(i41Var);
        AndroidUtilities.runOnUIThread(i41Var);
        if (i10 == 4 || i10 == 1) {
            try {
                secretMediaViewer.b.getWindow().clearFlags(128);
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else {
            try {
                secretMediaViewer.b.getWindow().addFlags(128);
            } catch (Exception e6) {
                FileLog.e(e6);
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

    @Override // org.telegram.ui.Components.f71
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.f71
    public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
        org.telegram.ui.q4 q4Var = ((SecretMediaViewer) this.c).w;
        if (q4Var != null) {
            if (i12 != 90 && i12 != 270) {
                i11 = i10;
                i10 = i11;
            }
            q4Var.a(i10 == 0 ? 1.0f : (i11 * f10) / i10, i12);
        }
    }

    @Override // org.telegram.ui.Components.kl0
    public void p(float f10) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((qy) this.c).movePreviewFragment(f10);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public boolean p0() {
        return false;
    }

    public void q0(boolean z4, boolean z10, float f10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b;
        nh.w3 w3Var = (nh.w3) this.c;
        nh.i9 i9Var = w3Var.e;
        nh.i9.y1 = f10;
        nh.h9 h9Var = i9Var.w0;
        if (h9Var != null) {
            h9Var.setSpeed(f10);
        }
        nh.d4.a0(w3Var.l, z4);
        if (!z10 || actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() == null) {
            return;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
    }

    @Override // org.telegram.ui.m7
    public void r(org.telegram.ui.w6 w6Var, mh.a aVar, boolean z4) {
        iv ivVar = (iv) this.c;
        hv hvVar = ivVar.U;
        if (aVar != null) {
            ((mh.b) this.b).i(aVar);
            ivVar.b0.d();
            mh.b bVar = ivVar.d0;
            ey0[] ey0VarArr = ivVar.Y;
            org.telegram.ui.Cells.y1[] y1VarArr = ivVar.Z;
            org.telegram.ui.Cells.y1 y1Var = y1VarArr[0];
            if (y1Var != null) {
                ey0 ey0Var = ey0VarArr[0];
                boolean z10 = bVar.m;
                ey0Var.c = z10;
                y1Var.c(z10, true);
            }
            org.telegram.ui.Cells.y1 y1Var2 = y1VarArr[1];
            if (y1Var2 != null) {
                ey0 ey0Var2 = ey0VarArr[1];
                boolean z11 = bVar.n;
                ey0Var2.c = z11;
                y1Var2.c(z11, true);
            }
            org.telegram.ui.Cells.y1 y1Var3 = y1VarArr[2];
            if (y1Var3 != null) {
                ey0 ey0Var3 = ey0VarArr[2];
                boolean z12 = bVar.o;
                ey0Var3.c = z12;
                y1Var3.c(z12, true);
            }
            org.telegram.ui.Cells.y1 y1Var4 = y1VarArr[3];
            if (y1Var4 != null) {
                ey0 ey0Var4 = ey0VarArr[3];
                boolean z13 = bVar.p;
                ey0Var4.c = z13;
                y1Var4.c(z13, true);
            }
            org.telegram.ui.Cells.y1 y1Var5 = y1VarArr[4];
            if (y1Var5 != null) {
                ey0 ey0Var5 = ey0VarArr[4];
                boolean z14 = bVar.q;
                ey0Var5.c = z14;
                y1Var5.c(z14, true);
            }
            ivVar.X.a(hvVar.d(), true);
            hvVar.c(true);
        }
    }

    public void r0(o0.g gVar) {
        androidx.biometric.o oVar = (androidx.biometric.o) this.c;
        o5.i iVar = (o5.i) this.b;
        int i10 = gVar.b;
        if (i10 != 0) {
            oVar.execute(new m2.b(iVar, i10));
        } else {
            oVar.execute(new androidx.biometric.j(iVar, gVar.a, false, 26));
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean r2(org.telegram.ui.Cells.s1 s1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean t0(org.telegram.ui.Components.u5 u5Var) {
        return false;
    }

    public String toString() {
        switch (this.a) {
            case 6:
                try {
                    return j0().toString();
                } catch (ob.e unused) {
                    return "";
                }
            default:
                return super.toString();
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public String w(long j10) {
        String trim = ((EditTextBoldCursor) this.b).getText().toString().trim();
        if (trim.length() > 16) {
            trim = trim.substring(0, 16);
        }
        if (((f01) this.c).s || !TextUtils.isEmpty(trim)) {
            return trim;
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public ColorFilter x() {
        switch (this.a) {
            case 8:
                return org.telegram.ui.ActionBar.j6.v3;
            case 21:
                return org.telegram.ui.ActionBar.j6.v3;
            default:
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.c;
                return f6Var == null ? org.telegram.ui.ActionBar.j6.v3 : f6Var.x();
        }
    }

    @Override // org.telegram.ui.ActionBar.f6
    public int x0(int i10) {
        switch (this.a) {
            case 8:
                SparseIntArray sparseIntArray = (SparseIntArray) this.b;
                int indexOfKey = sparseIntArray.indexOfKey(i10);
                return indexOfKey >= 0 ? sparseIntArray.valueAt(indexOfKey) : org.telegram.ui.ActionBar.j6.w0(null, i10, false);
            case 21:
                SparseIntArray sparseIntArray2 = (SparseIntArray) this.b;
                return sparseIntArray2 != null ? sparseIntArray2.get(i10) : org.telegram.ui.ActionBar.j6.w0(null, i10, false);
            default:
                SparseIntArray sparseIntArray3 = (SparseIntArray) this.b;
                int indexOfKey2 = sparseIntArray3.indexOfKey(i10);
                if (indexOfKey2 >= 0) {
                    return sparseIntArray3.valueAt(indexOfKey2);
                }
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.c;
                return f6Var == null ? org.telegram.ui.ActionBar.j6.w0(null, i10, false) : f6Var.x0(i10);
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
    public Object z(od.c cVar, wc.c cVar2) {
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
                    k7.p7.b(obj);
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
                    k7.p7.b(obj);
                    return sc.i.a;
                }
                cVar = dVar.e;
                qaVar = dVar.d;
                k7.p7.b(obj);
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

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean z2(int i10) {
        return false;
    }

    public /* synthetic */ qa(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // org.telegram.ui.Components.f71
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
        this.b = obj;
        this.c = obj2;
    }

    public qa(Context context, com.google.android.gms.internal.play_billing.p3 p3Var) {
        this.a = 25;
        c2.u uVar = new c2.u(5);
        try {
            y2.q.b(context);
            uVar.c = y2.q.a().c(w2.a.e).a("PLAY_BILLING_LIBRARY", new v2.c("proto"), new ab.a(19));
        } catch (Throwable unused) {
            uVar.b = true;
        }
        this.c = uVar;
        this.b = p3Var;
    }

    public qa(org.telegram.ui.ActionBar.f6 f6Var) {
        this.a = 23;
        this.b = new SparseIntArray();
        this.c = f6Var;
        K();
    }

    public qa(pb.f fVar) {
        this.a = 6;
        this.b = fVar;
    }

    public qa(View view) {
        this.a = 14;
        t61 t61Var = new t61(this, view);
        this.b = t61Var;
        view.addOnLayoutChangeListener(t61Var);
    }

    public qa(pf0 pf0Var) {
        this.a = 12;
        this.c = pf0Var;
        this.b = new dc0(this, 9);
    }

    public qa(EditText editText) {
        this.a = 27;
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

    private final /* synthetic */ void Y() {
    }

    private final /* synthetic */ void h0() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void B2() {
    }

    @Override // ph.ia
    public /* synthetic */ void C1() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void E0() {
    }

    public void K() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void V1() {
    }

    @Override // ph.ia
    public /* synthetic */ void b0() {
    }

    @Override // org.telegram.ui.m7
    public void clear() {
    }

    @Override // org.telegram.ui.m7
    public void g1() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void j() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void o() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void p1() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void v2() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void A(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // ph.ia
    public /* synthetic */ void B(float f10) {
    }

    @Override // ph.ia
    public /* synthetic */ void B1(float f10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void D0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void F(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void H1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // org.telegram.ui.Cells.j1
    public void I0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void K0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void L(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void N0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void O(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void O1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // ph.ia
    public /* synthetic */ void P0(long j10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Q1(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void S0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void U(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // ph.ia
    public /* synthetic */ void W1(float f10) {
    }

    @Override // ph.ia
    public /* synthetic */ void Z0(boolean z4) {
    }

    @Override // ph.ia
    public /* synthetic */ void d(int i10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void d1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // ph.ia
    public /* synthetic */ void e0(float f10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void e1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void f0(int i10) {
    }

    @Override // ph.ia
    public /* synthetic */ void i2(long j10) {
    }

    @Override // ph.ia
    public /* synthetic */ void j1(float f10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void j2(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void l0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void n(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // ph.ia
    public /* synthetic */ void o0(boolean z4) {
    }

    @Override // org.telegram.ui.Components.f71
    public /* synthetic */ void onSeekFinished(k3.a aVar) {
    }

    @Override // org.telegram.ui.Components.f71
    public /* synthetic */ void onSeekStarted(k3.a aVar) {
    }

    @Override // org.telegram.ui.Components.f71
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void q(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void s0(String str) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void s2(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void t(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void u(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // ph.ia
    public /* synthetic */ void v(float f10) {
    }

    @Override // ph.ia
    public /* synthetic */ void v1(float f10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void y(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // ph.ia
    public /* synthetic */ void z0(float f10) {
    }

    public qa(PremiumPreviewFragment premiumPreviewFragment) {
        this.a = 20;
        this.c = premiumPreviewFragment;
        this.b = new Paint();
    }

    private final /* synthetic */ void H0(int i10, int i11) {
    }

    private final /* synthetic */ void u0(int i10, int i11) {
    }

    @Override // ph.ia
    public /* synthetic */ void A1(float f10, int i10) {
    }

    @Override // ph.ia
    public /* synthetic */ void C(long j10, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void E(org.telegram.ui.Cells.s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void I1(org.telegram.ui.Cells.s1 s1Var, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void L1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void M(org.telegram.ui.Cells.s1 s1Var, jh.f fVar) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void N(int i10, org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void U0(int i10, org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void W0(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Y1(org.telegram.ui.Cells.s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // ph.ia
    public /* synthetic */ void b2(int i10, long j10) {
    }

    @Override // ph.ia
    public /* synthetic */ void i1(float f10, int i10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void l2(org.telegram.ui.Cells.s1 s1Var, long j10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void r1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void u1(org.telegram.ui.Cells.s1 s1Var, TLRPC.Document document) {
    }

    @Override // ph.ia
    public /* synthetic */ void w0(float f10, int i10) {
    }

    public qa() {
        this.a = 4;
        this.b = new HashSet();
    }

    public qa(u21 u21Var) {
        this.a = 21;
        this.c = u21Var;
    }

    public qa(af.c cVar) {
        this.a = 28;
        this.b = cVar;
        this.c = "";
    }

    public qa(PhotoViewer photoViewer) {
        this.a = 19;
        this.c = photoViewer;
        this.b = new org.telegram.ui.Components.fa(photoViewer.Y, photoViewer.b0, 0, false);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void C2(org.telegram.ui.Cells.s1 s1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void F0(org.telegram.ui.Cells.s1 s1Var, TLObject tLObject, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void G0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void b1(org.telegram.ui.Cells.s1 s1Var, CharacterStyle characterStyle, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void i0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void v0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void z1(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void A0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Z1(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void m(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void y0(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void f2(org.telegram.ui.Cells.s1 s1Var, int i10, float f10, float f11, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void i(org.telegram.ui.Cells.s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void x2(org.telegram.ui.Cells.s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void T(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void T1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
