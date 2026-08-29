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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class yq extends il0 {
    public final /* synthetic */ ar c;

    public yq(ar arVar) {
        this.c = arVar;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        return n1Var.f == 3;
    }

    @Override // f2.p0
    public final int h() {
        ar arVar = this.c;
        return arVar.V ? arVar.U.size() + 3 : arVar.W ? 2 : 1;
    }

    @Override // f2.p0
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

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        int i11;
        TLObject chat;
        String str;
        int i12;
        int i13 = n1Var.f;
        View view = n1Var.a;
        if (i13 != 3) {
            if (i13 != 2) {
                if (i13 == 1) {
                    ((org.telegram.ui.Cells.y8) view).setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.VoipChatStreamWithAnotherApp), org.telegram.ui.ActionBar.g6.L6, 0, new rp(this, 3)), true, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
                    return;
                }
                return;
            } else {
                org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
                k4Var.setTextSize(15.0f);
                k4Var.setPadding(0, 0, 0, AndroidUtilities.dp(2.0f));
                k4Var.setText(LocaleController.getString(R.string.VoipChatDisplayedAs).replace(":", ""));
                return;
            }
        }
        ar arVar = this.c;
        TLRPC.Peer peer = (TLRPC.Peer) arVar.U.get(i10 - 3);
        long peerId = MessageObject.getPeerId(peer);
        if (peerId > 0) {
            i12 = ((org.telegram.ui.ActionBar.f3) arVar).currentAccount;
            chat = MessagesController.getInstance(i12).getUser(Long.valueOf(peerId));
            str = LocaleController.getString(R.string.VoipGroupPersonalAccount);
        } else {
            i11 = ((org.telegram.ui.ActionBar.f3) arVar).currentAccount;
            chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerId));
            str = null;
        }
        org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) view;
        e4Var.e(chat, null, str, i10 != h() - 1);
        e4Var.c(peer == arVar.Z, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.c6 c6Var;
        FrameLayout frameLayout;
        Context context = viewGroup.getContext();
        ar arVar = this.c;
        if (i10 == 1) {
            org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context);
            int i11 = org.telegram.ui.ActionBar.g6.a7;
            c6Var = ((org.telegram.ui.ActionBar.f3) arVar).resourcesProvider;
            y8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
            y8Var.setTopPadding(17);
            y8Var.setBottomPadding(17);
            frameLayout = y8Var;
        } else if (i10 == 2) {
            frameLayout = new org.telegram.ui.Cells.k4(context, 22);
        } else if (i10 != 3) {
            boolean z10 = arVar.X;
            ?? zqVar = new zq(context);
            zqVar.setOrientation(1);
            aj0 aj0Var = new aj0(context);
            aj0Var.setAutoRepeat(true);
            aj0Var.f(R.raw.utyan_schedule, 112, 112, null);
            aj0Var.d();
            zqVar.addView(aj0Var, i7.f6.t(112, 112, 49, 0, 24, 0, 0));
            TextView textView = new TextView(context);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(z10 ? LocaleController.formatString(R.string.StartVoipChannelTitle, new Object[0]) : LocaleController.formatString(R.string.StartVoipChatTitle, new Object[0]));
            textView.setTextSize(1, 20.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
            zqVar.addView(textView, i7.f6.t(-2, -2, 1, 0, 14, 0, 7));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(1);
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.j5, false));
            textView2.setText(z10 ? LocaleController.formatString(R.string.VoipChannelStart2, new Object[0]) : LocaleController.formatString(R.string.VoipGroupStart2, new Object[0]));
            textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
            zqVar.addView(textView2, i7.f6.t(-2, -2, 1, 28, 0, 28, 17));
            frameLayout = zqVar;
        } else {
            frameLayout = new org.telegram.ui.Cells.e4(context, 1, 0, false);
        }
        frameLayout.setLayoutParams(new f2.x0(-1, -2));
        return new vk0(frameLayout);
    }
}
