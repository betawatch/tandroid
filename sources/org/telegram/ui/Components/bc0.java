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
import android.view.ViewOutlineProvider;
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
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class bc0 extends FrameLayout {
    public final gc0 E;
    public final FrameLayout F;
    public final gc0 G;
    public final gc0 H;
    public final int I;
    public final ChatMessageSharedResources J;
    public boolean K;
    public int L;
    public int M;
    public boolean N;
    public boolean O;
    public AnimatorSet P;
    public final Rect Q;
    public int R;
    public float S;
    public int T;
    public boolean U;
    public boolean V;
    public int W;
    public final int a;
    public int a0;
    public final org.telegram.ui.w8 b;
    public boolean b0;
    public final ci.m6 c;
    public final /* synthetic */ hc0 c0;
    public final org.telegram.ui.Cells.ca d;
    public final tb0 e;
    public final ub0 f;
    public final wb0 h;
    public final ac0 n;
    public MessagePreviewParams.Messages r;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout s;
    public final sb0 v;
    public final sb0 w;
    public final org.telegram.ui.ActionBar.e1 x;
    public final org.telegram.ui.ActionBar.e1 y;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [android.graphics.drawable.Drawable, boolean[]] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r13v7, types: [android.view.View, org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout] */
    /* JADX WARN: Type inference failed for: r2v66, types: [android.view.View, org.telegram.ui.ActionBar.e1] */
    /* JADX WARN: Type inference failed for: r2v67, types: [android.view.View, org.telegram.ui.ActionBar.e1] */
    /* JADX WARN: Type inference failed for: r2v73, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r2v74, types: [android.view.View, org.telegram.ui.ActionBar.e1] */
    /* JADX WARN: Type inference failed for: r2v75, types: [android.view.View, org.telegram.ui.ActionBar.e1] */
    /* JADX WARN: Type inference failed for: r33v0, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout, java.lang.Object, org.telegram.ui.Components.bc0] */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.view.View, android.view.ViewGroup, org.telegram.ui.Components.cw0, org.telegram.ui.w8] */
    /* JADX WARN: Type inference failed for: r3v6, types: [ah.c] */
    /* JADX WARN: Type inference failed for: r9v8, types: [android.view.ViewGroup] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public bc0(hc0 hc0Var, Context context, int i10) {
        super(r4);
        MessagePreviewParams messagePreviewParams;
        Context context2;
        bc0 bc0Var;
        boolean z10;
        gc0 gc0Var;
        gc0 gc0Var2;
        ViewOutlineProvider viewOutlineProvider;
        bc0 bc0Var2;
        MessagePreviewParams.Messages messages;
        ?? r11;
        MessagePreviewParams messagePreviewParams2;
        LinearLayout linearLayout;
        Drawable drawable;
        MessagePreviewParams messagePreviewParams3;
        boolean z11;
        Context context3 = context;
        this.c0 = hc0Var;
        int i11 = 1;
        this.K = true;
        this.L = -1;
        this.M = -1;
        final int i12 = 0;
        this.N = false;
        this.Q = new Rect();
        this.U = false;
        this.b0 = true;
        this.J = new ChatMessageSharedResources(context3);
        this.a = i10;
        setOnTouchListener(new xr(this, 4));
        ?? w8Var = new org.telegram.ui.w8(this, context3, i11);
        this.b = w8Var;
        dc0 dc0Var = hc0Var.F;
        boolean z12 = hc0Var.b;
        MessagePreviewParams messagePreviewParams4 = hc0Var.d;
        Drawable d = ((org.telegram.ui.un) dc0Var).d();
        if (((org.telegram.ui.un) dc0Var).f == null) {
            int i13 = org.telegram.ui.ActionBar.h6.a;
        }
        w8Var.V(d);
        w8Var.setOccupyStatusBar(false);
        int i14 = 3;
        w8Var.setOutlineProvider(new ch.b(this, i14));
        w8Var.setClipToOutline(true);
        w8Var.setElevation(AndroidUtilities.dp(4.0f));
        ci.m6 m6Var = new ci.m6(context3, 11, dc0Var);
        this.c = m6Var;
        m6Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.s8, dc0Var));
        tb0 tb0Var = new tb0(this);
        this.e = tb0Var;
        tb0Var.D = new ai.s3(this, i14);
        ub0 ub0Var = new ub0(this, context3, dc0Var);
        this.f = ub0Var;
        wb0 wb0Var = new wb0(this, ub0Var, dc0Var);
        this.h = wb0Var;
        ub0Var.setItemAnimator(wb0Var);
        ub0Var.setOnScrollListener(new ai.r(this, 29));
        ub0Var.setOnItemClickListener(new xb0(this));
        ac0 ac0Var = new ac0(this);
        this.n = ac0Var;
        ub0Var.setAdapter(ac0Var);
        ub0Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        pb0 pb0Var = new pb0(this);
        pb0Var.O = new qb0(this);
        ub0Var.setClipToPadding(false);
        ub0Var.setLayoutManager(pb0Var);
        ub0Var.i(new rb0());
        w8Var.addView(ub0Var);
        addView(w8Var, w7.y5.d(-1, 400.0f, 0, 8.0f, 0.0f, 8.0f, 0.0f));
        w8Var.addView(m6Var, w7.y5.c(-2.0f, -1));
        ?? actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert2, 1, getContext(), dc0Var);
        this.s = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().setOnForegroundOpenFinished(new nb0(this, i11));
        ch.d c10 = hc0Var.G.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, false);
        c10.o(eh.b.k(dc0Var));
        c10.p(AndroidUtilities.dp(8.0f));
        c10.j.e = true;
        c10.q(AndroidUtilities.dp(12.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c10);
        addView(actionBarPopupWindow$ActionBarPopupWindowLayout, w7.y5.c(-2.0f, -2));
        if (i10 != 0 || (messages = messagePreviewParams4.replyMessage) == null) {
            messagePreviewParams = messagePreviewParams4;
            if (i10 != 1 || messagePreviewParams.forwardMessages == null) {
                final bc0 bc0Var3 = this;
                bc0Var = bc0Var3;
                if (i10 == 2) {
                    bc0Var = bc0Var3;
                    if (messagePreviewParams.linkMessage != null) {
                        gc0 gc0Var3 = new gc0(context, R.raw.position_below, LocaleController.getString(R.string.LinkAbove), R.raw.position_above, LocaleController.getString(R.string.LinkBelow), hc0Var.F);
                        bc0Var3.E = gc0Var3;
                        gc0Var3.a(!messagePreviewParams.webpageTop, false);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(gc0Var3, w7.y5.n(-1, 48));
                        FrameLayout frameLayout = new FrameLayout(context);
                        bc0Var3.F = frameLayout;
                        frameLayout.setBackground(org.telegram.ui.ActionBar.h6.Y(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.I5, dc0Var), 0, 0));
                        gc0 gc0Var4 = new gc0(context, R.raw.media_shrink, LocaleController.getString(R.string.LinkMediaLarger), R.raw.media_enlarge, LocaleController.getString(R.string.LinkMediaSmaller), hc0Var.F);
                        bc0Var3.G = gc0Var4;
                        gc0Var4.setBackground(null);
                        gc0Var4.setVisibility(messagePreviewParams.isVideo ? 4 : 0);
                        frameLayout.addView(gc0Var4, w7.y5.n(-1, 48));
                        gc0 gc0Var5 = new gc0(context, R.raw.media_shrink, LocaleController.getString(R.string.LinkVideoLarger), R.raw.media_enlarge, LocaleController.getString(R.string.LinkVideoSmaller), hc0Var.F);
                        bc0Var3.H = gc0Var5;
                        gc0Var5.setBackground(null);
                        gc0Var5.setVisibility(!messagePreviewParams.isVideo ? 4 : 0);
                        frameLayout.setAlpha(messagePreviewParams.hasMedia ? 1.0f : 0.5f);
                        frameLayout.addView(gc0Var5, w7.y5.n(-1, 48));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, w7.y5.n(-1, 48));
                        frameLayout.setVisibility((!messagePreviewParams.singleLink || messagePreviewParams.hasMedia) ? 0 : 8);
                        gc0Var4.a(messagePreviewParams.webpageSmall, false);
                        gc0Var5.a(messagePreviewParams.webpageSmall, false);
                        org.telegram.ui.ActionBar.j1 j1Var = new org.telegram.ui.ActionBar.j1(context, dc0Var);
                        j1Var.setColor(org.telegram.ui.ActionBar.h6.l1(0.06f, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.E8, dc0Var)));
                        j1Var.setTag(R.id.fit_width_tag, 1);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(j1Var, w7.y5.n(-1, 8));
                        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(1, context, hc0Var.F, false, false);
                        e1Var.g(LocaleController.getString(R.string.ApplyChanges), R.drawable.msg_select, null);
                        final int i15 = 10;
                        e1Var.setOnClickListener(new View.OnClickListener(bc0Var3) { // from class: org.telegram.ui.Components.lb0
                            public final /* synthetic */ bc0 b;

                            {
                                this.b = bc0Var3;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i16;
                                TLRPC.Message message;
                                TLRPC.MessageMedia messageMedia;
                                TLRPC.Message message2;
                                TLRPC.MessageMedia messageMedia2;
                                TLRPC.Message message3;
                                TLRPC.Message message4;
                                switch (i15) {
                                    case 0:
                                        bc0 bc0Var4 = this.b;
                                        bc0Var4.c0.d.quote = null;
                                        bc0Var4.e.f(false);
                                        bc0Var4.g(false, false);
                                        bc0Var4.s.getSwipeBack().b(true);
                                        break;
                                    case 1:
                                        bc0 bc0Var5 = this.b;
                                        tb0 tb0Var2 = bc0Var5.e;
                                        hc0 hc0Var2 = bc0Var5.c0;
                                        if (bc0Var5.c(null) != null) {
                                            if (tb0Var2.v - tb0Var2.u <= MessagesController.getInstance(hc0Var2.w).quoteLengthMax) {
                                                org.telegram.ui.Cells.y9 y9Var = tb0Var2.W;
                                                MessageObject c11 = bc0Var5.c(y9Var != null ? ((org.telegram.ui.Cells.u1) y9Var).getMessageObject() : null);
                                                MessagePreviewParams messagePreviewParams5 = hc0Var2.d;
                                                int i17 = tb0Var2.u;
                                                messagePreviewParams5.quoteStart = i17;
                                                int i18 = tb0Var2.v;
                                                messagePreviewParams5.quoteEnd = i18;
                                                messagePreviewParams5.quote = org.telegram.ui.mn.b(i17, i18, c11);
                                                hc0Var2.b();
                                                hc0Var2.a(true);
                                                break;
                                            } else {
                                                bc0Var5.f();
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        bc0 bc0Var6 = this.b;
                                        tb0 tb0Var3 = bc0Var6.e;
                                        hc0 hc0Var3 = bc0Var6.c0;
                                        MessagePreviewParams messagePreviewParams6 = hc0Var3.d;
                                        int i19 = hc0Var3.w;
                                        boolean z13 = hc0Var3.b;
                                        if (messagePreviewParams6.quote != null && !z13) {
                                            messagePreviewParams6.quote = null;
                                            tb0Var3.f(false);
                                            bc0Var6.g(false, true);
                                            bc0Var6.k(true);
                                            break;
                                        } else if (tb0Var3.v - tb0Var3.u <= MessagesController.getInstance(i19).quoteLengthMax) {
                                            MessageObject c12 = bc0Var6.c(null);
                                            if (c12 != null) {
                                                if (!tb0Var3.y()) {
                                                    messagePreviewParams6.quoteStart = 0;
                                                    int min = Math.min(MessagesController.getInstance(i19).quoteLengthMax, c12.messageOwner.message.length());
                                                    messagePreviewParams6.quoteEnd = min;
                                                    messagePreviewParams6.quote = org.telegram.ui.mn.b(messagePreviewParams6.quoteStart, min, c12);
                                                    View d10 = bc0Var6.d();
                                                    if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                        tb0Var3.a0((org.telegram.ui.Cells.u1) d10, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                                    }
                                                    if (!z13) {
                                                        bc0Var6.s.getSwipeBack().e(bc0Var6.I);
                                                    }
                                                    bc0Var6.g(true, true);
                                                    break;
                                                } else {
                                                    messagePreviewParams6.quoteStart = tb0Var3.u;
                                                    messagePreviewParams6.quoteEnd = tb0Var3.v;
                                                    org.telegram.ui.Cells.y9 y9Var2 = tb0Var3.W;
                                                    messagePreviewParams6.quote = org.telegram.ui.mn.b(messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd, bc0Var6.c(y9Var2 != null ? ((org.telegram.ui.Cells.u1) y9Var2).getMessageObject() : null));
                                                    hc0Var3.b();
                                                    hc0Var3.a(true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            bc0Var6.f();
                                            break;
                                        }
                                        break;
                                    case 3:
                                        this.b.c0.c(false);
                                        break;
                                    case 4:
                                        this.b.c0.c(false);
                                        break;
                                    case 5:
                                        this.b.c0.a(true);
                                        break;
                                    case 6:
                                        hc0 hc0Var4 = this.b.c0;
                                        if (!hc0Var4.b) {
                                            org.telegram.ui.el elVar = (org.telegram.ui.el) hc0Var4;
                                            elVar.a(true);
                                            org.telegram.ui.wn wnVar = elVar.H;
                                            wnVar.n5 = null;
                                            wnVar.l5 = null;
                                            wnVar.f5.updateReply(null, null, wnVar.T5, null);
                                            wnVar.j8();
                                            break;
                                        } else {
                                            org.telegram.ui.el elVar2 = (org.telegram.ui.el) hc0Var4;
                                            elVar2.a(true);
                                            org.telegram.ui.wn wnVar2 = elVar2.H;
                                            wnVar2.l5 = null;
                                            wnVar2.Bb(wnVar2.n5);
                                            break;
                                        }
                                    case 7:
                                        this.b.c0.c(true);
                                        break;
                                    case 8:
                                        this.b.c0.a(true);
                                        break;
                                    case 9:
                                        org.telegram.ui.el elVar3 = (org.telegram.ui.el) this.b.c0;
                                        elVar3.a(true);
                                        org.telegram.ui.wn wnVar3 = elVar3.H;
                                        wnVar3.f5.updateForward(null, wnVar3.T5);
                                        wnVar3.j8();
                                        break;
                                    case 10:
                                        this.b.c0.a(true);
                                        break;
                                    case 11:
                                        org.telegram.ui.el elVar4 = (org.telegram.ui.el) this.b.c0;
                                        elVar4.a(true);
                                        org.telegram.ui.wn wnVar4 = elVar4.H;
                                        wnVar4.G5 = null;
                                        org.telegram.ui.jk jkVar = wnVar4.Y;
                                        if (jkVar != null) {
                                            jkVar.X2 = null;
                                            jkVar.Y2 = false;
                                        }
                                        MessagePreviewParams messagePreviewParams7 = wnVar4.f5;
                                        if (messagePreviewParams7 != null) {
                                            i16 = ((org.telegram.ui.ActionBar.m2) wnVar4).currentAccount;
                                            MessageObject messageObject = wnVar4.n5;
                                            messagePreviewParams7.updateLink(i16, null, null, messageObject == wnVar4.X3 ? null : messageObject, wnVar4.l5, wnVar4.p5);
                                        }
                                        wnVar4.j8();
                                        break;
                                    case 12:
                                        bc0 bc0Var7 = this.b;
                                        MessagePreviewParams messagePreviewParams8 = bc0Var7.c0.d;
                                        if (messagePreviewParams8.hasMedia) {
                                            boolean z14 = !messagePreviewParams8.webpageSmall;
                                            messagePreviewParams8.webpageSmall = z14;
                                            bc0Var7.G.a(z14, true);
                                            bc0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                            if (bc0Var7.r.messages.size() > 0 && (message2 = bc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                                boolean z15 = messagePreviewParams8.webpageSmall;
                                                messageMedia2.force_small_media = z15;
                                                messageMedia2.force_large_media = !z15;
                                            }
                                            if (bc0Var7.r.previewMessages.size() > 0 && (message = bc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                                boolean z16 = messagePreviewParams8.webpageSmall;
                                                messageMedia.force_small_media = z16;
                                                messageMedia.force_large_media = !z16;
                                            }
                                            bc0Var7.h();
                                            bc0Var7.U = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        bc0 bc0Var8 = this.b;
                                        MessagePreviewParams messagePreviewParams9 = bc0Var8.c0.d;
                                        boolean z17 = messagePreviewParams9.webpageTop;
                                        messagePreviewParams9.webpageTop = !z17;
                                        bc0Var8.E.a(z17, true);
                                        if (bc0Var8.r.messages.size() > 0 && (message4 = bc0Var8.r.messages.get(0).messageOwner) != null) {
                                            message4.invert_media = messagePreviewParams9.webpageTop;
                                        }
                                        if (bc0Var8.r.previewMessages.size() > 0 && (message3 = bc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                            message3.invert_media = messagePreviewParams9.webpageTop;
                                        }
                                        bc0Var8.h();
                                        bc0Var8.U = true;
                                        break;
                                }
                            }
                        });
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var, w7.y5.n(-1, 48));
                        org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(1, context, hc0Var.F, false, true);
                        context2 = context;
                        e1Var2.g(LocaleController.getString(R.string.DoNotLinkPreview), R.drawable.msg_delete, null);
                        int v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.q7, dc0Var);
                        int i16 = org.telegram.ui.ActionBar.h6.p7;
                        e1Var2.c(v02, org.telegram.ui.ActionBar.h6.v0(i16, dc0Var));
                        final int i17 = 11;
                        e1Var2.setOnClickListener(new View.OnClickListener(bc0Var3) { // from class: org.telegram.ui.Components.lb0
                            public final /* synthetic */ bc0 b;

                            {
                                this.b = bc0Var3;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i162;
                                TLRPC.Message message;
                                TLRPC.MessageMedia messageMedia;
                                TLRPC.Message message2;
                                TLRPC.MessageMedia messageMedia2;
                                TLRPC.Message message3;
                                TLRPC.Message message4;
                                switch (i17) {
                                    case 0:
                                        bc0 bc0Var4 = this.b;
                                        bc0Var4.c0.d.quote = null;
                                        bc0Var4.e.f(false);
                                        bc0Var4.g(false, false);
                                        bc0Var4.s.getSwipeBack().b(true);
                                        break;
                                    case 1:
                                        bc0 bc0Var5 = this.b;
                                        tb0 tb0Var2 = bc0Var5.e;
                                        hc0 hc0Var2 = bc0Var5.c0;
                                        if (bc0Var5.c(null) != null) {
                                            if (tb0Var2.v - tb0Var2.u <= MessagesController.getInstance(hc0Var2.w).quoteLengthMax) {
                                                org.telegram.ui.Cells.y9 y9Var = tb0Var2.W;
                                                MessageObject c11 = bc0Var5.c(y9Var != null ? ((org.telegram.ui.Cells.u1) y9Var).getMessageObject() : null);
                                                MessagePreviewParams messagePreviewParams5 = hc0Var2.d;
                                                int i172 = tb0Var2.u;
                                                messagePreviewParams5.quoteStart = i172;
                                                int i18 = tb0Var2.v;
                                                messagePreviewParams5.quoteEnd = i18;
                                                messagePreviewParams5.quote = org.telegram.ui.mn.b(i172, i18, c11);
                                                hc0Var2.b();
                                                hc0Var2.a(true);
                                                break;
                                            } else {
                                                bc0Var5.f();
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        bc0 bc0Var6 = this.b;
                                        tb0 tb0Var3 = bc0Var6.e;
                                        hc0 hc0Var3 = bc0Var6.c0;
                                        MessagePreviewParams messagePreviewParams6 = hc0Var3.d;
                                        int i19 = hc0Var3.w;
                                        boolean z13 = hc0Var3.b;
                                        if (messagePreviewParams6.quote != null && !z13) {
                                            messagePreviewParams6.quote = null;
                                            tb0Var3.f(false);
                                            bc0Var6.g(false, true);
                                            bc0Var6.k(true);
                                            break;
                                        } else if (tb0Var3.v - tb0Var3.u <= MessagesController.getInstance(i19).quoteLengthMax) {
                                            MessageObject c12 = bc0Var6.c(null);
                                            if (c12 != null) {
                                                if (!tb0Var3.y()) {
                                                    messagePreviewParams6.quoteStart = 0;
                                                    int min = Math.min(MessagesController.getInstance(i19).quoteLengthMax, c12.messageOwner.message.length());
                                                    messagePreviewParams6.quoteEnd = min;
                                                    messagePreviewParams6.quote = org.telegram.ui.mn.b(messagePreviewParams6.quoteStart, min, c12);
                                                    View d10 = bc0Var6.d();
                                                    if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                        tb0Var3.a0((org.telegram.ui.Cells.u1) d10, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                                    }
                                                    if (!z13) {
                                                        bc0Var6.s.getSwipeBack().e(bc0Var6.I);
                                                    }
                                                    bc0Var6.g(true, true);
                                                    break;
                                                } else {
                                                    messagePreviewParams6.quoteStart = tb0Var3.u;
                                                    messagePreviewParams6.quoteEnd = tb0Var3.v;
                                                    org.telegram.ui.Cells.y9 y9Var2 = tb0Var3.W;
                                                    messagePreviewParams6.quote = org.telegram.ui.mn.b(messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd, bc0Var6.c(y9Var2 != null ? ((org.telegram.ui.Cells.u1) y9Var2).getMessageObject() : null));
                                                    hc0Var3.b();
                                                    hc0Var3.a(true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            bc0Var6.f();
                                            break;
                                        }
                                        break;
                                    case 3:
                                        this.b.c0.c(false);
                                        break;
                                    case 4:
                                        this.b.c0.c(false);
                                        break;
                                    case 5:
                                        this.b.c0.a(true);
                                        break;
                                    case 6:
                                        hc0 hc0Var4 = this.b.c0;
                                        if (!hc0Var4.b) {
                                            org.telegram.ui.el elVar = (org.telegram.ui.el) hc0Var4;
                                            elVar.a(true);
                                            org.telegram.ui.wn wnVar = elVar.H;
                                            wnVar.n5 = null;
                                            wnVar.l5 = null;
                                            wnVar.f5.updateReply(null, null, wnVar.T5, null);
                                            wnVar.j8();
                                            break;
                                        } else {
                                            org.telegram.ui.el elVar2 = (org.telegram.ui.el) hc0Var4;
                                            elVar2.a(true);
                                            org.telegram.ui.wn wnVar2 = elVar2.H;
                                            wnVar2.l5 = null;
                                            wnVar2.Bb(wnVar2.n5);
                                            break;
                                        }
                                    case 7:
                                        this.b.c0.c(true);
                                        break;
                                    case 8:
                                        this.b.c0.a(true);
                                        break;
                                    case 9:
                                        org.telegram.ui.el elVar3 = (org.telegram.ui.el) this.b.c0;
                                        elVar3.a(true);
                                        org.telegram.ui.wn wnVar3 = elVar3.H;
                                        wnVar3.f5.updateForward(null, wnVar3.T5);
                                        wnVar3.j8();
                                        break;
                                    case 10:
                                        this.b.c0.a(true);
                                        break;
                                    case 11:
                                        org.telegram.ui.el elVar4 = (org.telegram.ui.el) this.b.c0;
                                        elVar4.a(true);
                                        org.telegram.ui.wn wnVar4 = elVar4.H;
                                        wnVar4.G5 = null;
                                        org.telegram.ui.jk jkVar = wnVar4.Y;
                                        if (jkVar != null) {
                                            jkVar.X2 = null;
                                            jkVar.Y2 = false;
                                        }
                                        MessagePreviewParams messagePreviewParams7 = wnVar4.f5;
                                        if (messagePreviewParams7 != null) {
                                            i162 = ((org.telegram.ui.ActionBar.m2) wnVar4).currentAccount;
                                            MessageObject messageObject = wnVar4.n5;
                                            messagePreviewParams7.updateLink(i162, null, null, messageObject == wnVar4.X3 ? null : messageObject, wnVar4.l5, wnVar4.p5);
                                        }
                                        wnVar4.j8();
                                        break;
                                    case 12:
                                        bc0 bc0Var7 = this.b;
                                        MessagePreviewParams messagePreviewParams8 = bc0Var7.c0.d;
                                        if (messagePreviewParams8.hasMedia) {
                                            boolean z14 = !messagePreviewParams8.webpageSmall;
                                            messagePreviewParams8.webpageSmall = z14;
                                            bc0Var7.G.a(z14, true);
                                            bc0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                            if (bc0Var7.r.messages.size() > 0 && (message2 = bc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                                boolean z15 = messagePreviewParams8.webpageSmall;
                                                messageMedia2.force_small_media = z15;
                                                messageMedia2.force_large_media = !z15;
                                            }
                                            if (bc0Var7.r.previewMessages.size() > 0 && (message = bc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                                boolean z16 = messagePreviewParams8.webpageSmall;
                                                messageMedia.force_small_media = z16;
                                                messageMedia.force_large_media = !z16;
                                            }
                                            bc0Var7.h();
                                            bc0Var7.U = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        bc0 bc0Var8 = this.b;
                                        MessagePreviewParams messagePreviewParams9 = bc0Var8.c0.d;
                                        boolean z17 = messagePreviewParams9.webpageTop;
                                        messagePreviewParams9.webpageTop = !z17;
                                        bc0Var8.E.a(z17, true);
                                        if (bc0Var8.r.messages.size() > 0 && (message4 = bc0Var8.r.messages.get(0).messageOwner) != null) {
                                            message4.invert_media = messagePreviewParams9.webpageTop;
                                        }
                                        if (bc0Var8.r.previewMessages.size() > 0 && (message3 = bc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                            message3.invert_media = messagePreviewParams9.webpageTop;
                                        }
                                        bc0Var8.h();
                                        bc0Var8.U = true;
                                        break;
                                }
                            }
                        });
                        e1Var2.setSelectorColor(org.telegram.ui.ActionBar.h6.l1(0.12f, org.telegram.ui.ActionBar.h6.w0(null, i16, false)));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var2, w7.y5.n(-1, 48));
                        final int i18 = 12;
                        frameLayout.setOnClickListener(new View.OnClickListener(bc0Var3) { // from class: org.telegram.ui.Components.lb0
                            public final /* synthetic */ bc0 b;

                            {
                                this.b = bc0Var3;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i162;
                                TLRPC.Message message;
                                TLRPC.MessageMedia messageMedia;
                                TLRPC.Message message2;
                                TLRPC.MessageMedia messageMedia2;
                                TLRPC.Message message3;
                                TLRPC.Message message4;
                                switch (i18) {
                                    case 0:
                                        bc0 bc0Var4 = this.b;
                                        bc0Var4.c0.d.quote = null;
                                        bc0Var4.e.f(false);
                                        bc0Var4.g(false, false);
                                        bc0Var4.s.getSwipeBack().b(true);
                                        break;
                                    case 1:
                                        bc0 bc0Var5 = this.b;
                                        tb0 tb0Var2 = bc0Var5.e;
                                        hc0 hc0Var2 = bc0Var5.c0;
                                        if (bc0Var5.c(null) != null) {
                                            if (tb0Var2.v - tb0Var2.u <= MessagesController.getInstance(hc0Var2.w).quoteLengthMax) {
                                                org.telegram.ui.Cells.y9 y9Var = tb0Var2.W;
                                                MessageObject c11 = bc0Var5.c(y9Var != null ? ((org.telegram.ui.Cells.u1) y9Var).getMessageObject() : null);
                                                MessagePreviewParams messagePreviewParams5 = hc0Var2.d;
                                                int i172 = tb0Var2.u;
                                                messagePreviewParams5.quoteStart = i172;
                                                int i182 = tb0Var2.v;
                                                messagePreviewParams5.quoteEnd = i182;
                                                messagePreviewParams5.quote = org.telegram.ui.mn.b(i172, i182, c11);
                                                hc0Var2.b();
                                                hc0Var2.a(true);
                                                break;
                                            } else {
                                                bc0Var5.f();
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        bc0 bc0Var6 = this.b;
                                        tb0 tb0Var3 = bc0Var6.e;
                                        hc0 hc0Var3 = bc0Var6.c0;
                                        MessagePreviewParams messagePreviewParams6 = hc0Var3.d;
                                        int i19 = hc0Var3.w;
                                        boolean z13 = hc0Var3.b;
                                        if (messagePreviewParams6.quote != null && !z13) {
                                            messagePreviewParams6.quote = null;
                                            tb0Var3.f(false);
                                            bc0Var6.g(false, true);
                                            bc0Var6.k(true);
                                            break;
                                        } else if (tb0Var3.v - tb0Var3.u <= MessagesController.getInstance(i19).quoteLengthMax) {
                                            MessageObject c12 = bc0Var6.c(null);
                                            if (c12 != null) {
                                                if (!tb0Var3.y()) {
                                                    messagePreviewParams6.quoteStart = 0;
                                                    int min = Math.min(MessagesController.getInstance(i19).quoteLengthMax, c12.messageOwner.message.length());
                                                    messagePreviewParams6.quoteEnd = min;
                                                    messagePreviewParams6.quote = org.telegram.ui.mn.b(messagePreviewParams6.quoteStart, min, c12);
                                                    View d10 = bc0Var6.d();
                                                    if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                        tb0Var3.a0((org.telegram.ui.Cells.u1) d10, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                                    }
                                                    if (!z13) {
                                                        bc0Var6.s.getSwipeBack().e(bc0Var6.I);
                                                    }
                                                    bc0Var6.g(true, true);
                                                    break;
                                                } else {
                                                    messagePreviewParams6.quoteStart = tb0Var3.u;
                                                    messagePreviewParams6.quoteEnd = tb0Var3.v;
                                                    org.telegram.ui.Cells.y9 y9Var2 = tb0Var3.W;
                                                    messagePreviewParams6.quote = org.telegram.ui.mn.b(messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd, bc0Var6.c(y9Var2 != null ? ((org.telegram.ui.Cells.u1) y9Var2).getMessageObject() : null));
                                                    hc0Var3.b();
                                                    hc0Var3.a(true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            bc0Var6.f();
                                            break;
                                        }
                                        break;
                                    case 3:
                                        this.b.c0.c(false);
                                        break;
                                    case 4:
                                        this.b.c0.c(false);
                                        break;
                                    case 5:
                                        this.b.c0.a(true);
                                        break;
                                    case 6:
                                        hc0 hc0Var4 = this.b.c0;
                                        if (!hc0Var4.b) {
                                            org.telegram.ui.el elVar = (org.telegram.ui.el) hc0Var4;
                                            elVar.a(true);
                                            org.telegram.ui.wn wnVar = elVar.H;
                                            wnVar.n5 = null;
                                            wnVar.l5 = null;
                                            wnVar.f5.updateReply(null, null, wnVar.T5, null);
                                            wnVar.j8();
                                            break;
                                        } else {
                                            org.telegram.ui.el elVar2 = (org.telegram.ui.el) hc0Var4;
                                            elVar2.a(true);
                                            org.telegram.ui.wn wnVar2 = elVar2.H;
                                            wnVar2.l5 = null;
                                            wnVar2.Bb(wnVar2.n5);
                                            break;
                                        }
                                    case 7:
                                        this.b.c0.c(true);
                                        break;
                                    case 8:
                                        this.b.c0.a(true);
                                        break;
                                    case 9:
                                        org.telegram.ui.el elVar3 = (org.telegram.ui.el) this.b.c0;
                                        elVar3.a(true);
                                        org.telegram.ui.wn wnVar3 = elVar3.H;
                                        wnVar3.f5.updateForward(null, wnVar3.T5);
                                        wnVar3.j8();
                                        break;
                                    case 10:
                                        this.b.c0.a(true);
                                        break;
                                    case 11:
                                        org.telegram.ui.el elVar4 = (org.telegram.ui.el) this.b.c0;
                                        elVar4.a(true);
                                        org.telegram.ui.wn wnVar4 = elVar4.H;
                                        wnVar4.G5 = null;
                                        org.telegram.ui.jk jkVar = wnVar4.Y;
                                        if (jkVar != null) {
                                            jkVar.X2 = null;
                                            jkVar.Y2 = false;
                                        }
                                        MessagePreviewParams messagePreviewParams7 = wnVar4.f5;
                                        if (messagePreviewParams7 != null) {
                                            i162 = ((org.telegram.ui.ActionBar.m2) wnVar4).currentAccount;
                                            MessageObject messageObject = wnVar4.n5;
                                            messagePreviewParams7.updateLink(i162, null, null, messageObject == wnVar4.X3 ? null : messageObject, wnVar4.l5, wnVar4.p5);
                                        }
                                        wnVar4.j8();
                                        break;
                                    case 12:
                                        bc0 bc0Var7 = this.b;
                                        MessagePreviewParams messagePreviewParams8 = bc0Var7.c0.d;
                                        if (messagePreviewParams8.hasMedia) {
                                            boolean z14 = !messagePreviewParams8.webpageSmall;
                                            messagePreviewParams8.webpageSmall = z14;
                                            bc0Var7.G.a(z14, true);
                                            bc0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                            if (bc0Var7.r.messages.size() > 0 && (message2 = bc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                                boolean z15 = messagePreviewParams8.webpageSmall;
                                                messageMedia2.force_small_media = z15;
                                                messageMedia2.force_large_media = !z15;
                                            }
                                            if (bc0Var7.r.previewMessages.size() > 0 && (message = bc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                                boolean z16 = messagePreviewParams8.webpageSmall;
                                                messageMedia.force_small_media = z16;
                                                messageMedia.force_large_media = !z16;
                                            }
                                            bc0Var7.h();
                                            bc0Var7.U = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        bc0 bc0Var8 = this.b;
                                        MessagePreviewParams messagePreviewParams9 = bc0Var8.c0.d;
                                        boolean z17 = messagePreviewParams9.webpageTop;
                                        messagePreviewParams9.webpageTop = !z17;
                                        bc0Var8.E.a(z17, true);
                                        if (bc0Var8.r.messages.size() > 0 && (message4 = bc0Var8.r.messages.get(0).messageOwner) != null) {
                                            message4.invert_media = messagePreviewParams9.webpageTop;
                                        }
                                        if (bc0Var8.r.previewMessages.size() > 0 && (message3 = bc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                            message3.invert_media = messagePreviewParams9.webpageTop;
                                        }
                                        bc0Var8.h();
                                        bc0Var8.U = true;
                                        break;
                                }
                            }
                        });
                        final int i19 = 13;
                        gc0Var3.setOnClickListener(new View.OnClickListener(bc0Var3) { // from class: org.telegram.ui.Components.lb0
                            public final /* synthetic */ bc0 b;

                            {
                                this.b = bc0Var3;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i162;
                                TLRPC.Message message;
                                TLRPC.MessageMedia messageMedia;
                                TLRPC.Message message2;
                                TLRPC.MessageMedia messageMedia2;
                                TLRPC.Message message3;
                                TLRPC.Message message4;
                                switch (i19) {
                                    case 0:
                                        bc0 bc0Var4 = this.b;
                                        bc0Var4.c0.d.quote = null;
                                        bc0Var4.e.f(false);
                                        bc0Var4.g(false, false);
                                        bc0Var4.s.getSwipeBack().b(true);
                                        break;
                                    case 1:
                                        bc0 bc0Var5 = this.b;
                                        tb0 tb0Var2 = bc0Var5.e;
                                        hc0 hc0Var2 = bc0Var5.c0;
                                        if (bc0Var5.c(null) != null) {
                                            if (tb0Var2.v - tb0Var2.u <= MessagesController.getInstance(hc0Var2.w).quoteLengthMax) {
                                                org.telegram.ui.Cells.y9 y9Var = tb0Var2.W;
                                                MessageObject c11 = bc0Var5.c(y9Var != null ? ((org.telegram.ui.Cells.u1) y9Var).getMessageObject() : null);
                                                MessagePreviewParams messagePreviewParams5 = hc0Var2.d;
                                                int i172 = tb0Var2.u;
                                                messagePreviewParams5.quoteStart = i172;
                                                int i182 = tb0Var2.v;
                                                messagePreviewParams5.quoteEnd = i182;
                                                messagePreviewParams5.quote = org.telegram.ui.mn.b(i172, i182, c11);
                                                hc0Var2.b();
                                                hc0Var2.a(true);
                                                break;
                                            } else {
                                                bc0Var5.f();
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        bc0 bc0Var6 = this.b;
                                        tb0 tb0Var3 = bc0Var6.e;
                                        hc0 hc0Var3 = bc0Var6.c0;
                                        MessagePreviewParams messagePreviewParams6 = hc0Var3.d;
                                        int i192 = hc0Var3.w;
                                        boolean z13 = hc0Var3.b;
                                        if (messagePreviewParams6.quote != null && !z13) {
                                            messagePreviewParams6.quote = null;
                                            tb0Var3.f(false);
                                            bc0Var6.g(false, true);
                                            bc0Var6.k(true);
                                            break;
                                        } else if (tb0Var3.v - tb0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                            MessageObject c12 = bc0Var6.c(null);
                                            if (c12 != null) {
                                                if (!tb0Var3.y()) {
                                                    messagePreviewParams6.quoteStart = 0;
                                                    int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                                    messagePreviewParams6.quoteEnd = min;
                                                    messagePreviewParams6.quote = org.telegram.ui.mn.b(messagePreviewParams6.quoteStart, min, c12);
                                                    View d10 = bc0Var6.d();
                                                    if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                        tb0Var3.a0((org.telegram.ui.Cells.u1) d10, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                                    }
                                                    if (!z13) {
                                                        bc0Var6.s.getSwipeBack().e(bc0Var6.I);
                                                    }
                                                    bc0Var6.g(true, true);
                                                    break;
                                                } else {
                                                    messagePreviewParams6.quoteStart = tb0Var3.u;
                                                    messagePreviewParams6.quoteEnd = tb0Var3.v;
                                                    org.telegram.ui.Cells.y9 y9Var2 = tb0Var3.W;
                                                    messagePreviewParams6.quote = org.telegram.ui.mn.b(messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd, bc0Var6.c(y9Var2 != null ? ((org.telegram.ui.Cells.u1) y9Var2).getMessageObject() : null));
                                                    hc0Var3.b();
                                                    hc0Var3.a(true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            bc0Var6.f();
                                            break;
                                        }
                                        break;
                                    case 3:
                                        this.b.c0.c(false);
                                        break;
                                    case 4:
                                        this.b.c0.c(false);
                                        break;
                                    case 5:
                                        this.b.c0.a(true);
                                        break;
                                    case 6:
                                        hc0 hc0Var4 = this.b.c0;
                                        if (!hc0Var4.b) {
                                            org.telegram.ui.el elVar = (org.telegram.ui.el) hc0Var4;
                                            elVar.a(true);
                                            org.telegram.ui.wn wnVar = elVar.H;
                                            wnVar.n5 = null;
                                            wnVar.l5 = null;
                                            wnVar.f5.updateReply(null, null, wnVar.T5, null);
                                            wnVar.j8();
                                            break;
                                        } else {
                                            org.telegram.ui.el elVar2 = (org.telegram.ui.el) hc0Var4;
                                            elVar2.a(true);
                                            org.telegram.ui.wn wnVar2 = elVar2.H;
                                            wnVar2.l5 = null;
                                            wnVar2.Bb(wnVar2.n5);
                                            break;
                                        }
                                    case 7:
                                        this.b.c0.c(true);
                                        break;
                                    case 8:
                                        this.b.c0.a(true);
                                        break;
                                    case 9:
                                        org.telegram.ui.el elVar3 = (org.telegram.ui.el) this.b.c0;
                                        elVar3.a(true);
                                        org.telegram.ui.wn wnVar3 = elVar3.H;
                                        wnVar3.f5.updateForward(null, wnVar3.T5);
                                        wnVar3.j8();
                                        break;
                                    case 10:
                                        this.b.c0.a(true);
                                        break;
                                    case 11:
                                        org.telegram.ui.el elVar4 = (org.telegram.ui.el) this.b.c0;
                                        elVar4.a(true);
                                        org.telegram.ui.wn wnVar4 = elVar4.H;
                                        wnVar4.G5 = null;
                                        org.telegram.ui.jk jkVar = wnVar4.Y;
                                        if (jkVar != null) {
                                            jkVar.X2 = null;
                                            jkVar.Y2 = false;
                                        }
                                        MessagePreviewParams messagePreviewParams7 = wnVar4.f5;
                                        if (messagePreviewParams7 != null) {
                                            i162 = ((org.telegram.ui.ActionBar.m2) wnVar4).currentAccount;
                                            MessageObject messageObject = wnVar4.n5;
                                            messagePreviewParams7.updateLink(i162, null, null, messageObject == wnVar4.X3 ? null : messageObject, wnVar4.l5, wnVar4.p5);
                                        }
                                        wnVar4.j8();
                                        break;
                                    case 12:
                                        bc0 bc0Var7 = this.b;
                                        MessagePreviewParams messagePreviewParams8 = bc0Var7.c0.d;
                                        if (messagePreviewParams8.hasMedia) {
                                            boolean z14 = !messagePreviewParams8.webpageSmall;
                                            messagePreviewParams8.webpageSmall = z14;
                                            bc0Var7.G.a(z14, true);
                                            bc0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                            if (bc0Var7.r.messages.size() > 0 && (message2 = bc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                                boolean z15 = messagePreviewParams8.webpageSmall;
                                                messageMedia2.force_small_media = z15;
                                                messageMedia2.force_large_media = !z15;
                                            }
                                            if (bc0Var7.r.previewMessages.size() > 0 && (message = bc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                                boolean z16 = messagePreviewParams8.webpageSmall;
                                                messageMedia.force_small_media = z16;
                                                messageMedia.force_large_media = !z16;
                                            }
                                            bc0Var7.h();
                                            bc0Var7.U = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        bc0 bc0Var8 = this.b;
                                        MessagePreviewParams messagePreviewParams9 = bc0Var8.c0.d;
                                        boolean z17 = messagePreviewParams9.webpageTop;
                                        messagePreviewParams9.webpageTop = !z17;
                                        bc0Var8.E.a(z17, true);
                                        if (bc0Var8.r.messages.size() > 0 && (message4 = bc0Var8.r.messages.get(0).messageOwner) != null) {
                                            message4.invert_media = messagePreviewParams9.webpageTop;
                                        }
                                        if (bc0Var8.r.previewMessages.size() > 0 && (message3 = bc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                            message3.invert_media = messagePreviewParams9.webpageTop;
                                        }
                                        bc0Var8.h();
                                        bc0Var8.U = true;
                                        break;
                                }
                            }
                        });
                        bc0Var2 = bc0Var3;
                        viewOutlineProvider = null;
                    }
                }
            } else {
                if (!UserConfig.getInstance(hc0Var.w).isPremium()) {
                    for (int i20 = 0; i20 < messagePreviewParams.forwardMessages.messages.size(); i20++) {
                        if (messagePreviewParams.forwardMessages.messages.get(i20).type == 36) {
                            z10 = false;
                            break;
                        }
                    }
                }
                z10 = true;
                gc0 gc0Var6 = new gc0(context, R.raw.name_hide, LocaleController.getString(messagePreviewParams.multipleUsers ? R.string.ShowSenderNames : R.string.ShowSendersName), R.raw.name_show, LocaleController.getString(messagePreviewParams.multipleUsers ? R.string.HideSenderNames : R.string.HideSendersName), hc0Var.F);
                this.s.a(gc0Var6, w7.y5.n(-1, 48));
                if (messagePreviewParams.hasCaption) {
                    gc0Var = gc0Var6;
                    gc0 gc0Var7 = new gc0(context, R.raw.caption_hide, LocaleController.getString(R.string.ShowCaption), R.raw.caption_show, LocaleController.getString(R.string.HideCaption), hc0Var.F);
                    gc0Var7.a(messagePreviewParams.hideCaption, false);
                    this.s.a(gc0Var7, w7.y5.n(-1, 48));
                    gc0Var2 = gc0Var7;
                } else {
                    gc0Var = gc0Var6;
                    gc0Var2 = null;
                }
                org.telegram.ui.ActionBar.e1 e1Var3 = new org.telegram.ui.ActionBar.e1(0, context, hc0Var.F, true, false);
                final int i21 = 7;
                e1Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.lb0
                    public final /* synthetic */ bc0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i162;
                        TLRPC.Message message;
                        TLRPC.MessageMedia messageMedia;
                        TLRPC.Message message2;
                        TLRPC.MessageMedia messageMedia2;
                        TLRPC.Message message3;
                        TLRPC.Message message4;
                        switch (i21) {
                            case 0:
                                bc0 bc0Var4 = this.b;
                                bc0Var4.c0.d.quote = null;
                                bc0Var4.e.f(false);
                                bc0Var4.g(false, false);
                                bc0Var4.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                bc0 bc0Var5 = this.b;
                                tb0 tb0Var2 = bc0Var5.e;
                                hc0 hc0Var2 = bc0Var5.c0;
                                if (bc0Var5.c(null) != null) {
                                    if (tb0Var2.v - tb0Var2.u <= MessagesController.getInstance(hc0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.y9 y9Var = tb0Var2.W;
                                        MessageObject c11 = bc0Var5.c(y9Var != null ? ((org.telegram.ui.Cells.u1) y9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams5 = hc0Var2.d;
                                        int i172 = tb0Var2.u;
                                        messagePreviewParams5.quoteStart = i172;
                                        int i182 = tb0Var2.v;
                                        messagePreviewParams5.quoteEnd = i182;
                                        messagePreviewParams5.quote = org.telegram.ui.mn.b(i172, i182, c11);
                                        hc0Var2.b();
                                        hc0Var2.a(true);
                                        break;
                                    } else {
                                        bc0Var5.f();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                bc0 bc0Var6 = this.b;
                                tb0 tb0Var3 = bc0Var6.e;
                                hc0 hc0Var3 = bc0Var6.c0;
                                MessagePreviewParams messagePreviewParams6 = hc0Var3.d;
                                int i192 = hc0Var3.w;
                                boolean z13 = hc0Var3.b;
                                if (messagePreviewParams6.quote != null && !z13) {
                                    messagePreviewParams6.quote = null;
                                    tb0Var3.f(false);
                                    bc0Var6.g(false, true);
                                    bc0Var6.k(true);
                                    break;
                                } else if (tb0Var3.v - tb0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                    MessageObject c12 = bc0Var6.c(null);
                                    if (c12 != null) {
                                        if (!tb0Var3.y()) {
                                            messagePreviewParams6.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                            messagePreviewParams6.quoteEnd = min;
                                            messagePreviewParams6.quote = org.telegram.ui.mn.b(messagePreviewParams6.quoteStart, min, c12);
                                            View d10 = bc0Var6.d();
                                            if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                tb0Var3.a0((org.telegram.ui.Cells.u1) d10, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                            }
                                            if (!z13) {
                                                bc0Var6.s.getSwipeBack().e(bc0Var6.I);
                                            }
                                            bc0Var6.g(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams6.quoteStart = tb0Var3.u;
                                            messagePreviewParams6.quoteEnd = tb0Var3.v;
                                            org.telegram.ui.Cells.y9 y9Var2 = tb0Var3.W;
                                            messagePreviewParams6.quote = org.telegram.ui.mn.b(messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd, bc0Var6.c(y9Var2 != null ? ((org.telegram.ui.Cells.u1) y9Var2).getMessageObject() : null));
                                            hc0Var3.b();
                                            hc0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    bc0Var6.f();
                                    break;
                                }
                                break;
                            case 3:
                                this.b.c0.c(false);
                                break;
                            case 4:
                                this.b.c0.c(false);
                                break;
                            case 5:
                                this.b.c0.a(true);
                                break;
                            case 6:
                                hc0 hc0Var4 = this.b.c0;
                                if (!hc0Var4.b) {
                                    org.telegram.ui.el elVar = (org.telegram.ui.el) hc0Var4;
                                    elVar.a(true);
                                    org.telegram.ui.wn wnVar = elVar.H;
                                    wnVar.n5 = null;
                                    wnVar.l5 = null;
                                    wnVar.f5.updateReply(null, null, wnVar.T5, null);
                                    wnVar.j8();
                                    break;
                                } else {
                                    org.telegram.ui.el elVar2 = (org.telegram.ui.el) hc0Var4;
                                    elVar2.a(true);
                                    org.telegram.ui.wn wnVar2 = elVar2.H;
                                    wnVar2.l5 = null;
                                    wnVar2.Bb(wnVar2.n5);
                                    break;
                                }
                            case 7:
                                this.b.c0.c(true);
                                break;
                            case 8:
                                this.b.c0.a(true);
                                break;
                            case 9:
                                org.telegram.ui.el elVar3 = (org.telegram.ui.el) this.b.c0;
                                elVar3.a(true);
                                org.telegram.ui.wn wnVar3 = elVar3.H;
                                wnVar3.f5.updateForward(null, wnVar3.T5);
                                wnVar3.j8();
                                break;
                            case 10:
                                this.b.c0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.el elVar4 = (org.telegram.ui.el) this.b.c0;
                                elVar4.a(true);
                                org.telegram.ui.wn wnVar4 = elVar4.H;
                                wnVar4.G5 = null;
                                org.telegram.ui.jk jkVar = wnVar4.Y;
                                if (jkVar != null) {
                                    jkVar.X2 = null;
                                    jkVar.Y2 = false;
                                }
                                MessagePreviewParams messagePreviewParams7 = wnVar4.f5;
                                if (messagePreviewParams7 != null) {
                                    i162 = ((org.telegram.ui.ActionBar.m2) wnVar4).currentAccount;
                                    MessageObject messageObject = wnVar4.n5;
                                    messagePreviewParams7.updateLink(i162, null, null, messageObject == wnVar4.X3 ? null : messageObject, wnVar4.l5, wnVar4.p5);
                                }
                                wnVar4.j8();
                                break;
                            case 12:
                                bc0 bc0Var7 = this.b;
                                MessagePreviewParams messagePreviewParams8 = bc0Var7.c0.d;
                                if (messagePreviewParams8.hasMedia) {
                                    boolean z14 = !messagePreviewParams8.webpageSmall;
                                    messagePreviewParams8.webpageSmall = z14;
                                    bc0Var7.G.a(z14, true);
                                    bc0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                    if (bc0Var7.r.messages.size() > 0 && (message2 = bc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z15 = messagePreviewParams8.webpageSmall;
                                        messageMedia2.force_small_media = z15;
                                        messageMedia2.force_large_media = !z15;
                                    }
                                    if (bc0Var7.r.previewMessages.size() > 0 && (message = bc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z16 = messagePreviewParams8.webpageSmall;
                                        messageMedia.force_small_media = z16;
                                        messageMedia.force_large_media = !z16;
                                    }
                                    bc0Var7.h();
                                    bc0Var7.U = true;
                                    break;
                                }
                                break;
                            default:
                                bc0 bc0Var8 = this.b;
                                MessagePreviewParams messagePreviewParams9 = bc0Var8.c0.d;
                                boolean z17 = messagePreviewParams9.webpageTop;
                                messagePreviewParams9.webpageTop = !z17;
                                bc0Var8.E.a(z17, true);
                                if (bc0Var8.r.messages.size() > 0 && (message4 = bc0Var8.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams9.webpageTop;
                                }
                                if (bc0Var8.r.previewMessages.size() > 0 && (message3 = bc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams9.webpageTop;
                                }
                                bc0Var8.h();
                                bc0Var8.U = true;
                                break;
                        }
                    }
                });
                e1Var3.g(LocaleController.getString(R.string.ChangeRecipient), R.drawable.msg_forward_replace, null);
                this.s.a(e1Var3, w7.y5.n(-1, 48));
                org.telegram.ui.ActionBar.j1 j1Var2 = new org.telegram.ui.ActionBar.j1(context, dc0Var);
                j1Var2.setColor(org.telegram.ui.ActionBar.h6.l1(0.06f, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.E8, dc0Var)));
                j1Var2.setTag(R.id.fit_width_tag, 1);
                this.s.a(j1Var2, w7.y5.n(-1, 8));
                org.telegram.ui.ActionBar.e1 e1Var4 = new org.telegram.ui.ActionBar.e1(1, context, hc0Var.F, false, false);
                e1Var4.g(LocaleController.getString(R.string.ApplyChanges), R.drawable.msg_select, null);
                final int i22 = 8;
                e1Var4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.lb0
                    public final /* synthetic */ bc0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i162;
                        TLRPC.Message message;
                        TLRPC.MessageMedia messageMedia;
                        TLRPC.Message message2;
                        TLRPC.MessageMedia messageMedia2;
                        TLRPC.Message message3;
                        TLRPC.Message message4;
                        switch (i22) {
                            case 0:
                                bc0 bc0Var4 = this.b;
                                bc0Var4.c0.d.quote = null;
                                bc0Var4.e.f(false);
                                bc0Var4.g(false, false);
                                bc0Var4.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                bc0 bc0Var5 = this.b;
                                tb0 tb0Var2 = bc0Var5.e;
                                hc0 hc0Var2 = bc0Var5.c0;
                                if (bc0Var5.c(null) != null) {
                                    if (tb0Var2.v - tb0Var2.u <= MessagesController.getInstance(hc0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.y9 y9Var = tb0Var2.W;
                                        MessageObject c11 = bc0Var5.c(y9Var != null ? ((org.telegram.ui.Cells.u1) y9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams5 = hc0Var2.d;
                                        int i172 = tb0Var2.u;
                                        messagePreviewParams5.quoteStart = i172;
                                        int i182 = tb0Var2.v;
                                        messagePreviewParams5.quoteEnd = i182;
                                        messagePreviewParams5.quote = org.telegram.ui.mn.b(i172, i182, c11);
                                        hc0Var2.b();
                                        hc0Var2.a(true);
                                        break;
                                    } else {
                                        bc0Var5.f();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                bc0 bc0Var6 = this.b;
                                tb0 tb0Var3 = bc0Var6.e;
                                hc0 hc0Var3 = bc0Var6.c0;
                                MessagePreviewParams messagePreviewParams6 = hc0Var3.d;
                                int i192 = hc0Var3.w;
                                boolean z13 = hc0Var3.b;
                                if (messagePreviewParams6.quote != null && !z13) {
                                    messagePreviewParams6.quote = null;
                                    tb0Var3.f(false);
                                    bc0Var6.g(false, true);
                                    bc0Var6.k(true);
                                    break;
                                } else if (tb0Var3.v - tb0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                    MessageObject c12 = bc0Var6.c(null);
                                    if (c12 != null) {
                                        if (!tb0Var3.y()) {
                                            messagePreviewParams6.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                            messagePreviewParams6.quoteEnd = min;
                                            messagePreviewParams6.quote = org.telegram.ui.mn.b(messagePreviewParams6.quoteStart, min, c12);
                                            View d10 = bc0Var6.d();
                                            if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                tb0Var3.a0((org.telegram.ui.Cells.u1) d10, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                            }
                                            if (!z13) {
                                                bc0Var6.s.getSwipeBack().e(bc0Var6.I);
                                            }
                                            bc0Var6.g(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams6.quoteStart = tb0Var3.u;
                                            messagePreviewParams6.quoteEnd = tb0Var3.v;
                                            org.telegram.ui.Cells.y9 y9Var2 = tb0Var3.W;
                                            messagePreviewParams6.quote = org.telegram.ui.mn.b(messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd, bc0Var6.c(y9Var2 != null ? ((org.telegram.ui.Cells.u1) y9Var2).getMessageObject() : null));
                                            hc0Var3.b();
                                            hc0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    bc0Var6.f();
                                    break;
                                }
                                break;
                            case 3:
                                this.b.c0.c(false);
                                break;
                            case 4:
                                this.b.c0.c(false);
                                break;
                            case 5:
                                this.b.c0.a(true);
                                break;
                            case 6:
                                hc0 hc0Var4 = this.b.c0;
                                if (!hc0Var4.b) {
                                    org.telegram.ui.el elVar = (org.telegram.ui.el) hc0Var4;
                                    elVar.a(true);
                                    org.telegram.ui.wn wnVar = elVar.H;
                                    wnVar.n5 = null;
                                    wnVar.l5 = null;
                                    wnVar.f5.updateReply(null, null, wnVar.T5, null);
                                    wnVar.j8();
                                    break;
                                } else {
                                    org.telegram.ui.el elVar2 = (org.telegram.ui.el) hc0Var4;
                                    elVar2.a(true);
                                    org.telegram.ui.wn wnVar2 = elVar2.H;
                                    wnVar2.l5 = null;
                                    wnVar2.Bb(wnVar2.n5);
                                    break;
                                }
                            case 7:
                                this.b.c0.c(true);
                                break;
                            case 8:
                                this.b.c0.a(true);
                                break;
                            case 9:
                                org.telegram.ui.el elVar3 = (org.telegram.ui.el) this.b.c0;
                                elVar3.a(true);
                                org.telegram.ui.wn wnVar3 = elVar3.H;
                                wnVar3.f5.updateForward(null, wnVar3.T5);
                                wnVar3.j8();
                                break;
                            case 10:
                                this.b.c0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.el elVar4 = (org.telegram.ui.el) this.b.c0;
                                elVar4.a(true);
                                org.telegram.ui.wn wnVar4 = elVar4.H;
                                wnVar4.G5 = null;
                                org.telegram.ui.jk jkVar = wnVar4.Y;
                                if (jkVar != null) {
                                    jkVar.X2 = null;
                                    jkVar.Y2 = false;
                                }
                                MessagePreviewParams messagePreviewParams7 = wnVar4.f5;
                                if (messagePreviewParams7 != null) {
                                    i162 = ((org.telegram.ui.ActionBar.m2) wnVar4).currentAccount;
                                    MessageObject messageObject = wnVar4.n5;
                                    messagePreviewParams7.updateLink(i162, null, null, messageObject == wnVar4.X3 ? null : messageObject, wnVar4.l5, wnVar4.p5);
                                }
                                wnVar4.j8();
                                break;
                            case 12:
                                bc0 bc0Var7 = this.b;
                                MessagePreviewParams messagePreviewParams8 = bc0Var7.c0.d;
                                if (messagePreviewParams8.hasMedia) {
                                    boolean z14 = !messagePreviewParams8.webpageSmall;
                                    messagePreviewParams8.webpageSmall = z14;
                                    bc0Var7.G.a(z14, true);
                                    bc0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                    if (bc0Var7.r.messages.size() > 0 && (message2 = bc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z15 = messagePreviewParams8.webpageSmall;
                                        messageMedia2.force_small_media = z15;
                                        messageMedia2.force_large_media = !z15;
                                    }
                                    if (bc0Var7.r.previewMessages.size() > 0 && (message = bc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z16 = messagePreviewParams8.webpageSmall;
                                        messageMedia.force_small_media = z16;
                                        messageMedia.force_large_media = !z16;
                                    }
                                    bc0Var7.h();
                                    bc0Var7.U = true;
                                    break;
                                }
                                break;
                            default:
                                bc0 bc0Var8 = this.b;
                                MessagePreviewParams messagePreviewParams9 = bc0Var8.c0.d;
                                boolean z17 = messagePreviewParams9.webpageTop;
                                messagePreviewParams9.webpageTop = !z17;
                                bc0Var8.E.a(z17, true);
                                if (bc0Var8.r.messages.size() > 0 && (message4 = bc0Var8.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams9.webpageTop;
                                }
                                if (bc0Var8.r.previewMessages.size() > 0 && (message3 = bc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams9.webpageTop;
                                }
                                bc0Var8.h();
                                bc0Var8.U = true;
                                break;
                        }
                    }
                });
                this.s.a(e1Var4, w7.y5.n(-1, 48));
                org.telegram.ui.ActionBar.e1 e1Var5 = new org.telegram.ui.ActionBar.e1(1, context, hc0Var.F, false, true);
                e1Var5.g(LocaleController.getString(R.string.DoNotForward), R.drawable.msg_delete, null);
                int v03 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.q7, dc0Var);
                int i23 = org.telegram.ui.ActionBar.h6.p7;
                e1Var5.c(v03, org.telegram.ui.ActionBar.h6.v0(i23, dc0Var));
                final int i24 = 9;
                e1Var5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.lb0
                    public final /* synthetic */ bc0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i162;
                        TLRPC.Message message;
                        TLRPC.MessageMedia messageMedia;
                        TLRPC.Message message2;
                        TLRPC.MessageMedia messageMedia2;
                        TLRPC.Message message3;
                        TLRPC.Message message4;
                        switch (i24) {
                            case 0:
                                bc0 bc0Var4 = this.b;
                                bc0Var4.c0.d.quote = null;
                                bc0Var4.e.f(false);
                                bc0Var4.g(false, false);
                                bc0Var4.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                bc0 bc0Var5 = this.b;
                                tb0 tb0Var2 = bc0Var5.e;
                                hc0 hc0Var2 = bc0Var5.c0;
                                if (bc0Var5.c(null) != null) {
                                    if (tb0Var2.v - tb0Var2.u <= MessagesController.getInstance(hc0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.y9 y9Var = tb0Var2.W;
                                        MessageObject c11 = bc0Var5.c(y9Var != null ? ((org.telegram.ui.Cells.u1) y9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams5 = hc0Var2.d;
                                        int i172 = tb0Var2.u;
                                        messagePreviewParams5.quoteStart = i172;
                                        int i182 = tb0Var2.v;
                                        messagePreviewParams5.quoteEnd = i182;
                                        messagePreviewParams5.quote = org.telegram.ui.mn.b(i172, i182, c11);
                                        hc0Var2.b();
                                        hc0Var2.a(true);
                                        break;
                                    } else {
                                        bc0Var5.f();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                bc0 bc0Var6 = this.b;
                                tb0 tb0Var3 = bc0Var6.e;
                                hc0 hc0Var3 = bc0Var6.c0;
                                MessagePreviewParams messagePreviewParams6 = hc0Var3.d;
                                int i192 = hc0Var3.w;
                                boolean z13 = hc0Var3.b;
                                if (messagePreviewParams6.quote != null && !z13) {
                                    messagePreviewParams6.quote = null;
                                    tb0Var3.f(false);
                                    bc0Var6.g(false, true);
                                    bc0Var6.k(true);
                                    break;
                                } else if (tb0Var3.v - tb0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                    MessageObject c12 = bc0Var6.c(null);
                                    if (c12 != null) {
                                        if (!tb0Var3.y()) {
                                            messagePreviewParams6.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                            messagePreviewParams6.quoteEnd = min;
                                            messagePreviewParams6.quote = org.telegram.ui.mn.b(messagePreviewParams6.quoteStart, min, c12);
                                            View d10 = bc0Var6.d();
                                            if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                tb0Var3.a0((org.telegram.ui.Cells.u1) d10, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                            }
                                            if (!z13) {
                                                bc0Var6.s.getSwipeBack().e(bc0Var6.I);
                                            }
                                            bc0Var6.g(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams6.quoteStart = tb0Var3.u;
                                            messagePreviewParams6.quoteEnd = tb0Var3.v;
                                            org.telegram.ui.Cells.y9 y9Var2 = tb0Var3.W;
                                            messagePreviewParams6.quote = org.telegram.ui.mn.b(messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd, bc0Var6.c(y9Var2 != null ? ((org.telegram.ui.Cells.u1) y9Var2).getMessageObject() : null));
                                            hc0Var3.b();
                                            hc0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    bc0Var6.f();
                                    break;
                                }
                                break;
                            case 3:
                                this.b.c0.c(false);
                                break;
                            case 4:
                                this.b.c0.c(false);
                                break;
                            case 5:
                                this.b.c0.a(true);
                                break;
                            case 6:
                                hc0 hc0Var4 = this.b.c0;
                                if (!hc0Var4.b) {
                                    org.telegram.ui.el elVar = (org.telegram.ui.el) hc0Var4;
                                    elVar.a(true);
                                    org.telegram.ui.wn wnVar = elVar.H;
                                    wnVar.n5 = null;
                                    wnVar.l5 = null;
                                    wnVar.f5.updateReply(null, null, wnVar.T5, null);
                                    wnVar.j8();
                                    break;
                                } else {
                                    org.telegram.ui.el elVar2 = (org.telegram.ui.el) hc0Var4;
                                    elVar2.a(true);
                                    org.telegram.ui.wn wnVar2 = elVar2.H;
                                    wnVar2.l5 = null;
                                    wnVar2.Bb(wnVar2.n5);
                                    break;
                                }
                            case 7:
                                this.b.c0.c(true);
                                break;
                            case 8:
                                this.b.c0.a(true);
                                break;
                            case 9:
                                org.telegram.ui.el elVar3 = (org.telegram.ui.el) this.b.c0;
                                elVar3.a(true);
                                org.telegram.ui.wn wnVar3 = elVar3.H;
                                wnVar3.f5.updateForward(null, wnVar3.T5);
                                wnVar3.j8();
                                break;
                            case 10:
                                this.b.c0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.el elVar4 = (org.telegram.ui.el) this.b.c0;
                                elVar4.a(true);
                                org.telegram.ui.wn wnVar4 = elVar4.H;
                                wnVar4.G5 = null;
                                org.telegram.ui.jk jkVar = wnVar4.Y;
                                if (jkVar != null) {
                                    jkVar.X2 = null;
                                    jkVar.Y2 = false;
                                }
                                MessagePreviewParams messagePreviewParams7 = wnVar4.f5;
                                if (messagePreviewParams7 != null) {
                                    i162 = ((org.telegram.ui.ActionBar.m2) wnVar4).currentAccount;
                                    MessageObject messageObject = wnVar4.n5;
                                    messagePreviewParams7.updateLink(i162, null, null, messageObject == wnVar4.X3 ? null : messageObject, wnVar4.l5, wnVar4.p5);
                                }
                                wnVar4.j8();
                                break;
                            case 12:
                                bc0 bc0Var7 = this.b;
                                MessagePreviewParams messagePreviewParams8 = bc0Var7.c0.d;
                                if (messagePreviewParams8.hasMedia) {
                                    boolean z14 = !messagePreviewParams8.webpageSmall;
                                    messagePreviewParams8.webpageSmall = z14;
                                    bc0Var7.G.a(z14, true);
                                    bc0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                    if (bc0Var7.r.messages.size() > 0 && (message2 = bc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z15 = messagePreviewParams8.webpageSmall;
                                        messageMedia2.force_small_media = z15;
                                        messageMedia2.force_large_media = !z15;
                                    }
                                    if (bc0Var7.r.previewMessages.size() > 0 && (message = bc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z16 = messagePreviewParams8.webpageSmall;
                                        messageMedia.force_small_media = z16;
                                        messageMedia.force_large_media = !z16;
                                    }
                                    bc0Var7.h();
                                    bc0Var7.U = true;
                                    break;
                                }
                                break;
                            default:
                                bc0 bc0Var8 = this.b;
                                MessagePreviewParams messagePreviewParams9 = bc0Var8.c0.d;
                                boolean z17 = messagePreviewParams9.webpageTop;
                                messagePreviewParams9.webpageTop = !z17;
                                bc0Var8.E.a(z17, true);
                                if (bc0Var8.r.messages.size() > 0 && (message4 = bc0Var8.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams9.webpageTop;
                                }
                                if (bc0Var8.r.previewMessages.size() > 0 && (message3 = bc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams9.webpageTop;
                                }
                                bc0Var8.h();
                                bc0Var8.U = true;
                                break;
                        }
                    }
                });
                e1Var5.setSelectorColor(org.telegram.ui.ActionBar.h6.l1(0.12f, org.telegram.ui.ActionBar.h6.w0(null, i23, false)));
                this.s.a(e1Var5, w7.y5.n(-1, 48));
                gc0 gc0Var8 = gc0Var;
                gc0Var8.a(messagePreviewParams.hideForwardSendersName, false);
                gc0 gc0Var9 = gc0Var2;
                bc0 bc0Var4 = this;
                gc0Var8.setOnClickListener(new ob0(this, z10, context, gc0Var9, gc0Var8, 0));
                bc0Var = bc0Var4;
                if (gc0Var9 != null) {
                    gc0Var9.setOnClickListener(new ai.d0(bc0Var4, gc0Var9, gc0Var8, 24));
                    bc0Var = bc0Var4;
                }
            }
            context2 = context;
            bc0Var2 = bc0Var;
            viewOutlineProvider = null;
        } else {
            if (!messages.hasText || messagePreviewParams4.isSecret) {
                r11 = 0;
                messagePreviewParams2 = messagePreviewParams4;
            } else {
                LinearLayout f7 = org.telegram.messenger.ok.f(context3, 1);
                if (z12) {
                    linearLayout = f7;
                    drawable = null;
                    messagePreviewParams3 = messagePreviewParams4;
                    z11 = true;
                } else {
                    messagePreviewParams3 = messagePreviewParams4;
                    ?? r92 = f7;
                    drawable = null;
                    org.telegram.ui.ActionBar.e1 e1Var6 = new org.telegram.ui.ActionBar.e1(0, context3, hc0Var.F, true, false);
                    e1Var6.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                    e1Var6.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.lb0
                        public final /* synthetic */ bc0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i162;
                            TLRPC.Message message;
                            TLRPC.MessageMedia messageMedia;
                            TLRPC.Message message2;
                            TLRPC.MessageMedia messageMedia2;
                            TLRPC.Message message3;
                            TLRPC.Message message4;
                            switch (i12) {
                                case 0:
                                    bc0 bc0Var42 = this.b;
                                    bc0Var42.c0.d.quote = null;
                                    bc0Var42.e.f(false);
                                    bc0Var42.g(false, false);
                                    bc0Var42.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    bc0 bc0Var5 = this.b;
                                    tb0 tb0Var2 = bc0Var5.e;
                                    hc0 hc0Var2 = bc0Var5.c0;
                                    if (bc0Var5.c(null) != null) {
                                        if (tb0Var2.v - tb0Var2.u <= MessagesController.getInstance(hc0Var2.w).quoteLengthMax) {
                                            org.telegram.ui.Cells.y9 y9Var = tb0Var2.W;
                                            MessageObject c11 = bc0Var5.c(y9Var != null ? ((org.telegram.ui.Cells.u1) y9Var).getMessageObject() : null);
                                            MessagePreviewParams messagePreviewParams5 = hc0Var2.d;
                                            int i172 = tb0Var2.u;
                                            messagePreviewParams5.quoteStart = i172;
                                            int i182 = tb0Var2.v;
                                            messagePreviewParams5.quoteEnd = i182;
                                            messagePreviewParams5.quote = org.telegram.ui.mn.b(i172, i182, c11);
                                            hc0Var2.b();
                                            hc0Var2.a(true);
                                            break;
                                        } else {
                                            bc0Var5.f();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    bc0 bc0Var6 = this.b;
                                    tb0 tb0Var3 = bc0Var6.e;
                                    hc0 hc0Var3 = bc0Var6.c0;
                                    MessagePreviewParams messagePreviewParams6 = hc0Var3.d;
                                    int i192 = hc0Var3.w;
                                    boolean z13 = hc0Var3.b;
                                    if (messagePreviewParams6.quote != null && !z13) {
                                        messagePreviewParams6.quote = null;
                                        tb0Var3.f(false);
                                        bc0Var6.g(false, true);
                                        bc0Var6.k(true);
                                        break;
                                    } else if (tb0Var3.v - tb0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                        MessageObject c12 = bc0Var6.c(null);
                                        if (c12 != null) {
                                            if (!tb0Var3.y()) {
                                                messagePreviewParams6.quoteStart = 0;
                                                int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                                messagePreviewParams6.quoteEnd = min;
                                                messagePreviewParams6.quote = org.telegram.ui.mn.b(messagePreviewParams6.quoteStart, min, c12);
                                                View d10 = bc0Var6.d();
                                                if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                    tb0Var3.a0((org.telegram.ui.Cells.u1) d10, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                                }
                                                if (!z13) {
                                                    bc0Var6.s.getSwipeBack().e(bc0Var6.I);
                                                }
                                                bc0Var6.g(true, true);
                                                break;
                                            } else {
                                                messagePreviewParams6.quoteStart = tb0Var3.u;
                                                messagePreviewParams6.quoteEnd = tb0Var3.v;
                                                org.telegram.ui.Cells.y9 y9Var2 = tb0Var3.W;
                                                messagePreviewParams6.quote = org.telegram.ui.mn.b(messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd, bc0Var6.c(y9Var2 != null ? ((org.telegram.ui.Cells.u1) y9Var2).getMessageObject() : null));
                                                hc0Var3.b();
                                                hc0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        bc0Var6.f();
                                        break;
                                    }
                                    break;
                                case 3:
                                    this.b.c0.c(false);
                                    break;
                                case 4:
                                    this.b.c0.c(false);
                                    break;
                                case 5:
                                    this.b.c0.a(true);
                                    break;
                                case 6:
                                    hc0 hc0Var4 = this.b.c0;
                                    if (!hc0Var4.b) {
                                        org.telegram.ui.el elVar = (org.telegram.ui.el) hc0Var4;
                                        elVar.a(true);
                                        org.telegram.ui.wn wnVar = elVar.H;
                                        wnVar.n5 = null;
                                        wnVar.l5 = null;
                                        wnVar.f5.updateReply(null, null, wnVar.T5, null);
                                        wnVar.j8();
                                        break;
                                    } else {
                                        org.telegram.ui.el elVar2 = (org.telegram.ui.el) hc0Var4;
                                        elVar2.a(true);
                                        org.telegram.ui.wn wnVar2 = elVar2.H;
                                        wnVar2.l5 = null;
                                        wnVar2.Bb(wnVar2.n5);
                                        break;
                                    }
                                case 7:
                                    this.b.c0.c(true);
                                    break;
                                case 8:
                                    this.b.c0.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.el elVar3 = (org.telegram.ui.el) this.b.c0;
                                    elVar3.a(true);
                                    org.telegram.ui.wn wnVar3 = elVar3.H;
                                    wnVar3.f5.updateForward(null, wnVar3.T5);
                                    wnVar3.j8();
                                    break;
                                case 10:
                                    this.b.c0.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.el elVar4 = (org.telegram.ui.el) this.b.c0;
                                    elVar4.a(true);
                                    org.telegram.ui.wn wnVar4 = elVar4.H;
                                    wnVar4.G5 = null;
                                    org.telegram.ui.jk jkVar = wnVar4.Y;
                                    if (jkVar != null) {
                                        jkVar.X2 = null;
                                        jkVar.Y2 = false;
                                    }
                                    MessagePreviewParams messagePreviewParams7 = wnVar4.f5;
                                    if (messagePreviewParams7 != null) {
                                        i162 = ((org.telegram.ui.ActionBar.m2) wnVar4).currentAccount;
                                        MessageObject messageObject = wnVar4.n5;
                                        messagePreviewParams7.updateLink(i162, null, null, messageObject == wnVar4.X3 ? null : messageObject, wnVar4.l5, wnVar4.p5);
                                    }
                                    wnVar4.j8();
                                    break;
                                case 12:
                                    bc0 bc0Var7 = this.b;
                                    MessagePreviewParams messagePreviewParams8 = bc0Var7.c0.d;
                                    if (messagePreviewParams8.hasMedia) {
                                        boolean z14 = !messagePreviewParams8.webpageSmall;
                                        messagePreviewParams8.webpageSmall = z14;
                                        bc0Var7.G.a(z14, true);
                                        bc0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                        if (bc0Var7.r.messages.size() > 0 && (message2 = bc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z15 = messagePreviewParams8.webpageSmall;
                                            messageMedia2.force_small_media = z15;
                                            messageMedia2.force_large_media = !z15;
                                        }
                                        if (bc0Var7.r.previewMessages.size() > 0 && (message = bc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                            boolean z16 = messagePreviewParams8.webpageSmall;
                                            messageMedia.force_small_media = z16;
                                            messageMedia.force_large_media = !z16;
                                        }
                                        bc0Var7.h();
                                        bc0Var7.U = true;
                                        break;
                                    }
                                    break;
                                default:
                                    bc0 bc0Var8 = this.b;
                                    MessagePreviewParams messagePreviewParams9 = bc0Var8.c0.d;
                                    boolean z17 = messagePreviewParams9.webpageTop;
                                    messagePreviewParams9.webpageTop = !z17;
                                    bc0Var8.E.a(z17, true);
                                    if (bc0Var8.r.messages.size() > 0 && (message4 = bc0Var8.r.messages.get(0).messageOwner) != null) {
                                        message4.invert_media = messagePreviewParams9.webpageTop;
                                    }
                                    if (bc0Var8.r.previewMessages.size() > 0 && (message3 = bc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                        message3.invert_media = messagePreviewParams9.webpageTop;
                                    }
                                    bc0Var8.h();
                                    bc0Var8.U = true;
                                    break;
                            }
                        }
                    });
                    r92.addView(e1Var6, w7.y5.n(-1, 48));
                    org.telegram.ui.ActionBar.j1 j1Var3 = new org.telegram.ui.ActionBar.j1(context3, dc0Var);
                    j1Var3.setColor(org.telegram.ui.ActionBar.h6.l1(0.06f, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.E8, dc0Var)));
                    j1Var3.setTag(R.id.fit_width_tag, 1);
                    r92.addView(j1Var3, w7.y5.n(-1, 8));
                    org.telegram.ui.ActionBar.e1 e1Var7 = new org.telegram.ui.ActionBar.e1(0, context3, hc0Var.F, false, true);
                    e1Var7.g(LocaleController.getString(R.string.QuoteSelectedPart), R.drawable.menu_quote_specific, null);
                    z11 = true;
                    final boolean z13 = true ? 1 : 0;
                    e1Var7.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.lb0
                        public final /* synthetic */ bc0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i162;
                            TLRPC.Message message;
                            TLRPC.MessageMedia messageMedia;
                            TLRPC.Message message2;
                            TLRPC.MessageMedia messageMedia2;
                            TLRPC.Message message3;
                            TLRPC.Message message4;
                            switch (z13) {
                                case 0:
                                    bc0 bc0Var42 = this.b;
                                    bc0Var42.c0.d.quote = null;
                                    bc0Var42.e.f(false);
                                    bc0Var42.g(false, false);
                                    bc0Var42.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    bc0 bc0Var5 = this.b;
                                    tb0 tb0Var2 = bc0Var5.e;
                                    hc0 hc0Var2 = bc0Var5.c0;
                                    if (bc0Var5.c(null) != null) {
                                        if (tb0Var2.v - tb0Var2.u <= MessagesController.getInstance(hc0Var2.w).quoteLengthMax) {
                                            org.telegram.ui.Cells.y9 y9Var = tb0Var2.W;
                                            MessageObject c11 = bc0Var5.c(y9Var != null ? ((org.telegram.ui.Cells.u1) y9Var).getMessageObject() : null);
                                            MessagePreviewParams messagePreviewParams5 = hc0Var2.d;
                                            int i172 = tb0Var2.u;
                                            messagePreviewParams5.quoteStart = i172;
                                            int i182 = tb0Var2.v;
                                            messagePreviewParams5.quoteEnd = i182;
                                            messagePreviewParams5.quote = org.telegram.ui.mn.b(i172, i182, c11);
                                            hc0Var2.b();
                                            hc0Var2.a(true);
                                            break;
                                        } else {
                                            bc0Var5.f();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    bc0 bc0Var6 = this.b;
                                    tb0 tb0Var3 = bc0Var6.e;
                                    hc0 hc0Var3 = bc0Var6.c0;
                                    MessagePreviewParams messagePreviewParams6 = hc0Var3.d;
                                    int i192 = hc0Var3.w;
                                    boolean z132 = hc0Var3.b;
                                    if (messagePreviewParams6.quote != null && !z132) {
                                        messagePreviewParams6.quote = null;
                                        tb0Var3.f(false);
                                        bc0Var6.g(false, true);
                                        bc0Var6.k(true);
                                        break;
                                    } else if (tb0Var3.v - tb0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                        MessageObject c12 = bc0Var6.c(null);
                                        if (c12 != null) {
                                            if (!tb0Var3.y()) {
                                                messagePreviewParams6.quoteStart = 0;
                                                int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                                messagePreviewParams6.quoteEnd = min;
                                                messagePreviewParams6.quote = org.telegram.ui.mn.b(messagePreviewParams6.quoteStart, min, c12);
                                                View d10 = bc0Var6.d();
                                                if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                    tb0Var3.a0((org.telegram.ui.Cells.u1) d10, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                                }
                                                if (!z132) {
                                                    bc0Var6.s.getSwipeBack().e(bc0Var6.I);
                                                }
                                                bc0Var6.g(true, true);
                                                break;
                                            } else {
                                                messagePreviewParams6.quoteStart = tb0Var3.u;
                                                messagePreviewParams6.quoteEnd = tb0Var3.v;
                                                org.telegram.ui.Cells.y9 y9Var2 = tb0Var3.W;
                                                messagePreviewParams6.quote = org.telegram.ui.mn.b(messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd, bc0Var6.c(y9Var2 != null ? ((org.telegram.ui.Cells.u1) y9Var2).getMessageObject() : null));
                                                hc0Var3.b();
                                                hc0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        bc0Var6.f();
                                        break;
                                    }
                                    break;
                                case 3:
                                    this.b.c0.c(false);
                                    break;
                                case 4:
                                    this.b.c0.c(false);
                                    break;
                                case 5:
                                    this.b.c0.a(true);
                                    break;
                                case 6:
                                    hc0 hc0Var4 = this.b.c0;
                                    if (!hc0Var4.b) {
                                        org.telegram.ui.el elVar = (org.telegram.ui.el) hc0Var4;
                                        elVar.a(true);
                                        org.telegram.ui.wn wnVar = elVar.H;
                                        wnVar.n5 = null;
                                        wnVar.l5 = null;
                                        wnVar.f5.updateReply(null, null, wnVar.T5, null);
                                        wnVar.j8();
                                        break;
                                    } else {
                                        org.telegram.ui.el elVar2 = (org.telegram.ui.el) hc0Var4;
                                        elVar2.a(true);
                                        org.telegram.ui.wn wnVar2 = elVar2.H;
                                        wnVar2.l5 = null;
                                        wnVar2.Bb(wnVar2.n5);
                                        break;
                                    }
                                case 7:
                                    this.b.c0.c(true);
                                    break;
                                case 8:
                                    this.b.c0.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.el elVar3 = (org.telegram.ui.el) this.b.c0;
                                    elVar3.a(true);
                                    org.telegram.ui.wn wnVar3 = elVar3.H;
                                    wnVar3.f5.updateForward(null, wnVar3.T5);
                                    wnVar3.j8();
                                    break;
                                case 10:
                                    this.b.c0.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.el elVar4 = (org.telegram.ui.el) this.b.c0;
                                    elVar4.a(true);
                                    org.telegram.ui.wn wnVar4 = elVar4.H;
                                    wnVar4.G5 = null;
                                    org.telegram.ui.jk jkVar = wnVar4.Y;
                                    if (jkVar != null) {
                                        jkVar.X2 = null;
                                        jkVar.Y2 = false;
                                    }
                                    MessagePreviewParams messagePreviewParams7 = wnVar4.f5;
                                    if (messagePreviewParams7 != null) {
                                        i162 = ((org.telegram.ui.ActionBar.m2) wnVar4).currentAccount;
                                        MessageObject messageObject = wnVar4.n5;
                                        messagePreviewParams7.updateLink(i162, null, null, messageObject == wnVar4.X3 ? null : messageObject, wnVar4.l5, wnVar4.p5);
                                    }
                                    wnVar4.j8();
                                    break;
                                case 12:
                                    bc0 bc0Var7 = this.b;
                                    MessagePreviewParams messagePreviewParams8 = bc0Var7.c0.d;
                                    if (messagePreviewParams8.hasMedia) {
                                        boolean z14 = !messagePreviewParams8.webpageSmall;
                                        messagePreviewParams8.webpageSmall = z14;
                                        bc0Var7.G.a(z14, true);
                                        bc0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                        if (bc0Var7.r.messages.size() > 0 && (message2 = bc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z15 = messagePreviewParams8.webpageSmall;
                                            messageMedia2.force_small_media = z15;
                                            messageMedia2.force_large_media = !z15;
                                        }
                                        if (bc0Var7.r.previewMessages.size() > 0 && (message = bc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                            boolean z16 = messagePreviewParams8.webpageSmall;
                                            messageMedia.force_small_media = z16;
                                            messageMedia.force_large_media = !z16;
                                        }
                                        bc0Var7.h();
                                        bc0Var7.U = true;
                                        break;
                                    }
                                    break;
                                default:
                                    bc0 bc0Var8 = this.b;
                                    MessagePreviewParams messagePreviewParams9 = bc0Var8.c0.d;
                                    boolean z17 = messagePreviewParams9.webpageTop;
                                    messagePreviewParams9.webpageTop = !z17;
                                    bc0Var8.E.a(z17, true);
                                    if (bc0Var8.r.messages.size() > 0 && (message4 = bc0Var8.r.messages.get(0).messageOwner) != null) {
                                        message4.invert_media = messagePreviewParams9.webpageTop;
                                    }
                                    if (bc0Var8.r.previewMessages.size() > 0 && (message3 = bc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                        message3.invert_media = messagePreviewParams9.webpageTop;
                                    }
                                    bc0Var8.h();
                                    bc0Var8.U = true;
                                    break;
                            }
                        }
                    });
                    r92.addView(e1Var7, w7.y5.n(-1, 48));
                    linearLayout = r92;
                }
                this.I = actionBarPopupWindow$ActionBarPopupWindowLayout.b(linearLayout);
                actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().setStickToRight(z11);
                FrameLayout frameLayout2 = new FrameLayout(context3);
                messagePreviewParams2 = messagePreviewParams3;
                sb0 sb0Var = new sb0(1, 0, context, hc0Var.F, true, false);
                this.v = sb0Var;
                sb0Var.g(LocaleController.getString(z12 ? R.string.QuoteSelectedPart : R.string.SelectSpecificQuote), R.drawable.menu_select_quote, drawable);
                sb0 sb0Var2 = new sb0(1, 1, context, hc0Var.F, true, false);
                context3 = context;
                this.w = sb0Var2;
                sb0Var2.g(LocaleController.getString(R.string.ClearQuote), R.drawable.menu_quote_delete, drawable);
                frameLayout2.setBackground(org.telegram.ui.ActionBar.h6.Y(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.I5, dc0Var), 6, 0));
                final int i25 = 2;
                frameLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.lb0
                    public final /* synthetic */ bc0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i162;
                        TLRPC.Message message;
                        TLRPC.MessageMedia messageMedia;
                        TLRPC.Message message2;
                        TLRPC.MessageMedia messageMedia2;
                        TLRPC.Message message3;
                        TLRPC.Message message4;
                        switch (i25) {
                            case 0:
                                bc0 bc0Var42 = this.b;
                                bc0Var42.c0.d.quote = null;
                                bc0Var42.e.f(false);
                                bc0Var42.g(false, false);
                                bc0Var42.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                bc0 bc0Var5 = this.b;
                                tb0 tb0Var2 = bc0Var5.e;
                                hc0 hc0Var2 = bc0Var5.c0;
                                if (bc0Var5.c(null) != null) {
                                    if (tb0Var2.v - tb0Var2.u <= MessagesController.getInstance(hc0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.y9 y9Var = tb0Var2.W;
                                        MessageObject c11 = bc0Var5.c(y9Var != null ? ((org.telegram.ui.Cells.u1) y9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams5 = hc0Var2.d;
                                        int i172 = tb0Var2.u;
                                        messagePreviewParams5.quoteStart = i172;
                                        int i182 = tb0Var2.v;
                                        messagePreviewParams5.quoteEnd = i182;
                                        messagePreviewParams5.quote = org.telegram.ui.mn.b(i172, i182, c11);
                                        hc0Var2.b();
                                        hc0Var2.a(true);
                                        break;
                                    } else {
                                        bc0Var5.f();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                bc0 bc0Var6 = this.b;
                                tb0 tb0Var3 = bc0Var6.e;
                                hc0 hc0Var3 = bc0Var6.c0;
                                MessagePreviewParams messagePreviewParams6 = hc0Var3.d;
                                int i192 = hc0Var3.w;
                                boolean z132 = hc0Var3.b;
                                if (messagePreviewParams6.quote != null && !z132) {
                                    messagePreviewParams6.quote = null;
                                    tb0Var3.f(false);
                                    bc0Var6.g(false, true);
                                    bc0Var6.k(true);
                                    break;
                                } else if (tb0Var3.v - tb0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                    MessageObject c12 = bc0Var6.c(null);
                                    if (c12 != null) {
                                        if (!tb0Var3.y()) {
                                            messagePreviewParams6.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                            messagePreviewParams6.quoteEnd = min;
                                            messagePreviewParams6.quote = org.telegram.ui.mn.b(messagePreviewParams6.quoteStart, min, c12);
                                            View d10 = bc0Var6.d();
                                            if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                tb0Var3.a0((org.telegram.ui.Cells.u1) d10, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                            }
                                            if (!z132) {
                                                bc0Var6.s.getSwipeBack().e(bc0Var6.I);
                                            }
                                            bc0Var6.g(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams6.quoteStart = tb0Var3.u;
                                            messagePreviewParams6.quoteEnd = tb0Var3.v;
                                            org.telegram.ui.Cells.y9 y9Var2 = tb0Var3.W;
                                            messagePreviewParams6.quote = org.telegram.ui.mn.b(messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd, bc0Var6.c(y9Var2 != null ? ((org.telegram.ui.Cells.u1) y9Var2).getMessageObject() : null));
                                            hc0Var3.b();
                                            hc0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    bc0Var6.f();
                                    break;
                                }
                                break;
                            case 3:
                                this.b.c0.c(false);
                                break;
                            case 4:
                                this.b.c0.c(false);
                                break;
                            case 5:
                                this.b.c0.a(true);
                                break;
                            case 6:
                                hc0 hc0Var4 = this.b.c0;
                                if (!hc0Var4.b) {
                                    org.telegram.ui.el elVar = (org.telegram.ui.el) hc0Var4;
                                    elVar.a(true);
                                    org.telegram.ui.wn wnVar = elVar.H;
                                    wnVar.n5 = null;
                                    wnVar.l5 = null;
                                    wnVar.f5.updateReply(null, null, wnVar.T5, null);
                                    wnVar.j8();
                                    break;
                                } else {
                                    org.telegram.ui.el elVar2 = (org.telegram.ui.el) hc0Var4;
                                    elVar2.a(true);
                                    org.telegram.ui.wn wnVar2 = elVar2.H;
                                    wnVar2.l5 = null;
                                    wnVar2.Bb(wnVar2.n5);
                                    break;
                                }
                            case 7:
                                this.b.c0.c(true);
                                break;
                            case 8:
                                this.b.c0.a(true);
                                break;
                            case 9:
                                org.telegram.ui.el elVar3 = (org.telegram.ui.el) this.b.c0;
                                elVar3.a(true);
                                org.telegram.ui.wn wnVar3 = elVar3.H;
                                wnVar3.f5.updateForward(null, wnVar3.T5);
                                wnVar3.j8();
                                break;
                            case 10:
                                this.b.c0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.el elVar4 = (org.telegram.ui.el) this.b.c0;
                                elVar4.a(true);
                                org.telegram.ui.wn wnVar4 = elVar4.H;
                                wnVar4.G5 = null;
                                org.telegram.ui.jk jkVar = wnVar4.Y;
                                if (jkVar != null) {
                                    jkVar.X2 = null;
                                    jkVar.Y2 = false;
                                }
                                MessagePreviewParams messagePreviewParams7 = wnVar4.f5;
                                if (messagePreviewParams7 != null) {
                                    i162 = ((org.telegram.ui.ActionBar.m2) wnVar4).currentAccount;
                                    MessageObject messageObject = wnVar4.n5;
                                    messagePreviewParams7.updateLink(i162, null, null, messageObject == wnVar4.X3 ? null : messageObject, wnVar4.l5, wnVar4.p5);
                                }
                                wnVar4.j8();
                                break;
                            case 12:
                                bc0 bc0Var7 = this.b;
                                MessagePreviewParams messagePreviewParams8 = bc0Var7.c0.d;
                                if (messagePreviewParams8.hasMedia) {
                                    boolean z14 = !messagePreviewParams8.webpageSmall;
                                    messagePreviewParams8.webpageSmall = z14;
                                    bc0Var7.G.a(z14, true);
                                    bc0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                    if (bc0Var7.r.messages.size() > 0 && (message2 = bc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z15 = messagePreviewParams8.webpageSmall;
                                        messageMedia2.force_small_media = z15;
                                        messageMedia2.force_large_media = !z15;
                                    }
                                    if (bc0Var7.r.previewMessages.size() > 0 && (message = bc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z16 = messagePreviewParams8.webpageSmall;
                                        messageMedia.force_small_media = z16;
                                        messageMedia.force_large_media = !z16;
                                    }
                                    bc0Var7.h();
                                    bc0Var7.U = true;
                                    break;
                                }
                                break;
                            default:
                                bc0 bc0Var8 = this.b;
                                MessagePreviewParams messagePreviewParams9 = bc0Var8.c0.d;
                                boolean z17 = messagePreviewParams9.webpageTop;
                                messagePreviewParams9.webpageTop = !z17;
                                bc0Var8.E.a(z17, true);
                                if (bc0Var8.r.messages.size() > 0 && (message4 = bc0Var8.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams9.webpageTop;
                                }
                                if (bc0Var8.r.previewMessages.size() > 0 && (message3 = bc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams9.webpageTop;
                                }
                                bc0Var8.h();
                                bc0Var8.U = true;
                                break;
                        }
                    }
                });
                frameLayout2.addView(sb0Var, w7.y5.c(48.0f, -1));
                frameLayout2.addView(sb0Var2, w7.y5.c(48.0f, -1));
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout2, w7.y5.n(-1, 48));
                r11 = drawable;
            }
            messagePreviewParams = messagePreviewParams2;
            if (!messagePreviewParams.monoforum && !messagePreviewParams.noforwards && !messagePreviewParams.hasSecretMessages) {
                ?? frameLayout3 = new FrameLayout(context3);
                ?? e1Var8 = new org.telegram.ui.ActionBar.e1(1, context3, hc0Var.F, false, false);
                this.x = e1Var8;
                e1Var8.g(LocaleController.getString(R.string.ReplyToAnotherChat), R.drawable.msg_forward_replace, r11);
                final int i26 = 3;
                e1Var8.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.lb0
                    public final /* synthetic */ bc0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i162;
                        TLRPC.Message message;
                        TLRPC.MessageMedia messageMedia;
                        TLRPC.Message message2;
                        TLRPC.MessageMedia messageMedia2;
                        TLRPC.Message message3;
                        TLRPC.Message message4;
                        switch (i26) {
                            case 0:
                                bc0 bc0Var42 = this.b;
                                bc0Var42.c0.d.quote = null;
                                bc0Var42.e.f(false);
                                bc0Var42.g(false, false);
                                bc0Var42.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                bc0 bc0Var5 = this.b;
                                tb0 tb0Var2 = bc0Var5.e;
                                hc0 hc0Var2 = bc0Var5.c0;
                                if (bc0Var5.c(null) != null) {
                                    if (tb0Var2.v - tb0Var2.u <= MessagesController.getInstance(hc0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.y9 y9Var = tb0Var2.W;
                                        MessageObject c11 = bc0Var5.c(y9Var != null ? ((org.telegram.ui.Cells.u1) y9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams5 = hc0Var2.d;
                                        int i172 = tb0Var2.u;
                                        messagePreviewParams5.quoteStart = i172;
                                        int i182 = tb0Var2.v;
                                        messagePreviewParams5.quoteEnd = i182;
                                        messagePreviewParams5.quote = org.telegram.ui.mn.b(i172, i182, c11);
                                        hc0Var2.b();
                                        hc0Var2.a(true);
                                        break;
                                    } else {
                                        bc0Var5.f();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                bc0 bc0Var6 = this.b;
                                tb0 tb0Var3 = bc0Var6.e;
                                hc0 hc0Var3 = bc0Var6.c0;
                                MessagePreviewParams messagePreviewParams6 = hc0Var3.d;
                                int i192 = hc0Var3.w;
                                boolean z132 = hc0Var3.b;
                                if (messagePreviewParams6.quote != null && !z132) {
                                    messagePreviewParams6.quote = null;
                                    tb0Var3.f(false);
                                    bc0Var6.g(false, true);
                                    bc0Var6.k(true);
                                    break;
                                } else if (tb0Var3.v - tb0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                    MessageObject c12 = bc0Var6.c(null);
                                    if (c12 != null) {
                                        if (!tb0Var3.y()) {
                                            messagePreviewParams6.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                            messagePreviewParams6.quoteEnd = min;
                                            messagePreviewParams6.quote = org.telegram.ui.mn.b(messagePreviewParams6.quoteStart, min, c12);
                                            View d10 = bc0Var6.d();
                                            if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                tb0Var3.a0((org.telegram.ui.Cells.u1) d10, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                            }
                                            if (!z132) {
                                                bc0Var6.s.getSwipeBack().e(bc0Var6.I);
                                            }
                                            bc0Var6.g(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams6.quoteStart = tb0Var3.u;
                                            messagePreviewParams6.quoteEnd = tb0Var3.v;
                                            org.telegram.ui.Cells.y9 y9Var2 = tb0Var3.W;
                                            messagePreviewParams6.quote = org.telegram.ui.mn.b(messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd, bc0Var6.c(y9Var2 != null ? ((org.telegram.ui.Cells.u1) y9Var2).getMessageObject() : null));
                                            hc0Var3.b();
                                            hc0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    bc0Var6.f();
                                    break;
                                }
                                break;
                            case 3:
                                this.b.c0.c(false);
                                break;
                            case 4:
                                this.b.c0.c(false);
                                break;
                            case 5:
                                this.b.c0.a(true);
                                break;
                            case 6:
                                hc0 hc0Var4 = this.b.c0;
                                if (!hc0Var4.b) {
                                    org.telegram.ui.el elVar = (org.telegram.ui.el) hc0Var4;
                                    elVar.a(true);
                                    org.telegram.ui.wn wnVar = elVar.H;
                                    wnVar.n5 = null;
                                    wnVar.l5 = null;
                                    wnVar.f5.updateReply(null, null, wnVar.T5, null);
                                    wnVar.j8();
                                    break;
                                } else {
                                    org.telegram.ui.el elVar2 = (org.telegram.ui.el) hc0Var4;
                                    elVar2.a(true);
                                    org.telegram.ui.wn wnVar2 = elVar2.H;
                                    wnVar2.l5 = null;
                                    wnVar2.Bb(wnVar2.n5);
                                    break;
                                }
                            case 7:
                                this.b.c0.c(true);
                                break;
                            case 8:
                                this.b.c0.a(true);
                                break;
                            case 9:
                                org.telegram.ui.el elVar3 = (org.telegram.ui.el) this.b.c0;
                                elVar3.a(true);
                                org.telegram.ui.wn wnVar3 = elVar3.H;
                                wnVar3.f5.updateForward(null, wnVar3.T5);
                                wnVar3.j8();
                                break;
                            case 10:
                                this.b.c0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.el elVar4 = (org.telegram.ui.el) this.b.c0;
                                elVar4.a(true);
                                org.telegram.ui.wn wnVar4 = elVar4.H;
                                wnVar4.G5 = null;
                                org.telegram.ui.jk jkVar = wnVar4.Y;
                                if (jkVar != null) {
                                    jkVar.X2 = null;
                                    jkVar.Y2 = false;
                                }
                                MessagePreviewParams messagePreviewParams7 = wnVar4.f5;
                                if (messagePreviewParams7 != null) {
                                    i162 = ((org.telegram.ui.ActionBar.m2) wnVar4).currentAccount;
                                    MessageObject messageObject = wnVar4.n5;
                                    messagePreviewParams7.updateLink(i162, null, null, messageObject == wnVar4.X3 ? null : messageObject, wnVar4.l5, wnVar4.p5);
                                }
                                wnVar4.j8();
                                break;
                            case 12:
                                bc0 bc0Var7 = this.b;
                                MessagePreviewParams messagePreviewParams8 = bc0Var7.c0.d;
                                if (messagePreviewParams8.hasMedia) {
                                    boolean z14 = !messagePreviewParams8.webpageSmall;
                                    messagePreviewParams8.webpageSmall = z14;
                                    bc0Var7.G.a(z14, true);
                                    bc0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                    if (bc0Var7.r.messages.size() > 0 && (message2 = bc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z15 = messagePreviewParams8.webpageSmall;
                                        messageMedia2.force_small_media = z15;
                                        messageMedia2.force_large_media = !z15;
                                    }
                                    if (bc0Var7.r.previewMessages.size() > 0 && (message = bc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z16 = messagePreviewParams8.webpageSmall;
                                        messageMedia.force_small_media = z16;
                                        messageMedia.force_large_media = !z16;
                                    }
                                    bc0Var7.h();
                                    bc0Var7.U = true;
                                    break;
                                }
                                break;
                            default:
                                bc0 bc0Var8 = this.b;
                                MessagePreviewParams messagePreviewParams9 = bc0Var8.c0.d;
                                boolean z17 = messagePreviewParams9.webpageTop;
                                messagePreviewParams9.webpageTop = !z17;
                                bc0Var8.E.a(z17, true);
                                if (bc0Var8.r.messages.size() > 0 && (message4 = bc0Var8.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams9.webpageTop;
                                }
                                if (bc0Var8.r.previewMessages.size() > 0 && (message3 = bc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams9.webpageTop;
                                }
                                bc0Var8.h();
                                bc0Var8.U = true;
                                break;
                        }
                    }
                });
                context3 = context;
                ?? e1Var9 = new org.telegram.ui.ActionBar.e1(1, context3, hc0Var.F, false, false);
                this.y = e1Var9;
                e1Var9.g(LocaleController.getString(R.string.QuoteToAnotherChat), R.drawable.msg_forward_replace, r11);
                final int i27 = 4;
                e1Var9.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.lb0
                    public final /* synthetic */ bc0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i162;
                        TLRPC.Message message;
                        TLRPC.MessageMedia messageMedia;
                        TLRPC.Message message2;
                        TLRPC.MessageMedia messageMedia2;
                        TLRPC.Message message3;
                        TLRPC.Message message4;
                        switch (i27) {
                            case 0:
                                bc0 bc0Var42 = this.b;
                                bc0Var42.c0.d.quote = null;
                                bc0Var42.e.f(false);
                                bc0Var42.g(false, false);
                                bc0Var42.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                bc0 bc0Var5 = this.b;
                                tb0 tb0Var2 = bc0Var5.e;
                                hc0 hc0Var2 = bc0Var5.c0;
                                if (bc0Var5.c(null) != null) {
                                    if (tb0Var2.v - tb0Var2.u <= MessagesController.getInstance(hc0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.y9 y9Var = tb0Var2.W;
                                        MessageObject c11 = bc0Var5.c(y9Var != null ? ((org.telegram.ui.Cells.u1) y9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams5 = hc0Var2.d;
                                        int i172 = tb0Var2.u;
                                        messagePreviewParams5.quoteStart = i172;
                                        int i182 = tb0Var2.v;
                                        messagePreviewParams5.quoteEnd = i182;
                                        messagePreviewParams5.quote = org.telegram.ui.mn.b(i172, i182, c11);
                                        hc0Var2.b();
                                        hc0Var2.a(true);
                                        break;
                                    } else {
                                        bc0Var5.f();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                bc0 bc0Var6 = this.b;
                                tb0 tb0Var3 = bc0Var6.e;
                                hc0 hc0Var3 = bc0Var6.c0;
                                MessagePreviewParams messagePreviewParams6 = hc0Var3.d;
                                int i192 = hc0Var3.w;
                                boolean z132 = hc0Var3.b;
                                if (messagePreviewParams6.quote != null && !z132) {
                                    messagePreviewParams6.quote = null;
                                    tb0Var3.f(false);
                                    bc0Var6.g(false, true);
                                    bc0Var6.k(true);
                                    break;
                                } else if (tb0Var3.v - tb0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                    MessageObject c12 = bc0Var6.c(null);
                                    if (c12 != null) {
                                        if (!tb0Var3.y()) {
                                            messagePreviewParams6.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                            messagePreviewParams6.quoteEnd = min;
                                            messagePreviewParams6.quote = org.telegram.ui.mn.b(messagePreviewParams6.quoteStart, min, c12);
                                            View d10 = bc0Var6.d();
                                            if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                tb0Var3.a0((org.telegram.ui.Cells.u1) d10, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                            }
                                            if (!z132) {
                                                bc0Var6.s.getSwipeBack().e(bc0Var6.I);
                                            }
                                            bc0Var6.g(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams6.quoteStart = tb0Var3.u;
                                            messagePreviewParams6.quoteEnd = tb0Var3.v;
                                            org.telegram.ui.Cells.y9 y9Var2 = tb0Var3.W;
                                            messagePreviewParams6.quote = org.telegram.ui.mn.b(messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd, bc0Var6.c(y9Var2 != null ? ((org.telegram.ui.Cells.u1) y9Var2).getMessageObject() : null));
                                            hc0Var3.b();
                                            hc0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    bc0Var6.f();
                                    break;
                                }
                                break;
                            case 3:
                                this.b.c0.c(false);
                                break;
                            case 4:
                                this.b.c0.c(false);
                                break;
                            case 5:
                                this.b.c0.a(true);
                                break;
                            case 6:
                                hc0 hc0Var4 = this.b.c0;
                                if (!hc0Var4.b) {
                                    org.telegram.ui.el elVar = (org.telegram.ui.el) hc0Var4;
                                    elVar.a(true);
                                    org.telegram.ui.wn wnVar = elVar.H;
                                    wnVar.n5 = null;
                                    wnVar.l5 = null;
                                    wnVar.f5.updateReply(null, null, wnVar.T5, null);
                                    wnVar.j8();
                                    break;
                                } else {
                                    org.telegram.ui.el elVar2 = (org.telegram.ui.el) hc0Var4;
                                    elVar2.a(true);
                                    org.telegram.ui.wn wnVar2 = elVar2.H;
                                    wnVar2.l5 = null;
                                    wnVar2.Bb(wnVar2.n5);
                                    break;
                                }
                            case 7:
                                this.b.c0.c(true);
                                break;
                            case 8:
                                this.b.c0.a(true);
                                break;
                            case 9:
                                org.telegram.ui.el elVar3 = (org.telegram.ui.el) this.b.c0;
                                elVar3.a(true);
                                org.telegram.ui.wn wnVar3 = elVar3.H;
                                wnVar3.f5.updateForward(null, wnVar3.T5);
                                wnVar3.j8();
                                break;
                            case 10:
                                this.b.c0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.el elVar4 = (org.telegram.ui.el) this.b.c0;
                                elVar4.a(true);
                                org.telegram.ui.wn wnVar4 = elVar4.H;
                                wnVar4.G5 = null;
                                org.telegram.ui.jk jkVar = wnVar4.Y;
                                if (jkVar != null) {
                                    jkVar.X2 = null;
                                    jkVar.Y2 = false;
                                }
                                MessagePreviewParams messagePreviewParams7 = wnVar4.f5;
                                if (messagePreviewParams7 != null) {
                                    i162 = ((org.telegram.ui.ActionBar.m2) wnVar4).currentAccount;
                                    MessageObject messageObject = wnVar4.n5;
                                    messagePreviewParams7.updateLink(i162, null, null, messageObject == wnVar4.X3 ? null : messageObject, wnVar4.l5, wnVar4.p5);
                                }
                                wnVar4.j8();
                                break;
                            case 12:
                                bc0 bc0Var7 = this.b;
                                MessagePreviewParams messagePreviewParams8 = bc0Var7.c0.d;
                                if (messagePreviewParams8.hasMedia) {
                                    boolean z14 = !messagePreviewParams8.webpageSmall;
                                    messagePreviewParams8.webpageSmall = z14;
                                    bc0Var7.G.a(z14, true);
                                    bc0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                    if (bc0Var7.r.messages.size() > 0 && (message2 = bc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z15 = messagePreviewParams8.webpageSmall;
                                        messageMedia2.force_small_media = z15;
                                        messageMedia2.force_large_media = !z15;
                                    }
                                    if (bc0Var7.r.previewMessages.size() > 0 && (message = bc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z16 = messagePreviewParams8.webpageSmall;
                                        messageMedia.force_small_media = z16;
                                        messageMedia.force_large_media = !z16;
                                    }
                                    bc0Var7.h();
                                    bc0Var7.U = true;
                                    break;
                                }
                                break;
                            default:
                                bc0 bc0Var8 = this.b;
                                MessagePreviewParams messagePreviewParams9 = bc0Var8.c0.d;
                                boolean z17 = messagePreviewParams9.webpageTop;
                                messagePreviewParams9.webpageTop = !z17;
                                bc0Var8.E.a(z17, true);
                                if (bc0Var8.r.messages.size() > 0 && (message4 = bc0Var8.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams9.webpageTop;
                                }
                                if (bc0Var8.r.previewMessages.size() > 0 && (message3 = bc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams9.webpageTop;
                                }
                                bc0Var8.h();
                                bc0Var8.U = true;
                                break;
                        }
                    }
                });
                frameLayout3.addView(e1Var9, w7.y5.c(48.0f, -1));
                frameLayout3.addView(e1Var8, w7.y5.c(48.0f, -1));
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout3, w7.y5.n(-1, 48));
            }
            if (!messagePreviewParams.noforwards && !messagePreviewParams.hasSecretMessages) {
                org.telegram.ui.ActionBar.j1 j1Var4 = new org.telegram.ui.ActionBar.j1(context3, dc0Var);
                j1Var4.setColor(org.telegram.ui.ActionBar.h6.l1(0.06f, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.E8, dc0Var)));
                j1Var4.setTag(R.id.fit_width_tag, 1);
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(j1Var4, w7.y5.n(-1, 8));
            }
            g(messagePreviewParams.quote != null, false);
            ?? e1Var10 = new org.telegram.ui.ActionBar.e1(1, context3, hc0Var.F, false, false);
            e1Var10.g(LocaleController.getString(R.string.ApplyChanges), R.drawable.msg_select, r11);
            final int i28 = 5;
            e1Var10.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.lb0
                public final /* synthetic */ bc0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i162;
                    TLRPC.Message message;
                    TLRPC.MessageMedia messageMedia;
                    TLRPC.Message message2;
                    TLRPC.MessageMedia messageMedia2;
                    TLRPC.Message message3;
                    TLRPC.Message message4;
                    switch (i28) {
                        case 0:
                            bc0 bc0Var42 = this.b;
                            bc0Var42.c0.d.quote = null;
                            bc0Var42.e.f(false);
                            bc0Var42.g(false, false);
                            bc0Var42.s.getSwipeBack().b(true);
                            break;
                        case 1:
                            bc0 bc0Var5 = this.b;
                            tb0 tb0Var2 = bc0Var5.e;
                            hc0 hc0Var2 = bc0Var5.c0;
                            if (bc0Var5.c(null) != null) {
                                if (tb0Var2.v - tb0Var2.u <= MessagesController.getInstance(hc0Var2.w).quoteLengthMax) {
                                    org.telegram.ui.Cells.y9 y9Var = tb0Var2.W;
                                    MessageObject c11 = bc0Var5.c(y9Var != null ? ((org.telegram.ui.Cells.u1) y9Var).getMessageObject() : null);
                                    MessagePreviewParams messagePreviewParams5 = hc0Var2.d;
                                    int i172 = tb0Var2.u;
                                    messagePreviewParams5.quoteStart = i172;
                                    int i182 = tb0Var2.v;
                                    messagePreviewParams5.quoteEnd = i182;
                                    messagePreviewParams5.quote = org.telegram.ui.mn.b(i172, i182, c11);
                                    hc0Var2.b();
                                    hc0Var2.a(true);
                                    break;
                                } else {
                                    bc0Var5.f();
                                    break;
                                }
                            }
                            break;
                        case 2:
                            bc0 bc0Var6 = this.b;
                            tb0 tb0Var3 = bc0Var6.e;
                            hc0 hc0Var3 = bc0Var6.c0;
                            MessagePreviewParams messagePreviewParams6 = hc0Var3.d;
                            int i192 = hc0Var3.w;
                            boolean z132 = hc0Var3.b;
                            if (messagePreviewParams6.quote != null && !z132) {
                                messagePreviewParams6.quote = null;
                                tb0Var3.f(false);
                                bc0Var6.g(false, true);
                                bc0Var6.k(true);
                                break;
                            } else if (tb0Var3.v - tb0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                MessageObject c12 = bc0Var6.c(null);
                                if (c12 != null) {
                                    if (!tb0Var3.y()) {
                                        messagePreviewParams6.quoteStart = 0;
                                        int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                        messagePreviewParams6.quoteEnd = min;
                                        messagePreviewParams6.quote = org.telegram.ui.mn.b(messagePreviewParams6.quoteStart, min, c12);
                                        View d10 = bc0Var6.d();
                                        if (d10 instanceof org.telegram.ui.Cells.u1) {
                                            tb0Var3.a0((org.telegram.ui.Cells.u1) d10, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                        }
                                        if (!z132) {
                                            bc0Var6.s.getSwipeBack().e(bc0Var6.I);
                                        }
                                        bc0Var6.g(true, true);
                                        break;
                                    } else {
                                        messagePreviewParams6.quoteStart = tb0Var3.u;
                                        messagePreviewParams6.quoteEnd = tb0Var3.v;
                                        org.telegram.ui.Cells.y9 y9Var2 = tb0Var3.W;
                                        messagePreviewParams6.quote = org.telegram.ui.mn.b(messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd, bc0Var6.c(y9Var2 != null ? ((org.telegram.ui.Cells.u1) y9Var2).getMessageObject() : null));
                                        hc0Var3.b();
                                        hc0Var3.a(true);
                                        break;
                                    }
                                }
                            } else {
                                bc0Var6.f();
                                break;
                            }
                            break;
                        case 3:
                            this.b.c0.c(false);
                            break;
                        case 4:
                            this.b.c0.c(false);
                            break;
                        case 5:
                            this.b.c0.a(true);
                            break;
                        case 6:
                            hc0 hc0Var4 = this.b.c0;
                            if (!hc0Var4.b) {
                                org.telegram.ui.el elVar = (org.telegram.ui.el) hc0Var4;
                                elVar.a(true);
                                org.telegram.ui.wn wnVar = elVar.H;
                                wnVar.n5 = null;
                                wnVar.l5 = null;
                                wnVar.f5.updateReply(null, null, wnVar.T5, null);
                                wnVar.j8();
                                break;
                            } else {
                                org.telegram.ui.el elVar2 = (org.telegram.ui.el) hc0Var4;
                                elVar2.a(true);
                                org.telegram.ui.wn wnVar2 = elVar2.H;
                                wnVar2.l5 = null;
                                wnVar2.Bb(wnVar2.n5);
                                break;
                            }
                        case 7:
                            this.b.c0.c(true);
                            break;
                        case 8:
                            this.b.c0.a(true);
                            break;
                        case 9:
                            org.telegram.ui.el elVar3 = (org.telegram.ui.el) this.b.c0;
                            elVar3.a(true);
                            org.telegram.ui.wn wnVar3 = elVar3.H;
                            wnVar3.f5.updateForward(null, wnVar3.T5);
                            wnVar3.j8();
                            break;
                        case 10:
                            this.b.c0.a(true);
                            break;
                        case 11:
                            org.telegram.ui.el elVar4 = (org.telegram.ui.el) this.b.c0;
                            elVar4.a(true);
                            org.telegram.ui.wn wnVar4 = elVar4.H;
                            wnVar4.G5 = null;
                            org.telegram.ui.jk jkVar = wnVar4.Y;
                            if (jkVar != null) {
                                jkVar.X2 = null;
                                jkVar.Y2 = false;
                            }
                            MessagePreviewParams messagePreviewParams7 = wnVar4.f5;
                            if (messagePreviewParams7 != null) {
                                i162 = ((org.telegram.ui.ActionBar.m2) wnVar4).currentAccount;
                                MessageObject messageObject = wnVar4.n5;
                                messagePreviewParams7.updateLink(i162, null, null, messageObject == wnVar4.X3 ? null : messageObject, wnVar4.l5, wnVar4.p5);
                            }
                            wnVar4.j8();
                            break;
                        case 12:
                            bc0 bc0Var7 = this.b;
                            MessagePreviewParams messagePreviewParams8 = bc0Var7.c0.d;
                            if (messagePreviewParams8.hasMedia) {
                                boolean z14 = !messagePreviewParams8.webpageSmall;
                                messagePreviewParams8.webpageSmall = z14;
                                bc0Var7.G.a(z14, true);
                                bc0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                if (bc0Var7.r.messages.size() > 0 && (message2 = bc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                    boolean z15 = messagePreviewParams8.webpageSmall;
                                    messageMedia2.force_small_media = z15;
                                    messageMedia2.force_large_media = !z15;
                                }
                                if (bc0Var7.r.previewMessages.size() > 0 && (message = bc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                    boolean z16 = messagePreviewParams8.webpageSmall;
                                    messageMedia.force_small_media = z16;
                                    messageMedia.force_large_media = !z16;
                                }
                                bc0Var7.h();
                                bc0Var7.U = true;
                                break;
                            }
                            break;
                        default:
                            bc0 bc0Var8 = this.b;
                            MessagePreviewParams messagePreviewParams9 = bc0Var8.c0.d;
                            boolean z17 = messagePreviewParams9.webpageTop;
                            messagePreviewParams9.webpageTop = !z17;
                            bc0Var8.E.a(z17, true);
                            if (bc0Var8.r.messages.size() > 0 && (message4 = bc0Var8.r.messages.get(0).messageOwner) != null) {
                                message4.invert_media = messagePreviewParams9.webpageTop;
                            }
                            if (bc0Var8.r.previewMessages.size() > 0 && (message3 = bc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                message3.invert_media = messagePreviewParams9.webpageTop;
                            }
                            bc0Var8.h();
                            bc0Var8.U = true;
                            break;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var10, w7.y5.n(-1, 48));
            ?? e1Var11 = new org.telegram.ui.ActionBar.e1(1, context, hc0Var.F, false, true);
            e1Var11.g(LocaleController.getString(z12 ? R.string.DoNotQuote : R.string.DoNotReply), R.drawable.msg_delete, r11);
            int v04 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.q7, dc0Var);
            int i29 = org.telegram.ui.ActionBar.h6.p7;
            e1Var11.c(v04, org.telegram.ui.ActionBar.h6.v0(i29, dc0Var));
            e1Var11.setSelectorColor(org.telegram.ui.ActionBar.h6.l1(0.12f, org.telegram.ui.ActionBar.h6.w0(r11, i29, false)));
            final int i30 = 6;
            e1Var11.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.lb0
                public final /* synthetic */ bc0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i162;
                    TLRPC.Message message;
                    TLRPC.MessageMedia messageMedia;
                    TLRPC.Message message2;
                    TLRPC.MessageMedia messageMedia2;
                    TLRPC.Message message3;
                    TLRPC.Message message4;
                    switch (i30) {
                        case 0:
                            bc0 bc0Var42 = this.b;
                            bc0Var42.c0.d.quote = null;
                            bc0Var42.e.f(false);
                            bc0Var42.g(false, false);
                            bc0Var42.s.getSwipeBack().b(true);
                            break;
                        case 1:
                            bc0 bc0Var5 = this.b;
                            tb0 tb0Var2 = bc0Var5.e;
                            hc0 hc0Var2 = bc0Var5.c0;
                            if (bc0Var5.c(null) != null) {
                                if (tb0Var2.v - tb0Var2.u <= MessagesController.getInstance(hc0Var2.w).quoteLengthMax) {
                                    org.telegram.ui.Cells.y9 y9Var = tb0Var2.W;
                                    MessageObject c11 = bc0Var5.c(y9Var != null ? ((org.telegram.ui.Cells.u1) y9Var).getMessageObject() : null);
                                    MessagePreviewParams messagePreviewParams5 = hc0Var2.d;
                                    int i172 = tb0Var2.u;
                                    messagePreviewParams5.quoteStart = i172;
                                    int i182 = tb0Var2.v;
                                    messagePreviewParams5.quoteEnd = i182;
                                    messagePreviewParams5.quote = org.telegram.ui.mn.b(i172, i182, c11);
                                    hc0Var2.b();
                                    hc0Var2.a(true);
                                    break;
                                } else {
                                    bc0Var5.f();
                                    break;
                                }
                            }
                            break;
                        case 2:
                            bc0 bc0Var6 = this.b;
                            tb0 tb0Var3 = bc0Var6.e;
                            hc0 hc0Var3 = bc0Var6.c0;
                            MessagePreviewParams messagePreviewParams6 = hc0Var3.d;
                            int i192 = hc0Var3.w;
                            boolean z132 = hc0Var3.b;
                            if (messagePreviewParams6.quote != null && !z132) {
                                messagePreviewParams6.quote = null;
                                tb0Var3.f(false);
                                bc0Var6.g(false, true);
                                bc0Var6.k(true);
                                break;
                            } else if (tb0Var3.v - tb0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                MessageObject c12 = bc0Var6.c(null);
                                if (c12 != null) {
                                    if (!tb0Var3.y()) {
                                        messagePreviewParams6.quoteStart = 0;
                                        int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                        messagePreviewParams6.quoteEnd = min;
                                        messagePreviewParams6.quote = org.telegram.ui.mn.b(messagePreviewParams6.quoteStart, min, c12);
                                        View d10 = bc0Var6.d();
                                        if (d10 instanceof org.telegram.ui.Cells.u1) {
                                            tb0Var3.a0((org.telegram.ui.Cells.u1) d10, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                        }
                                        if (!z132) {
                                            bc0Var6.s.getSwipeBack().e(bc0Var6.I);
                                        }
                                        bc0Var6.g(true, true);
                                        break;
                                    } else {
                                        messagePreviewParams6.quoteStart = tb0Var3.u;
                                        messagePreviewParams6.quoteEnd = tb0Var3.v;
                                        org.telegram.ui.Cells.y9 y9Var2 = tb0Var3.W;
                                        messagePreviewParams6.quote = org.telegram.ui.mn.b(messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd, bc0Var6.c(y9Var2 != null ? ((org.telegram.ui.Cells.u1) y9Var2).getMessageObject() : null));
                                        hc0Var3.b();
                                        hc0Var3.a(true);
                                        break;
                                    }
                                }
                            } else {
                                bc0Var6.f();
                                break;
                            }
                            break;
                        case 3:
                            this.b.c0.c(false);
                            break;
                        case 4:
                            this.b.c0.c(false);
                            break;
                        case 5:
                            this.b.c0.a(true);
                            break;
                        case 6:
                            hc0 hc0Var4 = this.b.c0;
                            if (!hc0Var4.b) {
                                org.telegram.ui.el elVar = (org.telegram.ui.el) hc0Var4;
                                elVar.a(true);
                                org.telegram.ui.wn wnVar = elVar.H;
                                wnVar.n5 = null;
                                wnVar.l5 = null;
                                wnVar.f5.updateReply(null, null, wnVar.T5, null);
                                wnVar.j8();
                                break;
                            } else {
                                org.telegram.ui.el elVar2 = (org.telegram.ui.el) hc0Var4;
                                elVar2.a(true);
                                org.telegram.ui.wn wnVar2 = elVar2.H;
                                wnVar2.l5 = null;
                                wnVar2.Bb(wnVar2.n5);
                                break;
                            }
                        case 7:
                            this.b.c0.c(true);
                            break;
                        case 8:
                            this.b.c0.a(true);
                            break;
                        case 9:
                            org.telegram.ui.el elVar3 = (org.telegram.ui.el) this.b.c0;
                            elVar3.a(true);
                            org.telegram.ui.wn wnVar3 = elVar3.H;
                            wnVar3.f5.updateForward(null, wnVar3.T5);
                            wnVar3.j8();
                            break;
                        case 10:
                            this.b.c0.a(true);
                            break;
                        case 11:
                            org.telegram.ui.el elVar4 = (org.telegram.ui.el) this.b.c0;
                            elVar4.a(true);
                            org.telegram.ui.wn wnVar4 = elVar4.H;
                            wnVar4.G5 = null;
                            org.telegram.ui.jk jkVar = wnVar4.Y;
                            if (jkVar != null) {
                                jkVar.X2 = null;
                                jkVar.Y2 = false;
                            }
                            MessagePreviewParams messagePreviewParams7 = wnVar4.f5;
                            if (messagePreviewParams7 != null) {
                                i162 = ((org.telegram.ui.ActionBar.m2) wnVar4).currentAccount;
                                MessageObject messageObject = wnVar4.n5;
                                messagePreviewParams7.updateLink(i162, null, null, messageObject == wnVar4.X3 ? null : messageObject, wnVar4.l5, wnVar4.p5);
                            }
                            wnVar4.j8();
                            break;
                        case 12:
                            bc0 bc0Var7 = this.b;
                            MessagePreviewParams messagePreviewParams8 = bc0Var7.c0.d;
                            if (messagePreviewParams8.hasMedia) {
                                boolean z14 = !messagePreviewParams8.webpageSmall;
                                messagePreviewParams8.webpageSmall = z14;
                                bc0Var7.G.a(z14, true);
                                bc0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                if (bc0Var7.r.messages.size() > 0 && (message2 = bc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                    boolean z15 = messagePreviewParams8.webpageSmall;
                                    messageMedia2.force_small_media = z15;
                                    messageMedia2.force_large_media = !z15;
                                }
                                if (bc0Var7.r.previewMessages.size() > 0 && (message = bc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                    boolean z16 = messagePreviewParams8.webpageSmall;
                                    messageMedia.force_small_media = z16;
                                    messageMedia.force_large_media = !z16;
                                }
                                bc0Var7.h();
                                bc0Var7.U = true;
                                break;
                            }
                            break;
                        default:
                            bc0 bc0Var8 = this.b;
                            MessagePreviewParams messagePreviewParams9 = bc0Var8.c0.d;
                            boolean z17 = messagePreviewParams9.webpageTop;
                            messagePreviewParams9.webpageTop = !z17;
                            bc0Var8.E.a(z17, true);
                            if (bc0Var8.r.messages.size() > 0 && (message4 = bc0Var8.r.messages.get(0).messageOwner) != null) {
                                message4.invert_media = messagePreviewParams9.webpageTop;
                            }
                            if (bc0Var8.r.previewMessages.size() > 0 && (message3 = bc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                message3.invert_media = messagePreviewParams9.webpageTop;
                            }
                            bc0Var8.h();
                            bc0Var8.U = true;
                            break;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var11, w7.y5.n(-1, 48));
            context2 = context;
            bc0Var2 = this;
            viewOutlineProvider = r11;
        }
        int i31 = bc0Var2.a;
        if (i31 == 1) {
            bc0Var2.r = messagePreviewParams.forwardMessages;
        } else if (i31 == 0) {
            bc0Var2.r = messagePreviewParams.replyMessage;
        } else if (i31 == 2) {
            bc0Var2.r = messagePreviewParams.linkMessage;
        }
        org.telegram.ui.Cells.ca o9 = bc0Var2.e.o(context2);
        bc0Var2.d = o9;
        o9.setElevation(AndroidUtilities.dp(8.0f));
        o9.setOutlineProvider(viewOutlineProvider);
        if (o9.getParent() instanceof ViewGroup) {
            ((ViewGroup) o9.getParent()).removeView(o9);
        }
        bc0Var2.addView(o9, w7.y5.d(-1, -1.0f, 51, 0.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / AndroidUtilities.density, 0.0f, 0.0f));
        bc0Var2.e.T(bc0Var2.f);
    }

    public static MessageObject.GroupedMessages a(bc0 bc0Var, MessageObject messageObject) {
        if (messageObject.getGroupId() == 0) {
            return null;
        }
        MessageObject.GroupedMessages groupedMessages = bc0Var.r.groupedMessagesMap.get(messageObject.getGroupId());
        if (groupedMessages == null || (groupedMessages.messages.size() > 1 && groupedMessages.getPosition(messageObject) != null)) {
            return groupedMessages;
        }
        return null;
    }

    public static void b(bc0 bc0Var, org.telegram.ui.Cells.u1 u1Var) {
        CharacterStyle characterStyle;
        TLRPC.WebPage webPage;
        if (bc0Var.a == 2) {
            MessagePreviewParams messagePreviewParams = bc0Var.c0.d;
            if (!messagePreviewParams.singleLink && (characterStyle = messagePreviewParams.currentLink) != null && (webPage = messagePreviewParams.webpage) != null && !(webPage instanceof TLRPC.TL_webPagePending)) {
                u1Var.Q3(characterStyle);
                return;
            }
        }
        u1Var.Q3(null);
    }

    public final MessageObject c(MessageObject messageObject) {
        MessageObject.GroupedMessages valueAt;
        hc0 hc0Var = this.c0;
        MessagePreviewParams.Messages messages = hc0Var.d.replyMessage;
        if (messages == null) {
            return null;
        }
        LongSparseArray<MessageObject.GroupedMessages> longSparseArray = messages.groupedMessagesMap;
        if (longSparseArray == null || longSparseArray.size() <= 0 || (valueAt = hc0Var.d.replyMessage.groupedMessagesMap.valueAt(0)) == null) {
            return hc0Var.d.replyMessage.messages.get(0);
        }
        if (valueAt.isDocuments) {
            if (messageObject != null) {
                return messageObject;
            }
            org.telegram.ui.mn mnVar = hc0Var.d.quote;
            if (mnVar != null) {
                return mnVar.a;
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
        MessageObject c10 = c(null);
        if (c10 != null) {
            int i10 = 0;
            while (true) {
                ub0 ub0Var = this.f;
                if (i10 >= ub0Var.getChildCount()) {
                    break;
                }
                View childAt = ub0Var.getChildAt(i10);
                org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) childAt;
                if (o4Var.getMessageObject() != null && (o4Var.getMessageObject() == c10 || o4Var.getMessageObject().getId() == c10.getId())) {
                    break;
                }
                i10++;
            }
        }
        return null;
    }

    public final void e(float f7, int i10) {
        boolean z10 = this.c0.v;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        ci.m6 m6Var = this.c;
        org.telegram.ui.w8 w8Var = this.b;
        if (z10) {
            m6Var.setTranslationY(0.0f);
            w8Var.invalidateOutline();
            w8Var.setTranslationY(0.0f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(0.0f);
        } else {
            m6Var.setTranslationY(i10);
            w8Var.invalidateOutline();
            w8Var.setTranslationY(f7);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((f7 + w8Var.getMeasuredHeight()) - AndroidUtilities.dp(2.0f));
        }
        float x10 = w8Var.getX();
        org.telegram.ui.Cells.ca caVar = this.d;
        caVar.setTranslationX(x10);
        caVar.setTranslationY(w8Var.getY());
    }

    public final void f() {
        hc0 hc0Var = this.c0;
        new xc(hc0Var, hc0Var.F).M(LocaleController.getString(R.string.QuoteMaxError), LocaleController.getString(R.string.QuoteMaxErrorMessage), R.raw.error).j();
    }

    public final void g(boolean z10, boolean z11) {
        if (this.c0.b) {
            z10 = false;
        }
        if (z11 && this.O == z10) {
            return;
        }
        this.O = z10;
        AnimatorSet animatorSet = this.P;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.P = null;
        }
        org.telegram.ui.ActionBar.e1 e1Var = this.y;
        org.telegram.ui.ActionBar.e1 e1Var2 = this.x;
        sb0 sb0Var = this.w;
        sb0 sb0Var2 = this.v;
        if (!z11) {
            if (sb0Var2 != null) {
                sb0Var2.setAlpha(!z10 ? 1.0f : 0.0f);
                sb0Var2.setVisibility(!z10 ? 0 : 4);
            }
            if (sb0Var != null) {
                sb0Var.setAlpha(z10 ? 1.0f : 0.0f);
                sb0Var.setVisibility(z10 ? 0 : 4);
            }
            if (e1Var2 != null) {
                e1Var2.setAlpha(!z10 ? 1.0f : 0.0f);
                e1Var2.setVisibility(!z10 ? 0 : 4);
            }
            if (e1Var != null) {
                e1Var.setAlpha(z10 ? 1.0f : 0.0f);
                e1Var.setVisibility(z10 ? 0 : 4);
                return;
            }
            return;
        }
        this.P = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        if (sb0Var2 != null) {
            sb0Var2.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(sb0Var2, (Property<sb0, Float>) property, !z10 ? 1.0f : 0.0f));
        }
        if (sb0Var != null) {
            sb0Var.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(sb0Var, (Property<sb0, Float>) property, z10 ? 1.0f : 0.0f));
        }
        if (e1Var2 != null) {
            e1Var2.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(e1Var2, (Property<org.telegram.ui.ActionBar.e1, Float>) property, !z10 ? 1.0f : 0.0f));
        }
        if (e1Var != null) {
            e1Var.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(e1Var, (Property<org.telegram.ui.ActionBar.e1, Float>) property, z10 ? 1.0f : 0.0f));
        }
        this.P.playTogether(arrayList);
        this.P.setDuration(360L);
        this.P.setInterpolator(sr.h);
        this.P.addListener(new ca(15, this, z10));
        this.P.start();
    }

    public final void h() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        hc0 hc0Var = this.c0;
        MessagePreviewParams messagePreviewParams = hc0Var.d;
        wb0 wb0Var = this.h;
        if (wb0Var.k()) {
            this.V = true;
            return;
        }
        for (int i10 = 0; i10 < this.r.previewMessages.size(); i10++) {
            MessageObject messageObject = this.r.previewMessages.get(i10);
            messageObject.forceUpdate = true;
            messageObject.sendAsPeer = hc0Var.a;
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
                    boolean z10 = messagePreviewParams.webpageSmall;
                    messageMedia2.force_large_media = !z10;
                    messageMedia2.force_small_media = z10;
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
            wb0Var.V(this.r.groupedMessagesMap.valueAt(i12));
        }
        this.n.q(0, this.r.previewMessages.size());
    }

    public final void i() {
        int i10 = this.R;
        float f7 = this.S;
        hc0 hc0Var = this.c0;
        boolean z10 = hc0Var.v;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        ub0 ub0Var = this.f;
        if (z10) {
            this.S = 0.0f;
            this.R = 0;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(AndroidUtilities.dp(8.0f) + ub0Var.getMeasuredWidth());
        } else {
            int measuredHeight = ub0Var.getMeasuredHeight();
            int i11 = 0;
            for (int i12 = 0; i12 < ub0Var.getChildCount(); i12++) {
                View childAt = ub0Var.getChildAt(i12);
                if (RecyclerView.R(childAt) != -1) {
                    measuredHeight = Math.min(measuredHeight, childAt.getTop());
                    i11++;
                }
            }
            MessagePreviewParams.Messages messages = this.r;
            if (messages == null || i11 == 0 || i11 > messages.previewMessages.size()) {
                this.R = 0;
            } else {
                int b10 = org.telegram.messenger.f0.b(4.0f, measuredHeight, 0);
                this.R = b10;
                this.R = Math.min(((ub0Var.getMeasuredHeight() - this.R) + b10) - ((int) ((((AndroidUtilities.displaySize.y - (Build.VERSION.SDK_INT >= 35 ? AndroidUtilities.navigationBarHeight : 0)) * 0.8f) - this.W) - AndroidUtilities.dp(8.0f))), this.R);
            }
            float A = com.google.android.gms.internal.vision.e2.A(getMeasuredHeight() - AndroidUtilities.dp(16.0f), (this.b.getMeasuredHeight() - this.R) + (this.W - AndroidUtilities.dp(8.0f)), 2.0f, AndroidUtilities.dp(8.0f)) - this.R;
            this.S = A;
            if (A > AndroidUtilities.dp(8.0f)) {
                this.S = AndroidUtilities.dp(8.0f);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
        }
        boolean z11 = this.K;
        if (z11 || (this.R == i10 && this.S == f7)) {
            if (z11) {
                float f10 = this.S;
                int i13 = this.R;
                this.T = i13;
                e(f10, i13);
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = hc0Var.h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        hc0Var.h = ofFloat;
        ofFloat.addUpdateListener(new ck(this, i10, f7, 1));
        hc0Var.h.setDuration(250L);
        hc0Var.h.setInterpolator(ji.n.V);
        hc0Var.h.addListener(new r8(this, 29));
        AndroidUtilities.runOnUIThread(hc0Var.y, 50L);
        this.T = i10;
        e(f7, i10);
    }

    public final void j() {
        MessageObject messageObject;
        hc0 hc0Var = this.c0;
        MessagePreviewParams messagePreviewParams = hc0Var.d;
        if (this.a == 0) {
            tb0 tb0Var = this.e;
            if (tb0Var.v - tb0Var.u > MessagesController.getInstance(hc0Var.w).quoteLengthMax) {
                return;
            }
            org.telegram.ui.Cells.y9 y9Var = tb0Var.W;
            MessageObject c10 = c(y9Var != null ? ((org.telegram.ui.Cells.u1) y9Var).getMessageObject() : null);
            if (messagePreviewParams.quote != null && tb0Var.y()) {
                messagePreviewParams.quoteStart = tb0Var.u;
                messagePreviewParams.quoteEnd = tb0Var.v;
                if (c10 != null && ((messageObject = messagePreviewParams.quote.a) == null || messageObject.getId() != c10.getId())) {
                    messagePreviewParams.quote = org.telegram.ui.mn.b(messagePreviewParams.quoteStart, messagePreviewParams.quoteEnd, c10);
                    hc0Var.b();
                }
            }
            tb0Var.f(false);
        }
    }

    public final void k(boolean z10) {
        hc0 hc0Var = this.c0;
        TLRPC.User user = hc0Var.n;
        MessagePreviewParams messagePreviewParams = hc0Var.d;
        TLRPC.Chat chat = hc0Var.r;
        ci.m6 m6Var = this.c;
        int i10 = this.a;
        if (i10 == 1) {
            MessagePreviewParams.Messages messages = messagePreviewParams.forwardMessages;
            m6Var.b(LocaleController.formatPluralString("PreviewForwardMessagesCount", messages == null ? 0 : messages.selectedIds.size(), new Object[0]), z10);
            m6Var.a(!messagePreviewParams.hasSenders ? messagePreviewParams.willSeeSenders ? user != null ? LocaleController.formatString("ForwardPreviewSendersNameVisible", R.string.ForwardPreviewSendersNameVisible, ContactsController.formatName(user.first_name, user.last_name)) : (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.ForwardPreviewSendersNameVisibleGroup) : LocaleController.getString(R.string.ForwardPreviewSendersNameVisibleChannel) : user != null ? LocaleController.formatString("ForwardPreviewSendersNameVisible", R.string.ForwardPreviewSendersNameVisible, ContactsController.formatName(user.first_name, user.last_name)) : (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.ForwardPreviewSendersNameHiddenGroup) : LocaleController.getString(R.string.ForwardPreviewSendersNameHiddenChannel) : !messagePreviewParams.hideForwardSendersName ? user != null ? LocaleController.formatString("ForwardPreviewSendersNameVisible", R.string.ForwardPreviewSendersNameVisible, ContactsController.formatName(user.first_name, user.last_name)) : (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.ForwardPreviewSendersNameVisibleGroup) : LocaleController.getString(R.string.ForwardPreviewSendersNameVisibleChannel) : user != null ? LocaleController.formatString("ForwardPreviewSendersNameHidden", R.string.ForwardPreviewSendersNameHidden, ContactsController.formatName(user.first_name, user.last_name)) : (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.ForwardPreviewSendersNameHiddenGroup) : LocaleController.getString(R.string.ForwardPreviewSendersNameHiddenChannel), z10);
        } else {
            if (i10 != 0) {
                if (i10 == 2) {
                    m6Var.b(LocaleController.getString(R.string.MessageOptionsLinkTitle), z10);
                    m6Var.a(LocaleController.getString(R.string.MessageOptionsLinkSubtitle), z10);
                    return;
                }
                return;
            }
            if (messagePreviewParams.quote == null || !messagePreviewParams.replyMessage.hasText) {
                m6Var.b(LocaleController.getString(R.string.MessageOptionsReplyTitle), z10);
                m6Var.a(messagePreviewParams.replyMessage.hasText ? LocaleController.getString(R.string.MessageOptionsReplySubtitle) : "", z10);
            } else {
                m6Var.b(LocaleController.getString(R.string.PreviewQuoteUpdate), z10);
                m6Var.a(LocaleController.getString(R.string.PreviewQuoteUpdateSubtitle), z10);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.a == 0) {
            AndroidUtilities.forEachViews((RecyclerView) this.f, (Utilities.Callback<View>) new y2(this, 8));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j();
        this.b0 = true;
        this.K = true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        i();
        this.K = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10 = View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i11);
        hc0 hc0Var = this.c0;
        hc0Var.v = z10;
        this.W = 0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(i10, makeMeasureSpec);
        int i12 = this.W;
        int measuredHeight = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
        Rect rect = this.Q;
        this.W = Math.max(i12, measuredHeight + rect.top + rect.bottom);
        ((ViewGroup.MarginLayoutParams) this.f.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        boolean z11 = hc0Var.v;
        org.telegram.ui.w8 w8Var = this.b;
        if (z11) {
            w8Var.getLayoutParams().height = -1;
            ((ViewGroup.MarginLayoutParams) w8Var.getLayoutParams()).topMargin = AndroidUtilities.dp(8.0f);
            ((ViewGroup.MarginLayoutParams) w8Var.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
            w8Var.getLayoutParams().width = (int) Math.min(View.MeasureSpec.getSize(i10), Math.max(AndroidUtilities.dp(340.0f), View.MeasureSpec.getSize(i10) * 0.6f));
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = -1;
        } else {
            ((ViewGroup.MarginLayoutParams) w8Var.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) w8Var.getLayoutParams()).bottomMargin = 0;
            w8Var.getLayoutParams().height = (View.MeasureSpec.getSize(i11) - AndroidUtilities.dp(6.0f)) - this.W;
            if (w8Var.getLayoutParams().height < View.MeasureSpec.getSize(i11) * 0.5f) {
                w8Var.getLayoutParams().height = (int) (View.MeasureSpec.getSize(i11) * 0.5f);
            }
            w8Var.getLayoutParams().width = -1;
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = View.MeasureSpec.getSize(i11) - w8Var.getLayoutParams().height;
        }
        int size = (View.MeasureSpec.getSize(i11) + View.MeasureSpec.getSize(i10)) << 16;
        if (this.a0 != size) {
            for (int i13 = 0; i13 < this.r.previewMessages.size(); i13++) {
                MessageObject messageObject = this.r.previewMessages.get(i13);
                messageObject.parentWidth = hc0Var.v ? w8Var.getLayoutParams().width : View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(16.0f);
                messageObject.resetLayout();
                messageObject.forceUpdate = true;
                ac0 ac0Var = this.n;
                if (ac0Var != null) {
                    ac0Var.l();
                }
            }
            this.K = true;
        }
        this.a0 = size;
        super.onMeasure(i10, i11);
    }
}
