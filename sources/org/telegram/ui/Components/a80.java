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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public abstract class a80 extends org.telegram.ui.ActionBar.f3 {
    public boolean b;

    public a80(Context context, TLRPC.Chat chat) {
        super(context, true);
        int i10 = 0;
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        setCustomView(linearLayout);
        w9 w9Var = new w9(context);
        w9Var.setRoundRadius(AndroidUtilities.dp(45.0f));
        linearLayout.addView(w9Var, w7.x5.t(90, 90, 49, 0, 29, 0, 0));
        w9Var.e(chat, new h9(chat));
        TextView textView = new TextView(context);
        org.telegram.messenger.ul.k(18.0f, 1, textView);
        com.google.android.gms.internal.vision.e2.p(org.telegram.ui.ActionBar.h6.j5, null, false, textView, 1);
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, w7.x5.t(-2, -2, 49, 17, 24, 17, 0), context);
        h.setTextSize(1, 14.0f);
        com.google.android.gms.internal.vision.e2.p(org.telegram.ui.ActionBar.h6.r5, null, false, h, 1);
        linearLayout.addView(h, w7.x5.t(-2, -2, 49, 30, 8, 30, 0));
        ChatObject.Call groupCall = AccountInstance.getInstance(this.currentAccount).getMessagesController().getGroupCall(chat.id, false);
        if (groupCall != null) {
            if (TextUtils.isEmpty(groupCall.call.title)) {
                textView.setText(chat.title);
            } else {
                textView.setText(groupCall.call.title);
            }
            int i11 = groupCall.call.participants_count;
            if (i11 == 0) {
                h.setText(LocaleController.getString(R.string.NoOneJoinedYet));
            } else {
                h.setText(LocaleController.formatPluralString("Participants", i11, new Object[0]));
            }
        } else {
            textView.setText(chat.title);
            h.setText(LocaleController.getString(R.string.NoOneJoinedYet));
        }
        z70 z70Var = new z70(context);
        View view = new View(context);
        view.setBackground(org.telegram.ui.ActionBar.x5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.h6.Oh));
        z70Var.addView(view, w7.x5.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(context);
        z70Var.a = textView2;
        textView2.setLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setGravity(17);
        org.telegram.messenger.z0.q(textView2, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Sh, false), 1, 14.0f);
        z70Var.addView(textView2, w7.x5.e(-2, -2, 17));
        z70Var.setBackground(null);
        if (ChatObject.isChannelOrGiga(chat)) {
            z70Var.setText(LocaleController.getString(R.string.VoipChannelJoinVoiceChatUrl));
        } else {
            z70Var.setText(LocaleController.getString(R.string.VoipGroupJoinVoiceChatUrl));
        }
        view.setOnClickListener(new y70(this, i10));
        linearLayout.addView(z70Var, w7.x5.t(-1, 50, 51, 0, 30, 0, 0));
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
