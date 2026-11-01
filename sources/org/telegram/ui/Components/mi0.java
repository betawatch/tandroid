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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class mi0 extends FrameLayout {
    public final zz a;
    public final TextView b;
    public final u8 c;
    public final ImageView d;
    public final g9 e;
    public final int f;
    public boolean h;
    public final ArrayList n;
    public final ArrayList r;
    public final org.telegram.messenger.kj s;
    public int w;
    public q0.a x;

    public mi0(Context context, int i10, org.telegram.messenger.kj kjVar) {
        super(context);
        this.n = new ArrayList();
        this.r = new ArrayList();
        this.f = i10;
        this.s = kjVar;
        zz zzVar = new zz(context, null);
        this.a = zzVar;
        zzVar.e(org.telegram.ui.ActionBar.t6.G8, org.telegram.ui.ActionBar.t6.i6, -1);
        zzVar.setViewType(13);
        zzVar.setIsSingleCell(false);
        addView(zzVar, w7.b6.c(-1.0f, -2));
        TextView textView = new TextView(context);
        this.b = textView;
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.E8, null);
        textView.setTextSize(1, 16.0f);
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, w7.b6.i(-2.0f, -2.0f, 8388627, 40.0f, 0.0f, 62.0f, 0.0f));
        u8 u8Var = new u8(context, false);
        this.c = u8Var;
        u8Var.setStyle(11);
        u8Var.setAvatarsTextSize(org.telegram.messenger.i0.L(22.0f));
        addView(u8Var, w7.b6.i(56.0f, -1.0f, 8388629, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        addView(imageView, w7.b6.i(24.0f, 24.0f, 8388627, 11.0f, 0.0f, 0.0f, 0.0f));
        Drawable mutate = context.getDrawable(R.drawable.msg_reactions).mutate();
        org.telegram.ui.ActionBar.a7.y(this, mutate, org.telegram.ui.ActionBar.t6.F8, null, PorterDuff.Mode.MULTIPLY);
        imageView.setImageDrawable(mutate);
        imageView.setVisibility(8);
        g9 g9Var = new g9(context);
        this.e = g9Var;
        addView(g9Var, w7.b6.i(24.0f, 24.0f, 8388627, 11.0f, 0.0f, 0.0f, 0.0f));
        textView.setAlpha(0.0f);
        u8Var.setAlpha(0.0f);
        setBackground(org.telegram.ui.ActionBar.t6.N0(false));
    }

    public final void a() {
        int i10 = this.f;
        org.telegram.messenger.wp r12 = org.telegram.messenger.wp.r1(i10);
        TLRPC.TL_messages_getMessageReactionsList tL_messages_getMessageReactionsList = new TLRPC.TL_messages_getMessageReactionsList();
        org.telegram.messenger.kj kjVar = this.s;
        tL_messages_getMessageReactionsList.peer = r12.i1(org.telegram.messenger.kj.B0(kjVar.k));
        tL_messages_getMessageReactionsList.id = kjVar.f1();
        tL_messages_getMessageReactionsList.limit = 3;
        tL_messages_getMessageReactionsList.reaction = null;
        tL_messages_getMessageReactionsList.offset = null;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getMessageReactionsList, new x1(this, 9), 64);
    }

    public List<li0> getSeenUsers() {
        return this.n;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.f;
        org.telegram.messenger.wp r12 = org.telegram.messenger.wp.r1(i10);
        org.telegram.messenger.kj kjVar = this.s;
        TLRPC.Chat L0 = r12.L0(Long.valueOf(kjVar.x0()));
        TLRPC.ChatFull M0 = r12.M0(kjVar.x0());
        if (L0 == null || !kjVar.P3() || !kjVar.q4() || kjVar.Y2() || kjVar.o4() || kjVar.n4() || kjVar.k.media_unread || kjVar.F4() || ConnectionsManager.getInstance(i10).getCurrentTime() - kjVar.k.date >= 604800 || ((!org.telegram.messenger.w3.n0(L0) && org.telegram.messenger.w3.T(L0)) || M0 == null || M0.participants_count > org.telegram.messenger.wp.r1(i10).p3 || (kjVar.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
            a();
            return;
        }
        TLRPC.TL_messages_getMessageReadParticipants tL_messages_getMessageReadParticipants = new TLRPC.TL_messages_getMessageReadParticipants();
        tL_messages_getMessageReadParticipants.msg_id = kjVar.f1();
        tL_messages_getMessageReadParticipants.peer = org.telegram.messenger.wp.r1(i10).i1(org.telegram.messenger.kj.B0(kjVar.k));
        TLRPC.Peer peer = kjVar.k.from_id;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getMessageReadParticipants, new mg.x(this, peer != null ? peer.user_id : 0L, L0, 2), 64);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = this.w;
        if (i12 > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30);
        }
        zz zzVar = this.a;
        if (zzVar.getVisibility() != 0) {
            super.onMeasure(i10, i11);
            return;
        }
        this.h = true;
        zzVar.setVisibility(8);
        super.onMeasure(i10, i11);
        zzVar.getLayoutParams().width = getMeasuredWidth();
        zzVar.setVisibility(0);
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
        this.x = aVar;
    }
}
