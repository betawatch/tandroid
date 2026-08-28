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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class p4 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public o4 a;
    public o4 b;
    public o4 c;
    public o4 d;
    public o4 e;
    public LinearLayout f;
    public final ArrayList h;
    public int n;

    public p4() {
        super(null);
        this.h = new ArrayList();
        this.n = 0;
    }

    public final int T() {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i9 >= arrayList.size()) {
                return this.n;
            }
            if (((o4) arrayList.get(i9)).b.f) {
                return ((o4) arrayList.get(i9)).e;
            }
            i9++;
        }
    }

    public final void U(int i9, boolean z10) {
        TransitionSet transitionSet = new TransitionSet();
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(150L);
        Fade fade = new Fade(1);
        fade.setDuration(150L);
        transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(changeBounds).addTransition(fade);
        transitionSet.setOrdering(0);
        transitionSet.setInterpolator((TimeInterpolator) org.telegram.ui.Components.gr.f);
        TransitionManager.beginDelayedTransition(this.f, transitionSet);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 >= arrayList.size()) {
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    if (((o4) arrayList.get(i11)).d) {
                        this.f.removeView((View) arrayList.get(i11));
                        arrayList.remove(i11);
                        i11--;
                    }
                    i11++;
                }
                int size = arrayList.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList.size()) {
                        break;
                    }
                    if (i9 < ((o4) arrayList.get(i12)).e) {
                        size = i12 + 1;
                        break;
                    }
                    i12++;
                }
                o4 o4Var = new o4(getParentActivity(), null);
                o4Var.d = true;
                o4Var.e = i9;
                o4Var.c(LocaleController.formatString("AutoDeleteAfterShort", R.string.AutoDeleteAfterShort, LocaleController.formatTTLString(i9 * 60)), false, true);
                arrayList.add(size, o4Var);
                this.f.addView(o4Var, size);
                W();
                V(o4Var, z10);
                return;
            }
            if (((o4) arrayList.get(i10)).e == i9) {
                V((View) arrayList.get(i10), z10);
                return;
            }
            i10++;
        }
    }

    public final void V(View view, boolean z10) {
        int i9;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) == view) {
                ((o4) arrayList.get(i10)).a(true, this.fragmentBeginToShow);
            } else {
                ((o4) arrayList.get(i10)).a(false, this.fragmentBeginToShow);
            }
            i10++;
        }
        if (!z10 || (i9 = ((o4) view).e) <= 0) {
            return;
        }
        org.telegram.ui.Components.oc.a0(this).Q(R.raw.fire_on, 36, AndroidUtilities.replaceTags(LocaleController.formatString("AutoDeleteGlobalTimerEnabled", R.string.AutoDeleteGlobalTimerEnabled, LocaleController.formatTTLString(i9 * 60)))).j();
    }

    public final void W() {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i9 >= arrayList.size()) {
                return;
            }
            ((o4) arrayList.get(i9)).setBackground(org.telegram.ui.ActionBar.f6.g0(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.i6, false)));
            ((o4) arrayList.get(i9)).setOnClickListener(new a(this, 3));
            i9++;
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.AutoDeleteMessages));
        this.actionBar.setActionBarMenuOnItemClick(new fh.w4(this, 15));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.a7, false));
        gh.m mVar = new gh.m(getParentActivity());
        org.telegram.ui.Components.in0 in0Var = new org.telegram.ui.Components.in0(getParentActivity(), mVar, this.resourceProvider, true);
        mVar.setOrientation(1);
        in0Var.addView(mVar);
        frameLayout.addView(in0Var);
        this.actionBar.setAdaptiveBackground(in0Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        org.telegram.ui.Components.hw0 hw0Var = new org.telegram.ui.Components.hw0(context, this.currentAccount);
        hw0Var.setStickerNum(10);
        frameLayout2.addView(hw0Var, g7.e6.e(130, 130, 17));
        frameLayout2.setTag(-33024);
        mVar.addView(frameLayout2, g7.e6.n(-1, 170));
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.f = linearLayout;
        linearLayout.setOrientation(1);
        this.f.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
        mVar.addView(this.f, g7.e6.n(-1, -2));
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(getParentActivity());
        m4Var.setText(LocaleController.getString(R.string.MessageLifetime));
        this.f.addView(m4Var);
        o4 o4Var = new o4(getParentActivity(), null);
        this.a = o4Var;
        o4Var.c(LocaleController.getString(R.string.ShortMessageLifetimeForever), false, true);
        o4 o4Var2 = this.a;
        o4Var2.e = 0;
        this.f.addView(o4Var2);
        o4 o4Var3 = new o4(getParentActivity(), null);
        this.b = o4Var3;
        o4Var3.c(LocaleController.getString(R.string.AutoDeleteAfter1Day), false, true);
        o4 o4Var4 = this.b;
        o4Var4.e = 1440;
        this.f.addView(o4Var4);
        o4 o4Var5 = new o4(getParentActivity(), null);
        this.c = o4Var5;
        o4Var5.c(LocaleController.getString(R.string.AutoDeleteAfter1Week), false, true);
        o4 o4Var6 = this.c;
        o4Var6.e = 10080;
        this.f.addView(o4Var6);
        o4 o4Var7 = new o4(getParentActivity(), null);
        this.d = o4Var7;
        o4Var7.c(LocaleController.getString(R.string.AutoDeleteAfter1Month), false, true);
        o4 o4Var8 = this.d;
        o4Var8.e = 44640;
        this.f.addView(o4Var8);
        o4 o4Var9 = new o4(getParentActivity(), null);
        this.e = o4Var9;
        o4Var9.c(LocaleController.getString(R.string.SetCustomTime), false, false);
        this.e.b.setVisibility(8);
        this.f.addView(this.e);
        o4 o4Var10 = this.a;
        ArrayList arrayList = this.h;
        arrayList.add(o4Var10);
        arrayList.add(this.b);
        arrayList.add(this.c);
        arrayList.add(this.d);
        arrayList.add(this.e);
        W();
        org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(context, 12, this.resourceProvider);
        b9Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GlobalAutoDeleteInfo), new m4(this)));
        mVar.addView(b9Var, g7.e6.n(-1, -2));
        U(this.n, false);
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
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i9 >= arrayList.size()) {
                return;
            }
            if (((o4) arrayList.get(i9)).b.f) {
                if (((o4) arrayList.get(i9)).e != this.n) {
                    this.n = ((o4) arrayList.get(i9)).e;
                    TLRPC.TL_messages_setDefaultHistoryTTL tL_messages_setDefaultHistoryTTL = new TLRPC.TL_messages_setDefaultHistoryTTL();
                    tL_messages_setDefaultHistoryTTL.period = ((o4) arrayList.get(i9)).e * 60;
                    getConnectionsManager().sendRequest(tL_messages_setDefaultHistoryTTL, new n4());
                    getUserConfig().setGlobalTtl(this.n);
                    NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateGlobalAutoDeleteTimer, new Object[0]);
                    return;
                }
                return;
            }
            i9++;
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
    }
}
