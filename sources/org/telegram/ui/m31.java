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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class m31 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public LinearLayout a;
    public org.telegram.ui.Components.yl0 b;
    public i31 c;
    public int d;
    public int e;
    public int f;
    public int h;
    public k31 n;

    public m31() {
        super(null);
        this.e = -1;
    }

    public static void U(m31 m31Var, View view) {
        int i10;
        int i11;
        if (view instanceof org.telegram.ui.Cells.y) {
            org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) view;
            if (yVar.h && !m31Var.getUserConfig().isPremium()) {
                m31Var.showDialog(new rg.x0((org.telegram.ui.ActionBar.n2) m31Var, 4, true));
                return;
            } else {
                MediaDataController.getInstance(m31Var.currentAccount).setDoubleTapReaction(yVar.e.reaction);
                m31Var.b.getAdapter().q(0, m31Var.b.getAdapter().h());
                return;
            }
        }
        if (view instanceof l31) {
            l31 l31Var = (l31) view;
            if (m31Var.n != null) {
                return;
            }
            a71[] a71VarArr = new a71[1];
            org.telegram.ui.Components.n5 n5Var = l31Var.a;
            if (n5Var != null) {
                n5Var.f();
                l31Var.b();
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(n5Var.getBounds());
                i11 = (-(l31Var.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                i10 = rect.centerX() - ((AndroidUtilities.displaySize.x - AndroidUtilities.dp(12.0f)) - ((int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f)));
            } else {
                i10 = 0;
                i11 = 0;
            }
            j31 j31Var = new j31(m31Var, m31Var, m31Var.getParentActivity(), Integer.valueOf(i10), l31Var, a71VarArr);
            String doubleTapReaction = m31Var.getMediaDataController().getDoubleTapReaction();
            if (doubleTapReaction != null && doubleTapReaction.startsWith("animated_")) {
                try {
                    j31Var.setSelected(Long.valueOf(Long.parseLong(doubleTapReaction.substring(9))));
                } catch (Exception unused) {
                }
            }
            List<TLRPC.TL_availableReaction> reactionsList = m31Var.getMediaDataController().getReactionsList();
            ArrayList arrayList = new ArrayList(20);
            for (int i12 = 0; i12 < reactionsList.size(); i12++) {
                zg.p0 p0Var = new zg.p0();
                p0Var.f = reactionsList.get(i12).reaction;
                arrayList.add(p0Var);
            }
            j31Var.setRecentReactions(arrayList);
            j31Var.setSaveState(3);
            j31Var.y(n5Var, l31Var);
            k31 k31Var = new k31(m31Var, j31Var);
            m31Var.n = k31Var;
            a71VarArr[0] = k31Var;
            k31Var.showAsDropDown(l31Var, 0, i11, 53);
            a71VarArr[0].b();
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
        this.actionBar.setActionBarMenuOnItemClick(new v70(this, 25));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        org.telegram.ui.Components.yl0 yl0Var = new org.telegram.ui.Components.yl0(context, null);
        this.b = yl0Var;
        yl0Var.q1();
        this.actionBar.setAdaptiveBackground(this.b);
        ((s4.j) this.b.getItemAnimator()).m = false;
        this.b.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.yl0 yl0Var2 = this.b;
        i31 i31Var = new i31(this, context);
        this.c = i31Var;
        yl0Var2.setAdapter(i31Var);
        this.b.setOnItemClickListener(new a31(this, 1));
        linearLayout.addView(this.b, w7.y5.n(-1, -1));
        this.a = linearLayout;
        this.fragmentView = linearLayout;
        linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false));
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
        return w7.b6.a(new wy0(4, this), org.telegram.ui.ActionBar.j6.d6, org.telegram.ui.ActionBar.j6.G6, org.telegram.ui.ActionBar.j6.z6, org.telegram.ui.ActionBar.j6.i6, org.telegram.ui.ActionBar.j6.a7, org.telegram.ui.ActionBar.j6.B6, org.telegram.ui.ActionBar.j6.p7, org.telegram.ui.ActionBar.j6.f6, org.telegram.ui.ActionBar.j6.g6, org.telegram.ui.ActionBar.j6.O6, org.telegram.ui.ActionBar.j6.P6, org.telegram.ui.ActionBar.j6.Q6, org.telegram.ui.ActionBar.j6.R6);
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
