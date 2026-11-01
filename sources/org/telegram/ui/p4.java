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
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class p4 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.vs {
    public o4 a;
    public o4 b;
    public o4 c;
    public o4 d;
    public o4 e;
    public LinearLayout f;
    public final ArrayList h;
    public int n;
    public org.telegram.ui.Components.jn0 r;

    public p4() {
        super(null);
        this.h = new ArrayList();
        this.n = 0;
    }

    public final int Z() {
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

    public final void a0(int i10, boolean z10) {
        TransitionSet transitionSet = new TransitionSet();
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(150L);
        Fade fade = new Fade(1);
        fade.setDuration(150L);
        transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(changeBounds).addTransition(fade);
        transitionSet.setOrdering(0);
        transitionSet.setInterpolator((TimeInterpolator) org.telegram.ui.Components.gr.f);
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
                o4Var.c(org.telegram.messenger.dd.a0("AutoDeleteAfterShort", null, 2131753872, org.telegram.messenger.dd.c0(i10 * 60)), false, true);
                arrayList.add(size, o4Var);
                this.f.addView(o4Var, size);
                c0();
                b0(o4Var, z10);
                return;
            }
            if (((o4) arrayList.get(i11)).e == i10) {
                b0((View) arrayList.get(i11), z10);
                return;
            }
            i11++;
        }
    }

    public final void b0(View view, boolean z10) {
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
        org.telegram.messenger.a30.s(org.telegram.messenger.dd.a0("AutoDeleteGlobalTimerEnabled", null, 2131753857, org.telegram.messenger.dd.c0(i10 * 60)), org.telegram.ui.Components.cc.a0(this), R.raw.fire_on, 36);
    }

    public final void c0() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 >= arrayList.size()) {
                return;
            }
            View view = (View) arrayList.get(i10);
            int i11 = org.telegram.ui.ActionBar.t6.d6;
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, i11, false);
            int i12 = org.telegram.ui.ActionBar.t6.i6;
            org.telegram.ui.ActionBar.a7.R(view, org.telegram.ui.ActionBar.t6.i0(x02, org.telegram.ui.ActionBar.t6.x0(null, i12, false)), org.telegram.ui.ActionBar.a7.N(i11), org.telegram.ui.ActionBar.a7.N(i12), null);
            ((o4) arrayList.get(i10)).setOnClickListener(new a(this, 3));
            i10++;
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131753850, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ag.e(this, 14));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.in0 in0Var = new org.telegram.ui.Components.in0(getParentActivity());
        org.telegram.ui.Components.jn0 jn0Var = new org.telegram.ui.Components.jn0(getParentActivity(), in0Var, this.resourceProvider, true);
        this.r = jn0Var;
        jn0Var.setDrawBackground(true);
        this.r.setOverScrollMode(0);
        in0Var.setOrientation(1);
        this.r.addView(in0Var);
        frameLayout.addView(this.r);
        FrameLayout frameLayout2 = new FrameLayout(context);
        org.telegram.ui.Components.fw0 fw0Var = new org.telegram.ui.Components.fw0(context, this.currentAccount);
        fw0Var.setStickerNum(10);
        frameLayout2.addView(fw0Var, w7.b6.e(org.telegram.messenger.at.O1, org.telegram.messenger.at.O1, 17));
        frameLayout2.setTag(-33024);
        in0Var.addView(frameLayout2, w7.b6.o(-1, org.telegram.messenger.at.A2));
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.f = linearLayout;
        linearLayout.setOrientation(1);
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, this.f, null);
        in0Var.addView(this.f, w7.b6.o(-1, -2));
        org.telegram.ui.Cells.p4 p4Var = new org.telegram.ui.Cells.p4(getParentActivity());
        p4Var.setText(org.telegram.messenger.dd.L0(2131748602, null));
        this.f.addView(p4Var);
        o4 o4Var = new o4(getParentActivity(), null);
        this.a = o4Var;
        o4Var.c(org.telegram.messenger.dd.L0(2131745379, null), false, true);
        o4 o4Var2 = this.a;
        o4Var2.e = 0;
        this.f.addView(o4Var2);
        o4 o4Var3 = new o4(getParentActivity(), null);
        this.b = o4Var3;
        o4Var3.c(org.telegram.messenger.dd.L0(2131753875, null), false, true);
        o4 o4Var4 = this.b;
        o4Var4.e = 1440;
        this.f.addView(o4Var4);
        o4 o4Var5 = new o4(getParentActivity(), null);
        this.c = o4Var5;
        o4Var5.c(org.telegram.messenger.dd.L0(2131753873, null), false, true);
        o4 o4Var6 = this.c;
        o4Var6.e = 10080;
        this.f.addView(o4Var6);
        o4 o4Var7 = new o4(getParentActivity(), null);
        this.d = o4Var7;
        o4Var7.c(org.telegram.messenger.dd.L0(2131753874, null), false, true);
        o4 o4Var8 = this.d;
        o4Var8.e = 44640;
        this.f.addView(o4Var8);
        o4 o4Var9 = new o4(getParentActivity(), null);
        this.e = o4Var9;
        o4Var9.c(org.telegram.messenger.dd.L0(2131745551, null), false, false);
        this.e.b.setVisibility(8);
        this.f.addView(this.e);
        o4 o4Var10 = this.a;
        ArrayList arrayList = this.h;
        arrayList.add(o4Var10);
        arrayList.add(this.b);
        arrayList.add(this.c);
        arrayList.add(this.d);
        arrayList.add(this.e);
        c0();
        org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(12, context, this.resourceProvider);
        b9Var.setText(org.telegram.messenger.i0.T2(org.telegram.messenger.dd.L0(2131749545, null), new m4(this, 0)));
        in0Var.addView(b9Var, w7.b6.o(-1, -2));
        a0(this.n, false);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.Components.jn0 getScrollViewForSimpleGlass() {
        return this.r;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        int i10 = getUserConfig().p0;
        this.n = i10;
        if (i10 < 0) {
            this.n = 0;
        }
        getUserConfig().t();
        getNotificationCenter().c(this, org.telegram.messenger.at.s5);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.at.s5);
    }

    @Override // org.telegram.ui.ActionBar.k2
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
                    getUserConfig().p0 = this.n;
                    org.telegram.messenger.at.f(this.currentAccount).k(org.telegram.messenger.at.s5, new Object[0]);
                    return;
                }
                return;
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override // org.telegram.messenger.vs
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
    }
}
