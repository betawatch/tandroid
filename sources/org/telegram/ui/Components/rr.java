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

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class rr extends bb {
    public final p80 X;
    public final ArrayList Y;
    public final boolean Z;
    public final boolean a0;
    public final boolean b0;
    public boolean c0;
    public TLRPC.Peer d0;
    public TLRPC.InputPeer e0;
    public final org.telegram.ui.ActionBar.n2 f0;
    public final long g0;

    public rr(org.telegram.ui.ActionBar.n2 n2Var, ArrayList arrayList, long j10, p80 p80Var) {
        super(n2Var, false);
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
        this.f0 = n2Var;
        this.g0 = j10;
        this.v = 0.26f;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.Y = arrayList2;
        this.X = p80Var;
        boolean isChannelOrGiga = ChatObject.isChannelOrGiga(chat);
        this.b0 = isChannelOrGiga;
        this.d0 = (TLRPC.Peer) arrayList2.get(0);
        this.Z = arrayList2.size() > 1;
        this.a0 = ChatObject.canManageCalls(chat);
        Context context = this.containerView.getContext();
        this.containerView.addView(new ai.ic(this, context, 17), w7.z5.d(-1, 120.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        textView.setGravity(17);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(isChannelOrGiga ? LocaleController.formatString(R.string.VoipChannelStartVoiceChat, new Object[0]) : LocaleController.formatString(R.string.VoipGroupStartVoiceChat, new Object[0]));
        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Sh, false));
        int dp = AndroidUtilities.dp(8.0f);
        int i10 = org.telegram.ui.ActionBar.h6.Oh;
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, i10, false);
        int o10 = i0.a.o(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false), 120);
        textView.setBackground(org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, x02, o10, o10));
        this.containerView.addView(textView, w7.z5.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 60.0f));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(isChannelOrGiga ? LocaleController.formatString(R.string.VoipChannelScheduleVoiceChat, new Object[0]) : LocaleController.formatString(R.string.VoipGroupScheduleVoiceChat, new Object[0]));
        textView2.setLetterSpacing(0.025f);
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        int dp2 = AndroidUtilities.dp(8.0f);
        int o11 = i0.a.o(org.telegram.ui.ActionBar.h6.x0(null, i10, false), 120);
        textView2.setBackground(org.telegram.ui.ActionBar.h6.j0(dp2, dp2, dp2, dp2, 0, o11, o11));
        this.containerView.addView(textView2, w7.z5.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 6.0f));
        final int i11 = 0;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.or
            public final /* synthetic */ rr b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        rr.Q(this.b);
                        break;
                    default:
                        rr.R(this.b);
                        break;
                }
            }
        });
        final int i12 = 1;
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.or
            public final /* synthetic */ rr b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        rr.Q(this.b);
                        break;
                    default:
                        rr.R(this.b);
                        break;
                }
            }
        });
        im0 im0Var = this.d;
        int i13 = this.backgroundPaddingLeft;
        im0Var.setPadding(i13, 0, i13, AndroidUtilities.dp(120.0f));
        this.d.setOnItemClickListener(new j(this, 4));
        fixNavigationBar();
        O();
    }

    public static /* synthetic */ void Q(rr rrVar) {
        rrVar.e0 = MessagesController.getInstance(rrVar.currentAccount).getInputPeer(MessageObject.getPeerId(rrVar.d0));
        rrVar.dismiss();
    }

    public static /* synthetic */ void R(rr rrVar) {
        rrVar.e0 = MessagesController.getInstance(rrVar.currentAccount).getInputPeer(MessageObject.getPeerId(rrVar.d0));
        rrVar.c0 = true;
        rrVar.dismiss();
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence A() {
        return this.b0 ? LocaleController.getString(R.string.StartVoipChannelTitle) : LocaleController.getString(R.string.StartVoipChatTitle);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        super.dismissInternal();
        TLRPC.InputPeer inputPeer = this.e0;
        if (inputPeer != null) {
            this.X.a(inputPeer, this.Y.size() > 1, this.c0, false);
        }
    }

    @Override // org.telegram.ui.Components.bb
    public final hm0 x(im0 im0Var) {
        return new pr(this);
    }
}
