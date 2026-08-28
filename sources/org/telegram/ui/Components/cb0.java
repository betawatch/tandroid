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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class cb0 extends FrameLayout {
    public final ArrayList A;
    public final ya0 B;
    public final ig.a C;
    public TLRPC.Peer a;
    public final boolean b;
    public final org.telegram.ui.qn c;
    public final MessagePreviewParams d;
    public final ab0 e;
    public final ea0 f;
    public ValueAnimator h;
    public final TLRPC.User n;
    public final TLRPC.Chat r;
    public boolean s;
    public boolean v;
    public final int w;
    public boolean x;
    public final m.i3 y;

    public cb0(Context context, org.telegram.ui.qn qnVar, ig.a aVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i9, ya0 ya0Var, int i10, final boolean z10) {
        super(context);
        this.y = new m.i3(this, 23);
        this.A = new ArrayList(10);
        this.b = z10;
        this.c = qnVar;
        this.w = i9;
        this.C = aVar;
        this.n = user;
        this.r = chat;
        this.d = messagePreviewParams;
        this.B = ya0Var;
        this.f = new ea0(this, context, ya0Var);
        ab0 ab0Var = new ab0(context, ya0Var);
        this.e = ab0Var;
        kg.d c10 = aVar.c(ab0Var, null, false);
        c10.n(mg.c.j(ya0Var));
        c10.h.e = true;
        c10.o(AndroidUtilities.dp(8.0f));
        c10.p(AndroidUtilities.dp(16.0f));
        ab0Var.setBackground(c10);
        int i11 = 0;
        for (int i12 = 0; i12 < 3; i12++) {
            if (i12 == 0 && messagePreviewParams.replyMessage != null) {
                this.e.a(0, LocaleController.getString(R.string.MessageOptionsReply));
            } else if (i12 != 1 || messagePreviewParams.forwardMessages == null || z10) {
                if (i12 == 2 && messagePreviewParams.linkMessage != null && !z10) {
                    this.e.a(2, LocaleController.getString(R.string.MessageOptionsLink));
                }
            } else {
                this.e.a(1, LocaleController.getString(R.string.MessageOptionsForward));
            }
            if (i12 == i10) {
                i11 = this.e.a.size() - 1;
            }
        }
        this.f.setAdapter(new fa0(this, context));
        this.f.setPosition(i11);
        this.e.setSelectedTab(i11);
        addView(this.e, g7.e6.e(-1, 66, 87));
        addView(this.f, g7.e6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 66.0f));
        this.e.setOnTabClick(new v2(this, 7));
        setOnTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Components.da0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                cb0 cb0Var = cb0.this;
                cb0Var.getClass();
                if (motionEvent.getAction() == 1 && !z10) {
                    cb0Var.a(true);
                }
                return true;
            }
        });
        this.s = true;
        setAlpha(0.0f);
        setScaleX(0.95f);
        setScaleY(0.95f);
        animate().alpha(1.0f).scaleX(1.0f).setDuration(250L).setInterpolator(rh.m.V).scaleY(1.0f);
    }

    public final void a(boolean z10) {
        int i9;
        if (this.s) {
            this.s = false;
            animate().alpha(0.0f).scaleX(0.95f).scaleY(0.95f).setDuration(250L).setInterpolator(rh.m.V).setListener(new u9(14, this, z10));
            int i10 = 0;
            while (true) {
                View[] viewArr = this.f.e;
                if (i10 >= viewArr.length) {
                    break;
                }
                View view = viewArr[i10];
                if (view instanceof wa0) {
                    wa0 wa0Var = (wa0) view;
                    if (wa0Var.a == 0) {
                        wa0Var.j();
                        break;
                    }
                }
                i10++;
            }
            org.telegram.ui.wk wkVar = (org.telegram.ui.wk) this;
            org.telegram.ui.qn qnVar = wkVar.D;
            qnVar.Aa = null;
            qnVar.d7();
            MessagePreviewParams messagePreviewParams = qnVar.b5;
            if (messagePreviewParams != null) {
                if (qnVar.h5 == null) {
                    qnVar.h5 = messagePreviewParams.quote;
                }
                if (messagePreviewParams.quote == null) {
                    qnVar.h5 = null;
                }
                org.telegram.ui.gn gnVar = qnVar.h5;
                if (gnVar != null) {
                    gnVar.f = false;
                    gnVar.b = messagePreviewParams.quoteStart;
                    gnVar.c = messagePreviewParams.quoteEnd;
                    gnVar.e();
                    if (qnVar.kb == 2) {
                        qnVar.Cb(qnVar.j5, qnVar.h5);
                    }
                } else {
                    ArrayList<MessageObject> arrayList = new ArrayList<>();
                    MessagePreviewParams.Messages messages = qnVar.b5.forwardMessages;
                    if (messages != null) {
                        messages.getSelectedMessages(arrayList);
                    }
                    qnVar.j8();
                }
            }
            if (qnVar.ab && z10) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.vk(wkVar, 1), 50L);
                qnVar.ab = false;
            }
            Activity parentActivity = qnVar.getParentActivity();
            i9 = ((org.telegram.ui.ActionBar.o2) qnVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity, i9);
        }
    }

    public abstract void b();

    public abstract void c(boolean z10);

    public void setSendAsPeer(TLRPC.Peer peer) {
        this.a = peer;
        int i9 = 0;
        while (true) {
            View[] viewArr = this.f.e;
            if (i9 >= viewArr.length) {
                return;
            }
            View view = viewArr[i9];
            if (view != null) {
                wa0 wa0Var = (wa0) view;
                if (wa0Var.a == 1) {
                    wa0Var.h();
                }
            }
            i9++;
        }
    }
}
