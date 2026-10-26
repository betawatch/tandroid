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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class rr extends lm0 {
    public final /* synthetic */ tr c;

    public rr(tr trVar) {
        this.c = trVar;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.e1 e1Var) {
        return e1Var.f == 3;
    }

    @Override // s4.h0
    public final int h() {
        tr trVar = this.c;
        return trVar.Z ? trVar.Y.size() + 3 : trVar.a0 ? 2 : 1;
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
    public final void v(s4.e1 e1Var, int i10) {
        int i11;
        TLObject chat;
        String str;
        int i12;
        int i13 = e1Var.f;
        View view = e1Var.a;
        if (i13 != 3) {
            if (i13 != 2) {
                if (i13 == 1) {
                    ((org.telegram.ui.Cells.i9) view).setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.VoipChatStreamWithAnotherApp), org.telegram.ui.ActionBar.y6.L6, 0, new bq(this, 4)), true, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
                    return;
                }
                return;
            } else {
                org.telegram.ui.Cells.q4 q4Var = (org.telegram.ui.Cells.q4) view;
                q4Var.setTextSize(15.0f);
                q4Var.setPadding(0, 0, 0, AndroidUtilities.dp(2.0f));
                q4Var.setText(LocaleController.getString(R.string.VoipChatDisplayedAs).replace(":", ""));
                return;
            }
        }
        tr trVar = this.c;
        TLRPC.Peer peer = (TLRPC.Peer) trVar.Y.get(i10 - 3);
        long peerId = MessageObject.getPeerId(peer);
        if (peerId > 0) {
            i12 = ((org.telegram.ui.ActionBar.k3) trVar).currentAccount;
            chat = MessagesController.getInstance(i12).getUser(Long.valueOf(peerId));
            str = LocaleController.getString(R.string.VoipGroupPersonalAccount);
        } else {
            i11 = ((org.telegram.ui.ActionBar.k3) trVar).currentAccount;
            chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerId));
            str = null;
        }
        org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
        k4Var.e(chat, null, str, i10 != h() - 1);
        k4Var.c(peer == trVar.d0, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.u6 u6Var;
        FrameLayout frameLayout;
        Context context = viewGroup.getContext();
        tr trVar = this.c;
        if (i10 == 1) {
            org.telegram.ui.Cells.i9 i9Var = new org.telegram.ui.Cells.i9(context);
            int i11 = org.telegram.ui.ActionBar.y6.a7;
            u6Var = ((org.telegram.ui.ActionBar.k3) trVar).resourcesProvider;
            org.telegram.ui.ActionBar.f7.i(i11, i9Var, u6Var);
            i9Var.setTopPadding(17);
            i9Var.setBottomPadding(17);
            frameLayout = i9Var;
        } else if (i10 == 2) {
            frameLayout = new org.telegram.ui.Cells.q4(context, 22);
        } else if (i10 != 3) {
            boolean z10 = trVar.b0;
            ?? srVar = new sr(context);
            srVar.setOrientation(1);
            ak0 ak0Var = new ak0(context);
            ak0Var.setAutoRepeat(true);
            ak0Var.f(R.raw.utyan_schedule, 112, 112, null);
            ak0Var.d();
            srVar.addView(ak0Var, gb1.x(112, 112, 49, 0, 24, 0, 0));
            TextView textView = new TextView(context);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(z10 ? LocaleController.formatString(R.string.StartVoipChannelTitle, new Object[0]) : LocaleController.formatString(R.string.StartVoipChatTitle, new Object[0]));
            textView.setTextSize(1, 20.0f);
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.G6, null);
            srVar.addView(textView, gb1.x(-2, -2, 1, 0, 14, 0, 7));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(1);
            org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.j5, null);
            textView2.setText(z10 ? LocaleController.formatString(R.string.VoipChannelStart2, new Object[0]) : LocaleController.formatString(R.string.VoipGroupStart2, new Object[0]));
            textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
            srVar.addView(textView2, gb1.x(-2, -2, 1, 28, 0, 28, 17));
            frameLayout = srVar;
        } else {
            frameLayout = new org.telegram.ui.Cells.k4(context, 1, 0, false);
        }
        frameLayout.setLayoutParams(new s4.q0(-1, -2));
        return new vl0(frameLayout);
    }
}
