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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public abstract class nc0 extends FrameLayout {
    public final ArrayList E;
    public final jc0 F;
    public final ch.b G;
    public TLRPC.Peer a;
    public final boolean b;
    public final org.telegram.ui.un c;
    public final MessagePreviewParams d;
    public final lc0 e;
    public final ob0 f;
    public ValueAnimator h;
    public final TLRPC.User n;
    public final TLRPC.Chat r;
    public boolean s;
    public boolean v;
    public final int w;
    public boolean x;
    public final m.g3 y;

    public nc0(Context context, org.telegram.ui.un unVar, ch.b bVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i10, jc0 jc0Var, int i11, final boolean z10) {
        super(context);
        this.y = new m.g3(this, 21);
        this.E = new ArrayList(10);
        this.b = z10;
        this.c = unVar;
        this.w = i10;
        this.G = bVar;
        this.n = user;
        this.r = chat;
        this.d = messagePreviewParams;
        this.F = jc0Var;
        this.f = new ob0(this, context, jc0Var);
        lc0 lc0Var = new lc0(context, jc0Var);
        this.e = lc0Var;
        eh.d c10 = bVar.c(lc0Var, null, false);
        c10.v(gh.c.k(jc0Var));
        c10.x.e = true;
        c10.w(AndroidUtilities.dp(8.0f));
        c10.x(AndroidUtilities.dp(16.0f));
        lc0Var.setBackground(c10);
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
        this.f.setAdapter(new pb0(this, context));
        this.f.setPosition(i12);
        this.e.setSelectedTab(i12);
        addView(this.e, gb1.i(-1, 66, 87));
        addView(this.f, gb1.h(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 66.0f));
        this.e.setOnTabClick(new b3(this, 6));
        setOnTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Components.nb0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                nc0 nc0Var = nc0.this;
                nc0Var.getClass();
                if (motionEvent.getAction() == 1 && !z10) {
                    nc0Var.a(true);
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
            animate().alpha(0.0f).scaleX(0.95f).scaleY(0.95f).setDuration(250L).setInterpolator(mi.m.V).setListener(new org.telegram.ui.jo(15, this, z10));
            int i11 = 0;
            while (true) {
                View[] viewArr = this.f.e;
                if (i11 >= viewArr.length) {
                    break;
                }
                View view = viewArr[i11];
                if (view instanceof hc0) {
                    hc0 hc0Var = (hc0) view;
                    if (hc0Var.a == 0) {
                        hc0Var.k();
                        break;
                    }
                }
                i11++;
            }
            org.telegram.ui.cl clVar = (org.telegram.ui.cl) this;
            org.telegram.ui.un unVar = clVar.H;
            unVar.Ra = null;
            unVar.k7();
            MessagePreviewParams messagePreviewParams = unVar.r5;
            if (messagePreviewParams != null) {
                if (unVar.x5 == null) {
                    unVar.x5 = messagePreviewParams.quote;
                }
                org.telegram.ui.kn knVar = messagePreviewParams.quote;
                if (knVar == null) {
                    unVar.x5 = null;
                }
                org.telegram.ui.kn knVar2 = unVar.x5;
                if (knVar2 != null && knVar2.m && knVar != null && knVar.m) {
                    boolean z11 = true;
                    if (!knVar.g) {
                        if (!knVar.h) {
                            z11 = true ^ TextUtils.isEmpty(knVar.i);
                        }
                        if (z11) {
                            org.telegram.ui.kn knVar3 = unVar.r5.quote;
                            unVar.x5 = knVar3;
                            knVar3.f = false;
                            if (unVar.Kb == 2) {
                                unVar.Ob(unVar.z5, knVar3);
                            }
                        }
                    }
                }
                org.telegram.ui.kn knVar4 = unVar.x5;
                if (knVar4 != null) {
                    knVar4.f = false;
                    MessagePreviewParams messagePreviewParams2 = unVar.r5;
                    knVar4.b = messagePreviewParams2.quoteStart;
                    knVar4.c = messagePreviewParams2.quoteEnd;
                    knVar4.f();
                    if (unVar.Kb == 2) {
                        unVar.Ob(unVar.z5, unVar.x5);
                    }
                } else {
                    ArrayList<MessageObject> arrayList = new ArrayList<>();
                    MessagePreviewParams.Messages messages = unVar.r5.forwardMessages;
                    if (messages != null) {
                        messages.getSelectedMessages(arrayList);
                    }
                    unVar.q8();
                }
            }
            if (unVar.Ab && z10) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.bl(clVar, 1), 50L);
                unVar.Ab = false;
            }
            Activity parentActivity = unVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.r2) unVar).classGuid;
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
                hc0 hc0Var = (hc0) view;
                if (hc0Var.a == 1) {
                    hc0Var.i();
                }
            }
            i10++;
        }
    }
}
