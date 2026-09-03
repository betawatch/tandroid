package gg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.z8;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.pb1;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class m1 extends eg.e2 {
    public final ArrayList N0;

    public m1(org.telegram.ui.ActionBar.p2 p2Var, int i10, ArrayList arrayList, f6 f6Var) {
        super(p2Var, i10, null, null, null, f6Var);
        ArrayList arrayList2 = new ArrayList();
        this.N0 = arrayList2;
        arrayList2.addAll(arrayList);
        b0();
        this.useBackgroundTopPadding = false;
        setApplyTopPadding(false);
        this.backgroundPaddingTop = 0;
        ig.a aVar = new ig.a(getContext(), this.resourcesProvider);
        aVar.setOnClickListener(new androidx.mediarouter.app.c(this, 8));
        aVar.setCloseStyle(true);
        this.containerView.addView(aVar, b6.d(-1, 64.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        rl0 rl0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        rl0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(64.0f));
        Context context = getContext();
        int i12 = l1.f;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipChildren(false);
        if (arrayList2.size() == 1) {
            frameLayout.addView(frameLayout2, b6.d(-1, 94.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            l1 l1Var = new l1(context, 47.0f);
            l1Var.d = false;
            TLRPC.User user = (TLRPC.User) arrayList2.get(0);
            z8 z8Var = l1Var.e;
            z8Var.r(user);
            l1Var.a.e(user, z8Var);
            frameLayout2.addView(l1Var, 0, b6.e(94, 94, 17));
        } else {
            frameLayout.addView(frameLayout2, b6.d(-1, 83.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            int i13 = 0;
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                TLRPC.User user2 = (TLRPC.User) arrayList2.get(i14);
                l1 l1Var2 = new l1(context, 41.5f);
                z8 z8Var2 = l1Var2.e;
                z8Var2.r(user2);
                l1Var2.a.e(user2, z8Var2);
                frameLayout2.addView(l1Var2, 0, b6.e(83, 83, 17));
                l1Var2.setTranslationX(AndroidUtilities.dp(29.0f) * (-i14));
                if (i14 == 0 && arrayList2.size() > 3) {
                    k1 k1Var = l1Var2.b;
                    k1Var.setAlpha(1.0f);
                    k1Var.b = arrayList2.size() - 3;
                }
                i13++;
                if (i14 == 2) {
                    break;
                }
            }
            frameLayout.setTranslationX((i13 - 1) * AndroidUtilities.dp(14.5f));
        }
        this.y0 = frameLayout;
        fixNavigationBar();
    }

    public static void c0(ArrayList arrayList) {
        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        m1 m1Var = new m1(R, UserConfig.selectedAccount, arrayList, R.getResourceProvider());
        m1Var.G0 = true;
        m1Var.H0 = true;
        m1Var.show();
    }

    @Override // eg.e2
    public final void V(int i10, View view) {
        if (i10 == 0) {
            view.setOutlineProvider(new j1(0));
            view.setClipToOutline(true);
            view.setBackgroundColor(j6.v0(j6.a7, this.resourcesProvider));
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = -AndroidUtilities.dp(6.0f);
        }
    }

    @Override // eg.e2
    public final void W(pb1 pb1Var) {
        View view = this.y0;
        ArrayList arrayList = this.N0;
        pb1Var.addView(view, b6.k(0.0f, arrayList.size() == 1 ? 28.0f : 34.0f, 0.0f, arrayList.size() == 1 ? 9.0f : 14.0f, -1, arrayList.size() == 1 ? 94 : 83));
    }

    @Override // eg.e2
    public final void a0(boolean z4) {
        String formatString;
        this.L0[0].setTextSize(1, 20.0f);
        this.M0.setPadding(AndroidUtilities.dp(30.0f), 0, AndroidUtilities.dp(30.0f), 0);
        this.M0.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        f90 f90Var = this.L0[0];
        ArrayList arrayList = this.N0;
        f90Var.setText(LocaleController.getPluralString("GiftPremiumGiftsSent", arrayList.size()));
        ((ViewGroup.MarginLayoutParams) this.M0.getLayoutParams()).bottomMargin = AndroidUtilities.dp(16.0f);
        ((ViewGroup.MarginLayoutParams) this.M0.getLayoutParams()).topMargin = AndroidUtilities.dp(4.0f);
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
        this.M0.setText(AndroidUtilities.replaceTags(formatString));
        this.M0.append("\n");
        this.M0.append("\n");
        if (arrayList.size() == 1) {
            this.M0.append(AndroidUtilities.replaceTags(LocaleController.formatString("GiftPremiumGiftsSentStatusForUser", R.string.GiftPremiumGiftsSentStatusForUser, UserObject.getFirstName((TLRPC.User) arrayList.get(0)))));
        } else {
            this.M0.append(AndroidUtilities.replaceTags(LocaleController.getString("GiftPremiumGiftsSentStatus", R.string.GiftPremiumGiftsSentStatus)));
        }
    }

    @Override // eg.e2
    public final void b0() {
        this.c0 = 1;
        this.d0 = 0;
        this.g0 = 1;
        int size = this.U.size();
        int i10 = 1 + size;
        this.h0 = i10;
        this.c0 = size + 2;
        this.k0 = i10;
    }
}
