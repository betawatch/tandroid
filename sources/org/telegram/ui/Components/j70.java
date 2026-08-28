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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class j70 extends org.telegram.ui.ActionBar.f3 {
    public boolean b;

    public j70(Context context, TLRPC.Chat chat) {
        super(context, true);
        int i9 = 0;
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        setCustomView(linearLayout);
        o9 o9Var = new o9(context);
        o9Var.setRoundRadius(AndroidUtilities.dp(45.0f));
        linearLayout.addView(o9Var, g7.e6.t(90, 90, 49, 0, 29, 0, 0));
        o9Var.e(chat, new z8(chat));
        TextView textView = new TextView(context);
        org.telegram.messenger.ll.k(18.0f, 1, textView);
        j3.r0.w(org.telegram.ui.ActionBar.f6.j5, null, false, textView, 1);
        TextView h = j3.r0.h(linearLayout, textView, g7.e6.t(-2, -2, 49, 17, 24, 17, 0), context);
        h.setTextSize(1, 14.0f);
        j3.r0.w(org.telegram.ui.ActionBar.f6.r5, null, false, h, 1);
        linearLayout.addView(h, g7.e6.t(-2, -2, 49, 30, 8, 30, 0));
        ChatObject.Call groupCall = AccountInstance.getInstance(this.currentAccount).getMessagesController().getGroupCall(chat.id, false);
        if (groupCall != null) {
            if (TextUtils.isEmpty(groupCall.call.title)) {
                textView.setText(chat.title);
            } else {
                textView.setText(groupCall.call.title);
            }
            int i10 = groupCall.call.participants_count;
            if (i10 == 0) {
                h.setText(LocaleController.getString(R.string.NoOneJoinedYet));
            } else {
                h.setText(LocaleController.formatPluralString("Participants", i10, new Object[0]));
            }
        } else {
            textView.setText(chat.title);
            h.setText(LocaleController.getString(R.string.NoOneJoinedYet));
        }
        i70 i70Var = new i70(context);
        View view = new View(context);
        view.setBackground(org.telegram.ui.ActionBar.v5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.f6.Oh));
        i70Var.addView(view, g7.e6.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(context);
        i70Var.a = textView2;
        textView2.setLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setGravity(17);
        org.telegram.messenger.l0.q(textView2, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sh, false), 1, 14.0f);
        i70Var.addView(textView2, g7.e6.e(-2, -2, 17));
        i70Var.setBackground(null);
        if (ChatObject.isChannelOrGiga(chat)) {
            i70Var.setText(LocaleController.getString(R.string.VoipChannelJoinVoiceChatUrl));
        } else {
            i70Var.setText(LocaleController.getString(R.string.VoipGroupJoinVoiceChatUrl));
        }
        view.setOnClickListener(new h70(this, i9));
        linearLayout.addView(i70Var, g7.e6.t(-1, 50, 51, 0, 30, 0, 0));
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        super.dismissInternal();
        if (this.b) {
            m();
        }
    }

    public abstract void m();
}
