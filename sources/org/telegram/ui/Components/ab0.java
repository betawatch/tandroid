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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ab0 extends FrameLayout {
    public final fb0 A;
    public final FrameLayout B;
    public final fb0 C;
    public final fb0 D;
    public final int E;
    public final ChatMessageSharedResources F;
    public boolean G;
    public int H;
    public int I;
    public boolean J;
    public boolean K;
    public AnimatorSet L;
    public final Rect M;
    public int N;
    public float O;
    public int P;
    public boolean Q;
    public boolean R;
    public int S;
    public int T;
    public boolean U;
    public final /* synthetic */ gb0 V;
    public final int a;
    public final gh.q4 b;
    public final ag.y1 c;
    public final org.telegram.ui.Cells.v9 d;
    public final sa0 e;
    public final ta0 f;
    public final va0 h;
    public final za0 n;
    public MessagePreviewParams.Messages r;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout s;
    public final ra0 v;
    public final ra0 w;
    public final org.telegram.ui.ActionBar.f1 x;
    public final org.telegram.ui.ActionBar.f1 y;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v6, types: [android.view.View, org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout] */
    /* JADX WARN: Type inference failed for: r38v0, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout, java.lang.Object, org.telegram.ui.Components.ab0] */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.view.View, android.view.ViewGroup, gh.q4, org.telegram.ui.Components.zu0] */
    /* JADX WARN: Type inference failed for: r3v6, types: [jg.a] */
    /* JADX WARN: Type inference failed for: r8v19, types: [android.view.ViewGroup] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ab0(gb0 gb0Var, Context context, int i10) {
        super(r4);
        MessagePreviewParams messagePreviewParams;
        final ab0 ab0Var;
        Context context2;
        boolean z10;
        fb0 fb0Var;
        fb0 fb0Var2;
        MessagePreviewParams.Messages messages;
        int i11;
        LinearLayout linearLayout;
        MessagePreviewParams messagePreviewParams2;
        boolean z11;
        Context context3 = context;
        this.V = gb0Var;
        int i12 = 1;
        this.G = true;
        this.H = -1;
        this.I = -1;
        final int i13 = 0;
        this.J = false;
        this.M = new Rect();
        this.Q = false;
        this.U = true;
        this.F = new ChatMessageSharedResources(context3);
        this.a = i10;
        int i14 = 3;
        setOnTouchListener(new jr(this, i14));
        ?? q4Var = new gh.q4(this, context3, 2);
        this.b = q4Var;
        cb0 cb0Var = gb0Var.B;
        boolean z12 = gb0Var.b;
        MessagePreviewParams messagePreviewParams3 = gb0Var.d;
        Drawable d = ((org.telegram.ui.pn) cb0Var).d();
        if (((org.telegram.ui.pn) cb0Var).f == null) {
            int i15 = org.telegram.ui.ActionBar.g6.a;
        }
        q4Var.V(d);
        q4Var.setOccupyStatusBar(false);
        q4Var.setOutlineProvider(new lg.b(this, i14));
        q4Var.setClipToOutline(true);
        q4Var.setElevation(AndroidUtilities.dp(4.0f));
        ag.y1 y1Var = new ag.y1(context3, 13, cb0Var);
        this.c = y1Var;
        y1Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.s8, cb0Var));
        sa0 sa0Var = new sa0(this);
        this.e = sa0Var;
        sa0Var.D = new jh.h2(this, i14);
        ta0 ta0Var = new ta0(this, context3, cb0Var);
        this.f = ta0Var;
        va0 va0Var = new va0(this, ta0Var, cb0Var);
        this.h = va0Var;
        ta0Var.setItemAnimator(va0Var);
        ta0Var.setOnScrollListener(new xm(this, 7));
        ta0Var.setOnItemClickListener(new wa0(this));
        za0 za0Var = new za0(this);
        this.n = za0Var;
        ta0Var.setAdapter(za0Var);
        ta0Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        oa0 oa0Var = new oa0(this);
        oa0Var.O = new pa0(this);
        ta0Var.setClipToPadding(false);
        ta0Var.setLayoutManager(oa0Var);
        ta0Var.i(new qa0());
        q4Var.addView(ta0Var);
        addView(q4Var, h7.z5.d(-1, 400.0f, 0, 8.0f, 0.0f, 8.0f, 0.0f));
        q4Var.addView(y1Var, h7.z5.c(-2.0f, -1));
        ?? actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert2, 1, getContext(), cb0Var);
        this.s = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().setOnForegroundOpenFinished(new na0(this, i12));
        lg.d c10 = gb0Var.C.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, false);
        c10.n(ng.c.j(cb0Var));
        c10.o(AndroidUtilities.dp(8.0f));
        c10.h.e = true;
        c10.p(AndroidUtilities.dp(12.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c10);
        addView(actionBarPopupWindow$ActionBarPopupWindowLayout, h7.z5.c(-2.0f, -2));
        if (i10 != 0 || (messages = messagePreviewParams3.replyMessage) == null) {
            messagePreviewParams = messagePreviewParams3;
            if (i10 != 1 || messagePreviewParams.forwardMessages == null) {
                ab0Var = this;
                if (i10 == 2 && messagePreviewParams.linkMessage != null) {
                    fb0 fb0Var3 = new fb0(context, R.raw.position_below, LocaleController.getString(R.string.LinkAbove), R.raw.position_above, LocaleController.getString(R.string.LinkBelow), gb0Var.B);
                    ab0Var.A = fb0Var3;
                    fb0Var3.a(!messagePreviewParams.webpageTop, false);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(fb0Var3, h7.z5.n(-1, 48));
                    FrameLayout frameLayout = new FrameLayout(context);
                    ab0Var.B = frameLayout;
                    frameLayout.setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.I5, cb0Var), 0, 0));
                    fb0 fb0Var4 = new fb0(context, R.raw.media_shrink, LocaleController.getString(R.string.LinkMediaLarger), R.raw.media_enlarge, LocaleController.getString(R.string.LinkMediaSmaller), gb0Var.B);
                    ab0Var.C = fb0Var4;
                    fb0Var4.setBackground(null);
                    fb0Var4.setVisibility(messagePreviewParams.isVideo ? 4 : 0);
                    frameLayout.addView(fb0Var4, h7.z5.n(-1, 48));
                    fb0 fb0Var5 = new fb0(context, R.raw.media_shrink, LocaleController.getString(R.string.LinkVideoLarger), R.raw.media_enlarge, LocaleController.getString(R.string.LinkVideoSmaller), gb0Var.B);
                    ab0Var.D = fb0Var5;
                    fb0Var5.setBackground(null);
                    fb0Var5.setVisibility(!messagePreviewParams.isVideo ? 4 : 0);
                    frameLayout.setAlpha(messagePreviewParams.hasMedia ? 1.0f : 0.5f);
                    frameLayout.addView(fb0Var5, h7.z5.n(-1, 48));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, h7.z5.n(-1, 48));
                    frameLayout.setVisibility((!messagePreviewParams.singleLink || messagePreviewParams.hasMedia) ? 0 : 8);
                    fb0Var4.a(messagePreviewParams.webpageSmall, false);
                    fb0Var5.a(messagePreviewParams.webpageSmall, false);
                    org.telegram.ui.ActionBar.k1 k1Var = new org.telegram.ui.ActionBar.k1(context, cb0Var);
                    k1Var.setColor(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, cb0Var)));
                    k1Var.setTag(R.id.fit_width_tag, 1);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(k1Var, h7.z5.n(-1, 8));
                    org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(1, context, gb0Var.B, false, false);
                    f1Var.g(LocaleController.getString(R.string.ApplyChanges), R.drawable.msg_select, null);
                    final int i16 = 10;
                    f1Var.setOnClickListener(new View.OnClickListener(ab0Var) { // from class: org.telegram.ui.Components.ka0
                        public final /* synthetic */ ab0 b;

                        {
                            this.b = ab0Var;
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
                                    ab0 ab0Var2 = this.b;
                                    ab0Var2.V.d.quote = null;
                                    ab0Var2.e.f(false);
                                    ab0Var2.g(false, false);
                                    ab0Var2.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    ab0 ab0Var3 = this.b;
                                    sa0 sa0Var2 = ab0Var3.e;
                                    gb0 gb0Var2 = ab0Var3.V;
                                    if (ab0Var3.c(null) != null) {
                                        if (sa0Var2.v - sa0Var2.u <= MessagesController.getInstance(gb0Var2.w).quoteLengthMax) {
                                            org.telegram.ui.Cells.r9 r9Var = sa0Var2.W;
                                            MessageObject c11 = ab0Var3.c(r9Var != null ? ((org.telegram.ui.Cells.s1) r9Var).getMessageObject() : null);
                                            MessagePreviewParams messagePreviewParams4 = gb0Var2.d;
                                            int i18 = sa0Var2.u;
                                            messagePreviewParams4.quoteStart = i18;
                                            int i19 = sa0Var2.v;
                                            messagePreviewParams4.quoteEnd = i19;
                                            messagePreviewParams4.quote = org.telegram.ui.hn.b(i18, i19, c11);
                                            gb0Var2.b();
                                            gb0Var2.a(true);
                                            break;
                                        } else {
                                            ab0Var3.f();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    ab0 ab0Var4 = this.b;
                                    sa0 sa0Var3 = ab0Var4.e;
                                    gb0 gb0Var3 = ab0Var4.V;
                                    MessagePreviewParams messagePreviewParams5 = gb0Var3.d;
                                    int i20 = gb0Var3.w;
                                    boolean z13 = gb0Var3.b;
                                    if (messagePreviewParams5.quote != null && !z13) {
                                        messagePreviewParams5.quote = null;
                                        sa0Var3.f(false);
                                        ab0Var4.g(false, true);
                                        ab0Var4.k(true);
                                        break;
                                    } else if (sa0Var3.v - sa0Var3.u <= MessagesController.getInstance(i20).quoteLengthMax) {
                                        MessageObject c12 = ab0Var4.c(null);
                                        if (c12 != null) {
                                            if (!sa0Var3.y()) {
                                                messagePreviewParams5.quoteStart = 0;
                                                int min = Math.min(MessagesController.getInstance(i20).quoteLengthMax, c12.messageOwner.message.length());
                                                messagePreviewParams5.quoteEnd = min;
                                                messagePreviewParams5.quote = org.telegram.ui.hn.b(messagePreviewParams5.quoteStart, min, c12);
                                                View d10 = ab0Var4.d();
                                                if (d10 instanceof org.telegram.ui.Cells.s1) {
                                                    sa0Var3.a0((org.telegram.ui.Cells.s1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                }
                                                if (!z13) {
                                                    ab0Var4.s.getSwipeBack().e(ab0Var4.E);
                                                }
                                                ab0Var4.g(true, true);
                                                break;
                                            } else {
                                                messagePreviewParams5.quoteStart = sa0Var3.u;
                                                messagePreviewParams5.quoteEnd = sa0Var3.v;
                                                org.telegram.ui.Cells.r9 r9Var2 = sa0Var3.W;
                                                messagePreviewParams5.quote = org.telegram.ui.hn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, ab0Var4.c(r9Var2 != null ? ((org.telegram.ui.Cells.s1) r9Var2).getMessageObject() : null));
                                                gb0Var3.b();
                                                gb0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        ab0Var4.f();
                                        break;
                                    }
                                    break;
                                case 3:
                                    this.b.V.c(false);
                                    break;
                                case 4:
                                    this.b.V.c(false);
                                    break;
                                case 5:
                                    this.b.V.a(true);
                                    break;
                                case 6:
                                    gb0 gb0Var4 = this.b.V;
                                    if (!gb0Var4.b) {
                                        org.telegram.ui.yk ykVar = (org.telegram.ui.yk) gb0Var4;
                                        ykVar.a(true);
                                        org.telegram.ui.rn rnVar = ykVar.D;
                                        rnVar.j5 = null;
                                        rnVar.h5 = null;
                                        rnVar.b5.updateReply(null, null, rnVar.P5, null);
                                        rnVar.j8();
                                        break;
                                    } else {
                                        org.telegram.ui.yk ykVar2 = (org.telegram.ui.yk) gb0Var4;
                                        ykVar2.a(true);
                                        org.telegram.ui.rn rnVar2 = ykVar2.D;
                                        rnVar2.h5 = null;
                                        rnVar2.Bb(rnVar2.j5);
                                        break;
                                    }
                                case 7:
                                    this.b.V.c(true);
                                    break;
                                case 8:
                                    this.b.V.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.yk ykVar3 = (org.telegram.ui.yk) this.b.V;
                                    ykVar3.a(true);
                                    org.telegram.ui.rn rnVar3 = ykVar3.D;
                                    rnVar3.b5.updateForward(null, rnVar3.P5);
                                    rnVar3.j8();
                                    break;
                                case 10:
                                    this.b.V.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.yk ykVar4 = (org.telegram.ui.yk) this.b.V;
                                    ykVar4.a(true);
                                    org.telegram.ui.rn rnVar4 = ykVar4.D;
                                    rnVar4.C5 = null;
                                    org.telegram.ui.ck ckVar = rnVar4.U;
                                    if (ckVar != null) {
                                        ckVar.S2 = null;
                                        ckVar.T2 = false;
                                    }
                                    MessagePreviewParams messagePreviewParams6 = rnVar4.b5;
                                    if (messagePreviewParams6 != null) {
                                        i17 = ((org.telegram.ui.ActionBar.n2) rnVar4).currentAccount;
                                        MessageObject messageObject = rnVar4.j5;
                                        messagePreviewParams6.updateLink(i17, null, null, messageObject == rnVar4.T3 ? null : messageObject, rnVar4.h5, rnVar4.l5);
                                    }
                                    rnVar4.j8();
                                    break;
                                case 12:
                                    ab0 ab0Var5 = this.b;
                                    MessagePreviewParams messagePreviewParams7 = ab0Var5.V.d;
                                    if (messagePreviewParams7.hasMedia) {
                                        boolean z14 = !messagePreviewParams7.webpageSmall;
                                        messagePreviewParams7.webpageSmall = z14;
                                        ab0Var5.C.a(z14, true);
                                        ab0Var5.D.a(messagePreviewParams7.webpageSmall, true);
                                        if (ab0Var5.r.messages.size() > 0 && (message2 = ab0Var5.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z15 = messagePreviewParams7.webpageSmall;
                                            messageMedia2.force_small_media = z15;
                                            messageMedia2.force_large_media = !z15;
                                        }
                                        if (ab0Var5.r.previewMessages.size() > 0 && (message = ab0Var5.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                            boolean z16 = messagePreviewParams7.webpageSmall;
                                            messageMedia.force_small_media = z16;
                                            messageMedia.force_large_media = !z16;
                                        }
                                        ab0Var5.h();
                                        ab0Var5.Q = true;
                                        break;
                                    }
                                    break;
                                default:
                                    ab0 ab0Var6 = this.b;
                                    MessagePreviewParams messagePreviewParams8 = ab0Var6.V.d;
                                    boolean z17 = messagePreviewParams8.webpageTop;
                                    messagePreviewParams8.webpageTop = !z17;
                                    ab0Var6.A.a(z17, true);
                                    if (ab0Var6.r.messages.size() > 0 && (message4 = ab0Var6.r.messages.get(0).messageOwner) != null) {
                                        message4.invert_media = messagePreviewParams8.webpageTop;
                                    }
                                    if (ab0Var6.r.previewMessages.size() > 0 && (message3 = ab0Var6.r.previewMessages.get(0).messageOwner) != null) {
                                        message3.invert_media = messagePreviewParams8.webpageTop;
                                    }
                                    ab0Var6.h();
                                    ab0Var6.Q = true;
                                    break;
                            }
                        }
                    });
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(f1Var, h7.z5.n(-1, 48));
                    org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(1, context, gb0Var.B, false, true);
                    context2 = context;
                    f1Var2.g(LocaleController.getString(R.string.DoNotLinkPreview), R.drawable.msg_delete, null);
                    int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.q7, cb0Var);
                    int i17 = org.telegram.ui.ActionBar.g6.p7;
                    f1Var2.c(v02, org.telegram.ui.ActionBar.g6.v0(i17, cb0Var));
                    final int i18 = 11;
                    f1Var2.setOnClickListener(new View.OnClickListener(ab0Var) { // from class: org.telegram.ui.Components.ka0
                        public final /* synthetic */ ab0 b;

                        {
                            this.b = ab0Var;
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
                            switch (i18) {
                                case 0:
                                    ab0 ab0Var2 = this.b;
                                    ab0Var2.V.d.quote = null;
                                    ab0Var2.e.f(false);
                                    ab0Var2.g(false, false);
                                    ab0Var2.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    ab0 ab0Var3 = this.b;
                                    sa0 sa0Var2 = ab0Var3.e;
                                    gb0 gb0Var2 = ab0Var3.V;
                                    if (ab0Var3.c(null) != null) {
                                        if (sa0Var2.v - sa0Var2.u <= MessagesController.getInstance(gb0Var2.w).quoteLengthMax) {
                                            org.telegram.ui.Cells.r9 r9Var = sa0Var2.W;
                                            MessageObject c11 = ab0Var3.c(r9Var != null ? ((org.telegram.ui.Cells.s1) r9Var).getMessageObject() : null);
                                            MessagePreviewParams messagePreviewParams4 = gb0Var2.d;
                                            int i182 = sa0Var2.u;
                                            messagePreviewParams4.quoteStart = i182;
                                            int i19 = sa0Var2.v;
                                            messagePreviewParams4.quoteEnd = i19;
                                            messagePreviewParams4.quote = org.telegram.ui.hn.b(i182, i19, c11);
                                            gb0Var2.b();
                                            gb0Var2.a(true);
                                            break;
                                        } else {
                                            ab0Var3.f();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    ab0 ab0Var4 = this.b;
                                    sa0 sa0Var3 = ab0Var4.e;
                                    gb0 gb0Var3 = ab0Var4.V;
                                    MessagePreviewParams messagePreviewParams5 = gb0Var3.d;
                                    int i20 = gb0Var3.w;
                                    boolean z13 = gb0Var3.b;
                                    if (messagePreviewParams5.quote != null && !z13) {
                                        messagePreviewParams5.quote = null;
                                        sa0Var3.f(false);
                                        ab0Var4.g(false, true);
                                        ab0Var4.k(true);
                                        break;
                                    } else if (sa0Var3.v - sa0Var3.u <= MessagesController.getInstance(i20).quoteLengthMax) {
                                        MessageObject c12 = ab0Var4.c(null);
                                        if (c12 != null) {
                                            if (!sa0Var3.y()) {
                                                messagePreviewParams5.quoteStart = 0;
                                                int min = Math.min(MessagesController.getInstance(i20).quoteLengthMax, c12.messageOwner.message.length());
                                                messagePreviewParams5.quoteEnd = min;
                                                messagePreviewParams5.quote = org.telegram.ui.hn.b(messagePreviewParams5.quoteStart, min, c12);
                                                View d10 = ab0Var4.d();
                                                if (d10 instanceof org.telegram.ui.Cells.s1) {
                                                    sa0Var3.a0((org.telegram.ui.Cells.s1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                }
                                                if (!z13) {
                                                    ab0Var4.s.getSwipeBack().e(ab0Var4.E);
                                                }
                                                ab0Var4.g(true, true);
                                                break;
                                            } else {
                                                messagePreviewParams5.quoteStart = sa0Var3.u;
                                                messagePreviewParams5.quoteEnd = sa0Var3.v;
                                                org.telegram.ui.Cells.r9 r9Var2 = sa0Var3.W;
                                                messagePreviewParams5.quote = org.telegram.ui.hn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, ab0Var4.c(r9Var2 != null ? ((org.telegram.ui.Cells.s1) r9Var2).getMessageObject() : null));
                                                gb0Var3.b();
                                                gb0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        ab0Var4.f();
                                        break;
                                    }
                                    break;
                                case 3:
                                    this.b.V.c(false);
                                    break;
                                case 4:
                                    this.b.V.c(false);
                                    break;
                                case 5:
                                    this.b.V.a(true);
                                    break;
                                case 6:
                                    gb0 gb0Var4 = this.b.V;
                                    if (!gb0Var4.b) {
                                        org.telegram.ui.yk ykVar = (org.telegram.ui.yk) gb0Var4;
                                        ykVar.a(true);
                                        org.telegram.ui.rn rnVar = ykVar.D;
                                        rnVar.j5 = null;
                                        rnVar.h5 = null;
                                        rnVar.b5.updateReply(null, null, rnVar.P5, null);
                                        rnVar.j8();
                                        break;
                                    } else {
                                        org.telegram.ui.yk ykVar2 = (org.telegram.ui.yk) gb0Var4;
                                        ykVar2.a(true);
                                        org.telegram.ui.rn rnVar2 = ykVar2.D;
                                        rnVar2.h5 = null;
                                        rnVar2.Bb(rnVar2.j5);
                                        break;
                                    }
                                case 7:
                                    this.b.V.c(true);
                                    break;
                                case 8:
                                    this.b.V.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.yk ykVar3 = (org.telegram.ui.yk) this.b.V;
                                    ykVar3.a(true);
                                    org.telegram.ui.rn rnVar3 = ykVar3.D;
                                    rnVar3.b5.updateForward(null, rnVar3.P5);
                                    rnVar3.j8();
                                    break;
                                case 10:
                                    this.b.V.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.yk ykVar4 = (org.telegram.ui.yk) this.b.V;
                                    ykVar4.a(true);
                                    org.telegram.ui.rn rnVar4 = ykVar4.D;
                                    rnVar4.C5 = null;
                                    org.telegram.ui.ck ckVar = rnVar4.U;
                                    if (ckVar != null) {
                                        ckVar.S2 = null;
                                        ckVar.T2 = false;
                                    }
                                    MessagePreviewParams messagePreviewParams6 = rnVar4.b5;
                                    if (messagePreviewParams6 != null) {
                                        i172 = ((org.telegram.ui.ActionBar.n2) rnVar4).currentAccount;
                                        MessageObject messageObject = rnVar4.j5;
                                        messagePreviewParams6.updateLink(i172, null, null, messageObject == rnVar4.T3 ? null : messageObject, rnVar4.h5, rnVar4.l5);
                                    }
                                    rnVar4.j8();
                                    break;
                                case 12:
                                    ab0 ab0Var5 = this.b;
                                    MessagePreviewParams messagePreviewParams7 = ab0Var5.V.d;
                                    if (messagePreviewParams7.hasMedia) {
                                        boolean z14 = !messagePreviewParams7.webpageSmall;
                                        messagePreviewParams7.webpageSmall = z14;
                                        ab0Var5.C.a(z14, true);
                                        ab0Var5.D.a(messagePreviewParams7.webpageSmall, true);
                                        if (ab0Var5.r.messages.size() > 0 && (message2 = ab0Var5.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z15 = messagePreviewParams7.webpageSmall;
                                            messageMedia2.force_small_media = z15;
                                            messageMedia2.force_large_media = !z15;
                                        }
                                        if (ab0Var5.r.previewMessages.size() > 0 && (message = ab0Var5.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                            boolean z16 = messagePreviewParams7.webpageSmall;
                                            messageMedia.force_small_media = z16;
                                            messageMedia.force_large_media = !z16;
                                        }
                                        ab0Var5.h();
                                        ab0Var5.Q = true;
                                        break;
                                    }
                                    break;
                                default:
                                    ab0 ab0Var6 = this.b;
                                    MessagePreviewParams messagePreviewParams8 = ab0Var6.V.d;
                                    boolean z17 = messagePreviewParams8.webpageTop;
                                    messagePreviewParams8.webpageTop = !z17;
                                    ab0Var6.A.a(z17, true);
                                    if (ab0Var6.r.messages.size() > 0 && (message4 = ab0Var6.r.messages.get(0).messageOwner) != null) {
                                        message4.invert_media = messagePreviewParams8.webpageTop;
                                    }
                                    if (ab0Var6.r.previewMessages.size() > 0 && (message3 = ab0Var6.r.previewMessages.get(0).messageOwner) != null) {
                                        message3.invert_media = messagePreviewParams8.webpageTop;
                                    }
                                    ab0Var6.h();
                                    ab0Var6.Q = true;
                                    break;
                            }
                        }
                    });
                    f1Var2.setSelectorColor(org.telegram.ui.ActionBar.g6.l1(0.12f, org.telegram.ui.ActionBar.g6.w0(null, i17, false)));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(f1Var2, h7.z5.n(-1, 48));
                    final int i19 = 12;
                    frameLayout.setOnClickListener(new View.OnClickListener(ab0Var) { // from class: org.telegram.ui.Components.ka0
                        public final /* synthetic */ ab0 b;

                        {
                            this.b = ab0Var;
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
                                    ab0 ab0Var2 = this.b;
                                    ab0Var2.V.d.quote = null;
                                    ab0Var2.e.f(false);
                                    ab0Var2.g(false, false);
                                    ab0Var2.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    ab0 ab0Var3 = this.b;
                                    sa0 sa0Var2 = ab0Var3.e;
                                    gb0 gb0Var2 = ab0Var3.V;
                                    if (ab0Var3.c(null) != null) {
                                        if (sa0Var2.v - sa0Var2.u <= MessagesController.getInstance(gb0Var2.w).quoteLengthMax) {
                                            org.telegram.ui.Cells.r9 r9Var = sa0Var2.W;
                                            MessageObject c11 = ab0Var3.c(r9Var != null ? ((org.telegram.ui.Cells.s1) r9Var).getMessageObject() : null);
                                            MessagePreviewParams messagePreviewParams4 = gb0Var2.d;
                                            int i182 = sa0Var2.u;
                                            messagePreviewParams4.quoteStart = i182;
                                            int i192 = sa0Var2.v;
                                            messagePreviewParams4.quoteEnd = i192;
                                            messagePreviewParams4.quote = org.telegram.ui.hn.b(i182, i192, c11);
                                            gb0Var2.b();
                                            gb0Var2.a(true);
                                            break;
                                        } else {
                                            ab0Var3.f();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    ab0 ab0Var4 = this.b;
                                    sa0 sa0Var3 = ab0Var4.e;
                                    gb0 gb0Var3 = ab0Var4.V;
                                    MessagePreviewParams messagePreviewParams5 = gb0Var3.d;
                                    int i20 = gb0Var3.w;
                                    boolean z13 = gb0Var3.b;
                                    if (messagePreviewParams5.quote != null && !z13) {
                                        messagePreviewParams5.quote = null;
                                        sa0Var3.f(false);
                                        ab0Var4.g(false, true);
                                        ab0Var4.k(true);
                                        break;
                                    } else if (sa0Var3.v - sa0Var3.u <= MessagesController.getInstance(i20).quoteLengthMax) {
                                        MessageObject c12 = ab0Var4.c(null);
                                        if (c12 != null) {
                                            if (!sa0Var3.y()) {
                                                messagePreviewParams5.quoteStart = 0;
                                                int min = Math.min(MessagesController.getInstance(i20).quoteLengthMax, c12.messageOwner.message.length());
                                                messagePreviewParams5.quoteEnd = min;
                                                messagePreviewParams5.quote = org.telegram.ui.hn.b(messagePreviewParams5.quoteStart, min, c12);
                                                View d10 = ab0Var4.d();
                                                if (d10 instanceof org.telegram.ui.Cells.s1) {
                                                    sa0Var3.a0((org.telegram.ui.Cells.s1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                }
                                                if (!z13) {
                                                    ab0Var4.s.getSwipeBack().e(ab0Var4.E);
                                                }
                                                ab0Var4.g(true, true);
                                                break;
                                            } else {
                                                messagePreviewParams5.quoteStart = sa0Var3.u;
                                                messagePreviewParams5.quoteEnd = sa0Var3.v;
                                                org.telegram.ui.Cells.r9 r9Var2 = sa0Var3.W;
                                                messagePreviewParams5.quote = org.telegram.ui.hn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, ab0Var4.c(r9Var2 != null ? ((org.telegram.ui.Cells.s1) r9Var2).getMessageObject() : null));
                                                gb0Var3.b();
                                                gb0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        ab0Var4.f();
                                        break;
                                    }
                                    break;
                                case 3:
                                    this.b.V.c(false);
                                    break;
                                case 4:
                                    this.b.V.c(false);
                                    break;
                                case 5:
                                    this.b.V.a(true);
                                    break;
                                case 6:
                                    gb0 gb0Var4 = this.b.V;
                                    if (!gb0Var4.b) {
                                        org.telegram.ui.yk ykVar = (org.telegram.ui.yk) gb0Var4;
                                        ykVar.a(true);
                                        org.telegram.ui.rn rnVar = ykVar.D;
                                        rnVar.j5 = null;
                                        rnVar.h5 = null;
                                        rnVar.b5.updateReply(null, null, rnVar.P5, null);
                                        rnVar.j8();
                                        break;
                                    } else {
                                        org.telegram.ui.yk ykVar2 = (org.telegram.ui.yk) gb0Var4;
                                        ykVar2.a(true);
                                        org.telegram.ui.rn rnVar2 = ykVar2.D;
                                        rnVar2.h5 = null;
                                        rnVar2.Bb(rnVar2.j5);
                                        break;
                                    }
                                case 7:
                                    this.b.V.c(true);
                                    break;
                                case 8:
                                    this.b.V.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.yk ykVar3 = (org.telegram.ui.yk) this.b.V;
                                    ykVar3.a(true);
                                    org.telegram.ui.rn rnVar3 = ykVar3.D;
                                    rnVar3.b5.updateForward(null, rnVar3.P5);
                                    rnVar3.j8();
                                    break;
                                case 10:
                                    this.b.V.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.yk ykVar4 = (org.telegram.ui.yk) this.b.V;
                                    ykVar4.a(true);
                                    org.telegram.ui.rn rnVar4 = ykVar4.D;
                                    rnVar4.C5 = null;
                                    org.telegram.ui.ck ckVar = rnVar4.U;
                                    if (ckVar != null) {
                                        ckVar.S2 = null;
                                        ckVar.T2 = false;
                                    }
                                    MessagePreviewParams messagePreviewParams6 = rnVar4.b5;
                                    if (messagePreviewParams6 != null) {
                                        i172 = ((org.telegram.ui.ActionBar.n2) rnVar4).currentAccount;
                                        MessageObject messageObject = rnVar4.j5;
                                        messagePreviewParams6.updateLink(i172, null, null, messageObject == rnVar4.T3 ? null : messageObject, rnVar4.h5, rnVar4.l5);
                                    }
                                    rnVar4.j8();
                                    break;
                                case 12:
                                    ab0 ab0Var5 = this.b;
                                    MessagePreviewParams messagePreviewParams7 = ab0Var5.V.d;
                                    if (messagePreviewParams7.hasMedia) {
                                        boolean z14 = !messagePreviewParams7.webpageSmall;
                                        messagePreviewParams7.webpageSmall = z14;
                                        ab0Var5.C.a(z14, true);
                                        ab0Var5.D.a(messagePreviewParams7.webpageSmall, true);
                                        if (ab0Var5.r.messages.size() > 0 && (message2 = ab0Var5.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z15 = messagePreviewParams7.webpageSmall;
                                            messageMedia2.force_small_media = z15;
                                            messageMedia2.force_large_media = !z15;
                                        }
                                        if (ab0Var5.r.previewMessages.size() > 0 && (message = ab0Var5.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                            boolean z16 = messagePreviewParams7.webpageSmall;
                                            messageMedia.force_small_media = z16;
                                            messageMedia.force_large_media = !z16;
                                        }
                                        ab0Var5.h();
                                        ab0Var5.Q = true;
                                        break;
                                    }
                                    break;
                                default:
                                    ab0 ab0Var6 = this.b;
                                    MessagePreviewParams messagePreviewParams8 = ab0Var6.V.d;
                                    boolean z17 = messagePreviewParams8.webpageTop;
                                    messagePreviewParams8.webpageTop = !z17;
                                    ab0Var6.A.a(z17, true);
                                    if (ab0Var6.r.messages.size() > 0 && (message4 = ab0Var6.r.messages.get(0).messageOwner) != null) {
                                        message4.invert_media = messagePreviewParams8.webpageTop;
                                    }
                                    if (ab0Var6.r.previewMessages.size() > 0 && (message3 = ab0Var6.r.previewMessages.get(0).messageOwner) != null) {
                                        message3.invert_media = messagePreviewParams8.webpageTop;
                                    }
                                    ab0Var6.h();
                                    ab0Var6.Q = true;
                                    break;
                            }
                        }
                    });
                    final int i20 = 13;
                    fb0Var3.setOnClickListener(new View.OnClickListener(ab0Var) { // from class: org.telegram.ui.Components.ka0
                        public final /* synthetic */ ab0 b;

                        {
                            this.b = ab0Var;
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
                                    ab0 ab0Var2 = this.b;
                                    ab0Var2.V.d.quote = null;
                                    ab0Var2.e.f(false);
                                    ab0Var2.g(false, false);
                                    ab0Var2.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    ab0 ab0Var3 = this.b;
                                    sa0 sa0Var2 = ab0Var3.e;
                                    gb0 gb0Var2 = ab0Var3.V;
                                    if (ab0Var3.c(null) != null) {
                                        if (sa0Var2.v - sa0Var2.u <= MessagesController.getInstance(gb0Var2.w).quoteLengthMax) {
                                            org.telegram.ui.Cells.r9 r9Var = sa0Var2.W;
                                            MessageObject c11 = ab0Var3.c(r9Var != null ? ((org.telegram.ui.Cells.s1) r9Var).getMessageObject() : null);
                                            MessagePreviewParams messagePreviewParams4 = gb0Var2.d;
                                            int i182 = sa0Var2.u;
                                            messagePreviewParams4.quoteStart = i182;
                                            int i192 = sa0Var2.v;
                                            messagePreviewParams4.quoteEnd = i192;
                                            messagePreviewParams4.quote = org.telegram.ui.hn.b(i182, i192, c11);
                                            gb0Var2.b();
                                            gb0Var2.a(true);
                                            break;
                                        } else {
                                            ab0Var3.f();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    ab0 ab0Var4 = this.b;
                                    sa0 sa0Var3 = ab0Var4.e;
                                    gb0 gb0Var3 = ab0Var4.V;
                                    MessagePreviewParams messagePreviewParams5 = gb0Var3.d;
                                    int i202 = gb0Var3.w;
                                    boolean z13 = gb0Var3.b;
                                    if (messagePreviewParams5.quote != null && !z13) {
                                        messagePreviewParams5.quote = null;
                                        sa0Var3.f(false);
                                        ab0Var4.g(false, true);
                                        ab0Var4.k(true);
                                        break;
                                    } else if (sa0Var3.v - sa0Var3.u <= MessagesController.getInstance(i202).quoteLengthMax) {
                                        MessageObject c12 = ab0Var4.c(null);
                                        if (c12 != null) {
                                            if (!sa0Var3.y()) {
                                                messagePreviewParams5.quoteStart = 0;
                                                int min = Math.min(MessagesController.getInstance(i202).quoteLengthMax, c12.messageOwner.message.length());
                                                messagePreviewParams5.quoteEnd = min;
                                                messagePreviewParams5.quote = org.telegram.ui.hn.b(messagePreviewParams5.quoteStart, min, c12);
                                                View d10 = ab0Var4.d();
                                                if (d10 instanceof org.telegram.ui.Cells.s1) {
                                                    sa0Var3.a0((org.telegram.ui.Cells.s1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                }
                                                if (!z13) {
                                                    ab0Var4.s.getSwipeBack().e(ab0Var4.E);
                                                }
                                                ab0Var4.g(true, true);
                                                break;
                                            } else {
                                                messagePreviewParams5.quoteStart = sa0Var3.u;
                                                messagePreviewParams5.quoteEnd = sa0Var3.v;
                                                org.telegram.ui.Cells.r9 r9Var2 = sa0Var3.W;
                                                messagePreviewParams5.quote = org.telegram.ui.hn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, ab0Var4.c(r9Var2 != null ? ((org.telegram.ui.Cells.s1) r9Var2).getMessageObject() : null));
                                                gb0Var3.b();
                                                gb0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        ab0Var4.f();
                                        break;
                                    }
                                    break;
                                case 3:
                                    this.b.V.c(false);
                                    break;
                                case 4:
                                    this.b.V.c(false);
                                    break;
                                case 5:
                                    this.b.V.a(true);
                                    break;
                                case 6:
                                    gb0 gb0Var4 = this.b.V;
                                    if (!gb0Var4.b) {
                                        org.telegram.ui.yk ykVar = (org.telegram.ui.yk) gb0Var4;
                                        ykVar.a(true);
                                        org.telegram.ui.rn rnVar = ykVar.D;
                                        rnVar.j5 = null;
                                        rnVar.h5 = null;
                                        rnVar.b5.updateReply(null, null, rnVar.P5, null);
                                        rnVar.j8();
                                        break;
                                    } else {
                                        org.telegram.ui.yk ykVar2 = (org.telegram.ui.yk) gb0Var4;
                                        ykVar2.a(true);
                                        org.telegram.ui.rn rnVar2 = ykVar2.D;
                                        rnVar2.h5 = null;
                                        rnVar2.Bb(rnVar2.j5);
                                        break;
                                    }
                                case 7:
                                    this.b.V.c(true);
                                    break;
                                case 8:
                                    this.b.V.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.yk ykVar3 = (org.telegram.ui.yk) this.b.V;
                                    ykVar3.a(true);
                                    org.telegram.ui.rn rnVar3 = ykVar3.D;
                                    rnVar3.b5.updateForward(null, rnVar3.P5);
                                    rnVar3.j8();
                                    break;
                                case 10:
                                    this.b.V.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.yk ykVar4 = (org.telegram.ui.yk) this.b.V;
                                    ykVar4.a(true);
                                    org.telegram.ui.rn rnVar4 = ykVar4.D;
                                    rnVar4.C5 = null;
                                    org.telegram.ui.ck ckVar = rnVar4.U;
                                    if (ckVar != null) {
                                        ckVar.S2 = null;
                                        ckVar.T2 = false;
                                    }
                                    MessagePreviewParams messagePreviewParams6 = rnVar4.b5;
                                    if (messagePreviewParams6 != null) {
                                        i172 = ((org.telegram.ui.ActionBar.n2) rnVar4).currentAccount;
                                        MessageObject messageObject = rnVar4.j5;
                                        messagePreviewParams6.updateLink(i172, null, null, messageObject == rnVar4.T3 ? null : messageObject, rnVar4.h5, rnVar4.l5);
                                    }
                                    rnVar4.j8();
                                    break;
                                case 12:
                                    ab0 ab0Var5 = this.b;
                                    MessagePreviewParams messagePreviewParams7 = ab0Var5.V.d;
                                    if (messagePreviewParams7.hasMedia) {
                                        boolean z14 = !messagePreviewParams7.webpageSmall;
                                        messagePreviewParams7.webpageSmall = z14;
                                        ab0Var5.C.a(z14, true);
                                        ab0Var5.D.a(messagePreviewParams7.webpageSmall, true);
                                        if (ab0Var5.r.messages.size() > 0 && (message2 = ab0Var5.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z15 = messagePreviewParams7.webpageSmall;
                                            messageMedia2.force_small_media = z15;
                                            messageMedia2.force_large_media = !z15;
                                        }
                                        if (ab0Var5.r.previewMessages.size() > 0 && (message = ab0Var5.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                            boolean z16 = messagePreviewParams7.webpageSmall;
                                            messageMedia.force_small_media = z16;
                                            messageMedia.force_large_media = !z16;
                                        }
                                        ab0Var5.h();
                                        ab0Var5.Q = true;
                                        break;
                                    }
                                    break;
                                default:
                                    ab0 ab0Var6 = this.b;
                                    MessagePreviewParams messagePreviewParams8 = ab0Var6.V.d;
                                    boolean z17 = messagePreviewParams8.webpageTop;
                                    messagePreviewParams8.webpageTop = !z17;
                                    ab0Var6.A.a(z17, true);
                                    if (ab0Var6.r.messages.size() > 0 && (message4 = ab0Var6.r.messages.get(0).messageOwner) != null) {
                                        message4.invert_media = messagePreviewParams8.webpageTop;
                                    }
                                    if (ab0Var6.r.previewMessages.size() > 0 && (message3 = ab0Var6.r.previewMessages.get(0).messageOwner) != null) {
                                        message3.invert_media = messagePreviewParams8.webpageTop;
                                    }
                                    ab0Var6.h();
                                    ab0Var6.Q = true;
                                    break;
                            }
                        }
                    });
                }
            } else {
                if (!UserConfig.getInstance(gb0Var.w).isPremium()) {
                    for (int i21 = 0; i21 < messagePreviewParams.forwardMessages.messages.size(); i21++) {
                        if (messagePreviewParams.forwardMessages.messages.get(i21).type == 36) {
                            z10 = false;
                            break;
                        }
                    }
                }
                z10 = true;
                fb0 fb0Var6 = new fb0(context, R.raw.name_hide, LocaleController.getString(messagePreviewParams.multipleUsers ? R.string.ShowSenderNames : R.string.ShowSendersName), R.raw.name_show, LocaleController.getString(messagePreviewParams.multipleUsers ? R.string.HideSenderNames : R.string.HideSendersName), gb0Var.B);
                this.s.a(fb0Var6, h7.z5.n(-1, 48));
                if (messagePreviewParams.hasCaption) {
                    fb0Var = fb0Var6;
                    fb0 fb0Var7 = new fb0(context, R.raw.caption_hide, LocaleController.getString(R.string.ShowCaption), R.raw.caption_show, LocaleController.getString(R.string.HideCaption), gb0Var.B);
                    fb0Var7.a(messagePreviewParams.hideCaption, false);
                    this.s.a(fb0Var7, h7.z5.n(-1, 48));
                    fb0Var2 = fb0Var7;
                } else {
                    fb0Var = fb0Var6;
                    fb0Var2 = null;
                }
                org.telegram.ui.ActionBar.f1 f1Var3 = new org.telegram.ui.ActionBar.f1(0, context, gb0Var.B, true, false);
                final int i22 = 7;
                f1Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ka0
                    public final /* synthetic */ ab0 b;

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
                        switch (i22) {
                            case 0:
                                ab0 ab0Var2 = this.b;
                                ab0Var2.V.d.quote = null;
                                ab0Var2.e.f(false);
                                ab0Var2.g(false, false);
                                ab0Var2.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                ab0 ab0Var3 = this.b;
                                sa0 sa0Var2 = ab0Var3.e;
                                gb0 gb0Var2 = ab0Var3.V;
                                if (ab0Var3.c(null) != null) {
                                    if (sa0Var2.v - sa0Var2.u <= MessagesController.getInstance(gb0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.r9 r9Var = sa0Var2.W;
                                        MessageObject c11 = ab0Var3.c(r9Var != null ? ((org.telegram.ui.Cells.s1) r9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams4 = gb0Var2.d;
                                        int i182 = sa0Var2.u;
                                        messagePreviewParams4.quoteStart = i182;
                                        int i192 = sa0Var2.v;
                                        messagePreviewParams4.quoteEnd = i192;
                                        messagePreviewParams4.quote = org.telegram.ui.hn.b(i182, i192, c11);
                                        gb0Var2.b();
                                        gb0Var2.a(true);
                                        break;
                                    } else {
                                        ab0Var3.f();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                ab0 ab0Var4 = this.b;
                                sa0 sa0Var3 = ab0Var4.e;
                                gb0 gb0Var3 = ab0Var4.V;
                                MessagePreviewParams messagePreviewParams5 = gb0Var3.d;
                                int i202 = gb0Var3.w;
                                boolean z13 = gb0Var3.b;
                                if (messagePreviewParams5.quote != null && !z13) {
                                    messagePreviewParams5.quote = null;
                                    sa0Var3.f(false);
                                    ab0Var4.g(false, true);
                                    ab0Var4.k(true);
                                    break;
                                } else if (sa0Var3.v - sa0Var3.u <= MessagesController.getInstance(i202).quoteLengthMax) {
                                    MessageObject c12 = ab0Var4.c(null);
                                    if (c12 != null) {
                                        if (!sa0Var3.y()) {
                                            messagePreviewParams5.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i202).quoteLengthMax, c12.messageOwner.message.length());
                                            messagePreviewParams5.quoteEnd = min;
                                            messagePreviewParams5.quote = org.telegram.ui.hn.b(messagePreviewParams5.quoteStart, min, c12);
                                            View d10 = ab0Var4.d();
                                            if (d10 instanceof org.telegram.ui.Cells.s1) {
                                                sa0Var3.a0((org.telegram.ui.Cells.s1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            }
                                            if (!z13) {
                                                ab0Var4.s.getSwipeBack().e(ab0Var4.E);
                                            }
                                            ab0Var4.g(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams5.quoteStart = sa0Var3.u;
                                            messagePreviewParams5.quoteEnd = sa0Var3.v;
                                            org.telegram.ui.Cells.r9 r9Var2 = sa0Var3.W;
                                            messagePreviewParams5.quote = org.telegram.ui.hn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, ab0Var4.c(r9Var2 != null ? ((org.telegram.ui.Cells.s1) r9Var2).getMessageObject() : null));
                                            gb0Var3.b();
                                            gb0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    ab0Var4.f();
                                    break;
                                }
                                break;
                            case 3:
                                this.b.V.c(false);
                                break;
                            case 4:
                                this.b.V.c(false);
                                break;
                            case 5:
                                this.b.V.a(true);
                                break;
                            case 6:
                                gb0 gb0Var4 = this.b.V;
                                if (!gb0Var4.b) {
                                    org.telegram.ui.yk ykVar = (org.telegram.ui.yk) gb0Var4;
                                    ykVar.a(true);
                                    org.telegram.ui.rn rnVar = ykVar.D;
                                    rnVar.j5 = null;
                                    rnVar.h5 = null;
                                    rnVar.b5.updateReply(null, null, rnVar.P5, null);
                                    rnVar.j8();
                                    break;
                                } else {
                                    org.telegram.ui.yk ykVar2 = (org.telegram.ui.yk) gb0Var4;
                                    ykVar2.a(true);
                                    org.telegram.ui.rn rnVar2 = ykVar2.D;
                                    rnVar2.h5 = null;
                                    rnVar2.Bb(rnVar2.j5);
                                    break;
                                }
                            case 7:
                                this.b.V.c(true);
                                break;
                            case 8:
                                this.b.V.a(true);
                                break;
                            case 9:
                                org.telegram.ui.yk ykVar3 = (org.telegram.ui.yk) this.b.V;
                                ykVar3.a(true);
                                org.telegram.ui.rn rnVar3 = ykVar3.D;
                                rnVar3.b5.updateForward(null, rnVar3.P5);
                                rnVar3.j8();
                                break;
                            case 10:
                                this.b.V.a(true);
                                break;
                            case 11:
                                org.telegram.ui.yk ykVar4 = (org.telegram.ui.yk) this.b.V;
                                ykVar4.a(true);
                                org.telegram.ui.rn rnVar4 = ykVar4.D;
                                rnVar4.C5 = null;
                                org.telegram.ui.ck ckVar = rnVar4.U;
                                if (ckVar != null) {
                                    ckVar.S2 = null;
                                    ckVar.T2 = false;
                                }
                                MessagePreviewParams messagePreviewParams6 = rnVar4.b5;
                                if (messagePreviewParams6 != null) {
                                    i172 = ((org.telegram.ui.ActionBar.n2) rnVar4).currentAccount;
                                    MessageObject messageObject = rnVar4.j5;
                                    messagePreviewParams6.updateLink(i172, null, null, messageObject == rnVar4.T3 ? null : messageObject, rnVar4.h5, rnVar4.l5);
                                }
                                rnVar4.j8();
                                break;
                            case 12:
                                ab0 ab0Var5 = this.b;
                                MessagePreviewParams messagePreviewParams7 = ab0Var5.V.d;
                                if (messagePreviewParams7.hasMedia) {
                                    boolean z14 = !messagePreviewParams7.webpageSmall;
                                    messagePreviewParams7.webpageSmall = z14;
                                    ab0Var5.C.a(z14, true);
                                    ab0Var5.D.a(messagePreviewParams7.webpageSmall, true);
                                    if (ab0Var5.r.messages.size() > 0 && (message2 = ab0Var5.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z15 = messagePreviewParams7.webpageSmall;
                                        messageMedia2.force_small_media = z15;
                                        messageMedia2.force_large_media = !z15;
                                    }
                                    if (ab0Var5.r.previewMessages.size() > 0 && (message = ab0Var5.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z16 = messagePreviewParams7.webpageSmall;
                                        messageMedia.force_small_media = z16;
                                        messageMedia.force_large_media = !z16;
                                    }
                                    ab0Var5.h();
                                    ab0Var5.Q = true;
                                    break;
                                }
                                break;
                            default:
                                ab0 ab0Var6 = this.b;
                                MessagePreviewParams messagePreviewParams8 = ab0Var6.V.d;
                                boolean z17 = messagePreviewParams8.webpageTop;
                                messagePreviewParams8.webpageTop = !z17;
                                ab0Var6.A.a(z17, true);
                                if (ab0Var6.r.messages.size() > 0 && (message4 = ab0Var6.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams8.webpageTop;
                                }
                                if (ab0Var6.r.previewMessages.size() > 0 && (message3 = ab0Var6.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams8.webpageTop;
                                }
                                ab0Var6.h();
                                ab0Var6.Q = true;
                                break;
                        }
                    }
                });
                f1Var3.g(LocaleController.getString(R.string.ChangeRecipient), R.drawable.msg_forward_replace, null);
                this.s.a(f1Var3, h7.z5.n(-1, 48));
                org.telegram.ui.ActionBar.k1 k1Var2 = new org.telegram.ui.ActionBar.k1(context, cb0Var);
                k1Var2.setColor(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, cb0Var)));
                k1Var2.setTag(R.id.fit_width_tag, 1);
                final int i23 = 8;
                this.s.a(k1Var2, h7.z5.n(-1, 8));
                org.telegram.ui.ActionBar.f1 f1Var4 = new org.telegram.ui.ActionBar.f1(1, context, gb0Var.B, false, false);
                f1Var4.g(LocaleController.getString(R.string.ApplyChanges), R.drawable.msg_select, null);
                f1Var4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ka0
                    public final /* synthetic */ ab0 b;

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
                                ab0 ab0Var2 = this.b;
                                ab0Var2.V.d.quote = null;
                                ab0Var2.e.f(false);
                                ab0Var2.g(false, false);
                                ab0Var2.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                ab0 ab0Var3 = this.b;
                                sa0 sa0Var2 = ab0Var3.e;
                                gb0 gb0Var2 = ab0Var3.V;
                                if (ab0Var3.c(null) != null) {
                                    if (sa0Var2.v - sa0Var2.u <= MessagesController.getInstance(gb0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.r9 r9Var = sa0Var2.W;
                                        MessageObject c11 = ab0Var3.c(r9Var != null ? ((org.telegram.ui.Cells.s1) r9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams4 = gb0Var2.d;
                                        int i182 = sa0Var2.u;
                                        messagePreviewParams4.quoteStart = i182;
                                        int i192 = sa0Var2.v;
                                        messagePreviewParams4.quoteEnd = i192;
                                        messagePreviewParams4.quote = org.telegram.ui.hn.b(i182, i192, c11);
                                        gb0Var2.b();
                                        gb0Var2.a(true);
                                        break;
                                    } else {
                                        ab0Var3.f();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                ab0 ab0Var4 = this.b;
                                sa0 sa0Var3 = ab0Var4.e;
                                gb0 gb0Var3 = ab0Var4.V;
                                MessagePreviewParams messagePreviewParams5 = gb0Var3.d;
                                int i202 = gb0Var3.w;
                                boolean z13 = gb0Var3.b;
                                if (messagePreviewParams5.quote != null && !z13) {
                                    messagePreviewParams5.quote = null;
                                    sa0Var3.f(false);
                                    ab0Var4.g(false, true);
                                    ab0Var4.k(true);
                                    break;
                                } else if (sa0Var3.v - sa0Var3.u <= MessagesController.getInstance(i202).quoteLengthMax) {
                                    MessageObject c12 = ab0Var4.c(null);
                                    if (c12 != null) {
                                        if (!sa0Var3.y()) {
                                            messagePreviewParams5.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i202).quoteLengthMax, c12.messageOwner.message.length());
                                            messagePreviewParams5.quoteEnd = min;
                                            messagePreviewParams5.quote = org.telegram.ui.hn.b(messagePreviewParams5.quoteStart, min, c12);
                                            View d10 = ab0Var4.d();
                                            if (d10 instanceof org.telegram.ui.Cells.s1) {
                                                sa0Var3.a0((org.telegram.ui.Cells.s1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            }
                                            if (!z13) {
                                                ab0Var4.s.getSwipeBack().e(ab0Var4.E);
                                            }
                                            ab0Var4.g(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams5.quoteStart = sa0Var3.u;
                                            messagePreviewParams5.quoteEnd = sa0Var3.v;
                                            org.telegram.ui.Cells.r9 r9Var2 = sa0Var3.W;
                                            messagePreviewParams5.quote = org.telegram.ui.hn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, ab0Var4.c(r9Var2 != null ? ((org.telegram.ui.Cells.s1) r9Var2).getMessageObject() : null));
                                            gb0Var3.b();
                                            gb0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    ab0Var4.f();
                                    break;
                                }
                                break;
                            case 3:
                                this.b.V.c(false);
                                break;
                            case 4:
                                this.b.V.c(false);
                                break;
                            case 5:
                                this.b.V.a(true);
                                break;
                            case 6:
                                gb0 gb0Var4 = this.b.V;
                                if (!gb0Var4.b) {
                                    org.telegram.ui.yk ykVar = (org.telegram.ui.yk) gb0Var4;
                                    ykVar.a(true);
                                    org.telegram.ui.rn rnVar = ykVar.D;
                                    rnVar.j5 = null;
                                    rnVar.h5 = null;
                                    rnVar.b5.updateReply(null, null, rnVar.P5, null);
                                    rnVar.j8();
                                    break;
                                } else {
                                    org.telegram.ui.yk ykVar2 = (org.telegram.ui.yk) gb0Var4;
                                    ykVar2.a(true);
                                    org.telegram.ui.rn rnVar2 = ykVar2.D;
                                    rnVar2.h5 = null;
                                    rnVar2.Bb(rnVar2.j5);
                                    break;
                                }
                            case 7:
                                this.b.V.c(true);
                                break;
                            case 8:
                                this.b.V.a(true);
                                break;
                            case 9:
                                org.telegram.ui.yk ykVar3 = (org.telegram.ui.yk) this.b.V;
                                ykVar3.a(true);
                                org.telegram.ui.rn rnVar3 = ykVar3.D;
                                rnVar3.b5.updateForward(null, rnVar3.P5);
                                rnVar3.j8();
                                break;
                            case 10:
                                this.b.V.a(true);
                                break;
                            case 11:
                                org.telegram.ui.yk ykVar4 = (org.telegram.ui.yk) this.b.V;
                                ykVar4.a(true);
                                org.telegram.ui.rn rnVar4 = ykVar4.D;
                                rnVar4.C5 = null;
                                org.telegram.ui.ck ckVar = rnVar4.U;
                                if (ckVar != null) {
                                    ckVar.S2 = null;
                                    ckVar.T2 = false;
                                }
                                MessagePreviewParams messagePreviewParams6 = rnVar4.b5;
                                if (messagePreviewParams6 != null) {
                                    i172 = ((org.telegram.ui.ActionBar.n2) rnVar4).currentAccount;
                                    MessageObject messageObject = rnVar4.j5;
                                    messagePreviewParams6.updateLink(i172, null, null, messageObject == rnVar4.T3 ? null : messageObject, rnVar4.h5, rnVar4.l5);
                                }
                                rnVar4.j8();
                                break;
                            case 12:
                                ab0 ab0Var5 = this.b;
                                MessagePreviewParams messagePreviewParams7 = ab0Var5.V.d;
                                if (messagePreviewParams7.hasMedia) {
                                    boolean z14 = !messagePreviewParams7.webpageSmall;
                                    messagePreviewParams7.webpageSmall = z14;
                                    ab0Var5.C.a(z14, true);
                                    ab0Var5.D.a(messagePreviewParams7.webpageSmall, true);
                                    if (ab0Var5.r.messages.size() > 0 && (message2 = ab0Var5.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z15 = messagePreviewParams7.webpageSmall;
                                        messageMedia2.force_small_media = z15;
                                        messageMedia2.force_large_media = !z15;
                                    }
                                    if (ab0Var5.r.previewMessages.size() > 0 && (message = ab0Var5.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z16 = messagePreviewParams7.webpageSmall;
                                        messageMedia.force_small_media = z16;
                                        messageMedia.force_large_media = !z16;
                                    }
                                    ab0Var5.h();
                                    ab0Var5.Q = true;
                                    break;
                                }
                                break;
                            default:
                                ab0 ab0Var6 = this.b;
                                MessagePreviewParams messagePreviewParams8 = ab0Var6.V.d;
                                boolean z17 = messagePreviewParams8.webpageTop;
                                messagePreviewParams8.webpageTop = !z17;
                                ab0Var6.A.a(z17, true);
                                if (ab0Var6.r.messages.size() > 0 && (message4 = ab0Var6.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams8.webpageTop;
                                }
                                if (ab0Var6.r.previewMessages.size() > 0 && (message3 = ab0Var6.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams8.webpageTop;
                                }
                                ab0Var6.h();
                                ab0Var6.Q = true;
                                break;
                        }
                    }
                });
                this.s.a(f1Var4, h7.z5.n(-1, 48));
                org.telegram.ui.ActionBar.f1 f1Var5 = new org.telegram.ui.ActionBar.f1(1, context, gb0Var.B, false, true);
                f1Var5.g(LocaleController.getString(R.string.DoNotForward), R.drawable.msg_delete, null);
                int v03 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.q7, cb0Var);
                int i24 = org.telegram.ui.ActionBar.g6.p7;
                f1Var5.c(v03, org.telegram.ui.ActionBar.g6.v0(i24, cb0Var));
                final int i25 = 9;
                f1Var5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ka0
                    public final /* synthetic */ ab0 b;

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
                        switch (i25) {
                            case 0:
                                ab0 ab0Var2 = this.b;
                                ab0Var2.V.d.quote = null;
                                ab0Var2.e.f(false);
                                ab0Var2.g(false, false);
                                ab0Var2.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                ab0 ab0Var3 = this.b;
                                sa0 sa0Var2 = ab0Var3.e;
                                gb0 gb0Var2 = ab0Var3.V;
                                if (ab0Var3.c(null) != null) {
                                    if (sa0Var2.v - sa0Var2.u <= MessagesController.getInstance(gb0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.r9 r9Var = sa0Var2.W;
                                        MessageObject c11 = ab0Var3.c(r9Var != null ? ((org.telegram.ui.Cells.s1) r9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams4 = gb0Var2.d;
                                        int i182 = sa0Var2.u;
                                        messagePreviewParams4.quoteStart = i182;
                                        int i192 = sa0Var2.v;
                                        messagePreviewParams4.quoteEnd = i192;
                                        messagePreviewParams4.quote = org.telegram.ui.hn.b(i182, i192, c11);
                                        gb0Var2.b();
                                        gb0Var2.a(true);
                                        break;
                                    } else {
                                        ab0Var3.f();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                ab0 ab0Var4 = this.b;
                                sa0 sa0Var3 = ab0Var4.e;
                                gb0 gb0Var3 = ab0Var4.V;
                                MessagePreviewParams messagePreviewParams5 = gb0Var3.d;
                                int i202 = gb0Var3.w;
                                boolean z13 = gb0Var3.b;
                                if (messagePreviewParams5.quote != null && !z13) {
                                    messagePreviewParams5.quote = null;
                                    sa0Var3.f(false);
                                    ab0Var4.g(false, true);
                                    ab0Var4.k(true);
                                    break;
                                } else if (sa0Var3.v - sa0Var3.u <= MessagesController.getInstance(i202).quoteLengthMax) {
                                    MessageObject c12 = ab0Var4.c(null);
                                    if (c12 != null) {
                                        if (!sa0Var3.y()) {
                                            messagePreviewParams5.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i202).quoteLengthMax, c12.messageOwner.message.length());
                                            messagePreviewParams5.quoteEnd = min;
                                            messagePreviewParams5.quote = org.telegram.ui.hn.b(messagePreviewParams5.quoteStart, min, c12);
                                            View d10 = ab0Var4.d();
                                            if (d10 instanceof org.telegram.ui.Cells.s1) {
                                                sa0Var3.a0((org.telegram.ui.Cells.s1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            }
                                            if (!z13) {
                                                ab0Var4.s.getSwipeBack().e(ab0Var4.E);
                                            }
                                            ab0Var4.g(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams5.quoteStart = sa0Var3.u;
                                            messagePreviewParams5.quoteEnd = sa0Var3.v;
                                            org.telegram.ui.Cells.r9 r9Var2 = sa0Var3.W;
                                            messagePreviewParams5.quote = org.telegram.ui.hn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, ab0Var4.c(r9Var2 != null ? ((org.telegram.ui.Cells.s1) r9Var2).getMessageObject() : null));
                                            gb0Var3.b();
                                            gb0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    ab0Var4.f();
                                    break;
                                }
                                break;
                            case 3:
                                this.b.V.c(false);
                                break;
                            case 4:
                                this.b.V.c(false);
                                break;
                            case 5:
                                this.b.V.a(true);
                                break;
                            case 6:
                                gb0 gb0Var4 = this.b.V;
                                if (!gb0Var4.b) {
                                    org.telegram.ui.yk ykVar = (org.telegram.ui.yk) gb0Var4;
                                    ykVar.a(true);
                                    org.telegram.ui.rn rnVar = ykVar.D;
                                    rnVar.j5 = null;
                                    rnVar.h5 = null;
                                    rnVar.b5.updateReply(null, null, rnVar.P5, null);
                                    rnVar.j8();
                                    break;
                                } else {
                                    org.telegram.ui.yk ykVar2 = (org.telegram.ui.yk) gb0Var4;
                                    ykVar2.a(true);
                                    org.telegram.ui.rn rnVar2 = ykVar2.D;
                                    rnVar2.h5 = null;
                                    rnVar2.Bb(rnVar2.j5);
                                    break;
                                }
                            case 7:
                                this.b.V.c(true);
                                break;
                            case 8:
                                this.b.V.a(true);
                                break;
                            case 9:
                                org.telegram.ui.yk ykVar3 = (org.telegram.ui.yk) this.b.V;
                                ykVar3.a(true);
                                org.telegram.ui.rn rnVar3 = ykVar3.D;
                                rnVar3.b5.updateForward(null, rnVar3.P5);
                                rnVar3.j8();
                                break;
                            case 10:
                                this.b.V.a(true);
                                break;
                            case 11:
                                org.telegram.ui.yk ykVar4 = (org.telegram.ui.yk) this.b.V;
                                ykVar4.a(true);
                                org.telegram.ui.rn rnVar4 = ykVar4.D;
                                rnVar4.C5 = null;
                                org.telegram.ui.ck ckVar = rnVar4.U;
                                if (ckVar != null) {
                                    ckVar.S2 = null;
                                    ckVar.T2 = false;
                                }
                                MessagePreviewParams messagePreviewParams6 = rnVar4.b5;
                                if (messagePreviewParams6 != null) {
                                    i172 = ((org.telegram.ui.ActionBar.n2) rnVar4).currentAccount;
                                    MessageObject messageObject = rnVar4.j5;
                                    messagePreviewParams6.updateLink(i172, null, null, messageObject == rnVar4.T3 ? null : messageObject, rnVar4.h5, rnVar4.l5);
                                }
                                rnVar4.j8();
                                break;
                            case 12:
                                ab0 ab0Var5 = this.b;
                                MessagePreviewParams messagePreviewParams7 = ab0Var5.V.d;
                                if (messagePreviewParams7.hasMedia) {
                                    boolean z14 = !messagePreviewParams7.webpageSmall;
                                    messagePreviewParams7.webpageSmall = z14;
                                    ab0Var5.C.a(z14, true);
                                    ab0Var5.D.a(messagePreviewParams7.webpageSmall, true);
                                    if (ab0Var5.r.messages.size() > 0 && (message2 = ab0Var5.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z15 = messagePreviewParams7.webpageSmall;
                                        messageMedia2.force_small_media = z15;
                                        messageMedia2.force_large_media = !z15;
                                    }
                                    if (ab0Var5.r.previewMessages.size() > 0 && (message = ab0Var5.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z16 = messagePreviewParams7.webpageSmall;
                                        messageMedia.force_small_media = z16;
                                        messageMedia.force_large_media = !z16;
                                    }
                                    ab0Var5.h();
                                    ab0Var5.Q = true;
                                    break;
                                }
                                break;
                            default:
                                ab0 ab0Var6 = this.b;
                                MessagePreviewParams messagePreviewParams8 = ab0Var6.V.d;
                                boolean z17 = messagePreviewParams8.webpageTop;
                                messagePreviewParams8.webpageTop = !z17;
                                ab0Var6.A.a(z17, true);
                                if (ab0Var6.r.messages.size() > 0 && (message4 = ab0Var6.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams8.webpageTop;
                                }
                                if (ab0Var6.r.previewMessages.size() > 0 && (message3 = ab0Var6.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams8.webpageTop;
                                }
                                ab0Var6.h();
                                ab0Var6.Q = true;
                                break;
                        }
                    }
                });
                f1Var5.setSelectorColor(org.telegram.ui.ActionBar.g6.l1(0.12f, org.telegram.ui.ActionBar.g6.w0(null, i24, false)));
                this.s.a(f1Var5, h7.z5.n(-1, 48));
                fb0 fb0Var8 = fb0Var;
                fb0Var8.a(messagePreviewParams.hideForwardSendersName, false);
                fb0 fb0Var9 = fb0Var2;
                ab0Var = this;
                fb0Var8.setOnClickListener(new gh.e3(this, z10, context, fb0Var9, fb0Var8, 1));
                if (fb0Var9 != null) {
                    fb0Var9.setOnClickListener(new gg.f(ab0Var, fb0Var9, fb0Var8, 29));
                }
            }
            context2 = context;
        } else {
            if (!messages.hasText || messagePreviewParams3.isSecret) {
                messagePreviewParams = messagePreviewParams3;
            } else {
                LinearLayout g10 = org.telegram.messenger.y1.g(context3, 1);
                if (z12) {
                    linearLayout = g10;
                    messagePreviewParams2 = messagePreviewParams3;
                    z11 = true;
                } else {
                    ?? r82 = g10;
                    messagePreviewParams2 = messagePreviewParams3;
                    org.telegram.ui.ActionBar.f1 f1Var6 = new org.telegram.ui.ActionBar.f1(0, context3, gb0Var.B, true, false);
                    f1Var6.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                    f1Var6.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ka0
                        public final /* synthetic */ ab0 b;

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
                            switch (i13) {
                                case 0:
                                    ab0 ab0Var2 = this.b;
                                    ab0Var2.V.d.quote = null;
                                    ab0Var2.e.f(false);
                                    ab0Var2.g(false, false);
                                    ab0Var2.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    ab0 ab0Var3 = this.b;
                                    sa0 sa0Var2 = ab0Var3.e;
                                    gb0 gb0Var2 = ab0Var3.V;
                                    if (ab0Var3.c(null) != null) {
                                        if (sa0Var2.v - sa0Var2.u <= MessagesController.getInstance(gb0Var2.w).quoteLengthMax) {
                                            org.telegram.ui.Cells.r9 r9Var = sa0Var2.W;
                                            MessageObject c11 = ab0Var3.c(r9Var != null ? ((org.telegram.ui.Cells.s1) r9Var).getMessageObject() : null);
                                            MessagePreviewParams messagePreviewParams4 = gb0Var2.d;
                                            int i182 = sa0Var2.u;
                                            messagePreviewParams4.quoteStart = i182;
                                            int i192 = sa0Var2.v;
                                            messagePreviewParams4.quoteEnd = i192;
                                            messagePreviewParams4.quote = org.telegram.ui.hn.b(i182, i192, c11);
                                            gb0Var2.b();
                                            gb0Var2.a(true);
                                            break;
                                        } else {
                                            ab0Var3.f();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    ab0 ab0Var4 = this.b;
                                    sa0 sa0Var3 = ab0Var4.e;
                                    gb0 gb0Var3 = ab0Var4.V;
                                    MessagePreviewParams messagePreviewParams5 = gb0Var3.d;
                                    int i202 = gb0Var3.w;
                                    boolean z13 = gb0Var3.b;
                                    if (messagePreviewParams5.quote != null && !z13) {
                                        messagePreviewParams5.quote = null;
                                        sa0Var3.f(false);
                                        ab0Var4.g(false, true);
                                        ab0Var4.k(true);
                                        break;
                                    } else if (sa0Var3.v - sa0Var3.u <= MessagesController.getInstance(i202).quoteLengthMax) {
                                        MessageObject c12 = ab0Var4.c(null);
                                        if (c12 != null) {
                                            if (!sa0Var3.y()) {
                                                messagePreviewParams5.quoteStart = 0;
                                                int min = Math.min(MessagesController.getInstance(i202).quoteLengthMax, c12.messageOwner.message.length());
                                                messagePreviewParams5.quoteEnd = min;
                                                messagePreviewParams5.quote = org.telegram.ui.hn.b(messagePreviewParams5.quoteStart, min, c12);
                                                View d10 = ab0Var4.d();
                                                if (d10 instanceof org.telegram.ui.Cells.s1) {
                                                    sa0Var3.a0((org.telegram.ui.Cells.s1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                }
                                                if (!z13) {
                                                    ab0Var4.s.getSwipeBack().e(ab0Var4.E);
                                                }
                                                ab0Var4.g(true, true);
                                                break;
                                            } else {
                                                messagePreviewParams5.quoteStart = sa0Var3.u;
                                                messagePreviewParams5.quoteEnd = sa0Var3.v;
                                                org.telegram.ui.Cells.r9 r9Var2 = sa0Var3.W;
                                                messagePreviewParams5.quote = org.telegram.ui.hn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, ab0Var4.c(r9Var2 != null ? ((org.telegram.ui.Cells.s1) r9Var2).getMessageObject() : null));
                                                gb0Var3.b();
                                                gb0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        ab0Var4.f();
                                        break;
                                    }
                                    break;
                                case 3:
                                    this.b.V.c(false);
                                    break;
                                case 4:
                                    this.b.V.c(false);
                                    break;
                                case 5:
                                    this.b.V.a(true);
                                    break;
                                case 6:
                                    gb0 gb0Var4 = this.b.V;
                                    if (!gb0Var4.b) {
                                        org.telegram.ui.yk ykVar = (org.telegram.ui.yk) gb0Var4;
                                        ykVar.a(true);
                                        org.telegram.ui.rn rnVar = ykVar.D;
                                        rnVar.j5 = null;
                                        rnVar.h5 = null;
                                        rnVar.b5.updateReply(null, null, rnVar.P5, null);
                                        rnVar.j8();
                                        break;
                                    } else {
                                        org.telegram.ui.yk ykVar2 = (org.telegram.ui.yk) gb0Var4;
                                        ykVar2.a(true);
                                        org.telegram.ui.rn rnVar2 = ykVar2.D;
                                        rnVar2.h5 = null;
                                        rnVar2.Bb(rnVar2.j5);
                                        break;
                                    }
                                case 7:
                                    this.b.V.c(true);
                                    break;
                                case 8:
                                    this.b.V.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.yk ykVar3 = (org.telegram.ui.yk) this.b.V;
                                    ykVar3.a(true);
                                    org.telegram.ui.rn rnVar3 = ykVar3.D;
                                    rnVar3.b5.updateForward(null, rnVar3.P5);
                                    rnVar3.j8();
                                    break;
                                case 10:
                                    this.b.V.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.yk ykVar4 = (org.telegram.ui.yk) this.b.V;
                                    ykVar4.a(true);
                                    org.telegram.ui.rn rnVar4 = ykVar4.D;
                                    rnVar4.C5 = null;
                                    org.telegram.ui.ck ckVar = rnVar4.U;
                                    if (ckVar != null) {
                                        ckVar.S2 = null;
                                        ckVar.T2 = false;
                                    }
                                    MessagePreviewParams messagePreviewParams6 = rnVar4.b5;
                                    if (messagePreviewParams6 != null) {
                                        i172 = ((org.telegram.ui.ActionBar.n2) rnVar4).currentAccount;
                                        MessageObject messageObject = rnVar4.j5;
                                        messagePreviewParams6.updateLink(i172, null, null, messageObject == rnVar4.T3 ? null : messageObject, rnVar4.h5, rnVar4.l5);
                                    }
                                    rnVar4.j8();
                                    break;
                                case 12:
                                    ab0 ab0Var5 = this.b;
                                    MessagePreviewParams messagePreviewParams7 = ab0Var5.V.d;
                                    if (messagePreviewParams7.hasMedia) {
                                        boolean z14 = !messagePreviewParams7.webpageSmall;
                                        messagePreviewParams7.webpageSmall = z14;
                                        ab0Var5.C.a(z14, true);
                                        ab0Var5.D.a(messagePreviewParams7.webpageSmall, true);
                                        if (ab0Var5.r.messages.size() > 0 && (message2 = ab0Var5.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z15 = messagePreviewParams7.webpageSmall;
                                            messageMedia2.force_small_media = z15;
                                            messageMedia2.force_large_media = !z15;
                                        }
                                        if (ab0Var5.r.previewMessages.size() > 0 && (message = ab0Var5.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                            boolean z16 = messagePreviewParams7.webpageSmall;
                                            messageMedia.force_small_media = z16;
                                            messageMedia.force_large_media = !z16;
                                        }
                                        ab0Var5.h();
                                        ab0Var5.Q = true;
                                        break;
                                    }
                                    break;
                                default:
                                    ab0 ab0Var6 = this.b;
                                    MessagePreviewParams messagePreviewParams8 = ab0Var6.V.d;
                                    boolean z17 = messagePreviewParams8.webpageTop;
                                    messagePreviewParams8.webpageTop = !z17;
                                    ab0Var6.A.a(z17, true);
                                    if (ab0Var6.r.messages.size() > 0 && (message4 = ab0Var6.r.messages.get(0).messageOwner) != null) {
                                        message4.invert_media = messagePreviewParams8.webpageTop;
                                    }
                                    if (ab0Var6.r.previewMessages.size() > 0 && (message3 = ab0Var6.r.previewMessages.get(0).messageOwner) != null) {
                                        message3.invert_media = messagePreviewParams8.webpageTop;
                                    }
                                    ab0Var6.h();
                                    ab0Var6.Q = true;
                                    break;
                            }
                        }
                    });
                    r82.addView(f1Var6, h7.z5.n(-1, 48));
                    org.telegram.ui.ActionBar.k1 k1Var3 = new org.telegram.ui.ActionBar.k1(context3, cb0Var);
                    k1Var3.setColor(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, cb0Var)));
                    k1Var3.setTag(R.id.fit_width_tag, 1);
                    r82.addView(k1Var3, h7.z5.n(-1, 8));
                    org.telegram.ui.ActionBar.f1 f1Var7 = new org.telegram.ui.ActionBar.f1(0, context3, gb0Var.B, false, true);
                    f1Var7.g(LocaleController.getString(R.string.QuoteSelectedPart), R.drawable.menu_quote_specific, null);
                    z11 = true;
                    final boolean z13 = true ? 1 : 0;
                    f1Var7.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ka0
                        public final /* synthetic */ ab0 b;

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
                                    ab0 ab0Var2 = this.b;
                                    ab0Var2.V.d.quote = null;
                                    ab0Var2.e.f(false);
                                    ab0Var2.g(false, false);
                                    ab0Var2.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    ab0 ab0Var3 = this.b;
                                    sa0 sa0Var2 = ab0Var3.e;
                                    gb0 gb0Var2 = ab0Var3.V;
                                    if (ab0Var3.c(null) != null) {
                                        if (sa0Var2.v - sa0Var2.u <= MessagesController.getInstance(gb0Var2.w).quoteLengthMax) {
                                            org.telegram.ui.Cells.r9 r9Var = sa0Var2.W;
                                            MessageObject c11 = ab0Var3.c(r9Var != null ? ((org.telegram.ui.Cells.s1) r9Var).getMessageObject() : null);
                                            MessagePreviewParams messagePreviewParams4 = gb0Var2.d;
                                            int i182 = sa0Var2.u;
                                            messagePreviewParams4.quoteStart = i182;
                                            int i192 = sa0Var2.v;
                                            messagePreviewParams4.quoteEnd = i192;
                                            messagePreviewParams4.quote = org.telegram.ui.hn.b(i182, i192, c11);
                                            gb0Var2.b();
                                            gb0Var2.a(true);
                                            break;
                                        } else {
                                            ab0Var3.f();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    ab0 ab0Var4 = this.b;
                                    sa0 sa0Var3 = ab0Var4.e;
                                    gb0 gb0Var3 = ab0Var4.V;
                                    MessagePreviewParams messagePreviewParams5 = gb0Var3.d;
                                    int i202 = gb0Var3.w;
                                    boolean z132 = gb0Var3.b;
                                    if (messagePreviewParams5.quote != null && !z132) {
                                        messagePreviewParams5.quote = null;
                                        sa0Var3.f(false);
                                        ab0Var4.g(false, true);
                                        ab0Var4.k(true);
                                        break;
                                    } else if (sa0Var3.v - sa0Var3.u <= MessagesController.getInstance(i202).quoteLengthMax) {
                                        MessageObject c12 = ab0Var4.c(null);
                                        if (c12 != null) {
                                            if (!sa0Var3.y()) {
                                                messagePreviewParams5.quoteStart = 0;
                                                int min = Math.min(MessagesController.getInstance(i202).quoteLengthMax, c12.messageOwner.message.length());
                                                messagePreviewParams5.quoteEnd = min;
                                                messagePreviewParams5.quote = org.telegram.ui.hn.b(messagePreviewParams5.quoteStart, min, c12);
                                                View d10 = ab0Var4.d();
                                                if (d10 instanceof org.telegram.ui.Cells.s1) {
                                                    sa0Var3.a0((org.telegram.ui.Cells.s1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                }
                                                if (!z132) {
                                                    ab0Var4.s.getSwipeBack().e(ab0Var4.E);
                                                }
                                                ab0Var4.g(true, true);
                                                break;
                                            } else {
                                                messagePreviewParams5.quoteStart = sa0Var3.u;
                                                messagePreviewParams5.quoteEnd = sa0Var3.v;
                                                org.telegram.ui.Cells.r9 r9Var2 = sa0Var3.W;
                                                messagePreviewParams5.quote = org.telegram.ui.hn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, ab0Var4.c(r9Var2 != null ? ((org.telegram.ui.Cells.s1) r9Var2).getMessageObject() : null));
                                                gb0Var3.b();
                                                gb0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        ab0Var4.f();
                                        break;
                                    }
                                    break;
                                case 3:
                                    this.b.V.c(false);
                                    break;
                                case 4:
                                    this.b.V.c(false);
                                    break;
                                case 5:
                                    this.b.V.a(true);
                                    break;
                                case 6:
                                    gb0 gb0Var4 = this.b.V;
                                    if (!gb0Var4.b) {
                                        org.telegram.ui.yk ykVar = (org.telegram.ui.yk) gb0Var4;
                                        ykVar.a(true);
                                        org.telegram.ui.rn rnVar = ykVar.D;
                                        rnVar.j5 = null;
                                        rnVar.h5 = null;
                                        rnVar.b5.updateReply(null, null, rnVar.P5, null);
                                        rnVar.j8();
                                        break;
                                    } else {
                                        org.telegram.ui.yk ykVar2 = (org.telegram.ui.yk) gb0Var4;
                                        ykVar2.a(true);
                                        org.telegram.ui.rn rnVar2 = ykVar2.D;
                                        rnVar2.h5 = null;
                                        rnVar2.Bb(rnVar2.j5);
                                        break;
                                    }
                                case 7:
                                    this.b.V.c(true);
                                    break;
                                case 8:
                                    this.b.V.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.yk ykVar3 = (org.telegram.ui.yk) this.b.V;
                                    ykVar3.a(true);
                                    org.telegram.ui.rn rnVar3 = ykVar3.D;
                                    rnVar3.b5.updateForward(null, rnVar3.P5);
                                    rnVar3.j8();
                                    break;
                                case 10:
                                    this.b.V.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.yk ykVar4 = (org.telegram.ui.yk) this.b.V;
                                    ykVar4.a(true);
                                    org.telegram.ui.rn rnVar4 = ykVar4.D;
                                    rnVar4.C5 = null;
                                    org.telegram.ui.ck ckVar = rnVar4.U;
                                    if (ckVar != null) {
                                        ckVar.S2 = null;
                                        ckVar.T2 = false;
                                    }
                                    MessagePreviewParams messagePreviewParams6 = rnVar4.b5;
                                    if (messagePreviewParams6 != null) {
                                        i172 = ((org.telegram.ui.ActionBar.n2) rnVar4).currentAccount;
                                        MessageObject messageObject = rnVar4.j5;
                                        messagePreviewParams6.updateLink(i172, null, null, messageObject == rnVar4.T3 ? null : messageObject, rnVar4.h5, rnVar4.l5);
                                    }
                                    rnVar4.j8();
                                    break;
                                case 12:
                                    ab0 ab0Var5 = this.b;
                                    MessagePreviewParams messagePreviewParams7 = ab0Var5.V.d;
                                    if (messagePreviewParams7.hasMedia) {
                                        boolean z14 = !messagePreviewParams7.webpageSmall;
                                        messagePreviewParams7.webpageSmall = z14;
                                        ab0Var5.C.a(z14, true);
                                        ab0Var5.D.a(messagePreviewParams7.webpageSmall, true);
                                        if (ab0Var5.r.messages.size() > 0 && (message2 = ab0Var5.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z15 = messagePreviewParams7.webpageSmall;
                                            messageMedia2.force_small_media = z15;
                                            messageMedia2.force_large_media = !z15;
                                        }
                                        if (ab0Var5.r.previewMessages.size() > 0 && (message = ab0Var5.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                            boolean z16 = messagePreviewParams7.webpageSmall;
                                            messageMedia.force_small_media = z16;
                                            messageMedia.force_large_media = !z16;
                                        }
                                        ab0Var5.h();
                                        ab0Var5.Q = true;
                                        break;
                                    }
                                    break;
                                default:
                                    ab0 ab0Var6 = this.b;
                                    MessagePreviewParams messagePreviewParams8 = ab0Var6.V.d;
                                    boolean z17 = messagePreviewParams8.webpageTop;
                                    messagePreviewParams8.webpageTop = !z17;
                                    ab0Var6.A.a(z17, true);
                                    if (ab0Var6.r.messages.size() > 0 && (message4 = ab0Var6.r.messages.get(0).messageOwner) != null) {
                                        message4.invert_media = messagePreviewParams8.webpageTop;
                                    }
                                    if (ab0Var6.r.previewMessages.size() > 0 && (message3 = ab0Var6.r.previewMessages.get(0).messageOwner) != null) {
                                        message3.invert_media = messagePreviewParams8.webpageTop;
                                    }
                                    ab0Var6.h();
                                    ab0Var6.Q = true;
                                    break;
                            }
                        }
                    });
                    r82.addView(f1Var7, h7.z5.n(-1, 48));
                    linearLayout = r82;
                }
                this.E = actionBarPopupWindow$ActionBarPopupWindowLayout.b(linearLayout);
                actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().setStickToRight(z11);
                FrameLayout frameLayout2 = new FrameLayout(context3);
                ra0 ra0Var = new ra0(1, 0, context, gb0Var.B, true, false);
                this.v = ra0Var;
                ra0Var.g(LocaleController.getString(z12 ? R.string.QuoteSelectedPart : R.string.SelectSpecificQuote), R.drawable.menu_select_quote, null);
                ra0 ra0Var2 = new ra0(1, 1, context, gb0Var.B, true, false);
                context3 = context;
                this.w = ra0Var2;
                ra0Var2.g(LocaleController.getString(R.string.ClearQuote), R.drawable.menu_quote_delete, null);
                frameLayout2.setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.I5, cb0Var), 6, 0));
                final int i26 = 2;
                frameLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ka0
                    public final /* synthetic */ ab0 b;

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
                        switch (i26) {
                            case 0:
                                ab0 ab0Var2 = this.b;
                                ab0Var2.V.d.quote = null;
                                ab0Var2.e.f(false);
                                ab0Var2.g(false, false);
                                ab0Var2.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                ab0 ab0Var3 = this.b;
                                sa0 sa0Var2 = ab0Var3.e;
                                gb0 gb0Var2 = ab0Var3.V;
                                if (ab0Var3.c(null) != null) {
                                    if (sa0Var2.v - sa0Var2.u <= MessagesController.getInstance(gb0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.r9 r9Var = sa0Var2.W;
                                        MessageObject c11 = ab0Var3.c(r9Var != null ? ((org.telegram.ui.Cells.s1) r9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams4 = gb0Var2.d;
                                        int i182 = sa0Var2.u;
                                        messagePreviewParams4.quoteStart = i182;
                                        int i192 = sa0Var2.v;
                                        messagePreviewParams4.quoteEnd = i192;
                                        messagePreviewParams4.quote = org.telegram.ui.hn.b(i182, i192, c11);
                                        gb0Var2.b();
                                        gb0Var2.a(true);
                                        break;
                                    } else {
                                        ab0Var3.f();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                ab0 ab0Var4 = this.b;
                                sa0 sa0Var3 = ab0Var4.e;
                                gb0 gb0Var3 = ab0Var4.V;
                                MessagePreviewParams messagePreviewParams5 = gb0Var3.d;
                                int i202 = gb0Var3.w;
                                boolean z132 = gb0Var3.b;
                                if (messagePreviewParams5.quote != null && !z132) {
                                    messagePreviewParams5.quote = null;
                                    sa0Var3.f(false);
                                    ab0Var4.g(false, true);
                                    ab0Var4.k(true);
                                    break;
                                } else if (sa0Var3.v - sa0Var3.u <= MessagesController.getInstance(i202).quoteLengthMax) {
                                    MessageObject c12 = ab0Var4.c(null);
                                    if (c12 != null) {
                                        if (!sa0Var3.y()) {
                                            messagePreviewParams5.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i202).quoteLengthMax, c12.messageOwner.message.length());
                                            messagePreviewParams5.quoteEnd = min;
                                            messagePreviewParams5.quote = org.telegram.ui.hn.b(messagePreviewParams5.quoteStart, min, c12);
                                            View d10 = ab0Var4.d();
                                            if (d10 instanceof org.telegram.ui.Cells.s1) {
                                                sa0Var3.a0((org.telegram.ui.Cells.s1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            }
                                            if (!z132) {
                                                ab0Var4.s.getSwipeBack().e(ab0Var4.E);
                                            }
                                            ab0Var4.g(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams5.quoteStart = sa0Var3.u;
                                            messagePreviewParams5.quoteEnd = sa0Var3.v;
                                            org.telegram.ui.Cells.r9 r9Var2 = sa0Var3.W;
                                            messagePreviewParams5.quote = org.telegram.ui.hn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, ab0Var4.c(r9Var2 != null ? ((org.telegram.ui.Cells.s1) r9Var2).getMessageObject() : null));
                                            gb0Var3.b();
                                            gb0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    ab0Var4.f();
                                    break;
                                }
                                break;
                            case 3:
                                this.b.V.c(false);
                                break;
                            case 4:
                                this.b.V.c(false);
                                break;
                            case 5:
                                this.b.V.a(true);
                                break;
                            case 6:
                                gb0 gb0Var4 = this.b.V;
                                if (!gb0Var4.b) {
                                    org.telegram.ui.yk ykVar = (org.telegram.ui.yk) gb0Var4;
                                    ykVar.a(true);
                                    org.telegram.ui.rn rnVar = ykVar.D;
                                    rnVar.j5 = null;
                                    rnVar.h5 = null;
                                    rnVar.b5.updateReply(null, null, rnVar.P5, null);
                                    rnVar.j8();
                                    break;
                                } else {
                                    org.telegram.ui.yk ykVar2 = (org.telegram.ui.yk) gb0Var4;
                                    ykVar2.a(true);
                                    org.telegram.ui.rn rnVar2 = ykVar2.D;
                                    rnVar2.h5 = null;
                                    rnVar2.Bb(rnVar2.j5);
                                    break;
                                }
                            case 7:
                                this.b.V.c(true);
                                break;
                            case 8:
                                this.b.V.a(true);
                                break;
                            case 9:
                                org.telegram.ui.yk ykVar3 = (org.telegram.ui.yk) this.b.V;
                                ykVar3.a(true);
                                org.telegram.ui.rn rnVar3 = ykVar3.D;
                                rnVar3.b5.updateForward(null, rnVar3.P5);
                                rnVar3.j8();
                                break;
                            case 10:
                                this.b.V.a(true);
                                break;
                            case 11:
                                org.telegram.ui.yk ykVar4 = (org.telegram.ui.yk) this.b.V;
                                ykVar4.a(true);
                                org.telegram.ui.rn rnVar4 = ykVar4.D;
                                rnVar4.C5 = null;
                                org.telegram.ui.ck ckVar = rnVar4.U;
                                if (ckVar != null) {
                                    ckVar.S2 = null;
                                    ckVar.T2 = false;
                                }
                                MessagePreviewParams messagePreviewParams6 = rnVar4.b5;
                                if (messagePreviewParams6 != null) {
                                    i172 = ((org.telegram.ui.ActionBar.n2) rnVar4).currentAccount;
                                    MessageObject messageObject = rnVar4.j5;
                                    messagePreviewParams6.updateLink(i172, null, null, messageObject == rnVar4.T3 ? null : messageObject, rnVar4.h5, rnVar4.l5);
                                }
                                rnVar4.j8();
                                break;
                            case 12:
                                ab0 ab0Var5 = this.b;
                                MessagePreviewParams messagePreviewParams7 = ab0Var5.V.d;
                                if (messagePreviewParams7.hasMedia) {
                                    boolean z14 = !messagePreviewParams7.webpageSmall;
                                    messagePreviewParams7.webpageSmall = z14;
                                    ab0Var5.C.a(z14, true);
                                    ab0Var5.D.a(messagePreviewParams7.webpageSmall, true);
                                    if (ab0Var5.r.messages.size() > 0 && (message2 = ab0Var5.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z15 = messagePreviewParams7.webpageSmall;
                                        messageMedia2.force_small_media = z15;
                                        messageMedia2.force_large_media = !z15;
                                    }
                                    if (ab0Var5.r.previewMessages.size() > 0 && (message = ab0Var5.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z16 = messagePreviewParams7.webpageSmall;
                                        messageMedia.force_small_media = z16;
                                        messageMedia.force_large_media = !z16;
                                    }
                                    ab0Var5.h();
                                    ab0Var5.Q = true;
                                    break;
                                }
                                break;
                            default:
                                ab0 ab0Var6 = this.b;
                                MessagePreviewParams messagePreviewParams8 = ab0Var6.V.d;
                                boolean z17 = messagePreviewParams8.webpageTop;
                                messagePreviewParams8.webpageTop = !z17;
                                ab0Var6.A.a(z17, true);
                                if (ab0Var6.r.messages.size() > 0 && (message4 = ab0Var6.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams8.webpageTop;
                                }
                                if (ab0Var6.r.previewMessages.size() > 0 && (message3 = ab0Var6.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams8.webpageTop;
                                }
                                ab0Var6.h();
                                ab0Var6.Q = true;
                                break;
                        }
                    }
                });
                frameLayout2.addView(ra0Var, h7.z5.c(48.0f, -1));
                frameLayout2.addView(ra0Var2, h7.z5.c(48.0f, -1));
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout2, h7.z5.n(-1, 48));
                messagePreviewParams = messagePreviewParams2;
            }
            if (messagePreviewParams.monoforum || messagePreviewParams.noforwards || messagePreviewParams.hasSecretMessages) {
                i11 = 48;
            } else {
                FrameLayout frameLayout3 = new FrameLayout(context3);
                org.telegram.ui.ActionBar.f1 f1Var8 = new org.telegram.ui.ActionBar.f1(1, context3, gb0Var.B, false, false);
                this.x = f1Var8;
                f1Var8.g(LocaleController.getString(R.string.ReplyToAnotherChat), R.drawable.msg_forward_replace, null);
                final int i27 = 3;
                f1Var8.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ka0
                    public final /* synthetic */ ab0 b;

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
                                ab0 ab0Var2 = this.b;
                                ab0Var2.V.d.quote = null;
                                ab0Var2.e.f(false);
                                ab0Var2.g(false, false);
                                ab0Var2.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                ab0 ab0Var3 = this.b;
                                sa0 sa0Var2 = ab0Var3.e;
                                gb0 gb0Var2 = ab0Var3.V;
                                if (ab0Var3.c(null) != null) {
                                    if (sa0Var2.v - sa0Var2.u <= MessagesController.getInstance(gb0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.r9 r9Var = sa0Var2.W;
                                        MessageObject c11 = ab0Var3.c(r9Var != null ? ((org.telegram.ui.Cells.s1) r9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams4 = gb0Var2.d;
                                        int i182 = sa0Var2.u;
                                        messagePreviewParams4.quoteStart = i182;
                                        int i192 = sa0Var2.v;
                                        messagePreviewParams4.quoteEnd = i192;
                                        messagePreviewParams4.quote = org.telegram.ui.hn.b(i182, i192, c11);
                                        gb0Var2.b();
                                        gb0Var2.a(true);
                                        break;
                                    } else {
                                        ab0Var3.f();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                ab0 ab0Var4 = this.b;
                                sa0 sa0Var3 = ab0Var4.e;
                                gb0 gb0Var3 = ab0Var4.V;
                                MessagePreviewParams messagePreviewParams5 = gb0Var3.d;
                                int i202 = gb0Var3.w;
                                boolean z132 = gb0Var3.b;
                                if (messagePreviewParams5.quote != null && !z132) {
                                    messagePreviewParams5.quote = null;
                                    sa0Var3.f(false);
                                    ab0Var4.g(false, true);
                                    ab0Var4.k(true);
                                    break;
                                } else if (sa0Var3.v - sa0Var3.u <= MessagesController.getInstance(i202).quoteLengthMax) {
                                    MessageObject c12 = ab0Var4.c(null);
                                    if (c12 != null) {
                                        if (!sa0Var3.y()) {
                                            messagePreviewParams5.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i202).quoteLengthMax, c12.messageOwner.message.length());
                                            messagePreviewParams5.quoteEnd = min;
                                            messagePreviewParams5.quote = org.telegram.ui.hn.b(messagePreviewParams5.quoteStart, min, c12);
                                            View d10 = ab0Var4.d();
                                            if (d10 instanceof org.telegram.ui.Cells.s1) {
                                                sa0Var3.a0((org.telegram.ui.Cells.s1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            }
                                            if (!z132) {
                                                ab0Var4.s.getSwipeBack().e(ab0Var4.E);
                                            }
                                            ab0Var4.g(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams5.quoteStart = sa0Var3.u;
                                            messagePreviewParams5.quoteEnd = sa0Var3.v;
                                            org.telegram.ui.Cells.r9 r9Var2 = sa0Var3.W;
                                            messagePreviewParams5.quote = org.telegram.ui.hn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, ab0Var4.c(r9Var2 != null ? ((org.telegram.ui.Cells.s1) r9Var2).getMessageObject() : null));
                                            gb0Var3.b();
                                            gb0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    ab0Var4.f();
                                    break;
                                }
                                break;
                            case 3:
                                this.b.V.c(false);
                                break;
                            case 4:
                                this.b.V.c(false);
                                break;
                            case 5:
                                this.b.V.a(true);
                                break;
                            case 6:
                                gb0 gb0Var4 = this.b.V;
                                if (!gb0Var4.b) {
                                    org.telegram.ui.yk ykVar = (org.telegram.ui.yk) gb0Var4;
                                    ykVar.a(true);
                                    org.telegram.ui.rn rnVar = ykVar.D;
                                    rnVar.j5 = null;
                                    rnVar.h5 = null;
                                    rnVar.b5.updateReply(null, null, rnVar.P5, null);
                                    rnVar.j8();
                                    break;
                                } else {
                                    org.telegram.ui.yk ykVar2 = (org.telegram.ui.yk) gb0Var4;
                                    ykVar2.a(true);
                                    org.telegram.ui.rn rnVar2 = ykVar2.D;
                                    rnVar2.h5 = null;
                                    rnVar2.Bb(rnVar2.j5);
                                    break;
                                }
                            case 7:
                                this.b.V.c(true);
                                break;
                            case 8:
                                this.b.V.a(true);
                                break;
                            case 9:
                                org.telegram.ui.yk ykVar3 = (org.telegram.ui.yk) this.b.V;
                                ykVar3.a(true);
                                org.telegram.ui.rn rnVar3 = ykVar3.D;
                                rnVar3.b5.updateForward(null, rnVar3.P5);
                                rnVar3.j8();
                                break;
                            case 10:
                                this.b.V.a(true);
                                break;
                            case 11:
                                org.telegram.ui.yk ykVar4 = (org.telegram.ui.yk) this.b.V;
                                ykVar4.a(true);
                                org.telegram.ui.rn rnVar4 = ykVar4.D;
                                rnVar4.C5 = null;
                                org.telegram.ui.ck ckVar = rnVar4.U;
                                if (ckVar != null) {
                                    ckVar.S2 = null;
                                    ckVar.T2 = false;
                                }
                                MessagePreviewParams messagePreviewParams6 = rnVar4.b5;
                                if (messagePreviewParams6 != null) {
                                    i172 = ((org.telegram.ui.ActionBar.n2) rnVar4).currentAccount;
                                    MessageObject messageObject = rnVar4.j5;
                                    messagePreviewParams6.updateLink(i172, null, null, messageObject == rnVar4.T3 ? null : messageObject, rnVar4.h5, rnVar4.l5);
                                }
                                rnVar4.j8();
                                break;
                            case 12:
                                ab0 ab0Var5 = this.b;
                                MessagePreviewParams messagePreviewParams7 = ab0Var5.V.d;
                                if (messagePreviewParams7.hasMedia) {
                                    boolean z14 = !messagePreviewParams7.webpageSmall;
                                    messagePreviewParams7.webpageSmall = z14;
                                    ab0Var5.C.a(z14, true);
                                    ab0Var5.D.a(messagePreviewParams7.webpageSmall, true);
                                    if (ab0Var5.r.messages.size() > 0 && (message2 = ab0Var5.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z15 = messagePreviewParams7.webpageSmall;
                                        messageMedia2.force_small_media = z15;
                                        messageMedia2.force_large_media = !z15;
                                    }
                                    if (ab0Var5.r.previewMessages.size() > 0 && (message = ab0Var5.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z16 = messagePreviewParams7.webpageSmall;
                                        messageMedia.force_small_media = z16;
                                        messageMedia.force_large_media = !z16;
                                    }
                                    ab0Var5.h();
                                    ab0Var5.Q = true;
                                    break;
                                }
                                break;
                            default:
                                ab0 ab0Var6 = this.b;
                                MessagePreviewParams messagePreviewParams8 = ab0Var6.V.d;
                                boolean z17 = messagePreviewParams8.webpageTop;
                                messagePreviewParams8.webpageTop = !z17;
                                ab0Var6.A.a(z17, true);
                                if (ab0Var6.r.messages.size() > 0 && (message4 = ab0Var6.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams8.webpageTop;
                                }
                                if (ab0Var6.r.previewMessages.size() > 0 && (message3 = ab0Var6.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams8.webpageTop;
                                }
                                ab0Var6.h();
                                ab0Var6.Q = true;
                                break;
                        }
                    }
                });
                context3 = context;
                org.telegram.ui.ActionBar.f1 f1Var9 = new org.telegram.ui.ActionBar.f1(1, context3, gb0Var.B, false, false);
                this.y = f1Var9;
                f1Var9.g(LocaleController.getString(R.string.QuoteToAnotherChat), R.drawable.msg_forward_replace, null);
                final int i28 = 4;
                f1Var9.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ka0
                    public final /* synthetic */ ab0 b;

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
                        switch (i28) {
                            case 0:
                                ab0 ab0Var2 = this.b;
                                ab0Var2.V.d.quote = null;
                                ab0Var2.e.f(false);
                                ab0Var2.g(false, false);
                                ab0Var2.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                ab0 ab0Var3 = this.b;
                                sa0 sa0Var2 = ab0Var3.e;
                                gb0 gb0Var2 = ab0Var3.V;
                                if (ab0Var3.c(null) != null) {
                                    if (sa0Var2.v - sa0Var2.u <= MessagesController.getInstance(gb0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.r9 r9Var = sa0Var2.W;
                                        MessageObject c11 = ab0Var3.c(r9Var != null ? ((org.telegram.ui.Cells.s1) r9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams4 = gb0Var2.d;
                                        int i182 = sa0Var2.u;
                                        messagePreviewParams4.quoteStart = i182;
                                        int i192 = sa0Var2.v;
                                        messagePreviewParams4.quoteEnd = i192;
                                        messagePreviewParams4.quote = org.telegram.ui.hn.b(i182, i192, c11);
                                        gb0Var2.b();
                                        gb0Var2.a(true);
                                        break;
                                    } else {
                                        ab0Var3.f();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                ab0 ab0Var4 = this.b;
                                sa0 sa0Var3 = ab0Var4.e;
                                gb0 gb0Var3 = ab0Var4.V;
                                MessagePreviewParams messagePreviewParams5 = gb0Var3.d;
                                int i202 = gb0Var3.w;
                                boolean z132 = gb0Var3.b;
                                if (messagePreviewParams5.quote != null && !z132) {
                                    messagePreviewParams5.quote = null;
                                    sa0Var3.f(false);
                                    ab0Var4.g(false, true);
                                    ab0Var4.k(true);
                                    break;
                                } else if (sa0Var3.v - sa0Var3.u <= MessagesController.getInstance(i202).quoteLengthMax) {
                                    MessageObject c12 = ab0Var4.c(null);
                                    if (c12 != null) {
                                        if (!sa0Var3.y()) {
                                            messagePreviewParams5.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i202).quoteLengthMax, c12.messageOwner.message.length());
                                            messagePreviewParams5.quoteEnd = min;
                                            messagePreviewParams5.quote = org.telegram.ui.hn.b(messagePreviewParams5.quoteStart, min, c12);
                                            View d10 = ab0Var4.d();
                                            if (d10 instanceof org.telegram.ui.Cells.s1) {
                                                sa0Var3.a0((org.telegram.ui.Cells.s1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            }
                                            if (!z132) {
                                                ab0Var4.s.getSwipeBack().e(ab0Var4.E);
                                            }
                                            ab0Var4.g(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams5.quoteStart = sa0Var3.u;
                                            messagePreviewParams5.quoteEnd = sa0Var3.v;
                                            org.telegram.ui.Cells.r9 r9Var2 = sa0Var3.W;
                                            messagePreviewParams5.quote = org.telegram.ui.hn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, ab0Var4.c(r9Var2 != null ? ((org.telegram.ui.Cells.s1) r9Var2).getMessageObject() : null));
                                            gb0Var3.b();
                                            gb0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    ab0Var4.f();
                                    break;
                                }
                                break;
                            case 3:
                                this.b.V.c(false);
                                break;
                            case 4:
                                this.b.V.c(false);
                                break;
                            case 5:
                                this.b.V.a(true);
                                break;
                            case 6:
                                gb0 gb0Var4 = this.b.V;
                                if (!gb0Var4.b) {
                                    org.telegram.ui.yk ykVar = (org.telegram.ui.yk) gb0Var4;
                                    ykVar.a(true);
                                    org.telegram.ui.rn rnVar = ykVar.D;
                                    rnVar.j5 = null;
                                    rnVar.h5 = null;
                                    rnVar.b5.updateReply(null, null, rnVar.P5, null);
                                    rnVar.j8();
                                    break;
                                } else {
                                    org.telegram.ui.yk ykVar2 = (org.telegram.ui.yk) gb0Var4;
                                    ykVar2.a(true);
                                    org.telegram.ui.rn rnVar2 = ykVar2.D;
                                    rnVar2.h5 = null;
                                    rnVar2.Bb(rnVar2.j5);
                                    break;
                                }
                            case 7:
                                this.b.V.c(true);
                                break;
                            case 8:
                                this.b.V.a(true);
                                break;
                            case 9:
                                org.telegram.ui.yk ykVar3 = (org.telegram.ui.yk) this.b.V;
                                ykVar3.a(true);
                                org.telegram.ui.rn rnVar3 = ykVar3.D;
                                rnVar3.b5.updateForward(null, rnVar3.P5);
                                rnVar3.j8();
                                break;
                            case 10:
                                this.b.V.a(true);
                                break;
                            case 11:
                                org.telegram.ui.yk ykVar4 = (org.telegram.ui.yk) this.b.V;
                                ykVar4.a(true);
                                org.telegram.ui.rn rnVar4 = ykVar4.D;
                                rnVar4.C5 = null;
                                org.telegram.ui.ck ckVar = rnVar4.U;
                                if (ckVar != null) {
                                    ckVar.S2 = null;
                                    ckVar.T2 = false;
                                }
                                MessagePreviewParams messagePreviewParams6 = rnVar4.b5;
                                if (messagePreviewParams6 != null) {
                                    i172 = ((org.telegram.ui.ActionBar.n2) rnVar4).currentAccount;
                                    MessageObject messageObject = rnVar4.j5;
                                    messagePreviewParams6.updateLink(i172, null, null, messageObject == rnVar4.T3 ? null : messageObject, rnVar4.h5, rnVar4.l5);
                                }
                                rnVar4.j8();
                                break;
                            case 12:
                                ab0 ab0Var5 = this.b;
                                MessagePreviewParams messagePreviewParams7 = ab0Var5.V.d;
                                if (messagePreviewParams7.hasMedia) {
                                    boolean z14 = !messagePreviewParams7.webpageSmall;
                                    messagePreviewParams7.webpageSmall = z14;
                                    ab0Var5.C.a(z14, true);
                                    ab0Var5.D.a(messagePreviewParams7.webpageSmall, true);
                                    if (ab0Var5.r.messages.size() > 0 && (message2 = ab0Var5.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z15 = messagePreviewParams7.webpageSmall;
                                        messageMedia2.force_small_media = z15;
                                        messageMedia2.force_large_media = !z15;
                                    }
                                    if (ab0Var5.r.previewMessages.size() > 0 && (message = ab0Var5.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z16 = messagePreviewParams7.webpageSmall;
                                        messageMedia.force_small_media = z16;
                                        messageMedia.force_large_media = !z16;
                                    }
                                    ab0Var5.h();
                                    ab0Var5.Q = true;
                                    break;
                                }
                                break;
                            default:
                                ab0 ab0Var6 = this.b;
                                MessagePreviewParams messagePreviewParams8 = ab0Var6.V.d;
                                boolean z17 = messagePreviewParams8.webpageTop;
                                messagePreviewParams8.webpageTop = !z17;
                                ab0Var6.A.a(z17, true);
                                if (ab0Var6.r.messages.size() > 0 && (message4 = ab0Var6.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams8.webpageTop;
                                }
                                if (ab0Var6.r.previewMessages.size() > 0 && (message3 = ab0Var6.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams8.webpageTop;
                                }
                                ab0Var6.h();
                                ab0Var6.Q = true;
                                break;
                        }
                    }
                });
                frameLayout3.addView(f1Var9, h7.z5.c(48.0f, -1));
                frameLayout3.addView(f1Var8, h7.z5.c(48.0f, -1));
                i11 = 48;
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout3, h7.z5.n(-1, 48));
            }
            if (!messagePreviewParams.noforwards && !messagePreviewParams.hasSecretMessages) {
                org.telegram.ui.ActionBar.k1 k1Var4 = new org.telegram.ui.ActionBar.k1(context3, cb0Var);
                k1Var4.setColor(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, cb0Var)));
                k1Var4.setTag(R.id.fit_width_tag, 1);
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(k1Var4, h7.z5.n(-1, 8));
            }
            g(messagePreviewParams.quote != null, false);
            org.telegram.ui.ActionBar.f1 f1Var10 = new org.telegram.ui.ActionBar.f1(1, context3, gb0Var.B, false, false);
            f1Var10.g(LocaleController.getString(R.string.ApplyChanges), R.drawable.msg_select, null);
            final int i29 = 5;
            f1Var10.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ka0
                public final /* synthetic */ ab0 b;

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
                            ab0 ab0Var2 = this.b;
                            ab0Var2.V.d.quote = null;
                            ab0Var2.e.f(false);
                            ab0Var2.g(false, false);
                            ab0Var2.s.getSwipeBack().b(true);
                            break;
                        case 1:
                            ab0 ab0Var3 = this.b;
                            sa0 sa0Var2 = ab0Var3.e;
                            gb0 gb0Var2 = ab0Var3.V;
                            if (ab0Var3.c(null) != null) {
                                if (sa0Var2.v - sa0Var2.u <= MessagesController.getInstance(gb0Var2.w).quoteLengthMax) {
                                    org.telegram.ui.Cells.r9 r9Var = sa0Var2.W;
                                    MessageObject c11 = ab0Var3.c(r9Var != null ? ((org.telegram.ui.Cells.s1) r9Var).getMessageObject() : null);
                                    MessagePreviewParams messagePreviewParams4 = gb0Var2.d;
                                    int i182 = sa0Var2.u;
                                    messagePreviewParams4.quoteStart = i182;
                                    int i192 = sa0Var2.v;
                                    messagePreviewParams4.quoteEnd = i192;
                                    messagePreviewParams4.quote = org.telegram.ui.hn.b(i182, i192, c11);
                                    gb0Var2.b();
                                    gb0Var2.a(true);
                                    break;
                                } else {
                                    ab0Var3.f();
                                    break;
                                }
                            }
                            break;
                        case 2:
                            ab0 ab0Var4 = this.b;
                            sa0 sa0Var3 = ab0Var4.e;
                            gb0 gb0Var3 = ab0Var4.V;
                            MessagePreviewParams messagePreviewParams5 = gb0Var3.d;
                            int i202 = gb0Var3.w;
                            boolean z132 = gb0Var3.b;
                            if (messagePreviewParams5.quote != null && !z132) {
                                messagePreviewParams5.quote = null;
                                sa0Var3.f(false);
                                ab0Var4.g(false, true);
                                ab0Var4.k(true);
                                break;
                            } else if (sa0Var3.v - sa0Var3.u <= MessagesController.getInstance(i202).quoteLengthMax) {
                                MessageObject c12 = ab0Var4.c(null);
                                if (c12 != null) {
                                    if (!sa0Var3.y()) {
                                        messagePreviewParams5.quoteStart = 0;
                                        int min = Math.min(MessagesController.getInstance(i202).quoteLengthMax, c12.messageOwner.message.length());
                                        messagePreviewParams5.quoteEnd = min;
                                        messagePreviewParams5.quote = org.telegram.ui.hn.b(messagePreviewParams5.quoteStart, min, c12);
                                        View d10 = ab0Var4.d();
                                        if (d10 instanceof org.telegram.ui.Cells.s1) {
                                            sa0Var3.a0((org.telegram.ui.Cells.s1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                        }
                                        if (!z132) {
                                            ab0Var4.s.getSwipeBack().e(ab0Var4.E);
                                        }
                                        ab0Var4.g(true, true);
                                        break;
                                    } else {
                                        messagePreviewParams5.quoteStart = sa0Var3.u;
                                        messagePreviewParams5.quoteEnd = sa0Var3.v;
                                        org.telegram.ui.Cells.r9 r9Var2 = sa0Var3.W;
                                        messagePreviewParams5.quote = org.telegram.ui.hn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, ab0Var4.c(r9Var2 != null ? ((org.telegram.ui.Cells.s1) r9Var2).getMessageObject() : null));
                                        gb0Var3.b();
                                        gb0Var3.a(true);
                                        break;
                                    }
                                }
                            } else {
                                ab0Var4.f();
                                break;
                            }
                            break;
                        case 3:
                            this.b.V.c(false);
                            break;
                        case 4:
                            this.b.V.c(false);
                            break;
                        case 5:
                            this.b.V.a(true);
                            break;
                        case 6:
                            gb0 gb0Var4 = this.b.V;
                            if (!gb0Var4.b) {
                                org.telegram.ui.yk ykVar = (org.telegram.ui.yk) gb0Var4;
                                ykVar.a(true);
                                org.telegram.ui.rn rnVar = ykVar.D;
                                rnVar.j5 = null;
                                rnVar.h5 = null;
                                rnVar.b5.updateReply(null, null, rnVar.P5, null);
                                rnVar.j8();
                                break;
                            } else {
                                org.telegram.ui.yk ykVar2 = (org.telegram.ui.yk) gb0Var4;
                                ykVar2.a(true);
                                org.telegram.ui.rn rnVar2 = ykVar2.D;
                                rnVar2.h5 = null;
                                rnVar2.Bb(rnVar2.j5);
                                break;
                            }
                        case 7:
                            this.b.V.c(true);
                            break;
                        case 8:
                            this.b.V.a(true);
                            break;
                        case 9:
                            org.telegram.ui.yk ykVar3 = (org.telegram.ui.yk) this.b.V;
                            ykVar3.a(true);
                            org.telegram.ui.rn rnVar3 = ykVar3.D;
                            rnVar3.b5.updateForward(null, rnVar3.P5);
                            rnVar3.j8();
                            break;
                        case 10:
                            this.b.V.a(true);
                            break;
                        case 11:
                            org.telegram.ui.yk ykVar4 = (org.telegram.ui.yk) this.b.V;
                            ykVar4.a(true);
                            org.telegram.ui.rn rnVar4 = ykVar4.D;
                            rnVar4.C5 = null;
                            org.telegram.ui.ck ckVar = rnVar4.U;
                            if (ckVar != null) {
                                ckVar.S2 = null;
                                ckVar.T2 = false;
                            }
                            MessagePreviewParams messagePreviewParams6 = rnVar4.b5;
                            if (messagePreviewParams6 != null) {
                                i172 = ((org.telegram.ui.ActionBar.n2) rnVar4).currentAccount;
                                MessageObject messageObject = rnVar4.j5;
                                messagePreviewParams6.updateLink(i172, null, null, messageObject == rnVar4.T3 ? null : messageObject, rnVar4.h5, rnVar4.l5);
                            }
                            rnVar4.j8();
                            break;
                        case 12:
                            ab0 ab0Var5 = this.b;
                            MessagePreviewParams messagePreviewParams7 = ab0Var5.V.d;
                            if (messagePreviewParams7.hasMedia) {
                                boolean z14 = !messagePreviewParams7.webpageSmall;
                                messagePreviewParams7.webpageSmall = z14;
                                ab0Var5.C.a(z14, true);
                                ab0Var5.D.a(messagePreviewParams7.webpageSmall, true);
                                if (ab0Var5.r.messages.size() > 0 && (message2 = ab0Var5.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                    boolean z15 = messagePreviewParams7.webpageSmall;
                                    messageMedia2.force_small_media = z15;
                                    messageMedia2.force_large_media = !z15;
                                }
                                if (ab0Var5.r.previewMessages.size() > 0 && (message = ab0Var5.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                    boolean z16 = messagePreviewParams7.webpageSmall;
                                    messageMedia.force_small_media = z16;
                                    messageMedia.force_large_media = !z16;
                                }
                                ab0Var5.h();
                                ab0Var5.Q = true;
                                break;
                            }
                            break;
                        default:
                            ab0 ab0Var6 = this.b;
                            MessagePreviewParams messagePreviewParams8 = ab0Var6.V.d;
                            boolean z17 = messagePreviewParams8.webpageTop;
                            messagePreviewParams8.webpageTop = !z17;
                            ab0Var6.A.a(z17, true);
                            if (ab0Var6.r.messages.size() > 0 && (message4 = ab0Var6.r.messages.get(0).messageOwner) != null) {
                                message4.invert_media = messagePreviewParams8.webpageTop;
                            }
                            if (ab0Var6.r.previewMessages.size() > 0 && (message3 = ab0Var6.r.previewMessages.get(0).messageOwner) != null) {
                                message3.invert_media = messagePreviewParams8.webpageTop;
                            }
                            ab0Var6.h();
                            ab0Var6.Q = true;
                            break;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(f1Var10, h7.z5.n(-1, i11));
            org.telegram.ui.ActionBar.f1 f1Var11 = new org.telegram.ui.ActionBar.f1(1, context, gb0Var.B, false, true);
            f1Var11.g(LocaleController.getString(z12 ? R.string.DoNotQuote : R.string.DoNotReply), R.drawable.msg_delete, null);
            int v04 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.q7, cb0Var);
            int i30 = org.telegram.ui.ActionBar.g6.p7;
            f1Var11.c(v04, org.telegram.ui.ActionBar.g6.v0(i30, cb0Var));
            f1Var11.setSelectorColor(org.telegram.ui.ActionBar.g6.l1(0.12f, org.telegram.ui.ActionBar.g6.w0(null, i30, false)));
            final int i31 = 6;
            f1Var11.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ka0
                public final /* synthetic */ ab0 b;

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
                            ab0 ab0Var2 = this.b;
                            ab0Var2.V.d.quote = null;
                            ab0Var2.e.f(false);
                            ab0Var2.g(false, false);
                            ab0Var2.s.getSwipeBack().b(true);
                            break;
                        case 1:
                            ab0 ab0Var3 = this.b;
                            sa0 sa0Var2 = ab0Var3.e;
                            gb0 gb0Var2 = ab0Var3.V;
                            if (ab0Var3.c(null) != null) {
                                if (sa0Var2.v - sa0Var2.u <= MessagesController.getInstance(gb0Var2.w).quoteLengthMax) {
                                    org.telegram.ui.Cells.r9 r9Var = sa0Var2.W;
                                    MessageObject c11 = ab0Var3.c(r9Var != null ? ((org.telegram.ui.Cells.s1) r9Var).getMessageObject() : null);
                                    MessagePreviewParams messagePreviewParams4 = gb0Var2.d;
                                    int i182 = sa0Var2.u;
                                    messagePreviewParams4.quoteStart = i182;
                                    int i192 = sa0Var2.v;
                                    messagePreviewParams4.quoteEnd = i192;
                                    messagePreviewParams4.quote = org.telegram.ui.hn.b(i182, i192, c11);
                                    gb0Var2.b();
                                    gb0Var2.a(true);
                                    break;
                                } else {
                                    ab0Var3.f();
                                    break;
                                }
                            }
                            break;
                        case 2:
                            ab0 ab0Var4 = this.b;
                            sa0 sa0Var3 = ab0Var4.e;
                            gb0 gb0Var3 = ab0Var4.V;
                            MessagePreviewParams messagePreviewParams5 = gb0Var3.d;
                            int i202 = gb0Var3.w;
                            boolean z132 = gb0Var3.b;
                            if (messagePreviewParams5.quote != null && !z132) {
                                messagePreviewParams5.quote = null;
                                sa0Var3.f(false);
                                ab0Var4.g(false, true);
                                ab0Var4.k(true);
                                break;
                            } else if (sa0Var3.v - sa0Var3.u <= MessagesController.getInstance(i202).quoteLengthMax) {
                                MessageObject c12 = ab0Var4.c(null);
                                if (c12 != null) {
                                    if (!sa0Var3.y()) {
                                        messagePreviewParams5.quoteStart = 0;
                                        int min = Math.min(MessagesController.getInstance(i202).quoteLengthMax, c12.messageOwner.message.length());
                                        messagePreviewParams5.quoteEnd = min;
                                        messagePreviewParams5.quote = org.telegram.ui.hn.b(messagePreviewParams5.quoteStart, min, c12);
                                        View d10 = ab0Var4.d();
                                        if (d10 instanceof org.telegram.ui.Cells.s1) {
                                            sa0Var3.a0((org.telegram.ui.Cells.s1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                        }
                                        if (!z132) {
                                            ab0Var4.s.getSwipeBack().e(ab0Var4.E);
                                        }
                                        ab0Var4.g(true, true);
                                        break;
                                    } else {
                                        messagePreviewParams5.quoteStart = sa0Var3.u;
                                        messagePreviewParams5.quoteEnd = sa0Var3.v;
                                        org.telegram.ui.Cells.r9 r9Var2 = sa0Var3.W;
                                        messagePreviewParams5.quote = org.telegram.ui.hn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, ab0Var4.c(r9Var2 != null ? ((org.telegram.ui.Cells.s1) r9Var2).getMessageObject() : null));
                                        gb0Var3.b();
                                        gb0Var3.a(true);
                                        break;
                                    }
                                }
                            } else {
                                ab0Var4.f();
                                break;
                            }
                            break;
                        case 3:
                            this.b.V.c(false);
                            break;
                        case 4:
                            this.b.V.c(false);
                            break;
                        case 5:
                            this.b.V.a(true);
                            break;
                        case 6:
                            gb0 gb0Var4 = this.b.V;
                            if (!gb0Var4.b) {
                                org.telegram.ui.yk ykVar = (org.telegram.ui.yk) gb0Var4;
                                ykVar.a(true);
                                org.telegram.ui.rn rnVar = ykVar.D;
                                rnVar.j5 = null;
                                rnVar.h5 = null;
                                rnVar.b5.updateReply(null, null, rnVar.P5, null);
                                rnVar.j8();
                                break;
                            } else {
                                org.telegram.ui.yk ykVar2 = (org.telegram.ui.yk) gb0Var4;
                                ykVar2.a(true);
                                org.telegram.ui.rn rnVar2 = ykVar2.D;
                                rnVar2.h5 = null;
                                rnVar2.Bb(rnVar2.j5);
                                break;
                            }
                        case 7:
                            this.b.V.c(true);
                            break;
                        case 8:
                            this.b.V.a(true);
                            break;
                        case 9:
                            org.telegram.ui.yk ykVar3 = (org.telegram.ui.yk) this.b.V;
                            ykVar3.a(true);
                            org.telegram.ui.rn rnVar3 = ykVar3.D;
                            rnVar3.b5.updateForward(null, rnVar3.P5);
                            rnVar3.j8();
                            break;
                        case 10:
                            this.b.V.a(true);
                            break;
                        case 11:
                            org.telegram.ui.yk ykVar4 = (org.telegram.ui.yk) this.b.V;
                            ykVar4.a(true);
                            org.telegram.ui.rn rnVar4 = ykVar4.D;
                            rnVar4.C5 = null;
                            org.telegram.ui.ck ckVar = rnVar4.U;
                            if (ckVar != null) {
                                ckVar.S2 = null;
                                ckVar.T2 = false;
                            }
                            MessagePreviewParams messagePreviewParams6 = rnVar4.b5;
                            if (messagePreviewParams6 != null) {
                                i172 = ((org.telegram.ui.ActionBar.n2) rnVar4).currentAccount;
                                MessageObject messageObject = rnVar4.j5;
                                messagePreviewParams6.updateLink(i172, null, null, messageObject == rnVar4.T3 ? null : messageObject, rnVar4.h5, rnVar4.l5);
                            }
                            rnVar4.j8();
                            break;
                        case 12:
                            ab0 ab0Var5 = this.b;
                            MessagePreviewParams messagePreviewParams7 = ab0Var5.V.d;
                            if (messagePreviewParams7.hasMedia) {
                                boolean z14 = !messagePreviewParams7.webpageSmall;
                                messagePreviewParams7.webpageSmall = z14;
                                ab0Var5.C.a(z14, true);
                                ab0Var5.D.a(messagePreviewParams7.webpageSmall, true);
                                if (ab0Var5.r.messages.size() > 0 && (message2 = ab0Var5.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                    boolean z15 = messagePreviewParams7.webpageSmall;
                                    messageMedia2.force_small_media = z15;
                                    messageMedia2.force_large_media = !z15;
                                }
                                if (ab0Var5.r.previewMessages.size() > 0 && (message = ab0Var5.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                    boolean z16 = messagePreviewParams7.webpageSmall;
                                    messageMedia.force_small_media = z16;
                                    messageMedia.force_large_media = !z16;
                                }
                                ab0Var5.h();
                                ab0Var5.Q = true;
                                break;
                            }
                            break;
                        default:
                            ab0 ab0Var6 = this.b;
                            MessagePreviewParams messagePreviewParams8 = ab0Var6.V.d;
                            boolean z17 = messagePreviewParams8.webpageTop;
                            messagePreviewParams8.webpageTop = !z17;
                            ab0Var6.A.a(z17, true);
                            if (ab0Var6.r.messages.size() > 0 && (message4 = ab0Var6.r.messages.get(0).messageOwner) != null) {
                                message4.invert_media = messagePreviewParams8.webpageTop;
                            }
                            if (ab0Var6.r.previewMessages.size() > 0 && (message3 = ab0Var6.r.previewMessages.get(0).messageOwner) != null) {
                                message3.invert_media = messagePreviewParams8.webpageTop;
                            }
                            ab0Var6.h();
                            ab0Var6.Q = true;
                            break;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(f1Var11, h7.z5.n(-1, i11));
            context2 = context;
            ab0Var = this;
        }
        int i32 = ab0Var.a;
        if (i32 == 1) {
            ab0Var.r = messagePreviewParams.forwardMessages;
        } else if (i32 == 0) {
            ab0Var.r = messagePreviewParams.replyMessage;
        } else if (i32 == 2) {
            ab0Var.r = messagePreviewParams.linkMessage;
        }
        org.telegram.ui.Cells.v9 o10 = ab0Var.e.o(context2);
        ab0Var.d = o10;
        o10.setElevation(AndroidUtilities.dp(8.0f));
        o10.setOutlineProvider(null);
        if (o10.getParent() instanceof ViewGroup) {
            ((ViewGroup) o10.getParent()).removeView(o10);
        }
        ab0Var.addView(o10, h7.z5.d(-1, -1.0f, 51, 0.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / AndroidUtilities.density, 0.0f, 0.0f));
        ab0Var.e.T(ab0Var.f);
    }

    public static MessageObject.GroupedMessages a(ab0 ab0Var, MessageObject messageObject) {
        if (messageObject.getGroupId() == 0) {
            return null;
        }
        MessageObject.GroupedMessages groupedMessages = ab0Var.r.groupedMessagesMap.get(messageObject.getGroupId());
        if (groupedMessages == null || (groupedMessages.messages.size() > 1 && groupedMessages.getPosition(messageObject) != null)) {
            return groupedMessages;
        }
        return null;
    }

    public static void b(ab0 ab0Var, org.telegram.ui.Cells.s1 s1Var) {
        CharacterStyle characterStyle;
        TLRPC.WebPage webPage;
        if (ab0Var.a == 2) {
            MessagePreviewParams messagePreviewParams = ab0Var.V.d;
            if (!messagePreviewParams.singleLink && (characterStyle = messagePreviewParams.currentLink) != null && (webPage = messagePreviewParams.webpage) != null && !(webPage instanceof TLRPC.TL_webPagePending)) {
                s1Var.P3(characterStyle);
                return;
            }
        }
        s1Var.P3(null);
    }

    public final MessageObject c(MessageObject messageObject) {
        MessageObject.GroupedMessages valueAt;
        gb0 gb0Var = this.V;
        MessagePreviewParams.Messages messages = gb0Var.d.replyMessage;
        if (messages == null) {
            return null;
        }
        LongSparseArray<MessageObject.GroupedMessages> longSparseArray = messages.groupedMessagesMap;
        if (longSparseArray == null || longSparseArray.size() <= 0 || (valueAt = gb0Var.d.replyMessage.groupedMessagesMap.valueAt(0)) == null) {
            return gb0Var.d.replyMessage.messages.get(0);
        }
        if (valueAt.isDocuments) {
            if (messageObject != null) {
                return messageObject;
            }
            org.telegram.ui.hn hnVar = gb0Var.d.quote;
            if (hnVar != null) {
                return hnVar.a;
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
                ta0 ta0Var = this.f;
                if (i10 >= ta0Var.getChildCount()) {
                    break;
                }
                View childAt = ta0Var.getChildAt(i10);
                org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) childAt;
                if (l4Var.getMessageObject() != null && (l4Var.getMessageObject() == c10 || l4Var.getMessageObject().getId() == c10.getId())) {
                    break;
                }
                i10++;
            }
        }
        return null;
    }

    public final void e(float f10, int i10) {
        boolean z10 = this.V.v;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        ag.y1 y1Var = this.c;
        gh.q4 q4Var = this.b;
        if (z10) {
            y1Var.setTranslationY(0.0f);
            q4Var.invalidateOutline();
            q4Var.setTranslationY(0.0f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(0.0f);
        } else {
            y1Var.setTranslationY(i10);
            q4Var.invalidateOutline();
            q4Var.setTranslationY(f10);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((f10 + q4Var.getMeasuredHeight()) - AndroidUtilities.dp(2.0f));
        }
        float x8 = q4Var.getX();
        org.telegram.ui.Cells.v9 v9Var = this.d;
        v9Var.setTranslationX(x8);
        v9Var.setTranslationY(q4Var.getY());
    }

    public final void f() {
        gb0 gb0Var = this.V;
        new mc(gb0Var, gb0Var.B).M(LocaleController.getString(R.string.QuoteMaxError), LocaleController.getString(R.string.QuoteMaxErrorMessage), R.raw.error).j();
    }

    public final void g(boolean z10, boolean z11) {
        if (this.V.b) {
            z10 = false;
        }
        if (z11 && this.K == z10) {
            return;
        }
        this.K = z10;
        AnimatorSet animatorSet = this.L;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.L = null;
        }
        org.telegram.ui.ActionBar.f1 f1Var = this.y;
        org.telegram.ui.ActionBar.f1 f1Var2 = this.x;
        ra0 ra0Var = this.w;
        ra0 ra0Var2 = this.v;
        if (!z11) {
            if (ra0Var2 != null) {
                ra0Var2.setAlpha(!z10 ? 1.0f : 0.0f);
                ra0Var2.setVisibility(!z10 ? 0 : 4);
            }
            if (ra0Var != null) {
                ra0Var.setAlpha(z10 ? 1.0f : 0.0f);
                ra0Var.setVisibility(z10 ? 0 : 4);
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
        this.L = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        if (ra0Var2 != null) {
            ra0Var2.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(ra0Var2, (Property<ra0, Float>) property, !z10 ? 1.0f : 0.0f));
        }
        if (ra0Var != null) {
            ra0Var.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(ra0Var, (Property<ra0, Float>) property, z10 ? 1.0f : 0.0f));
        }
        if (f1Var2 != null) {
            f1Var2.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(f1Var2, (Property<org.telegram.ui.ActionBar.f1, Float>) property, !z10 ? 1.0f : 0.0f));
        }
        if (f1Var != null) {
            f1Var.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(f1Var, (Property<org.telegram.ui.ActionBar.f1, Float>) property, z10 ? 1.0f : 0.0f));
        }
        this.L.playTogether(arrayList);
        this.L.setDuration(360L);
        this.L.setInterpolator(er.h);
        this.L.addListener(new org.telegram.ui.go(16, this, z10));
        this.L.start();
    }

    public final void h() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        gb0 gb0Var = this.V;
        MessagePreviewParams messagePreviewParams = gb0Var.d;
        va0 va0Var = this.h;
        if (va0Var.k()) {
            this.R = true;
            return;
        }
        for (int i10 = 0; i10 < this.r.previewMessages.size(); i10++) {
            MessageObject messageObject = this.r.previewMessages.get(i10);
            messageObject.forceUpdate = true;
            messageObject.sendAsPeer = gb0Var.a;
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
            va0Var.V(this.r.groupedMessagesMap.valueAt(i12));
        }
        this.n.q(0, this.r.previewMessages.size());
    }

    public final void i() {
        int i10 = this.N;
        float f10 = this.O;
        gb0 gb0Var = this.V;
        boolean z10 = gb0Var.v;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        ta0 ta0Var = this.f;
        if (z10) {
            this.O = 0.0f;
            this.N = 0;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(AndroidUtilities.dp(8.0f) + ta0Var.getMeasuredWidth());
        } else {
            int measuredHeight = ta0Var.getMeasuredHeight();
            int i11 = 0;
            for (int i12 = 0; i12 < ta0Var.getChildCount(); i12++) {
                View childAt = ta0Var.getChildAt(i12);
                if (RecyclerView.R(childAt) != -1) {
                    measuredHeight = Math.min(measuredHeight, childAt.getTop());
                    i11++;
                }
            }
            MessagePreviewParams.Messages messages = this.r;
            if (messages == null || i11 == 0 || i11 > messages.previewMessages.size()) {
                this.N = 0;
            } else {
                int d = i0.a.d(4.0f, measuredHeight, 0);
                this.N = d;
                this.N = Math.min(((ta0Var.getMeasuredHeight() - this.N) + d) - ((int) ((((AndroidUtilities.displaySize.y - (Build.VERSION.SDK_INT >= 35 ? AndroidUtilities.navigationBarHeight : 0)) * 0.8f) - this.S) - AndroidUtilities.dp(8.0f))), this.N);
            }
            float A = com.google.android.recaptcha.internal.a.A(getMeasuredHeight() - AndroidUtilities.dp(16.0f), (this.b.getMeasuredHeight() - this.N) + (this.S - AndroidUtilities.dp(8.0f)), 2.0f, AndroidUtilities.dp(8.0f)) - this.N;
            this.O = A;
            if (A > AndroidUtilities.dp(8.0f)) {
                this.O = AndroidUtilities.dp(8.0f);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
        }
        boolean z11 = this.G;
        if (z11 || (this.N == i10 && this.O == f10)) {
            if (z11) {
                float f11 = this.O;
                int i13 = this.N;
                this.P = i13;
                e(f11, i13);
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = gb0Var.h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        gb0Var.h = ofFloat;
        ofFloat.addUpdateListener(new nj(this, i10, f10, 1));
        gb0Var.h.setDuration(250L);
        gb0Var.h.setInterpolator(sh.m.V);
        gb0Var.h.addListener(new sz(this, 6));
        AndroidUtilities.runOnUIThread(gb0Var.y, 50L);
        this.P = i10;
        e(f10, i10);
    }

    public final void j() {
        MessageObject messageObject;
        gb0 gb0Var = this.V;
        MessagePreviewParams messagePreviewParams = gb0Var.d;
        if (this.a == 0) {
            sa0 sa0Var = this.e;
            if (sa0Var.v - sa0Var.u > MessagesController.getInstance(gb0Var.w).quoteLengthMax) {
                return;
            }
            org.telegram.ui.Cells.r9 r9Var = sa0Var.W;
            MessageObject c10 = c(r9Var != null ? ((org.telegram.ui.Cells.s1) r9Var).getMessageObject() : null);
            if (messagePreviewParams.quote != null && sa0Var.y()) {
                messagePreviewParams.quoteStart = sa0Var.u;
                messagePreviewParams.quoteEnd = sa0Var.v;
                if (c10 != null && ((messageObject = messagePreviewParams.quote.a) == null || messageObject.getId() != c10.getId())) {
                    messagePreviewParams.quote = org.telegram.ui.hn.b(messagePreviewParams.quoteStart, messagePreviewParams.quoteEnd, c10);
                    gb0Var.b();
                }
            }
            sa0Var.f(false);
        }
    }

    public final void k(boolean z10) {
        gb0 gb0Var = this.V;
        TLRPC.User user = gb0Var.n;
        MessagePreviewParams messagePreviewParams = gb0Var.d;
        TLRPC.Chat chat = gb0Var.r;
        ag.y1 y1Var = this.c;
        int i10 = this.a;
        if (i10 == 1) {
            MessagePreviewParams.Messages messages = messagePreviewParams.forwardMessages;
            y1Var.d(LocaleController.formatPluralString("PreviewForwardMessagesCount", messages == null ? 0 : messages.selectedIds.size(), new Object[0]), z10);
            y1Var.c(!messagePreviewParams.hasSenders ? messagePreviewParams.willSeeSenders ? user != null ? LocaleController.formatString("ForwardPreviewSendersNameVisible", R.string.ForwardPreviewSendersNameVisible, ContactsController.formatName(user.first_name, user.last_name)) : (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.ForwardPreviewSendersNameVisibleGroup) : LocaleController.getString(R.string.ForwardPreviewSendersNameVisibleChannel) : user != null ? LocaleController.formatString("ForwardPreviewSendersNameVisible", R.string.ForwardPreviewSendersNameVisible, ContactsController.formatName(user.first_name, user.last_name)) : (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.ForwardPreviewSendersNameHiddenGroup) : LocaleController.getString(R.string.ForwardPreviewSendersNameHiddenChannel) : !messagePreviewParams.hideForwardSendersName ? user != null ? LocaleController.formatString("ForwardPreviewSendersNameVisible", R.string.ForwardPreviewSendersNameVisible, ContactsController.formatName(user.first_name, user.last_name)) : (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.ForwardPreviewSendersNameVisibleGroup) : LocaleController.getString(R.string.ForwardPreviewSendersNameVisibleChannel) : user != null ? LocaleController.formatString("ForwardPreviewSendersNameHidden", R.string.ForwardPreviewSendersNameHidden, ContactsController.formatName(user.first_name, user.last_name)) : (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.ForwardPreviewSendersNameHiddenGroup) : LocaleController.getString(R.string.ForwardPreviewSendersNameHiddenChannel), z10);
        } else {
            if (i10 != 0) {
                if (i10 == 2) {
                    y1Var.d(LocaleController.getString(R.string.MessageOptionsLinkTitle), z10);
                    y1Var.c(LocaleController.getString(R.string.MessageOptionsLinkSubtitle), z10);
                    return;
                }
                return;
            }
            if (messagePreviewParams.quote == null || !messagePreviewParams.replyMessage.hasText) {
                y1Var.d(LocaleController.getString(R.string.MessageOptionsReplyTitle), z10);
                y1Var.c(messagePreviewParams.replyMessage.hasText ? LocaleController.getString(R.string.MessageOptionsReplySubtitle) : "", z10);
            } else {
                y1Var.d(LocaleController.getString(R.string.PreviewQuoteUpdate), z10);
                y1Var.c(LocaleController.getString(R.string.PreviewQuoteUpdateSubtitle), z10);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.a == 0) {
            AndroidUtilities.forEachViews((RecyclerView) this.f, (d5.d) new la0(this, 0));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j();
        this.U = true;
        this.G = true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        i();
        this.G = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10 = View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i11);
        gb0 gb0Var = this.V;
        gb0Var.v = z10;
        this.S = 0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(i10, makeMeasureSpec);
        int i12 = this.S;
        int measuredHeight = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
        Rect rect = this.M;
        this.S = Math.max(i12, measuredHeight + rect.top + rect.bottom);
        ((ViewGroup.MarginLayoutParams) this.f.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        boolean z11 = gb0Var.v;
        gh.q4 q4Var = this.b;
        if (z11) {
            q4Var.getLayoutParams().height = -1;
            ((ViewGroup.MarginLayoutParams) q4Var.getLayoutParams()).topMargin = AndroidUtilities.dp(8.0f);
            ((ViewGroup.MarginLayoutParams) q4Var.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
            q4Var.getLayoutParams().width = (int) Math.min(View.MeasureSpec.getSize(i10), Math.max(AndroidUtilities.dp(340.0f), View.MeasureSpec.getSize(i10) * 0.6f));
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = -1;
        } else {
            ((ViewGroup.MarginLayoutParams) q4Var.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) q4Var.getLayoutParams()).bottomMargin = 0;
            q4Var.getLayoutParams().height = (View.MeasureSpec.getSize(i11) - AndroidUtilities.dp(6.0f)) - this.S;
            if (q4Var.getLayoutParams().height < View.MeasureSpec.getSize(i11) * 0.5f) {
                q4Var.getLayoutParams().height = (int) (View.MeasureSpec.getSize(i11) * 0.5f);
            }
            q4Var.getLayoutParams().width = -1;
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = View.MeasureSpec.getSize(i11) - q4Var.getLayoutParams().height;
        }
        int size = (View.MeasureSpec.getSize(i11) + View.MeasureSpec.getSize(i10)) << 16;
        if (this.T != size) {
            for (int i13 = 0; i13 < this.r.previewMessages.size(); i13++) {
                MessageObject messageObject = this.r.previewMessages.get(i13);
                messageObject.parentWidth = gb0Var.v ? q4Var.getLayoutParams().width : View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(16.0f);
                messageObject.resetLayout();
                messageObject.forceUpdate = true;
                za0 za0Var = this.n;
                if (za0Var != null) {
                    za0Var.l();
                }
            }
            this.G = true;
        }
        this.T = size;
        super.onMeasure(i10, i11);
    }
}
