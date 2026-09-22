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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class mr extends za {
    public final boolean X;
    public final u70 Y;
    public TLRPC.InputPeer Z;
    public final boolean a0;
    public String b0;
    public String c0;
    public SpannableStringBuilder d0;
    public w51 e0;
    public final boolean f0;
    public lr g0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, org.telegram.ui.ActionBar.f3, org.telegram.ui.Components.mr, org.telegram.ui.Components.za] */
    /* JADX WARN: Type inference failed for: r0v3, types: [org.telegram.ui.ActionBar.f3] */
    public mr(Context context, int i10, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl, ci.m2 m2Var, ai.d dVar) {
        int i11;
        mr zaVar = new za(context, null, false, false, dVar);
        zaVar.X = true;
        zaVar.v = 0.126f;
        zaVar.Y = null;
        zaVar.a0 = false;
        long peerDialogId = DialogObject.getPeerDialogId(getgroupcallstreamrtmpurl.peer);
        boolean z10 = m2Var != null && (peerDialogId >= 0 || ChatObject.isCreator(MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId))));
        if (m2Var != null) {
            zaVar.f0 = true;
            ci.d dVar2 = new ci.d(context, dVar, true);
            dVar2.g(LocaleController.getString(R.string.LiveStoryRTMPEnable), false, true);
            zaVar.containerView.addView(dVar2, w7.x5.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, (z10 ? 52 : 0) + 12));
            dVar2.setOnClickListener(new ai.d0(zaVar, m2Var, dVar2, 18));
            if (z10) {
                ci.d dVar3 = new ci.d(context, dVar, false);
                dVar3.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.r7, false));
                dVar3.d.u(AndroidUtilities.bold());
                dVar3.g(LocaleController.getString(R.string.LiveStoryRTMPRevoke), false, true);
                zaVar = this;
                dVar3.setOnClickListener(new ei.m3(this, context, dVar, dVar3, getgroupcallstreamrtmpurl, i10));
                zaVar.containerView.addView(dVar3, w7.x5.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 12.0f));
            }
        }
        s4.j jVar = new s4.j();
        jVar.m = false;
        jVar.C = false;
        jVar.o(qr.h);
        jVar.n(350L);
        zaVar.d.setItemAnimator(jVar);
        ll0 ll0Var = zaVar.d;
        int i12 = zaVar.backgroundPaddingLeft;
        if (zaVar.f0) {
            i11 = AndroidUtilities.dp(z10 ? 124.0f : 72.0f);
        } else {
            i11 = 0;
        }
        ll0Var.setPadding(i12, 0, i12, i11);
        zaVar.fixNavigationBar();
        zaVar.N();
        zaVar.b0 = groupcallstreamrtmpurl.url;
        zaVar.c0 = groupcallstreamrtmpurl.key;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(zaVar.c0);
        zaVar.d0 = spannableStringBuilder;
        o01 o01Var = new o01();
        o01Var.a |= 256;
        o01Var.b = 0;
        o01Var.c = spannableStringBuilder.length();
        zaVar.d0.setSpan(new p01(o01Var, 0), 0, zaVar.d0.length(), 0);
        zaVar.e0.N(false);
    }

    public static /* synthetic */ void P(mr mrVar, TLRPC.Peer peer) {
        mrVar.Z = MessagesController.getInstance(mrVar.currentAccount).getInputPeer(MessageObject.getPeerId(peer));
        mrVar.dismiss();
    }

    public static void Q(mr mrVar, ci.d dVar, long j3) {
        if (dVar.N) {
            return;
        }
        dVar.setLoading(true);
        TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
        getgroupcallstreamrtmpurl.peer = MessagesController.getInstance(mrVar.currentAccount).getInputPeer(j3);
        getgroupcallstreamrtmpurl.revoke = true;
        ConnectionsManager.getInstance(mrVar.currentAccount).sendRequest(getgroupcallstreamrtmpurl, new hr(mrVar, dVar, 0));
    }

    public static void R(mr mrVar, ArrayList arrayList) {
        String str = null;
        if (mrVar.g0 == null) {
            Context context = mrVar.getContext();
            org.telegram.ui.ActionBar.e6 e6Var = mrVar.resourcesProvider;
            lr lrVar = new lr(context);
            lrVar.setOrientation(1);
            aj0 aj0Var = new aj0(context);
            aj0Var.setAutoRepeat(true);
            aj0Var.f(R.raw.utyan_streaming, 112, 112, null);
            aj0Var.d();
            lrVar.addView(aj0Var, w7.x5.t(112, 112, 49, 0, 24, 0, 0));
            TextView textView = new TextView(context);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(LocaleController.formatString(R.string.Streaming, new Object[0]));
            textView.setTextSize(1, 20.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, e6Var));
            lrVar.addView(textView, w7.x5.t(-2, -2, 1, 0, 14, 0, 7));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(1);
            textView2.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.j5, e6Var));
            textView2.setText(LocaleController.formatString(R.string.VoipStreamStart, new Object[0]));
            textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
            lrVar.addView(textView2, w7.x5.t(-2, -2, 1, 28, 0, 28, 17));
            mrVar.g0 = lrVar;
        }
        arrayList.add(i51.k(mrVar.g0));
        arrayList.add(i51.B(null));
        com.google.android.gms.internal.vision.e2.n(R.string.VoipChatStreamSettings, arrayList);
        String str2 = mrVar.b0;
        String string = LocaleController.getString(R.string.VoipChatStreamServerUrl);
        int i10 = kr.a;
        i51 J = i51.J(kr.class);
        J.l = str2;
        J.n = string;
        J.j = false;
        J.g = false;
        arrayList.add(J);
        SpannableStringBuilder spannableStringBuilder = mrVar.d0;
        String string2 = LocaleController.getString(R.string.VoipChatStreamKey);
        i51 J2 = i51.J(kr.class);
        J2.l = spannableStringBuilder;
        J2.n = string2;
        J2.j = true;
        J2.g = false;
        arrayList.add(J2);
        if (mrVar.f0) {
            str = LocaleController.getString(mrVar.X ? R.string.VoipChatStreamWithAnotherAppDescriptionStory : R.string.VoipChatStreamWithAnotherAppDescription);
        }
        arrayList.add(i51.B(str));
    }

    public static void S(mr mrVar, Context context, ci.d dVar, long j3) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, mrVar.resourcesProvider);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.LiveStoryRTMPRevokeTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.LiveStoryRTMPRevokeText);
        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new ci.t9(mrVar, dVar, j3, 3));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.d(-1);
        alertDialog$Builder.o();
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        TLRPC.InputPeer inputPeer;
        super.dismissInternal();
        u70 u70Var = this.Y;
        if (u70Var == null || (inputPeer = this.Z) == null) {
            return;
        }
        u70Var.a(inputPeer, this.a0, false, true);
    }

    @Override // org.telegram.ui.Components.za
    public final kl0 v(ll0 ll0Var) {
        w51 w51Var = new w51(ll0Var, getContext(), this.currentAccount, 0, true, new d(this, 7), this.resourcesProvider);
        this.e0 = w51Var;
        return w51Var;
    }

    @Override // org.telegram.ui.Components.za
    public final CharSequence y() {
        return LocaleController.getString(R.string.Streaming);
    }

    public mr(org.telegram.ui.ActionBar.n2 n2Var, TLRPC.Peer peer, long j3, boolean z10, u70 u70Var) {
        super(n2Var, false);
        this.X = false;
        this.v = 0.26f;
        this.Y = u70Var;
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
        textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Sh, this.resourcesProvider));
        int dp = AndroidUtilities.dp(8.0f);
        int v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Oh, this.resourcesProvider);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.d6, false), 120);
        textView.setBackground(org.telegram.ui.ActionBar.i6.i0(dp, dp, dp, dp, v02, k10, k10));
        this.containerView.addView(textView, w7.x5.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, (isCreator ? 52 : 0) + 12));
        textView.setOnClickListener(new org.telegram.ui.rf(26, this, peer));
        if (isCreator) {
            ci.d dVar = new ci.d(context, this.resourcesProvider, false);
            dVar.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.r7, false));
            dVar.d.u(AndroidUtilities.bold());
            dVar.g(LocaleController.getString(R.string.LiveStoryRTMPRevoke), false, true);
            dVar.setOnClickListener(new jr(this, context, dVar, j3, 0));
            this.containerView.addView(dVar, w7.x5.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 12.0f));
        }
        ll0 ll0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        ll0Var.setPadding(i10, 0, i10, AndroidUtilities.dp((isCreator ? 52 : 0) + 72));
        s4.j jVar = new s4.j();
        jVar.m = false;
        jVar.C = false;
        jVar.o(qr.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        fixNavigationBar();
        N();
        TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
        getgroupcallstreamrtmpurl.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j3);
        getgroupcallstreamrtmpurl.revoke = false;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getgroupcallstreamrtmpurl, new x1(this, 2));
    }
}
