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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class wa0 extends FrameLayout {
    public final bb0 A;
    public final FrameLayout B;
    public final bb0 C;
    public final bb0 D;
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
    public final /* synthetic */ cb0 V;
    public final int a;
    public final fh.x4 b;
    public final fh.v c;
    public final org.telegram.ui.Cells.z9 d;
    public final oa0 e;
    public final pa0 f;
    public final ra0 h;
    public final va0 n;
    public MessagePreviewParams.Messages r;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout s;
    public final na0 v;
    public final na0 w;
    public final org.telegram.ui.ActionBar.g1 x;
    public final org.telegram.ui.ActionBar.g1 y;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v6, types: [android.view.View, org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout] */
    /* JADX WARN: Type inference failed for: r39v0, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout, java.lang.Object, org.telegram.ui.Components.wa0] */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.view.View, android.view.ViewGroup, fh.x4, org.telegram.ui.Components.xu0] */
    /* JADX WARN: Type inference failed for: r3v6, types: [ig.a] */
    /* JADX WARN: Type inference failed for: r9v10, types: [android.view.ViewGroup] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wa0(cb0 cb0Var, Context context, int i9) {
        super(r4);
        MessagePreviewParams messagePreviewParams;
        final wa0 wa0Var;
        Context context2;
        boolean z10;
        bb0 bb0Var;
        bb0 bb0Var2;
        MessagePreviewParams.Messages messages;
        float f10;
        int i10;
        LinearLayout linearLayout;
        MessagePreviewParams messagePreviewParams2;
        boolean z11;
        Context context3 = context;
        this.V = cb0Var;
        int i11 = 1;
        this.G = true;
        this.H = -1;
        this.I = -1;
        final int i12 = 0;
        this.J = false;
        this.M = new Rect();
        this.Q = false;
        this.U = true;
        this.F = new ChatMessageSharedResources(context3);
        this.a = i9;
        int i13 = 3;
        setOnTouchListener(new lr(this, i13));
        ?? x4Var = new fh.x4(this, context3, 2);
        this.b = x4Var;
        ya0 ya0Var = cb0Var.B;
        boolean z12 = cb0Var.b;
        MessagePreviewParams messagePreviewParams3 = cb0Var.d;
        Drawable d = ((org.telegram.ui.on) ya0Var).d();
        if (((org.telegram.ui.on) ya0Var).f == null) {
            int i14 = org.telegram.ui.ActionBar.f6.a;
        }
        x4Var.V(d);
        x4Var.setOccupyStatusBar(false);
        x4Var.setOutlineProvider(new kg.b(this, i13));
        x4Var.setClipToOutline(true);
        x4Var.setElevation(AndroidUtilities.dp(4.0f));
        fh.v vVar = new fh.v(context3, 13, ya0Var);
        this.c = vVar;
        vVar.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.s8, ya0Var));
        oa0 oa0Var = new oa0(this);
        this.e = oa0Var;
        oa0Var.D = new ih.i2(this, i13);
        pa0 pa0Var = new pa0(this, context3, ya0Var);
        this.f = pa0Var;
        ra0 ra0Var = new ra0(this, pa0Var, ya0Var);
        this.h = ra0Var;
        pa0Var.setItemAnimator(ra0Var);
        pa0Var.setOnScrollListener(new kn(this, 6));
        pa0Var.setOnItemClickListener(new sa0(this));
        va0 va0Var = new va0(this);
        this.n = va0Var;
        pa0Var.setAdapter(va0Var);
        pa0Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        ka0 ka0Var = new ka0(this);
        ka0Var.O = new la0(this);
        pa0Var.setClipToPadding(false);
        pa0Var.setLayoutManager(ka0Var);
        pa0Var.i(new ma0());
        x4Var.addView(pa0Var);
        addView(x4Var, g7.e6.d(-1, 400.0f, 0, 8.0f, 0.0f, 8.0f, 0.0f));
        x4Var.addView(vVar, g7.e6.c(-2.0f, -1));
        ?? actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert2, 1, getContext(), ya0Var);
        this.s = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().setOnForegroundOpenFinished(new ja0(this, i11));
        kg.d c10 = cb0Var.C.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, false);
        c10.n(mg.c.j(ya0Var));
        c10.o(AndroidUtilities.dp(8.0f));
        c10.h.e = true;
        c10.p(AndroidUtilities.dp(12.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c10);
        addView(actionBarPopupWindow$ActionBarPopupWindowLayout, g7.e6.c(-2.0f, -2));
        if (i9 != 0 || (messages = messagePreviewParams3.replyMessage) == null) {
            messagePreviewParams = messagePreviewParams3;
            if (i9 != 1 || messagePreviewParams.forwardMessages == null) {
                wa0Var = this;
                if (i9 == 2 && messagePreviewParams.linkMessage != null) {
                    bb0 bb0Var3 = new bb0(context, R.raw.position_below, LocaleController.getString(R.string.LinkAbove), R.raw.position_above, LocaleController.getString(R.string.LinkBelow), cb0Var.B);
                    wa0Var.A = bb0Var3;
                    bb0Var3.a(!messagePreviewParams.webpageTop, false);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(bb0Var3, g7.e6.n(-1, 48));
                    FrameLayout frameLayout = new FrameLayout(context);
                    wa0Var.B = frameLayout;
                    frameLayout.setBackground(org.telegram.ui.ActionBar.f6.Y(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.I5, ya0Var), 0, 0));
                    bb0 bb0Var4 = new bb0(context, R.raw.media_shrink, LocaleController.getString(R.string.LinkMediaLarger), R.raw.media_enlarge, LocaleController.getString(R.string.LinkMediaSmaller), cb0Var.B);
                    wa0Var.C = bb0Var4;
                    bb0Var4.setBackground(null);
                    bb0Var4.setVisibility(messagePreviewParams.isVideo ? 4 : 0);
                    frameLayout.addView(bb0Var4, g7.e6.n(-1, 48));
                    bb0 bb0Var5 = new bb0(context, R.raw.media_shrink, LocaleController.getString(R.string.LinkVideoLarger), R.raw.media_enlarge, LocaleController.getString(R.string.LinkVideoSmaller), cb0Var.B);
                    wa0Var.D = bb0Var5;
                    bb0Var5.setBackground(null);
                    bb0Var5.setVisibility(!messagePreviewParams.isVideo ? 4 : 0);
                    frameLayout.setAlpha(messagePreviewParams.hasMedia ? 1.0f : 0.5f);
                    frameLayout.addView(bb0Var5, g7.e6.n(-1, 48));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, g7.e6.n(-1, 48));
                    frameLayout.setVisibility((!messagePreviewParams.singleLink || messagePreviewParams.hasMedia) ? 0 : 8);
                    bb0Var4.a(messagePreviewParams.webpageSmall, false);
                    bb0Var5.a(messagePreviewParams.webpageSmall, false);
                    org.telegram.ui.ActionBar.l1 l1Var = new org.telegram.ui.ActionBar.l1(context, ya0Var);
                    l1Var.setColor(org.telegram.ui.ActionBar.f6.l1(0.06f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.E8, ya0Var)));
                    l1Var.setTag(R.id.fit_width_tag, 1);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(l1Var, g7.e6.n(-1, 8));
                    org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(1, context, cb0Var.B, false, false);
                    g1Var.g(LocaleController.getString(R.string.ApplyChanges), R.drawable.msg_select, null);
                    final int i15 = 10;
                    g1Var.setOnClickListener(new View.OnClickListener(wa0Var) { // from class: org.telegram.ui.Components.ga0
                        public final /* synthetic */ wa0 b;

                        {
                            this.b = wa0Var;
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
                                    wa0 wa0Var2 = this.b;
                                    wa0Var2.V.d.quote = null;
                                    wa0Var2.e.f(false);
                                    wa0Var2.g(false, false);
                                    wa0Var2.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    wa0 wa0Var3 = this.b;
                                    oa0 oa0Var2 = wa0Var3.e;
                                    cb0 cb0Var2 = wa0Var3.V;
                                    if (wa0Var3.c(null) != null) {
                                        if (oa0Var2.v - oa0Var2.u <= MessagesController.getInstance(cb0Var2.w).quoteLengthMax) {
                                            org.telegram.ui.Cells.v9 v9Var = oa0Var2.W;
                                            MessageObject c11 = wa0Var3.c(v9Var != null ? ((org.telegram.ui.Cells.t1) v9Var).getMessageObject() : null);
                                            MessagePreviewParams messagePreviewParams4 = cb0Var2.d;
                                            int i17 = oa0Var2.u;
                                            messagePreviewParams4.quoteStart = i17;
                                            int i18 = oa0Var2.v;
                                            messagePreviewParams4.quoteEnd = i18;
                                            messagePreviewParams4.quote = org.telegram.ui.gn.b(i17, i18, c11);
                                            cb0Var2.b();
                                            cb0Var2.a(true);
                                            break;
                                        } else {
                                            wa0Var3.f();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    wa0 wa0Var4 = this.b;
                                    oa0 oa0Var3 = wa0Var4.e;
                                    cb0 cb0Var3 = wa0Var4.V;
                                    MessagePreviewParams messagePreviewParams5 = cb0Var3.d;
                                    int i19 = cb0Var3.w;
                                    boolean z13 = cb0Var3.b;
                                    if (messagePreviewParams5.quote != null && !z13) {
                                        messagePreviewParams5.quote = null;
                                        oa0Var3.f(false);
                                        wa0Var4.g(false, true);
                                        wa0Var4.k(true);
                                        break;
                                    } else if (oa0Var3.v - oa0Var3.u <= MessagesController.getInstance(i19).quoteLengthMax) {
                                        MessageObject c12 = wa0Var4.c(null);
                                        if (c12 != null) {
                                            if (!oa0Var3.y()) {
                                                messagePreviewParams5.quoteStart = 0;
                                                int min = Math.min(MessagesController.getInstance(i19).quoteLengthMax, c12.messageOwner.message.length());
                                                messagePreviewParams5.quoteEnd = min;
                                                messagePreviewParams5.quote = org.telegram.ui.gn.b(messagePreviewParams5.quoteStart, min, c12);
                                                View d9 = wa0Var4.d();
                                                if (d9 instanceof org.telegram.ui.Cells.t1) {
                                                    oa0Var3.a0((org.telegram.ui.Cells.t1) d9, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                }
                                                if (!z13) {
                                                    wa0Var4.s.getSwipeBack().e(wa0Var4.E);
                                                }
                                                wa0Var4.g(true, true);
                                                break;
                                            } else {
                                                messagePreviewParams5.quoteStart = oa0Var3.u;
                                                messagePreviewParams5.quoteEnd = oa0Var3.v;
                                                org.telegram.ui.Cells.v9 v9Var2 = oa0Var3.W;
                                                messagePreviewParams5.quote = org.telegram.ui.gn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, wa0Var4.c(v9Var2 != null ? ((org.telegram.ui.Cells.t1) v9Var2).getMessageObject() : null));
                                                cb0Var3.b();
                                                cb0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        wa0Var4.f();
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
                                    cb0 cb0Var4 = this.b.V;
                                    if (!cb0Var4.b) {
                                        org.telegram.ui.wk wkVar = (org.telegram.ui.wk) cb0Var4;
                                        wkVar.a(true);
                                        org.telegram.ui.qn qnVar = wkVar.D;
                                        qnVar.j5 = null;
                                        qnVar.h5 = null;
                                        qnVar.b5.updateReply(null, null, qnVar.P5, null);
                                        qnVar.j8();
                                        break;
                                    } else {
                                        org.telegram.ui.wk wkVar2 = (org.telegram.ui.wk) cb0Var4;
                                        wkVar2.a(true);
                                        org.telegram.ui.qn qnVar2 = wkVar2.D;
                                        qnVar2.h5 = null;
                                        qnVar2.Bb(qnVar2.j5);
                                        break;
                                    }
                                case 7:
                                    this.b.V.c(true);
                                    break;
                                case 8:
                                    this.b.V.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.wk wkVar3 = (org.telegram.ui.wk) this.b.V;
                                    wkVar3.a(true);
                                    org.telegram.ui.qn qnVar3 = wkVar3.D;
                                    qnVar3.b5.updateForward(null, qnVar3.P5);
                                    qnVar3.j8();
                                    break;
                                case 10:
                                    this.b.V.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.wk wkVar4 = (org.telegram.ui.wk) this.b.V;
                                    wkVar4.a(true);
                                    org.telegram.ui.qn qnVar4 = wkVar4.D;
                                    qnVar4.C5 = null;
                                    org.telegram.ui.ak akVar = qnVar4.U;
                                    if (akVar != null) {
                                        akVar.S2 = null;
                                        akVar.T2 = false;
                                    }
                                    MessagePreviewParams messagePreviewParams6 = qnVar4.b5;
                                    if (messagePreviewParams6 != null) {
                                        i16 = ((org.telegram.ui.ActionBar.o2) qnVar4).currentAccount;
                                        MessageObject messageObject = qnVar4.j5;
                                        messagePreviewParams6.updateLink(i16, null, null, messageObject == qnVar4.T3 ? null : messageObject, qnVar4.h5, qnVar4.l5);
                                    }
                                    qnVar4.j8();
                                    break;
                                case 12:
                                    wa0 wa0Var5 = this.b;
                                    MessagePreviewParams messagePreviewParams7 = wa0Var5.V.d;
                                    if (messagePreviewParams7.hasMedia) {
                                        boolean z14 = !messagePreviewParams7.webpageSmall;
                                        messagePreviewParams7.webpageSmall = z14;
                                        wa0Var5.C.a(z14, true);
                                        wa0Var5.D.a(messagePreviewParams7.webpageSmall, true);
                                        if (wa0Var5.r.messages.size() > 0 && (message2 = wa0Var5.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z15 = messagePreviewParams7.webpageSmall;
                                            messageMedia2.force_small_media = z15;
                                            messageMedia2.force_large_media = !z15;
                                        }
                                        if (wa0Var5.r.previewMessages.size() > 0 && (message = wa0Var5.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                            boolean z16 = messagePreviewParams7.webpageSmall;
                                            messageMedia.force_small_media = z16;
                                            messageMedia.force_large_media = !z16;
                                        }
                                        wa0Var5.h();
                                        wa0Var5.Q = true;
                                        break;
                                    }
                                    break;
                                default:
                                    wa0 wa0Var6 = this.b;
                                    MessagePreviewParams messagePreviewParams8 = wa0Var6.V.d;
                                    boolean z17 = messagePreviewParams8.webpageTop;
                                    messagePreviewParams8.webpageTop = !z17;
                                    wa0Var6.A.a(z17, true);
                                    if (wa0Var6.r.messages.size() > 0 && (message4 = wa0Var6.r.messages.get(0).messageOwner) != null) {
                                        message4.invert_media = messagePreviewParams8.webpageTop;
                                    }
                                    if (wa0Var6.r.previewMessages.size() > 0 && (message3 = wa0Var6.r.previewMessages.get(0).messageOwner) != null) {
                                        message3.invert_media = messagePreviewParams8.webpageTop;
                                    }
                                    wa0Var6.h();
                                    wa0Var6.Q = true;
                                    break;
                            }
                        }
                    });
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var, g7.e6.n(-1, 48));
                    org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(1, context, cb0Var.B, false, true);
                    context2 = context;
                    g1Var2.g(LocaleController.getString(R.string.DoNotLinkPreview), R.drawable.msg_delete, null);
                    int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.q7, ya0Var);
                    int i16 = org.telegram.ui.ActionBar.f6.p7;
                    g1Var2.c(v02, org.telegram.ui.ActionBar.f6.v0(i16, ya0Var));
                    final int i17 = 11;
                    g1Var2.setOnClickListener(new View.OnClickListener(wa0Var) { // from class: org.telegram.ui.Components.ga0
                        public final /* synthetic */ wa0 b;

                        {
                            this.b = wa0Var;
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
                                    wa0 wa0Var2 = this.b;
                                    wa0Var2.V.d.quote = null;
                                    wa0Var2.e.f(false);
                                    wa0Var2.g(false, false);
                                    wa0Var2.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    wa0 wa0Var3 = this.b;
                                    oa0 oa0Var2 = wa0Var3.e;
                                    cb0 cb0Var2 = wa0Var3.V;
                                    if (wa0Var3.c(null) != null) {
                                        if (oa0Var2.v - oa0Var2.u <= MessagesController.getInstance(cb0Var2.w).quoteLengthMax) {
                                            org.telegram.ui.Cells.v9 v9Var = oa0Var2.W;
                                            MessageObject c11 = wa0Var3.c(v9Var != null ? ((org.telegram.ui.Cells.t1) v9Var).getMessageObject() : null);
                                            MessagePreviewParams messagePreviewParams4 = cb0Var2.d;
                                            int i172 = oa0Var2.u;
                                            messagePreviewParams4.quoteStart = i172;
                                            int i18 = oa0Var2.v;
                                            messagePreviewParams4.quoteEnd = i18;
                                            messagePreviewParams4.quote = org.telegram.ui.gn.b(i172, i18, c11);
                                            cb0Var2.b();
                                            cb0Var2.a(true);
                                            break;
                                        } else {
                                            wa0Var3.f();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    wa0 wa0Var4 = this.b;
                                    oa0 oa0Var3 = wa0Var4.e;
                                    cb0 cb0Var3 = wa0Var4.V;
                                    MessagePreviewParams messagePreviewParams5 = cb0Var3.d;
                                    int i19 = cb0Var3.w;
                                    boolean z13 = cb0Var3.b;
                                    if (messagePreviewParams5.quote != null && !z13) {
                                        messagePreviewParams5.quote = null;
                                        oa0Var3.f(false);
                                        wa0Var4.g(false, true);
                                        wa0Var4.k(true);
                                        break;
                                    } else if (oa0Var3.v - oa0Var3.u <= MessagesController.getInstance(i19).quoteLengthMax) {
                                        MessageObject c12 = wa0Var4.c(null);
                                        if (c12 != null) {
                                            if (!oa0Var3.y()) {
                                                messagePreviewParams5.quoteStart = 0;
                                                int min = Math.min(MessagesController.getInstance(i19).quoteLengthMax, c12.messageOwner.message.length());
                                                messagePreviewParams5.quoteEnd = min;
                                                messagePreviewParams5.quote = org.telegram.ui.gn.b(messagePreviewParams5.quoteStart, min, c12);
                                                View d9 = wa0Var4.d();
                                                if (d9 instanceof org.telegram.ui.Cells.t1) {
                                                    oa0Var3.a0((org.telegram.ui.Cells.t1) d9, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                }
                                                if (!z13) {
                                                    wa0Var4.s.getSwipeBack().e(wa0Var4.E);
                                                }
                                                wa0Var4.g(true, true);
                                                break;
                                            } else {
                                                messagePreviewParams5.quoteStart = oa0Var3.u;
                                                messagePreviewParams5.quoteEnd = oa0Var3.v;
                                                org.telegram.ui.Cells.v9 v9Var2 = oa0Var3.W;
                                                messagePreviewParams5.quote = org.telegram.ui.gn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, wa0Var4.c(v9Var2 != null ? ((org.telegram.ui.Cells.t1) v9Var2).getMessageObject() : null));
                                                cb0Var3.b();
                                                cb0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        wa0Var4.f();
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
                                    cb0 cb0Var4 = this.b.V;
                                    if (!cb0Var4.b) {
                                        org.telegram.ui.wk wkVar = (org.telegram.ui.wk) cb0Var4;
                                        wkVar.a(true);
                                        org.telegram.ui.qn qnVar = wkVar.D;
                                        qnVar.j5 = null;
                                        qnVar.h5 = null;
                                        qnVar.b5.updateReply(null, null, qnVar.P5, null);
                                        qnVar.j8();
                                        break;
                                    } else {
                                        org.telegram.ui.wk wkVar2 = (org.telegram.ui.wk) cb0Var4;
                                        wkVar2.a(true);
                                        org.telegram.ui.qn qnVar2 = wkVar2.D;
                                        qnVar2.h5 = null;
                                        qnVar2.Bb(qnVar2.j5);
                                        break;
                                    }
                                case 7:
                                    this.b.V.c(true);
                                    break;
                                case 8:
                                    this.b.V.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.wk wkVar3 = (org.telegram.ui.wk) this.b.V;
                                    wkVar3.a(true);
                                    org.telegram.ui.qn qnVar3 = wkVar3.D;
                                    qnVar3.b5.updateForward(null, qnVar3.P5);
                                    qnVar3.j8();
                                    break;
                                case 10:
                                    this.b.V.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.wk wkVar4 = (org.telegram.ui.wk) this.b.V;
                                    wkVar4.a(true);
                                    org.telegram.ui.qn qnVar4 = wkVar4.D;
                                    qnVar4.C5 = null;
                                    org.telegram.ui.ak akVar = qnVar4.U;
                                    if (akVar != null) {
                                        akVar.S2 = null;
                                        akVar.T2 = false;
                                    }
                                    MessagePreviewParams messagePreviewParams6 = qnVar4.b5;
                                    if (messagePreviewParams6 != null) {
                                        i162 = ((org.telegram.ui.ActionBar.o2) qnVar4).currentAccount;
                                        MessageObject messageObject = qnVar4.j5;
                                        messagePreviewParams6.updateLink(i162, null, null, messageObject == qnVar4.T3 ? null : messageObject, qnVar4.h5, qnVar4.l5);
                                    }
                                    qnVar4.j8();
                                    break;
                                case 12:
                                    wa0 wa0Var5 = this.b;
                                    MessagePreviewParams messagePreviewParams7 = wa0Var5.V.d;
                                    if (messagePreviewParams7.hasMedia) {
                                        boolean z14 = !messagePreviewParams7.webpageSmall;
                                        messagePreviewParams7.webpageSmall = z14;
                                        wa0Var5.C.a(z14, true);
                                        wa0Var5.D.a(messagePreviewParams7.webpageSmall, true);
                                        if (wa0Var5.r.messages.size() > 0 && (message2 = wa0Var5.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z15 = messagePreviewParams7.webpageSmall;
                                            messageMedia2.force_small_media = z15;
                                            messageMedia2.force_large_media = !z15;
                                        }
                                        if (wa0Var5.r.previewMessages.size() > 0 && (message = wa0Var5.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                            boolean z16 = messagePreviewParams7.webpageSmall;
                                            messageMedia.force_small_media = z16;
                                            messageMedia.force_large_media = !z16;
                                        }
                                        wa0Var5.h();
                                        wa0Var5.Q = true;
                                        break;
                                    }
                                    break;
                                default:
                                    wa0 wa0Var6 = this.b;
                                    MessagePreviewParams messagePreviewParams8 = wa0Var6.V.d;
                                    boolean z17 = messagePreviewParams8.webpageTop;
                                    messagePreviewParams8.webpageTop = !z17;
                                    wa0Var6.A.a(z17, true);
                                    if (wa0Var6.r.messages.size() > 0 && (message4 = wa0Var6.r.messages.get(0).messageOwner) != null) {
                                        message4.invert_media = messagePreviewParams8.webpageTop;
                                    }
                                    if (wa0Var6.r.previewMessages.size() > 0 && (message3 = wa0Var6.r.previewMessages.get(0).messageOwner) != null) {
                                        message3.invert_media = messagePreviewParams8.webpageTop;
                                    }
                                    wa0Var6.h();
                                    wa0Var6.Q = true;
                                    break;
                            }
                        }
                    });
                    g1Var2.setSelectorColor(org.telegram.ui.ActionBar.f6.l1(0.12f, org.telegram.ui.ActionBar.f6.w0(null, i16, false)));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var2, g7.e6.n(-1, 48));
                    final int i18 = 12;
                    frameLayout.setOnClickListener(new View.OnClickListener(wa0Var) { // from class: org.telegram.ui.Components.ga0
                        public final /* synthetic */ wa0 b;

                        {
                            this.b = wa0Var;
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
                                    wa0 wa0Var2 = this.b;
                                    wa0Var2.V.d.quote = null;
                                    wa0Var2.e.f(false);
                                    wa0Var2.g(false, false);
                                    wa0Var2.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    wa0 wa0Var3 = this.b;
                                    oa0 oa0Var2 = wa0Var3.e;
                                    cb0 cb0Var2 = wa0Var3.V;
                                    if (wa0Var3.c(null) != null) {
                                        if (oa0Var2.v - oa0Var2.u <= MessagesController.getInstance(cb0Var2.w).quoteLengthMax) {
                                            org.telegram.ui.Cells.v9 v9Var = oa0Var2.W;
                                            MessageObject c11 = wa0Var3.c(v9Var != null ? ((org.telegram.ui.Cells.t1) v9Var).getMessageObject() : null);
                                            MessagePreviewParams messagePreviewParams4 = cb0Var2.d;
                                            int i172 = oa0Var2.u;
                                            messagePreviewParams4.quoteStart = i172;
                                            int i182 = oa0Var2.v;
                                            messagePreviewParams4.quoteEnd = i182;
                                            messagePreviewParams4.quote = org.telegram.ui.gn.b(i172, i182, c11);
                                            cb0Var2.b();
                                            cb0Var2.a(true);
                                            break;
                                        } else {
                                            wa0Var3.f();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    wa0 wa0Var4 = this.b;
                                    oa0 oa0Var3 = wa0Var4.e;
                                    cb0 cb0Var3 = wa0Var4.V;
                                    MessagePreviewParams messagePreviewParams5 = cb0Var3.d;
                                    int i19 = cb0Var3.w;
                                    boolean z13 = cb0Var3.b;
                                    if (messagePreviewParams5.quote != null && !z13) {
                                        messagePreviewParams5.quote = null;
                                        oa0Var3.f(false);
                                        wa0Var4.g(false, true);
                                        wa0Var4.k(true);
                                        break;
                                    } else if (oa0Var3.v - oa0Var3.u <= MessagesController.getInstance(i19).quoteLengthMax) {
                                        MessageObject c12 = wa0Var4.c(null);
                                        if (c12 != null) {
                                            if (!oa0Var3.y()) {
                                                messagePreviewParams5.quoteStart = 0;
                                                int min = Math.min(MessagesController.getInstance(i19).quoteLengthMax, c12.messageOwner.message.length());
                                                messagePreviewParams5.quoteEnd = min;
                                                messagePreviewParams5.quote = org.telegram.ui.gn.b(messagePreviewParams5.quoteStart, min, c12);
                                                View d9 = wa0Var4.d();
                                                if (d9 instanceof org.telegram.ui.Cells.t1) {
                                                    oa0Var3.a0((org.telegram.ui.Cells.t1) d9, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                }
                                                if (!z13) {
                                                    wa0Var4.s.getSwipeBack().e(wa0Var4.E);
                                                }
                                                wa0Var4.g(true, true);
                                                break;
                                            } else {
                                                messagePreviewParams5.quoteStart = oa0Var3.u;
                                                messagePreviewParams5.quoteEnd = oa0Var3.v;
                                                org.telegram.ui.Cells.v9 v9Var2 = oa0Var3.W;
                                                messagePreviewParams5.quote = org.telegram.ui.gn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, wa0Var4.c(v9Var2 != null ? ((org.telegram.ui.Cells.t1) v9Var2).getMessageObject() : null));
                                                cb0Var3.b();
                                                cb0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        wa0Var4.f();
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
                                    cb0 cb0Var4 = this.b.V;
                                    if (!cb0Var4.b) {
                                        org.telegram.ui.wk wkVar = (org.telegram.ui.wk) cb0Var4;
                                        wkVar.a(true);
                                        org.telegram.ui.qn qnVar = wkVar.D;
                                        qnVar.j5 = null;
                                        qnVar.h5 = null;
                                        qnVar.b5.updateReply(null, null, qnVar.P5, null);
                                        qnVar.j8();
                                        break;
                                    } else {
                                        org.telegram.ui.wk wkVar2 = (org.telegram.ui.wk) cb0Var4;
                                        wkVar2.a(true);
                                        org.telegram.ui.qn qnVar2 = wkVar2.D;
                                        qnVar2.h5 = null;
                                        qnVar2.Bb(qnVar2.j5);
                                        break;
                                    }
                                case 7:
                                    this.b.V.c(true);
                                    break;
                                case 8:
                                    this.b.V.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.wk wkVar3 = (org.telegram.ui.wk) this.b.V;
                                    wkVar3.a(true);
                                    org.telegram.ui.qn qnVar3 = wkVar3.D;
                                    qnVar3.b5.updateForward(null, qnVar3.P5);
                                    qnVar3.j8();
                                    break;
                                case 10:
                                    this.b.V.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.wk wkVar4 = (org.telegram.ui.wk) this.b.V;
                                    wkVar4.a(true);
                                    org.telegram.ui.qn qnVar4 = wkVar4.D;
                                    qnVar4.C5 = null;
                                    org.telegram.ui.ak akVar = qnVar4.U;
                                    if (akVar != null) {
                                        akVar.S2 = null;
                                        akVar.T2 = false;
                                    }
                                    MessagePreviewParams messagePreviewParams6 = qnVar4.b5;
                                    if (messagePreviewParams6 != null) {
                                        i162 = ((org.telegram.ui.ActionBar.o2) qnVar4).currentAccount;
                                        MessageObject messageObject = qnVar4.j5;
                                        messagePreviewParams6.updateLink(i162, null, null, messageObject == qnVar4.T3 ? null : messageObject, qnVar4.h5, qnVar4.l5);
                                    }
                                    qnVar4.j8();
                                    break;
                                case 12:
                                    wa0 wa0Var5 = this.b;
                                    MessagePreviewParams messagePreviewParams7 = wa0Var5.V.d;
                                    if (messagePreviewParams7.hasMedia) {
                                        boolean z14 = !messagePreviewParams7.webpageSmall;
                                        messagePreviewParams7.webpageSmall = z14;
                                        wa0Var5.C.a(z14, true);
                                        wa0Var5.D.a(messagePreviewParams7.webpageSmall, true);
                                        if (wa0Var5.r.messages.size() > 0 && (message2 = wa0Var5.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z15 = messagePreviewParams7.webpageSmall;
                                            messageMedia2.force_small_media = z15;
                                            messageMedia2.force_large_media = !z15;
                                        }
                                        if (wa0Var5.r.previewMessages.size() > 0 && (message = wa0Var5.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                            boolean z16 = messagePreviewParams7.webpageSmall;
                                            messageMedia.force_small_media = z16;
                                            messageMedia.force_large_media = !z16;
                                        }
                                        wa0Var5.h();
                                        wa0Var5.Q = true;
                                        break;
                                    }
                                    break;
                                default:
                                    wa0 wa0Var6 = this.b;
                                    MessagePreviewParams messagePreviewParams8 = wa0Var6.V.d;
                                    boolean z17 = messagePreviewParams8.webpageTop;
                                    messagePreviewParams8.webpageTop = !z17;
                                    wa0Var6.A.a(z17, true);
                                    if (wa0Var6.r.messages.size() > 0 && (message4 = wa0Var6.r.messages.get(0).messageOwner) != null) {
                                        message4.invert_media = messagePreviewParams8.webpageTop;
                                    }
                                    if (wa0Var6.r.previewMessages.size() > 0 && (message3 = wa0Var6.r.previewMessages.get(0).messageOwner) != null) {
                                        message3.invert_media = messagePreviewParams8.webpageTop;
                                    }
                                    wa0Var6.h();
                                    wa0Var6.Q = true;
                                    break;
                            }
                        }
                    });
                    final int i19 = 13;
                    bb0Var3.setOnClickListener(new View.OnClickListener(wa0Var) { // from class: org.telegram.ui.Components.ga0
                        public final /* synthetic */ wa0 b;

                        {
                            this.b = wa0Var;
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
                                    wa0 wa0Var2 = this.b;
                                    wa0Var2.V.d.quote = null;
                                    wa0Var2.e.f(false);
                                    wa0Var2.g(false, false);
                                    wa0Var2.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    wa0 wa0Var3 = this.b;
                                    oa0 oa0Var2 = wa0Var3.e;
                                    cb0 cb0Var2 = wa0Var3.V;
                                    if (wa0Var3.c(null) != null) {
                                        if (oa0Var2.v - oa0Var2.u <= MessagesController.getInstance(cb0Var2.w).quoteLengthMax) {
                                            org.telegram.ui.Cells.v9 v9Var = oa0Var2.W;
                                            MessageObject c11 = wa0Var3.c(v9Var != null ? ((org.telegram.ui.Cells.t1) v9Var).getMessageObject() : null);
                                            MessagePreviewParams messagePreviewParams4 = cb0Var2.d;
                                            int i172 = oa0Var2.u;
                                            messagePreviewParams4.quoteStart = i172;
                                            int i182 = oa0Var2.v;
                                            messagePreviewParams4.quoteEnd = i182;
                                            messagePreviewParams4.quote = org.telegram.ui.gn.b(i172, i182, c11);
                                            cb0Var2.b();
                                            cb0Var2.a(true);
                                            break;
                                        } else {
                                            wa0Var3.f();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    wa0 wa0Var4 = this.b;
                                    oa0 oa0Var3 = wa0Var4.e;
                                    cb0 cb0Var3 = wa0Var4.V;
                                    MessagePreviewParams messagePreviewParams5 = cb0Var3.d;
                                    int i192 = cb0Var3.w;
                                    boolean z13 = cb0Var3.b;
                                    if (messagePreviewParams5.quote != null && !z13) {
                                        messagePreviewParams5.quote = null;
                                        oa0Var3.f(false);
                                        wa0Var4.g(false, true);
                                        wa0Var4.k(true);
                                        break;
                                    } else if (oa0Var3.v - oa0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                        MessageObject c12 = wa0Var4.c(null);
                                        if (c12 != null) {
                                            if (!oa0Var3.y()) {
                                                messagePreviewParams5.quoteStart = 0;
                                                int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                                messagePreviewParams5.quoteEnd = min;
                                                messagePreviewParams5.quote = org.telegram.ui.gn.b(messagePreviewParams5.quoteStart, min, c12);
                                                View d9 = wa0Var4.d();
                                                if (d9 instanceof org.telegram.ui.Cells.t1) {
                                                    oa0Var3.a0((org.telegram.ui.Cells.t1) d9, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                }
                                                if (!z13) {
                                                    wa0Var4.s.getSwipeBack().e(wa0Var4.E);
                                                }
                                                wa0Var4.g(true, true);
                                                break;
                                            } else {
                                                messagePreviewParams5.quoteStart = oa0Var3.u;
                                                messagePreviewParams5.quoteEnd = oa0Var3.v;
                                                org.telegram.ui.Cells.v9 v9Var2 = oa0Var3.W;
                                                messagePreviewParams5.quote = org.telegram.ui.gn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, wa0Var4.c(v9Var2 != null ? ((org.telegram.ui.Cells.t1) v9Var2).getMessageObject() : null));
                                                cb0Var3.b();
                                                cb0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        wa0Var4.f();
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
                                    cb0 cb0Var4 = this.b.V;
                                    if (!cb0Var4.b) {
                                        org.telegram.ui.wk wkVar = (org.telegram.ui.wk) cb0Var4;
                                        wkVar.a(true);
                                        org.telegram.ui.qn qnVar = wkVar.D;
                                        qnVar.j5 = null;
                                        qnVar.h5 = null;
                                        qnVar.b5.updateReply(null, null, qnVar.P5, null);
                                        qnVar.j8();
                                        break;
                                    } else {
                                        org.telegram.ui.wk wkVar2 = (org.telegram.ui.wk) cb0Var4;
                                        wkVar2.a(true);
                                        org.telegram.ui.qn qnVar2 = wkVar2.D;
                                        qnVar2.h5 = null;
                                        qnVar2.Bb(qnVar2.j5);
                                        break;
                                    }
                                case 7:
                                    this.b.V.c(true);
                                    break;
                                case 8:
                                    this.b.V.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.wk wkVar3 = (org.telegram.ui.wk) this.b.V;
                                    wkVar3.a(true);
                                    org.telegram.ui.qn qnVar3 = wkVar3.D;
                                    qnVar3.b5.updateForward(null, qnVar3.P5);
                                    qnVar3.j8();
                                    break;
                                case 10:
                                    this.b.V.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.wk wkVar4 = (org.telegram.ui.wk) this.b.V;
                                    wkVar4.a(true);
                                    org.telegram.ui.qn qnVar4 = wkVar4.D;
                                    qnVar4.C5 = null;
                                    org.telegram.ui.ak akVar = qnVar4.U;
                                    if (akVar != null) {
                                        akVar.S2 = null;
                                        akVar.T2 = false;
                                    }
                                    MessagePreviewParams messagePreviewParams6 = qnVar4.b5;
                                    if (messagePreviewParams6 != null) {
                                        i162 = ((org.telegram.ui.ActionBar.o2) qnVar4).currentAccount;
                                        MessageObject messageObject = qnVar4.j5;
                                        messagePreviewParams6.updateLink(i162, null, null, messageObject == qnVar4.T3 ? null : messageObject, qnVar4.h5, qnVar4.l5);
                                    }
                                    qnVar4.j8();
                                    break;
                                case 12:
                                    wa0 wa0Var5 = this.b;
                                    MessagePreviewParams messagePreviewParams7 = wa0Var5.V.d;
                                    if (messagePreviewParams7.hasMedia) {
                                        boolean z14 = !messagePreviewParams7.webpageSmall;
                                        messagePreviewParams7.webpageSmall = z14;
                                        wa0Var5.C.a(z14, true);
                                        wa0Var5.D.a(messagePreviewParams7.webpageSmall, true);
                                        if (wa0Var5.r.messages.size() > 0 && (message2 = wa0Var5.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z15 = messagePreviewParams7.webpageSmall;
                                            messageMedia2.force_small_media = z15;
                                            messageMedia2.force_large_media = !z15;
                                        }
                                        if (wa0Var5.r.previewMessages.size() > 0 && (message = wa0Var5.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                            boolean z16 = messagePreviewParams7.webpageSmall;
                                            messageMedia.force_small_media = z16;
                                            messageMedia.force_large_media = !z16;
                                        }
                                        wa0Var5.h();
                                        wa0Var5.Q = true;
                                        break;
                                    }
                                    break;
                                default:
                                    wa0 wa0Var6 = this.b;
                                    MessagePreviewParams messagePreviewParams8 = wa0Var6.V.d;
                                    boolean z17 = messagePreviewParams8.webpageTop;
                                    messagePreviewParams8.webpageTop = !z17;
                                    wa0Var6.A.a(z17, true);
                                    if (wa0Var6.r.messages.size() > 0 && (message4 = wa0Var6.r.messages.get(0).messageOwner) != null) {
                                        message4.invert_media = messagePreviewParams8.webpageTop;
                                    }
                                    if (wa0Var6.r.previewMessages.size() > 0 && (message3 = wa0Var6.r.previewMessages.get(0).messageOwner) != null) {
                                        message3.invert_media = messagePreviewParams8.webpageTop;
                                    }
                                    wa0Var6.h();
                                    wa0Var6.Q = true;
                                    break;
                            }
                        }
                    });
                }
            } else {
                if (!UserConfig.getInstance(cb0Var.w).isPremium()) {
                    for (int i20 = 0; i20 < messagePreviewParams.forwardMessages.messages.size(); i20++) {
                        if (messagePreviewParams.forwardMessages.messages.get(i20).type == 36) {
                            z10 = false;
                            break;
                        }
                    }
                }
                z10 = true;
                bb0 bb0Var6 = new bb0(context, R.raw.name_hide, LocaleController.getString(messagePreviewParams.multipleUsers ? R.string.ShowSenderNames : R.string.ShowSendersName), R.raw.name_show, LocaleController.getString(messagePreviewParams.multipleUsers ? R.string.HideSenderNames : R.string.HideSendersName), cb0Var.B);
                this.s.a(bb0Var6, g7.e6.n(-1, 48));
                if (messagePreviewParams.hasCaption) {
                    bb0Var = bb0Var6;
                    bb0 bb0Var7 = new bb0(context, R.raw.caption_hide, LocaleController.getString(R.string.ShowCaption), R.raw.caption_show, LocaleController.getString(R.string.HideCaption), cb0Var.B);
                    bb0Var7.a(messagePreviewParams.hideCaption, false);
                    this.s.a(bb0Var7, g7.e6.n(-1, 48));
                    bb0Var2 = bb0Var7;
                } else {
                    bb0Var = bb0Var6;
                    bb0Var2 = null;
                }
                org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(0, context, cb0Var.B, true, false);
                final int i21 = 7;
                g1Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ga0
                    public final /* synthetic */ wa0 b;

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
                                wa0 wa0Var2 = this.b;
                                wa0Var2.V.d.quote = null;
                                wa0Var2.e.f(false);
                                wa0Var2.g(false, false);
                                wa0Var2.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                wa0 wa0Var3 = this.b;
                                oa0 oa0Var2 = wa0Var3.e;
                                cb0 cb0Var2 = wa0Var3.V;
                                if (wa0Var3.c(null) != null) {
                                    if (oa0Var2.v - oa0Var2.u <= MessagesController.getInstance(cb0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.v9 v9Var = oa0Var2.W;
                                        MessageObject c11 = wa0Var3.c(v9Var != null ? ((org.telegram.ui.Cells.t1) v9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams4 = cb0Var2.d;
                                        int i172 = oa0Var2.u;
                                        messagePreviewParams4.quoteStart = i172;
                                        int i182 = oa0Var2.v;
                                        messagePreviewParams4.quoteEnd = i182;
                                        messagePreviewParams4.quote = org.telegram.ui.gn.b(i172, i182, c11);
                                        cb0Var2.b();
                                        cb0Var2.a(true);
                                        break;
                                    } else {
                                        wa0Var3.f();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                wa0 wa0Var4 = this.b;
                                oa0 oa0Var3 = wa0Var4.e;
                                cb0 cb0Var3 = wa0Var4.V;
                                MessagePreviewParams messagePreviewParams5 = cb0Var3.d;
                                int i192 = cb0Var3.w;
                                boolean z13 = cb0Var3.b;
                                if (messagePreviewParams5.quote != null && !z13) {
                                    messagePreviewParams5.quote = null;
                                    oa0Var3.f(false);
                                    wa0Var4.g(false, true);
                                    wa0Var4.k(true);
                                    break;
                                } else if (oa0Var3.v - oa0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                    MessageObject c12 = wa0Var4.c(null);
                                    if (c12 != null) {
                                        if (!oa0Var3.y()) {
                                            messagePreviewParams5.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                            messagePreviewParams5.quoteEnd = min;
                                            messagePreviewParams5.quote = org.telegram.ui.gn.b(messagePreviewParams5.quoteStart, min, c12);
                                            View d9 = wa0Var4.d();
                                            if (d9 instanceof org.telegram.ui.Cells.t1) {
                                                oa0Var3.a0((org.telegram.ui.Cells.t1) d9, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            }
                                            if (!z13) {
                                                wa0Var4.s.getSwipeBack().e(wa0Var4.E);
                                            }
                                            wa0Var4.g(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams5.quoteStart = oa0Var3.u;
                                            messagePreviewParams5.quoteEnd = oa0Var3.v;
                                            org.telegram.ui.Cells.v9 v9Var2 = oa0Var3.W;
                                            messagePreviewParams5.quote = org.telegram.ui.gn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, wa0Var4.c(v9Var2 != null ? ((org.telegram.ui.Cells.t1) v9Var2).getMessageObject() : null));
                                            cb0Var3.b();
                                            cb0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    wa0Var4.f();
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
                                cb0 cb0Var4 = this.b.V;
                                if (!cb0Var4.b) {
                                    org.telegram.ui.wk wkVar = (org.telegram.ui.wk) cb0Var4;
                                    wkVar.a(true);
                                    org.telegram.ui.qn qnVar = wkVar.D;
                                    qnVar.j5 = null;
                                    qnVar.h5 = null;
                                    qnVar.b5.updateReply(null, null, qnVar.P5, null);
                                    qnVar.j8();
                                    break;
                                } else {
                                    org.telegram.ui.wk wkVar2 = (org.telegram.ui.wk) cb0Var4;
                                    wkVar2.a(true);
                                    org.telegram.ui.qn qnVar2 = wkVar2.D;
                                    qnVar2.h5 = null;
                                    qnVar2.Bb(qnVar2.j5);
                                    break;
                                }
                            case 7:
                                this.b.V.c(true);
                                break;
                            case 8:
                                this.b.V.a(true);
                                break;
                            case 9:
                                org.telegram.ui.wk wkVar3 = (org.telegram.ui.wk) this.b.V;
                                wkVar3.a(true);
                                org.telegram.ui.qn qnVar3 = wkVar3.D;
                                qnVar3.b5.updateForward(null, qnVar3.P5);
                                qnVar3.j8();
                                break;
                            case 10:
                                this.b.V.a(true);
                                break;
                            case 11:
                                org.telegram.ui.wk wkVar4 = (org.telegram.ui.wk) this.b.V;
                                wkVar4.a(true);
                                org.telegram.ui.qn qnVar4 = wkVar4.D;
                                qnVar4.C5 = null;
                                org.telegram.ui.ak akVar = qnVar4.U;
                                if (akVar != null) {
                                    akVar.S2 = null;
                                    akVar.T2 = false;
                                }
                                MessagePreviewParams messagePreviewParams6 = qnVar4.b5;
                                if (messagePreviewParams6 != null) {
                                    i162 = ((org.telegram.ui.ActionBar.o2) qnVar4).currentAccount;
                                    MessageObject messageObject = qnVar4.j5;
                                    messagePreviewParams6.updateLink(i162, null, null, messageObject == qnVar4.T3 ? null : messageObject, qnVar4.h5, qnVar4.l5);
                                }
                                qnVar4.j8();
                                break;
                            case 12:
                                wa0 wa0Var5 = this.b;
                                MessagePreviewParams messagePreviewParams7 = wa0Var5.V.d;
                                if (messagePreviewParams7.hasMedia) {
                                    boolean z14 = !messagePreviewParams7.webpageSmall;
                                    messagePreviewParams7.webpageSmall = z14;
                                    wa0Var5.C.a(z14, true);
                                    wa0Var5.D.a(messagePreviewParams7.webpageSmall, true);
                                    if (wa0Var5.r.messages.size() > 0 && (message2 = wa0Var5.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z15 = messagePreviewParams7.webpageSmall;
                                        messageMedia2.force_small_media = z15;
                                        messageMedia2.force_large_media = !z15;
                                    }
                                    if (wa0Var5.r.previewMessages.size() > 0 && (message = wa0Var5.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z16 = messagePreviewParams7.webpageSmall;
                                        messageMedia.force_small_media = z16;
                                        messageMedia.force_large_media = !z16;
                                    }
                                    wa0Var5.h();
                                    wa0Var5.Q = true;
                                    break;
                                }
                                break;
                            default:
                                wa0 wa0Var6 = this.b;
                                MessagePreviewParams messagePreviewParams8 = wa0Var6.V.d;
                                boolean z17 = messagePreviewParams8.webpageTop;
                                messagePreviewParams8.webpageTop = !z17;
                                wa0Var6.A.a(z17, true);
                                if (wa0Var6.r.messages.size() > 0 && (message4 = wa0Var6.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams8.webpageTop;
                                }
                                if (wa0Var6.r.previewMessages.size() > 0 && (message3 = wa0Var6.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams8.webpageTop;
                                }
                                wa0Var6.h();
                                wa0Var6.Q = true;
                                break;
                        }
                    }
                });
                g1Var3.g(LocaleController.getString(R.string.ChangeRecipient), R.drawable.msg_forward_replace, null);
                this.s.a(g1Var3, g7.e6.n(-1, 48));
                org.telegram.ui.ActionBar.l1 l1Var2 = new org.telegram.ui.ActionBar.l1(context, ya0Var);
                l1Var2.setColor(org.telegram.ui.ActionBar.f6.l1(0.06f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.E8, ya0Var)));
                l1Var2.setTag(R.id.fit_width_tag, 1);
                final int i22 = 8;
                this.s.a(l1Var2, g7.e6.n(-1, 8));
                org.telegram.ui.ActionBar.g1 g1Var4 = new org.telegram.ui.ActionBar.g1(1, context, cb0Var.B, false, false);
                g1Var4.g(LocaleController.getString(R.string.ApplyChanges), R.drawable.msg_select, null);
                g1Var4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ga0
                    public final /* synthetic */ wa0 b;

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
                                wa0 wa0Var2 = this.b;
                                wa0Var2.V.d.quote = null;
                                wa0Var2.e.f(false);
                                wa0Var2.g(false, false);
                                wa0Var2.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                wa0 wa0Var3 = this.b;
                                oa0 oa0Var2 = wa0Var3.e;
                                cb0 cb0Var2 = wa0Var3.V;
                                if (wa0Var3.c(null) != null) {
                                    if (oa0Var2.v - oa0Var2.u <= MessagesController.getInstance(cb0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.v9 v9Var = oa0Var2.W;
                                        MessageObject c11 = wa0Var3.c(v9Var != null ? ((org.telegram.ui.Cells.t1) v9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams4 = cb0Var2.d;
                                        int i172 = oa0Var2.u;
                                        messagePreviewParams4.quoteStart = i172;
                                        int i182 = oa0Var2.v;
                                        messagePreviewParams4.quoteEnd = i182;
                                        messagePreviewParams4.quote = org.telegram.ui.gn.b(i172, i182, c11);
                                        cb0Var2.b();
                                        cb0Var2.a(true);
                                        break;
                                    } else {
                                        wa0Var3.f();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                wa0 wa0Var4 = this.b;
                                oa0 oa0Var3 = wa0Var4.e;
                                cb0 cb0Var3 = wa0Var4.V;
                                MessagePreviewParams messagePreviewParams5 = cb0Var3.d;
                                int i192 = cb0Var3.w;
                                boolean z13 = cb0Var3.b;
                                if (messagePreviewParams5.quote != null && !z13) {
                                    messagePreviewParams5.quote = null;
                                    oa0Var3.f(false);
                                    wa0Var4.g(false, true);
                                    wa0Var4.k(true);
                                    break;
                                } else if (oa0Var3.v - oa0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                    MessageObject c12 = wa0Var4.c(null);
                                    if (c12 != null) {
                                        if (!oa0Var3.y()) {
                                            messagePreviewParams5.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                            messagePreviewParams5.quoteEnd = min;
                                            messagePreviewParams5.quote = org.telegram.ui.gn.b(messagePreviewParams5.quoteStart, min, c12);
                                            View d9 = wa0Var4.d();
                                            if (d9 instanceof org.telegram.ui.Cells.t1) {
                                                oa0Var3.a0((org.telegram.ui.Cells.t1) d9, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            }
                                            if (!z13) {
                                                wa0Var4.s.getSwipeBack().e(wa0Var4.E);
                                            }
                                            wa0Var4.g(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams5.quoteStart = oa0Var3.u;
                                            messagePreviewParams5.quoteEnd = oa0Var3.v;
                                            org.telegram.ui.Cells.v9 v9Var2 = oa0Var3.W;
                                            messagePreviewParams5.quote = org.telegram.ui.gn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, wa0Var4.c(v9Var2 != null ? ((org.telegram.ui.Cells.t1) v9Var2).getMessageObject() : null));
                                            cb0Var3.b();
                                            cb0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    wa0Var4.f();
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
                                cb0 cb0Var4 = this.b.V;
                                if (!cb0Var4.b) {
                                    org.telegram.ui.wk wkVar = (org.telegram.ui.wk) cb0Var4;
                                    wkVar.a(true);
                                    org.telegram.ui.qn qnVar = wkVar.D;
                                    qnVar.j5 = null;
                                    qnVar.h5 = null;
                                    qnVar.b5.updateReply(null, null, qnVar.P5, null);
                                    qnVar.j8();
                                    break;
                                } else {
                                    org.telegram.ui.wk wkVar2 = (org.telegram.ui.wk) cb0Var4;
                                    wkVar2.a(true);
                                    org.telegram.ui.qn qnVar2 = wkVar2.D;
                                    qnVar2.h5 = null;
                                    qnVar2.Bb(qnVar2.j5);
                                    break;
                                }
                            case 7:
                                this.b.V.c(true);
                                break;
                            case 8:
                                this.b.V.a(true);
                                break;
                            case 9:
                                org.telegram.ui.wk wkVar3 = (org.telegram.ui.wk) this.b.V;
                                wkVar3.a(true);
                                org.telegram.ui.qn qnVar3 = wkVar3.D;
                                qnVar3.b5.updateForward(null, qnVar3.P5);
                                qnVar3.j8();
                                break;
                            case 10:
                                this.b.V.a(true);
                                break;
                            case 11:
                                org.telegram.ui.wk wkVar4 = (org.telegram.ui.wk) this.b.V;
                                wkVar4.a(true);
                                org.telegram.ui.qn qnVar4 = wkVar4.D;
                                qnVar4.C5 = null;
                                org.telegram.ui.ak akVar = qnVar4.U;
                                if (akVar != null) {
                                    akVar.S2 = null;
                                    akVar.T2 = false;
                                }
                                MessagePreviewParams messagePreviewParams6 = qnVar4.b5;
                                if (messagePreviewParams6 != null) {
                                    i162 = ((org.telegram.ui.ActionBar.o2) qnVar4).currentAccount;
                                    MessageObject messageObject = qnVar4.j5;
                                    messagePreviewParams6.updateLink(i162, null, null, messageObject == qnVar4.T3 ? null : messageObject, qnVar4.h5, qnVar4.l5);
                                }
                                qnVar4.j8();
                                break;
                            case 12:
                                wa0 wa0Var5 = this.b;
                                MessagePreviewParams messagePreviewParams7 = wa0Var5.V.d;
                                if (messagePreviewParams7.hasMedia) {
                                    boolean z14 = !messagePreviewParams7.webpageSmall;
                                    messagePreviewParams7.webpageSmall = z14;
                                    wa0Var5.C.a(z14, true);
                                    wa0Var5.D.a(messagePreviewParams7.webpageSmall, true);
                                    if (wa0Var5.r.messages.size() > 0 && (message2 = wa0Var5.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z15 = messagePreviewParams7.webpageSmall;
                                        messageMedia2.force_small_media = z15;
                                        messageMedia2.force_large_media = !z15;
                                    }
                                    if (wa0Var5.r.previewMessages.size() > 0 && (message = wa0Var5.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z16 = messagePreviewParams7.webpageSmall;
                                        messageMedia.force_small_media = z16;
                                        messageMedia.force_large_media = !z16;
                                    }
                                    wa0Var5.h();
                                    wa0Var5.Q = true;
                                    break;
                                }
                                break;
                            default:
                                wa0 wa0Var6 = this.b;
                                MessagePreviewParams messagePreviewParams8 = wa0Var6.V.d;
                                boolean z17 = messagePreviewParams8.webpageTop;
                                messagePreviewParams8.webpageTop = !z17;
                                wa0Var6.A.a(z17, true);
                                if (wa0Var6.r.messages.size() > 0 && (message4 = wa0Var6.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams8.webpageTop;
                                }
                                if (wa0Var6.r.previewMessages.size() > 0 && (message3 = wa0Var6.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams8.webpageTop;
                                }
                                wa0Var6.h();
                                wa0Var6.Q = true;
                                break;
                        }
                    }
                });
                this.s.a(g1Var4, g7.e6.n(-1, 48));
                org.telegram.ui.ActionBar.g1 g1Var5 = new org.telegram.ui.ActionBar.g1(1, context, cb0Var.B, false, true);
                g1Var5.g(LocaleController.getString(R.string.DoNotForward), R.drawable.msg_delete, null);
                int v03 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.q7, ya0Var);
                int i23 = org.telegram.ui.ActionBar.f6.p7;
                g1Var5.c(v03, org.telegram.ui.ActionBar.f6.v0(i23, ya0Var));
                final int i24 = 9;
                g1Var5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ga0
                    public final /* synthetic */ wa0 b;

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
                                wa0 wa0Var2 = this.b;
                                wa0Var2.V.d.quote = null;
                                wa0Var2.e.f(false);
                                wa0Var2.g(false, false);
                                wa0Var2.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                wa0 wa0Var3 = this.b;
                                oa0 oa0Var2 = wa0Var3.e;
                                cb0 cb0Var2 = wa0Var3.V;
                                if (wa0Var3.c(null) != null) {
                                    if (oa0Var2.v - oa0Var2.u <= MessagesController.getInstance(cb0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.v9 v9Var = oa0Var2.W;
                                        MessageObject c11 = wa0Var3.c(v9Var != null ? ((org.telegram.ui.Cells.t1) v9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams4 = cb0Var2.d;
                                        int i172 = oa0Var2.u;
                                        messagePreviewParams4.quoteStart = i172;
                                        int i182 = oa0Var2.v;
                                        messagePreviewParams4.quoteEnd = i182;
                                        messagePreviewParams4.quote = org.telegram.ui.gn.b(i172, i182, c11);
                                        cb0Var2.b();
                                        cb0Var2.a(true);
                                        break;
                                    } else {
                                        wa0Var3.f();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                wa0 wa0Var4 = this.b;
                                oa0 oa0Var3 = wa0Var4.e;
                                cb0 cb0Var3 = wa0Var4.V;
                                MessagePreviewParams messagePreviewParams5 = cb0Var3.d;
                                int i192 = cb0Var3.w;
                                boolean z13 = cb0Var3.b;
                                if (messagePreviewParams5.quote != null && !z13) {
                                    messagePreviewParams5.quote = null;
                                    oa0Var3.f(false);
                                    wa0Var4.g(false, true);
                                    wa0Var4.k(true);
                                    break;
                                } else if (oa0Var3.v - oa0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                    MessageObject c12 = wa0Var4.c(null);
                                    if (c12 != null) {
                                        if (!oa0Var3.y()) {
                                            messagePreviewParams5.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                            messagePreviewParams5.quoteEnd = min;
                                            messagePreviewParams5.quote = org.telegram.ui.gn.b(messagePreviewParams5.quoteStart, min, c12);
                                            View d9 = wa0Var4.d();
                                            if (d9 instanceof org.telegram.ui.Cells.t1) {
                                                oa0Var3.a0((org.telegram.ui.Cells.t1) d9, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            }
                                            if (!z13) {
                                                wa0Var4.s.getSwipeBack().e(wa0Var4.E);
                                            }
                                            wa0Var4.g(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams5.quoteStart = oa0Var3.u;
                                            messagePreviewParams5.quoteEnd = oa0Var3.v;
                                            org.telegram.ui.Cells.v9 v9Var2 = oa0Var3.W;
                                            messagePreviewParams5.quote = org.telegram.ui.gn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, wa0Var4.c(v9Var2 != null ? ((org.telegram.ui.Cells.t1) v9Var2).getMessageObject() : null));
                                            cb0Var3.b();
                                            cb0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    wa0Var4.f();
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
                                cb0 cb0Var4 = this.b.V;
                                if (!cb0Var4.b) {
                                    org.telegram.ui.wk wkVar = (org.telegram.ui.wk) cb0Var4;
                                    wkVar.a(true);
                                    org.telegram.ui.qn qnVar = wkVar.D;
                                    qnVar.j5 = null;
                                    qnVar.h5 = null;
                                    qnVar.b5.updateReply(null, null, qnVar.P5, null);
                                    qnVar.j8();
                                    break;
                                } else {
                                    org.telegram.ui.wk wkVar2 = (org.telegram.ui.wk) cb0Var4;
                                    wkVar2.a(true);
                                    org.telegram.ui.qn qnVar2 = wkVar2.D;
                                    qnVar2.h5 = null;
                                    qnVar2.Bb(qnVar2.j5);
                                    break;
                                }
                            case 7:
                                this.b.V.c(true);
                                break;
                            case 8:
                                this.b.V.a(true);
                                break;
                            case 9:
                                org.telegram.ui.wk wkVar3 = (org.telegram.ui.wk) this.b.V;
                                wkVar3.a(true);
                                org.telegram.ui.qn qnVar3 = wkVar3.D;
                                qnVar3.b5.updateForward(null, qnVar3.P5);
                                qnVar3.j8();
                                break;
                            case 10:
                                this.b.V.a(true);
                                break;
                            case 11:
                                org.telegram.ui.wk wkVar4 = (org.telegram.ui.wk) this.b.V;
                                wkVar4.a(true);
                                org.telegram.ui.qn qnVar4 = wkVar4.D;
                                qnVar4.C5 = null;
                                org.telegram.ui.ak akVar = qnVar4.U;
                                if (akVar != null) {
                                    akVar.S2 = null;
                                    akVar.T2 = false;
                                }
                                MessagePreviewParams messagePreviewParams6 = qnVar4.b5;
                                if (messagePreviewParams6 != null) {
                                    i162 = ((org.telegram.ui.ActionBar.o2) qnVar4).currentAccount;
                                    MessageObject messageObject = qnVar4.j5;
                                    messagePreviewParams6.updateLink(i162, null, null, messageObject == qnVar4.T3 ? null : messageObject, qnVar4.h5, qnVar4.l5);
                                }
                                qnVar4.j8();
                                break;
                            case 12:
                                wa0 wa0Var5 = this.b;
                                MessagePreviewParams messagePreviewParams7 = wa0Var5.V.d;
                                if (messagePreviewParams7.hasMedia) {
                                    boolean z14 = !messagePreviewParams7.webpageSmall;
                                    messagePreviewParams7.webpageSmall = z14;
                                    wa0Var5.C.a(z14, true);
                                    wa0Var5.D.a(messagePreviewParams7.webpageSmall, true);
                                    if (wa0Var5.r.messages.size() > 0 && (message2 = wa0Var5.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z15 = messagePreviewParams7.webpageSmall;
                                        messageMedia2.force_small_media = z15;
                                        messageMedia2.force_large_media = !z15;
                                    }
                                    if (wa0Var5.r.previewMessages.size() > 0 && (message = wa0Var5.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z16 = messagePreviewParams7.webpageSmall;
                                        messageMedia.force_small_media = z16;
                                        messageMedia.force_large_media = !z16;
                                    }
                                    wa0Var5.h();
                                    wa0Var5.Q = true;
                                    break;
                                }
                                break;
                            default:
                                wa0 wa0Var6 = this.b;
                                MessagePreviewParams messagePreviewParams8 = wa0Var6.V.d;
                                boolean z17 = messagePreviewParams8.webpageTop;
                                messagePreviewParams8.webpageTop = !z17;
                                wa0Var6.A.a(z17, true);
                                if (wa0Var6.r.messages.size() > 0 && (message4 = wa0Var6.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams8.webpageTop;
                                }
                                if (wa0Var6.r.previewMessages.size() > 0 && (message3 = wa0Var6.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams8.webpageTop;
                                }
                                wa0Var6.h();
                                wa0Var6.Q = true;
                                break;
                        }
                    }
                });
                g1Var5.setSelectorColor(org.telegram.ui.ActionBar.f6.l1(0.12f, org.telegram.ui.ActionBar.f6.w0(null, i23, false)));
                this.s.a(g1Var5, g7.e6.n(-1, 48));
                bb0 bb0Var8 = bb0Var;
                bb0Var8.a(messagePreviewParams.hideForwardSendersName, false);
                bb0 bb0Var9 = bb0Var2;
                wa0Var = this;
                bb0Var8.setOnClickListener(new fh.j3(this, z10, context, bb0Var9, bb0Var8, 1));
                if (bb0Var9 != null) {
                    bb0Var9.setOnClickListener(new fg.f(wa0Var, bb0Var9, bb0Var8, 29));
                }
            }
            context2 = context;
        } else {
            if (!messages.hasText || messagePreviewParams3.isSecret) {
                f10 = 48.0f;
                messagePreviewParams = messagePreviewParams3;
            } else {
                LinearLayout f11 = org.telegram.messenger.ll.f(context3, 1);
                if (z12) {
                    linearLayout = f11;
                    messagePreviewParams2 = messagePreviewParams3;
                    z11 = true;
                } else {
                    ?? r92 = f11;
                    messagePreviewParams2 = messagePreviewParams3;
                    org.telegram.ui.ActionBar.g1 g1Var6 = new org.telegram.ui.ActionBar.g1(0, context3, cb0Var.B, true, false);
                    g1Var6.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                    g1Var6.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ga0
                        public final /* synthetic */ wa0 b;

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
                                    wa0 wa0Var2 = this.b;
                                    wa0Var2.V.d.quote = null;
                                    wa0Var2.e.f(false);
                                    wa0Var2.g(false, false);
                                    wa0Var2.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    wa0 wa0Var3 = this.b;
                                    oa0 oa0Var2 = wa0Var3.e;
                                    cb0 cb0Var2 = wa0Var3.V;
                                    if (wa0Var3.c(null) != null) {
                                        if (oa0Var2.v - oa0Var2.u <= MessagesController.getInstance(cb0Var2.w).quoteLengthMax) {
                                            org.telegram.ui.Cells.v9 v9Var = oa0Var2.W;
                                            MessageObject c11 = wa0Var3.c(v9Var != null ? ((org.telegram.ui.Cells.t1) v9Var).getMessageObject() : null);
                                            MessagePreviewParams messagePreviewParams4 = cb0Var2.d;
                                            int i172 = oa0Var2.u;
                                            messagePreviewParams4.quoteStart = i172;
                                            int i182 = oa0Var2.v;
                                            messagePreviewParams4.quoteEnd = i182;
                                            messagePreviewParams4.quote = org.telegram.ui.gn.b(i172, i182, c11);
                                            cb0Var2.b();
                                            cb0Var2.a(true);
                                            break;
                                        } else {
                                            wa0Var3.f();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    wa0 wa0Var4 = this.b;
                                    oa0 oa0Var3 = wa0Var4.e;
                                    cb0 cb0Var3 = wa0Var4.V;
                                    MessagePreviewParams messagePreviewParams5 = cb0Var3.d;
                                    int i192 = cb0Var3.w;
                                    boolean z13 = cb0Var3.b;
                                    if (messagePreviewParams5.quote != null && !z13) {
                                        messagePreviewParams5.quote = null;
                                        oa0Var3.f(false);
                                        wa0Var4.g(false, true);
                                        wa0Var4.k(true);
                                        break;
                                    } else if (oa0Var3.v - oa0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                        MessageObject c12 = wa0Var4.c(null);
                                        if (c12 != null) {
                                            if (!oa0Var3.y()) {
                                                messagePreviewParams5.quoteStart = 0;
                                                int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                                messagePreviewParams5.quoteEnd = min;
                                                messagePreviewParams5.quote = org.telegram.ui.gn.b(messagePreviewParams5.quoteStart, min, c12);
                                                View d9 = wa0Var4.d();
                                                if (d9 instanceof org.telegram.ui.Cells.t1) {
                                                    oa0Var3.a0((org.telegram.ui.Cells.t1) d9, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                }
                                                if (!z13) {
                                                    wa0Var4.s.getSwipeBack().e(wa0Var4.E);
                                                }
                                                wa0Var4.g(true, true);
                                                break;
                                            } else {
                                                messagePreviewParams5.quoteStart = oa0Var3.u;
                                                messagePreviewParams5.quoteEnd = oa0Var3.v;
                                                org.telegram.ui.Cells.v9 v9Var2 = oa0Var3.W;
                                                messagePreviewParams5.quote = org.telegram.ui.gn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, wa0Var4.c(v9Var2 != null ? ((org.telegram.ui.Cells.t1) v9Var2).getMessageObject() : null));
                                                cb0Var3.b();
                                                cb0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        wa0Var4.f();
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
                                    cb0 cb0Var4 = this.b.V;
                                    if (!cb0Var4.b) {
                                        org.telegram.ui.wk wkVar = (org.telegram.ui.wk) cb0Var4;
                                        wkVar.a(true);
                                        org.telegram.ui.qn qnVar = wkVar.D;
                                        qnVar.j5 = null;
                                        qnVar.h5 = null;
                                        qnVar.b5.updateReply(null, null, qnVar.P5, null);
                                        qnVar.j8();
                                        break;
                                    } else {
                                        org.telegram.ui.wk wkVar2 = (org.telegram.ui.wk) cb0Var4;
                                        wkVar2.a(true);
                                        org.telegram.ui.qn qnVar2 = wkVar2.D;
                                        qnVar2.h5 = null;
                                        qnVar2.Bb(qnVar2.j5);
                                        break;
                                    }
                                case 7:
                                    this.b.V.c(true);
                                    break;
                                case 8:
                                    this.b.V.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.wk wkVar3 = (org.telegram.ui.wk) this.b.V;
                                    wkVar3.a(true);
                                    org.telegram.ui.qn qnVar3 = wkVar3.D;
                                    qnVar3.b5.updateForward(null, qnVar3.P5);
                                    qnVar3.j8();
                                    break;
                                case 10:
                                    this.b.V.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.wk wkVar4 = (org.telegram.ui.wk) this.b.V;
                                    wkVar4.a(true);
                                    org.telegram.ui.qn qnVar4 = wkVar4.D;
                                    qnVar4.C5 = null;
                                    org.telegram.ui.ak akVar = qnVar4.U;
                                    if (akVar != null) {
                                        akVar.S2 = null;
                                        akVar.T2 = false;
                                    }
                                    MessagePreviewParams messagePreviewParams6 = qnVar4.b5;
                                    if (messagePreviewParams6 != null) {
                                        i162 = ((org.telegram.ui.ActionBar.o2) qnVar4).currentAccount;
                                        MessageObject messageObject = qnVar4.j5;
                                        messagePreviewParams6.updateLink(i162, null, null, messageObject == qnVar4.T3 ? null : messageObject, qnVar4.h5, qnVar4.l5);
                                    }
                                    qnVar4.j8();
                                    break;
                                case 12:
                                    wa0 wa0Var5 = this.b;
                                    MessagePreviewParams messagePreviewParams7 = wa0Var5.V.d;
                                    if (messagePreviewParams7.hasMedia) {
                                        boolean z14 = !messagePreviewParams7.webpageSmall;
                                        messagePreviewParams7.webpageSmall = z14;
                                        wa0Var5.C.a(z14, true);
                                        wa0Var5.D.a(messagePreviewParams7.webpageSmall, true);
                                        if (wa0Var5.r.messages.size() > 0 && (message2 = wa0Var5.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z15 = messagePreviewParams7.webpageSmall;
                                            messageMedia2.force_small_media = z15;
                                            messageMedia2.force_large_media = !z15;
                                        }
                                        if (wa0Var5.r.previewMessages.size() > 0 && (message = wa0Var5.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                            boolean z16 = messagePreviewParams7.webpageSmall;
                                            messageMedia.force_small_media = z16;
                                            messageMedia.force_large_media = !z16;
                                        }
                                        wa0Var5.h();
                                        wa0Var5.Q = true;
                                        break;
                                    }
                                    break;
                                default:
                                    wa0 wa0Var6 = this.b;
                                    MessagePreviewParams messagePreviewParams8 = wa0Var6.V.d;
                                    boolean z17 = messagePreviewParams8.webpageTop;
                                    messagePreviewParams8.webpageTop = !z17;
                                    wa0Var6.A.a(z17, true);
                                    if (wa0Var6.r.messages.size() > 0 && (message4 = wa0Var6.r.messages.get(0).messageOwner) != null) {
                                        message4.invert_media = messagePreviewParams8.webpageTop;
                                    }
                                    if (wa0Var6.r.previewMessages.size() > 0 && (message3 = wa0Var6.r.previewMessages.get(0).messageOwner) != null) {
                                        message3.invert_media = messagePreviewParams8.webpageTop;
                                    }
                                    wa0Var6.h();
                                    wa0Var6.Q = true;
                                    break;
                            }
                        }
                    });
                    r92.addView(g1Var6, g7.e6.n(-1, 48));
                    org.telegram.ui.ActionBar.l1 l1Var3 = new org.telegram.ui.ActionBar.l1(context3, ya0Var);
                    l1Var3.setColor(org.telegram.ui.ActionBar.f6.l1(0.06f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.E8, ya0Var)));
                    l1Var3.setTag(R.id.fit_width_tag, 1);
                    r92.addView(l1Var3, g7.e6.n(-1, 8));
                    org.telegram.ui.ActionBar.g1 g1Var7 = new org.telegram.ui.ActionBar.g1(0, context3, cb0Var.B, false, true);
                    g1Var7.g(LocaleController.getString(R.string.QuoteSelectedPart), R.drawable.menu_quote_specific, null);
                    z11 = true;
                    final boolean z13 = true ? 1 : 0;
                    g1Var7.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ga0
                        public final /* synthetic */ wa0 b;

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
                                    wa0 wa0Var2 = this.b;
                                    wa0Var2.V.d.quote = null;
                                    wa0Var2.e.f(false);
                                    wa0Var2.g(false, false);
                                    wa0Var2.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    wa0 wa0Var3 = this.b;
                                    oa0 oa0Var2 = wa0Var3.e;
                                    cb0 cb0Var2 = wa0Var3.V;
                                    if (wa0Var3.c(null) != null) {
                                        if (oa0Var2.v - oa0Var2.u <= MessagesController.getInstance(cb0Var2.w).quoteLengthMax) {
                                            org.telegram.ui.Cells.v9 v9Var = oa0Var2.W;
                                            MessageObject c11 = wa0Var3.c(v9Var != null ? ((org.telegram.ui.Cells.t1) v9Var).getMessageObject() : null);
                                            MessagePreviewParams messagePreviewParams4 = cb0Var2.d;
                                            int i172 = oa0Var2.u;
                                            messagePreviewParams4.quoteStart = i172;
                                            int i182 = oa0Var2.v;
                                            messagePreviewParams4.quoteEnd = i182;
                                            messagePreviewParams4.quote = org.telegram.ui.gn.b(i172, i182, c11);
                                            cb0Var2.b();
                                            cb0Var2.a(true);
                                            break;
                                        } else {
                                            wa0Var3.f();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    wa0 wa0Var4 = this.b;
                                    oa0 oa0Var3 = wa0Var4.e;
                                    cb0 cb0Var3 = wa0Var4.V;
                                    MessagePreviewParams messagePreviewParams5 = cb0Var3.d;
                                    int i192 = cb0Var3.w;
                                    boolean z132 = cb0Var3.b;
                                    if (messagePreviewParams5.quote != null && !z132) {
                                        messagePreviewParams5.quote = null;
                                        oa0Var3.f(false);
                                        wa0Var4.g(false, true);
                                        wa0Var4.k(true);
                                        break;
                                    } else if (oa0Var3.v - oa0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                        MessageObject c12 = wa0Var4.c(null);
                                        if (c12 != null) {
                                            if (!oa0Var3.y()) {
                                                messagePreviewParams5.quoteStart = 0;
                                                int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                                messagePreviewParams5.quoteEnd = min;
                                                messagePreviewParams5.quote = org.telegram.ui.gn.b(messagePreviewParams5.quoteStart, min, c12);
                                                View d9 = wa0Var4.d();
                                                if (d9 instanceof org.telegram.ui.Cells.t1) {
                                                    oa0Var3.a0((org.telegram.ui.Cells.t1) d9, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                }
                                                if (!z132) {
                                                    wa0Var4.s.getSwipeBack().e(wa0Var4.E);
                                                }
                                                wa0Var4.g(true, true);
                                                break;
                                            } else {
                                                messagePreviewParams5.quoteStart = oa0Var3.u;
                                                messagePreviewParams5.quoteEnd = oa0Var3.v;
                                                org.telegram.ui.Cells.v9 v9Var2 = oa0Var3.W;
                                                messagePreviewParams5.quote = org.telegram.ui.gn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, wa0Var4.c(v9Var2 != null ? ((org.telegram.ui.Cells.t1) v9Var2).getMessageObject() : null));
                                                cb0Var3.b();
                                                cb0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        wa0Var4.f();
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
                                    cb0 cb0Var4 = this.b.V;
                                    if (!cb0Var4.b) {
                                        org.telegram.ui.wk wkVar = (org.telegram.ui.wk) cb0Var4;
                                        wkVar.a(true);
                                        org.telegram.ui.qn qnVar = wkVar.D;
                                        qnVar.j5 = null;
                                        qnVar.h5 = null;
                                        qnVar.b5.updateReply(null, null, qnVar.P5, null);
                                        qnVar.j8();
                                        break;
                                    } else {
                                        org.telegram.ui.wk wkVar2 = (org.telegram.ui.wk) cb0Var4;
                                        wkVar2.a(true);
                                        org.telegram.ui.qn qnVar2 = wkVar2.D;
                                        qnVar2.h5 = null;
                                        qnVar2.Bb(qnVar2.j5);
                                        break;
                                    }
                                case 7:
                                    this.b.V.c(true);
                                    break;
                                case 8:
                                    this.b.V.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.wk wkVar3 = (org.telegram.ui.wk) this.b.V;
                                    wkVar3.a(true);
                                    org.telegram.ui.qn qnVar3 = wkVar3.D;
                                    qnVar3.b5.updateForward(null, qnVar3.P5);
                                    qnVar3.j8();
                                    break;
                                case 10:
                                    this.b.V.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.wk wkVar4 = (org.telegram.ui.wk) this.b.V;
                                    wkVar4.a(true);
                                    org.telegram.ui.qn qnVar4 = wkVar4.D;
                                    qnVar4.C5 = null;
                                    org.telegram.ui.ak akVar = qnVar4.U;
                                    if (akVar != null) {
                                        akVar.S2 = null;
                                        akVar.T2 = false;
                                    }
                                    MessagePreviewParams messagePreviewParams6 = qnVar4.b5;
                                    if (messagePreviewParams6 != null) {
                                        i162 = ((org.telegram.ui.ActionBar.o2) qnVar4).currentAccount;
                                        MessageObject messageObject = qnVar4.j5;
                                        messagePreviewParams6.updateLink(i162, null, null, messageObject == qnVar4.T3 ? null : messageObject, qnVar4.h5, qnVar4.l5);
                                    }
                                    qnVar4.j8();
                                    break;
                                case 12:
                                    wa0 wa0Var5 = this.b;
                                    MessagePreviewParams messagePreviewParams7 = wa0Var5.V.d;
                                    if (messagePreviewParams7.hasMedia) {
                                        boolean z14 = !messagePreviewParams7.webpageSmall;
                                        messagePreviewParams7.webpageSmall = z14;
                                        wa0Var5.C.a(z14, true);
                                        wa0Var5.D.a(messagePreviewParams7.webpageSmall, true);
                                        if (wa0Var5.r.messages.size() > 0 && (message2 = wa0Var5.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z15 = messagePreviewParams7.webpageSmall;
                                            messageMedia2.force_small_media = z15;
                                            messageMedia2.force_large_media = !z15;
                                        }
                                        if (wa0Var5.r.previewMessages.size() > 0 && (message = wa0Var5.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                            boolean z16 = messagePreviewParams7.webpageSmall;
                                            messageMedia.force_small_media = z16;
                                            messageMedia.force_large_media = !z16;
                                        }
                                        wa0Var5.h();
                                        wa0Var5.Q = true;
                                        break;
                                    }
                                    break;
                                default:
                                    wa0 wa0Var6 = this.b;
                                    MessagePreviewParams messagePreviewParams8 = wa0Var6.V.d;
                                    boolean z17 = messagePreviewParams8.webpageTop;
                                    messagePreviewParams8.webpageTop = !z17;
                                    wa0Var6.A.a(z17, true);
                                    if (wa0Var6.r.messages.size() > 0 && (message4 = wa0Var6.r.messages.get(0).messageOwner) != null) {
                                        message4.invert_media = messagePreviewParams8.webpageTop;
                                    }
                                    if (wa0Var6.r.previewMessages.size() > 0 && (message3 = wa0Var6.r.previewMessages.get(0).messageOwner) != null) {
                                        message3.invert_media = messagePreviewParams8.webpageTop;
                                    }
                                    wa0Var6.h();
                                    wa0Var6.Q = true;
                                    break;
                            }
                        }
                    });
                    r92.addView(g1Var7, g7.e6.n(-1, 48));
                    linearLayout = r92;
                }
                this.E = actionBarPopupWindow$ActionBarPopupWindowLayout.b(linearLayout);
                actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().setStickToRight(z11);
                FrameLayout frameLayout2 = new FrameLayout(context3);
                na0 na0Var = new na0(1, 0, context, cb0Var.B, true, false);
                this.v = na0Var;
                na0Var.g(LocaleController.getString(z12 ? R.string.QuoteSelectedPart : R.string.SelectSpecificQuote), R.drawable.menu_select_quote, null);
                na0 na0Var2 = new na0(1, 1, context, cb0Var.B, true, false);
                context3 = context;
                this.w = na0Var2;
                na0Var2.g(LocaleController.getString(R.string.ClearQuote), R.drawable.menu_quote_delete, null);
                frameLayout2.setBackground(org.telegram.ui.ActionBar.f6.Y(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.I5, ya0Var), 6, 0));
                final int i25 = 2;
                frameLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ga0
                    public final /* synthetic */ wa0 b;

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
                                wa0 wa0Var2 = this.b;
                                wa0Var2.V.d.quote = null;
                                wa0Var2.e.f(false);
                                wa0Var2.g(false, false);
                                wa0Var2.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                wa0 wa0Var3 = this.b;
                                oa0 oa0Var2 = wa0Var3.e;
                                cb0 cb0Var2 = wa0Var3.V;
                                if (wa0Var3.c(null) != null) {
                                    if (oa0Var2.v - oa0Var2.u <= MessagesController.getInstance(cb0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.v9 v9Var = oa0Var2.W;
                                        MessageObject c11 = wa0Var3.c(v9Var != null ? ((org.telegram.ui.Cells.t1) v9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams4 = cb0Var2.d;
                                        int i172 = oa0Var2.u;
                                        messagePreviewParams4.quoteStart = i172;
                                        int i182 = oa0Var2.v;
                                        messagePreviewParams4.quoteEnd = i182;
                                        messagePreviewParams4.quote = org.telegram.ui.gn.b(i172, i182, c11);
                                        cb0Var2.b();
                                        cb0Var2.a(true);
                                        break;
                                    } else {
                                        wa0Var3.f();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                wa0 wa0Var4 = this.b;
                                oa0 oa0Var3 = wa0Var4.e;
                                cb0 cb0Var3 = wa0Var4.V;
                                MessagePreviewParams messagePreviewParams5 = cb0Var3.d;
                                int i192 = cb0Var3.w;
                                boolean z132 = cb0Var3.b;
                                if (messagePreviewParams5.quote != null && !z132) {
                                    messagePreviewParams5.quote = null;
                                    oa0Var3.f(false);
                                    wa0Var4.g(false, true);
                                    wa0Var4.k(true);
                                    break;
                                } else if (oa0Var3.v - oa0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                    MessageObject c12 = wa0Var4.c(null);
                                    if (c12 != null) {
                                        if (!oa0Var3.y()) {
                                            messagePreviewParams5.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                            messagePreviewParams5.quoteEnd = min;
                                            messagePreviewParams5.quote = org.telegram.ui.gn.b(messagePreviewParams5.quoteStart, min, c12);
                                            View d9 = wa0Var4.d();
                                            if (d9 instanceof org.telegram.ui.Cells.t1) {
                                                oa0Var3.a0((org.telegram.ui.Cells.t1) d9, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            }
                                            if (!z132) {
                                                wa0Var4.s.getSwipeBack().e(wa0Var4.E);
                                            }
                                            wa0Var4.g(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams5.quoteStart = oa0Var3.u;
                                            messagePreviewParams5.quoteEnd = oa0Var3.v;
                                            org.telegram.ui.Cells.v9 v9Var2 = oa0Var3.W;
                                            messagePreviewParams5.quote = org.telegram.ui.gn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, wa0Var4.c(v9Var2 != null ? ((org.telegram.ui.Cells.t1) v9Var2).getMessageObject() : null));
                                            cb0Var3.b();
                                            cb0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    wa0Var4.f();
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
                                cb0 cb0Var4 = this.b.V;
                                if (!cb0Var4.b) {
                                    org.telegram.ui.wk wkVar = (org.telegram.ui.wk) cb0Var4;
                                    wkVar.a(true);
                                    org.telegram.ui.qn qnVar = wkVar.D;
                                    qnVar.j5 = null;
                                    qnVar.h5 = null;
                                    qnVar.b5.updateReply(null, null, qnVar.P5, null);
                                    qnVar.j8();
                                    break;
                                } else {
                                    org.telegram.ui.wk wkVar2 = (org.telegram.ui.wk) cb0Var4;
                                    wkVar2.a(true);
                                    org.telegram.ui.qn qnVar2 = wkVar2.D;
                                    qnVar2.h5 = null;
                                    qnVar2.Bb(qnVar2.j5);
                                    break;
                                }
                            case 7:
                                this.b.V.c(true);
                                break;
                            case 8:
                                this.b.V.a(true);
                                break;
                            case 9:
                                org.telegram.ui.wk wkVar3 = (org.telegram.ui.wk) this.b.V;
                                wkVar3.a(true);
                                org.telegram.ui.qn qnVar3 = wkVar3.D;
                                qnVar3.b5.updateForward(null, qnVar3.P5);
                                qnVar3.j8();
                                break;
                            case 10:
                                this.b.V.a(true);
                                break;
                            case 11:
                                org.telegram.ui.wk wkVar4 = (org.telegram.ui.wk) this.b.V;
                                wkVar4.a(true);
                                org.telegram.ui.qn qnVar4 = wkVar4.D;
                                qnVar4.C5 = null;
                                org.telegram.ui.ak akVar = qnVar4.U;
                                if (akVar != null) {
                                    akVar.S2 = null;
                                    akVar.T2 = false;
                                }
                                MessagePreviewParams messagePreviewParams6 = qnVar4.b5;
                                if (messagePreviewParams6 != null) {
                                    i162 = ((org.telegram.ui.ActionBar.o2) qnVar4).currentAccount;
                                    MessageObject messageObject = qnVar4.j5;
                                    messagePreviewParams6.updateLink(i162, null, null, messageObject == qnVar4.T3 ? null : messageObject, qnVar4.h5, qnVar4.l5);
                                }
                                qnVar4.j8();
                                break;
                            case 12:
                                wa0 wa0Var5 = this.b;
                                MessagePreviewParams messagePreviewParams7 = wa0Var5.V.d;
                                if (messagePreviewParams7.hasMedia) {
                                    boolean z14 = !messagePreviewParams7.webpageSmall;
                                    messagePreviewParams7.webpageSmall = z14;
                                    wa0Var5.C.a(z14, true);
                                    wa0Var5.D.a(messagePreviewParams7.webpageSmall, true);
                                    if (wa0Var5.r.messages.size() > 0 && (message2 = wa0Var5.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z15 = messagePreviewParams7.webpageSmall;
                                        messageMedia2.force_small_media = z15;
                                        messageMedia2.force_large_media = !z15;
                                    }
                                    if (wa0Var5.r.previewMessages.size() > 0 && (message = wa0Var5.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z16 = messagePreviewParams7.webpageSmall;
                                        messageMedia.force_small_media = z16;
                                        messageMedia.force_large_media = !z16;
                                    }
                                    wa0Var5.h();
                                    wa0Var5.Q = true;
                                    break;
                                }
                                break;
                            default:
                                wa0 wa0Var6 = this.b;
                                MessagePreviewParams messagePreviewParams8 = wa0Var6.V.d;
                                boolean z17 = messagePreviewParams8.webpageTop;
                                messagePreviewParams8.webpageTop = !z17;
                                wa0Var6.A.a(z17, true);
                                if (wa0Var6.r.messages.size() > 0 && (message4 = wa0Var6.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams8.webpageTop;
                                }
                                if (wa0Var6.r.previewMessages.size() > 0 && (message3 = wa0Var6.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams8.webpageTop;
                                }
                                wa0Var6.h();
                                wa0Var6.Q = true;
                                break;
                        }
                    }
                });
                f10 = 48.0f;
                frameLayout2.addView(na0Var, g7.e6.c(48.0f, -1));
                frameLayout2.addView(na0Var2, g7.e6.c(48.0f, -1));
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout2, g7.e6.n(-1, 48));
                messagePreviewParams = messagePreviewParams2;
            }
            if (messagePreviewParams.monoforum || messagePreviewParams.noforwards || messagePreviewParams.hasSecretMessages) {
                i10 = 48;
            } else {
                FrameLayout frameLayout3 = new FrameLayout(context3);
                org.telegram.ui.ActionBar.g1 g1Var8 = new org.telegram.ui.ActionBar.g1(1, context3, cb0Var.B, false, false);
                this.x = g1Var8;
                g1Var8.g(LocaleController.getString(R.string.ReplyToAnotherChat), R.drawable.msg_forward_replace, null);
                final int i26 = 3;
                g1Var8.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ga0
                    public final /* synthetic */ wa0 b;

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
                                wa0 wa0Var2 = this.b;
                                wa0Var2.V.d.quote = null;
                                wa0Var2.e.f(false);
                                wa0Var2.g(false, false);
                                wa0Var2.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                wa0 wa0Var3 = this.b;
                                oa0 oa0Var2 = wa0Var3.e;
                                cb0 cb0Var2 = wa0Var3.V;
                                if (wa0Var3.c(null) != null) {
                                    if (oa0Var2.v - oa0Var2.u <= MessagesController.getInstance(cb0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.v9 v9Var = oa0Var2.W;
                                        MessageObject c11 = wa0Var3.c(v9Var != null ? ((org.telegram.ui.Cells.t1) v9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams4 = cb0Var2.d;
                                        int i172 = oa0Var2.u;
                                        messagePreviewParams4.quoteStart = i172;
                                        int i182 = oa0Var2.v;
                                        messagePreviewParams4.quoteEnd = i182;
                                        messagePreviewParams4.quote = org.telegram.ui.gn.b(i172, i182, c11);
                                        cb0Var2.b();
                                        cb0Var2.a(true);
                                        break;
                                    } else {
                                        wa0Var3.f();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                wa0 wa0Var4 = this.b;
                                oa0 oa0Var3 = wa0Var4.e;
                                cb0 cb0Var3 = wa0Var4.V;
                                MessagePreviewParams messagePreviewParams5 = cb0Var3.d;
                                int i192 = cb0Var3.w;
                                boolean z132 = cb0Var3.b;
                                if (messagePreviewParams5.quote != null && !z132) {
                                    messagePreviewParams5.quote = null;
                                    oa0Var3.f(false);
                                    wa0Var4.g(false, true);
                                    wa0Var4.k(true);
                                    break;
                                } else if (oa0Var3.v - oa0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                    MessageObject c12 = wa0Var4.c(null);
                                    if (c12 != null) {
                                        if (!oa0Var3.y()) {
                                            messagePreviewParams5.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                            messagePreviewParams5.quoteEnd = min;
                                            messagePreviewParams5.quote = org.telegram.ui.gn.b(messagePreviewParams5.quoteStart, min, c12);
                                            View d9 = wa0Var4.d();
                                            if (d9 instanceof org.telegram.ui.Cells.t1) {
                                                oa0Var3.a0((org.telegram.ui.Cells.t1) d9, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            }
                                            if (!z132) {
                                                wa0Var4.s.getSwipeBack().e(wa0Var4.E);
                                            }
                                            wa0Var4.g(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams5.quoteStart = oa0Var3.u;
                                            messagePreviewParams5.quoteEnd = oa0Var3.v;
                                            org.telegram.ui.Cells.v9 v9Var2 = oa0Var3.W;
                                            messagePreviewParams5.quote = org.telegram.ui.gn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, wa0Var4.c(v9Var2 != null ? ((org.telegram.ui.Cells.t1) v9Var2).getMessageObject() : null));
                                            cb0Var3.b();
                                            cb0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    wa0Var4.f();
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
                                cb0 cb0Var4 = this.b.V;
                                if (!cb0Var4.b) {
                                    org.telegram.ui.wk wkVar = (org.telegram.ui.wk) cb0Var4;
                                    wkVar.a(true);
                                    org.telegram.ui.qn qnVar = wkVar.D;
                                    qnVar.j5 = null;
                                    qnVar.h5 = null;
                                    qnVar.b5.updateReply(null, null, qnVar.P5, null);
                                    qnVar.j8();
                                    break;
                                } else {
                                    org.telegram.ui.wk wkVar2 = (org.telegram.ui.wk) cb0Var4;
                                    wkVar2.a(true);
                                    org.telegram.ui.qn qnVar2 = wkVar2.D;
                                    qnVar2.h5 = null;
                                    qnVar2.Bb(qnVar2.j5);
                                    break;
                                }
                            case 7:
                                this.b.V.c(true);
                                break;
                            case 8:
                                this.b.V.a(true);
                                break;
                            case 9:
                                org.telegram.ui.wk wkVar3 = (org.telegram.ui.wk) this.b.V;
                                wkVar3.a(true);
                                org.telegram.ui.qn qnVar3 = wkVar3.D;
                                qnVar3.b5.updateForward(null, qnVar3.P5);
                                qnVar3.j8();
                                break;
                            case 10:
                                this.b.V.a(true);
                                break;
                            case 11:
                                org.telegram.ui.wk wkVar4 = (org.telegram.ui.wk) this.b.V;
                                wkVar4.a(true);
                                org.telegram.ui.qn qnVar4 = wkVar4.D;
                                qnVar4.C5 = null;
                                org.telegram.ui.ak akVar = qnVar4.U;
                                if (akVar != null) {
                                    akVar.S2 = null;
                                    akVar.T2 = false;
                                }
                                MessagePreviewParams messagePreviewParams6 = qnVar4.b5;
                                if (messagePreviewParams6 != null) {
                                    i162 = ((org.telegram.ui.ActionBar.o2) qnVar4).currentAccount;
                                    MessageObject messageObject = qnVar4.j5;
                                    messagePreviewParams6.updateLink(i162, null, null, messageObject == qnVar4.T3 ? null : messageObject, qnVar4.h5, qnVar4.l5);
                                }
                                qnVar4.j8();
                                break;
                            case 12:
                                wa0 wa0Var5 = this.b;
                                MessagePreviewParams messagePreviewParams7 = wa0Var5.V.d;
                                if (messagePreviewParams7.hasMedia) {
                                    boolean z14 = !messagePreviewParams7.webpageSmall;
                                    messagePreviewParams7.webpageSmall = z14;
                                    wa0Var5.C.a(z14, true);
                                    wa0Var5.D.a(messagePreviewParams7.webpageSmall, true);
                                    if (wa0Var5.r.messages.size() > 0 && (message2 = wa0Var5.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z15 = messagePreviewParams7.webpageSmall;
                                        messageMedia2.force_small_media = z15;
                                        messageMedia2.force_large_media = !z15;
                                    }
                                    if (wa0Var5.r.previewMessages.size() > 0 && (message = wa0Var5.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z16 = messagePreviewParams7.webpageSmall;
                                        messageMedia.force_small_media = z16;
                                        messageMedia.force_large_media = !z16;
                                    }
                                    wa0Var5.h();
                                    wa0Var5.Q = true;
                                    break;
                                }
                                break;
                            default:
                                wa0 wa0Var6 = this.b;
                                MessagePreviewParams messagePreviewParams8 = wa0Var6.V.d;
                                boolean z17 = messagePreviewParams8.webpageTop;
                                messagePreviewParams8.webpageTop = !z17;
                                wa0Var6.A.a(z17, true);
                                if (wa0Var6.r.messages.size() > 0 && (message4 = wa0Var6.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams8.webpageTop;
                                }
                                if (wa0Var6.r.previewMessages.size() > 0 && (message3 = wa0Var6.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams8.webpageTop;
                                }
                                wa0Var6.h();
                                wa0Var6.Q = true;
                                break;
                        }
                    }
                });
                context3 = context;
                org.telegram.ui.ActionBar.g1 g1Var9 = new org.telegram.ui.ActionBar.g1(1, context3, cb0Var.B, false, false);
                this.y = g1Var9;
                g1Var9.g(LocaleController.getString(R.string.QuoteToAnotherChat), R.drawable.msg_forward_replace, null);
                final int i27 = 4;
                g1Var9.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ga0
                    public final /* synthetic */ wa0 b;

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
                                wa0 wa0Var2 = this.b;
                                wa0Var2.V.d.quote = null;
                                wa0Var2.e.f(false);
                                wa0Var2.g(false, false);
                                wa0Var2.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                wa0 wa0Var3 = this.b;
                                oa0 oa0Var2 = wa0Var3.e;
                                cb0 cb0Var2 = wa0Var3.V;
                                if (wa0Var3.c(null) != null) {
                                    if (oa0Var2.v - oa0Var2.u <= MessagesController.getInstance(cb0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.v9 v9Var = oa0Var2.W;
                                        MessageObject c11 = wa0Var3.c(v9Var != null ? ((org.telegram.ui.Cells.t1) v9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams4 = cb0Var2.d;
                                        int i172 = oa0Var2.u;
                                        messagePreviewParams4.quoteStart = i172;
                                        int i182 = oa0Var2.v;
                                        messagePreviewParams4.quoteEnd = i182;
                                        messagePreviewParams4.quote = org.telegram.ui.gn.b(i172, i182, c11);
                                        cb0Var2.b();
                                        cb0Var2.a(true);
                                        break;
                                    } else {
                                        wa0Var3.f();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                wa0 wa0Var4 = this.b;
                                oa0 oa0Var3 = wa0Var4.e;
                                cb0 cb0Var3 = wa0Var4.V;
                                MessagePreviewParams messagePreviewParams5 = cb0Var3.d;
                                int i192 = cb0Var3.w;
                                boolean z132 = cb0Var3.b;
                                if (messagePreviewParams5.quote != null && !z132) {
                                    messagePreviewParams5.quote = null;
                                    oa0Var3.f(false);
                                    wa0Var4.g(false, true);
                                    wa0Var4.k(true);
                                    break;
                                } else if (oa0Var3.v - oa0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                    MessageObject c12 = wa0Var4.c(null);
                                    if (c12 != null) {
                                        if (!oa0Var3.y()) {
                                            messagePreviewParams5.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                            messagePreviewParams5.quoteEnd = min;
                                            messagePreviewParams5.quote = org.telegram.ui.gn.b(messagePreviewParams5.quoteStart, min, c12);
                                            View d9 = wa0Var4.d();
                                            if (d9 instanceof org.telegram.ui.Cells.t1) {
                                                oa0Var3.a0((org.telegram.ui.Cells.t1) d9, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            }
                                            if (!z132) {
                                                wa0Var4.s.getSwipeBack().e(wa0Var4.E);
                                            }
                                            wa0Var4.g(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams5.quoteStart = oa0Var3.u;
                                            messagePreviewParams5.quoteEnd = oa0Var3.v;
                                            org.telegram.ui.Cells.v9 v9Var2 = oa0Var3.W;
                                            messagePreviewParams5.quote = org.telegram.ui.gn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, wa0Var4.c(v9Var2 != null ? ((org.telegram.ui.Cells.t1) v9Var2).getMessageObject() : null));
                                            cb0Var3.b();
                                            cb0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    wa0Var4.f();
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
                                cb0 cb0Var4 = this.b.V;
                                if (!cb0Var4.b) {
                                    org.telegram.ui.wk wkVar = (org.telegram.ui.wk) cb0Var4;
                                    wkVar.a(true);
                                    org.telegram.ui.qn qnVar = wkVar.D;
                                    qnVar.j5 = null;
                                    qnVar.h5 = null;
                                    qnVar.b5.updateReply(null, null, qnVar.P5, null);
                                    qnVar.j8();
                                    break;
                                } else {
                                    org.telegram.ui.wk wkVar2 = (org.telegram.ui.wk) cb0Var4;
                                    wkVar2.a(true);
                                    org.telegram.ui.qn qnVar2 = wkVar2.D;
                                    qnVar2.h5 = null;
                                    qnVar2.Bb(qnVar2.j5);
                                    break;
                                }
                            case 7:
                                this.b.V.c(true);
                                break;
                            case 8:
                                this.b.V.a(true);
                                break;
                            case 9:
                                org.telegram.ui.wk wkVar3 = (org.telegram.ui.wk) this.b.V;
                                wkVar3.a(true);
                                org.telegram.ui.qn qnVar3 = wkVar3.D;
                                qnVar3.b5.updateForward(null, qnVar3.P5);
                                qnVar3.j8();
                                break;
                            case 10:
                                this.b.V.a(true);
                                break;
                            case 11:
                                org.telegram.ui.wk wkVar4 = (org.telegram.ui.wk) this.b.V;
                                wkVar4.a(true);
                                org.telegram.ui.qn qnVar4 = wkVar4.D;
                                qnVar4.C5 = null;
                                org.telegram.ui.ak akVar = qnVar4.U;
                                if (akVar != null) {
                                    akVar.S2 = null;
                                    akVar.T2 = false;
                                }
                                MessagePreviewParams messagePreviewParams6 = qnVar4.b5;
                                if (messagePreviewParams6 != null) {
                                    i162 = ((org.telegram.ui.ActionBar.o2) qnVar4).currentAccount;
                                    MessageObject messageObject = qnVar4.j5;
                                    messagePreviewParams6.updateLink(i162, null, null, messageObject == qnVar4.T3 ? null : messageObject, qnVar4.h5, qnVar4.l5);
                                }
                                qnVar4.j8();
                                break;
                            case 12:
                                wa0 wa0Var5 = this.b;
                                MessagePreviewParams messagePreviewParams7 = wa0Var5.V.d;
                                if (messagePreviewParams7.hasMedia) {
                                    boolean z14 = !messagePreviewParams7.webpageSmall;
                                    messagePreviewParams7.webpageSmall = z14;
                                    wa0Var5.C.a(z14, true);
                                    wa0Var5.D.a(messagePreviewParams7.webpageSmall, true);
                                    if (wa0Var5.r.messages.size() > 0 && (message2 = wa0Var5.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z15 = messagePreviewParams7.webpageSmall;
                                        messageMedia2.force_small_media = z15;
                                        messageMedia2.force_large_media = !z15;
                                    }
                                    if (wa0Var5.r.previewMessages.size() > 0 && (message = wa0Var5.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z16 = messagePreviewParams7.webpageSmall;
                                        messageMedia.force_small_media = z16;
                                        messageMedia.force_large_media = !z16;
                                    }
                                    wa0Var5.h();
                                    wa0Var5.Q = true;
                                    break;
                                }
                                break;
                            default:
                                wa0 wa0Var6 = this.b;
                                MessagePreviewParams messagePreviewParams8 = wa0Var6.V.d;
                                boolean z17 = messagePreviewParams8.webpageTop;
                                messagePreviewParams8.webpageTop = !z17;
                                wa0Var6.A.a(z17, true);
                                if (wa0Var6.r.messages.size() > 0 && (message4 = wa0Var6.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams8.webpageTop;
                                }
                                if (wa0Var6.r.previewMessages.size() > 0 && (message3 = wa0Var6.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams8.webpageTop;
                                }
                                wa0Var6.h();
                                wa0Var6.Q = true;
                                break;
                        }
                    }
                });
                frameLayout3.addView(g1Var9, g7.e6.c(f10, -1));
                frameLayout3.addView(g1Var8, g7.e6.c(f10, -1));
                i10 = 48;
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout3, g7.e6.n(-1, 48));
            }
            if (!messagePreviewParams.noforwards && !messagePreviewParams.hasSecretMessages) {
                org.telegram.ui.ActionBar.l1 l1Var4 = new org.telegram.ui.ActionBar.l1(context3, ya0Var);
                l1Var4.setColor(org.telegram.ui.ActionBar.f6.l1(0.06f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.E8, ya0Var)));
                l1Var4.setTag(R.id.fit_width_tag, 1);
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(l1Var4, g7.e6.n(-1, 8));
            }
            g(messagePreviewParams.quote != null, false);
            org.telegram.ui.ActionBar.g1 g1Var10 = new org.telegram.ui.ActionBar.g1(1, context3, cb0Var.B, false, false);
            g1Var10.g(LocaleController.getString(R.string.ApplyChanges), R.drawable.msg_select, null);
            final int i28 = 5;
            g1Var10.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ga0
                public final /* synthetic */ wa0 b;

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
                            wa0 wa0Var2 = this.b;
                            wa0Var2.V.d.quote = null;
                            wa0Var2.e.f(false);
                            wa0Var2.g(false, false);
                            wa0Var2.s.getSwipeBack().b(true);
                            break;
                        case 1:
                            wa0 wa0Var3 = this.b;
                            oa0 oa0Var2 = wa0Var3.e;
                            cb0 cb0Var2 = wa0Var3.V;
                            if (wa0Var3.c(null) != null) {
                                if (oa0Var2.v - oa0Var2.u <= MessagesController.getInstance(cb0Var2.w).quoteLengthMax) {
                                    org.telegram.ui.Cells.v9 v9Var = oa0Var2.W;
                                    MessageObject c11 = wa0Var3.c(v9Var != null ? ((org.telegram.ui.Cells.t1) v9Var).getMessageObject() : null);
                                    MessagePreviewParams messagePreviewParams4 = cb0Var2.d;
                                    int i172 = oa0Var2.u;
                                    messagePreviewParams4.quoteStart = i172;
                                    int i182 = oa0Var2.v;
                                    messagePreviewParams4.quoteEnd = i182;
                                    messagePreviewParams4.quote = org.telegram.ui.gn.b(i172, i182, c11);
                                    cb0Var2.b();
                                    cb0Var2.a(true);
                                    break;
                                } else {
                                    wa0Var3.f();
                                    break;
                                }
                            }
                            break;
                        case 2:
                            wa0 wa0Var4 = this.b;
                            oa0 oa0Var3 = wa0Var4.e;
                            cb0 cb0Var3 = wa0Var4.V;
                            MessagePreviewParams messagePreviewParams5 = cb0Var3.d;
                            int i192 = cb0Var3.w;
                            boolean z132 = cb0Var3.b;
                            if (messagePreviewParams5.quote != null && !z132) {
                                messagePreviewParams5.quote = null;
                                oa0Var3.f(false);
                                wa0Var4.g(false, true);
                                wa0Var4.k(true);
                                break;
                            } else if (oa0Var3.v - oa0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                MessageObject c12 = wa0Var4.c(null);
                                if (c12 != null) {
                                    if (!oa0Var3.y()) {
                                        messagePreviewParams5.quoteStart = 0;
                                        int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                        messagePreviewParams5.quoteEnd = min;
                                        messagePreviewParams5.quote = org.telegram.ui.gn.b(messagePreviewParams5.quoteStart, min, c12);
                                        View d9 = wa0Var4.d();
                                        if (d9 instanceof org.telegram.ui.Cells.t1) {
                                            oa0Var3.a0((org.telegram.ui.Cells.t1) d9, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                        }
                                        if (!z132) {
                                            wa0Var4.s.getSwipeBack().e(wa0Var4.E);
                                        }
                                        wa0Var4.g(true, true);
                                        break;
                                    } else {
                                        messagePreviewParams5.quoteStart = oa0Var3.u;
                                        messagePreviewParams5.quoteEnd = oa0Var3.v;
                                        org.telegram.ui.Cells.v9 v9Var2 = oa0Var3.W;
                                        messagePreviewParams5.quote = org.telegram.ui.gn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, wa0Var4.c(v9Var2 != null ? ((org.telegram.ui.Cells.t1) v9Var2).getMessageObject() : null));
                                        cb0Var3.b();
                                        cb0Var3.a(true);
                                        break;
                                    }
                                }
                            } else {
                                wa0Var4.f();
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
                            cb0 cb0Var4 = this.b.V;
                            if (!cb0Var4.b) {
                                org.telegram.ui.wk wkVar = (org.telegram.ui.wk) cb0Var4;
                                wkVar.a(true);
                                org.telegram.ui.qn qnVar = wkVar.D;
                                qnVar.j5 = null;
                                qnVar.h5 = null;
                                qnVar.b5.updateReply(null, null, qnVar.P5, null);
                                qnVar.j8();
                                break;
                            } else {
                                org.telegram.ui.wk wkVar2 = (org.telegram.ui.wk) cb0Var4;
                                wkVar2.a(true);
                                org.telegram.ui.qn qnVar2 = wkVar2.D;
                                qnVar2.h5 = null;
                                qnVar2.Bb(qnVar2.j5);
                                break;
                            }
                        case 7:
                            this.b.V.c(true);
                            break;
                        case 8:
                            this.b.V.a(true);
                            break;
                        case 9:
                            org.telegram.ui.wk wkVar3 = (org.telegram.ui.wk) this.b.V;
                            wkVar3.a(true);
                            org.telegram.ui.qn qnVar3 = wkVar3.D;
                            qnVar3.b5.updateForward(null, qnVar3.P5);
                            qnVar3.j8();
                            break;
                        case 10:
                            this.b.V.a(true);
                            break;
                        case 11:
                            org.telegram.ui.wk wkVar4 = (org.telegram.ui.wk) this.b.V;
                            wkVar4.a(true);
                            org.telegram.ui.qn qnVar4 = wkVar4.D;
                            qnVar4.C5 = null;
                            org.telegram.ui.ak akVar = qnVar4.U;
                            if (akVar != null) {
                                akVar.S2 = null;
                                akVar.T2 = false;
                            }
                            MessagePreviewParams messagePreviewParams6 = qnVar4.b5;
                            if (messagePreviewParams6 != null) {
                                i162 = ((org.telegram.ui.ActionBar.o2) qnVar4).currentAccount;
                                MessageObject messageObject = qnVar4.j5;
                                messagePreviewParams6.updateLink(i162, null, null, messageObject == qnVar4.T3 ? null : messageObject, qnVar4.h5, qnVar4.l5);
                            }
                            qnVar4.j8();
                            break;
                        case 12:
                            wa0 wa0Var5 = this.b;
                            MessagePreviewParams messagePreviewParams7 = wa0Var5.V.d;
                            if (messagePreviewParams7.hasMedia) {
                                boolean z14 = !messagePreviewParams7.webpageSmall;
                                messagePreviewParams7.webpageSmall = z14;
                                wa0Var5.C.a(z14, true);
                                wa0Var5.D.a(messagePreviewParams7.webpageSmall, true);
                                if (wa0Var5.r.messages.size() > 0 && (message2 = wa0Var5.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                    boolean z15 = messagePreviewParams7.webpageSmall;
                                    messageMedia2.force_small_media = z15;
                                    messageMedia2.force_large_media = !z15;
                                }
                                if (wa0Var5.r.previewMessages.size() > 0 && (message = wa0Var5.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                    boolean z16 = messagePreviewParams7.webpageSmall;
                                    messageMedia.force_small_media = z16;
                                    messageMedia.force_large_media = !z16;
                                }
                                wa0Var5.h();
                                wa0Var5.Q = true;
                                break;
                            }
                            break;
                        default:
                            wa0 wa0Var6 = this.b;
                            MessagePreviewParams messagePreviewParams8 = wa0Var6.V.d;
                            boolean z17 = messagePreviewParams8.webpageTop;
                            messagePreviewParams8.webpageTop = !z17;
                            wa0Var6.A.a(z17, true);
                            if (wa0Var6.r.messages.size() > 0 && (message4 = wa0Var6.r.messages.get(0).messageOwner) != null) {
                                message4.invert_media = messagePreviewParams8.webpageTop;
                            }
                            if (wa0Var6.r.previewMessages.size() > 0 && (message3 = wa0Var6.r.previewMessages.get(0).messageOwner) != null) {
                                message3.invert_media = messagePreviewParams8.webpageTop;
                            }
                            wa0Var6.h();
                            wa0Var6.Q = true;
                            break;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var10, g7.e6.n(-1, i10));
            org.telegram.ui.ActionBar.g1 g1Var11 = new org.telegram.ui.ActionBar.g1(1, context, cb0Var.B, false, true);
            g1Var11.g(LocaleController.getString(z12 ? R.string.DoNotQuote : R.string.DoNotReply), R.drawable.msg_delete, null);
            int v04 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.q7, ya0Var);
            int i29 = org.telegram.ui.ActionBar.f6.p7;
            g1Var11.c(v04, org.telegram.ui.ActionBar.f6.v0(i29, ya0Var));
            g1Var11.setSelectorColor(org.telegram.ui.ActionBar.f6.l1(0.12f, org.telegram.ui.ActionBar.f6.w0(null, i29, false)));
            final int i30 = 6;
            g1Var11.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ga0
                public final /* synthetic */ wa0 b;

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
                            wa0 wa0Var2 = this.b;
                            wa0Var2.V.d.quote = null;
                            wa0Var2.e.f(false);
                            wa0Var2.g(false, false);
                            wa0Var2.s.getSwipeBack().b(true);
                            break;
                        case 1:
                            wa0 wa0Var3 = this.b;
                            oa0 oa0Var2 = wa0Var3.e;
                            cb0 cb0Var2 = wa0Var3.V;
                            if (wa0Var3.c(null) != null) {
                                if (oa0Var2.v - oa0Var2.u <= MessagesController.getInstance(cb0Var2.w).quoteLengthMax) {
                                    org.telegram.ui.Cells.v9 v9Var = oa0Var2.W;
                                    MessageObject c11 = wa0Var3.c(v9Var != null ? ((org.telegram.ui.Cells.t1) v9Var).getMessageObject() : null);
                                    MessagePreviewParams messagePreviewParams4 = cb0Var2.d;
                                    int i172 = oa0Var2.u;
                                    messagePreviewParams4.quoteStart = i172;
                                    int i182 = oa0Var2.v;
                                    messagePreviewParams4.quoteEnd = i182;
                                    messagePreviewParams4.quote = org.telegram.ui.gn.b(i172, i182, c11);
                                    cb0Var2.b();
                                    cb0Var2.a(true);
                                    break;
                                } else {
                                    wa0Var3.f();
                                    break;
                                }
                            }
                            break;
                        case 2:
                            wa0 wa0Var4 = this.b;
                            oa0 oa0Var3 = wa0Var4.e;
                            cb0 cb0Var3 = wa0Var4.V;
                            MessagePreviewParams messagePreviewParams5 = cb0Var3.d;
                            int i192 = cb0Var3.w;
                            boolean z132 = cb0Var3.b;
                            if (messagePreviewParams5.quote != null && !z132) {
                                messagePreviewParams5.quote = null;
                                oa0Var3.f(false);
                                wa0Var4.g(false, true);
                                wa0Var4.k(true);
                                break;
                            } else if (oa0Var3.v - oa0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                MessageObject c12 = wa0Var4.c(null);
                                if (c12 != null) {
                                    if (!oa0Var3.y()) {
                                        messagePreviewParams5.quoteStart = 0;
                                        int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, c12.messageOwner.message.length());
                                        messagePreviewParams5.quoteEnd = min;
                                        messagePreviewParams5.quote = org.telegram.ui.gn.b(messagePreviewParams5.quoteStart, min, c12);
                                        View d9 = wa0Var4.d();
                                        if (d9 instanceof org.telegram.ui.Cells.t1) {
                                            oa0Var3.a0((org.telegram.ui.Cells.t1) d9, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                        }
                                        if (!z132) {
                                            wa0Var4.s.getSwipeBack().e(wa0Var4.E);
                                        }
                                        wa0Var4.g(true, true);
                                        break;
                                    } else {
                                        messagePreviewParams5.quoteStart = oa0Var3.u;
                                        messagePreviewParams5.quoteEnd = oa0Var3.v;
                                        org.telegram.ui.Cells.v9 v9Var2 = oa0Var3.W;
                                        messagePreviewParams5.quote = org.telegram.ui.gn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, wa0Var4.c(v9Var2 != null ? ((org.telegram.ui.Cells.t1) v9Var2).getMessageObject() : null));
                                        cb0Var3.b();
                                        cb0Var3.a(true);
                                        break;
                                    }
                                }
                            } else {
                                wa0Var4.f();
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
                            cb0 cb0Var4 = this.b.V;
                            if (!cb0Var4.b) {
                                org.telegram.ui.wk wkVar = (org.telegram.ui.wk) cb0Var4;
                                wkVar.a(true);
                                org.telegram.ui.qn qnVar = wkVar.D;
                                qnVar.j5 = null;
                                qnVar.h5 = null;
                                qnVar.b5.updateReply(null, null, qnVar.P5, null);
                                qnVar.j8();
                                break;
                            } else {
                                org.telegram.ui.wk wkVar2 = (org.telegram.ui.wk) cb0Var4;
                                wkVar2.a(true);
                                org.telegram.ui.qn qnVar2 = wkVar2.D;
                                qnVar2.h5 = null;
                                qnVar2.Bb(qnVar2.j5);
                                break;
                            }
                        case 7:
                            this.b.V.c(true);
                            break;
                        case 8:
                            this.b.V.a(true);
                            break;
                        case 9:
                            org.telegram.ui.wk wkVar3 = (org.telegram.ui.wk) this.b.V;
                            wkVar3.a(true);
                            org.telegram.ui.qn qnVar3 = wkVar3.D;
                            qnVar3.b5.updateForward(null, qnVar3.P5);
                            qnVar3.j8();
                            break;
                        case 10:
                            this.b.V.a(true);
                            break;
                        case 11:
                            org.telegram.ui.wk wkVar4 = (org.telegram.ui.wk) this.b.V;
                            wkVar4.a(true);
                            org.telegram.ui.qn qnVar4 = wkVar4.D;
                            qnVar4.C5 = null;
                            org.telegram.ui.ak akVar = qnVar4.U;
                            if (akVar != null) {
                                akVar.S2 = null;
                                akVar.T2 = false;
                            }
                            MessagePreviewParams messagePreviewParams6 = qnVar4.b5;
                            if (messagePreviewParams6 != null) {
                                i162 = ((org.telegram.ui.ActionBar.o2) qnVar4).currentAccount;
                                MessageObject messageObject = qnVar4.j5;
                                messagePreviewParams6.updateLink(i162, null, null, messageObject == qnVar4.T3 ? null : messageObject, qnVar4.h5, qnVar4.l5);
                            }
                            qnVar4.j8();
                            break;
                        case 12:
                            wa0 wa0Var5 = this.b;
                            MessagePreviewParams messagePreviewParams7 = wa0Var5.V.d;
                            if (messagePreviewParams7.hasMedia) {
                                boolean z14 = !messagePreviewParams7.webpageSmall;
                                messagePreviewParams7.webpageSmall = z14;
                                wa0Var5.C.a(z14, true);
                                wa0Var5.D.a(messagePreviewParams7.webpageSmall, true);
                                if (wa0Var5.r.messages.size() > 0 && (message2 = wa0Var5.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                    boolean z15 = messagePreviewParams7.webpageSmall;
                                    messageMedia2.force_small_media = z15;
                                    messageMedia2.force_large_media = !z15;
                                }
                                if (wa0Var5.r.previewMessages.size() > 0 && (message = wa0Var5.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                    boolean z16 = messagePreviewParams7.webpageSmall;
                                    messageMedia.force_small_media = z16;
                                    messageMedia.force_large_media = !z16;
                                }
                                wa0Var5.h();
                                wa0Var5.Q = true;
                                break;
                            }
                            break;
                        default:
                            wa0 wa0Var6 = this.b;
                            MessagePreviewParams messagePreviewParams8 = wa0Var6.V.d;
                            boolean z17 = messagePreviewParams8.webpageTop;
                            messagePreviewParams8.webpageTop = !z17;
                            wa0Var6.A.a(z17, true);
                            if (wa0Var6.r.messages.size() > 0 && (message4 = wa0Var6.r.messages.get(0).messageOwner) != null) {
                                message4.invert_media = messagePreviewParams8.webpageTop;
                            }
                            if (wa0Var6.r.previewMessages.size() > 0 && (message3 = wa0Var6.r.previewMessages.get(0).messageOwner) != null) {
                                message3.invert_media = messagePreviewParams8.webpageTop;
                            }
                            wa0Var6.h();
                            wa0Var6.Q = true;
                            break;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var11, g7.e6.n(-1, i10));
            context2 = context;
            wa0Var = this;
        }
        int i31 = wa0Var.a;
        if (i31 == 1) {
            wa0Var.r = messagePreviewParams.forwardMessages;
        } else if (i31 == 0) {
            wa0Var.r = messagePreviewParams.replyMessage;
        } else if (i31 == 2) {
            wa0Var.r = messagePreviewParams.linkMessage;
        }
        org.telegram.ui.Cells.z9 o6 = wa0Var.e.o(context2);
        wa0Var.d = o6;
        o6.setElevation(AndroidUtilities.dp(8.0f));
        o6.setOutlineProvider(null);
        if (o6.getParent() instanceof ViewGroup) {
            ((ViewGroup) o6.getParent()).removeView(o6);
        }
        wa0Var.addView(o6, g7.e6.d(-1, -1.0f, 51, 0.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / AndroidUtilities.density, 0.0f, 0.0f));
        wa0Var.e.T(wa0Var.f);
    }

    public static MessageObject.GroupedMessages a(wa0 wa0Var, MessageObject messageObject) {
        if (messageObject.getGroupId() == 0) {
            return null;
        }
        MessageObject.GroupedMessages groupedMessages = wa0Var.r.groupedMessagesMap.get(messageObject.getGroupId());
        if (groupedMessages == null || (groupedMessages.messages.size() > 1 && groupedMessages.getPosition(messageObject) != null)) {
            return groupedMessages;
        }
        return null;
    }

    public static void b(wa0 wa0Var, org.telegram.ui.Cells.t1 t1Var) {
        CharacterStyle characterStyle;
        TLRPC.WebPage webPage;
        if (wa0Var.a == 2) {
            MessagePreviewParams messagePreviewParams = wa0Var.V.d;
            if (!messagePreviewParams.singleLink && (characterStyle = messagePreviewParams.currentLink) != null && (webPage = messagePreviewParams.webpage) != null && !(webPage instanceof TLRPC.TL_webPagePending)) {
                t1Var.Q3(characterStyle);
                return;
            }
        }
        t1Var.Q3(null);
    }

    public final MessageObject c(MessageObject messageObject) {
        MessageObject.GroupedMessages valueAt;
        cb0 cb0Var = this.V;
        MessagePreviewParams.Messages messages = cb0Var.d.replyMessage;
        if (messages == null) {
            return null;
        }
        LongSparseArray<MessageObject.GroupedMessages> longSparseArray = messages.groupedMessagesMap;
        if (longSparseArray == null || longSparseArray.size() <= 0 || (valueAt = cb0Var.d.replyMessage.groupedMessagesMap.valueAt(0)) == null) {
            return cb0Var.d.replyMessage.messages.get(0);
        }
        if (valueAt.isDocuments) {
            if (messageObject != null) {
                return messageObject;
            }
            org.telegram.ui.gn gnVar = cb0Var.d.quote;
            if (gnVar != null) {
                return gnVar.a;
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
            int i9 = 0;
            while (true) {
                pa0 pa0Var = this.f;
                if (i9 >= pa0Var.getChildCount()) {
                    break;
                }
                View childAt = pa0Var.getChildAt(i9);
                org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) childAt;
                if (o4Var.getMessageObject() != null && (o4Var.getMessageObject() == c10 || o4Var.getMessageObject().getId() == c10.getId())) {
                    break;
                }
                i9++;
            }
        }
        return null;
    }

    public final void e(float f10, int i9) {
        boolean z10 = this.V.v;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        fh.v vVar = this.c;
        fh.x4 x4Var = this.b;
        if (z10) {
            vVar.setTranslationY(0.0f);
            x4Var.invalidateOutline();
            x4Var.setTranslationY(0.0f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(0.0f);
        } else {
            vVar.setTranslationY(i9);
            x4Var.invalidateOutline();
            x4Var.setTranslationY(f10);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((f10 + x4Var.getMeasuredHeight()) - AndroidUtilities.dp(2.0f));
        }
        float x10 = x4Var.getX();
        org.telegram.ui.Cells.z9 z9Var = this.d;
        z9Var.setTranslationX(x10);
        z9Var.setTranslationY(x4Var.getY());
    }

    public final void f() {
        cb0 cb0Var = this.V;
        new oc(cb0Var, cb0Var.B).M(LocaleController.getString(R.string.QuoteMaxError), LocaleController.getString(R.string.QuoteMaxErrorMessage), R.raw.error).j();
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
        na0 na0Var = this.w;
        na0 na0Var2 = this.v;
        if (!z11) {
            if (na0Var2 != null) {
                na0Var2.setAlpha(!z10 ? 1.0f : 0.0f);
                na0Var2.setVisibility(!z10 ? 0 : 4);
            }
            if (na0Var != null) {
                na0Var.setAlpha(z10 ? 1.0f : 0.0f);
                na0Var.setVisibility(z10 ? 0 : 4);
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
        if (na0Var2 != null) {
            na0Var2.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(na0Var2, (Property<na0, Float>) property, !z10 ? 1.0f : 0.0f));
        }
        if (na0Var != null) {
            na0Var.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(na0Var, (Property<na0, Float>) property, z10 ? 1.0f : 0.0f));
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
        this.L.setInterpolator(gr.h);
        this.L.addListener(new u9(15, this, z10));
        this.L.start();
    }

    public final void h() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        cb0 cb0Var = this.V;
        MessagePreviewParams messagePreviewParams = cb0Var.d;
        ra0 ra0Var = this.h;
        if (ra0Var.k()) {
            this.R = true;
            return;
        }
        for (int i9 = 0; i9 < this.r.previewMessages.size(); i9++) {
            MessageObject messageObject = this.r.previewMessages.get(i9);
            messageObject.forceUpdate = true;
            messageObject.sendAsPeer = cb0Var.a;
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
        for (int i10 = 0; i10 < this.r.pollChosenAnswers.size(); i10++) {
            this.r.pollChosenAnswers.get(i10).chosen = !messagePreviewParams.hideForwardSendersName;
        }
        for (int i11 = 0; i11 < this.r.groupedMessagesMap.size(); i11++) {
            ra0Var.V(this.r.groupedMessagesMap.valueAt(i11));
        }
        this.n.q(0, this.r.previewMessages.size());
    }

    public final void i() {
        int i9 = this.N;
        float f10 = this.O;
        cb0 cb0Var = this.V;
        boolean z10 = cb0Var.v;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        pa0 pa0Var = this.f;
        if (z10) {
            this.O = 0.0f;
            this.N = 0;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(AndroidUtilities.dp(8.0f) + pa0Var.getMeasuredWidth());
        } else {
            int measuredHeight = pa0Var.getMeasuredHeight();
            int i10 = 0;
            for (int i11 = 0; i11 < pa0Var.getChildCount(); i11++) {
                View childAt = pa0Var.getChildAt(i11);
                if (RecyclerView.R(childAt) != -1) {
                    measuredHeight = Math.min(measuredHeight, childAt.getTop());
                    i10++;
                }
            }
            MessagePreviewParams.Messages messages = this.r;
            if (messages == null || i10 == 0 || i10 > messages.previewMessages.size()) {
                this.N = 0;
            } else {
                int b10 = org.telegram.messenger.l0.b(4.0f, measuredHeight, 0);
                this.N = b10;
                this.N = Math.min(((pa0Var.getMeasuredHeight() - this.N) + b10) - ((int) ((((AndroidUtilities.displaySize.y - (Build.VERSION.SDK_INT >= 35 ? AndroidUtilities.navigationBarHeight : 0)) * 0.8f) - this.S) - AndroidUtilities.dp(8.0f))), this.N);
            }
            float A = e2.c.A(getMeasuredHeight() - AndroidUtilities.dp(16.0f), (this.b.getMeasuredHeight() - this.N) + (this.S - AndroidUtilities.dp(8.0f)), 2.0f, AndroidUtilities.dp(8.0f)) - this.N;
            this.O = A;
            if (A > AndroidUtilities.dp(8.0f)) {
                this.O = AndroidUtilities.dp(8.0f);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
        }
        boolean z11 = this.G;
        if (z11 || (this.N == i9 && this.O == f10)) {
            if (z11) {
                float f11 = this.O;
                int i12 = this.N;
                this.P = i12;
                e(f11, i12);
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = cb0Var.h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        cb0Var.h = ofFloat;
        ofFloat.addUpdateListener(new rj(this, i9, f10, 1));
        cb0Var.h.setDuration(250L);
        cb0Var.h.setInterpolator(rh.m.V);
        cb0Var.h.addListener(new r60(this, 4));
        AndroidUtilities.runOnUIThread(cb0Var.y, 50L);
        this.P = i9;
        e(f10, i9);
    }

    public final void j() {
        MessageObject messageObject;
        cb0 cb0Var = this.V;
        MessagePreviewParams messagePreviewParams = cb0Var.d;
        if (this.a == 0) {
            oa0 oa0Var = this.e;
            if (oa0Var.v - oa0Var.u > MessagesController.getInstance(cb0Var.w).quoteLengthMax) {
                return;
            }
            org.telegram.ui.Cells.v9 v9Var = oa0Var.W;
            MessageObject c10 = c(v9Var != null ? ((org.telegram.ui.Cells.t1) v9Var).getMessageObject() : null);
            if (messagePreviewParams.quote != null && oa0Var.y()) {
                messagePreviewParams.quoteStart = oa0Var.u;
                messagePreviewParams.quoteEnd = oa0Var.v;
                if (c10 != null && ((messageObject = messagePreviewParams.quote.a) == null || messageObject.getId() != c10.getId())) {
                    messagePreviewParams.quote = org.telegram.ui.gn.b(messagePreviewParams.quoteStart, messagePreviewParams.quoteEnd, c10);
                    cb0Var.b();
                }
            }
            oa0Var.f(false);
        }
    }

    public final void k(boolean z10) {
        cb0 cb0Var = this.V;
        TLRPC.User user = cb0Var.n;
        MessagePreviewParams messagePreviewParams = cb0Var.d;
        TLRPC.Chat chat = cb0Var.r;
        fh.v vVar = this.c;
        int i9 = this.a;
        if (i9 == 1) {
            MessagePreviewParams.Messages messages = messagePreviewParams.forwardMessages;
            vVar.d(LocaleController.formatPluralString("PreviewForwardMessagesCount", messages == null ? 0 : messages.selectedIds.size(), new Object[0]), z10);
            vVar.c(!messagePreviewParams.hasSenders ? messagePreviewParams.willSeeSenders ? user != null ? LocaleController.formatString("ForwardPreviewSendersNameVisible", R.string.ForwardPreviewSendersNameVisible, ContactsController.formatName(user.first_name, user.last_name)) : (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.ForwardPreviewSendersNameVisibleGroup) : LocaleController.getString(R.string.ForwardPreviewSendersNameVisibleChannel) : user != null ? LocaleController.formatString("ForwardPreviewSendersNameVisible", R.string.ForwardPreviewSendersNameVisible, ContactsController.formatName(user.first_name, user.last_name)) : (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.ForwardPreviewSendersNameHiddenGroup) : LocaleController.getString(R.string.ForwardPreviewSendersNameHiddenChannel) : !messagePreviewParams.hideForwardSendersName ? user != null ? LocaleController.formatString("ForwardPreviewSendersNameVisible", R.string.ForwardPreviewSendersNameVisible, ContactsController.formatName(user.first_name, user.last_name)) : (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.ForwardPreviewSendersNameVisibleGroup) : LocaleController.getString(R.string.ForwardPreviewSendersNameVisibleChannel) : user != null ? LocaleController.formatString("ForwardPreviewSendersNameHidden", R.string.ForwardPreviewSendersNameHidden, ContactsController.formatName(user.first_name, user.last_name)) : (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.ForwardPreviewSendersNameHiddenGroup) : LocaleController.getString(R.string.ForwardPreviewSendersNameHiddenChannel), z10);
        } else {
            if (i9 != 0) {
                if (i9 == 2) {
                    vVar.d(LocaleController.getString(R.string.MessageOptionsLinkTitle), z10);
                    vVar.c(LocaleController.getString(R.string.MessageOptionsLinkSubtitle), z10);
                    return;
                }
                return;
            }
            if (messagePreviewParams.quote == null || !messagePreviewParams.replyMessage.hasText) {
                vVar.d(LocaleController.getString(R.string.MessageOptionsReplyTitle), z10);
                vVar.c(messagePreviewParams.replyMessage.hasText ? LocaleController.getString(R.string.MessageOptionsReplySubtitle) : "", z10);
            } else {
                vVar.d(LocaleController.getString(R.string.PreviewQuoteUpdate), z10);
                vVar.c(LocaleController.getString(R.string.PreviewQuoteUpdateSubtitle), z10);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.a == 0) {
            AndroidUtilities.forEachViews((RecyclerView) this.f, (d5.d) new ha0(this, 0));
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
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        i();
        this.G = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        boolean z10 = View.MeasureSpec.getSize(i9) > View.MeasureSpec.getSize(i10);
        cb0 cb0Var = this.V;
        cb0Var.v = z10;
        this.S = 0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(i9, makeMeasureSpec);
        int i11 = this.S;
        int measuredHeight = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
        Rect rect = this.M;
        this.S = Math.max(i11, measuredHeight + rect.top + rect.bottom);
        ((ViewGroup.MarginLayoutParams) this.f.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        boolean z11 = cb0Var.v;
        fh.x4 x4Var = this.b;
        if (z11) {
            x4Var.getLayoutParams().height = -1;
            ((ViewGroup.MarginLayoutParams) x4Var.getLayoutParams()).topMargin = AndroidUtilities.dp(8.0f);
            ((ViewGroup.MarginLayoutParams) x4Var.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
            x4Var.getLayoutParams().width = (int) Math.min(View.MeasureSpec.getSize(i9), Math.max(AndroidUtilities.dp(340.0f), View.MeasureSpec.getSize(i9) * 0.6f));
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = -1;
        } else {
            ((ViewGroup.MarginLayoutParams) x4Var.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) x4Var.getLayoutParams()).bottomMargin = 0;
            x4Var.getLayoutParams().height = (View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(6.0f)) - this.S;
            if (x4Var.getLayoutParams().height < View.MeasureSpec.getSize(i10) * 0.5f) {
                x4Var.getLayoutParams().height = (int) (View.MeasureSpec.getSize(i10) * 0.5f);
            }
            x4Var.getLayoutParams().width = -1;
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = View.MeasureSpec.getSize(i10) - x4Var.getLayoutParams().height;
        }
        int size = (View.MeasureSpec.getSize(i10) + View.MeasureSpec.getSize(i9)) << 16;
        if (this.T != size) {
            for (int i12 = 0; i12 < this.r.previewMessages.size(); i12++) {
                MessageObject messageObject = this.r.previewMessages.get(i12);
                messageObject.parentWidth = cb0Var.v ? x4Var.getLayoutParams().width : View.MeasureSpec.getSize(i9) - AndroidUtilities.dp(16.0f);
                messageObject.resetLayout();
                messageObject.forceUpdate = true;
                va0 va0Var = this.n;
                if (va0Var != null) {
                    va0Var.l();
                }
            }
            this.G = true;
        }
        this.T = size;
        super.onMeasure(i9, i10);
    }
}
