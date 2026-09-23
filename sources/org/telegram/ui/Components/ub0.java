package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public abstract class ub0 extends FrameLayout {
    public final ArrayList E;
    public final qb0 F;
    public final ah.c G;
    public TLRPC.Peer a;
    public final boolean b;
    public final org.telegram.ui.xn c;
    public final MessagePreviewParams d;
    public final sb0 e;
    public final wa0 f;
    public ValueAnimator h;
    public final TLRPC.User n;
    public final TLRPC.Chat r;
    public boolean s;
    public boolean v;
    public final int w;
    public boolean x;
    public final org.telegram.ui.Cells.l7 y;

    public ub0(Context context, org.telegram.ui.xn xnVar, ah.c cVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i10, qb0 qb0Var, int i11, final boolean z10) {
        super(context);
        this.y = new org.telegram.ui.Cells.l7(this, 16);
        this.E = new ArrayList(10);
        this.b = z10;
        this.c = xnVar;
        this.w = i10;
        this.G = cVar;
        this.n = user;
        this.r = chat;
        this.d = messagePreviewParams;
        this.F = qb0Var;
        this.f = new wa0(this, context, qb0Var);
        sb0 sb0Var = new sb0(context, qb0Var);
        this.e = sb0Var;
        ch.d c10 = cVar.c(sb0Var, null, false);
        c10.o(eh.b.k(qb0Var));
        c10.j.e = true;
        c10.p(AndroidUtilities.dp(8.0f));
        c10.q(AndroidUtilities.dp(16.0f));
        sb0Var.setBackground(c10);
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
        this.f.setAdapter(new xa0(this, context));
        this.f.setPosition(i12);
        this.e.setSelectedTab(i12);
        addView(this.e, w7.x5.e(-1, 66, 87));
        addView(this.f, w7.x5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 66.0f));
        this.e.setOnTabClick(new x2(this, 7));
        setOnTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Components.va0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                ub0 ub0Var = ub0.this;
                ub0Var.getClass();
                if (motionEvent.getAction() == 1 && !z10) {
                    ub0Var.a(true);
                }
                return true;
            }
        });
        this.s = true;
        setAlpha(0.0f);
        setScaleX(0.95f);
        setScaleY(0.95f);
        animate().alpha(1.0f).scaleX(1.0f).setDuration(250L).setInterpolator(ji.n.V).scaleY(1.0f);
    }

    public final void a(boolean z10) {
        int i10;
        if (this.s) {
            this.s = false;
            animate().alpha(0.0f).scaleX(0.95f).scaleY(0.95f).setDuration(250L).setInterpolator(ji.n.V).setListener(new ca(14, this, z10));
            int i11 = 0;
            while (true) {
                View[] viewArr = this.f.e;
                if (i11 >= viewArr.length) {
                    break;
                }
                View view = viewArr[i11];
                if (view instanceof ob0) {
                    ob0 ob0Var = (ob0) view;
                    if (ob0Var.a == 0) {
                        ob0Var.j();
                        break;
                    }
                }
                i11++;
            }
            org.telegram.ui.fl flVar = (org.telegram.ui.fl) this;
            org.telegram.ui.xn xnVar = flVar.H;
            xnVar.Ea = null;
            xnVar.d7();
            MessagePreviewParams messagePreviewParams = xnVar.f5;
            if (messagePreviewParams != null) {
                if (xnVar.l5 == null) {
                    xnVar.l5 = messagePreviewParams.quote;
                }
                if (messagePreviewParams.quote == null) {
                    xnVar.l5 = null;
                }
                org.telegram.ui.nn nnVar = xnVar.l5;
                if (nnVar != null) {
                    nnVar.f = false;
                    nnVar.b = messagePreviewParams.quoteStart;
                    nnVar.c = messagePreviewParams.quoteEnd;
                    nnVar.e();
                    if (xnVar.nb == 2) {
                        xnVar.Cb(xnVar.n5, xnVar.l5);
                    }
                } else {
                    ArrayList<MessageObject> arrayList = new ArrayList<>();
                    MessagePreviewParams.Messages messages = xnVar.f5.forwardMessages;
                    if (messages != null) {
                        messages.getSelectedMessages(arrayList);
                    }
                    xnVar.j8();
                }
            }
            if (xnVar.db && z10) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.el(flVar, 1), 50L);
                xnVar.db = false;
            }
            Activity parentActivity = xnVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.n2) xnVar).classGuid;
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
                ob0 ob0Var = (ob0) view;
                if (ob0Var.a == 1) {
                    ob0Var.h();
                }
            }
            i10++;
        }
    }
}
