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

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class zb0 extends FrameLayout {
    public final ec0 E;
    public final FrameLayout F;
    public final ec0 G;
    public final ec0 H;
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
    public final /* synthetic */ fc0 c0;
    public final org.telegram.ui.Cells.ca d;
    public final rb0 e;
    public final sb0 f;
    public final ub0 h;
    public final yb0 n;
    public MessagePreviewParams.Messages r;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout s;
    public final qb0 v;
    public final qb0 w;
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
    /* JADX WARN: Type inference failed for: r33v0, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout, java.lang.Object, org.telegram.ui.Components.zb0] */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.view.View, android.view.ViewGroup, org.telegram.ui.Components.aw0, org.telegram.ui.w8] */
    /* JADX WARN: Type inference failed for: r3v6, types: [ah.c] */
    /* JADX WARN: Type inference failed for: r9v8, types: [android.view.ViewGroup] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zb0(fc0 fc0Var, Context context, int i10) {
        super(r4);
        MessagePreviewParams messagePreviewParams;
        Context context2;
        zb0 zb0Var;
        boolean z10;
        ec0 ec0Var;
        ec0 ec0Var2;
        ViewOutlineProvider viewOutlineProvider;
        zb0 zb0Var2;
        MessagePreviewParams.Messages messages;
        ?? r11;
        MessagePreviewParams messagePreviewParams2;
        LinearLayout linearLayout;
        Drawable drawable;
        MessagePreviewParams messagePreviewParams3;
        boolean z11;
        Context context3 = context;
        this.c0 = fc0Var;
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
        setOnTouchListener(new wr(this, 4));
        ?? w8Var = new org.telegram.ui.w8(this, context3, i11);
        this.b = w8Var;
        bc0 bc0Var = fc0Var.F;
        boolean z12 = fc0Var.b;
        MessagePreviewParams messagePreviewParams4 = fc0Var.d;
        Drawable d = ((org.telegram.ui.un) bc0Var).d();
        if (((org.telegram.ui.un) bc0Var).f == null) {
            int i13 = org.telegram.ui.ActionBar.h6.a;
        }
        w8Var.V(d);
        w8Var.setOccupyStatusBar(false);
        int i14 = 3;
        w8Var.setOutlineProvider(new ch.b(this, i14));
        w8Var.setClipToOutline(true);
        w8Var.setElevation(AndroidUtilities.dp(4.0f));
        ci.m6 m6Var = new ci.m6(context3, 11, bc0Var);
        this.c = m6Var;
        m6Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.s8, bc0Var));
        rb0 rb0Var = new rb0(this);
        this.e = rb0Var;
        rb0Var.D = new ai.s3(this, i14);
        sb0 sb0Var = new sb0(this, context3, bc0Var);
        this.f = sb0Var;
        ub0 ub0Var = new ub0(this, sb0Var, bc0Var);
        this.h = ub0Var;
        sb0Var.setItemAnimator(ub0Var);
        sb0Var.setOnScrollListener(new ai.r(this, 29));
        sb0Var.setOnItemClickListener(new vb0(this));
        yb0 yb0Var = new yb0(this);
        this.n = yb0Var;
        sb0Var.setAdapter(yb0Var);
        sb0Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        nb0 nb0Var = new nb0(this);
        nb0Var.O = new ob0(this);
        sb0Var.setClipToPadding(false);
        sb0Var.setLayoutManager(nb0Var);
        sb0Var.i(new pb0());
        w8Var.addView(sb0Var);
        addView(w8Var, w7.y5.d(-1, 400.0f, 0, 8.0f, 0.0f, 8.0f, 0.0f));
        w8Var.addView(m6Var, w7.y5.c(-2.0f, -1));
        ?? actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert2, 1, getContext(), bc0Var);
        this.s = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().setOnForegroundOpenFinished(new lb0(this, i11));
        ch.d c10 = fc0Var.G.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, false);
        c10.o(eh.b.k(bc0Var));
        c10.p(AndroidUtilities.dp(8.0f));
        c10.j.e = true;
        c10.q(AndroidUtilities.dp(12.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c10);
        addView(actionBarPopupWindow$ActionBarPopupWindowLayout, w7.y5.c(-2.0f, -2));
        if (i10 != 0 || (messages = messagePreviewParams4.replyMessage) == null) {
            messagePreviewParams = messagePreviewParams4;
            if (i10 != 1 || messagePreviewParams.forwardMessages == null) {
                final zb0 zb0Var3 = this;
                zb0Var = zb0Var3;
                if (i10 == 2) {
                    zb0Var = zb0Var3;
                    if (messagePreviewParams.linkMessage != null) {
                        ec0 ec0Var3 = new ec0(context, R.raw.position_below, LocaleController.getString(R.string.LinkAbove), R.raw.position_above, LocaleController.getString(R.string.LinkBelow), fc0Var.F);
                        zb0Var3.E = ec0Var3;
                        ec0Var3.a(!messagePreviewParams.webpageTop, false);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(ec0Var3, w7.y5.n(-1, 48));
                        FrameLayout frameLayout = new FrameLayout(context);
                        zb0Var3.F = frameLayout;
                        frameLayout.setBackground(org.telegram.ui.ActionBar.h6.Y(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.I5, bc0Var), 0, 0));
                        ec0 ec0Var4 = new ec0(context, R.raw.media_shrink, LocaleController.getString(R.string.LinkMediaLarger), R.raw.media_enlarge, LocaleController.getString(R.string.LinkMediaSmaller), fc0Var.F);
                        zb0Var3.G = ec0Var4;
                        ec0Var4.setBackground(null);
                        ec0Var4.setVisibility(messagePreviewParams.isVideo ? 4 : 0);
                        frameLayout.addView(ec0Var4, w7.y5.n(-1, 48));
                        ec0 ec0Var5 = new ec0(context, R.raw.media_shrink, LocaleController.getString(R.string.LinkVideoLarger), R.raw.media_enlarge, LocaleController.getString(R.string.LinkVideoSmaller), fc0Var.F);
                        zb0Var3.H = ec0Var5;
                        ec0Var5.setBackground(null);
                        ec0Var5.setVisibility(!messagePreviewParams.isVideo ? 4 : 0);
                        frameLayout.setAlpha(messagePreviewParams.hasMedia ? 1.0f : 0.5f);
                        frameLayout.addView(ec0Var5, w7.y5.n(-1, 48));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, w7.y5.n(-1, 48));
                        frameLayout.setVisibility((!messagePreviewParams.singleLink || messagePreviewParams.hasMedia) ? 0 : 8);
                        ec0Var4.a(messagePreviewParams.webpageSmall, false);
                        ec0Var5.a(messagePreviewParams.webpageSmall, false);
                        org.telegram.ui.ActionBar.j1 j1Var = new org.telegram.ui.ActionBar.j1(context, bc0Var);
                        j1Var.setColor(org.telegram.ui.ActionBar.h6.l1(0.06f, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.E8, bc0Var)));
                        j1Var.setTag(R.id.fit_width_tag, 1);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(j1Var, w7.y5.n(-1, 8));
                        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(1, context, fc0Var.F, false, false);
                        e1Var.g(LocaleController.getString(R.string.ApplyChanges), R.drawable.msg_select, null);
                        final int i15 = 10;
                        e1Var.setOnClickListener(new View.OnClickListener(zb0Var3) { // from class: org.telegram.ui.Components.jb0
                            public final /* synthetic */ zb0 b;

                            {
                                this.b = zb0Var3;
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
                                        zb0 zb0Var4 = this.b;
                                        zb0Var4.c0.d.quote = null;
                                        zb0Var4.e.f(false);
                                        zb0Var4.g(false, false);
                                        zb0Var4.s.getSwipeBack().b(true);
                                        break;
                                    case 1:
                                        zb0 zb0Var5 = this.b;
                                        rb0 rb0Var2 = zb0Var5.e;
                                        fc0 fc0Var2 = zb0Var5.c0;
                                        if (zb0Var5.c(null) != null) {
                                            if (rb0Var2.v - rb0Var2.u <= MessagesController.getInstance(fc0Var2.w).quoteLengthMax) {
                                                org.telegram.ui.Cells.y9 y9Var = rb0Var2.W;
                                                MessageObject c11 = zb0Var5.c(y9Var != null ? ((org.telegram.ui.Cells.u1) y9Var).getMessageObject() : null);
                                                MessagePreviewParams messagePreviewParams5 = fc0Var2.d;
                                                int i17 = rb0Var2.u;
                                                messagePreviewParams5.quoteStart = i17;
                                                int i18 = rb0Var2.v;
                                                messagePreviewParams5.quoteEnd = i18;
                                                messagePreviewParams5.quote = org.telegram.ui.mn.b(i17, i18, c11);
                                                fc0Var2.b();
                                                fc0Var2.a(true);
                                                break;
                                            } else {
                                                zb0Var5.f();
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        zb0 zb0Var6 = this.b;
                                        rb0 rb0Var3 = zb0Var6.e;
                                        fc0 fc0Var3 = zb0Var6.c0;
                                        MessagePreviewParams messagePreviewParams6 = fc0Var3.d;
                                        int i19 = fc0Var3.w;
                                        boolean z13 = fc0Var3.b;
                                        if (messagePreviewParams6.quote != null && !z13) {
                                            messagePreviewParams6.quote = null;
                                            rb0Var3.f(false);
                                            zb0Var6.g(false, true);
                                            zb0Var6.k(true);
                                            break;
                                        } else if (rb0Var3.v - rb0Var3.u <= MessagesController.getInstance(i19).quoteLengthMax) {
                                            MessageObject c12 = zb0Var6.c(null);
                                            if (c12 != null) {
                                                if (!rb0Var3.y()) {
                                                    messagePreviewParams6.quoteStart = 0;
                                                    int min = Math.min(MessagesController.getInstance(i19).quoteLengthMax, c12.messageOwner.message.length());
                                                    messagePreviewParams6.quoteEnd = min;
                                                    messagePreviewParams6.quote = org.telegram.ui.mn.b(messagePreviewParams6.quoteStart, min, c12);
                                                    View d10 = zb0Var6.d();
                                                    if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                        rb0Var3.a0((org.telegram.ui.Cells.u1) d10, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                                    }
                                                    if (!z13) {
                                                        zb0Var6.s.getSwipeBack().e(zb0Var6.I);
                                                    }
                                                    zb0Var6.g(true, true);
                                                    break;
                                                } else {
                                                    messagePreviewParams6.quoteStart = rb0Var3.u;
                                                    messagePreviewParams6.quoteEnd = rb0Var3.v;
                                                    org.telegram.ui.Cells.y9 y9Var2 = rb0Var3.W;
                                                    messagePreviewParams6.quote = org.telegram.ui.mn.b(messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd, zb0Var6.c(y9Var2 != null ? ((org.telegram.ui.Cells.u1) y9Var2).getMessageObject() : null));
                                                    fc0Var3.b();
                                                    fc0Var3.a(true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            zb0Var6.f();
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
                                        fc0 fc0Var4 = this.b.c0;
                                        if (!fc0Var4.b) {
                                            org.telegram.ui.el elVar = (org.telegram.ui.el) fc0Var4;
                                            elVar.a(true);
                                            org.telegram.ui.wn wnVar = elVar.H;
                                            wnVar.n5 = null;
                                            wnVar.l5 = null;
                                            wnVar.f5.updateReply(null, null, wnVar.T5, null);
                                            wnVar.j8();
                                            break;
                                        } else {
                                            org.telegram.ui.el elVar2 = (org.telegram.ui.el) fc0Var4;
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
                                        zb0 zb0Var7 = this.b;
                                        MessagePreviewParams messagePreviewParams8 = zb0Var7.c0.d;
                                        if (messagePreviewParams8.hasMedia) {
                                            boolean z14 = !messagePreviewParams8.webpageSmall;
                                            messagePreviewParams8.webpageSmall = z14;
                                            zb0Var7.G.a(z14, true);
                                            zb0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                            if (zb0Var7.r.messages.size() > 0 && (message2 = zb0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                                boolean z15 = messagePreviewParams8.webpageSmall;
                                                messageMedia2.force_small_media = z15;
                                                messageMedia2.force_large_media = !z15;
                                            }
                                            if (zb0Var7.r.previewMessages.size() > 0 && (message = zb0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                                boolean z16 = messagePreviewParams8.webpageSmall;
                                                messageMedia.force_small_media = z16;
                                                messageMedia.force_large_media = !z16;
                                            }
                                            zb0Var7.h();
                                            zb0Var7.U = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        zb0 zb0Var8 = this.b;
                                        MessagePreviewParams messagePreviewParams9 = zb0Var8.c0.d;
                                        boolean z17 = messagePreviewParams9.webpageTop;
                                        messagePreviewParams9.webpageTop = !z17;
                                        zb0Var8.E.a(z17, true);
                                        if (zb0Var8.r.messages.size() > 0 && (message4 = zb0Var8.r.messages.get(0).messageOwner) != null) {
                                            message4.invert_media = messagePreviewParams9.webpageTop;
                                        }
                                        if (zb0Var8.r.previewMessages.size() > 0 && (message3 = zb0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                            message3.invert_media = messagePreviewParams9.webpageTop;
                                        }
                                        zb0Var8.h();
                                        zb0Var8.U = true;
                                        break;
                                }
                            }
                        });
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var, w7.y5.n(-1, 48));
                        org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(1, context, fc0Var.F, false, true);
                        context2 = context;
                        e1Var2.g(LocaleController.getString(R.string.DoNotLinkPreview), R.drawable.msg_delete, null);
                        int v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.q7, bc0Var);
                        int i16 = org.telegram.ui.ActionBar.h6.p7;
                        e1Var2.c(v02, org.telegram.ui.ActionBar.h6.v0(i16, bc0Var));
                        final int i17 = 11;
                        e1Var2.setOnClickListener(new View.OnClickListener(zb0Var3) { // from class: org.telegram.ui.Components.jb0
                            public final /* synthetic */ zb0 b;

                            {
                                this.b = zb0Var3;
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
                                        zb0 zb0Var4 = this.b;
                                        zb0Var4.c0.d.quote = null;
                                        zb0Var4.e.f(false);
                                        zb0Var4.g(false, false);
                                        zb0Var4.s.getSwipeBack().b(true);
                                        break;
                                    case 1:
                                        zb0 zb0Var5 = this.b;
                                        rb0 rb0Var2 = zb0Var5.e;
                                        fc0 fc0Var2 = zb0Var5.c0;
                                        if (zb0Var5.c(null) != null) {
                                            if (rb0Var2.v - rb0Var2.u <= MessagesController.getInstance(fc0Var2.w).quoteLengthMax) {
                                                org.telegram.ui.Cells.y9 y9Var = rb0Var2.W;
                                                MessageObject c11 = zb0Var5.c(y9Var != null ? ((org.telegram.ui.Cells.u1) y9Var).getMessageObject() : null);
                                                MessagePreviewParams messagePreviewParams5 = fc0Var2.d;
                                                int i172 = rb0Var2.u;
                                                messagePreviewParams5.quoteStart = i172;
                                                int i18 = rb0Var2.v;
                                                messagePreviewParams5.quoteEnd = i18;
                                                messagePreviewParams5.quote = org.telegram.ui.mn.b(i172, i18, c11);
                                                fc0Var2.b();
                                                fc0Var2.a(true);
                                                break;
                                            } else {
                                                zb0Var5.f();
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        zb0 zb0Var6 = this.b;
                                        rb0 rb0Var3 = zb0Var6.e;
                                        fc0 fc0Var3 = zb0Var6.c0;
                                        MessagePreviewParams messagePreviewParams6 = fc0Var3.d;
                                        int i19 = fc0Var3.w;
                                        boolean z13 = fc0Var3.b;
                                        if (messagePreviewParams6.quote != null && !z13) {
                                            messagePreviewParams6.quote = null;
                                            rb0Var3.f(false);
                                            zb0Var6.g(false, true);
                                            zb0Var6.k(true);
                                            break;
                                        } else if (rb0Var3.v - rb0Var3.u <= MessagesController.getInstance(i19).quoteLengthMax) {
                                            MessageObject c12 = zb0Var6.c(null);
                                            if (c12 != null) {
                                                if (!rb0Var3.y()) {
                                                    messagePreviewParams6.quoteStart = 0;
                                                    int min = Math.min(MessagesController.getInstance(i19).quoteLengthMax, c12.messageOwner.message.length());
                                                    messagePreviewParams6.quoteEnd = min;
                                                    messagePreviewParams6.quote = org.telegram.ui.mn.b(messagePreviewParams6.quoteStart, min, c12);
                                                    View d10 = zb0Var6.d();
                                                    if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                        rb0Var3.a0((org.telegram.ui.Cells.u1) d10, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                                    }
                                                    if (!z13) {
                                                        zb0Var6.s.getSwipeBack().e(zb0Var6.I);
                                                    }
                                                    zb0Var6.g(true, true);
                                                    break;
                                                } else {
                                                    messagePreviewParams6.quoteStart = rb0Var3.u;
                                                    messagePreviewParams6.quoteEnd = rb0Var3.v;
                                                    org.telegram.ui.Cells.y9 y9Var2 = rb0Var3.W;
                                                    messagePreviewParams6.quote = org.telegram.ui.mn.b(messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd, zb0Var6.c(y9Var2 != null ? ((org.telegram.ui.Cells.u1) y9Var2).getMessageObject() : null));
                                                    fc0Var3.b();
                                                    fc0Var3.a(true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            zb0Var6.f();
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
                                        fc0 fc0Var4 = this.b.c0;
                                        if (!fc0Var4.b) {
                                            org.telegram.ui.el elVar = (org.telegram.ui.el) fc0Var4;
                                            elVar.a(true);
                                            org.telegram.ui.wn wnVar = elVar.H;
                                            wnVar.n5 = null;
                                            wnVar.l5 = null;
                                            wnVar.f5.updateReply(null, null, wnVar.T5, null);
                                            wnVar.j8();
                                            break;
                                        } else {
                                            org.telegram.ui.el elVar2 = (org.telegram.ui.el) fc0Var4;
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
                                        zb0 zb0Var7 = this.b;
                                        MessagePreviewParams messagePreviewParams8 = zb0Var7.c0.d;
                                        if (messagePreviewParams8.hasMedia) {
                                            boolean z14 = !messagePreviewParams8.webpageSmall;
                                            messagePreviewParams8.webpageSmall = z14;
                                            zb0Var7.G.a(z14, true);
                                            zb0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                            if (zb0Var7.r.messages.size() > 0 && (message2 = zb0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                                boolean z15 = messagePreviewParams8.webpageSmall;
                                                messageMedia2.force_small_media = z15;
                                                messageMedia2.force_large_media = !z15;
                                            }
                                            if (zb0Var7.r.previewMessages.size() > 0 && (message = zb0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                                boolean z16 = messagePreviewParams8.webpageSmall;
                                                messageMedia.force_small_media = z16;
                                                messageMedia.force_large_media = !z16;
                                            }
                                            zb0Var7.h();
                                            zb0Var7.U = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        zb0 zb0Var8 = this.b;
                                        MessagePreviewParams messagePreviewParams9 = zb0Var8.c0.d;
                                        boolean z17 = messagePreviewParams9.webpageTop;
                                        messagePreviewParams9.webpageTop = !z17;
                                        zb0Var8.E.a(z17, true);
                                        if (zb0Var8.r.messages.size() > 0 && (message4 = zb0Var8.r.messages.get(0).messageOwner) != null) {
                                            message4.invert_media = messagePreviewParams9.webpageTop;
                                        }
                                        if (zb0Var8.r.previewMessages.size() > 0 && (message3 = zb0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                            message3.invert_media = messagePreviewParams9.webpageTop;
                                        }
                                        zb0Var8.h();
                                        zb0Var8.U = true;
                                        break;
                                }
                            }
                        });
                        e1Var2.setSelectorColor(org.telegram.ui.ActionBar.h6.l1(0.12f, org.telegram.ui.ActionBar.h6.w0(null, i16, false)));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var2, w7.y5.n(-1, 48));
                        final int i18 = 12;
                        frameLayout.setOnClickListener(new View.OnClickListener(zb0Var3) { // from class: org.telegram.ui.Components.jb0
                            public final /* synthetic */ zb0 b;

                            {
                                this.b = zb0Var3;
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
                                        zb0 zb0Var4 = this.b;
                                        zb0Var4.c0.d.quote = null;
                                        zb0Var4.e.f(false);
                                        zb0Var4.g(false, false);
                                        zb0Var4.s.getSwipeBack().b(true);
                                        break;
                                    case 1:
                                        zb0 zb0Var5 = this.b;
                                        rb0 rb0Var2 = zb0Var5.e;
                                        fc0 fc0Var2 = zb0Var5.c0;
                                        if (zb0Var5.c(null) != null) {
                                            if (rb0Var2.v - rb0Var2.u <= MessagesController.getInstance(fc0Var2.w).quoteLengthMax) {
                                                org.telegram.ui.Cells.y9 y9Var = rb0Var2.W;
                                                MessageObject c11 = zb0Var5.c(y9Var != null ? ((org.telegram.ui.Cells.u1) y9Var).getMessageObject() : null);
                                                MessagePreviewParams messagePreviewParams5 = fc0Var2.d;
                                                int i172 = rb0Var2.u;
                                                messagePreviewParams5.quoteStart = i172;
                                                int i182 = rb0Var2.v;
                                                messagePreviewParams5.quoteEnd = i182;
                                                messagePreviewParams5.quote = org.telegram.ui.mn.b(i172, i182, c11);
                                                fc0Var2.b();
                                                fc0Var2.a(true);
                                                break;
                                            } else {
                                                zb0Var5.f();
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        zb0 zb0Var6 = this.b;
                                        rb0 rb0Var3 = zb0Var6.e;
                                        fc0 fc0Var3 = zb0Var6.c0;
                                        MessagePreviewParams messagePreviewParams6 = fc0Var3.d;
                                        int i19 = fc0Var3.w;
                                        boolean z13 = fc0Var3.b;
                                        if (messagePreviewParams6.quote != null && !z13) {
                                            messagePreviewParams6.quote = null;
                                            rb0Var3.f(false);
                                            zb0Var6.g(false, true);
                                            zb0Var6.k(true);
                                            break;
                                        } else if (rb0Var3.v - rb0Var3.u <= MessagesController.getInstance(i19).quoteLengthMax) {
                                            MessageObject c12 = zb0Var6.c(null);
                                            if (c12 != null) {
                                                if (!rb0Var3.y()) {
                                                    messagePreviewParams6.quoteStart = 0;
                                                    int min = Math.min(MessagesController.getInstance(i19).quoteLengthMax, c12.messageOwner.message.length());
                                                    messagePreviewParams6.quoteEnd = min;
                                                    messagePreviewParams6.quote = org.telegram.ui.mn.b(messagePreviewParams6.quoteStart, min, c12);
                                                    View d10 = zb0Var6.d();
                                                    if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                        rb0Var3.a0((org.telegram.ui.Cells.u1) d10, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                                    }
                                                    if (!z13) {
                                                        zb0Var6.s.getSwipeBack().e(zb0Var6.I);
                                                    }
                                                    zb0Var6.g(true, true);
                                                    break;
                                                } else {
                                                    messagePreviewParams6.quoteStart = rb0Var3.u;
                                                    messagePreviewParams6.quoteEnd = rb0Var3.v;
                                                    org.telegram.ui.Cells.y9 y9Var2 = rb0Var3.W;
                                                    messagePreviewParams6.quote = org.telegram.ui.mn.b(messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd, zb0Var6.c(y9Var2 != null ? ((org.telegram.ui.Cells.u1) y9Var2).getMessageObject() : null));
                                                    fc0Var3.b();
                                                    fc0Var3.a(true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            zb0Var6.f();
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
                                        fc0 fc0Var4 = this.b.c0;
                                        if (!fc0Var4.b) {
                                            org.telegram.ui.el elVar = (org.telegram.ui.el) fc0Var4;
                                            elVar.a(true);
                                            org.telegram.ui.wn wnVar = elVar.H;
                                            wnVar.n5 = null;
                                            wnVar.l5 = null;
                                            wnVar.f5.updateReply(null, null, wnVar.T5, null);
                                            wnVar.j8();
                                            break;
                                        } else {
                                            org.telegram.ui.el elVar2 = (org.telegram.ui.el) fc0Var4;
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
                                        zb0 zb0Var7 = this.b;
                                        MessagePreviewParams messagePreviewParams8 = zb0Var7.c0.d;
                                        if (messagePreviewParams8.hasMedia) {
                                            boolean z14 = !messagePreviewParams8.webpageSmall;
                                            messagePreviewParams8.webpageSmall = z14;
                                            zb0Var7.G.a(z14, true);
                                            zb0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                            if (zb0Var7.r.messages.size() > 0 && (message2 = zb0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                                boolean z15 = messagePreviewParams8.webpageSmall;
                                                messageMedia2.force_small_media = z15;
                                                messageMedia2.force_large_media = !z15;
                                            }
                                            if (zb0Var7.r.previewMessages.size() > 0 && (message = zb0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                                boolean z16 = messagePreviewParams8.webpageSmall;
                                                messageMedia.force_small_media = z16;
                                                messageMedia.force_large_media = !z16;
                                            }
                                            zb0Var7.h();
                                            zb0Var7.U = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        zb0 zb0Var8 = this.b;
                                        MessagePreviewParams messagePreviewParams9 = zb0Var8.c0.d;
                                        boolean z17 = messagePreviewParams9.webpageTop;
                                        messagePreviewParams9.webpageTop = !z17;
                                        zb0Var8.E.a(z17, true);
                                        if (zb0Var8.r.messages.size() > 0 && (message4 = zb0Var8.r.messages.get(0).messageOwner) != null) {
                                            message4.invert_media = messagePreviewParams9.webpageTop;
                                        }
                                        if (zb0Var8.r.previewMessages.size() > 0 && (message3 = zb0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                            message3.invert_media = messagePreviewParams9.webpageTop;
                                        }
                                        zb0Var8.h();
                                        zb0Var8.U = true;
                                        break;
                                }
                            }
                        });
                        final int i19 = 13;
                        ec0Var3.setOnClickListener(new View.OnClickListener(zb0Var3) { // from class: org.telegram.ui.Components.jb0
                            public final /* synthetic */ zb0 b;

                            {
                                this.b = zb0Var3;
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
                                        zb0 zb0Var4 = this.b;
                                        zb0Var4.c0.d.quote = null;
                                        zb0Var4.e.f(false);
                                        zb0Var4.g(false, false);
                                        zb0Var4.s.getSwipeBack().b(true);
                                        break;
                                    case 1:
                                        zb0 zb0Var5 = this.b;
                                        rb0 rb0Var2 = zb0Var5.e;
                                        fc0 fc0Var2 = zb0Var5.c0;
                                        if (zb0Var5.c(null) != null) {
                                            if (rb0Var2.v - rb0Var2.u <= MessagesController.getInstance(fc0Var2.w).quoteLengthMax) {
                                                org.telegram.ui.Cells.y9 y9Var = rb0Var2.W;
                                                MessageObject c11 = zb0Var5.c(y9Var != null ? ((org.telegram.ui.Cells.u1) y9Var).getMessageObject() : null);
                                                MessagePreviewParams messagePreviewParams5 = fc0Var2.d;
                                                int i172 = rb0Var2.u;
                                                messagePreviewParams5.quoteStart = i172;
                                                int i182 = rb0Var2.v;
                                                messagePreviewParams5.quoteEnd = i182;
                                                messagePreviewParams5.quote = org.telegram.ui.mn.b(i172, i182, c11);
                                                fc0Var2.b();
                                                fc0Var2.a(true);
                                                break;
                                            } else {
                                                zb0Var5.f();
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        zb0 zb0Var6 = this.b;
                                        rb0 rb0Var3 = zb0Var6.e;
                                        fc0 fc0Var3 = zb0Var6.c0;
                                        MessagePreviewParams messagePreviewParams6 = fc0Var3.d;
                                        int i192 = fc0Var3.w;
                                        boolean z13 = fc0Var3.b;
                                        if (messagePreviewParams6.quote != null && !z13) {
                                            messagePreviewParams6.quote = null;
                                            rb0Var3.f(false);
                                            zb0Var6.g(false, true);
                                            zb0Var6.k(true);
                                            break;
                                        } else if (rb0Var3.v - rb0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                            MessageObject c12 = zb0Var6.c(null);
                                            if (c12 != null) {
                                                if (!rb0Var3.y()) {
                                                    messagePreviewParams6.quoteStart = 0;
                                                    int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                                    messagePreviewParams6.quoteEnd = min;
                                                    messagePreviewParams6.quote = org.telegram.ui.mn.b(messagePreviewParams6.quoteStart, min, c12);
                                                    View d10 = zb0Var6.d();
                                                    if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                        rb0Var3.a0((org.telegram.ui.Cells.u1) d10, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                                    }
                                                    if (!z13) {
                                                        zb0Var6.s.getSwipeBack().e(zb0Var6.I);
                                                    }
                                                    zb0Var6.g(true, true);
                                                    break;
                                                } else {
                                                    messagePreviewParams6.quoteStart = rb0Var3.u;
                                                    messagePreviewParams6.quoteEnd = rb0Var3.v;
                                                    org.telegram.ui.Cells.y9 y9Var2 = rb0Var3.W;
                                                    messagePreviewParams6.quote = org.telegram.ui.mn.b(messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd, zb0Var6.c(y9Var2 != null ? ((org.telegram.ui.Cells.u1) y9Var2).getMessageObject() : null));
                                                    fc0Var3.b();
                                                    fc0Var3.a(true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            zb0Var6.f();
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
                                        fc0 fc0Var4 = this.b.c0;
                                        if (!fc0Var4.b) {
                                            org.telegram.ui.el elVar = (org.telegram.ui.el) fc0Var4;
                                            elVar.a(true);
                                            org.telegram.ui.wn wnVar = elVar.H;
                                            wnVar.n5 = null;
                                            wnVar.l5 = null;
                                            wnVar.f5.updateReply(null, null, wnVar.T5, null);
                                            wnVar.j8();
                                            break;
                                        } else {
                                            org.telegram.ui.el elVar2 = (org.telegram.ui.el) fc0Var4;
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
                                        zb0 zb0Var7 = this.b;
                                        MessagePreviewParams messagePreviewParams8 = zb0Var7.c0.d;
                                        if (messagePreviewParams8.hasMedia) {
                                            boolean z14 = !messagePreviewParams8.webpageSmall;
                                            messagePreviewParams8.webpageSmall = z14;
                                            zb0Var7.G.a(z14, true);
                                            zb0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                            if (zb0Var7.r.messages.size() > 0 && (message2 = zb0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                                boolean z15 = messagePreviewParams8.webpageSmall;
                                                messageMedia2.force_small_media = z15;
                                                messageMedia2.force_large_media = !z15;
                                            }
                                            if (zb0Var7.r.previewMessages.size() > 0 && (message = zb0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                                boolean z16 = messagePreviewParams8.webpageSmall;
                                                messageMedia.force_small_media = z16;
                                                messageMedia.force_large_media = !z16;
                                            }
                                            zb0Var7.h();
                                            zb0Var7.U = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        zb0 zb0Var8 = this.b;
                                        MessagePreviewParams messagePreviewParams9 = zb0Var8.c0.d;
                                        boolean z17 = messagePreviewParams9.webpageTop;
                                        messagePreviewParams9.webpageTop = !z17;
                                        zb0Var8.E.a(z17, true);
                                        if (zb0Var8.r.messages.size() > 0 && (message4 = zb0Var8.r.messages.get(0).messageOwner) != null) {
                                            message4.invert_media = messagePreviewParams9.webpageTop;
                                        }
                                        if (zb0Var8.r.previewMessages.size() > 0 && (message3 = zb0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                            message3.invert_media = messagePreviewParams9.webpageTop;
                                        }
                                        zb0Var8.h();
                                        zb0Var8.U = true;
                                        break;
                                }
                            }
                        });
                        zb0Var2 = zb0Var3;
                        viewOutlineProvider = null;
                    }
                }
            } else {
                if (!UserConfig.getInstance(fc0Var.w).isPremium()) {
                    for (int i20 = 0; i20 < messagePreviewParams.forwardMessages.messages.size(); i20++) {
                        if (messagePreviewParams.forwardMessages.messages.get(i20).type == 36) {
                            z10 = false;
                            break;
                        }
                    }
                }
                z10 = true;
                ec0 ec0Var6 = new ec0(context, R.raw.name_hide, LocaleController.getString(messagePreviewParams.multipleUsers ? R.string.ShowSenderNames : R.string.ShowSendersName), R.raw.name_show, LocaleController.getString(messagePreviewParams.multipleUsers ? R.string.HideSenderNames : R.string.HideSendersName), fc0Var.F);
                this.s.a(ec0Var6, w7.y5.n(-1, 48));
                if (messagePreviewParams.hasCaption) {
                    ec0Var = ec0Var6;
                    ec0 ec0Var7 = new ec0(context, R.raw.caption_hide, LocaleController.getString(R.string.ShowCaption), R.raw.caption_show, LocaleController.getString(R.string.HideCaption), fc0Var.F);
                    ec0Var7.a(messagePreviewParams.hideCaption, false);
                    this.s.a(ec0Var7, w7.y5.n(-1, 48));
                    ec0Var2 = ec0Var7;
                } else {
                    ec0Var = ec0Var6;
                    ec0Var2 = null;
                }
                org.telegram.ui.ActionBar.e1 e1Var3 = new org.telegram.ui.ActionBar.e1(0, context, fc0Var.F, true, false);
                final int i21 = 7;
                e1Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.jb0
                    public final /* synthetic */ zb0 b;

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
                                zb0 zb0Var4 = this.b;
                                zb0Var4.c0.d.quote = null;
                                zb0Var4.e.f(false);
                                zb0Var4.g(false, false);
                                zb0Var4.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                zb0 zb0Var5 = this.b;
                                rb0 rb0Var2 = zb0Var5.e;
                                fc0 fc0Var2 = zb0Var5.c0;
                                if (zb0Var5.c(null) != null) {
                                    if (rb0Var2.v - rb0Var2.u <= MessagesController.getInstance(fc0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.y9 y9Var = rb0Var2.W;
                                        MessageObject c11 = zb0Var5.c(y9Var != null ? ((org.telegram.ui.Cells.u1) y9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams5 = fc0Var2.d;
                                        int i172 = rb0Var2.u;
                                        messagePreviewParams5.quoteStart = i172;
                                        int i182 = rb0Var2.v;
                                        messagePreviewParams5.quoteEnd = i182;
                                        messagePreviewParams5.quote = org.telegram.ui.mn.b(i172, i182, c11);
                                        fc0Var2.b();
                                        fc0Var2.a(true);
                                        break;
                                    } else {
                                        zb0Var5.f();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                zb0 zb0Var6 = this.b;
                                rb0 rb0Var3 = zb0Var6.e;
                                fc0 fc0Var3 = zb0Var6.c0;
                                MessagePreviewParams messagePreviewParams6 = fc0Var3.d;
                                int i192 = fc0Var3.w;
                                boolean z13 = fc0Var3.b;
                                if (messagePreviewParams6.quote != null && !z13) {
                                    messagePreviewParams6.quote = null;
                                    rb0Var3.f(false);
                                    zb0Var6.g(false, true);
                                    zb0Var6.k(true);
                                    break;
                                } else if (rb0Var3.v - rb0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                    MessageObject c12 = zb0Var6.c(null);
                                    if (c12 != null) {
                                        if (!rb0Var3.y()) {
                                            messagePreviewParams6.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                            messagePreviewParams6.quoteEnd = min;
                                            messagePreviewParams6.quote = org.telegram.ui.mn.b(messagePreviewParams6.quoteStart, min, c12);
                                            View d10 = zb0Var6.d();
                                            if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                rb0Var3.a0((org.telegram.ui.Cells.u1) d10, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                            }
                                            if (!z13) {
                                                zb0Var6.s.getSwipeBack().e(zb0Var6.I);
                                            }
                                            zb0Var6.g(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams6.quoteStart = rb0Var3.u;
                                            messagePreviewParams6.quoteEnd = rb0Var3.v;
                                            org.telegram.ui.Cells.y9 y9Var2 = rb0Var3.W;
                                            messagePreviewParams6.quote = org.telegram.ui.mn.b(messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd, zb0Var6.c(y9Var2 != null ? ((org.telegram.ui.Cells.u1) y9Var2).getMessageObject() : null));
                                            fc0Var3.b();
                                            fc0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    zb0Var6.f();
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
                                fc0 fc0Var4 = this.b.c0;
                                if (!fc0Var4.b) {
                                    org.telegram.ui.el elVar = (org.telegram.ui.el) fc0Var4;
                                    elVar.a(true);
                                    org.telegram.ui.wn wnVar = elVar.H;
                                    wnVar.n5 = null;
                                    wnVar.l5 = null;
                                    wnVar.f5.updateReply(null, null, wnVar.T5, null);
                                    wnVar.j8();
                                    break;
                                } else {
                                    org.telegram.ui.el elVar2 = (org.telegram.ui.el) fc0Var4;
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
                                zb0 zb0Var7 = this.b;
                                MessagePreviewParams messagePreviewParams8 = zb0Var7.c0.d;
                                if (messagePreviewParams8.hasMedia) {
                                    boolean z14 = !messagePreviewParams8.webpageSmall;
                                    messagePreviewParams8.webpageSmall = z14;
                                    zb0Var7.G.a(z14, true);
                                    zb0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                    if (zb0Var7.r.messages.size() > 0 && (message2 = zb0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z15 = messagePreviewParams8.webpageSmall;
                                        messageMedia2.force_small_media = z15;
                                        messageMedia2.force_large_media = !z15;
                                    }
                                    if (zb0Var7.r.previewMessages.size() > 0 && (message = zb0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z16 = messagePreviewParams8.webpageSmall;
                                        messageMedia.force_small_media = z16;
                                        messageMedia.force_large_media = !z16;
                                    }
                                    zb0Var7.h();
                                    zb0Var7.U = true;
                                    break;
                                }
                                break;
                            default:
                                zb0 zb0Var8 = this.b;
                                MessagePreviewParams messagePreviewParams9 = zb0Var8.c0.d;
                                boolean z17 = messagePreviewParams9.webpageTop;
                                messagePreviewParams9.webpageTop = !z17;
                                zb0Var8.E.a(z17, true);
                                if (zb0Var8.r.messages.size() > 0 && (message4 = zb0Var8.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams9.webpageTop;
                                }
                                if (zb0Var8.r.previewMessages.size() > 0 && (message3 = zb0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams9.webpageTop;
                                }
                                zb0Var8.h();
                                zb0Var8.U = true;
                                break;
                        }
                    }
                });
                e1Var3.g(LocaleController.getString(R.string.ChangeRecipient), R.drawable.msg_forward_replace, null);
                this.s.a(e1Var3, w7.y5.n(-1, 48));
                org.telegram.ui.ActionBar.j1 j1Var2 = new org.telegram.ui.ActionBar.j1(context, bc0Var);
                j1Var2.setColor(org.telegram.ui.ActionBar.h6.l1(0.06f, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.E8, bc0Var)));
                j1Var2.setTag(R.id.fit_width_tag, 1);
                this.s.a(j1Var2, w7.y5.n(-1, 8));
                org.telegram.ui.ActionBar.e1 e1Var4 = new org.telegram.ui.ActionBar.e1(1, context, fc0Var.F, false, false);
                e1Var4.g(LocaleController.getString(R.string.ApplyChanges), R.drawable.msg_select, null);
                final int i22 = 8;
                e1Var4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.jb0
                    public final /* synthetic */ zb0 b;

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
                                zb0 zb0Var4 = this.b;
                                zb0Var4.c0.d.quote = null;
                                zb0Var4.e.f(false);
                                zb0Var4.g(false, false);
                                zb0Var4.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                zb0 zb0Var5 = this.b;
                                rb0 rb0Var2 = zb0Var5.e;
                                fc0 fc0Var2 = zb0Var5.c0;
                                if (zb0Var5.c(null) != null) {
                                    if (rb0Var2.v - rb0Var2.u <= MessagesController.getInstance(fc0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.y9 y9Var = rb0Var2.W;
                                        MessageObject c11 = zb0Var5.c(y9Var != null ? ((org.telegram.ui.Cells.u1) y9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams5 = fc0Var2.d;
                                        int i172 = rb0Var2.u;
                                        messagePreviewParams5.quoteStart = i172;
                                        int i182 = rb0Var2.v;
                                        messagePreviewParams5.quoteEnd = i182;
                                        messagePreviewParams5.quote = org.telegram.ui.mn.b(i172, i182, c11);
                                        fc0Var2.b();
                                        fc0Var2.a(true);
                                        break;
                                    } else {
                                        zb0Var5.f();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                zb0 zb0Var6 = this.b;
                                rb0 rb0Var3 = zb0Var6.e;
                                fc0 fc0Var3 = zb0Var6.c0;
                                MessagePreviewParams messagePreviewParams6 = fc0Var3.d;
                                int i192 = fc0Var3.w;
                                boolean z13 = fc0Var3.b;
                                if (messagePreviewParams6.quote != null && !z13) {
                                    messagePreviewParams6.quote = null;
                                    rb0Var3.f(false);
                                    zb0Var6.g(false, true);
                                    zb0Var6.k(true);
                                    break;
                                } else if (rb0Var3.v - rb0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                    MessageObject c12 = zb0Var6.c(null);
                                    if (c12 != null) {
                                        if (!rb0Var3.y()) {
                                            messagePreviewParams6.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                            messagePreviewParams6.quoteEnd = min;
                                            messagePreviewParams6.quote = org.telegram.ui.mn.b(messagePreviewParams6.quoteStart, min, c12);
                                            View d10 = zb0Var6.d();
                                            if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                rb0Var3.a0((org.telegram.ui.Cells.u1) d10, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                            }
                                            if (!z13) {
                                                zb0Var6.s.getSwipeBack().e(zb0Var6.I);
                                            }
                                            zb0Var6.g(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams6.quoteStart = rb0Var3.u;
                                            messagePreviewParams6.quoteEnd = rb0Var3.v;
                                            org.telegram.ui.Cells.y9 y9Var2 = rb0Var3.W;
                                            messagePreviewParams6.quote = org.telegram.ui.mn.b(messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd, zb0Var6.c(y9Var2 != null ? ((org.telegram.ui.Cells.u1) y9Var2).getMessageObject() : null));
                                            fc0Var3.b();
                                            fc0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    zb0Var6.f();
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
                                fc0 fc0Var4 = this.b.c0;
                                if (!fc0Var4.b) {
                                    org.telegram.ui.el elVar = (org.telegram.ui.el) fc0Var4;
                                    elVar.a(true);
                                    org.telegram.ui.wn wnVar = elVar.H;
                                    wnVar.n5 = null;
                                    wnVar.l5 = null;
                                    wnVar.f5.updateReply(null, null, wnVar.T5, null);
                                    wnVar.j8();
                                    break;
                                } else {
                                    org.telegram.ui.el elVar2 = (org.telegram.ui.el) fc0Var4;
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
                                zb0 zb0Var7 = this.b;
                                MessagePreviewParams messagePreviewParams8 = zb0Var7.c0.d;
                                if (messagePreviewParams8.hasMedia) {
                                    boolean z14 = !messagePreviewParams8.webpageSmall;
                                    messagePreviewParams8.webpageSmall = z14;
                                    zb0Var7.G.a(z14, true);
                                    zb0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                    if (zb0Var7.r.messages.size() > 0 && (message2 = zb0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z15 = messagePreviewParams8.webpageSmall;
                                        messageMedia2.force_small_media = z15;
                                        messageMedia2.force_large_media = !z15;
                                    }
                                    if (zb0Var7.r.previewMessages.size() > 0 && (message = zb0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z16 = messagePreviewParams8.webpageSmall;
                                        messageMedia.force_small_media = z16;
                                        messageMedia.force_large_media = !z16;
                                    }
                                    zb0Var7.h();
                                    zb0Var7.U = true;
                                    break;
                                }
                                break;
                            default:
                                zb0 zb0Var8 = this.b;
                                MessagePreviewParams messagePreviewParams9 = zb0Var8.c0.d;
                                boolean z17 = messagePreviewParams9.webpageTop;
                                messagePreviewParams9.webpageTop = !z17;
                                zb0Var8.E.a(z17, true);
                                if (zb0Var8.r.messages.size() > 0 && (message4 = zb0Var8.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams9.webpageTop;
                                }
                                if (zb0Var8.r.previewMessages.size() > 0 && (message3 = zb0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams9.webpageTop;
                                }
                                zb0Var8.h();
                                zb0Var8.U = true;
                                break;
                        }
                    }
                });
                this.s.a(e1Var4, w7.y5.n(-1, 48));
                org.telegram.ui.ActionBar.e1 e1Var5 = new org.telegram.ui.ActionBar.e1(1, context, fc0Var.F, false, true);
                e1Var5.g(LocaleController.getString(R.string.DoNotForward), R.drawable.msg_delete, null);
                int v03 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.q7, bc0Var);
                int i23 = org.telegram.ui.ActionBar.h6.p7;
                e1Var5.c(v03, org.telegram.ui.ActionBar.h6.v0(i23, bc0Var));
                final int i24 = 9;
                e1Var5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.jb0
                    public final /* synthetic */ zb0 b;

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
                                zb0 zb0Var4 = this.b;
                                zb0Var4.c0.d.quote = null;
                                zb0Var4.e.f(false);
                                zb0Var4.g(false, false);
                                zb0Var4.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                zb0 zb0Var5 = this.b;
                                rb0 rb0Var2 = zb0Var5.e;
                                fc0 fc0Var2 = zb0Var5.c0;
                                if (zb0Var5.c(null) != null) {
                                    if (rb0Var2.v - rb0Var2.u <= MessagesController.getInstance(fc0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.y9 y9Var = rb0Var2.W;
                                        MessageObject c11 = zb0Var5.c(y9Var != null ? ((org.telegram.ui.Cells.u1) y9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams5 = fc0Var2.d;
                                        int i172 = rb0Var2.u;
                                        messagePreviewParams5.quoteStart = i172;
                                        int i182 = rb0Var2.v;
                                        messagePreviewParams5.quoteEnd = i182;
                                        messagePreviewParams5.quote = org.telegram.ui.mn.b(i172, i182, c11);
                                        fc0Var2.b();
                                        fc0Var2.a(true);
                                        break;
                                    } else {
                                        zb0Var5.f();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                zb0 zb0Var6 = this.b;
                                rb0 rb0Var3 = zb0Var6.e;
                                fc0 fc0Var3 = zb0Var6.c0;
                                MessagePreviewParams messagePreviewParams6 = fc0Var3.d;
                                int i192 = fc0Var3.w;
                                boolean z13 = fc0Var3.b;
                                if (messagePreviewParams6.quote != null && !z13) {
                                    messagePreviewParams6.quote = null;
                                    rb0Var3.f(false);
                                    zb0Var6.g(false, true);
                                    zb0Var6.k(true);
                                    break;
                                } else if (rb0Var3.v - rb0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                    MessageObject c12 = zb0Var6.c(null);
                                    if (c12 != null) {
                                        if (!rb0Var3.y()) {
                                            messagePreviewParams6.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                            messagePreviewParams6.quoteEnd = min;
                                            messagePreviewParams6.quote = org.telegram.ui.mn.b(messagePreviewParams6.quoteStart, min, c12);
                                            View d10 = zb0Var6.d();
                                            if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                rb0Var3.a0((org.telegram.ui.Cells.u1) d10, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                            }
                                            if (!z13) {
                                                zb0Var6.s.getSwipeBack().e(zb0Var6.I);
                                            }
                                            zb0Var6.g(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams6.quoteStart = rb0Var3.u;
                                            messagePreviewParams6.quoteEnd = rb0Var3.v;
                                            org.telegram.ui.Cells.y9 y9Var2 = rb0Var3.W;
                                            messagePreviewParams6.quote = org.telegram.ui.mn.b(messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd, zb0Var6.c(y9Var2 != null ? ((org.telegram.ui.Cells.u1) y9Var2).getMessageObject() : null));
                                            fc0Var3.b();
                                            fc0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    zb0Var6.f();
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
                                fc0 fc0Var4 = this.b.c0;
                                if (!fc0Var4.b) {
                                    org.telegram.ui.el elVar = (org.telegram.ui.el) fc0Var4;
                                    elVar.a(true);
                                    org.telegram.ui.wn wnVar = elVar.H;
                                    wnVar.n5 = null;
                                    wnVar.l5 = null;
                                    wnVar.f5.updateReply(null, null, wnVar.T5, null);
                                    wnVar.j8();
                                    break;
                                } else {
                                    org.telegram.ui.el elVar2 = (org.telegram.ui.el) fc0Var4;
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
                                zb0 zb0Var7 = this.b;
                                MessagePreviewParams messagePreviewParams8 = zb0Var7.c0.d;
                                if (messagePreviewParams8.hasMedia) {
                                    boolean z14 = !messagePreviewParams8.webpageSmall;
                                    messagePreviewParams8.webpageSmall = z14;
                                    zb0Var7.G.a(z14, true);
                                    zb0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                    if (zb0Var7.r.messages.size() > 0 && (message2 = zb0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z15 = messagePreviewParams8.webpageSmall;
                                        messageMedia2.force_small_media = z15;
                                        messageMedia2.force_large_media = !z15;
                                    }
                                    if (zb0Var7.r.previewMessages.size() > 0 && (message = zb0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z16 = messagePreviewParams8.webpageSmall;
                                        messageMedia.force_small_media = z16;
                                        messageMedia.force_large_media = !z16;
                                    }
                                    zb0Var7.h();
                                    zb0Var7.U = true;
                                    break;
                                }
                                break;
                            default:
                                zb0 zb0Var8 = this.b;
                                MessagePreviewParams messagePreviewParams9 = zb0Var8.c0.d;
                                boolean z17 = messagePreviewParams9.webpageTop;
                                messagePreviewParams9.webpageTop = !z17;
                                zb0Var8.E.a(z17, true);
                                if (zb0Var8.r.messages.size() > 0 && (message4 = zb0Var8.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams9.webpageTop;
                                }
                                if (zb0Var8.r.previewMessages.size() > 0 && (message3 = zb0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams9.webpageTop;
                                }
                                zb0Var8.h();
                                zb0Var8.U = true;
                                break;
                        }
                    }
                });
                e1Var5.setSelectorColor(org.telegram.ui.ActionBar.h6.l1(0.12f, org.telegram.ui.ActionBar.h6.w0(null, i23, false)));
                this.s.a(e1Var5, w7.y5.n(-1, 48));
                ec0 ec0Var8 = ec0Var;
                ec0Var8.a(messagePreviewParams.hideForwardSendersName, false);
                ec0 ec0Var9 = ec0Var2;
                zb0 zb0Var4 = this;
                ec0Var8.setOnClickListener(new mb0(this, z10, context, ec0Var9, ec0Var8, 0));
                zb0Var = zb0Var4;
                if (ec0Var9 != null) {
                    ec0Var9.setOnClickListener(new ai.d0(zb0Var4, ec0Var9, ec0Var8, 24));
                    zb0Var = zb0Var4;
                }
            }
            context2 = context;
            zb0Var2 = zb0Var;
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
                    org.telegram.ui.ActionBar.e1 e1Var6 = new org.telegram.ui.ActionBar.e1(0, context3, fc0Var.F, true, false);
                    e1Var6.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                    e1Var6.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.jb0
                        public final /* synthetic */ zb0 b;

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
                                    zb0 zb0Var42 = this.b;
                                    zb0Var42.c0.d.quote = null;
                                    zb0Var42.e.f(false);
                                    zb0Var42.g(false, false);
                                    zb0Var42.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    zb0 zb0Var5 = this.b;
                                    rb0 rb0Var2 = zb0Var5.e;
                                    fc0 fc0Var2 = zb0Var5.c0;
                                    if (zb0Var5.c(null) != null) {
                                        if (rb0Var2.v - rb0Var2.u <= MessagesController.getInstance(fc0Var2.w).quoteLengthMax) {
                                            org.telegram.ui.Cells.y9 y9Var = rb0Var2.W;
                                            MessageObject c11 = zb0Var5.c(y9Var != null ? ((org.telegram.ui.Cells.u1) y9Var).getMessageObject() : null);
                                            MessagePreviewParams messagePreviewParams5 = fc0Var2.d;
                                            int i172 = rb0Var2.u;
                                            messagePreviewParams5.quoteStart = i172;
                                            int i182 = rb0Var2.v;
                                            messagePreviewParams5.quoteEnd = i182;
                                            messagePreviewParams5.quote = org.telegram.ui.mn.b(i172, i182, c11);
                                            fc0Var2.b();
                                            fc0Var2.a(true);
                                            break;
                                        } else {
                                            zb0Var5.f();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    zb0 zb0Var6 = this.b;
                                    rb0 rb0Var3 = zb0Var6.e;
                                    fc0 fc0Var3 = zb0Var6.c0;
                                    MessagePreviewParams messagePreviewParams6 = fc0Var3.d;
                                    int i192 = fc0Var3.w;
                                    boolean z13 = fc0Var3.b;
                                    if (messagePreviewParams6.quote != null && !z13) {
                                        messagePreviewParams6.quote = null;
                                        rb0Var3.f(false);
                                        zb0Var6.g(false, true);
                                        zb0Var6.k(true);
                                        break;
                                    } else if (rb0Var3.v - rb0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                        MessageObject c12 = zb0Var6.c(null);
                                        if (c12 != null) {
                                            if (!rb0Var3.y()) {
                                                messagePreviewParams6.quoteStart = 0;
                                                int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                                messagePreviewParams6.quoteEnd = min;
                                                messagePreviewParams6.quote = org.telegram.ui.mn.b(messagePreviewParams6.quoteStart, min, c12);
                                                View d10 = zb0Var6.d();
                                                if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                    rb0Var3.a0((org.telegram.ui.Cells.u1) d10, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                                }
                                                if (!z13) {
                                                    zb0Var6.s.getSwipeBack().e(zb0Var6.I);
                                                }
                                                zb0Var6.g(true, true);
                                                break;
                                            } else {
                                                messagePreviewParams6.quoteStart = rb0Var3.u;
                                                messagePreviewParams6.quoteEnd = rb0Var3.v;
                                                org.telegram.ui.Cells.y9 y9Var2 = rb0Var3.W;
                                                messagePreviewParams6.quote = org.telegram.ui.mn.b(messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd, zb0Var6.c(y9Var2 != null ? ((org.telegram.ui.Cells.u1) y9Var2).getMessageObject() : null));
                                                fc0Var3.b();
                                                fc0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        zb0Var6.f();
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
                                    fc0 fc0Var4 = this.b.c0;
                                    if (!fc0Var4.b) {
                                        org.telegram.ui.el elVar = (org.telegram.ui.el) fc0Var4;
                                        elVar.a(true);
                                        org.telegram.ui.wn wnVar = elVar.H;
                                        wnVar.n5 = null;
                                        wnVar.l5 = null;
                                        wnVar.f5.updateReply(null, null, wnVar.T5, null);
                                        wnVar.j8();
                                        break;
                                    } else {
                                        org.telegram.ui.el elVar2 = (org.telegram.ui.el) fc0Var4;
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
                                    zb0 zb0Var7 = this.b;
                                    MessagePreviewParams messagePreviewParams8 = zb0Var7.c0.d;
                                    if (messagePreviewParams8.hasMedia) {
                                        boolean z14 = !messagePreviewParams8.webpageSmall;
                                        messagePreviewParams8.webpageSmall = z14;
                                        zb0Var7.G.a(z14, true);
                                        zb0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                        if (zb0Var7.r.messages.size() > 0 && (message2 = zb0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z15 = messagePreviewParams8.webpageSmall;
                                            messageMedia2.force_small_media = z15;
                                            messageMedia2.force_large_media = !z15;
                                        }
                                        if (zb0Var7.r.previewMessages.size() > 0 && (message = zb0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                            boolean z16 = messagePreviewParams8.webpageSmall;
                                            messageMedia.force_small_media = z16;
                                            messageMedia.force_large_media = !z16;
                                        }
                                        zb0Var7.h();
                                        zb0Var7.U = true;
                                        break;
                                    }
                                    break;
                                default:
                                    zb0 zb0Var8 = this.b;
                                    MessagePreviewParams messagePreviewParams9 = zb0Var8.c0.d;
                                    boolean z17 = messagePreviewParams9.webpageTop;
                                    messagePreviewParams9.webpageTop = !z17;
                                    zb0Var8.E.a(z17, true);
                                    if (zb0Var8.r.messages.size() > 0 && (message4 = zb0Var8.r.messages.get(0).messageOwner) != null) {
                                        message4.invert_media = messagePreviewParams9.webpageTop;
                                    }
                                    if (zb0Var8.r.previewMessages.size() > 0 && (message3 = zb0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                        message3.invert_media = messagePreviewParams9.webpageTop;
                                    }
                                    zb0Var8.h();
                                    zb0Var8.U = true;
                                    break;
                            }
                        }
                    });
                    r92.addView(e1Var6, w7.y5.n(-1, 48));
                    org.telegram.ui.ActionBar.j1 j1Var3 = new org.telegram.ui.ActionBar.j1(context3, bc0Var);
                    j1Var3.setColor(org.telegram.ui.ActionBar.h6.l1(0.06f, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.E8, bc0Var)));
                    j1Var3.setTag(R.id.fit_width_tag, 1);
                    r92.addView(j1Var3, w7.y5.n(-1, 8));
                    org.telegram.ui.ActionBar.e1 e1Var7 = new org.telegram.ui.ActionBar.e1(0, context3, fc0Var.F, false, true);
                    e1Var7.g(LocaleController.getString(R.string.QuoteSelectedPart), R.drawable.menu_quote_specific, null);
                    z11 = true;
                    final boolean z13 = true ? 1 : 0;
                    e1Var7.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.jb0
                        public final /* synthetic */ zb0 b;

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
                                    zb0 zb0Var42 = this.b;
                                    zb0Var42.c0.d.quote = null;
                                    zb0Var42.e.f(false);
                                    zb0Var42.g(false, false);
                                    zb0Var42.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    zb0 zb0Var5 = this.b;
                                    rb0 rb0Var2 = zb0Var5.e;
                                    fc0 fc0Var2 = zb0Var5.c0;
                                    if (zb0Var5.c(null) != null) {
                                        if (rb0Var2.v - rb0Var2.u <= MessagesController.getInstance(fc0Var2.w).quoteLengthMax) {
                                            org.telegram.ui.Cells.y9 y9Var = rb0Var2.W;
                                            MessageObject c11 = zb0Var5.c(y9Var != null ? ((org.telegram.ui.Cells.u1) y9Var).getMessageObject() : null);
                                            MessagePreviewParams messagePreviewParams5 = fc0Var2.d;
                                            int i172 = rb0Var2.u;
                                            messagePreviewParams5.quoteStart = i172;
                                            int i182 = rb0Var2.v;
                                            messagePreviewParams5.quoteEnd = i182;
                                            messagePreviewParams5.quote = org.telegram.ui.mn.b(i172, i182, c11);
                                            fc0Var2.b();
                                            fc0Var2.a(true);
                                            break;
                                        } else {
                                            zb0Var5.f();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    zb0 zb0Var6 = this.b;
                                    rb0 rb0Var3 = zb0Var6.e;
                                    fc0 fc0Var3 = zb0Var6.c0;
                                    MessagePreviewParams messagePreviewParams6 = fc0Var3.d;
                                    int i192 = fc0Var3.w;
                                    boolean z132 = fc0Var3.b;
                                    if (messagePreviewParams6.quote != null && !z132) {
                                        messagePreviewParams6.quote = null;
                                        rb0Var3.f(false);
                                        zb0Var6.g(false, true);
                                        zb0Var6.k(true);
                                        break;
                                    } else if (rb0Var3.v - rb0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                        MessageObject c12 = zb0Var6.c(null);
                                        if (c12 != null) {
                                            if (!rb0Var3.y()) {
                                                messagePreviewParams6.quoteStart = 0;
                                                int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                                messagePreviewParams6.quoteEnd = min;
                                                messagePreviewParams6.quote = org.telegram.ui.mn.b(messagePreviewParams6.quoteStart, min, c12);
                                                View d10 = zb0Var6.d();
                                                if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                    rb0Var3.a0((org.telegram.ui.Cells.u1) d10, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                                }
                                                if (!z132) {
                                                    zb0Var6.s.getSwipeBack().e(zb0Var6.I);
                                                }
                                                zb0Var6.g(true, true);
                                                break;
                                            } else {
                                                messagePreviewParams6.quoteStart = rb0Var3.u;
                                                messagePreviewParams6.quoteEnd = rb0Var3.v;
                                                org.telegram.ui.Cells.y9 y9Var2 = rb0Var3.W;
                                                messagePreviewParams6.quote = org.telegram.ui.mn.b(messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd, zb0Var6.c(y9Var2 != null ? ((org.telegram.ui.Cells.u1) y9Var2).getMessageObject() : null));
                                                fc0Var3.b();
                                                fc0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        zb0Var6.f();
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
                                    fc0 fc0Var4 = this.b.c0;
                                    if (!fc0Var4.b) {
                                        org.telegram.ui.el elVar = (org.telegram.ui.el) fc0Var4;
                                        elVar.a(true);
                                        org.telegram.ui.wn wnVar = elVar.H;
                                        wnVar.n5 = null;
                                        wnVar.l5 = null;
                                        wnVar.f5.updateReply(null, null, wnVar.T5, null);
                                        wnVar.j8();
                                        break;
                                    } else {
                                        org.telegram.ui.el elVar2 = (org.telegram.ui.el) fc0Var4;
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
                                    zb0 zb0Var7 = this.b;
                                    MessagePreviewParams messagePreviewParams8 = zb0Var7.c0.d;
                                    if (messagePreviewParams8.hasMedia) {
                                        boolean z14 = !messagePreviewParams8.webpageSmall;
                                        messagePreviewParams8.webpageSmall = z14;
                                        zb0Var7.G.a(z14, true);
                                        zb0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                        if (zb0Var7.r.messages.size() > 0 && (message2 = zb0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z15 = messagePreviewParams8.webpageSmall;
                                            messageMedia2.force_small_media = z15;
                                            messageMedia2.force_large_media = !z15;
                                        }
                                        if (zb0Var7.r.previewMessages.size() > 0 && (message = zb0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                            boolean z16 = messagePreviewParams8.webpageSmall;
                                            messageMedia.force_small_media = z16;
                                            messageMedia.force_large_media = !z16;
                                        }
                                        zb0Var7.h();
                                        zb0Var7.U = true;
                                        break;
                                    }
                                    break;
                                default:
                                    zb0 zb0Var8 = this.b;
                                    MessagePreviewParams messagePreviewParams9 = zb0Var8.c0.d;
                                    boolean z17 = messagePreviewParams9.webpageTop;
                                    messagePreviewParams9.webpageTop = !z17;
                                    zb0Var8.E.a(z17, true);
                                    if (zb0Var8.r.messages.size() > 0 && (message4 = zb0Var8.r.messages.get(0).messageOwner) != null) {
                                        message4.invert_media = messagePreviewParams9.webpageTop;
                                    }
                                    if (zb0Var8.r.previewMessages.size() > 0 && (message3 = zb0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                        message3.invert_media = messagePreviewParams9.webpageTop;
                                    }
                                    zb0Var8.h();
                                    zb0Var8.U = true;
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
                qb0 qb0Var = new qb0(1, 0, context, fc0Var.F, true, false);
                this.v = qb0Var;
                qb0Var.g(LocaleController.getString(z12 ? R.string.QuoteSelectedPart : R.string.SelectSpecificQuote), R.drawable.menu_select_quote, drawable);
                qb0 qb0Var2 = new qb0(1, 1, context, fc0Var.F, true, false);
                context3 = context;
                this.w = qb0Var2;
                qb0Var2.g(LocaleController.getString(R.string.ClearQuote), R.drawable.menu_quote_delete, drawable);
                frameLayout2.setBackground(org.telegram.ui.ActionBar.h6.Y(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.I5, bc0Var), 6, 0));
                final int i25 = 2;
                frameLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.jb0
                    public final /* synthetic */ zb0 b;

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
                                zb0 zb0Var42 = this.b;
                                zb0Var42.c0.d.quote = null;
                                zb0Var42.e.f(false);
                                zb0Var42.g(false, false);
                                zb0Var42.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                zb0 zb0Var5 = this.b;
                                rb0 rb0Var2 = zb0Var5.e;
                                fc0 fc0Var2 = zb0Var5.c0;
                                if (zb0Var5.c(null) != null) {
                                    if (rb0Var2.v - rb0Var2.u <= MessagesController.getInstance(fc0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.y9 y9Var = rb0Var2.W;
                                        MessageObject c11 = zb0Var5.c(y9Var != null ? ((org.telegram.ui.Cells.u1) y9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams5 = fc0Var2.d;
                                        int i172 = rb0Var2.u;
                                        messagePreviewParams5.quoteStart = i172;
                                        int i182 = rb0Var2.v;
                                        messagePreviewParams5.quoteEnd = i182;
                                        messagePreviewParams5.quote = org.telegram.ui.mn.b(i172, i182, c11);
                                        fc0Var2.b();
                                        fc0Var2.a(true);
                                        break;
                                    } else {
                                        zb0Var5.f();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                zb0 zb0Var6 = this.b;
                                rb0 rb0Var3 = zb0Var6.e;
                                fc0 fc0Var3 = zb0Var6.c0;
                                MessagePreviewParams messagePreviewParams6 = fc0Var3.d;
                                int i192 = fc0Var3.w;
                                boolean z132 = fc0Var3.b;
                                if (messagePreviewParams6.quote != null && !z132) {
                                    messagePreviewParams6.quote = null;
                                    rb0Var3.f(false);
                                    zb0Var6.g(false, true);
                                    zb0Var6.k(true);
                                    break;
                                } else if (rb0Var3.v - rb0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                    MessageObject c12 = zb0Var6.c(null);
                                    if (c12 != null) {
                                        if (!rb0Var3.y()) {
                                            messagePreviewParams6.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                            messagePreviewParams6.quoteEnd = min;
                                            messagePreviewParams6.quote = org.telegram.ui.mn.b(messagePreviewParams6.quoteStart, min, c12);
                                            View d10 = zb0Var6.d();
                                            if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                rb0Var3.a0((org.telegram.ui.Cells.u1) d10, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                            }
                                            if (!z132) {
                                                zb0Var6.s.getSwipeBack().e(zb0Var6.I);
                                            }
                                            zb0Var6.g(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams6.quoteStart = rb0Var3.u;
                                            messagePreviewParams6.quoteEnd = rb0Var3.v;
                                            org.telegram.ui.Cells.y9 y9Var2 = rb0Var3.W;
                                            messagePreviewParams6.quote = org.telegram.ui.mn.b(messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd, zb0Var6.c(y9Var2 != null ? ((org.telegram.ui.Cells.u1) y9Var2).getMessageObject() : null));
                                            fc0Var3.b();
                                            fc0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    zb0Var6.f();
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
                                fc0 fc0Var4 = this.b.c0;
                                if (!fc0Var4.b) {
                                    org.telegram.ui.el elVar = (org.telegram.ui.el) fc0Var4;
                                    elVar.a(true);
                                    org.telegram.ui.wn wnVar = elVar.H;
                                    wnVar.n5 = null;
                                    wnVar.l5 = null;
                                    wnVar.f5.updateReply(null, null, wnVar.T5, null);
                                    wnVar.j8();
                                    break;
                                } else {
                                    org.telegram.ui.el elVar2 = (org.telegram.ui.el) fc0Var4;
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
                                zb0 zb0Var7 = this.b;
                                MessagePreviewParams messagePreviewParams8 = zb0Var7.c0.d;
                                if (messagePreviewParams8.hasMedia) {
                                    boolean z14 = !messagePreviewParams8.webpageSmall;
                                    messagePreviewParams8.webpageSmall = z14;
                                    zb0Var7.G.a(z14, true);
                                    zb0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                    if (zb0Var7.r.messages.size() > 0 && (message2 = zb0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z15 = messagePreviewParams8.webpageSmall;
                                        messageMedia2.force_small_media = z15;
                                        messageMedia2.force_large_media = !z15;
                                    }
                                    if (zb0Var7.r.previewMessages.size() > 0 && (message = zb0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z16 = messagePreviewParams8.webpageSmall;
                                        messageMedia.force_small_media = z16;
                                        messageMedia.force_large_media = !z16;
                                    }
                                    zb0Var7.h();
                                    zb0Var7.U = true;
                                    break;
                                }
                                break;
                            default:
                                zb0 zb0Var8 = this.b;
                                MessagePreviewParams messagePreviewParams9 = zb0Var8.c0.d;
                                boolean z17 = messagePreviewParams9.webpageTop;
                                messagePreviewParams9.webpageTop = !z17;
                                zb0Var8.E.a(z17, true);
                                if (zb0Var8.r.messages.size() > 0 && (message4 = zb0Var8.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams9.webpageTop;
                                }
                                if (zb0Var8.r.previewMessages.size() > 0 && (message3 = zb0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams9.webpageTop;
                                }
                                zb0Var8.h();
                                zb0Var8.U = true;
                                break;
                        }
                    }
                });
                frameLayout2.addView(qb0Var, w7.y5.c(48.0f, -1));
                frameLayout2.addView(qb0Var2, w7.y5.c(48.0f, -1));
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout2, w7.y5.n(-1, 48));
                r11 = drawable;
            }
            messagePreviewParams = messagePreviewParams2;
            if (!messagePreviewParams.monoforum && !messagePreviewParams.noforwards && !messagePreviewParams.hasSecretMessages) {
                ?? frameLayout3 = new FrameLayout(context3);
                ?? e1Var8 = new org.telegram.ui.ActionBar.e1(1, context3, fc0Var.F, false, false);
                this.x = e1Var8;
                e1Var8.g(LocaleController.getString(R.string.ReplyToAnotherChat), R.drawable.msg_forward_replace, r11);
                final int i26 = 3;
                e1Var8.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.jb0
                    public final /* synthetic */ zb0 b;

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
                                zb0 zb0Var42 = this.b;
                                zb0Var42.c0.d.quote = null;
                                zb0Var42.e.f(false);
                                zb0Var42.g(false, false);
                                zb0Var42.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                zb0 zb0Var5 = this.b;
                                rb0 rb0Var2 = zb0Var5.e;
                                fc0 fc0Var2 = zb0Var5.c0;
                                if (zb0Var5.c(null) != null) {
                                    if (rb0Var2.v - rb0Var2.u <= MessagesController.getInstance(fc0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.y9 y9Var = rb0Var2.W;
                                        MessageObject c11 = zb0Var5.c(y9Var != null ? ((org.telegram.ui.Cells.u1) y9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams5 = fc0Var2.d;
                                        int i172 = rb0Var2.u;
                                        messagePreviewParams5.quoteStart = i172;
                                        int i182 = rb0Var2.v;
                                        messagePreviewParams5.quoteEnd = i182;
                                        messagePreviewParams5.quote = org.telegram.ui.mn.b(i172, i182, c11);
                                        fc0Var2.b();
                                        fc0Var2.a(true);
                                        break;
                                    } else {
                                        zb0Var5.f();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                zb0 zb0Var6 = this.b;
                                rb0 rb0Var3 = zb0Var6.e;
                                fc0 fc0Var3 = zb0Var6.c0;
                                MessagePreviewParams messagePreviewParams6 = fc0Var3.d;
                                int i192 = fc0Var3.w;
                                boolean z132 = fc0Var3.b;
                                if (messagePreviewParams6.quote != null && !z132) {
                                    messagePreviewParams6.quote = null;
                                    rb0Var3.f(false);
                                    zb0Var6.g(false, true);
                                    zb0Var6.k(true);
                                    break;
                                } else if (rb0Var3.v - rb0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                    MessageObject c12 = zb0Var6.c(null);
                                    if (c12 != null) {
                                        if (!rb0Var3.y()) {
                                            messagePreviewParams6.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                            messagePreviewParams6.quoteEnd = min;
                                            messagePreviewParams6.quote = org.telegram.ui.mn.b(messagePreviewParams6.quoteStart, min, c12);
                                            View d10 = zb0Var6.d();
                                            if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                rb0Var3.a0((org.telegram.ui.Cells.u1) d10, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                            }
                                            if (!z132) {
                                                zb0Var6.s.getSwipeBack().e(zb0Var6.I);
                                            }
                                            zb0Var6.g(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams6.quoteStart = rb0Var3.u;
                                            messagePreviewParams6.quoteEnd = rb0Var3.v;
                                            org.telegram.ui.Cells.y9 y9Var2 = rb0Var3.W;
                                            messagePreviewParams6.quote = org.telegram.ui.mn.b(messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd, zb0Var6.c(y9Var2 != null ? ((org.telegram.ui.Cells.u1) y9Var2).getMessageObject() : null));
                                            fc0Var3.b();
                                            fc0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    zb0Var6.f();
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
                                fc0 fc0Var4 = this.b.c0;
                                if (!fc0Var4.b) {
                                    org.telegram.ui.el elVar = (org.telegram.ui.el) fc0Var4;
                                    elVar.a(true);
                                    org.telegram.ui.wn wnVar = elVar.H;
                                    wnVar.n5 = null;
                                    wnVar.l5 = null;
                                    wnVar.f5.updateReply(null, null, wnVar.T5, null);
                                    wnVar.j8();
                                    break;
                                } else {
                                    org.telegram.ui.el elVar2 = (org.telegram.ui.el) fc0Var4;
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
                                zb0 zb0Var7 = this.b;
                                MessagePreviewParams messagePreviewParams8 = zb0Var7.c0.d;
                                if (messagePreviewParams8.hasMedia) {
                                    boolean z14 = !messagePreviewParams8.webpageSmall;
                                    messagePreviewParams8.webpageSmall = z14;
                                    zb0Var7.G.a(z14, true);
                                    zb0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                    if (zb0Var7.r.messages.size() > 0 && (message2 = zb0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z15 = messagePreviewParams8.webpageSmall;
                                        messageMedia2.force_small_media = z15;
                                        messageMedia2.force_large_media = !z15;
                                    }
                                    if (zb0Var7.r.previewMessages.size() > 0 && (message = zb0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z16 = messagePreviewParams8.webpageSmall;
                                        messageMedia.force_small_media = z16;
                                        messageMedia.force_large_media = !z16;
                                    }
                                    zb0Var7.h();
                                    zb0Var7.U = true;
                                    break;
                                }
                                break;
                            default:
                                zb0 zb0Var8 = this.b;
                                MessagePreviewParams messagePreviewParams9 = zb0Var8.c0.d;
                                boolean z17 = messagePreviewParams9.webpageTop;
                                messagePreviewParams9.webpageTop = !z17;
                                zb0Var8.E.a(z17, true);
                                if (zb0Var8.r.messages.size() > 0 && (message4 = zb0Var8.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams9.webpageTop;
                                }
                                if (zb0Var8.r.previewMessages.size() > 0 && (message3 = zb0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams9.webpageTop;
                                }
                                zb0Var8.h();
                                zb0Var8.U = true;
                                break;
                        }
                    }
                });
                context3 = context;
                ?? e1Var9 = new org.telegram.ui.ActionBar.e1(1, context3, fc0Var.F, false, false);
                this.y = e1Var9;
                e1Var9.g(LocaleController.getString(R.string.QuoteToAnotherChat), R.drawable.msg_forward_replace, r11);
                final int i27 = 4;
                e1Var9.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.jb0
                    public final /* synthetic */ zb0 b;

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
                                zb0 zb0Var42 = this.b;
                                zb0Var42.c0.d.quote = null;
                                zb0Var42.e.f(false);
                                zb0Var42.g(false, false);
                                zb0Var42.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                zb0 zb0Var5 = this.b;
                                rb0 rb0Var2 = zb0Var5.e;
                                fc0 fc0Var2 = zb0Var5.c0;
                                if (zb0Var5.c(null) != null) {
                                    if (rb0Var2.v - rb0Var2.u <= MessagesController.getInstance(fc0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.y9 y9Var = rb0Var2.W;
                                        MessageObject c11 = zb0Var5.c(y9Var != null ? ((org.telegram.ui.Cells.u1) y9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams5 = fc0Var2.d;
                                        int i172 = rb0Var2.u;
                                        messagePreviewParams5.quoteStart = i172;
                                        int i182 = rb0Var2.v;
                                        messagePreviewParams5.quoteEnd = i182;
                                        messagePreviewParams5.quote = org.telegram.ui.mn.b(i172, i182, c11);
                                        fc0Var2.b();
                                        fc0Var2.a(true);
                                        break;
                                    } else {
                                        zb0Var5.f();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                zb0 zb0Var6 = this.b;
                                rb0 rb0Var3 = zb0Var6.e;
                                fc0 fc0Var3 = zb0Var6.c0;
                                MessagePreviewParams messagePreviewParams6 = fc0Var3.d;
                                int i192 = fc0Var3.w;
                                boolean z132 = fc0Var3.b;
                                if (messagePreviewParams6.quote != null && !z132) {
                                    messagePreviewParams6.quote = null;
                                    rb0Var3.f(false);
                                    zb0Var6.g(false, true);
                                    zb0Var6.k(true);
                                    break;
                                } else if (rb0Var3.v - rb0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                    MessageObject c12 = zb0Var6.c(null);
                                    if (c12 != null) {
                                        if (!rb0Var3.y()) {
                                            messagePreviewParams6.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                            messagePreviewParams6.quoteEnd = min;
                                            messagePreviewParams6.quote = org.telegram.ui.mn.b(messagePreviewParams6.quoteStart, min, c12);
                                            View d10 = zb0Var6.d();
                                            if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                rb0Var3.a0((org.telegram.ui.Cells.u1) d10, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                            }
                                            if (!z132) {
                                                zb0Var6.s.getSwipeBack().e(zb0Var6.I);
                                            }
                                            zb0Var6.g(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams6.quoteStart = rb0Var3.u;
                                            messagePreviewParams6.quoteEnd = rb0Var3.v;
                                            org.telegram.ui.Cells.y9 y9Var2 = rb0Var3.W;
                                            messagePreviewParams6.quote = org.telegram.ui.mn.b(messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd, zb0Var6.c(y9Var2 != null ? ((org.telegram.ui.Cells.u1) y9Var2).getMessageObject() : null));
                                            fc0Var3.b();
                                            fc0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    zb0Var6.f();
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
                                fc0 fc0Var4 = this.b.c0;
                                if (!fc0Var4.b) {
                                    org.telegram.ui.el elVar = (org.telegram.ui.el) fc0Var4;
                                    elVar.a(true);
                                    org.telegram.ui.wn wnVar = elVar.H;
                                    wnVar.n5 = null;
                                    wnVar.l5 = null;
                                    wnVar.f5.updateReply(null, null, wnVar.T5, null);
                                    wnVar.j8();
                                    break;
                                } else {
                                    org.telegram.ui.el elVar2 = (org.telegram.ui.el) fc0Var4;
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
                                zb0 zb0Var7 = this.b;
                                MessagePreviewParams messagePreviewParams8 = zb0Var7.c0.d;
                                if (messagePreviewParams8.hasMedia) {
                                    boolean z14 = !messagePreviewParams8.webpageSmall;
                                    messagePreviewParams8.webpageSmall = z14;
                                    zb0Var7.G.a(z14, true);
                                    zb0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                    if (zb0Var7.r.messages.size() > 0 && (message2 = zb0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z15 = messagePreviewParams8.webpageSmall;
                                        messageMedia2.force_small_media = z15;
                                        messageMedia2.force_large_media = !z15;
                                    }
                                    if (zb0Var7.r.previewMessages.size() > 0 && (message = zb0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z16 = messagePreviewParams8.webpageSmall;
                                        messageMedia.force_small_media = z16;
                                        messageMedia.force_large_media = !z16;
                                    }
                                    zb0Var7.h();
                                    zb0Var7.U = true;
                                    break;
                                }
                                break;
                            default:
                                zb0 zb0Var8 = this.b;
                                MessagePreviewParams messagePreviewParams9 = zb0Var8.c0.d;
                                boolean z17 = messagePreviewParams9.webpageTop;
                                messagePreviewParams9.webpageTop = !z17;
                                zb0Var8.E.a(z17, true);
                                if (zb0Var8.r.messages.size() > 0 && (message4 = zb0Var8.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams9.webpageTop;
                                }
                                if (zb0Var8.r.previewMessages.size() > 0 && (message3 = zb0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams9.webpageTop;
                                }
                                zb0Var8.h();
                                zb0Var8.U = true;
                                break;
                        }
                    }
                });
                frameLayout3.addView(e1Var9, w7.y5.c(48.0f, -1));
                frameLayout3.addView(e1Var8, w7.y5.c(48.0f, -1));
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout3, w7.y5.n(-1, 48));
            }
            if (!messagePreviewParams.noforwards && !messagePreviewParams.hasSecretMessages) {
                org.telegram.ui.ActionBar.j1 j1Var4 = new org.telegram.ui.ActionBar.j1(context3, bc0Var);
                j1Var4.setColor(org.telegram.ui.ActionBar.h6.l1(0.06f, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.E8, bc0Var)));
                j1Var4.setTag(R.id.fit_width_tag, 1);
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(j1Var4, w7.y5.n(-1, 8));
            }
            g(messagePreviewParams.quote != null, false);
            ?? e1Var10 = new org.telegram.ui.ActionBar.e1(1, context3, fc0Var.F, false, false);
            e1Var10.g(LocaleController.getString(R.string.ApplyChanges), R.drawable.msg_select, r11);
            final int i28 = 5;
            e1Var10.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.jb0
                public final /* synthetic */ zb0 b;

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
                            zb0 zb0Var42 = this.b;
                            zb0Var42.c0.d.quote = null;
                            zb0Var42.e.f(false);
                            zb0Var42.g(false, false);
                            zb0Var42.s.getSwipeBack().b(true);
                            break;
                        case 1:
                            zb0 zb0Var5 = this.b;
                            rb0 rb0Var2 = zb0Var5.e;
                            fc0 fc0Var2 = zb0Var5.c0;
                            if (zb0Var5.c(null) != null) {
                                if (rb0Var2.v - rb0Var2.u <= MessagesController.getInstance(fc0Var2.w).quoteLengthMax) {
                                    org.telegram.ui.Cells.y9 y9Var = rb0Var2.W;
                                    MessageObject c11 = zb0Var5.c(y9Var != null ? ((org.telegram.ui.Cells.u1) y9Var).getMessageObject() : null);
                                    MessagePreviewParams messagePreviewParams5 = fc0Var2.d;
                                    int i172 = rb0Var2.u;
                                    messagePreviewParams5.quoteStart = i172;
                                    int i182 = rb0Var2.v;
                                    messagePreviewParams5.quoteEnd = i182;
                                    messagePreviewParams5.quote = org.telegram.ui.mn.b(i172, i182, c11);
                                    fc0Var2.b();
                                    fc0Var2.a(true);
                                    break;
                                } else {
                                    zb0Var5.f();
                                    break;
                                }
                            }
                            break;
                        case 2:
                            zb0 zb0Var6 = this.b;
                            rb0 rb0Var3 = zb0Var6.e;
                            fc0 fc0Var3 = zb0Var6.c0;
                            MessagePreviewParams messagePreviewParams6 = fc0Var3.d;
                            int i192 = fc0Var3.w;
                            boolean z132 = fc0Var3.b;
                            if (messagePreviewParams6.quote != null && !z132) {
                                messagePreviewParams6.quote = null;
                                rb0Var3.f(false);
                                zb0Var6.g(false, true);
                                zb0Var6.k(true);
                                break;
                            } else if (rb0Var3.v - rb0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                MessageObject c12 = zb0Var6.c(null);
                                if (c12 != null) {
                                    if (!rb0Var3.y()) {
                                        messagePreviewParams6.quoteStart = 0;
                                        int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                        messagePreviewParams6.quoteEnd = min;
                                        messagePreviewParams6.quote = org.telegram.ui.mn.b(messagePreviewParams6.quoteStart, min, c12);
                                        View d10 = zb0Var6.d();
                                        if (d10 instanceof org.telegram.ui.Cells.u1) {
                                            rb0Var3.a0((org.telegram.ui.Cells.u1) d10, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                        }
                                        if (!z132) {
                                            zb0Var6.s.getSwipeBack().e(zb0Var6.I);
                                        }
                                        zb0Var6.g(true, true);
                                        break;
                                    } else {
                                        messagePreviewParams6.quoteStart = rb0Var3.u;
                                        messagePreviewParams6.quoteEnd = rb0Var3.v;
                                        org.telegram.ui.Cells.y9 y9Var2 = rb0Var3.W;
                                        messagePreviewParams6.quote = org.telegram.ui.mn.b(messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd, zb0Var6.c(y9Var2 != null ? ((org.telegram.ui.Cells.u1) y9Var2).getMessageObject() : null));
                                        fc0Var3.b();
                                        fc0Var3.a(true);
                                        break;
                                    }
                                }
                            } else {
                                zb0Var6.f();
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
                            fc0 fc0Var4 = this.b.c0;
                            if (!fc0Var4.b) {
                                org.telegram.ui.el elVar = (org.telegram.ui.el) fc0Var4;
                                elVar.a(true);
                                org.telegram.ui.wn wnVar = elVar.H;
                                wnVar.n5 = null;
                                wnVar.l5 = null;
                                wnVar.f5.updateReply(null, null, wnVar.T5, null);
                                wnVar.j8();
                                break;
                            } else {
                                org.telegram.ui.el elVar2 = (org.telegram.ui.el) fc0Var4;
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
                            zb0 zb0Var7 = this.b;
                            MessagePreviewParams messagePreviewParams8 = zb0Var7.c0.d;
                            if (messagePreviewParams8.hasMedia) {
                                boolean z14 = !messagePreviewParams8.webpageSmall;
                                messagePreviewParams8.webpageSmall = z14;
                                zb0Var7.G.a(z14, true);
                                zb0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                if (zb0Var7.r.messages.size() > 0 && (message2 = zb0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                    boolean z15 = messagePreviewParams8.webpageSmall;
                                    messageMedia2.force_small_media = z15;
                                    messageMedia2.force_large_media = !z15;
                                }
                                if (zb0Var7.r.previewMessages.size() > 0 && (message = zb0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                    boolean z16 = messagePreviewParams8.webpageSmall;
                                    messageMedia.force_small_media = z16;
                                    messageMedia.force_large_media = !z16;
                                }
                                zb0Var7.h();
                                zb0Var7.U = true;
                                break;
                            }
                            break;
                        default:
                            zb0 zb0Var8 = this.b;
                            MessagePreviewParams messagePreviewParams9 = zb0Var8.c0.d;
                            boolean z17 = messagePreviewParams9.webpageTop;
                            messagePreviewParams9.webpageTop = !z17;
                            zb0Var8.E.a(z17, true);
                            if (zb0Var8.r.messages.size() > 0 && (message4 = zb0Var8.r.messages.get(0).messageOwner) != null) {
                                message4.invert_media = messagePreviewParams9.webpageTop;
                            }
                            if (zb0Var8.r.previewMessages.size() > 0 && (message3 = zb0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                message3.invert_media = messagePreviewParams9.webpageTop;
                            }
                            zb0Var8.h();
                            zb0Var8.U = true;
                            break;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var10, w7.y5.n(-1, 48));
            ?? e1Var11 = new org.telegram.ui.ActionBar.e1(1, context, fc0Var.F, false, true);
            e1Var11.g(LocaleController.getString(z12 ? R.string.DoNotQuote : R.string.DoNotReply), R.drawable.msg_delete, r11);
            int v04 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.q7, bc0Var);
            int i29 = org.telegram.ui.ActionBar.h6.p7;
            e1Var11.c(v04, org.telegram.ui.ActionBar.h6.v0(i29, bc0Var));
            e1Var11.setSelectorColor(org.telegram.ui.ActionBar.h6.l1(0.12f, org.telegram.ui.ActionBar.h6.w0(r11, i29, false)));
            final int i30 = 6;
            e1Var11.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.jb0
                public final /* synthetic */ zb0 b;

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
                            zb0 zb0Var42 = this.b;
                            zb0Var42.c0.d.quote = null;
                            zb0Var42.e.f(false);
                            zb0Var42.g(false, false);
                            zb0Var42.s.getSwipeBack().b(true);
                            break;
                        case 1:
                            zb0 zb0Var5 = this.b;
                            rb0 rb0Var2 = zb0Var5.e;
                            fc0 fc0Var2 = zb0Var5.c0;
                            if (zb0Var5.c(null) != null) {
                                if (rb0Var2.v - rb0Var2.u <= MessagesController.getInstance(fc0Var2.w).quoteLengthMax) {
                                    org.telegram.ui.Cells.y9 y9Var = rb0Var2.W;
                                    MessageObject c11 = zb0Var5.c(y9Var != null ? ((org.telegram.ui.Cells.u1) y9Var).getMessageObject() : null);
                                    MessagePreviewParams messagePreviewParams5 = fc0Var2.d;
                                    int i172 = rb0Var2.u;
                                    messagePreviewParams5.quoteStart = i172;
                                    int i182 = rb0Var2.v;
                                    messagePreviewParams5.quoteEnd = i182;
                                    messagePreviewParams5.quote = org.telegram.ui.mn.b(i172, i182, c11);
                                    fc0Var2.b();
                                    fc0Var2.a(true);
                                    break;
                                } else {
                                    zb0Var5.f();
                                    break;
                                }
                            }
                            break;
                        case 2:
                            zb0 zb0Var6 = this.b;
                            rb0 rb0Var3 = zb0Var6.e;
                            fc0 fc0Var3 = zb0Var6.c0;
                            MessagePreviewParams messagePreviewParams6 = fc0Var3.d;
                            int i192 = fc0Var3.w;
                            boolean z132 = fc0Var3.b;
                            if (messagePreviewParams6.quote != null && !z132) {
                                messagePreviewParams6.quote = null;
                                rb0Var3.f(false);
                                zb0Var6.g(false, true);
                                zb0Var6.k(true);
                                break;
                            } else if (rb0Var3.v - rb0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                MessageObject c12 = zb0Var6.c(null);
                                if (c12 != null) {
                                    if (!rb0Var3.y()) {
                                        messagePreviewParams6.quoteStart = 0;
                                        int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                        messagePreviewParams6.quoteEnd = min;
                                        messagePreviewParams6.quote = org.telegram.ui.mn.b(messagePreviewParams6.quoteStart, min, c12);
                                        View d10 = zb0Var6.d();
                                        if (d10 instanceof org.telegram.ui.Cells.u1) {
                                            rb0Var3.a0((org.telegram.ui.Cells.u1) d10, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                        }
                                        if (!z132) {
                                            zb0Var6.s.getSwipeBack().e(zb0Var6.I);
                                        }
                                        zb0Var6.g(true, true);
                                        break;
                                    } else {
                                        messagePreviewParams6.quoteStart = rb0Var3.u;
                                        messagePreviewParams6.quoteEnd = rb0Var3.v;
                                        org.telegram.ui.Cells.y9 y9Var2 = rb0Var3.W;
                                        messagePreviewParams6.quote = org.telegram.ui.mn.b(messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd, zb0Var6.c(y9Var2 != null ? ((org.telegram.ui.Cells.u1) y9Var2).getMessageObject() : null));
                                        fc0Var3.b();
                                        fc0Var3.a(true);
                                        break;
                                    }
                                }
                            } else {
                                zb0Var6.f();
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
                            fc0 fc0Var4 = this.b.c0;
                            if (!fc0Var4.b) {
                                org.telegram.ui.el elVar = (org.telegram.ui.el) fc0Var4;
                                elVar.a(true);
                                org.telegram.ui.wn wnVar = elVar.H;
                                wnVar.n5 = null;
                                wnVar.l5 = null;
                                wnVar.f5.updateReply(null, null, wnVar.T5, null);
                                wnVar.j8();
                                break;
                            } else {
                                org.telegram.ui.el elVar2 = (org.telegram.ui.el) fc0Var4;
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
                            zb0 zb0Var7 = this.b;
                            MessagePreviewParams messagePreviewParams8 = zb0Var7.c0.d;
                            if (messagePreviewParams8.hasMedia) {
                                boolean z14 = !messagePreviewParams8.webpageSmall;
                                messagePreviewParams8.webpageSmall = z14;
                                zb0Var7.G.a(z14, true);
                                zb0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                if (zb0Var7.r.messages.size() > 0 && (message2 = zb0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                    boolean z15 = messagePreviewParams8.webpageSmall;
                                    messageMedia2.force_small_media = z15;
                                    messageMedia2.force_large_media = !z15;
                                }
                                if (zb0Var7.r.previewMessages.size() > 0 && (message = zb0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                    boolean z16 = messagePreviewParams8.webpageSmall;
                                    messageMedia.force_small_media = z16;
                                    messageMedia.force_large_media = !z16;
                                }
                                zb0Var7.h();
                                zb0Var7.U = true;
                                break;
                            }
                            break;
                        default:
                            zb0 zb0Var8 = this.b;
                            MessagePreviewParams messagePreviewParams9 = zb0Var8.c0.d;
                            boolean z17 = messagePreviewParams9.webpageTop;
                            messagePreviewParams9.webpageTop = !z17;
                            zb0Var8.E.a(z17, true);
                            if (zb0Var8.r.messages.size() > 0 && (message4 = zb0Var8.r.messages.get(0).messageOwner) != null) {
                                message4.invert_media = messagePreviewParams9.webpageTop;
                            }
                            if (zb0Var8.r.previewMessages.size() > 0 && (message3 = zb0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                message3.invert_media = messagePreviewParams9.webpageTop;
                            }
                            zb0Var8.h();
                            zb0Var8.U = true;
                            break;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var11, w7.y5.n(-1, 48));
            context2 = context;
            zb0Var2 = this;
            viewOutlineProvider = r11;
        }
        int i31 = zb0Var2.a;
        if (i31 == 1) {
            zb0Var2.r = messagePreviewParams.forwardMessages;
        } else if (i31 == 0) {
            zb0Var2.r = messagePreviewParams.replyMessage;
        } else if (i31 == 2) {
            zb0Var2.r = messagePreviewParams.linkMessage;
        }
        org.telegram.ui.Cells.ca o9 = zb0Var2.e.o(context2);
        zb0Var2.d = o9;
        o9.setElevation(AndroidUtilities.dp(8.0f));
        o9.setOutlineProvider(viewOutlineProvider);
        if (o9.getParent() instanceof ViewGroup) {
            ((ViewGroup) o9.getParent()).removeView(o9);
        }
        zb0Var2.addView(o9, w7.y5.d(-1, -1.0f, 51, 0.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / AndroidUtilities.density, 0.0f, 0.0f));
        zb0Var2.e.T(zb0Var2.f);
    }

    public static MessageObject.GroupedMessages a(zb0 zb0Var, MessageObject messageObject) {
        if (messageObject.getGroupId() == 0) {
            return null;
        }
        MessageObject.GroupedMessages groupedMessages = zb0Var.r.groupedMessagesMap.get(messageObject.getGroupId());
        if (groupedMessages == null || (groupedMessages.messages.size() > 1 && groupedMessages.getPosition(messageObject) != null)) {
            return groupedMessages;
        }
        return null;
    }

    public static void b(zb0 zb0Var, org.telegram.ui.Cells.u1 u1Var) {
        CharacterStyle characterStyle;
        TLRPC.WebPage webPage;
        if (zb0Var.a == 2) {
            MessagePreviewParams messagePreviewParams = zb0Var.c0.d;
            if (!messagePreviewParams.singleLink && (characterStyle = messagePreviewParams.currentLink) != null && (webPage = messagePreviewParams.webpage) != null && !(webPage instanceof TLRPC.TL_webPagePending)) {
                u1Var.Q3(characterStyle);
                return;
            }
        }
        u1Var.Q3(null);
    }

    public final MessageObject c(MessageObject messageObject) {
        MessageObject.GroupedMessages valueAt;
        fc0 fc0Var = this.c0;
        MessagePreviewParams.Messages messages = fc0Var.d.replyMessage;
        if (messages == null) {
            return null;
        }
        LongSparseArray<MessageObject.GroupedMessages> longSparseArray = messages.groupedMessagesMap;
        if (longSparseArray == null || longSparseArray.size() <= 0 || (valueAt = fc0Var.d.replyMessage.groupedMessagesMap.valueAt(0)) == null) {
            return fc0Var.d.replyMessage.messages.get(0);
        }
        if (valueAt.isDocuments) {
            if (messageObject != null) {
                return messageObject;
            }
            org.telegram.ui.mn mnVar = fc0Var.d.quote;
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
                sb0 sb0Var = this.f;
                if (i10 >= sb0Var.getChildCount()) {
                    break;
                }
                View childAt = sb0Var.getChildAt(i10);
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
        fc0 fc0Var = this.c0;
        new yc(fc0Var, fc0Var.F).M(LocaleController.getString(R.string.QuoteMaxError), LocaleController.getString(R.string.QuoteMaxErrorMessage), R.raw.error).j();
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
        qb0 qb0Var = this.w;
        qb0 qb0Var2 = this.v;
        if (!z11) {
            if (qb0Var2 != null) {
                qb0Var2.setAlpha(!z10 ? 1.0f : 0.0f);
                qb0Var2.setVisibility(!z10 ? 0 : 4);
            }
            if (qb0Var != null) {
                qb0Var.setAlpha(z10 ? 1.0f : 0.0f);
                qb0Var.setVisibility(z10 ? 0 : 4);
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
        if (qb0Var2 != null) {
            qb0Var2.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(qb0Var2, (Property<qb0, Float>) property, !z10 ? 1.0f : 0.0f));
        }
        if (qb0Var != null) {
            qb0Var.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(qb0Var, (Property<qb0, Float>) property, z10 ? 1.0f : 0.0f));
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
        this.P.setInterpolator(rr.h);
        this.P.addListener(new ca(15, this, z10));
        this.P.start();
    }

    public final void h() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        fc0 fc0Var = this.c0;
        MessagePreviewParams messagePreviewParams = fc0Var.d;
        ub0 ub0Var = this.h;
        if (ub0Var.k()) {
            this.V = true;
            return;
        }
        for (int i10 = 0; i10 < this.r.previewMessages.size(); i10++) {
            MessageObject messageObject = this.r.previewMessages.get(i10);
            messageObject.forceUpdate = true;
            messageObject.sendAsPeer = fc0Var.a;
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
            ub0Var.V(this.r.groupedMessagesMap.valueAt(i12));
        }
        this.n.q(0, this.r.previewMessages.size());
    }

    public final void i() {
        int i10 = this.R;
        float f7 = this.S;
        fc0 fc0Var = this.c0;
        boolean z10 = fc0Var.v;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        sb0 sb0Var = this.f;
        if (z10) {
            this.S = 0.0f;
            this.R = 0;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(AndroidUtilities.dp(8.0f) + sb0Var.getMeasuredWidth());
        } else {
            int measuredHeight = sb0Var.getMeasuredHeight();
            int i11 = 0;
            for (int i12 = 0; i12 < sb0Var.getChildCount(); i12++) {
                View childAt = sb0Var.getChildAt(i12);
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
                this.R = Math.min(((sb0Var.getMeasuredHeight() - this.R) + b10) - ((int) ((((AndroidUtilities.displaySize.y - (Build.VERSION.SDK_INT >= 35 ? AndroidUtilities.navigationBarHeight : 0)) * 0.8f) - this.W) - AndroidUtilities.dp(8.0f))), this.R);
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
        ValueAnimator valueAnimator = fc0Var.h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        fc0Var.h = ofFloat;
        ofFloat.addUpdateListener(new bk(this, i10, f7, 1));
        fc0Var.h.setDuration(250L);
        fc0Var.h.setInterpolator(ji.n.V);
        fc0Var.h.addListener(new r8(this, 29));
        AndroidUtilities.runOnUIThread(fc0Var.y, 50L);
        this.T = i10;
        e(f7, i10);
    }

    public final void j() {
        MessageObject messageObject;
        fc0 fc0Var = this.c0;
        MessagePreviewParams messagePreviewParams = fc0Var.d;
        if (this.a == 0) {
            rb0 rb0Var = this.e;
            if (rb0Var.v - rb0Var.u > MessagesController.getInstance(fc0Var.w).quoteLengthMax) {
                return;
            }
            org.telegram.ui.Cells.y9 y9Var = rb0Var.W;
            MessageObject c10 = c(y9Var != null ? ((org.telegram.ui.Cells.u1) y9Var).getMessageObject() : null);
            if (messagePreviewParams.quote != null && rb0Var.y()) {
                messagePreviewParams.quoteStart = rb0Var.u;
                messagePreviewParams.quoteEnd = rb0Var.v;
                if (c10 != null && ((messageObject = messagePreviewParams.quote.a) == null || messageObject.getId() != c10.getId())) {
                    messagePreviewParams.quote = org.telegram.ui.mn.b(messagePreviewParams.quoteStart, messagePreviewParams.quoteEnd, c10);
                    fc0Var.b();
                }
            }
            rb0Var.f(false);
        }
    }

    public final void k(boolean z10) {
        fc0 fc0Var = this.c0;
        TLRPC.User user = fc0Var.n;
        MessagePreviewParams messagePreviewParams = fc0Var.d;
        TLRPC.Chat chat = fc0Var.r;
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
        fc0 fc0Var = this.c0;
        fc0Var.v = z10;
        this.W = 0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(i10, makeMeasureSpec);
        int i12 = this.W;
        int measuredHeight = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
        Rect rect = this.Q;
        this.W = Math.max(i12, measuredHeight + rect.top + rect.bottom);
        ((ViewGroup.MarginLayoutParams) this.f.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        boolean z11 = fc0Var.v;
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
                messageObject.parentWidth = fc0Var.v ? w8Var.getLayoutParams().width : View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(16.0f);
                messageObject.resetLayout();
                messageObject.forceUpdate = true;
                yb0 yb0Var = this.n;
                if (yb0Var != null) {
                    yb0Var.l();
                }
            }
            this.K = true;
        }
        this.a0 = size;
        super.onMeasure(i10, i11);
    }
}
