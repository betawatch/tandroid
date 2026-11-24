// default package

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class bc extends h15 implements jm7 {
    public final long S;
    public FrameLayout T;
    public ft4 U;
    public LinearLayout V;
    public tb W;
    public l66 X;
    public boolean Z;
    public TL_payments.starRefProgram a0;
    public TL_payments.starRefProgram b0;
    public boolean e0;
    public vb f0;
    public final rb Y = new rb(this, 0);
    public String[] c0 = null;
    public final List d0 = Arrays.asList(1, 3, 6, 12, 24, 36, 0);

    public bc(long j) {
        this.S = j;
        this.N = true;
        this.M = gm.L(60.0f);
    }

    public static String J0(int i) {
        float f = i / 10.0f;
        if (((int) f) != f) {
            return String.format(Locale.US, "%.1f%%", Float.valueOf(f));
        }
        Locale locale = Locale.US;
        return aq1.n(i / 10, "%");
    }

    public final void C0(boolean z) {
        d dVar;
        if (getParentLayout() == null || getParentLayout().getFragmentStack() == null) {
            finishFragment();
            dVar = null;
        } else {
            tk5 parentLayout = getParentLayout();
            List fragmentStack = parentLayout.getFragmentStack();
            int size = fragmentStack.size() - 1;
            while (true) {
                if (size <= 0) {
                    size = -1;
                    dVar = null;
                    break;
                } else {
                    dVar = (d) fragmentStack.get(size);
                    if ((dVar instanceof ProfileActivity) && ((ProfileActivity) dVar).a() == this.S) {
                        break;
                    } else {
                        size--;
                    }
                }
            }
            if (dVar != null) {
                for (int size2 = fragmentStack.size() - 1; size2 > size; size2--) {
                    ((ActionBarLayout) parentLayout).c0((d) fragmentStack.get(size2), false);
                }
                finishFragment();
            } else {
                finishFragment();
                dVar = parentLayout.getBackgroundFragment();
            }
        }
        if (dVar != null) {
            if (z) {
                c41.b0(dVar).I(R.raw.linkbroken, jb6.M0(2131754336, null), gm.S2(jb6.M0(2131754337, null))).j();
            } else {
                c41.b0(dVar).I(R.raw.contact_check, jb6.M0(2131754322, null), jb6.M0(2131754323, null)).j();
            }
        }
    }

    public final void D0(ArrayList arrayList, l7c l7cVar) {
        if (getParentActivity() == null) {
            return;
        }
        sb sbVar = (sb) super.o0(getParentActivity());
        c6c c6cVar = new c6c(-2);
        c6cVar.c = sbVar;
        arrayList.add(c6cVar);
        arrayList.add(zb.i(R.drawable.menu_feature_premium, jb6.M0(2131753116, null), jb6.M0(2131753117, null)));
        arrayList.add(zb.i(R.drawable.msg_channel, jb6.M0(2131753114, null), jb6.M0(2131753115, null)));
        arrayList.add(zb.i(R.drawable.menu_feature_links2, jb6.M0(2131753112, null), jb6.M0(2131753113, null)));
        arrayList.add(c6c.B(1, null));
        arrayList.add(c6c.u(jb6.M0(2131754341, null)));
        int f = getMessagesController().l4.D2.f();
        int i = this.b0.commission_permille;
        int f2 = getMessagesController().l4.E2.f();
        pb pbVar = new pb((byte) 0);
        nb nbVar = new nb(this, (byte) 1);
        c6c c6cVar2 = new c6c(15);
        c6cVar2.A = i;
        c6cVar2.D = nbVar;
        ila ilaVar = new ila();
        ilaVar.a = f;
        ilaVar.b = f2;
        ilaVar.e = new yf9(pbVar, (byte) 23);
        c6cVar2.H = ilaVar;
        c6cVar2.C = -1L;
        c6cVar2.C = this.a0 == null ? -1 : r3.commission_permille;
        arrayList.add(c6cVar2);
        arrayList.add(c6c.C(jb6.M0(2131754340, null)));
        aq1.o(2131754339, null, arrayList);
        String[] strArr = this.c0;
        List list = this.d0;
        if (strArr == null) {
            this.c0 = new String[list.size()];
            for (int i2 = 0; i2 < list.size(); i2++) {
                int intValue = ((Integer) list.get(i2)).intValue();
                if (intValue == 0) {
                    this.c0[i2] = jb6.M0(2131748955, null);
                } else if (intValue < 12 || intValue % 12 != 0) {
                    this.c0[i2] = jb6.G(intValue, "MonthsShort", new Object[0]);
                } else {
                    this.c0[i2] = jb6.G(intValue / 12, "YearsShort", new Object[0]);
                }
            }
        }
        String[] strArr2 = this.c0;
        int indexOf = list.indexOf(Integer.valueOf(this.b0.duration_months));
        nb nbVar2 = new nb(this, (byte) 2);
        c6c c6cVar3 = new c6c(14);
        c6cVar3.q = strArr2;
        c6cVar3.A = indexOf;
        c6cVar3.D = nbVar2;
        c6cVar3.C = -1L;
        TL_payments.starRefProgram starrefprogram = this.a0;
        if (starrefprogram != null) {
            if (starrefprogram.duration_months > 0) {
                int size = list.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    if (((Integer) list.get(size)).intValue() > 0 && ((Integer) list.get(size)).intValue() <= this.a0.duration_months) {
                        c6cVar3.C = size;
                        break;
                    }
                    size--;
                }
            } else {
                c6cVar3.C = list.size() - 1;
            }
        }
        arrayList.add(c6cVar3);
        arrayList.add(c6c.C(jb6.M0(2131754338, null)));
        arrayList.add(xb.i(2, getThemedColor(cmb.kk), jb6.M0(2131754334, null), jb6.M0(2131754335, null)));
        arrayList.add(c6c.B(3, null));
        if (!this.Z && this.b0.end_date == 0) {
            c6c e = c6c.e(4, jb6.M0(2131754321, null));
            e.s = true;
            arrayList.add(e);
            arrayList.add(c6c.B(5, null));
        }
        arrayList.add(c6c.B(6, null));
        arrayList.add(c6c.B(7, null));
    }

    public final TL_payments.starRefProgram E0() {
        TL_payments.starRefProgram starrefprogram = new TL_payments.starRefProgram();
        starrefprogram.commission_permille = Utilities.j(50, getMessagesController().l4.E2.f(), getMessagesController().l4.D2.f());
        starrefprogram.duration_months = 1;
        return starrefprogram;
    }

    public final /* synthetic */ void F0(he heVar, TLObject tLObject, TLRPC.TL_error tL_error) {
        heVar.dismiss();
        if (!(tLObject instanceof TL_payments.starRefProgram)) {
            if (tL_error != null) {
                c41.e0(tL_error);
                return;
            }
            return;
        }
        TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) tLObject;
        oc7 messagesController = getMessagesController();
        long j = this.S;
        TLRPC.UserFull X1 = messagesController.X1(j);
        if (X1 != null) {
            X1.starref_program = starrefprogram;
            getMessagesStorage().g2(X1, false);
            nm7.f(this.currentAccount).k(nm7.E0, Long.valueOf(j), X1);
        }
        C0(false);
    }

    public final void G0(Context context) {
        if (this.W.e0) {
            FrameLayout frameLayout = new FrameLayout(context);
            mhb mhbVar = new mhb(context, this.resourceProvider);
            rb rbVar = new rb(this, (byte) 1);
            mhbVar.f(jb6.M0(2131754341, null), J0(this.b0.commission_permille), null, null);
            String M0 = jb6.M0(2131754339, null);
            int i = this.b0.duration_months;
            mhbVar.f(M0, i <= 0 ? jb6.M0(2131748955, null) : (i < 12 || i % 12 != 0) ? jb6.G(i, "Months", new Object[0]) : jb6.G(i / 12, "Years", new Object[0]), null, null);
            frameLayout.addView(mhbVar, qoe.d(-1, -2.0f, nm7.D1, 24.0f, 0.0f, 24.0f, 0.0f));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.resourceProvider, context);
            String M02 = jb6.M0(2131754344, null);
            he heVar = alertDialog$Builder.a;
            heVar.S = M02;
            heVar.U = jb6.M0(this.Z ? 2131754327 : 2131754313, null);
            alertDialog$Builder.n(frameLayout);
            alertDialog$Builder.j(jb6.M0(this.Z ? 2131754328 : 2131754314, null), new l0(rbVar, (byte) 6));
            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
            alertDialog$Builder.o();
        }
    }

    public final void H0(int i) {
        vb vbVar = this.f0;
        if (vbVar != null) {
            int i2 = vbVar.G(i).d;
            if (i2 != 4) {
                if (i2 == 2) {
                    presentFragment(new hdb(this.S));
                    return;
                }
                return;
            }
            LinearLayout linearLayout = new LinearLayout(getParentActivity());
            linearLayout.setOrientation(1);
            linearLayout.setPadding(gm.L(24.0f), 0, gm.L(24.0f), 0);
            TextView textView = new TextView(getParentActivity());
            textView.setTextSize(1, 16.0f);
            int i3 = cmb.F6;
            anb.X(textView, i3, this.resourceProvider);
            textView.setText(gm.S2(jb6.M0(2131754319, null)));
            linearLayout.addView(textView, qoe.k(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
            wb wbVar = new wb(getParentActivity(), (byte) 0);
            wbVar.setPadding(gm.L(15.0f), 0, 0, 0);
            wbVar.setTextSize(1, 16.0f);
            anb.X(wbVar, i3, this.resourceProvider);
            wbVar.setText(gm.S2(jb6.M0(2131754318, null)));
            linearLayout.addView(wbVar, qoe.k(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
            wb wbVar2 = new wb(getParentActivity(), (byte) 0);
            wbVar2.setPadding(gm.L(15.0f), 0, 0, 0);
            wbVar2.setTextSize(1, 16.0f);
            anb.X(wbVar2, i3, this.resourceProvider);
            wbVar2.setText(gm.S2(jb6.M0(2131754317, null)));
            linearLayout.addView(wbVar2, qoe.k(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
            wb wbVar3 = new wb(getParentActivity(), (byte) 0);
            wbVar3.setPadding(gm.L(15.0f), 0, 0, 0);
            wbVar3.setTextSize(1, 16.0f);
            anb.X(wbVar3, i3, this.resourceProvider);
            wbVar3.setText(gm.S2(jb6.M0(2131754316, null)));
            linearLayout.addView(wbVar3, qoe.k(0.0f, 0.0f, 0.0f, 10.0f, -1, -2));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.resourceProvider, getParentActivity());
            alertDialog$Builder.a.S = jb6.M0(2131754344, null);
            alertDialog$Builder.n(linearLayout);
            alertDialog$Builder.j(jb6.M0(2131754320, null), new l0(this, (byte) 7));
            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
            alertDialog$Builder.c(-1);
            alertDialog$Builder.o();
        }
    }

    public final /* synthetic */ void I0(he heVar, TLObject tLObject, TLRPC.TL_error tL_error) {
        heVar.dismiss();
        if (!(tLObject instanceof TL_payments.starRefProgram)) {
            if (tL_error != null) {
                c41.e0(tL_error);
                return;
            }
            return;
        }
        TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) tLObject;
        oc7 messagesController = getMessagesController();
        long j = this.S;
        TLRPC.UserFull X1 = messagesController.X1(j);
        if (X1 != null) {
            TL_payments.starRefProgram starrefprogram2 = this.b0;
            starrefprogram2.flags |= 2;
            starrefprogram2.end_date = getConnectionsManager().getCurrentTime() + (getConnectionsManager().isTestBackend() ? nm7.W4 : 86400);
            X1.starref_program = starrefprogram;
            getMessagesStorage().g2(X1, false);
            nm7.f(this.currentAccount).k(nm7.E0, Long.valueOf(j), X1);
        }
        C0(true);
    }

    public final void K0(boolean z) {
        this.W.i(jb6.M0((this.Z || this.b0.end_date != 0) ? 2131754329 : 2131754315, null), z, true);
        rb rbVar = this.Y;
        gm.r(rbVar);
        rbVar.run();
        this.X.setText(gm.N2(jb6.M0((this.Z || this.b0.end_date != 0) ? 2131754325 : 2131754312, null), -1, 0, new rb(this, (byte) 2), null));
        L0();
        vb vbVar = this.f0;
        if (vbVar != null) {
            vbVar.O(z);
        }
    }

    public final void L0() {
        TL_payments.starRefProgram starrefprogram;
        tb tbVar = this.W;
        TL_payments.starRefProgram starrefprogram2 = this.b0;
        tbVar.setEnabled(starrefprogram2.end_date == 0 && !((starrefprogram = this.a0) != null && starrefprogram.commission_permille == starrefprogram2.commission_permille && starrefprogram.duration_months == starrefprogram2.duration_months));
    }

    @Override // h15, org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        byte b = 0;
        this.H = false;
        this.F = gm.L(238.0f);
        anb.h(cmb.h5, null, new sb(b, context, this));
        super.createView(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.T = frameLayout;
        frameLayout.setClickable(true);
        ft4 ft4Var = new ft4(context, 1, 3);
        this.U = ft4Var;
        vs4 vs4Var = ft4Var.b;
        vs4Var.z = cmb.Vk;
        vs4Var.A = cmb.Wk;
        vs4Var.b();
        this.U.setStarParticlesView(this.e);
        this.T.addView(this.U, qoe.d(nm7.T2, 190.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        j0(jb6.M0(2131753108, null), jb6.M0(2131753109, null), this.T, null);
        LinearLayout linearLayout = new LinearLayout(context);
        this.V = linearLayout;
        linearLayout.setOrientation(1);
        anb.h(cmb.c6, getResourceProvider(), this.V);
        View view = new View(context);
        anb.h(cmb.c7, getResourceProvider(), view);
        this.V.addView(view, new LinearLayout.LayoutParams(qoe.z(-1.0f), qoe.z(1.0f / gm.p)));
        tb tbVar = new tb(context, true, this.resourceProvider, b);
        tbVar.setRoundRadius(24);
        this.W = tbVar;
        tbVar.i(jb6.M0(2131754329, null), false, true);
        this.W.setOnClickListener(new t(this, context, (byte) 7));
        this.V.addView(this.W, qoe.k(10.0f, 10.0f, 10.0f, 7.0f, -1, 48));
        l66 l66Var = new l66(context, this.resourceProvider);
        this.X = l66Var;
        anb.X(l66Var, cmb.y6, getResourceProvider());
        anb.G(this.X, cmb.Wc, getResourceProvider());
        this.X.setTextSize(1, 12.0f);
        this.X.setGravity(17);
        this.V.addView(this.X, qoe.k(32.0f, 1.0f, 32.0f, 8.0f, -1, -2));
        K0(false);
        ((FrameLayout) this.fragmentView).addView(this.V, qoe.e(-1, -2, 87));
        this.c.setPadding(0, 0, 0, gm.L(84.0f));
        this.c.setOnItemClickListener(new u(this, (byte) 2));
        sc3 sc3Var = new sc3();
        sc3Var.m = false;
        sc3Var.C = false;
        sc3Var.o(d53.h);
        sc3Var.n(350L);
        this.c.setItemAnimator(sc3Var);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final int getNavigationBarColor() {
        return getThemedColor(cmb.c6);
    }

    @Override // h15
    public final y59 k0() {
        vb vbVar = new vb(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new f(this, (byte) 7), getResourceProvider(), (byte) 0);
        this.f0 = vbVar;
        return vbVar;
    }

    @Override // h15
    public final dta m0() {
        ub ubVar = new ub(getParentActivity(), (byte) 0);
        ubVar.c();
        return ubVar;
    }

    @Override // h15
    public final View o0(Context context) {
        throw null;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        this.e0 = true;
        this.Z = true;
        this.b0 = E0();
        this.a0 = null;
        oc7 messagesController = getMessagesController();
        long j = this.S;
        TLRPC.UserFull X1 = messagesController.X1(j);
        byte b = 0;
        if (X1 != null) {
            this.Z = false;
            TL_payments.starRefProgram starrefprogram = X1.starref_program;
            this.b0 = starrefprogram;
            if (starrefprogram == null) {
                this.Z = true;
                this.b0 = E0();
                this.a0 = null;
            } else {
                TL_payments.starRefProgram starrefprogram2 = new TL_payments.starRefProgram();
                this.a0 = starrefprogram2;
                TL_payments.starRefProgram starrefprogram3 = this.b0;
                starrefprogram2.commission_permille = starrefprogram3.commission_permille;
                starrefprogram2.duration_months = starrefprogram3.duration_months;
            }
        } else {
            TLRPC.User W1 = getMessagesController().W1(Long.valueOf(j));
            if (W1 != null) {
                getMessagesController().b3(W1, getClassGuid(), true, new nb(this, b));
            }
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        this.e0 = false;
        gm.r(this.Y);
        super.onFragmentDestroy();
    }

    @Override // h15, org.telegram.ui.ActionBar.d
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.c.setPadding(0, 0, 0, gm.L(84.0f) + i4);
        this.c.setClipToPadding(false);
        this.V.setPadding(0, 0, 0, i4);
    }

    @Override // h15, org.telegram.ui.ActionBar.d
    public final void onPause() {
        super.onPause();
        ft4 ft4Var = this.U;
        if (ft4Var != null) {
            ft4Var.setPaused(true);
            this.U.setDialogVisible(true);
        }
    }

    @Override // h15, org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        ft4 ft4Var = this.U;
        if (ft4Var != null) {
            ft4Var.setPaused(false);
            this.U.setDialogVisible(false);
        }
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
    }
}
