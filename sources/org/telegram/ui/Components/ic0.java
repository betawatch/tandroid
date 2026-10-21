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

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
    public final org.telegram.ui.y8 b;
    public boolean b0;
    public final ah.v c;
    public final /* synthetic */ oc0 c0;
    public final org.telegram.ui.Cells.z9 d;
    public final ac0 e;
    public final bc0 f;
    public final dc0 h;
    public final hc0 n;
    public MessagePreviewParams.Messages r;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout s;
    public final zb0 v;
    public final zb0 w;
    public final org.telegram.ui.ActionBar.e1 x;
    public final org.telegram.ui.ActionBar.e1 y;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [android.graphics.drawable.Drawable, boolean[]] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r13v8, types: [android.view.View, org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout] */
    /* JADX WARN: Type inference failed for: r2v60, types: [android.view.View, org.telegram.ui.ActionBar.e1] */
    /* JADX WARN: Type inference failed for: r2v61, types: [android.view.View, org.telegram.ui.ActionBar.e1] */
    /* JADX WARN: Type inference failed for: r2v67, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r2v68, types: [android.view.View, org.telegram.ui.ActionBar.e1] */
    /* JADX WARN: Type inference failed for: r2v69, types: [android.view.View, org.telegram.ui.ActionBar.e1] */
    /* JADX WARN: Type inference failed for: r34v0, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout, java.lang.Object, org.telegram.ui.Components.ic0] */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.view.View, android.view.ViewGroup, org.telegram.ui.Components.lw0, org.telegram.ui.y8] */
    /* JADX WARN: Type inference failed for: r3v6, types: [bh.b] */
    /* JADX WARN: Type inference failed for: r9v8, types: [android.view.ViewGroup] */
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
        nc0 nc0Var2;
        ViewOutlineProvider viewOutlineProvider;
        ic0 ic0Var2;
        MessagePreviewParams.Messages messages;
        ?? r11;
        MessagePreviewParams messagePreviewParams2;
        Drawable drawable;
        MessagePreviewParams messagePreviewParams3;
        boolean z11;
        LinearLayout linearLayout;
        boolean z12;
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
        ?? y8Var = new org.telegram.ui.y8(this, context3, i11);
        this.b = y8Var;
        kc0 kc0Var = oc0Var.F;
        boolean z13 = oc0Var.b;
        MessagePreviewParams messagePreviewParams4 = oc0Var.d;
        Drawable e = ((org.telegram.ui.on) kc0Var).e();
        if (((org.telegram.ui.on) kc0Var).f == null) {
            int i13 = org.telegram.ui.ActionBar.h6.a;
        }
        y8Var.V(e);
        y8Var.setOccupyStatusBar(false);
        int i14 = 3;
        y8Var.setOutlineProvider(new dh.b(this, i14));
        y8Var.setClipToOutline(true);
        y8Var.setElevation(AndroidUtilities.dp(4.0f));
        ah.v vVar = new ah.v(context3, 14, kc0Var);
        this.c = vVar;
        vVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.s8, kc0Var));
        ac0 ac0Var = new ac0(this);
        this.e = ac0Var;
        ac0Var.D = new ci.o2(this, i14);
        bc0 bc0Var = new bc0(this, context3, kc0Var);
        this.f = bc0Var;
        dc0 dc0Var = new dc0(this, bc0Var, kc0Var);
        this.h = dc0Var;
        bc0Var.setItemAnimator(dc0Var);
        bc0Var.setOnScrollListener(new kv(this, 4));
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
        y8Var.addView(bc0Var);
        addView(y8Var, w7.z5.d(-1, 400.0f, 0, 8.0f, 0.0f, 8.0f, 0.0f));
        y8Var.addView(vVar, w7.z5.c(-2.0f, -1));
        ?? actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert2, 1, getContext(), kc0Var);
        this.s = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().setOnForegroundOpenFinished(new ub0(this, i11));
        dh.d c10 = oc0Var.G.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, false);
        c10.o(fh.c.k(kc0Var));
        c10.p(AndroidUtilities.dp(8.0f));
        c10.j.e = true;
        c10.q(AndroidUtilities.dp(12.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c10);
        addView(actionBarPopupWindow$ActionBarPopupWindowLayout, w7.z5.c(-2.0f, -2));
        if (i10 != 0 || (messages = messagePreviewParams4.replyMessage) == null) {
            messagePreviewParams = messagePreviewParams4;
            if (i10 != 1 || messagePreviewParams.forwardMessages == null) {
                final ic0 ic0Var3 = this;
                ic0Var = ic0Var3;
                if (i10 == 2) {
                    ic0Var = ic0Var3;
                    if (messagePreviewParams.linkMessage != null) {
                        nc0 nc0Var3 = new nc0(context, R.raw.position_below, LocaleController.getString(R.string.LinkAbove), R.raw.position_above, LocaleController.getString(R.string.LinkBelow), oc0Var.F);
                        ic0Var3.E = nc0Var3;
                        nc0Var3.a(!messagePreviewParams.webpageTop, false);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(nc0Var3, w7.z5.n(-1, 48));
                        FrameLayout frameLayout = new FrameLayout(context);
                        ic0Var3.F = frameLayout;
                        frameLayout.setBackground(org.telegram.ui.ActionBar.h6.Z(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.I5, kc0Var), 0, 0));
                        nc0 nc0Var4 = new nc0(context, R.raw.media_shrink, LocaleController.getString(R.string.LinkMediaLarger), R.raw.media_enlarge, LocaleController.getString(R.string.LinkMediaSmaller), oc0Var.F);
                        ic0Var3.G = nc0Var4;
                        nc0Var4.setBackground(null);
                        nc0Var4.setVisibility(messagePreviewParams.isVideo ? 4 : 0);
                        frameLayout.addView(nc0Var4, w7.z5.n(-1, 48));
                        nc0 nc0Var5 = new nc0(context, R.raw.media_shrink, LocaleController.getString(R.string.LinkVideoLarger), R.raw.media_enlarge, LocaleController.getString(R.string.LinkVideoSmaller), oc0Var.F);
                        ic0Var3.H = nc0Var5;
                        nc0Var5.setBackground(null);
                        nc0Var5.setVisibility(!messagePreviewParams.isVideo ? 4 : 0);
                        frameLayout.setAlpha(messagePreviewParams.hasMedia ? 1.0f : 0.5f);
                        frameLayout.addView(nc0Var5, w7.z5.n(-1, 48));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, w7.z5.n(-1, 48));
                        frameLayout.setVisibility((!messagePreviewParams.singleLink || messagePreviewParams.hasMedia) ? 0 : 8);
                        nc0Var4.a(messagePreviewParams.webpageSmall, false);
                        nc0Var5.a(messagePreviewParams.webpageSmall, false);
                        org.telegram.ui.ActionBar.j1 j1Var = new org.telegram.ui.ActionBar.j1(context, kc0Var);
                        j1Var.setColor(org.telegram.ui.ActionBar.h6.m1(0.06f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.E8, kc0Var)));
                        j1Var.setTag(R.id.fit_width_tag, 1);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(j1Var, w7.z5.n(-1, 8));
                        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(1, context, oc0Var.F, false, false);
                        e1Var.g(LocaleController.getString(R.string.ApplyChanges), R.drawable.msg_select, null);
                        final int i15 = 10;
                        e1Var.setOnClickListener(new View.OnClickListener(ic0Var3) { // from class: org.telegram.ui.Components.sb0
                            public final /* synthetic */ ic0 b;

                            {
                                this.b = ic0Var3;
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
                                                org.telegram.ui.Cells.v9 v9Var = ac0Var2.W;
                                                MessageObject c11 = ic0Var5.c(v9Var != null ? ((org.telegram.ui.Cells.u1) v9Var).getMessageObject() : null);
                                                MessagePreviewParams messagePreviewParams5 = oc0Var2.d;
                                                int i17 = ac0Var2.u;
                                                messagePreviewParams5.quoteStart = i17;
                                                int i18 = ac0Var2.v;
                                                messagePreviewParams5.quoteEnd = i18;
                                                messagePreviewParams5.quote = org.telegram.ui.gn.c(c11, i17, i18);
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
                                        MessagePreviewParams messagePreviewParams6 = oc0Var3.d;
                                        int i19 = oc0Var3.w;
                                        boolean z14 = oc0Var3.b;
                                        if (messagePreviewParams6.quote != null && !z14) {
                                            messagePreviewParams6.quote = null;
                                            ac0Var3.f(false);
                                            ic0Var6.h(false, true);
                                            ic0Var6.l(true);
                                            break;
                                        } else if (ac0Var3.v - ac0Var3.u <= MessagesController.getInstance(i19).quoteLengthMax) {
                                            MessageObject c12 = ic0Var6.c(null);
                                            if (c12 != null) {
                                                if (!ac0Var3.x()) {
                                                    messagePreviewParams6.quoteStart = 0;
                                                    int min = Math.min(MessagesController.getInstance(i19).quoteLengthMax, org.telegram.ui.gn.d(c12));
                                                    messagePreviewParams6.quoteEnd = min;
                                                    messagePreviewParams6.quote = org.telegram.ui.gn.c(c12, messagePreviewParams6.quoteStart, min);
                                                    View d = ic0Var6.d();
                                                    if (d instanceof org.telegram.ui.Cells.u1) {
                                                        ac0Var3.Z((org.telegram.ui.Cells.u1) d, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                                    }
                                                    if (!z14) {
                                                        ic0Var6.s.getSwipeBack().e(ic0Var6.I);
                                                    }
                                                    ic0Var6.h(true, true);
                                                    break;
                                                } else {
                                                    messagePreviewParams6.quoteStart = ac0Var3.u;
                                                    messagePreviewParams6.quoteEnd = ac0Var3.v;
                                                    org.telegram.ui.Cells.v9 v9Var2 = ac0Var3.W;
                                                    messagePreviewParams6.quote = org.telegram.ui.gn.c(ic0Var6.c(v9Var2 != null ? ((org.telegram.ui.Cells.u1) v9Var2).getMessageObject() : null), messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
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
                                            org.telegram.ui.al alVar = (org.telegram.ui.al) oc0Var4;
                                            alVar.a(true);
                                            org.telegram.ui.qn qnVar = alVar.H;
                                            qnVar.n5 = null;
                                            qnVar.l5 = null;
                                            qnVar.f5.updateReply(null, null, qnVar.T5, null);
                                            qnVar.m8();
                                            break;
                                        } else {
                                            org.telegram.ui.al alVar2 = (org.telegram.ui.al) oc0Var4;
                                            alVar2.a(true);
                                            org.telegram.ui.qn qnVar2 = alVar2.H;
                                            qnVar2.l5 = null;
                                            qnVar2.Gb(qnVar2.n5);
                                            break;
                                        }
                                    case 7:
                                        this.b.c0.c(true);
                                        break;
                                    case 8:
                                        this.b.c0.a(true);
                                        break;
                                    case 9:
                                        org.telegram.ui.al alVar3 = (org.telegram.ui.al) this.b.c0;
                                        alVar3.a(true);
                                        org.telegram.ui.qn qnVar3 = alVar3.H;
                                        qnVar3.f5.updateForward(null, qnVar3.T5);
                                        qnVar3.m8();
                                        break;
                                    case 10:
                                        this.b.c0.a(true);
                                        break;
                                    case 11:
                                        org.telegram.ui.al alVar4 = (org.telegram.ui.al) this.b.c0;
                                        alVar4.a(true);
                                        org.telegram.ui.qn qnVar4 = alVar4.H;
                                        qnVar4.G5 = null;
                                        org.telegram.ui.fk fkVar = qnVar4.Y;
                                        if (fkVar != null) {
                                            fkVar.X2 = null;
                                            fkVar.Y2 = false;
                                        }
                                        MessagePreviewParams messagePreviewParams7 = qnVar4.f5;
                                        if (messagePreviewParams7 != null) {
                                            i16 = ((org.telegram.ui.ActionBar.n2) qnVar4).currentAccount;
                                            MessageObject messageObject = qnVar4.n5;
                                            messagePreviewParams7.updateLink(i16, null, null, messageObject == qnVar4.X3 ? null : messageObject, qnVar4.l5, qnVar4.p5);
                                        }
                                        qnVar4.m8();
                                        break;
                                    case 12:
                                        ic0 ic0Var7 = this.b;
                                        MessagePreviewParams messagePreviewParams8 = ic0Var7.c0.d;
                                        if (messagePreviewParams8.hasMedia) {
                                            boolean z15 = !messagePreviewParams8.webpageSmall;
                                            messagePreviewParams8.webpageSmall = z15;
                                            ic0Var7.G.a(z15, true);
                                            ic0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                            if (ic0Var7.r.messages.size() > 0 && (message2 = ic0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                                boolean z16 = messagePreviewParams8.webpageSmall;
                                                messageMedia2.force_small_media = z16;
                                                messageMedia2.force_large_media = !z16;
                                            }
                                            if (ic0Var7.r.previewMessages.size() > 0 && (message = ic0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                                boolean z17 = messagePreviewParams8.webpageSmall;
                                                messageMedia.force_small_media = z17;
                                                messageMedia.force_large_media = !z17;
                                            }
                                            ic0Var7.i();
                                            ic0Var7.U = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        ic0 ic0Var8 = this.b;
                                        MessagePreviewParams messagePreviewParams9 = ic0Var8.c0.d;
                                        boolean z18 = messagePreviewParams9.webpageTop;
                                        messagePreviewParams9.webpageTop = !z18;
                                        ic0Var8.E.a(z18, true);
                                        if (ic0Var8.r.messages.size() > 0 && (message4 = ic0Var8.r.messages.get(0).messageOwner) != null) {
                                            message4.invert_media = messagePreviewParams9.webpageTop;
                                        }
                                        if (ic0Var8.r.previewMessages.size() > 0 && (message3 = ic0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                            message3.invert_media = messagePreviewParams9.webpageTop;
                                        }
                                        ic0Var8.i();
                                        ic0Var8.U = true;
                                        break;
                                }
                            }
                        });
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var, w7.z5.n(-1, 48));
                        org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(1, context, oc0Var.F, false, true);
                        context2 = context;
                        e1Var2.g(LocaleController.getString(R.string.DoNotLinkPreview), R.drawable.msg_delete, null);
                        int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.q7, kc0Var);
                        int i16 = org.telegram.ui.ActionBar.h6.p7;
                        e1Var2.c(w02, org.telegram.ui.ActionBar.h6.w0(i16, kc0Var));
                        final int i17 = 11;
                        e1Var2.setOnClickListener(new View.OnClickListener(ic0Var3) { // from class: org.telegram.ui.Components.sb0
                            public final /* synthetic */ ic0 b;

                            {
                                this.b = ic0Var3;
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
                                                org.telegram.ui.Cells.v9 v9Var = ac0Var2.W;
                                                MessageObject c11 = ic0Var5.c(v9Var != null ? ((org.telegram.ui.Cells.u1) v9Var).getMessageObject() : null);
                                                MessagePreviewParams messagePreviewParams5 = oc0Var2.d;
                                                int i172 = ac0Var2.u;
                                                messagePreviewParams5.quoteStart = i172;
                                                int i18 = ac0Var2.v;
                                                messagePreviewParams5.quoteEnd = i18;
                                                messagePreviewParams5.quote = org.telegram.ui.gn.c(c11, i172, i18);
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
                                        MessagePreviewParams messagePreviewParams6 = oc0Var3.d;
                                        int i19 = oc0Var3.w;
                                        boolean z14 = oc0Var3.b;
                                        if (messagePreviewParams6.quote != null && !z14) {
                                            messagePreviewParams6.quote = null;
                                            ac0Var3.f(false);
                                            ic0Var6.h(false, true);
                                            ic0Var6.l(true);
                                            break;
                                        } else if (ac0Var3.v - ac0Var3.u <= MessagesController.getInstance(i19).quoteLengthMax) {
                                            MessageObject c12 = ic0Var6.c(null);
                                            if (c12 != null) {
                                                if (!ac0Var3.x()) {
                                                    messagePreviewParams6.quoteStart = 0;
                                                    int min = Math.min(MessagesController.getInstance(i19).quoteLengthMax, org.telegram.ui.gn.d(c12));
                                                    messagePreviewParams6.quoteEnd = min;
                                                    messagePreviewParams6.quote = org.telegram.ui.gn.c(c12, messagePreviewParams6.quoteStart, min);
                                                    View d = ic0Var6.d();
                                                    if (d instanceof org.telegram.ui.Cells.u1) {
                                                        ac0Var3.Z((org.telegram.ui.Cells.u1) d, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                                    }
                                                    if (!z14) {
                                                        ic0Var6.s.getSwipeBack().e(ic0Var6.I);
                                                    }
                                                    ic0Var6.h(true, true);
                                                    break;
                                                } else {
                                                    messagePreviewParams6.quoteStart = ac0Var3.u;
                                                    messagePreviewParams6.quoteEnd = ac0Var3.v;
                                                    org.telegram.ui.Cells.v9 v9Var2 = ac0Var3.W;
                                                    messagePreviewParams6.quote = org.telegram.ui.gn.c(ic0Var6.c(v9Var2 != null ? ((org.telegram.ui.Cells.u1) v9Var2).getMessageObject() : null), messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
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
                                            org.telegram.ui.al alVar = (org.telegram.ui.al) oc0Var4;
                                            alVar.a(true);
                                            org.telegram.ui.qn qnVar = alVar.H;
                                            qnVar.n5 = null;
                                            qnVar.l5 = null;
                                            qnVar.f5.updateReply(null, null, qnVar.T5, null);
                                            qnVar.m8();
                                            break;
                                        } else {
                                            org.telegram.ui.al alVar2 = (org.telegram.ui.al) oc0Var4;
                                            alVar2.a(true);
                                            org.telegram.ui.qn qnVar2 = alVar2.H;
                                            qnVar2.l5 = null;
                                            qnVar2.Gb(qnVar2.n5);
                                            break;
                                        }
                                    case 7:
                                        this.b.c0.c(true);
                                        break;
                                    case 8:
                                        this.b.c0.a(true);
                                        break;
                                    case 9:
                                        org.telegram.ui.al alVar3 = (org.telegram.ui.al) this.b.c0;
                                        alVar3.a(true);
                                        org.telegram.ui.qn qnVar3 = alVar3.H;
                                        qnVar3.f5.updateForward(null, qnVar3.T5);
                                        qnVar3.m8();
                                        break;
                                    case 10:
                                        this.b.c0.a(true);
                                        break;
                                    case 11:
                                        org.telegram.ui.al alVar4 = (org.telegram.ui.al) this.b.c0;
                                        alVar4.a(true);
                                        org.telegram.ui.qn qnVar4 = alVar4.H;
                                        qnVar4.G5 = null;
                                        org.telegram.ui.fk fkVar = qnVar4.Y;
                                        if (fkVar != null) {
                                            fkVar.X2 = null;
                                            fkVar.Y2 = false;
                                        }
                                        MessagePreviewParams messagePreviewParams7 = qnVar4.f5;
                                        if (messagePreviewParams7 != null) {
                                            i162 = ((org.telegram.ui.ActionBar.n2) qnVar4).currentAccount;
                                            MessageObject messageObject = qnVar4.n5;
                                            messagePreviewParams7.updateLink(i162, null, null, messageObject == qnVar4.X3 ? null : messageObject, qnVar4.l5, qnVar4.p5);
                                        }
                                        qnVar4.m8();
                                        break;
                                    case 12:
                                        ic0 ic0Var7 = this.b;
                                        MessagePreviewParams messagePreviewParams8 = ic0Var7.c0.d;
                                        if (messagePreviewParams8.hasMedia) {
                                            boolean z15 = !messagePreviewParams8.webpageSmall;
                                            messagePreviewParams8.webpageSmall = z15;
                                            ic0Var7.G.a(z15, true);
                                            ic0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                            if (ic0Var7.r.messages.size() > 0 && (message2 = ic0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                                boolean z16 = messagePreviewParams8.webpageSmall;
                                                messageMedia2.force_small_media = z16;
                                                messageMedia2.force_large_media = !z16;
                                            }
                                            if (ic0Var7.r.previewMessages.size() > 0 && (message = ic0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                                boolean z17 = messagePreviewParams8.webpageSmall;
                                                messageMedia.force_small_media = z17;
                                                messageMedia.force_large_media = !z17;
                                            }
                                            ic0Var7.i();
                                            ic0Var7.U = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        ic0 ic0Var8 = this.b;
                                        MessagePreviewParams messagePreviewParams9 = ic0Var8.c0.d;
                                        boolean z18 = messagePreviewParams9.webpageTop;
                                        messagePreviewParams9.webpageTop = !z18;
                                        ic0Var8.E.a(z18, true);
                                        if (ic0Var8.r.messages.size() > 0 && (message4 = ic0Var8.r.messages.get(0).messageOwner) != null) {
                                            message4.invert_media = messagePreviewParams9.webpageTop;
                                        }
                                        if (ic0Var8.r.previewMessages.size() > 0 && (message3 = ic0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                            message3.invert_media = messagePreviewParams9.webpageTop;
                                        }
                                        ic0Var8.i();
                                        ic0Var8.U = true;
                                        break;
                                }
                            }
                        });
                        e1Var2.setSelectorColor(org.telegram.ui.ActionBar.h6.m1(0.12f, org.telegram.ui.ActionBar.h6.x0(null, i16, false)));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var2, w7.z5.n(-1, 48));
                        final int i18 = 12;
                        frameLayout.setOnClickListener(new View.OnClickListener(ic0Var3) { // from class: org.telegram.ui.Components.sb0
                            public final /* synthetic */ ic0 b;

                            {
                                this.b = ic0Var3;
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
                                                org.telegram.ui.Cells.v9 v9Var = ac0Var2.W;
                                                MessageObject c11 = ic0Var5.c(v9Var != null ? ((org.telegram.ui.Cells.u1) v9Var).getMessageObject() : null);
                                                MessagePreviewParams messagePreviewParams5 = oc0Var2.d;
                                                int i172 = ac0Var2.u;
                                                messagePreviewParams5.quoteStart = i172;
                                                int i182 = ac0Var2.v;
                                                messagePreviewParams5.quoteEnd = i182;
                                                messagePreviewParams5.quote = org.telegram.ui.gn.c(c11, i172, i182);
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
                                        MessagePreviewParams messagePreviewParams6 = oc0Var3.d;
                                        int i19 = oc0Var3.w;
                                        boolean z14 = oc0Var3.b;
                                        if (messagePreviewParams6.quote != null && !z14) {
                                            messagePreviewParams6.quote = null;
                                            ac0Var3.f(false);
                                            ic0Var6.h(false, true);
                                            ic0Var6.l(true);
                                            break;
                                        } else if (ac0Var3.v - ac0Var3.u <= MessagesController.getInstance(i19).quoteLengthMax) {
                                            MessageObject c12 = ic0Var6.c(null);
                                            if (c12 != null) {
                                                if (!ac0Var3.x()) {
                                                    messagePreviewParams6.quoteStart = 0;
                                                    int min = Math.min(MessagesController.getInstance(i19).quoteLengthMax, org.telegram.ui.gn.d(c12));
                                                    messagePreviewParams6.quoteEnd = min;
                                                    messagePreviewParams6.quote = org.telegram.ui.gn.c(c12, messagePreviewParams6.quoteStart, min);
                                                    View d = ic0Var6.d();
                                                    if (d instanceof org.telegram.ui.Cells.u1) {
                                                        ac0Var3.Z((org.telegram.ui.Cells.u1) d, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                                    }
                                                    if (!z14) {
                                                        ic0Var6.s.getSwipeBack().e(ic0Var6.I);
                                                    }
                                                    ic0Var6.h(true, true);
                                                    break;
                                                } else {
                                                    messagePreviewParams6.quoteStart = ac0Var3.u;
                                                    messagePreviewParams6.quoteEnd = ac0Var3.v;
                                                    org.telegram.ui.Cells.v9 v9Var2 = ac0Var3.W;
                                                    messagePreviewParams6.quote = org.telegram.ui.gn.c(ic0Var6.c(v9Var2 != null ? ((org.telegram.ui.Cells.u1) v9Var2).getMessageObject() : null), messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
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
                                            org.telegram.ui.al alVar = (org.telegram.ui.al) oc0Var4;
                                            alVar.a(true);
                                            org.telegram.ui.qn qnVar = alVar.H;
                                            qnVar.n5 = null;
                                            qnVar.l5 = null;
                                            qnVar.f5.updateReply(null, null, qnVar.T5, null);
                                            qnVar.m8();
                                            break;
                                        } else {
                                            org.telegram.ui.al alVar2 = (org.telegram.ui.al) oc0Var4;
                                            alVar2.a(true);
                                            org.telegram.ui.qn qnVar2 = alVar2.H;
                                            qnVar2.l5 = null;
                                            qnVar2.Gb(qnVar2.n5);
                                            break;
                                        }
                                    case 7:
                                        this.b.c0.c(true);
                                        break;
                                    case 8:
                                        this.b.c0.a(true);
                                        break;
                                    case 9:
                                        org.telegram.ui.al alVar3 = (org.telegram.ui.al) this.b.c0;
                                        alVar3.a(true);
                                        org.telegram.ui.qn qnVar3 = alVar3.H;
                                        qnVar3.f5.updateForward(null, qnVar3.T5);
                                        qnVar3.m8();
                                        break;
                                    case 10:
                                        this.b.c0.a(true);
                                        break;
                                    case 11:
                                        org.telegram.ui.al alVar4 = (org.telegram.ui.al) this.b.c0;
                                        alVar4.a(true);
                                        org.telegram.ui.qn qnVar4 = alVar4.H;
                                        qnVar4.G5 = null;
                                        org.telegram.ui.fk fkVar = qnVar4.Y;
                                        if (fkVar != null) {
                                            fkVar.X2 = null;
                                            fkVar.Y2 = false;
                                        }
                                        MessagePreviewParams messagePreviewParams7 = qnVar4.f5;
                                        if (messagePreviewParams7 != null) {
                                            i162 = ((org.telegram.ui.ActionBar.n2) qnVar4).currentAccount;
                                            MessageObject messageObject = qnVar4.n5;
                                            messagePreviewParams7.updateLink(i162, null, null, messageObject == qnVar4.X3 ? null : messageObject, qnVar4.l5, qnVar4.p5);
                                        }
                                        qnVar4.m8();
                                        break;
                                    case 12:
                                        ic0 ic0Var7 = this.b;
                                        MessagePreviewParams messagePreviewParams8 = ic0Var7.c0.d;
                                        if (messagePreviewParams8.hasMedia) {
                                            boolean z15 = !messagePreviewParams8.webpageSmall;
                                            messagePreviewParams8.webpageSmall = z15;
                                            ic0Var7.G.a(z15, true);
                                            ic0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                            if (ic0Var7.r.messages.size() > 0 && (message2 = ic0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                                boolean z16 = messagePreviewParams8.webpageSmall;
                                                messageMedia2.force_small_media = z16;
                                                messageMedia2.force_large_media = !z16;
                                            }
                                            if (ic0Var7.r.previewMessages.size() > 0 && (message = ic0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                                boolean z17 = messagePreviewParams8.webpageSmall;
                                                messageMedia.force_small_media = z17;
                                                messageMedia.force_large_media = !z17;
                                            }
                                            ic0Var7.i();
                                            ic0Var7.U = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        ic0 ic0Var8 = this.b;
                                        MessagePreviewParams messagePreviewParams9 = ic0Var8.c0.d;
                                        boolean z18 = messagePreviewParams9.webpageTop;
                                        messagePreviewParams9.webpageTop = !z18;
                                        ic0Var8.E.a(z18, true);
                                        if (ic0Var8.r.messages.size() > 0 && (message4 = ic0Var8.r.messages.get(0).messageOwner) != null) {
                                            message4.invert_media = messagePreviewParams9.webpageTop;
                                        }
                                        if (ic0Var8.r.previewMessages.size() > 0 && (message3 = ic0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                            message3.invert_media = messagePreviewParams9.webpageTop;
                                        }
                                        ic0Var8.i();
                                        ic0Var8.U = true;
                                        break;
                                }
                            }
                        });
                        final int i19 = 13;
                        nc0Var3.setOnClickListener(new View.OnClickListener(ic0Var3) { // from class: org.telegram.ui.Components.sb0
                            public final /* synthetic */ ic0 b;

                            {
                                this.b = ic0Var3;
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
                                                org.telegram.ui.Cells.v9 v9Var = ac0Var2.W;
                                                MessageObject c11 = ic0Var5.c(v9Var != null ? ((org.telegram.ui.Cells.u1) v9Var).getMessageObject() : null);
                                                MessagePreviewParams messagePreviewParams5 = oc0Var2.d;
                                                int i172 = ac0Var2.u;
                                                messagePreviewParams5.quoteStart = i172;
                                                int i182 = ac0Var2.v;
                                                messagePreviewParams5.quoteEnd = i182;
                                                messagePreviewParams5.quote = org.telegram.ui.gn.c(c11, i172, i182);
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
                                        MessagePreviewParams messagePreviewParams6 = oc0Var3.d;
                                        int i192 = oc0Var3.w;
                                        boolean z14 = oc0Var3.b;
                                        if (messagePreviewParams6.quote != null && !z14) {
                                            messagePreviewParams6.quote = null;
                                            ac0Var3.f(false);
                                            ic0Var6.h(false, true);
                                            ic0Var6.l(true);
                                            break;
                                        } else if (ac0Var3.v - ac0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                            MessageObject c12 = ic0Var6.c(null);
                                            if (c12 != null) {
                                                if (!ac0Var3.x()) {
                                                    messagePreviewParams6.quoteStart = 0;
                                                    int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, org.telegram.ui.gn.d(c12));
                                                    messagePreviewParams6.quoteEnd = min;
                                                    messagePreviewParams6.quote = org.telegram.ui.gn.c(c12, messagePreviewParams6.quoteStart, min);
                                                    View d = ic0Var6.d();
                                                    if (d instanceof org.telegram.ui.Cells.u1) {
                                                        ac0Var3.Z((org.telegram.ui.Cells.u1) d, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                                    }
                                                    if (!z14) {
                                                        ic0Var6.s.getSwipeBack().e(ic0Var6.I);
                                                    }
                                                    ic0Var6.h(true, true);
                                                    break;
                                                } else {
                                                    messagePreviewParams6.quoteStart = ac0Var3.u;
                                                    messagePreviewParams6.quoteEnd = ac0Var3.v;
                                                    org.telegram.ui.Cells.v9 v9Var2 = ac0Var3.W;
                                                    messagePreviewParams6.quote = org.telegram.ui.gn.c(ic0Var6.c(v9Var2 != null ? ((org.telegram.ui.Cells.u1) v9Var2).getMessageObject() : null), messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
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
                                            org.telegram.ui.al alVar = (org.telegram.ui.al) oc0Var4;
                                            alVar.a(true);
                                            org.telegram.ui.qn qnVar = alVar.H;
                                            qnVar.n5 = null;
                                            qnVar.l5 = null;
                                            qnVar.f5.updateReply(null, null, qnVar.T5, null);
                                            qnVar.m8();
                                            break;
                                        } else {
                                            org.telegram.ui.al alVar2 = (org.telegram.ui.al) oc0Var4;
                                            alVar2.a(true);
                                            org.telegram.ui.qn qnVar2 = alVar2.H;
                                            qnVar2.l5 = null;
                                            qnVar2.Gb(qnVar2.n5);
                                            break;
                                        }
                                    case 7:
                                        this.b.c0.c(true);
                                        break;
                                    case 8:
                                        this.b.c0.a(true);
                                        break;
                                    case 9:
                                        org.telegram.ui.al alVar3 = (org.telegram.ui.al) this.b.c0;
                                        alVar3.a(true);
                                        org.telegram.ui.qn qnVar3 = alVar3.H;
                                        qnVar3.f5.updateForward(null, qnVar3.T5);
                                        qnVar3.m8();
                                        break;
                                    case 10:
                                        this.b.c0.a(true);
                                        break;
                                    case 11:
                                        org.telegram.ui.al alVar4 = (org.telegram.ui.al) this.b.c0;
                                        alVar4.a(true);
                                        org.telegram.ui.qn qnVar4 = alVar4.H;
                                        qnVar4.G5 = null;
                                        org.telegram.ui.fk fkVar = qnVar4.Y;
                                        if (fkVar != null) {
                                            fkVar.X2 = null;
                                            fkVar.Y2 = false;
                                        }
                                        MessagePreviewParams messagePreviewParams7 = qnVar4.f5;
                                        if (messagePreviewParams7 != null) {
                                            i162 = ((org.telegram.ui.ActionBar.n2) qnVar4).currentAccount;
                                            MessageObject messageObject = qnVar4.n5;
                                            messagePreviewParams7.updateLink(i162, null, null, messageObject == qnVar4.X3 ? null : messageObject, qnVar4.l5, qnVar4.p5);
                                        }
                                        qnVar4.m8();
                                        break;
                                    case 12:
                                        ic0 ic0Var7 = this.b;
                                        MessagePreviewParams messagePreviewParams8 = ic0Var7.c0.d;
                                        if (messagePreviewParams8.hasMedia) {
                                            boolean z15 = !messagePreviewParams8.webpageSmall;
                                            messagePreviewParams8.webpageSmall = z15;
                                            ic0Var7.G.a(z15, true);
                                            ic0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                            if (ic0Var7.r.messages.size() > 0 && (message2 = ic0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                                boolean z16 = messagePreviewParams8.webpageSmall;
                                                messageMedia2.force_small_media = z16;
                                                messageMedia2.force_large_media = !z16;
                                            }
                                            if (ic0Var7.r.previewMessages.size() > 0 && (message = ic0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                                boolean z17 = messagePreviewParams8.webpageSmall;
                                                messageMedia.force_small_media = z17;
                                                messageMedia.force_large_media = !z17;
                                            }
                                            ic0Var7.i();
                                            ic0Var7.U = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        ic0 ic0Var8 = this.b;
                                        MessagePreviewParams messagePreviewParams9 = ic0Var8.c0.d;
                                        boolean z18 = messagePreviewParams9.webpageTop;
                                        messagePreviewParams9.webpageTop = !z18;
                                        ic0Var8.E.a(z18, true);
                                        if (ic0Var8.r.messages.size() > 0 && (message4 = ic0Var8.r.messages.get(0).messageOwner) != null) {
                                            message4.invert_media = messagePreviewParams9.webpageTop;
                                        }
                                        if (ic0Var8.r.previewMessages.size() > 0 && (message3 = ic0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                            message3.invert_media = messagePreviewParams9.webpageTop;
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
                    for (int i20 = 0; i20 < messagePreviewParams.forwardMessages.messages.size(); i20++) {
                        if (messagePreviewParams.forwardMessages.messages.get(i20).type == 36) {
                            z10 = false;
                            break;
                        }
                    }
                }
                z10 = true;
                nc0 nc0Var6 = new nc0(context, R.raw.name_hide, LocaleController.getString(messagePreviewParams.multipleUsers ? R.string.ShowSenderNames : R.string.ShowSendersName), R.raw.name_show, LocaleController.getString(messagePreviewParams.multipleUsers ? R.string.HideSenderNames : R.string.HideSendersName), oc0Var.F);
                this.s.a(nc0Var6, w7.z5.n(-1, 48));
                if (messagePreviewParams.hasCaption) {
                    nc0Var = nc0Var6;
                    nc0 nc0Var7 = new nc0(context, R.raw.caption_hide, LocaleController.getString(R.string.ShowCaption), R.raw.caption_show, LocaleController.getString(R.string.HideCaption), oc0Var.F);
                    nc0Var7.a(messagePreviewParams.hideCaption, false);
                    this.s.a(nc0Var7, w7.z5.n(-1, 48));
                    nc0Var2 = nc0Var7;
                } else {
                    nc0Var = nc0Var6;
                    nc0Var2 = null;
                }
                org.telegram.ui.ActionBar.e1 e1Var3 = new org.telegram.ui.ActionBar.e1(0, context, oc0Var.F, true, false);
                final int i21 = 7;
                e1Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.sb0
                    public final /* synthetic */ ic0 b;

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
                                        org.telegram.ui.Cells.v9 v9Var = ac0Var2.W;
                                        MessageObject c11 = ic0Var5.c(v9Var != null ? ((org.telegram.ui.Cells.u1) v9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams5 = oc0Var2.d;
                                        int i172 = ac0Var2.u;
                                        messagePreviewParams5.quoteStart = i172;
                                        int i182 = ac0Var2.v;
                                        messagePreviewParams5.quoteEnd = i182;
                                        messagePreviewParams5.quote = org.telegram.ui.gn.c(c11, i172, i182);
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
                                MessagePreviewParams messagePreviewParams6 = oc0Var3.d;
                                int i192 = oc0Var3.w;
                                boolean z14 = oc0Var3.b;
                                if (messagePreviewParams6.quote != null && !z14) {
                                    messagePreviewParams6.quote = null;
                                    ac0Var3.f(false);
                                    ic0Var6.h(false, true);
                                    ic0Var6.l(true);
                                    break;
                                } else if (ac0Var3.v - ac0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                    MessageObject c12 = ic0Var6.c(null);
                                    if (c12 != null) {
                                        if (!ac0Var3.x()) {
                                            messagePreviewParams6.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, org.telegram.ui.gn.d(c12));
                                            messagePreviewParams6.quoteEnd = min;
                                            messagePreviewParams6.quote = org.telegram.ui.gn.c(c12, messagePreviewParams6.quoteStart, min);
                                            View d = ic0Var6.d();
                                            if (d instanceof org.telegram.ui.Cells.u1) {
                                                ac0Var3.Z((org.telegram.ui.Cells.u1) d, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                            }
                                            if (!z14) {
                                                ic0Var6.s.getSwipeBack().e(ic0Var6.I);
                                            }
                                            ic0Var6.h(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams6.quoteStart = ac0Var3.u;
                                            messagePreviewParams6.quoteEnd = ac0Var3.v;
                                            org.telegram.ui.Cells.v9 v9Var2 = ac0Var3.W;
                                            messagePreviewParams6.quote = org.telegram.ui.gn.c(ic0Var6.c(v9Var2 != null ? ((org.telegram.ui.Cells.u1) v9Var2).getMessageObject() : null), messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
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
                                    org.telegram.ui.al alVar = (org.telegram.ui.al) oc0Var4;
                                    alVar.a(true);
                                    org.telegram.ui.qn qnVar = alVar.H;
                                    qnVar.n5 = null;
                                    qnVar.l5 = null;
                                    qnVar.f5.updateReply(null, null, qnVar.T5, null);
                                    qnVar.m8();
                                    break;
                                } else {
                                    org.telegram.ui.al alVar2 = (org.telegram.ui.al) oc0Var4;
                                    alVar2.a(true);
                                    org.telegram.ui.qn qnVar2 = alVar2.H;
                                    qnVar2.l5 = null;
                                    qnVar2.Gb(qnVar2.n5);
                                    break;
                                }
                            case 7:
                                this.b.c0.c(true);
                                break;
                            case 8:
                                this.b.c0.a(true);
                                break;
                            case 9:
                                org.telegram.ui.al alVar3 = (org.telegram.ui.al) this.b.c0;
                                alVar3.a(true);
                                org.telegram.ui.qn qnVar3 = alVar3.H;
                                qnVar3.f5.updateForward(null, qnVar3.T5);
                                qnVar3.m8();
                                break;
                            case 10:
                                this.b.c0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.al alVar4 = (org.telegram.ui.al) this.b.c0;
                                alVar4.a(true);
                                org.telegram.ui.qn qnVar4 = alVar4.H;
                                qnVar4.G5 = null;
                                org.telegram.ui.fk fkVar = qnVar4.Y;
                                if (fkVar != null) {
                                    fkVar.X2 = null;
                                    fkVar.Y2 = false;
                                }
                                MessagePreviewParams messagePreviewParams7 = qnVar4.f5;
                                if (messagePreviewParams7 != null) {
                                    i162 = ((org.telegram.ui.ActionBar.n2) qnVar4).currentAccount;
                                    MessageObject messageObject = qnVar4.n5;
                                    messagePreviewParams7.updateLink(i162, null, null, messageObject == qnVar4.X3 ? null : messageObject, qnVar4.l5, qnVar4.p5);
                                }
                                qnVar4.m8();
                                break;
                            case 12:
                                ic0 ic0Var7 = this.b;
                                MessagePreviewParams messagePreviewParams8 = ic0Var7.c0.d;
                                if (messagePreviewParams8.hasMedia) {
                                    boolean z15 = !messagePreviewParams8.webpageSmall;
                                    messagePreviewParams8.webpageSmall = z15;
                                    ic0Var7.G.a(z15, true);
                                    ic0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                    if (ic0Var7.r.messages.size() > 0 && (message2 = ic0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z16 = messagePreviewParams8.webpageSmall;
                                        messageMedia2.force_small_media = z16;
                                        messageMedia2.force_large_media = !z16;
                                    }
                                    if (ic0Var7.r.previewMessages.size() > 0 && (message = ic0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z17 = messagePreviewParams8.webpageSmall;
                                        messageMedia.force_small_media = z17;
                                        messageMedia.force_large_media = !z17;
                                    }
                                    ic0Var7.i();
                                    ic0Var7.U = true;
                                    break;
                                }
                                break;
                            default:
                                ic0 ic0Var8 = this.b;
                                MessagePreviewParams messagePreviewParams9 = ic0Var8.c0.d;
                                boolean z18 = messagePreviewParams9.webpageTop;
                                messagePreviewParams9.webpageTop = !z18;
                                ic0Var8.E.a(z18, true);
                                if (ic0Var8.r.messages.size() > 0 && (message4 = ic0Var8.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams9.webpageTop;
                                }
                                if (ic0Var8.r.previewMessages.size() > 0 && (message3 = ic0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams9.webpageTop;
                                }
                                ic0Var8.i();
                                ic0Var8.U = true;
                                break;
                        }
                    }
                });
                e1Var3.g(LocaleController.getString(R.string.ChangeRecipient), R.drawable.msg_forward_replace, null);
                this.s.a(e1Var3, w7.z5.n(-1, 48));
                org.telegram.ui.ActionBar.j1 j1Var2 = new org.telegram.ui.ActionBar.j1(context, kc0Var);
                j1Var2.setColor(org.telegram.ui.ActionBar.h6.m1(0.06f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.E8, kc0Var)));
                j1Var2.setTag(R.id.fit_width_tag, 1);
                this.s.a(j1Var2, w7.z5.n(-1, 8));
                org.telegram.ui.ActionBar.e1 e1Var4 = new org.telegram.ui.ActionBar.e1(1, context, oc0Var.F, false, false);
                e1Var4.g(LocaleController.getString(R.string.ApplyChanges), R.drawable.msg_select, null);
                final int i22 = 8;
                e1Var4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.sb0
                    public final /* synthetic */ ic0 b;

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
                                        org.telegram.ui.Cells.v9 v9Var = ac0Var2.W;
                                        MessageObject c11 = ic0Var5.c(v9Var != null ? ((org.telegram.ui.Cells.u1) v9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams5 = oc0Var2.d;
                                        int i172 = ac0Var2.u;
                                        messagePreviewParams5.quoteStart = i172;
                                        int i182 = ac0Var2.v;
                                        messagePreviewParams5.quoteEnd = i182;
                                        messagePreviewParams5.quote = org.telegram.ui.gn.c(c11, i172, i182);
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
                                MessagePreviewParams messagePreviewParams6 = oc0Var3.d;
                                int i192 = oc0Var3.w;
                                boolean z14 = oc0Var3.b;
                                if (messagePreviewParams6.quote != null && !z14) {
                                    messagePreviewParams6.quote = null;
                                    ac0Var3.f(false);
                                    ic0Var6.h(false, true);
                                    ic0Var6.l(true);
                                    break;
                                } else if (ac0Var3.v - ac0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                    MessageObject c12 = ic0Var6.c(null);
                                    if (c12 != null) {
                                        if (!ac0Var3.x()) {
                                            messagePreviewParams6.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, org.telegram.ui.gn.d(c12));
                                            messagePreviewParams6.quoteEnd = min;
                                            messagePreviewParams6.quote = org.telegram.ui.gn.c(c12, messagePreviewParams6.quoteStart, min);
                                            View d = ic0Var6.d();
                                            if (d instanceof org.telegram.ui.Cells.u1) {
                                                ac0Var3.Z((org.telegram.ui.Cells.u1) d, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                            }
                                            if (!z14) {
                                                ic0Var6.s.getSwipeBack().e(ic0Var6.I);
                                            }
                                            ic0Var6.h(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams6.quoteStart = ac0Var3.u;
                                            messagePreviewParams6.quoteEnd = ac0Var3.v;
                                            org.telegram.ui.Cells.v9 v9Var2 = ac0Var3.W;
                                            messagePreviewParams6.quote = org.telegram.ui.gn.c(ic0Var6.c(v9Var2 != null ? ((org.telegram.ui.Cells.u1) v9Var2).getMessageObject() : null), messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
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
                                    org.telegram.ui.al alVar = (org.telegram.ui.al) oc0Var4;
                                    alVar.a(true);
                                    org.telegram.ui.qn qnVar = alVar.H;
                                    qnVar.n5 = null;
                                    qnVar.l5 = null;
                                    qnVar.f5.updateReply(null, null, qnVar.T5, null);
                                    qnVar.m8();
                                    break;
                                } else {
                                    org.telegram.ui.al alVar2 = (org.telegram.ui.al) oc0Var4;
                                    alVar2.a(true);
                                    org.telegram.ui.qn qnVar2 = alVar2.H;
                                    qnVar2.l5 = null;
                                    qnVar2.Gb(qnVar2.n5);
                                    break;
                                }
                            case 7:
                                this.b.c0.c(true);
                                break;
                            case 8:
                                this.b.c0.a(true);
                                break;
                            case 9:
                                org.telegram.ui.al alVar3 = (org.telegram.ui.al) this.b.c0;
                                alVar3.a(true);
                                org.telegram.ui.qn qnVar3 = alVar3.H;
                                qnVar3.f5.updateForward(null, qnVar3.T5);
                                qnVar3.m8();
                                break;
                            case 10:
                                this.b.c0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.al alVar4 = (org.telegram.ui.al) this.b.c0;
                                alVar4.a(true);
                                org.telegram.ui.qn qnVar4 = alVar4.H;
                                qnVar4.G5 = null;
                                org.telegram.ui.fk fkVar = qnVar4.Y;
                                if (fkVar != null) {
                                    fkVar.X2 = null;
                                    fkVar.Y2 = false;
                                }
                                MessagePreviewParams messagePreviewParams7 = qnVar4.f5;
                                if (messagePreviewParams7 != null) {
                                    i162 = ((org.telegram.ui.ActionBar.n2) qnVar4).currentAccount;
                                    MessageObject messageObject = qnVar4.n5;
                                    messagePreviewParams7.updateLink(i162, null, null, messageObject == qnVar4.X3 ? null : messageObject, qnVar4.l5, qnVar4.p5);
                                }
                                qnVar4.m8();
                                break;
                            case 12:
                                ic0 ic0Var7 = this.b;
                                MessagePreviewParams messagePreviewParams8 = ic0Var7.c0.d;
                                if (messagePreviewParams8.hasMedia) {
                                    boolean z15 = !messagePreviewParams8.webpageSmall;
                                    messagePreviewParams8.webpageSmall = z15;
                                    ic0Var7.G.a(z15, true);
                                    ic0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                    if (ic0Var7.r.messages.size() > 0 && (message2 = ic0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z16 = messagePreviewParams8.webpageSmall;
                                        messageMedia2.force_small_media = z16;
                                        messageMedia2.force_large_media = !z16;
                                    }
                                    if (ic0Var7.r.previewMessages.size() > 0 && (message = ic0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z17 = messagePreviewParams8.webpageSmall;
                                        messageMedia.force_small_media = z17;
                                        messageMedia.force_large_media = !z17;
                                    }
                                    ic0Var7.i();
                                    ic0Var7.U = true;
                                    break;
                                }
                                break;
                            default:
                                ic0 ic0Var8 = this.b;
                                MessagePreviewParams messagePreviewParams9 = ic0Var8.c0.d;
                                boolean z18 = messagePreviewParams9.webpageTop;
                                messagePreviewParams9.webpageTop = !z18;
                                ic0Var8.E.a(z18, true);
                                if (ic0Var8.r.messages.size() > 0 && (message4 = ic0Var8.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams9.webpageTop;
                                }
                                if (ic0Var8.r.previewMessages.size() > 0 && (message3 = ic0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams9.webpageTop;
                                }
                                ic0Var8.i();
                                ic0Var8.U = true;
                                break;
                        }
                    }
                });
                this.s.a(e1Var4, w7.z5.n(-1, 48));
                org.telegram.ui.ActionBar.e1 e1Var5 = new org.telegram.ui.ActionBar.e1(1, context, oc0Var.F, false, true);
                e1Var5.g(LocaleController.getString(R.string.DoNotForward), R.drawable.msg_delete, null);
                int w03 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.q7, kc0Var);
                int i23 = org.telegram.ui.ActionBar.h6.p7;
                e1Var5.c(w03, org.telegram.ui.ActionBar.h6.w0(i23, kc0Var));
                final int i24 = 9;
                e1Var5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.sb0
                    public final /* synthetic */ ic0 b;

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
                                        org.telegram.ui.Cells.v9 v9Var = ac0Var2.W;
                                        MessageObject c11 = ic0Var5.c(v9Var != null ? ((org.telegram.ui.Cells.u1) v9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams5 = oc0Var2.d;
                                        int i172 = ac0Var2.u;
                                        messagePreviewParams5.quoteStart = i172;
                                        int i182 = ac0Var2.v;
                                        messagePreviewParams5.quoteEnd = i182;
                                        messagePreviewParams5.quote = org.telegram.ui.gn.c(c11, i172, i182);
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
                                MessagePreviewParams messagePreviewParams6 = oc0Var3.d;
                                int i192 = oc0Var3.w;
                                boolean z14 = oc0Var3.b;
                                if (messagePreviewParams6.quote != null && !z14) {
                                    messagePreviewParams6.quote = null;
                                    ac0Var3.f(false);
                                    ic0Var6.h(false, true);
                                    ic0Var6.l(true);
                                    break;
                                } else if (ac0Var3.v - ac0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                    MessageObject c12 = ic0Var6.c(null);
                                    if (c12 != null) {
                                        if (!ac0Var3.x()) {
                                            messagePreviewParams6.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, org.telegram.ui.gn.d(c12));
                                            messagePreviewParams6.quoteEnd = min;
                                            messagePreviewParams6.quote = org.telegram.ui.gn.c(c12, messagePreviewParams6.quoteStart, min);
                                            View d = ic0Var6.d();
                                            if (d instanceof org.telegram.ui.Cells.u1) {
                                                ac0Var3.Z((org.telegram.ui.Cells.u1) d, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                            }
                                            if (!z14) {
                                                ic0Var6.s.getSwipeBack().e(ic0Var6.I);
                                            }
                                            ic0Var6.h(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams6.quoteStart = ac0Var3.u;
                                            messagePreviewParams6.quoteEnd = ac0Var3.v;
                                            org.telegram.ui.Cells.v9 v9Var2 = ac0Var3.W;
                                            messagePreviewParams6.quote = org.telegram.ui.gn.c(ic0Var6.c(v9Var2 != null ? ((org.telegram.ui.Cells.u1) v9Var2).getMessageObject() : null), messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
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
                                    org.telegram.ui.al alVar = (org.telegram.ui.al) oc0Var4;
                                    alVar.a(true);
                                    org.telegram.ui.qn qnVar = alVar.H;
                                    qnVar.n5 = null;
                                    qnVar.l5 = null;
                                    qnVar.f5.updateReply(null, null, qnVar.T5, null);
                                    qnVar.m8();
                                    break;
                                } else {
                                    org.telegram.ui.al alVar2 = (org.telegram.ui.al) oc0Var4;
                                    alVar2.a(true);
                                    org.telegram.ui.qn qnVar2 = alVar2.H;
                                    qnVar2.l5 = null;
                                    qnVar2.Gb(qnVar2.n5);
                                    break;
                                }
                            case 7:
                                this.b.c0.c(true);
                                break;
                            case 8:
                                this.b.c0.a(true);
                                break;
                            case 9:
                                org.telegram.ui.al alVar3 = (org.telegram.ui.al) this.b.c0;
                                alVar3.a(true);
                                org.telegram.ui.qn qnVar3 = alVar3.H;
                                qnVar3.f5.updateForward(null, qnVar3.T5);
                                qnVar3.m8();
                                break;
                            case 10:
                                this.b.c0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.al alVar4 = (org.telegram.ui.al) this.b.c0;
                                alVar4.a(true);
                                org.telegram.ui.qn qnVar4 = alVar4.H;
                                qnVar4.G5 = null;
                                org.telegram.ui.fk fkVar = qnVar4.Y;
                                if (fkVar != null) {
                                    fkVar.X2 = null;
                                    fkVar.Y2 = false;
                                }
                                MessagePreviewParams messagePreviewParams7 = qnVar4.f5;
                                if (messagePreviewParams7 != null) {
                                    i162 = ((org.telegram.ui.ActionBar.n2) qnVar4).currentAccount;
                                    MessageObject messageObject = qnVar4.n5;
                                    messagePreviewParams7.updateLink(i162, null, null, messageObject == qnVar4.X3 ? null : messageObject, qnVar4.l5, qnVar4.p5);
                                }
                                qnVar4.m8();
                                break;
                            case 12:
                                ic0 ic0Var7 = this.b;
                                MessagePreviewParams messagePreviewParams8 = ic0Var7.c0.d;
                                if (messagePreviewParams8.hasMedia) {
                                    boolean z15 = !messagePreviewParams8.webpageSmall;
                                    messagePreviewParams8.webpageSmall = z15;
                                    ic0Var7.G.a(z15, true);
                                    ic0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                    if (ic0Var7.r.messages.size() > 0 && (message2 = ic0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z16 = messagePreviewParams8.webpageSmall;
                                        messageMedia2.force_small_media = z16;
                                        messageMedia2.force_large_media = !z16;
                                    }
                                    if (ic0Var7.r.previewMessages.size() > 0 && (message = ic0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z17 = messagePreviewParams8.webpageSmall;
                                        messageMedia.force_small_media = z17;
                                        messageMedia.force_large_media = !z17;
                                    }
                                    ic0Var7.i();
                                    ic0Var7.U = true;
                                    break;
                                }
                                break;
                            default:
                                ic0 ic0Var8 = this.b;
                                MessagePreviewParams messagePreviewParams9 = ic0Var8.c0.d;
                                boolean z18 = messagePreviewParams9.webpageTop;
                                messagePreviewParams9.webpageTop = !z18;
                                ic0Var8.E.a(z18, true);
                                if (ic0Var8.r.messages.size() > 0 && (message4 = ic0Var8.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams9.webpageTop;
                                }
                                if (ic0Var8.r.previewMessages.size() > 0 && (message3 = ic0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams9.webpageTop;
                                }
                                ic0Var8.i();
                                ic0Var8.U = true;
                                break;
                        }
                    }
                });
                e1Var5.setSelectorColor(org.telegram.ui.ActionBar.h6.m1(0.12f, org.telegram.ui.ActionBar.h6.x0(null, i23, false)));
                this.s.a(e1Var5, w7.z5.n(-1, 48));
                nc0 nc0Var8 = nc0Var;
                nc0Var8.a(messagePreviewParams.hideForwardSendersName, false);
                nc0 nc0Var9 = nc0Var2;
                ic0 ic0Var4 = this;
                nc0Var8.setOnClickListener(new vb0(this, z10, context, nc0Var9, nc0Var8, 0));
                ic0Var = ic0Var4;
                if (nc0Var9 != null) {
                    nc0Var9.setOnClickListener(new ai.v0(ic0Var4, nc0Var9, nc0Var8, 27));
                    ic0Var = ic0Var4;
                }
            }
            context2 = context;
            ic0Var2 = ic0Var;
            viewOutlineProvider = null;
        } else {
            if (!messages.hasText || messagePreviewParams4.isSecret) {
                r11 = 0;
                messagePreviewParams2 = messagePreviewParams4;
            } else {
                LinearLayout e7 = org.telegram.messenger.mk.e(context3, 1);
                if (z13) {
                    drawable = null;
                    messagePreviewParams3 = messagePreviewParams4;
                    z11 = true;
                    linearLayout = e7;
                    z12 = 1031127695;
                } else {
                    messagePreviewParams3 = messagePreviewParams4;
                    ?? r92 = e7;
                    z12 = 1031127695;
                    drawable = null;
                    org.telegram.ui.ActionBar.e1 e1Var6 = new org.telegram.ui.ActionBar.e1(0, context3, oc0Var.F, true, false);
                    e1Var6.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                    e1Var6.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.sb0
                        public final /* synthetic */ ic0 b;

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
                                            org.telegram.ui.Cells.v9 v9Var = ac0Var2.W;
                                            MessageObject c11 = ic0Var5.c(v9Var != null ? ((org.telegram.ui.Cells.u1) v9Var).getMessageObject() : null);
                                            MessagePreviewParams messagePreviewParams5 = oc0Var2.d;
                                            int i172 = ac0Var2.u;
                                            messagePreviewParams5.quoteStart = i172;
                                            int i182 = ac0Var2.v;
                                            messagePreviewParams5.quoteEnd = i182;
                                            messagePreviewParams5.quote = org.telegram.ui.gn.c(c11, i172, i182);
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
                                    MessagePreviewParams messagePreviewParams6 = oc0Var3.d;
                                    int i192 = oc0Var3.w;
                                    boolean z14 = oc0Var3.b;
                                    if (messagePreviewParams6.quote != null && !z14) {
                                        messagePreviewParams6.quote = null;
                                        ac0Var3.f(false);
                                        ic0Var6.h(false, true);
                                        ic0Var6.l(true);
                                        break;
                                    } else if (ac0Var3.v - ac0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                        MessageObject c12 = ic0Var6.c(null);
                                        if (c12 != null) {
                                            if (!ac0Var3.x()) {
                                                messagePreviewParams6.quoteStart = 0;
                                                int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, org.telegram.ui.gn.d(c12));
                                                messagePreviewParams6.quoteEnd = min;
                                                messagePreviewParams6.quote = org.telegram.ui.gn.c(c12, messagePreviewParams6.quoteStart, min);
                                                View d = ic0Var6.d();
                                                if (d instanceof org.telegram.ui.Cells.u1) {
                                                    ac0Var3.Z((org.telegram.ui.Cells.u1) d, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                                }
                                                if (!z14) {
                                                    ic0Var6.s.getSwipeBack().e(ic0Var6.I);
                                                }
                                                ic0Var6.h(true, true);
                                                break;
                                            } else {
                                                messagePreviewParams6.quoteStart = ac0Var3.u;
                                                messagePreviewParams6.quoteEnd = ac0Var3.v;
                                                org.telegram.ui.Cells.v9 v9Var2 = ac0Var3.W;
                                                messagePreviewParams6.quote = org.telegram.ui.gn.c(ic0Var6.c(v9Var2 != null ? ((org.telegram.ui.Cells.u1) v9Var2).getMessageObject() : null), messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
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
                                        org.telegram.ui.al alVar = (org.telegram.ui.al) oc0Var4;
                                        alVar.a(true);
                                        org.telegram.ui.qn qnVar = alVar.H;
                                        qnVar.n5 = null;
                                        qnVar.l5 = null;
                                        qnVar.f5.updateReply(null, null, qnVar.T5, null);
                                        qnVar.m8();
                                        break;
                                    } else {
                                        org.telegram.ui.al alVar2 = (org.telegram.ui.al) oc0Var4;
                                        alVar2.a(true);
                                        org.telegram.ui.qn qnVar2 = alVar2.H;
                                        qnVar2.l5 = null;
                                        qnVar2.Gb(qnVar2.n5);
                                        break;
                                    }
                                case 7:
                                    this.b.c0.c(true);
                                    break;
                                case 8:
                                    this.b.c0.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.al alVar3 = (org.telegram.ui.al) this.b.c0;
                                    alVar3.a(true);
                                    org.telegram.ui.qn qnVar3 = alVar3.H;
                                    qnVar3.f5.updateForward(null, qnVar3.T5);
                                    qnVar3.m8();
                                    break;
                                case 10:
                                    this.b.c0.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.al alVar4 = (org.telegram.ui.al) this.b.c0;
                                    alVar4.a(true);
                                    org.telegram.ui.qn qnVar4 = alVar4.H;
                                    qnVar4.G5 = null;
                                    org.telegram.ui.fk fkVar = qnVar4.Y;
                                    if (fkVar != null) {
                                        fkVar.X2 = null;
                                        fkVar.Y2 = false;
                                    }
                                    MessagePreviewParams messagePreviewParams7 = qnVar4.f5;
                                    if (messagePreviewParams7 != null) {
                                        i162 = ((org.telegram.ui.ActionBar.n2) qnVar4).currentAccount;
                                        MessageObject messageObject = qnVar4.n5;
                                        messagePreviewParams7.updateLink(i162, null, null, messageObject == qnVar4.X3 ? null : messageObject, qnVar4.l5, qnVar4.p5);
                                    }
                                    qnVar4.m8();
                                    break;
                                case 12:
                                    ic0 ic0Var7 = this.b;
                                    MessagePreviewParams messagePreviewParams8 = ic0Var7.c0.d;
                                    if (messagePreviewParams8.hasMedia) {
                                        boolean z15 = !messagePreviewParams8.webpageSmall;
                                        messagePreviewParams8.webpageSmall = z15;
                                        ic0Var7.G.a(z15, true);
                                        ic0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                        if (ic0Var7.r.messages.size() > 0 && (message2 = ic0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z16 = messagePreviewParams8.webpageSmall;
                                            messageMedia2.force_small_media = z16;
                                            messageMedia2.force_large_media = !z16;
                                        }
                                        if (ic0Var7.r.previewMessages.size() > 0 && (message = ic0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                            boolean z17 = messagePreviewParams8.webpageSmall;
                                            messageMedia.force_small_media = z17;
                                            messageMedia.force_large_media = !z17;
                                        }
                                        ic0Var7.i();
                                        ic0Var7.U = true;
                                        break;
                                    }
                                    break;
                                default:
                                    ic0 ic0Var8 = this.b;
                                    MessagePreviewParams messagePreviewParams9 = ic0Var8.c0.d;
                                    boolean z18 = messagePreviewParams9.webpageTop;
                                    messagePreviewParams9.webpageTop = !z18;
                                    ic0Var8.E.a(z18, true);
                                    if (ic0Var8.r.messages.size() > 0 && (message4 = ic0Var8.r.messages.get(0).messageOwner) != null) {
                                        message4.invert_media = messagePreviewParams9.webpageTop;
                                    }
                                    if (ic0Var8.r.previewMessages.size() > 0 && (message3 = ic0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                        message3.invert_media = messagePreviewParams9.webpageTop;
                                    }
                                    ic0Var8.i();
                                    ic0Var8.U = true;
                                    break;
                            }
                        }
                    });
                    r92.addView(e1Var6, w7.z5.n(-1, 48));
                    org.telegram.ui.ActionBar.j1 j1Var3 = new org.telegram.ui.ActionBar.j1(context3, kc0Var);
                    j1Var3.setColor(org.telegram.ui.ActionBar.h6.m1(0.06f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.E8, kc0Var)));
                    j1Var3.setTag(R.id.fit_width_tag, 1);
                    r92.addView(j1Var3, w7.z5.n(-1, 8));
                    org.telegram.ui.ActionBar.e1 e1Var7 = new org.telegram.ui.ActionBar.e1(0, context3, oc0Var.F, false, true);
                    e1Var7.g(LocaleController.getString(R.string.QuoteSelectedPart), R.drawable.menu_quote_specific, null);
                    z11 = true;
                    final boolean z14 = true ? 1 : 0;
                    e1Var7.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.sb0
                        public final /* synthetic */ ic0 b;

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
                                            org.telegram.ui.Cells.v9 v9Var = ac0Var2.W;
                                            MessageObject c11 = ic0Var5.c(v9Var != null ? ((org.telegram.ui.Cells.u1) v9Var).getMessageObject() : null);
                                            MessagePreviewParams messagePreviewParams5 = oc0Var2.d;
                                            int i172 = ac0Var2.u;
                                            messagePreviewParams5.quoteStart = i172;
                                            int i182 = ac0Var2.v;
                                            messagePreviewParams5.quoteEnd = i182;
                                            messagePreviewParams5.quote = org.telegram.ui.gn.c(c11, i172, i182);
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
                                    MessagePreviewParams messagePreviewParams6 = oc0Var3.d;
                                    int i192 = oc0Var3.w;
                                    boolean z142 = oc0Var3.b;
                                    if (messagePreviewParams6.quote != null && !z142) {
                                        messagePreviewParams6.quote = null;
                                        ac0Var3.f(false);
                                        ic0Var6.h(false, true);
                                        ic0Var6.l(true);
                                        break;
                                    } else if (ac0Var3.v - ac0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                        MessageObject c12 = ic0Var6.c(null);
                                        if (c12 != null) {
                                            if (!ac0Var3.x()) {
                                                messagePreviewParams6.quoteStart = 0;
                                                int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, org.telegram.ui.gn.d(c12));
                                                messagePreviewParams6.quoteEnd = min;
                                                messagePreviewParams6.quote = org.telegram.ui.gn.c(c12, messagePreviewParams6.quoteStart, min);
                                                View d = ic0Var6.d();
                                                if (d instanceof org.telegram.ui.Cells.u1) {
                                                    ac0Var3.Z((org.telegram.ui.Cells.u1) d, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                                }
                                                if (!z142) {
                                                    ic0Var6.s.getSwipeBack().e(ic0Var6.I);
                                                }
                                                ic0Var6.h(true, true);
                                                break;
                                            } else {
                                                messagePreviewParams6.quoteStart = ac0Var3.u;
                                                messagePreviewParams6.quoteEnd = ac0Var3.v;
                                                org.telegram.ui.Cells.v9 v9Var2 = ac0Var3.W;
                                                messagePreviewParams6.quote = org.telegram.ui.gn.c(ic0Var6.c(v9Var2 != null ? ((org.telegram.ui.Cells.u1) v9Var2).getMessageObject() : null), messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
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
                                        org.telegram.ui.al alVar = (org.telegram.ui.al) oc0Var4;
                                        alVar.a(true);
                                        org.telegram.ui.qn qnVar = alVar.H;
                                        qnVar.n5 = null;
                                        qnVar.l5 = null;
                                        qnVar.f5.updateReply(null, null, qnVar.T5, null);
                                        qnVar.m8();
                                        break;
                                    } else {
                                        org.telegram.ui.al alVar2 = (org.telegram.ui.al) oc0Var4;
                                        alVar2.a(true);
                                        org.telegram.ui.qn qnVar2 = alVar2.H;
                                        qnVar2.l5 = null;
                                        qnVar2.Gb(qnVar2.n5);
                                        break;
                                    }
                                case 7:
                                    this.b.c0.c(true);
                                    break;
                                case 8:
                                    this.b.c0.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.al alVar3 = (org.telegram.ui.al) this.b.c0;
                                    alVar3.a(true);
                                    org.telegram.ui.qn qnVar3 = alVar3.H;
                                    qnVar3.f5.updateForward(null, qnVar3.T5);
                                    qnVar3.m8();
                                    break;
                                case 10:
                                    this.b.c0.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.al alVar4 = (org.telegram.ui.al) this.b.c0;
                                    alVar4.a(true);
                                    org.telegram.ui.qn qnVar4 = alVar4.H;
                                    qnVar4.G5 = null;
                                    org.telegram.ui.fk fkVar = qnVar4.Y;
                                    if (fkVar != null) {
                                        fkVar.X2 = null;
                                        fkVar.Y2 = false;
                                    }
                                    MessagePreviewParams messagePreviewParams7 = qnVar4.f5;
                                    if (messagePreviewParams7 != null) {
                                        i162 = ((org.telegram.ui.ActionBar.n2) qnVar4).currentAccount;
                                        MessageObject messageObject = qnVar4.n5;
                                        messagePreviewParams7.updateLink(i162, null, null, messageObject == qnVar4.X3 ? null : messageObject, qnVar4.l5, qnVar4.p5);
                                    }
                                    qnVar4.m8();
                                    break;
                                case 12:
                                    ic0 ic0Var7 = this.b;
                                    MessagePreviewParams messagePreviewParams8 = ic0Var7.c0.d;
                                    if (messagePreviewParams8.hasMedia) {
                                        boolean z15 = !messagePreviewParams8.webpageSmall;
                                        messagePreviewParams8.webpageSmall = z15;
                                        ic0Var7.G.a(z15, true);
                                        ic0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                        if (ic0Var7.r.messages.size() > 0 && (message2 = ic0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z16 = messagePreviewParams8.webpageSmall;
                                            messageMedia2.force_small_media = z16;
                                            messageMedia2.force_large_media = !z16;
                                        }
                                        if (ic0Var7.r.previewMessages.size() > 0 && (message = ic0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                            boolean z17 = messagePreviewParams8.webpageSmall;
                                            messageMedia.force_small_media = z17;
                                            messageMedia.force_large_media = !z17;
                                        }
                                        ic0Var7.i();
                                        ic0Var7.U = true;
                                        break;
                                    }
                                    break;
                                default:
                                    ic0 ic0Var8 = this.b;
                                    MessagePreviewParams messagePreviewParams9 = ic0Var8.c0.d;
                                    boolean z18 = messagePreviewParams9.webpageTop;
                                    messagePreviewParams9.webpageTop = !z18;
                                    ic0Var8.E.a(z18, true);
                                    if (ic0Var8.r.messages.size() > 0 && (message4 = ic0Var8.r.messages.get(0).messageOwner) != null) {
                                        message4.invert_media = messagePreviewParams9.webpageTop;
                                    }
                                    if (ic0Var8.r.previewMessages.size() > 0 && (message3 = ic0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                        message3.invert_media = messagePreviewParams9.webpageTop;
                                    }
                                    ic0Var8.i();
                                    ic0Var8.U = true;
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
                zb0 zb0Var = new zb0(1, 0, context, oc0Var.F, true, false);
                this.v = zb0Var;
                zb0Var.g(LocaleController.getString(z13 ? R.string.QuoteSelectedPart : R.string.SelectSpecificQuote), R.drawable.menu_select_quote, drawable);
                zb0 zb0Var2 = new zb0(1, 1, context, oc0Var.F, true, false);
                context3 = context;
                this.w = zb0Var2;
                zb0Var2.g(LocaleController.getString(R.string.ClearQuote), R.drawable.menu_quote_delete, drawable);
                frameLayout2.setBackground(org.telegram.ui.ActionBar.h6.Z(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.I5, kc0Var), 6, 0));
                final int i25 = 2;
                frameLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.sb0
                    public final /* synthetic */ ic0 b;

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
                                        org.telegram.ui.Cells.v9 v9Var = ac0Var2.W;
                                        MessageObject c11 = ic0Var5.c(v9Var != null ? ((org.telegram.ui.Cells.u1) v9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams5 = oc0Var2.d;
                                        int i172 = ac0Var2.u;
                                        messagePreviewParams5.quoteStart = i172;
                                        int i182 = ac0Var2.v;
                                        messagePreviewParams5.quoteEnd = i182;
                                        messagePreviewParams5.quote = org.telegram.ui.gn.c(c11, i172, i182);
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
                                MessagePreviewParams messagePreviewParams6 = oc0Var3.d;
                                int i192 = oc0Var3.w;
                                boolean z142 = oc0Var3.b;
                                if (messagePreviewParams6.quote != null && !z142) {
                                    messagePreviewParams6.quote = null;
                                    ac0Var3.f(false);
                                    ic0Var6.h(false, true);
                                    ic0Var6.l(true);
                                    break;
                                } else if (ac0Var3.v - ac0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                    MessageObject c12 = ic0Var6.c(null);
                                    if (c12 != null) {
                                        if (!ac0Var3.x()) {
                                            messagePreviewParams6.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, org.telegram.ui.gn.d(c12));
                                            messagePreviewParams6.quoteEnd = min;
                                            messagePreviewParams6.quote = org.telegram.ui.gn.c(c12, messagePreviewParams6.quoteStart, min);
                                            View d = ic0Var6.d();
                                            if (d instanceof org.telegram.ui.Cells.u1) {
                                                ac0Var3.Z((org.telegram.ui.Cells.u1) d, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                            }
                                            if (!z142) {
                                                ic0Var6.s.getSwipeBack().e(ic0Var6.I);
                                            }
                                            ic0Var6.h(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams6.quoteStart = ac0Var3.u;
                                            messagePreviewParams6.quoteEnd = ac0Var3.v;
                                            org.telegram.ui.Cells.v9 v9Var2 = ac0Var3.W;
                                            messagePreviewParams6.quote = org.telegram.ui.gn.c(ic0Var6.c(v9Var2 != null ? ((org.telegram.ui.Cells.u1) v9Var2).getMessageObject() : null), messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
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
                                    org.telegram.ui.al alVar = (org.telegram.ui.al) oc0Var4;
                                    alVar.a(true);
                                    org.telegram.ui.qn qnVar = alVar.H;
                                    qnVar.n5 = null;
                                    qnVar.l5 = null;
                                    qnVar.f5.updateReply(null, null, qnVar.T5, null);
                                    qnVar.m8();
                                    break;
                                } else {
                                    org.telegram.ui.al alVar2 = (org.telegram.ui.al) oc0Var4;
                                    alVar2.a(true);
                                    org.telegram.ui.qn qnVar2 = alVar2.H;
                                    qnVar2.l5 = null;
                                    qnVar2.Gb(qnVar2.n5);
                                    break;
                                }
                            case 7:
                                this.b.c0.c(true);
                                break;
                            case 8:
                                this.b.c0.a(true);
                                break;
                            case 9:
                                org.telegram.ui.al alVar3 = (org.telegram.ui.al) this.b.c0;
                                alVar3.a(true);
                                org.telegram.ui.qn qnVar3 = alVar3.H;
                                qnVar3.f5.updateForward(null, qnVar3.T5);
                                qnVar3.m8();
                                break;
                            case 10:
                                this.b.c0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.al alVar4 = (org.telegram.ui.al) this.b.c0;
                                alVar4.a(true);
                                org.telegram.ui.qn qnVar4 = alVar4.H;
                                qnVar4.G5 = null;
                                org.telegram.ui.fk fkVar = qnVar4.Y;
                                if (fkVar != null) {
                                    fkVar.X2 = null;
                                    fkVar.Y2 = false;
                                }
                                MessagePreviewParams messagePreviewParams7 = qnVar4.f5;
                                if (messagePreviewParams7 != null) {
                                    i162 = ((org.telegram.ui.ActionBar.n2) qnVar4).currentAccount;
                                    MessageObject messageObject = qnVar4.n5;
                                    messagePreviewParams7.updateLink(i162, null, null, messageObject == qnVar4.X3 ? null : messageObject, qnVar4.l5, qnVar4.p5);
                                }
                                qnVar4.m8();
                                break;
                            case 12:
                                ic0 ic0Var7 = this.b;
                                MessagePreviewParams messagePreviewParams8 = ic0Var7.c0.d;
                                if (messagePreviewParams8.hasMedia) {
                                    boolean z15 = !messagePreviewParams8.webpageSmall;
                                    messagePreviewParams8.webpageSmall = z15;
                                    ic0Var7.G.a(z15, true);
                                    ic0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                    if (ic0Var7.r.messages.size() > 0 && (message2 = ic0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z16 = messagePreviewParams8.webpageSmall;
                                        messageMedia2.force_small_media = z16;
                                        messageMedia2.force_large_media = !z16;
                                    }
                                    if (ic0Var7.r.previewMessages.size() > 0 && (message = ic0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z17 = messagePreviewParams8.webpageSmall;
                                        messageMedia.force_small_media = z17;
                                        messageMedia.force_large_media = !z17;
                                    }
                                    ic0Var7.i();
                                    ic0Var7.U = true;
                                    break;
                                }
                                break;
                            default:
                                ic0 ic0Var8 = this.b;
                                MessagePreviewParams messagePreviewParams9 = ic0Var8.c0.d;
                                boolean z18 = messagePreviewParams9.webpageTop;
                                messagePreviewParams9.webpageTop = !z18;
                                ic0Var8.E.a(z18, true);
                                if (ic0Var8.r.messages.size() > 0 && (message4 = ic0Var8.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams9.webpageTop;
                                }
                                if (ic0Var8.r.previewMessages.size() > 0 && (message3 = ic0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams9.webpageTop;
                                }
                                ic0Var8.i();
                                ic0Var8.U = true;
                                break;
                        }
                    }
                });
                frameLayout2.addView(zb0Var, w7.z5.c(48.0f, -1));
                frameLayout2.addView(zb0Var2, w7.z5.c(48.0f, -1));
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout2, w7.z5.n(-1, 48));
                r11 = drawable;
            }
            messagePreviewParams = messagePreviewParams2;
            if (!messagePreviewParams.monoforum && !messagePreviewParams.noforwards && !messagePreviewParams.hasSecretMessages) {
                ?? frameLayout3 = new FrameLayout(context3);
                ?? e1Var8 = new org.telegram.ui.ActionBar.e1(1, context3, oc0Var.F, false, false);
                this.x = e1Var8;
                e1Var8.g(LocaleController.getString(R.string.ReplyToAnotherChat), R.drawable.msg_forward_replace, r11);
                final int i26 = 3;
                e1Var8.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.sb0
                    public final /* synthetic */ ic0 b;

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
                                        org.telegram.ui.Cells.v9 v9Var = ac0Var2.W;
                                        MessageObject c11 = ic0Var5.c(v9Var != null ? ((org.telegram.ui.Cells.u1) v9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams5 = oc0Var2.d;
                                        int i172 = ac0Var2.u;
                                        messagePreviewParams5.quoteStart = i172;
                                        int i182 = ac0Var2.v;
                                        messagePreviewParams5.quoteEnd = i182;
                                        messagePreviewParams5.quote = org.telegram.ui.gn.c(c11, i172, i182);
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
                                MessagePreviewParams messagePreviewParams6 = oc0Var3.d;
                                int i192 = oc0Var3.w;
                                boolean z142 = oc0Var3.b;
                                if (messagePreviewParams6.quote != null && !z142) {
                                    messagePreviewParams6.quote = null;
                                    ac0Var3.f(false);
                                    ic0Var6.h(false, true);
                                    ic0Var6.l(true);
                                    break;
                                } else if (ac0Var3.v - ac0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                    MessageObject c12 = ic0Var6.c(null);
                                    if (c12 != null) {
                                        if (!ac0Var3.x()) {
                                            messagePreviewParams6.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, org.telegram.ui.gn.d(c12));
                                            messagePreviewParams6.quoteEnd = min;
                                            messagePreviewParams6.quote = org.telegram.ui.gn.c(c12, messagePreviewParams6.quoteStart, min);
                                            View d = ic0Var6.d();
                                            if (d instanceof org.telegram.ui.Cells.u1) {
                                                ac0Var3.Z((org.telegram.ui.Cells.u1) d, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                            }
                                            if (!z142) {
                                                ic0Var6.s.getSwipeBack().e(ic0Var6.I);
                                            }
                                            ic0Var6.h(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams6.quoteStart = ac0Var3.u;
                                            messagePreviewParams6.quoteEnd = ac0Var3.v;
                                            org.telegram.ui.Cells.v9 v9Var2 = ac0Var3.W;
                                            messagePreviewParams6.quote = org.telegram.ui.gn.c(ic0Var6.c(v9Var2 != null ? ((org.telegram.ui.Cells.u1) v9Var2).getMessageObject() : null), messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
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
                                    org.telegram.ui.al alVar = (org.telegram.ui.al) oc0Var4;
                                    alVar.a(true);
                                    org.telegram.ui.qn qnVar = alVar.H;
                                    qnVar.n5 = null;
                                    qnVar.l5 = null;
                                    qnVar.f5.updateReply(null, null, qnVar.T5, null);
                                    qnVar.m8();
                                    break;
                                } else {
                                    org.telegram.ui.al alVar2 = (org.telegram.ui.al) oc0Var4;
                                    alVar2.a(true);
                                    org.telegram.ui.qn qnVar2 = alVar2.H;
                                    qnVar2.l5 = null;
                                    qnVar2.Gb(qnVar2.n5);
                                    break;
                                }
                            case 7:
                                this.b.c0.c(true);
                                break;
                            case 8:
                                this.b.c0.a(true);
                                break;
                            case 9:
                                org.telegram.ui.al alVar3 = (org.telegram.ui.al) this.b.c0;
                                alVar3.a(true);
                                org.telegram.ui.qn qnVar3 = alVar3.H;
                                qnVar3.f5.updateForward(null, qnVar3.T5);
                                qnVar3.m8();
                                break;
                            case 10:
                                this.b.c0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.al alVar4 = (org.telegram.ui.al) this.b.c0;
                                alVar4.a(true);
                                org.telegram.ui.qn qnVar4 = alVar4.H;
                                qnVar4.G5 = null;
                                org.telegram.ui.fk fkVar = qnVar4.Y;
                                if (fkVar != null) {
                                    fkVar.X2 = null;
                                    fkVar.Y2 = false;
                                }
                                MessagePreviewParams messagePreviewParams7 = qnVar4.f5;
                                if (messagePreviewParams7 != null) {
                                    i162 = ((org.telegram.ui.ActionBar.n2) qnVar4).currentAccount;
                                    MessageObject messageObject = qnVar4.n5;
                                    messagePreviewParams7.updateLink(i162, null, null, messageObject == qnVar4.X3 ? null : messageObject, qnVar4.l5, qnVar4.p5);
                                }
                                qnVar4.m8();
                                break;
                            case 12:
                                ic0 ic0Var7 = this.b;
                                MessagePreviewParams messagePreviewParams8 = ic0Var7.c0.d;
                                if (messagePreviewParams8.hasMedia) {
                                    boolean z15 = !messagePreviewParams8.webpageSmall;
                                    messagePreviewParams8.webpageSmall = z15;
                                    ic0Var7.G.a(z15, true);
                                    ic0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                    if (ic0Var7.r.messages.size() > 0 && (message2 = ic0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z16 = messagePreviewParams8.webpageSmall;
                                        messageMedia2.force_small_media = z16;
                                        messageMedia2.force_large_media = !z16;
                                    }
                                    if (ic0Var7.r.previewMessages.size() > 0 && (message = ic0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z17 = messagePreviewParams8.webpageSmall;
                                        messageMedia.force_small_media = z17;
                                        messageMedia.force_large_media = !z17;
                                    }
                                    ic0Var7.i();
                                    ic0Var7.U = true;
                                    break;
                                }
                                break;
                            default:
                                ic0 ic0Var8 = this.b;
                                MessagePreviewParams messagePreviewParams9 = ic0Var8.c0.d;
                                boolean z18 = messagePreviewParams9.webpageTop;
                                messagePreviewParams9.webpageTop = !z18;
                                ic0Var8.E.a(z18, true);
                                if (ic0Var8.r.messages.size() > 0 && (message4 = ic0Var8.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams9.webpageTop;
                                }
                                if (ic0Var8.r.previewMessages.size() > 0 && (message3 = ic0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams9.webpageTop;
                                }
                                ic0Var8.i();
                                ic0Var8.U = true;
                                break;
                        }
                    }
                });
                context3 = context;
                ?? e1Var9 = new org.telegram.ui.ActionBar.e1(1, context3, oc0Var.F, false, false);
                this.y = e1Var9;
                e1Var9.g(LocaleController.getString(R.string.QuoteToAnotherChat), R.drawable.msg_forward_replace, r11);
                final int i27 = 4;
                e1Var9.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.sb0
                    public final /* synthetic */ ic0 b;

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
                                        org.telegram.ui.Cells.v9 v9Var = ac0Var2.W;
                                        MessageObject c11 = ic0Var5.c(v9Var != null ? ((org.telegram.ui.Cells.u1) v9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams5 = oc0Var2.d;
                                        int i172 = ac0Var2.u;
                                        messagePreviewParams5.quoteStart = i172;
                                        int i182 = ac0Var2.v;
                                        messagePreviewParams5.quoteEnd = i182;
                                        messagePreviewParams5.quote = org.telegram.ui.gn.c(c11, i172, i182);
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
                                MessagePreviewParams messagePreviewParams6 = oc0Var3.d;
                                int i192 = oc0Var3.w;
                                boolean z142 = oc0Var3.b;
                                if (messagePreviewParams6.quote != null && !z142) {
                                    messagePreviewParams6.quote = null;
                                    ac0Var3.f(false);
                                    ic0Var6.h(false, true);
                                    ic0Var6.l(true);
                                    break;
                                } else if (ac0Var3.v - ac0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                    MessageObject c12 = ic0Var6.c(null);
                                    if (c12 != null) {
                                        if (!ac0Var3.x()) {
                                            messagePreviewParams6.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, org.telegram.ui.gn.d(c12));
                                            messagePreviewParams6.quoteEnd = min;
                                            messagePreviewParams6.quote = org.telegram.ui.gn.c(c12, messagePreviewParams6.quoteStart, min);
                                            View d = ic0Var6.d();
                                            if (d instanceof org.telegram.ui.Cells.u1) {
                                                ac0Var3.Z((org.telegram.ui.Cells.u1) d, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                            }
                                            if (!z142) {
                                                ic0Var6.s.getSwipeBack().e(ic0Var6.I);
                                            }
                                            ic0Var6.h(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams6.quoteStart = ac0Var3.u;
                                            messagePreviewParams6.quoteEnd = ac0Var3.v;
                                            org.telegram.ui.Cells.v9 v9Var2 = ac0Var3.W;
                                            messagePreviewParams6.quote = org.telegram.ui.gn.c(ic0Var6.c(v9Var2 != null ? ((org.telegram.ui.Cells.u1) v9Var2).getMessageObject() : null), messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
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
                                    org.telegram.ui.al alVar = (org.telegram.ui.al) oc0Var4;
                                    alVar.a(true);
                                    org.telegram.ui.qn qnVar = alVar.H;
                                    qnVar.n5 = null;
                                    qnVar.l5 = null;
                                    qnVar.f5.updateReply(null, null, qnVar.T5, null);
                                    qnVar.m8();
                                    break;
                                } else {
                                    org.telegram.ui.al alVar2 = (org.telegram.ui.al) oc0Var4;
                                    alVar2.a(true);
                                    org.telegram.ui.qn qnVar2 = alVar2.H;
                                    qnVar2.l5 = null;
                                    qnVar2.Gb(qnVar2.n5);
                                    break;
                                }
                            case 7:
                                this.b.c0.c(true);
                                break;
                            case 8:
                                this.b.c0.a(true);
                                break;
                            case 9:
                                org.telegram.ui.al alVar3 = (org.telegram.ui.al) this.b.c0;
                                alVar3.a(true);
                                org.telegram.ui.qn qnVar3 = alVar3.H;
                                qnVar3.f5.updateForward(null, qnVar3.T5);
                                qnVar3.m8();
                                break;
                            case 10:
                                this.b.c0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.al alVar4 = (org.telegram.ui.al) this.b.c0;
                                alVar4.a(true);
                                org.telegram.ui.qn qnVar4 = alVar4.H;
                                qnVar4.G5 = null;
                                org.telegram.ui.fk fkVar = qnVar4.Y;
                                if (fkVar != null) {
                                    fkVar.X2 = null;
                                    fkVar.Y2 = false;
                                }
                                MessagePreviewParams messagePreviewParams7 = qnVar4.f5;
                                if (messagePreviewParams7 != null) {
                                    i162 = ((org.telegram.ui.ActionBar.n2) qnVar4).currentAccount;
                                    MessageObject messageObject = qnVar4.n5;
                                    messagePreviewParams7.updateLink(i162, null, null, messageObject == qnVar4.X3 ? null : messageObject, qnVar4.l5, qnVar4.p5);
                                }
                                qnVar4.m8();
                                break;
                            case 12:
                                ic0 ic0Var7 = this.b;
                                MessagePreviewParams messagePreviewParams8 = ic0Var7.c0.d;
                                if (messagePreviewParams8.hasMedia) {
                                    boolean z15 = !messagePreviewParams8.webpageSmall;
                                    messagePreviewParams8.webpageSmall = z15;
                                    ic0Var7.G.a(z15, true);
                                    ic0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                    if (ic0Var7.r.messages.size() > 0 && (message2 = ic0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z16 = messagePreviewParams8.webpageSmall;
                                        messageMedia2.force_small_media = z16;
                                        messageMedia2.force_large_media = !z16;
                                    }
                                    if (ic0Var7.r.previewMessages.size() > 0 && (message = ic0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z17 = messagePreviewParams8.webpageSmall;
                                        messageMedia.force_small_media = z17;
                                        messageMedia.force_large_media = !z17;
                                    }
                                    ic0Var7.i();
                                    ic0Var7.U = true;
                                    break;
                                }
                                break;
                            default:
                                ic0 ic0Var8 = this.b;
                                MessagePreviewParams messagePreviewParams9 = ic0Var8.c0.d;
                                boolean z18 = messagePreviewParams9.webpageTop;
                                messagePreviewParams9.webpageTop = !z18;
                                ic0Var8.E.a(z18, true);
                                if (ic0Var8.r.messages.size() > 0 && (message4 = ic0Var8.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams9.webpageTop;
                                }
                                if (ic0Var8.r.previewMessages.size() > 0 && (message3 = ic0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams9.webpageTop;
                                }
                                ic0Var8.i();
                                ic0Var8.U = true;
                                break;
                        }
                    }
                });
                frameLayout3.addView(e1Var9, w7.z5.c(48.0f, -1));
                frameLayout3.addView(e1Var8, w7.z5.c(48.0f, -1));
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout3, w7.z5.n(-1, 48));
            }
            if (!messagePreviewParams.noforwards && !messagePreviewParams.hasSecretMessages) {
                org.telegram.ui.ActionBar.j1 j1Var4 = new org.telegram.ui.ActionBar.j1(context3, kc0Var);
                j1Var4.setColor(org.telegram.ui.ActionBar.h6.m1(0.06f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.E8, kc0Var)));
                j1Var4.setTag(R.id.fit_width_tag, 1);
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(j1Var4, w7.z5.n(-1, 8));
            }
            h(messagePreviewParams.quote != null, false);
            ?? e1Var10 = new org.telegram.ui.ActionBar.e1(1, context3, oc0Var.F, false, false);
            e1Var10.g(LocaleController.getString(R.string.ApplyChanges), R.drawable.msg_select, r11);
            final int i28 = 5;
            e1Var10.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.sb0
                public final /* synthetic */ ic0 b;

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
                                    org.telegram.ui.Cells.v9 v9Var = ac0Var2.W;
                                    MessageObject c11 = ic0Var5.c(v9Var != null ? ((org.telegram.ui.Cells.u1) v9Var).getMessageObject() : null);
                                    MessagePreviewParams messagePreviewParams5 = oc0Var2.d;
                                    int i172 = ac0Var2.u;
                                    messagePreviewParams5.quoteStart = i172;
                                    int i182 = ac0Var2.v;
                                    messagePreviewParams5.quoteEnd = i182;
                                    messagePreviewParams5.quote = org.telegram.ui.gn.c(c11, i172, i182);
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
                            MessagePreviewParams messagePreviewParams6 = oc0Var3.d;
                            int i192 = oc0Var3.w;
                            boolean z142 = oc0Var3.b;
                            if (messagePreviewParams6.quote != null && !z142) {
                                messagePreviewParams6.quote = null;
                                ac0Var3.f(false);
                                ic0Var6.h(false, true);
                                ic0Var6.l(true);
                                break;
                            } else if (ac0Var3.v - ac0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                MessageObject c12 = ic0Var6.c(null);
                                if (c12 != null) {
                                    if (!ac0Var3.x()) {
                                        messagePreviewParams6.quoteStart = 0;
                                        int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, org.telegram.ui.gn.d(c12));
                                        messagePreviewParams6.quoteEnd = min;
                                        messagePreviewParams6.quote = org.telegram.ui.gn.c(c12, messagePreviewParams6.quoteStart, min);
                                        View d = ic0Var6.d();
                                        if (d instanceof org.telegram.ui.Cells.u1) {
                                            ac0Var3.Z((org.telegram.ui.Cells.u1) d, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                        }
                                        if (!z142) {
                                            ic0Var6.s.getSwipeBack().e(ic0Var6.I);
                                        }
                                        ic0Var6.h(true, true);
                                        break;
                                    } else {
                                        messagePreviewParams6.quoteStart = ac0Var3.u;
                                        messagePreviewParams6.quoteEnd = ac0Var3.v;
                                        org.telegram.ui.Cells.v9 v9Var2 = ac0Var3.W;
                                        messagePreviewParams6.quote = org.telegram.ui.gn.c(ic0Var6.c(v9Var2 != null ? ((org.telegram.ui.Cells.u1) v9Var2).getMessageObject() : null), messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
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
                                org.telegram.ui.al alVar = (org.telegram.ui.al) oc0Var4;
                                alVar.a(true);
                                org.telegram.ui.qn qnVar = alVar.H;
                                qnVar.n5 = null;
                                qnVar.l5 = null;
                                qnVar.f5.updateReply(null, null, qnVar.T5, null);
                                qnVar.m8();
                                break;
                            } else {
                                org.telegram.ui.al alVar2 = (org.telegram.ui.al) oc0Var4;
                                alVar2.a(true);
                                org.telegram.ui.qn qnVar2 = alVar2.H;
                                qnVar2.l5 = null;
                                qnVar2.Gb(qnVar2.n5);
                                break;
                            }
                        case 7:
                            this.b.c0.c(true);
                            break;
                        case 8:
                            this.b.c0.a(true);
                            break;
                        case 9:
                            org.telegram.ui.al alVar3 = (org.telegram.ui.al) this.b.c0;
                            alVar3.a(true);
                            org.telegram.ui.qn qnVar3 = alVar3.H;
                            qnVar3.f5.updateForward(null, qnVar3.T5);
                            qnVar3.m8();
                            break;
                        case 10:
                            this.b.c0.a(true);
                            break;
                        case 11:
                            org.telegram.ui.al alVar4 = (org.telegram.ui.al) this.b.c0;
                            alVar4.a(true);
                            org.telegram.ui.qn qnVar4 = alVar4.H;
                            qnVar4.G5 = null;
                            org.telegram.ui.fk fkVar = qnVar4.Y;
                            if (fkVar != null) {
                                fkVar.X2 = null;
                                fkVar.Y2 = false;
                            }
                            MessagePreviewParams messagePreviewParams7 = qnVar4.f5;
                            if (messagePreviewParams7 != null) {
                                i162 = ((org.telegram.ui.ActionBar.n2) qnVar4).currentAccount;
                                MessageObject messageObject = qnVar4.n5;
                                messagePreviewParams7.updateLink(i162, null, null, messageObject == qnVar4.X3 ? null : messageObject, qnVar4.l5, qnVar4.p5);
                            }
                            qnVar4.m8();
                            break;
                        case 12:
                            ic0 ic0Var7 = this.b;
                            MessagePreviewParams messagePreviewParams8 = ic0Var7.c0.d;
                            if (messagePreviewParams8.hasMedia) {
                                boolean z15 = !messagePreviewParams8.webpageSmall;
                                messagePreviewParams8.webpageSmall = z15;
                                ic0Var7.G.a(z15, true);
                                ic0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                if (ic0Var7.r.messages.size() > 0 && (message2 = ic0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                    boolean z16 = messagePreviewParams8.webpageSmall;
                                    messageMedia2.force_small_media = z16;
                                    messageMedia2.force_large_media = !z16;
                                }
                                if (ic0Var7.r.previewMessages.size() > 0 && (message = ic0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                    boolean z17 = messagePreviewParams8.webpageSmall;
                                    messageMedia.force_small_media = z17;
                                    messageMedia.force_large_media = !z17;
                                }
                                ic0Var7.i();
                                ic0Var7.U = true;
                                break;
                            }
                            break;
                        default:
                            ic0 ic0Var8 = this.b;
                            MessagePreviewParams messagePreviewParams9 = ic0Var8.c0.d;
                            boolean z18 = messagePreviewParams9.webpageTop;
                            messagePreviewParams9.webpageTop = !z18;
                            ic0Var8.E.a(z18, true);
                            if (ic0Var8.r.messages.size() > 0 && (message4 = ic0Var8.r.messages.get(0).messageOwner) != null) {
                                message4.invert_media = messagePreviewParams9.webpageTop;
                            }
                            if (ic0Var8.r.previewMessages.size() > 0 && (message3 = ic0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                message3.invert_media = messagePreviewParams9.webpageTop;
                            }
                            ic0Var8.i();
                            ic0Var8.U = true;
                            break;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var10, w7.z5.n(-1, 48));
            ?? e1Var11 = new org.telegram.ui.ActionBar.e1(1, context, oc0Var.F, false, true);
            e1Var11.g(LocaleController.getString(z13 ? R.string.DoNotQuote : R.string.DoNotReply), R.drawable.msg_delete, r11);
            int w04 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.q7, kc0Var);
            int i29 = org.telegram.ui.ActionBar.h6.p7;
            e1Var11.c(w04, org.telegram.ui.ActionBar.h6.w0(i29, kc0Var));
            e1Var11.setSelectorColor(org.telegram.ui.ActionBar.h6.m1(0.12f, org.telegram.ui.ActionBar.h6.x0(r11, i29, false)));
            final int i30 = 6;
            e1Var11.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.sb0
                public final /* synthetic */ ic0 b;

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
                                    org.telegram.ui.Cells.v9 v9Var = ac0Var2.W;
                                    MessageObject c11 = ic0Var5.c(v9Var != null ? ((org.telegram.ui.Cells.u1) v9Var).getMessageObject() : null);
                                    MessagePreviewParams messagePreviewParams5 = oc0Var2.d;
                                    int i172 = ac0Var2.u;
                                    messagePreviewParams5.quoteStart = i172;
                                    int i182 = ac0Var2.v;
                                    messagePreviewParams5.quoteEnd = i182;
                                    messagePreviewParams5.quote = org.telegram.ui.gn.c(c11, i172, i182);
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
                            MessagePreviewParams messagePreviewParams6 = oc0Var3.d;
                            int i192 = oc0Var3.w;
                            boolean z142 = oc0Var3.b;
                            if (messagePreviewParams6.quote != null && !z142) {
                                messagePreviewParams6.quote = null;
                                ac0Var3.f(false);
                                ic0Var6.h(false, true);
                                ic0Var6.l(true);
                                break;
                            } else if (ac0Var3.v - ac0Var3.u <= MessagesController.getInstance(i192).quoteLengthMax) {
                                MessageObject c12 = ic0Var6.c(null);
                                if (c12 != null) {
                                    if (!ac0Var3.x()) {
                                        messagePreviewParams6.quoteStart = 0;
                                        int min = Math.min(MessagesController.getInstance(i192).quoteLengthMax, org.telegram.ui.gn.d(c12));
                                        messagePreviewParams6.quoteEnd = min;
                                        messagePreviewParams6.quote = org.telegram.ui.gn.c(c12, messagePreviewParams6.quoteStart, min);
                                        View d = ic0Var6.d();
                                        if (d instanceof org.telegram.ui.Cells.u1) {
                                            ac0Var3.Z((org.telegram.ui.Cells.u1) d, messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
                                        }
                                        if (!z142) {
                                            ic0Var6.s.getSwipeBack().e(ic0Var6.I);
                                        }
                                        ic0Var6.h(true, true);
                                        break;
                                    } else {
                                        messagePreviewParams6.quoteStart = ac0Var3.u;
                                        messagePreviewParams6.quoteEnd = ac0Var3.v;
                                        org.telegram.ui.Cells.v9 v9Var2 = ac0Var3.W;
                                        messagePreviewParams6.quote = org.telegram.ui.gn.c(ic0Var6.c(v9Var2 != null ? ((org.telegram.ui.Cells.u1) v9Var2).getMessageObject() : null), messagePreviewParams6.quoteStart, messagePreviewParams6.quoteEnd);
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
                                org.telegram.ui.al alVar = (org.telegram.ui.al) oc0Var4;
                                alVar.a(true);
                                org.telegram.ui.qn qnVar = alVar.H;
                                qnVar.n5 = null;
                                qnVar.l5 = null;
                                qnVar.f5.updateReply(null, null, qnVar.T5, null);
                                qnVar.m8();
                                break;
                            } else {
                                org.telegram.ui.al alVar2 = (org.telegram.ui.al) oc0Var4;
                                alVar2.a(true);
                                org.telegram.ui.qn qnVar2 = alVar2.H;
                                qnVar2.l5 = null;
                                qnVar2.Gb(qnVar2.n5);
                                break;
                            }
                        case 7:
                            this.b.c0.c(true);
                            break;
                        case 8:
                            this.b.c0.a(true);
                            break;
                        case 9:
                            org.telegram.ui.al alVar3 = (org.telegram.ui.al) this.b.c0;
                            alVar3.a(true);
                            org.telegram.ui.qn qnVar3 = alVar3.H;
                            qnVar3.f5.updateForward(null, qnVar3.T5);
                            qnVar3.m8();
                            break;
                        case 10:
                            this.b.c0.a(true);
                            break;
                        case 11:
                            org.telegram.ui.al alVar4 = (org.telegram.ui.al) this.b.c0;
                            alVar4.a(true);
                            org.telegram.ui.qn qnVar4 = alVar4.H;
                            qnVar4.G5 = null;
                            org.telegram.ui.fk fkVar = qnVar4.Y;
                            if (fkVar != null) {
                                fkVar.X2 = null;
                                fkVar.Y2 = false;
                            }
                            MessagePreviewParams messagePreviewParams7 = qnVar4.f5;
                            if (messagePreviewParams7 != null) {
                                i162 = ((org.telegram.ui.ActionBar.n2) qnVar4).currentAccount;
                                MessageObject messageObject = qnVar4.n5;
                                messagePreviewParams7.updateLink(i162, null, null, messageObject == qnVar4.X3 ? null : messageObject, qnVar4.l5, qnVar4.p5);
                            }
                            qnVar4.m8();
                            break;
                        case 12:
                            ic0 ic0Var7 = this.b;
                            MessagePreviewParams messagePreviewParams8 = ic0Var7.c0.d;
                            if (messagePreviewParams8.hasMedia) {
                                boolean z15 = !messagePreviewParams8.webpageSmall;
                                messagePreviewParams8.webpageSmall = z15;
                                ic0Var7.G.a(z15, true);
                                ic0Var7.H.a(messagePreviewParams8.webpageSmall, true);
                                if (ic0Var7.r.messages.size() > 0 && (message2 = ic0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                    boolean z16 = messagePreviewParams8.webpageSmall;
                                    messageMedia2.force_small_media = z16;
                                    messageMedia2.force_large_media = !z16;
                                }
                                if (ic0Var7.r.previewMessages.size() > 0 && (message = ic0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                    boolean z17 = messagePreviewParams8.webpageSmall;
                                    messageMedia.force_small_media = z17;
                                    messageMedia.force_large_media = !z17;
                                }
                                ic0Var7.i();
                                ic0Var7.U = true;
                                break;
                            }
                            break;
                        default:
                            ic0 ic0Var8 = this.b;
                            MessagePreviewParams messagePreviewParams9 = ic0Var8.c0.d;
                            boolean z18 = messagePreviewParams9.webpageTop;
                            messagePreviewParams9.webpageTop = !z18;
                            ic0Var8.E.a(z18, true);
                            if (ic0Var8.r.messages.size() > 0 && (message4 = ic0Var8.r.messages.get(0).messageOwner) != null) {
                                message4.invert_media = messagePreviewParams9.webpageTop;
                            }
                            if (ic0Var8.r.previewMessages.size() > 0 && (message3 = ic0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                message3.invert_media = messagePreviewParams9.webpageTop;
                            }
                            ic0Var8.i();
                            ic0Var8.U = true;
                            break;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var11, w7.z5.n(-1, 48));
            context2 = context;
            ic0Var2 = this;
            viewOutlineProvider = r11;
        }
        int i31 = ic0Var2.a;
        if (i31 == 1) {
            ic0Var2.r = messagePreviewParams.forwardMessages;
        } else if (i31 == 0) {
            ic0Var2.r = messagePreviewParams.replyMessage;
        } else if (i31 == 2) {
            ic0Var2.r = messagePreviewParams.linkMessage;
        }
        org.telegram.ui.Cells.z9 n10 = ic0Var2.e.n(context2);
        ic0Var2.d = n10;
        n10.setElevation(AndroidUtilities.dp(8.0f));
        n10.setOutlineProvider(viewOutlineProvider);
        if (n10.getParent() instanceof ViewGroup) {
            ((ViewGroup) n10.getParent()).removeView(n10);
        }
        ic0Var2.addView(n10, w7.z5.d(-1, -1.0f, 51, 0.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / AndroidUtilities.density, 0.0f, 0.0f));
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

    public static void b(ic0 ic0Var, org.telegram.ui.Cells.u1 u1Var) {
        CharacterStyle characterStyle;
        TLRPC.WebPage webPage;
        if (ic0Var.a == 2) {
            MessagePreviewParams messagePreviewParams = ic0Var.c0.d;
            if (!messagePreviewParams.singleLink && (characterStyle = messagePreviewParams.currentLink) != null && (webPage = messagePreviewParams.webpage) != null && !(webPage instanceof TLRPC.TL_webPagePending)) {
                u1Var.Q3(characterStyle);
                return;
            }
        }
        u1Var.Q3(null);
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
            org.telegram.ui.gn gnVar = oc0Var.d.quote;
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
            int i10 = 0;
            while (true) {
                bc0 bc0Var = this.f;
                if (i10 >= bc0Var.getChildCount()) {
                    break;
                }
                View childAt = bc0Var.getChildAt(i10);
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) childAt;
                if (n4Var.getMessageObject() != null && (n4Var.getMessageObject() == c10 || n4Var.getMessageObject().getId() == c10.getId())) {
                    break;
                }
                i10++;
            }
        }
        return null;
    }

    public final boolean e(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject c10;
        if (u1Var == null || u1Var.getMessageObject() == null || (c10 = c(null)) == null) {
            return false;
        }
        return u1Var.getMessageObject() == c10 || u1Var.getMessageObject().getId() == c10.getId();
    }

    public final void f(float f7, int i10) {
        boolean z10 = this.c0.v;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        ah.v vVar = this.c;
        org.telegram.ui.y8 y8Var = this.b;
        if (z10) {
            vVar.setTranslationY(0.0f);
            y8Var.invalidateOutline();
            y8Var.setTranslationY(0.0f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(0.0f);
        } else {
            vVar.setTranslationY(i10);
            y8Var.invalidateOutline();
            y8Var.setTranslationY(f7);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((f7 + y8Var.getMeasuredHeight()) - AndroidUtilities.dp(2.0f));
        }
        float x10 = y8Var.getX();
        org.telegram.ui.Cells.z9 z9Var = this.d;
        z9Var.setTranslationX(x10);
        z9Var.setTranslationY(y8Var.getY());
    }

    public final void g() {
        oc0 oc0Var = this.c0;
        new xc(oc0Var, oc0Var.F).M(LocaleController.getString(R.string.QuoteMaxError), LocaleController.getString(R.string.QuoteMaxErrorMessage), R.raw.error).j();
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
        if (zb0Var2 != null) {
            zb0Var2.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(zb0Var2, (Property<zb0, Float>) property, !z10 ? 1.0f : 0.0f));
        }
        if (zb0Var != null) {
            zb0Var.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(zb0Var, (Property<zb0, Float>) property, z10 ? 1.0f : 0.0f));
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
        this.P.addListener(new org.telegram.ui.fo(16, this, z10));
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
                int b10 = org.telegram.messenger.g0.b(4.0f, measuredHeight, 0);
                this.R = b10;
                this.R = Math.min(((bc0Var.getMeasuredHeight() - this.R) + b10) - ((int) ((((AndroidUtilities.displaySize.y - (Build.VERSION.SDK_INT >= 35 ? AndroidUtilities.navigationBarHeight : 0)) * 0.8f) - this.W) - AndroidUtilities.dp(8.0f))), this.R);
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
        ValueAnimator valueAnimator = oc0Var.h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        oc0Var.h = ofFloat;
        ofFloat.addUpdateListener(new zj(this, i10, f7, 1));
        oc0Var.h.setDuration(250L);
        oc0Var.h.setInterpolator(li.m.V);
        oc0Var.h.addListener(new c80(this, 4));
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
            org.telegram.ui.Cells.v9 v9Var = ac0Var.W;
            MessageObject c10 = c(v9Var != null ? ((org.telegram.ui.Cells.u1) v9Var).getMessageObject() : null);
            if (messagePreviewParams.quote != null && ac0Var.x()) {
                messagePreviewParams.quoteStart = ac0Var.u;
                messagePreviewParams.quoteEnd = ac0Var.v;
                if (c10 != null) {
                    org.telegram.ui.gn gnVar = messagePreviewParams.quote;
                    if (gnVar.m || (messageObject = gnVar.a) == null || messageObject.getId() != c10.getId()) {
                        messagePreviewParams.quote = org.telegram.ui.gn.c(c10, messagePreviewParams.quoteStart, messagePreviewParams.quoteEnd);
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
        ah.v vVar = this.c;
        int i10 = this.a;
        if (i10 == 1) {
            MessagePreviewParams.Messages messages = messagePreviewParams.forwardMessages;
            vVar.e(LocaleController.formatPluralString("PreviewForwardMessagesCount", messages == null ? 0 : messages.selectedIds.size(), new Object[0]), z10);
            vVar.d(!messagePreviewParams.hasSenders ? messagePreviewParams.willSeeSenders ? user != null ? LocaleController.formatString("ForwardPreviewSendersNameVisible", R.string.ForwardPreviewSendersNameVisible, ContactsController.formatName(user.first_name, user.last_name)) : (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.ForwardPreviewSendersNameVisibleGroup) : LocaleController.getString(R.string.ForwardPreviewSendersNameVisibleChannel) : user != null ? LocaleController.formatString("ForwardPreviewSendersNameVisible", R.string.ForwardPreviewSendersNameVisible, ContactsController.formatName(user.first_name, user.last_name)) : (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.ForwardPreviewSendersNameHiddenGroup) : LocaleController.getString(R.string.ForwardPreviewSendersNameHiddenChannel) : !messagePreviewParams.hideForwardSendersName ? user != null ? LocaleController.formatString("ForwardPreviewSendersNameVisible", R.string.ForwardPreviewSendersNameVisible, ContactsController.formatName(user.first_name, user.last_name)) : (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.ForwardPreviewSendersNameVisibleGroup) : LocaleController.getString(R.string.ForwardPreviewSendersNameVisibleChannel) : user != null ? LocaleController.formatString("ForwardPreviewSendersNameHidden", R.string.ForwardPreviewSendersNameHidden, ContactsController.formatName(user.first_name, user.last_name)) : (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.ForwardPreviewSendersNameHiddenGroup) : LocaleController.getString(R.string.ForwardPreviewSendersNameHiddenChannel), z10);
        } else {
            if (i10 != 0) {
                if (i10 == 2) {
                    vVar.e(LocaleController.getString(R.string.MessageOptionsLinkTitle), z10);
                    vVar.d(LocaleController.getString(R.string.MessageOptionsLinkSubtitle), z10);
                    return;
                }
                return;
            }
            if (messagePreviewParams.quote == null || !messagePreviewParams.replyMessage.hasText) {
                vVar.e(LocaleController.getString(R.string.MessageOptionsReplyTitle), z10);
                vVar.d(messagePreviewParams.replyMessage.hasText ? LocaleController.getString(R.string.MessageOptionsReplySubtitle) : "", z10);
            } else {
                vVar.e(LocaleController.getString(R.string.PreviewQuoteUpdate), z10);
                vVar.d(LocaleController.getString(R.string.PreviewQuoteUpdateSubtitle), z10);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.a == 0) {
            AndroidUtilities.forEachViews((RecyclerView) this.f, (Utilities.Callback<View>) new z2(this, 8));
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
                messageObject.parentWidth = oc0Var.v ? y8Var.getLayoutParams().width : View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(16.0f);
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
