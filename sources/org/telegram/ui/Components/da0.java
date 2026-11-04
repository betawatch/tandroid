package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class da0 extends FrameLayout {
    public final lt E;
    public final ArrayList F;
    public final z90 G;
    public final eh.c H;
    public TLRPC.Peer a;
    public final boolean b;
    public final org.telegram.ui.wm c;
    public final org.telegram.messenger.dj d;
    public final ba0 e;
    public final j90 f;
    public ValueAnimator h;
    public final TLRPC.User n;
    public final TLRPC.Chat r;
    public boolean s;
    public boolean w;
    public final int x;
    public boolean y;

    public da0(Context context, org.telegram.ui.wm wmVar, eh.c cVar, org.telegram.messenger.dj djVar, TLRPC.User user, TLRPC.Chat chat, int i3, z90 z90Var, int i10, final boolean z10) {
        super(context);
        int i11 = 6;
        this.E = new lt(this, 6);
        this.F = new ArrayList(10);
        this.b = z10;
        this.c = wmVar;
        this.x = i3;
        this.H = cVar;
        this.n = user;
        this.r = chat;
        this.d = djVar;
        this.G = z90Var;
        this.f = new j90(this, context, z90Var);
        ba0 ba0Var = new ba0(context, z90Var);
        this.e = ba0Var;
        gh.g c2 = cVar.c(ba0Var, null, false);
        c2.p(b8.cd.k(z90Var));
        c2.R.e = true;
        c2.q(org.telegram.messenger.g0.L(8.0f));
        c2.r(org.telegram.messenger.g0.L(16.0f));
        ba0Var.setBackground(c2);
        int i12 = 0;
        for (int i13 = 0; i13 < 3; i13++) {
            if (i13 == 0 && djVar.a != null) {
                this.e.a(0, org.telegram.messenger.bd.M0(2131748555, null));
            } else if (i13 == 1 && djVar.b != null && !z10) {
                this.e.a(1, org.telegram.messenger.bd.M0(2131748559, null));
            } else if (i13 == 2 && djVar.c != null && !z10) {
                this.e.a(2, org.telegram.messenger.bd.M0(2131748558, null));
            }
            if (i13 == i10) {
                i12 = this.e.a.size() - 1;
            }
        }
        this.f.setAdapter(new k90(this, context));
        this.f.setPosition(i12);
        this.e.setSelectedTab(i12);
        addView(this.e, b8.mf.e(-1, 66, 87));
        addView(this.f, b8.mf.d(-1, -1.0f, org.telegram.messenger.hs.E1, 0.0f, 0.0f, 0.0f, 66.0f));
        this.e.setOnTabClick(new p2(this, i11));
        setOnTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Components.i90
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                da0 da0Var = da0.this;
                da0Var.getClass();
                if (motionEvent.getAction() == 1 && !z10) {
                    da0Var.a(true);
                }
                return true;
            }
        });
        this.s = true;
        setAlpha(0.0f);
        setScaleX(0.95f);
        setScaleY(0.95f);
        animate().alpha(1.0f).scaleX(1.0f).setDuration(250L).setInterpolator(ni.l.V).scaleY(1.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
    
        if (r4.k != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008b, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0088, code lost:
    
        if (r4.l != null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z10) {
        int i3;
        if (this.s) {
            this.s = false;
            animate().alpha(0.0f).scaleX(0.95f).scaleY(0.95f).setDuration(250L).setInterpolator(ni.l.V).setListener(new s9(14, this, z10));
            int i10 = 0;
            while (true) {
                View[] viewArr = this.f.e;
                if (i10 >= viewArr.length) {
                    break;
                }
                View view = viewArr[i10];
                if (view instanceof x90) {
                    x90 x90Var = (x90) view;
                    if (x90Var.a == 0) {
                        x90Var.k();
                        break;
                    }
                }
                i10++;
            }
            org.telegram.ui.hk hkVar = (org.telegram.ui.hk) this;
            org.telegram.ui.wm wmVar = hkVar.I;
            wmVar.Za = null;
            wmVar.r7();
            org.telegram.messenger.dj djVar = wmVar.w5;
            if (djVar != null) {
                if (wmVar.C5 == null) {
                    wmVar.C5 = djVar.d;
                }
                org.telegram.ui.mm mmVar = djVar.d;
                if (mmVar == null) {
                    wmVar.C5 = null;
                }
                org.telegram.ui.mm mmVar2 = wmVar.C5;
                if (mmVar2 != null && mmVar2.m && mmVar != null && mmVar.m) {
                    boolean z11 = true;
                    if (!mmVar.g) {
                        if (!mmVar.h) {
                            z11 = true ^ TextUtils.isEmpty(mmVar.i);
                        }
                        if (z11) {
                            org.telegram.ui.mm mmVar3 = wmVar.w5.d;
                            wmVar.C5 = mmVar3;
                            mmVar3.f = false;
                            if (wmVar.Pb == 2) {
                                wmVar.fc(wmVar.E5, mmVar3);
                            }
                        }
                    }
                }
                org.telegram.ui.mm mmVar4 = wmVar.C5;
                if (mmVar4 != null) {
                    mmVar4.f = false;
                    org.telegram.messenger.dj djVar2 = wmVar.w5;
                    mmVar4.b = djVar2.e;
                    mmVar4.c = djVar2.f;
                    mmVar4.f();
                    if (wmVar.Pb == 2) {
                        wmVar.fc(wmVar.E5, wmVar.C5);
                    }
                } else {
                    ArrayList arrayList = new ArrayList();
                    org.telegram.messenger.bj bjVar = wmVar.w5.b;
                    if (bjVar != null) {
                        bjVar.b(arrayList);
                    }
                    wmVar.z8();
                }
            }
            if (wmVar.Bb && z10) {
                org.telegram.messenger.g0.i3(new org.telegram.ui.gk(hkVar, 0), 50L);
                wmVar.Bb = false;
            }
            Activity parentActivity = wmVar.getParentActivity();
            i3 = ((org.telegram.ui.ActionBar.d2) wmVar).classGuid;
            org.telegram.messenger.g0.a3(parentActivity, i3);
        }
    }

    public abstract void b();

    public abstract void c(boolean z10);

    public void setSendAsPeer(TLRPC.Peer peer) {
        this.a = peer;
        int i3 = 0;
        while (true) {
            View[] viewArr = this.f.e;
            if (i3 >= viewArr.length) {
                return;
            }
            View view = viewArr[i3];
            if (view != null) {
                x90 x90Var = (x90) view;
                if (x90Var.a == 1) {
                    x90Var.i();
                }
            }
            i3++;
        }
    }
}
