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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ui0 extends FrameLayout {
    public final e00 a;
    public final TextView b;
    public final c9 c;
    public final ImageView d;
    public final o9 e;
    public final int f;
    public boolean h;
    public final ArrayList n;
    public final ArrayList r;
    public final MessageObject s;
    public int v;
    public q0.a w;

    public ui0(Context context, int i9, MessageObject messageObject) {
        super(context);
        this.n = new ArrayList();
        this.r = new ArrayList();
        this.f = i9;
        this.s = messageObject;
        e00 e00Var = new e00(context, null);
        this.a = e00Var;
        e00Var.f(org.telegram.ui.ActionBar.f6.G8, org.telegram.ui.ActionBar.f6.i6, -1);
        e00Var.setViewType(13);
        e00Var.setIsSingleCell(false);
        addView(e00Var, g7.e6.c(-1.0f, -2));
        TextView textView = new TextView(context);
        this.b = textView;
        org.telegram.messenger.ll.s(textView, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.E8, false), 1, 16.0f, 1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, g7.e6.i(-2.0f, -2.0f, 8388627, 40.0f, 0.0f, 62.0f, 0.0f));
        c9 c9Var = new c9(context, false);
        this.c = c9Var;
        c9Var.setStyle(11);
        c9Var.setAvatarsTextSize(AndroidUtilities.dp(22.0f));
        addView(c9Var, g7.e6.i(56.0f, -1.0f, 8388629, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        addView(imageView, g7.e6.i(24.0f, 24.0f, 8388627, 11.0f, 0.0f, 0.0f, 0.0f));
        Drawable mutate = context.getDrawable(R.drawable.msg_reactions).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.F8, false), PorterDuff.Mode.MULTIPLY));
        imageView.setImageDrawable(mutate);
        imageView.setVisibility(8);
        o9 o9Var = new o9(context);
        this.e = o9Var;
        addView(o9Var, g7.e6.i(24.0f, 24.0f, 8388627, 11.0f, 0.0f, 0.0f, 0.0f));
        textView.setAlpha(0.0f);
        c9Var.setAlpha(0.0f);
        setBackground(org.telegram.ui.ActionBar.f6.K0(false));
    }

    public final void a() {
        int i9 = this.f;
        MessagesController messagesController = MessagesController.getInstance(i9);
        TLRPC.TL_messages_getMessageReactionsList tL_messages_getMessageReactionsList = new TLRPC.TL_messages_getMessageReactionsList();
        MessageObject messageObject = this.s;
        tL_messages_getMessageReactionsList.peer = messagesController.getInputPeer(messageObject.getDialogId());
        tL_messages_getMessageReactionsList.id = messageObject.getId();
        tL_messages_getMessageReactionsList.limit = 3;
        tL_messages_getMessageReactionsList.reaction = null;
        tL_messages_getMessageReactionsList.offset = null;
        ConnectionsManager.getInstance(i9).sendRequest(tL_messages_getMessageReactionsList, new w1(this, 10), 64);
    }

    public List<ti0> getSeenUsers() {
        return this.n;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i9 = this.f;
        MessagesController messagesController = MessagesController.getInstance(i9);
        MessageObject messageObject = this.s;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(messageObject.getChatId()));
        TLRPC.ChatFull chatFull = messagesController.getChatFull(messageObject.getChatId());
        if (chat == null || !messageObject.isOutOwner() || !messageObject.isSent() || messageObject.isEditing() || messageObject.isSending() || messageObject.isSendError() || messageObject.isContentUnread() || messageObject.isUnread() || ConnectionsManager.getInstance(i9).getCurrentTime() - messageObject.messageOwner.date >= 604800 || ((!ChatObject.isMegagroup(chat) && ChatObject.isChannel(chat)) || chatFull == null || chatFull.participants_count > MessagesController.getInstance(i9).chatReadMarkSizeThreshold || (messageObject.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
            a();
            return;
        }
        TLRPC.TL_messages_getMessageReadParticipants tL_messages_getMessageReadParticipants = new TLRPC.TL_messages_getMessageReadParticipants();
        tL_messages_getMessageReadParticipants.msg_id = messageObject.getId();
        tL_messages_getMessageReadParticipants.peer = MessagesController.getInstance(i9).getInputPeer(messageObject.getDialogId());
        TLRPC.Peer peer = messageObject.messageOwner.from_id;
        ConnectionsManager.getInstance(i9).sendRequest(tL_messages_getMessageReadParticipants, new bg.f0(this, peer != null ? peer.user_id : 0L, chat, 5), 64);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int i11 = this.v;
        if (i11 > 0) {
            i9 = View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30);
        }
        e00 e00Var = this.a;
        if (e00Var.getVisibility() != 0) {
            super.onMeasure(i9, i10);
            return;
        }
        this.h = true;
        e00Var.setVisibility(8);
        super.onMeasure(i9, i10);
        e00Var.getLayoutParams().width = getMeasuredWidth();
        e00Var.setVisibility(0);
        this.h = false;
        super.onMeasure(i9, i10);
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
