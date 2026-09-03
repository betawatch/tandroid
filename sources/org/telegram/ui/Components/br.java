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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class br extends ql0 {
    public final /* synthetic */ dr c;

    public br(dr drVar) {
        this.c = drVar;
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        return l1Var.f == 3;
    }

    @Override // f2.o0
    public final int h() {
        dr drVar = this.c;
        return drVar.W ? drVar.V.size() + 3 : drVar.X ? 2 : 1;
    }

    @Override // f2.o0
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

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        int i11;
        TLObject chat;
        String str;
        int i12;
        int i13 = l1Var.f;
        View view = l1Var.a;
        if (i13 != 3) {
            if (i13 != 2) {
                if (i13 == 1) {
                    ((org.telegram.ui.Cells.z8) view).setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.VoipChatStreamWithAnotherApp), org.telegram.ui.ActionBar.j6.L6, 0, new up(this, 3)), true, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
                    return;
                }
                return;
            } else {
                org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
                l4Var.setTextSize(15.0f);
                l4Var.setPadding(0, 0, 0, AndroidUtilities.dp(2.0f));
                l4Var.setText(LocaleController.getString(R.string.VoipChatDisplayedAs).replace(":", ""));
                return;
            }
        }
        dr drVar = this.c;
        TLRPC.Peer peer = (TLRPC.Peer) drVar.V.get(i10 - 3);
        long peerId = MessageObject.getPeerId(peer);
        if (peerId > 0) {
            i12 = ((org.telegram.ui.ActionBar.g3) drVar).currentAccount;
            chat = MessagesController.getInstance(i12).getUser(Long.valueOf(peerId));
            str = LocaleController.getString(R.string.VoipGroupPersonalAccount);
        } else {
            i11 = ((org.telegram.ui.ActionBar.g3) drVar).currentAccount;
            chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerId));
            str = null;
        }
        org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
        f4Var.e(chat, null, str, i10 != h() - 1);
        f4Var.c(peer == drVar.a0, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.f6 f6Var;
        FrameLayout frameLayout;
        Context context = viewGroup.getContext();
        dr drVar = this.c;
        if (i10 == 1) {
            org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context);
            int i11 = org.telegram.ui.ActionBar.j6.a7;
            f6Var = ((org.telegram.ui.ActionBar.g3) drVar).resourcesProvider;
            z8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
            z8Var.setTopPadding(17);
            z8Var.setBottomPadding(17);
            frameLayout = z8Var;
        } else if (i10 == 2) {
            frameLayout = new org.telegram.ui.Cells.l4(context, 22);
        } else if (i10 != 3) {
            boolean z4 = drVar.Y;
            ?? crVar = new cr(context);
            crVar.setOrientation(1);
            jj0 jj0Var = new jj0(context);
            jj0Var.setAutoRepeat(true);
            jj0Var.f(R.raw.utyan_schedule, 112, 112, null);
            jj0Var.d();
            crVar.addView(jj0Var, k7.b6.t(112, 112, 49, 0, 24, 0, 0));
            TextView textView = new TextView(context);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(z4 ? LocaleController.formatString(R.string.StartVoipChannelTitle, new Object[0]) : LocaleController.formatString(R.string.StartVoipChatTitle, new Object[0]));
            textView.setTextSize(1, 20.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
            crVar.addView(textView, k7.b6.t(-2, -2, 1, 0, 14, 0, 7));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(1);
            textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false));
            textView2.setText(z4 ? LocaleController.formatString(R.string.VoipChannelStart2, new Object[0]) : LocaleController.formatString(R.string.VoipGroupStart2, new Object[0]));
            textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
            crVar.addView(textView2, k7.b6.t(-2, -2, 1, 28, 0, 28, 17));
            frameLayout = crVar;
        } else {
            frameLayout = new org.telegram.ui.Cells.f4(context, 1, 0, false);
        }
        frameLayout.setLayoutParams(new f2.w0(-1, -2));
        return new dl0(frameLayout);
    }
}
