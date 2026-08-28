package mh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import g7.e6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kh.b8;
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
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.ia;
import org.telegram.ui.Cells.w7;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.Components.z41;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.x10;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class l extends x10 implements NotificationCenter.NotificationCenterDelegate {
    public final long L;
    public FrameLayout M;
    public ag.j N;
    public LinearLayout O;
    public gh.p P;
    public l80 Q;
    public boolean S;
    public TL_payments.starRefProgram T;
    public TL_payments.starRefProgram U;
    public boolean X;
    public g Y;
    public final e R = new e(this, 0);
    public String[] V = null;
    public final List W = Arrays.asList(1, 3, 6, 12, 24, 36, 0);

    public l(long j10) {
        this.L = j10;
        this.I = true;
        this.H = AndroidUtilities.dp(60.0f);
    }

    public static String F0(int i9) {
        float f10 = i9 / 10.0f;
        if (((int) f10) != f10) {
            return String.format(Locale.US, "%.1f%%", Float.valueOf(f10));
        }
        Locale locale = Locale.US;
        return ta.b.c(i9 / 10, "%");
    }

    public static void w0(l lVar, Context context) {
        if (lVar.P.S) {
            FrameLayout frameLayout = new FrameLayout(context);
            wy0 wy0Var = new wy0(context, lVar.resourceProvider);
            e eVar = new e(lVar, 1);
            wy0Var.c(LocaleController.getString(R.string.AffiliateProgramCommission), F0(lVar.U.commission_permille), null, null);
            String string = LocaleController.getString(R.string.AffiliateProgramDuration);
            int i9 = lVar.U.duration_months;
            wy0Var.c(string, i9 <= 0 ? LocaleController.getString(R.string.Infinity) : (i9 < 12 || i9 % 12 != 0) ? LocaleController.formatPluralString("Months", i9, new Object[0]) : LocaleController.formatPluralString("Years", i9 / 12, new Object[0]), null, null);
            frameLayout.addView(wy0Var, e6.d(-1, -2.0f, 119, 24.0f, 0.0f, 24.0f, 0.0f));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, lVar.resourceProvider);
            alertDialog$Builder.a.N = LocaleController.getString(R.string.AffiliateProgramAlert);
            alertDialog$Builder.a.P = LocaleController.getString(lVar.S ? R.string.AffiliateProgramStartAlertText : R.string.AffiliateProgramUpdateAlertText);
            alertDialog$Builder.n(frameLayout);
            alertDialog$Builder.k(LocaleController.getString(lVar.S ? R.string.AffiliateProgramStartAlertButton : R.string.AffiliateProgramUpdateAlertButton), new kh.p(eVar, 7));
            j3.r0.v(R.string.Cancel, alertDialog$Builder, null);
        }
    }

    public static /* synthetic */ void x0(l lVar, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        long j10 = lVar.L;
        c2Var.dismiss();
        if (!(tLObject instanceof TL_payments.starRefProgram)) {
            if (tL_error != null) {
                oc.b0(tL_error);
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
        lVar.C0(false);
    }

    public static /* synthetic */ void y0(l lVar, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        long j10 = lVar.L;
        c2Var.dismiss();
        if (!(tLObject instanceof TL_payments.starRefProgram)) {
            if (tL_error != null) {
                oc.b0(tL_error);
                return;
            }
            return;
        }
        TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) tLObject;
        TLRPC.UserFull userFull = lVar.getMessagesController().getUserFull(j10);
        if (userFull != null) {
            TL_payments.starRefProgram starrefprogram2 = lVar.U;
            starrefprogram2.flags |= 2;
            starrefprogram2.end_date = lVar.getConnectionsManager().getCurrentTime() + (lVar.getConnectionsManager().isTestBackend() ? 300 : 86400);
            userFull.starref_program = starrefprogram;
            lVar.getMessagesStorage().updateUserInfo(userFull, false);
            NotificationCenter.getInstance(lVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(j10), userFull);
        }
        lVar.C0(true);
    }

    public static void z0(l lVar, int i9) {
        g gVar = lVar.Y;
        if (gVar == null) {
            return;
        }
        int i10 = gVar.G(i9).d;
        if (i10 != 4) {
            if (i10 == 2) {
                lVar.presentFragment(new r4(lVar.L));
                return;
            }
            return;
        }
        LinearLayout linearLayout = new LinearLayout(lVar.getParentActivity());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        TextView textView = new TextView(lVar.getParentActivity());
        textView.setTextSize(1, 16.0f);
        int i11 = f6.G6;
        textView.setTextColor(f6.v0(i11, lVar.resourceProvider));
        org.telegram.messenger.l0.m(R.string.AffiliateProgramStopText, textView);
        linearLayout.addView(textView, e6.k(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
        bg.t tVar = new bg.t(lVar.getParentActivity(), 3);
        tVar.setPadding(AndroidUtilities.dp(15.0f), 0, 0, 0);
        tVar.setTextSize(1, 16.0f);
        tVar.setTextColor(f6.v0(i11, lVar.resourceProvider));
        tVar.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AffiliateProgramStopText1)));
        linearLayout.addView(tVar, e6.k(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
        bg.t tVar2 = new bg.t(lVar.getParentActivity(), 3);
        tVar2.setPadding(AndroidUtilities.dp(15.0f), 0, 0, 0);
        tVar2.setTextSize(1, 16.0f);
        tVar2.setTextColor(f6.v0(i11, lVar.resourceProvider));
        tVar2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AffiliateProgramStopText2)));
        linearLayout.addView(tVar2, e6.k(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
        bg.t tVar3 = new bg.t(lVar.getParentActivity(), 3);
        tVar3.setPadding(AndroidUtilities.dp(15.0f), 0, 0, 0);
        tVar3.setTextSize(1, 16.0f);
        tVar3.setTextColor(f6.v0(i11, lVar.resourceProvider));
        tVar3.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AffiliateProgramStopText3)));
        linearLayout.addView(tVar3, e6.k(0.0f, 0.0f, 0.0f, 10.0f, -1, -2));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lVar.getParentActivity(), 0, lVar.resourceProvider);
        alertDialog$Builder.a.N = LocaleController.getString(R.string.AffiliateProgramAlert);
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.k(LocaleController.getString(R.string.AffiliateProgramStopButton), new kh.p(lVar, 8));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.d(-1);
        alertDialog$Builder.o();
    }

    public final void C0(boolean z10) {
        org.telegram.ui.ActionBar.o2 o2Var = null;
        if (getParentLayout() == null || getParentLayout().getFragmentStack() == null) {
            finishFragment();
        } else {
            b5 parentLayout = getParentLayout();
            List fragmentStack = parentLayout.getFragmentStack();
            int size = fragmentStack.size() - 1;
            while (true) {
                if (size <= 0) {
                    size = -1;
                    break;
                }
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) fragmentStack.get(size);
                if ((o2Var2 instanceof ProfileActivity) && ((ProfileActivity) o2Var2).a() == this.L) {
                    o2Var = o2Var2;
                    break;
                }
                size--;
            }
            if (o2Var != null) {
                for (int size2 = fragmentStack.size() - 1; size2 > size; size2--) {
                    ((ActionBarLayout) parentLayout).a0((org.telegram.ui.ActionBar.o2) fragmentStack.get(size2), false);
                }
                finishFragment();
            } else {
                finishFragment();
                o2Var = parentLayout.getBackgroundFragment();
            }
        }
        if (o2Var != null) {
            if (z10) {
                oc.a0(o2Var).M(LocaleController.getString(R.string.AffiliateProgramEndedTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.AffiliateProgramEndedText)), R.raw.linkbroken).j();
            } else {
                oc.a0(o2Var).M(LocaleController.getString(R.string.AffiliateProgramStartedTitle), LocaleController.getString(R.string.AffiliateProgramStartedText), R.raw.contact_check).j();
            }
        }
    }

    public final void D0(ArrayList arrayList, z41 z41Var) {
        if (getParentActivity() == null) {
            return;
        }
        fh.l2 l2Var = (fh.l2) super.q0(getParentActivity());
        l41 l41Var = new l41(-2);
        l41Var.c = l2Var;
        arrayList.add(l41Var);
        arrayList.add(j.a(R.drawable.menu_feature_premium, LocaleController.getString(R.string.BotAffiliateProgramFeature1Title), LocaleController.getString(R.string.BotAffiliateProgramFeature1)));
        arrayList.add(j.a(R.drawable.msg_channel, LocaleController.getString(R.string.BotAffiliateProgramFeature2Title), LocaleController.getString(R.string.BotAffiliateProgramFeature2)));
        arrayList.add(j.a(R.drawable.menu_feature_links2, LocaleController.getString(R.string.BotAffiliateProgramFeature3Title), LocaleController.getString(R.string.BotAffiliateProgramFeature3)));
        arrayList.add(l41.A(1, null));
        arrayList.add(l41.t(LocaleController.getString(R.string.AffiliateProgramCommission)));
        int i9 = getMessagesController().starrefMinCommissionPermille;
        int i10 = this.U.commission_permille;
        int i11 = getMessagesController().starrefMaxCommissionPermille;
        c cVar = new c(0);
        a aVar = new a(this, 1);
        l41 l41Var2 = new l41(15);
        l41Var2.z = i10;
        l41Var2.C = aVar;
        w7 w7Var = new w7();
        w7Var.a = i9;
        w7Var.b = i11;
        w7Var.e = new ia(cVar, 7);
        l41Var2.G = w7Var;
        l41Var2.B = -1L;
        l41Var2.B = this.T == null ? -1 : r3.commission_permille;
        arrayList.add(l41Var2);
        org.telegram.ui.Cells.j2.y(R.string.AffiliateProgramCommissionInfo, arrayList);
        org.telegram.ui.Cells.j2.l(R.string.AffiliateProgramDuration, arrayList);
        String[] strArr = this.V;
        List list = this.W;
        if (strArr == null) {
            this.V = new String[list.size()];
            for (int i12 = 0; i12 < list.size(); i12++) {
                int intValue = ((Integer) list.get(i12)).intValue();
                if (intValue == 0) {
                    this.V[i12] = LocaleController.getString(R.string.Infinity);
                } else if (intValue < 12 || intValue % 12 != 0) {
                    this.V[i12] = LocaleController.formatPluralString("MonthsShort", intValue, new Object[0]);
                } else {
                    this.V[i12] = LocaleController.formatPluralString("YearsShort", intValue / 12, new Object[0]);
                }
            }
        }
        String[] strArr2 = this.V;
        int indexOf = list.indexOf(Integer.valueOf(this.U.duration_months));
        a aVar2 = new a(this, 2);
        l41 l41Var3 = new l41(14);
        l41Var3.p = strArr2;
        l41Var3.z = indexOf;
        l41Var3.C = aVar2;
        l41Var3.B = -1L;
        TL_payments.starRefProgram starrefprogram = this.T;
        if (starrefprogram != null) {
            if (starrefprogram.duration_months > 0) {
                int size = list.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    if (((Integer) list.get(size)).intValue() > 0 && ((Integer) list.get(size)).intValue() <= this.T.duration_months) {
                        l41Var3.B = size;
                        break;
                    }
                    size--;
                }
            } else {
                l41Var3.B = list.size() - 1;
            }
        }
        arrayList.add(l41Var3);
        org.telegram.ui.Cells.j2.y(R.string.AffiliateProgramDurationInfo, arrayList);
        arrayList.add(h.a(2, getThemedColor(f6.uj), R.drawable.filled_earn_stars, LocaleController.getString(R.string.AffiliateProgramExistingProgramsTitle), LocaleController.getString(R.string.AffiliateProgramExistingProgramsText)));
        arrayList.add(l41.A(3, null));
        if (!this.S && this.U.end_date == 0) {
            l41 e10 = l41.e(4, LocaleController.getString(R.string.AffiliateProgramStop));
            e10.r = true;
            arrayList.add(e10);
            arrayList.add(l41.A(5, null));
        }
        arrayList.add(l41.A(6, null));
        arrayList.add(l41.A(7, null));
    }

    public final TL_payments.starRefProgram E0() {
        TL_payments.starRefProgram starrefprogram = new TL_payments.starRefProgram();
        starrefprogram.commission_permille = Utilities.clamp(50, getMessagesController().starrefMaxCommissionPermille, getMessagesController().starrefMinCommissionPermille);
        starrefprogram.duration_months = 1;
        return starrefprogram;
    }

    public final void G0(boolean z10) {
        this.P.g(LocaleController.getString((this.S || this.U.end_date != 0) ? R.string.AffiliateProgramStart : R.string.AffiliateProgramUpdate), z10, true);
        e eVar = this.R;
        AndroidUtilities.cancelRunOnUIThread(eVar);
        eVar.run();
        this.Q.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString((this.S || this.U.end_date != 0) ? R.string.AffiliateProgramStartInfo : R.string.AffiliateProgramUpdateInfo), new e(this, 2)));
        H0();
        g gVar = this.Y;
        if (gVar != null) {
            gVar.N(z10);
        }
    }

    public final void H0() {
        TL_payments.starRefProgram starrefprogram;
        gh.p pVar = this.P;
        TL_payments.starRefProgram starrefprogram2 = this.U;
        pVar.setEnabled(starrefprogram2.end_date == 0 && !((starrefprogram = this.T) != null && starrefprogram.commission_permille == starrefprogram2.commission_permille && starrefprogram.duration_months == starrefprogram2.duration_months));
    }

    @Override // org.telegram.ui.x10, org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.C = false;
        this.A = AndroidUtilities.dp(238.0f);
        new fh.l2(this, context, 4).setBackgroundColor(f6.w0(null, f6.i5, false));
        super.createView(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.M = frameLayout;
        frameLayout.setClickable(true);
        ag.j jVar = new ag.j(context, 1, 3);
        this.N = jVar;
        ag.a aVar = jVar.b;
        aVar.w = f6.fk;
        aVar.x = f6.gk;
        aVar.b();
        this.N.setStarParticlesView(this.e);
        this.M.addView(this.N, e6.d(190, 190.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        l0(LocaleController.getString(R.string.BotAffiliateProgramTitle), LocaleController.getString(R.string.BotAffiliateProgramText), this.M, null);
        LinearLayout linearLayout = new LinearLayout(context);
        this.O = linearLayout;
        linearLayout.setOrientation(1);
        this.O.setBackgroundColor(getThemedColor(f6.d6));
        View view = new View(context);
        view.setBackgroundColor(getThemedColor(f6.d7));
        this.O.addView(view, new LinearLayout.LayoutParams(e6.z(-1.0f), e6.z(1.0f / AndroidUtilities.density)));
        int i9 = 2;
        gh.p pVar = new gh.p(i9, context, this.resourceProvider, true);
        pVar.setRoundRadius(24);
        this.P = pVar;
        pVar.g(LocaleController.getString(R.string.AffiliateProgramStart), false, true);
        this.P.setOnClickListener(new bg.u1(28, this, context));
        this.O.addView(this.P, e6.k(10.0f, 10.0f, 10.0f, 7.0f, -1, 48));
        l80 l80Var = new l80(context, this.resourceProvider);
        this.Q = l80Var;
        l80Var.setTextColor(getThemedColor(f6.z6));
        this.Q.setLinkTextColor(getThemedColor(f6.gc));
        this.Q.setTextSize(1, 12.0f);
        this.Q.setGravity(17);
        this.O.addView(this.Q, e6.k(32.0f, 1.0f, 32.0f, 8.0f, -1, -2));
        G0(false);
        ((FrameLayout) this.fragmentView).addView(this.O, e6.e(-1, -2, 87));
        this.c.setPadding(0, 0, 0, AndroidUtilities.dp(84.0f));
        this.c.setOnItemClickListener(new eh.j(this, 15));
        f2.n nVar = new f2.n();
        nVar.m = false;
        nVar.C = false;
        nVar.o(gr.h);
        nVar.n(350L);
        this.c.setItemAnimator(nVar);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final int getNavigationBarColor() {
        return getThemedColor(f6.d6);
    }

    @Override // org.telegram.ui.x10
    public final f2.r0 m0() {
        g gVar = new g(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new b8(this, 5), getResourceProvider());
        this.Y = gVar;
        return gVar;
    }

    @Override // org.telegram.ui.x10
    public final zf.w1 o0() {
        f fVar = new f(getParentActivity(), 0);
        fVar.b();
        return fVar;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        this.X = true;
        this.S = true;
        this.U = E0();
        this.T = null;
        MessagesController messagesController = getMessagesController();
        long j10 = this.L;
        TLRPC.UserFull userFull = messagesController.getUserFull(j10);
        if (userFull != null) {
            this.S = false;
            TL_payments.starRefProgram starrefprogram = userFull.starref_program;
            this.U = starrefprogram;
            if (starrefprogram == null) {
                this.S = true;
                this.U = E0();
                this.T = null;
            } else {
                TL_payments.starRefProgram starrefprogram2 = new TL_payments.starRefProgram();
                this.T = starrefprogram2;
                TL_payments.starRefProgram starrefprogram3 = this.U;
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

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        this.X = false;
        AndroidUtilities.cancelRunOnUIThread(this.R);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.x10, org.telegram.ui.ActionBar.o2
    public final void onInsets(int i9, int i10, int i11, int i12) {
        this.c.setPadding(0, 0, 0, AndroidUtilities.dp(84.0f) + i12);
        this.c.setClipToPadding(false);
        this.O.setPadding(0, 0, 0, i12);
    }

    @Override // org.telegram.ui.x10, org.telegram.ui.ActionBar.o2
    public final void onPause() {
        super.onPause();
        ag.j jVar = this.N;
        if (jVar != null) {
            jVar.setPaused(true);
            this.N.setDialogVisible(true);
        }
    }

    @Override // org.telegram.ui.x10, org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        ag.j jVar = this.N;
        if (jVar != null) {
            jVar.setPaused(false);
            this.N.setDialogVisible(false);
        }
    }

    @Override // org.telegram.ui.x10
    public final View q0(Context context) {
        throw null;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
    }
}
