package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public abstract class d80 extends org.telegram.ui.ActionBar.h3 {
    public boolean b;

    public d80(Context context, TLRPC.Chat chat) {
        super(context, true);
        int i10 = 0;
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        setCustomView(linearLayout);
        p9 p9Var = new p9(context);
        p9Var.setRoundRadius(AndroidUtilities.dp(45.0f));
        linearLayout.addView(p9Var, k7.c6.t(90, 90, 49, 0, 29, 0, 0));
        p9Var.e(chat, new z8(chat));
        TextView textView = new TextView(context);
        org.telegram.ui.b.g(18.0f, 1, textView);
        org.telegram.ui.yh.t(org.telegram.ui.ActionBar.k6.j5, null, false, textView, 1);
        TextView i11 = org.telegram.ui.yh.i(linearLayout, textView, k7.c6.t(-2, -2, 49, 17, 24, 17, 0), context);
        i11.setTextSize(1, 14.0f);
        org.telegram.ui.yh.t(org.telegram.ui.ActionBar.k6.r5, null, false, i11, 1);
        linearLayout.addView(i11, k7.c6.t(-2, -2, 49, 30, 8, 30, 0));
        ChatObject.Call groupCall = AccountInstance.getInstance(this.currentAccount).getMessagesController().getGroupCall(chat.id, false);
        if (groupCall != null) {
            if (TextUtils.isEmpty(groupCall.call.title)) {
                textView.setText(chat.title);
            } else {
                textView.setText(groupCall.call.title);
            }
            int i12 = groupCall.call.participants_count;
            if (i12 == 0) {
                i11.setText(LocaleController.getString(R.string.NoOneJoinedYet));
            } else {
                i11.setText(LocaleController.formatPluralString("Participants", i12, new Object[0]));
            }
        } else {
            textView.setText(chat.title);
            i11.setText(LocaleController.getString(R.string.NoOneJoinedYet));
        }
        c80 c80Var = new c80(context);
        View view = new View(context);
        view.setBackground(org.telegram.ui.ActionBar.a6.f(new float[]{4.0f}, org.telegram.ui.ActionBar.k6.Oh));
        c80Var.addView(view, k7.c6.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(context);
        c80Var.a = textView2;
        textView2.setLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setGravity(17);
        org.telegram.messenger.y3.t(textView2, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Sh, false), 1, 14.0f);
        c80Var.addView(textView2, k7.c6.e(-2, -2, 17));
        c80Var.setBackground(null);
        if (ChatObject.isChannelOrGiga(chat)) {
            c80Var.setText(LocaleController.getString(R.string.VoipChannelJoinVoiceChatUrl));
        } else {
            c80Var.setText(LocaleController.getString(R.string.VoipGroupJoinVoiceChatUrl));
        }
        view.setOnClickListener(new b80(this, i10));
        linearLayout.addView(c80Var, k7.c6.t(-1, 50, 51, 0, 30, 0, 0));
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void dismissInternal() {
        super.dismissInternal();
        if (this.b) {
            m();
        }
    }

    public abstract void m();
}
