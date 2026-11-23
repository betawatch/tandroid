package ki;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.j8;
import bi.n8;
import c8.na;
import di.xb;
import hi.y7;
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
import org.telegram.ui.ActionBar.r4;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.ea;
import org.telegram.ui.Cells.s7;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.dy0;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.n41;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.r00;
import org.telegram.ui.tv;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class j extends r00 implements fs {
    public final long S;
    public FrameLayout T;
    public vg.m U;
    public LinearLayout V;
    public bi.s W;
    public j80 X;
    public boolean Z;
    public TL_payments.starRefProgram a0;
    public TL_payments.starRefProgram b0;
    public boolean e0;
    public j8 f0;
    public final d Y = new d(this, 0);
    public String[] c0 = null;
    public final List d0 = Arrays.asList(1, 3, 6, 12, 24, 36, 0);

    public j(long j3) {
        this.S = j3;
        this.N = true;
        this.M = org.telegram.messenger.g0.L(60.0f);
    }

    public static void A0(j jVar, Context context) {
        if (jVar.W.e0) {
            FrameLayout frameLayout = new FrameLayout(context);
            dy0 dy0Var = new dy0(context, jVar.resourceProvider);
            d dVar = new d(jVar, 1);
            dy0Var.e(gd.N0(2131754341, null), J0(jVar.b0.commission_permille), null, null);
            String N0 = gd.N0(2131754339, null);
            int i7 = jVar.b0.duration_months;
            dy0Var.e(N0, i7 <= 0 ? gd.N0(2131749005, null) : (i7 < 12 || i7 % 12 != 0) ? gd.G(i7, "Months", new Object[0]) : gd.G(i7 / 12, "Years", new Object[0]), null, null);
            frameLayout.addView(dy0Var, na.d(-1, -2.0f, ks.E1, 24.0f, 0.0f, 24.0f, 0.0f));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, jVar.resourceProvider);
            String N02 = gd.N0(2131754344, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            t1Var.S = N02;
            t1Var.U = gd.N0(jVar.Z ? 2131754327 : 2131754313, null);
            alertDialog$Builder.o(frameLayout);
            alertDialog$Builder.k(gd.N0(jVar.Z ? 2131754328 : 2131754314, null), new kg.f1(dVar, 3));
            alertDialog$Builder.h(gd.N0(2131752577, null), null);
            alertDialog$Builder.p();
        }
    }

    public static /* synthetic */ void B0(j jVar, org.telegram.ui.ActionBar.t1 t1Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        long j3 = jVar.S;
        t1Var.dismiss();
        if (!(tLObject instanceof TL_payments.starRefProgram)) {
            if (tL_error != null) {
                kc.e0(tL_error);
                return;
            }
            return;
        }
        TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) tLObject;
        TLRPC.UserFull d2 = jVar.getMessagesController().d2(j3);
        if (d2 != null) {
            d2.starref_program = starrefprogram;
            jVar.getMessagesStorage().j2(d2, false);
            ks.f(jVar.currentAccount).k(ks.E0, Long.valueOf(j3), d2);
        }
        jVar.G0(false);
    }

    public static /* synthetic */ void C0(j jVar, org.telegram.ui.ActionBar.t1 t1Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        long j3 = jVar.S;
        t1Var.dismiss();
        if (!(tLObject instanceof TL_payments.starRefProgram)) {
            if (tL_error != null) {
                kc.e0(tL_error);
                return;
            }
            return;
        }
        TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) tLObject;
        TLRPC.UserFull d2 = jVar.getMessagesController().d2(j3);
        if (d2 != null) {
            TL_payments.starRefProgram starrefprogram2 = jVar.b0;
            starrefprogram2.flags |= 2;
            starrefprogram2.end_date = jVar.getConnectionsManager().getCurrentTime() + (jVar.getConnectionsManager().isTestBackend() ? ks.X4 : 86400);
            d2.starref_program = starrefprogram;
            jVar.getMessagesStorage().j2(d2, false);
            ks.f(jVar.currentAccount).k(ks.E0, Long.valueOf(j3), d2);
        }
        jVar.G0(true);
    }

    public static void D0(j jVar, int i7) {
        j8 j8Var = jVar.f0;
        if (j8Var == null) {
            return;
        }
        int i10 = j8Var.G(i7).d;
        int i11 = 4;
        if (i10 != 4) {
            if (i10 == 2) {
                jVar.presentFragment(new e4(jVar.S));
                return;
            }
            return;
        }
        LinearLayout linearLayout = new LinearLayout(jVar.getParentActivity());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
        TextView textView = new TextView(jVar.getParentActivity());
        textView.setTextSize(1, 16.0f);
        int i12 = n6.G6;
        u6.U(textView, i12, jVar.resourceProvider);
        textView.setText(org.telegram.messenger.g0.W2(gd.N0(2131754319, null)));
        linearLayout.addView(textView, na.k(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
        int i13 = 3;
        xb xbVar = new xb(jVar.getParentActivity(), i13);
        xbVar.setPadding(org.telegram.messenger.g0.L(15.0f), 0, 0, 0);
        xbVar.setTextSize(1, 16.0f);
        u6.U(xbVar, i12, jVar.resourceProvider);
        xbVar.setText(org.telegram.messenger.g0.W2(gd.N0(2131754318, null)));
        linearLayout.addView(xbVar, na.k(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
        xb xbVar2 = new xb(jVar.getParentActivity(), i13);
        xbVar2.setPadding(org.telegram.messenger.g0.L(15.0f), 0, 0, 0);
        xbVar2.setTextSize(1, 16.0f);
        u6.U(xbVar2, i12, jVar.resourceProvider);
        xbVar2.setText(org.telegram.messenger.g0.W2(gd.N0(2131754317, null)));
        linearLayout.addView(xbVar2, na.k(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
        xb xbVar3 = new xb(jVar.getParentActivity(), i13);
        xbVar3.setPadding(org.telegram.messenger.g0.L(15.0f), 0, 0, 0);
        xbVar3.setTextSize(1, 16.0f);
        u6.U(xbVar3, i12, jVar.resourceProvider);
        xbVar3.setText(org.telegram.messenger.g0.W2(gd.N0(2131754316, null)));
        linearLayout.addView(xbVar3, na.k(0.0f, 0.0f, 0.0f, 10.0f, -1, -2));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, jVar.getParentActivity(), jVar.resourceProvider);
        alertDialog$Builder.a.S = gd.N0(2131754344, null);
        alertDialog$Builder.o(linearLayout);
        alertDialog$Builder.k(gd.N0(2131754320, null), new kg.f1(jVar, i11));
        alertDialog$Builder.h(gd.N0(2131752577, null), null);
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
        org.telegram.ui.ActionBar.g2 g2Var;
        if (getParentLayout() == null || getParentLayout().getFragmentStack() == null) {
            finishFragment();
            g2Var = null;
        } else {
            r4 parentLayout = getParentLayout();
            List fragmentStack = parentLayout.getFragmentStack();
            int size = fragmentStack.size() - 1;
            while (true) {
                if (size <= 0) {
                    size = -1;
                    g2Var = null;
                    break;
                } else {
                    g2Var = (org.telegram.ui.ActionBar.g2) fragmentStack.get(size);
                    if ((g2Var instanceof ProfileActivity) && ((ProfileActivity) g2Var).a() == this.S) {
                        break;
                    } else {
                        size--;
                    }
                }
            }
            if (g2Var != null) {
                for (int size2 = fragmentStack.size() - 1; size2 > size; size2--) {
                    ((ActionBarLayout) parentLayout).d0((org.telegram.ui.ActionBar.g2) fragmentStack.get(size2), false);
                }
                finishFragment();
            } else {
                finishFragment();
                g2Var = parentLayout.getBackgroundFragment();
            }
        }
        if (g2Var != null) {
            if (z10) {
                kc.b0(g2Var).I(R.raw.linkbroken, gd.N0(2131754336, null), org.telegram.messenger.g0.W2(gd.N0(2131754337, null))).j();
            } else {
                kc.b0(g2Var).I(R.raw.contact_check, gd.N0(2131754322, null), gd.N0(2131754323, null)).j();
            }
        }
    }

    public final void H0(ArrayList arrayList, b51 b51Var) {
        if (getParentActivity() == null) {
            return;
        }
        tv tvVar = (tv) super.o0(getParentActivity());
        n41 n41Var = new n41(-2);
        n41Var.c = tvVar;
        arrayList.add(n41Var);
        arrayList.add(h.i(R.drawable.menu_feature_premium, gd.N0(2131753148, null), gd.N0(2131753149, null)));
        arrayList.add(h.i(R.drawable.msg_channel, gd.N0(2131753146, null), gd.N0(2131753147, null)));
        arrayList.add(h.i(R.drawable.menu_feature_links2, gd.N0(2131753144, null), gd.N0(2131753145, null)));
        arrayList.add(n41.B(1, null));
        arrayList.add(n41.u(gd.N0(2131754341, null)));
        int i7 = getMessagesController().k6;
        int i10 = this.b0.commission_permille;
        int i11 = getMessagesController().l6;
        int i12 = 2;
        ci.y yVar = new ci.y(i12);
        a aVar = new a(this, 1);
        n41 n41Var2 = new n41(15);
        n41Var2.A = i10;
        n41Var2.D = aVar;
        s7 s7Var = new s7();
        s7Var.a = i7;
        s7Var.b = i11;
        s7Var.e = new ea(yVar, 7);
        n41Var2.H = s7Var;
        n41Var2.C = -1L;
        n41Var2.C = this.a0 == null ? -1 : r4.commission_permille;
        arrayList.add(n41Var2);
        arrayList.add(n41.C(gd.N0(2131754340, null)));
        i5.c.s(2131754339, null, arrayList);
        String[] strArr = this.c0;
        List list = this.d0;
        if (strArr == null) {
            this.c0 = new String[list.size()];
            for (int i13 = 0; i13 < list.size(); i13++) {
                int intValue = ((Integer) list.get(i13)).intValue();
                if (intValue == 0) {
                    this.c0[i13] = gd.N0(2131749005, null);
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
        n41 n41Var3 = new n41(14);
        n41Var3.q = strArr2;
        n41Var3.A = indexOf;
        n41Var3.D = aVar2;
        n41Var3.C = -1L;
        TL_payments.starRefProgram starrefprogram = this.a0;
        if (starrefprogram != null) {
            if (starrefprogram.duration_months > 0) {
                int size = list.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    if (((Integer) list.get(size)).intValue() > 0 && ((Integer) list.get(size)).intValue() <= this.a0.duration_months) {
                        n41Var3.C = size;
                        break;
                    }
                    size--;
                }
            } else {
                n41Var3.C = list.size() - 1;
            }
        }
        arrayList.add(n41Var3);
        arrayList.add(n41.C(gd.N0(2131754338, null)));
        arrayList.add(f.i(2, getThemedColor(n6.lk), gd.N0(2131754334, null), gd.N0(2131754335, null)));
        arrayList.add(n41.B(3, null));
        if (!this.Z && this.b0.end_date == 0) {
            n41 e10 = n41.e(4, gd.N0(2131754321, null));
            e10.s = true;
            arrayList.add(e10);
            arrayList.add(n41.B(5, null));
        }
        arrayList.add(n41.B(6, null));
        arrayList.add(n41.B(7, null));
    }

    public final TL_payments.starRefProgram I0() {
        TL_payments.starRefProgram starrefprogram = new TL_payments.starRefProgram();
        starrefprogram.commission_permille = Utilities.j(50, getMessagesController().l6, getMessagesController().k6);
        starrefprogram.duration_months = 1;
        return starrefprogram;
    }

    public final void K0(boolean z10) {
        this.W.i(gd.N0((this.Z || this.b0.end_date != 0) ? 2131754329 : 2131754315, null), z10, true);
        d dVar = this.Y;
        org.telegram.messenger.g0.r(dVar);
        dVar.run();
        this.X.setText(org.telegram.messenger.g0.T2(gd.N0((this.Z || this.b0.end_date != 0) ? 2131754325 : 2131754312, null), new d(this, 2)));
        L0();
        j8 j8Var = this.f0;
        if (j8Var != null) {
            j8Var.O(z10);
        }
    }

    public final void L0() {
        TL_payments.starRefProgram starrefprogram;
        bi.s sVar = this.W;
        TL_payments.starRefProgram starrefprogram2 = this.b0;
        sVar.setEnabled(starrefprogram2.end_date == 0 && !((starrefprogram = this.a0) != null && starrefprogram.commission_permille == starrefprogram2.commission_permille && starrefprogram.duration_months == starrefprogram2.duration_months));
    }

    @Override // org.telegram.ui.r00, org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        this.H = false;
        this.F = org.telegram.messenger.g0.L(238.0f);
        u6.h(n6.i5, new bi.o3(7, context, this), null);
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
        this.T.addView(this.U, na.d(ks.U2, 190.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        j0(gd.N0(2131753140, null), gd.N0(2131753141, null), this.T, null);
        LinearLayout linearLayout = new LinearLayout(context);
        this.V = linearLayout;
        linearLayout.setOrientation(1);
        u6.h(n6.d6, this.V, getResourceProvider());
        View view = new View(context);
        u6.h(n6.d7, view, getResourceProvider());
        this.V.addView(view, new LinearLayout.LayoutParams(na.z(-1.0f), na.z(1.0f / org.telegram.messenger.g0.p)));
        bi.s sVar = new bi.s(3, context, this.resourceProvider, true);
        sVar.setRoundRadius(24);
        this.W = sVar;
        sVar.i(gd.N0(2131754329, null), false, true);
        this.W.setOnClickListener(new ai.p2(26, this, context));
        this.V.addView(this.W, na.k(10.0f, 10.0f, 10.0f, 7.0f, -1, 48));
        j80 j80Var = new j80(context, this.resourceProvider);
        this.X = j80Var;
        u6.U(j80Var, n6.z6, getResourceProvider());
        u6.G(this.X, n6.Xc, getResourceProvider());
        this.X.setTextSize(1, 12.0f);
        this.X.setGravity(17);
        this.V.addView(this.X, na.k(32.0f, 1.0f, 32.0f, 8.0f, -1, -2));
        K0(false);
        ((FrameLayout) this.fragmentView).addView(this.V, na.e(-1, -2, 87));
        this.c.setPadding(0, 0, 0, org.telegram.messenger.g0.L(84.0f));
        this.c.setOnItemClickListener(new n8(this, 17));
        v4.l lVar = new v4.l();
        lVar.m = false;
        lVar.C = false;
        lVar.o(kr.h);
        lVar.n(350L);
        this.c.setItemAnimator(lVar);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final int getNavigationBarColor() {
        return getThemedColor(n6.d6);
    }

    @Override // org.telegram.ui.r00
    public final v4.i0 k0() {
        j8 j8Var = new j8(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new y7(this, 16), getResourceProvider(), 4);
        this.f0 = j8Var;
        return j8Var;
    }

    @Override // org.telegram.ui.r00
    public final ug.t1 m0() {
        e eVar = new e(getParentActivity(), 0);
        eVar.c();
        return eVar;
    }

    @Override // org.telegram.ui.r00
    public final View o0(Context context) {
        throw null;
    }

    @Override // org.telegram.ui.ActionBar.g2
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

    @Override // org.telegram.ui.ActionBar.g2
    public final void onFragmentDestroy() {
        this.e0 = false;
        org.telegram.messenger.g0.r(this.Y);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.r00, org.telegram.ui.ActionBar.g2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.c.setPadding(0, 0, 0, org.telegram.messenger.g0.L(84.0f) + i12);
        this.c.setClipToPadding(false);
        this.V.setPadding(0, 0, 0, i12);
    }

    @Override // org.telegram.ui.r00, org.telegram.ui.ActionBar.g2
    public final void onPause() {
        super.onPause();
        vg.m mVar = this.U;
        if (mVar != null) {
            mVar.setPaused(true);
            this.U.setDialogVisible(true);
        }
    }

    @Override // org.telegram.ui.r00, org.telegram.ui.ActionBar.g2
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
