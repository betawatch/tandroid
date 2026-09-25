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

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class nr extends bb {
    public final boolean X;
    public final f80 Y;
    public TLRPC.InputPeer Z;
    public final boolean a0;
    public String b0;
    public String c0;
    public SpannableStringBuilder d0;
    public j61 e0;
    public final boolean f0;
    public mr g0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, org.telegram.ui.ActionBar.e3, org.telegram.ui.Components.bb, org.telegram.ui.Components.nr] */
    /* JADX WARN: Type inference failed for: r0v3, types: [org.telegram.ui.ActionBar.e3] */
    public nr(Context context, int i10, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl, ai.g3 g3Var, ai.d dVar) {
        int i11;
        nr bbVar = new bb(context, null, false, false, dVar);
        bbVar.X = true;
        bbVar.v = 0.126f;
        bbVar.Y = null;
        bbVar.a0 = false;
        long peerDialogId = DialogObject.getPeerDialogId(getgroupcallstreamrtmpurl.peer);
        boolean z10 = g3Var != null && (peerDialogId >= 0 || ChatObject.isCreator(MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId))));
        if (g3Var != null) {
            bbVar.f0 = true;
            ci.d dVar2 = new ci.d(context, dVar, true);
            dVar2.g(LocaleController.getString(R.string.LiveStoryRTMPEnable), false, true);
            bbVar.containerView.addView(dVar2, w7.y5.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, (z10 ? 52 : 0) + 12));
            dVar2.setOnClickListener(new ai.d0(bbVar, g3Var, dVar2, 18));
            if (z10) {
                ci.d dVar3 = new ci.d(context, dVar, false);
                dVar3.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.r7, false));
                dVar3.d.u(AndroidUtilities.bold());
                dVar3.g(LocaleController.getString(R.string.LiveStoryRTMPRevoke), false, true);
                bbVar = this;
                dVar3.setOnClickListener(new ei.m3(this, context, dVar, dVar3, getgroupcallstreamrtmpurl, i10));
                bbVar.containerView.addView(dVar3, w7.y5.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 12.0f));
            }
        }
        s4.j jVar = new s4.j();
        jVar.m = false;
        jVar.C = false;
        jVar.o(rr.h);
        jVar.n(350L);
        bbVar.d.setItemAnimator(jVar);
        wl0 wl0Var = bbVar.d;
        int i12 = bbVar.backgroundPaddingLeft;
        if (bbVar.f0) {
            i11 = AndroidUtilities.dp(z10 ? 124.0f : 72.0f);
        } else {
            i11 = 0;
        }
        wl0Var.setPadding(i12, 0, i12, i11);
        bbVar.fixNavigationBar();
        bbVar.N();
        bbVar.b0 = groupcallstreamrtmpurl.url;
        bbVar.c0 = groupcallstreamrtmpurl.key;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(bbVar.c0);
        bbVar.d0 = spannableStringBuilder;
        b11 b11Var = new b11();
        b11Var.a |= 256;
        b11Var.b = 0;
        b11Var.c = spannableStringBuilder.length();
        bbVar.d0.setSpan(new c11(b11Var, 0), 0, bbVar.d0.length(), 0);
        bbVar.e0.N(false);
    }

    public static /* synthetic */ void P(nr nrVar, TLRPC.Peer peer) {
        nrVar.Z = MessagesController.getInstance(nrVar.currentAccount).getInputPeer(MessageObject.getPeerId(peer));
        nrVar.dismiss();
    }

    public static void Q(nr nrVar, ci.d dVar, long j3) {
        if (dVar.N) {
            return;
        }
        dVar.setLoading(true);
        TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
        getgroupcallstreamrtmpurl.peer = MessagesController.getInstance(nrVar.currentAccount).getInputPeer(j3);
        getgroupcallstreamrtmpurl.revoke = true;
        ConnectionsManager.getInstance(nrVar.currentAccount).sendRequest(getgroupcallstreamrtmpurl, new ir(nrVar, dVar, 0));
    }

    public static void R(nr nrVar, ArrayList arrayList) {
        String str = null;
        if (nrVar.g0 == null) {
            Context context = nrVar.getContext();
            org.telegram.ui.ActionBar.d6 d6Var = nrVar.resourcesProvider;
            mr mrVar = new mr(context);
            mrVar.setOrientation(1);
            lj0 lj0Var = new lj0(context);
            lj0Var.setAutoRepeat(true);
            lj0Var.f(R.raw.utyan_streaming, 112, 112, null);
            lj0Var.d();
            mrVar.addView(lj0Var, w7.y5.t(112, 112, 49, 0, 24, 0, 0));
            TextView textView = new TextView(context);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(LocaleController.formatString(R.string.Streaming, new Object[0]));
            textView.setTextSize(1, 20.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G6, d6Var));
            mrVar.addView(textView, w7.y5.t(-2, -2, 1, 0, 14, 0, 7));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(1);
            textView2.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.j5, d6Var));
            textView2.setText(LocaleController.formatString(R.string.VoipStreamStart, new Object[0]));
            textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
            mrVar.addView(textView2, w7.y5.t(-2, -2, 1, 28, 0, 28, 17));
            nrVar.g0 = mrVar;
        }
        arrayList.add(v51.k(nrVar.g0));
        arrayList.add(v51.B(null));
        com.google.android.gms.internal.vision.e2.n(R.string.VoipChatStreamSettings, arrayList);
        String str2 = nrVar.b0;
        String string = LocaleController.getString(R.string.VoipChatStreamServerUrl);
        int i10 = lr.a;
        v51 J = v51.J(lr.class);
        J.l = str2;
        J.n = string;
        J.j = false;
        J.g = false;
        arrayList.add(J);
        SpannableStringBuilder spannableStringBuilder = nrVar.d0;
        String string2 = LocaleController.getString(R.string.VoipChatStreamKey);
        v51 J2 = v51.J(lr.class);
        J2.l = spannableStringBuilder;
        J2.n = string2;
        J2.j = true;
        J2.g = false;
        arrayList.add(J2);
        if (nrVar.f0) {
            str = LocaleController.getString(nrVar.X ? R.string.VoipChatStreamWithAnotherAppDescriptionStory : R.string.VoipChatStreamWithAnotherAppDescription);
        }
        arrayList.add(v51.B(str));
    }

    public static void S(nr nrVar, Context context, ci.d dVar, long j3) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, nrVar.resourcesProvider);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.LiveStoryRTMPRevokeTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.LiveStoryRTMPRevokeText);
        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new ci.q9(nrVar, dVar, j3, 3));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.d(-1);
        alertDialog$Builder.o();
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final void dismissInternal() {
        TLRPC.InputPeer inputPeer;
        super.dismissInternal();
        f80 f80Var = this.Y;
        if (f80Var == null || (inputPeer = this.Z) == null) {
            return;
        }
        f80Var.a(inputPeer, this.a0, false, true);
    }

    @Override // org.telegram.ui.Components.bb
    public final vl0 v(wl0 wl0Var) {
        j61 j61Var = new j61(wl0Var, getContext(), this.currentAccount, 0, true, new d(this, 7), this.resourcesProvider);
        this.e0 = j61Var;
        return j61Var;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence y() {
        return LocaleController.getString(R.string.Streaming);
    }

    public nr(org.telegram.ui.ActionBar.m2 m2Var, TLRPC.Peer peer, long j3, boolean z10, f80 f80Var) {
        super(m2Var, false);
        this.X = false;
        this.v = 0.26f;
        this.Y = f80Var;
        this.a0 = z10;
        Context context = this.containerView.getContext();
        boolean isCreator = ChatObject.isCreator(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j3)));
        this.f0 = true;
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.VoipChannelStartStreaming));
        textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Sh, this.resourcesProvider));
        int dp = AndroidUtilities.dp(8.0f);
        int v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Oh, this.resourcesProvider);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, false), 120);
        textView.setBackground(org.telegram.ui.ActionBar.h6.i0(dp, dp, dp, dp, v02, k10, k10));
        this.containerView.addView(textView, w7.y5.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, (isCreator ? 52 : 0) + 12));
        textView.setOnClickListener(new org.telegram.ui.pf(26, this, peer));
        if (isCreator) {
            ci.d dVar = new ci.d(context, this.resourcesProvider, false);
            dVar.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.r7, false));
            dVar.d.u(AndroidUtilities.bold());
            dVar.g(LocaleController.getString(R.string.LiveStoryRTMPRevoke), false, true);
            dVar.setOnClickListener(new kr(this, context, dVar, j3, 0));
            this.containerView.addView(dVar, w7.y5.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 12.0f));
        }
        wl0 wl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        wl0Var.setPadding(i10, 0, i10, AndroidUtilities.dp((isCreator ? 52 : 0) + 72));
        s4.j jVar = new s4.j();
        jVar.m = false;
        jVar.C = false;
        jVar.o(rr.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        fixNavigationBar();
        N();
        TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
        getgroupcallstreamrtmpurl.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j3);
        getgroupcallstreamrtmpurl.revoke = false;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getgroupcallstreamrtmpurl, new y1(this, 2));
    }
}
