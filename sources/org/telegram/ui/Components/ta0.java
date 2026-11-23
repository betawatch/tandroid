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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public abstract class ta0 extends FrameLayout {
    public final rc E;
    public final ArrayList F;
    public final pa0 G;
    public final dh.c H;
    public TLRPC.Peer a;
    public final boolean b;
    public final org.telegram.ui.bn c;
    public final org.telegram.messenger.jj d;
    public final ra0 e;
    public final z90 f;
    public ValueAnimator h;
    public final TLRPC.User n;
    public final TLRPC.Chat r;
    public boolean s;
    public boolean w;
    public final int x;
    public boolean y;

    public ta0(Context context, org.telegram.ui.bn bnVar, dh.c cVar, org.telegram.messenger.jj jjVar, TLRPC.User user, TLRPC.Chat chat, int i7, pa0 pa0Var, int i10, final boolean z10) {
        super(context);
        this.E = new rc(this, 11);
        this.F = new ArrayList(10);
        this.b = z10;
        this.c = bnVar;
        this.x = i7;
        this.H = cVar;
        this.n = user;
        this.r = chat;
        this.d = jjVar;
        this.G = pa0Var;
        this.f = new z90(this, context, pa0Var);
        ra0 ra0Var = new ra0(context, pa0Var);
        this.e = ra0Var;
        fh.g c10 = cVar.c(ra0Var, null, false);
        c10.p(c8.j0.l(pa0Var));
        c10.R.e = true;
        c10.q(org.telegram.messenger.g0.L(8.0f));
        c10.r(org.telegram.messenger.g0.L(16.0f));
        ra0Var.setBackground(c10);
        int i11 = 0;
        for (int i12 = 0; i12 < 3; i12++) {
            if (i12 == 0 && jjVar.a != null) {
                this.e.a(0, org.telegram.messenger.gd.N0(2131748354, null));
            } else if (i12 == 1 && jjVar.b != null && !z10) {
                this.e.a(1, org.telegram.messenger.gd.N0(2131748358, null));
            } else if (i12 == 2 && jjVar.c != null && !z10) {
                this.e.a(2, org.telegram.messenger.gd.N0(2131748357, null));
            }
            if (i12 == i10) {
                i11 = this.e.a.size() - 1;
            }
        }
        this.f.setAdapter(new aa0(this, context));
        this.f.setPosition(i11);
        this.e.setSelectedTab(i11);
        addView(this.e, c8.na.e(-1, 66, 87));
        addView(this.f, c8.na.d(-1, -1.0f, org.telegram.messenger.ks.E1, 0.0f, 0.0f, 0.0f, 66.0f));
        this.e.setOnTabClick(new y2(this, 8));
        setOnTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Components.y90
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                ta0 ta0Var = ta0.this;
                ta0Var.getClass();
                if (motionEvent.getAction() == 1 && !z10) {
                    ta0Var.a(true);
                }
                return true;
            }
        });
        this.s = true;
        setAlpha(0.0f);
        setScaleX(0.95f);
        setScaleY(0.95f);
        animate().alpha(1.0f).scaleX(1.0f).setDuration(250L).setInterpolator(pi.k.V).scaleY(1.0f);
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
        int i7;
        if (this.s) {
            this.s = false;
            animate().alpha(0.0f).scaleX(0.95f).scaleY(0.95f).setDuration(250L).setInterpolator(pi.k.V).setListener(new org.telegram.ui.on(15, this, z10));
            int i10 = 0;
            while (true) {
                View[] viewArr = this.f.e;
                if (i10 >= viewArr.length) {
                    break;
                }
                View view = viewArr[i10];
                if (view instanceof na0) {
                    na0 na0Var = (na0) view;
                    if (na0Var.a == 0) {
                        na0Var.k();
                        break;
                    }
                }
                i10++;
            }
            org.telegram.ui.mk mkVar = (org.telegram.ui.mk) this;
            org.telegram.ui.bn bnVar = mkVar.I;
            bnVar.cb = null;
            bnVar.s7();
            org.telegram.messenger.jj jjVar = bnVar.x5;
            if (jjVar != null) {
                if (bnVar.D5 == null) {
                    bnVar.D5 = jjVar.d;
                }
                org.telegram.ui.rm rmVar = jjVar.d;
                if (rmVar == null) {
                    bnVar.D5 = null;
                }
                org.telegram.ui.rm rmVar2 = bnVar.D5;
                if (rmVar2 != null && rmVar2.m && rmVar != null && rmVar.m) {
                    boolean z11 = true;
                    if (!rmVar.g) {
                        if (!rmVar.h) {
                            z11 = true ^ TextUtils.isEmpty(rmVar.i);
                        }
                        if (z11) {
                            org.telegram.ui.rm rmVar3 = bnVar.x5.d;
                            bnVar.D5 = rmVar3;
                            rmVar3.f = false;
                            if (bnVar.Sb == 2) {
                                bnVar.jc(bnVar.F5, rmVar3);
                            }
                        }
                    }
                }
                org.telegram.ui.rm rmVar4 = bnVar.D5;
                if (rmVar4 != null) {
                    rmVar4.f = false;
                    org.telegram.messenger.jj jjVar2 = bnVar.x5;
                    rmVar4.b = jjVar2.e;
                    rmVar4.c = jjVar2.f;
                    rmVar4.f();
                    if (bnVar.Sb == 2) {
                        bnVar.jc(bnVar.F5, bnVar.D5);
                    }
                } else {
                    ArrayList arrayList = new ArrayList();
                    org.telegram.messenger.hj hjVar = bnVar.x5.b;
                    if (hjVar != null) {
                        hjVar.b(arrayList);
                    }
                    bnVar.B8();
                }
            }
            if (bnVar.Eb && z10) {
                org.telegram.messenger.g0.h3(new org.telegram.ui.lk(mkVar, 0), 50L);
                bnVar.Eb = false;
            }
            Activity parentActivity = bnVar.getParentActivity();
            i7 = ((org.telegram.ui.ActionBar.g2) bnVar).classGuid;
            org.telegram.messenger.g0.Z2(parentActivity, i7);
        }
    }

    public abstract void b();

    public abstract void c(boolean z10);

    public void setSendAsPeer(TLRPC.Peer peer) {
        this.a = peer;
        int i7 = 0;
        while (true) {
            View[] viewArr = this.f.e;
            if (i7 >= viewArr.length) {
                return;
            }
            View view = viewArr[i7];
            if (view != null) {
                na0 na0Var = (na0) view;
                if (na0Var.a == 1) {
                    na0Var.i();
                }
            }
            i7++;
        }
    }
}
