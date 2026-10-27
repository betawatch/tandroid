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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class tr extends bb {
    public final s80 X;
    public final ArrayList Y;
    public final boolean Z;
    public final boolean a0;
    public final boolean b0;
    public boolean c0;
    public TLRPC.Peer d0;
    public TLRPC.InputPeer e0;
    public final org.telegram.ui.ActionBar.r2 f0;
    public final long g0;

    public tr(org.telegram.ui.ActionBar.r2 r2Var, ArrayList arrayList, long j10, s80 s80Var) {
        super(r2Var, false);
        boolean z10;
        String formatString;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
        this.f0 = r2Var;
        this.g0 = j10;
        this.v = 0.26f;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.Y = arrayList2;
        this.X = s80Var;
        boolean isChannelOrGiga = ChatObject.isChannelOrGiga(chat);
        this.b0 = isChannelOrGiga;
        this.d0 = (TLRPC.Peer) arrayList2.get(0);
        this.Z = arrayList2.size() > 1;
        this.a0 = ChatObject.canManageCalls(chat);
        Context context = this.containerView.getContext();
        this.containerView.addView(new bi.cc(this, context, 16), kb1.h(-1, 120.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        textView.setGravity(17);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(isChannelOrGiga ? LocaleController.formatString(R.string.VoipChannelStartVoiceChat, new Object[0]) : LocaleController.formatString(R.string.VoipGroupStartVoiceChat, new Object[0]));
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.Sh, null);
        int dp = AndroidUtilities.dp(8.0f);
        int i10 = org.telegram.ui.ActionBar.y6.Oh;
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, i10, false);
        int i11 = org.telegram.ui.ActionBar.y6.d6;
        int o10 = i0.a.o(org.telegram.ui.ActionBar.y6.x0(null, i11, false), 120);
        org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, x02, o10, o10);
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i10);
        org.telegram.ui.ActionBar.b7 h = org.telegram.ui.ActionBar.f7.h(i11, 120);
        textView.setBackground(j02);
        org.telegram.ui.ActionBar.f7.k(textView, j02, N, h, null);
        this.containerView.addView(textView, kb1.h(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 60.0f));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        if (isChannelOrGiga) {
            z10 = false;
            formatString = LocaleController.formatString(R.string.VoipChannelScheduleVoiceChat, new Object[0]);
        } else {
            z10 = false;
            formatString = LocaleController.formatString(R.string.VoipGroupScheduleVoiceChat, new Object[0]);
        }
        textView2.setText(formatString);
        textView2.setLetterSpacing(0.025f);
        org.telegram.ui.ActionBar.f7.V(textView2, i10, null);
        int dp2 = AndroidUtilities.dp(8.0f);
        int o11 = i0.a.o(org.telegram.ui.ActionBar.y6.x0(null, i10, z10), 120);
        org.telegram.ui.Cells.y j03 = org.telegram.ui.ActionBar.y6.j0(dp2, dp2, dp2, dp2, 0, o11, o11);
        org.telegram.ui.ActionBar.b7 h10 = org.telegram.ui.ActionBar.f7.h(i10, 120);
        textView2.setBackground(j03);
        org.telegram.ui.ActionBar.f7.k(textView2, j03, null, h10, null);
        this.containerView.addView(textView2, kb1.h(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 6.0f));
        final int i12 = 0;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.qr
            public final /* synthetic */ tr b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        tr.P(this.b);
                        break;
                    default:
                        tr.Q(this.b);
                        break;
                }
            }
        });
        final int i13 = 1;
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.qr
            public final /* synthetic */ tr b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        tr.P(this.b);
                        break;
                    default:
                        tr.Q(this.b);
                        break;
                }
            }
        });
        nm0 nm0Var = this.d;
        int i14 = this.backgroundPaddingLeft;
        nm0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(120.0f));
        this.d.setOnItemClickListener(new j(this, 4));
        fixNavigationBar();
        N();
    }

    public static /* synthetic */ void P(tr trVar) {
        trVar.e0 = MessagesController.getInstance(trVar.currentAccount).getInputPeer(MessageObject.getPeerId(trVar.d0));
        trVar.dismiss();
    }

    public static /* synthetic */ void Q(tr trVar) {
        trVar.e0 = MessagesController.getInstance(trVar.currentAccount).getInputPeer(MessageObject.getPeerId(trVar.d0));
        trVar.c0 = true;
        trVar.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void dismissInternal() {
        super.dismissInternal();
        TLRPC.InputPeer inputPeer = this.e0;
        if (inputPeer != null) {
            this.X.a(inputPeer, this.Y.size() > 1, this.c0, false);
        }
    }

    @Override // org.telegram.ui.Components.bb
    public final mm0 v(nm0 nm0Var) {
        return new rr(this);
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence y() {
        return this.b0 ? LocaleController.getString(R.string.StartVoipChannelTitle) : LocaleController.getString(R.string.StartVoipChatTitle);
    }
}
