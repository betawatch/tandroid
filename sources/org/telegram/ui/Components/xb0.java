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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public abstract class xb0 extends FrameLayout {
    public final ArrayList B;
    public final tb0 C;
    public final ng.a D;
    public TLRPC.Peer a;
    public final boolean b;
    public final org.telegram.ui.zn c;
    public final MessagePreviewParams d;
    public final vb0 e;
    public final ya0 f;
    public ValueAnimator h;
    public final TLRPC.User n;
    public final TLRPC.Chat r;
    public boolean s;
    public boolean v;
    public final int w;
    public boolean x;
    public final m2.b y;

    public xb0(Context context, org.telegram.ui.zn znVar, ng.a aVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i10, tb0 tb0Var, int i11, final boolean z4) {
        super(context);
        this.y = new m2.b(this, 25);
        this.B = new ArrayList(10);
        this.b = z4;
        this.c = znVar;
        this.w = i10;
        this.D = aVar;
        this.n = user;
        this.r = chat;
        this.d = messagePreviewParams;
        this.C = tb0Var;
        this.f = new ya0(this, context, tb0Var);
        vb0 vb0Var = new vb0(context, tb0Var);
        this.e = vb0Var;
        pg.b c3 = aVar.c(vb0Var, null, false);
        c3.n(rg.b.k(tb0Var));
        c3.h.e = true;
        c3.o(AndroidUtilities.dp(8.0f));
        c3.p(AndroidUtilities.dp(16.0f));
        vb0Var.setBackground(c3);
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
        this.f.setAdapter(new za0(this, context));
        this.f.setPosition(i12);
        this.e.setSelectedTab(i12);
        addView(this.e, k7.b6.e(-1, 66, 87));
        addView(this.f, k7.b6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 66.0f));
        this.e.setOnTabClick(new v2(this, 7));
        setOnTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Components.xa0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                xb0 xb0Var = xb0.this;
                xb0Var.getClass();
                if (motionEvent.getAction() == 1 && !z4) {
                    xb0Var.a(true);
                }
                return true;
            }
        });
        this.s = true;
        setAlpha(0.0f);
        setScaleX(0.95f);
        setScaleY(0.95f);
        animate().alpha(1.0f).scaleX(1.0f).setDuration(250L).setInterpolator(wh.n.V).scaleY(1.0f);
    }

    public final void a(boolean z4) {
        int i10;
        if (this.s) {
            this.s = false;
            animate().alpha(0.0f).scaleX(0.95f).scaleY(0.95f).setDuration(250L).setInterpolator(wh.n.V).setListener(new m00(6, this, z4));
            int i11 = 0;
            while (true) {
                View[] viewArr = this.f.e;
                if (i11 >= viewArr.length) {
                    break;
                }
                View view = viewArr[i11];
                if (view instanceof rb0) {
                    rb0 rb0Var = (rb0) view;
                    if (rb0Var.a == 0) {
                        rb0Var.j();
                        break;
                    }
                }
                i11++;
            }
            org.telegram.ui.hl hlVar = (org.telegram.ui.hl) this;
            org.telegram.ui.zn znVar = hlVar.E;
            znVar.Ba = null;
            znVar.d7();
            MessagePreviewParams messagePreviewParams = znVar.c5;
            if (messagePreviewParams != null) {
                if (znVar.i5 == null) {
                    znVar.i5 = messagePreviewParams.quote;
                }
                if (messagePreviewParams.quote == null) {
                    znVar.i5 = null;
                }
                org.telegram.ui.pn pnVar = znVar.i5;
                if (pnVar != null) {
                    pnVar.f = false;
                    pnVar.b = messagePreviewParams.quoteStart;
                    pnVar.c = messagePreviewParams.quoteEnd;
                    pnVar.e();
                    if (znVar.lb == 2) {
                        znVar.Cb(znVar.k5, znVar.i5);
                    }
                } else {
                    ArrayList<MessageObject> arrayList = new ArrayList<>();
                    MessagePreviewParams.Messages messages = znVar.c5.forwardMessages;
                    if (messages != null) {
                        messages.getSelectedMessages(arrayList);
                    }
                    znVar.j8();
                }
            }
            if (znVar.bb && z4) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.gl(hlVar, 1), 50L);
                znVar.bb = false;
            }
            Activity parentActivity = znVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.p2) znVar).classGuid;
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
                rb0 rb0Var = (rb0) view;
                if (rb0Var.a == 1) {
                    rb0Var.h();
                }
            }
            i10++;
        }
    }
}
