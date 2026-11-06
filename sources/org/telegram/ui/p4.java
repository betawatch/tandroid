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

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class p4 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public o4 a;
    public o4 b;
    public o4 c;
    public o4 d;
    public o4 e;
    public LinearLayout f;
    public final ArrayList h;
    public int n;
    public org.telegram.ui.Components.hm0 r;

    public p4() {
        super(null);
        this.h = new ArrayList();
        this.n = 0;
    }

    public final int Z() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i7 >= arrayList.size()) {
                return this.n;
            }
            if (((o4) arrayList.get(i7)).b.f) {
                return ((o4) arrayList.get(i7)).e;
            }
            i7++;
        }
    }

    public final void a0(int i7, boolean z9) {
        TransitionSet transitionSet = new TransitionSet();
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(150L);
        Fade fade = new Fade(1);
        fade.setDuration(150L);
        transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(changeBounds).addTransition(fade);
        transitionSet.setOrdering(0);
        transitionSet.setInterpolator((TimeInterpolator) org.telegram.ui.Components.xq.f);
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
                    if (i7 < ((o4) arrayList.get(i12)).e) {
                        size = i12 + 1;
                        break;
                    }
                    i12++;
                }
                o4 o4Var = new o4(getParentActivity(), null);
                o4Var.d = true;
                o4Var.e = i7;
                o4Var.c(org.telegram.messenger.hd.a0("AutoDeleteAfterShort", null, 2131753872, org.telegram.messenger.hd.c0(i7 * 60)), false, true);
                arrayList.add(size, o4Var);
                this.f.addView(o4Var, size);
                c0();
                b0(o4Var, z9);
                return;
            }
            if (((o4) arrayList.get(i10)).e == i7) {
                b0((View) arrayList.get(i10), z9);
                return;
            }
            i10++;
        }
    }

    public final void b0(View view, boolean z9) {
        int i7;
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
        if (!z9 || (i7 = ((o4) view).e) <= 0) {
            return;
        }
        org.telegram.messenger.camera.q.s(org.telegram.messenger.hd.a0("AutoDeleteGlobalTimerEnabled", null, 2131753857, org.telegram.messenger.hd.c0(i7 * 60)), org.telegram.ui.Components.hc.a0(this), R.raw.fire_on, 36);
    }

    public final void c0() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i7 >= arrayList.size()) {
                return;
            }
            View view = (View) arrayList.get(i7);
            int i10 = org.telegram.ui.ActionBar.k6.d6;
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
            int i11 = org.telegram.ui.ActionBar.k6.i6;
            org.telegram.ui.ActionBar.r6.R(view, org.telegram.ui.ActionBar.k6.i0(x02, org.telegram.ui.ActionBar.k6.x0(null, i11, false)), org.telegram.ui.ActionBar.r6.N(i10), org.telegram.ui.ActionBar.r6.N(i11), null);
            ((o4) arrayList.get(i7)).setOnClickListener(new a(this, 3));
            i7++;
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131753850, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.s(this, 24));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.gm0 gm0Var = new org.telegram.ui.Components.gm0(getParentActivity());
        org.telegram.ui.Components.hm0 hm0Var = new org.telegram.ui.Components.hm0(getParentActivity(), gm0Var, this.resourceProvider, true);
        this.r = hm0Var;
        hm0Var.setDrawBackground(true);
        this.r.setOverScrollMode(0);
        gm0Var.setOrientation(1);
        this.r.addView(gm0Var);
        frameLayout.addView(this.r);
        FrameLayout frameLayout2 = new FrameLayout(context);
        org.telegram.ui.Components.bv0 bv0Var = new org.telegram.ui.Components.bv0(context, this.currentAccount);
        bv0Var.setStickerNum(10);
        frameLayout2.addView(bv0Var, c8.ha.e(org.telegram.messenger.qs.O1, org.telegram.messenger.qs.O1, 17));
        frameLayout2.setTag(-33024);
        gm0Var.addView(frameLayout2, c8.ha.o(-1, org.telegram.messenger.qs.A2));
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.f = linearLayout;
        linearLayout.setOrientation(1);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, this.f, null);
        gm0Var.addView(this.f, c8.ha.o(-1, -2));
        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(getParentActivity());
        n4Var.setText(org.telegram.messenger.hd.M0(2131748586, null));
        this.f.addView(n4Var);
        o4 o4Var = new o4(getParentActivity(), null);
        this.a = o4Var;
        o4Var.c(org.telegram.messenger.hd.M0(2131745362, null), false, true);
        o4 o4Var2 = this.a;
        o4Var2.e = 0;
        this.f.addView(o4Var2);
        o4 o4Var3 = new o4(getParentActivity(), null);
        this.b = o4Var3;
        o4Var3.c(org.telegram.messenger.hd.M0(2131753875, null), false, true);
        o4 o4Var4 = this.b;
        o4Var4.e = 1440;
        this.f.addView(o4Var4);
        o4 o4Var5 = new o4(getParentActivity(), null);
        this.c = o4Var5;
        o4Var5.c(org.telegram.messenger.hd.M0(2131753873, null), false, true);
        o4 o4Var6 = this.c;
        o4Var6.e = 10080;
        this.f.addView(o4Var6);
        o4 o4Var7 = new o4(getParentActivity(), null);
        this.d = o4Var7;
        o4Var7.c(org.telegram.messenger.hd.M0(2131753874, null), false, true);
        o4 o4Var8 = this.d;
        o4Var8.e = 44640;
        this.f.addView(o4Var8);
        o4 o4Var9 = new o4(getParentActivity(), null);
        this.e = o4Var9;
        o4Var9.c(org.telegram.messenger.hd.M0(2131745535, null), false, false);
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
        org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(12, context, this.resourceProvider);
        z8Var.setText(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131749535, null), new m4(this, 0)));
        gm0Var.addView(z8Var, c8.ha.o(-1, -2));
        a0(this.n, false);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final org.telegram.ui.Components.hm0 getScrollViewForSimpleGlass() {
        return this.r;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        int i7 = getUserConfig().p0;
        this.n = i7;
        if (i7 < 0) {
            this.n = 0;
        }
        getUserConfig().t();
        getNotificationCenter().c(this, org.telegram.messenger.qs.s5);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.qs.s5);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onPause() {
        super.onPause();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i7 >= arrayList.size()) {
                return;
            }
            if (((o4) arrayList.get(i7)).b.f) {
                if (((o4) arrayList.get(i7)).e != this.n) {
                    this.n = ((o4) arrayList.get(i7)).e;
                    TLRPC.TL_messages_setDefaultHistoryTTL tL_messages_setDefaultHistoryTTL = new TLRPC.TL_messages_setDefaultHistoryTTL();
                    tL_messages_setDefaultHistoryTTL.period = ((o4) arrayList.get(i7)).e * 60;
                    getConnectionsManager().sendRequest(tL_messages_setDefaultHistoryTTL, new n4());
                    getUserConfig().p0 = this.n;
                    org.telegram.messenger.qs.f(this.currentAccount).k(org.telegram.messenger.qs.s5, new Object[0]);
                    return;
                }
                return;
            }
            i7++;
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
    }
}
