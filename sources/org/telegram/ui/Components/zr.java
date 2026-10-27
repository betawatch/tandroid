package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class zr extends bb {
    public final boolean X;
    public final s80 Y;
    public TLRPC.InputPeer Z;
    public final boolean a0;
    public String b0;
    public String c0;
    public SpannableStringBuilder d0;
    public k71 e0;
    public final boolean f0;
    public yr g0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, org.telegram.ui.ActionBar.k3, org.telegram.ui.Components.bb, org.telegram.ui.Components.zr] */
    /* JADX WARN: Type inference failed for: r0v3, types: [org.telegram.ui.ActionBar.k3] */
    public zr(Context context, int i10, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl, ai.n1 n1Var, di.b bVar) {
        int i11;
        zr bbVar = new bb(context, null, false, false, bVar);
        bbVar.X = true;
        bbVar.v = 0.126f;
        bbVar.Y = null;
        bbVar.a0 = false;
        long peerDialogId = DialogObject.getPeerDialogId(getgroupcallstreamrtmpurl.peer);
        boolean z10 = n1Var != null && (peerDialogId >= 0 || ChatObject.isCreator(MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId))));
        if (n1Var != null) {
            bbVar.f0 = true;
            fi.d dVar = new fi.d(context, bVar, true);
            dVar.i(LocaleController.getString(R.string.LiveStoryRTMPEnable), false, true);
            bbVar.containerView.addView(dVar, kb1.h(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, (z10 ? 52 : 0) + 12));
            dVar.setOnClickListener(new bi.w0(bbVar, n1Var, dVar, 21));
            if (z10) {
                fi.d dVar2 = new fi.d(context, bVar, false);
                dVar2.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.r7, false));
                dVar2.d.x(AndroidUtilities.bold());
                dVar2.i(LocaleController.getString(R.string.LiveStoryRTMPRevoke), false, true);
                bbVar = this;
                dVar2.setOnClickListener(new bi.mb(this, context, bVar, dVar2, getgroupcallstreamrtmpurl, i10));
                bbVar.containerView.addView(dVar2, kb1.h(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 12.0f));
            }
        }
        s4.l lVar = new s4.l();
        lVar.m = false;
        lVar.C = false;
        lVar.o(ds.h);
        lVar.n(350L);
        bbVar.d.setItemAnimator(lVar);
        nm0 nm0Var = bbVar.d;
        int i12 = bbVar.backgroundPaddingLeft;
        if (bbVar.f0) {
            i11 = AndroidUtilities.dp(z10 ? 124.0f : 72.0f);
        } else {
            i11 = 0;
        }
        nm0Var.setPadding(i12, 0, i12, i11);
        bbVar.fixNavigationBar();
        bbVar.N();
        bbVar.b0 = groupcallstreamrtmpurl.url;
        bbVar.c0 = groupcallstreamrtmpurl.key;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(bbVar.c0);
        bbVar.d0 = spannableStringBuilder;
        z11 z11Var = new z11();
        z11Var.a |= 256;
        z11Var.b = 0;
        z11Var.c = spannableStringBuilder.length();
        bbVar.d0.setSpan(new a21(z11Var, 0), 0, bbVar.d0.length(), 0);
        bbVar.e0.O(false);
    }

    public static /* synthetic */ void P(zr zrVar, TLRPC.Peer peer) {
        zrVar.Z = MessagesController.getInstance(zrVar.currentAccount).getInputPeer(MessageObject.getPeerId(peer));
        zrVar.dismiss();
    }

    public static void Q(zr zrVar, fi.d dVar, long j10) {
        if (dVar.Q) {
            return;
        }
        dVar.setLoading(true);
        TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
        getgroupcallstreamrtmpurl.peer = MessagesController.getInstance(zrVar.currentAccount).getInputPeer(j10);
        getgroupcallstreamrtmpurl.revoke = true;
        ConnectionsManager.getInstance(zrVar.currentAccount).sendRequest(getgroupcallstreamrtmpurl, new ur(zrVar, dVar, 0));
    }

    public static void R(zr zrVar, ArrayList arrayList) {
        String str = null;
        if (zrVar.g0 == null) {
            Context context = zrVar.getContext();
            org.telegram.ui.ActionBar.u6 u6Var = zrVar.resourcesProvider;
            yr yrVar = new yr(context);
            yrVar.setOrientation(1);
            bk0 bk0Var = new bk0(context);
            bk0Var.setAutoRepeat(true);
            bk0Var.f(R.raw.utyan_streaming, 112, 112, null);
            bk0Var.d();
            yrVar.addView(bk0Var, kb1.x(112, 112, 49, 0, 24, 0, 0));
            TextView textView = new TextView(context);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(LocaleController.formatString(R.string.Streaming, new Object[0]));
            textView.setTextSize(1, 20.0f);
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.G6, u6Var);
            yrVar.addView(textView, kb1.x(-2, -2, 1, 0, 14, 0, 7));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(1);
            org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.j5, u6Var);
            textView2.setText(LocaleController.formatString(R.string.VoipStreamStart, new Object[0]));
            textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
            yrVar.addView(textView2, kb1.x(-2, -2, 1, 28, 0, 28, 17));
            zrVar.g0 = yrVar;
        }
        arrayList.add(u61.k(zrVar.g0));
        arrayList.add(u61.C(null));
        ic.a.p(R.string.VoipChatStreamSettings, arrayList);
        String str2 = zrVar.b0;
        String string = LocaleController.getString(R.string.VoipChatStreamServerUrl);
        int i10 = xr.a;
        u61 K = u61.K(xr.class);
        K.l = str2;
        K.n = string;
        K.j = false;
        K.g = false;
        arrayList.add(K);
        SpannableStringBuilder spannableStringBuilder = zrVar.d0;
        String string2 = LocaleController.getString(R.string.VoipChatStreamKey);
        u61 K2 = u61.K(xr.class);
        K2.l = spannableStringBuilder;
        K2.n = string2;
        K2.j = true;
        K2.g = false;
        arrayList.add(K2);
        if (zrVar.f0) {
            str = LocaleController.getString(zrVar.X ? R.string.VoipChatStreamWithAnotherAppDescriptionStory : R.string.VoipChatStreamWithAnotherAppDescription);
        }
        arrayList.add(u61.C(str));
    }

    public static void S(zr zrVar, Context context, fi.d dVar, long j10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, zrVar.resourcesProvider);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.LiveStoryRTMPRevokeTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.LiveStoryRTMPRevokeText);
        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new bi.i(zrVar, dVar, j10, 5));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.d(-1);
        alertDialog$Builder.p();
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void dismissInternal() {
        TLRPC.InputPeer inputPeer;
        super.dismissInternal();
        s80 s80Var = this.Y;
        if (s80Var == null || (inputPeer = this.Z) == null) {
            return;
        }
        s80Var.a(inputPeer, this.a0, false, true);
    }

    @Override // org.telegram.ui.Components.bb
    public final mm0 v(nm0 nm0Var) {
        k71 k71Var = new k71(nm0Var, getContext(), this.currentAccount, 0, true, new d(this, 7), this.resourcesProvider);
        this.e0 = k71Var;
        return k71Var;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence y() {
        return LocaleController.getString(R.string.Streaming);
    }

    public zr(org.telegram.ui.ActionBar.r2 r2Var, TLRPC.Peer peer, long j10, boolean z10, s80 s80Var) {
        super(r2Var, false);
        this.X = false;
        this.v = 0.26f;
        this.Y = s80Var;
        this.a0 = z10;
        Context context = this.containerView.getContext();
        boolean isCreator = ChatObject.isCreator(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10)));
        this.f0 = true;
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.VoipChannelStartStreaming));
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.Sh, this.resourcesProvider);
        int dp = AndroidUtilities.dp(8.0f);
        int i10 = org.telegram.ui.ActionBar.y6.Oh;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i10, this.resourcesProvider);
        int i11 = org.telegram.ui.ActionBar.y6.d6;
        int o10 = i0.a.o(org.telegram.ui.ActionBar.y6.x0(null, i11, false), 120);
        org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, w02, o10, o10);
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i10);
        org.telegram.ui.ActionBar.b7 h = org.telegram.ui.ActionBar.f7.h(i11, 120);
        org.telegram.ui.ActionBar.u6 u6Var = this.resourcesProvider;
        textView.setBackground(j02);
        org.telegram.ui.ActionBar.f7.k(textView, j02, N, h, u6Var);
        this.containerView.addView(textView, kb1.h(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, (isCreator ? 52 : 0) + 12));
        textView.setOnClickListener(new ga(8, this, peer));
        if (isCreator) {
            fi.d dVar = new fi.d(context, this.resourcesProvider, false);
            dVar.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.r7, false));
            dVar.d.x(AndroidUtilities.bold());
            dVar.i(LocaleController.getString(R.string.LiveStoryRTMPRevoke), false, true);
            dVar.setOnClickListener(new wr(this, context, dVar, j10, 0));
            this.containerView.addView(dVar, kb1.h(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 12.0f));
        }
        nm0 nm0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        nm0Var.setPadding(i12, 0, i12, AndroidUtilities.dp((isCreator ? 52 : 0) + 72));
        s4.l lVar = new s4.l();
        lVar.m = false;
        lVar.C = false;
        lVar.o(ds.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        fixNavigationBar();
        N();
        TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
        getgroupcallstreamrtmpurl.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j10);
        getgroupcallstreamrtmpurl.revoke = false;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getgroupcallstreamrtmpurl, new b2(this, 2));
    }
}
