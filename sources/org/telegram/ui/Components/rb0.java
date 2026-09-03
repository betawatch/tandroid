package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.style.CharacterStyle;
import android.util.LongSparseArray;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatMessageSharedResources;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class rb0 extends FrameLayout {
    public final wb0 B;
    public final FrameLayout C;
    public final wb0 D;
    public final wb0 E;
    public final int F;
    public final ChatMessageSharedResources G;
    public boolean H;
    public int I;
    public int J;
    public boolean K;
    public boolean L;
    public AnimatorSet M;
    public final Rect N;
    public int O;
    public float P;
    public int Q;
    public boolean R;
    public boolean S;
    public int T;
    public int U;
    public boolean V;
    public final /* synthetic */ xb0 W;
    public final int a;
    public final kh.i4 b;
    public final ah.e c;
    public final org.telegram.ui.Cells.x9 d;
    public final ib0 e;
    public final jb0 f;
    public final lb0 h;
    public final qb0 n;
    public MessagePreviewParams.Messages r;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout s;
    public final hb0 v;
    public final hb0 w;
    public final org.telegram.ui.ActionBar.g1 x;
    public final org.telegram.ui.ActionBar.g1 y;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v5, types: [android.view.View, org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout] */
    /* JADX WARN: Type inference failed for: r38v0, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout, java.lang.Object, org.telegram.ui.Components.rb0] */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.view.View, android.view.ViewGroup, kh.i4, org.telegram.ui.Components.qv0] */
    /* JADX WARN: Type inference failed for: r3v6, types: [ng.a] */
    /* JADX WARN: Type inference failed for: r8v19, types: [android.view.ViewGroup] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public rb0(xb0 xb0Var, Context context, int i10) {
        super(r4);
        MessagePreviewParams messagePreviewParams;
        final rb0 rb0Var;
        Context context2;
        boolean z4;
        wb0 wb0Var;
        wb0 wb0Var2;
        MessagePreviewParams.Messages messages;
        int i11;
        LinearLayout linearLayout;
        MessagePreviewParams messagePreviewParams2;
        boolean z10;
        Context context3 = context;
        this.W = xb0Var;
        int i12 = 1;
        this.H = true;
        this.I = -1;
        this.J = -1;
        final int i13 = 0;
        this.K = false;
        this.N = new Rect();
        this.R = false;
        this.V = true;
        this.G = new ChatMessageSharedResources(context3);
        this.a = i10;
        int i14 = 3;
        setOnTouchListener(new sr(this, i14));
        int i15 = 2;
        ?? i4Var = new kh.i4(this, context3, i15);
        this.b = i4Var;
        tb0 tb0Var = xb0Var.C;
        boolean z11 = xb0Var.b;
        MessagePreviewParams messagePreviewParams3 = xb0Var.d;
        Drawable d = ((org.telegram.ui.xn) tb0Var).d();
        if (((org.telegram.ui.xn) tb0Var).f == null) {
            int i16 = org.telegram.ui.ActionBar.j6.a;
        }
        i4Var.V(d);
        i4Var.setOccupyStatusBar(false);
        i4Var.setOutlineProvider(new rl(this, i15));
        i4Var.setClipToOutline(true);
        i4Var.setElevation(AndroidUtilities.dp(4.0f));
        ah.e eVar = new ah.e(context3, 14, tb0Var);
        this.c = eVar;
        eVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.s8, tb0Var));
        ib0 ib0Var = new ib0(this);
        this.e = ib0Var;
        ib0Var.D = new nh.h2(this, i14);
        jb0 jb0Var = new jb0(this, context3, tb0Var);
        this.f = jb0Var;
        lb0 lb0Var = new lb0(this, jb0Var, tb0Var);
        this.h = lb0Var;
        jb0Var.setItemAnimator(lb0Var);
        jb0Var.setOnScrollListener(new mb0(this, i13));
        jb0Var.setOnItemClickListener(new nb0(this));
        qb0 qb0Var = new qb0(this);
        this.n = qb0Var;
        jb0Var.setAdapter(qb0Var);
        jb0Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        eb0 eb0Var = new eb0(this);
        eb0Var.O = new fb0(this);
        jb0Var.setClipToPadding(false);
        jb0Var.setLayoutManager(eb0Var);
        jb0Var.i(new gb0());
        i4Var.addView(jb0Var);
        addView(i4Var, k7.b6.d(-1, 400.0f, 0, 8.0f, 0.0f, 8.0f, 0.0f));
        i4Var.addView(eVar, k7.b6.c(-2.0f, -1));
        ?? actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert2, 1, getContext(), tb0Var);
        this.s = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().setOnForegroundOpenFinished(new db0(this, i12));
        pg.b c3 = xb0Var.D.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, false);
        c3.n(rg.b.k(tb0Var));
        c3.o(AndroidUtilities.dp(8.0f));
        c3.h.e = true;
        c3.p(AndroidUtilities.dp(12.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c3);
        addView(actionBarPopupWindow$ActionBarPopupWindowLayout, k7.b6.c(-2.0f, -2));
        if (i10 != 0 || (messages = messagePreviewParams3.replyMessage) == null) {
            messagePreviewParams = messagePreviewParams3;
            if (i10 != 1 || messagePreviewParams.forwardMessages == null) {
                rb0Var = this;
                if (i10 == 2 && messagePreviewParams.linkMessage != null) {
                    wb0 wb0Var3 = new wb0(context, R.raw.position_below, LocaleController.getString(R.string.LinkAbove), R.raw.position_above, LocaleController.getString(R.string.LinkBelow), xb0Var.C);
                    rb0Var.B = wb0Var3;
                    wb0Var3.a(!messagePreviewParams.webpageTop, false);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(wb0Var3, k7.b6.n(-1, 48));
                    FrameLayout frameLayout = new FrameLayout(context);
                    rb0Var.C = frameLayout;
                    frameLayout.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.I5, tb0Var), 0, 0));
                    wb0 wb0Var4 = new wb0(context, R.raw.media_shrink, LocaleController.getString(R.string.LinkMediaLarger), R.raw.media_enlarge, LocaleController.getString(R.string.LinkMediaSmaller), xb0Var.C);
                    rb0Var.D = wb0Var4;
                    wb0Var4.setBackground(null);
                    wb0Var4.setVisibility(messagePreviewParams.isVideo ? 4 : 0);
                    frameLayout.addView(wb0Var4, k7.b6.n(-1, 48));
                    wb0 wb0Var5 = new wb0(context, R.raw.media_shrink, LocaleController.getString(R.string.LinkVideoLarger), R.raw.media_enlarge, LocaleController.getString(R.string.LinkVideoSmaller), xb0Var.C);
                    rb0Var.E = wb0Var5;
                    wb0Var5.setBackground(null);
                    wb0Var5.setVisibility(!messagePreviewParams.isVideo ? 4 : 0);
                    frameLayout.setAlpha(messagePreviewParams.hasMedia ? 1.0f : 0.5f);
                    frameLayout.addView(wb0Var5, k7.b6.n(-1, 48));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, k7.b6.n(-1, 48));
                    frameLayout.setVisibility((!messagePreviewParams.singleLink || messagePreviewParams.hasMedia) ? 0 : 8);
                    wb0Var4.a(messagePreviewParams.webpageSmall, false);
                    wb0Var5.a(messagePreviewParams.webpageSmall, false);
                    org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(context, tb0Var);
                    m1Var.setColor(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, tb0Var)));
                    m1Var.setTag(R.id.fit_width_tag, 1);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(m1Var, k7.b6.n(-1, 8));
                    org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(1, context, xb0Var.C, false, false);
                    g1Var.g(LocaleController.getString(R.string.ApplyChanges), R.drawable.msg_select, null);
                    final int i17 = 10;
                    g1Var.setOnClickListener(new View.OnClickListener(rb0Var) { // from class: org.telegram.ui.Components.ab0
                        public final /* synthetic */ rb0 b;

                        {
                            this.b = rb0Var;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i18;
                            TLRPC.Message message;
                            TLRPC.MessageMedia messageMedia;
                            TLRPC.Message message2;
                            TLRPC.MessageMedia messageMedia2;
                            TLRPC.Message message3;
                            TLRPC.Message message4;
                            switch (i17) {
                                case 0:
                                    rb0 rb0Var2 = this.b;
                                    rb0Var2.W.d.quote = null;
                                    rb0Var2.e.f(false);
                                    rb0Var2.g(false, false);
                                    rb0Var2.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    rb0 rb0Var3 = this.b;
                                    ib0 ib0Var2 = rb0Var3.e;
                                    xb0 xb0Var2 = rb0Var3.W;
                                    if (rb0Var3.c(null) != null) {
                                        if (ib0Var2.v - ib0Var2.u <= MessagesController.getInstance(xb0Var2.w).quoteLengthMax) {
                                            org.telegram.ui.Cells.t9 t9Var = ib0Var2.W;
                                            MessageObject c10 = rb0Var3.c(t9Var != null ? ((org.telegram.ui.Cells.s1) t9Var).getMessageObject() : null);
                                            MessagePreviewParams messagePreviewParams4 = xb0Var2.d;
                                            int i19 = ib0Var2.u;
                                            messagePreviewParams4.quoteStart = i19;
                                            int i20 = ib0Var2.v;
                                            messagePreviewParams4.quoteEnd = i20;
                                            messagePreviewParams4.quote = org.telegram.ui.pn.b(i19, i20, c10);
                                            xb0Var2.b();
                                            xb0Var2.a(true);
                                            break;
                                        } else {
                                            rb0Var3.f();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    rb0 rb0Var4 = this.b;
                                    ib0 ib0Var3 = rb0Var4.e;
                                    xb0 xb0Var3 = rb0Var4.W;
                                    MessagePreviewParams messagePreviewParams5 = xb0Var3.d;
                                    int i21 = xb0Var3.w;
                                    boolean z12 = xb0Var3.b;
                                    if (messagePreviewParams5.quote != null && !z12) {
                                        messagePreviewParams5.quote = null;
                                        ib0Var3.f(false);
                                        rb0Var4.g(false, true);
                                        rb0Var4.k(true);
                                        break;
                                    } else if (ib0Var3.v - ib0Var3.u <= MessagesController.getInstance(i21).quoteLengthMax) {
                                        MessageObject c11 = rb0Var4.c(null);
                                        if (c11 != null) {
                                            if (!ib0Var3.y()) {
                                                messagePreviewParams5.quoteStart = 0;
                                                int min = Math.min(MessagesController.getInstance(i21).quoteLengthMax, c11.messageOwner.message.length());
                                                messagePreviewParams5.quoteEnd = min;
                                                messagePreviewParams5.quote = org.telegram.ui.pn.b(messagePreviewParams5.quoteStart, min, c11);
                                                View d10 = rb0Var4.d();
                                                if (d10 instanceof org.telegram.ui.Cells.s1) {
                                                    ib0Var3.a0((org.telegram.ui.Cells.s1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                }
                                                if (!z12) {
                                                    rb0Var4.s.getSwipeBack().e(rb0Var4.F);
                                                }
                                                rb0Var4.g(true, true);
                                                break;
                                            } else {
                                                messagePreviewParams5.quoteStart = ib0Var3.u;
                                                messagePreviewParams5.quoteEnd = ib0Var3.v;
                                                org.telegram.ui.Cells.t9 t9Var2 = ib0Var3.W;
                                                messagePreviewParams5.quote = org.telegram.ui.pn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, rb0Var4.c(t9Var2 != null ? ((org.telegram.ui.Cells.s1) t9Var2).getMessageObject() : null));
                                                xb0Var3.b();
                                                xb0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        rb0Var4.f();
                                        break;
                                    }
                                    break;
                                case 3:
                                    this.b.W.c(false);
                                    break;
                                case 4:
                                    this.b.W.c(false);
                                    break;
                                case 5:
                                    this.b.W.a(true);
                                    break;
                                case 6:
                                    xb0 xb0Var4 = this.b.W;
                                    if (!xb0Var4.b) {
                                        org.telegram.ui.hl hlVar = (org.telegram.ui.hl) xb0Var4;
                                        hlVar.a(true);
                                        org.telegram.ui.zn znVar = hlVar.E;
                                        znVar.k5 = null;
                                        znVar.i5 = null;
                                        znVar.c5.updateReply(null, null, znVar.Q5, null);
                                        znVar.j8();
                                        break;
                                    } else {
                                        org.telegram.ui.hl hlVar2 = (org.telegram.ui.hl) xb0Var4;
                                        hlVar2.a(true);
                                        org.telegram.ui.zn znVar2 = hlVar2.E;
                                        znVar2.i5 = null;
                                        znVar2.Bb(znVar2.k5);
                                        break;
                                    }
                                case 7:
                                    this.b.W.c(true);
                                    break;
                                case 8:
                                    this.b.W.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.hl hlVar3 = (org.telegram.ui.hl) this.b.W;
                                    hlVar3.a(true);
                                    org.telegram.ui.zn znVar3 = hlVar3.E;
                                    znVar3.c5.updateForward(null, znVar3.Q5);
                                    znVar3.j8();
                                    break;
                                case 10:
                                    this.b.W.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.hl hlVar4 = (org.telegram.ui.hl) this.b.W;
                                    hlVar4.a(true);
                                    org.telegram.ui.zn znVar4 = hlVar4.E;
                                    znVar4.D5 = null;
                                    org.telegram.ui.lk lkVar = znVar4.V;
                                    if (lkVar != null) {
                                        lkVar.T2 = null;
                                        lkVar.U2 = false;
                                    }
                                    MessagePreviewParams messagePreviewParams6 = znVar4.c5;
                                    if (messagePreviewParams6 != null) {
                                        i18 = ((org.telegram.ui.ActionBar.p2) znVar4).currentAccount;
                                        MessageObject messageObject = znVar4.k5;
                                        messagePreviewParams6.updateLink(i18, null, null, messageObject == znVar4.U3 ? null : messageObject, znVar4.i5, znVar4.m5);
                                    }
                                    znVar4.j8();
                                    break;
                                case 12:
                                    rb0 rb0Var5 = this.b;
                                    MessagePreviewParams messagePreviewParams7 = rb0Var5.W.d;
                                    if (messagePreviewParams7.hasMedia) {
                                        boolean z13 = !messagePreviewParams7.webpageSmall;
                                        messagePreviewParams7.webpageSmall = z13;
                                        rb0Var5.D.a(z13, true);
                                        rb0Var5.E.a(messagePreviewParams7.webpageSmall, true);
                                        if (rb0Var5.r.messages.size() > 0 && (message2 = rb0Var5.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z14 = messagePreviewParams7.webpageSmall;
                                            messageMedia2.force_small_media = z14;
                                            messageMedia2.force_large_media = !z14;
                                        }
                                        if (rb0Var5.r.previewMessages.size() > 0 && (message = rb0Var5.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                            boolean z15 = messagePreviewParams7.webpageSmall;
                                            messageMedia.force_small_media = z15;
                                            messageMedia.force_large_media = !z15;
                                        }
                                        rb0Var5.h();
                                        rb0Var5.R = true;
                                        break;
                                    }
                                    break;
                                default:
                                    rb0 rb0Var6 = this.b;
                                    MessagePreviewParams messagePreviewParams8 = rb0Var6.W.d;
                                    boolean z16 = messagePreviewParams8.webpageTop;
                                    messagePreviewParams8.webpageTop = !z16;
                                    rb0Var6.B.a(z16, true);
                                    if (rb0Var6.r.messages.size() > 0 && (message4 = rb0Var6.r.messages.get(0).messageOwner) != null) {
                                        message4.invert_media = messagePreviewParams8.webpageTop;
                                    }
                                    if (rb0Var6.r.previewMessages.size() > 0 && (message3 = rb0Var6.r.previewMessages.get(0).messageOwner) != null) {
                                        message3.invert_media = messagePreviewParams8.webpageTop;
                                    }
                                    rb0Var6.h();
                                    rb0Var6.R = true;
                                    break;
                            }
                        }
                    });
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var, k7.b6.n(-1, 48));
                    org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(1, context, xb0Var.C, false, true);
                    context2 = context;
                    g1Var2.g(LocaleController.getString(R.string.DoNotLinkPreview), R.drawable.msg_delete, null);
                    int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q7, tb0Var);
                    int i18 = org.telegram.ui.ActionBar.j6.p7;
                    g1Var2.c(v02, org.telegram.ui.ActionBar.j6.v0(i18, tb0Var));
                    final int i19 = 11;
                    g1Var2.setOnClickListener(new View.OnClickListener(rb0Var) { // from class: org.telegram.ui.Components.ab0
                        public final /* synthetic */ rb0 b;

                        {
                            this.b = rb0Var;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i182;
                            TLRPC.Message message;
                            TLRPC.MessageMedia messageMedia;
                            TLRPC.Message message2;
                            TLRPC.MessageMedia messageMedia2;
                            TLRPC.Message message3;
                            TLRPC.Message message4;
                            switch (i19) {
                                case 0:
                                    rb0 rb0Var2 = this.b;
                                    rb0Var2.W.d.quote = null;
                                    rb0Var2.e.f(false);
                                    rb0Var2.g(false, false);
                                    rb0Var2.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    rb0 rb0Var3 = this.b;
                                    ib0 ib0Var2 = rb0Var3.e;
                                    xb0 xb0Var2 = rb0Var3.W;
                                    if (rb0Var3.c(null) != null) {
                                        if (ib0Var2.v - ib0Var2.u <= MessagesController.getInstance(xb0Var2.w).quoteLengthMax) {
                                            org.telegram.ui.Cells.t9 t9Var = ib0Var2.W;
                                            MessageObject c10 = rb0Var3.c(t9Var != null ? ((org.telegram.ui.Cells.s1) t9Var).getMessageObject() : null);
                                            MessagePreviewParams messagePreviewParams4 = xb0Var2.d;
                                            int i192 = ib0Var2.u;
                                            messagePreviewParams4.quoteStart = i192;
                                            int i20 = ib0Var2.v;
                                            messagePreviewParams4.quoteEnd = i20;
                                            messagePreviewParams4.quote = org.telegram.ui.pn.b(i192, i20, c10);
                                            xb0Var2.b();
                                            xb0Var2.a(true);
                                            break;
                                        } else {
                                            rb0Var3.f();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    rb0 rb0Var4 = this.b;
                                    ib0 ib0Var3 = rb0Var4.e;
                                    xb0 xb0Var3 = rb0Var4.W;
                                    MessagePreviewParams messagePreviewParams5 = xb0Var3.d;
                                    int i21 = xb0Var3.w;
                                    boolean z12 = xb0Var3.b;
                                    if (messagePreviewParams5.quote != null && !z12) {
                                        messagePreviewParams5.quote = null;
                                        ib0Var3.f(false);
                                        rb0Var4.g(false, true);
                                        rb0Var4.k(true);
                                        break;
                                    } else if (ib0Var3.v - ib0Var3.u <= MessagesController.getInstance(i21).quoteLengthMax) {
                                        MessageObject c11 = rb0Var4.c(null);
                                        if (c11 != null) {
                                            if (!ib0Var3.y()) {
                                                messagePreviewParams5.quoteStart = 0;
                                                int min = Math.min(MessagesController.getInstance(i21).quoteLengthMax, c11.messageOwner.message.length());
                                                messagePreviewParams5.quoteEnd = min;
                                                messagePreviewParams5.quote = org.telegram.ui.pn.b(messagePreviewParams5.quoteStart, min, c11);
                                                View d10 = rb0Var4.d();
                                                if (d10 instanceof org.telegram.ui.Cells.s1) {
                                                    ib0Var3.a0((org.telegram.ui.Cells.s1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                }
                                                if (!z12) {
                                                    rb0Var4.s.getSwipeBack().e(rb0Var4.F);
                                                }
                                                rb0Var4.g(true, true);
                                                break;
                                            } else {
                                                messagePreviewParams5.quoteStart = ib0Var3.u;
                                                messagePreviewParams5.quoteEnd = ib0Var3.v;
                                                org.telegram.ui.Cells.t9 t9Var2 = ib0Var3.W;
                                                messagePreviewParams5.quote = org.telegram.ui.pn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, rb0Var4.c(t9Var2 != null ? ((org.telegram.ui.Cells.s1) t9Var2).getMessageObject() : null));
                                                xb0Var3.b();
                                                xb0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        rb0Var4.f();
                                        break;
                                    }
                                    break;
                                case 3:
                                    this.b.W.c(false);
                                    break;
                                case 4:
                                    this.b.W.c(false);
                                    break;
                                case 5:
                                    this.b.W.a(true);
                                    break;
                                case 6:
                                    xb0 xb0Var4 = this.b.W;
                                    if (!xb0Var4.b) {
                                        org.telegram.ui.hl hlVar = (org.telegram.ui.hl) xb0Var4;
                                        hlVar.a(true);
                                        org.telegram.ui.zn znVar = hlVar.E;
                                        znVar.k5 = null;
                                        znVar.i5 = null;
                                        znVar.c5.updateReply(null, null, znVar.Q5, null);
                                        znVar.j8();
                                        break;
                                    } else {
                                        org.telegram.ui.hl hlVar2 = (org.telegram.ui.hl) xb0Var4;
                                        hlVar2.a(true);
                                        org.telegram.ui.zn znVar2 = hlVar2.E;
                                        znVar2.i5 = null;
                                        znVar2.Bb(znVar2.k5);
                                        break;
                                    }
                                case 7:
                                    this.b.W.c(true);
                                    break;
                                case 8:
                                    this.b.W.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.hl hlVar3 = (org.telegram.ui.hl) this.b.W;
                                    hlVar3.a(true);
                                    org.telegram.ui.zn znVar3 = hlVar3.E;
                                    znVar3.c5.updateForward(null, znVar3.Q5);
                                    znVar3.j8();
                                    break;
                                case 10:
                                    this.b.W.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.hl hlVar4 = (org.telegram.ui.hl) this.b.W;
                                    hlVar4.a(true);
                                    org.telegram.ui.zn znVar4 = hlVar4.E;
                                    znVar4.D5 = null;
                                    org.telegram.ui.lk lkVar = znVar4.V;
                                    if (lkVar != null) {
                                        lkVar.T2 = null;
                                        lkVar.U2 = false;
                                    }
                                    MessagePreviewParams messagePreviewParams6 = znVar4.c5;
                                    if (messagePreviewParams6 != null) {
                                        i182 = ((org.telegram.ui.ActionBar.p2) znVar4).currentAccount;
                                        MessageObject messageObject = znVar4.k5;
                                        messagePreviewParams6.updateLink(i182, null, null, messageObject == znVar4.U3 ? null : messageObject, znVar4.i5, znVar4.m5);
                                    }
                                    znVar4.j8();
                                    break;
                                case 12:
                                    rb0 rb0Var5 = this.b;
                                    MessagePreviewParams messagePreviewParams7 = rb0Var5.W.d;
                                    if (messagePreviewParams7.hasMedia) {
                                        boolean z13 = !messagePreviewParams7.webpageSmall;
                                        messagePreviewParams7.webpageSmall = z13;
                                        rb0Var5.D.a(z13, true);
                                        rb0Var5.E.a(messagePreviewParams7.webpageSmall, true);
                                        if (rb0Var5.r.messages.size() > 0 && (message2 = rb0Var5.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z14 = messagePreviewParams7.webpageSmall;
                                            messageMedia2.force_small_media = z14;
                                            messageMedia2.force_large_media = !z14;
                                        }
                                        if (rb0Var5.r.previewMessages.size() > 0 && (message = rb0Var5.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                            boolean z15 = messagePreviewParams7.webpageSmall;
                                            messageMedia.force_small_media = z15;
                                            messageMedia.force_large_media = !z15;
                                        }
                                        rb0Var5.h();
                                        rb0Var5.R = true;
                                        break;
                                    }
                                    break;
                                default:
                                    rb0 rb0Var6 = this.b;
                                    MessagePreviewParams messagePreviewParams8 = rb0Var6.W.d;
                                    boolean z16 = messagePreviewParams8.webpageTop;
                                    messagePreviewParams8.webpageTop = !z16;
                                    rb0Var6.B.a(z16, true);
                                    if (rb0Var6.r.messages.size() > 0 && (message4 = rb0Var6.r.messages.get(0).messageOwner) != null) {
                                        message4.invert_media = messagePreviewParams8.webpageTop;
                                    }
                                    if (rb0Var6.r.previewMessages.size() > 0 && (message3 = rb0Var6.r.previewMessages.get(0).messageOwner) != null) {
                                        message3.invert_media = messagePreviewParams8.webpageTop;
                                    }
                                    rb0Var6.h();
                                    rb0Var6.R = true;
                                    break;
                            }
                        }
                    });
                    g1Var2.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.w0(null, i18, false)));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var2, k7.b6.n(-1, 48));
                    final int i20 = 12;
                    frameLayout.setOnClickListener(new View.OnClickListener(rb0Var) { // from class: org.telegram.ui.Components.ab0
                        public final /* synthetic */ rb0 b;

                        {
                            this.b = rb0Var;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i182;
                            TLRPC.Message message;
                            TLRPC.MessageMedia messageMedia;
                            TLRPC.Message message2;
                            TLRPC.MessageMedia messageMedia2;
                            TLRPC.Message message3;
                            TLRPC.Message message4;
                            switch (i20) {
                                case 0:
                                    rb0 rb0Var2 = this.b;
                                    rb0Var2.W.d.quote = null;
                                    rb0Var2.e.f(false);
                                    rb0Var2.g(false, false);
                                    rb0Var2.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    rb0 rb0Var3 = this.b;
                                    ib0 ib0Var2 = rb0Var3.e;
                                    xb0 xb0Var2 = rb0Var3.W;
                                    if (rb0Var3.c(null) != null) {
                                        if (ib0Var2.v - ib0Var2.u <= MessagesController.getInstance(xb0Var2.w).quoteLengthMax) {
                                            org.telegram.ui.Cells.t9 t9Var = ib0Var2.W;
                                            MessageObject c10 = rb0Var3.c(t9Var != null ? ((org.telegram.ui.Cells.s1) t9Var).getMessageObject() : null);
                                            MessagePreviewParams messagePreviewParams4 = xb0Var2.d;
                                            int i192 = ib0Var2.u;
                                            messagePreviewParams4.quoteStart = i192;
                                            int i202 = ib0Var2.v;
                                            messagePreviewParams4.quoteEnd = i202;
                                            messagePreviewParams4.quote = org.telegram.ui.pn.b(i192, i202, c10);
                                            xb0Var2.b();
                                            xb0Var2.a(true);
                                            break;
                                        } else {
                                            rb0Var3.f();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    rb0 rb0Var4 = this.b;
                                    ib0 ib0Var3 = rb0Var4.e;
                                    xb0 xb0Var3 = rb0Var4.W;
                                    MessagePreviewParams messagePreviewParams5 = xb0Var3.d;
                                    int i21 = xb0Var3.w;
                                    boolean z12 = xb0Var3.b;
                                    if (messagePreviewParams5.quote != null && !z12) {
                                        messagePreviewParams5.quote = null;
                                        ib0Var3.f(false);
                                        rb0Var4.g(false, true);
                                        rb0Var4.k(true);
                                        break;
                                    } else if (ib0Var3.v - ib0Var3.u <= MessagesController.getInstance(i21).quoteLengthMax) {
                                        MessageObject c11 = rb0Var4.c(null);
                                        if (c11 != null) {
                                            if (!ib0Var3.y()) {
                                                messagePreviewParams5.quoteStart = 0;
                                                int min = Math.min(MessagesController.getInstance(i21).quoteLengthMax, c11.messageOwner.message.length());
                                                messagePreviewParams5.quoteEnd = min;
                                                messagePreviewParams5.quote = org.telegram.ui.pn.b(messagePreviewParams5.quoteStart, min, c11);
                                                View d10 = rb0Var4.d();
                                                if (d10 instanceof org.telegram.ui.Cells.s1) {
                                                    ib0Var3.a0((org.telegram.ui.Cells.s1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                }
                                                if (!z12) {
                                                    rb0Var4.s.getSwipeBack().e(rb0Var4.F);
                                                }
                                                rb0Var4.g(true, true);
                                                break;
                                            } else {
                                                messagePreviewParams5.quoteStart = ib0Var3.u;
                                                messagePreviewParams5.quoteEnd = ib0Var3.v;
                                                org.telegram.ui.Cells.t9 t9Var2 = ib0Var3.W;
                                                messagePreviewParams5.quote = org.telegram.ui.pn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, rb0Var4.c(t9Var2 != null ? ((org.telegram.ui.Cells.s1) t9Var2).getMessageObject() : null));
                                                xb0Var3.b();
                                                xb0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        rb0Var4.f();
                                        break;
                                    }
                                    break;
                                case 3:
                                    this.b.W.c(false);
                                    break;
                                case 4:
                                    this.b.W.c(false);
                                    break;
                                case 5:
                                    this.b.W.a(true);
                                    break;
                                case 6:
                                    xb0 xb0Var4 = this.b.W;
                                    if (!xb0Var4.b) {
                                        org.telegram.ui.hl hlVar = (org.telegram.ui.hl) xb0Var4;
                                        hlVar.a(true);
                                        org.telegram.ui.zn znVar = hlVar.E;
                                        znVar.k5 = null;
                                        znVar.i5 = null;
                                        znVar.c5.updateReply(null, null, znVar.Q5, null);
                                        znVar.j8();
                                        break;
                                    } else {
                                        org.telegram.ui.hl hlVar2 = (org.telegram.ui.hl) xb0Var4;
                                        hlVar2.a(true);
                                        org.telegram.ui.zn znVar2 = hlVar2.E;
                                        znVar2.i5 = null;
                                        znVar2.Bb(znVar2.k5);
                                        break;
                                    }
                                case 7:
                                    this.b.W.c(true);
                                    break;
                                case 8:
                                    this.b.W.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.hl hlVar3 = (org.telegram.ui.hl) this.b.W;
                                    hlVar3.a(true);
                                    org.telegram.ui.zn znVar3 = hlVar3.E;
                                    znVar3.c5.updateForward(null, znVar3.Q5);
                                    znVar3.j8();
                                    break;
                                case 10:
                                    this.b.W.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.hl hlVar4 = (org.telegram.ui.hl) this.b.W;
                                    hlVar4.a(true);
                                    org.telegram.ui.zn znVar4 = hlVar4.E;
                                    znVar4.D5 = null;
                                    org.telegram.ui.lk lkVar = znVar4.V;
                                    if (lkVar != null) {
                                        lkVar.T2 = null;
                                        lkVar.U2 = false;
                                    }
                                    MessagePreviewParams messagePreviewParams6 = znVar4.c5;
                                    if (messagePreviewParams6 != null) {
                                        i182 = ((org.telegram.ui.ActionBar.p2) znVar4).currentAccount;
                                        MessageObject messageObject = znVar4.k5;
                                        messagePreviewParams6.updateLink(i182, null, null, messageObject == znVar4.U3 ? null : messageObject, znVar4.i5, znVar4.m5);
                                    }
                                    znVar4.j8();
                                    break;
                                case 12:
                                    rb0 rb0Var5 = this.b;
                                    MessagePreviewParams messagePreviewParams7 = rb0Var5.W.d;
                                    if (messagePreviewParams7.hasMedia) {
                                        boolean z13 = !messagePreviewParams7.webpageSmall;
                                        messagePreviewParams7.webpageSmall = z13;
                                        rb0Var5.D.a(z13, true);
                                        rb0Var5.E.a(messagePreviewParams7.webpageSmall, true);
                                        if (rb0Var5.r.messages.size() > 0 && (message2 = rb0Var5.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z14 = messagePreviewParams7.webpageSmall;
                                            messageMedia2.force_small_media = z14;
                                            messageMedia2.force_large_media = !z14;
                                        }
                                        if (rb0Var5.r.previewMessages.size() > 0 && (message = rb0Var5.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                            boolean z15 = messagePreviewParams7.webpageSmall;
                                            messageMedia.force_small_media = z15;
                                            messageMedia.force_large_media = !z15;
                                        }
                                        rb0Var5.h();
                                        rb0Var5.R = true;
                                        break;
                                    }
                                    break;
                                default:
                                    rb0 rb0Var6 = this.b;
                                    MessagePreviewParams messagePreviewParams8 = rb0Var6.W.d;
                                    boolean z16 = messagePreviewParams8.webpageTop;
                                    messagePreviewParams8.webpageTop = !z16;
                                    rb0Var6.B.a(z16, true);
                                    if (rb0Var6.r.messages.size() > 0 && (message4 = rb0Var6.r.messages.get(0).messageOwner) != null) {
                                        message4.invert_media = messagePreviewParams8.webpageTop;
                                    }
                                    if (rb0Var6.r.previewMessages.size() > 0 && (message3 = rb0Var6.r.previewMessages.get(0).messageOwner) != null) {
                                        message3.invert_media = messagePreviewParams8.webpageTop;
                                    }
                                    rb0Var6.h();
                                    rb0Var6.R = true;
                                    break;
                            }
                        }
                    });
                    final int i21 = 13;
                    wb0Var3.setOnClickListener(new View.OnClickListener(rb0Var) { // from class: org.telegram.ui.Components.ab0
                        public final /* synthetic */ rb0 b;

                        {
                            this.b = rb0Var;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i182;
                            TLRPC.Message message;
                            TLRPC.MessageMedia messageMedia;
                            TLRPC.Message message2;
                            TLRPC.MessageMedia messageMedia2;
                            TLRPC.Message message3;
                            TLRPC.Message message4;
                            switch (i21) {
                                case 0:
                                    rb0 rb0Var2 = this.b;
                                    rb0Var2.W.d.quote = null;
                                    rb0Var2.e.f(false);
                                    rb0Var2.g(false, false);
                                    rb0Var2.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    rb0 rb0Var3 = this.b;
                                    ib0 ib0Var2 = rb0Var3.e;
                                    xb0 xb0Var2 = rb0Var3.W;
                                    if (rb0Var3.c(null) != null) {
                                        if (ib0Var2.v - ib0Var2.u <= MessagesController.getInstance(xb0Var2.w).quoteLengthMax) {
                                            org.telegram.ui.Cells.t9 t9Var = ib0Var2.W;
                                            MessageObject c10 = rb0Var3.c(t9Var != null ? ((org.telegram.ui.Cells.s1) t9Var).getMessageObject() : null);
                                            MessagePreviewParams messagePreviewParams4 = xb0Var2.d;
                                            int i192 = ib0Var2.u;
                                            messagePreviewParams4.quoteStart = i192;
                                            int i202 = ib0Var2.v;
                                            messagePreviewParams4.quoteEnd = i202;
                                            messagePreviewParams4.quote = org.telegram.ui.pn.b(i192, i202, c10);
                                            xb0Var2.b();
                                            xb0Var2.a(true);
                                            break;
                                        } else {
                                            rb0Var3.f();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    rb0 rb0Var4 = this.b;
                                    ib0 ib0Var3 = rb0Var4.e;
                                    xb0 xb0Var3 = rb0Var4.W;
                                    MessagePreviewParams messagePreviewParams5 = xb0Var3.d;
                                    int i212 = xb0Var3.w;
                                    boolean z12 = xb0Var3.b;
                                    if (messagePreviewParams5.quote != null && !z12) {
                                        messagePreviewParams5.quote = null;
                                        ib0Var3.f(false);
                                        rb0Var4.g(false, true);
                                        rb0Var4.k(true);
                                        break;
                                    } else if (ib0Var3.v - ib0Var3.u <= MessagesController.getInstance(i212).quoteLengthMax) {
                                        MessageObject c11 = rb0Var4.c(null);
                                        if (c11 != null) {
                                            if (!ib0Var3.y()) {
                                                messagePreviewParams5.quoteStart = 0;
                                                int min = Math.min(MessagesController.getInstance(i212).quoteLengthMax, c11.messageOwner.message.length());
                                                messagePreviewParams5.quoteEnd = min;
                                                messagePreviewParams5.quote = org.telegram.ui.pn.b(messagePreviewParams5.quoteStart, min, c11);
                                                View d10 = rb0Var4.d();
                                                if (d10 instanceof org.telegram.ui.Cells.s1) {
                                                    ib0Var3.a0((org.telegram.ui.Cells.s1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                }
                                                if (!z12) {
                                                    rb0Var4.s.getSwipeBack().e(rb0Var4.F);
                                                }
                                                rb0Var4.g(true, true);
                                                break;
                                            } else {
                                                messagePreviewParams5.quoteStart = ib0Var3.u;
                                                messagePreviewParams5.quoteEnd = ib0Var3.v;
                                                org.telegram.ui.Cells.t9 t9Var2 = ib0Var3.W;
                                                messagePreviewParams5.quote = org.telegram.ui.pn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, rb0Var4.c(t9Var2 != null ? ((org.telegram.ui.Cells.s1) t9Var2).getMessageObject() : null));
                                                xb0Var3.b();
                                                xb0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        rb0Var4.f();
                                        break;
                                    }
                                    break;
                                case 3:
                                    this.b.W.c(false);
                                    break;
                                case 4:
                                    this.b.W.c(false);
                                    break;
                                case 5:
                                    this.b.W.a(true);
                                    break;
                                case 6:
                                    xb0 xb0Var4 = this.b.W;
                                    if (!xb0Var4.b) {
                                        org.telegram.ui.hl hlVar = (org.telegram.ui.hl) xb0Var4;
                                        hlVar.a(true);
                                        org.telegram.ui.zn znVar = hlVar.E;
                                        znVar.k5 = null;
                                        znVar.i5 = null;
                                        znVar.c5.updateReply(null, null, znVar.Q5, null);
                                        znVar.j8();
                                        break;
                                    } else {
                                        org.telegram.ui.hl hlVar2 = (org.telegram.ui.hl) xb0Var4;
                                        hlVar2.a(true);
                                        org.telegram.ui.zn znVar2 = hlVar2.E;
                                        znVar2.i5 = null;
                                        znVar2.Bb(znVar2.k5);
                                        break;
                                    }
                                case 7:
                                    this.b.W.c(true);
                                    break;
                                case 8:
                                    this.b.W.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.hl hlVar3 = (org.telegram.ui.hl) this.b.W;
                                    hlVar3.a(true);
                                    org.telegram.ui.zn znVar3 = hlVar3.E;
                                    znVar3.c5.updateForward(null, znVar3.Q5);
                                    znVar3.j8();
                                    break;
                                case 10:
                                    this.b.W.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.hl hlVar4 = (org.telegram.ui.hl) this.b.W;
                                    hlVar4.a(true);
                                    org.telegram.ui.zn znVar4 = hlVar4.E;
                                    znVar4.D5 = null;
                                    org.telegram.ui.lk lkVar = znVar4.V;
                                    if (lkVar != null) {
                                        lkVar.T2 = null;
                                        lkVar.U2 = false;
                                    }
                                    MessagePreviewParams messagePreviewParams6 = znVar4.c5;
                                    if (messagePreviewParams6 != null) {
                                        i182 = ((org.telegram.ui.ActionBar.p2) znVar4).currentAccount;
                                        MessageObject messageObject = znVar4.k5;
                                        messagePreviewParams6.updateLink(i182, null, null, messageObject == znVar4.U3 ? null : messageObject, znVar4.i5, znVar4.m5);
                                    }
                                    znVar4.j8();
                                    break;
                                case 12:
                                    rb0 rb0Var5 = this.b;
                                    MessagePreviewParams messagePreviewParams7 = rb0Var5.W.d;
                                    if (messagePreviewParams7.hasMedia) {
                                        boolean z13 = !messagePreviewParams7.webpageSmall;
                                        messagePreviewParams7.webpageSmall = z13;
                                        rb0Var5.D.a(z13, true);
                                        rb0Var5.E.a(messagePreviewParams7.webpageSmall, true);
                                        if (rb0Var5.r.messages.size() > 0 && (message2 = rb0Var5.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z14 = messagePreviewParams7.webpageSmall;
                                            messageMedia2.force_small_media = z14;
                                            messageMedia2.force_large_media = !z14;
                                        }
                                        if (rb0Var5.r.previewMessages.size() > 0 && (message = rb0Var5.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                            boolean z15 = messagePreviewParams7.webpageSmall;
                                            messageMedia.force_small_media = z15;
                                            messageMedia.force_large_media = !z15;
                                        }
                                        rb0Var5.h();
                                        rb0Var5.R = true;
                                        break;
                                    }
                                    break;
                                default:
                                    rb0 rb0Var6 = this.b;
                                    MessagePreviewParams messagePreviewParams8 = rb0Var6.W.d;
                                    boolean z16 = messagePreviewParams8.webpageTop;
                                    messagePreviewParams8.webpageTop = !z16;
                                    rb0Var6.B.a(z16, true);
                                    if (rb0Var6.r.messages.size() > 0 && (message4 = rb0Var6.r.messages.get(0).messageOwner) != null) {
                                        message4.invert_media = messagePreviewParams8.webpageTop;
                                    }
                                    if (rb0Var6.r.previewMessages.size() > 0 && (message3 = rb0Var6.r.previewMessages.get(0).messageOwner) != null) {
                                        message3.invert_media = messagePreviewParams8.webpageTop;
                                    }
                                    rb0Var6.h();
                                    rb0Var6.R = true;
                                    break;
                            }
                        }
                    });
                }
            } else {
                if (!UserConfig.getInstance(xb0Var.w).isPremium()) {
                    for (int i22 = 0; i22 < messagePreviewParams.forwardMessages.messages.size(); i22++) {
                        if (messagePreviewParams.forwardMessages.messages.get(i22).type == 36) {
                            z4 = false;
                            break;
                        }
                    }
                }
                z4 = true;
                wb0 wb0Var6 = new wb0(context, R.raw.name_hide, LocaleController.getString(messagePreviewParams.multipleUsers ? R.string.ShowSenderNames : R.string.ShowSendersName), R.raw.name_show, LocaleController.getString(messagePreviewParams.multipleUsers ? R.string.HideSenderNames : R.string.HideSendersName), xb0Var.C);
                this.s.a(wb0Var6, k7.b6.n(-1, 48));
                if (messagePreviewParams.hasCaption) {
                    wb0Var = wb0Var6;
                    wb0 wb0Var7 = new wb0(context, R.raw.caption_hide, LocaleController.getString(R.string.ShowCaption), R.raw.caption_show, LocaleController.getString(R.string.HideCaption), xb0Var.C);
                    wb0Var7.a(messagePreviewParams.hideCaption, false);
                    this.s.a(wb0Var7, k7.b6.n(-1, 48));
                    wb0Var2 = wb0Var7;
                } else {
                    wb0Var = wb0Var6;
                    wb0Var2 = null;
                }
                org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(0, context, xb0Var.C, true, false);
                final int i23 = 7;
                g1Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ab0
                    public final /* synthetic */ rb0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i182;
                        TLRPC.Message message;
                        TLRPC.MessageMedia messageMedia;
                        TLRPC.Message message2;
                        TLRPC.MessageMedia messageMedia2;
                        TLRPC.Message message3;
                        TLRPC.Message message4;
                        switch (i23) {
                            case 0:
                                rb0 rb0Var2 = this.b;
                                rb0Var2.W.d.quote = null;
                                rb0Var2.e.f(false);
                                rb0Var2.g(false, false);
                                rb0Var2.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                rb0 rb0Var3 = this.b;
                                ib0 ib0Var2 = rb0Var3.e;
                                xb0 xb0Var2 = rb0Var3.W;
                                if (rb0Var3.c(null) != null) {
                                    if (ib0Var2.v - ib0Var2.u <= MessagesController.getInstance(xb0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.t9 t9Var = ib0Var2.W;
                                        MessageObject c10 = rb0Var3.c(t9Var != null ? ((org.telegram.ui.Cells.s1) t9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams4 = xb0Var2.d;
                                        int i192 = ib0Var2.u;
                                        messagePreviewParams4.quoteStart = i192;
                                        int i202 = ib0Var2.v;
                                        messagePreviewParams4.quoteEnd = i202;
                                        messagePreviewParams4.quote = org.telegram.ui.pn.b(i192, i202, c10);
                                        xb0Var2.b();
                                        xb0Var2.a(true);
                                        break;
                                    } else {
                                        rb0Var3.f();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                rb0 rb0Var4 = this.b;
                                ib0 ib0Var3 = rb0Var4.e;
                                xb0 xb0Var3 = rb0Var4.W;
                                MessagePreviewParams messagePreviewParams5 = xb0Var3.d;
                                int i212 = xb0Var3.w;
                                boolean z12 = xb0Var3.b;
                                if (messagePreviewParams5.quote != null && !z12) {
                                    messagePreviewParams5.quote = null;
                                    ib0Var3.f(false);
                                    rb0Var4.g(false, true);
                                    rb0Var4.k(true);
                                    break;
                                } else if (ib0Var3.v - ib0Var3.u <= MessagesController.getInstance(i212).quoteLengthMax) {
                                    MessageObject c11 = rb0Var4.c(null);
                                    if (c11 != null) {
                                        if (!ib0Var3.y()) {
                                            messagePreviewParams5.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i212).quoteLengthMax, c11.messageOwner.message.length());
                                            messagePreviewParams5.quoteEnd = min;
                                            messagePreviewParams5.quote = org.telegram.ui.pn.b(messagePreviewParams5.quoteStart, min, c11);
                                            View d10 = rb0Var4.d();
                                            if (d10 instanceof org.telegram.ui.Cells.s1) {
                                                ib0Var3.a0((org.telegram.ui.Cells.s1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            }
                                            if (!z12) {
                                                rb0Var4.s.getSwipeBack().e(rb0Var4.F);
                                            }
                                            rb0Var4.g(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams5.quoteStart = ib0Var3.u;
                                            messagePreviewParams5.quoteEnd = ib0Var3.v;
                                            org.telegram.ui.Cells.t9 t9Var2 = ib0Var3.W;
                                            messagePreviewParams5.quote = org.telegram.ui.pn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, rb0Var4.c(t9Var2 != null ? ((org.telegram.ui.Cells.s1) t9Var2).getMessageObject() : null));
                                            xb0Var3.b();
                                            xb0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    rb0Var4.f();
                                    break;
                                }
                                break;
                            case 3:
                                this.b.W.c(false);
                                break;
                            case 4:
                                this.b.W.c(false);
                                break;
                            case 5:
                                this.b.W.a(true);
                                break;
                            case 6:
                                xb0 xb0Var4 = this.b.W;
                                if (!xb0Var4.b) {
                                    org.telegram.ui.hl hlVar = (org.telegram.ui.hl) xb0Var4;
                                    hlVar.a(true);
                                    org.telegram.ui.zn znVar = hlVar.E;
                                    znVar.k5 = null;
                                    znVar.i5 = null;
                                    znVar.c5.updateReply(null, null, znVar.Q5, null);
                                    znVar.j8();
                                    break;
                                } else {
                                    org.telegram.ui.hl hlVar2 = (org.telegram.ui.hl) xb0Var4;
                                    hlVar2.a(true);
                                    org.telegram.ui.zn znVar2 = hlVar2.E;
                                    znVar2.i5 = null;
                                    znVar2.Bb(znVar2.k5);
                                    break;
                                }
                            case 7:
                                this.b.W.c(true);
                                break;
                            case 8:
                                this.b.W.a(true);
                                break;
                            case 9:
                                org.telegram.ui.hl hlVar3 = (org.telegram.ui.hl) this.b.W;
                                hlVar3.a(true);
                                org.telegram.ui.zn znVar3 = hlVar3.E;
                                znVar3.c5.updateForward(null, znVar3.Q5);
                                znVar3.j8();
                                break;
                            case 10:
                                this.b.W.a(true);
                                break;
                            case 11:
                                org.telegram.ui.hl hlVar4 = (org.telegram.ui.hl) this.b.W;
                                hlVar4.a(true);
                                org.telegram.ui.zn znVar4 = hlVar4.E;
                                znVar4.D5 = null;
                                org.telegram.ui.lk lkVar = znVar4.V;
                                if (lkVar != null) {
                                    lkVar.T2 = null;
                                    lkVar.U2 = false;
                                }
                                MessagePreviewParams messagePreviewParams6 = znVar4.c5;
                                if (messagePreviewParams6 != null) {
                                    i182 = ((org.telegram.ui.ActionBar.p2) znVar4).currentAccount;
                                    MessageObject messageObject = znVar4.k5;
                                    messagePreviewParams6.updateLink(i182, null, null, messageObject == znVar4.U3 ? null : messageObject, znVar4.i5, znVar4.m5);
                                }
                                znVar4.j8();
                                break;
                            case 12:
                                rb0 rb0Var5 = this.b;
                                MessagePreviewParams messagePreviewParams7 = rb0Var5.W.d;
                                if (messagePreviewParams7.hasMedia) {
                                    boolean z13 = !messagePreviewParams7.webpageSmall;
                                    messagePreviewParams7.webpageSmall = z13;
                                    rb0Var5.D.a(z13, true);
                                    rb0Var5.E.a(messagePreviewParams7.webpageSmall, true);
                                    if (rb0Var5.r.messages.size() > 0 && (message2 = rb0Var5.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z14 = messagePreviewParams7.webpageSmall;
                                        messageMedia2.force_small_media = z14;
                                        messageMedia2.force_large_media = !z14;
                                    }
                                    if (rb0Var5.r.previewMessages.size() > 0 && (message = rb0Var5.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z15 = messagePreviewParams7.webpageSmall;
                                        messageMedia.force_small_media = z15;
                                        messageMedia.force_large_media = !z15;
                                    }
                                    rb0Var5.h();
                                    rb0Var5.R = true;
                                    break;
                                }
                                break;
                            default:
                                rb0 rb0Var6 = this.b;
                                MessagePreviewParams messagePreviewParams8 = rb0Var6.W.d;
                                boolean z16 = messagePreviewParams8.webpageTop;
                                messagePreviewParams8.webpageTop = !z16;
                                rb0Var6.B.a(z16, true);
                                if (rb0Var6.r.messages.size() > 0 && (message4 = rb0Var6.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams8.webpageTop;
                                }
                                if (rb0Var6.r.previewMessages.size() > 0 && (message3 = rb0Var6.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams8.webpageTop;
                                }
                                rb0Var6.h();
                                rb0Var6.R = true;
                                break;
                        }
                    }
                });
                g1Var3.g(LocaleController.getString(R.string.ChangeRecipient), R.drawable.msg_forward_replace, null);
                this.s.a(g1Var3, k7.b6.n(-1, 48));
                org.telegram.ui.ActionBar.m1 m1Var2 = new org.telegram.ui.ActionBar.m1(context, tb0Var);
                m1Var2.setColor(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, tb0Var)));
                m1Var2.setTag(R.id.fit_width_tag, 1);
                final int i24 = 8;
                this.s.a(m1Var2, k7.b6.n(-1, 8));
                org.telegram.ui.ActionBar.g1 g1Var4 = new org.telegram.ui.ActionBar.g1(1, context, xb0Var.C, false, false);
                g1Var4.g(LocaleController.getString(R.string.ApplyChanges), R.drawable.msg_select, null);
                g1Var4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ab0
                    public final /* synthetic */ rb0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i182;
                        TLRPC.Message message;
                        TLRPC.MessageMedia messageMedia;
                        TLRPC.Message message2;
                        TLRPC.MessageMedia messageMedia2;
                        TLRPC.Message message3;
                        TLRPC.Message message4;
                        switch (i24) {
                            case 0:
                                rb0 rb0Var2 = this.b;
                                rb0Var2.W.d.quote = null;
                                rb0Var2.e.f(false);
                                rb0Var2.g(false, false);
                                rb0Var2.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                rb0 rb0Var3 = this.b;
                                ib0 ib0Var2 = rb0Var3.e;
                                xb0 xb0Var2 = rb0Var3.W;
                                if (rb0Var3.c(null) != null) {
                                    if (ib0Var2.v - ib0Var2.u <= MessagesController.getInstance(xb0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.t9 t9Var = ib0Var2.W;
                                        MessageObject c10 = rb0Var3.c(t9Var != null ? ((org.telegram.ui.Cells.s1) t9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams4 = xb0Var2.d;
                                        int i192 = ib0Var2.u;
                                        messagePreviewParams4.quoteStart = i192;
                                        int i202 = ib0Var2.v;
                                        messagePreviewParams4.quoteEnd = i202;
                                        messagePreviewParams4.quote = org.telegram.ui.pn.b(i192, i202, c10);
                                        xb0Var2.b();
                                        xb0Var2.a(true);
                                        break;
                                    } else {
                                        rb0Var3.f();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                rb0 rb0Var4 = this.b;
                                ib0 ib0Var3 = rb0Var4.e;
                                xb0 xb0Var3 = rb0Var4.W;
                                MessagePreviewParams messagePreviewParams5 = xb0Var3.d;
                                int i212 = xb0Var3.w;
                                boolean z12 = xb0Var3.b;
                                if (messagePreviewParams5.quote != null && !z12) {
                                    messagePreviewParams5.quote = null;
                                    ib0Var3.f(false);
                                    rb0Var4.g(false, true);
                                    rb0Var4.k(true);
                                    break;
                                } else if (ib0Var3.v - ib0Var3.u <= MessagesController.getInstance(i212).quoteLengthMax) {
                                    MessageObject c11 = rb0Var4.c(null);
                                    if (c11 != null) {
                                        if (!ib0Var3.y()) {
                                            messagePreviewParams5.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i212).quoteLengthMax, c11.messageOwner.message.length());
                                            messagePreviewParams5.quoteEnd = min;
                                            messagePreviewParams5.quote = org.telegram.ui.pn.b(messagePreviewParams5.quoteStart, min, c11);
                                            View d10 = rb0Var4.d();
                                            if (d10 instanceof org.telegram.ui.Cells.s1) {
                                                ib0Var3.a0((org.telegram.ui.Cells.s1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            }
                                            if (!z12) {
                                                rb0Var4.s.getSwipeBack().e(rb0Var4.F);
                                            }
                                            rb0Var4.g(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams5.quoteStart = ib0Var3.u;
                                            messagePreviewParams5.quoteEnd = ib0Var3.v;
                                            org.telegram.ui.Cells.t9 t9Var2 = ib0Var3.W;
                                            messagePreviewParams5.quote = org.telegram.ui.pn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, rb0Var4.c(t9Var2 != null ? ((org.telegram.ui.Cells.s1) t9Var2).getMessageObject() : null));
                                            xb0Var3.b();
                                            xb0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    rb0Var4.f();
                                    break;
                                }
                                break;
                            case 3:
                                this.b.W.c(false);
                                break;
                            case 4:
                                this.b.W.c(false);
                                break;
                            case 5:
                                this.b.W.a(true);
                                break;
                            case 6:
                                xb0 xb0Var4 = this.b.W;
                                if (!xb0Var4.b) {
                                    org.telegram.ui.hl hlVar = (org.telegram.ui.hl) xb0Var4;
                                    hlVar.a(true);
                                    org.telegram.ui.zn znVar = hlVar.E;
                                    znVar.k5 = null;
                                    znVar.i5 = null;
                                    znVar.c5.updateReply(null, null, znVar.Q5, null);
                                    znVar.j8();
                                    break;
                                } else {
                                    org.telegram.ui.hl hlVar2 = (org.telegram.ui.hl) xb0Var4;
                                    hlVar2.a(true);
                                    org.telegram.ui.zn znVar2 = hlVar2.E;
                                    znVar2.i5 = null;
                                    znVar2.Bb(znVar2.k5);
                                    break;
                                }
                            case 7:
                                this.b.W.c(true);
                                break;
                            case 8:
                                this.b.W.a(true);
                                break;
                            case 9:
                                org.telegram.ui.hl hlVar3 = (org.telegram.ui.hl) this.b.W;
                                hlVar3.a(true);
                                org.telegram.ui.zn znVar3 = hlVar3.E;
                                znVar3.c5.updateForward(null, znVar3.Q5);
                                znVar3.j8();
                                break;
                            case 10:
                                this.b.W.a(true);
                                break;
                            case 11:
                                org.telegram.ui.hl hlVar4 = (org.telegram.ui.hl) this.b.W;
                                hlVar4.a(true);
                                org.telegram.ui.zn znVar4 = hlVar4.E;
                                znVar4.D5 = null;
                                org.telegram.ui.lk lkVar = znVar4.V;
                                if (lkVar != null) {
                                    lkVar.T2 = null;
                                    lkVar.U2 = false;
                                }
                                MessagePreviewParams messagePreviewParams6 = znVar4.c5;
                                if (messagePreviewParams6 != null) {
                                    i182 = ((org.telegram.ui.ActionBar.p2) znVar4).currentAccount;
                                    MessageObject messageObject = znVar4.k5;
                                    messagePreviewParams6.updateLink(i182, null, null, messageObject == znVar4.U3 ? null : messageObject, znVar4.i5, znVar4.m5);
                                }
                                znVar4.j8();
                                break;
                            case 12:
                                rb0 rb0Var5 = this.b;
                                MessagePreviewParams messagePreviewParams7 = rb0Var5.W.d;
                                if (messagePreviewParams7.hasMedia) {
                                    boolean z13 = !messagePreviewParams7.webpageSmall;
                                    messagePreviewParams7.webpageSmall = z13;
                                    rb0Var5.D.a(z13, true);
                                    rb0Var5.E.a(messagePreviewParams7.webpageSmall, true);
                                    if (rb0Var5.r.messages.size() > 0 && (message2 = rb0Var5.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z14 = messagePreviewParams7.webpageSmall;
                                        messageMedia2.force_small_media = z14;
                                        messageMedia2.force_large_media = !z14;
                                    }
                                    if (rb0Var5.r.previewMessages.size() > 0 && (message = rb0Var5.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z15 = messagePreviewParams7.webpageSmall;
                                        messageMedia.force_small_media = z15;
                                        messageMedia.force_large_media = !z15;
                                    }
                                    rb0Var5.h();
                                    rb0Var5.R = true;
                                    break;
                                }
                                break;
                            default:
                                rb0 rb0Var6 = this.b;
                                MessagePreviewParams messagePreviewParams8 = rb0Var6.W.d;
                                boolean z16 = messagePreviewParams8.webpageTop;
                                messagePreviewParams8.webpageTop = !z16;
                                rb0Var6.B.a(z16, true);
                                if (rb0Var6.r.messages.size() > 0 && (message4 = rb0Var6.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams8.webpageTop;
                                }
                                if (rb0Var6.r.previewMessages.size() > 0 && (message3 = rb0Var6.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams8.webpageTop;
                                }
                                rb0Var6.h();
                                rb0Var6.R = true;
                                break;
                        }
                    }
                });
                this.s.a(g1Var4, k7.b6.n(-1, 48));
                org.telegram.ui.ActionBar.g1 g1Var5 = new org.telegram.ui.ActionBar.g1(1, context, xb0Var.C, false, true);
                g1Var5.g(LocaleController.getString(R.string.DoNotForward), R.drawable.msg_delete, null);
                int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q7, tb0Var);
                int i25 = org.telegram.ui.ActionBar.j6.p7;
                g1Var5.c(v03, org.telegram.ui.ActionBar.j6.v0(i25, tb0Var));
                final int i26 = 9;
                g1Var5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ab0
                    public final /* synthetic */ rb0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i182;
                        TLRPC.Message message;
                        TLRPC.MessageMedia messageMedia;
                        TLRPC.Message message2;
                        TLRPC.MessageMedia messageMedia2;
                        TLRPC.Message message3;
                        TLRPC.Message message4;
                        switch (i26) {
                            case 0:
                                rb0 rb0Var2 = this.b;
                                rb0Var2.W.d.quote = null;
                                rb0Var2.e.f(false);
                                rb0Var2.g(false, false);
                                rb0Var2.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                rb0 rb0Var3 = this.b;
                                ib0 ib0Var2 = rb0Var3.e;
                                xb0 xb0Var2 = rb0Var3.W;
                                if (rb0Var3.c(null) != null) {
                                    if (ib0Var2.v - ib0Var2.u <= MessagesController.getInstance(xb0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.t9 t9Var = ib0Var2.W;
                                        MessageObject c10 = rb0Var3.c(t9Var != null ? ((org.telegram.ui.Cells.s1) t9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams4 = xb0Var2.d;
                                        int i192 = ib0Var2.u;
                                        messagePreviewParams4.quoteStart = i192;
                                        int i202 = ib0Var2.v;
                                        messagePreviewParams4.quoteEnd = i202;
                                        messagePreviewParams4.quote = org.telegram.ui.pn.b(i192, i202, c10);
                                        xb0Var2.b();
                                        xb0Var2.a(true);
                                        break;
                                    } else {
                                        rb0Var3.f();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                rb0 rb0Var4 = this.b;
                                ib0 ib0Var3 = rb0Var4.e;
                                xb0 xb0Var3 = rb0Var4.W;
                                MessagePreviewParams messagePreviewParams5 = xb0Var3.d;
                                int i212 = xb0Var3.w;
                                boolean z12 = xb0Var3.b;
                                if (messagePreviewParams5.quote != null && !z12) {
                                    messagePreviewParams5.quote = null;
                                    ib0Var3.f(false);
                                    rb0Var4.g(false, true);
                                    rb0Var4.k(true);
                                    break;
                                } else if (ib0Var3.v - ib0Var3.u <= MessagesController.getInstance(i212).quoteLengthMax) {
                                    MessageObject c11 = rb0Var4.c(null);
                                    if (c11 != null) {
                                        if (!ib0Var3.y()) {
                                            messagePreviewParams5.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i212).quoteLengthMax, c11.messageOwner.message.length());
                                            messagePreviewParams5.quoteEnd = min;
                                            messagePreviewParams5.quote = org.telegram.ui.pn.b(messagePreviewParams5.quoteStart, min, c11);
                                            View d10 = rb0Var4.d();
                                            if (d10 instanceof org.telegram.ui.Cells.s1) {
                                                ib0Var3.a0((org.telegram.ui.Cells.s1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            }
                                            if (!z12) {
                                                rb0Var4.s.getSwipeBack().e(rb0Var4.F);
                                            }
                                            rb0Var4.g(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams5.quoteStart = ib0Var3.u;
                                            messagePreviewParams5.quoteEnd = ib0Var3.v;
                                            org.telegram.ui.Cells.t9 t9Var2 = ib0Var3.W;
                                            messagePreviewParams5.quote = org.telegram.ui.pn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, rb0Var4.c(t9Var2 != null ? ((org.telegram.ui.Cells.s1) t9Var2).getMessageObject() : null));
                                            xb0Var3.b();
                                            xb0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    rb0Var4.f();
                                    break;
                                }
                                break;
                            case 3:
                                this.b.W.c(false);
                                break;
                            case 4:
                                this.b.W.c(false);
                                break;
                            case 5:
                                this.b.W.a(true);
                                break;
                            case 6:
                                xb0 xb0Var4 = this.b.W;
                                if (!xb0Var4.b) {
                                    org.telegram.ui.hl hlVar = (org.telegram.ui.hl) xb0Var4;
                                    hlVar.a(true);
                                    org.telegram.ui.zn znVar = hlVar.E;
                                    znVar.k5 = null;
                                    znVar.i5 = null;
                                    znVar.c5.updateReply(null, null, znVar.Q5, null);
                                    znVar.j8();
                                    break;
                                } else {
                                    org.telegram.ui.hl hlVar2 = (org.telegram.ui.hl) xb0Var4;
                                    hlVar2.a(true);
                                    org.telegram.ui.zn znVar2 = hlVar2.E;
                                    znVar2.i5 = null;
                                    znVar2.Bb(znVar2.k5);
                                    break;
                                }
                            case 7:
                                this.b.W.c(true);
                                break;
                            case 8:
                                this.b.W.a(true);
                                break;
                            case 9:
                                org.telegram.ui.hl hlVar3 = (org.telegram.ui.hl) this.b.W;
                                hlVar3.a(true);
                                org.telegram.ui.zn znVar3 = hlVar3.E;
                                znVar3.c5.updateForward(null, znVar3.Q5);
                                znVar3.j8();
                                break;
                            case 10:
                                this.b.W.a(true);
                                break;
                            case 11:
                                org.telegram.ui.hl hlVar4 = (org.telegram.ui.hl) this.b.W;
                                hlVar4.a(true);
                                org.telegram.ui.zn znVar4 = hlVar4.E;
                                znVar4.D5 = null;
                                org.telegram.ui.lk lkVar = znVar4.V;
                                if (lkVar != null) {
                                    lkVar.T2 = null;
                                    lkVar.U2 = false;
                                }
                                MessagePreviewParams messagePreviewParams6 = znVar4.c5;
                                if (messagePreviewParams6 != null) {
                                    i182 = ((org.telegram.ui.ActionBar.p2) znVar4).currentAccount;
                                    MessageObject messageObject = znVar4.k5;
                                    messagePreviewParams6.updateLink(i182, null, null, messageObject == znVar4.U3 ? null : messageObject, znVar4.i5, znVar4.m5);
                                }
                                znVar4.j8();
                                break;
                            case 12:
                                rb0 rb0Var5 = this.b;
                                MessagePreviewParams messagePreviewParams7 = rb0Var5.W.d;
                                if (messagePreviewParams7.hasMedia) {
                                    boolean z13 = !messagePreviewParams7.webpageSmall;
                                    messagePreviewParams7.webpageSmall = z13;
                                    rb0Var5.D.a(z13, true);
                                    rb0Var5.E.a(messagePreviewParams7.webpageSmall, true);
                                    if (rb0Var5.r.messages.size() > 0 && (message2 = rb0Var5.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z14 = messagePreviewParams7.webpageSmall;
                                        messageMedia2.force_small_media = z14;
                                        messageMedia2.force_large_media = !z14;
                                    }
                                    if (rb0Var5.r.previewMessages.size() > 0 && (message = rb0Var5.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z15 = messagePreviewParams7.webpageSmall;
                                        messageMedia.force_small_media = z15;
                                        messageMedia.force_large_media = !z15;
                                    }
                                    rb0Var5.h();
                                    rb0Var5.R = true;
                                    break;
                                }
                                break;
                            default:
                                rb0 rb0Var6 = this.b;
                                MessagePreviewParams messagePreviewParams8 = rb0Var6.W.d;
                                boolean z16 = messagePreviewParams8.webpageTop;
                                messagePreviewParams8.webpageTop = !z16;
                                rb0Var6.B.a(z16, true);
                                if (rb0Var6.r.messages.size() > 0 && (message4 = rb0Var6.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams8.webpageTop;
                                }
                                if (rb0Var6.r.previewMessages.size() > 0 && (message3 = rb0Var6.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams8.webpageTop;
                                }
                                rb0Var6.h();
                                rb0Var6.R = true;
                                break;
                        }
                    }
                });
                g1Var5.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.w0(null, i25, false)));
                this.s.a(g1Var5, k7.b6.n(-1, 48));
                wb0 wb0Var8 = wb0Var;
                wb0Var8.a(messagePreviewParams.hideForwardSendersName, false);
                wb0 wb0Var9 = wb0Var2;
                rb0Var = this;
                wb0Var8.setOnClickListener(new kh.x2(this, z4, context, wb0Var9, wb0Var8, 1));
                if (wb0Var9 != null) {
                    wb0Var9.setOnClickListener(new dg.p(rb0Var, wb0Var9, wb0Var8, 27));
                }
            }
            context2 = context;
        } else {
            if (!messages.hasText || messagePreviewParams3.isSecret) {
                messagePreviewParams = messagePreviewParams3;
            } else {
                LinearLayout f10 = org.telegram.messenger.y3.f(context3, 1);
                if (z11) {
                    linearLayout = f10;
                    messagePreviewParams2 = messagePreviewParams3;
                    z10 = true;
                } else {
                    ?? r82 = f10;
                    messagePreviewParams2 = messagePreviewParams3;
                    org.telegram.ui.ActionBar.g1 g1Var6 = new org.telegram.ui.ActionBar.g1(0, context3, xb0Var.C, true, false);
                    g1Var6.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                    g1Var6.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ab0
                        public final /* synthetic */ rb0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i182;
                            TLRPC.Message message;
                            TLRPC.MessageMedia messageMedia;
                            TLRPC.Message message2;
                            TLRPC.MessageMedia messageMedia2;
                            TLRPC.Message message3;
                            TLRPC.Message message4;
                            switch (i13) {
                                case 0:
                                    rb0 rb0Var2 = this.b;
                                    rb0Var2.W.d.quote = null;
                                    rb0Var2.e.f(false);
                                    rb0Var2.g(false, false);
                                    rb0Var2.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    rb0 rb0Var3 = this.b;
                                    ib0 ib0Var2 = rb0Var3.e;
                                    xb0 xb0Var2 = rb0Var3.W;
                                    if (rb0Var3.c(null) != null) {
                                        if (ib0Var2.v - ib0Var2.u <= MessagesController.getInstance(xb0Var2.w).quoteLengthMax) {
                                            org.telegram.ui.Cells.t9 t9Var = ib0Var2.W;
                                            MessageObject c10 = rb0Var3.c(t9Var != null ? ((org.telegram.ui.Cells.s1) t9Var).getMessageObject() : null);
                                            MessagePreviewParams messagePreviewParams4 = xb0Var2.d;
                                            int i192 = ib0Var2.u;
                                            messagePreviewParams4.quoteStart = i192;
                                            int i202 = ib0Var2.v;
                                            messagePreviewParams4.quoteEnd = i202;
                                            messagePreviewParams4.quote = org.telegram.ui.pn.b(i192, i202, c10);
                                            xb0Var2.b();
                                            xb0Var2.a(true);
                                            break;
                                        } else {
                                            rb0Var3.f();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    rb0 rb0Var4 = this.b;
                                    ib0 ib0Var3 = rb0Var4.e;
                                    xb0 xb0Var3 = rb0Var4.W;
                                    MessagePreviewParams messagePreviewParams5 = xb0Var3.d;
                                    int i212 = xb0Var3.w;
                                    boolean z12 = xb0Var3.b;
                                    if (messagePreviewParams5.quote != null && !z12) {
                                        messagePreviewParams5.quote = null;
                                        ib0Var3.f(false);
                                        rb0Var4.g(false, true);
                                        rb0Var4.k(true);
                                        break;
                                    } else if (ib0Var3.v - ib0Var3.u <= MessagesController.getInstance(i212).quoteLengthMax) {
                                        MessageObject c11 = rb0Var4.c(null);
                                        if (c11 != null) {
                                            if (!ib0Var3.y()) {
                                                messagePreviewParams5.quoteStart = 0;
                                                int min = Math.min(MessagesController.getInstance(i212).quoteLengthMax, c11.messageOwner.message.length());
                                                messagePreviewParams5.quoteEnd = min;
                                                messagePreviewParams5.quote = org.telegram.ui.pn.b(messagePreviewParams5.quoteStart, min, c11);
                                                View d10 = rb0Var4.d();
                                                if (d10 instanceof org.telegram.ui.Cells.s1) {
                                                    ib0Var3.a0((org.telegram.ui.Cells.s1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                }
                                                if (!z12) {
                                                    rb0Var4.s.getSwipeBack().e(rb0Var4.F);
                                                }
                                                rb0Var4.g(true, true);
                                                break;
                                            } else {
                                                messagePreviewParams5.quoteStart = ib0Var3.u;
                                                messagePreviewParams5.quoteEnd = ib0Var3.v;
                                                org.telegram.ui.Cells.t9 t9Var2 = ib0Var3.W;
                                                messagePreviewParams5.quote = org.telegram.ui.pn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, rb0Var4.c(t9Var2 != null ? ((org.telegram.ui.Cells.s1) t9Var2).getMessageObject() : null));
                                                xb0Var3.b();
                                                xb0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        rb0Var4.f();
                                        break;
                                    }
                                    break;
                                case 3:
                                    this.b.W.c(false);
                                    break;
                                case 4:
                                    this.b.W.c(false);
                                    break;
                                case 5:
                                    this.b.W.a(true);
                                    break;
                                case 6:
                                    xb0 xb0Var4 = this.b.W;
                                    if (!xb0Var4.b) {
                                        org.telegram.ui.hl hlVar = (org.telegram.ui.hl) xb0Var4;
                                        hlVar.a(true);
                                        org.telegram.ui.zn znVar = hlVar.E;
                                        znVar.k5 = null;
                                        znVar.i5 = null;
                                        znVar.c5.updateReply(null, null, znVar.Q5, null);
                                        znVar.j8();
                                        break;
                                    } else {
                                        org.telegram.ui.hl hlVar2 = (org.telegram.ui.hl) xb0Var4;
                                        hlVar2.a(true);
                                        org.telegram.ui.zn znVar2 = hlVar2.E;
                                        znVar2.i5 = null;
                                        znVar2.Bb(znVar2.k5);
                                        break;
                                    }
                                case 7:
                                    this.b.W.c(true);
                                    break;
                                case 8:
                                    this.b.W.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.hl hlVar3 = (org.telegram.ui.hl) this.b.W;
                                    hlVar3.a(true);
                                    org.telegram.ui.zn znVar3 = hlVar3.E;
                                    znVar3.c5.updateForward(null, znVar3.Q5);
                                    znVar3.j8();
                                    break;
                                case 10:
                                    this.b.W.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.hl hlVar4 = (org.telegram.ui.hl) this.b.W;
                                    hlVar4.a(true);
                                    org.telegram.ui.zn znVar4 = hlVar4.E;
                                    znVar4.D5 = null;
                                    org.telegram.ui.lk lkVar = znVar4.V;
                                    if (lkVar != null) {
                                        lkVar.T2 = null;
                                        lkVar.U2 = false;
                                    }
                                    MessagePreviewParams messagePreviewParams6 = znVar4.c5;
                                    if (messagePreviewParams6 != null) {
                                        i182 = ((org.telegram.ui.ActionBar.p2) znVar4).currentAccount;
                                        MessageObject messageObject = znVar4.k5;
                                        messagePreviewParams6.updateLink(i182, null, null, messageObject == znVar4.U3 ? null : messageObject, znVar4.i5, znVar4.m5);
                                    }
                                    znVar4.j8();
                                    break;
                                case 12:
                                    rb0 rb0Var5 = this.b;
                                    MessagePreviewParams messagePreviewParams7 = rb0Var5.W.d;
                                    if (messagePreviewParams7.hasMedia) {
                                        boolean z13 = !messagePreviewParams7.webpageSmall;
                                        messagePreviewParams7.webpageSmall = z13;
                                        rb0Var5.D.a(z13, true);
                                        rb0Var5.E.a(messagePreviewParams7.webpageSmall, true);
                                        if (rb0Var5.r.messages.size() > 0 && (message2 = rb0Var5.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z14 = messagePreviewParams7.webpageSmall;
                                            messageMedia2.force_small_media = z14;
                                            messageMedia2.force_large_media = !z14;
                                        }
                                        if (rb0Var5.r.previewMessages.size() > 0 && (message = rb0Var5.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                            boolean z15 = messagePreviewParams7.webpageSmall;
                                            messageMedia.force_small_media = z15;
                                            messageMedia.force_large_media = !z15;
                                        }
                                        rb0Var5.h();
                                        rb0Var5.R = true;
                                        break;
                                    }
                                    break;
                                default:
                                    rb0 rb0Var6 = this.b;
                                    MessagePreviewParams messagePreviewParams8 = rb0Var6.W.d;
                                    boolean z16 = messagePreviewParams8.webpageTop;
                                    messagePreviewParams8.webpageTop = !z16;
                                    rb0Var6.B.a(z16, true);
                                    if (rb0Var6.r.messages.size() > 0 && (message4 = rb0Var6.r.messages.get(0).messageOwner) != null) {
                                        message4.invert_media = messagePreviewParams8.webpageTop;
                                    }
                                    if (rb0Var6.r.previewMessages.size() > 0 && (message3 = rb0Var6.r.previewMessages.get(0).messageOwner) != null) {
                                        message3.invert_media = messagePreviewParams8.webpageTop;
                                    }
                                    rb0Var6.h();
                                    rb0Var6.R = true;
                                    break;
                            }
                        }
                    });
                    r82.addView(g1Var6, k7.b6.n(-1, 48));
                    org.telegram.ui.ActionBar.m1 m1Var3 = new org.telegram.ui.ActionBar.m1(context3, tb0Var);
                    m1Var3.setColor(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, tb0Var)));
                    m1Var3.setTag(R.id.fit_width_tag, 1);
                    r82.addView(m1Var3, k7.b6.n(-1, 8));
                    org.telegram.ui.ActionBar.g1 g1Var7 = new org.telegram.ui.ActionBar.g1(0, context3, xb0Var.C, false, true);
                    g1Var7.g(LocaleController.getString(R.string.QuoteSelectedPart), R.drawable.menu_quote_specific, null);
                    z10 = true;
                    final boolean z12 = true ? 1 : 0;
                    g1Var7.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ab0
                        public final /* synthetic */ rb0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i182;
                            TLRPC.Message message;
                            TLRPC.MessageMedia messageMedia;
                            TLRPC.Message message2;
                            TLRPC.MessageMedia messageMedia2;
                            TLRPC.Message message3;
                            TLRPC.Message message4;
                            switch (z12) {
                                case 0:
                                    rb0 rb0Var2 = this.b;
                                    rb0Var2.W.d.quote = null;
                                    rb0Var2.e.f(false);
                                    rb0Var2.g(false, false);
                                    rb0Var2.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    rb0 rb0Var3 = this.b;
                                    ib0 ib0Var2 = rb0Var3.e;
                                    xb0 xb0Var2 = rb0Var3.W;
                                    if (rb0Var3.c(null) != null) {
                                        if (ib0Var2.v - ib0Var2.u <= MessagesController.getInstance(xb0Var2.w).quoteLengthMax) {
                                            org.telegram.ui.Cells.t9 t9Var = ib0Var2.W;
                                            MessageObject c10 = rb0Var3.c(t9Var != null ? ((org.telegram.ui.Cells.s1) t9Var).getMessageObject() : null);
                                            MessagePreviewParams messagePreviewParams4 = xb0Var2.d;
                                            int i192 = ib0Var2.u;
                                            messagePreviewParams4.quoteStart = i192;
                                            int i202 = ib0Var2.v;
                                            messagePreviewParams4.quoteEnd = i202;
                                            messagePreviewParams4.quote = org.telegram.ui.pn.b(i192, i202, c10);
                                            xb0Var2.b();
                                            xb0Var2.a(true);
                                            break;
                                        } else {
                                            rb0Var3.f();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    rb0 rb0Var4 = this.b;
                                    ib0 ib0Var3 = rb0Var4.e;
                                    xb0 xb0Var3 = rb0Var4.W;
                                    MessagePreviewParams messagePreviewParams5 = xb0Var3.d;
                                    int i212 = xb0Var3.w;
                                    boolean z122 = xb0Var3.b;
                                    if (messagePreviewParams5.quote != null && !z122) {
                                        messagePreviewParams5.quote = null;
                                        ib0Var3.f(false);
                                        rb0Var4.g(false, true);
                                        rb0Var4.k(true);
                                        break;
                                    } else if (ib0Var3.v - ib0Var3.u <= MessagesController.getInstance(i212).quoteLengthMax) {
                                        MessageObject c11 = rb0Var4.c(null);
                                        if (c11 != null) {
                                            if (!ib0Var3.y()) {
                                                messagePreviewParams5.quoteStart = 0;
                                                int min = Math.min(MessagesController.getInstance(i212).quoteLengthMax, c11.messageOwner.message.length());
                                                messagePreviewParams5.quoteEnd = min;
                                                messagePreviewParams5.quote = org.telegram.ui.pn.b(messagePreviewParams5.quoteStart, min, c11);
                                                View d10 = rb0Var4.d();
                                                if (d10 instanceof org.telegram.ui.Cells.s1) {
                                                    ib0Var3.a0((org.telegram.ui.Cells.s1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                }
                                                if (!z122) {
                                                    rb0Var4.s.getSwipeBack().e(rb0Var4.F);
                                                }
                                                rb0Var4.g(true, true);
                                                break;
                                            } else {
                                                messagePreviewParams5.quoteStart = ib0Var3.u;
                                                messagePreviewParams5.quoteEnd = ib0Var3.v;
                                                org.telegram.ui.Cells.t9 t9Var2 = ib0Var3.W;
                                                messagePreviewParams5.quote = org.telegram.ui.pn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, rb0Var4.c(t9Var2 != null ? ((org.telegram.ui.Cells.s1) t9Var2).getMessageObject() : null));
                                                xb0Var3.b();
                                                xb0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        rb0Var4.f();
                                        break;
                                    }
                                    break;
                                case 3:
                                    this.b.W.c(false);
                                    break;
                                case 4:
                                    this.b.W.c(false);
                                    break;
                                case 5:
                                    this.b.W.a(true);
                                    break;
                                case 6:
                                    xb0 xb0Var4 = this.b.W;
                                    if (!xb0Var4.b) {
                                        org.telegram.ui.hl hlVar = (org.telegram.ui.hl) xb0Var4;
                                        hlVar.a(true);
                                        org.telegram.ui.zn znVar = hlVar.E;
                                        znVar.k5 = null;
                                        znVar.i5 = null;
                                        znVar.c5.updateReply(null, null, znVar.Q5, null);
                                        znVar.j8();
                                        break;
                                    } else {
                                        org.telegram.ui.hl hlVar2 = (org.telegram.ui.hl) xb0Var4;
                                        hlVar2.a(true);
                                        org.telegram.ui.zn znVar2 = hlVar2.E;
                                        znVar2.i5 = null;
                                        znVar2.Bb(znVar2.k5);
                                        break;
                                    }
                                case 7:
                                    this.b.W.c(true);
                                    break;
                                case 8:
                                    this.b.W.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.hl hlVar3 = (org.telegram.ui.hl) this.b.W;
                                    hlVar3.a(true);
                                    org.telegram.ui.zn znVar3 = hlVar3.E;
                                    znVar3.c5.updateForward(null, znVar3.Q5);
                                    znVar3.j8();
                                    break;
                                case 10:
                                    this.b.W.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.hl hlVar4 = (org.telegram.ui.hl) this.b.W;
                                    hlVar4.a(true);
                                    org.telegram.ui.zn znVar4 = hlVar4.E;
                                    znVar4.D5 = null;
                                    org.telegram.ui.lk lkVar = znVar4.V;
                                    if (lkVar != null) {
                                        lkVar.T2 = null;
                                        lkVar.U2 = false;
                                    }
                                    MessagePreviewParams messagePreviewParams6 = znVar4.c5;
                                    if (messagePreviewParams6 != null) {
                                        i182 = ((org.telegram.ui.ActionBar.p2) znVar4).currentAccount;
                                        MessageObject messageObject = znVar4.k5;
                                        messagePreviewParams6.updateLink(i182, null, null, messageObject == znVar4.U3 ? null : messageObject, znVar4.i5, znVar4.m5);
                                    }
                                    znVar4.j8();
                                    break;
                                case 12:
                                    rb0 rb0Var5 = this.b;
                                    MessagePreviewParams messagePreviewParams7 = rb0Var5.W.d;
                                    if (messagePreviewParams7.hasMedia) {
                                        boolean z13 = !messagePreviewParams7.webpageSmall;
                                        messagePreviewParams7.webpageSmall = z13;
                                        rb0Var5.D.a(z13, true);
                                        rb0Var5.E.a(messagePreviewParams7.webpageSmall, true);
                                        if (rb0Var5.r.messages.size() > 0 && (message2 = rb0Var5.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z14 = messagePreviewParams7.webpageSmall;
                                            messageMedia2.force_small_media = z14;
                                            messageMedia2.force_large_media = !z14;
                                        }
                                        if (rb0Var5.r.previewMessages.size() > 0 && (message = rb0Var5.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                            boolean z15 = messagePreviewParams7.webpageSmall;
                                            messageMedia.force_small_media = z15;
                                            messageMedia.force_large_media = !z15;
                                        }
                                        rb0Var5.h();
                                        rb0Var5.R = true;
                                        break;
                                    }
                                    break;
                                default:
                                    rb0 rb0Var6 = this.b;
                                    MessagePreviewParams messagePreviewParams8 = rb0Var6.W.d;
                                    boolean z16 = messagePreviewParams8.webpageTop;
                                    messagePreviewParams8.webpageTop = !z16;
                                    rb0Var6.B.a(z16, true);
                                    if (rb0Var6.r.messages.size() > 0 && (message4 = rb0Var6.r.messages.get(0).messageOwner) != null) {
                                        message4.invert_media = messagePreviewParams8.webpageTop;
                                    }
                                    if (rb0Var6.r.previewMessages.size() > 0 && (message3 = rb0Var6.r.previewMessages.get(0).messageOwner) != null) {
                                        message3.invert_media = messagePreviewParams8.webpageTop;
                                    }
                                    rb0Var6.h();
                                    rb0Var6.R = true;
                                    break;
                            }
                        }
                    });
                    r82.addView(g1Var7, k7.b6.n(-1, 48));
                    linearLayout = r82;
                }
                this.F = actionBarPopupWindow$ActionBarPopupWindowLayout.b(linearLayout);
                actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().setStickToRight(z10);
                FrameLayout frameLayout2 = new FrameLayout(context3);
                hb0 hb0Var = new hb0(1, 0, context, xb0Var.C, true, false);
                this.v = hb0Var;
                hb0Var.g(LocaleController.getString(z11 ? R.string.QuoteSelectedPart : R.string.SelectSpecificQuote), R.drawable.menu_select_quote, null);
                hb0 hb0Var2 = new hb0(1, 1, context, xb0Var.C, true, false);
                context3 = context;
                this.w = hb0Var2;
                hb0Var2.g(LocaleController.getString(R.string.ClearQuote), R.drawable.menu_quote_delete, null);
                frameLayout2.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.I5, tb0Var), 6, 0));
                final int i27 = 2;
                frameLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ab0
                    public final /* synthetic */ rb0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i182;
                        TLRPC.Message message;
                        TLRPC.MessageMedia messageMedia;
                        TLRPC.Message message2;
                        TLRPC.MessageMedia messageMedia2;
                        TLRPC.Message message3;
                        TLRPC.Message message4;
                        switch (i27) {
                            case 0:
                                rb0 rb0Var2 = this.b;
                                rb0Var2.W.d.quote = null;
                                rb0Var2.e.f(false);
                                rb0Var2.g(false, false);
                                rb0Var2.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                rb0 rb0Var3 = this.b;
                                ib0 ib0Var2 = rb0Var3.e;
                                xb0 xb0Var2 = rb0Var3.W;
                                if (rb0Var3.c(null) != null) {
                                    if (ib0Var2.v - ib0Var2.u <= MessagesController.getInstance(xb0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.t9 t9Var = ib0Var2.W;
                                        MessageObject c10 = rb0Var3.c(t9Var != null ? ((org.telegram.ui.Cells.s1) t9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams4 = xb0Var2.d;
                                        int i192 = ib0Var2.u;
                                        messagePreviewParams4.quoteStart = i192;
                                        int i202 = ib0Var2.v;
                                        messagePreviewParams4.quoteEnd = i202;
                                        messagePreviewParams4.quote = org.telegram.ui.pn.b(i192, i202, c10);
                                        xb0Var2.b();
                                        xb0Var2.a(true);
                                        break;
                                    } else {
                                        rb0Var3.f();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                rb0 rb0Var4 = this.b;
                                ib0 ib0Var3 = rb0Var4.e;
                                xb0 xb0Var3 = rb0Var4.W;
                                MessagePreviewParams messagePreviewParams5 = xb0Var3.d;
                                int i212 = xb0Var3.w;
                                boolean z122 = xb0Var3.b;
                                if (messagePreviewParams5.quote != null && !z122) {
                                    messagePreviewParams5.quote = null;
                                    ib0Var3.f(false);
                                    rb0Var4.g(false, true);
                                    rb0Var4.k(true);
                                    break;
                                } else if (ib0Var3.v - ib0Var3.u <= MessagesController.getInstance(i212).quoteLengthMax) {
                                    MessageObject c11 = rb0Var4.c(null);
                                    if (c11 != null) {
                                        if (!ib0Var3.y()) {
                                            messagePreviewParams5.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i212).quoteLengthMax, c11.messageOwner.message.length());
                                            messagePreviewParams5.quoteEnd = min;
                                            messagePreviewParams5.quote = org.telegram.ui.pn.b(messagePreviewParams5.quoteStart, min, c11);
                                            View d10 = rb0Var4.d();
                                            if (d10 instanceof org.telegram.ui.Cells.s1) {
                                                ib0Var3.a0((org.telegram.ui.Cells.s1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            }
                                            if (!z122) {
                                                rb0Var4.s.getSwipeBack().e(rb0Var4.F);
                                            }
                                            rb0Var4.g(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams5.quoteStart = ib0Var3.u;
                                            messagePreviewParams5.quoteEnd = ib0Var3.v;
                                            org.telegram.ui.Cells.t9 t9Var2 = ib0Var3.W;
                                            messagePreviewParams5.quote = org.telegram.ui.pn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, rb0Var4.c(t9Var2 != null ? ((org.telegram.ui.Cells.s1) t9Var2).getMessageObject() : null));
                                            xb0Var3.b();
                                            xb0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    rb0Var4.f();
                                    break;
                                }
                                break;
                            case 3:
                                this.b.W.c(false);
                                break;
                            case 4:
                                this.b.W.c(false);
                                break;
                            case 5:
                                this.b.W.a(true);
                                break;
                            case 6:
                                xb0 xb0Var4 = this.b.W;
                                if (!xb0Var4.b) {
                                    org.telegram.ui.hl hlVar = (org.telegram.ui.hl) xb0Var4;
                                    hlVar.a(true);
                                    org.telegram.ui.zn znVar = hlVar.E;
                                    znVar.k5 = null;
                                    znVar.i5 = null;
                                    znVar.c5.updateReply(null, null, znVar.Q5, null);
                                    znVar.j8();
                                    break;
                                } else {
                                    org.telegram.ui.hl hlVar2 = (org.telegram.ui.hl) xb0Var4;
                                    hlVar2.a(true);
                                    org.telegram.ui.zn znVar2 = hlVar2.E;
                                    znVar2.i5 = null;
                                    znVar2.Bb(znVar2.k5);
                                    break;
                                }
                            case 7:
                                this.b.W.c(true);
                                break;
                            case 8:
                                this.b.W.a(true);
                                break;
                            case 9:
                                org.telegram.ui.hl hlVar3 = (org.telegram.ui.hl) this.b.W;
                                hlVar3.a(true);
                                org.telegram.ui.zn znVar3 = hlVar3.E;
                                znVar3.c5.updateForward(null, znVar3.Q5);
                                znVar3.j8();
                                break;
                            case 10:
                                this.b.W.a(true);
                                break;
                            case 11:
                                org.telegram.ui.hl hlVar4 = (org.telegram.ui.hl) this.b.W;
                                hlVar4.a(true);
                                org.telegram.ui.zn znVar4 = hlVar4.E;
                                znVar4.D5 = null;
                                org.telegram.ui.lk lkVar = znVar4.V;
                                if (lkVar != null) {
                                    lkVar.T2 = null;
                                    lkVar.U2 = false;
                                }
                                MessagePreviewParams messagePreviewParams6 = znVar4.c5;
                                if (messagePreviewParams6 != null) {
                                    i182 = ((org.telegram.ui.ActionBar.p2) znVar4).currentAccount;
                                    MessageObject messageObject = znVar4.k5;
                                    messagePreviewParams6.updateLink(i182, null, null, messageObject == znVar4.U3 ? null : messageObject, znVar4.i5, znVar4.m5);
                                }
                                znVar4.j8();
                                break;
                            case 12:
                                rb0 rb0Var5 = this.b;
                                MessagePreviewParams messagePreviewParams7 = rb0Var5.W.d;
                                if (messagePreviewParams7.hasMedia) {
                                    boolean z13 = !messagePreviewParams7.webpageSmall;
                                    messagePreviewParams7.webpageSmall = z13;
                                    rb0Var5.D.a(z13, true);
                                    rb0Var5.E.a(messagePreviewParams7.webpageSmall, true);
                                    if (rb0Var5.r.messages.size() > 0 && (message2 = rb0Var5.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z14 = messagePreviewParams7.webpageSmall;
                                        messageMedia2.force_small_media = z14;
                                        messageMedia2.force_large_media = !z14;
                                    }
                                    if (rb0Var5.r.previewMessages.size() > 0 && (message = rb0Var5.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z15 = messagePreviewParams7.webpageSmall;
                                        messageMedia.force_small_media = z15;
                                        messageMedia.force_large_media = !z15;
                                    }
                                    rb0Var5.h();
                                    rb0Var5.R = true;
                                    break;
                                }
                                break;
                            default:
                                rb0 rb0Var6 = this.b;
                                MessagePreviewParams messagePreviewParams8 = rb0Var6.W.d;
                                boolean z16 = messagePreviewParams8.webpageTop;
                                messagePreviewParams8.webpageTop = !z16;
                                rb0Var6.B.a(z16, true);
                                if (rb0Var6.r.messages.size() > 0 && (message4 = rb0Var6.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams8.webpageTop;
                                }
                                if (rb0Var6.r.previewMessages.size() > 0 && (message3 = rb0Var6.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams8.webpageTop;
                                }
                                rb0Var6.h();
                                rb0Var6.R = true;
                                break;
                        }
                    }
                });
                frameLayout2.addView(hb0Var, k7.b6.c(48.0f, -1));
                frameLayout2.addView(hb0Var2, k7.b6.c(48.0f, -1));
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout2, k7.b6.n(-1, 48));
                messagePreviewParams = messagePreviewParams2;
            }
            if (messagePreviewParams.monoforum || messagePreviewParams.noforwards || messagePreviewParams.hasSecretMessages) {
                i11 = 48;
            } else {
                FrameLayout frameLayout3 = new FrameLayout(context3);
                org.telegram.ui.ActionBar.g1 g1Var8 = new org.telegram.ui.ActionBar.g1(1, context3, xb0Var.C, false, false);
                this.x = g1Var8;
                g1Var8.g(LocaleController.getString(R.string.ReplyToAnotherChat), R.drawable.msg_forward_replace, null);
                final int i28 = 3;
                g1Var8.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ab0
                    public final /* synthetic */ rb0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i182;
                        TLRPC.Message message;
                        TLRPC.MessageMedia messageMedia;
                        TLRPC.Message message2;
                        TLRPC.MessageMedia messageMedia2;
                        TLRPC.Message message3;
                        TLRPC.Message message4;
                        switch (i28) {
                            case 0:
                                rb0 rb0Var2 = this.b;
                                rb0Var2.W.d.quote = null;
                                rb0Var2.e.f(false);
                                rb0Var2.g(false, false);
                                rb0Var2.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                rb0 rb0Var3 = this.b;
                                ib0 ib0Var2 = rb0Var3.e;
                                xb0 xb0Var2 = rb0Var3.W;
                                if (rb0Var3.c(null) != null) {
                                    if (ib0Var2.v - ib0Var2.u <= MessagesController.getInstance(xb0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.t9 t9Var = ib0Var2.W;
                                        MessageObject c10 = rb0Var3.c(t9Var != null ? ((org.telegram.ui.Cells.s1) t9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams4 = xb0Var2.d;
                                        int i192 = ib0Var2.u;
                                        messagePreviewParams4.quoteStart = i192;
                                        int i202 = ib0Var2.v;
                                        messagePreviewParams4.quoteEnd = i202;
                                        messagePreviewParams4.quote = org.telegram.ui.pn.b(i192, i202, c10);
                                        xb0Var2.b();
                                        xb0Var2.a(true);
                                        break;
                                    } else {
                                        rb0Var3.f();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                rb0 rb0Var4 = this.b;
                                ib0 ib0Var3 = rb0Var4.e;
                                xb0 xb0Var3 = rb0Var4.W;
                                MessagePreviewParams messagePreviewParams5 = xb0Var3.d;
                                int i212 = xb0Var3.w;
                                boolean z122 = xb0Var3.b;
                                if (messagePreviewParams5.quote != null && !z122) {
                                    messagePreviewParams5.quote = null;
                                    ib0Var3.f(false);
                                    rb0Var4.g(false, true);
                                    rb0Var4.k(true);
                                    break;
                                } else if (ib0Var3.v - ib0Var3.u <= MessagesController.getInstance(i212).quoteLengthMax) {
                                    MessageObject c11 = rb0Var4.c(null);
                                    if (c11 != null) {
                                        if (!ib0Var3.y()) {
                                            messagePreviewParams5.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i212).quoteLengthMax, c11.messageOwner.message.length());
                                            messagePreviewParams5.quoteEnd = min;
                                            messagePreviewParams5.quote = org.telegram.ui.pn.b(messagePreviewParams5.quoteStart, min, c11);
                                            View d10 = rb0Var4.d();
                                            if (d10 instanceof org.telegram.ui.Cells.s1) {
                                                ib0Var3.a0((org.telegram.ui.Cells.s1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            }
                                            if (!z122) {
                                                rb0Var4.s.getSwipeBack().e(rb0Var4.F);
                                            }
                                            rb0Var4.g(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams5.quoteStart = ib0Var3.u;
                                            messagePreviewParams5.quoteEnd = ib0Var3.v;
                                            org.telegram.ui.Cells.t9 t9Var2 = ib0Var3.W;
                                            messagePreviewParams5.quote = org.telegram.ui.pn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, rb0Var4.c(t9Var2 != null ? ((org.telegram.ui.Cells.s1) t9Var2).getMessageObject() : null));
                                            xb0Var3.b();
                                            xb0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    rb0Var4.f();
                                    break;
                                }
                                break;
                            case 3:
                                this.b.W.c(false);
                                break;
                            case 4:
                                this.b.W.c(false);
                                break;
                            case 5:
                                this.b.W.a(true);
                                break;
                            case 6:
                                xb0 xb0Var4 = this.b.W;
                                if (!xb0Var4.b) {
                                    org.telegram.ui.hl hlVar = (org.telegram.ui.hl) xb0Var4;
                                    hlVar.a(true);
                                    org.telegram.ui.zn znVar = hlVar.E;
                                    znVar.k5 = null;
                                    znVar.i5 = null;
                                    znVar.c5.updateReply(null, null, znVar.Q5, null);
                                    znVar.j8();
                                    break;
                                } else {
                                    org.telegram.ui.hl hlVar2 = (org.telegram.ui.hl) xb0Var4;
                                    hlVar2.a(true);
                                    org.telegram.ui.zn znVar2 = hlVar2.E;
                                    znVar2.i5 = null;
                                    znVar2.Bb(znVar2.k5);
                                    break;
                                }
                            case 7:
                                this.b.W.c(true);
                                break;
                            case 8:
                                this.b.W.a(true);
                                break;
                            case 9:
                                org.telegram.ui.hl hlVar3 = (org.telegram.ui.hl) this.b.W;
                                hlVar3.a(true);
                                org.telegram.ui.zn znVar3 = hlVar3.E;
                                znVar3.c5.updateForward(null, znVar3.Q5);
                                znVar3.j8();
                                break;
                            case 10:
                                this.b.W.a(true);
                                break;
                            case 11:
                                org.telegram.ui.hl hlVar4 = (org.telegram.ui.hl) this.b.W;
                                hlVar4.a(true);
                                org.telegram.ui.zn znVar4 = hlVar4.E;
                                znVar4.D5 = null;
                                org.telegram.ui.lk lkVar = znVar4.V;
                                if (lkVar != null) {
                                    lkVar.T2 = null;
                                    lkVar.U2 = false;
                                }
                                MessagePreviewParams messagePreviewParams6 = znVar4.c5;
                                if (messagePreviewParams6 != null) {
                                    i182 = ((org.telegram.ui.ActionBar.p2) znVar4).currentAccount;
                                    MessageObject messageObject = znVar4.k5;
                                    messagePreviewParams6.updateLink(i182, null, null, messageObject == znVar4.U3 ? null : messageObject, znVar4.i5, znVar4.m5);
                                }
                                znVar4.j8();
                                break;
                            case 12:
                                rb0 rb0Var5 = this.b;
                                MessagePreviewParams messagePreviewParams7 = rb0Var5.W.d;
                                if (messagePreviewParams7.hasMedia) {
                                    boolean z13 = !messagePreviewParams7.webpageSmall;
                                    messagePreviewParams7.webpageSmall = z13;
                                    rb0Var5.D.a(z13, true);
                                    rb0Var5.E.a(messagePreviewParams7.webpageSmall, true);
                                    if (rb0Var5.r.messages.size() > 0 && (message2 = rb0Var5.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z14 = messagePreviewParams7.webpageSmall;
                                        messageMedia2.force_small_media = z14;
                                        messageMedia2.force_large_media = !z14;
                                    }
                                    if (rb0Var5.r.previewMessages.size() > 0 && (message = rb0Var5.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z15 = messagePreviewParams7.webpageSmall;
                                        messageMedia.force_small_media = z15;
                                        messageMedia.force_large_media = !z15;
                                    }
                                    rb0Var5.h();
                                    rb0Var5.R = true;
                                    break;
                                }
                                break;
                            default:
                                rb0 rb0Var6 = this.b;
                                MessagePreviewParams messagePreviewParams8 = rb0Var6.W.d;
                                boolean z16 = messagePreviewParams8.webpageTop;
                                messagePreviewParams8.webpageTop = !z16;
                                rb0Var6.B.a(z16, true);
                                if (rb0Var6.r.messages.size() > 0 && (message4 = rb0Var6.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams8.webpageTop;
                                }
                                if (rb0Var6.r.previewMessages.size() > 0 && (message3 = rb0Var6.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams8.webpageTop;
                                }
                                rb0Var6.h();
                                rb0Var6.R = true;
                                break;
                        }
                    }
                });
                context3 = context;
                org.telegram.ui.ActionBar.g1 g1Var9 = new org.telegram.ui.ActionBar.g1(1, context3, xb0Var.C, false, false);
                this.y = g1Var9;
                g1Var9.g(LocaleController.getString(R.string.QuoteToAnotherChat), R.drawable.msg_forward_replace, null);
                final int i29 = 4;
                g1Var9.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ab0
                    public final /* synthetic */ rb0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i182;
                        TLRPC.Message message;
                        TLRPC.MessageMedia messageMedia;
                        TLRPC.Message message2;
                        TLRPC.MessageMedia messageMedia2;
                        TLRPC.Message message3;
                        TLRPC.Message message4;
                        switch (i29) {
                            case 0:
                                rb0 rb0Var2 = this.b;
                                rb0Var2.W.d.quote = null;
                                rb0Var2.e.f(false);
                                rb0Var2.g(false, false);
                                rb0Var2.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                rb0 rb0Var3 = this.b;
                                ib0 ib0Var2 = rb0Var3.e;
                                xb0 xb0Var2 = rb0Var3.W;
                                if (rb0Var3.c(null) != null) {
                                    if (ib0Var2.v - ib0Var2.u <= MessagesController.getInstance(xb0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.t9 t9Var = ib0Var2.W;
                                        MessageObject c10 = rb0Var3.c(t9Var != null ? ((org.telegram.ui.Cells.s1) t9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams4 = xb0Var2.d;
                                        int i192 = ib0Var2.u;
                                        messagePreviewParams4.quoteStart = i192;
                                        int i202 = ib0Var2.v;
                                        messagePreviewParams4.quoteEnd = i202;
                                        messagePreviewParams4.quote = org.telegram.ui.pn.b(i192, i202, c10);
                                        xb0Var2.b();
                                        xb0Var2.a(true);
                                        break;
                                    } else {
                                        rb0Var3.f();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                rb0 rb0Var4 = this.b;
                                ib0 ib0Var3 = rb0Var4.e;
                                xb0 xb0Var3 = rb0Var4.W;
                                MessagePreviewParams messagePreviewParams5 = xb0Var3.d;
                                int i212 = xb0Var3.w;
                                boolean z122 = xb0Var3.b;
                                if (messagePreviewParams5.quote != null && !z122) {
                                    messagePreviewParams5.quote = null;
                                    ib0Var3.f(false);
                                    rb0Var4.g(false, true);
                                    rb0Var4.k(true);
                                    break;
                                } else if (ib0Var3.v - ib0Var3.u <= MessagesController.getInstance(i212).quoteLengthMax) {
                                    MessageObject c11 = rb0Var4.c(null);
                                    if (c11 != null) {
                                        if (!ib0Var3.y()) {
                                            messagePreviewParams5.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i212).quoteLengthMax, c11.messageOwner.message.length());
                                            messagePreviewParams5.quoteEnd = min;
                                            messagePreviewParams5.quote = org.telegram.ui.pn.b(messagePreviewParams5.quoteStart, min, c11);
                                            View d10 = rb0Var4.d();
                                            if (d10 instanceof org.telegram.ui.Cells.s1) {
                                                ib0Var3.a0((org.telegram.ui.Cells.s1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            }
                                            if (!z122) {
                                                rb0Var4.s.getSwipeBack().e(rb0Var4.F);
                                            }
                                            rb0Var4.g(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams5.quoteStart = ib0Var3.u;
                                            messagePreviewParams5.quoteEnd = ib0Var3.v;
                                            org.telegram.ui.Cells.t9 t9Var2 = ib0Var3.W;
                                            messagePreviewParams5.quote = org.telegram.ui.pn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, rb0Var4.c(t9Var2 != null ? ((org.telegram.ui.Cells.s1) t9Var2).getMessageObject() : null));
                                            xb0Var3.b();
                                            xb0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    rb0Var4.f();
                                    break;
                                }
                                break;
                            case 3:
                                this.b.W.c(false);
                                break;
                            case 4:
                                this.b.W.c(false);
                                break;
                            case 5:
                                this.b.W.a(true);
                                break;
                            case 6:
                                xb0 xb0Var4 = this.b.W;
                                if (!xb0Var4.b) {
                                    org.telegram.ui.hl hlVar = (org.telegram.ui.hl) xb0Var4;
                                    hlVar.a(true);
                                    org.telegram.ui.zn znVar = hlVar.E;
                                    znVar.k5 = null;
                                    znVar.i5 = null;
                                    znVar.c5.updateReply(null, null, znVar.Q5, null);
                                    znVar.j8();
                                    break;
                                } else {
                                    org.telegram.ui.hl hlVar2 = (org.telegram.ui.hl) xb0Var4;
                                    hlVar2.a(true);
                                    org.telegram.ui.zn znVar2 = hlVar2.E;
                                    znVar2.i5 = null;
                                    znVar2.Bb(znVar2.k5);
                                    break;
                                }
                            case 7:
                                this.b.W.c(true);
                                break;
                            case 8:
                                this.b.W.a(true);
                                break;
                            case 9:
                                org.telegram.ui.hl hlVar3 = (org.telegram.ui.hl) this.b.W;
                                hlVar3.a(true);
                                org.telegram.ui.zn znVar3 = hlVar3.E;
                                znVar3.c5.updateForward(null, znVar3.Q5);
                                znVar3.j8();
                                break;
                            case 10:
                                this.b.W.a(true);
                                break;
                            case 11:
                                org.telegram.ui.hl hlVar4 = (org.telegram.ui.hl) this.b.W;
                                hlVar4.a(true);
                                org.telegram.ui.zn znVar4 = hlVar4.E;
                                znVar4.D5 = null;
                                org.telegram.ui.lk lkVar = znVar4.V;
                                if (lkVar != null) {
                                    lkVar.T2 = null;
                                    lkVar.U2 = false;
                                }
                                MessagePreviewParams messagePreviewParams6 = znVar4.c5;
                                if (messagePreviewParams6 != null) {
                                    i182 = ((org.telegram.ui.ActionBar.p2) znVar4).currentAccount;
                                    MessageObject messageObject = znVar4.k5;
                                    messagePreviewParams6.updateLink(i182, null, null, messageObject == znVar4.U3 ? null : messageObject, znVar4.i5, znVar4.m5);
                                }
                                znVar4.j8();
                                break;
                            case 12:
                                rb0 rb0Var5 = this.b;
                                MessagePreviewParams messagePreviewParams7 = rb0Var5.W.d;
                                if (messagePreviewParams7.hasMedia) {
                                    boolean z13 = !messagePreviewParams7.webpageSmall;
                                    messagePreviewParams7.webpageSmall = z13;
                                    rb0Var5.D.a(z13, true);
                                    rb0Var5.E.a(messagePreviewParams7.webpageSmall, true);
                                    if (rb0Var5.r.messages.size() > 0 && (message2 = rb0Var5.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z14 = messagePreviewParams7.webpageSmall;
                                        messageMedia2.force_small_media = z14;
                                        messageMedia2.force_large_media = !z14;
                                    }
                                    if (rb0Var5.r.previewMessages.size() > 0 && (message = rb0Var5.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z15 = messagePreviewParams7.webpageSmall;
                                        messageMedia.force_small_media = z15;
                                        messageMedia.force_large_media = !z15;
                                    }
                                    rb0Var5.h();
                                    rb0Var5.R = true;
                                    break;
                                }
                                break;
                            default:
                                rb0 rb0Var6 = this.b;
                                MessagePreviewParams messagePreviewParams8 = rb0Var6.W.d;
                                boolean z16 = messagePreviewParams8.webpageTop;
                                messagePreviewParams8.webpageTop = !z16;
                                rb0Var6.B.a(z16, true);
                                if (rb0Var6.r.messages.size() > 0 && (message4 = rb0Var6.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams8.webpageTop;
                                }
                                if (rb0Var6.r.previewMessages.size() > 0 && (message3 = rb0Var6.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams8.webpageTop;
                                }
                                rb0Var6.h();
                                rb0Var6.R = true;
                                break;
                        }
                    }
                });
                frameLayout3.addView(g1Var9, k7.b6.c(48.0f, -1));
                frameLayout3.addView(g1Var8, k7.b6.c(48.0f, -1));
                i11 = 48;
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout3, k7.b6.n(-1, 48));
            }
            if (!messagePreviewParams.noforwards && !messagePreviewParams.hasSecretMessages) {
                org.telegram.ui.ActionBar.m1 m1Var4 = new org.telegram.ui.ActionBar.m1(context3, tb0Var);
                m1Var4.setColor(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, tb0Var)));
                m1Var4.setTag(R.id.fit_width_tag, 1);
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(m1Var4, k7.b6.n(-1, 8));
            }
            g(messagePreviewParams.quote != null, false);
            org.telegram.ui.ActionBar.g1 g1Var10 = new org.telegram.ui.ActionBar.g1(1, context3, xb0Var.C, false, false);
            g1Var10.g(LocaleController.getString(R.string.ApplyChanges), R.drawable.msg_select, null);
            final int i30 = 5;
            g1Var10.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ab0
                public final /* synthetic */ rb0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i182;
                    TLRPC.Message message;
                    TLRPC.MessageMedia messageMedia;
                    TLRPC.Message message2;
                    TLRPC.MessageMedia messageMedia2;
                    TLRPC.Message message3;
                    TLRPC.Message message4;
                    switch (i30) {
                        case 0:
                            rb0 rb0Var2 = this.b;
                            rb0Var2.W.d.quote = null;
                            rb0Var2.e.f(false);
                            rb0Var2.g(false, false);
                            rb0Var2.s.getSwipeBack().b(true);
                            break;
                        case 1:
                            rb0 rb0Var3 = this.b;
                            ib0 ib0Var2 = rb0Var3.e;
                            xb0 xb0Var2 = rb0Var3.W;
                            if (rb0Var3.c(null) != null) {
                                if (ib0Var2.v - ib0Var2.u <= MessagesController.getInstance(xb0Var2.w).quoteLengthMax) {
                                    org.telegram.ui.Cells.t9 t9Var = ib0Var2.W;
                                    MessageObject c10 = rb0Var3.c(t9Var != null ? ((org.telegram.ui.Cells.s1) t9Var).getMessageObject() : null);
                                    MessagePreviewParams messagePreviewParams4 = xb0Var2.d;
                                    int i192 = ib0Var2.u;
                                    messagePreviewParams4.quoteStart = i192;
                                    int i202 = ib0Var2.v;
                                    messagePreviewParams4.quoteEnd = i202;
                                    messagePreviewParams4.quote = org.telegram.ui.pn.b(i192, i202, c10);
                                    xb0Var2.b();
                                    xb0Var2.a(true);
                                    break;
                                } else {
                                    rb0Var3.f();
                                    break;
                                }
                            }
                            break;
                        case 2:
                            rb0 rb0Var4 = this.b;
                            ib0 ib0Var3 = rb0Var4.e;
                            xb0 xb0Var3 = rb0Var4.W;
                            MessagePreviewParams messagePreviewParams5 = xb0Var3.d;
                            int i212 = xb0Var3.w;
                            boolean z122 = xb0Var3.b;
                            if (messagePreviewParams5.quote != null && !z122) {
                                messagePreviewParams5.quote = null;
                                ib0Var3.f(false);
                                rb0Var4.g(false, true);
                                rb0Var4.k(true);
                                break;
                            } else if (ib0Var3.v - ib0Var3.u <= MessagesController.getInstance(i212).quoteLengthMax) {
                                MessageObject c11 = rb0Var4.c(null);
                                if (c11 != null) {
                                    if (!ib0Var3.y()) {
                                        messagePreviewParams5.quoteStart = 0;
                                        int min = Math.min(MessagesController.getInstance(i212).quoteLengthMax, c11.messageOwner.message.length());
                                        messagePreviewParams5.quoteEnd = min;
                                        messagePreviewParams5.quote = org.telegram.ui.pn.b(messagePreviewParams5.quoteStart, min, c11);
                                        View d10 = rb0Var4.d();
                                        if (d10 instanceof org.telegram.ui.Cells.s1) {
                                            ib0Var3.a0((org.telegram.ui.Cells.s1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                        }
                                        if (!z122) {
                                            rb0Var4.s.getSwipeBack().e(rb0Var4.F);
                                        }
                                        rb0Var4.g(true, true);
                                        break;
                                    } else {
                                        messagePreviewParams5.quoteStart = ib0Var3.u;
                                        messagePreviewParams5.quoteEnd = ib0Var3.v;
                                        org.telegram.ui.Cells.t9 t9Var2 = ib0Var3.W;
                                        messagePreviewParams5.quote = org.telegram.ui.pn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, rb0Var4.c(t9Var2 != null ? ((org.telegram.ui.Cells.s1) t9Var2).getMessageObject() : null));
                                        xb0Var3.b();
                                        xb0Var3.a(true);
                                        break;
                                    }
                                }
                            } else {
                                rb0Var4.f();
                                break;
                            }
                            break;
                        case 3:
                            this.b.W.c(false);
                            break;
                        case 4:
                            this.b.W.c(false);
                            break;
                        case 5:
                            this.b.W.a(true);
                            break;
                        case 6:
                            xb0 xb0Var4 = this.b.W;
                            if (!xb0Var4.b) {
                                org.telegram.ui.hl hlVar = (org.telegram.ui.hl) xb0Var4;
                                hlVar.a(true);
                                org.telegram.ui.zn znVar = hlVar.E;
                                znVar.k5 = null;
                                znVar.i5 = null;
                                znVar.c5.updateReply(null, null, znVar.Q5, null);
                                znVar.j8();
                                break;
                            } else {
                                org.telegram.ui.hl hlVar2 = (org.telegram.ui.hl) xb0Var4;
                                hlVar2.a(true);
                                org.telegram.ui.zn znVar2 = hlVar2.E;
                                znVar2.i5 = null;
                                znVar2.Bb(znVar2.k5);
                                break;
                            }
                        case 7:
                            this.b.W.c(true);
                            break;
                        case 8:
                            this.b.W.a(true);
                            break;
                        case 9:
                            org.telegram.ui.hl hlVar3 = (org.telegram.ui.hl) this.b.W;
                            hlVar3.a(true);
                            org.telegram.ui.zn znVar3 = hlVar3.E;
                            znVar3.c5.updateForward(null, znVar3.Q5);
                            znVar3.j8();
                            break;
                        case 10:
                            this.b.W.a(true);
                            break;
                        case 11:
                            org.telegram.ui.hl hlVar4 = (org.telegram.ui.hl) this.b.W;
                            hlVar4.a(true);
                            org.telegram.ui.zn znVar4 = hlVar4.E;
                            znVar4.D5 = null;
                            org.telegram.ui.lk lkVar = znVar4.V;
                            if (lkVar != null) {
                                lkVar.T2 = null;
                                lkVar.U2 = false;
                            }
                            MessagePreviewParams messagePreviewParams6 = znVar4.c5;
                            if (messagePreviewParams6 != null) {
                                i182 = ((org.telegram.ui.ActionBar.p2) znVar4).currentAccount;
                                MessageObject messageObject = znVar4.k5;
                                messagePreviewParams6.updateLink(i182, null, null, messageObject == znVar4.U3 ? null : messageObject, znVar4.i5, znVar4.m5);
                            }
                            znVar4.j8();
                            break;
                        case 12:
                            rb0 rb0Var5 = this.b;
                            MessagePreviewParams messagePreviewParams7 = rb0Var5.W.d;
                            if (messagePreviewParams7.hasMedia) {
                                boolean z13 = !messagePreviewParams7.webpageSmall;
                                messagePreviewParams7.webpageSmall = z13;
                                rb0Var5.D.a(z13, true);
                                rb0Var5.E.a(messagePreviewParams7.webpageSmall, true);
                                if (rb0Var5.r.messages.size() > 0 && (message2 = rb0Var5.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                    boolean z14 = messagePreviewParams7.webpageSmall;
                                    messageMedia2.force_small_media = z14;
                                    messageMedia2.force_large_media = !z14;
                                }
                                if (rb0Var5.r.previewMessages.size() > 0 && (message = rb0Var5.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                    boolean z15 = messagePreviewParams7.webpageSmall;
                                    messageMedia.force_small_media = z15;
                                    messageMedia.force_large_media = !z15;
                                }
                                rb0Var5.h();
                                rb0Var5.R = true;
                                break;
                            }
                            break;
                        default:
                            rb0 rb0Var6 = this.b;
                            MessagePreviewParams messagePreviewParams8 = rb0Var6.W.d;
                            boolean z16 = messagePreviewParams8.webpageTop;
                            messagePreviewParams8.webpageTop = !z16;
                            rb0Var6.B.a(z16, true);
                            if (rb0Var6.r.messages.size() > 0 && (message4 = rb0Var6.r.messages.get(0).messageOwner) != null) {
                                message4.invert_media = messagePreviewParams8.webpageTop;
                            }
                            if (rb0Var6.r.previewMessages.size() > 0 && (message3 = rb0Var6.r.previewMessages.get(0).messageOwner) != null) {
                                message3.invert_media = messagePreviewParams8.webpageTop;
                            }
                            rb0Var6.h();
                            rb0Var6.R = true;
                            break;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var10, k7.b6.n(-1, i11));
            org.telegram.ui.ActionBar.g1 g1Var11 = new org.telegram.ui.ActionBar.g1(1, context, xb0Var.C, false, true);
            g1Var11.g(LocaleController.getString(z11 ? R.string.DoNotQuote : R.string.DoNotReply), R.drawable.msg_delete, null);
            int v04 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q7, tb0Var);
            int i31 = org.telegram.ui.ActionBar.j6.p7;
            g1Var11.c(v04, org.telegram.ui.ActionBar.j6.v0(i31, tb0Var));
            g1Var11.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.w0(null, i31, false)));
            final int i32 = 6;
            g1Var11.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ab0
                public final /* synthetic */ rb0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i182;
                    TLRPC.Message message;
                    TLRPC.MessageMedia messageMedia;
                    TLRPC.Message message2;
                    TLRPC.MessageMedia messageMedia2;
                    TLRPC.Message message3;
                    TLRPC.Message message4;
                    switch (i32) {
                        case 0:
                            rb0 rb0Var2 = this.b;
                            rb0Var2.W.d.quote = null;
                            rb0Var2.e.f(false);
                            rb0Var2.g(false, false);
                            rb0Var2.s.getSwipeBack().b(true);
                            break;
                        case 1:
                            rb0 rb0Var3 = this.b;
                            ib0 ib0Var2 = rb0Var3.e;
                            xb0 xb0Var2 = rb0Var3.W;
                            if (rb0Var3.c(null) != null) {
                                if (ib0Var2.v - ib0Var2.u <= MessagesController.getInstance(xb0Var2.w).quoteLengthMax) {
                                    org.telegram.ui.Cells.t9 t9Var = ib0Var2.W;
                                    MessageObject c10 = rb0Var3.c(t9Var != null ? ((org.telegram.ui.Cells.s1) t9Var).getMessageObject() : null);
                                    MessagePreviewParams messagePreviewParams4 = xb0Var2.d;
                                    int i192 = ib0Var2.u;
                                    messagePreviewParams4.quoteStart = i192;
                                    int i202 = ib0Var2.v;
                                    messagePreviewParams4.quoteEnd = i202;
                                    messagePreviewParams4.quote = org.telegram.ui.pn.b(i192, i202, c10);
                                    xb0Var2.b();
                                    xb0Var2.a(true);
                                    break;
                                } else {
                                    rb0Var3.f();
                                    break;
                                }
                            }
                            break;
                        case 2:
                            rb0 rb0Var4 = this.b;
                            ib0 ib0Var3 = rb0Var4.e;
                            xb0 xb0Var3 = rb0Var4.W;
                            MessagePreviewParams messagePreviewParams5 = xb0Var3.d;
                            int i212 = xb0Var3.w;
                            boolean z122 = xb0Var3.b;
                            if (messagePreviewParams5.quote != null && !z122) {
                                messagePreviewParams5.quote = null;
                                ib0Var3.f(false);
                                rb0Var4.g(false, true);
                                rb0Var4.k(true);
                                break;
                            } else if (ib0Var3.v - ib0Var3.u <= MessagesController.getInstance(i212).quoteLengthMax) {
                                MessageObject c11 = rb0Var4.c(null);
                                if (c11 != null) {
                                    if (!ib0Var3.y()) {
                                        messagePreviewParams5.quoteStart = 0;
                                        int min = Math.min(MessagesController.getInstance(i212).quoteLengthMax, c11.messageOwner.message.length());
                                        messagePreviewParams5.quoteEnd = min;
                                        messagePreviewParams5.quote = org.telegram.ui.pn.b(messagePreviewParams5.quoteStart, min, c11);
                                        View d10 = rb0Var4.d();
                                        if (d10 instanceof org.telegram.ui.Cells.s1) {
                                            ib0Var3.a0((org.telegram.ui.Cells.s1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                        }
                                        if (!z122) {
                                            rb0Var4.s.getSwipeBack().e(rb0Var4.F);
                                        }
                                        rb0Var4.g(true, true);
                                        break;
                                    } else {
                                        messagePreviewParams5.quoteStart = ib0Var3.u;
                                        messagePreviewParams5.quoteEnd = ib0Var3.v;
                                        org.telegram.ui.Cells.t9 t9Var2 = ib0Var3.W;
                                        messagePreviewParams5.quote = org.telegram.ui.pn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, rb0Var4.c(t9Var2 != null ? ((org.telegram.ui.Cells.s1) t9Var2).getMessageObject() : null));
                                        xb0Var3.b();
                                        xb0Var3.a(true);
                                        break;
                                    }
                                }
                            } else {
                                rb0Var4.f();
                                break;
                            }
                            break;
                        case 3:
                            this.b.W.c(false);
                            break;
                        case 4:
                            this.b.W.c(false);
                            break;
                        case 5:
                            this.b.W.a(true);
                            break;
                        case 6:
                            xb0 xb0Var4 = this.b.W;
                            if (!xb0Var4.b) {
                                org.telegram.ui.hl hlVar = (org.telegram.ui.hl) xb0Var4;
                                hlVar.a(true);
                                org.telegram.ui.zn znVar = hlVar.E;
                                znVar.k5 = null;
                                znVar.i5 = null;
                                znVar.c5.updateReply(null, null, znVar.Q5, null);
                                znVar.j8();
                                break;
                            } else {
                                org.telegram.ui.hl hlVar2 = (org.telegram.ui.hl) xb0Var4;
                                hlVar2.a(true);
                                org.telegram.ui.zn znVar2 = hlVar2.E;
                                znVar2.i5 = null;
                                znVar2.Bb(znVar2.k5);
                                break;
                            }
                        case 7:
                            this.b.W.c(true);
                            break;
                        case 8:
                            this.b.W.a(true);
                            break;
                        case 9:
                            org.telegram.ui.hl hlVar3 = (org.telegram.ui.hl) this.b.W;
                            hlVar3.a(true);
                            org.telegram.ui.zn znVar3 = hlVar3.E;
                            znVar3.c5.updateForward(null, znVar3.Q5);
                            znVar3.j8();
                            break;
                        case 10:
                            this.b.W.a(true);
                            break;
                        case 11:
                            org.telegram.ui.hl hlVar4 = (org.telegram.ui.hl) this.b.W;
                            hlVar4.a(true);
                            org.telegram.ui.zn znVar4 = hlVar4.E;
                            znVar4.D5 = null;
                            org.telegram.ui.lk lkVar = znVar4.V;
                            if (lkVar != null) {
                                lkVar.T2 = null;
                                lkVar.U2 = false;
                            }
                            MessagePreviewParams messagePreviewParams6 = znVar4.c5;
                            if (messagePreviewParams6 != null) {
                                i182 = ((org.telegram.ui.ActionBar.p2) znVar4).currentAccount;
                                MessageObject messageObject = znVar4.k5;
                                messagePreviewParams6.updateLink(i182, null, null, messageObject == znVar4.U3 ? null : messageObject, znVar4.i5, znVar4.m5);
                            }
                            znVar4.j8();
                            break;
                        case 12:
                            rb0 rb0Var5 = this.b;
                            MessagePreviewParams messagePreviewParams7 = rb0Var5.W.d;
                            if (messagePreviewParams7.hasMedia) {
                                boolean z13 = !messagePreviewParams7.webpageSmall;
                                messagePreviewParams7.webpageSmall = z13;
                                rb0Var5.D.a(z13, true);
                                rb0Var5.E.a(messagePreviewParams7.webpageSmall, true);
                                if (rb0Var5.r.messages.size() > 0 && (message2 = rb0Var5.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                    boolean z14 = messagePreviewParams7.webpageSmall;
                                    messageMedia2.force_small_media = z14;
                                    messageMedia2.force_large_media = !z14;
                                }
                                if (rb0Var5.r.previewMessages.size() > 0 && (message = rb0Var5.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                    boolean z15 = messagePreviewParams7.webpageSmall;
                                    messageMedia.force_small_media = z15;
                                    messageMedia.force_large_media = !z15;
                                }
                                rb0Var5.h();
                                rb0Var5.R = true;
                                break;
                            }
                            break;
                        default:
                            rb0 rb0Var6 = this.b;
                            MessagePreviewParams messagePreviewParams8 = rb0Var6.W.d;
                            boolean z16 = messagePreviewParams8.webpageTop;
                            messagePreviewParams8.webpageTop = !z16;
                            rb0Var6.B.a(z16, true);
                            if (rb0Var6.r.messages.size() > 0 && (message4 = rb0Var6.r.messages.get(0).messageOwner) != null) {
                                message4.invert_media = messagePreviewParams8.webpageTop;
                            }
                            if (rb0Var6.r.previewMessages.size() > 0 && (message3 = rb0Var6.r.previewMessages.get(0).messageOwner) != null) {
                                message3.invert_media = messagePreviewParams8.webpageTop;
                            }
                            rb0Var6.h();
                            rb0Var6.R = true;
                            break;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var11, k7.b6.n(-1, i11));
            context2 = context;
            rb0Var = this;
        }
        int i33 = rb0Var.a;
        if (i33 == 1) {
            rb0Var.r = messagePreviewParams.forwardMessages;
        } else if (i33 == 0) {
            rb0Var.r = messagePreviewParams.replyMessage;
        } else if (i33 == 2) {
            rb0Var.r = messagePreviewParams.linkMessage;
        }
        org.telegram.ui.Cells.x9 o10 = rb0Var.e.o(context2);
        rb0Var.d = o10;
        o10.setElevation(AndroidUtilities.dp(8.0f));
        o10.setOutlineProvider(null);
        if (o10.getParent() instanceof ViewGroup) {
            ((ViewGroup) o10.getParent()).removeView(o10);
        }
        rb0Var.addView(o10, k7.b6.d(-1, -1.0f, 51, 0.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / AndroidUtilities.density, 0.0f, 0.0f));
        rb0Var.e.T(rb0Var.f);
    }

    public static MessageObject.GroupedMessages a(rb0 rb0Var, MessageObject messageObject) {
        if (messageObject.getGroupId() == 0) {
            return null;
        }
        MessageObject.GroupedMessages groupedMessages = rb0Var.r.groupedMessagesMap.get(messageObject.getGroupId());
        if (groupedMessages == null || (groupedMessages.messages.size() > 1 && groupedMessages.getPosition(messageObject) != null)) {
            return groupedMessages;
        }
        return null;
    }

    public static void b(rb0 rb0Var, org.telegram.ui.Cells.s1 s1Var) {
        CharacterStyle characterStyle;
        TLRPC.WebPage webPage;
        if (rb0Var.a == 2) {
            MessagePreviewParams messagePreviewParams = rb0Var.W.d;
            if (!messagePreviewParams.singleLink && (characterStyle = messagePreviewParams.currentLink) != null && (webPage = messagePreviewParams.webpage) != null && !(webPage instanceof TLRPC.TL_webPagePending)) {
                s1Var.Q3(characterStyle);
                return;
            }
        }
        s1Var.Q3(null);
    }

    public final MessageObject c(MessageObject messageObject) {
        MessageObject.GroupedMessages valueAt;
        xb0 xb0Var = this.W;
        MessagePreviewParams.Messages messages = xb0Var.d.replyMessage;
        if (messages == null) {
            return null;
        }
        LongSparseArray<MessageObject.GroupedMessages> longSparseArray = messages.groupedMessagesMap;
        if (longSparseArray == null || longSparseArray.size() <= 0 || (valueAt = xb0Var.d.replyMessage.groupedMessagesMap.valueAt(0)) == null) {
            return xb0Var.d.replyMessage.messages.get(0);
        }
        if (valueAt.isDocuments) {
            if (messageObject != null) {
                return messageObject;
            }
            org.telegram.ui.pn pnVar = xb0Var.d.quote;
            if (pnVar != null) {
                return pnVar.a;
            }
        }
        return valueAt.captionMessage;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        return r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View d() {
        MessageObject c3 = c(null);
        if (c3 != null) {
            int i10 = 0;
            while (true) {
                jb0 jb0Var = this.f;
                if (i10 >= jb0Var.getChildCount()) {
                    break;
                }
                View childAt = jb0Var.getChildAt(i10);
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) childAt;
                if (n4Var.getMessageObject() != null && (n4Var.getMessageObject() == c3 || n4Var.getMessageObject().getId() == c3.getId())) {
                    break;
                }
                i10++;
            }
        }
        return null;
    }

    public final void e(float f10, int i10) {
        boolean z4 = this.W.v;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        ah.e eVar = this.c;
        kh.i4 i4Var = this.b;
        if (z4) {
            eVar.setTranslationY(0.0f);
            i4Var.invalidateOutline();
            i4Var.setTranslationY(0.0f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(0.0f);
        } else {
            eVar.setTranslationY(i10);
            i4Var.invalidateOutline();
            i4Var.setTranslationY(f10);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((f10 + i4Var.getMeasuredHeight()) - AndroidUtilities.dp(2.0f));
        }
        float x10 = i4Var.getX();
        org.telegram.ui.Cells.x9 x9Var = this.d;
        x9Var.setTranslationX(x10);
        x9Var.setTranslationY(i4Var.getY());
    }

    public final void f() {
        xb0 xb0Var = this.W;
        new qc(xb0Var, xb0Var.C).M(LocaleController.getString(R.string.QuoteMaxError), LocaleController.getString(R.string.QuoteMaxErrorMessage), R.raw.error).j();
    }

    public final void g(boolean z4, boolean z10) {
        if (this.W.b) {
            z4 = false;
        }
        if (z10 && this.L == z4) {
            return;
        }
        this.L = z4;
        AnimatorSet animatorSet = this.M;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.M = null;
        }
        org.telegram.ui.ActionBar.g1 g1Var = this.y;
        org.telegram.ui.ActionBar.g1 g1Var2 = this.x;
        hb0 hb0Var = this.w;
        hb0 hb0Var2 = this.v;
        if (!z10) {
            if (hb0Var2 != null) {
                hb0Var2.setAlpha(!z4 ? 1.0f : 0.0f);
                hb0Var2.setVisibility(!z4 ? 0 : 4);
            }
            if (hb0Var != null) {
                hb0Var.setAlpha(z4 ? 1.0f : 0.0f);
                hb0Var.setVisibility(z4 ? 0 : 4);
            }
            if (g1Var2 != null) {
                g1Var2.setAlpha(!z4 ? 1.0f : 0.0f);
                g1Var2.setVisibility(!z4 ? 0 : 4);
            }
            if (g1Var != null) {
                g1Var.setAlpha(z4 ? 1.0f : 0.0f);
                g1Var.setVisibility(z4 ? 0 : 4);
                return;
            }
            return;
        }
        this.M = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        if (hb0Var2 != null) {
            hb0Var2.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(hb0Var2, (Property<hb0, Float>) property, !z4 ? 1.0f : 0.0f));
        }
        if (hb0Var != null) {
            hb0Var.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(hb0Var, (Property<hb0, Float>) property, z4 ? 1.0f : 0.0f));
        }
        if (g1Var2 != null) {
            g1Var2.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(g1Var2, (Property<org.telegram.ui.ActionBar.g1, Float>) property, !z4 ? 1.0f : 0.0f));
        }
        if (g1Var != null) {
            g1Var.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(g1Var, (Property<org.telegram.ui.ActionBar.g1, Float>) property, z4 ? 1.0f : 0.0f));
        }
        this.M.playTogether(arrayList);
        this.M.setDuration(360L);
        this.M.setInterpolator(mr.h);
        this.M.addListener(new m00(7, this, z4));
        this.M.start();
    }

    public final void h() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        xb0 xb0Var = this.W;
        MessagePreviewParams messagePreviewParams = xb0Var.d;
        lb0 lb0Var = this.h;
        if (lb0Var.k()) {
            this.S = true;
            return;
        }
        for (int i10 = 0; i10 < this.r.previewMessages.size(); i10++) {
            MessageObject messageObject = this.r.previewMessages.get(i10);
            messageObject.forceUpdate = true;
            messageObject.sendAsPeer = xb0Var.a;
            if (messagePreviewParams.hideForwardSendersName) {
                messageObject.messageOwner.flags &= -5;
                messageObject.hideSendersName = true;
            } else {
                messageObject.messageOwner.flags |= 4;
                messageObject.hideSendersName = false;
            }
            if (this.a == 2) {
                TLRPC.WebPage webPage = messagePreviewParams.webpage;
                if (webPage != null && ((messageMedia = (message = messageObject.messageOwner).media) == null || messageMedia.webpage != webPage)) {
                    message.flags |= 512;
                    message.media = new TLRPC.TL_messageMediaWebPage();
                    TLRPC.MessageMedia messageMedia2 = messageObject.messageOwner.media;
                    messageMedia2.webpage = messagePreviewParams.webpage;
                    boolean z4 = messagePreviewParams.webpageSmall;
                    messageMedia2.force_large_media = !z4;
                    messageMedia2.force_small_media = z4;
                    messageMedia2.manual = true;
                    messageObject.linkDescription = null;
                    messageObject.generateLinkDescription();
                    messageObject.photoThumbs = null;
                    messageObject.photoThumbs2 = null;
                    messageObject.photoThumbsObject = null;
                    messageObject.photoThumbsObject2 = null;
                    messageObject.generateThumbs(true);
                    messageObject.checkMediaExistance();
                } else if (webPage == null) {
                    TLRPC.Message message2 = messageObject.messageOwner;
                    message2.flags &= -513;
                    message2.media = null;
                }
            }
            if (messagePreviewParams.hideCaption) {
                messageObject.caption = null;
            } else {
                messageObject.generateCaption();
            }
            if (messageObject.isPoll()) {
                MessagePreviewParams.PreviewMediaPoll previewMediaPoll = (MessagePreviewParams.PreviewMediaPoll) messageObject.messageOwner.media;
                previewMediaPoll.results.total_voters = messagePreviewParams.hideCaption ? 0 : previewMediaPoll.totalVotersCached;
            }
        }
        for (int i11 = 0; i11 < this.r.pollChosenAnswers.size(); i11++) {
            this.r.pollChosenAnswers.get(i11).chosen = !messagePreviewParams.hideForwardSendersName;
        }
        for (int i12 = 0; i12 < this.r.groupedMessagesMap.size(); i12++) {
            lb0Var.V(this.r.groupedMessagesMap.valueAt(i12));
        }
        this.n.q(0, this.r.previewMessages.size());
    }

    public final void i() {
        int i10 = this.O;
        float f10 = this.P;
        xb0 xb0Var = this.W;
        boolean z4 = xb0Var.v;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        jb0 jb0Var = this.f;
        if (z4) {
            this.P = 0.0f;
            this.O = 0;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(AndroidUtilities.dp(8.0f) + jb0Var.getMeasuredWidth());
        } else {
            int measuredHeight = jb0Var.getMeasuredHeight();
            int i11 = 0;
            for (int i12 = 0; i12 < jb0Var.getChildCount(); i12++) {
                View childAt = jb0Var.getChildAt(i12);
                if (RecyclerView.R(childAt) != -1) {
                    measuredHeight = Math.min(measuredHeight, childAt.getTop());
                    i11++;
                }
            }
            MessagePreviewParams.Messages messages = this.r;
            if (messages == null || i11 == 0 || i11 > messages.previewMessages.size()) {
                this.O = 0;
            } else {
                int c3 = kf.k0.c(4.0f, measuredHeight, 0);
                this.O = c3;
                this.O = Math.min(((jb0Var.getMeasuredHeight() - this.O) + c3) - ((int) ((((AndroidUtilities.displaySize.y - (Build.VERSION.SDK_INT >= 35 ? AndroidUtilities.navigationBarHeight : 0)) * 0.8f) - this.T) - AndroidUtilities.dp(8.0f))), this.O);
            }
            float x10 = e2.c.x(getMeasuredHeight() - AndroidUtilities.dp(16.0f), (this.b.getMeasuredHeight() - this.O) + (this.T - AndroidUtilities.dp(8.0f)), 2.0f, AndroidUtilities.dp(8.0f)) - this.O;
            this.P = x10;
            if (x10 > AndroidUtilities.dp(8.0f)) {
                this.P = AndroidUtilities.dp(8.0f);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
        }
        boolean z10 = this.H;
        if (z10 || (this.O == i10 && this.P == f10)) {
            if (z10) {
                float f11 = this.P;
                int i13 = this.O;
                this.Q = i13;
                e(f11, i13);
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = xb0Var.h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        xb0Var.h = ofFloat;
        ofFloat.addUpdateListener(new sj(this, i10, f10, 1));
        xb0Var.h.setDuration(250L);
        xb0Var.h.setInterpolator(wh.n.V);
        xb0Var.h.addListener(new a9(this, 27));
        AndroidUtilities.runOnUIThread(xb0Var.y, 50L);
        this.Q = i10;
        e(f10, i10);
    }

    public final void j() {
        MessageObject messageObject;
        xb0 xb0Var = this.W;
        MessagePreviewParams messagePreviewParams = xb0Var.d;
        if (this.a == 0) {
            ib0 ib0Var = this.e;
            if (ib0Var.v - ib0Var.u > MessagesController.getInstance(xb0Var.w).quoteLengthMax) {
                return;
            }
            org.telegram.ui.Cells.t9 t9Var = ib0Var.W;
            MessageObject c3 = c(t9Var != null ? ((org.telegram.ui.Cells.s1) t9Var).getMessageObject() : null);
            if (messagePreviewParams.quote != null && ib0Var.y()) {
                messagePreviewParams.quoteStart = ib0Var.u;
                messagePreviewParams.quoteEnd = ib0Var.v;
                if (c3 != null && ((messageObject = messagePreviewParams.quote.a) == null || messageObject.getId() != c3.getId())) {
                    messagePreviewParams.quote = org.telegram.ui.pn.b(messagePreviewParams.quoteStart, messagePreviewParams.quoteEnd, c3);
                    xb0Var.b();
                }
            }
            ib0Var.f(false);
        }
    }

    public final void k(boolean z4) {
        xb0 xb0Var = this.W;
        TLRPC.User user = xb0Var.n;
        MessagePreviewParams messagePreviewParams = xb0Var.d;
        TLRPC.Chat chat = xb0Var.r;
        ah.e eVar = this.c;
        int i10 = this.a;
        if (i10 == 1) {
            MessagePreviewParams.Messages messages = messagePreviewParams.forwardMessages;
            eVar.d(LocaleController.formatPluralString("PreviewForwardMessagesCount", messages == null ? 0 : messages.selectedIds.size(), new Object[0]), z4);
            eVar.c(!messagePreviewParams.hasSenders ? messagePreviewParams.willSeeSenders ? user != null ? LocaleController.formatString("ForwardPreviewSendersNameVisible", R.string.ForwardPreviewSendersNameVisible, ContactsController.formatName(user.first_name, user.last_name)) : (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.ForwardPreviewSendersNameVisibleGroup) : LocaleController.getString(R.string.ForwardPreviewSendersNameVisibleChannel) : user != null ? LocaleController.formatString("ForwardPreviewSendersNameVisible", R.string.ForwardPreviewSendersNameVisible, ContactsController.formatName(user.first_name, user.last_name)) : (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.ForwardPreviewSendersNameHiddenGroup) : LocaleController.getString(R.string.ForwardPreviewSendersNameHiddenChannel) : !messagePreviewParams.hideForwardSendersName ? user != null ? LocaleController.formatString("ForwardPreviewSendersNameVisible", R.string.ForwardPreviewSendersNameVisible, ContactsController.formatName(user.first_name, user.last_name)) : (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.ForwardPreviewSendersNameVisibleGroup) : LocaleController.getString(R.string.ForwardPreviewSendersNameVisibleChannel) : user != null ? LocaleController.formatString("ForwardPreviewSendersNameHidden", R.string.ForwardPreviewSendersNameHidden, ContactsController.formatName(user.first_name, user.last_name)) : (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.ForwardPreviewSendersNameHiddenGroup) : LocaleController.getString(R.string.ForwardPreviewSendersNameHiddenChannel), z4);
        } else {
            if (i10 != 0) {
                if (i10 == 2) {
                    eVar.d(LocaleController.getString(R.string.MessageOptionsLinkTitle), z4);
                    eVar.c(LocaleController.getString(R.string.MessageOptionsLinkSubtitle), z4);
                    return;
                }
                return;
            }
            if (messagePreviewParams.quote == null || !messagePreviewParams.replyMessage.hasText) {
                eVar.d(LocaleController.getString(R.string.MessageOptionsReplyTitle), z4);
                eVar.c(messagePreviewParams.replyMessage.hasText ? LocaleController.getString(R.string.MessageOptionsReplySubtitle) : "", z4);
            } else {
                eVar.d(LocaleController.getString(R.string.PreviewQuoteUpdate), z4);
                eVar.c(LocaleController.getString(R.string.PreviewQuoteUpdateSubtitle), z4);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.a == 0) {
            AndroidUtilities.forEachViews((RecyclerView) this.f, (h5.d) new bb0(this, 0));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j();
        this.V = true;
        this.H = true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        i();
        this.H = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z4 = View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i11);
        xb0 xb0Var = this.W;
        xb0Var.v = z4;
        this.T = 0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(i10, makeMeasureSpec);
        int i12 = this.T;
        int measuredHeight = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
        Rect rect = this.N;
        this.T = Math.max(i12, measuredHeight + rect.top + rect.bottom);
        ((ViewGroup.MarginLayoutParams) this.f.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        boolean z10 = xb0Var.v;
        kh.i4 i4Var = this.b;
        if (z10) {
            i4Var.getLayoutParams().height = -1;
            ((ViewGroup.MarginLayoutParams) i4Var.getLayoutParams()).topMargin = AndroidUtilities.dp(8.0f);
            ((ViewGroup.MarginLayoutParams) i4Var.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
            i4Var.getLayoutParams().width = (int) Math.min(View.MeasureSpec.getSize(i10), Math.max(AndroidUtilities.dp(340.0f), View.MeasureSpec.getSize(i10) * 0.6f));
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = -1;
        } else {
            ((ViewGroup.MarginLayoutParams) i4Var.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) i4Var.getLayoutParams()).bottomMargin = 0;
            i4Var.getLayoutParams().height = (View.MeasureSpec.getSize(i11) - AndroidUtilities.dp(6.0f)) - this.T;
            if (i4Var.getLayoutParams().height < View.MeasureSpec.getSize(i11) * 0.5f) {
                i4Var.getLayoutParams().height = (int) (View.MeasureSpec.getSize(i11) * 0.5f);
            }
            i4Var.getLayoutParams().width = -1;
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = View.MeasureSpec.getSize(i11) - i4Var.getLayoutParams().height;
        }
        int size = (View.MeasureSpec.getSize(i11) + View.MeasureSpec.getSize(i10)) << 16;
        if (this.U != size) {
            for (int i13 = 0; i13 < this.r.previewMessages.size(); i13++) {
                MessageObject messageObject = this.r.previewMessages.get(i13);
                messageObject.parentWidth = xb0Var.v ? i4Var.getLayoutParams().width : View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(16.0f);
                messageObject.resetLayout();
                messageObject.forceUpdate = true;
                qb0 qb0Var = this.n;
                if (qb0Var != null) {
                    qb0Var.l();
                }
            }
            this.H = true;
        }
        this.U = size;
        super.onMeasure(i10, i11);
    }
}
