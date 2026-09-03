package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class pj0 extends FrameLayout {
    public final u00 a;
    public final TextView b;
    public final d9 c;
    public final ImageView d;
    public final p9 e;
    public final int f;
    public boolean h;
    public final ArrayList n;
    public final ArrayList r;
    public final MessageObject s;
    public int v;
    public q0.a w;

    public pj0(Context context, int i10, MessageObject messageObject) {
        super(context);
        this.n = new ArrayList();
        this.r = new ArrayList();
        this.f = i10;
        this.s = messageObject;
        u00 u00Var = new u00(context, null);
        this.a = u00Var;
        u00Var.f(org.telegram.ui.ActionBar.k6.G8, org.telegram.ui.ActionBar.k6.i6, -1);
        u00Var.setViewType(13);
        u00Var.setIsSingleCell(false);
        addView(u00Var, k7.c6.c(-1.0f, -2));
        TextView textView = new TextView(context);
        this.b = textView;
        org.telegram.ui.b.q(textView, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.E8, false), 1, 16.0f, 1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, k7.c6.i(-2.0f, -2.0f, 8388627, 40.0f, 0.0f, 62.0f, 0.0f));
        d9 d9Var = new d9(context, false);
        this.c = d9Var;
        d9Var.setStyle(11);
        d9Var.setAvatarsTextSize(AndroidUtilities.dp(22.0f));
        addView(d9Var, k7.c6.i(56.0f, -1.0f, 8388629, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        addView(imageView, k7.c6.i(24.0f, 24.0f, 8388627, 11.0f, 0.0f, 0.0f, 0.0f));
        Drawable mutate = context.getDrawable(R.drawable.msg_reactions).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.F8, false), PorterDuff.Mode.MULTIPLY));
        imageView.setImageDrawable(mutate);
        imageView.setVisibility(8);
        p9 p9Var = new p9(context);
        this.e = p9Var;
        addView(p9Var, k7.c6.i(24.0f, 24.0f, 8388627, 11.0f, 0.0f, 0.0f, 0.0f));
        textView.setAlpha(0.0f);
        d9Var.setAlpha(0.0f);
        setBackground(org.telegram.ui.ActionBar.k6.K0(false));
    }

    public final void a() {
        int i10 = this.f;
        MessagesController messagesController = MessagesController.getInstance(i10);
        TLRPC.TL_messages_getMessageReactionsList tL_messages_getMessageReactionsList = new TLRPC.TL_messages_getMessageReactionsList();
        MessageObject messageObject = this.s;
        tL_messages_getMessageReactionsList.peer = messagesController.getInputPeer(messageObject.getDialogId());
        tL_messages_getMessageReactionsList.id = messageObject.getId();
        tL_messages_getMessageReactionsList.limit = 3;
        tL_messages_getMessageReactionsList.reaction = null;
        tL_messages_getMessageReactionsList.offset = null;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getMessageReactionsList, new y1(this, 10), 64);
    }

    public List<oj0> getSeenUsers() {
        return this.n;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.f;
        MessagesController messagesController = MessagesController.getInstance(i10);
        MessageObject messageObject = this.s;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(messageObject.getChatId()));
        TLRPC.ChatFull chatFull = messagesController.getChatFull(messageObject.getChatId());
        if (chat == null || !messageObject.isOutOwner() || !messageObject.isSent() || messageObject.isEditing() || messageObject.isSending() || messageObject.isSendError() || messageObject.isContentUnread() || messageObject.isUnread() || ConnectionsManager.getInstance(i10).getCurrentTime() - messageObject.messageOwner.date >= 604800 || ((!ChatObject.isMegagroup(chat) && ChatObject.isChannel(chat)) || chatFull == null || chatFull.participants_count > MessagesController.getInstance(i10).chatReadMarkSizeThreshold || (messageObject.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
            a();
            return;
        }
        TLRPC.TL_messages_getMessageReadParticipants tL_messages_getMessageReadParticipants = new TLRPC.TL_messages_getMessageReadParticipants();
        tL_messages_getMessageReadParticipants.msg_id = messageObject.getId();
        tL_messages_getMessageReadParticipants.peer = MessagesController.getInstance(i10).getInputPeer(messageObject.getDialogId());
        TLRPC.Peer peer = messageObject.messageOwner.from_id;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getMessageReadParticipants, new hg.c0(this, peer != null ? peer.user_id : 0L, chat, 5), 64);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = this.v;
        if (i12 > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30);
        }
        u00 u00Var = this.a;
        if (u00Var.getVisibility() != 0) {
            super.onMeasure(i10, i11);
            return;
        }
        this.h = true;
        u00Var.setVisibility(8);
        super.onMeasure(i10, i11);
        u00Var.getLayoutParams().width = getMeasuredWidth();
        u00Var.setVisibility(0);
        this.h = false;
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.h) {
            return;
        }
        super.requestLayout();
    }

    public void setSeenCallback(q0.a aVar) {
        this.w = aVar;
    }
}
