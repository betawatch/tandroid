package org.telegram.ui;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class q4 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public p4 a;
    public p4 b;
    public p4 c;
    public p4 d;
    public p4 e;
    public LinearLayout f;
    public final ArrayList h;
    public int n;

    public q4() {
        super(null);
        this.h = new ArrayList();
        this.n = 0;
    }

    public final int U() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 >= arrayList.size()) {
                return this.n;
            }
            if (((p4) arrayList.get(i10)).b.f) {
                return ((p4) arrayList.get(i10)).e;
            }
            i10++;
        }
    }

    public final void V(int i10, boolean z10) {
        TransitionSet transitionSet = new TransitionSet();
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(150L);
        Fade fade = new Fade(1);
        fade.setDuration(150L);
        transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(changeBounds).addTransition(fade);
        transitionSet.setOrdering(0);
        transitionSet.setInterpolator((TimeInterpolator) org.telegram.ui.Components.jr.f);
        TransitionManager.beginDelayedTransition(this.f, transitionSet);
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i11 >= arrayList.size()) {
                int i12 = 0;
                while (i12 < arrayList.size()) {
                    if (((p4) arrayList.get(i12)).d) {
                        this.f.removeView((View) arrayList.get(i12));
                        arrayList.remove(i12);
                        i12--;
                    }
                    i12++;
                }
                int size = arrayList.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= arrayList.size()) {
                        break;
                    }
                    if (i10 < ((p4) arrayList.get(i13)).e) {
                        size = i13 + 1;
                        break;
                    }
                    i13++;
                }
                p4 p4Var = new p4(getParentActivity(), null);
                p4Var.d = true;
                p4Var.e = i10;
                p4Var.c(LocaleController.formatString("AutoDeleteAfterShort", R.string.AutoDeleteAfterShort, LocaleController.formatTTLString(i10 * 60)), false, true);
                arrayList.add(size, p4Var);
                this.f.addView(p4Var, size);
                X();
                W(p4Var, z10);
                return;
            }
            if (((p4) arrayList.get(i11)).e == i10) {
                W((View) arrayList.get(i11), z10);
                return;
            }
            i11++;
        }
    }

    public final void W(View view, boolean z10) {
        int i10;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i11 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i11) == view) {
                ((p4) arrayList.get(i11)).a(true, this.fragmentBeginToShow);
            } else {
                ((p4) arrayList.get(i11)).a(false, this.fragmentBeginToShow);
            }
            i11++;
        }
        if (!z10 || (i10 = ((p4) view).e) <= 0) {
            return;
        }
        org.telegram.ui.Components.tc.a0(this).Q(R.raw.fire_on, 36, AndroidUtilities.replaceTags(LocaleController.formatString("AutoDeleteGlobalTimerEnabled", R.string.AutoDeleteGlobalTimerEnabled, LocaleController.formatTTLString(i10 * 60)))).j();
    }

    public final void X() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((p4) arrayList.get(i10)).setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.i6, false)));
            ((p4) arrayList.get(i10)).setOnClickListener(new a(this, 3));
            i10++;
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.AutoDeleteMessages));
        this.actionBar.setActionBarMenuOnItemClick(new cg.n1(this, 7));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.a7, false));
        bg.y3 y3Var = new bg.y3(getParentActivity());
        org.telegram.ui.Components.un0 un0Var = new org.telegram.ui.Components.un0(getParentActivity(), y3Var, this.resourceProvider, true);
        y3Var.setOrientation(1);
        un0Var.addView(y3Var);
        frameLayout.addView(un0Var);
        this.actionBar.setAdaptiveBackground(un0Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        org.telegram.ui.Components.rw0 rw0Var = new org.telegram.ui.Components.rw0(context, this.currentAccount);
        rw0Var.setStickerNum(10);
        frameLayout2.addView(rw0Var, i7.f6.e(130, 130, 17));
        frameLayout2.setTag(-33024);
        y3Var.addView(frameLayout2, i7.f6.n(-1, 170));
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.f = linearLayout;
        linearLayout.setOrientation(1);
        this.f.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
        y3Var.addView(this.f, i7.f6.n(-1, -2));
        org.telegram.ui.Cells.k4 k4Var = new org.telegram.ui.Cells.k4(getParentActivity());
        k4Var.setText(LocaleController.getString(R.string.MessageLifetime));
        this.f.addView(k4Var);
        p4 p4Var = new p4(getParentActivity(), null);
        this.a = p4Var;
        p4Var.c(LocaleController.getString(R.string.ShortMessageLifetimeForever), false, true);
        p4 p4Var2 = this.a;
        p4Var2.e = 0;
        this.f.addView(p4Var2);
        p4 p4Var3 = new p4(getParentActivity(), null);
        this.b = p4Var3;
        p4Var3.c(LocaleController.getString(R.string.AutoDeleteAfter1Day), false, true);
        p4 p4Var4 = this.b;
        p4Var4.e = 1440;
        this.f.addView(p4Var4);
        p4 p4Var5 = new p4(getParentActivity(), null);
        this.c = p4Var5;
        p4Var5.c(LocaleController.getString(R.string.AutoDeleteAfter1Week), false, true);
        p4 p4Var6 = this.c;
        p4Var6.e = 10080;
        this.f.addView(p4Var6);
        p4 p4Var7 = new p4(getParentActivity(), null);
        this.d = p4Var7;
        p4Var7.c(LocaleController.getString(R.string.AutoDeleteAfter1Month), false, true);
        p4 p4Var8 = this.d;
        p4Var8.e = 44640;
        this.f.addView(p4Var8);
        p4 p4Var9 = new p4(getParentActivity(), null);
        this.e = p4Var9;
        p4Var9.c(LocaleController.getString(R.string.SetCustomTime), false, false);
        this.e.b.setVisibility(8);
        this.f.addView(this.e);
        p4 p4Var10 = this.a;
        ArrayList arrayList = this.h;
        arrayList.add(p4Var10);
        arrayList.add(this.b);
        arrayList.add(this.c);
        arrayList.add(this.d);
        arrayList.add(this.e);
        X();
        org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context, 12, this.resourceProvider);
        y8Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GlobalAutoDeleteInfo), new n4(this)));
        y3Var.addView(y8Var, i7.f6.n(-1, -2));
        V(this.n, false);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        int globalTTl = getUserConfig().getGlobalTTl();
        this.n = globalTTl;
        if (globalTTl < 0) {
            this.n = 0;
        }
        getUserConfig().loadGlobalTTl();
        getNotificationCenter().addObserver(this, NotificationCenter.didUpdateGlobalAutoDeleteTimer);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.didUpdateGlobalAutoDeleteTimer);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onPause() {
        super.onPause();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 >= arrayList.size()) {
                return;
            }
            if (((p4) arrayList.get(i10)).b.f) {
                if (((p4) arrayList.get(i10)).e != this.n) {
                    this.n = ((p4) arrayList.get(i10)).e;
                    TLRPC.TL_messages_setDefaultHistoryTTL tL_messages_setDefaultHistoryTTL = new TLRPC.TL_messages_setDefaultHistoryTTL();
                    tL_messages_setDefaultHistoryTTL.period = ((p4) arrayList.get(i10)).e * 60;
                    getConnectionsManager().sendRequest(tL_messages_setDefaultHistoryTTL, new o4());
                    getUserConfig().setGlobalTtl(this.n);
                    NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateGlobalAutoDeleteTimer, new Object[0]);
                    return;
                }
                return;
            }
            i10++;
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
    }
}
