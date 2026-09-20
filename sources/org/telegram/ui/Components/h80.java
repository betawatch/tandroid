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

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public abstract class h80 extends org.telegram.ui.ActionBar.f3 {
    public boolean b;

    public h80(Context context, TLRPC.Chat chat) {
        super(context, true);
        int i10 = 0;
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        setCustomView(linearLayout);
        v9 v9Var = new v9(context);
        v9Var.setRoundRadius(AndroidUtilities.dp(45.0f));
        linearLayout.addView(v9Var, w7.y5.t(90, 90, 49, 0, 29, 0, 0));
        v9Var.e(chat, new g9(chat));
        TextView textView = new TextView(context);
        org.telegram.messenger.rk.k(18.0f, 1, textView);
        com.google.android.gms.internal.vision.e2.p(org.telegram.ui.ActionBar.j6.j5, null, false, textView, 1);
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, w7.y5.t(-2, -2, 49, 17, 24, 17, 0), context);
        h.setTextSize(1, 14.0f);
        com.google.android.gms.internal.vision.e2.p(org.telegram.ui.ActionBar.j6.r5, null, false, h, 1);
        linearLayout.addView(h, w7.y5.t(-2, -2, 49, 30, 8, 30, 0));
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
        g80 g80Var = new g80(context);
        View view = new View(context);
        view.setBackground(org.telegram.ui.ActionBar.y5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.j6.Oh));
        g80Var.addView(view, w7.y5.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(context);
        g80Var.a = textView2;
        textView2.setLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setGravity(17);
        org.telegram.messenger.l0.p(textView2, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false), 1, 14.0f);
        g80Var.addView(textView2, w7.y5.e(-2, -2, 17));
        g80Var.setBackground(null);
        if (ChatObject.isChannelOrGiga(chat)) {
            g80Var.setText(LocaleController.getString(R.string.VoipChannelJoinVoiceChatUrl));
        } else {
            g80Var.setText(LocaleController.getString(R.string.VoipGroupJoinVoiceChatUrl));
        }
        view.setOnClickListener(new f80(this, i10));
        linearLayout.addView(g80Var, w7.y5.t(-1, 50, 51, 0, 30, 0, 0));
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
