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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class rb0 extends FrameLayout {
    public final ArrayList A;
    public final nb0 B;
    public final lg.a C;
    public TLRPC.Peer a;
    public final boolean b;
    public final org.telegram.ui.tn c;
    public final MessagePreviewParams d;
    public final pb0 e;
    public final sa0 f;
    public ValueAnimator h;
    public final TLRPC.User n;
    public final TLRPC.Chat r;
    public boolean s;
    public boolean v;
    public final int w;
    public boolean x;
    public final lh.m7 y;

    public rb0(Context context, org.telegram.ui.tn tnVar, lg.a aVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i10, nb0 nb0Var, int i11, final boolean z10) {
        super(context);
        this.y = new lh.m7(this, 26);
        this.A = new ArrayList(10);
        this.b = z10;
        this.c = tnVar;
        this.w = i10;
        this.C = aVar;
        this.n = user;
        this.r = chat;
        this.d = messagePreviewParams;
        this.B = nb0Var;
        this.f = new sa0(this, context, nb0Var);
        pb0 pb0Var = new pb0(context, nb0Var);
        this.e = pb0Var;
        ng.d c3 = aVar.c(pb0Var, null, false);
        c3.n(pg.a.j(nb0Var));
        c3.h.e = true;
        c3.o(AndroidUtilities.dp(8.0f));
        c3.p(AndroidUtilities.dp(16.0f));
        pb0Var.setBackground(c3);
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
        this.f.setAdapter(new ta0(this, context));
        this.f.setPosition(i12);
        this.e.setSelectedTab(i12);
        addView(this.e, i7.f6.e(-1, 66, 87));
        addView(this.f, i7.f6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 66.0f));
        this.e.setOnTabClick(new y2(this, 7));
        setOnTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Components.ra0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                rb0 rb0Var = rb0.this;
                rb0Var.getClass();
                if (motionEvent.getAction() == 1 && !z10) {
                    rb0Var.a(true);
                }
                return true;
            }
        });
        this.s = true;
        setAlpha(0.0f);
        setScaleX(0.95f);
        setScaleY(0.95f);
        animate().alpha(1.0f).scaleX(1.0f).setDuration(250L).setInterpolator(uh.m.V).scaleY(1.0f);
    }

    public final void a(boolean z10) {
        int i10;
        if (this.s) {
            this.s = false;
            animate().alpha(0.0f).scaleX(0.95f).scaleY(0.95f).setDuration(250L).setInterpolator(uh.m.V).setListener(new z9(14, this, z10));
            int i11 = 0;
            while (true) {
                View[] viewArr = this.f.e;
                if (i11 >= viewArr.length) {
                    break;
                }
                View view = viewArr[i11];
                if (view instanceof lb0) {
                    lb0 lb0Var = (lb0) view;
                    if (lb0Var.a == 0) {
                        lb0Var.j();
                        break;
                    }
                }
                i11++;
            }
            org.telegram.ui.zk zkVar = (org.telegram.ui.zk) this;
            org.telegram.ui.tn tnVar = zkVar.D;
            tnVar.Aa = null;
            tnVar.d7();
            MessagePreviewParams messagePreviewParams = tnVar.b5;
            if (messagePreviewParams != null) {
                if (tnVar.h5 == null) {
                    tnVar.h5 = messagePreviewParams.quote;
                }
                if (messagePreviewParams.quote == null) {
                    tnVar.h5 = null;
                }
                org.telegram.ui.jn jnVar = tnVar.h5;
                if (jnVar != null) {
                    jnVar.f = false;
                    jnVar.b = messagePreviewParams.quoteStart;
                    jnVar.c = messagePreviewParams.quoteEnd;
                    jnVar.e();
                    if (tnVar.kb == 2) {
                        tnVar.Cb(tnVar.j5, tnVar.h5);
                    }
                } else {
                    ArrayList<MessageObject> arrayList = new ArrayList<>();
                    MessagePreviewParams.Messages messages = tnVar.b5.forwardMessages;
                    if (messages != null) {
                        messages.getSelectedMessages(arrayList);
                    }
                    tnVar.j8();
                }
            }
            if (tnVar.ab && z10) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.yk(zkVar, 1), 50L);
                tnVar.ab = false;
            }
            Activity parentActivity = tnVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.o2) tnVar).classGuid;
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
                lb0 lb0Var = (lb0) view;
                if (lb0Var.a == 1) {
                    lb0Var.h();
                }
            }
            i10++;
        }
    }
}
