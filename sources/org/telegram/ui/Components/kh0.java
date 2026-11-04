package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class kh0 extends FrameLayout {
    public final iz a;
    public final TextView b;
    public final x8 c;
    public final ImageView d;
    public final k9 e;
    public final int f;
    public boolean h;
    public final ArrayList n;
    public final ArrayList r;
    public final org.telegram.messenger.zi s;
    public int w;
    public q0.a x;

    public kh0(Context context, int i3, org.telegram.messenger.zi ziVar) {
        super(context);
        this.n = new ArrayList();
        this.r = new ArrayList();
        this.f = i3;
        this.s = ziVar;
        iz izVar = new iz(context, null);
        this.a = izVar;
        izVar.e(org.telegram.ui.ActionBar.k6.G8, org.telegram.ui.ActionBar.k6.i6, -1);
        izVar.setViewType(13);
        izVar.setIsSingleCell(false);
        addView(izVar, b8.mf.c(-1.0f, -2));
        TextView textView = new TextView(context);
        this.b = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.E8, null);
        textView.setTextSize(1, 16.0f);
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, b8.mf.i(-2.0f, -2.0f, 8388627, 40.0f, 0.0f, 62.0f, 0.0f));
        x8 x8Var = new x8(context, false);
        this.c = x8Var;
        x8Var.setStyle(11);
        x8Var.setAvatarsTextSize(org.telegram.messenger.g0.L(22.0f));
        addView(x8Var, b8.mf.i(56.0f, -1.0f, 8388629, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        addView(imageView, b8.mf.i(24.0f, 24.0f, 8388627, 11.0f, 0.0f, 0.0f, 0.0f));
        Drawable mutate = context.getDrawable(R.drawable.msg_reactions).mutate();
        org.telegram.ui.ActionBar.r6.y(this, mutate, org.telegram.ui.ActionBar.k6.F8, null, PorterDuff.Mode.MULTIPLY);
        imageView.setImageDrawable(mutate);
        imageView.setVisibility(8);
        k9 k9Var = new k9(context);
        this.e = k9Var;
        addView(k9Var, b8.mf.i(24.0f, 24.0f, 8388627, 11.0f, 0.0f, 0.0f, 0.0f));
        textView.setAlpha(0.0f);
        x8Var.setAlpha(0.0f);
        setBackground(org.telegram.ui.ActionBar.k6.N0(false));
    }

    public final void a() {
        int i3 = this.f;
        org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i3);
        TLRPC.TL_messages_getMessageReactionsList tL_messages_getMessageReactionsList = new TLRPC.TL_messages_getMessageReactionsList();
        org.telegram.messenger.zi ziVar = this.s;
        tL_messages_getMessageReactionsList.peer = s12.j1(org.telegram.messenger.zi.B0(ziVar.k));
        tL_messages_getMessageReactionsList.id = ziVar.f1();
        tL_messages_getMessageReactionsList.limit = 3;
        tL_messages_getMessageReactionsList.reaction = null;
        tL_messages_getMessageReactionsList.offset = null;
        ConnectionsManager.getInstance(i3).sendRequest(tL_messages_getMessageReactionsList, new w1(this, 9), 64);
    }

    public List<jh0> getSeenUsers() {
        return this.n;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i3 = this.f;
        org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i3);
        org.telegram.messenger.zi ziVar = this.s;
        TLRPC.Chat M0 = s12.M0(Long.valueOf(ziVar.x0()));
        TLRPC.ChatFull N0 = s12.N0(ziVar.x0());
        if (M0 == null || !ziVar.Q3() || !ziVar.r4() || ziVar.Z2() || ziVar.p4() || ziVar.o4() || ziVar.k.media_unread || ziVar.G4() || ConnectionsManager.getInstance(i3).getCurrentTime() - ziVar.k.date >= 604800 || ((!org.telegram.messenger.t3.n0(M0) && org.telegram.messenger.t3.T(M0)) || N0 == null || N0.participants_count > org.telegram.messenger.hp.s1(i3).q3 || (ziVar.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
            a();
            return;
        }
        TLRPC.TL_messages_getMessageReadParticipants tL_messages_getMessageReadParticipants = new TLRPC.TL_messages_getMessageReadParticipants();
        tL_messages_getMessageReadParticipants.msg_id = ziVar.f1();
        tL_messages_getMessageReadParticipants.peer = org.telegram.messenger.hp.s1(i3).j1(org.telegram.messenger.zi.B0(ziVar.k));
        TLRPC.Peer peer = ziVar.k.from_id;
        ConnectionsManager.getInstance(i3).sendRequest(tL_messages_getMessageReadParticipants, new ci.u2(this, peer != null ? peer.user_id : 0L, M0, 5), 64);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int i11 = this.w;
        if (i11 > 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30);
        }
        iz izVar = this.a;
        if (izVar.getVisibility() != 0) {
            super.onMeasure(i3, i10);
            return;
        }
        this.h = true;
        izVar.setVisibility(8);
        super.onMeasure(i3, i10);
        izVar.getLayoutParams().width = getMeasuredWidth();
        izVar.setVisibility(0);
        this.h = false;
        super.onMeasure(i3, i10);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.h) {
            return;
        }
        super.requestLayout();
    }

    public void setSeenCallback(q0.a aVar) {
        this.x = aVar;
    }
}
