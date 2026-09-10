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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class mr extends ab {
    public final d80 X;
    public final ArrayList Y;
    public final boolean Z;
    public final boolean a0;
    public final boolean b0;
    public boolean c0;
    public TLRPC.Peer d0;
    public TLRPC.InputPeer e0;
    public final org.telegram.ui.ActionBar.p2 f0;
    public final long g0;

    public mr(org.telegram.ui.ActionBar.p2 p2Var, ArrayList arrayList, long j3, d80 d80Var) {
        super(p2Var, false);
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j3));
        this.f0 = p2Var;
        this.g0 = j3;
        this.v = 0.26f;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.Y = arrayList2;
        this.X = d80Var;
        boolean isChannelOrGiga = ChatObject.isChannelOrGiga(chat);
        this.b0 = isChannelOrGiga;
        this.d0 = (TLRPC.Peer) arrayList2.get(0);
        this.Z = arrayList2.size() > 1;
        this.a0 = ChatObject.canManageCalls(chat);
        Context context = this.containerView.getContext();
        this.containerView.addView(new bi.nc(this, context, 16), w7.a6.d(-1, 120.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        textView.setGravity(17);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(isChannelOrGiga ? LocaleController.formatString(R.string.VoipChannelStartVoiceChat, new Object[0]) : LocaleController.formatString(R.string.VoipGroupStartVoiceChat, new Object[0]));
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
        int dp = AndroidUtilities.dp(8.0f);
        int i10 = org.telegram.ui.ActionBar.j6.Oh;
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false), 120);
        textView.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, w02, k10, k10));
        this.containerView.addView(textView, w7.a6.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 60.0f));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(isChannelOrGiga ? LocaleController.formatString(R.string.VoipChannelScheduleVoiceChat, new Object[0]) : LocaleController.formatString(R.string.VoipGroupScheduleVoiceChat, new Object[0]));
        textView2.setLetterSpacing(0.025f);
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        int dp2 = AndroidUtilities.dp(8.0f);
        int k11 = i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, i10, false), 120);
        textView2.setBackground(org.telegram.ui.ActionBar.j6.i0(dp2, dp2, dp2, dp2, 0, k11, k11));
        this.containerView.addView(textView2, w7.a6.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 6.0f));
        final int i11 = 0;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.jr
            public final /* synthetic */ mr b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        mr.P(this.b);
                        break;
                    default:
                        mr.Q(this.b);
                        break;
                }
            }
        });
        final int i12 = 1;
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.jr
            public final /* synthetic */ mr b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        mr.P(this.b);
                        break;
                    default:
                        mr.Q(this.b);
                        break;
                }
            }
        });
        vl0 vl0Var = this.d;
        int i13 = this.backgroundPaddingLeft;
        vl0Var.setPadding(i13, 0, i13, AndroidUtilities.dp(120.0f));
        this.d.setOnItemClickListener(new k(this, 4));
        fixNavigationBar();
        N();
    }

    public static /* synthetic */ void P(mr mrVar) {
        mrVar.e0 = MessagesController.getInstance(mrVar.currentAccount).getInputPeer(MessageObject.getPeerId(mrVar.d0));
        mrVar.dismiss();
    }

    public static /* synthetic */ void Q(mr mrVar) {
        mrVar.e0 = MessagesController.getInstance(mrVar.currentAccount).getInputPeer(MessageObject.getPeerId(mrVar.d0));
        mrVar.c0 = true;
        mrVar.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void dismissInternal() {
        super.dismissInternal();
        TLRPC.InputPeer inputPeer = this.e0;
        if (inputPeer != null) {
            this.X.a(inputPeer, this.Y.size() > 1, this.c0, false);
        }
    }

    @Override // org.telegram.ui.Components.ab
    public final ul0 v(vl0 vl0Var) {
        return new kr(this);
    }

    @Override // org.telegram.ui.Components.ab
    public final CharSequence y() {
        return this.b0 ? LocaleController.getString(R.string.StartVoipChannelTitle) : LocaleController.getString(R.string.StartVoipChatTitle);
    }
}
