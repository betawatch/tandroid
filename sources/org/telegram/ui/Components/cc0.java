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

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class cc0 extends FrameLayout {
    public final hc0 E;
    public final FrameLayout F;
    public final hc0 G;
    public final hc0 H;
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
    public final org.telegram.ui.y8 b;
    public boolean b0;
    public final ci.m6 c;
    public final /* synthetic */ ic0 c0;
    public final org.telegram.ui.Cells.ca d;
    public final tb0 e;
    public final ub0 f;
    public final wb0 h;
    public final bc0 n;
    public MessagePreviewParams.Messages r;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout s;
    public final sb0 v;
    public final sb0 w;
    public final org.telegram.ui.ActionBar.f1 x;
    public final org.telegram.ui.ActionBar.f1 y;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [android.graphics.drawable.Drawable, boolean[]] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r13v9, types: [android.view.View, org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout] */
    /* JADX WARN: Type inference failed for: r2v66, types: [android.view.View, org.telegram.ui.ActionBar.f1] */
    /* JADX WARN: Type inference failed for: r2v67, types: [android.view.View, org.telegram.ui.ActionBar.f1] */
    /* JADX WARN: Type inference failed for: r2v73, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r2v74, types: [android.view.View, org.telegram.ui.ActionBar.f1] */
    /* JADX WARN: Type inference failed for: r2v75, types: [android.view.View, org.telegram.ui.ActionBar.f1] */
    /* JADX WARN: Type inference failed for: r33v0, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout, java.lang.Object, org.telegram.ui.Components.cc0] */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.view.View, android.view.ViewGroup, org.telegram.ui.Components.mw0, org.telegram.ui.y8] */
    /* JADX WARN: Type inference failed for: r3v6, types: [ah.c] */
    /* JADX WARN: Type inference failed for: r9v8, types: [android.view.ViewGroup] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public cc0(ic0 ic0Var, Context context, int i10) {
        super(r4);
        MessagePreviewParams messagePreviewParams;
        Context context2;
        cc0 cc0Var;
        boolean z10;
        hc0 hc0Var;
        hc0 hc0Var2;
        ViewOutlineProvider viewOutlineProvider;
        cc0 cc0Var2;
        MessagePreviewParams.Messages messages;
        ?? r11;
        MessagePreviewParams messagePreviewParams2;
        LinearLayout linearLayout;
        Drawable drawable;
        MessagePreviewParams messagePreviewParams3;
        boolean z11;
        Context context3 = context;
        this.c0 = ic0Var;
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
        setOnTouchListener(new yr(this, 4));
        ?? y8Var = new org.telegram.ui.y8(this, context3, i11);
        this.b = y8Var;
        ec0 ec0Var = ic0Var.F;
        boolean z12 = ic0Var.b;
        MessagePreviewParams messagePreviewParams4 = ic0Var.d;
        Drawable d = ((org.telegram.ui.wn) ec0Var).d();
        if (((org.telegram.ui.wn) ec0Var).f == null) {
            int i13 = org.telegram.ui.ActionBar.i6.a;
        }
        y8Var.V(d);
        y8Var.setOccupyStatusBar(false);
        int i14 = 3;
        y8Var.setOutlineProvider(new ch.b(this, i14));
        y8Var.setClipToOutline(true);
        y8Var.setElevation(AndroidUtilities.dp(4.0f));
        ci.m6 m6Var = new ci.m6(context3, 11, ec0Var);
        this.c = m6Var;
        m6Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.s8, ec0Var));
        tb0 tb0Var = new tb0(this);
        this.e = tb0Var;
        tb0Var.D = new ai.s3(this, i14);
        ub0 ub0Var = new ub0(this, context3, ec0Var);
        this.f = ub0Var;
        wb0 wb0Var = new wb0(this, ub0Var, ec0Var);
        this.h = wb0Var;
        ub0Var.setItemAnimator(wb0Var);
        ub0Var.setOnScrollListener(new xb0(this, i12));
        ub0Var.setOnItemClickListener(new yb0(this));
        bc0 bc0Var = new bc0(this);
        this.n = bc0Var;
        ub0Var.setAdapter(bc0Var);
        ub0Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        pb0 pb0Var = new pb0(this);
        pb0Var.O = new qb0(this);
        ub0Var.setClipToPadding(false);
        ub0Var.setLayoutManager(pb0Var);
        ub0Var.i(new rb0());
        y8Var.addView(ub0Var);
        addView(y8Var, w7.z5.d(-1, 400.0f, 0, 8.0f, 0.0f, 8.0f, 0.0f));
        y8Var.addView(m6Var, w7.z5.c(-2.0f, -1));
        ?? actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert2, 1, getContext(), ec0Var);
        this.s = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().setOnForegroundOpenFinished(new nb0(this, i11));
        ch.d c10 = ic0Var.G.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, false);
        c10.w(eh.b.k(ec0Var));
        c10.x(AndroidUtilities.dp(8.0f));
        c10.l.e = true;
        c10.y(AndroidUtilities.dp(12.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c10);
        addView(actionBarPopupWindow$ActionBarPopupWindowLayout, w7.z5.c(-2.0f, -2));
        if (i10 != 0 || (messages = messagePreviewParams4.replyMessage) == null) {
            messagePreviewParams = messagePreviewParams4;
            if (i10 != 1 || messagePreviewParams.forwardMessages == null) {
                final cc0 cc0Var3 = this;
                cc0Var = cc0Var3;
                if (i10 == 2) {
                    cc0Var = cc0Var3;
                    if (messagePreviewParams.linkMessage != null) {
                        hc0 hc0Var3 = new hc0(context, R.raw.position_below, LocaleController.getString(R.string.LinkAbove), R.raw.position_above, LocaleController.getString(R.string.LinkBelow), ic0Var.F);
                        cc0Var3.E = hc0Var3;
                        hc0Var3.a(!messagePreviewParams.webpageTop, false);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(hc0Var3, w7.z5.n(-1, 48));
                        FrameLayout frameLayout = new FrameLayout(context);
                        cc0Var3.F = frameLayout;
                        frameLayout.setBackground(org.telegram.ui.ActionBar.i6.Y(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.I5, ec0Var), 0, 0));
                        hc0 hc0Var4 = new hc0(context, R.raw.media_shrink, LocaleController.getString(R.string.LinkMediaLarger), R.raw.media_enlarge, LocaleController.getString(R.string.LinkMediaSmaller), ic0Var.F);
                        cc0Var3.G = hc0Var4;
                        hc0Var4.setBackground(null);
                        hc0Var4.setVisibility(messagePreviewParams.isVideo ? 4 : 0);
                        frameLayout.addView(hc0Var4, w7.z5.n(-1, 48));
                        hc0 hc0Var5 = new hc0(context, R.raw.media_shrink, LocaleController.getString(R.string.LinkVideoLarger), R.raw.media_enlarge, LocaleController.getString(R.string.LinkVideoSmaller), ic0Var.F);
                        cc0Var3.H = hc0Var5;
                        hc0Var5.setBackground(null);
                        hc0Var5.setVisibility(!messagePreviewParams.isVideo ? 4 : 0);
                        frameLayout.setAlpha(messagePreviewParams.hasMedia ? 1.0f : 0.5f);
                        frameLayout.addView(hc0Var5, w7.z5.n(-1, 48));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, w7.z5.n(-1, 48));
                        frameLayout.setVisibility((!messagePreviewParams.singleLink || messagePreviewParams.hasMedia) ? 0 : 8);
                        hc0Var4.a(messagePreviewParams.webpageSmall, false);
                        hc0Var5.a(messagePreviewParams.webpageSmall, false);
                        org.telegram.ui.ActionBar.k1 k1Var = new org.telegram.ui.ActionBar.k1(context, ec0Var);
                        k1Var.setColor(org.telegram.ui.ActionBar.i6.l1(0.06f, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.E8, ec0Var)));
                        k1Var.setTag(R.id.fit_width_tag, 1);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(k1Var, w7.z5.n(-1, 8));
                        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(1, context, ic0Var.F, false, false);
                        f1Var.g(LocaleController.getString(R.string.ApplyChanges), R.drawable.msg_select, null);
                        final int i15 = 10;
                        f1Var.setOnClickListener(new View.OnClickListener(cc0Var3) { // from class: org.telegram.ui.Components.lb0
                            public final /* synthetic */ cc0 b;

                            {
                                this.b = cc0Var3;
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
                                        cc0 cc0Var4 = this.b;
                                        cc0Var4.c0.d.quote = null;
                                        cc0Var4.e.f(false);
                                        cc0Var4.g(false, false);
                                        cc0Var4.s.getSwipeBack().b(true);
                                        break;
                                    case 1:
                                        cc0 cc0Var5 = this.b;
                                        tb0 tb0Var2 = cc0Var5.e;
                                        ic0 ic0Var2 = cc0Var5.c0;
                                        if (cc0Var5.c(null) != null) {
                                            if (tb0Var2.v - tb0Var2.u <= MessagesController.getInstance(ic0Var2.w).quoteLengthMax) {
                                                org.telegram.ui.Cells.y9 y9Var = tb0Var2.W;
                                                MessageObject c11 = cc0Var5.c(y9Var != null ? ((org.telegram.ui.Cells.u1) y9Var).getMessageObject() : null);
                                                MessagePreviewParams messagePreviewParams5 = ic0Var2.d;
                                                int i17 = tb0Var2.u;
                                                messagePreviewParams5.quoteStart = i17;
                                                int i18 = tb0Var2.v;
                                                messagePreviewParams5.quoteEnd = i18;
                                                messagePreviewParams5.quote = org.telegram.ui.on.b(i17, i18, c11);
                                                ic0Var2.b();
                                                ic0Var2.a(true);
                                                break;
                                            } else {
                                                cc0Var5.f();
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        cc0 cc0Var6 = this.b;
                                        tb0 tb0Var3 = cc0Var6.e;
                                        ic0 ic0Var3 = cc0Var6.c0;
                                        MessagePreviewParams messagePreviewParams6 = ic0Var3.d;
                                        int i19 = ic0Var3.w;
                                        boolean z13 = ic0Var3.b;
                                        if (messagePreviewParams6.quote != null && !z13) {
                                            messagePreviewParams6.quote = null;
                                            tb0Var3.f(false);
                                            cc0Var6.g(false, true);
                                            cc0Var6.k(true);
                                            break;
                                        } else if (tb0Var3.v - tb0Var3.u <= MessagesController.getInstance(i19).quoteLengthMax) {
                                            MessageObject c12 = cc0Var6.c(null);
                                            if (c12 != null) {
                                                if (!tb0Var3.y()) {
                                                    messagePreviewParams6.quoteStart = 0;
                                                    int min = Math.min(MessagesController.getInstance(i19).quoteLengthMax, c12.messageOwner.message.length());
                                                    messagePreviewParams6.quoteEnd = min;
                                                    messagePreviewParams6.quote = org.telegram.ui.on.b(messagePreviewParams6.quoteStart, min, c12);
                                                    View d10 = cc0Var6.d();
                                                    if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                        tb0Var3.a0((org.telegram.ui.Cells.u1) d10, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                                    }
                                                    if (!z13) {
                                                        cc0Var6.s.getSwipeBack().e(cc0Var6.I);
                                                    }
                                                    cc0Var6.g(true, true);
                                                    break;
                                                } else {
                                                    messagePreviewParams6.quoteStart = tb0Var3.u;
                                                    messagePreviewParams6.quoteEnd = tb0Var3.v;
                                                    org.telegram.ui.Cells.y9 y9Var2 = tb0Var3.W;
                                                    messagePreviewParams6.quote = org.telegram.ui.on.b(messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd, cc0Var6.c(y9Var2 != null ? ((org.telegram.ui.Cells.u1) y9Var2).getMessageObject() : null));
                                                    ic0Var3.b();
                                                    ic0Var3.a(true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            cc0Var6.f();
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
                                        ic0 ic0Var4 = this.b.c0;
                                        if (!ic0Var4.b) {
                                            org.telegram.ui.el elVar = (org.telegram.ui.el) ic0Var4;
                                            elVar.a(true);
                                            org.telegram.ui.yn ynVar = elVar.H;
                                            ynVar.l5 = null;
                                            ynVar.j5 = null;
                                            ynVar.d5.updateReply(null, null, ynVar.R5, null);
                                            ynVar.j8();
                                            break;
                                        } else {
                                            org.telegram.ui.el elVar2 = (org.telegram.ui.el) ic0Var4;
                                            elVar2.a(true);
                                            org.telegram.ui.yn ynVar2 = elVar2.H;
                                            ynVar2.j5 = null;
                                            ynVar2.Ab(ynVar2.l5);
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
                                        org.telegram.ui.yn ynVar3 = elVar3.H;
                                        ynVar3.d5.updateForward(null, ynVar3.R5);
                                        ynVar3.j8();
                                        break;
                                    case 10:
                                        this.b.c0.a(true);
                                        break;
                                    case 11:
                                        org.telegram.ui.el elVar4 = (org.telegram.ui.el) this.b.c0;
                                        elVar4.a(true);
                                        org.telegram.ui.yn ynVar4 = elVar4.H;
                                        ynVar4.E5 = null;
                                        org.telegram.ui.jk jkVar = ynVar4.W;
                                        if (jkVar != null) {
                                            jkVar.X2 = null;
                                            jkVar.Y2 = false;
                                        }
                                        MessagePreviewParams messagePreviewParams7 = ynVar4.d5;
                                        if (messagePreviewParams7 != null) {
                                            i16 = ((org.telegram.ui.ActionBar.n2) ynVar4).currentAccount;
                                            MessageObject messageObject = ynVar4.l5;
                                            messagePreviewParams7.updateLink(i16, null, null, messageObject == ynVar4.V3 ? null : messageObject, ynVar4.j5, ynVar4.n5);
                                        }
                                        ynVar4.j8();
                                        break;
                                    case 12:
                                        cc0 cc0Var7 = this.b;
                                        MessagePreviewParams messagePreviewParams8 = cc0Var7.c0.d;
                                        if (messagePreviewParams8.hasMedia) {
                                            boolean z14 = !messagePreviewParams8.webpageSmall;
                                            messagePreviewParams8.webpageSmall = z14;
                                            cc0Var7.G.a(z14, true);
                                            cc0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                            if (cc0Var7.r.messages.size() > 0 && (message2 = cc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                                boolean z15 = messagePreviewParams8.webpageSmall;
                                                messageMedia2.force_small_media = z15;
                                                messageMedia2.force_large_media = !z15;
                                            }
                                            if (cc0Var7.r.previewMessages.size() > 0 && (message = cc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                                boolean z16 = messagePreviewParams8.webpageSmall;
                                                messageMedia.force_small_media = z16;
                                                messageMedia.force_large_media = !z16;
                                            }
                                            cc0Var7.h();
                                            cc0Var7.U = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        cc0 cc0Var8 = this.b;
                                        MessagePreviewParams messagePreviewParams9 = cc0Var8.c0.d;
                                        boolean z17 = messagePreviewParams9.webpageTop;
                                        messagePreviewParams9.webpageTop = !z17;
                                        cc0Var8.E.a(z17, true);
                                        if (cc0Var8.r.messages.size() > 0 && (message4 = cc0Var8.r.messages.get(0).messageOwner) != null) {
                                            message4.invert_media = messagePreviewParams9.webpageTop;
                                        }
                                        if (cc0Var8.r.previewMessages.size() > 0 && (message3 = cc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                            message3.invert_media = messagePreviewParams9.webpageTop;
                                        }
                                        cc0Var8.h();
                                        cc0Var8.U = true;
                                        break;
                                }
                            }
                        });
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(f1Var, w7.z5.n(-1, 48));
                        org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(1, context, ic0Var.F, false, true);
                        context2 = context;
                        f1Var2.g(LocaleController.getString(R.string.DoNotLinkPreview), R.drawable.msg_delete, null);
                        int v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.q7, ec0Var);
                        int i16 = org.telegram.ui.ActionBar.i6.p7;
                        f1Var2.c(v02, org.telegram.ui.ActionBar.i6.v0(i16, ec0Var));
                        final int i17 = 11;
                        f1Var2.setOnClickListener(new View.OnClickListener(cc0Var3) { // from class: org.telegram.ui.Components.lb0
                            public final /* synthetic */ cc0 b;

                            {
                                this.b = cc0Var3;
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
                                        cc0 cc0Var4 = this.b;
                                        cc0Var4.c0.d.quote = null;
                                        cc0Var4.e.f(false);
                                        cc0Var4.g(false, false);
                                        cc0Var4.s.getSwipeBack().b(true);
                                        break;
                                    case 1:
                                        cc0 cc0Var5 = this.b;
                                        tb0 tb0Var2 = cc0Var5.e;
                                        ic0 ic0Var2 = cc0Var5.c0;
                                        if (cc0Var5.c(null) != null) {
                                            if (tb0Var2.v - tb0Var2.u <= MessagesController.getInstance(ic0Var2.w).quoteLengthMax) {
                                                org.telegram.ui.Cells.y9 y9Var = tb0Var2.W;
                                                MessageObject c11 = cc0Var5.c(y9Var != null ? ((org.telegram.ui.Cells.u1) y9Var).getMessageObject() : null);
                                                MessagePreviewParams messagePreviewParams5 = ic0Var2.d;
                                                int i172 = tb0Var2.u;
                                                messagePreviewParams5.quoteStart = i172;
                                                int i18 = tb0Var2.v;
                                                messagePreviewParams5.quoteEnd = i18;
                                                messagePreviewParams5.quote = org.telegram.ui.on.b(i172, i18, c11);
                                                ic0Var2.b();
                                                ic0Var2.a(true);
                                                break;
                                            } else {
                                                cc0Var5.f();
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        cc0 cc0Var6 = this.b;
                                        tb0 tb0Var3 = cc0Var6.e;
                                        ic0 ic0Var3 = cc0Var6.c0;
                                        MessagePreviewParams messagePreviewParams6 = ic0Var3.d;
                                        int i19 = ic0Var3.w;
                                        boolean z13 = ic0Var3.b;
                                        if (messagePreviewParams6.quote != null && !z13) {
                                            messagePreviewParams6.quote = null;
                                            tb0Var3.f(false);
                                            cc0Var6.g(false, true);
                                            cc0Var6.k(true);
                                            break;
                                        } else if (tb0Var3.v - tb0Var3.u <= MessagesController.getInstance(i19).quoteLengthMax) {
                                            MessageObject c12 = cc0Var6.c(null);
                                            if (c12 != null) {
                                                if (!tb0Var3.y()) {
                                                    messagePreviewParams6.quoteStart = 0;
                                                    int min = Math.min(MessagesController.getInstance(i19).quoteLengthMax, c12.messageOwner.message.length());
                                                    messagePreviewParams6.quoteEnd = min;
                                                    messagePreviewParams6.quote = org.telegram.ui.on.b(messagePreviewParams6.quoteStart, min, c12);
                                                    View d10 = cc0Var6.d();
                                                    if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                        tb0Var3.a0((org.telegram.ui.Cells.u1) d10, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                                    }
                                                    if (!z13) {
                                                        cc0Var6.s.getSwipeBack().e(cc0Var6.I);
                                                    }
                                                    cc0Var6.g(true, true);
                                                    break;
                                                } else {
                                                    messagePreviewParams6.quoteStart = tb0Var3.u;
                                                    messagePreviewParams6.quoteEnd = tb0Var3.v;
                                                    org.telegram.ui.Cells.y9 y9Var2 = tb0Var3.W;
                                                    messagePreviewParams6.quote = org.telegram.ui.on.b(messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd, cc0Var6.c(y9Var2 != null ? ((org.telegram.ui.Cells.u1) y9Var2).getMessageObject() : null));
                                                    ic0Var3.b();
                                                    ic0Var3.a(true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            cc0Var6.f();
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
                                        ic0 ic0Var4 = this.b.c0;
                                        if (!ic0Var4.b) {
                                            org.telegram.ui.el elVar = (org.telegram.ui.el) ic0Var4;
                                            elVar.a(true);
                                            org.telegram.ui.yn ynVar = elVar.H;
                                            ynVar.l5 = null;
                                            ynVar.j5 = null;
                                            ynVar.d5.updateReply(null, null, ynVar.R5, null);
                                            ynVar.j8();
                                            break;
                                        } else {
                                            org.telegram.ui.el elVar2 = (org.telegram.ui.el) ic0Var4;
                                            elVar2.a(true);
                                            org.telegram.ui.yn ynVar2 = elVar2.H;
                                            ynVar2.j5 = null;
                                            ynVar2.Ab(ynVar2.l5);
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
                                        org.telegram.ui.yn ynVar3 = elVar3.H;
                                        ynVar3.d5.updateForward(null, ynVar3.R5);
                                        ynVar3.j8();
                                        break;
                                    case 10:
                                        this.b.c0.a(true);
                                        break;
                                    case 11:
                                        org.telegram.ui.el elVar4 = (org.telegram.ui.el) this.b.c0;
                                        elVar4.a(true);
                                        org.telegram.ui.yn ynVar4 = elVar4.H;
                                        ynVar4.E5 = null;
                                        org.telegram.ui.jk jkVar = ynVar4.W;
                                        if (jkVar != null) {
                                            jkVar.X2 = null;
                                            jkVar.Y2 = false;
                                        }
                                        MessagePreviewParams messagePreviewParams7 = ynVar4.d5;
                                        if (messagePreviewParams7 != null) {
                                            i162 = ((org.telegram.ui.ActionBar.n2) ynVar4).currentAccount;
                                            MessageObject messageObject = ynVar4.l5;
                                            messagePreviewParams7.updateLink(i162, null, null, messageObject == ynVar4.V3 ? null : messageObject, ynVar4.j5, ynVar4.n5);
                                        }
                                        ynVar4.j8();
                                        break;
                                    case 12:
                                        cc0 cc0Var7 = this.b;
                                        MessagePreviewParams messagePreviewParams8 = cc0Var7.c0.d;
                                        if (messagePreviewParams8.hasMedia) {
                                            boolean z14 = !messagePreviewParams8.webpageSmall;
                                            messagePreviewParams8.webpageSmall = z14;
                                            cc0Var7.G.a(z14, true);
                                            cc0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                            if (cc0Var7.r.messages.size() > 0 && (message2 = cc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                                boolean z15 = messagePreviewParams8.webpageSmall;
                                                messageMedia2.force_small_media = z15;
                                                messageMedia2.force_large_media = !z15;
                                            }
                                            if (cc0Var7.r.previewMessages.size() > 0 && (message = cc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                                boolean z16 = messagePreviewParams8.webpageSmall;
                                                messageMedia.force_small_media = z16;
                                                messageMedia.force_large_media = !z16;
                                            }
                                            cc0Var7.h();
                                            cc0Var7.U = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        cc0 cc0Var8 = this.b;
                                        MessagePreviewParams messagePreviewParams9 = cc0Var8.c0.d;
                                        boolean z17 = messagePreviewParams9.webpageTop;
                                        messagePreviewParams9.webpageTop = !z17;
                                        cc0Var8.E.a(z17, true);
                                        if (cc0Var8.r.messages.size() > 0 && (message4 = cc0Var8.r.messages.get(0).messageOwner) != null) {
                                            message4.invert_media = messagePreviewParams9.webpageTop;
                                        }
                                        if (cc0Var8.r.previewMessages.size() > 0 && (message3 = cc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                            message3.invert_media = messagePreviewParams9.webpageTop;
                                        }
                                        cc0Var8.h();
                                        cc0Var8.U = true;
                                        break;
                                }
                            }
                        });
                        f1Var2.setSelectorColor(org.telegram.ui.ActionBar.i6.l1(0.12f, org.telegram.ui.ActionBar.i6.w0(null, i16, false)));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(f1Var2, w7.z5.n(-1, 48));
                        final int i18 = 12;
                        frameLayout.setOnClickListener(new View.OnClickListener(cc0Var3) { // from class: org.telegram.ui.Components.lb0
                            public final /* synthetic */ cc0 b;

                            {
                                this.b = cc0Var3;
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
                                        cc0 cc0Var4 = this.b;
                                        cc0Var4.c0.d.quote = null;
                                        cc0Var4.e.f(false);
                                        cc0Var4.g(false, false);
                                        cc0Var4.s.getSwipeBack().b(true);
                                        break;
                                    case 1:
                                        cc0 cc0Var5 = this.b;
                                        tb0 tb0Var2 = cc0Var5.e;
                                        ic0 ic0Var2 = cc0Var5.c0;
                                        if (cc0Var5.c(null) != null) {
                                            if (tb0Var2.v - tb0Var2.u <= MessagesController.getInstance(ic0Var2.w).quoteLengthMax) {
                                                org.telegram.ui.Cells.y9 y9Var = tb0Var2.W;
                                                MessageObject c11 = cc0Var5.c(y9Var != null ? ((org.telegram.ui.Cells.u1) y9Var).getMessageObject() : null);
                                                MessagePreviewParams messagePreviewParams5 = ic0Var2.d;
                                                int i172 = tb0Var2.u;
                                                messagePreviewParams5.quoteStart = i172;
                                                int i182 = tb0Var2.v;
                                                messagePreviewParams5.quoteEnd = i182;
                                                messagePreviewParams5.quote = org.telegram.ui.on.b(i172, i182, c11);
                                                ic0Var2.b();
                                                ic0Var2.a(true);
                                                break;
                                            } else {
                                                cc0Var5.f();
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        cc0 cc0Var6 = this.b;
                                        tb0 tb0Var3 = cc0Var6.e;
                                        ic0 ic0Var3 = cc0Var6.c0;
                                        MessagePreviewParams messagePreviewParams6 = ic0Var3.d;
                                        int i19 = ic0Var3.w;
                                        boolean z13 = ic0Var3.b;
                                        if (messagePreviewParams6.quote != null && !z13) {
                                            messagePreviewParams6.quote = null;
                                            tb0Var3.f(false);
                                            cc0Var6.g(false, true);
                                            cc0Var6.k(true);
                                            break;
                                        } else if (tb0Var3.v - tb0Var3.u <= MessagesController.getInstance(i19).quoteLengthMax) {
                                            MessageObject c12 = cc0Var6.c(null);
                                            if (c12 != null) {
                                                if (!tb0Var3.y()) {
                                                    messagePreviewParams6.quoteStart = 0;
                                                    int min = Math.min(MessagesController.getInstance(i19).quoteLengthMax, c12.messageOwner.message.length());
                                                    messagePreviewParams6.quoteEnd = min;
                                                    messagePreviewParams6.quote = org.telegram.ui.on.b(messagePreviewParams6.quoteStart, min, c12);
                                                    View d10 = cc0Var6.d();
                                                    if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                        tb0Var3.a0((org.telegram.ui.Cells.u1) d10, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                                    }
                                                    if (!z13) {
                                                        cc0Var6.s.getSwipeBack().e(cc0Var6.I);
                                                    }
                                                    cc0Var6.g(true, true);
                                                    break;
                                                } else {
                                                    messagePreviewParams6.quoteStart = tb0Var3.u;
                                                    messagePreviewParams6.quoteEnd = tb0Var3.v;
                                                    org.telegram.ui.Cells.y9 y9Var2 = tb0Var3.W;
                                                    messagePreviewParams6.quote = org.telegram.ui.on.b(messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd, cc0Var6.c(y9Var2 != null ? ((org.telegram.ui.Cells.u1) y9Var2).getMessageObject() : null));
                                                    ic0Var3.b();
                                                    ic0Var3.a(true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            cc0Var6.f();
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
                                        ic0 ic0Var4 = this.b.c0;
                                        if (!ic0Var4.b) {
                                            org.telegram.ui.el elVar = (org.telegram.ui.el) ic0Var4;
                                            elVar.a(true);
                                            org.telegram.ui.yn ynVar = elVar.H;
                                            ynVar.l5 = null;
                                            ynVar.j5 = null;
                                            ynVar.d5.updateReply(null, null, ynVar.R5, null);
                                            ynVar.j8();
                                            break;
                                        } else {
                                            org.telegram.ui.el elVar2 = (org.telegram.ui.el) ic0Var4;
                                            elVar2.a(true);
                                            org.telegram.ui.yn ynVar2 = elVar2.H;
                                            ynVar2.j5 = null;
                                            ynVar2.Ab(ynVar2.l5);
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
                                        org.telegram.ui.yn ynVar3 = elVar3.H;
                                        ynVar3.d5.updateForward(null, ynVar3.R5);
                                        ynVar3.j8();
                                        break;
                                    case 10:
                                        this.b.c0.a(true);
                                        break;
                                    case 11:
                                        org.telegram.ui.el elVar4 = (org.telegram.ui.el) this.b.c0;
                                        elVar4.a(true);
                                        org.telegram.ui.yn ynVar4 = elVar4.H;
                                        ynVar4.E5 = null;
                                        org.telegram.ui.jk jkVar = ynVar4.W;
                                        if (jkVar != null) {
                                            jkVar.X2 = null;
                                            jkVar.Y2 = false;
                                        }
                                        MessagePreviewParams messagePreviewParams7 = ynVar4.d5;
                                        if (messagePreviewParams7 != null) {
                                            i162 = ((org.telegram.ui.ActionBar.n2) ynVar4).currentAccount;
                                            MessageObject messageObject = ynVar4.l5;
                                            messagePreviewParams7.updateLink(i162, null, null, messageObject == ynVar4.V3 ? null : messageObject, ynVar4.j5, ynVar4.n5);
                                        }
                                        ynVar4.j8();
                                        break;
                                    case 12:
                                        cc0 cc0Var7 = this.b;
                                        MessagePreviewParams messagePreviewParams8 = cc0Var7.c0.d;
                                        if (messagePreviewParams8.hasMedia) {
                                            boolean z14 = !messagePreviewParams8.webpageSmall;
                                            messagePreviewParams8.webpageSmall = z14;
                                            cc0Var7.G.a(z14, true);
                                            cc0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                            if (cc0Var7.r.messages.size() > 0 && (message2 = cc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                                boolean z15 = messagePreviewParams8.webpageSmall;
                                                messageMedia2.force_small_media = z15;
                                                messageMedia2.force_large_media = !z15;
                                            }
                                            if (cc0Var7.r.previewMessages.size() > 0 && (message = cc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                                boolean z16 = messagePreviewParams8.webpageSmall;
                                                messageMedia.force_small_media = z16;
                                                messageMedia.force_large_media = !z16;
                                            }
                                            cc0Var7.h();
                                            cc0Var7.U = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        cc0 cc0Var8 = this.b;
                                        MessagePreviewParams messagePreviewParams9 = cc0Var8.c0.d;
                                        boolean z17 = messagePreviewParams9.webpageTop;
                                        messagePreviewParams9.webpageTop = !z17;
                                        cc0Var8.E.a(z17, true);
                                        if (cc0Var8.r.messages.size() > 0 && (message4 = cc0Var8.r.messages.get(0).messageOwner) != null) {
                                            message4.invert_media = messagePreviewParams9.webpageTop;
                                        }
                                        if (cc0Var8.r.previewMessages.size() > 0 && (message3 = cc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                            message3.invert_media = messagePreviewParams9.webpageTop;
                                        }
                                        cc0Var8.h();
                                        cc0Var8.U = true;
                                        break;
                                }
                            }
                        });
                        final int i19 = 13;
                        hc0Var3.setOnClickListener(new View.OnClickListener(cc0Var3) { // from class: org.telegram.ui.Components.lb0
                            public final /* synthetic */ cc0 b;

                            {
                                this.b = cc0Var3;
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
                                        cc0 cc0Var4 = this.b;
                                        cc0Var4.c0.d.quote = null;
                                        cc0Var4.e.f(false);
                                        cc0Var4.g(false, false);
                                        cc0Var4.s.getSwipeBack().b(true);
                                        break;
                                    case 1:
                                        cc0 cc0Var5 = this.b;
                                        tb0 tb0Var2 = cc0Var5.e;
                                        ic0 ic0Var2 = cc0Var5.c0;
                                        if (cc0Var5.c(null) != null) {
                                            if (tb0Var2.v - tb0Var2.u <= MessagesController.getInstance(ic0Var2.w).quoteLengthMax) {
                                                org.telegram.ui.Cells.y9 y9Var = tb0Var2.W;
                                                MessageObject c11 = cc0Var5.c(y9Var != null ? ((org.telegram.ui.Cells.u1) y9Var).getMessageObject() : null);
                                                MessagePreviewParams messagePreviewParams5 = ic0Var2.d;
                                                int i172 = tb0Var2.u;
                                                messagePreviewParams5.quoteStart = i172;
                                                int i182 = tb0Var2.v;
                                                messagePreviewParams5.quoteEnd = i182;
                                                messagePreviewParams5.quote = org.telegram.ui.on.b(i172, i182, c11);
                                                ic0Var2.b();
                                                ic0Var2.a(true);
                                                break;
                                            } else {
                                                cc0Var5.f();
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        cc0 cc0Var6 = this.b;
                                        tb0 tb0Var3 = cc0Var6.e;
                                        ic0 ic0Var3 = cc0Var6.c0;
                                        MessagePreviewParams messagePreviewParams6 = ic0Var3.d;
                                        int i192 = ic0Var3.w;
                                        boolean z13 = ic0Var3.b;
                                        if (messagePreviewParams6.quote != null && !z13) {
                                            messagePreviewParams6.quote = null;
                                            tb0Var3.f(false);
                                            cc0Var6.g(false, true);
                                            cc0Var6.k(true);
                                            break;
                                        } else if (tb0Var3.v - tb0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                            MessageObject c12 = cc0Var6.c(null);
                                            if (c12 != null) {
                                                if (!tb0Var3.y()) {
                                                    messagePreviewParams6.quoteStart = 0;
                                                    int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                                    messagePreviewParams6.quoteEnd = min;
                                                    messagePreviewParams6.quote = org.telegram.ui.on.b(messagePreviewParams6.quoteStart, min, c12);
                                                    View d10 = cc0Var6.d();
                                                    if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                        tb0Var3.a0((org.telegram.ui.Cells.u1) d10, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                                    }
                                                    if (!z13) {
                                                        cc0Var6.s.getSwipeBack().e(cc0Var6.I);
                                                    }
                                                    cc0Var6.g(true, true);
                                                    break;
                                                } else {
                                                    messagePreviewParams6.quoteStart = tb0Var3.u;
                                                    messagePreviewParams6.quoteEnd = tb0Var3.v;
                                                    org.telegram.ui.Cells.y9 y9Var2 = tb0Var3.W;
                                                    messagePreviewParams6.quote = org.telegram.ui.on.b(messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd, cc0Var6.c(y9Var2 != null ? ((org.telegram.ui.Cells.u1) y9Var2).getMessageObject() : null));
                                                    ic0Var3.b();
                                                    ic0Var3.a(true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            cc0Var6.f();
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
                                        ic0 ic0Var4 = this.b.c0;
                                        if (!ic0Var4.b) {
                                            org.telegram.ui.el elVar = (org.telegram.ui.el) ic0Var4;
                                            elVar.a(true);
                                            org.telegram.ui.yn ynVar = elVar.H;
                                            ynVar.l5 = null;
                                            ynVar.j5 = null;
                                            ynVar.d5.updateReply(null, null, ynVar.R5, null);
                                            ynVar.j8();
                                            break;
                                        } else {
                                            org.telegram.ui.el elVar2 = (org.telegram.ui.el) ic0Var4;
                                            elVar2.a(true);
                                            org.telegram.ui.yn ynVar2 = elVar2.H;
                                            ynVar2.j5 = null;
                                            ynVar2.Ab(ynVar2.l5);
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
                                        org.telegram.ui.yn ynVar3 = elVar3.H;
                                        ynVar3.d5.updateForward(null, ynVar3.R5);
                                        ynVar3.j8();
                                        break;
                                    case 10:
                                        this.b.c0.a(true);
                                        break;
                                    case 11:
                                        org.telegram.ui.el elVar4 = (org.telegram.ui.el) this.b.c0;
                                        elVar4.a(true);
                                        org.telegram.ui.yn ynVar4 = elVar4.H;
                                        ynVar4.E5 = null;
                                        org.telegram.ui.jk jkVar = ynVar4.W;
                                        if (jkVar != null) {
                                            jkVar.X2 = null;
                                            jkVar.Y2 = false;
                                        }
                                        MessagePreviewParams messagePreviewParams7 = ynVar4.d5;
                                        if (messagePreviewParams7 != null) {
                                            i162 = ((org.telegram.ui.ActionBar.n2) ynVar4).currentAccount;
                                            MessageObject messageObject = ynVar4.l5;
                                            messagePreviewParams7.updateLink(i162, null, null, messageObject == ynVar4.V3 ? null : messageObject, ynVar4.j5, ynVar4.n5);
                                        }
                                        ynVar4.j8();
                                        break;
                                    case 12:
                                        cc0 cc0Var7 = this.b;
                                        MessagePreviewParams messagePreviewParams8 = cc0Var7.c0.d;
                                        if (messagePreviewParams8.hasMedia) {
                                            boolean z14 = !messagePreviewParams8.webpageSmall;
                                            messagePreviewParams8.webpageSmall = z14;
                                            cc0Var7.G.a(z14, true);
                                            cc0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                            if (cc0Var7.r.messages.size() > 0 && (message2 = cc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                                boolean z15 = messagePreviewParams8.webpageSmall;
                                                messageMedia2.force_small_media = z15;
                                                messageMedia2.force_large_media = !z15;
                                            }
                                            if (cc0Var7.r.previewMessages.size() > 0 && (message = cc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                                boolean z16 = messagePreviewParams8.webpageSmall;
                                                messageMedia.force_small_media = z16;
                                                messageMedia.force_large_media = !z16;
                                            }
                                            cc0Var7.h();
                                            cc0Var7.U = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        cc0 cc0Var8 = this.b;
                                        MessagePreviewParams messagePreviewParams9 = cc0Var8.c0.d;
                                        boolean z17 = messagePreviewParams9.webpageTop;
                                        messagePreviewParams9.webpageTop = !z17;
                                        cc0Var8.E.a(z17, true);
                                        if (cc0Var8.r.messages.size() > 0 && (message4 = cc0Var8.r.messages.get(0).messageOwner) != null) {
                                            message4.invert_media = messagePreviewParams9.webpageTop;
                                        }
                                        if (cc0Var8.r.previewMessages.size() > 0 && (message3 = cc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                            message3.invert_media = messagePreviewParams9.webpageTop;
                                        }
                                        cc0Var8.h();
                                        cc0Var8.U = true;
                                        break;
                                }
                            }
                        });
                        cc0Var2 = cc0Var3;
                        viewOutlineProvider = null;
                    }
                }
            } else {
                if (!UserConfig.getInstance(ic0Var.w).isPremium()) {
                    for (int i20 = 0; i20 < messagePreviewParams.forwardMessages.messages.size(); i20++) {
                        if (messagePreviewParams.forwardMessages.messages.get(i20).type == 36) {
                            z10 = false;
                            break;
                        }
                    }
                }
                z10 = true;
                hc0 hc0Var6 = new hc0(context, R.raw.name_hide, LocaleController.getString(messagePreviewParams.multipleUsers ? R.string.ShowSenderNames : R.string.ShowSendersName), R.raw.name_show, LocaleController.getString(messagePreviewParams.multipleUsers ? R.string.HideSenderNames : R.string.HideSendersName), ic0Var.F);
                this.s.a(hc0Var6, w7.z5.n(-1, 48));
                if (messagePreviewParams.hasCaption) {
                    hc0Var = hc0Var6;
                    hc0 hc0Var7 = new hc0(context, R.raw.caption_hide, LocaleController.getString(R.string.ShowCaption), R.raw.caption_show, LocaleController.getString(R.string.HideCaption), ic0Var.F);
                    hc0Var7.a(messagePreviewParams.hideCaption, false);
                    this.s.a(hc0Var7, w7.z5.n(-1, 48));
                    hc0Var2 = hc0Var7;
                } else {
                    hc0Var = hc0Var6;
                    hc0Var2 = null;
                }
                org.telegram.ui.ActionBar.f1 f1Var3 = new org.telegram.ui.ActionBar.f1(0, context, ic0Var.F, true, false);
                final int i21 = 7;
                f1Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.lb0
                    public final /* synthetic */ cc0 b;

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
                                cc0 cc0Var4 = this.b;
                                cc0Var4.c0.d.quote = null;
                                cc0Var4.e.f(false);
                                cc0Var4.g(false, false);
                                cc0Var4.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                cc0 cc0Var5 = this.b;
                                tb0 tb0Var2 = cc0Var5.e;
                                ic0 ic0Var2 = cc0Var5.c0;
                                if (cc0Var5.c(null) != null) {
                                    if (tb0Var2.v - tb0Var2.u <= MessagesController.getInstance(ic0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.y9 y9Var = tb0Var2.W;
                                        MessageObject c11 = cc0Var5.c(y9Var != null ? ((org.telegram.ui.Cells.u1) y9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams5 = ic0Var2.d;
                                        int i172 = tb0Var2.u;
                                        messagePreviewParams5.quoteStart = i172;
                                        int i182 = tb0Var2.v;
                                        messagePreviewParams5.quoteEnd = i182;
                                        messagePreviewParams5.quote = org.telegram.ui.on.b(i172, i182, c11);
                                        ic0Var2.b();
                                        ic0Var2.a(true);
                                        break;
                                    } else {
                                        cc0Var5.f();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                cc0 cc0Var6 = this.b;
                                tb0 tb0Var3 = cc0Var6.e;
                                ic0 ic0Var3 = cc0Var6.c0;
                                MessagePreviewParams messagePreviewParams6 = ic0Var3.d;
                                int i192 = ic0Var3.w;
                                boolean z13 = ic0Var3.b;
                                if (messagePreviewParams6.quote != null && !z13) {
                                    messagePreviewParams6.quote = null;
                                    tb0Var3.f(false);
                                    cc0Var6.g(false, true);
                                    cc0Var6.k(true);
                                    break;
                                } else if (tb0Var3.v - tb0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                    MessageObject c12 = cc0Var6.c(null);
                                    if (c12 != null) {
                                        if (!tb0Var3.y()) {
                                            messagePreviewParams6.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                            messagePreviewParams6.quoteEnd = min;
                                            messagePreviewParams6.quote = org.telegram.ui.on.b(messagePreviewParams6.quoteStart, min, c12);
                                            View d10 = cc0Var6.d();
                                            if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                tb0Var3.a0((org.telegram.ui.Cells.u1) d10, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                            }
                                            if (!z13) {
                                                cc0Var6.s.getSwipeBack().e(cc0Var6.I);
                                            }
                                            cc0Var6.g(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams6.quoteStart = tb0Var3.u;
                                            messagePreviewParams6.quoteEnd = tb0Var3.v;
                                            org.telegram.ui.Cells.y9 y9Var2 = tb0Var3.W;
                                            messagePreviewParams6.quote = org.telegram.ui.on.b(messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd, cc0Var6.c(y9Var2 != null ? ((org.telegram.ui.Cells.u1) y9Var2).getMessageObject() : null));
                                            ic0Var3.b();
                                            ic0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    cc0Var6.f();
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
                                ic0 ic0Var4 = this.b.c0;
                                if (!ic0Var4.b) {
                                    org.telegram.ui.el elVar = (org.telegram.ui.el) ic0Var4;
                                    elVar.a(true);
                                    org.telegram.ui.yn ynVar = elVar.H;
                                    ynVar.l5 = null;
                                    ynVar.j5 = null;
                                    ynVar.d5.updateReply(null, null, ynVar.R5, null);
                                    ynVar.j8();
                                    break;
                                } else {
                                    org.telegram.ui.el elVar2 = (org.telegram.ui.el) ic0Var4;
                                    elVar2.a(true);
                                    org.telegram.ui.yn ynVar2 = elVar2.H;
                                    ynVar2.j5 = null;
                                    ynVar2.Ab(ynVar2.l5);
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
                                org.telegram.ui.yn ynVar3 = elVar3.H;
                                ynVar3.d5.updateForward(null, ynVar3.R5);
                                ynVar3.j8();
                                break;
                            case 10:
                                this.b.c0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.el elVar4 = (org.telegram.ui.el) this.b.c0;
                                elVar4.a(true);
                                org.telegram.ui.yn ynVar4 = elVar4.H;
                                ynVar4.E5 = null;
                                org.telegram.ui.jk jkVar = ynVar4.W;
                                if (jkVar != null) {
                                    jkVar.X2 = null;
                                    jkVar.Y2 = false;
                                }
                                MessagePreviewParams messagePreviewParams7 = ynVar4.d5;
                                if (messagePreviewParams7 != null) {
                                    i162 = ((org.telegram.ui.ActionBar.n2) ynVar4).currentAccount;
                                    MessageObject messageObject = ynVar4.l5;
                                    messagePreviewParams7.updateLink(i162, null, null, messageObject == ynVar4.V3 ? null : messageObject, ynVar4.j5, ynVar4.n5);
                                }
                                ynVar4.j8();
                                break;
                            case 12:
                                cc0 cc0Var7 = this.b;
                                MessagePreviewParams messagePreviewParams8 = cc0Var7.c0.d;
                                if (messagePreviewParams8.hasMedia) {
                                    boolean z14 = !messagePreviewParams8.webpageSmall;
                                    messagePreviewParams8.webpageSmall = z14;
                                    cc0Var7.G.a(z14, true);
                                    cc0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                    if (cc0Var7.r.messages.size() > 0 && (message2 = cc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z15 = messagePreviewParams8.webpageSmall;
                                        messageMedia2.force_small_media = z15;
                                        messageMedia2.force_large_media = !z15;
                                    }
                                    if (cc0Var7.r.previewMessages.size() > 0 && (message = cc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z16 = messagePreviewParams8.webpageSmall;
                                        messageMedia.force_small_media = z16;
                                        messageMedia.force_large_media = !z16;
                                    }
                                    cc0Var7.h();
                                    cc0Var7.U = true;
                                    break;
                                }
                                break;
                            default:
                                cc0 cc0Var8 = this.b;
                                MessagePreviewParams messagePreviewParams9 = cc0Var8.c0.d;
                                boolean z17 = messagePreviewParams9.webpageTop;
                                messagePreviewParams9.webpageTop = !z17;
                                cc0Var8.E.a(z17, true);
                                if (cc0Var8.r.messages.size() > 0 && (message4 = cc0Var8.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams9.webpageTop;
                                }
                                if (cc0Var8.r.previewMessages.size() > 0 && (message3 = cc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams9.webpageTop;
                                }
                                cc0Var8.h();
                                cc0Var8.U = true;
                                break;
                        }
                    }
                });
                f1Var3.g(LocaleController.getString(R.string.ChangeRecipient), R.drawable.msg_forward_replace, null);
                this.s.a(f1Var3, w7.z5.n(-1, 48));
                org.telegram.ui.ActionBar.k1 k1Var2 = new org.telegram.ui.ActionBar.k1(context, ec0Var);
                k1Var2.setColor(org.telegram.ui.ActionBar.i6.l1(0.06f, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.E8, ec0Var)));
                k1Var2.setTag(R.id.fit_width_tag, 1);
                this.s.a(k1Var2, w7.z5.n(-1, 8));
                org.telegram.ui.ActionBar.f1 f1Var4 = new org.telegram.ui.ActionBar.f1(1, context, ic0Var.F, false, false);
                f1Var4.g(LocaleController.getString(R.string.ApplyChanges), R.drawable.msg_select, null);
                final int i22 = 8;
                f1Var4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.lb0
                    public final /* synthetic */ cc0 b;

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
                                cc0 cc0Var4 = this.b;
                                cc0Var4.c0.d.quote = null;
                                cc0Var4.e.f(false);
                                cc0Var4.g(false, false);
                                cc0Var4.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                cc0 cc0Var5 = this.b;
                                tb0 tb0Var2 = cc0Var5.e;
                                ic0 ic0Var2 = cc0Var5.c0;
                                if (cc0Var5.c(null) != null) {
                                    if (tb0Var2.v - tb0Var2.u <= MessagesController.getInstance(ic0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.y9 y9Var = tb0Var2.W;
                                        MessageObject c11 = cc0Var5.c(y9Var != null ? ((org.telegram.ui.Cells.u1) y9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams5 = ic0Var2.d;
                                        int i172 = tb0Var2.u;
                                        messagePreviewParams5.quoteStart = i172;
                                        int i182 = tb0Var2.v;
                                        messagePreviewParams5.quoteEnd = i182;
                                        messagePreviewParams5.quote = org.telegram.ui.on.b(i172, i182, c11);
                                        ic0Var2.b();
                                        ic0Var2.a(true);
                                        break;
                                    } else {
                                        cc0Var5.f();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                cc0 cc0Var6 = this.b;
                                tb0 tb0Var3 = cc0Var6.e;
                                ic0 ic0Var3 = cc0Var6.c0;
                                MessagePreviewParams messagePreviewParams6 = ic0Var3.d;
                                int i192 = ic0Var3.w;
                                boolean z13 = ic0Var3.b;
                                if (messagePreviewParams6.quote != null && !z13) {
                                    messagePreviewParams6.quote = null;
                                    tb0Var3.f(false);
                                    cc0Var6.g(false, true);
                                    cc0Var6.k(true);
                                    break;
                                } else if (tb0Var3.v - tb0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                    MessageObject c12 = cc0Var6.c(null);
                                    if (c12 != null) {
                                        if (!tb0Var3.y()) {
                                            messagePreviewParams6.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                            messagePreviewParams6.quoteEnd = min;
                                            messagePreviewParams6.quote = org.telegram.ui.on.b(messagePreviewParams6.quoteStart, min, c12);
                                            View d10 = cc0Var6.d();
                                            if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                tb0Var3.a0((org.telegram.ui.Cells.u1) d10, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                            }
                                            if (!z13) {
                                                cc0Var6.s.getSwipeBack().e(cc0Var6.I);
                                            }
                                            cc0Var6.g(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams6.quoteStart = tb0Var3.u;
                                            messagePreviewParams6.quoteEnd = tb0Var3.v;
                                            org.telegram.ui.Cells.y9 y9Var2 = tb0Var3.W;
                                            messagePreviewParams6.quote = org.telegram.ui.on.b(messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd, cc0Var6.c(y9Var2 != null ? ((org.telegram.ui.Cells.u1) y9Var2).getMessageObject() : null));
                                            ic0Var3.b();
                                            ic0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    cc0Var6.f();
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
                                ic0 ic0Var4 = this.b.c0;
                                if (!ic0Var4.b) {
                                    org.telegram.ui.el elVar = (org.telegram.ui.el) ic0Var4;
                                    elVar.a(true);
                                    org.telegram.ui.yn ynVar = elVar.H;
                                    ynVar.l5 = null;
                                    ynVar.j5 = null;
                                    ynVar.d5.updateReply(null, null, ynVar.R5, null);
                                    ynVar.j8();
                                    break;
                                } else {
                                    org.telegram.ui.el elVar2 = (org.telegram.ui.el) ic0Var4;
                                    elVar2.a(true);
                                    org.telegram.ui.yn ynVar2 = elVar2.H;
                                    ynVar2.j5 = null;
                                    ynVar2.Ab(ynVar2.l5);
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
                                org.telegram.ui.yn ynVar3 = elVar3.H;
                                ynVar3.d5.updateForward(null, ynVar3.R5);
                                ynVar3.j8();
                                break;
                            case 10:
                                this.b.c0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.el elVar4 = (org.telegram.ui.el) this.b.c0;
                                elVar4.a(true);
                                org.telegram.ui.yn ynVar4 = elVar4.H;
                                ynVar4.E5 = null;
                                org.telegram.ui.jk jkVar = ynVar4.W;
                                if (jkVar != null) {
                                    jkVar.X2 = null;
                                    jkVar.Y2 = false;
                                }
                                MessagePreviewParams messagePreviewParams7 = ynVar4.d5;
                                if (messagePreviewParams7 != null) {
                                    i162 = ((org.telegram.ui.ActionBar.n2) ynVar4).currentAccount;
                                    MessageObject messageObject = ynVar4.l5;
                                    messagePreviewParams7.updateLink(i162, null, null, messageObject == ynVar4.V3 ? null : messageObject, ynVar4.j5, ynVar4.n5);
                                }
                                ynVar4.j8();
                                break;
                            case 12:
                                cc0 cc0Var7 = this.b;
                                MessagePreviewParams messagePreviewParams8 = cc0Var7.c0.d;
                                if (messagePreviewParams8.hasMedia) {
                                    boolean z14 = !messagePreviewParams8.webpageSmall;
                                    messagePreviewParams8.webpageSmall = z14;
                                    cc0Var7.G.a(z14, true);
                                    cc0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                    if (cc0Var7.r.messages.size() > 0 && (message2 = cc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z15 = messagePreviewParams8.webpageSmall;
                                        messageMedia2.force_small_media = z15;
                                        messageMedia2.force_large_media = !z15;
                                    }
                                    if (cc0Var7.r.previewMessages.size() > 0 && (message = cc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z16 = messagePreviewParams8.webpageSmall;
                                        messageMedia.force_small_media = z16;
                                        messageMedia.force_large_media = !z16;
                                    }
                                    cc0Var7.h();
                                    cc0Var7.U = true;
                                    break;
                                }
                                break;
                            default:
                                cc0 cc0Var8 = this.b;
                                MessagePreviewParams messagePreviewParams9 = cc0Var8.c0.d;
                                boolean z17 = messagePreviewParams9.webpageTop;
                                messagePreviewParams9.webpageTop = !z17;
                                cc0Var8.E.a(z17, true);
                                if (cc0Var8.r.messages.size() > 0 && (message4 = cc0Var8.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams9.webpageTop;
                                }
                                if (cc0Var8.r.previewMessages.size() > 0 && (message3 = cc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams9.webpageTop;
                                }
                                cc0Var8.h();
                                cc0Var8.U = true;
                                break;
                        }
                    }
                });
                this.s.a(f1Var4, w7.z5.n(-1, 48));
                org.telegram.ui.ActionBar.f1 f1Var5 = new org.telegram.ui.ActionBar.f1(1, context, ic0Var.F, false, true);
                f1Var5.g(LocaleController.getString(R.string.DoNotForward), R.drawable.msg_delete, null);
                int v03 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.q7, ec0Var);
                int i23 = org.telegram.ui.ActionBar.i6.p7;
                f1Var5.c(v03, org.telegram.ui.ActionBar.i6.v0(i23, ec0Var));
                final int i24 = 9;
                f1Var5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.lb0
                    public final /* synthetic */ cc0 b;

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
                                cc0 cc0Var4 = this.b;
                                cc0Var4.c0.d.quote = null;
                                cc0Var4.e.f(false);
                                cc0Var4.g(false, false);
                                cc0Var4.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                cc0 cc0Var5 = this.b;
                                tb0 tb0Var2 = cc0Var5.e;
                                ic0 ic0Var2 = cc0Var5.c0;
                                if (cc0Var5.c(null) != null) {
                                    if (tb0Var2.v - tb0Var2.u <= MessagesController.getInstance(ic0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.y9 y9Var = tb0Var2.W;
                                        MessageObject c11 = cc0Var5.c(y9Var != null ? ((org.telegram.ui.Cells.u1) y9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams5 = ic0Var2.d;
                                        int i172 = tb0Var2.u;
                                        messagePreviewParams5.quoteStart = i172;
                                        int i182 = tb0Var2.v;
                                        messagePreviewParams5.quoteEnd = i182;
                                        messagePreviewParams5.quote = org.telegram.ui.on.b(i172, i182, c11);
                                        ic0Var2.b();
                                        ic0Var2.a(true);
                                        break;
                                    } else {
                                        cc0Var5.f();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                cc0 cc0Var6 = this.b;
                                tb0 tb0Var3 = cc0Var6.e;
                                ic0 ic0Var3 = cc0Var6.c0;
                                MessagePreviewParams messagePreviewParams6 = ic0Var3.d;
                                int i192 = ic0Var3.w;
                                boolean z13 = ic0Var3.b;
                                if (messagePreviewParams6.quote != null && !z13) {
                                    messagePreviewParams6.quote = null;
                                    tb0Var3.f(false);
                                    cc0Var6.g(false, true);
                                    cc0Var6.k(true);
                                    break;
                                } else if (tb0Var3.v - tb0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                    MessageObject c12 = cc0Var6.c(null);
                                    if (c12 != null) {
                                        if (!tb0Var3.y()) {
                                            messagePreviewParams6.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                            messagePreviewParams6.quoteEnd = min;
                                            messagePreviewParams6.quote = org.telegram.ui.on.b(messagePreviewParams6.quoteStart, min, c12);
                                            View d10 = cc0Var6.d();
                                            if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                tb0Var3.a0((org.telegram.ui.Cells.u1) d10, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                            }
                                            if (!z13) {
                                                cc0Var6.s.getSwipeBack().e(cc0Var6.I);
                                            }
                                            cc0Var6.g(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams6.quoteStart = tb0Var3.u;
                                            messagePreviewParams6.quoteEnd = tb0Var3.v;
                                            org.telegram.ui.Cells.y9 y9Var2 = tb0Var3.W;
                                            messagePreviewParams6.quote = org.telegram.ui.on.b(messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd, cc0Var6.c(y9Var2 != null ? ((org.telegram.ui.Cells.u1) y9Var2).getMessageObject() : null));
                                            ic0Var3.b();
                                            ic0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    cc0Var6.f();
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
                                ic0 ic0Var4 = this.b.c0;
                                if (!ic0Var4.b) {
                                    org.telegram.ui.el elVar = (org.telegram.ui.el) ic0Var4;
                                    elVar.a(true);
                                    org.telegram.ui.yn ynVar = elVar.H;
                                    ynVar.l5 = null;
                                    ynVar.j5 = null;
                                    ynVar.d5.updateReply(null, null, ynVar.R5, null);
                                    ynVar.j8();
                                    break;
                                } else {
                                    org.telegram.ui.el elVar2 = (org.telegram.ui.el) ic0Var4;
                                    elVar2.a(true);
                                    org.telegram.ui.yn ynVar2 = elVar2.H;
                                    ynVar2.j5 = null;
                                    ynVar2.Ab(ynVar2.l5);
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
                                org.telegram.ui.yn ynVar3 = elVar3.H;
                                ynVar3.d5.updateForward(null, ynVar3.R5);
                                ynVar3.j8();
                                break;
                            case 10:
                                this.b.c0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.el elVar4 = (org.telegram.ui.el) this.b.c0;
                                elVar4.a(true);
                                org.telegram.ui.yn ynVar4 = elVar4.H;
                                ynVar4.E5 = null;
                                org.telegram.ui.jk jkVar = ynVar4.W;
                                if (jkVar != null) {
                                    jkVar.X2 = null;
                                    jkVar.Y2 = false;
                                }
                                MessagePreviewParams messagePreviewParams7 = ynVar4.d5;
                                if (messagePreviewParams7 != null) {
                                    i162 = ((org.telegram.ui.ActionBar.n2) ynVar4).currentAccount;
                                    MessageObject messageObject = ynVar4.l5;
                                    messagePreviewParams7.updateLink(i162, null, null, messageObject == ynVar4.V3 ? null : messageObject, ynVar4.j5, ynVar4.n5);
                                }
                                ynVar4.j8();
                                break;
                            case 12:
                                cc0 cc0Var7 = this.b;
                                MessagePreviewParams messagePreviewParams8 = cc0Var7.c0.d;
                                if (messagePreviewParams8.hasMedia) {
                                    boolean z14 = !messagePreviewParams8.webpageSmall;
                                    messagePreviewParams8.webpageSmall = z14;
                                    cc0Var7.G.a(z14, true);
                                    cc0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                    if (cc0Var7.r.messages.size() > 0 && (message2 = cc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z15 = messagePreviewParams8.webpageSmall;
                                        messageMedia2.force_small_media = z15;
                                        messageMedia2.force_large_media = !z15;
                                    }
                                    if (cc0Var7.r.previewMessages.size() > 0 && (message = cc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z16 = messagePreviewParams8.webpageSmall;
                                        messageMedia.force_small_media = z16;
                                        messageMedia.force_large_media = !z16;
                                    }
                                    cc0Var7.h();
                                    cc0Var7.U = true;
                                    break;
                                }
                                break;
                            default:
                                cc0 cc0Var8 = this.b;
                                MessagePreviewParams messagePreviewParams9 = cc0Var8.c0.d;
                                boolean z17 = messagePreviewParams9.webpageTop;
                                messagePreviewParams9.webpageTop = !z17;
                                cc0Var8.E.a(z17, true);
                                if (cc0Var8.r.messages.size() > 0 && (message4 = cc0Var8.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams9.webpageTop;
                                }
                                if (cc0Var8.r.previewMessages.size() > 0 && (message3 = cc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams9.webpageTop;
                                }
                                cc0Var8.h();
                                cc0Var8.U = true;
                                break;
                        }
                    }
                });
                f1Var5.setSelectorColor(org.telegram.ui.ActionBar.i6.l1(0.12f, org.telegram.ui.ActionBar.i6.w0(null, i23, false)));
                this.s.a(f1Var5, w7.z5.n(-1, 48));
                hc0 hc0Var8 = hc0Var;
                hc0Var8.a(messagePreviewParams.hideForwardSendersName, false);
                hc0 hc0Var9 = hc0Var2;
                cc0 cc0Var4 = this;
                hc0Var8.setOnClickListener(new ob0(this, z10, context, hc0Var9, hc0Var8, 0));
                cc0Var = cc0Var4;
                if (hc0Var9 != null) {
                    hc0Var9.setOnClickListener(new ai.d0(cc0Var4, hc0Var9, hc0Var8, 24));
                    cc0Var = cc0Var4;
                }
            }
            context2 = context;
            cc0Var2 = cc0Var;
            viewOutlineProvider = null;
        } else {
            if (!messages.hasText || messagePreviewParams4.isSecret) {
                r11 = 0;
                messagePreviewParams2 = messagePreviewParams4;
            } else {
                LinearLayout e7 = org.telegram.messenger.bi.e(context3, 1);
                if (z12) {
                    linearLayout = e7;
                    drawable = null;
                    messagePreviewParams3 = messagePreviewParams4;
                    z11 = true;
                } else {
                    messagePreviewParams3 = messagePreviewParams4;
                    ?? r92 = e7;
                    drawable = null;
                    org.telegram.ui.ActionBar.f1 f1Var6 = new org.telegram.ui.ActionBar.f1(0, context3, ic0Var.F, true, false);
                    f1Var6.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                    f1Var6.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.lb0
                        public final /* synthetic */ cc0 b;

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
                                    cc0 cc0Var42 = this.b;
                                    cc0Var42.c0.d.quote = null;
                                    cc0Var42.e.f(false);
                                    cc0Var42.g(false, false);
                                    cc0Var42.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    cc0 cc0Var5 = this.b;
                                    tb0 tb0Var2 = cc0Var5.e;
                                    ic0 ic0Var2 = cc0Var5.c0;
                                    if (cc0Var5.c(null) != null) {
                                        if (tb0Var2.v - tb0Var2.u <= MessagesController.getInstance(ic0Var2.w).quoteLengthMax) {
                                            org.telegram.ui.Cells.y9 y9Var = tb0Var2.W;
                                            MessageObject c11 = cc0Var5.c(y9Var != null ? ((org.telegram.ui.Cells.u1) y9Var).getMessageObject() : null);
                                            MessagePreviewParams messagePreviewParams5 = ic0Var2.d;
                                            int i172 = tb0Var2.u;
                                            messagePreviewParams5.quoteStart = i172;
                                            int i182 = tb0Var2.v;
                                            messagePreviewParams5.quoteEnd = i182;
                                            messagePreviewParams5.quote = org.telegram.ui.on.b(i172, i182, c11);
                                            ic0Var2.b();
                                            ic0Var2.a(true);
                                            break;
                                        } else {
                                            cc0Var5.f();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    cc0 cc0Var6 = this.b;
                                    tb0 tb0Var3 = cc0Var6.e;
                                    ic0 ic0Var3 = cc0Var6.c0;
                                    MessagePreviewParams messagePreviewParams6 = ic0Var3.d;
                                    int i192 = ic0Var3.w;
                                    boolean z13 = ic0Var3.b;
                                    if (messagePreviewParams6.quote != null && !z13) {
                                        messagePreviewParams6.quote = null;
                                        tb0Var3.f(false);
                                        cc0Var6.g(false, true);
                                        cc0Var6.k(true);
                                        break;
                                    } else if (tb0Var3.v - tb0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                        MessageObject c12 = cc0Var6.c(null);
                                        if (c12 != null) {
                                            if (!tb0Var3.y()) {
                                                messagePreviewParams6.quoteStart = 0;
                                                int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                                messagePreviewParams6.quoteEnd = min;
                                                messagePreviewParams6.quote = org.telegram.ui.on.b(messagePreviewParams6.quoteStart, min, c12);
                                                View d10 = cc0Var6.d();
                                                if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                    tb0Var3.a0((org.telegram.ui.Cells.u1) d10, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                                }
                                                if (!z13) {
                                                    cc0Var6.s.getSwipeBack().e(cc0Var6.I);
                                                }
                                                cc0Var6.g(true, true);
                                                break;
                                            } else {
                                                messagePreviewParams6.quoteStart = tb0Var3.u;
                                                messagePreviewParams6.quoteEnd = tb0Var3.v;
                                                org.telegram.ui.Cells.y9 y9Var2 = tb0Var3.W;
                                                messagePreviewParams6.quote = org.telegram.ui.on.b(messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd, cc0Var6.c(y9Var2 != null ? ((org.telegram.ui.Cells.u1) y9Var2).getMessageObject() : null));
                                                ic0Var3.b();
                                                ic0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        cc0Var6.f();
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
                                    ic0 ic0Var4 = this.b.c0;
                                    if (!ic0Var4.b) {
                                        org.telegram.ui.el elVar = (org.telegram.ui.el) ic0Var4;
                                        elVar.a(true);
                                        org.telegram.ui.yn ynVar = elVar.H;
                                        ynVar.l5 = null;
                                        ynVar.j5 = null;
                                        ynVar.d5.updateReply(null, null, ynVar.R5, null);
                                        ynVar.j8();
                                        break;
                                    } else {
                                        org.telegram.ui.el elVar2 = (org.telegram.ui.el) ic0Var4;
                                        elVar2.a(true);
                                        org.telegram.ui.yn ynVar2 = elVar2.H;
                                        ynVar2.j5 = null;
                                        ynVar2.Ab(ynVar2.l5);
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
                                    org.telegram.ui.yn ynVar3 = elVar3.H;
                                    ynVar3.d5.updateForward(null, ynVar3.R5);
                                    ynVar3.j8();
                                    break;
                                case 10:
                                    this.b.c0.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.el elVar4 = (org.telegram.ui.el) this.b.c0;
                                    elVar4.a(true);
                                    org.telegram.ui.yn ynVar4 = elVar4.H;
                                    ynVar4.E5 = null;
                                    org.telegram.ui.jk jkVar = ynVar4.W;
                                    if (jkVar != null) {
                                        jkVar.X2 = null;
                                        jkVar.Y2 = false;
                                    }
                                    MessagePreviewParams messagePreviewParams7 = ynVar4.d5;
                                    if (messagePreviewParams7 != null) {
                                        i162 = ((org.telegram.ui.ActionBar.n2) ynVar4).currentAccount;
                                        MessageObject messageObject = ynVar4.l5;
                                        messagePreviewParams7.updateLink(i162, null, null, messageObject == ynVar4.V3 ? null : messageObject, ynVar4.j5, ynVar4.n5);
                                    }
                                    ynVar4.j8();
                                    break;
                                case 12:
                                    cc0 cc0Var7 = this.b;
                                    MessagePreviewParams messagePreviewParams8 = cc0Var7.c0.d;
                                    if (messagePreviewParams8.hasMedia) {
                                        boolean z14 = !messagePreviewParams8.webpageSmall;
                                        messagePreviewParams8.webpageSmall = z14;
                                        cc0Var7.G.a(z14, true);
                                        cc0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                        if (cc0Var7.r.messages.size() > 0 && (message2 = cc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z15 = messagePreviewParams8.webpageSmall;
                                            messageMedia2.force_small_media = z15;
                                            messageMedia2.force_large_media = !z15;
                                        }
                                        if (cc0Var7.r.previewMessages.size() > 0 && (message = cc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                            boolean z16 = messagePreviewParams8.webpageSmall;
                                            messageMedia.force_small_media = z16;
                                            messageMedia.force_large_media = !z16;
                                        }
                                        cc0Var7.h();
                                        cc0Var7.U = true;
                                        break;
                                    }
                                    break;
                                default:
                                    cc0 cc0Var8 = this.b;
                                    MessagePreviewParams messagePreviewParams9 = cc0Var8.c0.d;
                                    boolean z17 = messagePreviewParams9.webpageTop;
                                    messagePreviewParams9.webpageTop = !z17;
                                    cc0Var8.E.a(z17, true);
                                    if (cc0Var8.r.messages.size() > 0 && (message4 = cc0Var8.r.messages.get(0).messageOwner) != null) {
                                        message4.invert_media = messagePreviewParams9.webpageTop;
                                    }
                                    if (cc0Var8.r.previewMessages.size() > 0 && (message3 = cc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                        message3.invert_media = messagePreviewParams9.webpageTop;
                                    }
                                    cc0Var8.h();
                                    cc0Var8.U = true;
                                    break;
                            }
                        }
                    });
                    r92.addView(f1Var6, w7.z5.n(-1, 48));
                    org.telegram.ui.ActionBar.k1 k1Var3 = new org.telegram.ui.ActionBar.k1(context3, ec0Var);
                    k1Var3.setColor(org.telegram.ui.ActionBar.i6.l1(0.06f, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.E8, ec0Var)));
                    k1Var3.setTag(R.id.fit_width_tag, 1);
                    r92.addView(k1Var3, w7.z5.n(-1, 8));
                    org.telegram.ui.ActionBar.f1 f1Var7 = new org.telegram.ui.ActionBar.f1(0, context3, ic0Var.F, false, true);
                    f1Var7.g(LocaleController.getString(R.string.QuoteSelectedPart), R.drawable.menu_quote_specific, null);
                    z11 = true;
                    final boolean z13 = true ? 1 : 0;
                    f1Var7.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.lb0
                        public final /* synthetic */ cc0 b;

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
                                    cc0 cc0Var42 = this.b;
                                    cc0Var42.c0.d.quote = null;
                                    cc0Var42.e.f(false);
                                    cc0Var42.g(false, false);
                                    cc0Var42.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    cc0 cc0Var5 = this.b;
                                    tb0 tb0Var2 = cc0Var5.e;
                                    ic0 ic0Var2 = cc0Var5.c0;
                                    if (cc0Var5.c(null) != null) {
                                        if (tb0Var2.v - tb0Var2.u <= MessagesController.getInstance(ic0Var2.w).quoteLengthMax) {
                                            org.telegram.ui.Cells.y9 y9Var = tb0Var2.W;
                                            MessageObject c11 = cc0Var5.c(y9Var != null ? ((org.telegram.ui.Cells.u1) y9Var).getMessageObject() : null);
                                            MessagePreviewParams messagePreviewParams5 = ic0Var2.d;
                                            int i172 = tb0Var2.u;
                                            messagePreviewParams5.quoteStart = i172;
                                            int i182 = tb0Var2.v;
                                            messagePreviewParams5.quoteEnd = i182;
                                            messagePreviewParams5.quote = org.telegram.ui.on.b(i172, i182, c11);
                                            ic0Var2.b();
                                            ic0Var2.a(true);
                                            break;
                                        } else {
                                            cc0Var5.f();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    cc0 cc0Var6 = this.b;
                                    tb0 tb0Var3 = cc0Var6.e;
                                    ic0 ic0Var3 = cc0Var6.c0;
                                    MessagePreviewParams messagePreviewParams6 = ic0Var3.d;
                                    int i192 = ic0Var3.w;
                                    boolean z132 = ic0Var3.b;
                                    if (messagePreviewParams6.quote != null && !z132) {
                                        messagePreviewParams6.quote = null;
                                        tb0Var3.f(false);
                                        cc0Var6.g(false, true);
                                        cc0Var6.k(true);
                                        break;
                                    } else if (tb0Var3.v - tb0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                        MessageObject c12 = cc0Var6.c(null);
                                        if (c12 != null) {
                                            if (!tb0Var3.y()) {
                                                messagePreviewParams6.quoteStart = 0;
                                                int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                                messagePreviewParams6.quoteEnd = min;
                                                messagePreviewParams6.quote = org.telegram.ui.on.b(messagePreviewParams6.quoteStart, min, c12);
                                                View d10 = cc0Var6.d();
                                                if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                    tb0Var3.a0((org.telegram.ui.Cells.u1) d10, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                                }
                                                if (!z132) {
                                                    cc0Var6.s.getSwipeBack().e(cc0Var6.I);
                                                }
                                                cc0Var6.g(true, true);
                                                break;
                                            } else {
                                                messagePreviewParams6.quoteStart = tb0Var3.u;
                                                messagePreviewParams6.quoteEnd = tb0Var3.v;
                                                org.telegram.ui.Cells.y9 y9Var2 = tb0Var3.W;
                                                messagePreviewParams6.quote = org.telegram.ui.on.b(messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd, cc0Var6.c(y9Var2 != null ? ((org.telegram.ui.Cells.u1) y9Var2).getMessageObject() : null));
                                                ic0Var3.b();
                                                ic0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        cc0Var6.f();
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
                                    ic0 ic0Var4 = this.b.c0;
                                    if (!ic0Var4.b) {
                                        org.telegram.ui.el elVar = (org.telegram.ui.el) ic0Var4;
                                        elVar.a(true);
                                        org.telegram.ui.yn ynVar = elVar.H;
                                        ynVar.l5 = null;
                                        ynVar.j5 = null;
                                        ynVar.d5.updateReply(null, null, ynVar.R5, null);
                                        ynVar.j8();
                                        break;
                                    } else {
                                        org.telegram.ui.el elVar2 = (org.telegram.ui.el) ic0Var4;
                                        elVar2.a(true);
                                        org.telegram.ui.yn ynVar2 = elVar2.H;
                                        ynVar2.j5 = null;
                                        ynVar2.Ab(ynVar2.l5);
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
                                    org.telegram.ui.yn ynVar3 = elVar3.H;
                                    ynVar3.d5.updateForward(null, ynVar3.R5);
                                    ynVar3.j8();
                                    break;
                                case 10:
                                    this.b.c0.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.el elVar4 = (org.telegram.ui.el) this.b.c0;
                                    elVar4.a(true);
                                    org.telegram.ui.yn ynVar4 = elVar4.H;
                                    ynVar4.E5 = null;
                                    org.telegram.ui.jk jkVar = ynVar4.W;
                                    if (jkVar != null) {
                                        jkVar.X2 = null;
                                        jkVar.Y2 = false;
                                    }
                                    MessagePreviewParams messagePreviewParams7 = ynVar4.d5;
                                    if (messagePreviewParams7 != null) {
                                        i162 = ((org.telegram.ui.ActionBar.n2) ynVar4).currentAccount;
                                        MessageObject messageObject = ynVar4.l5;
                                        messagePreviewParams7.updateLink(i162, null, null, messageObject == ynVar4.V3 ? null : messageObject, ynVar4.j5, ynVar4.n5);
                                    }
                                    ynVar4.j8();
                                    break;
                                case 12:
                                    cc0 cc0Var7 = this.b;
                                    MessagePreviewParams messagePreviewParams8 = cc0Var7.c0.d;
                                    if (messagePreviewParams8.hasMedia) {
                                        boolean z14 = !messagePreviewParams8.webpageSmall;
                                        messagePreviewParams8.webpageSmall = z14;
                                        cc0Var7.G.a(z14, true);
                                        cc0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                        if (cc0Var7.r.messages.size() > 0 && (message2 = cc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z15 = messagePreviewParams8.webpageSmall;
                                            messageMedia2.force_small_media = z15;
                                            messageMedia2.force_large_media = !z15;
                                        }
                                        if (cc0Var7.r.previewMessages.size() > 0 && (message = cc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                            boolean z16 = messagePreviewParams8.webpageSmall;
                                            messageMedia.force_small_media = z16;
                                            messageMedia.force_large_media = !z16;
                                        }
                                        cc0Var7.h();
                                        cc0Var7.U = true;
                                        break;
                                    }
                                    break;
                                default:
                                    cc0 cc0Var8 = this.b;
                                    MessagePreviewParams messagePreviewParams9 = cc0Var8.c0.d;
                                    boolean z17 = messagePreviewParams9.webpageTop;
                                    messagePreviewParams9.webpageTop = !z17;
                                    cc0Var8.E.a(z17, true);
                                    if (cc0Var8.r.messages.size() > 0 && (message4 = cc0Var8.r.messages.get(0).messageOwner) != null) {
                                        message4.invert_media = messagePreviewParams9.webpageTop;
                                    }
                                    if (cc0Var8.r.previewMessages.size() > 0 && (message3 = cc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                        message3.invert_media = messagePreviewParams9.webpageTop;
                                    }
                                    cc0Var8.h();
                                    cc0Var8.U = true;
                                    break;
                            }
                        }
                    });
                    r92.addView(f1Var7, w7.z5.n(-1, 48));
                    linearLayout = r92;
                }
                this.I = actionBarPopupWindow$ActionBarPopupWindowLayout.b(linearLayout);
                actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().setStickToRight(z11);
                FrameLayout frameLayout2 = new FrameLayout(context3);
                messagePreviewParams2 = messagePreviewParams3;
                sb0 sb0Var = new sb0(1, 0, context, ic0Var.F, true, false);
                this.v = sb0Var;
                sb0Var.g(LocaleController.getString(z12 ? R.string.QuoteSelectedPart : R.string.SelectSpecificQuote), R.drawable.menu_select_quote, drawable);
                sb0 sb0Var2 = new sb0(1, 1, context, ic0Var.F, true, false);
                context3 = context;
                this.w = sb0Var2;
                sb0Var2.g(LocaleController.getString(R.string.ClearQuote), R.drawable.menu_quote_delete, drawable);
                frameLayout2.setBackground(org.telegram.ui.ActionBar.i6.Y(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.I5, ec0Var), 6, 0));
                final int i25 = 2;
                frameLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.lb0
                    public final /* synthetic */ cc0 b;

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
                                cc0 cc0Var42 = this.b;
                                cc0Var42.c0.d.quote = null;
                                cc0Var42.e.f(false);
                                cc0Var42.g(false, false);
                                cc0Var42.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                cc0 cc0Var5 = this.b;
                                tb0 tb0Var2 = cc0Var5.e;
                                ic0 ic0Var2 = cc0Var5.c0;
                                if (cc0Var5.c(null) != null) {
                                    if (tb0Var2.v - tb0Var2.u <= MessagesController.getInstance(ic0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.y9 y9Var = tb0Var2.W;
                                        MessageObject c11 = cc0Var5.c(y9Var != null ? ((org.telegram.ui.Cells.u1) y9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams5 = ic0Var2.d;
                                        int i172 = tb0Var2.u;
                                        messagePreviewParams5.quoteStart = i172;
                                        int i182 = tb0Var2.v;
                                        messagePreviewParams5.quoteEnd = i182;
                                        messagePreviewParams5.quote = org.telegram.ui.on.b(i172, i182, c11);
                                        ic0Var2.b();
                                        ic0Var2.a(true);
                                        break;
                                    } else {
                                        cc0Var5.f();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                cc0 cc0Var6 = this.b;
                                tb0 tb0Var3 = cc0Var6.e;
                                ic0 ic0Var3 = cc0Var6.c0;
                                MessagePreviewParams messagePreviewParams6 = ic0Var3.d;
                                int i192 = ic0Var3.w;
                                boolean z132 = ic0Var3.b;
                                if (messagePreviewParams6.quote != null && !z132) {
                                    messagePreviewParams6.quote = null;
                                    tb0Var3.f(false);
                                    cc0Var6.g(false, true);
                                    cc0Var6.k(true);
                                    break;
                                } else if (tb0Var3.v - tb0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                    MessageObject c12 = cc0Var6.c(null);
                                    if (c12 != null) {
                                        if (!tb0Var3.y()) {
                                            messagePreviewParams6.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                            messagePreviewParams6.quoteEnd = min;
                                            messagePreviewParams6.quote = org.telegram.ui.on.b(messagePreviewParams6.quoteStart, min, c12);
                                            View d10 = cc0Var6.d();
                                            if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                tb0Var3.a0((org.telegram.ui.Cells.u1) d10, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                            }
                                            if (!z132) {
                                                cc0Var6.s.getSwipeBack().e(cc0Var6.I);
                                            }
                                            cc0Var6.g(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams6.quoteStart = tb0Var3.u;
                                            messagePreviewParams6.quoteEnd = tb0Var3.v;
                                            org.telegram.ui.Cells.y9 y9Var2 = tb0Var3.W;
                                            messagePreviewParams6.quote = org.telegram.ui.on.b(messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd, cc0Var6.c(y9Var2 != null ? ((org.telegram.ui.Cells.u1) y9Var2).getMessageObject() : null));
                                            ic0Var3.b();
                                            ic0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    cc0Var6.f();
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
                                ic0 ic0Var4 = this.b.c0;
                                if (!ic0Var4.b) {
                                    org.telegram.ui.el elVar = (org.telegram.ui.el) ic0Var4;
                                    elVar.a(true);
                                    org.telegram.ui.yn ynVar = elVar.H;
                                    ynVar.l5 = null;
                                    ynVar.j5 = null;
                                    ynVar.d5.updateReply(null, null, ynVar.R5, null);
                                    ynVar.j8();
                                    break;
                                } else {
                                    org.telegram.ui.el elVar2 = (org.telegram.ui.el) ic0Var4;
                                    elVar2.a(true);
                                    org.telegram.ui.yn ynVar2 = elVar2.H;
                                    ynVar2.j5 = null;
                                    ynVar2.Ab(ynVar2.l5);
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
                                org.telegram.ui.yn ynVar3 = elVar3.H;
                                ynVar3.d5.updateForward(null, ynVar3.R5);
                                ynVar3.j8();
                                break;
                            case 10:
                                this.b.c0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.el elVar4 = (org.telegram.ui.el) this.b.c0;
                                elVar4.a(true);
                                org.telegram.ui.yn ynVar4 = elVar4.H;
                                ynVar4.E5 = null;
                                org.telegram.ui.jk jkVar = ynVar4.W;
                                if (jkVar != null) {
                                    jkVar.X2 = null;
                                    jkVar.Y2 = false;
                                }
                                MessagePreviewParams messagePreviewParams7 = ynVar4.d5;
                                if (messagePreviewParams7 != null) {
                                    i162 = ((org.telegram.ui.ActionBar.n2) ynVar4).currentAccount;
                                    MessageObject messageObject = ynVar4.l5;
                                    messagePreviewParams7.updateLink(i162, null, null, messageObject == ynVar4.V3 ? null : messageObject, ynVar4.j5, ynVar4.n5);
                                }
                                ynVar4.j8();
                                break;
                            case 12:
                                cc0 cc0Var7 = this.b;
                                MessagePreviewParams messagePreviewParams8 = cc0Var7.c0.d;
                                if (messagePreviewParams8.hasMedia) {
                                    boolean z14 = !messagePreviewParams8.webpageSmall;
                                    messagePreviewParams8.webpageSmall = z14;
                                    cc0Var7.G.a(z14, true);
                                    cc0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                    if (cc0Var7.r.messages.size() > 0 && (message2 = cc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z15 = messagePreviewParams8.webpageSmall;
                                        messageMedia2.force_small_media = z15;
                                        messageMedia2.force_large_media = !z15;
                                    }
                                    if (cc0Var7.r.previewMessages.size() > 0 && (message = cc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z16 = messagePreviewParams8.webpageSmall;
                                        messageMedia.force_small_media = z16;
                                        messageMedia.force_large_media = !z16;
                                    }
                                    cc0Var7.h();
                                    cc0Var7.U = true;
                                    break;
                                }
                                break;
                            default:
                                cc0 cc0Var8 = this.b;
                                MessagePreviewParams messagePreviewParams9 = cc0Var8.c0.d;
                                boolean z17 = messagePreviewParams9.webpageTop;
                                messagePreviewParams9.webpageTop = !z17;
                                cc0Var8.E.a(z17, true);
                                if (cc0Var8.r.messages.size() > 0 && (message4 = cc0Var8.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams9.webpageTop;
                                }
                                if (cc0Var8.r.previewMessages.size() > 0 && (message3 = cc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams9.webpageTop;
                                }
                                cc0Var8.h();
                                cc0Var8.U = true;
                                break;
                        }
                    }
                });
                frameLayout2.addView(sb0Var, w7.z5.c(48.0f, -1));
                frameLayout2.addView(sb0Var2, w7.z5.c(48.0f, -1));
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout2, w7.z5.n(-1, 48));
                r11 = drawable;
            }
            messagePreviewParams = messagePreviewParams2;
            if (!messagePreviewParams.monoforum && !messagePreviewParams.noforwards && !messagePreviewParams.hasSecretMessages) {
                ?? frameLayout3 = new FrameLayout(context3);
                ?? f1Var8 = new org.telegram.ui.ActionBar.f1(1, context3, ic0Var.F, false, false);
                this.x = f1Var8;
                f1Var8.g(LocaleController.getString(R.string.ReplyToAnotherChat), R.drawable.msg_forward_replace, r11);
                final int i26 = 3;
                f1Var8.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.lb0
                    public final /* synthetic */ cc0 b;

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
                                cc0 cc0Var42 = this.b;
                                cc0Var42.c0.d.quote = null;
                                cc0Var42.e.f(false);
                                cc0Var42.g(false, false);
                                cc0Var42.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                cc0 cc0Var5 = this.b;
                                tb0 tb0Var2 = cc0Var5.e;
                                ic0 ic0Var2 = cc0Var5.c0;
                                if (cc0Var5.c(null) != null) {
                                    if (tb0Var2.v - tb0Var2.u <= MessagesController.getInstance(ic0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.y9 y9Var = tb0Var2.W;
                                        MessageObject c11 = cc0Var5.c(y9Var != null ? ((org.telegram.ui.Cells.u1) y9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams5 = ic0Var2.d;
                                        int i172 = tb0Var2.u;
                                        messagePreviewParams5.quoteStart = i172;
                                        int i182 = tb0Var2.v;
                                        messagePreviewParams5.quoteEnd = i182;
                                        messagePreviewParams5.quote = org.telegram.ui.on.b(i172, i182, c11);
                                        ic0Var2.b();
                                        ic0Var2.a(true);
                                        break;
                                    } else {
                                        cc0Var5.f();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                cc0 cc0Var6 = this.b;
                                tb0 tb0Var3 = cc0Var6.e;
                                ic0 ic0Var3 = cc0Var6.c0;
                                MessagePreviewParams messagePreviewParams6 = ic0Var3.d;
                                int i192 = ic0Var3.w;
                                boolean z132 = ic0Var3.b;
                                if (messagePreviewParams6.quote != null && !z132) {
                                    messagePreviewParams6.quote = null;
                                    tb0Var3.f(false);
                                    cc0Var6.g(false, true);
                                    cc0Var6.k(true);
                                    break;
                                } else if (tb0Var3.v - tb0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                    MessageObject c12 = cc0Var6.c(null);
                                    if (c12 != null) {
                                        if (!tb0Var3.y()) {
                                            messagePreviewParams6.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                            messagePreviewParams6.quoteEnd = min;
                                            messagePreviewParams6.quote = org.telegram.ui.on.b(messagePreviewParams6.quoteStart, min, c12);
                                            View d10 = cc0Var6.d();
                                            if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                tb0Var3.a0((org.telegram.ui.Cells.u1) d10, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                            }
                                            if (!z132) {
                                                cc0Var6.s.getSwipeBack().e(cc0Var6.I);
                                            }
                                            cc0Var6.g(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams6.quoteStart = tb0Var3.u;
                                            messagePreviewParams6.quoteEnd = tb0Var3.v;
                                            org.telegram.ui.Cells.y9 y9Var2 = tb0Var3.W;
                                            messagePreviewParams6.quote = org.telegram.ui.on.b(messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd, cc0Var6.c(y9Var2 != null ? ((org.telegram.ui.Cells.u1) y9Var2).getMessageObject() : null));
                                            ic0Var3.b();
                                            ic0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    cc0Var6.f();
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
                                ic0 ic0Var4 = this.b.c0;
                                if (!ic0Var4.b) {
                                    org.telegram.ui.el elVar = (org.telegram.ui.el) ic0Var4;
                                    elVar.a(true);
                                    org.telegram.ui.yn ynVar = elVar.H;
                                    ynVar.l5 = null;
                                    ynVar.j5 = null;
                                    ynVar.d5.updateReply(null, null, ynVar.R5, null);
                                    ynVar.j8();
                                    break;
                                } else {
                                    org.telegram.ui.el elVar2 = (org.telegram.ui.el) ic0Var4;
                                    elVar2.a(true);
                                    org.telegram.ui.yn ynVar2 = elVar2.H;
                                    ynVar2.j5 = null;
                                    ynVar2.Ab(ynVar2.l5);
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
                                org.telegram.ui.yn ynVar3 = elVar3.H;
                                ynVar3.d5.updateForward(null, ynVar3.R5);
                                ynVar3.j8();
                                break;
                            case 10:
                                this.b.c0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.el elVar4 = (org.telegram.ui.el) this.b.c0;
                                elVar4.a(true);
                                org.telegram.ui.yn ynVar4 = elVar4.H;
                                ynVar4.E5 = null;
                                org.telegram.ui.jk jkVar = ynVar4.W;
                                if (jkVar != null) {
                                    jkVar.X2 = null;
                                    jkVar.Y2 = false;
                                }
                                MessagePreviewParams messagePreviewParams7 = ynVar4.d5;
                                if (messagePreviewParams7 != null) {
                                    i162 = ((org.telegram.ui.ActionBar.n2) ynVar4).currentAccount;
                                    MessageObject messageObject = ynVar4.l5;
                                    messagePreviewParams7.updateLink(i162, null, null, messageObject == ynVar4.V3 ? null : messageObject, ynVar4.j5, ynVar4.n5);
                                }
                                ynVar4.j8();
                                break;
                            case 12:
                                cc0 cc0Var7 = this.b;
                                MessagePreviewParams messagePreviewParams8 = cc0Var7.c0.d;
                                if (messagePreviewParams8.hasMedia) {
                                    boolean z14 = !messagePreviewParams8.webpageSmall;
                                    messagePreviewParams8.webpageSmall = z14;
                                    cc0Var7.G.a(z14, true);
                                    cc0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                    if (cc0Var7.r.messages.size() > 0 && (message2 = cc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z15 = messagePreviewParams8.webpageSmall;
                                        messageMedia2.force_small_media = z15;
                                        messageMedia2.force_large_media = !z15;
                                    }
                                    if (cc0Var7.r.previewMessages.size() > 0 && (message = cc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z16 = messagePreviewParams8.webpageSmall;
                                        messageMedia.force_small_media = z16;
                                        messageMedia.force_large_media = !z16;
                                    }
                                    cc0Var7.h();
                                    cc0Var7.U = true;
                                    break;
                                }
                                break;
                            default:
                                cc0 cc0Var8 = this.b;
                                MessagePreviewParams messagePreviewParams9 = cc0Var8.c0.d;
                                boolean z17 = messagePreviewParams9.webpageTop;
                                messagePreviewParams9.webpageTop = !z17;
                                cc0Var8.E.a(z17, true);
                                if (cc0Var8.r.messages.size() > 0 && (message4 = cc0Var8.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams9.webpageTop;
                                }
                                if (cc0Var8.r.previewMessages.size() > 0 && (message3 = cc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams9.webpageTop;
                                }
                                cc0Var8.h();
                                cc0Var8.U = true;
                                break;
                        }
                    }
                });
                context3 = context;
                ?? f1Var9 = new org.telegram.ui.ActionBar.f1(1, context3, ic0Var.F, false, false);
                this.y = f1Var9;
                f1Var9.g(LocaleController.getString(R.string.QuoteToAnotherChat), R.drawable.msg_forward_replace, r11);
                final int i27 = 4;
                f1Var9.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.lb0
                    public final /* synthetic */ cc0 b;

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
                                cc0 cc0Var42 = this.b;
                                cc0Var42.c0.d.quote = null;
                                cc0Var42.e.f(false);
                                cc0Var42.g(false, false);
                                cc0Var42.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                cc0 cc0Var5 = this.b;
                                tb0 tb0Var2 = cc0Var5.e;
                                ic0 ic0Var2 = cc0Var5.c0;
                                if (cc0Var5.c(null) != null) {
                                    if (tb0Var2.v - tb0Var2.u <= MessagesController.getInstance(ic0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.y9 y9Var = tb0Var2.W;
                                        MessageObject c11 = cc0Var5.c(y9Var != null ? ((org.telegram.ui.Cells.u1) y9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams5 = ic0Var2.d;
                                        int i172 = tb0Var2.u;
                                        messagePreviewParams5.quoteStart = i172;
                                        int i182 = tb0Var2.v;
                                        messagePreviewParams5.quoteEnd = i182;
                                        messagePreviewParams5.quote = org.telegram.ui.on.b(i172, i182, c11);
                                        ic0Var2.b();
                                        ic0Var2.a(true);
                                        break;
                                    } else {
                                        cc0Var5.f();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                cc0 cc0Var6 = this.b;
                                tb0 tb0Var3 = cc0Var6.e;
                                ic0 ic0Var3 = cc0Var6.c0;
                                MessagePreviewParams messagePreviewParams6 = ic0Var3.d;
                                int i192 = ic0Var3.w;
                                boolean z132 = ic0Var3.b;
                                if (messagePreviewParams6.quote != null && !z132) {
                                    messagePreviewParams6.quote = null;
                                    tb0Var3.f(false);
                                    cc0Var6.g(false, true);
                                    cc0Var6.k(true);
                                    break;
                                } else if (tb0Var3.v - tb0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                    MessageObject c12 = cc0Var6.c(null);
                                    if (c12 != null) {
                                        if (!tb0Var3.y()) {
                                            messagePreviewParams6.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                            messagePreviewParams6.quoteEnd = min;
                                            messagePreviewParams6.quote = org.telegram.ui.on.b(messagePreviewParams6.quoteStart, min, c12);
                                            View d10 = cc0Var6.d();
                                            if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                tb0Var3.a0((org.telegram.ui.Cells.u1) d10, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                            }
                                            if (!z132) {
                                                cc0Var6.s.getSwipeBack().e(cc0Var6.I);
                                            }
                                            cc0Var6.g(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams6.quoteStart = tb0Var3.u;
                                            messagePreviewParams6.quoteEnd = tb0Var3.v;
                                            org.telegram.ui.Cells.y9 y9Var2 = tb0Var3.W;
                                            messagePreviewParams6.quote = org.telegram.ui.on.b(messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd, cc0Var6.c(y9Var2 != null ? ((org.telegram.ui.Cells.u1) y9Var2).getMessageObject() : null));
                                            ic0Var3.b();
                                            ic0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    cc0Var6.f();
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
                                ic0 ic0Var4 = this.b.c0;
                                if (!ic0Var4.b) {
                                    org.telegram.ui.el elVar = (org.telegram.ui.el) ic0Var4;
                                    elVar.a(true);
                                    org.telegram.ui.yn ynVar = elVar.H;
                                    ynVar.l5 = null;
                                    ynVar.j5 = null;
                                    ynVar.d5.updateReply(null, null, ynVar.R5, null);
                                    ynVar.j8();
                                    break;
                                } else {
                                    org.telegram.ui.el elVar2 = (org.telegram.ui.el) ic0Var4;
                                    elVar2.a(true);
                                    org.telegram.ui.yn ynVar2 = elVar2.H;
                                    ynVar2.j5 = null;
                                    ynVar2.Ab(ynVar2.l5);
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
                                org.telegram.ui.yn ynVar3 = elVar3.H;
                                ynVar3.d5.updateForward(null, ynVar3.R5);
                                ynVar3.j8();
                                break;
                            case 10:
                                this.b.c0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.el elVar4 = (org.telegram.ui.el) this.b.c0;
                                elVar4.a(true);
                                org.telegram.ui.yn ynVar4 = elVar4.H;
                                ynVar4.E5 = null;
                                org.telegram.ui.jk jkVar = ynVar4.W;
                                if (jkVar != null) {
                                    jkVar.X2 = null;
                                    jkVar.Y2 = false;
                                }
                                MessagePreviewParams messagePreviewParams7 = ynVar4.d5;
                                if (messagePreviewParams7 != null) {
                                    i162 = ((org.telegram.ui.ActionBar.n2) ynVar4).currentAccount;
                                    MessageObject messageObject = ynVar4.l5;
                                    messagePreviewParams7.updateLink(i162, null, null, messageObject == ynVar4.V3 ? null : messageObject, ynVar4.j5, ynVar4.n5);
                                }
                                ynVar4.j8();
                                break;
                            case 12:
                                cc0 cc0Var7 = this.b;
                                MessagePreviewParams messagePreviewParams8 = cc0Var7.c0.d;
                                if (messagePreviewParams8.hasMedia) {
                                    boolean z14 = !messagePreviewParams8.webpageSmall;
                                    messagePreviewParams8.webpageSmall = z14;
                                    cc0Var7.G.a(z14, true);
                                    cc0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                    if (cc0Var7.r.messages.size() > 0 && (message2 = cc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z15 = messagePreviewParams8.webpageSmall;
                                        messageMedia2.force_small_media = z15;
                                        messageMedia2.force_large_media = !z15;
                                    }
                                    if (cc0Var7.r.previewMessages.size() > 0 && (message = cc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z16 = messagePreviewParams8.webpageSmall;
                                        messageMedia.force_small_media = z16;
                                        messageMedia.force_large_media = !z16;
                                    }
                                    cc0Var7.h();
                                    cc0Var7.U = true;
                                    break;
                                }
                                break;
                            default:
                                cc0 cc0Var8 = this.b;
                                MessagePreviewParams messagePreviewParams9 = cc0Var8.c0.d;
                                boolean z17 = messagePreviewParams9.webpageTop;
                                messagePreviewParams9.webpageTop = !z17;
                                cc0Var8.E.a(z17, true);
                                if (cc0Var8.r.messages.size() > 0 && (message4 = cc0Var8.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams9.webpageTop;
                                }
                                if (cc0Var8.r.previewMessages.size() > 0 && (message3 = cc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams9.webpageTop;
                                }
                                cc0Var8.h();
                                cc0Var8.U = true;
                                break;
                        }
                    }
                });
                frameLayout3.addView(f1Var9, w7.z5.c(48.0f, -1));
                frameLayout3.addView(f1Var8, w7.z5.c(48.0f, -1));
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout3, w7.z5.n(-1, 48));
            }
            if (!messagePreviewParams.noforwards && !messagePreviewParams.hasSecretMessages) {
                org.telegram.ui.ActionBar.k1 k1Var4 = new org.telegram.ui.ActionBar.k1(context3, ec0Var);
                k1Var4.setColor(org.telegram.ui.ActionBar.i6.l1(0.06f, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.E8, ec0Var)));
                k1Var4.setTag(R.id.fit_width_tag, 1);
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(k1Var4, w7.z5.n(-1, 8));
            }
            g(messagePreviewParams.quote != null, false);
            ?? f1Var10 = new org.telegram.ui.ActionBar.f1(1, context3, ic0Var.F, false, false);
            f1Var10.g(LocaleController.getString(R.string.ApplyChanges), R.drawable.msg_select, r11);
            final int i28 = 5;
            f1Var10.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.lb0
                public final /* synthetic */ cc0 b;

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
                            cc0 cc0Var42 = this.b;
                            cc0Var42.c0.d.quote = null;
                            cc0Var42.e.f(false);
                            cc0Var42.g(false, false);
                            cc0Var42.s.getSwipeBack().b(true);
                            break;
                        case 1:
                            cc0 cc0Var5 = this.b;
                            tb0 tb0Var2 = cc0Var5.e;
                            ic0 ic0Var2 = cc0Var5.c0;
                            if (cc0Var5.c(null) != null) {
                                if (tb0Var2.v - tb0Var2.u <= MessagesController.getInstance(ic0Var2.w).quoteLengthMax) {
                                    org.telegram.ui.Cells.y9 y9Var = tb0Var2.W;
                                    MessageObject c11 = cc0Var5.c(y9Var != null ? ((org.telegram.ui.Cells.u1) y9Var).getMessageObject() : null);
                                    MessagePreviewParams messagePreviewParams5 = ic0Var2.d;
                                    int i172 = tb0Var2.u;
                                    messagePreviewParams5.quoteStart = i172;
                                    int i182 = tb0Var2.v;
                                    messagePreviewParams5.quoteEnd = i182;
                                    messagePreviewParams5.quote = org.telegram.ui.on.b(i172, i182, c11);
                                    ic0Var2.b();
                                    ic0Var2.a(true);
                                    break;
                                } else {
                                    cc0Var5.f();
                                    break;
                                }
                            }
                            break;
                        case 2:
                            cc0 cc0Var6 = this.b;
                            tb0 tb0Var3 = cc0Var6.e;
                            ic0 ic0Var3 = cc0Var6.c0;
                            MessagePreviewParams messagePreviewParams6 = ic0Var3.d;
                            int i192 = ic0Var3.w;
                            boolean z132 = ic0Var3.b;
                            if (messagePreviewParams6.quote != null && !z132) {
                                messagePreviewParams6.quote = null;
                                tb0Var3.f(false);
                                cc0Var6.g(false, true);
                                cc0Var6.k(true);
                                break;
                            } else if (tb0Var3.v - tb0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                MessageObject c12 = cc0Var6.c(null);
                                if (c12 != null) {
                                    if (!tb0Var3.y()) {
                                        messagePreviewParams6.quoteStart = 0;
                                        int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                        messagePreviewParams6.quoteEnd = min;
                                        messagePreviewParams6.quote = org.telegram.ui.on.b(messagePreviewParams6.quoteStart, min, c12);
                                        View d10 = cc0Var6.d();
                                        if (d10 instanceof org.telegram.ui.Cells.u1) {
                                            tb0Var3.a0((org.telegram.ui.Cells.u1) d10, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                        }
                                        if (!z132) {
                                            cc0Var6.s.getSwipeBack().e(cc0Var6.I);
                                        }
                                        cc0Var6.g(true, true);
                                        break;
                                    } else {
                                        messagePreviewParams6.quoteStart = tb0Var3.u;
                                        messagePreviewParams6.quoteEnd = tb0Var3.v;
                                        org.telegram.ui.Cells.y9 y9Var2 = tb0Var3.W;
                                        messagePreviewParams6.quote = org.telegram.ui.on.b(messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd, cc0Var6.c(y9Var2 != null ? ((org.telegram.ui.Cells.u1) y9Var2).getMessageObject() : null));
                                        ic0Var3.b();
                                        ic0Var3.a(true);
                                        break;
                                    }
                                }
                            } else {
                                cc0Var6.f();
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
                            ic0 ic0Var4 = this.b.c0;
                            if (!ic0Var4.b) {
                                org.telegram.ui.el elVar = (org.telegram.ui.el) ic0Var4;
                                elVar.a(true);
                                org.telegram.ui.yn ynVar = elVar.H;
                                ynVar.l5 = null;
                                ynVar.j5 = null;
                                ynVar.d5.updateReply(null, null, ynVar.R5, null);
                                ynVar.j8();
                                break;
                            } else {
                                org.telegram.ui.el elVar2 = (org.telegram.ui.el) ic0Var4;
                                elVar2.a(true);
                                org.telegram.ui.yn ynVar2 = elVar2.H;
                                ynVar2.j5 = null;
                                ynVar2.Ab(ynVar2.l5);
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
                            org.telegram.ui.yn ynVar3 = elVar3.H;
                            ynVar3.d5.updateForward(null, ynVar3.R5);
                            ynVar3.j8();
                            break;
                        case 10:
                            this.b.c0.a(true);
                            break;
                        case 11:
                            org.telegram.ui.el elVar4 = (org.telegram.ui.el) this.b.c0;
                            elVar4.a(true);
                            org.telegram.ui.yn ynVar4 = elVar4.H;
                            ynVar4.E5 = null;
                            org.telegram.ui.jk jkVar = ynVar4.W;
                            if (jkVar != null) {
                                jkVar.X2 = null;
                                jkVar.Y2 = false;
                            }
                            MessagePreviewParams messagePreviewParams7 = ynVar4.d5;
                            if (messagePreviewParams7 != null) {
                                i162 = ((org.telegram.ui.ActionBar.n2) ynVar4).currentAccount;
                                MessageObject messageObject = ynVar4.l5;
                                messagePreviewParams7.updateLink(i162, null, null, messageObject == ynVar4.V3 ? null : messageObject, ynVar4.j5, ynVar4.n5);
                            }
                            ynVar4.j8();
                            break;
                        case 12:
                            cc0 cc0Var7 = this.b;
                            MessagePreviewParams messagePreviewParams8 = cc0Var7.c0.d;
                            if (messagePreviewParams8.hasMedia) {
                                boolean z14 = !messagePreviewParams8.webpageSmall;
                                messagePreviewParams8.webpageSmall = z14;
                                cc0Var7.G.a(z14, true);
                                cc0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                if (cc0Var7.r.messages.size() > 0 && (message2 = cc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                    boolean z15 = messagePreviewParams8.webpageSmall;
                                    messageMedia2.force_small_media = z15;
                                    messageMedia2.force_large_media = !z15;
                                }
                                if (cc0Var7.r.previewMessages.size() > 0 && (message = cc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                    boolean z16 = messagePreviewParams8.webpageSmall;
                                    messageMedia.force_small_media = z16;
                                    messageMedia.force_large_media = !z16;
                                }
                                cc0Var7.h();
                                cc0Var7.U = true;
                                break;
                            }
                            break;
                        default:
                            cc0 cc0Var8 = this.b;
                            MessagePreviewParams messagePreviewParams9 = cc0Var8.c0.d;
                            boolean z17 = messagePreviewParams9.webpageTop;
                            messagePreviewParams9.webpageTop = !z17;
                            cc0Var8.E.a(z17, true);
                            if (cc0Var8.r.messages.size() > 0 && (message4 = cc0Var8.r.messages.get(0).messageOwner) != null) {
                                message4.invert_media = messagePreviewParams9.webpageTop;
                            }
                            if (cc0Var8.r.previewMessages.size() > 0 && (message3 = cc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                message3.invert_media = messagePreviewParams9.webpageTop;
                            }
                            cc0Var8.h();
                            cc0Var8.U = true;
                            break;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(f1Var10, w7.z5.n(-1, 48));
            ?? f1Var11 = new org.telegram.ui.ActionBar.f1(1, context, ic0Var.F, false, true);
            f1Var11.g(LocaleController.getString(z12 ? R.string.DoNotQuote : R.string.DoNotReply), R.drawable.msg_delete, r11);
            int v04 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.q7, ec0Var);
            int i29 = org.telegram.ui.ActionBar.i6.p7;
            f1Var11.c(v04, org.telegram.ui.ActionBar.i6.v0(i29, ec0Var));
            f1Var11.setSelectorColor(org.telegram.ui.ActionBar.i6.l1(0.12f, org.telegram.ui.ActionBar.i6.w0(r11, i29, false)));
            final int i30 = 6;
            f1Var11.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.lb0
                public final /* synthetic */ cc0 b;

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
                            cc0 cc0Var42 = this.b;
                            cc0Var42.c0.d.quote = null;
                            cc0Var42.e.f(false);
                            cc0Var42.g(false, false);
                            cc0Var42.s.getSwipeBack().b(true);
                            break;
                        case 1:
                            cc0 cc0Var5 = this.b;
                            tb0 tb0Var2 = cc0Var5.e;
                            ic0 ic0Var2 = cc0Var5.c0;
                            if (cc0Var5.c(null) != null) {
                                if (tb0Var2.v - tb0Var2.u <= MessagesController.getInstance(ic0Var2.w).quoteLengthMax) {
                                    org.telegram.ui.Cells.y9 y9Var = tb0Var2.W;
                                    MessageObject c11 = cc0Var5.c(y9Var != null ? ((org.telegram.ui.Cells.u1) y9Var).getMessageObject() : null);
                                    MessagePreviewParams messagePreviewParams5 = ic0Var2.d;
                                    int i172 = tb0Var2.u;
                                    messagePreviewParams5.quoteStart = i172;
                                    int i182 = tb0Var2.v;
                                    messagePreviewParams5.quoteEnd = i182;
                                    messagePreviewParams5.quote = org.telegram.ui.on.b(i172, i182, c11);
                                    ic0Var2.b();
                                    ic0Var2.a(true);
                                    break;
                                } else {
                                    cc0Var5.f();
                                    break;
                                }
                            }
                            break;
                        case 2:
                            cc0 cc0Var6 = this.b;
                            tb0 tb0Var3 = cc0Var6.e;
                            ic0 ic0Var3 = cc0Var6.c0;
                            MessagePreviewParams messagePreviewParams6 = ic0Var3.d;
                            int i192 = ic0Var3.w;
                            boolean z132 = ic0Var3.b;
                            if (messagePreviewParams6.quote != null && !z132) {
                                messagePreviewParams6.quote = null;
                                tb0Var3.f(false);
                                cc0Var6.g(false, true);
                                cc0Var6.k(true);
                                break;
                            } else if (tb0Var3.v - tb0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                MessageObject c12 = cc0Var6.c(null);
                                if (c12 != null) {
                                    if (!tb0Var3.y()) {
                                        messagePreviewParams6.quoteStart = 0;
                                        int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                        messagePreviewParams6.quoteEnd = min;
                                        messagePreviewParams6.quote = org.telegram.ui.on.b(messagePreviewParams6.quoteStart, min, c12);
                                        View d10 = cc0Var6.d();
                                        if (d10 instanceof org.telegram.ui.Cells.u1) {
                                            tb0Var3.a0((org.telegram.ui.Cells.u1) d10, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                        }
                                        if (!z132) {
                                            cc0Var6.s.getSwipeBack().e(cc0Var6.I);
                                        }
                                        cc0Var6.g(true, true);
                                        break;
                                    } else {
                                        messagePreviewParams6.quoteStart = tb0Var3.u;
                                        messagePreviewParams6.quoteEnd = tb0Var3.v;
                                        org.telegram.ui.Cells.y9 y9Var2 = tb0Var3.W;
                                        messagePreviewParams6.quote = org.telegram.ui.on.b(messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd, cc0Var6.c(y9Var2 != null ? ((org.telegram.ui.Cells.u1) y9Var2).getMessageObject() : null));
                                        ic0Var3.b();
                                        ic0Var3.a(true);
                                        break;
                                    }
                                }
                            } else {
                                cc0Var6.f();
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
                            ic0 ic0Var4 = this.b.c0;
                            if (!ic0Var4.b) {
                                org.telegram.ui.el elVar = (org.telegram.ui.el) ic0Var4;
                                elVar.a(true);
                                org.telegram.ui.yn ynVar = elVar.H;
                                ynVar.l5 = null;
                                ynVar.j5 = null;
                                ynVar.d5.updateReply(null, null, ynVar.R5, null);
                                ynVar.j8();
                                break;
                            } else {
                                org.telegram.ui.el elVar2 = (org.telegram.ui.el) ic0Var4;
                                elVar2.a(true);
                                org.telegram.ui.yn ynVar2 = elVar2.H;
                                ynVar2.j5 = null;
                                ynVar2.Ab(ynVar2.l5);
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
                            org.telegram.ui.yn ynVar3 = elVar3.H;
                            ynVar3.d5.updateForward(null, ynVar3.R5);
                            ynVar3.j8();
                            break;
                        case 10:
                            this.b.c0.a(true);
                            break;
                        case 11:
                            org.telegram.ui.el elVar4 = (org.telegram.ui.el) this.b.c0;
                            elVar4.a(true);
                            org.telegram.ui.yn ynVar4 = elVar4.H;
                            ynVar4.E5 = null;
                            org.telegram.ui.jk jkVar = ynVar4.W;
                            if (jkVar != null) {
                                jkVar.X2 = null;
                                jkVar.Y2 = false;
                            }
                            MessagePreviewParams messagePreviewParams7 = ynVar4.d5;
                            if (messagePreviewParams7 != null) {
                                i162 = ((org.telegram.ui.ActionBar.n2) ynVar4).currentAccount;
                                MessageObject messageObject = ynVar4.l5;
                                messagePreviewParams7.updateLink(i162, null, null, messageObject == ynVar4.V3 ? null : messageObject, ynVar4.j5, ynVar4.n5);
                            }
                            ynVar4.j8();
                            break;
                        case 12:
                            cc0 cc0Var7 = this.b;
                            MessagePreviewParams messagePreviewParams8 = cc0Var7.c0.d;
                            if (messagePreviewParams8.hasMedia) {
                                boolean z14 = !messagePreviewParams8.webpageSmall;
                                messagePreviewParams8.webpageSmall = z14;
                                cc0Var7.G.a(z14, true);
                                cc0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                if (cc0Var7.r.messages.size() > 0 && (message2 = cc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                    boolean z15 = messagePreviewParams8.webpageSmall;
                                    messageMedia2.force_small_media = z15;
                                    messageMedia2.force_large_media = !z15;
                                }
                                if (cc0Var7.r.previewMessages.size() > 0 && (message = cc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                    boolean z16 = messagePreviewParams8.webpageSmall;
                                    messageMedia.force_small_media = z16;
                                    messageMedia.force_large_media = !z16;
                                }
                                cc0Var7.h();
                                cc0Var7.U = true;
                                break;
                            }
                            break;
                        default:
                            cc0 cc0Var8 = this.b;
                            MessagePreviewParams messagePreviewParams9 = cc0Var8.c0.d;
                            boolean z17 = messagePreviewParams9.webpageTop;
                            messagePreviewParams9.webpageTop = !z17;
                            cc0Var8.E.a(z17, true);
                            if (cc0Var8.r.messages.size() > 0 && (message4 = cc0Var8.r.messages.get(0).messageOwner) != null) {
                                message4.invert_media = messagePreviewParams9.webpageTop;
                            }
                            if (cc0Var8.r.previewMessages.size() > 0 && (message3 = cc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                message3.invert_media = messagePreviewParams9.webpageTop;
                            }
                            cc0Var8.h();
                            cc0Var8.U = true;
                            break;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(f1Var11, w7.z5.n(-1, 48));
            context2 = context;
            cc0Var2 = this;
            viewOutlineProvider = r11;
        }
        int i31 = cc0Var2.a;
        if (i31 == 1) {
            cc0Var2.r = messagePreviewParams.forwardMessages;
        } else if (i31 == 0) {
            cc0Var2.r = messagePreviewParams.replyMessage;
        } else if (i31 == 2) {
            cc0Var2.r = messagePreviewParams.linkMessage;
        }
        org.telegram.ui.Cells.ca o9 = cc0Var2.e.o(context2);
        cc0Var2.d = o9;
        o9.setElevation(AndroidUtilities.dp(8.0f));
        o9.setOutlineProvider(viewOutlineProvider);
        if (o9.getParent() instanceof ViewGroup) {
            ((ViewGroup) o9.getParent()).removeView(o9);
        }
        cc0Var2.addView(o9, w7.z5.d(-1, -1.0f, 51, 0.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / AndroidUtilities.density, 0.0f, 0.0f));
        cc0Var2.e.T(cc0Var2.f);
    }

    public static MessageObject.GroupedMessages a(cc0 cc0Var, MessageObject messageObject) {
        if (messageObject.getGroupId() == 0) {
            return null;
        }
        MessageObject.GroupedMessages groupedMessages = cc0Var.r.groupedMessagesMap.get(messageObject.getGroupId());
        if (groupedMessages == null || (groupedMessages.messages.size() > 1 && groupedMessages.getPosition(messageObject) != null)) {
            return groupedMessages;
        }
        return null;
    }

    public static void b(cc0 cc0Var, org.telegram.ui.Cells.u1 u1Var) {
        CharacterStyle characterStyle;
        TLRPC.WebPage webPage;
        if (cc0Var.a == 2) {
            MessagePreviewParams messagePreviewParams = cc0Var.c0.d;
            if (!messagePreviewParams.singleLink && (characterStyle = messagePreviewParams.currentLink) != null && (webPage = messagePreviewParams.webpage) != null && !(webPage instanceof TLRPC.TL_webPagePending)) {
                u1Var.Q3(characterStyle);
                return;
            }
        }
        u1Var.Q3(null);
    }

    public final MessageObject c(MessageObject messageObject) {
        MessageObject.GroupedMessages valueAt;
        ic0 ic0Var = this.c0;
        MessagePreviewParams.Messages messages = ic0Var.d.replyMessage;
        if (messages == null) {
            return null;
        }
        LongSparseArray<MessageObject.GroupedMessages> longSparseArray = messages.groupedMessagesMap;
        if (longSparseArray == null || longSparseArray.size() <= 0 || (valueAt = ic0Var.d.replyMessage.groupedMessagesMap.valueAt(0)) == null) {
            return ic0Var.d.replyMessage.messages.get(0);
        }
        if (valueAt.isDocuments) {
            if (messageObject != null) {
                return messageObject;
            }
            org.telegram.ui.on onVar = ic0Var.d.quote;
            if (onVar != null) {
                return onVar.a;
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
        org.telegram.ui.y8 y8Var = this.b;
        if (z10) {
            m6Var.setTranslationY(0.0f);
            y8Var.invalidateOutline();
            y8Var.setTranslationY(0.0f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(0.0f);
        } else {
            m6Var.setTranslationY(i10);
            y8Var.invalidateOutline();
            y8Var.setTranslationY(f7);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((f7 + y8Var.getMeasuredHeight()) - AndroidUtilities.dp(2.0f));
        }
        float x10 = y8Var.getX();
        org.telegram.ui.Cells.ca caVar = this.d;
        caVar.setTranslationX(x10);
        caVar.setTranslationY(y8Var.getY());
    }

    public final void f() {
        ic0 ic0Var = this.c0;
        new yc(ic0Var, ic0Var.F).M(LocaleController.getString(R.string.QuoteMaxError), LocaleController.getString(R.string.QuoteMaxErrorMessage), R.raw.error).j();
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
        org.telegram.ui.ActionBar.f1 f1Var = this.y;
        org.telegram.ui.ActionBar.f1 f1Var2 = this.x;
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
            if (f1Var2 != null) {
                f1Var2.setAlpha(!z10 ? 1.0f : 0.0f);
                f1Var2.setVisibility(!z10 ? 0 : 4);
            }
            if (f1Var != null) {
                f1Var.setAlpha(z10 ? 1.0f : 0.0f);
                f1Var.setVisibility(z10 ? 0 : 4);
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
        if (f1Var2 != null) {
            f1Var2.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(f1Var2, (Property<org.telegram.ui.ActionBar.f1, Float>) property, !z10 ? 1.0f : 0.0f));
        }
        if (f1Var != null) {
            f1Var.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(f1Var, (Property<org.telegram.ui.ActionBar.f1, Float>) property, z10 ? 1.0f : 0.0f));
        }
        this.P.playTogether(arrayList);
        this.P.setDuration(360L);
        this.P.setInterpolator(tr.h);
        this.P.addListener(new da(15, this, z10));
        this.P.start();
    }

    public final void h() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        ic0 ic0Var = this.c0;
        MessagePreviewParams messagePreviewParams = ic0Var.d;
        wb0 wb0Var = this.h;
        if (wb0Var.k()) {
            this.V = true;
            return;
        }
        for (int i10 = 0; i10 < this.r.previewMessages.size(); i10++) {
            MessageObject messageObject = this.r.previewMessages.get(i10);
            messageObject.forceUpdate = true;
            messageObject.sendAsPeer = ic0Var.a;
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
        ic0 ic0Var = this.c0;
        boolean z10 = ic0Var.v;
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
                int b10 = org.telegram.messenger.q.b(4.0f, measuredHeight, 0);
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
        ValueAnimator valueAnimator = ic0Var.h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ic0Var.h = ofFloat;
        ofFloat.addUpdateListener(new dk(this, i10, f7, 1));
        ic0Var.h.setDuration(250L);
        ic0Var.h.setInterpolator(ji.n.V);
        ic0Var.h.addListener(new r8(this, 29));
        AndroidUtilities.runOnUIThread(ic0Var.y, 50L);
        this.T = i10;
        e(f7, i10);
    }

    public final void j() {
        MessageObject messageObject;
        ic0 ic0Var = this.c0;
        MessagePreviewParams messagePreviewParams = ic0Var.d;
        if (this.a == 0) {
            tb0 tb0Var = this.e;
            if (tb0Var.v - tb0Var.u > MessagesController.getInstance(ic0Var.w).quoteLengthMax) {
                return;
            }
            org.telegram.ui.Cells.y9 y9Var = tb0Var.W;
            MessageObject c10 = c(y9Var != null ? ((org.telegram.ui.Cells.u1) y9Var).getMessageObject() : null);
            if (messagePreviewParams.quote != null && tb0Var.y()) {
                messagePreviewParams.quoteStart = tb0Var.u;
                messagePreviewParams.quoteEnd = tb0Var.v;
                if (c10 != null && ((messageObject = messagePreviewParams.quote.a) == null || messageObject.getId() != c10.getId())) {
                    messagePreviewParams.quote = org.telegram.ui.on.b(messagePreviewParams.quoteStart, messagePreviewParams.quoteEnd, c10);
                    ic0Var.b();
                }
            }
            tb0Var.f(false);
        }
    }

    public final void k(boolean z10) {
        ic0 ic0Var = this.c0;
        TLRPC.User user = ic0Var.n;
        MessagePreviewParams messagePreviewParams = ic0Var.d;
        TLRPC.Chat chat = ic0Var.r;
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
        ic0 ic0Var = this.c0;
        ic0Var.v = z10;
        this.W = 0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(i10, makeMeasureSpec);
        int i12 = this.W;
        int measuredHeight = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
        Rect rect = this.Q;
        this.W = Math.max(i12, measuredHeight + rect.top + rect.bottom);
        ((ViewGroup.MarginLayoutParams) this.f.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        boolean z11 = ic0Var.v;
        org.telegram.ui.y8 y8Var = this.b;
        if (z11) {
            y8Var.getLayoutParams().height = -1;
            ((ViewGroup.MarginLayoutParams) y8Var.getLayoutParams()).topMargin = AndroidUtilities.dp(8.0f);
            ((ViewGroup.MarginLayoutParams) y8Var.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
            y8Var.getLayoutParams().width = (int) Math.min(View.MeasureSpec.getSize(i10), Math.max(AndroidUtilities.dp(340.0f), View.MeasureSpec.getSize(i10) * 0.6f));
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = -1;
        } else {
            ((ViewGroup.MarginLayoutParams) y8Var.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) y8Var.getLayoutParams()).bottomMargin = 0;
            y8Var.getLayoutParams().height = (View.MeasureSpec.getSize(i11) - AndroidUtilities.dp(6.0f)) - this.W;
            if (y8Var.getLayoutParams().height < View.MeasureSpec.getSize(i11) * 0.5f) {
                y8Var.getLayoutParams().height = (int) (View.MeasureSpec.getSize(i11) * 0.5f);
            }
            y8Var.getLayoutParams().width = -1;
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = View.MeasureSpec.getSize(i11) - y8Var.getLayoutParams().height;
        }
        int size = (View.MeasureSpec.getSize(i11) + View.MeasureSpec.getSize(i10)) << 16;
        if (this.a0 != size) {
            for (int i13 = 0; i13 < this.r.previewMessages.size(); i13++) {
                MessageObject messageObject = this.r.previewMessages.get(i13);
                messageObject.parentWidth = ic0Var.v ? y8Var.getLayoutParams().width : View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(16.0f);
                messageObject.resetLayout();
                messageObject.forceUpdate = true;
                bc0 bc0Var = this.n;
                if (bc0Var != null) {
                    bc0Var.l();
                }
            }
            this.K = true;
        }
        this.a0 = size;
        super.onMeasure(i10, i11);
    }
}
