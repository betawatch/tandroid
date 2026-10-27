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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ic0 extends FrameLayout {
    public final nc0 E;
    public final FrameLayout F;
    public final nc0 G;
    public final nc0 H;
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
    public final org.telegram.ui.a9 b;
    public boolean b0;
    public final rb0 c;
    public final /* synthetic */ oc0 c0;
    public final org.telegram.ui.Cells.ea d;
    public final ac0 e;
    public final bc0 f;
    public final dc0 h;
    public final hc0 n;
    public MessagePreviewParams.Messages r;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout s;
    public final zb0 v;
    public final zb0 w;
    public final org.telegram.ui.ActionBar.g1 x;
    public final org.telegram.ui.ActionBar.g1 y;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r12v6, types: [android.graphics.drawable.Drawable, org.telegram.ui.ActionBar.b7] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [android.view.View, org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout] */
    /* JADX WARN: Type inference failed for: r2v58, types: [android.view.View, org.telegram.ui.ActionBar.g1] */
    /* JADX WARN: Type inference failed for: r2v59, types: [android.view.View, org.telegram.ui.ActionBar.g1] */
    /* JADX WARN: Type inference failed for: r2v65, types: [android.view.View, org.telegram.ui.ActionBar.g1] */
    /* JADX WARN: Type inference failed for: r2v66, types: [android.view.View, org.telegram.ui.ActionBar.g1] */
    /* JADX WARN: Type inference failed for: r2v73, types: [android.view.View, org.telegram.ui.ActionBar.g1, org.telegram.ui.Components.zb0] */
    /* JADX WARN: Type inference failed for: r2v74, types: [android.view.View, org.telegram.ui.ActionBar.g1, org.telegram.ui.Components.zb0] */
    /* JADX WARN: Type inference failed for: r32v0, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout, java.lang.Object, org.telegram.ui.Components.ic0] */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.view.View, android.view.ViewGroup, org.telegram.ui.Components.ww0, org.telegram.ui.a9] */
    /* JADX WARN: Type inference failed for: r3v6, types: [ch.b] */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r9v8, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r9v9, types: [android.view.ViewGroup] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ic0(oc0 oc0Var, Context context, int i10) {
        super(r4);
        MessagePreviewParams messagePreviewParams;
        Context context2;
        ic0 ic0Var;
        boolean z10;
        nc0 nc0Var;
        ViewOutlineProvider viewOutlineProvider;
        ic0 ic0Var2;
        MessagePreviewParams.Messages messages;
        ?? r12;
        MessagePreviewParams messagePreviewParams2;
        boolean z11;
        LinearLayout linearLayout;
        Object obj;
        Context context3 = context;
        this.c0 = oc0Var;
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
        setOnTouchListener(new rk(this, 5));
        ?? a9Var = new org.telegram.ui.a9(this, context3, i11);
        this.b = a9Var;
        kc0 kc0Var = oc0Var.F;
        boolean z12 = oc0Var.b;
        MessagePreviewParams messagePreviewParams3 = oc0Var.d;
        Drawable l4 = ((org.telegram.ui.un) kc0Var).l();
        if (((org.telegram.ui.un) kc0Var).f == null) {
            int i13 = org.telegram.ui.ActionBar.y6.a;
        }
        a9Var.U(l4);
        a9Var.setOccupyStatusBar(false);
        int i14 = 3;
        a9Var.setOutlineProvider(new eh.b(this, i14));
        a9Var.setClipToOutline(true);
        a9Var.setElevation(AndroidUtilities.dp(4.0f));
        rb0 rb0Var = new rb0(context3, kc0Var);
        this.c = rb0Var;
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.s8, rb0Var, kc0Var);
        ac0 ac0Var = new ac0(this);
        this.e = ac0Var;
        ac0Var.D = new di.n2(this, i14);
        bc0 bc0Var = new bc0(this, context3, kc0Var);
        this.f = bc0Var;
        dc0 dc0Var = new dc0(this, bc0Var, kc0Var);
        this.h = dc0Var;
        bc0Var.setItemAnimator(dc0Var);
        bc0Var.setOnScrollListener(new ml(this, 8));
        bc0Var.setOnItemClickListener(new ec0(this));
        hc0 hc0Var = new hc0(this);
        this.n = hc0Var;
        bc0Var.setAdapter(hc0Var);
        bc0Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        wb0 wb0Var = new wb0(this);
        wb0Var.O = new xb0(this);
        bc0Var.setClipToPadding(false);
        bc0Var.setLayoutManager(wb0Var);
        bc0Var.i(new yb0());
        a9Var.addView(bc0Var);
        addView(a9Var, kb1.h(-1, 400.0f, 0, 8.0f, 0.0f, 8.0f, 0.0f));
        a9Var.addView(rb0Var, kb1.g(-2.0f, -1));
        ?? actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert2, 1, getContext(), kc0Var);
        this.s = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().setOnForegroundOpenFinished(new ub0(this, i11));
        eh.d c10 = oc0Var.G.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, false);
        c10.v(gh.c.k(kc0Var));
        c10.w(AndroidUtilities.dp(8.0f));
        c10.x.e = true;
        c10.x(AndroidUtilities.dp(12.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c10);
        addView(actionBarPopupWindow$ActionBarPopupWindowLayout, kb1.g(-2.0f, -2));
        if (i10 != 0 || (messages = messagePreviewParams3.replyMessage) == null) {
            messagePreviewParams = messagePreviewParams3;
            if (i10 != 1 || messagePreviewParams.forwardMessages == null) {
                final ic0 ic0Var3 = this;
                ic0Var = ic0Var3;
                if (i10 == 2) {
                    ic0Var = ic0Var3;
                    if (messagePreviewParams.linkMessage != null) {
                        nc0 nc0Var2 = new nc0(context, R.raw.position_below, LocaleController.getString(R.string.LinkAbove), R.raw.position_above, LocaleController.getString(R.string.LinkBelow), oc0Var.F);
                        ic0Var3.E = nc0Var2;
                        nc0Var2.a(!messagePreviewParams.webpageTop, false);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(nc0Var2, kb1.r(-1, 48));
                        FrameLayout frameLayout = new FrameLayout(context);
                        ic0Var3.F = frameLayout;
                        int i15 = org.telegram.ui.ActionBar.y6.I5;
                        org.telegram.ui.Cells.y Z = org.telegram.ui.ActionBar.y6.Z(org.telegram.ui.ActionBar.y6.w0(i15, kc0Var), 0, 0);
                        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i15);
                        frameLayout.setBackground(Z);
                        org.telegram.ui.ActionBar.f7.k(frameLayout, Z, null, N, kc0Var);
                        nc0 nc0Var3 = new nc0(context, R.raw.media_shrink, LocaleController.getString(R.string.LinkMediaLarger), R.raw.media_enlarge, LocaleController.getString(R.string.LinkMediaSmaller), oc0Var.F);
                        ic0Var3.G = nc0Var3;
                        nc0Var3.setBackground(null);
                        nc0Var3.setVisibility(messagePreviewParams.isVideo ? 4 : 0);
                        frameLayout.addView(nc0Var3, kb1.r(-1, 48));
                        nc0 nc0Var4 = new nc0(context, R.raw.media_shrink, LocaleController.getString(R.string.LinkVideoLarger), R.raw.media_enlarge, LocaleController.getString(R.string.LinkVideoSmaller), oc0Var.F);
                        ic0Var3.H = nc0Var4;
                        nc0Var4.setBackground(null);
                        nc0Var4.setVisibility(!messagePreviewParams.isVideo ? 4 : 0);
                        frameLayout.setAlpha(messagePreviewParams.hasMedia ? 1.0f : 0.5f);
                        frameLayout.addView(nc0Var4, kb1.r(-1, 48));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, kb1.r(-1, 48));
                        frameLayout.setVisibility((!messagePreviewParams.singleLink || messagePreviewParams.hasMedia) ? 0 : 8);
                        nc0Var3.a(messagePreviewParams.webpageSmall, false);
                        nc0Var4.a(messagePreviewParams.webpageSmall, false);
                        org.telegram.ui.ActionBar.l1 l1Var = new org.telegram.ui.ActionBar.l1(context, kc0Var);
                        org.telegram.ui.ActionBar.f7.j(l1Var, org.telegram.ui.ActionBar.f7.L(0.06f, org.telegram.ui.ActionBar.y6.E8), kc0Var);
                        l1Var.setTag(R.id.fit_width_tag, 1);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(l1Var, kb1.r(-1, 8));
                        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(1, context, oc0Var.F, false, false);
                        g1Var.j(LocaleController.getString(R.string.ApplyChanges), R.drawable.msg_select, null);
                        final int i16 = 10;
                        g1Var.setOnClickListener(new View.OnClickListener(ic0Var3) { // from class: org.telegram.ui.Components.sb0
                            public final /* synthetic */ ic0 b;

                            {
                                this.b = ic0Var3;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i17;
                                TLRPC.Message message;
                                TLRPC.MessageMedia messageMedia;
                                TLRPC.Message message2;
                                TLRPC.MessageMedia messageMedia2;
                                TLRPC.Message message3;
                                TLRPC.Message message4;
                                switch (i16) {
                                    case 0:
                                        ic0 ic0Var4 = this.b;
                                        ic0Var4.c0.d.quote = null;
                                        ic0Var4.e.f(false);
                                        ic0Var4.h(false, false);
                                        ic0Var4.s.getSwipeBack().b(true);
                                        break;
                                    case 1:
                                        ic0 ic0Var5 = this.b;
                                        ac0 ac0Var2 = ic0Var5.e;
                                        oc0 oc0Var2 = ic0Var5.c0;
                                        if (ic0Var5.c(null) != null) {
                                            if (ac0Var2.v - ac0Var2.u <= MessagesController.getInstance(oc0Var2.w).quoteLengthMax) {
                                                org.telegram.ui.Cells.aa aaVar = ac0Var2.W;
                                                MessageObject c11 = ic0Var5.c(aaVar != null ? ((org.telegram.ui.Cells.s1) aaVar).getMessageObject() : null);
                                                MessagePreviewParams messagePreviewParams4 = oc0Var2.d;
                                                int i18 = ac0Var2.u;
                                                messagePreviewParams4.quoteStart = i18;
                                                int i19 = ac0Var2.v;
                                                messagePreviewParams4.quoteEnd = i19;
                                                messagePreviewParams4.quote = org.telegram.ui.mn.c(c11, i18, i19);
                                                oc0Var2.b();
                                                oc0Var2.a(true);
                                                break;
                                            } else {
                                                ic0Var5.g();
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        ic0 ic0Var6 = this.b;
                                        ac0 ac0Var3 = ic0Var6.e;
                                        oc0 oc0Var3 = ic0Var6.c0;
                                        MessagePreviewParams messagePreviewParams5 = oc0Var3.d;
                                        int i20 = oc0Var3.w;
                                        boolean z13 = oc0Var3.b;
                                        if (messagePreviewParams5.quote != null && !z13) {
                                            messagePreviewParams5.quote = null;
                                            ac0Var3.f(false);
                                            ic0Var6.h(false, true);
                                            ic0Var6.l(true);
                                            break;
                                        } else if (ac0Var3.v - ac0Var3.u <= MessagesController.getInstance(i20).quoteLengthMax) {
                                            MessageObject c12 = ic0Var6.c(null);
                                            if (c12 != null) {
                                                if (!ac0Var3.x()) {
                                                    messagePreviewParams5.quoteStart = 0;
                                                    int min = Math.min(MessagesController.getInstance(i20).quoteLengthMax, org.telegram.ui.mn.d(c12));
                                                    messagePreviewParams5.quoteEnd = min;
                                                    messagePreviewParams5.quote = org.telegram.ui.mn.c(c12, messagePreviewParams5.quoteStart, min);
                                                    View d = ic0Var6.d();
                                                    if (d instanceof org.telegram.ui.Cells.s1) {
                                                        ac0Var3.Z((org.telegram.ui.Cells.s1) d, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                    }
                                                    if (!z13) {
                                                        ic0Var6.s.getSwipeBack().e(ic0Var6.I);
                                                    }
                                                    ic0Var6.h(true, true);
                                                    break;
                                                } else {
                                                    messagePreviewParams5.quoteStart = ac0Var3.u;
                                                    messagePreviewParams5.quoteEnd = ac0Var3.v;
                                                    org.telegram.ui.Cells.aa aaVar2 = ac0Var3.W;
                                                    messagePreviewParams5.quote = org.telegram.ui.mn.c(ic0Var6.c(aaVar2 != null ? ((org.telegram.ui.Cells.s1) aaVar2).getMessageObject() : null), messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                    oc0Var3.b();
                                                    oc0Var3.a(true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            ic0Var6.g();
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
                                        oc0 oc0Var4 = this.b.c0;
                                        if (!oc0Var4.b) {
                                            org.telegram.ui.el elVar = (org.telegram.ui.el) oc0Var4;
                                            elVar.a(true);
                                            org.telegram.ui.wn wnVar = elVar.H;
                                            wnVar.D5 = null;
                                            wnVar.B5 = null;
                                            wnVar.v5.updateReply(null, null, wnVar.j6, null);
                                            wnVar.s8();
                                            break;
                                        } else {
                                            org.telegram.ui.el elVar2 = (org.telegram.ui.el) oc0Var4;
                                            elVar2.a(true);
                                            org.telegram.ui.wn wnVar2 = elVar2.H;
                                            wnVar2.B5 = null;
                                            wnVar2.Rb(wnVar2.D5);
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
                                        wnVar3.v5.updateForward(null, wnVar3.j6);
                                        wnVar3.s8();
                                        break;
                                    case 10:
                                        this.b.c0.a(true);
                                        break;
                                    case 11:
                                        org.telegram.ui.el elVar4 = (org.telegram.ui.el) this.b.c0;
                                        elVar4.a(true);
                                        org.telegram.ui.wn wnVar4 = elVar4.H;
                                        wnVar4.W5 = null;
                                        org.telegram.ui.jk jkVar = wnVar4.Y;
                                        if (jkVar != null) {
                                            jkVar.X2 = null;
                                            jkVar.Y2 = false;
                                        }
                                        MessagePreviewParams messagePreviewParams6 = wnVar4.v5;
                                        if (messagePreviewParams6 != null) {
                                            i17 = ((org.telegram.ui.ActionBar.r2) wnVar4).currentAccount;
                                            MessageObject messageObject = wnVar4.D5;
                                            messagePreviewParams6.updateLink(i17, null, null, messageObject == wnVar4.j4 ? null : messageObject, wnVar4.B5, wnVar4.F5);
                                        }
                                        wnVar4.s8();
                                        break;
                                    case 12:
                                        ic0 ic0Var7 = this.b;
                                        MessagePreviewParams messagePreviewParams7 = ic0Var7.c0.d;
                                        if (messagePreviewParams7.hasMedia) {
                                            boolean z14 = !messagePreviewParams7.webpageSmall;
                                            messagePreviewParams7.webpageSmall = z14;
                                            ic0Var7.G.a(z14, true);
                                            ic0Var7.H.a(messagePreviewParams7.webpageSmall, true);
                                            if (ic0Var7.r.messages.size() > 0 && (message2 = ic0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                                boolean z15 = messagePreviewParams7.webpageSmall;
                                                messageMedia2.force_small_media = z15;
                                                messageMedia2.force_large_media = !z15;
                                            }
                                            if (ic0Var7.r.previewMessages.size() > 0 && (message = ic0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                                boolean z16 = messagePreviewParams7.webpageSmall;
                                                messageMedia.force_small_media = z16;
                                                messageMedia.force_large_media = !z16;
                                            }
                                            ic0Var7.i();
                                            ic0Var7.U = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        ic0 ic0Var8 = this.b;
                                        MessagePreviewParams messagePreviewParams8 = ic0Var8.c0.d;
                                        boolean z17 = messagePreviewParams8.webpageTop;
                                        messagePreviewParams8.webpageTop = !z17;
                                        ic0Var8.E.a(z17, true);
                                        if (ic0Var8.r.messages.size() > 0 && (message4 = ic0Var8.r.messages.get(0).messageOwner) != null) {
                                            message4.invert_media = messagePreviewParams8.webpageTop;
                                        }
                                        if (ic0Var8.r.previewMessages.size() > 0 && (message3 = ic0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                            message3.invert_media = messagePreviewParams8.webpageTop;
                                        }
                                        ic0Var8.i();
                                        ic0Var8.U = true;
                                        break;
                                }
                            }
                        });
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var, kb1.r(-1, 48));
                        org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(1, context, oc0Var.F, false, true);
                        context2 = context;
                        g1Var2.j(LocaleController.getString(R.string.DoNotLinkPreview), R.drawable.msg_delete, null);
                        int i17 = org.telegram.ui.ActionBar.y6.q7;
                        int i18 = org.telegram.ui.ActionBar.y6.p7;
                        g1Var2.c(i17, i18);
                        final int i19 = 11;
                        g1Var2.setOnClickListener(new View.OnClickListener(ic0Var3) { // from class: org.telegram.ui.Components.sb0
                            public final /* synthetic */ ic0 b;

                            {
                                this.b = ic0Var3;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i172;
                                TLRPC.Message message;
                                TLRPC.MessageMedia messageMedia;
                                TLRPC.Message message2;
                                TLRPC.MessageMedia messageMedia2;
                                TLRPC.Message message3;
                                TLRPC.Message message4;
                                switch (i19) {
                                    case 0:
                                        ic0 ic0Var4 = this.b;
                                        ic0Var4.c0.d.quote = null;
                                        ic0Var4.e.f(false);
                                        ic0Var4.h(false, false);
                                        ic0Var4.s.getSwipeBack().b(true);
                                        break;
                                    case 1:
                                        ic0 ic0Var5 = this.b;
                                        ac0 ac0Var2 = ic0Var5.e;
                                        oc0 oc0Var2 = ic0Var5.c0;
                                        if (ic0Var5.c(null) != null) {
                                            if (ac0Var2.v - ac0Var2.u <= MessagesController.getInstance(oc0Var2.w).quoteLengthMax) {
                                                org.telegram.ui.Cells.aa aaVar = ac0Var2.W;
                                                MessageObject c11 = ic0Var5.c(aaVar != null ? ((org.telegram.ui.Cells.s1) aaVar).getMessageObject() : null);
                                                MessagePreviewParams messagePreviewParams4 = oc0Var2.d;
                                                int i182 = ac0Var2.u;
                                                messagePreviewParams4.quoteStart = i182;
                                                int i192 = ac0Var2.v;
                                                messagePreviewParams4.quoteEnd = i192;
                                                messagePreviewParams4.quote = org.telegram.ui.mn.c(c11, i182, i192);
                                                oc0Var2.b();
                                                oc0Var2.a(true);
                                                break;
                                            } else {
                                                ic0Var5.g();
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        ic0 ic0Var6 = this.b;
                                        ac0 ac0Var3 = ic0Var6.e;
                                        oc0 oc0Var3 = ic0Var6.c0;
                                        MessagePreviewParams messagePreviewParams5 = oc0Var3.d;
                                        int i20 = oc0Var3.w;
                                        boolean z13 = oc0Var3.b;
                                        if (messagePreviewParams5.quote != null && !z13) {
                                            messagePreviewParams5.quote = null;
                                            ac0Var3.f(false);
                                            ic0Var6.h(false, true);
                                            ic0Var6.l(true);
                                            break;
                                        } else if (ac0Var3.v - ac0Var3.u <= MessagesController.getInstance(i20).quoteLengthMax) {
                                            MessageObject c12 = ic0Var6.c(null);
                                            if (c12 != null) {
                                                if (!ac0Var3.x()) {
                                                    messagePreviewParams5.quoteStart = 0;
                                                    int min = Math.min(MessagesController.getInstance(i20).quoteLengthMax, org.telegram.ui.mn.d(c12));
                                                    messagePreviewParams5.quoteEnd = min;
                                                    messagePreviewParams5.quote = org.telegram.ui.mn.c(c12, messagePreviewParams5.quoteStart, min);
                                                    View d = ic0Var6.d();
                                                    if (d instanceof org.telegram.ui.Cells.s1) {
                                                        ac0Var3.Z((org.telegram.ui.Cells.s1) d, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                    }
                                                    if (!z13) {
                                                        ic0Var6.s.getSwipeBack().e(ic0Var6.I);
                                                    }
                                                    ic0Var6.h(true, true);
                                                    break;
                                                } else {
                                                    messagePreviewParams5.quoteStart = ac0Var3.u;
                                                    messagePreviewParams5.quoteEnd = ac0Var3.v;
                                                    org.telegram.ui.Cells.aa aaVar2 = ac0Var3.W;
                                                    messagePreviewParams5.quote = org.telegram.ui.mn.c(ic0Var6.c(aaVar2 != null ? ((org.telegram.ui.Cells.s1) aaVar2).getMessageObject() : null), messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                    oc0Var3.b();
                                                    oc0Var3.a(true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            ic0Var6.g();
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
                                        oc0 oc0Var4 = this.b.c0;
                                        if (!oc0Var4.b) {
                                            org.telegram.ui.el elVar = (org.telegram.ui.el) oc0Var4;
                                            elVar.a(true);
                                            org.telegram.ui.wn wnVar = elVar.H;
                                            wnVar.D5 = null;
                                            wnVar.B5 = null;
                                            wnVar.v5.updateReply(null, null, wnVar.j6, null);
                                            wnVar.s8();
                                            break;
                                        } else {
                                            org.telegram.ui.el elVar2 = (org.telegram.ui.el) oc0Var4;
                                            elVar2.a(true);
                                            org.telegram.ui.wn wnVar2 = elVar2.H;
                                            wnVar2.B5 = null;
                                            wnVar2.Rb(wnVar2.D5);
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
                                        wnVar3.v5.updateForward(null, wnVar3.j6);
                                        wnVar3.s8();
                                        break;
                                    case 10:
                                        this.b.c0.a(true);
                                        break;
                                    case 11:
                                        org.telegram.ui.el elVar4 = (org.telegram.ui.el) this.b.c0;
                                        elVar4.a(true);
                                        org.telegram.ui.wn wnVar4 = elVar4.H;
                                        wnVar4.W5 = null;
                                        org.telegram.ui.jk jkVar = wnVar4.Y;
                                        if (jkVar != null) {
                                            jkVar.X2 = null;
                                            jkVar.Y2 = false;
                                        }
                                        MessagePreviewParams messagePreviewParams6 = wnVar4.v5;
                                        if (messagePreviewParams6 != null) {
                                            i172 = ((org.telegram.ui.ActionBar.r2) wnVar4).currentAccount;
                                            MessageObject messageObject = wnVar4.D5;
                                            messagePreviewParams6.updateLink(i172, null, null, messageObject == wnVar4.j4 ? null : messageObject, wnVar4.B5, wnVar4.F5);
                                        }
                                        wnVar4.s8();
                                        break;
                                    case 12:
                                        ic0 ic0Var7 = this.b;
                                        MessagePreviewParams messagePreviewParams7 = ic0Var7.c0.d;
                                        if (messagePreviewParams7.hasMedia) {
                                            boolean z14 = !messagePreviewParams7.webpageSmall;
                                            messagePreviewParams7.webpageSmall = z14;
                                            ic0Var7.G.a(z14, true);
                                            ic0Var7.H.a(messagePreviewParams7.webpageSmall, true);
                                            if (ic0Var7.r.messages.size() > 0 && (message2 = ic0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                                boolean z15 = messagePreviewParams7.webpageSmall;
                                                messageMedia2.force_small_media = z15;
                                                messageMedia2.force_large_media = !z15;
                                            }
                                            if (ic0Var7.r.previewMessages.size() > 0 && (message = ic0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                                boolean z16 = messagePreviewParams7.webpageSmall;
                                                messageMedia.force_small_media = z16;
                                                messageMedia.force_large_media = !z16;
                                            }
                                            ic0Var7.i();
                                            ic0Var7.U = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        ic0 ic0Var8 = this.b;
                                        MessagePreviewParams messagePreviewParams8 = ic0Var8.c0.d;
                                        boolean z17 = messagePreviewParams8.webpageTop;
                                        messagePreviewParams8.webpageTop = !z17;
                                        ic0Var8.E.a(z17, true);
                                        if (ic0Var8.r.messages.size() > 0 && (message4 = ic0Var8.r.messages.get(0).messageOwner) != null) {
                                            message4.invert_media = messagePreviewParams8.webpageTop;
                                        }
                                        if (ic0Var8.r.previewMessages.size() > 0 && (message3 = ic0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                            message3.invert_media = messagePreviewParams8.webpageTop;
                                        }
                                        ic0Var8.i();
                                        ic0Var8.U = true;
                                        break;
                                }
                            }
                        });
                        g1Var2.h(0.12f, i18);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var2, kb1.r(-1, 48));
                        final int i20 = 12;
                        frameLayout.setOnClickListener(new View.OnClickListener(ic0Var3) { // from class: org.telegram.ui.Components.sb0
                            public final /* synthetic */ ic0 b;

                            {
                                this.b = ic0Var3;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i172;
                                TLRPC.Message message;
                                TLRPC.MessageMedia messageMedia;
                                TLRPC.Message message2;
                                TLRPC.MessageMedia messageMedia2;
                                TLRPC.Message message3;
                                TLRPC.Message message4;
                                switch (i20) {
                                    case 0:
                                        ic0 ic0Var4 = this.b;
                                        ic0Var4.c0.d.quote = null;
                                        ic0Var4.e.f(false);
                                        ic0Var4.h(false, false);
                                        ic0Var4.s.getSwipeBack().b(true);
                                        break;
                                    case 1:
                                        ic0 ic0Var5 = this.b;
                                        ac0 ac0Var2 = ic0Var5.e;
                                        oc0 oc0Var2 = ic0Var5.c0;
                                        if (ic0Var5.c(null) != null) {
                                            if (ac0Var2.v - ac0Var2.u <= MessagesController.getInstance(oc0Var2.w).quoteLengthMax) {
                                                org.telegram.ui.Cells.aa aaVar = ac0Var2.W;
                                                MessageObject c11 = ic0Var5.c(aaVar != null ? ((org.telegram.ui.Cells.s1) aaVar).getMessageObject() : null);
                                                MessagePreviewParams messagePreviewParams4 = oc0Var2.d;
                                                int i182 = ac0Var2.u;
                                                messagePreviewParams4.quoteStart = i182;
                                                int i192 = ac0Var2.v;
                                                messagePreviewParams4.quoteEnd = i192;
                                                messagePreviewParams4.quote = org.telegram.ui.mn.c(c11, i182, i192);
                                                oc0Var2.b();
                                                oc0Var2.a(true);
                                                break;
                                            } else {
                                                ic0Var5.g();
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        ic0 ic0Var6 = this.b;
                                        ac0 ac0Var3 = ic0Var6.e;
                                        oc0 oc0Var3 = ic0Var6.c0;
                                        MessagePreviewParams messagePreviewParams5 = oc0Var3.d;
                                        int i202 = oc0Var3.w;
                                        boolean z13 = oc0Var3.b;
                                        if (messagePreviewParams5.quote != null && !z13) {
                                            messagePreviewParams5.quote = null;
                                            ac0Var3.f(false);
                                            ic0Var6.h(false, true);
                                            ic0Var6.l(true);
                                            break;
                                        } else if (ac0Var3.v - ac0Var3.u <= MessagesController.getInstance(i202).quoteLengthMax) {
                                            MessageObject c12 = ic0Var6.c(null);
                                            if (c12 != null) {
                                                if (!ac0Var3.x()) {
                                                    messagePreviewParams5.quoteStart = 0;
                                                    int min = Math.min(MessagesController.getInstance(i202).quoteLengthMax, org.telegram.ui.mn.d(c12));
                                                    messagePreviewParams5.quoteEnd = min;
                                                    messagePreviewParams5.quote = org.telegram.ui.mn.c(c12, messagePreviewParams5.quoteStart, min);
                                                    View d = ic0Var6.d();
                                                    if (d instanceof org.telegram.ui.Cells.s1) {
                                                        ac0Var3.Z((org.telegram.ui.Cells.s1) d, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                    }
                                                    if (!z13) {
                                                        ic0Var6.s.getSwipeBack().e(ic0Var6.I);
                                                    }
                                                    ic0Var6.h(true, true);
                                                    break;
                                                } else {
                                                    messagePreviewParams5.quoteStart = ac0Var3.u;
                                                    messagePreviewParams5.quoteEnd = ac0Var3.v;
                                                    org.telegram.ui.Cells.aa aaVar2 = ac0Var3.W;
                                                    messagePreviewParams5.quote = org.telegram.ui.mn.c(ic0Var6.c(aaVar2 != null ? ((org.telegram.ui.Cells.s1) aaVar2).getMessageObject() : null), messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                    oc0Var3.b();
                                                    oc0Var3.a(true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            ic0Var6.g();
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
                                        oc0 oc0Var4 = this.b.c0;
                                        if (!oc0Var4.b) {
                                            org.telegram.ui.el elVar = (org.telegram.ui.el) oc0Var4;
                                            elVar.a(true);
                                            org.telegram.ui.wn wnVar = elVar.H;
                                            wnVar.D5 = null;
                                            wnVar.B5 = null;
                                            wnVar.v5.updateReply(null, null, wnVar.j6, null);
                                            wnVar.s8();
                                            break;
                                        } else {
                                            org.telegram.ui.el elVar2 = (org.telegram.ui.el) oc0Var4;
                                            elVar2.a(true);
                                            org.telegram.ui.wn wnVar2 = elVar2.H;
                                            wnVar2.B5 = null;
                                            wnVar2.Rb(wnVar2.D5);
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
                                        wnVar3.v5.updateForward(null, wnVar3.j6);
                                        wnVar3.s8();
                                        break;
                                    case 10:
                                        this.b.c0.a(true);
                                        break;
                                    case 11:
                                        org.telegram.ui.el elVar4 = (org.telegram.ui.el) this.b.c0;
                                        elVar4.a(true);
                                        org.telegram.ui.wn wnVar4 = elVar4.H;
                                        wnVar4.W5 = null;
                                        org.telegram.ui.jk jkVar = wnVar4.Y;
                                        if (jkVar != null) {
                                            jkVar.X2 = null;
                                            jkVar.Y2 = false;
                                        }
                                        MessagePreviewParams messagePreviewParams6 = wnVar4.v5;
                                        if (messagePreviewParams6 != null) {
                                            i172 = ((org.telegram.ui.ActionBar.r2) wnVar4).currentAccount;
                                            MessageObject messageObject = wnVar4.D5;
                                            messagePreviewParams6.updateLink(i172, null, null, messageObject == wnVar4.j4 ? null : messageObject, wnVar4.B5, wnVar4.F5);
                                        }
                                        wnVar4.s8();
                                        break;
                                    case 12:
                                        ic0 ic0Var7 = this.b;
                                        MessagePreviewParams messagePreviewParams7 = ic0Var7.c0.d;
                                        if (messagePreviewParams7.hasMedia) {
                                            boolean z14 = !messagePreviewParams7.webpageSmall;
                                            messagePreviewParams7.webpageSmall = z14;
                                            ic0Var7.G.a(z14, true);
                                            ic0Var7.H.a(messagePreviewParams7.webpageSmall, true);
                                            if (ic0Var7.r.messages.size() > 0 && (message2 = ic0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                                boolean z15 = messagePreviewParams7.webpageSmall;
                                                messageMedia2.force_small_media = z15;
                                                messageMedia2.force_large_media = !z15;
                                            }
                                            if (ic0Var7.r.previewMessages.size() > 0 && (message = ic0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                                boolean z16 = messagePreviewParams7.webpageSmall;
                                                messageMedia.force_small_media = z16;
                                                messageMedia.force_large_media = !z16;
                                            }
                                            ic0Var7.i();
                                            ic0Var7.U = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        ic0 ic0Var8 = this.b;
                                        MessagePreviewParams messagePreviewParams8 = ic0Var8.c0.d;
                                        boolean z17 = messagePreviewParams8.webpageTop;
                                        messagePreviewParams8.webpageTop = !z17;
                                        ic0Var8.E.a(z17, true);
                                        if (ic0Var8.r.messages.size() > 0 && (message4 = ic0Var8.r.messages.get(0).messageOwner) != null) {
                                            message4.invert_media = messagePreviewParams8.webpageTop;
                                        }
                                        if (ic0Var8.r.previewMessages.size() > 0 && (message3 = ic0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                            message3.invert_media = messagePreviewParams8.webpageTop;
                                        }
                                        ic0Var8.i();
                                        ic0Var8.U = true;
                                        break;
                                }
                            }
                        });
                        final int i21 = 13;
                        nc0Var2.setOnClickListener(new View.OnClickListener(ic0Var3) { // from class: org.telegram.ui.Components.sb0
                            public final /* synthetic */ ic0 b;

                            {
                                this.b = ic0Var3;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i172;
                                TLRPC.Message message;
                                TLRPC.MessageMedia messageMedia;
                                TLRPC.Message message2;
                                TLRPC.MessageMedia messageMedia2;
                                TLRPC.Message message3;
                                TLRPC.Message message4;
                                switch (i21) {
                                    case 0:
                                        ic0 ic0Var4 = this.b;
                                        ic0Var4.c0.d.quote = null;
                                        ic0Var4.e.f(false);
                                        ic0Var4.h(false, false);
                                        ic0Var4.s.getSwipeBack().b(true);
                                        break;
                                    case 1:
                                        ic0 ic0Var5 = this.b;
                                        ac0 ac0Var2 = ic0Var5.e;
                                        oc0 oc0Var2 = ic0Var5.c0;
                                        if (ic0Var5.c(null) != null) {
                                            if (ac0Var2.v - ac0Var2.u <= MessagesController.getInstance(oc0Var2.w).quoteLengthMax) {
                                                org.telegram.ui.Cells.aa aaVar = ac0Var2.W;
                                                MessageObject c11 = ic0Var5.c(aaVar != null ? ((org.telegram.ui.Cells.s1) aaVar).getMessageObject() : null);
                                                MessagePreviewParams messagePreviewParams4 = oc0Var2.d;
                                                int i182 = ac0Var2.u;
                                                messagePreviewParams4.quoteStart = i182;
                                                int i192 = ac0Var2.v;
                                                messagePreviewParams4.quoteEnd = i192;
                                                messagePreviewParams4.quote = org.telegram.ui.mn.c(c11, i182, i192);
                                                oc0Var2.b();
                                                oc0Var2.a(true);
                                                break;
                                            } else {
                                                ic0Var5.g();
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        ic0 ic0Var6 = this.b;
                                        ac0 ac0Var3 = ic0Var6.e;
                                        oc0 oc0Var3 = ic0Var6.c0;
                                        MessagePreviewParams messagePreviewParams5 = oc0Var3.d;
                                        int i202 = oc0Var3.w;
                                        boolean z13 = oc0Var3.b;
                                        if (messagePreviewParams5.quote != null && !z13) {
                                            messagePreviewParams5.quote = null;
                                            ac0Var3.f(false);
                                            ic0Var6.h(false, true);
                                            ic0Var6.l(true);
                                            break;
                                        } else if (ac0Var3.v - ac0Var3.u <= MessagesController.getInstance(i202).quoteLengthMax) {
                                            MessageObject c12 = ic0Var6.c(null);
                                            if (c12 != null) {
                                                if (!ac0Var3.x()) {
                                                    messagePreviewParams5.quoteStart = 0;
                                                    int min = Math.min(MessagesController.getInstance(i202).quoteLengthMax, org.telegram.ui.mn.d(c12));
                                                    messagePreviewParams5.quoteEnd = min;
                                                    messagePreviewParams5.quote = org.telegram.ui.mn.c(c12, messagePreviewParams5.quoteStart, min);
                                                    View d = ic0Var6.d();
                                                    if (d instanceof org.telegram.ui.Cells.s1) {
                                                        ac0Var3.Z((org.telegram.ui.Cells.s1) d, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                    }
                                                    if (!z13) {
                                                        ic0Var6.s.getSwipeBack().e(ic0Var6.I);
                                                    }
                                                    ic0Var6.h(true, true);
                                                    break;
                                                } else {
                                                    messagePreviewParams5.quoteStart = ac0Var3.u;
                                                    messagePreviewParams5.quoteEnd = ac0Var3.v;
                                                    org.telegram.ui.Cells.aa aaVar2 = ac0Var3.W;
                                                    messagePreviewParams5.quote = org.telegram.ui.mn.c(ic0Var6.c(aaVar2 != null ? ((org.telegram.ui.Cells.s1) aaVar2).getMessageObject() : null), messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                    oc0Var3.b();
                                                    oc0Var3.a(true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            ic0Var6.g();
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
                                        oc0 oc0Var4 = this.b.c0;
                                        if (!oc0Var4.b) {
                                            org.telegram.ui.el elVar = (org.telegram.ui.el) oc0Var4;
                                            elVar.a(true);
                                            org.telegram.ui.wn wnVar = elVar.H;
                                            wnVar.D5 = null;
                                            wnVar.B5 = null;
                                            wnVar.v5.updateReply(null, null, wnVar.j6, null);
                                            wnVar.s8();
                                            break;
                                        } else {
                                            org.telegram.ui.el elVar2 = (org.telegram.ui.el) oc0Var4;
                                            elVar2.a(true);
                                            org.telegram.ui.wn wnVar2 = elVar2.H;
                                            wnVar2.B5 = null;
                                            wnVar2.Rb(wnVar2.D5);
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
                                        wnVar3.v5.updateForward(null, wnVar3.j6);
                                        wnVar3.s8();
                                        break;
                                    case 10:
                                        this.b.c0.a(true);
                                        break;
                                    case 11:
                                        org.telegram.ui.el elVar4 = (org.telegram.ui.el) this.b.c0;
                                        elVar4.a(true);
                                        org.telegram.ui.wn wnVar4 = elVar4.H;
                                        wnVar4.W5 = null;
                                        org.telegram.ui.jk jkVar = wnVar4.Y;
                                        if (jkVar != null) {
                                            jkVar.X2 = null;
                                            jkVar.Y2 = false;
                                        }
                                        MessagePreviewParams messagePreviewParams6 = wnVar4.v5;
                                        if (messagePreviewParams6 != null) {
                                            i172 = ((org.telegram.ui.ActionBar.r2) wnVar4).currentAccount;
                                            MessageObject messageObject = wnVar4.D5;
                                            messagePreviewParams6.updateLink(i172, null, null, messageObject == wnVar4.j4 ? null : messageObject, wnVar4.B5, wnVar4.F5);
                                        }
                                        wnVar4.s8();
                                        break;
                                    case 12:
                                        ic0 ic0Var7 = this.b;
                                        MessagePreviewParams messagePreviewParams7 = ic0Var7.c0.d;
                                        if (messagePreviewParams7.hasMedia) {
                                            boolean z14 = !messagePreviewParams7.webpageSmall;
                                            messagePreviewParams7.webpageSmall = z14;
                                            ic0Var7.G.a(z14, true);
                                            ic0Var7.H.a(messagePreviewParams7.webpageSmall, true);
                                            if (ic0Var7.r.messages.size() > 0 && (message2 = ic0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                                boolean z15 = messagePreviewParams7.webpageSmall;
                                                messageMedia2.force_small_media = z15;
                                                messageMedia2.force_large_media = !z15;
                                            }
                                            if (ic0Var7.r.previewMessages.size() > 0 && (message = ic0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                                boolean z16 = messagePreviewParams7.webpageSmall;
                                                messageMedia.force_small_media = z16;
                                                messageMedia.force_large_media = !z16;
                                            }
                                            ic0Var7.i();
                                            ic0Var7.U = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        ic0 ic0Var8 = this.b;
                                        MessagePreviewParams messagePreviewParams8 = ic0Var8.c0.d;
                                        boolean z17 = messagePreviewParams8.webpageTop;
                                        messagePreviewParams8.webpageTop = !z17;
                                        ic0Var8.E.a(z17, true);
                                        if (ic0Var8.r.messages.size() > 0 && (message4 = ic0Var8.r.messages.get(0).messageOwner) != null) {
                                            message4.invert_media = messagePreviewParams8.webpageTop;
                                        }
                                        if (ic0Var8.r.previewMessages.size() > 0 && (message3 = ic0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                            message3.invert_media = messagePreviewParams8.webpageTop;
                                        }
                                        ic0Var8.i();
                                        ic0Var8.U = true;
                                        break;
                                }
                            }
                        });
                        ic0Var2 = ic0Var3;
                        viewOutlineProvider = null;
                    }
                }
            } else {
                if (!UserConfig.getInstance(oc0Var.w).isPremium()) {
                    for (int i22 = 0; i22 < messagePreviewParams.forwardMessages.messages.size(); i22++) {
                        if (messagePreviewParams.forwardMessages.messages.get(i22).type == 36) {
                            z10 = false;
                            break;
                        }
                    }
                }
                z10 = true;
                nc0 nc0Var5 = new nc0(context, R.raw.name_hide, LocaleController.getString(messagePreviewParams.multipleUsers ? R.string.ShowSenderNames : R.string.ShowSendersName), R.raw.name_show, LocaleController.getString(messagePreviewParams.multipleUsers ? R.string.HideSenderNames : R.string.HideSendersName), oc0Var.F);
                this.s.a(nc0Var5, kb1.r(-1, 48));
                if (messagePreviewParams.hasCaption) {
                    nc0 nc0Var6 = new nc0(context, R.raw.caption_hide, LocaleController.getString(R.string.ShowCaption), R.raw.caption_show, LocaleController.getString(R.string.HideCaption), oc0Var.F);
                    nc0Var6.a(messagePreviewParams.hideCaption, false);
                    this.s.a(nc0Var6, kb1.r(-1, 48));
                    nc0Var = nc0Var6;
                } else {
                    nc0Var = null;
                }
                org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(0, context, oc0Var.F, true, false);
                final int i23 = 7;
                g1Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.sb0
                    public final /* synthetic */ ic0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i172;
                        TLRPC.Message message;
                        TLRPC.MessageMedia messageMedia;
                        TLRPC.Message message2;
                        TLRPC.MessageMedia messageMedia2;
                        TLRPC.Message message3;
                        TLRPC.Message message4;
                        switch (i23) {
                            case 0:
                                ic0 ic0Var4 = this.b;
                                ic0Var4.c0.d.quote = null;
                                ic0Var4.e.f(false);
                                ic0Var4.h(false, false);
                                ic0Var4.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                ic0 ic0Var5 = this.b;
                                ac0 ac0Var2 = ic0Var5.e;
                                oc0 oc0Var2 = ic0Var5.c0;
                                if (ic0Var5.c(null) != null) {
                                    if (ac0Var2.v - ac0Var2.u <= MessagesController.getInstance(oc0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.aa aaVar = ac0Var2.W;
                                        MessageObject c11 = ic0Var5.c(aaVar != null ? ((org.telegram.ui.Cells.s1) aaVar).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams4 = oc0Var2.d;
                                        int i182 = ac0Var2.u;
                                        messagePreviewParams4.quoteStart = i182;
                                        int i192 = ac0Var2.v;
                                        messagePreviewParams4.quoteEnd = i192;
                                        messagePreviewParams4.quote = org.telegram.ui.mn.c(c11, i182, i192);
                                        oc0Var2.b();
                                        oc0Var2.a(true);
                                        break;
                                    } else {
                                        ic0Var5.g();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                ic0 ic0Var6 = this.b;
                                ac0 ac0Var3 = ic0Var6.e;
                                oc0 oc0Var3 = ic0Var6.c0;
                                MessagePreviewParams messagePreviewParams5 = oc0Var3.d;
                                int i202 = oc0Var3.w;
                                boolean z13 = oc0Var3.b;
                                if (messagePreviewParams5.quote != null && !z13) {
                                    messagePreviewParams5.quote = null;
                                    ac0Var3.f(false);
                                    ic0Var6.h(false, true);
                                    ic0Var6.l(true);
                                    break;
                                } else if (ac0Var3.v - ac0Var3.u <= MessagesController.getInstance(i202).quoteLengthMax) {
                                    MessageObject c12 = ic0Var6.c(null);
                                    if (c12 != null) {
                                        if (!ac0Var3.x()) {
                                            messagePreviewParams5.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i202).quoteLengthMax, org.telegram.ui.mn.d(c12));
                                            messagePreviewParams5.quoteEnd = min;
                                            messagePreviewParams5.quote = org.telegram.ui.mn.c(c12, messagePreviewParams5.quoteStart, min);
                                            View d = ic0Var6.d();
                                            if (d instanceof org.telegram.ui.Cells.s1) {
                                                ac0Var3.Z((org.telegram.ui.Cells.s1) d, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            }
                                            if (!z13) {
                                                ic0Var6.s.getSwipeBack().e(ic0Var6.I);
                                            }
                                            ic0Var6.h(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams5.quoteStart = ac0Var3.u;
                                            messagePreviewParams5.quoteEnd = ac0Var3.v;
                                            org.telegram.ui.Cells.aa aaVar2 = ac0Var3.W;
                                            messagePreviewParams5.quote = org.telegram.ui.mn.c(ic0Var6.c(aaVar2 != null ? ((org.telegram.ui.Cells.s1) aaVar2).getMessageObject() : null), messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            oc0Var3.b();
                                            oc0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    ic0Var6.g();
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
                                oc0 oc0Var4 = this.b.c0;
                                if (!oc0Var4.b) {
                                    org.telegram.ui.el elVar = (org.telegram.ui.el) oc0Var4;
                                    elVar.a(true);
                                    org.telegram.ui.wn wnVar = elVar.H;
                                    wnVar.D5 = null;
                                    wnVar.B5 = null;
                                    wnVar.v5.updateReply(null, null, wnVar.j6, null);
                                    wnVar.s8();
                                    break;
                                } else {
                                    org.telegram.ui.el elVar2 = (org.telegram.ui.el) oc0Var4;
                                    elVar2.a(true);
                                    org.telegram.ui.wn wnVar2 = elVar2.H;
                                    wnVar2.B5 = null;
                                    wnVar2.Rb(wnVar2.D5);
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
                                wnVar3.v5.updateForward(null, wnVar3.j6);
                                wnVar3.s8();
                                break;
                            case 10:
                                this.b.c0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.el elVar4 = (org.telegram.ui.el) this.b.c0;
                                elVar4.a(true);
                                org.telegram.ui.wn wnVar4 = elVar4.H;
                                wnVar4.W5 = null;
                                org.telegram.ui.jk jkVar = wnVar4.Y;
                                if (jkVar != null) {
                                    jkVar.X2 = null;
                                    jkVar.Y2 = false;
                                }
                                MessagePreviewParams messagePreviewParams6 = wnVar4.v5;
                                if (messagePreviewParams6 != null) {
                                    i172 = ((org.telegram.ui.ActionBar.r2) wnVar4).currentAccount;
                                    MessageObject messageObject = wnVar4.D5;
                                    messagePreviewParams6.updateLink(i172, null, null, messageObject == wnVar4.j4 ? null : messageObject, wnVar4.B5, wnVar4.F5);
                                }
                                wnVar4.s8();
                                break;
                            case 12:
                                ic0 ic0Var7 = this.b;
                                MessagePreviewParams messagePreviewParams7 = ic0Var7.c0.d;
                                if (messagePreviewParams7.hasMedia) {
                                    boolean z14 = !messagePreviewParams7.webpageSmall;
                                    messagePreviewParams7.webpageSmall = z14;
                                    ic0Var7.G.a(z14, true);
                                    ic0Var7.H.a(messagePreviewParams7.webpageSmall, true);
                                    if (ic0Var7.r.messages.size() > 0 && (message2 = ic0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z15 = messagePreviewParams7.webpageSmall;
                                        messageMedia2.force_small_media = z15;
                                        messageMedia2.force_large_media = !z15;
                                    }
                                    if (ic0Var7.r.previewMessages.size() > 0 && (message = ic0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z16 = messagePreviewParams7.webpageSmall;
                                        messageMedia.force_small_media = z16;
                                        messageMedia.force_large_media = !z16;
                                    }
                                    ic0Var7.i();
                                    ic0Var7.U = true;
                                    break;
                                }
                                break;
                            default:
                                ic0 ic0Var8 = this.b;
                                MessagePreviewParams messagePreviewParams8 = ic0Var8.c0.d;
                                boolean z17 = messagePreviewParams8.webpageTop;
                                messagePreviewParams8.webpageTop = !z17;
                                ic0Var8.E.a(z17, true);
                                if (ic0Var8.r.messages.size() > 0 && (message4 = ic0Var8.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams8.webpageTop;
                                }
                                if (ic0Var8.r.previewMessages.size() > 0 && (message3 = ic0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams8.webpageTop;
                                }
                                ic0Var8.i();
                                ic0Var8.U = true;
                                break;
                        }
                    }
                });
                g1Var3.j(LocaleController.getString(R.string.ChangeRecipient), R.drawable.msg_forward_replace, null);
                this.s.a(g1Var3, kb1.r(-1, 48));
                org.telegram.ui.ActionBar.l1 l1Var2 = new org.telegram.ui.ActionBar.l1(context, kc0Var);
                org.telegram.ui.ActionBar.f7.j(l1Var2, org.telegram.ui.ActionBar.f7.L(0.06f, org.telegram.ui.ActionBar.y6.E8), kc0Var);
                l1Var2.setTag(R.id.fit_width_tag, 1);
                this.s.a(l1Var2, kb1.r(-1, 8));
                org.telegram.ui.ActionBar.g1 g1Var4 = new org.telegram.ui.ActionBar.g1(1, context, oc0Var.F, false, false);
                g1Var4.j(LocaleController.getString(R.string.ApplyChanges), R.drawable.msg_select, null);
                final int i24 = 8;
                g1Var4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.sb0
                    public final /* synthetic */ ic0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i172;
                        TLRPC.Message message;
                        TLRPC.MessageMedia messageMedia;
                        TLRPC.Message message2;
                        TLRPC.MessageMedia messageMedia2;
                        TLRPC.Message message3;
                        TLRPC.Message message4;
                        switch (i24) {
                            case 0:
                                ic0 ic0Var4 = this.b;
                                ic0Var4.c0.d.quote = null;
                                ic0Var4.e.f(false);
                                ic0Var4.h(false, false);
                                ic0Var4.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                ic0 ic0Var5 = this.b;
                                ac0 ac0Var2 = ic0Var5.e;
                                oc0 oc0Var2 = ic0Var5.c0;
                                if (ic0Var5.c(null) != null) {
                                    if (ac0Var2.v - ac0Var2.u <= MessagesController.getInstance(oc0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.aa aaVar = ac0Var2.W;
                                        MessageObject c11 = ic0Var5.c(aaVar != null ? ((org.telegram.ui.Cells.s1) aaVar).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams4 = oc0Var2.d;
                                        int i182 = ac0Var2.u;
                                        messagePreviewParams4.quoteStart = i182;
                                        int i192 = ac0Var2.v;
                                        messagePreviewParams4.quoteEnd = i192;
                                        messagePreviewParams4.quote = org.telegram.ui.mn.c(c11, i182, i192);
                                        oc0Var2.b();
                                        oc0Var2.a(true);
                                        break;
                                    } else {
                                        ic0Var5.g();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                ic0 ic0Var6 = this.b;
                                ac0 ac0Var3 = ic0Var6.e;
                                oc0 oc0Var3 = ic0Var6.c0;
                                MessagePreviewParams messagePreviewParams5 = oc0Var3.d;
                                int i202 = oc0Var3.w;
                                boolean z13 = oc0Var3.b;
                                if (messagePreviewParams5.quote != null && !z13) {
                                    messagePreviewParams5.quote = null;
                                    ac0Var3.f(false);
                                    ic0Var6.h(false, true);
                                    ic0Var6.l(true);
                                    break;
                                } else if (ac0Var3.v - ac0Var3.u <= MessagesController.getInstance(i202).quoteLengthMax) {
                                    MessageObject c12 = ic0Var6.c(null);
                                    if (c12 != null) {
                                        if (!ac0Var3.x()) {
                                            messagePreviewParams5.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i202).quoteLengthMax, org.telegram.ui.mn.d(c12));
                                            messagePreviewParams5.quoteEnd = min;
                                            messagePreviewParams5.quote = org.telegram.ui.mn.c(c12, messagePreviewParams5.quoteStart, min);
                                            View d = ic0Var6.d();
                                            if (d instanceof org.telegram.ui.Cells.s1) {
                                                ac0Var3.Z((org.telegram.ui.Cells.s1) d, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            }
                                            if (!z13) {
                                                ic0Var6.s.getSwipeBack().e(ic0Var6.I);
                                            }
                                            ic0Var6.h(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams5.quoteStart = ac0Var3.u;
                                            messagePreviewParams5.quoteEnd = ac0Var3.v;
                                            org.telegram.ui.Cells.aa aaVar2 = ac0Var3.W;
                                            messagePreviewParams5.quote = org.telegram.ui.mn.c(ic0Var6.c(aaVar2 != null ? ((org.telegram.ui.Cells.s1) aaVar2).getMessageObject() : null), messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            oc0Var3.b();
                                            oc0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    ic0Var6.g();
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
                                oc0 oc0Var4 = this.b.c0;
                                if (!oc0Var4.b) {
                                    org.telegram.ui.el elVar = (org.telegram.ui.el) oc0Var4;
                                    elVar.a(true);
                                    org.telegram.ui.wn wnVar = elVar.H;
                                    wnVar.D5 = null;
                                    wnVar.B5 = null;
                                    wnVar.v5.updateReply(null, null, wnVar.j6, null);
                                    wnVar.s8();
                                    break;
                                } else {
                                    org.telegram.ui.el elVar2 = (org.telegram.ui.el) oc0Var4;
                                    elVar2.a(true);
                                    org.telegram.ui.wn wnVar2 = elVar2.H;
                                    wnVar2.B5 = null;
                                    wnVar2.Rb(wnVar2.D5);
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
                                wnVar3.v5.updateForward(null, wnVar3.j6);
                                wnVar3.s8();
                                break;
                            case 10:
                                this.b.c0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.el elVar4 = (org.telegram.ui.el) this.b.c0;
                                elVar4.a(true);
                                org.telegram.ui.wn wnVar4 = elVar4.H;
                                wnVar4.W5 = null;
                                org.telegram.ui.jk jkVar = wnVar4.Y;
                                if (jkVar != null) {
                                    jkVar.X2 = null;
                                    jkVar.Y2 = false;
                                }
                                MessagePreviewParams messagePreviewParams6 = wnVar4.v5;
                                if (messagePreviewParams6 != null) {
                                    i172 = ((org.telegram.ui.ActionBar.r2) wnVar4).currentAccount;
                                    MessageObject messageObject = wnVar4.D5;
                                    messagePreviewParams6.updateLink(i172, null, null, messageObject == wnVar4.j4 ? null : messageObject, wnVar4.B5, wnVar4.F5);
                                }
                                wnVar4.s8();
                                break;
                            case 12:
                                ic0 ic0Var7 = this.b;
                                MessagePreviewParams messagePreviewParams7 = ic0Var7.c0.d;
                                if (messagePreviewParams7.hasMedia) {
                                    boolean z14 = !messagePreviewParams7.webpageSmall;
                                    messagePreviewParams7.webpageSmall = z14;
                                    ic0Var7.G.a(z14, true);
                                    ic0Var7.H.a(messagePreviewParams7.webpageSmall, true);
                                    if (ic0Var7.r.messages.size() > 0 && (message2 = ic0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z15 = messagePreviewParams7.webpageSmall;
                                        messageMedia2.force_small_media = z15;
                                        messageMedia2.force_large_media = !z15;
                                    }
                                    if (ic0Var7.r.previewMessages.size() > 0 && (message = ic0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z16 = messagePreviewParams7.webpageSmall;
                                        messageMedia.force_small_media = z16;
                                        messageMedia.force_large_media = !z16;
                                    }
                                    ic0Var7.i();
                                    ic0Var7.U = true;
                                    break;
                                }
                                break;
                            default:
                                ic0 ic0Var8 = this.b;
                                MessagePreviewParams messagePreviewParams8 = ic0Var8.c0.d;
                                boolean z17 = messagePreviewParams8.webpageTop;
                                messagePreviewParams8.webpageTop = !z17;
                                ic0Var8.E.a(z17, true);
                                if (ic0Var8.r.messages.size() > 0 && (message4 = ic0Var8.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams8.webpageTop;
                                }
                                if (ic0Var8.r.previewMessages.size() > 0 && (message3 = ic0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams8.webpageTop;
                                }
                                ic0Var8.i();
                                ic0Var8.U = true;
                                break;
                        }
                    }
                });
                this.s.a(g1Var4, kb1.r(-1, 48));
                org.telegram.ui.ActionBar.g1 g1Var5 = new org.telegram.ui.ActionBar.g1(1, context, oc0Var.F, false, true);
                g1Var5.j(LocaleController.getString(R.string.DoNotForward), R.drawable.msg_delete, null);
                int i25 = org.telegram.ui.ActionBar.y6.q7;
                int i26 = org.telegram.ui.ActionBar.y6.p7;
                g1Var5.c(i25, i26);
                final int i27 = 9;
                g1Var5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.sb0
                    public final /* synthetic */ ic0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i172;
                        TLRPC.Message message;
                        TLRPC.MessageMedia messageMedia;
                        TLRPC.Message message2;
                        TLRPC.MessageMedia messageMedia2;
                        TLRPC.Message message3;
                        TLRPC.Message message4;
                        switch (i27) {
                            case 0:
                                ic0 ic0Var4 = this.b;
                                ic0Var4.c0.d.quote = null;
                                ic0Var4.e.f(false);
                                ic0Var4.h(false, false);
                                ic0Var4.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                ic0 ic0Var5 = this.b;
                                ac0 ac0Var2 = ic0Var5.e;
                                oc0 oc0Var2 = ic0Var5.c0;
                                if (ic0Var5.c(null) != null) {
                                    if (ac0Var2.v - ac0Var2.u <= MessagesController.getInstance(oc0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.aa aaVar = ac0Var2.W;
                                        MessageObject c11 = ic0Var5.c(aaVar != null ? ((org.telegram.ui.Cells.s1) aaVar).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams4 = oc0Var2.d;
                                        int i182 = ac0Var2.u;
                                        messagePreviewParams4.quoteStart = i182;
                                        int i192 = ac0Var2.v;
                                        messagePreviewParams4.quoteEnd = i192;
                                        messagePreviewParams4.quote = org.telegram.ui.mn.c(c11, i182, i192);
                                        oc0Var2.b();
                                        oc0Var2.a(true);
                                        break;
                                    } else {
                                        ic0Var5.g();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                ic0 ic0Var6 = this.b;
                                ac0 ac0Var3 = ic0Var6.e;
                                oc0 oc0Var3 = ic0Var6.c0;
                                MessagePreviewParams messagePreviewParams5 = oc0Var3.d;
                                int i202 = oc0Var3.w;
                                boolean z13 = oc0Var3.b;
                                if (messagePreviewParams5.quote != null && !z13) {
                                    messagePreviewParams5.quote = null;
                                    ac0Var3.f(false);
                                    ic0Var6.h(false, true);
                                    ic0Var6.l(true);
                                    break;
                                } else if (ac0Var3.v - ac0Var3.u <= MessagesController.getInstance(i202).quoteLengthMax) {
                                    MessageObject c12 = ic0Var6.c(null);
                                    if (c12 != null) {
                                        if (!ac0Var3.x()) {
                                            messagePreviewParams5.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i202).quoteLengthMax, org.telegram.ui.mn.d(c12));
                                            messagePreviewParams5.quoteEnd = min;
                                            messagePreviewParams5.quote = org.telegram.ui.mn.c(c12, messagePreviewParams5.quoteStart, min);
                                            View d = ic0Var6.d();
                                            if (d instanceof org.telegram.ui.Cells.s1) {
                                                ac0Var3.Z((org.telegram.ui.Cells.s1) d, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            }
                                            if (!z13) {
                                                ic0Var6.s.getSwipeBack().e(ic0Var6.I);
                                            }
                                            ic0Var6.h(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams5.quoteStart = ac0Var3.u;
                                            messagePreviewParams5.quoteEnd = ac0Var3.v;
                                            org.telegram.ui.Cells.aa aaVar2 = ac0Var3.W;
                                            messagePreviewParams5.quote = org.telegram.ui.mn.c(ic0Var6.c(aaVar2 != null ? ((org.telegram.ui.Cells.s1) aaVar2).getMessageObject() : null), messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            oc0Var3.b();
                                            oc0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    ic0Var6.g();
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
                                oc0 oc0Var4 = this.b.c0;
                                if (!oc0Var4.b) {
                                    org.telegram.ui.el elVar = (org.telegram.ui.el) oc0Var4;
                                    elVar.a(true);
                                    org.telegram.ui.wn wnVar = elVar.H;
                                    wnVar.D5 = null;
                                    wnVar.B5 = null;
                                    wnVar.v5.updateReply(null, null, wnVar.j6, null);
                                    wnVar.s8();
                                    break;
                                } else {
                                    org.telegram.ui.el elVar2 = (org.telegram.ui.el) oc0Var4;
                                    elVar2.a(true);
                                    org.telegram.ui.wn wnVar2 = elVar2.H;
                                    wnVar2.B5 = null;
                                    wnVar2.Rb(wnVar2.D5);
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
                                wnVar3.v5.updateForward(null, wnVar3.j6);
                                wnVar3.s8();
                                break;
                            case 10:
                                this.b.c0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.el elVar4 = (org.telegram.ui.el) this.b.c0;
                                elVar4.a(true);
                                org.telegram.ui.wn wnVar4 = elVar4.H;
                                wnVar4.W5 = null;
                                org.telegram.ui.jk jkVar = wnVar4.Y;
                                if (jkVar != null) {
                                    jkVar.X2 = null;
                                    jkVar.Y2 = false;
                                }
                                MessagePreviewParams messagePreviewParams6 = wnVar4.v5;
                                if (messagePreviewParams6 != null) {
                                    i172 = ((org.telegram.ui.ActionBar.r2) wnVar4).currentAccount;
                                    MessageObject messageObject = wnVar4.D5;
                                    messagePreviewParams6.updateLink(i172, null, null, messageObject == wnVar4.j4 ? null : messageObject, wnVar4.B5, wnVar4.F5);
                                }
                                wnVar4.s8();
                                break;
                            case 12:
                                ic0 ic0Var7 = this.b;
                                MessagePreviewParams messagePreviewParams7 = ic0Var7.c0.d;
                                if (messagePreviewParams7.hasMedia) {
                                    boolean z14 = !messagePreviewParams7.webpageSmall;
                                    messagePreviewParams7.webpageSmall = z14;
                                    ic0Var7.G.a(z14, true);
                                    ic0Var7.H.a(messagePreviewParams7.webpageSmall, true);
                                    if (ic0Var7.r.messages.size() > 0 && (message2 = ic0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z15 = messagePreviewParams7.webpageSmall;
                                        messageMedia2.force_small_media = z15;
                                        messageMedia2.force_large_media = !z15;
                                    }
                                    if (ic0Var7.r.previewMessages.size() > 0 && (message = ic0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z16 = messagePreviewParams7.webpageSmall;
                                        messageMedia.force_small_media = z16;
                                        messageMedia.force_large_media = !z16;
                                    }
                                    ic0Var7.i();
                                    ic0Var7.U = true;
                                    break;
                                }
                                break;
                            default:
                                ic0 ic0Var8 = this.b;
                                MessagePreviewParams messagePreviewParams8 = ic0Var8.c0.d;
                                boolean z17 = messagePreviewParams8.webpageTop;
                                messagePreviewParams8.webpageTop = !z17;
                                ic0Var8.E.a(z17, true);
                                if (ic0Var8.r.messages.size() > 0 && (message4 = ic0Var8.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams8.webpageTop;
                                }
                                if (ic0Var8.r.previewMessages.size() > 0 && (message3 = ic0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams8.webpageTop;
                                }
                                ic0Var8.i();
                                ic0Var8.U = true;
                                break;
                        }
                    }
                });
                g1Var5.h(0.12f, i26);
                this.s.a(g1Var5, kb1.r(-1, 48));
                nc0Var5.a(messagePreviewParams.hideForwardSendersName, false);
                nc0 nc0Var7 = nc0Var;
                ic0 ic0Var4 = this;
                nc0Var5.setOnClickListener(new vb0(this, z10, context, nc0Var7, nc0Var5, 0));
                ic0Var = ic0Var4;
                if (nc0Var7 != null) {
                    nc0Var7.setOnClickListener(new bi.w0(ic0Var4, nc0Var7, nc0Var5, 27));
                    ic0Var = ic0Var4;
                }
            }
            context2 = context;
            ic0Var2 = ic0Var;
            viewOutlineProvider = null;
        } else {
            if (!messages.hasText || messagePreviewParams3.isSecret) {
                r12 = 0;
                messagePreviewParams = messagePreviewParams3;
            } else {
                LinearLayout d = org.telegram.messenger.wh.d(context3, 1);
                if (z12) {
                    messagePreviewParams2 = messagePreviewParams3;
                    z11 = true;
                    linearLayout = d;
                    obj = null;
                } else {
                    messagePreviewParams2 = messagePreviewParams3;
                    ?? r92 = d;
                    obj = null;
                    org.telegram.ui.ActionBar.g1 g1Var6 = new org.telegram.ui.ActionBar.g1(0, context3, oc0Var.F, true, false);
                    g1Var6.j(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                    g1Var6.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.sb0
                        public final /* synthetic */ ic0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i172;
                            TLRPC.Message message;
                            TLRPC.MessageMedia messageMedia;
                            TLRPC.Message message2;
                            TLRPC.MessageMedia messageMedia2;
                            TLRPC.Message message3;
                            TLRPC.Message message4;
                            switch (i12) {
                                case 0:
                                    ic0 ic0Var42 = this.b;
                                    ic0Var42.c0.d.quote = null;
                                    ic0Var42.e.f(false);
                                    ic0Var42.h(false, false);
                                    ic0Var42.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    ic0 ic0Var5 = this.b;
                                    ac0 ac0Var2 = ic0Var5.e;
                                    oc0 oc0Var2 = ic0Var5.c0;
                                    if (ic0Var5.c(null) != null) {
                                        if (ac0Var2.v - ac0Var2.u <= MessagesController.getInstance(oc0Var2.w).quoteLengthMax) {
                                            org.telegram.ui.Cells.aa aaVar = ac0Var2.W;
                                            MessageObject c11 = ic0Var5.c(aaVar != null ? ((org.telegram.ui.Cells.s1) aaVar).getMessageObject() : null);
                                            MessagePreviewParams messagePreviewParams4 = oc0Var2.d;
                                            int i182 = ac0Var2.u;
                                            messagePreviewParams4.quoteStart = i182;
                                            int i192 = ac0Var2.v;
                                            messagePreviewParams4.quoteEnd = i192;
                                            messagePreviewParams4.quote = org.telegram.ui.mn.c(c11, i182, i192);
                                            oc0Var2.b();
                                            oc0Var2.a(true);
                                            break;
                                        } else {
                                            ic0Var5.g();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    ic0 ic0Var6 = this.b;
                                    ac0 ac0Var3 = ic0Var6.e;
                                    oc0 oc0Var3 = ic0Var6.c0;
                                    MessagePreviewParams messagePreviewParams5 = oc0Var3.d;
                                    int i202 = oc0Var3.w;
                                    boolean z13 = oc0Var3.b;
                                    if (messagePreviewParams5.quote != null && !z13) {
                                        messagePreviewParams5.quote = null;
                                        ac0Var3.f(false);
                                        ic0Var6.h(false, true);
                                        ic0Var6.l(true);
                                        break;
                                    } else if (ac0Var3.v - ac0Var3.u <= MessagesController.getInstance(i202).quoteLengthMax) {
                                        MessageObject c12 = ic0Var6.c(null);
                                        if (c12 != null) {
                                            if (!ac0Var3.x()) {
                                                messagePreviewParams5.quoteStart = 0;
                                                int min = Math.min(MessagesController.getInstance(i202).quoteLengthMax, org.telegram.ui.mn.d(c12));
                                                messagePreviewParams5.quoteEnd = min;
                                                messagePreviewParams5.quote = org.telegram.ui.mn.c(c12, messagePreviewParams5.quoteStart, min);
                                                View d10 = ic0Var6.d();
                                                if (d10 instanceof org.telegram.ui.Cells.s1) {
                                                    ac0Var3.Z((org.telegram.ui.Cells.s1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                }
                                                if (!z13) {
                                                    ic0Var6.s.getSwipeBack().e(ic0Var6.I);
                                                }
                                                ic0Var6.h(true, true);
                                                break;
                                            } else {
                                                messagePreviewParams5.quoteStart = ac0Var3.u;
                                                messagePreviewParams5.quoteEnd = ac0Var3.v;
                                                org.telegram.ui.Cells.aa aaVar2 = ac0Var3.W;
                                                messagePreviewParams5.quote = org.telegram.ui.mn.c(ic0Var6.c(aaVar2 != null ? ((org.telegram.ui.Cells.s1) aaVar2).getMessageObject() : null), messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                oc0Var3.b();
                                                oc0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        ic0Var6.g();
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
                                    oc0 oc0Var4 = this.b.c0;
                                    if (!oc0Var4.b) {
                                        org.telegram.ui.el elVar = (org.telegram.ui.el) oc0Var4;
                                        elVar.a(true);
                                        org.telegram.ui.wn wnVar = elVar.H;
                                        wnVar.D5 = null;
                                        wnVar.B5 = null;
                                        wnVar.v5.updateReply(null, null, wnVar.j6, null);
                                        wnVar.s8();
                                        break;
                                    } else {
                                        org.telegram.ui.el elVar2 = (org.telegram.ui.el) oc0Var4;
                                        elVar2.a(true);
                                        org.telegram.ui.wn wnVar2 = elVar2.H;
                                        wnVar2.B5 = null;
                                        wnVar2.Rb(wnVar2.D5);
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
                                    wnVar3.v5.updateForward(null, wnVar3.j6);
                                    wnVar3.s8();
                                    break;
                                case 10:
                                    this.b.c0.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.el elVar4 = (org.telegram.ui.el) this.b.c0;
                                    elVar4.a(true);
                                    org.telegram.ui.wn wnVar4 = elVar4.H;
                                    wnVar4.W5 = null;
                                    org.telegram.ui.jk jkVar = wnVar4.Y;
                                    if (jkVar != null) {
                                        jkVar.X2 = null;
                                        jkVar.Y2 = false;
                                    }
                                    MessagePreviewParams messagePreviewParams6 = wnVar4.v5;
                                    if (messagePreviewParams6 != null) {
                                        i172 = ((org.telegram.ui.ActionBar.r2) wnVar4).currentAccount;
                                        MessageObject messageObject = wnVar4.D5;
                                        messagePreviewParams6.updateLink(i172, null, null, messageObject == wnVar4.j4 ? null : messageObject, wnVar4.B5, wnVar4.F5);
                                    }
                                    wnVar4.s8();
                                    break;
                                case 12:
                                    ic0 ic0Var7 = this.b;
                                    MessagePreviewParams messagePreviewParams7 = ic0Var7.c0.d;
                                    if (messagePreviewParams7.hasMedia) {
                                        boolean z14 = !messagePreviewParams7.webpageSmall;
                                        messagePreviewParams7.webpageSmall = z14;
                                        ic0Var7.G.a(z14, true);
                                        ic0Var7.H.a(messagePreviewParams7.webpageSmall, true);
                                        if (ic0Var7.r.messages.size() > 0 && (message2 = ic0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z15 = messagePreviewParams7.webpageSmall;
                                            messageMedia2.force_small_media = z15;
                                            messageMedia2.force_large_media = !z15;
                                        }
                                        if (ic0Var7.r.previewMessages.size() > 0 && (message = ic0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                            boolean z16 = messagePreviewParams7.webpageSmall;
                                            messageMedia.force_small_media = z16;
                                            messageMedia.force_large_media = !z16;
                                        }
                                        ic0Var7.i();
                                        ic0Var7.U = true;
                                        break;
                                    }
                                    break;
                                default:
                                    ic0 ic0Var8 = this.b;
                                    MessagePreviewParams messagePreviewParams8 = ic0Var8.c0.d;
                                    boolean z17 = messagePreviewParams8.webpageTop;
                                    messagePreviewParams8.webpageTop = !z17;
                                    ic0Var8.E.a(z17, true);
                                    if (ic0Var8.r.messages.size() > 0 && (message4 = ic0Var8.r.messages.get(0).messageOwner) != null) {
                                        message4.invert_media = messagePreviewParams8.webpageTop;
                                    }
                                    if (ic0Var8.r.previewMessages.size() > 0 && (message3 = ic0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                        message3.invert_media = messagePreviewParams8.webpageTop;
                                    }
                                    ic0Var8.i();
                                    ic0Var8.U = true;
                                    break;
                            }
                        }
                    });
                    r92.addView(g1Var6, kb1.r(-1, 48));
                    org.telegram.ui.ActionBar.l1 l1Var3 = new org.telegram.ui.ActionBar.l1(context3, kc0Var);
                    org.telegram.ui.ActionBar.f7.j(l1Var3, org.telegram.ui.ActionBar.f7.L(0.06f, org.telegram.ui.ActionBar.y6.E8), kc0Var);
                    l1Var3.setTag(R.id.fit_width_tag, 1);
                    r92.addView(l1Var3, kb1.r(-1, 8));
                    org.telegram.ui.ActionBar.g1 g1Var7 = new org.telegram.ui.ActionBar.g1(0, context3, oc0Var.F, false, true);
                    g1Var7.j(LocaleController.getString(R.string.QuoteSelectedPart), R.drawable.menu_quote_specific, null);
                    z11 = true;
                    final boolean z13 = true ? 1 : 0;
                    g1Var7.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.sb0
                        public final /* synthetic */ ic0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i172;
                            TLRPC.Message message;
                            TLRPC.MessageMedia messageMedia;
                            TLRPC.Message message2;
                            TLRPC.MessageMedia messageMedia2;
                            TLRPC.Message message3;
                            TLRPC.Message message4;
                            switch (z13) {
                                case 0:
                                    ic0 ic0Var42 = this.b;
                                    ic0Var42.c0.d.quote = null;
                                    ic0Var42.e.f(false);
                                    ic0Var42.h(false, false);
                                    ic0Var42.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    ic0 ic0Var5 = this.b;
                                    ac0 ac0Var2 = ic0Var5.e;
                                    oc0 oc0Var2 = ic0Var5.c0;
                                    if (ic0Var5.c(null) != null) {
                                        if (ac0Var2.v - ac0Var2.u <= MessagesController.getInstance(oc0Var2.w).quoteLengthMax) {
                                            org.telegram.ui.Cells.aa aaVar = ac0Var2.W;
                                            MessageObject c11 = ic0Var5.c(aaVar != null ? ((org.telegram.ui.Cells.s1) aaVar).getMessageObject() : null);
                                            MessagePreviewParams messagePreviewParams4 = oc0Var2.d;
                                            int i182 = ac0Var2.u;
                                            messagePreviewParams4.quoteStart = i182;
                                            int i192 = ac0Var2.v;
                                            messagePreviewParams4.quoteEnd = i192;
                                            messagePreviewParams4.quote = org.telegram.ui.mn.c(c11, i182, i192);
                                            oc0Var2.b();
                                            oc0Var2.a(true);
                                            break;
                                        } else {
                                            ic0Var5.g();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    ic0 ic0Var6 = this.b;
                                    ac0 ac0Var3 = ic0Var6.e;
                                    oc0 oc0Var3 = ic0Var6.c0;
                                    MessagePreviewParams messagePreviewParams5 = oc0Var3.d;
                                    int i202 = oc0Var3.w;
                                    boolean z132 = oc0Var3.b;
                                    if (messagePreviewParams5.quote != null && !z132) {
                                        messagePreviewParams5.quote = null;
                                        ac0Var3.f(false);
                                        ic0Var6.h(false, true);
                                        ic0Var6.l(true);
                                        break;
                                    } else if (ac0Var3.v - ac0Var3.u <= MessagesController.getInstance(i202).quoteLengthMax) {
                                        MessageObject c12 = ic0Var6.c(null);
                                        if (c12 != null) {
                                            if (!ac0Var3.x()) {
                                                messagePreviewParams5.quoteStart = 0;
                                                int min = Math.min(MessagesController.getInstance(i202).quoteLengthMax, org.telegram.ui.mn.d(c12));
                                                messagePreviewParams5.quoteEnd = min;
                                                messagePreviewParams5.quote = org.telegram.ui.mn.c(c12, messagePreviewParams5.quoteStart, min);
                                                View d10 = ic0Var6.d();
                                                if (d10 instanceof org.telegram.ui.Cells.s1) {
                                                    ac0Var3.Z((org.telegram.ui.Cells.s1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                }
                                                if (!z132) {
                                                    ic0Var6.s.getSwipeBack().e(ic0Var6.I);
                                                }
                                                ic0Var6.h(true, true);
                                                break;
                                            } else {
                                                messagePreviewParams5.quoteStart = ac0Var3.u;
                                                messagePreviewParams5.quoteEnd = ac0Var3.v;
                                                org.telegram.ui.Cells.aa aaVar2 = ac0Var3.W;
                                                messagePreviewParams5.quote = org.telegram.ui.mn.c(ic0Var6.c(aaVar2 != null ? ((org.telegram.ui.Cells.s1) aaVar2).getMessageObject() : null), messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                oc0Var3.b();
                                                oc0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        ic0Var6.g();
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
                                    oc0 oc0Var4 = this.b.c0;
                                    if (!oc0Var4.b) {
                                        org.telegram.ui.el elVar = (org.telegram.ui.el) oc0Var4;
                                        elVar.a(true);
                                        org.telegram.ui.wn wnVar = elVar.H;
                                        wnVar.D5 = null;
                                        wnVar.B5 = null;
                                        wnVar.v5.updateReply(null, null, wnVar.j6, null);
                                        wnVar.s8();
                                        break;
                                    } else {
                                        org.telegram.ui.el elVar2 = (org.telegram.ui.el) oc0Var4;
                                        elVar2.a(true);
                                        org.telegram.ui.wn wnVar2 = elVar2.H;
                                        wnVar2.B5 = null;
                                        wnVar2.Rb(wnVar2.D5);
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
                                    wnVar3.v5.updateForward(null, wnVar3.j6);
                                    wnVar3.s8();
                                    break;
                                case 10:
                                    this.b.c0.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.el elVar4 = (org.telegram.ui.el) this.b.c0;
                                    elVar4.a(true);
                                    org.telegram.ui.wn wnVar4 = elVar4.H;
                                    wnVar4.W5 = null;
                                    org.telegram.ui.jk jkVar = wnVar4.Y;
                                    if (jkVar != null) {
                                        jkVar.X2 = null;
                                        jkVar.Y2 = false;
                                    }
                                    MessagePreviewParams messagePreviewParams6 = wnVar4.v5;
                                    if (messagePreviewParams6 != null) {
                                        i172 = ((org.telegram.ui.ActionBar.r2) wnVar4).currentAccount;
                                        MessageObject messageObject = wnVar4.D5;
                                        messagePreviewParams6.updateLink(i172, null, null, messageObject == wnVar4.j4 ? null : messageObject, wnVar4.B5, wnVar4.F5);
                                    }
                                    wnVar4.s8();
                                    break;
                                case 12:
                                    ic0 ic0Var7 = this.b;
                                    MessagePreviewParams messagePreviewParams7 = ic0Var7.c0.d;
                                    if (messagePreviewParams7.hasMedia) {
                                        boolean z14 = !messagePreviewParams7.webpageSmall;
                                        messagePreviewParams7.webpageSmall = z14;
                                        ic0Var7.G.a(z14, true);
                                        ic0Var7.H.a(messagePreviewParams7.webpageSmall, true);
                                        if (ic0Var7.r.messages.size() > 0 && (message2 = ic0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z15 = messagePreviewParams7.webpageSmall;
                                            messageMedia2.force_small_media = z15;
                                            messageMedia2.force_large_media = !z15;
                                        }
                                        if (ic0Var7.r.previewMessages.size() > 0 && (message = ic0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                            boolean z16 = messagePreviewParams7.webpageSmall;
                                            messageMedia.force_small_media = z16;
                                            messageMedia.force_large_media = !z16;
                                        }
                                        ic0Var7.i();
                                        ic0Var7.U = true;
                                        break;
                                    }
                                    break;
                                default:
                                    ic0 ic0Var8 = this.b;
                                    MessagePreviewParams messagePreviewParams8 = ic0Var8.c0.d;
                                    boolean z17 = messagePreviewParams8.webpageTop;
                                    messagePreviewParams8.webpageTop = !z17;
                                    ic0Var8.E.a(z17, true);
                                    if (ic0Var8.r.messages.size() > 0 && (message4 = ic0Var8.r.messages.get(0).messageOwner) != null) {
                                        message4.invert_media = messagePreviewParams8.webpageTop;
                                    }
                                    if (ic0Var8.r.previewMessages.size() > 0 && (message3 = ic0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                        message3.invert_media = messagePreviewParams8.webpageTop;
                                    }
                                    ic0Var8.i();
                                    ic0Var8.U = true;
                                    break;
                            }
                        }
                    });
                    r92.addView(g1Var7, kb1.r(-1, 48));
                    linearLayout = r92;
                }
                this.I = actionBarPopupWindow$ActionBarPopupWindowLayout.b(linearLayout);
                actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().setStickToRight(z11);
                ?? frameLayout2 = new FrameLayout(context3);
                messagePreviewParams = messagePreviewParams2;
                ?? r122 = obj;
                ?? zb0Var = new zb0(1, 0, context, oc0Var.F, true, false);
                this.v = zb0Var;
                zb0Var.j(LocaleController.getString(z12 ? R.string.QuoteSelectedPart : R.string.SelectSpecificQuote), R.drawable.menu_select_quote, r122);
                ?? zb0Var2 = new zb0(1, 1, context, oc0Var.F, true, false);
                context3 = context;
                this.w = zb0Var2;
                zb0Var2.j(LocaleController.getString(R.string.ClearQuote), R.drawable.menu_quote_delete, r122);
                int i28 = org.telegram.ui.ActionBar.y6.I5;
                org.telegram.ui.Cells.y Z2 = org.telegram.ui.ActionBar.y6.Z(org.telegram.ui.ActionBar.y6.w0(i28, kc0Var), 6, 0);
                org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i28);
                frameLayout2.setBackground(Z2);
                org.telegram.ui.ActionBar.f7.k(frameLayout2, Z2, r122, N2, kc0Var);
                final int i29 = 2;
                frameLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.sb0
                    public final /* synthetic */ ic0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i172;
                        TLRPC.Message message;
                        TLRPC.MessageMedia messageMedia;
                        TLRPC.Message message2;
                        TLRPC.MessageMedia messageMedia2;
                        TLRPC.Message message3;
                        TLRPC.Message message4;
                        switch (i29) {
                            case 0:
                                ic0 ic0Var42 = this.b;
                                ic0Var42.c0.d.quote = null;
                                ic0Var42.e.f(false);
                                ic0Var42.h(false, false);
                                ic0Var42.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                ic0 ic0Var5 = this.b;
                                ac0 ac0Var2 = ic0Var5.e;
                                oc0 oc0Var2 = ic0Var5.c0;
                                if (ic0Var5.c(null) != null) {
                                    if (ac0Var2.v - ac0Var2.u <= MessagesController.getInstance(oc0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.aa aaVar = ac0Var2.W;
                                        MessageObject c11 = ic0Var5.c(aaVar != null ? ((org.telegram.ui.Cells.s1) aaVar).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams4 = oc0Var2.d;
                                        int i182 = ac0Var2.u;
                                        messagePreviewParams4.quoteStart = i182;
                                        int i192 = ac0Var2.v;
                                        messagePreviewParams4.quoteEnd = i192;
                                        messagePreviewParams4.quote = org.telegram.ui.mn.c(c11, i182, i192);
                                        oc0Var2.b();
                                        oc0Var2.a(true);
                                        break;
                                    } else {
                                        ic0Var5.g();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                ic0 ic0Var6 = this.b;
                                ac0 ac0Var3 = ic0Var6.e;
                                oc0 oc0Var3 = ic0Var6.c0;
                                MessagePreviewParams messagePreviewParams5 = oc0Var3.d;
                                int i202 = oc0Var3.w;
                                boolean z132 = oc0Var3.b;
                                if (messagePreviewParams5.quote != null && !z132) {
                                    messagePreviewParams5.quote = null;
                                    ac0Var3.f(false);
                                    ic0Var6.h(false, true);
                                    ic0Var6.l(true);
                                    break;
                                } else if (ac0Var3.v - ac0Var3.u <= MessagesController.getInstance(i202).quoteLengthMax) {
                                    MessageObject c12 = ic0Var6.c(null);
                                    if (c12 != null) {
                                        if (!ac0Var3.x()) {
                                            messagePreviewParams5.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i202).quoteLengthMax, org.telegram.ui.mn.d(c12));
                                            messagePreviewParams5.quoteEnd = min;
                                            messagePreviewParams5.quote = org.telegram.ui.mn.c(c12, messagePreviewParams5.quoteStart, min);
                                            View d10 = ic0Var6.d();
                                            if (d10 instanceof org.telegram.ui.Cells.s1) {
                                                ac0Var3.Z((org.telegram.ui.Cells.s1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            }
                                            if (!z132) {
                                                ic0Var6.s.getSwipeBack().e(ic0Var6.I);
                                            }
                                            ic0Var6.h(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams5.quoteStart = ac0Var3.u;
                                            messagePreviewParams5.quoteEnd = ac0Var3.v;
                                            org.telegram.ui.Cells.aa aaVar2 = ac0Var3.W;
                                            messagePreviewParams5.quote = org.telegram.ui.mn.c(ic0Var6.c(aaVar2 != null ? ((org.telegram.ui.Cells.s1) aaVar2).getMessageObject() : null), messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            oc0Var3.b();
                                            oc0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    ic0Var6.g();
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
                                oc0 oc0Var4 = this.b.c0;
                                if (!oc0Var4.b) {
                                    org.telegram.ui.el elVar = (org.telegram.ui.el) oc0Var4;
                                    elVar.a(true);
                                    org.telegram.ui.wn wnVar = elVar.H;
                                    wnVar.D5 = null;
                                    wnVar.B5 = null;
                                    wnVar.v5.updateReply(null, null, wnVar.j6, null);
                                    wnVar.s8();
                                    break;
                                } else {
                                    org.telegram.ui.el elVar2 = (org.telegram.ui.el) oc0Var4;
                                    elVar2.a(true);
                                    org.telegram.ui.wn wnVar2 = elVar2.H;
                                    wnVar2.B5 = null;
                                    wnVar2.Rb(wnVar2.D5);
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
                                wnVar3.v5.updateForward(null, wnVar3.j6);
                                wnVar3.s8();
                                break;
                            case 10:
                                this.b.c0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.el elVar4 = (org.telegram.ui.el) this.b.c0;
                                elVar4.a(true);
                                org.telegram.ui.wn wnVar4 = elVar4.H;
                                wnVar4.W5 = null;
                                org.telegram.ui.jk jkVar = wnVar4.Y;
                                if (jkVar != null) {
                                    jkVar.X2 = null;
                                    jkVar.Y2 = false;
                                }
                                MessagePreviewParams messagePreviewParams6 = wnVar4.v5;
                                if (messagePreviewParams6 != null) {
                                    i172 = ((org.telegram.ui.ActionBar.r2) wnVar4).currentAccount;
                                    MessageObject messageObject = wnVar4.D5;
                                    messagePreviewParams6.updateLink(i172, null, null, messageObject == wnVar4.j4 ? null : messageObject, wnVar4.B5, wnVar4.F5);
                                }
                                wnVar4.s8();
                                break;
                            case 12:
                                ic0 ic0Var7 = this.b;
                                MessagePreviewParams messagePreviewParams7 = ic0Var7.c0.d;
                                if (messagePreviewParams7.hasMedia) {
                                    boolean z14 = !messagePreviewParams7.webpageSmall;
                                    messagePreviewParams7.webpageSmall = z14;
                                    ic0Var7.G.a(z14, true);
                                    ic0Var7.H.a(messagePreviewParams7.webpageSmall, true);
                                    if (ic0Var7.r.messages.size() > 0 && (message2 = ic0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z15 = messagePreviewParams7.webpageSmall;
                                        messageMedia2.force_small_media = z15;
                                        messageMedia2.force_large_media = !z15;
                                    }
                                    if (ic0Var7.r.previewMessages.size() > 0 && (message = ic0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z16 = messagePreviewParams7.webpageSmall;
                                        messageMedia.force_small_media = z16;
                                        messageMedia.force_large_media = !z16;
                                    }
                                    ic0Var7.i();
                                    ic0Var7.U = true;
                                    break;
                                }
                                break;
                            default:
                                ic0 ic0Var8 = this.b;
                                MessagePreviewParams messagePreviewParams8 = ic0Var8.c0.d;
                                boolean z17 = messagePreviewParams8.webpageTop;
                                messagePreviewParams8.webpageTop = !z17;
                                ic0Var8.E.a(z17, true);
                                if (ic0Var8.r.messages.size() > 0 && (message4 = ic0Var8.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams8.webpageTop;
                                }
                                if (ic0Var8.r.previewMessages.size() > 0 && (message3 = ic0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams8.webpageTop;
                                }
                                ic0Var8.i();
                                ic0Var8.U = true;
                                break;
                        }
                    }
                });
                frameLayout2.addView(zb0Var, kb1.g(48.0f, -1));
                frameLayout2.addView(zb0Var2, kb1.g(48.0f, -1));
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout2, kb1.r(-1, 48));
                r12 = r122;
            }
            if (!messagePreviewParams.monoforum && !messagePreviewParams.noforwards && !messagePreviewParams.hasSecretMessages) {
                ?? frameLayout3 = new FrameLayout(context3);
                ?? g1Var8 = new org.telegram.ui.ActionBar.g1(1, context3, oc0Var.F, false, false);
                this.x = g1Var8;
                g1Var8.j(LocaleController.getString(R.string.ReplyToAnotherChat), R.drawable.msg_forward_replace, r12);
                final int i30 = 3;
                g1Var8.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.sb0
                    public final /* synthetic */ ic0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i172;
                        TLRPC.Message message;
                        TLRPC.MessageMedia messageMedia;
                        TLRPC.Message message2;
                        TLRPC.MessageMedia messageMedia2;
                        TLRPC.Message message3;
                        TLRPC.Message message4;
                        switch (i30) {
                            case 0:
                                ic0 ic0Var42 = this.b;
                                ic0Var42.c0.d.quote = null;
                                ic0Var42.e.f(false);
                                ic0Var42.h(false, false);
                                ic0Var42.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                ic0 ic0Var5 = this.b;
                                ac0 ac0Var2 = ic0Var5.e;
                                oc0 oc0Var2 = ic0Var5.c0;
                                if (ic0Var5.c(null) != null) {
                                    if (ac0Var2.v - ac0Var2.u <= MessagesController.getInstance(oc0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.aa aaVar = ac0Var2.W;
                                        MessageObject c11 = ic0Var5.c(aaVar != null ? ((org.telegram.ui.Cells.s1) aaVar).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams4 = oc0Var2.d;
                                        int i182 = ac0Var2.u;
                                        messagePreviewParams4.quoteStart = i182;
                                        int i192 = ac0Var2.v;
                                        messagePreviewParams4.quoteEnd = i192;
                                        messagePreviewParams4.quote = org.telegram.ui.mn.c(c11, i182, i192);
                                        oc0Var2.b();
                                        oc0Var2.a(true);
                                        break;
                                    } else {
                                        ic0Var5.g();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                ic0 ic0Var6 = this.b;
                                ac0 ac0Var3 = ic0Var6.e;
                                oc0 oc0Var3 = ic0Var6.c0;
                                MessagePreviewParams messagePreviewParams5 = oc0Var3.d;
                                int i202 = oc0Var3.w;
                                boolean z132 = oc0Var3.b;
                                if (messagePreviewParams5.quote != null && !z132) {
                                    messagePreviewParams5.quote = null;
                                    ac0Var3.f(false);
                                    ic0Var6.h(false, true);
                                    ic0Var6.l(true);
                                    break;
                                } else if (ac0Var3.v - ac0Var3.u <= MessagesController.getInstance(i202).quoteLengthMax) {
                                    MessageObject c12 = ic0Var6.c(null);
                                    if (c12 != null) {
                                        if (!ac0Var3.x()) {
                                            messagePreviewParams5.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i202).quoteLengthMax, org.telegram.ui.mn.d(c12));
                                            messagePreviewParams5.quoteEnd = min;
                                            messagePreviewParams5.quote = org.telegram.ui.mn.c(c12, messagePreviewParams5.quoteStart, min);
                                            View d10 = ic0Var6.d();
                                            if (d10 instanceof org.telegram.ui.Cells.s1) {
                                                ac0Var3.Z((org.telegram.ui.Cells.s1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            }
                                            if (!z132) {
                                                ic0Var6.s.getSwipeBack().e(ic0Var6.I);
                                            }
                                            ic0Var6.h(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams5.quoteStart = ac0Var3.u;
                                            messagePreviewParams5.quoteEnd = ac0Var3.v;
                                            org.telegram.ui.Cells.aa aaVar2 = ac0Var3.W;
                                            messagePreviewParams5.quote = org.telegram.ui.mn.c(ic0Var6.c(aaVar2 != null ? ((org.telegram.ui.Cells.s1) aaVar2).getMessageObject() : null), messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            oc0Var3.b();
                                            oc0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    ic0Var6.g();
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
                                oc0 oc0Var4 = this.b.c0;
                                if (!oc0Var4.b) {
                                    org.telegram.ui.el elVar = (org.telegram.ui.el) oc0Var4;
                                    elVar.a(true);
                                    org.telegram.ui.wn wnVar = elVar.H;
                                    wnVar.D5 = null;
                                    wnVar.B5 = null;
                                    wnVar.v5.updateReply(null, null, wnVar.j6, null);
                                    wnVar.s8();
                                    break;
                                } else {
                                    org.telegram.ui.el elVar2 = (org.telegram.ui.el) oc0Var4;
                                    elVar2.a(true);
                                    org.telegram.ui.wn wnVar2 = elVar2.H;
                                    wnVar2.B5 = null;
                                    wnVar2.Rb(wnVar2.D5);
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
                                wnVar3.v5.updateForward(null, wnVar3.j6);
                                wnVar3.s8();
                                break;
                            case 10:
                                this.b.c0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.el elVar4 = (org.telegram.ui.el) this.b.c0;
                                elVar4.a(true);
                                org.telegram.ui.wn wnVar4 = elVar4.H;
                                wnVar4.W5 = null;
                                org.telegram.ui.jk jkVar = wnVar4.Y;
                                if (jkVar != null) {
                                    jkVar.X2 = null;
                                    jkVar.Y2 = false;
                                }
                                MessagePreviewParams messagePreviewParams6 = wnVar4.v5;
                                if (messagePreviewParams6 != null) {
                                    i172 = ((org.telegram.ui.ActionBar.r2) wnVar4).currentAccount;
                                    MessageObject messageObject = wnVar4.D5;
                                    messagePreviewParams6.updateLink(i172, null, null, messageObject == wnVar4.j4 ? null : messageObject, wnVar4.B5, wnVar4.F5);
                                }
                                wnVar4.s8();
                                break;
                            case 12:
                                ic0 ic0Var7 = this.b;
                                MessagePreviewParams messagePreviewParams7 = ic0Var7.c0.d;
                                if (messagePreviewParams7.hasMedia) {
                                    boolean z14 = !messagePreviewParams7.webpageSmall;
                                    messagePreviewParams7.webpageSmall = z14;
                                    ic0Var7.G.a(z14, true);
                                    ic0Var7.H.a(messagePreviewParams7.webpageSmall, true);
                                    if (ic0Var7.r.messages.size() > 0 && (message2 = ic0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z15 = messagePreviewParams7.webpageSmall;
                                        messageMedia2.force_small_media = z15;
                                        messageMedia2.force_large_media = !z15;
                                    }
                                    if (ic0Var7.r.previewMessages.size() > 0 && (message = ic0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z16 = messagePreviewParams7.webpageSmall;
                                        messageMedia.force_small_media = z16;
                                        messageMedia.force_large_media = !z16;
                                    }
                                    ic0Var7.i();
                                    ic0Var7.U = true;
                                    break;
                                }
                                break;
                            default:
                                ic0 ic0Var8 = this.b;
                                MessagePreviewParams messagePreviewParams8 = ic0Var8.c0.d;
                                boolean z17 = messagePreviewParams8.webpageTop;
                                messagePreviewParams8.webpageTop = !z17;
                                ic0Var8.E.a(z17, true);
                                if (ic0Var8.r.messages.size() > 0 && (message4 = ic0Var8.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams8.webpageTop;
                                }
                                if (ic0Var8.r.previewMessages.size() > 0 && (message3 = ic0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams8.webpageTop;
                                }
                                ic0Var8.i();
                                ic0Var8.U = true;
                                break;
                        }
                    }
                });
                context3 = context;
                ?? g1Var9 = new org.telegram.ui.ActionBar.g1(1, context3, oc0Var.F, false, false);
                this.y = g1Var9;
                g1Var9.j(LocaleController.getString(R.string.QuoteToAnotherChat), R.drawable.msg_forward_replace, r12);
                final int i31 = 4;
                g1Var9.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.sb0
                    public final /* synthetic */ ic0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i172;
                        TLRPC.Message message;
                        TLRPC.MessageMedia messageMedia;
                        TLRPC.Message message2;
                        TLRPC.MessageMedia messageMedia2;
                        TLRPC.Message message3;
                        TLRPC.Message message4;
                        switch (i31) {
                            case 0:
                                ic0 ic0Var42 = this.b;
                                ic0Var42.c0.d.quote = null;
                                ic0Var42.e.f(false);
                                ic0Var42.h(false, false);
                                ic0Var42.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                ic0 ic0Var5 = this.b;
                                ac0 ac0Var2 = ic0Var5.e;
                                oc0 oc0Var2 = ic0Var5.c0;
                                if (ic0Var5.c(null) != null) {
                                    if (ac0Var2.v - ac0Var2.u <= MessagesController.getInstance(oc0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.aa aaVar = ac0Var2.W;
                                        MessageObject c11 = ic0Var5.c(aaVar != null ? ((org.telegram.ui.Cells.s1) aaVar).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams4 = oc0Var2.d;
                                        int i182 = ac0Var2.u;
                                        messagePreviewParams4.quoteStart = i182;
                                        int i192 = ac0Var2.v;
                                        messagePreviewParams4.quoteEnd = i192;
                                        messagePreviewParams4.quote = org.telegram.ui.mn.c(c11, i182, i192);
                                        oc0Var2.b();
                                        oc0Var2.a(true);
                                        break;
                                    } else {
                                        ic0Var5.g();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                ic0 ic0Var6 = this.b;
                                ac0 ac0Var3 = ic0Var6.e;
                                oc0 oc0Var3 = ic0Var6.c0;
                                MessagePreviewParams messagePreviewParams5 = oc0Var3.d;
                                int i202 = oc0Var3.w;
                                boolean z132 = oc0Var3.b;
                                if (messagePreviewParams5.quote != null && !z132) {
                                    messagePreviewParams5.quote = null;
                                    ac0Var3.f(false);
                                    ic0Var6.h(false, true);
                                    ic0Var6.l(true);
                                    break;
                                } else if (ac0Var3.v - ac0Var3.u <= MessagesController.getInstance(i202).quoteLengthMax) {
                                    MessageObject c12 = ic0Var6.c(null);
                                    if (c12 != null) {
                                        if (!ac0Var3.x()) {
                                            messagePreviewParams5.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i202).quoteLengthMax, org.telegram.ui.mn.d(c12));
                                            messagePreviewParams5.quoteEnd = min;
                                            messagePreviewParams5.quote = org.telegram.ui.mn.c(c12, messagePreviewParams5.quoteStart, min);
                                            View d10 = ic0Var6.d();
                                            if (d10 instanceof org.telegram.ui.Cells.s1) {
                                                ac0Var3.Z((org.telegram.ui.Cells.s1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            }
                                            if (!z132) {
                                                ic0Var6.s.getSwipeBack().e(ic0Var6.I);
                                            }
                                            ic0Var6.h(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams5.quoteStart = ac0Var3.u;
                                            messagePreviewParams5.quoteEnd = ac0Var3.v;
                                            org.telegram.ui.Cells.aa aaVar2 = ac0Var3.W;
                                            messagePreviewParams5.quote = org.telegram.ui.mn.c(ic0Var6.c(aaVar2 != null ? ((org.telegram.ui.Cells.s1) aaVar2).getMessageObject() : null), messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            oc0Var3.b();
                                            oc0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    ic0Var6.g();
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
                                oc0 oc0Var4 = this.b.c0;
                                if (!oc0Var4.b) {
                                    org.telegram.ui.el elVar = (org.telegram.ui.el) oc0Var4;
                                    elVar.a(true);
                                    org.telegram.ui.wn wnVar = elVar.H;
                                    wnVar.D5 = null;
                                    wnVar.B5 = null;
                                    wnVar.v5.updateReply(null, null, wnVar.j6, null);
                                    wnVar.s8();
                                    break;
                                } else {
                                    org.telegram.ui.el elVar2 = (org.telegram.ui.el) oc0Var4;
                                    elVar2.a(true);
                                    org.telegram.ui.wn wnVar2 = elVar2.H;
                                    wnVar2.B5 = null;
                                    wnVar2.Rb(wnVar2.D5);
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
                                wnVar3.v5.updateForward(null, wnVar3.j6);
                                wnVar3.s8();
                                break;
                            case 10:
                                this.b.c0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.el elVar4 = (org.telegram.ui.el) this.b.c0;
                                elVar4.a(true);
                                org.telegram.ui.wn wnVar4 = elVar4.H;
                                wnVar4.W5 = null;
                                org.telegram.ui.jk jkVar = wnVar4.Y;
                                if (jkVar != null) {
                                    jkVar.X2 = null;
                                    jkVar.Y2 = false;
                                }
                                MessagePreviewParams messagePreviewParams6 = wnVar4.v5;
                                if (messagePreviewParams6 != null) {
                                    i172 = ((org.telegram.ui.ActionBar.r2) wnVar4).currentAccount;
                                    MessageObject messageObject = wnVar4.D5;
                                    messagePreviewParams6.updateLink(i172, null, null, messageObject == wnVar4.j4 ? null : messageObject, wnVar4.B5, wnVar4.F5);
                                }
                                wnVar4.s8();
                                break;
                            case 12:
                                ic0 ic0Var7 = this.b;
                                MessagePreviewParams messagePreviewParams7 = ic0Var7.c0.d;
                                if (messagePreviewParams7.hasMedia) {
                                    boolean z14 = !messagePreviewParams7.webpageSmall;
                                    messagePreviewParams7.webpageSmall = z14;
                                    ic0Var7.G.a(z14, true);
                                    ic0Var7.H.a(messagePreviewParams7.webpageSmall, true);
                                    if (ic0Var7.r.messages.size() > 0 && (message2 = ic0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z15 = messagePreviewParams7.webpageSmall;
                                        messageMedia2.force_small_media = z15;
                                        messageMedia2.force_large_media = !z15;
                                    }
                                    if (ic0Var7.r.previewMessages.size() > 0 && (message = ic0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z16 = messagePreviewParams7.webpageSmall;
                                        messageMedia.force_small_media = z16;
                                        messageMedia.force_large_media = !z16;
                                    }
                                    ic0Var7.i();
                                    ic0Var7.U = true;
                                    break;
                                }
                                break;
                            default:
                                ic0 ic0Var8 = this.b;
                                MessagePreviewParams messagePreviewParams8 = ic0Var8.c0.d;
                                boolean z17 = messagePreviewParams8.webpageTop;
                                messagePreviewParams8.webpageTop = !z17;
                                ic0Var8.E.a(z17, true);
                                if (ic0Var8.r.messages.size() > 0 && (message4 = ic0Var8.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams8.webpageTop;
                                }
                                if (ic0Var8.r.previewMessages.size() > 0 && (message3 = ic0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams8.webpageTop;
                                }
                                ic0Var8.i();
                                ic0Var8.U = true;
                                break;
                        }
                    }
                });
                frameLayout3.addView(g1Var9, kb1.g(48.0f, -1));
                frameLayout3.addView(g1Var8, kb1.g(48.0f, -1));
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout3, kb1.r(-1, 48));
            }
            if (!messagePreviewParams.noforwards && !messagePreviewParams.hasSecretMessages) {
                org.telegram.ui.ActionBar.l1 l1Var4 = new org.telegram.ui.ActionBar.l1(context3, kc0Var);
                org.telegram.ui.ActionBar.f7.j(l1Var4, org.telegram.ui.ActionBar.f7.L(0.06f, org.telegram.ui.ActionBar.y6.E8), kc0Var);
                l1Var4.setTag(R.id.fit_width_tag, 1);
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(l1Var4, kb1.r(-1, 8));
            }
            h(messagePreviewParams.quote != null, false);
            ?? g1Var10 = new org.telegram.ui.ActionBar.g1(1, context3, oc0Var.F, false, false);
            g1Var10.j(LocaleController.getString(R.string.ApplyChanges), R.drawable.msg_select, r12);
            final int i32 = 5;
            g1Var10.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.sb0
                public final /* synthetic */ ic0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i172;
                    TLRPC.Message message;
                    TLRPC.MessageMedia messageMedia;
                    TLRPC.Message message2;
                    TLRPC.MessageMedia messageMedia2;
                    TLRPC.Message message3;
                    TLRPC.Message message4;
                    switch (i32) {
                        case 0:
                            ic0 ic0Var42 = this.b;
                            ic0Var42.c0.d.quote = null;
                            ic0Var42.e.f(false);
                            ic0Var42.h(false, false);
                            ic0Var42.s.getSwipeBack().b(true);
                            break;
                        case 1:
                            ic0 ic0Var5 = this.b;
                            ac0 ac0Var2 = ic0Var5.e;
                            oc0 oc0Var2 = ic0Var5.c0;
                            if (ic0Var5.c(null) != null) {
                                if (ac0Var2.v - ac0Var2.u <= MessagesController.getInstance(oc0Var2.w).quoteLengthMax) {
                                    org.telegram.ui.Cells.aa aaVar = ac0Var2.W;
                                    MessageObject c11 = ic0Var5.c(aaVar != null ? ((org.telegram.ui.Cells.s1) aaVar).getMessageObject() : null);
                                    MessagePreviewParams messagePreviewParams4 = oc0Var2.d;
                                    int i182 = ac0Var2.u;
                                    messagePreviewParams4.quoteStart = i182;
                                    int i192 = ac0Var2.v;
                                    messagePreviewParams4.quoteEnd = i192;
                                    messagePreviewParams4.quote = org.telegram.ui.mn.c(c11, i182, i192);
                                    oc0Var2.b();
                                    oc0Var2.a(true);
                                    break;
                                } else {
                                    ic0Var5.g();
                                    break;
                                }
                            }
                            break;
                        case 2:
                            ic0 ic0Var6 = this.b;
                            ac0 ac0Var3 = ic0Var6.e;
                            oc0 oc0Var3 = ic0Var6.c0;
                            MessagePreviewParams messagePreviewParams5 = oc0Var3.d;
                            int i202 = oc0Var3.w;
                            boolean z132 = oc0Var3.b;
                            if (messagePreviewParams5.quote != null && !z132) {
                                messagePreviewParams5.quote = null;
                                ac0Var3.f(false);
                                ic0Var6.h(false, true);
                                ic0Var6.l(true);
                                break;
                            } else if (ac0Var3.v - ac0Var3.u <= MessagesController.getInstance(i202).quoteLengthMax) {
                                MessageObject c12 = ic0Var6.c(null);
                                if (c12 != null) {
                                    if (!ac0Var3.x()) {
                                        messagePreviewParams5.quoteStart = 0;
                                        int min = Math.min(MessagesController.getInstance(i202).quoteLengthMax, org.telegram.ui.mn.d(c12));
                                        messagePreviewParams5.quoteEnd = min;
                                        messagePreviewParams5.quote = org.telegram.ui.mn.c(c12, messagePreviewParams5.quoteStart, min);
                                        View d10 = ic0Var6.d();
                                        if (d10 instanceof org.telegram.ui.Cells.s1) {
                                            ac0Var3.Z((org.telegram.ui.Cells.s1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                        }
                                        if (!z132) {
                                            ic0Var6.s.getSwipeBack().e(ic0Var6.I);
                                        }
                                        ic0Var6.h(true, true);
                                        break;
                                    } else {
                                        messagePreviewParams5.quoteStart = ac0Var3.u;
                                        messagePreviewParams5.quoteEnd = ac0Var3.v;
                                        org.telegram.ui.Cells.aa aaVar2 = ac0Var3.W;
                                        messagePreviewParams5.quote = org.telegram.ui.mn.c(ic0Var6.c(aaVar2 != null ? ((org.telegram.ui.Cells.s1) aaVar2).getMessageObject() : null), messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                        oc0Var3.b();
                                        oc0Var3.a(true);
                                        break;
                                    }
                                }
                            } else {
                                ic0Var6.g();
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
                            oc0 oc0Var4 = this.b.c0;
                            if (!oc0Var4.b) {
                                org.telegram.ui.el elVar = (org.telegram.ui.el) oc0Var4;
                                elVar.a(true);
                                org.telegram.ui.wn wnVar = elVar.H;
                                wnVar.D5 = null;
                                wnVar.B5 = null;
                                wnVar.v5.updateReply(null, null, wnVar.j6, null);
                                wnVar.s8();
                                break;
                            } else {
                                org.telegram.ui.el elVar2 = (org.telegram.ui.el) oc0Var4;
                                elVar2.a(true);
                                org.telegram.ui.wn wnVar2 = elVar2.H;
                                wnVar2.B5 = null;
                                wnVar2.Rb(wnVar2.D5);
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
                            wnVar3.v5.updateForward(null, wnVar3.j6);
                            wnVar3.s8();
                            break;
                        case 10:
                            this.b.c0.a(true);
                            break;
                        case 11:
                            org.telegram.ui.el elVar4 = (org.telegram.ui.el) this.b.c0;
                            elVar4.a(true);
                            org.telegram.ui.wn wnVar4 = elVar4.H;
                            wnVar4.W5 = null;
                            org.telegram.ui.jk jkVar = wnVar4.Y;
                            if (jkVar != null) {
                                jkVar.X2 = null;
                                jkVar.Y2 = false;
                            }
                            MessagePreviewParams messagePreviewParams6 = wnVar4.v5;
                            if (messagePreviewParams6 != null) {
                                i172 = ((org.telegram.ui.ActionBar.r2) wnVar4).currentAccount;
                                MessageObject messageObject = wnVar4.D5;
                                messagePreviewParams6.updateLink(i172, null, null, messageObject == wnVar4.j4 ? null : messageObject, wnVar4.B5, wnVar4.F5);
                            }
                            wnVar4.s8();
                            break;
                        case 12:
                            ic0 ic0Var7 = this.b;
                            MessagePreviewParams messagePreviewParams7 = ic0Var7.c0.d;
                            if (messagePreviewParams7.hasMedia) {
                                boolean z14 = !messagePreviewParams7.webpageSmall;
                                messagePreviewParams7.webpageSmall = z14;
                                ic0Var7.G.a(z14, true);
                                ic0Var7.H.a(messagePreviewParams7.webpageSmall, true);
                                if (ic0Var7.r.messages.size() > 0 && (message2 = ic0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                    boolean z15 = messagePreviewParams7.webpageSmall;
                                    messageMedia2.force_small_media = z15;
                                    messageMedia2.force_large_media = !z15;
                                }
                                if (ic0Var7.r.previewMessages.size() > 0 && (message = ic0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                    boolean z16 = messagePreviewParams7.webpageSmall;
                                    messageMedia.force_small_media = z16;
                                    messageMedia.force_large_media = !z16;
                                }
                                ic0Var7.i();
                                ic0Var7.U = true;
                                break;
                            }
                            break;
                        default:
                            ic0 ic0Var8 = this.b;
                            MessagePreviewParams messagePreviewParams8 = ic0Var8.c0.d;
                            boolean z17 = messagePreviewParams8.webpageTop;
                            messagePreviewParams8.webpageTop = !z17;
                            ic0Var8.E.a(z17, true);
                            if (ic0Var8.r.messages.size() > 0 && (message4 = ic0Var8.r.messages.get(0).messageOwner) != null) {
                                message4.invert_media = messagePreviewParams8.webpageTop;
                            }
                            if (ic0Var8.r.previewMessages.size() > 0 && (message3 = ic0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                message3.invert_media = messagePreviewParams8.webpageTop;
                            }
                            ic0Var8.i();
                            ic0Var8.U = true;
                            break;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var10, kb1.r(-1, 48));
            ?? g1Var11 = new org.telegram.ui.ActionBar.g1(1, context, oc0Var.F, false, true);
            g1Var11.j(LocaleController.getString(z12 ? R.string.DoNotQuote : R.string.DoNotReply), R.drawable.msg_delete, r12);
            int i33 = org.telegram.ui.ActionBar.y6.q7;
            int i34 = org.telegram.ui.ActionBar.y6.p7;
            g1Var11.c(i33, i34);
            g1Var11.h(0.12f, i34);
            final int i35 = 6;
            g1Var11.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.sb0
                public final /* synthetic */ ic0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i172;
                    TLRPC.Message message;
                    TLRPC.MessageMedia messageMedia;
                    TLRPC.Message message2;
                    TLRPC.MessageMedia messageMedia2;
                    TLRPC.Message message3;
                    TLRPC.Message message4;
                    switch (i35) {
                        case 0:
                            ic0 ic0Var42 = this.b;
                            ic0Var42.c0.d.quote = null;
                            ic0Var42.e.f(false);
                            ic0Var42.h(false, false);
                            ic0Var42.s.getSwipeBack().b(true);
                            break;
                        case 1:
                            ic0 ic0Var5 = this.b;
                            ac0 ac0Var2 = ic0Var5.e;
                            oc0 oc0Var2 = ic0Var5.c0;
                            if (ic0Var5.c(null) != null) {
                                if (ac0Var2.v - ac0Var2.u <= MessagesController.getInstance(oc0Var2.w).quoteLengthMax) {
                                    org.telegram.ui.Cells.aa aaVar = ac0Var2.W;
                                    MessageObject c11 = ic0Var5.c(aaVar != null ? ((org.telegram.ui.Cells.s1) aaVar).getMessageObject() : null);
                                    MessagePreviewParams messagePreviewParams4 = oc0Var2.d;
                                    int i182 = ac0Var2.u;
                                    messagePreviewParams4.quoteStart = i182;
                                    int i192 = ac0Var2.v;
                                    messagePreviewParams4.quoteEnd = i192;
                                    messagePreviewParams4.quote = org.telegram.ui.mn.c(c11, i182, i192);
                                    oc0Var2.b();
                                    oc0Var2.a(true);
                                    break;
                                } else {
                                    ic0Var5.g();
                                    break;
                                }
                            }
                            break;
                        case 2:
                            ic0 ic0Var6 = this.b;
                            ac0 ac0Var3 = ic0Var6.e;
                            oc0 oc0Var3 = ic0Var6.c0;
                            MessagePreviewParams messagePreviewParams5 = oc0Var3.d;
                            int i202 = oc0Var3.w;
                            boolean z132 = oc0Var3.b;
                            if (messagePreviewParams5.quote != null && !z132) {
                                messagePreviewParams5.quote = null;
                                ac0Var3.f(false);
                                ic0Var6.h(false, true);
                                ic0Var6.l(true);
                                break;
                            } else if (ac0Var3.v - ac0Var3.u <= MessagesController.getInstance(i202).quoteLengthMax) {
                                MessageObject c12 = ic0Var6.c(null);
                                if (c12 != null) {
                                    if (!ac0Var3.x()) {
                                        messagePreviewParams5.quoteStart = 0;
                                        int min = Math.min(MessagesController.getInstance(i202).quoteLengthMax, org.telegram.ui.mn.d(c12));
                                        messagePreviewParams5.quoteEnd = min;
                                        messagePreviewParams5.quote = org.telegram.ui.mn.c(c12, messagePreviewParams5.quoteStart, min);
                                        View d10 = ic0Var6.d();
                                        if (d10 instanceof org.telegram.ui.Cells.s1) {
                                            ac0Var3.Z((org.telegram.ui.Cells.s1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                        }
                                        if (!z132) {
                                            ic0Var6.s.getSwipeBack().e(ic0Var6.I);
                                        }
                                        ic0Var6.h(true, true);
                                        break;
                                    } else {
                                        messagePreviewParams5.quoteStart = ac0Var3.u;
                                        messagePreviewParams5.quoteEnd = ac0Var3.v;
                                        org.telegram.ui.Cells.aa aaVar2 = ac0Var3.W;
                                        messagePreviewParams5.quote = org.telegram.ui.mn.c(ic0Var6.c(aaVar2 != null ? ((org.telegram.ui.Cells.s1) aaVar2).getMessageObject() : null), messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                        oc0Var3.b();
                                        oc0Var3.a(true);
                                        break;
                                    }
                                }
                            } else {
                                ic0Var6.g();
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
                            oc0 oc0Var4 = this.b.c0;
                            if (!oc0Var4.b) {
                                org.telegram.ui.el elVar = (org.telegram.ui.el) oc0Var4;
                                elVar.a(true);
                                org.telegram.ui.wn wnVar = elVar.H;
                                wnVar.D5 = null;
                                wnVar.B5 = null;
                                wnVar.v5.updateReply(null, null, wnVar.j6, null);
                                wnVar.s8();
                                break;
                            } else {
                                org.telegram.ui.el elVar2 = (org.telegram.ui.el) oc0Var4;
                                elVar2.a(true);
                                org.telegram.ui.wn wnVar2 = elVar2.H;
                                wnVar2.B5 = null;
                                wnVar2.Rb(wnVar2.D5);
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
                            wnVar3.v5.updateForward(null, wnVar3.j6);
                            wnVar3.s8();
                            break;
                        case 10:
                            this.b.c0.a(true);
                            break;
                        case 11:
                            org.telegram.ui.el elVar4 = (org.telegram.ui.el) this.b.c0;
                            elVar4.a(true);
                            org.telegram.ui.wn wnVar4 = elVar4.H;
                            wnVar4.W5 = null;
                            org.telegram.ui.jk jkVar = wnVar4.Y;
                            if (jkVar != null) {
                                jkVar.X2 = null;
                                jkVar.Y2 = false;
                            }
                            MessagePreviewParams messagePreviewParams6 = wnVar4.v5;
                            if (messagePreviewParams6 != null) {
                                i172 = ((org.telegram.ui.ActionBar.r2) wnVar4).currentAccount;
                                MessageObject messageObject = wnVar4.D5;
                                messagePreviewParams6.updateLink(i172, null, null, messageObject == wnVar4.j4 ? null : messageObject, wnVar4.B5, wnVar4.F5);
                            }
                            wnVar4.s8();
                            break;
                        case 12:
                            ic0 ic0Var7 = this.b;
                            MessagePreviewParams messagePreviewParams7 = ic0Var7.c0.d;
                            if (messagePreviewParams7.hasMedia) {
                                boolean z14 = !messagePreviewParams7.webpageSmall;
                                messagePreviewParams7.webpageSmall = z14;
                                ic0Var7.G.a(z14, true);
                                ic0Var7.H.a(messagePreviewParams7.webpageSmall, true);
                                if (ic0Var7.r.messages.size() > 0 && (message2 = ic0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                    boolean z15 = messagePreviewParams7.webpageSmall;
                                    messageMedia2.force_small_media = z15;
                                    messageMedia2.force_large_media = !z15;
                                }
                                if (ic0Var7.r.previewMessages.size() > 0 && (message = ic0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                    boolean z16 = messagePreviewParams7.webpageSmall;
                                    messageMedia.force_small_media = z16;
                                    messageMedia.force_large_media = !z16;
                                }
                                ic0Var7.i();
                                ic0Var7.U = true;
                                break;
                            }
                            break;
                        default:
                            ic0 ic0Var8 = this.b;
                            MessagePreviewParams messagePreviewParams8 = ic0Var8.c0.d;
                            boolean z17 = messagePreviewParams8.webpageTop;
                            messagePreviewParams8.webpageTop = !z17;
                            ic0Var8.E.a(z17, true);
                            if (ic0Var8.r.messages.size() > 0 && (message4 = ic0Var8.r.messages.get(0).messageOwner) != null) {
                                message4.invert_media = messagePreviewParams8.webpageTop;
                            }
                            if (ic0Var8.r.previewMessages.size() > 0 && (message3 = ic0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                message3.invert_media = messagePreviewParams8.webpageTop;
                            }
                            ic0Var8.i();
                            ic0Var8.U = true;
                            break;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var11, kb1.r(-1, 48));
            context2 = context;
            ic0Var2 = this;
            viewOutlineProvider = r12;
        }
        int i36 = ic0Var2.a;
        if (i36 == 1) {
            ic0Var2.r = messagePreviewParams.forwardMessages;
        } else if (i36 == 0) {
            ic0Var2.r = messagePreviewParams.replyMessage;
        } else if (i36 == 2) {
            ic0Var2.r = messagePreviewParams.linkMessage;
        }
        org.telegram.ui.Cells.ea n10 = ic0Var2.e.n(context2);
        ic0Var2.d = n10;
        n10.setElevation(AndroidUtilities.dp(8.0f));
        n10.setOutlineProvider(viewOutlineProvider);
        if (n10.getParent() instanceof ViewGroup) {
            ((ViewGroup) n10.getParent()).removeView(n10);
        }
        ic0Var2.addView(n10, kb1.h(-1, -1.0f, 51, 0.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / AndroidUtilities.density, 0.0f, 0.0f));
        ic0Var2.e.S(ic0Var2.f);
    }

    public static MessageObject.GroupedMessages a(ic0 ic0Var, MessageObject messageObject) {
        if (messageObject.getGroupId() == 0) {
            return null;
        }
        MessageObject.GroupedMessages groupedMessages = ic0Var.r.groupedMessagesMap.get(messageObject.getGroupId());
        if (groupedMessages == null || (groupedMessages.messages.size() > 1 && groupedMessages.getPosition(messageObject) != null)) {
            return groupedMessages;
        }
        return null;
    }

    public static void b(ic0 ic0Var, org.telegram.ui.Cells.s1 s1Var) {
        CharacterStyle characterStyle;
        TLRPC.WebPage webPage;
        if (ic0Var.a == 2) {
            MessagePreviewParams messagePreviewParams = ic0Var.c0.d;
            if (!messagePreviewParams.singleLink && (characterStyle = messagePreviewParams.currentLink) != null && (webPage = messagePreviewParams.webpage) != null && !(webPage instanceof TLRPC.TL_webPagePending)) {
                s1Var.S3(characterStyle);
                return;
            }
        }
        s1Var.S3(null);
    }

    public final MessageObject c(MessageObject messageObject) {
        MessageObject.GroupedMessages valueAt;
        oc0 oc0Var = this.c0;
        MessagePreviewParams.Messages messages = oc0Var.d.replyMessage;
        if (messages == null) {
            return null;
        }
        LongSparseArray<MessageObject.GroupedMessages> longSparseArray = messages.groupedMessagesMap;
        if (longSparseArray == null || longSparseArray.size() <= 0 || (valueAt = oc0Var.d.replyMessage.groupedMessagesMap.valueAt(0)) == null) {
            return oc0Var.d.replyMessage.messages.get(0);
        }
        if (valueAt.isDocuments) {
            if (messageObject != null) {
                return messageObject;
            }
            org.telegram.ui.mn mnVar = oc0Var.d.quote;
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
                bc0 bc0Var = this.f;
                if (i10 >= bc0Var.getChildCount()) {
                    break;
                }
                View childAt = bc0Var.getChildAt(i10);
                org.telegram.ui.Cells.s4 s4Var = (org.telegram.ui.Cells.s4) childAt;
                if (s4Var.getMessageObject() != null && (s4Var.getMessageObject() == c10 || s4Var.getMessageObject().getId() == c10.getId())) {
                    break;
                }
                i10++;
            }
        }
        return null;
    }

    public final boolean e(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject c10;
        if (s1Var == null || s1Var.getMessageObject() == null || (c10 = c(null)) == null) {
            return false;
        }
        return s1Var.getMessageObject() == c10 || s1Var.getMessageObject().getId() == c10.getId();
    }

    public final void f(float f7, int i10) {
        boolean z10 = this.c0.v;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        rb0 rb0Var = this.c;
        org.telegram.ui.a9 a9Var = this.b;
        if (z10) {
            rb0Var.setTranslationY(0.0f);
            a9Var.invalidateOutline();
            a9Var.setTranslationY(0.0f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(0.0f);
        } else {
            rb0Var.setTranslationY(i10);
            a9Var.invalidateOutline();
            a9Var.setTranslationY(f7);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((f7 + a9Var.getMeasuredHeight()) - AndroidUtilities.dp(2.0f));
        }
        float x9 = a9Var.getX();
        org.telegram.ui.Cells.ea eaVar = this.d;
        eaVar.setTranslationX(x9);
        eaVar.setTranslationY(a9Var.getY());
    }

    public final void g() {
        oc0 oc0Var = this.c0;
        new wc(oc0Var, oc0Var.F).M(LocaleController.getString(R.string.QuoteMaxError), LocaleController.getString(R.string.QuoteMaxErrorMessage), R.raw.error).j();
    }

    public final void h(boolean z10, boolean z11) {
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
        org.telegram.ui.ActionBar.g1 g1Var = this.y;
        org.telegram.ui.ActionBar.g1 g1Var2 = this.x;
        zb0 zb0Var = this.w;
        zb0 zb0Var2 = this.v;
        if (!z11) {
            if (zb0Var2 != null) {
                zb0Var2.setAlpha(!z10 ? 1.0f : 0.0f);
                zb0Var2.setVisibility(!z10 ? 0 : 4);
            }
            if (zb0Var != null) {
                zb0Var.setAlpha(z10 ? 1.0f : 0.0f);
                zb0Var.setVisibility(z10 ? 0 : 4);
            }
            if (g1Var2 != null) {
                g1Var2.setAlpha(!z10 ? 1.0f : 0.0f);
                g1Var2.setVisibility(!z10 ? 0 : 4);
            }
            if (g1Var != null) {
                g1Var.setAlpha(z10 ? 1.0f : 0.0f);
                g1Var.setVisibility(z10 ? 0 : 4);
                return;
            }
            return;
        }
        this.P = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        if (zb0Var2 != null) {
            zb0Var2.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(zb0Var2, (Property<zb0, Float>) property, !z10 ? 1.0f : 0.0f));
        }
        if (zb0Var != null) {
            zb0Var.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(zb0Var, (Property<zb0, Float>) property, z10 ? 1.0f : 0.0f));
        }
        if (g1Var2 != null) {
            g1Var2.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(g1Var2, (Property<org.telegram.ui.ActionBar.g1, Float>) property, !z10 ? 1.0f : 0.0f));
        }
        if (g1Var != null) {
            g1Var.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(g1Var, (Property<org.telegram.ui.ActionBar.g1, Float>) property, z10 ? 1.0f : 0.0f));
        }
        this.P.playTogether(arrayList);
        this.P.setDuration(360L);
        this.P.setInterpolator(ds.h);
        this.P.addListener(new org.telegram.ui.lo(16, this, z10));
        this.P.start();
    }

    public final void i() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        oc0 oc0Var = this.c0;
        MessagePreviewParams messagePreviewParams = oc0Var.d;
        dc0 dc0Var = this.h;
        if (dc0Var.k()) {
            this.V = true;
            return;
        }
        for (int i10 = 0; i10 < this.r.previewMessages.size(); i10++) {
            MessageObject messageObject = this.r.previewMessages.get(i10);
            messageObject.forceUpdate = true;
            messageObject.sendAsPeer = oc0Var.a;
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
            dc0Var.V(this.r.groupedMessagesMap.valueAt(i12));
        }
        this.n.q(0, this.r.previewMessages.size());
    }

    public final void j() {
        int i10 = this.R;
        float f7 = this.S;
        oc0 oc0Var = this.c0;
        boolean z10 = oc0Var.v;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        bc0 bc0Var = this.f;
        if (z10) {
            this.S = 0.0f;
            this.R = 0;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(AndroidUtilities.dp(8.0f) + bc0Var.getMeasuredWidth());
        } else {
            int measuredHeight = bc0Var.getMeasuredHeight();
            int i11 = 0;
            for (int i12 = 0; i12 < bc0Var.getChildCount(); i12++) {
                View childAt = bc0Var.getChildAt(i12);
                if (RecyclerView.R(childAt) != -1) {
                    measuredHeight = Math.min(measuredHeight, childAt.getTop());
                    i11++;
                }
            }
            MessagePreviewParams.Messages messages = this.r;
            if (messages == null || i11 == 0 || i11 > messages.previewMessages.size()) {
                this.R = 0;
            } else {
                int c10 = org.telegram.messenger.t.c(4.0f, measuredHeight, 0);
                this.R = c10;
                this.R = Math.min(((bc0Var.getMeasuredHeight() - this.R) + c10) - ((int) ((((AndroidUtilities.displaySize.y - (Build.VERSION.SDK_INT >= 35 ? AndroidUtilities.navigationBarHeight : 0)) * 0.8f) - this.W) - AndroidUtilities.dp(8.0f))), this.R);
            }
            float B = c3.h0.B(getMeasuredHeight() - AndroidUtilities.dp(16.0f), (this.b.getMeasuredHeight() - this.R) + (this.W - AndroidUtilities.dp(8.0f)), 2.0f, AndroidUtilities.dp(8.0f)) - this.R;
            this.S = B;
            if (B > AndroidUtilities.dp(8.0f)) {
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
                f(f10, i13);
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = oc0Var.h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        oc0Var.h = ofFloat;
        ofFloat.addUpdateListener(new zj(this, i10, f7, 1));
        oc0Var.h.setDuration(250L);
        oc0Var.h.setInterpolator(mi.m.V);
        oc0Var.h.addListener(new i10(this, 6));
        AndroidUtilities.runOnUIThread(oc0Var.y, 50L);
        this.T = i10;
        f(f7, i10);
    }

    public final void k() {
        MessageObject messageObject;
        oc0 oc0Var = this.c0;
        MessagePreviewParams messagePreviewParams = oc0Var.d;
        if (this.a == 0) {
            ac0 ac0Var = this.e;
            if (ac0Var.v - ac0Var.u > MessagesController.getInstance(oc0Var.w).quoteLengthMax) {
                return;
            }
            org.telegram.ui.Cells.aa aaVar = ac0Var.W;
            MessageObject c10 = c(aaVar != null ? ((org.telegram.ui.Cells.s1) aaVar).getMessageObject() : null);
            if (messagePreviewParams.quote != null && ac0Var.x()) {
                messagePreviewParams.quoteStart = ac0Var.u;
                messagePreviewParams.quoteEnd = ac0Var.v;
                if (c10 != null) {
                    org.telegram.ui.mn mnVar = messagePreviewParams.quote;
                    if (mnVar.m || (messageObject = mnVar.a) == null || messageObject.getId() != c10.getId()) {
                        messagePreviewParams.quote = org.telegram.ui.mn.c(c10, messagePreviewParams.quoteStart, messagePreviewParams.quoteEnd);
                        oc0Var.b();
                    }
                }
            }
            ac0Var.f(false);
        }
    }

    public final void l(boolean z10) {
        oc0 oc0Var = this.c0;
        TLRPC.User user = oc0Var.n;
        MessagePreviewParams messagePreviewParams = oc0Var.d;
        TLRPC.Chat chat = oc0Var.r;
        rb0 rb0Var = this.c;
        int i10 = this.a;
        if (i10 == 1) {
            MessagePreviewParams.Messages messages = messagePreviewParams.forwardMessages;
            rb0Var.b(LocaleController.formatPluralString("PreviewForwardMessagesCount", messages == null ? 0 : messages.selectedIds.size(), new Object[0]), z10);
            rb0Var.a(!messagePreviewParams.hasSenders ? messagePreviewParams.willSeeSenders ? user != null ? LocaleController.formatString("ForwardPreviewSendersNameVisible", R.string.ForwardPreviewSendersNameVisible, ContactsController.formatName(user.first_name, user.last_name)) : (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.ForwardPreviewSendersNameVisibleGroup) : LocaleController.getString(R.string.ForwardPreviewSendersNameVisibleChannel) : user != null ? LocaleController.formatString("ForwardPreviewSendersNameVisible", R.string.ForwardPreviewSendersNameVisible, ContactsController.formatName(user.first_name, user.last_name)) : (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.ForwardPreviewSendersNameHiddenGroup) : LocaleController.getString(R.string.ForwardPreviewSendersNameHiddenChannel) : !messagePreviewParams.hideForwardSendersName ? user != null ? LocaleController.formatString("ForwardPreviewSendersNameVisible", R.string.ForwardPreviewSendersNameVisible, ContactsController.formatName(user.first_name, user.last_name)) : (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.ForwardPreviewSendersNameVisibleGroup) : LocaleController.getString(R.string.ForwardPreviewSendersNameVisibleChannel) : user != null ? LocaleController.formatString("ForwardPreviewSendersNameHidden", R.string.ForwardPreviewSendersNameHidden, ContactsController.formatName(user.first_name, user.last_name)) : (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.ForwardPreviewSendersNameHiddenGroup) : LocaleController.getString(R.string.ForwardPreviewSendersNameHiddenChannel), z10);
        } else {
            if (i10 != 0) {
                if (i10 == 2) {
                    rb0Var.b(LocaleController.getString(R.string.MessageOptionsLinkTitle), z10);
                    rb0Var.a(LocaleController.getString(R.string.MessageOptionsLinkSubtitle), z10);
                    return;
                }
                return;
            }
            if (messagePreviewParams.quote == null || !messagePreviewParams.replyMessage.hasText) {
                rb0Var.b(LocaleController.getString(R.string.MessageOptionsReplyTitle), z10);
                rb0Var.a(messagePreviewParams.replyMessage.hasText ? LocaleController.getString(R.string.MessageOptionsReplySubtitle) : "", z10);
            } else {
                rb0Var.b(LocaleController.getString(R.string.PreviewQuoteUpdate), z10);
                rb0Var.a(LocaleController.getString(R.string.PreviewQuoteUpdateSubtitle), z10);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.a == 0) {
            AndroidUtilities.forEachViews((RecyclerView) this.f, (Utilities.Callback<View>) new b3(this, 7));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k();
        this.b0 = true;
        this.K = true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        j();
        this.K = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10 = View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i11);
        oc0 oc0Var = this.c0;
        oc0Var.v = z10;
        this.W = 0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(i10, makeMeasureSpec);
        int i12 = this.W;
        int measuredHeight = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
        Rect rect = this.Q;
        this.W = Math.max(i12, measuredHeight + rect.top + rect.bottom);
        ((ViewGroup.MarginLayoutParams) this.f.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        boolean z11 = oc0Var.v;
        org.telegram.ui.a9 a9Var = this.b;
        if (z11) {
            a9Var.getLayoutParams().height = -1;
            ((ViewGroup.MarginLayoutParams) a9Var.getLayoutParams()).topMargin = AndroidUtilities.dp(8.0f);
            ((ViewGroup.MarginLayoutParams) a9Var.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
            a9Var.getLayoutParams().width = (int) Math.min(View.MeasureSpec.getSize(i10), Math.max(AndroidUtilities.dp(340.0f), View.MeasureSpec.getSize(i10) * 0.6f));
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = -1;
        } else {
            ((ViewGroup.MarginLayoutParams) a9Var.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) a9Var.getLayoutParams()).bottomMargin = 0;
            a9Var.getLayoutParams().height = (View.MeasureSpec.getSize(i11) - AndroidUtilities.dp(6.0f)) - this.W;
            if (a9Var.getLayoutParams().height < View.MeasureSpec.getSize(i11) * 0.5f) {
                a9Var.getLayoutParams().height = (int) (View.MeasureSpec.getSize(i11) * 0.5f);
            }
            a9Var.getLayoutParams().width = -1;
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = View.MeasureSpec.getSize(i11) - a9Var.getLayoutParams().height;
        }
        int size = (View.MeasureSpec.getSize(i11) + View.MeasureSpec.getSize(i10)) << 16;
        if (this.a0 != size) {
            for (int i13 = 0; i13 < this.r.previewMessages.size(); i13++) {
                MessageObject messageObject = this.r.previewMessages.get(i13);
                messageObject.parentWidth = oc0Var.v ? a9Var.getLayoutParams().width : View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(16.0f);
                messageObject.resetLayout();
                messageObject.forceUpdate = true;
                hc0 hc0Var = this.n;
                if (hc0Var != null) {
                    hc0Var.l();
                }
            }
            this.K = true;
        }
        this.a0 = size;
        super.onMeasure(i10, i11);
    }
}
