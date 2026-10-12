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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class as extends db {
    public final boolean X;
    public final u80 Y;
    public TLRPC.InputPeer Z;
    public final boolean a0;
    public String b0;
    public String c0;
    public SpannableStringBuilder d0;
    public z61 e0;
    public final boolean f0;
    public zr g0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, org.telegram.ui.ActionBar.e3, org.telegram.ui.Components.as, org.telegram.ui.Components.db] */
    /* JADX WARN: Type inference failed for: r0v3, types: [org.telegram.ui.ActionBar.e3] */
    public as(Context context, int i10, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl, bi.v2 v2Var, bi.b bVar) {
        int i11;
        as dbVar = new db(context, null, false, false, bVar);
        dbVar.X = true;
        dbVar.v = 0.126f;
        dbVar.Y = null;
        dbVar.a0 = false;
        long peerDialogId = DialogObject.getPeerDialogId(getgroupcallstreamrtmpurl.peer);
        boolean z10 = v2Var != null && (peerDialogId >= 0 || ChatObject.isCreator(MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId))));
        if (v2Var != null) {
            dbVar.f0 = true;
            di.d dVar = new di.d(context, bVar, true);
            dVar.g(LocaleController.getString(R.string.LiveStoryRTMPEnable), false, true);
            dbVar.containerView.addView(dVar, w7.a6.a(48.0f, 16.0f, 0.0f, 16.0f, (z10 ? 52 : 0) + 12, -1, 80));
            dVar.setOnClickListener(new bi.x(dbVar, v2Var, dVar, 18));
            if (z10) {
                di.d dVar2 = new di.d(context, bVar, false);
                dVar2.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.r7, false));
                dVar2.d.x(AndroidUtilities.bold());
                dVar2.g(LocaleController.getString(R.string.LiveStoryRTMPRevoke), false, true);
                dbVar = this;
                dVar2.setOnClickListener(new fi.m3(this, i10, context, bVar, dVar2, getgroupcallstreamrtmpurl, 3));
                dbVar.containerView.addView(dVar2, w7.a6.a(48.0f, 16.0f, 0.0f, 16.0f, 12.0f, -1, 80));
            }
        }
        s4.k kVar = new s4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(es.h);
        kVar.n(350L);
        dbVar.d.setItemAnimator(kVar);
        mm0 mm0Var = dbVar.d;
        int i12 = dbVar.backgroundPaddingLeft;
        if (dbVar.f0) {
            i11 = AndroidUtilities.dp(z10 ? 124.0f : 72.0f);
        } else {
            i11 = 0;
        }
        mm0Var.setPadding(i12, 0, i12, i11);
        dbVar.fixNavigationBar();
        dbVar.O();
        dbVar.b0 = groupcallstreamrtmpurl.url;
        dbVar.c0 = groupcallstreamrtmpurl.key;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(dbVar.c0);
        dbVar.d0 = spannableStringBuilder;
        p11 p11Var = new p11();
        p11Var.a |= 256;
        p11Var.b = 0;
        p11Var.c = spannableStringBuilder.length();
        dbVar.d0.setSpan(new q11(p11Var, 0), 0, dbVar.d0.length(), 0);
        dbVar.e0.N(false);
    }

    public static /* synthetic */ void Q(as asVar, TLRPC.Peer peer) {
        asVar.Z = MessagesController.getInstance(asVar.currentAccount).getInputPeer(MessageObject.getPeerId(peer));
        asVar.dismiss();
    }

    public static void R(as asVar, di.d dVar, long j10) {
        if (dVar.N) {
            return;
        }
        dVar.setLoading(true);
        TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
        getgroupcallstreamrtmpurl.peer = MessagesController.getInstance(asVar.currentAccount).getInputPeer(j10);
        getgroupcallstreamrtmpurl.revoke = true;
        ConnectionsManager.getInstance(asVar.currentAccount).sendRequest(getgroupcallstreamrtmpurl, new vr(asVar, dVar, 0));
    }

    public static void S(as asVar, ArrayList arrayList) {
        String str = null;
        if (asVar.g0 == null) {
            Context context = asVar.getContext();
            org.telegram.ui.ActionBar.c6 c6Var = asVar.resourcesProvider;
            zr zrVar = new zr(context);
            zrVar.setOrientation(1);
            bk0 bk0Var = new bk0(context);
            bk0Var.setAutoRepeat(true);
            bk0Var.f(R.raw.utyan_streaming, 112, 112, null);
            bk0Var.d();
            zrVar.addView(bk0Var, w7.a6.t(112, 112, 49, 0, 24, 0, 0));
            TextView textView = new TextView(context);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(LocaleController.formatString(R.string.Streaming, new Object[0]));
            textView.setTextSize(1, 20.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, c6Var));
            zrVar.addView(textView, w7.a6.t(-2, -2, 1, 0, 14, 0, 7));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(1);
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.j5, c6Var));
            textView2.setText(LocaleController.formatString(R.string.VoipStreamStart, new Object[0]));
            textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
            zrVar.addView(textView2, w7.a6.t(-2, -2, 1, 28, 0, 28, 17));
            asVar.g0 = zrVar;
        }
        arrayList.add(l61.k(asVar.g0));
        arrayList.add(l61.B(null));
        i2.d.o(R.string.VoipChatStreamSettings, arrayList);
        String str2 = asVar.b0;
        String string = LocaleController.getString(R.string.VoipChatStreamServerUrl);
        int i10 = yr.a;
        l61 J = l61.J(yr.class);
        J.l = str2;
        J.n = string;
        J.j = false;
        J.g = false;
        arrayList.add(J);
        SpannableStringBuilder spannableStringBuilder = asVar.d0;
        String string2 = LocaleController.getString(R.string.VoipChatStreamKey);
        l61 J2 = l61.J(yr.class);
        J2.l = spannableStringBuilder;
        J2.n = string2;
        J2.j = true;
        J2.g = false;
        arrayList.add(J2);
        if (asVar.f0) {
            str = LocaleController.getString(asVar.X ? R.string.VoipChatStreamWithAnotherAppDescriptionStory : R.string.VoipChatStreamWithAnotherAppDescription);
        }
        arrayList.add(l61.B(str));
    }

    public static void T(as asVar, Context context, di.d dVar, long j10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, asVar.resourcesProvider);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.LiveStoryRTMPRevokeTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.LiveStoryRTMPRevokeText);
        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new di.p9(asVar, dVar, j10, 3));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.d(-1);
        alertDialog$Builder.o();
    }

    @Override // org.telegram.ui.Components.db
    public final CharSequence A() {
        return LocaleController.getString(R.string.Streaming);
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final void dismissInternal() {
        TLRPC.InputPeer inputPeer;
        super.dismissInternal();
        u80 u80Var = this.Y;
        if (u80Var == null || (inputPeer = this.Z) == null) {
            return;
        }
        u80Var.a(inputPeer, this.a0, false, true);
    }

    @Override // org.telegram.ui.Components.db
    public final lm0 x(mm0 mm0Var) {
        z61 z61Var = new z61(mm0Var, getContext(), this.currentAccount, 0, true, new d(this, 7), this.resourcesProvider);
        this.e0 = z61Var;
        return z61Var;
    }

    public as(org.telegram.ui.ActionBar.m2 m2Var, TLRPC.Peer peer, long j10, boolean z10, u80 u80Var) {
        super(m2Var, false);
        this.X = false;
        this.v = 0.26f;
        this.Y = u80Var;
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
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Sh, this.resourcesProvider));
        int dp = AndroidUtilities.dp(8.0f);
        int w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, this.resourcesProvider);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.d6, false), 120);
        textView.setBackground(org.telegram.ui.ActionBar.g6.j0(dp, dp, dp, dp, w02, k10, k10));
        this.containerView.addView(textView, w7.a6.a(48.0f, 16.0f, 0.0f, 16.0f, (isCreator ? 52 : 0) + 12, -1, 80));
        textView.setOnClickListener(new org.telegram.ui.xf(26, this, peer));
        if (isCreator) {
            di.d dVar = new di.d(context, this.resourcesProvider, false);
            dVar.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.r7, false));
            dVar.d.x(AndroidUtilities.bold());
            dVar.g(LocaleController.getString(R.string.LiveStoryRTMPRevoke), false, true);
            dVar.setOnClickListener(new xr(this, context, dVar, j10, 0));
            this.containerView.addView(dVar, w7.a6.a(48.0f, 16.0f, 0.0f, 16.0f, 12.0f, -1, 80));
        }
        mm0 mm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i10, 0, i10, AndroidUtilities.dp((isCreator ? 52 : 0) + 72));
        s4.k kVar = new s4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(es.h);
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
