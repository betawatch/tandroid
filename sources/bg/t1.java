package bg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import g7.e6;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z8;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ta1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class t1 extends zf.k1 {
    public final ArrayList M0;

    public t1(org.telegram.ui.ActionBar.o2 o2Var, int i9, ArrayList arrayList, b6 b6Var) {
        super(o2Var, i9, null, null, null, b6Var);
        ArrayList arrayList2 = new ArrayList();
        this.M0 = arrayList2;
        arrayList2.addAll(arrayList);
        a0();
        this.useBackgroundTopPadding = false;
        setApplyTopPadding(false);
        this.backgroundPaddingTop = 0;
        dg.a aVar = new dg.a(getContext(), this.resourcesProvider);
        aVar.setOnClickListener(new androidx.mediarouter.app.c(this, 2));
        aVar.setCloseStyle(true);
        this.containerView.addView(aVar, e6.d(-1, 64.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        wk0 wk0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        wk0Var.setPadding(i10, 0, i10, AndroidUtilities.dp(64.0f));
        Context context = getContext();
        int i11 = s1.f;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipChildren(false);
        if (arrayList2.size() == 1) {
            frameLayout.addView(frameLayout2, e6.d(-1, 94.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            s1 s1Var = new s1(context, 47.0f);
            s1Var.d = false;
            TLRPC.User user = (TLRPC.User) arrayList2.get(0);
            z8 z8Var = s1Var.e;
            z8Var.r(user);
            s1Var.a.e(user, z8Var);
            frameLayout2.addView(s1Var, 0, e6.e(94, 94, 17));
        } else {
            frameLayout.addView(frameLayout2, e6.d(-1, 83.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            int i12 = 0;
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                TLRPC.User user2 = (TLRPC.User) arrayList2.get(i13);
                s1 s1Var2 = new s1(context, 41.5f);
                z8 z8Var2 = s1Var2.e;
                z8Var2.r(user2);
                s1Var2.a.e(user2, z8Var2);
                frameLayout2.addView(s1Var2, 0, e6.e(83, 83, 17));
                s1Var2.setTranslationX(AndroidUtilities.dp(29.0f) * (-i13));
                if (i13 == 0 && arrayList2.size() > 3) {
                    r1 r1Var = s1Var2.b;
                    r1Var.setAlpha(1.0f);
                    r1Var.b = arrayList2.size() - 3;
                }
                i12++;
                if (i13 == 2) {
                    break;
                }
            }
            frameLayout.setTranslationX((i12 - 1) * AndroidUtilities.dp(14.5f));
        }
        this.x0 = frameLayout;
        fixNavigationBar();
    }

    public static void b0(ArrayList arrayList) {
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        t1 t1Var = new t1(R, UserConfig.selectedAccount, arrayList, R.getResourceProvider());
        t1Var.F0 = true;
        t1Var.G0 = true;
        t1Var.show();
    }

    @Override // zf.k1
    public final void U(int i9, View view) {
        if (i9 == 0) {
            view.setOutlineProvider(new q1(0));
            view.setClipToOutline(true);
            view.setBackgroundColor(f6.v0(f6.a7, this.resourcesProvider));
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = -AndroidUtilities.dp(6.0f);
        }
    }

    @Override // zf.k1
    public final void V(ta1 ta1Var) {
        View view = this.x0;
        ArrayList arrayList = this.M0;
        ta1Var.addView(view, e6.k(0.0f, arrayList.size() == 1 ? 28.0f : 34.0f, 0.0f, arrayList.size() == 1 ? 9.0f : 14.0f, -1, arrayList.size() == 1 ? 94 : 83));
    }

    @Override // zf.k1
    public final void Z(boolean z10) {
        String formatString;
        this.K0[0].setTextSize(1, 20.0f);
        this.L0.setPadding(AndroidUtilities.dp(30.0f), 0, AndroidUtilities.dp(30.0f), 0);
        this.L0.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        l80 l80Var = this.K0[0];
        ArrayList arrayList = this.M0;
        l80Var.setText(LocaleController.getPluralString("GiftPremiumGiftsSent", arrayList.size()));
        ((ViewGroup.MarginLayoutParams) this.L0.getLayoutParams()).bottomMargin = AndroidUtilities.dp(16.0f);
        ((ViewGroup.MarginLayoutParams) this.L0.getLayoutParams()).topMargin = AndroidUtilities.dp(4.0f);
        int size = arrayList.size();
        if (size == 1) {
            formatString = LocaleController.formatString(R.string.GiftPremiumUsersPurchasedManyZero, LocaleController.formatString(R.string.GiftPremiumUsersOne, UserObject.getFirstName((TLRPC.User) arrayList.get(0))));
        } else if (size == 2) {
            formatString = LocaleController.formatString("GiftPremiumUsersPurchasedManyZero", R.string.GiftPremiumUsersPurchasedManyZero, LocaleController.formatString("GiftPremiumUsersTwo", R.string.GiftPremiumUsersTwo, UserObject.getFirstName((TLRPC.User) arrayList.get(0)), UserObject.getFirstName((TLRPC.User) arrayList.get(1))));
        } else if (size != 3) {
            formatString = LocaleController.formatPluralString("GiftPremiumUsersPurchasedMany", arrayList.size() - 3, LocaleController.formatString("GiftPremiumUsersThree", R.string.GiftPremiumUsersThree, UserObject.getFirstName((TLRPC.User) arrayList.get(0)), UserObject.getFirstName((TLRPC.User) arrayList.get(1)), UserObject.getFirstName((TLRPC.User) arrayList.get(2))));
        } else {
            formatString = LocaleController.formatString("GiftPremiumUsersPurchasedManyZero", R.string.GiftPremiumUsersPurchasedManyZero, LocaleController.formatString("GiftPremiumUsersThree", R.string.GiftPremiumUsersThree, UserObject.getFirstName((TLRPC.User) arrayList.get(0)), UserObject.getFirstName((TLRPC.User) arrayList.get(1)), UserObject.getFirstName((TLRPC.User) arrayList.get(2))));
        }
        this.L0.setText(AndroidUtilities.replaceTags(formatString));
        this.L0.append("\n");
        this.L0.append("\n");
        if (arrayList.size() == 1) {
            this.L0.append(AndroidUtilities.replaceTags(LocaleController.formatString("GiftPremiumGiftsSentStatusForUser", R.string.GiftPremiumGiftsSentStatusForUser, UserObject.getFirstName((TLRPC.User) arrayList.get(0)))));
        } else {
            this.L0.append(AndroidUtilities.replaceTags(LocaleController.getString("GiftPremiumGiftsSentStatus", R.string.GiftPremiumGiftsSentStatus)));
        }
    }

    @Override // zf.k1
    public final void a0() {
        this.b0 = 1;
        this.c0 = 0;
        this.f0 = 1;
        int size = this.T.size();
        int i9 = 1 + size;
        this.g0 = i9;
        this.b0 = size + 2;
        this.j0 = i9;
    }
}
