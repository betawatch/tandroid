package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class wq extends sa {
    public final e70 T;
    public final ArrayList U;
    public final boolean V;
    public final boolean W;
    public final boolean X;
    public boolean Y;
    public TLRPC.Peer Z;
    public TLRPC.InputPeer a0;
    public final org.telegram.ui.ActionBar.o2 b0;
    public final long c0;

    public wq(org.telegram.ui.ActionBar.o2 o2Var, ArrayList arrayList, long j10, e70 e70Var) {
        super(o2Var, false);
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
        this.b0 = o2Var;
        this.c0 = j10;
        this.v = 0.26f;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.U = arrayList2;
        this.T = e70Var;
        boolean isChannelOrGiga = ChatObject.isChannelOrGiga(chat);
        this.X = isChannelOrGiga;
        this.Z = (TLRPC.Peer) arrayList2.get(0);
        this.V = arrayList2.size() > 1;
        this.W = ChatObject.canManageCalls(chat);
        Context context = this.containerView.getContext();
        this.containerView.addView(new fh.l2(this, context, 15), g7.e6.d(-1, 120.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        textView.setGravity(17);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(isChannelOrGiga ? LocaleController.formatString(R.string.VoipChannelStartVoiceChat, new Object[0]) : LocaleController.formatString(R.string.VoipGroupStartVoiceChat, new Object[0]));
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sh, false));
        int dp = AndroidUtilities.dp(8.0f);
        int i9 = org.telegram.ui.ActionBar.f6.Oh;
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, i9, false);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false), 120);
        textView.setBackground(org.telegram.ui.ActionBar.f6.i0(dp, dp, dp, dp, w02, k10, k10));
        this.containerView.addView(textView, g7.e6.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 60.0f));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(isChannelOrGiga ? LocaleController.formatString(R.string.VoipChannelScheduleVoiceChat, new Object[0]) : LocaleController.formatString(R.string.VoipGroupScheduleVoiceChat, new Object[0]));
        textView2.setLetterSpacing(0.025f);
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        int dp2 = AndroidUtilities.dp(8.0f);
        int k11 = i0.a.k(org.telegram.ui.ActionBar.f6.w0(null, i9, false), 120);
        textView2.setBackground(org.telegram.ui.ActionBar.f6.i0(dp2, dp2, dp2, dp2, 0, k11, k11));
        this.containerView.addView(textView2, g7.e6.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 6.0f));
        final int i10 = 0;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.tq
            public final /* synthetic */ wq b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        wq.O(this.b);
                        break;
                    default:
                        wq.P(this.b);
                        break;
                }
            }
        });
        final int i11 = 1;
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.tq
            public final /* synthetic */ wq b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        wq.O(this.b);
                        break;
                    default:
                        wq.P(this.b);
                        break;
                }
            }
        });
        wk0 wk0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        wk0Var.setPadding(i12, 0, i12, AndroidUtilities.dp(120.0f));
        this.d.setOnItemClickListener(new j(this, 4));
        fixNavigationBar();
        M();
    }

    public static /* synthetic */ void O(wq wqVar) {
        wqVar.a0 = MessagesController.getInstance(wqVar.currentAccount).getInputPeer(MessageObject.getPeerId(wqVar.Z));
        wqVar.dismiss();
    }

    public static /* synthetic */ void P(wq wqVar) {
        wqVar.a0 = MessagesController.getInstance(wqVar.currentAccount).getInputPeer(MessageObject.getPeerId(wqVar.Z));
        wqVar.Y = true;
        wqVar.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        super.dismissInternal();
        TLRPC.InputPeer inputPeer = this.a0;
        if (inputPeer != null) {
            this.T.a(inputPeer, this.U.size() > 1, this.Y, false);
        }
    }

    @Override // org.telegram.ui.Components.sa
    public final vk0 v(wk0 wk0Var) {
        return new uq(this);
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        return this.X ? LocaleController.getString(R.string.StartVoipChannelTitle) : LocaleController.getString(R.string.StartVoipChatTitle);
    }
}
