package hi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.cc;
import bi.md;
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
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.b8;
import org.telegram.ui.Cells.na;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.w01;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.z90;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.d20;
import org.telegram.ui.z10;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class k extends d20 implements NotificationCenter.NotificationCenterDelegate {
    public final long R;
    public FrameLayout S;
    public ug.n T;
    public LinearLayout U;
    public bi.v V;
    public z90 W;
    public boolean Y;
    public TL_payments.starRefProgram Z;
    public TL_payments.starRefProgram a0;
    public boolean d0;
    public f e0;
    public final d X = new d(this, 0);
    public String[] b0 = null;
    public final List c0 = Arrays.asList(1, 3, 6, 12, 24, 36, 0);

    public k(long j10) {
        this.R = j10;
        this.M = true;
        this.L = AndroidUtilities.dp(60.0f);
    }

    public static String F0(int i10) {
        float f7 = i10 / 10.0f;
        if (((int) f7) != f7) {
            return String.format(Locale.US, "%.1f%%", Float.valueOf(f7));
        }
        Locale locale = Locale.US;
        return a1.g.m(i10 / 10, "%");
    }

    public static void w0(k kVar, Context context) {
        if (kVar.V.c0) {
            FrameLayout frameLayout = new FrameLayout(context);
            w01 w01Var = new w01(context, kVar.resourceProvider);
            d dVar = new d(kVar, 1);
            w01Var.c(LocaleController.getString(R.string.AffiliateProgramCommission), F0(kVar.a0.commission_permille), null, null);
            String string = LocaleController.getString(R.string.AffiliateProgramDuration);
            int i10 = kVar.a0.duration_months;
            w01Var.c(string, i10 <= 0 ? LocaleController.getString(R.string.Infinity) : (i10 < 12 || i10 % 12 != 0) ? LocaleController.formatPluralString("Months", i10, new Object[0]) : LocaleController.formatPluralString("Years", i10 / 12, new Object[0]), null, null);
            frameLayout.addView(w01Var, gb1.h(-1, -2.0f, 119, 24.0f, 0.0f, 24.0f, 0.0f));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, kVar.resourceProvider);
            alertDialog$Builder.a.R = LocaleController.getString(R.string.AffiliateProgramAlert);
            alertDialog$Builder.a.T = LocaleController.getString(kVar.Y ? R.string.AffiliateProgramStartAlertText : R.string.AffiliateProgramUpdateAlertText);
            alertDialog$Builder.o(frameLayout);
            alertDialog$Builder.k(LocaleController.getString(kVar.Y ? R.string.AffiliateProgramStartAlertButton : R.string.AffiliateProgramUpdateAlertButton), new e1.c(dVar, 14));
            ic.a.r(R.string.Cancel, alertDialog$Builder, null);
        }
    }

    public static /* synthetic */ void x0(k kVar, org.telegram.ui.ActionBar.e2 e2Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        long j10 = kVar.R;
        e2Var.dismiss();
        if (!(tLObject instanceof TL_payments.starRefProgram)) {
            if (tL_error != null) {
                wc.e0(tL_error);
                return;
            }
            return;
        }
        TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) tLObject;
        TLRPC.UserFull userFull = kVar.getMessagesController().getUserFull(j10);
        if (userFull != null) {
            userFull.starref_program = starrefprogram;
            kVar.getMessagesStorage().updateUserInfo(userFull, false);
            NotificationCenter.getInstance(kVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(j10), userFull);
        }
        kVar.C0(false);
    }

    public static /* synthetic */ void y0(k kVar, org.telegram.ui.ActionBar.e2 e2Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        long j10 = kVar.R;
        e2Var.dismiss();
        if (!(tLObject instanceof TL_payments.starRefProgram)) {
            if (tL_error != null) {
                wc.e0(tL_error);
                return;
            }
            return;
        }
        TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) tLObject;
        TLRPC.UserFull userFull = kVar.getMessagesController().getUserFull(j10);
        if (userFull != null) {
            TL_payments.starRefProgram starrefprogram2 = kVar.a0;
            starrefprogram2.flags |= 2;
            starrefprogram2.end_date = kVar.getConnectionsManager().getCurrentTime() + (kVar.getConnectionsManager().isTestBackend() ? 300 : 86400);
            userFull.starref_program = starrefprogram;
            kVar.getMessagesStorage().updateUserInfo(userFull, false);
            NotificationCenter.getInstance(kVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(j10), userFull);
        }
        kVar.C0(true);
    }

    public static void z0(k kVar, int i10) {
        f fVar = kVar.e0;
        if (fVar == null) {
            return;
        }
        int i11 = fVar.G(i10).d;
        if (i11 != 4) {
            if (i11 == 2) {
                kVar.presentFragment(new b5(kVar.R));
                return;
            }
            return;
        }
        LinearLayout linearLayout = new LinearLayout(kVar.getParentActivity());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        TextView textView = new TextView(kVar.getParentActivity());
        textView.setTextSize(1, 16.0f);
        int i12 = y6.G6;
        f7.V(textView, i12, kVar.resourceProvider);
        org.telegram.messenger.t.n(R.string.AffiliateProgramStopText, textView);
        linearLayout.addView(textView, gb1.o(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
        md mdVar = new md(kVar.getParentActivity(), 2);
        mdVar.setPadding(AndroidUtilities.dp(15.0f), 0, 0, 0);
        mdVar.setTextSize(1, 16.0f);
        f7.V(mdVar, i12, kVar.resourceProvider);
        mdVar.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AffiliateProgramStopText1)));
        linearLayout.addView(mdVar, gb1.o(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
        md mdVar2 = new md(kVar.getParentActivity(), 2);
        mdVar2.setPadding(AndroidUtilities.dp(15.0f), 0, 0, 0);
        mdVar2.setTextSize(1, 16.0f);
        f7.V(mdVar2, i12, kVar.resourceProvider);
        mdVar2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AffiliateProgramStopText2)));
        linearLayout.addView(mdVar2, gb1.o(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
        md mdVar3 = new md(kVar.getParentActivity(), 2);
        mdVar3.setPadding(AndroidUtilities.dp(15.0f), 0, 0, 0);
        mdVar3.setTextSize(1, 16.0f);
        f7.V(mdVar3, i12, kVar.resourceProvider);
        mdVar3.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AffiliateProgramStopText3)));
        linearLayout.addView(mdVar3, gb1.o(0.0f, 0.0f, 0.0f, 10.0f, -1, -2));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kVar.getParentActivity(), 0, kVar.resourceProvider);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.AffiliateProgramAlert);
        alertDialog$Builder.o(linearLayout);
        alertDialog$Builder.k(LocaleController.getString(R.string.AffiliateProgramStopButton), new e1.c(kVar, 15));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.d(-1);
        alertDialog$Builder.p();
    }

    public final void C0(boolean z10) {
        org.telegram.ui.ActionBar.r2 r2Var = null;
        if (getParentLayout() == null || getParentLayout().getFragmentStack() == null) {
            finishFragment();
        } else {
            j5 parentLayout = getParentLayout();
            List fragmentStack = parentLayout.getFragmentStack();
            int size = fragmentStack.size() - 1;
            while (true) {
                if (size <= 0) {
                    size = -1;
                    break;
                }
                org.telegram.ui.ActionBar.r2 r2Var2 = (org.telegram.ui.ActionBar.r2) fragmentStack.get(size);
                if ((r2Var2 instanceof ProfileActivity) && ((ProfileActivity) r2Var2).a() == this.R) {
                    r2Var = r2Var2;
                    break;
                }
                size--;
            }
            if (r2Var != null) {
                for (int size2 = fragmentStack.size() - 1; size2 > size; size2--) {
                    ((ActionBarLayout) parentLayout).c0((org.telegram.ui.ActionBar.r2) fragmentStack.get(size2), false);
                }
                finishFragment();
            } else {
                finishFragment();
                r2Var = parentLayout.getBackgroundFragment();
            }
        }
        if (r2Var != null) {
            if (z10) {
                wc.b0(r2Var).M(LocaleController.getString(R.string.AffiliateProgramEndedTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.AffiliateProgramEndedText)), R.raw.linkbroken).j();
            } else {
                wc.b0(r2Var).M(LocaleController.getString(R.string.AffiliateProgramStartedTitle), LocaleController.getString(R.string.AffiliateProgramStartedText), R.raw.contact_check).j();
            }
        }
    }

    public final void D0(ArrayList arrayList, j71 j71Var) {
        if (getParentActivity() == null) {
            return;
        }
        z10 z10Var = (z10) super.k0(getParentActivity());
        t61 t61Var = new t61(-2);
        t61Var.c = z10Var;
        arrayList.add(t61Var);
        arrayList.add(i.a(R.drawable.menu_feature_premium, LocaleController.getString(R.string.BotAffiliateProgramFeature1Title), LocaleController.getString(R.string.BotAffiliateProgramFeature1)));
        arrayList.add(i.a(R.drawable.msg_channel, LocaleController.getString(R.string.BotAffiliateProgramFeature2Title), LocaleController.getString(R.string.BotAffiliateProgramFeature2)));
        arrayList.add(i.a(R.drawable.menu_feature_links2, LocaleController.getString(R.string.BotAffiliateProgramFeature3Title), LocaleController.getString(R.string.BotAffiliateProgramFeature3)));
        arrayList.add(t61.B(1, null));
        arrayList.add(t61.u(LocaleController.getString(R.string.AffiliateProgramCommission)));
        int i10 = getMessagesController().starrefMinCommissionPermille;
        int i11 = this.a0.commission_permille;
        int i12 = getMessagesController().starrefMaxCommissionPermille;
        ai.d0 d0Var = new ai.d0(2);
        a aVar = new a(this, 1);
        t61 t61Var2 = new t61(15);
        t61Var2.z = i11;
        t61Var2.C = aVar;
        b8 b8Var = new b8();
        b8Var.a = i10;
        b8Var.b = i12;
        b8Var.e = new na(d0Var, 7);
        t61Var2.G = b8Var;
        t61Var2.B = -1L;
        t61Var2.B = this.Z == null ? -1 : r3.commission_permille;
        arrayList.add(t61Var2);
        ic.a.z(R.string.AffiliateProgramCommissionInfo, arrayList);
        ic.a.p(R.string.AffiliateProgramDuration, arrayList);
        String[] strArr = this.b0;
        List list = this.c0;
        if (strArr == null) {
            this.b0 = new String[list.size()];
            for (int i13 = 0; i13 < list.size(); i13++) {
                int intValue = ((Integer) list.get(i13)).intValue();
                if (intValue == 0) {
                    this.b0[i13] = LocaleController.getString(R.string.Infinity);
                } else if (intValue < 12 || intValue % 12 != 0) {
                    this.b0[i13] = LocaleController.formatPluralString("MonthsShort", intValue, new Object[0]);
                } else {
                    this.b0[i13] = LocaleController.formatPluralString("YearsShort", intValue / 12, new Object[0]);
                }
            }
        }
        String[] strArr2 = this.b0;
        int indexOf = list.indexOf(Integer.valueOf(this.a0.duration_months));
        a aVar2 = new a(this, 2);
        t61 t61Var3 = new t61(14);
        t61Var3.p = strArr2;
        t61Var3.z = indexOf;
        t61Var3.C = aVar2;
        t61Var3.B = -1L;
        TL_payments.starRefProgram starrefprogram = this.Z;
        if (starrefprogram != null) {
            if (starrefprogram.duration_months > 0) {
                int size = list.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    if (((Integer) list.get(size)).intValue() > 0 && ((Integer) list.get(size)).intValue() <= this.Z.duration_months) {
                        t61Var3.B = size;
                        break;
                    }
                    size--;
                }
            } else {
                t61Var3.B = list.size() - 1;
            }
        }
        arrayList.add(t61Var3);
        ic.a.z(R.string.AffiliateProgramDurationInfo, arrayList);
        arrayList.add(g.a(2, getThemedColor(y6.uj), R.drawable.filled_earn_stars, LocaleController.getString(R.string.AffiliateProgramExistingProgramsTitle), LocaleController.getString(R.string.AffiliateProgramExistingProgramsText)));
        arrayList.add(t61.B(3, null));
        if (!this.Y && this.a0.end_date == 0) {
            t61 e = t61.e(4, LocaleController.getString(R.string.AffiliateProgramStop));
            e.r = true;
            arrayList.add(e);
            arrayList.add(t61.B(5, null));
        }
        arrayList.add(t61.B(6, null));
        arrayList.add(t61.B(7, null));
    }

    public final TL_payments.starRefProgram E0() {
        TL_payments.starRefProgram starrefprogram = new TL_payments.starRefProgram();
        starrefprogram.commission_permille = Utilities.clamp(50, getMessagesController().starrefMaxCommissionPermille, getMessagesController().starrefMinCommissionPermille);
        starrefprogram.duration_months = 1;
        return starrefprogram;
    }

    public final void G0(boolean z10) {
        this.V.i(LocaleController.getString((this.Y || this.a0.end_date != 0) ? R.string.AffiliateProgramStart : R.string.AffiliateProgramUpdate), z10, true);
        d dVar = this.X;
        AndroidUtilities.cancelRunOnUIThread(dVar);
        dVar.run();
        this.W.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString((this.Y || this.a0.end_date != 0) ? R.string.AffiliateProgramStartInfo : R.string.AffiliateProgramUpdateInfo), new d(this, 2)));
        H0();
        f fVar = this.e0;
        if (fVar != null) {
            fVar.O(z10);
        }
    }

    public final void H0() {
        TL_payments.starRefProgram starrefprogram;
        bi.v vVar = this.V;
        TL_payments.starRefProgram starrefprogram2 = this.a0;
        vVar.setEnabled(starrefprogram2.end_date == 0 && !((starrefprogram = this.Z) != null && starrefprogram.commission_permille == starrefprogram2.commission_permille && starrefprogram.duration_months == starrefprogram2.duration_months));
    }

    @Override // org.telegram.ui.d20, org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        this.G = false;
        this.E = AndroidUtilities.dp(238.0f);
        f7.i(y6.i5, new cc(this, context, 3), null);
        super.createView(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.S = frameLayout;
        frameLayout.setClickable(true);
        ug.n nVar = new ug.n(context, 1, 3);
        this.T = nVar;
        ug.g gVar = nVar.b;
        gVar.z = y6.fk;
        gVar.A = y6.gk;
        gVar.b();
        this.T.setStarParticlesView(this.e);
        this.S.addView(this.T, gb1.h(190, 190.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        f0(LocaleController.getString(R.string.BotAffiliateProgramTitle), LocaleController.getString(R.string.BotAffiliateProgramText), this.S, null);
        LinearLayout linearLayout = new LinearLayout(context);
        this.U = linearLayout;
        linearLayout.setOrientation(1);
        f7.i(y6.d6, this.U, getResourceProvider());
        View view = new View(context);
        f7.i(y6.d7, view, getResourceProvider());
        this.U.addView(view, new LinearLayout.LayoutParams(gb1.I(-1.0f), gb1.I(1.0f / AndroidUtilities.density)));
        int i10 = 2;
        bi.v vVar = new bi.v(i10, context, this.resourceProvider, true);
        vVar.setRoundRadius(24);
        this.V = vVar;
        vVar.i(LocaleController.getString(R.string.AffiliateProgramStart), false, true);
        this.V.setOnClickListener(new bi.q(17, this, context));
        this.U.addView(this.V, gb1.o(10.0f, 10.0f, 10.0f, 7.0f, -1, 48));
        z90 z90Var = new z90(context, this.resourceProvider);
        this.W = z90Var;
        f7.V(z90Var, y6.z6, getResourceProvider());
        f7.H(this.W, y6.gc, getResourceProvider());
        this.W.setTextSize(1, 12.0f);
        this.W.setGravity(17);
        this.U.addView(this.W, gb1.o(32.0f, 1.0f, 32.0f, 8.0f, -1, -2));
        G0(false);
        ((FrameLayout) this.fragmentView).addView(this.U, gb1.i(-1, -2, 87));
        this.c.setPadding(0, 0, 0, AndroidUtilities.dp(84.0f));
        this.c.setOnItemClickListener(new ai.k(this, 13));
        s4.l lVar = new s4.l();
        lVar.m = false;
        lVar.C = false;
        lVar.o(ds.h);
        lVar.n(350L);
        this.c.setItemAnimator(lVar);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.d20
    public final s4.h0 g0() {
        f fVar = new f(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new ai.e(this, 26), getResourceProvider());
        this.e0 = fVar;
        return fVar;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final int getNavigationBarColor() {
        return getThemedColor(y6.d6);
    }

    @Override // org.telegram.ui.d20
    public final tg.x1 i0() {
        e eVar = new e(getParentActivity(), 0);
        eVar.c();
        return eVar;
    }

    @Override // org.telegram.ui.d20
    public final View k0(Context context) {
        throw null;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onFragmentCreate() {
        this.d0 = true;
        this.Y = true;
        this.a0 = E0();
        this.Z = null;
        MessagesController messagesController = getMessagesController();
        long j10 = this.R;
        TLRPC.UserFull userFull = messagesController.getUserFull(j10);
        if (userFull != null) {
            this.Y = false;
            TL_payments.starRefProgram starrefprogram = userFull.starref_program;
            this.a0 = starrefprogram;
            if (starrefprogram == null) {
                this.Y = true;
                this.a0 = E0();
                this.Z = null;
            } else {
                TL_payments.starRefProgram starrefprogram2 = new TL_payments.starRefProgram();
                this.Z = starrefprogram2;
                TL_payments.starRefProgram starrefprogram3 = this.a0;
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

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        this.d0 = false;
        AndroidUtilities.cancelRunOnUIThread(this.X);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.d20, org.telegram.ui.ActionBar.r2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.c.setPadding(0, 0, 0, AndroidUtilities.dp(84.0f) + i13);
        this.c.setClipToPadding(false);
        this.U.setPadding(0, 0, 0, i13);
    }

    @Override // org.telegram.ui.d20, org.telegram.ui.ActionBar.r2
    public final void onPause() {
        super.onPause();
        ug.n nVar = this.T;
        if (nVar != null) {
            nVar.setPaused(true);
            this.T.setDialogVisible(true);
        }
    }

    @Override // org.telegram.ui.d20, org.telegram.ui.ActionBar.r2
    public final void onResume() {
        super.onResume();
        ug.n nVar = this.T;
        if (nVar != null) {
            nVar.setPaused(false);
            this.T.setDialogVisible(false);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
    }
}
