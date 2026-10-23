package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public abstract class oc0 extends FrameLayout {
    public final ArrayList E;
    public final kc0 F;
    public final bh.b G;
    public TLRPC.Peer a;
    public final boolean b;
    public final org.telegram.ui.qn c;
    public final MessagePreviewParams d;
    public final mc0 e;
    public final qb0 f;
    public ValueAnimator h;
    public final TLRPC.User n;
    public final TLRPC.Chat r;
    public boolean s;
    public boolean v;
    public final int w;
    public boolean x;
    public final org.telegram.ui.Cells.k7 y;

    public oc0(Context context, org.telegram.ui.qn qnVar, bh.b bVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i10, kc0 kc0Var, int i11, final boolean z10) {
        super(context);
        this.y = new org.telegram.ui.Cells.k7(this, 15);
        this.E = new ArrayList(10);
        this.b = z10;
        this.c = qnVar;
        this.w = i10;
        this.G = bVar;
        this.n = user;
        this.r = chat;
        this.d = messagePreviewParams;
        this.F = kc0Var;
        this.f = new qb0(this, context, kc0Var);
        mc0 mc0Var = new mc0(context, kc0Var);
        this.e = mc0Var;
        dh.d c10 = bVar.c(mc0Var, null, false);
        c10.o(fh.c.k(kc0Var));
        c10.j.e = true;
        c10.p(AndroidUtilities.dp(8.0f));
        c10.q(AndroidUtilities.dp(16.0f));
        mc0Var.setBackground(c10);
        int i12 = 0;
        for (int i13 = 0; i13 < 3; i13++) {
            if (i13 == 0 && messagePreviewParams.replyMessage != null) {
                this.e.a(0, LocaleController.getString(R.string.MessageOptionsReply));
            } else if (i13 != 1 || messagePreviewParams.forwardMessages == null || z10) {
                if (i13 == 2 && messagePreviewParams.linkMessage != null && !z10) {
                    this.e.a(2, LocaleController.getString(R.string.MessageOptionsLink));
                }
            } else {
                this.e.a(1, LocaleController.getString(R.string.MessageOptionsForward));
            }
            if (i13 == i11) {
                i12 = this.e.a.size() - 1;
            }
        }
        this.f.setAdapter(new rb0(this, context));
        this.f.setPosition(i12);
        this.e.setSelectedTab(i12);
        addView(this.e, w7.z5.e(-1, 66, 87));
        addView(this.f, w7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 66.0f));
        this.e.setOnTabClick(new z2(this, 7));
        setOnTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Components.pb0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                oc0 oc0Var = oc0.this;
                oc0Var.getClass();
                if (motionEvent.getAction() == 1 && !z10) {
                    oc0Var.a(true);
                }
                return true;
            }
        });
        this.s = true;
        setAlpha(0.0f);
        setScaleX(0.95f);
        setScaleY(0.95f);
        animate().alpha(1.0f).scaleX(1.0f).setDuration(250L).setInterpolator(li.m.V).scaleY(1.0f);
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
        int i10;
        if (this.s) {
            this.s = false;
            animate().alpha(0.0f).scaleX(0.95f).scaleY(0.95f).setDuration(250L).setInterpolator(li.m.V).setListener(new org.telegram.ui.fo(15, this, z10));
            int i11 = 0;
            while (true) {
                View[] viewArr = this.f.e;
                if (i11 >= viewArr.length) {
                    break;
                }
                View view = viewArr[i11];
                if (view instanceof ic0) {
                    ic0 ic0Var = (ic0) view;
                    if (ic0Var.a == 0) {
                        ic0Var.k();
                        break;
                    }
                }
                i11++;
            }
            org.telegram.ui.al alVar = (org.telegram.ui.al) this;
            org.telegram.ui.qn qnVar = alVar.H;
            qnVar.Fa = null;
            qnVar.g7();
            MessagePreviewParams messagePreviewParams = qnVar.f5;
            if (messagePreviewParams != null) {
                if (qnVar.l5 == null) {
                    qnVar.l5 = messagePreviewParams.quote;
                }
                org.telegram.ui.gn gnVar = messagePreviewParams.quote;
                if (gnVar == null) {
                    qnVar.l5 = null;
                }
                org.telegram.ui.gn gnVar2 = qnVar.l5;
                if (gnVar2 != null && gnVar2.m && gnVar != null && gnVar.m) {
                    boolean z11 = true;
                    if (!gnVar.g) {
                        if (!gnVar.h) {
                            z11 = true ^ TextUtils.isEmpty(gnVar.i);
                        }
                        if (z11) {
                            org.telegram.ui.gn gnVar3 = qnVar.f5.quote;
                            qnVar.l5 = gnVar3;
                            gnVar3.f = false;
                            if (qnVar.ob == 2) {
                                qnVar.Hb(qnVar.n5, gnVar3);
                            }
                        }
                    }
                }
                org.telegram.ui.gn gnVar4 = qnVar.l5;
                if (gnVar4 != null) {
                    gnVar4.f = false;
                    MessagePreviewParams messagePreviewParams2 = qnVar.f5;
                    gnVar4.b = messagePreviewParams2.quoteStart;
                    gnVar4.c = messagePreviewParams2.quoteEnd;
                    gnVar4.f();
                    if (qnVar.ob == 2) {
                        qnVar.Hb(qnVar.n5, qnVar.l5);
                    }
                } else {
                    ArrayList<MessageObject> arrayList = new ArrayList<>();
                    MessagePreviewParams.Messages messages = qnVar.f5.forwardMessages;
                    if (messages != null) {
                        messages.getSelectedMessages(arrayList);
                    }
                    qnVar.m8();
                }
            }
            if (qnVar.eb && z10) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.zk(alVar, 1), 50L);
                qnVar.eb = false;
            }
            Activity parentActivity = qnVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.n2) qnVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity, i10);
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
                ic0 ic0Var = (ic0) view;
                if (ic0Var.a == 1) {
                    ic0Var.i();
                }
            }
            i10++;
        }
    }
}
