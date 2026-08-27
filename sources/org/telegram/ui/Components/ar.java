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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ar extends qa {
    public final boolean T;
    public final i70 U;
    public TLRPC.InputPeer V;
    public final boolean W;
    public String X;
    public String Y;
    public SpannableStringBuilder Z;
    public b51 a0;
    public final boolean b0;
    public zq c0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, org.telegram.ui.ActionBar.e3, org.telegram.ui.Components.ar, org.telegram.ui.Components.qa] */
    /* JADX WARN: Type inference failed for: r0v3, types: [org.telegram.ui.ActionBar.e3] */
    public ar(Context context, int i10, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl, gh.d1 d1Var, jh.b bVar) {
        int i11;
        ar qaVar = new qa(context, null, false, false, false, 1, bVar);
        qaVar.T = true;
        qaVar.v = 0.126f;
        qaVar.U = null;
        qaVar.W = false;
        long peerDialogId = DialogObject.getPeerDialogId(getgroupcallstreamrtmpurl.peer);
        boolean z10 = d1Var != null && (peerDialogId >= 0 || ChatObject.isCreator(MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId))));
        if (d1Var != null) {
            qaVar.b0 = true;
            lh.d dVar = new lh.d(context, bVar, true);
            dVar.g(LocaleController.getString(R.string.LiveStoryRTMPEnable), false, true);
            qaVar.containerView.addView(dVar, h7.z5.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, (z10 ? 52 : 0) + 12));
            dVar.setOnClickListener(new gg.f((Object) qaVar, d1Var, dVar, 23));
            if (z10) {
                lh.d dVar2 = new lh.d(context, bVar, false);
                dVar2.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.r7, false));
                dVar2.d.u(AndroidUtilities.bold());
                dVar2.g(LocaleController.getString(R.string.LiveStoryRTMPRevoke), false, true);
                qaVar = this;
                dVar2.setOnClickListener(new hh.u8(this, context, bVar, dVar2, getgroupcallstreamrtmpurl, i10, 4));
                qaVar.containerView.addView(dVar2, h7.z5.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 12.0f));
            }
        }
        f2.l lVar = new f2.l();
        lVar.m = false;
        lVar.C = false;
        lVar.o(er.h);
        lVar.n(350L);
        qaVar.d.setItemAnimator(lVar);
        zk0 zk0Var = qaVar.d;
        int i12 = qaVar.backgroundPaddingLeft;
        if (qaVar.b0) {
            i11 = AndroidUtilities.dp(z10 ? 124.0f : 72.0f);
        } else {
            i11 = 0;
        }
        zk0Var.setPadding(i12, 0, i12, i11);
        qaVar.fixNavigationBar();
        qaVar.N();
        qaVar.X = groupcallstreamrtmpurl.url;
        qaVar.Y = groupcallstreamrtmpurl.key;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(qaVar.Y);
        qaVar.Z = spannableStringBuilder;
        xz0 xz0Var = new xz0();
        xz0Var.a |= 256;
        xz0Var.b = 0;
        xz0Var.c = spannableStringBuilder.length();
        qaVar.Z.setSpan(new yz0(xz0Var, 0), 0, qaVar.Z.length(), 0);
        qaVar.a0.N(false);
    }

    public static /* synthetic */ void P(ar arVar, TLRPC.Peer peer) {
        arVar.V = MessagesController.getInstance(arVar.currentAccount).getInputPeer(MessageObject.getPeerId(peer));
        arVar.dismiss();
    }

    public static void Q(ar arVar, lh.d dVar, long j10) {
        if (dVar.J) {
            return;
        }
        dVar.setLoading(true);
        TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
        getgroupcallstreamrtmpurl.peer = MessagesController.getInstance(arVar.currentAccount).getInputPeer(j10);
        getgroupcallstreamrtmpurl.revoke = true;
        ConnectionsManager.getInstance(arVar.currentAccount).sendRequest(getgroupcallstreamrtmpurl, new vq(arVar, dVar, 0));
    }

    public static void R(ar arVar, ArrayList arrayList) {
        String str = null;
        if (arVar.c0 == null) {
            Context context = arVar.getContext();
            org.telegram.ui.ActionBar.c6 c6Var = arVar.resourcesProvider;
            zq zqVar = new zq(context);
            zqVar.setOrientation(1);
            ri0 ri0Var = new ri0(context);
            ri0Var.setAutoRepeat(true);
            ri0Var.f(R.raw.utyan_streaming, 112, 112, null);
            ri0Var.d();
            zqVar.addView(ri0Var, h7.z5.t(112, 112, 49, 0, 24, 0, 0));
            TextView textView = new TextView(context);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(LocaleController.formatString(R.string.Streaming, new Object[0]));
            textView.setTextSize(1, 20.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
            zqVar.addView(textView, h7.z5.t(-2, -2, 1, 0, 14, 0, 7));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(1);
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.j5, c6Var));
            textView2.setText(LocaleController.formatString(R.string.VoipStreamStart, new Object[0]));
            textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
            zqVar.addView(textView2, h7.z5.t(-2, -2, 1, 28, 0, 28, 17));
            arVar.c0 = zqVar;
        }
        arrayList.add(n41.k(arVar.c0));
        arrayList.add(n41.B(null));
        org.telegram.ui.Cells.pa.o(R.string.VoipChatStreamSettings, arrayList);
        String str2 = arVar.X;
        String string = LocaleController.getString(R.string.VoipChatStreamServerUrl);
        int i10 = yq.a;
        n41 J = n41.J(yq.class);
        J.l = str2;
        J.n = string;
        J.j = false;
        J.g = false;
        arrayList.add(J);
        SpannableStringBuilder spannableStringBuilder = arVar.Z;
        String string2 = LocaleController.getString(R.string.VoipChatStreamKey);
        n41 J2 = n41.J(yq.class);
        J2.l = spannableStringBuilder;
        J2.n = string2;
        J2.j = true;
        J2.g = false;
        arrayList.add(J2);
        if (arVar.b0) {
            str = LocaleController.getString(arVar.T ? R.string.VoipChatStreamWithAnotherAppDescriptionStory : R.string.VoipChatStreamWithAnotherAppDescription);
        }
        arrayList.add(n41.B(str));
    }

    public static void S(ar arVar, Context context, lh.d dVar, long j10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, arVar.resourcesProvider);
        alertDialog$Builder.a.N = LocaleController.getString(R.string.LiveStoryRTMPRevokeTitle);
        alertDialog$Builder.a.P = LocaleController.getString(R.string.LiveStoryRTMPRevokeText);
        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new c3.f(arVar, dVar, j10, 7));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.d(-1);
        alertDialog$Builder.o();
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final void dismissInternal() {
        TLRPC.InputPeer inputPeer;
        super.dismissInternal();
        i70 i70Var = this.U;
        if (i70Var == null || (inputPeer = this.V) == null) {
            return;
        }
        i70Var.a(inputPeer, this.W, false, true);
    }

    @Override // org.telegram.ui.Components.qa
    public final yk0 w(zk0 zk0Var) {
        b51 b51Var = new b51(zk0Var, getContext(), this.currentAccount, 0, true, new d(this, 7), this.resourcesProvider);
        this.a0 = b51Var;
        return b51Var;
    }

    @Override // org.telegram.ui.Components.qa
    public final CharSequence z() {
        return LocaleController.getString(R.string.Streaming);
    }

    public ar(org.telegram.ui.ActionBar.n2 n2Var, TLRPC.Peer peer, long j10, boolean z10, i70 i70Var) {
        super(n2Var, false);
        this.T = false;
        this.v = 0.26f;
        this.U = i70Var;
        this.W = z10;
        Context context = this.containerView.getContext();
        boolean isCreator = ChatObject.isCreator(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10)));
        this.b0 = true;
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.VoipChannelStartStreaming));
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Sh, this.resourcesProvider));
        int dp = AndroidUtilities.dp(8.0f);
        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, this.resourcesProvider);
        int k10 = i0.b.k(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false), 120);
        textView.setBackground(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, v02, k10, k10));
        this.containerView.addView(textView, h7.z5.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, (isCreator ? 52 : 0) + 12));
        textView.setOnClickListener(new q2(14, this, peer));
        if (isCreator) {
            lh.d dVar = new lh.d(context, this.resourcesProvider, false);
            dVar.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.r7, false));
            dVar.d.u(AndroidUtilities.bold());
            dVar.g(LocaleController.getString(R.string.LiveStoryRTMPRevoke), false, true);
            dVar.setOnClickListener(new cg.b1(this, context, dVar, j10, 1));
            this.containerView.addView(dVar, h7.z5.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 12.0f));
        }
        zk0 zk0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        zk0Var.setPadding(i10, 0, i10, AndroidUtilities.dp((isCreator ? 52 : 0) + 72));
        f2.l lVar = new f2.l();
        lVar.m = false;
        lVar.C = false;
        lVar.o(er.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        fixNavigationBar();
        N();
        TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
        getgroupcallstreamrtmpurl.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j10);
        getgroupcallstreamrtmpurl.revoke = false;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getgroupcallstreamrtmpurl, new w1(this, 2));
    }
}
