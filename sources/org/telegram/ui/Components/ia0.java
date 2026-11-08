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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public abstract class ia0 extends FrameLayout {
    public final et D;
    public final ArrayList E;
    public final ea0 F;
    public final dh.c G;
    public TLRPC.Peer a;
    public final boolean b;
    public final org.telegram.ui.an c;
    public final org.telegram.messenger.mj d;
    public final ga0 e;
    public final n90 f;
    public ValueAnimator h;
    public final TLRPC.User n;
    public final TLRPC.Chat r;
    public boolean s;
    public boolean w;
    public final int x;
    public boolean y;

    public ia0(Context context, org.telegram.ui.an anVar, dh.c cVar, org.telegram.messenger.mj mjVar, TLRPC.User user, TLRPC.Chat chat, int i7, ea0 ea0Var, int i10, final boolean z9) {
        super(context);
        this.D = new et(this, 7);
        this.E = new ArrayList(10);
        this.b = z9;
        this.c = anVar;
        this.x = i7;
        this.G = cVar;
        this.n = user;
        this.r = chat;
        this.d = mjVar;
        this.F = ea0Var;
        this.f = new n90(this, context, ea0Var);
        ga0 ga0Var = new ga0(context, ea0Var);
        this.e = ga0Var;
        fh.g c10 = cVar.c(ga0Var, null, false);
        c10.p(c8.g0.k(ea0Var));
        c10.Q.e = true;
        c10.q(org.telegram.messenger.g0.L(8.0f));
        c10.r(org.telegram.messenger.g0.L(16.0f));
        ga0Var.setBackground(c10);
        int i11 = 0;
        for (int i12 = 0; i12 < 3; i12++) {
            if (i12 == 0 && mjVar.a != null) {
                this.e.a(0, org.telegram.messenger.id.M0(2131748548, null));
            } else if (i12 == 1 && mjVar.b != null && !z9) {
                this.e.a(1, org.telegram.messenger.id.M0(2131748552, null));
            } else if (i12 == 2 && mjVar.c != null && !z9) {
                this.e.a(2, org.telegram.messenger.id.M0(2131748551, null));
            }
            if (i12 == i10) {
                i11 = this.e.a.size() - 1;
            }
        }
        this.f.setAdapter(new o90(this, context));
        this.f.setPosition(i11);
        this.e.setSelectedTab(i11);
        addView(this.e, c8.ha.e(-1, 66, 87));
        addView(this.f, c8.ha.d(-1, -1.0f, org.telegram.messenger.qs.E1, 0.0f, 0.0f, 0.0f, 66.0f));
        this.e.setOnTabClick(new s2(this, 6));
        setOnTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Components.m90
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                ia0 ia0Var = ia0.this;
                ia0Var.getClass();
                if (motionEvent.getAction() == 1 && !z9) {
                    ia0Var.a(true);
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
                if (view instanceof ca0) {
                    ca0 ca0Var = (ca0) view;
                    if (ca0Var.a == 0) {
                        ca0Var.k();
                        break;
                    }
                }
                i10++;
            }
            org.telegram.ui.lk lkVar = (org.telegram.ui.lk) this;
            org.telegram.ui.an anVar = lkVar.H;
            anVar.Ya = null;
            anVar.r7();
            org.telegram.messenger.mj mjVar = anVar.v5;
            if (mjVar != null) {
                if (anVar.B5 == null) {
                    anVar.B5 = mjVar.d;
                }
                org.telegram.ui.qm qmVar = mjVar.d;
                if (qmVar == null) {
                    anVar.B5 = null;
                }
                org.telegram.ui.qm qmVar2 = anVar.B5;
                if (qmVar2 != null && qmVar2.m && qmVar != null && qmVar.m) {
                    boolean z10 = true;
                    if (!qmVar.g) {
                        if (!qmVar.h) {
                            z10 = true ^ TextUtils.isEmpty(qmVar.i);
                        }
                        if (z10) {
                            org.telegram.ui.qm qmVar3 = anVar.v5.d;
                            anVar.B5 = qmVar3;
                            qmVar3.f = false;
                            if (anVar.Ob == 2) {
                                anVar.fc(anVar.D5, qmVar3);
                            }
                        }
                    }
                }
                org.telegram.ui.qm qmVar4 = anVar.B5;
                if (qmVar4 != null) {
                    qmVar4.f = false;
                    org.telegram.messenger.mj mjVar2 = anVar.v5;
                    qmVar4.b = mjVar2.e;
                    qmVar4.c = mjVar2.f;
                    qmVar4.f();
                    if (anVar.Ob == 2) {
                        anVar.fc(anVar.D5, anVar.B5);
                    }
                } else {
                    ArrayList arrayList = new ArrayList();
                    org.telegram.messenger.kj kjVar = anVar.v5.b;
                    if (kjVar != null) {
                        kjVar.b(arrayList);
                    }
                    anVar.z8();
                }
            }
            if (anVar.Ab && z9) {
                org.telegram.messenger.g0.i3(new org.telegram.ui.kk(lkVar, 0), 50L);
                anVar.Ab = false;
            }
            Activity parentActivity = anVar.getParentActivity();
            i7 = ((org.telegram.ui.ActionBar.f2) anVar).classGuid;
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
                ca0 ca0Var = (ca0) view;
                if (ca0Var.a == 1) {
                    ca0Var.i();
                }
            }
            i7++;
        }
    }
}
