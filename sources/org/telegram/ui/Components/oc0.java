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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public abstract class oc0 extends FrameLayout {
    public final ArrayList E;
    public final kc0 F;
    public final ch.b G;
    public TLRPC.Peer a;
    public final boolean b;
    public final org.telegram.ui.wn c;
    public final MessagePreviewParams d;
    public final mc0 e;
    public final pb0 f;
    public ValueAnimator h;
    public final TLRPC.User n;
    public final TLRPC.Chat r;
    public boolean s;
    public boolean v;
    public final int w;
    public boolean x;
    public final m.g3 y;

    public oc0(Context context, org.telegram.ui.wn wnVar, ch.b bVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i10, kc0 kc0Var, int i11, final boolean z10) {
        super(context);
        this.y = new m.g3(this, 21);
        this.E = new ArrayList(10);
        this.b = z10;
        this.c = wnVar;
        this.w = i10;
        this.G = bVar;
        this.n = user;
        this.r = chat;
        this.d = messagePreviewParams;
        this.F = kc0Var;
        this.f = new pb0(this, context, kc0Var);
        mc0 mc0Var = new mc0(context, kc0Var);
        this.e = mc0Var;
        eh.d c10 = bVar.c(mc0Var, null, false);
        c10.v(gh.c.k(kc0Var));
        c10.x.e = true;
        c10.w(AndroidUtilities.dp(8.0f));
        c10.x(AndroidUtilities.dp(16.0f));
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
        this.f.setAdapter(new qb0(this, context));
        this.f.setPosition(i12);
        this.e.setSelectedTab(i12);
        addView(this.e, kb1.i(-1, 66, 87));
        addView(this.f, kb1.h(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 66.0f));
        this.e.setOnTabClick(new b3(this, 6));
        setOnTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Components.ob0
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
        animate().alpha(1.0f).scaleX(1.0f).setDuration(250L).setInterpolator(mi.m.V).scaleY(1.0f);
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
            animate().alpha(0.0f).scaleX(0.95f).scaleY(0.95f).setDuration(250L).setInterpolator(mi.m.V).setListener(new org.telegram.ui.lo(15, this, z10));
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
            org.telegram.ui.el elVar = (org.telegram.ui.el) this;
            org.telegram.ui.wn wnVar = elVar.H;
            wnVar.Va = null;
            wnVar.m7();
            MessagePreviewParams messagePreviewParams = wnVar.v5;
            if (messagePreviewParams != null) {
                if (wnVar.B5 == null) {
                    wnVar.B5 = messagePreviewParams.quote;
                }
                org.telegram.ui.mn mnVar = messagePreviewParams.quote;
                if (mnVar == null) {
                    wnVar.B5 = null;
                }
                org.telegram.ui.mn mnVar2 = wnVar.B5;
                if (mnVar2 != null && mnVar2.m && mnVar != null && mnVar.m) {
                    boolean z11 = true;
                    if (!mnVar.g) {
                        if (!mnVar.h) {
                            z11 = true ^ TextUtils.isEmpty(mnVar.i);
                        }
                        if (z11) {
                            org.telegram.ui.mn mnVar3 = wnVar.v5.quote;
                            wnVar.B5 = mnVar3;
                            mnVar3.f = false;
                            if (wnVar.Ob == 2) {
                                wnVar.Sb(wnVar.D5, mnVar3);
                            }
                        }
                    }
                }
                org.telegram.ui.mn mnVar4 = wnVar.B5;
                if (mnVar4 != null) {
                    mnVar4.f = false;
                    MessagePreviewParams messagePreviewParams2 = wnVar.v5;
                    mnVar4.b = messagePreviewParams2.quoteStart;
                    mnVar4.c = messagePreviewParams2.quoteEnd;
                    mnVar4.f();
                    if (wnVar.Ob == 2) {
                        wnVar.Sb(wnVar.D5, wnVar.B5);
                    }
                } else {
                    ArrayList<MessageObject> arrayList = new ArrayList<>();
                    MessagePreviewParams.Messages messages = wnVar.v5.forwardMessages;
                    if (messages != null) {
                        messages.getSelectedMessages(arrayList);
                    }
                    wnVar.s8();
                }
            }
            if (wnVar.Eb && z10) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.dl(elVar, 1), 50L);
                wnVar.Eb = false;
            }
            Activity parentActivity = wnVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.r2) wnVar).classGuid;
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
