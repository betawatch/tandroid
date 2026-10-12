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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ur extends db {
    public final u80 X;
    public final ArrayList Y;
    public final boolean Z;
    public final boolean a0;
    public final boolean b0;
    public boolean c0;
    public TLRPC.Peer d0;
    public TLRPC.InputPeer e0;
    public final org.telegram.ui.ActionBar.m2 f0;
    public final long g0;

    public ur(org.telegram.ui.ActionBar.m2 m2Var, ArrayList arrayList, long j10, u80 u80Var) {
        super(m2Var, false);
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
        this.f0 = m2Var;
        this.g0 = j10;
        this.v = 0.26f;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.Y = arrayList2;
        this.X = u80Var;
        boolean isChannelOrGiga = ChatObject.isChannelOrGiga(chat);
        this.b0 = isChannelOrGiga;
        this.d0 = (TLRPC.Peer) arrayList2.get(0);
        this.Z = arrayList2.size() > 1;
        this.a0 = ChatObject.canManageCalls(chat);
        Context context = this.containerView.getContext();
        this.containerView.addView(new di.ab(this, context, 16), w7.a6.a(120.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 80));
        TextView textView = new TextView(context);
        textView.setGravity(17);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(isChannelOrGiga ? LocaleController.formatString(R.string.VoipChannelStartVoiceChat, new Object[0]) : LocaleController.formatString(R.string.VoipGroupStartVoiceChat, new Object[0]));
        textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Sh, false));
        int dp = AndroidUtilities.dp(8.0f);
        int i10 = org.telegram.ui.ActionBar.g6.Oh;
        int x02 = org.telegram.ui.ActionBar.g6.x0(null, i10, false);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.d6, false), 120);
        textView.setBackground(org.telegram.ui.ActionBar.g6.j0(dp, dp, dp, dp, x02, k10, k10));
        this.containerView.addView(textView, w7.a6.a(48.0f, 16.0f, 0.0f, 16.0f, 60.0f, -1, 80));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(isChannelOrGiga ? LocaleController.formatString(R.string.VoipChannelScheduleVoiceChat, new Object[0]) : LocaleController.formatString(R.string.VoipGroupScheduleVoiceChat, new Object[0]));
        textView2.setLetterSpacing(0.025f);
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i10, false));
        int dp2 = AndroidUtilities.dp(8.0f);
        int k11 = i0.a.k(org.telegram.ui.ActionBar.g6.x0(null, i10, false), 120);
        textView2.setBackground(org.telegram.ui.ActionBar.g6.j0(dp2, dp2, dp2, dp2, 0, k11, k11));
        this.containerView.addView(textView2, w7.a6.a(48.0f, 16.0f, 0.0f, 16.0f, 6.0f, -1, 80));
        final int i11 = 0;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.rr
            public final /* synthetic */ ur b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        ur.Q(this.b);
                        break;
                    default:
                        ur.R(this.b);
                        break;
                }
            }
        });
        final int i12 = 1;
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.rr
            public final /* synthetic */ ur b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        ur.Q(this.b);
                        break;
                    default:
                        ur.R(this.b);
                        break;
                }
            }
        });
        mm0 mm0Var = this.d;
        int i13 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i13, 0, i13, AndroidUtilities.dp(120.0f));
        this.d.setOnItemClickListener(new j(this, 4));
        fixNavigationBar();
        O();
    }

    public static /* synthetic */ void Q(ur urVar) {
        urVar.e0 = MessagesController.getInstance(urVar.currentAccount).getInputPeer(MessageObject.getPeerId(urVar.d0));
        urVar.dismiss();
    }

    public static /* synthetic */ void R(ur urVar) {
        urVar.e0 = MessagesController.getInstance(urVar.currentAccount).getInputPeer(MessageObject.getPeerId(urVar.d0));
        urVar.c0 = true;
        urVar.dismiss();
    }

    @Override // org.telegram.ui.Components.db
    public final CharSequence A() {
        return this.b0 ? LocaleController.getString(R.string.StartVoipChannelTitle) : LocaleController.getString(R.string.StartVoipChatTitle);
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final void dismissInternal() {
        super.dismissInternal();
        TLRPC.InputPeer inputPeer = this.e0;
        if (inputPeer != null) {
            this.X.a(inputPeer, this.Y.size() > 1, this.c0, false);
        }
    }

    @Override // org.telegram.ui.Components.db
    public final lm0 x(mm0 mm0Var) {
        return new sr(this);
    }
}
