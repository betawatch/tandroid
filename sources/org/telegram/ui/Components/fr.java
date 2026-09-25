package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class fr extends vl0 {
    public final /* synthetic */ hr c;

    public fr(hr hrVar) {
        this.c = hrVar;
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 3;
    }

    @Override // s4.h0
    public final int h() {
        hr hrVar = this.c;
        return hrVar.Z ? hrVar.Y.size() + 3 : hrVar.a0 ? 2 : 1;
    }

    @Override // s4.h0
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2) {
                return 3;
            }
        }
        return i11;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        TLObject chat;
        String str;
        int i12;
        int i13 = c1Var.f;
        View view = c1Var.a;
        if (i13 != 3) {
            if (i13 != 2) {
                if (i13 == 1) {
                    ((org.telegram.ui.Cells.e9) view).setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.VoipChatStreamWithAnotherApp), org.telegram.ui.ActionBar.h6.L6, 0, new yp(this, 3)), true, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
                    return;
                }
                return;
            } else {
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                m4Var.setTextSize(15.0f);
                m4Var.setPadding(0, 0, 0, AndroidUtilities.dp(2.0f));
                m4Var.setText(LocaleController.getString(R.string.VoipChatDisplayedAs).replace(":", ""));
                return;
            }
        }
        hr hrVar = this.c;
        TLRPC.Peer peer = (TLRPC.Peer) hrVar.Y.get(i10 - 3);
        long peerId = MessageObject.getPeerId(peer);
        if (peerId > 0) {
            i12 = ((org.telegram.ui.ActionBar.e3) hrVar).currentAccount;
            chat = MessagesController.getInstance(i12).getUser(Long.valueOf(peerId));
            str = LocaleController.getString(R.string.VoipGroupPersonalAccount);
        } else {
            i11 = ((org.telegram.ui.ActionBar.e3) hrVar).currentAccount;
            chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerId));
            str = null;
        }
        org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
        g4Var.e(chat, null, str, i10 != h() - 1);
        g4Var.c(peer == hrVar.d0, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.d6 d6Var;
        FrameLayout frameLayout;
        Context context = viewGroup.getContext();
        hr hrVar = this.c;
        if (i10 == 1) {
            org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context);
            int i11 = org.telegram.ui.ActionBar.h6.a7;
            d6Var = ((org.telegram.ui.ActionBar.e3) hrVar).resourcesProvider;
            e9Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
            e9Var.setTopPadding(17);
            e9Var.setBottomPadding(17);
            frameLayout = e9Var;
        } else if (i10 == 2) {
            frameLayout = new org.telegram.ui.Cells.m4(context, 22);
        } else if (i10 != 3) {
            boolean z10 = hrVar.b0;
            ?? grVar = new gr(context);
            grVar.setOrientation(1);
            lj0 lj0Var = new lj0(context);
            lj0Var.setAutoRepeat(true);
            lj0Var.f(R.raw.utyan_schedule, 112, 112, null);
            lj0Var.d();
            grVar.addView(lj0Var, w7.y5.t(112, 112, 49, 0, 24, 0, 0));
            TextView textView = new TextView(context);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(z10 ? LocaleController.formatString(R.string.StartVoipChannelTitle, new Object[0]) : LocaleController.formatString(R.string.StartVoipChatTitle, new Object[0]));
            textView.setTextSize(1, 20.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.G6, false));
            grVar.addView(textView, w7.y5.t(-2, -2, 1, 0, 14, 0, 7));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(1);
            textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.j5, false));
            textView2.setText(z10 ? LocaleController.formatString(R.string.VoipChannelStart2, new Object[0]) : LocaleController.formatString(R.string.VoipGroupStart2, new Object[0]));
            textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
            grVar.addView(textView2, w7.y5.t(-2, -2, 1, 28, 0, 28, 17));
            frameLayout = grVar;
        } else {
            frameLayout = new org.telegram.ui.Cells.g4(context, 1, 0, false);
        }
        frameLayout.setLayoutParams(new s4.p0(-1, -2));
        return new gl0(frameLayout);
    }
}
