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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class xr extends bb {
    public final boolean X;
    public final p80 Y;
    public TLRPC.InputPeer Z;
    public final boolean a0;
    public String b0;
    public String c0;
    public SpannableStringBuilder d0;
    public t61 e0;
    public final boolean f0;
    public wr g0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, org.telegram.ui.ActionBar.f3, org.telegram.ui.Components.bb, org.telegram.ui.Components.xr] */
    /* JADX WARN: Type inference failed for: r0v3, types: [org.telegram.ui.ActionBar.f3] */
    public xr(Context context, int i10, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl, ai.o2 o2Var, ci.b bVar) {
        int i11;
        xr bbVar = new bb(context, null, false, false, bVar);
        bbVar.X = true;
        bbVar.v = 0.126f;
        bbVar.Y = null;
        bbVar.a0 = false;
        long peerDialogId = DialogObject.getPeerDialogId(getgroupcallstreamrtmpurl.peer);
        boolean z10 = o2Var != null && (peerDialogId >= 0 || ChatObject.isCreator(MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId))));
        if (o2Var != null) {
            bbVar.f0 = true;
            ei.d dVar = new ei.d(context, bVar, true);
            dVar.g(LocaleController.getString(R.string.LiveStoryRTMPEnable), false, true);
            bbVar.containerView.addView(dVar, w7.z5.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, (z10 ? 52 : 0) + 12));
            dVar.setOnClickListener(new ai.v0(bbVar, o2Var, dVar, 21));
            if (z10) {
                ei.d dVar2 = new ei.d(context, bVar, false);
                dVar2.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.r7, false));
                dVar2.d.x(AndroidUtilities.bold());
                dVar2.g(LocaleController.getString(R.string.LiveStoryRTMPRevoke), false, true);
                bbVar = this;
                dVar2.setOnClickListener(new ai.nb(this, context, bVar, dVar2, getgroupcallstreamrtmpurl, i10));
                bbVar.containerView.addView(dVar2, w7.z5.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 12.0f));
            }
        }
        s4.k kVar = new s4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(bs.h);
        kVar.n(350L);
        bbVar.d.setItemAnimator(kVar);
        im0 im0Var = bbVar.d;
        int i12 = bbVar.backgroundPaddingLeft;
        if (bbVar.f0) {
            i11 = AndroidUtilities.dp(z10 ? 124.0f : 72.0f);
        } else {
            i11 = 0;
        }
        im0Var.setPadding(i12, 0, i12, i11);
        bbVar.fixNavigationBar();
        bbVar.O();
        bbVar.b0 = groupcallstreamrtmpurl.url;
        bbVar.c0 = groupcallstreamrtmpurl.key;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(bbVar.c0);
        bbVar.d0 = spannableStringBuilder;
        m11 m11Var = new m11();
        m11Var.a |= 256;
        m11Var.b = 0;
        m11Var.c = spannableStringBuilder.length();
        bbVar.d0.setSpan(new n11(m11Var, 0), 0, bbVar.d0.length(), 0);
        bbVar.e0.N(false);
    }

    public static /* synthetic */ void Q(xr xrVar, TLRPC.Peer peer) {
        xrVar.Z = MessagesController.getInstance(xrVar.currentAccount).getInputPeer(MessageObject.getPeerId(peer));
        xrVar.dismiss();
    }

    public static void R(xr xrVar, ei.d dVar, long j10) {
        if (dVar.N) {
            return;
        }
        dVar.setLoading(true);
        TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
        getgroupcallstreamrtmpurl.peer = MessagesController.getInstance(xrVar.currentAccount).getInputPeer(j10);
        getgroupcallstreamrtmpurl.revoke = true;
        ConnectionsManager.getInstance(xrVar.currentAccount).sendRequest(getgroupcallstreamrtmpurl, new sr(xrVar, dVar, 0));
    }

    public static void S(xr xrVar, ArrayList arrayList) {
        String str = null;
        if (xrVar.g0 == null) {
            Context context = xrVar.getContext();
            org.telegram.ui.ActionBar.d6 d6Var = xrVar.resourcesProvider;
            wr wrVar = new wr(context);
            wrVar.setOrientation(1);
            xj0 xj0Var = new xj0(context);
            xj0Var.setAutoRepeat(true);
            xj0Var.f(R.raw.utyan_streaming, 112, 112, null);
            xj0Var.d();
            wrVar.addView(xj0Var, w7.z5.t(112, 112, 49, 0, 24, 0, 0));
            TextView textView = new TextView(context);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(LocaleController.formatString(R.string.Streaming, new Object[0]));
            textView.setTextSize(1, 20.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var));
            wrVar.addView(textView, w7.z5.t(-2, -2, 1, 0, 14, 0, 7));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(1);
            textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.j5, d6Var));
            textView2.setText(LocaleController.formatString(R.string.VoipStreamStart, new Object[0]));
            textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
            wrVar.addView(textView2, w7.z5.t(-2, -2, 1, 28, 0, 28, 17));
            xrVar.g0 = wrVar;
        }
        arrayList.add(g61.k(xrVar.g0));
        arrayList.add(g61.B(null));
        i2.e.p(R.string.VoipChatStreamSettings, arrayList);
        String str2 = xrVar.b0;
        String string = LocaleController.getString(R.string.VoipChatStreamServerUrl);
        int i10 = vr.a;
        g61 J = g61.J(vr.class);
        J.l = str2;
        J.n = string;
        J.j = false;
        J.g = false;
        arrayList.add(J);
        SpannableStringBuilder spannableStringBuilder = xrVar.d0;
        String string2 = LocaleController.getString(R.string.VoipChatStreamKey);
        g61 J2 = g61.J(vr.class);
        J2.l = spannableStringBuilder;
        J2.n = string2;
        J2.j = true;
        J2.g = false;
        arrayList.add(J2);
        if (xrVar.f0) {
            str = LocaleController.getString(xrVar.X ? R.string.VoipChatStreamWithAnotherAppDescriptionStory : R.string.VoipChatStreamWithAnotherAppDescription);
        }
        arrayList.add(g61.B(str));
    }

    public static void T(xr xrVar, Context context, ei.d dVar, long j10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, xrVar.resourcesProvider);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.LiveStoryRTMPRevokeTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.LiveStoryRTMPRevokeText);
        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new ai.f(xrVar, dVar, j10, 5));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.d(-1);
        alertDialog$Builder.o();
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence A() {
        return LocaleController.getString(R.string.Streaming);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        TLRPC.InputPeer inputPeer;
        super.dismissInternal();
        p80 p80Var = this.Y;
        if (p80Var == null || (inputPeer = this.Z) == null) {
            return;
        }
        p80Var.a(inputPeer, this.a0, false, true);
    }

    @Override // org.telegram.ui.Components.bb
    public final hm0 x(im0 im0Var) {
        t61 t61Var = new t61(im0Var, getContext(), this.currentAccount, 0, true, new d(this, 7), this.resourcesProvider);
        this.e0 = t61Var;
        return t61Var;
    }

    public xr(org.telegram.ui.ActionBar.n2 n2Var, TLRPC.Peer peer, long j10, boolean z10, p80 p80Var) {
        super(n2Var, false);
        this.X = false;
        this.v = 0.26f;
        this.Y = p80Var;
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
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Sh, this.resourcesProvider));
        int dp = AndroidUtilities.dp(8.0f);
        int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, this.resourcesProvider);
        int o10 = i0.a.o(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false), 120);
        textView.setBackground(org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, w02, o10, o10));
        this.containerView.addView(textView, w7.z5.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, (isCreator ? 52 : 0) + 12));
        textView.setOnClickListener(new ca(6, this, peer));
        if (isCreator) {
            ei.d dVar = new ei.d(context, this.resourcesProvider, false);
            dVar.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.r7, false));
            dVar.d.x(AndroidUtilities.bold());
            dVar.g(LocaleController.getString(R.string.LiveStoryRTMPRevoke), false, true);
            dVar.setOnClickListener(new ur(this, context, dVar, j10, 0));
            this.containerView.addView(dVar, w7.z5.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 12.0f));
        }
        im0 im0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        im0Var.setPadding(i10, 0, i10, AndroidUtilities.dp((isCreator ? 52 : 0) + 72));
        s4.k kVar = new s4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(bs.h);
        kVar.n(350L);
        this.d.setItemAnimator(kVar);
        fixNavigationBar();
        O();
        TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
        getgroupcallstreamrtmpurl.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j10);
        getgroupcallstreamrtmpurl.revoke = false;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getgroupcallstreamrtmpurl, new y1(this, 2));
    }
}
