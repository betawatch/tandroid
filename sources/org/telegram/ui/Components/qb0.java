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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class qb0 extends FrameLayout {
    public final vb0 E;
    public final FrameLayout F;
    public final vb0 G;
    public final vb0 H;
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
    public final ah.w c;
    public final /* synthetic */ wb0 c0;
    public final org.telegram.ui.Cells.ca d;
    public final hb0 e;
    public final ib0 f;
    public final kb0 h;
    public final pb0 n;
    public MessagePreviewParams.Messages r;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout s;
    public final gb0 v;
    public final gb0 w;
    public final org.telegram.ui.ActionBar.f1 x;
    public final org.telegram.ui.ActionBar.f1 y;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [android.graphics.drawable.Drawable, boolean[]] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r13v3, types: [android.view.View, org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout] */
    /* JADX WARN: Type inference failed for: r2v60, types: [android.view.View, org.telegram.ui.ActionBar.f1] */
    /* JADX WARN: Type inference failed for: r2v61, types: [android.view.View, org.telegram.ui.ActionBar.f1] */
    /* JADX WARN: Type inference failed for: r2v67, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r2v68, types: [android.view.View, org.telegram.ui.ActionBar.f1] */
    /* JADX WARN: Type inference failed for: r2v69, types: [android.view.View, org.telegram.ui.ActionBar.f1] */
    /* JADX WARN: Type inference failed for: r31v0, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout, java.lang.Object, org.telegram.ui.Components.qb0] */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.view.View, android.view.ViewGroup, org.telegram.ui.Components.ov0, org.telegram.ui.w8] */
    /* JADX WARN: Type inference failed for: r3v6, types: [bh.b] */
    /* JADX WARN: Type inference failed for: r9v8, types: [android.view.ViewGroup] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qb0(wb0 wb0Var, Context context, int i10) {
        super(r4);
        MessagePreviewParams messagePreviewParams;
        Context context2;
        qb0 qb0Var;
        boolean z10;
        vb0 vb0Var;
        ViewOutlineProvider viewOutlineProvider;
        qb0 qb0Var2;
        MessagePreviewParams.Messages messages;
        ?? r11;
        MessagePreviewParams messagePreviewParams2;
        LinearLayout linearLayout;
        Drawable drawable;
        boolean z11;
        Context context3 = context;
        this.c0 = wb0Var;
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
        int i13 = 3;
        setOnTouchListener(new ur(this, i13));
        ?? w8Var = new org.telegram.ui.w8(this, context3, i11);
        this.b = w8Var;
        sb0 sb0Var = wb0Var.F;
        boolean z12 = wb0Var.b;
        MessagePreviewParams messagePreviewParams3 = wb0Var.d;
        Drawable d = ((org.telegram.ui.ao) sb0Var).d();
        if (((org.telegram.ui.ao) sb0Var).f == null) {
            int i14 = org.telegram.ui.ActionBar.j6.a;
        }
        w8Var.V(d);
        w8Var.setOccupyStatusBar(false);
        w8Var.setOutlineProvider(new dh.b(this, i13));
        w8Var.setClipToOutline(true);
        w8Var.setElevation(AndroidUtilities.dp(4.0f));
        ah.w wVar = new ah.w(context3, 13, sb0Var);
        this.c = wVar;
        wVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.s8, sb0Var));
        hb0 hb0Var = new hb0(this);
        this.e = hb0Var;
        hb0Var.D = new bi.f3(this, i13);
        ib0 ib0Var = new ib0(this, context3, sb0Var);
        this.f = ib0Var;
        kb0 kb0Var = new kb0(this, ib0Var, sb0Var);
        this.h = kb0Var;
        ib0Var.setItemAnimator(kb0Var);
        ib0Var.setOnScrollListener(new lb0(this, i12));
        ib0Var.setOnItemClickListener(new mb0(this));
        pb0 pb0Var = new pb0(this);
        this.n = pb0Var;
        ib0Var.setAdapter(pb0Var);
        ib0Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        db0 db0Var = new db0(this);
        db0Var.O = new eb0(this);
        ib0Var.setClipToPadding(false);
        ib0Var.setLayoutManager(db0Var);
        ib0Var.i(new fb0());
        w8Var.addView(ib0Var);
        addView(w8Var, w7.x5.d(-1, 400.0f, 0, 8.0f, 0.0f, 8.0f, 0.0f));
        w8Var.addView(wVar, w7.x5.c(-2.0f, -1));
        ?? actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert2, 1, getContext(), sb0Var);
        this.s = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().setOnForegroundOpenFinished(new bb0(this, i11));
        dh.d c10 = wb0Var.G.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, false);
        c10.n(fh.b.k(sb0Var));
        c10.o(AndroidUtilities.dp(8.0f));
        c10.h.e = true;
        c10.p(AndroidUtilities.dp(12.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c10);
        addView(actionBarPopupWindow$ActionBarPopupWindowLayout, w7.x5.c(-2.0f, -2));
        if (i10 != 0 || (messages = messagePreviewParams3.replyMessage) == null) {
            messagePreviewParams = messagePreviewParams3;
            if (i10 != 1 || messagePreviewParams.forwardMessages == null) {
                final qb0 qb0Var3 = this;
                qb0Var = qb0Var3;
                if (i10 == 2) {
                    qb0Var = qb0Var3;
                    if (messagePreviewParams.linkMessage != null) {
                        vb0 vb0Var2 = new vb0(context, R.raw.position_below, LocaleController.getString(R.string.LinkAbove), R.raw.position_above, LocaleController.getString(R.string.LinkBelow), wb0Var.F);
                        qb0Var3.E = vb0Var2;
                        vb0Var2.a(!messagePreviewParams.webpageTop, false);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(vb0Var2, w7.x5.n(-1, 48));
                        FrameLayout frameLayout = new FrameLayout(context);
                        qb0Var3.F = frameLayout;
                        frameLayout.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.I5, sb0Var), 0, 0));
                        vb0 vb0Var3 = new vb0(context, R.raw.media_shrink, LocaleController.getString(R.string.LinkMediaLarger), R.raw.media_enlarge, LocaleController.getString(R.string.LinkMediaSmaller), wb0Var.F);
                        qb0Var3.G = vb0Var3;
                        vb0Var3.setBackground(null);
                        vb0Var3.setVisibility(messagePreviewParams.isVideo ? 4 : 0);
                        frameLayout.addView(vb0Var3, w7.x5.n(-1, 48));
                        vb0 vb0Var4 = new vb0(context, R.raw.media_shrink, LocaleController.getString(R.string.LinkVideoLarger), R.raw.media_enlarge, LocaleController.getString(R.string.LinkVideoSmaller), wb0Var.F);
                        qb0Var3.H = vb0Var4;
                        vb0Var4.setBackground(null);
                        vb0Var4.setVisibility(!messagePreviewParams.isVideo ? 4 : 0);
                        frameLayout.setAlpha(messagePreviewParams.hasMedia ? 1.0f : 0.5f);
                        frameLayout.addView(vb0Var4, w7.x5.n(-1, 48));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, w7.x5.n(-1, 48));
                        frameLayout.setVisibility((!messagePreviewParams.singleLink || messagePreviewParams.hasMedia) ? 0 : 8);
                        vb0Var3.a(messagePreviewParams.webpageSmall, false);
                        vb0Var4.a(messagePreviewParams.webpageSmall, false);
                        org.telegram.ui.ActionBar.k1 k1Var = new org.telegram.ui.ActionBar.k1(context, sb0Var);
                        k1Var.setColor(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, sb0Var)));
                        k1Var.setTag(R.id.fit_width_tag, 1);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(k1Var, w7.x5.n(-1, 8));
                        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(1, context, wb0Var.F, false, false);
                        f1Var.g(LocaleController.getString(R.string.ApplyChanges), R.drawable.msg_select, null);
                        final int i15 = 10;
                        f1Var.setOnClickListener(new View.OnClickListener(qb0Var3) { // from class: org.telegram.ui.Components.ya0
                            public final /* synthetic */ qb0 b;

                            {
                                this.b = qb0Var3;
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
                                        qb0 qb0Var4 = this.b;
                                        qb0Var4.c0.d.quote = null;
                                        qb0Var4.e.f(false);
                                        qb0Var4.g(false, false);
                                        qb0Var4.s.getSwipeBack().b(true);
                                        break;
                                    case 1:
                                        qb0 qb0Var5 = this.b;
                                        hb0 hb0Var2 = qb0Var5.e;
                                        wb0 wb0Var2 = qb0Var5.c0;
                                        if (qb0Var5.c(null) != null) {
                                            if (hb0Var2.v - hb0Var2.u <= MessagesController.getInstance(wb0Var2.w).quoteLengthMax) {
                                                org.telegram.ui.Cells.y9 y9Var = hb0Var2.W;
                                                MessageObject c11 = qb0Var5.c(y9Var != null ? ((org.telegram.ui.Cells.t1) y9Var).getMessageObject() : null);
                                                MessagePreviewParams messagePreviewParams4 = wb0Var2.d;
                                                int i17 = hb0Var2.u;
                                                messagePreviewParams4.quoteStart = i17;
                                                int i18 = hb0Var2.v;
                                                messagePreviewParams4.quoteEnd = i18;
                                                messagePreviewParams4.quote = org.telegram.ui.sn.b(i17, i18, c11);
                                                wb0Var2.b();
                                                wb0Var2.a(true);
                                                break;
                                            } else {
                                                qb0Var5.f();
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        qb0 qb0Var6 = this.b;
                                        hb0 hb0Var3 = qb0Var6.e;
                                        wb0 wb0Var3 = qb0Var6.c0;
                                        MessagePreviewParams messagePreviewParams5 = wb0Var3.d;
                                        int i19 = wb0Var3.w;
                                        boolean z13 = wb0Var3.b;
                                        if (messagePreviewParams5.quote != null && !z13) {
                                            messagePreviewParams5.quote = null;
                                            hb0Var3.f(false);
                                            qb0Var6.g(false, true);
                                            qb0Var6.k(true);
                                            break;
                                        } else if (hb0Var3.v - hb0Var3.u <= MessagesController.getInstance(i19).quoteLengthMax) {
                                            MessageObject c12 = qb0Var6.c(null);
                                            if (c12 != null) {
                                                if (!hb0Var3.y()) {
                                                    messagePreviewParams5.quoteStart = 0;
                                                    int min = Math.min(MessagesController.getInstance(i19).quoteLengthMax, c12.messageOwner.message.length());
                                                    messagePreviewParams5.quoteEnd = min;
                                                    messagePreviewParams5.quote = org.telegram.ui.sn.b(messagePreviewParams5.quoteStart, min, c12);
                                                    View d10 = qb0Var6.d();
                                                    if (d10 instanceof org.telegram.ui.Cells.t1) {
                                                        hb0Var3.a0((org.telegram.ui.Cells.t1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                    }
                                                    if (!z13) {
                                                        qb0Var6.s.getSwipeBack().e(qb0Var6.I);
                                                    }
                                                    qb0Var6.g(true, true);
                                                    break;
                                                } else {
                                                    messagePreviewParams5.quoteStart = hb0Var3.u;
                                                    messagePreviewParams5.quoteEnd = hb0Var3.v;
                                                    org.telegram.ui.Cells.y9 y9Var2 = hb0Var3.W;
                                                    messagePreviewParams5.quote = org.telegram.ui.sn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, qb0Var6.c(y9Var2 != null ? ((org.telegram.ui.Cells.t1) y9Var2).getMessageObject() : null));
                                                    wb0Var3.b();
                                                    wb0Var3.a(true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            qb0Var6.f();
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
                                        wb0 wb0Var4 = this.b.c0;
                                        if (!wb0Var4.b) {
                                            org.telegram.ui.il ilVar = (org.telegram.ui.il) wb0Var4;
                                            ilVar.a(true);
                                            org.telegram.ui.co coVar = ilVar.H;
                                            coVar.n5 = null;
                                            coVar.l5 = null;
                                            coVar.f5.updateReply(null, null, coVar.T5, null);
                                            coVar.j8();
                                            break;
                                        } else {
                                            org.telegram.ui.il ilVar2 = (org.telegram.ui.il) wb0Var4;
                                            ilVar2.a(true);
                                            org.telegram.ui.co coVar2 = ilVar2.H;
                                            coVar2.l5 = null;
                                            coVar2.Bb(coVar2.n5);
                                            break;
                                        }
                                    case 7:
                                        this.b.c0.c(true);
                                        break;
                                    case 8:
                                        this.b.c0.a(true);
                                        break;
                                    case 9:
                                        org.telegram.ui.il ilVar3 = (org.telegram.ui.il) this.b.c0;
                                        ilVar3.a(true);
                                        org.telegram.ui.co coVar3 = ilVar3.H;
                                        coVar3.f5.updateForward(null, coVar3.T5);
                                        coVar3.j8();
                                        break;
                                    case 10:
                                        this.b.c0.a(true);
                                        break;
                                    case 11:
                                        org.telegram.ui.il ilVar4 = (org.telegram.ui.il) this.b.c0;
                                        ilVar4.a(true);
                                        org.telegram.ui.co coVar4 = ilVar4.H;
                                        coVar4.G5 = null;
                                        org.telegram.ui.mk mkVar = coVar4.Y;
                                        if (mkVar != null) {
                                            mkVar.W2 = null;
                                            mkVar.X2 = false;
                                        }
                                        MessagePreviewParams messagePreviewParams6 = coVar4.f5;
                                        if (messagePreviewParams6 != null) {
                                            i16 = ((org.telegram.ui.ActionBar.n2) coVar4).currentAccount;
                                            MessageObject messageObject = coVar4.n5;
                                            messagePreviewParams6.updateLink(i16, null, null, messageObject == coVar4.X3 ? null : messageObject, coVar4.l5, coVar4.p5);
                                        }
                                        coVar4.j8();
                                        break;
                                    case 12:
                                        qb0 qb0Var7 = this.b;
                                        MessagePreviewParams messagePreviewParams7 = qb0Var7.c0.d;
                                        if (messagePreviewParams7.hasMedia) {
                                            boolean z14 = !messagePreviewParams7.webpageSmall;
                                            messagePreviewParams7.webpageSmall = z14;
                                            qb0Var7.G.a(z14, true);
                                            qb0Var7.H.a(messagePreviewParams7.webpageSmall, true);
                                            if (qb0Var7.r.messages.size() > 0 && (message2 = qb0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                                boolean z15 = messagePreviewParams7.webpageSmall;
                                                messageMedia2.force_small_media = z15;
                                                messageMedia2.force_large_media = !z15;
                                            }
                                            if (qb0Var7.r.previewMessages.size() > 0 && (message = qb0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                                boolean z16 = messagePreviewParams7.webpageSmall;
                                                messageMedia.force_small_media = z16;
                                                messageMedia.force_large_media = !z16;
                                            }
                                            qb0Var7.h();
                                            qb0Var7.U = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        qb0 qb0Var8 = this.b;
                                        MessagePreviewParams messagePreviewParams8 = qb0Var8.c0.d;
                                        boolean z17 = messagePreviewParams8.webpageTop;
                                        messagePreviewParams8.webpageTop = !z17;
                                        qb0Var8.E.a(z17, true);
                                        if (qb0Var8.r.messages.size() > 0 && (message4 = qb0Var8.r.messages.get(0).messageOwner) != null) {
                                            message4.invert_media = messagePreviewParams8.webpageTop;
                                        }
                                        if (qb0Var8.r.previewMessages.size() > 0 && (message3 = qb0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                            message3.invert_media = messagePreviewParams8.webpageTop;
                                        }
                                        qb0Var8.h();
                                        qb0Var8.U = true;
                                        break;
                                }
                            }
                        });
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(f1Var, w7.x5.n(-1, 48));
                        org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(1, context, wb0Var.F, false, true);
                        context2 = context;
                        f1Var2.g(LocaleController.getString(R.string.DoNotLinkPreview), R.drawable.msg_delete, null);
                        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q7, sb0Var);
                        int i16 = org.telegram.ui.ActionBar.j6.p7;
                        f1Var2.c(v02, org.telegram.ui.ActionBar.j6.v0(i16, sb0Var));
                        final int i17 = 11;
                        f1Var2.setOnClickListener(new View.OnClickListener(qb0Var3) { // from class: org.telegram.ui.Components.ya0
                            public final /* synthetic */ qb0 b;

                            {
                                this.b = qb0Var3;
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
                                        qb0 qb0Var4 = this.b;
                                        qb0Var4.c0.d.quote = null;
                                        qb0Var4.e.f(false);
                                        qb0Var4.g(false, false);
                                        qb0Var4.s.getSwipeBack().b(true);
                                        break;
                                    case 1:
                                        qb0 qb0Var5 = this.b;
                                        hb0 hb0Var2 = qb0Var5.e;
                                        wb0 wb0Var2 = qb0Var5.c0;
                                        if (qb0Var5.c(null) != null) {
                                            if (hb0Var2.v - hb0Var2.u <= MessagesController.getInstance(wb0Var2.w).quoteLengthMax) {
                                                org.telegram.ui.Cells.y9 y9Var = hb0Var2.W;
                                                MessageObject c11 = qb0Var5.c(y9Var != null ? ((org.telegram.ui.Cells.t1) y9Var).getMessageObject() : null);
                                                MessagePreviewParams messagePreviewParams4 = wb0Var2.d;
                                                int i172 = hb0Var2.u;
                                                messagePreviewParams4.quoteStart = i172;
                                                int i18 = hb0Var2.v;
                                                messagePreviewParams4.quoteEnd = i18;
                                                messagePreviewParams4.quote = org.telegram.ui.sn.b(i172, i18, c11);
                                                wb0Var2.b();
                                                wb0Var2.a(true);
                                                break;
                                            } else {
                                                qb0Var5.f();
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        qb0 qb0Var6 = this.b;
                                        hb0 hb0Var3 = qb0Var6.e;
                                        wb0 wb0Var3 = qb0Var6.c0;
                                        MessagePreviewParams messagePreviewParams5 = wb0Var3.d;
                                        int i19 = wb0Var3.w;
                                        boolean z13 = wb0Var3.b;
                                        if (messagePreviewParams5.quote != null && !z13) {
                                            messagePreviewParams5.quote = null;
                                            hb0Var3.f(false);
                                            qb0Var6.g(false, true);
                                            qb0Var6.k(true);
                                            break;
                                        } else if (hb0Var3.v - hb0Var3.u <= MessagesController.getInstance(i19).quoteLengthMax) {
                                            MessageObject c12 = qb0Var6.c(null);
                                            if (c12 != null) {
                                                if (!hb0Var3.y()) {
                                                    messagePreviewParams5.quoteStart = 0;
                                                    int min = Math.min(MessagesController.getInstance(i19).quoteLengthMax, c12.messageOwner.message.length());
                                                    messagePreviewParams5.quoteEnd = min;
                                                    messagePreviewParams5.quote = org.telegram.ui.sn.b(messagePreviewParams5.quoteStart, min, c12);
                                                    View d10 = qb0Var6.d();
                                                    if (d10 instanceof org.telegram.ui.Cells.t1) {
                                                        hb0Var3.a0((org.telegram.ui.Cells.t1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                    }
                                                    if (!z13) {
                                                        qb0Var6.s.getSwipeBack().e(qb0Var6.I);
                                                    }
                                                    qb0Var6.g(true, true);
                                                    break;
                                                } else {
                                                    messagePreviewParams5.quoteStart = hb0Var3.u;
                                                    messagePreviewParams5.quoteEnd = hb0Var3.v;
                                                    org.telegram.ui.Cells.y9 y9Var2 = hb0Var3.W;
                                                    messagePreviewParams5.quote = org.telegram.ui.sn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, qb0Var6.c(y9Var2 != null ? ((org.telegram.ui.Cells.t1) y9Var2).getMessageObject() : null));
                                                    wb0Var3.b();
                                                    wb0Var3.a(true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            qb0Var6.f();
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
                                        wb0 wb0Var4 = this.b.c0;
                                        if (!wb0Var4.b) {
                                            org.telegram.ui.il ilVar = (org.telegram.ui.il) wb0Var4;
                                            ilVar.a(true);
                                            org.telegram.ui.co coVar = ilVar.H;
                                            coVar.n5 = null;
                                            coVar.l5 = null;
                                            coVar.f5.updateReply(null, null, coVar.T5, null);
                                            coVar.j8();
                                            break;
                                        } else {
                                            org.telegram.ui.il ilVar2 = (org.telegram.ui.il) wb0Var4;
                                            ilVar2.a(true);
                                            org.telegram.ui.co coVar2 = ilVar2.H;
                                            coVar2.l5 = null;
                                            coVar2.Bb(coVar2.n5);
                                            break;
                                        }
                                    case 7:
                                        this.b.c0.c(true);
                                        break;
                                    case 8:
                                        this.b.c0.a(true);
                                        break;
                                    case 9:
                                        org.telegram.ui.il ilVar3 = (org.telegram.ui.il) this.b.c0;
                                        ilVar3.a(true);
                                        org.telegram.ui.co coVar3 = ilVar3.H;
                                        coVar3.f5.updateForward(null, coVar3.T5);
                                        coVar3.j8();
                                        break;
                                    case 10:
                                        this.b.c0.a(true);
                                        break;
                                    case 11:
                                        org.telegram.ui.il ilVar4 = (org.telegram.ui.il) this.b.c0;
                                        ilVar4.a(true);
                                        org.telegram.ui.co coVar4 = ilVar4.H;
                                        coVar4.G5 = null;
                                        org.telegram.ui.mk mkVar = coVar4.Y;
                                        if (mkVar != null) {
                                            mkVar.W2 = null;
                                            mkVar.X2 = false;
                                        }
                                        MessagePreviewParams messagePreviewParams6 = coVar4.f5;
                                        if (messagePreviewParams6 != null) {
                                            i162 = ((org.telegram.ui.ActionBar.n2) coVar4).currentAccount;
                                            MessageObject messageObject = coVar4.n5;
                                            messagePreviewParams6.updateLink(i162, null, null, messageObject == coVar4.X3 ? null : messageObject, coVar4.l5, coVar4.p5);
                                        }
                                        coVar4.j8();
                                        break;
                                    case 12:
                                        qb0 qb0Var7 = this.b;
                                        MessagePreviewParams messagePreviewParams7 = qb0Var7.c0.d;
                                        if (messagePreviewParams7.hasMedia) {
                                            boolean z14 = !messagePreviewParams7.webpageSmall;
                                            messagePreviewParams7.webpageSmall = z14;
                                            qb0Var7.G.a(z14, true);
                                            qb0Var7.H.a(messagePreviewParams7.webpageSmall, true);
                                            if (qb0Var7.r.messages.size() > 0 && (message2 = qb0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                                boolean z15 = messagePreviewParams7.webpageSmall;
                                                messageMedia2.force_small_media = z15;
                                                messageMedia2.force_large_media = !z15;
                                            }
                                            if (qb0Var7.r.previewMessages.size() > 0 && (message = qb0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                                boolean z16 = messagePreviewParams7.webpageSmall;
                                                messageMedia.force_small_media = z16;
                                                messageMedia.force_large_media = !z16;
                                            }
                                            qb0Var7.h();
                                            qb0Var7.U = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        qb0 qb0Var8 = this.b;
                                        MessagePreviewParams messagePreviewParams8 = qb0Var8.c0.d;
                                        boolean z17 = messagePreviewParams8.webpageTop;
                                        messagePreviewParams8.webpageTop = !z17;
                                        qb0Var8.E.a(z17, true);
                                        if (qb0Var8.r.messages.size() > 0 && (message4 = qb0Var8.r.messages.get(0).messageOwner) != null) {
                                            message4.invert_media = messagePreviewParams8.webpageTop;
                                        }
                                        if (qb0Var8.r.previewMessages.size() > 0 && (message3 = qb0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                            message3.invert_media = messagePreviewParams8.webpageTop;
                                        }
                                        qb0Var8.h();
                                        qb0Var8.U = true;
                                        break;
                                }
                            }
                        });
                        f1Var2.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.w0(null, i16, false)));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(f1Var2, w7.x5.n(-1, 48));
                        final int i18 = 12;
                        frameLayout.setOnClickListener(new View.OnClickListener(qb0Var3) { // from class: org.telegram.ui.Components.ya0
                            public final /* synthetic */ qb0 b;

                            {
                                this.b = qb0Var3;
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
                                        qb0 qb0Var4 = this.b;
                                        qb0Var4.c0.d.quote = null;
                                        qb0Var4.e.f(false);
                                        qb0Var4.g(false, false);
                                        qb0Var4.s.getSwipeBack().b(true);
                                        break;
                                    case 1:
                                        qb0 qb0Var5 = this.b;
                                        hb0 hb0Var2 = qb0Var5.e;
                                        wb0 wb0Var2 = qb0Var5.c0;
                                        if (qb0Var5.c(null) != null) {
                                            if (hb0Var2.v - hb0Var2.u <= MessagesController.getInstance(wb0Var2.w).quoteLengthMax) {
                                                org.telegram.ui.Cells.y9 y9Var = hb0Var2.W;
                                                MessageObject c11 = qb0Var5.c(y9Var != null ? ((org.telegram.ui.Cells.t1) y9Var).getMessageObject() : null);
                                                MessagePreviewParams messagePreviewParams4 = wb0Var2.d;
                                                int i172 = hb0Var2.u;
                                                messagePreviewParams4.quoteStart = i172;
                                                int i182 = hb0Var2.v;
                                                messagePreviewParams4.quoteEnd = i182;
                                                messagePreviewParams4.quote = org.telegram.ui.sn.b(i172, i182, c11);
                                                wb0Var2.b();
                                                wb0Var2.a(true);
                                                break;
                                            } else {
                                                qb0Var5.f();
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        qb0 qb0Var6 = this.b;
                                        hb0 hb0Var3 = qb0Var6.e;
                                        wb0 wb0Var3 = qb0Var6.c0;
                                        MessagePreviewParams messagePreviewParams5 = wb0Var3.d;
                                        int i19 = wb0Var3.w;
                                        boolean z13 = wb0Var3.b;
                                        if (messagePreviewParams5.quote != null && !z13) {
                                            messagePreviewParams5.quote = null;
                                            hb0Var3.f(false);
                                            qb0Var6.g(false, true);
                                            qb0Var6.k(true);
                                            break;
                                        } else if (hb0Var3.v - hb0Var3.u <= MessagesController.getInstance(i19).quoteLengthMax) {
                                            MessageObject c12 = qb0Var6.c(null);
                                            if (c12 != null) {
                                                if (!hb0Var3.y()) {
                                                    messagePreviewParams5.quoteStart = 0;
                                                    int min = Math.min(MessagesController.getInstance(i19).quoteLengthMax, c12.messageOwner.message.length());
                                                    messagePreviewParams5.quoteEnd = min;
                                                    messagePreviewParams5.quote = org.telegram.ui.sn.b(messagePreviewParams5.quoteStart, min, c12);
                                                    View d10 = qb0Var6.d();
                                                    if (d10 instanceof org.telegram.ui.Cells.t1) {
                                                        hb0Var3.a0((org.telegram.ui.Cells.t1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                    }
                                                    if (!z13) {
                                                        qb0Var6.s.getSwipeBack().e(qb0Var6.I);
                                                    }
                                                    qb0Var6.g(true, true);
                                                    break;
                                                } else {
                                                    messagePreviewParams5.quoteStart = hb0Var3.u;
                                                    messagePreviewParams5.quoteEnd = hb0Var3.v;
                                                    org.telegram.ui.Cells.y9 y9Var2 = hb0Var3.W;
                                                    messagePreviewParams5.quote = org.telegram.ui.sn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, qb0Var6.c(y9Var2 != null ? ((org.telegram.ui.Cells.t1) y9Var2).getMessageObject() : null));
                                                    wb0Var3.b();
                                                    wb0Var3.a(true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            qb0Var6.f();
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
                                        wb0 wb0Var4 = this.b.c0;
                                        if (!wb0Var4.b) {
                                            org.telegram.ui.il ilVar = (org.telegram.ui.il) wb0Var4;
                                            ilVar.a(true);
                                            org.telegram.ui.co coVar = ilVar.H;
                                            coVar.n5 = null;
                                            coVar.l5 = null;
                                            coVar.f5.updateReply(null, null, coVar.T5, null);
                                            coVar.j8();
                                            break;
                                        } else {
                                            org.telegram.ui.il ilVar2 = (org.telegram.ui.il) wb0Var4;
                                            ilVar2.a(true);
                                            org.telegram.ui.co coVar2 = ilVar2.H;
                                            coVar2.l5 = null;
                                            coVar2.Bb(coVar2.n5);
                                            break;
                                        }
                                    case 7:
                                        this.b.c0.c(true);
                                        break;
                                    case 8:
                                        this.b.c0.a(true);
                                        break;
                                    case 9:
                                        org.telegram.ui.il ilVar3 = (org.telegram.ui.il) this.b.c0;
                                        ilVar3.a(true);
                                        org.telegram.ui.co coVar3 = ilVar3.H;
                                        coVar3.f5.updateForward(null, coVar3.T5);
                                        coVar3.j8();
                                        break;
                                    case 10:
                                        this.b.c0.a(true);
                                        break;
                                    case 11:
                                        org.telegram.ui.il ilVar4 = (org.telegram.ui.il) this.b.c0;
                                        ilVar4.a(true);
                                        org.telegram.ui.co coVar4 = ilVar4.H;
                                        coVar4.G5 = null;
                                        org.telegram.ui.mk mkVar = coVar4.Y;
                                        if (mkVar != null) {
                                            mkVar.W2 = null;
                                            mkVar.X2 = false;
                                        }
                                        MessagePreviewParams messagePreviewParams6 = coVar4.f5;
                                        if (messagePreviewParams6 != null) {
                                            i162 = ((org.telegram.ui.ActionBar.n2) coVar4).currentAccount;
                                            MessageObject messageObject = coVar4.n5;
                                            messagePreviewParams6.updateLink(i162, null, null, messageObject == coVar4.X3 ? null : messageObject, coVar4.l5, coVar4.p5);
                                        }
                                        coVar4.j8();
                                        break;
                                    case 12:
                                        qb0 qb0Var7 = this.b;
                                        MessagePreviewParams messagePreviewParams7 = qb0Var7.c0.d;
                                        if (messagePreviewParams7.hasMedia) {
                                            boolean z14 = !messagePreviewParams7.webpageSmall;
                                            messagePreviewParams7.webpageSmall = z14;
                                            qb0Var7.G.a(z14, true);
                                            qb0Var7.H.a(messagePreviewParams7.webpageSmall, true);
                                            if (qb0Var7.r.messages.size() > 0 && (message2 = qb0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                                boolean z15 = messagePreviewParams7.webpageSmall;
                                                messageMedia2.force_small_media = z15;
                                                messageMedia2.force_large_media = !z15;
                                            }
                                            if (qb0Var7.r.previewMessages.size() > 0 && (message = qb0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                                boolean z16 = messagePreviewParams7.webpageSmall;
                                                messageMedia.force_small_media = z16;
                                                messageMedia.force_large_media = !z16;
                                            }
                                            qb0Var7.h();
                                            qb0Var7.U = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        qb0 qb0Var8 = this.b;
                                        MessagePreviewParams messagePreviewParams8 = qb0Var8.c0.d;
                                        boolean z17 = messagePreviewParams8.webpageTop;
                                        messagePreviewParams8.webpageTop = !z17;
                                        qb0Var8.E.a(z17, true);
                                        if (qb0Var8.r.messages.size() > 0 && (message4 = qb0Var8.r.messages.get(0).messageOwner) != null) {
                                            message4.invert_media = messagePreviewParams8.webpageTop;
                                        }
                                        if (qb0Var8.r.previewMessages.size() > 0 && (message3 = qb0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                            message3.invert_media = messagePreviewParams8.webpageTop;
                                        }
                                        qb0Var8.h();
                                        qb0Var8.U = true;
                                        break;
                                }
                            }
                        });
                        final int i19 = 13;
                        vb0Var2.setOnClickListener(new View.OnClickListener(qb0Var3) { // from class: org.telegram.ui.Components.ya0
                            public final /* synthetic */ qb0 b;

                            {
                                this.b = qb0Var3;
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
                                        qb0 qb0Var4 = this.b;
                                        qb0Var4.c0.d.quote = null;
                                        qb0Var4.e.f(false);
                                        qb0Var4.g(false, false);
                                        qb0Var4.s.getSwipeBack().b(true);
                                        break;
                                    case 1:
                                        qb0 qb0Var5 = this.b;
                                        hb0 hb0Var2 = qb0Var5.e;
                                        wb0 wb0Var2 = qb0Var5.c0;
                                        if (qb0Var5.c(null) != null) {
                                            if (hb0Var2.v - hb0Var2.u <= MessagesController.getInstance(wb0Var2.w).quoteLengthMax) {
                                                org.telegram.ui.Cells.y9 y9Var = hb0Var2.W;
                                                MessageObject c11 = qb0Var5.c(y9Var != null ? ((org.telegram.ui.Cells.t1) y9Var).getMessageObject() : null);
                                                MessagePreviewParams messagePreviewParams4 = wb0Var2.d;
                                                int i172 = hb0Var2.u;
                                                messagePreviewParams4.quoteStart = i172;
                                                int i182 = hb0Var2.v;
                                                messagePreviewParams4.quoteEnd = i182;
                                                messagePreviewParams4.quote = org.telegram.ui.sn.b(i172, i182, c11);
                                                wb0Var2.b();
                                                wb0Var2.a(true);
                                                break;
                                            } else {
                                                qb0Var5.f();
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        qb0 qb0Var6 = this.b;
                                        hb0 hb0Var3 = qb0Var6.e;
                                        wb0 wb0Var3 = qb0Var6.c0;
                                        MessagePreviewParams messagePreviewParams5 = wb0Var3.d;
                                        int i192 = wb0Var3.w;
                                        boolean z13 = wb0Var3.b;
                                        if (messagePreviewParams5.quote != null && !z13) {
                                            messagePreviewParams5.quote = null;
                                            hb0Var3.f(false);
                                            qb0Var6.g(false, true);
                                            qb0Var6.k(true);
                                            break;
                                        } else if (hb0Var3.v - hb0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                            MessageObject c12 = qb0Var6.c(null);
                                            if (c12 != null) {
                                                if (!hb0Var3.y()) {
                                                    messagePreviewParams5.quoteStart = 0;
                                                    int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                                    messagePreviewParams5.quoteEnd = min;
                                                    messagePreviewParams5.quote = org.telegram.ui.sn.b(messagePreviewParams5.quoteStart, min, c12);
                                                    View d10 = qb0Var6.d();
                                                    if (d10 instanceof org.telegram.ui.Cells.t1) {
                                                        hb0Var3.a0((org.telegram.ui.Cells.t1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                    }
                                                    if (!z13) {
                                                        qb0Var6.s.getSwipeBack().e(qb0Var6.I);
                                                    }
                                                    qb0Var6.g(true, true);
                                                    break;
                                                } else {
                                                    messagePreviewParams5.quoteStart = hb0Var3.u;
                                                    messagePreviewParams5.quoteEnd = hb0Var3.v;
                                                    org.telegram.ui.Cells.y9 y9Var2 = hb0Var3.W;
                                                    messagePreviewParams5.quote = org.telegram.ui.sn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, qb0Var6.c(y9Var2 != null ? ((org.telegram.ui.Cells.t1) y9Var2).getMessageObject() : null));
                                                    wb0Var3.b();
                                                    wb0Var3.a(true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            qb0Var6.f();
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
                                        wb0 wb0Var4 = this.b.c0;
                                        if (!wb0Var4.b) {
                                            org.telegram.ui.il ilVar = (org.telegram.ui.il) wb0Var4;
                                            ilVar.a(true);
                                            org.telegram.ui.co coVar = ilVar.H;
                                            coVar.n5 = null;
                                            coVar.l5 = null;
                                            coVar.f5.updateReply(null, null, coVar.T5, null);
                                            coVar.j8();
                                            break;
                                        } else {
                                            org.telegram.ui.il ilVar2 = (org.telegram.ui.il) wb0Var4;
                                            ilVar2.a(true);
                                            org.telegram.ui.co coVar2 = ilVar2.H;
                                            coVar2.l5 = null;
                                            coVar2.Bb(coVar2.n5);
                                            break;
                                        }
                                    case 7:
                                        this.b.c0.c(true);
                                        break;
                                    case 8:
                                        this.b.c0.a(true);
                                        break;
                                    case 9:
                                        org.telegram.ui.il ilVar3 = (org.telegram.ui.il) this.b.c0;
                                        ilVar3.a(true);
                                        org.telegram.ui.co coVar3 = ilVar3.H;
                                        coVar3.f5.updateForward(null, coVar3.T5);
                                        coVar3.j8();
                                        break;
                                    case 10:
                                        this.b.c0.a(true);
                                        break;
                                    case 11:
                                        org.telegram.ui.il ilVar4 = (org.telegram.ui.il) this.b.c0;
                                        ilVar4.a(true);
                                        org.telegram.ui.co coVar4 = ilVar4.H;
                                        coVar4.G5 = null;
                                        org.telegram.ui.mk mkVar = coVar4.Y;
                                        if (mkVar != null) {
                                            mkVar.W2 = null;
                                            mkVar.X2 = false;
                                        }
                                        MessagePreviewParams messagePreviewParams6 = coVar4.f5;
                                        if (messagePreviewParams6 != null) {
                                            i162 = ((org.telegram.ui.ActionBar.n2) coVar4).currentAccount;
                                            MessageObject messageObject = coVar4.n5;
                                            messagePreviewParams6.updateLink(i162, null, null, messageObject == coVar4.X3 ? null : messageObject, coVar4.l5, coVar4.p5);
                                        }
                                        coVar4.j8();
                                        break;
                                    case 12:
                                        qb0 qb0Var7 = this.b;
                                        MessagePreviewParams messagePreviewParams7 = qb0Var7.c0.d;
                                        if (messagePreviewParams7.hasMedia) {
                                            boolean z14 = !messagePreviewParams7.webpageSmall;
                                            messagePreviewParams7.webpageSmall = z14;
                                            qb0Var7.G.a(z14, true);
                                            qb0Var7.H.a(messagePreviewParams7.webpageSmall, true);
                                            if (qb0Var7.r.messages.size() > 0 && (message2 = qb0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                                boolean z15 = messagePreviewParams7.webpageSmall;
                                                messageMedia2.force_small_media = z15;
                                                messageMedia2.force_large_media = !z15;
                                            }
                                            if (qb0Var7.r.previewMessages.size() > 0 && (message = qb0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                                boolean z16 = messagePreviewParams7.webpageSmall;
                                                messageMedia.force_small_media = z16;
                                                messageMedia.force_large_media = !z16;
                                            }
                                            qb0Var7.h();
                                            qb0Var7.U = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        qb0 qb0Var8 = this.b;
                                        MessagePreviewParams messagePreviewParams8 = qb0Var8.c0.d;
                                        boolean z17 = messagePreviewParams8.webpageTop;
                                        messagePreviewParams8.webpageTop = !z17;
                                        qb0Var8.E.a(z17, true);
                                        if (qb0Var8.r.messages.size() > 0 && (message4 = qb0Var8.r.messages.get(0).messageOwner) != null) {
                                            message4.invert_media = messagePreviewParams8.webpageTop;
                                        }
                                        if (qb0Var8.r.previewMessages.size() > 0 && (message3 = qb0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                            message3.invert_media = messagePreviewParams8.webpageTop;
                                        }
                                        qb0Var8.h();
                                        qb0Var8.U = true;
                                        break;
                                }
                            }
                        });
                        qb0Var2 = qb0Var3;
                        viewOutlineProvider = null;
                    }
                }
            } else {
                if (!UserConfig.getInstance(wb0Var.w).isPremium()) {
                    for (int i20 = 0; i20 < messagePreviewParams.forwardMessages.messages.size(); i20++) {
                        if (messagePreviewParams.forwardMessages.messages.get(i20).type == 36) {
                            z10 = false;
                            break;
                        }
                    }
                }
                z10 = true;
                vb0 vb0Var5 = new vb0(context, R.raw.name_hide, LocaleController.getString(messagePreviewParams.multipleUsers ? R.string.ShowSenderNames : R.string.ShowSendersName), R.raw.name_show, LocaleController.getString(messagePreviewParams.multipleUsers ? R.string.HideSenderNames : R.string.HideSendersName), wb0Var.F);
                this.s.a(vb0Var5, w7.x5.n(-1, 48));
                if (messagePreviewParams.hasCaption) {
                    vb0 vb0Var6 = new vb0(context, R.raw.caption_hide, LocaleController.getString(R.string.ShowCaption), R.raw.caption_show, LocaleController.getString(R.string.HideCaption), wb0Var.F);
                    vb0Var6.a(messagePreviewParams.hideCaption, false);
                    this.s.a(vb0Var6, w7.x5.n(-1, 48));
                    vb0Var = vb0Var6;
                } else {
                    vb0Var = null;
                }
                org.telegram.ui.ActionBar.f1 f1Var3 = new org.telegram.ui.ActionBar.f1(0, context, wb0Var.F, true, false);
                final int i21 = 7;
                f1Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ya0
                    public final /* synthetic */ qb0 b;

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
                                qb0 qb0Var4 = this.b;
                                qb0Var4.c0.d.quote = null;
                                qb0Var4.e.f(false);
                                qb0Var4.g(false, false);
                                qb0Var4.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                qb0 qb0Var5 = this.b;
                                hb0 hb0Var2 = qb0Var5.e;
                                wb0 wb0Var2 = qb0Var5.c0;
                                if (qb0Var5.c(null) != null) {
                                    if (hb0Var2.v - hb0Var2.u <= MessagesController.getInstance(wb0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.y9 y9Var = hb0Var2.W;
                                        MessageObject c11 = qb0Var5.c(y9Var != null ? ((org.telegram.ui.Cells.t1) y9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams4 = wb0Var2.d;
                                        int i172 = hb0Var2.u;
                                        messagePreviewParams4.quoteStart = i172;
                                        int i182 = hb0Var2.v;
                                        messagePreviewParams4.quoteEnd = i182;
                                        messagePreviewParams4.quote = org.telegram.ui.sn.b(i172, i182, c11);
                                        wb0Var2.b();
                                        wb0Var2.a(true);
                                        break;
                                    } else {
                                        qb0Var5.f();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                qb0 qb0Var6 = this.b;
                                hb0 hb0Var3 = qb0Var6.e;
                                wb0 wb0Var3 = qb0Var6.c0;
                                MessagePreviewParams messagePreviewParams5 = wb0Var3.d;
                                int i192 = wb0Var3.w;
                                boolean z13 = wb0Var3.b;
                                if (messagePreviewParams5.quote != null && !z13) {
                                    messagePreviewParams5.quote = null;
                                    hb0Var3.f(false);
                                    qb0Var6.g(false, true);
                                    qb0Var6.k(true);
                                    break;
                                } else if (hb0Var3.v - hb0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                    MessageObject c12 = qb0Var6.c(null);
                                    if (c12 != null) {
                                        if (!hb0Var3.y()) {
                                            messagePreviewParams5.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                            messagePreviewParams5.quoteEnd = min;
                                            messagePreviewParams5.quote = org.telegram.ui.sn.b(messagePreviewParams5.quoteStart, min, c12);
                                            View d10 = qb0Var6.d();
                                            if (d10 instanceof org.telegram.ui.Cells.t1) {
                                                hb0Var3.a0((org.telegram.ui.Cells.t1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            }
                                            if (!z13) {
                                                qb0Var6.s.getSwipeBack().e(qb0Var6.I);
                                            }
                                            qb0Var6.g(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams5.quoteStart = hb0Var3.u;
                                            messagePreviewParams5.quoteEnd = hb0Var3.v;
                                            org.telegram.ui.Cells.y9 y9Var2 = hb0Var3.W;
                                            messagePreviewParams5.quote = org.telegram.ui.sn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, qb0Var6.c(y9Var2 != null ? ((org.telegram.ui.Cells.t1) y9Var2).getMessageObject() : null));
                                            wb0Var3.b();
                                            wb0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    qb0Var6.f();
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
                                wb0 wb0Var4 = this.b.c0;
                                if (!wb0Var4.b) {
                                    org.telegram.ui.il ilVar = (org.telegram.ui.il) wb0Var4;
                                    ilVar.a(true);
                                    org.telegram.ui.co coVar = ilVar.H;
                                    coVar.n5 = null;
                                    coVar.l5 = null;
                                    coVar.f5.updateReply(null, null, coVar.T5, null);
                                    coVar.j8();
                                    break;
                                } else {
                                    org.telegram.ui.il ilVar2 = (org.telegram.ui.il) wb0Var4;
                                    ilVar2.a(true);
                                    org.telegram.ui.co coVar2 = ilVar2.H;
                                    coVar2.l5 = null;
                                    coVar2.Bb(coVar2.n5);
                                    break;
                                }
                            case 7:
                                this.b.c0.c(true);
                                break;
                            case 8:
                                this.b.c0.a(true);
                                break;
                            case 9:
                                org.telegram.ui.il ilVar3 = (org.telegram.ui.il) this.b.c0;
                                ilVar3.a(true);
                                org.telegram.ui.co coVar3 = ilVar3.H;
                                coVar3.f5.updateForward(null, coVar3.T5);
                                coVar3.j8();
                                break;
                            case 10:
                                this.b.c0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.il ilVar4 = (org.telegram.ui.il) this.b.c0;
                                ilVar4.a(true);
                                org.telegram.ui.co coVar4 = ilVar4.H;
                                coVar4.G5 = null;
                                org.telegram.ui.mk mkVar = coVar4.Y;
                                if (mkVar != null) {
                                    mkVar.W2 = null;
                                    mkVar.X2 = false;
                                }
                                MessagePreviewParams messagePreviewParams6 = coVar4.f5;
                                if (messagePreviewParams6 != null) {
                                    i162 = ((org.telegram.ui.ActionBar.n2) coVar4).currentAccount;
                                    MessageObject messageObject = coVar4.n5;
                                    messagePreviewParams6.updateLink(i162, null, null, messageObject == coVar4.X3 ? null : messageObject, coVar4.l5, coVar4.p5);
                                }
                                coVar4.j8();
                                break;
                            case 12:
                                qb0 qb0Var7 = this.b;
                                MessagePreviewParams messagePreviewParams7 = qb0Var7.c0.d;
                                if (messagePreviewParams7.hasMedia) {
                                    boolean z14 = !messagePreviewParams7.webpageSmall;
                                    messagePreviewParams7.webpageSmall = z14;
                                    qb0Var7.G.a(z14, true);
                                    qb0Var7.H.a(messagePreviewParams7.webpageSmall, true);
                                    if (qb0Var7.r.messages.size() > 0 && (message2 = qb0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z15 = messagePreviewParams7.webpageSmall;
                                        messageMedia2.force_small_media = z15;
                                        messageMedia2.force_large_media = !z15;
                                    }
                                    if (qb0Var7.r.previewMessages.size() > 0 && (message = qb0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z16 = messagePreviewParams7.webpageSmall;
                                        messageMedia.force_small_media = z16;
                                        messageMedia.force_large_media = !z16;
                                    }
                                    qb0Var7.h();
                                    qb0Var7.U = true;
                                    break;
                                }
                                break;
                            default:
                                qb0 qb0Var8 = this.b;
                                MessagePreviewParams messagePreviewParams8 = qb0Var8.c0.d;
                                boolean z17 = messagePreviewParams8.webpageTop;
                                messagePreviewParams8.webpageTop = !z17;
                                qb0Var8.E.a(z17, true);
                                if (qb0Var8.r.messages.size() > 0 && (message4 = qb0Var8.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams8.webpageTop;
                                }
                                if (qb0Var8.r.previewMessages.size() > 0 && (message3 = qb0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams8.webpageTop;
                                }
                                qb0Var8.h();
                                qb0Var8.U = true;
                                break;
                        }
                    }
                });
                f1Var3.g(LocaleController.getString(R.string.ChangeRecipient), R.drawable.msg_forward_replace, null);
                this.s.a(f1Var3, w7.x5.n(-1, 48));
                org.telegram.ui.ActionBar.k1 k1Var2 = new org.telegram.ui.ActionBar.k1(context, sb0Var);
                k1Var2.setColor(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, sb0Var)));
                k1Var2.setTag(R.id.fit_width_tag, 1);
                this.s.a(k1Var2, w7.x5.n(-1, 8));
                org.telegram.ui.ActionBar.f1 f1Var4 = new org.telegram.ui.ActionBar.f1(1, context, wb0Var.F, false, false);
                f1Var4.g(LocaleController.getString(R.string.ApplyChanges), R.drawable.msg_select, null);
                final int i22 = 8;
                f1Var4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ya0
                    public final /* synthetic */ qb0 b;

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
                                qb0 qb0Var4 = this.b;
                                qb0Var4.c0.d.quote = null;
                                qb0Var4.e.f(false);
                                qb0Var4.g(false, false);
                                qb0Var4.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                qb0 qb0Var5 = this.b;
                                hb0 hb0Var2 = qb0Var5.e;
                                wb0 wb0Var2 = qb0Var5.c0;
                                if (qb0Var5.c(null) != null) {
                                    if (hb0Var2.v - hb0Var2.u <= MessagesController.getInstance(wb0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.y9 y9Var = hb0Var2.W;
                                        MessageObject c11 = qb0Var5.c(y9Var != null ? ((org.telegram.ui.Cells.t1) y9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams4 = wb0Var2.d;
                                        int i172 = hb0Var2.u;
                                        messagePreviewParams4.quoteStart = i172;
                                        int i182 = hb0Var2.v;
                                        messagePreviewParams4.quoteEnd = i182;
                                        messagePreviewParams4.quote = org.telegram.ui.sn.b(i172, i182, c11);
                                        wb0Var2.b();
                                        wb0Var2.a(true);
                                        break;
                                    } else {
                                        qb0Var5.f();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                qb0 qb0Var6 = this.b;
                                hb0 hb0Var3 = qb0Var6.e;
                                wb0 wb0Var3 = qb0Var6.c0;
                                MessagePreviewParams messagePreviewParams5 = wb0Var3.d;
                                int i192 = wb0Var3.w;
                                boolean z13 = wb0Var3.b;
                                if (messagePreviewParams5.quote != null && !z13) {
                                    messagePreviewParams5.quote = null;
                                    hb0Var3.f(false);
                                    qb0Var6.g(false, true);
                                    qb0Var6.k(true);
                                    break;
                                } else if (hb0Var3.v - hb0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                    MessageObject c12 = qb0Var6.c(null);
                                    if (c12 != null) {
                                        if (!hb0Var3.y()) {
                                            messagePreviewParams5.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                            messagePreviewParams5.quoteEnd = min;
                                            messagePreviewParams5.quote = org.telegram.ui.sn.b(messagePreviewParams5.quoteStart, min, c12);
                                            View d10 = qb0Var6.d();
                                            if (d10 instanceof org.telegram.ui.Cells.t1) {
                                                hb0Var3.a0((org.telegram.ui.Cells.t1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            }
                                            if (!z13) {
                                                qb0Var6.s.getSwipeBack().e(qb0Var6.I);
                                            }
                                            qb0Var6.g(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams5.quoteStart = hb0Var3.u;
                                            messagePreviewParams5.quoteEnd = hb0Var3.v;
                                            org.telegram.ui.Cells.y9 y9Var2 = hb0Var3.W;
                                            messagePreviewParams5.quote = org.telegram.ui.sn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, qb0Var6.c(y9Var2 != null ? ((org.telegram.ui.Cells.t1) y9Var2).getMessageObject() : null));
                                            wb0Var3.b();
                                            wb0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    qb0Var6.f();
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
                                wb0 wb0Var4 = this.b.c0;
                                if (!wb0Var4.b) {
                                    org.telegram.ui.il ilVar = (org.telegram.ui.il) wb0Var4;
                                    ilVar.a(true);
                                    org.telegram.ui.co coVar = ilVar.H;
                                    coVar.n5 = null;
                                    coVar.l5 = null;
                                    coVar.f5.updateReply(null, null, coVar.T5, null);
                                    coVar.j8();
                                    break;
                                } else {
                                    org.telegram.ui.il ilVar2 = (org.telegram.ui.il) wb0Var4;
                                    ilVar2.a(true);
                                    org.telegram.ui.co coVar2 = ilVar2.H;
                                    coVar2.l5 = null;
                                    coVar2.Bb(coVar2.n5);
                                    break;
                                }
                            case 7:
                                this.b.c0.c(true);
                                break;
                            case 8:
                                this.b.c0.a(true);
                                break;
                            case 9:
                                org.telegram.ui.il ilVar3 = (org.telegram.ui.il) this.b.c0;
                                ilVar3.a(true);
                                org.telegram.ui.co coVar3 = ilVar3.H;
                                coVar3.f5.updateForward(null, coVar3.T5);
                                coVar3.j8();
                                break;
                            case 10:
                                this.b.c0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.il ilVar4 = (org.telegram.ui.il) this.b.c0;
                                ilVar4.a(true);
                                org.telegram.ui.co coVar4 = ilVar4.H;
                                coVar4.G5 = null;
                                org.telegram.ui.mk mkVar = coVar4.Y;
                                if (mkVar != null) {
                                    mkVar.W2 = null;
                                    mkVar.X2 = false;
                                }
                                MessagePreviewParams messagePreviewParams6 = coVar4.f5;
                                if (messagePreviewParams6 != null) {
                                    i162 = ((org.telegram.ui.ActionBar.n2) coVar4).currentAccount;
                                    MessageObject messageObject = coVar4.n5;
                                    messagePreviewParams6.updateLink(i162, null, null, messageObject == coVar4.X3 ? null : messageObject, coVar4.l5, coVar4.p5);
                                }
                                coVar4.j8();
                                break;
                            case 12:
                                qb0 qb0Var7 = this.b;
                                MessagePreviewParams messagePreviewParams7 = qb0Var7.c0.d;
                                if (messagePreviewParams7.hasMedia) {
                                    boolean z14 = !messagePreviewParams7.webpageSmall;
                                    messagePreviewParams7.webpageSmall = z14;
                                    qb0Var7.G.a(z14, true);
                                    qb0Var7.H.a(messagePreviewParams7.webpageSmall, true);
                                    if (qb0Var7.r.messages.size() > 0 && (message2 = qb0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z15 = messagePreviewParams7.webpageSmall;
                                        messageMedia2.force_small_media = z15;
                                        messageMedia2.force_large_media = !z15;
                                    }
                                    if (qb0Var7.r.previewMessages.size() > 0 && (message = qb0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z16 = messagePreviewParams7.webpageSmall;
                                        messageMedia.force_small_media = z16;
                                        messageMedia.force_large_media = !z16;
                                    }
                                    qb0Var7.h();
                                    qb0Var7.U = true;
                                    break;
                                }
                                break;
                            default:
                                qb0 qb0Var8 = this.b;
                                MessagePreviewParams messagePreviewParams8 = qb0Var8.c0.d;
                                boolean z17 = messagePreviewParams8.webpageTop;
                                messagePreviewParams8.webpageTop = !z17;
                                qb0Var8.E.a(z17, true);
                                if (qb0Var8.r.messages.size() > 0 && (message4 = qb0Var8.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams8.webpageTop;
                                }
                                if (qb0Var8.r.previewMessages.size() > 0 && (message3 = qb0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams8.webpageTop;
                                }
                                qb0Var8.h();
                                qb0Var8.U = true;
                                break;
                        }
                    }
                });
                this.s.a(f1Var4, w7.x5.n(-1, 48));
                org.telegram.ui.ActionBar.f1 f1Var5 = new org.telegram.ui.ActionBar.f1(1, context, wb0Var.F, false, true);
                f1Var5.g(LocaleController.getString(R.string.DoNotForward), R.drawable.msg_delete, null);
                int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q7, sb0Var);
                int i23 = org.telegram.ui.ActionBar.j6.p7;
                f1Var5.c(v03, org.telegram.ui.ActionBar.j6.v0(i23, sb0Var));
                final int i24 = 9;
                f1Var5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ya0
                    public final /* synthetic */ qb0 b;

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
                                qb0 qb0Var4 = this.b;
                                qb0Var4.c0.d.quote = null;
                                qb0Var4.e.f(false);
                                qb0Var4.g(false, false);
                                qb0Var4.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                qb0 qb0Var5 = this.b;
                                hb0 hb0Var2 = qb0Var5.e;
                                wb0 wb0Var2 = qb0Var5.c0;
                                if (qb0Var5.c(null) != null) {
                                    if (hb0Var2.v - hb0Var2.u <= MessagesController.getInstance(wb0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.y9 y9Var = hb0Var2.W;
                                        MessageObject c11 = qb0Var5.c(y9Var != null ? ((org.telegram.ui.Cells.t1) y9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams4 = wb0Var2.d;
                                        int i172 = hb0Var2.u;
                                        messagePreviewParams4.quoteStart = i172;
                                        int i182 = hb0Var2.v;
                                        messagePreviewParams4.quoteEnd = i182;
                                        messagePreviewParams4.quote = org.telegram.ui.sn.b(i172, i182, c11);
                                        wb0Var2.b();
                                        wb0Var2.a(true);
                                        break;
                                    } else {
                                        qb0Var5.f();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                qb0 qb0Var6 = this.b;
                                hb0 hb0Var3 = qb0Var6.e;
                                wb0 wb0Var3 = qb0Var6.c0;
                                MessagePreviewParams messagePreviewParams5 = wb0Var3.d;
                                int i192 = wb0Var3.w;
                                boolean z13 = wb0Var3.b;
                                if (messagePreviewParams5.quote != null && !z13) {
                                    messagePreviewParams5.quote = null;
                                    hb0Var3.f(false);
                                    qb0Var6.g(false, true);
                                    qb0Var6.k(true);
                                    break;
                                } else if (hb0Var3.v - hb0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                    MessageObject c12 = qb0Var6.c(null);
                                    if (c12 != null) {
                                        if (!hb0Var3.y()) {
                                            messagePreviewParams5.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                            messagePreviewParams5.quoteEnd = min;
                                            messagePreviewParams5.quote = org.telegram.ui.sn.b(messagePreviewParams5.quoteStart, min, c12);
                                            View d10 = qb0Var6.d();
                                            if (d10 instanceof org.telegram.ui.Cells.t1) {
                                                hb0Var3.a0((org.telegram.ui.Cells.t1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            }
                                            if (!z13) {
                                                qb0Var6.s.getSwipeBack().e(qb0Var6.I);
                                            }
                                            qb0Var6.g(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams5.quoteStart = hb0Var3.u;
                                            messagePreviewParams5.quoteEnd = hb0Var3.v;
                                            org.telegram.ui.Cells.y9 y9Var2 = hb0Var3.W;
                                            messagePreviewParams5.quote = org.telegram.ui.sn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, qb0Var6.c(y9Var2 != null ? ((org.telegram.ui.Cells.t1) y9Var2).getMessageObject() : null));
                                            wb0Var3.b();
                                            wb0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    qb0Var6.f();
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
                                wb0 wb0Var4 = this.b.c0;
                                if (!wb0Var4.b) {
                                    org.telegram.ui.il ilVar = (org.telegram.ui.il) wb0Var4;
                                    ilVar.a(true);
                                    org.telegram.ui.co coVar = ilVar.H;
                                    coVar.n5 = null;
                                    coVar.l5 = null;
                                    coVar.f5.updateReply(null, null, coVar.T5, null);
                                    coVar.j8();
                                    break;
                                } else {
                                    org.telegram.ui.il ilVar2 = (org.telegram.ui.il) wb0Var4;
                                    ilVar2.a(true);
                                    org.telegram.ui.co coVar2 = ilVar2.H;
                                    coVar2.l5 = null;
                                    coVar2.Bb(coVar2.n5);
                                    break;
                                }
                            case 7:
                                this.b.c0.c(true);
                                break;
                            case 8:
                                this.b.c0.a(true);
                                break;
                            case 9:
                                org.telegram.ui.il ilVar3 = (org.telegram.ui.il) this.b.c0;
                                ilVar3.a(true);
                                org.telegram.ui.co coVar3 = ilVar3.H;
                                coVar3.f5.updateForward(null, coVar3.T5);
                                coVar3.j8();
                                break;
                            case 10:
                                this.b.c0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.il ilVar4 = (org.telegram.ui.il) this.b.c0;
                                ilVar4.a(true);
                                org.telegram.ui.co coVar4 = ilVar4.H;
                                coVar4.G5 = null;
                                org.telegram.ui.mk mkVar = coVar4.Y;
                                if (mkVar != null) {
                                    mkVar.W2 = null;
                                    mkVar.X2 = false;
                                }
                                MessagePreviewParams messagePreviewParams6 = coVar4.f5;
                                if (messagePreviewParams6 != null) {
                                    i162 = ((org.telegram.ui.ActionBar.n2) coVar4).currentAccount;
                                    MessageObject messageObject = coVar4.n5;
                                    messagePreviewParams6.updateLink(i162, null, null, messageObject == coVar4.X3 ? null : messageObject, coVar4.l5, coVar4.p5);
                                }
                                coVar4.j8();
                                break;
                            case 12:
                                qb0 qb0Var7 = this.b;
                                MessagePreviewParams messagePreviewParams7 = qb0Var7.c0.d;
                                if (messagePreviewParams7.hasMedia) {
                                    boolean z14 = !messagePreviewParams7.webpageSmall;
                                    messagePreviewParams7.webpageSmall = z14;
                                    qb0Var7.G.a(z14, true);
                                    qb0Var7.H.a(messagePreviewParams7.webpageSmall, true);
                                    if (qb0Var7.r.messages.size() > 0 && (message2 = qb0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z15 = messagePreviewParams7.webpageSmall;
                                        messageMedia2.force_small_media = z15;
                                        messageMedia2.force_large_media = !z15;
                                    }
                                    if (qb0Var7.r.previewMessages.size() > 0 && (message = qb0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z16 = messagePreviewParams7.webpageSmall;
                                        messageMedia.force_small_media = z16;
                                        messageMedia.force_large_media = !z16;
                                    }
                                    qb0Var7.h();
                                    qb0Var7.U = true;
                                    break;
                                }
                                break;
                            default:
                                qb0 qb0Var8 = this.b;
                                MessagePreviewParams messagePreviewParams8 = qb0Var8.c0.d;
                                boolean z17 = messagePreviewParams8.webpageTop;
                                messagePreviewParams8.webpageTop = !z17;
                                qb0Var8.E.a(z17, true);
                                if (qb0Var8.r.messages.size() > 0 && (message4 = qb0Var8.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams8.webpageTop;
                                }
                                if (qb0Var8.r.previewMessages.size() > 0 && (message3 = qb0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams8.webpageTop;
                                }
                                qb0Var8.h();
                                qb0Var8.U = true;
                                break;
                        }
                    }
                });
                f1Var5.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.w0(null, i23, false)));
                this.s.a(f1Var5, w7.x5.n(-1, 48));
                vb0Var5.a(messagePreviewParams.hideForwardSendersName, false);
                vb0 vb0Var7 = vb0Var;
                qb0 qb0Var4 = this;
                vb0Var5.setOnClickListener(new cb0(this, z10, context, vb0Var7, vb0Var5, 0));
                qb0Var = qb0Var4;
                if (vb0Var7 != null) {
                    vb0Var7.setOnClickListener(new bi.x(qb0Var4, vb0Var7, vb0Var5, 24));
                    qb0Var = qb0Var4;
                }
            }
            context2 = context;
            qb0Var2 = qb0Var;
            viewOutlineProvider = null;
        } else {
            if (!messages.hasText || messagePreviewParams3.isSecret) {
                r11 = 0;
                messagePreviewParams2 = messagePreviewParams3;
            } else {
                LinearLayout f7 = org.telegram.messenger.wl.f(context3, 1);
                if (z12) {
                    linearLayout = f7;
                    drawable = null;
                    z11 = true;
                } else {
                    ?? r92 = f7;
                    drawable = null;
                    org.telegram.ui.ActionBar.f1 f1Var6 = new org.telegram.ui.ActionBar.f1(0, context3, wb0Var.F, true, false);
                    f1Var6.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                    f1Var6.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ya0
                        public final /* synthetic */ qb0 b;

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
                                    qb0 qb0Var42 = this.b;
                                    qb0Var42.c0.d.quote = null;
                                    qb0Var42.e.f(false);
                                    qb0Var42.g(false, false);
                                    qb0Var42.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    qb0 qb0Var5 = this.b;
                                    hb0 hb0Var2 = qb0Var5.e;
                                    wb0 wb0Var2 = qb0Var5.c0;
                                    if (qb0Var5.c(null) != null) {
                                        if (hb0Var2.v - hb0Var2.u <= MessagesController.getInstance(wb0Var2.w).quoteLengthMax) {
                                            org.telegram.ui.Cells.y9 y9Var = hb0Var2.W;
                                            MessageObject c11 = qb0Var5.c(y9Var != null ? ((org.telegram.ui.Cells.t1) y9Var).getMessageObject() : null);
                                            MessagePreviewParams messagePreviewParams4 = wb0Var2.d;
                                            int i172 = hb0Var2.u;
                                            messagePreviewParams4.quoteStart = i172;
                                            int i182 = hb0Var2.v;
                                            messagePreviewParams4.quoteEnd = i182;
                                            messagePreviewParams4.quote = org.telegram.ui.sn.b(i172, i182, c11);
                                            wb0Var2.b();
                                            wb0Var2.a(true);
                                            break;
                                        } else {
                                            qb0Var5.f();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    qb0 qb0Var6 = this.b;
                                    hb0 hb0Var3 = qb0Var6.e;
                                    wb0 wb0Var3 = qb0Var6.c0;
                                    MessagePreviewParams messagePreviewParams5 = wb0Var3.d;
                                    int i192 = wb0Var3.w;
                                    boolean z13 = wb0Var3.b;
                                    if (messagePreviewParams5.quote != null && !z13) {
                                        messagePreviewParams5.quote = null;
                                        hb0Var3.f(false);
                                        qb0Var6.g(false, true);
                                        qb0Var6.k(true);
                                        break;
                                    } else if (hb0Var3.v - hb0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                        MessageObject c12 = qb0Var6.c(null);
                                        if (c12 != null) {
                                            if (!hb0Var3.y()) {
                                                messagePreviewParams5.quoteStart = 0;
                                                int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                                messagePreviewParams5.quoteEnd = min;
                                                messagePreviewParams5.quote = org.telegram.ui.sn.b(messagePreviewParams5.quoteStart, min, c12);
                                                View d10 = qb0Var6.d();
                                                if (d10 instanceof org.telegram.ui.Cells.t1) {
                                                    hb0Var3.a0((org.telegram.ui.Cells.t1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                }
                                                if (!z13) {
                                                    qb0Var6.s.getSwipeBack().e(qb0Var6.I);
                                                }
                                                qb0Var6.g(true, true);
                                                break;
                                            } else {
                                                messagePreviewParams5.quoteStart = hb0Var3.u;
                                                messagePreviewParams5.quoteEnd = hb0Var3.v;
                                                org.telegram.ui.Cells.y9 y9Var2 = hb0Var3.W;
                                                messagePreviewParams5.quote = org.telegram.ui.sn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, qb0Var6.c(y9Var2 != null ? ((org.telegram.ui.Cells.t1) y9Var2).getMessageObject() : null));
                                                wb0Var3.b();
                                                wb0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        qb0Var6.f();
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
                                    wb0 wb0Var4 = this.b.c0;
                                    if (!wb0Var4.b) {
                                        org.telegram.ui.il ilVar = (org.telegram.ui.il) wb0Var4;
                                        ilVar.a(true);
                                        org.telegram.ui.co coVar = ilVar.H;
                                        coVar.n5 = null;
                                        coVar.l5 = null;
                                        coVar.f5.updateReply(null, null, coVar.T5, null);
                                        coVar.j8();
                                        break;
                                    } else {
                                        org.telegram.ui.il ilVar2 = (org.telegram.ui.il) wb0Var4;
                                        ilVar2.a(true);
                                        org.telegram.ui.co coVar2 = ilVar2.H;
                                        coVar2.l5 = null;
                                        coVar2.Bb(coVar2.n5);
                                        break;
                                    }
                                case 7:
                                    this.b.c0.c(true);
                                    break;
                                case 8:
                                    this.b.c0.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.il ilVar3 = (org.telegram.ui.il) this.b.c0;
                                    ilVar3.a(true);
                                    org.telegram.ui.co coVar3 = ilVar3.H;
                                    coVar3.f5.updateForward(null, coVar3.T5);
                                    coVar3.j8();
                                    break;
                                case 10:
                                    this.b.c0.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.il ilVar4 = (org.telegram.ui.il) this.b.c0;
                                    ilVar4.a(true);
                                    org.telegram.ui.co coVar4 = ilVar4.H;
                                    coVar4.G5 = null;
                                    org.telegram.ui.mk mkVar = coVar4.Y;
                                    if (mkVar != null) {
                                        mkVar.W2 = null;
                                        mkVar.X2 = false;
                                    }
                                    MessagePreviewParams messagePreviewParams6 = coVar4.f5;
                                    if (messagePreviewParams6 != null) {
                                        i162 = ((org.telegram.ui.ActionBar.n2) coVar4).currentAccount;
                                        MessageObject messageObject = coVar4.n5;
                                        messagePreviewParams6.updateLink(i162, null, null, messageObject == coVar4.X3 ? null : messageObject, coVar4.l5, coVar4.p5);
                                    }
                                    coVar4.j8();
                                    break;
                                case 12:
                                    qb0 qb0Var7 = this.b;
                                    MessagePreviewParams messagePreviewParams7 = qb0Var7.c0.d;
                                    if (messagePreviewParams7.hasMedia) {
                                        boolean z14 = !messagePreviewParams7.webpageSmall;
                                        messagePreviewParams7.webpageSmall = z14;
                                        qb0Var7.G.a(z14, true);
                                        qb0Var7.H.a(messagePreviewParams7.webpageSmall, true);
                                        if (qb0Var7.r.messages.size() > 0 && (message2 = qb0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z15 = messagePreviewParams7.webpageSmall;
                                            messageMedia2.force_small_media = z15;
                                            messageMedia2.force_large_media = !z15;
                                        }
                                        if (qb0Var7.r.previewMessages.size() > 0 && (message = qb0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                            boolean z16 = messagePreviewParams7.webpageSmall;
                                            messageMedia.force_small_media = z16;
                                            messageMedia.force_large_media = !z16;
                                        }
                                        qb0Var7.h();
                                        qb0Var7.U = true;
                                        break;
                                    }
                                    break;
                                default:
                                    qb0 qb0Var8 = this.b;
                                    MessagePreviewParams messagePreviewParams8 = qb0Var8.c0.d;
                                    boolean z17 = messagePreviewParams8.webpageTop;
                                    messagePreviewParams8.webpageTop = !z17;
                                    qb0Var8.E.a(z17, true);
                                    if (qb0Var8.r.messages.size() > 0 && (message4 = qb0Var8.r.messages.get(0).messageOwner) != null) {
                                        message4.invert_media = messagePreviewParams8.webpageTop;
                                    }
                                    if (qb0Var8.r.previewMessages.size() > 0 && (message3 = qb0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                        message3.invert_media = messagePreviewParams8.webpageTop;
                                    }
                                    qb0Var8.h();
                                    qb0Var8.U = true;
                                    break;
                            }
                        }
                    });
                    r92.addView(f1Var6, w7.x5.n(-1, 48));
                    org.telegram.ui.ActionBar.k1 k1Var3 = new org.telegram.ui.ActionBar.k1(context3, sb0Var);
                    k1Var3.setColor(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, sb0Var)));
                    k1Var3.setTag(R.id.fit_width_tag, 1);
                    r92.addView(k1Var3, w7.x5.n(-1, 8));
                    org.telegram.ui.ActionBar.f1 f1Var7 = new org.telegram.ui.ActionBar.f1(0, context3, wb0Var.F, false, true);
                    f1Var7.g(LocaleController.getString(R.string.QuoteSelectedPart), R.drawable.menu_quote_specific, null);
                    z11 = true;
                    final boolean z13 = true ? 1 : 0;
                    f1Var7.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ya0
                        public final /* synthetic */ qb0 b;

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
                                    qb0 qb0Var42 = this.b;
                                    qb0Var42.c0.d.quote = null;
                                    qb0Var42.e.f(false);
                                    qb0Var42.g(false, false);
                                    qb0Var42.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    qb0 qb0Var5 = this.b;
                                    hb0 hb0Var2 = qb0Var5.e;
                                    wb0 wb0Var2 = qb0Var5.c0;
                                    if (qb0Var5.c(null) != null) {
                                        if (hb0Var2.v - hb0Var2.u <= MessagesController.getInstance(wb0Var2.w).quoteLengthMax) {
                                            org.telegram.ui.Cells.y9 y9Var = hb0Var2.W;
                                            MessageObject c11 = qb0Var5.c(y9Var != null ? ((org.telegram.ui.Cells.t1) y9Var).getMessageObject() : null);
                                            MessagePreviewParams messagePreviewParams4 = wb0Var2.d;
                                            int i172 = hb0Var2.u;
                                            messagePreviewParams4.quoteStart = i172;
                                            int i182 = hb0Var2.v;
                                            messagePreviewParams4.quoteEnd = i182;
                                            messagePreviewParams4.quote = org.telegram.ui.sn.b(i172, i182, c11);
                                            wb0Var2.b();
                                            wb0Var2.a(true);
                                            break;
                                        } else {
                                            qb0Var5.f();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    qb0 qb0Var6 = this.b;
                                    hb0 hb0Var3 = qb0Var6.e;
                                    wb0 wb0Var3 = qb0Var6.c0;
                                    MessagePreviewParams messagePreviewParams5 = wb0Var3.d;
                                    int i192 = wb0Var3.w;
                                    boolean z132 = wb0Var3.b;
                                    if (messagePreviewParams5.quote != null && !z132) {
                                        messagePreviewParams5.quote = null;
                                        hb0Var3.f(false);
                                        qb0Var6.g(false, true);
                                        qb0Var6.k(true);
                                        break;
                                    } else if (hb0Var3.v - hb0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                        MessageObject c12 = qb0Var6.c(null);
                                        if (c12 != null) {
                                            if (!hb0Var3.y()) {
                                                messagePreviewParams5.quoteStart = 0;
                                                int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                                messagePreviewParams5.quoteEnd = min;
                                                messagePreviewParams5.quote = org.telegram.ui.sn.b(messagePreviewParams5.quoteStart, min, c12);
                                                View d10 = qb0Var6.d();
                                                if (d10 instanceof org.telegram.ui.Cells.t1) {
                                                    hb0Var3.a0((org.telegram.ui.Cells.t1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                }
                                                if (!z132) {
                                                    qb0Var6.s.getSwipeBack().e(qb0Var6.I);
                                                }
                                                qb0Var6.g(true, true);
                                                break;
                                            } else {
                                                messagePreviewParams5.quoteStart = hb0Var3.u;
                                                messagePreviewParams5.quoteEnd = hb0Var3.v;
                                                org.telegram.ui.Cells.y9 y9Var2 = hb0Var3.W;
                                                messagePreviewParams5.quote = org.telegram.ui.sn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, qb0Var6.c(y9Var2 != null ? ((org.telegram.ui.Cells.t1) y9Var2).getMessageObject() : null));
                                                wb0Var3.b();
                                                wb0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        qb0Var6.f();
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
                                    wb0 wb0Var4 = this.b.c0;
                                    if (!wb0Var4.b) {
                                        org.telegram.ui.il ilVar = (org.telegram.ui.il) wb0Var4;
                                        ilVar.a(true);
                                        org.telegram.ui.co coVar = ilVar.H;
                                        coVar.n5 = null;
                                        coVar.l5 = null;
                                        coVar.f5.updateReply(null, null, coVar.T5, null);
                                        coVar.j8();
                                        break;
                                    } else {
                                        org.telegram.ui.il ilVar2 = (org.telegram.ui.il) wb0Var4;
                                        ilVar2.a(true);
                                        org.telegram.ui.co coVar2 = ilVar2.H;
                                        coVar2.l5 = null;
                                        coVar2.Bb(coVar2.n5);
                                        break;
                                    }
                                case 7:
                                    this.b.c0.c(true);
                                    break;
                                case 8:
                                    this.b.c0.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.il ilVar3 = (org.telegram.ui.il) this.b.c0;
                                    ilVar3.a(true);
                                    org.telegram.ui.co coVar3 = ilVar3.H;
                                    coVar3.f5.updateForward(null, coVar3.T5);
                                    coVar3.j8();
                                    break;
                                case 10:
                                    this.b.c0.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.il ilVar4 = (org.telegram.ui.il) this.b.c0;
                                    ilVar4.a(true);
                                    org.telegram.ui.co coVar4 = ilVar4.H;
                                    coVar4.G5 = null;
                                    org.telegram.ui.mk mkVar = coVar4.Y;
                                    if (mkVar != null) {
                                        mkVar.W2 = null;
                                        mkVar.X2 = false;
                                    }
                                    MessagePreviewParams messagePreviewParams6 = coVar4.f5;
                                    if (messagePreviewParams6 != null) {
                                        i162 = ((org.telegram.ui.ActionBar.n2) coVar4).currentAccount;
                                        MessageObject messageObject = coVar4.n5;
                                        messagePreviewParams6.updateLink(i162, null, null, messageObject == coVar4.X3 ? null : messageObject, coVar4.l5, coVar4.p5);
                                    }
                                    coVar4.j8();
                                    break;
                                case 12:
                                    qb0 qb0Var7 = this.b;
                                    MessagePreviewParams messagePreviewParams7 = qb0Var7.c0.d;
                                    if (messagePreviewParams7.hasMedia) {
                                        boolean z14 = !messagePreviewParams7.webpageSmall;
                                        messagePreviewParams7.webpageSmall = z14;
                                        qb0Var7.G.a(z14, true);
                                        qb0Var7.H.a(messagePreviewParams7.webpageSmall, true);
                                        if (qb0Var7.r.messages.size() > 0 && (message2 = qb0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z15 = messagePreviewParams7.webpageSmall;
                                            messageMedia2.force_small_media = z15;
                                            messageMedia2.force_large_media = !z15;
                                        }
                                        if (qb0Var7.r.previewMessages.size() > 0 && (message = qb0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                            boolean z16 = messagePreviewParams7.webpageSmall;
                                            messageMedia.force_small_media = z16;
                                            messageMedia.force_large_media = !z16;
                                        }
                                        qb0Var7.h();
                                        qb0Var7.U = true;
                                        break;
                                    }
                                    break;
                                default:
                                    qb0 qb0Var8 = this.b;
                                    MessagePreviewParams messagePreviewParams8 = qb0Var8.c0.d;
                                    boolean z17 = messagePreviewParams8.webpageTop;
                                    messagePreviewParams8.webpageTop = !z17;
                                    qb0Var8.E.a(z17, true);
                                    if (qb0Var8.r.messages.size() > 0 && (message4 = qb0Var8.r.messages.get(0).messageOwner) != null) {
                                        message4.invert_media = messagePreviewParams8.webpageTop;
                                    }
                                    if (qb0Var8.r.previewMessages.size() > 0 && (message3 = qb0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                        message3.invert_media = messagePreviewParams8.webpageTop;
                                    }
                                    qb0Var8.h();
                                    qb0Var8.U = true;
                                    break;
                            }
                        }
                    });
                    r92.addView(f1Var7, w7.x5.n(-1, 48));
                    linearLayout = r92;
                }
                this.I = actionBarPopupWindow$ActionBarPopupWindowLayout.b(linearLayout);
                actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().setStickToRight(z11);
                FrameLayout frameLayout2 = new FrameLayout(context3);
                messagePreviewParams2 = messagePreviewParams3;
                gb0 gb0Var = new gb0(1, 0, context, wb0Var.F, true, false);
                this.v = gb0Var;
                gb0Var.g(LocaleController.getString(z12 ? R.string.QuoteSelectedPart : R.string.SelectSpecificQuote), R.drawable.menu_select_quote, drawable);
                gb0 gb0Var2 = new gb0(1, 1, context, wb0Var.F, true, false);
                context3 = context;
                this.w = gb0Var2;
                gb0Var2.g(LocaleController.getString(R.string.ClearQuote), R.drawable.menu_quote_delete, drawable);
                frameLayout2.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.I5, sb0Var), 6, 0));
                final int i25 = 2;
                frameLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ya0
                    public final /* synthetic */ qb0 b;

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
                                qb0 qb0Var42 = this.b;
                                qb0Var42.c0.d.quote = null;
                                qb0Var42.e.f(false);
                                qb0Var42.g(false, false);
                                qb0Var42.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                qb0 qb0Var5 = this.b;
                                hb0 hb0Var2 = qb0Var5.e;
                                wb0 wb0Var2 = qb0Var5.c0;
                                if (qb0Var5.c(null) != null) {
                                    if (hb0Var2.v - hb0Var2.u <= MessagesController.getInstance(wb0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.y9 y9Var = hb0Var2.W;
                                        MessageObject c11 = qb0Var5.c(y9Var != null ? ((org.telegram.ui.Cells.t1) y9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams4 = wb0Var2.d;
                                        int i172 = hb0Var2.u;
                                        messagePreviewParams4.quoteStart = i172;
                                        int i182 = hb0Var2.v;
                                        messagePreviewParams4.quoteEnd = i182;
                                        messagePreviewParams4.quote = org.telegram.ui.sn.b(i172, i182, c11);
                                        wb0Var2.b();
                                        wb0Var2.a(true);
                                        break;
                                    } else {
                                        qb0Var5.f();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                qb0 qb0Var6 = this.b;
                                hb0 hb0Var3 = qb0Var6.e;
                                wb0 wb0Var3 = qb0Var6.c0;
                                MessagePreviewParams messagePreviewParams5 = wb0Var3.d;
                                int i192 = wb0Var3.w;
                                boolean z132 = wb0Var3.b;
                                if (messagePreviewParams5.quote != null && !z132) {
                                    messagePreviewParams5.quote = null;
                                    hb0Var3.f(false);
                                    qb0Var6.g(false, true);
                                    qb0Var6.k(true);
                                    break;
                                } else if (hb0Var3.v - hb0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                    MessageObject c12 = qb0Var6.c(null);
                                    if (c12 != null) {
                                        if (!hb0Var3.y()) {
                                            messagePreviewParams5.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                            messagePreviewParams5.quoteEnd = min;
                                            messagePreviewParams5.quote = org.telegram.ui.sn.b(messagePreviewParams5.quoteStart, min, c12);
                                            View d10 = qb0Var6.d();
                                            if (d10 instanceof org.telegram.ui.Cells.t1) {
                                                hb0Var3.a0((org.telegram.ui.Cells.t1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            }
                                            if (!z132) {
                                                qb0Var6.s.getSwipeBack().e(qb0Var6.I);
                                            }
                                            qb0Var6.g(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams5.quoteStart = hb0Var3.u;
                                            messagePreviewParams5.quoteEnd = hb0Var3.v;
                                            org.telegram.ui.Cells.y9 y9Var2 = hb0Var3.W;
                                            messagePreviewParams5.quote = org.telegram.ui.sn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, qb0Var6.c(y9Var2 != null ? ((org.telegram.ui.Cells.t1) y9Var2).getMessageObject() : null));
                                            wb0Var3.b();
                                            wb0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    qb0Var6.f();
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
                                wb0 wb0Var4 = this.b.c0;
                                if (!wb0Var4.b) {
                                    org.telegram.ui.il ilVar = (org.telegram.ui.il) wb0Var4;
                                    ilVar.a(true);
                                    org.telegram.ui.co coVar = ilVar.H;
                                    coVar.n5 = null;
                                    coVar.l5 = null;
                                    coVar.f5.updateReply(null, null, coVar.T5, null);
                                    coVar.j8();
                                    break;
                                } else {
                                    org.telegram.ui.il ilVar2 = (org.telegram.ui.il) wb0Var4;
                                    ilVar2.a(true);
                                    org.telegram.ui.co coVar2 = ilVar2.H;
                                    coVar2.l5 = null;
                                    coVar2.Bb(coVar2.n5);
                                    break;
                                }
                            case 7:
                                this.b.c0.c(true);
                                break;
                            case 8:
                                this.b.c0.a(true);
                                break;
                            case 9:
                                org.telegram.ui.il ilVar3 = (org.telegram.ui.il) this.b.c0;
                                ilVar3.a(true);
                                org.telegram.ui.co coVar3 = ilVar3.H;
                                coVar3.f5.updateForward(null, coVar3.T5);
                                coVar3.j8();
                                break;
                            case 10:
                                this.b.c0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.il ilVar4 = (org.telegram.ui.il) this.b.c0;
                                ilVar4.a(true);
                                org.telegram.ui.co coVar4 = ilVar4.H;
                                coVar4.G5 = null;
                                org.telegram.ui.mk mkVar = coVar4.Y;
                                if (mkVar != null) {
                                    mkVar.W2 = null;
                                    mkVar.X2 = false;
                                }
                                MessagePreviewParams messagePreviewParams6 = coVar4.f5;
                                if (messagePreviewParams6 != null) {
                                    i162 = ((org.telegram.ui.ActionBar.n2) coVar4).currentAccount;
                                    MessageObject messageObject = coVar4.n5;
                                    messagePreviewParams6.updateLink(i162, null, null, messageObject == coVar4.X3 ? null : messageObject, coVar4.l5, coVar4.p5);
                                }
                                coVar4.j8();
                                break;
                            case 12:
                                qb0 qb0Var7 = this.b;
                                MessagePreviewParams messagePreviewParams7 = qb0Var7.c0.d;
                                if (messagePreviewParams7.hasMedia) {
                                    boolean z14 = !messagePreviewParams7.webpageSmall;
                                    messagePreviewParams7.webpageSmall = z14;
                                    qb0Var7.G.a(z14, true);
                                    qb0Var7.H.a(messagePreviewParams7.webpageSmall, true);
                                    if (qb0Var7.r.messages.size() > 0 && (message2 = qb0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z15 = messagePreviewParams7.webpageSmall;
                                        messageMedia2.force_small_media = z15;
                                        messageMedia2.force_large_media = !z15;
                                    }
                                    if (qb0Var7.r.previewMessages.size() > 0 && (message = qb0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z16 = messagePreviewParams7.webpageSmall;
                                        messageMedia.force_small_media = z16;
                                        messageMedia.force_large_media = !z16;
                                    }
                                    qb0Var7.h();
                                    qb0Var7.U = true;
                                    break;
                                }
                                break;
                            default:
                                qb0 qb0Var8 = this.b;
                                MessagePreviewParams messagePreviewParams8 = qb0Var8.c0.d;
                                boolean z17 = messagePreviewParams8.webpageTop;
                                messagePreviewParams8.webpageTop = !z17;
                                qb0Var8.E.a(z17, true);
                                if (qb0Var8.r.messages.size() > 0 && (message4 = qb0Var8.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams8.webpageTop;
                                }
                                if (qb0Var8.r.previewMessages.size() > 0 && (message3 = qb0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams8.webpageTop;
                                }
                                qb0Var8.h();
                                qb0Var8.U = true;
                                break;
                        }
                    }
                });
                frameLayout2.addView(gb0Var, w7.x5.c(48.0f, -1));
                frameLayout2.addView(gb0Var2, w7.x5.c(48.0f, -1));
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout2, w7.x5.n(-1, 48));
                r11 = drawable;
            }
            messagePreviewParams = messagePreviewParams2;
            if (!messagePreviewParams.monoforum && !messagePreviewParams.noforwards && !messagePreviewParams.hasSecretMessages) {
                ?? frameLayout3 = new FrameLayout(context3);
                ?? f1Var8 = new org.telegram.ui.ActionBar.f1(1, context3, wb0Var.F, false, false);
                this.x = f1Var8;
                f1Var8.g(LocaleController.getString(R.string.ReplyToAnotherChat), R.drawable.msg_forward_replace, r11);
                final int i26 = 3;
                f1Var8.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ya0
                    public final /* synthetic */ qb0 b;

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
                                qb0 qb0Var42 = this.b;
                                qb0Var42.c0.d.quote = null;
                                qb0Var42.e.f(false);
                                qb0Var42.g(false, false);
                                qb0Var42.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                qb0 qb0Var5 = this.b;
                                hb0 hb0Var2 = qb0Var5.e;
                                wb0 wb0Var2 = qb0Var5.c0;
                                if (qb0Var5.c(null) != null) {
                                    if (hb0Var2.v - hb0Var2.u <= MessagesController.getInstance(wb0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.y9 y9Var = hb0Var2.W;
                                        MessageObject c11 = qb0Var5.c(y9Var != null ? ((org.telegram.ui.Cells.t1) y9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams4 = wb0Var2.d;
                                        int i172 = hb0Var2.u;
                                        messagePreviewParams4.quoteStart = i172;
                                        int i182 = hb0Var2.v;
                                        messagePreviewParams4.quoteEnd = i182;
                                        messagePreviewParams4.quote = org.telegram.ui.sn.b(i172, i182, c11);
                                        wb0Var2.b();
                                        wb0Var2.a(true);
                                        break;
                                    } else {
                                        qb0Var5.f();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                qb0 qb0Var6 = this.b;
                                hb0 hb0Var3 = qb0Var6.e;
                                wb0 wb0Var3 = qb0Var6.c0;
                                MessagePreviewParams messagePreviewParams5 = wb0Var3.d;
                                int i192 = wb0Var3.w;
                                boolean z132 = wb0Var3.b;
                                if (messagePreviewParams5.quote != null && !z132) {
                                    messagePreviewParams5.quote = null;
                                    hb0Var3.f(false);
                                    qb0Var6.g(false, true);
                                    qb0Var6.k(true);
                                    break;
                                } else if (hb0Var3.v - hb0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                    MessageObject c12 = qb0Var6.c(null);
                                    if (c12 != null) {
                                        if (!hb0Var3.y()) {
                                            messagePreviewParams5.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                            messagePreviewParams5.quoteEnd = min;
                                            messagePreviewParams5.quote = org.telegram.ui.sn.b(messagePreviewParams5.quoteStart, min, c12);
                                            View d10 = qb0Var6.d();
                                            if (d10 instanceof org.telegram.ui.Cells.t1) {
                                                hb0Var3.a0((org.telegram.ui.Cells.t1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            }
                                            if (!z132) {
                                                qb0Var6.s.getSwipeBack().e(qb0Var6.I);
                                            }
                                            qb0Var6.g(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams5.quoteStart = hb0Var3.u;
                                            messagePreviewParams5.quoteEnd = hb0Var3.v;
                                            org.telegram.ui.Cells.y9 y9Var2 = hb0Var3.W;
                                            messagePreviewParams5.quote = org.telegram.ui.sn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, qb0Var6.c(y9Var2 != null ? ((org.telegram.ui.Cells.t1) y9Var2).getMessageObject() : null));
                                            wb0Var3.b();
                                            wb0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    qb0Var6.f();
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
                                wb0 wb0Var4 = this.b.c0;
                                if (!wb0Var4.b) {
                                    org.telegram.ui.il ilVar = (org.telegram.ui.il) wb0Var4;
                                    ilVar.a(true);
                                    org.telegram.ui.co coVar = ilVar.H;
                                    coVar.n5 = null;
                                    coVar.l5 = null;
                                    coVar.f5.updateReply(null, null, coVar.T5, null);
                                    coVar.j8();
                                    break;
                                } else {
                                    org.telegram.ui.il ilVar2 = (org.telegram.ui.il) wb0Var4;
                                    ilVar2.a(true);
                                    org.telegram.ui.co coVar2 = ilVar2.H;
                                    coVar2.l5 = null;
                                    coVar2.Bb(coVar2.n5);
                                    break;
                                }
                            case 7:
                                this.b.c0.c(true);
                                break;
                            case 8:
                                this.b.c0.a(true);
                                break;
                            case 9:
                                org.telegram.ui.il ilVar3 = (org.telegram.ui.il) this.b.c0;
                                ilVar3.a(true);
                                org.telegram.ui.co coVar3 = ilVar3.H;
                                coVar3.f5.updateForward(null, coVar3.T5);
                                coVar3.j8();
                                break;
                            case 10:
                                this.b.c0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.il ilVar4 = (org.telegram.ui.il) this.b.c0;
                                ilVar4.a(true);
                                org.telegram.ui.co coVar4 = ilVar4.H;
                                coVar4.G5 = null;
                                org.telegram.ui.mk mkVar = coVar4.Y;
                                if (mkVar != null) {
                                    mkVar.W2 = null;
                                    mkVar.X2 = false;
                                }
                                MessagePreviewParams messagePreviewParams6 = coVar4.f5;
                                if (messagePreviewParams6 != null) {
                                    i162 = ((org.telegram.ui.ActionBar.n2) coVar4).currentAccount;
                                    MessageObject messageObject = coVar4.n5;
                                    messagePreviewParams6.updateLink(i162, null, null, messageObject == coVar4.X3 ? null : messageObject, coVar4.l5, coVar4.p5);
                                }
                                coVar4.j8();
                                break;
                            case 12:
                                qb0 qb0Var7 = this.b;
                                MessagePreviewParams messagePreviewParams7 = qb0Var7.c0.d;
                                if (messagePreviewParams7.hasMedia) {
                                    boolean z14 = !messagePreviewParams7.webpageSmall;
                                    messagePreviewParams7.webpageSmall = z14;
                                    qb0Var7.G.a(z14, true);
                                    qb0Var7.H.a(messagePreviewParams7.webpageSmall, true);
                                    if (qb0Var7.r.messages.size() > 0 && (message2 = qb0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z15 = messagePreviewParams7.webpageSmall;
                                        messageMedia2.force_small_media = z15;
                                        messageMedia2.force_large_media = !z15;
                                    }
                                    if (qb0Var7.r.previewMessages.size() > 0 && (message = qb0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z16 = messagePreviewParams7.webpageSmall;
                                        messageMedia.force_small_media = z16;
                                        messageMedia.force_large_media = !z16;
                                    }
                                    qb0Var7.h();
                                    qb0Var7.U = true;
                                    break;
                                }
                                break;
                            default:
                                qb0 qb0Var8 = this.b;
                                MessagePreviewParams messagePreviewParams8 = qb0Var8.c0.d;
                                boolean z17 = messagePreviewParams8.webpageTop;
                                messagePreviewParams8.webpageTop = !z17;
                                qb0Var8.E.a(z17, true);
                                if (qb0Var8.r.messages.size() > 0 && (message4 = qb0Var8.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams8.webpageTop;
                                }
                                if (qb0Var8.r.previewMessages.size() > 0 && (message3 = qb0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams8.webpageTop;
                                }
                                qb0Var8.h();
                                qb0Var8.U = true;
                                break;
                        }
                    }
                });
                context3 = context;
                ?? f1Var9 = new org.telegram.ui.ActionBar.f1(1, context3, wb0Var.F, false, false);
                this.y = f1Var9;
                f1Var9.g(LocaleController.getString(R.string.QuoteToAnotherChat), R.drawable.msg_forward_replace, r11);
                final int i27 = 4;
                f1Var9.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ya0
                    public final /* synthetic */ qb0 b;

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
                                qb0 qb0Var42 = this.b;
                                qb0Var42.c0.d.quote = null;
                                qb0Var42.e.f(false);
                                qb0Var42.g(false, false);
                                qb0Var42.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                qb0 qb0Var5 = this.b;
                                hb0 hb0Var2 = qb0Var5.e;
                                wb0 wb0Var2 = qb0Var5.c0;
                                if (qb0Var5.c(null) != null) {
                                    if (hb0Var2.v - hb0Var2.u <= MessagesController.getInstance(wb0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.y9 y9Var = hb0Var2.W;
                                        MessageObject c11 = qb0Var5.c(y9Var != null ? ((org.telegram.ui.Cells.t1) y9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams4 = wb0Var2.d;
                                        int i172 = hb0Var2.u;
                                        messagePreviewParams4.quoteStart = i172;
                                        int i182 = hb0Var2.v;
                                        messagePreviewParams4.quoteEnd = i182;
                                        messagePreviewParams4.quote = org.telegram.ui.sn.b(i172, i182, c11);
                                        wb0Var2.b();
                                        wb0Var2.a(true);
                                        break;
                                    } else {
                                        qb0Var5.f();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                qb0 qb0Var6 = this.b;
                                hb0 hb0Var3 = qb0Var6.e;
                                wb0 wb0Var3 = qb0Var6.c0;
                                MessagePreviewParams messagePreviewParams5 = wb0Var3.d;
                                int i192 = wb0Var3.w;
                                boolean z132 = wb0Var3.b;
                                if (messagePreviewParams5.quote != null && !z132) {
                                    messagePreviewParams5.quote = null;
                                    hb0Var3.f(false);
                                    qb0Var6.g(false, true);
                                    qb0Var6.k(true);
                                    break;
                                } else if (hb0Var3.v - hb0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                    MessageObject c12 = qb0Var6.c(null);
                                    if (c12 != null) {
                                        if (!hb0Var3.y()) {
                                            messagePreviewParams5.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                            messagePreviewParams5.quoteEnd = min;
                                            messagePreviewParams5.quote = org.telegram.ui.sn.b(messagePreviewParams5.quoteStart, min, c12);
                                            View d10 = qb0Var6.d();
                                            if (d10 instanceof org.telegram.ui.Cells.t1) {
                                                hb0Var3.a0((org.telegram.ui.Cells.t1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            }
                                            if (!z132) {
                                                qb0Var6.s.getSwipeBack().e(qb0Var6.I);
                                            }
                                            qb0Var6.g(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams5.quoteStart = hb0Var3.u;
                                            messagePreviewParams5.quoteEnd = hb0Var3.v;
                                            org.telegram.ui.Cells.y9 y9Var2 = hb0Var3.W;
                                            messagePreviewParams5.quote = org.telegram.ui.sn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, qb0Var6.c(y9Var2 != null ? ((org.telegram.ui.Cells.t1) y9Var2).getMessageObject() : null));
                                            wb0Var3.b();
                                            wb0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    qb0Var6.f();
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
                                wb0 wb0Var4 = this.b.c0;
                                if (!wb0Var4.b) {
                                    org.telegram.ui.il ilVar = (org.telegram.ui.il) wb0Var4;
                                    ilVar.a(true);
                                    org.telegram.ui.co coVar = ilVar.H;
                                    coVar.n5 = null;
                                    coVar.l5 = null;
                                    coVar.f5.updateReply(null, null, coVar.T5, null);
                                    coVar.j8();
                                    break;
                                } else {
                                    org.telegram.ui.il ilVar2 = (org.telegram.ui.il) wb0Var4;
                                    ilVar2.a(true);
                                    org.telegram.ui.co coVar2 = ilVar2.H;
                                    coVar2.l5 = null;
                                    coVar2.Bb(coVar2.n5);
                                    break;
                                }
                            case 7:
                                this.b.c0.c(true);
                                break;
                            case 8:
                                this.b.c0.a(true);
                                break;
                            case 9:
                                org.telegram.ui.il ilVar3 = (org.telegram.ui.il) this.b.c0;
                                ilVar3.a(true);
                                org.telegram.ui.co coVar3 = ilVar3.H;
                                coVar3.f5.updateForward(null, coVar3.T5);
                                coVar3.j8();
                                break;
                            case 10:
                                this.b.c0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.il ilVar4 = (org.telegram.ui.il) this.b.c0;
                                ilVar4.a(true);
                                org.telegram.ui.co coVar4 = ilVar4.H;
                                coVar4.G5 = null;
                                org.telegram.ui.mk mkVar = coVar4.Y;
                                if (mkVar != null) {
                                    mkVar.W2 = null;
                                    mkVar.X2 = false;
                                }
                                MessagePreviewParams messagePreviewParams6 = coVar4.f5;
                                if (messagePreviewParams6 != null) {
                                    i162 = ((org.telegram.ui.ActionBar.n2) coVar4).currentAccount;
                                    MessageObject messageObject = coVar4.n5;
                                    messagePreviewParams6.updateLink(i162, null, null, messageObject == coVar4.X3 ? null : messageObject, coVar4.l5, coVar4.p5);
                                }
                                coVar4.j8();
                                break;
                            case 12:
                                qb0 qb0Var7 = this.b;
                                MessagePreviewParams messagePreviewParams7 = qb0Var7.c0.d;
                                if (messagePreviewParams7.hasMedia) {
                                    boolean z14 = !messagePreviewParams7.webpageSmall;
                                    messagePreviewParams7.webpageSmall = z14;
                                    qb0Var7.G.a(z14, true);
                                    qb0Var7.H.a(messagePreviewParams7.webpageSmall, true);
                                    if (qb0Var7.r.messages.size() > 0 && (message2 = qb0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z15 = messagePreviewParams7.webpageSmall;
                                        messageMedia2.force_small_media = z15;
                                        messageMedia2.force_large_media = !z15;
                                    }
                                    if (qb0Var7.r.previewMessages.size() > 0 && (message = qb0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z16 = messagePreviewParams7.webpageSmall;
                                        messageMedia.force_small_media = z16;
                                        messageMedia.force_large_media = !z16;
                                    }
                                    qb0Var7.h();
                                    qb0Var7.U = true;
                                    break;
                                }
                                break;
                            default:
                                qb0 qb0Var8 = this.b;
                                MessagePreviewParams messagePreviewParams8 = qb0Var8.c0.d;
                                boolean z17 = messagePreviewParams8.webpageTop;
                                messagePreviewParams8.webpageTop = !z17;
                                qb0Var8.E.a(z17, true);
                                if (qb0Var8.r.messages.size() > 0 && (message4 = qb0Var8.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams8.webpageTop;
                                }
                                if (qb0Var8.r.previewMessages.size() > 0 && (message3 = qb0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams8.webpageTop;
                                }
                                qb0Var8.h();
                                qb0Var8.U = true;
                                break;
                        }
                    }
                });
                frameLayout3.addView(f1Var9, w7.x5.c(48.0f, -1));
                frameLayout3.addView(f1Var8, w7.x5.c(48.0f, -1));
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout3, w7.x5.n(-1, 48));
            }
            if (!messagePreviewParams.noforwards && !messagePreviewParams.hasSecretMessages) {
                org.telegram.ui.ActionBar.k1 k1Var4 = new org.telegram.ui.ActionBar.k1(context3, sb0Var);
                k1Var4.setColor(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, sb0Var)));
                k1Var4.setTag(R.id.fit_width_tag, 1);
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(k1Var4, w7.x5.n(-1, 8));
            }
            g(messagePreviewParams.quote != null, false);
            ?? f1Var10 = new org.telegram.ui.ActionBar.f1(1, context3, wb0Var.F, false, false);
            f1Var10.g(LocaleController.getString(R.string.ApplyChanges), R.drawable.msg_select, r11);
            final int i28 = 5;
            f1Var10.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ya0
                public final /* synthetic */ qb0 b;

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
                            qb0 qb0Var42 = this.b;
                            qb0Var42.c0.d.quote = null;
                            qb0Var42.e.f(false);
                            qb0Var42.g(false, false);
                            qb0Var42.s.getSwipeBack().b(true);
                            break;
                        case 1:
                            qb0 qb0Var5 = this.b;
                            hb0 hb0Var2 = qb0Var5.e;
                            wb0 wb0Var2 = qb0Var5.c0;
                            if (qb0Var5.c(null) != null) {
                                if (hb0Var2.v - hb0Var2.u <= MessagesController.getInstance(wb0Var2.w).quoteLengthMax) {
                                    org.telegram.ui.Cells.y9 y9Var = hb0Var2.W;
                                    MessageObject c11 = qb0Var5.c(y9Var != null ? ((org.telegram.ui.Cells.t1) y9Var).getMessageObject() : null);
                                    MessagePreviewParams messagePreviewParams4 = wb0Var2.d;
                                    int i172 = hb0Var2.u;
                                    messagePreviewParams4.quoteStart = i172;
                                    int i182 = hb0Var2.v;
                                    messagePreviewParams4.quoteEnd = i182;
                                    messagePreviewParams4.quote = org.telegram.ui.sn.b(i172, i182, c11);
                                    wb0Var2.b();
                                    wb0Var2.a(true);
                                    break;
                                } else {
                                    qb0Var5.f();
                                    break;
                                }
                            }
                            break;
                        case 2:
                            qb0 qb0Var6 = this.b;
                            hb0 hb0Var3 = qb0Var6.e;
                            wb0 wb0Var3 = qb0Var6.c0;
                            MessagePreviewParams messagePreviewParams5 = wb0Var3.d;
                            int i192 = wb0Var3.w;
                            boolean z132 = wb0Var3.b;
                            if (messagePreviewParams5.quote != null && !z132) {
                                messagePreviewParams5.quote = null;
                                hb0Var3.f(false);
                                qb0Var6.g(false, true);
                                qb0Var6.k(true);
                                break;
                            } else if (hb0Var3.v - hb0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                MessageObject c12 = qb0Var6.c(null);
                                if (c12 != null) {
                                    if (!hb0Var3.y()) {
                                        messagePreviewParams5.quoteStart = 0;
                                        int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                        messagePreviewParams5.quoteEnd = min;
                                        messagePreviewParams5.quote = org.telegram.ui.sn.b(messagePreviewParams5.quoteStart, min, c12);
                                        View d10 = qb0Var6.d();
                                        if (d10 instanceof org.telegram.ui.Cells.t1) {
                                            hb0Var3.a0((org.telegram.ui.Cells.t1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                        }
                                        if (!z132) {
                                            qb0Var6.s.getSwipeBack().e(qb0Var6.I);
                                        }
                                        qb0Var6.g(true, true);
                                        break;
                                    } else {
                                        messagePreviewParams5.quoteStart = hb0Var3.u;
                                        messagePreviewParams5.quoteEnd = hb0Var3.v;
                                        org.telegram.ui.Cells.y9 y9Var2 = hb0Var3.W;
                                        messagePreviewParams5.quote = org.telegram.ui.sn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, qb0Var6.c(y9Var2 != null ? ((org.telegram.ui.Cells.t1) y9Var2).getMessageObject() : null));
                                        wb0Var3.b();
                                        wb0Var3.a(true);
                                        break;
                                    }
                                }
                            } else {
                                qb0Var6.f();
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
                            wb0 wb0Var4 = this.b.c0;
                            if (!wb0Var4.b) {
                                org.telegram.ui.il ilVar = (org.telegram.ui.il) wb0Var4;
                                ilVar.a(true);
                                org.telegram.ui.co coVar = ilVar.H;
                                coVar.n5 = null;
                                coVar.l5 = null;
                                coVar.f5.updateReply(null, null, coVar.T5, null);
                                coVar.j8();
                                break;
                            } else {
                                org.telegram.ui.il ilVar2 = (org.telegram.ui.il) wb0Var4;
                                ilVar2.a(true);
                                org.telegram.ui.co coVar2 = ilVar2.H;
                                coVar2.l5 = null;
                                coVar2.Bb(coVar2.n5);
                                break;
                            }
                        case 7:
                            this.b.c0.c(true);
                            break;
                        case 8:
                            this.b.c0.a(true);
                            break;
                        case 9:
                            org.telegram.ui.il ilVar3 = (org.telegram.ui.il) this.b.c0;
                            ilVar3.a(true);
                            org.telegram.ui.co coVar3 = ilVar3.H;
                            coVar3.f5.updateForward(null, coVar3.T5);
                            coVar3.j8();
                            break;
                        case 10:
                            this.b.c0.a(true);
                            break;
                        case 11:
                            org.telegram.ui.il ilVar4 = (org.telegram.ui.il) this.b.c0;
                            ilVar4.a(true);
                            org.telegram.ui.co coVar4 = ilVar4.H;
                            coVar4.G5 = null;
                            org.telegram.ui.mk mkVar = coVar4.Y;
                            if (mkVar != null) {
                                mkVar.W2 = null;
                                mkVar.X2 = false;
                            }
                            MessagePreviewParams messagePreviewParams6 = coVar4.f5;
                            if (messagePreviewParams6 != null) {
                                i162 = ((org.telegram.ui.ActionBar.n2) coVar4).currentAccount;
                                MessageObject messageObject = coVar4.n5;
                                messagePreviewParams6.updateLink(i162, null, null, messageObject == coVar4.X3 ? null : messageObject, coVar4.l5, coVar4.p5);
                            }
                            coVar4.j8();
                            break;
                        case 12:
                            qb0 qb0Var7 = this.b;
                            MessagePreviewParams messagePreviewParams7 = qb0Var7.c0.d;
                            if (messagePreviewParams7.hasMedia) {
                                boolean z14 = !messagePreviewParams7.webpageSmall;
                                messagePreviewParams7.webpageSmall = z14;
                                qb0Var7.G.a(z14, true);
                                qb0Var7.H.a(messagePreviewParams7.webpageSmall, true);
                                if (qb0Var7.r.messages.size() > 0 && (message2 = qb0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                    boolean z15 = messagePreviewParams7.webpageSmall;
                                    messageMedia2.force_small_media = z15;
                                    messageMedia2.force_large_media = !z15;
                                }
                                if (qb0Var7.r.previewMessages.size() > 0 && (message = qb0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                    boolean z16 = messagePreviewParams7.webpageSmall;
                                    messageMedia.force_small_media = z16;
                                    messageMedia.force_large_media = !z16;
                                }
                                qb0Var7.h();
                                qb0Var7.U = true;
                                break;
                            }
                            break;
                        default:
                            qb0 qb0Var8 = this.b;
                            MessagePreviewParams messagePreviewParams8 = qb0Var8.c0.d;
                            boolean z17 = messagePreviewParams8.webpageTop;
                            messagePreviewParams8.webpageTop = !z17;
                            qb0Var8.E.a(z17, true);
                            if (qb0Var8.r.messages.size() > 0 && (message4 = qb0Var8.r.messages.get(0).messageOwner) != null) {
                                message4.invert_media = messagePreviewParams8.webpageTop;
                            }
                            if (qb0Var8.r.previewMessages.size() > 0 && (message3 = qb0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                message3.invert_media = messagePreviewParams8.webpageTop;
                            }
                            qb0Var8.h();
                            qb0Var8.U = true;
                            break;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(f1Var10, w7.x5.n(-1, 48));
            ?? f1Var11 = new org.telegram.ui.ActionBar.f1(1, context, wb0Var.F, false, true);
            f1Var11.g(LocaleController.getString(z12 ? R.string.DoNotQuote : R.string.DoNotReply), R.drawable.msg_delete, r11);
            int v04 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q7, sb0Var);
            int i29 = org.telegram.ui.ActionBar.j6.p7;
            f1Var11.c(v04, org.telegram.ui.ActionBar.j6.v0(i29, sb0Var));
            f1Var11.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.w0(r11, i29, false)));
            final int i30 = 6;
            f1Var11.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ya0
                public final /* synthetic */ qb0 b;

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
                            qb0 qb0Var42 = this.b;
                            qb0Var42.c0.d.quote = null;
                            qb0Var42.e.f(false);
                            qb0Var42.g(false, false);
                            qb0Var42.s.getSwipeBack().b(true);
                            break;
                        case 1:
                            qb0 qb0Var5 = this.b;
                            hb0 hb0Var2 = qb0Var5.e;
                            wb0 wb0Var2 = qb0Var5.c0;
                            if (qb0Var5.c(null) != null) {
                                if (hb0Var2.v - hb0Var2.u <= MessagesController.getInstance(wb0Var2.w).quoteLengthMax) {
                                    org.telegram.ui.Cells.y9 y9Var = hb0Var2.W;
                                    MessageObject c11 = qb0Var5.c(y9Var != null ? ((org.telegram.ui.Cells.t1) y9Var).getMessageObject() : null);
                                    MessagePreviewParams messagePreviewParams4 = wb0Var2.d;
                                    int i172 = hb0Var2.u;
                                    messagePreviewParams4.quoteStart = i172;
                                    int i182 = hb0Var2.v;
                                    messagePreviewParams4.quoteEnd = i182;
                                    messagePreviewParams4.quote = org.telegram.ui.sn.b(i172, i182, c11);
                                    wb0Var2.b();
                                    wb0Var2.a(true);
                                    break;
                                } else {
                                    qb0Var5.f();
                                    break;
                                }
                            }
                            break;
                        case 2:
                            qb0 qb0Var6 = this.b;
                            hb0 hb0Var3 = qb0Var6.e;
                            wb0 wb0Var3 = qb0Var6.c0;
                            MessagePreviewParams messagePreviewParams5 = wb0Var3.d;
                            int i192 = wb0Var3.w;
                            boolean z132 = wb0Var3.b;
                            if (messagePreviewParams5.quote != null && !z132) {
                                messagePreviewParams5.quote = null;
                                hb0Var3.f(false);
                                qb0Var6.g(false, true);
                                qb0Var6.k(true);
                                break;
                            } else if (hb0Var3.v - hb0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                MessageObject c12 = qb0Var6.c(null);
                                if (c12 != null) {
                                    if (!hb0Var3.y()) {
                                        messagePreviewParams5.quoteStart = 0;
                                        int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                        messagePreviewParams5.quoteEnd = min;
                                        messagePreviewParams5.quote = org.telegram.ui.sn.b(messagePreviewParams5.quoteStart, min, c12);
                                        View d10 = qb0Var6.d();
                                        if (d10 instanceof org.telegram.ui.Cells.t1) {
                                            hb0Var3.a0((org.telegram.ui.Cells.t1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                        }
                                        if (!z132) {
                                            qb0Var6.s.getSwipeBack().e(qb0Var6.I);
                                        }
                                        qb0Var6.g(true, true);
                                        break;
                                    } else {
                                        messagePreviewParams5.quoteStart = hb0Var3.u;
                                        messagePreviewParams5.quoteEnd = hb0Var3.v;
                                        org.telegram.ui.Cells.y9 y9Var2 = hb0Var3.W;
                                        messagePreviewParams5.quote = org.telegram.ui.sn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, qb0Var6.c(y9Var2 != null ? ((org.telegram.ui.Cells.t1) y9Var2).getMessageObject() : null));
                                        wb0Var3.b();
                                        wb0Var3.a(true);
                                        break;
                                    }
                                }
                            } else {
                                qb0Var6.f();
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
                            wb0 wb0Var4 = this.b.c0;
                            if (!wb0Var4.b) {
                                org.telegram.ui.il ilVar = (org.telegram.ui.il) wb0Var4;
                                ilVar.a(true);
                                org.telegram.ui.co coVar = ilVar.H;
                                coVar.n5 = null;
                                coVar.l5 = null;
                                coVar.f5.updateReply(null, null, coVar.T5, null);
                                coVar.j8();
                                break;
                            } else {
                                org.telegram.ui.il ilVar2 = (org.telegram.ui.il) wb0Var4;
                                ilVar2.a(true);
                                org.telegram.ui.co coVar2 = ilVar2.H;
                                coVar2.l5 = null;
                                coVar2.Bb(coVar2.n5);
                                break;
                            }
                        case 7:
                            this.b.c0.c(true);
                            break;
                        case 8:
                            this.b.c0.a(true);
                            break;
                        case 9:
                            org.telegram.ui.il ilVar3 = (org.telegram.ui.il) this.b.c0;
                            ilVar3.a(true);
                            org.telegram.ui.co coVar3 = ilVar3.H;
                            coVar3.f5.updateForward(null, coVar3.T5);
                            coVar3.j8();
                            break;
                        case 10:
                            this.b.c0.a(true);
                            break;
                        case 11:
                            org.telegram.ui.il ilVar4 = (org.telegram.ui.il) this.b.c0;
                            ilVar4.a(true);
                            org.telegram.ui.co coVar4 = ilVar4.H;
                            coVar4.G5 = null;
                            org.telegram.ui.mk mkVar = coVar4.Y;
                            if (mkVar != null) {
                                mkVar.W2 = null;
                                mkVar.X2 = false;
                            }
                            MessagePreviewParams messagePreviewParams6 = coVar4.f5;
                            if (messagePreviewParams6 != null) {
                                i162 = ((org.telegram.ui.ActionBar.n2) coVar4).currentAccount;
                                MessageObject messageObject = coVar4.n5;
                                messagePreviewParams6.updateLink(i162, null, null, messageObject == coVar4.X3 ? null : messageObject, coVar4.l5, coVar4.p5);
                            }
                            coVar4.j8();
                            break;
                        case 12:
                            qb0 qb0Var7 = this.b;
                            MessagePreviewParams messagePreviewParams7 = qb0Var7.c0.d;
                            if (messagePreviewParams7.hasMedia) {
                                boolean z14 = !messagePreviewParams7.webpageSmall;
                                messagePreviewParams7.webpageSmall = z14;
                                qb0Var7.G.a(z14, true);
                                qb0Var7.H.a(messagePreviewParams7.webpageSmall, true);
                                if (qb0Var7.r.messages.size() > 0 && (message2 = qb0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                    boolean z15 = messagePreviewParams7.webpageSmall;
                                    messageMedia2.force_small_media = z15;
                                    messageMedia2.force_large_media = !z15;
                                }
                                if (qb0Var7.r.previewMessages.size() > 0 && (message = qb0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                    boolean z16 = messagePreviewParams7.webpageSmall;
                                    messageMedia.force_small_media = z16;
                                    messageMedia.force_large_media = !z16;
                                }
                                qb0Var7.h();
                                qb0Var7.U = true;
                                break;
                            }
                            break;
                        default:
                            qb0 qb0Var8 = this.b;
                            MessagePreviewParams messagePreviewParams8 = qb0Var8.c0.d;
                            boolean z17 = messagePreviewParams8.webpageTop;
                            messagePreviewParams8.webpageTop = !z17;
                            qb0Var8.E.a(z17, true);
                            if (qb0Var8.r.messages.size() > 0 && (message4 = qb0Var8.r.messages.get(0).messageOwner) != null) {
                                message4.invert_media = messagePreviewParams8.webpageTop;
                            }
                            if (qb0Var8.r.previewMessages.size() > 0 && (message3 = qb0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                message3.invert_media = messagePreviewParams8.webpageTop;
                            }
                            qb0Var8.h();
                            qb0Var8.U = true;
                            break;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(f1Var11, w7.x5.n(-1, 48));
            context2 = context;
            qb0Var2 = this;
            viewOutlineProvider = r11;
        }
        int i31 = qb0Var2.a;
        if (i31 == 1) {
            qb0Var2.r = messagePreviewParams.forwardMessages;
        } else if (i31 == 0) {
            qb0Var2.r = messagePreviewParams.replyMessage;
        } else if (i31 == 2) {
            qb0Var2.r = messagePreviewParams.linkMessage;
        }
        org.telegram.ui.Cells.ca o9 = qb0Var2.e.o(context2);
        qb0Var2.d = o9;
        o9.setElevation(AndroidUtilities.dp(8.0f));
        o9.setOutlineProvider(viewOutlineProvider);
        if (o9.getParent() instanceof ViewGroup) {
            ((ViewGroup) o9.getParent()).removeView(o9);
        }
        qb0Var2.addView(o9, w7.x5.d(-1, -1.0f, 51, 0.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / AndroidUtilities.density, 0.0f, 0.0f));
        qb0Var2.e.T(qb0Var2.f);
    }

    public static MessageObject.GroupedMessages a(qb0 qb0Var, MessageObject messageObject) {
        if (messageObject.getGroupId() == 0) {
            return null;
        }
        MessageObject.GroupedMessages groupedMessages = qb0Var.r.groupedMessagesMap.get(messageObject.getGroupId());
        if (groupedMessages == null || (groupedMessages.messages.size() > 1 && groupedMessages.getPosition(messageObject) != null)) {
            return groupedMessages;
        }
        return null;
    }

    public static void b(qb0 qb0Var, org.telegram.ui.Cells.t1 t1Var) {
        CharacterStyle characterStyle;
        TLRPC.WebPage webPage;
        if (qb0Var.a == 2) {
            MessagePreviewParams messagePreviewParams = qb0Var.c0.d;
            if (!messagePreviewParams.singleLink && (characterStyle = messagePreviewParams.currentLink) != null && (webPage = messagePreviewParams.webpage) != null && !(webPage instanceof TLRPC.TL_webPagePending)) {
                t1Var.Q3(characterStyle);
                return;
            }
        }
        t1Var.Q3(null);
    }

    public final MessageObject c(MessageObject messageObject) {
        MessageObject.GroupedMessages valueAt;
        wb0 wb0Var = this.c0;
        MessagePreviewParams.Messages messages = wb0Var.d.replyMessage;
        if (messages == null) {
            return null;
        }
        LongSparseArray<MessageObject.GroupedMessages> longSparseArray = messages.groupedMessagesMap;
        if (longSparseArray == null || longSparseArray.size() <= 0 || (valueAt = wb0Var.d.replyMessage.groupedMessagesMap.valueAt(0)) == null) {
            return wb0Var.d.replyMessage.messages.get(0);
        }
        if (valueAt.isDocuments) {
            if (messageObject != null) {
                return messageObject;
            }
            org.telegram.ui.sn snVar = wb0Var.d.quote;
            if (snVar != null) {
                return snVar.a;
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
                ib0 ib0Var = this.f;
                if (i10 >= ib0Var.getChildCount()) {
                    break;
                }
                View childAt = ib0Var.getChildAt(i10);
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) childAt;
                if (n4Var.getMessageObject() != null && (n4Var.getMessageObject() == c10 || n4Var.getMessageObject().getId() == c10.getId())) {
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
        ah.w wVar = this.c;
        org.telegram.ui.w8 w8Var = this.b;
        if (z10) {
            wVar.setTranslationY(0.0f);
            w8Var.invalidateOutline();
            w8Var.setTranslationY(0.0f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(0.0f);
        } else {
            wVar.setTranslationY(i10);
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
        wb0 wb0Var = this.c0;
        new yc(wb0Var, wb0Var.F).M(LocaleController.getString(R.string.QuoteMaxError), LocaleController.getString(R.string.QuoteMaxErrorMessage), R.raw.error).j();
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
        gb0 gb0Var = this.w;
        gb0 gb0Var2 = this.v;
        if (!z11) {
            if (gb0Var2 != null) {
                gb0Var2.setAlpha(!z10 ? 1.0f : 0.0f);
                gb0Var2.setVisibility(!z10 ? 0 : 4);
            }
            if (gb0Var != null) {
                gb0Var.setAlpha(z10 ? 1.0f : 0.0f);
                gb0Var.setVisibility(z10 ? 0 : 4);
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
        if (gb0Var2 != null) {
            gb0Var2.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(gb0Var2, (Property<gb0, Float>) property, !z10 ? 1.0f : 0.0f));
        }
        if (gb0Var != null) {
            gb0Var.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(gb0Var, (Property<gb0, Float>) property, z10 ? 1.0f : 0.0f));
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
        this.P.setInterpolator(pr.h);
        this.P.addListener(new org.telegram.ui.to(16, this, z10));
        this.P.start();
    }

    public final void h() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        wb0 wb0Var = this.c0;
        MessagePreviewParams messagePreviewParams = wb0Var.d;
        kb0 kb0Var = this.h;
        if (kb0Var.k()) {
            this.V = true;
            return;
        }
        for (int i10 = 0; i10 < this.r.previewMessages.size(); i10++) {
            MessageObject messageObject = this.r.previewMessages.get(i10);
            messageObject.forceUpdate = true;
            messageObject.sendAsPeer = wb0Var.a;
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
            kb0Var.V(this.r.groupedMessagesMap.valueAt(i12));
        }
        this.n.q(0, this.r.previewMessages.size());
    }

    public final void i() {
        int i10 = this.R;
        float f7 = this.S;
        wb0 wb0Var = this.c0;
        boolean z10 = wb0Var.v;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        ib0 ib0Var = this.f;
        if (z10) {
            this.S = 0.0f;
            this.R = 0;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(AndroidUtilities.dp(8.0f) + ib0Var.getMeasuredWidth());
        } else {
            int measuredHeight = ib0Var.getMeasuredHeight();
            int i11 = 0;
            for (int i12 = 0; i12 < ib0Var.getChildCount(); i12++) {
                View childAt = ib0Var.getChildAt(i12);
                if (RecyclerView.R(childAt) != -1) {
                    measuredHeight = Math.min(measuredHeight, childAt.getTop());
                    i11++;
                }
            }
            MessagePreviewParams.Messages messages = this.r;
            if (messages == null || i11 == 0 || i11 > messages.previewMessages.size()) {
                this.R = 0;
            } else {
                int f10 = i2.g.f(4.0f, measuredHeight, 0);
                this.R = f10;
                this.R = Math.min(((ib0Var.getMeasuredHeight() - this.R) + f10) - ((int) ((((AndroidUtilities.displaySize.y - (Build.VERSION.SDK_INT >= 35 ? AndroidUtilities.navigationBarHeight : 0)) * 0.8f) - this.W) - AndroidUtilities.dp(8.0f))), this.R);
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
                float f11 = this.S;
                int i13 = this.R;
                this.T = i13;
                e(f11, i13);
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = wb0Var.h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        wb0Var.h = ofFloat;
        ofFloat.addUpdateListener(new ak(this, i10, f7, 1));
        wb0Var.h.setDuration(250L);
        wb0Var.h.setInterpolator(ki.o.V);
        wb0Var.h.addListener(new r80(this, 1));
        AndroidUtilities.runOnUIThread(wb0Var.y, 50L);
        this.T = i10;
        e(f7, i10);
    }

    public final void j() {
        MessageObject messageObject;
        wb0 wb0Var = this.c0;
        MessagePreviewParams messagePreviewParams = wb0Var.d;
        if (this.a == 0) {
            hb0 hb0Var = this.e;
            if (hb0Var.v - hb0Var.u > MessagesController.getInstance(wb0Var.w).quoteLengthMax) {
                return;
            }
            org.telegram.ui.Cells.y9 y9Var = hb0Var.W;
            MessageObject c10 = c(y9Var != null ? ((org.telegram.ui.Cells.t1) y9Var).getMessageObject() : null);
            if (messagePreviewParams.quote != null && hb0Var.y()) {
                messagePreviewParams.quoteStart = hb0Var.u;
                messagePreviewParams.quoteEnd = hb0Var.v;
                if (c10 != null && ((messageObject = messagePreviewParams.quote.a) == null || messageObject.getId() != c10.getId())) {
                    messagePreviewParams.quote = org.telegram.ui.sn.b(messagePreviewParams.quoteStart, messagePreviewParams.quoteEnd, c10);
                    wb0Var.b();
                }
            }
            hb0Var.f(false);
        }
    }

    public final void k(boolean z10) {
        wb0 wb0Var = this.c0;
        TLRPC.User user = wb0Var.n;
        MessagePreviewParams messagePreviewParams = wb0Var.d;
        TLRPC.Chat chat = wb0Var.r;
        ah.w wVar = this.c;
        int i10 = this.a;
        if (i10 == 1) {
            MessagePreviewParams.Messages messages = messagePreviewParams.forwardMessages;
            wVar.c(LocaleController.formatPluralString("PreviewForwardMessagesCount", messages == null ? 0 : messages.selectedIds.size(), new Object[0]), z10);
            wVar.b(!messagePreviewParams.hasSenders ? messagePreviewParams.willSeeSenders ? user != null ? LocaleController.formatString("ForwardPreviewSendersNameVisible", R.string.ForwardPreviewSendersNameVisible, ContactsController.formatName(user.first_name, user.last_name)) : (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.ForwardPreviewSendersNameVisibleGroup) : LocaleController.getString(R.string.ForwardPreviewSendersNameVisibleChannel) : user != null ? LocaleController.formatString("ForwardPreviewSendersNameVisible", R.string.ForwardPreviewSendersNameVisible, ContactsController.formatName(user.first_name, user.last_name)) : (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.ForwardPreviewSendersNameHiddenGroup) : LocaleController.getString(R.string.ForwardPreviewSendersNameHiddenChannel) : !messagePreviewParams.hideForwardSendersName ? user != null ? LocaleController.formatString("ForwardPreviewSendersNameVisible", R.string.ForwardPreviewSendersNameVisible, ContactsController.formatName(user.first_name, user.last_name)) : (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.ForwardPreviewSendersNameVisibleGroup) : LocaleController.getString(R.string.ForwardPreviewSendersNameVisibleChannel) : user != null ? LocaleController.formatString("ForwardPreviewSendersNameHidden", R.string.ForwardPreviewSendersNameHidden, ContactsController.formatName(user.first_name, user.last_name)) : (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.ForwardPreviewSendersNameHiddenGroup) : LocaleController.getString(R.string.ForwardPreviewSendersNameHiddenChannel), z10);
        } else {
            if (i10 != 0) {
                if (i10 == 2) {
                    wVar.c(LocaleController.getString(R.string.MessageOptionsLinkTitle), z10);
                    wVar.b(LocaleController.getString(R.string.MessageOptionsLinkSubtitle), z10);
                    return;
                }
                return;
            }
            if (messagePreviewParams.quote == null || !messagePreviewParams.replyMessage.hasText) {
                wVar.c(LocaleController.getString(R.string.MessageOptionsReplyTitle), z10);
                wVar.b(messagePreviewParams.replyMessage.hasText ? LocaleController.getString(R.string.MessageOptionsReplySubtitle) : "", z10);
            } else {
                wVar.c(LocaleController.getString(R.string.PreviewQuoteUpdate), z10);
                wVar.b(LocaleController.getString(R.string.PreviewQuoteUpdateSubtitle), z10);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.a == 0) {
            AndroidUtilities.forEachViews((RecyclerView) this.f, (e2.h) new za0(this, 0));
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
        wb0 wb0Var = this.c0;
        wb0Var.v = z10;
        this.W = 0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(i10, makeMeasureSpec);
        int i12 = this.W;
        int measuredHeight = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
        Rect rect = this.Q;
        this.W = Math.max(i12, measuredHeight + rect.top + rect.bottom);
        ((ViewGroup.MarginLayoutParams) this.f.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        boolean z11 = wb0Var.v;
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
                messageObject.parentWidth = wb0Var.v ? w8Var.getLayoutParams().width : View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(16.0f);
                messageObject.resetLayout();
                messageObject.forceUpdate = true;
                pb0 pb0Var = this.n;
                if (pb0Var != null) {
                    pb0Var.l();
                }
            }
            this.K = true;
        }
        this.a0 = size;
        super.onMeasure(i10, i11);
    }
}
