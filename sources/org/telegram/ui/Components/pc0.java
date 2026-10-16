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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
    public final org.telegram.ui.z8 b;
    public boolean b0;
    public final ah.v c;
    public final /* synthetic */ vc0 c0;
    public final org.telegram.ui.Cells.aa d;
    public final gc0 e;
    public final hc0 f;
    public final jc0 h;
    public final oc0 n;
    public MessagePreviewParams.Messages r;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout s;
    public final fc0 v;
    public final fc0 w;
    public final org.telegram.ui.ActionBar.e1 x;
    public final org.telegram.ui.ActionBar.e1 y;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [android.graphics.drawable.Drawable, boolean[]] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r13v9, types: [android.view.View, org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout] */
    /* JADX WARN: Type inference failed for: r2v61, types: [android.view.View, org.telegram.ui.ActionBar.e1] */
    /* JADX WARN: Type inference failed for: r2v62, types: [android.view.View, org.telegram.ui.ActionBar.e1] */
    /* JADX WARN: Type inference failed for: r2v68, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r2v69, types: [android.view.View, org.telegram.ui.ActionBar.e1] */
    /* JADX WARN: Type inference failed for: r2v70, types: [android.view.View, org.telegram.ui.ActionBar.e1] */
    /* JADX WARN: Type inference failed for: r33v0, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout, java.lang.Object, org.telegram.ui.Components.pc0] */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.view.View, android.view.ViewGroup, org.telegram.ui.Components.ow0, org.telegram.ui.z8] */
    /* JADX WARN: Type inference failed for: r3v6, types: [bh.b] */
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
        setOnTouchListener(new tk(this, 5));
        ?? z8Var = new org.telegram.ui.z8(this, context3, i11);
        this.b = z8Var;
        rc0 rc0Var = vc0Var.F;
        boolean z12 = vc0Var.b;
        MessagePreviewParams messagePreviewParams3 = vc0Var.d;
        Drawable d = ((org.telegram.ui.co) rc0Var).d();
        if (((org.telegram.ui.co) rc0Var).f == null) {
            int i13 = org.telegram.ui.ActionBar.g6.a;
        }
        z8Var.V(d);
        z8Var.setOccupyStatusBar(false);
        int i14 = 3;
        z8Var.setOutlineProvider(new dh.b(this, i14));
        z8Var.setClipToOutline(true);
        z8Var.setElevation(AndroidUtilities.dp(4.0f));
        ah.v vVar = new ah.v(context3, 13, rc0Var);
        this.c = vVar;
        vVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.s8, rc0Var));
        gc0 gc0Var = new gc0(this);
        this.e = gc0Var;
        gc0Var.D = new bi.i3(this, i14);
        hc0 hc0Var = new hc0(this, context3, rc0Var);
        this.f = hc0Var;
        jc0 jc0Var = new jc0(this, hc0Var, rc0Var);
        this.h = jc0Var;
        hc0Var.setItemAnimator(jc0Var);
        hc0Var.setOnScrollListener(new kc0(this, i12));
        hc0Var.setOnItemClickListener(new lc0(this));
        oc0 oc0Var = new oc0(this);
        this.n = oc0Var;
        hc0Var.setAdapter(oc0Var);
        hc0Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        cc0 cc0Var = new cc0(this);
        cc0Var.O = new dc0(this);
        hc0Var.setClipToPadding(false);
        hc0Var.setLayoutManager(cc0Var);
        hc0Var.i(new ec0());
        z8Var.addView(hc0Var);
        addView(z8Var, w7.z5.a(400.0f, 8.0f, 0.0f, 8.0f, 0.0f, -1, 0));
        z8Var.addView(vVar, w7.z5.d(-2.0f, -1));
        ?? actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert2, 1, getContext(), rc0Var);
        this.s = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().setOnForegroundOpenFinished(new ac0(this, i11));
        dh.d c10 = vc0Var.G.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, false);
        c10.o(fh.b.k(rc0Var));
        c10.p(AndroidUtilities.dp(8.0f));
        c10.j.e = true;
        c10.q(AndroidUtilities.dp(12.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c10);
        addView(actionBarPopupWindow$ActionBarPopupWindowLayout, w7.z5.d(-2.0f, -2));
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
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(uc0Var2, w7.z5.n(-1, 48));
                        FrameLayout frameLayout = new FrameLayout(context);
                        pc0Var3.F = frameLayout;
                        frameLayout.setBackground(org.telegram.ui.ActionBar.g6.Z(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.I5, rc0Var), 0, 0));
                        uc0 uc0Var3 = new uc0(context, R.raw.media_shrink, LocaleController.getString(R.string.LinkMediaLarger), R.raw.media_enlarge, LocaleController.getString(R.string.LinkMediaSmaller), vc0Var.F);
                        pc0Var3.G = uc0Var3;
                        uc0Var3.setBackground(null);
                        uc0Var3.setVisibility(messagePreviewParams.isVideo ? 4 : 0);
                        frameLayout.addView(uc0Var3, w7.z5.n(-1, 48));
                        uc0 uc0Var4 = new uc0(context, R.raw.media_shrink, LocaleController.getString(R.string.LinkVideoLarger), R.raw.media_enlarge, LocaleController.getString(R.string.LinkVideoSmaller), vc0Var.F);
                        pc0Var3.H = uc0Var4;
                        uc0Var4.setBackground(null);
                        uc0Var4.setVisibility(!messagePreviewParams.isVideo ? 4 : 0);
                        frameLayout.setAlpha(messagePreviewParams.hasMedia ? 1.0f : 0.5f);
                        frameLayout.addView(uc0Var4, w7.z5.n(-1, 48));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, w7.z5.n(-1, 48));
                        frameLayout.setVisibility((!messagePreviewParams.singleLink || messagePreviewParams.hasMedia) ? 0 : 8);
                        uc0Var3.a(messagePreviewParams.webpageSmall, false);
                        uc0Var4.a(messagePreviewParams.webpageSmall, false);
                        org.telegram.ui.ActionBar.j1 j1Var = new org.telegram.ui.ActionBar.j1(context, rc0Var);
                        j1Var.setColor(org.telegram.ui.ActionBar.g6.m1(0.06f, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.E8, rc0Var)));
                        j1Var.setTag(R.id.fit_width_tag, 1);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(j1Var, w7.z5.n(-1, 8));
                        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(1, context, vc0Var.F, false, false);
                        e1Var.g(LocaleController.getString(R.string.ApplyChanges), R.drawable.msg_select, null);
                        final int i15 = 10;
                        e1Var.setOnClickListener(new View.OnClickListener(pc0Var3) { // from class: org.telegram.ui.Components.yb0
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
                                        gc0 gc0Var2 = pc0Var5.e;
                                        vc0 vc0Var2 = pc0Var5.c0;
                                        if (pc0Var5.c(null) != null) {
                                            if (gc0Var2.v - gc0Var2.u <= MessagesController.getInstance(vc0Var2.w).quoteLengthMax) {
                                                org.telegram.ui.Cells.w9 w9Var = gc0Var2.W;
                                                MessageObject c11 = pc0Var5.c(w9Var != null ? ((org.telegram.ui.Cells.u1) w9Var).getMessageObject() : null);
                                                MessagePreviewParams messagePreviewParams4 = vc0Var2.d;
                                                int i17 = gc0Var2.u;
                                                messagePreviewParams4.quoteStart = i17;
                                                int i18 = gc0Var2.v;
                                                messagePreviewParams4.quoteEnd = i18;
                                                messagePreviewParams4.quote = org.telegram.ui.un.b(i17, i18, c11);
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
                                        gc0 gc0Var3 = pc0Var6.e;
                                        vc0 vc0Var3 = pc0Var6.c0;
                                        MessagePreviewParams messagePreviewParams5 = vc0Var3.d;
                                        int i19 = vc0Var3.w;
                                        boolean z13 = vc0Var3.b;
                                        if (messagePreviewParams5.quote != null && !z13) {
                                            messagePreviewParams5.quote = null;
                                            gc0Var3.f(false);
                                            pc0Var6.g(false, true);
                                            pc0Var6.k(true);
                                            break;
                                        } else if (gc0Var3.v - gc0Var3.u <= MessagesController.getInstance(i19).quoteLengthMax) {
                                            MessageObject c12 = pc0Var6.c(null);
                                            if (c12 != null) {
                                                if (!gc0Var3.x()) {
                                                    messagePreviewParams5.quoteStart = 0;
                                                    int min = Math.min(MessagesController.getInstance(i19).quoteLengthMax, c12.messageOwner.message.length());
                                                    messagePreviewParams5.quoteEnd = min;
                                                    messagePreviewParams5.quote = org.telegram.ui.un.b(messagePreviewParams5.quoteStart, min, c12);
                                                    View d10 = pc0Var6.d();
                                                    if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                        gc0Var3.Z((org.telegram.ui.Cells.u1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                    }
                                                    if (!z13) {
                                                        pc0Var6.s.getSwipeBack().e(pc0Var6.I);
                                                    }
                                                    pc0Var6.g(true, true);
                                                    break;
                                                } else {
                                                    messagePreviewParams5.quoteStart = gc0Var3.u;
                                                    messagePreviewParams5.quoteEnd = gc0Var3.v;
                                                    org.telegram.ui.Cells.w9 w9Var2 = gc0Var3.W;
                                                    messagePreviewParams5.quote = org.telegram.ui.un.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, pc0Var6.c(w9Var2 != null ? ((org.telegram.ui.Cells.u1) w9Var2).getMessageObject() : null));
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
                                            org.telegram.ui.nl nlVar = (org.telegram.ui.nl) vc0Var4;
                                            nlVar.a(true);
                                            org.telegram.ui.fo foVar = nlVar.H;
                                            foVar.n5 = null;
                                            foVar.l5 = null;
                                            foVar.f5.updateReply(null, null, foVar.T5, null);
                                            foVar.m8();
                                            break;
                                        } else {
                                            org.telegram.ui.nl nlVar2 = (org.telegram.ui.nl) vc0Var4;
                                            nlVar2.a(true);
                                            org.telegram.ui.fo foVar2 = nlVar2.H;
                                            foVar2.l5 = null;
                                            foVar2.Fb(foVar2.n5);
                                            break;
                                        }
                                    case 7:
                                        this.b.c0.c(true);
                                        break;
                                    case 8:
                                        this.b.c0.a(true);
                                        break;
                                    case 9:
                                        org.telegram.ui.nl nlVar3 = (org.telegram.ui.nl) this.b.c0;
                                        nlVar3.a(true);
                                        org.telegram.ui.fo foVar3 = nlVar3.H;
                                        foVar3.f5.updateForward(null, foVar3.T5);
                                        foVar3.m8();
                                        break;
                                    case 10:
                                        this.b.c0.a(true);
                                        break;
                                    case 11:
                                        org.telegram.ui.nl nlVar4 = (org.telegram.ui.nl) this.b.c0;
                                        nlVar4.a(true);
                                        org.telegram.ui.fo foVar4 = nlVar4.H;
                                        foVar4.G5 = null;
                                        org.telegram.ui.sk skVar = foVar4.Y;
                                        if (skVar != null) {
                                            skVar.X2 = null;
                                            skVar.Y2 = false;
                                        }
                                        MessagePreviewParams messagePreviewParams6 = foVar4.f5;
                                        if (messagePreviewParams6 != null) {
                                            i16 = ((org.telegram.ui.ActionBar.m2) foVar4).currentAccount;
                                            MessageObject messageObject = foVar4.n5;
                                            messagePreviewParams6.updateLink(i16, null, null, messageObject == foVar4.X3 ? null : messageObject, foVar4.l5, foVar4.p5);
                                        }
                                        foVar4.m8();
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
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var, w7.z5.n(-1, 48));
                        org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(1, context, vc0Var.F, false, true);
                        context2 = context;
                        e1Var2.g(LocaleController.getString(R.string.DoNotLinkPreview), R.drawable.msg_delete, null);
                        int w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.q7, rc0Var);
                        int i16 = org.telegram.ui.ActionBar.g6.p7;
                        e1Var2.c(w02, org.telegram.ui.ActionBar.g6.w0(i16, rc0Var));
                        final int i17 = 11;
                        e1Var2.setOnClickListener(new View.OnClickListener(pc0Var3) { // from class: org.telegram.ui.Components.yb0
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
                                        gc0 gc0Var2 = pc0Var5.e;
                                        vc0 vc0Var2 = pc0Var5.c0;
                                        if (pc0Var5.c(null) != null) {
                                            if (gc0Var2.v - gc0Var2.u <= MessagesController.getInstance(vc0Var2.w).quoteLengthMax) {
                                                org.telegram.ui.Cells.w9 w9Var = gc0Var2.W;
                                                MessageObject c11 = pc0Var5.c(w9Var != null ? ((org.telegram.ui.Cells.u1) w9Var).getMessageObject() : null);
                                                MessagePreviewParams messagePreviewParams4 = vc0Var2.d;
                                                int i172 = gc0Var2.u;
                                                messagePreviewParams4.quoteStart = i172;
                                                int i18 = gc0Var2.v;
                                                messagePreviewParams4.quoteEnd = i18;
                                                messagePreviewParams4.quote = org.telegram.ui.un.b(i172, i18, c11);
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
                                        gc0 gc0Var3 = pc0Var6.e;
                                        vc0 vc0Var3 = pc0Var6.c0;
                                        MessagePreviewParams messagePreviewParams5 = vc0Var3.d;
                                        int i19 = vc0Var3.w;
                                        boolean z13 = vc0Var3.b;
                                        if (messagePreviewParams5.quote != null && !z13) {
                                            messagePreviewParams5.quote = null;
                                            gc0Var3.f(false);
                                            pc0Var6.g(false, true);
                                            pc0Var6.k(true);
                                            break;
                                        } else if (gc0Var3.v - gc0Var3.u <= MessagesController.getInstance(i19).quoteLengthMax) {
                                            MessageObject c12 = pc0Var6.c(null);
                                            if (c12 != null) {
                                                if (!gc0Var3.x()) {
                                                    messagePreviewParams5.quoteStart = 0;
                                                    int min = Math.min(MessagesController.getInstance(i19).quoteLengthMax, c12.messageOwner.message.length());
                                                    messagePreviewParams5.quoteEnd = min;
                                                    messagePreviewParams5.quote = org.telegram.ui.un.b(messagePreviewParams5.quoteStart, min, c12);
                                                    View d10 = pc0Var6.d();
                                                    if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                        gc0Var3.Z((org.telegram.ui.Cells.u1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                    }
                                                    if (!z13) {
                                                        pc0Var6.s.getSwipeBack().e(pc0Var6.I);
                                                    }
                                                    pc0Var6.g(true, true);
                                                    break;
                                                } else {
                                                    messagePreviewParams5.quoteStart = gc0Var3.u;
                                                    messagePreviewParams5.quoteEnd = gc0Var3.v;
                                                    org.telegram.ui.Cells.w9 w9Var2 = gc0Var3.W;
                                                    messagePreviewParams5.quote = org.telegram.ui.un.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, pc0Var6.c(w9Var2 != null ? ((org.telegram.ui.Cells.u1) w9Var2).getMessageObject() : null));
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
                                            org.telegram.ui.nl nlVar = (org.telegram.ui.nl) vc0Var4;
                                            nlVar.a(true);
                                            org.telegram.ui.fo foVar = nlVar.H;
                                            foVar.n5 = null;
                                            foVar.l5 = null;
                                            foVar.f5.updateReply(null, null, foVar.T5, null);
                                            foVar.m8();
                                            break;
                                        } else {
                                            org.telegram.ui.nl nlVar2 = (org.telegram.ui.nl) vc0Var4;
                                            nlVar2.a(true);
                                            org.telegram.ui.fo foVar2 = nlVar2.H;
                                            foVar2.l5 = null;
                                            foVar2.Fb(foVar2.n5);
                                            break;
                                        }
                                    case 7:
                                        this.b.c0.c(true);
                                        break;
                                    case 8:
                                        this.b.c0.a(true);
                                        break;
                                    case 9:
                                        org.telegram.ui.nl nlVar3 = (org.telegram.ui.nl) this.b.c0;
                                        nlVar3.a(true);
                                        org.telegram.ui.fo foVar3 = nlVar3.H;
                                        foVar3.f5.updateForward(null, foVar3.T5);
                                        foVar3.m8();
                                        break;
                                    case 10:
                                        this.b.c0.a(true);
                                        break;
                                    case 11:
                                        org.telegram.ui.nl nlVar4 = (org.telegram.ui.nl) this.b.c0;
                                        nlVar4.a(true);
                                        org.telegram.ui.fo foVar4 = nlVar4.H;
                                        foVar4.G5 = null;
                                        org.telegram.ui.sk skVar = foVar4.Y;
                                        if (skVar != null) {
                                            skVar.X2 = null;
                                            skVar.Y2 = false;
                                        }
                                        MessagePreviewParams messagePreviewParams6 = foVar4.f5;
                                        if (messagePreviewParams6 != null) {
                                            i162 = ((org.telegram.ui.ActionBar.m2) foVar4).currentAccount;
                                            MessageObject messageObject = foVar4.n5;
                                            messagePreviewParams6.updateLink(i162, null, null, messageObject == foVar4.X3 ? null : messageObject, foVar4.l5, foVar4.p5);
                                        }
                                        foVar4.m8();
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
                        e1Var2.setSelectorColor(org.telegram.ui.ActionBar.g6.m1(0.12f, org.telegram.ui.ActionBar.g6.x0(null, i16, false)));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var2, w7.z5.n(-1, 48));
                        final int i18 = 12;
                        frameLayout.setOnClickListener(new View.OnClickListener(pc0Var3) { // from class: org.telegram.ui.Components.yb0
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
                                        gc0 gc0Var2 = pc0Var5.e;
                                        vc0 vc0Var2 = pc0Var5.c0;
                                        if (pc0Var5.c(null) != null) {
                                            if (gc0Var2.v - gc0Var2.u <= MessagesController.getInstance(vc0Var2.w).quoteLengthMax) {
                                                org.telegram.ui.Cells.w9 w9Var = gc0Var2.W;
                                                MessageObject c11 = pc0Var5.c(w9Var != null ? ((org.telegram.ui.Cells.u1) w9Var).getMessageObject() : null);
                                                MessagePreviewParams messagePreviewParams4 = vc0Var2.d;
                                                int i172 = gc0Var2.u;
                                                messagePreviewParams4.quoteStart = i172;
                                                int i182 = gc0Var2.v;
                                                messagePreviewParams4.quoteEnd = i182;
                                                messagePreviewParams4.quote = org.telegram.ui.un.b(i172, i182, c11);
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
                                        gc0 gc0Var3 = pc0Var6.e;
                                        vc0 vc0Var3 = pc0Var6.c0;
                                        MessagePreviewParams messagePreviewParams5 = vc0Var3.d;
                                        int i19 = vc0Var3.w;
                                        boolean z13 = vc0Var3.b;
                                        if (messagePreviewParams5.quote != null && !z13) {
                                            messagePreviewParams5.quote = null;
                                            gc0Var3.f(false);
                                            pc0Var6.g(false, true);
                                            pc0Var6.k(true);
                                            break;
                                        } else if (gc0Var3.v - gc0Var3.u <= MessagesController.getInstance(i19).quoteLengthMax) {
                                            MessageObject c12 = pc0Var6.c(null);
                                            if (c12 != null) {
                                                if (!gc0Var3.x()) {
                                                    messagePreviewParams5.quoteStart = 0;
                                                    int min = Math.min(MessagesController.getInstance(i19).quoteLengthMax, c12.messageOwner.message.length());
                                                    messagePreviewParams5.quoteEnd = min;
                                                    messagePreviewParams5.quote = org.telegram.ui.un.b(messagePreviewParams5.quoteStart, min, c12);
                                                    View d10 = pc0Var6.d();
                                                    if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                        gc0Var3.Z((org.telegram.ui.Cells.u1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                    }
                                                    if (!z13) {
                                                        pc0Var6.s.getSwipeBack().e(pc0Var6.I);
                                                    }
                                                    pc0Var6.g(true, true);
                                                    break;
                                                } else {
                                                    messagePreviewParams5.quoteStart = gc0Var3.u;
                                                    messagePreviewParams5.quoteEnd = gc0Var3.v;
                                                    org.telegram.ui.Cells.w9 w9Var2 = gc0Var3.W;
                                                    messagePreviewParams5.quote = org.telegram.ui.un.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, pc0Var6.c(w9Var2 != null ? ((org.telegram.ui.Cells.u1) w9Var2).getMessageObject() : null));
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
                                            org.telegram.ui.nl nlVar = (org.telegram.ui.nl) vc0Var4;
                                            nlVar.a(true);
                                            org.telegram.ui.fo foVar = nlVar.H;
                                            foVar.n5 = null;
                                            foVar.l5 = null;
                                            foVar.f5.updateReply(null, null, foVar.T5, null);
                                            foVar.m8();
                                            break;
                                        } else {
                                            org.telegram.ui.nl nlVar2 = (org.telegram.ui.nl) vc0Var4;
                                            nlVar2.a(true);
                                            org.telegram.ui.fo foVar2 = nlVar2.H;
                                            foVar2.l5 = null;
                                            foVar2.Fb(foVar2.n5);
                                            break;
                                        }
                                    case 7:
                                        this.b.c0.c(true);
                                        break;
                                    case 8:
                                        this.b.c0.a(true);
                                        break;
                                    case 9:
                                        org.telegram.ui.nl nlVar3 = (org.telegram.ui.nl) this.b.c0;
                                        nlVar3.a(true);
                                        org.telegram.ui.fo foVar3 = nlVar3.H;
                                        foVar3.f5.updateForward(null, foVar3.T5);
                                        foVar3.m8();
                                        break;
                                    case 10:
                                        this.b.c0.a(true);
                                        break;
                                    case 11:
                                        org.telegram.ui.nl nlVar4 = (org.telegram.ui.nl) this.b.c0;
                                        nlVar4.a(true);
                                        org.telegram.ui.fo foVar4 = nlVar4.H;
                                        foVar4.G5 = null;
                                        org.telegram.ui.sk skVar = foVar4.Y;
                                        if (skVar != null) {
                                            skVar.X2 = null;
                                            skVar.Y2 = false;
                                        }
                                        MessagePreviewParams messagePreviewParams6 = foVar4.f5;
                                        if (messagePreviewParams6 != null) {
                                            i162 = ((org.telegram.ui.ActionBar.m2) foVar4).currentAccount;
                                            MessageObject messageObject = foVar4.n5;
                                            messagePreviewParams6.updateLink(i162, null, null, messageObject == foVar4.X3 ? null : messageObject, foVar4.l5, foVar4.p5);
                                        }
                                        foVar4.m8();
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
                        uc0Var2.setOnClickListener(new View.OnClickListener(pc0Var3) { // from class: org.telegram.ui.Components.yb0
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
                                        gc0 gc0Var2 = pc0Var5.e;
                                        vc0 vc0Var2 = pc0Var5.c0;
                                        if (pc0Var5.c(null) != null) {
                                            if (gc0Var2.v - gc0Var2.u <= MessagesController.getInstance(vc0Var2.w).quoteLengthMax) {
                                                org.telegram.ui.Cells.w9 w9Var = gc0Var2.W;
                                                MessageObject c11 = pc0Var5.c(w9Var != null ? ((org.telegram.ui.Cells.u1) w9Var).getMessageObject() : null);
                                                MessagePreviewParams messagePreviewParams4 = vc0Var2.d;
                                                int i172 = gc0Var2.u;
                                                messagePreviewParams4.quoteStart = i172;
                                                int i182 = gc0Var2.v;
                                                messagePreviewParams4.quoteEnd = i182;
                                                messagePreviewParams4.quote = org.telegram.ui.un.b(i172, i182, c11);
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
                                        gc0 gc0Var3 = pc0Var6.e;
                                        vc0 vc0Var3 = pc0Var6.c0;
                                        MessagePreviewParams messagePreviewParams5 = vc0Var3.d;
                                        int i192 = vc0Var3.w;
                                        boolean z13 = vc0Var3.b;
                                        if (messagePreviewParams5.quote != null && !z13) {
                                            messagePreviewParams5.quote = null;
                                            gc0Var3.f(false);
                                            pc0Var6.g(false, true);
                                            pc0Var6.k(true);
                                            break;
                                        } else if (gc0Var3.v - gc0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                            MessageObject c12 = pc0Var6.c(null);
                                            if (c12 != null) {
                                                if (!gc0Var3.x()) {
                                                    messagePreviewParams5.quoteStart = 0;
                                                    int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                                    messagePreviewParams5.quoteEnd = min;
                                                    messagePreviewParams5.quote = org.telegram.ui.un.b(messagePreviewParams5.quoteStart, min, c12);
                                                    View d10 = pc0Var6.d();
                                                    if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                        gc0Var3.Z((org.telegram.ui.Cells.u1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                    }
                                                    if (!z13) {
                                                        pc0Var6.s.getSwipeBack().e(pc0Var6.I);
                                                    }
                                                    pc0Var6.g(true, true);
                                                    break;
                                                } else {
                                                    messagePreviewParams5.quoteStart = gc0Var3.u;
                                                    messagePreviewParams5.quoteEnd = gc0Var3.v;
                                                    org.telegram.ui.Cells.w9 w9Var2 = gc0Var3.W;
                                                    messagePreviewParams5.quote = org.telegram.ui.un.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, pc0Var6.c(w9Var2 != null ? ((org.telegram.ui.Cells.u1) w9Var2).getMessageObject() : null));
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
                                            org.telegram.ui.nl nlVar = (org.telegram.ui.nl) vc0Var4;
                                            nlVar.a(true);
                                            org.telegram.ui.fo foVar = nlVar.H;
                                            foVar.n5 = null;
                                            foVar.l5 = null;
                                            foVar.f5.updateReply(null, null, foVar.T5, null);
                                            foVar.m8();
                                            break;
                                        } else {
                                            org.telegram.ui.nl nlVar2 = (org.telegram.ui.nl) vc0Var4;
                                            nlVar2.a(true);
                                            org.telegram.ui.fo foVar2 = nlVar2.H;
                                            foVar2.l5 = null;
                                            foVar2.Fb(foVar2.n5);
                                            break;
                                        }
                                    case 7:
                                        this.b.c0.c(true);
                                        break;
                                    case 8:
                                        this.b.c0.a(true);
                                        break;
                                    case 9:
                                        org.telegram.ui.nl nlVar3 = (org.telegram.ui.nl) this.b.c0;
                                        nlVar3.a(true);
                                        org.telegram.ui.fo foVar3 = nlVar3.H;
                                        foVar3.f5.updateForward(null, foVar3.T5);
                                        foVar3.m8();
                                        break;
                                    case 10:
                                        this.b.c0.a(true);
                                        break;
                                    case 11:
                                        org.telegram.ui.nl nlVar4 = (org.telegram.ui.nl) this.b.c0;
                                        nlVar4.a(true);
                                        org.telegram.ui.fo foVar4 = nlVar4.H;
                                        foVar4.G5 = null;
                                        org.telegram.ui.sk skVar = foVar4.Y;
                                        if (skVar != null) {
                                            skVar.X2 = null;
                                            skVar.Y2 = false;
                                        }
                                        MessagePreviewParams messagePreviewParams6 = foVar4.f5;
                                        if (messagePreviewParams6 != null) {
                                            i162 = ((org.telegram.ui.ActionBar.m2) foVar4).currentAccount;
                                            MessageObject messageObject = foVar4.n5;
                                            messagePreviewParams6.updateLink(i162, null, null, messageObject == foVar4.X3 ? null : messageObject, foVar4.l5, foVar4.p5);
                                        }
                                        foVar4.m8();
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
                this.s.a(uc0Var5, w7.z5.n(-1, 48));
                if (messagePreviewParams.hasCaption) {
                    uc0 uc0Var6 = new uc0(context, R.raw.caption_hide, LocaleController.getString(R.string.ShowCaption), R.raw.caption_show, LocaleController.getString(R.string.HideCaption), vc0Var.F);
                    uc0Var6.a(messagePreviewParams.hideCaption, false);
                    this.s.a(uc0Var6, w7.z5.n(-1, 48));
                    uc0Var = uc0Var6;
                } else {
                    uc0Var = null;
                }
                org.telegram.ui.ActionBar.e1 e1Var3 = new org.telegram.ui.ActionBar.e1(0, context, vc0Var.F, true, false);
                final int i21 = 7;
                e1Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.yb0
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
                                gc0 gc0Var2 = pc0Var5.e;
                                vc0 vc0Var2 = pc0Var5.c0;
                                if (pc0Var5.c(null) != null) {
                                    if (gc0Var2.v - gc0Var2.u <= MessagesController.getInstance(vc0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.w9 w9Var = gc0Var2.W;
                                        MessageObject c11 = pc0Var5.c(w9Var != null ? ((org.telegram.ui.Cells.u1) w9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams4 = vc0Var2.d;
                                        int i172 = gc0Var2.u;
                                        messagePreviewParams4.quoteStart = i172;
                                        int i182 = gc0Var2.v;
                                        messagePreviewParams4.quoteEnd = i182;
                                        messagePreviewParams4.quote = org.telegram.ui.un.b(i172, i182, c11);
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
                                gc0 gc0Var3 = pc0Var6.e;
                                vc0 vc0Var3 = pc0Var6.c0;
                                MessagePreviewParams messagePreviewParams5 = vc0Var3.d;
                                int i192 = vc0Var3.w;
                                boolean z13 = vc0Var3.b;
                                if (messagePreviewParams5.quote != null && !z13) {
                                    messagePreviewParams5.quote = null;
                                    gc0Var3.f(false);
                                    pc0Var6.g(false, true);
                                    pc0Var6.k(true);
                                    break;
                                } else if (gc0Var3.v - gc0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                    MessageObject c12 = pc0Var6.c(null);
                                    if (c12 != null) {
                                        if (!gc0Var3.x()) {
                                            messagePreviewParams5.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                            messagePreviewParams5.quoteEnd = min;
                                            messagePreviewParams5.quote = org.telegram.ui.un.b(messagePreviewParams5.quoteStart, min, c12);
                                            View d10 = pc0Var6.d();
                                            if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                gc0Var3.Z((org.telegram.ui.Cells.u1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            }
                                            if (!z13) {
                                                pc0Var6.s.getSwipeBack().e(pc0Var6.I);
                                            }
                                            pc0Var6.g(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams5.quoteStart = gc0Var3.u;
                                            messagePreviewParams5.quoteEnd = gc0Var3.v;
                                            org.telegram.ui.Cells.w9 w9Var2 = gc0Var3.W;
                                            messagePreviewParams5.quote = org.telegram.ui.un.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, pc0Var6.c(w9Var2 != null ? ((org.telegram.ui.Cells.u1) w9Var2).getMessageObject() : null));
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
                                    org.telegram.ui.nl nlVar = (org.telegram.ui.nl) vc0Var4;
                                    nlVar.a(true);
                                    org.telegram.ui.fo foVar = nlVar.H;
                                    foVar.n5 = null;
                                    foVar.l5 = null;
                                    foVar.f5.updateReply(null, null, foVar.T5, null);
                                    foVar.m8();
                                    break;
                                } else {
                                    org.telegram.ui.nl nlVar2 = (org.telegram.ui.nl) vc0Var4;
                                    nlVar2.a(true);
                                    org.telegram.ui.fo foVar2 = nlVar2.H;
                                    foVar2.l5 = null;
                                    foVar2.Fb(foVar2.n5);
                                    break;
                                }
                            case 7:
                                this.b.c0.c(true);
                                break;
                            case 8:
                                this.b.c0.a(true);
                                break;
                            case 9:
                                org.telegram.ui.nl nlVar3 = (org.telegram.ui.nl) this.b.c0;
                                nlVar3.a(true);
                                org.telegram.ui.fo foVar3 = nlVar3.H;
                                foVar3.f5.updateForward(null, foVar3.T5);
                                foVar3.m8();
                                break;
                            case 10:
                                this.b.c0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.nl nlVar4 = (org.telegram.ui.nl) this.b.c0;
                                nlVar4.a(true);
                                org.telegram.ui.fo foVar4 = nlVar4.H;
                                foVar4.G5 = null;
                                org.telegram.ui.sk skVar = foVar4.Y;
                                if (skVar != null) {
                                    skVar.X2 = null;
                                    skVar.Y2 = false;
                                }
                                MessagePreviewParams messagePreviewParams6 = foVar4.f5;
                                if (messagePreviewParams6 != null) {
                                    i162 = ((org.telegram.ui.ActionBar.m2) foVar4).currentAccount;
                                    MessageObject messageObject = foVar4.n5;
                                    messagePreviewParams6.updateLink(i162, null, null, messageObject == foVar4.X3 ? null : messageObject, foVar4.l5, foVar4.p5);
                                }
                                foVar4.m8();
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
                e1Var3.g(LocaleController.getString(R.string.ChangeRecipient), R.drawable.msg_forward_replace, null);
                this.s.a(e1Var3, w7.z5.n(-1, 48));
                org.telegram.ui.ActionBar.j1 j1Var2 = new org.telegram.ui.ActionBar.j1(context, rc0Var);
                j1Var2.setColor(org.telegram.ui.ActionBar.g6.m1(0.06f, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.E8, rc0Var)));
                j1Var2.setTag(R.id.fit_width_tag, 1);
                this.s.a(j1Var2, w7.z5.n(-1, 8));
                org.telegram.ui.ActionBar.e1 e1Var4 = new org.telegram.ui.ActionBar.e1(1, context, vc0Var.F, false, false);
                e1Var4.g(LocaleController.getString(R.string.ApplyChanges), R.drawable.msg_select, null);
                final int i22 = 8;
                e1Var4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.yb0
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
                                gc0 gc0Var2 = pc0Var5.e;
                                vc0 vc0Var2 = pc0Var5.c0;
                                if (pc0Var5.c(null) != null) {
                                    if (gc0Var2.v - gc0Var2.u <= MessagesController.getInstance(vc0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.w9 w9Var = gc0Var2.W;
                                        MessageObject c11 = pc0Var5.c(w9Var != null ? ((org.telegram.ui.Cells.u1) w9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams4 = vc0Var2.d;
                                        int i172 = gc0Var2.u;
                                        messagePreviewParams4.quoteStart = i172;
                                        int i182 = gc0Var2.v;
                                        messagePreviewParams4.quoteEnd = i182;
                                        messagePreviewParams4.quote = org.telegram.ui.un.b(i172, i182, c11);
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
                                gc0 gc0Var3 = pc0Var6.e;
                                vc0 vc0Var3 = pc0Var6.c0;
                                MessagePreviewParams messagePreviewParams5 = vc0Var3.d;
                                int i192 = vc0Var3.w;
                                boolean z13 = vc0Var3.b;
                                if (messagePreviewParams5.quote != null && !z13) {
                                    messagePreviewParams5.quote = null;
                                    gc0Var3.f(false);
                                    pc0Var6.g(false, true);
                                    pc0Var6.k(true);
                                    break;
                                } else if (gc0Var3.v - gc0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                    MessageObject c12 = pc0Var6.c(null);
                                    if (c12 != null) {
                                        if (!gc0Var3.x()) {
                                            messagePreviewParams5.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                            messagePreviewParams5.quoteEnd = min;
                                            messagePreviewParams5.quote = org.telegram.ui.un.b(messagePreviewParams5.quoteStart, min, c12);
                                            View d10 = pc0Var6.d();
                                            if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                gc0Var3.Z((org.telegram.ui.Cells.u1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            }
                                            if (!z13) {
                                                pc0Var6.s.getSwipeBack().e(pc0Var6.I);
                                            }
                                            pc0Var6.g(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams5.quoteStart = gc0Var3.u;
                                            messagePreviewParams5.quoteEnd = gc0Var3.v;
                                            org.telegram.ui.Cells.w9 w9Var2 = gc0Var3.W;
                                            messagePreviewParams5.quote = org.telegram.ui.un.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, pc0Var6.c(w9Var2 != null ? ((org.telegram.ui.Cells.u1) w9Var2).getMessageObject() : null));
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
                                    org.telegram.ui.nl nlVar = (org.telegram.ui.nl) vc0Var4;
                                    nlVar.a(true);
                                    org.telegram.ui.fo foVar = nlVar.H;
                                    foVar.n5 = null;
                                    foVar.l5 = null;
                                    foVar.f5.updateReply(null, null, foVar.T5, null);
                                    foVar.m8();
                                    break;
                                } else {
                                    org.telegram.ui.nl nlVar2 = (org.telegram.ui.nl) vc0Var4;
                                    nlVar2.a(true);
                                    org.telegram.ui.fo foVar2 = nlVar2.H;
                                    foVar2.l5 = null;
                                    foVar2.Fb(foVar2.n5);
                                    break;
                                }
                            case 7:
                                this.b.c0.c(true);
                                break;
                            case 8:
                                this.b.c0.a(true);
                                break;
                            case 9:
                                org.telegram.ui.nl nlVar3 = (org.telegram.ui.nl) this.b.c0;
                                nlVar3.a(true);
                                org.telegram.ui.fo foVar3 = nlVar3.H;
                                foVar3.f5.updateForward(null, foVar3.T5);
                                foVar3.m8();
                                break;
                            case 10:
                                this.b.c0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.nl nlVar4 = (org.telegram.ui.nl) this.b.c0;
                                nlVar4.a(true);
                                org.telegram.ui.fo foVar4 = nlVar4.H;
                                foVar4.G5 = null;
                                org.telegram.ui.sk skVar = foVar4.Y;
                                if (skVar != null) {
                                    skVar.X2 = null;
                                    skVar.Y2 = false;
                                }
                                MessagePreviewParams messagePreviewParams6 = foVar4.f5;
                                if (messagePreviewParams6 != null) {
                                    i162 = ((org.telegram.ui.ActionBar.m2) foVar4).currentAccount;
                                    MessageObject messageObject = foVar4.n5;
                                    messagePreviewParams6.updateLink(i162, null, null, messageObject == foVar4.X3 ? null : messageObject, foVar4.l5, foVar4.p5);
                                }
                                foVar4.m8();
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
                this.s.a(e1Var4, w7.z5.n(-1, 48));
                org.telegram.ui.ActionBar.e1 e1Var5 = new org.telegram.ui.ActionBar.e1(1, context, vc0Var.F, false, true);
                e1Var5.g(LocaleController.getString(R.string.DoNotForward), R.drawable.msg_delete, null);
                int w03 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.q7, rc0Var);
                int i23 = org.telegram.ui.ActionBar.g6.p7;
                e1Var5.c(w03, org.telegram.ui.ActionBar.g6.w0(i23, rc0Var));
                final int i24 = 9;
                e1Var5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.yb0
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
                                gc0 gc0Var2 = pc0Var5.e;
                                vc0 vc0Var2 = pc0Var5.c0;
                                if (pc0Var5.c(null) != null) {
                                    if (gc0Var2.v - gc0Var2.u <= MessagesController.getInstance(vc0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.w9 w9Var = gc0Var2.W;
                                        MessageObject c11 = pc0Var5.c(w9Var != null ? ((org.telegram.ui.Cells.u1) w9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams4 = vc0Var2.d;
                                        int i172 = gc0Var2.u;
                                        messagePreviewParams4.quoteStart = i172;
                                        int i182 = gc0Var2.v;
                                        messagePreviewParams4.quoteEnd = i182;
                                        messagePreviewParams4.quote = org.telegram.ui.un.b(i172, i182, c11);
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
                                gc0 gc0Var3 = pc0Var6.e;
                                vc0 vc0Var3 = pc0Var6.c0;
                                MessagePreviewParams messagePreviewParams5 = vc0Var3.d;
                                int i192 = vc0Var3.w;
                                boolean z13 = vc0Var3.b;
                                if (messagePreviewParams5.quote != null && !z13) {
                                    messagePreviewParams5.quote = null;
                                    gc0Var3.f(false);
                                    pc0Var6.g(false, true);
                                    pc0Var6.k(true);
                                    break;
                                } else if (gc0Var3.v - gc0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                    MessageObject c12 = pc0Var6.c(null);
                                    if (c12 != null) {
                                        if (!gc0Var3.x()) {
                                            messagePreviewParams5.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                            messagePreviewParams5.quoteEnd = min;
                                            messagePreviewParams5.quote = org.telegram.ui.un.b(messagePreviewParams5.quoteStart, min, c12);
                                            View d10 = pc0Var6.d();
                                            if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                gc0Var3.Z((org.telegram.ui.Cells.u1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            }
                                            if (!z13) {
                                                pc0Var6.s.getSwipeBack().e(pc0Var6.I);
                                            }
                                            pc0Var6.g(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams5.quoteStart = gc0Var3.u;
                                            messagePreviewParams5.quoteEnd = gc0Var3.v;
                                            org.telegram.ui.Cells.w9 w9Var2 = gc0Var3.W;
                                            messagePreviewParams5.quote = org.telegram.ui.un.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, pc0Var6.c(w9Var2 != null ? ((org.telegram.ui.Cells.u1) w9Var2).getMessageObject() : null));
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
                                    org.telegram.ui.nl nlVar = (org.telegram.ui.nl) vc0Var4;
                                    nlVar.a(true);
                                    org.telegram.ui.fo foVar = nlVar.H;
                                    foVar.n5 = null;
                                    foVar.l5 = null;
                                    foVar.f5.updateReply(null, null, foVar.T5, null);
                                    foVar.m8();
                                    break;
                                } else {
                                    org.telegram.ui.nl nlVar2 = (org.telegram.ui.nl) vc0Var4;
                                    nlVar2.a(true);
                                    org.telegram.ui.fo foVar2 = nlVar2.H;
                                    foVar2.l5 = null;
                                    foVar2.Fb(foVar2.n5);
                                    break;
                                }
                            case 7:
                                this.b.c0.c(true);
                                break;
                            case 8:
                                this.b.c0.a(true);
                                break;
                            case 9:
                                org.telegram.ui.nl nlVar3 = (org.telegram.ui.nl) this.b.c0;
                                nlVar3.a(true);
                                org.telegram.ui.fo foVar3 = nlVar3.H;
                                foVar3.f5.updateForward(null, foVar3.T5);
                                foVar3.m8();
                                break;
                            case 10:
                                this.b.c0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.nl nlVar4 = (org.telegram.ui.nl) this.b.c0;
                                nlVar4.a(true);
                                org.telegram.ui.fo foVar4 = nlVar4.H;
                                foVar4.G5 = null;
                                org.telegram.ui.sk skVar = foVar4.Y;
                                if (skVar != null) {
                                    skVar.X2 = null;
                                    skVar.Y2 = false;
                                }
                                MessagePreviewParams messagePreviewParams6 = foVar4.f5;
                                if (messagePreviewParams6 != null) {
                                    i162 = ((org.telegram.ui.ActionBar.m2) foVar4).currentAccount;
                                    MessageObject messageObject = foVar4.n5;
                                    messagePreviewParams6.updateLink(i162, null, null, messageObject == foVar4.X3 ? null : messageObject, foVar4.l5, foVar4.p5);
                                }
                                foVar4.m8();
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
                e1Var5.setSelectorColor(org.telegram.ui.ActionBar.g6.m1(0.12f, org.telegram.ui.ActionBar.g6.x0(null, i23, false)));
                this.s.a(e1Var5, w7.z5.n(-1, 48));
                uc0Var5.a(messagePreviewParams.hideForwardSendersName, false);
                uc0 uc0Var7 = uc0Var;
                pc0 pc0Var4 = this;
                uc0Var5.setOnClickListener(new bc0(this, z10, context, uc0Var7, uc0Var5, 0));
                pc0Var = pc0Var4;
                if (uc0Var7 != null) {
                    uc0Var7.setOnClickListener(new bi.x(pc0Var4, uc0Var7, uc0Var5, 24));
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
                LinearLayout e = org.telegram.messenger.sk.e(context3, 1);
                if (z12) {
                    drawable = null;
                    z11 = true;
                    linearLayout = e;
                } else {
                    ?? r92 = e;
                    drawable = null;
                    org.telegram.ui.ActionBar.e1 e1Var6 = new org.telegram.ui.ActionBar.e1(0, context3, vc0Var.F, true, false);
                    e1Var6.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                    e1Var6.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.yb0
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
                                    gc0 gc0Var2 = pc0Var5.e;
                                    vc0 vc0Var2 = pc0Var5.c0;
                                    if (pc0Var5.c(null) != null) {
                                        if (gc0Var2.v - gc0Var2.u <= MessagesController.getInstance(vc0Var2.w).quoteLengthMax) {
                                            org.telegram.ui.Cells.w9 w9Var = gc0Var2.W;
                                            MessageObject c11 = pc0Var5.c(w9Var != null ? ((org.telegram.ui.Cells.u1) w9Var).getMessageObject() : null);
                                            MessagePreviewParams messagePreviewParams4 = vc0Var2.d;
                                            int i172 = gc0Var2.u;
                                            messagePreviewParams4.quoteStart = i172;
                                            int i182 = gc0Var2.v;
                                            messagePreviewParams4.quoteEnd = i182;
                                            messagePreviewParams4.quote = org.telegram.ui.un.b(i172, i182, c11);
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
                                    gc0 gc0Var3 = pc0Var6.e;
                                    vc0 vc0Var3 = pc0Var6.c0;
                                    MessagePreviewParams messagePreviewParams5 = vc0Var3.d;
                                    int i192 = vc0Var3.w;
                                    boolean z13 = vc0Var3.b;
                                    if (messagePreviewParams5.quote != null && !z13) {
                                        messagePreviewParams5.quote = null;
                                        gc0Var3.f(false);
                                        pc0Var6.g(false, true);
                                        pc0Var6.k(true);
                                        break;
                                    } else if (gc0Var3.v - gc0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                        MessageObject c12 = pc0Var6.c(null);
                                        if (c12 != null) {
                                            if (!gc0Var3.x()) {
                                                messagePreviewParams5.quoteStart = 0;
                                                int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                                messagePreviewParams5.quoteEnd = min;
                                                messagePreviewParams5.quote = org.telegram.ui.un.b(messagePreviewParams5.quoteStart, min, c12);
                                                View d10 = pc0Var6.d();
                                                if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                    gc0Var3.Z((org.telegram.ui.Cells.u1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                }
                                                if (!z13) {
                                                    pc0Var6.s.getSwipeBack().e(pc0Var6.I);
                                                }
                                                pc0Var6.g(true, true);
                                                break;
                                            } else {
                                                messagePreviewParams5.quoteStart = gc0Var3.u;
                                                messagePreviewParams5.quoteEnd = gc0Var3.v;
                                                org.telegram.ui.Cells.w9 w9Var2 = gc0Var3.W;
                                                messagePreviewParams5.quote = org.telegram.ui.un.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, pc0Var6.c(w9Var2 != null ? ((org.telegram.ui.Cells.u1) w9Var2).getMessageObject() : null));
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
                                        org.telegram.ui.nl nlVar = (org.telegram.ui.nl) vc0Var4;
                                        nlVar.a(true);
                                        org.telegram.ui.fo foVar = nlVar.H;
                                        foVar.n5 = null;
                                        foVar.l5 = null;
                                        foVar.f5.updateReply(null, null, foVar.T5, null);
                                        foVar.m8();
                                        break;
                                    } else {
                                        org.telegram.ui.nl nlVar2 = (org.telegram.ui.nl) vc0Var4;
                                        nlVar2.a(true);
                                        org.telegram.ui.fo foVar2 = nlVar2.H;
                                        foVar2.l5 = null;
                                        foVar2.Fb(foVar2.n5);
                                        break;
                                    }
                                case 7:
                                    this.b.c0.c(true);
                                    break;
                                case 8:
                                    this.b.c0.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.nl nlVar3 = (org.telegram.ui.nl) this.b.c0;
                                    nlVar3.a(true);
                                    org.telegram.ui.fo foVar3 = nlVar3.H;
                                    foVar3.f5.updateForward(null, foVar3.T5);
                                    foVar3.m8();
                                    break;
                                case 10:
                                    this.b.c0.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.nl nlVar4 = (org.telegram.ui.nl) this.b.c0;
                                    nlVar4.a(true);
                                    org.telegram.ui.fo foVar4 = nlVar4.H;
                                    foVar4.G5 = null;
                                    org.telegram.ui.sk skVar = foVar4.Y;
                                    if (skVar != null) {
                                        skVar.X2 = null;
                                        skVar.Y2 = false;
                                    }
                                    MessagePreviewParams messagePreviewParams6 = foVar4.f5;
                                    if (messagePreviewParams6 != null) {
                                        i162 = ((org.telegram.ui.ActionBar.m2) foVar4).currentAccount;
                                        MessageObject messageObject = foVar4.n5;
                                        messagePreviewParams6.updateLink(i162, null, null, messageObject == foVar4.X3 ? null : messageObject, foVar4.l5, foVar4.p5);
                                    }
                                    foVar4.m8();
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
                    r92.addView(e1Var6, w7.z5.n(-1, 48));
                    org.telegram.ui.ActionBar.j1 j1Var3 = new org.telegram.ui.ActionBar.j1(context3, rc0Var);
                    j1Var3.setColor(org.telegram.ui.ActionBar.g6.m1(0.06f, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.E8, rc0Var)));
                    j1Var3.setTag(R.id.fit_width_tag, 1);
                    r92.addView(j1Var3, w7.z5.n(-1, 8));
                    org.telegram.ui.ActionBar.e1 e1Var7 = new org.telegram.ui.ActionBar.e1(0, context3, vc0Var.F, false, true);
                    e1Var7.g(LocaleController.getString(R.string.QuoteSelectedPart), R.drawable.menu_quote_specific, null);
                    z11 = true;
                    final boolean z13 = true ? 1 : 0;
                    e1Var7.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.yb0
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
                                    gc0 gc0Var2 = pc0Var5.e;
                                    vc0 vc0Var2 = pc0Var5.c0;
                                    if (pc0Var5.c(null) != null) {
                                        if (gc0Var2.v - gc0Var2.u <= MessagesController.getInstance(vc0Var2.w).quoteLengthMax) {
                                            org.telegram.ui.Cells.w9 w9Var = gc0Var2.W;
                                            MessageObject c11 = pc0Var5.c(w9Var != null ? ((org.telegram.ui.Cells.u1) w9Var).getMessageObject() : null);
                                            MessagePreviewParams messagePreviewParams4 = vc0Var2.d;
                                            int i172 = gc0Var2.u;
                                            messagePreviewParams4.quoteStart = i172;
                                            int i182 = gc0Var2.v;
                                            messagePreviewParams4.quoteEnd = i182;
                                            messagePreviewParams4.quote = org.telegram.ui.un.b(i172, i182, c11);
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
                                    gc0 gc0Var3 = pc0Var6.e;
                                    vc0 vc0Var3 = pc0Var6.c0;
                                    MessagePreviewParams messagePreviewParams5 = vc0Var3.d;
                                    int i192 = vc0Var3.w;
                                    boolean z132 = vc0Var3.b;
                                    if (messagePreviewParams5.quote != null && !z132) {
                                        messagePreviewParams5.quote = null;
                                        gc0Var3.f(false);
                                        pc0Var6.g(false, true);
                                        pc0Var6.k(true);
                                        break;
                                    } else if (gc0Var3.v - gc0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                        MessageObject c12 = pc0Var6.c(null);
                                        if (c12 != null) {
                                            if (!gc0Var3.x()) {
                                                messagePreviewParams5.quoteStart = 0;
                                                int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                                messagePreviewParams5.quoteEnd = min;
                                                messagePreviewParams5.quote = org.telegram.ui.un.b(messagePreviewParams5.quoteStart, min, c12);
                                                View d10 = pc0Var6.d();
                                                if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                    gc0Var3.Z((org.telegram.ui.Cells.u1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                }
                                                if (!z132) {
                                                    pc0Var6.s.getSwipeBack().e(pc0Var6.I);
                                                }
                                                pc0Var6.g(true, true);
                                                break;
                                            } else {
                                                messagePreviewParams5.quoteStart = gc0Var3.u;
                                                messagePreviewParams5.quoteEnd = gc0Var3.v;
                                                org.telegram.ui.Cells.w9 w9Var2 = gc0Var3.W;
                                                messagePreviewParams5.quote = org.telegram.ui.un.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, pc0Var6.c(w9Var2 != null ? ((org.telegram.ui.Cells.u1) w9Var2).getMessageObject() : null));
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
                                        org.telegram.ui.nl nlVar = (org.telegram.ui.nl) vc0Var4;
                                        nlVar.a(true);
                                        org.telegram.ui.fo foVar = nlVar.H;
                                        foVar.n5 = null;
                                        foVar.l5 = null;
                                        foVar.f5.updateReply(null, null, foVar.T5, null);
                                        foVar.m8();
                                        break;
                                    } else {
                                        org.telegram.ui.nl nlVar2 = (org.telegram.ui.nl) vc0Var4;
                                        nlVar2.a(true);
                                        org.telegram.ui.fo foVar2 = nlVar2.H;
                                        foVar2.l5 = null;
                                        foVar2.Fb(foVar2.n5);
                                        break;
                                    }
                                case 7:
                                    this.b.c0.c(true);
                                    break;
                                case 8:
                                    this.b.c0.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.nl nlVar3 = (org.telegram.ui.nl) this.b.c0;
                                    nlVar3.a(true);
                                    org.telegram.ui.fo foVar3 = nlVar3.H;
                                    foVar3.f5.updateForward(null, foVar3.T5);
                                    foVar3.m8();
                                    break;
                                case 10:
                                    this.b.c0.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.nl nlVar4 = (org.telegram.ui.nl) this.b.c0;
                                    nlVar4.a(true);
                                    org.telegram.ui.fo foVar4 = nlVar4.H;
                                    foVar4.G5 = null;
                                    org.telegram.ui.sk skVar = foVar4.Y;
                                    if (skVar != null) {
                                        skVar.X2 = null;
                                        skVar.Y2 = false;
                                    }
                                    MessagePreviewParams messagePreviewParams6 = foVar4.f5;
                                    if (messagePreviewParams6 != null) {
                                        i162 = ((org.telegram.ui.ActionBar.m2) foVar4).currentAccount;
                                        MessageObject messageObject = foVar4.n5;
                                        messagePreviewParams6.updateLink(i162, null, null, messageObject == foVar4.X3 ? null : messageObject, foVar4.l5, foVar4.p5);
                                    }
                                    foVar4.m8();
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
                    r92.addView(e1Var7, w7.z5.n(-1, 48));
                    linearLayout = r92;
                }
                this.I = actionBarPopupWindow$ActionBarPopupWindowLayout.b(linearLayout);
                actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().setStickToRight(z11);
                FrameLayout frameLayout2 = new FrameLayout(context3);
                messagePreviewParams2 = messagePreviewParams3;
                fc0 fc0Var = new fc0(1, 0, context, vc0Var.F, true, false);
                this.v = fc0Var;
                fc0Var.g(LocaleController.getString(z12 ? R.string.QuoteSelectedPart : R.string.SelectSpecificQuote), R.drawable.menu_select_quote, drawable);
                fc0 fc0Var2 = new fc0(1, 1, context, vc0Var.F, true, false);
                context3 = context;
                this.w = fc0Var2;
                fc0Var2.g(LocaleController.getString(R.string.ClearQuote), R.drawable.menu_quote_delete, drawable);
                frameLayout2.setBackground(org.telegram.ui.ActionBar.g6.Z(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.I5, rc0Var), 6, 0));
                final int i25 = 2;
                frameLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.yb0
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
                                gc0 gc0Var2 = pc0Var5.e;
                                vc0 vc0Var2 = pc0Var5.c0;
                                if (pc0Var5.c(null) != null) {
                                    if (gc0Var2.v - gc0Var2.u <= MessagesController.getInstance(vc0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.w9 w9Var = gc0Var2.W;
                                        MessageObject c11 = pc0Var5.c(w9Var != null ? ((org.telegram.ui.Cells.u1) w9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams4 = vc0Var2.d;
                                        int i172 = gc0Var2.u;
                                        messagePreviewParams4.quoteStart = i172;
                                        int i182 = gc0Var2.v;
                                        messagePreviewParams4.quoteEnd = i182;
                                        messagePreviewParams4.quote = org.telegram.ui.un.b(i172, i182, c11);
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
                                gc0 gc0Var3 = pc0Var6.e;
                                vc0 vc0Var3 = pc0Var6.c0;
                                MessagePreviewParams messagePreviewParams5 = vc0Var3.d;
                                int i192 = vc0Var3.w;
                                boolean z132 = vc0Var3.b;
                                if (messagePreviewParams5.quote != null && !z132) {
                                    messagePreviewParams5.quote = null;
                                    gc0Var3.f(false);
                                    pc0Var6.g(false, true);
                                    pc0Var6.k(true);
                                    break;
                                } else if (gc0Var3.v - gc0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                    MessageObject c12 = pc0Var6.c(null);
                                    if (c12 != null) {
                                        if (!gc0Var3.x()) {
                                            messagePreviewParams5.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                            messagePreviewParams5.quoteEnd = min;
                                            messagePreviewParams5.quote = org.telegram.ui.un.b(messagePreviewParams5.quoteStart, min, c12);
                                            View d10 = pc0Var6.d();
                                            if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                gc0Var3.Z((org.telegram.ui.Cells.u1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            }
                                            if (!z132) {
                                                pc0Var6.s.getSwipeBack().e(pc0Var6.I);
                                            }
                                            pc0Var6.g(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams5.quoteStart = gc0Var3.u;
                                            messagePreviewParams5.quoteEnd = gc0Var3.v;
                                            org.telegram.ui.Cells.w9 w9Var2 = gc0Var3.W;
                                            messagePreviewParams5.quote = org.telegram.ui.un.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, pc0Var6.c(w9Var2 != null ? ((org.telegram.ui.Cells.u1) w9Var2).getMessageObject() : null));
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
                                    org.telegram.ui.nl nlVar = (org.telegram.ui.nl) vc0Var4;
                                    nlVar.a(true);
                                    org.telegram.ui.fo foVar = nlVar.H;
                                    foVar.n5 = null;
                                    foVar.l5 = null;
                                    foVar.f5.updateReply(null, null, foVar.T5, null);
                                    foVar.m8();
                                    break;
                                } else {
                                    org.telegram.ui.nl nlVar2 = (org.telegram.ui.nl) vc0Var4;
                                    nlVar2.a(true);
                                    org.telegram.ui.fo foVar2 = nlVar2.H;
                                    foVar2.l5 = null;
                                    foVar2.Fb(foVar2.n5);
                                    break;
                                }
                            case 7:
                                this.b.c0.c(true);
                                break;
                            case 8:
                                this.b.c0.a(true);
                                break;
                            case 9:
                                org.telegram.ui.nl nlVar3 = (org.telegram.ui.nl) this.b.c0;
                                nlVar3.a(true);
                                org.telegram.ui.fo foVar3 = nlVar3.H;
                                foVar3.f5.updateForward(null, foVar3.T5);
                                foVar3.m8();
                                break;
                            case 10:
                                this.b.c0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.nl nlVar4 = (org.telegram.ui.nl) this.b.c0;
                                nlVar4.a(true);
                                org.telegram.ui.fo foVar4 = nlVar4.H;
                                foVar4.G5 = null;
                                org.telegram.ui.sk skVar = foVar4.Y;
                                if (skVar != null) {
                                    skVar.X2 = null;
                                    skVar.Y2 = false;
                                }
                                MessagePreviewParams messagePreviewParams6 = foVar4.f5;
                                if (messagePreviewParams6 != null) {
                                    i162 = ((org.telegram.ui.ActionBar.m2) foVar4).currentAccount;
                                    MessageObject messageObject = foVar4.n5;
                                    messagePreviewParams6.updateLink(i162, null, null, messageObject == foVar4.X3 ? null : messageObject, foVar4.l5, foVar4.p5);
                                }
                                foVar4.m8();
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
                frameLayout2.addView(fc0Var, w7.z5.d(48.0f, -1));
                frameLayout2.addView(fc0Var2, w7.z5.d(48.0f, -1));
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout2, w7.z5.n(-1, 48));
                r11 = drawable;
            }
            messagePreviewParams = messagePreviewParams2;
            if (!messagePreviewParams.monoforum && !messagePreviewParams.noforwards && !messagePreviewParams.hasSecretMessages) {
                ?? frameLayout3 = new FrameLayout(context3);
                ?? e1Var8 = new org.telegram.ui.ActionBar.e1(1, context3, vc0Var.F, false, false);
                this.x = e1Var8;
                e1Var8.g(LocaleController.getString(R.string.ReplyToAnotherChat), R.drawable.msg_forward_replace, r11);
                final int i26 = 3;
                e1Var8.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.yb0
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
                                gc0 gc0Var2 = pc0Var5.e;
                                vc0 vc0Var2 = pc0Var5.c0;
                                if (pc0Var5.c(null) != null) {
                                    if (gc0Var2.v - gc0Var2.u <= MessagesController.getInstance(vc0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.w9 w9Var = gc0Var2.W;
                                        MessageObject c11 = pc0Var5.c(w9Var != null ? ((org.telegram.ui.Cells.u1) w9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams4 = vc0Var2.d;
                                        int i172 = gc0Var2.u;
                                        messagePreviewParams4.quoteStart = i172;
                                        int i182 = gc0Var2.v;
                                        messagePreviewParams4.quoteEnd = i182;
                                        messagePreviewParams4.quote = org.telegram.ui.un.b(i172, i182, c11);
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
                                gc0 gc0Var3 = pc0Var6.e;
                                vc0 vc0Var3 = pc0Var6.c0;
                                MessagePreviewParams messagePreviewParams5 = vc0Var3.d;
                                int i192 = vc0Var3.w;
                                boolean z132 = vc0Var3.b;
                                if (messagePreviewParams5.quote != null && !z132) {
                                    messagePreviewParams5.quote = null;
                                    gc0Var3.f(false);
                                    pc0Var6.g(false, true);
                                    pc0Var6.k(true);
                                    break;
                                } else if (gc0Var3.v - gc0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                    MessageObject c12 = pc0Var6.c(null);
                                    if (c12 != null) {
                                        if (!gc0Var3.x()) {
                                            messagePreviewParams5.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                            messagePreviewParams5.quoteEnd = min;
                                            messagePreviewParams5.quote = org.telegram.ui.un.b(messagePreviewParams5.quoteStart, min, c12);
                                            View d10 = pc0Var6.d();
                                            if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                gc0Var3.Z((org.telegram.ui.Cells.u1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            }
                                            if (!z132) {
                                                pc0Var6.s.getSwipeBack().e(pc0Var6.I);
                                            }
                                            pc0Var6.g(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams5.quoteStart = gc0Var3.u;
                                            messagePreviewParams5.quoteEnd = gc0Var3.v;
                                            org.telegram.ui.Cells.w9 w9Var2 = gc0Var3.W;
                                            messagePreviewParams5.quote = org.telegram.ui.un.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, pc0Var6.c(w9Var2 != null ? ((org.telegram.ui.Cells.u1) w9Var2).getMessageObject() : null));
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
                                    org.telegram.ui.nl nlVar = (org.telegram.ui.nl) vc0Var4;
                                    nlVar.a(true);
                                    org.telegram.ui.fo foVar = nlVar.H;
                                    foVar.n5 = null;
                                    foVar.l5 = null;
                                    foVar.f5.updateReply(null, null, foVar.T5, null);
                                    foVar.m8();
                                    break;
                                } else {
                                    org.telegram.ui.nl nlVar2 = (org.telegram.ui.nl) vc0Var4;
                                    nlVar2.a(true);
                                    org.telegram.ui.fo foVar2 = nlVar2.H;
                                    foVar2.l5 = null;
                                    foVar2.Fb(foVar2.n5);
                                    break;
                                }
                            case 7:
                                this.b.c0.c(true);
                                break;
                            case 8:
                                this.b.c0.a(true);
                                break;
                            case 9:
                                org.telegram.ui.nl nlVar3 = (org.telegram.ui.nl) this.b.c0;
                                nlVar3.a(true);
                                org.telegram.ui.fo foVar3 = nlVar3.H;
                                foVar3.f5.updateForward(null, foVar3.T5);
                                foVar3.m8();
                                break;
                            case 10:
                                this.b.c0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.nl nlVar4 = (org.telegram.ui.nl) this.b.c0;
                                nlVar4.a(true);
                                org.telegram.ui.fo foVar4 = nlVar4.H;
                                foVar4.G5 = null;
                                org.telegram.ui.sk skVar = foVar4.Y;
                                if (skVar != null) {
                                    skVar.X2 = null;
                                    skVar.Y2 = false;
                                }
                                MessagePreviewParams messagePreviewParams6 = foVar4.f5;
                                if (messagePreviewParams6 != null) {
                                    i162 = ((org.telegram.ui.ActionBar.m2) foVar4).currentAccount;
                                    MessageObject messageObject = foVar4.n5;
                                    messagePreviewParams6.updateLink(i162, null, null, messageObject == foVar4.X3 ? null : messageObject, foVar4.l5, foVar4.p5);
                                }
                                foVar4.m8();
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
                ?? e1Var9 = new org.telegram.ui.ActionBar.e1(1, context3, vc0Var.F, false, false);
                this.y = e1Var9;
                e1Var9.g(LocaleController.getString(R.string.QuoteToAnotherChat), R.drawable.msg_forward_replace, r11);
                final int i27 = 4;
                e1Var9.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.yb0
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
                                gc0 gc0Var2 = pc0Var5.e;
                                vc0 vc0Var2 = pc0Var5.c0;
                                if (pc0Var5.c(null) != null) {
                                    if (gc0Var2.v - gc0Var2.u <= MessagesController.getInstance(vc0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.w9 w9Var = gc0Var2.W;
                                        MessageObject c11 = pc0Var5.c(w9Var != null ? ((org.telegram.ui.Cells.u1) w9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams4 = vc0Var2.d;
                                        int i172 = gc0Var2.u;
                                        messagePreviewParams4.quoteStart = i172;
                                        int i182 = gc0Var2.v;
                                        messagePreviewParams4.quoteEnd = i182;
                                        messagePreviewParams4.quote = org.telegram.ui.un.b(i172, i182, c11);
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
                                gc0 gc0Var3 = pc0Var6.e;
                                vc0 vc0Var3 = pc0Var6.c0;
                                MessagePreviewParams messagePreviewParams5 = vc0Var3.d;
                                int i192 = vc0Var3.w;
                                boolean z132 = vc0Var3.b;
                                if (messagePreviewParams5.quote != null && !z132) {
                                    messagePreviewParams5.quote = null;
                                    gc0Var3.f(false);
                                    pc0Var6.g(false, true);
                                    pc0Var6.k(true);
                                    break;
                                } else if (gc0Var3.v - gc0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                    MessageObject c12 = pc0Var6.c(null);
                                    if (c12 != null) {
                                        if (!gc0Var3.x()) {
                                            messagePreviewParams5.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                            messagePreviewParams5.quoteEnd = min;
                                            messagePreviewParams5.quote = org.telegram.ui.un.b(messagePreviewParams5.quoteStart, min, c12);
                                            View d10 = pc0Var6.d();
                                            if (d10 instanceof org.telegram.ui.Cells.u1) {
                                                gc0Var3.Z((org.telegram.ui.Cells.u1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            }
                                            if (!z132) {
                                                pc0Var6.s.getSwipeBack().e(pc0Var6.I);
                                            }
                                            pc0Var6.g(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams5.quoteStart = gc0Var3.u;
                                            messagePreviewParams5.quoteEnd = gc0Var3.v;
                                            org.telegram.ui.Cells.w9 w9Var2 = gc0Var3.W;
                                            messagePreviewParams5.quote = org.telegram.ui.un.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, pc0Var6.c(w9Var2 != null ? ((org.telegram.ui.Cells.u1) w9Var2).getMessageObject() : null));
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
                                    org.telegram.ui.nl nlVar = (org.telegram.ui.nl) vc0Var4;
                                    nlVar.a(true);
                                    org.telegram.ui.fo foVar = nlVar.H;
                                    foVar.n5 = null;
                                    foVar.l5 = null;
                                    foVar.f5.updateReply(null, null, foVar.T5, null);
                                    foVar.m8();
                                    break;
                                } else {
                                    org.telegram.ui.nl nlVar2 = (org.telegram.ui.nl) vc0Var4;
                                    nlVar2.a(true);
                                    org.telegram.ui.fo foVar2 = nlVar2.H;
                                    foVar2.l5 = null;
                                    foVar2.Fb(foVar2.n5);
                                    break;
                                }
                            case 7:
                                this.b.c0.c(true);
                                break;
                            case 8:
                                this.b.c0.a(true);
                                break;
                            case 9:
                                org.telegram.ui.nl nlVar3 = (org.telegram.ui.nl) this.b.c0;
                                nlVar3.a(true);
                                org.telegram.ui.fo foVar3 = nlVar3.H;
                                foVar3.f5.updateForward(null, foVar3.T5);
                                foVar3.m8();
                                break;
                            case 10:
                                this.b.c0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.nl nlVar4 = (org.telegram.ui.nl) this.b.c0;
                                nlVar4.a(true);
                                org.telegram.ui.fo foVar4 = nlVar4.H;
                                foVar4.G5 = null;
                                org.telegram.ui.sk skVar = foVar4.Y;
                                if (skVar != null) {
                                    skVar.X2 = null;
                                    skVar.Y2 = false;
                                }
                                MessagePreviewParams messagePreviewParams6 = foVar4.f5;
                                if (messagePreviewParams6 != null) {
                                    i162 = ((org.telegram.ui.ActionBar.m2) foVar4).currentAccount;
                                    MessageObject messageObject = foVar4.n5;
                                    messagePreviewParams6.updateLink(i162, null, null, messageObject == foVar4.X3 ? null : messageObject, foVar4.l5, foVar4.p5);
                                }
                                foVar4.m8();
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
                frameLayout3.addView(e1Var9, w7.z5.d(48.0f, -1));
                frameLayout3.addView(e1Var8, w7.z5.d(48.0f, -1));
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout3, w7.z5.n(-1, 48));
            }
            if (!messagePreviewParams.noforwards && !messagePreviewParams.hasSecretMessages) {
                org.telegram.ui.ActionBar.j1 j1Var4 = new org.telegram.ui.ActionBar.j1(context3, rc0Var);
                j1Var4.setColor(org.telegram.ui.ActionBar.g6.m1(0.06f, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.E8, rc0Var)));
                j1Var4.setTag(R.id.fit_width_tag, 1);
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(j1Var4, w7.z5.n(-1, 8));
            }
            g(messagePreviewParams.quote != null, false);
            ?? e1Var10 = new org.telegram.ui.ActionBar.e1(1, context3, vc0Var.F, false, false);
            e1Var10.g(LocaleController.getString(R.string.ApplyChanges), R.drawable.msg_select, r11);
            final int i28 = 5;
            e1Var10.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.yb0
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
                            gc0 gc0Var2 = pc0Var5.e;
                            vc0 vc0Var2 = pc0Var5.c0;
                            if (pc0Var5.c(null) != null) {
                                if (gc0Var2.v - gc0Var2.u <= MessagesController.getInstance(vc0Var2.w).quoteLengthMax) {
                                    org.telegram.ui.Cells.w9 w9Var = gc0Var2.W;
                                    MessageObject c11 = pc0Var5.c(w9Var != null ? ((org.telegram.ui.Cells.u1) w9Var).getMessageObject() : null);
                                    MessagePreviewParams messagePreviewParams4 = vc0Var2.d;
                                    int i172 = gc0Var2.u;
                                    messagePreviewParams4.quoteStart = i172;
                                    int i182 = gc0Var2.v;
                                    messagePreviewParams4.quoteEnd = i182;
                                    messagePreviewParams4.quote = org.telegram.ui.un.b(i172, i182, c11);
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
                            gc0 gc0Var3 = pc0Var6.e;
                            vc0 vc0Var3 = pc0Var6.c0;
                            MessagePreviewParams messagePreviewParams5 = vc0Var3.d;
                            int i192 = vc0Var3.w;
                            boolean z132 = vc0Var3.b;
                            if (messagePreviewParams5.quote != null && !z132) {
                                messagePreviewParams5.quote = null;
                                gc0Var3.f(false);
                                pc0Var6.g(false, true);
                                pc0Var6.k(true);
                                break;
                            } else if (gc0Var3.v - gc0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                MessageObject c12 = pc0Var6.c(null);
                                if (c12 != null) {
                                    if (!gc0Var3.x()) {
                                        messagePreviewParams5.quoteStart = 0;
                                        int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                        messagePreviewParams5.quoteEnd = min;
                                        messagePreviewParams5.quote = org.telegram.ui.un.b(messagePreviewParams5.quoteStart, min, c12);
                                        View d10 = pc0Var6.d();
                                        if (d10 instanceof org.telegram.ui.Cells.u1) {
                                            gc0Var3.Z((org.telegram.ui.Cells.u1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                        }
                                        if (!z132) {
                                            pc0Var6.s.getSwipeBack().e(pc0Var6.I);
                                        }
                                        pc0Var6.g(true, true);
                                        break;
                                    } else {
                                        messagePreviewParams5.quoteStart = gc0Var3.u;
                                        messagePreviewParams5.quoteEnd = gc0Var3.v;
                                        org.telegram.ui.Cells.w9 w9Var2 = gc0Var3.W;
                                        messagePreviewParams5.quote = org.telegram.ui.un.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, pc0Var6.c(w9Var2 != null ? ((org.telegram.ui.Cells.u1) w9Var2).getMessageObject() : null));
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
                                org.telegram.ui.nl nlVar = (org.telegram.ui.nl) vc0Var4;
                                nlVar.a(true);
                                org.telegram.ui.fo foVar = nlVar.H;
                                foVar.n5 = null;
                                foVar.l5 = null;
                                foVar.f5.updateReply(null, null, foVar.T5, null);
                                foVar.m8();
                                break;
                            } else {
                                org.telegram.ui.nl nlVar2 = (org.telegram.ui.nl) vc0Var4;
                                nlVar2.a(true);
                                org.telegram.ui.fo foVar2 = nlVar2.H;
                                foVar2.l5 = null;
                                foVar2.Fb(foVar2.n5);
                                break;
                            }
                        case 7:
                            this.b.c0.c(true);
                            break;
                        case 8:
                            this.b.c0.a(true);
                            break;
                        case 9:
                            org.telegram.ui.nl nlVar3 = (org.telegram.ui.nl) this.b.c0;
                            nlVar3.a(true);
                            org.telegram.ui.fo foVar3 = nlVar3.H;
                            foVar3.f5.updateForward(null, foVar3.T5);
                            foVar3.m8();
                            break;
                        case 10:
                            this.b.c0.a(true);
                            break;
                        case 11:
                            org.telegram.ui.nl nlVar4 = (org.telegram.ui.nl) this.b.c0;
                            nlVar4.a(true);
                            org.telegram.ui.fo foVar4 = nlVar4.H;
                            foVar4.G5 = null;
                            org.telegram.ui.sk skVar = foVar4.Y;
                            if (skVar != null) {
                                skVar.X2 = null;
                                skVar.Y2 = false;
                            }
                            MessagePreviewParams messagePreviewParams6 = foVar4.f5;
                            if (messagePreviewParams6 != null) {
                                i162 = ((org.telegram.ui.ActionBar.m2) foVar4).currentAccount;
                                MessageObject messageObject = foVar4.n5;
                                messagePreviewParams6.updateLink(i162, null, null, messageObject == foVar4.X3 ? null : messageObject, foVar4.l5, foVar4.p5);
                            }
                            foVar4.m8();
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
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var10, w7.z5.n(-1, 48));
            ?? e1Var11 = new org.telegram.ui.ActionBar.e1(1, context, vc0Var.F, false, true);
            e1Var11.g(LocaleController.getString(z12 ? R.string.DoNotQuote : R.string.DoNotReply), R.drawable.msg_delete, r11);
            int w04 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.q7, rc0Var);
            int i29 = org.telegram.ui.ActionBar.g6.p7;
            e1Var11.c(w04, org.telegram.ui.ActionBar.g6.w0(i29, rc0Var));
            e1Var11.setSelectorColor(org.telegram.ui.ActionBar.g6.m1(0.12f, org.telegram.ui.ActionBar.g6.x0(r11, i29, false)));
            final int i30 = 6;
            e1Var11.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.yb0
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
                            gc0 gc0Var2 = pc0Var5.e;
                            vc0 vc0Var2 = pc0Var5.c0;
                            if (pc0Var5.c(null) != null) {
                                if (gc0Var2.v - gc0Var2.u <= MessagesController.getInstance(vc0Var2.w).quoteLengthMax) {
                                    org.telegram.ui.Cells.w9 w9Var = gc0Var2.W;
                                    MessageObject c11 = pc0Var5.c(w9Var != null ? ((org.telegram.ui.Cells.u1) w9Var).getMessageObject() : null);
                                    MessagePreviewParams messagePreviewParams4 = vc0Var2.d;
                                    int i172 = gc0Var2.u;
                                    messagePreviewParams4.quoteStart = i172;
                                    int i182 = gc0Var2.v;
                                    messagePreviewParams4.quoteEnd = i182;
                                    messagePreviewParams4.quote = org.telegram.ui.un.b(i172, i182, c11);
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
                            gc0 gc0Var3 = pc0Var6.e;
                            vc0 vc0Var3 = pc0Var6.c0;
                            MessagePreviewParams messagePreviewParams5 = vc0Var3.d;
                            int i192 = vc0Var3.w;
                            boolean z132 = vc0Var3.b;
                            if (messagePreviewParams5.quote != null && !z132) {
                                messagePreviewParams5.quote = null;
                                gc0Var3.f(false);
                                pc0Var6.g(false, true);
                                pc0Var6.k(true);
                                break;
                            } else if (gc0Var3.v - gc0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                MessageObject c12 = pc0Var6.c(null);
                                if (c12 != null) {
                                    if (!gc0Var3.x()) {
                                        messagePreviewParams5.quoteStart = 0;
                                        int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                        messagePreviewParams5.quoteEnd = min;
                                        messagePreviewParams5.quote = org.telegram.ui.un.b(messagePreviewParams5.quoteStart, min, c12);
                                        View d10 = pc0Var6.d();
                                        if (d10 instanceof org.telegram.ui.Cells.u1) {
                                            gc0Var3.Z((org.telegram.ui.Cells.u1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                        }
                                        if (!z132) {
                                            pc0Var6.s.getSwipeBack().e(pc0Var6.I);
                                        }
                                        pc0Var6.g(true, true);
                                        break;
                                    } else {
                                        messagePreviewParams5.quoteStart = gc0Var3.u;
                                        messagePreviewParams5.quoteEnd = gc0Var3.v;
                                        org.telegram.ui.Cells.w9 w9Var2 = gc0Var3.W;
                                        messagePreviewParams5.quote = org.telegram.ui.un.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, pc0Var6.c(w9Var2 != null ? ((org.telegram.ui.Cells.u1) w9Var2).getMessageObject() : null));
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
                                org.telegram.ui.nl nlVar = (org.telegram.ui.nl) vc0Var4;
                                nlVar.a(true);
                                org.telegram.ui.fo foVar = nlVar.H;
                                foVar.n5 = null;
                                foVar.l5 = null;
                                foVar.f5.updateReply(null, null, foVar.T5, null);
                                foVar.m8();
                                break;
                            } else {
                                org.telegram.ui.nl nlVar2 = (org.telegram.ui.nl) vc0Var4;
                                nlVar2.a(true);
                                org.telegram.ui.fo foVar2 = nlVar2.H;
                                foVar2.l5 = null;
                                foVar2.Fb(foVar2.n5);
                                break;
                            }
                        case 7:
                            this.b.c0.c(true);
                            break;
                        case 8:
                            this.b.c0.a(true);
                            break;
                        case 9:
                            org.telegram.ui.nl nlVar3 = (org.telegram.ui.nl) this.b.c0;
                            nlVar3.a(true);
                            org.telegram.ui.fo foVar3 = nlVar3.H;
                            foVar3.f5.updateForward(null, foVar3.T5);
                            foVar3.m8();
                            break;
                        case 10:
                            this.b.c0.a(true);
                            break;
                        case 11:
                            org.telegram.ui.nl nlVar4 = (org.telegram.ui.nl) this.b.c0;
                            nlVar4.a(true);
                            org.telegram.ui.fo foVar4 = nlVar4.H;
                            foVar4.G5 = null;
                            org.telegram.ui.sk skVar = foVar4.Y;
                            if (skVar != null) {
                                skVar.X2 = null;
                                skVar.Y2 = false;
                            }
                            MessagePreviewParams messagePreviewParams6 = foVar4.f5;
                            if (messagePreviewParams6 != null) {
                                i162 = ((org.telegram.ui.ActionBar.m2) foVar4).currentAccount;
                                MessageObject messageObject = foVar4.n5;
                                messagePreviewParams6.updateLink(i162, null, null, messageObject == foVar4.X3 ? null : messageObject, foVar4.l5, foVar4.p5);
                            }
                            foVar4.m8();
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
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var11, w7.z5.n(-1, 48));
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
        pc0Var2.addView(n10, w7.z5.a(-1.0f, 0.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / AndroidUtilities.density, 0.0f, 0.0f, -1, 51));
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
            org.telegram.ui.un unVar = vc0Var.d.quote;
            if (unVar != null) {
                return unVar.a;
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
                hc0 hc0Var = this.f;
                if (i10 >= hc0Var.getChildCount()) {
                    break;
                }
                View childAt = hc0Var.getChildAt(i10);
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
        ah.v vVar = this.c;
        org.telegram.ui.z8 z8Var = this.b;
        if (z10) {
            vVar.setTranslationY(0.0f);
            z8Var.invalidateOutline();
            z8Var.setTranslationY(0.0f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(0.0f);
        } else {
            vVar.setTranslationY(i10);
            z8Var.invalidateOutline();
            z8Var.setTranslationY(f7);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((f7 + z8Var.getMeasuredHeight()) - AndroidUtilities.dp(2.0f));
        }
        float x10 = z8Var.getX();
        org.telegram.ui.Cells.aa aaVar = this.d;
        aaVar.setTranslationX(x10);
        aaVar.setTranslationY(z8Var.getY());
    }

    public final void f() {
        vc0 vc0Var = this.c0;
        new zc(vc0Var, vc0Var.F).M(LocaleController.getString(R.string.QuoteMaxError), LocaleController.getString(R.string.QuoteMaxErrorMessage), R.raw.error).j();
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
        fc0 fc0Var = this.w;
        fc0 fc0Var2 = this.v;
        if (!z11) {
            if (fc0Var2 != null) {
                fc0Var2.setAlpha(!z10 ? 1.0f : 0.0f);
                fc0Var2.setVisibility(!z10 ? 0 : 4);
            }
            if (fc0Var != null) {
                fc0Var.setAlpha(z10 ? 1.0f : 0.0f);
                fc0Var.setVisibility(z10 ? 0 : 4);
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
        if (fc0Var2 != null) {
            fc0Var2.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(fc0Var2, (Property<fc0, Float>) property, !z10 ? 1.0f : 0.0f));
        }
        if (fc0Var != null) {
            fc0Var.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(fc0Var, (Property<fc0, Float>) property, z10 ? 1.0f : 0.0f));
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
        this.P.setInterpolator(es.h);
        this.P.addListener(new org.telegram.ui.vo(16, this, z10));
        this.P.start();
    }

    public final void h() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        vc0 vc0Var = this.c0;
        MessagePreviewParams messagePreviewParams = vc0Var.d;
        jc0 jc0Var = this.h;
        if (jc0Var.k()) {
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
            jc0Var.V(this.r.groupedMessagesMap.valueAt(i12));
        }
        this.n.q(0, this.r.previewMessages.size());
    }

    public final void i() {
        int i10 = this.R;
        float f7 = this.S;
        vc0 vc0Var = this.c0;
        boolean z10 = vc0Var.v;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        hc0 hc0Var = this.f;
        if (z10) {
            this.S = 0.0f;
            this.R = 0;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(AndroidUtilities.dp(8.0f) + hc0Var.getMeasuredWidth());
        } else {
            int measuredHeight = hc0Var.getMeasuredHeight();
            int i11 = 0;
            for (int i12 = 0; i12 < hc0Var.getChildCount(); i12++) {
                View childAt = hc0Var.getChildAt(i12);
                if (RecyclerView.R(childAt) != -1) {
                    measuredHeight = Math.min(measuredHeight, childAt.getTop());
                    i11++;
                }
            }
            MessagePreviewParams.Messages messages = this.r;
            if (messages == null || i11 == 0 || i11 > messages.previewMessages.size()) {
                this.R = 0;
            } else {
                int b10 = org.telegram.messenger.g0.b(4.0f, measuredHeight, 0);
                this.R = b10;
                this.R = Math.min(((hc0Var.getMeasuredHeight() - this.R) + b10) - ((int) ((((AndroidUtilities.displaySize.y - (Build.VERSION.SDK_INT >= 35 ? AndroidUtilities.navigationBarHeight : 0)) * 0.8f) - this.W) - AndroidUtilities.dp(8.0f))), this.R);
            }
            float z11 = com.google.android.gms.internal.play_billing.k3.z(getMeasuredHeight() - AndroidUtilities.dp(16.0f), (this.b.getMeasuredHeight() - this.R) + (this.W - AndroidUtilities.dp(8.0f)), 2.0f, AndroidUtilities.dp(8.0f)) - this.R;
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
        ofFloat.addUpdateListener(new bk(this, i10, f7, 1));
        vc0Var.h.setDuration(250L);
        vc0Var.h.setInterpolator(ki.n.V);
        vc0Var.h.addListener(new k90(this, 2));
        AndroidUtilities.runOnUIThread(vc0Var.y, 50L);
        this.T = i10;
        e(f7, i10);
    }

    public final void j() {
        MessageObject messageObject;
        vc0 vc0Var = this.c0;
        MessagePreviewParams messagePreviewParams = vc0Var.d;
        if (this.a == 0) {
            gc0 gc0Var = this.e;
            if (gc0Var.v - gc0Var.u > MessagesController.getInstance(vc0Var.w).quoteLengthMax) {
                return;
            }
            org.telegram.ui.Cells.w9 w9Var = gc0Var.W;
            MessageObject c10 = c(w9Var != null ? ((org.telegram.ui.Cells.u1) w9Var).getMessageObject() : null);
            if (messagePreviewParams.quote != null && gc0Var.x()) {
                messagePreviewParams.quoteStart = gc0Var.u;
                messagePreviewParams.quoteEnd = gc0Var.v;
                if (c10 != null && ((messageObject = messagePreviewParams.quote.a) == null || messageObject.getId() != c10.getId())) {
                    messagePreviewParams.quote = org.telegram.ui.un.b(messagePreviewParams.quoteStart, messagePreviewParams.quoteEnd, c10);
                    vc0Var.b();
                }
            }
            gc0Var.f(false);
        }
    }

    public final void k(boolean z10) {
        vc0 vc0Var = this.c0;
        TLRPC.User user = vc0Var.n;
        MessagePreviewParams messagePreviewParams = vc0Var.d;
        TLRPC.Chat chat = vc0Var.r;
        ah.v vVar = this.c;
        int i10 = this.a;
        if (i10 == 1) {
            MessagePreviewParams.Messages messages = messagePreviewParams.forwardMessages;
            vVar.c(LocaleController.formatPluralString("PreviewForwardMessagesCount", messages == null ? 0 : messages.selectedIds.size(), new Object[0]), z10);
            vVar.b(!messagePreviewParams.hasSenders ? messagePreviewParams.willSeeSenders ? user != null ? LocaleController.formatString("ForwardPreviewSendersNameVisible", R.string.ForwardPreviewSendersNameVisible, ContactsController.formatName(user.first_name, user.last_name)) : (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.ForwardPreviewSendersNameVisibleGroup) : LocaleController.getString(R.string.ForwardPreviewSendersNameVisibleChannel) : user != null ? LocaleController.formatString("ForwardPreviewSendersNameVisible", R.string.ForwardPreviewSendersNameVisible, ContactsController.formatName(user.first_name, user.last_name)) : (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.ForwardPreviewSendersNameHiddenGroup) : LocaleController.getString(R.string.ForwardPreviewSendersNameHiddenChannel) : !messagePreviewParams.hideForwardSendersName ? user != null ? LocaleController.formatString("ForwardPreviewSendersNameVisible", R.string.ForwardPreviewSendersNameVisible, ContactsController.formatName(user.first_name, user.last_name)) : (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.ForwardPreviewSendersNameVisibleGroup) : LocaleController.getString(R.string.ForwardPreviewSendersNameVisibleChannel) : user != null ? LocaleController.formatString("ForwardPreviewSendersNameHidden", R.string.ForwardPreviewSendersNameHidden, ContactsController.formatName(user.first_name, user.last_name)) : (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.ForwardPreviewSendersNameHiddenGroup) : LocaleController.getString(R.string.ForwardPreviewSendersNameHiddenChannel), z10);
        } else {
            if (i10 != 0) {
                if (i10 == 2) {
                    vVar.c(LocaleController.getString(R.string.MessageOptionsLinkTitle), z10);
                    vVar.b(LocaleController.getString(R.string.MessageOptionsLinkSubtitle), z10);
                    return;
                }
                return;
            }
            if (messagePreviewParams.quote == null || !messagePreviewParams.replyMessage.hasText) {
                vVar.c(LocaleController.getString(R.string.MessageOptionsReplyTitle), z10);
                vVar.b(messagePreviewParams.replyMessage.hasText ? LocaleController.getString(R.string.MessageOptionsReplySubtitle) : "", z10);
            } else {
                vVar.c(LocaleController.getString(R.string.PreviewQuoteUpdate), z10);
                vVar.b(LocaleController.getString(R.string.PreviewQuoteUpdateSubtitle), z10);
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
        org.telegram.ui.z8 z8Var = this.b;
        if (z11) {
            z8Var.getLayoutParams().height = -1;
            ((ViewGroup.MarginLayoutParams) z8Var.getLayoutParams()).topMargin = AndroidUtilities.dp(8.0f);
            ((ViewGroup.MarginLayoutParams) z8Var.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
            z8Var.getLayoutParams().width = (int) Math.min(View.MeasureSpec.getSize(i10), Math.max(AndroidUtilities.dp(340.0f), View.MeasureSpec.getSize(i10) * 0.6f));
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = -1;
        } else {
            ((ViewGroup.MarginLayoutParams) z8Var.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) z8Var.getLayoutParams()).bottomMargin = 0;
            z8Var.getLayoutParams().height = (View.MeasureSpec.getSize(i11) - AndroidUtilities.dp(6.0f)) - this.W;
            if (z8Var.getLayoutParams().height < View.MeasureSpec.getSize(i11) * 0.5f) {
                z8Var.getLayoutParams().height = (int) (View.MeasureSpec.getSize(i11) * 0.5f);
            }
            z8Var.getLayoutParams().width = -1;
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = View.MeasureSpec.getSize(i11) - z8Var.getLayoutParams().height;
        }
        int size = (View.MeasureSpec.getSize(i11) + View.MeasureSpec.getSize(i10)) << 16;
        if (this.a0 != size) {
            for (int i13 = 0; i13 < this.r.previewMessages.size(); i13++) {
                MessageObject messageObject = this.r.previewMessages.get(i13);
                messageObject.parentWidth = vc0Var.v ? z8Var.getLayoutParams().width : View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(16.0f);
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
