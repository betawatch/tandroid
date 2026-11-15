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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public abstract class ja0 extends FrameLayout {
    public final zj E;
    public final ArrayList F;
    public final fa0 G;
    public final dh.c H;
    public TLRPC.Peer a;
    public final boolean b;
    public final org.telegram.ui.an c;
    public final org.telegram.messenger.kj d;
    public final ha0 e;
    public final p90 f;
    public ValueAnimator h;
    public final TLRPC.User n;
    public final TLRPC.Chat r;
    public boolean s;
    public boolean w;
    public final int x;
    public boolean y;

    public ja0(Context context, org.telegram.ui.an anVar, dh.c cVar, org.telegram.messenger.kj kjVar, TLRPC.User user, TLRPC.Chat chat, int i7, fa0 fa0Var, int i10, final boolean z10) {
        super(context);
        this.E = new zj(this, 10);
        this.F = new ArrayList(10);
        this.b = z10;
        this.c = anVar;
        this.x = i7;
        this.H = cVar;
        this.n = user;
        this.r = chat;
        this.d = kjVar;
        this.G = fa0Var;
        this.f = new p90(this, context, fa0Var);
        ha0 ha0Var = new ha0(context, fa0Var);
        this.e = ha0Var;
        fh.g c10 = cVar.c(ha0Var, null, false);
        c10.p(c8.g0.k(fa0Var));
        c10.R.e = true;
        c10.q(org.telegram.messenger.g0.L(8.0f));
        c10.r(org.telegram.messenger.g0.L(16.0f));
        ha0Var.setBackground(c10);
        int i11 = 0;
        for (int i12 = 0; i12 < 3; i12++) {
            if (i12 == 0 && kjVar.a != null) {
                this.e.a(0, org.telegram.messenger.hd.M0(2131748547, null));
            } else if (i12 == 1 && kjVar.b != null && !z10) {
                this.e.a(1, org.telegram.messenger.hd.M0(2131748551, null));
            } else if (i12 == 2 && kjVar.c != null && !z10) {
                this.e.a(2, org.telegram.messenger.hd.M0(2131748550, null));
            }
            if (i12 == i10) {
                i11 = this.e.a.size() - 1;
            }
        }
        this.f.setAdapter(new q90(this, context));
        this.f.setPosition(i11);
        this.e.setSelectedTab(i11);
        addView(this.e, c8.ja.e(-1, 66, 87));
        addView(this.f, c8.ja.d(-1, -1.0f, org.telegram.messenger.ns.E1, 0.0f, 0.0f, 0.0f, 66.0f));
        this.e.setOnTabClick(new q2(this, 8));
        setOnTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Components.o90
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                ja0 ja0Var = ja0.this;
                ja0Var.getClass();
                if (motionEvent.getAction() == 1 && !z10) {
                    ja0Var.a(true);
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
            animate().alpha(0.0f).scaleX(0.95f).scaleY(0.95f).setDuration(250L).setInterpolator(pi.k.V).setListener(new org.telegram.ui.nn(15, this, z10));
            int i10 = 0;
            while (true) {
                View[] viewArr = this.f.e;
                if (i10 >= viewArr.length) {
                    break;
                }
                View view = viewArr[i10];
                if (view instanceof da0) {
                    da0 da0Var = (da0) view;
                    if (da0Var.a == 0) {
                        da0Var.k();
                        break;
                    }
                }
                i10++;
            }
            org.telegram.ui.lk lkVar = (org.telegram.ui.lk) this;
            org.telegram.ui.an anVar = lkVar.I;
            anVar.bb = null;
            anVar.s7();
            org.telegram.messenger.kj kjVar = anVar.w5;
            if (kjVar != null) {
                if (anVar.C5 == null) {
                    anVar.C5 = kjVar.d;
                }
                org.telegram.ui.qm qmVar = kjVar.d;
                if (qmVar == null) {
                    anVar.C5 = null;
                }
                org.telegram.ui.qm qmVar2 = anVar.C5;
                if (qmVar2 != null && qmVar2.m && qmVar != null && qmVar.m) {
                    boolean z11 = true;
                    if (!qmVar.g) {
                        if (!qmVar.h) {
                            z11 = true ^ TextUtils.isEmpty(qmVar.i);
                        }
                        if (z11) {
                            org.telegram.ui.qm qmVar3 = anVar.w5.d;
                            anVar.C5 = qmVar3;
                            qmVar3.f = false;
                            if (anVar.Rb == 2) {
                                anVar.jc(anVar.E5, qmVar3);
                            }
                        }
                    }
                }
                org.telegram.ui.qm qmVar4 = anVar.C5;
                if (qmVar4 != null) {
                    qmVar4.f = false;
                    org.telegram.messenger.kj kjVar2 = anVar.w5;
                    qmVar4.b = kjVar2.e;
                    qmVar4.c = kjVar2.f;
                    qmVar4.f();
                    if (anVar.Rb == 2) {
                        anVar.jc(anVar.E5, anVar.C5);
                    }
                } else {
                    ArrayList arrayList = new ArrayList();
                    org.telegram.messenger.ij ijVar = anVar.w5.b;
                    if (ijVar != null) {
                        ijVar.b(arrayList);
                    }
                    anVar.B8();
                }
            }
            if (anVar.Db && z10) {
                org.telegram.messenger.g0.i3(new org.telegram.ui.kk(lkVar, 0), 50L);
                anVar.Db = false;
            }
            Activity parentActivity = anVar.getParentActivity();
            i7 = ((org.telegram.ui.ActionBar.e2) anVar).classGuid;
            org.telegram.messenger.g0.a3(parentActivity, i7);
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
                da0 da0Var = (da0) view;
                if (da0Var.a == 1) {
                    da0Var.i();
                }
            }
            i7++;
        }
    }
}
