package ki;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.e8;
import bi.i8;
import c8.ma;
import di.xb;
import hi.e7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.s4;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.da;
import org.telegram.ui.Cells.s7;
import org.telegram.ui.Components.cy0;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.z41;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.s00;
import org.telegram.ui.uv;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class k extends s00 implements fs {
    public final long S;
    public FrameLayout T;
    public vg.m U;
    public LinearLayout V;
    public bi.s W;
    public k80 X;
    public boolean Z;
    public TL_payments.starRefProgram a0;
    public TL_payments.starRefProgram b0;
    public boolean e0;
    public e8 f0;
    public final d Y = new d(this, 0);
    public String[] c0 = null;
    public final List d0 = Arrays.asList(1, 3, 6, 12, 24, 36, 0);

    public k(long j3) {
        this.S = j3;
        this.N = true;
        this.M = org.telegram.messenger.g0.L(60.0f);
    }

    public static void A0(k kVar, Context context) {
        if (kVar.W.e0) {
            FrameLayout frameLayout = new FrameLayout(context);
            cy0 cy0Var = new cy0(context, kVar.resourceProvider);
            d dVar = new d(kVar, 1);
            cy0Var.e(gd.M0(2131754342, null), J0(kVar.b0.commission_permille), null, null);
            String M0 = gd.M0(2131754340, null);
            int i7 = kVar.b0.duration_months;
            int i10 = 0;
            cy0Var.e(M0, i7 <= 0 ? gd.M0(2131749006, null) : (i7 < 12 || i7 % 12 != 0) ? gd.G(i7, "Months", new Object[0]) : gd.G(i7 / 12, "Years", new Object[0]), null, null);
            frameLayout.addView(cy0Var, ma.d(-1, -2.0f, ks.E1, 24.0f, 0.0f, 24.0f, 0.0f));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, kVar.resourceProvider);
            String M02 = gd.M0(2131754345, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.S = M02;
            u1Var.U = gd.M0(kVar.Z ? 2131754328 : 2131754314, null);
            alertDialog$Builder.o(frameLayout);
            alertDialog$Builder.k(gd.M0(kVar.Z ? 2131754329 : 2131754315, null), new e(dVar, i10));
            alertDialog$Builder.h(gd.M0(2131752578, null), null);
            alertDialog$Builder.p();
        }
    }

    public static /* synthetic */ void B0(k kVar, org.telegram.ui.ActionBar.u1 u1Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        long j3 = kVar.S;
        u1Var.dismiss();
        if (!(tLObject instanceof TL_payments.starRefProgram)) {
            if (tL_error != null) {
                lc.e0(tL_error);
                return;
            }
            return;
        }
        TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) tLObject;
        TLRPC.UserFull d2 = kVar.getMessagesController().d2(j3);
        if (d2 != null) {
            d2.starref_program = starrefprogram;
            kVar.getMessagesStorage().j2(d2, false);
            ks.f(kVar.currentAccount).k(ks.E0, Long.valueOf(j3), d2);
        }
        kVar.G0(false);
    }

    public static /* synthetic */ void C0(k kVar, org.telegram.ui.ActionBar.u1 u1Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        long j3 = kVar.S;
        u1Var.dismiss();
        if (!(tLObject instanceof TL_payments.starRefProgram)) {
            if (tL_error != null) {
                lc.e0(tL_error);
                return;
            }
            return;
        }
        TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) tLObject;
        TLRPC.UserFull d2 = kVar.getMessagesController().d2(j3);
        if (d2 != null) {
            TL_payments.starRefProgram starrefprogram2 = kVar.b0;
            starrefprogram2.flags |= 2;
            starrefprogram2.end_date = kVar.getConnectionsManager().getCurrentTime() + (kVar.getConnectionsManager().isTestBackend() ? ks.X4 : 86400);
            d2.starref_program = starrefprogram;
            kVar.getMessagesStorage().j2(d2, false);
            ks.f(kVar.currentAccount).k(ks.E0, Long.valueOf(j3), d2);
        }
        kVar.G0(true);
    }

    public static void D0(k kVar, int i7) {
        e8 e8Var = kVar.f0;
        if (e8Var == null) {
            return;
        }
        int i10 = e8Var.G(i7).d;
        if (i10 != 4) {
            if (i10 == 2) {
                kVar.presentFragment(new e4(kVar.S));
                return;
            }
            return;
        }
        LinearLayout linearLayout = new LinearLayout(kVar.getParentActivity());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
        TextView textView = new TextView(kVar.getParentActivity());
        textView.setTextSize(1, 16.0f);
        int i11 = n6.G6;
        u6.U(textView, i11, kVar.resourceProvider);
        textView.setText(org.telegram.messenger.g0.W2(gd.M0(2131754320, null)));
        linearLayout.addView(textView, ma.k(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
        int i12 = 3;
        xb xbVar = new xb(kVar.getParentActivity(), i12);
        xbVar.setPadding(org.telegram.messenger.g0.L(15.0f), 0, 0, 0);
        xbVar.setTextSize(1, 16.0f);
        u6.U(xbVar, i11, kVar.resourceProvider);
        xbVar.setText(org.telegram.messenger.g0.W2(gd.M0(2131754319, null)));
        linearLayout.addView(xbVar, ma.k(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
        xb xbVar2 = new xb(kVar.getParentActivity(), i12);
        xbVar2.setPadding(org.telegram.messenger.g0.L(15.0f), 0, 0, 0);
        xbVar2.setTextSize(1, 16.0f);
        u6.U(xbVar2, i11, kVar.resourceProvider);
        xbVar2.setText(org.telegram.messenger.g0.W2(gd.M0(2131754318, null)));
        linearLayout.addView(xbVar2, ma.k(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
        xb xbVar3 = new xb(kVar.getParentActivity(), i12);
        xbVar3.setPadding(org.telegram.messenger.g0.L(15.0f), 0, 0, 0);
        xbVar3.setTextSize(1, 16.0f);
        u6.U(xbVar3, i11, kVar.resourceProvider);
        xbVar3.setText(org.telegram.messenger.g0.W2(gd.M0(2131754317, null)));
        linearLayout.addView(xbVar3, ma.k(0.0f, 0.0f, 0.0f, 10.0f, -1, -2));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, kVar.getParentActivity(), kVar.resourceProvider);
        alertDialog$Builder.a.S = gd.M0(2131754345, null);
        alertDialog$Builder.o(linearLayout);
        alertDialog$Builder.k(gd.M0(2131754321, null), new e(kVar, 1));
        alertDialog$Builder.h(gd.M0(2131752578, null), null);
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
        org.telegram.ui.ActionBar.h2 h2Var;
        if (getParentLayout() == null || getParentLayout().getFragmentStack() == null) {
            finishFragment();
            h2Var = null;
        } else {
            s4 parentLayout = getParentLayout();
            List fragmentStack = parentLayout.getFragmentStack();
            int size = fragmentStack.size() - 1;
            while (true) {
                if (size <= 0) {
                    size = -1;
                    h2Var = null;
                    break;
                } else {
                    h2Var = (org.telegram.ui.ActionBar.h2) fragmentStack.get(size);
                    if ((h2Var instanceof ProfileActivity) && ((ProfileActivity) h2Var).a() == this.S) {
                        break;
                    } else {
                        size--;
                    }
                }
            }
            if (h2Var != null) {
                for (int size2 = fragmentStack.size() - 1; size2 > size; size2--) {
                    ((ActionBarLayout) parentLayout).d0((org.telegram.ui.ActionBar.h2) fragmentStack.get(size2), false);
                }
                finishFragment();
            } else {
                finishFragment();
                h2Var = parentLayout.getBackgroundFragment();
            }
        }
        if (h2Var != null) {
            if (z10) {
                lc.b0(h2Var).I(R.raw.linkbroken, gd.M0(2131754337, null), org.telegram.messenger.g0.W2(gd.M0(2131754338, null))).j();
            } else {
                lc.b0(h2Var).I(R.raw.contact_check, gd.M0(2131754323, null), gd.M0(2131754324, null)).j();
            }
        }
    }

    public final void H0(ArrayList arrayList, z41 z41Var) {
        if (getParentActivity() == null) {
            return;
        }
        uv uvVar = (uv) super.o0(getParentActivity());
        l41 l41Var = new l41(-2);
        l41Var.c = uvVar;
        arrayList.add(l41Var);
        arrayList.add(i.i(R.drawable.menu_feature_premium, gd.M0(2131753149, null), gd.M0(2131753150, null)));
        arrayList.add(i.i(R.drawable.msg_channel, gd.M0(2131753147, null), gd.M0(2131753148, null)));
        arrayList.add(i.i(R.drawable.menu_feature_links2, gd.M0(2131753145, null), gd.M0(2131753146, null)));
        arrayList.add(l41.B(1, null));
        arrayList.add(l41.u(gd.M0(2131754342, null)));
        int i7 = getMessagesController().k6;
        int i10 = this.b0.commission_permille;
        int i11 = getMessagesController().l6;
        int i12 = 2;
        ci.y yVar = new ci.y(i12);
        a aVar = new a(this, 1);
        l41 l41Var2 = new l41(15);
        l41Var2.A = i10;
        l41Var2.D = aVar;
        s7 s7Var = new s7();
        s7Var.a = i7;
        s7Var.b = i11;
        s7Var.e = new da(yVar, 7);
        l41Var2.H = s7Var;
        l41Var2.C = -1L;
        l41Var2.C = this.a0 == null ? -1 : r4.commission_permille;
        arrayList.add(l41Var2);
        arrayList.add(l41.C(gd.M0(2131754341, null)));
        i5.c.s(2131754340, null, arrayList);
        String[] strArr = this.c0;
        List list = this.d0;
        if (strArr == null) {
            this.c0 = new String[list.size()];
            for (int i13 = 0; i13 < list.size(); i13++) {
                int intValue = ((Integer) list.get(i13)).intValue();
                if (intValue == 0) {
                    this.c0[i13] = gd.M0(2131749006, null);
                } else if (intValue < 12 || intValue % 12 != 0) {
                    this.c0[i13] = gd.G(intValue, "MonthsShort", new Object[0]);
                } else {
                    this.c0[i13] = gd.G(intValue / 12, "YearsShort", new Object[0]);
                }
            }
        }
        String[] strArr2 = this.c0;
        int indexOf = list.indexOf(Integer.valueOf(this.b0.duration_months));
        a aVar2 = new a(this, i12);
        l41 l41Var3 = new l41(14);
        l41Var3.q = strArr2;
        l41Var3.A = indexOf;
        l41Var3.D = aVar2;
        l41Var3.C = -1L;
        TL_payments.starRefProgram starrefprogram = this.a0;
        if (starrefprogram != null) {
            if (starrefprogram.duration_months > 0) {
                int size = list.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    if (((Integer) list.get(size)).intValue() > 0 && ((Integer) list.get(size)).intValue() <= this.a0.duration_months) {
                        l41Var3.C = size;
                        break;
                    }
                    size--;
                }
            } else {
                l41Var3.C = list.size() - 1;
            }
        }
        arrayList.add(l41Var3);
        arrayList.add(l41.C(gd.M0(2131754339, null)));
        arrayList.add(g.i(2, getThemedColor(n6.lk), gd.M0(2131754335, null), gd.M0(2131754336, null)));
        arrayList.add(l41.B(3, null));
        if (!this.Z && this.b0.end_date == 0) {
            l41 e10 = l41.e(4, gd.M0(2131754322, null));
            e10.s = true;
            arrayList.add(e10);
            arrayList.add(l41.B(5, null));
        }
        arrayList.add(l41.B(6, null));
        arrayList.add(l41.B(7, null));
    }

    public final TL_payments.starRefProgram I0() {
        TL_payments.starRefProgram starrefprogram = new TL_payments.starRefProgram();
        starrefprogram.commission_permille = Utilities.j(50, getMessagesController().l6, getMessagesController().k6);
        starrefprogram.duration_months = 1;
        return starrefprogram;
    }

    public final void K0(boolean z10) {
        this.W.i(gd.M0((this.Z || this.b0.end_date != 0) ? 2131754330 : 2131754316, null), z10, true);
        d dVar = this.Y;
        org.telegram.messenger.g0.r(dVar);
        dVar.run();
        this.X.setText(org.telegram.messenger.g0.T2(gd.M0((this.Z || this.b0.end_date != 0) ? 2131754326 : 2131754313, null), new d(this, 2)));
        L0();
        e8 e8Var = this.f0;
        if (e8Var != null) {
            e8Var.O(z10);
        }
    }

    public final void L0() {
        TL_payments.starRefProgram starrefprogram;
        bi.s sVar = this.W;
        TL_payments.starRefProgram starrefprogram2 = this.b0;
        sVar.setEnabled(starrefprogram2.end_date == 0 && !((starrefprogram = this.a0) != null && starrefprogram.commission_permille == starrefprogram2.commission_permille && starrefprogram.duration_months == starrefprogram2.duration_months));
    }

    @Override // org.telegram.ui.s00, org.telegram.ui.ActionBar.h2
    public final View createView(Context context) {
        this.H = false;
        this.F = org.telegram.messenger.g0.L(238.0f);
        u6.h(n6.i5, new bi.i3(7, context, this), null);
        super.createView(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.T = frameLayout;
        frameLayout.setClickable(true);
        vg.m mVar = new vg.m(context, 1, 3);
        this.U = mVar;
        vg.f fVar = mVar.b;
        fVar.z = n6.Wk;
        fVar.A = n6.Xk;
        fVar.b();
        this.U.setStarParticlesView(this.e);
        this.T.addView(this.U, ma.d(ks.U2, 190.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        j0(gd.M0(2131753141, null), gd.M0(2131753142, null), this.T, null);
        LinearLayout linearLayout = new LinearLayout(context);
        this.V = linearLayout;
        linearLayout.setOrientation(1);
        u6.h(n6.d6, this.V, getResourceProvider());
        View view = new View(context);
        u6.h(n6.d7, view, getResourceProvider());
        this.V.addView(view, new LinearLayout.LayoutParams(ma.z(-1.0f), ma.z(1.0f / org.telegram.messenger.g0.p)));
        bi.s sVar = new bi.s(3, context, this.resourceProvider, true);
        sVar.setRoundRadius(24);
        this.W = sVar;
        sVar.i(gd.M0(2131754330, null), false, true);
        this.W.setOnClickListener(new ai.v2(27, this, context));
        this.V.addView(this.W, ma.k(10.0f, 10.0f, 10.0f, 7.0f, -1, 48));
        k80 k80Var = new k80(context, this.resourceProvider);
        this.X = k80Var;
        u6.U(k80Var, n6.z6, getResourceProvider());
        u6.G(this.X, n6.Xc, getResourceProvider());
        this.X.setTextSize(1, 12.0f);
        this.X.setGravity(17);
        this.V.addView(this.X, ma.k(32.0f, 1.0f, 32.0f, 8.0f, -1, -2));
        K0(false);
        ((FrameLayout) this.fragmentView).addView(this.V, ma.e(-1, -2, 87));
        this.c.setPadding(0, 0, 0, org.telegram.messenger.g0.L(84.0f));
        this.c.setOnItemClickListener(new i8(this, 17));
        v4.k kVar = new v4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(lr.h);
        kVar.n(350L);
        this.c.setItemAnimator(kVar);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final int getNavigationBarColor() {
        return getThemedColor(n6.d6);
    }

    @Override // org.telegram.ui.s00
    public final v4.i0 k0() {
        e8 e8Var = new e8(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new e7(this, 16), getResourceProvider(), 4);
        this.f0 = e8Var;
        return e8Var;
    }

    @Override // org.telegram.ui.s00
    public final ug.u1 m0() {
        f fVar = new f(getParentActivity(), 0);
        fVar.c();
        return fVar;
    }

    @Override // org.telegram.ui.s00
    public final View o0(Context context) {
        throw null;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean onFragmentCreate() {
        this.e0 = true;
        this.Z = true;
        this.b0 = I0();
        this.a0 = null;
        mp messagesController = getMessagesController();
        long j3 = this.S;
        TLRPC.UserFull d2 = messagesController.d2(j3);
        if (d2 != null) {
            this.Z = false;
            TL_payments.starRefProgram starrefprogram = d2.starref_program;
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
            TLRPC.User c22 = getMessagesController().c2(Long.valueOf(j3));
            if (c22 != null) {
                getMessagesController().c3(c22, getClassGuid(), true, new a(this, 0));
            }
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onFragmentDestroy() {
        this.e0 = false;
        org.telegram.messenger.g0.r(this.Y);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.s00, org.telegram.ui.ActionBar.h2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.c.setPadding(0, 0, 0, org.telegram.messenger.g0.L(84.0f) + i12);
        this.c.setClipToPadding(false);
        this.V.setPadding(0, 0, 0, i12);
    }

    @Override // org.telegram.ui.s00, org.telegram.ui.ActionBar.h2
    public final void onPause() {
        super.onPause();
        vg.m mVar = this.U;
        if (mVar != null) {
            mVar.setPaused(true);
            this.U.setDialogVisible(true);
        }
    }

    @Override // org.telegram.ui.s00, org.telegram.ui.ActionBar.h2
    public final void onResume() {
        super.onResume();
        vg.m mVar = this.U;
        if (mVar != null) {
            mVar.setPaused(false);
            this.U.setDialogVisible(false);
        }
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
    }
}
