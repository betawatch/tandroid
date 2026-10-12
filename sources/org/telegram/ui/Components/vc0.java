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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public abstract class vc0 extends FrameLayout {
    public final ArrayList E;
    public final rc0 F;
    public final bh.b G;
    public TLRPC.Peer a;
    public final boolean b;
    public final org.telegram.ui.fo c;
    public final MessagePreviewParams d;
    public final tc0 e;
    public final wb0 f;
    public ValueAnimator h;
    public final TLRPC.User n;
    public final TLRPC.Chat r;
    public boolean s;
    public boolean v;
    public final int w;
    public boolean x;
    public final org.telegram.ui.Cells.t6 y;

    public vc0(Context context, org.telegram.ui.fo foVar, bh.b bVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i10, rc0 rc0Var, int i11, final boolean z10) {
        super(context);
        this.y = new org.telegram.ui.Cells.t6(this, 16);
        this.E = new ArrayList(10);
        this.b = z10;
        this.c = foVar;
        this.w = i10;
        this.G = bVar;
        this.n = user;
        this.r = chat;
        this.d = messagePreviewParams;
        this.F = rc0Var;
        this.f = new wb0(this, context, rc0Var);
        tc0 tc0Var = new tc0(context, rc0Var);
        this.e = tc0Var;
        dh.d c10 = bVar.c(tc0Var, null, false);
        c10.o(fh.b.k(rc0Var));
        c10.j.e = true;
        c10.p(AndroidUtilities.dp(8.0f));
        c10.q(AndroidUtilities.dp(16.0f));
        tc0Var.setBackground(c10);
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
        this.f.setAdapter(new xb0(this, context));
        this.f.setPosition(i12);
        this.e.setSelectedTab(i12);
        addView(this.e, w7.a6.e(-1, 66, 87));
        addView(this.f, w7.a6.a(-1.0f, 0.0f, 0.0f, 0.0f, 66.0f, -1, 119));
        this.e.setOnTabClick(new a3(this, 7));
        setOnTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Components.vb0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                vc0 vc0Var = vc0.this;
                vc0Var.getClass();
                if (motionEvent.getAction() == 1 && !z10) {
                    vc0Var.a(true);
                }
                return true;
            }
        });
        this.s = true;
        setAlpha(0.0f);
        setScaleX(0.95f);
        setScaleY(0.95f);
        animate().alpha(1.0f).scaleX(1.0f).setDuration(250L).setInterpolator(ki.n.V).scaleY(1.0f);
    }

    public final void a(boolean z10) {
        int i10;
        if (this.s) {
            this.s = false;
            animate().alpha(0.0f).scaleX(0.95f).scaleY(0.95f).setDuration(250L).setInterpolator(ki.n.V).setListener(new org.telegram.ui.vo(15, this, z10));
            int i11 = 0;
            while (true) {
                View[] viewArr = this.f.e;
                if (i11 >= viewArr.length) {
                    break;
                }
                View view = viewArr[i11];
                if (view instanceof pc0) {
                    pc0 pc0Var = (pc0) view;
                    if (pc0Var.a == 0) {
                        pc0Var.j();
                        break;
                    }
                }
                i11++;
            }
            org.telegram.ui.nl nlVar = (org.telegram.ui.nl) this;
            org.telegram.ui.fo foVar = nlVar.H;
            foVar.Fa = null;
            foVar.g7();
            MessagePreviewParams messagePreviewParams = foVar.f5;
            if (messagePreviewParams != null) {
                if (foVar.l5 == null) {
                    foVar.l5 = messagePreviewParams.quote;
                }
                if (messagePreviewParams.quote == null) {
                    foVar.l5 = null;
                }
                org.telegram.ui.un unVar = foVar.l5;
                if (unVar != null) {
                    unVar.f = false;
                    unVar.b = messagePreviewParams.quoteStart;
                    unVar.c = messagePreviewParams.quoteEnd;
                    unVar.e();
                    if (foVar.ob == 2) {
                        foVar.Gb(foVar.n5, foVar.l5);
                    }
                } else {
                    ArrayList<MessageObject> arrayList = new ArrayList<>();
                    MessagePreviewParams.Messages messages = foVar.f5.forwardMessages;
                    if (messages != null) {
                        messages.getSelectedMessages(arrayList);
                    }
                    foVar.m8();
                }
            }
            if (foVar.eb && z10) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ml(nlVar, 1), 50L);
                foVar.eb = false;
            }
            Activity parentActivity = foVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.m2) foVar).classGuid;
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
                pc0 pc0Var = (pc0) view;
                if (pc0Var.a == 1) {
                    pc0Var.h();
                }
            }
            i10++;
        }
    }
}
