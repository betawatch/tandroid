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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public abstract class ja0 extends FrameLayout {
    public final et D;
    public final ArrayList E;
    public final fa0 F;
    public final dh.c G;
    public TLRPC.Peer a;
    public final boolean b;
    public final org.telegram.ui.cn c;
    public final org.telegram.messenger.mj d;
    public final ha0 e;
    public final o90 f;
    public ValueAnimator h;
    public final TLRPC.User n;
    public final TLRPC.Chat r;
    public boolean s;
    public boolean w;
    public final int x;
    public boolean y;

    public ja0(Context context, org.telegram.ui.cn cnVar, dh.c cVar, org.telegram.messenger.mj mjVar, TLRPC.User user, TLRPC.Chat chat, int i7, fa0 fa0Var, int i10, final boolean z9) {
        super(context);
        this.D = new et(this, 7);
        this.E = new ArrayList(10);
        this.b = z9;
        this.c = cnVar;
        this.x = i7;
        this.G = cVar;
        this.n = user;
        this.r = chat;
        this.d = mjVar;
        this.F = fa0Var;
        this.f = new o90(this, context, fa0Var);
        ha0 ha0Var = new ha0(context, fa0Var);
        this.e = ha0Var;
        fh.g c10 = cVar.c(ha0Var, null, false);
        c10.p(c8.g0.k(fa0Var));
        c10.Q.e = true;
        c10.q(org.telegram.messenger.g0.L(8.0f));
        c10.r(org.telegram.messenger.g0.L(16.0f));
        ha0Var.setBackground(c10);
        int i11 = 0;
        for (int i12 = 0; i12 < 3; i12++) {
            if (i12 == 0 && mjVar.a != null) {
                this.e.a(0, org.telegram.messenger.id.M0(2131748547, null));
            } else if (i12 == 1 && mjVar.b != null && !z9) {
                this.e.a(1, org.telegram.messenger.id.M0(2131748551, null));
            } else if (i12 == 2 && mjVar.c != null && !z9) {
                this.e.a(2, org.telegram.messenger.id.M0(2131748550, null));
            }
            if (i12 == i10) {
                i11 = this.e.a.size() - 1;
            }
        }
        this.f.setAdapter(new p90(this, context));
        this.f.setPosition(i11);
        this.e.setSelectedTab(i11);
        addView(this.e, c8.ha.e(-1, 66, 87));
        addView(this.f, c8.ha.d(-1, -1.0f, org.telegram.messenger.qs.E1, 0.0f, 0.0f, 0.0f, 66.0f));
        this.e.setOnTabClick(new s2(this, 6));
        setOnTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Components.n90
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                ja0 ja0Var = ja0.this;
                ja0Var.getClass();
                if (motionEvent.getAction() == 1 && !z9) {
                    ja0Var.a(true);
                }
                return true;
            }
        });
        this.s = true;
        setAlpha(0.0f);
        setScaleX(0.95f);
        setScaleY(0.95f);
        animate().alpha(1.0f).scaleX(1.0f).setDuration(250L).setInterpolator(mi.l.V).scaleY(1.0f);
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
    public final void a(boolean z9) {
        int i7;
        if (this.s) {
            this.s = false;
            animate().alpha(0.0f).scaleX(0.95f).scaleY(0.95f).setDuration(250L).setInterpolator(mi.l.V).setListener(new t9(14, this, z9));
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
            org.telegram.ui.nk nkVar = (org.telegram.ui.nk) this;
            org.telegram.ui.cn cnVar = nkVar.H;
            cnVar.ab = null;
            cnVar.s7();
            org.telegram.messenger.mj mjVar = cnVar.v5;
            if (mjVar != null) {
                if (cnVar.B5 == null) {
                    cnVar.B5 = mjVar.d;
                }
                org.telegram.ui.sm smVar = mjVar.d;
                if (smVar == null) {
                    cnVar.B5 = null;
                }
                org.telegram.ui.sm smVar2 = cnVar.B5;
                if (smVar2 != null && smVar2.m && smVar != null && smVar.m) {
                    boolean z10 = true;
                    if (!smVar.g) {
                        if (!smVar.h) {
                            z10 = true ^ TextUtils.isEmpty(smVar.i);
                        }
                        if (z10) {
                            org.telegram.ui.sm smVar3 = cnVar.v5.d;
                            cnVar.B5 = smVar3;
                            smVar3.f = false;
                            if (cnVar.Qb == 2) {
                                cnVar.ic(cnVar.D5, smVar3);
                            }
                        }
                    }
                }
                org.telegram.ui.sm smVar4 = cnVar.B5;
                if (smVar4 != null) {
                    smVar4.f = false;
                    org.telegram.messenger.mj mjVar2 = cnVar.v5;
                    smVar4.b = mjVar2.e;
                    smVar4.c = mjVar2.f;
                    smVar4.f();
                    if (cnVar.Qb == 2) {
                        cnVar.ic(cnVar.D5, cnVar.B5);
                    }
                } else {
                    ArrayList arrayList = new ArrayList();
                    org.telegram.messenger.kj kjVar = cnVar.v5.b;
                    if (kjVar != null) {
                        kjVar.b(arrayList);
                    }
                    cnVar.A8();
                }
            }
            if (cnVar.Cb && z9) {
                org.telegram.messenger.g0.i3(new org.telegram.ui.mk(nkVar, 0), 50L);
                cnVar.Cb = false;
            }
            Activity parentActivity = cnVar.getParentActivity();
            i7 = ((org.telegram.ui.ActionBar.f2) cnVar).classGuid;
            org.telegram.messenger.g0.a3(parentActivity, i7);
        }
    }

    public abstract void b();

    public abstract void c(boolean z9);

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
