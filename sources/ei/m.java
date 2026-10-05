package ei;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import ci.ab;
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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.la;
import org.telegram.ui.Cells.y7;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.l01;
import org.telegram.ui.Components.q90;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.yc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.n20;
import org.telegram.ui.r20;
import w7.z5;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class m extends r20 implements NotificationCenter.NotificationCenterDelegate {
    public final long P;
    public FrameLayout Q;
    public sg.e R;
    public LinearLayout S;
    public bi.q T;
    public q90 U;
    public boolean W;
    public TL_payments.starRefProgram X;
    public TL_payments.starRefProgram Y;
    public boolean b0;
    public h c0;
    public final e V = new e(this, 0);
    public String[] Z = null;
    public final List a0 = Arrays.asList(1, 3, 6, 12, 24, 36, 0);

    public m(long j3) {
        this.P = j3;
        this.M = true;
        this.L = AndroidUtilities.dp(60.0f);
    }

    public static void C0(m mVar, Context context) {
        if (mVar.T.W) {
            FrameLayout frameLayout = new FrameLayout(context);
            l01 l01Var = new l01(context, mVar.resourceProvider);
            e eVar = new e(mVar, 1);
            l01Var.c(LocaleController.getString(R.string.AffiliateProgramCommission), L0(mVar.Y.commission_permille), null, null);
            String string = LocaleController.getString(R.string.AffiliateProgramDuration);
            int i10 = mVar.Y.duration_months;
            l01Var.c(string, i10 <= 0 ? LocaleController.getString(R.string.Infinity) : (i10 < 12 || i10 % 12 != 0) ? LocaleController.formatPluralString("Months", i10, new Object[0]) : LocaleController.formatPluralString("Years", i10 / 12, new Object[0]), null, null);
            frameLayout.addView(l01Var, z5.d(-1, -2.0f, 119, 24.0f, 0.0f, 24.0f, 0.0f));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, mVar.resourceProvider);
            alertDialog$Builder.a.R = LocaleController.getString(R.string.AffiliateProgramAlert);
            alertDialog$Builder.a.T = LocaleController.getString(mVar.W ? R.string.AffiliateProgramStartAlertText : R.string.AffiliateProgramUpdateAlertText);
            alertDialog$Builder.n(frameLayout);
            alertDialog$Builder.k(LocaleController.getString(mVar.W ? R.string.AffiliateProgramStartAlertButton : R.string.AffiliateProgramUpdateAlertButton), new a1.c(eVar, 29));
            hg.c.p(R.string.Cancel, alertDialog$Builder, null);
        }
    }

    public static /* synthetic */ void D0(m mVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        long j3 = mVar.P;
        b2Var.dismiss();
        if (!(tLObject instanceof TL_payments.starRefProgram)) {
            if (tL_error != null) {
                yc.b0(tL_error);
                return;
            }
            return;
        }
        TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) tLObject;
        TLRPC.UserFull userFull = mVar.getMessagesController().getUserFull(j3);
        if (userFull != null) {
            userFull.starref_program = starrefprogram;
            mVar.getMessagesStorage().updateUserInfo(userFull, false);
            NotificationCenter.getInstance(mVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(j3), userFull);
        }
        mVar.I0(false);
    }

    public static /* synthetic */ void E0(m mVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        long j3 = mVar.P;
        b2Var.dismiss();
        if (!(tLObject instanceof TL_payments.starRefProgram)) {
            if (tL_error != null) {
                yc.b0(tL_error);
                return;
            }
            return;
        }
        TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) tLObject;
        TLRPC.UserFull userFull = mVar.getMessagesController().getUserFull(j3);
        if (userFull != null) {
            TL_payments.starRefProgram starrefprogram2 = mVar.Y;
            starrefprogram2.flags |= 2;
            starrefprogram2.end_date = mVar.getConnectionsManager().getCurrentTime() + (mVar.getConnectionsManager().isTestBackend() ? 300 : 86400);
            userFull.starref_program = starrefprogram;
            mVar.getMessagesStorage().updateUserInfo(userFull, false);
            NotificationCenter.getInstance(mVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(j3), userFull);
        }
        mVar.I0(true);
    }

    public static void F0(m mVar, int i10) {
        h hVar = mVar.c0;
        if (hVar == null) {
            return;
        }
        int i11 = hVar.G(i10).d;
        if (i11 != 4) {
            if (i11 == 2) {
                mVar.presentFragment(new e5(mVar.P));
                return;
            }
            return;
        }
        LinearLayout linearLayout = new LinearLayout(mVar.getParentActivity());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        TextView textView = new TextView(mVar.getParentActivity());
        textView.setTextSize(1, 16.0f);
        int i12 = i6.G6;
        textView.setTextColor(i6.v0(i12, mVar.resourceProvider));
        org.telegram.messenger.q.m(R.string.AffiliateProgramStopText, textView);
        linearLayout.addView(textView, z5.k(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
        ai.p4 p4Var = new ai.p4(mVar.getParentActivity(), 1);
        p4Var.setPadding(AndroidUtilities.dp(15.0f), 0, 0, 0);
        p4Var.setTextSize(1, 16.0f);
        p4Var.setTextColor(i6.v0(i12, mVar.resourceProvider));
        p4Var.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AffiliateProgramStopText1)));
        linearLayout.addView(p4Var, z5.k(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
        ai.p4 p4Var2 = new ai.p4(mVar.getParentActivity(), 1);
        p4Var2.setPadding(AndroidUtilities.dp(15.0f), 0, 0, 0);
        p4Var2.setTextSize(1, 16.0f);
        p4Var2.setTextColor(i6.v0(i12, mVar.resourceProvider));
        p4Var2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AffiliateProgramStopText2)));
        linearLayout.addView(p4Var2, z5.k(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
        ai.p4 p4Var3 = new ai.p4(mVar.getParentActivity(), 1);
        p4Var3.setPadding(AndroidUtilities.dp(15.0f), 0, 0, 0);
        p4Var3.setTextSize(1, 16.0f);
        p4Var3.setTextColor(i6.v0(i12, mVar.resourceProvider));
        p4Var3.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AffiliateProgramStopText3)));
        linearLayout.addView(p4Var3, z5.k(0.0f, 0.0f, 0.0f, 10.0f, -1, -2));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mVar.getParentActivity(), 0, mVar.resourceProvider);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.AffiliateProgramAlert);
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.k(LocaleController.getString(R.string.AffiliateProgramStopButton), new f(mVar, 0));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.d(-1);
        alertDialog$Builder.o();
    }

    public static String L0(int i10) {
        float f7 = i10 / 10.0f;
        if (((int) f7) != f7) {
            return String.format(Locale.US, "%.1f%%", Float.valueOf(f7));
        }
        Locale locale = Locale.US;
        return a4.a.n(i10 / 10, "%");
    }

    public final void I0(boolean z10) {
        org.telegram.ui.ActionBar.n2 n2Var = null;
        if (getParentLayout() == null || getParentLayout().getFragmentStack() == null) {
            finishFragment();
        } else {
            org.telegram.ui.ActionBar.c5 parentLayout = getParentLayout();
            List fragmentStack = parentLayout.getFragmentStack();
            int size = fragmentStack.size() - 1;
            while (true) {
                if (size <= 0) {
                    size = -1;
                    break;
                }
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) fragmentStack.get(size);
                if ((n2Var2 instanceof ProfileActivity) && ((ProfileActivity) n2Var2).a() == this.P) {
                    n2Var = n2Var2;
                    break;
                }
                size--;
            }
            if (n2Var != null) {
                for (int size2 = fragmentStack.size() - 1; size2 > size; size2--) {
                    ((ActionBarLayout) parentLayout).a0((org.telegram.ui.ActionBar.n2) fragmentStack.get(size2), false);
                }
                finishFragment();
            } else {
                finishFragment();
                n2Var = parentLayout.getBackgroundFragment();
            }
        }
        if (n2Var != null) {
            if (z10) {
                yc.a0(n2Var).M(LocaleController.getString(R.string.AffiliateProgramEndedTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.AffiliateProgramEndedText)), R.raw.linkbroken).j();
            } else {
                yc.a0(n2Var).M(LocaleController.getString(R.string.AffiliateProgramStartedTitle), LocaleController.getString(R.string.AffiliateProgramStartedText), R.raw.contact_check).j();
            }
        }
    }

    public final void J0(ArrayList arrayList, w61 w61Var) {
        if (getParentActivity() == null) {
            return;
        }
        n20 n20Var = (n20) super.s0(getParentActivity());
        h61 h61Var = new h61(-2);
        h61Var.c = n20Var;
        arrayList.add(h61Var);
        arrayList.add(k.a(R.drawable.menu_feature_premium, LocaleController.getString(R.string.BotAffiliateProgramFeature1Title), LocaleController.getString(R.string.BotAffiliateProgramFeature1)));
        arrayList.add(k.a(R.drawable.msg_channel, LocaleController.getString(R.string.BotAffiliateProgramFeature2Title), LocaleController.getString(R.string.BotAffiliateProgramFeature2)));
        arrayList.add(k.a(R.drawable.menu_feature_links2, LocaleController.getString(R.string.BotAffiliateProgramFeature3Title), LocaleController.getString(R.string.BotAffiliateProgramFeature3)));
        arrayList.add(h61.B(1, null));
        arrayList.add(h61.u(LocaleController.getString(R.string.AffiliateProgramCommission)));
        int i10 = getMessagesController().starrefMinCommissionPermille;
        int i11 = this.Y.commission_permille;
        int i12 = getMessagesController().starrefMaxCommissionPermille;
        c cVar = new c(0);
        a aVar = new a(this, 1);
        h61 h61Var2 = new h61(15);
        h61Var2.z = i11;
        h61Var2.C = aVar;
        y7 y7Var = new y7();
        y7Var.a = i10;
        y7Var.b = i12;
        y7Var.e = new la(cVar, 7);
        h61Var2.G = y7Var;
        h61Var2.B = -1L;
        h61Var2.B = this.X == null ? -1 : r3.commission_permille;
        arrayList.add(h61Var2);
        hg.c.n(R.string.AffiliateProgramCommissionInfo, arrayList);
        com.google.android.gms.internal.vision.e2.n(R.string.AffiliateProgramDuration, arrayList);
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
        h61 h61Var3 = new h61(14);
        h61Var3.p = strArr2;
        h61Var3.z = indexOf;
        h61Var3.C = aVar2;
        h61Var3.B = -1L;
        TL_payments.starRefProgram starrefprogram = this.X;
        if (starrefprogram != null) {
            if (starrefprogram.duration_months > 0) {
                int size = list.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    if (((Integer) list.get(size)).intValue() > 0 && ((Integer) list.get(size)).intValue() <= this.X.duration_months) {
                        h61Var3.B = size;
                        break;
                    }
                    size--;
                }
            } else {
                h61Var3.B = list.size() - 1;
            }
        }
        arrayList.add(h61Var3);
        hg.c.n(R.string.AffiliateProgramDurationInfo, arrayList);
        arrayList.add(i.a(2, getThemedColor(i6.uj), R.drawable.filled_earn_stars, LocaleController.getString(R.string.AffiliateProgramExistingProgramsTitle), LocaleController.getString(R.string.AffiliateProgramExistingProgramsText)));
        arrayList.add(h61.B(3, null));
        if (!this.W && this.Y.end_date == 0) {
            h61 e7 = h61.e(4, LocaleController.getString(R.string.AffiliateProgramStop));
            e7.r = true;
            arrayList.add(e7);
            arrayList.add(h61.B(5, null));
        }
        arrayList.add(h61.B(6, null));
        arrayList.add(h61.B(7, null));
    }

    public final TL_payments.starRefProgram K0() {
        TL_payments.starRefProgram starrefprogram = new TL_payments.starRefProgram();
        starrefprogram.commission_permille = Utilities.clamp(50, getMessagesController().starrefMaxCommissionPermille, getMessagesController().starrefMinCommissionPermille);
        starrefprogram.duration_months = 1;
        return starrefprogram;
    }

    public final void M0(boolean z10) {
        this.T.g(LocaleController.getString((this.W || this.Y.end_date != 0) ? R.string.AffiliateProgramStart : R.string.AffiliateProgramUpdate), z10, true);
        e eVar = this.V;
        AndroidUtilities.cancelRunOnUIThread(eVar);
        eVar.run();
        this.U.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString((this.W || this.Y.end_date != 0) ? R.string.AffiliateProgramStartInfo : R.string.AffiliateProgramUpdateInfo), new e(this, 2)));
        N0();
        h hVar = this.c0;
        if (hVar != null) {
            hVar.N(z10);
        }
    }

    public final void N0() {
        TL_payments.starRefProgram starrefprogram;
        bi.q qVar = this.T;
        TL_payments.starRefProgram starrefprogram2 = this.Y;
        qVar.setEnabled(starrefprogram2.end_date == 0 && !((starrefprogram = this.X) != null && starrefprogram.commission_permille == starrefprogram2.commission_permille && starrefprogram.duration_months == starrefprogram2.duration_months));
    }

    @Override // org.telegram.ui.r20, org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        this.G = false;
        this.E = AndroidUtilities.dp(238.0f);
        new ab(this, context, 2).setBackgroundColor(i6.w0(null, i6.i5, false));
        super.createView(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.Q = frameLayout;
        frameLayout.setClickable(true);
        sg.e eVar = new sg.e(context, 1, 3);
        this.R = eVar;
        sg.a aVar = eVar.b;
        aVar.w = i6.fk;
        aVar.x = i6.gk;
        aVar.b();
        this.R.setStarParticlesView(this.e);
        this.Q.addView(this.R, z5.d(190, 190.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        n0(LocaleController.getString(R.string.BotAffiliateProgramTitle), LocaleController.getString(R.string.BotAffiliateProgramText), this.Q, null);
        LinearLayout linearLayout = new LinearLayout(context);
        this.S = linearLayout;
        linearLayout.setOrientation(1);
        this.S.setBackgroundColor(getThemedColor(i6.d6));
        View view = new View(context);
        view.setBackgroundColor(getThemedColor(i6.d7));
        this.S.addView(view, new LinearLayout.LayoutParams(z5.z(-1.0f), z5.z(1.0f / AndroidUtilities.density)));
        int i10 = 1;
        bi.q qVar = new bi.q(i10, context, this.resourceProvider, true);
        qVar.setRoundRadius(24);
        this.T = qVar;
        qVar.g(LocaleController.getString(R.string.AffiliateProgramStart), false, true);
        this.T.setOnClickListener(new ai.f2(7, this, context));
        this.S.addView(this.T, z5.k(10.0f, 10.0f, 10.0f, 7.0f, -1, 48));
        q90 q90Var = new q90(context, this.resourceProvider);
        this.U = q90Var;
        q90Var.setTextColor(getThemedColor(i6.z6));
        this.U.setLinkTextColor(getThemedColor(i6.gc));
        this.U.setTextSize(1, 12.0f);
        this.U.setGravity(17);
        this.S.addView(this.U, z5.k(32.0f, 1.0f, 32.0f, 8.0f, -1, -2));
        M0(false);
        ((FrameLayout) this.fragmentView).addView(this.S, z5.e(-1, -2, 87));
        this.c.setPadding(0, 0, 0, AndroidUtilities.dp(84.0f));
        this.c.setOnItemClickListener(new ai.g(this, 8));
        s4.j jVar = new s4.j();
        jVar.m = false;
        jVar.C = false;
        jVar.o(tr.h);
        jVar.n(350L);
        this.c.setItemAnimator(jVar);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final int getNavigationBarColor() {
        return getThemedColor(i6.d6);
    }

    @Override // org.telegram.ui.r20
    public final s4.h0 o0() {
        h hVar = new h(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new bi.v(this, 12), getResourceProvider());
        this.c0 = hVar;
        return hVar;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        this.b0 = true;
        this.W = true;
        this.Y = K0();
        this.X = null;
        MessagesController messagesController = getMessagesController();
        long j3 = this.P;
        TLRPC.UserFull userFull = messagesController.getUserFull(j3);
        if (userFull != null) {
            this.W = false;
            TL_payments.starRefProgram starrefprogram = userFull.starref_program;
            this.Y = starrefprogram;
            if (starrefprogram == null) {
                this.W = true;
                this.Y = K0();
                this.X = null;
            } else {
                TL_payments.starRefProgram starrefprogram2 = new TL_payments.starRefProgram();
                this.X = starrefprogram2;
                TL_payments.starRefProgram starrefprogram3 = this.Y;
                starrefprogram2.commission_permille = starrefprogram3.commission_permille;
                starrefprogram2.duration_months = starrefprogram3.duration_months;
            }
        } else {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(j3));
            if (user != null) {
                getMessagesController().loadFullUser(user, getClassGuid(), true, new a(this, 0));
            }
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        this.b0 = false;
        AndroidUtilities.cancelRunOnUIThread(this.V);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.r20, org.telegram.ui.ActionBar.n2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.c.setPadding(0, 0, 0, AndroidUtilities.dp(84.0f) + i13);
        this.c.setClipToPadding(false);
        this.S.setPadding(0, 0, 0, i13);
    }

    @Override // org.telegram.ui.r20, org.telegram.ui.ActionBar.n2
    public final void onPause() {
        super.onPause();
        sg.e eVar = this.R;
        if (eVar != null) {
            eVar.setPaused(true);
            this.R.setDialogVisible(true);
        }
    }

    @Override // org.telegram.ui.r20, org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        sg.e eVar = this.R;
        if (eVar != null) {
            eVar.setPaused(false);
            this.R.setDialogVisible(false);
        }
    }

    @Override // org.telegram.ui.r20
    public final rg.y1 q0() {
        g gVar = new g(getParentActivity(), 0);
        gVar.b();
        return gVar;
    }

    @Override // org.telegram.ui.r20
    public final View s0(Context context) {
        throw null;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
    }
}
