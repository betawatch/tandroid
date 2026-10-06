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

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public abstract class ic0 extends FrameLayout {
    public final ArrayList E;
    public final ec0 F;
    public final ah.c G;
    public TLRPC.Peer a;
    public final boolean b;
    public final org.telegram.ui.yn c;
    public final MessagePreviewParams d;
    public final gc0 e;
    public final jb0 f;
    public ValueAnimator h;
    public final TLRPC.User n;
    public final TLRPC.Chat r;
    public boolean s;
    public boolean v;
    public final int w;
    public boolean x;
    public final org.telegram.ui.Cells.t6 y;

    public ic0(Context context, org.telegram.ui.yn ynVar, ah.c cVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i10, ec0 ec0Var, int i11, final boolean z10) {
        super(context);
        this.y = new org.telegram.ui.Cells.t6(this, 17);
        this.E = new ArrayList(10);
        this.b = z10;
        this.c = ynVar;
        this.w = i10;
        this.G = cVar;
        this.n = user;
        this.r = chat;
        this.d = messagePreviewParams;
        this.F = ec0Var;
        this.f = new jb0(this, context, ec0Var);
        gc0 gc0Var = new gc0(context, ec0Var);
        this.e = gc0Var;
        ch.d c10 = cVar.c(gc0Var, null, false);
        c10.w(eh.b.k(ec0Var));
        c10.l.e = true;
        c10.x(AndroidUtilities.dp(8.0f));
        c10.y(AndroidUtilities.dp(16.0f));
        gc0Var.setBackground(c10);
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
        this.f.setAdapter(new kb0(this, context));
        this.f.setPosition(i12);
        this.e.setSelectedTab(i12);
        addView(this.e, w7.z5.e(-1, 66, 87));
        addView(this.f, w7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 66.0f));
        this.e.setOnTabClick(new y2(this, 7));
        setOnTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Components.ib0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                ic0 ic0Var = ic0.this;
                ic0Var.getClass();
                if (motionEvent.getAction() == 1 && !z10) {
                    ic0Var.a(true);
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
            animate().alpha(0.0f).scaleX(0.95f).scaleY(0.95f).setDuration(250L).setInterpolator(ji.n.V).setListener(new da(14, this, z10));
            int i11 = 0;
            while (true) {
                View[] viewArr = this.f.e;
                if (i11 >= viewArr.length) {
                    break;
                }
                View view = viewArr[i11];
                if (view instanceof cc0) {
                    cc0 cc0Var = (cc0) view;
                    if (cc0Var.a == 0) {
                        cc0Var.j();
                        break;
                    }
                }
                i11++;
            }
            org.telegram.ui.el elVar = (org.telegram.ui.el) this;
            org.telegram.ui.yn ynVar = elVar.H;
            ynVar.Ca = null;
            ynVar.d7();
            MessagePreviewParams messagePreviewParams = ynVar.d5;
            if (messagePreviewParams != null) {
                if (ynVar.j5 == null) {
                    ynVar.j5 = messagePreviewParams.quote;
                }
                if (messagePreviewParams.quote == null) {
                    ynVar.j5 = null;
                }
                org.telegram.ui.on onVar = ynVar.j5;
                if (onVar != null) {
                    onVar.f = false;
                    onVar.b = messagePreviewParams.quoteStart;
                    onVar.c = messagePreviewParams.quoteEnd;
                    onVar.e();
                    if (ynVar.lb == 2) {
                        ynVar.Bb(ynVar.l5, ynVar.j5);
                    }
                } else {
                    ArrayList<MessageObject> arrayList = new ArrayList<>();
                    MessagePreviewParams.Messages messages = ynVar.d5.forwardMessages;
                    if (messages != null) {
                        messages.getSelectedMessages(arrayList);
                    }
                    ynVar.j8();
                }
            }
            if (ynVar.bb && z10) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.dl(elVar, 1), 50L);
                ynVar.bb = false;
            }
            Activity parentActivity = ynVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.n2) ynVar).classGuid;
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
                cc0 cc0Var = (cc0) view;
                if (cc0Var.a == 1) {
                    cc0Var.h();
                }
            }
            i10++;
        }
    }
}
