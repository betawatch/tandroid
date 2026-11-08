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

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class hh0 extends FrameLayout {
    public final mz a;
    public final TextView b;
    public final z8 c;
    public final ImageView d;
    public final l9 e;
    public final int f;
    public boolean h;
    public final ArrayList n;
    public final ArrayList r;
    public final org.telegram.messenger.ij s;
    public int w;
    public q0.a x;

    public hh0(Context context, int i7, org.telegram.messenger.ij ijVar) {
        super(context);
        this.n = new ArrayList();
        this.r = new ArrayList();
        this.f = i7;
        this.s = ijVar;
        mz mzVar = new mz(context, null);
        this.a = mzVar;
        mzVar.e(org.telegram.ui.ActionBar.k6.G8, org.telegram.ui.ActionBar.k6.i6, -1);
        mzVar.setViewType(13);
        mzVar.setIsSingleCell(false);
        addView(mzVar, c8.ha.c(-1.0f, -2));
        TextView textView = new TextView(context);
        this.b = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.E8, null);
        textView.setTextSize(1, 16.0f);
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, c8.ha.i(-2.0f, -2.0f, 8388627, 40.0f, 0.0f, 62.0f, 0.0f));
        z8 z8Var = new z8(context, false);
        this.c = z8Var;
        z8Var.setStyle(11);
        z8Var.setAvatarsTextSize(org.telegram.messenger.g0.L(22.0f));
        addView(z8Var, c8.ha.i(56.0f, -1.0f, 8388629, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        addView(imageView, c8.ha.i(24.0f, 24.0f, 8388627, 11.0f, 0.0f, 0.0f, 0.0f));
        Drawable mutate = context.getDrawable(R.drawable.msg_reactions).mutate();
        org.telegram.ui.ActionBar.r6.y(this, mutate, org.telegram.ui.ActionBar.k6.F8, null, PorterDuff.Mode.MULTIPLY);
        imageView.setImageDrawable(mutate);
        imageView.setVisibility(8);
        l9 l9Var = new l9(context);
        this.e = l9Var;
        addView(l9Var, c8.ha.i(24.0f, 24.0f, 8388627, 11.0f, 0.0f, 0.0f, 0.0f));
        textView.setAlpha(0.0f);
        z8Var.setAlpha(0.0f);
        setBackground(org.telegram.ui.ActionBar.k6.N0(false));
    }

    public final void a() {
        int i7 = this.f;
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
        TLRPC.TL_messages_getMessageReactionsList tL_messages_getMessageReactionsList = new TLRPC.TL_messages_getMessageReactionsList();
        org.telegram.messenger.ij ijVar = this.s;
        tL_messages_getMessageReactionsList.peer = s12.j1(org.telegram.messenger.ij.B0(ijVar.k));
        tL_messages_getMessageReactionsList.id = ijVar.f1();
        tL_messages_getMessageReactionsList.limit = 3;
        tL_messages_getMessageReactionsList.reaction = null;
        tL_messages_getMessageReactionsList.offset = null;
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getMessageReactionsList, new x1(this, 9), 64);
    }

    public List<gh0> getSeenUsers() {
        return this.n;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = this.f;
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
        org.telegram.messenger.ij ijVar = this.s;
        TLRPC.Chat M0 = s12.M0(Long.valueOf(ijVar.x0()));
        TLRPC.ChatFull N0 = s12.N0(ijVar.x0());
        if (M0 == null || !ijVar.Q3() || !ijVar.r4() || ijVar.Z2() || ijVar.p4() || ijVar.o4() || ijVar.k.media_unread || ijVar.G4() || ConnectionsManager.getInstance(i7).getCurrentTime() - ijVar.k.date >= 604800 || ((!org.telegram.messenger.t3.n0(M0) && org.telegram.messenger.t3.T(M0)) || N0 == null || N0.participants_count > org.telegram.messenger.qp.s1(i7).p3 || (ijVar.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
            a();
            return;
        }
        TLRPC.TL_messages_getMessageReadParticipants tL_messages_getMessageReadParticipants = new TLRPC.TL_messages_getMessageReadParticipants();
        tL_messages_getMessageReadParticipants.msg_id = ijVar.f1();
        tL_messages_getMessageReadParticipants.peer = org.telegram.messenger.qp.s1(i7).j1(org.telegram.messenger.ij.B0(ijVar.k));
        TLRPC.Peer peer = ijVar.k.from_id;
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getMessageReadParticipants, new bi.h3(this, peer != null ? peer.user_id : 0L, M0, 5), 64);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11 = this.w;
        if (i11 > 0) {
            i7 = View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30);
        }
        mz mzVar = this.a;
        if (mzVar.getVisibility() != 0) {
            super.onMeasure(i7, i10);
            return;
        }
        this.h = true;
        mzVar.setVisibility(8);
        super.onMeasure(i7, i10);
        mzVar.getLayoutParams().width = getMeasuredWidth();
        mzVar.setVisibility(0);
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
