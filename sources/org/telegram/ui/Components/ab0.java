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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class ab0 extends FrameLayout {
    public final ew D;
    public final ArrayList E;
    public final wa0 F;
    public final tg.b G;
    public TLRPC.Peer a;
    public final boolean b;
    public final org.telegram.ui.un c;
    public final org.telegram.messenger.nj d;
    public final ya0 e;
    public final fa0 f;
    public ValueAnimator h;
    public final TLRPC.User n;
    public final TLRPC.Chat r;
    public boolean s;
    public boolean w;
    public final int x;
    public boolean y;

    public ab0(Context context, org.telegram.ui.un unVar, tg.b bVar, org.telegram.messenger.nj njVar, TLRPC.User user, TLRPC.Chat chat, int i10, wa0 wa0Var, int i11, final boolean z10) {
        super(context);
        this.D = new ew(this, 5);
        this.E = new ArrayList(10);
        this.b = z10;
        this.c = unVar;
        this.x = i10;
        this.G = bVar;
        this.n = user;
        this.r = chat;
        this.d = njVar;
        this.F = wa0Var;
        this.f = new fa0(this, context, wa0Var);
        ya0 ya0Var = new ya0(context, wa0Var);
        this.e = ya0Var;
        vg.f c10 = bVar.c(ya0Var, null, false);
        c10.o(w7.b9.k(wa0Var));
        c10.M.e = true;
        c10.p(org.telegram.messenger.i0.L(8.0f));
        c10.q(org.telegram.messenger.i0.L(16.0f));
        ya0Var.setBackground(c10);
        int i12 = 0;
        for (int i13 = 0; i13 < 3; i13++) {
            if (i13 == 0 && njVar.a != null) {
                this.e.a(0, org.telegram.messenger.cd.L0(2131748562, null));
            } else if (i13 == 1 && njVar.b != null && !z10) {
                this.e.a(1, org.telegram.messenger.cd.L0(2131748566, null));
            } else if (i13 == 2 && njVar.c != null && !z10) {
                this.e.a(2, org.telegram.messenger.cd.L0(2131748565, null));
            }
            if (i13 == i11) {
                i12 = this.e.a.size() - 1;
            }
        }
        this.f.setAdapter(new ga0(this, context));
        this.f.setPosition(i12);
        this.e.setSelectedTab(i12);
        addView(this.e, w7.b6.e(-1, 66, 87));
        addView(this.f, w7.b6.d(-1, -1.0f, org.telegram.messenger.zs.E1, 0.0f, 0.0f, 0.0f, 66.0f));
        this.e.setOnTabClick(new r2(this, 6));
        setOnTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Components.ea0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                ab0 ab0Var = ab0.this;
                ab0Var.getClass();
                if (motionEvent.getAction() == 1 && !z10) {
                    ab0Var.a(true);
                }
                return true;
            }
        });
        this.s = true;
        setAlpha(0.0f);
        setScaleX(0.95f);
        setScaleY(0.95f);
        animate().alpha(1.0f).scaleX(1.0f).setDuration(250L).setInterpolator(ci.o.V).scaleY(1.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007e, code lost:
    
        if (r4.k != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0087, code lost:
    
        if (r4.l != null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z10) {
        int i10;
        if (this.s) {
            this.s = false;
            animate().alpha(0.0f).scaleX(0.95f).scaleY(0.95f).setDuration(250L).setInterpolator(ci.o.V).setListener(new ha0(0, this, z10));
            int i11 = 0;
            while (true) {
                View[] viewArr = this.f.e;
                if (i11 >= viewArr.length) {
                    break;
                }
                View view = viewArr[i11];
                if (view instanceof ua0) {
                    ua0 ua0Var = (ua0) view;
                    if (ua0Var.a == 0) {
                        ua0Var.k();
                        break;
                    }
                }
                i11++;
            }
            org.telegram.ui.hl hlVar = (org.telegram.ui.hl) this;
            org.telegram.ui.un unVar = hlVar.H;
            unVar.Ya = null;
            unVar.l7();
            org.telegram.messenger.nj njVar = unVar.v5;
            if (njVar != null) {
                if (unVar.B5 == null) {
                    unVar.B5 = njVar.d;
                }
                org.telegram.ui.kn knVar = njVar.d;
                if (knVar == null) {
                    unVar.B5 = null;
                }
                org.telegram.ui.kn knVar2 = unVar.B5;
                if (knVar2 != null && knVar2.m && knVar != null && knVar.m) {
                    boolean z11 = true;
                    if (!knVar.g) {
                        if (!knVar.h) {
                            z11 = true ^ TextUtils.isEmpty(knVar.i);
                        }
                        if (z11) {
                            org.telegram.ui.kn knVar3 = unVar.v5.d;
                            unVar.B5 = knVar3;
                            knVar3.f = false;
                            if (unVar.Jb == 2) {
                                unVar.Vb(unVar.D5, knVar3);
                            }
                        }
                    }
                }
                org.telegram.ui.kn knVar4 = unVar.B5;
                if (knVar4 != null) {
                    knVar4.f = false;
                    org.telegram.messenger.nj njVar2 = unVar.v5;
                    knVar4.b = njVar2.e;
                    knVar4.c = njVar2.f;
                    knVar4.f();
                    if (unVar.Jb == 2) {
                        unVar.Vb(unVar.D5, unVar.B5);
                    }
                } else {
                    ArrayList arrayList = new ArrayList();
                    org.telegram.messenger.lj ljVar = unVar.v5.b;
                    if (ljVar != null) {
                        ljVar.b(arrayList);
                    }
                    unVar.s8();
                }
            }
            if (unVar.zb && z10) {
                org.telegram.messenger.i0.h3(new org.telegram.ui.gl(hlVar, 1), 50L);
                unVar.zb = false;
            }
            Activity parentActivity = unVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.k2) unVar).classGuid;
            org.telegram.messenger.i0.Z2(parentActivity, i10);
        }
    }

    public abstract void b();

    public abstract void c(boolean z10);

    public void setSendAsPeer(TLRPC.Peer peer) {
        this.a = peer;
        int i10 = 0;
        while (true) {
            View[] viewArr = this.f.e;
            if (i10 >= viewArr.length) {
                return;
            }
            View view = viewArr[i10];
            if (view != null) {
                ua0 ua0Var = (ua0) view;
                if (ua0Var.a == 1) {
                    ua0Var.i();
                }
            }
            i10++;
        }
    }
}
