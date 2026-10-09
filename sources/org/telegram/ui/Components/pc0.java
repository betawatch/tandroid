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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class pc0 extends FrameLayout {
    public final uc0 E;
    public final FrameLayout F;
    public final uc0 G;
    public final uc0 H;
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
    public final org.telegram.ui.v8 b;
    public boolean b0;
    public final ci.m6 c;
    public final /* synthetic */ vc0 c0;
    public final org.telegram.ui.Cells.aa d;
    public final hc0 e;
    public final ic0 f;
    public final kc0 h;
    public final oc0 n;
    public MessagePreviewParams.Messages r;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout s;
    public final gc0 v;
    public final gc0 w;
    public final org.telegram.ui.ActionBar.f1 x;
    public final org.telegram.ui.ActionBar.f1 y;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [android.graphics.drawable.Drawable, boolean[]] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r13v7, types: [android.view.View, org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout] */
    /* JADX WARN: Type inference failed for: r2v61, types: [android.view.View, org.telegram.ui.ActionBar.f1] */
    /* JADX WARN: Type inference failed for: r2v62, types: [android.view.View, org.telegram.ui.ActionBar.f1] */
    /* JADX WARN: Type inference failed for: r2v68, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r2v69, types: [android.view.View, org.telegram.ui.ActionBar.f1] */
    /* JADX WARN: Type inference failed for: r2v70, types: [android.view.View, org.telegram.ui.ActionBar.f1] */
    /* JADX WARN: Type inference failed for: r33v0, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout, java.lang.Object, org.telegram.ui.Components.pc0] */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.view.View, android.view.ViewGroup, org.telegram.ui.Components.sw0, org.telegram.ui.v8] */
    /* JADX WARN: Type inference failed for: r3v6, types: [ah.c] */
    /* JADX WARN: Type inference failed for: r9v8, types: [android.view.ViewGroup] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public pc0(vc0 vc0Var, Context context, int i10) {
        super(r4);
        MessagePreviewParams messagePreviewParams;
        Context context2;
        pc0 pc0Var;
        boolean z10;
        uc0 uc0Var;
        ViewOutlineProvider viewOutlineProvider;
        pc0 pc0Var2;
        MessagePreviewParams.Messages messages;
        ?? r11;
        MessagePreviewParams messagePreviewParams2;
        Drawable drawable;
        boolean z11;
        LinearLayout linearLayout;
        Context context3 = context;
        this.c0 = vc0Var;
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
        setOnTouchListener(new wk(this, 5));
        ?? v8Var = new org.telegram.ui.v8(this, context3, i11);
        this.b = v8Var;
        rc0 rc0Var = vc0Var.F;
        boolean z12 = vc0Var.b;
        MessagePreviewParams messagePreviewParams3 = vc0Var.d;
        Drawable d = ((org.telegram.ui.xn) rc0Var).d();
        if (((org.telegram.ui.xn) rc0Var).f == null) {
            int i13 = org.telegram.ui.ActionBar.i6.a;
        }
        v8Var.V(d);
        v8Var.setOccupyStatusBar(false);
        int i14 = 3;
        v8Var.setOutlineProvider(new ch.b(this, i14));
        v8Var.setClipToOutline(true);
        v8Var.setElevation(AndroidUtilities.dp(4.0f));
        ci.m6 m6Var = new ci.m6(context3, 11, rc0Var);
        this.c = m6Var;
        m6Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.s8, rc0Var));
        hc0 hc0Var = new hc0(this);
        this.e = hc0Var;
        hc0Var.D = new ai.t3(this, i14);
        ic0 ic0Var = new ic0(this, context3, rc0Var);
        this.f = ic0Var;
        kc0 kc0Var = new kc0(this, ic0Var, rc0Var);
        this.h = kc0Var;
        ic0Var.setItemAnimator(kc0Var);
        ic0Var.setOnScrollListener(new ai.r(this, 29));
        ic0Var.setOnItemClickListener(new lc0(this));
        oc0 oc0Var = new oc0(this);
        this.n = oc0Var;
        ic0Var.setAdapter(oc0Var);
        ic0Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        dc0 dc0Var = new dc0(this);
        dc0Var.O = new ec0(this);
        ic0Var.setClipToPadding(false);
        ic0Var.setLayoutManager(dc0Var);
        ic0Var.i(new fc0());
        v8Var.addView(ic0Var);
        addView(v8Var, w7.x5.a(400.0f, 8.0f, 0.0f, 8.0f, 0.0f, -1, 0));
        v8Var.addView(m6Var, w7.x5.d(-2.0f, -1));
        ?? actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert2, 1, getContext(), rc0Var);
        this.s = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().setOnForegroundOpenFinished(new bc0(this, i11));
        ch.d c10 = vc0Var.G.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, false);
        c10.o(eh.b.k(rc0Var));
        c10.p(AndroidUtilities.dp(8.0f));
        c10.j.e = true;
        c10.q(AndroidUtilities.dp(12.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c10);
        addView(actionBarPopupWindow$ActionBarPopupWindowLayout, w7.x5.d(-2.0f, -2));
        if (i10 != 0 || (messages = messagePreviewParams3.replyMessage) == null) {
            messagePreviewParams = messagePreviewParams3;
            if (i10 != 1 || messagePreviewParams.forwardMessages == null) {
                final pc0 pc0Var3 = this;
                pc0Var = pc0Var3;
                if (i10 == 2) {
                    pc0Var = pc0Var3;
                    if (messagePreviewParams.linkMessage != null) {
                        uc0 uc0Var2 = new uc0(context, R.raw.position_below, LocaleController.getString(R.string.LinkAbove), R.raw.position_above, LocaleController.getString(R.string.LinkBelow), vc0Var.F);
                        pc0Var3.E = uc0Var2;
                        uc0Var2.a(!messagePreviewParams.webpageTop, false);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(uc0Var2, w7.x5.n(-1, 48));
                        FrameLayout frameLayout = new FrameLayout(context);
                        pc0Var3.F = frameLayout;
                        frameLayout.setBackground(org.telegram.ui.ActionBar.i6.Z(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.I5, rc0Var), 0, 0));
                        uc0 uc0Var3 = new uc0(context, R.raw.media_shrink, LocaleController.getString(R.string.LinkMediaLarger), R.raw.media_enlarge, LocaleController.getString(R.string.LinkMediaSmaller), vc0Var.F);
                        pc0Var3.G = uc0Var3;
                        uc0Var3.setBackground(null);
                        uc0Var3.setVisibility(messagePreviewParams.isVideo ? 4 : 0);
                        frameLayout.addView(uc0Var3, w7.x5.n(-1, 48));
                        uc0 uc0Var4 = new uc0(context, R.raw.media_shrink, LocaleController.getString(R.string.LinkVideoLarger), R.raw.media_enlarge, LocaleController.getString(R.string.LinkVideoSmaller), vc0Var.F);
                        pc0Var3.H = uc0Var4;
                        uc0Var4.setBackground(null);
                        uc0Var4.setVisibility(!messagePreviewParams.isVideo ? 4 : 0);
                        frameLayout.setAlpha(messagePreviewParams.hasMedia ? 1.0f : 0.5f);
                        frameLayout.addView(uc0Var4, w7.x5.n(-1, 48));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, w7.x5.n(-1, 48));
                        frameLayout.setVisibility((!messagePreviewParams.singleLink || messagePreviewParams.hasMedia) ? 0 : 8);
                        uc0Var3.a(messagePreviewParams.webpageSmall, false);
                        uc0Var4.a(messagePreviewParams.webpageSmall, false);
                        org.telegram.ui.ActionBar.k1 k1Var = new org.telegram.ui.ActionBar.k1(context, rc0Var);
                        k1Var.setColor(org.telegram.ui.ActionBar.i6.m1(0.06f, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.E8, rc0Var)));
                        k1Var.setTag(R.id.fit_width_tag, 1);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(k1Var, w7.x5.n(-1, 8));
                        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(1, context, vc0Var.F, false, false);
                        f1Var.g(LocaleController.getString(R.string.ApplyChanges), R.drawable.msg_select, null);
                        final int i15 = 10;
                        f1Var.setOnClickListener(new View.OnClickListener(pc0Var3) { // from class: org.telegram.ui.Components.zb0
                            public final /* synthetic */ pc0 b;

                            {
                                this.b = pc0Var3;
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
                                        pc0 pc0Var4 = this.b;
                                        pc0Var4.c0.d.quote = null;
                                        pc0Var4.e.f(false);
                                        pc0Var4.g(false, false);
                                        pc0Var4.s.getSwipeBack().b(true);
                                        break;
                                    case 1:
                                        pc0 pc0Var5 = this.b;
                                        hc0 hc0Var2 = pc0Var5.e;
                                        vc0 vc0Var2 = pc0Var5.c0;
                                        if (pc0Var5.c(null) != null) {
                                            if (hc0Var2.v - hc0Var2.u <= MessagesController.getInstance(vc0Var2.w).quoteLengthMax) {
                                                org.telegram.ui.Cells.w9 w9Var = hc0Var2.W;
                                                MessageObject c11 = pc0Var5.c(w9Var != null ? ((org.telegram.ui.Cells.u1) w9Var).getMessageObject() : null);
                                                MessagePreviewParams messagePreviewParams4 = vc0Var2.d;
                                                int i17 = hc0Var2.u;
                                                messagePreviewParams4.quoteStart = i17;
                                                int i18 = hc0Var2.v;
                                                messagePreviewParams4.quoteEnd = i18;
                                                messagePreviewParams4.quote = org.telegram.ui.pn.b(i17, i18, c11);
                                                vc0Var2.b();
                                                vc0Var2.a(true);
                                                break;
                                            } else {
                                                pc0Var5.f();
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        pc0 pc0Var6 = this.b;
                                        hc0 hc0Var3 = pc0Var6.e;
                                        vc0 vc0Var3 = pc0Var6.c0;
                                        MessagePreviewParams messagePreviewParams5 = vc0Var3.d;
                                        int i19 = vc0Var3.w;
                                        boolean z13 = vc0Var3.b;
                                        if (messagePreviewParams5.quote != null && !z13) {
                                            messagePreviewParams5.quote = null;
                                            hc0Var3.f(false);
                                            pc0Var6.g(false, true);
                                            pc0Var6.k(true);
                                            break;
                                        } else if (hc0Var3.v - hc0Var3.u <= MessagesController.getInstance(i19).quoteLengthMax) {
                                            MessageObject c12 = pc0Var6.c(null);
                                            if (c12 != null) {
                                                if (!hc0Var3.x()) {
                                                    messagePreviewParams5.quoteStart = 0;
                                                    int min = Math.min(MessagesController.getInstance(i19).quoteLengthMax, c12.messageOwner.message.length());
                                                    messagePreviewParams5.quoteEnd = min;
                                                    messagePreviewParams5.quote = org.telegram.ui.pn.b(messagePreviewParams5.quoteStart, min, c12);
                                                    View d10 = pc0Var6.d();
                                                    if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                        hc0Var3.Z((org.telegram.ui.Cells.u1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                    }
                                                    if (!z13) {
                                                        pc0Var6.s.getSwipeBack().e(pc0Var6.I);
                                                    }
                                                    pc0Var6.g(true, true);
                                                    break;
                                                } else {
                                                    messagePreviewParams5.quoteStart = hc0Var3.u;
                                                    messagePreviewParams5.quoteEnd = hc0Var3.v;
                                                    org.telegram.ui.Cells.w9 w9Var2 = hc0Var3.W;
                                                    messagePreviewParams5.quote = org.telegram.ui.pn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, pc0Var6.c(w9Var2 != null ? ((org.telegram.ui.Cells.u1) w9Var2).getMessageObject() : null));
                                                    vc0Var3.b();
                                                    vc0Var3.a(true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            pc0Var6.f();
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
                                        vc0 vc0Var4 = this.b.c0;
                                        if (!vc0Var4.b) {
                                            org.telegram.ui.jl jlVar = (org.telegram.ui.jl) vc0Var4;
                                            jlVar.a(true);
                                            org.telegram.ui.zn znVar = jlVar.H;
                                            znVar.n5 = null;
                                            znVar.l5 = null;
                                            znVar.f5.updateReply(null, null, znVar.T5, null);
                                            znVar.m8();
                                            break;
                                        } else {
                                            org.telegram.ui.jl jlVar2 = (org.telegram.ui.jl) vc0Var4;
                                            jlVar2.a(true);
                                            org.telegram.ui.zn znVar2 = jlVar2.H;
                                            znVar2.l5 = null;
                                            znVar2.Fb(znVar2.n5);
                                            break;
                                        }
                                    case 7:
                                        this.b.c0.c(true);
                                        break;
                                    case 8:
                                        this.b.c0.a(true);
                                        break;
                                    case 9:
                                        org.telegram.ui.jl jlVar3 = (org.telegram.ui.jl) this.b.c0;
                                        jlVar3.a(true);
                                        org.telegram.ui.zn znVar3 = jlVar3.H;
                                        znVar3.f5.updateForward(null, znVar3.T5);
                                        znVar3.m8();
                                        break;
                                    case 10:
                                        this.b.c0.a(true);
                                        break;
                                    case 11:
                                        org.telegram.ui.jl jlVar4 = (org.telegram.ui.jl) this.b.c0;
                                        jlVar4.a(true);
                                        org.telegram.ui.zn znVar4 = jlVar4.H;
                                        znVar4.G5 = null;
                                        org.telegram.ui.ok okVar = znVar4.Y;
                                        if (okVar != null) {
                                            okVar.X2 = null;
                                            okVar.Y2 = false;
                                        }
                                        MessagePreviewParams messagePreviewParams6 = znVar4.f5;
                                        if (messagePreviewParams6 != null) {
                                            i16 = ((org.telegram.ui.ActionBar.n2) znVar4).currentAccount;
                                            MessageObject messageObject = znVar4.n5;
                                            messagePreviewParams6.updateLink(i16, null, null, messageObject == znVar4.X3 ? null : messageObject, znVar4.l5, znVar4.p5);
                                        }
                                        znVar4.m8();
                                        break;
                                    case 12:
                                        pc0 pc0Var7 = this.b;
                                        MessagePreviewParams messagePreviewParams7 = pc0Var7.c0.d;
                                        if (messagePreviewParams7.hasMedia) {
                                            boolean z14 = !messagePreviewParams7.webpageSmall;
                                            messagePreviewParams7.webpageSmall = z14;
                                            pc0Var7.G.a(z14, true);
                                            pc0Var7.H.a(messagePreviewParams7.webpageSmall, true);
                                            if (pc0Var7.r.messages.size() > 0 && (message2 = pc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                                boolean z15 = messagePreviewParams7.webpageSmall;
                                                messageMedia2.force_small_media = z15;
                                                messageMedia2.force_large_media = !z15;
                                            }
                                            if (pc0Var7.r.previewMessages.size() > 0 && (message = pc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                                boolean z16 = messagePreviewParams7.webpageSmall;
                                                messageMedia.force_small_media = z16;
                                                messageMedia.force_large_media = !z16;
                                            }
                                            pc0Var7.h();
                                            pc0Var7.U = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        pc0 pc0Var8 = this.b;
                                        MessagePreviewParams messagePreviewParams8 = pc0Var8.c0.d;
                                        boolean z17 = messagePreviewParams8.webpageTop;
                                        messagePreviewParams8.webpageTop = !z17;
                                        pc0Var8.E.a(z17, true);
                                        if (pc0Var8.r.messages.size() > 0 && (message4 = pc0Var8.r.messages.get(0).messageOwner) != null) {
                                            message4.invert_media = messagePreviewParams8.webpageTop;
                                        }
                                        if (pc0Var8.r.previewMessages.size() > 0 && (message3 = pc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                            message3.invert_media = messagePreviewParams8.webpageTop;
                                        }
                                        pc0Var8.h();
                                        pc0Var8.U = true;
                                        break;
                                }
                            }
                        });
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(f1Var, w7.x5.n(-1, 48));
                        org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(1, context, vc0Var.F, false, true);
                        context2 = context;
                        f1Var2.g(LocaleController.getString(R.string.DoNotLinkPreview), R.drawable.msg_delete, null);
                        int w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.q7, rc0Var);
                        int i16 = org.telegram.ui.ActionBar.i6.p7;
                        f1Var2.c(w02, org.telegram.ui.ActionBar.i6.w0(i16, rc0Var));
                        final int i17 = 11;
                        f1Var2.setOnClickListener(new View.OnClickListener(pc0Var3) { // from class: org.telegram.ui.Components.zb0
                            public final /* synthetic */ pc0 b;

                            {
                                this.b = pc0Var3;
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
                                        pc0 pc0Var4 = this.b;
                                        pc0Var4.c0.d.quote = null;
                                        pc0Var4.e.f(false);
                                        pc0Var4.g(false, false);
                                        pc0Var4.s.getSwipeBack().b(true);
                                        break;
                                    case 1:
                                        pc0 pc0Var5 = this.b;
                                        hc0 hc0Var2 = pc0Var5.e;
                                        vc0 vc0Var2 = pc0Var5.c0;
                                        if (pc0Var5.c(null) != null) {
                                            if (hc0Var2.v - hc0Var2.u <= MessagesController.getInstance(vc0Var2.w).quoteLengthMax) {
                                                org.telegram.ui.Cells.w9 w9Var = hc0Var2.W;
                                                MessageObject c11 = pc0Var5.c(w9Var != null ? ((org.telegram.ui.Cells.u1) w9Var).getMessageObject() : null);
                                                MessagePreviewParams messagePreviewParams4 = vc0Var2.d;
                                                int i172 = hc0Var2.u;
                                                messagePreviewParams4.quoteStart = i172;
                                                int i18 = hc0Var2.v;
                                                messagePreviewParams4.quoteEnd = i18;
                                                messagePreviewParams4.quote = org.telegram.ui.pn.b(i172, i18, c11);
                                                vc0Var2.b();
                                                vc0Var2.a(true);
                                                break;
                                            } else {
                                                pc0Var5.f();
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        pc0 pc0Var6 = this.b;
                                        hc0 hc0Var3 = pc0Var6.e;
                                        vc0 vc0Var3 = pc0Var6.c0;
                                        MessagePreviewParams messagePreviewParams5 = vc0Var3.d;
                                        int i19 = vc0Var3.w;
                                        boolean z13 = vc0Var3.b;
                                        if (messagePreviewParams5.quote != null && !z13) {
                                            messagePreviewParams5.quote = null;
                                            hc0Var3.f(false);
                                            pc0Var6.g(false, true);
                                            pc0Var6.k(true);
                                            break;
                                        } else if (hc0Var3.v - hc0Var3.u <= MessagesController.getInstance(i19).quoteLengthMax) {
                                            MessageObject c12 = pc0Var6.c(null);
                                            if (c12 != null) {
                                                if (!hc0Var3.x()) {
                                                    messagePreviewParams5.quoteStart = 0;
                                                    int min = Math.min(MessagesController.getInstance(i19).quoteLengthMax, c12.messageOwner.message.length());
                                                    messagePreviewParams5.quoteEnd = min;
                                                    messagePreviewParams5.quote = org.telegram.ui.pn.b(messagePreviewParams5.quoteStart, min, c12);
                                                    View d10 = pc0Var6.d();
                                                    if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                        hc0Var3.Z((org.telegram.ui.Cells.u1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                    }
                                                    if (!z13) {
                                                        pc0Var6.s.getSwipeBack().e(pc0Var6.I);
                                                    }
                                                    pc0Var6.g(true, true);
                                                    break;
                                                } else {
                                                    messagePreviewParams5.quoteStart = hc0Var3.u;
                                                    messagePreviewParams5.quoteEnd = hc0Var3.v;
                                                    org.telegram.ui.Cells.w9 w9Var2 = hc0Var3.W;
                                                    messagePreviewParams5.quote = org.telegram.ui.pn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, pc0Var6.c(w9Var2 != null ? ((org.telegram.ui.Cells.u1) w9Var2).getMessageObject() : null));
                                                    vc0Var3.b();
                                                    vc0Var3.a(true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            pc0Var6.f();
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
                                        vc0 vc0Var4 = this.b.c0;
                                        if (!vc0Var4.b) {
                                            org.telegram.ui.jl jlVar = (org.telegram.ui.jl) vc0Var4;
                                            jlVar.a(true);
                                            org.telegram.ui.zn znVar = jlVar.H;
                                            znVar.n5 = null;
                                            znVar.l5 = null;
                                            znVar.f5.updateReply(null, null, znVar.T5, null);
                                            znVar.m8();
                                            break;
                                        } else {
                                            org.telegram.ui.jl jlVar2 = (org.telegram.ui.jl) vc0Var4;
                                            jlVar2.a(true);
                                            org.telegram.ui.zn znVar2 = jlVar2.H;
                                            znVar2.l5 = null;
                                            znVar2.Fb(znVar2.n5);
                                            break;
                                        }
                                    case 7:
                                        this.b.c0.c(true);
                                        break;
                                    case 8:
                                        this.b.c0.a(true);
                                        break;
                                    case 9:
                                        org.telegram.ui.jl jlVar3 = (org.telegram.ui.jl) this.b.c0;
                                        jlVar3.a(true);
                                        org.telegram.ui.zn znVar3 = jlVar3.H;
                                        znVar3.f5.updateForward(null, znVar3.T5);
                                        znVar3.m8();
                                        break;
                                    case 10:
                                        this.b.c0.a(true);
                                        break;
                                    case 11:
                                        org.telegram.ui.jl jlVar4 = (org.telegram.ui.jl) this.b.c0;
                                        jlVar4.a(true);
                                        org.telegram.ui.zn znVar4 = jlVar4.H;
                                        znVar4.G5 = null;
                                        org.telegram.ui.ok okVar = znVar4.Y;
                                        if (okVar != null) {
                                            okVar.X2 = null;
                                            okVar.Y2 = false;
                                        }
                                        MessagePreviewParams messagePreviewParams6 = znVar4.f5;
                                        if (messagePreviewParams6 != null) {
                                            i162 = ((org.telegram.ui.ActionBar.n2) znVar4).currentAccount;
                                            MessageObject messageObject = znVar4.n5;
                                            messagePreviewParams6.updateLink(i162, null, null, messageObject == znVar4.X3 ? null : messageObject, znVar4.l5, znVar4.p5);
                                        }
                                        znVar4.m8();
                                        break;
                                    case 12:
                                        pc0 pc0Var7 = this.b;
                                        MessagePreviewParams messagePreviewParams7 = pc0Var7.c0.d;
                                        if (messagePreviewParams7.hasMedia) {
                                            boolean z14 = !messagePreviewParams7.webpageSmall;
                                            messagePreviewParams7.webpageSmall = z14;
                                            pc0Var7.G.a(z14, true);
                                            pc0Var7.H.a(messagePreviewParams7.webpageSmall, true);
                                            if (pc0Var7.r.messages.size() > 0 && (message2 = pc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                                boolean z15 = messagePreviewParams7.webpageSmall;
                                                messageMedia2.force_small_media = z15;
                                                messageMedia2.force_large_media = !z15;
                                            }
                                            if (pc0Var7.r.previewMessages.size() > 0 && (message = pc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                                boolean z16 = messagePreviewParams7.webpageSmall;
                                                messageMedia.force_small_media = z16;
                                                messageMedia.force_large_media = !z16;
                                            }
                                            pc0Var7.h();
                                            pc0Var7.U = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        pc0 pc0Var8 = this.b;
                                        MessagePreviewParams messagePreviewParams8 = pc0Var8.c0.d;
                                        boolean z17 = messagePreviewParams8.webpageTop;
                                        messagePreviewParams8.webpageTop = !z17;
                                        pc0Var8.E.a(z17, true);
                                        if (pc0Var8.r.messages.size() > 0 && (message4 = pc0Var8.r.messages.get(0).messageOwner) != null) {
                                            message4.invert_media = messagePreviewParams8.webpageTop;
                                        }
                                        if (pc0Var8.r.previewMessages.size() > 0 && (message3 = pc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                            message3.invert_media = messagePreviewParams8.webpageTop;
                                        }
                                        pc0Var8.h();
                                        pc0Var8.U = true;
                                        break;
                                }
                            }
                        });
                        f1Var2.setSelectorColor(org.telegram.ui.ActionBar.i6.m1(0.12f, org.telegram.ui.ActionBar.i6.x0(null, i16, false)));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(f1Var2, w7.x5.n(-1, 48));
                        final int i18 = 12;
                        frameLayout.setOnClickListener(new View.OnClickListener(pc0Var3) { // from class: org.telegram.ui.Components.zb0
                            public final /* synthetic */ pc0 b;

                            {
                                this.b = pc0Var3;
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
                                        pc0 pc0Var4 = this.b;
                                        pc0Var4.c0.d.quote = null;
                                        pc0Var4.e.f(false);
                                        pc0Var4.g(false, false);
                                        pc0Var4.s.getSwipeBack().b(true);
                                        break;
                                    case 1:
                                        pc0 pc0Var5 = this.b;
                                        hc0 hc0Var2 = pc0Var5.e;
                                        vc0 vc0Var2 = pc0Var5.c0;
                                        if (pc0Var5.c(null) != null) {
                                            if (hc0Var2.v - hc0Var2.u <= MessagesController.getInstance(vc0Var2.w).quoteLengthMax) {
                                                org.telegram.ui.Cells.w9 w9Var = hc0Var2.W;
                                                MessageObject c11 = pc0Var5.c(w9Var != null ? ((org.telegram.ui.Cells.u1) w9Var).getMessageObject() : null);
                                                MessagePreviewParams messagePreviewParams4 = vc0Var2.d;
                                                int i172 = hc0Var2.u;
                                                messagePreviewParams4.quoteStart = i172;
                                                int i182 = hc0Var2.v;
                                                messagePreviewParams4.quoteEnd = i182;
                                                messagePreviewParams4.quote = org.telegram.ui.pn.b(i172, i182, c11);
                                                vc0Var2.b();
                                                vc0Var2.a(true);
                                                break;
                                            } else {
                                                pc0Var5.f();
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        pc0 pc0Var6 = this.b;
                                        hc0 hc0Var3 = pc0Var6.e;
                                        vc0 vc0Var3 = pc0Var6.c0;
                                        MessagePreviewParams messagePreviewParams5 = vc0Var3.d;
                                        int i19 = vc0Var3.w;
                                        boolean z13 = vc0Var3.b;
                                        if (messagePreviewParams5.quote != null && !z13) {
                                            messagePreviewParams5.quote = null;
                                            hc0Var3.f(false);
                                            pc0Var6.g(false, true);
                                            pc0Var6.k(true);
                                            break;
                                        } else if (hc0Var3.v - hc0Var3.u <= MessagesController.getInstance(i19).quoteLengthMax) {
                                            MessageObject c12 = pc0Var6.c(null);
                                            if (c12 != null) {
                                                if (!hc0Var3.x()) {
                                                    messagePreviewParams5.quoteStart = 0;
                                                    int min = Math.min(MessagesController.getInstance(i19).quoteLengthMax, c12.messageOwner.message.length());
                                                    messagePreviewParams5.quoteEnd = min;
                                                    messagePreviewParams5.quote = org.telegram.ui.pn.b(messagePreviewParams5.quoteStart, min, c12);
                                                    View d10 = pc0Var6.d();
                                                    if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                        hc0Var3.Z((org.telegram.ui.Cells.u1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                    }
                                                    if (!z13) {
                                                        pc0Var6.s.getSwipeBack().e(pc0Var6.I);
                                                    }
                                                    pc0Var6.g(true, true);
                                                    break;
                                                } else {
                                                    messagePreviewParams5.quoteStart = hc0Var3.u;
                                                    messagePreviewParams5.quoteEnd = hc0Var3.v;
                                                    org.telegram.ui.Cells.w9 w9Var2 = hc0Var3.W;
                                                    messagePreviewParams5.quote = org.telegram.ui.pn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, pc0Var6.c(w9Var2 != null ? ((org.telegram.ui.Cells.u1) w9Var2).getMessageObject() : null));
                                                    vc0Var3.b();
                                                    vc0Var3.a(true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            pc0Var6.f();
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
                                        vc0 vc0Var4 = this.b.c0;
                                        if (!vc0Var4.b) {
                                            org.telegram.ui.jl jlVar = (org.telegram.ui.jl) vc0Var4;
                                            jlVar.a(true);
                                            org.telegram.ui.zn znVar = jlVar.H;
                                            znVar.n5 = null;
                                            znVar.l5 = null;
                                            znVar.f5.updateReply(null, null, znVar.T5, null);
                                            znVar.m8();
                                            break;
                                        } else {
                                            org.telegram.ui.jl jlVar2 = (org.telegram.ui.jl) vc0Var4;
                                            jlVar2.a(true);
                                            org.telegram.ui.zn znVar2 = jlVar2.H;
                                            znVar2.l5 = null;
                                            znVar2.Fb(znVar2.n5);
                                            break;
                                        }
                                    case 7:
                                        this.b.c0.c(true);
                                        break;
                                    case 8:
                                        this.b.c0.a(true);
                                        break;
                                    case 9:
                                        org.telegram.ui.jl jlVar3 = (org.telegram.ui.jl) this.b.c0;
                                        jlVar3.a(true);
                                        org.telegram.ui.zn znVar3 = jlVar3.H;
                                        znVar3.f5.updateForward(null, znVar3.T5);
                                        znVar3.m8();
                                        break;
                                    case 10:
                                        this.b.c0.a(true);
                                        break;
                                    case 11:
                                        org.telegram.ui.jl jlVar4 = (org.telegram.ui.jl) this.b.c0;
                                        jlVar4.a(true);
                                        org.telegram.ui.zn znVar4 = jlVar4.H;
                                        znVar4.G5 = null;
                                        org.telegram.ui.ok okVar = znVar4.Y;
                                        if (okVar != null) {
                                            okVar.X2 = null;
                                            okVar.Y2 = false;
                                        }
                                        MessagePreviewParams messagePreviewParams6 = znVar4.f5;
                                        if (messagePreviewParams6 != null) {
                                            i162 = ((org.telegram.ui.ActionBar.n2) znVar4).currentAccount;
                                            MessageObject messageObject = znVar4.n5;
                                            messagePreviewParams6.updateLink(i162, null, null, messageObject == znVar4.X3 ? null : messageObject, znVar4.l5, znVar4.p5);
                                        }
                                        znVar4.m8();
                                        break;
                                    case 12:
                                        pc0 pc0Var7 = this.b;
                                        MessagePreviewParams messagePreviewParams7 = pc0Var7.c0.d;
                                        if (messagePreviewParams7.hasMedia) {
                                            boolean z14 = !messagePreviewParams7.webpageSmall;
                                            messagePreviewParams7.webpageSmall = z14;
                                            pc0Var7.G.a(z14, true);
                                            pc0Var7.H.a(messagePreviewParams7.webpageSmall, true);
                                            if (pc0Var7.r.messages.size() > 0 && (message2 = pc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                                boolean z15 = messagePreviewParams7.webpageSmall;
                                                messageMedia2.force_small_media = z15;
                                                messageMedia2.force_large_media = !z15;
                                            }
                                            if (pc0Var7.r.previewMessages.size() > 0 && (message = pc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                                boolean z16 = messagePreviewParams7.webpageSmall;
                                                messageMedia.force_small_media = z16;
                                                messageMedia.force_large_media = !z16;
                                            }
                                            pc0Var7.h();
                                            pc0Var7.U = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        pc0 pc0Var8 = this.b;
                                        MessagePreviewParams messagePreviewParams8 = pc0Var8.c0.d;
                                        boolean z17 = messagePreviewParams8.webpageTop;
                                        messagePreviewParams8.webpageTop = !z17;
                                        pc0Var8.E.a(z17, true);
                                        if (pc0Var8.r.messages.size() > 0 && (message4 = pc0Var8.r.messages.get(0).messageOwner) != null) {
                                            message4.invert_media = messagePreviewParams8.webpageTop;
                                        }
                                        if (pc0Var8.r.previewMessages.size() > 0 && (message3 = pc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                            message3.invert_media = messagePreviewParams8.webpageTop;
                                        }
                                        pc0Var8.h();
                                        pc0Var8.U = true;
                                        break;
                                }
                            }
                        });
                        final int i19 = 13;
                        uc0Var2.setOnClickListener(new View.OnClickListener(pc0Var3) { // from class: org.telegram.ui.Components.zb0
                            public final /* synthetic */ pc0 b;

                            {
                                this.b = pc0Var3;
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
                                        pc0 pc0Var4 = this.b;
                                        pc0Var4.c0.d.quote = null;
                                        pc0Var4.e.f(false);
                                        pc0Var4.g(false, false);
                                        pc0Var4.s.getSwipeBack().b(true);
                                        break;
                                    case 1:
                                        pc0 pc0Var5 = this.b;
                                        hc0 hc0Var2 = pc0Var5.e;
                                        vc0 vc0Var2 = pc0Var5.c0;
                                        if (pc0Var5.c(null) != null) {
                                            if (hc0Var2.v - hc0Var2.u <= MessagesController.getInstance(vc0Var2.w).quoteLengthMax) {
                                                org.telegram.ui.Cells.w9 w9Var = hc0Var2.W;
                                                MessageObject c11 = pc0Var5.c(w9Var != null ? ((org.telegram.ui.Cells.u1) w9Var).getMessageObject() : null);
                                                MessagePreviewParams messagePreviewParams4 = vc0Var2.d;
                                                int i172 = hc0Var2.u;
                                                messagePreviewParams4.quoteStart = i172;
                                                int i182 = hc0Var2.v;
                                                messagePreviewParams4.quoteEnd = i182;
                                                messagePreviewParams4.quote = org.telegram.ui.pn.b(i172, i182, c11);
                                                vc0Var2.b();
                                                vc0Var2.a(true);
                                                break;
                                            } else {
                                                pc0Var5.f();
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        pc0 pc0Var6 = this.b;
                                        hc0 hc0Var3 = pc0Var6.e;
                                        vc0 vc0Var3 = pc0Var6.c0;
                                        MessagePreviewParams messagePreviewParams5 = vc0Var3.d;
                                        int i192 = vc0Var3.w;
                                        boolean z13 = vc0Var3.b;
                                        if (messagePreviewParams5.quote != null && !z13) {
                                            messagePreviewParams5.quote = null;
                                            hc0Var3.f(false);
                                            pc0Var6.g(false, true);
                                            pc0Var6.k(true);
                                            break;
                                        } else if (hc0Var3.v - hc0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                            MessageObject c12 = pc0Var6.c(null);
                                            if (c12 != null) {
                                                if (!hc0Var3.x()) {
                                                    messagePreviewParams5.quoteStart = 0;
                                                    int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                                    messagePreviewParams5.quoteEnd = min;
                                                    messagePreviewParams5.quote = org.telegram.ui.pn.b(messagePreviewParams5.quoteStart, min, c12);
                                                    View d10 = pc0Var6.d();
                                                    if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                        hc0Var3.Z((org.telegram.ui.Cells.u1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                    }
                                                    if (!z13) {
                                                        pc0Var6.s.getSwipeBack().e(pc0Var6.I);
                                                    }
                                                    pc0Var6.g(true, true);
                                                    break;
                                                } else {
                                                    messagePreviewParams5.quoteStart = hc0Var3.u;
                                                    messagePreviewParams5.quoteEnd = hc0Var3.v;
                                                    org.telegram.ui.Cells.w9 w9Var2 = hc0Var3.W;
                                                    messagePreviewParams5.quote = org.telegram.ui.pn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, pc0Var6.c(w9Var2 != null ? ((org.telegram.ui.Cells.u1) w9Var2).getMessageObject() : null));
                                                    vc0Var3.b();
                                                    vc0Var3.a(true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            pc0Var6.f();
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
                                        vc0 vc0Var4 = this.b.c0;
                                        if (!vc0Var4.b) {
                                            org.telegram.ui.jl jlVar = (org.telegram.ui.jl) vc0Var4;
                                            jlVar.a(true);
                                            org.telegram.ui.zn znVar = jlVar.H;
                                            znVar.n5 = null;
                                            znVar.l5 = null;
                                            znVar.f5.updateReply(null, null, znVar.T5, null);
                                            znVar.m8();
                                            break;
                                        } else {
                                            org.telegram.ui.jl jlVar2 = (org.telegram.ui.jl) vc0Var4;
                                            jlVar2.a(true);
                                            org.telegram.ui.zn znVar2 = jlVar2.H;
                                            znVar2.l5 = null;
                                            znVar2.Fb(znVar2.n5);
                                            break;
                                        }
                                    case 7:
                                        this.b.c0.c(true);
                                        break;
                                    case 8:
                                        this.b.c0.a(true);
                                        break;
                                    case 9:
                                        org.telegram.ui.jl jlVar3 = (org.telegram.ui.jl) this.b.c0;
                                        jlVar3.a(true);
                                        org.telegram.ui.zn znVar3 = jlVar3.H;
                                        znVar3.f5.updateForward(null, znVar3.T5);
                                        znVar3.m8();
                                        break;
                                    case 10:
                                        this.b.c0.a(true);
                                        break;
                                    case 11:
                                        org.telegram.ui.jl jlVar4 = (org.telegram.ui.jl) this.b.c0;
                                        jlVar4.a(true);
                                        org.telegram.ui.zn znVar4 = jlVar4.H;
                                        znVar4.G5 = null;
                                        org.telegram.ui.ok okVar = znVar4.Y;
                                        if (okVar != null) {
                                            okVar.X2 = null;
                                            okVar.Y2 = false;
                                        }
                                        MessagePreviewParams messagePreviewParams6 = znVar4.f5;
                                        if (messagePreviewParams6 != null) {
                                            i162 = ((org.telegram.ui.ActionBar.n2) znVar4).currentAccount;
                                            MessageObject messageObject = znVar4.n5;
                                            messagePreviewParams6.updateLink(i162, null, null, messageObject == znVar4.X3 ? null : messageObject, znVar4.l5, znVar4.p5);
                                        }
                                        znVar4.m8();
                                        break;
                                    case 12:
                                        pc0 pc0Var7 = this.b;
                                        MessagePreviewParams messagePreviewParams7 = pc0Var7.c0.d;
                                        if (messagePreviewParams7.hasMedia) {
                                            boolean z14 = !messagePreviewParams7.webpageSmall;
                                            messagePreviewParams7.webpageSmall = z14;
                                            pc0Var7.G.a(z14, true);
                                            pc0Var7.H.a(messagePreviewParams7.webpageSmall, true);
                                            if (pc0Var7.r.messages.size() > 0 && (message2 = pc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                                boolean z15 = messagePreviewParams7.webpageSmall;
                                                messageMedia2.force_small_media = z15;
                                                messageMedia2.force_large_media = !z15;
                                            }
                                            if (pc0Var7.r.previewMessages.size() > 0 && (message = pc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                                boolean z16 = messagePreviewParams7.webpageSmall;
                                                messageMedia.force_small_media = z16;
                                                messageMedia.force_large_media = !z16;
                                            }
                                            pc0Var7.h();
                                            pc0Var7.U = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        pc0 pc0Var8 = this.b;
                                        MessagePreviewParams messagePreviewParams8 = pc0Var8.c0.d;
                                        boolean z17 = messagePreviewParams8.webpageTop;
                                        messagePreviewParams8.webpageTop = !z17;
                                        pc0Var8.E.a(z17, true);
                                        if (pc0Var8.r.messages.size() > 0 && (message4 = pc0Var8.r.messages.get(0).messageOwner) != null) {
                                            message4.invert_media = messagePreviewParams8.webpageTop;
                                        }
                                        if (pc0Var8.r.previewMessages.size() > 0 && (message3 = pc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                            message3.invert_media = messagePreviewParams8.webpageTop;
                                        }
                                        pc0Var8.h();
                                        pc0Var8.U = true;
                                        break;
                                }
                            }
                        });
                        pc0Var2 = pc0Var3;
                        viewOutlineProvider = null;
                    }
                }
            } else {
                if (!UserConfig.getInstance(vc0Var.w).isPremium()) {
                    for (int i20 = 0; i20 < messagePreviewParams.forwardMessages.messages.size(); i20++) {
                        if (messagePreviewParams.forwardMessages.messages.get(i20).type == 36) {
                            z10 = false;
                            break;
                        }
                    }
                }
                z10 = true;
                uc0 uc0Var5 = new uc0(context, R.raw.name_hide, LocaleController.getString(messagePreviewParams.multipleUsers ? R.string.ShowSenderNames : R.string.ShowSendersName), R.raw.name_show, LocaleController.getString(messagePreviewParams.multipleUsers ? R.string.HideSenderNames : R.string.HideSendersName), vc0Var.F);
                this.s.a(uc0Var5, w7.x5.n(-1, 48));
                if (messagePreviewParams.hasCaption) {
                    uc0 uc0Var6 = new uc0(context, R.raw.caption_hide, LocaleController.getString(R.string.ShowCaption), R.raw.caption_show, LocaleController.getString(R.string.HideCaption), vc0Var.F);
                    uc0Var6.a(messagePreviewParams.hideCaption, false);
                    this.s.a(uc0Var6, w7.x5.n(-1, 48));
                    uc0Var = uc0Var6;
                } else {
                    uc0Var = null;
                }
                org.telegram.ui.ActionBar.f1 f1Var3 = new org.telegram.ui.ActionBar.f1(0, context, vc0Var.F, true, false);
                final int i21 = 7;
                f1Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.zb0
                    public final /* synthetic */ pc0 b;

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
                                pc0 pc0Var4 = this.b;
                                pc0Var4.c0.d.quote = null;
                                pc0Var4.e.f(false);
                                pc0Var4.g(false, false);
                                pc0Var4.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                pc0 pc0Var5 = this.b;
                                hc0 hc0Var2 = pc0Var5.e;
                                vc0 vc0Var2 = pc0Var5.c0;
                                if (pc0Var5.c(null) != null) {
                                    if (hc0Var2.v - hc0Var2.u <= MessagesController.getInstance(vc0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.w9 w9Var = hc0Var2.W;
                                        MessageObject c11 = pc0Var5.c(w9Var != null ? ((org.telegram.ui.Cells.u1) w9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams4 = vc0Var2.d;
                                        int i172 = hc0Var2.u;
                                        messagePreviewParams4.quoteStart = i172;
                                        int i182 = hc0Var2.v;
                                        messagePreviewParams4.quoteEnd = i182;
                                        messagePreviewParams4.quote = org.telegram.ui.pn.b(i172, i182, c11);
                                        vc0Var2.b();
                                        vc0Var2.a(true);
                                        break;
                                    } else {
                                        pc0Var5.f();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                pc0 pc0Var6 = this.b;
                                hc0 hc0Var3 = pc0Var6.e;
                                vc0 vc0Var3 = pc0Var6.c0;
                                MessagePreviewParams messagePreviewParams5 = vc0Var3.d;
                                int i192 = vc0Var3.w;
                                boolean z13 = vc0Var3.b;
                                if (messagePreviewParams5.quote != null && !z13) {
                                    messagePreviewParams5.quote = null;
                                    hc0Var3.f(false);
                                    pc0Var6.g(false, true);
                                    pc0Var6.k(true);
                                    break;
                                } else if (hc0Var3.v - hc0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                    MessageObject c12 = pc0Var6.c(null);
                                    if (c12 != null) {
                                        if (!hc0Var3.x()) {
                                            messagePreviewParams5.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                            messagePreviewParams5.quoteEnd = min;
                                            messagePreviewParams5.quote = org.telegram.ui.pn.b(messagePreviewParams5.quoteStart, min, c12);
                                            View d10 = pc0Var6.d();
                                            if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                hc0Var3.Z((org.telegram.ui.Cells.u1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            }
                                            if (!z13) {
                                                pc0Var6.s.getSwipeBack().e(pc0Var6.I);
                                            }
                                            pc0Var6.g(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams5.quoteStart = hc0Var3.u;
                                            messagePreviewParams5.quoteEnd = hc0Var3.v;
                                            org.telegram.ui.Cells.w9 w9Var2 = hc0Var3.W;
                                            messagePreviewParams5.quote = org.telegram.ui.pn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, pc0Var6.c(w9Var2 != null ? ((org.telegram.ui.Cells.u1) w9Var2).getMessageObject() : null));
                                            vc0Var3.b();
                                            vc0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    pc0Var6.f();
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
                                vc0 vc0Var4 = this.b.c0;
                                if (!vc0Var4.b) {
                                    org.telegram.ui.jl jlVar = (org.telegram.ui.jl) vc0Var4;
                                    jlVar.a(true);
                                    org.telegram.ui.zn znVar = jlVar.H;
                                    znVar.n5 = null;
                                    znVar.l5 = null;
                                    znVar.f5.updateReply(null, null, znVar.T5, null);
                                    znVar.m8();
                                    break;
                                } else {
                                    org.telegram.ui.jl jlVar2 = (org.telegram.ui.jl) vc0Var4;
                                    jlVar2.a(true);
                                    org.telegram.ui.zn znVar2 = jlVar2.H;
                                    znVar2.l5 = null;
                                    znVar2.Fb(znVar2.n5);
                                    break;
                                }
                            case 7:
                                this.b.c0.c(true);
                                break;
                            case 8:
                                this.b.c0.a(true);
                                break;
                            case 9:
                                org.telegram.ui.jl jlVar3 = (org.telegram.ui.jl) this.b.c0;
                                jlVar3.a(true);
                                org.telegram.ui.zn znVar3 = jlVar3.H;
                                znVar3.f5.updateForward(null, znVar3.T5);
                                znVar3.m8();
                                break;
                            case 10:
                                this.b.c0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.jl jlVar4 = (org.telegram.ui.jl) this.b.c0;
                                jlVar4.a(true);
                                org.telegram.ui.zn znVar4 = jlVar4.H;
                                znVar4.G5 = null;
                                org.telegram.ui.ok okVar = znVar4.Y;
                                if (okVar != null) {
                                    okVar.X2 = null;
                                    okVar.Y2 = false;
                                }
                                MessagePreviewParams messagePreviewParams6 = znVar4.f5;
                                if (messagePreviewParams6 != null) {
                                    i162 = ((org.telegram.ui.ActionBar.n2) znVar4).currentAccount;
                                    MessageObject messageObject = znVar4.n5;
                                    messagePreviewParams6.updateLink(i162, null, null, messageObject == znVar4.X3 ? null : messageObject, znVar4.l5, znVar4.p5);
                                }
                                znVar4.m8();
                                break;
                            case 12:
                                pc0 pc0Var7 = this.b;
                                MessagePreviewParams messagePreviewParams7 = pc0Var7.c0.d;
                                if (messagePreviewParams7.hasMedia) {
                                    boolean z14 = !messagePreviewParams7.webpageSmall;
                                    messagePreviewParams7.webpageSmall = z14;
                                    pc0Var7.G.a(z14, true);
                                    pc0Var7.H.a(messagePreviewParams7.webpageSmall, true);
                                    if (pc0Var7.r.messages.size() > 0 && (message2 = pc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z15 = messagePreviewParams7.webpageSmall;
                                        messageMedia2.force_small_media = z15;
                                        messageMedia2.force_large_media = !z15;
                                    }
                                    if (pc0Var7.r.previewMessages.size() > 0 && (message = pc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z16 = messagePreviewParams7.webpageSmall;
                                        messageMedia.force_small_media = z16;
                                        messageMedia.force_large_media = !z16;
                                    }
                                    pc0Var7.h();
                                    pc0Var7.U = true;
                                    break;
                                }
                                break;
                            default:
                                pc0 pc0Var8 = this.b;
                                MessagePreviewParams messagePreviewParams8 = pc0Var8.c0.d;
                                boolean z17 = messagePreviewParams8.webpageTop;
                                messagePreviewParams8.webpageTop = !z17;
                                pc0Var8.E.a(z17, true);
                                if (pc0Var8.r.messages.size() > 0 && (message4 = pc0Var8.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams8.webpageTop;
                                }
                                if (pc0Var8.r.previewMessages.size() > 0 && (message3 = pc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams8.webpageTop;
                                }
                                pc0Var8.h();
                                pc0Var8.U = true;
                                break;
                        }
                    }
                });
                f1Var3.g(LocaleController.getString(R.string.ChangeRecipient), R.drawable.msg_forward_replace, null);
                this.s.a(f1Var3, w7.x5.n(-1, 48));
                org.telegram.ui.ActionBar.k1 k1Var2 = new org.telegram.ui.ActionBar.k1(context, rc0Var);
                k1Var2.setColor(org.telegram.ui.ActionBar.i6.m1(0.06f, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.E8, rc0Var)));
                k1Var2.setTag(R.id.fit_width_tag, 1);
                this.s.a(k1Var2, w7.x5.n(-1, 8));
                org.telegram.ui.ActionBar.f1 f1Var4 = new org.telegram.ui.ActionBar.f1(1, context, vc0Var.F, false, false);
                f1Var4.g(LocaleController.getString(R.string.ApplyChanges), R.drawable.msg_select, null);
                final int i22 = 8;
                f1Var4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.zb0
                    public final /* synthetic */ pc0 b;

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
                                pc0 pc0Var4 = this.b;
                                pc0Var4.c0.d.quote = null;
                                pc0Var4.e.f(false);
                                pc0Var4.g(false, false);
                                pc0Var4.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                pc0 pc0Var5 = this.b;
                                hc0 hc0Var2 = pc0Var5.e;
                                vc0 vc0Var2 = pc0Var5.c0;
                                if (pc0Var5.c(null) != null) {
                                    if (hc0Var2.v - hc0Var2.u <= MessagesController.getInstance(vc0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.w9 w9Var = hc0Var2.W;
                                        MessageObject c11 = pc0Var5.c(w9Var != null ? ((org.telegram.ui.Cells.u1) w9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams4 = vc0Var2.d;
                                        int i172 = hc0Var2.u;
                                        messagePreviewParams4.quoteStart = i172;
                                        int i182 = hc0Var2.v;
                                        messagePreviewParams4.quoteEnd = i182;
                                        messagePreviewParams4.quote = org.telegram.ui.pn.b(i172, i182, c11);
                                        vc0Var2.b();
                                        vc0Var2.a(true);
                                        break;
                                    } else {
                                        pc0Var5.f();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                pc0 pc0Var6 = this.b;
                                hc0 hc0Var3 = pc0Var6.e;
                                vc0 vc0Var3 = pc0Var6.c0;
                                MessagePreviewParams messagePreviewParams5 = vc0Var3.d;
                                int i192 = vc0Var3.w;
                                boolean z13 = vc0Var3.b;
                                if (messagePreviewParams5.quote != null && !z13) {
                                    messagePreviewParams5.quote = null;
                                    hc0Var3.f(false);
                                    pc0Var6.g(false, true);
                                    pc0Var6.k(true);
                                    break;
                                } else if (hc0Var3.v - hc0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                    MessageObject c12 = pc0Var6.c(null);
                                    if (c12 != null) {
                                        if (!hc0Var3.x()) {
                                            messagePreviewParams5.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                            messagePreviewParams5.quoteEnd = min;
                                            messagePreviewParams5.quote = org.telegram.ui.pn.b(messagePreviewParams5.quoteStart, min, c12);
                                            View d10 = pc0Var6.d();
                                            if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                hc0Var3.Z((org.telegram.ui.Cells.u1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            }
                                            if (!z13) {
                                                pc0Var6.s.getSwipeBack().e(pc0Var6.I);
                                            }
                                            pc0Var6.g(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams5.quoteStart = hc0Var3.u;
                                            messagePreviewParams5.quoteEnd = hc0Var3.v;
                                            org.telegram.ui.Cells.w9 w9Var2 = hc0Var3.W;
                                            messagePreviewParams5.quote = org.telegram.ui.pn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, pc0Var6.c(w9Var2 != null ? ((org.telegram.ui.Cells.u1) w9Var2).getMessageObject() : null));
                                            vc0Var3.b();
                                            vc0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    pc0Var6.f();
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
                                vc0 vc0Var4 = this.b.c0;
                                if (!vc0Var4.b) {
                                    org.telegram.ui.jl jlVar = (org.telegram.ui.jl) vc0Var4;
                                    jlVar.a(true);
                                    org.telegram.ui.zn znVar = jlVar.H;
                                    znVar.n5 = null;
                                    znVar.l5 = null;
                                    znVar.f5.updateReply(null, null, znVar.T5, null);
                                    znVar.m8();
                                    break;
                                } else {
                                    org.telegram.ui.jl jlVar2 = (org.telegram.ui.jl) vc0Var4;
                                    jlVar2.a(true);
                                    org.telegram.ui.zn znVar2 = jlVar2.H;
                                    znVar2.l5 = null;
                                    znVar2.Fb(znVar2.n5);
                                    break;
                                }
                            case 7:
                                this.b.c0.c(true);
                                break;
                            case 8:
                                this.b.c0.a(true);
                                break;
                            case 9:
                                org.telegram.ui.jl jlVar3 = (org.telegram.ui.jl) this.b.c0;
                                jlVar3.a(true);
                                org.telegram.ui.zn znVar3 = jlVar3.H;
                                znVar3.f5.updateForward(null, znVar3.T5);
                                znVar3.m8();
                                break;
                            case 10:
                                this.b.c0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.jl jlVar4 = (org.telegram.ui.jl) this.b.c0;
                                jlVar4.a(true);
                                org.telegram.ui.zn znVar4 = jlVar4.H;
                                znVar4.G5 = null;
                                org.telegram.ui.ok okVar = znVar4.Y;
                                if (okVar != null) {
                                    okVar.X2 = null;
                                    okVar.Y2 = false;
                                }
                                MessagePreviewParams messagePreviewParams6 = znVar4.f5;
                                if (messagePreviewParams6 != null) {
                                    i162 = ((org.telegram.ui.ActionBar.n2) znVar4).currentAccount;
                                    MessageObject messageObject = znVar4.n5;
                                    messagePreviewParams6.updateLink(i162, null, null, messageObject == znVar4.X3 ? null : messageObject, znVar4.l5, znVar4.p5);
                                }
                                znVar4.m8();
                                break;
                            case 12:
                                pc0 pc0Var7 = this.b;
                                MessagePreviewParams messagePreviewParams7 = pc0Var7.c0.d;
                                if (messagePreviewParams7.hasMedia) {
                                    boolean z14 = !messagePreviewParams7.webpageSmall;
                                    messagePreviewParams7.webpageSmall = z14;
                                    pc0Var7.G.a(z14, true);
                                    pc0Var7.H.a(messagePreviewParams7.webpageSmall, true);
                                    if (pc0Var7.r.messages.size() > 0 && (message2 = pc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z15 = messagePreviewParams7.webpageSmall;
                                        messageMedia2.force_small_media = z15;
                                        messageMedia2.force_large_media = !z15;
                                    }
                                    if (pc0Var7.r.previewMessages.size() > 0 && (message = pc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z16 = messagePreviewParams7.webpageSmall;
                                        messageMedia.force_small_media = z16;
                                        messageMedia.force_large_media = !z16;
                                    }
                                    pc0Var7.h();
                                    pc0Var7.U = true;
                                    break;
                                }
                                break;
                            default:
                                pc0 pc0Var8 = this.b;
                                MessagePreviewParams messagePreviewParams8 = pc0Var8.c0.d;
                                boolean z17 = messagePreviewParams8.webpageTop;
                                messagePreviewParams8.webpageTop = !z17;
                                pc0Var8.E.a(z17, true);
                                if (pc0Var8.r.messages.size() > 0 && (message4 = pc0Var8.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams8.webpageTop;
                                }
                                if (pc0Var8.r.previewMessages.size() > 0 && (message3 = pc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams8.webpageTop;
                                }
                                pc0Var8.h();
                                pc0Var8.U = true;
                                break;
                        }
                    }
                });
                this.s.a(f1Var4, w7.x5.n(-1, 48));
                org.telegram.ui.ActionBar.f1 f1Var5 = new org.telegram.ui.ActionBar.f1(1, context, vc0Var.F, false, true);
                f1Var5.g(LocaleController.getString(R.string.DoNotForward), R.drawable.msg_delete, null);
                int w03 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.q7, rc0Var);
                int i23 = org.telegram.ui.ActionBar.i6.p7;
                f1Var5.c(w03, org.telegram.ui.ActionBar.i6.w0(i23, rc0Var));
                final int i24 = 9;
                f1Var5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.zb0
                    public final /* synthetic */ pc0 b;

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
                                pc0 pc0Var4 = this.b;
                                pc0Var4.c0.d.quote = null;
                                pc0Var4.e.f(false);
                                pc0Var4.g(false, false);
                                pc0Var4.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                pc0 pc0Var5 = this.b;
                                hc0 hc0Var2 = pc0Var5.e;
                                vc0 vc0Var2 = pc0Var5.c0;
                                if (pc0Var5.c(null) != null) {
                                    if (hc0Var2.v - hc0Var2.u <= MessagesController.getInstance(vc0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.w9 w9Var = hc0Var2.W;
                                        MessageObject c11 = pc0Var5.c(w9Var != null ? ((org.telegram.ui.Cells.u1) w9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams4 = vc0Var2.d;
                                        int i172 = hc0Var2.u;
                                        messagePreviewParams4.quoteStart = i172;
                                        int i182 = hc0Var2.v;
                                        messagePreviewParams4.quoteEnd = i182;
                                        messagePreviewParams4.quote = org.telegram.ui.pn.b(i172, i182, c11);
                                        vc0Var2.b();
                                        vc0Var2.a(true);
                                        break;
                                    } else {
                                        pc0Var5.f();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                pc0 pc0Var6 = this.b;
                                hc0 hc0Var3 = pc0Var6.e;
                                vc0 vc0Var3 = pc0Var6.c0;
                                MessagePreviewParams messagePreviewParams5 = vc0Var3.d;
                                int i192 = vc0Var3.w;
                                boolean z13 = vc0Var3.b;
                                if (messagePreviewParams5.quote != null && !z13) {
                                    messagePreviewParams5.quote = null;
                                    hc0Var3.f(false);
                                    pc0Var6.g(false, true);
                                    pc0Var6.k(true);
                                    break;
                                } else if (hc0Var3.v - hc0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                    MessageObject c12 = pc0Var6.c(null);
                                    if (c12 != null) {
                                        if (!hc0Var3.x()) {
                                            messagePreviewParams5.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                            messagePreviewParams5.quoteEnd = min;
                                            messagePreviewParams5.quote = org.telegram.ui.pn.b(messagePreviewParams5.quoteStart, min, c12);
                                            View d10 = pc0Var6.d();
                                            if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                hc0Var3.Z((org.telegram.ui.Cells.u1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            }
                                            if (!z13) {
                                                pc0Var6.s.getSwipeBack().e(pc0Var6.I);
                                            }
                                            pc0Var6.g(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams5.quoteStart = hc0Var3.u;
                                            messagePreviewParams5.quoteEnd = hc0Var3.v;
                                            org.telegram.ui.Cells.w9 w9Var2 = hc0Var3.W;
                                            messagePreviewParams5.quote = org.telegram.ui.pn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, pc0Var6.c(w9Var2 != null ? ((org.telegram.ui.Cells.u1) w9Var2).getMessageObject() : null));
                                            vc0Var3.b();
                                            vc0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    pc0Var6.f();
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
                                vc0 vc0Var4 = this.b.c0;
                                if (!vc0Var4.b) {
                                    org.telegram.ui.jl jlVar = (org.telegram.ui.jl) vc0Var4;
                                    jlVar.a(true);
                                    org.telegram.ui.zn znVar = jlVar.H;
                                    znVar.n5 = null;
                                    znVar.l5 = null;
                                    znVar.f5.updateReply(null, null, znVar.T5, null);
                                    znVar.m8();
                                    break;
                                } else {
                                    org.telegram.ui.jl jlVar2 = (org.telegram.ui.jl) vc0Var4;
                                    jlVar2.a(true);
                                    org.telegram.ui.zn znVar2 = jlVar2.H;
                                    znVar2.l5 = null;
                                    znVar2.Fb(znVar2.n5);
                                    break;
                                }
                            case 7:
                                this.b.c0.c(true);
                                break;
                            case 8:
                                this.b.c0.a(true);
                                break;
                            case 9:
                                org.telegram.ui.jl jlVar3 = (org.telegram.ui.jl) this.b.c0;
                                jlVar3.a(true);
                                org.telegram.ui.zn znVar3 = jlVar3.H;
                                znVar3.f5.updateForward(null, znVar3.T5);
                                znVar3.m8();
                                break;
                            case 10:
                                this.b.c0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.jl jlVar4 = (org.telegram.ui.jl) this.b.c0;
                                jlVar4.a(true);
                                org.telegram.ui.zn znVar4 = jlVar4.H;
                                znVar4.G5 = null;
                                org.telegram.ui.ok okVar = znVar4.Y;
                                if (okVar != null) {
                                    okVar.X2 = null;
                                    okVar.Y2 = false;
                                }
                                MessagePreviewParams messagePreviewParams6 = znVar4.f5;
                                if (messagePreviewParams6 != null) {
                                    i162 = ((org.telegram.ui.ActionBar.n2) znVar4).currentAccount;
                                    MessageObject messageObject = znVar4.n5;
                                    messagePreviewParams6.updateLink(i162, null, null, messageObject == znVar4.X3 ? null : messageObject, znVar4.l5, znVar4.p5);
                                }
                                znVar4.m8();
                                break;
                            case 12:
                                pc0 pc0Var7 = this.b;
                                MessagePreviewParams messagePreviewParams7 = pc0Var7.c0.d;
                                if (messagePreviewParams7.hasMedia) {
                                    boolean z14 = !messagePreviewParams7.webpageSmall;
                                    messagePreviewParams7.webpageSmall = z14;
                                    pc0Var7.G.a(z14, true);
                                    pc0Var7.H.a(messagePreviewParams7.webpageSmall, true);
                                    if (pc0Var7.r.messages.size() > 0 && (message2 = pc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z15 = messagePreviewParams7.webpageSmall;
                                        messageMedia2.force_small_media = z15;
                                        messageMedia2.force_large_media = !z15;
                                    }
                                    if (pc0Var7.r.previewMessages.size() > 0 && (message = pc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z16 = messagePreviewParams7.webpageSmall;
                                        messageMedia.force_small_media = z16;
                                        messageMedia.force_large_media = !z16;
                                    }
                                    pc0Var7.h();
                                    pc0Var7.U = true;
                                    break;
                                }
                                break;
                            default:
                                pc0 pc0Var8 = this.b;
                                MessagePreviewParams messagePreviewParams8 = pc0Var8.c0.d;
                                boolean z17 = messagePreviewParams8.webpageTop;
                                messagePreviewParams8.webpageTop = !z17;
                                pc0Var8.E.a(z17, true);
                                if (pc0Var8.r.messages.size() > 0 && (message4 = pc0Var8.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams8.webpageTop;
                                }
                                if (pc0Var8.r.previewMessages.size() > 0 && (message3 = pc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams8.webpageTop;
                                }
                                pc0Var8.h();
                                pc0Var8.U = true;
                                break;
                        }
                    }
                });
                f1Var5.setSelectorColor(org.telegram.ui.ActionBar.i6.m1(0.12f, org.telegram.ui.ActionBar.i6.x0(null, i23, false)));
                this.s.a(f1Var5, w7.x5.n(-1, 48));
                uc0Var5.a(messagePreviewParams.hideForwardSendersName, false);
                uc0 uc0Var7 = uc0Var;
                pc0 pc0Var4 = this;
                uc0Var5.setOnClickListener(new cc0(this, z10, context, uc0Var7, uc0Var5, 0));
                pc0Var = pc0Var4;
                if (uc0Var7 != null) {
                    uc0Var7.setOnClickListener(new ai.d0(pc0Var4, uc0Var7, uc0Var5, 24));
                    pc0Var = pc0Var4;
                }
            }
            context2 = context;
            pc0Var2 = pc0Var;
            viewOutlineProvider = null;
        } else {
            if (!messages.hasText || messagePreviewParams3.isSecret) {
                r11 = 0;
                messagePreviewParams2 = messagePreviewParams3;
            } else {
                LinearLayout e7 = org.telegram.messenger.bi.e(context3, 1);
                if (z12) {
                    drawable = null;
                    z11 = true;
                    linearLayout = e7;
                } else {
                    ?? r92 = e7;
                    drawable = null;
                    org.telegram.ui.ActionBar.f1 f1Var6 = new org.telegram.ui.ActionBar.f1(0, context3, vc0Var.F, true, false);
                    f1Var6.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                    f1Var6.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.zb0
                        public final /* synthetic */ pc0 b;

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
                                    pc0 pc0Var42 = this.b;
                                    pc0Var42.c0.d.quote = null;
                                    pc0Var42.e.f(false);
                                    pc0Var42.g(false, false);
                                    pc0Var42.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    pc0 pc0Var5 = this.b;
                                    hc0 hc0Var2 = pc0Var5.e;
                                    vc0 vc0Var2 = pc0Var5.c0;
                                    if (pc0Var5.c(null) != null) {
                                        if (hc0Var2.v - hc0Var2.u <= MessagesController.getInstance(vc0Var2.w).quoteLengthMax) {
                                            org.telegram.ui.Cells.w9 w9Var = hc0Var2.W;
                                            MessageObject c11 = pc0Var5.c(w9Var != null ? ((org.telegram.ui.Cells.u1) w9Var).getMessageObject() : null);
                                            MessagePreviewParams messagePreviewParams4 = vc0Var2.d;
                                            int i172 = hc0Var2.u;
                                            messagePreviewParams4.quoteStart = i172;
                                            int i182 = hc0Var2.v;
                                            messagePreviewParams4.quoteEnd = i182;
                                            messagePreviewParams4.quote = org.telegram.ui.pn.b(i172, i182, c11);
                                            vc0Var2.b();
                                            vc0Var2.a(true);
                                            break;
                                        } else {
                                            pc0Var5.f();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    pc0 pc0Var6 = this.b;
                                    hc0 hc0Var3 = pc0Var6.e;
                                    vc0 vc0Var3 = pc0Var6.c0;
                                    MessagePreviewParams messagePreviewParams5 = vc0Var3.d;
                                    int i192 = vc0Var3.w;
                                    boolean z13 = vc0Var3.b;
                                    if (messagePreviewParams5.quote != null && !z13) {
                                        messagePreviewParams5.quote = null;
                                        hc0Var3.f(false);
                                        pc0Var6.g(false, true);
                                        pc0Var6.k(true);
                                        break;
                                    } else if (hc0Var3.v - hc0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                        MessageObject c12 = pc0Var6.c(null);
                                        if (c12 != null) {
                                            if (!hc0Var3.x()) {
                                                messagePreviewParams5.quoteStart = 0;
                                                int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                                messagePreviewParams5.quoteEnd = min;
                                                messagePreviewParams5.quote = org.telegram.ui.pn.b(messagePreviewParams5.quoteStart, min, c12);
                                                View d10 = pc0Var6.d();
                                                if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                    hc0Var3.Z((org.telegram.ui.Cells.u1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                }
                                                if (!z13) {
                                                    pc0Var6.s.getSwipeBack().e(pc0Var6.I);
                                                }
                                                pc0Var6.g(true, true);
                                                break;
                                            } else {
                                                messagePreviewParams5.quoteStart = hc0Var3.u;
                                                messagePreviewParams5.quoteEnd = hc0Var3.v;
                                                org.telegram.ui.Cells.w9 w9Var2 = hc0Var3.W;
                                                messagePreviewParams5.quote = org.telegram.ui.pn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, pc0Var6.c(w9Var2 != null ? ((org.telegram.ui.Cells.u1) w9Var2).getMessageObject() : null));
                                                vc0Var3.b();
                                                vc0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        pc0Var6.f();
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
                                    vc0 vc0Var4 = this.b.c0;
                                    if (!vc0Var4.b) {
                                        org.telegram.ui.jl jlVar = (org.telegram.ui.jl) vc0Var4;
                                        jlVar.a(true);
                                        org.telegram.ui.zn znVar = jlVar.H;
                                        znVar.n5 = null;
                                        znVar.l5 = null;
                                        znVar.f5.updateReply(null, null, znVar.T5, null);
                                        znVar.m8();
                                        break;
                                    } else {
                                        org.telegram.ui.jl jlVar2 = (org.telegram.ui.jl) vc0Var4;
                                        jlVar2.a(true);
                                        org.telegram.ui.zn znVar2 = jlVar2.H;
                                        znVar2.l5 = null;
                                        znVar2.Fb(znVar2.n5);
                                        break;
                                    }
                                case 7:
                                    this.b.c0.c(true);
                                    break;
                                case 8:
                                    this.b.c0.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.jl jlVar3 = (org.telegram.ui.jl) this.b.c0;
                                    jlVar3.a(true);
                                    org.telegram.ui.zn znVar3 = jlVar3.H;
                                    znVar3.f5.updateForward(null, znVar3.T5);
                                    znVar3.m8();
                                    break;
                                case 10:
                                    this.b.c0.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.jl jlVar4 = (org.telegram.ui.jl) this.b.c0;
                                    jlVar4.a(true);
                                    org.telegram.ui.zn znVar4 = jlVar4.H;
                                    znVar4.G5 = null;
                                    org.telegram.ui.ok okVar = znVar4.Y;
                                    if (okVar != null) {
                                        okVar.X2 = null;
                                        okVar.Y2 = false;
                                    }
                                    MessagePreviewParams messagePreviewParams6 = znVar4.f5;
                                    if (messagePreviewParams6 != null) {
                                        i162 = ((org.telegram.ui.ActionBar.n2) znVar4).currentAccount;
                                        MessageObject messageObject = znVar4.n5;
                                        messagePreviewParams6.updateLink(i162, null, null, messageObject == znVar4.X3 ? null : messageObject, znVar4.l5, znVar4.p5);
                                    }
                                    znVar4.m8();
                                    break;
                                case 12:
                                    pc0 pc0Var7 = this.b;
                                    MessagePreviewParams messagePreviewParams7 = pc0Var7.c0.d;
                                    if (messagePreviewParams7.hasMedia) {
                                        boolean z14 = !messagePreviewParams7.webpageSmall;
                                        messagePreviewParams7.webpageSmall = z14;
                                        pc0Var7.G.a(z14, true);
                                        pc0Var7.H.a(messagePreviewParams7.webpageSmall, true);
                                        if (pc0Var7.r.messages.size() > 0 && (message2 = pc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z15 = messagePreviewParams7.webpageSmall;
                                            messageMedia2.force_small_media = z15;
                                            messageMedia2.force_large_media = !z15;
                                        }
                                        if (pc0Var7.r.previewMessages.size() > 0 && (message = pc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                            boolean z16 = messagePreviewParams7.webpageSmall;
                                            messageMedia.force_small_media = z16;
                                            messageMedia.force_large_media = !z16;
                                        }
                                        pc0Var7.h();
                                        pc0Var7.U = true;
                                        break;
                                    }
                                    break;
                                default:
                                    pc0 pc0Var8 = this.b;
                                    MessagePreviewParams messagePreviewParams8 = pc0Var8.c0.d;
                                    boolean z17 = messagePreviewParams8.webpageTop;
                                    messagePreviewParams8.webpageTop = !z17;
                                    pc0Var8.E.a(z17, true);
                                    if (pc0Var8.r.messages.size() > 0 && (message4 = pc0Var8.r.messages.get(0).messageOwner) != null) {
                                        message4.invert_media = messagePreviewParams8.webpageTop;
                                    }
                                    if (pc0Var8.r.previewMessages.size() > 0 && (message3 = pc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                        message3.invert_media = messagePreviewParams8.webpageTop;
                                    }
                                    pc0Var8.h();
                                    pc0Var8.U = true;
                                    break;
                            }
                        }
                    });
                    r92.addView(f1Var6, w7.x5.n(-1, 48));
                    org.telegram.ui.ActionBar.k1 k1Var3 = new org.telegram.ui.ActionBar.k1(context3, rc0Var);
                    k1Var3.setColor(org.telegram.ui.ActionBar.i6.m1(0.06f, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.E8, rc0Var)));
                    k1Var3.setTag(R.id.fit_width_tag, 1);
                    r92.addView(k1Var3, w7.x5.n(-1, 8));
                    org.telegram.ui.ActionBar.f1 f1Var7 = new org.telegram.ui.ActionBar.f1(0, context3, vc0Var.F, false, true);
                    f1Var7.g(LocaleController.getString(R.string.QuoteSelectedPart), R.drawable.menu_quote_specific, null);
                    z11 = true;
                    final boolean z13 = true ? 1 : 0;
                    f1Var7.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.zb0
                        public final /* synthetic */ pc0 b;

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
                                    pc0 pc0Var42 = this.b;
                                    pc0Var42.c0.d.quote = null;
                                    pc0Var42.e.f(false);
                                    pc0Var42.g(false, false);
                                    pc0Var42.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    pc0 pc0Var5 = this.b;
                                    hc0 hc0Var2 = pc0Var5.e;
                                    vc0 vc0Var2 = pc0Var5.c0;
                                    if (pc0Var5.c(null) != null) {
                                        if (hc0Var2.v - hc0Var2.u <= MessagesController.getInstance(vc0Var2.w).quoteLengthMax) {
                                            org.telegram.ui.Cells.w9 w9Var = hc0Var2.W;
                                            MessageObject c11 = pc0Var5.c(w9Var != null ? ((org.telegram.ui.Cells.u1) w9Var).getMessageObject() : null);
                                            MessagePreviewParams messagePreviewParams4 = vc0Var2.d;
                                            int i172 = hc0Var2.u;
                                            messagePreviewParams4.quoteStart = i172;
                                            int i182 = hc0Var2.v;
                                            messagePreviewParams4.quoteEnd = i182;
                                            messagePreviewParams4.quote = org.telegram.ui.pn.b(i172, i182, c11);
                                            vc0Var2.b();
                                            vc0Var2.a(true);
                                            break;
                                        } else {
                                            pc0Var5.f();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    pc0 pc0Var6 = this.b;
                                    hc0 hc0Var3 = pc0Var6.e;
                                    vc0 vc0Var3 = pc0Var6.c0;
                                    MessagePreviewParams messagePreviewParams5 = vc0Var3.d;
                                    int i192 = vc0Var3.w;
                                    boolean z132 = vc0Var3.b;
                                    if (messagePreviewParams5.quote != null && !z132) {
                                        messagePreviewParams5.quote = null;
                                        hc0Var3.f(false);
                                        pc0Var6.g(false, true);
                                        pc0Var6.k(true);
                                        break;
                                    } else if (hc0Var3.v - hc0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                        MessageObject c12 = pc0Var6.c(null);
                                        if (c12 != null) {
                                            if (!hc0Var3.x()) {
                                                messagePreviewParams5.quoteStart = 0;
                                                int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                                messagePreviewParams5.quoteEnd = min;
                                                messagePreviewParams5.quote = org.telegram.ui.pn.b(messagePreviewParams5.quoteStart, min, c12);
                                                View d10 = pc0Var6.d();
                                                if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                    hc0Var3.Z((org.telegram.ui.Cells.u1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                }
                                                if (!z132) {
                                                    pc0Var6.s.getSwipeBack().e(pc0Var6.I);
                                                }
                                                pc0Var6.g(true, true);
                                                break;
                                            } else {
                                                messagePreviewParams5.quoteStart = hc0Var3.u;
                                                messagePreviewParams5.quoteEnd = hc0Var3.v;
                                                org.telegram.ui.Cells.w9 w9Var2 = hc0Var3.W;
                                                messagePreviewParams5.quote = org.telegram.ui.pn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, pc0Var6.c(w9Var2 != null ? ((org.telegram.ui.Cells.u1) w9Var2).getMessageObject() : null));
                                                vc0Var3.b();
                                                vc0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        pc0Var6.f();
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
                                    vc0 vc0Var4 = this.b.c0;
                                    if (!vc0Var4.b) {
                                        org.telegram.ui.jl jlVar = (org.telegram.ui.jl) vc0Var4;
                                        jlVar.a(true);
                                        org.telegram.ui.zn znVar = jlVar.H;
                                        znVar.n5 = null;
                                        znVar.l5 = null;
                                        znVar.f5.updateReply(null, null, znVar.T5, null);
                                        znVar.m8();
                                        break;
                                    } else {
                                        org.telegram.ui.jl jlVar2 = (org.telegram.ui.jl) vc0Var4;
                                        jlVar2.a(true);
                                        org.telegram.ui.zn znVar2 = jlVar2.H;
                                        znVar2.l5 = null;
                                        znVar2.Fb(znVar2.n5);
                                        break;
                                    }
                                case 7:
                                    this.b.c0.c(true);
                                    break;
                                case 8:
                                    this.b.c0.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.jl jlVar3 = (org.telegram.ui.jl) this.b.c0;
                                    jlVar3.a(true);
                                    org.telegram.ui.zn znVar3 = jlVar3.H;
                                    znVar3.f5.updateForward(null, znVar3.T5);
                                    znVar3.m8();
                                    break;
                                case 10:
                                    this.b.c0.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.jl jlVar4 = (org.telegram.ui.jl) this.b.c0;
                                    jlVar4.a(true);
                                    org.telegram.ui.zn znVar4 = jlVar4.H;
                                    znVar4.G5 = null;
                                    org.telegram.ui.ok okVar = znVar4.Y;
                                    if (okVar != null) {
                                        okVar.X2 = null;
                                        okVar.Y2 = false;
                                    }
                                    MessagePreviewParams messagePreviewParams6 = znVar4.f5;
                                    if (messagePreviewParams6 != null) {
                                        i162 = ((org.telegram.ui.ActionBar.n2) znVar4).currentAccount;
                                        MessageObject messageObject = znVar4.n5;
                                        messagePreviewParams6.updateLink(i162, null, null, messageObject == znVar4.X3 ? null : messageObject, znVar4.l5, znVar4.p5);
                                    }
                                    znVar4.m8();
                                    break;
                                case 12:
                                    pc0 pc0Var7 = this.b;
                                    MessagePreviewParams messagePreviewParams7 = pc0Var7.c0.d;
                                    if (messagePreviewParams7.hasMedia) {
                                        boolean z14 = !messagePreviewParams7.webpageSmall;
                                        messagePreviewParams7.webpageSmall = z14;
                                        pc0Var7.G.a(z14, true);
                                        pc0Var7.H.a(messagePreviewParams7.webpageSmall, true);
                                        if (pc0Var7.r.messages.size() > 0 && (message2 = pc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z15 = messagePreviewParams7.webpageSmall;
                                            messageMedia2.force_small_media = z15;
                                            messageMedia2.force_large_media = !z15;
                                        }
                                        if (pc0Var7.r.previewMessages.size() > 0 && (message = pc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                            boolean z16 = messagePreviewParams7.webpageSmall;
                                            messageMedia.force_small_media = z16;
                                            messageMedia.force_large_media = !z16;
                                        }
                                        pc0Var7.h();
                                        pc0Var7.U = true;
                                        break;
                                    }
                                    break;
                                default:
                                    pc0 pc0Var8 = this.b;
                                    MessagePreviewParams messagePreviewParams8 = pc0Var8.c0.d;
                                    boolean z17 = messagePreviewParams8.webpageTop;
                                    messagePreviewParams8.webpageTop = !z17;
                                    pc0Var8.E.a(z17, true);
                                    if (pc0Var8.r.messages.size() > 0 && (message4 = pc0Var8.r.messages.get(0).messageOwner) != null) {
                                        message4.invert_media = messagePreviewParams8.webpageTop;
                                    }
                                    if (pc0Var8.r.previewMessages.size() > 0 && (message3 = pc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                        message3.invert_media = messagePreviewParams8.webpageTop;
                                    }
                                    pc0Var8.h();
                                    pc0Var8.U = true;
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
                gc0 gc0Var = new gc0(1, 0, context, vc0Var.F, true, false);
                this.v = gc0Var;
                gc0Var.g(LocaleController.getString(z12 ? R.string.QuoteSelectedPart : R.string.SelectSpecificQuote), R.drawable.menu_select_quote, drawable);
                gc0 gc0Var2 = new gc0(1, 1, context, vc0Var.F, true, false);
                context3 = context;
                this.w = gc0Var2;
                gc0Var2.g(LocaleController.getString(R.string.ClearQuote), R.drawable.menu_quote_delete, drawable);
                frameLayout2.setBackground(org.telegram.ui.ActionBar.i6.Z(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.I5, rc0Var), 6, 0));
                final int i25 = 2;
                frameLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.zb0
                    public final /* synthetic */ pc0 b;

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
                                pc0 pc0Var42 = this.b;
                                pc0Var42.c0.d.quote = null;
                                pc0Var42.e.f(false);
                                pc0Var42.g(false, false);
                                pc0Var42.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                pc0 pc0Var5 = this.b;
                                hc0 hc0Var2 = pc0Var5.e;
                                vc0 vc0Var2 = pc0Var5.c0;
                                if (pc0Var5.c(null) != null) {
                                    if (hc0Var2.v - hc0Var2.u <= MessagesController.getInstance(vc0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.w9 w9Var = hc0Var2.W;
                                        MessageObject c11 = pc0Var5.c(w9Var != null ? ((org.telegram.ui.Cells.u1) w9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams4 = vc0Var2.d;
                                        int i172 = hc0Var2.u;
                                        messagePreviewParams4.quoteStart = i172;
                                        int i182 = hc0Var2.v;
                                        messagePreviewParams4.quoteEnd = i182;
                                        messagePreviewParams4.quote = org.telegram.ui.pn.b(i172, i182, c11);
                                        vc0Var2.b();
                                        vc0Var2.a(true);
                                        break;
                                    } else {
                                        pc0Var5.f();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                pc0 pc0Var6 = this.b;
                                hc0 hc0Var3 = pc0Var6.e;
                                vc0 vc0Var3 = pc0Var6.c0;
                                MessagePreviewParams messagePreviewParams5 = vc0Var3.d;
                                int i192 = vc0Var3.w;
                                boolean z132 = vc0Var3.b;
                                if (messagePreviewParams5.quote != null && !z132) {
                                    messagePreviewParams5.quote = null;
                                    hc0Var3.f(false);
                                    pc0Var6.g(false, true);
                                    pc0Var6.k(true);
                                    break;
                                } else if (hc0Var3.v - hc0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                    MessageObject c12 = pc0Var6.c(null);
                                    if (c12 != null) {
                                        if (!hc0Var3.x()) {
                                            messagePreviewParams5.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                            messagePreviewParams5.quoteEnd = min;
                                            messagePreviewParams5.quote = org.telegram.ui.pn.b(messagePreviewParams5.quoteStart, min, c12);
                                            View d10 = pc0Var6.d();
                                            if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                hc0Var3.Z((org.telegram.ui.Cells.u1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            }
                                            if (!z132) {
                                                pc0Var6.s.getSwipeBack().e(pc0Var6.I);
                                            }
                                            pc0Var6.g(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams5.quoteStart = hc0Var3.u;
                                            messagePreviewParams5.quoteEnd = hc0Var3.v;
                                            org.telegram.ui.Cells.w9 w9Var2 = hc0Var3.W;
                                            messagePreviewParams5.quote = org.telegram.ui.pn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, pc0Var6.c(w9Var2 != null ? ((org.telegram.ui.Cells.u1) w9Var2).getMessageObject() : null));
                                            vc0Var3.b();
                                            vc0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    pc0Var6.f();
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
                                vc0 vc0Var4 = this.b.c0;
                                if (!vc0Var4.b) {
                                    org.telegram.ui.jl jlVar = (org.telegram.ui.jl) vc0Var4;
                                    jlVar.a(true);
                                    org.telegram.ui.zn znVar = jlVar.H;
                                    znVar.n5 = null;
                                    znVar.l5 = null;
                                    znVar.f5.updateReply(null, null, znVar.T5, null);
                                    znVar.m8();
                                    break;
                                } else {
                                    org.telegram.ui.jl jlVar2 = (org.telegram.ui.jl) vc0Var4;
                                    jlVar2.a(true);
                                    org.telegram.ui.zn znVar2 = jlVar2.H;
                                    znVar2.l5 = null;
                                    znVar2.Fb(znVar2.n5);
                                    break;
                                }
                            case 7:
                                this.b.c0.c(true);
                                break;
                            case 8:
                                this.b.c0.a(true);
                                break;
                            case 9:
                                org.telegram.ui.jl jlVar3 = (org.telegram.ui.jl) this.b.c0;
                                jlVar3.a(true);
                                org.telegram.ui.zn znVar3 = jlVar3.H;
                                znVar3.f5.updateForward(null, znVar3.T5);
                                znVar3.m8();
                                break;
                            case 10:
                                this.b.c0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.jl jlVar4 = (org.telegram.ui.jl) this.b.c0;
                                jlVar4.a(true);
                                org.telegram.ui.zn znVar4 = jlVar4.H;
                                znVar4.G5 = null;
                                org.telegram.ui.ok okVar = znVar4.Y;
                                if (okVar != null) {
                                    okVar.X2 = null;
                                    okVar.Y2 = false;
                                }
                                MessagePreviewParams messagePreviewParams6 = znVar4.f5;
                                if (messagePreviewParams6 != null) {
                                    i162 = ((org.telegram.ui.ActionBar.n2) znVar4).currentAccount;
                                    MessageObject messageObject = znVar4.n5;
                                    messagePreviewParams6.updateLink(i162, null, null, messageObject == znVar4.X3 ? null : messageObject, znVar4.l5, znVar4.p5);
                                }
                                znVar4.m8();
                                break;
                            case 12:
                                pc0 pc0Var7 = this.b;
                                MessagePreviewParams messagePreviewParams7 = pc0Var7.c0.d;
                                if (messagePreviewParams7.hasMedia) {
                                    boolean z14 = !messagePreviewParams7.webpageSmall;
                                    messagePreviewParams7.webpageSmall = z14;
                                    pc0Var7.G.a(z14, true);
                                    pc0Var7.H.a(messagePreviewParams7.webpageSmall, true);
                                    if (pc0Var7.r.messages.size() > 0 && (message2 = pc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z15 = messagePreviewParams7.webpageSmall;
                                        messageMedia2.force_small_media = z15;
                                        messageMedia2.force_large_media = !z15;
                                    }
                                    if (pc0Var7.r.previewMessages.size() > 0 && (message = pc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z16 = messagePreviewParams7.webpageSmall;
                                        messageMedia.force_small_media = z16;
                                        messageMedia.force_large_media = !z16;
                                    }
                                    pc0Var7.h();
                                    pc0Var7.U = true;
                                    break;
                                }
                                break;
                            default:
                                pc0 pc0Var8 = this.b;
                                MessagePreviewParams messagePreviewParams8 = pc0Var8.c0.d;
                                boolean z17 = messagePreviewParams8.webpageTop;
                                messagePreviewParams8.webpageTop = !z17;
                                pc0Var8.E.a(z17, true);
                                if (pc0Var8.r.messages.size() > 0 && (message4 = pc0Var8.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams8.webpageTop;
                                }
                                if (pc0Var8.r.previewMessages.size() > 0 && (message3 = pc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams8.webpageTop;
                                }
                                pc0Var8.h();
                                pc0Var8.U = true;
                                break;
                        }
                    }
                });
                frameLayout2.addView(gc0Var, w7.x5.d(48.0f, -1));
                frameLayout2.addView(gc0Var2, w7.x5.d(48.0f, -1));
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout2, w7.x5.n(-1, 48));
                r11 = drawable;
            }
            messagePreviewParams = messagePreviewParams2;
            if (!messagePreviewParams.monoforum && !messagePreviewParams.noforwards && !messagePreviewParams.hasSecretMessages) {
                ?? frameLayout3 = new FrameLayout(context3);
                ?? f1Var8 = new org.telegram.ui.ActionBar.f1(1, context3, vc0Var.F, false, false);
                this.x = f1Var8;
                f1Var8.g(LocaleController.getString(R.string.ReplyToAnotherChat), R.drawable.msg_forward_replace, r11);
                final int i26 = 3;
                f1Var8.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.zb0
                    public final /* synthetic */ pc0 b;

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
                                pc0 pc0Var42 = this.b;
                                pc0Var42.c0.d.quote = null;
                                pc0Var42.e.f(false);
                                pc0Var42.g(false, false);
                                pc0Var42.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                pc0 pc0Var5 = this.b;
                                hc0 hc0Var2 = pc0Var5.e;
                                vc0 vc0Var2 = pc0Var5.c0;
                                if (pc0Var5.c(null) != null) {
                                    if (hc0Var2.v - hc0Var2.u <= MessagesController.getInstance(vc0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.w9 w9Var = hc0Var2.W;
                                        MessageObject c11 = pc0Var5.c(w9Var != null ? ((org.telegram.ui.Cells.u1) w9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams4 = vc0Var2.d;
                                        int i172 = hc0Var2.u;
                                        messagePreviewParams4.quoteStart = i172;
                                        int i182 = hc0Var2.v;
                                        messagePreviewParams4.quoteEnd = i182;
                                        messagePreviewParams4.quote = org.telegram.ui.pn.b(i172, i182, c11);
                                        vc0Var2.b();
                                        vc0Var2.a(true);
                                        break;
                                    } else {
                                        pc0Var5.f();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                pc0 pc0Var6 = this.b;
                                hc0 hc0Var3 = pc0Var6.e;
                                vc0 vc0Var3 = pc0Var6.c0;
                                MessagePreviewParams messagePreviewParams5 = vc0Var3.d;
                                int i192 = vc0Var3.w;
                                boolean z132 = vc0Var3.b;
                                if (messagePreviewParams5.quote != null && !z132) {
                                    messagePreviewParams5.quote = null;
                                    hc0Var3.f(false);
                                    pc0Var6.g(false, true);
                                    pc0Var6.k(true);
                                    break;
                                } else if (hc0Var3.v - hc0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                    MessageObject c12 = pc0Var6.c(null);
                                    if (c12 != null) {
                                        if (!hc0Var3.x()) {
                                            messagePreviewParams5.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                            messagePreviewParams5.quoteEnd = min;
                                            messagePreviewParams5.quote = org.telegram.ui.pn.b(messagePreviewParams5.quoteStart, min, c12);
                                            View d10 = pc0Var6.d();
                                            if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                hc0Var3.Z((org.telegram.ui.Cells.u1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            }
                                            if (!z132) {
                                                pc0Var6.s.getSwipeBack().e(pc0Var6.I);
                                            }
                                            pc0Var6.g(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams5.quoteStart = hc0Var3.u;
                                            messagePreviewParams5.quoteEnd = hc0Var3.v;
                                            org.telegram.ui.Cells.w9 w9Var2 = hc0Var3.W;
                                            messagePreviewParams5.quote = org.telegram.ui.pn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, pc0Var6.c(w9Var2 != null ? ((org.telegram.ui.Cells.u1) w9Var2).getMessageObject() : null));
                                            vc0Var3.b();
                                            vc0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    pc0Var6.f();
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
                                vc0 vc0Var4 = this.b.c0;
                                if (!vc0Var4.b) {
                                    org.telegram.ui.jl jlVar = (org.telegram.ui.jl) vc0Var4;
                                    jlVar.a(true);
                                    org.telegram.ui.zn znVar = jlVar.H;
                                    znVar.n5 = null;
                                    znVar.l5 = null;
                                    znVar.f5.updateReply(null, null, znVar.T5, null);
                                    znVar.m8();
                                    break;
                                } else {
                                    org.telegram.ui.jl jlVar2 = (org.telegram.ui.jl) vc0Var4;
                                    jlVar2.a(true);
                                    org.telegram.ui.zn znVar2 = jlVar2.H;
                                    znVar2.l5 = null;
                                    znVar2.Fb(znVar2.n5);
                                    break;
                                }
                            case 7:
                                this.b.c0.c(true);
                                break;
                            case 8:
                                this.b.c0.a(true);
                                break;
                            case 9:
                                org.telegram.ui.jl jlVar3 = (org.telegram.ui.jl) this.b.c0;
                                jlVar3.a(true);
                                org.telegram.ui.zn znVar3 = jlVar3.H;
                                znVar3.f5.updateForward(null, znVar3.T5);
                                znVar3.m8();
                                break;
                            case 10:
                                this.b.c0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.jl jlVar4 = (org.telegram.ui.jl) this.b.c0;
                                jlVar4.a(true);
                                org.telegram.ui.zn znVar4 = jlVar4.H;
                                znVar4.G5 = null;
                                org.telegram.ui.ok okVar = znVar4.Y;
                                if (okVar != null) {
                                    okVar.X2 = null;
                                    okVar.Y2 = false;
                                }
                                MessagePreviewParams messagePreviewParams6 = znVar4.f5;
                                if (messagePreviewParams6 != null) {
                                    i162 = ((org.telegram.ui.ActionBar.n2) znVar4).currentAccount;
                                    MessageObject messageObject = znVar4.n5;
                                    messagePreviewParams6.updateLink(i162, null, null, messageObject == znVar4.X3 ? null : messageObject, znVar4.l5, znVar4.p5);
                                }
                                znVar4.m8();
                                break;
                            case 12:
                                pc0 pc0Var7 = this.b;
                                MessagePreviewParams messagePreviewParams7 = pc0Var7.c0.d;
                                if (messagePreviewParams7.hasMedia) {
                                    boolean z14 = !messagePreviewParams7.webpageSmall;
                                    messagePreviewParams7.webpageSmall = z14;
                                    pc0Var7.G.a(z14, true);
                                    pc0Var7.H.a(messagePreviewParams7.webpageSmall, true);
                                    if (pc0Var7.r.messages.size() > 0 && (message2 = pc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z15 = messagePreviewParams7.webpageSmall;
                                        messageMedia2.force_small_media = z15;
                                        messageMedia2.force_large_media = !z15;
                                    }
                                    if (pc0Var7.r.previewMessages.size() > 0 && (message = pc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z16 = messagePreviewParams7.webpageSmall;
                                        messageMedia.force_small_media = z16;
                                        messageMedia.force_large_media = !z16;
                                    }
                                    pc0Var7.h();
                                    pc0Var7.U = true;
                                    break;
                                }
                                break;
                            default:
                                pc0 pc0Var8 = this.b;
                                MessagePreviewParams messagePreviewParams8 = pc0Var8.c0.d;
                                boolean z17 = messagePreviewParams8.webpageTop;
                                messagePreviewParams8.webpageTop = !z17;
                                pc0Var8.E.a(z17, true);
                                if (pc0Var8.r.messages.size() > 0 && (message4 = pc0Var8.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams8.webpageTop;
                                }
                                if (pc0Var8.r.previewMessages.size() > 0 && (message3 = pc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams8.webpageTop;
                                }
                                pc0Var8.h();
                                pc0Var8.U = true;
                                break;
                        }
                    }
                });
                context3 = context;
                ?? f1Var9 = new org.telegram.ui.ActionBar.f1(1, context3, vc0Var.F, false, false);
                this.y = f1Var9;
                f1Var9.g(LocaleController.getString(R.string.QuoteToAnotherChat), R.drawable.msg_forward_replace, r11);
                final int i27 = 4;
                f1Var9.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.zb0
                    public final /* synthetic */ pc0 b;

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
                                pc0 pc0Var42 = this.b;
                                pc0Var42.c0.d.quote = null;
                                pc0Var42.e.f(false);
                                pc0Var42.g(false, false);
                                pc0Var42.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                pc0 pc0Var5 = this.b;
                                hc0 hc0Var2 = pc0Var5.e;
                                vc0 vc0Var2 = pc0Var5.c0;
                                if (pc0Var5.c(null) != null) {
                                    if (hc0Var2.v - hc0Var2.u <= MessagesController.getInstance(vc0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.w9 w9Var = hc0Var2.W;
                                        MessageObject c11 = pc0Var5.c(w9Var != null ? ((org.telegram.ui.Cells.u1) w9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams4 = vc0Var2.d;
                                        int i172 = hc0Var2.u;
                                        messagePreviewParams4.quoteStart = i172;
                                        int i182 = hc0Var2.v;
                                        messagePreviewParams4.quoteEnd = i182;
                                        messagePreviewParams4.quote = org.telegram.ui.pn.b(i172, i182, c11);
                                        vc0Var2.b();
                                        vc0Var2.a(true);
                                        break;
                                    } else {
                                        pc0Var5.f();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                pc0 pc0Var6 = this.b;
                                hc0 hc0Var3 = pc0Var6.e;
                                vc0 vc0Var3 = pc0Var6.c0;
                                MessagePreviewParams messagePreviewParams5 = vc0Var3.d;
                                int i192 = vc0Var3.w;
                                boolean z132 = vc0Var3.b;
                                if (messagePreviewParams5.quote != null && !z132) {
                                    messagePreviewParams5.quote = null;
                                    hc0Var3.f(false);
                                    pc0Var6.g(false, true);
                                    pc0Var6.k(true);
                                    break;
                                } else if (hc0Var3.v - hc0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                    MessageObject c12 = pc0Var6.c(null);
                                    if (c12 != null) {
                                        if (!hc0Var3.x()) {
                                            messagePreviewParams5.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                            messagePreviewParams5.quoteEnd = min;
                                            messagePreviewParams5.quote = org.telegram.ui.pn.b(messagePreviewParams5.quoteStart, min, c12);
                                            View d10 = pc0Var6.d();
                                            if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                hc0Var3.Z((org.telegram.ui.Cells.u1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            }
                                            if (!z132) {
                                                pc0Var6.s.getSwipeBack().e(pc0Var6.I);
                                            }
                                            pc0Var6.g(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams5.quoteStart = hc0Var3.u;
                                            messagePreviewParams5.quoteEnd = hc0Var3.v;
                                            org.telegram.ui.Cells.w9 w9Var2 = hc0Var3.W;
                                            messagePreviewParams5.quote = org.telegram.ui.pn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, pc0Var6.c(w9Var2 != null ? ((org.telegram.ui.Cells.u1) w9Var2).getMessageObject() : null));
                                            vc0Var3.b();
                                            vc0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    pc0Var6.f();
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
                                vc0 vc0Var4 = this.b.c0;
                                if (!vc0Var4.b) {
                                    org.telegram.ui.jl jlVar = (org.telegram.ui.jl) vc0Var4;
                                    jlVar.a(true);
                                    org.telegram.ui.zn znVar = jlVar.H;
                                    znVar.n5 = null;
                                    znVar.l5 = null;
                                    znVar.f5.updateReply(null, null, znVar.T5, null);
                                    znVar.m8();
                                    break;
                                } else {
                                    org.telegram.ui.jl jlVar2 = (org.telegram.ui.jl) vc0Var4;
                                    jlVar2.a(true);
                                    org.telegram.ui.zn znVar2 = jlVar2.H;
                                    znVar2.l5 = null;
                                    znVar2.Fb(znVar2.n5);
                                    break;
                                }
                            case 7:
                                this.b.c0.c(true);
                                break;
                            case 8:
                                this.b.c0.a(true);
                                break;
                            case 9:
                                org.telegram.ui.jl jlVar3 = (org.telegram.ui.jl) this.b.c0;
                                jlVar3.a(true);
                                org.telegram.ui.zn znVar3 = jlVar3.H;
                                znVar3.f5.updateForward(null, znVar3.T5);
                                znVar3.m8();
                                break;
                            case 10:
                                this.b.c0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.jl jlVar4 = (org.telegram.ui.jl) this.b.c0;
                                jlVar4.a(true);
                                org.telegram.ui.zn znVar4 = jlVar4.H;
                                znVar4.G5 = null;
                                org.telegram.ui.ok okVar = znVar4.Y;
                                if (okVar != null) {
                                    okVar.X2 = null;
                                    okVar.Y2 = false;
                                }
                                MessagePreviewParams messagePreviewParams6 = znVar4.f5;
                                if (messagePreviewParams6 != null) {
                                    i162 = ((org.telegram.ui.ActionBar.n2) znVar4).currentAccount;
                                    MessageObject messageObject = znVar4.n5;
                                    messagePreviewParams6.updateLink(i162, null, null, messageObject == znVar4.X3 ? null : messageObject, znVar4.l5, znVar4.p5);
                                }
                                znVar4.m8();
                                break;
                            case 12:
                                pc0 pc0Var7 = this.b;
                                MessagePreviewParams messagePreviewParams7 = pc0Var7.c0.d;
                                if (messagePreviewParams7.hasMedia) {
                                    boolean z14 = !messagePreviewParams7.webpageSmall;
                                    messagePreviewParams7.webpageSmall = z14;
                                    pc0Var7.G.a(z14, true);
                                    pc0Var7.H.a(messagePreviewParams7.webpageSmall, true);
                                    if (pc0Var7.r.messages.size() > 0 && (message2 = pc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z15 = messagePreviewParams7.webpageSmall;
                                        messageMedia2.force_small_media = z15;
                                        messageMedia2.force_large_media = !z15;
                                    }
                                    if (pc0Var7.r.previewMessages.size() > 0 && (message = pc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z16 = messagePreviewParams7.webpageSmall;
                                        messageMedia.force_small_media = z16;
                                        messageMedia.force_large_media = !z16;
                                    }
                                    pc0Var7.h();
                                    pc0Var7.U = true;
                                    break;
                                }
                                break;
                            default:
                                pc0 pc0Var8 = this.b;
                                MessagePreviewParams messagePreviewParams8 = pc0Var8.c0.d;
                                boolean z17 = messagePreviewParams8.webpageTop;
                                messagePreviewParams8.webpageTop = !z17;
                                pc0Var8.E.a(z17, true);
                                if (pc0Var8.r.messages.size() > 0 && (message4 = pc0Var8.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams8.webpageTop;
                                }
                                if (pc0Var8.r.previewMessages.size() > 0 && (message3 = pc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams8.webpageTop;
                                }
                                pc0Var8.h();
                                pc0Var8.U = true;
                                break;
                        }
                    }
                });
                frameLayout3.addView(f1Var9, w7.x5.d(48.0f, -1));
                frameLayout3.addView(f1Var8, w7.x5.d(48.0f, -1));
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout3, w7.x5.n(-1, 48));
            }
            if (!messagePreviewParams.noforwards && !messagePreviewParams.hasSecretMessages) {
                org.telegram.ui.ActionBar.k1 k1Var4 = new org.telegram.ui.ActionBar.k1(context3, rc0Var);
                k1Var4.setColor(org.telegram.ui.ActionBar.i6.m1(0.06f, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.E8, rc0Var)));
                k1Var4.setTag(R.id.fit_width_tag, 1);
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(k1Var4, w7.x5.n(-1, 8));
            }
            g(messagePreviewParams.quote != null, false);
            ?? f1Var10 = new org.telegram.ui.ActionBar.f1(1, context3, vc0Var.F, false, false);
            f1Var10.g(LocaleController.getString(R.string.ApplyChanges), R.drawable.msg_select, r11);
            final int i28 = 5;
            f1Var10.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.zb0
                public final /* synthetic */ pc0 b;

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
                            pc0 pc0Var42 = this.b;
                            pc0Var42.c0.d.quote = null;
                            pc0Var42.e.f(false);
                            pc0Var42.g(false, false);
                            pc0Var42.s.getSwipeBack().b(true);
                            break;
                        case 1:
                            pc0 pc0Var5 = this.b;
                            hc0 hc0Var2 = pc0Var5.e;
                            vc0 vc0Var2 = pc0Var5.c0;
                            if (pc0Var5.c(null) != null) {
                                if (hc0Var2.v - hc0Var2.u <= MessagesController.getInstance(vc0Var2.w).quoteLengthMax) {
                                    org.telegram.ui.Cells.w9 w9Var = hc0Var2.W;
                                    MessageObject c11 = pc0Var5.c(w9Var != null ? ((org.telegram.ui.Cells.u1) w9Var).getMessageObject() : null);
                                    MessagePreviewParams messagePreviewParams4 = vc0Var2.d;
                                    int i172 = hc0Var2.u;
                                    messagePreviewParams4.quoteStart = i172;
                                    int i182 = hc0Var2.v;
                                    messagePreviewParams4.quoteEnd = i182;
                                    messagePreviewParams4.quote = org.telegram.ui.pn.b(i172, i182, c11);
                                    vc0Var2.b();
                                    vc0Var2.a(true);
                                    break;
                                } else {
                                    pc0Var5.f();
                                    break;
                                }
                            }
                            break;
                        case 2:
                            pc0 pc0Var6 = this.b;
                            hc0 hc0Var3 = pc0Var6.e;
                            vc0 vc0Var3 = pc0Var6.c0;
                            MessagePreviewParams messagePreviewParams5 = vc0Var3.d;
                            int i192 = vc0Var3.w;
                            boolean z132 = vc0Var3.b;
                            if (messagePreviewParams5.quote != null && !z132) {
                                messagePreviewParams5.quote = null;
                                hc0Var3.f(false);
                                pc0Var6.g(false, true);
                                pc0Var6.k(true);
                                break;
                            } else if (hc0Var3.v - hc0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                MessageObject c12 = pc0Var6.c(null);
                                if (c12 != null) {
                                    if (!hc0Var3.x()) {
                                        messagePreviewParams5.quoteStart = 0;
                                        int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                        messagePreviewParams5.quoteEnd = min;
                                        messagePreviewParams5.quote = org.telegram.ui.pn.b(messagePreviewParams5.quoteStart, min, c12);
                                        View d10 = pc0Var6.d();
                                        if (d10 instanceof org.telegram.ui.Cells.u1) {
                                            hc0Var3.Z((org.telegram.ui.Cells.u1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                        }
                                        if (!z132) {
                                            pc0Var6.s.getSwipeBack().e(pc0Var6.I);
                                        }
                                        pc0Var6.g(true, true);
                                        break;
                                    } else {
                                        messagePreviewParams5.quoteStart = hc0Var3.u;
                                        messagePreviewParams5.quoteEnd = hc0Var3.v;
                                        org.telegram.ui.Cells.w9 w9Var2 = hc0Var3.W;
                                        messagePreviewParams5.quote = org.telegram.ui.pn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, pc0Var6.c(w9Var2 != null ? ((org.telegram.ui.Cells.u1) w9Var2).getMessageObject() : null));
                                        vc0Var3.b();
                                        vc0Var3.a(true);
                                        break;
                                    }
                                }
                            } else {
                                pc0Var6.f();
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
                            vc0 vc0Var4 = this.b.c0;
                            if (!vc0Var4.b) {
                                org.telegram.ui.jl jlVar = (org.telegram.ui.jl) vc0Var4;
                                jlVar.a(true);
                                org.telegram.ui.zn znVar = jlVar.H;
                                znVar.n5 = null;
                                znVar.l5 = null;
                                znVar.f5.updateReply(null, null, znVar.T5, null);
                                znVar.m8();
                                break;
                            } else {
                                org.telegram.ui.jl jlVar2 = (org.telegram.ui.jl) vc0Var4;
                                jlVar2.a(true);
                                org.telegram.ui.zn znVar2 = jlVar2.H;
                                znVar2.l5 = null;
                                znVar2.Fb(znVar2.n5);
                                break;
                            }
                        case 7:
                            this.b.c0.c(true);
                            break;
                        case 8:
                            this.b.c0.a(true);
                            break;
                        case 9:
                            org.telegram.ui.jl jlVar3 = (org.telegram.ui.jl) this.b.c0;
                            jlVar3.a(true);
                            org.telegram.ui.zn znVar3 = jlVar3.H;
                            znVar3.f5.updateForward(null, znVar3.T5);
                            znVar3.m8();
                            break;
                        case 10:
                            this.b.c0.a(true);
                            break;
                        case 11:
                            org.telegram.ui.jl jlVar4 = (org.telegram.ui.jl) this.b.c0;
                            jlVar4.a(true);
                            org.telegram.ui.zn znVar4 = jlVar4.H;
                            znVar4.G5 = null;
                            org.telegram.ui.ok okVar = znVar4.Y;
                            if (okVar != null) {
                                okVar.X2 = null;
                                okVar.Y2 = false;
                            }
                            MessagePreviewParams messagePreviewParams6 = znVar4.f5;
                            if (messagePreviewParams6 != null) {
                                i162 = ((org.telegram.ui.ActionBar.n2) znVar4).currentAccount;
                                MessageObject messageObject = znVar4.n5;
                                messagePreviewParams6.updateLink(i162, null, null, messageObject == znVar4.X3 ? null : messageObject, znVar4.l5, znVar4.p5);
                            }
                            znVar4.m8();
                            break;
                        case 12:
                            pc0 pc0Var7 = this.b;
                            MessagePreviewParams messagePreviewParams7 = pc0Var7.c0.d;
                            if (messagePreviewParams7.hasMedia) {
                                boolean z14 = !messagePreviewParams7.webpageSmall;
                                messagePreviewParams7.webpageSmall = z14;
                                pc0Var7.G.a(z14, true);
                                pc0Var7.H.a(messagePreviewParams7.webpageSmall, true);
                                if (pc0Var7.r.messages.size() > 0 && (message2 = pc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                    boolean z15 = messagePreviewParams7.webpageSmall;
                                    messageMedia2.force_small_media = z15;
                                    messageMedia2.force_large_media = !z15;
                                }
                                if (pc0Var7.r.previewMessages.size() > 0 && (message = pc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                    boolean z16 = messagePreviewParams7.webpageSmall;
                                    messageMedia.force_small_media = z16;
                                    messageMedia.force_large_media = !z16;
                                }
                                pc0Var7.h();
                                pc0Var7.U = true;
                                break;
                            }
                            break;
                        default:
                            pc0 pc0Var8 = this.b;
                            MessagePreviewParams messagePreviewParams8 = pc0Var8.c0.d;
                            boolean z17 = messagePreviewParams8.webpageTop;
                            messagePreviewParams8.webpageTop = !z17;
                            pc0Var8.E.a(z17, true);
                            if (pc0Var8.r.messages.size() > 0 && (message4 = pc0Var8.r.messages.get(0).messageOwner) != null) {
                                message4.invert_media = messagePreviewParams8.webpageTop;
                            }
                            if (pc0Var8.r.previewMessages.size() > 0 && (message3 = pc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                message3.invert_media = messagePreviewParams8.webpageTop;
                            }
                            pc0Var8.h();
                            pc0Var8.U = true;
                            break;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(f1Var10, w7.x5.n(-1, 48));
            ?? f1Var11 = new org.telegram.ui.ActionBar.f1(1, context, vc0Var.F, false, true);
            f1Var11.g(LocaleController.getString(z12 ? R.string.DoNotQuote : R.string.DoNotReply), R.drawable.msg_delete, r11);
            int w04 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.q7, rc0Var);
            int i29 = org.telegram.ui.ActionBar.i6.p7;
            f1Var11.c(w04, org.telegram.ui.ActionBar.i6.w0(i29, rc0Var));
            f1Var11.setSelectorColor(org.telegram.ui.ActionBar.i6.m1(0.12f, org.telegram.ui.ActionBar.i6.x0(r11, i29, false)));
            final int i30 = 6;
            f1Var11.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.zb0
                public final /* synthetic */ pc0 b;

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
                            pc0 pc0Var42 = this.b;
                            pc0Var42.c0.d.quote = null;
                            pc0Var42.e.f(false);
                            pc0Var42.g(false, false);
                            pc0Var42.s.getSwipeBack().b(true);
                            break;
                        case 1:
                            pc0 pc0Var5 = this.b;
                            hc0 hc0Var2 = pc0Var5.e;
                            vc0 vc0Var2 = pc0Var5.c0;
                            if (pc0Var5.c(null) != null) {
                                if (hc0Var2.v - hc0Var2.u <= MessagesController.getInstance(vc0Var2.w).quoteLengthMax) {
                                    org.telegram.ui.Cells.w9 w9Var = hc0Var2.W;
                                    MessageObject c11 = pc0Var5.c(w9Var != null ? ((org.telegram.ui.Cells.u1) w9Var).getMessageObject() : null);
                                    MessagePreviewParams messagePreviewParams4 = vc0Var2.d;
                                    int i172 = hc0Var2.u;
                                    messagePreviewParams4.quoteStart = i172;
                                    int i182 = hc0Var2.v;
                                    messagePreviewParams4.quoteEnd = i182;
                                    messagePreviewParams4.quote = org.telegram.ui.pn.b(i172, i182, c11);
                                    vc0Var2.b();
                                    vc0Var2.a(true);
                                    break;
                                } else {
                                    pc0Var5.f();
                                    break;
                                }
                            }
                            break;
                        case 2:
                            pc0 pc0Var6 = this.b;
                            hc0 hc0Var3 = pc0Var6.e;
                            vc0 vc0Var3 = pc0Var6.c0;
                            MessagePreviewParams messagePreviewParams5 = vc0Var3.d;
                            int i192 = vc0Var3.w;
                            boolean z132 = vc0Var3.b;
                            if (messagePreviewParams5.quote != null && !z132) {
                                messagePreviewParams5.quote = null;
                                hc0Var3.f(false);
                                pc0Var6.g(false, true);
                                pc0Var6.k(true);
                                break;
                            } else if (hc0Var3.v - hc0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                MessageObject c12 = pc0Var6.c(null);
                                if (c12 != null) {
                                    if (!hc0Var3.x()) {
                                        messagePreviewParams5.quoteStart = 0;
                                        int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                        messagePreviewParams5.quoteEnd = min;
                                        messagePreviewParams5.quote = org.telegram.ui.pn.b(messagePreviewParams5.quoteStart, min, c12);
                                        View d10 = pc0Var6.d();
                                        if (d10 instanceof org.telegram.ui.Cells.u1) {
                                            hc0Var3.Z((org.telegram.ui.Cells.u1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                        }
                                        if (!z132) {
                                            pc0Var6.s.getSwipeBack().e(pc0Var6.I);
                                        }
                                        pc0Var6.g(true, true);
                                        break;
                                    } else {
                                        messagePreviewParams5.quoteStart = hc0Var3.u;
                                        messagePreviewParams5.quoteEnd = hc0Var3.v;
                                        org.telegram.ui.Cells.w9 w9Var2 = hc0Var3.W;
                                        messagePreviewParams5.quote = org.telegram.ui.pn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, pc0Var6.c(w9Var2 != null ? ((org.telegram.ui.Cells.u1) w9Var2).getMessageObject() : null));
                                        vc0Var3.b();
                                        vc0Var3.a(true);
                                        break;
                                    }
                                }
                            } else {
                                pc0Var6.f();
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
                            vc0 vc0Var4 = this.b.c0;
                            if (!vc0Var4.b) {
                                org.telegram.ui.jl jlVar = (org.telegram.ui.jl) vc0Var4;
                                jlVar.a(true);
                                org.telegram.ui.zn znVar = jlVar.H;
                                znVar.n5 = null;
                                znVar.l5 = null;
                                znVar.f5.updateReply(null, null, znVar.T5, null);
                                znVar.m8();
                                break;
                            } else {
                                org.telegram.ui.jl jlVar2 = (org.telegram.ui.jl) vc0Var4;
                                jlVar2.a(true);
                                org.telegram.ui.zn znVar2 = jlVar2.H;
                                znVar2.l5 = null;
                                znVar2.Fb(znVar2.n5);
                                break;
                            }
                        case 7:
                            this.b.c0.c(true);
                            break;
                        case 8:
                            this.b.c0.a(true);
                            break;
                        case 9:
                            org.telegram.ui.jl jlVar3 = (org.telegram.ui.jl) this.b.c0;
                            jlVar3.a(true);
                            org.telegram.ui.zn znVar3 = jlVar3.H;
                            znVar3.f5.updateForward(null, znVar3.T5);
                            znVar3.m8();
                            break;
                        case 10:
                            this.b.c0.a(true);
                            break;
                        case 11:
                            org.telegram.ui.jl jlVar4 = (org.telegram.ui.jl) this.b.c0;
                            jlVar4.a(true);
                            org.telegram.ui.zn znVar4 = jlVar4.H;
                            znVar4.G5 = null;
                            org.telegram.ui.ok okVar = znVar4.Y;
                            if (okVar != null) {
                                okVar.X2 = null;
                                okVar.Y2 = false;
                            }
                            MessagePreviewParams messagePreviewParams6 = znVar4.f5;
                            if (messagePreviewParams6 != null) {
                                i162 = ((org.telegram.ui.ActionBar.n2) znVar4).currentAccount;
                                MessageObject messageObject = znVar4.n5;
                                messagePreviewParams6.updateLink(i162, null, null, messageObject == znVar4.X3 ? null : messageObject, znVar4.l5, znVar4.p5);
                            }
                            znVar4.m8();
                            break;
                        case 12:
                            pc0 pc0Var7 = this.b;
                            MessagePreviewParams messagePreviewParams7 = pc0Var7.c0.d;
                            if (messagePreviewParams7.hasMedia) {
                                boolean z14 = !messagePreviewParams7.webpageSmall;
                                messagePreviewParams7.webpageSmall = z14;
                                pc0Var7.G.a(z14, true);
                                pc0Var7.H.a(messagePreviewParams7.webpageSmall, true);
                                if (pc0Var7.r.messages.size() > 0 && (message2 = pc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                    boolean z15 = messagePreviewParams7.webpageSmall;
                                    messageMedia2.force_small_media = z15;
                                    messageMedia2.force_large_media = !z15;
                                }
                                if (pc0Var7.r.previewMessages.size() > 0 && (message = pc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                    boolean z16 = messagePreviewParams7.webpageSmall;
                                    messageMedia.force_small_media = z16;
                                    messageMedia.force_large_media = !z16;
                                }
                                pc0Var7.h();
                                pc0Var7.U = true;
                                break;
                            }
                            break;
                        default:
                            pc0 pc0Var8 = this.b;
                            MessagePreviewParams messagePreviewParams8 = pc0Var8.c0.d;
                            boolean z17 = messagePreviewParams8.webpageTop;
                            messagePreviewParams8.webpageTop = !z17;
                            pc0Var8.E.a(z17, true);
                            if (pc0Var8.r.messages.size() > 0 && (message4 = pc0Var8.r.messages.get(0).messageOwner) != null) {
                                message4.invert_media = messagePreviewParams8.webpageTop;
                            }
                            if (pc0Var8.r.previewMessages.size() > 0 && (message3 = pc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                message3.invert_media = messagePreviewParams8.webpageTop;
                            }
                            pc0Var8.h();
                            pc0Var8.U = true;
                            break;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(f1Var11, w7.x5.n(-1, 48));
            context2 = context;
            pc0Var2 = this;
            viewOutlineProvider = r11;
        }
        int i31 = pc0Var2.a;
        if (i31 == 1) {
            pc0Var2.r = messagePreviewParams.forwardMessages;
        } else if (i31 == 0) {
            pc0Var2.r = messagePreviewParams.replyMessage;
        } else if (i31 == 2) {
            pc0Var2.r = messagePreviewParams.linkMessage;
        }
        org.telegram.ui.Cells.aa n10 = pc0Var2.e.n(context2);
        pc0Var2.d = n10;
        n10.setElevation(AndroidUtilities.dp(8.0f));
        n10.setOutlineProvider(viewOutlineProvider);
        if (n10.getParent() instanceof ViewGroup) {
            ((ViewGroup) n10.getParent()).removeView(n10);
        }
        pc0Var2.addView(n10, w7.x5.a(-1.0f, 0.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / AndroidUtilities.density, 0.0f, 0.0f, -1, 51));
        pc0Var2.e.S(pc0Var2.f);
    }

    public static MessageObject.GroupedMessages a(pc0 pc0Var, MessageObject messageObject) {
        if (messageObject.getGroupId() == 0) {
            return null;
        }
        MessageObject.GroupedMessages groupedMessages = pc0Var.r.groupedMessagesMap.get(messageObject.getGroupId());
        if (groupedMessages == null || (groupedMessages.messages.size() > 1 && groupedMessages.getPosition(messageObject) != null)) {
            return groupedMessages;
        }
        return null;
    }

    public static void b(pc0 pc0Var, org.telegram.ui.Cells.u1 u1Var) {
        CharacterStyle characterStyle;
        TLRPC.WebPage webPage;
        if (pc0Var.a == 2) {
            MessagePreviewParams messagePreviewParams = pc0Var.c0.d;
            if (!messagePreviewParams.singleLink && (characterStyle = messagePreviewParams.currentLink) != null && (webPage = messagePreviewParams.webpage) != null && !(webPage instanceof TLRPC.TL_webPagePending)) {
                u1Var.Q3(characterStyle);
                return;
            }
        }
        u1Var.Q3(null);
    }

    public final MessageObject c(MessageObject messageObject) {
        MessageObject.GroupedMessages valueAt;
        vc0 vc0Var = this.c0;
        MessagePreviewParams.Messages messages = vc0Var.d.replyMessage;
        if (messages == null) {
            return null;
        }
        LongSparseArray<MessageObject.GroupedMessages> longSparseArray = messages.groupedMessagesMap;
        if (longSparseArray == null || longSparseArray.size() <= 0 || (valueAt = vc0Var.d.replyMessage.groupedMessagesMap.valueAt(0)) == null) {
            return vc0Var.d.replyMessage.messages.get(0);
        }
        if (valueAt.isDocuments) {
            if (messageObject != null) {
                return messageObject;
            }
            org.telegram.ui.pn pnVar = vc0Var.d.quote;
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
                ic0 ic0Var = this.f;
                if (i10 >= ic0Var.getChildCount()) {
                    break;
                }
                View childAt = ic0Var.getChildAt(i10);
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
        org.telegram.ui.v8 v8Var = this.b;
        if (z10) {
            m6Var.setTranslationY(0.0f);
            v8Var.invalidateOutline();
            v8Var.setTranslationY(0.0f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(0.0f);
        } else {
            m6Var.setTranslationY(i10);
            v8Var.invalidateOutline();
            v8Var.setTranslationY(f7);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((f7 + v8Var.getMeasuredHeight()) - AndroidUtilities.dp(2.0f));
        }
        float x10 = v8Var.getX();
        org.telegram.ui.Cells.aa aaVar = this.d;
        aaVar.setTranslationX(x10);
        aaVar.setTranslationY(v8Var.getY());
    }

    public final void f() {
        vc0 vc0Var = this.c0;
        new ad(vc0Var, vc0Var.F).M(LocaleController.getString(R.string.QuoteMaxError), LocaleController.getString(R.string.QuoteMaxErrorMessage), R.raw.error).j();
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
        gc0 gc0Var = this.w;
        gc0 gc0Var2 = this.v;
        if (!z11) {
            if (gc0Var2 != null) {
                gc0Var2.setAlpha(!z10 ? 1.0f : 0.0f);
                gc0Var2.setVisibility(!z10 ? 0 : 4);
            }
            if (gc0Var != null) {
                gc0Var.setAlpha(z10 ? 1.0f : 0.0f);
                gc0Var.setVisibility(z10 ? 0 : 4);
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
        if (gc0Var2 != null) {
            gc0Var2.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(gc0Var2, (Property<gc0, Float>) property, !z10 ? 1.0f : 0.0f));
        }
        if (gc0Var != null) {
            gc0Var.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(gc0Var, (Property<gc0, Float>) property, z10 ? 1.0f : 0.0f));
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
        this.P.setInterpolator(hs.h);
        this.P.addListener(new fa(15, this, z10));
        this.P.start();
    }

    public final void h() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        vc0 vc0Var = this.c0;
        MessagePreviewParams messagePreviewParams = vc0Var.d;
        kc0 kc0Var = this.h;
        if (kc0Var.k()) {
            this.V = true;
            return;
        }
        for (int i10 = 0; i10 < this.r.previewMessages.size(); i10++) {
            MessageObject messageObject = this.r.previewMessages.get(i10);
            messageObject.forceUpdate = true;
            messageObject.sendAsPeer = vc0Var.a;
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
            kc0Var.V(this.r.groupedMessagesMap.valueAt(i12));
        }
        this.n.q(0, this.r.previewMessages.size());
    }

    public final void i() {
        int i10 = this.R;
        float f7 = this.S;
        vc0 vc0Var = this.c0;
        boolean z10 = vc0Var.v;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        ic0 ic0Var = this.f;
        if (z10) {
            this.S = 0.0f;
            this.R = 0;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(AndroidUtilities.dp(8.0f) + ic0Var.getMeasuredWidth());
        } else {
            int measuredHeight = ic0Var.getMeasuredHeight();
            int i11 = 0;
            for (int i12 = 0; i12 < ic0Var.getChildCount(); i12++) {
                View childAt = ic0Var.getChildAt(i12);
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
                this.R = Math.min(((ic0Var.getMeasuredHeight() - this.R) + b10) - ((int) ((((AndroidUtilities.displaySize.y - (Build.VERSION.SDK_INT >= 35 ? AndroidUtilities.navigationBarHeight : 0)) * 0.8f) - this.W) - AndroidUtilities.dp(8.0f))), this.R);
            }
            float z11 = com.google.android.gms.internal.vision.e2.z(getMeasuredHeight() - AndroidUtilities.dp(16.0f), (this.b.getMeasuredHeight() - this.R) + (this.W - AndroidUtilities.dp(8.0f)), 2.0f, AndroidUtilities.dp(8.0f)) - this.R;
            this.S = z11;
            if (z11 > AndroidUtilities.dp(8.0f)) {
                this.S = AndroidUtilities.dp(8.0f);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
        }
        boolean z12 = this.K;
        if (z12 || (this.R == i10 && this.S == f7)) {
            if (z12) {
                float f10 = this.S;
                int i13 = this.R;
                this.T = i13;
                e(f10, i13);
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = vc0Var.h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        vc0Var.h = ofFloat;
        ofFloat.addUpdateListener(new ek(this, i10, f7, 1));
        vc0Var.h.setDuration(250L);
        vc0Var.h.setInterpolator(ji.n.V);
        vc0Var.h.addListener(new t8(this, 29));
        AndroidUtilities.runOnUIThread(vc0Var.y, 50L);
        this.T = i10;
        e(f7, i10);
    }

    public final void j() {
        MessageObject messageObject;
        vc0 vc0Var = this.c0;
        MessagePreviewParams messagePreviewParams = vc0Var.d;
        if (this.a == 0) {
            hc0 hc0Var = this.e;
            if (hc0Var.v - hc0Var.u > MessagesController.getInstance(vc0Var.w).quoteLengthMax) {
                return;
            }
            org.telegram.ui.Cells.w9 w9Var = hc0Var.W;
            MessageObject c10 = c(w9Var != null ? ((org.telegram.ui.Cells.u1) w9Var).getMessageObject() : null);
            if (messagePreviewParams.quote != null && hc0Var.x()) {
                messagePreviewParams.quoteStart = hc0Var.u;
                messagePreviewParams.quoteEnd = hc0Var.v;
                if (c10 != null && ((messageObject = messagePreviewParams.quote.a) == null || messageObject.getId() != c10.getId())) {
                    messagePreviewParams.quote = org.telegram.ui.pn.b(messagePreviewParams.quoteStart, messagePreviewParams.quoteEnd, c10);
                    vc0Var.b();
                }
            }
            hc0Var.f(false);
        }
    }

    public final void k(boolean z10) {
        vc0 vc0Var = this.c0;
        TLRPC.User user = vc0Var.n;
        MessagePreviewParams messagePreviewParams = vc0Var.d;
        TLRPC.Chat chat = vc0Var.r;
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
            AndroidUtilities.forEachViews((RecyclerView) this.f, (Utilities.Callback<View>) new a3(this, 8));
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
        vc0 vc0Var = this.c0;
        vc0Var.v = z10;
        this.W = 0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(i10, makeMeasureSpec);
        int i12 = this.W;
        int measuredHeight = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
        Rect rect = this.Q;
        this.W = Math.max(i12, measuredHeight + rect.top + rect.bottom);
        ((ViewGroup.MarginLayoutParams) this.f.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        boolean z11 = vc0Var.v;
        org.telegram.ui.v8 v8Var = this.b;
        if (z11) {
            v8Var.getLayoutParams().height = -1;
            ((ViewGroup.MarginLayoutParams) v8Var.getLayoutParams()).topMargin = AndroidUtilities.dp(8.0f);
            ((ViewGroup.MarginLayoutParams) v8Var.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
            v8Var.getLayoutParams().width = (int) Math.min(View.MeasureSpec.getSize(i10), Math.max(AndroidUtilities.dp(340.0f), View.MeasureSpec.getSize(i10) * 0.6f));
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = -1;
        } else {
            ((ViewGroup.MarginLayoutParams) v8Var.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) v8Var.getLayoutParams()).bottomMargin = 0;
            v8Var.getLayoutParams().height = (View.MeasureSpec.getSize(i11) - AndroidUtilities.dp(6.0f)) - this.W;
            if (v8Var.getLayoutParams().height < View.MeasureSpec.getSize(i11) * 0.5f) {
                v8Var.getLayoutParams().height = (int) (View.MeasureSpec.getSize(i11) * 0.5f);
            }
            v8Var.getLayoutParams().width = -1;
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = View.MeasureSpec.getSize(i11) - v8Var.getLayoutParams().height;
        }
        int size = (View.MeasureSpec.getSize(i11) + View.MeasureSpec.getSize(i10)) << 16;
        if (this.a0 != size) {
            for (int i13 = 0; i13 < this.r.previewMessages.size(); i13++) {
                MessageObject messageObject = this.r.previewMessages.get(i13);
                messageObject.parentWidth = vc0Var.v ? v8Var.getLayoutParams().width : View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(16.0f);
                messageObject.resetLayout();
                messageObject.forceUpdate = true;
                oc0 oc0Var = this.n;
                if (oc0Var != null) {
                    oc0Var.l();
                }
            }
            this.K = true;
        }
        this.a0 = size;
        super.onMeasure(i10, i11);
    }
}
