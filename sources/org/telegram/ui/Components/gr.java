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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class gr extends za {
    public final u70 X;
    public final ArrayList Y;
    public final boolean Z;
    public final boolean a0;
    public final boolean b0;
    public boolean c0;
    public TLRPC.Peer d0;
    public TLRPC.InputPeer e0;
    public final org.telegram.ui.ActionBar.o2 f0;
    public final long g0;

    public gr(org.telegram.ui.ActionBar.o2 o2Var, ArrayList arrayList, long j3, u70 u70Var) {
        super(o2Var, false);
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j3));
        this.f0 = o2Var;
        this.g0 = j3;
        this.v = 0.26f;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.Y = arrayList2;
        this.X = u70Var;
        boolean isChannelOrGiga = ChatObject.isChannelOrGiga(chat);
        this.b0 = isChannelOrGiga;
        this.d0 = (TLRPC.Peer) arrayList2.get(0);
        this.Z = arrayList2.size() > 1;
        this.a0 = ChatObject.canManageCalls(chat);
        Context context = this.containerView.getContext();
        this.containerView.addView(new ci.eb(this, context, 16), w7.x5.d(-1, 120.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
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
        this.containerView.addView(textView, w7.x5.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 60.0f));
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
        this.containerView.addView(textView2, w7.x5.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 6.0f));
        final int i11 = 0;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.dr
            public final /* synthetic */ gr b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        gr.P(this.b);
                        break;
                    default:
                        gr.Q(this.b);
                        break;
                }
            }
        });
        final int i12 = 1;
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.dr
            public final /* synthetic */ gr b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        gr.P(this.b);
                        break;
                    default:
                        gr.Q(this.b);
                        break;
                }
            }
        });
        ml0 ml0Var = this.d;
        int i13 = this.backgroundPaddingLeft;
        ml0Var.setPadding(i13, 0, i13, AndroidUtilities.dp(120.0f));
        this.d.setOnItemClickListener(new j(this, 4));
        fixNavigationBar();
        N();
    }

    public static /* synthetic */ void P(gr grVar) {
        grVar.e0 = MessagesController.getInstance(grVar.currentAccount).getInputPeer(MessageObject.getPeerId(grVar.d0));
        grVar.dismiss();
    }

    public static /* synthetic */ void Q(gr grVar) {
        grVar.e0 = MessagesController.getInstance(grVar.currentAccount).getInputPeer(MessageObject.getPeerId(grVar.d0));
        grVar.c0 = true;
        grVar.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final void dismissInternal() {
        super.dismissInternal();
        TLRPC.InputPeer inputPeer = this.e0;
        if (inputPeer != null) {
            this.X.a(inputPeer, this.Y.size() > 1, this.c0, false);
        }
    }

    @Override // org.telegram.ui.Components.za
    public final ll0 v(ml0 ml0Var) {
        return new er(this);
    }

    @Override // org.telegram.ui.Components.za
    public final CharSequence y() {
        return this.b0 ? LocaleController.getString(R.string.StartVoipChannelTitle) : LocaleController.getString(R.string.StartVoipChatTitle);
    }
}
