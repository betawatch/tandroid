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
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class xb0 extends FrameLayout {
    public final cc0 E;
    public final FrameLayout F;
    public final cc0 G;
    public final cc0 H;
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
    public final org.telegram.ui.x8 b;
    public boolean b0;
    public final ci.n6 c;
    public final /* synthetic */ dc0 c0;
    public final org.telegram.ui.Cells.da d;
    public final ob0 e;
    public final pb0 f;
    public final rb0 h;
    public final wb0 n;
    public MessagePreviewParams.Messages r;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout s;
    public final nb0 v;
    public final nb0 w;
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
    /* JADX WARN: Type inference failed for: r33v0, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout, java.lang.Object, org.telegram.ui.Components.xb0] */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.view.View, android.view.ViewGroup, org.telegram.ui.Components.aw0, org.telegram.ui.x8] */
    /* JADX WARN: Type inference failed for: r3v6, types: [ah.c] */
    /* JADX WARN: Type inference failed for: r9v8, types: [android.view.ViewGroup] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xb0(dc0 dc0Var, Context context, int i10) {
        super(r4);
        MessagePreviewParams messagePreviewParams;
        Context context2;
        xb0 xb0Var;
        boolean z10;
        cc0 cc0Var;
        cc0 cc0Var2;
        ViewOutlineProvider viewOutlineProvider;
        xb0 xb0Var2;
        MessagePreviewParams.Messages messages;
        ?? r11;
        MessagePreviewParams messagePreviewParams2;
        LinearLayout linearLayout;
        Drawable drawable;
        MessagePreviewParams messagePreviewParams3;
        boolean z11;
        Context context3 = context;
        this.c0 = dc0Var;
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
        setOnTouchListener(new vr(this, 4));
        ?? x8Var = new org.telegram.ui.x8(this, context3, i11);
        this.b = x8Var;
        zb0 zb0Var = dc0Var.F;
        boolean z12 = dc0Var.b;
        MessagePreviewParams messagePreviewParams4 = dc0Var.d;
        Drawable d = ((org.telegram.ui.xn) zb0Var).d();
        if (((org.telegram.ui.xn) zb0Var).f == null) {
            int i13 = org.telegram.ui.ActionBar.j6.a;
        }
        x8Var.V(d);
        x8Var.setOccupyStatusBar(false);
        int i14 = 3;
        x8Var.setOutlineProvider(new ch.b(this, i14));
        x8Var.setClipToOutline(true);
        x8Var.setElevation(AndroidUtilities.dp(4.0f));
        ci.n6 n6Var = new ci.n6(context3, 11, zb0Var);
        this.c = n6Var;
        n6Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.s8, zb0Var));
        ob0 ob0Var = new ob0(this);
        this.e = ob0Var;
        ob0Var.D = new ai.s3(this, i14);
        pb0 pb0Var = new pb0(this, context3, zb0Var);
        this.f = pb0Var;
        rb0 rb0Var = new rb0(this, pb0Var, zb0Var);
        this.h = rb0Var;
        pb0Var.setItemAnimator(rb0Var);
        pb0Var.setOnScrollListener(new sb0(this, i12));
        pb0Var.setOnItemClickListener(new tb0(this));
        wb0 wb0Var = new wb0(this);
        this.n = wb0Var;
        pb0Var.setAdapter(wb0Var);
        pb0Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        kb0 kb0Var = new kb0(this);
        kb0Var.O = new lb0(this);
        pb0Var.setClipToPadding(false);
        pb0Var.setLayoutManager(kb0Var);
        pb0Var.i(new mb0());
        x8Var.addView(pb0Var);
        addView(x8Var, w7.y5.d(-1, 400.0f, 0, 8.0f, 0.0f, 8.0f, 0.0f));
        x8Var.addView(n6Var, w7.y5.c(-2.0f, -1));
        ?? actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert2, 1, getContext(), zb0Var);
        this.s = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().setOnForegroundOpenFinished(new ib0(this, i11));
        ch.d c10 = dc0Var.G.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, false);
        c10.o(eh.b.k(zb0Var));
        c10.p(AndroidUtilities.dp(8.0f));
        c10.j.e = true;
        c10.q(AndroidUtilities.dp(12.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c10);
        addView(actionBarPopupWindow$ActionBarPopupWindowLayout, w7.y5.c(-2.0f, -2));
        if (i10 != 0 || (messages = messagePreviewParams4.replyMessage) == null) {
            messagePreviewParams = messagePreviewParams4;
            if (i10 != 1 || messagePreviewParams.forwardMessages == null) {
                final xb0 xb0Var3 = this;
                xb0Var = xb0Var3;
                if (i10 == 2) {
                    xb0Var = xb0Var3;
                    if (messagePreviewParams.linkMessage != null) {
                        cc0 cc0Var3 = new cc0(context, R.raw.position_below, LocaleController.getString(R.string.LinkAbove), R.raw.position_above, LocaleController.getString(R.string.LinkBelow), dc0Var.F);
                        xb0Var3.E = cc0Var3;
                        cc0Var3.a(!messagePreviewParams.webpageTop, false);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(cc0Var3, w7.y5.n(-1, 48));
                        FrameLayout frameLayout = new FrameLayout(context);
                        xb0Var3.F = frameLayout;
                        frameLayout.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.I5, zb0Var), 0, 0));
                        cc0 cc0Var4 = new cc0(context, R.raw.media_shrink, LocaleController.getString(R.string.LinkMediaLarger), R.raw.media_enlarge, LocaleController.getString(R.string.LinkMediaSmaller), dc0Var.F);
                        xb0Var3.G = cc0Var4;
                        cc0Var4.setBackground(null);
                        cc0Var4.setVisibility(messagePreviewParams.isVideo ? 4 : 0);
                        frameLayout.addView(cc0Var4, w7.y5.n(-1, 48));
                        cc0 cc0Var5 = new cc0(context, R.raw.media_shrink, LocaleController.getString(R.string.LinkVideoLarger), R.raw.media_enlarge, LocaleController.getString(R.string.LinkVideoSmaller), dc0Var.F);
                        xb0Var3.H = cc0Var5;
                        cc0Var5.setBackground(null);
                        cc0Var5.setVisibility(!messagePreviewParams.isVideo ? 4 : 0);
                        frameLayout.setAlpha(messagePreviewParams.hasMedia ? 1.0f : 0.5f);
                        frameLayout.addView(cc0Var5, w7.y5.n(-1, 48));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, w7.y5.n(-1, 48));
                        frameLayout.setVisibility((!messagePreviewParams.singleLink || messagePreviewParams.hasMedia) ? 0 : 8);
                        cc0Var4.a(messagePreviewParams.webpageSmall, false);
                        cc0Var5.a(messagePreviewParams.webpageSmall, false);
                        org.telegram.ui.ActionBar.k1 k1Var = new org.telegram.ui.ActionBar.k1(context, zb0Var);
                        k1Var.setColor(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, zb0Var)));
                        k1Var.setTag(R.id.fit_width_tag, 1);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(k1Var, w7.y5.n(-1, 8));
                        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(1, context, dc0Var.F, false, false);
                        f1Var.g(LocaleController.getString(R.string.ApplyChanges), R.drawable.msg_select, null);
                        final int i15 = 10;
                        f1Var.setOnClickListener(new View.OnClickListener(xb0Var3) { // from class: org.telegram.ui.Components.fb0
                            public final /* synthetic */ xb0 b;

                            {
                                this.b = xb0Var3;
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
                                        xb0 xb0Var4 = this.b;
                                        xb0Var4.c0.d.quote = null;
                                        xb0Var4.e.f(false);
                                        xb0Var4.g(false, false);
                                        xb0Var4.s.getSwipeBack().b(true);
                                        break;
                                    case 1:
                                        xb0 xb0Var5 = this.b;
                                        ob0 ob0Var2 = xb0Var5.e;
                                        dc0 dc0Var2 = xb0Var5.c0;
                                        if (xb0Var5.c(null) != null) {
                                            if (ob0Var2.v - ob0Var2.u <= MessagesController.getInstance(dc0Var2.w).quoteLengthMax) {
                                                org.telegram.ui.Cells.z9 z9Var = ob0Var2.W;
                                                MessageObject c11 = xb0Var5.c(z9Var != null ? ((org.telegram.ui.Cells.u1) z9Var).getMessageObject() : null);
                                                MessagePreviewParams messagePreviewParams5 = dc0Var2.d;
                                                int i17 = ob0Var2.u;
                                                messagePreviewParams5.quoteStart = i17;
                                                int i18 = ob0Var2.v;
                                                messagePreviewParams5.quoteEnd = i18;
                                                messagePreviewParams5.quote = org.telegram.ui.pn.b(i17, i18, c11);
                                                dc0Var2.b();
                                                dc0Var2.a(true);
                                                break;
                                            } else {
                                                xb0Var5.f();
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        xb0 xb0Var6 = this.b;
                                        ob0 ob0Var3 = xb0Var6.e;
                                        dc0 dc0Var3 = xb0Var6.c0;
                                        MessagePreviewParams messagePreviewParams6 = dc0Var3.d;
                                        int i19 = dc0Var3.w;
                                        boolean z13 = dc0Var3.b;
                                        if (messagePreviewParams6.quote != null && !z13) {
                                            messagePreviewParams6.quote = null;
                                            ob0Var3.f(false);
                                            xb0Var6.g(false, true);
                                            xb0Var6.k(true);
                                            break;
                                        } else if (ob0Var3.v - ob0Var3.u <= MessagesController.getInstance(i19).quoteLengthMax) {
                                            MessageObject c12 = xb0Var6.c(null);
                                            if (c12 != null) {
                                                if (!ob0Var3.y()) {
                                                    messagePreviewParams6.quoteStart = 0;
                                                    int min = Math.min(MessagesController.getInstance(i19).quoteLengthMax, c12.messageOwner.message.length());
                                                    messagePreviewParams6.quoteEnd = min;
                                                    messagePreviewParams6.quote = org.telegram.ui.pn.b(messagePreviewParams6.quoteStart, min, c12);
                                                    View d10 = xb0Var6.d();
                                                    if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                        ob0Var3.a0((org.telegram.ui.Cells.u1) d10, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                                    }
                                                    if (!z13) {
                                                        xb0Var6.s.getSwipeBack().e(xb0Var6.I);
                                                    }
                                                    xb0Var6.g(true, true);
                                                    break;
                                                } else {
                                                    messagePreviewParams6.quoteStart = ob0Var3.u;
                                                    messagePreviewParams6.quoteEnd = ob0Var3.v;
                                                    org.telegram.ui.Cells.z9 z9Var2 = ob0Var3.W;
                                                    messagePreviewParams6.quote = org.telegram.ui.pn.b(messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd, xb0Var6.c(z9Var2 != null ? ((org.telegram.ui.Cells.u1) z9Var2).getMessageObject() : null));
                                                    dc0Var3.b();
                                                    dc0Var3.a(true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            xb0Var6.f();
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
                                        dc0 dc0Var4 = this.b.c0;
                                        if (!dc0Var4.b) {
                                            org.telegram.ui.fl flVar = (org.telegram.ui.fl) dc0Var4;
                                            flVar.a(true);
                                            org.telegram.ui.zn znVar = flVar.H;
                                            znVar.n5 = null;
                                            znVar.l5 = null;
                                            znVar.f5.updateReply(null, null, znVar.T5, null);
                                            znVar.j8();
                                            break;
                                        } else {
                                            org.telegram.ui.fl flVar2 = (org.telegram.ui.fl) dc0Var4;
                                            flVar2.a(true);
                                            org.telegram.ui.zn znVar2 = flVar2.H;
                                            znVar2.l5 = null;
                                            znVar2.Bb(znVar2.n5);
                                            break;
                                        }
                                    case 7:
                                        this.b.c0.c(true);
                                        break;
                                    case 8:
                                        this.b.c0.a(true);
                                        break;
                                    case 9:
                                        org.telegram.ui.fl flVar3 = (org.telegram.ui.fl) this.b.c0;
                                        flVar3.a(true);
                                        org.telegram.ui.zn znVar3 = flVar3.H;
                                        znVar3.f5.updateForward(null, znVar3.T5);
                                        znVar3.j8();
                                        break;
                                    case 10:
                                        this.b.c0.a(true);
                                        break;
                                    case 11:
                                        org.telegram.ui.fl flVar4 = (org.telegram.ui.fl) this.b.c0;
                                        flVar4.a(true);
                                        org.telegram.ui.zn znVar4 = flVar4.H;
                                        znVar4.G5 = null;
                                        org.telegram.ui.lk lkVar = znVar4.Y;
                                        if (lkVar != null) {
                                            lkVar.W2 = null;
                                            lkVar.X2 = false;
                                        }
                                        MessagePreviewParams messagePreviewParams7 = znVar4.f5;
                                        if (messagePreviewParams7 != null) {
                                            i16 = ((org.telegram.ui.ActionBar.n2) znVar4).currentAccount;
                                            MessageObject messageObject = znVar4.n5;
                                            messagePreviewParams7.updateLink(i16, null, null, messageObject == znVar4.X3 ? null : messageObject, znVar4.l5, znVar4.p5);
                                        }
                                        znVar4.j8();
                                        break;
                                    case 12:
                                        xb0 xb0Var7 = this.b;
                                        MessagePreviewParams messagePreviewParams8 = xb0Var7.c0.d;
                                        if (messagePreviewParams8.hasMedia) {
                                            boolean z14 = !messagePreviewParams8.webpageSmall;
                                            messagePreviewParams8.webpageSmall = z14;
                                            xb0Var7.G.a(z14, true);
                                            xb0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                            if (xb0Var7.r.messages.size() > 0 && (message2 = xb0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                                boolean z15 = messagePreviewParams8.webpageSmall;
                                                messageMedia2.force_small_media = z15;
                                                messageMedia2.force_large_media = !z15;
                                            }
                                            if (xb0Var7.r.previewMessages.size() > 0 && (message = xb0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                                boolean z16 = messagePreviewParams8.webpageSmall;
                                                messageMedia.force_small_media = z16;
                                                messageMedia.force_large_media = !z16;
                                            }
                                            xb0Var7.h();
                                            xb0Var7.U = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        xb0 xb0Var8 = this.b;
                                        MessagePreviewParams messagePreviewParams9 = xb0Var8.c0.d;
                                        boolean z17 = messagePreviewParams9.webpageTop;
                                        messagePreviewParams9.webpageTop = !z17;
                                        xb0Var8.E.a(z17, true);
                                        if (xb0Var8.r.messages.size() > 0 && (message4 = xb0Var8.r.messages.get(0).messageOwner) != null) {
                                            message4.invert_media = messagePreviewParams9.webpageTop;
                                        }
                                        if (xb0Var8.r.previewMessages.size() > 0 && (message3 = xb0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                            message3.invert_media = messagePreviewParams9.webpageTop;
                                        }
                                        xb0Var8.h();
                                        xb0Var8.U = true;
                                        break;
                                }
                            }
                        });
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(f1Var, w7.y5.n(-1, 48));
                        org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(1, context, dc0Var.F, false, true);
                        context2 = context;
                        f1Var2.g(LocaleController.getString(R.string.DoNotLinkPreview), R.drawable.msg_delete, null);
                        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q7, zb0Var);
                        int i16 = org.telegram.ui.ActionBar.j6.p7;
                        f1Var2.c(v02, org.telegram.ui.ActionBar.j6.v0(i16, zb0Var));
                        final int i17 = 11;
                        f1Var2.setOnClickListener(new View.OnClickListener(xb0Var3) { // from class: org.telegram.ui.Components.fb0
                            public final /* synthetic */ xb0 b;

                            {
                                this.b = xb0Var3;
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
                                        xb0 xb0Var4 = this.b;
                                        xb0Var4.c0.d.quote = null;
                                        xb0Var4.e.f(false);
                                        xb0Var4.g(false, false);
                                        xb0Var4.s.getSwipeBack().b(true);
                                        break;
                                    case 1:
                                        xb0 xb0Var5 = this.b;
                                        ob0 ob0Var2 = xb0Var5.e;
                                        dc0 dc0Var2 = xb0Var5.c0;
                                        if (xb0Var5.c(null) != null) {
                                            if (ob0Var2.v - ob0Var2.u <= MessagesController.getInstance(dc0Var2.w).quoteLengthMax) {
                                                org.telegram.ui.Cells.z9 z9Var = ob0Var2.W;
                                                MessageObject c11 = xb0Var5.c(z9Var != null ? ((org.telegram.ui.Cells.u1) z9Var).getMessageObject() : null);
                                                MessagePreviewParams messagePreviewParams5 = dc0Var2.d;
                                                int i172 = ob0Var2.u;
                                                messagePreviewParams5.quoteStart = i172;
                                                int i18 = ob0Var2.v;
                                                messagePreviewParams5.quoteEnd = i18;
                                                messagePreviewParams5.quote = org.telegram.ui.pn.b(i172, i18, c11);
                                                dc0Var2.b();
                                                dc0Var2.a(true);
                                                break;
                                            } else {
                                                xb0Var5.f();
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        xb0 xb0Var6 = this.b;
                                        ob0 ob0Var3 = xb0Var6.e;
                                        dc0 dc0Var3 = xb0Var6.c0;
                                        MessagePreviewParams messagePreviewParams6 = dc0Var3.d;
                                        int i19 = dc0Var3.w;
                                        boolean z13 = dc0Var3.b;
                                        if (messagePreviewParams6.quote != null && !z13) {
                                            messagePreviewParams6.quote = null;
                                            ob0Var3.f(false);
                                            xb0Var6.g(false, true);
                                            xb0Var6.k(true);
                                            break;
                                        } else if (ob0Var3.v - ob0Var3.u <= MessagesController.getInstance(i19).quoteLengthMax) {
                                            MessageObject c12 = xb0Var6.c(null);
                                            if (c12 != null) {
                                                if (!ob0Var3.y()) {
                                                    messagePreviewParams6.quoteStart = 0;
                                                    int min = Math.min(MessagesController.getInstance(i19).quoteLengthMax, c12.messageOwner.message.length());
                                                    messagePreviewParams6.quoteEnd = min;
                                                    messagePreviewParams6.quote = org.telegram.ui.pn.b(messagePreviewParams6.quoteStart, min, c12);
                                                    View d10 = xb0Var6.d();
                                                    if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                        ob0Var3.a0((org.telegram.ui.Cells.u1) d10, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                                    }
                                                    if (!z13) {
                                                        xb0Var6.s.getSwipeBack().e(xb0Var6.I);
                                                    }
                                                    xb0Var6.g(true, true);
                                                    break;
                                                } else {
                                                    messagePreviewParams6.quoteStart = ob0Var3.u;
                                                    messagePreviewParams6.quoteEnd = ob0Var3.v;
                                                    org.telegram.ui.Cells.z9 z9Var2 = ob0Var3.W;
                                                    messagePreviewParams6.quote = org.telegram.ui.pn.b(messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd, xb0Var6.c(z9Var2 != null ? ((org.telegram.ui.Cells.u1) z9Var2).getMessageObject() : null));
                                                    dc0Var3.b();
                                                    dc0Var3.a(true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            xb0Var6.f();
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
                                        dc0 dc0Var4 = this.b.c0;
                                        if (!dc0Var4.b) {
                                            org.telegram.ui.fl flVar = (org.telegram.ui.fl) dc0Var4;
                                            flVar.a(true);
                                            org.telegram.ui.zn znVar = flVar.H;
                                            znVar.n5 = null;
                                            znVar.l5 = null;
                                            znVar.f5.updateReply(null, null, znVar.T5, null);
                                            znVar.j8();
                                            break;
                                        } else {
                                            org.telegram.ui.fl flVar2 = (org.telegram.ui.fl) dc0Var4;
                                            flVar2.a(true);
                                            org.telegram.ui.zn znVar2 = flVar2.H;
                                            znVar2.l5 = null;
                                            znVar2.Bb(znVar2.n5);
                                            break;
                                        }
                                    case 7:
                                        this.b.c0.c(true);
                                        break;
                                    case 8:
                                        this.b.c0.a(true);
                                        break;
                                    case 9:
                                        org.telegram.ui.fl flVar3 = (org.telegram.ui.fl) this.b.c0;
                                        flVar3.a(true);
                                        org.telegram.ui.zn znVar3 = flVar3.H;
                                        znVar3.f5.updateForward(null, znVar3.T5);
                                        znVar3.j8();
                                        break;
                                    case 10:
                                        this.b.c0.a(true);
                                        break;
                                    case 11:
                                        org.telegram.ui.fl flVar4 = (org.telegram.ui.fl) this.b.c0;
                                        flVar4.a(true);
                                        org.telegram.ui.zn znVar4 = flVar4.H;
                                        znVar4.G5 = null;
                                        org.telegram.ui.lk lkVar = znVar4.Y;
                                        if (lkVar != null) {
                                            lkVar.W2 = null;
                                            lkVar.X2 = false;
                                        }
                                        MessagePreviewParams messagePreviewParams7 = znVar4.f5;
                                        if (messagePreviewParams7 != null) {
                                            i162 = ((org.telegram.ui.ActionBar.n2) znVar4).currentAccount;
                                            MessageObject messageObject = znVar4.n5;
                                            messagePreviewParams7.updateLink(i162, null, null, messageObject == znVar4.X3 ? null : messageObject, znVar4.l5, znVar4.p5);
                                        }
                                        znVar4.j8();
                                        break;
                                    case 12:
                                        xb0 xb0Var7 = this.b;
                                        MessagePreviewParams messagePreviewParams8 = xb0Var7.c0.d;
                                        if (messagePreviewParams8.hasMedia) {
                                            boolean z14 = !messagePreviewParams8.webpageSmall;
                                            messagePreviewParams8.webpageSmall = z14;
                                            xb0Var7.G.a(z14, true);
                                            xb0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                            if (xb0Var7.r.messages.size() > 0 && (message2 = xb0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                                boolean z15 = messagePreviewParams8.webpageSmall;
                                                messageMedia2.force_small_media = z15;
                                                messageMedia2.force_large_media = !z15;
                                            }
                                            if (xb0Var7.r.previewMessages.size() > 0 && (message = xb0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                                boolean z16 = messagePreviewParams8.webpageSmall;
                                                messageMedia.force_small_media = z16;
                                                messageMedia.force_large_media = !z16;
                                            }
                                            xb0Var7.h();
                                            xb0Var7.U = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        xb0 xb0Var8 = this.b;
                                        MessagePreviewParams messagePreviewParams9 = xb0Var8.c0.d;
                                        boolean z17 = messagePreviewParams9.webpageTop;
                                        messagePreviewParams9.webpageTop = !z17;
                                        xb0Var8.E.a(z17, true);
                                        if (xb0Var8.r.messages.size() > 0 && (message4 = xb0Var8.r.messages.get(0).messageOwner) != null) {
                                            message4.invert_media = messagePreviewParams9.webpageTop;
                                        }
                                        if (xb0Var8.r.previewMessages.size() > 0 && (message3 = xb0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                            message3.invert_media = messagePreviewParams9.webpageTop;
                                        }
                                        xb0Var8.h();
                                        xb0Var8.U = true;
                                        break;
                                }
                            }
                        });
                        f1Var2.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.w0(null, i16, false)));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(f1Var2, w7.y5.n(-1, 48));
                        final int i18 = 12;
                        frameLayout.setOnClickListener(new View.OnClickListener(xb0Var3) { // from class: org.telegram.ui.Components.fb0
                            public final /* synthetic */ xb0 b;

                            {
                                this.b = xb0Var3;
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
                                        xb0 xb0Var4 = this.b;
                                        xb0Var4.c0.d.quote = null;
                                        xb0Var4.e.f(false);
                                        xb0Var4.g(false, false);
                                        xb0Var4.s.getSwipeBack().b(true);
                                        break;
                                    case 1:
                                        xb0 xb0Var5 = this.b;
                                        ob0 ob0Var2 = xb0Var5.e;
                                        dc0 dc0Var2 = xb0Var5.c0;
                                        if (xb0Var5.c(null) != null) {
                                            if (ob0Var2.v - ob0Var2.u <= MessagesController.getInstance(dc0Var2.w).quoteLengthMax) {
                                                org.telegram.ui.Cells.z9 z9Var = ob0Var2.W;
                                                MessageObject c11 = xb0Var5.c(z9Var != null ? ((org.telegram.ui.Cells.u1) z9Var).getMessageObject() : null);
                                                MessagePreviewParams messagePreviewParams5 = dc0Var2.d;
                                                int i172 = ob0Var2.u;
                                                messagePreviewParams5.quoteStart = i172;
                                                int i182 = ob0Var2.v;
                                                messagePreviewParams5.quoteEnd = i182;
                                                messagePreviewParams5.quote = org.telegram.ui.pn.b(i172, i182, c11);
                                                dc0Var2.b();
                                                dc0Var2.a(true);
                                                break;
                                            } else {
                                                xb0Var5.f();
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        xb0 xb0Var6 = this.b;
                                        ob0 ob0Var3 = xb0Var6.e;
                                        dc0 dc0Var3 = xb0Var6.c0;
                                        MessagePreviewParams messagePreviewParams6 = dc0Var3.d;
                                        int i19 = dc0Var3.w;
                                        boolean z13 = dc0Var3.b;
                                        if (messagePreviewParams6.quote != null && !z13) {
                                            messagePreviewParams6.quote = null;
                                            ob0Var3.f(false);
                                            xb0Var6.g(false, true);
                                            xb0Var6.k(true);
                                            break;
                                        } else if (ob0Var3.v - ob0Var3.u <= MessagesController.getInstance(i19).quoteLengthMax) {
                                            MessageObject c12 = xb0Var6.c(null);
                                            if (c12 != null) {
                                                if (!ob0Var3.y()) {
                                                    messagePreviewParams6.quoteStart = 0;
                                                    int min = Math.min(MessagesController.getInstance(i19).quoteLengthMax, c12.messageOwner.message.length());
                                                    messagePreviewParams6.quoteEnd = min;
                                                    messagePreviewParams6.quote = org.telegram.ui.pn.b(messagePreviewParams6.quoteStart, min, c12);
                                                    View d10 = xb0Var6.d();
                                                    if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                        ob0Var3.a0((org.telegram.ui.Cells.u1) d10, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                                    }
                                                    if (!z13) {
                                                        xb0Var6.s.getSwipeBack().e(xb0Var6.I);
                                                    }
                                                    xb0Var6.g(true, true);
                                                    break;
                                                } else {
                                                    messagePreviewParams6.quoteStart = ob0Var3.u;
                                                    messagePreviewParams6.quoteEnd = ob0Var3.v;
                                                    org.telegram.ui.Cells.z9 z9Var2 = ob0Var3.W;
                                                    messagePreviewParams6.quote = org.telegram.ui.pn.b(messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd, xb0Var6.c(z9Var2 != null ? ((org.telegram.ui.Cells.u1) z9Var2).getMessageObject() : null));
                                                    dc0Var3.b();
                                                    dc0Var3.a(true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            xb0Var6.f();
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
                                        dc0 dc0Var4 = this.b.c0;
                                        if (!dc0Var4.b) {
                                            org.telegram.ui.fl flVar = (org.telegram.ui.fl) dc0Var4;
                                            flVar.a(true);
                                            org.telegram.ui.zn znVar = flVar.H;
                                            znVar.n5 = null;
                                            znVar.l5 = null;
                                            znVar.f5.updateReply(null, null, znVar.T5, null);
                                            znVar.j8();
                                            break;
                                        } else {
                                            org.telegram.ui.fl flVar2 = (org.telegram.ui.fl) dc0Var4;
                                            flVar2.a(true);
                                            org.telegram.ui.zn znVar2 = flVar2.H;
                                            znVar2.l5 = null;
                                            znVar2.Bb(znVar2.n5);
                                            break;
                                        }
                                    case 7:
                                        this.b.c0.c(true);
                                        break;
                                    case 8:
                                        this.b.c0.a(true);
                                        break;
                                    case 9:
                                        org.telegram.ui.fl flVar3 = (org.telegram.ui.fl) this.b.c0;
                                        flVar3.a(true);
                                        org.telegram.ui.zn znVar3 = flVar3.H;
                                        znVar3.f5.updateForward(null, znVar3.T5);
                                        znVar3.j8();
                                        break;
                                    case 10:
                                        this.b.c0.a(true);
                                        break;
                                    case 11:
                                        org.telegram.ui.fl flVar4 = (org.telegram.ui.fl) this.b.c0;
                                        flVar4.a(true);
                                        org.telegram.ui.zn znVar4 = flVar4.H;
                                        znVar4.G5 = null;
                                        org.telegram.ui.lk lkVar = znVar4.Y;
                                        if (lkVar != null) {
                                            lkVar.W2 = null;
                                            lkVar.X2 = false;
                                        }
                                        MessagePreviewParams messagePreviewParams7 = znVar4.f5;
                                        if (messagePreviewParams7 != null) {
                                            i162 = ((org.telegram.ui.ActionBar.n2) znVar4).currentAccount;
                                            MessageObject messageObject = znVar4.n5;
                                            messagePreviewParams7.updateLink(i162, null, null, messageObject == znVar4.X3 ? null : messageObject, znVar4.l5, znVar4.p5);
                                        }
                                        znVar4.j8();
                                        break;
                                    case 12:
                                        xb0 xb0Var7 = this.b;
                                        MessagePreviewParams messagePreviewParams8 = xb0Var7.c0.d;
                                        if (messagePreviewParams8.hasMedia) {
                                            boolean z14 = !messagePreviewParams8.webpageSmall;
                                            messagePreviewParams8.webpageSmall = z14;
                                            xb0Var7.G.a(z14, true);
                                            xb0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                            if (xb0Var7.r.messages.size() > 0 && (message2 = xb0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                                boolean z15 = messagePreviewParams8.webpageSmall;
                                                messageMedia2.force_small_media = z15;
                                                messageMedia2.force_large_media = !z15;
                                            }
                                            if (xb0Var7.r.previewMessages.size() > 0 && (message = xb0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                                boolean z16 = messagePreviewParams8.webpageSmall;
                                                messageMedia.force_small_media = z16;
                                                messageMedia.force_large_media = !z16;
                                            }
                                            xb0Var7.h();
                                            xb0Var7.U = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        xb0 xb0Var8 = this.b;
                                        MessagePreviewParams messagePreviewParams9 = xb0Var8.c0.d;
                                        boolean z17 = messagePreviewParams9.webpageTop;
                                        messagePreviewParams9.webpageTop = !z17;
                                        xb0Var8.E.a(z17, true);
                                        if (xb0Var8.r.messages.size() > 0 && (message4 = xb0Var8.r.messages.get(0).messageOwner) != null) {
                                            message4.invert_media = messagePreviewParams9.webpageTop;
                                        }
                                        if (xb0Var8.r.previewMessages.size() > 0 && (message3 = xb0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                            message3.invert_media = messagePreviewParams9.webpageTop;
                                        }
                                        xb0Var8.h();
                                        xb0Var8.U = true;
                                        break;
                                }
                            }
                        });
                        final int i19 = 13;
                        cc0Var3.setOnClickListener(new View.OnClickListener(xb0Var3) { // from class: org.telegram.ui.Components.fb0
                            public final /* synthetic */ xb0 b;

                            {
                                this.b = xb0Var3;
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
                                        xb0 xb0Var4 = this.b;
                                        xb0Var4.c0.d.quote = null;
                                        xb0Var4.e.f(false);
                                        xb0Var4.g(false, false);
                                        xb0Var4.s.getSwipeBack().b(true);
                                        break;
                                    case 1:
                                        xb0 xb0Var5 = this.b;
                                        ob0 ob0Var2 = xb0Var5.e;
                                        dc0 dc0Var2 = xb0Var5.c0;
                                        if (xb0Var5.c(null) != null) {
                                            if (ob0Var2.v - ob0Var2.u <= MessagesController.getInstance(dc0Var2.w).quoteLengthMax) {
                                                org.telegram.ui.Cells.z9 z9Var = ob0Var2.W;
                                                MessageObject c11 = xb0Var5.c(z9Var != null ? ((org.telegram.ui.Cells.u1) z9Var).getMessageObject() : null);
                                                MessagePreviewParams messagePreviewParams5 = dc0Var2.d;
                                                int i172 = ob0Var2.u;
                                                messagePreviewParams5.quoteStart = i172;
                                                int i182 = ob0Var2.v;
                                                messagePreviewParams5.quoteEnd = i182;
                                                messagePreviewParams5.quote = org.telegram.ui.pn.b(i172, i182, c11);
                                                dc0Var2.b();
                                                dc0Var2.a(true);
                                                break;
                                            } else {
                                                xb0Var5.f();
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        xb0 xb0Var6 = this.b;
                                        ob0 ob0Var3 = xb0Var6.e;
                                        dc0 dc0Var3 = xb0Var6.c0;
                                        MessagePreviewParams messagePreviewParams6 = dc0Var3.d;
                                        int i192 = dc0Var3.w;
                                        boolean z13 = dc0Var3.b;
                                        if (messagePreviewParams6.quote != null && !z13) {
                                            messagePreviewParams6.quote = null;
                                            ob0Var3.f(false);
                                            xb0Var6.g(false, true);
                                            xb0Var6.k(true);
                                            break;
                                        } else if (ob0Var3.v - ob0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                            MessageObject c12 = xb0Var6.c(null);
                                            if (c12 != null) {
                                                if (!ob0Var3.y()) {
                                                    messagePreviewParams6.quoteStart = 0;
                                                    int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                                    messagePreviewParams6.quoteEnd = min;
                                                    messagePreviewParams6.quote = org.telegram.ui.pn.b(messagePreviewParams6.quoteStart, min, c12);
                                                    View d10 = xb0Var6.d();
                                                    if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                        ob0Var3.a0((org.telegram.ui.Cells.u1) d10, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                                    }
                                                    if (!z13) {
                                                        xb0Var6.s.getSwipeBack().e(xb0Var6.I);
                                                    }
                                                    xb0Var6.g(true, true);
                                                    break;
                                                } else {
                                                    messagePreviewParams6.quoteStart = ob0Var3.u;
                                                    messagePreviewParams6.quoteEnd = ob0Var3.v;
                                                    org.telegram.ui.Cells.z9 z9Var2 = ob0Var3.W;
                                                    messagePreviewParams6.quote = org.telegram.ui.pn.b(messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd, xb0Var6.c(z9Var2 != null ? ((org.telegram.ui.Cells.u1) z9Var2).getMessageObject() : null));
                                                    dc0Var3.b();
                                                    dc0Var3.a(true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            xb0Var6.f();
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
                                        dc0 dc0Var4 = this.b.c0;
                                        if (!dc0Var4.b) {
                                            org.telegram.ui.fl flVar = (org.telegram.ui.fl) dc0Var4;
                                            flVar.a(true);
                                            org.telegram.ui.zn znVar = flVar.H;
                                            znVar.n5 = null;
                                            znVar.l5 = null;
                                            znVar.f5.updateReply(null, null, znVar.T5, null);
                                            znVar.j8();
                                            break;
                                        } else {
                                            org.telegram.ui.fl flVar2 = (org.telegram.ui.fl) dc0Var4;
                                            flVar2.a(true);
                                            org.telegram.ui.zn znVar2 = flVar2.H;
                                            znVar2.l5 = null;
                                            znVar2.Bb(znVar2.n5);
                                            break;
                                        }
                                    case 7:
                                        this.b.c0.c(true);
                                        break;
                                    case 8:
                                        this.b.c0.a(true);
                                        break;
                                    case 9:
                                        org.telegram.ui.fl flVar3 = (org.telegram.ui.fl) this.b.c0;
                                        flVar3.a(true);
                                        org.telegram.ui.zn znVar3 = flVar3.H;
                                        znVar3.f5.updateForward(null, znVar3.T5);
                                        znVar3.j8();
                                        break;
                                    case 10:
                                        this.b.c0.a(true);
                                        break;
                                    case 11:
                                        org.telegram.ui.fl flVar4 = (org.telegram.ui.fl) this.b.c0;
                                        flVar4.a(true);
                                        org.telegram.ui.zn znVar4 = flVar4.H;
                                        znVar4.G5 = null;
                                        org.telegram.ui.lk lkVar = znVar4.Y;
                                        if (lkVar != null) {
                                            lkVar.W2 = null;
                                            lkVar.X2 = false;
                                        }
                                        MessagePreviewParams messagePreviewParams7 = znVar4.f5;
                                        if (messagePreviewParams7 != null) {
                                            i162 = ((org.telegram.ui.ActionBar.n2) znVar4).currentAccount;
                                            MessageObject messageObject = znVar4.n5;
                                            messagePreviewParams7.updateLink(i162, null, null, messageObject == znVar4.X3 ? null : messageObject, znVar4.l5, znVar4.p5);
                                        }
                                        znVar4.j8();
                                        break;
                                    case 12:
                                        xb0 xb0Var7 = this.b;
                                        MessagePreviewParams messagePreviewParams8 = xb0Var7.c0.d;
                                        if (messagePreviewParams8.hasMedia) {
                                            boolean z14 = !messagePreviewParams8.webpageSmall;
                                            messagePreviewParams8.webpageSmall = z14;
                                            xb0Var7.G.a(z14, true);
                                            xb0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                            if (xb0Var7.r.messages.size() > 0 && (message2 = xb0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                                boolean z15 = messagePreviewParams8.webpageSmall;
                                                messageMedia2.force_small_media = z15;
                                                messageMedia2.force_large_media = !z15;
                                            }
                                            if (xb0Var7.r.previewMessages.size() > 0 && (message = xb0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                                boolean z16 = messagePreviewParams8.webpageSmall;
                                                messageMedia.force_small_media = z16;
                                                messageMedia.force_large_media = !z16;
                                            }
                                            xb0Var7.h();
                                            xb0Var7.U = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        xb0 xb0Var8 = this.b;
                                        MessagePreviewParams messagePreviewParams9 = xb0Var8.c0.d;
                                        boolean z17 = messagePreviewParams9.webpageTop;
                                        messagePreviewParams9.webpageTop = !z17;
                                        xb0Var8.E.a(z17, true);
                                        if (xb0Var8.r.messages.size() > 0 && (message4 = xb0Var8.r.messages.get(0).messageOwner) != null) {
                                            message4.invert_media = messagePreviewParams9.webpageTop;
                                        }
                                        if (xb0Var8.r.previewMessages.size() > 0 && (message3 = xb0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                            message3.invert_media = messagePreviewParams9.webpageTop;
                                        }
                                        xb0Var8.h();
                                        xb0Var8.U = true;
                                        break;
                                }
                            }
                        });
                        xb0Var2 = xb0Var3;
                        viewOutlineProvider = null;
                    }
                }
            } else {
                if (!UserConfig.getInstance(dc0Var.w).isPremium()) {
                    for (int i20 = 0; i20 < messagePreviewParams.forwardMessages.messages.size(); i20++) {
                        if (messagePreviewParams.forwardMessages.messages.get(i20).type == 36) {
                            z10 = false;
                            break;
                        }
                    }
                }
                z10 = true;
                cc0 cc0Var6 = new cc0(context, R.raw.name_hide, LocaleController.getString(messagePreviewParams.multipleUsers ? R.string.ShowSenderNames : R.string.ShowSendersName), R.raw.name_show, LocaleController.getString(messagePreviewParams.multipleUsers ? R.string.HideSenderNames : R.string.HideSendersName), dc0Var.F);
                this.s.a(cc0Var6, w7.y5.n(-1, 48));
                if (messagePreviewParams.hasCaption) {
                    cc0Var = cc0Var6;
                    cc0 cc0Var7 = new cc0(context, R.raw.caption_hide, LocaleController.getString(R.string.ShowCaption), R.raw.caption_show, LocaleController.getString(R.string.HideCaption), dc0Var.F);
                    cc0Var7.a(messagePreviewParams.hideCaption, false);
                    this.s.a(cc0Var7, w7.y5.n(-1, 48));
                    cc0Var2 = cc0Var7;
                } else {
                    cc0Var = cc0Var6;
                    cc0Var2 = null;
                }
                org.telegram.ui.ActionBar.f1 f1Var3 = new org.telegram.ui.ActionBar.f1(0, context, dc0Var.F, true, false);
                final int i21 = 7;
                f1Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fb0
                    public final /* synthetic */ xb0 b;

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
                                xb0 xb0Var4 = this.b;
                                xb0Var4.c0.d.quote = null;
                                xb0Var4.e.f(false);
                                xb0Var4.g(false, false);
                                xb0Var4.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                xb0 xb0Var5 = this.b;
                                ob0 ob0Var2 = xb0Var5.e;
                                dc0 dc0Var2 = xb0Var5.c0;
                                if (xb0Var5.c(null) != null) {
                                    if (ob0Var2.v - ob0Var2.u <= MessagesController.getInstance(dc0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.z9 z9Var = ob0Var2.W;
                                        MessageObject c11 = xb0Var5.c(z9Var != null ? ((org.telegram.ui.Cells.u1) z9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams5 = dc0Var2.d;
                                        int i172 = ob0Var2.u;
                                        messagePreviewParams5.quoteStart = i172;
                                        int i182 = ob0Var2.v;
                                        messagePreviewParams5.quoteEnd = i182;
                                        messagePreviewParams5.quote = org.telegram.ui.pn.b(i172, i182, c11);
                                        dc0Var2.b();
                                        dc0Var2.a(true);
                                        break;
                                    } else {
                                        xb0Var5.f();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                xb0 xb0Var6 = this.b;
                                ob0 ob0Var3 = xb0Var6.e;
                                dc0 dc0Var3 = xb0Var6.c0;
                                MessagePreviewParams messagePreviewParams6 = dc0Var3.d;
                                int i192 = dc0Var3.w;
                                boolean z13 = dc0Var3.b;
                                if (messagePreviewParams6.quote != null && !z13) {
                                    messagePreviewParams6.quote = null;
                                    ob0Var3.f(false);
                                    xb0Var6.g(false, true);
                                    xb0Var6.k(true);
                                    break;
                                } else if (ob0Var3.v - ob0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                    MessageObject c12 = xb0Var6.c(null);
                                    if (c12 != null) {
                                        if (!ob0Var3.y()) {
                                            messagePreviewParams6.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                            messagePreviewParams6.quoteEnd = min;
                                            messagePreviewParams6.quote = org.telegram.ui.pn.b(messagePreviewParams6.quoteStart, min, c12);
                                            View d10 = xb0Var6.d();
                                            if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                ob0Var3.a0((org.telegram.ui.Cells.u1) d10, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                            }
                                            if (!z13) {
                                                xb0Var6.s.getSwipeBack().e(xb0Var6.I);
                                            }
                                            xb0Var6.g(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams6.quoteStart = ob0Var3.u;
                                            messagePreviewParams6.quoteEnd = ob0Var3.v;
                                            org.telegram.ui.Cells.z9 z9Var2 = ob0Var3.W;
                                            messagePreviewParams6.quote = org.telegram.ui.pn.b(messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd, xb0Var6.c(z9Var2 != null ? ((org.telegram.ui.Cells.u1) z9Var2).getMessageObject() : null));
                                            dc0Var3.b();
                                            dc0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    xb0Var6.f();
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
                                dc0 dc0Var4 = this.b.c0;
                                if (!dc0Var4.b) {
                                    org.telegram.ui.fl flVar = (org.telegram.ui.fl) dc0Var4;
                                    flVar.a(true);
                                    org.telegram.ui.zn znVar = flVar.H;
                                    znVar.n5 = null;
                                    znVar.l5 = null;
                                    znVar.f5.updateReply(null, null, znVar.T5, null);
                                    znVar.j8();
                                    break;
                                } else {
                                    org.telegram.ui.fl flVar2 = (org.telegram.ui.fl) dc0Var4;
                                    flVar2.a(true);
                                    org.telegram.ui.zn znVar2 = flVar2.H;
                                    znVar2.l5 = null;
                                    znVar2.Bb(znVar2.n5);
                                    break;
                                }
                            case 7:
                                this.b.c0.c(true);
                                break;
                            case 8:
                                this.b.c0.a(true);
                                break;
                            case 9:
                                org.telegram.ui.fl flVar3 = (org.telegram.ui.fl) this.b.c0;
                                flVar3.a(true);
                                org.telegram.ui.zn znVar3 = flVar3.H;
                                znVar3.f5.updateForward(null, znVar3.T5);
                                znVar3.j8();
                                break;
                            case 10:
                                this.b.c0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.fl flVar4 = (org.telegram.ui.fl) this.b.c0;
                                flVar4.a(true);
                                org.telegram.ui.zn znVar4 = flVar4.H;
                                znVar4.G5 = null;
                                org.telegram.ui.lk lkVar = znVar4.Y;
                                if (lkVar != null) {
                                    lkVar.W2 = null;
                                    lkVar.X2 = false;
                                }
                                MessagePreviewParams messagePreviewParams7 = znVar4.f5;
                                if (messagePreviewParams7 != null) {
                                    i162 = ((org.telegram.ui.ActionBar.n2) znVar4).currentAccount;
                                    MessageObject messageObject = znVar4.n5;
                                    messagePreviewParams7.updateLink(i162, null, null, messageObject == znVar4.X3 ? null : messageObject, znVar4.l5, znVar4.p5);
                                }
                                znVar4.j8();
                                break;
                            case 12:
                                xb0 xb0Var7 = this.b;
                                MessagePreviewParams messagePreviewParams8 = xb0Var7.c0.d;
                                if (messagePreviewParams8.hasMedia) {
                                    boolean z14 = !messagePreviewParams8.webpageSmall;
                                    messagePreviewParams8.webpageSmall = z14;
                                    xb0Var7.G.a(z14, true);
                                    xb0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                    if (xb0Var7.r.messages.size() > 0 && (message2 = xb0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z15 = messagePreviewParams8.webpageSmall;
                                        messageMedia2.force_small_media = z15;
                                        messageMedia2.force_large_media = !z15;
                                    }
                                    if (xb0Var7.r.previewMessages.size() > 0 && (message = xb0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z16 = messagePreviewParams8.webpageSmall;
                                        messageMedia.force_small_media = z16;
                                        messageMedia.force_large_media = !z16;
                                    }
                                    xb0Var7.h();
                                    xb0Var7.U = true;
                                    break;
                                }
                                break;
                            default:
                                xb0 xb0Var8 = this.b;
                                MessagePreviewParams messagePreviewParams9 = xb0Var8.c0.d;
                                boolean z17 = messagePreviewParams9.webpageTop;
                                messagePreviewParams9.webpageTop = !z17;
                                xb0Var8.E.a(z17, true);
                                if (xb0Var8.r.messages.size() > 0 && (message4 = xb0Var8.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams9.webpageTop;
                                }
                                if (xb0Var8.r.previewMessages.size() > 0 && (message3 = xb0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams9.webpageTop;
                                }
                                xb0Var8.h();
                                xb0Var8.U = true;
                                break;
                        }
                    }
                });
                f1Var3.g(LocaleController.getString(R.string.ChangeRecipient), R.drawable.msg_forward_replace, null);
                this.s.a(f1Var3, w7.y5.n(-1, 48));
                org.telegram.ui.ActionBar.k1 k1Var2 = new org.telegram.ui.ActionBar.k1(context, zb0Var);
                k1Var2.setColor(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, zb0Var)));
                k1Var2.setTag(R.id.fit_width_tag, 1);
                this.s.a(k1Var2, w7.y5.n(-1, 8));
                org.telegram.ui.ActionBar.f1 f1Var4 = new org.telegram.ui.ActionBar.f1(1, context, dc0Var.F, false, false);
                f1Var4.g(LocaleController.getString(R.string.ApplyChanges), R.drawable.msg_select, null);
                final int i22 = 8;
                f1Var4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fb0
                    public final /* synthetic */ xb0 b;

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
                                xb0 xb0Var4 = this.b;
                                xb0Var4.c0.d.quote = null;
                                xb0Var4.e.f(false);
                                xb0Var4.g(false, false);
                                xb0Var4.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                xb0 xb0Var5 = this.b;
                                ob0 ob0Var2 = xb0Var5.e;
                                dc0 dc0Var2 = xb0Var5.c0;
                                if (xb0Var5.c(null) != null) {
                                    if (ob0Var2.v - ob0Var2.u <= MessagesController.getInstance(dc0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.z9 z9Var = ob0Var2.W;
                                        MessageObject c11 = xb0Var5.c(z9Var != null ? ((org.telegram.ui.Cells.u1) z9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams5 = dc0Var2.d;
                                        int i172 = ob0Var2.u;
                                        messagePreviewParams5.quoteStart = i172;
                                        int i182 = ob0Var2.v;
                                        messagePreviewParams5.quoteEnd = i182;
                                        messagePreviewParams5.quote = org.telegram.ui.pn.b(i172, i182, c11);
                                        dc0Var2.b();
                                        dc0Var2.a(true);
                                        break;
                                    } else {
                                        xb0Var5.f();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                xb0 xb0Var6 = this.b;
                                ob0 ob0Var3 = xb0Var6.e;
                                dc0 dc0Var3 = xb0Var6.c0;
                                MessagePreviewParams messagePreviewParams6 = dc0Var3.d;
                                int i192 = dc0Var3.w;
                                boolean z13 = dc0Var3.b;
                                if (messagePreviewParams6.quote != null && !z13) {
                                    messagePreviewParams6.quote = null;
                                    ob0Var3.f(false);
                                    xb0Var6.g(false, true);
                                    xb0Var6.k(true);
                                    break;
                                } else if (ob0Var3.v - ob0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                    MessageObject c12 = xb0Var6.c(null);
                                    if (c12 != null) {
                                        if (!ob0Var3.y()) {
                                            messagePreviewParams6.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                            messagePreviewParams6.quoteEnd = min;
                                            messagePreviewParams6.quote = org.telegram.ui.pn.b(messagePreviewParams6.quoteStart, min, c12);
                                            View d10 = xb0Var6.d();
                                            if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                ob0Var3.a0((org.telegram.ui.Cells.u1) d10, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                            }
                                            if (!z13) {
                                                xb0Var6.s.getSwipeBack().e(xb0Var6.I);
                                            }
                                            xb0Var6.g(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams6.quoteStart = ob0Var3.u;
                                            messagePreviewParams6.quoteEnd = ob0Var3.v;
                                            org.telegram.ui.Cells.z9 z9Var2 = ob0Var3.W;
                                            messagePreviewParams6.quote = org.telegram.ui.pn.b(messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd, xb0Var6.c(z9Var2 != null ? ((org.telegram.ui.Cells.u1) z9Var2).getMessageObject() : null));
                                            dc0Var3.b();
                                            dc0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    xb0Var6.f();
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
                                dc0 dc0Var4 = this.b.c0;
                                if (!dc0Var4.b) {
                                    org.telegram.ui.fl flVar = (org.telegram.ui.fl) dc0Var4;
                                    flVar.a(true);
                                    org.telegram.ui.zn znVar = flVar.H;
                                    znVar.n5 = null;
                                    znVar.l5 = null;
                                    znVar.f5.updateReply(null, null, znVar.T5, null);
                                    znVar.j8();
                                    break;
                                } else {
                                    org.telegram.ui.fl flVar2 = (org.telegram.ui.fl) dc0Var4;
                                    flVar2.a(true);
                                    org.telegram.ui.zn znVar2 = flVar2.H;
                                    znVar2.l5 = null;
                                    znVar2.Bb(znVar2.n5);
                                    break;
                                }
                            case 7:
                                this.b.c0.c(true);
                                break;
                            case 8:
                                this.b.c0.a(true);
                                break;
                            case 9:
                                org.telegram.ui.fl flVar3 = (org.telegram.ui.fl) this.b.c0;
                                flVar3.a(true);
                                org.telegram.ui.zn znVar3 = flVar3.H;
                                znVar3.f5.updateForward(null, znVar3.T5);
                                znVar3.j8();
                                break;
                            case 10:
                                this.b.c0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.fl flVar4 = (org.telegram.ui.fl) this.b.c0;
                                flVar4.a(true);
                                org.telegram.ui.zn znVar4 = flVar4.H;
                                znVar4.G5 = null;
                                org.telegram.ui.lk lkVar = znVar4.Y;
                                if (lkVar != null) {
                                    lkVar.W2 = null;
                                    lkVar.X2 = false;
                                }
                                MessagePreviewParams messagePreviewParams7 = znVar4.f5;
                                if (messagePreviewParams7 != null) {
                                    i162 = ((org.telegram.ui.ActionBar.n2) znVar4).currentAccount;
                                    MessageObject messageObject = znVar4.n5;
                                    messagePreviewParams7.updateLink(i162, null, null, messageObject == znVar4.X3 ? null : messageObject, znVar4.l5, znVar4.p5);
                                }
                                znVar4.j8();
                                break;
                            case 12:
                                xb0 xb0Var7 = this.b;
                                MessagePreviewParams messagePreviewParams8 = xb0Var7.c0.d;
                                if (messagePreviewParams8.hasMedia) {
                                    boolean z14 = !messagePreviewParams8.webpageSmall;
                                    messagePreviewParams8.webpageSmall = z14;
                                    xb0Var7.G.a(z14, true);
                                    xb0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                    if (xb0Var7.r.messages.size() > 0 && (message2 = xb0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z15 = messagePreviewParams8.webpageSmall;
                                        messageMedia2.force_small_media = z15;
                                        messageMedia2.force_large_media = !z15;
                                    }
                                    if (xb0Var7.r.previewMessages.size() > 0 && (message = xb0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z16 = messagePreviewParams8.webpageSmall;
                                        messageMedia.force_small_media = z16;
                                        messageMedia.force_large_media = !z16;
                                    }
                                    xb0Var7.h();
                                    xb0Var7.U = true;
                                    break;
                                }
                                break;
                            default:
                                xb0 xb0Var8 = this.b;
                                MessagePreviewParams messagePreviewParams9 = xb0Var8.c0.d;
                                boolean z17 = messagePreviewParams9.webpageTop;
                                messagePreviewParams9.webpageTop = !z17;
                                xb0Var8.E.a(z17, true);
                                if (xb0Var8.r.messages.size() > 0 && (message4 = xb0Var8.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams9.webpageTop;
                                }
                                if (xb0Var8.r.previewMessages.size() > 0 && (message3 = xb0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams9.webpageTop;
                                }
                                xb0Var8.h();
                                xb0Var8.U = true;
                                break;
                        }
                    }
                });
                this.s.a(f1Var4, w7.y5.n(-1, 48));
                org.telegram.ui.ActionBar.f1 f1Var5 = new org.telegram.ui.ActionBar.f1(1, context, dc0Var.F, false, true);
                f1Var5.g(LocaleController.getString(R.string.DoNotForward), R.drawable.msg_delete, null);
                int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q7, zb0Var);
                int i23 = org.telegram.ui.ActionBar.j6.p7;
                f1Var5.c(v03, org.telegram.ui.ActionBar.j6.v0(i23, zb0Var));
                final int i24 = 9;
                f1Var5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fb0
                    public final /* synthetic */ xb0 b;

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
                                xb0 xb0Var4 = this.b;
                                xb0Var4.c0.d.quote = null;
                                xb0Var4.e.f(false);
                                xb0Var4.g(false, false);
                                xb0Var4.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                xb0 xb0Var5 = this.b;
                                ob0 ob0Var2 = xb0Var5.e;
                                dc0 dc0Var2 = xb0Var5.c0;
                                if (xb0Var5.c(null) != null) {
                                    if (ob0Var2.v - ob0Var2.u <= MessagesController.getInstance(dc0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.z9 z9Var = ob0Var2.W;
                                        MessageObject c11 = xb0Var5.c(z9Var != null ? ((org.telegram.ui.Cells.u1) z9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams5 = dc0Var2.d;
                                        int i172 = ob0Var2.u;
                                        messagePreviewParams5.quoteStart = i172;
                                        int i182 = ob0Var2.v;
                                        messagePreviewParams5.quoteEnd = i182;
                                        messagePreviewParams5.quote = org.telegram.ui.pn.b(i172, i182, c11);
                                        dc0Var2.b();
                                        dc0Var2.a(true);
                                        break;
                                    } else {
                                        xb0Var5.f();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                xb0 xb0Var6 = this.b;
                                ob0 ob0Var3 = xb0Var6.e;
                                dc0 dc0Var3 = xb0Var6.c0;
                                MessagePreviewParams messagePreviewParams6 = dc0Var3.d;
                                int i192 = dc0Var3.w;
                                boolean z13 = dc0Var3.b;
                                if (messagePreviewParams6.quote != null && !z13) {
                                    messagePreviewParams6.quote = null;
                                    ob0Var3.f(false);
                                    xb0Var6.g(false, true);
                                    xb0Var6.k(true);
                                    break;
                                } else if (ob0Var3.v - ob0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                    MessageObject c12 = xb0Var6.c(null);
                                    if (c12 != null) {
                                        if (!ob0Var3.y()) {
                                            messagePreviewParams6.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                            messagePreviewParams6.quoteEnd = min;
                                            messagePreviewParams6.quote = org.telegram.ui.pn.b(messagePreviewParams6.quoteStart, min, c12);
                                            View d10 = xb0Var6.d();
                                            if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                ob0Var3.a0((org.telegram.ui.Cells.u1) d10, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                            }
                                            if (!z13) {
                                                xb0Var6.s.getSwipeBack().e(xb0Var6.I);
                                            }
                                            xb0Var6.g(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams6.quoteStart = ob0Var3.u;
                                            messagePreviewParams6.quoteEnd = ob0Var3.v;
                                            org.telegram.ui.Cells.z9 z9Var2 = ob0Var3.W;
                                            messagePreviewParams6.quote = org.telegram.ui.pn.b(messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd, xb0Var6.c(z9Var2 != null ? ((org.telegram.ui.Cells.u1) z9Var2).getMessageObject() : null));
                                            dc0Var3.b();
                                            dc0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    xb0Var6.f();
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
                                dc0 dc0Var4 = this.b.c0;
                                if (!dc0Var4.b) {
                                    org.telegram.ui.fl flVar = (org.telegram.ui.fl) dc0Var4;
                                    flVar.a(true);
                                    org.telegram.ui.zn znVar = flVar.H;
                                    znVar.n5 = null;
                                    znVar.l5 = null;
                                    znVar.f5.updateReply(null, null, znVar.T5, null);
                                    znVar.j8();
                                    break;
                                } else {
                                    org.telegram.ui.fl flVar2 = (org.telegram.ui.fl) dc0Var4;
                                    flVar2.a(true);
                                    org.telegram.ui.zn znVar2 = flVar2.H;
                                    znVar2.l5 = null;
                                    znVar2.Bb(znVar2.n5);
                                    break;
                                }
                            case 7:
                                this.b.c0.c(true);
                                break;
                            case 8:
                                this.b.c0.a(true);
                                break;
                            case 9:
                                org.telegram.ui.fl flVar3 = (org.telegram.ui.fl) this.b.c0;
                                flVar3.a(true);
                                org.telegram.ui.zn znVar3 = flVar3.H;
                                znVar3.f5.updateForward(null, znVar3.T5);
                                znVar3.j8();
                                break;
                            case 10:
                                this.b.c0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.fl flVar4 = (org.telegram.ui.fl) this.b.c0;
                                flVar4.a(true);
                                org.telegram.ui.zn znVar4 = flVar4.H;
                                znVar4.G5 = null;
                                org.telegram.ui.lk lkVar = znVar4.Y;
                                if (lkVar != null) {
                                    lkVar.W2 = null;
                                    lkVar.X2 = false;
                                }
                                MessagePreviewParams messagePreviewParams7 = znVar4.f5;
                                if (messagePreviewParams7 != null) {
                                    i162 = ((org.telegram.ui.ActionBar.n2) znVar4).currentAccount;
                                    MessageObject messageObject = znVar4.n5;
                                    messagePreviewParams7.updateLink(i162, null, null, messageObject == znVar4.X3 ? null : messageObject, znVar4.l5, znVar4.p5);
                                }
                                znVar4.j8();
                                break;
                            case 12:
                                xb0 xb0Var7 = this.b;
                                MessagePreviewParams messagePreviewParams8 = xb0Var7.c0.d;
                                if (messagePreviewParams8.hasMedia) {
                                    boolean z14 = !messagePreviewParams8.webpageSmall;
                                    messagePreviewParams8.webpageSmall = z14;
                                    xb0Var7.G.a(z14, true);
                                    xb0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                    if (xb0Var7.r.messages.size() > 0 && (message2 = xb0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z15 = messagePreviewParams8.webpageSmall;
                                        messageMedia2.force_small_media = z15;
                                        messageMedia2.force_large_media = !z15;
                                    }
                                    if (xb0Var7.r.previewMessages.size() > 0 && (message = xb0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z16 = messagePreviewParams8.webpageSmall;
                                        messageMedia.force_small_media = z16;
                                        messageMedia.force_large_media = !z16;
                                    }
                                    xb0Var7.h();
                                    xb0Var7.U = true;
                                    break;
                                }
                                break;
                            default:
                                xb0 xb0Var8 = this.b;
                                MessagePreviewParams messagePreviewParams9 = xb0Var8.c0.d;
                                boolean z17 = messagePreviewParams9.webpageTop;
                                messagePreviewParams9.webpageTop = !z17;
                                xb0Var8.E.a(z17, true);
                                if (xb0Var8.r.messages.size() > 0 && (message4 = xb0Var8.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams9.webpageTop;
                                }
                                if (xb0Var8.r.previewMessages.size() > 0 && (message3 = xb0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams9.webpageTop;
                                }
                                xb0Var8.h();
                                xb0Var8.U = true;
                                break;
                        }
                    }
                });
                f1Var5.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.w0(null, i23, false)));
                this.s.a(f1Var5, w7.y5.n(-1, 48));
                cc0 cc0Var8 = cc0Var;
                cc0Var8.a(messagePreviewParams.hideForwardSendersName, false);
                cc0 cc0Var9 = cc0Var2;
                xb0 xb0Var4 = this;
                cc0Var8.setOnClickListener(new jb0(this, z10, context, cc0Var9, cc0Var8, 0));
                xb0Var = xb0Var4;
                if (cc0Var9 != null) {
                    cc0Var9.setOnClickListener(new ai.d0(xb0Var4, cc0Var9, cc0Var8, 24));
                    xb0Var = xb0Var4;
                }
            }
            context2 = context;
            xb0Var2 = xb0Var;
            viewOutlineProvider = null;
        } else {
            if (!messages.hasText || messagePreviewParams4.isSecret) {
                r11 = 0;
                messagePreviewParams2 = messagePreviewParams4;
            } else {
                LinearLayout f7 = org.telegram.messenger.rk.f(context3, 1);
                if (z12) {
                    linearLayout = f7;
                    drawable = null;
                    messagePreviewParams3 = messagePreviewParams4;
                    z11 = true;
                } else {
                    messagePreviewParams3 = messagePreviewParams4;
                    ?? r92 = f7;
                    drawable = null;
                    org.telegram.ui.ActionBar.f1 f1Var6 = new org.telegram.ui.ActionBar.f1(0, context3, dc0Var.F, true, false);
                    f1Var6.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                    f1Var6.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fb0
                        public final /* synthetic */ xb0 b;

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
                                    xb0 xb0Var42 = this.b;
                                    xb0Var42.c0.d.quote = null;
                                    xb0Var42.e.f(false);
                                    xb0Var42.g(false, false);
                                    xb0Var42.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    xb0 xb0Var5 = this.b;
                                    ob0 ob0Var2 = xb0Var5.e;
                                    dc0 dc0Var2 = xb0Var5.c0;
                                    if (xb0Var5.c(null) != null) {
                                        if (ob0Var2.v - ob0Var2.u <= MessagesController.getInstance(dc0Var2.w).quoteLengthMax) {
                                            org.telegram.ui.Cells.z9 z9Var = ob0Var2.W;
                                            MessageObject c11 = xb0Var5.c(z9Var != null ? ((org.telegram.ui.Cells.u1) z9Var).getMessageObject() : null);
                                            MessagePreviewParams messagePreviewParams5 = dc0Var2.d;
                                            int i172 = ob0Var2.u;
                                            messagePreviewParams5.quoteStart = i172;
                                            int i182 = ob0Var2.v;
                                            messagePreviewParams5.quoteEnd = i182;
                                            messagePreviewParams5.quote = org.telegram.ui.pn.b(i172, i182, c11);
                                            dc0Var2.b();
                                            dc0Var2.a(true);
                                            break;
                                        } else {
                                            xb0Var5.f();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    xb0 xb0Var6 = this.b;
                                    ob0 ob0Var3 = xb0Var6.e;
                                    dc0 dc0Var3 = xb0Var6.c0;
                                    MessagePreviewParams messagePreviewParams6 = dc0Var3.d;
                                    int i192 = dc0Var3.w;
                                    boolean z13 = dc0Var3.b;
                                    if (messagePreviewParams6.quote != null && !z13) {
                                        messagePreviewParams6.quote = null;
                                        ob0Var3.f(false);
                                        xb0Var6.g(false, true);
                                        xb0Var6.k(true);
                                        break;
                                    } else if (ob0Var3.v - ob0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                        MessageObject c12 = xb0Var6.c(null);
                                        if (c12 != null) {
                                            if (!ob0Var3.y()) {
                                                messagePreviewParams6.quoteStart = 0;
                                                int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                                messagePreviewParams6.quoteEnd = min;
                                                messagePreviewParams6.quote = org.telegram.ui.pn.b(messagePreviewParams6.quoteStart, min, c12);
                                                View d10 = xb0Var6.d();
                                                if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                    ob0Var3.a0((org.telegram.ui.Cells.u1) d10, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                                }
                                                if (!z13) {
                                                    xb0Var6.s.getSwipeBack().e(xb0Var6.I);
                                                }
                                                xb0Var6.g(true, true);
                                                break;
                                            } else {
                                                messagePreviewParams6.quoteStart = ob0Var3.u;
                                                messagePreviewParams6.quoteEnd = ob0Var3.v;
                                                org.telegram.ui.Cells.z9 z9Var2 = ob0Var3.W;
                                                messagePreviewParams6.quote = org.telegram.ui.pn.b(messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd, xb0Var6.c(z9Var2 != null ? ((org.telegram.ui.Cells.u1) z9Var2).getMessageObject() : null));
                                                dc0Var3.b();
                                                dc0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        xb0Var6.f();
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
                                    dc0 dc0Var4 = this.b.c0;
                                    if (!dc0Var4.b) {
                                        org.telegram.ui.fl flVar = (org.telegram.ui.fl) dc0Var4;
                                        flVar.a(true);
                                        org.telegram.ui.zn znVar = flVar.H;
                                        znVar.n5 = null;
                                        znVar.l5 = null;
                                        znVar.f5.updateReply(null, null, znVar.T5, null);
                                        znVar.j8();
                                        break;
                                    } else {
                                        org.telegram.ui.fl flVar2 = (org.telegram.ui.fl) dc0Var4;
                                        flVar2.a(true);
                                        org.telegram.ui.zn znVar2 = flVar2.H;
                                        znVar2.l5 = null;
                                        znVar2.Bb(znVar2.n5);
                                        break;
                                    }
                                case 7:
                                    this.b.c0.c(true);
                                    break;
                                case 8:
                                    this.b.c0.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.fl flVar3 = (org.telegram.ui.fl) this.b.c0;
                                    flVar3.a(true);
                                    org.telegram.ui.zn znVar3 = flVar3.H;
                                    znVar3.f5.updateForward(null, znVar3.T5);
                                    znVar3.j8();
                                    break;
                                case 10:
                                    this.b.c0.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.fl flVar4 = (org.telegram.ui.fl) this.b.c0;
                                    flVar4.a(true);
                                    org.telegram.ui.zn znVar4 = flVar4.H;
                                    znVar4.G5 = null;
                                    org.telegram.ui.lk lkVar = znVar4.Y;
                                    if (lkVar != null) {
                                        lkVar.W2 = null;
                                        lkVar.X2 = false;
                                    }
                                    MessagePreviewParams messagePreviewParams7 = znVar4.f5;
                                    if (messagePreviewParams7 != null) {
                                        i162 = ((org.telegram.ui.ActionBar.n2) znVar4).currentAccount;
                                        MessageObject messageObject = znVar4.n5;
                                        messagePreviewParams7.updateLink(i162, null, null, messageObject == znVar4.X3 ? null : messageObject, znVar4.l5, znVar4.p5);
                                    }
                                    znVar4.j8();
                                    break;
                                case 12:
                                    xb0 xb0Var7 = this.b;
                                    MessagePreviewParams messagePreviewParams8 = xb0Var7.c0.d;
                                    if (messagePreviewParams8.hasMedia) {
                                        boolean z14 = !messagePreviewParams8.webpageSmall;
                                        messagePreviewParams8.webpageSmall = z14;
                                        xb0Var7.G.a(z14, true);
                                        xb0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                        if (xb0Var7.r.messages.size() > 0 && (message2 = xb0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z15 = messagePreviewParams8.webpageSmall;
                                            messageMedia2.force_small_media = z15;
                                            messageMedia2.force_large_media = !z15;
                                        }
                                        if (xb0Var7.r.previewMessages.size() > 0 && (message = xb0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                            boolean z16 = messagePreviewParams8.webpageSmall;
                                            messageMedia.force_small_media = z16;
                                            messageMedia.force_large_media = !z16;
                                        }
                                        xb0Var7.h();
                                        xb0Var7.U = true;
                                        break;
                                    }
                                    break;
                                default:
                                    xb0 xb0Var8 = this.b;
                                    MessagePreviewParams messagePreviewParams9 = xb0Var8.c0.d;
                                    boolean z17 = messagePreviewParams9.webpageTop;
                                    messagePreviewParams9.webpageTop = !z17;
                                    xb0Var8.E.a(z17, true);
                                    if (xb0Var8.r.messages.size() > 0 && (message4 = xb0Var8.r.messages.get(0).messageOwner) != null) {
                                        message4.invert_media = messagePreviewParams9.webpageTop;
                                    }
                                    if (xb0Var8.r.previewMessages.size() > 0 && (message3 = xb0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                        message3.invert_media = messagePreviewParams9.webpageTop;
                                    }
                                    xb0Var8.h();
                                    xb0Var8.U = true;
                                    break;
                            }
                        }
                    });
                    r92.addView(f1Var6, w7.y5.n(-1, 48));
                    org.telegram.ui.ActionBar.k1 k1Var3 = new org.telegram.ui.ActionBar.k1(context3, zb0Var);
                    k1Var3.setColor(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, zb0Var)));
                    k1Var3.setTag(R.id.fit_width_tag, 1);
                    r92.addView(k1Var3, w7.y5.n(-1, 8));
                    org.telegram.ui.ActionBar.f1 f1Var7 = new org.telegram.ui.ActionBar.f1(0, context3, dc0Var.F, false, true);
                    f1Var7.g(LocaleController.getString(R.string.QuoteSelectedPart), R.drawable.menu_quote_specific, null);
                    z11 = true;
                    final boolean z13 = true ? 1 : 0;
                    f1Var7.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fb0
                        public final /* synthetic */ xb0 b;

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
                                    xb0 xb0Var42 = this.b;
                                    xb0Var42.c0.d.quote = null;
                                    xb0Var42.e.f(false);
                                    xb0Var42.g(false, false);
                                    xb0Var42.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    xb0 xb0Var5 = this.b;
                                    ob0 ob0Var2 = xb0Var5.e;
                                    dc0 dc0Var2 = xb0Var5.c0;
                                    if (xb0Var5.c(null) != null) {
                                        if (ob0Var2.v - ob0Var2.u <= MessagesController.getInstance(dc0Var2.w).quoteLengthMax) {
                                            org.telegram.ui.Cells.z9 z9Var = ob0Var2.W;
                                            MessageObject c11 = xb0Var5.c(z9Var != null ? ((org.telegram.ui.Cells.u1) z9Var).getMessageObject() : null);
                                            MessagePreviewParams messagePreviewParams5 = dc0Var2.d;
                                            int i172 = ob0Var2.u;
                                            messagePreviewParams5.quoteStart = i172;
                                            int i182 = ob0Var2.v;
                                            messagePreviewParams5.quoteEnd = i182;
                                            messagePreviewParams5.quote = org.telegram.ui.pn.b(i172, i182, c11);
                                            dc0Var2.b();
                                            dc0Var2.a(true);
                                            break;
                                        } else {
                                            xb0Var5.f();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    xb0 xb0Var6 = this.b;
                                    ob0 ob0Var3 = xb0Var6.e;
                                    dc0 dc0Var3 = xb0Var6.c0;
                                    MessagePreviewParams messagePreviewParams6 = dc0Var3.d;
                                    int i192 = dc0Var3.w;
                                    boolean z132 = dc0Var3.b;
                                    if (messagePreviewParams6.quote != null && !z132) {
                                        messagePreviewParams6.quote = null;
                                        ob0Var3.f(false);
                                        xb0Var6.g(false, true);
                                        xb0Var6.k(true);
                                        break;
                                    } else if (ob0Var3.v - ob0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                        MessageObject c12 = xb0Var6.c(null);
                                        if (c12 != null) {
                                            if (!ob0Var3.y()) {
                                                messagePreviewParams6.quoteStart = 0;
                                                int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                                messagePreviewParams6.quoteEnd = min;
                                                messagePreviewParams6.quote = org.telegram.ui.pn.b(messagePreviewParams6.quoteStart, min, c12);
                                                View d10 = xb0Var6.d();
                                                if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                    ob0Var3.a0((org.telegram.ui.Cells.u1) d10, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                                }
                                                if (!z132) {
                                                    xb0Var6.s.getSwipeBack().e(xb0Var6.I);
                                                }
                                                xb0Var6.g(true, true);
                                                break;
                                            } else {
                                                messagePreviewParams6.quoteStart = ob0Var3.u;
                                                messagePreviewParams6.quoteEnd = ob0Var3.v;
                                                org.telegram.ui.Cells.z9 z9Var2 = ob0Var3.W;
                                                messagePreviewParams6.quote = org.telegram.ui.pn.b(messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd, xb0Var6.c(z9Var2 != null ? ((org.telegram.ui.Cells.u1) z9Var2).getMessageObject() : null));
                                                dc0Var3.b();
                                                dc0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        xb0Var6.f();
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
                                    dc0 dc0Var4 = this.b.c0;
                                    if (!dc0Var4.b) {
                                        org.telegram.ui.fl flVar = (org.telegram.ui.fl) dc0Var4;
                                        flVar.a(true);
                                        org.telegram.ui.zn znVar = flVar.H;
                                        znVar.n5 = null;
                                        znVar.l5 = null;
                                        znVar.f5.updateReply(null, null, znVar.T5, null);
                                        znVar.j8();
                                        break;
                                    } else {
                                        org.telegram.ui.fl flVar2 = (org.telegram.ui.fl) dc0Var4;
                                        flVar2.a(true);
                                        org.telegram.ui.zn znVar2 = flVar2.H;
                                        znVar2.l5 = null;
                                        znVar2.Bb(znVar2.n5);
                                        break;
                                    }
                                case 7:
                                    this.b.c0.c(true);
                                    break;
                                case 8:
                                    this.b.c0.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.fl flVar3 = (org.telegram.ui.fl) this.b.c0;
                                    flVar3.a(true);
                                    org.telegram.ui.zn znVar3 = flVar3.H;
                                    znVar3.f5.updateForward(null, znVar3.T5);
                                    znVar3.j8();
                                    break;
                                case 10:
                                    this.b.c0.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.fl flVar4 = (org.telegram.ui.fl) this.b.c0;
                                    flVar4.a(true);
                                    org.telegram.ui.zn znVar4 = flVar4.H;
                                    znVar4.G5 = null;
                                    org.telegram.ui.lk lkVar = znVar4.Y;
                                    if (lkVar != null) {
                                        lkVar.W2 = null;
                                        lkVar.X2 = false;
                                    }
                                    MessagePreviewParams messagePreviewParams7 = znVar4.f5;
                                    if (messagePreviewParams7 != null) {
                                        i162 = ((org.telegram.ui.ActionBar.n2) znVar4).currentAccount;
                                        MessageObject messageObject = znVar4.n5;
                                        messagePreviewParams7.updateLink(i162, null, null, messageObject == znVar4.X3 ? null : messageObject, znVar4.l5, znVar4.p5);
                                    }
                                    znVar4.j8();
                                    break;
                                case 12:
                                    xb0 xb0Var7 = this.b;
                                    MessagePreviewParams messagePreviewParams8 = xb0Var7.c0.d;
                                    if (messagePreviewParams8.hasMedia) {
                                        boolean z14 = !messagePreviewParams8.webpageSmall;
                                        messagePreviewParams8.webpageSmall = z14;
                                        xb0Var7.G.a(z14, true);
                                        xb0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                        if (xb0Var7.r.messages.size() > 0 && (message2 = xb0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z15 = messagePreviewParams8.webpageSmall;
                                            messageMedia2.force_small_media = z15;
                                            messageMedia2.force_large_media = !z15;
                                        }
                                        if (xb0Var7.r.previewMessages.size() > 0 && (message = xb0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                            boolean z16 = messagePreviewParams8.webpageSmall;
                                            messageMedia.force_small_media = z16;
                                            messageMedia.force_large_media = !z16;
                                        }
                                        xb0Var7.h();
                                        xb0Var7.U = true;
                                        break;
                                    }
                                    break;
                                default:
                                    xb0 xb0Var8 = this.b;
                                    MessagePreviewParams messagePreviewParams9 = xb0Var8.c0.d;
                                    boolean z17 = messagePreviewParams9.webpageTop;
                                    messagePreviewParams9.webpageTop = !z17;
                                    xb0Var8.E.a(z17, true);
                                    if (xb0Var8.r.messages.size() > 0 && (message4 = xb0Var8.r.messages.get(0).messageOwner) != null) {
                                        message4.invert_media = messagePreviewParams9.webpageTop;
                                    }
                                    if (xb0Var8.r.previewMessages.size() > 0 && (message3 = xb0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                        message3.invert_media = messagePreviewParams9.webpageTop;
                                    }
                                    xb0Var8.h();
                                    xb0Var8.U = true;
                                    break;
                            }
                        }
                    });
                    r92.addView(f1Var7, w7.y5.n(-1, 48));
                    linearLayout = r92;
                }
                this.I = actionBarPopupWindow$ActionBarPopupWindowLayout.b(linearLayout);
                actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().setStickToRight(z11);
                FrameLayout frameLayout2 = new FrameLayout(context3);
                messagePreviewParams2 = messagePreviewParams3;
                nb0 nb0Var = new nb0(1, 0, context, dc0Var.F, true, false);
                this.v = nb0Var;
                nb0Var.g(LocaleController.getString(z12 ? R.string.QuoteSelectedPart : R.string.SelectSpecificQuote), R.drawable.menu_select_quote, drawable);
                nb0 nb0Var2 = new nb0(1, 1, context, dc0Var.F, true, false);
                context3 = context;
                this.w = nb0Var2;
                nb0Var2.g(LocaleController.getString(R.string.ClearQuote), R.drawable.menu_quote_delete, drawable);
                frameLayout2.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.I5, zb0Var), 6, 0));
                final int i25 = 2;
                frameLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fb0
                    public final /* synthetic */ xb0 b;

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
                                xb0 xb0Var42 = this.b;
                                xb0Var42.c0.d.quote = null;
                                xb0Var42.e.f(false);
                                xb0Var42.g(false, false);
                                xb0Var42.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                xb0 xb0Var5 = this.b;
                                ob0 ob0Var2 = xb0Var5.e;
                                dc0 dc0Var2 = xb0Var5.c0;
                                if (xb0Var5.c(null) != null) {
                                    if (ob0Var2.v - ob0Var2.u <= MessagesController.getInstance(dc0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.z9 z9Var = ob0Var2.W;
                                        MessageObject c11 = xb0Var5.c(z9Var != null ? ((org.telegram.ui.Cells.u1) z9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams5 = dc0Var2.d;
                                        int i172 = ob0Var2.u;
                                        messagePreviewParams5.quoteStart = i172;
                                        int i182 = ob0Var2.v;
                                        messagePreviewParams5.quoteEnd = i182;
                                        messagePreviewParams5.quote = org.telegram.ui.pn.b(i172, i182, c11);
                                        dc0Var2.b();
                                        dc0Var2.a(true);
                                        break;
                                    } else {
                                        xb0Var5.f();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                xb0 xb0Var6 = this.b;
                                ob0 ob0Var3 = xb0Var6.e;
                                dc0 dc0Var3 = xb0Var6.c0;
                                MessagePreviewParams messagePreviewParams6 = dc0Var3.d;
                                int i192 = dc0Var3.w;
                                boolean z132 = dc0Var3.b;
                                if (messagePreviewParams6.quote != null && !z132) {
                                    messagePreviewParams6.quote = null;
                                    ob0Var3.f(false);
                                    xb0Var6.g(false, true);
                                    xb0Var6.k(true);
                                    break;
                                } else if (ob0Var3.v - ob0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                    MessageObject c12 = xb0Var6.c(null);
                                    if (c12 != null) {
                                        if (!ob0Var3.y()) {
                                            messagePreviewParams6.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                            messagePreviewParams6.quoteEnd = min;
                                            messagePreviewParams6.quote = org.telegram.ui.pn.b(messagePreviewParams6.quoteStart, min, c12);
                                            View d10 = xb0Var6.d();
                                            if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                ob0Var3.a0((org.telegram.ui.Cells.u1) d10, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                            }
                                            if (!z132) {
                                                xb0Var6.s.getSwipeBack().e(xb0Var6.I);
                                            }
                                            xb0Var6.g(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams6.quoteStart = ob0Var3.u;
                                            messagePreviewParams6.quoteEnd = ob0Var3.v;
                                            org.telegram.ui.Cells.z9 z9Var2 = ob0Var3.W;
                                            messagePreviewParams6.quote = org.telegram.ui.pn.b(messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd, xb0Var6.c(z9Var2 != null ? ((org.telegram.ui.Cells.u1) z9Var2).getMessageObject() : null));
                                            dc0Var3.b();
                                            dc0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    xb0Var6.f();
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
                                dc0 dc0Var4 = this.b.c0;
                                if (!dc0Var4.b) {
                                    org.telegram.ui.fl flVar = (org.telegram.ui.fl) dc0Var4;
                                    flVar.a(true);
                                    org.telegram.ui.zn znVar = flVar.H;
                                    znVar.n5 = null;
                                    znVar.l5 = null;
                                    znVar.f5.updateReply(null, null, znVar.T5, null);
                                    znVar.j8();
                                    break;
                                } else {
                                    org.telegram.ui.fl flVar2 = (org.telegram.ui.fl) dc0Var4;
                                    flVar2.a(true);
                                    org.telegram.ui.zn znVar2 = flVar2.H;
                                    znVar2.l5 = null;
                                    znVar2.Bb(znVar2.n5);
                                    break;
                                }
                            case 7:
                                this.b.c0.c(true);
                                break;
                            case 8:
                                this.b.c0.a(true);
                                break;
                            case 9:
                                org.telegram.ui.fl flVar3 = (org.telegram.ui.fl) this.b.c0;
                                flVar3.a(true);
                                org.telegram.ui.zn znVar3 = flVar3.H;
                                znVar3.f5.updateForward(null, znVar3.T5);
                                znVar3.j8();
                                break;
                            case 10:
                                this.b.c0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.fl flVar4 = (org.telegram.ui.fl) this.b.c0;
                                flVar4.a(true);
                                org.telegram.ui.zn znVar4 = flVar4.H;
                                znVar4.G5 = null;
                                org.telegram.ui.lk lkVar = znVar4.Y;
                                if (lkVar != null) {
                                    lkVar.W2 = null;
                                    lkVar.X2 = false;
                                }
                                MessagePreviewParams messagePreviewParams7 = znVar4.f5;
                                if (messagePreviewParams7 != null) {
                                    i162 = ((org.telegram.ui.ActionBar.n2) znVar4).currentAccount;
                                    MessageObject messageObject = znVar4.n5;
                                    messagePreviewParams7.updateLink(i162, null, null, messageObject == znVar4.X3 ? null : messageObject, znVar4.l5, znVar4.p5);
                                }
                                znVar4.j8();
                                break;
                            case 12:
                                xb0 xb0Var7 = this.b;
                                MessagePreviewParams messagePreviewParams8 = xb0Var7.c0.d;
                                if (messagePreviewParams8.hasMedia) {
                                    boolean z14 = !messagePreviewParams8.webpageSmall;
                                    messagePreviewParams8.webpageSmall = z14;
                                    xb0Var7.G.a(z14, true);
                                    xb0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                    if (xb0Var7.r.messages.size() > 0 && (message2 = xb0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z15 = messagePreviewParams8.webpageSmall;
                                        messageMedia2.force_small_media = z15;
                                        messageMedia2.force_large_media = !z15;
                                    }
                                    if (xb0Var7.r.previewMessages.size() > 0 && (message = xb0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z16 = messagePreviewParams8.webpageSmall;
                                        messageMedia.force_small_media = z16;
                                        messageMedia.force_large_media = !z16;
                                    }
                                    xb0Var7.h();
                                    xb0Var7.U = true;
                                    break;
                                }
                                break;
                            default:
                                xb0 xb0Var8 = this.b;
                                MessagePreviewParams messagePreviewParams9 = xb0Var8.c0.d;
                                boolean z17 = messagePreviewParams9.webpageTop;
                                messagePreviewParams9.webpageTop = !z17;
                                xb0Var8.E.a(z17, true);
                                if (xb0Var8.r.messages.size() > 0 && (message4 = xb0Var8.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams9.webpageTop;
                                }
                                if (xb0Var8.r.previewMessages.size() > 0 && (message3 = xb0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams9.webpageTop;
                                }
                                xb0Var8.h();
                                xb0Var8.U = true;
                                break;
                        }
                    }
                });
                frameLayout2.addView(nb0Var, w7.y5.c(48.0f, -1));
                frameLayout2.addView(nb0Var2, w7.y5.c(48.0f, -1));
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout2, w7.y5.n(-1, 48));
                r11 = drawable;
            }
            messagePreviewParams = messagePreviewParams2;
            if (!messagePreviewParams.monoforum && !messagePreviewParams.noforwards && !messagePreviewParams.hasSecretMessages) {
                ?? frameLayout3 = new FrameLayout(context3);
                ?? f1Var8 = new org.telegram.ui.ActionBar.f1(1, context3, dc0Var.F, false, false);
                this.x = f1Var8;
                f1Var8.g(LocaleController.getString(R.string.ReplyToAnotherChat), R.drawable.msg_forward_replace, r11);
                final int i26 = 3;
                f1Var8.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fb0
                    public final /* synthetic */ xb0 b;

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
                                xb0 xb0Var42 = this.b;
                                xb0Var42.c0.d.quote = null;
                                xb0Var42.e.f(false);
                                xb0Var42.g(false, false);
                                xb0Var42.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                xb0 xb0Var5 = this.b;
                                ob0 ob0Var2 = xb0Var5.e;
                                dc0 dc0Var2 = xb0Var5.c0;
                                if (xb0Var5.c(null) != null) {
                                    if (ob0Var2.v - ob0Var2.u <= MessagesController.getInstance(dc0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.z9 z9Var = ob0Var2.W;
                                        MessageObject c11 = xb0Var5.c(z9Var != null ? ((org.telegram.ui.Cells.u1) z9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams5 = dc0Var2.d;
                                        int i172 = ob0Var2.u;
                                        messagePreviewParams5.quoteStart = i172;
                                        int i182 = ob0Var2.v;
                                        messagePreviewParams5.quoteEnd = i182;
                                        messagePreviewParams5.quote = org.telegram.ui.pn.b(i172, i182, c11);
                                        dc0Var2.b();
                                        dc0Var2.a(true);
                                        break;
                                    } else {
                                        xb0Var5.f();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                xb0 xb0Var6 = this.b;
                                ob0 ob0Var3 = xb0Var6.e;
                                dc0 dc0Var3 = xb0Var6.c0;
                                MessagePreviewParams messagePreviewParams6 = dc0Var3.d;
                                int i192 = dc0Var3.w;
                                boolean z132 = dc0Var3.b;
                                if (messagePreviewParams6.quote != null && !z132) {
                                    messagePreviewParams6.quote = null;
                                    ob0Var3.f(false);
                                    xb0Var6.g(false, true);
                                    xb0Var6.k(true);
                                    break;
                                } else if (ob0Var3.v - ob0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                    MessageObject c12 = xb0Var6.c(null);
                                    if (c12 != null) {
                                        if (!ob0Var3.y()) {
                                            messagePreviewParams6.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                            messagePreviewParams6.quoteEnd = min;
                                            messagePreviewParams6.quote = org.telegram.ui.pn.b(messagePreviewParams6.quoteStart, min, c12);
                                            View d10 = xb0Var6.d();
                                            if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                ob0Var3.a0((org.telegram.ui.Cells.u1) d10, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                            }
                                            if (!z132) {
                                                xb0Var6.s.getSwipeBack().e(xb0Var6.I);
                                            }
                                            xb0Var6.g(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams6.quoteStart = ob0Var3.u;
                                            messagePreviewParams6.quoteEnd = ob0Var3.v;
                                            org.telegram.ui.Cells.z9 z9Var2 = ob0Var3.W;
                                            messagePreviewParams6.quote = org.telegram.ui.pn.b(messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd, xb0Var6.c(z9Var2 != null ? ((org.telegram.ui.Cells.u1) z9Var2).getMessageObject() : null));
                                            dc0Var3.b();
                                            dc0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    xb0Var6.f();
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
                                dc0 dc0Var4 = this.b.c0;
                                if (!dc0Var4.b) {
                                    org.telegram.ui.fl flVar = (org.telegram.ui.fl) dc0Var4;
                                    flVar.a(true);
                                    org.telegram.ui.zn znVar = flVar.H;
                                    znVar.n5 = null;
                                    znVar.l5 = null;
                                    znVar.f5.updateReply(null, null, znVar.T5, null);
                                    znVar.j8();
                                    break;
                                } else {
                                    org.telegram.ui.fl flVar2 = (org.telegram.ui.fl) dc0Var4;
                                    flVar2.a(true);
                                    org.telegram.ui.zn znVar2 = flVar2.H;
                                    znVar2.l5 = null;
                                    znVar2.Bb(znVar2.n5);
                                    break;
                                }
                            case 7:
                                this.b.c0.c(true);
                                break;
                            case 8:
                                this.b.c0.a(true);
                                break;
                            case 9:
                                org.telegram.ui.fl flVar3 = (org.telegram.ui.fl) this.b.c0;
                                flVar3.a(true);
                                org.telegram.ui.zn znVar3 = flVar3.H;
                                znVar3.f5.updateForward(null, znVar3.T5);
                                znVar3.j8();
                                break;
                            case 10:
                                this.b.c0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.fl flVar4 = (org.telegram.ui.fl) this.b.c0;
                                flVar4.a(true);
                                org.telegram.ui.zn znVar4 = flVar4.H;
                                znVar4.G5 = null;
                                org.telegram.ui.lk lkVar = znVar4.Y;
                                if (lkVar != null) {
                                    lkVar.W2 = null;
                                    lkVar.X2 = false;
                                }
                                MessagePreviewParams messagePreviewParams7 = znVar4.f5;
                                if (messagePreviewParams7 != null) {
                                    i162 = ((org.telegram.ui.ActionBar.n2) znVar4).currentAccount;
                                    MessageObject messageObject = znVar4.n5;
                                    messagePreviewParams7.updateLink(i162, null, null, messageObject == znVar4.X3 ? null : messageObject, znVar4.l5, znVar4.p5);
                                }
                                znVar4.j8();
                                break;
                            case 12:
                                xb0 xb0Var7 = this.b;
                                MessagePreviewParams messagePreviewParams8 = xb0Var7.c0.d;
                                if (messagePreviewParams8.hasMedia) {
                                    boolean z14 = !messagePreviewParams8.webpageSmall;
                                    messagePreviewParams8.webpageSmall = z14;
                                    xb0Var7.G.a(z14, true);
                                    xb0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                    if (xb0Var7.r.messages.size() > 0 && (message2 = xb0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z15 = messagePreviewParams8.webpageSmall;
                                        messageMedia2.force_small_media = z15;
                                        messageMedia2.force_large_media = !z15;
                                    }
                                    if (xb0Var7.r.previewMessages.size() > 0 && (message = xb0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z16 = messagePreviewParams8.webpageSmall;
                                        messageMedia.force_small_media = z16;
                                        messageMedia.force_large_media = !z16;
                                    }
                                    xb0Var7.h();
                                    xb0Var7.U = true;
                                    break;
                                }
                                break;
                            default:
                                xb0 xb0Var8 = this.b;
                                MessagePreviewParams messagePreviewParams9 = xb0Var8.c0.d;
                                boolean z17 = messagePreviewParams9.webpageTop;
                                messagePreviewParams9.webpageTop = !z17;
                                xb0Var8.E.a(z17, true);
                                if (xb0Var8.r.messages.size() > 0 && (message4 = xb0Var8.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams9.webpageTop;
                                }
                                if (xb0Var8.r.previewMessages.size() > 0 && (message3 = xb0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams9.webpageTop;
                                }
                                xb0Var8.h();
                                xb0Var8.U = true;
                                break;
                        }
                    }
                });
                context3 = context;
                ?? f1Var9 = new org.telegram.ui.ActionBar.f1(1, context3, dc0Var.F, false, false);
                this.y = f1Var9;
                f1Var9.g(LocaleController.getString(R.string.QuoteToAnotherChat), R.drawable.msg_forward_replace, r11);
                final int i27 = 4;
                f1Var9.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fb0
                    public final /* synthetic */ xb0 b;

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
                                xb0 xb0Var42 = this.b;
                                xb0Var42.c0.d.quote = null;
                                xb0Var42.e.f(false);
                                xb0Var42.g(false, false);
                                xb0Var42.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                xb0 xb0Var5 = this.b;
                                ob0 ob0Var2 = xb0Var5.e;
                                dc0 dc0Var2 = xb0Var5.c0;
                                if (xb0Var5.c(null) != null) {
                                    if (ob0Var2.v - ob0Var2.u <= MessagesController.getInstance(dc0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.z9 z9Var = ob0Var2.W;
                                        MessageObject c11 = xb0Var5.c(z9Var != null ? ((org.telegram.ui.Cells.u1) z9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams5 = dc0Var2.d;
                                        int i172 = ob0Var2.u;
                                        messagePreviewParams5.quoteStart = i172;
                                        int i182 = ob0Var2.v;
                                        messagePreviewParams5.quoteEnd = i182;
                                        messagePreviewParams5.quote = org.telegram.ui.pn.b(i172, i182, c11);
                                        dc0Var2.b();
                                        dc0Var2.a(true);
                                        break;
                                    } else {
                                        xb0Var5.f();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                xb0 xb0Var6 = this.b;
                                ob0 ob0Var3 = xb0Var6.e;
                                dc0 dc0Var3 = xb0Var6.c0;
                                MessagePreviewParams messagePreviewParams6 = dc0Var3.d;
                                int i192 = dc0Var3.w;
                                boolean z132 = dc0Var3.b;
                                if (messagePreviewParams6.quote != null && !z132) {
                                    messagePreviewParams6.quote = null;
                                    ob0Var3.f(false);
                                    xb0Var6.g(false, true);
                                    xb0Var6.k(true);
                                    break;
                                } else if (ob0Var3.v - ob0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                    MessageObject c12 = xb0Var6.c(null);
                                    if (c12 != null) {
                                        if (!ob0Var3.y()) {
                                            messagePreviewParams6.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                            messagePreviewParams6.quoteEnd = min;
                                            messagePreviewParams6.quote = org.telegram.ui.pn.b(messagePreviewParams6.quoteStart, min, c12);
                                            View d10 = xb0Var6.d();
                                            if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                ob0Var3.a0((org.telegram.ui.Cells.u1) d10, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                            }
                                            if (!z132) {
                                                xb0Var6.s.getSwipeBack().e(xb0Var6.I);
                                            }
                                            xb0Var6.g(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams6.quoteStart = ob0Var3.u;
                                            messagePreviewParams6.quoteEnd = ob0Var3.v;
                                            org.telegram.ui.Cells.z9 z9Var2 = ob0Var3.W;
                                            messagePreviewParams6.quote = org.telegram.ui.pn.b(messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd, xb0Var6.c(z9Var2 != null ? ((org.telegram.ui.Cells.u1) z9Var2).getMessageObject() : null));
                                            dc0Var3.b();
                                            dc0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    xb0Var6.f();
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
                                dc0 dc0Var4 = this.b.c0;
                                if (!dc0Var4.b) {
                                    org.telegram.ui.fl flVar = (org.telegram.ui.fl) dc0Var4;
                                    flVar.a(true);
                                    org.telegram.ui.zn znVar = flVar.H;
                                    znVar.n5 = null;
                                    znVar.l5 = null;
                                    znVar.f5.updateReply(null, null, znVar.T5, null);
                                    znVar.j8();
                                    break;
                                } else {
                                    org.telegram.ui.fl flVar2 = (org.telegram.ui.fl) dc0Var4;
                                    flVar2.a(true);
                                    org.telegram.ui.zn znVar2 = flVar2.H;
                                    znVar2.l5 = null;
                                    znVar2.Bb(znVar2.n5);
                                    break;
                                }
                            case 7:
                                this.b.c0.c(true);
                                break;
                            case 8:
                                this.b.c0.a(true);
                                break;
                            case 9:
                                org.telegram.ui.fl flVar3 = (org.telegram.ui.fl) this.b.c0;
                                flVar3.a(true);
                                org.telegram.ui.zn znVar3 = flVar3.H;
                                znVar3.f5.updateForward(null, znVar3.T5);
                                znVar3.j8();
                                break;
                            case 10:
                                this.b.c0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.fl flVar4 = (org.telegram.ui.fl) this.b.c0;
                                flVar4.a(true);
                                org.telegram.ui.zn znVar4 = flVar4.H;
                                znVar4.G5 = null;
                                org.telegram.ui.lk lkVar = znVar4.Y;
                                if (lkVar != null) {
                                    lkVar.W2 = null;
                                    lkVar.X2 = false;
                                }
                                MessagePreviewParams messagePreviewParams7 = znVar4.f5;
                                if (messagePreviewParams7 != null) {
                                    i162 = ((org.telegram.ui.ActionBar.n2) znVar4).currentAccount;
                                    MessageObject messageObject = znVar4.n5;
                                    messagePreviewParams7.updateLink(i162, null, null, messageObject == znVar4.X3 ? null : messageObject, znVar4.l5, znVar4.p5);
                                }
                                znVar4.j8();
                                break;
                            case 12:
                                xb0 xb0Var7 = this.b;
                                MessagePreviewParams messagePreviewParams8 = xb0Var7.c0.d;
                                if (messagePreviewParams8.hasMedia) {
                                    boolean z14 = !messagePreviewParams8.webpageSmall;
                                    messagePreviewParams8.webpageSmall = z14;
                                    xb0Var7.G.a(z14, true);
                                    xb0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                    if (xb0Var7.r.messages.size() > 0 && (message2 = xb0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z15 = messagePreviewParams8.webpageSmall;
                                        messageMedia2.force_small_media = z15;
                                        messageMedia2.force_large_media = !z15;
                                    }
                                    if (xb0Var7.r.previewMessages.size() > 0 && (message = xb0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z16 = messagePreviewParams8.webpageSmall;
                                        messageMedia.force_small_media = z16;
                                        messageMedia.force_large_media = !z16;
                                    }
                                    xb0Var7.h();
                                    xb0Var7.U = true;
                                    break;
                                }
                                break;
                            default:
                                xb0 xb0Var8 = this.b;
                                MessagePreviewParams messagePreviewParams9 = xb0Var8.c0.d;
                                boolean z17 = messagePreviewParams9.webpageTop;
                                messagePreviewParams9.webpageTop = !z17;
                                xb0Var8.E.a(z17, true);
                                if (xb0Var8.r.messages.size() > 0 && (message4 = xb0Var8.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams9.webpageTop;
                                }
                                if (xb0Var8.r.previewMessages.size() > 0 && (message3 = xb0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams9.webpageTop;
                                }
                                xb0Var8.h();
                                xb0Var8.U = true;
                                break;
                        }
                    }
                });
                frameLayout3.addView(f1Var9, w7.y5.c(48.0f, -1));
                frameLayout3.addView(f1Var8, w7.y5.c(48.0f, -1));
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout3, w7.y5.n(-1, 48));
            }
            if (!messagePreviewParams.noforwards && !messagePreviewParams.hasSecretMessages) {
                org.telegram.ui.ActionBar.k1 k1Var4 = new org.telegram.ui.ActionBar.k1(context3, zb0Var);
                k1Var4.setColor(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, zb0Var)));
                k1Var4.setTag(R.id.fit_width_tag, 1);
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(k1Var4, w7.y5.n(-1, 8));
            }
            g(messagePreviewParams.quote != null, false);
            ?? f1Var10 = new org.telegram.ui.ActionBar.f1(1, context3, dc0Var.F, false, false);
            f1Var10.g(LocaleController.getString(R.string.ApplyChanges), R.drawable.msg_select, r11);
            final int i28 = 5;
            f1Var10.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fb0
                public final /* synthetic */ xb0 b;

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
                            xb0 xb0Var42 = this.b;
                            xb0Var42.c0.d.quote = null;
                            xb0Var42.e.f(false);
                            xb0Var42.g(false, false);
                            xb0Var42.s.getSwipeBack().b(true);
                            break;
                        case 1:
                            xb0 xb0Var5 = this.b;
                            ob0 ob0Var2 = xb0Var5.e;
                            dc0 dc0Var2 = xb0Var5.c0;
                            if (xb0Var5.c(null) != null) {
                                if (ob0Var2.v - ob0Var2.u <= MessagesController.getInstance(dc0Var2.w).quoteLengthMax) {
                                    org.telegram.ui.Cells.z9 z9Var = ob0Var2.W;
                                    MessageObject c11 = xb0Var5.c(z9Var != null ? ((org.telegram.ui.Cells.u1) z9Var).getMessageObject() : null);
                                    MessagePreviewParams messagePreviewParams5 = dc0Var2.d;
                                    int i172 = ob0Var2.u;
                                    messagePreviewParams5.quoteStart = i172;
                                    int i182 = ob0Var2.v;
                                    messagePreviewParams5.quoteEnd = i182;
                                    messagePreviewParams5.quote = org.telegram.ui.pn.b(i172, i182, c11);
                                    dc0Var2.b();
                                    dc0Var2.a(true);
                                    break;
                                } else {
                                    xb0Var5.f();
                                    break;
                                }
                            }
                            break;
                        case 2:
                            xb0 xb0Var6 = this.b;
                            ob0 ob0Var3 = xb0Var6.e;
                            dc0 dc0Var3 = xb0Var6.c0;
                            MessagePreviewParams messagePreviewParams6 = dc0Var3.d;
                            int i192 = dc0Var3.w;
                            boolean z132 = dc0Var3.b;
                            if (messagePreviewParams6.quote != null && !z132) {
                                messagePreviewParams6.quote = null;
                                ob0Var3.f(false);
                                xb0Var6.g(false, true);
                                xb0Var6.k(true);
                                break;
                            } else if (ob0Var3.v - ob0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                MessageObject c12 = xb0Var6.c(null);
                                if (c12 != null) {
                                    if (!ob0Var3.y()) {
                                        messagePreviewParams6.quoteStart = 0;
                                        int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                        messagePreviewParams6.quoteEnd = min;
                                        messagePreviewParams6.quote = org.telegram.ui.pn.b(messagePreviewParams6.quoteStart, min, c12);
                                        View d10 = xb0Var6.d();
                                        if (d10 instanceof org.telegram.ui.Cells.u1) {
                                            ob0Var3.a0((org.telegram.ui.Cells.u1) d10, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                        }
                                        if (!z132) {
                                            xb0Var6.s.getSwipeBack().e(xb0Var6.I);
                                        }
                                        xb0Var6.g(true, true);
                                        break;
                                    } else {
                                        messagePreviewParams6.quoteStart = ob0Var3.u;
                                        messagePreviewParams6.quoteEnd = ob0Var3.v;
                                        org.telegram.ui.Cells.z9 z9Var2 = ob0Var3.W;
                                        messagePreviewParams6.quote = org.telegram.ui.pn.b(messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd, xb0Var6.c(z9Var2 != null ? ((org.telegram.ui.Cells.u1) z9Var2).getMessageObject() : null));
                                        dc0Var3.b();
                                        dc0Var3.a(true);
                                        break;
                                    }
                                }
                            } else {
                                xb0Var6.f();
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
                            dc0 dc0Var4 = this.b.c0;
                            if (!dc0Var4.b) {
                                org.telegram.ui.fl flVar = (org.telegram.ui.fl) dc0Var4;
                                flVar.a(true);
                                org.telegram.ui.zn znVar = flVar.H;
                                znVar.n5 = null;
                                znVar.l5 = null;
                                znVar.f5.updateReply(null, null, znVar.T5, null);
                                znVar.j8();
                                break;
                            } else {
                                org.telegram.ui.fl flVar2 = (org.telegram.ui.fl) dc0Var4;
                                flVar2.a(true);
                                org.telegram.ui.zn znVar2 = flVar2.H;
                                znVar2.l5 = null;
                                znVar2.Bb(znVar2.n5);
                                break;
                            }
                        case 7:
                            this.b.c0.c(true);
                            break;
                        case 8:
                            this.b.c0.a(true);
                            break;
                        case 9:
                            org.telegram.ui.fl flVar3 = (org.telegram.ui.fl) this.b.c0;
                            flVar3.a(true);
                            org.telegram.ui.zn znVar3 = flVar3.H;
                            znVar3.f5.updateForward(null, znVar3.T5);
                            znVar3.j8();
                            break;
                        case 10:
                            this.b.c0.a(true);
                            break;
                        case 11:
                            org.telegram.ui.fl flVar4 = (org.telegram.ui.fl) this.b.c0;
                            flVar4.a(true);
                            org.telegram.ui.zn znVar4 = flVar4.H;
                            znVar4.G5 = null;
                            org.telegram.ui.lk lkVar = znVar4.Y;
                            if (lkVar != null) {
                                lkVar.W2 = null;
                                lkVar.X2 = false;
                            }
                            MessagePreviewParams messagePreviewParams7 = znVar4.f5;
                            if (messagePreviewParams7 != null) {
                                i162 = ((org.telegram.ui.ActionBar.n2) znVar4).currentAccount;
                                MessageObject messageObject = znVar4.n5;
                                messagePreviewParams7.updateLink(i162, null, null, messageObject == znVar4.X3 ? null : messageObject, znVar4.l5, znVar4.p5);
                            }
                            znVar4.j8();
                            break;
                        case 12:
                            xb0 xb0Var7 = this.b;
                            MessagePreviewParams messagePreviewParams8 = xb0Var7.c0.d;
                            if (messagePreviewParams8.hasMedia) {
                                boolean z14 = !messagePreviewParams8.webpageSmall;
                                messagePreviewParams8.webpageSmall = z14;
                                xb0Var7.G.a(z14, true);
                                xb0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                if (xb0Var7.r.messages.size() > 0 && (message2 = xb0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                    boolean z15 = messagePreviewParams8.webpageSmall;
                                    messageMedia2.force_small_media = z15;
                                    messageMedia2.force_large_media = !z15;
                                }
                                if (xb0Var7.r.previewMessages.size() > 0 && (message = xb0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                    boolean z16 = messagePreviewParams8.webpageSmall;
                                    messageMedia.force_small_media = z16;
                                    messageMedia.force_large_media = !z16;
                                }
                                xb0Var7.h();
                                xb0Var7.U = true;
                                break;
                            }
                            break;
                        default:
                            xb0 xb0Var8 = this.b;
                            MessagePreviewParams messagePreviewParams9 = xb0Var8.c0.d;
                            boolean z17 = messagePreviewParams9.webpageTop;
                            messagePreviewParams9.webpageTop = !z17;
                            xb0Var8.E.a(z17, true);
                            if (xb0Var8.r.messages.size() > 0 && (message4 = xb0Var8.r.messages.get(0).messageOwner) != null) {
                                message4.invert_media = messagePreviewParams9.webpageTop;
                            }
                            if (xb0Var8.r.previewMessages.size() > 0 && (message3 = xb0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                message3.invert_media = messagePreviewParams9.webpageTop;
                            }
                            xb0Var8.h();
                            xb0Var8.U = true;
                            break;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(f1Var10, w7.y5.n(-1, 48));
            ?? f1Var11 = new org.telegram.ui.ActionBar.f1(1, context, dc0Var.F, false, true);
            f1Var11.g(LocaleController.getString(z12 ? R.string.DoNotQuote : R.string.DoNotReply), R.drawable.msg_delete, r11);
            int v04 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q7, zb0Var);
            int i29 = org.telegram.ui.ActionBar.j6.p7;
            f1Var11.c(v04, org.telegram.ui.ActionBar.j6.v0(i29, zb0Var));
            f1Var11.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.w0(r11, i29, false)));
            final int i30 = 6;
            f1Var11.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fb0
                public final /* synthetic */ xb0 b;

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
                            xb0 xb0Var42 = this.b;
                            xb0Var42.c0.d.quote = null;
                            xb0Var42.e.f(false);
                            xb0Var42.g(false, false);
                            xb0Var42.s.getSwipeBack().b(true);
                            break;
                        case 1:
                            xb0 xb0Var5 = this.b;
                            ob0 ob0Var2 = xb0Var5.e;
                            dc0 dc0Var2 = xb0Var5.c0;
                            if (xb0Var5.c(null) != null) {
                                if (ob0Var2.v - ob0Var2.u <= MessagesController.getInstance(dc0Var2.w).quoteLengthMax) {
                                    org.telegram.ui.Cells.z9 z9Var = ob0Var2.W;
                                    MessageObject c11 = xb0Var5.c(z9Var != null ? ((org.telegram.ui.Cells.u1) z9Var).getMessageObject() : null);
                                    MessagePreviewParams messagePreviewParams5 = dc0Var2.d;
                                    int i172 = ob0Var2.u;
                                    messagePreviewParams5.quoteStart = i172;
                                    int i182 = ob0Var2.v;
                                    messagePreviewParams5.quoteEnd = i182;
                                    messagePreviewParams5.quote = org.telegram.ui.pn.b(i172, i182, c11);
                                    dc0Var2.b();
                                    dc0Var2.a(true);
                                    break;
                                } else {
                                    xb0Var5.f();
                                    break;
                                }
                            }
                            break;
                        case 2:
                            xb0 xb0Var6 = this.b;
                            ob0 ob0Var3 = xb0Var6.e;
                            dc0 dc0Var3 = xb0Var6.c0;
                            MessagePreviewParams messagePreviewParams6 = dc0Var3.d;
                            int i192 = dc0Var3.w;
                            boolean z132 = dc0Var3.b;
                            if (messagePreviewParams6.quote != null && !z132) {
                                messagePreviewParams6.quote = null;
                                ob0Var3.f(false);
                                xb0Var6.g(false, true);
                                xb0Var6.k(true);
                                break;
                            } else if (ob0Var3.v - ob0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                MessageObject c12 = xb0Var6.c(null);
                                if (c12 != null) {
                                    if (!ob0Var3.y()) {
                                        messagePreviewParams6.quoteStart = 0;
                                        int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                        messagePreviewParams6.quoteEnd = min;
                                        messagePreviewParams6.quote = org.telegram.ui.pn.b(messagePreviewParams6.quoteStart, min, c12);
                                        View d10 = xb0Var6.d();
                                        if (d10 instanceof org.telegram.ui.Cells.u1) {
                                            ob0Var3.a0((org.telegram.ui.Cells.u1) d10, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                        }
                                        if (!z132) {
                                            xb0Var6.s.getSwipeBack().e(xb0Var6.I);
                                        }
                                        xb0Var6.g(true, true);
                                        break;
                                    } else {
                                        messagePreviewParams6.quoteStart = ob0Var3.u;
                                        messagePreviewParams6.quoteEnd = ob0Var3.v;
                                        org.telegram.ui.Cells.z9 z9Var2 = ob0Var3.W;
                                        messagePreviewParams6.quote = org.telegram.ui.pn.b(messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd, xb0Var6.c(z9Var2 != null ? ((org.telegram.ui.Cells.u1) z9Var2).getMessageObject() : null));
                                        dc0Var3.b();
                                        dc0Var3.a(true);
                                        break;
                                    }
                                }
                            } else {
                                xb0Var6.f();
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
                            dc0 dc0Var4 = this.b.c0;
                            if (!dc0Var4.b) {
                                org.telegram.ui.fl flVar = (org.telegram.ui.fl) dc0Var4;
                                flVar.a(true);
                                org.telegram.ui.zn znVar = flVar.H;
                                znVar.n5 = null;
                                znVar.l5 = null;
                                znVar.f5.updateReply(null, null, znVar.T5, null);
                                znVar.j8();
                                break;
                            } else {
                                org.telegram.ui.fl flVar2 = (org.telegram.ui.fl) dc0Var4;
                                flVar2.a(true);
                                org.telegram.ui.zn znVar2 = flVar2.H;
                                znVar2.l5 = null;
                                znVar2.Bb(znVar2.n5);
                                break;
                            }
                        case 7:
                            this.b.c0.c(true);
                            break;
                        case 8:
                            this.b.c0.a(true);
                            break;
                        case 9:
                            org.telegram.ui.fl flVar3 = (org.telegram.ui.fl) this.b.c0;
                            flVar3.a(true);
                            org.telegram.ui.zn znVar3 = flVar3.H;
                            znVar3.f5.updateForward(null, znVar3.T5);
                            znVar3.j8();
                            break;
                        case 10:
                            this.b.c0.a(true);
                            break;
                        case 11:
                            org.telegram.ui.fl flVar4 = (org.telegram.ui.fl) this.b.c0;
                            flVar4.a(true);
                            org.telegram.ui.zn znVar4 = flVar4.H;
                            znVar4.G5 = null;
                            org.telegram.ui.lk lkVar = znVar4.Y;
                            if (lkVar != null) {
                                lkVar.W2 = null;
                                lkVar.X2 = false;
                            }
                            MessagePreviewParams messagePreviewParams7 = znVar4.f5;
                            if (messagePreviewParams7 != null) {
                                i162 = ((org.telegram.ui.ActionBar.n2) znVar4).currentAccount;
                                MessageObject messageObject = znVar4.n5;
                                messagePreviewParams7.updateLink(i162, null, null, messageObject == znVar4.X3 ? null : messageObject, znVar4.l5, znVar4.p5);
                            }
                            znVar4.j8();
                            break;
                        case 12:
                            xb0 xb0Var7 = this.b;
                            MessagePreviewParams messagePreviewParams8 = xb0Var7.c0.d;
                            if (messagePreviewParams8.hasMedia) {
                                boolean z14 = !messagePreviewParams8.webpageSmall;
                                messagePreviewParams8.webpageSmall = z14;
                                xb0Var7.G.a(z14, true);
                                xb0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                if (xb0Var7.r.messages.size() > 0 && (message2 = xb0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                    boolean z15 = messagePreviewParams8.webpageSmall;
                                    messageMedia2.force_small_media = z15;
                                    messageMedia2.force_large_media = !z15;
                                }
                                if (xb0Var7.r.previewMessages.size() > 0 && (message = xb0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                    boolean z16 = messagePreviewParams8.webpageSmall;
                                    messageMedia.force_small_media = z16;
                                    messageMedia.force_large_media = !z16;
                                }
                                xb0Var7.h();
                                xb0Var7.U = true;
                                break;
                            }
                            break;
                        default:
                            xb0 xb0Var8 = this.b;
                            MessagePreviewParams messagePreviewParams9 = xb0Var8.c0.d;
                            boolean z17 = messagePreviewParams9.webpageTop;
                            messagePreviewParams9.webpageTop = !z17;
                            xb0Var8.E.a(z17, true);
                            if (xb0Var8.r.messages.size() > 0 && (message4 = xb0Var8.r.messages.get(0).messageOwner) != null) {
                                message4.invert_media = messagePreviewParams9.webpageTop;
                            }
                            if (xb0Var8.r.previewMessages.size() > 0 && (message3 = xb0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                message3.invert_media = messagePreviewParams9.webpageTop;
                            }
                            xb0Var8.h();
                            xb0Var8.U = true;
                            break;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(f1Var11, w7.y5.n(-1, 48));
            context2 = context;
            xb0Var2 = this;
            viewOutlineProvider = r11;
        }
        int i31 = xb0Var2.a;
        if (i31 == 1) {
            xb0Var2.r = messagePreviewParams.forwardMessages;
        } else if (i31 == 0) {
            xb0Var2.r = messagePreviewParams.replyMessage;
        } else if (i31 == 2) {
            xb0Var2.r = messagePreviewParams.linkMessage;
        }
        org.telegram.ui.Cells.da o9 = xb0Var2.e.o(context2);
        xb0Var2.d = o9;
        o9.setElevation(AndroidUtilities.dp(8.0f));
        o9.setOutlineProvider(viewOutlineProvider);
        if (o9.getParent() instanceof ViewGroup) {
            ((ViewGroup) o9.getParent()).removeView(o9);
        }
        xb0Var2.addView(o9, w7.y5.d(-1, -1.0f, 51, 0.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / AndroidUtilities.density, 0.0f, 0.0f));
        xb0Var2.e.T(xb0Var2.f);
    }

    public static MessageObject.GroupedMessages a(xb0 xb0Var, MessageObject messageObject) {
        if (messageObject.getGroupId() == 0) {
            return null;
        }
        MessageObject.GroupedMessages groupedMessages = xb0Var.r.groupedMessagesMap.get(messageObject.getGroupId());
        if (groupedMessages == null || (groupedMessages.messages.size() > 1 && groupedMessages.getPosition(messageObject) != null)) {
            return groupedMessages;
        }
        return null;
    }

    public static void b(xb0 xb0Var, org.telegram.ui.Cells.u1 u1Var) {
        CharacterStyle characterStyle;
        TLRPC.WebPage webPage;
        if (xb0Var.a == 2) {
            MessagePreviewParams messagePreviewParams = xb0Var.c0.d;
            if (!messagePreviewParams.singleLink && (characterStyle = messagePreviewParams.currentLink) != null && (webPage = messagePreviewParams.webpage) != null && !(webPage instanceof TLRPC.TL_webPagePending)) {
                u1Var.Q3(characterStyle);
                return;
            }
        }
        u1Var.Q3(null);
    }

    public final MessageObject c(MessageObject messageObject) {
        MessageObject.GroupedMessages valueAt;
        dc0 dc0Var = this.c0;
        MessagePreviewParams.Messages messages = dc0Var.d.replyMessage;
        if (messages == null) {
            return null;
        }
        LongSparseArray<MessageObject.GroupedMessages> longSparseArray = messages.groupedMessagesMap;
        if (longSparseArray == null || longSparseArray.size() <= 0 || (valueAt = dc0Var.d.replyMessage.groupedMessagesMap.valueAt(0)) == null) {
            return dc0Var.d.replyMessage.messages.get(0);
        }
        if (valueAt.isDocuments) {
            if (messageObject != null) {
                return messageObject;
            }
            org.telegram.ui.pn pnVar = dc0Var.d.quote;
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
        MessageObject c10 = c(null);
        if (c10 != null) {
            int i10 = 0;
            while (true) {
                pb0 pb0Var = this.f;
                if (i10 >= pb0Var.getChildCount()) {
                    break;
                }
                View childAt = pb0Var.getChildAt(i10);
                org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) childAt;
                if (p4Var.getMessageObject() != null && (p4Var.getMessageObject() == c10 || p4Var.getMessageObject().getId() == c10.getId())) {
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
        ci.n6 n6Var = this.c;
        org.telegram.ui.x8 x8Var = this.b;
        if (z10) {
            n6Var.setTranslationY(0.0f);
            x8Var.invalidateOutline();
            x8Var.setTranslationY(0.0f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(0.0f);
        } else {
            n6Var.setTranslationY(i10);
            x8Var.invalidateOutline();
            x8Var.setTranslationY(f7);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((f7 + x8Var.getMeasuredHeight()) - AndroidUtilities.dp(2.0f));
        }
        float x10 = x8Var.getX();
        org.telegram.ui.Cells.da daVar = this.d;
        daVar.setTranslationX(x10);
        daVar.setTranslationY(x8Var.getY());
    }

    public final void f() {
        dc0 dc0Var = this.c0;
        new xc(dc0Var, dc0Var.F).M(LocaleController.getString(R.string.QuoteMaxError), LocaleController.getString(R.string.QuoteMaxErrorMessage), R.raw.error).j();
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
        nb0 nb0Var = this.w;
        nb0 nb0Var2 = this.v;
        if (!z11) {
            if (nb0Var2 != null) {
                nb0Var2.setAlpha(!z10 ? 1.0f : 0.0f);
                nb0Var2.setVisibility(!z10 ? 0 : 4);
            }
            if (nb0Var != null) {
                nb0Var.setAlpha(z10 ? 1.0f : 0.0f);
                nb0Var.setVisibility(z10 ? 0 : 4);
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
        if (nb0Var2 != null) {
            nb0Var2.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(nb0Var2, (Property<nb0, Float>) property, !z10 ? 1.0f : 0.0f));
        }
        if (nb0Var != null) {
            nb0Var.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(nb0Var, (Property<nb0, Float>) property, z10 ? 1.0f : 0.0f));
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
        this.P.setInterpolator(qr.h);
        this.P.addListener(new ba(15, this, z10));
        this.P.start();
    }

    public final void h() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        dc0 dc0Var = this.c0;
        MessagePreviewParams messagePreviewParams = dc0Var.d;
        rb0 rb0Var = this.h;
        if (rb0Var.k()) {
            this.V = true;
            return;
        }
        for (int i10 = 0; i10 < this.r.previewMessages.size(); i10++) {
            MessageObject messageObject = this.r.previewMessages.get(i10);
            messageObject.forceUpdate = true;
            messageObject.sendAsPeer = dc0Var.a;
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
            rb0Var.V(this.r.groupedMessagesMap.valueAt(i12));
        }
        this.n.q(0, this.r.previewMessages.size());
    }

    public final void i() {
        int i10 = this.R;
        float f7 = this.S;
        dc0 dc0Var = this.c0;
        boolean z10 = dc0Var.v;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        pb0 pb0Var = this.f;
        if (z10) {
            this.S = 0.0f;
            this.R = 0;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(AndroidUtilities.dp(8.0f) + pb0Var.getMeasuredWidth());
        } else {
            int measuredHeight = pb0Var.getMeasuredHeight();
            int i11 = 0;
            for (int i12 = 0; i12 < pb0Var.getChildCount(); i12++) {
                View childAt = pb0Var.getChildAt(i12);
                if (RecyclerView.S(childAt) != -1) {
                    measuredHeight = Math.min(measuredHeight, childAt.getTop());
                    i11++;
                }
            }
            MessagePreviewParams.Messages messages = this.r;
            if (messages == null || i11 == 0 || i11 > messages.previewMessages.size()) {
                this.R = 0;
            } else {
                int b10 = org.telegram.messenger.l0.b(4.0f, measuredHeight, 0);
                this.R = b10;
                this.R = Math.min(((pb0Var.getMeasuredHeight() - this.R) + b10) - ((int) ((((AndroidUtilities.displaySize.y - (Build.VERSION.SDK_INT >= 35 ? AndroidUtilities.navigationBarHeight : 0)) * 0.8f) - this.W) - AndroidUtilities.dp(8.0f))), this.R);
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
        ValueAnimator valueAnimator = dc0Var.h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        dc0Var.h = ofFloat;
        ofFloat.addUpdateListener(new ak(this, i10, f7, 1));
        dc0Var.h.setDuration(250L);
        dc0Var.h.setInterpolator(ji.n.V);
        dc0Var.h.addListener(new q8(this, 29));
        AndroidUtilities.runOnUIThread(dc0Var.y, 50L);
        this.T = i10;
        e(f7, i10);
    }

    public final void j() {
        MessageObject messageObject;
        dc0 dc0Var = this.c0;
        MessagePreviewParams messagePreviewParams = dc0Var.d;
        if (this.a == 0) {
            ob0 ob0Var = this.e;
            if (ob0Var.v - ob0Var.u > MessagesController.getInstance(dc0Var.w).quoteLengthMax) {
                return;
            }
            org.telegram.ui.Cells.z9 z9Var = ob0Var.W;
            MessageObject c10 = c(z9Var != null ? ((org.telegram.ui.Cells.u1) z9Var).getMessageObject() : null);
            if (messagePreviewParams.quote != null && ob0Var.y()) {
                messagePreviewParams.quoteStart = ob0Var.u;
                messagePreviewParams.quoteEnd = ob0Var.v;
                if (c10 != null && ((messageObject = messagePreviewParams.quote.a) == null || messageObject.getId() != c10.getId())) {
                    messagePreviewParams.quote = org.telegram.ui.pn.b(messagePreviewParams.quoteStart, messagePreviewParams.quoteEnd, c10);
                    dc0Var.b();
                }
            }
            ob0Var.f(false);
        }
    }

    public final void k(boolean z10) {
        dc0 dc0Var = this.c0;
        TLRPC.User user = dc0Var.n;
        MessagePreviewParams messagePreviewParams = dc0Var.d;
        TLRPC.Chat chat = dc0Var.r;
        ci.n6 n6Var = this.c;
        int i10 = this.a;
        if (i10 == 1) {
            MessagePreviewParams.Messages messages = messagePreviewParams.forwardMessages;
            n6Var.b(LocaleController.formatPluralString("PreviewForwardMessagesCount", messages == null ? 0 : messages.selectedIds.size(), new Object[0]), z10);
            n6Var.a(!messagePreviewParams.hasSenders ? messagePreviewParams.willSeeSenders ? user != null ? LocaleController.formatString("ForwardPreviewSendersNameVisible", R.string.ForwardPreviewSendersNameVisible, ContactsController.formatName(user.first_name, user.last_name)) : (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.ForwardPreviewSendersNameVisibleGroup) : LocaleController.getString(R.string.ForwardPreviewSendersNameVisibleChannel) : user != null ? LocaleController.formatString("ForwardPreviewSendersNameVisible", R.string.ForwardPreviewSendersNameVisible, ContactsController.formatName(user.first_name, user.last_name)) : (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.ForwardPreviewSendersNameHiddenGroup) : LocaleController.getString(R.string.ForwardPreviewSendersNameHiddenChannel) : !messagePreviewParams.hideForwardSendersName ? user != null ? LocaleController.formatString("ForwardPreviewSendersNameVisible", R.string.ForwardPreviewSendersNameVisible, ContactsController.formatName(user.first_name, user.last_name)) : (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.ForwardPreviewSendersNameVisibleGroup) : LocaleController.getString(R.string.ForwardPreviewSendersNameVisibleChannel) : user != null ? LocaleController.formatString("ForwardPreviewSendersNameHidden", R.string.ForwardPreviewSendersNameHidden, ContactsController.formatName(user.first_name, user.last_name)) : (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.ForwardPreviewSendersNameHiddenGroup) : LocaleController.getString(R.string.ForwardPreviewSendersNameHiddenChannel), z10);
        } else {
            if (i10 != 0) {
                if (i10 == 2) {
                    n6Var.b(LocaleController.getString(R.string.MessageOptionsLinkTitle), z10);
                    n6Var.a(LocaleController.getString(R.string.MessageOptionsLinkSubtitle), z10);
                    return;
                }
                return;
            }
            if (messagePreviewParams.quote == null || !messagePreviewParams.replyMessage.hasText) {
                n6Var.b(LocaleController.getString(R.string.MessageOptionsReplyTitle), z10);
                n6Var.a(messagePreviewParams.replyMessage.hasText ? LocaleController.getString(R.string.MessageOptionsReplySubtitle) : "", z10);
            } else {
                n6Var.b(LocaleController.getString(R.string.PreviewQuoteUpdate), z10);
                n6Var.a(LocaleController.getString(R.string.PreviewQuoteUpdateSubtitle), z10);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.a == 0) {
            AndroidUtilities.forEachViews((RecyclerView) this.f, (e2.h) new gb0(this, 0));
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
        dc0 dc0Var = this.c0;
        dc0Var.v = z10;
        this.W = 0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(i10, makeMeasureSpec);
        int i12 = this.W;
        int measuredHeight = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
        Rect rect = this.Q;
        this.W = Math.max(i12, measuredHeight + rect.top + rect.bottom);
        ((ViewGroup.MarginLayoutParams) this.f.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        boolean z11 = dc0Var.v;
        org.telegram.ui.x8 x8Var = this.b;
        if (z11) {
            x8Var.getLayoutParams().height = -1;
            ((ViewGroup.MarginLayoutParams) x8Var.getLayoutParams()).topMargin = AndroidUtilities.dp(8.0f);
            ((ViewGroup.MarginLayoutParams) x8Var.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
            x8Var.getLayoutParams().width = (int) Math.min(View.MeasureSpec.getSize(i10), Math.max(AndroidUtilities.dp(340.0f), View.MeasureSpec.getSize(i10) * 0.6f));
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = -1;
        } else {
            ((ViewGroup.MarginLayoutParams) x8Var.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) x8Var.getLayoutParams()).bottomMargin = 0;
            x8Var.getLayoutParams().height = (View.MeasureSpec.getSize(i11) - AndroidUtilities.dp(6.0f)) - this.W;
            if (x8Var.getLayoutParams().height < View.MeasureSpec.getSize(i11) * 0.5f) {
                x8Var.getLayoutParams().height = (int) (View.MeasureSpec.getSize(i11) * 0.5f);
            }
            x8Var.getLayoutParams().width = -1;
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = View.MeasureSpec.getSize(i11) - x8Var.getLayoutParams().height;
        }
        int size = (View.MeasureSpec.getSize(i11) + View.MeasureSpec.getSize(i10)) << 16;
        if (this.a0 != size) {
            for (int i13 = 0; i13 < this.r.previewMessages.size(); i13++) {
                MessageObject messageObject = this.r.previewMessages.get(i13);
                messageObject.parentWidth = dc0Var.v ? x8Var.getLayoutParams().width : View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(16.0f);
                messageObject.resetLayout();
                messageObject.forceUpdate = true;
                wb0 wb0Var = this.n;
                if (wb0Var != null) {
                    wb0Var.l();
                }
            }
            this.K = true;
        }
        this.a0 = size;
        super.onMeasure(i10, i11);
    }
}
