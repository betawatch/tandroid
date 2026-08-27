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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public abstract class gb0 extends FrameLayout {
    public final ArrayList A;
    public final cb0 B;
    public final jg.a C;
    public TLRPC.Peer a;
    public final boolean b;
    public final org.telegram.ui.rn c;
    public final MessagePreviewParams d;
    public final eb0 e;
    public final ia0 f;
    public ValueAnimator h;
    public final TLRPC.User n;
    public final TLRPC.Chat r;
    public boolean s;
    public boolean v;
    public final int w;
    public boolean x;
    public final m.i3 y;

    public gb0(Context context, org.telegram.ui.rn rnVar, jg.a aVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i10, cb0 cb0Var, int i11, final boolean z10) {
        super(context);
        this.y = new m.i3(this, 23);
        this.A = new ArrayList(10);
        this.b = z10;
        this.c = rnVar;
        this.w = i10;
        this.C = aVar;
        this.n = user;
        this.r = chat;
        this.d = messagePreviewParams;
        this.B = cb0Var;
        this.f = new ia0(this, context, cb0Var);
        eb0 eb0Var = new eb0(context, cb0Var);
        this.e = eb0Var;
        lg.d c10 = aVar.c(eb0Var, null, false);
        c10.n(ng.c.j(cb0Var));
        c10.h.e = true;
        c10.o(AndroidUtilities.dp(8.0f));
        c10.p(AndroidUtilities.dp(16.0f));
        eb0Var.setBackground(c10);
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
        this.f.setAdapter(new ja0(this, context));
        this.f.setPosition(i12);
        this.e.setSelectedTab(i12);
        addView(this.e, h7.z5.e(-1, 66, 87));
        addView(this.f, h7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 66.0f));
        this.e.setOnTabClick(new v2(this, 7));
        setOnTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Components.ha0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                gb0 gb0Var = gb0.this;
                gb0Var.getClass();
                if (motionEvent.getAction() == 1 && !z10) {
                    gb0Var.a(true);
                }
                return true;
            }
        });
        this.s = true;
        setAlpha(0.0f);
        setScaleX(0.95f);
        setScaleY(0.95f);
        animate().alpha(1.0f).scaleX(1.0f).setDuration(250L).setInterpolator(sh.m.V).scaleY(1.0f);
    }

    public final void a(boolean z10) {
        int i10;
        if (this.s) {
            this.s = false;
            animate().alpha(0.0f).scaleX(0.95f).scaleY(0.95f).setDuration(250L).setInterpolator(sh.m.V).setListener(new org.telegram.ui.go(15, this, z10));
            int i11 = 0;
            while (true) {
                View[] viewArr = this.f.e;
                if (i11 >= viewArr.length) {
                    break;
                }
                View view = viewArr[i11];
                if (view instanceof ab0) {
                    ab0 ab0Var = (ab0) view;
                    if (ab0Var.a == 0) {
                        ab0Var.j();
                        break;
                    }
                }
                i11++;
            }
            org.telegram.ui.yk ykVar = (org.telegram.ui.yk) this;
            org.telegram.ui.rn rnVar = ykVar.D;
            rnVar.Aa = null;
            rnVar.d7();
            MessagePreviewParams messagePreviewParams = rnVar.b5;
            if (messagePreviewParams != null) {
                if (rnVar.h5 == null) {
                    rnVar.h5 = messagePreviewParams.quote;
                }
                if (messagePreviewParams.quote == null) {
                    rnVar.h5 = null;
                }
                org.telegram.ui.hn hnVar = rnVar.h5;
                if (hnVar != null) {
                    hnVar.f = false;
                    hnVar.b = messagePreviewParams.quoteStart;
                    hnVar.c = messagePreviewParams.quoteEnd;
                    hnVar.e();
                    if (rnVar.kb == 2) {
                        rnVar.Cb(rnVar.j5, rnVar.h5);
                    }
                } else {
                    ArrayList<MessageObject> arrayList = new ArrayList<>();
                    MessagePreviewParams.Messages messages = rnVar.b5.forwardMessages;
                    if (messages != null) {
                        messages.getSelectedMessages(arrayList);
                    }
                    rnVar.j8();
                }
            }
            if (rnVar.ab && z10) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.xk(ykVar, 1), 50L);
                rnVar.ab = false;
            }
            Activity parentActivity = rnVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.n2) rnVar).classGuid;
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
                ab0 ab0Var = (ab0) view;
                if (ab0Var.a == 1) {
                    ab0Var.h();
                }
            }
            i10++;
        }
    }
}
