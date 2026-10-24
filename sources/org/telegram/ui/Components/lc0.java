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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class lc0 extends FrameLayout {
    public final qc0 E;
    public final FrameLayout F;
    public final qc0 G;
    public final qc0 H;
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
    public final tb0 c;
    public final /* synthetic */ rc0 c0;
    public final org.telegram.ui.Cells.aa d;
    public final dc0 e;
    public final ec0 f;
    public final gc0 h;
    public final kc0 n;
    public MessagePreviewParams.Messages r;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout s;
    public final cc0 v;
    public final cc0 w;
    public final org.telegram.ui.ActionBar.e1 x;
    public final org.telegram.ui.ActionBar.e1 y;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7, types: [android.graphics.drawable.Drawable, org.telegram.ui.ActionBar.n6] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r13v8, types: [android.view.View, org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout] */
    /* JADX WARN: Type inference failed for: r2v59, types: [android.view.View, org.telegram.ui.ActionBar.e1] */
    /* JADX WARN: Type inference failed for: r2v60, types: [android.view.View, org.telegram.ui.ActionBar.e1] */
    /* JADX WARN: Type inference failed for: r2v66, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r2v67, types: [android.view.View, org.telegram.ui.ActionBar.e1] */
    /* JADX WARN: Type inference failed for: r2v68, types: [android.view.View, org.telegram.ui.ActionBar.e1] */
    /* JADX WARN: Type inference failed for: r2v75, types: [android.view.View, org.telegram.ui.ActionBar.e1, org.telegram.ui.Components.cc0] */
    /* JADX WARN: Type inference failed for: r2v76, types: [android.view.View, org.telegram.ui.ActionBar.e1, org.telegram.ui.Components.cc0] */
    /* JADX WARN: Type inference failed for: r34v0, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout, java.lang.Object, org.telegram.ui.Components.lc0] */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.view.View, android.view.ViewGroup, org.telegram.ui.Components.ow0, org.telegram.ui.y8] */
    /* JADX WARN: Type inference failed for: r3v6, types: [bh.b] */
    /* JADX WARN: Type inference failed for: r9v7, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r9v8, types: [android.view.ViewGroup] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public lc0(rc0 rc0Var, Context context, int i10) {
        super(r4);
        MessagePreviewParams messagePreviewParams;
        Context context2;
        lc0 lc0Var;
        boolean z10;
        qc0 qc0Var;
        qc0 qc0Var2;
        ViewOutlineProvider viewOutlineProvider;
        lc0 lc0Var2;
        MessagePreviewParams.Messages messages;
        ?? r11;
        MessagePreviewParams messagePreviewParams2;
        ?? r112;
        MessagePreviewParams messagePreviewParams3;
        boolean z11;
        LinearLayout linearLayout;
        boolean z12;
        Context context3 = context;
        this.c0 = rc0Var;
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
        ?? y8Var = new org.telegram.ui.y8(this, context3, i11);
        this.b = y8Var;
        nc0 nc0Var = rc0Var.F;
        boolean z13 = rc0Var.b;
        MessagePreviewParams messagePreviewParams4 = rc0Var.d;
        Drawable l4 = ((org.telegram.ui.qn) nc0Var).l();
        if (((org.telegram.ui.qn) nc0Var).f == null) {
            int i13 = org.telegram.ui.ActionBar.k6.a;
        }
        y8Var.U(l4);
        y8Var.setOccupyStatusBar(false);
        int i14 = 3;
        y8Var.setOutlineProvider(new dh.b(this, i14));
        y8Var.setClipToOutline(true);
        y8Var.setElevation(AndroidUtilities.dp(4.0f));
        tb0 tb0Var = new tb0(context3, nc0Var);
        this.c = tb0Var;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.s8, tb0Var, nc0Var);
        dc0 dc0Var = new dc0(this);
        this.e = dc0Var;
        dc0Var.D = new ci.n2(this, i14);
        ec0 ec0Var = new ec0(this, context3, nc0Var);
        this.f = ec0Var;
        gc0 gc0Var = new gc0(this, ec0Var, nc0Var);
        this.h = gc0Var;
        ec0Var.setItemAnimator(gc0Var);
        ec0Var.setOnScrollListener(new kv(this, 4));
        ec0Var.setOnItemClickListener(new hc0(this));
        kc0 kc0Var = new kc0(this);
        this.n = kc0Var;
        ec0Var.setAdapter(kc0Var);
        ec0Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        zb0 zb0Var = new zb0(this);
        zb0Var.O = new ac0(this);
        ec0Var.setClipToPadding(false);
        ec0Var.setLayoutManager(zb0Var);
        ec0Var.i(new bc0());
        y8Var.addView(ec0Var);
        addView(y8Var, w7.z5.d(-1, 400.0f, 0, 8.0f, 0.0f, 8.0f, 0.0f));
        y8Var.addView(tb0Var, w7.z5.c(-2.0f, -1));
        ?? actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert2, 1, getContext(), nc0Var);
        this.s = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().setOnForegroundOpenFinished(new wb0(this, i11));
        dh.d c10 = rc0Var.G.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, false);
        c10.o(fh.c.k(nc0Var));
        c10.p(AndroidUtilities.dp(8.0f));
        c10.v.e = true;
        c10.q(AndroidUtilities.dp(12.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c10);
        addView(actionBarPopupWindow$ActionBarPopupWindowLayout, w7.z5.c(-2.0f, -2));
        if (i10 != 0 || (messages = messagePreviewParams4.replyMessage) == null) {
            messagePreviewParams = messagePreviewParams4;
            if (i10 != 1 || messagePreviewParams.forwardMessages == null) {
                final lc0 lc0Var3 = this;
                lc0Var = lc0Var3;
                if (i10 == 2) {
                    lc0Var = lc0Var3;
                    if (messagePreviewParams.linkMessage != null) {
                        qc0 qc0Var3 = new qc0(context, R.raw.position_below, LocaleController.getString(R.string.LinkAbove), R.raw.position_above, LocaleController.getString(R.string.LinkBelow), rc0Var.F);
                        lc0Var3.E = qc0Var3;
                        qc0Var3.a(!messagePreviewParams.webpageTop, false);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(qc0Var3, w7.z5.n(-1, 48));
                        FrameLayout frameLayout = new FrameLayout(context);
                        lc0Var3.F = frameLayout;
                        int i15 = org.telegram.ui.ActionBar.k6.I5;
                        org.telegram.ui.Cells.y Z = org.telegram.ui.ActionBar.k6.Z(org.telegram.ui.ActionBar.k6.w0(i15, nc0Var), 0, 0);
                        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i15);
                        frameLayout.setBackground(Z);
                        org.telegram.ui.ActionBar.r6.k(frameLayout, Z, null, O, nc0Var);
                        qc0 qc0Var4 = new qc0(context, R.raw.media_shrink, LocaleController.getString(R.string.LinkMediaLarger), R.raw.media_enlarge, LocaleController.getString(R.string.LinkMediaSmaller), rc0Var.F);
                        lc0Var3.G = qc0Var4;
                        qc0Var4.setBackground(null);
                        qc0Var4.setVisibility(messagePreviewParams.isVideo ? 4 : 0);
                        frameLayout.addView(qc0Var4, w7.z5.n(-1, 48));
                        qc0 qc0Var5 = new qc0(context, R.raw.media_shrink, LocaleController.getString(R.string.LinkVideoLarger), R.raw.media_enlarge, LocaleController.getString(R.string.LinkVideoSmaller), rc0Var.F);
                        lc0Var3.H = qc0Var5;
                        qc0Var5.setBackground(null);
                        qc0Var5.setVisibility(!messagePreviewParams.isVideo ? 4 : 0);
                        frameLayout.setAlpha(messagePreviewParams.hasMedia ? 1.0f : 0.5f);
                        frameLayout.addView(qc0Var5, w7.z5.n(-1, 48));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, w7.z5.n(-1, 48));
                        frameLayout.setVisibility((!messagePreviewParams.singleLink || messagePreviewParams.hasMedia) ? 0 : 8);
                        qc0Var4.a(messagePreviewParams.webpageSmall, false);
                        qc0Var5.a(messagePreviewParams.webpageSmall, false);
                        org.telegram.ui.ActionBar.j1 j1Var = new org.telegram.ui.ActionBar.j1(context, nc0Var);
                        org.telegram.ui.ActionBar.r6.j(j1Var, org.telegram.ui.ActionBar.r6.M(0.06f, org.telegram.ui.ActionBar.k6.E8), nc0Var);
                        j1Var.setTag(R.id.fit_width_tag, 1);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(j1Var, w7.z5.n(-1, 8));
                        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(1, context, rc0Var.F, false, false);
                        e1Var.j(LocaleController.getString(R.string.ApplyChanges), R.drawable.msg_select, null);
                        final int i16 = 10;
                        e1Var.setOnClickListener(new View.OnClickListener(lc0Var3) { // from class: org.telegram.ui.Components.ub0
                            public final /* synthetic */ lc0 b;

                            {
                                this.b = lc0Var3;
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
                                        lc0 lc0Var4 = this.b;
                                        lc0Var4.c0.d.quote = null;
                                        lc0Var4.e.f(false);
                                        lc0Var4.h(false, false);
                                        lc0Var4.s.getSwipeBack().b(true);
                                        break;
                                    case 1:
                                        lc0 lc0Var5 = this.b;
                                        dc0 dc0Var2 = lc0Var5.e;
                                        rc0 rc0Var2 = lc0Var5.c0;
                                        if (lc0Var5.c(null) != null) {
                                            if (dc0Var2.v - dc0Var2.u <= MessagesController.getInstance(rc0Var2.w).quoteLengthMax) {
                                                org.telegram.ui.Cells.w9 w9Var = dc0Var2.W;
                                                MessageObject c11 = lc0Var5.c(w9Var != null ? ((org.telegram.ui.Cells.t1) w9Var).getMessageObject() : null);
                                                MessagePreviewParams messagePreviewParams5 = rc0Var2.d;
                                                int i18 = dc0Var2.u;
                                                messagePreviewParams5.quoteStart = i18;
                                                int i19 = dc0Var2.v;
                                                messagePreviewParams5.quoteEnd = i19;
                                                messagePreviewParams5.quote = org.telegram.ui.in.c(c11, i18, i19);
                                                rc0Var2.b();
                                                rc0Var2.a(true);
                                                break;
                                            } else {
                                                lc0Var5.g();
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        lc0 lc0Var6 = this.b;
                                        dc0 dc0Var3 = lc0Var6.e;
                                        rc0 rc0Var3 = lc0Var6.c0;
                                        MessagePreviewParams messagePreviewParams6 = rc0Var3.d;
                                        int i20 = rc0Var3.w;
                                        boolean z14 = rc0Var3.b;
                                        if (messagePreviewParams6.quote != null && !z14) {
                                            messagePreviewParams6.quote = null;
                                            dc0Var3.f(false);
                                            lc0Var6.h(false, true);
                                            lc0Var6.l(true);
                                            break;
                                        } else if (dc0Var3.v - dc0Var3.u <= MessagesController.getInstance(i20).quoteLengthMax) {
                                            MessageObject c12 = lc0Var6.c(null);
                                            if (c12 != null) {
                                                if (!dc0Var3.x()) {
                                                    messagePreviewParams6.quoteStart = 0;
                                                    int min = Math.min(MessagesController.getInstance(i20).quoteLengthMax, org.telegram.ui.in.d(c12));
                                                    messagePreviewParams6.quoteEnd = min;
                                                    messagePreviewParams6.quote = org.telegram.ui.in.c(c12, messagePreviewParams6.quoteStart, min);
                                                    View d = lc0Var6.d();
                                                    if (d instanceof org.telegram.ui.Cells.t1) {
                                                        dc0Var3.Z((org.telegram.ui.Cells.t1) d, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                                    }
                                                    if (!z14) {
                                                        lc0Var6.s.getSwipeBack().e(lc0Var6.I);
                                                    }
                                                    lc0Var6.h(true, true);
                                                    break;
                                                } else {
                                                    messagePreviewParams6.quoteStart = dc0Var3.u;
                                                    messagePreviewParams6.quoteEnd = dc0Var3.v;
                                                    org.telegram.ui.Cells.w9 w9Var2 = dc0Var3.W;
                                                    messagePreviewParams6.quote = org.telegram.ui.in.c(lc0Var6.c(w9Var2 != null ? ((org.telegram.ui.Cells.t1) w9Var2).getMessageObject() : null), messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                                    rc0Var3.b();
                                                    rc0Var3.a(true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            lc0Var6.g();
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
                                        rc0 rc0Var4 = this.b.c0;
                                        if (!rc0Var4.b) {
                                            org.telegram.ui.bl blVar = (org.telegram.ui.bl) rc0Var4;
                                            blVar.a(true);
                                            org.telegram.ui.sn snVar = blVar.H;
                                            snVar.z5 = null;
                                            snVar.x5 = null;
                                            snVar.r5.updateReply(null, null, snVar.f6, null);
                                            snVar.m8();
                                            break;
                                        } else {
                                            org.telegram.ui.bl blVar2 = (org.telegram.ui.bl) rc0Var4;
                                            blVar2.a(true);
                                            org.telegram.ui.sn snVar2 = blVar2.H;
                                            snVar2.x5 = null;
                                            snVar2.Hb(snVar2.z5);
                                            break;
                                        }
                                    case 7:
                                        this.b.c0.c(true);
                                        break;
                                    case 8:
                                        this.b.c0.a(true);
                                        break;
                                    case 9:
                                        org.telegram.ui.bl blVar3 = (org.telegram.ui.bl) this.b.c0;
                                        blVar3.a(true);
                                        org.telegram.ui.sn snVar3 = blVar3.H;
                                        snVar3.r5.updateForward(null, snVar3.f6);
                                        snVar3.m8();
                                        break;
                                    case 10:
                                        this.b.c0.a(true);
                                        break;
                                    case 11:
                                        org.telegram.ui.bl blVar4 = (org.telegram.ui.bl) this.b.c0;
                                        blVar4.a(true);
                                        org.telegram.ui.sn snVar4 = blVar4.H;
                                        snVar4.S5 = null;
                                        org.telegram.ui.gk gkVar = snVar4.Y;
                                        if (gkVar != null) {
                                            gkVar.X2 = null;
                                            gkVar.Y2 = false;
                                        }
                                        MessagePreviewParams messagePreviewParams7 = snVar4.r5;
                                        if (messagePreviewParams7 != null) {
                                            i17 = ((org.telegram.ui.ActionBar.o2) snVar4).currentAccount;
                                            MessageObject messageObject = snVar4.z5;
                                            messagePreviewParams7.updateLink(i17, null, null, messageObject == snVar4.j4 ? null : messageObject, snVar4.x5, snVar4.B5);
                                        }
                                        snVar4.m8();
                                        break;
                                    case 12:
                                        lc0 lc0Var7 = this.b;
                                        MessagePreviewParams messagePreviewParams8 = lc0Var7.c0.d;
                                        if (messagePreviewParams8.hasMedia) {
                                            boolean z15 = !messagePreviewParams8.webpageSmall;
                                            messagePreviewParams8.webpageSmall = z15;
                                            lc0Var7.G.a(z15, true);
                                            lc0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                            if (lc0Var7.r.messages.size() > 0 && (message2 = lc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                                boolean z16 = messagePreviewParams8.webpageSmall;
                                                messageMedia2.force_small_media = z16;
                                                messageMedia2.force_large_media = !z16;
                                            }
                                            if (lc0Var7.r.previewMessages.size() > 0 && (message = lc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                                boolean z17 = messagePreviewParams8.webpageSmall;
                                                messageMedia.force_small_media = z17;
                                                messageMedia.force_large_media = !z17;
                                            }
                                            lc0Var7.i();
                                            lc0Var7.U = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        lc0 lc0Var8 = this.b;
                                        MessagePreviewParams messagePreviewParams9 = lc0Var8.c0.d;
                                        boolean z18 = messagePreviewParams9.webpageTop;
                                        messagePreviewParams9.webpageTop = !z18;
                                        lc0Var8.E.a(z18, true);
                                        if (lc0Var8.r.messages.size() > 0 && (message4 = lc0Var8.r.messages.get(0).messageOwner) != null) {
                                            message4.invert_media = messagePreviewParams9.webpageTop;
                                        }
                                        if (lc0Var8.r.previewMessages.size() > 0 && (message3 = lc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                            message3.invert_media = messagePreviewParams9.webpageTop;
                                        }
                                        lc0Var8.i();
                                        lc0Var8.U = true;
                                        break;
                                }
                            }
                        });
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var, w7.z5.n(-1, 48));
                        org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(1, context, rc0Var.F, false, true);
                        context2 = context;
                        e1Var2.j(LocaleController.getString(R.string.DoNotLinkPreview), R.drawable.msg_delete, null);
                        int i17 = org.telegram.ui.ActionBar.k6.q7;
                        int i18 = org.telegram.ui.ActionBar.k6.p7;
                        e1Var2.c(i17, i18);
                        final int i19 = 11;
                        e1Var2.setOnClickListener(new View.OnClickListener(lc0Var3) { // from class: org.telegram.ui.Components.ub0
                            public final /* synthetic */ lc0 b;

                            {
                                this.b = lc0Var3;
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
                                        lc0 lc0Var4 = this.b;
                                        lc0Var4.c0.d.quote = null;
                                        lc0Var4.e.f(false);
                                        lc0Var4.h(false, false);
                                        lc0Var4.s.getSwipeBack().b(true);
                                        break;
                                    case 1:
                                        lc0 lc0Var5 = this.b;
                                        dc0 dc0Var2 = lc0Var5.e;
                                        rc0 rc0Var2 = lc0Var5.c0;
                                        if (lc0Var5.c(null) != null) {
                                            if (dc0Var2.v - dc0Var2.u <= MessagesController.getInstance(rc0Var2.w).quoteLengthMax) {
                                                org.telegram.ui.Cells.w9 w9Var = dc0Var2.W;
                                                MessageObject c11 = lc0Var5.c(w9Var != null ? ((org.telegram.ui.Cells.t1) w9Var).getMessageObject() : null);
                                                MessagePreviewParams messagePreviewParams5 = rc0Var2.d;
                                                int i182 = dc0Var2.u;
                                                messagePreviewParams5.quoteStart = i182;
                                                int i192 = dc0Var2.v;
                                                messagePreviewParams5.quoteEnd = i192;
                                                messagePreviewParams5.quote = org.telegram.ui.in.c(c11, i182, i192);
                                                rc0Var2.b();
                                                rc0Var2.a(true);
                                                break;
                                            } else {
                                                lc0Var5.g();
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        lc0 lc0Var6 = this.b;
                                        dc0 dc0Var3 = lc0Var6.e;
                                        rc0 rc0Var3 = lc0Var6.c0;
                                        MessagePreviewParams messagePreviewParams6 = rc0Var3.d;
                                        int i20 = rc0Var3.w;
                                        boolean z14 = rc0Var3.b;
                                        if (messagePreviewParams6.quote != null && !z14) {
                                            messagePreviewParams6.quote = null;
                                            dc0Var3.f(false);
                                            lc0Var6.h(false, true);
                                            lc0Var6.l(true);
                                            break;
                                        } else if (dc0Var3.v - dc0Var3.u <= MessagesController.getInstance(i20).quoteLengthMax) {
                                            MessageObject c12 = lc0Var6.c(null);
                                            if (c12 != null) {
                                                if (!dc0Var3.x()) {
                                                    messagePreviewParams6.quoteStart = 0;
                                                    int min = Math.min(MessagesController.getInstance(i20).quoteLengthMax, org.telegram.ui.in.d(c12));
                                                    messagePreviewParams6.quoteEnd = min;
                                                    messagePreviewParams6.quote = org.telegram.ui.in.c(c12, messagePreviewParams6.quoteStart, min);
                                                    View d = lc0Var6.d();
                                                    if (d instanceof org.telegram.ui.Cells.t1) {
                                                        dc0Var3.Z((org.telegram.ui.Cells.t1) d, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                                    }
                                                    if (!z14) {
                                                        lc0Var6.s.getSwipeBack().e(lc0Var6.I);
                                                    }
                                                    lc0Var6.h(true, true);
                                                    break;
                                                } else {
                                                    messagePreviewParams6.quoteStart = dc0Var3.u;
                                                    messagePreviewParams6.quoteEnd = dc0Var3.v;
                                                    org.telegram.ui.Cells.w9 w9Var2 = dc0Var3.W;
                                                    messagePreviewParams6.quote = org.telegram.ui.in.c(lc0Var6.c(w9Var2 != null ? ((org.telegram.ui.Cells.t1) w9Var2).getMessageObject() : null), messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                                    rc0Var3.b();
                                                    rc0Var3.a(true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            lc0Var6.g();
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
                                        rc0 rc0Var4 = this.b.c0;
                                        if (!rc0Var4.b) {
                                            org.telegram.ui.bl blVar = (org.telegram.ui.bl) rc0Var4;
                                            blVar.a(true);
                                            org.telegram.ui.sn snVar = blVar.H;
                                            snVar.z5 = null;
                                            snVar.x5 = null;
                                            snVar.r5.updateReply(null, null, snVar.f6, null);
                                            snVar.m8();
                                            break;
                                        } else {
                                            org.telegram.ui.bl blVar2 = (org.telegram.ui.bl) rc0Var4;
                                            blVar2.a(true);
                                            org.telegram.ui.sn snVar2 = blVar2.H;
                                            snVar2.x5 = null;
                                            snVar2.Hb(snVar2.z5);
                                            break;
                                        }
                                    case 7:
                                        this.b.c0.c(true);
                                        break;
                                    case 8:
                                        this.b.c0.a(true);
                                        break;
                                    case 9:
                                        org.telegram.ui.bl blVar3 = (org.telegram.ui.bl) this.b.c0;
                                        blVar3.a(true);
                                        org.telegram.ui.sn snVar3 = blVar3.H;
                                        snVar3.r5.updateForward(null, snVar3.f6);
                                        snVar3.m8();
                                        break;
                                    case 10:
                                        this.b.c0.a(true);
                                        break;
                                    case 11:
                                        org.telegram.ui.bl blVar4 = (org.telegram.ui.bl) this.b.c0;
                                        blVar4.a(true);
                                        org.telegram.ui.sn snVar4 = blVar4.H;
                                        snVar4.S5 = null;
                                        org.telegram.ui.gk gkVar = snVar4.Y;
                                        if (gkVar != null) {
                                            gkVar.X2 = null;
                                            gkVar.Y2 = false;
                                        }
                                        MessagePreviewParams messagePreviewParams7 = snVar4.r5;
                                        if (messagePreviewParams7 != null) {
                                            i172 = ((org.telegram.ui.ActionBar.o2) snVar4).currentAccount;
                                            MessageObject messageObject = snVar4.z5;
                                            messagePreviewParams7.updateLink(i172, null, null, messageObject == snVar4.j4 ? null : messageObject, snVar4.x5, snVar4.B5);
                                        }
                                        snVar4.m8();
                                        break;
                                    case 12:
                                        lc0 lc0Var7 = this.b;
                                        MessagePreviewParams messagePreviewParams8 = lc0Var7.c0.d;
                                        if (messagePreviewParams8.hasMedia) {
                                            boolean z15 = !messagePreviewParams8.webpageSmall;
                                            messagePreviewParams8.webpageSmall = z15;
                                            lc0Var7.G.a(z15, true);
                                            lc0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                            if (lc0Var7.r.messages.size() > 0 && (message2 = lc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                                boolean z16 = messagePreviewParams8.webpageSmall;
                                                messageMedia2.force_small_media = z16;
                                                messageMedia2.force_large_media = !z16;
                                            }
                                            if (lc0Var7.r.previewMessages.size() > 0 && (message = lc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                                boolean z17 = messagePreviewParams8.webpageSmall;
                                                messageMedia.force_small_media = z17;
                                                messageMedia.force_large_media = !z17;
                                            }
                                            lc0Var7.i();
                                            lc0Var7.U = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        lc0 lc0Var8 = this.b;
                                        MessagePreviewParams messagePreviewParams9 = lc0Var8.c0.d;
                                        boolean z18 = messagePreviewParams9.webpageTop;
                                        messagePreviewParams9.webpageTop = !z18;
                                        lc0Var8.E.a(z18, true);
                                        if (lc0Var8.r.messages.size() > 0 && (message4 = lc0Var8.r.messages.get(0).messageOwner) != null) {
                                            message4.invert_media = messagePreviewParams9.webpageTop;
                                        }
                                        if (lc0Var8.r.previewMessages.size() > 0 && (message3 = lc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                            message3.invert_media = messagePreviewParams9.webpageTop;
                                        }
                                        lc0Var8.i();
                                        lc0Var8.U = true;
                                        break;
                                }
                            }
                        });
                        e1Var2.h(0.12f, i18);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var2, w7.z5.n(-1, 48));
                        final int i20 = 12;
                        frameLayout.setOnClickListener(new View.OnClickListener(lc0Var3) { // from class: org.telegram.ui.Components.ub0
                            public final /* synthetic */ lc0 b;

                            {
                                this.b = lc0Var3;
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
                                        lc0 lc0Var4 = this.b;
                                        lc0Var4.c0.d.quote = null;
                                        lc0Var4.e.f(false);
                                        lc0Var4.h(false, false);
                                        lc0Var4.s.getSwipeBack().b(true);
                                        break;
                                    case 1:
                                        lc0 lc0Var5 = this.b;
                                        dc0 dc0Var2 = lc0Var5.e;
                                        rc0 rc0Var2 = lc0Var5.c0;
                                        if (lc0Var5.c(null) != null) {
                                            if (dc0Var2.v - dc0Var2.u <= MessagesController.getInstance(rc0Var2.w).quoteLengthMax) {
                                                org.telegram.ui.Cells.w9 w9Var = dc0Var2.W;
                                                MessageObject c11 = lc0Var5.c(w9Var != null ? ((org.telegram.ui.Cells.t1) w9Var).getMessageObject() : null);
                                                MessagePreviewParams messagePreviewParams5 = rc0Var2.d;
                                                int i182 = dc0Var2.u;
                                                messagePreviewParams5.quoteStart = i182;
                                                int i192 = dc0Var2.v;
                                                messagePreviewParams5.quoteEnd = i192;
                                                messagePreviewParams5.quote = org.telegram.ui.in.c(c11, i182, i192);
                                                rc0Var2.b();
                                                rc0Var2.a(true);
                                                break;
                                            } else {
                                                lc0Var5.g();
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        lc0 lc0Var6 = this.b;
                                        dc0 dc0Var3 = lc0Var6.e;
                                        rc0 rc0Var3 = lc0Var6.c0;
                                        MessagePreviewParams messagePreviewParams6 = rc0Var3.d;
                                        int i202 = rc0Var3.w;
                                        boolean z14 = rc0Var3.b;
                                        if (messagePreviewParams6.quote != null && !z14) {
                                            messagePreviewParams6.quote = null;
                                            dc0Var3.f(false);
                                            lc0Var6.h(false, true);
                                            lc0Var6.l(true);
                                            break;
                                        } else if (dc0Var3.v - dc0Var3.u <= MessagesController.getInstance(i202).quoteLengthMax) {
                                            MessageObject c12 = lc0Var6.c(null);
                                            if (c12 != null) {
                                                if (!dc0Var3.x()) {
                                                    messagePreviewParams6.quoteStart = 0;
                                                    int min = Math.min(MessagesController.getInstance(i202).quoteLengthMax, org.telegram.ui.in.d(c12));
                                                    messagePreviewParams6.quoteEnd = min;
                                                    messagePreviewParams6.quote = org.telegram.ui.in.c(c12, messagePreviewParams6.quoteStart, min);
                                                    View d = lc0Var6.d();
                                                    if (d instanceof org.telegram.ui.Cells.t1) {
                                                        dc0Var3.Z((org.telegram.ui.Cells.t1) d, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                                    }
                                                    if (!z14) {
                                                        lc0Var6.s.getSwipeBack().e(lc0Var6.I);
                                                    }
                                                    lc0Var6.h(true, true);
                                                    break;
                                                } else {
                                                    messagePreviewParams6.quoteStart = dc0Var3.u;
                                                    messagePreviewParams6.quoteEnd = dc0Var3.v;
                                                    org.telegram.ui.Cells.w9 w9Var2 = dc0Var3.W;
                                                    messagePreviewParams6.quote = org.telegram.ui.in.c(lc0Var6.c(w9Var2 != null ? ((org.telegram.ui.Cells.t1) w9Var2).getMessageObject() : null), messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                                    rc0Var3.b();
                                                    rc0Var3.a(true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            lc0Var6.g();
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
                                        rc0 rc0Var4 = this.b.c0;
                                        if (!rc0Var4.b) {
                                            org.telegram.ui.bl blVar = (org.telegram.ui.bl) rc0Var4;
                                            blVar.a(true);
                                            org.telegram.ui.sn snVar = blVar.H;
                                            snVar.z5 = null;
                                            snVar.x5 = null;
                                            snVar.r5.updateReply(null, null, snVar.f6, null);
                                            snVar.m8();
                                            break;
                                        } else {
                                            org.telegram.ui.bl blVar2 = (org.telegram.ui.bl) rc0Var4;
                                            blVar2.a(true);
                                            org.telegram.ui.sn snVar2 = blVar2.H;
                                            snVar2.x5 = null;
                                            snVar2.Hb(snVar2.z5);
                                            break;
                                        }
                                    case 7:
                                        this.b.c0.c(true);
                                        break;
                                    case 8:
                                        this.b.c0.a(true);
                                        break;
                                    case 9:
                                        org.telegram.ui.bl blVar3 = (org.telegram.ui.bl) this.b.c0;
                                        blVar3.a(true);
                                        org.telegram.ui.sn snVar3 = blVar3.H;
                                        snVar3.r5.updateForward(null, snVar3.f6);
                                        snVar3.m8();
                                        break;
                                    case 10:
                                        this.b.c0.a(true);
                                        break;
                                    case 11:
                                        org.telegram.ui.bl blVar4 = (org.telegram.ui.bl) this.b.c0;
                                        blVar4.a(true);
                                        org.telegram.ui.sn snVar4 = blVar4.H;
                                        snVar4.S5 = null;
                                        org.telegram.ui.gk gkVar = snVar4.Y;
                                        if (gkVar != null) {
                                            gkVar.X2 = null;
                                            gkVar.Y2 = false;
                                        }
                                        MessagePreviewParams messagePreviewParams7 = snVar4.r5;
                                        if (messagePreviewParams7 != null) {
                                            i172 = ((org.telegram.ui.ActionBar.o2) snVar4).currentAccount;
                                            MessageObject messageObject = snVar4.z5;
                                            messagePreviewParams7.updateLink(i172, null, null, messageObject == snVar4.j4 ? null : messageObject, snVar4.x5, snVar4.B5);
                                        }
                                        snVar4.m8();
                                        break;
                                    case 12:
                                        lc0 lc0Var7 = this.b;
                                        MessagePreviewParams messagePreviewParams8 = lc0Var7.c0.d;
                                        if (messagePreviewParams8.hasMedia) {
                                            boolean z15 = !messagePreviewParams8.webpageSmall;
                                            messagePreviewParams8.webpageSmall = z15;
                                            lc0Var7.G.a(z15, true);
                                            lc0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                            if (lc0Var7.r.messages.size() > 0 && (message2 = lc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                                boolean z16 = messagePreviewParams8.webpageSmall;
                                                messageMedia2.force_small_media = z16;
                                                messageMedia2.force_large_media = !z16;
                                            }
                                            if (lc0Var7.r.previewMessages.size() > 0 && (message = lc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                                boolean z17 = messagePreviewParams8.webpageSmall;
                                                messageMedia.force_small_media = z17;
                                                messageMedia.force_large_media = !z17;
                                            }
                                            lc0Var7.i();
                                            lc0Var7.U = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        lc0 lc0Var8 = this.b;
                                        MessagePreviewParams messagePreviewParams9 = lc0Var8.c0.d;
                                        boolean z18 = messagePreviewParams9.webpageTop;
                                        messagePreviewParams9.webpageTop = !z18;
                                        lc0Var8.E.a(z18, true);
                                        if (lc0Var8.r.messages.size() > 0 && (message4 = lc0Var8.r.messages.get(0).messageOwner) != null) {
                                            message4.invert_media = messagePreviewParams9.webpageTop;
                                        }
                                        if (lc0Var8.r.previewMessages.size() > 0 && (message3 = lc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                            message3.invert_media = messagePreviewParams9.webpageTop;
                                        }
                                        lc0Var8.i();
                                        lc0Var8.U = true;
                                        break;
                                }
                            }
                        });
                        final int i21 = 13;
                        qc0Var3.setOnClickListener(new View.OnClickListener(lc0Var3) { // from class: org.telegram.ui.Components.ub0
                            public final /* synthetic */ lc0 b;

                            {
                                this.b = lc0Var3;
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
                                        lc0 lc0Var4 = this.b;
                                        lc0Var4.c0.d.quote = null;
                                        lc0Var4.e.f(false);
                                        lc0Var4.h(false, false);
                                        lc0Var4.s.getSwipeBack().b(true);
                                        break;
                                    case 1:
                                        lc0 lc0Var5 = this.b;
                                        dc0 dc0Var2 = lc0Var5.e;
                                        rc0 rc0Var2 = lc0Var5.c0;
                                        if (lc0Var5.c(null) != null) {
                                            if (dc0Var2.v - dc0Var2.u <= MessagesController.getInstance(rc0Var2.w).quoteLengthMax) {
                                                org.telegram.ui.Cells.w9 w9Var = dc0Var2.W;
                                                MessageObject c11 = lc0Var5.c(w9Var != null ? ((org.telegram.ui.Cells.t1) w9Var).getMessageObject() : null);
                                                MessagePreviewParams messagePreviewParams5 = rc0Var2.d;
                                                int i182 = dc0Var2.u;
                                                messagePreviewParams5.quoteStart = i182;
                                                int i192 = dc0Var2.v;
                                                messagePreviewParams5.quoteEnd = i192;
                                                messagePreviewParams5.quote = org.telegram.ui.in.c(c11, i182, i192);
                                                rc0Var2.b();
                                                rc0Var2.a(true);
                                                break;
                                            } else {
                                                lc0Var5.g();
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        lc0 lc0Var6 = this.b;
                                        dc0 dc0Var3 = lc0Var6.e;
                                        rc0 rc0Var3 = lc0Var6.c0;
                                        MessagePreviewParams messagePreviewParams6 = rc0Var3.d;
                                        int i202 = rc0Var3.w;
                                        boolean z14 = rc0Var3.b;
                                        if (messagePreviewParams6.quote != null && !z14) {
                                            messagePreviewParams6.quote = null;
                                            dc0Var3.f(false);
                                            lc0Var6.h(false, true);
                                            lc0Var6.l(true);
                                            break;
                                        } else if (dc0Var3.v - dc0Var3.u <= MessagesController.getInstance(i202).quoteLengthMax) {
                                            MessageObject c12 = lc0Var6.c(null);
                                            if (c12 != null) {
                                                if (!dc0Var3.x()) {
                                                    messagePreviewParams6.quoteStart = 0;
                                                    int min = Math.min(MessagesController.getInstance(i202).quoteLengthMax, org.telegram.ui.in.d(c12));
                                                    messagePreviewParams6.quoteEnd = min;
                                                    messagePreviewParams6.quote = org.telegram.ui.in.c(c12, messagePreviewParams6.quoteStart, min);
                                                    View d = lc0Var6.d();
                                                    if (d instanceof org.telegram.ui.Cells.t1) {
                                                        dc0Var3.Z((org.telegram.ui.Cells.t1) d, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                                    }
                                                    if (!z14) {
                                                        lc0Var6.s.getSwipeBack().e(lc0Var6.I);
                                                    }
                                                    lc0Var6.h(true, true);
                                                    break;
                                                } else {
                                                    messagePreviewParams6.quoteStart = dc0Var3.u;
                                                    messagePreviewParams6.quoteEnd = dc0Var3.v;
                                                    org.telegram.ui.Cells.w9 w9Var2 = dc0Var3.W;
                                                    messagePreviewParams6.quote = org.telegram.ui.in.c(lc0Var6.c(w9Var2 != null ? ((org.telegram.ui.Cells.t1) w9Var2).getMessageObject() : null), messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                                    rc0Var3.b();
                                                    rc0Var3.a(true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            lc0Var6.g();
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
                                        rc0 rc0Var4 = this.b.c0;
                                        if (!rc0Var4.b) {
                                            org.telegram.ui.bl blVar = (org.telegram.ui.bl) rc0Var4;
                                            blVar.a(true);
                                            org.telegram.ui.sn snVar = blVar.H;
                                            snVar.z5 = null;
                                            snVar.x5 = null;
                                            snVar.r5.updateReply(null, null, snVar.f6, null);
                                            snVar.m8();
                                            break;
                                        } else {
                                            org.telegram.ui.bl blVar2 = (org.telegram.ui.bl) rc0Var4;
                                            blVar2.a(true);
                                            org.telegram.ui.sn snVar2 = blVar2.H;
                                            snVar2.x5 = null;
                                            snVar2.Hb(snVar2.z5);
                                            break;
                                        }
                                    case 7:
                                        this.b.c0.c(true);
                                        break;
                                    case 8:
                                        this.b.c0.a(true);
                                        break;
                                    case 9:
                                        org.telegram.ui.bl blVar3 = (org.telegram.ui.bl) this.b.c0;
                                        blVar3.a(true);
                                        org.telegram.ui.sn snVar3 = blVar3.H;
                                        snVar3.r5.updateForward(null, snVar3.f6);
                                        snVar3.m8();
                                        break;
                                    case 10:
                                        this.b.c0.a(true);
                                        break;
                                    case 11:
                                        org.telegram.ui.bl blVar4 = (org.telegram.ui.bl) this.b.c0;
                                        blVar4.a(true);
                                        org.telegram.ui.sn snVar4 = blVar4.H;
                                        snVar4.S5 = null;
                                        org.telegram.ui.gk gkVar = snVar4.Y;
                                        if (gkVar != null) {
                                            gkVar.X2 = null;
                                            gkVar.Y2 = false;
                                        }
                                        MessagePreviewParams messagePreviewParams7 = snVar4.r5;
                                        if (messagePreviewParams7 != null) {
                                            i172 = ((org.telegram.ui.ActionBar.o2) snVar4).currentAccount;
                                            MessageObject messageObject = snVar4.z5;
                                            messagePreviewParams7.updateLink(i172, null, null, messageObject == snVar4.j4 ? null : messageObject, snVar4.x5, snVar4.B5);
                                        }
                                        snVar4.m8();
                                        break;
                                    case 12:
                                        lc0 lc0Var7 = this.b;
                                        MessagePreviewParams messagePreviewParams8 = lc0Var7.c0.d;
                                        if (messagePreviewParams8.hasMedia) {
                                            boolean z15 = !messagePreviewParams8.webpageSmall;
                                            messagePreviewParams8.webpageSmall = z15;
                                            lc0Var7.G.a(z15, true);
                                            lc0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                            if (lc0Var7.r.messages.size() > 0 && (message2 = lc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                                boolean z16 = messagePreviewParams8.webpageSmall;
                                                messageMedia2.force_small_media = z16;
                                                messageMedia2.force_large_media = !z16;
                                            }
                                            if (lc0Var7.r.previewMessages.size() > 0 && (message = lc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                                boolean z17 = messagePreviewParams8.webpageSmall;
                                                messageMedia.force_small_media = z17;
                                                messageMedia.force_large_media = !z17;
                                            }
                                            lc0Var7.i();
                                            lc0Var7.U = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        lc0 lc0Var8 = this.b;
                                        MessagePreviewParams messagePreviewParams9 = lc0Var8.c0.d;
                                        boolean z18 = messagePreviewParams9.webpageTop;
                                        messagePreviewParams9.webpageTop = !z18;
                                        lc0Var8.E.a(z18, true);
                                        if (lc0Var8.r.messages.size() > 0 && (message4 = lc0Var8.r.messages.get(0).messageOwner) != null) {
                                            message4.invert_media = messagePreviewParams9.webpageTop;
                                        }
                                        if (lc0Var8.r.previewMessages.size() > 0 && (message3 = lc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                            message3.invert_media = messagePreviewParams9.webpageTop;
                                        }
                                        lc0Var8.i();
                                        lc0Var8.U = true;
                                        break;
                                }
                            }
                        });
                        lc0Var2 = lc0Var3;
                        viewOutlineProvider = null;
                    }
                }
            } else {
                if (!UserConfig.getInstance(rc0Var.w).isPremium()) {
                    for (int i22 = 0; i22 < messagePreviewParams.forwardMessages.messages.size(); i22++) {
                        if (messagePreviewParams.forwardMessages.messages.get(i22).type == 36) {
                            z10 = false;
                            break;
                        }
                    }
                }
                z10 = true;
                qc0 qc0Var6 = new qc0(context, R.raw.name_hide, LocaleController.getString(messagePreviewParams.multipleUsers ? R.string.ShowSenderNames : R.string.ShowSendersName), R.raw.name_show, LocaleController.getString(messagePreviewParams.multipleUsers ? R.string.HideSenderNames : R.string.HideSendersName), rc0Var.F);
                this.s.a(qc0Var6, w7.z5.n(-1, 48));
                if (messagePreviewParams.hasCaption) {
                    qc0Var = qc0Var6;
                    qc0 qc0Var7 = new qc0(context, R.raw.caption_hide, LocaleController.getString(R.string.ShowCaption), R.raw.caption_show, LocaleController.getString(R.string.HideCaption), rc0Var.F);
                    qc0Var7.a(messagePreviewParams.hideCaption, false);
                    this.s.a(qc0Var7, w7.z5.n(-1, 48));
                    qc0Var2 = qc0Var7;
                } else {
                    qc0Var = qc0Var6;
                    qc0Var2 = null;
                }
                org.telegram.ui.ActionBar.e1 e1Var3 = new org.telegram.ui.ActionBar.e1(0, context, rc0Var.F, true, false);
                final int i23 = 7;
                e1Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ub0
                    public final /* synthetic */ lc0 b;

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
                                lc0 lc0Var4 = this.b;
                                lc0Var4.c0.d.quote = null;
                                lc0Var4.e.f(false);
                                lc0Var4.h(false, false);
                                lc0Var4.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                lc0 lc0Var5 = this.b;
                                dc0 dc0Var2 = lc0Var5.e;
                                rc0 rc0Var2 = lc0Var5.c0;
                                if (lc0Var5.c(null) != null) {
                                    if (dc0Var2.v - dc0Var2.u <= MessagesController.getInstance(rc0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.w9 w9Var = dc0Var2.W;
                                        MessageObject c11 = lc0Var5.c(w9Var != null ? ((org.telegram.ui.Cells.t1) w9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams5 = rc0Var2.d;
                                        int i182 = dc0Var2.u;
                                        messagePreviewParams5.quoteStart = i182;
                                        int i192 = dc0Var2.v;
                                        messagePreviewParams5.quoteEnd = i192;
                                        messagePreviewParams5.quote = org.telegram.ui.in.c(c11, i182, i192);
                                        rc0Var2.b();
                                        rc0Var2.a(true);
                                        break;
                                    } else {
                                        lc0Var5.g();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                lc0 lc0Var6 = this.b;
                                dc0 dc0Var3 = lc0Var6.e;
                                rc0 rc0Var3 = lc0Var6.c0;
                                MessagePreviewParams messagePreviewParams6 = rc0Var3.d;
                                int i202 = rc0Var3.w;
                                boolean z14 = rc0Var3.b;
                                if (messagePreviewParams6.quote != null && !z14) {
                                    messagePreviewParams6.quote = null;
                                    dc0Var3.f(false);
                                    lc0Var6.h(false, true);
                                    lc0Var6.l(true);
                                    break;
                                } else if (dc0Var3.v - dc0Var3.u <= MessagesController.getInstance(i202).quoteLengthMax) {
                                    MessageObject c12 = lc0Var6.c(null);
                                    if (c12 != null) {
                                        if (!dc0Var3.x()) {
                                            messagePreviewParams6.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i202).quoteLengthMax, org.telegram.ui.in.d(c12));
                                            messagePreviewParams6.quoteEnd = min;
                                            messagePreviewParams6.quote = org.telegram.ui.in.c(c12, messagePreviewParams6.quoteStart, min);
                                            View d = lc0Var6.d();
                                            if (d instanceof org.telegram.ui.Cells.t1) {
                                                dc0Var3.Z((org.telegram.ui.Cells.t1) d, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                            }
                                            if (!z14) {
                                                lc0Var6.s.getSwipeBack().e(lc0Var6.I);
                                            }
                                            lc0Var6.h(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams6.quoteStart = dc0Var3.u;
                                            messagePreviewParams6.quoteEnd = dc0Var3.v;
                                            org.telegram.ui.Cells.w9 w9Var2 = dc0Var3.W;
                                            messagePreviewParams6.quote = org.telegram.ui.in.c(lc0Var6.c(w9Var2 != null ? ((org.telegram.ui.Cells.t1) w9Var2).getMessageObject() : null), messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                            rc0Var3.b();
                                            rc0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    lc0Var6.g();
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
                                rc0 rc0Var4 = this.b.c0;
                                if (!rc0Var4.b) {
                                    org.telegram.ui.bl blVar = (org.telegram.ui.bl) rc0Var4;
                                    blVar.a(true);
                                    org.telegram.ui.sn snVar = blVar.H;
                                    snVar.z5 = null;
                                    snVar.x5 = null;
                                    snVar.r5.updateReply(null, null, snVar.f6, null);
                                    snVar.m8();
                                    break;
                                } else {
                                    org.telegram.ui.bl blVar2 = (org.telegram.ui.bl) rc0Var4;
                                    blVar2.a(true);
                                    org.telegram.ui.sn snVar2 = blVar2.H;
                                    snVar2.x5 = null;
                                    snVar2.Hb(snVar2.z5);
                                    break;
                                }
                            case 7:
                                this.b.c0.c(true);
                                break;
                            case 8:
                                this.b.c0.a(true);
                                break;
                            case 9:
                                org.telegram.ui.bl blVar3 = (org.telegram.ui.bl) this.b.c0;
                                blVar3.a(true);
                                org.telegram.ui.sn snVar3 = blVar3.H;
                                snVar3.r5.updateForward(null, snVar3.f6);
                                snVar3.m8();
                                break;
                            case 10:
                                this.b.c0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.bl blVar4 = (org.telegram.ui.bl) this.b.c0;
                                blVar4.a(true);
                                org.telegram.ui.sn snVar4 = blVar4.H;
                                snVar4.S5 = null;
                                org.telegram.ui.gk gkVar = snVar4.Y;
                                if (gkVar != null) {
                                    gkVar.X2 = null;
                                    gkVar.Y2 = false;
                                }
                                MessagePreviewParams messagePreviewParams7 = snVar4.r5;
                                if (messagePreviewParams7 != null) {
                                    i172 = ((org.telegram.ui.ActionBar.o2) snVar4).currentAccount;
                                    MessageObject messageObject = snVar4.z5;
                                    messagePreviewParams7.updateLink(i172, null, null, messageObject == snVar4.j4 ? null : messageObject, snVar4.x5, snVar4.B5);
                                }
                                snVar4.m8();
                                break;
                            case 12:
                                lc0 lc0Var7 = this.b;
                                MessagePreviewParams messagePreviewParams8 = lc0Var7.c0.d;
                                if (messagePreviewParams8.hasMedia) {
                                    boolean z15 = !messagePreviewParams8.webpageSmall;
                                    messagePreviewParams8.webpageSmall = z15;
                                    lc0Var7.G.a(z15, true);
                                    lc0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                    if (lc0Var7.r.messages.size() > 0 && (message2 = lc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z16 = messagePreviewParams8.webpageSmall;
                                        messageMedia2.force_small_media = z16;
                                        messageMedia2.force_large_media = !z16;
                                    }
                                    if (lc0Var7.r.previewMessages.size() > 0 && (message = lc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z17 = messagePreviewParams8.webpageSmall;
                                        messageMedia.force_small_media = z17;
                                        messageMedia.force_large_media = !z17;
                                    }
                                    lc0Var7.i();
                                    lc0Var7.U = true;
                                    break;
                                }
                                break;
                            default:
                                lc0 lc0Var8 = this.b;
                                MessagePreviewParams messagePreviewParams9 = lc0Var8.c0.d;
                                boolean z18 = messagePreviewParams9.webpageTop;
                                messagePreviewParams9.webpageTop = !z18;
                                lc0Var8.E.a(z18, true);
                                if (lc0Var8.r.messages.size() > 0 && (message4 = lc0Var8.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams9.webpageTop;
                                }
                                if (lc0Var8.r.previewMessages.size() > 0 && (message3 = lc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams9.webpageTop;
                                }
                                lc0Var8.i();
                                lc0Var8.U = true;
                                break;
                        }
                    }
                });
                e1Var3.j(LocaleController.getString(R.string.ChangeRecipient), R.drawable.msg_forward_replace, null);
                this.s.a(e1Var3, w7.z5.n(-1, 48));
                org.telegram.ui.ActionBar.j1 j1Var2 = new org.telegram.ui.ActionBar.j1(context, nc0Var);
                org.telegram.ui.ActionBar.r6.j(j1Var2, org.telegram.ui.ActionBar.r6.M(0.06f, org.telegram.ui.ActionBar.k6.E8), nc0Var);
                j1Var2.setTag(R.id.fit_width_tag, 1);
                this.s.a(j1Var2, w7.z5.n(-1, 8));
                org.telegram.ui.ActionBar.e1 e1Var4 = new org.telegram.ui.ActionBar.e1(1, context, rc0Var.F, false, false);
                e1Var4.j(LocaleController.getString(R.string.ApplyChanges), R.drawable.msg_select, null);
                final int i24 = 8;
                e1Var4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ub0
                    public final /* synthetic */ lc0 b;

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
                                lc0 lc0Var4 = this.b;
                                lc0Var4.c0.d.quote = null;
                                lc0Var4.e.f(false);
                                lc0Var4.h(false, false);
                                lc0Var4.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                lc0 lc0Var5 = this.b;
                                dc0 dc0Var2 = lc0Var5.e;
                                rc0 rc0Var2 = lc0Var5.c0;
                                if (lc0Var5.c(null) != null) {
                                    if (dc0Var2.v - dc0Var2.u <= MessagesController.getInstance(rc0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.w9 w9Var = dc0Var2.W;
                                        MessageObject c11 = lc0Var5.c(w9Var != null ? ((org.telegram.ui.Cells.t1) w9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams5 = rc0Var2.d;
                                        int i182 = dc0Var2.u;
                                        messagePreviewParams5.quoteStart = i182;
                                        int i192 = dc0Var2.v;
                                        messagePreviewParams5.quoteEnd = i192;
                                        messagePreviewParams5.quote = org.telegram.ui.in.c(c11, i182, i192);
                                        rc0Var2.b();
                                        rc0Var2.a(true);
                                        break;
                                    } else {
                                        lc0Var5.g();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                lc0 lc0Var6 = this.b;
                                dc0 dc0Var3 = lc0Var6.e;
                                rc0 rc0Var3 = lc0Var6.c0;
                                MessagePreviewParams messagePreviewParams6 = rc0Var3.d;
                                int i202 = rc0Var3.w;
                                boolean z14 = rc0Var3.b;
                                if (messagePreviewParams6.quote != null && !z14) {
                                    messagePreviewParams6.quote = null;
                                    dc0Var3.f(false);
                                    lc0Var6.h(false, true);
                                    lc0Var6.l(true);
                                    break;
                                } else if (dc0Var3.v - dc0Var3.u <= MessagesController.getInstance(i202).quoteLengthMax) {
                                    MessageObject c12 = lc0Var6.c(null);
                                    if (c12 != null) {
                                        if (!dc0Var3.x()) {
                                            messagePreviewParams6.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i202).quoteLengthMax, org.telegram.ui.in.d(c12));
                                            messagePreviewParams6.quoteEnd = min;
                                            messagePreviewParams6.quote = org.telegram.ui.in.c(c12, messagePreviewParams6.quoteStart, min);
                                            View d = lc0Var6.d();
                                            if (d instanceof org.telegram.ui.Cells.t1) {
                                                dc0Var3.Z((org.telegram.ui.Cells.t1) d, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                            }
                                            if (!z14) {
                                                lc0Var6.s.getSwipeBack().e(lc0Var6.I);
                                            }
                                            lc0Var6.h(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams6.quoteStart = dc0Var3.u;
                                            messagePreviewParams6.quoteEnd = dc0Var3.v;
                                            org.telegram.ui.Cells.w9 w9Var2 = dc0Var3.W;
                                            messagePreviewParams6.quote = org.telegram.ui.in.c(lc0Var6.c(w9Var2 != null ? ((org.telegram.ui.Cells.t1) w9Var2).getMessageObject() : null), messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                            rc0Var3.b();
                                            rc0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    lc0Var6.g();
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
                                rc0 rc0Var4 = this.b.c0;
                                if (!rc0Var4.b) {
                                    org.telegram.ui.bl blVar = (org.telegram.ui.bl) rc0Var4;
                                    blVar.a(true);
                                    org.telegram.ui.sn snVar = blVar.H;
                                    snVar.z5 = null;
                                    snVar.x5 = null;
                                    snVar.r5.updateReply(null, null, snVar.f6, null);
                                    snVar.m8();
                                    break;
                                } else {
                                    org.telegram.ui.bl blVar2 = (org.telegram.ui.bl) rc0Var4;
                                    blVar2.a(true);
                                    org.telegram.ui.sn snVar2 = blVar2.H;
                                    snVar2.x5 = null;
                                    snVar2.Hb(snVar2.z5);
                                    break;
                                }
                            case 7:
                                this.b.c0.c(true);
                                break;
                            case 8:
                                this.b.c0.a(true);
                                break;
                            case 9:
                                org.telegram.ui.bl blVar3 = (org.telegram.ui.bl) this.b.c0;
                                blVar3.a(true);
                                org.telegram.ui.sn snVar3 = blVar3.H;
                                snVar3.r5.updateForward(null, snVar3.f6);
                                snVar3.m8();
                                break;
                            case 10:
                                this.b.c0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.bl blVar4 = (org.telegram.ui.bl) this.b.c0;
                                blVar4.a(true);
                                org.telegram.ui.sn snVar4 = blVar4.H;
                                snVar4.S5 = null;
                                org.telegram.ui.gk gkVar = snVar4.Y;
                                if (gkVar != null) {
                                    gkVar.X2 = null;
                                    gkVar.Y2 = false;
                                }
                                MessagePreviewParams messagePreviewParams7 = snVar4.r5;
                                if (messagePreviewParams7 != null) {
                                    i172 = ((org.telegram.ui.ActionBar.o2) snVar4).currentAccount;
                                    MessageObject messageObject = snVar4.z5;
                                    messagePreviewParams7.updateLink(i172, null, null, messageObject == snVar4.j4 ? null : messageObject, snVar4.x5, snVar4.B5);
                                }
                                snVar4.m8();
                                break;
                            case 12:
                                lc0 lc0Var7 = this.b;
                                MessagePreviewParams messagePreviewParams8 = lc0Var7.c0.d;
                                if (messagePreviewParams8.hasMedia) {
                                    boolean z15 = !messagePreviewParams8.webpageSmall;
                                    messagePreviewParams8.webpageSmall = z15;
                                    lc0Var7.G.a(z15, true);
                                    lc0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                    if (lc0Var7.r.messages.size() > 0 && (message2 = lc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z16 = messagePreviewParams8.webpageSmall;
                                        messageMedia2.force_small_media = z16;
                                        messageMedia2.force_large_media = !z16;
                                    }
                                    if (lc0Var7.r.previewMessages.size() > 0 && (message = lc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z17 = messagePreviewParams8.webpageSmall;
                                        messageMedia.force_small_media = z17;
                                        messageMedia.force_large_media = !z17;
                                    }
                                    lc0Var7.i();
                                    lc0Var7.U = true;
                                    break;
                                }
                                break;
                            default:
                                lc0 lc0Var8 = this.b;
                                MessagePreviewParams messagePreviewParams9 = lc0Var8.c0.d;
                                boolean z18 = messagePreviewParams9.webpageTop;
                                messagePreviewParams9.webpageTop = !z18;
                                lc0Var8.E.a(z18, true);
                                if (lc0Var8.r.messages.size() > 0 && (message4 = lc0Var8.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams9.webpageTop;
                                }
                                if (lc0Var8.r.previewMessages.size() > 0 && (message3 = lc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams9.webpageTop;
                                }
                                lc0Var8.i();
                                lc0Var8.U = true;
                                break;
                        }
                    }
                });
                this.s.a(e1Var4, w7.z5.n(-1, 48));
                org.telegram.ui.ActionBar.e1 e1Var5 = new org.telegram.ui.ActionBar.e1(1, context, rc0Var.F, false, true);
                e1Var5.j(LocaleController.getString(R.string.DoNotForward), R.drawable.msg_delete, null);
                int i25 = org.telegram.ui.ActionBar.k6.q7;
                int i26 = org.telegram.ui.ActionBar.k6.p7;
                e1Var5.c(i25, i26);
                final int i27 = 9;
                e1Var5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ub0
                    public final /* synthetic */ lc0 b;

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
                                lc0 lc0Var4 = this.b;
                                lc0Var4.c0.d.quote = null;
                                lc0Var4.e.f(false);
                                lc0Var4.h(false, false);
                                lc0Var4.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                lc0 lc0Var5 = this.b;
                                dc0 dc0Var2 = lc0Var5.e;
                                rc0 rc0Var2 = lc0Var5.c0;
                                if (lc0Var5.c(null) != null) {
                                    if (dc0Var2.v - dc0Var2.u <= MessagesController.getInstance(rc0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.w9 w9Var = dc0Var2.W;
                                        MessageObject c11 = lc0Var5.c(w9Var != null ? ((org.telegram.ui.Cells.t1) w9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams5 = rc0Var2.d;
                                        int i182 = dc0Var2.u;
                                        messagePreviewParams5.quoteStart = i182;
                                        int i192 = dc0Var2.v;
                                        messagePreviewParams5.quoteEnd = i192;
                                        messagePreviewParams5.quote = org.telegram.ui.in.c(c11, i182, i192);
                                        rc0Var2.b();
                                        rc0Var2.a(true);
                                        break;
                                    } else {
                                        lc0Var5.g();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                lc0 lc0Var6 = this.b;
                                dc0 dc0Var3 = lc0Var6.e;
                                rc0 rc0Var3 = lc0Var6.c0;
                                MessagePreviewParams messagePreviewParams6 = rc0Var3.d;
                                int i202 = rc0Var3.w;
                                boolean z14 = rc0Var3.b;
                                if (messagePreviewParams6.quote != null && !z14) {
                                    messagePreviewParams6.quote = null;
                                    dc0Var3.f(false);
                                    lc0Var6.h(false, true);
                                    lc0Var6.l(true);
                                    break;
                                } else if (dc0Var3.v - dc0Var3.u <= MessagesController.getInstance(i202).quoteLengthMax) {
                                    MessageObject c12 = lc0Var6.c(null);
                                    if (c12 != null) {
                                        if (!dc0Var3.x()) {
                                            messagePreviewParams6.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i202).quoteLengthMax, org.telegram.ui.in.d(c12));
                                            messagePreviewParams6.quoteEnd = min;
                                            messagePreviewParams6.quote = org.telegram.ui.in.c(c12, messagePreviewParams6.quoteStart, min);
                                            View d = lc0Var6.d();
                                            if (d instanceof org.telegram.ui.Cells.t1) {
                                                dc0Var3.Z((org.telegram.ui.Cells.t1) d, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                            }
                                            if (!z14) {
                                                lc0Var6.s.getSwipeBack().e(lc0Var6.I);
                                            }
                                            lc0Var6.h(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams6.quoteStart = dc0Var3.u;
                                            messagePreviewParams6.quoteEnd = dc0Var3.v;
                                            org.telegram.ui.Cells.w9 w9Var2 = dc0Var3.W;
                                            messagePreviewParams6.quote = org.telegram.ui.in.c(lc0Var6.c(w9Var2 != null ? ((org.telegram.ui.Cells.t1) w9Var2).getMessageObject() : null), messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                            rc0Var3.b();
                                            rc0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    lc0Var6.g();
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
                                rc0 rc0Var4 = this.b.c0;
                                if (!rc0Var4.b) {
                                    org.telegram.ui.bl blVar = (org.telegram.ui.bl) rc0Var4;
                                    blVar.a(true);
                                    org.telegram.ui.sn snVar = blVar.H;
                                    snVar.z5 = null;
                                    snVar.x5 = null;
                                    snVar.r5.updateReply(null, null, snVar.f6, null);
                                    snVar.m8();
                                    break;
                                } else {
                                    org.telegram.ui.bl blVar2 = (org.telegram.ui.bl) rc0Var4;
                                    blVar2.a(true);
                                    org.telegram.ui.sn snVar2 = blVar2.H;
                                    snVar2.x5 = null;
                                    snVar2.Hb(snVar2.z5);
                                    break;
                                }
                            case 7:
                                this.b.c0.c(true);
                                break;
                            case 8:
                                this.b.c0.a(true);
                                break;
                            case 9:
                                org.telegram.ui.bl blVar3 = (org.telegram.ui.bl) this.b.c0;
                                blVar3.a(true);
                                org.telegram.ui.sn snVar3 = blVar3.H;
                                snVar3.r5.updateForward(null, snVar3.f6);
                                snVar3.m8();
                                break;
                            case 10:
                                this.b.c0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.bl blVar4 = (org.telegram.ui.bl) this.b.c0;
                                blVar4.a(true);
                                org.telegram.ui.sn snVar4 = blVar4.H;
                                snVar4.S5 = null;
                                org.telegram.ui.gk gkVar = snVar4.Y;
                                if (gkVar != null) {
                                    gkVar.X2 = null;
                                    gkVar.Y2 = false;
                                }
                                MessagePreviewParams messagePreviewParams7 = snVar4.r5;
                                if (messagePreviewParams7 != null) {
                                    i172 = ((org.telegram.ui.ActionBar.o2) snVar4).currentAccount;
                                    MessageObject messageObject = snVar4.z5;
                                    messagePreviewParams7.updateLink(i172, null, null, messageObject == snVar4.j4 ? null : messageObject, snVar4.x5, snVar4.B5);
                                }
                                snVar4.m8();
                                break;
                            case 12:
                                lc0 lc0Var7 = this.b;
                                MessagePreviewParams messagePreviewParams8 = lc0Var7.c0.d;
                                if (messagePreviewParams8.hasMedia) {
                                    boolean z15 = !messagePreviewParams8.webpageSmall;
                                    messagePreviewParams8.webpageSmall = z15;
                                    lc0Var7.G.a(z15, true);
                                    lc0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                    if (lc0Var7.r.messages.size() > 0 && (message2 = lc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z16 = messagePreviewParams8.webpageSmall;
                                        messageMedia2.force_small_media = z16;
                                        messageMedia2.force_large_media = !z16;
                                    }
                                    if (lc0Var7.r.previewMessages.size() > 0 && (message = lc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z17 = messagePreviewParams8.webpageSmall;
                                        messageMedia.force_small_media = z17;
                                        messageMedia.force_large_media = !z17;
                                    }
                                    lc0Var7.i();
                                    lc0Var7.U = true;
                                    break;
                                }
                                break;
                            default:
                                lc0 lc0Var8 = this.b;
                                MessagePreviewParams messagePreviewParams9 = lc0Var8.c0.d;
                                boolean z18 = messagePreviewParams9.webpageTop;
                                messagePreviewParams9.webpageTop = !z18;
                                lc0Var8.E.a(z18, true);
                                if (lc0Var8.r.messages.size() > 0 && (message4 = lc0Var8.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams9.webpageTop;
                                }
                                if (lc0Var8.r.previewMessages.size() > 0 && (message3 = lc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams9.webpageTop;
                                }
                                lc0Var8.i();
                                lc0Var8.U = true;
                                break;
                        }
                    }
                });
                e1Var5.h(0.12f, i26);
                this.s.a(e1Var5, w7.z5.n(-1, 48));
                qc0 qc0Var8 = qc0Var;
                qc0Var8.a(messagePreviewParams.hideForwardSendersName, false);
                qc0 qc0Var9 = qc0Var2;
                lc0 lc0Var4 = this;
                qc0Var8.setOnClickListener(new xb0(this, z10, context, qc0Var9, qc0Var8, 0));
                lc0Var = lc0Var4;
                if (qc0Var9 != null) {
                    qc0Var9.setOnClickListener(new ai.v0(lc0Var4, qc0Var9, qc0Var8, 27));
                    lc0Var = lc0Var4;
                }
            }
            context2 = context;
            lc0Var2 = lc0Var;
            viewOutlineProvider = null;
        } else {
            if (!messages.hasText || messagePreviewParams4.isSecret) {
                r11 = 0;
                messagePreviewParams2 = messagePreviewParams4;
            } else {
                LinearLayout e = org.telegram.messenger.sl.e(context3, 1);
                if (z13) {
                    r112 = 0;
                    messagePreviewParams3 = messagePreviewParams4;
                    z11 = true;
                    linearLayout = e;
                    z12 = 1031127695;
                } else {
                    messagePreviewParams3 = messagePreviewParams4;
                    ?? r92 = e;
                    z12 = 1031127695;
                    r112 = 0;
                    org.telegram.ui.ActionBar.e1 e1Var6 = new org.telegram.ui.ActionBar.e1(0, context3, rc0Var.F, true, false);
                    e1Var6.j(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                    e1Var6.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ub0
                        public final /* synthetic */ lc0 b;

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
                                    lc0 lc0Var42 = this.b;
                                    lc0Var42.c0.d.quote = null;
                                    lc0Var42.e.f(false);
                                    lc0Var42.h(false, false);
                                    lc0Var42.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    lc0 lc0Var5 = this.b;
                                    dc0 dc0Var2 = lc0Var5.e;
                                    rc0 rc0Var2 = lc0Var5.c0;
                                    if (lc0Var5.c(null) != null) {
                                        if (dc0Var2.v - dc0Var2.u <= MessagesController.getInstance(rc0Var2.w).quoteLengthMax) {
                                            org.telegram.ui.Cells.w9 w9Var = dc0Var2.W;
                                            MessageObject c11 = lc0Var5.c(w9Var != null ? ((org.telegram.ui.Cells.t1) w9Var).getMessageObject() : null);
                                            MessagePreviewParams messagePreviewParams5 = rc0Var2.d;
                                            int i182 = dc0Var2.u;
                                            messagePreviewParams5.quoteStart = i182;
                                            int i192 = dc0Var2.v;
                                            messagePreviewParams5.quoteEnd = i192;
                                            messagePreviewParams5.quote = org.telegram.ui.in.c(c11, i182, i192);
                                            rc0Var2.b();
                                            rc0Var2.a(true);
                                            break;
                                        } else {
                                            lc0Var5.g();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    lc0 lc0Var6 = this.b;
                                    dc0 dc0Var3 = lc0Var6.e;
                                    rc0 rc0Var3 = lc0Var6.c0;
                                    MessagePreviewParams messagePreviewParams6 = rc0Var3.d;
                                    int i202 = rc0Var3.w;
                                    boolean z14 = rc0Var3.b;
                                    if (messagePreviewParams6.quote != null && !z14) {
                                        messagePreviewParams6.quote = null;
                                        dc0Var3.f(false);
                                        lc0Var6.h(false, true);
                                        lc0Var6.l(true);
                                        break;
                                    } else if (dc0Var3.v - dc0Var3.u <= MessagesController.getInstance(i202).quoteLengthMax) {
                                        MessageObject c12 = lc0Var6.c(null);
                                        if (c12 != null) {
                                            if (!dc0Var3.x()) {
                                                messagePreviewParams6.quoteStart = 0;
                                                int min = Math.min(MessagesController.getInstance(i202).quoteLengthMax, org.telegram.ui.in.d(c12));
                                                messagePreviewParams6.quoteEnd = min;
                                                messagePreviewParams6.quote = org.telegram.ui.in.c(c12, messagePreviewParams6.quoteStart, min);
                                                View d = lc0Var6.d();
                                                if (d instanceof org.telegram.ui.Cells.t1) {
                                                    dc0Var3.Z((org.telegram.ui.Cells.t1) d, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                                }
                                                if (!z14) {
                                                    lc0Var6.s.getSwipeBack().e(lc0Var6.I);
                                                }
                                                lc0Var6.h(true, true);
                                                break;
                                            } else {
                                                messagePreviewParams6.quoteStart = dc0Var3.u;
                                                messagePreviewParams6.quoteEnd = dc0Var3.v;
                                                org.telegram.ui.Cells.w9 w9Var2 = dc0Var3.W;
                                                messagePreviewParams6.quote = org.telegram.ui.in.c(lc0Var6.c(w9Var2 != null ? ((org.telegram.ui.Cells.t1) w9Var2).getMessageObject() : null), messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                                rc0Var3.b();
                                                rc0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        lc0Var6.g();
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
                                    rc0 rc0Var4 = this.b.c0;
                                    if (!rc0Var4.b) {
                                        org.telegram.ui.bl blVar = (org.telegram.ui.bl) rc0Var4;
                                        blVar.a(true);
                                        org.telegram.ui.sn snVar = blVar.H;
                                        snVar.z5 = null;
                                        snVar.x5 = null;
                                        snVar.r5.updateReply(null, null, snVar.f6, null);
                                        snVar.m8();
                                        break;
                                    } else {
                                        org.telegram.ui.bl blVar2 = (org.telegram.ui.bl) rc0Var4;
                                        blVar2.a(true);
                                        org.telegram.ui.sn snVar2 = blVar2.H;
                                        snVar2.x5 = null;
                                        snVar2.Hb(snVar2.z5);
                                        break;
                                    }
                                case 7:
                                    this.b.c0.c(true);
                                    break;
                                case 8:
                                    this.b.c0.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.bl blVar3 = (org.telegram.ui.bl) this.b.c0;
                                    blVar3.a(true);
                                    org.telegram.ui.sn snVar3 = blVar3.H;
                                    snVar3.r5.updateForward(null, snVar3.f6);
                                    snVar3.m8();
                                    break;
                                case 10:
                                    this.b.c0.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.bl blVar4 = (org.telegram.ui.bl) this.b.c0;
                                    blVar4.a(true);
                                    org.telegram.ui.sn snVar4 = blVar4.H;
                                    snVar4.S5 = null;
                                    org.telegram.ui.gk gkVar = snVar4.Y;
                                    if (gkVar != null) {
                                        gkVar.X2 = null;
                                        gkVar.Y2 = false;
                                    }
                                    MessagePreviewParams messagePreviewParams7 = snVar4.r5;
                                    if (messagePreviewParams7 != null) {
                                        i172 = ((org.telegram.ui.ActionBar.o2) snVar4).currentAccount;
                                        MessageObject messageObject = snVar4.z5;
                                        messagePreviewParams7.updateLink(i172, null, null, messageObject == snVar4.j4 ? null : messageObject, snVar4.x5, snVar4.B5);
                                    }
                                    snVar4.m8();
                                    break;
                                case 12:
                                    lc0 lc0Var7 = this.b;
                                    MessagePreviewParams messagePreviewParams8 = lc0Var7.c0.d;
                                    if (messagePreviewParams8.hasMedia) {
                                        boolean z15 = !messagePreviewParams8.webpageSmall;
                                        messagePreviewParams8.webpageSmall = z15;
                                        lc0Var7.G.a(z15, true);
                                        lc0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                        if (lc0Var7.r.messages.size() > 0 && (message2 = lc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z16 = messagePreviewParams8.webpageSmall;
                                            messageMedia2.force_small_media = z16;
                                            messageMedia2.force_large_media = !z16;
                                        }
                                        if (lc0Var7.r.previewMessages.size() > 0 && (message = lc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                            boolean z17 = messagePreviewParams8.webpageSmall;
                                            messageMedia.force_small_media = z17;
                                            messageMedia.force_large_media = !z17;
                                        }
                                        lc0Var7.i();
                                        lc0Var7.U = true;
                                        break;
                                    }
                                    break;
                                default:
                                    lc0 lc0Var8 = this.b;
                                    MessagePreviewParams messagePreviewParams9 = lc0Var8.c0.d;
                                    boolean z18 = messagePreviewParams9.webpageTop;
                                    messagePreviewParams9.webpageTop = !z18;
                                    lc0Var8.E.a(z18, true);
                                    if (lc0Var8.r.messages.size() > 0 && (message4 = lc0Var8.r.messages.get(0).messageOwner) != null) {
                                        message4.invert_media = messagePreviewParams9.webpageTop;
                                    }
                                    if (lc0Var8.r.previewMessages.size() > 0 && (message3 = lc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                        message3.invert_media = messagePreviewParams9.webpageTop;
                                    }
                                    lc0Var8.i();
                                    lc0Var8.U = true;
                                    break;
                            }
                        }
                    });
                    r92.addView(e1Var6, w7.z5.n(-1, 48));
                    org.telegram.ui.ActionBar.j1 j1Var3 = new org.telegram.ui.ActionBar.j1(context3, nc0Var);
                    org.telegram.ui.ActionBar.r6.j(j1Var3, org.telegram.ui.ActionBar.r6.M(0.06f, org.telegram.ui.ActionBar.k6.E8), nc0Var);
                    j1Var3.setTag(R.id.fit_width_tag, 1);
                    r92.addView(j1Var3, w7.z5.n(-1, 8));
                    org.telegram.ui.ActionBar.e1 e1Var7 = new org.telegram.ui.ActionBar.e1(0, context3, rc0Var.F, false, true);
                    e1Var7.j(LocaleController.getString(R.string.QuoteSelectedPart), R.drawable.menu_quote_specific, null);
                    z11 = true;
                    final boolean z14 = true ? 1 : 0;
                    e1Var7.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ub0
                        public final /* synthetic */ lc0 b;

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
                            switch (z14) {
                                case 0:
                                    lc0 lc0Var42 = this.b;
                                    lc0Var42.c0.d.quote = null;
                                    lc0Var42.e.f(false);
                                    lc0Var42.h(false, false);
                                    lc0Var42.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    lc0 lc0Var5 = this.b;
                                    dc0 dc0Var2 = lc0Var5.e;
                                    rc0 rc0Var2 = lc0Var5.c0;
                                    if (lc0Var5.c(null) != null) {
                                        if (dc0Var2.v - dc0Var2.u <= MessagesController.getInstance(rc0Var2.w).quoteLengthMax) {
                                            org.telegram.ui.Cells.w9 w9Var = dc0Var2.W;
                                            MessageObject c11 = lc0Var5.c(w9Var != null ? ((org.telegram.ui.Cells.t1) w9Var).getMessageObject() : null);
                                            MessagePreviewParams messagePreviewParams5 = rc0Var2.d;
                                            int i182 = dc0Var2.u;
                                            messagePreviewParams5.quoteStart = i182;
                                            int i192 = dc0Var2.v;
                                            messagePreviewParams5.quoteEnd = i192;
                                            messagePreviewParams5.quote = org.telegram.ui.in.c(c11, i182, i192);
                                            rc0Var2.b();
                                            rc0Var2.a(true);
                                            break;
                                        } else {
                                            lc0Var5.g();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    lc0 lc0Var6 = this.b;
                                    dc0 dc0Var3 = lc0Var6.e;
                                    rc0 rc0Var3 = lc0Var6.c0;
                                    MessagePreviewParams messagePreviewParams6 = rc0Var3.d;
                                    int i202 = rc0Var3.w;
                                    boolean z142 = rc0Var3.b;
                                    if (messagePreviewParams6.quote != null && !z142) {
                                        messagePreviewParams6.quote = null;
                                        dc0Var3.f(false);
                                        lc0Var6.h(false, true);
                                        lc0Var6.l(true);
                                        break;
                                    } else if (dc0Var3.v - dc0Var3.u <= MessagesController.getInstance(i202).quoteLengthMax) {
                                        MessageObject c12 = lc0Var6.c(null);
                                        if (c12 != null) {
                                            if (!dc0Var3.x()) {
                                                messagePreviewParams6.quoteStart = 0;
                                                int min = Math.min(MessagesController.getInstance(i202).quoteLengthMax, org.telegram.ui.in.d(c12));
                                                messagePreviewParams6.quoteEnd = min;
                                                messagePreviewParams6.quote = org.telegram.ui.in.c(c12, messagePreviewParams6.quoteStart, min);
                                                View d = lc0Var6.d();
                                                if (d instanceof org.telegram.ui.Cells.t1) {
                                                    dc0Var3.Z((org.telegram.ui.Cells.t1) d, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                                }
                                                if (!z142) {
                                                    lc0Var6.s.getSwipeBack().e(lc0Var6.I);
                                                }
                                                lc0Var6.h(true, true);
                                                break;
                                            } else {
                                                messagePreviewParams6.quoteStart = dc0Var3.u;
                                                messagePreviewParams6.quoteEnd = dc0Var3.v;
                                                org.telegram.ui.Cells.w9 w9Var2 = dc0Var3.W;
                                                messagePreviewParams6.quote = org.telegram.ui.in.c(lc0Var6.c(w9Var2 != null ? ((org.telegram.ui.Cells.t1) w9Var2).getMessageObject() : null), messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                                rc0Var3.b();
                                                rc0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        lc0Var6.g();
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
                                    rc0 rc0Var4 = this.b.c0;
                                    if (!rc0Var4.b) {
                                        org.telegram.ui.bl blVar = (org.telegram.ui.bl) rc0Var4;
                                        blVar.a(true);
                                        org.telegram.ui.sn snVar = blVar.H;
                                        snVar.z5 = null;
                                        snVar.x5 = null;
                                        snVar.r5.updateReply(null, null, snVar.f6, null);
                                        snVar.m8();
                                        break;
                                    } else {
                                        org.telegram.ui.bl blVar2 = (org.telegram.ui.bl) rc0Var4;
                                        blVar2.a(true);
                                        org.telegram.ui.sn snVar2 = blVar2.H;
                                        snVar2.x5 = null;
                                        snVar2.Hb(snVar2.z5);
                                        break;
                                    }
                                case 7:
                                    this.b.c0.c(true);
                                    break;
                                case 8:
                                    this.b.c0.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.bl blVar3 = (org.telegram.ui.bl) this.b.c0;
                                    blVar3.a(true);
                                    org.telegram.ui.sn snVar3 = blVar3.H;
                                    snVar3.r5.updateForward(null, snVar3.f6);
                                    snVar3.m8();
                                    break;
                                case 10:
                                    this.b.c0.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.bl blVar4 = (org.telegram.ui.bl) this.b.c0;
                                    blVar4.a(true);
                                    org.telegram.ui.sn snVar4 = blVar4.H;
                                    snVar4.S5 = null;
                                    org.telegram.ui.gk gkVar = snVar4.Y;
                                    if (gkVar != null) {
                                        gkVar.X2 = null;
                                        gkVar.Y2 = false;
                                    }
                                    MessagePreviewParams messagePreviewParams7 = snVar4.r5;
                                    if (messagePreviewParams7 != null) {
                                        i172 = ((org.telegram.ui.ActionBar.o2) snVar4).currentAccount;
                                        MessageObject messageObject = snVar4.z5;
                                        messagePreviewParams7.updateLink(i172, null, null, messageObject == snVar4.j4 ? null : messageObject, snVar4.x5, snVar4.B5);
                                    }
                                    snVar4.m8();
                                    break;
                                case 12:
                                    lc0 lc0Var7 = this.b;
                                    MessagePreviewParams messagePreviewParams8 = lc0Var7.c0.d;
                                    if (messagePreviewParams8.hasMedia) {
                                        boolean z15 = !messagePreviewParams8.webpageSmall;
                                        messagePreviewParams8.webpageSmall = z15;
                                        lc0Var7.G.a(z15, true);
                                        lc0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                        if (lc0Var7.r.messages.size() > 0 && (message2 = lc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z16 = messagePreviewParams8.webpageSmall;
                                            messageMedia2.force_small_media = z16;
                                            messageMedia2.force_large_media = !z16;
                                        }
                                        if (lc0Var7.r.previewMessages.size() > 0 && (message = lc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                            boolean z17 = messagePreviewParams8.webpageSmall;
                                            messageMedia.force_small_media = z17;
                                            messageMedia.force_large_media = !z17;
                                        }
                                        lc0Var7.i();
                                        lc0Var7.U = true;
                                        break;
                                    }
                                    break;
                                default:
                                    lc0 lc0Var8 = this.b;
                                    MessagePreviewParams messagePreviewParams9 = lc0Var8.c0.d;
                                    boolean z18 = messagePreviewParams9.webpageTop;
                                    messagePreviewParams9.webpageTop = !z18;
                                    lc0Var8.E.a(z18, true);
                                    if (lc0Var8.r.messages.size() > 0 && (message4 = lc0Var8.r.messages.get(0).messageOwner) != null) {
                                        message4.invert_media = messagePreviewParams9.webpageTop;
                                    }
                                    if (lc0Var8.r.previewMessages.size() > 0 && (message3 = lc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                        message3.invert_media = messagePreviewParams9.webpageTop;
                                    }
                                    lc0Var8.i();
                                    lc0Var8.U = true;
                                    break;
                            }
                        }
                    });
                    r92.addView(e1Var7, w7.z5.n(-1, 48));
                    linearLayout = r92;
                }
                this.I = actionBarPopupWindow$ActionBarPopupWindowLayout.b(linearLayout);
                actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().setStickToRight(z11);
                ?? frameLayout2 = new FrameLayout(context3);
                messagePreviewParams2 = messagePreviewParams3;
                ?? cc0Var = new cc0(1, 0, context, rc0Var.F, true, false);
                this.v = cc0Var;
                cc0Var.j(LocaleController.getString(z13 ? R.string.QuoteSelectedPart : R.string.SelectSpecificQuote), R.drawable.menu_select_quote, r112);
                ?? cc0Var2 = new cc0(1, 1, context, rc0Var.F, true, false);
                context3 = context;
                this.w = cc0Var2;
                cc0Var2.j(LocaleController.getString(R.string.ClearQuote), R.drawable.menu_quote_delete, r112);
                int i28 = org.telegram.ui.ActionBar.k6.I5;
                org.telegram.ui.Cells.y Z2 = org.telegram.ui.ActionBar.k6.Z(org.telegram.ui.ActionBar.k6.w0(i28, nc0Var), 6, 0);
                org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i28);
                frameLayout2.setBackground(Z2);
                org.telegram.ui.ActionBar.r6.k(frameLayout2, Z2, r112, O2, nc0Var);
                final int i29 = 2;
                frameLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ub0
                    public final /* synthetic */ lc0 b;

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
                                lc0 lc0Var42 = this.b;
                                lc0Var42.c0.d.quote = null;
                                lc0Var42.e.f(false);
                                lc0Var42.h(false, false);
                                lc0Var42.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                lc0 lc0Var5 = this.b;
                                dc0 dc0Var2 = lc0Var5.e;
                                rc0 rc0Var2 = lc0Var5.c0;
                                if (lc0Var5.c(null) != null) {
                                    if (dc0Var2.v - dc0Var2.u <= MessagesController.getInstance(rc0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.w9 w9Var = dc0Var2.W;
                                        MessageObject c11 = lc0Var5.c(w9Var != null ? ((org.telegram.ui.Cells.t1) w9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams5 = rc0Var2.d;
                                        int i182 = dc0Var2.u;
                                        messagePreviewParams5.quoteStart = i182;
                                        int i192 = dc0Var2.v;
                                        messagePreviewParams5.quoteEnd = i192;
                                        messagePreviewParams5.quote = org.telegram.ui.in.c(c11, i182, i192);
                                        rc0Var2.b();
                                        rc0Var2.a(true);
                                        break;
                                    } else {
                                        lc0Var5.g();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                lc0 lc0Var6 = this.b;
                                dc0 dc0Var3 = lc0Var6.e;
                                rc0 rc0Var3 = lc0Var6.c0;
                                MessagePreviewParams messagePreviewParams6 = rc0Var3.d;
                                int i202 = rc0Var3.w;
                                boolean z142 = rc0Var3.b;
                                if (messagePreviewParams6.quote != null && !z142) {
                                    messagePreviewParams6.quote = null;
                                    dc0Var3.f(false);
                                    lc0Var6.h(false, true);
                                    lc0Var6.l(true);
                                    break;
                                } else if (dc0Var3.v - dc0Var3.u <= MessagesController.getInstance(i202).quoteLengthMax) {
                                    MessageObject c12 = lc0Var6.c(null);
                                    if (c12 != null) {
                                        if (!dc0Var3.x()) {
                                            messagePreviewParams6.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i202).quoteLengthMax, org.telegram.ui.in.d(c12));
                                            messagePreviewParams6.quoteEnd = min;
                                            messagePreviewParams6.quote = org.telegram.ui.in.c(c12, messagePreviewParams6.quoteStart, min);
                                            View d = lc0Var6.d();
                                            if (d instanceof org.telegram.ui.Cells.t1) {
                                                dc0Var3.Z((org.telegram.ui.Cells.t1) d, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                            }
                                            if (!z142) {
                                                lc0Var6.s.getSwipeBack().e(lc0Var6.I);
                                            }
                                            lc0Var6.h(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams6.quoteStart = dc0Var3.u;
                                            messagePreviewParams6.quoteEnd = dc0Var3.v;
                                            org.telegram.ui.Cells.w9 w9Var2 = dc0Var3.W;
                                            messagePreviewParams6.quote = org.telegram.ui.in.c(lc0Var6.c(w9Var2 != null ? ((org.telegram.ui.Cells.t1) w9Var2).getMessageObject() : null), messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                            rc0Var3.b();
                                            rc0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    lc0Var6.g();
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
                                rc0 rc0Var4 = this.b.c0;
                                if (!rc0Var4.b) {
                                    org.telegram.ui.bl blVar = (org.telegram.ui.bl) rc0Var4;
                                    blVar.a(true);
                                    org.telegram.ui.sn snVar = blVar.H;
                                    snVar.z5 = null;
                                    snVar.x5 = null;
                                    snVar.r5.updateReply(null, null, snVar.f6, null);
                                    snVar.m8();
                                    break;
                                } else {
                                    org.telegram.ui.bl blVar2 = (org.telegram.ui.bl) rc0Var4;
                                    blVar2.a(true);
                                    org.telegram.ui.sn snVar2 = blVar2.H;
                                    snVar2.x5 = null;
                                    snVar2.Hb(snVar2.z5);
                                    break;
                                }
                            case 7:
                                this.b.c0.c(true);
                                break;
                            case 8:
                                this.b.c0.a(true);
                                break;
                            case 9:
                                org.telegram.ui.bl blVar3 = (org.telegram.ui.bl) this.b.c0;
                                blVar3.a(true);
                                org.telegram.ui.sn snVar3 = blVar3.H;
                                snVar3.r5.updateForward(null, snVar3.f6);
                                snVar3.m8();
                                break;
                            case 10:
                                this.b.c0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.bl blVar4 = (org.telegram.ui.bl) this.b.c0;
                                blVar4.a(true);
                                org.telegram.ui.sn snVar4 = blVar4.H;
                                snVar4.S5 = null;
                                org.telegram.ui.gk gkVar = snVar4.Y;
                                if (gkVar != null) {
                                    gkVar.X2 = null;
                                    gkVar.Y2 = false;
                                }
                                MessagePreviewParams messagePreviewParams7 = snVar4.r5;
                                if (messagePreviewParams7 != null) {
                                    i172 = ((org.telegram.ui.ActionBar.o2) snVar4).currentAccount;
                                    MessageObject messageObject = snVar4.z5;
                                    messagePreviewParams7.updateLink(i172, null, null, messageObject == snVar4.j4 ? null : messageObject, snVar4.x5, snVar4.B5);
                                }
                                snVar4.m8();
                                break;
                            case 12:
                                lc0 lc0Var7 = this.b;
                                MessagePreviewParams messagePreviewParams8 = lc0Var7.c0.d;
                                if (messagePreviewParams8.hasMedia) {
                                    boolean z15 = !messagePreviewParams8.webpageSmall;
                                    messagePreviewParams8.webpageSmall = z15;
                                    lc0Var7.G.a(z15, true);
                                    lc0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                    if (lc0Var7.r.messages.size() > 0 && (message2 = lc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z16 = messagePreviewParams8.webpageSmall;
                                        messageMedia2.force_small_media = z16;
                                        messageMedia2.force_large_media = !z16;
                                    }
                                    if (lc0Var7.r.previewMessages.size() > 0 && (message = lc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z17 = messagePreviewParams8.webpageSmall;
                                        messageMedia.force_small_media = z17;
                                        messageMedia.force_large_media = !z17;
                                    }
                                    lc0Var7.i();
                                    lc0Var7.U = true;
                                    break;
                                }
                                break;
                            default:
                                lc0 lc0Var8 = this.b;
                                MessagePreviewParams messagePreviewParams9 = lc0Var8.c0.d;
                                boolean z18 = messagePreviewParams9.webpageTop;
                                messagePreviewParams9.webpageTop = !z18;
                                lc0Var8.E.a(z18, true);
                                if (lc0Var8.r.messages.size() > 0 && (message4 = lc0Var8.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams9.webpageTop;
                                }
                                if (lc0Var8.r.previewMessages.size() > 0 && (message3 = lc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams9.webpageTop;
                                }
                                lc0Var8.i();
                                lc0Var8.U = true;
                                break;
                        }
                    }
                });
                frameLayout2.addView(cc0Var, w7.z5.c(48.0f, -1));
                frameLayout2.addView(cc0Var2, w7.z5.c(48.0f, -1));
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout2, w7.z5.n(-1, 48));
                r11 = r112;
            }
            messagePreviewParams = messagePreviewParams2;
            if (!messagePreviewParams.monoforum && !messagePreviewParams.noforwards && !messagePreviewParams.hasSecretMessages) {
                ?? frameLayout3 = new FrameLayout(context3);
                ?? e1Var8 = new org.telegram.ui.ActionBar.e1(1, context3, rc0Var.F, false, false);
                this.x = e1Var8;
                e1Var8.j(LocaleController.getString(R.string.ReplyToAnotherChat), R.drawable.msg_forward_replace, r11);
                final int i30 = 3;
                e1Var8.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ub0
                    public final /* synthetic */ lc0 b;

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
                                lc0 lc0Var42 = this.b;
                                lc0Var42.c0.d.quote = null;
                                lc0Var42.e.f(false);
                                lc0Var42.h(false, false);
                                lc0Var42.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                lc0 lc0Var5 = this.b;
                                dc0 dc0Var2 = lc0Var5.e;
                                rc0 rc0Var2 = lc0Var5.c0;
                                if (lc0Var5.c(null) != null) {
                                    if (dc0Var2.v - dc0Var2.u <= MessagesController.getInstance(rc0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.w9 w9Var = dc0Var2.W;
                                        MessageObject c11 = lc0Var5.c(w9Var != null ? ((org.telegram.ui.Cells.t1) w9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams5 = rc0Var2.d;
                                        int i182 = dc0Var2.u;
                                        messagePreviewParams5.quoteStart = i182;
                                        int i192 = dc0Var2.v;
                                        messagePreviewParams5.quoteEnd = i192;
                                        messagePreviewParams5.quote = org.telegram.ui.in.c(c11, i182, i192);
                                        rc0Var2.b();
                                        rc0Var2.a(true);
                                        break;
                                    } else {
                                        lc0Var5.g();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                lc0 lc0Var6 = this.b;
                                dc0 dc0Var3 = lc0Var6.e;
                                rc0 rc0Var3 = lc0Var6.c0;
                                MessagePreviewParams messagePreviewParams6 = rc0Var3.d;
                                int i202 = rc0Var3.w;
                                boolean z142 = rc0Var3.b;
                                if (messagePreviewParams6.quote != null && !z142) {
                                    messagePreviewParams6.quote = null;
                                    dc0Var3.f(false);
                                    lc0Var6.h(false, true);
                                    lc0Var6.l(true);
                                    break;
                                } else if (dc0Var3.v - dc0Var3.u <= MessagesController.getInstance(i202).quoteLengthMax) {
                                    MessageObject c12 = lc0Var6.c(null);
                                    if (c12 != null) {
                                        if (!dc0Var3.x()) {
                                            messagePreviewParams6.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i202).quoteLengthMax, org.telegram.ui.in.d(c12));
                                            messagePreviewParams6.quoteEnd = min;
                                            messagePreviewParams6.quote = org.telegram.ui.in.c(c12, messagePreviewParams6.quoteStart, min);
                                            View d = lc0Var6.d();
                                            if (d instanceof org.telegram.ui.Cells.t1) {
                                                dc0Var3.Z((org.telegram.ui.Cells.t1) d, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                            }
                                            if (!z142) {
                                                lc0Var6.s.getSwipeBack().e(lc0Var6.I);
                                            }
                                            lc0Var6.h(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams6.quoteStart = dc0Var3.u;
                                            messagePreviewParams6.quoteEnd = dc0Var3.v;
                                            org.telegram.ui.Cells.w9 w9Var2 = dc0Var3.W;
                                            messagePreviewParams6.quote = org.telegram.ui.in.c(lc0Var6.c(w9Var2 != null ? ((org.telegram.ui.Cells.t1) w9Var2).getMessageObject() : null), messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                            rc0Var3.b();
                                            rc0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    lc0Var6.g();
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
                                rc0 rc0Var4 = this.b.c0;
                                if (!rc0Var4.b) {
                                    org.telegram.ui.bl blVar = (org.telegram.ui.bl) rc0Var4;
                                    blVar.a(true);
                                    org.telegram.ui.sn snVar = blVar.H;
                                    snVar.z5 = null;
                                    snVar.x5 = null;
                                    snVar.r5.updateReply(null, null, snVar.f6, null);
                                    snVar.m8();
                                    break;
                                } else {
                                    org.telegram.ui.bl blVar2 = (org.telegram.ui.bl) rc0Var4;
                                    blVar2.a(true);
                                    org.telegram.ui.sn snVar2 = blVar2.H;
                                    snVar2.x5 = null;
                                    snVar2.Hb(snVar2.z5);
                                    break;
                                }
                            case 7:
                                this.b.c0.c(true);
                                break;
                            case 8:
                                this.b.c0.a(true);
                                break;
                            case 9:
                                org.telegram.ui.bl blVar3 = (org.telegram.ui.bl) this.b.c0;
                                blVar3.a(true);
                                org.telegram.ui.sn snVar3 = blVar3.H;
                                snVar3.r5.updateForward(null, snVar3.f6);
                                snVar3.m8();
                                break;
                            case 10:
                                this.b.c0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.bl blVar4 = (org.telegram.ui.bl) this.b.c0;
                                blVar4.a(true);
                                org.telegram.ui.sn snVar4 = blVar4.H;
                                snVar4.S5 = null;
                                org.telegram.ui.gk gkVar = snVar4.Y;
                                if (gkVar != null) {
                                    gkVar.X2 = null;
                                    gkVar.Y2 = false;
                                }
                                MessagePreviewParams messagePreviewParams7 = snVar4.r5;
                                if (messagePreviewParams7 != null) {
                                    i172 = ((org.telegram.ui.ActionBar.o2) snVar4).currentAccount;
                                    MessageObject messageObject = snVar4.z5;
                                    messagePreviewParams7.updateLink(i172, null, null, messageObject == snVar4.j4 ? null : messageObject, snVar4.x5, snVar4.B5);
                                }
                                snVar4.m8();
                                break;
                            case 12:
                                lc0 lc0Var7 = this.b;
                                MessagePreviewParams messagePreviewParams8 = lc0Var7.c0.d;
                                if (messagePreviewParams8.hasMedia) {
                                    boolean z15 = !messagePreviewParams8.webpageSmall;
                                    messagePreviewParams8.webpageSmall = z15;
                                    lc0Var7.G.a(z15, true);
                                    lc0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                    if (lc0Var7.r.messages.size() > 0 && (message2 = lc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z16 = messagePreviewParams8.webpageSmall;
                                        messageMedia2.force_small_media = z16;
                                        messageMedia2.force_large_media = !z16;
                                    }
                                    if (lc0Var7.r.previewMessages.size() > 0 && (message = lc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z17 = messagePreviewParams8.webpageSmall;
                                        messageMedia.force_small_media = z17;
                                        messageMedia.force_large_media = !z17;
                                    }
                                    lc0Var7.i();
                                    lc0Var7.U = true;
                                    break;
                                }
                                break;
                            default:
                                lc0 lc0Var8 = this.b;
                                MessagePreviewParams messagePreviewParams9 = lc0Var8.c0.d;
                                boolean z18 = messagePreviewParams9.webpageTop;
                                messagePreviewParams9.webpageTop = !z18;
                                lc0Var8.E.a(z18, true);
                                if (lc0Var8.r.messages.size() > 0 && (message4 = lc0Var8.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams9.webpageTop;
                                }
                                if (lc0Var8.r.previewMessages.size() > 0 && (message3 = lc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams9.webpageTop;
                                }
                                lc0Var8.i();
                                lc0Var8.U = true;
                                break;
                        }
                    }
                });
                context3 = context;
                ?? e1Var9 = new org.telegram.ui.ActionBar.e1(1, context3, rc0Var.F, false, false);
                this.y = e1Var9;
                e1Var9.j(LocaleController.getString(R.string.QuoteToAnotherChat), R.drawable.msg_forward_replace, r11);
                final int i31 = 4;
                e1Var9.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ub0
                    public final /* synthetic */ lc0 b;

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
                                lc0 lc0Var42 = this.b;
                                lc0Var42.c0.d.quote = null;
                                lc0Var42.e.f(false);
                                lc0Var42.h(false, false);
                                lc0Var42.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                lc0 lc0Var5 = this.b;
                                dc0 dc0Var2 = lc0Var5.e;
                                rc0 rc0Var2 = lc0Var5.c0;
                                if (lc0Var5.c(null) != null) {
                                    if (dc0Var2.v - dc0Var2.u <= MessagesController.getInstance(rc0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.w9 w9Var = dc0Var2.W;
                                        MessageObject c11 = lc0Var5.c(w9Var != null ? ((org.telegram.ui.Cells.t1) w9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams5 = rc0Var2.d;
                                        int i182 = dc0Var2.u;
                                        messagePreviewParams5.quoteStart = i182;
                                        int i192 = dc0Var2.v;
                                        messagePreviewParams5.quoteEnd = i192;
                                        messagePreviewParams5.quote = org.telegram.ui.in.c(c11, i182, i192);
                                        rc0Var2.b();
                                        rc0Var2.a(true);
                                        break;
                                    } else {
                                        lc0Var5.g();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                lc0 lc0Var6 = this.b;
                                dc0 dc0Var3 = lc0Var6.e;
                                rc0 rc0Var3 = lc0Var6.c0;
                                MessagePreviewParams messagePreviewParams6 = rc0Var3.d;
                                int i202 = rc0Var3.w;
                                boolean z142 = rc0Var3.b;
                                if (messagePreviewParams6.quote != null && !z142) {
                                    messagePreviewParams6.quote = null;
                                    dc0Var3.f(false);
                                    lc0Var6.h(false, true);
                                    lc0Var6.l(true);
                                    break;
                                } else if (dc0Var3.v - dc0Var3.u <= MessagesController.getInstance(i202).quoteLengthMax) {
                                    MessageObject c12 = lc0Var6.c(null);
                                    if (c12 != null) {
                                        if (!dc0Var3.x()) {
                                            messagePreviewParams6.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i202).quoteLengthMax, org.telegram.ui.in.d(c12));
                                            messagePreviewParams6.quoteEnd = min;
                                            messagePreviewParams6.quote = org.telegram.ui.in.c(c12, messagePreviewParams6.quoteStart, min);
                                            View d = lc0Var6.d();
                                            if (d instanceof org.telegram.ui.Cells.t1) {
                                                dc0Var3.Z((org.telegram.ui.Cells.t1) d, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                            }
                                            if (!z142) {
                                                lc0Var6.s.getSwipeBack().e(lc0Var6.I);
                                            }
                                            lc0Var6.h(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams6.quoteStart = dc0Var3.u;
                                            messagePreviewParams6.quoteEnd = dc0Var3.v;
                                            org.telegram.ui.Cells.w9 w9Var2 = dc0Var3.W;
                                            messagePreviewParams6.quote = org.telegram.ui.in.c(lc0Var6.c(w9Var2 != null ? ((org.telegram.ui.Cells.t1) w9Var2).getMessageObject() : null), messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                            rc0Var3.b();
                                            rc0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    lc0Var6.g();
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
                                rc0 rc0Var4 = this.b.c0;
                                if (!rc0Var4.b) {
                                    org.telegram.ui.bl blVar = (org.telegram.ui.bl) rc0Var4;
                                    blVar.a(true);
                                    org.telegram.ui.sn snVar = blVar.H;
                                    snVar.z5 = null;
                                    snVar.x5 = null;
                                    snVar.r5.updateReply(null, null, snVar.f6, null);
                                    snVar.m8();
                                    break;
                                } else {
                                    org.telegram.ui.bl blVar2 = (org.telegram.ui.bl) rc0Var4;
                                    blVar2.a(true);
                                    org.telegram.ui.sn snVar2 = blVar2.H;
                                    snVar2.x5 = null;
                                    snVar2.Hb(snVar2.z5);
                                    break;
                                }
                            case 7:
                                this.b.c0.c(true);
                                break;
                            case 8:
                                this.b.c0.a(true);
                                break;
                            case 9:
                                org.telegram.ui.bl blVar3 = (org.telegram.ui.bl) this.b.c0;
                                blVar3.a(true);
                                org.telegram.ui.sn snVar3 = blVar3.H;
                                snVar3.r5.updateForward(null, snVar3.f6);
                                snVar3.m8();
                                break;
                            case 10:
                                this.b.c0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.bl blVar4 = (org.telegram.ui.bl) this.b.c0;
                                blVar4.a(true);
                                org.telegram.ui.sn snVar4 = blVar4.H;
                                snVar4.S5 = null;
                                org.telegram.ui.gk gkVar = snVar4.Y;
                                if (gkVar != null) {
                                    gkVar.X2 = null;
                                    gkVar.Y2 = false;
                                }
                                MessagePreviewParams messagePreviewParams7 = snVar4.r5;
                                if (messagePreviewParams7 != null) {
                                    i172 = ((org.telegram.ui.ActionBar.o2) snVar4).currentAccount;
                                    MessageObject messageObject = snVar4.z5;
                                    messagePreviewParams7.updateLink(i172, null, null, messageObject == snVar4.j4 ? null : messageObject, snVar4.x5, snVar4.B5);
                                }
                                snVar4.m8();
                                break;
                            case 12:
                                lc0 lc0Var7 = this.b;
                                MessagePreviewParams messagePreviewParams8 = lc0Var7.c0.d;
                                if (messagePreviewParams8.hasMedia) {
                                    boolean z15 = !messagePreviewParams8.webpageSmall;
                                    messagePreviewParams8.webpageSmall = z15;
                                    lc0Var7.G.a(z15, true);
                                    lc0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                    if (lc0Var7.r.messages.size() > 0 && (message2 = lc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z16 = messagePreviewParams8.webpageSmall;
                                        messageMedia2.force_small_media = z16;
                                        messageMedia2.force_large_media = !z16;
                                    }
                                    if (lc0Var7.r.previewMessages.size() > 0 && (message = lc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z17 = messagePreviewParams8.webpageSmall;
                                        messageMedia.force_small_media = z17;
                                        messageMedia.force_large_media = !z17;
                                    }
                                    lc0Var7.i();
                                    lc0Var7.U = true;
                                    break;
                                }
                                break;
                            default:
                                lc0 lc0Var8 = this.b;
                                MessagePreviewParams messagePreviewParams9 = lc0Var8.c0.d;
                                boolean z18 = messagePreviewParams9.webpageTop;
                                messagePreviewParams9.webpageTop = !z18;
                                lc0Var8.E.a(z18, true);
                                if (lc0Var8.r.messages.size() > 0 && (message4 = lc0Var8.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams9.webpageTop;
                                }
                                if (lc0Var8.r.previewMessages.size() > 0 && (message3 = lc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams9.webpageTop;
                                }
                                lc0Var8.i();
                                lc0Var8.U = true;
                                break;
                        }
                    }
                });
                frameLayout3.addView(e1Var9, w7.z5.c(48.0f, -1));
                frameLayout3.addView(e1Var8, w7.z5.c(48.0f, -1));
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout3, w7.z5.n(-1, 48));
            }
            if (!messagePreviewParams.noforwards && !messagePreviewParams.hasSecretMessages) {
                org.telegram.ui.ActionBar.j1 j1Var4 = new org.telegram.ui.ActionBar.j1(context3, nc0Var);
                org.telegram.ui.ActionBar.r6.j(j1Var4, org.telegram.ui.ActionBar.r6.M(0.06f, org.telegram.ui.ActionBar.k6.E8), nc0Var);
                j1Var4.setTag(R.id.fit_width_tag, 1);
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(j1Var4, w7.z5.n(-1, 8));
            }
            h(messagePreviewParams.quote != null, false);
            ?? e1Var10 = new org.telegram.ui.ActionBar.e1(1, context3, rc0Var.F, false, false);
            e1Var10.j(LocaleController.getString(R.string.ApplyChanges), R.drawable.msg_select, r11);
            final int i32 = 5;
            e1Var10.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ub0
                public final /* synthetic */ lc0 b;

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
                            lc0 lc0Var42 = this.b;
                            lc0Var42.c0.d.quote = null;
                            lc0Var42.e.f(false);
                            lc0Var42.h(false, false);
                            lc0Var42.s.getSwipeBack().b(true);
                            break;
                        case 1:
                            lc0 lc0Var5 = this.b;
                            dc0 dc0Var2 = lc0Var5.e;
                            rc0 rc0Var2 = lc0Var5.c0;
                            if (lc0Var5.c(null) != null) {
                                if (dc0Var2.v - dc0Var2.u <= MessagesController.getInstance(rc0Var2.w).quoteLengthMax) {
                                    org.telegram.ui.Cells.w9 w9Var = dc0Var2.W;
                                    MessageObject c11 = lc0Var5.c(w9Var != null ? ((org.telegram.ui.Cells.t1) w9Var).getMessageObject() : null);
                                    MessagePreviewParams messagePreviewParams5 = rc0Var2.d;
                                    int i182 = dc0Var2.u;
                                    messagePreviewParams5.quoteStart = i182;
                                    int i192 = dc0Var2.v;
                                    messagePreviewParams5.quoteEnd = i192;
                                    messagePreviewParams5.quote = org.telegram.ui.in.c(c11, i182, i192);
                                    rc0Var2.b();
                                    rc0Var2.a(true);
                                    break;
                                } else {
                                    lc0Var5.g();
                                    break;
                                }
                            }
                            break;
                        case 2:
                            lc0 lc0Var6 = this.b;
                            dc0 dc0Var3 = lc0Var6.e;
                            rc0 rc0Var3 = lc0Var6.c0;
                            MessagePreviewParams messagePreviewParams6 = rc0Var3.d;
                            int i202 = rc0Var3.w;
                            boolean z142 = rc0Var3.b;
                            if (messagePreviewParams6.quote != null && !z142) {
                                messagePreviewParams6.quote = null;
                                dc0Var3.f(false);
                                lc0Var6.h(false, true);
                                lc0Var6.l(true);
                                break;
                            } else if (dc0Var3.v - dc0Var3.u <= MessagesController.getInstance(i202).quoteLengthMax) {
                                MessageObject c12 = lc0Var6.c(null);
                                if (c12 != null) {
                                    if (!dc0Var3.x()) {
                                        messagePreviewParams6.quoteStart = 0;
                                        int min = Math.min(MessagesController.getInstance(i202).quoteLengthMax, org.telegram.ui.in.d(c12));
                                        messagePreviewParams6.quoteEnd = min;
                                        messagePreviewParams6.quote = org.telegram.ui.in.c(c12, messagePreviewParams6.quoteStart, min);
                                        View d = lc0Var6.d();
                                        if (d instanceof org.telegram.ui.Cells.t1) {
                                            dc0Var3.Z((org.telegram.ui.Cells.t1) d, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                        }
                                        if (!z142) {
                                            lc0Var6.s.getSwipeBack().e(lc0Var6.I);
                                        }
                                        lc0Var6.h(true, true);
                                        break;
                                    } else {
                                        messagePreviewParams6.quoteStart = dc0Var3.u;
                                        messagePreviewParams6.quoteEnd = dc0Var3.v;
                                        org.telegram.ui.Cells.w9 w9Var2 = dc0Var3.W;
                                        messagePreviewParams6.quote = org.telegram.ui.in.c(lc0Var6.c(w9Var2 != null ? ((org.telegram.ui.Cells.t1) w9Var2).getMessageObject() : null), messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                        rc0Var3.b();
                                        rc0Var3.a(true);
                                        break;
                                    }
                                }
                            } else {
                                lc0Var6.g();
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
                            rc0 rc0Var4 = this.b.c0;
                            if (!rc0Var4.b) {
                                org.telegram.ui.bl blVar = (org.telegram.ui.bl) rc0Var4;
                                blVar.a(true);
                                org.telegram.ui.sn snVar = blVar.H;
                                snVar.z5 = null;
                                snVar.x5 = null;
                                snVar.r5.updateReply(null, null, snVar.f6, null);
                                snVar.m8();
                                break;
                            } else {
                                org.telegram.ui.bl blVar2 = (org.telegram.ui.bl) rc0Var4;
                                blVar2.a(true);
                                org.telegram.ui.sn snVar2 = blVar2.H;
                                snVar2.x5 = null;
                                snVar2.Hb(snVar2.z5);
                                break;
                            }
                        case 7:
                            this.b.c0.c(true);
                            break;
                        case 8:
                            this.b.c0.a(true);
                            break;
                        case 9:
                            org.telegram.ui.bl blVar3 = (org.telegram.ui.bl) this.b.c0;
                            blVar3.a(true);
                            org.telegram.ui.sn snVar3 = blVar3.H;
                            snVar3.r5.updateForward(null, snVar3.f6);
                            snVar3.m8();
                            break;
                        case 10:
                            this.b.c0.a(true);
                            break;
                        case 11:
                            org.telegram.ui.bl blVar4 = (org.telegram.ui.bl) this.b.c0;
                            blVar4.a(true);
                            org.telegram.ui.sn snVar4 = blVar4.H;
                            snVar4.S5 = null;
                            org.telegram.ui.gk gkVar = snVar4.Y;
                            if (gkVar != null) {
                                gkVar.X2 = null;
                                gkVar.Y2 = false;
                            }
                            MessagePreviewParams messagePreviewParams7 = snVar4.r5;
                            if (messagePreviewParams7 != null) {
                                i172 = ((org.telegram.ui.ActionBar.o2) snVar4).currentAccount;
                                MessageObject messageObject = snVar4.z5;
                                messagePreviewParams7.updateLink(i172, null, null, messageObject == snVar4.j4 ? null : messageObject, snVar4.x5, snVar4.B5);
                            }
                            snVar4.m8();
                            break;
                        case 12:
                            lc0 lc0Var7 = this.b;
                            MessagePreviewParams messagePreviewParams8 = lc0Var7.c0.d;
                            if (messagePreviewParams8.hasMedia) {
                                boolean z15 = !messagePreviewParams8.webpageSmall;
                                messagePreviewParams8.webpageSmall = z15;
                                lc0Var7.G.a(z15, true);
                                lc0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                if (lc0Var7.r.messages.size() > 0 && (message2 = lc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                    boolean z16 = messagePreviewParams8.webpageSmall;
                                    messageMedia2.force_small_media = z16;
                                    messageMedia2.force_large_media = !z16;
                                }
                                if (lc0Var7.r.previewMessages.size() > 0 && (message = lc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                    boolean z17 = messagePreviewParams8.webpageSmall;
                                    messageMedia.force_small_media = z17;
                                    messageMedia.force_large_media = !z17;
                                }
                                lc0Var7.i();
                                lc0Var7.U = true;
                                break;
                            }
                            break;
                        default:
                            lc0 lc0Var8 = this.b;
                            MessagePreviewParams messagePreviewParams9 = lc0Var8.c0.d;
                            boolean z18 = messagePreviewParams9.webpageTop;
                            messagePreviewParams9.webpageTop = !z18;
                            lc0Var8.E.a(z18, true);
                            if (lc0Var8.r.messages.size() > 0 && (message4 = lc0Var8.r.messages.get(0).messageOwner) != null) {
                                message4.invert_media = messagePreviewParams9.webpageTop;
                            }
                            if (lc0Var8.r.previewMessages.size() > 0 && (message3 = lc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                message3.invert_media = messagePreviewParams9.webpageTop;
                            }
                            lc0Var8.i();
                            lc0Var8.U = true;
                            break;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var10, w7.z5.n(-1, 48));
            ?? e1Var11 = new org.telegram.ui.ActionBar.e1(1, context, rc0Var.F, false, true);
            e1Var11.j(LocaleController.getString(z13 ? R.string.DoNotQuote : R.string.DoNotReply), R.drawable.msg_delete, r11);
            int i33 = org.telegram.ui.ActionBar.k6.q7;
            int i34 = org.telegram.ui.ActionBar.k6.p7;
            e1Var11.c(i33, i34);
            e1Var11.h(0.12f, i34);
            final int i35 = 6;
            e1Var11.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ub0
                public final /* synthetic */ lc0 b;

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
                            lc0 lc0Var42 = this.b;
                            lc0Var42.c0.d.quote = null;
                            lc0Var42.e.f(false);
                            lc0Var42.h(false, false);
                            lc0Var42.s.getSwipeBack().b(true);
                            break;
                        case 1:
                            lc0 lc0Var5 = this.b;
                            dc0 dc0Var2 = lc0Var5.e;
                            rc0 rc0Var2 = lc0Var5.c0;
                            if (lc0Var5.c(null) != null) {
                                if (dc0Var2.v - dc0Var2.u <= MessagesController.getInstance(rc0Var2.w).quoteLengthMax) {
                                    org.telegram.ui.Cells.w9 w9Var = dc0Var2.W;
                                    MessageObject c11 = lc0Var5.c(w9Var != null ? ((org.telegram.ui.Cells.t1) w9Var).getMessageObject() : null);
                                    MessagePreviewParams messagePreviewParams5 = rc0Var2.d;
                                    int i182 = dc0Var2.u;
                                    messagePreviewParams5.quoteStart = i182;
                                    int i192 = dc0Var2.v;
                                    messagePreviewParams5.quoteEnd = i192;
                                    messagePreviewParams5.quote = org.telegram.ui.in.c(c11, i182, i192);
                                    rc0Var2.b();
                                    rc0Var2.a(true);
                                    break;
                                } else {
                                    lc0Var5.g();
                                    break;
                                }
                            }
                            break;
                        case 2:
                            lc0 lc0Var6 = this.b;
                            dc0 dc0Var3 = lc0Var6.e;
                            rc0 rc0Var3 = lc0Var6.c0;
                            MessagePreviewParams messagePreviewParams6 = rc0Var3.d;
                            int i202 = rc0Var3.w;
                            boolean z142 = rc0Var3.b;
                            if (messagePreviewParams6.quote != null && !z142) {
                                messagePreviewParams6.quote = null;
                                dc0Var3.f(false);
                                lc0Var6.h(false, true);
                                lc0Var6.l(true);
                                break;
                            } else if (dc0Var3.v - dc0Var3.u <= MessagesController.getInstance(i202).quoteLengthMax) {
                                MessageObject c12 = lc0Var6.c(null);
                                if (c12 != null) {
                                    if (!dc0Var3.x()) {
                                        messagePreviewParams6.quoteStart = 0;
                                        int min = Math.min(MessagesController.getInstance(i202).quoteLengthMax, org.telegram.ui.in.d(c12));
                                        messagePreviewParams6.quoteEnd = min;
                                        messagePreviewParams6.quote = org.telegram.ui.in.c(c12, messagePreviewParams6.quoteStart, min);
                                        View d = lc0Var6.d();
                                        if (d instanceof org.telegram.ui.Cells.t1) {
                                            dc0Var3.Z((org.telegram.ui.Cells.t1) d, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                        }
                                        if (!z142) {
                                            lc0Var6.s.getSwipeBack().e(lc0Var6.I);
                                        }
                                        lc0Var6.h(true, true);
                                        break;
                                    } else {
                                        messagePreviewParams6.quoteStart = dc0Var3.u;
                                        messagePreviewParams6.quoteEnd = dc0Var3.v;
                                        org.telegram.ui.Cells.w9 w9Var2 = dc0Var3.W;
                                        messagePreviewParams6.quote = org.telegram.ui.in.c(lc0Var6.c(w9Var2 != null ? ((org.telegram.ui.Cells.t1) w9Var2).getMessageObject() : null), messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                        rc0Var3.b();
                                        rc0Var3.a(true);
                                        break;
                                    }
                                }
                            } else {
                                lc0Var6.g();
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
                            rc0 rc0Var4 = this.b.c0;
                            if (!rc0Var4.b) {
                                org.telegram.ui.bl blVar = (org.telegram.ui.bl) rc0Var4;
                                blVar.a(true);
                                org.telegram.ui.sn snVar = blVar.H;
                                snVar.z5 = null;
                                snVar.x5 = null;
                                snVar.r5.updateReply(null, null, snVar.f6, null);
                                snVar.m8();
                                break;
                            } else {
                                org.telegram.ui.bl blVar2 = (org.telegram.ui.bl) rc0Var4;
                                blVar2.a(true);
                                org.telegram.ui.sn snVar2 = blVar2.H;
                                snVar2.x5 = null;
                                snVar2.Hb(snVar2.z5);
                                break;
                            }
                        case 7:
                            this.b.c0.c(true);
                            break;
                        case 8:
                            this.b.c0.a(true);
                            break;
                        case 9:
                            org.telegram.ui.bl blVar3 = (org.telegram.ui.bl) this.b.c0;
                            blVar3.a(true);
                            org.telegram.ui.sn snVar3 = blVar3.H;
                            snVar3.r5.updateForward(null, snVar3.f6);
                            snVar3.m8();
                            break;
                        case 10:
                            this.b.c0.a(true);
                            break;
                        case 11:
                            org.telegram.ui.bl blVar4 = (org.telegram.ui.bl) this.b.c0;
                            blVar4.a(true);
                            org.telegram.ui.sn snVar4 = blVar4.H;
                            snVar4.S5 = null;
                            org.telegram.ui.gk gkVar = snVar4.Y;
                            if (gkVar != null) {
                                gkVar.X2 = null;
                                gkVar.Y2 = false;
                            }
                            MessagePreviewParams messagePreviewParams7 = snVar4.r5;
                            if (messagePreviewParams7 != null) {
                                i172 = ((org.telegram.ui.ActionBar.o2) snVar4).currentAccount;
                                MessageObject messageObject = snVar4.z5;
                                messagePreviewParams7.updateLink(i172, null, null, messageObject == snVar4.j4 ? null : messageObject, snVar4.x5, snVar4.B5);
                            }
                            snVar4.m8();
                            break;
                        case 12:
                            lc0 lc0Var7 = this.b;
                            MessagePreviewParams messagePreviewParams8 = lc0Var7.c0.d;
                            if (messagePreviewParams8.hasMedia) {
                                boolean z15 = !messagePreviewParams8.webpageSmall;
                                messagePreviewParams8.webpageSmall = z15;
                                lc0Var7.G.a(z15, true);
                                lc0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                if (lc0Var7.r.messages.size() > 0 && (message2 = lc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                    boolean z16 = messagePreviewParams8.webpageSmall;
                                    messageMedia2.force_small_media = z16;
                                    messageMedia2.force_large_media = !z16;
                                }
                                if (lc0Var7.r.previewMessages.size() > 0 && (message = lc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                    boolean z17 = messagePreviewParams8.webpageSmall;
                                    messageMedia.force_small_media = z17;
                                    messageMedia.force_large_media = !z17;
                                }
                                lc0Var7.i();
                                lc0Var7.U = true;
                                break;
                            }
                            break;
                        default:
                            lc0 lc0Var8 = this.b;
                            MessagePreviewParams messagePreviewParams9 = lc0Var8.c0.d;
                            boolean z18 = messagePreviewParams9.webpageTop;
                            messagePreviewParams9.webpageTop = !z18;
                            lc0Var8.E.a(z18, true);
                            if (lc0Var8.r.messages.size() > 0 && (message4 = lc0Var8.r.messages.get(0).messageOwner) != null) {
                                message4.invert_media = messagePreviewParams9.webpageTop;
                            }
                            if (lc0Var8.r.previewMessages.size() > 0 && (message3 = lc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                message3.invert_media = messagePreviewParams9.webpageTop;
                            }
                            lc0Var8.i();
                            lc0Var8.U = true;
                            break;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var11, w7.z5.n(-1, 48));
            context2 = context;
            lc0Var2 = this;
            viewOutlineProvider = r11;
        }
        int i36 = lc0Var2.a;
        if (i36 == 1) {
            lc0Var2.r = messagePreviewParams.forwardMessages;
        } else if (i36 == 0) {
            lc0Var2.r = messagePreviewParams.replyMessage;
        } else if (i36 == 2) {
            lc0Var2.r = messagePreviewParams.linkMessage;
        }
        org.telegram.ui.Cells.aa n10 = lc0Var2.e.n(context2);
        lc0Var2.d = n10;
        n10.setElevation(AndroidUtilities.dp(8.0f));
        n10.setOutlineProvider(viewOutlineProvider);
        if (n10.getParent() instanceof ViewGroup) {
            ((ViewGroup) n10.getParent()).removeView(n10);
        }
        lc0Var2.addView(n10, w7.z5.d(-1, -1.0f, 51, 0.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / AndroidUtilities.density, 0.0f, 0.0f));
        lc0Var2.e.S(lc0Var2.f);
    }

    public static MessageObject.GroupedMessages a(lc0 lc0Var, MessageObject messageObject) {
        if (messageObject.getGroupId() == 0) {
            return null;
        }
        MessageObject.GroupedMessages groupedMessages = lc0Var.r.groupedMessagesMap.get(messageObject.getGroupId());
        if (groupedMessages == null || (groupedMessages.messages.size() > 1 && groupedMessages.getPosition(messageObject) != null)) {
            return groupedMessages;
        }
        return null;
    }

    public static void b(lc0 lc0Var, org.telegram.ui.Cells.t1 t1Var) {
        CharacterStyle characterStyle;
        TLRPC.WebPage webPage;
        if (lc0Var.a == 2) {
            MessagePreviewParams messagePreviewParams = lc0Var.c0.d;
            if (!messagePreviewParams.singleLink && (characterStyle = messagePreviewParams.currentLink) != null && (webPage = messagePreviewParams.webpage) != null && !(webPage instanceof TLRPC.TL_webPagePending)) {
                t1Var.P3(characterStyle);
                return;
            }
        }
        t1Var.P3(null);
    }

    public final MessageObject c(MessageObject messageObject) {
        MessageObject.GroupedMessages valueAt;
        rc0 rc0Var = this.c0;
        MessagePreviewParams.Messages messages = rc0Var.d.replyMessage;
        if (messages == null) {
            return null;
        }
        LongSparseArray<MessageObject.GroupedMessages> longSparseArray = messages.groupedMessagesMap;
        if (longSparseArray == null || longSparseArray.size() <= 0 || (valueAt = rc0Var.d.replyMessage.groupedMessagesMap.valueAt(0)) == null) {
            return rc0Var.d.replyMessage.messages.get(0);
        }
        if (valueAt.isDocuments) {
            if (messageObject != null) {
                return messageObject;
            }
            org.telegram.ui.in inVar = rc0Var.d.quote;
            if (inVar != null) {
                return inVar.a;
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
                ec0 ec0Var = this.f;
                if (i10 >= ec0Var.getChildCount()) {
                    break;
                }
                View childAt = ec0Var.getChildAt(i10);
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) childAt;
                if (n4Var.getMessageObject() != null && (n4Var.getMessageObject() == c10 || n4Var.getMessageObject().getId() == c10.getId())) {
                    break;
                }
                i10++;
            }
        }
        return null;
    }

    public final boolean e(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject c10;
        if (t1Var == null || t1Var.getMessageObject() == null || (c10 = c(null)) == null) {
            return false;
        }
        return t1Var.getMessageObject() == c10 || t1Var.getMessageObject().getId() == c10.getId();
    }

    public final void f(float f7, int i10) {
        boolean z10 = this.c0.v;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        tb0 tb0Var = this.c;
        org.telegram.ui.y8 y8Var = this.b;
        if (z10) {
            tb0Var.setTranslationY(0.0f);
            y8Var.invalidateOutline();
            y8Var.setTranslationY(0.0f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(0.0f);
        } else {
            tb0Var.setTranslationY(i10);
            y8Var.invalidateOutline();
            y8Var.setTranslationY(f7);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((f7 + y8Var.getMeasuredHeight()) - AndroidUtilities.dp(2.0f));
        }
        float x10 = y8Var.getX();
        org.telegram.ui.Cells.aa aaVar = this.d;
        aaVar.setTranslationX(x10);
        aaVar.setTranslationY(y8Var.getY());
    }

    public final void g() {
        rc0 rc0Var = this.c0;
        new xc(rc0Var, rc0Var.F).M(LocaleController.getString(R.string.QuoteMaxError), LocaleController.getString(R.string.QuoteMaxErrorMessage), R.raw.error).j();
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
        org.telegram.ui.ActionBar.e1 e1Var = this.y;
        org.telegram.ui.ActionBar.e1 e1Var2 = this.x;
        cc0 cc0Var = this.w;
        cc0 cc0Var2 = this.v;
        if (!z11) {
            if (cc0Var2 != null) {
                cc0Var2.setAlpha(!z10 ? 1.0f : 0.0f);
                cc0Var2.setVisibility(!z10 ? 0 : 4);
            }
            if (cc0Var != null) {
                cc0Var.setAlpha(z10 ? 1.0f : 0.0f);
                cc0Var.setVisibility(z10 ? 0 : 4);
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
        if (cc0Var2 != null) {
            cc0Var2.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(cc0Var2, (Property<cc0, Float>) property, !z10 ? 1.0f : 0.0f));
        }
        if (cc0Var != null) {
            cc0Var.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(cc0Var, (Property<cc0, Float>) property, z10 ? 1.0f : 0.0f));
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
        this.P.setInterpolator(bs.h);
        this.P.addListener(new org.telegram.ui.ho(16, this, z10));
        this.P.start();
    }

    public final void i() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        rc0 rc0Var = this.c0;
        MessagePreviewParams messagePreviewParams = rc0Var.d;
        gc0 gc0Var = this.h;
        if (gc0Var.k()) {
            this.V = true;
            return;
        }
        for (int i10 = 0; i10 < this.r.previewMessages.size(); i10++) {
            MessageObject messageObject = this.r.previewMessages.get(i10);
            messageObject.forceUpdate = true;
            messageObject.sendAsPeer = rc0Var.a;
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
            gc0Var.V(this.r.groupedMessagesMap.valueAt(i12));
        }
        this.n.q(0, this.r.previewMessages.size());
    }

    public final void j() {
        int i10 = this.R;
        float f7 = this.S;
        rc0 rc0Var = this.c0;
        boolean z10 = rc0Var.v;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        ec0 ec0Var = this.f;
        if (z10) {
            this.S = 0.0f;
            this.R = 0;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(AndroidUtilities.dp(8.0f) + ec0Var.getMeasuredWidth());
        } else {
            int measuredHeight = ec0Var.getMeasuredHeight();
            int i11 = 0;
            for (int i12 = 0; i12 < ec0Var.getChildCount(); i12++) {
                View childAt = ec0Var.getChildAt(i12);
                if (RecyclerView.R(childAt) != -1) {
                    measuredHeight = Math.min(measuredHeight, childAt.getTop());
                    i11++;
                }
            }
            MessagePreviewParams.Messages messages = this.r;
            if (messages == null || i11 == 0 || i11 > messages.previewMessages.size()) {
                this.R = 0;
            } else {
                int g10 = i2.o1.g(4.0f, measuredHeight, 0);
                this.R = g10;
                this.R = Math.min(((ec0Var.getMeasuredHeight() - this.R) + g10) - ((int) ((((AndroidUtilities.displaySize.y - (Build.VERSION.SDK_INT >= 35 ? AndroidUtilities.navigationBarHeight : 0)) * 0.8f) - this.W) - AndroidUtilities.dp(8.0f))), this.R);
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
                f(f10, i13);
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = rc0Var.h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        rc0Var.h = ofFloat;
        ofFloat.addUpdateListener(new zj(this, i10, f7, 1));
        rc0Var.h.setDuration(250L);
        rc0Var.h.setInterpolator(li.m.V);
        rc0Var.h.addListener(new i60(this, 5));
        AndroidUtilities.runOnUIThread(rc0Var.y, 50L);
        this.T = i10;
        f(f7, i10);
    }

    public final void k() {
        MessageObject messageObject;
        rc0 rc0Var = this.c0;
        MessagePreviewParams messagePreviewParams = rc0Var.d;
        if (this.a == 0) {
            dc0 dc0Var = this.e;
            if (dc0Var.v - dc0Var.u > MessagesController.getInstance(rc0Var.w).quoteLengthMax) {
                return;
            }
            org.telegram.ui.Cells.w9 w9Var = dc0Var.W;
            MessageObject c10 = c(w9Var != null ? ((org.telegram.ui.Cells.t1) w9Var).getMessageObject() : null);
            if (messagePreviewParams.quote != null && dc0Var.x()) {
                messagePreviewParams.quoteStart = dc0Var.u;
                messagePreviewParams.quoteEnd = dc0Var.v;
                if (c10 != null) {
                    org.telegram.ui.in inVar = messagePreviewParams.quote;
                    if (inVar.m || (messageObject = inVar.a) == null || messageObject.getId() != c10.getId()) {
                        messagePreviewParams.quote = org.telegram.ui.in.c(c10, messagePreviewParams.quoteStart, messagePreviewParams.quoteEnd);
                        rc0Var.b();
                    }
                }
            }
            dc0Var.f(false);
        }
    }

    public final void l(boolean z10) {
        rc0 rc0Var = this.c0;
        TLRPC.User user = rc0Var.n;
        MessagePreviewParams messagePreviewParams = rc0Var.d;
        TLRPC.Chat chat = rc0Var.r;
        tb0 tb0Var = this.c;
        int i10 = this.a;
        if (i10 == 1) {
            MessagePreviewParams.Messages messages = messagePreviewParams.forwardMessages;
            tb0Var.b(LocaleController.formatPluralString("PreviewForwardMessagesCount", messages == null ? 0 : messages.selectedIds.size(), new Object[0]), z10);
            tb0Var.a(!messagePreviewParams.hasSenders ? messagePreviewParams.willSeeSenders ? user != null ? LocaleController.formatString("ForwardPreviewSendersNameVisible", R.string.ForwardPreviewSendersNameVisible, ContactsController.formatName(user.first_name, user.last_name)) : (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.ForwardPreviewSendersNameVisibleGroup) : LocaleController.getString(R.string.ForwardPreviewSendersNameVisibleChannel) : user != null ? LocaleController.formatString("ForwardPreviewSendersNameVisible", R.string.ForwardPreviewSendersNameVisible, ContactsController.formatName(user.first_name, user.last_name)) : (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.ForwardPreviewSendersNameHiddenGroup) : LocaleController.getString(R.string.ForwardPreviewSendersNameHiddenChannel) : !messagePreviewParams.hideForwardSendersName ? user != null ? LocaleController.formatString("ForwardPreviewSendersNameVisible", R.string.ForwardPreviewSendersNameVisible, ContactsController.formatName(user.first_name, user.last_name)) : (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.ForwardPreviewSendersNameVisibleGroup) : LocaleController.getString(R.string.ForwardPreviewSendersNameVisibleChannel) : user != null ? LocaleController.formatString("ForwardPreviewSendersNameHidden", R.string.ForwardPreviewSendersNameHidden, ContactsController.formatName(user.first_name, user.last_name)) : (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.ForwardPreviewSendersNameHiddenGroup) : LocaleController.getString(R.string.ForwardPreviewSendersNameHiddenChannel), z10);
        } else {
            if (i10 != 0) {
                if (i10 == 2) {
                    tb0Var.b(LocaleController.getString(R.string.MessageOptionsLinkTitle), z10);
                    tb0Var.a(LocaleController.getString(R.string.MessageOptionsLinkSubtitle), z10);
                    return;
                }
                return;
            }
            if (messagePreviewParams.quote == null || !messagePreviewParams.replyMessage.hasText) {
                tb0Var.b(LocaleController.getString(R.string.MessageOptionsReplyTitle), z10);
                tb0Var.a(messagePreviewParams.replyMessage.hasText ? LocaleController.getString(R.string.MessageOptionsReplySubtitle) : "", z10);
            } else {
                tb0Var.b(LocaleController.getString(R.string.PreviewQuoteUpdate), z10);
                tb0Var.a(LocaleController.getString(R.string.PreviewQuoteUpdateSubtitle), z10);
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
        rc0 rc0Var = this.c0;
        rc0Var.v = z10;
        this.W = 0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(i10, makeMeasureSpec);
        int i12 = this.W;
        int measuredHeight = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
        Rect rect = this.Q;
        this.W = Math.max(i12, measuredHeight + rect.top + rect.bottom);
        ((ViewGroup.MarginLayoutParams) this.f.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        boolean z11 = rc0Var.v;
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
                messageObject.parentWidth = rc0Var.v ? y8Var.getLayoutParams().width : View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(16.0f);
                messageObject.resetLayout();
                messageObject.forceUpdate = true;
                kc0 kc0Var = this.n;
                if (kc0Var != null) {
                    kc0Var.l();
                }
            }
            this.K = true;
        }
        this.a0 = size;
        super.onMeasure(i10, i11);
    }
}
