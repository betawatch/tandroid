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

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class b21 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public LinearLayout a;
    public org.telegram.ui.Components.im0 b;
    public x11 c;
    public int d;
    public int e;
    public int f;
    public int h;
    public z11 n;

    public b21() {
        super(null);
        this.e = -1;
    }

    public static void U(b21 b21Var, View view) {
        int i10;
        int i11;
        if (view instanceof org.telegram.ui.Cells.y) {
            org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) view;
            if (yVar.n && !b21Var.getUserConfig().isPremium()) {
                b21Var.showDialog(new sg.x0((org.telegram.ui.ActionBar.n2) b21Var, 4, true));
                return;
            } else {
                MediaDataController.getInstance(b21Var.currentAccount).setDoubleTapReaction(yVar.f.reaction);
                b21Var.b.getAdapter().q(0, b21Var.b.getAdapter().h());
                return;
            }
        }
        if (view instanceof a21) {
            a21 a21Var = (a21) view;
            if (b21Var.n != null) {
                return;
            }
            q51[] q51VarArr = new q51[1];
            org.telegram.ui.Components.p5 p5Var = a21Var.a;
            if (p5Var != null) {
                p5Var.f();
                a21Var.b();
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(p5Var.getBounds());
                i11 = (-(a21Var.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                i10 = rect.centerX() - ((AndroidUtilities.displaySize.x - AndroidUtilities.dp(12.0f)) - ((int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f)));
            } else {
                i10 = 0;
                i11 = 0;
            }
            y11 y11Var = new y11(b21Var, b21Var, b21Var.getParentActivity(), Integer.valueOf(i10), a21Var, q51VarArr);
            String doubleTapReaction = b21Var.getMediaDataController().getDoubleTapReaction();
            if (doubleTapReaction != null && doubleTapReaction.startsWith("animated_")) {
                try {
                    y11Var.setSelected(Long.valueOf(Long.parseLong(doubleTapReaction.substring(9))));
                } catch (Exception unused) {
                }
            }
            List<TLRPC.TL_availableReaction> reactionsList = b21Var.getMediaDataController().getReactionsList();
            ArrayList arrayList = new ArrayList(20);
            for (int i12 = 0; i12 < reactionsList.size(); i12++) {
                ah.i1 i1Var = new ah.i1();
                i1Var.f = reactionsList.get(i12).reaction;
                arrayList.add(i1Var);
            }
            y11Var.setRecentReactions(arrayList);
            y11Var.setSaveState(3);
            y11Var.y(p5Var, a21Var);
            z11 z11Var = new z11(b21Var, y11Var);
            b21Var.n = z11Var;
            q51VarArr[0] = z11Var;
            z11Var.showAsDropDown(a21Var, 0, i11, 53);
            q51VarArr[0].b();
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
        this.actionBar.setActionBarMenuOnItemClick(new q60(this, 28));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        org.telegram.ui.Components.im0 im0Var = new org.telegram.ui.Components.im0(context, null);
        this.b = im0Var;
        im0Var.p1();
        this.actionBar.setAdaptiveBackground(this.b);
        ((s4.k) this.b.getItemAnimator()).m = false;
        this.b.setLayoutManager(new s4.b0());
        org.telegram.ui.Components.im0 im0Var2 = this.b;
        x11 x11Var = new x11(this, context);
        this.c = x11Var;
        im0Var2.setAdapter(x11Var);
        this.b.setOnItemClickListener(new h11(this, 1));
        linearLayout.addView(this.b, w7.z5.n(-1, -1));
        this.a = linearLayout;
        this.fragmentView = linearLayout;
        linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.a7, false));
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
        return w7.c6.a(new by0(3, this), org.telegram.ui.ActionBar.h6.d6, org.telegram.ui.ActionBar.h6.G6, org.telegram.ui.ActionBar.h6.z6, org.telegram.ui.ActionBar.h6.i6, org.telegram.ui.ActionBar.h6.a7, org.telegram.ui.ActionBar.h6.B6, org.telegram.ui.ActionBar.h6.p7, org.telegram.ui.ActionBar.h6.f6, org.telegram.ui.ActionBar.h6.g6, org.telegram.ui.ActionBar.h6.O6, org.telegram.ui.ActionBar.h6.P6, org.telegram.ui.ActionBar.h6.Q6, org.telegram.ui.ActionBar.h6.R6);
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
