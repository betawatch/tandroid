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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class hc0 extends FrameLayout {
    public final mc0 E;
    public final FrameLayout F;
    public final mc0 G;
    public final mc0 H;
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
    public final qb0 c;
    public final /* synthetic */ nc0 c0;
    public final org.telegram.ui.Cells.ea d;
    public final zb0 e;
    public final ac0 f;
    public final cc0 h;
    public final gc0 n;
    public MessagePreviewParams.Messages r;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout s;
    public final yb0 v;
    public final yb0 w;
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
    /* JADX WARN: Type inference failed for: r2v73, types: [android.view.View, org.telegram.ui.ActionBar.g1, org.telegram.ui.Components.yb0] */
    /* JADX WARN: Type inference failed for: r2v74, types: [android.view.View, org.telegram.ui.ActionBar.g1, org.telegram.ui.Components.yb0] */
    /* JADX WARN: Type inference failed for: r32v0, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout, java.lang.Object, org.telegram.ui.Components.hc0] */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.view.View, android.view.ViewGroup, org.telegram.ui.Components.vw0, org.telegram.ui.a9] */
    /* JADX WARN: Type inference failed for: r3v6, types: [ch.b] */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r9v8, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r9v9, types: [android.view.ViewGroup] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public hc0(nc0 nc0Var, Context context, int i10) {
        super(r4);
        MessagePreviewParams messagePreviewParams;
        Context context2;
        hc0 hc0Var;
        boolean z10;
        mc0 mc0Var;
        ViewOutlineProvider viewOutlineProvider;
        hc0 hc0Var2;
        MessagePreviewParams.Messages messages;
        ?? r12;
        MessagePreviewParams messagePreviewParams2;
        boolean z11;
        LinearLayout linearLayout;
        Object obj;
        Context context3 = context;
        this.c0 = nc0Var;
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
        jc0 jc0Var = nc0Var.F;
        boolean z12 = nc0Var.b;
        MessagePreviewParams messagePreviewParams3 = nc0Var.d;
        Drawable l4 = ((org.telegram.ui.sn) jc0Var).l();
        if (((org.telegram.ui.sn) jc0Var).f == null) {
            int i13 = org.telegram.ui.ActionBar.y6.a;
        }
        a9Var.U(l4);
        a9Var.setOccupyStatusBar(false);
        int i14 = 3;
        a9Var.setOutlineProvider(new eh.b(this, i14));
        a9Var.setClipToOutline(true);
        a9Var.setElevation(AndroidUtilities.dp(4.0f));
        qb0 qb0Var = new qb0(context3, jc0Var);
        this.c = qb0Var;
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.s8, qb0Var, jc0Var);
        zb0 zb0Var = new zb0(this);
        this.e = zb0Var;
        zb0Var.D = new di.n2(this, i14);
        ac0 ac0Var = new ac0(this, context3, jc0Var);
        this.f = ac0Var;
        cc0 cc0Var = new cc0(this, ac0Var, jc0Var);
        this.h = cc0Var;
        ac0Var.setItemAnimator(cc0Var);
        ac0Var.setOnScrollListener(new ml(this, 8));
        ac0Var.setOnItemClickListener(new dc0(this));
        gc0 gc0Var = new gc0(this);
        this.n = gc0Var;
        ac0Var.setAdapter(gc0Var);
        ac0Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        vb0 vb0Var = new vb0(this);
        vb0Var.O = new wb0(this);
        ac0Var.setClipToPadding(false);
        ac0Var.setLayoutManager(vb0Var);
        ac0Var.i(new xb0());
        a9Var.addView(ac0Var);
        addView(a9Var, gb1.h(-1, 400.0f, 0, 8.0f, 0.0f, 8.0f, 0.0f));
        a9Var.addView(qb0Var, gb1.g(-2.0f, -1));
        ?? actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert2, 1, getContext(), jc0Var);
        this.s = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().setOnForegroundOpenFinished(new tb0(this, i11));
        eh.d c10 = nc0Var.G.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, false);
        c10.v(gh.c.k(jc0Var));
        c10.w(AndroidUtilities.dp(8.0f));
        c10.x.e = true;
        c10.x(AndroidUtilities.dp(12.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c10);
        addView(actionBarPopupWindow$ActionBarPopupWindowLayout, gb1.g(-2.0f, -2));
        if (i10 != 0 || (messages = messagePreviewParams3.replyMessage) == null) {
            messagePreviewParams = messagePreviewParams3;
            if (i10 != 1 || messagePreviewParams.forwardMessages == null) {
                final hc0 hc0Var3 = this;
                hc0Var = hc0Var3;
                if (i10 == 2) {
                    hc0Var = hc0Var3;
                    if (messagePreviewParams.linkMessage != null) {
                        mc0 mc0Var2 = new mc0(context, R.raw.position_below, LocaleController.getString(R.string.LinkAbove), R.raw.position_above, LocaleController.getString(R.string.LinkBelow), nc0Var.F);
                        hc0Var3.E = mc0Var2;
                        mc0Var2.a(!messagePreviewParams.webpageTop, false);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(mc0Var2, gb1.r(-1, 48));
                        FrameLayout frameLayout = new FrameLayout(context);
                        hc0Var3.F = frameLayout;
                        int i15 = org.telegram.ui.ActionBar.y6.I5;
                        org.telegram.ui.Cells.y Z = org.telegram.ui.ActionBar.y6.Z(org.telegram.ui.ActionBar.y6.w0(i15, jc0Var), 0, 0);
                        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i15);
                        frameLayout.setBackground(Z);
                        org.telegram.ui.ActionBar.f7.k(frameLayout, Z, null, N, jc0Var);
                        mc0 mc0Var3 = new mc0(context, R.raw.media_shrink, LocaleController.getString(R.string.LinkMediaLarger), R.raw.media_enlarge, LocaleController.getString(R.string.LinkMediaSmaller), nc0Var.F);
                        hc0Var3.G = mc0Var3;
                        mc0Var3.setBackground(null);
                        mc0Var3.setVisibility(messagePreviewParams.isVideo ? 4 : 0);
                        frameLayout.addView(mc0Var3, gb1.r(-1, 48));
                        mc0 mc0Var4 = new mc0(context, R.raw.media_shrink, LocaleController.getString(R.string.LinkVideoLarger), R.raw.media_enlarge, LocaleController.getString(R.string.LinkVideoSmaller), nc0Var.F);
                        hc0Var3.H = mc0Var4;
                        mc0Var4.setBackground(null);
                        mc0Var4.setVisibility(!messagePreviewParams.isVideo ? 4 : 0);
                        frameLayout.setAlpha(messagePreviewParams.hasMedia ? 1.0f : 0.5f);
                        frameLayout.addView(mc0Var4, gb1.r(-1, 48));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, gb1.r(-1, 48));
                        frameLayout.setVisibility((!messagePreviewParams.singleLink || messagePreviewParams.hasMedia) ? 0 : 8);
                        mc0Var3.a(messagePreviewParams.webpageSmall, false);
                        mc0Var4.a(messagePreviewParams.webpageSmall, false);
                        org.telegram.ui.ActionBar.l1 l1Var = new org.telegram.ui.ActionBar.l1(context, jc0Var);
                        org.telegram.ui.ActionBar.f7.j(l1Var, org.telegram.ui.ActionBar.f7.L(0.06f, org.telegram.ui.ActionBar.y6.E8), jc0Var);
                        l1Var.setTag(R.id.fit_width_tag, 1);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(l1Var, gb1.r(-1, 8));
                        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(1, context, nc0Var.F, false, false);
                        g1Var.j(LocaleController.getString(R.string.ApplyChanges), R.drawable.msg_select, null);
                        final int i16 = 10;
                        g1Var.setOnClickListener(new View.OnClickListener(hc0Var3) { // from class: org.telegram.ui.Components.rb0
                            public final /* synthetic */ hc0 b;

                            {
                                this.b = hc0Var3;
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
                                        hc0 hc0Var4 = this.b;
                                        hc0Var4.c0.d.quote = null;
                                        hc0Var4.e.f(false);
                                        hc0Var4.h(false, false);
                                        hc0Var4.s.getSwipeBack().b(true);
                                        break;
                                    case 1:
                                        hc0 hc0Var5 = this.b;
                                        zb0 zb0Var2 = hc0Var5.e;
                                        nc0 nc0Var2 = hc0Var5.c0;
                                        if (hc0Var5.c(null) != null) {
                                            if (zb0Var2.v - zb0Var2.u <= MessagesController.getInstance(nc0Var2.w).quoteLengthMax) {
                                                org.telegram.ui.Cells.aa aaVar = zb0Var2.W;
                                                MessageObject c11 = hc0Var5.c(aaVar != null ? ((org.telegram.ui.Cells.s1) aaVar).getMessageObject() : null);
                                                MessagePreviewParams messagePreviewParams4 = nc0Var2.d;
                                                int i18 = zb0Var2.u;
                                                messagePreviewParams4.quoteStart = i18;
                                                int i19 = zb0Var2.v;
                                                messagePreviewParams4.quoteEnd = i19;
                                                messagePreviewParams4.quote = org.telegram.ui.kn.c(c11, i18, i19);
                                                nc0Var2.b();
                                                nc0Var2.a(true);
                                                break;
                                            } else {
                                                hc0Var5.g();
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        hc0 hc0Var6 = this.b;
                                        zb0 zb0Var3 = hc0Var6.e;
                                        nc0 nc0Var3 = hc0Var6.c0;
                                        MessagePreviewParams messagePreviewParams5 = nc0Var3.d;
                                        int i20 = nc0Var3.w;
                                        boolean z13 = nc0Var3.b;
                                        if (messagePreviewParams5.quote != null && !z13) {
                                            messagePreviewParams5.quote = null;
                                            zb0Var3.f(false);
                                            hc0Var6.h(false, true);
                                            hc0Var6.l(true);
                                            break;
                                        } else if (zb0Var3.v - zb0Var3.u <= MessagesController.getInstance(i20).quoteLengthMax) {
                                            MessageObject c12 = hc0Var6.c(null);
                                            if (c12 != null) {
                                                if (!zb0Var3.x()) {
                                                    messagePreviewParams5.quoteStart = 0;
                                                    int min = Math.min(MessagesController.getInstance(i20).quoteLengthMax, org.telegram.ui.kn.d(c12));
                                                    messagePreviewParams5.quoteEnd = min;
                                                    messagePreviewParams5.quote = org.telegram.ui.kn.c(c12, messagePreviewParams5.quoteStart, min);
                                                    View d = hc0Var6.d();
                                                    if (d instanceof org.telegram.ui.Cells.s1) {
                                                        zb0Var3.Z((org.telegram.ui.Cells.s1) d, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                    }
                                                    if (!z13) {
                                                        hc0Var6.s.getSwipeBack().e(hc0Var6.I);
                                                    }
                                                    hc0Var6.h(true, true);
                                                    break;
                                                } else {
                                                    messagePreviewParams5.quoteStart = zb0Var3.u;
                                                    messagePreviewParams5.quoteEnd = zb0Var3.v;
                                                    org.telegram.ui.Cells.aa aaVar2 = zb0Var3.W;
                                                    messagePreviewParams5.quote = org.telegram.ui.kn.c(hc0Var6.c(aaVar2 != null ? ((org.telegram.ui.Cells.s1) aaVar2).getMessageObject() : null), messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                    nc0Var3.b();
                                                    nc0Var3.a(true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            hc0Var6.g();
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
                                        nc0 nc0Var4 = this.b.c0;
                                        if (!nc0Var4.b) {
                                            org.telegram.ui.cl clVar = (org.telegram.ui.cl) nc0Var4;
                                            clVar.a(true);
                                            org.telegram.ui.un unVar = clVar.H;
                                            unVar.z5 = null;
                                            unVar.x5 = null;
                                            unVar.r5.updateReply(null, null, unVar.f6, null);
                                            unVar.q8();
                                            break;
                                        } else {
                                            org.telegram.ui.cl clVar2 = (org.telegram.ui.cl) nc0Var4;
                                            clVar2.a(true);
                                            org.telegram.ui.un unVar2 = clVar2.H;
                                            unVar2.x5 = null;
                                            unVar2.Nb(unVar2.z5);
                                            break;
                                        }
                                    case 7:
                                        this.b.c0.c(true);
                                        break;
                                    case 8:
                                        this.b.c0.a(true);
                                        break;
                                    case 9:
                                        org.telegram.ui.cl clVar3 = (org.telegram.ui.cl) this.b.c0;
                                        clVar3.a(true);
                                        org.telegram.ui.un unVar3 = clVar3.H;
                                        unVar3.r5.updateForward(null, unVar3.f6);
                                        unVar3.q8();
                                        break;
                                    case 10:
                                        this.b.c0.a(true);
                                        break;
                                    case 11:
                                        org.telegram.ui.cl clVar4 = (org.telegram.ui.cl) this.b.c0;
                                        clVar4.a(true);
                                        org.telegram.ui.un unVar4 = clVar4.H;
                                        unVar4.S5 = null;
                                        org.telegram.ui.hk hkVar = unVar4.Y;
                                        if (hkVar != null) {
                                            hkVar.X2 = null;
                                            hkVar.Y2 = false;
                                        }
                                        MessagePreviewParams messagePreviewParams6 = unVar4.r5;
                                        if (messagePreviewParams6 != null) {
                                            i17 = ((org.telegram.ui.ActionBar.r2) unVar4).currentAccount;
                                            MessageObject messageObject = unVar4.z5;
                                            messagePreviewParams6.updateLink(i17, null, null, messageObject == unVar4.j4 ? null : messageObject, unVar4.x5, unVar4.B5);
                                        }
                                        unVar4.q8();
                                        break;
                                    case 12:
                                        hc0 hc0Var7 = this.b;
                                        MessagePreviewParams messagePreviewParams7 = hc0Var7.c0.d;
                                        if (messagePreviewParams7.hasMedia) {
                                            boolean z14 = !messagePreviewParams7.webpageSmall;
                                            messagePreviewParams7.webpageSmall = z14;
                                            hc0Var7.G.a(z14, true);
                                            hc0Var7.H.a(messagePreviewParams7.webpageSmall, true);
                                            if (hc0Var7.r.messages.size() > 0 && (message2 = hc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                                boolean z15 = messagePreviewParams7.webpageSmall;
                                                messageMedia2.force_small_media = z15;
                                                messageMedia2.force_large_media = !z15;
                                            }
                                            if (hc0Var7.r.previewMessages.size() > 0 && (message = hc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                                boolean z16 = messagePreviewParams7.webpageSmall;
                                                messageMedia.force_small_media = z16;
                                                messageMedia.force_large_media = !z16;
                                            }
                                            hc0Var7.i();
                                            hc0Var7.U = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        hc0 hc0Var8 = this.b;
                                        MessagePreviewParams messagePreviewParams8 = hc0Var8.c0.d;
                                        boolean z17 = messagePreviewParams8.webpageTop;
                                        messagePreviewParams8.webpageTop = !z17;
                                        hc0Var8.E.a(z17, true);
                                        if (hc0Var8.r.messages.size() > 0 && (message4 = hc0Var8.r.messages.get(0).messageOwner) != null) {
                                            message4.invert_media = messagePreviewParams8.webpageTop;
                                        }
                                        if (hc0Var8.r.previewMessages.size() > 0 && (message3 = hc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                            message3.invert_media = messagePreviewParams8.webpageTop;
                                        }
                                        hc0Var8.i();
                                        hc0Var8.U = true;
                                        break;
                                }
                            }
                        });
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var, gb1.r(-1, 48));
                        org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(1, context, nc0Var.F, false, true);
                        context2 = context;
                        g1Var2.j(LocaleController.getString(R.string.DoNotLinkPreview), R.drawable.msg_delete, null);
                        int i17 = org.telegram.ui.ActionBar.y6.q7;
                        int i18 = org.telegram.ui.ActionBar.y6.p7;
                        g1Var2.c(i17, i18);
                        final int i19 = 11;
                        g1Var2.setOnClickListener(new View.OnClickListener(hc0Var3) { // from class: org.telegram.ui.Components.rb0
                            public final /* synthetic */ hc0 b;

                            {
                                this.b = hc0Var3;
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
                                        hc0 hc0Var4 = this.b;
                                        hc0Var4.c0.d.quote = null;
                                        hc0Var4.e.f(false);
                                        hc0Var4.h(false, false);
                                        hc0Var4.s.getSwipeBack().b(true);
                                        break;
                                    case 1:
                                        hc0 hc0Var5 = this.b;
                                        zb0 zb0Var2 = hc0Var5.e;
                                        nc0 nc0Var2 = hc0Var5.c0;
                                        if (hc0Var5.c(null) != null) {
                                            if (zb0Var2.v - zb0Var2.u <= MessagesController.getInstance(nc0Var2.w).quoteLengthMax) {
                                                org.telegram.ui.Cells.aa aaVar = zb0Var2.W;
                                                MessageObject c11 = hc0Var5.c(aaVar != null ? ((org.telegram.ui.Cells.s1) aaVar).getMessageObject() : null);
                                                MessagePreviewParams messagePreviewParams4 = nc0Var2.d;
                                                int i182 = zb0Var2.u;
                                                messagePreviewParams4.quoteStart = i182;
                                                int i192 = zb0Var2.v;
                                                messagePreviewParams4.quoteEnd = i192;
                                                messagePreviewParams4.quote = org.telegram.ui.kn.c(c11, i182, i192);
                                                nc0Var2.b();
                                                nc0Var2.a(true);
                                                break;
                                            } else {
                                                hc0Var5.g();
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        hc0 hc0Var6 = this.b;
                                        zb0 zb0Var3 = hc0Var6.e;
                                        nc0 nc0Var3 = hc0Var6.c0;
                                        MessagePreviewParams messagePreviewParams5 = nc0Var3.d;
                                        int i20 = nc0Var3.w;
                                        boolean z13 = nc0Var3.b;
                                        if (messagePreviewParams5.quote != null && !z13) {
                                            messagePreviewParams5.quote = null;
                                            zb0Var3.f(false);
                                            hc0Var6.h(false, true);
                                            hc0Var6.l(true);
                                            break;
                                        } else if (zb0Var3.v - zb0Var3.u <= MessagesController.getInstance(i20).quoteLengthMax) {
                                            MessageObject c12 = hc0Var6.c(null);
                                            if (c12 != null) {
                                                if (!zb0Var3.x()) {
                                                    messagePreviewParams5.quoteStart = 0;
                                                    int min = Math.min(MessagesController.getInstance(i20).quoteLengthMax, org.telegram.ui.kn.d(c12));
                                                    messagePreviewParams5.quoteEnd = min;
                                                    messagePreviewParams5.quote = org.telegram.ui.kn.c(c12, messagePreviewParams5.quoteStart, min);
                                                    View d = hc0Var6.d();
                                                    if (d instanceof org.telegram.ui.Cells.s1) {
                                                        zb0Var3.Z((org.telegram.ui.Cells.s1) d, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                    }
                                                    if (!z13) {
                                                        hc0Var6.s.getSwipeBack().e(hc0Var6.I);
                                                    }
                                                    hc0Var6.h(true, true);
                                                    break;
                                                } else {
                                                    messagePreviewParams5.quoteStart = zb0Var3.u;
                                                    messagePreviewParams5.quoteEnd = zb0Var3.v;
                                                    org.telegram.ui.Cells.aa aaVar2 = zb0Var3.W;
                                                    messagePreviewParams5.quote = org.telegram.ui.kn.c(hc0Var6.c(aaVar2 != null ? ((org.telegram.ui.Cells.s1) aaVar2).getMessageObject() : null), messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                    nc0Var3.b();
                                                    nc0Var3.a(true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            hc0Var6.g();
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
                                        nc0 nc0Var4 = this.b.c0;
                                        if (!nc0Var4.b) {
                                            org.telegram.ui.cl clVar = (org.telegram.ui.cl) nc0Var4;
                                            clVar.a(true);
                                            org.telegram.ui.un unVar = clVar.H;
                                            unVar.z5 = null;
                                            unVar.x5 = null;
                                            unVar.r5.updateReply(null, null, unVar.f6, null);
                                            unVar.q8();
                                            break;
                                        } else {
                                            org.telegram.ui.cl clVar2 = (org.telegram.ui.cl) nc0Var4;
                                            clVar2.a(true);
                                            org.telegram.ui.un unVar2 = clVar2.H;
                                            unVar2.x5 = null;
                                            unVar2.Nb(unVar2.z5);
                                            break;
                                        }
                                    case 7:
                                        this.b.c0.c(true);
                                        break;
                                    case 8:
                                        this.b.c0.a(true);
                                        break;
                                    case 9:
                                        org.telegram.ui.cl clVar3 = (org.telegram.ui.cl) this.b.c0;
                                        clVar3.a(true);
                                        org.telegram.ui.un unVar3 = clVar3.H;
                                        unVar3.r5.updateForward(null, unVar3.f6);
                                        unVar3.q8();
                                        break;
                                    case 10:
                                        this.b.c0.a(true);
                                        break;
                                    case 11:
                                        org.telegram.ui.cl clVar4 = (org.telegram.ui.cl) this.b.c0;
                                        clVar4.a(true);
                                        org.telegram.ui.un unVar4 = clVar4.H;
                                        unVar4.S5 = null;
                                        org.telegram.ui.hk hkVar = unVar4.Y;
                                        if (hkVar != null) {
                                            hkVar.X2 = null;
                                            hkVar.Y2 = false;
                                        }
                                        MessagePreviewParams messagePreviewParams6 = unVar4.r5;
                                        if (messagePreviewParams6 != null) {
                                            i172 = ((org.telegram.ui.ActionBar.r2) unVar4).currentAccount;
                                            MessageObject messageObject = unVar4.z5;
                                            messagePreviewParams6.updateLink(i172, null, null, messageObject == unVar4.j4 ? null : messageObject, unVar4.x5, unVar4.B5);
                                        }
                                        unVar4.q8();
                                        break;
                                    case 12:
                                        hc0 hc0Var7 = this.b;
                                        MessagePreviewParams messagePreviewParams7 = hc0Var7.c0.d;
                                        if (messagePreviewParams7.hasMedia) {
                                            boolean z14 = !messagePreviewParams7.webpageSmall;
                                            messagePreviewParams7.webpageSmall = z14;
                                            hc0Var7.G.a(z14, true);
                                            hc0Var7.H.a(messagePreviewParams7.webpageSmall, true);
                                            if (hc0Var7.r.messages.size() > 0 && (message2 = hc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                                boolean z15 = messagePreviewParams7.webpageSmall;
                                                messageMedia2.force_small_media = z15;
                                                messageMedia2.force_large_media = !z15;
                                            }
                                            if (hc0Var7.r.previewMessages.size() > 0 && (message = hc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                                boolean z16 = messagePreviewParams7.webpageSmall;
                                                messageMedia.force_small_media = z16;
                                                messageMedia.force_large_media = !z16;
                                            }
                                            hc0Var7.i();
                                            hc0Var7.U = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        hc0 hc0Var8 = this.b;
                                        MessagePreviewParams messagePreviewParams8 = hc0Var8.c0.d;
                                        boolean z17 = messagePreviewParams8.webpageTop;
                                        messagePreviewParams8.webpageTop = !z17;
                                        hc0Var8.E.a(z17, true);
                                        if (hc0Var8.r.messages.size() > 0 && (message4 = hc0Var8.r.messages.get(0).messageOwner) != null) {
                                            message4.invert_media = messagePreviewParams8.webpageTop;
                                        }
                                        if (hc0Var8.r.previewMessages.size() > 0 && (message3 = hc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                            message3.invert_media = messagePreviewParams8.webpageTop;
                                        }
                                        hc0Var8.i();
                                        hc0Var8.U = true;
                                        break;
                                }
                            }
                        });
                        g1Var2.h(0.12f, i18);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var2, gb1.r(-1, 48));
                        final int i20 = 12;
                        frameLayout.setOnClickListener(new View.OnClickListener(hc0Var3) { // from class: org.telegram.ui.Components.rb0
                            public final /* synthetic */ hc0 b;

                            {
                                this.b = hc0Var3;
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
                                        hc0 hc0Var4 = this.b;
                                        hc0Var4.c0.d.quote = null;
                                        hc0Var4.e.f(false);
                                        hc0Var4.h(false, false);
                                        hc0Var4.s.getSwipeBack().b(true);
                                        break;
                                    case 1:
                                        hc0 hc0Var5 = this.b;
                                        zb0 zb0Var2 = hc0Var5.e;
                                        nc0 nc0Var2 = hc0Var5.c0;
                                        if (hc0Var5.c(null) != null) {
                                            if (zb0Var2.v - zb0Var2.u <= MessagesController.getInstance(nc0Var2.w).quoteLengthMax) {
                                                org.telegram.ui.Cells.aa aaVar = zb0Var2.W;
                                                MessageObject c11 = hc0Var5.c(aaVar != null ? ((org.telegram.ui.Cells.s1) aaVar).getMessageObject() : null);
                                                MessagePreviewParams messagePreviewParams4 = nc0Var2.d;
                                                int i182 = zb0Var2.u;
                                                messagePreviewParams4.quoteStart = i182;
                                                int i192 = zb0Var2.v;
                                                messagePreviewParams4.quoteEnd = i192;
                                                messagePreviewParams4.quote = org.telegram.ui.kn.c(c11, i182, i192);
                                                nc0Var2.b();
                                                nc0Var2.a(true);
                                                break;
                                            } else {
                                                hc0Var5.g();
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        hc0 hc0Var6 = this.b;
                                        zb0 zb0Var3 = hc0Var6.e;
                                        nc0 nc0Var3 = hc0Var6.c0;
                                        MessagePreviewParams messagePreviewParams5 = nc0Var3.d;
                                        int i202 = nc0Var3.w;
                                        boolean z13 = nc0Var3.b;
                                        if (messagePreviewParams5.quote != null && !z13) {
                                            messagePreviewParams5.quote = null;
                                            zb0Var3.f(false);
                                            hc0Var6.h(false, true);
                                            hc0Var6.l(true);
                                            break;
                                        } else if (zb0Var3.v - zb0Var3.u <= MessagesController.getInstance(i202).quoteLengthMax) {
                                            MessageObject c12 = hc0Var6.c(null);
                                            if (c12 != null) {
                                                if (!zb0Var3.x()) {
                                                    messagePreviewParams5.quoteStart = 0;
                                                    int min = Math.min(MessagesController.getInstance(i202).quoteLengthMax, org.telegram.ui.kn.d(c12));
                                                    messagePreviewParams5.quoteEnd = min;
                                                    messagePreviewParams5.quote = org.telegram.ui.kn.c(c12, messagePreviewParams5.quoteStart, min);
                                                    View d = hc0Var6.d();
                                                    if (d instanceof org.telegram.ui.Cells.s1) {
                                                        zb0Var3.Z((org.telegram.ui.Cells.s1) d, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                    }
                                                    if (!z13) {
                                                        hc0Var6.s.getSwipeBack().e(hc0Var6.I);
                                                    }
                                                    hc0Var6.h(true, true);
                                                    break;
                                                } else {
                                                    messagePreviewParams5.quoteStart = zb0Var3.u;
                                                    messagePreviewParams5.quoteEnd = zb0Var3.v;
                                                    org.telegram.ui.Cells.aa aaVar2 = zb0Var3.W;
                                                    messagePreviewParams5.quote = org.telegram.ui.kn.c(hc0Var6.c(aaVar2 != null ? ((org.telegram.ui.Cells.s1) aaVar2).getMessageObject() : null), messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                    nc0Var3.b();
                                                    nc0Var3.a(true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            hc0Var6.g();
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
                                        nc0 nc0Var4 = this.b.c0;
                                        if (!nc0Var4.b) {
                                            org.telegram.ui.cl clVar = (org.telegram.ui.cl) nc0Var4;
                                            clVar.a(true);
                                            org.telegram.ui.un unVar = clVar.H;
                                            unVar.z5 = null;
                                            unVar.x5 = null;
                                            unVar.r5.updateReply(null, null, unVar.f6, null);
                                            unVar.q8();
                                            break;
                                        } else {
                                            org.telegram.ui.cl clVar2 = (org.telegram.ui.cl) nc0Var4;
                                            clVar2.a(true);
                                            org.telegram.ui.un unVar2 = clVar2.H;
                                            unVar2.x5 = null;
                                            unVar2.Nb(unVar2.z5);
                                            break;
                                        }
                                    case 7:
                                        this.b.c0.c(true);
                                        break;
                                    case 8:
                                        this.b.c0.a(true);
                                        break;
                                    case 9:
                                        org.telegram.ui.cl clVar3 = (org.telegram.ui.cl) this.b.c0;
                                        clVar3.a(true);
                                        org.telegram.ui.un unVar3 = clVar3.H;
                                        unVar3.r5.updateForward(null, unVar3.f6);
                                        unVar3.q8();
                                        break;
                                    case 10:
                                        this.b.c0.a(true);
                                        break;
                                    case 11:
                                        org.telegram.ui.cl clVar4 = (org.telegram.ui.cl) this.b.c0;
                                        clVar4.a(true);
                                        org.telegram.ui.un unVar4 = clVar4.H;
                                        unVar4.S5 = null;
                                        org.telegram.ui.hk hkVar = unVar4.Y;
                                        if (hkVar != null) {
                                            hkVar.X2 = null;
                                            hkVar.Y2 = false;
                                        }
                                        MessagePreviewParams messagePreviewParams6 = unVar4.r5;
                                        if (messagePreviewParams6 != null) {
                                            i172 = ((org.telegram.ui.ActionBar.r2) unVar4).currentAccount;
                                            MessageObject messageObject = unVar4.z5;
                                            messagePreviewParams6.updateLink(i172, null, null, messageObject == unVar4.j4 ? null : messageObject, unVar4.x5, unVar4.B5);
                                        }
                                        unVar4.q8();
                                        break;
                                    case 12:
                                        hc0 hc0Var7 = this.b;
                                        MessagePreviewParams messagePreviewParams7 = hc0Var7.c0.d;
                                        if (messagePreviewParams7.hasMedia) {
                                            boolean z14 = !messagePreviewParams7.webpageSmall;
                                            messagePreviewParams7.webpageSmall = z14;
                                            hc0Var7.G.a(z14, true);
                                            hc0Var7.H.a(messagePreviewParams7.webpageSmall, true);
                                            if (hc0Var7.r.messages.size() > 0 && (message2 = hc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                                boolean z15 = messagePreviewParams7.webpageSmall;
                                                messageMedia2.force_small_media = z15;
                                                messageMedia2.force_large_media = !z15;
                                            }
                                            if (hc0Var7.r.previewMessages.size() > 0 && (message = hc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                                boolean z16 = messagePreviewParams7.webpageSmall;
                                                messageMedia.force_small_media = z16;
                                                messageMedia.force_large_media = !z16;
                                            }
                                            hc0Var7.i();
                                            hc0Var7.U = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        hc0 hc0Var8 = this.b;
                                        MessagePreviewParams messagePreviewParams8 = hc0Var8.c0.d;
                                        boolean z17 = messagePreviewParams8.webpageTop;
                                        messagePreviewParams8.webpageTop = !z17;
                                        hc0Var8.E.a(z17, true);
                                        if (hc0Var8.r.messages.size() > 0 && (message4 = hc0Var8.r.messages.get(0).messageOwner) != null) {
                                            message4.invert_media = messagePreviewParams8.webpageTop;
                                        }
                                        if (hc0Var8.r.previewMessages.size() > 0 && (message3 = hc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                            message3.invert_media = messagePreviewParams8.webpageTop;
                                        }
                                        hc0Var8.i();
                                        hc0Var8.U = true;
                                        break;
                                }
                            }
                        });
                        final int i21 = 13;
                        mc0Var2.setOnClickListener(new View.OnClickListener(hc0Var3) { // from class: org.telegram.ui.Components.rb0
                            public final /* synthetic */ hc0 b;

                            {
                                this.b = hc0Var3;
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
                                        hc0 hc0Var4 = this.b;
                                        hc0Var4.c0.d.quote = null;
                                        hc0Var4.e.f(false);
                                        hc0Var4.h(false, false);
                                        hc0Var4.s.getSwipeBack().b(true);
                                        break;
                                    case 1:
                                        hc0 hc0Var5 = this.b;
                                        zb0 zb0Var2 = hc0Var5.e;
                                        nc0 nc0Var2 = hc0Var5.c0;
                                        if (hc0Var5.c(null) != null) {
                                            if (zb0Var2.v - zb0Var2.u <= MessagesController.getInstance(nc0Var2.w).quoteLengthMax) {
                                                org.telegram.ui.Cells.aa aaVar = zb0Var2.W;
                                                MessageObject c11 = hc0Var5.c(aaVar != null ? ((org.telegram.ui.Cells.s1) aaVar).getMessageObject() : null);
                                                MessagePreviewParams messagePreviewParams4 = nc0Var2.d;
                                                int i182 = zb0Var2.u;
                                                messagePreviewParams4.quoteStart = i182;
                                                int i192 = zb0Var2.v;
                                                messagePreviewParams4.quoteEnd = i192;
                                                messagePreviewParams4.quote = org.telegram.ui.kn.c(c11, i182, i192);
                                                nc0Var2.b();
                                                nc0Var2.a(true);
                                                break;
                                            } else {
                                                hc0Var5.g();
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        hc0 hc0Var6 = this.b;
                                        zb0 zb0Var3 = hc0Var6.e;
                                        nc0 nc0Var3 = hc0Var6.c0;
                                        MessagePreviewParams messagePreviewParams5 = nc0Var3.d;
                                        int i202 = nc0Var3.w;
                                        boolean z13 = nc0Var3.b;
                                        if (messagePreviewParams5.quote != null && !z13) {
                                            messagePreviewParams5.quote = null;
                                            zb0Var3.f(false);
                                            hc0Var6.h(false, true);
                                            hc0Var6.l(true);
                                            break;
                                        } else if (zb0Var3.v - zb0Var3.u <= MessagesController.getInstance(i202).quoteLengthMax) {
                                            MessageObject c12 = hc0Var6.c(null);
                                            if (c12 != null) {
                                                if (!zb0Var3.x()) {
                                                    messagePreviewParams5.quoteStart = 0;
                                                    int min = Math.min(MessagesController.getInstance(i202).quoteLengthMax, org.telegram.ui.kn.d(c12));
                                                    messagePreviewParams5.quoteEnd = min;
                                                    messagePreviewParams5.quote = org.telegram.ui.kn.c(c12, messagePreviewParams5.quoteStart, min);
                                                    View d = hc0Var6.d();
                                                    if (d instanceof org.telegram.ui.Cells.s1) {
                                                        zb0Var3.Z((org.telegram.ui.Cells.s1) d, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                    }
                                                    if (!z13) {
                                                        hc0Var6.s.getSwipeBack().e(hc0Var6.I);
                                                    }
                                                    hc0Var6.h(true, true);
                                                    break;
                                                } else {
                                                    messagePreviewParams5.quoteStart = zb0Var3.u;
                                                    messagePreviewParams5.quoteEnd = zb0Var3.v;
                                                    org.telegram.ui.Cells.aa aaVar2 = zb0Var3.W;
                                                    messagePreviewParams5.quote = org.telegram.ui.kn.c(hc0Var6.c(aaVar2 != null ? ((org.telegram.ui.Cells.s1) aaVar2).getMessageObject() : null), messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                    nc0Var3.b();
                                                    nc0Var3.a(true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            hc0Var6.g();
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
                                        nc0 nc0Var4 = this.b.c0;
                                        if (!nc0Var4.b) {
                                            org.telegram.ui.cl clVar = (org.telegram.ui.cl) nc0Var4;
                                            clVar.a(true);
                                            org.telegram.ui.un unVar = clVar.H;
                                            unVar.z5 = null;
                                            unVar.x5 = null;
                                            unVar.r5.updateReply(null, null, unVar.f6, null);
                                            unVar.q8();
                                            break;
                                        } else {
                                            org.telegram.ui.cl clVar2 = (org.telegram.ui.cl) nc0Var4;
                                            clVar2.a(true);
                                            org.telegram.ui.un unVar2 = clVar2.H;
                                            unVar2.x5 = null;
                                            unVar2.Nb(unVar2.z5);
                                            break;
                                        }
                                    case 7:
                                        this.b.c0.c(true);
                                        break;
                                    case 8:
                                        this.b.c0.a(true);
                                        break;
                                    case 9:
                                        org.telegram.ui.cl clVar3 = (org.telegram.ui.cl) this.b.c0;
                                        clVar3.a(true);
                                        org.telegram.ui.un unVar3 = clVar3.H;
                                        unVar3.r5.updateForward(null, unVar3.f6);
                                        unVar3.q8();
                                        break;
                                    case 10:
                                        this.b.c0.a(true);
                                        break;
                                    case 11:
                                        org.telegram.ui.cl clVar4 = (org.telegram.ui.cl) this.b.c0;
                                        clVar4.a(true);
                                        org.telegram.ui.un unVar4 = clVar4.H;
                                        unVar4.S5 = null;
                                        org.telegram.ui.hk hkVar = unVar4.Y;
                                        if (hkVar != null) {
                                            hkVar.X2 = null;
                                            hkVar.Y2 = false;
                                        }
                                        MessagePreviewParams messagePreviewParams6 = unVar4.r5;
                                        if (messagePreviewParams6 != null) {
                                            i172 = ((org.telegram.ui.ActionBar.r2) unVar4).currentAccount;
                                            MessageObject messageObject = unVar4.z5;
                                            messagePreviewParams6.updateLink(i172, null, null, messageObject == unVar4.j4 ? null : messageObject, unVar4.x5, unVar4.B5);
                                        }
                                        unVar4.q8();
                                        break;
                                    case 12:
                                        hc0 hc0Var7 = this.b;
                                        MessagePreviewParams messagePreviewParams7 = hc0Var7.c0.d;
                                        if (messagePreviewParams7.hasMedia) {
                                            boolean z14 = !messagePreviewParams7.webpageSmall;
                                            messagePreviewParams7.webpageSmall = z14;
                                            hc0Var7.G.a(z14, true);
                                            hc0Var7.H.a(messagePreviewParams7.webpageSmall, true);
                                            if (hc0Var7.r.messages.size() > 0 && (message2 = hc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                                boolean z15 = messagePreviewParams7.webpageSmall;
                                                messageMedia2.force_small_media = z15;
                                                messageMedia2.force_large_media = !z15;
                                            }
                                            if (hc0Var7.r.previewMessages.size() > 0 && (message = hc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                                boolean z16 = messagePreviewParams7.webpageSmall;
                                                messageMedia.force_small_media = z16;
                                                messageMedia.force_large_media = !z16;
                                            }
                                            hc0Var7.i();
                                            hc0Var7.U = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        hc0 hc0Var8 = this.b;
                                        MessagePreviewParams messagePreviewParams8 = hc0Var8.c0.d;
                                        boolean z17 = messagePreviewParams8.webpageTop;
                                        messagePreviewParams8.webpageTop = !z17;
                                        hc0Var8.E.a(z17, true);
                                        if (hc0Var8.r.messages.size() > 0 && (message4 = hc0Var8.r.messages.get(0).messageOwner) != null) {
                                            message4.invert_media = messagePreviewParams8.webpageTop;
                                        }
                                        if (hc0Var8.r.previewMessages.size() > 0 && (message3 = hc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                            message3.invert_media = messagePreviewParams8.webpageTop;
                                        }
                                        hc0Var8.i();
                                        hc0Var8.U = true;
                                        break;
                                }
                            }
                        });
                        hc0Var2 = hc0Var3;
                        viewOutlineProvider = null;
                    }
                }
            } else {
                if (!UserConfig.getInstance(nc0Var.w).isPremium()) {
                    for (int i22 = 0; i22 < messagePreviewParams.forwardMessages.messages.size(); i22++) {
                        if (messagePreviewParams.forwardMessages.messages.get(i22).type == 36) {
                            z10 = false;
                            break;
                        }
                    }
                }
                z10 = true;
                mc0 mc0Var5 = new mc0(context, R.raw.name_hide, LocaleController.getString(messagePreviewParams.multipleUsers ? R.string.ShowSenderNames : R.string.ShowSendersName), R.raw.name_show, LocaleController.getString(messagePreviewParams.multipleUsers ? R.string.HideSenderNames : R.string.HideSendersName), nc0Var.F);
                this.s.a(mc0Var5, gb1.r(-1, 48));
                if (messagePreviewParams.hasCaption) {
                    mc0 mc0Var6 = new mc0(context, R.raw.caption_hide, LocaleController.getString(R.string.ShowCaption), R.raw.caption_show, LocaleController.getString(R.string.HideCaption), nc0Var.F);
                    mc0Var6.a(messagePreviewParams.hideCaption, false);
                    this.s.a(mc0Var6, gb1.r(-1, 48));
                    mc0Var = mc0Var6;
                } else {
                    mc0Var = null;
                }
                org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(0, context, nc0Var.F, true, false);
                final int i23 = 7;
                g1Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.rb0
                    public final /* synthetic */ hc0 b;

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
                                hc0 hc0Var4 = this.b;
                                hc0Var4.c0.d.quote = null;
                                hc0Var4.e.f(false);
                                hc0Var4.h(false, false);
                                hc0Var4.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                hc0 hc0Var5 = this.b;
                                zb0 zb0Var2 = hc0Var5.e;
                                nc0 nc0Var2 = hc0Var5.c0;
                                if (hc0Var5.c(null) != null) {
                                    if (zb0Var2.v - zb0Var2.u <= MessagesController.getInstance(nc0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.aa aaVar = zb0Var2.W;
                                        MessageObject c11 = hc0Var5.c(aaVar != null ? ((org.telegram.ui.Cells.s1) aaVar).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams4 = nc0Var2.d;
                                        int i182 = zb0Var2.u;
                                        messagePreviewParams4.quoteStart = i182;
                                        int i192 = zb0Var2.v;
                                        messagePreviewParams4.quoteEnd = i192;
                                        messagePreviewParams4.quote = org.telegram.ui.kn.c(c11, i182, i192);
                                        nc0Var2.b();
                                        nc0Var2.a(true);
                                        break;
                                    } else {
                                        hc0Var5.g();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                hc0 hc0Var6 = this.b;
                                zb0 zb0Var3 = hc0Var6.e;
                                nc0 nc0Var3 = hc0Var6.c0;
                                MessagePreviewParams messagePreviewParams5 = nc0Var3.d;
                                int i202 = nc0Var3.w;
                                boolean z13 = nc0Var3.b;
                                if (messagePreviewParams5.quote != null && !z13) {
                                    messagePreviewParams5.quote = null;
                                    zb0Var3.f(false);
                                    hc0Var6.h(false, true);
                                    hc0Var6.l(true);
                                    break;
                                } else if (zb0Var3.v - zb0Var3.u <= MessagesController.getInstance(i202).quoteLengthMax) {
                                    MessageObject c12 = hc0Var6.c(null);
                                    if (c12 != null) {
                                        if (!zb0Var3.x()) {
                                            messagePreviewParams5.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i202).quoteLengthMax, org.telegram.ui.kn.d(c12));
                                            messagePreviewParams5.quoteEnd = min;
                                            messagePreviewParams5.quote = org.telegram.ui.kn.c(c12, messagePreviewParams5.quoteStart, min);
                                            View d = hc0Var6.d();
                                            if (d instanceof org.telegram.ui.Cells.s1) {
                                                zb0Var3.Z((org.telegram.ui.Cells.s1) d, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            }
                                            if (!z13) {
                                                hc0Var6.s.getSwipeBack().e(hc0Var6.I);
                                            }
                                            hc0Var6.h(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams5.quoteStart = zb0Var3.u;
                                            messagePreviewParams5.quoteEnd = zb0Var3.v;
                                            org.telegram.ui.Cells.aa aaVar2 = zb0Var3.W;
                                            messagePreviewParams5.quote = org.telegram.ui.kn.c(hc0Var6.c(aaVar2 != null ? ((org.telegram.ui.Cells.s1) aaVar2).getMessageObject() : null), messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            nc0Var3.b();
                                            nc0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    hc0Var6.g();
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
                                nc0 nc0Var4 = this.b.c0;
                                if (!nc0Var4.b) {
                                    org.telegram.ui.cl clVar = (org.telegram.ui.cl) nc0Var4;
                                    clVar.a(true);
                                    org.telegram.ui.un unVar = clVar.H;
                                    unVar.z5 = null;
                                    unVar.x5 = null;
                                    unVar.r5.updateReply(null, null, unVar.f6, null);
                                    unVar.q8();
                                    break;
                                } else {
                                    org.telegram.ui.cl clVar2 = (org.telegram.ui.cl) nc0Var4;
                                    clVar2.a(true);
                                    org.telegram.ui.un unVar2 = clVar2.H;
                                    unVar2.x5 = null;
                                    unVar2.Nb(unVar2.z5);
                                    break;
                                }
                            case 7:
                                this.b.c0.c(true);
                                break;
                            case 8:
                                this.b.c0.a(true);
                                break;
                            case 9:
                                org.telegram.ui.cl clVar3 = (org.telegram.ui.cl) this.b.c0;
                                clVar3.a(true);
                                org.telegram.ui.un unVar3 = clVar3.H;
                                unVar3.r5.updateForward(null, unVar3.f6);
                                unVar3.q8();
                                break;
                            case 10:
                                this.b.c0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.cl clVar4 = (org.telegram.ui.cl) this.b.c0;
                                clVar4.a(true);
                                org.telegram.ui.un unVar4 = clVar4.H;
                                unVar4.S5 = null;
                                org.telegram.ui.hk hkVar = unVar4.Y;
                                if (hkVar != null) {
                                    hkVar.X2 = null;
                                    hkVar.Y2 = false;
                                }
                                MessagePreviewParams messagePreviewParams6 = unVar4.r5;
                                if (messagePreviewParams6 != null) {
                                    i172 = ((org.telegram.ui.ActionBar.r2) unVar4).currentAccount;
                                    MessageObject messageObject = unVar4.z5;
                                    messagePreviewParams6.updateLink(i172, null, null, messageObject == unVar4.j4 ? null : messageObject, unVar4.x5, unVar4.B5);
                                }
                                unVar4.q8();
                                break;
                            case 12:
                                hc0 hc0Var7 = this.b;
                                MessagePreviewParams messagePreviewParams7 = hc0Var7.c0.d;
                                if (messagePreviewParams7.hasMedia) {
                                    boolean z14 = !messagePreviewParams7.webpageSmall;
                                    messagePreviewParams7.webpageSmall = z14;
                                    hc0Var7.G.a(z14, true);
                                    hc0Var7.H.a(messagePreviewParams7.webpageSmall, true);
                                    if (hc0Var7.r.messages.size() > 0 && (message2 = hc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z15 = messagePreviewParams7.webpageSmall;
                                        messageMedia2.force_small_media = z15;
                                        messageMedia2.force_large_media = !z15;
                                    }
                                    if (hc0Var7.r.previewMessages.size() > 0 && (message = hc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z16 = messagePreviewParams7.webpageSmall;
                                        messageMedia.force_small_media = z16;
                                        messageMedia.force_large_media = !z16;
                                    }
                                    hc0Var7.i();
                                    hc0Var7.U = true;
                                    break;
                                }
                                break;
                            default:
                                hc0 hc0Var8 = this.b;
                                MessagePreviewParams messagePreviewParams8 = hc0Var8.c0.d;
                                boolean z17 = messagePreviewParams8.webpageTop;
                                messagePreviewParams8.webpageTop = !z17;
                                hc0Var8.E.a(z17, true);
                                if (hc0Var8.r.messages.size() > 0 && (message4 = hc0Var8.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams8.webpageTop;
                                }
                                if (hc0Var8.r.previewMessages.size() > 0 && (message3 = hc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams8.webpageTop;
                                }
                                hc0Var8.i();
                                hc0Var8.U = true;
                                break;
                        }
                    }
                });
                g1Var3.j(LocaleController.getString(R.string.ChangeRecipient), R.drawable.msg_forward_replace, null);
                this.s.a(g1Var3, gb1.r(-1, 48));
                org.telegram.ui.ActionBar.l1 l1Var2 = new org.telegram.ui.ActionBar.l1(context, jc0Var);
                org.telegram.ui.ActionBar.f7.j(l1Var2, org.telegram.ui.ActionBar.f7.L(0.06f, org.telegram.ui.ActionBar.y6.E8), jc0Var);
                l1Var2.setTag(R.id.fit_width_tag, 1);
                this.s.a(l1Var2, gb1.r(-1, 8));
                org.telegram.ui.ActionBar.g1 g1Var4 = new org.telegram.ui.ActionBar.g1(1, context, nc0Var.F, false, false);
                g1Var4.j(LocaleController.getString(R.string.ApplyChanges), R.drawable.msg_select, null);
                final int i24 = 8;
                g1Var4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.rb0
                    public final /* synthetic */ hc0 b;

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
                                hc0 hc0Var4 = this.b;
                                hc0Var4.c0.d.quote = null;
                                hc0Var4.e.f(false);
                                hc0Var4.h(false, false);
                                hc0Var4.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                hc0 hc0Var5 = this.b;
                                zb0 zb0Var2 = hc0Var5.e;
                                nc0 nc0Var2 = hc0Var5.c0;
                                if (hc0Var5.c(null) != null) {
                                    if (zb0Var2.v - zb0Var2.u <= MessagesController.getInstance(nc0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.aa aaVar = zb0Var2.W;
                                        MessageObject c11 = hc0Var5.c(aaVar != null ? ((org.telegram.ui.Cells.s1) aaVar).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams4 = nc0Var2.d;
                                        int i182 = zb0Var2.u;
                                        messagePreviewParams4.quoteStart = i182;
                                        int i192 = zb0Var2.v;
                                        messagePreviewParams4.quoteEnd = i192;
                                        messagePreviewParams4.quote = org.telegram.ui.kn.c(c11, i182, i192);
                                        nc0Var2.b();
                                        nc0Var2.a(true);
                                        break;
                                    } else {
                                        hc0Var5.g();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                hc0 hc0Var6 = this.b;
                                zb0 zb0Var3 = hc0Var6.e;
                                nc0 nc0Var3 = hc0Var6.c0;
                                MessagePreviewParams messagePreviewParams5 = nc0Var3.d;
                                int i202 = nc0Var3.w;
                                boolean z13 = nc0Var3.b;
                                if (messagePreviewParams5.quote != null && !z13) {
                                    messagePreviewParams5.quote = null;
                                    zb0Var3.f(false);
                                    hc0Var6.h(false, true);
                                    hc0Var6.l(true);
                                    break;
                                } else if (zb0Var3.v - zb0Var3.u <= MessagesController.getInstance(i202).quoteLengthMax) {
                                    MessageObject c12 = hc0Var6.c(null);
                                    if (c12 != null) {
                                        if (!zb0Var3.x()) {
                                            messagePreviewParams5.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i202).quoteLengthMax, org.telegram.ui.kn.d(c12));
                                            messagePreviewParams5.quoteEnd = min;
                                            messagePreviewParams5.quote = org.telegram.ui.kn.c(c12, messagePreviewParams5.quoteStart, min);
                                            View d = hc0Var6.d();
                                            if (d instanceof org.telegram.ui.Cells.s1) {
                                                zb0Var3.Z((org.telegram.ui.Cells.s1) d, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            }
                                            if (!z13) {
                                                hc0Var6.s.getSwipeBack().e(hc0Var6.I);
                                            }
                                            hc0Var6.h(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams5.quoteStart = zb0Var3.u;
                                            messagePreviewParams5.quoteEnd = zb0Var3.v;
                                            org.telegram.ui.Cells.aa aaVar2 = zb0Var3.W;
                                            messagePreviewParams5.quote = org.telegram.ui.kn.c(hc0Var6.c(aaVar2 != null ? ((org.telegram.ui.Cells.s1) aaVar2).getMessageObject() : null), messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            nc0Var3.b();
                                            nc0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    hc0Var6.g();
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
                                nc0 nc0Var4 = this.b.c0;
                                if (!nc0Var4.b) {
                                    org.telegram.ui.cl clVar = (org.telegram.ui.cl) nc0Var4;
                                    clVar.a(true);
                                    org.telegram.ui.un unVar = clVar.H;
                                    unVar.z5 = null;
                                    unVar.x5 = null;
                                    unVar.r5.updateReply(null, null, unVar.f6, null);
                                    unVar.q8();
                                    break;
                                } else {
                                    org.telegram.ui.cl clVar2 = (org.telegram.ui.cl) nc0Var4;
                                    clVar2.a(true);
                                    org.telegram.ui.un unVar2 = clVar2.H;
                                    unVar2.x5 = null;
                                    unVar2.Nb(unVar2.z5);
                                    break;
                                }
                            case 7:
                                this.b.c0.c(true);
                                break;
                            case 8:
                                this.b.c0.a(true);
                                break;
                            case 9:
                                org.telegram.ui.cl clVar3 = (org.telegram.ui.cl) this.b.c0;
                                clVar3.a(true);
                                org.telegram.ui.un unVar3 = clVar3.H;
                                unVar3.r5.updateForward(null, unVar3.f6);
                                unVar3.q8();
                                break;
                            case 10:
                                this.b.c0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.cl clVar4 = (org.telegram.ui.cl) this.b.c0;
                                clVar4.a(true);
                                org.telegram.ui.un unVar4 = clVar4.H;
                                unVar4.S5 = null;
                                org.telegram.ui.hk hkVar = unVar4.Y;
                                if (hkVar != null) {
                                    hkVar.X2 = null;
                                    hkVar.Y2 = false;
                                }
                                MessagePreviewParams messagePreviewParams6 = unVar4.r5;
                                if (messagePreviewParams6 != null) {
                                    i172 = ((org.telegram.ui.ActionBar.r2) unVar4).currentAccount;
                                    MessageObject messageObject = unVar4.z5;
                                    messagePreviewParams6.updateLink(i172, null, null, messageObject == unVar4.j4 ? null : messageObject, unVar4.x5, unVar4.B5);
                                }
                                unVar4.q8();
                                break;
                            case 12:
                                hc0 hc0Var7 = this.b;
                                MessagePreviewParams messagePreviewParams7 = hc0Var7.c0.d;
                                if (messagePreviewParams7.hasMedia) {
                                    boolean z14 = !messagePreviewParams7.webpageSmall;
                                    messagePreviewParams7.webpageSmall = z14;
                                    hc0Var7.G.a(z14, true);
                                    hc0Var7.H.a(messagePreviewParams7.webpageSmall, true);
                                    if (hc0Var7.r.messages.size() > 0 && (message2 = hc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z15 = messagePreviewParams7.webpageSmall;
                                        messageMedia2.force_small_media = z15;
                                        messageMedia2.force_large_media = !z15;
                                    }
                                    if (hc0Var7.r.previewMessages.size() > 0 && (message = hc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z16 = messagePreviewParams7.webpageSmall;
                                        messageMedia.force_small_media = z16;
                                        messageMedia.force_large_media = !z16;
                                    }
                                    hc0Var7.i();
                                    hc0Var7.U = true;
                                    break;
                                }
                                break;
                            default:
                                hc0 hc0Var8 = this.b;
                                MessagePreviewParams messagePreviewParams8 = hc0Var8.c0.d;
                                boolean z17 = messagePreviewParams8.webpageTop;
                                messagePreviewParams8.webpageTop = !z17;
                                hc0Var8.E.a(z17, true);
                                if (hc0Var8.r.messages.size() > 0 && (message4 = hc0Var8.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams8.webpageTop;
                                }
                                if (hc0Var8.r.previewMessages.size() > 0 && (message3 = hc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams8.webpageTop;
                                }
                                hc0Var8.i();
                                hc0Var8.U = true;
                                break;
                        }
                    }
                });
                this.s.a(g1Var4, gb1.r(-1, 48));
                org.telegram.ui.ActionBar.g1 g1Var5 = new org.telegram.ui.ActionBar.g1(1, context, nc0Var.F, false, true);
                g1Var5.j(LocaleController.getString(R.string.DoNotForward), R.drawable.msg_delete, null);
                int i25 = org.telegram.ui.ActionBar.y6.q7;
                int i26 = org.telegram.ui.ActionBar.y6.p7;
                g1Var5.c(i25, i26);
                final int i27 = 9;
                g1Var5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.rb0
                    public final /* synthetic */ hc0 b;

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
                                hc0 hc0Var4 = this.b;
                                hc0Var4.c0.d.quote = null;
                                hc0Var4.e.f(false);
                                hc0Var4.h(false, false);
                                hc0Var4.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                hc0 hc0Var5 = this.b;
                                zb0 zb0Var2 = hc0Var5.e;
                                nc0 nc0Var2 = hc0Var5.c0;
                                if (hc0Var5.c(null) != null) {
                                    if (zb0Var2.v - zb0Var2.u <= MessagesController.getInstance(nc0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.aa aaVar = zb0Var2.W;
                                        MessageObject c11 = hc0Var5.c(aaVar != null ? ((org.telegram.ui.Cells.s1) aaVar).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams4 = nc0Var2.d;
                                        int i182 = zb0Var2.u;
                                        messagePreviewParams4.quoteStart = i182;
                                        int i192 = zb0Var2.v;
                                        messagePreviewParams4.quoteEnd = i192;
                                        messagePreviewParams4.quote = org.telegram.ui.kn.c(c11, i182, i192);
                                        nc0Var2.b();
                                        nc0Var2.a(true);
                                        break;
                                    } else {
                                        hc0Var5.g();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                hc0 hc0Var6 = this.b;
                                zb0 zb0Var3 = hc0Var6.e;
                                nc0 nc0Var3 = hc0Var6.c0;
                                MessagePreviewParams messagePreviewParams5 = nc0Var3.d;
                                int i202 = nc0Var3.w;
                                boolean z13 = nc0Var3.b;
                                if (messagePreviewParams5.quote != null && !z13) {
                                    messagePreviewParams5.quote = null;
                                    zb0Var3.f(false);
                                    hc0Var6.h(false, true);
                                    hc0Var6.l(true);
                                    break;
                                } else if (zb0Var3.v - zb0Var3.u <= MessagesController.getInstance(i202).quoteLengthMax) {
                                    MessageObject c12 = hc0Var6.c(null);
                                    if (c12 != null) {
                                        if (!zb0Var3.x()) {
                                            messagePreviewParams5.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i202).quoteLengthMax, org.telegram.ui.kn.d(c12));
                                            messagePreviewParams5.quoteEnd = min;
                                            messagePreviewParams5.quote = org.telegram.ui.kn.c(c12, messagePreviewParams5.quoteStart, min);
                                            View d = hc0Var6.d();
                                            if (d instanceof org.telegram.ui.Cells.s1) {
                                                zb0Var3.Z((org.telegram.ui.Cells.s1) d, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            }
                                            if (!z13) {
                                                hc0Var6.s.getSwipeBack().e(hc0Var6.I);
                                            }
                                            hc0Var6.h(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams5.quoteStart = zb0Var3.u;
                                            messagePreviewParams5.quoteEnd = zb0Var3.v;
                                            org.telegram.ui.Cells.aa aaVar2 = zb0Var3.W;
                                            messagePreviewParams5.quote = org.telegram.ui.kn.c(hc0Var6.c(aaVar2 != null ? ((org.telegram.ui.Cells.s1) aaVar2).getMessageObject() : null), messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            nc0Var3.b();
                                            nc0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    hc0Var6.g();
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
                                nc0 nc0Var4 = this.b.c0;
                                if (!nc0Var4.b) {
                                    org.telegram.ui.cl clVar = (org.telegram.ui.cl) nc0Var4;
                                    clVar.a(true);
                                    org.telegram.ui.un unVar = clVar.H;
                                    unVar.z5 = null;
                                    unVar.x5 = null;
                                    unVar.r5.updateReply(null, null, unVar.f6, null);
                                    unVar.q8();
                                    break;
                                } else {
                                    org.telegram.ui.cl clVar2 = (org.telegram.ui.cl) nc0Var4;
                                    clVar2.a(true);
                                    org.telegram.ui.un unVar2 = clVar2.H;
                                    unVar2.x5 = null;
                                    unVar2.Nb(unVar2.z5);
                                    break;
                                }
                            case 7:
                                this.b.c0.c(true);
                                break;
                            case 8:
                                this.b.c0.a(true);
                                break;
                            case 9:
                                org.telegram.ui.cl clVar3 = (org.telegram.ui.cl) this.b.c0;
                                clVar3.a(true);
                                org.telegram.ui.un unVar3 = clVar3.H;
                                unVar3.r5.updateForward(null, unVar3.f6);
                                unVar3.q8();
                                break;
                            case 10:
                                this.b.c0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.cl clVar4 = (org.telegram.ui.cl) this.b.c0;
                                clVar4.a(true);
                                org.telegram.ui.un unVar4 = clVar4.H;
                                unVar4.S5 = null;
                                org.telegram.ui.hk hkVar = unVar4.Y;
                                if (hkVar != null) {
                                    hkVar.X2 = null;
                                    hkVar.Y2 = false;
                                }
                                MessagePreviewParams messagePreviewParams6 = unVar4.r5;
                                if (messagePreviewParams6 != null) {
                                    i172 = ((org.telegram.ui.ActionBar.r2) unVar4).currentAccount;
                                    MessageObject messageObject = unVar4.z5;
                                    messagePreviewParams6.updateLink(i172, null, null, messageObject == unVar4.j4 ? null : messageObject, unVar4.x5, unVar4.B5);
                                }
                                unVar4.q8();
                                break;
                            case 12:
                                hc0 hc0Var7 = this.b;
                                MessagePreviewParams messagePreviewParams7 = hc0Var7.c0.d;
                                if (messagePreviewParams7.hasMedia) {
                                    boolean z14 = !messagePreviewParams7.webpageSmall;
                                    messagePreviewParams7.webpageSmall = z14;
                                    hc0Var7.G.a(z14, true);
                                    hc0Var7.H.a(messagePreviewParams7.webpageSmall, true);
                                    if (hc0Var7.r.messages.size() > 0 && (message2 = hc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z15 = messagePreviewParams7.webpageSmall;
                                        messageMedia2.force_small_media = z15;
                                        messageMedia2.force_large_media = !z15;
                                    }
                                    if (hc0Var7.r.previewMessages.size() > 0 && (message = hc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z16 = messagePreviewParams7.webpageSmall;
                                        messageMedia.force_small_media = z16;
                                        messageMedia.force_large_media = !z16;
                                    }
                                    hc0Var7.i();
                                    hc0Var7.U = true;
                                    break;
                                }
                                break;
                            default:
                                hc0 hc0Var8 = this.b;
                                MessagePreviewParams messagePreviewParams8 = hc0Var8.c0.d;
                                boolean z17 = messagePreviewParams8.webpageTop;
                                messagePreviewParams8.webpageTop = !z17;
                                hc0Var8.E.a(z17, true);
                                if (hc0Var8.r.messages.size() > 0 && (message4 = hc0Var8.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams8.webpageTop;
                                }
                                if (hc0Var8.r.previewMessages.size() > 0 && (message3 = hc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams8.webpageTop;
                                }
                                hc0Var8.i();
                                hc0Var8.U = true;
                                break;
                        }
                    }
                });
                g1Var5.h(0.12f, i26);
                this.s.a(g1Var5, gb1.r(-1, 48));
                mc0Var5.a(messagePreviewParams.hideForwardSendersName, false);
                mc0 mc0Var7 = mc0Var;
                hc0 hc0Var4 = this;
                mc0Var5.setOnClickListener(new ub0(this, z10, context, mc0Var7, mc0Var5, 0));
                hc0Var = hc0Var4;
                if (mc0Var7 != null) {
                    mc0Var7.setOnClickListener(new bi.w0(hc0Var4, mc0Var7, mc0Var5, 27));
                    hc0Var = hc0Var4;
                }
            }
            context2 = context;
            hc0Var2 = hc0Var;
            viewOutlineProvider = null;
        } else {
            if (!messages.hasText || messagePreviewParams3.isSecret) {
                r12 = 0;
                messagePreviewParams = messagePreviewParams3;
            } else {
                LinearLayout d = org.telegram.messenger.vh.d(context3, 1);
                if (z12) {
                    messagePreviewParams2 = messagePreviewParams3;
                    z11 = true;
                    linearLayout = d;
                    obj = null;
                } else {
                    messagePreviewParams2 = messagePreviewParams3;
                    ?? r92 = d;
                    obj = null;
                    org.telegram.ui.ActionBar.g1 g1Var6 = new org.telegram.ui.ActionBar.g1(0, context3, nc0Var.F, true, false);
                    g1Var6.j(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                    g1Var6.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.rb0
                        public final /* synthetic */ hc0 b;

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
                                    hc0 hc0Var42 = this.b;
                                    hc0Var42.c0.d.quote = null;
                                    hc0Var42.e.f(false);
                                    hc0Var42.h(false, false);
                                    hc0Var42.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    hc0 hc0Var5 = this.b;
                                    zb0 zb0Var2 = hc0Var5.e;
                                    nc0 nc0Var2 = hc0Var5.c0;
                                    if (hc0Var5.c(null) != null) {
                                        if (zb0Var2.v - zb0Var2.u <= MessagesController.getInstance(nc0Var2.w).quoteLengthMax) {
                                            org.telegram.ui.Cells.aa aaVar = zb0Var2.W;
                                            MessageObject c11 = hc0Var5.c(aaVar != null ? ((org.telegram.ui.Cells.s1) aaVar).getMessageObject() : null);
                                            MessagePreviewParams messagePreviewParams4 = nc0Var2.d;
                                            int i182 = zb0Var2.u;
                                            messagePreviewParams4.quoteStart = i182;
                                            int i192 = zb0Var2.v;
                                            messagePreviewParams4.quoteEnd = i192;
                                            messagePreviewParams4.quote = org.telegram.ui.kn.c(c11, i182, i192);
                                            nc0Var2.b();
                                            nc0Var2.a(true);
                                            break;
                                        } else {
                                            hc0Var5.g();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    hc0 hc0Var6 = this.b;
                                    zb0 zb0Var3 = hc0Var6.e;
                                    nc0 nc0Var3 = hc0Var6.c0;
                                    MessagePreviewParams messagePreviewParams5 = nc0Var3.d;
                                    int i202 = nc0Var3.w;
                                    boolean z13 = nc0Var3.b;
                                    if (messagePreviewParams5.quote != null && !z13) {
                                        messagePreviewParams5.quote = null;
                                        zb0Var3.f(false);
                                        hc0Var6.h(false, true);
                                        hc0Var6.l(true);
                                        break;
                                    } else if (zb0Var3.v - zb0Var3.u <= MessagesController.getInstance(i202).quoteLengthMax) {
                                        MessageObject c12 = hc0Var6.c(null);
                                        if (c12 != null) {
                                            if (!zb0Var3.x()) {
                                                messagePreviewParams5.quoteStart = 0;
                                                int min = Math.min(MessagesController.getInstance(i202).quoteLengthMax, org.telegram.ui.kn.d(c12));
                                                messagePreviewParams5.quoteEnd = min;
                                                messagePreviewParams5.quote = org.telegram.ui.kn.c(c12, messagePreviewParams5.quoteStart, min);
                                                View d10 = hc0Var6.d();
                                                if (d10 instanceof org.telegram.ui.Cells.s1) {
                                                    zb0Var3.Z((org.telegram.ui.Cells.s1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                }
                                                if (!z13) {
                                                    hc0Var6.s.getSwipeBack().e(hc0Var6.I);
                                                }
                                                hc0Var6.h(true, true);
                                                break;
                                            } else {
                                                messagePreviewParams5.quoteStart = zb0Var3.u;
                                                messagePreviewParams5.quoteEnd = zb0Var3.v;
                                                org.telegram.ui.Cells.aa aaVar2 = zb0Var3.W;
                                                messagePreviewParams5.quote = org.telegram.ui.kn.c(hc0Var6.c(aaVar2 != null ? ((org.telegram.ui.Cells.s1) aaVar2).getMessageObject() : null), messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                nc0Var3.b();
                                                nc0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        hc0Var6.g();
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
                                    nc0 nc0Var4 = this.b.c0;
                                    if (!nc0Var4.b) {
                                        org.telegram.ui.cl clVar = (org.telegram.ui.cl) nc0Var4;
                                        clVar.a(true);
                                        org.telegram.ui.un unVar = clVar.H;
                                        unVar.z5 = null;
                                        unVar.x5 = null;
                                        unVar.r5.updateReply(null, null, unVar.f6, null);
                                        unVar.q8();
                                        break;
                                    } else {
                                        org.telegram.ui.cl clVar2 = (org.telegram.ui.cl) nc0Var4;
                                        clVar2.a(true);
                                        org.telegram.ui.un unVar2 = clVar2.H;
                                        unVar2.x5 = null;
                                        unVar2.Nb(unVar2.z5);
                                        break;
                                    }
                                case 7:
                                    this.b.c0.c(true);
                                    break;
                                case 8:
                                    this.b.c0.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.cl clVar3 = (org.telegram.ui.cl) this.b.c0;
                                    clVar3.a(true);
                                    org.telegram.ui.un unVar3 = clVar3.H;
                                    unVar3.r5.updateForward(null, unVar3.f6);
                                    unVar3.q8();
                                    break;
                                case 10:
                                    this.b.c0.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.cl clVar4 = (org.telegram.ui.cl) this.b.c0;
                                    clVar4.a(true);
                                    org.telegram.ui.un unVar4 = clVar4.H;
                                    unVar4.S5 = null;
                                    org.telegram.ui.hk hkVar = unVar4.Y;
                                    if (hkVar != null) {
                                        hkVar.X2 = null;
                                        hkVar.Y2 = false;
                                    }
                                    MessagePreviewParams messagePreviewParams6 = unVar4.r5;
                                    if (messagePreviewParams6 != null) {
                                        i172 = ((org.telegram.ui.ActionBar.r2) unVar4).currentAccount;
                                        MessageObject messageObject = unVar4.z5;
                                        messagePreviewParams6.updateLink(i172, null, null, messageObject == unVar4.j4 ? null : messageObject, unVar4.x5, unVar4.B5);
                                    }
                                    unVar4.q8();
                                    break;
                                case 12:
                                    hc0 hc0Var7 = this.b;
                                    MessagePreviewParams messagePreviewParams7 = hc0Var7.c0.d;
                                    if (messagePreviewParams7.hasMedia) {
                                        boolean z14 = !messagePreviewParams7.webpageSmall;
                                        messagePreviewParams7.webpageSmall = z14;
                                        hc0Var7.G.a(z14, true);
                                        hc0Var7.H.a(messagePreviewParams7.webpageSmall, true);
                                        if (hc0Var7.r.messages.size() > 0 && (message2 = hc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z15 = messagePreviewParams7.webpageSmall;
                                            messageMedia2.force_small_media = z15;
                                            messageMedia2.force_large_media = !z15;
                                        }
                                        if (hc0Var7.r.previewMessages.size() > 0 && (message = hc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                            boolean z16 = messagePreviewParams7.webpageSmall;
                                            messageMedia.force_small_media = z16;
                                            messageMedia.force_large_media = !z16;
                                        }
                                        hc0Var7.i();
                                        hc0Var7.U = true;
                                        break;
                                    }
                                    break;
                                default:
                                    hc0 hc0Var8 = this.b;
                                    MessagePreviewParams messagePreviewParams8 = hc0Var8.c0.d;
                                    boolean z17 = messagePreviewParams8.webpageTop;
                                    messagePreviewParams8.webpageTop = !z17;
                                    hc0Var8.E.a(z17, true);
                                    if (hc0Var8.r.messages.size() > 0 && (message4 = hc0Var8.r.messages.get(0).messageOwner) != null) {
                                        message4.invert_media = messagePreviewParams8.webpageTop;
                                    }
                                    if (hc0Var8.r.previewMessages.size() > 0 && (message3 = hc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                        message3.invert_media = messagePreviewParams8.webpageTop;
                                    }
                                    hc0Var8.i();
                                    hc0Var8.U = true;
                                    break;
                            }
                        }
                    });
                    r92.addView(g1Var6, gb1.r(-1, 48));
                    org.telegram.ui.ActionBar.l1 l1Var3 = new org.telegram.ui.ActionBar.l1(context3, jc0Var);
                    org.telegram.ui.ActionBar.f7.j(l1Var3, org.telegram.ui.ActionBar.f7.L(0.06f, org.telegram.ui.ActionBar.y6.E8), jc0Var);
                    l1Var3.setTag(R.id.fit_width_tag, 1);
                    r92.addView(l1Var3, gb1.r(-1, 8));
                    org.telegram.ui.ActionBar.g1 g1Var7 = new org.telegram.ui.ActionBar.g1(0, context3, nc0Var.F, false, true);
                    g1Var7.j(LocaleController.getString(R.string.QuoteSelectedPart), R.drawable.menu_quote_specific, null);
                    z11 = true;
                    final boolean z13 = true ? 1 : 0;
                    g1Var7.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.rb0
                        public final /* synthetic */ hc0 b;

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
                                    hc0 hc0Var42 = this.b;
                                    hc0Var42.c0.d.quote = null;
                                    hc0Var42.e.f(false);
                                    hc0Var42.h(false, false);
                                    hc0Var42.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    hc0 hc0Var5 = this.b;
                                    zb0 zb0Var2 = hc0Var5.e;
                                    nc0 nc0Var2 = hc0Var5.c0;
                                    if (hc0Var5.c(null) != null) {
                                        if (zb0Var2.v - zb0Var2.u <= MessagesController.getInstance(nc0Var2.w).quoteLengthMax) {
                                            org.telegram.ui.Cells.aa aaVar = zb0Var2.W;
                                            MessageObject c11 = hc0Var5.c(aaVar != null ? ((org.telegram.ui.Cells.s1) aaVar).getMessageObject() : null);
                                            MessagePreviewParams messagePreviewParams4 = nc0Var2.d;
                                            int i182 = zb0Var2.u;
                                            messagePreviewParams4.quoteStart = i182;
                                            int i192 = zb0Var2.v;
                                            messagePreviewParams4.quoteEnd = i192;
                                            messagePreviewParams4.quote = org.telegram.ui.kn.c(c11, i182, i192);
                                            nc0Var2.b();
                                            nc0Var2.a(true);
                                            break;
                                        } else {
                                            hc0Var5.g();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    hc0 hc0Var6 = this.b;
                                    zb0 zb0Var3 = hc0Var6.e;
                                    nc0 nc0Var3 = hc0Var6.c0;
                                    MessagePreviewParams messagePreviewParams5 = nc0Var3.d;
                                    int i202 = nc0Var3.w;
                                    boolean z132 = nc0Var3.b;
                                    if (messagePreviewParams5.quote != null && !z132) {
                                        messagePreviewParams5.quote = null;
                                        zb0Var3.f(false);
                                        hc0Var6.h(false, true);
                                        hc0Var6.l(true);
                                        break;
                                    } else if (zb0Var3.v - zb0Var3.u <= MessagesController.getInstance(i202).quoteLengthMax) {
                                        MessageObject c12 = hc0Var6.c(null);
                                        if (c12 != null) {
                                            if (!zb0Var3.x()) {
                                                messagePreviewParams5.quoteStart = 0;
                                                int min = Math.min(MessagesController.getInstance(i202).quoteLengthMax, org.telegram.ui.kn.d(c12));
                                                messagePreviewParams5.quoteEnd = min;
                                                messagePreviewParams5.quote = org.telegram.ui.kn.c(c12, messagePreviewParams5.quoteStart, min);
                                                View d10 = hc0Var6.d();
                                                if (d10 instanceof org.telegram.ui.Cells.s1) {
                                                    zb0Var3.Z((org.telegram.ui.Cells.s1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                }
                                                if (!z132) {
                                                    hc0Var6.s.getSwipeBack().e(hc0Var6.I);
                                                }
                                                hc0Var6.h(true, true);
                                                break;
                                            } else {
                                                messagePreviewParams5.quoteStart = zb0Var3.u;
                                                messagePreviewParams5.quoteEnd = zb0Var3.v;
                                                org.telegram.ui.Cells.aa aaVar2 = zb0Var3.W;
                                                messagePreviewParams5.quote = org.telegram.ui.kn.c(hc0Var6.c(aaVar2 != null ? ((org.telegram.ui.Cells.s1) aaVar2).getMessageObject() : null), messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                nc0Var3.b();
                                                nc0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        hc0Var6.g();
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
                                    nc0 nc0Var4 = this.b.c0;
                                    if (!nc0Var4.b) {
                                        org.telegram.ui.cl clVar = (org.telegram.ui.cl) nc0Var4;
                                        clVar.a(true);
                                        org.telegram.ui.un unVar = clVar.H;
                                        unVar.z5 = null;
                                        unVar.x5 = null;
                                        unVar.r5.updateReply(null, null, unVar.f6, null);
                                        unVar.q8();
                                        break;
                                    } else {
                                        org.telegram.ui.cl clVar2 = (org.telegram.ui.cl) nc0Var4;
                                        clVar2.a(true);
                                        org.telegram.ui.un unVar2 = clVar2.H;
                                        unVar2.x5 = null;
                                        unVar2.Nb(unVar2.z5);
                                        break;
                                    }
                                case 7:
                                    this.b.c0.c(true);
                                    break;
                                case 8:
                                    this.b.c0.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.cl clVar3 = (org.telegram.ui.cl) this.b.c0;
                                    clVar3.a(true);
                                    org.telegram.ui.un unVar3 = clVar3.H;
                                    unVar3.r5.updateForward(null, unVar3.f6);
                                    unVar3.q8();
                                    break;
                                case 10:
                                    this.b.c0.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.cl clVar4 = (org.telegram.ui.cl) this.b.c0;
                                    clVar4.a(true);
                                    org.telegram.ui.un unVar4 = clVar4.H;
                                    unVar4.S5 = null;
                                    org.telegram.ui.hk hkVar = unVar4.Y;
                                    if (hkVar != null) {
                                        hkVar.X2 = null;
                                        hkVar.Y2 = false;
                                    }
                                    MessagePreviewParams messagePreviewParams6 = unVar4.r5;
                                    if (messagePreviewParams6 != null) {
                                        i172 = ((org.telegram.ui.ActionBar.r2) unVar4).currentAccount;
                                        MessageObject messageObject = unVar4.z5;
                                        messagePreviewParams6.updateLink(i172, null, null, messageObject == unVar4.j4 ? null : messageObject, unVar4.x5, unVar4.B5);
                                    }
                                    unVar4.q8();
                                    break;
                                case 12:
                                    hc0 hc0Var7 = this.b;
                                    MessagePreviewParams messagePreviewParams7 = hc0Var7.c0.d;
                                    if (messagePreviewParams7.hasMedia) {
                                        boolean z14 = !messagePreviewParams7.webpageSmall;
                                        messagePreviewParams7.webpageSmall = z14;
                                        hc0Var7.G.a(z14, true);
                                        hc0Var7.H.a(messagePreviewParams7.webpageSmall, true);
                                        if (hc0Var7.r.messages.size() > 0 && (message2 = hc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z15 = messagePreviewParams7.webpageSmall;
                                            messageMedia2.force_small_media = z15;
                                            messageMedia2.force_large_media = !z15;
                                        }
                                        if (hc0Var7.r.previewMessages.size() > 0 && (message = hc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                            boolean z16 = messagePreviewParams7.webpageSmall;
                                            messageMedia.force_small_media = z16;
                                            messageMedia.force_large_media = !z16;
                                        }
                                        hc0Var7.i();
                                        hc0Var7.U = true;
                                        break;
                                    }
                                    break;
                                default:
                                    hc0 hc0Var8 = this.b;
                                    MessagePreviewParams messagePreviewParams8 = hc0Var8.c0.d;
                                    boolean z17 = messagePreviewParams8.webpageTop;
                                    messagePreviewParams8.webpageTop = !z17;
                                    hc0Var8.E.a(z17, true);
                                    if (hc0Var8.r.messages.size() > 0 && (message4 = hc0Var8.r.messages.get(0).messageOwner) != null) {
                                        message4.invert_media = messagePreviewParams8.webpageTop;
                                    }
                                    if (hc0Var8.r.previewMessages.size() > 0 && (message3 = hc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                        message3.invert_media = messagePreviewParams8.webpageTop;
                                    }
                                    hc0Var8.i();
                                    hc0Var8.U = true;
                                    break;
                            }
                        }
                    });
                    r92.addView(g1Var7, gb1.r(-1, 48));
                    linearLayout = r92;
                }
                this.I = actionBarPopupWindow$ActionBarPopupWindowLayout.b(linearLayout);
                actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().setStickToRight(z11);
                ?? frameLayout2 = new FrameLayout(context3);
                messagePreviewParams = messagePreviewParams2;
                ?? r122 = obj;
                ?? yb0Var = new yb0(1, 0, context, nc0Var.F, true, false);
                this.v = yb0Var;
                yb0Var.j(LocaleController.getString(z12 ? R.string.QuoteSelectedPart : R.string.SelectSpecificQuote), R.drawable.menu_select_quote, r122);
                ?? yb0Var2 = new yb0(1, 1, context, nc0Var.F, true, false);
                context3 = context;
                this.w = yb0Var2;
                yb0Var2.j(LocaleController.getString(R.string.ClearQuote), R.drawable.menu_quote_delete, r122);
                int i28 = org.telegram.ui.ActionBar.y6.I5;
                org.telegram.ui.Cells.y Z2 = org.telegram.ui.ActionBar.y6.Z(org.telegram.ui.ActionBar.y6.w0(i28, jc0Var), 6, 0);
                org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i28);
                frameLayout2.setBackground(Z2);
                org.telegram.ui.ActionBar.f7.k(frameLayout2, Z2, r122, N2, jc0Var);
                final int i29 = 2;
                frameLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.rb0
                    public final /* synthetic */ hc0 b;

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
                                hc0 hc0Var42 = this.b;
                                hc0Var42.c0.d.quote = null;
                                hc0Var42.e.f(false);
                                hc0Var42.h(false, false);
                                hc0Var42.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                hc0 hc0Var5 = this.b;
                                zb0 zb0Var2 = hc0Var5.e;
                                nc0 nc0Var2 = hc0Var5.c0;
                                if (hc0Var5.c(null) != null) {
                                    if (zb0Var2.v - zb0Var2.u <= MessagesController.getInstance(nc0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.aa aaVar = zb0Var2.W;
                                        MessageObject c11 = hc0Var5.c(aaVar != null ? ((org.telegram.ui.Cells.s1) aaVar).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams4 = nc0Var2.d;
                                        int i182 = zb0Var2.u;
                                        messagePreviewParams4.quoteStart = i182;
                                        int i192 = zb0Var2.v;
                                        messagePreviewParams4.quoteEnd = i192;
                                        messagePreviewParams4.quote = org.telegram.ui.kn.c(c11, i182, i192);
                                        nc0Var2.b();
                                        nc0Var2.a(true);
                                        break;
                                    } else {
                                        hc0Var5.g();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                hc0 hc0Var6 = this.b;
                                zb0 zb0Var3 = hc0Var6.e;
                                nc0 nc0Var3 = hc0Var6.c0;
                                MessagePreviewParams messagePreviewParams5 = nc0Var3.d;
                                int i202 = nc0Var3.w;
                                boolean z132 = nc0Var3.b;
                                if (messagePreviewParams5.quote != null && !z132) {
                                    messagePreviewParams5.quote = null;
                                    zb0Var3.f(false);
                                    hc0Var6.h(false, true);
                                    hc0Var6.l(true);
                                    break;
                                } else if (zb0Var3.v - zb0Var3.u <= MessagesController.getInstance(i202).quoteLengthMax) {
                                    MessageObject c12 = hc0Var6.c(null);
                                    if (c12 != null) {
                                        if (!zb0Var3.x()) {
                                            messagePreviewParams5.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i202).quoteLengthMax, org.telegram.ui.kn.d(c12));
                                            messagePreviewParams5.quoteEnd = min;
                                            messagePreviewParams5.quote = org.telegram.ui.kn.c(c12, messagePreviewParams5.quoteStart, min);
                                            View d10 = hc0Var6.d();
                                            if (d10 instanceof org.telegram.ui.Cells.s1) {
                                                zb0Var3.Z((org.telegram.ui.Cells.s1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            }
                                            if (!z132) {
                                                hc0Var6.s.getSwipeBack().e(hc0Var6.I);
                                            }
                                            hc0Var6.h(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams5.quoteStart = zb0Var3.u;
                                            messagePreviewParams5.quoteEnd = zb0Var3.v;
                                            org.telegram.ui.Cells.aa aaVar2 = zb0Var3.W;
                                            messagePreviewParams5.quote = org.telegram.ui.kn.c(hc0Var6.c(aaVar2 != null ? ((org.telegram.ui.Cells.s1) aaVar2).getMessageObject() : null), messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            nc0Var3.b();
                                            nc0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    hc0Var6.g();
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
                                nc0 nc0Var4 = this.b.c0;
                                if (!nc0Var4.b) {
                                    org.telegram.ui.cl clVar = (org.telegram.ui.cl) nc0Var4;
                                    clVar.a(true);
                                    org.telegram.ui.un unVar = clVar.H;
                                    unVar.z5 = null;
                                    unVar.x5 = null;
                                    unVar.r5.updateReply(null, null, unVar.f6, null);
                                    unVar.q8();
                                    break;
                                } else {
                                    org.telegram.ui.cl clVar2 = (org.telegram.ui.cl) nc0Var4;
                                    clVar2.a(true);
                                    org.telegram.ui.un unVar2 = clVar2.H;
                                    unVar2.x5 = null;
                                    unVar2.Nb(unVar2.z5);
                                    break;
                                }
                            case 7:
                                this.b.c0.c(true);
                                break;
                            case 8:
                                this.b.c0.a(true);
                                break;
                            case 9:
                                org.telegram.ui.cl clVar3 = (org.telegram.ui.cl) this.b.c0;
                                clVar3.a(true);
                                org.telegram.ui.un unVar3 = clVar3.H;
                                unVar3.r5.updateForward(null, unVar3.f6);
                                unVar3.q8();
                                break;
                            case 10:
                                this.b.c0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.cl clVar4 = (org.telegram.ui.cl) this.b.c0;
                                clVar4.a(true);
                                org.telegram.ui.un unVar4 = clVar4.H;
                                unVar4.S5 = null;
                                org.telegram.ui.hk hkVar = unVar4.Y;
                                if (hkVar != null) {
                                    hkVar.X2 = null;
                                    hkVar.Y2 = false;
                                }
                                MessagePreviewParams messagePreviewParams6 = unVar4.r5;
                                if (messagePreviewParams6 != null) {
                                    i172 = ((org.telegram.ui.ActionBar.r2) unVar4).currentAccount;
                                    MessageObject messageObject = unVar4.z5;
                                    messagePreviewParams6.updateLink(i172, null, null, messageObject == unVar4.j4 ? null : messageObject, unVar4.x5, unVar4.B5);
                                }
                                unVar4.q8();
                                break;
                            case 12:
                                hc0 hc0Var7 = this.b;
                                MessagePreviewParams messagePreviewParams7 = hc0Var7.c0.d;
                                if (messagePreviewParams7.hasMedia) {
                                    boolean z14 = !messagePreviewParams7.webpageSmall;
                                    messagePreviewParams7.webpageSmall = z14;
                                    hc0Var7.G.a(z14, true);
                                    hc0Var7.H.a(messagePreviewParams7.webpageSmall, true);
                                    if (hc0Var7.r.messages.size() > 0 && (message2 = hc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z15 = messagePreviewParams7.webpageSmall;
                                        messageMedia2.force_small_media = z15;
                                        messageMedia2.force_large_media = !z15;
                                    }
                                    if (hc0Var7.r.previewMessages.size() > 0 && (message = hc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z16 = messagePreviewParams7.webpageSmall;
                                        messageMedia.force_small_media = z16;
                                        messageMedia.force_large_media = !z16;
                                    }
                                    hc0Var7.i();
                                    hc0Var7.U = true;
                                    break;
                                }
                                break;
                            default:
                                hc0 hc0Var8 = this.b;
                                MessagePreviewParams messagePreviewParams8 = hc0Var8.c0.d;
                                boolean z17 = messagePreviewParams8.webpageTop;
                                messagePreviewParams8.webpageTop = !z17;
                                hc0Var8.E.a(z17, true);
                                if (hc0Var8.r.messages.size() > 0 && (message4 = hc0Var8.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams8.webpageTop;
                                }
                                if (hc0Var8.r.previewMessages.size() > 0 && (message3 = hc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams8.webpageTop;
                                }
                                hc0Var8.i();
                                hc0Var8.U = true;
                                break;
                        }
                    }
                });
                frameLayout2.addView(yb0Var, gb1.g(48.0f, -1));
                frameLayout2.addView(yb0Var2, gb1.g(48.0f, -1));
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout2, gb1.r(-1, 48));
                r12 = r122;
            }
            if (!messagePreviewParams.monoforum && !messagePreviewParams.noforwards && !messagePreviewParams.hasSecretMessages) {
                ?? frameLayout3 = new FrameLayout(context3);
                ?? g1Var8 = new org.telegram.ui.ActionBar.g1(1, context3, nc0Var.F, false, false);
                this.x = g1Var8;
                g1Var8.j(LocaleController.getString(R.string.ReplyToAnotherChat), R.drawable.msg_forward_replace, r12);
                final int i30 = 3;
                g1Var8.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.rb0
                    public final /* synthetic */ hc0 b;

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
                                hc0 hc0Var42 = this.b;
                                hc0Var42.c0.d.quote = null;
                                hc0Var42.e.f(false);
                                hc0Var42.h(false, false);
                                hc0Var42.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                hc0 hc0Var5 = this.b;
                                zb0 zb0Var2 = hc0Var5.e;
                                nc0 nc0Var2 = hc0Var5.c0;
                                if (hc0Var5.c(null) != null) {
                                    if (zb0Var2.v - zb0Var2.u <= MessagesController.getInstance(nc0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.aa aaVar = zb0Var2.W;
                                        MessageObject c11 = hc0Var5.c(aaVar != null ? ((org.telegram.ui.Cells.s1) aaVar).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams4 = nc0Var2.d;
                                        int i182 = zb0Var2.u;
                                        messagePreviewParams4.quoteStart = i182;
                                        int i192 = zb0Var2.v;
                                        messagePreviewParams4.quoteEnd = i192;
                                        messagePreviewParams4.quote = org.telegram.ui.kn.c(c11, i182, i192);
                                        nc0Var2.b();
                                        nc0Var2.a(true);
                                        break;
                                    } else {
                                        hc0Var5.g();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                hc0 hc0Var6 = this.b;
                                zb0 zb0Var3 = hc0Var6.e;
                                nc0 nc0Var3 = hc0Var6.c0;
                                MessagePreviewParams messagePreviewParams5 = nc0Var3.d;
                                int i202 = nc0Var3.w;
                                boolean z132 = nc0Var3.b;
                                if (messagePreviewParams5.quote != null && !z132) {
                                    messagePreviewParams5.quote = null;
                                    zb0Var3.f(false);
                                    hc0Var6.h(false, true);
                                    hc0Var6.l(true);
                                    break;
                                } else if (zb0Var3.v - zb0Var3.u <= MessagesController.getInstance(i202).quoteLengthMax) {
                                    MessageObject c12 = hc0Var6.c(null);
                                    if (c12 != null) {
                                        if (!zb0Var3.x()) {
                                            messagePreviewParams5.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i202).quoteLengthMax, org.telegram.ui.kn.d(c12));
                                            messagePreviewParams5.quoteEnd = min;
                                            messagePreviewParams5.quote = org.telegram.ui.kn.c(c12, messagePreviewParams5.quoteStart, min);
                                            View d10 = hc0Var6.d();
                                            if (d10 instanceof org.telegram.ui.Cells.s1) {
                                                zb0Var3.Z((org.telegram.ui.Cells.s1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            }
                                            if (!z132) {
                                                hc0Var6.s.getSwipeBack().e(hc0Var6.I);
                                            }
                                            hc0Var6.h(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams5.quoteStart = zb0Var3.u;
                                            messagePreviewParams5.quoteEnd = zb0Var3.v;
                                            org.telegram.ui.Cells.aa aaVar2 = zb0Var3.W;
                                            messagePreviewParams5.quote = org.telegram.ui.kn.c(hc0Var6.c(aaVar2 != null ? ((org.telegram.ui.Cells.s1) aaVar2).getMessageObject() : null), messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            nc0Var3.b();
                                            nc0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    hc0Var6.g();
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
                                nc0 nc0Var4 = this.b.c0;
                                if (!nc0Var4.b) {
                                    org.telegram.ui.cl clVar = (org.telegram.ui.cl) nc0Var4;
                                    clVar.a(true);
                                    org.telegram.ui.un unVar = clVar.H;
                                    unVar.z5 = null;
                                    unVar.x5 = null;
                                    unVar.r5.updateReply(null, null, unVar.f6, null);
                                    unVar.q8();
                                    break;
                                } else {
                                    org.telegram.ui.cl clVar2 = (org.telegram.ui.cl) nc0Var4;
                                    clVar2.a(true);
                                    org.telegram.ui.un unVar2 = clVar2.H;
                                    unVar2.x5 = null;
                                    unVar2.Nb(unVar2.z5);
                                    break;
                                }
                            case 7:
                                this.b.c0.c(true);
                                break;
                            case 8:
                                this.b.c0.a(true);
                                break;
                            case 9:
                                org.telegram.ui.cl clVar3 = (org.telegram.ui.cl) this.b.c0;
                                clVar3.a(true);
                                org.telegram.ui.un unVar3 = clVar3.H;
                                unVar3.r5.updateForward(null, unVar3.f6);
                                unVar3.q8();
                                break;
                            case 10:
                                this.b.c0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.cl clVar4 = (org.telegram.ui.cl) this.b.c0;
                                clVar4.a(true);
                                org.telegram.ui.un unVar4 = clVar4.H;
                                unVar4.S5 = null;
                                org.telegram.ui.hk hkVar = unVar4.Y;
                                if (hkVar != null) {
                                    hkVar.X2 = null;
                                    hkVar.Y2 = false;
                                }
                                MessagePreviewParams messagePreviewParams6 = unVar4.r5;
                                if (messagePreviewParams6 != null) {
                                    i172 = ((org.telegram.ui.ActionBar.r2) unVar4).currentAccount;
                                    MessageObject messageObject = unVar4.z5;
                                    messagePreviewParams6.updateLink(i172, null, null, messageObject == unVar4.j4 ? null : messageObject, unVar4.x5, unVar4.B5);
                                }
                                unVar4.q8();
                                break;
                            case 12:
                                hc0 hc0Var7 = this.b;
                                MessagePreviewParams messagePreviewParams7 = hc0Var7.c0.d;
                                if (messagePreviewParams7.hasMedia) {
                                    boolean z14 = !messagePreviewParams7.webpageSmall;
                                    messagePreviewParams7.webpageSmall = z14;
                                    hc0Var7.G.a(z14, true);
                                    hc0Var7.H.a(messagePreviewParams7.webpageSmall, true);
                                    if (hc0Var7.r.messages.size() > 0 && (message2 = hc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z15 = messagePreviewParams7.webpageSmall;
                                        messageMedia2.force_small_media = z15;
                                        messageMedia2.force_large_media = !z15;
                                    }
                                    if (hc0Var7.r.previewMessages.size() > 0 && (message = hc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z16 = messagePreviewParams7.webpageSmall;
                                        messageMedia.force_small_media = z16;
                                        messageMedia.force_large_media = !z16;
                                    }
                                    hc0Var7.i();
                                    hc0Var7.U = true;
                                    break;
                                }
                                break;
                            default:
                                hc0 hc0Var8 = this.b;
                                MessagePreviewParams messagePreviewParams8 = hc0Var8.c0.d;
                                boolean z17 = messagePreviewParams8.webpageTop;
                                messagePreviewParams8.webpageTop = !z17;
                                hc0Var8.E.a(z17, true);
                                if (hc0Var8.r.messages.size() > 0 && (message4 = hc0Var8.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams8.webpageTop;
                                }
                                if (hc0Var8.r.previewMessages.size() > 0 && (message3 = hc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams8.webpageTop;
                                }
                                hc0Var8.i();
                                hc0Var8.U = true;
                                break;
                        }
                    }
                });
                context3 = context;
                ?? g1Var9 = new org.telegram.ui.ActionBar.g1(1, context3, nc0Var.F, false, false);
                this.y = g1Var9;
                g1Var9.j(LocaleController.getString(R.string.QuoteToAnotherChat), R.drawable.msg_forward_replace, r12);
                final int i31 = 4;
                g1Var9.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.rb0
                    public final /* synthetic */ hc0 b;

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
                                hc0 hc0Var42 = this.b;
                                hc0Var42.c0.d.quote = null;
                                hc0Var42.e.f(false);
                                hc0Var42.h(false, false);
                                hc0Var42.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                hc0 hc0Var5 = this.b;
                                zb0 zb0Var2 = hc0Var5.e;
                                nc0 nc0Var2 = hc0Var5.c0;
                                if (hc0Var5.c(null) != null) {
                                    if (zb0Var2.v - zb0Var2.u <= MessagesController.getInstance(nc0Var2.w).quoteLengthMax) {
                                        org.telegram.ui.Cells.aa aaVar = zb0Var2.W;
                                        MessageObject c11 = hc0Var5.c(aaVar != null ? ((org.telegram.ui.Cells.s1) aaVar).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams4 = nc0Var2.d;
                                        int i182 = zb0Var2.u;
                                        messagePreviewParams4.quoteStart = i182;
                                        int i192 = zb0Var2.v;
                                        messagePreviewParams4.quoteEnd = i192;
                                        messagePreviewParams4.quote = org.telegram.ui.kn.c(c11, i182, i192);
                                        nc0Var2.b();
                                        nc0Var2.a(true);
                                        break;
                                    } else {
                                        hc0Var5.g();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                hc0 hc0Var6 = this.b;
                                zb0 zb0Var3 = hc0Var6.e;
                                nc0 nc0Var3 = hc0Var6.c0;
                                MessagePreviewParams messagePreviewParams5 = nc0Var3.d;
                                int i202 = nc0Var3.w;
                                boolean z132 = nc0Var3.b;
                                if (messagePreviewParams5.quote != null && !z132) {
                                    messagePreviewParams5.quote = null;
                                    zb0Var3.f(false);
                                    hc0Var6.h(false, true);
                                    hc0Var6.l(true);
                                    break;
                                } else if (zb0Var3.v - zb0Var3.u <= MessagesController.getInstance(i202).quoteLengthMax) {
                                    MessageObject c12 = hc0Var6.c(null);
                                    if (c12 != null) {
                                        if (!zb0Var3.x()) {
                                            messagePreviewParams5.quoteStart = 0;
                                            int min = Math.min(MessagesController.getInstance(i202).quoteLengthMax, org.telegram.ui.kn.d(c12));
                                            messagePreviewParams5.quoteEnd = min;
                                            messagePreviewParams5.quote = org.telegram.ui.kn.c(c12, messagePreviewParams5.quoteStart, min);
                                            View d10 = hc0Var6.d();
                                            if (d10 instanceof org.telegram.ui.Cells.s1) {
                                                zb0Var3.Z((org.telegram.ui.Cells.s1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            }
                                            if (!z132) {
                                                hc0Var6.s.getSwipeBack().e(hc0Var6.I);
                                            }
                                            hc0Var6.h(true, true);
                                            break;
                                        } else {
                                            messagePreviewParams5.quoteStart = zb0Var3.u;
                                            messagePreviewParams5.quoteEnd = zb0Var3.v;
                                            org.telegram.ui.Cells.aa aaVar2 = zb0Var3.W;
                                            messagePreviewParams5.quote = org.telegram.ui.kn.c(hc0Var6.c(aaVar2 != null ? ((org.telegram.ui.Cells.s1) aaVar2).getMessageObject() : null), messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            nc0Var3.b();
                                            nc0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    hc0Var6.g();
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
                                nc0 nc0Var4 = this.b.c0;
                                if (!nc0Var4.b) {
                                    org.telegram.ui.cl clVar = (org.telegram.ui.cl) nc0Var4;
                                    clVar.a(true);
                                    org.telegram.ui.un unVar = clVar.H;
                                    unVar.z5 = null;
                                    unVar.x5 = null;
                                    unVar.r5.updateReply(null, null, unVar.f6, null);
                                    unVar.q8();
                                    break;
                                } else {
                                    org.telegram.ui.cl clVar2 = (org.telegram.ui.cl) nc0Var4;
                                    clVar2.a(true);
                                    org.telegram.ui.un unVar2 = clVar2.H;
                                    unVar2.x5 = null;
                                    unVar2.Nb(unVar2.z5);
                                    break;
                                }
                            case 7:
                                this.b.c0.c(true);
                                break;
                            case 8:
                                this.b.c0.a(true);
                                break;
                            case 9:
                                org.telegram.ui.cl clVar3 = (org.telegram.ui.cl) this.b.c0;
                                clVar3.a(true);
                                org.telegram.ui.un unVar3 = clVar3.H;
                                unVar3.r5.updateForward(null, unVar3.f6);
                                unVar3.q8();
                                break;
                            case 10:
                                this.b.c0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.cl clVar4 = (org.telegram.ui.cl) this.b.c0;
                                clVar4.a(true);
                                org.telegram.ui.un unVar4 = clVar4.H;
                                unVar4.S5 = null;
                                org.telegram.ui.hk hkVar = unVar4.Y;
                                if (hkVar != null) {
                                    hkVar.X2 = null;
                                    hkVar.Y2 = false;
                                }
                                MessagePreviewParams messagePreviewParams6 = unVar4.r5;
                                if (messagePreviewParams6 != null) {
                                    i172 = ((org.telegram.ui.ActionBar.r2) unVar4).currentAccount;
                                    MessageObject messageObject = unVar4.z5;
                                    messagePreviewParams6.updateLink(i172, null, null, messageObject == unVar4.j4 ? null : messageObject, unVar4.x5, unVar4.B5);
                                }
                                unVar4.q8();
                                break;
                            case 12:
                                hc0 hc0Var7 = this.b;
                                MessagePreviewParams messagePreviewParams7 = hc0Var7.c0.d;
                                if (messagePreviewParams7.hasMedia) {
                                    boolean z14 = !messagePreviewParams7.webpageSmall;
                                    messagePreviewParams7.webpageSmall = z14;
                                    hc0Var7.G.a(z14, true);
                                    hc0Var7.H.a(messagePreviewParams7.webpageSmall, true);
                                    if (hc0Var7.r.messages.size() > 0 && (message2 = hc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z15 = messagePreviewParams7.webpageSmall;
                                        messageMedia2.force_small_media = z15;
                                        messageMedia2.force_large_media = !z15;
                                    }
                                    if (hc0Var7.r.previewMessages.size() > 0 && (message = hc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z16 = messagePreviewParams7.webpageSmall;
                                        messageMedia.force_small_media = z16;
                                        messageMedia.force_large_media = !z16;
                                    }
                                    hc0Var7.i();
                                    hc0Var7.U = true;
                                    break;
                                }
                                break;
                            default:
                                hc0 hc0Var8 = this.b;
                                MessagePreviewParams messagePreviewParams8 = hc0Var8.c0.d;
                                boolean z17 = messagePreviewParams8.webpageTop;
                                messagePreviewParams8.webpageTop = !z17;
                                hc0Var8.E.a(z17, true);
                                if (hc0Var8.r.messages.size() > 0 && (message4 = hc0Var8.r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams8.webpageTop;
                                }
                                if (hc0Var8.r.previewMessages.size() > 0 && (message3 = hc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams8.webpageTop;
                                }
                                hc0Var8.i();
                                hc0Var8.U = true;
                                break;
                        }
                    }
                });
                frameLayout3.addView(g1Var9, gb1.g(48.0f, -1));
                frameLayout3.addView(g1Var8, gb1.g(48.0f, -1));
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout3, gb1.r(-1, 48));
            }
            if (!messagePreviewParams.noforwards && !messagePreviewParams.hasSecretMessages) {
                org.telegram.ui.ActionBar.l1 l1Var4 = new org.telegram.ui.ActionBar.l1(context3, jc0Var);
                org.telegram.ui.ActionBar.f7.j(l1Var4, org.telegram.ui.ActionBar.f7.L(0.06f, org.telegram.ui.ActionBar.y6.E8), jc0Var);
                l1Var4.setTag(R.id.fit_width_tag, 1);
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(l1Var4, gb1.r(-1, 8));
            }
            h(messagePreviewParams.quote != null, false);
            ?? g1Var10 = new org.telegram.ui.ActionBar.g1(1, context3, nc0Var.F, false, false);
            g1Var10.j(LocaleController.getString(R.string.ApplyChanges), R.drawable.msg_select, r12);
            final int i32 = 5;
            g1Var10.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.rb0
                public final /* synthetic */ hc0 b;

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
                            hc0 hc0Var42 = this.b;
                            hc0Var42.c0.d.quote = null;
                            hc0Var42.e.f(false);
                            hc0Var42.h(false, false);
                            hc0Var42.s.getSwipeBack().b(true);
                            break;
                        case 1:
                            hc0 hc0Var5 = this.b;
                            zb0 zb0Var2 = hc0Var5.e;
                            nc0 nc0Var2 = hc0Var5.c0;
                            if (hc0Var5.c(null) != null) {
                                if (zb0Var2.v - zb0Var2.u <= MessagesController.getInstance(nc0Var2.w).quoteLengthMax) {
                                    org.telegram.ui.Cells.aa aaVar = zb0Var2.W;
                                    MessageObject c11 = hc0Var5.c(aaVar != null ? ((org.telegram.ui.Cells.s1) aaVar).getMessageObject() : null);
                                    MessagePreviewParams messagePreviewParams4 = nc0Var2.d;
                                    int i182 = zb0Var2.u;
                                    messagePreviewParams4.quoteStart = i182;
                                    int i192 = zb0Var2.v;
                                    messagePreviewParams4.quoteEnd = i192;
                                    messagePreviewParams4.quote = org.telegram.ui.kn.c(c11, i182, i192);
                                    nc0Var2.b();
                                    nc0Var2.a(true);
                                    break;
                                } else {
                                    hc0Var5.g();
                                    break;
                                }
                            }
                            break;
                        case 2:
                            hc0 hc0Var6 = this.b;
                            zb0 zb0Var3 = hc0Var6.e;
                            nc0 nc0Var3 = hc0Var6.c0;
                            MessagePreviewParams messagePreviewParams5 = nc0Var3.d;
                            int i202 = nc0Var3.w;
                            boolean z132 = nc0Var3.b;
                            if (messagePreviewParams5.quote != null && !z132) {
                                messagePreviewParams5.quote = null;
                                zb0Var3.f(false);
                                hc0Var6.h(false, true);
                                hc0Var6.l(true);
                                break;
                            } else if (zb0Var3.v - zb0Var3.u <= MessagesController.getInstance(i202).quoteLengthMax) {
                                MessageObject c12 = hc0Var6.c(null);
                                if (c12 != null) {
                                    if (!zb0Var3.x()) {
                                        messagePreviewParams5.quoteStart = 0;
                                        int min = Math.min(MessagesController.getInstance(i202).quoteLengthMax, org.telegram.ui.kn.d(c12));
                                        messagePreviewParams5.quoteEnd = min;
                                        messagePreviewParams5.quote = org.telegram.ui.kn.c(c12, messagePreviewParams5.quoteStart, min);
                                        View d10 = hc0Var6.d();
                                        if (d10 instanceof org.telegram.ui.Cells.s1) {
                                            zb0Var3.Z((org.telegram.ui.Cells.s1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                        }
                                        if (!z132) {
                                            hc0Var6.s.getSwipeBack().e(hc0Var6.I);
                                        }
                                        hc0Var6.h(true, true);
                                        break;
                                    } else {
                                        messagePreviewParams5.quoteStart = zb0Var3.u;
                                        messagePreviewParams5.quoteEnd = zb0Var3.v;
                                        org.telegram.ui.Cells.aa aaVar2 = zb0Var3.W;
                                        messagePreviewParams5.quote = org.telegram.ui.kn.c(hc0Var6.c(aaVar2 != null ? ((org.telegram.ui.Cells.s1) aaVar2).getMessageObject() : null), messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                        nc0Var3.b();
                                        nc0Var3.a(true);
                                        break;
                                    }
                                }
                            } else {
                                hc0Var6.g();
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
                            nc0 nc0Var4 = this.b.c0;
                            if (!nc0Var4.b) {
                                org.telegram.ui.cl clVar = (org.telegram.ui.cl) nc0Var4;
                                clVar.a(true);
                                org.telegram.ui.un unVar = clVar.H;
                                unVar.z5 = null;
                                unVar.x5 = null;
                                unVar.r5.updateReply(null, null, unVar.f6, null);
                                unVar.q8();
                                break;
                            } else {
                                org.telegram.ui.cl clVar2 = (org.telegram.ui.cl) nc0Var4;
                                clVar2.a(true);
                                org.telegram.ui.un unVar2 = clVar2.H;
                                unVar2.x5 = null;
                                unVar2.Nb(unVar2.z5);
                                break;
                            }
                        case 7:
                            this.b.c0.c(true);
                            break;
                        case 8:
                            this.b.c0.a(true);
                            break;
                        case 9:
                            org.telegram.ui.cl clVar3 = (org.telegram.ui.cl) this.b.c0;
                            clVar3.a(true);
                            org.telegram.ui.un unVar3 = clVar3.H;
                            unVar3.r5.updateForward(null, unVar3.f6);
                            unVar3.q8();
                            break;
                        case 10:
                            this.b.c0.a(true);
                            break;
                        case 11:
                            org.telegram.ui.cl clVar4 = (org.telegram.ui.cl) this.b.c0;
                            clVar4.a(true);
                            org.telegram.ui.un unVar4 = clVar4.H;
                            unVar4.S5 = null;
                            org.telegram.ui.hk hkVar = unVar4.Y;
                            if (hkVar != null) {
                                hkVar.X2 = null;
                                hkVar.Y2 = false;
                            }
                            MessagePreviewParams messagePreviewParams6 = unVar4.r5;
                            if (messagePreviewParams6 != null) {
                                i172 = ((org.telegram.ui.ActionBar.r2) unVar4).currentAccount;
                                MessageObject messageObject = unVar4.z5;
                                messagePreviewParams6.updateLink(i172, null, null, messageObject == unVar4.j4 ? null : messageObject, unVar4.x5, unVar4.B5);
                            }
                            unVar4.q8();
                            break;
                        case 12:
                            hc0 hc0Var7 = this.b;
                            MessagePreviewParams messagePreviewParams7 = hc0Var7.c0.d;
                            if (messagePreviewParams7.hasMedia) {
                                boolean z14 = !messagePreviewParams7.webpageSmall;
                                messagePreviewParams7.webpageSmall = z14;
                                hc0Var7.G.a(z14, true);
                                hc0Var7.H.a(messagePreviewParams7.webpageSmall, true);
                                if (hc0Var7.r.messages.size() > 0 && (message2 = hc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                    boolean z15 = messagePreviewParams7.webpageSmall;
                                    messageMedia2.force_small_media = z15;
                                    messageMedia2.force_large_media = !z15;
                                }
                                if (hc0Var7.r.previewMessages.size() > 0 && (message = hc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                    boolean z16 = messagePreviewParams7.webpageSmall;
                                    messageMedia.force_small_media = z16;
                                    messageMedia.force_large_media = !z16;
                                }
                                hc0Var7.i();
                                hc0Var7.U = true;
                                break;
                            }
                            break;
                        default:
                            hc0 hc0Var8 = this.b;
                            MessagePreviewParams messagePreviewParams8 = hc0Var8.c0.d;
                            boolean z17 = messagePreviewParams8.webpageTop;
                            messagePreviewParams8.webpageTop = !z17;
                            hc0Var8.E.a(z17, true);
                            if (hc0Var8.r.messages.size() > 0 && (message4 = hc0Var8.r.messages.get(0).messageOwner) != null) {
                                message4.invert_media = messagePreviewParams8.webpageTop;
                            }
                            if (hc0Var8.r.previewMessages.size() > 0 && (message3 = hc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                message3.invert_media = messagePreviewParams8.webpageTop;
                            }
                            hc0Var8.i();
                            hc0Var8.U = true;
                            break;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var10, gb1.r(-1, 48));
            ?? g1Var11 = new org.telegram.ui.ActionBar.g1(1, context, nc0Var.F, false, true);
            g1Var11.j(LocaleController.getString(z12 ? R.string.DoNotQuote : R.string.DoNotReply), R.drawable.msg_delete, r12);
            int i33 = org.telegram.ui.ActionBar.y6.q7;
            int i34 = org.telegram.ui.ActionBar.y6.p7;
            g1Var11.c(i33, i34);
            g1Var11.h(0.12f, i34);
            final int i35 = 6;
            g1Var11.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.rb0
                public final /* synthetic */ hc0 b;

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
                            hc0 hc0Var42 = this.b;
                            hc0Var42.c0.d.quote = null;
                            hc0Var42.e.f(false);
                            hc0Var42.h(false, false);
                            hc0Var42.s.getSwipeBack().b(true);
                            break;
                        case 1:
                            hc0 hc0Var5 = this.b;
                            zb0 zb0Var2 = hc0Var5.e;
                            nc0 nc0Var2 = hc0Var5.c0;
                            if (hc0Var5.c(null) != null) {
                                if (zb0Var2.v - zb0Var2.u <= MessagesController.getInstance(nc0Var2.w).quoteLengthMax) {
                                    org.telegram.ui.Cells.aa aaVar = zb0Var2.W;
                                    MessageObject c11 = hc0Var5.c(aaVar != null ? ((org.telegram.ui.Cells.s1) aaVar).getMessageObject() : null);
                                    MessagePreviewParams messagePreviewParams4 = nc0Var2.d;
                                    int i182 = zb0Var2.u;
                                    messagePreviewParams4.quoteStart = i182;
                                    int i192 = zb0Var2.v;
                                    messagePreviewParams4.quoteEnd = i192;
                                    messagePreviewParams4.quote = org.telegram.ui.kn.c(c11, i182, i192);
                                    nc0Var2.b();
                                    nc0Var2.a(true);
                                    break;
                                } else {
                                    hc0Var5.g();
                                    break;
                                }
                            }
                            break;
                        case 2:
                            hc0 hc0Var6 = this.b;
                            zb0 zb0Var3 = hc0Var6.e;
                            nc0 nc0Var3 = hc0Var6.c0;
                            MessagePreviewParams messagePreviewParams5 = nc0Var3.d;
                            int i202 = nc0Var3.w;
                            boolean z132 = nc0Var3.b;
                            if (messagePreviewParams5.quote != null && !z132) {
                                messagePreviewParams5.quote = null;
                                zb0Var3.f(false);
                                hc0Var6.h(false, true);
                                hc0Var6.l(true);
                                break;
                            } else if (zb0Var3.v - zb0Var3.u <= MessagesController.getInstance(i202).quoteLengthMax) {
                                MessageObject c12 = hc0Var6.c(null);
                                if (c12 != null) {
                                    if (!zb0Var3.x()) {
                                        messagePreviewParams5.quoteStart = 0;
                                        int min = Math.min(MessagesController.getInstance(i202).quoteLengthMax, org.telegram.ui.kn.d(c12));
                                        messagePreviewParams5.quoteEnd = min;
                                        messagePreviewParams5.quote = org.telegram.ui.kn.c(c12, messagePreviewParams5.quoteStart, min);
                                        View d10 = hc0Var6.d();
                                        if (d10 instanceof org.telegram.ui.Cells.s1) {
                                            zb0Var3.Z((org.telegram.ui.Cells.s1) d10, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                        }
                                        if (!z132) {
                                            hc0Var6.s.getSwipeBack().e(hc0Var6.I);
                                        }
                                        hc0Var6.h(true, true);
                                        break;
                                    } else {
                                        messagePreviewParams5.quoteStart = zb0Var3.u;
                                        messagePreviewParams5.quoteEnd = zb0Var3.v;
                                        org.telegram.ui.Cells.aa aaVar2 = zb0Var3.W;
                                        messagePreviewParams5.quote = org.telegram.ui.kn.c(hc0Var6.c(aaVar2 != null ? ((org.telegram.ui.Cells.s1) aaVar2).getMessageObject() : null), messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                        nc0Var3.b();
                                        nc0Var3.a(true);
                                        break;
                                    }
                                }
                            } else {
                                hc0Var6.g();
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
                            nc0 nc0Var4 = this.b.c0;
                            if (!nc0Var4.b) {
                                org.telegram.ui.cl clVar = (org.telegram.ui.cl) nc0Var4;
                                clVar.a(true);
                                org.telegram.ui.un unVar = clVar.H;
                                unVar.z5 = null;
                                unVar.x5 = null;
                                unVar.r5.updateReply(null, null, unVar.f6, null);
                                unVar.q8();
                                break;
                            } else {
                                org.telegram.ui.cl clVar2 = (org.telegram.ui.cl) nc0Var4;
                                clVar2.a(true);
                                org.telegram.ui.un unVar2 = clVar2.H;
                                unVar2.x5 = null;
                                unVar2.Nb(unVar2.z5);
                                break;
                            }
                        case 7:
                            this.b.c0.c(true);
                            break;
                        case 8:
                            this.b.c0.a(true);
                            break;
                        case 9:
                            org.telegram.ui.cl clVar3 = (org.telegram.ui.cl) this.b.c0;
                            clVar3.a(true);
                            org.telegram.ui.un unVar3 = clVar3.H;
                            unVar3.r5.updateForward(null, unVar3.f6);
                            unVar3.q8();
                            break;
                        case 10:
                            this.b.c0.a(true);
                            break;
                        case 11:
                            org.telegram.ui.cl clVar4 = (org.telegram.ui.cl) this.b.c0;
                            clVar4.a(true);
                            org.telegram.ui.un unVar4 = clVar4.H;
                            unVar4.S5 = null;
                            org.telegram.ui.hk hkVar = unVar4.Y;
                            if (hkVar != null) {
                                hkVar.X2 = null;
                                hkVar.Y2 = false;
                            }
                            MessagePreviewParams messagePreviewParams6 = unVar4.r5;
                            if (messagePreviewParams6 != null) {
                                i172 = ((org.telegram.ui.ActionBar.r2) unVar4).currentAccount;
                                MessageObject messageObject = unVar4.z5;
                                messagePreviewParams6.updateLink(i172, null, null, messageObject == unVar4.j4 ? null : messageObject, unVar4.x5, unVar4.B5);
                            }
                            unVar4.q8();
                            break;
                        case 12:
                            hc0 hc0Var7 = this.b;
                            MessagePreviewParams messagePreviewParams7 = hc0Var7.c0.d;
                            if (messagePreviewParams7.hasMedia) {
                                boolean z14 = !messagePreviewParams7.webpageSmall;
                                messagePreviewParams7.webpageSmall = z14;
                                hc0Var7.G.a(z14, true);
                                hc0Var7.H.a(messagePreviewParams7.webpageSmall, true);
                                if (hc0Var7.r.messages.size() > 0 && (message2 = hc0Var7.r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                    boolean z15 = messagePreviewParams7.webpageSmall;
                                    messageMedia2.force_small_media = z15;
                                    messageMedia2.force_large_media = !z15;
                                }
                                if (hc0Var7.r.previewMessages.size() > 0 && (message = hc0Var7.r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                    boolean z16 = messagePreviewParams7.webpageSmall;
                                    messageMedia.force_small_media = z16;
                                    messageMedia.force_large_media = !z16;
                                }
                                hc0Var7.i();
                                hc0Var7.U = true;
                                break;
                            }
                            break;
                        default:
                            hc0 hc0Var8 = this.b;
                            MessagePreviewParams messagePreviewParams8 = hc0Var8.c0.d;
                            boolean z17 = messagePreviewParams8.webpageTop;
                            messagePreviewParams8.webpageTop = !z17;
                            hc0Var8.E.a(z17, true);
                            if (hc0Var8.r.messages.size() > 0 && (message4 = hc0Var8.r.messages.get(0).messageOwner) != null) {
                                message4.invert_media = messagePreviewParams8.webpageTop;
                            }
                            if (hc0Var8.r.previewMessages.size() > 0 && (message3 = hc0Var8.r.previewMessages.get(0).messageOwner) != null) {
                                message3.invert_media = messagePreviewParams8.webpageTop;
                            }
                            hc0Var8.i();
                            hc0Var8.U = true;
                            break;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var11, gb1.r(-1, 48));
            context2 = context;
            hc0Var2 = this;
            viewOutlineProvider = r12;
        }
        int i36 = hc0Var2.a;
        if (i36 == 1) {
            hc0Var2.r = messagePreviewParams.forwardMessages;
        } else if (i36 == 0) {
            hc0Var2.r = messagePreviewParams.replyMessage;
        } else if (i36 == 2) {
            hc0Var2.r = messagePreviewParams.linkMessage;
        }
        org.telegram.ui.Cells.ea n10 = hc0Var2.e.n(context2);
        hc0Var2.d = n10;
        n10.setElevation(AndroidUtilities.dp(8.0f));
        n10.setOutlineProvider(viewOutlineProvider);
        if (n10.getParent() instanceof ViewGroup) {
            ((ViewGroup) n10.getParent()).removeView(n10);
        }
        hc0Var2.addView(n10, gb1.h(-1, -1.0f, 51, 0.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / AndroidUtilities.density, 0.0f, 0.0f));
        hc0Var2.e.S(hc0Var2.f);
    }

    public static MessageObject.GroupedMessages a(hc0 hc0Var, MessageObject messageObject) {
        if (messageObject.getGroupId() == 0) {
            return null;
        }
        MessageObject.GroupedMessages groupedMessages = hc0Var.r.groupedMessagesMap.get(messageObject.getGroupId());
        if (groupedMessages == null || (groupedMessages.messages.size() > 1 && groupedMessages.getPosition(messageObject) != null)) {
            return groupedMessages;
        }
        return null;
    }

    public static void b(hc0 hc0Var, org.telegram.ui.Cells.s1 s1Var) {
        CharacterStyle characterStyle;
        TLRPC.WebPage webPage;
        if (hc0Var.a == 2) {
            MessagePreviewParams messagePreviewParams = hc0Var.c0.d;
            if (!messagePreviewParams.singleLink && (characterStyle = messagePreviewParams.currentLink) != null && (webPage = messagePreviewParams.webpage) != null && !(webPage instanceof TLRPC.TL_webPagePending)) {
                s1Var.S3(characterStyle);
                return;
            }
        }
        s1Var.S3(null);
    }

    public final MessageObject c(MessageObject messageObject) {
        MessageObject.GroupedMessages valueAt;
        nc0 nc0Var = this.c0;
        MessagePreviewParams.Messages messages = nc0Var.d.replyMessage;
        if (messages == null) {
            return null;
        }
        LongSparseArray<MessageObject.GroupedMessages> longSparseArray = messages.groupedMessagesMap;
        if (longSparseArray == null || longSparseArray.size() <= 0 || (valueAt = nc0Var.d.replyMessage.groupedMessagesMap.valueAt(0)) == null) {
            return nc0Var.d.replyMessage.messages.get(0);
        }
        if (valueAt.isDocuments) {
            if (messageObject != null) {
                return messageObject;
            }
            org.telegram.ui.kn knVar = nc0Var.d.quote;
            if (knVar != null) {
                return knVar.a;
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
                ac0 ac0Var = this.f;
                if (i10 >= ac0Var.getChildCount()) {
                    break;
                }
                View childAt = ac0Var.getChildAt(i10);
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
        qb0 qb0Var = this.c;
        org.telegram.ui.a9 a9Var = this.b;
        if (z10) {
            qb0Var.setTranslationY(0.0f);
            a9Var.invalidateOutline();
            a9Var.setTranslationY(0.0f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(0.0f);
        } else {
            qb0Var.setTranslationY(i10);
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
        nc0 nc0Var = this.c0;
        new wc(nc0Var, nc0Var.F).M(LocaleController.getString(R.string.QuoteMaxError), LocaleController.getString(R.string.QuoteMaxErrorMessage), R.raw.error).j();
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
        yb0 yb0Var = this.w;
        yb0 yb0Var2 = this.v;
        if (!z11) {
            if (yb0Var2 != null) {
                yb0Var2.setAlpha(!z10 ? 1.0f : 0.0f);
                yb0Var2.setVisibility(!z10 ? 0 : 4);
            }
            if (yb0Var != null) {
                yb0Var.setAlpha(z10 ? 1.0f : 0.0f);
                yb0Var.setVisibility(z10 ? 0 : 4);
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
        if (yb0Var2 != null) {
            yb0Var2.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(yb0Var2, (Property<yb0, Float>) property, !z10 ? 1.0f : 0.0f));
        }
        if (yb0Var != null) {
            yb0Var.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(yb0Var, (Property<yb0, Float>) property, z10 ? 1.0f : 0.0f));
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
        this.P.addListener(new org.telegram.ui.jo(16, this, z10));
        this.P.start();
    }

    public final void i() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        nc0 nc0Var = this.c0;
        MessagePreviewParams messagePreviewParams = nc0Var.d;
        cc0 cc0Var = this.h;
        if (cc0Var.k()) {
            this.V = true;
            return;
        }
        for (int i10 = 0; i10 < this.r.previewMessages.size(); i10++) {
            MessageObject messageObject = this.r.previewMessages.get(i10);
            messageObject.forceUpdate = true;
            messageObject.sendAsPeer = nc0Var.a;
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
            cc0Var.V(this.r.groupedMessagesMap.valueAt(i12));
        }
        this.n.q(0, this.r.previewMessages.size());
    }

    public final void j() {
        int i10 = this.R;
        float f7 = this.S;
        nc0 nc0Var = this.c0;
        boolean z10 = nc0Var.v;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        ac0 ac0Var = this.f;
        if (z10) {
            this.S = 0.0f;
            this.R = 0;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(AndroidUtilities.dp(8.0f) + ac0Var.getMeasuredWidth());
        } else {
            int measuredHeight = ac0Var.getMeasuredHeight();
            int i11 = 0;
            for (int i12 = 0; i12 < ac0Var.getChildCount(); i12++) {
                View childAt = ac0Var.getChildAt(i12);
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
                this.R = Math.min(((ac0Var.getMeasuredHeight() - this.R) + c10) - ((int) ((((AndroidUtilities.displaySize.y - (Build.VERSION.SDK_INT >= 35 ? AndroidUtilities.navigationBarHeight : 0)) * 0.8f) - this.W) - AndroidUtilities.dp(8.0f))), this.R);
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
        ValueAnimator valueAnimator = nc0Var.h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        nc0Var.h = ofFloat;
        ofFloat.addUpdateListener(new zj(this, i10, f7, 1));
        nc0Var.h.setDuration(250L);
        nc0Var.h.setInterpolator(mi.m.V);
        nc0Var.h.addListener(new i10(this, 6));
        AndroidUtilities.runOnUIThread(nc0Var.y, 50L);
        this.T = i10;
        f(f7, i10);
    }

    public final void k() {
        MessageObject messageObject;
        nc0 nc0Var = this.c0;
        MessagePreviewParams messagePreviewParams = nc0Var.d;
        if (this.a == 0) {
            zb0 zb0Var = this.e;
            if (zb0Var.v - zb0Var.u > MessagesController.getInstance(nc0Var.w).quoteLengthMax) {
                return;
            }
            org.telegram.ui.Cells.aa aaVar = zb0Var.W;
            MessageObject c10 = c(aaVar != null ? ((org.telegram.ui.Cells.s1) aaVar).getMessageObject() : null);
            if (messagePreviewParams.quote != null && zb0Var.x()) {
                messagePreviewParams.quoteStart = zb0Var.u;
                messagePreviewParams.quoteEnd = zb0Var.v;
                if (c10 != null) {
                    org.telegram.ui.kn knVar = messagePreviewParams.quote;
                    if (knVar.m || (messageObject = knVar.a) == null || messageObject.getId() != c10.getId()) {
                        messagePreviewParams.quote = org.telegram.ui.kn.c(c10, messagePreviewParams.quoteStart, messagePreviewParams.quoteEnd);
                        nc0Var.b();
                    }
                }
            }
            zb0Var.f(false);
        }
    }

    public final void l(boolean z10) {
        nc0 nc0Var = this.c0;
        TLRPC.User user = nc0Var.n;
        MessagePreviewParams messagePreviewParams = nc0Var.d;
        TLRPC.Chat chat = nc0Var.r;
        qb0 qb0Var = this.c;
        int i10 = this.a;
        if (i10 == 1) {
            MessagePreviewParams.Messages messages = messagePreviewParams.forwardMessages;
            qb0Var.b(LocaleController.formatPluralString("PreviewForwardMessagesCount", messages == null ? 0 : messages.selectedIds.size(), new Object[0]), z10);
            qb0Var.a(!messagePreviewParams.hasSenders ? messagePreviewParams.willSeeSenders ? user != null ? LocaleController.formatString("ForwardPreviewSendersNameVisible", R.string.ForwardPreviewSendersNameVisible, ContactsController.formatName(user.first_name, user.last_name)) : (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.ForwardPreviewSendersNameVisibleGroup) : LocaleController.getString(R.string.ForwardPreviewSendersNameVisibleChannel) : user != null ? LocaleController.formatString("ForwardPreviewSendersNameVisible", R.string.ForwardPreviewSendersNameVisible, ContactsController.formatName(user.first_name, user.last_name)) : (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.ForwardPreviewSendersNameHiddenGroup) : LocaleController.getString(R.string.ForwardPreviewSendersNameHiddenChannel) : !messagePreviewParams.hideForwardSendersName ? user != null ? LocaleController.formatString("ForwardPreviewSendersNameVisible", R.string.ForwardPreviewSendersNameVisible, ContactsController.formatName(user.first_name, user.last_name)) : (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.ForwardPreviewSendersNameVisibleGroup) : LocaleController.getString(R.string.ForwardPreviewSendersNameVisibleChannel) : user != null ? LocaleController.formatString("ForwardPreviewSendersNameHidden", R.string.ForwardPreviewSendersNameHidden, ContactsController.formatName(user.first_name, user.last_name)) : (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.ForwardPreviewSendersNameHiddenGroup) : LocaleController.getString(R.string.ForwardPreviewSendersNameHiddenChannel), z10);
        } else {
            if (i10 != 0) {
                if (i10 == 2) {
                    qb0Var.b(LocaleController.getString(R.string.MessageOptionsLinkTitle), z10);
                    qb0Var.a(LocaleController.getString(R.string.MessageOptionsLinkSubtitle), z10);
                    return;
                }
                return;
            }
            if (messagePreviewParams.quote == null || !messagePreviewParams.replyMessage.hasText) {
                qb0Var.b(LocaleController.getString(R.string.MessageOptionsReplyTitle), z10);
                qb0Var.a(messagePreviewParams.replyMessage.hasText ? LocaleController.getString(R.string.MessageOptionsReplySubtitle) : "", z10);
            } else {
                qb0Var.b(LocaleController.getString(R.string.PreviewQuoteUpdate), z10);
                qb0Var.a(LocaleController.getString(R.string.PreviewQuoteUpdateSubtitle), z10);
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
        nc0 nc0Var = this.c0;
        nc0Var.v = z10;
        this.W = 0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(i10, makeMeasureSpec);
        int i12 = this.W;
        int measuredHeight = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
        Rect rect = this.Q;
        this.W = Math.max(i12, measuredHeight + rect.top + rect.bottom);
        ((ViewGroup.MarginLayoutParams) this.f.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        boolean z11 = nc0Var.v;
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
                messageObject.parentWidth = nc0Var.v ? a9Var.getLayoutParams().width : View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(16.0f);
                messageObject.resetLayout();
                messageObject.forceUpdate = true;
                gc0 gc0Var = this.n;
                if (gc0Var != null) {
                    gc0Var.l();
                }
            }
            this.K = true;
        }
        this.a0 = size;
        super.onMeasure(i10, i11);
    }
}
