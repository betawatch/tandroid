package ki;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.b6;
import bi.x5;
import c8.ja;
import di.tb;
import di.z6;
import hi.q4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.o4;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Cells.ca;
import org.telegram.ui.Cells.r7;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.vx0;
import org.telegram.ui.Components.z70;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.p00;
import org.telegram.ui.rv;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class k extends p00 implements is {
    public final long S;
    public FrameLayout T;
    public vg.m U;
    public LinearLayout V;
    public bi.s W;
    public z70 X;
    public boolean Z;
    public TL_payments.starRefProgram a0;
    public TL_payments.starRefProgram b0;
    public boolean e0;
    public x5 f0;
    public final d Y = new d(this, 0);
    public String[] c0 = null;
    public final List d0 = Arrays.asList(1, 3, 6, 12, 24, 36, 0);

    public k(long j3) {
        this.S = j3;
        this.N = true;
        this.M = org.telegram.messenger.g0.L(60.0f);
    }

    public static void A0(k kVar, Context context) {
        if (kVar.W.d0) {
            FrameLayout frameLayout = new FrameLayout(context);
            vx0 vx0Var = new vx0(context, kVar.resourceProvider);
            d dVar = new d(kVar, 1);
            vx0Var.c(hd.M0(2131754344, null), J0(kVar.b0.commission_permille), null, null);
            String M0 = hd.M0(2131754342, null);
            int i7 = kVar.b0.duration_months;
            vx0Var.c(M0, i7 <= 0 ? hd.M0(2131749198, null) : (i7 < 12 || i7 % 12 != 0) ? hd.G(i7, "Months", new Object[0]) : hd.G(i7 / 12, "Years", new Object[0]), null, null);
            frameLayout.addView(vx0Var, ja.d(-1, -2.0f, ns.E1, 24.0f, 0.0f, 24.0f, 0.0f));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, kVar.resourceProvider);
            String M02 = hd.M0(2131754347, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            t1Var.S = M02;
            t1Var.U = hd.M0(kVar.Z ? 2131754330 : 2131754316, null);
            alertDialog$Builder.o(frameLayout);
            alertDialog$Builder.k(hd.M0(kVar.Z ? 2131754331 : 2131754317, null), new z6(dVar, 29));
            alertDialog$Builder.h(hd.M0(2131752589, null), null);
            alertDialog$Builder.p();
        }
    }

    public static /* synthetic */ void B0(k kVar, org.telegram.ui.ActionBar.t1 t1Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        long j3 = kVar.S;
        t1Var.dismiss();
        if (!(tLObject instanceof TL_payments.starRefProgram)) {
            if (tL_error != null) {
                cc.d0(tL_error);
                return;
            }
            return;
        }
        TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) tLObject;
        TLRPC.UserFull b22 = kVar.getMessagesController().b2(j3);
        if (b22 != null) {
            b22.starref_program = starrefprogram;
            kVar.getMessagesStorage().j2(b22, false);
            ns.f(kVar.currentAccount).k(ns.E0, Long.valueOf(j3), b22);
        }
        kVar.G0(false);
    }

    public static /* synthetic */ void C0(k kVar, org.telegram.ui.ActionBar.t1 t1Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        long j3 = kVar.S;
        t1Var.dismiss();
        if (!(tLObject instanceof TL_payments.starRefProgram)) {
            if (tL_error != null) {
                cc.d0(tL_error);
                return;
            }
            return;
        }
        TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) tLObject;
        TLRPC.UserFull b22 = kVar.getMessagesController().b2(j3);
        if (b22 != null) {
            TL_payments.starRefProgram starrefprogram2 = kVar.b0;
            starrefprogram2.flags |= 2;
            starrefprogram2.end_date = kVar.getConnectionsManager().getCurrentTime() + (kVar.getConnectionsManager().isTestBackend() ? ns.X4 : 86400);
            b22.starref_program = starrefprogram;
            kVar.getMessagesStorage().j2(b22, false);
            ns.f(kVar.currentAccount).k(ns.E0, Long.valueOf(j3), b22);
        }
        kVar.G0(true);
    }

    public static void D0(k kVar, int i7) {
        x5 x5Var = kVar.f0;
        if (x5Var == null) {
            return;
        }
        int i10 = x5Var.G(i7).d;
        if (i10 != 4) {
            if (i10 == 2) {
                kVar.presentFragment(new j4(kVar.S));
                return;
            }
            return;
        }
        LinearLayout linearLayout = new LinearLayout(kVar.getParentActivity());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
        TextView textView = new TextView(kVar.getParentActivity());
        textView.setTextSize(1, 16.0f);
        int i11 = j6.G6;
        q6.U(textView, i11, kVar.resourceProvider);
        textView.setText(org.telegram.messenger.g0.X2(hd.M0(2131754322, null)));
        linearLayout.addView(textView, ja.k(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
        int i12 = 3;
        tb tbVar = new tb(kVar.getParentActivity(), i12);
        tbVar.setPadding(org.telegram.messenger.g0.L(15.0f), 0, 0, 0);
        tbVar.setTextSize(1, 16.0f);
        q6.U(tbVar, i11, kVar.resourceProvider);
        tbVar.setText(org.telegram.messenger.g0.X2(hd.M0(2131754321, null)));
        linearLayout.addView(tbVar, ja.k(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
        tb tbVar2 = new tb(kVar.getParentActivity(), i12);
        tbVar2.setPadding(org.telegram.messenger.g0.L(15.0f), 0, 0, 0);
        tbVar2.setTextSize(1, 16.0f);
        q6.U(tbVar2, i11, kVar.resourceProvider);
        tbVar2.setText(org.telegram.messenger.g0.X2(hd.M0(2131754320, null)));
        linearLayout.addView(tbVar2, ja.k(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
        tb tbVar3 = new tb(kVar.getParentActivity(), i12);
        tbVar3.setPadding(org.telegram.messenger.g0.L(15.0f), 0, 0, 0);
        tbVar3.setTextSize(1, 16.0f);
        q6.U(tbVar3, i11, kVar.resourceProvider);
        tbVar3.setText(org.telegram.messenger.g0.X2(hd.M0(2131754319, null)));
        linearLayout.addView(tbVar3, ja.k(0.0f, 0.0f, 0.0f, 10.0f, -1, -2));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, kVar.getParentActivity(), kVar.resourceProvider);
        alertDialog$Builder.a.S = hd.M0(2131754347, null);
        alertDialog$Builder.o(linearLayout);
        alertDialog$Builder.k(hd.M0(2131754323, null), new e(kVar, 0));
        alertDialog$Builder.h(hd.M0(2131752589, null), null);
        alertDialog$Builder.d(-1);
        alertDialog$Builder.p();
    }

    public static String J0(int i7) {
        float f10 = i7 / 10.0f;
        if (((int) f10) != f10) {
            return String.format(Locale.US, "%.1f%%", Float.valueOf(f10));
        }
        Locale locale = Locale.US;
        return com.google.android.gms.internal.vision.e2.i(i7 / 10, "%");
    }

    public final void G0(boolean z10) {
        org.telegram.ui.ActionBar.e2 e2Var;
        if (getParentLayout() == null || getParentLayout().getFragmentStack() == null) {
            finishFragment();
            e2Var = null;
        } else {
            o4 parentLayout = getParentLayout();
            List fragmentStack = parentLayout.getFragmentStack();
            int size = fragmentStack.size() - 1;
            while (true) {
                if (size <= 0) {
                    size = -1;
                    e2Var = null;
                    break;
                } else {
                    e2Var = (org.telegram.ui.ActionBar.e2) fragmentStack.get(size);
                    if ((e2Var instanceof ProfileActivity) && ((ProfileActivity) e2Var).a() == this.S) {
                        break;
                    } else {
                        size--;
                    }
                }
            }
            if (e2Var != null) {
                for (int size2 = fragmentStack.size() - 1; size2 > size; size2--) {
                    ((ActionBarLayout) parentLayout).d0((org.telegram.ui.ActionBar.e2) fragmentStack.get(size2), false);
                }
                finishFragment();
            } else {
                finishFragment();
                e2Var = parentLayout.getBackgroundFragment();
            }
        }
        if (e2Var != null) {
            if (z10) {
                cc.a0(e2Var).I(R.raw.linkbroken, hd.M0(2131754339, null), org.telegram.messenger.g0.X2(hd.M0(2131754340, null))).j();
            } else {
                cc.a0(e2Var).I(R.raw.contact_check, hd.M0(2131754325, null), hd.M0(2131754326, null)).j();
            }
        }
    }

    public final void H0(ArrayList arrayList, p41 p41Var) {
        if (getParentActivity() == null) {
            return;
        }
        rv rvVar = (rv) super.o0(getParentActivity());
        b41 b41Var = new b41(-2);
        b41Var.c = rvVar;
        arrayList.add(b41Var);
        arrayList.add(i.i(R.drawable.menu_feature_premium, hd.M0(2131753151, null), hd.M0(2131753152, null)));
        arrayList.add(i.i(R.drawable.msg_channel, hd.M0(2131753149, null), hd.M0(2131753150, null)));
        arrayList.add(i.i(R.drawable.menu_feature_links2, hd.M0(2131753147, null), hd.M0(2131753148, null)));
        arrayList.add(b41.B(1, null));
        arrayList.add(b41.u(hd.M0(2131754344, null)));
        int i7 = getMessagesController().i6;
        int i10 = this.b0.commission_permille;
        int i11 = getMessagesController().j6;
        int i12 = 2;
        ci.x xVar = new ci.x(i12);
        a aVar = new a(this, 1);
        b41 b41Var2 = new b41(15);
        b41Var2.z = i10;
        b41Var2.C = aVar;
        r7 r7Var = new r7();
        r7Var.a = i7;
        r7Var.b = i11;
        r7Var.e = new ca(xVar, 7);
        b41Var2.G = r7Var;
        b41Var2.B = -1L;
        b41Var2.B = this.a0 == null ? -1 : r4.commission_permille;
        arrayList.add(b41Var2);
        arrayList.add(b41.C(hd.M0(2131754343, null)));
        arrayList.add(b41.u(hd.M0(2131754342, null)));
        String[] strArr = this.c0;
        List list = this.d0;
        if (strArr == null) {
            this.c0 = new String[list.size()];
            for (int i13 = 0; i13 < list.size(); i13++) {
                int intValue = ((Integer) list.get(i13)).intValue();
                if (intValue == 0) {
                    this.c0[i13] = hd.M0(2131749198, null);
                } else if (intValue < 12 || intValue % 12 != 0) {
                    this.c0[i13] = hd.G(intValue, "MonthsShort", new Object[0]);
                } else {
                    this.c0[i13] = hd.G(intValue / 12, "YearsShort", new Object[0]);
                }
            }
        }
        String[] strArr2 = this.c0;
        int indexOf = list.indexOf(Integer.valueOf(this.b0.duration_months));
        a aVar2 = new a(this, i12);
        b41 b41Var3 = new b41(14);
        b41Var3.p = strArr2;
        b41Var3.z = indexOf;
        b41Var3.C = aVar2;
        b41Var3.B = -1L;
        TL_payments.starRefProgram starrefprogram = this.a0;
        if (starrefprogram != null) {
            if (starrefprogram.duration_months > 0) {
                int size = list.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    if (((Integer) list.get(size)).intValue() > 0 && ((Integer) list.get(size)).intValue() <= this.a0.duration_months) {
                        b41Var3.B = size;
                        break;
                    }
                    size--;
                }
            } else {
                b41Var3.B = list.size() - 1;
            }
        }
        arrayList.add(b41Var3);
        arrayList.add(b41.C(hd.M0(2131754341, null)));
        arrayList.add(g.i(2, getThemedColor(j6.lk), hd.M0(2131754337, null), hd.M0(2131754338, null)));
        arrayList.add(b41.B(3, null));
        if (!this.Z && this.b0.end_date == 0) {
            b41 e10 = b41.e(4, hd.M0(2131754324, null));
            e10.r = true;
            arrayList.add(e10);
            arrayList.add(b41.B(5, null));
        }
        arrayList.add(b41.B(6, null));
        arrayList.add(b41.B(7, null));
    }

    public final TL_payments.starRefProgram I0() {
        TL_payments.starRefProgram starrefprogram = new TL_payments.starRefProgram();
        starrefprogram.commission_permille = Utilities.j(50, getMessagesController().j6, getMessagesController().i6);
        starrefprogram.duration_months = 1;
        return starrefprogram;
    }

    public final void K0(boolean z10) {
        this.W.i(hd.M0((this.Z || this.b0.end_date != 0) ? 2131754332 : 2131754318, null), z10, true);
        d dVar = this.Y;
        org.telegram.messenger.g0.r(dVar);
        dVar.run();
        this.X.setText(org.telegram.messenger.g0.U2(hd.M0((this.Z || this.b0.end_date != 0) ? 2131754328 : 2131754315, null), new d(this, 2)));
        L0();
        x5 x5Var = this.f0;
        if (x5Var != null) {
            x5Var.O(z10);
        }
    }

    public final void L0() {
        TL_payments.starRefProgram starrefprogram;
        bi.s sVar = this.W;
        TL_payments.starRefProgram starrefprogram2 = this.b0;
        sVar.setEnabled(starrefprogram2.end_date == 0 && !((starrefprogram = this.a0) != null && starrefprogram.commission_permille == starrefprogram2.commission_permille && starrefprogram.duration_months == starrefprogram2.duration_months));
    }

    @Override // org.telegram.ui.p00, org.telegram.ui.ActionBar.e2
    public final View createView(Context context) {
        this.H = false;
        this.F = org.telegram.messenger.g0.L(238.0f);
        q6.h(j6.i5, new bi.o2(7, context, this), null);
        super.createView(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.T = frameLayout;
        frameLayout.setClickable(true);
        vg.m mVar = new vg.m(context, 1, 3);
        this.U = mVar;
        vg.f fVar = mVar.b;
        fVar.z = j6.Wk;
        fVar.A = j6.Xk;
        fVar.b();
        this.U.setStarParticlesView(this.e);
        this.T.addView(this.U, ja.d(ns.U2, 190.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        j0(hd.M0(2131753143, null), hd.M0(2131753144, null), this.T, null);
        LinearLayout linearLayout = new LinearLayout(context);
        this.V = linearLayout;
        linearLayout.setOrientation(1);
        q6.h(j6.d6, this.V, getResourceProvider());
        View view = new View(context);
        q6.h(j6.d7, view, getResourceProvider());
        this.V.addView(view, new LinearLayout.LayoutParams(ja.z(-1.0f), ja.z(1.0f / org.telegram.messenger.g0.p)));
        bi.s sVar = new bi.s(3, context, this.resourceProvider, true);
        sVar.setRoundRadius(24);
        this.W = sVar;
        sVar.i(hd.M0(2131754332, null), false, true);
        this.W.setOnClickListener(new ai.v2(25, this, context));
        this.V.addView(this.W, ja.k(10.0f, 10.0f, 10.0f, 7.0f, -1, 48));
        z70 z70Var = new z70(context, this.resourceProvider);
        this.X = z70Var;
        q6.U(z70Var, j6.z6, getResourceProvider());
        q6.G(this.X, j6.Xc, getResourceProvider());
        this.X.setTextSize(1, 12.0f);
        this.X.setGravity(17);
        this.V.addView(this.X, ja.k(32.0f, 1.0f, 32.0f, 8.0f, -1, -2));
        K0(false);
        ((FrameLayout) this.fragmentView).addView(this.V, ja.e(-1, -2, 87));
        this.c.setPadding(0, 0, 0, org.telegram.messenger.g0.L(84.0f));
        this.c.setOnItemClickListener(new b6(this, 17));
        v4.k kVar = new v4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(er.h);
        kVar.n(350L);
        this.c.setItemAnimator(kVar);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final int getNavigationBarColor() {
        return getThemedColor(j6.d6);
    }

    @Override // org.telegram.ui.p00
    public final v4.h0 k0() {
        x5 x5Var = new x5(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new q4(this, 16), getResourceProvider(), 4);
        this.f0 = x5Var;
        return x5Var;
    }

    @Override // org.telegram.ui.p00
    public final ug.s1 m0() {
        f fVar = new f(getParentActivity(), 0);
        fVar.c();
        return fVar;
    }

    @Override // org.telegram.ui.p00
    public final View o0(Context context) {
        throw null;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onFragmentCreate() {
        this.e0 = true;
        this.Z = true;
        this.b0 = I0();
        this.a0 = null;
        np messagesController = getMessagesController();
        long j3 = this.S;
        TLRPC.UserFull b22 = messagesController.b2(j3);
        if (b22 != null) {
            this.Z = false;
            TL_payments.starRefProgram starrefprogram = b22.starref_program;
            this.b0 = starrefprogram;
            if (starrefprogram == null) {
                this.Z = true;
                this.b0 = I0();
                this.a0 = null;
            } else {
                TL_payments.starRefProgram starrefprogram2 = new TL_payments.starRefProgram();
                this.a0 = starrefprogram2;
                TL_payments.starRefProgram starrefprogram3 = this.b0;
                starrefprogram2.commission_permille = starrefprogram3.commission_permille;
                starrefprogram2.duration_months = starrefprogram3.duration_months;
            }
        } else {
            TLRPC.User a22 = getMessagesController().a2(Long.valueOf(j3));
            if (a22 != null) {
                getMessagesController().W2(a22, getClassGuid(), true, new a(this, 0));
            }
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onFragmentDestroy() {
        this.e0 = false;
        org.telegram.messenger.g0.r(this.Y);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.p00, org.telegram.ui.ActionBar.e2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.c.setPadding(0, 0, 0, org.telegram.messenger.g0.L(84.0f) + i12);
        this.c.setClipToPadding(false);
        this.V.setPadding(0, 0, 0, i12);
    }

    @Override // org.telegram.ui.p00, org.telegram.ui.ActionBar.e2
    public final void onPause() {
        super.onPause();
        vg.m mVar = this.U;
        if (mVar != null) {
            mVar.setPaused(true);
            this.U.setDialogVisible(true);
        }
    }

    @Override // org.telegram.ui.p00, org.telegram.ui.ActionBar.e2
    public final void onResume() {
        super.onResume();
        vg.m mVar = this.U;
        if (mVar != null) {
            mVar.setPaused(false);
            this.U.setDialogVisible(false);
        }
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
    }
}
