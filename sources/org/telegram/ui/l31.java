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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class l31 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public LinearLayout a;
    public org.telegram.ui.Components.qm0 b;
    public h31 c;
    public int d;
    public int e;
    public int f;
    public int h;
    public j31 n;

    public l31() {
        super(null);
        this.e = -1;
    }

    public static void U(l31 l31Var, View view) {
        int i10;
        int i11;
        if (view instanceof org.telegram.ui.Cells.y) {
            org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) view;
            if (yVar.n && !l31Var.getUserConfig().isPremium()) {
                l31Var.showDialog(new rg.y0((org.telegram.ui.ActionBar.n2) l31Var, 4, true));
                return;
            } else {
                MediaDataController.getInstance(l31Var.currentAccount).setDoubleTapReaction(yVar.f.reaction);
                l31Var.b.getAdapter().q(0, l31Var.b.getAdapter().h());
                return;
            }
        }
        if (view instanceof k31) {
            k31 k31Var = (k31) view;
            if (l31Var.n != null) {
                return;
            }
            b71[] b71VarArr = new b71[1];
            org.telegram.ui.Components.q5 q5Var = k31Var.a;
            if (q5Var != null) {
                q5Var.f();
                k31Var.b();
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(q5Var.getBounds());
                i11 = (-(k31Var.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                i10 = rect.centerX() - ((AndroidUtilities.displaySize.x - AndroidUtilities.dp(12.0f)) - ((int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f)));
            } else {
                i10 = 0;
                i11 = 0;
            }
            i31 i31Var = new i31(l31Var, l31Var, l31Var.getParentActivity(), Integer.valueOf(i10), k31Var, b71VarArr);
            String doubleTapReaction = l31Var.getMediaDataController().getDoubleTapReaction();
            if (doubleTapReaction != null && doubleTapReaction.startsWith("animated_")) {
                try {
                    i31Var.setSelected(Long.valueOf(Long.parseLong(doubleTapReaction.substring(9))));
                } catch (Exception unused) {
                }
            }
            List<TLRPC.TL_availableReaction> reactionsList = l31Var.getMediaDataController().getReactionsList();
            ArrayList arrayList = new ArrayList(20);
            for (int i12 = 0; i12 < reactionsList.size(); i12++) {
                zg.n0 n0Var = new zg.n0();
                n0Var.f = reactionsList.get(i12).reaction;
                arrayList.add(n0Var);
            }
            i31Var.setRecentReactions(arrayList);
            i31Var.setSaveState(3);
            i31Var.y(q5Var, k31Var);
            j31 j31Var = new j31(l31Var, i31Var);
            l31Var.n = j31Var;
            b71VarArr[0] = j31Var;
            j31Var.showAsDropDown(k31Var, 0, i11, 53);
            b71VarArr[0].b();
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
        this.actionBar.setActionBarMenuOnItemClick(new u70(this, 25));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        org.telegram.ui.Components.qm0 qm0Var = new org.telegram.ui.Components.qm0(context, null);
        this.b = qm0Var;
        qm0Var.p1();
        this.actionBar.setAdaptiveBackground(this.b);
        ((s4.j) this.b.getItemAnimator()).m = false;
        this.b.setLayoutManager(new s4.d0());
        org.telegram.ui.Components.qm0 qm0Var2 = this.b;
        h31 h31Var = new h31(this, context);
        this.c = h31Var;
        qm0Var2.setAdapter(h31Var);
        this.b.setOnItemClickListener(new z21(this, 1));
        linearLayout.addView(this.b, w7.x5.n(-1, -1));
        this.a = linearLayout;
        this.fragmentView = linearLayout;
        linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.a7, false));
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
        return w7.a6.a(new wy0(4, this), org.telegram.ui.ActionBar.i6.d6, org.telegram.ui.ActionBar.i6.G6, org.telegram.ui.ActionBar.i6.z6, org.telegram.ui.ActionBar.i6.i6, org.telegram.ui.ActionBar.i6.a7, org.telegram.ui.ActionBar.i6.B6, org.telegram.ui.ActionBar.i6.p7, org.telegram.ui.ActionBar.i6.f6, org.telegram.ui.ActionBar.i6.g6, org.telegram.ui.ActionBar.i6.O6, org.telegram.ui.ActionBar.i6.P6, org.telegram.ui.ActionBar.i6.Q6, org.telegram.ui.ActionBar.i6.R6);
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
