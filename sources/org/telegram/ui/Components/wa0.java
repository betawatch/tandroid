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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public abstract class wa0 extends FrameLayout {
    public final ik E;
    public final ArrayList F;
    public final sa0 G;
    public final dh.c H;
    public TLRPC.Peer a;
    public final boolean b;
    public final org.telegram.ui.bn c;
    public final org.telegram.messenger.kj d;
    public final ua0 e;
    public final ca0 f;
    public ValueAnimator h;
    public final TLRPC.User n;
    public final TLRPC.Chat r;
    public boolean s;
    public boolean w;
    public final int x;
    public boolean y;

    public wa0(Context context, org.telegram.ui.bn bnVar, dh.c cVar, org.telegram.messenger.kj kjVar, TLRPC.User user, TLRPC.Chat chat, int i7, sa0 sa0Var, int i10, final boolean z10) {
        super(context);
        this.E = new ik(this, 10);
        this.F = new ArrayList(10);
        this.b = z10;
        this.c = bnVar;
        this.x = i7;
        this.H = cVar;
        this.n = user;
        this.r = chat;
        this.d = kjVar;
        this.G = sa0Var;
        this.f = new ca0(this, context, sa0Var);
        ua0 ua0Var = new ua0(context, sa0Var);
        this.e = ua0Var;
        fh.g c10 = cVar.c(ua0Var, null, false);
        c10.p(c8.i0.l(sa0Var));
        c10.R.e = true;
        c10.q(org.telegram.messenger.g0.L(8.0f));
        c10.r(org.telegram.messenger.g0.L(16.0f));
        ua0Var.setBackground(c10);
        int i11 = 0;
        for (int i12 = 0; i12 < 3; i12++) {
            if (i12 == 0 && kjVar.a != null) {
                this.e.a(0, org.telegram.messenger.hd.N0(2131748354, null));
            } else if (i12 == 1 && kjVar.b != null && !z10) {
                this.e.a(1, org.telegram.messenger.hd.N0(2131748358, null));
            } else if (i12 == 2 && kjVar.c != null && !z10) {
                this.e.a(2, org.telegram.messenger.hd.N0(2131748357, null));
            }
            if (i12 == i10) {
                i11 = this.e.a.size() - 1;
            }
        }
        this.f.setAdapter(new da0(this, context));
        this.f.setPosition(i11);
        this.e.setSelectedTab(i11);
        addView(this.e, c8.ma.e(-1, 66, 87));
        addView(this.f, c8.ma.d(-1, -1.0f, org.telegram.messenger.ls.E1, 0.0f, 0.0f, 0.0f, 66.0f));
        this.e.setOnTabClick(new z2(this, 8));
        setOnTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Components.ba0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                wa0 wa0Var = wa0.this;
                wa0Var.getClass();
                if (motionEvent.getAction() == 1 && !z10) {
                    wa0Var.a(true);
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
                if (view instanceof qa0) {
                    qa0 qa0Var = (qa0) view;
                    if (qa0Var.a == 0) {
                        qa0Var.k();
                        break;
                    }
                }
                i10++;
            }
            org.telegram.ui.mk mkVar = (org.telegram.ui.mk) this;
            org.telegram.ui.bn bnVar = mkVar.I;
            bnVar.cb = null;
            bnVar.s7();
            org.telegram.messenger.kj kjVar = bnVar.x5;
            if (kjVar != null) {
                if (bnVar.D5 == null) {
                    bnVar.D5 = kjVar.d;
                }
                org.telegram.ui.rm rmVar = kjVar.d;
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
                    org.telegram.messenger.kj kjVar2 = bnVar.x5;
                    rmVar4.b = kjVar2.e;
                    rmVar4.c = kjVar2.f;
                    rmVar4.f();
                    if (bnVar.Sb == 2) {
                        bnVar.jc(bnVar.F5, bnVar.D5);
                    }
                } else {
                    ArrayList arrayList = new ArrayList();
                    org.telegram.messenger.ij ijVar = bnVar.x5.b;
                    if (ijVar != null) {
                        ijVar.b(arrayList);
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
                qa0 qa0Var = (qa0) view;
                if (qa0Var.a == 1) {
                    qa0Var.i();
                }
            }
            i7++;
        }
    }
}
