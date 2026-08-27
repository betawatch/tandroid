package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class g21 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public LinearLayout a;
    public org.telegram.ui.Components.zk0 b;
    public c21 c;
    public int d;
    public int e;
    public int f;
    public int h;
    public e21 n;

    public g21() {
        super(null);
        this.e = -1;
    }

    public static void U(g21 g21Var, View view) {
        int i10;
        int i11;
        if (view instanceof org.telegram.ui.Cells.y) {
            org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) view;
            if (yVar.h && !g21Var.getUserConfig().isPremium()) {
                g21Var.showDialog(new ag.g2((org.telegram.ui.ActionBar.n2) g21Var, 4, true));
                return;
            } else {
                MediaDataController.getInstance(g21Var.currentAccount).setDoubleTapReaction(yVar.e.reaction);
                g21Var.b.getAdapter().q(0, g21Var.b.getAdapter().h());
                return;
            }
        }
        if (view instanceof f21) {
            f21 f21Var = (f21) view;
            if (g21Var.n != null) {
                return;
            }
            r51[] r51VarArr = new r51[1];
            org.telegram.ui.Components.i5 i5Var = f21Var.a;
            if (i5Var != null) {
                i5Var.f();
                f21Var.b();
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(i5Var.getBounds());
                i11 = (-(f21Var.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                i10 = rect.centerX() - ((AndroidUtilities.displaySize.x - AndroidUtilities.dp(12.0f)) - ((int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f)));
            } else {
                i10 = 0;
                i11 = 0;
            }
            d21 d21Var = new d21(g21Var, g21Var, g21Var.getParentActivity(), Integer.valueOf(i10), f21Var, r51VarArr);
            String doubleTapReaction = g21Var.getMediaDataController().getDoubleTapReaction();
            if (doubleTapReaction != null && doubleTapReaction.startsWith("animated_")) {
                try {
                    d21Var.setSelected(Long.valueOf(Long.parseLong(doubleTapReaction.substring(9))));
                } catch (Exception unused) {
                }
            }
            List<TLRPC.TL_availableReaction> reactionsList = g21Var.getMediaDataController().getReactionsList();
            ArrayList arrayList = new ArrayList(20);
            for (int i12 = 0; i12 < reactionsList.size(); i12++) {
                ig.q0 q0Var = new ig.q0();
                q0Var.f = reactionsList.get(i12).reaction;
                arrayList.add(q0Var);
            }
            d21Var.setRecentReactions(arrayList);
            d21Var.setSaveState(3);
            d21Var.y(i5Var, f21Var);
            e21 e21Var = new e21(g21Var, d21Var);
            g21Var.n = e21Var;
            r51VarArr[0] = e21Var;
            e21Var.showAsDropDown(f21Var, 0, i11, 53);
            r51VarArr[0].b();
        }
    }

    public final void c0() {
        this.h = 2;
        this.d = 1;
        if (!UserConfig.getInstance(this.currentAccount).isPremium()) {
            this.f = -1;
            this.e = this.h;
        } else {
            this.e = -1;
            int i10 = this.h;
            this.h = i10 + 1;
            this.f = i10;
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        this.actionBar.setTitle(LocaleController.getString(R.string.Reactions));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new pb0(this, 21));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        org.telegram.ui.Components.zk0 zk0Var = new org.telegram.ui.Components.zk0(context, null);
        this.b = zk0Var;
        zk0Var.p1();
        this.actionBar.setAdaptiveBackground(this.b);
        ((f2.l) this.b.getItemAnimator()).m = false;
        this.b.setLayoutManager(new f2.k0());
        org.telegram.ui.Components.zk0 zk0Var2 = this.b;
        c21 c21Var = new c21(this, context);
        this.c = c21Var;
        zk0Var2.setAdapter(c21Var);
        this.b.setOnItemClickListener(new b21(this, 0));
        linearLayout.addView(this.b, h7.z5.n(-1, -1));
        this.a = linearLayout;
        this.fragmentView = linearLayout;
        linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.a7, false));
        this.c.l();
        c0();
        return this.a;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i11 != this.currentAccount) {
            return;
        }
        if (i10 == NotificationCenter.reactionsDidLoad) {
            this.c.l();
        } else if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
            c0();
            this.c.l();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        return h7.c6.a(new sx0(4, this), org.telegram.ui.ActionBar.g6.d6, org.telegram.ui.ActionBar.g6.G6, org.telegram.ui.ActionBar.g6.z6, org.telegram.ui.ActionBar.g6.i6, org.telegram.ui.ActionBar.g6.a7, org.telegram.ui.ActionBar.g6.B6, org.telegram.ui.ActionBar.g6.p7, org.telegram.ui.ActionBar.g6.f6, org.telegram.ui.ActionBar.g6.g6, org.telegram.ui.ActionBar.g6.O6, org.telegram.ui.ActionBar.g6.P6, org.telegram.ui.ActionBar.g6.Q6, org.telegram.ui.ActionBar.g6.R6);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.reactionsDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.reactionsDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.b.setPadding(0, 0, 0, i13);
        this.b.setClipToPadding(false);
    }
}
