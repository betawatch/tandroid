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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public abstract class b80 extends org.telegram.ui.ActionBar.g3 {
    public boolean b;

    public b80(Context context, TLRPC.Chat chat) {
        super(context, true);
        int i10 = 0;
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        setCustomView(linearLayout);
        p9 p9Var = new p9(context);
        p9Var.setRoundRadius(AndroidUtilities.dp(45.0f));
        linearLayout.addView(p9Var, k7.b6.t(90, 90, 49, 0, 29, 0, 0));
        p9Var.e(chat, new z8(chat));
        TextView textView = new TextView(context);
        org.telegram.ui.b.g(18.0f, 1, textView);
        org.telegram.ui.yh.t(org.telegram.ui.ActionBar.j6.j5, null, false, textView, 1);
        TextView j10 = org.telegram.ui.yh.j(linearLayout, textView, k7.b6.t(-2, -2, 49, 17, 24, 17, 0), context);
        j10.setTextSize(1, 14.0f);
        org.telegram.ui.yh.t(org.telegram.ui.ActionBar.j6.r5, null, false, j10, 1);
        linearLayout.addView(j10, k7.b6.t(-2, -2, 49, 30, 8, 30, 0));
        ChatObject.Call groupCall = AccountInstance.getInstance(this.currentAccount).getMessagesController().getGroupCall(chat.id, false);
        if (groupCall != null) {
            if (TextUtils.isEmpty(groupCall.call.title)) {
                textView.setText(chat.title);
            } else {
                textView.setText(groupCall.call.title);
            }
            int i11 = groupCall.call.participants_count;
            if (i11 == 0) {
                j10.setText(LocaleController.getString(R.string.NoOneJoinedYet));
            } else {
                j10.setText(LocaleController.formatPluralString("Participants", i11, new Object[0]));
            }
        } else {
            textView.setText(chat.title);
            j10.setText(LocaleController.getString(R.string.NoOneJoinedYet));
        }
        a80 a80Var = new a80(context);
        View view = new View(context);
        view.setBackground(org.telegram.ui.ActionBar.z5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.j6.Oh));
        a80Var.addView(view, k7.b6.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(context);
        a80Var.a = textView2;
        textView2.setLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setGravity(17);
        org.telegram.messenger.y3.t(textView2, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false), 1, 14.0f);
        a80Var.addView(textView2, k7.b6.e(-2, -2, 17));
        a80Var.setBackground(null);
        if (ChatObject.isChannelOrGiga(chat)) {
            a80Var.setText(LocaleController.getString(R.string.VoipChannelJoinVoiceChatUrl));
        } else {
            a80Var.setText(LocaleController.getString(R.string.VoipGroupJoinVoiceChatUrl));
        }
        view.setOnClickListener(new z70(this, i10));
        linearLayout.addView(a80Var, k7.b6.t(-1, 50, 51, 0, 30, 0, 0));
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final void dismissInternal() {
        super.dismissInternal();
        if (this.b) {
            m();
        }
    }

    public abstract void m();
}
