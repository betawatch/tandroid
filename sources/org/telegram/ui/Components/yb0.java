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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public abstract class yb0 extends FrameLayout {
    public final ArrayList B;
    public final ub0 C;
    public final og.a D;
    public TLRPC.Peer a;
    public final boolean b;
    public final org.telegram.ui.xn c;
    public final MessagePreviewParams d;
    public final wb0 e;
    public final za0 f;
    public ValueAnimator h;
    public final TLRPC.User n;
    public final TLRPC.Chat r;
    public boolean s;
    public boolean v;
    public final int w;
    public boolean x;
    public final m2.b y;

    public yb0(Context context, org.telegram.ui.xn xnVar, og.a aVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i10, ub0 ub0Var, int i11, final boolean z4) {
        super(context);
        this.y = new m2.b(this, 25);
        this.B = new ArrayList(10);
        this.b = z4;
        this.c = xnVar;
        this.w = i10;
        this.D = aVar;
        this.n = user;
        this.r = chat;
        this.d = messagePreviewParams;
        this.C = ub0Var;
        this.f = new za0(this, context, ub0Var);
        wb0 wb0Var = new wb0(context, ub0Var);
        this.e = wb0Var;
        qg.b c3 = aVar.c(wb0Var, null, false);
        c3.n(sg.b.j(ub0Var));
        c3.h.e = true;
        c3.o(AndroidUtilities.dp(8.0f));
        c3.p(AndroidUtilities.dp(16.0f));
        wb0Var.setBackground(c3);
        int i12 = 0;
        for (int i13 = 0; i13 < 3; i13++) {
            if (i13 == 0 && messagePreviewParams.replyMessage != null) {
                this.e.a(0, LocaleController.getString(R.string.MessageOptionsReply));
            } else if (i13 != 1 || messagePreviewParams.forwardMessages == null || z4) {
                if (i13 == 2 && messagePreviewParams.linkMessage != null && !z4) {
                    this.e.a(2, LocaleController.getString(R.string.MessageOptionsLink));
                }
            } else {
                this.e.a(1, LocaleController.getString(R.string.MessageOptionsForward));
            }
            if (i13 == i11) {
                i12 = this.e.a.size() - 1;
            }
        }
        this.f.setAdapter(new ab0(this, context));
        this.f.setPosition(i12);
        this.e.setSelectedTab(i12);
        addView(this.e, k7.c6.e(-1, 66, 87));
        addView(this.f, k7.c6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 66.0f));
        this.e.setOnTabClick(new v2(this, 7));
        setOnTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Components.ya0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                yb0 yb0Var = yb0.this;
                yb0Var.getClass();
                if (motionEvent.getAction() == 1 && !z4) {
                    yb0Var.a(true);
                }
                return true;
            }
        });
        this.s = true;
        setAlpha(0.0f);
        setScaleX(0.95f);
        setScaleY(0.95f);
        animate().alpha(1.0f).scaleX(1.0f).setDuration(250L).setInterpolator(xh.n.V).scaleY(1.0f);
    }

    public final void a(boolean z4) {
        int i10;
        if (this.s) {
            this.s = false;
            animate().alpha(0.0f).scaleX(0.95f).scaleY(0.95f).setDuration(250L).setInterpolator(xh.n.V).setListener(new x20(4, this, z4));
            int i11 = 0;
            while (true) {
                View[] viewArr = this.f.e;
                if (i11 >= viewArr.length) {
                    break;
                }
                View view = viewArr[i11];
                if (view instanceof sb0) {
                    sb0 sb0Var = (sb0) view;
                    if (sb0Var.a == 0) {
                        sb0Var.j();
                        break;
                    }
                }
                i11++;
            }
            org.telegram.ui.fl flVar = (org.telegram.ui.fl) this;
            org.telegram.ui.xn xnVar = flVar.E;
            xnVar.Ba = null;
            xnVar.d7();
            MessagePreviewParams messagePreviewParams = xnVar.c5;
            if (messagePreviewParams != null) {
                if (xnVar.i5 == null) {
                    xnVar.i5 = messagePreviewParams.quote;
                }
                if (messagePreviewParams.quote == null) {
                    xnVar.i5 = null;
                }
                org.telegram.ui.nn nnVar = xnVar.i5;
                if (nnVar != null) {
                    nnVar.f = false;
                    nnVar.b = messagePreviewParams.quoteStart;
                    nnVar.c = messagePreviewParams.quoteEnd;
                    nnVar.e();
                    if (xnVar.lb == 2) {
                        xnVar.Cb(xnVar.k5, xnVar.i5);
                    }
                } else {
                    ArrayList<MessageObject> arrayList = new ArrayList<>();
                    MessagePreviewParams.Messages messages = xnVar.c5.forwardMessages;
                    if (messages != null) {
                        messages.getSelectedMessages(arrayList);
                    }
                    xnVar.j8();
                }
            }
            if (xnVar.bb && z4) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.el(flVar, 1), 50L);
                xnVar.bb = false;
            }
            Activity parentActivity = xnVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.p2) xnVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity, i10);
        }
    }

    public abstract void b();

    public abstract void c(boolean z4);

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
                sb0 sb0Var = (sb0) view;
                if (sb0Var.a == 1) {
                    sb0Var.h();
                }
            }
            i10++;
        }
    }
}
