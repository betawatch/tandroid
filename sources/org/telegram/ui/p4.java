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

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class p4 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
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

    public final int U() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 >= arrayList.size()) {
                return this.n;
            }
            if (((o4) arrayList.get(i10)).b.f) {
                return ((o4) arrayList.get(i10)).e;
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
        transitionSet.setInterpolator((TimeInterpolator) org.telegram.ui.Components.rr.f);
        TransitionManager.beginDelayedTransition(this.f, transitionSet);
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i11 >= arrayList.size()) {
                int i12 = 0;
                while (i12 < arrayList.size()) {
                    if (((o4) arrayList.get(i12)).d) {
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
                    if (i10 < ((o4) arrayList.get(i13)).e) {
                        size = i13 + 1;
                        break;
                    }
                    i13++;
                }
                o4 o4Var = new o4(getParentActivity(), null);
                o4Var.d = true;
                o4Var.e = i10;
                o4Var.c(LocaleController.formatString("AutoDeleteAfterShort", R.string.AutoDeleteAfterShort, LocaleController.formatTTLString(i10 * 60)), false, true);
                arrayList.add(size, o4Var);
                this.f.addView(o4Var, size);
                X();
                W(o4Var, z10);
                return;
            }
            if (((o4) arrayList.get(i11)).e == i10) {
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
                ((o4) arrayList.get(i11)).a(true, this.fragmentBeginToShow);
            } else {
                ((o4) arrayList.get(i11)).a(false, this.fragmentBeginToShow);
            }
            i11++;
        }
        if (!z10 || (i10 = ((o4) view).e) <= 0) {
            return;
        }
        org.telegram.ui.Components.xc.a0(this).Q(R.raw.fire_on, 36, AndroidUtilities.replaceTags(LocaleController.formatString("AutoDeleteGlobalTimerEnabled", R.string.AutoDeleteGlobalTimerEnabled, LocaleController.formatTTLString(i10 * 60)))).j();
    }

    public final void X() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((o4) arrayList.get(i10)).setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, false), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.i6, false)));
            ((o4) arrayList.get(i10)).setOnClickListener(new a(this, 3));
            i10++;
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.AutoDeleteMessages));
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 20));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.a7, false));
        xd xdVar = new xd(getParentActivity());
        org.telegram.ui.Components.mo0 mo0Var = new org.telegram.ui.Components.mo0(getParentActivity(), xdVar, this.resourceProvider, true);
        xdVar.setOrientation(1);
        mo0Var.addView(xdVar);
        frameLayout.addView(mo0Var);
        this.actionBar.setAdaptiveBackground(mo0Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        org.telegram.ui.Components.jx0 jx0Var = new org.telegram.ui.Components.jx0(context, this.currentAccount);
        jx0Var.setStickerNum(10);
        frameLayout2.addView(jx0Var, w7.y5.e(130, 130, 17));
        frameLayout2.setTag(-33024);
        xdVar.addView(frameLayout2, w7.y5.n(-1, 170));
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.f = linearLayout;
        linearLayout.setOrientation(1);
        this.f.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, false));
        xdVar.addView(this.f, w7.y5.n(-1, -2));
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
        X();
        org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context, 12, this.resourceProvider);
        e9Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GlobalAutoDeleteInfo), new m4(this)));
        xdVar.addView(e9Var, w7.y5.n(-1, -2));
        V(this.n, false);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.m2
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

    @Override // org.telegram.ui.ActionBar.m2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.didUpdateGlobalAutoDeleteTimer);
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onPause() {
        super.onPause();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 >= arrayList.size()) {
                return;
            }
            if (((o4) arrayList.get(i10)).b.f) {
                if (((o4) arrayList.get(i10)).e != this.n) {
                    this.n = ((o4) arrayList.get(i10)).e;
                    TLRPC.TL_messages_setDefaultHistoryTTL tL_messages_setDefaultHistoryTTL = new TLRPC.TL_messages_setDefaultHistoryTTL();
                    tL_messages_setDefaultHistoryTTL.period = ((o4) arrayList.get(i10)).e * 60;
                    getConnectionsManager().sendRequest(tL_messages_setDefaultHistoryTTL, new n4());
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
