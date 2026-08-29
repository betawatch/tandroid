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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class lb0 extends FrameLayout {
    public final qb0 A;
    public final FrameLayout B;
    public final qb0 C;
    public final qb0 D;
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
    public final /* synthetic */ rb0 V;
    public final int a;
    public final ih.j4 b;
    public final bg.d1 c;
    public final org.telegram.ui.Cells.w9 d;
    public final db0 e;
    public final eb0 f;
    public final gb0 h;
    public final kb0 n;
    public MessagePreviewParams.Messages r;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout s;
    public final cb0 v;
    public final cb0 w;
    public final org.telegram.ui.ActionBar.g1 x;
    public final org.telegram.ui.ActionBar.g1 y;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9, types: [android.graphics.drawable.Drawable, boolean[]] */
    /* JADX WARN: Type inference failed for: r14v7, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r2v66, types: [android.view.View, org.telegram.ui.ActionBar.g1] */
    /* JADX WARN: Type inference failed for: r2v67, types: [android.view.View, org.telegram.ui.ActionBar.g1] */
    /* JADX WARN: Type inference failed for: r2v73, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r2v74, types: [android.view.View, org.telegram.ui.ActionBar.g1] */
    /* JADX WARN: Type inference failed for: r2v75, types: [android.view.View, org.telegram.ui.ActionBar.g1] */
    /* JADX WARN: Type inference failed for: r2v82, types: [android.view.View, org.telegram.ui.ActionBar.g1, org.telegram.ui.Components.cb0] */
    /* JADX WARN: Type inference failed for: r2v83, types: [android.view.View, org.telegram.ui.ActionBar.g1, org.telegram.ui.Components.cb0] */
    /* JADX WARN: Type inference failed for: r34v0, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout, java.lang.Object, org.telegram.ui.Components.lb0] */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.view.View, android.view.ViewGroup, ih.j4, org.telegram.ui.Components.hv0] */
    /* JADX WARN: Type inference failed for: r3v6, types: [lg.a] */
    /* JADX WARN: Type inference failed for: r9v10, types: [android.view.View, org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public lb0(rb0 rb0Var, Context context, int i10) {
        super(r4);
        MessagePreviewParams messagePreviewParams;
        ViewOutlineProvider viewOutlineProvider;
        Context context2;
        lb0 lb0Var;
        boolean z10;
        qb0 qb0Var;
        qb0 qb0Var2;
        lb0 lb0Var2;
        MessagePreviewParams.Messages messages;
        boolean z11;
        ?? r13;
        MessagePreviewParams messagePreviewParams2;
        boolean z12;
        Object obj;
        Context context3 = context;
        this.V = rb0Var;
        this.G = true;
        this.H = -1;
        this.I = -1;
        final int i11 = 0;
        this.J = false;
        this.M = new Rect();
        this.Q = false;
        this.U = true;
        this.F = new ChatMessageSharedResources(context3);
        this.a = i10;
        int i12 = 3;
        setOnTouchListener(new pr(this, i12));
        int i13 = 2;
        ?? j4Var = new ih.j4(this, context3, i13);
        this.b = j4Var;
        nb0 nb0Var = rb0Var.B;
        boolean z13 = rb0Var.b;
        MessagePreviewParams messagePreviewParams3 = rb0Var.d;
        Drawable d = ((org.telegram.ui.rn) nb0Var).d();
        if (((org.telegram.ui.rn) nb0Var).f == null) {
            int i14 = org.telegram.ui.ActionBar.g6.a;
        }
        j4Var.V(d);
        j4Var.setOccupyStatusBar(false);
        j4Var.setOutlineProvider(new ng.b(this, i12));
        j4Var.setClipToOutline(true);
        j4Var.setElevation(AndroidUtilities.dp(4.0f));
        bg.d1 d1Var = new bg.d1(context3, 14, nb0Var);
        this.c = d1Var;
        d1Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.s8, nb0Var));
        db0 db0Var = new db0(this);
        this.e = db0Var;
        db0Var.D = new lh.g2(this, i12);
        eb0 eb0Var = new eb0(this, context3, nb0Var);
        this.f = eb0Var;
        gb0 gb0Var = new gb0(this, eb0Var, nb0Var);
        this.h = gb0Var;
        eb0Var.setItemAnimator(gb0Var);
        eb0Var.setOnScrollListener(new h00(this, i13));
        eb0Var.setOnItemClickListener(new hb0(this));
        kb0 kb0Var = new kb0(this);
        this.n = kb0Var;
        eb0Var.setAdapter(kb0Var);
        eb0Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        za0 za0Var = new za0(this);
        za0Var.O = new ab0(this);
        eb0Var.setClipToPadding(false);
        eb0Var.setLayoutManager(za0Var);
        eb0Var.i(new bb0());
        j4Var.addView(eb0Var);
        addView(j4Var, i7.f6.d(-1, 400.0f, 0, 8.0f, 0.0f, 8.0f, 0.0f));
        j4Var.addView(d1Var, i7.f6.c(-2.0f, -1));
        ?? actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert2, 1, getContext(), nb0Var);
        this.s = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().setOnForegroundOpenFinished(new xa0(this, 1));
        ng.d c3 = rb0Var.C.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, false);
        c3.n(pg.a.j(nb0Var));
        c3.o(AndroidUtilities.dp(8.0f));
        c3.h.e = true;
        c3.p(AndroidUtilities.dp(12.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c3);
        addView(actionBarPopupWindow$ActionBarPopupWindowLayout, i7.f6.c(-2.0f, -2));
        if (i10 != 0 || (messages = messagePreviewParams3.replyMessage) == null) {
            messagePreviewParams = messagePreviewParams3;
            viewOutlineProvider = null;
            viewOutlineProvider = null;
            if (i10 != 1 || messagePreviewParams.forwardMessages == null) {
                final lb0 lb0Var3 = this;
                lb0Var = lb0Var3;
                if (i10 == 2) {
                    lb0Var = lb0Var3;
                    if (messagePreviewParams.linkMessage != null) {
                        qb0 qb0Var3 = new qb0(context, R.raw.position_below, LocaleController.getString(R.string.LinkAbove), R.raw.position_above, LocaleController.getString(R.string.LinkBelow), rb0Var.B);
                        lb0Var3.A = qb0Var3;
                        qb0Var3.a(!messagePreviewParams.webpageTop, false);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(qb0Var3, i7.f6.n(-1, 48));
                        FrameLayout frameLayout = new FrameLayout(context);
                        lb0Var3.B = frameLayout;
                        frameLayout.setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.I5, nb0Var), 0, 0));
                        qb0 qb0Var4 = new qb0(context, R.raw.media_shrink, LocaleController.getString(R.string.LinkMediaLarger), R.raw.media_enlarge, LocaleController.getString(R.string.LinkMediaSmaller), rb0Var.B);
                        lb0Var3.C = qb0Var4;
                        qb0Var4.setBackground(null);
                        qb0Var4.setVisibility(messagePreviewParams.isVideo ? 4 : 0);
                        frameLayout.addView(qb0Var4, i7.f6.n(-1, 48));
                        qb0 qb0Var5 = new qb0(context, R.raw.media_shrink, LocaleController.getString(R.string.LinkVideoLarger), R.raw.media_enlarge, LocaleController.getString(R.string.LinkVideoSmaller), rb0Var.B);
                        lb0Var3.D = qb0Var5;
                        qb0Var5.setBackground(null);
                        qb0Var5.setVisibility(!messagePreviewParams.isVideo ? 4 : 0);
                        frameLayout.setAlpha(messagePreviewParams.hasMedia ? 1.0f : 0.5f);
                        frameLayout.addView(qb0Var5, i7.f6.n(-1, 48));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, i7.f6.n(-1, 48));
                        frameLayout.setVisibility((!messagePreviewParams.singleLink || messagePreviewParams.hasMedia) ? 0 : 8);
                        qb0Var4.a(messagePreviewParams.webpageSmall, false);
                        qb0Var5.a(messagePreviewParams.webpageSmall, false);
                        org.telegram.ui.ActionBar.l1 l1Var = new org.telegram.ui.ActionBar.l1(context, nb0Var);
                        l1Var.setColor(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, nb0Var)));
                        l1Var.setTag(R.id.fit_width_tag, 1);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(l1Var, i7.f6.n(-1, 8));
                        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(1, context, rb0Var.B, false, false);
                        g1Var.g(LocaleController.getString(R.string.ApplyChanges), R.drawable.msg_select, null);
                        final int i15 = 10;
                        g1Var.setOnClickListener(new View.OnClickListener(lb0Var3) { // from class: org.telegram.ui.Components.ua0
                            public final /* synthetic */ lb0 b;

                            {
                                this.b = lb0Var3;
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
                                        lb0 lb0Var4 = this.b;
                                        lb0Var4.V.d.quote = null;
                                        lb0Var4.e.f(false);
                                        lb0Var4.g(false, false);
                                        lb0Var4.s.getSwipeBack().b(true);
                                        break;
                                    case 1:
                                        lb0 lb0Var5 = this.b;
                                        db0 db0Var2 = lb0Var5.e;
                                        rb0 rb0Var2 = lb0Var5.V;
                                        if (lb0Var5.c(null) != null) {
                                            if (db0Var2.v - db0Var2.u <= MessagesController.getInstance(rb0Var2.w).quoteLengthMax) {
                                                org.telegram.ui.Cells.s9 s9Var = db0Var2.W;
                                                MessageObject c6 = lb0Var5.c(s9Var != null ? ((org.telegram.ui.Cells.s1) s9Var).getMessageObject() : null);
                                                MessagePreviewParams messagePreviewParams4 = rb0Var2.d;
                                                int i17 = db0Var2.u;
                                                messagePreviewParams4.quoteStart = i17;
                                                int i18 = db0Var2.v;
                                                messagePreviewParams4.quoteEnd = i18;
                                                messagePreviewParams4.quote = org.telegram.ui.jn.b(i17, i18, c6);
                                                rb0Var2.b();
                                                rb0Var2.a(true);
                                                break;
                                            } else {
                                                lb0Var5.f();
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        lb0 lb0Var6 = this.b;
                                        db0 db0Var3 = lb0Var6.e;
                                        rb0 rb0Var3 = lb0Var6.V;
                                        MessagePreviewParams messagePreviewParams5 = rb0Var3.d;
                                        int i19 = rb0Var3.w;
                                        boolean z14 = rb0Var3.b;
                                        if (messagePreviewParams5.quote != null && !z14) {
                                            messagePreviewParams5.quote = null;
                                            db0Var3.f(false);
                                            lb0Var6.g(false, true);
                                            lb0Var6.k(true);
                                            break;
                                        } else if (db0Var3.v - db0Var3.u <= MessagesController.getInstance(i19).quoteLengthMax) {
                                            MessageObject c10 = lb0Var6.c(null);
                                            if (c10 != null) {
                                                if (!db0Var3.y()) {
                                                    messagePreviewParams5.quoteStart = 0;
                                                    int min = Math.min(MessagesController.getInstance(i19).quoteLengthMax, c10.messageOwner.message.length());
                                                    messagePreviewParams5.quoteEnd = min;
                                                    messagePreviewParams5.quote = org.telegram.ui.jn.b(messagePreviewParams5.quoteStart, min, c10);
                                                    View d10 = lb0Var6.d();
                                                    if (d10 instanceof org.telegram.ui.Cells.s1) {
                                                        db0Var3.a0((org.telegram.ui.Cells.s1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                    }
                                                    if (!z14) {
                                                        lb0Var6.s.getSwipeBack().e(lb0Var6.E);
                                                    }
                                                    lb0Var6.g(true, true);
                                                    break;
                                                } else {
                                                    messagePreviewParams5.quoteStart = db0Var3.u;
                                                    messagePreviewParams5.quoteEnd = db0Var3.v;
                                                    org.telegram.ui.Cells.s9 s9Var2 = db0Var3.W;
                                                    messagePreviewParams5.quote = org.telegram.ui.jn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, lb0Var6.c(s9Var2 != null ? ((org.telegram.ui.Cells.s1) s9Var2).getMessageObject() : null));
                                                    rb0Var3.b();
                                                    rb0Var3.a(true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            lb0Var6.f();
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
                                        rb0 rb0Var4 = this.b.V;
                                        if (!rb0Var4.b) {
                                            org.telegram.ui.zk zkVar = (org.telegram.ui.zk) rb0Var4;
                                            zkVar.a(true);
                                            org.telegram.ui.tn tnVar = zkVar.D;
                                            tnVar.j5 = null;
                                            tnVar.h5 = null;
                                            tnVar.b5.updateReply(null, null, tnVar.P5, null);
                                            tnVar.j8();
                                            break;
                                        } else {
                                            org.telegram.ui.zk zkVar2 = (org.telegram.ui.zk) rb0Var4;
                                            zkVar2.a(true);
                                            org.telegram.ui.tn tnVar2 = zkVar2.D;
                                            tnVar2.h5 = null;
                                            tnVar2.Bb(tnVar2.j5);
                                            break;
                                        }
                                    case 7:
                                        this.b.V.c(true);
                                        break;
                                    case 8:
                                        this.b.V.a(true);
                                        break;
                                    case 9:
                                        org.telegram.ui.zk zkVar3 = (org.telegram.ui.zk) this.b.V;
                                        zkVar3.a(true);
                                        org.telegram.ui.tn tnVar3 = zkVar3.D;
                                        tnVar3.b5.updateForward(null, tnVar3.P5);
                                        tnVar3.j8();
                                        break;
                                    case 10:
                                        this.b.V.a(true);
                                        break;
                                    case 11:
                                        org.telegram.ui.zk zkVar4 = (org.telegram.ui.zk) this.b.V;
                                        zkVar4.a(true);
                                        org.telegram.ui.tn tnVar4 = zkVar4.D;
                                        tnVar4.C5 = null;
                                        org.telegram.ui.dk dkVar = tnVar4.U;
                                        if (dkVar != null) {
                                            dkVar.S2 = null;
                                            dkVar.T2 = false;
                                        }
                                        MessagePreviewParams messagePreviewParams6 = tnVar4.b5;
                                        if (messagePreviewParams6 != null) {
                                            i16 = ((org.telegram.ui.ActionBar.o2) tnVar4).currentAccount;
                                            MessageObject messageObject = tnVar4.j5;
                                            messagePreviewParams6.updateLink(i16, null, null, messageObject == tnVar4.T3 ? null : messageObject, tnVar4.h5, tnVar4.l5);
                                        }
                                        tnVar4.j8();
                                        break;
                                    case 12:
                                        lb0 lb0Var7 = this.b;
                                        MessagePreviewParams messagePreviewParams7 = lb0Var7.V.d;
                                        if (messagePreviewParams7.hasMedia) {
                                            boolean z15 = !messagePreviewParams7.webpageSmall;
                                            messagePreviewParams7.webpageSmall = z15;
                                            lb0Var7.C.a(z15, true);
                                            lb0Var7.D.a(messagePreviewParams7.webpageSmall, true);
                                            if (lb0Var7.r.messages.size() > 0 && (message2 = lb0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                                boolean z16 = messagePreviewParams7.webpageSmall;
                                                messageMedia2.force_small_media = z16;
                                                messageMedia2.force_large_media = !z16;
                                            }
                                            if (lb0Var7.r.previewMessages.size() > 0 && (message = lb0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                                boolean z17 = messagePreviewParams7.webpageSmall;
                                                messageMedia.force_small_media = z17;
                                                messageMedia.force_large_media = !z17;
                                            }
                                            lb0Var7.h();
                                            lb0Var7.Q = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        lb0 lb0Var8 = this.b;
                                        MessagePreviewParams messagePreviewParams8 = lb0Var8.V.d;
                                        boolean z18 = messagePreviewParams8.webpageTop;
                                        messagePreviewParams8.webpageTop = !z18;
                                        lb0Var8.A.a(z18, true);
                                        if (lb0Var8.r.messages.size() > 0 && (message4 = lb0Var8.r.messages.get(0).messageOwner) != null) {
                                            message4.invert_media = messagePreviewParams8.webpageTop;
                                        }
                                        if (lb0Var8.r.previewMessages.size() > 0 && (message3 = lb0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                            message3.invert_media = messagePreviewParams8.webpageTop;
                                        }
                                        lb0Var8.h();
                                        lb0Var8.Q = true;
                                        break;
                                }
                            }
                        });
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var, i7.f6.n(-1, 48));
                        org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(1, context, rb0Var.B, false, true);
                        context2 = context;
                        g1Var2.g(LocaleController.getString(R.string.DoNotLinkPreview), R.drawable.msg_delete, null);
                        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.q7, nb0Var);
                        int i16 = org.telegram.ui.ActionBar.g6.p7;
                        g1Var2.c(v02, org.telegram.ui.ActionBar.g6.v0(i16, nb0Var));
                        final int i17 = 11;
                        g1Var2.setOnClickListener(new View.OnClickListener(lb0Var3) { // from class: org.telegram.ui.Components.ua0
                            public final /* synthetic */ lb0 b;

                            {
                                this.b = lb0Var3;
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
                                        lb0 lb0Var4 = this.b;
                                        lb0Var4.V.d.quote = null;
                                        lb0Var4.e.f(false);
                                        lb0Var4.g(false, false);
                                        lb0Var4.s.getSwipeBack().b(true);
                                        break;
                                    case 1:
                                        lb0 lb0Var5 = this.b;
                                        db0 db0Var2 = lb0Var5.e;
                                        rb0 rb0Var2 = lb0Var5.V;
                                        if (lb0Var5.c(null) != null) {
                                            if (db0Var2.v - db0Var2.u <= MessagesController.getInstance(rb0Var2.w).quoteLengthMax) {
                                                org.telegram.ui.Cells.s9 s9Var = db0Var2.W;
                                                MessageObject c6 = lb0Var5.c(s9Var != null ? ((org.telegram.ui.Cells.s1) s9Var).getMessageObject() : null);
                                                MessagePreviewParams messagePreviewParams4 = rb0Var2.d;
                                                int i172 = db0Var2.u;
                                                messagePreviewParams4.quoteStart = i172;
                                                int i18 = db0Var2.v;
                                                messagePreviewParams4.quoteEnd = i18;
                                                messagePreviewParams4.quote = org.telegram.ui.jn.b(i172, i18, c6);
                                                rb0Var2.b();
                                                rb0Var2.a(true);
                                                break;
                                            } else {
                                                lb0Var5.f();
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        lb0 lb0Var6 = this.b;
                                        db0 db0Var3 = lb0Var6.e;
                                        rb0 rb0Var3 = lb0Var6.V;
                                        MessagePreviewParams messagePreviewParams5 = rb0Var3.d;
                                        int i19 = rb0Var3.w;
                                        boolean z14 = rb0Var3.b;
                                        if (messagePreviewParams5.quote != null && !z14) {
                                            messagePreviewParams5.quote = null;
                                            db0Var3.f(false);
                                            lb0Var6.g(false, true);
                                            lb0Var6.k(true);
                                            break;
                                        } else if (db0Var3.v - db0Var3.u <= MessagesController.getInstance(i19).quoteLengthMax) {
                                            MessageObject c10 = lb0Var6.c(null);
                                            if (c10 != null) {
                                                if (!db0Var3.y()) {
                                                    messagePreviewParams5.quoteStart = 0;
                                                    int min = Math.min(MessagesController.getInstance(i19).quoteLengthMax, c10.messageOwner.message.length());
                                                    messagePreviewParams5.quoteEnd = min;
                                                    messagePreviewParams5.quote = org.telegram.ui.jn.b(messagePreviewParams5.quoteStart, min, c10);
                                                    View d10 = lb0Var6.d();
                                                    if (d10 instanceof org.telegram.ui.Cells.s1) {
                                                        db0Var3.a0((org.telegram.ui.Cells.s1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                    }
                                                    if (!z14) {
                                                        lb0Var6.s.getSwipeBack().e(lb0Var6.E);
                                                    }
                                                    lb0Var6.g(true, true);
                                                    break;
                                                } else {
                                                    messagePreviewParams5.quoteStart = db0Var3.u;
                                                    messagePreviewParams5.quoteEnd = db0Var3.v;
                                                    org.telegram.ui.Cells.s9 s9Var2 = db0Var3.W;
                                                    messagePreviewParams5.quote = org.telegram.ui.jn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, lb0Var6.c(s9Var2 != null ? ((org.telegram.ui.Cells.s1) s9Var2).getMessageObject() : null));
                                                    rb0Var3.b();
                                                    rb0Var3.a(true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            lb0Var6.f();
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
                                        rb0 rb0Var4 = this.b.V;
                                        if (!rb0Var4.b) {
                                            org.telegram.ui.zk zkVar = (org.telegram.ui.zk) rb0Var4;
                                            zkVar.a(true);
                                            org.telegram.ui.tn tnVar = zkVar.D;
                                            tnVar.j5 = null;
                                            tnVar.h5 = null;
                                            tnVar.b5.updateReply(null, null, tnVar.P5, null);
                                            tnVar.j8();
                                            break;
                                        } else {
                                            org.telegram.ui.zk zkVar2 = (org.telegram.ui.zk) rb0Var4;
                                            zkVar2.a(true);
                                            org.telegram.ui.tn tnVar2 = zkVar2.D;
                                            tnVar2.h5 = null;
                                            tnVar2.Bb(tnVar2.j5);
                                            break;
                                        }
                                    case 7:
                                        this.b.V.c(true);
                                        break;
                                    case 8:
                                        this.b.V.a(true);
                                        break;
                                    case 9:
                                        org.telegram.ui.zk zkVar3 = (org.telegram.ui.zk) this.b.V;
                                        zkVar3.a(true);
                                        org.telegram.ui.tn tnVar3 = zkVar3.D;
                                        tnVar3.b5.updateForward(null, tnVar3.P5);
                                        tnVar3.j8();
                                        break;
                                    case 10:
                                        this.b.V.a(true);
                                        break;
                                    case 11:
                                        org.telegram.ui.zk zkVar4 = (org.telegram.ui.zk) this.b.V;
                                        zkVar4.a(true);
                                        org.telegram.ui.tn tnVar4 = zkVar4.D;
                                        tnVar4.C5 = null;
                                        org.telegram.ui.dk dkVar = tnVar4.U;
                                        if (dkVar != null) {
                                            dkVar.S2 = null;
                                            dkVar.T2 = false;
                                        }
                                        MessagePreviewParams messagePreviewParams6 = tnVar4.b5;
                                        if (messagePreviewParams6 != null) {
                                            i162 = ((org.telegram.ui.ActionBar.o2) tnVar4).currentAccount;
                                            MessageObject messageObject = tnVar4.j5;
                                            messagePreviewParams6.updateLink(i162, null, null, messageObject == tnVar4.T3 ? null : messageObject, tnVar4.h5, tnVar4.l5);
                                        }
                                        tnVar4.j8();
                                        break;
                                    case 12:
                                        lb0 lb0Var7 = this.b;
                                        MessagePreviewParams messagePreviewParams7 = lb0Var7.V.d;
                                        if (messagePreviewParams7.hasMedia) {
                                            boolean z15 = !messagePreviewParams7.webpageSmall;
                                            messagePreviewParams7.webpageSmall = z15;
                                            lb0Var7.C.a(z15, true);
                                            lb0Var7.D.a(messagePreviewParams7.webpageSmall, true);
                                            if (lb0Var7.r.messages.size() > 0 && (message2 = lb0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                                boolean z16 = messagePreviewParams7.webpageSmall;
                                                messageMedia2.force_small_media = z16;
                                                messageMedia2.force_large_media = !z16;
                                            }
                                            if (lb0Var7.r.previewMessages.size() > 0 && (message = lb0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                                boolean z17 = messagePreviewParams7.webpageSmall;
                                                messageMedia.force_small_media = z17;
                                                messageMedia.force_large_media = !z17;
                                            }
                                            lb0Var7.h();
                                            lb0Var7.Q = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        lb0 lb0Var8 = this.b;
                                        MessagePreviewParams messagePreviewParams8 = lb0Var8.V.d;
                                        boolean z18 = messagePreviewParams8.webpageTop;
                                        messagePreviewParams8.webpageTop = !z18;
                                        lb0Var8.A.a(z18, true);
                                        if (lb0Var8.r.messages.size() > 0 && (message4 = lb0Var8.r.messages.get(0).messageOwner) != null) {
                                            message4.invert_media = messagePreviewParams8.webpageTop;
                                        }
                                        if (lb0Var8.r.previewMessages.size() > 0 && (message3 = lb0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                            message3.invert_media = messagePreviewParams8.webpageTop;
                                        }
                                        lb0Var8.h();
                                        lb0Var8.Q = true;
                                        break;
                                }
                            }
                        });
                        g1Var2.setSelectorColor(org.telegram.ui.ActionBar.g6.l1(0.12f, org.telegram.ui.ActionBar.g6.w0(null, i16, false)));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var2, i7.f6.n(-1, 48));
                        final int i18 = 12;
                        frameLayout.setOnClickListener(new View.OnClickListener(lb0Var3) { // from class: org.telegram.ui.Components.ua0
                            public final /* synthetic */ lb0 b;

                            {
                                this.b = lb0Var3;
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
                                        lb0 lb0Var4 = this.b;
                                        lb0Var4.V.d.quote = null;
                                        lb0Var4.e.f(false);
                                        lb0Var4.g(false, false);
                                        lb0Var4.s.getSwipeBack().b(true);
                                        break;
                                    case 1:
                                        lb0 lb0Var5 = this.b;
                                        db0 db0Var2 = lb0Var5.e;
                                        rb0 rb0Var2 = lb0Var5.V;
                                        if (lb0Var5.c(null) != null) {
                                            if (db0Var2.v - db0Var2.u <= MessagesController.getInstance(rb0Var2.w).quoteLengthMax) {
                                                org.telegram.ui.Cells.s9 s9Var = db0Var2.W;
                                                MessageObject c6 = lb0Var5.c(s9Var != null ? ((org.telegram.ui.Cells.s1) s9Var).getMessageObject() : null);
                                                MessagePreviewParams messagePreviewParams4 = rb0Var2.d;
                                                int i172 = db0Var2.u;
                                                messagePreviewParams4.quoteStart = i172;
                                                int i182 = db0Var2.v;
                                                messagePreviewParams4.quoteEnd = i182;
                                                messagePreviewParams4.quote = org.telegram.ui.jn.b(i172, i182, c6);
                                                rb0Var2.b();
                                                rb0Var2.a(true);
                                                break;
                                            } else {
                                                lb0Var5.f();
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        lb0 lb0Var6 = this.b;
                                        db0 db0Var3 = lb0Var6.e;
                                        rb0 rb0Var3 = lb0Var6.V;
                                        MessagePreviewParams messagePreviewParams5 = rb0Var3.d;
                                        int i19 = rb0Var3.w;
                                        boolean z14 = rb0Var3.b;
                                        if (messagePreviewParams5.quote != null && !z14) {
                                            messagePreviewParams5.quote = null;
                                            db0Var3.f(false);
                                            lb0Var6.g(false, true);
                                            lb0Var6.k(true);
                                            break;
                                        } else if (db0Var3.v - db0Var3.u <= MessagesController.getInstance(i19).quoteLengthMax) {
                                            MessageObject c10 = lb0Var6.c(null);
                                            if (c10 != null) {
                                                if (!db0Var3.y()) {
                                                    messagePreviewParams5.quoteStart = 0;
                                                    int min = Math.min(MessagesController.getInstance(i19).quoteLengthMax, c10.messageOwner.message.length());
                                                    messagePreviewParams5.quoteEnd = min;
                                                    messagePreviewParams5.quote = org.telegram.ui.jn.b(messagePreviewParams5.quoteStart, min, c10);
                                                    View d10 = lb0Var6.d();
                                                    if (d10 instanceof org.telegram.ui.Cells.s1) {
                                                        db0Var3.a0((org.telegram.ui.Cells.s1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                    }
                                                    if (!z14) {
                                                        lb0Var6.s.getSwipeBack().e(lb0Var6.E);
                                                    }
                                                    lb0Var6.g(true, true);
                                                    break;
                                                } else {
                                                    messagePreviewParams5.quoteStart = db0Var3.u;
                                                    messagePreviewParams5.quoteEnd = db0Var3.v;
                                                    org.telegram.ui.Cells.s9 s9Var2 = db0Var3.W;
                                                    messagePreviewParams5.quote = org.telegram.ui.jn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, lb0Var6.c(s9Var2 != null ? ((org.telegram.ui.Cells.s1) s9Var2).getMessageObject() : null));
                                                    rb0Var3.b();
                                                    rb0Var3.a(true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            lb0Var6.f();
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
                                        rb0 rb0Var4 = this.b.V;
                                        if (!rb0Var4.b) {
                                            org.telegram.ui.zk zkVar = (org.telegram.ui.zk) rb0Var4;
                                            zkVar.a(true);
                                            org.telegram.ui.tn tnVar = zkVar.D;
                                            tnVar.j5 = null;
                                            tnVar.h5 = null;
                                            tnVar.b5.updateReply(null, null, tnVar.P5, null);
                                            tnVar.j8();
                                            break;
                                        } else {
                                            org.telegram.ui.zk zkVar2 = (org.telegram.ui.zk) rb0Var4;
                                            zkVar2.a(true);
                                            org.telegram.ui.tn tnVar2 = zkVar2.D;
                                            tnVar2.h5 = null;
                                            tnVar2.Bb(tnVar2.j5);
                                            break;
                                        }
                                    case 7:
                                        this.b.V.c(true);
                                        break;
                                    case 8:
                                        this.b.V.a(true);
                                        break;
                                    case 9:
                                        org.telegram.ui.zk zkVar3 = (org.telegram.ui.zk) this.b.V;
                                        zkVar3.a(true);
                                        org.telegram.ui.tn tnVar3 = zkVar3.D;
                                        tnVar3.b5.updateForward(null, tnVar3.P5);
                                        tnVar3.j8();
                                        break;
                                    case 10:
                                        this.b.V.a(true);
                                        break;
                                    case 11:
                                        org.telegram.ui.zk zkVar4 = (org.telegram.ui.zk) this.b.V;
                                        zkVar4.a(true);
                                        org.telegram.ui.tn tnVar4 = zkVar4.D;
                                        tnVar4.C5 = null;
                                        org.telegram.ui.dk dkVar = tnVar4.U;
                                        if (dkVar != null) {
                                            dkVar.S2 = null;
                                            dkVar.T2 = false;
                                        }
                                        MessagePreviewParams messagePreviewParams6 = tnVar4.b5;
                                        if (messagePreviewParams6 != null) {
                                            i162 = ((org.telegram.ui.ActionBar.o2) tnVar4).currentAccount;
                                            MessageObject messageObject = tnVar4.j5;
                                            messagePreviewParams6.updateLink(i162, null, null, messageObject == tnVar4.T3 ? null : messageObject, tnVar4.h5, tnVar4.l5);
                                        }
                                        tnVar4.j8();
                                        break;
                                    case 12:
                                        lb0 lb0Var7 = this.b;
                                        MessagePreviewParams messagePreviewParams7 = lb0Var7.V.d;
                                        if (messagePreviewParams7.hasMedia) {
                                            boolean z15 = !messagePreviewParams7.webpageSmall;
                                            messagePreviewParams7.webpageSmall = z15;
                                            lb0Var7.C.a(z15, true);
                                            lb0Var7.D.a(messagePreviewParams7.webpageSmall, true);
                                            if (lb0Var7.r.messages.size() > 0 && (message2 = lb0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                                boolean z16 = messagePreviewParams7.webpageSmall;
                                                messageMedia2.force_small_media = z16;
                                                messageMedia2.force_large_media = !z16;
                                            }
                                            if (lb0Var7.r.previewMessages.size() > 0 && (message = lb0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                                boolean z17 = messagePreviewParams7.webpageSmall;
                                                messageMedia.force_small_media = z17;
                                                messageMedia.force_large_media = !z17;
                                            }
                                            lb0Var7.h();
                                            lb0Var7.Q = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        lb0 lb0Var8 = this.b;
                                        MessagePreviewParams messagePreviewParams8 = lb0Var8.V.d;
                                        boolean z18 = messagePreviewParams8.webpageTop;
                                        messagePreviewParams8.webpageTop = !z18;
                                        lb0Var8.A.a(z18, true);
                                        if (lb0Var8.r.messages.size() > 0 && (message4 = lb0Var8.r.messages.get(0).messageOwner) != null) {
                                            message4.invert_media = messagePreviewParams8.webpageTop;
                                        }
                                        if (lb0Var8.r.previewMessages.size() > 0 && (message3 = lb0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                            message3.invert_media = messagePreviewParams8.webpageTop;
                                        }
                                        lb0Var8.h();
                                        lb0Var8.Q = true;
                                        break;
                                }
                            }
                        });
                        final int i19 = 13;
                        qb0Var3.setOnClickListener(new View.OnClickListener(lb0Var3) { // from class: org.telegram.ui.Components.ua0
                            public final /* synthetic */ lb0 b;

                            {
                                this.b = lb0Var3;
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
                                        lb0 lb0Var4 = this.b;
                                        lb0Var4.V.d.quote = null;
                                        lb0Var4.e.f(false);
                                        lb0Var4.g(false, false);
                                        lb0Var4.s.getSwipeBack().b(true);
                                        break;
                                    case 1:
                                        lb0 lb0Var5 = this.b;
                                        db0 db0Var2 = lb0Var5.e;
                                        rb0 rb0Var2 = lb0Var5.V;
                                        if (lb0Var5.c(null) != null) {
                                            if (db0Var2.v - db0Var2.u <= MessagesController.getInstance(rb0Var2.w).quoteLengthMax) {
                                                org.telegram.ui.Cells.s9 s9Var = db0Var2.W;
                                                MessageObject c6 = lb0Var5.c(s9Var != null ? ((org.telegram.ui.Cells.s1) s9Var).getMessageObject() : null);
                                                MessagePreviewParams messagePreviewParams4 = rb0Var2.d;
                                                int i172 = db0Var2.u;
                                                messagePreviewParams4.quoteStart = i172;
                                                int i182 = db0Var2.v;
                                                messagePreviewParams4.quoteEnd = i182;
                                                messagePreviewParams4.quote = org.telegram.ui.jn.b(i172, i182, c6);
                                                rb0Var2.b();
                                                rb0Var2.a(true);
                                                break;
                                            } else {
                                                lb0Var5.f();
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        lb0 lb0Var6 = this.b;
                                        db0 db0Var3 = lb0Var6.e;
                                        rb0 rb0Var3 = lb0Var6.V;
                                        MessagePreviewParams messagePreviewParams5 = rb0Var3.d;
                                        int i192 = rb0Var3.w;
                                        boolean z14 = rb0Var3.b;
                                        if (messagePreviewParams5.quote != null && !z14) {
                                            messagePreviewParams5.quote = null;
                                            db0Var3.f(false);
                                            lb0Var6.g(false, true);
                                            lb0Var6.k(true);
                                            break;
                                        } else if (db0Var3.v - db0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                            MessageObject c10 = lb0Var6.c(null);
                                            if (c10 != null) {
                                                if (!db0Var3.y()) {
                                                    messagePreviewParams5.quoteStart = 0;
                                                    int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c10.messageOwner.message.length());
                                                    messagePreviewParams5.quoteEnd = min;
                                                    messagePreviewParams5.quote = org.telegram.ui.jn.b(messagePreviewParams5.quoteStart, min, c10);
                                                    View d10 = lb0Var6.d();
                                                    if (d10 instanceof org.telegram.ui.Cells.s1) {
                                                        db0Var3.a0((org.telegram.ui.Cells.s1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                    }
                                                    if (!z14) {
                                                        lb0Var6.s.getSwipeBack().e(lb0Var6.E);
                                                    }
                                                    lb0Var6.g(true, true);
                                                    break;
                                                } else {
                                                    messagePreviewParams5.quoteStart = db0Var3.u;
                                                    messagePreviewParams5.quoteEnd = db0Var3.v;
                                                    org.telegram.ui.Cells.s9 s9Var2 = db0Var3.W;
                                                    messagePreviewParams5.quote = org.telegram.ui.jn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, lb0Var6.c(s9Var2 != null ? ((org.telegram.ui.Cells.s1) s9Var2).getMessageObject() : null));
                                                    rb0Var3.b();
                                                    rb0Var3.a(true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            lb0Var6.f();
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
                                        rb0 rb0Var4 = this.b.V;
                                        if (!rb0Var4.b) {
                                            org.telegram.ui.zk zkVar = (org.telegram.ui.zk) rb0Var4;
                                            zkVar.a(true);
                                            org.telegram.ui.tn tnVar = zkVar.D;
                                            tnVar.j5 = null;
                                            tnVar.h5 = null;
                                            tnVar.b5.updateReply(null, null, tnVar.P5, null);
                                            tnVar.j8();
                                            break;
                                        } else {
                                            org.telegram.ui.zk zkVar2 = (org.telegram.ui.zk) rb0Var4;
                                            zkVar2.a(true);
                                            org.telegram.ui.tn tnVar2 = zkVar2.D;
                                            tnVar2.h5 = null;
                                            tnVar2.Bb(tnVar2.j5);
                                            break;
                                        }
                                    case 7:
                                        this.b.V.c(true);
                                        break;
                                    case 8:
                                        this.b.V.a(true);
                                        break;
                                    case 9:
                                        org.telegram.ui.zk zkVar3 = (org.telegram.ui.zk) this.b.V;
                                        zkVar3.a(true);
                                        org.telegram.ui.tn tnVar3 = zkVar3.D;
                                        tnVar3.b5.updateForward(null, tnVar3.P5);
                                        tnVar3.j8();
                                        break;
                                    case 10:
                                        this.b.V.a(true);
                                        break;
                                    case 11:
                                        org.telegram.ui.zk zkVar4 = (org.telegram.ui.zk) this.b.V;
                                        zkVar4.a(true);
                                        org.telegram.ui.tn tnVar4 = zkVar4.D;
                                        tnVar4.C5 = null;
                                        org.telegram.ui.dk dkVar = tnVar4.U;
                                        if (dkVar != null) {
                                            dkVar.S2 = null;
                                            dkVar.T2 = false;
                                        }
                                        MessagePreviewParams messagePreviewParams6 = tnVar4.b5;
                                        if (messagePreviewParams6 != null) {
                                            i162 = ((org.telegram.ui.ActionBar.o2) tnVar4).currentAccount;
                                            MessageObject messageObject = tnVar4.j5;
                                            messagePreviewParams6.updateLink(i162, null, null, messageObject == tnVar4.T3 ? null : messageObject, tnVar4.h5, tnVar4.l5);
                                        }
                                        tnVar4.j8();
                                        break;
                                    case 12:
                                        lb0 lb0Var7 = this.b;
                                        MessagePreviewParams messagePreviewParams7 = lb0Var7.V.d;
                                        if (messagePreviewParams7.hasMedia) {
                                            boolean z15 = !messagePreviewParams7.webpageSmall;
                                            messagePreviewParams7.webpageSmall = z15;
                                            lb0Var7.C.a(z15, true);
                                            lb0Var7.D.a(messagePreviewParams7.webpageSmall, true);
                                            if (lb0Var7.r.messages.size() > 0 && (message2 = lb0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                                boolean z16 = messagePreviewParams7.webpageSmall;
                                                messageMedia2.force_small_media = z16;
                                                messageMedia2.force_large_media = !z16;
                                            }
                                            if (lb0Var7.r.previewMessages.size() > 0 && (message = lb0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                                boolean z17 = messagePreviewParams7.webpageSmall;
                                                messageMedia.force_small_media = z17;
                                                messageMedia.force_large_media = !z17;
                                            }
                                            lb0Var7.h();
                                            lb0Var7.Q = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        lb0 lb0Var8 = this.b;
                                        MessagePreviewParams messagePreviewParams8 = lb0Var8.V.d;
                                        boolean z18 = messagePreviewParams8.webpageTop;
                                        messagePreviewParams8.webpageTop = !z18;
                                        lb0Var8.A.a(z18, true);
                                        if (lb0Var8.r.messages.size() > 0 && (message4 = lb0Var8.r.messages.get(0).messageOwner) != null) {
                                            message4.invert_media = messagePreviewParams8.webpageTop;
                                        }
                                        if (lb0Var8.r.previewMessages.size() > 0 && (message3 = lb0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                            message3.invert_media = messagePreviewParams8.webpageTop;
                                        }
                                        lb0Var8.h();
                                        lb0Var8.Q = true;
                                        break;
                                }
                            }
                        });
                        lb0Var2 = lb0Var3;
                    }
                }
            } else {
                if (!UserConfig.getInstance(rb0Var.w).isPremium()) {
                    for (int i20 = 0; i20 < messagePreviewParams.forwardMessages.messages.size(); i20++) {
                        if (messagePreviewParams.forwardMessages.messages.get(i20).type == 36) {
                            z10 = false;
                            break;
                        }
                    }
                }
                z10 = true;
                qb0 qb0Var6 = new qb0(context, R.raw.name_hide, LocaleController.getString(messagePreviewParams.multipleUsers ? R.string.ShowSenderNames : R.string.ShowSendersName), R.raw.name_show, LocaleController.getString(messagePreviewParams.multipleUsers ? R.string.HideSenderNames : R.string.HideSendersName), rb0Var.B);
                this.s.a(qb0Var6, i7.f6.n(-1, 48));
                if (messagePreviewParams.hasCaption) {
                    qb0Var = qb0Var6;
                    qb0 qb0Var7 = new qb0(context, R.raw.caption_hide, LocaleController.getString(R.string.ShowCaption), R.raw.caption_show, LocaleController.getString(R.string.HideCaption), rb0Var.B);
                    qb0Var7.a(messagePreviewParams.hideCaption, false);
                    this.s.a(qb0Var7, i7.f6.n(-1, 48));
                    qb0Var2 = qb0Var7;
                } else {
                    qb0Var = qb0Var6;
                    qb0Var2 = null;
                }
                org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(0, context, rb0Var.B, true, false);
                final int i21 = 7;
                g1Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ua0
                    public final /* synthetic */ lb0 b;

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
                                lb0 lb0Var4 = this.b;
                                lb0Var4.V.d.quote = null;
                                lb0Var4.e.f(false);
                                lb0Var4.g(false, false);
                                lb0Var4.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                lb0 lb0Var5 = this.b;
                                db0 db0Var2 = lb0Var5.e;
                                rb0 rb0Var2 = lb0Var5.V;
                                if (lb0Var5.c(null) != null) {
                                    if (db0Var2.v - db0Var2.u <= MessagesController.getInstance(rb0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.s9 s9Var = db0Var2.W;
                                        MessageObject c6 = lb0Var5.c(s9Var != null ? ((org.telegram.ui.Cells.s1) s9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams4 = rb0Var2.d;
                                        int i172 = db0Var2.u;
                                        messagePreviewParams4.quoteStart = i172;
                                        int i182 = db0Var2.v;
                                        messagePreviewParams4.quoteEnd = i182;
                                        messagePreviewParams4.quote = org.telegram.ui.jn.b(i172, i182, c6);
                                        rb0Var2.b();
                                        rb0Var2.a(true);
                                        break;
                                    } else {
                                        lb0Var5.f();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                lb0 lb0Var6 = this.b;
                                db0 db0Var3 = lb0Var6.e;
                                rb0 rb0Var3 = lb0Var6.V;
                                MessagePreviewParams messagePreviewParams5 = rb0Var3.d;
                                int i192 = rb0Var3.w;
                                boolean z14 = rb0Var3.b;
                                if (messagePreviewParams5.quote != null && !z14) {
                                    messagePreviewParams5.quote = null;
                                    db0Var3.f(false);
                                    lb0Var6.g(false, true);
                                    lb0Var6.k(true);
                                    break;
                                } else if (db0Var3.v - db0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                    MessageObject c10 = lb0Var6.c(null);
                                    if (c10 != null) {
                                        if (!db0Var3.y()) {
                                            messagePreviewParams5.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c10.messageOwner.message.length());
                                            messagePreviewParams5.quoteEnd = min;
                                            messagePreviewParams5.quote = org.telegram.ui.jn.b(messagePreviewParams5.quoteStart, min, c10);
                                            View d10 = lb0Var6.d();
                                            if (d10 instanceof org.telegram.ui.Cells.s1) {
                                                db0Var3.a0((org.telegram.ui.Cells.s1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            }
                                            if (!z14) {
                                                lb0Var6.s.getSwipeBack().e(lb0Var6.E);
                                            }
                                            lb0Var6.g(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams5.quoteStart = db0Var3.u;
                                            messagePreviewParams5.quoteEnd = db0Var3.v;
                                            org.telegram.ui.Cells.s9 s9Var2 = db0Var3.W;
                                            messagePreviewParams5.quote = org.telegram.ui.jn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, lb0Var6.c(s9Var2 != null ? ((org.telegram.ui.Cells.s1) s9Var2).getMessageObject() : null));
                                            rb0Var3.b();
                                            rb0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    lb0Var6.f();
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
                                rb0 rb0Var4 = this.b.V;
                                if (!rb0Var4.b) {
                                    org.telegram.ui.zk zkVar = (org.telegram.ui.zk) rb0Var4;
                                    zkVar.a(true);
                                    org.telegram.ui.tn tnVar = zkVar.D;
                                    tnVar.j5 = null;
                                    tnVar.h5 = null;
                                    tnVar.b5.updateReply(null, null, tnVar.P5, null);
                                    tnVar.j8();
                                    break;
                                } else {
                                    org.telegram.ui.zk zkVar2 = (org.telegram.ui.zk) rb0Var4;
                                    zkVar2.a(true);
                                    org.telegram.ui.tn tnVar2 = zkVar2.D;
                                    tnVar2.h5 = null;
                                    tnVar2.Bb(tnVar2.j5);
                                    break;
                                }
                            case 7:
                                this.b.V.c(true);
                                break;
                            case 8:
                                this.b.V.a(true);
                                break;
                            case 9:
                                org.telegram.ui.zk zkVar3 = (org.telegram.ui.zk) this.b.V;
                                zkVar3.a(true);
                                org.telegram.ui.tn tnVar3 = zkVar3.D;
                                tnVar3.b5.updateForward(null, tnVar3.P5);
                                tnVar3.j8();
                                break;
                            case 10:
                                this.b.V.a(true);
                                break;
                            case 11:
                                org.telegram.ui.zk zkVar4 = (org.telegram.ui.zk) this.b.V;
                                zkVar4.a(true);
                                org.telegram.ui.tn tnVar4 = zkVar4.D;
                                tnVar4.C5 = null;
                                org.telegram.ui.dk dkVar = tnVar4.U;
                                if (dkVar != null) {
                                    dkVar.S2 = null;
                                    dkVar.T2 = false;
                                }
                                MessagePreviewParams messagePreviewParams6 = tnVar4.b5;
                                if (messagePreviewParams6 != null) {
                                    i162 = ((org.telegram.ui.ActionBar.o2) tnVar4).currentAccount;
                                    MessageObject messageObject = tnVar4.j5;
                                    messagePreviewParams6.updateLink(i162, null, null, messageObject == tnVar4.T3 ? null : messageObject, tnVar4.h5, tnVar4.l5);
                                }
                                tnVar4.j8();
                                break;
                            case 12:
                                lb0 lb0Var7 = this.b;
                                MessagePreviewParams messagePreviewParams7 = lb0Var7.V.d;
                                if (messagePreviewParams7.hasMedia) {
                                    boolean z15 = !messagePreviewParams7.webpageSmall;
                                    messagePreviewParams7.webpageSmall = z15;
                                    lb0Var7.C.a(z15, true);
                                    lb0Var7.D.a(messagePreviewParams7.webpageSmall, true);
                                    if (lb0Var7.r.messages.size() > 0 && (message2 = lb0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z16 = messagePreviewParams7.webpageSmall;
                                        messageMedia2.force_small_media = z16;
                                        messageMedia2.force_large_media = !z16;
                                    }
                                    if (lb0Var7.r.previewMessages.size() > 0 && (message = lb0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z17 = messagePreviewParams7.webpageSmall;
                                        messageMedia.force_small_media = z17;
                                        messageMedia.force_large_media = !z17;
                                    }
                                    lb0Var7.h();
                                    lb0Var7.Q = true;
                                    break;
                                }
                                break;
                            default:
                                lb0 lb0Var8 = this.b;
                                MessagePreviewParams messagePreviewParams8 = lb0Var8.V.d;
                                boolean z18 = messagePreviewParams8.webpageTop;
                                messagePreviewParams8.webpageTop = !z18;
                                lb0Var8.A.a(z18, true);
                                if (lb0Var8.r.messages.size() > 0 && (message4 = lb0Var8.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams8.webpageTop;
                                }
                                if (lb0Var8.r.previewMessages.size() > 0 && (message3 = lb0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams8.webpageTop;
                                }
                                lb0Var8.h();
                                lb0Var8.Q = true;
                                break;
                        }
                    }
                });
                g1Var3.g(LocaleController.getString(R.string.ChangeRecipient), R.drawable.msg_forward_replace, null);
                this.s.a(g1Var3, i7.f6.n(-1, 48));
                org.telegram.ui.ActionBar.l1 l1Var2 = new org.telegram.ui.ActionBar.l1(context, nb0Var);
                l1Var2.setColor(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, nb0Var)));
                l1Var2.setTag(R.id.fit_width_tag, 1);
                final int i22 = 8;
                this.s.a(l1Var2, i7.f6.n(-1, 8));
                org.telegram.ui.ActionBar.g1 g1Var4 = new org.telegram.ui.ActionBar.g1(1, context, rb0Var.B, false, false);
                g1Var4.g(LocaleController.getString(R.string.ApplyChanges), R.drawable.msg_select, null);
                g1Var4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ua0
                    public final /* synthetic */ lb0 b;

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
                                lb0 lb0Var4 = this.b;
                                lb0Var4.V.d.quote = null;
                                lb0Var4.e.f(false);
                                lb0Var4.g(false, false);
                                lb0Var4.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                lb0 lb0Var5 = this.b;
                                db0 db0Var2 = lb0Var5.e;
                                rb0 rb0Var2 = lb0Var5.V;
                                if (lb0Var5.c(null) != null) {
                                    if (db0Var2.v - db0Var2.u <= MessagesController.getInstance(rb0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.s9 s9Var = db0Var2.W;
                                        MessageObject c6 = lb0Var5.c(s9Var != null ? ((org.telegram.ui.Cells.s1) s9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams4 = rb0Var2.d;
                                        int i172 = db0Var2.u;
                                        messagePreviewParams4.quoteStart = i172;
                                        int i182 = db0Var2.v;
                                        messagePreviewParams4.quoteEnd = i182;
                                        messagePreviewParams4.quote = org.telegram.ui.jn.b(i172, i182, c6);
                                        rb0Var2.b();
                                        rb0Var2.a(true);
                                        break;
                                    } else {
                                        lb0Var5.f();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                lb0 lb0Var6 = this.b;
                                db0 db0Var3 = lb0Var6.e;
                                rb0 rb0Var3 = lb0Var6.V;
                                MessagePreviewParams messagePreviewParams5 = rb0Var3.d;
                                int i192 = rb0Var3.w;
                                boolean z14 = rb0Var3.b;
                                if (messagePreviewParams5.quote != null && !z14) {
                                    messagePreviewParams5.quote = null;
                                    db0Var3.f(false);
                                    lb0Var6.g(false, true);
                                    lb0Var6.k(true);
                                    break;
                                } else if (db0Var3.v - db0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                    MessageObject c10 = lb0Var6.c(null);
                                    if (c10 != null) {
                                        if (!db0Var3.y()) {
                                            messagePreviewParams5.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c10.messageOwner.message.length());
                                            messagePreviewParams5.quoteEnd = min;
                                            messagePreviewParams5.quote = org.telegram.ui.jn.b(messagePreviewParams5.quoteStart, min, c10);
                                            View d10 = lb0Var6.d();
                                            if (d10 instanceof org.telegram.ui.Cells.s1) {
                                                db0Var3.a0((org.telegram.ui.Cells.s1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            }
                                            if (!z14) {
                                                lb0Var6.s.getSwipeBack().e(lb0Var6.E);
                                            }
                                            lb0Var6.g(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams5.quoteStart = db0Var3.u;
                                            messagePreviewParams5.quoteEnd = db0Var3.v;
                                            org.telegram.ui.Cells.s9 s9Var2 = db0Var3.W;
                                            messagePreviewParams5.quote = org.telegram.ui.jn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, lb0Var6.c(s9Var2 != null ? ((org.telegram.ui.Cells.s1) s9Var2).getMessageObject() : null));
                                            rb0Var3.b();
                                            rb0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    lb0Var6.f();
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
                                rb0 rb0Var4 = this.b.V;
                                if (!rb0Var4.b) {
                                    org.telegram.ui.zk zkVar = (org.telegram.ui.zk) rb0Var4;
                                    zkVar.a(true);
                                    org.telegram.ui.tn tnVar = zkVar.D;
                                    tnVar.j5 = null;
                                    tnVar.h5 = null;
                                    tnVar.b5.updateReply(null, null, tnVar.P5, null);
                                    tnVar.j8();
                                    break;
                                } else {
                                    org.telegram.ui.zk zkVar2 = (org.telegram.ui.zk) rb0Var4;
                                    zkVar2.a(true);
                                    org.telegram.ui.tn tnVar2 = zkVar2.D;
                                    tnVar2.h5 = null;
                                    tnVar2.Bb(tnVar2.j5);
                                    break;
                                }
                            case 7:
                                this.b.V.c(true);
                                break;
                            case 8:
                                this.b.V.a(true);
                                break;
                            case 9:
                                org.telegram.ui.zk zkVar3 = (org.telegram.ui.zk) this.b.V;
                                zkVar3.a(true);
                                org.telegram.ui.tn tnVar3 = zkVar3.D;
                                tnVar3.b5.updateForward(null, tnVar3.P5);
                                tnVar3.j8();
                                break;
                            case 10:
                                this.b.V.a(true);
                                break;
                            case 11:
                                org.telegram.ui.zk zkVar4 = (org.telegram.ui.zk) this.b.V;
                                zkVar4.a(true);
                                org.telegram.ui.tn tnVar4 = zkVar4.D;
                                tnVar4.C5 = null;
                                org.telegram.ui.dk dkVar = tnVar4.U;
                                if (dkVar != null) {
                                    dkVar.S2 = null;
                                    dkVar.T2 = false;
                                }
                                MessagePreviewParams messagePreviewParams6 = tnVar4.b5;
                                if (messagePreviewParams6 != null) {
                                    i162 = ((org.telegram.ui.ActionBar.o2) tnVar4).currentAccount;
                                    MessageObject messageObject = tnVar4.j5;
                                    messagePreviewParams6.updateLink(i162, null, null, messageObject == tnVar4.T3 ? null : messageObject, tnVar4.h5, tnVar4.l5);
                                }
                                tnVar4.j8();
                                break;
                            case 12:
                                lb0 lb0Var7 = this.b;
                                MessagePreviewParams messagePreviewParams7 = lb0Var7.V.d;
                                if (messagePreviewParams7.hasMedia) {
                                    boolean z15 = !messagePreviewParams7.webpageSmall;
                                    messagePreviewParams7.webpageSmall = z15;
                                    lb0Var7.C.a(z15, true);
                                    lb0Var7.D.a(messagePreviewParams7.webpageSmall, true);
                                    if (lb0Var7.r.messages.size() > 0 && (message2 = lb0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z16 = messagePreviewParams7.webpageSmall;
                                        messageMedia2.force_small_media = z16;
                                        messageMedia2.force_large_media = !z16;
                                    }
                                    if (lb0Var7.r.previewMessages.size() > 0 && (message = lb0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z17 = messagePreviewParams7.webpageSmall;
                                        messageMedia.force_small_media = z17;
                                        messageMedia.force_large_media = !z17;
                                    }
                                    lb0Var7.h();
                                    lb0Var7.Q = true;
                                    break;
                                }
                                break;
                            default:
                                lb0 lb0Var8 = this.b;
                                MessagePreviewParams messagePreviewParams8 = lb0Var8.V.d;
                                boolean z18 = messagePreviewParams8.webpageTop;
                                messagePreviewParams8.webpageTop = !z18;
                                lb0Var8.A.a(z18, true);
                                if (lb0Var8.r.messages.size() > 0 && (message4 = lb0Var8.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams8.webpageTop;
                                }
                                if (lb0Var8.r.previewMessages.size() > 0 && (message3 = lb0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams8.webpageTop;
                                }
                                lb0Var8.h();
                                lb0Var8.Q = true;
                                break;
                        }
                    }
                });
                this.s.a(g1Var4, i7.f6.n(-1, 48));
                org.telegram.ui.ActionBar.g1 g1Var5 = new org.telegram.ui.ActionBar.g1(1, context, rb0Var.B, false, true);
                g1Var5.g(LocaleController.getString(R.string.DoNotForward), R.drawable.msg_delete, null);
                int v03 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.q7, nb0Var);
                int i23 = org.telegram.ui.ActionBar.g6.p7;
                g1Var5.c(v03, org.telegram.ui.ActionBar.g6.v0(i23, nb0Var));
                final int i24 = 9;
                g1Var5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ua0
                    public final /* synthetic */ lb0 b;

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
                                lb0 lb0Var4 = this.b;
                                lb0Var4.V.d.quote = null;
                                lb0Var4.e.f(false);
                                lb0Var4.g(false, false);
                                lb0Var4.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                lb0 lb0Var5 = this.b;
                                db0 db0Var2 = lb0Var5.e;
                                rb0 rb0Var2 = lb0Var5.V;
                                if (lb0Var5.c(null) != null) {
                                    if (db0Var2.v - db0Var2.u <= MessagesController.getInstance(rb0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.s9 s9Var = db0Var2.W;
                                        MessageObject c6 = lb0Var5.c(s9Var != null ? ((org.telegram.ui.Cells.s1) s9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams4 = rb0Var2.d;
                                        int i172 = db0Var2.u;
                                        messagePreviewParams4.quoteStart = i172;
                                        int i182 = db0Var2.v;
                                        messagePreviewParams4.quoteEnd = i182;
                                        messagePreviewParams4.quote = org.telegram.ui.jn.b(i172, i182, c6);
                                        rb0Var2.b();
                                        rb0Var2.a(true);
                                        break;
                                    } else {
                                        lb0Var5.f();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                lb0 lb0Var6 = this.b;
                                db0 db0Var3 = lb0Var6.e;
                                rb0 rb0Var3 = lb0Var6.V;
                                MessagePreviewParams messagePreviewParams5 = rb0Var3.d;
                                int i192 = rb0Var3.w;
                                boolean z14 = rb0Var3.b;
                                if (messagePreviewParams5.quote != null && !z14) {
                                    messagePreviewParams5.quote = null;
                                    db0Var3.f(false);
                                    lb0Var6.g(false, true);
                                    lb0Var6.k(true);
                                    break;
                                } else if (db0Var3.v - db0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                    MessageObject c10 = lb0Var6.c(null);
                                    if (c10 != null) {
                                        if (!db0Var3.y()) {
                                            messagePreviewParams5.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c10.messageOwner.message.length());
                                            messagePreviewParams5.quoteEnd = min;
                                            messagePreviewParams5.quote = org.telegram.ui.jn.b(messagePreviewParams5.quoteStart, min, c10);
                                            View d10 = lb0Var6.d();
                                            if (d10 instanceof org.telegram.ui.Cells.s1) {
                                                db0Var3.a0((org.telegram.ui.Cells.s1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            }
                                            if (!z14) {
                                                lb0Var6.s.getSwipeBack().e(lb0Var6.E);
                                            }
                                            lb0Var6.g(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams5.quoteStart = db0Var3.u;
                                            messagePreviewParams5.quoteEnd = db0Var3.v;
                                            org.telegram.ui.Cells.s9 s9Var2 = db0Var3.W;
                                            messagePreviewParams5.quote = org.telegram.ui.jn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, lb0Var6.c(s9Var2 != null ? ((org.telegram.ui.Cells.s1) s9Var2).getMessageObject() : null));
                                            rb0Var3.b();
                                            rb0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    lb0Var6.f();
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
                                rb0 rb0Var4 = this.b.V;
                                if (!rb0Var4.b) {
                                    org.telegram.ui.zk zkVar = (org.telegram.ui.zk) rb0Var4;
                                    zkVar.a(true);
                                    org.telegram.ui.tn tnVar = zkVar.D;
                                    tnVar.j5 = null;
                                    tnVar.h5 = null;
                                    tnVar.b5.updateReply(null, null, tnVar.P5, null);
                                    tnVar.j8();
                                    break;
                                } else {
                                    org.telegram.ui.zk zkVar2 = (org.telegram.ui.zk) rb0Var4;
                                    zkVar2.a(true);
                                    org.telegram.ui.tn tnVar2 = zkVar2.D;
                                    tnVar2.h5 = null;
                                    tnVar2.Bb(tnVar2.j5);
                                    break;
                                }
                            case 7:
                                this.b.V.c(true);
                                break;
                            case 8:
                                this.b.V.a(true);
                                break;
                            case 9:
                                org.telegram.ui.zk zkVar3 = (org.telegram.ui.zk) this.b.V;
                                zkVar3.a(true);
                                org.telegram.ui.tn tnVar3 = zkVar3.D;
                                tnVar3.b5.updateForward(null, tnVar3.P5);
                                tnVar3.j8();
                                break;
                            case 10:
                                this.b.V.a(true);
                                break;
                            case 11:
                                org.telegram.ui.zk zkVar4 = (org.telegram.ui.zk) this.b.V;
                                zkVar4.a(true);
                                org.telegram.ui.tn tnVar4 = zkVar4.D;
                                tnVar4.C5 = null;
                                org.telegram.ui.dk dkVar = tnVar4.U;
                                if (dkVar != null) {
                                    dkVar.S2 = null;
                                    dkVar.T2 = false;
                                }
                                MessagePreviewParams messagePreviewParams6 = tnVar4.b5;
                                if (messagePreviewParams6 != null) {
                                    i162 = ((org.telegram.ui.ActionBar.o2) tnVar4).currentAccount;
                                    MessageObject messageObject = tnVar4.j5;
                                    messagePreviewParams6.updateLink(i162, null, null, messageObject == tnVar4.T3 ? null : messageObject, tnVar4.h5, tnVar4.l5);
                                }
                                tnVar4.j8();
                                break;
                            case 12:
                                lb0 lb0Var7 = this.b;
                                MessagePreviewParams messagePreviewParams7 = lb0Var7.V.d;
                                if (messagePreviewParams7.hasMedia) {
                                    boolean z15 = !messagePreviewParams7.webpageSmall;
                                    messagePreviewParams7.webpageSmall = z15;
                                    lb0Var7.C.a(z15, true);
                                    lb0Var7.D.a(messagePreviewParams7.webpageSmall, true);
                                    if (lb0Var7.r.messages.size() > 0 && (message2 = lb0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z16 = messagePreviewParams7.webpageSmall;
                                        messageMedia2.force_small_media = z16;
                                        messageMedia2.force_large_media = !z16;
                                    }
                                    if (lb0Var7.r.previewMessages.size() > 0 && (message = lb0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z17 = messagePreviewParams7.webpageSmall;
                                        messageMedia.force_small_media = z17;
                                        messageMedia.force_large_media = !z17;
                                    }
                                    lb0Var7.h();
                                    lb0Var7.Q = true;
                                    break;
                                }
                                break;
                            default:
                                lb0 lb0Var8 = this.b;
                                MessagePreviewParams messagePreviewParams8 = lb0Var8.V.d;
                                boolean z18 = messagePreviewParams8.webpageTop;
                                messagePreviewParams8.webpageTop = !z18;
                                lb0Var8.A.a(z18, true);
                                if (lb0Var8.r.messages.size() > 0 && (message4 = lb0Var8.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams8.webpageTop;
                                }
                                if (lb0Var8.r.previewMessages.size() > 0 && (message3 = lb0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams8.webpageTop;
                                }
                                lb0Var8.h();
                                lb0Var8.Q = true;
                                break;
                        }
                    }
                });
                int i25 = 0;
                g1Var5.setSelectorColor(org.telegram.ui.ActionBar.g6.l1(0.12f, org.telegram.ui.ActionBar.g6.w0(null, i23, false)));
                this.s.a(g1Var5, i7.f6.n(-1, 48));
                qb0 qb0Var8 = qb0Var;
                qb0Var8.a(messagePreviewParams.hideForwardSendersName, false);
                qb0 qb0Var9 = qb0Var2;
                lb0 lb0Var4 = this;
                qb0Var8.setOnClickListener(new ih.y2(this, z10, context, qb0Var9, qb0Var8, 1));
                lb0Var = lb0Var4;
                if (qb0Var9 != null) {
                    qb0Var9.setOnClickListener(new ya0(lb0Var4, qb0Var9, qb0Var8, i25));
                    lb0Var = lb0Var4;
                }
            }
            context2 = context;
            lb0Var2 = lb0Var;
        } else {
            if (!messages.hasText || messagePreviewParams3.isSecret) {
                z11 = z13;
                r13 = 0;
                messagePreviewParams = messagePreviewParams3;
            } else {
                LinearLayout g10 = org.telegram.messenger.x3.g(context3, 1);
                if (z13) {
                    messagePreviewParams2 = messagePreviewParams3;
                    z11 = z13;
                    z12 = true;
                    obj = null;
                } else {
                    z11 = z13;
                    messagePreviewParams2 = messagePreviewParams3;
                    obj = null;
                    org.telegram.ui.ActionBar.g1 g1Var6 = new org.telegram.ui.ActionBar.g1(0, context3, rb0Var.B, true, false);
                    g1Var6.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                    g1Var6.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ua0
                        public final /* synthetic */ lb0 b;

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
                            switch (i11) {
                                case 0:
                                    lb0 lb0Var42 = this.b;
                                    lb0Var42.V.d.quote = null;
                                    lb0Var42.e.f(false);
                                    lb0Var42.g(false, false);
                                    lb0Var42.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    lb0 lb0Var5 = this.b;
                                    db0 db0Var2 = lb0Var5.e;
                                    rb0 rb0Var2 = lb0Var5.V;
                                    if (lb0Var5.c(null) != null) {
                                        if (db0Var2.v - db0Var2.u <= MessagesController.getInstance(rb0Var2.w).quoteLengthMax) {
                                            org.telegram.ui.Cells.s9 s9Var = db0Var2.W;
                                            MessageObject c6 = lb0Var5.c(s9Var != null ? ((org.telegram.ui.Cells.s1) s9Var).getMessageObject() : null);
                                            MessagePreviewParams messagePreviewParams4 = rb0Var2.d;
                                            int i172 = db0Var2.u;
                                            messagePreviewParams4.quoteStart = i172;
                                            int i182 = db0Var2.v;
                                            messagePreviewParams4.quoteEnd = i182;
                                            messagePreviewParams4.quote = org.telegram.ui.jn.b(i172, i182, c6);
                                            rb0Var2.b();
                                            rb0Var2.a(true);
                                            break;
                                        } else {
                                            lb0Var5.f();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    lb0 lb0Var6 = this.b;
                                    db0 db0Var3 = lb0Var6.e;
                                    rb0 rb0Var3 = lb0Var6.V;
                                    MessagePreviewParams messagePreviewParams5 = rb0Var3.d;
                                    int i192 = rb0Var3.w;
                                    boolean z14 = rb0Var3.b;
                                    if (messagePreviewParams5.quote != null && !z14) {
                                        messagePreviewParams5.quote = null;
                                        db0Var3.f(false);
                                        lb0Var6.g(false, true);
                                        lb0Var6.k(true);
                                        break;
                                    } else if (db0Var3.v - db0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                        MessageObject c10 = lb0Var6.c(null);
                                        if (c10 != null) {
                                            if (!db0Var3.y()) {
                                                messagePreviewParams5.quoteStart = 0;
                                                int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c10.messageOwner.message.length());
                                                messagePreviewParams5.quoteEnd = min;
                                                messagePreviewParams5.quote = org.telegram.ui.jn.b(messagePreviewParams5.quoteStart, min, c10);
                                                View d10 = lb0Var6.d();
                                                if (d10 instanceof org.telegram.ui.Cells.s1) {
                                                    db0Var3.a0((org.telegram.ui.Cells.s1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                }
                                                if (!z14) {
                                                    lb0Var6.s.getSwipeBack().e(lb0Var6.E);
                                                }
                                                lb0Var6.g(true, true);
                                                break;
                                            } else {
                                                messagePreviewParams5.quoteStart = db0Var3.u;
                                                messagePreviewParams5.quoteEnd = db0Var3.v;
                                                org.telegram.ui.Cells.s9 s9Var2 = db0Var3.W;
                                                messagePreviewParams5.quote = org.telegram.ui.jn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, lb0Var6.c(s9Var2 != null ? ((org.telegram.ui.Cells.s1) s9Var2).getMessageObject() : null));
                                                rb0Var3.b();
                                                rb0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        lb0Var6.f();
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
                                    rb0 rb0Var4 = this.b.V;
                                    if (!rb0Var4.b) {
                                        org.telegram.ui.zk zkVar = (org.telegram.ui.zk) rb0Var4;
                                        zkVar.a(true);
                                        org.telegram.ui.tn tnVar = zkVar.D;
                                        tnVar.j5 = null;
                                        tnVar.h5 = null;
                                        tnVar.b5.updateReply(null, null, tnVar.P5, null);
                                        tnVar.j8();
                                        break;
                                    } else {
                                        org.telegram.ui.zk zkVar2 = (org.telegram.ui.zk) rb0Var4;
                                        zkVar2.a(true);
                                        org.telegram.ui.tn tnVar2 = zkVar2.D;
                                        tnVar2.h5 = null;
                                        tnVar2.Bb(tnVar2.j5);
                                        break;
                                    }
                                case 7:
                                    this.b.V.c(true);
                                    break;
                                case 8:
                                    this.b.V.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.zk zkVar3 = (org.telegram.ui.zk) this.b.V;
                                    zkVar3.a(true);
                                    org.telegram.ui.tn tnVar3 = zkVar3.D;
                                    tnVar3.b5.updateForward(null, tnVar3.P5);
                                    tnVar3.j8();
                                    break;
                                case 10:
                                    this.b.V.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.zk zkVar4 = (org.telegram.ui.zk) this.b.V;
                                    zkVar4.a(true);
                                    org.telegram.ui.tn tnVar4 = zkVar4.D;
                                    tnVar4.C5 = null;
                                    org.telegram.ui.dk dkVar = tnVar4.U;
                                    if (dkVar != null) {
                                        dkVar.S2 = null;
                                        dkVar.T2 = false;
                                    }
                                    MessagePreviewParams messagePreviewParams6 = tnVar4.b5;
                                    if (messagePreviewParams6 != null) {
                                        i162 = ((org.telegram.ui.ActionBar.o2) tnVar4).currentAccount;
                                        MessageObject messageObject = tnVar4.j5;
                                        messagePreviewParams6.updateLink(i162, null, null, messageObject == tnVar4.T3 ? null : messageObject, tnVar4.h5, tnVar4.l5);
                                    }
                                    tnVar4.j8();
                                    break;
                                case 12:
                                    lb0 lb0Var7 = this.b;
                                    MessagePreviewParams messagePreviewParams7 = lb0Var7.V.d;
                                    if (messagePreviewParams7.hasMedia) {
                                        boolean z15 = !messagePreviewParams7.webpageSmall;
                                        messagePreviewParams7.webpageSmall = z15;
                                        lb0Var7.C.a(z15, true);
                                        lb0Var7.D.a(messagePreviewParams7.webpageSmall, true);
                                        if (lb0Var7.r.messages.size() > 0 && (message2 = lb0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z16 = messagePreviewParams7.webpageSmall;
                                            messageMedia2.force_small_media = z16;
                                            messageMedia2.force_large_media = !z16;
                                        }
                                        if (lb0Var7.r.previewMessages.size() > 0 && (message = lb0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                            boolean z17 = messagePreviewParams7.webpageSmall;
                                            messageMedia.force_small_media = z17;
                                            messageMedia.force_large_media = !z17;
                                        }
                                        lb0Var7.h();
                                        lb0Var7.Q = true;
                                        break;
                                    }
                                    break;
                                default:
                                    lb0 lb0Var8 = this.b;
                                    MessagePreviewParams messagePreviewParams8 = lb0Var8.V.d;
                                    boolean z18 = messagePreviewParams8.webpageTop;
                                    messagePreviewParams8.webpageTop = !z18;
                                    lb0Var8.A.a(z18, true);
                                    if (lb0Var8.r.messages.size() > 0 && (message4 = lb0Var8.r.messages.get(0).messageOwner) != null) {
                                        message4.invert_media = messagePreviewParams8.webpageTop;
                                    }
                                    if (lb0Var8.r.previewMessages.size() > 0 && (message3 = lb0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                        message3.invert_media = messagePreviewParams8.webpageTop;
                                    }
                                    lb0Var8.h();
                                    lb0Var8.Q = true;
                                    break;
                            }
                        }
                    });
                    g10.addView(g1Var6, i7.f6.n(-1, 48));
                    org.telegram.ui.ActionBar.l1 l1Var3 = new org.telegram.ui.ActionBar.l1(context3, nb0Var);
                    l1Var3.setColor(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, nb0Var)));
                    l1Var3.setTag(R.id.fit_width_tag, 1);
                    g10.addView(l1Var3, i7.f6.n(-1, 8));
                    org.telegram.ui.ActionBar.g1 g1Var7 = new org.telegram.ui.ActionBar.g1(0, context3, rb0Var.B, false, true);
                    g1Var7.g(LocaleController.getString(R.string.QuoteSelectedPart), R.drawable.menu_quote_specific, null);
                    z12 = true;
                    final boolean z14 = true ? 1 : 0;
                    g1Var7.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ua0
                        public final /* synthetic */ lb0 b;

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
                            switch (z14) {
                                case 0:
                                    lb0 lb0Var42 = this.b;
                                    lb0Var42.V.d.quote = null;
                                    lb0Var42.e.f(false);
                                    lb0Var42.g(false, false);
                                    lb0Var42.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    lb0 lb0Var5 = this.b;
                                    db0 db0Var2 = lb0Var5.e;
                                    rb0 rb0Var2 = lb0Var5.V;
                                    if (lb0Var5.c(null) != null) {
                                        if (db0Var2.v - db0Var2.u <= MessagesController.getInstance(rb0Var2.w).quoteLengthMax) {
                                            org.telegram.ui.Cells.s9 s9Var = db0Var2.W;
                                            MessageObject c6 = lb0Var5.c(s9Var != null ? ((org.telegram.ui.Cells.s1) s9Var).getMessageObject() : null);
                                            MessagePreviewParams messagePreviewParams4 = rb0Var2.d;
                                            int i172 = db0Var2.u;
                                            messagePreviewParams4.quoteStart = i172;
                                            int i182 = db0Var2.v;
                                            messagePreviewParams4.quoteEnd = i182;
                                            messagePreviewParams4.quote = org.telegram.ui.jn.b(i172, i182, c6);
                                            rb0Var2.b();
                                            rb0Var2.a(true);
                                            break;
                                        } else {
                                            lb0Var5.f();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    lb0 lb0Var6 = this.b;
                                    db0 db0Var3 = lb0Var6.e;
                                    rb0 rb0Var3 = lb0Var6.V;
                                    MessagePreviewParams messagePreviewParams5 = rb0Var3.d;
                                    int i192 = rb0Var3.w;
                                    boolean z142 = rb0Var3.b;
                                    if (messagePreviewParams5.quote != null && !z142) {
                                        messagePreviewParams5.quote = null;
                                        db0Var3.f(false);
                                        lb0Var6.g(false, true);
                                        lb0Var6.k(true);
                                        break;
                                    } else if (db0Var3.v - db0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                        MessageObject c10 = lb0Var6.c(null);
                                        if (c10 != null) {
                                            if (!db0Var3.y()) {
                                                messagePreviewParams5.quoteStart = 0;
                                                int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c10.messageOwner.message.length());
                                                messagePreviewParams5.quoteEnd = min;
                                                messagePreviewParams5.quote = org.telegram.ui.jn.b(messagePreviewParams5.quoteStart, min, c10);
                                                View d10 = lb0Var6.d();
                                                if (d10 instanceof org.telegram.ui.Cells.s1) {
                                                    db0Var3.a0((org.telegram.ui.Cells.s1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                }
                                                if (!z142) {
                                                    lb0Var6.s.getSwipeBack().e(lb0Var6.E);
                                                }
                                                lb0Var6.g(true, true);
                                                break;
                                            } else {
                                                messagePreviewParams5.quoteStart = db0Var3.u;
                                                messagePreviewParams5.quoteEnd = db0Var3.v;
                                                org.telegram.ui.Cells.s9 s9Var2 = db0Var3.W;
                                                messagePreviewParams5.quote = org.telegram.ui.jn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, lb0Var6.c(s9Var2 != null ? ((org.telegram.ui.Cells.s1) s9Var2).getMessageObject() : null));
                                                rb0Var3.b();
                                                rb0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        lb0Var6.f();
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
                                    rb0 rb0Var4 = this.b.V;
                                    if (!rb0Var4.b) {
                                        org.telegram.ui.zk zkVar = (org.telegram.ui.zk) rb0Var4;
                                        zkVar.a(true);
                                        org.telegram.ui.tn tnVar = zkVar.D;
                                        tnVar.j5 = null;
                                        tnVar.h5 = null;
                                        tnVar.b5.updateReply(null, null, tnVar.P5, null);
                                        tnVar.j8();
                                        break;
                                    } else {
                                        org.telegram.ui.zk zkVar2 = (org.telegram.ui.zk) rb0Var4;
                                        zkVar2.a(true);
                                        org.telegram.ui.tn tnVar2 = zkVar2.D;
                                        tnVar2.h5 = null;
                                        tnVar2.Bb(tnVar2.j5);
                                        break;
                                    }
                                case 7:
                                    this.b.V.c(true);
                                    break;
                                case 8:
                                    this.b.V.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.zk zkVar3 = (org.telegram.ui.zk) this.b.V;
                                    zkVar3.a(true);
                                    org.telegram.ui.tn tnVar3 = zkVar3.D;
                                    tnVar3.b5.updateForward(null, tnVar3.P5);
                                    tnVar3.j8();
                                    break;
                                case 10:
                                    this.b.V.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.zk zkVar4 = (org.telegram.ui.zk) this.b.V;
                                    zkVar4.a(true);
                                    org.telegram.ui.tn tnVar4 = zkVar4.D;
                                    tnVar4.C5 = null;
                                    org.telegram.ui.dk dkVar = tnVar4.U;
                                    if (dkVar != null) {
                                        dkVar.S2 = null;
                                        dkVar.T2 = false;
                                    }
                                    MessagePreviewParams messagePreviewParams6 = tnVar4.b5;
                                    if (messagePreviewParams6 != null) {
                                        i162 = ((org.telegram.ui.ActionBar.o2) tnVar4).currentAccount;
                                        MessageObject messageObject = tnVar4.j5;
                                        messagePreviewParams6.updateLink(i162, null, null, messageObject == tnVar4.T3 ? null : messageObject, tnVar4.h5, tnVar4.l5);
                                    }
                                    tnVar4.j8();
                                    break;
                                case 12:
                                    lb0 lb0Var7 = this.b;
                                    MessagePreviewParams messagePreviewParams7 = lb0Var7.V.d;
                                    if (messagePreviewParams7.hasMedia) {
                                        boolean z15 = !messagePreviewParams7.webpageSmall;
                                        messagePreviewParams7.webpageSmall = z15;
                                        lb0Var7.C.a(z15, true);
                                        lb0Var7.D.a(messagePreviewParams7.webpageSmall, true);
                                        if (lb0Var7.r.messages.size() > 0 && (message2 = lb0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z16 = messagePreviewParams7.webpageSmall;
                                            messageMedia2.force_small_media = z16;
                                            messageMedia2.force_large_media = !z16;
                                        }
                                        if (lb0Var7.r.previewMessages.size() > 0 && (message = lb0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                            boolean z17 = messagePreviewParams7.webpageSmall;
                                            messageMedia.force_small_media = z17;
                                            messageMedia.force_large_media = !z17;
                                        }
                                        lb0Var7.h();
                                        lb0Var7.Q = true;
                                        break;
                                    }
                                    break;
                                default:
                                    lb0 lb0Var8 = this.b;
                                    MessagePreviewParams messagePreviewParams8 = lb0Var8.V.d;
                                    boolean z18 = messagePreviewParams8.webpageTop;
                                    messagePreviewParams8.webpageTop = !z18;
                                    lb0Var8.A.a(z18, true);
                                    if (lb0Var8.r.messages.size() > 0 && (message4 = lb0Var8.r.messages.get(0).messageOwner) != null) {
                                        message4.invert_media = messagePreviewParams8.webpageTop;
                                    }
                                    if (lb0Var8.r.previewMessages.size() > 0 && (message3 = lb0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                        message3.invert_media = messagePreviewParams8.webpageTop;
                                    }
                                    lb0Var8.h();
                                    lb0Var8.Q = true;
                                    break;
                            }
                        }
                    });
                    g10.addView(g1Var7, i7.f6.n(-1, 48));
                }
                this.E = actionBarPopupWindow$ActionBarPopupWindowLayout.b(g10);
                actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().setStickToRight(z12);
                ?? frameLayout2 = new FrameLayout(context3);
                ?? r132 = obj;
                ?? cb0Var = new cb0(1, 0, context, rb0Var.B, true, false);
                this.v = cb0Var;
                cb0Var.g(LocaleController.getString(z11 ? R.string.QuoteSelectedPart : R.string.SelectSpecificQuote), R.drawable.menu_select_quote, r132);
                ?? cb0Var2 = new cb0(1, 1, context, rb0Var.B, true, false);
                context3 = context;
                this.w = cb0Var2;
                cb0Var2.g(LocaleController.getString(R.string.ClearQuote), R.drawable.menu_quote_delete, r132);
                frameLayout2.setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.I5, nb0Var), 6, 0));
                final int i26 = 2;
                frameLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ua0
                    public final /* synthetic */ lb0 b;

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
                                lb0 lb0Var42 = this.b;
                                lb0Var42.V.d.quote = null;
                                lb0Var42.e.f(false);
                                lb0Var42.g(false, false);
                                lb0Var42.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                lb0 lb0Var5 = this.b;
                                db0 db0Var2 = lb0Var5.e;
                                rb0 rb0Var2 = lb0Var5.V;
                                if (lb0Var5.c(null) != null) {
                                    if (db0Var2.v - db0Var2.u <= MessagesController.getInstance(rb0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.s9 s9Var = db0Var2.W;
                                        MessageObject c6 = lb0Var5.c(s9Var != null ? ((org.telegram.ui.Cells.s1) s9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams4 = rb0Var2.d;
                                        int i172 = db0Var2.u;
                                        messagePreviewParams4.quoteStart = i172;
                                        int i182 = db0Var2.v;
                                        messagePreviewParams4.quoteEnd = i182;
                                        messagePreviewParams4.quote = org.telegram.ui.jn.b(i172, i182, c6);
                                        rb0Var2.b();
                                        rb0Var2.a(true);
                                        break;
                                    } else {
                                        lb0Var5.f();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                lb0 lb0Var6 = this.b;
                                db0 db0Var3 = lb0Var6.e;
                                rb0 rb0Var3 = lb0Var6.V;
                                MessagePreviewParams messagePreviewParams5 = rb0Var3.d;
                                int i192 = rb0Var3.w;
                                boolean z142 = rb0Var3.b;
                                if (messagePreviewParams5.quote != null && !z142) {
                                    messagePreviewParams5.quote = null;
                                    db0Var3.f(false);
                                    lb0Var6.g(false, true);
                                    lb0Var6.k(true);
                                    break;
                                } else if (db0Var3.v - db0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                    MessageObject c10 = lb0Var6.c(null);
                                    if (c10 != null) {
                                        if (!db0Var3.y()) {
                                            messagePreviewParams5.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c10.messageOwner.message.length());
                                            messagePreviewParams5.quoteEnd = min;
                                            messagePreviewParams5.quote = org.telegram.ui.jn.b(messagePreviewParams5.quoteStart, min, c10);
                                            View d10 = lb0Var6.d();
                                            if (d10 instanceof org.telegram.ui.Cells.s1) {
                                                db0Var3.a0((org.telegram.ui.Cells.s1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            }
                                            if (!z142) {
                                                lb0Var6.s.getSwipeBack().e(lb0Var6.E);
                                            }
                                            lb0Var6.g(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams5.quoteStart = db0Var3.u;
                                            messagePreviewParams5.quoteEnd = db0Var3.v;
                                            org.telegram.ui.Cells.s9 s9Var2 = db0Var3.W;
                                            messagePreviewParams5.quote = org.telegram.ui.jn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, lb0Var6.c(s9Var2 != null ? ((org.telegram.ui.Cells.s1) s9Var2).getMessageObject() : null));
                                            rb0Var3.b();
                                            rb0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    lb0Var6.f();
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
                                rb0 rb0Var4 = this.b.V;
                                if (!rb0Var4.b) {
                                    org.telegram.ui.zk zkVar = (org.telegram.ui.zk) rb0Var4;
                                    zkVar.a(true);
                                    org.telegram.ui.tn tnVar = zkVar.D;
                                    tnVar.j5 = null;
                                    tnVar.h5 = null;
                                    tnVar.b5.updateReply(null, null, tnVar.P5, null);
                                    tnVar.j8();
                                    break;
                                } else {
                                    org.telegram.ui.zk zkVar2 = (org.telegram.ui.zk) rb0Var4;
                                    zkVar2.a(true);
                                    org.telegram.ui.tn tnVar2 = zkVar2.D;
                                    tnVar2.h5 = null;
                                    tnVar2.Bb(tnVar2.j5);
                                    break;
                                }
                            case 7:
                                this.b.V.c(true);
                                break;
                            case 8:
                                this.b.V.a(true);
                                break;
                            case 9:
                                org.telegram.ui.zk zkVar3 = (org.telegram.ui.zk) this.b.V;
                                zkVar3.a(true);
                                org.telegram.ui.tn tnVar3 = zkVar3.D;
                                tnVar3.b5.updateForward(null, tnVar3.P5);
                                tnVar3.j8();
                                break;
                            case 10:
                                this.b.V.a(true);
                                break;
                            case 11:
                                org.telegram.ui.zk zkVar4 = (org.telegram.ui.zk) this.b.V;
                                zkVar4.a(true);
                                org.telegram.ui.tn tnVar4 = zkVar4.D;
                                tnVar4.C5 = null;
                                org.telegram.ui.dk dkVar = tnVar4.U;
                                if (dkVar != null) {
                                    dkVar.S2 = null;
                                    dkVar.T2 = false;
                                }
                                MessagePreviewParams messagePreviewParams6 = tnVar4.b5;
                                if (messagePreviewParams6 != null) {
                                    i162 = ((org.telegram.ui.ActionBar.o2) tnVar4).currentAccount;
                                    MessageObject messageObject = tnVar4.j5;
                                    messagePreviewParams6.updateLink(i162, null, null, messageObject == tnVar4.T3 ? null : messageObject, tnVar4.h5, tnVar4.l5);
                                }
                                tnVar4.j8();
                                break;
                            case 12:
                                lb0 lb0Var7 = this.b;
                                MessagePreviewParams messagePreviewParams7 = lb0Var7.V.d;
                                if (messagePreviewParams7.hasMedia) {
                                    boolean z15 = !messagePreviewParams7.webpageSmall;
                                    messagePreviewParams7.webpageSmall = z15;
                                    lb0Var7.C.a(z15, true);
                                    lb0Var7.D.a(messagePreviewParams7.webpageSmall, true);
                                    if (lb0Var7.r.messages.size() > 0 && (message2 = lb0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z16 = messagePreviewParams7.webpageSmall;
                                        messageMedia2.force_small_media = z16;
                                        messageMedia2.force_large_media = !z16;
                                    }
                                    if (lb0Var7.r.previewMessages.size() > 0 && (message = lb0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z17 = messagePreviewParams7.webpageSmall;
                                        messageMedia.force_small_media = z17;
                                        messageMedia.force_large_media = !z17;
                                    }
                                    lb0Var7.h();
                                    lb0Var7.Q = true;
                                    break;
                                }
                                break;
                            default:
                                lb0 lb0Var8 = this.b;
                                MessagePreviewParams messagePreviewParams8 = lb0Var8.V.d;
                                boolean z18 = messagePreviewParams8.webpageTop;
                                messagePreviewParams8.webpageTop = !z18;
                                lb0Var8.A.a(z18, true);
                                if (lb0Var8.r.messages.size() > 0 && (message4 = lb0Var8.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams8.webpageTop;
                                }
                                if (lb0Var8.r.previewMessages.size() > 0 && (message3 = lb0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams8.webpageTop;
                                }
                                lb0Var8.h();
                                lb0Var8.Q = true;
                                break;
                        }
                    }
                });
                frameLayout2.addView(cb0Var, i7.f6.c(48.0f, -1));
                frameLayout2.addView(cb0Var2, i7.f6.c(48.0f, -1));
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout2, i7.f6.n(-1, 48));
                messagePreviewParams = messagePreviewParams2;
                r13 = r132;
            }
            if (!messagePreviewParams.monoforum && !messagePreviewParams.noforwards && !messagePreviewParams.hasSecretMessages) {
                ?? frameLayout3 = new FrameLayout(context3);
                ?? g1Var8 = new org.telegram.ui.ActionBar.g1(1, context3, rb0Var.B, false, false);
                this.x = g1Var8;
                g1Var8.g(LocaleController.getString(R.string.ReplyToAnotherChat), R.drawable.msg_forward_replace, r13);
                final int i27 = 3;
                g1Var8.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ua0
                    public final /* synthetic */ lb0 b;

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
                                lb0 lb0Var42 = this.b;
                                lb0Var42.V.d.quote = null;
                                lb0Var42.e.f(false);
                                lb0Var42.g(false, false);
                                lb0Var42.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                lb0 lb0Var5 = this.b;
                                db0 db0Var2 = lb0Var5.e;
                                rb0 rb0Var2 = lb0Var5.V;
                                if (lb0Var5.c(null) != null) {
                                    if (db0Var2.v - db0Var2.u <= MessagesController.getInstance(rb0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.s9 s9Var = db0Var2.W;
                                        MessageObject c6 = lb0Var5.c(s9Var != null ? ((org.telegram.ui.Cells.s1) s9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams4 = rb0Var2.d;
                                        int i172 = db0Var2.u;
                                        messagePreviewParams4.quoteStart = i172;
                                        int i182 = db0Var2.v;
                                        messagePreviewParams4.quoteEnd = i182;
                                        messagePreviewParams4.quote = org.telegram.ui.jn.b(i172, i182, c6);
                                        rb0Var2.b();
                                        rb0Var2.a(true);
                                        break;
                                    } else {
                                        lb0Var5.f();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                lb0 lb0Var6 = this.b;
                                db0 db0Var3 = lb0Var6.e;
                                rb0 rb0Var3 = lb0Var6.V;
                                MessagePreviewParams messagePreviewParams5 = rb0Var3.d;
                                int i192 = rb0Var3.w;
                                boolean z142 = rb0Var3.b;
                                if (messagePreviewParams5.quote != null && !z142) {
                                    messagePreviewParams5.quote = null;
                                    db0Var3.f(false);
                                    lb0Var6.g(false, true);
                                    lb0Var6.k(true);
                                    break;
                                } else if (db0Var3.v - db0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                    MessageObject c10 = lb0Var6.c(null);
                                    if (c10 != null) {
                                        if (!db0Var3.y()) {
                                            messagePreviewParams5.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c10.messageOwner.message.length());
                                            messagePreviewParams5.quoteEnd = min;
                                            messagePreviewParams5.quote = org.telegram.ui.jn.b(messagePreviewParams5.quoteStart, min, c10);
                                            View d10 = lb0Var6.d();
                                            if (d10 instanceof org.telegram.ui.Cells.s1) {
                                                db0Var3.a0((org.telegram.ui.Cells.s1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            }
                                            if (!z142) {
                                                lb0Var6.s.getSwipeBack().e(lb0Var6.E);
                                            }
                                            lb0Var6.g(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams5.quoteStart = db0Var3.u;
                                            messagePreviewParams5.quoteEnd = db0Var3.v;
                                            org.telegram.ui.Cells.s9 s9Var2 = db0Var3.W;
                                            messagePreviewParams5.quote = org.telegram.ui.jn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, lb0Var6.c(s9Var2 != null ? ((org.telegram.ui.Cells.s1) s9Var2).getMessageObject() : null));
                                            rb0Var3.b();
                                            rb0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    lb0Var6.f();
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
                                rb0 rb0Var4 = this.b.V;
                                if (!rb0Var4.b) {
                                    org.telegram.ui.zk zkVar = (org.telegram.ui.zk) rb0Var4;
                                    zkVar.a(true);
                                    org.telegram.ui.tn tnVar = zkVar.D;
                                    tnVar.j5 = null;
                                    tnVar.h5 = null;
                                    tnVar.b5.updateReply(null, null, tnVar.P5, null);
                                    tnVar.j8();
                                    break;
                                } else {
                                    org.telegram.ui.zk zkVar2 = (org.telegram.ui.zk) rb0Var4;
                                    zkVar2.a(true);
                                    org.telegram.ui.tn tnVar2 = zkVar2.D;
                                    tnVar2.h5 = null;
                                    tnVar2.Bb(tnVar2.j5);
                                    break;
                                }
                            case 7:
                                this.b.V.c(true);
                                break;
                            case 8:
                                this.b.V.a(true);
                                break;
                            case 9:
                                org.telegram.ui.zk zkVar3 = (org.telegram.ui.zk) this.b.V;
                                zkVar3.a(true);
                                org.telegram.ui.tn tnVar3 = zkVar3.D;
                                tnVar3.b5.updateForward(null, tnVar3.P5);
                                tnVar3.j8();
                                break;
                            case 10:
                                this.b.V.a(true);
                                break;
                            case 11:
                                org.telegram.ui.zk zkVar4 = (org.telegram.ui.zk) this.b.V;
                                zkVar4.a(true);
                                org.telegram.ui.tn tnVar4 = zkVar4.D;
                                tnVar4.C5 = null;
                                org.telegram.ui.dk dkVar = tnVar4.U;
                                if (dkVar != null) {
                                    dkVar.S2 = null;
                                    dkVar.T2 = false;
                                }
                                MessagePreviewParams messagePreviewParams6 = tnVar4.b5;
                                if (messagePreviewParams6 != null) {
                                    i162 = ((org.telegram.ui.ActionBar.o2) tnVar4).currentAccount;
                                    MessageObject messageObject = tnVar4.j5;
                                    messagePreviewParams6.updateLink(i162, null, null, messageObject == tnVar4.T3 ? null : messageObject, tnVar4.h5, tnVar4.l5);
                                }
                                tnVar4.j8();
                                break;
                            case 12:
                                lb0 lb0Var7 = this.b;
                                MessagePreviewParams messagePreviewParams7 = lb0Var7.V.d;
                                if (messagePreviewParams7.hasMedia) {
                                    boolean z15 = !messagePreviewParams7.webpageSmall;
                                    messagePreviewParams7.webpageSmall = z15;
                                    lb0Var7.C.a(z15, true);
                                    lb0Var7.D.a(messagePreviewParams7.webpageSmall, true);
                                    if (lb0Var7.r.messages.size() > 0 && (message2 = lb0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z16 = messagePreviewParams7.webpageSmall;
                                        messageMedia2.force_small_media = z16;
                                        messageMedia2.force_large_media = !z16;
                                    }
                                    if (lb0Var7.r.previewMessages.size() > 0 && (message = lb0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z17 = messagePreviewParams7.webpageSmall;
                                        messageMedia.force_small_media = z17;
                                        messageMedia.force_large_media = !z17;
                                    }
                                    lb0Var7.h();
                                    lb0Var7.Q = true;
                                    break;
                                }
                                break;
                            default:
                                lb0 lb0Var8 = this.b;
                                MessagePreviewParams messagePreviewParams8 = lb0Var8.V.d;
                                boolean z18 = messagePreviewParams8.webpageTop;
                                messagePreviewParams8.webpageTop = !z18;
                                lb0Var8.A.a(z18, true);
                                if (lb0Var8.r.messages.size() > 0 && (message4 = lb0Var8.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams8.webpageTop;
                                }
                                if (lb0Var8.r.previewMessages.size() > 0 && (message3 = lb0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams8.webpageTop;
                                }
                                lb0Var8.h();
                                lb0Var8.Q = true;
                                break;
                        }
                    }
                });
                context3 = context;
                ?? g1Var9 = new org.telegram.ui.ActionBar.g1(1, context3, rb0Var.B, false, false);
                this.y = g1Var9;
                g1Var9.g(LocaleController.getString(R.string.QuoteToAnotherChat), R.drawable.msg_forward_replace, r13);
                final int i28 = 4;
                g1Var9.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ua0
                    public final /* synthetic */ lb0 b;

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
                                lb0 lb0Var42 = this.b;
                                lb0Var42.V.d.quote = null;
                                lb0Var42.e.f(false);
                                lb0Var42.g(false, false);
                                lb0Var42.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                lb0 lb0Var5 = this.b;
                                db0 db0Var2 = lb0Var5.e;
                                rb0 rb0Var2 = lb0Var5.V;
                                if (lb0Var5.c(null) != null) {
                                    if (db0Var2.v - db0Var2.u <= MessagesController.getInstance(rb0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.s9 s9Var = db0Var2.W;
                                        MessageObject c6 = lb0Var5.c(s9Var != null ? ((org.telegram.ui.Cells.s1) s9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams4 = rb0Var2.d;
                                        int i172 = db0Var2.u;
                                        messagePreviewParams4.quoteStart = i172;
                                        int i182 = db0Var2.v;
                                        messagePreviewParams4.quoteEnd = i182;
                                        messagePreviewParams4.quote = org.telegram.ui.jn.b(i172, i182, c6);
                                        rb0Var2.b();
                                        rb0Var2.a(true);
                                        break;
                                    } else {
                                        lb0Var5.f();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                lb0 lb0Var6 = this.b;
                                db0 db0Var3 = lb0Var6.e;
                                rb0 rb0Var3 = lb0Var6.V;
                                MessagePreviewParams messagePreviewParams5 = rb0Var3.d;
                                int i192 = rb0Var3.w;
                                boolean z142 = rb0Var3.b;
                                if (messagePreviewParams5.quote != null && !z142) {
                                    messagePreviewParams5.quote = null;
                                    db0Var3.f(false);
                                    lb0Var6.g(false, true);
                                    lb0Var6.k(true);
                                    break;
                                } else if (db0Var3.v - db0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                    MessageObject c10 = lb0Var6.c(null);
                                    if (c10 != null) {
                                        if (!db0Var3.y()) {
                                            messagePreviewParams5.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c10.messageOwner.message.length());
                                            messagePreviewParams5.quoteEnd = min;
                                            messagePreviewParams5.quote = org.telegram.ui.jn.b(messagePreviewParams5.quoteStart, min, c10);
                                            View d10 = lb0Var6.d();
                                            if (d10 instanceof org.telegram.ui.Cells.s1) {
                                                db0Var3.a0((org.telegram.ui.Cells.s1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            }
                                            if (!z142) {
                                                lb0Var6.s.getSwipeBack().e(lb0Var6.E);
                                            }
                                            lb0Var6.g(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams5.quoteStart = db0Var3.u;
                                            messagePreviewParams5.quoteEnd = db0Var3.v;
                                            org.telegram.ui.Cells.s9 s9Var2 = db0Var3.W;
                                            messagePreviewParams5.quote = org.telegram.ui.jn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, lb0Var6.c(s9Var2 != null ? ((org.telegram.ui.Cells.s1) s9Var2).getMessageObject() : null));
                                            rb0Var3.b();
                                            rb0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    lb0Var6.f();
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
                                rb0 rb0Var4 = this.b.V;
                                if (!rb0Var4.b) {
                                    org.telegram.ui.zk zkVar = (org.telegram.ui.zk) rb0Var4;
                                    zkVar.a(true);
                                    org.telegram.ui.tn tnVar = zkVar.D;
                                    tnVar.j5 = null;
                                    tnVar.h5 = null;
                                    tnVar.b5.updateReply(null, null, tnVar.P5, null);
                                    tnVar.j8();
                                    break;
                                } else {
                                    org.telegram.ui.zk zkVar2 = (org.telegram.ui.zk) rb0Var4;
                                    zkVar2.a(true);
                                    org.telegram.ui.tn tnVar2 = zkVar2.D;
                                    tnVar2.h5 = null;
                                    tnVar2.Bb(tnVar2.j5);
                                    break;
                                }
                            case 7:
                                this.b.V.c(true);
                                break;
                            case 8:
                                this.b.V.a(true);
                                break;
                            case 9:
                                org.telegram.ui.zk zkVar3 = (org.telegram.ui.zk) this.b.V;
                                zkVar3.a(true);
                                org.telegram.ui.tn tnVar3 = zkVar3.D;
                                tnVar3.b5.updateForward(null, tnVar3.P5);
                                tnVar3.j8();
                                break;
                            case 10:
                                this.b.V.a(true);
                                break;
                            case 11:
                                org.telegram.ui.zk zkVar4 = (org.telegram.ui.zk) this.b.V;
                                zkVar4.a(true);
                                org.telegram.ui.tn tnVar4 = zkVar4.D;
                                tnVar4.C5 = null;
                                org.telegram.ui.dk dkVar = tnVar4.U;
                                if (dkVar != null) {
                                    dkVar.S2 = null;
                                    dkVar.T2 = false;
                                }
                                MessagePreviewParams messagePreviewParams6 = tnVar4.b5;
                                if (messagePreviewParams6 != null) {
                                    i162 = ((org.telegram.ui.ActionBar.o2) tnVar4).currentAccount;
                                    MessageObject messageObject = tnVar4.j5;
                                    messagePreviewParams6.updateLink(i162, null, null, messageObject == tnVar4.T3 ? null : messageObject, tnVar4.h5, tnVar4.l5);
                                }
                                tnVar4.j8();
                                break;
                            case 12:
                                lb0 lb0Var7 = this.b;
                                MessagePreviewParams messagePreviewParams7 = lb0Var7.V.d;
                                if (messagePreviewParams7.hasMedia) {
                                    boolean z15 = !messagePreviewParams7.webpageSmall;
                                    messagePreviewParams7.webpageSmall = z15;
                                    lb0Var7.C.a(z15, true);
                                    lb0Var7.D.a(messagePreviewParams7.webpageSmall, true);
                                    if (lb0Var7.r.messages.size() > 0 && (message2 = lb0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z16 = messagePreviewParams7.webpageSmall;
                                        messageMedia2.force_small_media = z16;
                                        messageMedia2.force_large_media = !z16;
                                    }
                                    if (lb0Var7.r.previewMessages.size() > 0 && (message = lb0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z17 = messagePreviewParams7.webpageSmall;
                                        messageMedia.force_small_media = z17;
                                        messageMedia.force_large_media = !z17;
                                    }
                                    lb0Var7.h();
                                    lb0Var7.Q = true;
                                    break;
                                }
                                break;
                            default:
                                lb0 lb0Var8 = this.b;
                                MessagePreviewParams messagePreviewParams8 = lb0Var8.V.d;
                                boolean z18 = messagePreviewParams8.webpageTop;
                                messagePreviewParams8.webpageTop = !z18;
                                lb0Var8.A.a(z18, true);
                                if (lb0Var8.r.messages.size() > 0 && (message4 = lb0Var8.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams8.webpageTop;
                                }
                                if (lb0Var8.r.previewMessages.size() > 0 && (message3 = lb0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams8.webpageTop;
                                }
                                lb0Var8.h();
                                lb0Var8.Q = true;
                                break;
                        }
                    }
                });
                frameLayout3.addView(g1Var9, i7.f6.c(48.0f, -1));
                frameLayout3.addView(g1Var8, i7.f6.c(48.0f, -1));
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout3, i7.f6.n(-1, 48));
            }
            if (!messagePreviewParams.noforwards && !messagePreviewParams.hasSecretMessages) {
                org.telegram.ui.ActionBar.l1 l1Var4 = new org.telegram.ui.ActionBar.l1(context3, nb0Var);
                l1Var4.setColor(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, nb0Var)));
                l1Var4.setTag(R.id.fit_width_tag, 1);
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(l1Var4, i7.f6.n(-1, 8));
            }
            g(messagePreviewParams.quote != null, false);
            ?? g1Var10 = new org.telegram.ui.ActionBar.g1(1, context3, rb0Var.B, false, false);
            g1Var10.g(LocaleController.getString(R.string.ApplyChanges), R.drawable.msg_select, r13);
            final int i29 = 5;
            g1Var10.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ua0
                public final /* synthetic */ lb0 b;

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
                    switch (i29) {
                        case 0:
                            lb0 lb0Var42 = this.b;
                            lb0Var42.V.d.quote = null;
                            lb0Var42.e.f(false);
                            lb0Var42.g(false, false);
                            lb0Var42.s.getSwipeBack().b(true);
                            break;
                        case 1:
                            lb0 lb0Var5 = this.b;
                            db0 db0Var2 = lb0Var5.e;
                            rb0 rb0Var2 = lb0Var5.V;
                            if (lb0Var5.c(null) != null) {
                                if (db0Var2.v - db0Var2.u <= MessagesController.getInstance(rb0Var2.w).quoteLengthMax) {
                                    org.telegram.ui.Cells.s9 s9Var = db0Var2.W;
                                    MessageObject c6 = lb0Var5.c(s9Var != null ? ((org.telegram.ui.Cells.s1) s9Var).getMessageObject() : null);
                                    MessagePreviewParams messagePreviewParams4 = rb0Var2.d;
                                    int i172 = db0Var2.u;
                                    messagePreviewParams4.quoteStart = i172;
                                    int i182 = db0Var2.v;
                                    messagePreviewParams4.quoteEnd = i182;
                                    messagePreviewParams4.quote = org.telegram.ui.jn.b(i172, i182, c6);
                                    rb0Var2.b();
                                    rb0Var2.a(true);
                                    break;
                                } else {
                                    lb0Var5.f();
                                    break;
                                }
                            }
                            break;
                        case 2:
                            lb0 lb0Var6 = this.b;
                            db0 db0Var3 = lb0Var6.e;
                            rb0 rb0Var3 = lb0Var6.V;
                            MessagePreviewParams messagePreviewParams5 = rb0Var3.d;
                            int i192 = rb0Var3.w;
                            boolean z142 = rb0Var3.b;
                            if (messagePreviewParams5.quote != null && !z142) {
                                messagePreviewParams5.quote = null;
                                db0Var3.f(false);
                                lb0Var6.g(false, true);
                                lb0Var6.k(true);
                                break;
                            } else if (db0Var3.v - db0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                MessageObject c10 = lb0Var6.c(null);
                                if (c10 != null) {
                                    if (!db0Var3.y()) {
                                        messagePreviewParams5.quoteStart = 0;
                                        int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c10.messageOwner.message.length());
                                        messagePreviewParams5.quoteEnd = min;
                                        messagePreviewParams5.quote = org.telegram.ui.jn.b(messagePreviewParams5.quoteStart, min, c10);
                                        View d10 = lb0Var6.d();
                                        if (d10 instanceof org.telegram.ui.Cells.s1) {
                                            db0Var3.a0((org.telegram.ui.Cells.s1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                        }
                                        if (!z142) {
                                            lb0Var6.s.getSwipeBack().e(lb0Var6.E);
                                        }
                                        lb0Var6.g(true, true);
                                        break;
                                    } else {
                                        messagePreviewParams5.quoteStart = db0Var3.u;
                                        messagePreviewParams5.quoteEnd = db0Var3.v;
                                        org.telegram.ui.Cells.s9 s9Var2 = db0Var3.W;
                                        messagePreviewParams5.quote = org.telegram.ui.jn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, lb0Var6.c(s9Var2 != null ? ((org.telegram.ui.Cells.s1) s9Var2).getMessageObject() : null));
                                        rb0Var3.b();
                                        rb0Var3.a(true);
                                        break;
                                    }
                                }
                            } else {
                                lb0Var6.f();
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
                            rb0 rb0Var4 = this.b.V;
                            if (!rb0Var4.b) {
                                org.telegram.ui.zk zkVar = (org.telegram.ui.zk) rb0Var4;
                                zkVar.a(true);
                                org.telegram.ui.tn tnVar = zkVar.D;
                                tnVar.j5 = null;
                                tnVar.h5 = null;
                                tnVar.b5.updateReply(null, null, tnVar.P5, null);
                                tnVar.j8();
                                break;
                            } else {
                                org.telegram.ui.zk zkVar2 = (org.telegram.ui.zk) rb0Var4;
                                zkVar2.a(true);
                                org.telegram.ui.tn tnVar2 = zkVar2.D;
                                tnVar2.h5 = null;
                                tnVar2.Bb(tnVar2.j5);
                                break;
                            }
                        case 7:
                            this.b.V.c(true);
                            break;
                        case 8:
                            this.b.V.a(true);
                            break;
                        case 9:
                            org.telegram.ui.zk zkVar3 = (org.telegram.ui.zk) this.b.V;
                            zkVar3.a(true);
                            org.telegram.ui.tn tnVar3 = zkVar3.D;
                            tnVar3.b5.updateForward(null, tnVar3.P5);
                            tnVar3.j8();
                            break;
                        case 10:
                            this.b.V.a(true);
                            break;
                        case 11:
                            org.telegram.ui.zk zkVar4 = (org.telegram.ui.zk) this.b.V;
                            zkVar4.a(true);
                            org.telegram.ui.tn tnVar4 = zkVar4.D;
                            tnVar4.C5 = null;
                            org.telegram.ui.dk dkVar = tnVar4.U;
                            if (dkVar != null) {
                                dkVar.S2 = null;
                                dkVar.T2 = false;
                            }
                            MessagePreviewParams messagePreviewParams6 = tnVar4.b5;
                            if (messagePreviewParams6 != null) {
                                i162 = ((org.telegram.ui.ActionBar.o2) tnVar4).currentAccount;
                                MessageObject messageObject = tnVar4.j5;
                                messagePreviewParams6.updateLink(i162, null, null, messageObject == tnVar4.T3 ? null : messageObject, tnVar4.h5, tnVar4.l5);
                            }
                            tnVar4.j8();
                            break;
                        case 12:
                            lb0 lb0Var7 = this.b;
                            MessagePreviewParams messagePreviewParams7 = lb0Var7.V.d;
                            if (messagePreviewParams7.hasMedia) {
                                boolean z15 = !messagePreviewParams7.webpageSmall;
                                messagePreviewParams7.webpageSmall = z15;
                                lb0Var7.C.a(z15, true);
                                lb0Var7.D.a(messagePreviewParams7.webpageSmall, true);
                                if (lb0Var7.r.messages.size() > 0 && (message2 = lb0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                    boolean z16 = messagePreviewParams7.webpageSmall;
                                    messageMedia2.force_small_media = z16;
                                    messageMedia2.force_large_media = !z16;
                                }
                                if (lb0Var7.r.previewMessages.size() > 0 && (message = lb0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                    boolean z17 = messagePreviewParams7.webpageSmall;
                                    messageMedia.force_small_media = z17;
                                    messageMedia.force_large_media = !z17;
                                }
                                lb0Var7.h();
                                lb0Var7.Q = true;
                                break;
                            }
                            break;
                        default:
                            lb0 lb0Var8 = this.b;
                            MessagePreviewParams messagePreviewParams8 = lb0Var8.V.d;
                            boolean z18 = messagePreviewParams8.webpageTop;
                            messagePreviewParams8.webpageTop = !z18;
                            lb0Var8.A.a(z18, true);
                            if (lb0Var8.r.messages.size() > 0 && (message4 = lb0Var8.r.messages.get(0).messageOwner) != null) {
                                message4.invert_media = messagePreviewParams8.webpageTop;
                            }
                            if (lb0Var8.r.previewMessages.size() > 0 && (message3 = lb0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                message3.invert_media = messagePreviewParams8.webpageTop;
                            }
                            lb0Var8.h();
                            lb0Var8.Q = true;
                            break;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var10, i7.f6.n(-1, 48));
            ?? g1Var11 = new org.telegram.ui.ActionBar.g1(1, context, rb0Var.B, false, true);
            g1Var11.g(LocaleController.getString(z11 ? R.string.DoNotQuote : R.string.DoNotReply), R.drawable.msg_delete, r13);
            int v04 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.q7, nb0Var);
            int i30 = org.telegram.ui.ActionBar.g6.p7;
            g1Var11.c(v04, org.telegram.ui.ActionBar.g6.v0(i30, nb0Var));
            g1Var11.setSelectorColor(org.telegram.ui.ActionBar.g6.l1(0.12f, org.telegram.ui.ActionBar.g6.w0(r13, i30, false)));
            final int i31 = 6;
            g1Var11.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ua0
                public final /* synthetic */ lb0 b;

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
                    switch (i31) {
                        case 0:
                            lb0 lb0Var42 = this.b;
                            lb0Var42.V.d.quote = null;
                            lb0Var42.e.f(false);
                            lb0Var42.g(false, false);
                            lb0Var42.s.getSwipeBack().b(true);
                            break;
                        case 1:
                            lb0 lb0Var5 = this.b;
                            db0 db0Var2 = lb0Var5.e;
                            rb0 rb0Var2 = lb0Var5.V;
                            if (lb0Var5.c(null) != null) {
                                if (db0Var2.v - db0Var2.u <= MessagesController.getInstance(rb0Var2.w).quoteLengthMax) {
                                    org.telegram.ui.Cells.s9 s9Var = db0Var2.W;
                                    MessageObject c6 = lb0Var5.c(s9Var != null ? ((org.telegram.ui.Cells.s1) s9Var).getMessageObject() : null);
                                    MessagePreviewParams messagePreviewParams4 = rb0Var2.d;
                                    int i172 = db0Var2.u;
                                    messagePreviewParams4.quoteStart = i172;
                                    int i182 = db0Var2.v;
                                    messagePreviewParams4.quoteEnd = i182;
                                    messagePreviewParams4.quote = org.telegram.ui.jn.b(i172, i182, c6);
                                    rb0Var2.b();
                                    rb0Var2.a(true);
                                    break;
                                } else {
                                    lb0Var5.f();
                                    break;
                                }
                            }
                            break;
                        case 2:
                            lb0 lb0Var6 = this.b;
                            db0 db0Var3 = lb0Var6.e;
                            rb0 rb0Var3 = lb0Var6.V;
                            MessagePreviewParams messagePreviewParams5 = rb0Var3.d;
                            int i192 = rb0Var3.w;
                            boolean z142 = rb0Var3.b;
                            if (messagePreviewParams5.quote != null && !z142) {
                                messagePreviewParams5.quote = null;
                                db0Var3.f(false);
                                lb0Var6.g(false, true);
                                lb0Var6.k(true);
                                break;
                            } else if (db0Var3.v - db0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                MessageObject c10 = lb0Var6.c(null);
                                if (c10 != null) {
                                    if (!db0Var3.y()) {
                                        messagePreviewParams5.quoteStart = 0;
                                        int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c10.messageOwner.message.length());
                                        messagePreviewParams5.quoteEnd = min;
                                        messagePreviewParams5.quote = org.telegram.ui.jn.b(messagePreviewParams5.quoteStart, min, c10);
                                        View d10 = lb0Var6.d();
                                        if (d10 instanceof org.telegram.ui.Cells.s1) {
                                            db0Var3.a0((org.telegram.ui.Cells.s1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                        }
                                        if (!z142) {
                                            lb0Var6.s.getSwipeBack().e(lb0Var6.E);
                                        }
                                        lb0Var6.g(true, true);
                                        break;
                                    } else {
                                        messagePreviewParams5.quoteStart = db0Var3.u;
                                        messagePreviewParams5.quoteEnd = db0Var3.v;
                                        org.telegram.ui.Cells.s9 s9Var2 = db0Var3.W;
                                        messagePreviewParams5.quote = org.telegram.ui.jn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, lb0Var6.c(s9Var2 != null ? ((org.telegram.ui.Cells.s1) s9Var2).getMessageObject() : null));
                                        rb0Var3.b();
                                        rb0Var3.a(true);
                                        break;
                                    }
                                }
                            } else {
                                lb0Var6.f();
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
                            rb0 rb0Var4 = this.b.V;
                            if (!rb0Var4.b) {
                                org.telegram.ui.zk zkVar = (org.telegram.ui.zk) rb0Var4;
                                zkVar.a(true);
                                org.telegram.ui.tn tnVar = zkVar.D;
                                tnVar.j5 = null;
                                tnVar.h5 = null;
                                tnVar.b5.updateReply(null, null, tnVar.P5, null);
                                tnVar.j8();
                                break;
                            } else {
                                org.telegram.ui.zk zkVar2 = (org.telegram.ui.zk) rb0Var4;
                                zkVar2.a(true);
                                org.telegram.ui.tn tnVar2 = zkVar2.D;
                                tnVar2.h5 = null;
                                tnVar2.Bb(tnVar2.j5);
                                break;
                            }
                        case 7:
                            this.b.V.c(true);
                            break;
                        case 8:
                            this.b.V.a(true);
                            break;
                        case 9:
                            org.telegram.ui.zk zkVar3 = (org.telegram.ui.zk) this.b.V;
                            zkVar3.a(true);
                            org.telegram.ui.tn tnVar3 = zkVar3.D;
                            tnVar3.b5.updateForward(null, tnVar3.P5);
                            tnVar3.j8();
                            break;
                        case 10:
                            this.b.V.a(true);
                            break;
                        case 11:
                            org.telegram.ui.zk zkVar4 = (org.telegram.ui.zk) this.b.V;
                            zkVar4.a(true);
                            org.telegram.ui.tn tnVar4 = zkVar4.D;
                            tnVar4.C5 = null;
                            org.telegram.ui.dk dkVar = tnVar4.U;
                            if (dkVar != null) {
                                dkVar.S2 = null;
                                dkVar.T2 = false;
                            }
                            MessagePreviewParams messagePreviewParams6 = tnVar4.b5;
                            if (messagePreviewParams6 != null) {
                                i162 = ((org.telegram.ui.ActionBar.o2) tnVar4).currentAccount;
                                MessageObject messageObject = tnVar4.j5;
                                messagePreviewParams6.updateLink(i162, null, null, messageObject == tnVar4.T3 ? null : messageObject, tnVar4.h5, tnVar4.l5);
                            }
                            tnVar4.j8();
                            break;
                        case 12:
                            lb0 lb0Var7 = this.b;
                            MessagePreviewParams messagePreviewParams7 = lb0Var7.V.d;
                            if (messagePreviewParams7.hasMedia) {
                                boolean z15 = !messagePreviewParams7.webpageSmall;
                                messagePreviewParams7.webpageSmall = z15;
                                lb0Var7.C.a(z15, true);
                                lb0Var7.D.a(messagePreviewParams7.webpageSmall, true);
                                if (lb0Var7.r.messages.size() > 0 && (message2 = lb0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                    boolean z16 = messagePreviewParams7.webpageSmall;
                                    messageMedia2.force_small_media = z16;
                                    messageMedia2.force_large_media = !z16;
                                }
                                if (lb0Var7.r.previewMessages.size() > 0 && (message = lb0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                    boolean z17 = messagePreviewParams7.webpageSmall;
                                    messageMedia.force_small_media = z17;
                                    messageMedia.force_large_media = !z17;
                                }
                                lb0Var7.h();
                                lb0Var7.Q = true;
                                break;
                            }
                            break;
                        default:
                            lb0 lb0Var8 = this.b;
                            MessagePreviewParams messagePreviewParams8 = lb0Var8.V.d;
                            boolean z18 = messagePreviewParams8.webpageTop;
                            messagePreviewParams8.webpageTop = !z18;
                            lb0Var8.A.a(z18, true);
                            if (lb0Var8.r.messages.size() > 0 && (message4 = lb0Var8.r.messages.get(0).messageOwner) != null) {
                                message4.invert_media = messagePreviewParams8.webpageTop;
                            }
                            if (lb0Var8.r.previewMessages.size() > 0 && (message3 = lb0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                message3.invert_media = messagePreviewParams8.webpageTop;
                            }
                            lb0Var8.h();
                            lb0Var8.Q = true;
                            break;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var11, i7.f6.n(-1, 48));
            context2 = context;
            lb0Var2 = this;
            viewOutlineProvider = r13;
        }
        int i32 = lb0Var2.a;
        if (i32 == 1) {
            lb0Var2.r = messagePreviewParams.forwardMessages;
        } else if (i32 == 0) {
            lb0Var2.r = messagePreviewParams.replyMessage;
        } else if (i32 == 2) {
            lb0Var2.r = messagePreviewParams.linkMessage;
        }
        org.telegram.ui.Cells.w9 o10 = lb0Var2.e.o(context2);
        lb0Var2.d = o10;
        o10.setElevation(AndroidUtilities.dp(8.0f));
        o10.setOutlineProvider(viewOutlineProvider);
        if (o10.getParent() instanceof ViewGroup) {
            ((ViewGroup) o10.getParent()).removeView(o10);
        }
        lb0Var2.addView(o10, i7.f6.d(-1, -1.0f, 51, 0.0f, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / AndroidUtilities.density, 0.0f, 0.0f));
        lb0Var2.e.T(lb0Var2.f);
    }

    public static MessageObject.GroupedMessages a(lb0 lb0Var, MessageObject messageObject) {
        if (messageObject.getGroupId() == 0) {
            return null;
        }
        MessageObject.GroupedMessages groupedMessages = lb0Var.r.groupedMessagesMap.get(messageObject.getGroupId());
        if (groupedMessages == null || (groupedMessages.messages.size() > 1 && groupedMessages.getPosition(messageObject) != null)) {
            return groupedMessages;
        }
        return null;
    }

    public static void b(lb0 lb0Var, org.telegram.ui.Cells.s1 s1Var) {
        CharacterStyle characterStyle;
        TLRPC.WebPage webPage;
        if (lb0Var.a == 2) {
            MessagePreviewParams messagePreviewParams = lb0Var.V.d;
            if (!messagePreviewParams.singleLink && (characterStyle = messagePreviewParams.currentLink) != null && (webPage = messagePreviewParams.webpage) != null && !(webPage instanceof TLRPC.TL_webPagePending)) {
                s1Var.Q3(characterStyle);
                return;
            }
        }
        s1Var.Q3(null);
    }

    public final MessageObject c(MessageObject messageObject) {
        MessageObject.GroupedMessages valueAt;
        rb0 rb0Var = this.V;
        MessagePreviewParams.Messages messages = rb0Var.d.replyMessage;
        if (messages == null) {
            return null;
        }
        LongSparseArray<MessageObject.GroupedMessages> longSparseArray = messages.groupedMessagesMap;
        if (longSparseArray == null || longSparseArray.size() <= 0 || (valueAt = rb0Var.d.replyMessage.groupedMessagesMap.valueAt(0)) == null) {
            return rb0Var.d.replyMessage.messages.get(0);
        }
        if (valueAt.isDocuments) {
            if (messageObject != null) {
                return messageObject;
            }
            org.telegram.ui.jn jnVar = rb0Var.d.quote;
            if (jnVar != null) {
                return jnVar.a;
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
                eb0 eb0Var = this.f;
                if (i10 >= eb0Var.getChildCount()) {
                    break;
                }
                View childAt = eb0Var.getChildAt(i10);
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) childAt;
                if (m4Var.getMessageObject() != null && (m4Var.getMessageObject() == c3 || m4Var.getMessageObject().getId() == c3.getId())) {
                    break;
                }
                i10++;
            }
        }
        return null;
    }

    public final void e(float f9, int i10) {
        boolean z10 = this.V.v;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        bg.d1 d1Var = this.c;
        ih.j4 j4Var = this.b;
        if (z10) {
            d1Var.setTranslationY(0.0f);
            j4Var.invalidateOutline();
            j4Var.setTranslationY(0.0f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(0.0f);
        } else {
            d1Var.setTranslationY(i10);
            j4Var.invalidateOutline();
            j4Var.setTranslationY(f9);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((f9 + j4Var.getMeasuredHeight()) - AndroidUtilities.dp(2.0f));
        }
        float x4 = j4Var.getX();
        org.telegram.ui.Cells.w9 w9Var = this.d;
        w9Var.setTranslationX(x4);
        w9Var.setTranslationY(j4Var.getY());
    }

    public final void f() {
        rb0 rb0Var = this.V;
        new tc(rb0Var, rb0Var.B).M(LocaleController.getString(R.string.QuoteMaxError), LocaleController.getString(R.string.QuoteMaxErrorMessage), R.raw.error).j();
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
        org.telegram.ui.ActionBar.g1 g1Var = this.y;
        org.telegram.ui.ActionBar.g1 g1Var2 = this.x;
        cb0 cb0Var = this.w;
        cb0 cb0Var2 = this.v;
        if (!z11) {
            if (cb0Var2 != null) {
                cb0Var2.setAlpha(!z10 ? 1.0f : 0.0f);
                cb0Var2.setVisibility(!z10 ? 0 : 4);
            }
            if (cb0Var != null) {
                cb0Var.setAlpha(z10 ? 1.0f : 0.0f);
                cb0Var.setVisibility(z10 ? 0 : 4);
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
        this.L = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        if (cb0Var2 != null) {
            cb0Var2.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(cb0Var2, (Property<cb0, Float>) property, !z10 ? 1.0f : 0.0f));
        }
        if (cb0Var != null) {
            cb0Var.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(cb0Var, (Property<cb0, Float>) property, z10 ? 1.0f : 0.0f));
        }
        if (g1Var2 != null) {
            g1Var2.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(g1Var2, (Property<org.telegram.ui.ActionBar.g1, Float>) property, !z10 ? 1.0f : 0.0f));
        }
        if (g1Var != null) {
            g1Var.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(g1Var, (Property<org.telegram.ui.ActionBar.g1, Float>) property, z10 ? 1.0f : 0.0f));
        }
        this.L.playTogether(arrayList);
        this.L.setDuration(360L);
        this.L.setInterpolator(jr.h);
        this.L.addListener(new z9(15, this, z10));
        this.L.start();
    }

    public final void h() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        rb0 rb0Var = this.V;
        MessagePreviewParams messagePreviewParams = rb0Var.d;
        gb0 gb0Var = this.h;
        if (gb0Var.k()) {
            this.R = true;
            return;
        }
        for (int i10 = 0; i10 < this.r.previewMessages.size(); i10++) {
            MessageObject messageObject = this.r.previewMessages.get(i10);
            messageObject.forceUpdate = true;
            messageObject.sendAsPeer = rb0Var.a;
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
            gb0Var.V(this.r.groupedMessagesMap.valueAt(i12));
        }
        this.n.q(0, this.r.previewMessages.size());
    }

    public final void i() {
        int i10 = this.N;
        float f9 = this.O;
        rb0 rb0Var = this.V;
        boolean z10 = rb0Var.v;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        eb0 eb0Var = this.f;
        if (z10) {
            this.O = 0.0f;
            this.N = 0;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(AndroidUtilities.dp(8.0f) + eb0Var.getMeasuredWidth());
        } else {
            int measuredHeight = eb0Var.getMeasuredHeight();
            int i11 = 0;
            for (int i12 = 0; i12 < eb0Var.getChildCount(); i12++) {
                View childAt = eb0Var.getChildAt(i12);
                if (RecyclerView.R(childAt) != -1) {
                    measuredHeight = Math.min(measuredHeight, childAt.getTop());
                    i11++;
                }
            }
            MessagePreviewParams.Messages messages = this.r;
            if (messages == null || i11 == 0 || i11 > messages.previewMessages.size()) {
                this.N = 0;
            } else {
                int d = j7.l1.d(4.0f, measuredHeight, 0);
                this.N = d;
                this.N = Math.min(((eb0Var.getMeasuredHeight() - this.N) + d) - ((int) ((((AndroidUtilities.displaySize.y - (Build.VERSION.SDK_INT >= 35 ? AndroidUtilities.navigationBarHeight : 0)) * 0.8f) - this.S) - AndroidUtilities.dp(8.0f))), this.N);
            }
            float A = com.google.android.recaptcha.internal.a.A(getMeasuredHeight() - AndroidUtilities.dp(16.0f), (this.b.getMeasuredHeight() - this.N) + (this.S - AndroidUtilities.dp(8.0f)), 2.0f, AndroidUtilities.dp(8.0f)) - this.N;
            this.O = A;
            if (A > AndroidUtilities.dp(8.0f)) {
                this.O = AndroidUtilities.dp(8.0f);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
        }
        boolean z11 = this.G;
        if (z11 || (this.N == i10 && this.O == f9)) {
            if (z11) {
                float f10 = this.O;
                int i13 = this.N;
                this.P = i13;
                e(f10, i13);
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = rb0Var.h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        rb0Var.h = ofFloat;
        ofFloat.addUpdateListener(new uj(this, i10, f9, 1));
        rb0Var.h.setDuration(250L);
        rb0Var.h.setInterpolator(uh.m.V);
        rb0Var.h.addListener(new zz(this, 6));
        AndroidUtilities.runOnUIThread(rb0Var.y, 50L);
        this.P = i10;
        e(f9, i10);
    }

    public final void j() {
        MessageObject messageObject;
        rb0 rb0Var = this.V;
        MessagePreviewParams messagePreviewParams = rb0Var.d;
        if (this.a == 0) {
            db0 db0Var = this.e;
            if (db0Var.v - db0Var.u > MessagesController.getInstance(rb0Var.w).quoteLengthMax) {
                return;
            }
            org.telegram.ui.Cells.s9 s9Var = db0Var.W;
            MessageObject c3 = c(s9Var != null ? ((org.telegram.ui.Cells.s1) s9Var).getMessageObject() : null);
            if (messagePreviewParams.quote != null && db0Var.y()) {
                messagePreviewParams.quoteStart = db0Var.u;
                messagePreviewParams.quoteEnd = db0Var.v;
                if (c3 != null && ((messageObject = messagePreviewParams.quote.a) == null || messageObject.getId() != c3.getId())) {
                    messagePreviewParams.quote = org.telegram.ui.jn.b(messagePreviewParams.quoteStart, messagePreviewParams.quoteEnd, c3);
                    rb0Var.b();
                }
            }
            db0Var.f(false);
        }
    }

    public final void k(boolean z10) {
        rb0 rb0Var = this.V;
        TLRPC.User user = rb0Var.n;
        MessagePreviewParams messagePreviewParams = rb0Var.d;
        TLRPC.Chat chat = rb0Var.r;
        bg.d1 d1Var = this.c;
        int i10 = this.a;
        if (i10 == 1) {
            MessagePreviewParams.Messages messages = messagePreviewParams.forwardMessages;
            d1Var.d(LocaleController.formatPluralString("PreviewForwardMessagesCount", messages == null ? 0 : messages.selectedIds.size(), new Object[0]), z10);
            d1Var.c(!messagePreviewParams.hasSenders ? messagePreviewParams.willSeeSenders ? user != null ? LocaleController.formatString("ForwardPreviewSendersNameVisible", R.string.ForwardPreviewSendersNameVisible, ContactsController.formatName(user.first_name, user.last_name)) : (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.ForwardPreviewSendersNameVisibleGroup) : LocaleController.getString(R.string.ForwardPreviewSendersNameVisibleChannel) : user != null ? LocaleController.formatString("ForwardPreviewSendersNameVisible", R.string.ForwardPreviewSendersNameVisible, ContactsController.formatName(user.first_name, user.last_name)) : (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.ForwardPreviewSendersNameHiddenGroup) : LocaleController.getString(R.string.ForwardPreviewSendersNameHiddenChannel) : !messagePreviewParams.hideForwardSendersName ? user != null ? LocaleController.formatString("ForwardPreviewSendersNameVisible", R.string.ForwardPreviewSendersNameVisible, ContactsController.formatName(user.first_name, user.last_name)) : (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.ForwardPreviewSendersNameVisibleGroup) : LocaleController.getString(R.string.ForwardPreviewSendersNameVisibleChannel) : user != null ? LocaleController.formatString("ForwardPreviewSendersNameHidden", R.string.ForwardPreviewSendersNameHidden, ContactsController.formatName(user.first_name, user.last_name)) : (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.ForwardPreviewSendersNameHiddenGroup) : LocaleController.getString(R.string.ForwardPreviewSendersNameHiddenChannel), z10);
        } else {
            if (i10 != 0) {
                if (i10 == 2) {
                    d1Var.d(LocaleController.getString(R.string.MessageOptionsLinkTitle), z10);
                    d1Var.c(LocaleController.getString(R.string.MessageOptionsLinkSubtitle), z10);
                    return;
                }
                return;
            }
            if (messagePreviewParams.quote == null || !messagePreviewParams.replyMessage.hasText) {
                d1Var.d(LocaleController.getString(R.string.MessageOptionsReplyTitle), z10);
                d1Var.c(messagePreviewParams.replyMessage.hasText ? LocaleController.getString(R.string.MessageOptionsReplySubtitle) : "", z10);
            } else {
                d1Var.d(LocaleController.getString(R.string.PreviewQuoteUpdate), z10);
                d1Var.c(LocaleController.getString(R.string.PreviewQuoteUpdateSubtitle), z10);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.a == 0) {
            AndroidUtilities.forEachViews((RecyclerView) this.f, (f5.d) new va0(this, 0));
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
        rb0 rb0Var = this.V;
        rb0Var.v = z10;
        this.S = 0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(i10, makeMeasureSpec);
        int i12 = this.S;
        int measuredHeight = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
        Rect rect = this.M;
        this.S = Math.max(i12, measuredHeight + rect.top + rect.bottom);
        ((ViewGroup.MarginLayoutParams) this.f.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        boolean z11 = rb0Var.v;
        ih.j4 j4Var = this.b;
        if (z11) {
            j4Var.getLayoutParams().height = -1;
            ((ViewGroup.MarginLayoutParams) j4Var.getLayoutParams()).topMargin = AndroidUtilities.dp(8.0f);
            ((ViewGroup.MarginLayoutParams) j4Var.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
            j4Var.getLayoutParams().width = (int) Math.min(View.MeasureSpec.getSize(i10), Math.max(AndroidUtilities.dp(340.0f), View.MeasureSpec.getSize(i10) * 0.6f));
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = -1;
        } else {
            ((ViewGroup.MarginLayoutParams) j4Var.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) j4Var.getLayoutParams()).bottomMargin = 0;
            j4Var.getLayoutParams().height = (View.MeasureSpec.getSize(i11) - AndroidUtilities.dp(6.0f)) - this.S;
            if (j4Var.getLayoutParams().height < View.MeasureSpec.getSize(i11) * 0.5f) {
                j4Var.getLayoutParams().height = (int) (View.MeasureSpec.getSize(i11) * 0.5f);
            }
            j4Var.getLayoutParams().width = -1;
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = View.MeasureSpec.getSize(i11) - j4Var.getLayoutParams().height;
        }
        int size = (View.MeasureSpec.getSize(i11) + View.MeasureSpec.getSize(i10)) << 16;
        if (this.T != size) {
            for (int i13 = 0; i13 < this.r.previewMessages.size(); i13++) {
                MessageObject messageObject = this.r.previewMessages.get(i13);
                messageObject.parentWidth = rb0Var.v ? j4Var.getLayoutParams().width : View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(16.0f);
                messageObject.resetLayout();
                messageObject.forceUpdate = true;
                kb0 kb0Var = this.n;
                if (kb0Var != null) {
                    kb0Var.l();
                }
            }
            this.G = true;
        }
        this.T = size;
        super.onMeasure(i10, i11);
    }
}
