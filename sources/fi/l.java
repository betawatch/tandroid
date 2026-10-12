package fi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import di.ab;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.ja;
import org.telegram.ui.Cells.y7;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.n01;
import org.telegram.ui.Components.z61;
import org.telegram.ui.Components.zc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.v20;
import w7.a6;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class l extends v20 implements NotificationCenter.NotificationCenterDelegate {
    public final long P;
    public FrameLayout Q;
    public tg.n R;
    public LinearLayout S;
    public ci.p T;
    public da0 U;
    public boolean W;
    public TL_payments.starRefProgram X;
    public TL_payments.starRefProgram Y;
    public boolean b0;
    public g c0;
    public final e V = new e(this, 0);
    public String[] Z = null;
    public final List a0 = Arrays.asList(1, 3, 6, 12, 24, 36, 0);

    public l(long j10) {
        this.P = j10;
        this.M = true;
        this.L = AndroidUtilities.dp(60.0f);
    }

    public static /* synthetic */ void A0(l lVar, org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        long j10 = lVar.P;
        a2Var.dismiss();
        if (!(tLObject instanceof TL_payments.starRefProgram)) {
            if (tL_error != null) {
                zc.d0(tL_error);
                return;
            }
            return;
        }
        TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) tLObject;
        TLRPC.UserFull userFull = lVar.getMessagesController().getUserFull(j10);
        if (userFull != null) {
            TL_payments.starRefProgram starrefprogram2 = lVar.Y;
            starrefprogram2.flags |= 2;
            starrefprogram2.end_date = lVar.getConnectionsManager().getCurrentTime() + (lVar.getConnectionsManager().isTestBackend() ? 300 : 86400);
            userFull.starref_program = starrefprogram;
            lVar.getMessagesStorage().updateUserInfo(userFull, false);
            NotificationCenter.getInstance(lVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(j10), userFull);
        }
        lVar.E0(true);
    }

    public static void B0(l lVar, int i10) {
        g gVar = lVar.c0;
        if (gVar == null) {
            return;
        }
        int i11 = gVar.G(i10).d;
        if (i11 != 4) {
            if (i11 == 2) {
                lVar.presentFragment(new d5(lVar.P));
                return;
            }
            return;
        }
        LinearLayout linearLayout = new LinearLayout(lVar.getParentActivity());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        TextView textView = new TextView(lVar.getParentActivity());
        textView.setTextSize(1, 16.0f);
        int i12 = g6.G6;
        textView.setTextColor(g6.w0(i12, lVar.resourceProvider));
        org.telegram.messenger.q.o(R.string.AffiliateProgramStopText, textView);
        linearLayout.addView(textView, a6.k(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
        bi.f4 f4Var = new bi.f4(lVar.getParentActivity(), 1);
        f4Var.setPadding(AndroidUtilities.dp(15.0f), 0, 0, 0);
        f4Var.setTextSize(1, 16.0f);
        f4Var.setTextColor(g6.w0(i12, lVar.resourceProvider));
        f4Var.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AffiliateProgramStopText1)));
        linearLayout.addView(f4Var, a6.k(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
        bi.f4 f4Var2 = new bi.f4(lVar.getParentActivity(), 1);
        f4Var2.setPadding(AndroidUtilities.dp(15.0f), 0, 0, 0);
        f4Var2.setTextSize(1, 16.0f);
        f4Var2.setTextColor(g6.w0(i12, lVar.resourceProvider));
        f4Var2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AffiliateProgramStopText2)));
        linearLayout.addView(f4Var2, a6.k(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
        bi.f4 f4Var3 = new bi.f4(lVar.getParentActivity(), 1);
        f4Var3.setPadding(AndroidUtilities.dp(15.0f), 0, 0, 0);
        f4Var3.setTextSize(1, 16.0f);
        f4Var3.setTextColor(g6.w0(i12, lVar.resourceProvider));
        f4Var3.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AffiliateProgramStopText3)));
        linearLayout.addView(f4Var3, a6.k(0.0f, 0.0f, 0.0f, 10.0f, -1, -2));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lVar.getParentActivity(), 0, lVar.resourceProvider);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.AffiliateProgramAlert);
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.k(LocaleController.getString(R.string.AffiliateProgramStopButton), new f1.a(lVar, 2));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.d(-1);
        alertDialog$Builder.o();
    }

    public static String H0(int i10) {
        float f7 = i10 / 10.0f;
        if (((int) f7) != f7) {
            return String.format(Locale.US, "%.1f%%", Float.valueOf(f7));
        }
        Locale locale = Locale.US;
        return a1.g.m(i10 / 10, "%");
    }

    public static void y0(l lVar, Context context) {
        if (lVar.T.W) {
            FrameLayout frameLayout = new FrameLayout(context);
            n01 n01Var = new n01(context, lVar.resourceProvider);
            e eVar = new e(lVar, 1);
            n01Var.c(LocaleController.getString(R.string.AffiliateProgramCommission), H0(lVar.Y.commission_permille), null, null);
            String string = LocaleController.getString(R.string.AffiliateProgramDuration);
            int i10 = lVar.Y.duration_months;
            n01Var.c(string, i10 <= 0 ? LocaleController.getString(R.string.Infinity) : (i10 < 12 || i10 % 12 != 0) ? LocaleController.formatPluralString("Months", i10, new Object[0]) : LocaleController.formatPluralString("Years", i10 / 12, new Object[0]), null, null);
            frameLayout.addView(n01Var, a6.a(-2.0f, 24.0f, 0.0f, 24.0f, 0.0f, -1, 119));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, lVar.resourceProvider);
            alertDialog$Builder.a.R = LocaleController.getString(R.string.AffiliateProgramAlert);
            alertDialog$Builder.a.T = LocaleController.getString(lVar.W ? R.string.AffiliateProgramStartAlertText : R.string.AffiliateProgramUpdateAlertText);
            alertDialog$Builder.n(frameLayout);
            alertDialog$Builder.k(LocaleController.getString(lVar.W ? R.string.AffiliateProgramStartAlertButton : R.string.AffiliateProgramUpdateAlertButton), new f1.a(eVar, 1));
            org.telegram.messenger.q.q(R.string.Cancel, alertDialog$Builder, null);
        }
    }

    public static /* synthetic */ void z0(l lVar, org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        long j10 = lVar.P;
        a2Var.dismiss();
        if (!(tLObject instanceof TL_payments.starRefProgram)) {
            if (tL_error != null) {
                zc.d0(tL_error);
                return;
            }
            return;
        }
        TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) tLObject;
        TLRPC.UserFull userFull = lVar.getMessagesController().getUserFull(j10);
        if (userFull != null) {
            userFull.starref_program = starrefprogram;
            lVar.getMessagesStorage().updateUserInfo(userFull, false);
            NotificationCenter.getInstance(lVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(j10), userFull);
        }
        lVar.E0(false);
    }

    public final void E0(boolean z10) {
        org.telegram.ui.ActionBar.m2 m2Var = null;
        if (getParentLayout() == null || getParentLayout().getFragmentStack() == null) {
            finishFragment();
        } else {
            org.telegram.ui.ActionBar.b5 parentLayout = getParentLayout();
            List fragmentStack = parentLayout.getFragmentStack();
            int size = fragmentStack.size() - 1;
            while (true) {
                if (size <= 0) {
                    size = -1;
                    break;
                }
                org.telegram.ui.ActionBar.m2 m2Var2 = (org.telegram.ui.ActionBar.m2) fragmentStack.get(size);
                if ((m2Var2 instanceof ProfileActivity) && ((ProfileActivity) m2Var2).a() == this.P) {
                    m2Var = m2Var2;
                    break;
                }
                size--;
            }
            if (m2Var != null) {
                for (int size2 = fragmentStack.size() - 1; size2 > size; size2--) {
                    ((ActionBarLayout) parentLayout).a0((org.telegram.ui.ActionBar.m2) fragmentStack.get(size2), false);
                }
                finishFragment();
            } else {
                finishFragment();
                m2Var = parentLayout.getBackgroundFragment();
            }
        }
        if (m2Var != null) {
            if (z10) {
                zc.a0(m2Var).M(LocaleController.getString(R.string.AffiliateProgramEndedTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.AffiliateProgramEndedText)), R.raw.linkbroken).j();
            } else {
                zc.a0(m2Var).M(LocaleController.getString(R.string.AffiliateProgramStartedTitle), LocaleController.getString(R.string.AffiliateProgramStartedText), R.raw.contact_check).j();
            }
        }
    }

    public final void F0(ArrayList arrayList, z61 z61Var) {
        if (getParentActivity() == null) {
            return;
        }
        ab abVar = (ab) super.r0(getParentActivity());
        l61 l61Var = new l61(-2);
        l61Var.c = abVar;
        arrayList.add(l61Var);
        arrayList.add(j.a(R.drawable.menu_feature_premium, LocaleController.getString(R.string.BotAffiliateProgramFeature1Title), LocaleController.getString(R.string.BotAffiliateProgramFeature1)));
        arrayList.add(j.a(R.drawable.msg_channel, LocaleController.getString(R.string.BotAffiliateProgramFeature2Title), LocaleController.getString(R.string.BotAffiliateProgramFeature2)));
        arrayList.add(j.a(R.drawable.menu_feature_links2, LocaleController.getString(R.string.BotAffiliateProgramFeature3Title), LocaleController.getString(R.string.BotAffiliateProgramFeature3)));
        arrayList.add(l61.A(1, null));
        arrayList.add(l61.t(LocaleController.getString(R.string.AffiliateProgramCommission)));
        int i10 = getMessagesController().starrefMinCommissionPermille;
        int i11 = this.Y.commission_permille;
        int i12 = getMessagesController().starrefMaxCommissionPermille;
        c cVar = new c(0);
        a aVar = new a(this, 1);
        l61 l61Var2 = new l61(15);
        l61Var2.z = i11;
        l61Var2.C = aVar;
        y7 y7Var = new y7();
        y7Var.a = i10;
        y7Var.b = i12;
        y7Var.e = new ja(cVar, 7);
        l61Var2.G = y7Var;
        l61Var2.B = -1L;
        l61Var2.B = this.X == null ? -1 : r3.commission_permille;
        arrayList.add(l61Var2);
        i2.d.y(R.string.AffiliateProgramCommissionInfo, arrayList);
        i2.d.o(R.string.AffiliateProgramDuration, arrayList);
        String[] strArr = this.Z;
        List list = this.a0;
        if (strArr == null) {
            this.Z = new String[list.size()];
            for (int i13 = 0; i13 < list.size(); i13++) {
                int intValue = ((Integer) list.get(i13)).intValue();
                if (intValue == 0) {
                    this.Z[i13] = LocaleController.getString(R.string.Infinity);
                } else if (intValue < 12 || intValue % 12 != 0) {
                    this.Z[i13] = LocaleController.formatPluralString("MonthsShort", intValue, new Object[0]);
                } else {
                    this.Z[i13] = LocaleController.formatPluralString("YearsShort", intValue / 12, new Object[0]);
                }
            }
        }
        String[] strArr2 = this.Z;
        int indexOf = list.indexOf(Integer.valueOf(this.Y.duration_months));
        a aVar2 = new a(this, 2);
        l61 l61Var3 = new l61(14);
        l61Var3.p = strArr2;
        l61Var3.z = indexOf;
        l61Var3.C = aVar2;
        l61Var3.B = -1L;
        TL_payments.starRefProgram starrefprogram = this.X;
        if (starrefprogram != null) {
            if (starrefprogram.duration_months > 0) {
                int size = list.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    if (((Integer) list.get(size)).intValue() > 0 && ((Integer) list.get(size)).intValue() <= this.X.duration_months) {
                        l61Var3.B = size;
                        break;
                    }
                    size--;
                }
            } else {
                l61Var3.B = list.size() - 1;
            }
        }
        arrayList.add(l61Var3);
        i2.d.y(R.string.AffiliateProgramDurationInfo, arrayList);
        arrayList.add(h.a(2, getThemedColor(g6.uj), R.drawable.filled_earn_stars, LocaleController.getString(R.string.AffiliateProgramExistingProgramsTitle), LocaleController.getString(R.string.AffiliateProgramExistingProgramsText)));
        arrayList.add(l61.A(3, null));
        if (!this.W && this.Y.end_date == 0) {
            l61 e = l61.e(4, LocaleController.getString(R.string.AffiliateProgramStop));
            e.r = true;
            arrayList.add(e);
            arrayList.add(l61.A(5, null));
        }
        arrayList.add(l61.A(6, null));
        arrayList.add(l61.A(7, null));
    }

    public final TL_payments.starRefProgram G0() {
        TL_payments.starRefProgram starrefprogram = new TL_payments.starRefProgram();
        starrefprogram.commission_permille = Utilities.clamp(50, getMessagesController().starrefMaxCommissionPermille, getMessagesController().starrefMinCommissionPermille);
        starrefprogram.duration_months = 1;
        return starrefprogram;
    }

    public final void I0(boolean z10) {
        this.T.g(LocaleController.getString((this.W || this.Y.end_date != 0) ? R.string.AffiliateProgramStart : R.string.AffiliateProgramUpdate), z10, true);
        e eVar = this.V;
        AndroidUtilities.cancelRunOnUIThread(eVar);
        eVar.run();
        this.U.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString((this.W || this.Y.end_date != 0) ? R.string.AffiliateProgramStartInfo : R.string.AffiliateProgramUpdateInfo), new e(this, 2)));
        J0();
        g gVar = this.c0;
        if (gVar != null) {
            gVar.N(z10);
        }
    }

    public final void J0() {
        TL_payments.starRefProgram starrefprogram;
        ci.p pVar = this.T;
        TL_payments.starRefProgram starrefprogram2 = this.Y;
        pVar.setEnabled(starrefprogram2.end_date == 0 && !((starrefprogram = this.X) != null && starrefprogram.commission_permille == starrefprogram2.commission_permille && starrefprogram.duration_months == starrefprogram2.duration_months));
    }

    @Override // org.telegram.ui.v20, org.telegram.ui.ActionBar.m2
    public final View createView(Context context) {
        this.G = false;
        this.E = AndroidUtilities.dp(238.0f);
        new ab(this, context, 2).setBackgroundColor(g6.x0(null, g6.i5, false));
        super.createView(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.Q = frameLayout;
        frameLayout.setClickable(true);
        tg.n nVar = new tg.n(context, 1, 3);
        this.R = nVar;
        tg.g gVar = nVar.b;
        gVar.z = g6.fk;
        gVar.A = g6.gk;
        gVar.b();
        this.R.setStarParticlesView(this.e);
        this.Q.addView(this.R, a6.a(190.0f, 0.0f, 32.0f, 0.0f, 24.0f, 190, 17));
        m0(LocaleController.getString(R.string.BotAffiliateProgramTitle), LocaleController.getString(R.string.BotAffiliateProgramText), this.Q, null);
        LinearLayout linearLayout = new LinearLayout(context);
        this.S = linearLayout;
        linearLayout.setOrientation(1);
        this.S.setBackgroundColor(getThemedColor(g6.d6));
        View view = new View(context);
        view.setBackgroundColor(getThemedColor(g6.d7));
        this.S.addView(view, new LinearLayout.LayoutParams(a6.z(-1.0f), a6.z(1.0f / AndroidUtilities.density)));
        int i10 = 1;
        ci.p pVar = new ci.p(i10, context, this.resourceProvider, true);
        pVar.setRoundRadius(24);
        this.T = pVar;
        pVar.g(LocaleController.getString(R.string.AffiliateProgramStart), false, true);
        this.T.setOnClickListener(new bi.u1(7, this, context));
        this.S.addView(this.T, a6.k(10.0f, 10.0f, 10.0f, 7.0f, -1, 48));
        da0 da0Var = new da0(context, this.resourceProvider);
        this.U = da0Var;
        da0Var.setTextColor(getThemedColor(g6.z6));
        this.U.setLinkTextColor(getThemedColor(g6.gc));
        this.U.setTextSize(1, 12.0f);
        this.U.setGravity(17);
        this.S.addView(this.U, a6.k(32.0f, 1.0f, 32.0f, 8.0f, -1, -2));
        I0(false);
        ((FrameLayout) this.fragmentView).addView(this.S, a6.e(-1, -2, 87));
        this.c.setPadding(0, 0, 0, AndroidUtilities.dp(84.0f));
        this.c.setOnItemClickListener(new bi.d(this, 8));
        s4.k kVar = new s4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(es.h);
        kVar.n(350L);
        this.c.setItemAnimator(kVar);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final int getNavigationBarColor() {
        return getThemedColor(g6.d6);
    }

    @Override // org.telegram.ui.v20
    public final s4.g0 n0() {
        g gVar = new g(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new ci.u(this, 12), getResourceProvider());
        this.c0 = gVar;
        return gVar;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean onFragmentCreate() {
        this.b0 = true;
        this.W = true;
        this.Y = G0();
        this.X = null;
        MessagesController messagesController = getMessagesController();
        long j10 = this.P;
        TLRPC.UserFull userFull = messagesController.getUserFull(j10);
        if (userFull != null) {
            this.W = false;
            TL_payments.starRefProgram starrefprogram = userFull.starref_program;
            this.Y = starrefprogram;
            if (starrefprogram == null) {
                this.W = true;
                this.Y = G0();
                this.X = null;
            } else {
                TL_payments.starRefProgram starrefprogram2 = new TL_payments.starRefProgram();
                this.X = starrefprogram2;
                TL_payments.starRefProgram starrefprogram3 = this.Y;
                starrefprogram2.commission_permille = starrefprogram3.commission_permille;
                starrefprogram2.duration_months = starrefprogram3.duration_months;
            }
        } else {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
            if (user != null) {
                getMessagesController().loadFullUser(user, getClassGuid(), true, new a(this, 0));
            }
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onFragmentDestroy() {
        this.b0 = false;
        AndroidUtilities.cancelRunOnUIThread(this.V);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.v20, org.telegram.ui.ActionBar.m2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.c.setPadding(0, 0, 0, AndroidUtilities.dp(84.0f) + i13);
        this.c.setClipToPadding(false);
        this.S.setPadding(0, 0, 0, i13);
    }

    @Override // org.telegram.ui.v20, org.telegram.ui.ActionBar.m2
    public final void onPause() {
        super.onPause();
        tg.n nVar = this.R;
        if (nVar != null) {
            nVar.setPaused(true);
            this.R.setDialogVisible(true);
        }
    }

    @Override // org.telegram.ui.v20, org.telegram.ui.ActionBar.m2
    public final void onResume() {
        super.onResume();
        tg.n nVar = this.R;
        if (nVar != null) {
            nVar.setPaused(false);
            this.R.setDialogVisible(false);
        }
    }

    @Override // org.telegram.ui.v20
    public final sg.x1 p0() {
        f fVar = new f(getParentActivity(), 0);
        fVar.c();
        return fVar;
    }

    @Override // org.telegram.ui.v20
    public final View r0(Context context) {
        throw null;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
    }
}
