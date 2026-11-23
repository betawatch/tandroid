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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class wh0 extends FrameLayout {
    public final vz a;
    public final TextView b;
    public final d9 c;
    public final ImageView d;
    public final p9 e;
    public final int f;
    public boolean h;
    public final ArrayList n;
    public final ArrayList r;
    public final org.telegram.messenger.fj s;
    public int w;
    public q0.a x;

    public wh0(Context context, int i7, org.telegram.messenger.fj fjVar) {
        super(context);
        this.n = new ArrayList();
        this.r = new ArrayList();
        this.f = i7;
        this.s = fjVar;
        vz vzVar = new vz(context, null);
        this.a = vzVar;
        vzVar.e(org.telegram.ui.ActionBar.n6.G8, org.telegram.ui.ActionBar.n6.i6, -1);
        vzVar.setViewType(13);
        vzVar.setIsSingleCell(false);
        addView(vzVar, c8.na.c(-1.0f, -2));
        TextView textView = new TextView(context);
        this.b = textView;
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.E8, null);
        textView.setTextSize(1, 16.0f);
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, c8.na.i(-2.0f, -2.0f, 8388627, 40.0f, 0.0f, 62.0f, 0.0f));
        d9 d9Var = new d9(context, false);
        this.c = d9Var;
        d9Var.setStyle(11);
        d9Var.setAvatarsTextSize(org.telegram.messenger.g0.L(22.0f));
        addView(d9Var, c8.na.i(56.0f, -1.0f, 8388629, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        addView(imageView, c8.na.i(24.0f, 24.0f, 8388627, 11.0f, 0.0f, 0.0f, 0.0f));
        Drawable mutate = context.getDrawable(R.drawable.msg_reactions).mutate();
        org.telegram.ui.ActionBar.u6.x(this, mutate, org.telegram.ui.ActionBar.n6.F8, null, PorterDuff.Mode.MULTIPLY);
        imageView.setImageDrawable(mutate);
        imageView.setVisibility(8);
        p9 p9Var = new p9(context);
        this.e = p9Var;
        addView(p9Var, c8.na.i(24.0f, 24.0f, 8388627, 11.0f, 0.0f, 0.0f, 0.0f));
        textView.setAlpha(0.0f);
        d9Var.setAlpha(0.0f);
        setBackground(org.telegram.ui.ActionBar.n6.N0(false));
    }

    public final void a() {
        int i7 = this.f;
        org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i7);
        TLRPC.TL_messages_getMessageReactionsList tL_messages_getMessageReactionsList = new TLRPC.TL_messages_getMessageReactionsList();
        org.telegram.messenger.fj fjVar = this.s;
        tL_messages_getMessageReactionsList.peer = u12.l1(org.telegram.messenger.fj.B0(fjVar.k));
        tL_messages_getMessageReactionsList.id = fjVar.e1();
        tL_messages_getMessageReactionsList.limit = 3;
        tL_messages_getMessageReactionsList.reaction = null;
        tL_messages_getMessageReactionsList.offset = null;
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getMessageReactionsList, new e2(this, 9), 64);
    }

    public List<vh0> getSeenUsers() {
        return this.n;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = this.f;
        org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i7);
        org.telegram.messenger.fj fjVar = this.s;
        TLRPC.Chat O0 = u12.O0(Long.valueOf(fjVar.x0()));
        TLRPC.ChatFull P0 = u12.P0(fjVar.x0());
        if (O0 == null || !fjVar.P3() || !fjVar.q4() || fjVar.Y2() || fjVar.o4() || fjVar.n4() || fjVar.k.media_unread || fjVar.F4() || ConnectionsManager.getInstance(i7).getCurrentTime() - fjVar.k.date >= 604800 || ((!org.telegram.messenger.v3.n0(O0) && org.telegram.messenger.v3.T(O0)) || P0 == null || P0.participants_count > org.telegram.messenger.mp.u1(i7).s3 || (fjVar.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
            a();
            return;
        }
        TLRPC.TL_messages_getMessageReadParticipants tL_messages_getMessageReadParticipants = new TLRPC.TL_messages_getMessageReadParticipants();
        tL_messages_getMessageReadParticipants.msg_id = fjVar.e1();
        tL_messages_getMessageReadParticipants.peer = org.telegram.messenger.mp.u1(i7).l1(org.telegram.messenger.fj.B0(fjVar.k));
        TLRPC.Peer peer = fjVar.k.from_id;
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getMessageReadParticipants, new di.q2(this, peer != null ? peer.user_id : 0L, O0, 5), 64);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11 = this.w;
        if (i11 > 0) {
            i7 = View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30);
        }
        vz vzVar = this.a;
        if (vzVar.getVisibility() != 0) {
            super.onMeasure(i7, i10);
            return;
        }
        this.h = true;
        vzVar.setVisibility(8);
        super.onMeasure(i7, i10);
        vzVar.getLayoutParams().width = getMeasuredWidth();
        vzVar.setVisibility(0);
        this.h = false;
        super.onMeasure(i7, i10);
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
