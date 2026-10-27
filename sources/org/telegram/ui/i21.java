package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class i21 extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Components.nm0 a;
    public e21 b;
    public int c;
    public int d;
    public int e;
    public int f;
    public NotificationCenter.ObserversGroup h;
    public g21 n;

    public i21() {
        super(null);
        this.d = -1;
    }

    public static void V(i21 i21Var, View view) {
        int i10;
        int i11;
        if (view instanceof org.telegram.ui.Cells.x) {
            org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) view;
            if (xVar.n && !i21Var.getUserConfig().isPremium()) {
                i21Var.showDialog(new tg.y0((org.telegram.ui.ActionBar.r2) i21Var, 4, true));
                return;
            } else {
                MediaDataController.getInstance(i21Var.currentAccount).setDoubleTapReaction(xVar.f.reaction);
                i21Var.a.getAdapter().q(0, i21Var.a.getAdapter().h());
                return;
            }
        }
        if (view instanceof h21) {
            h21 h21Var = (h21) view;
            if (i21Var.n != null) {
                return;
            }
            w51[] w51VarArr = new w51[1];
            org.telegram.ui.Components.r5 r5Var = h21Var.a;
            if (r5Var != null) {
                r5Var.f();
                h21Var.b();
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(r5Var.getBounds());
                i11 = (-(h21Var.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                i10 = rect.centerX() - ((AndroidUtilities.displaySize.x - AndroidUtilities.dp(12.0f)) - ((int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f)));
            } else {
                i10 = 0;
                i11 = 0;
            }
            f21 f21Var = new f21(i21Var, i21Var, i21Var.getParentActivity(), Integer.valueOf(i10), h21Var, w51VarArr);
            String doubleTapReaction = i21Var.getMediaDataController().getDoubleTapReaction();
            if (doubleTapReaction != null && doubleTapReaction.startsWith("animated_")) {
                try {
                    f21Var.setSelected(Long.valueOf(Long.parseLong(doubleTapReaction.substring(9))));
                } catch (Exception unused) {
                }
            }
            List<TLRPC.TL_availableReaction> reactionsList = i21Var.getMediaDataController().getReactionsList();
            ArrayList arrayList = new ArrayList(20);
            for (int i12 = 0; i12 < reactionsList.size(); i12++) {
                bh.x0 x0Var = new bh.x0();
                x0Var.f = reactionsList.get(i12).reaction;
                arrayList.add(x0Var);
            }
            f21Var.setRecentReactions(arrayList);
            f21Var.setSaveState(3);
            f21Var.y(r5Var, h21Var);
            g21 g21Var = new g21(i21Var, f21Var);
            i21Var.n = g21Var;
            w51VarArr[0] = g21Var;
            g21Var.showAsDropDown(h21Var, 0, i11, 53);
            w51VarArr[0].b();
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.Reactions));
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setActionBarMenuOnItemClick(new r11(this, 1));
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.nm0 nm0Var = new org.telegram.ui.Components.nm0(context, null);
        this.a = nm0Var;
        nm0Var.u1();
        this.a.setSectionsDrawBackground(true);
        ((s4.l) this.a.getItemAnimator()).m = false;
        this.a.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.nm0 nm0Var2 = this.a;
        e21 e21Var = new e21(this, context);
        this.b = e21Var;
        nm0Var2.setAdapter(e21Var);
        this.a.setOnItemClickListener(new o11(this, 1));
        frameLayout.addView(this.a, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        this.fragmentView = frameLayout;
        this.b.l();
        d0();
        return frameLayout;
    }

    public final void d0() {
        this.f = 2;
        this.c = 1;
        if (!UserConfig.getInstance(this.currentAccount).isPremium()) {
            this.e = -1;
            this.d = this.f;
        } else {
            this.d = -1;
            int i10 = this.f;
            this.f = i10 + 1;
            this.e = i10;
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i11 != this.currentAccount) {
            return;
        }
        if (i10 == NotificationCenter.reactionsDidLoad) {
            this.b.l();
        } else if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
            d0();
            this.b.l();
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final org.telegram.ui.Components.nm0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final ArrayList getThemeDescriptions() {
        return org.telegram.ui.Components.kb1.C(new j6(21, this), org.telegram.ui.ActionBar.y6.d6, org.telegram.ui.ActionBar.y6.G6, org.telegram.ui.ActionBar.y6.z6, org.telegram.ui.ActionBar.y6.i6, org.telegram.ui.ActionBar.y6.a7, org.telegram.ui.ActionBar.y6.B6, org.telegram.ui.ActionBar.y6.p7, org.telegram.ui.ActionBar.y6.f6, org.telegram.ui.ActionBar.y6.g6, org.telegram.ui.ActionBar.y6.O6, org.telegram.ui.ActionBar.y6.P6, org.telegram.ui.ActionBar.y6.Q6, org.telegram.ui.ActionBar.y6.R6);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onFragmentCreate() {
        NotificationCenter.ObserversGroup observersGroup = this.h;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.h = null;
        }
        this.h = getNotificationCenter().createObserversGroup(this).add(NotificationCenter.reactionsDidLoad).add(NotificationCenter.currentUserPremiumStatusChanged);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.ObserversGroup observersGroup = this.h;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.h = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
